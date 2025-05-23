/*      */ package androidx.collection;
/*      */ 
/*      */ import java.util.NoSuchElementException;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.PublishedApi;
/*      */ import kotlin.jvm.JvmField;
/*      */ import kotlin.jvm.JvmOverloads;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function1;
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
/*      */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000h\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\007\n\002\020\025\n\002\b\002\n\002\020\026\n\002\b\006\n\002\020\013\n\000\n\002\030\002\n\002\020\t\n\002\b\013\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\004\n\002\020\016\n\000\n\002\020\r\n\002\b\007\n\002\030\002\n\000\b6\030\0002\0020\001B\007\b\004¢\006\002\020\002J&\020\025\032\0020\0262\030\020\027\032\024\022\004\022\0020\004\022\004\022\0020\031\022\004\022\0020\0260\030H\bø\001\000J\006\020\032\032\0020\026J&\020\032\032\0020\0262\030\020\027\032\024\022\004\022\0020\004\022\004\022\0020\031\022\004\022\0020\0260\030H\bø\001\000J\021\020\033\032\0020\0262\006\020\034\032\0020\004H\002J\016\020\035\032\0020\0262\006\020\034\032\0020\004J\016\020\036\032\0020\0262\006\020\037\032\0020\031J\006\020 \032\0020\004J&\020 \032\0020\0042\030\020\027\032\024\022\004\022\0020\004\022\004\022\0020\031\022\004\022\0020\0260\030H\bø\001\000J\023\020!\032\0020\0262\b\020\"\032\004\030\0010\001H\002J\020\020#\032\0020\0042\006\020\034\032\0020\004H\001JD\020$\032\0020%26\020&\0322\022\023\022\0210\004¢\006\f\b'\022\b\b(\022\004\b\b(\034\022\023\022\0210\031¢\006\f\b'\022\b\b(\022\004\b\b(\037\022\004\022\0020%0\030H\bø\001\000J/\020)\032\0020%2!\020&\032\035\022\023\022\0210\004¢\006\f\b'\022\b\b(\022\004\b\b(+\022\004\022\0020%0*H\bø\001\000J/\020,\032\0020%2!\020&\032\035\022\023\022\0210\004¢\006\f\b'\022\b\b(\022\004\b\b(\034\022\004\022\0020%0*H\bø\001\000J/\020-\032\0020%2!\020&\032\035\022\023\022\0210\031¢\006\f\b'\022\b\b(\022\004\b\b(\037\022\004\022\0020%0*H\bø\001\000J\021\020.\032\0020\0312\006\020\034\032\0020\004H\002J\026\020/\032\0020\0312\006\020\034\032\0020\0042\006\0200\032\0020\031J\"\0201\032\0020\0312\006\020\034\032\0020\0042\f\0200\032\b\022\004\022\0020\03102H\bø\001\000J\b\0203\032\0020\004H\026J\006\0204\032\0020\026J\006\0205\032\0020\026J:\0206\032\002072\b\b\002\0208\032\002092\b\b\002\020:\032\002092\b\b\002\020;\032\002092\b\b\002\020<\032\0020\0042\b\b\002\020=\032\00209H\007Jx\0206\032\002072\b\b\002\0208\032\002092\b\b\002\020:\032\002092\b\b\002\020;\032\002092\b\b\002\020<\032\0020\0042\b\b\002\020=\032\0020928\b\004\020>\0322\022\023\022\0210\004¢\006\f\b'\022\b\b(\022\004\b\b(\034\022\023\022\0210\031¢\006\f\b'\022\b\b(\022\004\b\b(\037\022\004\022\002090\030H\bø\001\000J\006\020?\032\0020\026J\b\020@\032\00207H\026R\030\020\003\032\0020\0048\000@\000X\016¢\006\b\n\000\022\004\b\005\020\002R\030\020\006\032\0020\0048\000@\000X\016¢\006\b\n\000\022\004\b\007\020\002R\021\020\b\032\0020\0048F¢\006\006\032\004\b\t\020\nR\030\020\013\032\0020\f8\000@\000X\016¢\006\b\n\000\022\004\b\r\020\002R\030\020\016\032\0020\0178\000@\000X\016¢\006\b\n\000\022\004\b\020\020\002R\021\020\021\032\0020\0048F¢\006\006\032\004\b\022\020\nR\030\020\023\032\0020\0178\000@\000X\016¢\006\b\n\000\022\004\b\024\020\002\001\001A\002\007\n\005\b20\001¨\006B"}, d2 = {"Landroidx/collection/IntLongMap;", "", "()V", "_capacity", "", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "capacity", "getCapacity", "()I", "keys", "", "getKeys$annotations", "metadata", "", "getMetadata$annotations", "size", "getSize", "values", "getValues$annotations", "all", "", "predicate", "Lkotlin/Function2;", "", "any", "contains", "key", "containsKey", "containsValue", "value", "count", "equals", "other", "findKeyIndex", "forEach", "", "block", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function1;", "index", "forEachKey", "forEachValue", "get", "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "Landroidx/collection/MutableIntLongMap;", "collection"})
/*      */ @SourceDebugExtension({"SMAP\nIntLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntLongMap.kt\nandroidx/collection/IntLongMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 IntSet.kt\nandroidx/collection/IntSetKt\n*L\n1#1,1031:1\n357#1,6:1034\n367#1,3:1041\n370#1,9:1045\n357#1,6:1054\n367#1,3:1061\n370#1,9:1065\n357#1,6:1074\n367#1,3:1081\n370#1,9:1085\n385#1,4:1094\n357#1,6:1098\n367#1,3:1105\n370#1,2:1109\n389#1,2:1111\n373#1,6:1113\n391#1:1119\n385#1,4:1120\n357#1,6:1124\n367#1,3:1131\n370#1,2:1135\n389#1,2:1137\n373#1,6:1139\n391#1:1145\n385#1,4:1146\n357#1,6:1150\n367#1,3:1157\n370#1,2:1161\n389#1,2:1163\n373#1,6:1165\n391#1:1171\n410#1,3:1172\n357#1,6:1175\n367#1,3:1182\n370#1,2:1186\n413#1,2:1188\n373#1,6:1190\n415#1:1196\n385#1,4:1197\n357#1,6:1201\n367#1,3:1208\n370#1,2:1212\n389#1,2:1214\n373#1,6:1216\n391#1:1222\n385#1,4:1223\n357#1,6:1227\n367#1,3:1234\n370#1,2:1238\n389#1,2:1240\n373#1,6:1242\n391#1:1248\n385#1,4:1249\n357#1,6:1253\n367#1,3:1260\n370#1,2:1264\n389#1,2:1266\n373#1,6:1268\n391#1:1274\n385#1,4:1275\n357#1,6:1279\n367#1,3:1286\n370#1,2:1290\n389#1,2:1292\n373#1,6:1294\n391#1:1300\n385#1,4:1301\n357#1,6:1305\n367#1,3:1312\n370#1,2:1316\n389#1,2:1318\n373#1,6:1320\n391#1:1326\n385#1,4:1327\n357#1,6:1331\n367#1,3:1338\n370#1,2:1342\n389#1,2:1344\n373#1,6:1346\n391#1:1352\n519#1,11:1369\n385#1,4:1380\n357#1,6:1384\n367#1,3:1391\n370#1,2:1395\n389#1:1397\n530#1,10:1398\n390#1:1408\n373#1,6:1409\n391#1:1415\n540#1,2:1416\n519#1,11:1418\n385#1,4:1429\n357#1,6:1433\n367#1,3:1440\n370#1,2:1444\n389#1:1446\n530#1,10:1447\n390#1:1457\n373#1,6:1458\n391#1:1464\n540#1,2:1465\n519#1,11:1467\n385#1,4:1478\n357#1,6:1482\n367#1,3:1489\n370#1,2:1493\n389#1:1495\n530#1,10:1496\n390#1:1506\n373#1,6:1507\n391#1:1513\n540#1,2:1514\n519#1,11:1516\n385#1,4:1527\n357#1,6:1531\n367#1,3:1538\n370#1,2:1542\n389#1:1544\n530#1,10:1545\n390#1:1555\n373#1,6:1556\n391#1:1562\n540#1,2:1563\n519#1,11:1565\n385#1,4:1576\n357#1,6:1580\n367#1,3:1587\n370#1,2:1591\n389#1:1593\n530#1,10:1594\n390#1:1604\n373#1,6:1605\n391#1:1611\n540#1,2:1612\n1810#2:1032\n1672#2:1033\n1810#2:1040\n1672#2:1044\n1810#2:1060\n1672#2:1064\n1810#2:1080\n1672#2:1084\n1810#2:1104\n1672#2:1108\n1810#2:1130\n1672#2:1134\n1810#2:1156\n1672#2:1160\n1810#2:1181\n1672#2:1185\n1810#2:1207\n1672#2:1211\n1810#2:1233\n1672#2:1237\n1810#2:1259\n1672#2:1263\n1810#2:1285\n1672#2:1289\n1810#2:1311\n1672#2:1315\n1810#2:1337\n1672#2:1341\n1603#2:1356\n1599#2:1357\n1779#2,3:1358\n1793#2,3:1361\n1717#2:1364\n1705#2:1365\n1699#2:1366\n1712#2:1367\n1802#2:1368\n1810#2:1390\n1672#2:1394\n1810#2:1439\n1672#2:1443\n1810#2:1488\n1672#2:1492\n1810#2:1537\n1672#2:1541\n1810#2:1586\n1672#2:1590\n833#3,3:1353\n*S KotlinDebug\n*F\n+ 1 IntLongMap.kt\nandroidx/collection/IntLongMap\n*L\n388#1:1034,6\n388#1:1041,3\n388#1:1045,9\n400#1:1054,6\n400#1:1061,3\n400#1:1065,9\n412#1:1074,6\n412#1:1081,3\n412#1:1085,9\n421#1:1094,4\n421#1:1098,6\n421#1:1105,3\n421#1:1109,2\n421#1:1111,2\n421#1:1113,6\n421#1:1119\n431#1:1120,4\n431#1:1124,6\n431#1:1131,3\n431#1:1135,2\n431#1:1137,2\n431#1:1139,6\n431#1:1145\n447#1:1146,4\n447#1:1150,6\n447#1:1157,3\n447#1:1161,2\n447#1:1163,2\n447#1:1165,6\n447#1:1171\n470#1:1172,3\n470#1:1175,6\n470#1:1182,3\n470#1:1186,2\n470#1:1188,2\n470#1:1190,6\n470#1:1196\n494#1:1197,4\n494#1:1201,6\n494#1:1208,3\n494#1:1212,2\n494#1:1214,2\n494#1:1216,6\n494#1:1222\n529#1:1223,4\n529#1:1227,6\n529#1:1234,3\n529#1:1238,2\n529#1:1240,2\n529#1:1242,6\n529#1:1248\n529#1:1249,4\n529#1:1253,6\n529#1:1260,3\n529#1:1264,2\n529#1:1266,2\n529#1:1268,6\n529#1:1274\n550#1:1275,4\n550#1:1279,6\n550#1:1286,3\n550#1:1290,2\n550#1:1292,2\n550#1:1294,6\n550#1:1300\n576#1:1301,4\n576#1:1305,6\n576#1:1312,3\n576#1:1316,2\n576#1:1318,2\n576#1:1320,6\n576#1:1326\n598#1:1327,4\n598#1:1331,6\n598#1:1338,3\n598#1:1342,2\n598#1:1344,2\n598#1:1346,6\n598#1:1352\n-1#1:1369,11\n-1#1:1380,4\n-1#1:1384,6\n-1#1:1391,3\n-1#1:1395,2\n-1#1:1397\n-1#1:1398,10\n-1#1:1408\n-1#1:1409,6\n-1#1:1415\n-1#1:1416,2\n-1#1:1418,11\n-1#1:1429,4\n-1#1:1433,6\n-1#1:1440,3\n-1#1:1444,2\n-1#1:1446\n-1#1:1447,10\n-1#1:1457\n-1#1:1458,6\n-1#1:1464\n-1#1:1465,2\n-1#1:1467,11\n-1#1:1478,4\n-1#1:1482,6\n-1#1:1489,3\n-1#1:1493,2\n-1#1:1495\n-1#1:1496,10\n-1#1:1506\n-1#1:1507,6\n-1#1:1513\n-1#1:1514,2\n-1#1:1516,11\n-1#1:1527,4\n-1#1:1531,6\n-1#1:1538,3\n-1#1:1542,2\n-1#1:1544\n-1#1:1545,10\n-1#1:1555\n-1#1:1556,6\n-1#1:1562\n-1#1:1563,2\n-1#1:1565,11\n-1#1:1576,4\n-1#1:1580,6\n-1#1:1587,3\n-1#1:1591,2\n-1#1:1593\n-1#1:1594,10\n-1#1:1604\n-1#1:1605,6\n-1#1:1611\n-1#1:1612,2\n362#1:1032\n369#1:1033\n388#1:1040\n388#1:1044\n400#1:1060\n400#1:1064\n412#1:1080\n412#1:1084\n421#1:1104\n421#1:1108\n431#1:1130\n431#1:1134\n447#1:1156\n447#1:1160\n470#1:1181\n470#1:1185\n494#1:1207\n494#1:1211\n529#1:1233\n529#1:1237\n529#1:1259\n529#1:1263\n550#1:1285\n550#1:1289\n576#1:1311\n576#1:1315\n598#1:1337\n598#1:1341\n618#1:1356\n621#1:1357\n625#1:1358,3\n626#1:1361,3\n627#1:1364\n628#1:1365\n628#1:1366\n632#1:1367\n635#1:1368\n-1#1:1390\n-1#1:1394\n-1#1:1439\n-1#1:1443\n-1#1:1488\n-1#1:1492\n-1#1:1537\n-1#1:1541\n-1#1:1586\n-1#1:1590\n617#1:1353,3\n*E\n"})
/*      */ public abstract class IntLongMap
/*      */ {
/*      */   @JvmField
/*      */   @NotNull
/*  259 */   public long[] metadata = ScatterMapKt.EmptyGroup;
/*      */   
/*      */   @JvmField
/*      */   @NotNull
/*  263 */   public int[] keys = IntSetKt.getEmptyIntArray();
/*      */   
/*      */   @JvmField
/*      */   @NotNull
/*  267 */   public long[] values = LongSetKt.getEmptyLongArray();
/*      */ 
/*      */   
/*      */   @JvmField
/*      */   public int _capacity;
/*      */ 
/*      */   
/*      */   @JvmField
/*      */   public int _size;
/*      */ 
/*      */ 
/*      */   
/*      */   public final int getCapacity() {
/*  280 */     return this._capacity;
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
/*      */   public final int getSize() {
/*  292 */     return this._size;
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean any() {
/*  297 */     return (this._size != 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean none() {
/*  302 */     return (this._size == 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean isEmpty() {
/*  307 */     return (this._size == 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean isNotEmpty() {
/*  312 */     return (this._size != 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final long get(int key) {
/*  319 */     int index = findKeyIndex(key);
/*  320 */     if (index < 0) {
/*  321 */       throw new NoSuchElementException("Cannot find value for key " + key);
/*      */     }
/*  323 */     return this.values[index];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final long getOrDefault(int key, long defaultValue) {
/*  331 */     int index = findKeyIndex(key);
/*  332 */     if (index >= 0) {
/*  333 */       return this.values[index];
/*      */     }
/*  335 */     return defaultValue;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final long getOrElse(int key, @NotNull Function0 defaultValue) {
/*  344 */     Intrinsics.checkNotNullParameter(defaultValue, "defaultValue"); int $i$f$getOrElse = 0, index = findKeyIndex(key);
/*  345 */     if (index < 0) {
/*  346 */       return ((Number)defaultValue.invoke()).longValue();
/*      */     }
/*  348 */     return this.values[index];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @PublishedApi
/*      */   public final void forEachIndexed(@NotNull Function1 block) {
/*  357 */     Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachIndexed = 0; long[] m = this.metadata;
/*  358 */     int lastIndex = m.length - 2;
/*      */     
/*  360 */     int i = 0; if (i <= lastIndex)
/*  361 */       while (true) { long slot = m[i];
/*  362 */         long $this$maskEmptyOrDeleted$iv = slot; int $i$f$maskEmptyOrDeleted = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1032 */         if (($this$maskEmptyOrDeleted$iv & ($this$maskEmptyOrDeleted$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) { int bitCount = 8 - ((i - lastIndex ^ 0xFFFFFFFF) >>> 31); for (int j = 0; j < bitCount; j++)
/* 1033 */           { long value$iv = slot & 0xFFL; int $i$f$isFull = 0; if ((value$iv < 128L)) { int index = (i << 3) + j; block.invoke(Integer.valueOf(index)); }  slot >>= 8L; }  }  continue; if (i != lastIndex) { i++; continue; }  break; }
/* 1034 */         } public final void forEach(@NotNull Function2 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEach = 0, k[] = this.keys; long[] v = this.values; IntLongMap this_$iv = this; int $i$f$forEachIndexed = 0; long[] m$iv = this_$iv.metadata;
/* 1035 */     int lastIndex$iv = m$iv.length - 2;
/*      */     
/* 1037 */     int i$iv = 0; if (i$iv <= lastIndex$iv) { while (true) {
/* 1038 */         long slot$iv = m$iv[i$iv];
/* 1039 */         long $this$maskEmptyOrDeleted$iv$iv = slot$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1040 */         if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1041 */         { int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/* 1042 */           for (int j$iv = 0;; j$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1050 */           if (bitCount$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv != lastIndex$iv) { i$iv++; continue; }  // Byte code: goto -> 212
/*      */       }  }
/*      */     else {  }
/* 1054 */      } public final void forEachKey(@NotNull Function1 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachKey = 0, k[] = this.keys; IntLongMap this_$iv = this; int $i$f$forEachIndexed = 0; long[] m$iv = this_$iv.metadata;
/* 1055 */     int lastIndex$iv = m$iv.length - 2;
/*      */     
/* 1057 */     int i$iv = 0; if (i$iv <= lastIndex$iv) { while (true) {
/* 1058 */         long slot$iv = m$iv[i$iv];
/* 1059 */         long $this$maskEmptyOrDeleted$iv$iv = slot$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1060 */         if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1061 */         { int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/* 1062 */           for (int j$iv = 0;; j$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1070 */           if (bitCount$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv != lastIndex$iv) { i$iv++; continue; }  // Byte code: goto -> 198
/*      */       }  }
/*      */     else {  }
/* 1074 */      } public final void forEachValue(@NotNull Function1 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachValue = 0; long[] v = this.values; IntLongMap this_$iv = this; int $i$f$forEachIndexed = 0; long[] m$iv = this_$iv.metadata;
/* 1075 */     int lastIndex$iv = m$iv.length - 2;
/*      */     
/* 1077 */     int i$iv = 0; if (i$iv <= lastIndex$iv) { while (true) {
/* 1078 */         long slot$iv = m$iv[i$iv];
/* 1079 */         long $this$maskEmptyOrDeleted$iv$iv = slot$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1080 */         if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1081 */         { int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/* 1082 */           for (int j$iv = 0;; j$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1090 */           if (bitCount$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv != lastIndex$iv) { i$iv++; continue; }  // Byte code: goto -> 198
/*      */       }  }
/*      */     else {  }
/* 1094 */      } public final boolean all(@NotNull Function2 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$all = 0; IntLongMap this_$iv = this; int $i$f$forEach = 0; int[] k$iv = this_$iv.keys;
/* 1095 */     long[] v$iv = this_$iv.values;
/*      */     
/* 1097 */     IntLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1098 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1099 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1101 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1102 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1103 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1104 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1105 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1106 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1115 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 242
/*      */       }  }
/*      */     else {  }
/* 1120 */      return true; } public final boolean any(@NotNull Function2 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$any = 0; IntLongMap this_$iv = this; int $i$f$forEach = 0; int[] k$iv = this_$iv.keys;
/* 1121 */     long[] v$iv = this_$iv.values;
/*      */     
/* 1123 */     IntLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1124 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1125 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1127 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1128 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1129 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1130 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1131 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1132 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1141 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 242
/*      */       }  }
/*      */     else {  }
/*      */      return false; }
/* 1146 */   public final int count() { return getSize(); } public final int count(@NotNull Function2 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$count = 0, count = 0; IntLongMap this_$iv = this; int $i$f$forEach = 0; int[] k$iv = this_$iv.keys;
/* 1147 */     long[] v$iv = this_$iv.values;
/*      */     
/* 1149 */     IntLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1150 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1151 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1153 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true)
/* 1154 */       { long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1155 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1156 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1157 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1158 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1167 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 250 }  }
/*      */     else {  }
/*      */      return count; }
/*      */   public final boolean contains(int key) { return (findKeyIndex(key) >= 0); }
/* 1172 */   public final boolean containsKey(int key) { return (findKeyIndex(key) >= 0); } public final boolean containsValue(long value) { IntLongMap this_$iv = this; int $i$f$forEachValue = 0; long[] v$iv = this_$iv.values;
/*      */     
/* 1174 */     IntLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1175 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1176 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1178 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1179 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1180 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1181 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1182 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1183 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1192 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 203
/*      */       }  }
/*      */     else {  }
/* 1197 */      return false; } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(truncated, "truncated"); StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u248 = stringBuilder1; int $i$a$-buildString-IntLongMap$joinToString$1 = 0; $this$joinToString_u24lambda_u248.append(prefix); int index = 0; IntLongMap this_$iv = this; int $i$f$forEach = 0; int[] k$iv = this_$iv.keys;
/* 1198 */     long[] v$iv = this_$iv.values;
/*      */     
/* 1200 */     IntLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1201 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1202 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1204 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1205 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1206 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1207 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1208 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1209 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1218 */           if (bitCount$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 323 }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 322
/*      */       }  }
/*      */     else { $this$joinToString_u24lambda_u248.append(postfix); }
/* 1223 */      Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()"); return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @NotNull Function2 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(truncated, "truncated"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0; StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2410 = stringBuilder1; int $i$a$-buildString-IntLongMap$joinToString$2 = 0; $this$joinToString_u24lambda_u2410.append(prefix); int index = 0; IntLongMap this_$iv = this; int $i$f$forEach = 0; int[] k$iv = this_$iv.keys;
/* 1224 */     long[] v$iv = this_$iv.values;
/*      */     
/* 1226 */     IntLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1227 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1228 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1230 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1231 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1232 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1233 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1234 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1235 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1244 */           if (bitCount$iv$iv == 8) {
/*      */             continue;
/*      */           }
/*      */           // Byte code: goto -> 336
/*      */         } 
/*      */         continue;
/*      */         if (i$iv$iv != lastIndex$iv$iv) {
/*      */           i$iv$iv++;
/*      */           continue;
/*      */         } 
/*      */         // Byte code: goto -> 335
/*      */       }  }
/*      */     else
/*      */     { $this$joinToString_u24lambda_u2410.append(postfix); }
/*      */     
/*      */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/*      */     return stringBuilder1.toString(); }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int hashCode() {
/*      */     int hash = 0;
/*      */     IntLongMap this_$iv = this;
/*      */     int $i$f$forEach = 0;
/* 1275 */     int[] k$iv = this_$iv.keys;
/* 1276 */     long[] v$iv = this_$iv.values;
/*      */     
/* 1278 */     IntLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1279 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1280 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1282 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true)
/* 1283 */       { long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1284 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1285 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1286 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1287 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1296 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 222 }  } else {  }
/*      */      return hash; } public boolean equals(@Nullable Object other) { if (other == this)
/*      */       return true;  if (!(other instanceof IntLongMap))
/*      */       return false;  if (((IntLongMap)other).getSize() != getSize())
/* 1301 */       return false;  IntLongMap this_$iv = this; int $i$f$forEach = 0; int[] k$iv = this_$iv.keys;
/* 1302 */     long[] v$iv = this_$iv.values;
/*      */     
/* 1304 */     IntLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1305 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1306 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1308 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1309 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1310 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1311 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1312 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1313 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1322 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 255
/*      */       }  }
/*      */     else {  }
/*      */      return true; } @NotNull public String toString() { if (isEmpty())
/* 1327 */       return "{}";  StringBuilder s = (new StringBuilder()).append('{'); int i = 0; IntLongMap this_$iv = this; int $i$f$forEach = 0; int[] k$iv = this_$iv.keys;
/* 1328 */     long[] v$iv = this_$iv.values;
/*      */     
/* 1330 */     IntLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1331 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1332 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1334 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1335 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1336 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1337 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1338 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1339 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1348 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 279
/*      */       }  }
/*      */     else {  }
/* 1353 */      Intrinsics.checkNotNullExpressionValue(s.append('}').toString(), "s.append('}').toString()"); return s.append('}').toString(); } @PublishedApi public final int findKeyIndex(int key) { int $i$f$hash = 0; int hash$iv = Integer.hashCode(key) * -862048943;
/*      */     
/* 1355 */     int hash = hash$iv ^ hash$iv << 16;
/* 1356 */     int $i$f$h2 = 0, hash2 = hash & 0x7F; int probeMask = this._capacity;
/* 1357 */     int $i$f$h1 = 0, probeOffset = hash >>> 7 & probeMask; int probeIndex = 0; while (true)
/* 1358 */     { long[] metadata$iv = this.metadata; int $i$f$group = 0; int i$iv = probeOffset >> 3;
/* 1359 */       int b$iv = (probeOffset & 0x7) << 3;
/* 1360 */       long g = metadata$iv[i$iv] >>> b$iv | metadata$iv[i$iv + 1] << 64 - b$iv & -(b$iv) >> 63L; long $this$match$iv = g; int $i$f$match = 0;
/* 1361 */       long x$iv = $this$match$iv ^ 72340172838076673L * hash2;
/*      */       
/* 1363 */       long m = x$iv - 72340172838076673L & (x$iv ^ 0xFFFFFFFFFFFFFFFFL) & 0x8080808080808080L; while (true)
/* 1364 */       { long $this$hasNext$iv = m; int $i$f$hasNext = 0; if (($this$hasNext$iv != 0L)) {
/* 1365 */           long $this$get$iv = m; int $i$f$get = 0; long $this$lowestBitSet$iv$iv = $this$get$iv; int $i$f$lowestBitSet = 0;
/* 1366 */           int index = probeOffset + (Long.numberOfTrailingZeros($this$lowestBitSet$iv$iv) >> 3) & probeMask;
/*      */         }  long $this$maskEmpty$iv = g; int $i$f$maskEmpty = 0;
/* 1368 */         if (($this$maskEmpty$iv & ($this$maskEmpty$iv ^ 0xFFFFFFFFFFFFFFFFL) << 6L & 0x8080808080808080L) != 0L)
/* 1369 */           return -1;  break; }  probeIndex += 8; probeOffset = probeOffset + probeIndex & probeMask; }  return -1; } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull Function2 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1374 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1376 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2410$iv = stringBuilder1; int $i$a$-buildString-IntLongMap$joinToString$2$iv = 0;
/* 1377 */     $this$joinToString_u24lambda_u2410$iv.append(prefix);
/* 1378 */     int index$iv = 0;
/* 1379 */     IntLongMap this_$iv$iv = this; int $i$f$forEach = 0;
/* 1380 */     int[] k$iv$iv = this_$iv$iv.keys;
/* 1381 */     long[] v$iv$iv = this_$iv$iv.values;
/*      */     
/* 1383 */     IntLongMap this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndexed = 0;
/* 1384 */     long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1385 */     int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */     
/* 1387 */     int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1388 */         long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1389 */         long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1390 */         if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1391 */           int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1392 */           for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
/* 1393 */             long value$iv$iv$iv$iv = slot$iv$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1394 */             if ((value$iv$iv$iv$iv < 128L)) {
/* 1395 */               int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
/* 1396 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndexed-IntLongMap$forEach$1$iv$iv = 0;
/* 1397 */               long l = v$iv$iv[index$iv$iv]; int key$iv = k$iv$iv[index$iv$iv], $i$a$-forEach-IntLongMap$joinToString$2$1$iv = 0;
/* 1398 */               if (index$iv == limit) {
/* 1399 */                 $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
/*      */                 // Byte code: goto -> 349
/*      */               } 
/* 1402 */               if (index$iv != 0) {
/* 1403 */                 $this$joinToString_u24lambda_u2410$iv.append(separator);
/*      */               }
/* 1405 */               $this$joinToString_u24lambda_u2410$iv.append((CharSequence)transform.invoke(Integer.valueOf(key$iv), Long.valueOf(l)));
/* 1406 */               index$iv++;
/*      */             } 
/*      */             
/* 1409 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1411 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 340
/*      */         }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*      */          // Byte code: goto -> 339
/*      */       }  }
/* 1416 */     else { $this$joinToString_u24lambda_u2410$iv.append(postfix); }
/*      */      Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/* 1418 */     return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, @NotNull Function2 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/*      */ 
/*      */ 
/*      */     
/* 1422 */     int limit$iv = -1;
/* 1423 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1425 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2410$iv = stringBuilder1; int $i$a$-buildString-IntLongMap$joinToString$2$iv = 0;
/* 1426 */     $this$joinToString_u24lambda_u2410$iv.append(prefix);
/* 1427 */     int index$iv = 0;
/* 1428 */     IntLongMap this_$iv$iv = this; int $i$f$forEach = 0;
/* 1429 */     int[] k$iv$iv = this_$iv$iv.keys;
/* 1430 */     long[] v$iv$iv = this_$iv$iv.values;
/*      */     
/* 1432 */     IntLongMap this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndexed = 0;
/* 1433 */     long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1434 */     int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */     
/* 1436 */     int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { label36: while (true)
/* 1437 */       { long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1438 */         long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1439 */         if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1440 */           int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1441 */           for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
/* 1442 */             long value$iv$iv$iv$iv = slot$iv$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1443 */             if ((value$iv$iv$iv$iv < 128L)) {
/* 1444 */               int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
/* 1445 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndexed-IntLongMap$forEach$1$iv$iv = 0;
/* 1446 */               long l = v$iv$iv[index$iv$iv]; int key$iv = k$iv$iv[index$iv$iv], $i$a$-forEach-IntLongMap$joinToString$2$1$iv = 0;
/* 1447 */               if (index$iv == limit$iv) {
/* 1448 */                 $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
/*      */                 break label36;
/*      */               } 
/* 1451 */               if (index$iv != 0) {
/* 1452 */                 $this$joinToString_u24lambda_u2410$iv.append(separator);
/*      */               }
/* 1454 */               $this$joinToString_u24lambda_u2410$iv.append((CharSequence)transform.invoke(Integer.valueOf(key$iv), Long.valueOf(l)));
/* 1455 */               index$iv++;
/*      */             } 
/*      */             
/* 1458 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1460 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue; 
/*      */         } else {
/*      */           continue;
/*      */         } 
/* 1465 */         $this$joinToString_u24lambda_u2410$iv.append(postfix); if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }  continue; }  } else { $this$joinToString_u24lambda_u2410$iv.append(postfix); }
/*      */      Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/* 1467 */     return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull Function2 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/*      */ 
/*      */     
/* 1470 */     CharSequence postfix$iv = "";
/* 1471 */     int limit$iv = -1;
/* 1472 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1474 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2410$iv = stringBuilder1; int $i$a$-buildString-IntLongMap$joinToString$2$iv = 0;
/* 1475 */     $this$joinToString_u24lambda_u2410$iv.append(prefix);
/* 1476 */     int index$iv = 0;
/* 1477 */     IntLongMap this_$iv$iv = this; int $i$f$forEach = 0;
/* 1478 */     int[] k$iv$iv = this_$iv$iv.keys;
/* 1479 */     long[] v$iv$iv = this_$iv$iv.values;
/*      */     
/* 1481 */     IntLongMap this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndexed = 0;
/* 1482 */     long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1483 */     int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */     
/* 1485 */     int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1486 */         long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1487 */         long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1488 */         if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1489 */           int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1490 */           for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
/* 1491 */             long value$iv$iv$iv$iv = slot$iv$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1492 */             if ((value$iv$iv$iv$iv < 128L)) {
/* 1493 */               int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
/* 1494 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndexed-IntLongMap$forEach$1$iv$iv = 0;
/* 1495 */               long l = v$iv$iv[index$iv$iv]; int key$iv = k$iv$iv[index$iv$iv], $i$a$-forEach-IntLongMap$joinToString$2$1$iv = 0;
/* 1496 */               if (index$iv == limit$iv) {
/* 1497 */                 $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
/*      */                 // Byte code: goto -> 353
/*      */               } 
/* 1500 */               if (index$iv != 0) {
/* 1501 */                 $this$joinToString_u24lambda_u2410$iv.append(separator);
/*      */               }
/* 1503 */               $this$joinToString_u24lambda_u2410$iv.append((CharSequence)transform.invoke(Integer.valueOf(key$iv), Long.valueOf(l)));
/* 1504 */               index$iv++;
/*      */             } 
/*      */             
/* 1507 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1509 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 343
/*      */         }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*      */          // Byte code: goto -> 342
/*      */       }  }
/* 1514 */     else { $this$joinToString_u24lambda_u2410$iv.append(postfix$iv); }
/*      */      Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/* 1516 */     return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull Function2 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/*      */     
/* 1518 */     CharSequence prefix$iv = "";
/* 1519 */     CharSequence postfix$iv = "";
/* 1520 */     int limit$iv = -1;
/* 1521 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1523 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2410$iv = stringBuilder1; int $i$a$-buildString-IntLongMap$joinToString$2$iv = 0;
/* 1524 */     $this$joinToString_u24lambda_u2410$iv.append(prefix$iv);
/* 1525 */     int index$iv = 0;
/* 1526 */     IntLongMap this_$iv$iv = this; int $i$f$forEach = 0;
/* 1527 */     int[] k$iv$iv = this_$iv$iv.keys;
/* 1528 */     long[] v$iv$iv = this_$iv$iv.values;
/*      */     
/* 1530 */     IntLongMap this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndexed = 0;
/* 1531 */     long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1532 */     int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */     
/* 1534 */     int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1535 */         long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1536 */         long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1537 */         if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1538 */           int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1539 */           for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
/* 1540 */             long value$iv$iv$iv$iv = slot$iv$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1541 */             if ((value$iv$iv$iv$iv < 128L)) {
/* 1542 */               int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
/* 1543 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndexed-IntLongMap$forEach$1$iv$iv = 0;
/* 1544 */               long l = v$iv$iv[index$iv$iv]; int key$iv = k$iv$iv[index$iv$iv], $i$a$-forEach-IntLongMap$joinToString$2$1$iv = 0;
/* 1545 */               if (index$iv == limit$iv) {
/* 1546 */                 $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
/*      */                 // Byte code: goto -> 355
/*      */               } 
/* 1549 */               if (index$iv != 0) {
/* 1550 */                 $this$joinToString_u24lambda_u2410$iv.append(separator);
/*      */               }
/* 1552 */               $this$joinToString_u24lambda_u2410$iv.append((CharSequence)transform.invoke(Integer.valueOf(key$iv), Long.valueOf(l)));
/* 1553 */               index$iv++;
/*      */             } 
/*      */             
/* 1556 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1558 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 345
/*      */         }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*      */          // Byte code: goto -> 344
/*      */       }  }
/* 1563 */     else { $this$joinToString_u24lambda_u2410$iv.append(postfix$iv); }
/*      */      Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/* 1565 */     return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull Function2 transform) { Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/* 1566 */     CharSequence separator$iv = ", ";
/* 1567 */     CharSequence prefix$iv = "";
/* 1568 */     CharSequence postfix$iv = "";
/* 1569 */     int limit$iv = -1;
/* 1570 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1572 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2410$iv = stringBuilder1; int $i$a$-buildString-IntLongMap$joinToString$2$iv = 0;
/* 1573 */     $this$joinToString_u24lambda_u2410$iv.append(prefix$iv);
/* 1574 */     int index$iv = 0;
/* 1575 */     IntLongMap this_$iv$iv = this; int $i$f$forEach = 0;
/* 1576 */     int[] k$iv$iv = this_$iv$iv.keys;
/* 1577 */     long[] v$iv$iv = this_$iv$iv.values;
/*      */     
/* 1579 */     IntLongMap this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndexed = 0;
/* 1580 */     long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1581 */     int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */     
/* 1583 */     int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1584 */         long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1585 */         long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1586 */         if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1587 */           int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1588 */           for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
/* 1589 */             long value$iv$iv$iv$iv = slot$iv$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1590 */             if ((value$iv$iv$iv$iv < 128L)) {
/* 1591 */               int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
/* 1592 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndexed-IntLongMap$forEach$1$iv$iv = 0;
/* 1593 */               long l = v$iv$iv[index$iv$iv]; int key$iv = k$iv$iv[index$iv$iv], $i$a$-forEach-IntLongMap$joinToString$2$1$iv = 0;
/* 1594 */               if (index$iv == limit$iv) {
/* 1595 */                 $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
/*      */                 // Byte code: goto -> 356
/*      */               } 
/* 1598 */               if (index$iv != 0) {
/* 1599 */                 $this$joinToString_u24lambda_u2410$iv.append(separator$iv);
/*      */               }
/* 1601 */               $this$joinToString_u24lambda_u2410$iv.append((CharSequence)transform.invoke(Integer.valueOf(key$iv), Long.valueOf(l)));
/* 1602 */               index$iv++;
/*      */             } 
/*      */             
/* 1605 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1607 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 346
/*      */         }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*      */          // Byte code: goto -> 345
/*      */       }  }
/* 1612 */     else { $this$joinToString_u24lambda_u2410$iv.append(postfix$iv); }
/*      */     
/*      */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/*      */     return stringBuilder1.toString(); }
/*      */ 
/*      */   
/*      */   private IntLongMap() {}
/*      */   
/*      */   @JvmOverloads
/*      */   @NotNull
/*      */   public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit) {
/*      */     Intrinsics.checkNotNullParameter(separator, "separator");
/*      */     Intrinsics.checkNotNullParameter(prefix, "prefix");
/*      */     Intrinsics.checkNotNullParameter(postfix, "postfix");
/*      */     return joinToString$default(this, separator, prefix, postfix, limit, null, 16, null);
/*      */   }
/*      */   
/*      */   @JvmOverloads
/*      */   @NotNull
/*      */   public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
/*      */     Intrinsics.checkNotNullParameter(separator, "separator");
/*      */     Intrinsics.checkNotNullParameter(prefix, "prefix");
/*      */     Intrinsics.checkNotNullParameter(postfix, "postfix");
/*      */     return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
/*      */   }
/*      */   
/*      */   @JvmOverloads
/*      */   @NotNull
/*      */   public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
/*      */     Intrinsics.checkNotNullParameter(separator, "separator");
/*      */     Intrinsics.checkNotNullParameter(prefix, "prefix");
/*      */     return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
/*      */   }
/*      */   
/*      */   @JvmOverloads
/*      */   @NotNull
/*      */   public final String joinToString(@NotNull CharSequence separator) {
/*      */     Intrinsics.checkNotNullParameter(separator, "separator");
/*      */     return joinToString$default(this, separator, null, null, 0, null, 30, null);
/*      */   }
/*      */   
/*      */   @JvmOverloads
/*      */   @NotNull
/*      */   public final String joinToString() {
/*      */     return joinToString$default(this, null, null, null, 0, null, 31, null);
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\IntLongMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */