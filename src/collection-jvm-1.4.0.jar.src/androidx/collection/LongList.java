/*      */ package androidx.collection;
/*      */ 
/*      */ import androidx.annotation.IntRange;
/*      */ import java.util.NoSuchElementException;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.PublishedApi;
/*      */ import kotlin.jvm.JvmField;
/*      */ import kotlin.jvm.JvmOverloads;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.functions.Function3;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.ranges.IntRange;
/*      */ import kotlin.ranges.RangesKt;
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
/*      */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000d\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\020\026\n\002\b\002\n\002\030\002\n\002\b\b\n\002\020\013\n\000\n\002\030\002\n\002\020\t\n\002\030\002\n\002\b\021\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\f\n\002\020\016\n\000\n\002\020\r\n\002\b\n\n\002\030\002\n\000\b6\030\0002\0020\001B\017\b\004\022\006\020\002\032\0020\003¢\006\002\020\004J\006\020\024\032\0020\025J:\020\024\032\0020\0252!\020\026\032\035\022\023\022\0210\030¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\004\022\0020\0250\027H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\021\020\034\032\0020\0252\006\020\033\032\0020\030H\002J\016\020\035\032\0020\0252\006\020\036\032\0020\000J\006\020\037\032\0020\003J:\020\037\032\0020\0032!\020\026\032\035\022\023\022\0210\030¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\004\022\0020\0250\027H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\020\020 \032\0020\0302\b\b\001\020!\032\0020\003J9\020\"\032\0020\0302\b\b\001\020!\032\0020\0032!\020#\032\035\022\023\022\0210\003¢\006\f\b\031\022\b\b\032\022\004\b\b(!\022\004\022\0020\0300\027H\bø\001\000J\023\020$\032\0020\0252\b\020%\032\004\030\0010\001H\002J\006\020&\032\0020\030J:\020&\032\0020\0302!\020\026\032\035\022\023\022\0210\030¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\004\022\0020\0250\027H\bø\001\000\002\b\n\006\b\001\022\002\020\001Jb\020'\032\002H(\"\004\b\000\020(2\006\020)\032\002H(26\020*\0322\022\023\022\021H(¢\006\f\b\031\022\b\b\032\022\004\b\b(,\022\023\022\0210\030¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\004\022\002H(0+H\bø\001\000\002\b\n\006\b\001\022\002\020\002¢\006\002\020-Jw\020.\032\002H(\"\004\b\000\020(2\006\020)\032\002H(2K\020*\032G\022\023\022\0210\003¢\006\f\b\031\022\b\b\032\022\004\b\b(!\022\023\022\021H(¢\006\f\b\031\022\b\b\032\022\004\b\b(,\022\023\022\0210\030¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\004\022\002H(0/H\bø\001\000\002\b\n\006\b\001\022\002\020\002¢\006\002\0200Jb\0201\032\002H(\"\004\b\000\020(2\006\020)\032\002H(26\020*\0322\022\023\022\0210\030¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\023\022\021H(¢\006\f\b\031\022\b\b\032\022\004\b\b(,\022\004\022\002H(0+H\bø\001\000\002\b\n\006\b\001\022\002\020\002¢\006\002\020-Jw\0202\032\002H(\"\004\b\000\020(2\006\020)\032\002H(2K\020*\032G\022\023\022\0210\003¢\006\f\b\031\022\b\b\032\022\004\b\b(!\022\023\022\0210\030¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\023\022\021H(¢\006\f\b\031\022\b\b\032\022\004\b\b(,\022\004\022\002H(0/H\bø\001\000\002\b\n\006\b\001\022\002\020\002¢\006\002\0200J:\0203\032\002042!\0205\032\035\022\023\022\0210\030¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\004\022\002040\027H\bø\001\000\002\b\n\006\b\001\022\002\020\001JO\0206\032\0020426\0205\0322\022\023\022\0210\003¢\006\f\b\031\022\b\b\032\022\004\b\b(!\022\023\022\0210\030¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\004\022\002040+H\bø\001\000\002\b\n\006\b\001\022\002\020\001J:\0207\032\002042!\0205\032\035\022\023\022\0210\030¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\004\022\002040\027H\bø\001\000\002\b\n\006\b\001\022\002\020\001JO\0208\032\0020426\0205\0322\022\023\022\0210\003¢\006\f\b\031\022\b\b\032\022\004\b\b(!\022\023\022\0210\030¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\004\022\002040+H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\023\0209\032\0020\0302\b\b\001\020!\032\0020\003H\002J\b\020:\032\0020\003H\026J\016\020;\032\0020\0032\006\020\033\032\0020\030J:\020<\032\0020\0032!\020\026\032\035\022\023\022\0210\030¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\004\022\0020\0250\027H\bø\001\000\002\b\n\006\b\001\022\002\020\001J:\020=\032\0020\0032!\020\026\032\035\022\023\022\0210\030¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\004\022\0020\0250\027H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\006\020>\032\0020\025J\006\020?\032\0020\025J:\020@\032\0020A2\b\b\002\020B\032\0020C2\b\b\002\020D\032\0020C2\b\b\002\020E\032\0020C2\b\b\002\020F\032\0020\0032\b\b\002\020G\032\0020CH\007JT\020@\032\0020A2\b\b\002\020B\032\0020C2\b\b\002\020D\032\0020C2\b\b\002\020E\032\0020C2\b\b\002\020F\032\0020\0032\b\b\002\020G\032\0020C2\024\b\004\020H\032\016\022\004\022\0020\030\022\004\022\0020C0\027H\bø\001\000J\006\020I\032\0020\030J:\020I\032\0020\0302!\020\026\032\035\022\023\022\0210\030¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\004\022\0020\0250\027H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\016\020J\032\0020\0032\006\020\033\032\0020\030J\006\020K\032\0020\025J:\020L\032\0020\0252!\020\026\032\035\022\023\022\0210\030¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\004\022\0020\0250\027H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\b\020M\032\0020AH\026R\030\020\005\032\0020\0038\000@\000X\016¢\006\b\n\000\022\004\b\006\020\007R\030\020\b\032\0020\t8\000@\000X\016¢\006\b\n\000\022\004\b\n\020\007R\022\020\013\032\0020\f8Æ\002¢\006\006\032\004\b\r\020\016R\022\020\017\032\0020\0038Ç\002¢\006\006\032\004\b\020\020\021R\021\020\022\032\0020\0038G¢\006\006\032\004\b\023\020\021\001\001N\002\007\n\005\b20\001¨\006O"}, d2 = {"Landroidx/collection/LongList;", "", "initialCapacity", "", "(I)V", "_size", "get_size$annotations", "()V", "content", "", "getContent$annotations", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "()I", "size", "getSize", "any", "", "predicate", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "element", "contains", "containsAll", "elements", "count", "elementAt", "index", "elementAtOrElse", "defaultValue", "equals", "other", "first", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "acc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "", "block", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "hashCode", "indexOf", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "last", "lastIndexOf", "none", "reversedAny", "toString", "Landroidx/collection/MutableLongList;", "collection"})
/*      */ @SourceDebugExtension({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/LongList\n*L\n1#1,969:1\n253#1,6:970\n279#1,6:976\n253#1,6:982\n75#1:988\n253#1,6:989\n253#1,6:995\n253#1,6:1001\n266#1,6:1007\n279#1,6:1013\n293#1,6:1019\n70#1:1025\n70#1:1026\n266#1,6:1027\n266#1,6:1033\n293#1,6:1039\n70#1:1045\n279#1,6:1046\n293#1,6:1052\n266#1,6:1058\n266#1,6:1064\n253#1,6:1070\n75#1:1076\n467#1,10:1077\n266#1,4:1087\n477#1,9:1091\n271#1:1100\n486#1,2:1101\n467#1,10:1103\n266#1,4:1113\n477#1,9:1117\n271#1:1126\n486#1,2:1127\n467#1,10:1129\n266#1,4:1139\n477#1,9:1143\n271#1:1152\n486#1,2:1153\n467#1,10:1155\n266#1,4:1165\n477#1,9:1169\n271#1:1178\n486#1,2:1179\n467#1,10:1181\n266#1,4:1191\n477#1,9:1195\n271#1:1204\n486#1,2:1205\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/LongList\n*L\n96#1:970,6\n110#1:976,6\n122#1:982,6\n135#1:988\n153#1:989,6\n175#1:995,6\n192#1:1001,6\n208#1:1007,6\n225#1:1013,6\n241#1:1019,6\n306#1:1025\n317#1:1026\n343#1:1027,6\n357#1:1033,6\n371#1:1039,6\n397#1:1045\n407#1:1046,6\n420#1:1052,6\n445#1:1058,6\n476#1:1064,6\n494#1:1070,6\n510#1:1076\n-1#1:1077,10\n-1#1:1087,4\n-1#1:1091,9\n-1#1:1100\n-1#1:1101,2\n-1#1:1103,10\n-1#1:1113,4\n-1#1:1117,9\n-1#1:1126\n-1#1:1127,2\n-1#1:1129,10\n-1#1:1139,4\n-1#1:1143,9\n-1#1:1152\n-1#1:1153,2\n-1#1:1155,10\n-1#1:1165,4\n-1#1:1169,9\n-1#1:1178\n-1#1:1179,2\n-1#1:1181,10\n-1#1:1191,4\n-1#1:1195,9\n-1#1:1204\n-1#1:1205,2\n*E\n"})
/*      */ public abstract class LongList
/*      */ {
/*      */   @JvmField
/*      */   @NotNull
/*      */   public long[] content;
/*      */   @JvmField
/*      */   public int _size;
/*      */   
/*      */   private LongList(int initialCapacity) {
/*   48 */     this.content = (initialCapacity == 0) ? 
/*   49 */       LongSetKt.getEmptyLongArray() : 
/*      */       
/*   51 */       new long[initialCapacity];
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
/*      */   @IntRange(from = 0L)
/*      */   public final int getSize() {
/*   64 */     return this._size;
/*      */   }
/*      */ 
/*      */   
/*      */   @IntRange(from = -1L)
/*      */   public final int getLastIndex() {
/*   70 */     int $i$f$getLastIndex = 0; return this._size - 1;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final IntRange getIndices() {
/*   75 */     int $i$f$getIndices = 0; return RangesKt.until(0, this._size);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean none() {
/*   81 */     return isEmpty();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean any() {
/*   88 */     return isNotEmpty();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean any(@NotNull Function1 predicate)
/*      */   {
/*   95 */     Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$any = 0;
/*   96 */     LongList this_$iv = this; int $i$f$forEach = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  971 */     long[] content$iv = this_$iv.content;
/*  972 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/*  973 */       long it = content$iv[i$iv]; int $i$a$-forEach-LongList$any$2 = 0; if (((Boolean)predicate.invoke(Long.valueOf(it))).booleanValue())
/*      */         return true; 
/*      */     }  return false; } public final boolean reversedAny(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$reversedAny = 0; LongList this_$iv = this;
/*      */     int $i$f$forEachReversed = 0;
/*  977 */     long[] content$iv = this_$iv.content;
/*  978 */     int i$iv = this_$iv._size - 1; if (-1 < i$iv) {
/*  979 */       long it = content$iv[i$iv]; int $i$a$-forEachReversed-LongList$reversedAny$2 = 0; if (((Boolean)predicate.invoke(Long.valueOf(it))).booleanValue())
/*      */         return true; 
/*      */     }  return false; } public final boolean contains(long element) { LongList this_$iv = this;
/*      */     int $i$f$forEach = 0;
/*  983 */     long[] content$iv = this_$iv.content;
/*  984 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/*  985 */       long it = content$iv[i$iv]; int $i$a$-forEach-LongList$contains$1 = 0; if (it == element)
/*      */         return true; 
/*      */     }  return false; } public final boolean containsAll(@NotNull LongList elements) { Intrinsics.checkNotNullParameter(elements, "elements"); LongList this_$iv = elements; int $i$f$getIndices = 0;
/*  988 */     IntRange intRange = RangesKt.until(0, this_$iv._size); int i = intRange.getFirst(); $i$f$getIndices = intRange.getLast(); if (i <= $i$f$getIndices) while (true) { if (!contains(elements.get(i)))
/*      */           return false;  if (i != $i$f$getIndices) { i++; continue; }  break; }   return true; } public final int count() { return this._size; }
/*  990 */   public final int count(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$count = 0; int count = 0; LongList this_$iv = this; int $i$f$forEach = 0; long[] content$iv = this_$iv.content;
/*  991 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/*  992 */       long it = content$iv[i$iv]; int $i$a$-forEach-LongList$count$2 = 0; if (((Boolean)predicate.invoke(Long.valueOf(it))).booleanValue())
/*      */         count++; 
/*      */     }  return count; } public final long first() { if (isEmpty())
/*      */       throw new NoSuchElementException("LongList is empty.");  return this.content[0]; }
/*  996 */   public final long first(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$first = 0; LongList this_$iv = this; int $i$f$forEach = 0; long[] content$iv = this_$iv.content;
/*  997 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/*  998 */       long item = content$iv[i$iv]; int $i$a$-forEach-LongList$first$2 = 0; if (((Boolean)predicate.invoke(Long.valueOf(item))).booleanValue())
/*      */         return item; 
/*      */     }  throw new NoSuchElementException("LongList contains no element matching the predicate."); } public final <R> R fold(Object initial, @NotNull Function2 operation) { Intrinsics.checkNotNullParameter(operation, "operation"); int $i$f$fold = 0; Object acc = null; acc = initial; LongList this_$iv = this;
/*      */     int $i$f$forEach = 0;
/* 1002 */     long[] content$iv = this_$iv.content;
/* 1003 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1004 */       long item = content$iv[i$iv]; int $i$a$-forEach-LongList$fold$2 = 0; acc = operation.invoke(acc, Long.valueOf(item));
/*      */     }  return (R)acc; } public final <R> R foldIndexed(Object initial, @NotNull Function3 operation) { Intrinsics.checkNotNullParameter(operation, "operation"); int $i$f$foldIndexed = 0; Object acc = null; acc = initial;
/*      */     LongList this_$iv = this;
/*      */     int $i$f$forEachIndexed = 0;
/* 1008 */     long[] content$iv = this_$iv.content;
/* 1009 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1010 */       long l = content$iv[i$iv]; int j = i$iv, $i$a$-forEachIndexed-LongList$foldIndexed$2 = 0; acc = operation.invoke(Integer.valueOf(j), acc, Long.valueOf(l));
/*      */     }  return (R)acc; } public final <R> R foldRight(Object initial, @NotNull Function2 operation) { Intrinsics.checkNotNullParameter(operation, "operation"); int $i$f$foldRight = 0; Object acc = null; acc = initial;
/*      */     LongList this_$iv = this;
/*      */     int $i$f$forEachReversed = 0;
/* 1014 */     long[] content$iv = this_$iv.content;
/* 1015 */     int i$iv = this_$iv._size - 1; if (-1 < i$iv) {
/* 1016 */       long item = content$iv[i$iv]; int $i$a$-forEachReversed-LongList$foldRight$2 = 0; acc = operation.invoke(Long.valueOf(item), acc);
/*      */     }  return (R)acc; } public final <R> R foldRightIndexed(Object initial, @NotNull Function3 operation) { Intrinsics.checkNotNullParameter(operation, "operation"); int $i$f$foldRightIndexed = 0; Object acc = null; acc = initial;
/*      */     LongList this_$iv = this;
/*      */     int $i$f$forEachReversedIndexed = 0;
/* 1020 */     long[] content$iv = this_$iv.content;
/* 1021 */     int i$iv = this_$iv._size - 1; if (-1 < i$iv)
/* 1022 */     { long l = content$iv[i$iv]; int i = i$iv, $i$a$-forEachReversedIndexed-LongList$foldRightIndexed$2 = 0; acc = operation.invoke(Integer.valueOf(i), Long.valueOf(l), acc); }  return (R)acc; }
/*      */   public final void forEach(@NotNull Function1 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEach = 0; long[] content = this.content; for (int i = 0, j = this._size; i < j; i++) block.invoke(Long.valueOf(content[i]));  }
/*      */   public final void forEachIndexed(@NotNull Function2 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachIndexed = 0; long[] content = this.content; for (int i = 0, j = this._size; i < j; i++)
/* 1025 */       block.invoke(Integer.valueOf(i), Long.valueOf(content[i]));  } public final long get(@IntRange(from = 0L) int index) { if (!((0 <= index) ? ((index < this._size) ? 1 : 0) : 0)) { LongList this_$iv = this; int $i$f$getLastIndex = 0; throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + (this_$iv._size - 1)); }  return this.content[index]; }
/* 1026 */   public final void forEachReversed(@NotNull Function1 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachReversed = 0; long[] content = this.content; for (int i = this._size - 1; -1 < i; i--) block.invoke(Long.valueOf(content[i]));  } public final void forEachReversedIndexed(@NotNull Function2 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachReversedIndexed = 0; long[] content = this.content; for (int i = this._size - 1; -1 < i; i--) block.invoke(Integer.valueOf(i), Long.valueOf(content[i]));  } public final long elementAt(@IntRange(from = 0L) int index) { if (!((0 <= index) ? ((index < this._size) ? 1 : 0) : 0)) { LongList this_$iv = this; int $i$f$getLastIndex = 0; throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + (this_$iv._size - 1)); }  return this.content[index]; } public final long elementAtOrElse(@IntRange(from = 0L) int index, @NotNull Function1 defaultValue) { Intrinsics.checkNotNullParameter(defaultValue, "defaultValue"); int $i$f$elementAtOrElse = 0; if (!((0 <= index) ? ((index < this._size) ? 1 : 0) : 0))
/*      */       return ((Number)defaultValue.invoke(Integer.valueOf(index))).longValue();  return this.content[index]; }
/* 1028 */   public final int indexOf(long element) { LongList this_$iv = this; int $i$f$forEachIndexed = 0; long[] content$iv = this_$iv.content;
/* 1029 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1030 */       long l = content$iv[i$iv]; int j = i$iv, $i$a$-forEachIndexed-LongList$indexOf$1 = 0; if (element == l)
/*      */         return j; 
/*      */     }  return -1; } public final int indexOfFirst(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$indexOfFirst = 0; LongList this_$iv = this;
/*      */     int $i$f$forEachIndexed = 0;
/* 1034 */     long[] content$iv = this_$iv.content;
/* 1035 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1036 */       long l = content$iv[i$iv]; int j = i$iv, $i$a$-forEachIndexed-LongList$indexOfFirst$2 = 0; if (((Boolean)predicate.invoke(Long.valueOf(l))).booleanValue())
/*      */         return j; 
/*      */     }  return -1; } public final int indexOfLast(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$indexOfLast = 0; LongList this_$iv = this;
/*      */     int $i$f$forEachReversedIndexed = 0;
/* 1040 */     long[] content$iv = this_$iv.content;
/* 1041 */     int i$iv = this_$iv._size - 1; if (-1 < i$iv)
/* 1042 */     { long l = content$iv[i$iv]; int i = i$iv, $i$a$-forEachReversedIndexed-LongList$indexOfLast$2 = 0; if (((Boolean)predicate.invoke(Long.valueOf(l))).booleanValue()) return i;  }  return -1; } public final boolean isEmpty() { return (this._size == 0); }
/*      */   public final boolean isNotEmpty() { return (this._size != 0); }
/*      */   public final long last() { if (isEmpty())
/* 1045 */       throw new NoSuchElementException("LongList is empty.");  LongList this_$iv = this; int $i$f$getLastIndex = 0; return this.content[this_$iv._size - 1]; } public final long last(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$last = 0; LongList this_$iv = this;
/*      */     int $i$f$forEachReversed = 0;
/* 1047 */     long[] content$iv = this_$iv.content;
/* 1048 */     int i$iv = this_$iv._size - 1; if (-1 < i$iv) {
/* 1049 */       long item = content$iv[i$iv]; int $i$a$-forEachReversed-LongList$last$2 = 0; if (((Boolean)predicate.invoke(Long.valueOf(item))).booleanValue())
/*      */         return item; 
/*      */     }  throw new NoSuchElementException("LongList contains no element matching the predicate."); } public final int lastIndexOf(long element) { LongList this_$iv = this;
/*      */     int $i$f$forEachReversedIndexed = 0;
/* 1053 */     long[] content$iv = this_$iv.content;
/* 1054 */     int i$iv = this_$iv._size - 1; if (-1 < i$iv) {
/* 1055 */       long l = content$iv[i$iv]; int i = i$iv, $i$a$-forEachReversedIndexed-LongList$lastIndexOf$1 = 0; if (l == element)
/*      */         return i; 
/*      */     }  return -1; } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(truncated, "truncated"); StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2430 = stringBuilder1; int $i$a$-buildString-LongList$joinToString$1 = 0; $this$joinToString_u24lambda_u2430.append(prefix); LongList this_$iv = this;
/*      */     int $i$f$forEachIndexed = 0;
/* 1059 */     long[] content$iv = this_$iv.content;
/* 1060 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i); $this$joinToString_u24lambda_u2430.append(postfix); Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()"); return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @NotNull Function1 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(truncated, "truncated"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0; StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2432 = stringBuilder1;
/*      */     int $i$a$-buildString-LongList$joinToString$2 = 0;
/*      */     $this$joinToString_u24lambda_u2432.append(prefix);
/*      */     LongList this_$iv = this;
/*      */     int $i$f$forEachIndexed = 0;
/* 1065 */     long[] content$iv = this_$iv.content;
/* 1066 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i); $this$joinToString_u24lambda_u2432.append(postfix);
/*      */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/*      */     return stringBuilder1.toString(); } public int hashCode() { int hashCode = 0;
/*      */     LongList this_$iv = this;
/*      */     int $i$f$forEach = 0;
/* 1071 */     long[] content$iv = this_$iv.content;
/* 1072 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1073 */       long element = content$iv[i$iv]; int $i$a$-forEach-LongList$hashCode$1 = 0; hashCode += 31 * Long.hashCode(element);
/*      */     }  return hashCode; } public boolean equals(@Nullable Object other) { if (!(other instanceof LongList) || ((LongList)other)._size != this._size)
/*      */       return false;  long[] content = this.content; long[] otherContent = ((LongList)other).content; LongList this_$iv = this; int $i$f$getIndices = 0;
/* 1076 */     IntRange intRange = RangesKt.until(0, this_$iv._size); int i = intRange.getFirst(); $i$f$getIndices = intRange.getLast(); if (i <= $i$f$getIndices) while (true) { if (content[i] != otherContent[i]) return false;  if (i != $i$f$getIndices) { i++; continue; }  break; }   return true; } @NotNull public String toString() { return joinToString$default(this, null, "[", "]", 0, null, 25, null); }
/* 1077 */   @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull Function1 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1082 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1084 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2432$iv = stringBuilder1; int $i$a$-buildString-LongList$joinToString$2$iv = 0;
/* 1085 */     $this$joinToString_u24lambda_u2432$iv.append(prefix);
/* 1086 */     LongList this_$iv$iv = this; int $i$f$forEachIndexed = 0;
/*      */     
/* 1088 */     long[] content$iv$iv = this_$iv$iv.content;
/* 1089 */     int i$iv$iv = 0, j = this_$iv$iv._size; if (i$iv$iv < j) {
/* 1090 */       long l = content$iv$iv[i$iv$iv]; int index$iv = i$iv$iv, $i$a$-forEachIndexed-LongList$joinToString$2$1$iv = 0;
/* 1091 */       if (index$iv == limit) {
/* 1092 */         $this$joinToString_u24lambda_u2432$iv.append(truncated$iv);
/*      */       } else {
/*      */         
/* 1095 */         if (index$iv != 0) {
/* 1096 */           $this$joinToString_u24lambda_u2432$iv.append(separator);
/*      */         }
/* 1098 */         $this$joinToString_u24lambda_u2432$iv.append((CharSequence)transform.invoke(Long.valueOf(l)));
/*      */       } 
/*      */     } else {
/* 1101 */       $this$joinToString_u24lambda_u2432$iv.append(postfix);
/*      */     }  Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/* 1103 */     return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, @NotNull Function1 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/*      */ 
/*      */ 
/*      */     
/* 1107 */     int limit$iv = -1;
/* 1108 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1110 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2432$iv = stringBuilder1; int $i$a$-buildString-LongList$joinToString$2$iv = 0;
/* 1111 */     $this$joinToString_u24lambda_u2432$iv.append(prefix);
/* 1112 */     LongList this_$iv$iv = this; int $i$f$forEachIndexed = 0;
/*      */     
/* 1114 */     long[] content$iv$iv = this_$iv$iv.content;
/* 1115 */     int i$iv$iv = 0, j = this_$iv$iv._size; if (i$iv$iv < j) {
/* 1116 */       long l = content$iv$iv[i$iv$iv]; int index$iv = i$iv$iv, $i$a$-forEachIndexed-LongList$joinToString$2$1$iv = 0;
/* 1117 */       if (index$iv == limit$iv) {
/* 1118 */         $this$joinToString_u24lambda_u2432$iv.append(truncated$iv);
/*      */       } else {
/*      */         
/* 1121 */         if (index$iv != 0) {
/* 1122 */           $this$joinToString_u24lambda_u2432$iv.append(separator);
/*      */         }
/* 1124 */         $this$joinToString_u24lambda_u2432$iv.append((CharSequence)transform.invoke(Long.valueOf(l)));
/*      */       } 
/*      */     } else {
/* 1127 */       $this$joinToString_u24lambda_u2432$iv.append(postfix);
/*      */     }  Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/* 1129 */     return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull Function1 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/*      */ 
/*      */     
/* 1132 */     CharSequence postfix$iv = "";
/* 1133 */     int limit$iv = -1;
/* 1134 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1136 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2432$iv = stringBuilder1; int $i$a$-buildString-LongList$joinToString$2$iv = 0;
/* 1137 */     $this$joinToString_u24lambda_u2432$iv.append(prefix);
/* 1138 */     LongList this_$iv$iv = this; int $i$f$forEachIndexed = 0;
/*      */     
/* 1140 */     long[] content$iv$iv = this_$iv$iv.content;
/* 1141 */     int i$iv$iv = 0, j = this_$iv$iv._size; if (i$iv$iv < j) {
/* 1142 */       long l = content$iv$iv[i$iv$iv]; int index$iv = i$iv$iv, $i$a$-forEachIndexed-LongList$joinToString$2$1$iv = 0;
/* 1143 */       if (index$iv == limit$iv) {
/* 1144 */         $this$joinToString_u24lambda_u2432$iv.append(truncated$iv);
/*      */       } else {
/*      */         
/* 1147 */         if (index$iv != 0) {
/* 1148 */           $this$joinToString_u24lambda_u2432$iv.append(separator);
/*      */         }
/* 1150 */         $this$joinToString_u24lambda_u2432$iv.append((CharSequence)transform.invoke(Long.valueOf(l)));
/*      */       } 
/*      */     } else {
/* 1153 */       $this$joinToString_u24lambda_u2432$iv.append(postfix$iv);
/*      */     }  Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/* 1155 */     return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull CharSequence separator, @NotNull Function1 transform) { Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/*      */     
/* 1157 */     CharSequence prefix$iv = "";
/* 1158 */     CharSequence postfix$iv = "";
/* 1159 */     int limit$iv = -1;
/* 1160 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1162 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2432$iv = stringBuilder1; int $i$a$-buildString-LongList$joinToString$2$iv = 0;
/* 1163 */     $this$joinToString_u24lambda_u2432$iv.append(prefix$iv);
/* 1164 */     LongList this_$iv$iv = this; int $i$f$forEachIndexed = 0;
/*      */     
/* 1166 */     long[] content$iv$iv = this_$iv$iv.content;
/* 1167 */     int i$iv$iv = 0, j = this_$iv$iv._size; if (i$iv$iv < j) {
/* 1168 */       long l = content$iv$iv[i$iv$iv]; int index$iv = i$iv$iv, $i$a$-forEachIndexed-LongList$joinToString$2$1$iv = 0;
/* 1169 */       if (index$iv == limit$iv) {
/* 1170 */         $this$joinToString_u24lambda_u2432$iv.append(truncated$iv);
/*      */       } else {
/*      */         
/* 1173 */         if (index$iv != 0) {
/* 1174 */           $this$joinToString_u24lambda_u2432$iv.append(separator);
/*      */         }
/* 1176 */         $this$joinToString_u24lambda_u2432$iv.append((CharSequence)transform.invoke(Long.valueOf(l)));
/*      */       } 
/*      */     } else {
/* 1179 */       $this$joinToString_u24lambda_u2432$iv.append(postfix$iv);
/*      */     }  Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/* 1181 */     return stringBuilder1.toString(); } @JvmOverloads @NotNull public final String joinToString(@NotNull Function1 transform) { Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$joinToString = 0;
/* 1182 */     CharSequence separator$iv = ", ";
/* 1183 */     CharSequence prefix$iv = "";
/* 1184 */     CharSequence postfix$iv = "";
/* 1185 */     int limit$iv = -1;
/* 1186 */     CharSequence truncated$iv = "...";
/*      */     int i = 0;
/* 1188 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$joinToString_u24lambda_u2432$iv = stringBuilder1; int $i$a$-buildString-LongList$joinToString$2$iv = 0;
/* 1189 */     $this$joinToString_u24lambda_u2432$iv.append(prefix$iv);
/* 1190 */     LongList this_$iv$iv = this; int $i$f$forEachIndexed = 0;
/*      */     
/* 1192 */     long[] content$iv$iv = this_$iv$iv.content;
/* 1193 */     int i$iv$iv = 0, j = this_$iv$iv._size; if (i$iv$iv < j) {
/* 1194 */       long l = content$iv$iv[i$iv$iv]; int index$iv = i$iv$iv, $i$a$-forEachIndexed-LongList$joinToString$2$1$iv = 0;
/* 1195 */       if (index$iv == limit$iv) {
/* 1196 */         $this$joinToString_u24lambda_u2432$iv.append(truncated$iv);
/*      */       } else {
/*      */         
/* 1199 */         if (index$iv != 0) {
/* 1200 */           $this$joinToString_u24lambda_u2432$iv.append(separator$iv);
/*      */         }
/* 1202 */         $this$joinToString_u24lambda_u2432$iv.append((CharSequence)transform.invoke(Long.valueOf(l)));
/*      */       } 
/*      */     } else {
/* 1205 */       $this$joinToString_u24lambda_u2432$iv.append(postfix$iv);
/*      */     } 
/*      */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/*      */     return stringBuilder1.toString(); }
/*      */ 
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\LongList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */