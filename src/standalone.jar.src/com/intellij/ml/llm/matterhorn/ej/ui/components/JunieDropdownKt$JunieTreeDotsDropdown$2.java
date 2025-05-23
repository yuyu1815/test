/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.ui.Outline;
/*     */ import org.jetbrains.jewel.ui.component.DropdownKt;
/*     */ import org.jetbrains.jewel.ui.component.MenuScope;
/*     */ import org.jetbrains.jewel.ui.component.styling.DropdownStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nJunieDropdown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieDropdown.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieDropdownKt$JunieTreeDotsDropdown$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,150:1\n77#2:151\n*S KotlinDebug\n*F\n+ 1 JunieDropdown.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieDropdownKt$JunieTreeDotsDropdown$2\n*L\n53#1:151\n*E\n"})
/*     */ final class JunieDropdownKt$JunieTreeDotsDropdown$2
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/*  47 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-2015031783, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.JunieTreeDotsDropdown.<anonymous> (JunieDropdown.kt:46)");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  53 */       CompositionLocal compositionLocal = (CompositionLocal)JunieDropdownKt.getLocalJunieDropdownStyle(); int $changed$iv = 6, $i$f$getCurrent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 151 */       ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); DropdownKt.Dropdown(this.$modifier, this.$enabled, this.$menuModifier, this.$outline, this.$interactionSource, (DropdownStyle)object, this.$menuContent, this.$content, $composer, 0, 0);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   JunieDropdownKt$JunieTreeDotsDropdown$2(Modifier $modifier, boolean $enabled, Modifier $menuModifier, Outline $outline, MutableInteractionSource $interactionSource, Function1<MenuScope, Unit> $menuContent, Function3<BoxScope, Composer, Integer, Unit> $content) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieDropdownKt$JunieTreeDotsDropdown$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */