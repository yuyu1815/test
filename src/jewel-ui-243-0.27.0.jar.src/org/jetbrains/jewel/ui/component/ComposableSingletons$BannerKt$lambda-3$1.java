/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import org.jetbrains.jewel.ui.icon.IconKey;
/*    */ import org.jetbrains.jewel.ui.icons.AllIconsKeys;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ final class ComposableSingletons$BannerKt$lambda-3$1
/*    */   implements Function2<Composer, Integer, Unit>
/*    */ {
/*    */   public static final ComposableSingletons$BannerKt$lambda-3$1 INSTANCE = new ComposableSingletons$BannerKt$lambda-3$1();
/*    */   
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(Composer $composer, int $changed) {
/* 53 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-689213096, $changed, -1, "org.jetbrains.jewel.ui.component.ComposableSingletons$BannerKt.lambda-3.<anonymous> (Banner.kt:52)");  IconKt.Icon-FHprtrg((IconKey)AllIconsKeys.General.INSTANCE.getBalloonWarning(), (String)null, (Modifier)null, (Class<?>)null, 0L, new org.jetbrains.jewel.ui.painter.PainterHint[0], $composer, 48, 28); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ComposableSingletons$BannerKt$lambda-3$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */