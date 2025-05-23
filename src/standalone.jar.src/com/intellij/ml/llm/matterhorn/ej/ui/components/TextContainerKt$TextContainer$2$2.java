/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ 
/*    */ import androidx.compose.animation.AnimatedVisibilityScope;
/*    */ import androidx.compose.foundation.ClickableKt;
/*    */ import androidx.compose.foundation.layout.PaddingKt;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.CompositionLocal;
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.semantics.Role;
/*    */ import androidx.compose.ui.text.font.FontFamily;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.jewel.ui.component.TextKt;
/*    */ import org.jetbrains.jewel.ui.component.styling.LinkStyle;
/*    */ import org.jetbrains.jewel.ui.component.styling.LinkStylingKt;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nTextContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextContainer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/TextContainerKt$TextContainer$2$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,60:1\n77#2:61\n149#3:62\n1225#4,6:63\n*S KotlinDebug\n*F\n+ 1 TextContainer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/TextContainerKt$TextContainer$2$2\n*L\n51#1:61\n54#1:62\n55#1:63,6\n*E\n"})
/*    */ final class TextContainerKt$TextContainer$2$2
/*    */   implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
/* 48 */     Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "$this$AnimatedVisibility"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-538592296, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.TextContainer.<anonymous>.<anonymous> (TextContainer.kt:47)"); 
/* 49 */     String str1 = TextContainerKt.access$TextContainer$lambda$8$lambda$5(this.$expanded$delegate) ? "Click to collapse" : "Click to expand";
/* 50 */     FontFamily fontFamily = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getMessageFont($composer, 0);
/* 51 */     CompositionLocal compositionLocal = (CompositionLocal)LinkStylingKt.getLocalLinkStyle(); int $changed$iv = 0, $i$f$getCurrent = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 61 */     ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object1 = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); long l = ((LinkStyle)object1).getColors().getContent-0d7_KjU(); int $this$dp$iv = 6, $i$f$getDp = 0; $composer.startReplaceGroup(332243911); Composer composer = $composer; boolean bool1 = false; MutableState<Boolean> mutableState = this.$expanded$delegate;
/*    */     int $i$f$cache = 0;
/* 63 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*    */     
/* 65 */     Role role = null; String str2 = null; boolean bool2 = false; Modifier modifier2 = PaddingKt.padding-VpY3zN4$default((Modifier)Modifier.Companion, 0.0F, Dp.constructor-impl($this$dp$iv), 1, null); int $i$a$-cache-TextContainerKt$TextContainer$2$2$1 = 0; Function0 function02 = mutableState::invoke$lambda$1$lambda$0; Object value$iv = function02;
/* 66 */     composer.updateRememberedValue(value$iv);
/* 67 */     Function0 function01 = (it$iv == Composer.Companion.getEmpty()) ? (Function0)value$iv : 
/* 68 */       (Function0)it$iv;
/*    */     $composer.endReplaceGroup();
/*    */     Modifier modifier1 = ClickableKt.clickable-XHw0xAI$default(modifier2, bool2, str2, role, function01, 7, null);
/*    */     TextKt.Text-bAzTDeA(str1, modifier1, l, 0L, null, null, fontFamily, 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65464);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */   }
/*    */   
/*    */   private static final Unit invoke$lambda$1$lambda$0(MutableState $expanded$delegate) {
/*    */     TextContainerKt.access$TextContainer$lambda$8$lambda$6($expanded$delegate, !TextContainerKt.access$TextContainer$lambda$8$lambda$5($expanded$delegate));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   TextContainerKt$TextContainer$2$2(MutableState<Boolean> $expanded$delegate) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\TextContainerKt$TextContainer$2$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */