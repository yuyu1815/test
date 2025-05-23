/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.CompositionLocalKt;
/*    */ import androidx.compose.runtime.ProvidableCompositionLocal;
/*    */ import androidx.compose.runtime.SnapshotStateKt;
/*    */ import androidx.compose.runtime.State;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.lazy.tree.TreeElementState;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000$\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\032!\020\000\032\b\022\004\022\0020\0020\001*\0020\0032\006\020\004\032\0020\005H\007¢\006\004\b\006\020\007\"\027\020\b\032\b\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"contentFor", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemColors;", "state", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeElementState;", "contentFor-e9js8XA", "(Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemColors;JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "LocalLazyTreeStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lorg/jetbrains/jewel/ui/component/styling/LazyTreeStyle;", "getLocalLazyTreeStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ui"})
/*    */ public final class LazyTreeStylingKt
/*    */ {
/*    */   @Composable
/*    */   @NotNull
/*    */   public static final State<Color> contentFor-e9js8XA(@NotNull SimpleListItemColors $this$contentFor_u2de9js8XA, long state, @Nullable Composer $composer, int $changed) {
/* 29 */     Intrinsics.checkNotNullParameter($this$contentFor_u2de9js8XA, "$this$contentFor"); $composer.startReplaceGroup(-764615145); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-764615145, $changed, -1, "org.jetbrains.jewel.ui.component.styling.contentFor (LazyTreeStyling.kt:28)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 34 */         Color.box-impl((TreeElementState.isSelected-impl(state) && TreeElementState.isFocused-impl(state)) ? $this$contentFor_u2de9js8XA.getContentSelectedFocused-0d7_KjU() : (TreeElementState.isFocused-impl(state) ? $this$contentFor_u2de9js8XA.getContentFocused-0d7_KjU() : (TreeElementState.isSelected-impl(state) ? $this$contentFor_u2de9js8XA.getContentSelected-0d7_KjU() : $this$contentFor_u2de9js8XA.getContent-0d7_KjU()))), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress()) {
/*    */       ComposerKt.traceEventEnd();
/*    */     }
/*    */     $composer.endReplaceGroup();
/*    */     return state1;
/*    */   }
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/* 69 */   private static final ProvidableCompositionLocal<LazyTreeStyle> LocalLazyTreeStyle = CompositionLocalKt.staticCompositionLocalOf(LazyTreeStylingKt::LocalLazyTreeStyle$lambda$0); @NotNull public static final ProvidableCompositionLocal<LazyTreeStyle> getLocalLazyTreeStyle() { return LocalLazyTreeStyle; } private static final LazyTreeStyle LocalLazyTreeStyle$lambda$0() {
/* 70 */     throw new IllegalStateException("No LazyTreeStyle provided. Have you forgotten the theme?".toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\LazyTreeStylingKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */