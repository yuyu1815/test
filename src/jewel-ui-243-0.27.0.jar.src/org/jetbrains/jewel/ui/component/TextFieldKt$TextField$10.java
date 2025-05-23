/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import androidx.compose.ui.text.input.TextFieldValue;
/*     */ import androidx.compose.ui.unit.DpSize;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.jewel.ui.component.styling.TextFieldStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ final class TextFieldKt$TextField$10
/*     */   implements Function4<Function2<? super Composer, ? super Integer, ? extends Unit>, InputFieldState, Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public final void invoke-NUF0VRY(Function2 innerTextField, long paramLong, Composer $composer, int $changed) {
/* 201 */     Intrinsics.checkNotNullParameter(innerTextField, "innerTextField"); int $dirty = $changed; if (($changed & 0x6) == 0) $dirty |= $composer.changedInstance(innerTextField) ? 4 : 2;  if (($dirty & 0x83) != 130 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1772625491, $dirty, -1, "org.jetbrains.jewel.ui.component.TextField.<anonymous> (TextField.kt:200)");  long minSize = this.$style.getMetrics().getMinSize-MYxV2XQ();
/*     */       
/* 203 */       TextFieldKt.access$TextFieldDecorationBox-hYmLsZ8(
/*     */ 
/*     */           
/* 206 */           PaddingKt.padding(SizeKt.defaultMinSize-VpY3zN4((Modifier)Modifier.Companion, DpSize.getWidth-D9Ej5fM(minSize), DpSize.getHeight-D9Ej5fM(minSize)), this.$style.getMetrics().getContentPadding()), 
/* 207 */           innerTextField, 
/* 208 */           this.$textStyle, 
/* 209 */           this.$style.getColors().getPlaceholder-0d7_KjU(), (
/* 210 */           (((CharSequence)this.$value.getText()).length() == 0)) ? this.$placeholder : null, 
/* 211 */           this.$leadingIcon, 
/* 212 */           this.$trailingIcon, $composer, 0x70 & $dirty << 3, 0); if (ComposerKt.isTraceInProgress())
/* 213 */         ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   TextFieldKt$TextField$10(TextFieldStyle $style, TextStyle $textStyle, TextFieldValue $value, Function2<Composer, Integer, Unit> $placeholder, Function2<Composer, Integer, Unit> $leadingIcon, Function2<Composer, Integer, Unit> $trailingIcon) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TextFieldKt$TextField$10.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */