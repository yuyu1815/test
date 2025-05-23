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
/*      */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\020\002\n\002\b\003\n\002\020\t\n\002\b\004\n\002\030\002\n\002\b\007\n\002\030\002\n\002\030\002\n\002\020\026\n\002\b\b\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\n\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\017\022\b\b\002\020\003\032\0020\004¢\006\002\020\005J\b\020\007\032\0020\bH\002J\006\020\t\032\0020\bJ\020\020\n\032\0020\0042\006\020\013\032\0020\fH\002J\020\020\r\032\0020\0042\006\020\016\032\0020\004H\002J'\020\017\032\0028\0002\006\020\013\032\0020\f2\f\020\020\032\b\022\004\022\0028\0000\021H\bø\001\000¢\006\002\020\022J\b\020\023\032\0020\bH\002J\020\020\024\032\0020\b2\006\020\025\032\0020\004H\002J\020\020\026\032\0020\b2\006\020\003\032\0020\004H\002J\021\020\027\032\0020\b2\006\020\030\032\0020\031H\nJ\021\020\027\032\0020\b2\006\020\030\032\0020\032H\nJ\021\020\027\032\0020\b2\006\020\013\032\0020\fH\nJ\021\020\027\032\0020\b2\006\020\030\032\0020\033H\nJ\027\020\034\032\0020\b2\f\020\035\032\b\022\004\022\0028\0000\002H\nJ\035\020\036\032\004\030\0018\0002\006\020\013\032\0020\f2\006\020\037\032\0028\000¢\006\002\020 J\024\020!\032\0020\b2\f\020\035\032\b\022\004\022\0028\0000\002J\025\020\"\032\004\030\0018\0002\006\020\013\032\0020\f¢\006\002\020#J\033\020\"\032\0020$2\006\020\013\032\0020\f2\006\020\037\032\0028\000¢\006\002\020%J&\020&\032\0020\b2\030\020'\032\024\022\004\022\0020\f\022\004\022\0028\000\022\004\022\0020$0(H\bø\001\000J\027\020)\032\004\030\0018\0002\006\020*\032\0020\004H\001¢\006\002\020+J\020\020,\032\0020\b2\006\020-\032\0020\004H\002J\036\020.\032\0020\b2\006\020\013\032\0020\f2\006\020\037\032\0028\000H\002¢\006\002\020/J\006\0200\032\0020\004J\031\0201\032\0020\b2\006\020*\032\0020\0042\006\020\037\032\0020\fH\bR\016\020\006\032\0020\004X\016¢\006\002\n\000\002\007\n\005\b20\001¨\0062"}, d2 = {"Landroidx/collection/MutableLongObjectMap;", "V", "Landroidx/collection/LongObjectMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "clear", "findAbsoluteInsertIndex", "key", "", "findFirstAvailableSlot", "hash1", "getOrPut", "defaultValue", "Lkotlin/Function0;", "(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "keys", "Landroidx/collection/LongList;", "Landroidx/collection/LongSet;", "", "plusAssign", "from", "put", "value", "(JLjava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "(J)Ljava/lang/Object;", "", "(JLjava/lang/Object;)Z", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "(I)Ljava/lang/Object;", "resizeStorage", "newCapacity", "set", "(JLjava/lang/Object;)V", "trim", "writeMetadata", "collection"})
/*      */ @SourceDebugExtension({"SMAP\nLongObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongObjectMap.kt\nandroidx/collection/MutableLongObjectMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 5 LongSet.kt\nandroidx/collection/LongSetKt\n+ 6 LongSet.kt\nandroidx/collection/LongSet\n+ 7 LongList.kt\nandroidx/collection/LongList\n*L\n1#1,1018:1\n820#1,2:1171\n820#1,2:1185\n1008#1,2:1188\n1012#1,5:1196\n1008#1,2:1227\n1012#1,5:1235\n1008#1,2:1252\n1012#1,5:1260\n1#2:1019\n1656#3,6:1020\n1810#3:1036\n1672#3:1040\n1603#3:1057\n1599#3:1060\n1779#3,3:1065\n1793#3,3:1069\n1717#3:1073\n1705#3:1075\n1699#3:1076\n1712#3:1081\n1802#3:1083\n1603#3:1097\n1599#3:1100\n1779#3,3:1105\n1793#3,3:1109\n1717#3:1113\n1705#3:1115\n1699#3:1116\n1712#3:1121\n1802#3:1123\n1810#3:1138\n1672#3:1142\n1810#3:1163\n1672#3:1167\n1656#3,6:1190\n1656#3,6:1201\n1599#3:1210\n1603#3:1211\n1779#3,3:1212\n1793#3,3:1215\n1717#3:1218\n1705#3:1219\n1699#3:1220\n1712#3:1221\n1802#3:1222\n1666#3:1223\n1645#3:1224\n1664#3:1225\n1645#3:1226\n1656#3,6:1229\n1779#3,3:1240\n1810#3:1243\n1699#3:1244\n1669#3:1245\n1645#3:1246\n1599#3:1250\n1603#3:1251\n1656#3,6:1254\n1656#3,6:1265\n1656#3,6:1271\n382#4,4:1026\n354#4,6:1030\n364#4,3:1037\n367#4,2:1041\n387#4,2:1043\n370#4,6:1045\n389#4:1051\n619#4:1052\n620#4:1056\n622#4,2:1058\n624#4,4:1061\n628#4:1068\n629#4:1072\n630#4:1074\n631#4,4:1077\n637#4:1082\n638#4,8:1084\n619#4:1092\n620#4:1096\n622#4,2:1098\n624#4,4:1101\n628#4:1108\n629#4:1112\n630#4:1114\n631#4,4:1117\n637#4:1122\n638#4,8:1124\n354#4,6:1132\n364#4,3:1139\n367#4,9:1143\n833#5,3:1053\n833#5,3:1093\n833#5,3:1207\n833#5,3:1247\n262#6,4:1152\n232#6,7:1156\n243#6,3:1164\n246#6,2:1168\n266#6:1170\n267#6:1173\n249#6,6:1174\n268#6:1180\n253#7,4:1181\n258#7:1187\n*S KotlinDebug\n*F\n+ 1 LongObjectMap.kt\nandroidx/collection/MutableLongObjectMap\n*L\n837#1:1171,2\n846#1:1185,2\n856#1:1188,2\n856#1:1196,5\n920#1:1227,2\n920#1:1235,5\n995#1:1252,2\n995#1:1260,5\n713#1:1020,6\n766#1:1036\n766#1:1040\n782#1:1057\n782#1:1060\n782#1:1065,3\n782#1:1069,3\n782#1:1073\n782#1:1075\n782#1:1076\n782#1:1081\n782#1:1083\n794#1:1097\n794#1:1100\n794#1:1105,3\n794#1:1109,3\n794#1:1113\n794#1:1115\n794#1:1116\n794#1:1121\n794#1:1123\n808#1:1138\n808#1:1142\n836#1:1163\n836#1:1167\n856#1:1190,6\n871#1:1201,6\n886#1:1210\n887#1:1211\n894#1:1212,3\n895#1:1215,3\n896#1:1218\n897#1:1219\n897#1:1220\n901#1:1221\n904#1:1222\n913#1:1223\n913#1:1224\n919#1:1225\n919#1:1226\n920#1:1229,6\n935#1:1240,3\n936#1:1243\n938#1:1244\n990#1:1245\n990#1:1246\n993#1:1250\n995#1:1251\n995#1:1254,6\n1009#1:1265,6\n1015#1:1271,6\n766#1:1026,4\n766#1:1030,6\n766#1:1037,3\n766#1:1041,2\n766#1:1043,2\n766#1:1045,6\n766#1:1051\n782#1:1052\n782#1:1056\n782#1:1058,2\n782#1:1061,4\n782#1:1068\n782#1:1072\n782#1:1074\n782#1:1077,4\n782#1:1082\n782#1:1084,8\n794#1:1092\n794#1:1096\n794#1:1098,2\n794#1:1101,4\n794#1:1108\n794#1:1112\n794#1:1114\n794#1:1117,4\n794#1:1122\n794#1:1124,8\n808#1:1132,6\n808#1:1139,3\n808#1:1143,9\n782#1:1053,3\n794#1:1093,3\n885#1:1207,3\n992#1:1247,3\n836#1:1152,4\n836#1:1156,7\n836#1:1164,3\n836#1:1168,2\n836#1:1170\n836#1:1173\n836#1:1174,6\n836#1:1180\n845#1:1181,4\n845#1:1187\n*E\n"})
/*      */ public final class MutableLongObjectMap<V>
/*      */   extends LongObjectMap<V>
/*      */ {
/*      */   private int growthLimit;
/*      */   
/*      */   public MutableLongObjectMap(int initialCapacity) {
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
/* 1019 */       int $i$a$-require-MutableLongObjectMap$1 = 0; String str = "Capacity must be a positive value."; throw new IllegalArgumentException(str.toString()); }  initializeStorage(ScatterMapKt.unloadedCapacity(initialCapacity));
/* 1020 */   } private final void initializeStorage(int initialCapacity) { int newCapacity = (initialCapacity > 0) ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0; this._capacity = newCapacity; initializeMetadata(newCapacity); this.keys = new long[newCapacity]; this.values = new Object[newCapacity]; } private final void initializeMetadata(int capacity) { int size = (capacity + 1 + 7 + 7 & 0xFFFFFFF8) >> 3; long[] arrayOfLong2 = new long[size], arrayOfLong3 = arrayOfLong2; MutableLongObjectMap mutableLongObjectMap = this; int $i$a$-apply-MutableLongObjectMap$initializeMetadata$1 = 0; ArraysKt.fill$default(arrayOfLong3, -9187201950435737472L, 0, 0, 6, null); mutableLongObjectMap.metadata = (capacity == 0) ? ScatterMapKt.EmptyGroup : arrayOfLong2; long arrayOfLong1[] = this.metadata, value$iv = 255L; int $i$f$writeRawMetadata = 0; int i$iv = capacity >> 3;
/* 1021 */     int b$iv = (capacity & 0x7) << 3;
/*      */ 
/*      */     
/* 1024 */     arrayOfLong1[i$iv] = arrayOfLong1[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv; initializeGrowth(); } private final void initializeGrowth() { this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size; }
/*      */   public final V getOrPut(long key, @NotNull Function0 defaultValue) { Intrinsics.checkNotNullParameter(defaultValue, "defaultValue"); int $i$f$getOrPut = 0; if (get(key) == null) { get(key); Object object1 = defaultValue.invoke(), it = object1; int $i$a$-also-MutableLongObjectMap$getOrPut$1 = 0; set(key, (V)it); }  return (V)object1; }
/* 1026 */   public final void putAll(@NotNull LongObjectMap from) { Intrinsics.checkNotNullParameter(from, "from"); LongObjectMap this_$iv = from; int $i$f$forEach = 0; long[] k$iv = this_$iv.keys;
/* 1027 */     Object[] v$iv = this_$iv.values;
/*      */     
/* 1029 */     LongObjectMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
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
/*      */   public final void set(long key, Object value) {
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
/*      */   public final V put(long key, Object value) {
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
/*      */   public final void plusAssign(@NotNull LongObjectMap<V> from) {
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
/*      */   public final V remove(long key) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: checkcast androidx/collection/LongObjectMap
/*      */     //   4: astore #4
/*      */     //   6: iconst_0
/*      */     //   7: istore #5
/*      */     //   9: iconst_0
/*      */     //   10: istore #6
/*      */     //   12: lload_1
/*      */     //   13: invokestatic hashCode : (J)I
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
/*      */     //   179: ifeq -> 249
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
/*      */     //   214: getfield keys : [J
/*      */     //   217: iload #13
/*      */     //   219: laload
/*      */     //   220: lload_1
/*      */     //   221: lcmp
/*      */     //   222: ifne -> 230
/*      */     //   225: iload #13
/*      */     //   227: goto -> 298
/*      */     //   230: lload #22
/*      */     //   232: lstore #24
/*      */     //   234: iconst_0
/*      */     //   235: istore #26
/*      */     //   237: lload #24
/*      */     //   239: lload #24
/*      */     //   241: lconst_1
/*      */     //   242: lsub
/*      */     //   243: land
/*      */     //   244: lstore #22
/*      */     //   246: goto -> 160
/*      */     //   249: lload #15
/*      */     //   251: lstore #17
/*      */     //   253: iconst_0
/*      */     //   254: istore #19
/*      */     //   256: lload #17
/*      */     //   258: lload #17
/*      */     //   260: ldc2_w -1
/*      */     //   263: lxor
/*      */     //   264: bipush #6
/*      */     //   266: lshl
/*      */     //   267: land
/*      */     //   268: ldc2_w -9187201950435737472
/*      */     //   271: land
/*      */     //   272: lconst_0
/*      */     //   273: lcmp
/*      */     //   274: ifeq -> 280
/*      */     //   277: goto -> 297
/*      */     //   280: iinc #9, 8
/*      */     //   283: nop
/*      */     //   284: iload #10
/*      */     //   286: iload #9
/*      */     //   288: iadd
/*      */     //   289: iload #7
/*      */     //   291: iand
/*      */     //   292: istore #10
/*      */     //   294: goto -> 64
/*      */     //   297: iconst_m1
/*      */     //   298: istore_3
/*      */     //   299: iload_3
/*      */     //   300: iflt -> 309
/*      */     //   303: aload_0
/*      */     //   304: iload_3
/*      */     //   305: invokevirtual removeValueAt : (I)Ljava/lang/Object;
/*      */     //   308: areturn
/*      */     //   309: aconst_null
/*      */     //   310: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #782	-> 0
/*      */     //   #1052	-> 9
/*      */     //   #1053	-> 12
/*      */     //   #1055	-> 21
/*      */     //   #1052	-> 29
/*      */     //   #1056	-> 31
/*      */     //   #1057	-> 34
/*      */     //   #1056	-> 39
/*      */     //   #1058	-> 41
/*      */     //   #1059	-> 48
/*      */     //   #1060	-> 51
/*      */     //   #1059	-> 56
/*      */     //   #1061	-> 61
/*      */     //   #1063	-> 64
/*      */     //   #1064	-> 65
/*      */     //   #1065	-> 75
/*      */     //   #1066	-> 81
/*      */     //   #1067	-> 90
/*      */     //   #1064	-> 120
/*      */     //   #1068	-> 122
/*      */     //   #1069	-> 129
/*      */     //   #1071	-> 141
/*      */     //   #1068	-> 158
/*      */     //   #1072	-> 160
/*      */     //   #1073	-> 167
/*      */     //   #1074	-> 182
/*      */     //   #1075	-> 191
/*      */     //   #1076	-> 198
/*      */     //   #1076	-> 203
/*      */     //   #1075	-> 205
/*      */     //   #1074	-> 206
/*      */     //   #1077	-> 212
/*      */     //   #1078	-> 225
/*      */     //   #1080	-> 230
/*      */     //   #1081	-> 237
/*      */     //   #1080	-> 244
/*      */     //   #1082	-> 249
/*      */     //   #1083	-> 256
/*      */     //   #1082	-> 272
/*      */     //   #1084	-> 277
/*      */     //   #1087	-> 283
/*      */     //   #1088	-> 284
/*      */     //   #1091	-> 297
/*      */     //   #782	-> 298
/*      */     //   #783	-> 299
/*      */     //   #784	-> 303
/*      */     //   #786	-> 309
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
/*      */     //   237	7	26	$i$f$next	I
/*      */     //   234	10	24	$this$next$iv$iv	J
/*      */     //   212	34	13	index$iv	I
/*      */     //   256	16	19	$i$f$maskEmpty	I
/*      */     //   253	19	17	$this$maskEmpty$iv$iv	J
/*      */     //   122	172	15	g$iv	J
/*      */     //   160	134	22	m$iv	J
/*      */     //   9	289	5	$i$f$findKeyIndex$collection	I
/*      */     //   31	267	8	hash$iv	I
/*      */     //   41	257	6	hash2$iv	I
/*      */     //   48	250	7	probeMask$iv	I
/*      */     //   61	237	10	probeOffset$iv	I
/*      */     //   64	234	9	probeIndex$iv	I
/*      */     //   6	292	4	this_$iv	Landroidx/collection/LongObjectMap;
/*      */     //   299	12	3	index	I
/*      */     //   0	311	0	this	Landroidx/collection/MutableLongObjectMap;
/*      */     //   0	311	1	key	J
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean remove(long key, Object value) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: checkcast androidx/collection/LongObjectMap
/*      */     //   4: astore #5
/*      */     //   6: iconst_0
/*      */     //   7: istore #6
/*      */     //   9: iconst_0
/*      */     //   10: istore #7
/*      */     //   12: lload_1
/*      */     //   13: invokestatic hashCode : (J)I
/*      */     //   16: ldc -862048943
/*      */     //   18: imul
/*      */     //   19: istore #8
/*      */     //   21: iload #8
/*      */     //   23: iload #8
/*      */     //   25: bipush #16
/*      */     //   27: ishl
/*      */     //   28: ixor
/*      */     //   29: istore #9
/*      */     //   31: iconst_0
/*      */     //   32: istore #8
/*      */     //   34: iload #9
/*      */     //   36: bipush #127
/*      */     //   38: iand
/*      */     //   39: istore #7
/*      */     //   41: aload #5
/*      */     //   43: getfield _capacity : I
/*      */     //   46: istore #8
/*      */     //   48: iconst_0
/*      */     //   49: istore #10
/*      */     //   51: iload #9
/*      */     //   53: bipush #7
/*      */     //   55: iushr
/*      */     //   56: iload #8
/*      */     //   58: iand
/*      */     //   59: istore #11
/*      */     //   61: iconst_0
/*      */     //   62: istore #10
/*      */     //   64: nop
/*      */     //   65: aload #5
/*      */     //   67: getfield metadata : [J
/*      */     //   70: astore #12
/*      */     //   72: iconst_0
/*      */     //   73: istore #13
/*      */     //   75: iload #11
/*      */     //   77: iconst_3
/*      */     //   78: ishr
/*      */     //   79: istore #14
/*      */     //   81: iload #11
/*      */     //   83: bipush #7
/*      */     //   85: iand
/*      */     //   86: iconst_3
/*      */     //   87: ishl
/*      */     //   88: istore #15
/*      */     //   90: aload #12
/*      */     //   92: iload #14
/*      */     //   94: laload
/*      */     //   95: iload #15
/*      */     //   97: lushr
/*      */     //   98: aload #12
/*      */     //   100: iload #14
/*      */     //   102: iconst_1
/*      */     //   103: iadd
/*      */     //   104: laload
/*      */     //   105: bipush #64
/*      */     //   107: iload #15
/*      */     //   109: isub
/*      */     //   110: lshl
/*      */     //   111: iload #15
/*      */     //   113: i2l
/*      */     //   114: lneg
/*      */     //   115: bipush #63
/*      */     //   117: lshr
/*      */     //   118: land
/*      */     //   119: lor
/*      */     //   120: lstore #16
/*      */     //   122: lload #16
/*      */     //   124: lstore #18
/*      */     //   126: iconst_0
/*      */     //   127: istore #20
/*      */     //   129: lload #18
/*      */     //   131: ldc2_w 72340172838076673
/*      */     //   134: iload #7
/*      */     //   136: i2l
/*      */     //   137: lmul
/*      */     //   138: lxor
/*      */     //   139: lstore #21
/*      */     //   141: lload #21
/*      */     //   143: ldc2_w 72340172838076673
/*      */     //   146: lsub
/*      */     //   147: lload #21
/*      */     //   149: ldc2_w -1
/*      */     //   152: lxor
/*      */     //   153: land
/*      */     //   154: ldc2_w -9187201950435737472
/*      */     //   157: land
/*      */     //   158: lstore #23
/*      */     //   160: lload #23
/*      */     //   162: lstore #18
/*      */     //   164: iconst_0
/*      */     //   165: istore #20
/*      */     //   167: lload #18
/*      */     //   169: lconst_0
/*      */     //   170: lcmp
/*      */     //   171: ifeq -> 178
/*      */     //   174: iconst_1
/*      */     //   175: goto -> 179
/*      */     //   178: iconst_0
/*      */     //   179: ifeq -> 249
/*      */     //   182: iload #11
/*      */     //   184: lload #23
/*      */     //   186: lstore #25
/*      */     //   188: iconst_0
/*      */     //   189: istore #27
/*      */     //   191: lload #25
/*      */     //   193: lstore #28
/*      */     //   195: iconst_0
/*      */     //   196: istore #30
/*      */     //   198: lload #28
/*      */     //   200: invokestatic numberOfTrailingZeros : (J)I
/*      */     //   203: iconst_3
/*      */     //   204: ishr
/*      */     //   205: nop
/*      */     //   206: iadd
/*      */     //   207: iload #8
/*      */     //   209: iand
/*      */     //   210: istore #14
/*      */     //   212: aload #5
/*      */     //   214: getfield keys : [J
/*      */     //   217: iload #14
/*      */     //   219: laload
/*      */     //   220: lload_1
/*      */     //   221: lcmp
/*      */     //   222: ifne -> 230
/*      */     //   225: iload #14
/*      */     //   227: goto -> 298
/*      */     //   230: lload #23
/*      */     //   232: lstore #25
/*      */     //   234: iconst_0
/*      */     //   235: istore #27
/*      */     //   237: lload #25
/*      */     //   239: lload #25
/*      */     //   241: lconst_1
/*      */     //   242: lsub
/*      */     //   243: land
/*      */     //   244: lstore #23
/*      */     //   246: goto -> 160
/*      */     //   249: lload #16
/*      */     //   251: lstore #18
/*      */     //   253: iconst_0
/*      */     //   254: istore #20
/*      */     //   256: lload #18
/*      */     //   258: lload #18
/*      */     //   260: ldc2_w -1
/*      */     //   263: lxor
/*      */     //   264: bipush #6
/*      */     //   266: lshl
/*      */     //   267: land
/*      */     //   268: ldc2_w -9187201950435737472
/*      */     //   271: land
/*      */     //   272: lconst_0
/*      */     //   273: lcmp
/*      */     //   274: ifeq -> 280
/*      */     //   277: goto -> 297
/*      */     //   280: iinc #10, 8
/*      */     //   283: nop
/*      */     //   284: iload #11
/*      */     //   286: iload #10
/*      */     //   288: iadd
/*      */     //   289: iload #8
/*      */     //   291: iand
/*      */     //   292: istore #11
/*      */     //   294: goto -> 64
/*      */     //   297: iconst_m1
/*      */     //   298: istore #4
/*      */     //   300: iload #4
/*      */     //   302: iflt -> 328
/*      */     //   305: aload_0
/*      */     //   306: getfield values : [Ljava/lang/Object;
/*      */     //   309: iload #4
/*      */     //   311: aaload
/*      */     //   312: aload_3
/*      */     //   313: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   316: ifeq -> 328
/*      */     //   319: aload_0
/*      */     //   320: iload #4
/*      */     //   322: invokevirtual removeValueAt : (I)Ljava/lang/Object;
/*      */     //   325: pop
/*      */     //   326: iconst_1
/*      */     //   327: ireturn
/*      */     //   328: iconst_0
/*      */     //   329: ireturn
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
/*      */     //   #1118	-> 225
/*      */     //   #1120	-> 230
/*      */     //   #1121	-> 237
/*      */     //   #1120	-> 244
/*      */     //   #1122	-> 249
/*      */     //   #1123	-> 256
/*      */     //   #1122	-> 272
/*      */     //   #1124	-> 277
/*      */     //   #1127	-> 283
/*      */     //   #1128	-> 284
/*      */     //   #1131	-> 297
/*      */     //   #794	-> 298
/*      */     //   #795	-> 300
/*      */     //   #796	-> 305
/*      */     //   #797	-> 319
/*      */     //   #798	-> 326
/*      */     //   #801	-> 328
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   12	17	7	$i$f$hash	I
/*      */     //   21	8	8	hash$iv$iv	I
/*      */     //   34	5	8	$i$f$h2	I
/*      */     //   51	5	10	$i$f$h1	I
/*      */     //   75	45	13	$i$f$group	I
/*      */     //   81	39	14	i$iv$iv	I
/*      */     //   90	30	15	b$iv$iv	I
/*      */     //   72	48	12	metadata$iv$iv	[J
/*      */     //   129	29	20	$i$f$match	I
/*      */     //   141	17	21	x$iv$iv	J
/*      */     //   126	32	18	$this$match$iv$iv	J
/*      */     //   167	12	20	$i$f$hasNext	I
/*      */     //   164	15	18	$this$hasNext$iv$iv	J
/*      */     //   198	7	30	$i$f$lowestBitSet	I
/*      */     //   195	10	28	$this$lowestBitSet$iv$iv$iv	J
/*      */     //   191	15	27	$i$f$get	I
/*      */     //   188	18	25	$this$get$iv$iv	J
/*      */     //   237	7	27	$i$f$next	I
/*      */     //   234	10	25	$this$next$iv$iv	J
/*      */     //   212	34	14	index$iv	I
/*      */     //   256	16	20	$i$f$maskEmpty	I
/*      */     //   253	19	18	$this$maskEmpty$iv$iv	J
/*      */     //   122	172	16	g$iv	J
/*      */     //   160	134	23	m$iv	J
/*      */     //   9	289	6	$i$f$findKeyIndex$collection	I
/*      */     //   31	267	9	hash$iv	I
/*      */     //   41	257	7	hash2$iv	I
/*      */     //   48	250	8	probeMask$iv	I
/*      */     //   61	237	11	probeOffset$iv	I
/*      */     //   64	234	10	probeIndex$iv	I
/*      */     //   6	292	5	this_$iv	Landroidx/collection/LongObjectMap;
/*      */     //   300	30	4	index	I
/*      */     //   0	330	0	this	Landroidx/collection/MutableLongObjectMap;
/*      */     //   0	330	1	key	J
/*      */     //   0	330	3	value	Ljava/lang/Object;
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
/*      */     LongObjectMap this_$iv = this;
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
/*      */   } public final void minusAssign(long key) { int $i$f$minusAssign = 0; remove(key); } public final void minusAssign(@NotNull long[] keys) { Intrinsics.checkNotNullParameter(keys, "keys"); int $i$f$minusAssign; byte b; int i; for ($i$f$minusAssign = 0, b = 0, i = keys.length; b < i; ) { long key = keys[b]; remove(key); b++; }
/*      */      }
/* 1153 */   public final void minusAssign(@NotNull LongSet keys) { Intrinsics.checkNotNullParameter(keys, "keys"); int $i$f$minusAssign = 0; LongSet this_$iv = keys; int $i$f$forEach = 0; long[] k$iv = this_$iv.elements;
/*      */     
/* 1155 */     LongSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
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
/* 1182 */      } public final void minusAssign(@NotNull LongList keys) { Intrinsics.checkNotNullParameter(keys, "keys"); int $i$f$minusAssign = 0; LongList this_$iv = keys; int $i$f$forEach = 0; long[] content$iv = this_$iv.content;
/* 1183 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1184 */       long key = content$iv[i$iv]; int $i$a$-forEach-MutableLongObjectMap$minusAssign$2 = 0; MutableLongObjectMap mutableLongObjectMap = this; int j = 0;
/* 1185 */       mutableLongObjectMap.remove(key);
/*      */     }  } @PublishedApi @Nullable public final V removeValueAt(int index) { this._size--; MutableLongObjectMap mutableLongObjectMap = this; long value$iv = 254L;
/*      */     int $i$f$writeMetadata = 0;
/* 1188 */     long[] m$iv = mutableLongObjectMap.metadata;
/* 1189 */     int $i$f$writeRawMetadata = 0;
/* 1190 */     int i$iv$iv = index >> 3;
/* 1191 */     int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 1194 */     m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */     
/* 1196 */     int c$iv = mutableLongObjectMap._capacity;
/* 1197 */     int cloneIndex$iv = (index - 7 & c$iv) + (
/* 1198 */       0x7 & c$iv);
/* 1199 */     int i = 0; int j = cloneIndex$iv >> 3; int k = (cloneIndex$iv & 0x7) << 3; m$iv[j] = m$iv[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << k; Object oldValue = this.values[index]; this.values[index] = null; return (V)oldValue; } public final void clear() { this._size = 0; if (this.metadata != ScatterMapKt.EmptyGroup) {
/*      */       ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, null); long[] arrayOfLong = this.metadata; int i = this._capacity; long value$iv = 255L; int $i$f$writeRawMetadata = 0;
/* 1201 */       int i$iv = i >> 3;
/* 1202 */       int b$iv = (i & 0x7) << 3;
/*      */ 
/*      */       
/* 1205 */       arrayOfLong[i$iv] = arrayOfLong[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv;
/*      */     }  ArraysKt.fill(this.values, null, 0, this._capacity); initializeGrowth(); } private final int findAbsoluteInsertIndex(long key) { int $i$f$hash = 0;
/* 1207 */     int hash$iv = Long.hashCode(key) * -862048943;
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
/* 1226 */       metadata$iv[index >> 3] >> (index & 0x7) << 3 & 0xFFL) == 128L)) ? 1 : 0; MutableLongObjectMap mutableLongObjectMap = this; long value$iv = hash2; int $i$f$writeMetadata = 0;
/* 1227 */     long[] m$iv = mutableLongObjectMap.metadata;
/* 1228 */     int $i$f$writeRawMetadata = 0;
/* 1229 */     int i$iv$iv = index >> 3;
/* 1230 */     int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 1233 */     m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */     
/* 1235 */     int c$iv = mutableLongObjectMap._capacity;
/* 1236 */     int cloneIndex$iv = (index - 7 & c$iv) + (
/* 1237 */       0x7 & c$iv);
/* 1238 */     int i = 0; int j = cloneIndex$iv >> 3; int k = (cloneIndex$iv & 0x7) << 3; m$iv[j] = m$iv[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << k; return index; } private final int findFirstAvailableSlot(int hash1) { int probeMask = this._capacity; int probeOffset = hash1 & probeMask; int probeIndex = 0; while (true)
/*      */     { long[] metadata$iv = this.metadata; int $i$f$group = 0;
/* 1240 */       int i$iv = probeOffset >> 3;
/* 1241 */       int b$iv = (probeOffset & 0x7) << 3;
/* 1242 */       long g = metadata$iv[i$iv] >>> b$iv | metadata$iv[i$iv + 1] << 64 - b$iv & -(b$iv) >> 63L; long $this$maskEmptyOrDeleted$iv = g; int $i$f$maskEmptyOrDeleted = 0;
/* 1243 */       long m = $this$maskEmptyOrDeleted$iv & ($this$maskEmptyOrDeleted$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L; if (m != 0L)
/* 1244 */       { long $this$lowestBitSet$iv = m; int $i$f$lowestBitSet = 0; return probeOffset + (Long.numberOfTrailingZeros($this$lowestBitSet$iv) >> 3) & probeMask; }  probeIndex += 8; probeOffset = probeOffset + probeIndex & probeMask; }  }
/* 1245 */   public final int trim() { int previousCapacity = this._capacity; int newCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size)); if (newCapacity < previousCapacity) { resizeStorage(newCapacity); return previousCapacity - this._capacity; }  return 0; } private final void resizeStorage(int newCapacity) { long[] previousMetadata = this.metadata; long[] previousKeys = this.keys; Object[] previousValues = this.values; int previousCapacity = this._capacity; initializeStorage(newCapacity); long[] newKeys = this.keys; Object[] newValues = this.values; for (int i = 0; i < previousCapacity; i++) { int $i$f$isFull = 0; int $i$f$readRawMetadata = 0; if (((
/* 1246 */         previousMetadata[i >> 3] >> (i & 0x7) << 3 & 0xFFL) < 128L))
/* 1247 */       { long previousKey = previousKeys[i]; int $i$f$hash = 0; int hash$iv = Long.hashCode(previousKey) * -862048943;
/*      */         
/* 1249 */         int hash = hash$iv ^ hash$iv << 16;
/* 1250 */         int $i$f$h1 = 0, index = findFirstAvailableSlot(hash >>> 7); MutableLongObjectMap mutableLongObjectMap = this; int $i$f$h2 = 0;
/* 1251 */         long value$iv = (hash & 0x7F); int $i$f$writeMetadata = 0;
/* 1252 */         long[] m$iv = mutableLongObjectMap.metadata;
/* 1253 */         int $i$f$writeRawMetadata = 0;
/* 1254 */         int i$iv$iv = index >> 3;
/* 1255 */         int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */         
/* 1258 */         m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */         
/* 1260 */         int c$iv = mutableLongObjectMap._capacity;
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
/*      */   public MutableLongObjectMap() {
/*      */     this(0, 1, (DefaultConstructorMarker)null);
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\MutableLongObjectMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */