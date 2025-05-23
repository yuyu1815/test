/*      */ package androidx.collection;
/*      */ 
/*      */ import androidx.collection.internal.ContainerHelpersKt;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000j\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\007\n\002\020\021\n\002\b\003\n\002\020\026\n\002\b\006\n\002\020\013\n\000\n\002\030\002\n\002\020\t\n\002\b\r\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\005\n\002\020\016\n\000\n\002\020\r\n\002\b\007\n\002\030\002\n\000\b6\030\000*\004\b\000\020\0012\0020\002B\007\b\004¢\006\002\020\003J&\020\027\032\0020\0302\030\020\031\032\024\022\004\022\0028\000\022\004\022\0020\033\022\004\022\0020\0300\032H\bø\001\000J\006\020\034\032\0020\030J&\020\034\032\0020\0302\030\020\031\032\024\022\004\022\0028\000\022\004\022\0020\033\022\004\022\0020\0300\032H\bø\001\000J\026\020\035\032\0020\0302\006\020\036\032\0028\000H\002¢\006\002\020\037J\023\020 \032\0020\0302\006\020\036\032\0028\000¢\006\002\020\037J\016\020!\032\0020\0302\006\020\"\032\0020\033J\006\020#\032\0020\005J&\020#\032\0020\0052\030\020\031\032\024\022\004\022\0028\000\022\004\022\0020\033\022\004\022\0020\0300\032H\bø\001\000J\023\020$\032\0020\0302\b\020%\032\004\030\0010\002H\002J\025\020&\032\0020\0052\006\020\036\032\0028\000H\001¢\006\002\020'JD\020(\032\0020)26\020*\0322\022\023\022\0218\000¢\006\f\b+\022\b\b,\022\004\b\b(\036\022\023\022\0210\033¢\006\f\b+\022\b\b,\022\004\b\b(\"\022\004\022\0020)0\032H\bø\001\000J/\020-\032\0020)2!\020*\032\035\022\023\022\0210\005¢\006\f\b+\022\b\b,\022\004\b\b(/\022\004\022\0020)0.H\bø\001\000J/\0200\032\0020)2!\020*\032\035\022\023\022\0218\000¢\006\f\b+\022\b\b,\022\004\b\b(\036\022\004\022\0020)0.H\bø\001\000J/\0201\032\0020)2!\020*\032\035\022\023\022\0210\033¢\006\f\b+\022\b\b,\022\004\b\b(\"\022\004\022\0020)0.H\bø\001\000J\026\0202\032\0020\0332\006\020\036\032\0028\000H\002¢\006\002\0203J\033\0204\032\0020\0332\006\020\036\032\0028\0002\006\0205\032\0020\033¢\006\002\0206J'\0207\032\0020\0332\006\020\036\032\0028\0002\f\0205\032\b\022\004\022\0020\03308H\bø\001\000¢\006\002\0209J\b\020:\032\0020\005H\026J\006\020;\032\0020\030J\006\020<\032\0020\030J:\020=\032\0020>2\b\b\002\020?\032\0020@2\b\b\002\020A\032\0020@2\b\b\002\020B\032\0020@2\b\b\002\020C\032\0020\0052\b\b\002\020D\032\0020@H\007Jx\020=\032\0020>2\b\b\002\020?\032\0020@2\b\b\002\020A\032\0020@2\b\b\002\020B\032\0020@2\b\b\002\020C\032\0020\0052\b\b\002\020D\032\0020@28\b\004\020E\0322\022\023\022\0218\000¢\006\f\b+\022\b\b,\022\004\b\b(\036\022\023\022\0210\033¢\006\f\b+\022\b\b,\022\004\b\b(\"\022\004\022\0020@0\032H\bø\001\000J\006\020F\032\0020\030J\b\020G\032\0020>H\026R\030\020\004\032\0020\0058\000@\000X\016¢\006\b\n\000\022\004\b\006\020\003R\030\020\007\032\0020\0058\000@\000X\016¢\006\b\n\000\022\004\b\b\020\003R\021\020\t\032\0020\0058F¢\006\006\032\004\b\n\020\013R\"\020\f\032\n\022\006\022\004\030\0010\0020\r8\000@\000X\016¢\006\n\n\002\020\017\022\004\b\016\020\003R\030\020\020\032\0020\0218\000@\000X\016¢\006\b\n\000\022\004\b\022\020\003R\021\020\023\032\0020\0058F¢\006\006\032\004\b\024\020\013R\030\020\025\032\0020\0218\000@\000X\016¢\006\b\n\000\022\004\b\026\020\003\001\001H\002\007\n\005\b20\001¨\006I"}, d2 = {"Landroidx/collection/ObjectLongMap;", "K", "", "()V", "_capacity", "", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "capacity", "getCapacity", "()I", "keys", "", "getKeys$annotations", "[Ljava/lang/Object;", "metadata", "", "getMetadata$annotations", "size", "getSize", "values", "getValues$annotations", "all", "", "predicate", "Lkotlin/Function2;", "", "any", "contains", "key", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "value", "count", "equals", "other", "findKeyIndex", "(Ljava/lang/Object;)I", "forEach", "", "block", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function1;", "index", "forEachKey", "forEachValue", "get", "(Ljava/lang/Object;)J", "getOrDefault", "defaultValue", "(Ljava/lang/Object;J)J", "getOrElse", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)J", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "Landroidx/collection/MutableObjectLongMap;", "collection"})
/*      */ @SourceDebugExtension({"SMAP\nObjectLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/ObjectLongMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1058:1\n373#1,6:1061\n383#1,3:1068\n386#1,9:1072\n373#1,6:1081\n383#1,3:1088\n386#1,9:1092\n373#1,6:1101\n383#1,3:1108\n386#1,9:1112\n401#1,4:1121\n373#1,6:1125\n383#1,3:1132\n386#1,2:1136\n406#1,2:1138\n389#1,6:1140\n408#1:1146\n401#1,4:1147\n373#1,6:1151\n383#1,3:1158\n386#1,2:1162\n406#1,2:1164\n389#1,6:1166\n408#1:1172\n401#1,4:1173\n373#1,6:1177\n383#1,3:1184\n386#1,2:1188\n406#1,2:1190\n389#1,6:1192\n408#1:1198\n428#1,3:1199\n373#1,6:1202\n383#1,3:1209\n386#1,2:1213\n431#1,2:1215\n389#1,6:1217\n433#1:1223\n401#1,4:1224\n373#1,6:1228\n383#1,3:1235\n386#1,2:1239\n406#1,2:1241\n389#1,6:1243\n408#1:1249\n401#1,4:1250\n373#1,6:1254\n383#1,3:1261\n386#1,2:1265\n406#1,2:1267\n389#1,6:1269\n408#1:1275\n401#1,4:1276\n373#1,6:1280\n383#1,3:1287\n386#1,2:1291\n406#1,2:1293\n389#1,6:1295\n408#1:1301\n401#1,4:1302\n373#1,6:1306\n383#1,3:1313\n386#1,2:1317\n406#1,2:1319\n389#1,6:1321\n408#1:1327\n401#1,4:1328\n373#1,6:1332\n383#1,3:1339\n386#1,2:1343\n406#1,2:1345\n389#1,6:1347\n408#1:1353\n401#1,4:1354\n373#1,6:1358\n383#1,3:1365\n386#1,2:1369\n406#1,2:1371\n389#1,6:1373\n408#1:1379\n537#1,11:1396\n401#1,4:1407\n373#1,6:1411\n383#1,3:1418\n386#1,2:1422\n406#1:1424\n548#1,10:1425\n407#1:1435\n389#1,6:1436\n408#1:1442\n558#1,2:1443\n537#1,11:1445\n401#1,4:1456\n373#1,6:1460\n383#1,3:1467\n386#1,2:1471\n406#1:1473\n548#1,10:1474\n407#1:1484\n389#1,6:1485\n408#1:1491\n558#1,2:1492\n537#1,11:1494\n401#1,4:1505\n373#1,6:1509\n383#1,3:1516\n386#1,2:1520\n406#1:1522\n548#1,10:1523\n407#1:1533\n389#1,6:1534\n408#1:1540\n558#1,2:1541\n537#1,11:1543\n401#1,4:1554\n373#1,6:1558\n383#1,3:1565\n386#1,2:1569\n406#1:1571\n548#1,10:1572\n407#1:1582\n389#1,6:1583\n408#1:1589\n558#1,2:1590\n537#1,11:1592\n401#1,4:1603\n373#1,6:1607\n383#1,3:1614\n386#1,2:1618\n406#1:1620\n548#1,10:1621\n407#1:1631\n389#1,6:1632\n408#1:1638\n558#1,2:1639\n1810#2:1059\n1672#2:1060\n1810#2:1067\n1672#2:1071\n1810#2:1087\n1672#2:1091\n1810#2:1107\n1672#2:1111\n1810#2:1131\n1672#2:1135\n1810#2:1157\n1672#2:1161\n1810#2:1183\n1672#2:1187\n1810#2:1208\n1672#2:1212\n1810#2:1234\n1672#2:1238\n1810#2:1260\n1672#2:1264\n1810#2:1286\n1672#2:1290\n1810#2:1312\n1672#2:1316\n1810#2:1338\n1672#2:1342\n1810#2:1364\n1672#2:1368\n1589#2,3:1380\n1603#2:1383\n1599#2:1384\n1779#2,3:1385\n1793#2,3:1388\n1717#2:1391\n1705#2:1392\n1699#2:1393\n1712#2:1394\n1802#2:1395\n1810#2:1417\n1672#2:1421\n1810#2:1466\n1672#2:1470\n1810#2:1515\n1672#2:1519\n1810#2:1564\n1672#2:1568\n1810#2:1613\n1672#2:1617\n*S KotlinDebug\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/ObjectLongMap\n*L\n404#1:1061,6\n404#1:1068,3\n404#1:1072,9\n417#1:1081,6\n417#1:1088,3\n417#1:1092,9\n430#1:1101,6\n430#1:1108,3\n430#1:1112,9\n439#1:1121,4\n439#1:1125,6\n439#1:1132,3\n439#1:1136,2\n439#1:1138,2\n439#1:1140,6\n439#1:1146\n449#1:1147,4\n449#1:1151,6\n449#1:1158,3\n449#1:1162,2\n449#1:1164,2\n449#1:1166,6\n449#1:1172\n465#1:1173,4\n465#1:1177,6\n465#1:1184,3\n465#1:1188,2\n465#1:1190,2\n465#1:1192,6\n465#1:1198\n488#1:1199,3\n488#1:1202,6\n488#1:1209,3\n488#1:1213,2\n488#1:1215,2\n488#1:1217,6\n488#1:1223\n512#1:1224,4\n512#1:1228,6\n512#1:1235,3\n512#1:1239,2\n512#1:1241,2\n512#1:1243,6\n512#1:1249\n547#1:1250,4\n547#1:1254,6\n547#1:1261,3\n547#1:1265,2\n547#1:1267,2\n547#1:1269,6\n547#1:1275\n547#1:1276,4\n547#1:1280,6\n547#1:1287,3\n547#1:1291,2\n547#1:1293,2\n547#1:1295,6\n547#1:1301\n568#1:1302,4\n568#1:1306,6\n568#1:1313,3\n568#1:1317,2\n568#1:1319,2\n568#1:1321,6\n568#1:1327\n597#1:1328,4\n597#1:1332,6\n597#1:1339,3\n597#1:1343,2\n597#1:1345,2\n597#1:1347,6\n597#1:1353\n619#1:1354,4\n619#1:1358,6\n619#1:1365,3\n619#1:1369,2\n619#1:1371,2\n619#1:1373,6\n619#1:1379\n-1#1:1396,11\n-1#1:1407,4\n-1#1:1411,6\n-1#1:1418,3\n-1#1:1422,2\n-1#1:1424\n-1#1:1425,10\n-1#1:1435\n-1#1:1436,6\n-1#1:1442\n-1#1:1443,2\n-1#1:1445,11\n-1#1:1456,4\n-1#1:1460,6\n-1#1:1467,3\n-1#1:1471,2\n-1#1:1473\n-1#1:1474,10\n-1#1:1484\n-1#1:1485,6\n-1#1:1491\n-1#1:1492,2\n-1#1:1494,11\n-1#1:1505,4\n-1#1:1509,6\n-1#1:1516,3\n-1#1:1520,2\n-1#1:1522\n-1#1:1523,10\n-1#1:1533\n-1#1:1534,6\n-1#1:1540\n-1#1:1541,2\n-1#1:1543,11\n-1#1:1554,4\n-1#1:1558,6\n-1#1:1565,3\n-1#1:1569,2\n-1#1:1571\n-1#1:1572,10\n-1#1:1582\n-1#1:1583,6\n-1#1:1589\n-1#1:1590,2\n-1#1:1592,11\n-1#1:1603,4\n-1#1:1607,6\n-1#1:1614,3\n-1#1:1618,2\n-1#1:1620\n-1#1:1621,10\n-1#1:1631\n-1#1:1632,6\n-1#1:1638\n-1#1:1639,2\n378#1:1059\n385#1:1060\n404#1:1067\n404#1:1071\n417#1:1087\n417#1:1091\n430#1:1107\n430#1:1111\n439#1:1131\n439#1:1135\n449#1:1157\n449#1:1161\n465#1:1183\n465#1:1187\n488#1:1208\n488#1:1212\n512#1:1234\n512#1:1238\n547#1:1260\n547#1:1264\n547#1:1286\n547#1:1290\n568#1:1312\n568#1:1316\n597#1:1338\n597#1:1342\n619#1:1364\n619#1:1368\n638#1:1380,3\n639#1:1383\n642#1:1384\n646#1:1385,3\n647#1:1388,3\n648#1:1391\n649#1:1392\n649#1:1393\n653#1:1394\n656#1:1395\n-1#1:1417\n-1#1:1421\n-1#1:1466\n-1#1:1470\n-1#1:1515\n-1#1:1519\n-1#1:1564\n-1#1:1568\n-1#1:1613\n-1#1:1617\n*E\n"})
/*      */ public abstract class ObjectLongMap<K>
/*      */ {
/*      */   @JvmField
/*      */   @NotNull
/*  274 */   public long[] metadata = ScatterMapKt.EmptyGroup;
/*      */   
/*      */   @JvmField
/*      */   @NotNull
/*  278 */   public Object[] keys = ContainerHelpersKt.EMPTY_OBJECTS;
/*      */   
/*      */   @JvmField
/*      */   @NotNull
/*  282 */   public long[] values = LongSetKt.getEmptyLongArray();
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
/*  295 */     return this._capacity;
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
/*  307 */     return this._size;
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean any() {
/*  312 */     return (this._size != 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean none() {
/*  317 */     return (this._size == 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean isEmpty() {
/*  322 */     return (this._size == 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean isNotEmpty() {
/*  327 */     return (this._size != 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final long get(Object key) {
/*  335 */     int index = findKeyIndex((K)key);
/*  336 */     if (index < 0) {
/*  337 */       throw new NoSuchElementException("There is no key " + key + " in the map");
/*      */     }
/*  339 */     return this.values[index];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final long getOrDefault(Object key, long defaultValue) {
/*  347 */     int index = findKeyIndex((K)key);
/*  348 */     if (index >= 0) {
/*  349 */       return this.values[index];
/*      */     }
/*  351 */     return defaultValue;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final long getOrElse(Object key, @NotNull Function0 defaultValue) {
/*  360 */     Intrinsics.checkNotNullParameter(defaultValue, "defaultValue"); int $i$f$getOrElse = 0, index = findKeyIndex((K)key);
/*  361 */     if (index >= 0) {
/*  362 */       return this.values[index];
/*      */     }
/*  364 */     return ((Number)defaultValue.invoke()).longValue();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @PublishedApi
/*      */   public final void forEachIndexed(@NotNull Function1 block) {
/*  373 */     Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachIndexed = 0; long[] m = this.metadata;
/*  374 */     int lastIndex = m.length - 2;
/*      */     
/*  376 */     int i = 0; if (i <= lastIndex)
/*  377 */       while (true) { long slot = m[i];
/*  378 */         long $this$maskEmptyOrDeleted$iv = slot; int $i$f$maskEmptyOrDeleted = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1059 */         if (($this$maskEmptyOrDeleted$iv & ($this$maskEmptyOrDeleted$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) { int bitCount = 8 - ((i - lastIndex ^ 0xFFFFFFFF) >>> 31); for (int j = 0; j < bitCount; j++)
/* 1060 */           { long value$iv = slot & 0xFFL; int $i$f$isFull = 0; if ((value$iv < 128L)) { int index = (i << 3) + j; block.invoke(Integer.valueOf(index)); }  slot >>= 8L; }  }  continue; if (i != lastIndex) { i++; continue; }  break; }
/* 1061 */         } public final void forEach(@NotNull Function2 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEach = 0; Object[] k = this.keys; long[] v = this.values; ObjectLongMap this_$iv = this; int $i$f$forEachIndexed = 0; long[] m$iv = this_$iv.metadata;
/* 1062 */     int lastIndex$iv = m$iv.length - 2;
/*      */     
/* 1064 */     int i$iv = 0; if (i$iv <= lastIndex$iv) { while (true) {
/* 1065 */         long slot$iv = m$iv[i$iv];
/* 1066 */         long $this$maskEmptyOrDeleted$iv$iv = slot$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1067 */         if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1068 */         { int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/* 1069 */           for (int j$iv = 0;; j$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1077 */           if (bitCount$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv != lastIndex$iv) { i$iv++; continue; }  // Byte code: goto -> 209
/*      */       }  }
/*      */     else {  }
/* 1081 */      } public final void forEachKey(@NotNull Function1 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachKey = 0; Object[] k = this.keys; ObjectLongMap this_$iv = this; int $i$f$forEachIndexed = 0; long[] m$iv = this_$iv.metadata;
/* 1082 */     int lastIndex$iv = m$iv.length - 2;
/*      */     
/* 1084 */     int i$iv = 0; if (i$iv <= lastIndex$iv) { while (true) {
/* 1085 */         long slot$iv = m$iv[i$iv];
/* 1086 */         long $this$maskEmptyOrDeleted$iv$iv = slot$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1087 */         if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1088 */         { int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/* 1089 */           for (int j$iv = 0;; j$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1097 */           if (bitCount$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv != lastIndex$iv) { i$iv++; continue; }  // Byte code: goto -> 195
/*      */       }  }
/*      */     else {  }
/* 1101 */      } public final void forEachValue(@NotNull Function1 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachValue = 0; long[] v = this.values; ObjectLongMap this_$iv = this; int $i$f$forEachIndexed = 0; long[] m$iv = this_$iv.metadata;
/* 1102 */     int lastIndex$iv = m$iv.length - 2;
/*      */     
/* 1104 */     int i$iv = 0; if (i$iv <= lastIndex$iv) { while (true) {
/* 1105 */         long slot$iv = m$iv[i$iv];
/* 1106 */         long $this$maskEmptyOrDeleted$iv$iv = slot$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1107 */         if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1108 */         { int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/* 1109 */           for (int j$iv = 0;; j$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1117 */           if (bitCount$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv != lastIndex$iv) { i$iv++; continue; }  // Byte code: goto -> 198
/*      */       }  }
/*      */     else {  }
/* 1121 */      } public final boolean all(@NotNull Function2 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$all = 0; ObjectLongMap this_$iv = this; int $i$f$forEach = 0; Object[] k$iv = this_$iv.keys;
/* 1122 */     long[] v$iv = this_$iv.values;
/*      */     
/* 1124 */     ObjectLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1125 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1126 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1128 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1129 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1130 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1131 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1132 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1133 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1142 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 239
/*      */       }  }
/*      */     else {  }
/* 1147 */      return true; } public final boolean any(@NotNull Function2 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$any = 0; ObjectLongMap this_$iv = this; int $i$f$forEach = 0; Object[] k$iv = this_$iv.keys;
/* 1148 */     long[] v$iv = this_$iv.values;
/*      */     
/* 1150 */     ObjectLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1151 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1152 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1154 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1155 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1156 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1157 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1158 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1159 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1168 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 239
/*      */       }  }
/*      */     else {  }
/*      */      return false; }
/* 1173 */   public final int count() { return getSize(); } public final int count(@NotNull Function2 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$count = 0, count = 0; ObjectLongMap this_$iv = this; int $i$f$forEach = 0; Object[] k$iv = this_$iv.keys;
/* 1174 */     long[] v$iv = this_$iv.values;
/*      */     
/* 1176 */     ObjectLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1177 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1178 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1180 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true)
/* 1181 */       { long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1182 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1183 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1184 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1185 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1194 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 247 }  }
/*      */     else {  }
/*      */      return count; }
/*      */   public final boolean contains(Object key) { return (findKeyIndex((K)key) >= 0); }
/* 1199 */   public final boolean containsKey(Object key) { return (findKeyIndex((K)key) >= 0); } public final boolean containsValue(long value) { ObjectLongMap this_$iv = this; int $i$f$forEachValue = 0; long[] v$iv = this_$iv.values;
/*      */     
/* 1201 */     ObjectLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1202 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1203 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1205 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1206 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1207 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1208 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1209 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1210 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1219 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 203
/*      */       }  }
/*      */     else {  }
/* 1224 */      return false; } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(truncated, "truncated"); StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u248 = stringBuilder1; int $i$a$-buildString-ObjectLongMap$joinToString$1 = 0; $this$joinToString_u24lambda_u248.append(prefix); int index = 0; ObjectLongMap this_$iv = this; int $i$f$forEach = 0; Object[] k$iv = this_$iv.keys;
/* 1225 */     long[] v$iv = this_$iv.values;
/*      */     
/* 1227 */     ObjectLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1228 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1229 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1231 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1232 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1233 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1234 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1235 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1236 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1245 */           if (bitCount$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 323 }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 322
/*      */       }  }
/*      */     else { $this$joinToString_u24lambda_u248.append(postfix); }
/* 1250 */      Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()"); return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @NotNull Function2 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(truncated, "truncated"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0; StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2410 = stringBuilder1; int $i$a$-buildString-ObjectLongMap$joinToString$2 = 0; $this$joinToString_u24lambda_u2410.append(prefix); int index = 0; ObjectLongMap this_$iv = this; int $i$f$forEach = 0; Object[] k$iv = this_$iv.keys;
/* 1251 */     long[] v$iv = this_$iv.values;
/*      */     
/* 1253 */     ObjectLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1254 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1255 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1257 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1258 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1259 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1260 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1261 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1262 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1271 */           if (bitCount$iv$iv == 8) {
/*      */             continue;
/*      */           }
/*      */           // Byte code: goto -> 333
/*      */         } 
/*      */         continue;
/*      */         if (i$iv$iv != lastIndex$iv$iv) {
/*      */           i$iv$iv++;
/*      */           continue;
/*      */         } 
/*      */         // Byte code: goto -> 332
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
/*      */     ObjectLongMap this_$iv = this;
/*      */     int $i$f$forEach = 0;
/* 1302 */     Object[] k$iv = this_$iv.keys;
/* 1303 */     long[] v$iv = this_$iv.values;
/*      */     
/* 1305 */     ObjectLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1306 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1307 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1309 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true)
/* 1310 */       { long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1311 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1312 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1313 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1314 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1323 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 231 }  } else {  }
/*      */      return hash; } public boolean equals(@Nullable Object other) { if (other == this)
/*      */       return true;  if (!(other instanceof ObjectLongMap))
/*      */       return false;  if (((ObjectLongMap)other).getSize() != getSize())
/* 1328 */       return false;  ObjectLongMap o = (ObjectLongMap)other; ObjectLongMap this_$iv = this; int $i$f$forEach = 0; Object[] k$iv = this_$iv.keys;
/* 1329 */     long[] v$iv = this_$iv.values;
/*      */     
/* 1331 */     ObjectLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1332 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1333 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1335 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1336 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1337 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1338 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1339 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1340 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1349 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 258
/*      */       }  }
/*      */     else {  }
/*      */      return true; } @NotNull public String toString() { if (isEmpty())
/* 1354 */       return "{}";  StringBuilder s = (new StringBuilder()).append('{'); int i = 0; ObjectLongMap this_$iv = this; int $i$f$forEach = 0; Object[] k$iv = this_$iv.keys;
/* 1355 */     long[] v$iv = this_$iv.values;
/*      */     
/* 1357 */     ObjectLongMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1358 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1359 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1361 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1362 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1363 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1364 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1365 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1366 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1375 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 291
/*      */       }  }
/*      */     else {  }
/* 1380 */      Intrinsics.checkNotNullExpressionValue(s.append('}').toString(), "s.append('}').toString()"); return s.append('}').toString(); } @PublishedApi public final int findKeyIndex(Object key) { int $i$f$hash = 0; int hash$iv = ((key != null) ? key.hashCode() : 0) * -862048943;
/*      */     
/* 1382 */     int hash = hash$iv ^ hash$iv << 16;
/* 1383 */     int $i$f$h2 = 0, hash2 = hash & 0x7F; int probeMask = this._capacity;
/* 1384 */     int $i$f$h1 = 0, probeOffset = hash >>> 7 & probeMask; int probeIndex = 0; while (true)
/* 1385 */     { long[] metadata$iv = this.metadata; int $i$f$group = 0; int i$iv = probeOffset >> 3;
/* 1386 */       int b$iv = (probeOffset & 0x7) << 3;
/* 1387 */       long g = metadata$iv[i$iv] >>> b$iv | metadata$iv[i$iv + 1] << 64 - b$iv & -(b$iv) >> 63L; long $this$match$iv = g; int $i$f$match = 0;
/* 1388 */       long x$iv = $this$match$iv ^ 72340172838076673L * hash2;
/*      */       
/* 1390 */       long m = x$iv - 72340172838076673L & (x$iv ^ 0xFFFFFFFFFFFFFFFFL) & 0x8080808080808080L; while (true)
/* 1391 */       { long $this$hasNext$iv = m; int $i$f$hasNext = 0; if (($this$hasNext$iv != 0L)) {
/* 1392 */           long $this$get$iv = m; int $i$f$get = 0; long $this$lowestBitSet$iv$iv = $this$get$iv; int $i$f$lowestBitSet = 0;
/* 1393 */           int index = probeOffset + (Long.numberOfTrailingZeros($this$lowestBitSet$iv$iv) >> 3) & probeMask;
/*      */         }  long $this$maskEmpty$iv = g; int $i$f$maskEmpty = 0;
/* 1395 */         if (($this$maskEmpty$iv & ($this$maskEmpty$iv ^ 0xFFFFFFFFFFFFFFFFL) << 6L & 0x8080808080808080L) != 0L)
/* 1396 */           return -1;  break; }  probeIndex += 8; probeOffset = probeOffset + probeIndex & probeMask; }  return -1; } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull Function2 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1401 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1403 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2410$iv = stringBuilder1; int $i$a$-buildString-ObjectLongMap$joinToString$2$iv = 0;
/* 1404 */     $this$joinToString_u24lambda_u2410$iv.append(prefix);
/* 1405 */     int index$iv = 0;
/* 1406 */     ObjectLongMap this_$iv$iv = this; int $i$f$forEach = 0;
/* 1407 */     Object[] k$iv$iv = this_$iv$iv.keys;
/* 1408 */     long[] v$iv$iv = this_$iv$iv.values;
/*      */     
/* 1410 */     ObjectLongMap this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndexed = 0;
/* 1411 */     long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1412 */     int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */     
/* 1414 */     int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1415 */         long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1416 */         long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1417 */         if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1418 */           int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1419 */           for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
/* 1420 */             long value$iv$iv$iv$iv = slot$iv$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1421 */             if ((value$iv$iv$iv$iv < 128L)) {
/* 1422 */               int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
/* 1423 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndexed-ObjectLongMap$forEach$1$iv$iv = 0;
/* 1424 */               long l = v$iv$iv[index$iv$iv]; Object key$iv = k$iv$iv[index$iv$iv]; int $i$a$-forEach-ObjectLongMap$joinToString$2$1$iv = 0;
/* 1425 */               if (index$iv == limit) {
/* 1426 */                 $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
/*      */                 // Byte code: goto -> 346
/*      */               } 
/* 1429 */               if (index$iv != 0) {
/* 1430 */                 $this$joinToString_u24lambda_u2410$iv.append(separator);
/*      */               }
/* 1432 */               $this$joinToString_u24lambda_u2410$iv.append((CharSequence)transform.invoke(key$iv, Long.valueOf(l)));
/* 1433 */               index$iv++;
/*      */             } 
/*      */             
/* 1436 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1438 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 337
/*      */         }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*      */          // Byte code: goto -> 336
/*      */       }  }
/* 1443 */     else { $this$joinToString_u24lambda_u2410$iv.append(postfix); }
/*      */      Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/* 1445 */     return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, @NotNull Function2 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/*      */ 
/*      */ 
/*      */     
/* 1449 */     int limit$iv = -1;
/* 1450 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1452 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2410$iv = stringBuilder1; int $i$a$-buildString-ObjectLongMap$joinToString$2$iv = 0;
/* 1453 */     $this$joinToString_u24lambda_u2410$iv.append(prefix);
/* 1454 */     int index$iv = 0;
/* 1455 */     ObjectLongMap this_$iv$iv = this; int $i$f$forEach = 0;
/* 1456 */     Object[] k$iv$iv = this_$iv$iv.keys;
/* 1457 */     long[] v$iv$iv = this_$iv$iv.values;
/*      */     
/* 1459 */     ObjectLongMap this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndexed = 0;
/* 1460 */     long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1461 */     int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */     
/* 1463 */     int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { label36: while (true)
/* 1464 */       { long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1465 */         long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1466 */         if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1467 */           int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1468 */           for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
/* 1469 */             long value$iv$iv$iv$iv = slot$iv$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1470 */             if ((value$iv$iv$iv$iv < 128L)) {
/* 1471 */               int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
/* 1472 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndexed-ObjectLongMap$forEach$1$iv$iv = 0;
/* 1473 */               long l = v$iv$iv[index$iv$iv]; Object key$iv = k$iv$iv[index$iv$iv]; int $i$a$-forEach-ObjectLongMap$joinToString$2$1$iv = 0;
/* 1474 */               if (index$iv == limit$iv) {
/* 1475 */                 $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
/*      */                 break label36;
/*      */               } 
/* 1478 */               if (index$iv != 0) {
/* 1479 */                 $this$joinToString_u24lambda_u2410$iv.append(separator);
/*      */               }
/* 1481 */               $this$joinToString_u24lambda_u2410$iv.append((CharSequence)transform.invoke(key$iv, Long.valueOf(l)));
/* 1482 */               index$iv++;
/*      */             } 
/*      */             
/* 1485 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1487 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue; 
/*      */         } else {
/*      */           continue;
/*      */         } 
/* 1492 */         $this$joinToString_u24lambda_u2410$iv.append(postfix); if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }  continue; }  } else { $this$joinToString_u24lambda_u2410$iv.append(postfix); }
/*      */      Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/* 1494 */     return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull Function2 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/*      */ 
/*      */     
/* 1497 */     CharSequence postfix$iv = "";
/* 1498 */     int limit$iv = -1;
/* 1499 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1501 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2410$iv = stringBuilder1; int $i$a$-buildString-ObjectLongMap$joinToString$2$iv = 0;
/* 1502 */     $this$joinToString_u24lambda_u2410$iv.append(prefix);
/* 1503 */     int index$iv = 0;
/* 1504 */     ObjectLongMap this_$iv$iv = this; int $i$f$forEach = 0;
/* 1505 */     Object[] k$iv$iv = this_$iv$iv.keys;
/* 1506 */     long[] v$iv$iv = this_$iv$iv.values;
/*      */     
/* 1508 */     ObjectLongMap this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndexed = 0;
/* 1509 */     long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1510 */     int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */     
/* 1512 */     int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1513 */         long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1514 */         long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1515 */         if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1516 */           int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1517 */           for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
/* 1518 */             long value$iv$iv$iv$iv = slot$iv$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1519 */             if ((value$iv$iv$iv$iv < 128L)) {
/* 1520 */               int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
/* 1521 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndexed-ObjectLongMap$forEach$1$iv$iv = 0;
/* 1522 */               long l = v$iv$iv[index$iv$iv]; Object key$iv = k$iv$iv[index$iv$iv]; int $i$a$-forEach-ObjectLongMap$joinToString$2$1$iv = 0;
/* 1523 */               if (index$iv == limit$iv) {
/* 1524 */                 $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
/*      */                 // Byte code: goto -> 350
/*      */               } 
/* 1527 */               if (index$iv != 0) {
/* 1528 */                 $this$joinToString_u24lambda_u2410$iv.append(separator);
/*      */               }
/* 1530 */               $this$joinToString_u24lambda_u2410$iv.append((CharSequence)transform.invoke(key$iv, Long.valueOf(l)));
/* 1531 */               index$iv++;
/*      */             } 
/*      */             
/* 1534 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1536 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 340
/*      */         }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*      */          // Byte code: goto -> 339
/*      */       }  }
/* 1541 */     else { $this$joinToString_u24lambda_u2410$iv.append(postfix$iv); }
/*      */      Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/* 1543 */     return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull Function2 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/*      */     
/* 1545 */     CharSequence prefix$iv = "";
/* 1546 */     CharSequence postfix$iv = "";
/* 1547 */     int limit$iv = -1;
/* 1548 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1550 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2410$iv = stringBuilder1; int $i$a$-buildString-ObjectLongMap$joinToString$2$iv = 0;
/* 1551 */     $this$joinToString_u24lambda_u2410$iv.append(prefix$iv);
/* 1552 */     int index$iv = 0;
/* 1553 */     ObjectLongMap this_$iv$iv = this; int $i$f$forEach = 0;
/* 1554 */     Object[] k$iv$iv = this_$iv$iv.keys;
/* 1555 */     long[] v$iv$iv = this_$iv$iv.values;
/*      */     
/* 1557 */     ObjectLongMap this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndexed = 0;
/* 1558 */     long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1559 */     int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */     
/* 1561 */     int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1562 */         long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1563 */         long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1564 */         if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1565 */           int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1566 */           for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
/* 1567 */             long value$iv$iv$iv$iv = slot$iv$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1568 */             if ((value$iv$iv$iv$iv < 128L)) {
/* 1569 */               int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
/* 1570 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndexed-ObjectLongMap$forEach$1$iv$iv = 0;
/* 1571 */               long l = v$iv$iv[index$iv$iv]; Object key$iv = k$iv$iv[index$iv$iv]; int $i$a$-forEach-ObjectLongMap$joinToString$2$1$iv = 0;
/* 1572 */               if (index$iv == limit$iv) {
/* 1573 */                 $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
/*      */                 // Byte code: goto -> 352
/*      */               } 
/* 1576 */               if (index$iv != 0) {
/* 1577 */                 $this$joinToString_u24lambda_u2410$iv.append(separator);
/*      */               }
/* 1579 */               $this$joinToString_u24lambda_u2410$iv.append((CharSequence)transform.invoke(key$iv, Long.valueOf(l)));
/* 1580 */               index$iv++;
/*      */             } 
/*      */             
/* 1583 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1585 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 342
/*      */         }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*      */          // Byte code: goto -> 341
/*      */       }  }
/* 1590 */     else { $this$joinToString_u24lambda_u2410$iv.append(postfix$iv); }
/*      */      Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/* 1592 */     return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull Function2 transform) { Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/* 1593 */     CharSequence separator$iv = ", ";
/* 1594 */     CharSequence prefix$iv = "";
/* 1595 */     CharSequence postfix$iv = "";
/* 1596 */     int limit$iv = -1;
/* 1597 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1599 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2410$iv = stringBuilder1; int $i$a$-buildString-ObjectLongMap$joinToString$2$iv = 0;
/* 1600 */     $this$joinToString_u24lambda_u2410$iv.append(prefix$iv);
/* 1601 */     int index$iv = 0;
/* 1602 */     ObjectLongMap this_$iv$iv = this; int $i$f$forEach = 0;
/* 1603 */     Object[] k$iv$iv = this_$iv$iv.keys;
/* 1604 */     long[] v$iv$iv = this_$iv$iv.values;
/*      */     
/* 1606 */     ObjectLongMap this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndexed = 0;
/* 1607 */     long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1608 */     int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */     
/* 1610 */     int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1611 */         long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1612 */         long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1613 */         if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1614 */           int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1615 */           for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
/* 1616 */             long value$iv$iv$iv$iv = slot$iv$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1617 */             if ((value$iv$iv$iv$iv < 128L)) {
/* 1618 */               int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
/* 1619 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndexed-ObjectLongMap$forEach$1$iv$iv = 0;
/* 1620 */               long l = v$iv$iv[index$iv$iv]; Object key$iv = k$iv$iv[index$iv$iv]; int $i$a$-forEach-ObjectLongMap$joinToString$2$1$iv = 0;
/* 1621 */               if (index$iv == limit$iv) {
/* 1622 */                 $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
/*      */                 // Byte code: goto -> 353
/*      */               } 
/* 1625 */               if (index$iv != 0) {
/* 1626 */                 $this$joinToString_u24lambda_u2410$iv.append(separator$iv);
/*      */               }
/* 1628 */               $this$joinToString_u24lambda_u2410$iv.append((CharSequence)transform.invoke(key$iv, Long.valueOf(l)));
/* 1629 */               index$iv++;
/*      */             } 
/*      */             
/* 1632 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1634 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 343
/*      */         }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*      */          // Byte code: goto -> 342
/*      */       }  }
/* 1639 */     else { $this$joinToString_u24lambda_u2410$iv.append(postfix$iv); }
/*      */     
/*      */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/*      */     return stringBuilder1.toString(); }
/*      */ 
/*      */   
/*      */   private ObjectLongMap() {}
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\ObjectLongMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */