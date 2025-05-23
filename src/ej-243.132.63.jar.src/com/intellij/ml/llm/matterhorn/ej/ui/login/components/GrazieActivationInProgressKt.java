/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login.components;
/*    */ 
/*    */ import androidx.compose.foundation.layout.Arrangement;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.node.ComposeUiNode;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\002\032\r\020\005\032\0020\006H\001¢\006\002\020\007\"\023\020\000\032\0020\001¢\006\n\n\002\020\004\032\004\b\002\020\003¨\006\b"}, d2 = {"activationMinHeight", "Landroidx/compose/ui/unit/Dp;", "getActivationMinHeight", "()F", "F", "GrazieActivationInProgress", "", "(Landroidx/compose/runtime/Composer;I)V", "ej-ui"})
/*    */ @SourceDebugExtension({"SMAP\nGrazieActivationInProgress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieActivationInProgress.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/components/GrazieActivationInProgressKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,25:1\n149#2:26\n149#2:66\n86#3:27\n84#3,5:28\n89#3:61\n93#3:65\n79#4,6:33\n86#4,4:48\n90#4,2:58\n94#4:64\n368#5,9:39\n377#5:60\n378#5,2:62\n4034#6,6:52\n*S KotlinDebug\n*F\n+ 1 GrazieActivationInProgress.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/components/GrazieActivationInProgressKt\n*L\n19#1:26\n12#1:66\n16#1:27\n16#1:28,5\n16#1:61\n16#1:65\n16#1:33,6\n16#1:48,4\n16#1:58,2\n16#1:64\n16#1:39,9\n16#1:60\n16#1:62,2\n16#1:52,6\n*E\n"})
/*    */ public final class GrazieActivationInProgressKt {
/* 12 */   public static final float getActivationMinHeight() { return activationMinHeight; } private static final float activationMinHeight; static { int $this$dp$iv = 224, $i$f$getDp = 0; activationMinHeight = 
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
/* 66 */       Dp.constructor-impl($this$dp$iv); }
/*    */ 
/*    */   
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void GrazieActivationInProgress(@Nullable Composer $composer, int $changed) {
/*    */     $composer = $composer.startRestartGroup(1103295570);
/*    */     if ($changed != 0 || !$composer.getSkipping()) {
/*    */       if (ComposerKt.isTraceInProgress())
/*    */         ComposerKt.traceEventStart(1103295570, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.login.components.GrazieActivationInProgress (GrazieActivationInProgress.kt:14)"); 
/*    */       Modifier modifier1 = SizeKt.defaultMinSize-VpY3zN4$default((Modifier)Modifier.Companion, 0.0F, activationMinHeight, 1, null);
/*    */       int $this$dp$iv = 16, $i$f$getDp = 0;
/*    */       Arrangement.Vertical vertical = (Arrangement.Vertical)Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl($this$dp$iv));
/*    */       int $changed$iv = 54;
/*    */       int $i$f$Column = 0;
/*    */       ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/*    */       Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
/*    */       MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(vertical, horizontalAlignment$iv, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3);
/*    */       int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*    */       int $i$f$Layout = 0;
/*    */       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*    */       int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*    */       CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*    */       Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*    */       Function0 function0 = ComposeUiNode.Companion.getConstructor();
/*    */       int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6;
/*    */       int $i$f$ReusableComposeNode = 0;
/*    */       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*    */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier))
/*    */         ComposablesKt.invalidApplier(); 
/*    */       $composer.startReusableNode();
/*    */       if ($composer.getInserting()) {
/*    */         $composer.createNode(function0);
/*    */       } else {
/*    */         $composer.useNode();
/*    */       } 
/*    */       Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer);
/*    */       int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/*    */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/*    */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*    */       Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash();
/*    */       int $i$f$set-impl = 0;
/*    */       Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv;
/*    */       int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/*    */       if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/*    */         $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/*    */         $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*    */       } 
/*    */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*    */       int i = 0xE & $changed$iv$iv$iv >> 6;
/*    */       Composer $composer$iv = $composer;
/*    */       int $i$a$-Layout-ColumnKt$Column$1$iv = 0;
/*    */       ComposerKt.sourceInformationMarkerStart($composer$iv, -384784025, "C88@4444L9:Column.kt#2w3rfo");
/*    */       int j = 0x6 | 0x70 & $changed$iv >> 6;
/*    */       Composer composer1 = $composer$iv;
/*    */       ColumnScope $this$GrazieActivationInProgress_u24lambda_u240 = (ColumnScope)ColumnScopeInstance.INSTANCE;
/*    */       int $i$a$-Column-GrazieActivationInProgressKt$GrazieActivationInProgress$1 = 0;
/*    */       JunieLogoKt.Title-iJQMabo(null, 0L, composer1, 0, 3);
/*    */       JunieCircularProgressIndicatorKt.JunieCircularProgressIndicator-3IgeMak(null, 0L, null, composer1, 0, 7);
/*    */       ComposerKt.sourceInformationMarkerEnd($composer$iv);
/*    */       $composer.endNode();
/*    */       ComposerKt.sourceInformationMarkerEnd($composer);
/*    */       ComposerKt.sourceInformationMarkerEnd($composer);
/*    */       ComposerKt.sourceInformationMarkerEnd($composer);
/*    */       if (ComposerKt.isTraceInProgress())
/*    */         ComposerKt.traceEventEnd(); 
/*    */     } else {
/*    */       $composer.skipToGroupEnd();
/*    */     } 
/*    */     if ($composer.endRestartGroup() != null) {
/*    */       $composer.endRestartGroup().updateScope($changed::GrazieActivationInProgress$lambda$1);
/*    */     } else {
/*    */       $composer.endRestartGroup();
/*    */     } 
/*    */   }
/*    */   
/*    */   private static final Unit GrazieActivationInProgress$lambda$1(int $$changed, Composer $composer, int $force) {
/*    */     GrazieActivationInProgress($composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\components\GrazieActivationInProgressKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */