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
/*      */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\020\002\n\002\b\007\n\002\030\002\n\002\b\007\n\002\030\002\n\002\030\002\n\002\020\025\n\002\b\b\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\b\n\002\020\t\n\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\017\022\b\b\002\020\003\032\0020\004¢\006\002\020\005J\b\020\007\032\0020\bH\002J\006\020\t\032\0020\bJ\020\020\n\032\0020\0042\006\020\013\032\0020\004H\002J\020\020\f\032\0020\0042\006\020\r\032\0020\004H\002J'\020\016\032\0028\0002\006\020\013\032\0020\0042\f\020\017\032\b\022\004\022\0028\0000\020H\bø\001\000¢\006\002\020\021J\b\020\022\032\0020\bH\002J\020\020\023\032\0020\b2\006\020\024\032\0020\004H\002J\020\020\025\032\0020\b2\006\020\003\032\0020\004H\002J\021\020\026\032\0020\b2\006\020\027\032\0020\030H\nJ\021\020\026\032\0020\b2\006\020\027\032\0020\031H\nJ\021\020\026\032\0020\b2\006\020\013\032\0020\004H\nJ\021\020\026\032\0020\b2\006\020\027\032\0020\032H\nJ\027\020\033\032\0020\b2\f\020\034\032\b\022\004\022\0028\0000\002H\nJ\035\020\035\032\004\030\0018\0002\006\020\013\032\0020\0042\006\020\036\032\0028\000¢\006\002\020\037J\024\020 \032\0020\b2\f\020\034\032\b\022\004\022\0028\0000\002J\025\020!\032\004\030\0018\0002\006\020\013\032\0020\004¢\006\002\020\"J\033\020!\032\0020#2\006\020\013\032\0020\0042\006\020\036\032\0028\000¢\006\002\020$J&\020%\032\0020\b2\030\020&\032\024\022\004\022\0020\004\022\004\022\0028\000\022\004\022\0020#0'H\bø\001\000J\027\020(\032\004\030\0018\0002\006\020)\032\0020\004H\001¢\006\002\020\"J\020\020*\032\0020\b2\006\020+\032\0020\004H\002J\036\020,\032\0020\b2\006\020\013\032\0020\0042\006\020\036\032\0028\000H\002¢\006\002\020-J\006\020.\032\0020\004J\031\020/\032\0020\b2\006\020)\032\0020\0042\006\020\036\032\00200H\bR\016\020\006\032\0020\004X\016¢\006\002\n\000\002\007\n\005\b20\001¨\0061"}, d2 = {"Landroidx/collection/MutableIntObjectMap;", "V", "Landroidx/collection/IntObjectMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "clear", "findAbsoluteInsertIndex", "key", "findFirstAvailableSlot", "hash1", "getOrPut", "defaultValue", "Lkotlin/Function0;", "(ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "keys", "Landroidx/collection/IntList;", "Landroidx/collection/IntSet;", "", "plusAssign", "from", "put", "value", "(ILjava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "(I)Ljava/lang/Object;", "", "(ILjava/lang/Object;)Z", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "resizeStorage", "newCapacity", "set", "(ILjava/lang/Object;)V", "trim", "writeMetadata", "", "collection"})
/*      */ @SourceDebugExtension({"SMAP\nIntObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 5 IntSet.kt\nandroidx/collection/IntSetKt\n+ 6 IntSet.kt\nandroidx/collection/IntSet\n+ 7 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,1018:1\n820#1,2:1171\n820#1,2:1185\n1008#1,2:1188\n1012#1,5:1196\n1008#1,2:1227\n1012#1,5:1235\n1008#1,2:1252\n1012#1,5:1260\n1#2:1019\n1656#3,6:1020\n1810#3:1036\n1672#3:1040\n1603#3:1057\n1599#3:1060\n1779#3,3:1065\n1793#3,3:1069\n1717#3:1073\n1705#3:1075\n1699#3:1076\n1712#3:1081\n1802#3:1083\n1603#3:1097\n1599#3:1100\n1779#3,3:1105\n1793#3,3:1109\n1717#3:1113\n1705#3:1115\n1699#3:1116\n1712#3:1121\n1802#3:1123\n1810#3:1138\n1672#3:1142\n1810#3:1163\n1672#3:1167\n1656#3,6:1190\n1656#3,6:1201\n1599#3:1210\n1603#3:1211\n1779#3,3:1212\n1793#3,3:1215\n1717#3:1218\n1705#3:1219\n1699#3:1220\n1712#3:1221\n1802#3:1222\n1666#3:1223\n1645#3:1224\n1664#3:1225\n1645#3:1226\n1656#3,6:1229\n1779#3,3:1240\n1810#3:1243\n1699#3:1244\n1669#3:1245\n1645#3:1246\n1599#3:1250\n1603#3:1251\n1656#3,6:1254\n1656#3,6:1265\n1656#3,6:1271\n382#4,4:1026\n354#4,6:1030\n364#4,3:1037\n367#4,2:1041\n387#4,2:1043\n370#4,6:1045\n389#4:1051\n619#4:1052\n620#4:1056\n622#4,2:1058\n624#4,4:1061\n628#4:1068\n629#4:1072\n630#4:1074\n631#4,4:1077\n637#4:1082\n638#4,8:1084\n619#4:1092\n620#4:1096\n622#4,2:1098\n624#4,4:1101\n628#4:1108\n629#4:1112\n630#4:1114\n631#4,4:1117\n637#4:1122\n638#4,8:1124\n354#4,6:1132\n364#4,3:1139\n367#4,9:1143\n833#5,3:1053\n833#5,3:1093\n833#5,3:1207\n833#5,3:1247\n262#6,4:1152\n232#6,7:1156\n243#6,3:1164\n246#6,2:1168\n266#6:1170\n267#6:1173\n249#6,6:1174\n268#6:1180\n253#7,4:1181\n258#7:1187\n*S KotlinDebug\n*F\n+ 1 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n*L\n837#1:1171,2\n846#1:1185,2\n856#1:1188,2\n856#1:1196,5\n920#1:1227,2\n920#1:1235,5\n995#1:1252,2\n995#1:1260,5\n713#1:1020,6\n766#1:1036\n766#1:1040\n782#1:1057\n782#1:1060\n782#1:1065,3\n782#1:1069,3\n782#1:1073\n782#1:1075\n782#1:1076\n782#1:1081\n782#1:1083\n794#1:1097\n794#1:1100\n794#1:1105,3\n794#1:1109,3\n794#1:1113\n794#1:1115\n794#1:1116\n794#1:1121\n794#1:1123\n808#1:1138\n808#1:1142\n836#1:1163\n836#1:1167\n856#1:1190,6\n871#1:1201,6\n886#1:1210\n887#1:1211\n894#1:1212,3\n895#1:1215,3\n896#1:1218\n897#1:1219\n897#1:1220\n901#1:1221\n904#1:1222\n913#1:1223\n913#1:1224\n919#1:1225\n919#1:1226\n920#1:1229,6\n935#1:1240,3\n936#1:1243\n938#1:1244\n990#1:1245\n990#1:1246\n993#1:1250\n995#1:1251\n995#1:1254,6\n1009#1:1265,6\n1015#1:1271,6\n766#1:1026,4\n766#1:1030,6\n766#1:1037,3\n766#1:1041,2\n766#1:1043,2\n766#1:1045,6\n766#1:1051\n782#1:1052\n782#1:1056\n782#1:1058,2\n782#1:1061,4\n782#1:1068\n782#1:1072\n782#1:1074\n782#1:1077,4\n782#1:1082\n782#1:1084,8\n794#1:1092\n794#1:1096\n794#1:1098,2\n794#1:1101,4\n794#1:1108\n794#1:1112\n794#1:1114\n794#1:1117,4\n794#1:1122\n794#1:1124,8\n808#1:1132,6\n808#1:1139,3\n808#1:1143,9\n782#1:1053,3\n794#1:1093,3\n885#1:1207,3\n992#1:1247,3\n836#1:1152,4\n836#1:1156,7\n836#1:1164,3\n836#1:1168,2\n836#1:1170\n836#1:1173\n836#1:1174,6\n836#1:1180\n845#1:1181,4\n845#1:1187\n*E\n"})
/*      */ public final class MutableIntObjectMap<V>
/*      */   extends IntObjectMap<V>
/*      */ {
/*      */   private int growthLimit;
/*      */   
/*      */   public MutableIntObjectMap(int initialCapacity) {
/*  680 */     super(null);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  685 */     if (!((initialCapacity >= 0) ? 1 : 0))
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
/* 1019 */       int $i$a$-require-MutableIntObjectMap$1 = 0; String str = "Capacity must be a positive value."; throw new IllegalArgumentException(str.toString()); }  initializeStorage(ScatterMapKt.unloadedCapacity(initialCapacity));
/* 1020 */   } private final void initializeStorage(int initialCapacity) { int newCapacity = (initialCapacity > 0) ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0; this._capacity = newCapacity; initializeMetadata(newCapacity); this.keys = new int[newCapacity]; this.values = new Object[newCapacity]; } private final void initializeMetadata(int capacity) { int size = (capacity + 1 + 7 + 7 & 0xFFFFFFF8) >> 3; long[] arrayOfLong2 = new long[size], arrayOfLong3 = arrayOfLong2; MutableIntObjectMap mutableIntObjectMap = this; int $i$a$-apply-MutableIntObjectMap$initializeMetadata$1 = 0; ArraysKt.fill$default(arrayOfLong3, -9187201950435737472L, 0, 0, 6, null); mutableIntObjectMap.metadata = (capacity == 0) ? ScatterMapKt.EmptyGroup : arrayOfLong2; long arrayOfLong1[] = this.metadata, value$iv = 255L; int $i$f$writeRawMetadata = 0; int i$iv = capacity >> 3;
/* 1021 */     int b$iv = (capacity & 0x7) << 3;
/*      */ 
/*      */     
/* 1024 */     arrayOfLong1[i$iv] = arrayOfLong1[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv; initializeGrowth(); } private final void initializeGrowth() { this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size; }
/*      */   public final V getOrPut(int key, @NotNull Function0 defaultValue) { Intrinsics.checkNotNullParameter(defaultValue, "defaultValue"); int $i$f$getOrPut = 0; if (get(key) == null) { get(key); Object object1 = defaultValue.invoke(), it = object1; int $i$a$-also-MutableIntObjectMap$getOrPut$1 = 0; set(key, (V)it); }  return (V)object1; }
/* 1026 */   public final void putAll(@NotNull IntObjectMap from) { Intrinsics.checkNotNullParameter(from, "from"); IntObjectMap this_$iv = from; int $i$f$forEach = 0; int[] k$iv = this_$iv.keys;
/* 1027 */     Object[] v$iv = this_$iv.values;
/*      */     
/* 1029 */     IntObjectMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1030 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1031 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1033 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1034 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1035 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1036 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1037 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1038 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1047 */           if (bitCount$iv$iv == 8) {
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void set(int key, Object value) {
/*      */     int index = findAbsoluteInsertIndex(key);
/*      */     this.keys[index] = key;
/*      */     this.values[index] = value;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final V put(int key, Object value) {
/*      */     int index = findAbsoluteInsertIndex(key);
/*      */     Object oldValue = this.values[index];
/*      */     this.keys[index] = key;
/*      */     this.values[index] = value;
/*      */     return (V)oldValue;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void plusAssign(@NotNull IntObjectMap<V> from) {
/*      */     Intrinsics.checkNotNullParameter(from, "from");
/*      */     int $i$f$plusAssign = 0;
/*      */     putAll(from);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final V remove(int key) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: checkcast androidx/collection/IntObjectMap
/*      */     //   4: astore_3
/*      */     //   5: iconst_0
/*      */     //   6: istore #4
/*      */     //   8: iconst_0
/*      */     //   9: istore #5
/*      */     //   11: iload_1
/*      */     //   12: invokestatic hashCode : (I)I
/*      */     //   15: ldc -862048943
/*      */     //   17: imul
/*      */     //   18: istore #6
/*      */     //   20: iload #6
/*      */     //   22: iload #6
/*      */     //   24: bipush #16
/*      */     //   26: ishl
/*      */     //   27: ixor
/*      */     //   28: istore #7
/*      */     //   30: iconst_0
/*      */     //   31: istore #6
/*      */     //   33: iload #7
/*      */     //   35: bipush #127
/*      */     //   37: iand
/*      */     //   38: istore #5
/*      */     //   40: aload_3
/*      */     //   41: getfield _capacity : I
/*      */     //   44: istore #6
/*      */     //   46: iconst_0
/*      */     //   47: istore #8
/*      */     //   49: iload #7
/*      */     //   51: bipush #7
/*      */     //   53: iushr
/*      */     //   54: iload #6
/*      */     //   56: iand
/*      */     //   57: istore #9
/*      */     //   59: iconst_0
/*      */     //   60: istore #8
/*      */     //   62: nop
/*      */     //   63: aload_3
/*      */     //   64: getfield metadata : [J
/*      */     //   67: astore #10
/*      */     //   69: iconst_0
/*      */     //   70: istore #11
/*      */     //   72: iload #9
/*      */     //   74: iconst_3
/*      */     //   75: ishr
/*      */     //   76: istore #12
/*      */     //   78: iload #9
/*      */     //   80: bipush #7
/*      */     //   82: iand
/*      */     //   83: iconst_3
/*      */     //   84: ishl
/*      */     //   85: istore #13
/*      */     //   87: aload #10
/*      */     //   89: iload #12
/*      */     //   91: laload
/*      */     //   92: iload #13
/*      */     //   94: lushr
/*      */     //   95: aload #10
/*      */     //   97: iload #12
/*      */     //   99: iconst_1
/*      */     //   100: iadd
/*      */     //   101: laload
/*      */     //   102: bipush #64
/*      */     //   104: iload #13
/*      */     //   106: isub
/*      */     //   107: lshl
/*      */     //   108: iload #13
/*      */     //   110: i2l
/*      */     //   111: lneg
/*      */     //   112: bipush #63
/*      */     //   114: lshr
/*      */     //   115: land
/*      */     //   116: lor
/*      */     //   117: lstore #14
/*      */     //   119: lload #14
/*      */     //   121: lstore #16
/*      */     //   123: iconst_0
/*      */     //   124: istore #18
/*      */     //   126: lload #16
/*      */     //   128: ldc2_w 72340172838076673
/*      */     //   131: iload #5
/*      */     //   133: i2l
/*      */     //   134: lmul
/*      */     //   135: lxor
/*      */     //   136: lstore #19
/*      */     //   138: lload #19
/*      */     //   140: ldc2_w 72340172838076673
/*      */     //   143: lsub
/*      */     //   144: lload #19
/*      */     //   146: ldc2_w -1
/*      */     //   149: lxor
/*      */     //   150: land
/*      */     //   151: ldc2_w -9187201950435737472
/*      */     //   154: land
/*      */     //   155: lstore #21
/*      */     //   157: lload #21
/*      */     //   159: lstore #16
/*      */     //   161: iconst_0
/*      */     //   162: istore #18
/*      */     //   164: lload #16
/*      */     //   166: lconst_0
/*      */     //   167: lcmp
/*      */     //   168: ifeq -> 175
/*      */     //   171: iconst_1
/*      */     //   172: goto -> 176
/*      */     //   175: iconst_0
/*      */     //   176: ifeq -> 244
/*      */     //   179: iload #9
/*      */     //   181: lload #21
/*      */     //   183: lstore #23
/*      */     //   185: iconst_0
/*      */     //   186: istore #25
/*      */     //   188: lload #23
/*      */     //   190: lstore #26
/*      */     //   192: iconst_0
/*      */     //   193: istore #28
/*      */     //   195: lload #26
/*      */     //   197: invokestatic numberOfTrailingZeros : (J)I
/*      */     //   200: iconst_3
/*      */     //   201: ishr
/*      */     //   202: nop
/*      */     //   203: iadd
/*      */     //   204: iload #6
/*      */     //   206: iand
/*      */     //   207: istore #12
/*      */     //   209: aload_3
/*      */     //   210: getfield keys : [I
/*      */     //   213: iload #12
/*      */     //   215: iaload
/*      */     //   216: iload_1
/*      */     //   217: if_icmpne -> 225
/*      */     //   220: iload #12
/*      */     //   222: goto -> 293
/*      */     //   225: lload #21
/*      */     //   227: lstore #23
/*      */     //   229: iconst_0
/*      */     //   230: istore #25
/*      */     //   232: lload #23
/*      */     //   234: lload #23
/*      */     //   236: lconst_1
/*      */     //   237: lsub
/*      */     //   238: land
/*      */     //   239: lstore #21
/*      */     //   241: goto -> 157
/*      */     //   244: lload #14
/*      */     //   246: lstore #16
/*      */     //   248: iconst_0
/*      */     //   249: istore #18
/*      */     //   251: lload #16
/*      */     //   253: lload #16
/*      */     //   255: ldc2_w -1
/*      */     //   258: lxor
/*      */     //   259: bipush #6
/*      */     //   261: lshl
/*      */     //   262: land
/*      */     //   263: ldc2_w -9187201950435737472
/*      */     //   266: land
/*      */     //   267: lconst_0
/*      */     //   268: lcmp
/*      */     //   269: ifeq -> 275
/*      */     //   272: goto -> 292
/*      */     //   275: iinc #8, 8
/*      */     //   278: nop
/*      */     //   279: iload #9
/*      */     //   281: iload #8
/*      */     //   283: iadd
/*      */     //   284: iload #6
/*      */     //   286: iand
/*      */     //   287: istore #9
/*      */     //   289: goto -> 62
/*      */     //   292: iconst_m1
/*      */     //   293: istore_2
/*      */     //   294: iload_2
/*      */     //   295: iflt -> 304
/*      */     //   298: aload_0
/*      */     //   299: iload_2
/*      */     //   300: invokevirtual removeValueAt : (I)Ljava/lang/Object;
/*      */     //   303: areturn
/*      */     //   304: aconst_null
/*      */     //   305: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #782	-> 0
/*      */     //   #1052	-> 8
/*      */     //   #1053	-> 11
/*      */     //   #1055	-> 20
/*      */     //   #1052	-> 28
/*      */     //   #1056	-> 30
/*      */     //   #1057	-> 33
/*      */     //   #1056	-> 38
/*      */     //   #1058	-> 40
/*      */     //   #1059	-> 46
/*      */     //   #1060	-> 49
/*      */     //   #1059	-> 54
/*      */     //   #1061	-> 59
/*      */     //   #1063	-> 62
/*      */     //   #1064	-> 63
/*      */     //   #1065	-> 72
/*      */     //   #1066	-> 78
/*      */     //   #1067	-> 87
/*      */     //   #1064	-> 117
/*      */     //   #1068	-> 119
/*      */     //   #1069	-> 126
/*      */     //   #1071	-> 138
/*      */     //   #1068	-> 155
/*      */     //   #1072	-> 157
/*      */     //   #1073	-> 164
/*      */     //   #1074	-> 179
/*      */     //   #1075	-> 188
/*      */     //   #1076	-> 195
/*      */     //   #1076	-> 200
/*      */     //   #1075	-> 202
/*      */     //   #1074	-> 203
/*      */     //   #1077	-> 209
/*      */     //   #1078	-> 220
/*      */     //   #1080	-> 225
/*      */     //   #1081	-> 232
/*      */     //   #1080	-> 239
/*      */     //   #1082	-> 244
/*      */     //   #1083	-> 251
/*      */     //   #1082	-> 267
/*      */     //   #1084	-> 272
/*      */     //   #1087	-> 278
/*      */     //   #1088	-> 279
/*      */     //   #1091	-> 292
/*      */     //   #782	-> 293
/*      */     //   #783	-> 294
/*      */     //   #784	-> 298
/*      */     //   #786	-> 304
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   11	17	5	$i$f$hash	I
/*      */     //   20	8	6	hash$iv$iv	I
/*      */     //   33	5	6	$i$f$h2	I
/*      */     //   49	5	8	$i$f$h1	I
/*      */     //   72	45	11	$i$f$group	I
/*      */     //   78	39	12	i$iv$iv	I
/*      */     //   87	30	13	b$iv$iv	I
/*      */     //   69	48	10	metadata$iv$iv	[J
/*      */     //   126	29	18	$i$f$match	I
/*      */     //   138	17	19	x$iv$iv	J
/*      */     //   123	32	16	$this$match$iv$iv	J
/*      */     //   164	12	18	$i$f$hasNext	I
/*      */     //   161	15	16	$this$hasNext$iv$iv	J
/*      */     //   195	7	28	$i$f$lowestBitSet	I
/*      */     //   192	10	26	$this$lowestBitSet$iv$iv$iv	J
/*      */     //   188	15	25	$i$f$get	I
/*      */     //   185	18	23	$this$get$iv$iv	J
/*      */     //   232	7	25	$i$f$next	I
/*      */     //   229	10	23	$this$next$iv$iv	J
/*      */     //   209	32	12	index$iv	I
/*      */     //   251	16	18	$i$f$maskEmpty	I
/*      */     //   248	19	16	$this$maskEmpty$iv$iv	J
/*      */     //   119	170	14	g$iv	J
/*      */     //   157	132	21	m$iv	J
/*      */     //   8	285	4	$i$f$findKeyIndex$collection	I
/*      */     //   30	263	7	hash$iv	I
/*      */     //   40	253	5	hash2$iv	I
/*      */     //   46	247	6	probeMask$iv	I
/*      */     //   59	234	9	probeOffset$iv	I
/*      */     //   62	231	8	probeIndex$iv	I
/*      */     //   5	288	3	this_$iv	Landroidx/collection/IntObjectMap;
/*      */     //   294	12	2	index	I
/*      */     //   0	306	0	this	Landroidx/collection/MutableIntObjectMap;
/*      */     //   0	306	1	key	I
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean remove(int key, Object value) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: checkcast androidx/collection/IntObjectMap
/*      */     //   4: astore #4
/*      */     //   6: iconst_0
/*      */     //   7: istore #5
/*      */     //   9: iconst_0
/*      */     //   10: istore #6
/*      */     //   12: iload_1
/*      */     //   13: invokestatic hashCode : (I)I
/*      */     //   16: ldc -862048943
/*      */     //   18: imul
/*      */     //   19: istore #7
/*      */     //   21: iload #7
/*      */     //   23: iload #7
/*      */     //   25: bipush #16
/*      */     //   27: ishl
/*      */     //   28: ixor
/*      */     //   29: istore #8
/*      */     //   31: iconst_0
/*      */     //   32: istore #7
/*      */     //   34: iload #8
/*      */     //   36: bipush #127
/*      */     //   38: iand
/*      */     //   39: istore #6
/*      */     //   41: aload #4
/*      */     //   43: getfield _capacity : I
/*      */     //   46: istore #7
/*      */     //   48: iconst_0
/*      */     //   49: istore #9
/*      */     //   51: iload #8
/*      */     //   53: bipush #7
/*      */     //   55: iushr
/*      */     //   56: iload #7
/*      */     //   58: iand
/*      */     //   59: istore #10
/*      */     //   61: iconst_0
/*      */     //   62: istore #9
/*      */     //   64: nop
/*      */     //   65: aload #4
/*      */     //   67: getfield metadata : [J
/*      */     //   70: astore #11
/*      */     //   72: iconst_0
/*      */     //   73: istore #12
/*      */     //   75: iload #10
/*      */     //   77: iconst_3
/*      */     //   78: ishr
/*      */     //   79: istore #13
/*      */     //   81: iload #10
/*      */     //   83: bipush #7
/*      */     //   85: iand
/*      */     //   86: iconst_3
/*      */     //   87: ishl
/*      */     //   88: istore #14
/*      */     //   90: aload #11
/*      */     //   92: iload #13
/*      */     //   94: laload
/*      */     //   95: iload #14
/*      */     //   97: lushr
/*      */     //   98: aload #11
/*      */     //   100: iload #13
/*      */     //   102: iconst_1
/*      */     //   103: iadd
/*      */     //   104: laload
/*      */     //   105: bipush #64
/*      */     //   107: iload #14
/*      */     //   109: isub
/*      */     //   110: lshl
/*      */     //   111: iload #14
/*      */     //   113: i2l
/*      */     //   114: lneg
/*      */     //   115: bipush #63
/*      */     //   117: lshr
/*      */     //   118: land
/*      */     //   119: lor
/*      */     //   120: lstore #15
/*      */     //   122: lload #15
/*      */     //   124: lstore #17
/*      */     //   126: iconst_0
/*      */     //   127: istore #19
/*      */     //   129: lload #17
/*      */     //   131: ldc2_w 72340172838076673
/*      */     //   134: iload #6
/*      */     //   136: i2l
/*      */     //   137: lmul
/*      */     //   138: lxor
/*      */     //   139: lstore #20
/*      */     //   141: lload #20
/*      */     //   143: ldc2_w 72340172838076673
/*      */     //   146: lsub
/*      */     //   147: lload #20
/*      */     //   149: ldc2_w -1
/*      */     //   152: lxor
/*      */     //   153: land
/*      */     //   154: ldc2_w -9187201950435737472
/*      */     //   157: land
/*      */     //   158: lstore #22
/*      */     //   160: lload #22
/*      */     //   162: lstore #17
/*      */     //   164: iconst_0
/*      */     //   165: istore #19
/*      */     //   167: lload #17
/*      */     //   169: lconst_0
/*      */     //   170: lcmp
/*      */     //   171: ifeq -> 178
/*      */     //   174: iconst_1
/*      */     //   175: goto -> 179
/*      */     //   178: iconst_0
/*      */     //   179: ifeq -> 248
/*      */     //   182: iload #10
/*      */     //   184: lload #22
/*      */     //   186: lstore #24
/*      */     //   188: iconst_0
/*      */     //   189: istore #26
/*      */     //   191: lload #24
/*      */     //   193: lstore #27
/*      */     //   195: iconst_0
/*      */     //   196: istore #29
/*      */     //   198: lload #27
/*      */     //   200: invokestatic numberOfTrailingZeros : (J)I
/*      */     //   203: iconst_3
/*      */     //   204: ishr
/*      */     //   205: nop
/*      */     //   206: iadd
/*      */     //   207: iload #7
/*      */     //   209: iand
/*      */     //   210: istore #13
/*      */     //   212: aload #4
/*      */     //   214: getfield keys : [I
/*      */     //   217: iload #13
/*      */     //   219: iaload
/*      */     //   220: iload_1
/*      */     //   221: if_icmpne -> 229
/*      */     //   224: iload #13
/*      */     //   226: goto -> 297
/*      */     //   229: lload #22
/*      */     //   231: lstore #24
/*      */     //   233: iconst_0
/*      */     //   234: istore #26
/*      */     //   236: lload #24
/*      */     //   238: lload #24
/*      */     //   240: lconst_1
/*      */     //   241: lsub
/*      */     //   242: land
/*      */     //   243: lstore #22
/*      */     //   245: goto -> 160
/*      */     //   248: lload #15
/*      */     //   250: lstore #17
/*      */     //   252: iconst_0
/*      */     //   253: istore #19
/*      */     //   255: lload #17
/*      */     //   257: lload #17
/*      */     //   259: ldc2_w -1
/*      */     //   262: lxor
/*      */     //   263: bipush #6
/*      */     //   265: lshl
/*      */     //   266: land
/*      */     //   267: ldc2_w -9187201950435737472
/*      */     //   270: land
/*      */     //   271: lconst_0
/*      */     //   272: lcmp
/*      */     //   273: ifeq -> 279
/*      */     //   276: goto -> 296
/*      */     //   279: iinc #9, 8
/*      */     //   282: nop
/*      */     //   283: iload #10
/*      */     //   285: iload #9
/*      */     //   287: iadd
/*      */     //   288: iload #7
/*      */     //   290: iand
/*      */     //   291: istore #10
/*      */     //   293: goto -> 64
/*      */     //   296: iconst_m1
/*      */     //   297: istore_3
/*      */     //   298: iload_3
/*      */     //   299: iflt -> 323
/*      */     //   302: aload_0
/*      */     //   303: getfield values : [Ljava/lang/Object;
/*      */     //   306: iload_3
/*      */     //   307: aaload
/*      */     //   308: aload_2
/*      */     //   309: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   312: ifeq -> 323
/*      */     //   315: aload_0
/*      */     //   316: iload_3
/*      */     //   317: invokevirtual removeValueAt : (I)Ljava/lang/Object;
/*      */     //   320: pop
/*      */     //   321: iconst_1
/*      */     //   322: ireturn
/*      */     //   323: iconst_0
/*      */     //   324: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #794	-> 0
/*      */     //   #1092	-> 9
/*      */     //   #1093	-> 12
/*      */     //   #1095	-> 21
/*      */     //   #1092	-> 29
/*      */     //   #1096	-> 31
/*      */     //   #1097	-> 34
/*      */     //   #1096	-> 39
/*      */     //   #1098	-> 41
/*      */     //   #1099	-> 48
/*      */     //   #1100	-> 51
/*      */     //   #1099	-> 56
/*      */     //   #1101	-> 61
/*      */     //   #1103	-> 64
/*      */     //   #1104	-> 65
/*      */     //   #1105	-> 75
/*      */     //   #1106	-> 81
/*      */     //   #1107	-> 90
/*      */     //   #1104	-> 120
/*      */     //   #1108	-> 122
/*      */     //   #1109	-> 129
/*      */     //   #1111	-> 141
/*      */     //   #1108	-> 158
/*      */     //   #1112	-> 160
/*      */     //   #1113	-> 167
/*      */     //   #1114	-> 182
/*      */     //   #1115	-> 191
/*      */     //   #1116	-> 198
/*      */     //   #1116	-> 203
/*      */     //   #1115	-> 205
/*      */     //   #1114	-> 206
/*      */     //   #1117	-> 212
/*      */     //   #1118	-> 224
/*      */     //   #1120	-> 229
/*      */     //   #1121	-> 236
/*      */     //   #1120	-> 243
/*      */     //   #1122	-> 248
/*      */     //   #1123	-> 255
/*      */     //   #1122	-> 271
/*      */     //   #1124	-> 276
/*      */     //   #1127	-> 282
/*      */     //   #1128	-> 283
/*      */     //   #1131	-> 296
/*      */     //   #794	-> 297
/*      */     //   #795	-> 298
/*      */     //   #796	-> 302
/*      */     //   #797	-> 315
/*      */     //   #798	-> 321
/*      */     //   #801	-> 323
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   12	17	6	$i$f$hash	I
/*      */     //   21	8	7	hash$iv$iv	I
/*      */     //   34	5	7	$i$f$h2	I
/*      */     //   51	5	9	$i$f$h1	I
/*      */     //   75	45	12	$i$f$group	I
/*      */     //   81	39	13	i$iv$iv	I
/*      */     //   90	30	14	b$iv$iv	I
/*      */     //   72	48	11	metadata$iv$iv	[J
/*      */     //   129	29	19	$i$f$match	I
/*      */     //   141	17	20	x$iv$iv	J
/*      */     //   126	32	17	$this$match$iv$iv	J
/*      */     //   167	12	19	$i$f$hasNext	I
/*      */     //   164	15	17	$this$hasNext$iv$iv	J
/*      */     //   198	7	29	$i$f$lowestBitSet	I
/*      */     //   195	10	27	$this$lowestBitSet$iv$iv$iv	J
/*      */     //   191	15	26	$i$f$get	I
/*      */     //   188	18	24	$this$get$iv$iv	J
/*      */     //   236	7	26	$i$f$next	I
/*      */     //   233	10	24	$this$next$iv$iv	J
/*      */     //   212	33	13	index$iv	I
/*      */     //   255	16	19	$i$f$maskEmpty	I
/*      */     //   252	19	17	$this$maskEmpty$iv$iv	J
/*      */     //   122	171	15	g$iv	J
/*      */     //   160	133	22	m$iv	J
/*      */     //   9	288	5	$i$f$findKeyIndex$collection	I
/*      */     //   31	266	8	hash$iv	I
/*      */     //   41	256	6	hash2$iv	I
/*      */     //   48	249	7	probeMask$iv	I
/*      */     //   61	236	10	probeOffset$iv	I
/*      */     //   64	233	9	probeIndex$iv	I
/*      */     //   6	291	4	this_$iv	Landroidx/collection/IntObjectMap;
/*      */     //   298	27	3	index	I
/*      */     //   0	325	0	this	Landroidx/collection/MutableIntObjectMap;
/*      */     //   0	325	1	key	I
/*      */     //   0	325	2	value	Ljava/lang/Object;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void removeIf(@NotNull Function2 predicate) {
/*      */     Intrinsics.checkNotNullParameter(predicate, "predicate");
/*      */     int $i$f$removeIf = 0;
/*      */     IntObjectMap this_$iv = this;
/*      */     int $i$f$forEachIndexed = 0;
/* 1132 */     long[] m$iv = this_$iv.metadata;
/* 1133 */     int lastIndex$iv = m$iv.length - 2;
/*      */     
/* 1135 */     int i$iv = 0; if (i$iv <= lastIndex$iv) { while (true)
/* 1136 */       { long slot$iv = m$iv[i$iv];
/* 1137 */         long $this$maskEmptyOrDeleted$iv$iv = slot$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1138 */         if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1139 */         { int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/* 1140 */           for (int j$iv = 0;; j$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1148 */           if (bitCount$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv != lastIndex$iv) { i$iv++; continue; }  // Byte code: goto -> 219 }  } else {  }
/*      */   
/*      */   } public final void minusAssign(int key) { int $i$f$minusAssign = 0; remove(key); } public final void minusAssign(@NotNull int[] keys) { Intrinsics.checkNotNullParameter(keys, "keys"); int $i$f$minusAssign; byte b; int i; for ($i$f$minusAssign = 0, b = 0, i = keys.length; b < i; ) { int key = keys[b]; remove(key); b++; }
/*      */      }
/* 1153 */   public final void minusAssign(@NotNull IntSet keys) { Intrinsics.checkNotNullParameter(keys, "keys"); int $i$f$minusAssign = 0; IntSet this_$iv = keys; int $i$f$forEach = 0; int[] k$iv = this_$iv.elements;
/*      */     
/* 1155 */     IntSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1157 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1158 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1160 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1161 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1162 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1163 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1164 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1165 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1176 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break;
/*      */         }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 220
/*      */       }  }
/*      */     else {  }
/* 1182 */      } public final void minusAssign(@NotNull IntList keys) { Intrinsics.checkNotNullParameter(keys, "keys"); int $i$f$minusAssign = 0; IntList this_$iv = keys; int $i$f$forEach = 0; int[] content$iv = this_$iv.content;
/* 1183 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1184 */       int key = content$iv[i$iv], $i$a$-forEach-MutableIntObjectMap$minusAssign$2 = 0; MutableIntObjectMap mutableIntObjectMap = this; int j = 0;
/* 1185 */       mutableIntObjectMap.remove(key);
/*      */     }  } @PublishedApi @Nullable public final V removeValueAt(int index) { this._size--; MutableIntObjectMap mutableIntObjectMap = this; long value$iv = 254L;
/*      */     int $i$f$writeMetadata = 0;
/* 1188 */     long[] m$iv = mutableIntObjectMap.metadata;
/* 1189 */     int $i$f$writeRawMetadata = 0;
/* 1190 */     int i$iv$iv = index >> 3;
/* 1191 */     int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 1194 */     m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */     
/* 1196 */     int c$iv = mutableIntObjectMap._capacity;
/* 1197 */     int cloneIndex$iv = (index - 7 & c$iv) + (
/* 1198 */       0x7 & c$iv);
/* 1199 */     int i = 0; int j = cloneIndex$iv >> 3; int k = (cloneIndex$iv & 0x7) << 3; m$iv[j] = m$iv[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << k; Object oldValue = this.values[index]; this.values[index] = null; return (V)oldValue; } public final void clear() { this._size = 0; if (this.metadata != ScatterMapKt.EmptyGroup) {
/*      */       ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, null); long[] arrayOfLong = this.metadata; int i = this._capacity; long value$iv = 255L; int $i$f$writeRawMetadata = 0;
/* 1201 */       int i$iv = i >> 3;
/* 1202 */       int b$iv = (i & 0x7) << 3;
/*      */ 
/*      */       
/* 1205 */       arrayOfLong[i$iv] = arrayOfLong[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv;
/*      */     }  ArraysKt.fill(this.values, null, 0, this._capacity); initializeGrowth(); } private final int findAbsoluteInsertIndex(int key) { int $i$f$hash = 0;
/* 1207 */     int hash$iv = Integer.hashCode(key) * -862048943;
/*      */     
/* 1209 */     int hash = hash$iv ^ hash$iv << 16;
/* 1210 */     int $i$f$h1 = 0, hash1 = hash >>> 7;
/* 1211 */     int $i$f$h2 = 0, hash2 = hash & 0x7F; int probeMask = this._capacity; int probeOffset = hash1 & probeMask; int probeIndex = 0; while (true) {
/* 1212 */       long[] arrayOfLong = this.metadata; int $i$f$group = 0; int i$iv = probeOffset >> 3;
/* 1213 */       int b$iv = (probeOffset & 0x7) << 3;
/* 1214 */       long g = arrayOfLong[i$iv] >>> b$iv | arrayOfLong[i$iv + 1] << 64 - b$iv & -(b$iv) >> 63L; long $this$match$iv = g; int $i$f$match = 0;
/* 1215 */       long x$iv = $this$match$iv ^ 72340172838076673L * hash2;
/*      */       
/* 1217 */       long m = x$iv - 72340172838076673L & (x$iv ^ 0xFFFFFFFFFFFFFFFFL) & 0x8080808080808080L; while (true)
/* 1218 */       { long $this$hasNext$iv = m; int $i$f$hasNext = 0; if (($this$hasNext$iv != 0L)) {
/* 1219 */           long $this$get$iv = m; int $i$f$get = 0; long $this$lowestBitSet$iv$iv = $this$get$iv; int $i$f$lowestBitSet = 0;
/* 1220 */           int n = probeOffset + (Long.numberOfTrailingZeros($this$lowestBitSet$iv$iv) >> 3) & probeMask;
/*      */         }  long $this$maskEmpty$iv = g; int $i$f$maskEmpty = 0;
/* 1222 */         if (($this$maskEmpty$iv & ($this$maskEmpty$iv ^ 0xFFFFFFFFFFFFFFFFL) << 6L & 0x8080808080808080L) != 0L); break; }  probeIndex += 8; probeOffset = probeOffset + probeIndex & probeMask;
/* 1223 */     }  int index = findFirstAvailableSlot(hash1); if (this.growthLimit == 0) { long[] arrayOfLong = this.metadata; int $i$f$isDeleted = 0; int m = 0; if (!(((
/* 1224 */         arrayOfLong[index >> 3] >> (index & 0x7) << 3 & 0xFFL) == 254L) ? 1 : 0)) { adjustStorage(); index = findFirstAvailableSlot(hash1); }  }
/* 1225 */      this._size++; long[] metadata$iv = this.metadata; int $i$f$isEmpty = 0; int $i$f$readRawMetadata = 0; this.growthLimit -= (((
/* 1226 */       metadata$iv[index >> 3] >> (index & 0x7) << 3 & 0xFFL) == 128L)) ? 1 : 0; MutableIntObjectMap mutableIntObjectMap = this; long value$iv = hash2; int $i$f$writeMetadata = 0;
/* 1227 */     long[] m$iv = mutableIntObjectMap.metadata;
/* 1228 */     int $i$f$writeRawMetadata = 0;
/* 1229 */     int i$iv$iv = index >> 3;
/* 1230 */     int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 1233 */     m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */     
/* 1235 */     int c$iv = mutableIntObjectMap._capacity;
/* 1236 */     int cloneIndex$iv = (index - 7 & c$iv) + (
/* 1237 */       0x7 & c$iv);
/* 1238 */     int i = 0; int j = cloneIndex$iv >> 3; int k = (cloneIndex$iv & 0x7) << 3; m$iv[j] = m$iv[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << k; return index; } private final int findFirstAvailableSlot(int hash1) { int probeMask = this._capacity; int probeOffset = hash1 & probeMask; int probeIndex = 0; while (true)
/*      */     { long[] metadata$iv = this.metadata; int $i$f$group = 0;
/* 1240 */       int i$iv = probeOffset >> 3;
/* 1241 */       int b$iv = (probeOffset & 0x7) << 3;
/* 1242 */       long g = metadata$iv[i$iv] >>> b$iv | metadata$iv[i$iv + 1] << 64 - b$iv & -(b$iv) >> 63L; long $this$maskEmptyOrDeleted$iv = g; int $i$f$maskEmptyOrDeleted = 0;
/* 1243 */       long m = $this$maskEmptyOrDeleted$iv & ($this$maskEmptyOrDeleted$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L; if (m != 0L)
/* 1244 */       { long $this$lowestBitSet$iv = m; int $i$f$lowestBitSet = 0; return probeOffset + (Long.numberOfTrailingZeros($this$lowestBitSet$iv) >> 3) & probeMask; }  probeIndex += 8; probeOffset = probeOffset + probeIndex & probeMask; }  }
/* 1245 */   public final int trim() { int previousCapacity = this._capacity; int newCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size)); if (newCapacity < previousCapacity) { resizeStorage(newCapacity); return previousCapacity - this._capacity; }  return 0; } private final void resizeStorage(int newCapacity) { long[] previousMetadata = this.metadata; int[] previousKeys = this.keys; Object[] previousValues = this.values; int previousCapacity = this._capacity; initializeStorage(newCapacity); int[] newKeys = this.keys; Object[] newValues = this.values; for (int i = 0; i < previousCapacity; i++) { int $i$f$isFull = 0; int $i$f$readRawMetadata = 0; if (((
/* 1246 */         previousMetadata[i >> 3] >> (i & 0x7) << 3 & 0xFFL) < 128L))
/* 1247 */       { int previousKey = previousKeys[i]; int $i$f$hash = 0; int hash$iv = Integer.hashCode(previousKey) * -862048943;
/*      */         
/* 1249 */         int hash = hash$iv ^ hash$iv << 16;
/* 1250 */         int $i$f$h1 = 0, index = findFirstAvailableSlot(hash >>> 7); MutableIntObjectMap mutableIntObjectMap = this; int $i$f$h2 = 0;
/* 1251 */         long value$iv = (hash & 0x7F); int $i$f$writeMetadata = 0;
/* 1252 */         long[] m$iv = mutableIntObjectMap.metadata;
/* 1253 */         int $i$f$writeRawMetadata = 0;
/* 1254 */         int i$iv$iv = index >> 3;
/* 1255 */         int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */         
/* 1258 */         m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */         
/* 1260 */         int c$iv = mutableIntObjectMap._capacity;
/* 1261 */         int cloneIndex$iv = (index - 7 & c$iv) + (
/* 1262 */           0x7 & c$iv);
/* 1263 */         int j = 0; int k = cloneIndex$iv >> 3; int m = (cloneIndex$iv & 0x7) << 3; m$iv[k] = m$iv[k] & (255L << m ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << m; newKeys[index] = previousKey; newValues[index] = previousValues[i]; }  }  }
/*      */   private final void adjustStorage() { if (this._capacity > 8 && Long.compareUnsigned(ULong.constructor-impl(ULong.constructor-impl(this._size) * 32L), ULong.constructor-impl(ULong.constructor-impl(this._capacity) * 25L)) <= 0) { resizeStorage(ScatterMapKt.nextCapacity(this._capacity)); } else { resizeStorage(ScatterMapKt.nextCapacity(this._capacity)); }
/* 1265 */      } private final void writeMetadata(int index, long value) { int $i$f$writeMetadata = 0; long[] m = this.metadata; int $i$f$writeRawMetadata = 0; int i$iv = index >> 3;
/* 1266 */     int b$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 1269 */     m[i$iv] = m[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value << b$iv; int c = this._capacity; int cloneIndex = (index - 7 & c) + (0x7 & c);
/*      */     int i = 0;
/* 1271 */     int j = cloneIndex >> 3;
/* 1272 */     int k = (cloneIndex & 0x7) << 3;
/*      */ 
/*      */     
/* 1275 */     m[j] = m[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value << k; }
/*      */ 
/*      */   
/*      */   public MutableIntObjectMap() {
/*      */     this(0, 1, (DefaultConstructorMarker)null);
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\MutableIntObjectMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */