/*      */ package androidx.collection;
/*      */ 
/*      */ import androidx.annotation.IntRange;
/*      */ import java.util.Collection;
/*      */ import java.util.Iterator;
/*      */ import java.util.Set;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.PublishedApi;
/*      */ import kotlin.ULong;
/*      */ import kotlin.Unit;
/*      */ import kotlin.collections.ArraysKt;
/*      */ import kotlin.coroutines.Continuation;
/*      */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*      */ import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.jvm.internal.markers.KMutableIterator;
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
/*      */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\004\n\002\030\002\n\002\020\021\n\000\n\002\020\034\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020#\n\002\b\023\n\002\030\002\n\002\b\005\n\002\020\t\n\002\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002:\0010B\017\022\b\b\002\020\003\032\0020\004¢\006\002\020\005J\023\020\007\032\0020\b2\006\020\t\032\0028\000¢\006\002\020\nJ\024\020\013\032\0020\b2\f\020\f\032\b\022\004\022\0028\0000\rJ\024\020\013\032\0020\b2\f\020\f\032\b\022\004\022\0028\0000\002J\033\020\013\032\0020\b2\016\020\f\032\n\022\006\b\001\022\0028\0000\016¢\006\002\020\017J\024\020\013\032\0020\b2\f\020\f\032\b\022\004\022\0028\0000\020J\024\020\013\032\0020\b2\f\020\f\032\b\022\004\022\0028\0000\021J\b\020\022\032\0020\023H\002J\f\020\024\032\b\022\004\022\0028\0000\025J\006\020\026\032\0020\023J\025\020\027\032\0020\0042\006\020\t\032\0028\000H\002¢\006\002\020\030J\020\020\031\032\0020\0042\006\020\032\032\0020\004H\002J\b\020\033\032\0020\023H\002J\020\020\034\032\0020\0232\006\020\035\032\0020\004H\002J\020\020\036\032\0020\0232\006\020\003\032\0020\004H\002J\026\020\037\032\0020\0232\006\020\t\032\0028\000H\002¢\006\002\020 J\027\020\037\032\0020\0232\f\020\f\032\b\022\004\022\0028\0000\rH\002J\027\020\037\032\0020\0232\f\020\f\032\b\022\004\022\0028\0000\002H\002J\036\020\037\032\0020\0232\016\020\f\032\n\022\006\b\001\022\0028\0000\016H\002¢\006\002\020!J\027\020\037\032\0020\0232\f\020\f\032\b\022\004\022\0028\0000\020H\002J\027\020\037\032\0020\0232\f\020\f\032\b\022\004\022\0028\0000\021H\002J\026\020\"\032\0020\0232\006\020\t\032\0028\000H\002¢\006\002\020 J\027\020\"\032\0020\0232\f\020\f\032\b\022\004\022\0028\0000\rH\002J\027\020\"\032\0020\0232\f\020\f\032\b\022\004\022\0028\0000\002H\002J\036\020\"\032\0020\0232\016\020\f\032\n\022\006\b\001\022\0028\0000\016H\002¢\006\002\020!J\027\020\"\032\0020\0232\f\020\f\032\b\022\004\022\0028\0000\020H\002J\027\020\"\032\0020\0232\f\020\f\032\b\022\004\022\0028\0000\021H\002J\023\020#\032\0020\b2\006\020\t\032\0028\000¢\006\002\020\nJ\024\020$\032\0020\b2\f\020\f\032\b\022\004\022\0028\0000\rJ\024\020$\032\0020\b2\f\020\f\032\b\022\004\022\0028\0000\002J\033\020$\032\0020\b2\016\020\f\032\n\022\006\b\001\022\0028\0000\016¢\006\002\020\017J\024\020$\032\0020\b2\f\020\f\032\b\022\004\022\0028\0000\020J\024\020$\032\0020\b2\f\020\f\032\b\022\004\022\0028\0000\021J\020\020%\032\0020\0232\006\020&\032\0020\004H\001J \020'\032\0020\0232\022\020(\032\016\022\004\022\0028\000\022\004\022\0020\b0)H\bø\001\000J\020\020*\032\0020\0232\006\020+\032\0020\004H\002J\b\020,\032\0020\004H\007J\031\020-\032\0020\0232\006\020&\032\0020\0042\006\020.\032\0020/H\bR\016\020\006\032\0020\004X\016¢\006\002\n\000\002\007\n\005\b20\001¨\0061"}, d2 = {"Landroidx/collection/MutableScatterSet;", "E", "Landroidx/collection/ScatterSet;", "initialCapacity", "", "(I)V", "growthLimit", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "Landroidx/collection/ObjectList;", "", "([Ljava/lang/Object;)Z", "", "Lkotlin/sequences/Sequence;", "adjustStorage", "", "asMutableSet", "", "clear", "findAbsoluteInsertIndex", "(Ljava/lang/Object;)I", "findFirstAvailableSlot", "hash1", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "(Ljava/lang/Object;)V", "([Ljava/lang/Object;)V", "plusAssign", "remove", "removeAll", "removeElementAt", "index", "removeIf", "predicate", "Lkotlin/Function1;", "resizeStorage", "newCapacity", "trim", "writeMetadata", "value", "", "MutableSetWrapper", "collection"})
/*      */ @SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 8 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1084:1\n1002#1,2:1269\n1006#1,5:1277\n1002#1,2:1308\n1006#1,5:1316\n1002#1,2:1333\n1006#1,5:1341\n1#2:1085\n1656#3,6:1086\n1810#3:1109\n1672#3:1113\n1589#3,3:1132\n1603#3:1136\n1599#3:1139\n1779#3,3:1143\n1793#3,3:1147\n1717#3:1151\n1705#3:1153\n1699#3:1154\n1712#3:1159\n1802#3:1161\n1589#3,3:1171\n1603#3:1175\n1599#3:1178\n1779#3,3:1182\n1793#3,3:1186\n1717#3:1190\n1705#3:1192\n1699#3:1193\n1712#3:1198\n1802#3:1200\n1810#3:1226\n1672#3:1230\n1810#3:1255\n1672#3:1259\n1656#3,6:1271\n1656#3,6:1282\n1589#3,3:1288\n1599#3:1291\n1603#3:1292\n1779#3,3:1293\n1793#3,3:1296\n1717#3:1299\n1705#3:1300\n1699#3:1301\n1712#3:1302\n1802#3:1303\n1666#3:1304\n1645#3:1305\n1664#3:1306\n1645#3:1307\n1656#3,6:1310\n1779#3,3:1321\n1810#3:1324\n1699#3:1325\n1669#3:1326\n1645#3:1327\n1589#3,3:1328\n1599#3:1331\n1603#3:1332\n1656#3,6:1335\n1656#3,6:1346\n1656#3,6:1352\n13579#4,2:1092\n13579#4,2:1209\n1855#5,2:1094\n1855#5,2:1213\n1295#6,2:1096\n1295#6,2:1211\n267#7,4:1098\n237#7,7:1102\n248#7,3:1110\n251#7,2:1114\n272#7,2:1116\n254#7,6:1118\n274#7:1124\n433#7:1131\n434#7:1135\n436#7,2:1137\n438#7,3:1140\n441#7:1146\n442#7:1150\n443#7:1152\n444#7,4:1155\n450#7:1160\n451#7,8:1162\n433#7:1170\n434#7:1174\n436#7,2:1176\n438#7,3:1179\n441#7:1185\n442#7:1189\n443#7:1191\n444#7,4:1194\n450#7:1199\n451#7,8:1201\n267#7,4:1215\n237#7,7:1219\n248#7,3:1227\n251#7,2:1231\n272#7,2:1233\n254#7,6:1235\n274#7:1241\n237#7,7:1248\n248#7,3:1256\n251#7,9:1260\n305#8,6:1125\n305#8,6:1242\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n857#1:1269,2\n857#1:1277,5\n917#1:1308,2\n917#1:1316,5\n990#1:1333,2\n990#1:1341,5\n567#1:1086,6\n692#1:1109\n692#1:1113\n714#1:1132,3\n714#1:1136\n714#1:1139\n714#1:1143,3\n714#1:1147,3\n714#1:1151\n714#1:1153\n714#1:1154\n714#1:1159\n714#1:1161\n727#1:1171,3\n727#1:1175\n727#1:1178\n727#1:1182,3\n727#1:1186,3\n727#1:1190\n727#1:1192\n727#1:1193\n727#1:1198\n727#1:1200\n823#1:1226\n823#1:1230\n843#1:1255\n843#1:1259\n857#1:1271,6\n868#1:1282,6\n882#1:1288,3\n883#1:1291\n884#1:1292\n891#1:1293,3\n892#1:1296,3\n893#1:1299\n894#1:1300\n894#1:1301\n898#1:1302\n901#1:1303\n910#1:1304\n910#1:1305\n916#1:1306\n916#1:1307\n917#1:1310,6\n931#1:1321,3\n932#1:1324\n934#1:1325\n985#1:1326\n985#1:1327\n987#1:1328,3\n988#1:1331\n990#1:1332\n990#1:1335,6\n1003#1:1346,6\n1009#1:1352,6\n662#1:1092,2\n793#1:1209,2\n672#1:1094,2\n813#1:1213,2\n682#1:1096,2\n803#1:1211,2\n692#1:1098,4\n692#1:1102,7\n692#1:1110,3\n692#1:1114,2\n692#1:1116,2\n692#1:1118,6\n692#1:1124\n714#1:1131\n714#1:1135\n714#1:1137,2\n714#1:1140,3\n714#1:1146\n714#1:1150\n714#1:1152\n714#1:1155,4\n714#1:1160\n714#1:1162,8\n727#1:1170\n727#1:1174\n727#1:1176,2\n727#1:1179,3\n727#1:1185\n727#1:1189\n727#1:1191\n727#1:1194,4\n727#1:1199\n727#1:1201,8\n823#1:1215,4\n823#1:1219,7\n823#1:1227,3\n823#1:1231,2\n823#1:1233,2\n823#1:1235,6\n823#1:1241\n843#1:1248,7\n843#1:1256,3\n843#1:1260,9\n702#1:1125,6\n833#1:1242,6\n*E\n"})
/*      */ public final class MutableScatterSet<E>
/*      */   extends ScatterSet<E>
/*      */ {
/*      */   private int growthLimit;
/*      */   
/*      */   public MutableScatterSet(int initialCapacity) {
/*  535 */     super(null);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  540 */     if (!((initialCapacity >= 0) ? 1 : 0))
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
/* 1085 */       int $i$a$-require-MutableScatterSet$1 = 0; String str = "Capacity must be a positive value."; throw new IllegalArgumentException(str.toString()); }  initializeStorage(ScatterMapKt.unloadedCapacity(initialCapacity));
/* 1086 */   } private final void initializeStorage(int initialCapacity) { int newCapacity = (initialCapacity > 0) ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0; this._capacity = newCapacity; initializeMetadata(newCapacity); this.elements = new Object[newCapacity]; } private final void initializeMetadata(int capacity) { int size = (capacity + 1 + 7 + 7 & 0xFFFFFFF8) >> 3; long[] arrayOfLong2 = new long[size], arrayOfLong3 = arrayOfLong2; MutableScatterSet mutableScatterSet = this; int $i$a$-apply-MutableScatterSet$initializeMetadata$1 = 0; ArraysKt.fill$default(arrayOfLong3, -9187201950435737472L, 0, 0, 6, null); mutableScatterSet.metadata = (capacity == 0) ? ScatterMapKt.EmptyGroup : arrayOfLong2; long arrayOfLong1[] = this.metadata, value$iv = 255L; int $i$f$writeRawMetadata = 0; int i$iv = capacity >> 3;
/* 1087 */     int b$iv = (capacity & 0x7) << 3;
/*      */ 
/*      */     
/* 1090 */     arrayOfLong1[i$iv] = arrayOfLong1[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv; initializeGrowth(); }
/*      */   private final void initializeGrowth() { this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size; }
/* 1092 */   public final boolean add(Object element) { int oldSize = getSize(); int index = findAbsoluteInsertIndex((E)element); this.elements[index] = element; return (getSize() != oldSize); } public final void plusAssign(Object element) { int index = findAbsoluteInsertIndex((E)element); this.elements[index] = element; } public final boolean addAll(@NotNull Object[] elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int oldSize = getSize(); plusAssign((E[])elements); return (oldSize != getSize()); } public final void plusAssign(@NotNull Object[] elements) { Intrinsics.checkNotNullParameter(elements, "elements"); Object[] $this$forEach$iv = elements; int $i$f$forEach = 0; byte b = 0; int i = $this$forEach$iv.length; if (b < i) { Object element$iv = $this$forEach$iv[b], element = element$iv; int $i$a$-forEach-MutableScatterSet$plusAssign$1 = 0; plusAssign((E)element); }  }
/*      */   public final boolean addAll(@NotNull Iterable<? extends E> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int oldSize = getSize(); plusAssign(elements); return (oldSize != getSize()); }
/* 1094 */   public final boolean addAll(@NotNull Sequence<? extends E> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int oldSize = getSize(); plusAssign(elements); return (oldSize != getSize()); } public final boolean addAll(@NotNull ScatterSet<E> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int oldSize = getSize(); plusAssign(elements); return (oldSize != getSize()); } public final boolean addAll(@NotNull ObjectList<E> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int oldSize = getSize(); plusAssign(elements); return (oldSize != getSize()); } public final void plusAssign(@NotNull Iterable elements) { Intrinsics.checkNotNullParameter(elements, "elements"); Iterable $this$forEach$iv = elements; int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(), element = element$iv; int $i$a$-forEach-MutableScatterSet$plusAssign$2 = 0; plusAssign((E)element); }
/*      */      } public final void plusAssign(@NotNull Sequence elements) { Intrinsics.checkNotNullParameter(elements, "elements"); Sequence $this$forEach$iv = elements; int $i$f$forEach = 0;
/* 1096 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(), element = element$iv; int $i$a$-forEach-MutableScatterSet$plusAssign$3 = 0; plusAssign((E)element); }
/*      */      } public final void plusAssign(@NotNull ScatterSet elements) { Intrinsics.checkNotNullParameter(elements, "elements"); ScatterSet this_$iv = elements;
/*      */     int $i$f$forEach = 0;
/* 1099 */     Object[] k$iv = this_$iv.elements;
/*      */     
/* 1101 */     ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1103 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1104 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1106 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1107 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1108 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1109 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1110 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1111 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1120 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break;
/*      */         }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 207
/*      */       }  }
/*      */     else {  }
/* 1126 */      } public final void plusAssign(@NotNull ObjectList elements) { Intrinsics.checkNotNullParameter(elements, "elements"); ObjectList this_$iv = elements; int $i$f$forEach = 0; Object[] content$iv = this_$iv.content;
/* 1127 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1128 */       Object element = content$iv[i$iv]; int $i$a$-forEach-MutableScatterSet$plusAssign$5 = 0;
/*      */       plusAssign((E)element);
/*      */     }  }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean remove(Object element) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: checkcast androidx/collection/ScatterSet
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
/*      */     //   24: ldc -862048943
/*      */     //   26: imul
/*      */     //   27: istore #6
/*      */     //   29: iload #6
/*      */     //   31: iload #6
/*      */     //   33: bipush #16
/*      */     //   35: ishl
/*      */     //   36: ixor
/*      */     //   37: istore #7
/*      */     //   39: iconst_0
/*      */     //   40: istore #6
/*      */     //   42: iload #7
/*      */     //   44: bipush #127
/*      */     //   46: iand
/*      */     //   47: istore #5
/*      */     //   49: aload_3
/*      */     //   50: getfield _capacity : I
/*      */     //   53: istore #6
/*      */     //   55: iconst_0
/*      */     //   56: istore #8
/*      */     //   58: iload #7
/*      */     //   60: bipush #7
/*      */     //   62: iushr
/*      */     //   63: iload #6
/*      */     //   65: iand
/*      */     //   66: istore #9
/*      */     //   68: iconst_0
/*      */     //   69: istore #8
/*      */     //   71: nop
/*      */     //   72: aload_3
/*      */     //   73: getfield metadata : [J
/*      */     //   76: astore #10
/*      */     //   78: iconst_0
/*      */     //   79: istore #11
/*      */     //   81: iload #9
/*      */     //   83: iconst_3
/*      */     //   84: ishr
/*      */     //   85: istore #12
/*      */     //   87: iload #9
/*      */     //   89: bipush #7
/*      */     //   91: iand
/*      */     //   92: iconst_3
/*      */     //   93: ishl
/*      */     //   94: istore #13
/*      */     //   96: aload #10
/*      */     //   98: iload #12
/*      */     //   100: laload
/*      */     //   101: iload #13
/*      */     //   103: lushr
/*      */     //   104: aload #10
/*      */     //   106: iload #12
/*      */     //   108: iconst_1
/*      */     //   109: iadd
/*      */     //   110: laload
/*      */     //   111: bipush #64
/*      */     //   113: iload #13
/*      */     //   115: isub
/*      */     //   116: lshl
/*      */     //   117: iload #13
/*      */     //   119: i2l
/*      */     //   120: lneg
/*      */     //   121: bipush #63
/*      */     //   123: lshr
/*      */     //   124: land
/*      */     //   125: lor
/*      */     //   126: lstore #14
/*      */     //   128: lload #14
/*      */     //   130: lstore #16
/*      */     //   132: iconst_0
/*      */     //   133: istore #18
/*      */     //   135: lload #16
/*      */     //   137: ldc2_w 72340172838076673
/*      */     //   140: iload #5
/*      */     //   142: i2l
/*      */     //   143: lmul
/*      */     //   144: lxor
/*      */     //   145: lstore #19
/*      */     //   147: lload #19
/*      */     //   149: ldc2_w 72340172838076673
/*      */     //   152: lsub
/*      */     //   153: lload #19
/*      */     //   155: ldc2_w -1
/*      */     //   158: lxor
/*      */     //   159: land
/*      */     //   160: ldc2_w -9187201950435737472
/*      */     //   163: land
/*      */     //   164: lstore #21
/*      */     //   166: lload #21
/*      */     //   168: lstore #16
/*      */     //   170: iconst_0
/*      */     //   171: istore #18
/*      */     //   173: lload #16
/*      */     //   175: lconst_0
/*      */     //   176: lcmp
/*      */     //   177: ifeq -> 184
/*      */     //   180: iconst_1
/*      */     //   181: goto -> 185
/*      */     //   184: iconst_0
/*      */     //   185: ifeq -> 256
/*      */     //   188: iload #9
/*      */     //   190: lload #21
/*      */     //   192: lstore #23
/*      */     //   194: iconst_0
/*      */     //   195: istore #25
/*      */     //   197: lload #23
/*      */     //   199: lstore #26
/*      */     //   201: iconst_0
/*      */     //   202: istore #28
/*      */     //   204: lload #26
/*      */     //   206: invokestatic numberOfTrailingZeros : (J)I
/*      */     //   209: iconst_3
/*      */     //   210: ishr
/*      */     //   211: nop
/*      */     //   212: iadd
/*      */     //   213: iload #6
/*      */     //   215: iand
/*      */     //   216: istore #12
/*      */     //   218: aload_3
/*      */     //   219: getfield elements : [Ljava/lang/Object;
/*      */     //   222: iload #12
/*      */     //   224: aaload
/*      */     //   225: aload_1
/*      */     //   226: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   229: ifeq -> 237
/*      */     //   232: iload #12
/*      */     //   234: goto -> 305
/*      */     //   237: lload #21
/*      */     //   239: lstore #23
/*      */     //   241: iconst_0
/*      */     //   242: istore #25
/*      */     //   244: lload #23
/*      */     //   246: lload #23
/*      */     //   248: lconst_1
/*      */     //   249: lsub
/*      */     //   250: land
/*      */     //   251: lstore #21
/*      */     //   253: goto -> 166
/*      */     //   256: lload #14
/*      */     //   258: lstore #16
/*      */     //   260: iconst_0
/*      */     //   261: istore #18
/*      */     //   263: lload #16
/*      */     //   265: lload #16
/*      */     //   267: ldc2_w -1
/*      */     //   270: lxor
/*      */     //   271: bipush #6
/*      */     //   273: lshl
/*      */     //   274: land
/*      */     //   275: ldc2_w -9187201950435737472
/*      */     //   278: land
/*      */     //   279: lconst_0
/*      */     //   280: lcmp
/*      */     //   281: ifeq -> 287
/*      */     //   284: goto -> 304
/*      */     //   287: iinc #8, 8
/*      */     //   290: nop
/*      */     //   291: iload #9
/*      */     //   293: iload #8
/*      */     //   295: iadd
/*      */     //   296: iload #6
/*      */     //   298: iand
/*      */     //   299: istore #9
/*      */     //   301: goto -> 71
/*      */     //   304: iconst_m1
/*      */     //   305: istore_2
/*      */     //   306: iload_2
/*      */     //   307: iflt -> 314
/*      */     //   310: iconst_1
/*      */     //   311: goto -> 315
/*      */     //   314: iconst_0
/*      */     //   315: istore_3
/*      */     //   316: iload_3
/*      */     //   317: ifeq -> 325
/*      */     //   320: aload_0
/*      */     //   321: iload_2
/*      */     //   322: invokevirtual removeElementAt : (I)V
/*      */     //   325: iload_3
/*      */     //   326: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #714	-> 0
/*      */     //   #1131	-> 8
/*      */     //   #1132	-> 11
/*      */     //   #1132	-> 24
/*      */     //   #1134	-> 29
/*      */     //   #1131	-> 37
/*      */     //   #1135	-> 39
/*      */     //   #1136	-> 42
/*      */     //   #1135	-> 47
/*      */     //   #1137	-> 49
/*      */     //   #1138	-> 55
/*      */     //   #1139	-> 58
/*      */     //   #1138	-> 63
/*      */     //   #1140	-> 68
/*      */     //   #1141	-> 71
/*      */     //   #1142	-> 72
/*      */     //   #1143	-> 81
/*      */     //   #1144	-> 87
/*      */     //   #1145	-> 96
/*      */     //   #1142	-> 126
/*      */     //   #1146	-> 128
/*      */     //   #1147	-> 135
/*      */     //   #1149	-> 147
/*      */     //   #1146	-> 164
/*      */     //   #1150	-> 166
/*      */     //   #1151	-> 173
/*      */     //   #1152	-> 188
/*      */     //   #1153	-> 197
/*      */     //   #1154	-> 204
/*      */     //   #1154	-> 209
/*      */     //   #1153	-> 211
/*      */     //   #1152	-> 212
/*      */     //   #1155	-> 218
/*      */     //   #1156	-> 232
/*      */     //   #1158	-> 237
/*      */     //   #1159	-> 244
/*      */     //   #1158	-> 251
/*      */     //   #1160	-> 256
/*      */     //   #1161	-> 263
/*      */     //   #1160	-> 279
/*      */     //   #1162	-> 284
/*      */     //   #1165	-> 290
/*      */     //   #1166	-> 291
/*      */     //   #1169	-> 304
/*      */     //   #714	-> 305
/*      */     //   #715	-> 306
/*      */     //   #716	-> 316
/*      */     //   #717	-> 320
/*      */     //   #719	-> 325
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   11	26	5	$i$f$hash	I
/*      */     //   29	8	6	hash$iv$iv	I
/*      */     //   42	5	6	$i$f$h2	I
/*      */     //   58	5	8	$i$f$h1	I
/*      */     //   81	45	11	$i$f$group	I
/*      */     //   87	39	12	i$iv$iv	I
/*      */     //   96	30	13	b$iv$iv	I
/*      */     //   78	48	10	metadata$iv$iv	[J
/*      */     //   135	29	18	$i$f$match	I
/*      */     //   147	17	19	x$iv$iv	J
/*      */     //   132	32	16	$this$match$iv$iv	J
/*      */     //   173	12	18	$i$f$hasNext	I
/*      */     //   170	15	16	$this$hasNext$iv$iv	J
/*      */     //   204	7	28	$i$f$lowestBitSet	I
/*      */     //   201	10	26	$this$lowestBitSet$iv$iv$iv	J
/*      */     //   197	15	25	$i$f$get	I
/*      */     //   194	18	23	$this$get$iv$iv	J
/*      */     //   244	7	25	$i$f$next	I
/*      */     //   241	10	23	$this$next$iv$iv	J
/*      */     //   218	35	12	index$iv	I
/*      */     //   263	16	18	$i$f$maskEmpty	I
/*      */     //   260	19	16	$this$maskEmpty$iv$iv	J
/*      */     //   128	173	14	g$iv	J
/*      */     //   166	135	21	m$iv	J
/*      */     //   8	297	4	$i$f$findElementIndex$collection	I
/*      */     //   39	266	7	hash$iv	I
/*      */     //   49	256	5	hash2$iv	I
/*      */     //   55	250	6	probeMask$iv	I
/*      */     //   68	237	9	probeOffset$iv	I
/*      */     //   71	234	8	probeIndex$iv	I
/*      */     //   5	300	3	this_$iv	Landroidx/collection/ScatterSet;
/*      */     //   306	21	2	index	I
/*      */     //   316	11	3	exists	Z
/*      */     //   0	327	0	this	Landroidx/collection/MutableScatterSet;
/*      */     //   0	327	1	element	Ljava/lang/Object;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void minusAssign(Object element) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: checkcast androidx/collection/ScatterSet
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
/*      */     //   24: ldc -862048943
/*      */     //   26: imul
/*      */     //   27: istore #6
/*      */     //   29: iload #6
/*      */     //   31: iload #6
/*      */     //   33: bipush #16
/*      */     //   35: ishl
/*      */     //   36: ixor
/*      */     //   37: istore #7
/*      */     //   39: iconst_0
/*      */     //   40: istore #6
/*      */     //   42: iload #7
/*      */     //   44: bipush #127
/*      */     //   46: iand
/*      */     //   47: istore #5
/*      */     //   49: aload_3
/*      */     //   50: getfield _capacity : I
/*      */     //   53: istore #6
/*      */     //   55: iconst_0
/*      */     //   56: istore #8
/*      */     //   58: iload #7
/*      */     //   60: bipush #7
/*      */     //   62: iushr
/*      */     //   63: iload #6
/*      */     //   65: iand
/*      */     //   66: istore #9
/*      */     //   68: iconst_0
/*      */     //   69: istore #8
/*      */     //   71: nop
/*      */     //   72: aload_3
/*      */     //   73: getfield metadata : [J
/*      */     //   76: astore #10
/*      */     //   78: iconst_0
/*      */     //   79: istore #11
/*      */     //   81: iload #9
/*      */     //   83: iconst_3
/*      */     //   84: ishr
/*      */     //   85: istore #12
/*      */     //   87: iload #9
/*      */     //   89: bipush #7
/*      */     //   91: iand
/*      */     //   92: iconst_3
/*      */     //   93: ishl
/*      */     //   94: istore #13
/*      */     //   96: aload #10
/*      */     //   98: iload #12
/*      */     //   100: laload
/*      */     //   101: iload #13
/*      */     //   103: lushr
/*      */     //   104: aload #10
/*      */     //   106: iload #12
/*      */     //   108: iconst_1
/*      */     //   109: iadd
/*      */     //   110: laload
/*      */     //   111: bipush #64
/*      */     //   113: iload #13
/*      */     //   115: isub
/*      */     //   116: lshl
/*      */     //   117: iload #13
/*      */     //   119: i2l
/*      */     //   120: lneg
/*      */     //   121: bipush #63
/*      */     //   123: lshr
/*      */     //   124: land
/*      */     //   125: lor
/*      */     //   126: lstore #14
/*      */     //   128: lload #14
/*      */     //   130: lstore #16
/*      */     //   132: iconst_0
/*      */     //   133: istore #18
/*      */     //   135: lload #16
/*      */     //   137: ldc2_w 72340172838076673
/*      */     //   140: iload #5
/*      */     //   142: i2l
/*      */     //   143: lmul
/*      */     //   144: lxor
/*      */     //   145: lstore #19
/*      */     //   147: lload #19
/*      */     //   149: ldc2_w 72340172838076673
/*      */     //   152: lsub
/*      */     //   153: lload #19
/*      */     //   155: ldc2_w -1
/*      */     //   158: lxor
/*      */     //   159: land
/*      */     //   160: ldc2_w -9187201950435737472
/*      */     //   163: land
/*      */     //   164: lstore #21
/*      */     //   166: lload #21
/*      */     //   168: lstore #16
/*      */     //   170: iconst_0
/*      */     //   171: istore #18
/*      */     //   173: lload #16
/*      */     //   175: lconst_0
/*      */     //   176: lcmp
/*      */     //   177: ifeq -> 184
/*      */     //   180: iconst_1
/*      */     //   181: goto -> 185
/*      */     //   184: iconst_0
/*      */     //   185: ifeq -> 256
/*      */     //   188: iload #9
/*      */     //   190: lload #21
/*      */     //   192: lstore #23
/*      */     //   194: iconst_0
/*      */     //   195: istore #25
/*      */     //   197: lload #23
/*      */     //   199: lstore #26
/*      */     //   201: iconst_0
/*      */     //   202: istore #28
/*      */     //   204: lload #26
/*      */     //   206: invokestatic numberOfTrailingZeros : (J)I
/*      */     //   209: iconst_3
/*      */     //   210: ishr
/*      */     //   211: nop
/*      */     //   212: iadd
/*      */     //   213: iload #6
/*      */     //   215: iand
/*      */     //   216: istore #12
/*      */     //   218: aload_3
/*      */     //   219: getfield elements : [Ljava/lang/Object;
/*      */     //   222: iload #12
/*      */     //   224: aaload
/*      */     //   225: aload_1
/*      */     //   226: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   229: ifeq -> 237
/*      */     //   232: iload #12
/*      */     //   234: goto -> 305
/*      */     //   237: lload #21
/*      */     //   239: lstore #23
/*      */     //   241: iconst_0
/*      */     //   242: istore #25
/*      */     //   244: lload #23
/*      */     //   246: lload #23
/*      */     //   248: lconst_1
/*      */     //   249: lsub
/*      */     //   250: land
/*      */     //   251: lstore #21
/*      */     //   253: goto -> 166
/*      */     //   256: lload #14
/*      */     //   258: lstore #16
/*      */     //   260: iconst_0
/*      */     //   261: istore #18
/*      */     //   263: lload #16
/*      */     //   265: lload #16
/*      */     //   267: ldc2_w -1
/*      */     //   270: lxor
/*      */     //   271: bipush #6
/*      */     //   273: lshl
/*      */     //   274: land
/*      */     //   275: ldc2_w -9187201950435737472
/*      */     //   278: land
/*      */     //   279: lconst_0
/*      */     //   280: lcmp
/*      */     //   281: ifeq -> 287
/*      */     //   284: goto -> 304
/*      */     //   287: iinc #8, 8
/*      */     //   290: nop
/*      */     //   291: iload #9
/*      */     //   293: iload #8
/*      */     //   295: iadd
/*      */     //   296: iload #6
/*      */     //   298: iand
/*      */     //   299: istore #9
/*      */     //   301: goto -> 71
/*      */     //   304: iconst_m1
/*      */     //   305: istore_2
/*      */     //   306: iload_2
/*      */     //   307: iflt -> 315
/*      */     //   310: aload_0
/*      */     //   311: iload_2
/*      */     //   312: invokevirtual removeElementAt : (I)V
/*      */     //   315: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #727	-> 0
/*      */     //   #1170	-> 8
/*      */     //   #1171	-> 11
/*      */     //   #1171	-> 24
/*      */     //   #1173	-> 29
/*      */     //   #1170	-> 37
/*      */     //   #1174	-> 39
/*      */     //   #1175	-> 42
/*      */     //   #1174	-> 47
/*      */     //   #1176	-> 49
/*      */     //   #1177	-> 55
/*      */     //   #1178	-> 58
/*      */     //   #1177	-> 63
/*      */     //   #1179	-> 68
/*      */     //   #1180	-> 71
/*      */     //   #1181	-> 72
/*      */     //   #1182	-> 81
/*      */     //   #1183	-> 87
/*      */     //   #1184	-> 96
/*      */     //   #1181	-> 126
/*      */     //   #1185	-> 128
/*      */     //   #1186	-> 135
/*      */     //   #1188	-> 147
/*      */     //   #1185	-> 164
/*      */     //   #1189	-> 166
/*      */     //   #1190	-> 173
/*      */     //   #1191	-> 188
/*      */     //   #1192	-> 197
/*      */     //   #1193	-> 204
/*      */     //   #1193	-> 209
/*      */     //   #1192	-> 211
/*      */     //   #1191	-> 212
/*      */     //   #1194	-> 218
/*      */     //   #1195	-> 232
/*      */     //   #1197	-> 237
/*      */     //   #1198	-> 244
/*      */     //   #1197	-> 251
/*      */     //   #1199	-> 256
/*      */     //   #1200	-> 263
/*      */     //   #1199	-> 279
/*      */     //   #1201	-> 284
/*      */     //   #1204	-> 290
/*      */     //   #1205	-> 291
/*      */     //   #1208	-> 304
/*      */     //   #727	-> 305
/*      */     //   #728	-> 306
/*      */     //   #729	-> 310
/*      */     //   #731	-> 315
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   11	26	5	$i$f$hash	I
/*      */     //   29	8	6	hash$iv$iv	I
/*      */     //   42	5	6	$i$f$h2	I
/*      */     //   58	5	8	$i$f$h1	I
/*      */     //   81	45	11	$i$f$group	I
/*      */     //   87	39	12	i$iv$iv	I
/*      */     //   96	30	13	b$iv$iv	I
/*      */     //   78	48	10	metadata$iv$iv	[J
/*      */     //   135	29	18	$i$f$match	I
/*      */     //   147	17	19	x$iv$iv	J
/*      */     //   132	32	16	$this$match$iv$iv	J
/*      */     //   173	12	18	$i$f$hasNext	I
/*      */     //   170	15	16	$this$hasNext$iv$iv	J
/*      */     //   204	7	28	$i$f$lowestBitSet	I
/*      */     //   201	10	26	$this$lowestBitSet$iv$iv$iv	J
/*      */     //   197	15	25	$i$f$get	I
/*      */     //   194	18	23	$this$get$iv$iv	J
/*      */     //   244	7	25	$i$f$next	I
/*      */     //   241	10	23	$this$next$iv$iv	J
/*      */     //   218	35	12	index$iv	I
/*      */     //   263	16	18	$i$f$maskEmpty	I
/*      */     //   260	19	16	$this$maskEmpty$iv$iv	J
/*      */     //   128	173	14	g$iv	J
/*      */     //   166	135	21	m$iv	J
/*      */     //   8	297	4	$i$f$findElementIndex$collection	I
/*      */     //   39	266	7	hash$iv	I
/*      */     //   49	256	5	hash2$iv	I
/*      */     //   55	250	6	probeMask$iv	I
/*      */     //   68	237	9	probeOffset$iv	I
/*      */     //   71	234	8	probeIndex$iv	I
/*      */     //   5	300	3	this_$iv	Landroidx/collection/ScatterSet;
/*      */     //   306	10	2	index	I
/*      */     //   0	316	0	this	Landroidx/collection/MutableScatterSet;
/*      */     //   0	316	1	element	Ljava/lang/Object;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean removeAll(@NotNull Object[] elements) {
/*      */     Intrinsics.checkNotNullParameter(elements, "elements");
/*      */     int oldSize = getSize();
/*      */     minusAssign((E[])elements);
/*      */     return (oldSize != getSize());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean removeAll(@NotNull Sequence<? extends E> elements) {
/*      */     Intrinsics.checkNotNullParameter(elements, "elements");
/*      */     int oldSize = getSize();
/*      */     minusAssign(elements);
/*      */     return (oldSize != getSize());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean removeAll(@NotNull Iterable<? extends E> elements) {
/*      */     Intrinsics.checkNotNullParameter(elements, "elements");
/*      */     int oldSize = getSize();
/*      */     minusAssign(elements);
/*      */     return (oldSize != getSize());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean removeAll(@NotNull ScatterSet<E> elements) {
/*      */     Intrinsics.checkNotNullParameter(elements, "elements");
/*      */     int oldSize = getSize();
/*      */     minusAssign(elements);
/*      */     return (oldSize != getSize());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean removeAll(@NotNull ObjectList<E> elements) {
/*      */     Intrinsics.checkNotNullParameter(elements, "elements");
/*      */     int oldSize = getSize();
/*      */     minusAssign(elements);
/*      */     return (oldSize != getSize());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void minusAssign(@NotNull Object[] elements)
/*      */   {
/*      */     Intrinsics.checkNotNullParameter(elements, "elements");
/*      */     Object[] $this$forEach$iv = elements;
/*      */     int $i$f$forEach = 0;
/* 1209 */     byte b = 0; int i = $this$forEach$iv.length; if (b < i) { Object element$iv = $this$forEach$iv[b], element = element$iv; int $i$a$-forEach-MutableScatterSet$minusAssign$1 = 0; minusAssign((E)element); }
/*      */      } public final void minusAssign(@NotNull Sequence elements) { Intrinsics.checkNotNullParameter(elements, "elements"); Sequence $this$forEach$iv = elements; int $i$f$forEach = 0;
/* 1211 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(), element = element$iv; int $i$a$-forEach-MutableScatterSet$minusAssign$2 = 0; minusAssign((E)element); }
/*      */      } public final void minusAssign(@NotNull Iterable elements) { Intrinsics.checkNotNullParameter(elements, "elements"); Iterable $this$forEach$iv = elements; int $i$f$forEach = 0;
/* 1213 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(), element = element$iv; int $i$a$-forEach-MutableScatterSet$minusAssign$3 = 0; minusAssign((E)element); }
/*      */      } public final void minusAssign(@NotNull ScatterSet elements) { Intrinsics.checkNotNullParameter(elements, "elements"); ScatterSet this_$iv = elements;
/*      */     int $i$f$forEach = 0;
/* 1216 */     Object[] k$iv = this_$iv.elements;
/*      */     
/* 1218 */     ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1220 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1221 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1223 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1224 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1225 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1226 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1227 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1228 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1237 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break;
/*      */         }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 207
/*      */       }  }
/*      */     else {  }
/* 1243 */      } public final void minusAssign(@NotNull ObjectList elements) { Intrinsics.checkNotNullParameter(elements, "elements"); ObjectList this_$iv = elements; int $i$f$forEach = 0; Object[] content$iv = this_$iv.content;
/* 1244 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1245 */       Object element = content$iv[i$iv]; int $i$a$-forEach-MutableScatterSet$minusAssign$5 = 0; minusAssign((E)element);
/*      */     }  } public final void removeIf(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$removeIf = 0; Object[] elements = this.elements;
/*      */     ScatterSet this_$iv = this;
/*      */     int $i$f$forEachIndex = 0;
/* 1249 */     long[] m$iv = this_$iv.metadata;
/* 1250 */     int lastIndex$iv = m$iv.length - 2;
/*      */     
/* 1252 */     int i$iv = 0; if (i$iv <= lastIndex$iv) { while (true) {
/* 1253 */         long slot$iv = m$iv[i$iv];
/* 1254 */         long $this$maskEmptyOrDeleted$iv$iv = slot$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1255 */         if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1256 */         { int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/* 1257 */           for (int j$iv = 0;; j$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1265 */           if (bitCount$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv != lastIndex$iv) { i$iv++; continue; }  // Byte code: goto -> 214
/*      */       }  }
/*      */     else {  }
/* 1269 */      } @PublishedApi public final void removeElementAt(int index) { this._size--; MutableScatterSet mutableScatterSet = this; long value$iv = 254L; int $i$f$writeMetadata = 0; long[] m$iv = mutableScatterSet.metadata;
/* 1270 */     int $i$f$writeRawMetadata = 0;
/* 1271 */     int i$iv$iv = index >> 3;
/* 1272 */     int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 1275 */     m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */     
/* 1277 */     int c$iv = mutableScatterSet._capacity;
/* 1278 */     int cloneIndex$iv = (index - 7 & c$iv) + (
/* 1279 */       0x7 & c$iv);
/* 1280 */     int i = 0; int j = cloneIndex$iv >> 3; int k = (cloneIndex$iv & 0x7) << 3; m$iv[j] = m$iv[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << k; this.elements[index] = null; } public final void clear() { this._size = 0; if (this.metadata != ScatterMapKt.EmptyGroup) {
/*      */       ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, null); long[] arrayOfLong = this.metadata; int i = this._capacity; long value$iv = 255L; int $i$f$writeRawMetadata = 0;
/* 1282 */       int i$iv = i >> 3;
/* 1283 */       int b$iv = (i & 0x7) << 3;
/*      */ 
/*      */       
/* 1286 */       arrayOfLong[i$iv] = arrayOfLong[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv;
/*      */     }  ArraysKt.fill(this.elements, null, 0, this._capacity); initializeGrowth(); } private final int findAbsoluteInsertIndex(Object element) { int $i$f$hash = 0;
/* 1288 */     int hash$iv = ((element != null) ? element.hashCode() : 0) * -862048943;
/*      */     
/* 1290 */     int hash = hash$iv ^ hash$iv << 16;
/* 1291 */     int $i$f$h1 = 0, hash1 = hash >>> 7;
/* 1292 */     int $i$f$h2 = 0, hash2 = hash & 0x7F; int probeMask = this._capacity; int probeOffset = hash1 & probeMask; int probeIndex = 0; while (true) {
/* 1293 */       long[] arrayOfLong = this.metadata; int $i$f$group = 0; int i$iv = probeOffset >> 3;
/* 1294 */       int b$iv = (probeOffset & 0x7) << 3;
/* 1295 */       long g = arrayOfLong[i$iv] >>> b$iv | arrayOfLong[i$iv + 1] << 64 - b$iv & -(b$iv) >> 63L; long $this$match$iv = g; int $i$f$match = 0;
/* 1296 */       long x$iv = $this$match$iv ^ 72340172838076673L * hash2;
/*      */       
/* 1298 */       long m = x$iv - 72340172838076673L & (x$iv ^ 0xFFFFFFFFFFFFFFFFL) & 0x8080808080808080L; while (true)
/* 1299 */       { long $this$hasNext$iv = m; int $i$f$hasNext = 0; if (($this$hasNext$iv != 0L)) {
/* 1300 */           long $this$get$iv = m; int $i$f$get = 0; long $this$lowestBitSet$iv$iv = $this$get$iv; int $i$f$lowestBitSet = 0;
/* 1301 */           int n = probeOffset + (Long.numberOfTrailingZeros($this$lowestBitSet$iv$iv) >> 3) & probeMask;
/*      */         }  long $this$maskEmpty$iv = g; int $i$f$maskEmpty = 0;
/* 1303 */         if (($this$maskEmpty$iv & ($this$maskEmpty$iv ^ 0xFFFFFFFFFFFFFFFFL) << 6L & 0x8080808080808080L) != 0L); break; }  probeIndex += 8; probeOffset = probeOffset + probeIndex & probeMask;
/* 1304 */     }  int index = findFirstAvailableSlot(hash1); if (this.growthLimit == 0) { long[] arrayOfLong = this.metadata; int $i$f$isDeleted = 0; int m = 0; if (!(((
/* 1305 */         arrayOfLong[index >> 3] >> (index & 0x7) << 3 & 0xFFL) == 254L) ? 1 : 0)) { adjustStorage(); index = findFirstAvailableSlot(hash1); }  }
/* 1306 */      this._size++; long[] metadata$iv = this.metadata; int $i$f$isEmpty = 0; int $i$f$readRawMetadata = 0; this.growthLimit -= (((
/* 1307 */       metadata$iv[index >> 3] >> (index & 0x7) << 3 & 0xFFL) == 128L)) ? 1 : 0; MutableScatterSet mutableScatterSet = this; long value$iv = hash2; int $i$f$writeMetadata = 0;
/* 1308 */     long[] m$iv = mutableScatterSet.metadata;
/* 1309 */     int $i$f$writeRawMetadata = 0;
/* 1310 */     int i$iv$iv = index >> 3;
/* 1311 */     int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 1314 */     m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */     
/* 1316 */     int c$iv = mutableScatterSet._capacity;
/* 1317 */     int cloneIndex$iv = (index - 7 & c$iv) + (
/* 1318 */       0x7 & c$iv);
/* 1319 */     int i = 0; int j = cloneIndex$iv >> 3; int k = (cloneIndex$iv & 0x7) << 3; m$iv[j] = m$iv[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << k; return index; } private final int findFirstAvailableSlot(int hash1) { int probeMask = this._capacity; int probeOffset = hash1 & probeMask; int probeIndex = 0; while (true)
/*      */     { long[] metadata$iv = this.metadata; int $i$f$group = 0;
/* 1321 */       int i$iv = probeOffset >> 3;
/* 1322 */       int b$iv = (probeOffset & 0x7) << 3;
/* 1323 */       long g = metadata$iv[i$iv] >>> b$iv | metadata$iv[i$iv + 1] << 64 - b$iv & -(b$iv) >> 63L; long $this$maskEmptyOrDeleted$iv = g; int $i$f$maskEmptyOrDeleted = 0;
/* 1324 */       long m = $this$maskEmptyOrDeleted$iv & ($this$maskEmptyOrDeleted$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L; if (m != 0L)
/* 1325 */       { long $this$lowestBitSet$iv = m; int $i$f$lowestBitSet = 0; return probeOffset + (Long.numberOfTrailingZeros($this$lowestBitSet$iv) >> 3) & probeMask; }  probeIndex += 8; probeOffset = probeOffset + probeIndex & probeMask; }  } @IntRange(from = 0L) public final int trim() { int previousCapacity = this._capacity; int newCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size)); if (newCapacity < previousCapacity) { resizeStorage(newCapacity); return previousCapacity - this._capacity; }  return 0; } private final void adjustStorage() { if (this._capacity > 8 && Long.compareUnsigned(ULong.constructor-impl(ULong.constructor-impl(this._size) * 32L), ULong.constructor-impl(ULong.constructor-impl(this._capacity) * 25L)) <= 0) { resizeStorage(ScatterMapKt.nextCapacity(this._capacity)); } else { resizeStorage(ScatterMapKt.nextCapacity(this._capacity)); }  }
/* 1326 */   private final void resizeStorage(int newCapacity) { long[] previousMetadata = this.metadata; Object[] previousElements = this.elements; int previousCapacity = this._capacity; initializeStorage(newCapacity); Object[] newElements = this.elements; for (int i = 0; i < previousCapacity; i++) { int $i$f$isFull = 0; int $i$f$readRawMetadata = 0; if (((
/* 1327 */         previousMetadata[i >> 3] >> (i & 0x7) << 3 & 0xFFL) < 128L)) {
/* 1328 */         Object previousElement = previousElements[i]; int $i$f$hash = 0; int hash$iv = ((previousElement != null) ? previousElement.hashCode() : 0) * -862048943;
/*      */         
/* 1330 */         int hash = hash$iv ^ hash$iv << 16;
/* 1331 */         int $i$f$h1 = 0, index = findFirstAvailableSlot(hash >>> 7); MutableScatterSet mutableScatterSet = this; int $i$f$h2 = 0;
/* 1332 */         long value$iv = (hash & 0x7F); int $i$f$writeMetadata = 0;
/* 1333 */         long[] m$iv = mutableScatterSet.metadata;
/* 1334 */         int $i$f$writeRawMetadata = 0;
/* 1335 */         int i$iv$iv = index >> 3;
/* 1336 */         int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */         
/* 1339 */         m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */         
/* 1341 */         int c$iv = mutableScatterSet._capacity;
/* 1342 */         int cloneIndex$iv = (index - 7 & c$iv) + (
/* 1343 */           0x7 & c$iv);
/* 1344 */         int j = 0; int k = cloneIndex$iv >> 3; int m = (cloneIndex$iv & 0x7) << 3; m$iv[k] = m$iv[k] & (255L << m ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << m; newElements[index] = previousElement;
/*      */       }  }
/* 1346 */      } private final void writeMetadata(int index, long value) { int $i$f$writeMetadata = 0; long[] m = this.metadata; int $i$f$writeRawMetadata = 0; int i$iv = index >> 3;
/* 1347 */     int b$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 1350 */     m[i$iv] = m[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value << b$iv; int c = this._capacity; int cloneIndex = (index - 7 & c) + (0x7 & c);
/*      */     int i = 0;
/* 1352 */     int j = cloneIndex >> 3;
/* 1353 */     int k = (cloneIndex & 0x7) << 3;
/*      */ 
/*      */     
/* 1356 */     m[j] = m[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value << k; }
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final Set<E> asMutableSet() {
/*      */     return new MutableSetWrapper();
/*      */   }
/*      */   
/*      */   public MutableScatterSet() {
/*      */     this(0, 1, (DefaultConstructorMarker)null);
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020#\n\002\b\002\n\002\020\013\n\002\b\004\n\002\020\036\n\000\n\002\020\002\n\000\n\002\020)\n\002\b\004\b\004\030\0002\f0\001R\b\022\004\022\0028\0000\0022\b\022\004\022\0028\0000\003B\005¢\006\002\020\004J\025\020\005\032\0020\0062\006\020\007\032\0028\000H\026¢\006\002\020\bJ\026\020\t\032\0020\0062\f\020\n\032\b\022\004\022\0028\0000\013H\026J\b\020\f\032\0020\rH\026J\017\020\016\032\b\022\004\022\0028\0000\017H\002J\025\020\020\032\0020\0062\006\020\007\032\0028\000H\026¢\006\002\020\bJ\026\020\021\032\0020\0062\f\020\n\032\b\022\004\022\0028\0000\013H\026J\026\020\022\032\0020\0062\f\020\n\032\b\022\004\022\0028\0000\013H\026¨\006\023"}, d2 = {"Landroidx/collection/MutableScatterSet$MutableSetWrapper;", "Landroidx/collection/ScatterSet$SetWrapper;", "Landroidx/collection/ScatterSet;", "", "(Landroidx/collection/MutableScatterSet;)V", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "", "clear", "", "iterator", "", "remove", "removeAll", "retainAll", "collection"})
/*      */   @SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1084:1\n237#2,7:1085\n248#2,3:1093\n251#2,9:1097\n1810#3:1092\n1672#3:1096\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper\n*L\n1064#1:1085,7\n1064#1:1093,3\n1064#1:1097,9\n1064#1:1092\n1064#1:1096\n*E\n"})
/*      */   private final class MutableSetWrapper extends ScatterSet<E>.SetWrapper implements Set<E>, KMutableSet {
/*      */     public boolean add(Object element) {
/*      */       return MutableScatterSet.this.add((E)element);
/*      */     }
/*      */     
/*      */     public boolean addAll(@NotNull Collection<? extends E> elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       return MutableScatterSet.this.addAll(elements);
/*      */     }
/*      */     
/*      */     public void clear() {
/*      */       MutableScatterSet.this.clear();
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public Iterator<E> iterator() {
/*      */       return new MutableScatterSet$MutableSetWrapper$iterator$1();
/*      */     }
/*      */     
/*      */     @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000)\n\000\n\002\020)\n\000\n\002\020\b\n\002\b\005\n\002\020(\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\002\n\000*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J\t\020\f\032\0020\rH\002J\016\020\016\032\0028\000H\002¢\006\002\020\017J\b\020\020\032\0020\021H\026R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\004\020\005\"\004\b\006\020\007R\027\020\b\032\b\022\004\022\0028\0000\t¢\006\b\n\000\032\004\b\n\020\013¨\006\022"}, d2 = {"androidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1", "", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "iterator", "", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "remove", "", "collection"})
/*      */     public static final class MutableScatterSet$MutableSetWrapper$iterator$1 implements Iterator<E>, KMutableIterator {
/*      */       private int current = -1;
/*      */       
/*      */       public final int getCurrent() {
/*      */         return this.current;
/*      */       }
/*      */       
/*      */       public final void setCurrent(int <set-?>) {
/*      */         this.current = <set-?>;
/*      */       }
/*      */       
/*      */       @NotNull
/*      */       private final Iterator<E> iterator = SequencesKt.iterator(new MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(this, null));
/*      */       
/*      */       @NotNull
/*      */       public final Iterator<E> getIterator() {
/*      */         return this.iterator;
/*      */       }
/*      */       
/*      */       @DebugMetadata(f = "ScatterSet.kt", l = {1044}, i = {0, 0, 0, 0, 0, 0, 0}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"}, n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, m = "invokeSuspend", c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1")
/*      */       @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"})
/*      */       @SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1084:1\n237#2,7:1085\n248#2,3:1093\n251#2,9:1097\n1810#3:1092\n1672#3:1096\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1\n*L\n1041#1:1085,7\n1041#1:1093,3\n1041#1:1097,9\n1041#1:1092\n1041#1:1096\n*E\n"})
/*      */       static final class MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super E>, Continuation<? super Unit>, Object> {
/*      */         Object L$1;
/*      */         Object L$2;
/*      */         Object L$3;
/*      */         int I$0;
/*      */         int I$1;
/*      */         int I$2;
/*      */         int I$3;
/*      */         long J$0;
/*      */         int label;
/*      */         
/*      */         MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(MutableScatterSet$MutableSetWrapper$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1, Continuation $completion) {
/*      */           super(2, $completion);
/*      */         }
/*      */         
/*      */         @Nullable
/*      */         public final Object invokeSuspend(@NotNull Object $result) {
/*      */           // Byte code:
/*      */           //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */           //   3: astore #22
/*      */           //   5: aload_0
/*      */           //   6: getfield label : I
/*      */           //   9: tableswitch default -> 399, 0 -> 32, 1 -> 284
/*      */           //   32: aload_1
/*      */           //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */           //   36: aload_0
/*      */           //   37: getfield L$0 : Ljava/lang/Object;
/*      */           //   40: checkcast kotlin/sequences/SequenceScope
/*      */           //   43: astore_2
/*      */           //   44: aload_0
/*      */           //   45: getfield this$0 : Landroidx/collection/MutableScatterSet;
/*      */           //   48: checkcast androidx/collection/ScatterSet
/*      */           //   51: astore_3
/*      */           //   52: aload_0
/*      */           //   53: getfield this$1 : Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1;
/*      */           //   56: astore #4
/*      */           //   58: aload_0
/*      */           //   59: getfield this$0 : Landroidx/collection/MutableScatterSet;
/*      */           //   62: astore #5
/*      */           //   64: iconst_0
/*      */           //   65: istore #6
/*      */           //   67: nop
/*      */           //   68: aload_3
/*      */           //   69: getfield metadata : [J
/*      */           //   72: astore #7
/*      */           //   74: aload #7
/*      */           //   76: arraylength
/*      */           //   77: iconst_2
/*      */           //   78: isub
/*      */           //   79: istore #8
/*      */           //   81: iconst_0
/*      */           //   82: istore #9
/*      */           //   84: iload #9
/*      */           //   86: iload #8
/*      */           //   88: if_icmpgt -> 394
/*      */           //   91: aload #7
/*      */           //   93: iload #9
/*      */           //   95: laload
/*      */           //   96: lstore #10
/*      */           //   98: lload #10
/*      */           //   100: lstore #12
/*      */           //   102: iconst_0
/*      */           //   103: istore #14
/*      */           //   105: lload #12
/*      */           //   107: lload #12
/*      */           //   109: ldc2_w -1
/*      */           //   112: lxor
/*      */           //   113: bipush #7
/*      */           //   115: lshl
/*      */           //   116: land
/*      */           //   117: ldc2_w -9187201950435737472
/*      */           //   120: land
/*      */           //   121: ldc2_w -9187201950435737472
/*      */           //   124: lcmp
/*      */           //   125: ifeq -> 381
/*      */           //   128: bipush #8
/*      */           //   130: iload #9
/*      */           //   132: iload #8
/*      */           //   134: isub
/*      */           //   135: iconst_m1
/*      */           //   136: ixor
/*      */           //   137: bipush #31
/*      */           //   139: iushr
/*      */           //   140: isub
/*      */           //   141: istore #15
/*      */           //   143: iconst_0
/*      */           //   144: istore #16
/*      */           //   146: iload #16
/*      */           //   148: iload #15
/*      */           //   150: if_icmpge -> 374
/*      */           //   153: lload #10
/*      */           //   155: ldc2_w 255
/*      */           //   158: land
/*      */           //   159: lstore #17
/*      */           //   161: iconst_0
/*      */           //   162: istore #19
/*      */           //   164: lload #17
/*      */           //   166: ldc2_w 128
/*      */           //   169: lcmp
/*      */           //   170: ifge -> 177
/*      */           //   173: iconst_1
/*      */           //   174: goto -> 178
/*      */           //   177: iconst_0
/*      */           //   178: ifeq -> 361
/*      */           //   181: iload #9
/*      */           //   183: iconst_3
/*      */           //   184: ishl
/*      */           //   185: iload #16
/*      */           //   187: iadd
/*      */           //   188: istore #14
/*      */           //   190: iload #14
/*      */           //   192: istore #20
/*      */           //   194: iconst_0
/*      */           //   195: istore #21
/*      */           //   197: aload #4
/*      */           //   199: iload #20
/*      */           //   201: invokevirtual setCurrent : (I)V
/*      */           //   204: aload_2
/*      */           //   205: aload #5
/*      */           //   207: getfield elements : [Ljava/lang/Object;
/*      */           //   210: iload #20
/*      */           //   212: aaload
/*      */           //   213: aload_0
/*      */           //   214: aload_0
/*      */           //   215: aload_2
/*      */           //   216: putfield L$0 : Ljava/lang/Object;
/*      */           //   219: aload_0
/*      */           //   220: aload #4
/*      */           //   222: putfield L$1 : Ljava/lang/Object;
/*      */           //   225: aload_0
/*      */           //   226: aload #5
/*      */           //   228: putfield L$2 : Ljava/lang/Object;
/*      */           //   231: aload_0
/*      */           //   232: aload #7
/*      */           //   234: putfield L$3 : Ljava/lang/Object;
/*      */           //   237: aload_0
/*      */           //   238: iload #8
/*      */           //   240: putfield I$0 : I
/*      */           //   243: aload_0
/*      */           //   244: iload #9
/*      */           //   246: putfield I$1 : I
/*      */           //   249: aload_0
/*      */           //   250: lload #10
/*      */           //   252: putfield J$0 : J
/*      */           //   255: aload_0
/*      */           //   256: iload #15
/*      */           //   258: putfield I$2 : I
/*      */           //   261: aload_0
/*      */           //   262: iload #16
/*      */           //   264: putfield I$3 : I
/*      */           //   267: aload_0
/*      */           //   268: iconst_1
/*      */           //   269: putfield label : I
/*      */           //   272: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */           //   275: dup
/*      */           //   276: aload #22
/*      */           //   278: if_acmpne -> 360
/*      */           //   281: aload #22
/*      */           //   283: areturn
/*      */           //   284: iconst_0
/*      */           //   285: istore #6
/*      */           //   287: iconst_0
/*      */           //   288: istore #21
/*      */           //   290: aload_0
/*      */           //   291: getfield I$3 : I
/*      */           //   294: istore #16
/*      */           //   296: aload_0
/*      */           //   297: getfield I$2 : I
/*      */           //   300: istore #15
/*      */           //   302: aload_0
/*      */           //   303: getfield J$0 : J
/*      */           //   306: lstore #10
/*      */           //   308: aload_0
/*      */           //   309: getfield I$1 : I
/*      */           //   312: istore #9
/*      */           //   314: aload_0
/*      */           //   315: getfield I$0 : I
/*      */           //   318: istore #8
/*      */           //   320: aload_0
/*      */           //   321: getfield L$3 : Ljava/lang/Object;
/*      */           //   324: checkcast [J
/*      */           //   327: astore #7
/*      */           //   329: aload_0
/*      */           //   330: getfield L$2 : Ljava/lang/Object;
/*      */           //   333: checkcast androidx/collection/MutableScatterSet
/*      */           //   336: astore #5
/*      */           //   338: aload_0
/*      */           //   339: getfield L$1 : Ljava/lang/Object;
/*      */           //   342: checkcast androidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1
/*      */           //   345: astore #4
/*      */           //   347: aload_0
/*      */           //   348: getfield L$0 : Ljava/lang/Object;
/*      */           //   351: checkcast kotlin/sequences/SequenceScope
/*      */           //   354: astore_2
/*      */           //   355: aload_1
/*      */           //   356: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */           //   359: aload_1
/*      */           //   360: pop
/*      */           //   361: lload #10
/*      */           //   363: bipush #8
/*      */           //   365: lshr
/*      */           //   366: lstore #10
/*      */           //   368: iinc #16, 1
/*      */           //   371: goto -> 146
/*      */           //   374: iload #15
/*      */           //   376: bipush #8
/*      */           //   378: if_icmpne -> 395
/*      */           //   381: iload #9
/*      */           //   383: iload #8
/*      */           //   385: if_icmpeq -> 394
/*      */           //   388: iinc #9, 1
/*      */           //   391: goto -> 91
/*      */           //   394: nop
/*      */           //   395: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */           //   398: areturn
/*      */           //   399: new java/lang/IllegalStateException
/*      */           //   402: dup
/*      */           //   403: ldc 'call to 'resume' before 'invoke' with coroutine'
/*      */           //   405: invokespecial <init> : (Ljava/lang/String;)V
/*      */           //   408: athrow
/*      */           // Line number table:
/*      */           //   Java source line number -> byte code offset
/*      */           //   #1040	-> 3
/*      */           //   #1041	-> 44
/*      */           //   #1085	-> 67
/*      */           //   #1086	-> 68
/*      */           //   #1087	-> 74
/*      */           //   #1089	-> 81
/*      */           //   #1090	-> 91
/*      */           //   #1091	-> 98
/*      */           //   #1092	-> 105
/*      */           //   #1091	-> 121
/*      */           //   #1093	-> 128
/*      */           //   #1094	-> 143
/*      */           //   #1095	-> 153
/*      */           //   #1096	-> 164
/*      */           //   #1095	-> 178
/*      */           //   #1097	-> 181
/*      */           //   #1098	-> 190
/*      */           //   #1042	-> 197
/*      */           //   #1044	-> 204
/*      */           //   #1040	-> 281
/*      */           //   #1045	-> 360
/*      */           //   #1098	-> 361
/*      */           //   #1100	-> 361
/*      */           //   #1094	-> 368
/*      */           //   #1102	-> 374
/*      */           //   #1089	-> 381
/*      */           //   #1105	-> 394
/*      */           //   #1046	-> 395
/*      */           //   #1040	-> 399
/*      */           // Local variable table:
/*      */           //   start	length	slot	name	descriptor
/*      */           //   44	240	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */           //   355	6	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */           //   361	20	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */           //   381	7	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */           //   388	6	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */           //   64	10	3	this_$iv	Landroidx/collection/ScatterSet;
/*      */           //   74	210	7	m$iv	[J
/*      */           //   329	32	7	m$iv	[J
/*      */           //   361	20	7	m$iv	[J
/*      */           //   381	7	7	m$iv	[J
/*      */           //   388	6	7	m$iv	[J
/*      */           //   81	203	8	lastIndex$iv	I
/*      */           //   320	41	8	lastIndex$iv	I
/*      */           //   361	20	8	lastIndex$iv	I
/*      */           //   381	7	8	lastIndex$iv	I
/*      */           //   388	6	8	lastIndex$iv	I
/*      */           //   84	200	9	i$iv	I
/*      */           //   314	47	9	i$iv	I
/*      */           //   361	20	9	i$iv	I
/*      */           //   381	13	9	i$iv	I
/*      */           //   98	55	10	slot$iv	J
/*      */           //   153	131	10	slot$iv	J
/*      */           //   308	53	10	slot$iv	J
/*      */           //   361	20	10	slot$iv	J
/*      */           //   102	19	12	$this$maskEmptyOrDeleted$iv$iv	J
/*      */           //   190	4	14	index$iv	I
/*      */           //   143	141	15	bitCount$iv	I
/*      */           //   302	59	15	bitCount$iv	I
/*      */           //   361	20	15	bitCount$iv	I
/*      */           //   146	7	16	j$iv	I
/*      */           //   153	131	16	j$iv	I
/*      */           //   296	65	16	j$iv	I
/*      */           //   361	13	16	j$iv	I
/*      */           //   161	16	17	value$iv$iv	J
/*      */           //   194	81	20	index	I
/*      */           //   197	87	21	$i$a$-forEachIndex-MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1$1	I
/*      */           //   105	16	14	$i$f$maskEmptyOrDeleted	I
/*      */           //   164	14	19	$i$f$isFull	I
/*      */           //   67	217	6	$i$f$forEachIndex	I
/*      */           //   36	363	0	this	Landroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;
/*      */           //   36	363	1	$result	Ljava/lang/Object;
/*      */           //   290	71	21	$i$a$-forEachIndex-MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1$1	I
/*      */           //   287	108	6	$i$f$forEachIndex	I
/*      */         }
/*      */         
/*      */         @NotNull
/*      */         public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1> $completion) {
/*      */           MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 = new MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(MutableScatterSet$MutableSetWrapper$iterator$1.this, $completion);
/*      */           mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1.L$0 = value;
/*      */           return (Continuation<Unit>)mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;
/*      */         }
/*      */         
/*      */         @Nullable
/*      */         public final Object invoke(@NotNull SequenceScope p1, @Nullable Continuation<?> p2) {
/*      */           return ((MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */         }
/*      */       }
/*      */       
/*      */       public boolean hasNext() {
/*      */         return this.iterator.hasNext();
/*      */       }
/*      */       
/*      */       public E next() {
/*      */         return this.iterator.next();
/*      */       }
/*      */       
/*      */       public void remove() {
/*      */         if (this.current != -1) {
/*      */           MutableScatterSet.this.removeElementAt(this.current);
/*      */           this.current = -1;
/*      */         } 
/*      */       }
/*      */     }
/*      */     
/*      */     public boolean remove(Object element) {
/*      */       return MutableScatterSet.this.remove((E)element);
/*      */     }
/*      */     
/*      */     public boolean retainAll(@NotNull Collection elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       boolean changed = false;
/*      */       MutableScatterSet<E> mutableScatterSet1 = MutableScatterSet.this, mutableScatterSet2 = MutableScatterSet.this;
/*      */       int $i$f$forEachIndex = 0;
/*      */       long[] m$iv = mutableScatterSet1.metadata;
/*      */       int lastIndex$iv = m$iv.length - 2;
/*      */       int i$iv = 0;
/*      */       if (i$iv <= lastIndex$iv) {
/*      */         while (true) {
/*      */           long slot$iv = m$iv[i$iv];
/*      */           long $this$maskEmptyOrDeleted$iv$iv = slot$iv;
/*      */           int $i$f$maskEmptyOrDeleted = 0;
/*      */           if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/*      */             int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/*      */             for (int j$iv = 0;; j$iv++);
/*      */             if (bitCount$iv == 8)
/*      */               continue; 
/*      */             break;
/*      */           } 
/*      */           continue;
/*      */           if (i$iv != lastIndex$iv) {
/*      */             i$iv++;
/*      */             continue;
/*      */           } 
/*      */           // Byte code: goto -> 220
/*      */         } 
/*      */       } else {
/*      */       
/*      */       } 
/*      */       return changed;
/*      */     }
/*      */     
/*      */     public boolean removeAll(@NotNull Collection elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       int oldSize = MutableScatterSet.this.getSize();
/*      */       for (Object element : elements)
/*      */         MutableScatterSet.this.minusAssign((E)element); 
/*      */       return (oldSize != MutableScatterSet.this.getSize());
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\MutableScatterSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */