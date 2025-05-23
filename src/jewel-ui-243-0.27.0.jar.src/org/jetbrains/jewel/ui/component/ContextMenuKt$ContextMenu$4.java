/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.CompositionLocal;
/*    */ import androidx.compose.runtime.CompositionLocalKt;
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.runtime.ProvidedValue;
/*    */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.focus.FocusManager;
/*    */ import androidx.compose.ui.input.InputModeManager;
/*    */ import androidx.compose.ui.platform.CompositionLocalsKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nContextMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.kt\norg/jetbrains/jewel/ui/component/ContextMenuKt$ContextMenu$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,96:1\n77#2:97\n77#2:98\n*S KotlinDebug\n*F\n+ 1 ContextMenu.kt\norg/jetbrains/jewel/ui/component/ContextMenuKt$ContextMenu$4\n*L\n67#1:97\n68#1:98\n*E\n"})
/*    */ final class ContextMenuKt$ContextMenu$4
/*    */   implements Function2<Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(Composer $composer, int $changed) {
/* 67 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(694698659, $changed, -1, "org.jetbrains.jewel.ui.component.ContextMenu.<anonymous> (ContextMenu.kt:66)");  CompositionLocal compositionLocal1 = (CompositionLocal)CompositionLocalsKt.getLocalFocusManager(); int $changed$iv = 0, $i$f$getCurrent = 0;
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
/* 97 */       ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal1); ComposerKt.sourceInformationMarkerEnd($composer); ContextMenuKt.access$ContextMenu$lambda$1(this.$focusManager$delegate, (FocusManager)object); CompositionLocal this_$iv = (CompositionLocal)CompositionLocalsKt.getLocalInputModeManager(); $changed$iv = 0; $i$f$getCurrent = 0;
/* 98 */       ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); object = $composer.consume(this_$iv); ComposerKt.sourceInformationMarkerEnd($composer); ContextMenuKt.access$ContextMenu$lambda$3(this.$inputModeManager$delegate, (InputModeManager)object);
/*    */       CompositionLocalKt.CompositionLocalProvider(MenuManagerKt.getLocalMenuManager().provides(this.$menuManager), (Function2)ComposableLambdaKt.rememberComposableLambda(423315299, true, new Function2<Composer, Integer, Unit>(this.$modifier, this.$content) {
/*    */               @Composable
/*    */               @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */               public final void invoke(Composer $composer, int $changed) {
/*    */                 if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*    */                   if (ComposerKt.isTraceInProgress())
/*    */                     ComposerKt.traceEventStart(423315299, $changed, -1, "org.jetbrains.jewel.ui.component.ContextMenu.<anonymous>.<anonymous> (ContextMenu.kt:70)"); 
/*    */                   MenuKt.MenuContent(this.$modifier, null, this.$content, $composer, 0, 2);
/*    */                   if (ComposerKt.isTraceInProgress())
/*    */                     ComposerKt.traceEventEnd(); 
/*    */                 } else {
/*    */                   $composer.skipToGroupEnd();
/*    */                 } 
/*    */               }
/*    */             }$composer, 54), $composer, 0x30 | ProvidedValue.$stable);
/*    */       if (ComposerKt.isTraceInProgress())
/*    */         ComposerKt.traceEventEnd();  }
/*    */     else
/*    */     { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   ContextMenuKt$ContextMenu$4(MenuManager $menuManager, MutableState<FocusManager> $focusManager$delegate, MutableState<InputModeManager> $inputModeManager$delegate, Modifier $modifier, Function1<MenuScope, Unit> $content) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ContextMenuKt$ContextMenu$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */