/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.BackgroundKt;
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*     */ import androidx.compose.foundation.shape.RoundedCornerShape;
/*     */ import androidx.compose.foundation.shape.RoundedCornerShapeKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.draw.ShadowKt;
/*     */ import androidx.compose.ui.graphics.Shape;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.foundation.Stroke;
/*     */ import org.jetbrains.jewel.foundation.modifier.BorderKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.PopupContainerColors;
/*     */ import org.jetbrains.jewel.ui.component.styling.PopupContainerStyle;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nPopupContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PopupContainer.kt\norg/jetbrains/jewel/ui/component/PopupContainerKt$PopupContainer$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,62:1\n71#2:63\n68#2,6:64\n74#2:98\n78#2:102\n79#3,6:70\n86#3,4:85\n90#3,2:95\n94#3:101\n368#4,9:76\n377#4:97\n378#4,2:99\n4034#5,6:89\n*S KotlinDebug\n*F\n+ 1 PopupContainer.kt\norg/jetbrains/jewel/ui/component/PopupContainerKt$PopupContainer$1$1\n*L\n45#1:63\n45#1:64,6\n45#1:98\n45#1:102\n45#1:70,6\n45#1:85,4\n45#1:95,2\n45#1:101\n45#1:76,9\n45#1:97\n45#1:99,2\n45#1:89,6\n*E\n"})
/*     */ final class null
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/*  42 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(850389104, $changed, -1, "org.jetbrains.jewel.ui.component.PopupContainer.<anonymous>.<anonymous> (PopupContainer.kt:41)");  PopupContainerColors colors = this.$style.getColors();
/*  43 */       RoundedCornerShape popupShape = RoundedCornerShapeKt.RoundedCornerShape(this.$style.getMetrics().getCornerSize());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  55 */       Modifier modifier1 = BackgroundKt.background-bw27NRU(BorderKt.border-QWjY48E$default(ShadowKt.shadow-s4CzXII$default(this.$modifier, this.$style.getMetrics().getShadowSize-D9Ej5fM(), (Shape)popupShape, false, colors.getShadow-0d7_KjU(), colors.getShadow-0d7_KjU(), 4, null), Stroke.Alignment.Inside, this.$style.getMetrics().getBorderWidth-D9Ej5fM(), colors.getBorder-0d7_KjU(), (Shape)popupShape, 0.0F, 16, null), colors.getBackground-0d7_KjU(), (Shape)popupShape);
/*     */ 
/*     */       
/*     */       Function2<Composer, Integer, Unit> function2 = this.$content;
/*     */ 
/*     */       
/*     */       int $changed$iv = 0, $i$f$Box = 0;
/*     */       
/*  63 */       ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/*  64 */       Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/*  65 */       boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */       
/*  68 */       MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*  69 */       int $i$f$Layout = 0;
/*  70 */       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*  71 */       int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*  72 */       CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*  73 */       Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */       
/*  75 */       Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/*  76 */       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*  77 */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/*  78 */         .startReusableNode();
/*  79 */       if ($composer.getInserting()) { $composer
/*  80 */           .createNode(function0); } else { $composer
/*     */           
/*  82 */           .useNode(); }
/*     */       
/*  84 */       Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/*  85 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/*  86 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/*  88 */       Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/*  89 */       Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/*  90 */       if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/*  91 */         $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/*  92 */         $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */       } 
/*     */       
/*  95 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */       
/*  97 */       int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/*  98 */       ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-PopupContainerKt$PopupContainer$1$1$1 = 0; function2.invoke(composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/*  99 */       $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 100 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 101 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 102 */       if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   null(PopupContainerStyle $style, Modifier $modifier, Function2<Composer, Integer, Unit> $content) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\PopupContainerKt$PopupContainer$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */