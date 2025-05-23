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
/*      */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\005\n\002\020\026\n\002\b\006\n\002\020\013\n\000\n\002\030\002\n\002\020\t\n\002\030\002\n\002\b\013\n\002\020\002\n\002\b\007\n\002\020\016\n\000\n\002\020\r\n\002\b\007\n\002\030\002\n\000\b6\030\0002\0020\001B\007\b\004¢\006\002\020\002J:\020\020\032\0020\0212!\020\022\032\035\022\023\022\0210\024¢\006\f\b\025\022\b\b\026\022\004\b\b(\027\022\004\022\0020\0210\023H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\006\020\030\032\0020\021J:\020\030\032\0020\0212!\020\022\032\035\022\023\022\0210\024¢\006\f\b\025\022\b\b\026\022\004\b\b(\027\022\004\022\0020\0210\023H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\021\020\031\032\0020\0212\006\020\027\032\0020\024H\002J\b\020\032\032\0020\004H\007J:\020\032\032\0020\0042!\020\022\032\035\022\023\022\0210\024¢\006\f\b\025\022\b\b\026\022\004\b\b(\027\022\004\022\0020\0210\023H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\023\020\033\032\0020\0212\b\020\034\032\004\030\0010\001H\002J\026\020\035\032\0020\0042\006\020\027\032\0020\024H\b¢\006\002\b\036J\t\020\037\032\0020\024H\bJ:\020\037\032\0020\0242!\020\022\032\035\022\023\022\0210\024¢\006\f\b\025\022\b\b\026\022\004\b\b(\027\022\004\022\0020\0210\023H\bø\001\000\002\b\n\006\b\001\022\002\020\001J:\020 \032\0020!2!\020\"\032\035\022\023\022\0210\024¢\006\f\b\025\022\b\b\026\022\004\b\b(\027\022\004\022\0020!0\023H\bø\001\000\002\b\n\006\b\001\022\002\020\001J:\020#\032\0020!2!\020\"\032\035\022\023\022\0210\004¢\006\f\b\025\022\b\b\026\022\004\b\b($\022\004\022\0020!0\023H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\b\020%\032\0020\004H\026J\006\020&\032\0020\021J\006\020'\032\0020\021J:\020(\032\0020)2\b\b\002\020*\032\0020+2\b\b\002\020,\032\0020+2\b\b\002\020-\032\0020+2\b\b\002\020.\032\0020\0042\b\b\002\020/\032\0020+H\007JT\020(\032\0020)2\b\b\002\020*\032\0020+2\b\b\002\020,\032\0020+2\b\b\002\020-\032\0020+2\b\b\002\020.\032\0020\0042\b\b\002\020/\032\0020+2\024\b\004\0200\032\016\022\004\022\0020\024\022\004\022\0020+0\023H\bø\001\000J\006\0201\032\0020\021J\b\0202\032\0020)H\026R\022\020\003\032\0020\0048\000@\000X\016¢\006\002\n\000R\022\020\005\032\0020\0048\000@\000X\016¢\006\002\n\000R\021\020\006\032\0020\0048G¢\006\006\032\004\b\007\020\bR\030\020\t\032\0020\n8\000@\000X\016¢\006\b\n\000\022\004\b\013\020\002R\030\020\f\032\0020\n8\000@\000X\016¢\006\b\n\000\022\004\b\r\020\002R\021\020\016\032\0020\0048G¢\006\006\032\004\b\017\020\b\001\0013\002\007\n\005\b20\001¨\0064"}, d2 = {"Landroidx/collection/LongSet;", "", "()V", "_capacity", "", "_size", "capacity", "getCapacity", "()I", "elements", "", "getElements$annotations", "metadata", "getMetadata$annotations", "size", "getSize", "all", "", "predicate", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "element", "any", "contains", "count", "equals", "other", "findElementIndex", "findElementIndex$collection", "first", "forEach", "", "block", "forEachIndex", "index", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "Landroidx/collection/MutableLongSet;", "collection"})
/*      */ @SourceDebugExtension({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,837:1\n262#1,4:838\n232#1,7:842\n243#1,3:850\n246#1,2:854\n266#1,2:856\n249#1,6:858\n268#1:864\n262#1,4:865\n232#1,7:869\n243#1,3:877\n246#1,2:881\n266#1,2:883\n249#1,6:885\n268#1:891\n232#1,7:894\n243#1,3:902\n246#1,9:906\n262#1,4:915\n232#1,7:919\n243#1,3:927\n246#1,2:931\n266#1,2:933\n249#1,6:935\n268#1:941\n262#1,4:942\n232#1,7:946\n243#1,3:954\n246#1,2:958\n266#1,2:960\n249#1,6:962\n268#1:968\n262#1,4:969\n232#1,7:973\n243#1,3:981\n246#1,2:985\n266#1,2:987\n249#1,6:989\n268#1:995\n442#1:996\n443#1:1000\n445#1,2:1002\n447#1,3:1005\n450#1:1011\n451#1:1015\n452#1:1017\n453#1,4:1020\n459#1:1025\n460#1,8:1027\n262#1,4:1035\n232#1,7:1039\n243#1,3:1047\n246#1,2:1051\n266#1,2:1053\n249#1,6:1055\n268#1:1061\n262#1,4:1062\n232#1,7:1066\n243#1,3:1074\n246#1,2:1078\n266#1,2:1080\n249#1,6:1082\n268#1:1088\n262#1,4:1089\n232#1,7:1093\n243#1,3:1101\n246#1,2:1105\n266#1,2:1107\n249#1,6:1109\n268#1:1115\n262#1,4:1116\n232#1,7:1120\n243#1,3:1128\n246#1,2:1132\n266#1,2:1134\n249#1,6:1136\n268#1:1142\n262#1,4:1143\n232#1,7:1147\n243#1,3:1155\n246#1,2:1159\n266#1,2:1161\n249#1,6:1163\n268#1:1169\n365#1,11:1186\n262#1,4:1197\n232#1,7:1201\n243#1,3:1209\n246#1,2:1213\n266#1:1215\n376#1,10:1216\n267#1:1226\n249#1,6:1227\n268#1:1233\n386#1,2:1234\n365#1,11:1236\n262#1,4:1247\n232#1,7:1251\n243#1,3:1259\n246#1,2:1263\n266#1:1265\n376#1,10:1266\n267#1:1276\n249#1,6:1277\n268#1:1283\n386#1,2:1284\n365#1,11:1286\n262#1,4:1297\n232#1,7:1301\n243#1,3:1309\n246#1,2:1313\n266#1:1315\n376#1,10:1316\n267#1:1326\n249#1,6:1327\n268#1:1333\n386#1,2:1334\n365#1,11:1336\n262#1,4:1347\n232#1,7:1351\n243#1,3:1359\n246#1,2:1363\n266#1:1365\n376#1,10:1366\n267#1:1376\n249#1,6:1377\n268#1:1383\n386#1,2:1384\n365#1,11:1386\n262#1,4:1397\n232#1,7:1401\n243#1,3:1409\n246#1,2:1413\n266#1:1415\n376#1,10:1416\n267#1:1426\n249#1,6:1427\n268#1:1433\n386#1,2:1434\n1810#2:849\n1672#2:853\n1810#2:876\n1672#2:880\n1810#2:892\n1672#2:893\n1810#2:901\n1672#2:905\n1810#2:926\n1672#2:930\n1810#2:953\n1672#2:957\n1810#2:980\n1672#2:984\n1603#2:1001\n1599#2:1004\n1779#2,3:1008\n1793#2,3:1012\n1717#2:1016\n1705#2:1018\n1699#2:1019\n1712#2:1024\n1802#2:1026\n1810#2:1046\n1672#2:1050\n1810#2:1073\n1672#2:1077\n1810#2:1100\n1672#2:1104\n1810#2:1127\n1672#2:1131\n1810#2:1154\n1672#2:1158\n1603#2:1173\n1599#2:1174\n1779#2,3:1175\n1793#2,3:1178\n1717#2:1181\n1705#2:1182\n1699#2:1183\n1712#2:1184\n1802#2:1185\n1810#2:1208\n1672#2:1212\n1810#2:1258\n1672#2:1262\n1810#2:1308\n1672#2:1312\n1810#2:1358\n1672#2:1362\n1810#2:1408\n1672#2:1412\n833#3,3:997\n833#3,3:1170\n*S KotlinDebug\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSet\n*L\n203#1:838,4\n203#1:842,7\n203#1:850,3\n203#1:854,2\n203#1:856,2\n203#1:858,6\n203#1:864\n222#1:865,4\n222#1:869,7\n222#1:877,3\n222#1:881,2\n222#1:883,2\n222#1:885,6\n222#1:891\n265#1:894,7\n265#1:902,3\n265#1:906,9\n277#1:915,4\n277#1:919,7\n277#1:927,3\n277#1:931,2\n277#1:933,2\n277#1:935,6\n277#1:941\n290#1:942,4\n290#1:946,7\n290#1:954,3\n290#1:958,2\n290#1:960,2\n290#1:962,6\n290#1:968\n311#1:969,4\n311#1:973,7\n311#1:981,3\n311#1:985,2\n311#1:987,2\n311#1:989,6\n311#1:995\n322#1:996\n322#1:1000\n322#1:1002,2\n322#1:1005,3\n322#1:1011\n322#1:1015\n322#1:1017\n322#1:1020,4\n322#1:1025\n322#1:1027,8\n342#1:1035,4\n342#1:1039,7\n342#1:1047,3\n342#1:1051,2\n342#1:1053,2\n342#1:1055,6\n342#1:1061\n375#1:1062,4\n375#1:1066,7\n375#1:1074,3\n375#1:1078,2\n375#1:1080,2\n375#1:1082,6\n375#1:1088\n375#1:1089,4\n375#1:1093,7\n375#1:1101,3\n375#1:1105,2\n375#1:1107,2\n375#1:1109,6\n375#1:1115\n396#1:1116,4\n396#1:1120,7\n396#1:1128,3\n396#1:1132,2\n396#1:1134,2\n396#1:1136,6\n396#1:1142\n422#1:1143,4\n422#1:1147,7\n422#1:1155,3\n422#1:1159,2\n422#1:1161,2\n422#1:1163,6\n422#1:1169\n-1#1:1186,11\n-1#1:1197,4\n-1#1:1201,7\n-1#1:1209,3\n-1#1:1213,2\n-1#1:1215\n-1#1:1216,10\n-1#1:1226\n-1#1:1227,6\n-1#1:1233\n-1#1:1234,2\n-1#1:1236,11\n-1#1:1247,4\n-1#1:1251,7\n-1#1:1259,3\n-1#1:1263,2\n-1#1:1265\n-1#1:1266,10\n-1#1:1276\n-1#1:1277,6\n-1#1:1283\n-1#1:1284,2\n-1#1:1286,11\n-1#1:1297,4\n-1#1:1301,7\n-1#1:1309,3\n-1#1:1313,2\n-1#1:1315\n-1#1:1316,10\n-1#1:1326\n-1#1:1327,6\n-1#1:1333\n-1#1:1334,2\n-1#1:1336,11\n-1#1:1347,4\n-1#1:1351,7\n-1#1:1359,3\n-1#1:1363,2\n-1#1:1365\n-1#1:1366,10\n-1#1:1376\n-1#1:1377,6\n-1#1:1383\n-1#1:1384,2\n-1#1:1386,11\n-1#1:1397,4\n-1#1:1401,7\n-1#1:1409,3\n-1#1:1413,2\n-1#1:1415\n-1#1:1416,10\n-1#1:1426\n-1#1:1427,6\n-1#1:1433\n-1#1:1434,2\n203#1:849\n203#1:853\n222#1:876\n222#1:880\n238#1:892\n245#1:893\n265#1:901\n265#1:905\n277#1:926\n277#1:930\n290#1:953\n290#1:957\n311#1:980\n311#1:984\n322#1:1001\n322#1:1004\n322#1:1008,3\n322#1:1012,3\n322#1:1016\n322#1:1018\n322#1:1019\n322#1:1024\n322#1:1026\n342#1:1046\n342#1:1050\n375#1:1073\n375#1:1077\n375#1:1100\n375#1:1104\n396#1:1127\n396#1:1131\n422#1:1154\n422#1:1158\n443#1:1173\n446#1:1174\n449#1:1175,3\n450#1:1178,3\n451#1:1181\n452#1:1182\n452#1:1183\n456#1:1184\n459#1:1185\n-1#1:1208\n-1#1:1212\n-1#1:1258\n-1#1:1262\n-1#1:1308\n-1#1:1312\n-1#1:1358\n-1#1:1362\n-1#1:1408\n-1#1:1412\n322#1:997,3\n442#1:1170,3\n*E\n"})
/*      */ public abstract class LongSet
/*      */ {
/*      */   @JvmField
/*      */   @NotNull
/*  147 */   public long[] metadata = ScatterMapKt.EmptyGroup;
/*      */   
/*      */   @JvmField
/*      */   @NotNull
/*  151 */   public long[] elements = LongSetKt.getEmptyLongArray();
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
/*      */   public final long first() {
/*  203 */     int $i$f$first = 0; LongSet this_$iv = this; int $i$f$forEach = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  839 */     long[] k$iv = this_$iv.elements;
/*      */     
/*  841 */     LongSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
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
/*  855 */               int index$iv = index$iv$iv, $i$a$-forEachIndex-LongSet$forEach$2$iv = 0;
/*  856 */               long it = k$iv[index$iv]; int $i$a$-forEach-LongSet$first$1 = 0; return it;
/*      */             } 
/*  858 */             slot$iv$iv >>= 8L;
/*      */           } 
/*  860 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break;
/*      */         }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 196
/*      */       }  }
/*      */     else {  }
/*  866 */      throw new NoSuchElementException("The LongSet is empty"); } public final long first(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$first = 0; LongSet this_$iv = this; int $i$f$forEach = 0; long[] k$iv = this_$iv.elements;
/*      */     
/*  868 */     LongSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
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
/*  895 */         } public final void forEach(@NotNull Function1 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEach = 0; long[] k = this.elements; LongSet this_$iv = this; int $i$f$forEachIndex = 0; long[] m$iv = this_$iv.metadata;
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
/*  916 */      } public final boolean all(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$all = 0; LongSet this_$iv = this; int $i$f$forEach = 0; long[] k$iv = this_$iv.elements;
/*      */     
/*  918 */     LongSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
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
/*  943 */      return true; } public final boolean any(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$any = 0; LongSet this_$iv = this; int $i$f$forEach = 0; long[] k$iv = this_$iv.elements;
/*      */     
/*  945 */     LongSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
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
/*  970 */   @IntRange(from = 0L) public final int count() { return this._size; } @IntRange(from = 0L) public final int count(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$count = 0; int count = 0; LongSet this_$iv = this; int $i$f$forEach = 0; long[] k$iv = this_$iv.elements;
/*      */     
/*  972 */     LongSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
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
/*      */   public final boolean contains(long element) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: astore_3
/*      */     //   2: iconst_0
/*      */     //   3: istore #4
/*      */     //   5: iconst_0
/*      */     //   6: istore #5
/*      */     //   8: lload_1
/*      */     //   9: invokestatic hashCode : (J)I
/*      */     //   12: ldc -862048943
/*      */     //   14: imul
/*      */     //   15: istore #6
/*      */     //   17: iload #6
/*      */     //   19: iload #6
/*      */     //   21: bipush #16
/*      */     //   23: ishl
/*      */     //   24: ixor
/*      */     //   25: istore #7
/*      */     //   27: iconst_0
/*      */     //   28: istore #6
/*      */     //   30: iload #7
/*      */     //   32: bipush #127
/*      */     //   34: iand
/*      */     //   35: istore #5
/*      */     //   37: aload_3
/*      */     //   38: getfield _capacity : I
/*      */     //   41: istore #6
/*      */     //   43: iconst_0
/*      */     //   44: istore #8
/*      */     //   46: iload #7
/*      */     //   48: bipush #7
/*      */     //   50: iushr
/*      */     //   51: iload #6
/*      */     //   53: iand
/*      */     //   54: istore #9
/*      */     //   56: iconst_0
/*      */     //   57: istore #8
/*      */     //   59: nop
/*      */     //   60: aload_3
/*      */     //   61: getfield metadata : [J
/*      */     //   64: astore #10
/*      */     //   66: iconst_0
/*      */     //   67: istore #11
/*      */     //   69: iload #9
/*      */     //   71: iconst_3
/*      */     //   72: ishr
/*      */     //   73: istore #12
/*      */     //   75: iload #9
/*      */     //   77: bipush #7
/*      */     //   79: iand
/*      */     //   80: iconst_3
/*      */     //   81: ishl
/*      */     //   82: istore #13
/*      */     //   84: aload #10
/*      */     //   86: iload #12
/*      */     //   88: laload
/*      */     //   89: iload #13
/*      */     //   91: lushr
/*      */     //   92: aload #10
/*      */     //   94: iload #12
/*      */     //   96: iconst_1
/*      */     //   97: iadd
/*      */     //   98: laload
/*      */     //   99: bipush #64
/*      */     //   101: iload #13
/*      */     //   103: isub
/*      */     //   104: lshl
/*      */     //   105: iload #13
/*      */     //   107: i2l
/*      */     //   108: lneg
/*      */     //   109: bipush #63
/*      */     //   111: lshr
/*      */     //   112: land
/*      */     //   113: lor
/*      */     //   114: lstore #14
/*      */     //   116: lload #14
/*      */     //   118: lstore #16
/*      */     //   120: iconst_0
/*      */     //   121: istore #18
/*      */     //   123: lload #16
/*      */     //   125: ldc2_w 72340172838076673
/*      */     //   128: iload #5
/*      */     //   130: i2l
/*      */     //   131: lmul
/*      */     //   132: lxor
/*      */     //   133: lstore #19
/*      */     //   135: lload #19
/*      */     //   137: ldc2_w 72340172838076673
/*      */     //   140: lsub
/*      */     //   141: lload #19
/*      */     //   143: ldc2_w -1
/*      */     //   146: lxor
/*      */     //   147: land
/*      */     //   148: ldc2_w -9187201950435737472
/*      */     //   151: land
/*      */     //   152: lstore #21
/*      */     //   154: lload #21
/*      */     //   156: lstore #16
/*      */     //   158: iconst_0
/*      */     //   159: istore #18
/*      */     //   161: lload #16
/*      */     //   163: lconst_0
/*      */     //   164: lcmp
/*      */     //   165: ifeq -> 172
/*      */     //   168: iconst_1
/*      */     //   169: goto -> 173
/*      */     //   172: iconst_0
/*      */     //   173: ifeq -> 242
/*      */     //   176: iload #9
/*      */     //   178: lload #21
/*      */     //   180: lstore #23
/*      */     //   182: iconst_0
/*      */     //   183: istore #25
/*      */     //   185: lload #23
/*      */     //   187: lstore #26
/*      */     //   189: iconst_0
/*      */     //   190: istore #28
/*      */     //   192: lload #26
/*      */     //   194: invokestatic numberOfTrailingZeros : (J)I
/*      */     //   197: iconst_3
/*      */     //   198: ishr
/*      */     //   199: nop
/*      */     //   200: iadd
/*      */     //   201: iload #6
/*      */     //   203: iand
/*      */     //   204: istore #12
/*      */     //   206: aload_3
/*      */     //   207: getfield elements : [J
/*      */     //   210: iload #12
/*      */     //   212: laload
/*      */     //   213: lload_1
/*      */     //   214: lcmp
/*      */     //   215: ifne -> 223
/*      */     //   218: iload #12
/*      */     //   220: goto -> 291
/*      */     //   223: lload #21
/*      */     //   225: lstore #23
/*      */     //   227: iconst_0
/*      */     //   228: istore #25
/*      */     //   230: lload #23
/*      */     //   232: lload #23
/*      */     //   234: lconst_1
/*      */     //   235: lsub
/*      */     //   236: land
/*      */     //   237: lstore #21
/*      */     //   239: goto -> 154
/*      */     //   242: lload #14
/*      */     //   244: lstore #16
/*      */     //   246: iconst_0
/*      */     //   247: istore #18
/*      */     //   249: lload #16
/*      */     //   251: lload #16
/*      */     //   253: ldc2_w -1
/*      */     //   256: lxor
/*      */     //   257: bipush #6
/*      */     //   259: lshl
/*      */     //   260: land
/*      */     //   261: ldc2_w -9187201950435737472
/*      */     //   264: land
/*      */     //   265: lconst_0
/*      */     //   266: lcmp
/*      */     //   267: ifeq -> 273
/*      */     //   270: goto -> 290
/*      */     //   273: iinc #8, 8
/*      */     //   276: nop
/*      */     //   277: iload #9
/*      */     //   279: iload #8
/*      */     //   281: iadd
/*      */     //   282: iload #6
/*      */     //   284: iand
/*      */     //   285: istore #9
/*      */     //   287: goto -> 59
/*      */     //   290: iconst_m1
/*      */     //   291: iflt -> 298
/*      */     //   294: iconst_1
/*      */     //   295: goto -> 299
/*      */     //   298: iconst_0
/*      */     //   299: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #322	-> 0
/*      */     //   #996	-> 5
/*      */     //   #997	-> 8
/*      */     //   #999	-> 17
/*      */     //   #996	-> 25
/*      */     //   #1000	-> 27
/*      */     //   #1001	-> 30
/*      */     //   #1000	-> 35
/*      */     //   #1002	-> 37
/*      */     //   #1003	-> 43
/*      */     //   #1004	-> 46
/*      */     //   #1003	-> 51
/*      */     //   #1005	-> 56
/*      */     //   #1006	-> 59
/*      */     //   #1007	-> 60
/*      */     //   #1008	-> 69
/*      */     //   #1009	-> 75
/*      */     //   #1010	-> 84
/*      */     //   #1007	-> 114
/*      */     //   #1011	-> 116
/*      */     //   #1012	-> 123
/*      */     //   #1014	-> 135
/*      */     //   #1011	-> 152
/*      */     //   #1015	-> 154
/*      */     //   #1016	-> 161
/*      */     //   #1017	-> 176
/*      */     //   #1018	-> 185
/*      */     //   #1019	-> 192
/*      */     //   #1019	-> 197
/*      */     //   #1018	-> 199
/*      */     //   #1017	-> 200
/*      */     //   #1020	-> 206
/*      */     //   #1021	-> 218
/*      */     //   #1023	-> 223
/*      */     //   #1024	-> 230
/*      */     //   #1023	-> 237
/*      */     //   #1025	-> 242
/*      */     //   #1026	-> 249
/*      */     //   #1025	-> 265
/*      */     //   #1027	-> 270
/*      */     //   #1030	-> 276
/*      */     //   #1031	-> 277
/*      */     //   #1034	-> 290
/*      */     //   #322	-> 291
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   8	17	5	$i$f$hash	I
/*      */     //   17	8	6	hash$iv$iv	I
/*      */     //   30	5	6	$i$f$h2	I
/*      */     //   46	5	8	$i$f$h1	I
/*      */     //   69	45	11	$i$f$group	I
/*      */     //   75	39	12	i$iv$iv	I
/*      */     //   84	30	13	b$iv$iv	I
/*      */     //   66	48	10	metadata$iv$iv	[J
/*      */     //   123	29	18	$i$f$match	I
/*      */     //   135	17	19	x$iv$iv	J
/*      */     //   120	32	16	$this$match$iv$iv	J
/*      */     //   161	12	18	$i$f$hasNext	I
/*      */     //   158	15	16	$this$hasNext$iv$iv	J
/*      */     //   192	7	28	$i$f$lowestBitSet	I
/*      */     //   189	10	26	$this$lowestBitSet$iv$iv$iv	J
/*      */     //   185	15	25	$i$f$get	I
/*      */     //   182	18	23	$this$get$iv$iv	J
/*      */     //   230	7	25	$i$f$next	I
/*      */     //   227	10	23	$this$next$iv$iv	J
/*      */     //   206	33	12	index$iv	I
/*      */     //   249	16	18	$i$f$maskEmpty	I
/*      */     //   246	19	16	$this$maskEmpty$iv$iv	J
/*      */     //   116	171	14	g$iv	J
/*      */     //   154	133	21	m$iv	J
/*      */     //   5	286	4	$i$f$findElementIndex$collection	I
/*      */     //   27	264	7	hash$iv	I
/*      */     //   37	254	5	hash2$iv	I
/*      */     //   43	248	6	probeMask$iv	I
/*      */     //   56	235	9	probeOffset$iv	I
/*      */     //   59	232	8	probeIndex$iv	I
/*      */     //   2	289	3	this_$iv	Landroidx/collection/LongSet;
/*      */     //   0	300	0	this	Landroidx/collection/LongSet;
/*      */     //   0	300	1	element	J
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
/*      */     int $i$a$-buildString-LongSet$joinToString$1 = 0;
/*      */     $this$joinToString_u24lambda_u2413.append(prefix);
/*      */     int index = 0;
/*      */     LongSet this_$iv = this;
/*      */     int $i$f$forEach = 0;
/* 1036 */     long[] k$iv = this_$iv.elements;
/*      */     
/* 1038 */     LongSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
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
/* 1063 */      Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()"); return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @NotNull Function1 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(truncated, "truncated"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0; StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2415 = stringBuilder1; int $i$a$-buildString-LongSet$joinToString$2 = 0; $this$joinToString_u24lambda_u2415.append(prefix); int index = 0; LongSet this_$iv = this; int $i$f$forEach = 0; long[] k$iv = this_$iv.elements;
/*      */     
/* 1065 */     LongSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
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
/*      */     LongSet this_$iv = this;
/*      */     int $i$f$forEach = 0;
/* 1117 */     long[] k$iv = this_$iv.elements;
/*      */     
/* 1119 */     LongSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
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
/*      */       return true;  if (!(other instanceof LongSet))
/*      */       return false;  if (((LongSet)other)._size != this._size)
/* 1144 */       return false;  LongSet this_$iv = this; int $i$f$forEach = 0; long[] k$iv = this_$iv.elements;
/*      */     
/* 1146 */     LongSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
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
/* 1170 */   @NotNull public String toString() { return joinToString$default(this, null, "[", "]", 0, null, 25, null); } public final int findElementIndex$collection(long element) { int $i$f$findElementIndex$collection = 0, $i$f$hash = 0; int hash$iv = Long.hashCode(element) * -862048943;
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
/* 1193 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2415$iv = stringBuilder1; int $i$a$-buildString-LongSet$joinToString$2$iv = 0;
/* 1194 */     $this$joinToString_u24lambda_u2415$iv.append(prefix);
/* 1195 */     int index$iv = 0;
/* 1196 */     LongSet this_$iv$iv = this; int $i$f$forEach = 0;
/*      */     
/* 1198 */     long[] k$iv$iv = this_$iv$iv.elements;
/*      */     
/* 1200 */     LongSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
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
/* 1214 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndex-LongSet$forEach$2$iv$iv = 0;
/* 1215 */               long element$iv = k$iv$iv[index$iv$iv]; int $i$a$-forEach-LongSet$joinToString$2$1$iv = 0;
/* 1216 */               if (index$iv == limit) {
/* 1217 */                 $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
/*      */                 // Byte code: goto -> 332
/*      */               } 
/* 1220 */               if (index$iv != 0) {
/* 1221 */                 $this$joinToString_u24lambda_u2415$iv.append(separator);
/*      */               }
/* 1223 */               $this$joinToString_u24lambda_u2415$iv.append((CharSequence)transform.invoke(Long.valueOf(element$iv)));
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
/* 1243 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2415$iv = stringBuilder1; int $i$a$-buildString-LongSet$joinToString$2$iv = 0;
/* 1244 */     $this$joinToString_u24lambda_u2415$iv.append(prefix);
/* 1245 */     int index$iv = 0;
/* 1246 */     LongSet this_$iv$iv = this; int $i$f$forEach = 0;
/*      */     
/* 1248 */     long[] k$iv$iv = this_$iv$iv.elements;
/*      */     
/* 1250 */     LongSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
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
/* 1264 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndex-LongSet$forEach$2$iv$iv = 0;
/* 1265 */               long element$iv = k$iv$iv[index$iv$iv]; int $i$a$-forEach-LongSet$joinToString$2$1$iv = 0;
/* 1266 */               if (index$iv == limit$iv) {
/* 1267 */                 $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
/*      */                 break label36;
/*      */               } 
/* 1270 */               if (index$iv != 0) {
/* 1271 */                 $this$joinToString_u24lambda_u2415$iv.append(separator);
/*      */               }
/* 1273 */               $this$joinToString_u24lambda_u2415$iv.append((CharSequence)transform.invoke(Long.valueOf(element$iv)));
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
/* 1293 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2415$iv = stringBuilder1; int $i$a$-buildString-LongSet$joinToString$2$iv = 0;
/* 1294 */     $this$joinToString_u24lambda_u2415$iv.append(prefix);
/* 1295 */     int index$iv = 0;
/* 1296 */     LongSet this_$iv$iv = this; int $i$f$forEach = 0;
/*      */     
/* 1298 */     long[] k$iv$iv = this_$iv$iv.elements;
/*      */     
/* 1300 */     LongSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
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
/* 1314 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndex-LongSet$forEach$2$iv$iv = 0;
/* 1315 */               long element$iv = k$iv$iv[index$iv$iv]; int $i$a$-forEach-LongSet$joinToString$2$1$iv = 0;
/* 1316 */               if (index$iv == limit$iv) {
/* 1317 */                 $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
/*      */                 // Byte code: goto -> 335
/*      */               } 
/* 1320 */               if (index$iv != 0) {
/* 1321 */                 $this$joinToString_u24lambda_u2415$iv.append(separator);
/*      */               }
/* 1323 */               $this$joinToString_u24lambda_u2415$iv.append((CharSequence)transform.invoke(Long.valueOf(element$iv)));
/* 1324 */               index$iv++;
/*      */             } 
/*      */             
/* 1327 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1329 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 325
/*      */         }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*      */          // Byte code: goto -> 324
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
/* 1343 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2415$iv = stringBuilder1; int $i$a$-buildString-LongSet$joinToString$2$iv = 0;
/* 1344 */     $this$joinToString_u24lambda_u2415$iv.append(prefix$iv);
/* 1345 */     int index$iv = 0;
/* 1346 */     LongSet this_$iv$iv = this; int $i$f$forEach = 0;
/*      */     
/* 1348 */     long[] k$iv$iv = this_$iv$iv.elements;
/*      */     
/* 1350 */     LongSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
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
/* 1364 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndex-LongSet$forEach$2$iv$iv = 0;
/* 1365 */               long element$iv = k$iv$iv[index$iv$iv]; int $i$a$-forEach-LongSet$joinToString$2$1$iv = 0;
/* 1366 */               if (index$iv == limit$iv) {
/* 1367 */                 $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
/*      */                 // Byte code: goto -> 336
/*      */               } 
/* 1370 */               if (index$iv != 0) {
/* 1371 */                 $this$joinToString_u24lambda_u2415$iv.append(separator);
/*      */               }
/* 1373 */               $this$joinToString_u24lambda_u2415$iv.append((CharSequence)transform.invoke(Long.valueOf(element$iv)));
/* 1374 */               index$iv++;
/*      */             } 
/*      */             
/* 1377 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1379 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 326
/*      */         }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*      */          // Byte code: goto -> 325
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
/* 1393 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2415$iv = stringBuilder1; int $i$a$-buildString-LongSet$joinToString$2$iv = 0;
/* 1394 */     $this$joinToString_u24lambda_u2415$iv.append(prefix$iv);
/* 1395 */     int index$iv = 0;
/* 1396 */     LongSet this_$iv$iv = this; int $i$f$forEach = 0;
/*      */     
/* 1398 */     long[] k$iv$iv = this_$iv$iv.elements;
/*      */     
/* 1400 */     LongSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
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
/* 1414 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndex-LongSet$forEach$2$iv$iv = 0;
/* 1415 */               long element$iv = k$iv$iv[index$iv$iv]; int $i$a$-forEach-LongSet$joinToString$2$1$iv = 0;
/* 1416 */               if (index$iv == limit$iv) {
/* 1417 */                 $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
/*      */                 // Byte code: goto -> 336
/*      */               } 
/* 1420 */               if (index$iv != 0) {
/* 1421 */                 $this$joinToString_u24lambda_u2415$iv.append(separator$iv);
/*      */               }
/* 1423 */               $this$joinToString_u24lambda_u2415$iv.append((CharSequence)transform.invoke(Long.valueOf(element$iv)));
/* 1424 */               index$iv++;
/*      */             } 
/*      */             
/* 1427 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1429 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue;  // Byte code: goto -> 326
/*      */         }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*      */          // Byte code: goto -> 325
/*      */       }  }
/* 1434 */     else { $this$joinToString_u24lambda_u2415$iv.append(postfix$iv); }
/*      */     
/*      */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/*      */     return stringBuilder1.toString(); }
/*      */ 
/*      */   
/*      */   private LongSet() {}
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\LongSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */