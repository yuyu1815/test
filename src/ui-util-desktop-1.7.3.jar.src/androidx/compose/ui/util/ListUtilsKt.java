/*     */ package androidx.compose.ui.util;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.NoSuchElementException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000h\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\r\n\002\b\002\n\002\020\013\n\002\020 \n\002\b\007\n\002\020\000\n\002\b\005\n\002\020\034\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\006\n\002\020\b\n\002\b\013\n\002\020\016\n\002\b\b\n\002\020\037\n\002\b\003\n\002\020\017\n\002\b\016\0329\020\000\032\0020\001\"\004\b\000\020\002*\0060\003j\002`\0042\006\020\005\032\002H\0022\024\020\006\032\020\022\004\022\002H\002\022\004\022\0020\b\030\0010\007H\002¢\006\002\020\t\032;\020\n\032\0020\013\"\004\b\000\020\002*\b\022\004\022\002H\0020\f2\022\020\r\032\016\022\004\022\002H\002\022\004\022\0020\0130\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032;\020\016\032\0020\013\"\004\b\000\020\002*\b\022\004\022\002H\0020\f2\022\020\r\032\016\022\004\022\002H\002\022\004\022\0020\0130\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032G\020\017\032\b\022\004\022\002H\0020\f\"\004\b\000\020\002\"\004\b\001\020\020*\b\022\004\022\002H\0020\f2\022\020\021\032\016\022\004\022\002H\002\022\004\022\002H\0200\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032A\020\022\032\b\022\004\022\002H\0020\f\"\004\b\000\020\002*\b\022\004\022\002H\0020\f2\022\020\r\032\016\022\004\022\002H\002\022\004\022\0020\0130\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032\"\020\023\032\b\022\004\022\002H\0020\f\"\b\b\000\020\002*\0020\024*\n\022\006\022\004\030\001H\0020\f\032@\020\025\032\002H\002\"\004\b\000\020\002*\b\022\004\022\002H\0020\f2\022\020\r\032\016\022\004\022\002H\002\022\004\022\0020\0130\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\020\026\032B\020\027\032\004\030\001H\002\"\004\b\000\020\002*\b\022\004\022\002H\0020\f2\022\020\r\032\016\022\004\022\002H\002\022\004\022\0020\0130\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\020\026\032M\020\030\032\b\022\004\022\002H\0310\f\"\004\b\000\020\002\"\004\b\001\020\031*\b\022\004\022\002H\0020\f2\030\020\006\032\024\022\004\022\002H\002\022\n\022\b\022\004\022\002H\0310\0320\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032c\020\033\032\002H\031\"\004\b\000\020\002\"\004\b\001\020\031*\b\022\004\022\002H\0020\f2\006\020\034\032\002H\0312'\020\035\032#\022\023\022\021H\031¢\006\f\b\037\022\b\b \022\004\b\b(!\022\004\022\002H\002\022\004\022\002H\0310\036H\bø\001\000\002\b\n\006\b\001\022\002\020\002¢\006\002\020\"\032;\020#\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\f2\022\020$\032\016\022\004\022\002H\002\022\004\022\0020\0010\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032A\020%\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\f2\030\020$\032\024\022\004\022\0020&\022\004\022\002H\002\022\004\022\0020\0010\036H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032;\020'\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\f2\022\020$\032\016\022\004\022\002H\002\022\004\022\0020\0010\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032}\020(\032\002H)\"\004\b\000\020\002\"\f\b\001\020)*\0060\003j\002`\004*\b\022\004\022\002H\0020\f2\006\020*\032\002H)2\b\b\002\020+\032\0020\b2\b\b\002\020,\032\0020\b2\b\b\002\020-\032\0020\b2\b\b\002\020.\032\0020&2\b\b\002\020/\032\0020\b2\026\b\002\020\006\032\020\022\004\022\002H\002\022\004\022\0020\b\030\0010\007H\002¢\006\002\0200\032`\0201\032\00202\"\004\b\000\020\002*\b\022\004\022\002H\0020\f2\b\b\002\020+\032\0020\b2\b\b\002\020,\032\0020\b2\b\b\002\020-\032\0020\b2\b\b\002\020.\032\0020&2\b\b\002\020/\032\0020\b2\026\b\002\020\006\032\020\022\004\022\002H\002\022\004\022\0020\b\030\0010\007\032B\0203\032\004\030\001H\002\"\004\b\000\020\002*\b\022\004\022\002H\0020\f2\022\020\r\032\016\022\004\022\002H\002\022\004\022\0020\0130\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\020\026\032G\0204\032\b\022\004\022\002H\0310\f\"\004\b\000\020\002\"\004\b\001\020\031*\b\022\004\022\002H\0020\f2\022\020\006\032\016\022\004\022\002H\002\022\004\022\002H\0310\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032\\\0205\032\b\022\004\022\002H\0310\f\"\004\b\000\020\002\"\004\b\001\020\031*\b\022\004\022\002H\0020\f2'\020\006\032#\022\023\022\0210&¢\006\f\b\037\022\b\b \022\004\b\b(6\022\004\022\002H\002\022\004\022\002H\0310\036H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032^\0207\032\b\022\004\022\002H\0310\f\"\004\b\000\020\002\"\004\b\001\020\031*\b\022\004\022\002H\0020\f2)\020\006\032%\022\023\022\0210&¢\006\f\b\037\022\b\b \022\004\b\b(6\022\004\022\002H\002\022\006\022\004\030\001H\0310\036H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032I\0208\032\b\022\004\022\002H\0310\f\"\004\b\000\020\002\"\004\b\001\020\031*\b\022\004\022\002H\0020\f2\024\020\006\032\020\022\004\022\002H\002\022\006\022\004\030\001H\0310\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032`\0209\032\002H:\"\004\b\000\020\002\"\004\b\001\020\031\"\020\b\002\020:*\n\022\006\b\000\022\002H\0310;*\b\022\004\022\002H\0020\f2\006\020<\032\002H:2\022\020\006\032\016\022\004\022\002H\002\022\004\022\002H\0310\007H\bø\001\000\002\b\n\006\b\001\022\002\020\002¢\006\002\020=\032R\020>\032\004\030\001H\002\"\004\b\000\020\002\"\016\b\001\020\031*\b\022\004\022\002H\0310?*\b\022\004\022\002H\0020\f2\022\020\021\032\016\022\004\022\002H\002\022\004\022\002H\0310\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\020\026\032R\020@\032\004\030\001H\031\"\004\b\000\020\002\"\016\b\001\020\031*\b\022\004\022\002H\0310?*\b\022\004\022\002H\0020\f2\022\020\021\032\016\022\004\022\002H\002\022\004\022\002H\0310\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\020A\032R\020B\032\004\030\001H\002\"\004\b\000\020\002\"\016\b\001\020\031*\b\022\004\022\002H\0310?*\b\022\004\022\002H\0020\f2\022\020\021\032\016\022\004\022\002H\002\022\004\022\002H\0310\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\020\026\032_\020C\032\002HD\"\004\b\000\020D\"\b\b\001\020\002*\002HD*\b\022\004\022\002H\0020\f2'\020\035\032#\022\023\022\021HD¢\006\f\b\037\022\b\b \022\004\b\b(!\022\004\022\002H\002\022\004\022\002HD0\036H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\020E\032;\020F\032\0020&\"\004\b\000\020\002*\b\022\004\022\002H\0020\f2\022\020\021\032\016\022\004\022\002H\002\022\004\022\0020&0\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032\020G\032\b\022\004\022\002HH0\f\"\004\b\000\020\002\"\004\b\001\020\031\"\004\b\002\020H*\b\022\004\022\002H\0020\f2\f\020I\032\b\022\004\022\002H\0310\f26\020\006\0322\022\023\022\021H\002¢\006\f\b\037\022\b\b \022\004\b\b(J\022\023\022\021H\031¢\006\f\b\037\022\b\b \022\004\b\b(K\022\004\022\002HH0\036H\bø\001\000\002\b\n\006\b\001\022\002\020\002\032M\020L\032\b\022\004\022\002H\0310\f\"\004\b\000\020\002\"\004\b\001\020\031*\b\022\004\022\002H\0020\f2\030\020\006\032\024\022\004\022\002H\002\022\004\022\002H\002\022\004\022\002H\0310\036H\bø\001\000\002\b\n\006\b\001\022\002\020\001\002\007\n\005\b20\001¨\006M"}, d2 = {"appendElement", "", "T", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "element", "transform", "Lkotlin/Function1;", "", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "fastAll", "", "", "predicate", "fastAny", "fastDistinctBy", "K", "selector", "fastFilter", "fastFilterNotNull", "", "fastFirst", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "fastFirstOrNull", "fastFlatMap", "R", "", "fastFold", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "fastForEach", "action", "fastForEachIndexed", "", "fastForEachReversed", "fastJoinTo", "A", "buffer", "separator", "prefix", "postfix", "limit", "truncated", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "fastJoinToString", "", "fastLastOrNull", "fastMap", "fastMapIndexed", "index", "fastMapIndexedNotNull", "fastMapNotNull", "fastMapTo", "C", "", "destination", "(Ljava/util/List;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "fastMaxBy", "", "fastMaxOfOrNull", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Comparable;", "fastMinByOrNull", "fastReduce", "S", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "fastSumBy", "fastZip", "V", "other", "a", "b", "fastZipWithNext", "ui-util"})
/*     */ @SourceDebugExtension({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,595:1\n33#1,6:596\n33#1,6:602\n33#1,6:608\n33#1,6:614\n33#1,6:620\n33#1,6:626\n33#1,6:632\n33#1,6:638\n69#1,6:644\n69#1,4:650\n74#1:655\n33#1,6:656\n33#1,6:662\n33#1,6:668\n33#1,6:674\n33#1,6:680\n1#2:654\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n87#1:596,6\n102#1:602,6\n117#1:608,6\n134#1:614,6\n153#1:620,6\n201#1:626,6\n237#1:632,6\n258#1:638,6\n279#1:644,6\n300#1:650,4\n300#1:655\n418#1:656,6\n464#1:662,6\n510#1:668,6\n526#1:674,6\n545#1:680,6\n*E\n"})
/*     */ public final class ListUtilsKt
/*     */ {
/*     */   public static final <T> void fastForEach(@NotNull List $this$fastForEach, @NotNull Function1 action) {
/*  33 */     Intrinsics.checkNotNullParameter($this$fastForEach, "<this>"); Intrinsics.checkNotNullParameter(action, "action"); int $i$f$fastForEach = 0;
/*  34 */     for (int index = 0, i = $this$fastForEach.size(); index < i; index++) {
/*  35 */       Object item = $this$fastForEach.get(index);
/*  36 */       action.invoke(item);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final <T> void fastForEachReversed(@NotNull List $this$fastForEachReversed, @NotNull Function1 action) {
/*  51 */     Intrinsics.checkNotNullParameter($this$fastForEachReversed, "<this>"); Intrinsics.checkNotNullParameter(action, "action"); int $i$f$fastForEachReversed = 0;
/*  52 */     int i = $this$fastForEachReversed.size() + -1; if (0 <= i) do { int index = i; i--;
/*  53 */         Object item = $this$fastForEachReversed.get(index);
/*  54 */         action.invoke(item); }
/*     */       while (0 <= i);
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final <T> void fastForEachIndexed(@NotNull List $this$fastForEachIndexed, @NotNull Function2 action) {
/*  69 */     Intrinsics.checkNotNullParameter($this$fastForEachIndexed, "<this>"); Intrinsics.checkNotNullParameter(action, "action"); int $i$f$fastForEachIndexed = 0;
/*  70 */     for (int index = 0, i = $this$fastForEachIndexed.size(); index < i; index++) {
/*  71 */       Object item = $this$fastForEachIndexed.get(index);
/*  72 */       action.invoke(Integer.valueOf(index), item);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final <T> boolean fastAll(@NotNull List $this$fastAll, @NotNull Function1 predicate)
/*     */   {
/*  86 */     Intrinsics.checkNotNullParameter($this$fastAll, "<this>"); Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$fastAll = 0;
/*  87 */     List $this$fastForEach$iv = $this$fastAll; int $i$f$fastForEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 597 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 598 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 599 */       Object it = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastAll$2 = 0; if (!((Boolean)predicate.invoke(it)).booleanValue())
/*     */         return false; 
/*     */     }  return true; } public static final <T> boolean fastAny(@NotNull List $this$fastAny, @NotNull Function1 predicate) { Intrinsics.checkNotNullParameter($this$fastAny, "<this>"); Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$fastAny = 0; List $this$fastForEach$iv = $this$fastAny;
/*     */     int $i$f$fastForEach = 0;
/* 603 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 604 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 605 */       Object it = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastAny$2 = 0; if (((Boolean)predicate.invoke(it)).booleanValue())
/*     */         return true; 
/*     */     }  return false; } @Nullable public static final <T> T fastFirstOrNull(@NotNull List $this$fastFirstOrNull, @NotNull Function1 predicate) { Intrinsics.checkNotNullParameter($this$fastFirstOrNull, "<this>"); Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$fastFirstOrNull = 0; List $this$fastForEach$iv = $this$fastFirstOrNull;
/*     */     int $i$f$fastForEach = 0;
/* 609 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 610 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 611 */       Object it = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2 = 0; if (((Boolean)predicate.invoke(it)).booleanValue())
/*     */         return (T)it; 
/*     */     }  return null; } public static final <T> int fastSumBy(@NotNull List $this$fastSumBy, @NotNull Function1 selector) { Intrinsics.checkNotNullParameter($this$fastSumBy, "<this>"); Intrinsics.checkNotNullParameter(selector, "selector"); int $i$f$fastSumBy = 0; int sum = 0; List $this$fastForEach$iv = $this$fastSumBy;
/*     */     int $i$f$fastForEach = 0;
/* 615 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 616 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 617 */       Object element = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastSumBy$2 = 0; sum += ((Number)selector.invoke(element)).intValue();
/*     */     }  return sum; } @NotNull public static final <T, R> List<R> fastMap(@NotNull List $this$fastMap, @NotNull Function1 transform) { Intrinsics.checkNotNullParameter($this$fastMap, "<this>"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$fastMap = 0; ArrayList<Object> target = new ArrayList($this$fastMap.size());
/*     */     List $this$fastForEach$iv = $this$fastMap;
/*     */     int $i$f$fastForEach = 0;
/* 621 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i)
/* 622 */     { Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 623 */       Object it = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastMap$2 = 0; target.add(transform.invoke(it)); }  return target; } @Nullable public static final <T, R extends Comparable<? super R>> T fastMaxBy(@NotNull List $this$fastMaxBy, @NotNull Function1 selector) { Intrinsics.checkNotNullParameter($this$fastMaxBy, "<this>"); Intrinsics.checkNotNullParameter(selector, "selector"); int $i$f$fastMaxBy = 0; if ($this$fastMaxBy.isEmpty())
/*     */       return null;  Object maxElem = $this$fastMaxBy.get(0); Comparable<Comparable> maxValue = (Comparable)selector.invoke(maxElem); int i = 1, j = CollectionsKt.getLastIndex($this$fastMaxBy); if (i <= j)
/*     */       while (true) { Object e = $this$fastMaxBy.get(i); Comparable<Comparable> v = (Comparable)selector.invoke(e); if (maxValue.compareTo(v) < 0) { maxElem = e; maxValue = v; }  if (i != j) { i++; continue; }  break; }
/*     */         return (T)maxElem; }
/* 627 */   @NotNull public static final <T, R, C extends Collection<? super R>> C fastMapTo(@NotNull List $this$fastMapTo, @NotNull Collection<Object> destination, @NotNull Function1 transform) { Intrinsics.checkNotNullParameter($this$fastMapTo, "<this>"); Intrinsics.checkNotNullParameter(destination, "destination"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$fastMapTo = 0; List $this$fastForEach$iv = $this$fastMapTo; int $i$f$fastForEach = 0; int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i)
/* 628 */     { Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 629 */       Object item = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastMapTo$2 = 0; destination.add(transform.invoke(item)); }  return (C)destination; } @Nullable public static final <T> T fastLastOrNull(@NotNull List $this$fastLastOrNull, @NotNull Function1 predicate) { Intrinsics.checkNotNullParameter($this$fastLastOrNull, "<this>"); Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$fastLastOrNull = 0; int i = $this$fastLastOrNull.size() + -1; if (0 <= i)
/*     */       do { int index = i; i--; Object item = $this$fastLastOrNull.get(index); if (((Boolean)predicate.invoke(item)).booleanValue())
/*     */           return (T)item;  }
/*     */       while (0 <= i);  return null; }
/* 633 */   @NotNull public static final <T> List<T> fastFilter(@NotNull List $this$fastFilter, @NotNull Function1 predicate) { Intrinsics.checkNotNullParameter($this$fastFilter, "<this>"); Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$fastFilter = 0; ArrayList<Object> target = new ArrayList($this$fastFilter.size()); List $this$fastForEach$iv = $this$fastFilter; int $i$f$fastForEach = 0; int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 634 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 635 */       Object it = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastFilter$2 = 0; if (((Boolean)predicate.invoke(it)).booleanValue())
/*     */         target.add(it); 
/*     */     }  return target; } public static final <T, R> R fastFold(@NotNull List $this$fastFold, Object initial, @NotNull Function2 operation) { Intrinsics.checkNotNullParameter($this$fastFold, "<this>"); Intrinsics.checkNotNullParameter(operation, "operation"); int $i$f$fastFold = 0; Object accumulator = null; accumulator = initial; List $this$fastForEach$iv = $this$fastFold;
/*     */     int $i$f$fastForEach = 0;
/* 639 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 640 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 641 */       Object e = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastFold$2 = 0; accumulator = operation.invoke(accumulator, e);
/*     */     }  return (R)accumulator; } @NotNull public static final <T, R> List<R> fastMapIndexed(@NotNull List $this$fastMapIndexed, @NotNull Function2 transform) { Intrinsics.checkNotNullParameter($this$fastMapIndexed, "<this>"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$fastMapIndexed = 0; ArrayList<Object> target = new ArrayList($this$fastMapIndexed.size());
/*     */     List $this$fastForEachIndexed$iv = $this$fastMapIndexed;
/*     */     int $i$f$fastForEachIndexed = 0;
/* 645 */     int index$iv = 0, i = $this$fastForEachIndexed$iv.size(); if (index$iv < i)
/* 646 */     { Object item$iv = $this$fastForEachIndexed$iv.get(index$iv);
/* 647 */       Object object1 = item$iv; int index = index$iv, $i$a$-fastForEachIndexed-ListUtilsKt$fastMapIndexed$2 = 0; target.add(transform.invoke(Integer.valueOf(index), object1)); }  return target; }
/*     */   @Nullable public static final <T, R extends Comparable<? super R>> R fastMaxOfOrNull(@NotNull List $this$fastMaxOfOrNull, @NotNull Function1 selector) { Intrinsics.checkNotNullParameter($this$fastMaxOfOrNull, "<this>"); Intrinsics.checkNotNullParameter(selector, "selector"); int $i$f$fastMaxOfOrNull = 0; if ($this$fastMaxOfOrNull.isEmpty()) return null;  Comparable<Comparable> maxValue = (Comparable)selector.invoke($this$fastMaxOfOrNull.get(0)); int i = 1, j = CollectionsKt.getLastIndex($this$fastMaxOfOrNull); if (i <= j) while (true) { Comparable<Comparable> v = (Comparable)selector.invoke($this$fastMaxOfOrNull.get(i)); if (v.compareTo(maxValue) > 0)
/*     */           maxValue = v;  if (i != j) { i++; continue; }  break; }   return (R)maxValue; }
/*     */   @NotNull public static final <T, R> List<R> fastZipWithNext(@NotNull List $this$fastZipWithNext, @NotNull Function2 transform) { Intrinsics.checkNotNullParameter($this$fastZipWithNext, "<this>"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$fastZipWithNext = 0; if ($this$fastZipWithNext.size() == 0 || $this$fastZipWithNext.size() == 1)
/* 651 */       return CollectionsKt.emptyList();  List<Object> result = new ArrayList(); Object current = $this$fastZipWithNext.get(0); for (int i = 0, j = CollectionsKt.getLastIndex($this$fastZipWithNext); i < j; i++) { Object next = $this$fastZipWithNext.get(i + 1); result.add(transform.invoke(current, next)); current = next; }  return (List)result; } @NotNull public static final <T, R> List<R> fastMapIndexedNotNull(@NotNull List $this$fastMapIndexedNotNull, @NotNull Function2 transform) { Intrinsics.checkNotNullParameter($this$fastMapIndexedNotNull, "<this>"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$fastMapIndexedNotNull = 0; ArrayList<Object> target = new ArrayList($this$fastMapIndexedNotNull.size()); List $this$fastForEachIndexed$iv = $this$fastMapIndexedNotNull; int $i$f$fastForEachIndexed = 0; int index$iv = 0, i = $this$fastForEachIndexed$iv.size(); if (index$iv < i)
/* 652 */     { Object item$iv = $this$fastForEachIndexed$iv.get(index$iv);
/* 653 */       Object object1 = item$iv; int index = index$iv, $i$a$-fastForEachIndexed-ListUtilsKt$fastMapIndexedNotNull$2 = 0; Object it = transform.invoke(Integer.valueOf(index), object1);
/* 654 */       int $i$a$-let-ListUtilsKt$fastMapIndexedNotNull$2$1 = 0; target.add(it); transform.invoke(Integer.valueOf(index), object1); }  return target; }
/*     */   public static final <S, T extends S> S fastReduce(@NotNull List $this$fastReduce, @NotNull Function2 operation) { Intrinsics.checkNotNullParameter($this$fastReduce, "<this>"); Intrinsics.checkNotNullParameter(operation, "operation"); int $i$f$fastReduce = 0; if ($this$fastReduce.isEmpty()) throw new UnsupportedOperationException("Empty collection can't be reduced.");  Object accumulator = CollectionsKt.first($this$fastReduce); int i = 1, j = CollectionsKt.getLastIndex($this$fastReduce); if (i <= j) while (true) { accumulator = operation.invoke(accumulator, $this$fastReduce.get(i)); if (i != j) { i++; continue; }  break; }   return (S)accumulator; }
/*     */   @NotNull public static final <T, R, V> List<V> fastZip(@NotNull List $this$fastZip, @NotNull List other, @NotNull Function2 transform) { Intrinsics.checkNotNullParameter($this$fastZip, "<this>"); Intrinsics.checkNotNullParameter(other, "other"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$fastZip = 0; int minSize = Math.min($this$fastZip.size(), other.size()); ArrayList<Object> target = new ArrayList(minSize); for (int i = 0; i < minSize; i++)
/* 657 */       target.add(transform.invoke($this$fastZip.get(i), other.get(i)));  return target; } @NotNull public static final <T, R> List<R> fastMapNotNull(@NotNull List $this$fastMapNotNull, @NotNull Function1 transform) { Intrinsics.checkNotNullParameter($this$fastMapNotNull, "<this>"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$fastMapNotNull = 0; ArrayList<Object> target = new ArrayList($this$fastMapNotNull.size()); List $this$fastForEach$iv = $this$fastMapNotNull; int $i$f$fastForEach = 0; int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 658 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 659 */       Object e = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastMapNotNull$2 = 0; Object it = transform.invoke(e); int $i$a$-let-ListUtilsKt$fastMapNotNull$2$1 = 0; target.add(it); transform.invoke(e);
/*     */     }  return target; } @NotNull public static final <T> String fastJoinToString(@NotNull List<?> $this$fastJoinToString, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @Nullable Function1<?, ? extends CharSequence> transform) { Intrinsics.checkNotNullParameter($this$fastJoinToString, "<this>"); Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(truncated, "truncated"); Intrinsics.checkNotNullExpressionValue(((StringBuilder)fastJoinTo($this$fastJoinToString, new StringBuilder(), separator, prefix, postfix, limit, truncated, transform)).toString(), "toString(...)"); return ((StringBuilder)fastJoinTo($this$fastJoinToString, new StringBuilder(), separator, prefix, postfix, limit, truncated, transform)).toString(); }
/*     */   @NotNull public static final <T, K> List<T> fastDistinctBy(@NotNull List $this$fastDistinctBy, @NotNull Function1 selector) { Intrinsics.checkNotNullParameter($this$fastDistinctBy, "<this>"); Intrinsics.checkNotNullParameter(selector, "selector"); int $i$f$fastDistinctBy = 0; HashSet set = new HashSet($this$fastDistinctBy.size()); ArrayList<T> target = new ArrayList($this$fastDistinctBy.size()); List $this$fastForEach$iv = $this$fastDistinctBy;
/*     */     int $i$f$fastForEach = 0;
/* 663 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i)
/* 664 */     { Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 665 */       Object e = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastDistinctBy$2 = 0; Object key = selector.invoke(e); }  return target; } @Nullable public static final <T, R extends Comparable<? super R>> T fastMinByOrNull(@NotNull List $this$fastMinByOrNull, @NotNull Function1 selector) { Intrinsics.checkNotNullParameter($this$fastMinByOrNull, "<this>"); Intrinsics.checkNotNullParameter(selector, "selector"); int $i$f$fastMinByOrNull = 0; if ($this$fastMinByOrNull.isEmpty())
/*     */       return null;  Object minElem = $this$fastMinByOrNull.get(0); Comparable<Comparable> minValue = (Comparable)selector.invoke(minElem); int i = 1, j = CollectionsKt.getLastIndex($this$fastMinByOrNull); if (i <= j)
/*     */       while (true) { Object e = $this$fastMinByOrNull.get(i); Comparable<Comparable> v = (Comparable)selector.invoke(e); if (minValue.compareTo(v) > 0) { minElem = e; minValue = v; }  if (i != j) { i++; continue; }  break; }
/*     */         return (T)minElem; }
/* 669 */   @NotNull public static final <T, R> List<R> fastFlatMap(@NotNull List $this$fastFlatMap, @NotNull Function1 transform) { Intrinsics.checkNotNullParameter($this$fastFlatMap, "<this>"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$fastFlatMap = 0; ArrayList<R> target = new ArrayList($this$fastFlatMap.size()); List $this$fastForEach$iv = $this$fastFlatMap; int $i$f$fastForEach = 0; int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 670 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 671 */       Object e = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastFlatMap$2 = 0; Iterable list = (Iterable)transform.invoke(e); CollectionsKt.addAll(target, list);
/*     */     }  return target; } @NotNull public static final <T> List<T> fastFilterNotNull(@NotNull List $this$fastFilterNotNull) { Intrinsics.checkNotNullParameter($this$fastFilterNotNull, "<this>"); ArrayList<Object> target = new ArrayList($this$fastFilterNotNull.size());
/*     */     List $this$fastForEach$iv = $this$fastFilterNotNull;
/*     */     int $i$f$fastForEach = 0;
/* 675 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 676 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 677 */       Object it = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastFilterNotNull$1 = 0; if (it != null)
/*     */         target.add(it); 
/*     */     }  return target; } public static final <T> T fastFirst(@NotNull List $this$fastFirst, @NotNull Function1 predicate) { Intrinsics.checkNotNullParameter($this$fastFirst, "<this>"); Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$fastFirst = 0; List $this$fastForEach$iv = $this$fastFirst;
/*     */     int $i$f$fastForEach = 0;
/* 681 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 682 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 683 */       Object it = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastFirst$2 = 0;
/*     */       if (((Boolean)predicate.invoke(it)).booleanValue())
/*     */         return (T)it; 
/*     */     } 
/*     */     throw new NoSuchElementException("Collection contains no element matching the predicate."); }
/*     */ 
/*     */   
/*     */   private static final <T, A extends Appendable> A fastJoinTo(List $this$fastJoinTo, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1<? super Object, ? extends CharSequence> transform) {
/*     */     buffer.append(prefix);
/*     */     int count = 0;
/*     */     for (int index = 0, i = $this$fastJoinTo.size(); index < i; ) {
/*     */       Object element = $this$fastJoinTo.get(index);
/*     */       if (++count > 1)
/*     */         buffer.append(separator); 
/*     */       if (limit < 0 || count <= limit) {
/*     */         appendElement(buffer, element, transform);
/*     */         index++;
/*     */       } 
/*     */     } 
/*     */     if (limit >= 0 && count > limit)
/*     */       buffer.append(truncated); 
/*     */     buffer.append(postfix);
/*     */     return (A)buffer;
/*     */   }
/*     */   
/*     */   private static final <T> void appendElement(Appendable $this$appendElement, Object element, Function1 transform) {
/*     */     if (transform != null) {
/*     */       $this$appendElement.append((CharSequence)transform.invoke(element));
/*     */     } else if ((element == null) ? true : (element instanceof CharSequence)) {
/*     */       $this$appendElement.append((CharSequence)element);
/*     */     } else if (element instanceof Character) {
/*     */       $this$appendElement.append(((Character)element).charValue());
/*     */     } else {
/*     */       $this$appendElement.append(String.valueOf(element));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-util-desktop-1.7.3.jar!\androidx\compos\\u\\util\ListUtilsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */