/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalKt;
/*     */ import androidx.compose.runtime.ProvidedValue;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
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
/*     */ 
/*     */ 
/*     */ 
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
/*     */ final class null
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/* 128 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(278338803, $changed, -1, "org.jetbrains.jewel.ui.component.PopupMenu.<anonymous>.<anonymous> (Menu.kt:127)");  ProvidedValue[] arrayOfProvidedValue = new ProvidedValue[2]; arrayOfProvidedValue[0] = MenuManagerKt.getLocalMenuManager().provides(this.$menuManager); arrayOfProvidedValue[1] = MenuStylingKt.getLocalMenuStyle().provides(this.$style); CompositionLocalKt.CompositionLocalProvider(arrayOfProvidedValue, (Function2)ComposableLambdaKt.rememberComposableLambda(2024047027, true, new Function2<Composer, Integer, Unit>(this.$modifier, this.$content) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/* 129 */               public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(2024047027, $changed, -1, "org.jetbrains.jewel.ui.component.PopupMenu.<anonymous>.<anonymous>.<anonymous> (Menu.kt:128)");  MenuKt.MenuContent(this.$modifier, null, this.$content, $composer, 0, 2); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } }$composer, 54), $composer, 0x30 | ProvidedValue.$stable); if (ComposerKt.isTraceInProgress())
/* 130 */         ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   null(MenuManager $menuManager, MenuStyle $style, Modifier $modifier, Function1<MenuScope, Unit> $content) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\MenuKt$PopupMenu$4$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */