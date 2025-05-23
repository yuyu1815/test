/*      */ package androidx.collection;
/*      */ 
/*      */ import androidx.annotation.IntRange;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.NoSuchElementException;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.PublishedApi;
/*      */ import kotlin.jvm.JvmField;
/*      */ import kotlin.jvm.JvmOverloads;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.functions.Function3;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Lambda;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.ranges.IntRange;
/*      */ import kotlin.ranges.RangesKt;
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
/*      */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000r\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\020\021\n\002\b\003\n\002\030\002\n\002\b\b\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\b\005\n\002\020\034\n\002\b\021\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\r\n\002\020\016\n\000\n\002\020\r\n\002\b\013\n\002\030\002\n\000\b6\030\000*\004\b\000\020\0012\0020\002B\017\b\004\022\006\020\003\032\0020\004¢\006\002\020\005J\006\020\026\032\0020\027J:\020\026\032\0020\0272!\020\030\032\035\022\023\022\0218\000¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\004\022\0020\0270\031H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\016\020\035\032\b\022\004\022\0028\0000\036H&J\026\020\037\032\0020\0272\006\020\034\032\0028\000H\002¢\006\002\020 J\024\020!\032\0020\0272\f\020\"\032\b\022\004\022\0028\0000\000J\031\020!\032\0020\0272\f\020\"\032\b\022\004\022\0028\0000\n¢\006\002\020#J\024\020!\032\0020\0272\f\020\"\032\b\022\004\022\0028\0000$J\024\020!\032\0020\0272\f\020\"\032\b\022\004\022\0028\0000\036J\006\020%\032\0020\004J:\020%\032\0020\0042!\020\030\032\035\022\023\022\0218\000¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\004\022\0020\0270\031H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\025\020&\032\0028\0002\b\b\001\020'\032\0020\004¢\006\002\020(J>\020)\032\0028\0002\b\b\001\020'\032\0020\0042!\020*\032\035\022\023\022\0210\004¢\006\f\b\032\022\b\b\033\022\004\b\b('\022\004\022\0028\0000\031H\bø\001\000¢\006\002\020+J\023\020,\032\0020\0272\b\020-\032\004\030\0010\002H\002J\013\020.\032\0028\000¢\006\002\020/J?\020.\032\0028\0002!\020\030\032\035\022\023\022\0218\000¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\004\022\0020\0270\031H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\0200J\020\0201\032\004\030\0018\000H\b¢\006\002\020/JA\0201\032\004\030\0018\0002!\020\030\032\035\022\023\022\0218\000¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\004\022\0020\0270\031H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\0200Jb\0202\032\002H3\"\004\b\001\02032\006\0204\032\002H326\0205\0322\022\023\022\021H3¢\006\f\b\032\022\b\b\033\022\004\b\b(7\022\023\022\0218\000¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\004\022\002H306H\bø\001\000\002\b\n\006\b\001\022\002\020\002¢\006\002\0208Jw\0209\032\002H3\"\004\b\001\02032\006\0204\032\002H32K\0205\032G\022\023\022\0210\004¢\006\f\b\032\022\b\b\033\022\004\b\b('\022\023\022\021H3¢\006\f\b\032\022\b\b\033\022\004\b\b(7\022\023\022\0218\000¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\004\022\002H30:H\bø\001\000\002\b\n\006\b\001\022\002\020\002¢\006\002\020;Jb\020<\032\002H3\"\004\b\001\02032\006\0204\032\002H326\0205\0322\022\023\022\0218\000¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\023\022\021H3¢\006\f\b\032\022\b\b\033\022\004\b\b(7\022\004\022\002H306H\bø\001\000\002\b\n\006\b\001\022\002\020\002¢\006\002\0208Jw\020=\032\002H3\"\004\b\001\02032\006\0204\032\002H32K\0205\032G\022\023\022\0210\004¢\006\f\b\032\022\b\b\033\022\004\b\b('\022\023\022\0218\000¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\023\022\021H3¢\006\f\b\032\022\b\b\033\022\004\b\b(7\022\004\022\002H30:H\bø\001\000\002\b\n\006\b\001\022\002\020\002¢\006\002\020;J:\020>\032\0020?2!\020@\032\035\022\023\022\0218\000¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\004\022\0020?0\031H\bø\001\000\002\b\n\006\b\001\022\002\020\001JO\020A\032\0020?26\020@\0322\022\023\022\0210\004¢\006\f\b\032\022\b\b\033\022\004\b\b('\022\023\022\0218\000¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\004\022\0020?06H\bø\001\000\002\b\n\006\b\001\022\002\020\001J:\020B\032\0020?2!\020@\032\035\022\023\022\0218\000¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\004\022\0020?0\031H\bø\001\000\002\b\n\006\b\001\022\002\020\001JO\020C\032\0020?26\020@\0322\022\023\022\0210\004¢\006\f\b\032\022\b\b\033\022\004\b\b('\022\023\022\0218\000¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\004\022\0020?06H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\030\020D\032\0028\0002\b\b\001\020'\032\0020\004H\002¢\006\002\020(J\b\020E\032\0020\004H\026J\023\020F\032\0020\0042\006\020\034\032\0028\000¢\006\002\020GJ:\020H\032\0020\0042!\020\030\032\035\022\023\022\0218\000¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\004\022\0020\0270\031H\bø\001\000\002\b\n\006\b\001\022\002\020\001J:\020I\032\0020\0042!\020\030\032\035\022\023\022\0218\000¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\004\022\0020\0270\031H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\006\020J\032\0020\027J\006\020K\032\0020\027JR\020L\032\0020M2\b\b\002\020N\032\0020O2\b\b\002\020P\032\0020O2\b\b\002\020Q\032\0020O2\b\b\002\020R\032\0020\0042\b\b\002\020S\032\0020O2\026\b\002\020T\032\020\022\004\022\0028\000\022\004\022\0020O\030\0010\031H\007J\013\020U\032\0028\000¢\006\002\020/J?\020U\032\0028\0002!\020\030\032\035\022\023\022\0218\000¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\004\022\0020\0270\031H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\0200J\023\020V\032\0020\0042\006\020\034\032\0028\000¢\006\002\020GJ\020\020W\032\004\030\0018\000H\b¢\006\002\020/JA\020W\032\004\030\0018\0002!\020\030\032\035\022\023\022\0218\000¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\004\022\0020\0270\031H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\0200J\006\020X\032\0020\027J:\020Y\032\0020\0272!\020\030\032\035\022\023\022\0218\000¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\004\022\0020\0270\031H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\b\020Z\032\0020MH\026R\030\020\006\032\0020\0048\000@\000X\016¢\006\b\n\000\022\004\b\007\020\bR\"\020\t\032\n\022\006\022\004\030\0010\0020\n8\000@\000X\016¢\006\n\n\002\020\f\022\004\b\013\020\bR\022\020\r\032\0020\0168Æ\002¢\006\006\032\004\b\017\020\020R\022\020\021\032\0020\0048Ç\002¢\006\006\032\004\b\022\020\023R\021\020\024\032\0020\0048G¢\006\006\032\004\b\025\020\023\001\001[\002\007\n\005\b20\001¨\006\\"}, d2 = {"Landroidx/collection/ObjectList;", "E", "", "initialCapacity", "", "(I)V", "_size", "get_size$annotations", "()V", "content", "", "getContent$annotations", "[Ljava/lang/Object;", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "()I", "size", "getSize", "any", "", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "asList", "", "contains", "(Ljava/lang/Object;)Z", "containsAll", "elements", "([Ljava/lang/Object;)Z", "", "count", "elementAt", "index", "(I)Ljava/lang/Object;", "elementAtOrElse", "defaultValue", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "equals", "other", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "acc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "", "block", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "last", "lastIndexOf", "lastOrNull", "none", "reversedAny", "toString", "Landroidx/collection/MutableObjectList;", "collection"})
/*      */ @SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1618:1\n305#1,6:1619\n331#1,6:1625\n305#1,6:1633\n305#1,6:1639\n305#1,6:1645\n305#1,6:1651\n305#1,6:1657\n318#1,6:1663\n331#1,6:1669\n345#1,6:1675\n75#1:1681\n75#1:1682\n318#1,6:1683\n318#1,6:1689\n318#1,6:1695\n345#1,6:1701\n75#1:1707\n331#1,6:1708\n75#1:1714\n331#1,6:1715\n345#1,6:1721\n345#1,6:1727\n318#1,6:1733\n305#1,6:1739\n80#1:1745\n1855#2,2:1631\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n101#1:1619,6\n115#1:1625,6\n168#1:1633,6\n186#1:1639,6\n209#1:1645,6\n227#1:1651,6\n244#1:1657,6\n260#1:1663,6\n277#1:1669,6\n293#1:1675,6\n358#1:1681\n369#1:1682\n399#1:1683,6\n405#1:1689,6\n421#1:1695,6\n435#1:1701,6\n461#1:1707\n472#1:1708,6\n483#1:1714\n492#1:1715,6\n509#1:1721,6\n515#1:1727,6\n545#1:1733,6\n576#1:1739,6\n592#1:1745\n157#1:1631,2\n*E\n"})
/*      */ public abstract class ObjectList<E>
/*      */ {
/*      */   @JvmField
/*      */   @NotNull
/*      */   public Object[] content;
/*      */   @JvmField
/*      */   public int _size;
/*      */   
/*      */   private ObjectList(int initialCapacity) {
/*   53 */     this.content = (initialCapacity == 0) ? 
/*   54 */       ObjectListKt.access$getEmptyArray$p() : 
/*      */       
/*   56 */       new Object[initialCapacity];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @IntRange(from = 0L)
/*      */   public final int getSize() {
/*   69 */     return this._size;
/*      */   }
/*      */ 
/*      */   
/*      */   @IntRange(from = -1L)
/*      */   public final int getLastIndex() {
/*   75 */     int $i$f$getLastIndex = 0; return this._size - 1;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final IntRange getIndices() {
/*   80 */     int $i$f$getIndices = 0; return RangesKt.until(0, this._size);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean none() {
/*   86 */     return isEmpty();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean any() {
/*   93 */     return isNotEmpty();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean any(@NotNull Function1 predicate)
/*      */   {
/*  100 */     Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$any = 0;
/*  101 */     ObjectList this_$iv = this; int $i$f$forEach = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1620 */     Object[] content$iv = this_$iv.content;
/* 1621 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1622 */       Object it = content$iv[i$iv]; int $i$a$-forEach-ObjectList$any$2 = 0; if (((Boolean)predicate.invoke(it)).booleanValue())
/*      */         return true; 
/*      */     }  return false; } public final boolean reversedAny(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$reversedAny = 0; ObjectList this_$iv = this;
/*      */     int $i$f$forEachReversed = 0;
/* 1626 */     Object[] content$iv = this_$iv.content;
/* 1627 */     int i$iv = this_$iv._size - 1; if (-1 < i$iv)
/* 1628 */     { Object it = content$iv[i$iv]; int $i$a$-forEachReversed-ObjectList$reversedAny$2 = 0; if (((Boolean)predicate.invoke(it)).booleanValue()) return true;  }  return false; } public final boolean contains(Object element) { return (indexOf((E)element) >= 0); }
/*      */   public final boolean containsAll(@NotNull Object[] elements) { Intrinsics.checkNotNullParameter(elements, "elements"); for (int i = 0, j = elements.length; i < j; i++) { if (!contains((E)elements[i])) return false;  }  return true; }
/*      */   public final boolean containsAll(@NotNull List<E> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); for (int i = 0, j = elements.size(); i < j; i++) { if (!contains(elements.get(i))) return false;  }  return true; }
/* 1631 */   public final boolean containsAll(@NotNull Iterable elements) { Intrinsics.checkNotNullParameter(elements, "elements"); Iterable $this$forEach$iv = elements; int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(), element = element$iv; int $i$a$-forEach-ObjectList$containsAll$1 = 0; if (!contains((E)element))
/*      */         return false;  }
/*      */      return true; } public final boolean containsAll(@NotNull ObjectList elements) { Intrinsics.checkNotNullParameter(elements, "elements"); ObjectList this_$iv = elements; int $i$f$forEach = 0;
/* 1634 */     Object[] content$iv = this_$iv.content;
/* 1635 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1636 */       Object element = content$iv[i$iv]; int $i$a$-forEach-ObjectList$containsAll$2 = 0; if (!contains((E)element))
/*      */         return false; 
/*      */     }  return true; } public final int count() { return this._size; }
/*      */   public final int count(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$count = 0; int count = 0; ObjectList this_$iv = this; int $i$f$forEach = 0;
/* 1640 */     Object[] content$iv = this_$iv.content;
/* 1641 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1642 */       Object it = content$iv[i$iv]; int $i$a$-forEach-ObjectList$count$2 = 0; if (((Boolean)predicate.invoke(it)).booleanValue())
/*      */         count++; 
/*      */     }  return count; } public final E first() { if (isEmpty())
/*      */       throw new NoSuchElementException("ObjectList is empty.");  return (E)this.content[0]; }
/* 1646 */   public final E first(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$first = 0; ObjectList this_$iv = this; int $i$f$forEach = 0; Object[] content$iv = this_$iv.content;
/* 1647 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1648 */       Object element = content$iv[i$iv]; int $i$a$-forEach-ObjectList$first$2 = 0; if (((Boolean)predicate.invoke(element)).booleanValue())
/*      */         return (E)element; 
/*      */     }  throw new NoSuchElementException("ObjectList contains no element matching the predicate."); } @Nullable public final E firstOrNull() { int $i$f$firstOrNull = 0; return isEmpty() ? null : get(0); }
/*      */   @Nullable public final E firstOrNull(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$firstOrNull = 0; ObjectList this_$iv = this; int $i$f$forEach = 0;
/* 1652 */     Object[] content$iv = this_$iv.content;
/* 1653 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1654 */       Object element = content$iv[i$iv]; int $i$a$-forEach-ObjectList$firstOrNull$2 = 0; if (((Boolean)predicate.invoke(element)).booleanValue())
/*      */         return (E)element; 
/*      */     }  return null; } public final <R> R fold(Object initial, @NotNull Function2 operation) { Intrinsics.checkNotNullParameter(operation, "operation"); int $i$f$fold = 0; Object acc = null; acc = initial; ObjectList this_$iv = this;
/*      */     int $i$f$forEach = 0;
/* 1658 */     Object[] content$iv = this_$iv.content;
/* 1659 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1660 */       Object element = content$iv[i$iv]; int $i$a$-forEach-ObjectList$fold$2 = 0; acc = operation.invoke(acc, element);
/*      */     }  return (R)acc; } public final <R> R foldIndexed(Object initial, @NotNull Function3 operation) { Intrinsics.checkNotNullParameter(operation, "operation"); int $i$f$foldIndexed = 0; Object acc = null; acc = initial;
/*      */     ObjectList this_$iv = this;
/*      */     int $i$f$forEachIndexed = 0;
/* 1664 */     Object[] content$iv = this_$iv.content;
/* 1665 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1666 */       Object object = content$iv[i$iv]; int j = i$iv, $i$a$-forEachIndexed-ObjectList$foldIndexed$2 = 0; acc = operation.invoke(Integer.valueOf(j), acc, object);
/*      */     }  return (R)acc; } public final <R> R foldRight(Object initial, @NotNull Function2 operation) { Intrinsics.checkNotNullParameter(operation, "operation"); int $i$f$foldRight = 0; Object acc = null; acc = initial;
/*      */     ObjectList this_$iv = this;
/*      */     int $i$f$forEachReversed = 0;
/* 1670 */     Object[] content$iv = this_$iv.content;
/* 1671 */     int i$iv = this_$iv._size - 1; if (-1 < i$iv) {
/* 1672 */       Object element = content$iv[i$iv]; int $i$a$-forEachReversed-ObjectList$foldRight$2 = 0; acc = operation.invoke(element, acc);
/*      */     }  return (R)acc; } public final <R> R foldRightIndexed(Object initial, @NotNull Function3 operation) { Intrinsics.checkNotNullParameter(operation, "operation"); int $i$f$foldRightIndexed = 0; Object acc = null; acc = initial;
/*      */     ObjectList this_$iv = this;
/*      */     int $i$f$forEachReversedIndexed = 0;
/* 1676 */     Object[] content$iv = this_$iv.content;
/* 1677 */     int i$iv = this_$iv._size - 1; if (-1 < i$iv)
/* 1678 */     { Object object = content$iv[i$iv]; int i = i$iv, $i$a$-forEachReversedIndexed-ObjectList$foldRightIndexed$2 = 0; acc = operation.invoke(Integer.valueOf(i), object, acc); }  return (R)acc; }
/*      */   public final void forEach(@NotNull Function1 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEach = 0; Object[] content = this.content; for (int i = 0, j = this._size; i < j; i++) block.invoke(content[i]);  }
/*      */   public final void forEachIndexed(@NotNull Function2 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachIndexed = 0; Object[] content = this.content; for (int i = 0, j = this._size; i < j; i++)
/* 1681 */       block.invoke(Integer.valueOf(i), content[i]);  } public final E get(@IntRange(from = 0L) int index) { if (!((0 <= index) ? ((index < this._size) ? 1 : 0) : 0)) { ObjectList this_$iv = this; int $i$f$getLastIndex = 0; throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + (this_$iv._size - 1)); }  return (E)this.content[index]; }
/* 1682 */   public final void forEachReversed(@NotNull Function1 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachReversed = 0; Object[] content = this.content; for (int i = this._size - 1; -1 < i; i--) block.invoke(content[i]);  } public final void forEachReversedIndexed(@NotNull Function2 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachReversedIndexed = 0; Object[] content = this.content; for (int i = this._size - 1; -1 < i; i--) block.invoke(Integer.valueOf(i), content[i]);  } public final E elementAt(@IntRange(from = 0L) int index) { if (!((0 <= index) ? ((index < this._size) ? 1 : 0) : 0)) { ObjectList this_$iv = this; int $i$f$getLastIndex = 0; throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + (this_$iv._size - 1)); }  return (E)this.content[index]; } public final E elementAtOrElse(@IntRange(from = 0L) int index, @NotNull Function1 defaultValue) { Intrinsics.checkNotNullParameter(defaultValue, "defaultValue"); int $i$f$elementAtOrElse = 0; if (!((0 <= index) ? ((index < this._size) ? 1 : 0) : 0))
/*      */       return (E)defaultValue.invoke(Integer.valueOf(index));  return (E)this.content[index]; }
/* 1684 */   public final int indexOf(Object element) { Object[] content$iv; int i$iv; int i; if (element == null) { ObjectList this_$iv = this; int $i$f$forEachIndexed = 0; content$iv = this_$iv.content;
/* 1685 */       i$iv = 0; i = this_$iv._size; }
/*      */     else
/*      */     { ObjectList this_$iv = this;
/*      */       
/*      */       int $i$f$forEachIndexed = 0;
/* 1690 */       content$iv = this_$iv.content;
/* 1691 */       i$iv = 0; i = this_$iv._size; if (i$iv < i)
/* 1692 */       { Object item = content$iv[i$iv]; int j = i$iv, $i$a$-forEachIndexed-ObjectList$indexOf$2 = 0; if (element.equals(item))
/*      */           return j;  }  }
/*      */      if (i$iv < i) { Object object = content$iv[i$iv]; int j = i$iv, $i$a$-forEachIndexed-ObjectList$indexOf$1 = 0; if (object == null)
/*      */         return j;  }
/* 1696 */      } public final int indexOfFirst(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$indexOfFirst = 0; ObjectList this_$iv = this; int $i$f$forEachIndexed = 0; Object[] content$iv = this_$iv.content;
/* 1697 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1698 */       Object object = content$iv[i$iv]; int j = i$iv, $i$a$-forEachIndexed-ObjectList$indexOfFirst$2 = 0; if (((Boolean)predicate.invoke(object)).booleanValue())
/*      */         return j; 
/*      */     }  return -1; } public final int indexOfLast(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$indexOfLast = 0; ObjectList this_$iv = this;
/*      */     int $i$f$forEachReversedIndexed = 0;
/* 1702 */     Object[] content$iv = this_$iv.content;
/* 1703 */     int i$iv = this_$iv._size - 1; if (-1 < i$iv)
/* 1704 */     { Object object = content$iv[i$iv]; int i = i$iv, $i$a$-forEachReversedIndexed-ObjectList$indexOfLast$2 = 0; if (((Boolean)predicate.invoke(object)).booleanValue()) return i;  }  return -1; } public final boolean isEmpty() { return (this._size == 0); }
/*      */   public final boolean isNotEmpty() { return (this._size != 0); }
/*      */   public final E last() { if (isEmpty())
/* 1707 */       throw new NoSuchElementException("ObjectList is empty.");  ObjectList this_$iv = this; int $i$f$getLastIndex = 0; return (E)this.content[this_$iv._size - 1]; } public final E last(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$last = 0; ObjectList this_$iv = this;
/*      */     int $i$f$forEachReversed = 0;
/* 1709 */     Object[] content$iv = this_$iv.content;
/* 1710 */     int i$iv = this_$iv._size - 1; if (-1 < i$iv) {
/* 1711 */       Object element = content$iv[i$iv]; int $i$a$-forEachReversed-ObjectList$last$2 = 0; if (((Boolean)predicate.invoke(element)).booleanValue())
/*      */         return (E)element; 
/*      */     }  throw new NoSuchElementException("ObjectList contains no element matching the predicate."); } @Nullable public final E lastOrNull() { int $i$f$lastOrNull = 0; ObjectList this_$iv = this; int $i$f$getLastIndex = 0;
/* 1714 */     return isEmpty() ? null : (E)this.content[this_$iv._size - 1]; } @Nullable public final E lastOrNull(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$lastOrNull = 0; ObjectList this_$iv = this;
/*      */     int $i$f$forEachReversed = 0;
/* 1716 */     Object[] content$iv = this_$iv.content;
/* 1717 */     int i$iv = this_$iv._size - 1; if (-1 < i$iv) {
/* 1718 */       Object element = content$iv[i$iv]; int $i$a$-forEachReversed-ObjectList$lastOrNull$2 = 0; if (((Boolean)predicate.invoke(element)).booleanValue())
/*      */         return (E)element; 
/*      */     }  return null; } public final int lastIndexOf(Object element) { Object[] content$iv; int i$iv; if (element == null) {
/*      */       ObjectList this_$iv = this; int $i$f$forEachReversedIndexed = 0;
/* 1722 */       content$iv = this_$iv.content;
/* 1723 */       i$iv = this_$iv._size - 1;
/*      */     } else {
/*      */       ObjectList this_$iv = this;
/*      */       
/*      */       int $i$f$forEachReversedIndexed = 0;
/* 1728 */       content$iv = this_$iv.content;
/* 1729 */       i$iv = this_$iv._size - 1; if (-1 < i$iv)
/* 1730 */       { Object item = content$iv[i$iv]; int i = i$iv, $i$a$-forEachReversedIndexed-ObjectList$lastIndexOf$2 = 0; if (element.equals(item))
/*      */           return i;  } 
/*      */     }  if (-1 < i$iv) { Object object = content$iv[i$iv]; int i = i$iv, $i$a$-forEachReversedIndexed-ObjectList$lastIndexOf$1 = 0; if (object == null)
/*      */         return i;  }
/* 1734 */      } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @Nullable Function1 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(truncated, "truncated"); StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2437 = stringBuilder1; int $i$a$-buildString-ObjectList$joinToString$1 = 0; $this$joinToString_u24lambda_u2437.append(prefix); ObjectList this_$iv = this; int $i$f$forEachIndexed = 0; Object[] content$iv = this_$iv.content;
/* 1735 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i); $this$joinToString_u24lambda_u2437.append(postfix);
/*      */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/*      */     return stringBuilder1.toString(); } public int hashCode() { int hashCode = 0;
/*      */     ObjectList this_$iv = this;
/*      */     int $i$f$forEach = 0;
/* 1740 */     Object[] content$iv = this_$iv.content;
/* 1741 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1742 */       Object element = content$iv[i$iv]; int $i$a$-forEach-ObjectList$hashCode$1 = 0;
/*      */     }  return hashCode; } public boolean equals(@Nullable Object other) { if (!(other instanceof ObjectList) || ((ObjectList)other)._size != this._size)
/*      */       return false;  Object[] content = this.content; Object[] otherContent = ((ObjectList)other).content; ObjectList this_$iv = this; int $i$f$getIndices = 0;
/* 1745 */     IntRange intRange = RangesKt.until(0, this_$iv._size);
/*      */     int i = intRange.getFirst();
/*      */     $i$f$getIndices = intRange.getLast();
/*      */     if (i <= $i$f$getIndices)
/*      */       while (true) {
/*      */         if (!Intrinsics.areEqual(content[i], otherContent[i]))
/*      */           return false; 
/*      */         if (i != $i$f$getIndices) {
/*      */           i++;
/*      */           continue;
/*      */         } 
/*      */         break;
/*      */       }  
/*      */     return true; }
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public String toString() {
/*      */     return joinToString$default(this, null, "[", "]", 0, null, new ObjectList$toString$1(), 25, null);
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public abstract List<E> asList();
/*      */   
/*      */   @JvmOverloads
/*      */   @NotNull
/*      */   public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated) {
/*      */     Intrinsics.checkNotNullParameter(separator, "separator");
/*      */     Intrinsics.checkNotNullParameter(prefix, "prefix");
/*      */     Intrinsics.checkNotNullParameter(postfix, "postfix");
/*      */     Intrinsics.checkNotNullParameter(truncated, "truncated");
/*      */     return joinToString$default(this, separator, prefix, postfix, limit, truncated, null, 32, null);
/*      */   }
/*      */   
/*      */   @JvmOverloads
/*      */   @NotNull
/*      */   public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit) {
/*      */     Intrinsics.checkNotNullParameter(separator, "separator");
/*      */     Intrinsics.checkNotNullParameter(prefix, "prefix");
/*      */     Intrinsics.checkNotNullParameter(postfix, "postfix");
/*      */     return joinToString$default(this, separator, prefix, postfix, limit, null, null, 48, null);
/*      */   }
/*      */   
/*      */   @JvmOverloads
/*      */   @NotNull
/*      */   public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
/*      */     Intrinsics.checkNotNullParameter(separator, "separator");
/*      */     Intrinsics.checkNotNullParameter(prefix, "prefix");
/*      */     Intrinsics.checkNotNullParameter(postfix, "postfix");
/*      */     return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
/*      */   }
/*      */   
/*      */   @JvmOverloads
/*      */   @NotNull
/*      */   public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
/*      */     Intrinsics.checkNotNullParameter(separator, "separator");
/*      */     Intrinsics.checkNotNullParameter(prefix, "prefix");
/*      */     return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
/*      */   }
/*      */   
/*      */   @JvmOverloads
/*      */   @NotNull
/*      */   public final String joinToString(@NotNull CharSequence separator) {
/*      */     Intrinsics.checkNotNullParameter(separator, "separator");
/*      */     return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
/*      */   }
/*      */   
/*      */   @JvmOverloads
/*      */   @NotNull
/*      */   public final String joinToString() {
/*      */     return joinToString$default(this, null, null, null, 0, null, null, 63, null);
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\r\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\002H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "E", "element", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"})
/*      */   static final class ObjectList$toString$1 extends Lambda implements Function1<E, CharSequence> {
/*      */     @NotNull
/*      */     public final CharSequence invoke(Object element) {
/*      */       return (element == ObjectList.this) ? "(this)" : String.valueOf(element);
/*      */     }
/*      */     
/*      */     ObjectList$toString$1() {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\ObjectList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */