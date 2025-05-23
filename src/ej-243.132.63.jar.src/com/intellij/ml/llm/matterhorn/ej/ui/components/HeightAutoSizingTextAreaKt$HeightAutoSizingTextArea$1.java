/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.foundation.ScrollState;
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.PaddingValues;
/*     */ import androidx.compose.foundation.text.input.TextFieldDecorator;
/*     */ import androidx.compose.foundation.text.input.TextFieldState;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.platform.CompositionLocalsKt;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.foundation.theme.JewelTheme;
/*     */ import org.jetbrains.jewel.ui.component.styling.TextAreaStyle;
/*     */ import org.jetbrains.jewel.ui.theme.JewelThemeKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\0012\021\020\002\032\r\022\004\022\0020\0010\003¢\006\002\b\004H\n"}, d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;"})
/*     */ @SourceDebugExtension({"SMAP\nHeightAutoSizingTextArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightAutoSizingTextArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,306:1\n77#2:307\n*S KotlinDebug\n*F\n+ 1 HeightAutoSizingTextArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$1\n*L\n82#1:307\n*E\n"})
/*     */ final class HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$1
/*     */   implements TextFieldDecorator
/*     */ {
/*     */   HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$1(TextAreaStyle $style, ScrollState $scrollState, TextStyle $textStyle, Modifier $modifier, TextFieldState $state, Function2<Composer, Integer, Unit> $placeholder) {}
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public final void Decoration(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer $composer, int $changed) {
/*  77 */     Intrinsics.checkNotNullParameter(innerTextField, "innerTextField"); $composer.startReplaceGroup(1993299779); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1993299779, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.HeightAutoSizingTextArea.<no name provided>.Decoration (HeightAutoSizingTextArea.kt:76)");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  82 */     CompositionLocal compositionLocal = (CompositionLocal)CompositionLocalsKt.getLocalLayoutDirection(); int $changed$iv = 0, $i$f$getCurrent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 307 */     ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); Pair pair = HeightAutoSizingTextAreaKt.access$calculatePaddings(JewelThemeKt.getScrollbarStyle(JewelTheme.Companion, $composer, 6), this.$style, this.$scrollState, (LayoutDirection)object, $composer, 0); PaddingValues contentPadding = (PaddingValues)pair.component1(); float innerEndPadding = ((Dp)pair.component2()).unbox-impl(); HeightAutoSizingTextAreaKt.access$TextAreaDecorationBox-yrwZFoE((Function2)ComposableLambdaKt.rememberComposableLambda(98062701, true, new HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$1$Decoration$1(this.$scrollState, this.$style, innerEndPadding, contentPadding, innerTextField), $composer, 54), this.$textStyle, this.$modifier, ((this.$state.getText().length() == 0)) ? this.$placeholder : null, this.$style.getColors().getPlaceholder-0d7_KjU(), PaddingKt.padding-3ABfNKs(PaddingKt.padding((Modifier)Modifier.Companion, contentPadding), this.$style.getMetrics().getBorderWidth-D9Ej5fM()), $composer, 6); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$1$Decoration$1 implements Function2<Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(98062701, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.HeightAutoSizingTextArea.<no name provided>.Decoration.<anonymous> (HeightAutoSizingTextArea.kt:86)");  HeightAutoSizingTextAreaKt.access$TextAreaScrollableContainer(this.$scrollState, JewelThemeKt.getScrollbarStyle(JewelTheme.Companion, $composer, 6), PaddingKt.padding-qDBjuR0$default(PaddingKt.padding-3ABfNKs((Modifier)Modifier.Companion, this.$style.getMetrics().getBorderWidth-D9Ej5fM()), 0.0F, 0.0F, this.$innerEndPadding, 0.0F, 11, null), (Function2)ComposableLambdaKt.rememberComposableLambda(-1045344641, true, new Function2<Composer, Integer, Unit>(this.$contentPadding, this.$innerTextField) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1045344641, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.HeightAutoSizingTextArea.<no name provided>.Decoration.<anonymous>.<anonymous> (HeightAutoSizingTextArea.kt:91)");  Modifier modifier1 = PaddingKt.padding((Modifier)Modifier.Companion, this.$contentPadding); Function2<Composer, Integer, Unit> function2 = this.$innerTextField; int $changed$iv = 0, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/* 308 */                     Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/* 309 */                     boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */                     
/* 312 */                     MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 313 */                     int $i$f$Layout = 0;
/* 314 */                     ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 315 */                     int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 316 */                     CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 317 */                     Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */                     
/* 319 */                     Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 320 */                     ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 321 */                     if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 322 */                       .startReusableNode();
/* 323 */                     if ($composer.getInserting()) { $composer
/* 324 */                         .createNode(function0); } else { $composer
/*     */                         
/* 326 */                         .useNode(); }
/*     */                     
/* 328 */                     Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 329 */                     Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 330 */                     Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */                     
/* 332 */                     Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 333 */                     Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 334 */                     if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 335 */                       $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 336 */                       $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */                     } 
/*     */                     
/* 339 */                     Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */                     
/* 341 */                     int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 342 */                     ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$1$Decoration$1$1$1 = 0; function2.invoke(composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 343 */                     $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 344 */                     ComposerKt.sourceInformationMarkerEnd($composer);
/* 345 */                     ComposerKt.sourceInformationMarkerEnd($composer);
/* 346 */                     if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */                   else
/*     */                   { $composer.skipToGroupEnd(); }
/*     */                    }
/*     */                  }
/*     */               $composer, 54), $composer, 3072);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd();  }
/*     */       else
/*     */       { $composer.skipToGroupEnd(); }
/*     */        }
/*     */ 
/*     */     
/*     */     HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$1$Decoration$1(ScrollState $scrollState, TextAreaStyle $style, float $innerEndPadding, PaddingValues $contentPadding, Function2<Composer, Integer, Unit> $innerTextField) {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */