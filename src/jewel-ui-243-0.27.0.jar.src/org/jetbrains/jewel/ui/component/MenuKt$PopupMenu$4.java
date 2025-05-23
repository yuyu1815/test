/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import androidx.compose.runtime.CompositionLocalKt;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.ProvidedValue;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.focus.FocusManager;
/*     */ import androidx.compose.ui.input.InputModeManager;
/*     */ import androidx.compose.ui.platform.CompositionLocalsKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.foundation.theme.JewelThemeKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.MenuStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.MenuStylingKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\norg/jetbrains/jewel/ui/component/MenuKt$PopupMenu$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,706:1\n77#2:707\n77#2:708\n*S KotlinDebug\n*F\n+ 1 Menu.kt\norg/jetbrains/jewel/ui/component/MenuKt$PopupMenu$4\n*L\n124#1:707\n125#1:708\n*E\n"})
/*     */ final class MenuKt$PopupMenu$4
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/* 124 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1986748224, $changed, -1, "org.jetbrains.jewel.ui.component.PopupMenu.<anonymous> (Menu.kt:123)");  CompositionLocal compositionLocal1 = (CompositionLocal)CompositionLocalsKt.getLocalFocusManager(); int $changed$iv = 0, $i$f$getCurrent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 707 */       ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal1); ComposerKt.sourceInformationMarkerEnd($composer); MenuKt.access$PopupMenu$lambda$2(this.$focusManager$delegate, (FocusManager)object); CompositionLocal this_$iv = (CompositionLocal)CompositionLocalsKt.getLocalInputModeManager(); $changed$iv = 0; $i$f$getCurrent = 0;
/* 708 */       ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); object = $composer.consume(this_$iv); ComposerKt.sourceInformationMarkerEnd($composer); MenuKt.access$PopupMenu$lambda$5(this.$inputModeManager$delegate, (InputModeManager)object);
/*     */       JewelThemeKt.OverrideDarkMode(this.$style.isDark(), (Function2)ComposableLambdaKt.rememberComposableLambda(278338803, true, new Function2<Composer, Integer, Unit>(this.$menuManager, this.$style, this.$modifier, this.$content) {
/*     */               @Composable
/*     */               @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */               public final void invoke(Composer $composer, int $changed) {
/*     */                 if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */                   if (ComposerKt.isTraceInProgress())
/*     */                     ComposerKt.traceEventStart(278338803, $changed, -1, "org.jetbrains.jewel.ui.component.PopupMenu.<anonymous>.<anonymous> (Menu.kt:127)"); 
/*     */                   ProvidedValue[] arrayOfProvidedValue = new ProvidedValue[2];
/*     */                   arrayOfProvidedValue[0] = MenuManagerKt.getLocalMenuManager().provides(this.$menuManager);
/*     */                   arrayOfProvidedValue[1] = MenuStylingKt.getLocalMenuStyle().provides(this.$style);
/*     */                   CompositionLocalKt.CompositionLocalProvider(arrayOfProvidedValue, (Function2)ComposableLambdaKt.rememberComposableLambda(2024047027, true, new Function2<Composer, Integer, Unit>(this.$modifier, this.$content) {
/*     */                           @Composable
/*     */                           @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */                           public final void invoke(Composer $composer, int $changed) {
/*     */                             if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */                               if (ComposerKt.isTraceInProgress())
/*     */                                 ComposerKt.traceEventStart(2024047027, $changed, -1, "org.jetbrains.jewel.ui.component.PopupMenu.<anonymous>.<anonymous>.<anonymous> (Menu.kt:128)"); 
/*     */                               MenuKt.MenuContent(this.$modifier, null, this.$content, $composer, 0, 2);
/*     */                               if (ComposerKt.isTraceInProgress())
/*     */                                 ComposerKt.traceEventEnd(); 
/*     */                             } else {
/*     */                               $composer.skipToGroupEnd();
/*     */                             } 
/*     */                           }
/*     */                         }$composer, 54), $composer, 0x30 | ProvidedValue.$stable);
/*     */                   if (ComposerKt.isTraceInProgress())
/*     */                     ComposerKt.traceEventEnd(); 
/*     */                 } else {
/*     */                   $composer.skipToGroupEnd();
/*     */                 } 
/*     */               }
/*     */             }$composer, 54), $composer, 48);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   MenuKt$PopupMenu$4(MenuStyle $style, MutableState<FocusManager> $focusManager$delegate, MutableState<InputModeManager> $inputModeManager$delegate, MenuManager $menuManager, Modifier $modifier, Function1<MenuScope, Unit> $content) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\MenuKt$PopupMenu$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */