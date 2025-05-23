/*      */ package androidx.collection;
/*      */ 
/*      */ import androidx.annotation.IntRange;
/*      */ import java.util.NoSuchElementException;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.PublishedApi;
/*      */ import kotlin.jvm.JvmField;
/*      */ import kotlin.jvm.JvmOverloads;
/*      */ import kotlin.jvm.functions.Function1;
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
/*      */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\005\n\002\020\024\n\002\b\002\n\002\020\026\n\002\b\004\n\002\020\013\n\000\n\002\030\002\n\002\020\007\n\002\030\002\n\002\b\013\n\002\020\002\n\002\b\007\n\002\020\016\n\000\n\002\020\r\n\002\b\007\n\002\030\002\n\000\b6\030\0002\0020\001B\007\b\004¢\006\002\020\002J:\020\021\032\0020\0222!\020\023\032\035\022\023\022\0210\025¢\006\f\b\026\022\b\b\027\022\004\b\b(\030\022\004\022\0020\0220\024H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\006\020\031\032\0020\022J:\020\031\032\0020\0222!\020\023\032\035\022\023\022\0210\025¢\006\f\b\026\022\b\b\027\022\004\b\b(\030\022\004\022\0020\0220\024H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\021\020\032\032\0020\0222\006\020\030\032\0020\025H\002J\b\020\033\032\0020\004H\007J:\020\033\032\0020\0042!\020\023\032\035\022\023\022\0210\025¢\006\f\b\026\022\b\b\027\022\004\b\b(\030\022\004\022\0020\0220\024H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\023\020\034\032\0020\0222\b\020\035\032\004\030\0010\001H\002J\026\020\036\032\0020\0042\006\020\030\032\0020\025H\b¢\006\002\b\037J\t\020 \032\0020\025H\bJ:\020 \032\0020\0252!\020\023\032\035\022\023\022\0210\025¢\006\f\b\026\022\b\b\027\022\004\b\b(\030\022\004\022\0020\0220\024H\bø\001\000\002\b\n\006\b\001\022\002\020\001J:\020!\032\0020\"2!\020#\032\035\022\023\022\0210\025¢\006\f\b\026\022\b\b\027\022\004\b\b(\030\022\004\022\0020\"0\024H\bø\001\000\002\b\n\006\b\001\022\002\020\001J:\020$\032\0020\"2!\020#\032\035\022\023\022\0210\004¢\006\f\b\026\022\b\b\027\022\004\b\b(%\022\004\022\0020\"0\024H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\b\020&\032\0020\004H\026J\006\020'\032\0020\022J\006\020(\032\0020\022J:\020)\032\0020*2\b\b\002\020+\032\0020,2\b\b\002\020-\032\0020,2\b\b\002\020.\032\0020,2\b\b\002\020/\032\0020\0042\b\b\002\0200\032\0020,H\007JT\020)\032\0020*2\b\b\002\020+\032\0020,2\b\b\002\020-\032\0020,2\b\b\002\020.\032\0020,2\b\b\002\020/\032\0020\0042\b\b\002\0200\032\0020,2\024\b\004\0201\032\016\022\004\022\0020\025\022\004\022\0020,0\024H\bø\001\000J\006\0202\032\0020\022J\b\0203\032\0020*H\026R\022\020\003\032\0020\0048\000@\000X\016¢\006\002\n\000R\022\020\005\032\0020\0048\000@\000X\016¢\006\002\n\000R\021\020\006\032\0020\0048G¢\006\006\032\004\b\007\020\bR\030\020\t\032\0020\n8\000@\000X\016¢\006\b\n\000\022\004\b\013\020\002R\030\020\f\032\0020\r8\000@\000X\016¢\006\b\n\000\022\004\b\016\020\002R\021\020\017\032\0020\0048G¢\006\006\032\004\b\020\020\b\001\0014\002\007\n\005\b20\001¨\0065"}, d2 = {"Landroidx/collection/FloatSet;", "", "()V", "_capacity", "", "_size", "capacity", "getCapacity", "()I", "elements", "", "getElements$annotations", "metadata", "", "getMetadata$annotations", "size", "getSize", "all", "", "predicate", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "element", "any", "contains", "count", "equals", "other", "findElementIndex", "findElementIndex$collection", "first", "forEach", "", "block", "forEachIndex", "index", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "Landroidx/collection/MutableFloatSet;", "collection"})
/*      */ @SourceDebugExtension({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/FloatSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,837:1\n262#1,4:838\n232#1,7:842\n243#1,3:850\n246#1,2:854\n266#1,2:856\n249#1,6:858\n268#1:864\n262#1,4:865\n232#1,7:869\n243#1,3:877\n246#1,2:881\n266#1,2:883\n249#1,6:885\n268#1:891\n232#1,7:894\n243#1,3:902\n246#1,9:906\n262#1,4:915\n232#1,7:919\n243#1,3:927\n246#1,2:931\n266#1,2:933\n249#1,6:935\n268#1:941\n262#1,4:942\n232#1,7:946\n243#1,3:954\n246#1,2:958\n266#1,2:960\n249#1,6:962\n268#1:968\n262#1,4:969\n232#1,7:973\n243#1,3:981\n246#1,2:985\n266#1,2:987\n249#1,6:989\n268#1:995\n442#1:996\n443#1:1000\n445#1,2:1002\n447#1,3:1005\n450#1:1011\n451#1:1015\n452#1:1017\n453#1,4:1020\n459#1:1025\n460#1,8:1027\n262#1,4:1035\n232#1,7:1039\n243#1,3:1047\n246#1,2:1051\n266#1,2:1053\n249#1,6:1055\n268#1:1061\n262#1,4:1062\n232#1,7:1066\n243#1,3:1074\n246#1,2:1078\n266#1,2:1080\n249#1,6:1082\n268#1:1088\n262#1,4:1089\n232#1,7:1093\n243#1,3:1101\n246#1,2:1105\n266#1,2:1107\n249#1,6:1109\n268#1:1115\n262#1,4:1116\n232#1,7:1120\n243#1,3:1128\n246#1,2:1132\n266#1,2:1134\n249#1,6:1136\n268#1:1142\n262#1,4:1143\n232#1,7:1147\n243#1,3:1155\n246#1,2:1159\n266#1,2:1161\n249#1,6:1163\n268#1:1169\n365#1,11:1186\n262#1,4:1197\n232#1,7:1201\n243#1,3:1209\n246#1,2:1213\n266#1:1215\n376#1,10:1216\n267#1:1226\n249#1,6:1227\n268#1:1233\n386#1,2:1234\n365#1,11:1236\n262#1,4:1247\n232#1,7:1251\n243#1,3:1259\n246#1,2:1263\n266#1:1265\n376#1,10:1266\n267#1:1276\n249#1,6:1277\n268#1:1283\n386#1,2:1284\n365#1,11:1286\n262#1,4:1297\n232#1,7:1301\n243#1,3:1309\n246#1,2:1313\n266#1:1315\n376#1,10:1316\n267#1:1326\n249#1,6:1327\n268#1:1333\n386#1,2:1334\n365#1,11:1336\n262#1,4:1347\n232#1,7:1351\n243#1,3:1359\n246#1,2:1363\n266#1:1365\n376#1,10:1366\n267#1:1376\n249#1,6:1377\n268#1:1383\n386#1,2:1384\n365#1,11:1386\n262#1,4:1397\n232#1,7:1401\n243#1,3:1409\n246#1,2:1413\n266#1:1415\n376#1,10:1416\n267#1:1426\n249#1,6:1427\n268#1:1433\n386#1,2:1434\n1810#2:849\n1672#2:853\n1810#2:876\n1672#2:880\n1810#2:892\n1672#2:893\n1810#2:901\n1672#2:905\n1810#2:926\n1672#2:930\n1810#2:953\n1672#2:957\n1810#2:980\n1672#2:984\n1603#2:1001\n1599#2:1004\n1779#2,3:1008\n1793#2,3:1012\n1717#2:1016\n1705#2:1018\n1699#2:1019\n1712#2:1024\n1802#2:1026\n1810#2:1046\n1672#2:1050\n1810#2:1073\n1672#2:1077\n1810#2:1100\n1672#2:1104\n1810#2:1127\n1672#2:1131\n1810#2:1154\n1672#2:1158\n1603#2:1173\n1599#2:1174\n1779#2,3:1175\n1793#2,3:1178\n1717#2:1181\n1705#2:1182\n1699#2:1183\n1712#2:1184\n1802#2:1185\n1810#2:1208\n1672#2:1212\n1810#2:1258\n1672#2:1262\n1810#2:1308\n1672#2:1312\n1810#2:1358\n1672#2:1362\n1810#2:1408\n1672#2:1412\n833#3,3:997\n833#3,3:1170\n*S KotlinDebug\n*F\n+ 1 FloatSet.kt\nandroidx/collection/FloatSet\n*L\n203#1:838,4\n203#1:842,7\n203#1:850,3\n203#1:854,2\n203#1:856,2\n203#1:858,6\n203#1:864\n222#1:865,4\n222#1:869,7\n222#1:877,3\n222#1:881,2\n222#1:883,2\n222#1:885,6\n222#1:891\n265#1:894,7\n265#1:902,3\n265#1:906,9\n277#1:915,4\n277#1:919,7\n277#1:927,3\n277#1:931,2\n277#1:933,2\n277#1:935,6\n277#1:941\n290#1:942,4\n290#1:946,7\n290#1:954,3\n290#1:958,2\n290#1:960,2\n290#1:962,6\n290#1:968\n311#1:969,4\n311#1:973,7\n311#1:981,3\n311#1:985,2\n311#1:987,2\n311#1:989,6\n311#1:995\n322#1:996\n322#1:1000\n322#1:1002,2\n322#1:1005,3\n322#1:1011\n322#1:1015\n322#1:1017\n322#1:1020,4\n322#1:1025\n322#1:1027,8\n342#1:1035,4\n342#1:1039,7\n342#1:1047,3\n342#1:1051,2\n342#1:1053,2\n342#1:1055,6\n342#1:1061\n375#1:1062,4\n375#1:1066,7\n375#1:1074,3\n375#1:1078,2\n375#1:1080,2\n375#1:1082,6\n375#1:1088\n375#1:1089,4\n375#1:1093,7\n375#1:1101,3\n375#1:1105,2\n375#1:1107,2\n375#1:1109,6\n375#1:1115\n396#1:1116,4\n396#1:1120,7\n396#1:1128,3\n396#1:1132,2\n396#1:1134,2\n396#1:1136,6\n396#1:1142\n422#1:1143,4\n422#1:1147,7\n422#1:1155,3\n422#1:1159,2\n422#1:1161,2\n422#1:1163,6\n422#1:1169\n-1#1:1186,11\n-1#1:1197,4\n-1#1:1201,7\n-1#1:1209,3\n-1#1:1213,2\n-1#1:1215\n-1#1:1216,10\n-1#1:1226\n-1#1:1227,6\n-1#1:1233\n-1#1:1234,2\n-1#1:1236,11\n-1#1:1247,4\n-1#1:1251,7\n-1#1:1259,3\n-1#1:1263,2\n-1#1:1265\n-1#1:1266,10\n-1#1:1276\n-1#1:1277,6\n-1#1:1283\n-1#1:1284,2\n-1#1:1286,11\n-1#1:1297,4\n-1#1:1301,7\n-1#1:1309,3\n-1#1:1313,2\n-1#1:1315\n-1#1:1316,10\n-1#1:1326\n-1#1:1327,6\n-1#1:1333\n-1#1:1334,2\n-1#1:1336,11\n-1#1:1347,4\n-1#1:1351,7\n-1#1:1359,3\n-1#1:1363,2\n-1#1:1365\n-1#1:1366,10\n-1#1:1376\n-1#1:1377,6\n-1#1:1383\n-1#1:1384,2\n-1#1:1386,11\n-1#1:1397,4\n-1#1:1401,7\n-1#1:1409,3\n-1#1:1413,2\n-1#1:1415\n-1#1:1416,10\n-1#1:1426\n-1#1:1427,6\n-1#1:1433\n-1#1:1434,2\n203#1:849\n203#1:853\n222#1:876\n222#1:880\n238#1:892\n245#1:893\n265#1:901\n265#1:905\n277#1:926\n277#1:930\n290#1:953\n290#1:957\n311#1:980\n311#1:984\n322#1:1001\n322#1:1004\n322#1:1008,3\n322#1:1012,3\n322#1:1016\n322#1:1018\n322#1:1019\n322#1:1024\n322#1:1026\n342#1:1046\n342#1:1050\n375#1:1073\n375#1:1077\n375#1:1100\n375#1:1104\n396#1:1127\n396#1:1131\n422#1:1154\n422#1:1158\n443#1:1173\n446#1:1174\n449#1:1175,3\n450#1:1178,3\n451#1:1181\n452#1:1182\n452#1:1183\n456#1:1184\n459#1:1185\n-1#1:1208\n-1#1:1212\n-1#1:1258\n-1#1:1262\n-1#1:1308\n-1#1:1312\n-1#1:1358\n-1#1:1362\n-1#1:1408\n-1#1:1412\n322#1:997,3\n442#1:1170,3\n*E\n"})
/*      */ public abstract class FloatSet
/*      */ {
/*      */   @JvmField
/*      */   @NotNull
/*  147 */   public long[] metadata = ScatterMapKt.EmptyGroup;
/*      */   
/*      */   @JvmField
/*      */   @NotNull
/*  151 */   public float[] elements = FloatSetKt.getEmptyFloatArray();
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
/*  164 */     return this._capacity;
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
/*  176 */     return this._size;
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean any() {
/*  181 */     return (this._size != 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean none() {
/*  186 */     return (this._size == 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean isEmpty() {
/*  191 */     return (this._size == 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean isNotEmpty() {
/*  196 */     return (this._size != 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final float first() {
/*  203 */     int $i$f$first = 0; FloatSet this_$iv = this; int $i$f$forEach = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  839 */     float[] k$iv = this_$iv.elements;
/*      */     
/*  841 */     FloatSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/*  843 */     long[] m$iv$iv = this_$iv$iv.metadata;
/*  844 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/*  846 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/*  847 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/*  848 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/*  849 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/*  850 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/*  851 */           for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
/*  852 */             long value$iv$iv$iv = slot$iv$iv & 0xFFL; int $i$f$isFull = 0;
/*  853 */             if ((value$iv$iv$iv < 128L)) {
/*  854 */               int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
/*  855 */               int index$iv = index$iv$iv, $i$a$-forEachIndex-FloatSet$forEach$2$iv = 0;
/*  856 */               float it = k$iv[index$iv]; int $i$a$-forEach-FloatSet$first$1 = 0; return it;
/*      */             } 
/*  858 */             slot$iv$iv >>= 8L;
/*      */           } 
/*  860 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break;
/*      */         }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 196
/*      */       }  }
/*      */     else {  }
/*  866 */      throw new NoSuchElementException("The FloatSet is empty"); } public final float first(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$first = 0; FloatSet this_$iv = this; int $i$f$forEach = 0; float[] k$iv = this_$iv.elements;
/*      */     
/*  868 */     FloatSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/*  870 */     long[] m$iv$iv = this_$iv$iv.metadata;
/*  871 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/*  873 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/*  874 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/*  875 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/*  876 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/*  877 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/*  878 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  887 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 227
/*      */       }  }
/*      */     else {  }
/*      */      throw new NoSuchElementException("Could not find a match"); } @PublishedApi public final void forEachIndex(@NotNull Function1 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachIndex = 0; long[] m = this.metadata; int lastIndex = m.length - 2; int i = 0; if (i <= lastIndex)
/*  892 */       while (true) { long slot = m[i]; long $this$maskEmptyOrDeleted$iv = slot; int $i$f$maskEmptyOrDeleted = 0; if (($this$maskEmptyOrDeleted$iv & ($this$maskEmptyOrDeleted$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) { int bitCount = 8 - ((i - lastIndex ^ 0xFFFFFFFF) >>> 31); for (int j = 0; j < bitCount; j++)
/*  893 */           { long value$iv = slot & 0xFFL; int $i$f$isFull = 0; if ((value$iv < 128L)) { int index = (i << 3) + j; block.invoke(Integer.valueOf(index)); }  slot >>= 8L; }  }  continue; if (i != lastIndex) { i++; continue; }
/*      */          break; }
/*  895 */         } public final void forEach(@NotNull Function1 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEach = 0; float[] k = this.elements; FloatSet this_$iv = this; int $i$f$forEachIndex = 0; long[] m$iv = this_$iv.metadata;
/*  896 */     int lastIndex$iv = m$iv.length - 2;
/*      */     
/*  898 */     int i$iv = 0; if (i$iv <= lastIndex$iv) { while (true) {
/*  899 */         long slot$iv = m$iv[i$iv];
/*  900 */         long $this$maskEmptyOrDeleted$iv$iv = slot$iv; int $i$f$maskEmptyOrDeleted = 0;
/*  901 */         if (($this$maskEmptyOrDeleted$iv$iv & ($this$maskEmptyOrDeleted$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/*  902 */         { int bitCount$iv = 8 - ((i$iv - lastIndex$iv ^ 0xFFFFFFFF) >>> 31);
/*  903 */           for (int j$iv = 0;; j$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  911 */           if (bitCount$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv != lastIndex$iv) { i$iv++; continue; }
/*      */          // Byte code: goto -> 200
/*      */       }  }
/*      */     else {  }
/*  916 */      } public final boolean all(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$all = 0; FloatSet this_$iv = this; int $i$f$forEach = 0; float[] k$iv = this_$iv.elements;
/*      */     
/*  918 */     FloatSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/*  920 */     long[] m$iv$iv = this_$iv$iv.metadata;
/*  921 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/*  923 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/*  924 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/*  925 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/*  926 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/*  927 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/*  928 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  937 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break;
/*      */         }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 227
/*      */       }  }
/*      */     else {  }
/*  943 */      return true; } public final boolean any(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$any = 0; FloatSet this_$iv = this; int $i$f$forEach = 0; float[] k$iv = this_$iv.elements;
/*      */     
/*  945 */     FloatSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/*  947 */     long[] m$iv$iv = this_$iv$iv.metadata;
/*  948 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/*  950 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/*  951 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/*  952 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/*  953 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/*  954 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/*  955 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  964 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 227
/*      */       }  }
/*      */     else {  }
/*      */      return false; }
/*  970 */   @IntRange(from = 0L) public final int count() { return this._size; } @IntRange(from = 0L) public final int count(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$count = 0; int count = 0; FloatSet this_$iv = this; int $i$f$forEach = 0; float[] k$iv = this_$iv.elements;
/*      */     
/*  972 */     FloatSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/*  974 */     long[] m$iv$iv = this_$iv$iv.metadata;
/*  975 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/*  977 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/*  978 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/*  979 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/*  980 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/*  981 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/*  982 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  991 */           if (bitCount$iv$iv == 8) {
/*      */             continue;
/*      */           }
/*      */           break;
/*      */         } 
/*      */         continue;
/*      */         if (i$iv$iv != lastIndex$iv$iv) {
/*      */           i$iv$iv++;
/*      */           continue;
/*      */         } 
/*      */         // Byte code: goto -> 234
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
/*      */   public final boolean contains(float element) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: astore_2
/*      */     //   2: iconst_0
/*      */     //   3: istore_3
/*      */     //   4: iconst_0
/*      */     //   5: istore #4
/*      */     //   7: fload_1
/*      */     //   8: invokestatic hashCode : (F)I
/*      */     //   11: ldc -862048943
/*      */     //   13: imul
/*      */     //   14: istore #5
/*      */     //   16: iload #5
/*      */     //   18: iload #5
/*      */     //   20: bipush #16
/*      */     //   22: ishl
/*      */     //   23: ixor
/*      */     //   24: istore #6
/*      */     //   26: iconst_0
/*      */     //   27: istore #5
/*      */     //   29: iload #6
/*      */     //   31: bipush #127
/*      */     //   33: iand
/*      */     //   34: istore #4
/*      */     //   36: aload_2
/*      */     //   37: getfield _capacity : I
/*      */     //   40: istore #5
/*      */     //   42: iconst_0
/*      */     //   43: istore #7
/*      */     //   45: iload #6
/*      */     //   47: bipush #7
/*      */     //   49: iushr
/*      */     //   50: iload #5
/*      */     //   52: iand
/*      */     //   53: istore #8
/*      */     //   55: iconst_0
/*      */     //   56: istore #7
/*      */     //   58: nop
/*      */     //   59: aload_2
/*      */     //   60: getfield metadata : [J
/*      */     //   63: astore #9
/*      */     //   65: iconst_0
/*      */     //   66: istore #10
/*      */     //   68: iload #8
/*      */     //   70: iconst_3
/*      */     //   71: ishr
/*      */     //   72: istore #11
/*      */     //   74: iload #8
/*      */     //   76: bipush #7
/*      */     //   78: iand
/*      */     //   79: iconst_3
/*      */     //   80: ishl
/*      */     //   81: istore #12
/*      */     //   83: aload #9
/*      */     //   85: iload #11
/*      */     //   87: laload
/*      */     //   88: iload #12
/*      */     //   90: lushr
/*      */     //   91: aload #9
/*      */     //   93: iload #11
/*      */     //   95: iconst_1
/*      */     //   96: iadd
/*      */     //   97: laload
/*      */     //   98: bipush #64
/*      */     //   100: iload #12
/*      */     //   102: isub
/*      */     //   103: lshl
/*      */     //   104: iload #12
/*      */     //   106: i2l
/*      */     //   107: lneg
/*      */     //   108: bipush #63
/*      */     //   110: lshr
/*      */     //   111: land
/*      */     //   112: lor
/*      */     //   113: lstore #13
/*      */     //   115: lload #13
/*      */     //   117: lstore #15
/*      */     //   119: iconst_0
/*      */     //   120: istore #17
/*      */     //   122: lload #15
/*      */     //   124: ldc2_w 72340172838076673
/*      */     //   127: iload #4
/*      */     //   129: i2l
/*      */     //   130: lmul
/*      */     //   131: lxor
/*      */     //   132: lstore #18
/*      */     //   134: lload #18
/*      */     //   136: ldc2_w 72340172838076673
/*      */     //   139: lsub
/*      */     //   140: lload #18
/*      */     //   142: ldc2_w -1
/*      */     //   145: lxor
/*      */     //   146: land
/*      */     //   147: ldc2_w -9187201950435737472
/*      */     //   150: land
/*      */     //   151: lstore #20
/*      */     //   153: lload #20
/*      */     //   155: lstore #15
/*      */     //   157: iconst_0
/*      */     //   158: istore #17
/*      */     //   160: lload #15
/*      */     //   162: lconst_0
/*      */     //   163: lcmp
/*      */     //   164: ifeq -> 171
/*      */     //   167: iconst_1
/*      */     //   168: goto -> 172
/*      */     //   171: iconst_0
/*      */     //   172: ifeq -> 249
/*      */     //   175: iload #8
/*      */     //   177: lload #20
/*      */     //   179: lstore #22
/*      */     //   181: iconst_0
/*      */     //   182: istore #24
/*      */     //   184: lload #22
/*      */     //   186: lstore #25
/*      */     //   188: iconst_0
/*      */     //   189: istore #27
/*      */     //   191: lload #25
/*      */     //   193: invokestatic numberOfTrailingZeros : (J)I
/*      */     //   196: iconst_3
/*      */     //   197: ishr
/*      */     //   198: nop
/*      */     //   199: iadd
/*      */     //   200: iload #5
/*      */     //   202: iand
/*      */     //   203: istore #11
/*      */     //   205: aload_2
/*      */     //   206: getfield elements : [F
/*      */     //   209: iload #11
/*      */     //   211: faload
/*      */     //   212: fload_1
/*      */     //   213: fcmpg
/*      */     //   214: ifne -> 221
/*      */     //   217: iconst_1
/*      */     //   218: goto -> 222
/*      */     //   221: iconst_0
/*      */     //   222: ifeq -> 230
/*      */     //   225: iload #11
/*      */     //   227: goto -> 298
/*      */     //   230: lload #20
/*      */     //   232: lstore #22
/*      */     //   234: iconst_0
/*      */     //   235: istore #24
/*      */     //   237: lload #22
/*      */     //   239: lload #22
/*      */     //   241: lconst_1
/*      */     //   242: lsub
/*      */     //   243: land
/*      */     //   244: lstore #20
/*      */     //   246: goto -> 153
/*      */     //   249: lload #13
/*      */     //   251: lstore #15
/*      */     //   253: iconst_0
/*      */     //   254: istore #17
/*      */     //   256: lload #15
/*      */     //   258: lload #15
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
/*      */     //   280: iinc #7, 8
/*      */     //   283: nop
/*      */     //   284: iload #8
/*      */     //   286: iload #7
/*      */     //   288: iadd
/*      */     //   289: iload #5
/*      */     //   291: iand
/*      */     //   292: istore #8
/*      */     //   294: goto -> 58
/*      */     //   297: iconst_m1
/*      */     //   298: iflt -> 305
/*      */     //   301: iconst_1
/*      */     //   302: goto -> 306
/*      */     //   305: iconst_0
/*      */     //   306: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #322	-> 0
/*      */     //   #996	-> 4
/*      */     //   #997	-> 7
/*      */     //   #999	-> 16
/*      */     //   #996	-> 24
/*      */     //   #1000	-> 26
/*      */     //   #1001	-> 29
/*      */     //   #1000	-> 34
/*      */     //   #1002	-> 36
/*      */     //   #1003	-> 42
/*      */     //   #1004	-> 45
/*      */     //   #1003	-> 50
/*      */     //   #1005	-> 55
/*      */     //   #1006	-> 58
/*      */     //   #1007	-> 59
/*      */     //   #1008	-> 68
/*      */     //   #1009	-> 74
/*      */     //   #1010	-> 83
/*      */     //   #1007	-> 113
/*      */     //   #1011	-> 115
/*      */     //   #1012	-> 122
/*      */     //   #1014	-> 134
/*      */     //   #1011	-> 151
/*      */     //   #1015	-> 153
/*      */     //   #1016	-> 160
/*      */     //   #1017	-> 175
/*      */     //   #1018	-> 184
/*      */     //   #1019	-> 191
/*      */     //   #1019	-> 196
/*      */     //   #1018	-> 198
/*      */     //   #1017	-> 199
/*      */     //   #1020	-> 205
/*      */     //   #1021	-> 225
/*      */     //   #1023	-> 230
/*      */     //   #1024	-> 237
/*      */     //   #1023	-> 244
/*      */     //   #1025	-> 249
/*      */     //   #1026	-> 256
/*      */     //   #1025	-> 272
/*      */     //   #1027	-> 277
/*      */     //   #1030	-> 283
/*      */     //   #1031	-> 284
/*      */     //   #1034	-> 297
/*      */     //   #322	-> 298
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   7	17	4	$i$f$hash	I
/*      */     //   16	8	5	hash$iv$iv	I
/*      */     //   29	5	5	$i$f$h2	I
/*      */     //   45	5	7	$i$f$h1	I
/*      */     //   68	45	10	$i$f$group	I
/*      */     //   74	39	11	i$iv$iv	I
/*      */     //   83	30	12	b$iv$iv	I
/*      */     //   65	48	9	metadata$iv$iv	[J
/*      */     //   122	29	17	$i$f$match	I
/*      */     //   134	17	18	x$iv$iv	J
/*      */     //   119	32	15	$this$match$iv$iv	J
/*      */     //   160	12	17	$i$f$hasNext	I
/*      */     //   157	15	15	$this$hasNext$iv$iv	J
/*      */     //   191	7	27	$i$f$lowestBitSet	I
/*      */     //   188	10	25	$this$lowestBitSet$iv$iv$iv	J
/*      */     //   184	15	24	$i$f$get	I
/*      */     //   181	18	22	$this$get$iv$iv	J
/*      */     //   237	7	24	$i$f$next	I
/*      */     //   234	10	22	$this$next$iv$iv	J
/*      */     //   205	41	11	index$iv	I
/*      */     //   256	16	17	$i$f$maskEmpty	I
/*      */     //   253	19	15	$this$maskEmpty$iv$iv	J
/*      */     //   115	179	13	g$iv	J
/*      */     //   153	141	20	m$iv	J
/*      */     //   4	294	3	$i$f$findElementIndex$collection	I
/*      */     //   26	272	6	hash$iv	I
/*      */     //   36	262	4	hash2$iv	I
/*      */     //   42	256	5	probeMask$iv	I
/*      */     //   55	243	8	probeOffset$iv	I
/*      */     //   58	240	7	probeIndex$iv	I
/*      */     //   2	296	2	this_$iv	Landroidx/collection/FloatSet;
/*      */     //   0	307	0	this	Landroidx/collection/FloatSet;
/*      */     //   0	307	1	element	F
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @JvmOverloads
/*      */   @NotNull
/*      */   public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated) {
/*      */     Intrinsics.checkNotNullParameter(separator, "separator");
/*      */     Intrinsics.checkNotNullParameter(prefix, "prefix");
/*      */     Intrinsics.checkNotNullParameter(postfix, "postfix");
/*      */     Intrinsics.checkNotNullParameter(truncated, "truncated");
/*      */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2413 = stringBuilder1;
/*      */     int $i$a$-buildString-FloatSet$joinToString$1 = 0;
/*      */     $this$joinToString_u24lambda_u2413.append(prefix);
/*      */     int index = 0;
/*      */     FloatSet this_$iv = this;
/*      */     int $i$f$forEach = 0;
/* 1036 */     float[] k$iv = this_$iv.elements;
/*      */     
/* 1038 */     FloatSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1040 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1041 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1043 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1044 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1045 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1046 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1047 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1048 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1057 */           if (bitCount$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 295
/*      */         }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 294
/*      */       }  }
/*      */     else { $this$joinToString_u24lambda_u2413.append(postfix); }
/* 1063 */      Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()"); return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @NotNull Function1 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(truncated, "truncated"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0; StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2415 = stringBuilder1; int $i$a$-buildString-FloatSet$joinToString$2 = 0; $this$joinToString_u24lambda_u2415.append(prefix); int index = 0; FloatSet this_$iv = this; int $i$f$forEach = 0; float[] k$iv = this_$iv.elements;
/*      */     
/* 1065 */     FloatSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1067 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1068 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1070 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1071 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1072 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1073 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1074 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1075 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1084 */           if (bitCount$iv$iv == 8) {
/*      */             continue;
/*      */           }
/*      */           // Byte code: goto -> 319
/*      */         } 
/*      */         continue;
/*      */         if (i$iv$iv != lastIndex$iv$iv) {
/*      */           i$iv$iv++;
/*      */           continue;
/*      */         } 
/*      */         // Byte code: goto -> 318
/*      */       }  }
/*      */     else
/*      */     { $this$joinToString_u24lambda_u2415.append(postfix); }
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
/*      */ 
/*      */   
/*      */   public int hashCode() {
/*      */     int hash = 0;
/*      */     FloatSet this_$iv = this;
/*      */     int $i$f$forEach = 0;
/* 1117 */     float[] k$iv = this_$iv.elements;
/*      */     
/* 1119 */     FloatSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1121 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1122 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1124 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true)
/* 1125 */       { long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1126 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1127 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1128 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1129 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1138 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 205 }  }
/*      */     else {  }
/*      */      return hash; } public boolean equals(@Nullable Object other) { if (other == this)
/*      */       return true;  if (!(other instanceof FloatSet))
/*      */       return false;  if (((FloatSet)other)._size != this._size)
/* 1144 */       return false;  FloatSet this_$iv = this; int $i$f$forEach = 0; float[] k$iv = this_$iv.elements;
/*      */     
/* 1146 */     FloatSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1148 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1149 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1151 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1152 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1153 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1154 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1155 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1156 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1165 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 241
/*      */       }  }
/*      */     else {  }
/*      */      return true; }
/* 1170 */   @NotNull public String toString() { return joinToString$default(this, null, "[", "]", 0, null, 25, null); } public final int findElementIndex$collection(float element) { int $i$f$findElementIndex$collection = 0, $i$f$hash = 0; int hash$iv = Float.hashCode(element) * -862048943;
/*      */     
/* 1172 */     int hash = hash$iv ^ hash$iv << 16;
/* 1173 */     int $i$f$h2 = 0, hash2 = hash & 0x7F; int probeMask = this._capacity;
/* 1174 */     int $i$f$h1 = 0, probeOffset = hash >>> 7 & probeMask; int probeIndex = 0; while (true)
/* 1175 */     { long[] metadata$iv = this.metadata; int $i$f$group = 0; int i$iv = probeOffset >> 3;
/* 1176 */       int b$iv = (probeOffset & 0x7) << 3;
/* 1177 */       long g = metadata$iv[i$iv] >>> b$iv | metadata$iv[i$iv + 1] << 64 - b$iv & -(b$iv) >> 63L; long $this$match$iv = g; int $i$f$match = 0;
/* 1178 */       long x$iv = $this$match$iv ^ 72340172838076673L * hash2;
/*      */       
/* 1180 */       long m = x$iv - 72340172838076673L & (x$iv ^ 0xFFFFFFFFFFFFFFFFL) & 0x8080808080808080L; while (true)
/* 1181 */       { long $this$hasNext$iv = m; int $i$f$hasNext = 0; if (($this$hasNext$iv != 0L)) {
/* 1182 */           long $this$get$iv = m; int $i$f$get = 0; long $this$lowestBitSet$iv$iv = $this$get$iv; int $i$f$lowestBitSet = 0;
/* 1183 */           int index = probeOffset + (Long.numberOfTrailingZeros($this$lowestBitSet$iv$iv) >> 3) & probeMask;
/*      */         }  long $this$maskEmpty$iv = g; int $i$f$maskEmpty = 0;
/* 1185 */         if (($this$maskEmpty$iv & ($this$maskEmpty$iv ^ 0xFFFFFFFFFFFFFFFFL) << 6L & 0x8080808080808080L) != 0L)
/* 1186 */           return -1;  break; }  probeIndex += 8; probeOffset = probeOffset + probeIndex & probeMask; }  return -1; } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull Function1 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1191 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1193 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2415$iv = stringBuilder1; int $i$a$-buildString-FloatSet$joinToString$2$iv = 0;
/* 1194 */     $this$joinToString_u24lambda_u2415$iv.append(prefix);
/* 1195 */     int index$iv = 0;
/* 1196 */     FloatSet this_$iv$iv = this; int $i$f$forEach = 0;
/*      */     
/* 1198 */     float[] k$iv$iv = this_$iv$iv.elements;
/*      */     
/* 1200 */     FloatSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1202 */     long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1203 */     int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */     
/* 1205 */     int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1206 */         long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1207 */         long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1208 */         if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1209 */           int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1210 */           for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
/* 1211 */             long value$iv$iv$iv$iv = slot$iv$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1212 */             if ((value$iv$iv$iv$iv < 128L)) {
/* 1213 */               int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
/* 1214 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndex-FloatSet$forEach$2$iv$iv = 0;
/* 1215 */               float element$iv = k$iv$iv[index$iv$iv]; int $i$a$-forEach-FloatSet$joinToString$2$1$iv = 0;
/* 1216 */               if (index$iv == limit) {
/* 1217 */                 $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
/*      */                 // Byte code: goto -> 332
/*      */               } 
/* 1220 */               if (index$iv != 0) {
/* 1221 */                 $this$joinToString_u24lambda_u2415$iv.append(separator);
/*      */               }
/* 1223 */               $this$joinToString_u24lambda_u2415$iv.append((CharSequence)transform.invoke(Float.valueOf(element$iv)));
/* 1224 */               index$iv++;
/*      */             } 
/*      */             
/* 1227 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1229 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 323
/*      */         }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*      */          // Byte code: goto -> 322
/*      */       }  }
/* 1234 */     else { $this$joinToString_u24lambda_u2415$iv.append(postfix); }
/*      */      Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/* 1236 */     return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, @NotNull Function1 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/*      */ 
/*      */ 
/*      */     
/* 1240 */     int limit$iv = -1;
/* 1241 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1243 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2415$iv = stringBuilder1; int $i$a$-buildString-FloatSet$joinToString$2$iv = 0;
/* 1244 */     $this$joinToString_u24lambda_u2415$iv.append(prefix);
/* 1245 */     int index$iv = 0;
/* 1246 */     FloatSet this_$iv$iv = this; int $i$f$forEach = 0;
/*      */     
/* 1248 */     float[] k$iv$iv = this_$iv$iv.elements;
/*      */     
/* 1250 */     FloatSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1252 */     long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1253 */     int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */     
/* 1255 */     int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { label36: while (true)
/* 1256 */       { long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1257 */         long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1258 */         if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1259 */           int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1260 */           for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
/* 1261 */             long value$iv$iv$iv$iv = slot$iv$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1262 */             if ((value$iv$iv$iv$iv < 128L)) {
/* 1263 */               int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
/* 1264 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndex-FloatSet$forEach$2$iv$iv = 0;
/* 1265 */               float element$iv = k$iv$iv[index$iv$iv]; int $i$a$-forEach-FloatSet$joinToString$2$1$iv = 0;
/* 1266 */               if (index$iv == limit$iv) {
/* 1267 */                 $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
/*      */                 break label36;
/*      */               } 
/* 1270 */               if (index$iv != 0) {
/* 1271 */                 $this$joinToString_u24lambda_u2415$iv.append(separator);
/*      */               }
/* 1273 */               $this$joinToString_u24lambda_u2415$iv.append((CharSequence)transform.invoke(Float.valueOf(element$iv)));
/* 1274 */               index$iv++;
/*      */             } 
/*      */             
/* 1277 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1279 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue; 
/*      */         } else {
/*      */           continue;
/*      */         } 
/* 1284 */         $this$joinToString_u24lambda_u2415$iv.append(postfix); if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }  continue; }  } else { $this$joinToString_u24lambda_u2415$iv.append(postfix); }
/*      */      Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/* 1286 */     return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull Function1 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/*      */ 
/*      */     
/* 1289 */     CharSequence postfix$iv = "";
/* 1290 */     int limit$iv = -1;
/* 1291 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1293 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2415$iv = stringBuilder1; int $i$a$-buildString-FloatSet$joinToString$2$iv = 0;
/* 1294 */     $this$joinToString_u24lambda_u2415$iv.append(prefix);
/* 1295 */     int index$iv = 0;
/* 1296 */     FloatSet this_$iv$iv = this; int $i$f$forEach = 0;
/*      */     
/* 1298 */     float[] k$iv$iv = this_$iv$iv.elements;
/*      */     
/* 1300 */     FloatSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1302 */     long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1303 */     int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */     
/* 1305 */     int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1306 */         long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1307 */         long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1308 */         if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1309 */           int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1310 */           for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
/* 1311 */             long value$iv$iv$iv$iv = slot$iv$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1312 */             if ((value$iv$iv$iv$iv < 128L)) {
/* 1313 */               int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
/* 1314 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndex-FloatSet$forEach$2$iv$iv = 0;
/* 1315 */               float element$iv = k$iv$iv[index$iv$iv]; int $i$a$-forEach-FloatSet$joinToString$2$1$iv = 0;
/* 1316 */               if (index$iv == limit$iv) {
/* 1317 */                 $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
/*      */                 // Byte code: goto -> 336
/*      */               } 
/* 1320 */               if (index$iv != 0) {
/* 1321 */                 $this$joinToString_u24lambda_u2415$iv.append(separator);
/*      */               }
/* 1323 */               $this$joinToString_u24lambda_u2415$iv.append((CharSequence)transform.invoke(Float.valueOf(element$iv)));
/* 1324 */               index$iv++;
/*      */             } 
/*      */             
/* 1327 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1329 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 326
/*      */         }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*      */          // Byte code: goto -> 325
/*      */       }  }
/* 1334 */     else { $this$joinToString_u24lambda_u2415$iv.append(postfix$iv); }
/*      */      Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/* 1336 */     return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull Function1 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/*      */     
/* 1338 */     CharSequence prefix$iv = "";
/* 1339 */     CharSequence postfix$iv = "";
/* 1340 */     int limit$iv = -1;
/* 1341 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1343 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2415$iv = stringBuilder1; int $i$a$-buildString-FloatSet$joinToString$2$iv = 0;
/* 1344 */     $this$joinToString_u24lambda_u2415$iv.append(prefix$iv);
/* 1345 */     int index$iv = 0;
/* 1346 */     FloatSet this_$iv$iv = this; int $i$f$forEach = 0;
/*      */     
/* 1348 */     float[] k$iv$iv = this_$iv$iv.elements;
/*      */     
/* 1350 */     FloatSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1352 */     long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1353 */     int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */     
/* 1355 */     int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1356 */         long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1357 */         long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1358 */         if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1359 */           int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1360 */           for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
/* 1361 */             long value$iv$iv$iv$iv = slot$iv$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1362 */             if ((value$iv$iv$iv$iv < 128L)) {
/* 1363 */               int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
/* 1364 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndex-FloatSet$forEach$2$iv$iv = 0;
/* 1365 */               float element$iv = k$iv$iv[index$iv$iv]; int $i$a$-forEach-FloatSet$joinToString$2$1$iv = 0;
/* 1366 */               if (index$iv == limit$iv) {
/* 1367 */                 $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
/*      */                 // Byte code: goto -> 338
/*      */               } 
/* 1370 */               if (index$iv != 0) {
/* 1371 */                 $this$joinToString_u24lambda_u2415$iv.append(separator);
/*      */               }
/* 1373 */               $this$joinToString_u24lambda_u2415$iv.append((CharSequence)transform.invoke(Float.valueOf(element$iv)));
/* 1374 */               index$iv++;
/*      */             } 
/*      */             
/* 1377 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1379 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 328
/*      */         }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*      */          // Byte code: goto -> 327
/*      */       }  }
/* 1384 */     else { $this$joinToString_u24lambda_u2415$iv.append(postfix$iv); }
/*      */      Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/* 1386 */     return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull Function1 transform) { Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/* 1387 */     CharSequence separator$iv = ", ";
/* 1388 */     CharSequence prefix$iv = "";
/* 1389 */     CharSequence postfix$iv = "";
/* 1390 */     int limit$iv = -1;
/* 1391 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1393 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2415$iv = stringBuilder1; int $i$a$-buildString-FloatSet$joinToString$2$iv = 0;
/* 1394 */     $this$joinToString_u24lambda_u2415$iv.append(prefix$iv);
/* 1395 */     int index$iv = 0;
/* 1396 */     FloatSet this_$iv$iv = this; int $i$f$forEach = 0;
/*      */     
/* 1398 */     float[] k$iv$iv = this_$iv$iv.elements;
/*      */     
/* 1400 */     FloatSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1402 */     long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1403 */     int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */     
/* 1405 */     int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1406 */         long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1407 */         long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1408 */         if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1409 */           int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1410 */           for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
/* 1411 */             long value$iv$iv$iv$iv = slot$iv$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1412 */             if ((value$iv$iv$iv$iv < 128L)) {
/* 1413 */               int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
/* 1414 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndex-FloatSet$forEach$2$iv$iv = 0;
/* 1415 */               float element$iv = k$iv$iv[index$iv$iv]; int $i$a$-forEach-FloatSet$joinToString$2$1$iv = 0;
/* 1416 */               if (index$iv == limit$iv) {
/* 1417 */                 $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
/*      */                 // Byte code: goto -> 339
/*      */               } 
/* 1420 */               if (index$iv != 0) {
/* 1421 */                 $this$joinToString_u24lambda_u2415$iv.append(separator$iv);
/*      */               }
/* 1423 */               $this$joinToString_u24lambda_u2415$iv.append((CharSequence)transform.invoke(Float.valueOf(element$iv)));
/* 1424 */               index$iv++;
/*      */             } 
/*      */             
/* 1427 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1429 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 329
/*      */         }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*      */          // Byte code: goto -> 328
/*      */       }  }
/* 1434 */     else { $this$joinToString_u24lambda_u2415$iv.append(postfix$iv); }
/*      */     
/*      */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/*      */     return stringBuilder1.toString(); }
/*      */ 
/*      */   
/*      */   private FloatSet() {}
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\FloatSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */