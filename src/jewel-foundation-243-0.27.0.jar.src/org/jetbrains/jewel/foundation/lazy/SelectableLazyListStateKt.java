/*     */ package org.jetbrains.jewel.foundation.lazy;
/*     */ import androidx.compose.foundation.lazy.LazyListState;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.ranges.IntRange;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000*\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\020\b\n\000\n\002\020\013\n\002\b\007\032,\020\t\032\0020\n*\0020\0022\006\020\013\032\0020\f2\006\020\r\032\0020\0162\b\b\002\020\017\032\0020\fH@¢\006\002\020\020\032!\020\021\032\0020\0072\b\b\002\020\022\032\0020\f2\b\b\002\020\023\032\0020\fH\007¢\006\002\020\024\"\033\020\000\032\0020\001*\0020\0028F¢\006\f\022\004\b\003\020\004\032\004\b\005\020\006\"\025\020\000\032\0020\001*\0020\0078F¢\006\006\032\004\b\005\020\b¨\006\025"}, d2 = {"visibleItemsRange", "Lkotlin/ranges/IntRange;", "Landroidx/compose/foundation/lazy/LazyListState;", "getVisibleItemsRange$annotations", "(Landroidx/compose/foundation/lazy/LazyListState;)V", "getVisibleItemsRange", "(Landroidx/compose/foundation/lazy/LazyListState;)Lkotlin/ranges/IntRange;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;", "(Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;)Lkotlin/ranges/IntRange;", "scrollToItem", "", "index", "", "animate", "", "scrollOffset", "(Landroidx/compose/foundation/lazy/LazyListState;IZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rememberSelectableLazyListState", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "(IILandroidx/compose/runtime/Composer;II)Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;", "foundation"})
/*     */ @SourceDebugExtension({"SMAP\nSelectableLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectableLazyListState.kt\norg/jetbrains/jewel/foundation/lazy/SelectableLazyListStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,155:1\n1225#2,6:156\n*S KotlinDebug\n*F\n+ 1 SelectableLazyListState.kt\norg/jetbrains/jewel/foundation/lazy/SelectableLazyListStateKt\n*L\n152#1:156,6\n*E\n"})
/*     */ public final class SelectableLazyListStateKt {
/*     */   @NotNull
/*     */   public static final IntRange getVisibleItemsRange(@NotNull LazyListState $this$visibleItemsRange) {
/*  17 */     Intrinsics.checkNotNullParameter($this$visibleItemsRange, "<this>"); return new IntRange($this$visibleItemsRange.getFirstVisibleItemIndex(), $this$visibleItemsRange.getFirstVisibleItemIndex() + $this$visibleItemsRange.getLayoutInfo().getVisibleItemsInfo().size());
/*     */   } @NotNull
/*     */   public static final IntRange getVisibleItemsRange(@NotNull SelectableLazyListState $this$visibleItemsRange) {
/*  20 */     Intrinsics.checkNotNullParameter($this$visibleItemsRange, "<this>"); return new IntRange($this$visibleItemsRange.getFirstVisibleItemIndex(), $this$visibleItemsRange.getFirstVisibleItemIndex() + $this$visibleItemsRange.getLayoutInfo().getVisibleItemsInfo().size());
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Object scrollToItem(LazyListState $this$scrollToItem, int index, boolean animate, int scrollOffset, Continuation $completion) {
/*  86 */     if (animate) {
/*  87 */       if ($this$scrollToItem.animateScrollToItem(index, scrollOffset, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return $this$scrollToItem.animateScrollToItem(index, scrollOffset, $completion);  $this$scrollToItem.animateScrollToItem(index, scrollOffset, $completion); return Unit.INSTANCE;
/*     */     } 
/*  89 */     if ($this$scrollToItem.scrollToItem(index, scrollOffset, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return $this$scrollToItem.scrollToItem(index, scrollOffset, $completion);  $this$scrollToItem.scrollToItem(index, scrollOffset, $completion); return Unit.INSTANCE;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final SelectableLazyListState rememberSelectableLazyListState(int firstVisibleItemIndex, int firstVisibleItemScrollOffset, @Nullable Composer $composer, int $changed, int paramInt1) {
/* 150 */     $composer.startReplaceGroup(-1296506054); if ((paramInt1 & 0x1) != 0) firstVisibleItemIndex = 0;  if ((paramInt1 & 0x2) != 0)
/* 151 */       firstVisibleItemScrollOffset = 0;  if (ComposerKt.isTraceInProgress())
/* 152 */       ComposerKt.traceEventStart(-1296506054, $changed, -1, "org.jetbrains.jewel.foundation.lazy.rememberSelectableLazyListState (SelectableLazyListState.kt:151)");  $composer.startReplaceGroup(-1194950372); Composer composer = $composer; boolean invalid$iv = false; int $i$f$cache = 0;
/*     */ 
/*     */ 
/*     */     
/* 156 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 157 */     if (it$iv == Composer.Companion.getEmpty()) {
/* 158 */       int $i$a$-cache-SelectableLazyListStateKt$rememberSelectableLazyListState$1 = 0; Object value$iv = new SelectableLazyListState(new LazyListState(firstVisibleItemIndex, firstVisibleItemScrollOffset));
/* 159 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 161 */     SelectableLazyListState selectableLazyListState2 = (SelectableLazyListState)it$iv;
/*     */     $composer.endReplaceGroup();
/*     */     SelectableLazyListState selectableLazyListState1 = selectableLazyListState2;
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return selectableLazyListState1;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\SelectableLazyListStateKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */