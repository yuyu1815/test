/*      */ package androidx.collection;
/*      */ 
/*      */ import androidx.annotation.IntRange;
/*      */ import androidx.collection.internal.ContainerHelpersKt;
/*      */ import java.util.Collection;
/*      */ import java.util.Iterator;
/*      */ import java.util.NoSuchElementException;
/*      */ import java.util.Set;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.PublishedApi;
/*      */ import kotlin.Unit;
/*      */ import kotlin.coroutines.Continuation;
/*      */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*      */ import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
/*      */ import kotlin.jvm.JvmField;
/*      */ import kotlin.jvm.JvmOverloads;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.internal.CollectionToArray;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Lambda;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.jvm.internal.markers.KMappedMarker;
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
/*      */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\005\n\002\020\021\n\002\b\003\n\002\020\026\n\002\b\004\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\"\n\002\b\r\n\002\020\002\n\002\b\007\n\002\020\016\n\000\n\002\020\r\n\002\b\b\n\002\030\002\n\000\b6\030\000*\004\b\000\020\0012\0020\002:\001<B\007\b\004¢\006\002\020\003J:\020\023\032\0020\0242!\020\025\032\035\022\023\022\0218\000¢\006\f\b\027\022\b\b\030\022\004\b\b(\031\022\004\022\0020\0240\026H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\006\020\032\032\0020\024J:\020\032\032\0020\0242!\020\025\032\035\022\023\022\0218\000¢\006\f\b\027\022\b\b\030\022\004\b\b(\031\022\004\022\0020\0240\026H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\f\020\033\032\b\022\004\022\0028\0000\034J\026\020\035\032\0020\0242\006\020\031\032\0028\000H\002¢\006\002\020\036J\b\020\037\032\0020\005H\007J:\020\037\032\0020\0052!\020\025\032\035\022\023\022\0218\000¢\006\f\b\027\022\b\b\030\022\004\b\b(\031\022\004\022\0020\0240\026H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\023\020 \032\0020\0242\b\020!\032\004\030\0010\002H\002J\030\020\"\032\0020\0052\006\020\031\032\0028\000H\b¢\006\004\b#\020$J\016\020%\032\0028\000H\b¢\006\002\020&J?\020%\032\0028\0002!\020\025\032\035\022\023\022\0218\000¢\006\f\b\027\022\b\b\030\022\004\b\b(\031\022\004\022\0020\0240\026H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\020'JA\020(\032\004\030\0018\0002!\020\025\032\035\022\023\022\0218\000¢\006\f\b\027\022\b\b\030\022\004\b\b(\031\022\004\022\0020\0240\026H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\020'J:\020)\032\0020*2!\020+\032\035\022\023\022\0218\000¢\006\f\b\027\022\b\b\030\022\004\b\b(\031\022\004\022\0020*0\026H\bø\001\000\002\b\n\006\b\001\022\002\020\001J:\020,\032\0020*2!\020+\032\035\022\023\022\0210\005¢\006\f\b\027\022\b\b\030\022\004\b\b(-\022\004\022\0020*0\026H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\b\020.\032\0020\005H\026J\006\020/\032\0020\024J\006\0200\032\0020\024JR\0201\032\002022\b\b\002\0203\032\002042\b\b\002\0205\032\002042\b\b\002\0206\032\002042\b\b\002\0207\032\0020\0052\b\b\002\0208\032\002042\026\b\002\0209\032\020\022\004\022\0028\000\022\004\022\00204\030\0010\026H\007J\006\020:\032\0020\024J\b\020;\032\00202H\026R\022\020\004\032\0020\0058\000@\000X\016¢\006\002\n\000R\022\020\006\032\0020\0058\000@\000X\016¢\006\002\n\000R\021\020\007\032\0020\0058G¢\006\006\032\004\b\b\020\tR\"\020\n\032\n\022\006\022\004\030\0010\0020\0138\000@\000X\016¢\006\n\n\002\020\r\022\004\b\f\020\003R\030\020\016\032\0020\0178\000@\000X\016¢\006\b\n\000\022\004\b\020\020\003R\021\020\021\032\0020\0058G¢\006\006\032\004\b\022\020\t\001\001=\002\007\n\005\b20\001¨\006>"}, d2 = {"Landroidx/collection/ScatterSet;", "E", "", "()V", "_capacity", "", "_size", "capacity", "getCapacity", "()I", "elements", "", "getElements$annotations", "[Ljava/lang/Object;", "metadata", "", "getMetadata$annotations", "size", "getSize", "all", "", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "any", "asSet", "", "contains", "(Ljava/lang/Object;)Z", "count", "equals", "other", "findElementIndex", "findElementIndex$collection", "(Ljava/lang/Object;)I", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "forEach", "", "block", "forEachIndex", "index", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "SetWrapper", "Landroidx/collection/MutableScatterSet;", "collection"})
/*      */ @SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1084:1\n267#1,4:1085\n237#1,7:1089\n248#1,3:1097\n251#1,2:1101\n272#1,2:1103\n254#1,6:1105\n274#1:1111\n267#1,4:1112\n237#1,7:1116\n248#1,3:1124\n251#1,2:1128\n272#1,2:1130\n254#1,6:1132\n274#1:1138\n267#1,4:1139\n237#1,7:1143\n248#1,3:1151\n251#1,2:1155\n272#1,2:1157\n254#1,6:1159\n274#1:1165\n237#1,7:1168\n248#1,3:1176\n251#1,9:1180\n267#1,4:1189\n237#1,7:1193\n248#1,3:1201\n251#1,2:1205\n272#1,2:1207\n254#1,6:1209\n274#1:1215\n267#1,4:1216\n237#1,7:1220\n248#1,3:1228\n251#1,2:1232\n272#1,2:1234\n254#1,6:1236\n274#1:1242\n267#1,4:1243\n237#1,7:1247\n248#1,3:1255\n251#1,2:1259\n272#1,2:1261\n254#1,6:1263\n274#1:1269\n433#1:1270\n434#1:1274\n436#1,2:1276\n438#1,3:1279\n441#1:1285\n442#1:1289\n443#1:1291\n444#1,4:1294\n450#1:1299\n451#1,8:1301\n267#1,4:1309\n237#1,7:1313\n248#1,3:1321\n251#1,2:1325\n272#1,2:1327\n254#1,6:1329\n274#1:1335\n267#1,4:1336\n237#1,7:1340\n248#1,3:1348\n251#1,2:1352\n272#1,2:1354\n254#1,6:1356\n274#1:1362\n267#1,4:1363\n237#1,7:1367\n248#1,3:1375\n251#1,2:1379\n272#1,2:1381\n254#1,6:1383\n274#1:1389\n1810#2:1096\n1672#2:1100\n1810#2:1123\n1672#2:1127\n1810#2:1150\n1672#2:1154\n1810#2:1166\n1672#2:1167\n1810#2:1175\n1672#2:1179\n1810#2:1200\n1672#2:1204\n1810#2:1227\n1672#2:1231\n1810#2:1254\n1672#2:1258\n1589#2,3:1271\n1603#2:1275\n1599#2:1278\n1779#2,3:1282\n1793#2,3:1286\n1717#2:1290\n1705#2:1292\n1699#2:1293\n1712#2:1298\n1802#2:1300\n1810#2:1320\n1672#2:1324\n1810#2:1347\n1672#2:1351\n1810#2:1374\n1672#2:1378\n1589#2,3:1390\n1603#2:1393\n1599#2:1394\n1779#2,3:1395\n1793#2,3:1398\n1717#2:1401\n1705#2:1402\n1699#2:1403\n1712#2:1404\n1802#2:1405\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n201#1:1085,4\n201#1:1089,7\n201#1:1097,3\n201#1:1101,2\n201#1:1103,2\n201#1:1105,6\n201#1:1111\n214#1:1112,4\n214#1:1116,7\n214#1:1124,3\n214#1:1128,2\n214#1:1130,2\n214#1:1132,6\n214#1:1138\n227#1:1139,4\n227#1:1143,7\n227#1:1151,3\n227#1:1155,2\n227#1:1157,2\n227#1:1159,6\n227#1:1165\n270#1:1168,7\n270#1:1176,3\n270#1:1180,9\n284#1:1189,4\n284#1:1193,7\n284#1:1201,3\n284#1:1205,2\n284#1:1207,2\n284#1:1209,6\n284#1:1215\n297#1:1216,4\n297#1:1220,7\n297#1:1228,3\n297#1:1232,2\n297#1:1234,2\n297#1:1236,6\n297#1:1242\n318#1:1243,4\n318#1:1247,7\n318#1:1255,3\n318#1:1259,2\n318#1:1261,2\n318#1:1263,6\n318#1:1269\n329#1:1270\n329#1:1274\n329#1:1276,2\n329#1:1279,3\n329#1:1285\n329#1:1289\n329#1:1291\n329#1:1294,4\n329#1:1299\n329#1:1301,8\n352#1:1309,4\n352#1:1313,7\n352#1:1321,3\n352#1:1325,2\n352#1:1327,2\n352#1:1329,6\n352#1:1335\n378#1:1336,4\n378#1:1340,7\n378#1:1348,3\n378#1:1352,2\n378#1:1354,2\n378#1:1356,6\n378#1:1362\n407#1:1363,4\n407#1:1367,7\n407#1:1375,3\n407#1:1379,2\n407#1:1381,2\n407#1:1383,6\n407#1:1389\n201#1:1096\n201#1:1100\n214#1:1123\n214#1:1127\n227#1:1150\n227#1:1154\n243#1:1166\n250#1:1167\n270#1:1175\n270#1:1179\n284#1:1200\n284#1:1204\n297#1:1227\n297#1:1231\n318#1:1254\n318#1:1258\n329#1:1271,3\n329#1:1275\n329#1:1278\n329#1:1282,3\n329#1:1286,3\n329#1:1290\n329#1:1292\n329#1:1293\n329#1:1298\n329#1:1300\n352#1:1320\n352#1:1324\n378#1:1347\n378#1:1351\n407#1:1374\n407#1:1378\n433#1:1390,3\n434#1:1393\n437#1:1394\n440#1:1395,3\n441#1:1398,3\n442#1:1401\n443#1:1402\n443#1:1403\n447#1:1404\n450#1:1405\n*E\n"})
/*      */ public abstract class ScatterSet<E>
/*      */ {
/*      */   @JvmField
/*      */   @NotNull
/*  145 */   public long[] metadata = ScatterMapKt.EmptyGroup;
/*      */   
/*      */   @JvmField
/*      */   @NotNull
/*  149 */   public Object[] elements = ContainerHelpersKt.EMPTY_OBJECTS;
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
/*      */   @IntRange(from = 0L)
/*      */   public final int getCapacity() {
/*  162 */     return this._capacity;
/*      */   }
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
/*  174 */     return this._size;
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean any() {
/*  179 */     return (this._size != 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean none() {
/*  184 */     return (this._size == 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean isEmpty() {
/*  189 */     return (this._size == 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean isNotEmpty() {
/*  194 */     return (this._size != 0);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final E first()
/*      */   {
/*  201 */     int $i$f$first = 0; ScatterSet this_$iv = this; int $i$f$forEach = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1086 */     Object[] k$iv = this_$iv.elements;
/*      */     
/* 1088 */     ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1090 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1091 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1093 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1094 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1095 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1096 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1097 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1098 */           for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
/* 1099 */             long value$iv$iv$iv = slot$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1100 */             if ((value$iv$iv$iv < 128L)) {
/* 1101 */               int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
/* 1102 */               int index$iv = index$iv$iv, $i$a$-forEachIndex-ScatterSet$forEach$2$iv = 0;
/* 1103 */               Object it = k$iv[index$iv]; int $i$a$-forEach-ScatterSet$first$1 = 0; return (E)it;
/*      */             } 
/* 1105 */             slot$iv$iv >>= 8L;
/*      */           } 
/* 1107 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break;
/*      */         }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 196
/*      */       }  }
/*      */     else {  }
/* 1113 */      throw new NoSuchElementException("The ScatterSet is empty"); } public final E first(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$first = 0; ScatterSet this_$iv = this; int $i$f$forEach = 0; Object[] k$iv = this_$iv.elements;
/*      */     
/* 1115 */     ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1117 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1118 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1120 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1121 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1122 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1123 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1124 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
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
/*      */             continue;  break;
/*      */         }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 224
/*      */       }  }
/*      */     else {  }
/* 1140 */      throw new NoSuchElementException("Could not find a match"); } @Nullable public final E firstOrNull(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$firstOrNull = 0; ScatterSet this_$iv = this; int $i$f$forEach = 0; Object[] k$iv = this_$iv.elements;
/*      */     
/* 1142 */     ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1144 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1145 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1147 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1148 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1149 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1150 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1151 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1152 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1161 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 224
/*      */       }  }
/*      */     else {  }
/*      */      return null; } @PublishedApi public final void forEachIndex(@NotNull Function1 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachIndex = 0; long[] m = this.metadata; int lastIndex = m.length - 2; int i = 0; if (i <= lastIndex)
/* 1166 */       while (true) { long slot = m[i]; long $this$maskEmptyOrDeleted$iv = slot; int $i$f$maskEmptyOrDeleted = 0; if (($this$maskEmptyOrDeleted$iv & ($this$maskEmptyOrDeleted$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) { int bitCount = 8 - ((i - lastIndex ^ 0xFFFFFFFF) >>> 31); for (int j = 0; j < bitCount; j++)
/* 1167 */           { long value$iv = slot & 0xFFL; int $i$f$isFull = 0; if ((value$iv < 128L)) { int index = (i << 3) + j; block.invoke(Integer.valueOf(index)); }  slot >>= 8L; }  }  continue; if (i != lastIndex) { i++; continue; }
/*      */          break; }
/* 1169 */         } public final void forEach(@NotNull Function1 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEach = 0; Object[] k = this.elements; ScatterSet this_$iv = this; int $i$f$forEachIndex = 0; long[] m$iv = this_$iv.metadata;
/* 1170 */     int lastIndex$iv = m$iv.length - 2;
/*      */     
/* 1172 */     int i$iv = 0; if (i$iv <= lastIndex$iv) { while (true) {
/* 1173 */         long slot$iv = m$iv[i$iv];
/* 1174 */         long $this$maskEmptyOrDeleted$iv$iv = slot$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1175 */         if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1176 */         { int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/* 1177 */           for (int j$iv = 0;; j$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1185 */           if (bitCount$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv != lastIndex$iv) { i$iv++; continue; }
/*      */          // Byte code: goto -> 197
/*      */       }  }
/*      */     else {  }
/* 1190 */      } public final boolean all(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$all = 0; ScatterSet this_$iv = this; int $i$f$forEach = 0; Object[] k$iv = this_$iv.elements;
/*      */     
/* 1192 */     ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1194 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1195 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1197 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1198 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1199 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1200 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1201 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1202 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1211 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break;
/*      */         }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 224
/*      */       }  }
/*      */     else {  }
/* 1217 */      return true; } public final boolean any(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$any = 0; ScatterSet this_$iv = this; int $i$f$forEach = 0; Object[] k$iv = this_$iv.elements;
/*      */     
/* 1219 */     ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1221 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1222 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1224 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1225 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1226 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1227 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1228 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1229 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1238 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 224
/*      */       }  }
/*      */     else {  }
/*      */      return false; } @IntRange(from = 0L) public final int count() { return getSize(); }
/* 1244 */   @IntRange(from = 0L) public final int count(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$count = 0; int count = 0; ScatterSet this_$iv = this; int $i$f$forEach = 0; Object[] k$iv = this_$iv.elements;
/*      */     
/* 1246 */     ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1248 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1249 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1251 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1252 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1253 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1254 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1255 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1256 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1265 */           if (bitCount$iv$iv == 8) {
/*      */             continue;
/*      */           }
/*      */           break;
/*      */         } 
/*      */         continue;
/*      */         if (i$iv$iv != lastIndex$iv$iv) {
/*      */           i$iv$iv++;
/*      */           continue;
/*      */         } 
/*      */         // Byte code: goto -> 231
/*      */       }  }
/*      */     else
/*      */     {  }
/*      */     
/*      */     return count; }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean contains(Object element) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: astore_2
/*      */     //   2: iconst_0
/*      */     //   3: istore_3
/*      */     //   4: iconst_0
/*      */     //   5: istore #4
/*      */     //   7: aload_1
/*      */     //   8: dup
/*      */     //   9: ifnull -> 18
/*      */     //   12: invokevirtual hashCode : ()I
/*      */     //   15: goto -> 20
/*      */     //   18: pop
/*      */     //   19: iconst_0
/*      */     //   20: ldc -862048943
/*      */     //   22: imul
/*      */     //   23: istore #5
/*      */     //   25: iload #5
/*      */     //   27: iload #5
/*      */     //   29: bipush #16
/*      */     //   31: ishl
/*      */     //   32: ixor
/*      */     //   33: istore #6
/*      */     //   35: iconst_0
/*      */     //   36: istore #5
/*      */     //   38: iload #6
/*      */     //   40: bipush #127
/*      */     //   42: iand
/*      */     //   43: istore #4
/*      */     //   45: aload_2
/*      */     //   46: getfield _capacity : I
/*      */     //   49: istore #5
/*      */     //   51: iconst_0
/*      */     //   52: istore #7
/*      */     //   54: iload #6
/*      */     //   56: bipush #7
/*      */     //   58: iushr
/*      */     //   59: iload #5
/*      */     //   61: iand
/*      */     //   62: istore #8
/*      */     //   64: iconst_0
/*      */     //   65: istore #7
/*      */     //   67: nop
/*      */     //   68: aload_2
/*      */     //   69: getfield metadata : [J
/*      */     //   72: astore #9
/*      */     //   74: iconst_0
/*      */     //   75: istore #10
/*      */     //   77: iload #8
/*      */     //   79: iconst_3
/*      */     //   80: ishr
/*      */     //   81: istore #11
/*      */     //   83: iload #8
/*      */     //   85: bipush #7
/*      */     //   87: iand
/*      */     //   88: iconst_3
/*      */     //   89: ishl
/*      */     //   90: istore #12
/*      */     //   92: aload #9
/*      */     //   94: iload #11
/*      */     //   96: laload
/*      */     //   97: iload #12
/*      */     //   99: lushr
/*      */     //   100: aload #9
/*      */     //   102: iload #11
/*      */     //   104: iconst_1
/*      */     //   105: iadd
/*      */     //   106: laload
/*      */     //   107: bipush #64
/*      */     //   109: iload #12
/*      */     //   111: isub
/*      */     //   112: lshl
/*      */     //   113: iload #12
/*      */     //   115: i2l
/*      */     //   116: lneg
/*      */     //   117: bipush #63
/*      */     //   119: lshr
/*      */     //   120: land
/*      */     //   121: lor
/*      */     //   122: lstore #13
/*      */     //   124: lload #13
/*      */     //   126: lstore #15
/*      */     //   128: iconst_0
/*      */     //   129: istore #17
/*      */     //   131: lload #15
/*      */     //   133: ldc2_w 72340172838076673
/*      */     //   136: iload #4
/*      */     //   138: i2l
/*      */     //   139: lmul
/*      */     //   140: lxor
/*      */     //   141: lstore #18
/*      */     //   143: lload #18
/*      */     //   145: ldc2_w 72340172838076673
/*      */     //   148: lsub
/*      */     //   149: lload #18
/*      */     //   151: ldc2_w -1
/*      */     //   154: lxor
/*      */     //   155: land
/*      */     //   156: ldc2_w -9187201950435737472
/*      */     //   159: land
/*      */     //   160: lstore #20
/*      */     //   162: lload #20
/*      */     //   164: lstore #15
/*      */     //   166: iconst_0
/*      */     //   167: istore #17
/*      */     //   169: lload #15
/*      */     //   171: lconst_0
/*      */     //   172: lcmp
/*      */     //   173: ifeq -> 180
/*      */     //   176: iconst_1
/*      */     //   177: goto -> 181
/*      */     //   180: iconst_0
/*      */     //   181: ifeq -> 252
/*      */     //   184: iload #8
/*      */     //   186: lload #20
/*      */     //   188: lstore #22
/*      */     //   190: iconst_0
/*      */     //   191: istore #24
/*      */     //   193: lload #22
/*      */     //   195: lstore #25
/*      */     //   197: iconst_0
/*      */     //   198: istore #27
/*      */     //   200: lload #25
/*      */     //   202: invokestatic numberOfTrailingZeros : (J)I
/*      */     //   205: iconst_3
/*      */     //   206: ishr
/*      */     //   207: nop
/*      */     //   208: iadd
/*      */     //   209: iload #5
/*      */     //   211: iand
/*      */     //   212: istore #11
/*      */     //   214: aload_2
/*      */     //   215: getfield elements : [Ljava/lang/Object;
/*      */     //   218: iload #11
/*      */     //   220: aaload
/*      */     //   221: aload_1
/*      */     //   222: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   225: ifeq -> 233
/*      */     //   228: iload #11
/*      */     //   230: goto -> 301
/*      */     //   233: lload #20
/*      */     //   235: lstore #22
/*      */     //   237: iconst_0
/*      */     //   238: istore #24
/*      */     //   240: lload #22
/*      */     //   242: lload #22
/*      */     //   244: lconst_1
/*      */     //   245: lsub
/*      */     //   246: land
/*      */     //   247: lstore #20
/*      */     //   249: goto -> 162
/*      */     //   252: lload #13
/*      */     //   254: lstore #15
/*      */     //   256: iconst_0
/*      */     //   257: istore #17
/*      */     //   259: lload #15
/*      */     //   261: lload #15
/*      */     //   263: ldc2_w -1
/*      */     //   266: lxor
/*      */     //   267: bipush #6
/*      */     //   269: lshl
/*      */     //   270: land
/*      */     //   271: ldc2_w -9187201950435737472
/*      */     //   274: land
/*      */     //   275: lconst_0
/*      */     //   276: lcmp
/*      */     //   277: ifeq -> 283
/*      */     //   280: goto -> 300
/*      */     //   283: iinc #7, 8
/*      */     //   286: nop
/*      */     //   287: iload #8
/*      */     //   289: iload #7
/*      */     //   291: iadd
/*      */     //   292: iload #5
/*      */     //   294: iand
/*      */     //   295: istore #8
/*      */     //   297: goto -> 67
/*      */     //   300: iconst_m1
/*      */     //   301: iflt -> 308
/*      */     //   304: iconst_1
/*      */     //   305: goto -> 309
/*      */     //   308: iconst_0
/*      */     //   309: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #329	-> 0
/*      */     //   #1270	-> 4
/*      */     //   #1271	-> 7
/*      */     //   #1271	-> 20
/*      */     //   #1273	-> 25
/*      */     //   #1270	-> 33
/*      */     //   #1274	-> 35
/*      */     //   #1275	-> 38
/*      */     //   #1274	-> 43
/*      */     //   #1276	-> 45
/*      */     //   #1277	-> 51
/*      */     //   #1278	-> 54
/*      */     //   #1277	-> 59
/*      */     //   #1279	-> 64
/*      */     //   #1280	-> 67
/*      */     //   #1281	-> 68
/*      */     //   #1282	-> 77
/*      */     //   #1283	-> 83
/*      */     //   #1284	-> 92
/*      */     //   #1281	-> 122
/*      */     //   #1285	-> 124
/*      */     //   #1286	-> 131
/*      */     //   #1288	-> 143
/*      */     //   #1285	-> 160
/*      */     //   #1289	-> 162
/*      */     //   #1290	-> 169
/*      */     //   #1291	-> 184
/*      */     //   #1292	-> 193
/*      */     //   #1293	-> 200
/*      */     //   #1293	-> 205
/*      */     //   #1292	-> 207
/*      */     //   #1291	-> 208
/*      */     //   #1294	-> 214
/*      */     //   #1295	-> 228
/*      */     //   #1297	-> 233
/*      */     //   #1298	-> 240
/*      */     //   #1297	-> 247
/*      */     //   #1299	-> 252
/*      */     //   #1300	-> 259
/*      */     //   #1299	-> 275
/*      */     //   #1301	-> 280
/*      */     //   #1304	-> 286
/*      */     //   #1305	-> 287
/*      */     //   #1308	-> 300
/*      */     //   #329	-> 301
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   7	26	4	$i$f$hash	I
/*      */     //   25	8	5	hash$iv$iv	I
/*      */     //   38	5	5	$i$f$h2	I
/*      */     //   54	5	7	$i$f$h1	I
/*      */     //   77	45	10	$i$f$group	I
/*      */     //   83	39	11	i$iv$iv	I
/*      */     //   92	30	12	b$iv$iv	I
/*      */     //   74	48	9	metadata$iv$iv	[J
/*      */     //   131	29	17	$i$f$match	I
/*      */     //   143	17	18	x$iv$iv	J
/*      */     //   128	32	15	$this$match$iv$iv	J
/*      */     //   169	12	17	$i$f$hasNext	I
/*      */     //   166	15	15	$this$hasNext$iv$iv	J
/*      */     //   200	7	27	$i$f$lowestBitSet	I
/*      */     //   197	10	25	$this$lowestBitSet$iv$iv$iv	J
/*      */     //   193	15	24	$i$f$get	I
/*      */     //   190	18	22	$this$get$iv$iv	J
/*      */     //   240	7	24	$i$f$next	I
/*      */     //   237	10	22	$this$next$iv$iv	J
/*      */     //   214	35	11	index$iv	I
/*      */     //   259	16	17	$i$f$maskEmpty	I
/*      */     //   256	19	15	$this$maskEmpty$iv$iv	J
/*      */     //   124	173	13	g$iv	J
/*      */     //   162	135	20	m$iv	J
/*      */     //   4	297	3	$i$f$findElementIndex$collection	I
/*      */     //   35	266	6	hash$iv	I
/*      */     //   45	256	4	hash2$iv	I
/*      */     //   51	250	5	probeMask$iv	I
/*      */     //   64	237	8	probeOffset$iv	I
/*      */     //   67	234	7	probeIndex$iv	I
/*      */     //   2	299	2	this_$iv	Landroidx/collection/ScatterSet;
/*      */     //   0	310	0	this	Landroidx/collection/ScatterSet;
/*      */     //   0	310	1	element	Ljava/lang/Object;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @JvmOverloads
/*      */   @NotNull
/*      */   public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @Nullable Function1 transform)
/*      */   {
/*      */     Intrinsics.checkNotNullParameter(separator, "separator");
/*      */     Intrinsics.checkNotNullParameter(prefix, "prefix");
/*      */     Intrinsics.checkNotNullParameter(postfix, "postfix");
/*      */     Intrinsics.checkNotNullParameter(truncated, "truncated");
/*      */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2415 = stringBuilder1;
/*      */     int $i$a$-buildString-ScatterSet$joinToString$1 = 0;
/*      */     $this$joinToString_u24lambda_u2415.append(prefix);
/*      */     int index = 0;
/*      */     ScatterSet this_$iv = this;
/*      */     int $i$f$forEach = 0;
/* 1310 */     Object[] k$iv = this_$iv.elements;
/*      */     
/* 1312 */     ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1314 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1315 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1317 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1318 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1319 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1320 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1321 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1322 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1331 */           if (bitCount$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 321
/*      */         }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 320
/*      */       }  }
/*      */     else { $this$joinToString_u24lambda_u2415.append(postfix); }
/* 1337 */      Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()"); return stringBuilder1.toString(); } public int hashCode() { int hash = 0; ScatterSet this_$iv = this; int $i$f$forEach = 0; Object[] k$iv = this_$iv.elements;
/*      */     
/* 1339 */     ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1341 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1342 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1344 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true)
/* 1345 */       { long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1346 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1347 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1348 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1349 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1358 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 214 }  }
/*      */     else {  }
/*      */      return hash; } public boolean equals(@Nullable Object other) { if (other == this)
/*      */       return true;  if (!(other instanceof ScatterSet))
/*      */       return false;  if (((ScatterSet)other).getSize() != getSize())
/* 1364 */       return false;  ScatterSet o = (ScatterSet)other; ScatterSet this_$iv = this; int $i$f$forEach = 0; Object[] k$iv = this_$iv.elements;
/*      */     
/* 1366 */     ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1368 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1369 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1371 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1372 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1373 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1374 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1375 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1376 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1385 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 244
/*      */       }  }
/*      */     else {  }
/*      */      return true; }
/* 1390 */   @NotNull public String toString() { return joinToString$default(this, null, "[", "]", 0, null, new ScatterSet$toString$1(), 25, null); } public final int findElementIndex$collection(Object element) { int $i$f$findElementIndex$collection = 0, $i$f$hash = 0; int hash$iv = ((element != null) ? element.hashCode() : 0) * -862048943;
/*      */     
/* 1392 */     int hash = hash$iv ^ hash$iv << 16;
/* 1393 */     int $i$f$h2 = 0, hash2 = hash & 0x7F; int probeMask = this._capacity;
/* 1394 */     int $i$f$h1 = 0, probeOffset = hash >>> 7 & probeMask; int probeIndex = 0; while (true) {
/* 1395 */       long[] metadata$iv = this.metadata; int $i$f$group = 0; int i$iv = probeOffset >> 3;
/* 1396 */       int b$iv = (probeOffset & 0x7) << 3;
/* 1397 */       long g = metadata$iv[i$iv] >>> b$iv | metadata$iv[i$iv + 1] << 64 - b$iv & -(b$iv) >> 63L; long $this$match$iv = g; int $i$f$match = 0;
/* 1398 */       long x$iv = $this$match$iv ^ 72340172838076673L * hash2;
/*      */       
/* 1400 */       long m = x$iv - 72340172838076673L & (x$iv ^ 0xFFFFFFFFFFFFFFFFL) & 0x8080808080808080L; while (true) {
/* 1401 */         long $this$hasNext$iv = m; int $i$f$hasNext = 0; if (($this$hasNext$iv != 0L)) {
/* 1402 */           long $this$get$iv = m; int $i$f$get = 0; long $this$lowestBitSet$iv$iv = $this$get$iv; int $i$f$lowestBitSet = 0;
/* 1403 */           int index = probeOffset + (Long.numberOfTrailingZeros($this$lowestBitSet$iv$iv) >> 3) & probeMask;
/*      */         }  long $this$maskEmpty$iv = g; int $i$f$maskEmpty = 0;
/* 1405 */         if (($this$maskEmpty$iv & ($this$maskEmpty$iv ^ 0xFFFFFFFFFFFFFFFFL) << 6L & 0x8080808080808080L) != 0L)
/*      */           return -1; 
/*      */         break;
/*      */       } 
/*      */       probeIndex += 8;
/*      */       probeOffset = probeOffset + probeIndex & probeMask;
/*      */     } 
/*      */     return -1; }
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\r\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\002H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "E", "element", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"})
/*      */   static final class ScatterSet$toString$1 extends Lambda implements Function1<E, CharSequence> {
/*      */     @NotNull
/*      */     public final CharSequence invoke(Object element) {
/*      */       return (element == ScatterSet.this) ? "(this)" : String.valueOf(element);
/*      */     }
/*      */     
/*      */     ScatterSet$toString$1() {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final Set<E> asSet() {
/*      */     return new SetWrapper();
/*      */   }
/*      */   
/*      */   private ScatterSet() {}
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
/*      */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\"\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\004\n\002\020\036\n\002\b\002\n\002\020(\n\000\b\004\030\0002\b\022\004\022\0028\0000\001B\005¢\006\002\020\002J\026\020\007\032\0020\b2\006\020\t\032\0028\000H\002¢\006\002\020\nJ\026\020\013\032\0020\b2\f\020\f\032\b\022\004\022\0028\0000\rH\026J\b\020\016\032\0020\bH\026J\017\020\017\032\b\022\004\022\0028\0000\020H\002R\024\020\003\032\0020\0048VX\004¢\006\006\032\004\b\005\020\006¨\006\021"}, d2 = {"Landroidx/collection/ScatterSet$SetWrapper;", "", "(Landroidx/collection/ScatterSet;)V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "isEmpty", "iterator", "", "collection"})
/*      */   @SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1084:1\n1855#2,2:1085\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper\n*L\n478#1:1085,2\n*E\n"})
/*      */   public class SetWrapper implements Set<E>, KMappedMarker {
/*      */     public int getSize() {
/*      */       return ScatterSet.this._size;
/*      */     }
/*      */     
/*      */     public boolean containsAll(@NotNull Collection elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       Collection collection = elements;
/*      */       ScatterSet<E> scatterSet = ScatterSet.this;
/*      */       int $i$f$forEach = 0;
/*      */       Iterator iterator = collection.iterator();
/*      */       if (iterator.hasNext()) {
/*      */         Object element$iv = iterator.next(), element = element$iv;
/*      */         int $i$a$-forEach-ScatterSet$SetWrapper$containsAll$1 = 0;
/*      */         if (!scatterSet.contains((E)element))
/*      */           return false; 
/*      */       } 
/*      */       return true;
/*      */     }
/*      */     
/*      */     public boolean contains(Object element) {
/*      */       return ScatterSet.this.contains((E)element);
/*      */     }
/*      */     
/*      */     public boolean isEmpty() {
/*      */       return ScatterSet.this.isEmpty();
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public Iterator<E> iterator() {
/*      */       return SequencesKt.iterator(new ScatterSet$SetWrapper$iterator$1(null));
/*      */     }
/*      */     
/*      */     public boolean add(Object element) {
/*      */       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*      */     }
/*      */     
/*      */     public boolean addAll(Collection elements) {
/*      */       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*      */     }
/*      */     
/*      */     public void clear() {
/*      */       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*      */     }
/*      */     
/*      */     public boolean remove(Object element) {
/*      */       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*      */     }
/*      */     
/*      */     public boolean removeAll(Collection elements) {
/*      */       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*      */     }
/*      */     
/*      */     public boolean retainAll(Collection elements) {
/*      */       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*      */     }
/*      */     
/*      */     public <T> T[] toArray(Object[] array) {
/*      */       Intrinsics.checkNotNullParameter(array, "array");
/*      */       return (T[])CollectionToArray.toArray(this, array);
/*      */     }
/*      */     
/*      */     public Object[] toArray() {
/*      */       return CollectionToArray.toArray(this);
/*      */     }
/*      */     
/*      */     @DebugMetadata(f = "ScatterSet.kt", l = {495}, i = {0, 0, 0, 0, 0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"}, n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, m = "invokeSuspend", c = "androidx.collection.ScatterSet$SetWrapper$iterator$1")
/*      */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"})
/*      */     @SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1084:1\n267#2,4:1085\n237#2,7:1089\n248#2,3:1097\n251#2,2:1101\n272#2,2:1103\n254#2,6:1105\n274#2:1111\n1810#3:1096\n1672#3:1100\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper$iterator$1\n*L\n494#1:1085,4\n494#1:1089,7\n494#1:1097,3\n494#1:1101,2\n494#1:1103,2\n494#1:1105,6\n494#1:1111\n494#1:1096\n494#1:1100\n*E\n"})
/*      */     static final class ScatterSet$SetWrapper$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super E>, Continuation<? super Unit>, Object> {
/*      */       Object L$1;
/*      */       Object L$2;
/*      */       int I$0;
/*      */       int I$1;
/*      */       int I$2;
/*      */       int I$3;
/*      */       long J$0;
/*      */       int label;
/*      */       
/*      */       ScatterSet$SetWrapper$iterator$1(Continuation $completion) {
/*      */         super(2, $completion);
/*      */       }
/*      */       
/*      */       @Nullable
/*      */       public final Object invokeSuspend(@NotNull Object $result) {
/*      */         // Byte code:
/*      */         //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */         //   3: astore #25
/*      */         //   5: aload_0
/*      */         //   6: getfield label : I
/*      */         //   9: tableswitch default -> 388, 0 -> 32, 1 -> 274
/*      */         //   32: aload_1
/*      */         //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */         //   36: aload_0
/*      */         //   37: getfield L$0 : Ljava/lang/Object;
/*      */         //   40: checkcast kotlin/sequences/SequenceScope
/*      */         //   43: astore_2
/*      */         //   44: aload_0
/*      */         //   45: getfield this$0 : Landroidx/collection/ScatterSet;
/*      */         //   48: astore_3
/*      */         //   49: iconst_0
/*      */         //   50: istore #4
/*      */         //   52: nop
/*      */         //   53: aload_3
/*      */         //   54: getfield elements : [Ljava/lang/Object;
/*      */         //   57: astore #5
/*      */         //   59: aload_3
/*      */         //   60: astore #6
/*      */         //   62: iconst_0
/*      */         //   63: istore #7
/*      */         //   65: nop
/*      */         //   66: aload #6
/*      */         //   68: getfield metadata : [J
/*      */         //   71: astore #8
/*      */         //   73: aload #8
/*      */         //   75: arraylength
/*      */         //   76: iconst_2
/*      */         //   77: isub
/*      */         //   78: istore #9
/*      */         //   80: iconst_0
/*      */         //   81: istore #10
/*      */         //   83: iload #10
/*      */         //   85: iload #9
/*      */         //   87: if_icmpgt -> 382
/*      */         //   90: aload #8
/*      */         //   92: iload #10
/*      */         //   94: laload
/*      */         //   95: lstore #11
/*      */         //   97: lload #11
/*      */         //   99: lstore #13
/*      */         //   101: iconst_0
/*      */         //   102: istore #15
/*      */         //   104: lload #13
/*      */         //   106: lload #13
/*      */         //   108: ldc2_w -1
/*      */         //   111: lxor
/*      */         //   112: bipush #7
/*      */         //   114: lshl
/*      */         //   115: land
/*      */         //   116: ldc2_w -9187201950435737472
/*      */         //   119: land
/*      */         //   120: ldc2_w -9187201950435737472
/*      */         //   123: lcmp
/*      */         //   124: ifeq -> 369
/*      */         //   127: bipush #8
/*      */         //   129: iload #10
/*      */         //   131: iload #9
/*      */         //   133: isub
/*      */         //   134: iconst_m1
/*      */         //   135: ixor
/*      */         //   136: bipush #31
/*      */         //   138: iushr
/*      */         //   139: isub
/*      */         //   140: istore #16
/*      */         //   142: iconst_0
/*      */         //   143: istore #17
/*      */         //   145: iload #17
/*      */         //   147: iload #16
/*      */         //   149: if_icmpge -> 362
/*      */         //   152: lload #11
/*      */         //   154: ldc2_w 255
/*      */         //   157: land
/*      */         //   158: lstore #18
/*      */         //   160: iconst_0
/*      */         //   161: istore #20
/*      */         //   163: lload #18
/*      */         //   165: ldc2_w 128
/*      */         //   168: lcmp
/*      */         //   169: ifge -> 176
/*      */         //   172: iconst_1
/*      */         //   173: goto -> 177
/*      */         //   176: iconst_0
/*      */         //   177: ifeq -> 349
/*      */         //   180: iload #10
/*      */         //   182: iconst_3
/*      */         //   183: ishl
/*      */         //   184: iload #17
/*      */         //   186: iadd
/*      */         //   187: istore #15
/*      */         //   189: iload #15
/*      */         //   191: istore #21
/*      */         //   193: iconst_0
/*      */         //   194: istore #22
/*      */         //   196: aload #5
/*      */         //   198: iload #21
/*      */         //   200: aaload
/*      */         //   201: astore #23
/*      */         //   203: iconst_0
/*      */         //   204: istore #24
/*      */         //   206: aload_2
/*      */         //   207: aload #23
/*      */         //   209: aload_0
/*      */         //   210: aload_0
/*      */         //   211: aload_2
/*      */         //   212: putfield L$0 : Ljava/lang/Object;
/*      */         //   215: aload_0
/*      */         //   216: aload #5
/*      */         //   218: putfield L$1 : Ljava/lang/Object;
/*      */         //   221: aload_0
/*      */         //   222: aload #8
/*      */         //   224: putfield L$2 : Ljava/lang/Object;
/*      */         //   227: aload_0
/*      */         //   228: iload #9
/*      */         //   230: putfield I$0 : I
/*      */         //   233: aload_0
/*      */         //   234: iload #10
/*      */         //   236: putfield I$1 : I
/*      */         //   239: aload_0
/*      */         //   240: lload #11
/*      */         //   242: putfield J$0 : J
/*      */         //   245: aload_0
/*      */         //   246: iload #16
/*      */         //   248: putfield I$2 : I
/*      */         //   251: aload_0
/*      */         //   252: iload #17
/*      */         //   254: putfield I$3 : I
/*      */         //   257: aload_0
/*      */         //   258: iconst_1
/*      */         //   259: putfield label : I
/*      */         //   262: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */         //   265: dup
/*      */         //   266: aload #25
/*      */         //   268: if_acmpne -> 347
/*      */         //   271: aload #25
/*      */         //   273: areturn
/*      */         //   274: iconst_0
/*      */         //   275: istore #4
/*      */         //   277: iconst_0
/*      */         //   278: istore #7
/*      */         //   280: iconst_0
/*      */         //   281: istore #22
/*      */         //   283: iconst_0
/*      */         //   284: istore #24
/*      */         //   286: aload_0
/*      */         //   287: getfield I$3 : I
/*      */         //   290: istore #17
/*      */         //   292: aload_0
/*      */         //   293: getfield I$2 : I
/*      */         //   296: istore #16
/*      */         //   298: aload_0
/*      */         //   299: getfield J$0 : J
/*      */         //   302: lstore #11
/*      */         //   304: aload_0
/*      */         //   305: getfield I$1 : I
/*      */         //   308: istore #10
/*      */         //   310: aload_0
/*      */         //   311: getfield I$0 : I
/*      */         //   314: istore #9
/*      */         //   316: aload_0
/*      */         //   317: getfield L$2 : Ljava/lang/Object;
/*      */         //   320: checkcast [J
/*      */         //   323: astore #8
/*      */         //   325: aload_0
/*      */         //   326: getfield L$1 : Ljava/lang/Object;
/*      */         //   329: checkcast [Ljava/lang/Object;
/*      */         //   332: astore #5
/*      */         //   334: aload_0
/*      */         //   335: getfield L$0 : Ljava/lang/Object;
/*      */         //   338: checkcast kotlin/sequences/SequenceScope
/*      */         //   341: astore_2
/*      */         //   342: aload_1
/*      */         //   343: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */         //   346: aload_1
/*      */         //   347: pop
/*      */         //   348: nop
/*      */         //   349: lload #11
/*      */         //   351: bipush #8
/*      */         //   353: lshr
/*      */         //   354: lstore #11
/*      */         //   356: iinc #17, 1
/*      */         //   359: goto -> 145
/*      */         //   362: iload #16
/*      */         //   364: bipush #8
/*      */         //   366: if_icmpne -> 383
/*      */         //   369: iload #10
/*      */         //   371: iload #9
/*      */         //   373: if_icmpeq -> 382
/*      */         //   376: iinc #10, 1
/*      */         //   379: goto -> 90
/*      */         //   382: nop
/*      */         //   383: nop
/*      */         //   384: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */         //   387: areturn
/*      */         //   388: new java/lang/IllegalStateException
/*      */         //   391: dup
/*      */         //   392: ldc 'call to 'resume' before 'invoke' with coroutine'
/*      */         //   394: invokespecial <init> : (Ljava/lang/String;)V
/*      */         //   397: athrow
/*      */         // Line number table:
/*      */         //   Java source line number -> byte code offset
/*      */         //   #493	-> 3
/*      */         //   #494	-> 44
/*      */         //   #1085	-> 52
/*      */         //   #1086	-> 53
/*      */         //   #1088	-> 59
/*      */         //   #1089	-> 65
/*      */         //   #1090	-> 66
/*      */         //   #1091	-> 73
/*      */         //   #1093	-> 80
/*      */         //   #1094	-> 90
/*      */         //   #1095	-> 97
/*      */         //   #1096	-> 104
/*      */         //   #1095	-> 120
/*      */         //   #1097	-> 127
/*      */         //   #1098	-> 142
/*      */         //   #1099	-> 152
/*      */         //   #1100	-> 163
/*      */         //   #1099	-> 177
/*      */         //   #1101	-> 180
/*      */         //   #1102	-> 189
/*      */         //   #1103	-> 196
/*      */         //   #495	-> 206
/*      */         //   #493	-> 271
/*      */         //   #496	-> 347
/*      */         //   #1103	-> 348
/*      */         //   #1104	-> 348
/*      */         //   #1102	-> 349
/*      */         //   #1105	-> 349
/*      */         //   #1098	-> 356
/*      */         //   #1107	-> 362
/*      */         //   #1093	-> 369
/*      */         //   #1110	-> 382
/*      */         //   #1111	-> 383
/*      */         //   #497	-> 384
/*      */         //   #493	-> 388
/*      */         // Local variable table:
/*      */         //   start	length	slot	name	descriptor
/*      */         //   44	230	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */         //   342	6	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */         //   348	21	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */         //   369	7	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */         //   376	6	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*      */         //   49	13	3	this_$iv	Landroidx/collection/ScatterSet;
/*      */         //   59	215	5	k$iv	[Ljava/lang/Object;
/*      */         //   334	14	5	k$iv	[Ljava/lang/Object;
/*      */         //   348	21	5	k$iv	[Ljava/lang/Object;
/*      */         //   369	7	5	k$iv	[Ljava/lang/Object;
/*      */         //   376	6	5	k$iv	[Ljava/lang/Object;
/*      */         //   62	11	6	this_$iv$iv	Landroidx/collection/ScatterSet;
/*      */         //   73	201	8	m$iv$iv	[J
/*      */         //   325	23	8	m$iv$iv	[J
/*      */         //   348	21	8	m$iv$iv	[J
/*      */         //   369	7	8	m$iv$iv	[J
/*      */         //   376	6	8	m$iv$iv	[J
/*      */         //   80	194	9	lastIndex$iv$iv	I
/*      */         //   316	32	9	lastIndex$iv$iv	I
/*      */         //   348	21	9	lastIndex$iv$iv	I
/*      */         //   369	7	9	lastIndex$iv$iv	I
/*      */         //   376	6	9	lastIndex$iv$iv	I
/*      */         //   83	191	10	i$iv$iv	I
/*      */         //   310	38	10	i$iv$iv	I
/*      */         //   348	21	10	i$iv$iv	I
/*      */         //   369	13	10	i$iv$iv	I
/*      */         //   97	55	11	slot$iv$iv	J
/*      */         //   152	122	11	slot$iv$iv	J
/*      */         //   304	44	11	slot$iv$iv	J
/*      */         //   348	21	11	slot$iv$iv	J
/*      */         //   101	19	13	$this$maskEmptyOrDeleted$iv$iv$iv	J
/*      */         //   189	4	15	index$iv$iv	I
/*      */         //   142	132	16	bitCount$iv$iv	I
/*      */         //   298	50	16	bitCount$iv$iv	I
/*      */         //   348	21	16	bitCount$iv$iv	I
/*      */         //   145	7	17	j$iv$iv	I
/*      */         //   152	122	17	j$iv$iv	I
/*      */         //   292	56	17	j$iv$iv	I
/*      */         //   348	14	17	j$iv$iv	I
/*      */         //   160	16	18	value$iv$iv$iv	J
/*      */         //   193	10	21	index$iv	I
/*      */         //   203	62	23	element	Ljava/lang/Object;
/*      */         //   206	68	24	$i$a$-forEach-ScatterSet$SetWrapper$iterator$1$1	I
/*      */         //   196	78	22	$i$a$-forEachIndex-ScatterSet$forEach$2$iv	I
/*      */         //   104	16	15	$i$f$maskEmptyOrDeleted	I
/*      */         //   163	14	20	$i$f$isFull	I
/*      */         //   65	209	7	$i$f$forEachIndex	I
/*      */         //   52	222	4	$i$f$forEach	I
/*      */         //   36	352	0	this	Landroidx/collection/ScatterSet$SetWrapper$iterator$1;
/*      */         //   36	352	1	$result	Ljava/lang/Object;
/*      */         //   286	62	24	$i$a$-forEach-ScatterSet$SetWrapper$iterator$1$1	I
/*      */         //   283	66	22	$i$a$-forEachIndex-ScatterSet$forEach$2$iv	I
/*      */         //   280	103	7	$i$f$forEachIndex	I
/*      */         //   277	107	4	$i$f$forEach	I
/*      */       }
/*      */       
/*      */       @NotNull
/*      */       public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super ScatterSet$SetWrapper$iterator$1> $completion) {
/*      */         ScatterSet$SetWrapper$iterator$1 scatterSet$SetWrapper$iterator$1 = new ScatterSet$SetWrapper$iterator$1($completion);
/*      */         scatterSet$SetWrapper$iterator$1.L$0 = value;
/*      */         return (Continuation<Unit>)scatterSet$SetWrapper$iterator$1;
/*      */       }
/*      */       
/*      */       @Nullable
/*      */       public final Object invoke(@NotNull SequenceScope p1, @Nullable Continuation<?> p2) {
/*      */         return ((ScatterSet$SetWrapper$iterator$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */       }
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\ScatterSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */