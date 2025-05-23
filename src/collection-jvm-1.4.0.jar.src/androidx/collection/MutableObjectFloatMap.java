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
/*      */ import kotlin.sequences.Sequence;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\020\002\n\002\b\007\n\002\020\007\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\020\021\n\000\n\002\020\034\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\007\n\002\020\t\n\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\017\022\b\b\002\020\003\032\0020\004¢\006\002\020\005J\b\020\007\032\0020\bH\002J\006\020\t\032\0020\bJ\020\020\n\032\0020\0042\006\020\013\032\0020\004H\002J\025\020\f\032\0020\0042\006\020\r\032\0028\000H\002¢\006\002\020\016J'\020\017\032\0020\0202\006\020\r\032\0028\0002\f\020\021\032\b\022\004\022\0020\0200\022H\bø\001\000¢\006\002\020\023J\b\020\024\032\0020\bH\002J\020\020\025\032\0020\b2\006\020\026\032\0020\004H\002J\020\020\027\032\0020\b2\006\020\003\032\0020\004H\002J\026\020\030\032\0020\b2\006\020\r\032\0028\000H\n¢\006\002\020\031J\027\020\030\032\0020\b2\f\020\032\032\b\022\004\022\0028\0000\033H\nJ\036\020\030\032\0020\b2\016\020\032\032\n\022\006\b\001\022\0028\0000\034H\n¢\006\002\020\035J\027\020\030\032\0020\b2\f\020\032\032\b\022\004\022\0028\0000\036H\nJ\027\020\030\032\0020\b2\f\020\032\032\b\022\004\022\0028\0000\037H\nJ\027\020 \032\0020\b2\f\020!\032\b\022\004\022\0028\0000\002H\nJ\033\020\"\032\0020\b2\006\020\r\032\0028\0002\006\020#\032\0020\020¢\006\002\020$J#\020\"\032\0020\0202\006\020\r\032\0028\0002\006\020#\032\0020\0202\006\020%\032\0020\020¢\006\002\020&J\024\020'\032\0020\b2\f\020!\032\b\022\004\022\0028\0000\002J\023\020(\032\0020\b2\006\020\r\032\0028\000¢\006\002\020\031J\033\020(\032\0020)2\006\020\r\032\0028\0002\006\020#\032\0020\020¢\006\002\020*J&\020+\032\0020\b2\030\020,\032\024\022\004\022\0028\000\022\004\022\0020\020\022\004\022\0020)0-H\bø\001\000J\020\020.\032\0020\b2\006\020/\032\0020\004H\001J\020\0200\032\0020\b2\006\0201\032\0020\004H\002J\036\0202\032\0020\b2\006\020\r\032\0028\0002\006\020#\032\0020\020H\002¢\006\002\020$J\006\0203\032\0020\004J\031\0204\032\0020\b2\006\020/\032\0020\0042\006\020#\032\00205H\bR\016\020\006\032\0020\004X\016¢\006\002\n\000\002\007\n\005\b20\001¨\0066"}, d2 = {"Landroidx/collection/MutableObjectFloatMap;", "K", "Landroidx/collection/ObjectFloatMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "clear", "findFirstAvailableSlot", "hash1", "findIndex", "key", "(Ljava/lang/Object;)I", "getOrPut", "", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)F", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "(Ljava/lang/Object;)V", "keys", "Landroidx/collection/ScatterSet;", "", "([Ljava/lang/Object;)V", "", "Lkotlin/sequences/Sequence;", "plusAssign", "from", "put", "value", "(Ljava/lang/Object;F)V", "default", "(Ljava/lang/Object;FF)F", "putAll", "remove", "", "(Ljava/lang/Object;F)Z", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "resizeStorage", "newCapacity", "set", "trim", "writeMetadata", "", "collection"})
/*      */ @SourceDebugExtension({"SMAP\nObjectFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectFloatMap.kt\nandroidx/collection/MutableObjectFloatMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ObjectFloatMap.kt\nandroidx/collection/ObjectFloatMap\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,1058:1\n1048#1,2:1139\n1052#1,5:1147\n1048#1,2:1178\n1052#1,5:1186\n1048#1,2:1203\n1052#1,5:1211\n1#2:1059\n1656#3,6:1060\n1810#3:1076\n1672#3:1080\n1810#3:1098\n1672#3:1102\n1810#3:1123\n1672#3:1127\n1656#3,6:1141\n1656#3,6:1152\n1589#3,3:1158\n1599#3:1161\n1603#3:1162\n1779#3,3:1163\n1793#3,3:1166\n1717#3:1169\n1705#3:1170\n1699#3:1171\n1712#3:1172\n1802#3:1173\n1666#3:1174\n1645#3:1175\n1664#3:1176\n1645#3:1177\n1656#3,6:1180\n1779#3,3:1191\n1810#3:1194\n1699#3:1195\n1669#3:1196\n1645#3:1197\n1589#3,3:1198\n1599#3:1201\n1603#3:1202\n1656#3,6:1205\n1656#3,6:1216\n1656#3,6:1222\n401#4,4:1066\n373#4,6:1070\n383#4,3:1077\n386#4,2:1081\n406#4,2:1083\n389#4,6:1085\n408#4:1091\n373#4,6:1092\n383#4,3:1099\n386#4,9:1103\n267#5,4:1112\n237#5,7:1116\n248#5,3:1124\n251#5,2:1128\n272#5,2:1130\n254#5,6:1132\n274#5:1138\n*S KotlinDebug\n*F\n+ 1 ObjectFloatMap.kt\nandroidx/collection/MutableObjectFloatMap\n*L\n900#1:1139,2\n900#1:1147,5\n960#1:1178,2\n960#1:1186,5\n1035#1:1203,2\n1035#1:1211,5\n728#1:1060,6\n804#1:1076\n804#1:1080\n843#1:1098\n843#1:1102\n889#1:1123\n889#1:1127\n900#1:1141,6\n911#1:1152,6\n925#1:1158,3\n926#1:1161\n927#1:1162\n934#1:1163,3\n935#1:1166,3\n936#1:1169\n937#1:1170\n937#1:1171\n941#1:1172\n944#1:1173\n953#1:1174\n953#1:1175\n959#1:1176\n959#1:1177\n960#1:1180,6\n975#1:1191,3\n976#1:1194\n978#1:1195\n1030#1:1196\n1030#1:1197\n1032#1:1198,3\n1033#1:1201\n1035#1:1202\n1035#1:1205,6\n1049#1:1216,6\n1055#1:1222,6\n804#1:1066,4\n804#1:1070,6\n804#1:1077,3\n804#1:1081,2\n804#1:1083,2\n804#1:1085,6\n804#1:1091\n843#1:1092,6\n843#1:1099,3\n843#1:1103,9\n889#1:1112,4\n889#1:1116,7\n889#1:1124,3\n889#1:1128,2\n889#1:1130,2\n889#1:1132,6\n889#1:1138\n*E\n"})
/*      */ public final class MutableObjectFloatMap<K>
/*      */   extends ObjectFloatMap<K>
/*      */ {
/*      */   private int growthLimit;
/*      */   
/*      */   public MutableObjectFloatMap(int initialCapacity) {
/*  695 */     super(null);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  700 */     if (!((initialCapacity >= 0) ? 1 : 0))
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
/* 1059 */       int $i$a$-require-MutableObjectFloatMap$1 = 0; String str = "Capacity must be a positive value."; throw new IllegalArgumentException(str.toString()); }  initializeStorage(ScatterMapKt.unloadedCapacity(initialCapacity));
/* 1060 */   } private final void initializeStorage(int initialCapacity) { int newCapacity = (initialCapacity > 0) ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0; this._capacity = newCapacity; initializeMetadata(newCapacity); this.keys = new Object[newCapacity]; this.values = new float[newCapacity]; } private final void initializeMetadata(int capacity) { int size = (capacity + 1 + 7 + 7 & 0xFFFFFFF8) >> 3; long[] arrayOfLong2 = new long[size], arrayOfLong3 = arrayOfLong2; MutableObjectFloatMap mutableObjectFloatMap = this; int $i$a$-apply-MutableObjectFloatMap$initializeMetadata$1 = 0; ArraysKt.fill$default(arrayOfLong3, -9187201950435737472L, 0, 0, 6, null); mutableObjectFloatMap.metadata = (capacity == 0) ? ScatterMapKt.EmptyGroup : arrayOfLong2; long arrayOfLong1[] = this.metadata, value$iv = 255L; int $i$f$writeRawMetadata = 0; int i$iv = capacity >> 3;
/* 1061 */     int b$iv = (capacity & 0x7) << 3;
/*      */ 
/*      */     
/* 1064 */     arrayOfLong1[i$iv] = arrayOfLong1[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv; initializeGrowth(); } private final void initializeGrowth() { this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size; } public final float getOrPut(Object key, @NotNull Function0 defaultValue) { Intrinsics.checkNotNullParameter(defaultValue, "defaultValue"); int $i$f$getOrPut = 0, index = findKeyIndex((K)key); if (index >= 0) return this.values[index];  float value = ((Number)defaultValue.invoke()).floatValue(); set((K)key, value); return value; } public final void set(Object key, float value) { int index = findIndex((K)key); if (index < 0) index ^= 0xFFFFFFFF;  this.keys[index] = key; this.values[index] = value; } public final void put(Object key, float value) { set((K)key, value); }
/*      */   public final float put(Object key, float value, float default) { int index = findIndex((K)key); float previous = default; if (index < 0) { index ^= 0xFFFFFFFF; } else { previous = this.values[index]; }  this.keys[index] = key; this.values[index] = value; return previous; }
/* 1066 */   public final void putAll(@NotNull ObjectFloatMap from) { Intrinsics.checkNotNullParameter(from, "from"); ObjectFloatMap this_$iv = from; int $i$f$forEach = 0; Object[] k$iv = this_$iv.keys;
/* 1067 */     float[] v$iv = this_$iv.values;
/*      */     
/* 1069 */     ObjectFloatMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1070 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1071 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1073 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true)
/* 1074 */       { long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1075 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1076 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1077 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1078 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1087 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 220 }  } else {  }  } public final void plusAssign(@NotNull ObjectFloatMap<K> from) { Intrinsics.checkNotNullParameter(from, "from"); int $i$f$plusAssign = 0; putAll(from); }
/*      */   public final void remove(Object key) { int index = findKeyIndex((K)key); if (index >= 0)
/*      */       removeValueAt(index);  }
/*      */   public final boolean remove(Object key, float value) { int index = findKeyIndex((K)key); if (index >= 0 && ((this.values[index] == value))) { removeValueAt(index); return true; }  return false; }
/* 1092 */   public final void removeIf(@NotNull Function2 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$removeIf = 0; ObjectFloatMap this_$iv = this; int $i$f$forEachIndexed = 0; long[] m$iv = this_$iv.metadata;
/* 1093 */     int lastIndex$iv = m$iv.length - 2;
/*      */     
/* 1095 */     int i$iv = 0; if (i$iv <= lastIndex$iv) { while (true)
/* 1096 */       { long slot$iv = m$iv[i$iv];
/* 1097 */         long $this$maskEmptyOrDeleted$iv$iv = slot$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1098 */         if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1099 */         { int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/* 1100 */           for (int j$iv = 0;; j$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1108 */           if (bitCount$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv != lastIndex$iv) { i$iv++; continue; }  // Byte code: goto -> 218 }  } else {  }
/*      */      }
/*      */   public final void minusAssign(Object key) { int $i$f$minusAssign = 0; remove((K)key); }
/*      */   public final void minusAssign(@NotNull Object[] keys) { Intrinsics.checkNotNullParameter(keys, "keys"); int $i$f$minusAssign; byte b; int i; for ($i$f$minusAssign = 0, b = 0, i = keys.length; b < i; ) { Object key = keys[b]; remove((K)key); b++; }
/* 1113 */      } public final void minusAssign(@NotNull ScatterSet keys) { Intrinsics.checkNotNullParameter(keys, "keys"); int $i$f$minusAssign = 0; ScatterSet this_$iv = keys; int $i$f$forEach = 0; Object[] k$iv = this_$iv.elements;
/*      */     
/* 1115 */     ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1117 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1118 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1120 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true)
/* 1121 */       { long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1122 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1123 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1124 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1125 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1134 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 210 }  } else {  }  }
/*      */   public final void minusAssign(@NotNull Iterable keys) { Intrinsics.checkNotNullParameter(keys, "keys"); int $i$f$minusAssign = 0; for (Object key : keys)
/*      */       remove((K)key);  }
/*      */   public final void minusAssign(@NotNull Sequence keys) { Intrinsics.checkNotNullParameter(keys, "keys"); int $i$f$minusAssign = 0; for (Object key : keys)
/* 1139 */       remove((K)key);  } @PublishedApi public final void removeValueAt(int index) { this._size--; MutableObjectFloatMap mutableObjectFloatMap = this; long value$iv = 254L; int $i$f$writeMetadata = 0; long[] m$iv = mutableObjectFloatMap.metadata;
/* 1140 */     int $i$f$writeRawMetadata = 0;
/* 1141 */     int i$iv$iv = index >> 3;
/* 1142 */     int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 1145 */     m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */     
/* 1147 */     int c$iv = mutableObjectFloatMap._capacity;
/* 1148 */     int cloneIndex$iv = (index - 7 & c$iv) + (
/* 1149 */       0x7 & c$iv);
/* 1150 */     int i = 0; int j = cloneIndex$iv >> 3; int k = (cloneIndex$iv & 0x7) << 3; m$iv[j] = m$iv[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << k; this.keys[index] = null; } public final void clear() { this._size = 0; if (this.metadata != ScatterMapKt.EmptyGroup) {
/*      */       ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, null); long[] arrayOfLong = this.metadata; int i = this._capacity; long value$iv = 255L; int $i$f$writeRawMetadata = 0;
/* 1152 */       int i$iv = i >> 3;
/* 1153 */       int b$iv = (i & 0x7) << 3;
/*      */ 
/*      */       
/* 1156 */       arrayOfLong[i$iv] = arrayOfLong[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv;
/*      */     }  ArraysKt.fill(this.keys, null, 0, this._capacity); initializeGrowth(); } private final int findIndex(Object key) { int $i$f$hash = 0;
/* 1158 */     int hash$iv = ((key != null) ? key.hashCode() : 0) * -862048943;
/*      */     
/* 1160 */     int hash = hash$iv ^ hash$iv << 16;
/* 1161 */     int $i$f$h1 = 0, hash1 = hash >>> 7;
/* 1162 */     int $i$f$h2 = 0, hash2 = hash & 0x7F; int probeMask = this._capacity; int probeOffset = hash1 & probeMask; int probeIndex = 0; while (true) {
/* 1163 */       long[] arrayOfLong = this.metadata; int $i$f$group = 0; int i$iv = probeOffset >> 3;
/* 1164 */       int b$iv = (probeOffset & 0x7) << 3;
/* 1165 */       long g = arrayOfLong[i$iv] >>> b$iv | arrayOfLong[i$iv + 1] << 64 - b$iv & -(b$iv) >> 63L; long $this$match$iv = g; int $i$f$match = 0;
/* 1166 */       long x$iv = $this$match$iv ^ 72340172838076673L * hash2;
/*      */       
/* 1168 */       long m = x$iv - 72340172838076673L & (x$iv ^ 0xFFFFFFFFFFFFFFFFL) & 0x8080808080808080L; while (true)
/* 1169 */       { long $this$hasNext$iv = m; int $i$f$hasNext = 0; if (($this$hasNext$iv != 0L)) {
/* 1170 */           long $this$get$iv = m; int $i$f$get = 0; long $this$lowestBitSet$iv$iv = $this$get$iv; int $i$f$lowestBitSet = 0;
/* 1171 */           int n = probeOffset + (Long.numberOfTrailingZeros($this$lowestBitSet$iv$iv) >> 3) & probeMask;
/*      */         }  long $this$maskEmpty$iv = g; int $i$f$maskEmpty = 0;
/* 1173 */         if (($this$maskEmpty$iv & ($this$maskEmpty$iv ^ 0xFFFFFFFFFFFFFFFFL) << 6L & 0x8080808080808080L) != 0L); break; }  probeIndex += 8; probeOffset = probeOffset + probeIndex & probeMask;
/* 1174 */     }  int index = findFirstAvailableSlot(hash1); if (this.growthLimit == 0) { long[] arrayOfLong = this.metadata; int $i$f$isDeleted = 0; int m = 0; if (!(((
/* 1175 */         arrayOfLong[index >> 3] >> (index & 0x7) << 3 & 0xFFL) == 254L) ? 1 : 0)) { adjustStorage(); index = findFirstAvailableSlot(hash1); }  }
/* 1176 */      this._size++; long[] metadata$iv = this.metadata; int $i$f$isEmpty = 0; int $i$f$readRawMetadata = 0; this.growthLimit -= (((
/* 1177 */       metadata$iv[index >> 3] >> (index & 0x7) << 3 & 0xFFL) == 128L)) ? 1 : 0; MutableObjectFloatMap mutableObjectFloatMap = this; long value$iv = hash2; int $i$f$writeMetadata = 0;
/* 1178 */     long[] m$iv = mutableObjectFloatMap.metadata;
/* 1179 */     int $i$f$writeRawMetadata = 0;
/* 1180 */     int i$iv$iv = index >> 3;
/* 1181 */     int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 1184 */     m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */     
/* 1186 */     int c$iv = mutableObjectFloatMap._capacity;
/* 1187 */     int cloneIndex$iv = (index - 7 & c$iv) + (
/* 1188 */       0x7 & c$iv);
/* 1189 */     int i = 0; int j = cloneIndex$iv >> 3; int k = (cloneIndex$iv & 0x7) << 3; m$iv[j] = m$iv[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << k; return index ^ 0xFFFFFFFF; } private final int findFirstAvailableSlot(int hash1) { int probeMask = this._capacity; int probeOffset = hash1 & probeMask; int probeIndex = 0; while (true)
/*      */     { long[] metadata$iv = this.metadata; int $i$f$group = 0;
/* 1191 */       int i$iv = probeOffset >> 3;
/* 1192 */       int b$iv = (probeOffset & 0x7) << 3;
/* 1193 */       long g = metadata$iv[i$iv] >>> b$iv | metadata$iv[i$iv + 1] << 64 - b$iv & -(b$iv) >> 63L; long $this$maskEmptyOrDeleted$iv = g; int $i$f$maskEmptyOrDeleted = 0;
/* 1194 */       long m = $this$maskEmptyOrDeleted$iv & ($this$maskEmptyOrDeleted$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L; if (m != 0L)
/* 1195 */       { long $this$lowestBitSet$iv = m; int $i$f$lowestBitSet = 0; return probeOffset + (Long.numberOfTrailingZeros($this$lowestBitSet$iv) >> 3) & probeMask; }  probeIndex += 8; probeOffset = probeOffset + probeIndex & probeMask; }  } public final int trim() { int previousCapacity = this._capacity; int newCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size)); if (newCapacity < previousCapacity) { resizeStorage(newCapacity); return previousCapacity - this._capacity; }  return 0; } private final void adjustStorage() { if (this._capacity > 8 && Long.compareUnsigned(ULong.constructor-impl(ULong.constructor-impl(this._size) * 32L), ULong.constructor-impl(ULong.constructor-impl(this._capacity) * 25L)) <= 0) { resizeStorage(ScatterMapKt.nextCapacity(this._capacity)); } else { resizeStorage(ScatterMapKt.nextCapacity(this._capacity)); }  }
/* 1196 */   private final void resizeStorage(int newCapacity) { long[] previousMetadata = this.metadata; Object[] previousKeys = this.keys; float[] previousValues = this.values; int previousCapacity = this._capacity; initializeStorage(newCapacity); Object[] newKeys = this.keys; float[] newValues = this.values; for (int i = 0; i < previousCapacity; i++) { int $i$f$isFull = 0; int $i$f$readRawMetadata = 0; if (((
/* 1197 */         previousMetadata[i >> 3] >> (i & 0x7) << 3 & 0xFFL) < 128L)) {
/* 1198 */         Object previousKey = previousKeys[i]; int $i$f$hash = 0; int hash$iv = ((previousKey != null) ? previousKey.hashCode() : 0) * -862048943;
/*      */         
/* 1200 */         int hash = hash$iv ^ hash$iv << 16;
/* 1201 */         int $i$f$h1 = 0, index = findFirstAvailableSlot(hash >>> 7); MutableObjectFloatMap mutableObjectFloatMap = this; int $i$f$h2 = 0;
/* 1202 */         long value$iv = (hash & 0x7F); int $i$f$writeMetadata = 0;
/* 1203 */         long[] m$iv = mutableObjectFloatMap.metadata;
/* 1204 */         int $i$f$writeRawMetadata = 0;
/* 1205 */         int i$iv$iv = index >> 3;
/* 1206 */         int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */         
/* 1209 */         m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */         
/* 1211 */         int c$iv = mutableObjectFloatMap._capacity;
/* 1212 */         int cloneIndex$iv = (index - 7 & c$iv) + (
/* 1213 */           0x7 & c$iv);
/* 1214 */         int j = 0; int k = cloneIndex$iv >> 3; int m = (cloneIndex$iv & 0x7) << 3; m$iv[k] = m$iv[k] & (255L << m ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << m; newKeys[index] = previousKey; newValues[index] = previousValues[i];
/*      */       }  }
/* 1216 */      } private final void writeMetadata(int index, long value) { int $i$f$writeMetadata = 0; long[] m = this.metadata; int $i$f$writeRawMetadata = 0; int i$iv = index >> 3;
/* 1217 */     int b$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 1220 */     m[i$iv] = m[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value << b$iv; int c = this._capacity; int cloneIndex = (index - 7 & c) + (0x7 & c);
/*      */     int i = 0;
/* 1222 */     int j = cloneIndex >> 3;
/* 1223 */     int k = (cloneIndex & 0x7) << 3;
/*      */ 
/*      */     
/* 1226 */     m[j] = m[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value << k; }
/*      */ 
/*      */   
/*      */   public MutableObjectFloatMap() {
/*      */     this(0, 1, (DefaultConstructorMarker)null);
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\MutableObjectFloatMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */