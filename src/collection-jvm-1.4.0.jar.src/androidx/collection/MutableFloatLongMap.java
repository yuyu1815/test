/*      */ package androidx.collection;
/*      */ 
/*      */ import kotlin.Metadata;
/*      */ import kotlin.PublishedApi;
/*      */ import kotlin.ULong;
/*      */ import kotlin.collections.ArraysKt;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\020\002\n\002\b\005\n\002\020\007\n\000\n\002\020\t\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\030\002\n\002\020\024\n\002\b\007\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\b\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\b\020\006\032\0020\007H\002J\006\020\b\032\0020\007J\020\020\t\032\0020\0032\006\020\n\032\0020\003H\002J\020\020\013\032\0020\0032\006\020\f\032\0020\rH\002J\"\020\016\032\0020\0172\006\020\f\032\0020\r2\f\020\020\032\b\022\004\022\0020\0170\021H\bø\001\000J\b\020\022\032\0020\007H\002J\020\020\023\032\0020\0072\006\020\024\032\0020\003H\002J\020\020\025\032\0020\0072\006\020\002\032\0020\003H\002J\021\020\026\032\0020\0072\006\020\027\032\0020\030H\nJ\021\020\026\032\0020\0072\006\020\027\032\0020\031H\nJ\021\020\026\032\0020\0072\006\020\f\032\0020\rH\nJ\021\020\026\032\0020\0072\006\020\027\032\0020\032H\nJ\021\020\033\032\0020\0072\006\020\034\032\0020\001H\nJ\026\020\035\032\0020\0072\006\020\f\032\0020\r2\006\020\036\032\0020\017J\036\020\035\032\0020\0172\006\020\f\032\0020\r2\006\020\036\032\0020\0172\006\020\037\032\0020\017J\016\020 \032\0020\0072\006\020\034\032\0020\001J\016\020!\032\0020\0072\006\020\f\032\0020\rJ\026\020!\032\0020\"2\006\020\f\032\0020\r2\006\020\036\032\0020\017J&\020#\032\0020\0072\030\020$\032\024\022\004\022\0020\r\022\004\022\0020\017\022\004\022\0020\"0%H\bø\001\000J\020\020&\032\0020\0072\006\020'\032\0020\003H\001J\020\020(\032\0020\0072\006\020)\032\0020\003H\002J\031\020*\032\0020\0072\006\020\f\032\0020\r2\006\020\036\032\0020\017H\002J\006\020+\032\0020\003J\031\020,\032\0020\0072\006\020'\032\0020\0032\006\020\036\032\0020\017H\bR\016\020\005\032\0020\003X\016¢\006\002\n\000\002\007\n\005\b20\001¨\006-"}, d2 = {"Landroidx/collection/MutableFloatLongMap;", "Landroidx/collection/FloatLongMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "clear", "findFirstAvailableSlot", "hash1", "findInsertIndex", "key", "", "getOrPut", "", "defaultValue", "Lkotlin/Function0;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "keys", "Landroidx/collection/FloatList;", "Landroidx/collection/FloatSet;", "", "plusAssign", "from", "put", "value", "default", "putAll", "remove", "", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "resizeStorage", "newCapacity", "set", "trim", "writeMetadata", "collection"})
/*      */ @SourceDebugExtension({"SMAP\nFloatLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatLongMap.kt\nandroidx/collection/MutableFloatLongMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 FloatLongMap.kt\nandroidx/collection/FloatLongMap\n+ 5 FloatSet.kt\nandroidx/collection/FloatSet\n+ 6 FloatList.kt\nandroidx/collection/FloatList\n+ 7 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1031:1\n1021#1,2:1118\n1025#1,5:1126\n1021#1,2:1157\n1025#1,5:1165\n1021#1,2:1182\n1025#1,5:1190\n1#2:1032\n1656#3,6:1033\n1810#3:1049\n1672#3:1053\n1810#3:1071\n1672#3:1075\n1810#3:1096\n1672#3:1100\n1656#3,6:1120\n1656#3,6:1131\n1599#3:1140\n1603#3:1141\n1779#3,3:1142\n1793#3,3:1145\n1717#3:1148\n1705#3:1149\n1699#3:1150\n1712#3:1151\n1802#3:1152\n1666#3:1153\n1645#3:1154\n1664#3:1155\n1645#3:1156\n1656#3,6:1159\n1779#3,3:1170\n1810#3:1173\n1699#3:1174\n1669#3:1175\n1645#3:1176\n1599#3:1180\n1603#3:1181\n1656#3,6:1184\n1656#3,6:1195\n1656#3,6:1201\n385#4,4:1039\n357#4,6:1043\n367#4,3:1050\n370#4,2:1054\n389#4,2:1056\n373#4,6:1058\n391#4:1064\n357#4,6:1065\n367#4,3:1072\n370#4,9:1076\n262#5,4:1085\n232#5,7:1089\n243#5,3:1097\n246#5,2:1101\n266#5,2:1103\n249#5,6:1105\n268#5:1111\n253#6,6:1112\n833#7,3:1137\n833#7,3:1177\n*S KotlinDebug\n*F\n+ 1 FloatLongMap.kt\nandroidx/collection/MutableFloatLongMap\n*L\n875#1:1118,2\n875#1:1126,5\n933#1:1157,2\n933#1:1165,5\n1008#1:1182,2\n1008#1:1190,5\n711#1:1033,6\n789#1:1049\n789#1:1053\n828#1:1071\n828#1:1075\n855#1:1096\n855#1:1100\n875#1:1120,6\n885#1:1131,6\n899#1:1140\n900#1:1141\n907#1:1142,3\n908#1:1145,3\n909#1:1148\n910#1:1149\n910#1:1150\n914#1:1151\n917#1:1152\n926#1:1153\n926#1:1154\n932#1:1155\n932#1:1156\n933#1:1159,6\n948#1:1170,3\n949#1:1173\n951#1:1174\n1003#1:1175\n1003#1:1176\n1006#1:1180\n1008#1:1181\n1008#1:1184,6\n1022#1:1195,6\n1028#1:1201,6\n789#1:1039,4\n789#1:1043,6\n789#1:1050,3\n789#1:1054,2\n789#1:1056,2\n789#1:1058,6\n789#1:1064\n828#1:1065,6\n828#1:1072,3\n828#1:1076,9\n855#1:1085,4\n855#1:1089,7\n855#1:1097,3\n855#1:1101,2\n855#1:1103,2\n855#1:1105,6\n855#1:1111\n864#1:1112,6\n898#1:1137,3\n1005#1:1177,3\n*E\n"})
/*      */ public final class MutableFloatLongMap
/*      */   extends FloatLongMap
/*      */ {
/*      */   private int growthLimit;
/*      */   
/*      */   public MutableFloatLongMap(int initialCapacity) {
/*  678 */     super(null);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  683 */     if (!((initialCapacity >= 0) ? 1 : 0))
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
/* 1032 */       int $i$a$-require-MutableFloatLongMap$1 = 0; String str = "Capacity must be a positive value."; throw new IllegalArgumentException(str.toString()); }  initializeStorage(ScatterMapKt.unloadedCapacity(initialCapacity));
/* 1033 */   } private final void initializeStorage(int initialCapacity) { int newCapacity = (initialCapacity > 0) ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0; this._capacity = newCapacity; initializeMetadata(newCapacity); this.keys = new float[newCapacity]; this.values = new long[newCapacity]; } private final void initializeGrowth() { this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size; } public final long getOrPut(float key, @NotNull Function0 defaultValue) { Intrinsics.checkNotNullParameter(defaultValue, "defaultValue"); int $i$f$getOrPut = 0, index = findKeyIndex(key); long defValue = ((Number)defaultValue.invoke()).longValue(); put(key, defValue); return (index < 0) ? defValue : this.values[index]; } public final void set(float key, long value) { int index = findInsertIndex(key); if (index < 0) index ^= 0xFFFFFFFF;  this.keys[index] = key; this.values[index] = value; } private final void initializeMetadata(int capacity) { int size = (capacity + 1 + 7 + 7 & 0xFFFFFFF8) >> 3; long[] arrayOfLong2 = new long[size], arrayOfLong3 = arrayOfLong2; MutableFloatLongMap mutableFloatLongMap = this; int $i$a$-apply-MutableFloatLongMap$initializeMetadata$1 = 0; ArraysKt.fill$default(arrayOfLong3, -9187201950435737472L, 0, 0, 6, null); mutableFloatLongMap.metadata = (capacity == 0) ? ScatterMapKt.EmptyGroup : arrayOfLong2; long arrayOfLong1[] = this.metadata, value$iv = 255L; int $i$f$writeRawMetadata = 0; int i$iv = capacity >> 3;
/* 1034 */     int b$iv = (capacity & 0x7) << 3;
/*      */ 
/*      */     
/* 1037 */     arrayOfLong1[i$iv] = arrayOfLong1[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv; initializeGrowth(); }
/*      */   public final void put(float key, long value) { set(key, value); }
/* 1039 */   public final long put(float key, long value, long default) { int index = findInsertIndex(key); long previous = default; if (index < 0) { index ^= 0xFFFFFFFF; } else { previous = this.values[index]; }  this.keys[index] = key; this.values[index] = value; return previous; } public final void putAll(@NotNull FloatLongMap from) { Intrinsics.checkNotNullParameter(from, "from"); FloatLongMap this_$iv = from; int $i$f$forEach = 0; float[] k$iv = this_$iv.keys;
/* 1040 */     long[] v$iv = this_$iv.values;
/*      */     
/* 1042 */     FloatLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1043 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1044 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1046 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true)
/* 1047 */       { long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1048 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1049 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1050 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1051 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1060 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 220 }  } else {  }  } public final void plusAssign(@NotNull FloatLongMap from) { Intrinsics.checkNotNullParameter(from, "from"); int $i$f$plusAssign = 0; putAll(from); }
/*      */   public final void remove(float key) { int index = findKeyIndex(key); if (index >= 0)
/*      */       removeValueAt(index);  }
/*      */   public final boolean remove(float key, long value) { int index = findKeyIndex(key); if (index >= 0 && this.values[index] == value) { removeValueAt(index); return true; }  return false; }
/* 1065 */   public final void removeIf(@NotNull Function2 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$removeIf = 0; FloatLongMap this_$iv = this; int $i$f$forEachIndexed = 0; long[] m$iv = this_$iv.metadata;
/* 1066 */     int lastIndex$iv = m$iv.length - 2;
/*      */     
/* 1068 */     int i$iv = 0; if (i$iv <= lastIndex$iv) { while (true)
/* 1069 */       { long slot$iv = m$iv[i$iv];
/* 1070 */         long $this$maskEmptyOrDeleted$iv$iv = slot$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1071 */         if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1072 */         { int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/* 1073 */           for (int j$iv = 0;; j$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1081 */           if (bitCount$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv != lastIndex$iv) { i$iv++; continue; }  // Byte code: goto -> 221 }  } else {  }
/*      */      } public final void minusAssign(float key) { int $i$f$minusAssign = 0; remove(key); }
/*      */   public final void minusAssign(@NotNull float[] keys) { Intrinsics.checkNotNullParameter(keys, "keys"); int $i$f$minusAssign; byte b; int i; for ($i$f$minusAssign = 0, b = 0, i = keys.length; b < i; ) { float key = keys[b]; remove(key); b++; }
/*      */      }
/* 1086 */   public final void minusAssign(@NotNull FloatSet keys) { Intrinsics.checkNotNullParameter(keys, "keys"); int $i$f$minusAssign = 0; FloatSet this_$iv = keys; int $i$f$forEach = 0; float[] k$iv = this_$iv.elements;
/*      */     
/* 1088 */     FloatSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1090 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1091 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1093 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1094 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1095 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1096 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1097 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1098 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1107 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break;
/*      */         }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 210
/*      */       }  }
/*      */     else {  }
/* 1113 */      } public final void minusAssign(@NotNull FloatList keys) { Intrinsics.checkNotNullParameter(keys, "keys"); int $i$f$minusAssign = 0; FloatList this_$iv = keys; int $i$f$forEach = 0; float[] content$iv = this_$iv.content;
/* 1114 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1115 */       float key = content$iv[i$iv]; int $i$a$-forEach-MutableFloatLongMap$minusAssign$2 = 0; remove(key);
/*      */     }  } @PublishedApi public final void removeValueAt(int index) { this._size--; MutableFloatLongMap mutableFloatLongMap = this; long value$iv = 254L;
/*      */     int $i$f$writeMetadata = 0;
/* 1118 */     long[] m$iv = mutableFloatLongMap.metadata;
/* 1119 */     int $i$f$writeRawMetadata = 0;
/* 1120 */     int i$iv$iv = index >> 3;
/* 1121 */     int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 1124 */     m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */     
/* 1126 */     int c$iv = mutableFloatLongMap._capacity;
/* 1127 */     int cloneIndex$iv = (index - 7 & c$iv) + (
/* 1128 */       0x7 & c$iv);
/* 1129 */     int i = 0; int j = cloneIndex$iv >> 3; int k = (cloneIndex$iv & 0x7) << 3; m$iv[j] = m$iv[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << k; } public final void clear() { this._size = 0; if (this.metadata != ScatterMapKt.EmptyGroup) {
/*      */       ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, null); long[] arrayOfLong = this.metadata; int i = this._capacity; long value$iv = 255L; int $i$f$writeRawMetadata = 0;
/* 1131 */       int i$iv = i >> 3;
/* 1132 */       int b$iv = (i & 0x7) << 3;
/*      */ 
/*      */       
/* 1135 */       arrayOfLong[i$iv] = arrayOfLong[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv;
/*      */     }  initializeGrowth(); } private final int findInsertIndex(float key) { int $i$f$hash = 0;
/* 1137 */     int hash$iv = Float.hashCode(key) * -862048943;
/*      */     
/* 1139 */     int hash = hash$iv ^ hash$iv << 16;
/* 1140 */     int $i$f$h1 = 0, hash1 = hash >>> 7;
/* 1141 */     int $i$f$h2 = 0, hash2 = hash & 0x7F; int probeMask = this._capacity; int probeOffset = hash1 & probeMask; int probeIndex = 0; while (true) {
/* 1142 */       long[] arrayOfLong = this.metadata; int $i$f$group = 0; int i$iv = probeOffset >> 3;
/* 1143 */       int b$iv = (probeOffset & 0x7) << 3;
/* 1144 */       long g = arrayOfLong[i$iv] >>> b$iv | arrayOfLong[i$iv + 1] << 64 - b$iv & -(b$iv) >> 63L; long $this$match$iv = g; int $i$f$match = 0;
/* 1145 */       long x$iv = $this$match$iv ^ 72340172838076673L * hash2;
/*      */       
/* 1147 */       long m = x$iv - 72340172838076673L & (x$iv ^ 0xFFFFFFFFFFFFFFFFL) & 0x8080808080808080L; while (true)
/* 1148 */       { long $this$hasNext$iv = m; int $i$f$hasNext = 0; if (($this$hasNext$iv != 0L)) {
/* 1149 */           long $this$get$iv = m; int $i$f$get = 0; long $this$lowestBitSet$iv$iv = $this$get$iv; int $i$f$lowestBitSet = 0;
/* 1150 */           int n = probeOffset + (Long.numberOfTrailingZeros($this$lowestBitSet$iv$iv) >> 3) & probeMask;
/*      */         }  long $this$maskEmpty$iv = g; int $i$f$maskEmpty = 0;
/* 1152 */         if (($this$maskEmpty$iv & ($this$maskEmpty$iv ^ 0xFFFFFFFFFFFFFFFFL) << 6L & 0x8080808080808080L) != 0L); break; }  probeIndex += 8; probeOffset = probeOffset + probeIndex & probeMask;
/* 1153 */     }  int index = findFirstAvailableSlot(hash1); if (this.growthLimit == 0) { long[] arrayOfLong = this.metadata; int $i$f$isDeleted = 0; int m = 0; if (!(((
/* 1154 */         arrayOfLong[index >> 3] >> (index & 0x7) << 3 & 0xFFL) == 254L) ? 1 : 0)) { adjustStorage(); index = findFirstAvailableSlot(hash1); }  }
/* 1155 */      this._size++; long[] metadata$iv = this.metadata; int $i$f$isEmpty = 0; int $i$f$readRawMetadata = 0; this.growthLimit -= (((
/* 1156 */       metadata$iv[index >> 3] >> (index & 0x7) << 3 & 0xFFL) == 128L)) ? 1 : 0; MutableFloatLongMap mutableFloatLongMap = this; long value$iv = hash2; int $i$f$writeMetadata = 0;
/* 1157 */     long[] m$iv = mutableFloatLongMap.metadata;
/* 1158 */     int $i$f$writeRawMetadata = 0;
/* 1159 */     int i$iv$iv = index >> 3;
/* 1160 */     int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 1163 */     m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */     
/* 1165 */     int c$iv = mutableFloatLongMap._capacity;
/* 1166 */     int cloneIndex$iv = (index - 7 & c$iv) + (
/* 1167 */       0x7 & c$iv);
/* 1168 */     int i = 0; int j = cloneIndex$iv >> 3; int k = (cloneIndex$iv & 0x7) << 3; m$iv[j] = m$iv[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << k; return index ^ 0xFFFFFFFF; } private final int findFirstAvailableSlot(int hash1) { int probeMask = this._capacity; int probeOffset = hash1 & probeMask; int probeIndex = 0; while (true)
/*      */     { long[] metadata$iv = this.metadata; int $i$f$group = 0;
/* 1170 */       int i$iv = probeOffset >> 3;
/* 1171 */       int b$iv = (probeOffset & 0x7) << 3;
/* 1172 */       long g = metadata$iv[i$iv] >>> b$iv | metadata$iv[i$iv + 1] << 64 - b$iv & -(b$iv) >> 63L; long $this$maskEmptyOrDeleted$iv = g; int $i$f$maskEmptyOrDeleted = 0;
/* 1173 */       long m = $this$maskEmptyOrDeleted$iv & ($this$maskEmptyOrDeleted$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L; if (m != 0L)
/* 1174 */       { long $this$lowestBitSet$iv = m; int $i$f$lowestBitSet = 0; return probeOffset + (Long.numberOfTrailingZeros($this$lowestBitSet$iv) >> 3) & probeMask; }  probeIndex += 8; probeOffset = probeOffset + probeIndex & probeMask; }  } public final int trim() { int previousCapacity = this._capacity; int newCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size)); if (newCapacity < previousCapacity) { resizeStorage(newCapacity); return previousCapacity - this._capacity; }  return 0; } private final void adjustStorage() { if (this._capacity > 8 && Long.compareUnsigned(ULong.constructor-impl(ULong.constructor-impl(this._size) * 32L), ULong.constructor-impl(ULong.constructor-impl(this._capacity) * 25L)) <= 0) { resizeStorage(ScatterMapKt.nextCapacity(this._capacity)); } else { resizeStorage(ScatterMapKt.nextCapacity(this._capacity)); }  }
/* 1175 */   private final void resizeStorage(int newCapacity) { long[] previousMetadata = this.metadata; float[] previousKeys = this.keys; long[] previousValues = this.values; int previousCapacity = this._capacity; initializeStorage(newCapacity); float[] newKeys = this.keys; long[] newValues = this.values; for (int i = 0; i < previousCapacity; i++) { int $i$f$isFull = 0; int $i$f$readRawMetadata = 0; if (((
/* 1176 */         previousMetadata[i >> 3] >> (i & 0x7) << 3 & 0xFFL) < 128L)) {
/* 1177 */         float previousKey = previousKeys[i]; int $i$f$hash = 0; int hash$iv = Float.hashCode(previousKey) * -862048943;
/*      */         
/* 1179 */         int hash = hash$iv ^ hash$iv << 16;
/* 1180 */         int $i$f$h1 = 0, index = findFirstAvailableSlot(hash >>> 7); MutableFloatLongMap mutableFloatLongMap = this; int $i$f$h2 = 0;
/* 1181 */         long value$iv = (hash & 0x7F); int $i$f$writeMetadata = 0;
/* 1182 */         long[] m$iv = mutableFloatLongMap.metadata;
/* 1183 */         int $i$f$writeRawMetadata = 0;
/* 1184 */         int i$iv$iv = index >> 3;
/* 1185 */         int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */         
/* 1188 */         m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */         
/* 1190 */         int c$iv = mutableFloatLongMap._capacity;
/* 1191 */         int cloneIndex$iv = (index - 7 & c$iv) + (
/* 1192 */           0x7 & c$iv);
/* 1193 */         int j = 0; int k = cloneIndex$iv >> 3; int m = (cloneIndex$iv & 0x7) << 3; m$iv[k] = m$iv[k] & (255L << m ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << m; newKeys[index] = previousKey; newValues[index] = previousValues[i];
/*      */       }  }
/* 1195 */      } private final void writeMetadata(int index, long value) { int $i$f$writeMetadata = 0; long[] m = this.metadata; int $i$f$writeRawMetadata = 0; int i$iv = index >> 3;
/* 1196 */     int b$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 1199 */     m[i$iv] = m[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value << b$iv; int c = this._capacity; int cloneIndex = (index - 7 & c) + (0x7 & c);
/*      */     int i = 0;
/* 1201 */     int j = cloneIndex >> 3;
/* 1202 */     int k = (cloneIndex & 0x7) << 3;
/*      */ 
/*      */     
/* 1205 */     m[j] = m[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value << k; }
/*      */ 
/*      */   
/*      */   public MutableFloatLongMap() {
/*      */     this(0, 1, (DefaultConstructorMarker)null);
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\MutableFloatLongMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */