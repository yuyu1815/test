/*      */ package androidx.collection;
/*      */ 
/*      */ import java.util.Collection;
/*      */ import java.util.Iterator;
/*      */ import java.util.Map;
/*      */ import java.util.Set;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.Pair;
/*      */ import kotlin.PublishedApi;
/*      */ import kotlin.ULong;
/*      */ import kotlin.Unit;
/*      */ import kotlin.collections.ArraysKt;
/*      */ import kotlin.coroutines.Continuation;
/*      */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*      */ import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.internal.CollectionToArray;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.jvm.internal.TypeIntrinsics;
/*      */ import kotlin.jvm.internal.markers.KMutableCollection;
/*      */ import kotlin.jvm.internal.markers.KMutableIterator;
/*      */ import kotlin.jvm.internal.markers.KMutableMap;
/*      */ import kotlin.jvm.internal.markers.KMutableSet;
/*      */ import kotlin.sequences.Sequence;
/*      */ import kotlin.sequences.SequenceScope;
/*      */ import kotlin.sequences.SequencesKt;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000r\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\020\002\n\000\n\002\020%\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\b\n\002\030\002\n\002\030\002\n\002\020\021\n\000\n\002\020\034\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020$\n\002\b\005\n\002\020\013\n\002\b\f\n\002\020\t\n\002\b\002\030\000*\004\b\000\020\001*\004\b\001\020\0022\016\022\004\022\002H\001\022\004\022\002H\0020\003:\001DB\017\022\b\b\002\020\004\032\0020\005¢\006\002\020\006J\b\020\b\032\0020\tH\002J\022\020\n\032\016\022\004\022\0028\000\022\004\022\0028\0010\013J\006\020\f\032\0020\tJS\020\r\032\0028\0012\006\020\016\032\0028\00028\020\017\0324\022\023\022\0218\000¢\006\f\b\021\022\b\b\022\022\004\b\b(\016\022\025\022\023\030\0018\001¢\006\f\b\021\022\b\b\022\022\004\b\b(\023\022\004\022\0028\0010\020H\bø\001\000¢\006\002\020\024J\020\020\025\032\0020\0052\006\020\026\032\0020\005H\002J\025\020\027\032\0020\0052\006\020\016\032\0028\000H\001¢\006\002\020\030J'\020\031\032\0028\0012\006\020\016\032\0028\0002\f\020\032\032\b\022\004\022\0028\0010\033H\bø\001\000¢\006\002\020\034J\b\020\035\032\0020\tH\002J\020\020\036\032\0020\t2\006\020\037\032\0020\005H\002J\020\020 \032\0020\t2\006\020\004\032\0020\005H\002J\026\020!\032\0020\t2\006\020\016\032\0028\000H\n¢\006\002\020\"J\027\020!\032\0020\t2\f\020#\032\b\022\004\022\0028\0000$H\nJ\027\020!\032\0020\t2\f\020#\032\b\022\004\022\0028\0000%H\nJ\036\020!\032\0020\t2\016\020#\032\n\022\006\b\001\022\0028\0000&H\n¢\006\002\020'J\027\020!\032\0020\t2\f\020#\032\b\022\004\022\0028\0000(H\nJ\027\020!\032\0020\t2\f\020#\032\b\022\004\022\0028\0000)H\nJ\035\020*\032\0020\t2\022\020+\032\016\022\004\022\0028\000\022\004\022\0028\0010\003H\nJ*\020*\032\0020\t2\032\020,\032\026\022\022\b\001\022\016\022\004\022\0028\000\022\004\022\0028\0010-0&H\n¢\006\002\020.J\035\020*\032\0020\t2\022\020/\032\016\022\004\022\0028\000\022\004\022\0028\0010-H\nJ#\020*\032\0020\t2\030\020,\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010-0(H\nJ\035\020*\032\0020\t2\022\020+\032\016\022\004\022\0028\000\022\004\022\0028\00100H\nJ#\020*\032\0020\t2\030\020,\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010-0)H\nJ\035\0201\032\004\030\0018\0012\006\020\016\032\0028\0002\006\020\023\032\0028\001¢\006\002\0202J\032\0203\032\0020\t2\022\020+\032\016\022\004\022\0028\000\022\004\022\0028\0010\003J'\0203\032\0020\t2\032\020,\032\026\022\022\b\001\022\016\022\004\022\0028\000\022\004\022\0028\0010-0&¢\006\002\020.J \0203\032\0020\t2\030\020,\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010-0(J\032\0203\032\0020\t2\022\020+\032\016\022\004\022\0028\000\022\004\022\0028\00100J \0203\032\0020\t2\030\020,\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010-0)J\025\0204\032\004\030\0018\0012\006\020\016\032\0028\000¢\006\002\0205J\033\0204\032\002062\006\020\016\032\0028\0002\006\020\023\032\0028\001¢\006\002\0207J&\0208\032\0020\t2\030\0209\032\024\022\004\022\0028\000\022\004\022\0028\001\022\004\022\002060\020H\bø\001\000J\027\020:\032\004\030\0018\0012\006\020;\032\0020\005H\001¢\006\002\020<J\020\020=\032\0020\t2\006\020>\032\0020\005H\002J\036\020?\032\0020\t2\006\020\016\032\0028\0002\006\020\023\032\0028\001H\002¢\006\002\020@J\006\020A\032\0020\005J\031\020B\032\0020\t2\006\020;\032\0020\0052\006\020\023\032\0020CH\bR\016\020\007\032\0020\005X\016¢\006\002\n\000\002\007\n\005\b20\001¨\006E"}, d2 = {"Landroidx/collection/MutableScatterMap;", "K", "V", "Landroidx/collection/ScatterMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "asMutableMap", "", "clear", "compute", "key", "computeBlock", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "findFirstAvailableSlot", "hash1", "findInsertIndex", "(Ljava/lang/Object;)I", "getOrPut", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "(Ljava/lang/Object;)V", "keys", "Landroidx/collection/ObjectList;", "Landroidx/collection/ScatterSet;", "", "([Ljava/lang/Object;)V", "", "Lkotlin/sequences/Sequence;", "plusAssign", "from", "pairs", "Lkotlin/Pair;", "([Lkotlin/Pair;)V", "pair", "", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeIf", "predicate", "removeValueAt", "index", "(I)Ljava/lang/Object;", "resizeStorage", "newCapacity", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "trim", "writeMetadata", "", "MutableMapWrapper", "collection"})
/*      */ @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1834:1\n1268#1,2:2003\n1272#1,5:2011\n1268#1,2:2042\n1272#1,5:2050\n1268#1,2:2067\n1272#1,5:2075\n1#2:1835\n1656#3,6:1836\n1810#3:1854\n1672#3:1858\n1589#3,3:1871\n1603#3:1875\n1599#3:1878\n1779#3,3:1883\n1793#3,3:1887\n1717#3:1891\n1705#3:1893\n1699#3:1894\n1712#3:1899\n1802#3:1901\n1589#3,3:1911\n1603#3:1915\n1599#3:1918\n1779#3,3:1923\n1793#3,3:1927\n1717#3:1931\n1705#3:1933\n1699#3:1934\n1712#3:1939\n1802#3:1941\n1810#3:1956\n1672#3:1960\n1810#3:1981\n1672#3:1985\n1656#3,6:2005\n1656#3,6:2016\n1589#3,3:2022\n1599#3:2025\n1603#3:2026\n1779#3,3:2027\n1793#3,3:2030\n1717#3:2033\n1705#3:2034\n1699#3:2035\n1712#3:2036\n1802#3:2037\n1666#3:2038\n1645#3:2039\n1664#3:2040\n1645#3:2041\n1656#3,6:2044\n1779#3,3:2055\n1810#3:2058\n1699#3:2059\n1669#3:2060\n1645#3:2061\n1589#3,3:2062\n1599#3:2065\n1603#3:2066\n1656#3,6:2069\n1656#3,6:2080\n1656#3,6:2086\n215#4,2:1842\n391#5,4:1844\n363#5,6:1848\n373#5,3:1855\n376#5,2:1859\n396#5,2:1861\n379#5,6:1863\n398#5:1869\n633#5:1870\n634#5:1874\n636#5,2:1876\n638#5,4:1879\n642#5:1886\n643#5:1890\n644#5:1892\n645#5,4:1895\n651#5:1900\n652#5,8:1902\n633#5:1910\n634#5:1914\n636#5,2:1916\n638#5,4:1919\n642#5:1926\n643#5:1930\n644#5:1932\n645#5,4:1935\n651#5:1940\n652#5,8:1942\n363#5,6:1950\n373#5,3:1957\n376#5,9:1961\n267#6,4:1970\n237#6,7:1974\n248#6,3:1982\n251#6,2:1986\n272#6,2:1988\n254#6,6:1990\n274#6:1996\n305#7,6:1997\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n*L\n1113#1:2003,2\n1113#1:2011,5\n1180#1:2042,2\n1180#1:2050,5\n1255#1:2067,2\n1255#1:2075,5\n848#1:1836,6\n972#1:1854\n972#1:1858\n1021#1:1871,3\n1021#1:1875\n1021#1:1878\n1021#1:1883,3\n1021#1:1887,3\n1021#1:1891\n1021#1:1893\n1021#1:1894\n1021#1:1899\n1021#1:1901\n1033#1:1911,3\n1033#1:1915\n1033#1:1918\n1033#1:1923,3\n1033#1:1927,3\n1033#1:1931\n1033#1:1933\n1033#1:1934\n1033#1:1939\n1033#1:1941\n1047#1:1956\n1047#1:1960\n1093#1:1981\n1093#1:1985\n1113#1:2005,6\n1129#1:2016,6\n1145#1:2022,3\n1146#1:2025\n1147#1:2026\n1154#1:2027,3\n1155#1:2030,3\n1156#1:2033\n1157#1:2034\n1157#1:2035\n1161#1:2036\n1164#1:2037\n1173#1:2038\n1173#1:2039\n1179#1:2040\n1179#1:2041\n1180#1:2044,6\n1195#1:2055,3\n1196#1:2058\n1198#1:2059\n1250#1:2060\n1250#1:2061\n1252#1:2062,3\n1253#1:2065\n1255#1:2066\n1255#1:2069,6\n1269#1:2080,6\n1275#1:2086,6\n963#1:1842,2\n972#1:1844,4\n972#1:1848,6\n972#1:1855,3\n972#1:1859,2\n972#1:1861,2\n972#1:1863,6\n972#1:1869\n1021#1:1870\n1021#1:1874\n1021#1:1876,2\n1021#1:1879,4\n1021#1:1886\n1021#1:1890\n1021#1:1892\n1021#1:1895,4\n1021#1:1900\n1021#1:1902,8\n1033#1:1910\n1033#1:1914\n1033#1:1916,2\n1033#1:1919,4\n1033#1:1926\n1033#1:1930\n1033#1:1932\n1033#1:1935,4\n1033#1:1940\n1033#1:1942,8\n1047#1:1950,6\n1047#1:1957,3\n1047#1:1961,9\n1093#1:1970,4\n1093#1:1974,7\n1093#1:1982,3\n1093#1:1986,2\n1093#1:1988,2\n1093#1:1990,6\n1093#1:1996\n1102#1:1997,6\n*E\n"})
/*      */ public final class MutableScatterMap<K, V>
/*      */   extends ScatterMap<K, V>
/*      */ {
/*      */   private int growthLimit;
/*      */   
/*      */   public MutableScatterMap(int initialCapacity) {
/*  815 */     super(null);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  820 */     if (!((initialCapacity >= 0) ? 1 : 0))
/*      */     
/*      */     { 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1835 */       int $i$a$-require-MutableScatterMap$1 = 0; String str = "Capacity must be a positive value."; throw new IllegalArgumentException(str.toString()); }  initializeStorage(ScatterMapKt.unloadedCapacity(initialCapacity));
/* 1836 */   } private final void initializeStorage(int initialCapacity) { int newCapacity = (initialCapacity > 0) ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0; this._capacity = newCapacity; initializeMetadata(newCapacity); this.keys = new Object[newCapacity]; this.values = new Object[newCapacity]; } private final void initializeMetadata(int capacity) { int size = (capacity + 1 + 7 + 7 & 0xFFFFFFF8) >> 3; long[] arrayOfLong2 = new long[size], arrayOfLong3 = arrayOfLong2; MutableScatterMap mutableScatterMap = this; int $i$a$-apply-MutableScatterMap$initializeMetadata$1 = 0; ArraysKt.fill$default(arrayOfLong3, -9187201950435737472L, 0, 0, 6, null); mutableScatterMap.metadata = (capacity == 0) ? ScatterMapKt.EmptyGroup : arrayOfLong2; long arrayOfLong1[] = this.metadata, value$iv = 255L; int $i$f$writeRawMetadata = 0; int i$iv = capacity >> 3;
/* 1837 */     int b$iv = (capacity & 0x7) << 3;
/*      */ 
/*      */     
/* 1840 */     arrayOfLong1[i$iv] = arrayOfLong1[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv; initializeGrowth(); }
/*      */   private final void initializeGrowth() { this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size; }
/* 1842 */   public final V getOrPut(Object key, @NotNull Function0 defaultValue) { Intrinsics.checkNotNullParameter(defaultValue, "defaultValue"); int $i$f$getOrPut = 0; if (get((K)key) == null) { get((K)key); Object object1 = defaultValue.invoke(), it = object1; int $i$a$-also-MutableScatterMap$getOrPut$1 = 0; set((K)key, (V)it); }  return (V)object1; } public final V compute(Object key, @NotNull Function2 computeBlock) { Intrinsics.checkNotNullParameter(computeBlock, "computeBlock"); int $i$f$compute = 0, index = findInsertIndex((K)key); boolean inserting = (index < 0); Object computedValue = computeBlock.invoke(key, inserting ? null : this.values[index]); if (inserting) { int insertionIndex = index ^ 0xFFFFFFFF; this.keys[insertionIndex] = key; this.values[insertionIndex] = computedValue; } else { this.values[index] = computedValue; }  return (V)computedValue; } public final void set(Object key, Object value) { int i = findInsertIndex((K)key), $i$a$-let-MutableScatterMap$set$index$1 = 0, index = (i < 0) ? (i ^ 0xFFFFFFFF) : i; this.keys[index] = key; this.values[index] = value; } public final void putAll(@NotNull Map from) { Intrinsics.checkNotNullParameter(from, "from"); Map $this$forEach$iv = from; int $i$f$forEach = 0; Iterator<Map.Entry> iterator = $this$forEach$iv.entrySet().iterator(); if (iterator.hasNext()) { Map.Entry element$iv = iterator.next(), entry1 = element$iv; int $i$a$-forEach-MutableScatterMap$putAll$1 = 0; Object key = entry1.getKey(), value = entry1.getValue(); set((K)key, (V)value); }  }
/*      */   @Nullable public final V put(Object key, Object value) { int i = findInsertIndex((K)key), $i$a$-let-MutableScatterMap$put$index$1 = 0, index = (i < 0) ? (i ^ 0xFFFFFFFF) : i; Object oldValue = this.values[index]; this.keys[index] = key; this.values[index] = value; return (V)oldValue; }
/* 1844 */   public final void putAll(@NotNull Pair[] pairs) { Intrinsics.checkNotNullParameter(pairs, "pairs"); byte b; int i; for (b = 0, i = pairs.length; b < i; ) { Pair pair = pairs[b]; Object key = pair.component1(), value = pair.component2(); set((K)key, (V)value); b++; }  } public final void putAll(@NotNull Iterable pairs) { Intrinsics.checkNotNullParameter(pairs, "pairs"); for (Pair pair : pairs) { Object key = pair.component1(), value = pair.component2(); set((K)key, (V)value); }  } public final void putAll(@NotNull Sequence pairs) { Intrinsics.checkNotNullParameter(pairs, "pairs"); for (Pair pair : pairs) { Object key = pair.component1(), value = pair.component2(); set((K)key, (V)value); }  } public final void putAll(@NotNull ScatterMap from) { Intrinsics.checkNotNullParameter(from, "from"); ScatterMap this_$iv = from; int $i$f$forEach = 0; Object[] k$iv = this_$iv.keys;
/* 1845 */     Object[] v$iv = this_$iv.values;
/*      */     
/* 1847 */     ScatterMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1848 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1849 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1851 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1852 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1853 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1854 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1855 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1856 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1865 */           if (bitCount$iv$iv == 8) {
/*      */             continue;
/*      */           }
/*      */           break;
/*      */         } 
/*      */         continue;
/*      */         if (i$iv$iv != lastIndex$iv$iv) {
/*      */           i$iv$iv++;
/*      */           continue;
/*      */         } 
/*      */         // Byte code: goto -> 220
/*      */       }  }
/*      */     else
/*      */     {  }
/*      */      }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void plusAssign(@NotNull Pair pair) {
/*      */     Intrinsics.checkNotNullParameter(pair, "pair");
/*      */     int $i$f$plusAssign = 0;
/*      */     set((K)pair.getFirst(), (V)pair.getSecond());
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final void plusAssign(@NotNull Pair[] pairs) {
/*      */     Intrinsics.checkNotNullParameter(pairs, "pairs");
/*      */     int $i$f$plusAssign = 0;
/*      */     putAll((Pair<? extends K, ? extends V>[])pairs);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final void plusAssign(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
/*      */     Intrinsics.checkNotNullParameter(pairs, "pairs");
/*      */     int $i$f$plusAssign = 0;
/*      */     putAll(pairs);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final void plusAssign(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
/*      */     Intrinsics.checkNotNullParameter(pairs, "pairs");
/*      */     int $i$f$plusAssign = 0;
/*      */     putAll(pairs);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final void plusAssign(@NotNull Map<K, ? extends V> from) {
/*      */     Intrinsics.checkNotNullParameter(from, "from");
/*      */     int $i$f$plusAssign = 0;
/*      */     putAll(from);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final void plusAssign(@NotNull ScatterMap<K, V> from) {
/*      */     Intrinsics.checkNotNullParameter(from, "from");
/*      */     int $i$f$plusAssign = 0;
/*      */     putAll(from);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final V remove(Object key) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: checkcast androidx/collection/ScatterMap
/*      */     //   4: astore_3
/*      */     //   5: iconst_0
/*      */     //   6: istore #4
/*      */     //   8: iconst_0
/*      */     //   9: istore #5
/*      */     //   11: aload_1
/*      */     //   12: dup
/*      */     //   13: ifnull -> 22
/*      */     //   16: invokevirtual hashCode : ()I
/*      */     //   19: goto -> 24
/*      */     //   22: pop
/*      */     //   23: iconst_0
/*      */     //   24: ldc_w -862048943
/*      */     //   27: imul
/*      */     //   28: istore #6
/*      */     //   30: iload #6
/*      */     //   32: iload #6
/*      */     //   34: bipush #16
/*      */     //   36: ishl
/*      */     //   37: ixor
/*      */     //   38: istore #7
/*      */     //   40: iconst_0
/*      */     //   41: istore #6
/*      */     //   43: iload #7
/*      */     //   45: bipush #127
/*      */     //   47: iand
/*      */     //   48: istore #5
/*      */     //   50: aload_3
/*      */     //   51: getfield _capacity : I
/*      */     //   54: istore #6
/*      */     //   56: iconst_0
/*      */     //   57: istore #8
/*      */     //   59: iload #7
/*      */     //   61: bipush #7
/*      */     //   63: iushr
/*      */     //   64: iload #6
/*      */     //   66: iand
/*      */     //   67: istore #9
/*      */     //   69: iconst_0
/*      */     //   70: istore #8
/*      */     //   72: nop
/*      */     //   73: aload_3
/*      */     //   74: getfield metadata : [J
/*      */     //   77: astore #10
/*      */     //   79: iconst_0
/*      */     //   80: istore #11
/*      */     //   82: iload #9
/*      */     //   84: iconst_3
/*      */     //   85: ishr
/*      */     //   86: istore #12
/*      */     //   88: iload #9
/*      */     //   90: bipush #7
/*      */     //   92: iand
/*      */     //   93: iconst_3
/*      */     //   94: ishl
/*      */     //   95: istore #13
/*      */     //   97: aload #10
/*      */     //   99: iload #12
/*      */     //   101: laload
/*      */     //   102: iload #13
/*      */     //   104: lushr
/*      */     //   105: aload #10
/*      */     //   107: iload #12
/*      */     //   109: iconst_1
/*      */     //   110: iadd
/*      */     //   111: laload
/*      */     //   112: bipush #64
/*      */     //   114: iload #13
/*      */     //   116: isub
/*      */     //   117: lshl
/*      */     //   118: iload #13
/*      */     //   120: i2l
/*      */     //   121: lneg
/*      */     //   122: bipush #63
/*      */     //   124: lshr
/*      */     //   125: land
/*      */     //   126: lor
/*      */     //   127: lstore #14
/*      */     //   129: lload #14
/*      */     //   131: lstore #16
/*      */     //   133: iconst_0
/*      */     //   134: istore #18
/*      */     //   136: lload #16
/*      */     //   138: ldc2_w 72340172838076673
/*      */     //   141: iload #5
/*      */     //   143: i2l
/*      */     //   144: lmul
/*      */     //   145: lxor
/*      */     //   146: lstore #19
/*      */     //   148: lload #19
/*      */     //   150: ldc2_w 72340172838076673
/*      */     //   153: lsub
/*      */     //   154: lload #19
/*      */     //   156: ldc2_w -1
/*      */     //   159: lxor
/*      */     //   160: land
/*      */     //   161: ldc2_w -9187201950435737472
/*      */     //   164: land
/*      */     //   165: lstore #21
/*      */     //   167: lload #21
/*      */     //   169: lstore #16
/*      */     //   171: iconst_0
/*      */     //   172: istore #18
/*      */     //   174: lload #16
/*      */     //   176: lconst_0
/*      */     //   177: lcmp
/*      */     //   178: ifeq -> 185
/*      */     //   181: iconst_1
/*      */     //   182: goto -> 186
/*      */     //   185: iconst_0
/*      */     //   186: ifeq -> 257
/*      */     //   189: iload #9
/*      */     //   191: lload #21
/*      */     //   193: lstore #23
/*      */     //   195: iconst_0
/*      */     //   196: istore #25
/*      */     //   198: lload #23
/*      */     //   200: lstore #26
/*      */     //   202: iconst_0
/*      */     //   203: istore #28
/*      */     //   205: lload #26
/*      */     //   207: invokestatic numberOfTrailingZeros : (J)I
/*      */     //   210: iconst_3
/*      */     //   211: ishr
/*      */     //   212: nop
/*      */     //   213: iadd
/*      */     //   214: iload #6
/*      */     //   216: iand
/*      */     //   217: istore #12
/*      */     //   219: aload_3
/*      */     //   220: getfield keys : [Ljava/lang/Object;
/*      */     //   223: iload #12
/*      */     //   225: aaload
/*      */     //   226: aload_1
/*      */     //   227: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   230: ifeq -> 238
/*      */     //   233: iload #12
/*      */     //   235: goto -> 306
/*      */     //   238: lload #21
/*      */     //   240: lstore #23
/*      */     //   242: iconst_0
/*      */     //   243: istore #25
/*      */     //   245: lload #23
/*      */     //   247: lload #23
/*      */     //   249: lconst_1
/*      */     //   250: lsub
/*      */     //   251: land
/*      */     //   252: lstore #21
/*      */     //   254: goto -> 167
/*      */     //   257: lload #14
/*      */     //   259: lstore #16
/*      */     //   261: iconst_0
/*      */     //   262: istore #18
/*      */     //   264: lload #16
/*      */     //   266: lload #16
/*      */     //   268: ldc2_w -1
/*      */     //   271: lxor
/*      */     //   272: bipush #6
/*      */     //   274: lshl
/*      */     //   275: land
/*      */     //   276: ldc2_w -9187201950435737472
/*      */     //   279: land
/*      */     //   280: lconst_0
/*      */     //   281: lcmp
/*      */     //   282: ifeq -> 288
/*      */     //   285: goto -> 305
/*      */     //   288: iinc #8, 8
/*      */     //   291: nop
/*      */     //   292: iload #9
/*      */     //   294: iload #8
/*      */     //   296: iadd
/*      */     //   297: iload #6
/*      */     //   299: iand
/*      */     //   300: istore #9
/*      */     //   302: goto -> 72
/*      */     //   305: iconst_m1
/*      */     //   306: istore_2
/*      */     //   307: iload_2
/*      */     //   308: iflt -> 317
/*      */     //   311: aload_0
/*      */     //   312: iload_2
/*      */     //   313: invokevirtual removeValueAt : (I)Ljava/lang/Object;
/*      */     //   316: areturn
/*      */     //   317: aconst_null
/*      */     //   318: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1021	-> 0
/*      */     //   #1870	-> 8
/*      */     //   #1871	-> 11
/*      */     //   #1871	-> 24
/*      */     //   #1873	-> 30
/*      */     //   #1870	-> 38
/*      */     //   #1874	-> 40
/*      */     //   #1875	-> 43
/*      */     //   #1874	-> 48
/*      */     //   #1876	-> 50
/*      */     //   #1877	-> 56
/*      */     //   #1878	-> 59
/*      */     //   #1877	-> 64
/*      */     //   #1879	-> 69
/*      */     //   #1881	-> 72
/*      */     //   #1882	-> 73
/*      */     //   #1883	-> 82
/*      */     //   #1884	-> 88
/*      */     //   #1885	-> 97
/*      */     //   #1882	-> 127
/*      */     //   #1886	-> 129
/*      */     //   #1887	-> 136
/*      */     //   #1889	-> 148
/*      */     //   #1886	-> 165
/*      */     //   #1890	-> 167
/*      */     //   #1891	-> 174
/*      */     //   #1892	-> 189
/*      */     //   #1893	-> 198
/*      */     //   #1894	-> 205
/*      */     //   #1894	-> 210
/*      */     //   #1893	-> 212
/*      */     //   #1892	-> 213
/*      */     //   #1895	-> 219
/*      */     //   #1896	-> 233
/*      */     //   #1898	-> 238
/*      */     //   #1899	-> 245
/*      */     //   #1898	-> 252
/*      */     //   #1900	-> 257
/*      */     //   #1901	-> 264
/*      */     //   #1900	-> 280
/*      */     //   #1902	-> 285
/*      */     //   #1905	-> 291
/*      */     //   #1906	-> 292
/*      */     //   #1909	-> 305
/*      */     //   #1021	-> 306
/*      */     //   #1022	-> 307
/*      */     //   #1023	-> 311
/*      */     //   #1025	-> 317
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   11	27	5	$i$f$hash	I
/*      */     //   30	8	6	hash$iv$iv	I
/*      */     //   43	5	6	$i$f$h2	I
/*      */     //   59	5	8	$i$f$h1	I
/*      */     //   82	45	11	$i$f$group	I
/*      */     //   88	39	12	i$iv$iv	I
/*      */     //   97	30	13	b$iv$iv	I
/*      */     //   79	48	10	metadata$iv$iv	[J
/*      */     //   136	29	18	$i$f$match	I
/*      */     //   148	17	19	x$iv$iv	J
/*      */     //   133	32	16	$this$match$iv$iv	J
/*      */     //   174	12	18	$i$f$hasNext	I
/*      */     //   171	15	16	$this$hasNext$iv$iv	J
/*      */     //   205	7	28	$i$f$lowestBitSet	I
/*      */     //   202	10	26	$this$lowestBitSet$iv$iv$iv	J
/*      */     //   198	15	25	$i$f$get	I
/*      */     //   195	18	23	$this$get$iv$iv	J
/*      */     //   245	7	25	$i$f$next	I
/*      */     //   242	10	23	$this$next$iv$iv	J
/*      */     //   219	35	12	index$iv	I
/*      */     //   264	16	18	$i$f$maskEmpty	I
/*      */     //   261	19	16	$this$maskEmpty$iv$iv	J
/*      */     //   129	173	14	g$iv	J
/*      */     //   167	135	21	m$iv	J
/*      */     //   8	298	4	$i$f$findKeyIndex$collection	I
/*      */     //   40	266	7	hash$iv	I
/*      */     //   50	256	5	hash2$iv	I
/*      */     //   56	250	6	probeMask$iv	I
/*      */     //   69	237	9	probeOffset$iv	I
/*      */     //   72	234	8	probeIndex$iv	I
/*      */     //   5	301	3	this_$iv	Landroidx/collection/ScatterMap;
/*      */     //   307	12	2	index	I
/*      */     //   0	319	0	this	Landroidx/collection/MutableScatterMap;
/*      */     //   0	319	1	key	Ljava/lang/Object;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean remove(Object key, Object value) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: checkcast androidx/collection/ScatterMap
/*      */     //   4: astore #4
/*      */     //   6: iconst_0
/*      */     //   7: istore #5
/*      */     //   9: iconst_0
/*      */     //   10: istore #6
/*      */     //   12: aload_1
/*      */     //   13: dup
/*      */     //   14: ifnull -> 23
/*      */     //   17: invokevirtual hashCode : ()I
/*      */     //   20: goto -> 25
/*      */     //   23: pop
/*      */     //   24: iconst_0
/*      */     //   25: ldc_w -862048943
/*      */     //   28: imul
/*      */     //   29: istore #7
/*      */     //   31: iload #7
/*      */     //   33: iload #7
/*      */     //   35: bipush #16
/*      */     //   37: ishl
/*      */     //   38: ixor
/*      */     //   39: istore #8
/*      */     //   41: iconst_0
/*      */     //   42: istore #7
/*      */     //   44: iload #8
/*      */     //   46: bipush #127
/*      */     //   48: iand
/*      */     //   49: istore #6
/*      */     //   51: aload #4
/*      */     //   53: getfield _capacity : I
/*      */     //   56: istore #7
/*      */     //   58: iconst_0
/*      */     //   59: istore #9
/*      */     //   61: iload #8
/*      */     //   63: bipush #7
/*      */     //   65: iushr
/*      */     //   66: iload #7
/*      */     //   68: iand
/*      */     //   69: istore #10
/*      */     //   71: iconst_0
/*      */     //   72: istore #9
/*      */     //   74: nop
/*      */     //   75: aload #4
/*      */     //   77: getfield metadata : [J
/*      */     //   80: astore #11
/*      */     //   82: iconst_0
/*      */     //   83: istore #12
/*      */     //   85: iload #10
/*      */     //   87: iconst_3
/*      */     //   88: ishr
/*      */     //   89: istore #13
/*      */     //   91: iload #10
/*      */     //   93: bipush #7
/*      */     //   95: iand
/*      */     //   96: iconst_3
/*      */     //   97: ishl
/*      */     //   98: istore #14
/*      */     //   100: aload #11
/*      */     //   102: iload #13
/*      */     //   104: laload
/*      */     //   105: iload #14
/*      */     //   107: lushr
/*      */     //   108: aload #11
/*      */     //   110: iload #13
/*      */     //   112: iconst_1
/*      */     //   113: iadd
/*      */     //   114: laload
/*      */     //   115: bipush #64
/*      */     //   117: iload #14
/*      */     //   119: isub
/*      */     //   120: lshl
/*      */     //   121: iload #14
/*      */     //   123: i2l
/*      */     //   124: lneg
/*      */     //   125: bipush #63
/*      */     //   127: lshr
/*      */     //   128: land
/*      */     //   129: lor
/*      */     //   130: lstore #15
/*      */     //   132: lload #15
/*      */     //   134: lstore #17
/*      */     //   136: iconst_0
/*      */     //   137: istore #19
/*      */     //   139: lload #17
/*      */     //   141: ldc2_w 72340172838076673
/*      */     //   144: iload #6
/*      */     //   146: i2l
/*      */     //   147: lmul
/*      */     //   148: lxor
/*      */     //   149: lstore #20
/*      */     //   151: lload #20
/*      */     //   153: ldc2_w 72340172838076673
/*      */     //   156: lsub
/*      */     //   157: lload #20
/*      */     //   159: ldc2_w -1
/*      */     //   162: lxor
/*      */     //   163: land
/*      */     //   164: ldc2_w -9187201950435737472
/*      */     //   167: land
/*      */     //   168: lstore #22
/*      */     //   170: lload #22
/*      */     //   172: lstore #17
/*      */     //   174: iconst_0
/*      */     //   175: istore #19
/*      */     //   177: lload #17
/*      */     //   179: lconst_0
/*      */     //   180: lcmp
/*      */     //   181: ifeq -> 188
/*      */     //   184: iconst_1
/*      */     //   185: goto -> 189
/*      */     //   188: iconst_0
/*      */     //   189: ifeq -> 261
/*      */     //   192: iload #10
/*      */     //   194: lload #22
/*      */     //   196: lstore #24
/*      */     //   198: iconst_0
/*      */     //   199: istore #26
/*      */     //   201: lload #24
/*      */     //   203: lstore #27
/*      */     //   205: iconst_0
/*      */     //   206: istore #29
/*      */     //   208: lload #27
/*      */     //   210: invokestatic numberOfTrailingZeros : (J)I
/*      */     //   213: iconst_3
/*      */     //   214: ishr
/*      */     //   215: nop
/*      */     //   216: iadd
/*      */     //   217: iload #7
/*      */     //   219: iand
/*      */     //   220: istore #13
/*      */     //   222: aload #4
/*      */     //   224: getfield keys : [Ljava/lang/Object;
/*      */     //   227: iload #13
/*      */     //   229: aaload
/*      */     //   230: aload_1
/*      */     //   231: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   234: ifeq -> 242
/*      */     //   237: iload #13
/*      */     //   239: goto -> 310
/*      */     //   242: lload #22
/*      */     //   244: lstore #24
/*      */     //   246: iconst_0
/*      */     //   247: istore #26
/*      */     //   249: lload #24
/*      */     //   251: lload #24
/*      */     //   253: lconst_1
/*      */     //   254: lsub
/*      */     //   255: land
/*      */     //   256: lstore #22
/*      */     //   258: goto -> 170
/*      */     //   261: lload #15
/*      */     //   263: lstore #17
/*      */     //   265: iconst_0
/*      */     //   266: istore #19
/*      */     //   268: lload #17
/*      */     //   270: lload #17
/*      */     //   272: ldc2_w -1
/*      */     //   275: lxor
/*      */     //   276: bipush #6
/*      */     //   278: lshl
/*      */     //   279: land
/*      */     //   280: ldc2_w -9187201950435737472
/*      */     //   283: land
/*      */     //   284: lconst_0
/*      */     //   285: lcmp
/*      */     //   286: ifeq -> 292
/*      */     //   289: goto -> 309
/*      */     //   292: iinc #9, 8
/*      */     //   295: nop
/*      */     //   296: iload #10
/*      */     //   298: iload #9
/*      */     //   300: iadd
/*      */     //   301: iload #7
/*      */     //   303: iand
/*      */     //   304: istore #10
/*      */     //   306: goto -> 74
/*      */     //   309: iconst_m1
/*      */     //   310: istore_3
/*      */     //   311: iload_3
/*      */     //   312: iflt -> 336
/*      */     //   315: aload_0
/*      */     //   316: getfield values : [Ljava/lang/Object;
/*      */     //   319: iload_3
/*      */     //   320: aaload
/*      */     //   321: aload_2
/*      */     //   322: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   325: ifeq -> 336
/*      */     //   328: aload_0
/*      */     //   329: iload_3
/*      */     //   330: invokevirtual removeValueAt : (I)Ljava/lang/Object;
/*      */     //   333: pop
/*      */     //   334: iconst_1
/*      */     //   335: ireturn
/*      */     //   336: iconst_0
/*      */     //   337: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1033	-> 0
/*      */     //   #1910	-> 9
/*      */     //   #1911	-> 12
/*      */     //   #1911	-> 25
/*      */     //   #1913	-> 31
/*      */     //   #1910	-> 39
/*      */     //   #1914	-> 41
/*      */     //   #1915	-> 44
/*      */     //   #1914	-> 49
/*      */     //   #1916	-> 51
/*      */     //   #1917	-> 58
/*      */     //   #1918	-> 61
/*      */     //   #1917	-> 66
/*      */     //   #1919	-> 71
/*      */     //   #1921	-> 74
/*      */     //   #1922	-> 75
/*      */     //   #1923	-> 85
/*      */     //   #1924	-> 91
/*      */     //   #1925	-> 100
/*      */     //   #1922	-> 130
/*      */     //   #1926	-> 132
/*      */     //   #1927	-> 139
/*      */     //   #1929	-> 151
/*      */     //   #1926	-> 168
/*      */     //   #1930	-> 170
/*      */     //   #1931	-> 177
/*      */     //   #1932	-> 192
/*      */     //   #1933	-> 201
/*      */     //   #1934	-> 208
/*      */     //   #1934	-> 213
/*      */     //   #1933	-> 215
/*      */     //   #1932	-> 216
/*      */     //   #1935	-> 222
/*      */     //   #1936	-> 237
/*      */     //   #1938	-> 242
/*      */     //   #1939	-> 249
/*      */     //   #1938	-> 256
/*      */     //   #1940	-> 261
/*      */     //   #1941	-> 268
/*      */     //   #1940	-> 284
/*      */     //   #1942	-> 289
/*      */     //   #1945	-> 295
/*      */     //   #1946	-> 296
/*      */     //   #1949	-> 309
/*      */     //   #1033	-> 310
/*      */     //   #1034	-> 311
/*      */     //   #1035	-> 315
/*      */     //   #1036	-> 328
/*      */     //   #1037	-> 334
/*      */     //   #1040	-> 336
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   12	27	6	$i$f$hash	I
/*      */     //   31	8	7	hash$iv$iv	I
/*      */     //   44	5	7	$i$f$h2	I
/*      */     //   61	5	9	$i$f$h1	I
/*      */     //   85	45	12	$i$f$group	I
/*      */     //   91	39	13	i$iv$iv	I
/*      */     //   100	30	14	b$iv$iv	I
/*      */     //   82	48	11	metadata$iv$iv	[J
/*      */     //   139	29	19	$i$f$match	I
/*      */     //   151	17	20	x$iv$iv	J
/*      */     //   136	32	17	$this$match$iv$iv	J
/*      */     //   177	12	19	$i$f$hasNext	I
/*      */     //   174	15	17	$this$hasNext$iv$iv	J
/*      */     //   208	7	29	$i$f$lowestBitSet	I
/*      */     //   205	10	27	$this$lowestBitSet$iv$iv$iv	J
/*      */     //   201	15	26	$i$f$get	I
/*      */     //   198	18	24	$this$get$iv$iv	J
/*      */     //   249	7	26	$i$f$next	I
/*      */     //   246	10	24	$this$next$iv$iv	J
/*      */     //   222	36	13	index$iv	I
/*      */     //   268	16	19	$i$f$maskEmpty	I
/*      */     //   265	19	17	$this$maskEmpty$iv$iv	J
/*      */     //   132	174	15	g$iv	J
/*      */     //   170	136	22	m$iv	J
/*      */     //   9	301	5	$i$f$findKeyIndex$collection	I
/*      */     //   41	269	8	hash$iv	I
/*      */     //   51	259	6	hash2$iv	I
/*      */     //   58	252	7	probeMask$iv	I
/*      */     //   71	239	10	probeOffset$iv	I
/*      */     //   74	236	9	probeIndex$iv	I
/*      */     //   6	304	4	this_$iv	Landroidx/collection/ScatterMap;
/*      */     //   311	27	3	index	I
/*      */     //   0	338	0	this	Landroidx/collection/MutableScatterMap;
/*      */     //   0	338	1	key	Ljava/lang/Object;
/*      */     //   0	338	2	value	Ljava/lang/Object;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final void removeIf(@NotNull Function2 predicate) {
/*      */     Intrinsics.checkNotNullParameter(predicate, "predicate");
/*      */     int $i$f$removeIf = 0;
/*      */     ScatterMap this_$iv = this;
/*      */     int $i$f$forEachIndexed = 0;
/* 1950 */     long[] m$iv = this_$iv.metadata;
/* 1951 */     int lastIndex$iv = m$iv.length - 2;
/*      */     
/* 1953 */     int i$iv = 0; if (i$iv <= lastIndex$iv) { while (true)
/* 1954 */       { long slot$iv = m$iv[i$iv];
/* 1955 */         long $this$maskEmptyOrDeleted$iv$iv = slot$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1956 */         if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1957 */         { int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/* 1958 */           for (int j$iv = 0;; j$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1966 */           if (bitCount$iv == 8) continue;  break; }  continue; if (i$iv != lastIndex$iv) { i$iv++; continue; }  // Byte code: goto -> 217 }  } else {  } 
/*      */   } public final void minusAssign(Object key) { int $i$f$minusAssign = 0; remove((K)key); } public final void minusAssign(@NotNull Object[] keys) { Intrinsics.checkNotNullParameter(keys, "keys"); int $i$f$minusAssign; byte b; int i; for ($i$f$minusAssign = 0, b = 0, i = keys.length; b < i; ) { Object key = keys[b]; remove((K)key); b++; }  }
/*      */   public final void minusAssign(@NotNull Iterable keys) { Intrinsics.checkNotNullParameter(keys, "keys"); int $i$f$minusAssign = 0; for (Object key : keys) remove((K)key);  }
/*      */   public final void minusAssign(@NotNull Sequence keys) { Intrinsics.checkNotNullParameter(keys, "keys"); int $i$f$minusAssign = 0; for (Object key : keys)
/*      */       remove((K)key);  }
/* 1971 */   public final void minusAssign(@NotNull ScatterSet keys) { Intrinsics.checkNotNullParameter(keys, "keys"); int $i$f$minusAssign = 0; ScatterSet this_$iv = keys; int $i$f$forEach = 0; Object[] k$iv = this_$iv.elements;
/*      */     
/* 1973 */     ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1975 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1976 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1978 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1979 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1980 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1981 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1982 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1983 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1992 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break;
/*      */         }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 212
/*      */       }  }
/*      */     else {  }
/* 1998 */      } public final void minusAssign(@NotNull ObjectList keys) { Intrinsics.checkNotNullParameter(keys, "keys"); int $i$f$minusAssign = 0; ObjectList this_$iv = keys; int $i$f$forEach = 0; Object[] content$iv = this_$iv.content;
/* 1999 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 2000 */       Object key = content$iv[i$iv]; int $i$a$-forEach-MutableScatterMap$minusAssign$2 = 0; remove((K)key);
/*      */     }  } @PublishedApi @Nullable public final V removeValueAt(int index) { this._size--; MutableScatterMap mutableScatterMap = this; long value$iv = 254L;
/*      */     int $i$f$writeMetadata = 0;
/* 2003 */     long[] m$iv = mutableScatterMap.metadata;
/* 2004 */     int $i$f$writeRawMetadata = 0;
/* 2005 */     int i$iv$iv = index >> 3;
/* 2006 */     int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 2009 */     m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */     
/* 2011 */     int c$iv = mutableScatterMap._capacity;
/* 2012 */     int cloneIndex$iv = (index - 7 & c$iv) + (
/* 2013 */       0x7 & c$iv);
/* 2014 */     int i = 0; int j = cloneIndex$iv >> 3; int k = (cloneIndex$iv & 0x7) << 3; m$iv[j] = m$iv[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << k; this.keys[index] = null; Object oldValue = this.values[index]; this.values[index] = null; return (V)oldValue; } public final void clear() { this._size = 0; if (this.metadata != ScatterMapKt.EmptyGroup) {
/*      */       ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, null); long[] arrayOfLong = this.metadata; int i = this._capacity; long value$iv = 255L; int $i$f$writeRawMetadata = 0;
/* 2016 */       int i$iv = i >> 3;
/* 2017 */       int b$iv = (i & 0x7) << 3;
/*      */ 
/*      */       
/* 2020 */       arrayOfLong[i$iv] = arrayOfLong[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv;
/*      */     }  ArraysKt.fill(this.values, null, 0, this._capacity); ArraysKt.fill(this.keys, null, 0, this._capacity); initializeGrowth(); } @PublishedApi public final int findInsertIndex(Object key) { int $i$f$hash = 0;
/* 2022 */     int hash$iv = ((key != null) ? key.hashCode() : 0) * -862048943;
/*      */     
/* 2024 */     int hash = hash$iv ^ hash$iv << 16;
/* 2025 */     int $i$f$h1 = 0, hash1 = hash >>> 7;
/* 2026 */     int $i$f$h2 = 0, hash2 = hash & 0x7F; int probeMask = this._capacity; int probeOffset = hash1 & probeMask; int probeIndex = 0; while (true) {
/* 2027 */       long[] arrayOfLong = this.metadata; int $i$f$group = 0; int i$iv = probeOffset >> 3;
/* 2028 */       int b$iv = (probeOffset & 0x7) << 3;
/* 2029 */       long g = arrayOfLong[i$iv] >>> b$iv | arrayOfLong[i$iv + 1] << 64 - b$iv & -(b$iv) >> 63L; long $this$match$iv = g; int $i$f$match = 0;
/* 2030 */       long x$iv = $this$match$iv ^ 72340172838076673L * hash2;
/*      */       
/* 2032 */       long m = x$iv - 72340172838076673L & (x$iv ^ 0xFFFFFFFFFFFFFFFFL) & 0x8080808080808080L; while (true)
/* 2033 */       { long $this$hasNext$iv = m; int $i$f$hasNext = 0; if (($this$hasNext$iv != 0L)) {
/* 2034 */           long $this$get$iv = m; int $i$f$get = 0; long $this$lowestBitSet$iv$iv = $this$get$iv; int $i$f$lowestBitSet = 0;
/* 2035 */           int n = probeOffset + (Long.numberOfTrailingZeros($this$lowestBitSet$iv$iv) >> 3) & probeMask;
/*      */         }  long $this$maskEmpty$iv = g; int $i$f$maskEmpty = 0;
/* 2037 */         if (($this$maskEmpty$iv & ($this$maskEmpty$iv ^ 0xFFFFFFFFFFFFFFFFL) << 6L & 0x8080808080808080L) != 0L); break; }  probeIndex += 8; probeOffset = probeOffset + probeIndex & probeMask;
/* 2038 */     }  int index = findFirstAvailableSlot(hash1); if (this.growthLimit == 0) { long[] arrayOfLong = this.metadata; int $i$f$isDeleted = 0; int m = 0; if (!(((
/* 2039 */         arrayOfLong[index >> 3] >> (index & 0x7) << 3 & 0xFFL) == 254L) ? 1 : 0)) { adjustStorage(); index = findFirstAvailableSlot(hash1); }  }
/* 2040 */      this._size++; long[] metadata$iv = this.metadata; int $i$f$isEmpty = 0; int $i$f$readRawMetadata = 0; this.growthLimit -= (((
/* 2041 */       metadata$iv[index >> 3] >> (index & 0x7) << 3 & 0xFFL) == 128L)) ? 1 : 0; MutableScatterMap mutableScatterMap = this; long value$iv = hash2; int $i$f$writeMetadata = 0;
/* 2042 */     long[] m$iv = mutableScatterMap.metadata;
/* 2043 */     int $i$f$writeRawMetadata = 0;
/* 2044 */     int i$iv$iv = index >> 3;
/* 2045 */     int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 2048 */     m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */     
/* 2050 */     int c$iv = mutableScatterMap._capacity;
/* 2051 */     int cloneIndex$iv = (index - 7 & c$iv) + (
/* 2052 */       0x7 & c$iv);
/* 2053 */     int i = 0; int j = cloneIndex$iv >> 3; int k = (cloneIndex$iv & 0x7) << 3; m$iv[j] = m$iv[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << k; return index ^ 0xFFFFFFFF; } private final int findFirstAvailableSlot(int hash1) { int probeMask = this._capacity; int probeOffset = hash1 & probeMask; int probeIndex = 0; while (true)
/*      */     { long[] metadata$iv = this.metadata; int $i$f$group = 0;
/* 2055 */       int i$iv = probeOffset >> 3;
/* 2056 */       int b$iv = (probeOffset & 0x7) << 3;
/* 2057 */       long g = metadata$iv[i$iv] >>> b$iv | metadata$iv[i$iv + 1] << 64 - b$iv & -(b$iv) >> 63L; long $this$maskEmptyOrDeleted$iv = g; int $i$f$maskEmptyOrDeleted = 0;
/* 2058 */       long m = $this$maskEmptyOrDeleted$iv & ($this$maskEmptyOrDeleted$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L; if (m != 0L)
/* 2059 */       { long $this$lowestBitSet$iv = m; int $i$f$lowestBitSet = 0; return probeOffset + (Long.numberOfTrailingZeros($this$lowestBitSet$iv) >> 3) & probeMask; }  probeIndex += 8; probeOffset = probeOffset + probeIndex & probeMask; }  } public final int trim() { int previousCapacity = this._capacity; int newCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size)); if (newCapacity < previousCapacity) { resizeStorage(newCapacity); return previousCapacity - this._capacity; }  return 0; } private final void adjustStorage() { if (this._capacity > 8 && Long.compareUnsigned(ULong.constructor-impl(ULong.constructor-impl(this._size) * 32L), ULong.constructor-impl(ULong.constructor-impl(this._capacity) * 25L)) <= 0) { resizeStorage(ScatterMapKt.nextCapacity(this._capacity)); } else { resizeStorage(ScatterMapKt.nextCapacity(this._capacity)); }  }
/* 2060 */   private final void resizeStorage(int newCapacity) { long[] previousMetadata = this.metadata; Object[] previousKeys = this.keys; Object[] previousValues = this.values; int previousCapacity = this._capacity; initializeStorage(newCapacity); Object[] newKeys = this.keys; Object[] newValues = this.values; for (int i = 0; i < previousCapacity; i++) { int $i$f$isFull = 0; int $i$f$readRawMetadata = 0; if (((
/* 2061 */         previousMetadata[i >> 3] >> (i & 0x7) << 3 & 0xFFL) < 128L)) {
/* 2062 */         Object previousKey = previousKeys[i]; int $i$f$hash = 0; int hash$iv = ((previousKey != null) ? previousKey.hashCode() : 0) * -862048943;
/*      */         
/* 2064 */         int hash = hash$iv ^ hash$iv << 16;
/* 2065 */         int $i$f$h1 = 0, index = findFirstAvailableSlot(hash >>> 7); MutableScatterMap mutableScatterMap = this; int $i$f$h2 = 0;
/* 2066 */         long value$iv = (hash & 0x7F); int $i$f$writeMetadata = 0;
/* 2067 */         long[] m$iv = mutableScatterMap.metadata;
/* 2068 */         int $i$f$writeRawMetadata = 0;
/* 2069 */         int i$iv$iv = index >> 3;
/* 2070 */         int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */         
/* 2073 */         m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */         
/* 2075 */         int c$iv = mutableScatterMap._capacity;
/* 2076 */         int cloneIndex$iv = (index - 7 & c$iv) + (
/* 2077 */           0x7 & c$iv);
/* 2078 */         int j = 0; int k = cloneIndex$iv >> 3; int m = (cloneIndex$iv & 0x7) << 3; m$iv[k] = m$iv[k] & (255L << m ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << m; newKeys[index] = previousKey; newValues[index] = previousValues[i];
/*      */       }  }
/* 2080 */      } private final void writeMetadata(int index, long value) { int $i$f$writeMetadata = 0; long[] m = this.metadata; int $i$f$writeRawMetadata = 0; int i$iv = index >> 3;
/* 2081 */     int b$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 2084 */     m[i$iv] = m[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value << b$iv; int c = this._capacity; int cloneIndex = (index - 7 & c) + (0x7 & c);
/*      */     int i = 0;
/* 2086 */     int j = cloneIndex >> 3;
/* 2087 */     int k = (cloneIndex & 0x7) << 3;
/*      */ 
/*      */     
/* 2090 */     m[j] = m[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value << k; }
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final Map<K, V> asMutableMap() {
/*      */     return new MutableMapWrapper();
/*      */   }
/*      */   
/*      */   public MutableScatterMap() {
/*      */     this(0, 1, (DefaultConstructorMarker)null);
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020%\n\002\b\002\n\002\020#\n\002\020'\n\002\b\005\n\002\020\037\n\002\b\003\n\002\020\002\n\002\b\006\n\002\020$\n\002\b\003\b\004\030\0002\0220\001R\016\022\004\022\0028\000\022\004\022\0028\0010\0022\016\022\004\022\0028\000\022\004\022\0028\0010\003B\005¢\006\002\020\004J\b\020\020\032\0020\021H\026J\037\020\022\032\004\030\0018\0012\006\020\023\032\0028\0002\006\020\024\032\0028\001H\026¢\006\002\020\025J\036\020\026\032\0020\0212\024\020\027\032\020\022\006\b\001\022\0028\000\022\004\022\0028\0010\030H\026J\027\020\031\032\004\030\0018\0012\006\020\023\032\0028\000H\026¢\006\002\020\032R&\020\005\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0070\0068VX\004¢\006\006\032\004\b\b\020\tR\032\020\n\032\b\022\004\022\0028\0000\0068VX\004¢\006\006\032\004\b\013\020\tR\032\020\f\032\b\022\004\022\0028\0010\r8VX\004¢\006\006\032\004\b\016\020\017¨\006\033"}, d2 = {"Landroidx/collection/MutableScatterMap$MutableMapWrapper;", "Landroidx/collection/ScatterMap$MapWrapper;", "Landroidx/collection/ScatterMap;", "", "(Landroidx/collection/MutableScatterMap;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "values", "", "getValues", "()Ljava/util/Collection;", "clear", "", "put", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "collection"})
/*      */   @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1834:1\n215#2,2:1835\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper\n*L\n1574#1:1835,2\n*E\n"})
/*      */   private final class MutableMapWrapper extends ScatterMap<K, V>.MapWrapper implements Map<K, V>, KMutableMap {
/*      */     @NotNull
/*      */     public Set<Map.Entry<K, V>> getEntries() {
/*      */       return new MutableScatterMap$MutableMapWrapper$entries$1();
/*      */     }
/*      */     
/*      */     @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0005\n\000\n\002\020#\n\002\020'\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\036\n\000\n\002\020\002\n\002\b\004\n\002\020)\n\002\b\004*\001\000\b\n\030\0002\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0020\001J\034\020\007\032\0020\b2\022\020\t\032\016\022\004\022\0028\000\022\004\022\0028\0010\002H\026J\"\020\n\032\0020\b2\030\020\013\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0020\fH\026J\b\020\r\032\0020\016H\026J\035\020\017\032\0020\b2\022\020\t\032\016\022\004\022\0028\000\022\004\022\0028\0010\002H\002J\"\020\020\032\0020\b2\030\020\013\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0020\fH\026J\b\020\021\032\0020\bH\026J\033\020\022\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0020\023H\002J\034\020\024\032\0020\b2\022\020\t\032\016\022\004\022\0028\000\022\004\022\0028\0010\002H\026J\"\020\025\032\0020\b2\030\020\013\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0020\fH\026J\"\020\026\032\0020\b2\030\020\013\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0020\fH\026R\024\020\003\032\0020\0048VX\004¢\006\006\032\004\b\005\020\006¨\006\027"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$entries$1", "", "", "size", "", "getSize", "()I", "add", "", "element", "addAll", "elements", "", "clear", "", "contains", "containsAll", "isEmpty", "iterator", "", "remove", "removeAll", "retainAll", "collection"})
/*      */     @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n1726#2,3:1835\n363#3,6:1838\n373#3,3:1845\n376#3,9:1849\n363#3,6:1858\n373#3,3:1865\n376#3,9:1869\n633#3:1878\n634#3:1882\n636#3,2:1884\n638#3,4:1887\n642#3:1894\n643#3:1898\n644#3:1900\n645#3,4:1903\n651#3:1908\n652#3,8:1910\n1810#4:1844\n1672#4:1848\n1810#4:1864\n1672#4:1868\n1589#4,3:1879\n1603#4:1883\n1599#4:1886\n1779#4,3:1891\n1793#4,3:1895\n1717#4:1899\n1705#4:1901\n1699#4:1902\n1712#4:1907\n1802#4:1909\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1\n*L\n1342#1:1835,3\n1360#1:1838,6\n1360#1:1845,3\n1360#1:1849,9\n1382#1:1858,6\n1382#1:1865,3\n1382#1:1869,9\n1397#1:1878\n1397#1:1882\n1397#1:1884,2\n1397#1:1887,4\n1397#1:1894\n1397#1:1898\n1397#1:1900\n1397#1:1903,4\n1397#1:1908\n1397#1:1910,8\n1360#1:1844\n1360#1:1848\n1382#1:1864\n1382#1:1868\n1397#1:1879,3\n1397#1:1883\n1397#1:1886\n1397#1:1891,3\n1397#1:1895,3\n1397#1:1899\n1397#1:1901\n1397#1:1902\n1397#1:1907\n1397#1:1909\n*E\n"})
/*      */     public static final class MutableScatterMap$MutableMapWrapper$entries$1 implements Set<Map.Entry<K, V>>, KMutableSet {
/*      */       public int getSize() {
/*      */         return MutableScatterMap.this._size;
/*      */       }
/*      */       
/*      */       public boolean isEmpty() {
/*      */         return MutableScatterMap.this.isEmpty();
/*      */       }
/*      */       
/*      */       @NotNull
/*      */       public Iterator<Map.Entry<K, V>> iterator() {
/*      */         return new MutableScatterMap$MutableMapWrapper$entries$1$iterator$1();
/*      */       }
/*      */       
/*      */       @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000-\n\000\n\002\020)\n\002\020'\n\000\n\002\020\b\n\002\b\005\n\002\020(\n\002\b\005\n\002\020\013\n\002\b\002\n\002\020\002\n\000*\001\000\b\n\030\0002\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0020\001J\t\020\017\032\0020\020H\002J\025\020\021\032\016\022\004\022\0028\000\022\004\022\0028\0010\002H\002J\b\020\022\032\0020\023H\026R\032\020\003\032\0020\004X\016¢\006\016\n\000\032\004\b\005\020\006\"\004\b\007\020\bR,\020\t\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0020\nX\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016¨\006\024"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1", "", "", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "iterator", "", "getIterator", "()Ljava/util/Iterator;", "setIterator", "(Ljava/util/Iterator;)V", "hasNext", "", "next", "remove", "", "collection"})
/*      */       public static final class MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 implements Iterator<Map.Entry<K, V>>, KMutableIterator {
/*      */         @NotNull
/*      */         public final Iterator<Map.Entry<K, V>> getIterator() {
/*      */           return (Iterator)this.iterator;
/*      */         }
/*      */         
/*      */         public final void setIterator(@NotNull Iterator<? extends Map.Entry<K, V>> <set-?>) {
/*      */           Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*      */           this.iterator = <set-?>;
/*      */         }
/*      */         
/*      */         private int current = -1;
/*      */         
/*      */         public final int getCurrent() {
/*      */           return this.current;
/*      */         }
/*      */         
/*      */         public final void setCurrent(int <set-?>) {
/*      */           this.current = <set-?>;
/*      */         }
/*      */         @NotNull
/*      */         private Iterator<? extends Map.Entry<K, V>> iterator = SequencesKt.iterator(new Function2<SequenceScope<? super Map.Entry<K, V>>, Continuation<? super Unit>, Object>(this, null) {
/*      */               Object L$1;
/*      */               Object L$2;
/*      */               Object L$3;
/*      */               int I$0;
/*      */               int I$1;
/*      */               int I$2;
/*      */               int I$3;
/*      */               long J$0;
/*      */               int label;
/*      */               
/*      */               @Nullable
/*      */               public final Object invokeSuspend(@NotNull Object $result) {
/*      */                 // Byte code:
/*      */                 //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */                 //   3: astore #22
/*      */                 //   5: aload_0
/*      */                 //   6: getfield label : I
/*      */                 //   9: tableswitch default -> 412, 0 -> 32, 1 -> 297
/*      */                 //   32: aload_1
/*      */                 //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */                 //   36: aload_0
/*      */                 //   37: getfield L$0 : Ljava/lang/Object;
/*      */                 //   40: checkcast kotlin/sequences/SequenceScope
/*      */                 //   43: astore_2
/*      */                 //   44: aload_0
/*      */                 //   45: getfield this$0 : Landroidx/collection/MutableScatterMap;
/*      */                 //   48: checkcast androidx/collection/ScatterMap
/*      */                 //   51: astore_3
/*      */                 //   52: aload_0
/*      */                 //   53: getfield this$1 : Landroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1;
/*      */                 //   56: astore #4
/*      */                 //   58: aload_0
/*      */                 //   59: getfield this$0 : Landroidx/collection/MutableScatterMap;
/*      */                 //   62: astore #5
/*      */                 //   64: iconst_0
/*      */                 //   65: istore #6
/*      */                 //   67: aload_3
/*      */                 //   68: getfield metadata : [J
/*      */                 //   71: astore #7
/*      */                 //   73: aload #7
/*      */                 //   75: arraylength
/*      */                 //   76: iconst_2
/*      */                 //   77: isub
/*      */                 //   78: istore #8
/*      */                 //   80: iconst_0
/*      */                 //   81: istore #9
/*      */                 //   83: iload #9
/*      */                 //   85: iload #8
/*      */                 //   87: if_icmpgt -> 407
/*      */                 //   90: aload #7
/*      */                 //   92: iload #9
/*      */                 //   94: laload
/*      */                 //   95: lstore #10
/*      */                 //   97: lload #10
/*      */                 //   99: lstore #12
/*      */                 //   101: iconst_0
/*      */                 //   102: istore #14
/*      */                 //   104: lload #12
/*      */                 //   106: lload #12
/*      */                 //   108: ldc2_w -1
/*      */                 //   111: lxor
/*      */                 //   112: bipush #7
/*      */                 //   114: lshl
/*      */                 //   115: land
/*      */                 //   116: ldc2_w -9187201950435737472
/*      */                 //   119: land
/*      */                 //   120: ldc2_w -9187201950435737472
/*      */                 //   123: lcmp
/*      */                 //   124: ifeq -> 394
/*      */                 //   127: bipush #8
/*      */                 //   129: iload #9
/*      */                 //   131: iload #8
/*      */                 //   133: isub
/*      */                 //   134: iconst_m1
/*      */                 //   135: ixor
/*      */                 //   136: bipush #31
/*      */                 //   138: iushr
/*      */                 //   139: isub
/*      */                 //   140: istore #15
/*      */                 //   142: iconst_0
/*      */                 //   143: istore #16
/*      */                 //   145: iload #16
/*      */                 //   147: iload #15
/*      */                 //   149: if_icmpge -> 387
/*      */                 //   152: lload #10
/*      */                 //   154: ldc2_w 255
/*      */                 //   157: land
/*      */                 //   158: lstore #17
/*      */                 //   160: iconst_0
/*      */                 //   161: istore #19
/*      */                 //   163: lload #17
/*      */                 //   165: ldc2_w 128
/*      */                 //   168: lcmp
/*      */                 //   169: ifge -> 176
/*      */                 //   172: iconst_1
/*      */                 //   173: goto -> 177
/*      */                 //   176: iconst_0
/*      */                 //   177: ifeq -> 374
/*      */                 //   180: iload #9
/*      */                 //   182: iconst_3
/*      */                 //   183: ishl
/*      */                 //   184: iload #16
/*      */                 //   186: iadd
/*      */                 //   187: istore #14
/*      */                 //   189: iload #14
/*      */                 //   191: istore #20
/*      */                 //   193: iconst_0
/*      */                 //   194: istore #21
/*      */                 //   196: aload #4
/*      */                 //   198: iload #20
/*      */                 //   200: invokevirtual setCurrent : (I)V
/*      */                 //   203: aload_2
/*      */                 //   204: new androidx/collection/MutableMapEntry
/*      */                 //   207: dup
/*      */                 //   208: aload #5
/*      */                 //   210: getfield keys : [Ljava/lang/Object;
/*      */                 //   213: aload #5
/*      */                 //   215: getfield values : [Ljava/lang/Object;
/*      */                 //   218: aload #4
/*      */                 //   220: invokevirtual getCurrent : ()I
/*      */                 //   223: invokespecial <init> : ([Ljava/lang/Object;[Ljava/lang/Object;I)V
/*      */                 //   226: aload_0
/*      */                 //   227: aload_0
/*      */                 //   228: aload_2
/*      */                 //   229: putfield L$0 : Ljava/lang/Object;
/*      */                 //   232: aload_0
/*      */                 //   233: aload #4
/*      */                 //   235: putfield L$1 : Ljava/lang/Object;
/*      */                 //   238: aload_0
/*      */                 //   239: aload #5
/*      */                 //   241: putfield L$2 : Ljava/lang/Object;
/*      */                 //   244: aload_0
/*      */                 //   245: aload #7
/*      */                 //   247: putfield L$3 : Ljava/lang/Object;
/*      */                 //   250: aload_0
/*      */                 //   251: iload #8
/*      */                 //   253: putfield I$0 : I
/*      */                 //   256: aload_0
/*      */                 //   257: iload #9
/*      */                 //   259: putfield I$1 : I
/*      */                 //   262: aload_0
/*      */                 //   263: lload #10
/*      */                 //   265: putfield J$0 : J
/*      */                 //   268: aload_0
/*      */                 //   269: iload #15
/*      */                 //   271: putfield I$2 : I
/*      */                 //   274: aload_0
/*      */                 //   275: iload #16
/*      */                 //   277: putfield I$3 : I
/*      */                 //   280: aload_0
/*      */                 //   281: iconst_1
/*      */                 //   282: putfield label : I
/*      */                 //   285: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */                 //   288: dup
/*      */                 //   289: aload #22
/*      */                 //   291: if_acmpne -> 373
/*      */                 //   294: aload #22
/*      */                 //   296: areturn
/*      */                 //   297: iconst_0
/*      */                 //   298: istore #6
/*      */                 //   300: iconst_0
/*      */                 //   301: istore #21
/*      */                 //   303: aload_0
/*      */                 //   304: getfield I$3 : I
/*      */                 //   307: istore #16
/*      */                 //   309: aload_0
/*      */                 //   310: getfield I$2 : I
/*      */                 //   313: istore #15
/*      */                 //   315: aload_0
/*      */                 //   316: getfield J$0 : J
/*      */                 //   319: lstore #10
/*      */                 //   321: aload_0
/*      */                 //   322: getfield I$1 : I
/*      */                 //   325: istore #9
/*      */                 //   327: aload_0
/*      */                 //   328: getfield I$0 : I
/*      */                 //   331: istore #8
/*      */                 //   333: aload_0
/*      */                 //   334: getfield L$3 : Ljava/lang/Object;
/*      */                 //   337: checkcast [J
/*      */                 //   340: astore #7
/*      */                 //   342: aload_0
/*      */                 //   343: getfield L$2 : Ljava/lang/Object;
/*      */                 //   346: checkcast androidx/collection/MutableScatterMap
/*      */                 //   349: astore #5
/*      */                 //   351: aload_0
/*      */                 //   352: getfield L$1 : Ljava/lang/Object;
/*      */                 //   355: checkcast androidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1
/*      */                 //   358: astore #4
/*      */                 //   360: aload_0
/*      */                 //   361: getfield L$0 : Ljava/lang/Object;
/*      */                 //   364: checkcast kotlin/sequences/SequenceScope
/*      */                 //   367: astore_2
/*      */                 //   368: aload_1
/*      */                 //   369: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */                 //   372: aload_1
/*      */                 //   373: pop
/*      */                 //   374: lload #10
/*      */                 //   376: bipush #8
/*      */                 //   378: lshr
/*      */                 //   379: lstore #10
/*      */                 //   381: iinc #16, 1
/*      */                 //   384: goto -> 145
/*      */                 //   387: iload #15
/*      */                 //   389: bipush #8
/*      */                 //   391: if_icmpne -> 408
/*      */                 //   394: iload #9
/*      */                 //   396: iload #8
/*      */                 //   398: if_icmpeq -> 407
/*      */                 //   401: iinc #9, 1
/*      */                 //   404: goto -> 90
/*      */                 //   407: nop
/*      */                 //   408: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */                 //   411: areturn
/*      */                 //   412: new java/lang/IllegalStateException
/*      */                 //   415: dup
/*      */                 //   416: ldc 'call to 'resume' before 'invoke' with coroutine'
/*      */                 //   418: invokespecial <init> : (Ljava/lang/String;)V
/*      */                 //   421: athrow
/*      */                 // Line number table:
/*      */                 //   Java source line number -> byte code offset
/*      */                 //   #1309	-> 3
/*      */                 //   #1310	-> 44
/*      */                 //   #1835	-> 67
/*      */                 //   #1836	-> 73
/*      */                 //   #1838	-> 80
/*      */                 //   #1839	-> 90
/*      */                 //   #1840	-> 97
/*      */                 //   #1841	-> 104
/*      */                 //   #1840	-> 120
/*      */                 //   #1842	-> 127
/*      */                 //   #1843	-> 142
/*      */                 //   #1844	-> 152
/*      */                 //   #1845	-> 163
/*      */                 //   #1844	-> 177
/*      */                 //   #1846	-> 180
/*      */                 //   #1847	-> 189
/*      */                 //   #1311	-> 196
/*      */                 //   #1312	-> 203
/*      */                 //   #1313	-> 204
/*      */                 //   #1314	-> 208
/*      */                 //   #1315	-> 213
/*      */                 //   #1316	-> 218
/*      */                 //   #1313	-> 223
/*      */                 //   #1312	-> 227
/*      */                 //   #1309	-> 294
/*      */                 //   #1319	-> 373
/*      */                 //   #1847	-> 374
/*      */                 //   #1849	-> 374
/*      */                 //   #1843	-> 381
/*      */                 //   #1851	-> 387
/*      */                 //   #1838	-> 394
/*      */                 //   #1854	-> 407
/*      */                 //   #1320	-> 408
/*      */                 //   #1309	-> 412
/*      */                 // Local variable table:
/*      */                 //   start	length	slot	name	descriptor
/*      */                 //   44	253	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */                 //   368	6	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */                 //   374	20	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */                 //   394	7	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */                 //   401	6	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */                 //   64	9	3	this_$iv	Landroidx/collection/ScatterMap;
/*      */                 //   73	224	7	m$iv	[J
/*      */                 //   342	32	7	m$iv	[J
/*      */                 //   374	20	7	m$iv	[J
/*      */                 //   394	7	7	m$iv	[J
/*      */                 //   401	6	7	m$iv	[J
/*      */                 //   80	217	8	lastIndex$iv	I
/*      */                 //   333	41	8	lastIndex$iv	I
/*      */                 //   374	20	8	lastIndex$iv	I
/*      */                 //   394	7	8	lastIndex$iv	I
/*      */                 //   401	6	8	lastIndex$iv	I
/*      */                 //   83	214	9	i$iv	I
/*      */                 //   327	47	9	i$iv	I
/*      */                 //   374	20	9	i$iv	I
/*      */                 //   394	13	9	i$iv	I
/*      */                 //   97	55	10	slot$iv	J
/*      */                 //   152	145	10	slot$iv	J
/*      */                 //   321	53	10	slot$iv	J
/*      */                 //   374	20	10	slot$iv	J
/*      */                 //   101	19	12	$this$maskEmptyOrDeleted$iv$iv	J
/*      */                 //   189	4	14	index$iv	I
/*      */                 //   142	155	15	bitCount$iv	I
/*      */                 //   315	59	15	bitCount$iv	I
/*      */                 //   374	20	15	bitCount$iv	I
/*      */                 //   145	7	16	j$iv	I
/*      */                 //   152	145	16	j$iv	I
/*      */                 //   309	65	16	j$iv	I
/*      */                 //   374	13	16	j$iv	I
/*      */                 //   160	16	17	value$iv$iv	J
/*      */                 //   193	10	20	index	I
/*      */                 //   196	101	21	$i$a$-forEachIndexed-MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1$1	I
/*      */                 //   104	16	14	$i$f$maskEmptyOrDeleted	I
/*      */                 //   163	14	19	$i$f$isFull	I
/*      */                 //   67	230	6	$i$f$forEachIndexed	I
/*      */                 //   36	376	0	this	Landroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1;
/*      */                 //   36	376	1	$result	Ljava/lang/Object;
/*      */                 //   303	71	21	$i$a$-forEachIndexed-MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1$1	I
/*      */                 //   300	108	6	$i$f$forEachIndexed	I
/*      */               }
/*      */               
/*      */               @NotNull
/*      */               public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*      */                 Function2<SequenceScope<? super Map.Entry<K, V>>, Continuation<? super Unit>, Object> function2 = new Function2<>(MutableScatterMap.this, MutableScatterMap$MutableMapWrapper$entries$1$iterator$1.this, $completion);
/*      */                 function2.L$0 = value;
/*      */                 return (Continuation)function2;
/*      */               }
/*      */               
/*      */               @Nullable
/*      */               public final Object invoke(@NotNull SequenceScope p1, @Nullable Continuation<?> p2) {
/*      */                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */               }
/*      */             });
/*      */         
/*      */         public boolean hasNext() {
/*      */           return this.iterator.hasNext();
/*      */         }
/*      */         
/*      */         @NotNull
/*      */         public Map.Entry<K, V> next() {
/*      */           return this.iterator.next();
/*      */         }
/*      */         
/*      */         public void remove() {
/*      */           if (this.current != -1) {
/*      */             MutableScatterMap.this.removeValueAt(this.current);
/*      */             this.current = -1;
/*      */           } 
/*      */         }
/*      */       }
/*      */       
/*      */       public void clear() {
/*      */         MutableScatterMap.this.clear();
/*      */       }
/*      */       
/*      */       public boolean containsAll(@NotNull Collection elements) {
/*      */         // Byte code:
/*      */         //   0: aload_1
/*      */         //   1: ldc 'elements'
/*      */         //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */         //   6: aload_1
/*      */         //   7: checkcast java/lang/Iterable
/*      */         //   10: astore_2
/*      */         //   11: aload_0
/*      */         //   12: getfield this$0 : Landroidx/collection/MutableScatterMap;
/*      */         //   15: astore_3
/*      */         //   16: iconst_0
/*      */         //   17: istore #4
/*      */         //   19: aload_2
/*      */         //   20: checkcast java/util/Collection
/*      */         //   23: invokeinterface isEmpty : ()Z
/*      */         //   28: ifeq -> 35
/*      */         //   31: iconst_1
/*      */         //   32: goto -> 101
/*      */         //   35: aload_2
/*      */         //   36: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */         //   41: astore #5
/*      */         //   43: aload #5
/*      */         //   45: invokeinterface hasNext : ()Z
/*      */         //   50: ifeq -> 100
/*      */         //   53: aload #5
/*      */         //   55: invokeinterface next : ()Ljava/lang/Object;
/*      */         //   60: astore #6
/*      */         //   62: aload #6
/*      */         //   64: checkcast java/util/Map$Entry
/*      */         //   67: astore #7
/*      */         //   69: iconst_0
/*      */         //   70: istore #8
/*      */         //   72: aload_3
/*      */         //   73: aload #7
/*      */         //   75: invokeinterface getKey : ()Ljava/lang/Object;
/*      */         //   80: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */         //   83: aload #7
/*      */         //   85: invokeinterface getValue : ()Ljava/lang/Object;
/*      */         //   90: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */         //   93: ifne -> 43
/*      */         //   96: iconst_0
/*      */         //   97: goto -> 101
/*      */         //   100: iconst_1
/*      */         //   101: ireturn
/*      */         // Line number table:
/*      */         //   Java source line number -> byte code offset
/*      */         //   #1342	-> 6
/*      */         //   #1835	-> 19
/*      */         //   #1836	-> 35
/*      */         //   #1342	-> 72
/*      */         //   #1836	-> 93
/*      */         //   #1837	-> 100
/*      */         //   #1342	-> 101
/*      */         // Local variable table:
/*      */         //   start	length	slot	name	descriptor
/*      */         //   72	21	8	$i$a$-all-MutableScatterMap$MutableMapWrapper$entries$1$containsAll$1	I
/*      */         //   69	24	7	it	Ljava/util/Map$Entry;
/*      */         //   62	38	6	element$iv	Ljava/lang/Object;
/*      */         //   19	82	4	$i$f$all	I
/*      */         //   16	85	2	$this$all$iv	Ljava/lang/Iterable;
/*      */         //   0	102	0	this	Landroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1;
/*      */         //   0	102	1	elements	Ljava/util/Collection;
/*      */       }
/*      */       
/*      */       public boolean contains(@NotNull Map.Entry element) {
/*      */         Intrinsics.checkNotNullParameter(element, "element");
/*      */         return Intrinsics.areEqual(MutableScatterMap.this.get((K)element.getKey()), element.getValue());
/*      */       }
/*      */       
/*      */       public boolean addAll(@NotNull Collection elements) {
/*      */         Intrinsics.checkNotNullParameter(elements, "elements");
/*      */         throw new UnsupportedOperationException();
/*      */       }
/*      */       
/*      */       public boolean add(@NotNull Map.Entry element) {
/*      */         Intrinsics.checkNotNullParameter(element, "element");
/*      */         throw new UnsupportedOperationException();
/*      */       }
/*      */       
/*      */       public boolean retainAll(@NotNull Collection elements) {
/*      */         Intrinsics.checkNotNullParameter(elements, "elements");
/*      */         boolean changed = false;
/*      */         MutableScatterMap<K, V> mutableScatterMap1 = MutableScatterMap.this, mutableScatterMap2 = MutableScatterMap.this;
/*      */         int $i$f$forEachIndexed = 0;
/*      */         long[] m$iv = mutableScatterMap1.metadata;
/*      */         int lastIndex$iv = m$iv.length - 2;
/*      */         int i$iv = 0;
/*      */         if (i$iv <= lastIndex$iv) {
/*      */           while (true) {
/*      */             long slot$iv = m$iv[i$iv];
/*      */             long $this$maskEmptyOrDeleted$iv$iv = slot$iv;
/*      */             int $i$f$maskEmptyOrDeleted = 0;
/*      */             if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/*      */               int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/*      */               for (int j$iv = 0;; j$iv++);
/*      */               if (bitCount$iv == 8)
/*      */                 continue; 
/*      */               break;
/*      */             } 
/*      */             continue;
/*      */             if (i$iv != lastIndex$iv) {
/*      */               i$iv++;
/*      */               continue;
/*      */             } 
/*      */             // Byte code: goto -> 285
/*      */           } 
/*      */         } else {
/*      */         
/*      */         } 
/*      */         return changed;
/*      */       }
/*      */       
/*      */       public boolean removeAll(@NotNull Collection elements) {
/*      */         Intrinsics.checkNotNullParameter(elements, "elements");
/*      */         boolean changed = false;
/*      */         MutableScatterMap<K, V> mutableScatterMap1 = MutableScatterMap.this, mutableScatterMap2 = MutableScatterMap.this;
/*      */         int $i$f$forEachIndexed = 0;
/*      */         long[] m$iv = mutableScatterMap1.metadata;
/*      */         int lastIndex$iv = m$iv.length - 2;
/*      */         int i$iv = 0;
/*      */         if (i$iv <= lastIndex$iv) {
/*      */           while (true) {
/*      */             long slot$iv = m$iv[i$iv];
/*      */             long $this$maskEmptyOrDeleted$iv$iv = slot$iv;
/*      */             int $i$f$maskEmptyOrDeleted = 0;
/*      */             if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/*      */               int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/*      */               for (int j$iv = 0;; j$iv++);
/*      */               if (bitCount$iv == 8)
/*      */                 continue; 
/*      */               break;
/*      */             } 
/*      */             continue;
/*      */             if (i$iv != lastIndex$iv) {
/*      */               i$iv++;
/*      */               continue;
/*      */             } 
/*      */             // Byte code: goto -> 274
/*      */           } 
/*      */         } else {
/*      */         
/*      */         } 
/*      */         return changed;
/*      */       }
/*      */       
/*      */       public boolean remove(@NotNull Map.Entry element) {
/*      */         // Byte code:
/*      */         //   0: aload_1
/*      */         //   1: ldc 'element'
/*      */         //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */         //   6: aload_0
/*      */         //   7: getfield this$0 : Landroidx/collection/MutableScatterMap;
/*      */         //   10: checkcast androidx/collection/ScatterMap
/*      */         //   13: astore_3
/*      */         //   14: aload_1
/*      */         //   15: invokeinterface getKey : ()Ljava/lang/Object;
/*      */         //   20: astore #4
/*      */         //   22: iconst_0
/*      */         //   23: istore #5
/*      */         //   25: iconst_0
/*      */         //   26: istore #6
/*      */         //   28: aload #4
/*      */         //   30: dup
/*      */         //   31: ifnull -> 40
/*      */         //   34: invokevirtual hashCode : ()I
/*      */         //   37: goto -> 42
/*      */         //   40: pop
/*      */         //   41: iconst_0
/*      */         //   42: ldc -862048943
/*      */         //   44: imul
/*      */         //   45: istore #7
/*      */         //   47: iload #7
/*      */         //   49: iload #7
/*      */         //   51: bipush #16
/*      */         //   53: ishl
/*      */         //   54: ixor
/*      */         //   55: istore #8
/*      */         //   57: iconst_0
/*      */         //   58: istore #7
/*      */         //   60: iload #8
/*      */         //   62: bipush #127
/*      */         //   64: iand
/*      */         //   65: istore #6
/*      */         //   67: aload_3
/*      */         //   68: getfield _capacity : I
/*      */         //   71: istore #7
/*      */         //   73: iconst_0
/*      */         //   74: istore #9
/*      */         //   76: iload #8
/*      */         //   78: bipush #7
/*      */         //   80: iushr
/*      */         //   81: iload #7
/*      */         //   83: iand
/*      */         //   84: istore #10
/*      */         //   86: iconst_0
/*      */         //   87: istore #9
/*      */         //   89: nop
/*      */         //   90: aload_3
/*      */         //   91: getfield metadata : [J
/*      */         //   94: astore #11
/*      */         //   96: iconst_0
/*      */         //   97: istore #12
/*      */         //   99: iload #10
/*      */         //   101: iconst_3
/*      */         //   102: ishr
/*      */         //   103: istore #13
/*      */         //   105: iload #10
/*      */         //   107: bipush #7
/*      */         //   109: iand
/*      */         //   110: iconst_3
/*      */         //   111: ishl
/*      */         //   112: istore #14
/*      */         //   114: aload #11
/*      */         //   116: iload #13
/*      */         //   118: laload
/*      */         //   119: iload #14
/*      */         //   121: lushr
/*      */         //   122: aload #11
/*      */         //   124: iload #13
/*      */         //   126: iconst_1
/*      */         //   127: iadd
/*      */         //   128: laload
/*      */         //   129: bipush #64
/*      */         //   131: iload #14
/*      */         //   133: isub
/*      */         //   134: lshl
/*      */         //   135: iload #14
/*      */         //   137: i2l
/*      */         //   138: lneg
/*      */         //   139: bipush #63
/*      */         //   141: lshr
/*      */         //   142: land
/*      */         //   143: lor
/*      */         //   144: lstore #15
/*      */         //   146: lload #15
/*      */         //   148: lstore #17
/*      */         //   150: iconst_0
/*      */         //   151: istore #19
/*      */         //   153: lload #17
/*      */         //   155: ldc2_w 72340172838076673
/*      */         //   158: iload #6
/*      */         //   160: i2l
/*      */         //   161: lmul
/*      */         //   162: lxor
/*      */         //   163: lstore #20
/*      */         //   165: lload #20
/*      */         //   167: ldc2_w 72340172838076673
/*      */         //   170: lsub
/*      */         //   171: lload #20
/*      */         //   173: ldc2_w -1
/*      */         //   176: lxor
/*      */         //   177: land
/*      */         //   178: ldc2_w -9187201950435737472
/*      */         //   181: land
/*      */         //   182: lstore #22
/*      */         //   184: lload #22
/*      */         //   186: lstore #17
/*      */         //   188: iconst_0
/*      */         //   189: istore #19
/*      */         //   191: lload #17
/*      */         //   193: lconst_0
/*      */         //   194: lcmp
/*      */         //   195: ifeq -> 202
/*      */         //   198: iconst_1
/*      */         //   199: goto -> 203
/*      */         //   202: iconst_0
/*      */         //   203: ifeq -> 275
/*      */         //   206: iload #10
/*      */         //   208: lload #22
/*      */         //   210: lstore #24
/*      */         //   212: iconst_0
/*      */         //   213: istore #26
/*      */         //   215: lload #24
/*      */         //   217: lstore #27
/*      */         //   219: iconst_0
/*      */         //   220: istore #29
/*      */         //   222: lload #27
/*      */         //   224: invokestatic numberOfTrailingZeros : (J)I
/*      */         //   227: iconst_3
/*      */         //   228: ishr
/*      */         //   229: nop
/*      */         //   230: iadd
/*      */         //   231: iload #7
/*      */         //   233: iand
/*      */         //   234: istore #13
/*      */         //   236: aload_3
/*      */         //   237: getfield keys : [Ljava/lang/Object;
/*      */         //   240: iload #13
/*      */         //   242: aaload
/*      */         //   243: aload #4
/*      */         //   245: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */         //   248: ifeq -> 256
/*      */         //   251: iload #13
/*      */         //   253: goto -> 324
/*      */         //   256: lload #22
/*      */         //   258: lstore #24
/*      */         //   260: iconst_0
/*      */         //   261: istore #26
/*      */         //   263: lload #24
/*      */         //   265: lload #24
/*      */         //   267: lconst_1
/*      */         //   268: lsub
/*      */         //   269: land
/*      */         //   270: lstore #22
/*      */         //   272: goto -> 184
/*      */         //   275: lload #15
/*      */         //   277: lstore #17
/*      */         //   279: iconst_0
/*      */         //   280: istore #19
/*      */         //   282: lload #17
/*      */         //   284: lload #17
/*      */         //   286: ldc2_w -1
/*      */         //   289: lxor
/*      */         //   290: bipush #6
/*      */         //   292: lshl
/*      */         //   293: land
/*      */         //   294: ldc2_w -9187201950435737472
/*      */         //   297: land
/*      */         //   298: lconst_0
/*      */         //   299: lcmp
/*      */         //   300: ifeq -> 306
/*      */         //   303: goto -> 323
/*      */         //   306: iinc #9, 8
/*      */         //   309: nop
/*      */         //   310: iload #10
/*      */         //   312: iload #9
/*      */         //   314: iadd
/*      */         //   315: iload #7
/*      */         //   317: iand
/*      */         //   318: istore #10
/*      */         //   320: goto -> 89
/*      */         //   323: iconst_m1
/*      */         //   324: istore_2
/*      */         //   325: iload_2
/*      */         //   326: iflt -> 361
/*      */         //   329: aload_0
/*      */         //   330: getfield this$0 : Landroidx/collection/MutableScatterMap;
/*      */         //   333: getfield values : [Ljava/lang/Object;
/*      */         //   336: iload_2
/*      */         //   337: aaload
/*      */         //   338: aload_1
/*      */         //   339: invokeinterface getValue : ()Ljava/lang/Object;
/*      */         //   344: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */         //   347: ifeq -> 361
/*      */         //   350: aload_0
/*      */         //   351: getfield this$0 : Landroidx/collection/MutableScatterMap;
/*      */         //   354: iload_2
/*      */         //   355: invokevirtual removeValueAt : (I)Ljava/lang/Object;
/*      */         //   358: pop
/*      */         //   359: iconst_1
/*      */         //   360: ireturn
/*      */         //   361: iconst_0
/*      */         //   362: ireturn
/*      */         // Line number table:
/*      */         //   Java source line number -> byte code offset
/*      */         //   #1397	-> 6
/*      */         //   #1878	-> 25
/*      */         //   #1879	-> 28
/*      */         //   #1879	-> 42
/*      */         //   #1881	-> 47
/*      */         //   #1878	-> 55
/*      */         //   #1882	-> 57
/*      */         //   #1883	-> 60
/*      */         //   #1882	-> 65
/*      */         //   #1884	-> 67
/*      */         //   #1885	-> 73
/*      */         //   #1886	-> 76
/*      */         //   #1885	-> 81
/*      */         //   #1887	-> 86
/*      */         //   #1889	-> 89
/*      */         //   #1890	-> 90
/*      */         //   #1891	-> 99
/*      */         //   #1892	-> 105
/*      */         //   #1893	-> 114
/*      */         //   #1890	-> 144
/*      */         //   #1894	-> 146
/*      */         //   #1895	-> 153
/*      */         //   #1897	-> 165
/*      */         //   #1894	-> 182
/*      */         //   #1898	-> 184
/*      */         //   #1899	-> 191
/*      */         //   #1900	-> 206
/*      */         //   #1901	-> 215
/*      */         //   #1902	-> 222
/*      */         //   #1902	-> 227
/*      */         //   #1901	-> 229
/*      */         //   #1900	-> 230
/*      */         //   #1903	-> 236
/*      */         //   #1904	-> 251
/*      */         //   #1906	-> 256
/*      */         //   #1907	-> 263
/*      */         //   #1906	-> 270
/*      */         //   #1908	-> 275
/*      */         //   #1909	-> 282
/*      */         //   #1908	-> 298
/*      */         //   #1910	-> 303
/*      */         //   #1913	-> 309
/*      */         //   #1914	-> 310
/*      */         //   #1917	-> 323
/*      */         //   #1397	-> 324
/*      */         //   #1398	-> 325
/*      */         //   #1399	-> 350
/*      */         //   #1400	-> 359
/*      */         //   #1402	-> 361
/*      */         // Local variable table:
/*      */         //   start	length	slot	name	descriptor
/*      */         //   28	27	6	$i$f$hash	I
/*      */         //   47	8	7	hash$iv$iv	I
/*      */         //   60	5	7	$i$f$h2	I
/*      */         //   76	5	9	$i$f$h1	I
/*      */         //   99	45	12	$i$f$group	I
/*      */         //   105	39	13	i$iv$iv	I
/*      */         //   114	30	14	b$iv$iv	I
/*      */         //   96	48	11	metadata$iv$iv	[J
/*      */         //   153	29	19	$i$f$match	I
/*      */         //   165	17	20	x$iv$iv	J
/*      */         //   150	32	17	$this$match$iv$iv	J
/*      */         //   191	12	19	$i$f$hasNext	I
/*      */         //   188	15	17	$this$hasNext$iv$iv	J
/*      */         //   222	7	29	$i$f$lowestBitSet	I
/*      */         //   219	10	27	$this$lowestBitSet$iv$iv$iv	J
/*      */         //   215	15	26	$i$f$get	I
/*      */         //   212	18	24	$this$get$iv$iv	J
/*      */         //   263	7	26	$i$f$next	I
/*      */         //   260	10	24	$this$next$iv$iv	J
/*      */         //   236	36	13	index$iv	I
/*      */         //   282	16	19	$i$f$maskEmpty	I
/*      */         //   279	19	17	$this$maskEmpty$iv$iv	J
/*      */         //   146	174	15	g$iv	J
/*      */         //   184	136	22	m$iv	J
/*      */         //   25	299	5	$i$f$findKeyIndex$collection	I
/*      */         //   57	267	8	hash$iv	I
/*      */         //   67	257	6	hash2$iv	I
/*      */         //   73	251	7	probeMask$iv	I
/*      */         //   86	238	10	probeOffset$iv	I
/*      */         //   89	235	9	probeIndex$iv	I
/*      */         //   22	302	3	this_$iv	Landroidx/collection/ScatterMap;
/*      */         //   22	302	4	key$iv	Ljava/lang/Object;
/*      */         //   325	38	2	index	I
/*      */         //   0	363	0	this	Landroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1;
/*      */         //   0	363	1	element	Ljava/util/Map$Entry;
/*      */       }
/*      */       
/*      */       public <T> T[] toArray(Object[] array) {
/*      */         Intrinsics.checkNotNullParameter(array, "array");
/*      */         return (T[])CollectionToArray.toArray(this, array);
/*      */       }
/*      */       
/*      */       public Object[] toArray() {
/*      */         return CollectionToArray.toArray(this);
/*      */       }
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public Set<K> getKeys() {
/*      */       return new MutableScatterMap$MutableMapWrapper$keys$1();
/*      */     }
/*      */     
/*      */     @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0001\n\000\n\002\020#\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\004\n\002\020\036\n\000\n\002\020\002\n\002\b\004\n\002\020)\n\002\b\004*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J\025\020\006\032\0020\0072\006\020\b\032\0028\000H\026¢\006\002\020\tJ\026\020\n\032\0020\0072\f\020\013\032\b\022\004\022\0028\0000\fH\026J\b\020\r\032\0020\016H\026J\026\020\017\032\0020\0072\006\020\b\032\0028\000H\002¢\006\002\020\tJ\026\020\020\032\0020\0072\f\020\013\032\b\022\004\022\0028\0000\fH\026J\b\020\021\032\0020\007H\026J\017\020\022\032\b\022\004\022\0028\0000\023H\002J\025\020\024\032\0020\0072\006\020\b\032\0028\000H\026¢\006\002\020\tJ\026\020\025\032\0020\0072\f\020\013\032\b\022\004\022\0028\0000\fH\026J\026\020\026\032\0020\0072\f\020\013\032\b\022\004\022\0028\0000\fH\026R\024\020\002\032\0020\0038VX\004¢\006\006\032\004\b\004\020\005¨\006\027"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$keys$1", "", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "", "clear", "", "contains", "containsAll", "isEmpty", "iterator", "", "remove", "removeAll", "retainAll", "collection"})
/*      */     @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n363#2,6:1855\n373#2,3:1862\n376#2,9:1866\n633#2:1875\n634#2:1879\n636#2,2:1881\n638#2,4:1884\n642#2:1891\n643#2:1895\n644#2:1897\n645#2,4:1900\n651#2:1905\n652#2,8:1907\n1810#3:1841\n1672#3:1845\n1810#3:1861\n1672#3:1865\n1589#3,3:1876\n1603#3:1880\n1599#3:1883\n1779#3,3:1888\n1793#3,3:1892\n1717#3:1896\n1705#3:1898\n1699#3:1899\n1712#3:1904\n1802#3:1906\n1726#4,3:1915\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1\n*L\n1450#1:1835,6\n1450#1:1842,3\n1450#1:1846,9\n1461#1:1855,6\n1461#1:1862,3\n1461#1:1866,9\n1471#1:1875\n1471#1:1879\n1471#1:1881,2\n1471#1:1884,4\n1471#1:1891\n1471#1:1895\n1471#1:1897\n1471#1:1900,4\n1471#1:1905\n1471#1:1907,8\n1450#1:1841\n1450#1:1845\n1461#1:1861\n1461#1:1865\n1471#1:1876,3\n1471#1:1880\n1471#1:1883\n1471#1:1888,3\n1471#1:1892,3\n1471#1:1896\n1471#1:1898\n1471#1:1899\n1471#1:1904\n1471#1:1906\n1480#1:1915,3\n*E\n"})
/*      */     public static final class MutableScatterMap$MutableMapWrapper$keys$1 implements Set<K>, KMutableSet {
/*      */       public int getSize() {
/*      */         return MutableScatterMap.this._size;
/*      */       }
/*      */       
/*      */       public boolean isEmpty() {
/*      */         return MutableScatterMap.this.isEmpty();
/*      */       }
/*      */       
/*      */       @NotNull
/*      */       public Iterator<K> iterator() {
/*      */         return new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1();
/*      */       }
/*      */       
/*      */       @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000%\n\000\n\002\020)\n\000\n\002\020\b\n\000\n\002\020(\n\000\n\002\020\013\n\002\b\003\n\002\020\002\n\000*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J\t\020\006\032\0020\007H\002J\016\020\b\032\0028\000H\002¢\006\002\020\tJ\b\020\n\032\0020\013H\026R\016\020\002\032\0020\003X\016¢\006\002\n\000R\024\020\004\032\b\022\004\022\0020\0030\005X\004¢\006\002\n\000¨\006\f"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$keys$1$iterator$1", "", "current", "", "iterator", "", "hasNext", "", "next", "()Ljava/lang/Object;", "remove", "", "collection"})
/*      */       public static final class MutableScatterMap$MutableMapWrapper$keys$1$iterator$1 implements Iterator<K>, KMutableIterator {
/*      */         @NotNull
/*      */         private final Iterator<Integer> iterator = SequencesKt.iterator(new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(null));
/*      */         
/*      */         @DebugMetadata(f = "ScatterMap.kt", l = {1415}, i = {0, 0, 0, 0, 0, 0, 0}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"}, n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, m = "invokeSuspend", c = "androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1")
/*      */         @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\020\b\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003*\b\022\004\022\0020\0050\004H@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""})
/*      */         @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n1810#3:1841\n1672#3:1845\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1\n*L\n1414#1:1835,6\n1414#1:1842,3\n1414#1:1846,9\n1414#1:1841\n1414#1:1845\n*E\n"})
/*      */         static final class MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {
/*      */           Object L$1;
/*      */           int I$0;
/*      */           int I$1;
/*      */           int I$2;
/*      */           int I$3;
/*      */           long J$0;
/*      */           int label;
/*      */           
/*      */           MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(Continuation $completion) {
/*      */             super(2, $completion);
/*      */           }
/*      */           
/*      */           @Nullable
/*      */           public final Object invokeSuspend(@NotNull Object $result) {
/*      */             // Byte code:
/*      */             //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */             //   3: astore #20
/*      */             //   5: aload_0
/*      */             //   6: getfield label : I
/*      */             //   9: tableswitch default -> 346, 0 -> 32, 1 -> 249
/*      */             //   32: aload_1
/*      */             //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */             //   36: aload_0
/*      */             //   37: getfield L$0 : Ljava/lang/Object;
/*      */             //   40: checkcast kotlin/sequences/SequenceScope
/*      */             //   43: astore_2
/*      */             //   44: aload_0
/*      */             //   45: getfield this$0 : Landroidx/collection/MutableScatterMap;
/*      */             //   48: checkcast androidx/collection/ScatterMap
/*      */             //   51: astore_3
/*      */             //   52: iconst_0
/*      */             //   53: istore #4
/*      */             //   55: aload_3
/*      */             //   56: getfield metadata : [J
/*      */             //   59: astore #5
/*      */             //   61: aload #5
/*      */             //   63: arraylength
/*      */             //   64: iconst_2
/*      */             //   65: isub
/*      */             //   66: istore #6
/*      */             //   68: iconst_0
/*      */             //   69: istore #7
/*      */             //   71: iload #7
/*      */             //   73: iload #6
/*      */             //   75: if_icmpgt -> 341
/*      */             //   78: aload #5
/*      */             //   80: iload #7
/*      */             //   82: laload
/*      */             //   83: lstore #8
/*      */             //   85: lload #8
/*      */             //   87: lstore #10
/*      */             //   89: iconst_0
/*      */             //   90: istore #12
/*      */             //   92: lload #10
/*      */             //   94: lload #10
/*      */             //   96: ldc2_w -1
/*      */             //   99: lxor
/*      */             //   100: bipush #7
/*      */             //   102: lshl
/*      */             //   103: land
/*      */             //   104: ldc2_w -9187201950435737472
/*      */             //   107: land
/*      */             //   108: ldc2_w -9187201950435737472
/*      */             //   111: lcmp
/*      */             //   112: ifeq -> 328
/*      */             //   115: bipush #8
/*      */             //   117: iload #7
/*      */             //   119: iload #6
/*      */             //   121: isub
/*      */             //   122: iconst_m1
/*      */             //   123: ixor
/*      */             //   124: bipush #31
/*      */             //   126: iushr
/*      */             //   127: isub
/*      */             //   128: istore #13
/*      */             //   130: iconst_0
/*      */             //   131: istore #14
/*      */             //   133: iload #14
/*      */             //   135: iload #13
/*      */             //   137: if_icmpge -> 321
/*      */             //   140: lload #8
/*      */             //   142: ldc2_w 255
/*      */             //   145: land
/*      */             //   146: lstore #15
/*      */             //   148: iconst_0
/*      */             //   149: istore #17
/*      */             //   151: lload #15
/*      */             //   153: ldc2_w 128
/*      */             //   156: lcmp
/*      */             //   157: ifge -> 164
/*      */             //   160: iconst_1
/*      */             //   161: goto -> 165
/*      */             //   164: iconst_0
/*      */             //   165: ifeq -> 308
/*      */             //   168: iload #7
/*      */             //   170: iconst_3
/*      */             //   171: ishl
/*      */             //   172: iload #14
/*      */             //   174: iadd
/*      */             //   175: istore #12
/*      */             //   177: iload #12
/*      */             //   179: istore #18
/*      */             //   181: iconst_0
/*      */             //   182: istore #19
/*      */             //   184: aload_2
/*      */             //   185: iload #18
/*      */             //   187: invokestatic boxInt : (I)Ljava/lang/Integer;
/*      */             //   190: aload_0
/*      */             //   191: aload_0
/*      */             //   192: aload_2
/*      */             //   193: putfield L$0 : Ljava/lang/Object;
/*      */             //   196: aload_0
/*      */             //   197: aload #5
/*      */             //   199: putfield L$1 : Ljava/lang/Object;
/*      */             //   202: aload_0
/*      */             //   203: iload #6
/*      */             //   205: putfield I$0 : I
/*      */             //   208: aload_0
/*      */             //   209: iload #7
/*      */             //   211: putfield I$1 : I
/*      */             //   214: aload_0
/*      */             //   215: lload #8
/*      */             //   217: putfield J$0 : J
/*      */             //   220: aload_0
/*      */             //   221: iload #13
/*      */             //   223: putfield I$2 : I
/*      */             //   226: aload_0
/*      */             //   227: iload #14
/*      */             //   229: putfield I$3 : I
/*      */             //   232: aload_0
/*      */             //   233: iconst_1
/*      */             //   234: putfield label : I
/*      */             //   237: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */             //   240: dup
/*      */             //   241: aload #20
/*      */             //   243: if_acmpne -> 307
/*      */             //   246: aload #20
/*      */             //   248: areturn
/*      */             //   249: iconst_0
/*      */             //   250: istore #4
/*      */             //   252: iconst_0
/*      */             //   253: istore #19
/*      */             //   255: aload_0
/*      */             //   256: getfield I$3 : I
/*      */             //   259: istore #14
/*      */             //   261: aload_0
/*      */             //   262: getfield I$2 : I
/*      */             //   265: istore #13
/*      */             //   267: aload_0
/*      */             //   268: getfield J$0 : J
/*      */             //   271: lstore #8
/*      */             //   273: aload_0
/*      */             //   274: getfield I$1 : I
/*      */             //   277: istore #7
/*      */             //   279: aload_0
/*      */             //   280: getfield I$0 : I
/*      */             //   283: istore #6
/*      */             //   285: aload_0
/*      */             //   286: getfield L$1 : Ljava/lang/Object;
/*      */             //   289: checkcast [J
/*      */             //   292: astore #5
/*      */             //   294: aload_0
/*      */             //   295: getfield L$0 : Ljava/lang/Object;
/*      */             //   298: checkcast kotlin/sequences/SequenceScope
/*      */             //   301: astore_2
/*      */             //   302: aload_1
/*      */             //   303: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */             //   306: aload_1
/*      */             //   307: pop
/*      */             //   308: lload #8
/*      */             //   310: bipush #8
/*      */             //   312: lshr
/*      */             //   313: lstore #8
/*      */             //   315: iinc #14, 1
/*      */             //   318: goto -> 133
/*      */             //   321: iload #13
/*      */             //   323: bipush #8
/*      */             //   325: if_icmpne -> 342
/*      */             //   328: iload #7
/*      */             //   330: iload #6
/*      */             //   332: if_icmpeq -> 341
/*      */             //   335: iinc #7, 1
/*      */             //   338: goto -> 78
/*      */             //   341: nop
/*      */             //   342: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */             //   345: areturn
/*      */             //   346: new java/lang/IllegalStateException
/*      */             //   349: dup
/*      */             //   350: ldc 'call to 'resume' before 'invoke' with coroutine'
/*      */             //   352: invokespecial <init> : (Ljava/lang/String;)V
/*      */             //   355: athrow
/*      */             // Line number table:
/*      */             //   Java source line number -> byte code offset
/*      */             //   #1413	-> 3
/*      */             //   #1414	-> 44
/*      */             //   #1835	-> 55
/*      */             //   #1836	-> 61
/*      */             //   #1838	-> 68
/*      */             //   #1839	-> 78
/*      */             //   #1840	-> 85
/*      */             //   #1841	-> 92
/*      */             //   #1840	-> 108
/*      */             //   #1842	-> 115
/*      */             //   #1843	-> 130
/*      */             //   #1844	-> 140
/*      */             //   #1845	-> 151
/*      */             //   #1844	-> 165
/*      */             //   #1846	-> 168
/*      */             //   #1847	-> 177
/*      */             //   #1415	-> 184
/*      */             //   #1413	-> 246
/*      */             //   #1416	-> 307
/*      */             //   #1847	-> 308
/*      */             //   #1849	-> 308
/*      */             //   #1843	-> 315
/*      */             //   #1851	-> 321
/*      */             //   #1838	-> 328
/*      */             //   #1854	-> 341
/*      */             //   #1417	-> 342
/*      */             //   #1413	-> 346
/*      */             // Local variable table:
/*      */             //   start	length	slot	name	descriptor
/*      */             //   44	205	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */             //   302	6	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */             //   308	20	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */             //   328	7	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */             //   335	6	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */             //   52	9	3	this_$iv	Landroidx/collection/ScatterMap;
/*      */             //   61	188	5	m$iv	[J
/*      */             //   294	14	5	m$iv	[J
/*      */             //   308	20	5	m$iv	[J
/*      */             //   328	7	5	m$iv	[J
/*      */             //   335	6	5	m$iv	[J
/*      */             //   68	181	6	lastIndex$iv	I
/*      */             //   285	23	6	lastIndex$iv	I
/*      */             //   308	20	6	lastIndex$iv	I
/*      */             //   328	7	6	lastIndex$iv	I
/*      */             //   335	6	6	lastIndex$iv	I
/*      */             //   71	178	7	i$iv	I
/*      */             //   279	29	7	i$iv	I
/*      */             //   308	20	7	i$iv	I
/*      */             //   328	13	7	i$iv	I
/*      */             //   85	55	8	slot$iv	J
/*      */             //   140	109	8	slot$iv	J
/*      */             //   273	35	8	slot$iv	J
/*      */             //   308	20	8	slot$iv	J
/*      */             //   89	19	10	$this$maskEmptyOrDeleted$iv$iv	J
/*      */             //   177	4	12	index$iv	I
/*      */             //   130	119	13	bitCount$iv	I
/*      */             //   267	41	13	bitCount$iv	I
/*      */             //   308	20	13	bitCount$iv	I
/*      */             //   133	7	14	j$iv	I
/*      */             //   140	109	14	j$iv	I
/*      */             //   261	47	14	j$iv	I
/*      */             //   308	13	14	j$iv	I
/*      */             //   148	16	15	value$iv$iv	J
/*      */             //   181	59	18	index	I
/*      */             //   184	65	19	$i$a$-forEachIndexed-MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1$1	I
/*      */             //   92	16	12	$i$f$maskEmptyOrDeleted	I
/*      */             //   151	14	17	$i$f$isFull	I
/*      */             //   55	194	4	$i$f$forEachIndexed	I
/*      */             //   36	310	0	this	Landroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1;
/*      */             //   36	310	1	$result	Ljava/lang/Object;
/*      */             //   255	53	19	$i$a$-forEachIndexed-MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1$1	I
/*      */             //   252	90	4	$i$f$forEachIndexed	I
/*      */           }
/*      */           
/*      */           @NotNull
/*      */           public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1> $completion) {
/*      */             MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 = new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1($completion);
/*      */             mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1.L$0 = value;
/*      */             return (Continuation<Unit>)mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1;
/*      */           }
/*      */           
/*      */           @Nullable
/*      */           public final Object invoke(@NotNull SequenceScope p1, @Nullable Continuation<?> p2) {
/*      */             return ((MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */           }
/*      */         }
/*      */         private int current = -1;
/*      */         
/*      */         public boolean hasNext() {
/*      */           return this.iterator.hasNext();
/*      */         }
/*      */         
/*      */         public K next() {
/*      */           this.current = ((Number)this.iterator.next()).intValue();
/*      */           return (K)MutableScatterMap.this.keys[this.current];
/*      */         }
/*      */         
/*      */         public void remove() {
/*      */           if (this.current >= 0) {
/*      */             MutableScatterMap.this.removeValueAt(this.current);
/*      */             this.current = -1;
/*      */           } 
/*      */         }
/*      */       }
/*      */       
/*      */       public void clear() {
/*      */         MutableScatterMap.this.clear();
/*      */       }
/*      */       
/*      */       public boolean addAll(@NotNull Collection elements) {
/*      */         Intrinsics.checkNotNullParameter(elements, "elements");
/*      */         throw new UnsupportedOperationException();
/*      */       }
/*      */       
/*      */       public boolean add(Object element) {
/*      */         throw new UnsupportedOperationException();
/*      */       }
/*      */       
/*      */       public boolean retainAll(@NotNull Collection elements) {
/*      */         Intrinsics.checkNotNullParameter(elements, "elements");
/*      */         boolean changed = false;
/*      */         MutableScatterMap<K, V> mutableScatterMap1 = MutableScatterMap.this, mutableScatterMap2 = MutableScatterMap.this;
/*      */         int $i$f$forEachIndexed = 0;
/*      */         long[] m$iv = mutableScatterMap1.metadata;
/*      */         int lastIndex$iv = m$iv.length - 2;
/*      */         int i$iv = 0;
/*      */         if (i$iv <= lastIndex$iv) {
/*      */           while (true) {
/*      */             long slot$iv = m$iv[i$iv];
/*      */             long $this$maskEmptyOrDeleted$iv$iv = slot$iv;
/*      */             int $i$f$maskEmptyOrDeleted = 0;
/*      */             if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/*      */               int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/*      */               for (int j$iv = 0;; j$iv++);
/*      */               if (bitCount$iv == 8)
/*      */                 continue; 
/*      */               break;
/*      */             } 
/*      */             continue;
/*      */             if (i$iv != lastIndex$iv) {
/*      */               i$iv++;
/*      */               continue;
/*      */             } 
/*      */             // Byte code: goto -> 217
/*      */           } 
/*      */         } else {
/*      */         
/*      */         } 
/*      */         return changed;
/*      */       }
/*      */       
/*      */       public boolean removeAll(@NotNull Collection elements) {
/*      */         Intrinsics.checkNotNullParameter(elements, "elements");
/*      */         boolean changed = false;
/*      */         MutableScatterMap<K, V> mutableScatterMap1 = MutableScatterMap.this, mutableScatterMap2 = MutableScatterMap.this;
/*      */         int $i$f$forEachIndexed = 0;
/*      */         long[] m$iv = mutableScatterMap1.metadata;
/*      */         int lastIndex$iv = m$iv.length - 2;
/*      */         int i$iv = 0;
/*      */         if (i$iv <= lastIndex$iv) {
/*      */           while (true) {
/*      */             long slot$iv = m$iv[i$iv];
/*      */             long $this$maskEmptyOrDeleted$iv$iv = slot$iv;
/*      */             int $i$f$maskEmptyOrDeleted = 0;
/*      */             if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/*      */               int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/*      */               for (int j$iv = 0;; j$iv++);
/*      */               if (bitCount$iv == 8)
/*      */                 continue; 
/*      */               break;
/*      */             } 
/*      */             continue;
/*      */             if (i$iv != lastIndex$iv) {
/*      */               i$iv++;
/*      */               continue;
/*      */             } 
/*      */             // Byte code: goto -> 217
/*      */           } 
/*      */         } else {
/*      */         
/*      */         } 
/*      */         return changed;
/*      */       }
/*      */       
/*      */       public boolean remove(Object element) {
/*      */         // Byte code:
/*      */         //   0: aload_0
/*      */         //   1: getfield this$0 : Landroidx/collection/MutableScatterMap;
/*      */         //   4: checkcast androidx/collection/ScatterMap
/*      */         //   7: astore_3
/*      */         //   8: iconst_0
/*      */         //   9: istore #4
/*      */         //   11: iconst_0
/*      */         //   12: istore #5
/*      */         //   14: aload_1
/*      */         //   15: dup
/*      */         //   16: ifnull -> 25
/*      */         //   19: invokevirtual hashCode : ()I
/*      */         //   22: goto -> 27
/*      */         //   25: pop
/*      */         //   26: iconst_0
/*      */         //   27: ldc -862048943
/*      */         //   29: imul
/*      */         //   30: istore #6
/*      */         //   32: iload #6
/*      */         //   34: iload #6
/*      */         //   36: bipush #16
/*      */         //   38: ishl
/*      */         //   39: ixor
/*      */         //   40: istore #7
/*      */         //   42: iconst_0
/*      */         //   43: istore #6
/*      */         //   45: iload #7
/*      */         //   47: bipush #127
/*      */         //   49: iand
/*      */         //   50: istore #5
/*      */         //   52: aload_3
/*      */         //   53: getfield _capacity : I
/*      */         //   56: istore #6
/*      */         //   58: iconst_0
/*      */         //   59: istore #8
/*      */         //   61: iload #7
/*      */         //   63: bipush #7
/*      */         //   65: iushr
/*      */         //   66: iload #6
/*      */         //   68: iand
/*      */         //   69: istore #9
/*      */         //   71: iconst_0
/*      */         //   72: istore #8
/*      */         //   74: nop
/*      */         //   75: aload_3
/*      */         //   76: getfield metadata : [J
/*      */         //   79: astore #10
/*      */         //   81: iconst_0
/*      */         //   82: istore #11
/*      */         //   84: iload #9
/*      */         //   86: iconst_3
/*      */         //   87: ishr
/*      */         //   88: istore #12
/*      */         //   90: iload #9
/*      */         //   92: bipush #7
/*      */         //   94: iand
/*      */         //   95: iconst_3
/*      */         //   96: ishl
/*      */         //   97: istore #13
/*      */         //   99: aload #10
/*      */         //   101: iload #12
/*      */         //   103: laload
/*      */         //   104: iload #13
/*      */         //   106: lushr
/*      */         //   107: aload #10
/*      */         //   109: iload #12
/*      */         //   111: iconst_1
/*      */         //   112: iadd
/*      */         //   113: laload
/*      */         //   114: bipush #64
/*      */         //   116: iload #13
/*      */         //   118: isub
/*      */         //   119: lshl
/*      */         //   120: iload #13
/*      */         //   122: i2l
/*      */         //   123: lneg
/*      */         //   124: bipush #63
/*      */         //   126: lshr
/*      */         //   127: land
/*      */         //   128: lor
/*      */         //   129: lstore #14
/*      */         //   131: lload #14
/*      */         //   133: lstore #16
/*      */         //   135: iconst_0
/*      */         //   136: istore #18
/*      */         //   138: lload #16
/*      */         //   140: ldc2_w 72340172838076673
/*      */         //   143: iload #5
/*      */         //   145: i2l
/*      */         //   146: lmul
/*      */         //   147: lxor
/*      */         //   148: lstore #19
/*      */         //   150: lload #19
/*      */         //   152: ldc2_w 72340172838076673
/*      */         //   155: lsub
/*      */         //   156: lload #19
/*      */         //   158: ldc2_w -1
/*      */         //   161: lxor
/*      */         //   162: land
/*      */         //   163: ldc2_w -9187201950435737472
/*      */         //   166: land
/*      */         //   167: lstore #21
/*      */         //   169: lload #21
/*      */         //   171: lstore #16
/*      */         //   173: iconst_0
/*      */         //   174: istore #18
/*      */         //   176: lload #16
/*      */         //   178: lconst_0
/*      */         //   179: lcmp
/*      */         //   180: ifeq -> 187
/*      */         //   183: iconst_1
/*      */         //   184: goto -> 188
/*      */         //   187: iconst_0
/*      */         //   188: ifeq -> 259
/*      */         //   191: iload #9
/*      */         //   193: lload #21
/*      */         //   195: lstore #23
/*      */         //   197: iconst_0
/*      */         //   198: istore #25
/*      */         //   200: lload #23
/*      */         //   202: lstore #26
/*      */         //   204: iconst_0
/*      */         //   205: istore #28
/*      */         //   207: lload #26
/*      */         //   209: invokestatic numberOfTrailingZeros : (J)I
/*      */         //   212: iconst_3
/*      */         //   213: ishr
/*      */         //   214: nop
/*      */         //   215: iadd
/*      */         //   216: iload #6
/*      */         //   218: iand
/*      */         //   219: istore #12
/*      */         //   221: aload_3
/*      */         //   222: getfield keys : [Ljava/lang/Object;
/*      */         //   225: iload #12
/*      */         //   227: aaload
/*      */         //   228: aload_1
/*      */         //   229: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */         //   232: ifeq -> 240
/*      */         //   235: iload #12
/*      */         //   237: goto -> 308
/*      */         //   240: lload #21
/*      */         //   242: lstore #23
/*      */         //   244: iconst_0
/*      */         //   245: istore #25
/*      */         //   247: lload #23
/*      */         //   249: lload #23
/*      */         //   251: lconst_1
/*      */         //   252: lsub
/*      */         //   253: land
/*      */         //   254: lstore #21
/*      */         //   256: goto -> 169
/*      */         //   259: lload #14
/*      */         //   261: lstore #16
/*      */         //   263: iconst_0
/*      */         //   264: istore #18
/*      */         //   266: lload #16
/*      */         //   268: lload #16
/*      */         //   270: ldc2_w -1
/*      */         //   273: lxor
/*      */         //   274: bipush #6
/*      */         //   276: lshl
/*      */         //   277: land
/*      */         //   278: ldc2_w -9187201950435737472
/*      */         //   281: land
/*      */         //   282: lconst_0
/*      */         //   283: lcmp
/*      */         //   284: ifeq -> 290
/*      */         //   287: goto -> 307
/*      */         //   290: iinc #8, 8
/*      */         //   293: nop
/*      */         //   294: iload #9
/*      */         //   296: iload #8
/*      */         //   298: iadd
/*      */         //   299: iload #6
/*      */         //   301: iand
/*      */         //   302: istore #9
/*      */         //   304: goto -> 74
/*      */         //   307: iconst_m1
/*      */         //   308: istore_2
/*      */         //   309: iload_2
/*      */         //   310: iflt -> 324
/*      */         //   313: aload_0
/*      */         //   314: getfield this$0 : Landroidx/collection/MutableScatterMap;
/*      */         //   317: iload_2
/*      */         //   318: invokevirtual removeValueAt : (I)Ljava/lang/Object;
/*      */         //   321: pop
/*      */         //   322: iconst_1
/*      */         //   323: ireturn
/*      */         //   324: iconst_0
/*      */         //   325: ireturn
/*      */         // Line number table:
/*      */         //   Java source line number -> byte code offset
/*      */         //   #1471	-> 0
/*      */         //   #1875	-> 11
/*      */         //   #1876	-> 14
/*      */         //   #1876	-> 27
/*      */         //   #1878	-> 32
/*      */         //   #1875	-> 40
/*      */         //   #1879	-> 42
/*      */         //   #1880	-> 45
/*      */         //   #1879	-> 50
/*      */         //   #1881	-> 52
/*      */         //   #1882	-> 58
/*      */         //   #1883	-> 61
/*      */         //   #1882	-> 66
/*      */         //   #1884	-> 71
/*      */         //   #1886	-> 74
/*      */         //   #1887	-> 75
/*      */         //   #1888	-> 84
/*      */         //   #1889	-> 90
/*      */         //   #1890	-> 99
/*      */         //   #1887	-> 129
/*      */         //   #1891	-> 131
/*      */         //   #1892	-> 138
/*      */         //   #1894	-> 150
/*      */         //   #1891	-> 167
/*      */         //   #1895	-> 169
/*      */         //   #1896	-> 176
/*      */         //   #1897	-> 191
/*      */         //   #1898	-> 200
/*      */         //   #1899	-> 207
/*      */         //   #1899	-> 212
/*      */         //   #1898	-> 214
/*      */         //   #1897	-> 215
/*      */         //   #1900	-> 221
/*      */         //   #1901	-> 235
/*      */         //   #1903	-> 240
/*      */         //   #1904	-> 247
/*      */         //   #1903	-> 254
/*      */         //   #1905	-> 259
/*      */         //   #1906	-> 266
/*      */         //   #1905	-> 282
/*      */         //   #1907	-> 287
/*      */         //   #1910	-> 293
/*      */         //   #1911	-> 294
/*      */         //   #1914	-> 307
/*      */         //   #1471	-> 308
/*      */         //   #1472	-> 309
/*      */         //   #1473	-> 313
/*      */         //   #1474	-> 322
/*      */         //   #1476	-> 324
/*      */         // Local variable table:
/*      */         //   start	length	slot	name	descriptor
/*      */         //   14	26	5	$i$f$hash	I
/*      */         //   32	8	6	hash$iv$iv	I
/*      */         //   45	5	6	$i$f$h2	I
/*      */         //   61	5	8	$i$f$h1	I
/*      */         //   84	45	11	$i$f$group	I
/*      */         //   90	39	12	i$iv$iv	I
/*      */         //   99	30	13	b$iv$iv	I
/*      */         //   81	48	10	metadata$iv$iv	[J
/*      */         //   138	29	18	$i$f$match	I
/*      */         //   150	17	19	x$iv$iv	J
/*      */         //   135	32	16	$this$match$iv$iv	J
/*      */         //   176	12	18	$i$f$hasNext	I
/*      */         //   173	15	16	$this$hasNext$iv$iv	J
/*      */         //   207	7	28	$i$f$lowestBitSet	I
/*      */         //   204	10	26	$this$lowestBitSet$iv$iv$iv	J
/*      */         //   200	15	25	$i$f$get	I
/*      */         //   197	18	23	$this$get$iv$iv	J
/*      */         //   247	7	25	$i$f$next	I
/*      */         //   244	10	23	$this$next$iv$iv	J
/*      */         //   221	35	12	index$iv	I
/*      */         //   266	16	18	$i$f$maskEmpty	I
/*      */         //   263	19	16	$this$maskEmpty$iv$iv	J
/*      */         //   131	173	14	g$iv	J
/*      */         //   169	135	21	m$iv	J
/*      */         //   11	297	4	$i$f$findKeyIndex$collection	I
/*      */         //   42	266	7	hash$iv	I
/*      */         //   52	256	5	hash2$iv	I
/*      */         //   58	250	6	probeMask$iv	I
/*      */         //   71	237	9	probeOffset$iv	I
/*      */         //   74	234	8	probeIndex$iv	I
/*      */         //   8	300	3	this_$iv	Landroidx/collection/ScatterMap;
/*      */         //   309	17	2	index	I
/*      */         //   0	326	0	this	Landroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1;
/*      */         //   0	326	1	element	Ljava/lang/Object;
/*      */       }
/*      */       
/*      */       public boolean containsAll(@NotNull Collection elements) {
/*      */         // Byte code:
/*      */         //   0: aload_1
/*      */         //   1: ldc 'elements'
/*      */         //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */         //   6: aload_1
/*      */         //   7: checkcast java/lang/Iterable
/*      */         //   10: astore_2
/*      */         //   11: aload_0
/*      */         //   12: getfield this$0 : Landroidx/collection/MutableScatterMap;
/*      */         //   15: astore_3
/*      */         //   16: iconst_0
/*      */         //   17: istore #4
/*      */         //   19: aload_2
/*      */         //   20: checkcast java/util/Collection
/*      */         //   23: invokeinterface isEmpty : ()Z
/*      */         //   28: ifeq -> 35
/*      */         //   31: iconst_1
/*      */         //   32: goto -> 83
/*      */         //   35: aload_2
/*      */         //   36: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */         //   41: astore #5
/*      */         //   43: aload #5
/*      */         //   45: invokeinterface hasNext : ()Z
/*      */         //   50: ifeq -> 82
/*      */         //   53: aload #5
/*      */         //   55: invokeinterface next : ()Ljava/lang/Object;
/*      */         //   60: astore #6
/*      */         //   62: aload #6
/*      */         //   64: astore #7
/*      */         //   66: iconst_0
/*      */         //   67: istore #8
/*      */         //   69: aload_3
/*      */         //   70: aload #7
/*      */         //   72: invokevirtual containsKey : (Ljava/lang/Object;)Z
/*      */         //   75: ifne -> 43
/*      */         //   78: iconst_0
/*      */         //   79: goto -> 83
/*      */         //   82: iconst_1
/*      */         //   83: ireturn
/*      */         // Line number table:
/*      */         //   Java source line number -> byte code offset
/*      */         //   #1480	-> 6
/*      */         //   #1915	-> 19
/*      */         //   #1916	-> 35
/*      */         //   #1480	-> 69
/*      */         //   #1916	-> 75
/*      */         //   #1917	-> 82
/*      */         //   #1480	-> 83
/*      */         // Local variable table:
/*      */         //   start	length	slot	name	descriptor
/*      */         //   69	6	8	$i$a$-all-MutableScatterMap$MutableMapWrapper$keys$1$containsAll$1	I
/*      */         //   66	9	7	it	Ljava/lang/Object;
/*      */         //   62	20	6	element$iv	Ljava/lang/Object;
/*      */         //   19	64	4	$i$f$all	I
/*      */         //   16	67	2	$this$all$iv	Ljava/lang/Iterable;
/*      */         //   0	84	0	this	Landroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1;
/*      */         //   0	84	1	elements	Ljava/util/Collection;
/*      */       }
/*      */       
/*      */       public boolean contains(Object element) {
/*      */         return MutableScatterMap.this.containsKey((K)element);
/*      */       }
/*      */       
/*      */       public <T> T[] toArray(Object[] array) {
/*      */         Intrinsics.checkNotNullParameter(array, "array");
/*      */         return (T[])CollectionToArray.toArray(this, array);
/*      */       }
/*      */       
/*      */       public Object[] toArray() {
/*      */         return CollectionToArray.toArray(this);
/*      */       }
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public Collection<V> getValues() {
/*      */       return new MutableScatterMap$MutableMapWrapper$values$1();
/*      */     }
/*      */     
/*      */     @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0001\n\000\n\002\020\037\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\004\n\002\020\036\n\000\n\002\020\002\n\002\b\004\n\002\020)\n\002\b\004*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J\025\020\006\032\0020\0072\006\020\b\032\0028\000H\026¢\006\002\020\tJ\026\020\n\032\0020\0072\f\020\013\032\b\022\004\022\0028\0000\fH\026J\b\020\r\032\0020\016H\026J\026\020\017\032\0020\0072\006\020\b\032\0028\000H\002¢\006\002\020\tJ\026\020\020\032\0020\0072\f\020\013\032\b\022\004\022\0028\0000\fH\026J\b\020\021\032\0020\007H\026J\017\020\022\032\b\022\004\022\0028\0000\023H\002J\025\020\024\032\0020\0072\006\020\b\032\0028\000H\026¢\006\002\020\tJ\026\020\025\032\0020\0072\f\020\013\032\b\022\004\022\0028\0000\fH\026J\026\020\026\032\0020\0072\f\020\013\032\b\022\004\022\0028\0000\fH\026R\024\020\002\032\0020\0038VX\004¢\006\006\032\004\b\004\020\005¨\006\027"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$values$1", "", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "", "clear", "", "contains", "containsAll", "isEmpty", "iterator", "", "remove", "removeAll", "retainAll", "collection"})
/*      */     @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n363#2,6:1855\n373#2,3:1862\n376#2,9:1866\n363#2,6:1875\n373#2,3:1882\n376#2,9:1886\n1810#3:1841\n1672#3:1845\n1810#3:1861\n1672#3:1865\n1810#3:1881\n1672#3:1885\n1726#4,3:1895\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1\n*L\n1530#1:1835,6\n1530#1:1842,3\n1530#1:1846,9\n1541#1:1855,6\n1541#1:1862,3\n1541#1:1866,9\n1551#1:1875,6\n1551#1:1882,3\n1551#1:1886,9\n1530#1:1841\n1530#1:1845\n1541#1:1861\n1541#1:1865\n1551#1:1881\n1551#1:1885\n1561#1:1895,3\n*E\n"})
/*      */     public static final class MutableScatterMap$MutableMapWrapper$values$1 implements Collection<V>, KMutableCollection {
/*      */       public int getSize() {
/*      */         return MutableScatterMap.this._size;
/*      */       }
/*      */       
/*      */       public boolean isEmpty() {
/*      */         return MutableScatterMap.this.isEmpty();
/*      */       }
/*      */       
/*      */       @NotNull
/*      */       public Iterator<V> iterator() {
/*      */         return new MutableScatterMap$MutableMapWrapper$values$1$iterator$1();
/*      */       }
/*      */       
/*      */       @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000%\n\000\n\002\020)\n\000\n\002\020\b\n\000\n\002\020(\n\000\n\002\020\013\n\002\b\003\n\002\020\002\n\000*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J\t\020\006\032\0020\007H\002J\016\020\b\032\0028\000H\002¢\006\002\020\tJ\b\020\n\032\0020\013H\026R\016\020\002\032\0020\003X\016¢\006\002\n\000R\024\020\004\032\b\022\004\022\0020\0030\005X\004¢\006\002\n\000¨\006\f"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1", "", "current", "", "iterator", "", "hasNext", "", "next", "()Ljava/lang/Object;", "remove", "", "collection"})
/*      */       public static final class MutableScatterMap$MutableMapWrapper$values$1$iterator$1 implements Iterator<V>, KMutableIterator {
/*      */         @NotNull
/*      */         private final Iterator<Integer> iterator = SequencesKt.iterator(new MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1(null));
/*      */         
/*      */         @DebugMetadata(f = "ScatterMap.kt", l = {1495}, i = {0, 0, 0, 0, 0, 0, 0}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"}, n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, m = "invokeSuspend", c = "androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1")
/*      */         @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\020\b\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003*\b\022\004\022\0020\0050\004H@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""})
/*      */         @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n1810#3:1841\n1672#3:1845\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1\n*L\n1494#1:1835,6\n1494#1:1842,3\n1494#1:1846,9\n1494#1:1841\n1494#1:1845\n*E\n"})
/*      */         static final class MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {
/*      */           Object L$1;
/*      */           int I$0;
/*      */           int I$1;
/*      */           int I$2;
/*      */           int I$3;
/*      */           long J$0;
/*      */           int label;
/*      */           
/*      */           MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1(Continuation $completion) {
/*      */             super(2, $completion);
/*      */           }
/*      */           
/*      */           @Nullable
/*      */           public final Object invokeSuspend(@NotNull Object $result) {
/*      */             // Byte code:
/*      */             //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */             //   3: astore #20
/*      */             //   5: aload_0
/*      */             //   6: getfield label : I
/*      */             //   9: tableswitch default -> 346, 0 -> 32, 1 -> 249
/*      */             //   32: aload_1
/*      */             //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */             //   36: aload_0
/*      */             //   37: getfield L$0 : Ljava/lang/Object;
/*      */             //   40: checkcast kotlin/sequences/SequenceScope
/*      */             //   43: astore_2
/*      */             //   44: aload_0
/*      */             //   45: getfield this$0 : Landroidx/collection/MutableScatterMap;
/*      */             //   48: checkcast androidx/collection/ScatterMap
/*      */             //   51: astore_3
/*      */             //   52: iconst_0
/*      */             //   53: istore #4
/*      */             //   55: aload_3
/*      */             //   56: getfield metadata : [J
/*      */             //   59: astore #5
/*      */             //   61: aload #5
/*      */             //   63: arraylength
/*      */             //   64: iconst_2
/*      */             //   65: isub
/*      */             //   66: istore #6
/*      */             //   68: iconst_0
/*      */             //   69: istore #7
/*      */             //   71: iload #7
/*      */             //   73: iload #6
/*      */             //   75: if_icmpgt -> 341
/*      */             //   78: aload #5
/*      */             //   80: iload #7
/*      */             //   82: laload
/*      */             //   83: lstore #8
/*      */             //   85: lload #8
/*      */             //   87: lstore #10
/*      */             //   89: iconst_0
/*      */             //   90: istore #12
/*      */             //   92: lload #10
/*      */             //   94: lload #10
/*      */             //   96: ldc2_w -1
/*      */             //   99: lxor
/*      */             //   100: bipush #7
/*      */             //   102: lshl
/*      */             //   103: land
/*      */             //   104: ldc2_w -9187201950435737472
/*      */             //   107: land
/*      */             //   108: ldc2_w -9187201950435737472
/*      */             //   111: lcmp
/*      */             //   112: ifeq -> 328
/*      */             //   115: bipush #8
/*      */             //   117: iload #7
/*      */             //   119: iload #6
/*      */             //   121: isub
/*      */             //   122: iconst_m1
/*      */             //   123: ixor
/*      */             //   124: bipush #31
/*      */             //   126: iushr
/*      */             //   127: isub
/*      */             //   128: istore #13
/*      */             //   130: iconst_0
/*      */             //   131: istore #14
/*      */             //   133: iload #14
/*      */             //   135: iload #13
/*      */             //   137: if_icmpge -> 321
/*      */             //   140: lload #8
/*      */             //   142: ldc2_w 255
/*      */             //   145: land
/*      */             //   146: lstore #15
/*      */             //   148: iconst_0
/*      */             //   149: istore #17
/*      */             //   151: lload #15
/*      */             //   153: ldc2_w 128
/*      */             //   156: lcmp
/*      */             //   157: ifge -> 164
/*      */             //   160: iconst_1
/*      */             //   161: goto -> 165
/*      */             //   164: iconst_0
/*      */             //   165: ifeq -> 308
/*      */             //   168: iload #7
/*      */             //   170: iconst_3
/*      */             //   171: ishl
/*      */             //   172: iload #14
/*      */             //   174: iadd
/*      */             //   175: istore #12
/*      */             //   177: iload #12
/*      */             //   179: istore #18
/*      */             //   181: iconst_0
/*      */             //   182: istore #19
/*      */             //   184: aload_2
/*      */             //   185: iload #18
/*      */             //   187: invokestatic boxInt : (I)Ljava/lang/Integer;
/*      */             //   190: aload_0
/*      */             //   191: aload_0
/*      */             //   192: aload_2
/*      */             //   193: putfield L$0 : Ljava/lang/Object;
/*      */             //   196: aload_0
/*      */             //   197: aload #5
/*      */             //   199: putfield L$1 : Ljava/lang/Object;
/*      */             //   202: aload_0
/*      */             //   203: iload #6
/*      */             //   205: putfield I$0 : I
/*      */             //   208: aload_0
/*      */             //   209: iload #7
/*      */             //   211: putfield I$1 : I
/*      */             //   214: aload_0
/*      */             //   215: lload #8
/*      */             //   217: putfield J$0 : J
/*      */             //   220: aload_0
/*      */             //   221: iload #13
/*      */             //   223: putfield I$2 : I
/*      */             //   226: aload_0
/*      */             //   227: iload #14
/*      */             //   229: putfield I$3 : I
/*      */             //   232: aload_0
/*      */             //   233: iconst_1
/*      */             //   234: putfield label : I
/*      */             //   237: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */             //   240: dup
/*      */             //   241: aload #20
/*      */             //   243: if_acmpne -> 307
/*      */             //   246: aload #20
/*      */             //   248: areturn
/*      */             //   249: iconst_0
/*      */             //   250: istore #4
/*      */             //   252: iconst_0
/*      */             //   253: istore #19
/*      */             //   255: aload_0
/*      */             //   256: getfield I$3 : I
/*      */             //   259: istore #14
/*      */             //   261: aload_0
/*      */             //   262: getfield I$2 : I
/*      */             //   265: istore #13
/*      */             //   267: aload_0
/*      */             //   268: getfield J$0 : J
/*      */             //   271: lstore #8
/*      */             //   273: aload_0
/*      */             //   274: getfield I$1 : I
/*      */             //   277: istore #7
/*      */             //   279: aload_0
/*      */             //   280: getfield I$0 : I
/*      */             //   283: istore #6
/*      */             //   285: aload_0
/*      */             //   286: getfield L$1 : Ljava/lang/Object;
/*      */             //   289: checkcast [J
/*      */             //   292: astore #5
/*      */             //   294: aload_0
/*      */             //   295: getfield L$0 : Ljava/lang/Object;
/*      */             //   298: checkcast kotlin/sequences/SequenceScope
/*      */             //   301: astore_2
/*      */             //   302: aload_1
/*      */             //   303: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */             //   306: aload_1
/*      */             //   307: pop
/*      */             //   308: lload #8
/*      */             //   310: bipush #8
/*      */             //   312: lshr
/*      */             //   313: lstore #8
/*      */             //   315: iinc #14, 1
/*      */             //   318: goto -> 133
/*      */             //   321: iload #13
/*      */             //   323: bipush #8
/*      */             //   325: if_icmpne -> 342
/*      */             //   328: iload #7
/*      */             //   330: iload #6
/*      */             //   332: if_icmpeq -> 341
/*      */             //   335: iinc #7, 1
/*      */             //   338: goto -> 78
/*      */             //   341: nop
/*      */             //   342: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */             //   345: areturn
/*      */             //   346: new java/lang/IllegalStateException
/*      */             //   349: dup
/*      */             //   350: ldc 'call to 'resume' before 'invoke' with coroutine'
/*      */             //   352: invokespecial <init> : (Ljava/lang/String;)V
/*      */             //   355: athrow
/*      */             // Line number table:
/*      */             //   Java source line number -> byte code offset
/*      */             //   #1493	-> 3
/*      */             //   #1494	-> 44
/*      */             //   #1835	-> 55
/*      */             //   #1836	-> 61
/*      */             //   #1838	-> 68
/*      */             //   #1839	-> 78
/*      */             //   #1840	-> 85
/*      */             //   #1841	-> 92
/*      */             //   #1840	-> 108
/*      */             //   #1842	-> 115
/*      */             //   #1843	-> 130
/*      */             //   #1844	-> 140
/*      */             //   #1845	-> 151
/*      */             //   #1844	-> 165
/*      */             //   #1846	-> 168
/*      */             //   #1847	-> 177
/*      */             //   #1495	-> 184
/*      */             //   #1493	-> 246
/*      */             //   #1496	-> 307
/*      */             //   #1847	-> 308
/*      */             //   #1849	-> 308
/*      */             //   #1843	-> 315
/*      */             //   #1851	-> 321
/*      */             //   #1838	-> 328
/*      */             //   #1854	-> 341
/*      */             //   #1497	-> 342
/*      */             //   #1493	-> 346
/*      */             // Local variable table:
/*      */             //   start	length	slot	name	descriptor
/*      */             //   44	205	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */             //   302	6	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */             //   308	20	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */             //   328	7	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */             //   335	6	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */             //   52	9	3	this_$iv	Landroidx/collection/ScatterMap;
/*      */             //   61	188	5	m$iv	[J
/*      */             //   294	14	5	m$iv	[J
/*      */             //   308	20	5	m$iv	[J
/*      */             //   328	7	5	m$iv	[J
/*      */             //   335	6	5	m$iv	[J
/*      */             //   68	181	6	lastIndex$iv	I
/*      */             //   285	23	6	lastIndex$iv	I
/*      */             //   308	20	6	lastIndex$iv	I
/*      */             //   328	7	6	lastIndex$iv	I
/*      */             //   335	6	6	lastIndex$iv	I
/*      */             //   71	178	7	i$iv	I
/*      */             //   279	29	7	i$iv	I
/*      */             //   308	20	7	i$iv	I
/*      */             //   328	13	7	i$iv	I
/*      */             //   85	55	8	slot$iv	J
/*      */             //   140	109	8	slot$iv	J
/*      */             //   273	35	8	slot$iv	J
/*      */             //   308	20	8	slot$iv	J
/*      */             //   89	19	10	$this$maskEmptyOrDeleted$iv$iv	J
/*      */             //   177	4	12	index$iv	I
/*      */             //   130	119	13	bitCount$iv	I
/*      */             //   267	41	13	bitCount$iv	I
/*      */             //   308	20	13	bitCount$iv	I
/*      */             //   133	7	14	j$iv	I
/*      */             //   140	109	14	j$iv	I
/*      */             //   261	47	14	j$iv	I
/*      */             //   308	13	14	j$iv	I
/*      */             //   148	16	15	value$iv$iv	J
/*      */             //   181	59	18	index	I
/*      */             //   184	65	19	$i$a$-forEachIndexed-MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1$1	I
/*      */             //   92	16	12	$i$f$maskEmptyOrDeleted	I
/*      */             //   151	14	17	$i$f$isFull	I
/*      */             //   55	194	4	$i$f$forEachIndexed	I
/*      */             //   36	310	0	this	Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;
/*      */             //   36	310	1	$result	Ljava/lang/Object;
/*      */             //   255	53	19	$i$a$-forEachIndexed-MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1$1	I
/*      */             //   252	90	4	$i$f$forEachIndexed	I
/*      */           }
/*      */           
/*      */           @NotNull
/*      */           public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1> $completion) {
/*      */             MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1 = new MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1($completion);
/*      */             mutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1.L$0 = value;
/*      */             return (Continuation<Unit>)mutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;
/*      */           }
/*      */           
/*      */           @Nullable
/*      */           public final Object invoke(@NotNull SequenceScope p1, @Nullable Continuation<?> p2) {
/*      */             return ((MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */           }
/*      */         }
/*      */         private int current = -1;
/*      */         
/*      */         public boolean hasNext() {
/*      */           return this.iterator.hasNext();
/*      */         }
/*      */         
/*      */         public V next() {
/*      */           this.current = ((Number)this.iterator.next()).intValue();
/*      */           return (V)MutableScatterMap.this.values[this.current];
/*      */         }
/*      */         
/*      */         public void remove() {
/*      */           if (this.current >= 0) {
/*      */             MutableScatterMap.this.removeValueAt(this.current);
/*      */             this.current = -1;
/*      */           } 
/*      */         }
/*      */       }
/*      */       
/*      */       public void clear() {
/*      */         MutableScatterMap.this.clear();
/*      */       }
/*      */       
/*      */       public boolean addAll(@NotNull Collection elements) {
/*      */         Intrinsics.checkNotNullParameter(elements, "elements");
/*      */         throw new UnsupportedOperationException();
/*      */       }
/*      */       
/*      */       public boolean add(Object element) {
/*      */         throw new UnsupportedOperationException();
/*      */       }
/*      */       
/*      */       public boolean retainAll(@NotNull Collection elements) {
/*      */         Intrinsics.checkNotNullParameter(elements, "elements");
/*      */         boolean changed = false;
/*      */         MutableScatterMap<K, V> mutableScatterMap1 = MutableScatterMap.this, mutableScatterMap2 = MutableScatterMap.this;
/*      */         int $i$f$forEachIndexed = 0;
/*      */         long[] m$iv = mutableScatterMap1.metadata;
/*      */         int lastIndex$iv = m$iv.length - 2;
/*      */         int i$iv = 0;
/*      */         if (i$iv <= lastIndex$iv) {
/*      */           while (true) {
/*      */             long slot$iv = m$iv[i$iv];
/*      */             long $this$maskEmptyOrDeleted$iv$iv = slot$iv;
/*      */             int $i$f$maskEmptyOrDeleted = 0;
/*      */             if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/*      */               int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/*      */               for (int j$iv = 0;; j$iv++);
/*      */               if (bitCount$iv == 8)
/*      */                 continue; 
/*      */               break;
/*      */             } 
/*      */             continue;
/*      */             if (i$iv != lastIndex$iv) {
/*      */               i$iv++;
/*      */               continue;
/*      */             } 
/*      */             // Byte code: goto -> 217
/*      */           } 
/*      */         } else {
/*      */         
/*      */         } 
/*      */         return changed;
/*      */       }
/*      */       
/*      */       public boolean removeAll(@NotNull Collection elements) {
/*      */         Intrinsics.checkNotNullParameter(elements, "elements");
/*      */         boolean changed = false;
/*      */         MutableScatterMap<K, V> mutableScatterMap1 = MutableScatterMap.this, mutableScatterMap2 = MutableScatterMap.this;
/*      */         int $i$f$forEachIndexed = 0;
/*      */         long[] m$iv = mutableScatterMap1.metadata;
/*      */         int lastIndex$iv = m$iv.length - 2;
/*      */         int i$iv = 0;
/*      */         if (i$iv <= lastIndex$iv) {
/*      */           while (true) {
/*      */             long slot$iv = m$iv[i$iv];
/*      */             long $this$maskEmptyOrDeleted$iv$iv = slot$iv;
/*      */             int $i$f$maskEmptyOrDeleted = 0;
/*      */             if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/*      */               int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/*      */               for (int j$iv = 0;; j$iv++);
/*      */               if (bitCount$iv == 8)
/*      */                 continue; 
/*      */               break;
/*      */             } 
/*      */             continue;
/*      */             if (i$iv != lastIndex$iv) {
/*      */               i$iv++;
/*      */               continue;
/*      */             } 
/*      */             // Byte code: goto -> 217
/*      */           } 
/*      */         } else {
/*      */         
/*      */         } 
/*      */         return changed;
/*      */       }
/*      */       
/*      */       public boolean remove(Object element) {
/*      */         MutableScatterMap<K, V> mutableScatterMap1 = MutableScatterMap.this, mutableScatterMap2 = MutableScatterMap.this;
/*      */         int $i$f$forEachIndexed = 0;
/*      */         long[] m$iv = mutableScatterMap1.metadata;
/*      */         int lastIndex$iv = m$iv.length - 2;
/*      */         int i$iv = 0;
/*      */         if (i$iv <= lastIndex$iv) {
/*      */           while (true) {
/*      */             long slot$iv = m$iv[i$iv];
/*      */             long $this$maskEmptyOrDeleted$iv$iv = slot$iv;
/*      */             int $i$f$maskEmptyOrDeleted = 0;
/*      */             if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/*      */               int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/*      */               for (int j$iv = 0;; j$iv++);
/*      */               if (bitCount$iv == 8)
/*      */                 continue; 
/*      */               break;
/*      */             } 
/*      */             continue;
/*      */             if (i$iv != lastIndex$iv) {
/*      */               i$iv++;
/*      */               continue;
/*      */             } 
/*      */             // Byte code: goto -> 203
/*      */           } 
/*      */         } else {
/*      */         
/*      */         } 
/*      */         return false;
/*      */       }
/*      */       
/*      */       public boolean containsAll(@NotNull Collection elements) {
/*      */         // Byte code:
/*      */         //   0: aload_1
/*      */         //   1: ldc 'elements'
/*      */         //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */         //   6: aload_1
/*      */         //   7: checkcast java/lang/Iterable
/*      */         //   10: astore_2
/*      */         //   11: aload_0
/*      */         //   12: getfield this$0 : Landroidx/collection/MutableScatterMap;
/*      */         //   15: astore_3
/*      */         //   16: iconst_0
/*      */         //   17: istore #4
/*      */         //   19: aload_2
/*      */         //   20: checkcast java/util/Collection
/*      */         //   23: invokeinterface isEmpty : ()Z
/*      */         //   28: ifeq -> 35
/*      */         //   31: iconst_1
/*      */         //   32: goto -> 83
/*      */         //   35: aload_2
/*      */         //   36: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */         //   41: astore #5
/*      */         //   43: aload #5
/*      */         //   45: invokeinterface hasNext : ()Z
/*      */         //   50: ifeq -> 82
/*      */         //   53: aload #5
/*      */         //   55: invokeinterface next : ()Ljava/lang/Object;
/*      */         //   60: astore #6
/*      */         //   62: aload #6
/*      */         //   64: astore #7
/*      */         //   66: iconst_0
/*      */         //   67: istore #8
/*      */         //   69: aload_3
/*      */         //   70: aload #7
/*      */         //   72: invokevirtual containsValue : (Ljava/lang/Object;)Z
/*      */         //   75: ifne -> 43
/*      */         //   78: iconst_0
/*      */         //   79: goto -> 83
/*      */         //   82: iconst_1
/*      */         //   83: ireturn
/*      */         // Line number table:
/*      */         //   Java source line number -> byte code offset
/*      */         //   #1561	-> 6
/*      */         //   #1895	-> 19
/*      */         //   #1896	-> 35
/*      */         //   #1561	-> 69
/*      */         //   #1896	-> 75
/*      */         //   #1897	-> 82
/*      */         //   #1561	-> 83
/*      */         // Local variable table:
/*      */         //   start	length	slot	name	descriptor
/*      */         //   69	6	8	$i$a$-all-MutableScatterMap$MutableMapWrapper$values$1$containsAll$1	I
/*      */         //   66	9	7	it	Ljava/lang/Object;
/*      */         //   62	20	6	element$iv	Ljava/lang/Object;
/*      */         //   19	64	4	$i$f$all	I
/*      */         //   16	67	2	$this$all$iv	Ljava/lang/Iterable;
/*      */         //   0	84	0	this	Landroidx/collection/MutableScatterMap$MutableMapWrapper$values$1;
/*      */         //   0	84	1	elements	Ljava/util/Collection;
/*      */       }
/*      */       
/*      */       public boolean contains(Object element) {
/*      */         return MutableScatterMap.this.containsValue((V)element);
/*      */       }
/*      */       
/*      */       public <T> T[] toArray(Object[] array) {
/*      */         Intrinsics.checkNotNullParameter(array, "array");
/*      */         return (T[])CollectionToArray.toArray(this, array);
/*      */       }
/*      */       
/*      */       public Object[] toArray() {
/*      */         return CollectionToArray.toArray(this);
/*      */       }
/*      */     }
/*      */     
/*      */     public void clear() {
/*      */       MutableScatterMap.this.clear();
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public V remove(Object key) {
/*      */       return MutableScatterMap.this.remove((K)key);
/*      */     }
/*      */     
/*      */     public void putAll(@NotNull Map from) {
/*      */       Intrinsics.checkNotNullParameter(from, "from");
/*      */       Map $this$forEach$iv = from;
/*      */       int $i$f$forEach = 0;
/*      */       Iterator<Map.Entry> iterator = $this$forEach$iv.entrySet().iterator();
/*      */       if (iterator.hasNext()) {
/*      */         Map.Entry element$iv = iterator.next(), entry1 = element$iv;
/*      */         int $i$a$-forEach-MutableScatterMap$MutableMapWrapper$putAll$1 = 0;
/*      */         Object key = entry1.getKey(), value = entry1.getValue();
/*      */         super.put(key, value);
/*      */       } 
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public V put(Object key, Object value) {
/*      */       return MutableScatterMap.this.put((K)key, (V)value);
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\MutableScatterMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */