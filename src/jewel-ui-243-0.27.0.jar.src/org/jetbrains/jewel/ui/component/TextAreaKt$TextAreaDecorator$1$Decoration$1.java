/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.ScrollState;
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.PaddingValues;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.TextAreaStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nTextArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextArea.kt\norg/jetbrains/jewel/ui/component/TextAreaKt$TextAreaDecorator$1$Decoration$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,373:1\n71#2:374\n68#2,6:375\n74#2:409\n78#2:413\n79#3,6:381\n86#3,4:396\n90#3,2:406\n94#3:412\n368#4,9:387\n377#4:408\n378#4,2:410\n4034#5,6:400\n*S KotlinDebug\n*F\n+ 1 TextArea.kt\norg/jetbrains/jewel/ui/component/TextAreaKt$TextAreaDecorator$1$Decoration$1\n*L\n153#1:374\n153#1:375,6\n153#1:409\n153#1:413\n153#1:381,6\n153#1:396,4\n153#1:406,2\n153#1:412\n153#1:387,9\n153#1:408\n153#1:410,2\n153#1:400,6\n*E\n"})
/*     */ final class TextAreaKt$TextAreaDecorator$1$Decoration$1
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/* 145 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(524440132, $changed, -1, "org.jetbrains.jewel.ui.component.TextAreaDecorator.<no name provided>.Decoration.<anonymous> (TextArea.kt:144)");  if (this.$scrollbarStyle != null) { $composer.startReplaceGroup(-1100203360);
/* 146 */         ScrollableContainerKt.TextAreaScrollableContainer(
/* 147 */             this.$scrollState, 
/* 148 */             this.$scrollbarStyle, 
/* 149 */             PaddingKt.padding-qDBjuR0$default(PaddingKt.padding-3ABfNKs((Modifier)Modifier.Companion, this.$style.getMetrics().getBorderWidth-D9Ej5fM()), 0.0F, 0.0F, this.$innerEndPadding, 0.0F, 11, null), 
/* 150 */             (Function2<? super Composer, ? super Integer, Unit>)ComposableLambdaKt.rememberComposableLambda(2000367927, true, new Function2<Composer, Integer, Unit>(this.$contentPadding, this.$innerTextField) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(2000367927, $changed, -1, "org.jetbrains.jewel.ui.component.TextAreaDecorator.<no name provided>.Decoration.<anonymous>.<anonymous> (TextArea.kt:149)");  Modifier modifier1 = PaddingKt.padding((Modifier)Modifier.Companion, this.$contentPadding); Function2<Composer, Integer, Unit> function2 = this.$innerTextField; int $changed$iv = 0, $i$f$Box = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     
/* 374 */                     ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/* 375 */                     Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/* 376 */                     boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */                     
/* 379 */                     MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 380 */                     int $i$f$Layout = 0;
/* 381 */                     ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 382 */                     int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 383 */                     CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 384 */                     Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */                     
/* 386 */                     Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 387 */                     ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 388 */                     if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 389 */                       .startReusableNode();
/* 390 */                     if ($composer.getInserting()) { $composer
/* 391 */                         .createNode(function0); } else { $composer
/*     */                         
/* 393 */                         .useNode(); }
/*     */                     
/* 395 */                     Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 396 */                     Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 397 */                     Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */                     
/* 399 */                     Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 400 */                     Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 401 */                     if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 402 */                       $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 403 */                       $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */                     } 
/*     */                     
/* 406 */                     Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */                     
/* 408 */                     int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 409 */                     ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-TextAreaKt$TextAreaDecorator$1$Decoration$1$1$1 = 0; function2.invoke(composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 410 */                     $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 411 */                     ComposerKt.sourceInformationMarkerEnd($composer);
/* 412 */                     ComposerKt.sourceInformationMarkerEnd($composer);
/* 413 */                     if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */                   else
/*     */                   { $composer.skipToGroupEnd(); }
/*     */                    }
/*     */                  }
/*     */               $composer, 54), $composer, 3072);
/*     */         $composer.endReplaceGroup(); }
/*     */       else
/*     */       { $composer.startReplaceGroup(-1099832321);
/*     */         Modifier modifier1 = PaddingKt.padding((Modifier)Modifier.Companion, this.$contentPadding);
/*     */         Function2<Composer, Integer, Unit> function2 = this.$innerTextField;
/*     */         int $changed$iv = 0, $i$f$Box = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/*     */         Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/*     */         boolean propagateMinConstraints$iv = false;
/*     */         MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv);
/*     */         int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*     */         int $i$f$Layout = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*     */         int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*     */         CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*     */         Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */         Function0 function0 = ComposeUiNode.Companion.getConstructor();
/*     */         int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6;
/*     */         int $i$f$ReusableComposeNode = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*     */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier))
/*     */           ComposablesKt.invalidApplier(); 
/*     */         $composer.startReusableNode();
/*     */         if ($composer.getInserting()) {
/*     */           $composer.createNode(function0);
/*     */         } else {
/*     */           $composer.useNode();
/*     */         } 
/*     */         Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer);
/*     */         int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/*     */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/*     */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash();
/*     */         int $i$f$set-impl = 0;
/*     */         Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv;
/*     */         int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/*     */         if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/*     */           $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/*     */           $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */         } 
/*     */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */         int i = 0xE & $changed$iv$iv$iv >> 6;
/*     */         Composer $composer$iv = $composer;
/*     */         int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
/*     */         int j = 0x6 | 0x70 & $changed$iv >> 6;
/*     */         Composer composer1 = $composer$iv;
/*     */         BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE;
/*     */         int $i$a$-Box-TextAreaKt$TextAreaDecorator$1$Decoration$1$2 = 0;
/*     */         function2.invoke(composer1, Integer.valueOf(0));
/*     */         ComposerKt.sourceInformationMarkerEnd($composer$iv);
/*     */         $composer.endNode();
/*     */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         $composer.endReplaceGroup(); }
/*     */       
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   TextAreaKt$TextAreaDecorator$1$Decoration$1(ScrollbarStyle $scrollbarStyle, ScrollState $scrollState, TextAreaStyle $style, float $innerEndPadding, PaddingValues $contentPadding, Function2<Composer, Integer, Unit> $innerTextField) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TextAreaKt$TextAreaDecorator$1$Decoration$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */