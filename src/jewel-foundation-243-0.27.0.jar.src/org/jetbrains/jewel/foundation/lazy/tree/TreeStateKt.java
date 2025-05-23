/*    */ package org.jetbrains.jewel.foundation.lazy.tree;
/*    */ import androidx.compose.foundation.lazy.LazyListState;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListState;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032!\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005H\007¢\006\002\020\006¨\006\007"}, d2 = {"rememberTreeState", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "selectableLazyListState", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;", "(Landroidx/compose/foundation/lazy/LazyListState;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Landroidx/compose/runtime/Composer;II)Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;", "foundation"})
/*    */ @SourceDebugExtension({"SMAP\nTreeState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeState.kt\norg/jetbrains/jewel/foundation/lazy/tree/TreeStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,38:1\n1225#2,6:39\n*S KotlinDebug\n*F\n+ 1 TreeState.kt\norg/jetbrains/jewel/foundation/lazy/tree/TreeStateKt\n*L\n18#1:39,6\n*E\n"})
/*    */ public final class TreeStateKt {
/*    */   @Composable
/*    */   @NotNull
/*    */   public static final TreeState rememberTreeState(@Nullable LazyListState lazyListState, @Nullable SelectableLazyListState selectableLazyListState, @Nullable Composer $composer, int $changed, int paramInt1) {
/* 16 */     $composer.startReplaceGroup(-244641046); if ((paramInt1 & 0x1) != 0) lazyListState = new LazyListState(0, 0, 3, null);  if ((paramInt1 & 0x2) != 0)
/* 17 */       selectableLazyListState = new SelectableLazyListState(lazyListState);  if (ComposerKt.isTraceInProgress())
/* 18 */       ComposerKt.traceEventStart(-244641046, $changed, -1, "org.jetbrains.jewel.foundation.lazy.tree.rememberTreeState (TreeState.kt:17)");  $composer.startReplaceGroup(1681434097); Composer composer = $composer; boolean invalid$iv = false; int $i$f$cache = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 39 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 40 */     if (it$iv == Composer.Companion.getEmpty()) {
/* 41 */       int $i$a$-cache-TreeStateKt$rememberTreeState$1 = 0; Object value$iv = new TreeState(selectableLazyListState);
/* 42 */       composer.updateRememberedValue(value$iv);
/*    */     } 
/* 44 */     TreeState treeState2 = (TreeState)it$iv;
/*    */     $composer.endReplaceGroup();
/*    */     TreeState treeState1 = treeState2;
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return treeState1;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\TreeStateKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */