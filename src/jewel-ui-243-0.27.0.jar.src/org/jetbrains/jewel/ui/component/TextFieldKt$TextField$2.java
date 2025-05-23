/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.foundation.layout.PaddingKt;
/*    */ import androidx.compose.foundation.layout.SizeKt;
/*    */ import androidx.compose.foundation.text.input.TextFieldDecorator;
/*    */ import androidx.compose.foundation.text.input.TextFieldState;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableInferredTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.text.TextStyle;
/*    */ import androidx.compose.ui.unit.DpSize;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.jewel.ui.component.styling.TextFieldStyle;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\0012\021\020\002\032\r\022\004\022\0020\0010\003¢\006\002\b\004H\n"}, d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;"})
/*    */ final class TextFieldKt$TextField$2
/*    */   implements TextFieldDecorator
/*    */ {
/*    */   TextFieldKt$TextField$2(TextFieldStyle $style, TextStyle $textStyle, TextFieldState $state, Function2<Composer, Integer, Unit> $placeholder, Function2<Composer, Integer, Unit> $leadingIcon, Function2<Composer, Integer, Unit> $trailingIcon) {}
/*    */   
/*    */   @Composable
/*    */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*    */   public final void Decoration(Function2 innerTextField, Composer $composer, int $changed) {
/* 83 */     Intrinsics.checkNotNullParameter(innerTextField, "innerTextField"); $composer.startReplaceGroup(260656266); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(260656266, $changed, -1, "org.jetbrains.jewel.ui.component.TextField.<no name provided>.Decoration (TextField.kt:82)");  long minSize = this.$style.getMetrics().getMinSize-MYxV2XQ();
/*    */     
/* 85 */     TextFieldKt.access$TextFieldDecorationBox-hYmLsZ8(
/*    */ 
/*    */         
/* 88 */         PaddingKt.padding(SizeKt.defaultMinSize-VpY3zN4((Modifier)Modifier.Companion, DpSize.getWidth-D9Ej5fM(minSize), DpSize.getHeight-D9Ej5fM(minSize)), this.$style.getMetrics().getContentPadding()), 
/* 89 */         innerTextField, 
/* 90 */         this.$textStyle, 
/* 91 */         this.$style.getColors().getPlaceholder-0d7_KjU(), (
/* 92 */         (this.$state.getText().length() == 0)) ? this.$placeholder : null, 
/* 93 */         this.$leadingIcon, 
/* 94 */         this.$trailingIcon, $composer, 0x70 & $changed << 3, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TextFieldKt$TextField$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */