/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.debug;
/*     */ 
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.ColumnKt;
/*     */ import androidx.compose.foundation.layout.ColumnScope;
/*     */ import androidx.compose.foundation.layout.ColumnScopeInstance;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.foundation.layout.SpacerKt;
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
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.TextUnitKt;
/*     */ import com.intellij.ml.llm.matterhorn.AfterArtifactBuildingFinished;
/*     */ import com.intellij.ml.llm.matterhorn.BeforeArtifactBuildingStarted;
/*     */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ActionRequestBuildingFailed;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ActionRequestBuildingFinished;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ActionRequestBuildingStarted;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentActionExecutionFailed;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentActionExecutionFinished;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentActionExecutionStarted;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentStateUpdatedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.PlanUpdatedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.StepMetaInfoAppearedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.PlanItem;
/*     */ import com.intellij.ml.llm.matterhorn.events.SerializableThrowable;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LlmRequestEvent;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LlmRequestFailed;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LlmResponseEvent;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.ui.component.TextKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nEventDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventDetails.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/debug/EventDetailsKt$EventDetails$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,311:1\n86#2:312\n82#2,7:313\n89#2:348\n86#2:350\n83#2,6:351\n89#2:385\n93#2:391\n86#2:393\n83#2,6:394\n89#2:428\n93#2:434\n86#2:438\n83#2,6:439\n89#2:473\n93#2:478\n86#2:480\n83#2,6:481\n89#2:515\n93#2:521\n86#2:523\n83#2,6:524\n89#2:558\n93#2:564\n93#2:574\n79#3,6:320\n86#3,4:335\n90#3,2:345\n79#3,6:357\n86#3,4:372\n90#3,2:382\n94#3:390\n79#3,6:400\n86#3,4:415\n90#3,2:425\n94#3:433\n79#3,6:445\n86#3,4:460\n90#3,2:470\n94#3:477\n79#3,6:487\n86#3,4:502\n90#3,2:512\n94#3:520\n79#3,6:530\n86#3,4:545\n90#3,2:555\n94#3:563\n94#3:573\n368#4,9:326\n377#4:347\n368#4,9:363\n377#4:384\n378#4,2:388\n368#4,9:406\n377#4:427\n378#4,2:431\n368#4,9:451\n377#4:472\n378#4,2:475\n368#4,9:493\n377#4:514\n378#4,2:518\n368#4,9:536\n377#4:557\n378#4,2:561\n378#4,2:571\n4034#5,6:339\n4034#5,6:376\n4034#5,6:419\n4034#5,6:464\n4034#5,6:506\n4034#5,6:549\n149#6:349\n149#6:386\n149#6:387\n149#6:392\n149#6:429\n149#6:430\n149#6:435\n149#6:436\n149#6:437\n149#6:474\n149#6:479\n149#6:516\n149#6:517\n149#6:522\n149#6:559\n149#6:560\n1225#7,6:565\n*S KotlinDebug\n*F\n+ 1 EventDetails.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/debug/EventDetailsKt$EventDetails$1\n*L\n109#1:312\n109#1:313,7\n109#1:348\n112#1:350\n112#1:351,6\n112#1:385\n112#1:391\n126#1:393\n126#1:394,6\n126#1:428\n126#1:434\n179#1:438\n179#1:439,6\n179#1:473\n179#1:478\n190#1:480\n190#1:481,6\n190#1:515\n190#1:521\n204#1:523\n204#1:524,6\n204#1:558\n204#1:564\n109#1:574\n109#1:320,6\n109#1:335,4\n109#1:345,2\n112#1:357,6\n112#1:372,4\n112#1:382,2\n112#1:390\n126#1:400,6\n126#1:415,4\n126#1:425,2\n126#1:433\n179#1:445,6\n179#1:460,4\n179#1:470,2\n179#1:477\n190#1:487,6\n190#1:502,4\n190#1:512,2\n190#1:520\n204#1:530,6\n204#1:545,4\n204#1:555,2\n204#1:563\n109#1:573\n109#1:326,9\n109#1:347\n112#1:363,9\n112#1:384\n112#1:388,2\n126#1:406,9\n126#1:427\n126#1:431,2\n179#1:451,9\n179#1:472\n179#1:475,2\n190#1:493,9\n190#1:514\n190#1:518,2\n204#1:536,9\n204#1:557\n204#1:561,2\n109#1:571,2\n109#1:339,6\n112#1:376,6\n126#1:419,6\n179#1:464,6\n190#1:506,6\n204#1:549,6\n112#1:349\n114#1:386\n119#1:387\n126#1:392\n128#1:429\n130#1:430\n170#1:435\n173#1:436\n179#1:437\n181#1:474\n190#1:479\n192#1:516\n199#1:517\n204#1:522\n206#1:559\n213#1:560\n218#1:565,6\n*E\n"})
/*     */ final class EventDetailsKt$EventDetails$1
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/* 109 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1375708918, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.debug.EventDetails.<anonymous> (EventDetails.kt:108)");  CustomArtifactEvent customArtifactEvent1 = this.$event; int $changed$iv = 0, $i$f$Column = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 312 */       ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/* 313 */       Modifier modifier$iv = (Modifier)Modifier.Companion;
/* 314 */       Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
/* 315 */       Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
/*     */ 
/*     */       
/* 318 */       MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 319 */       int $i$f$Layout = 0;
/* 320 */       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 321 */       int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 322 */       CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 323 */       Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
/*     */       
/* 325 */       Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 326 */       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 327 */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 328 */         .startReusableNode();
/* 329 */       if ($composer.getInserting()) { $composer
/* 330 */           .createNode(function0); } else { $composer
/*     */           
/* 332 */           .useNode(); }
/*     */       
/* 334 */       Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 335 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 336 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/* 338 */       Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 339 */       Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 340 */       if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 341 */         $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 342 */         $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */       } 
/*     */       
/* 345 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 347 */       int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-ColumnKt$Column$1$iv = 0;
/* 348 */       ComposerKt.sourceInformationMarkerStart($composer$iv, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; ColumnScope $this$invoke_u24lambda_u248 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-EventDetailsKt$EventDetails$1$1 = 0; CustomArtifactEvent customArtifactEvent2 = customArtifactEvent1; if (customArtifactEvent2 instanceof LlmRequestEvent)
/* 349 */       { composer1.startReplaceGroup(-1787217185); int $this$dp$iv = 16, $i$f$getDp = 0; Modifier modifier1 = PaddingKt.padding-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv)); int k = 6, m = 0;
/* 350 */         ComposerKt.sourceInformationMarkerStart(composer1, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/* 351 */         Arrangement.Vertical vertical = Arrangement.INSTANCE.getTop();
/* 352 */         Alignment.Horizontal horizontal = Alignment.Companion.getStart();
/*     */ 
/*     */         
/* 355 */         MeasurePolicy measurePolicy = ColumnKt.columnMeasurePolicy(vertical, horizontal, composer1, 0xE & k >> 3 | 0x70 & k >> 3); int n = 0x70 & k << 3;
/* 356 */         int i1 = 0;
/* 357 */         ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 358 */         int i2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
/* 359 */         CompositionLocalMap compositionLocalMap = composer1.getCurrentCompositionLocalMap();
/* 360 */         Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
/*     */         
/* 362 */         Function0 function01 = ComposeUiNode.Companion.getConstructor(); int i3 = 0x6 | 0x380 & n << 6; int i4 = 0;
/* 363 */         ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 364 */         if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 365 */           .startReusableNode();
/* 366 */         if (composer1.getInserting()) { composer1
/* 367 */             .createNode(function01); } else { composer1
/*     */             
/* 369 */             .useNode(); }
/*     */         
/* 371 */         Composer composer2 = Updater.constructor-impl(composer1); int i5 = 0;
/* 372 */         Updater.set-impl(composer2, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 373 */         Updater.set-impl(composer2, compositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         
/* 375 */         Function2 function2 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i6 = 0;
/* 376 */         Composer composer3 = composer2; int i7 = 0;
/* 377 */         if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i2))) {
/* 378 */           composer3.updateRememberedValue(Integer.valueOf(i2));
/* 379 */           composer2.apply(Integer.valueOf(i2), function2);
/*     */         } 
/*     */         
/* 382 */         Updater.set-impl(composer2, modifier2, ComposeUiNode.Companion.getSetModifier());
/*     */         
/* 384 */         int i8 = 0xE & i3 >> 6; Composer composer4 = composer1; int i9 = 0;
/* 385 */         ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int i10 = 0x6 | 0x70 & k >> 6; Composer composer5 = composer4; ColumnScope $this$invoke_u24lambda_u248_u24lambda_u240 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-EventDetailsKt$EventDetails$1$1$1 = 0; FontWeight fontWeight2 = FontWeight.Companion.getBold(); long l = TextUnitKt.getSp(16); TextKt.Text-bAzTDeA("Llm Request Event:", null, 0L, l, null, fontWeight2, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 199686, 0, 65494); int i11 = 8, i12 = 0;
/* 386 */         SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i11)), composer5, 6); TextKt.Text-bAzTDeA("ID: " + ((LlmRequestEvent)customArtifactEvent1).getId(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Attempt Number: " + ((LlmRequestEvent)customArtifactEvent1).getAttemptNumber(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); EventDetailsKt.MatterhornChatView(((LlmRequestEvent)customArtifactEvent1).getChat(), composer5, 0); i11 = 16; i12 = 0;
/* 387 */         SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i11)), composer5, 6); FontWeight fontWeight1 = FontWeight.Companion.getBold(); l = TextUnitKt.getSp(14); TextKt.Text-bAzTDeA("Model Parameters:", null, 0L, l, null, fontWeight1, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 199686, 0, 65494); EventDetailsKt.ModelParametersView(((LlmRequestEvent)customArtifactEvent1).getModelParameters(), composer5, 0); ComposerKt.sourceInformationMarkerEnd(composer4);
/* 388 */         composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 389 */         ComposerKt.sourceInformationMarkerEnd(composer1);
/* 390 */         ComposerKt.sourceInformationMarkerEnd(composer1); composer1.endReplaceGroup(); }
/*     */       else if (customArtifactEvent2 instanceof LlmResponseEvent)
/* 392 */       { composer1.startReplaceGroup(-1786573408); int $this$dp$iv = 16, $i$f$getDp = 0; Modifier modifier1 = PaddingKt.padding-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv)); int k = 6, m = 0;
/* 393 */         ComposerKt.sourceInformationMarkerStart(composer1, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/* 394 */         Arrangement.Vertical vertical = Arrangement.INSTANCE.getTop();
/* 395 */         Alignment.Horizontal horizontal = Alignment.Companion.getStart();
/*     */ 
/*     */         
/* 398 */         MeasurePolicy measurePolicy = ColumnKt.columnMeasurePolicy(vertical, horizontal, composer1, 0xE & k >> 3 | 0x70 & k >> 3); int n = 0x70 & k << 3;
/* 399 */         int i1 = 0;
/* 400 */         ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 401 */         int i2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
/* 402 */         CompositionLocalMap compositionLocalMap = composer1.getCurrentCompositionLocalMap();
/* 403 */         Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
/*     */         
/* 405 */         Function0 factory$iv$iv$iv = ComposeUiNode.Companion.getConstructor(); int i3 = 0x6 | 0x380 & n << 6; int i4 = 0;
/* 406 */         ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 407 */         if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 408 */           .startReusableNode();
/* 409 */         if (composer1.getInserting()) { composer1
/* 410 */             .createNode(factory$iv$iv$iv); } else { composer1
/*     */             
/* 412 */             .useNode(); }
/*     */         
/* 414 */         Composer composer2 = Updater.constructor-impl(composer1); int i5 = 0;
/* 415 */         Updater.set-impl(composer2, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 416 */         Updater.set-impl(composer2, compositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         
/* 418 */         Function2 function2 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i6 = 0;
/* 419 */         Composer composer3 = composer2; int i7 = 0;
/* 420 */         if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i2))) {
/* 421 */           composer3.updateRememberedValue(Integer.valueOf(i2));
/* 422 */           composer2.apply(Integer.valueOf(i2), function2);
/*     */         } 
/*     */         
/* 425 */         Updater.set-impl(composer2, modifier2, ComposeUiNode.Companion.getSetModifier());
/*     */         
/* 427 */         int i8 = 0xE & i3 >> 6; Composer composer4 = composer1; int i9 = 0;
/* 428 */         ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int i10 = 0x6 | 0x70 & k >> 6; Composer composer5 = composer4; ColumnScope $this$invoke_u24lambda_u248_u24lambda_u241 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-EventDetailsKt$EventDetails$1$1$2 = 0; FontWeight fontWeight2 = FontWeight.Companion.getBold(); long l = TextUnitKt.getSp(16); TextKt.Text-bAzTDeA("Llm Response Event:", null, 0L, l, null, fontWeight2, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 199686, 0, 65494); int i11 = 8, i12 = 0;
/* 429 */         SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i11)), composer5, 6); TextKt.Text-bAzTDeA("ID: " + ((LlmResponseEvent)customArtifactEvent1).getId(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); i11 = 16; i12 = 0;
/* 430 */         SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i11)), composer5, 6); FontWeight fontWeight1 = FontWeight.Companion.getBold(); l = TextUnitKt.getSp(14); TextKt.Text-bAzTDeA("Answer Details:", null, 0L, l, null, fontWeight1, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 199686, 0, 65494); EventDetailsKt.AIAnswerView(((LlmResponseEvent)customArtifactEvent1).getAnswer(), composer5, 0); ComposerKt.sourceInformationMarkerEnd(composer4);
/* 431 */         composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 432 */         ComposerKt.sourceInformationMarkerEnd(composer1);
/* 433 */         ComposerKt.sourceInformationMarkerEnd(composer1); composer1.endReplaceGroup(); } else if (customArtifactEvent2 instanceof LlmRequestFailed) { composer1.startReplaceGroup(-1786064729); TextKt.Text-bAzTDeA("LlmRequestFailed:", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534); TextKt.Text-bAzTDeA("ID: " + ((LlmRequestFailed)customArtifactEvent1).getId(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); TextKt.Text-bAzTDeA("Error: " + ((LlmRequestFailed)customArtifactEvent1).getException().getMessage(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); composer1.endReplaceGroup(); } else if (customArtifactEvent2 instanceof com.intellij.ml.llm.matterhorn.ej.core.BeforeStepStartedEvent) { composer1.startReplaceGroup(-1785897577); TextKt.Text-bAzTDeA("BeforeStepStartedEvent:", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534); composer1.endReplaceGroup(); } else if (customArtifactEvent2 instanceof com.intellij.ml.llm.matterhorn.ej.core.AfterStepFinishedEvent) { composer1.startReplaceGroup(-1785807398); TextKt.Text-bAzTDeA("AfterStepEndedEvent:", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534); composer1.endReplaceGroup(); } else if (customArtifactEvent2 instanceof ActionRequestBuildingStarted) { composer1.startReplaceGroup(-1785712104); TextKt.Text-bAzTDeA("ActionRequestBuildingStarted:", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534); TextKt.Text-bAzTDeA("Attempt Number: " + ((ActionRequestBuildingStarted)customArtifactEvent1).getAttemptNumber(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); composer1.endReplaceGroup(); } else if (customArtifactEvent2 instanceof ActionRequestBuildingFinished) { composer1.startReplaceGroup(-1785550594); TextKt.Text-bAzTDeA("ActionRequestBuildingFinished:", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534); TextKt.Text-bAzTDeA("Attempt Number: " + ((ActionRequestBuildingFinished)customArtifactEvent1).getAttemptNumber(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); TextKt.Text-bAzTDeA("Action Request: " + ((ActionRequestBuildingFinished)customArtifactEvent1).getActionRequest(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); composer1.endReplaceGroup(); }
/*     */       else if (customArtifactEvent2 instanceof ActionRequestBuildingFailed) { composer1.startReplaceGroup(-1785317133); TextKt.Text-bAzTDeA("ActionRequestBuildingFailed:", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534); TextKt.Text-bAzTDeA("Attempt Number: " + ((ActionRequestBuildingFailed)customArtifactEvent1).getAttemptNumber(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); TextKt.Text-bAzTDeA("Error:", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534); SerializableThrowable throwable = ((ActionRequestBuildingFailed)customArtifactEvent1).getSerializableThrowable(); if (throwable != null) { if (throwable.getMessage() == null)
/* 435 */             throwable.getMessage();  String message = "No message"; String stackTrace = throwable.getStackTrace(); SerializableThrowable it = throwable.getCause(); int $i$a$-let-EventDetailsKt$EventDetails$1$1$cause$1 = 0; throwable.getCause(); String cause = (throwable.getCause() != null) ? ("Caused by: " + it.getMessage() + "\n" + it.getStackTrace()) : null; TextKt.Text-bAzTDeA("Message: " + message, null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); TextKt.Text-bAzTDeA("Stack Trace:", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534); int $this$dp$iv = 8, $i$f$getDp = 0; TextKt.Text-bAzTDeA(stackTrace, PaddingKt.padding-qDBjuR0$default((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv), 0.0F, 0.0F, 0.0F, 14, null), 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 48, 0, 65532); if (cause != null)
/* 436 */           { TextKt.Text-bAzTDeA("Cause:", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534); $this$dp$iv = 8; $i$f$getDp = 0; TextKt.Text-bAzTDeA(cause, PaddingKt.padding-qDBjuR0$default((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv), 0.0F, 0.0F, 0.0F, 14, null), 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 48, 0, 65532); }  }  composer1.endReplaceGroup(); }
/* 437 */       else if (customArtifactEvent2 instanceof AgentActionExecutionStarted) { composer1.startReplaceGroup(-1784527656); int $this$dp$iv = 16, $i$f$getDp = 0; Modifier modifier1 = PaddingKt.padding-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv)); int k = 6, m = 0;
/* 438 */         ComposerKt.sourceInformationMarkerStart(composer1, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/* 439 */         Arrangement.Vertical vertical = Arrangement.INSTANCE.getTop();
/* 440 */         Alignment.Horizontal horizontal = Alignment.Companion.getStart();
/*     */ 
/*     */         
/* 443 */         MeasurePolicy measurePolicy = ColumnKt.columnMeasurePolicy(vertical, horizontal, composer1, 0xE & k >> 3 | 0x70 & k >> 3); int n = 0x70 & k << 3;
/* 444 */         int i1 = 0;
/* 445 */         ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 446 */         int i2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
/* 447 */         CompositionLocalMap compositionLocalMap = composer1.getCurrentCompositionLocalMap();
/* 448 */         Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
/*     */         
/* 450 */         Function0 factory$iv$iv$iv = ComposeUiNode.Companion.getConstructor(); int i3 = 0x6 | 0x380 & n << 6; int i4 = 0;
/* 451 */         ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 452 */         if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 453 */           .startReusableNode();
/* 454 */         if (composer1.getInserting()) { composer1
/* 455 */             .createNode(factory$iv$iv$iv); } else { composer1
/*     */             
/* 457 */             .useNode(); }
/*     */         
/* 459 */         Composer composer2 = Updater.constructor-impl(composer1); int i5 = 0;
/* 460 */         Updater.set-impl(composer2, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 461 */         Updater.set-impl(composer2, compositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         
/* 463 */         Function2 function2 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i6 = 0;
/* 464 */         Composer composer3 = composer2; int i7 = 0;
/* 465 */         if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i2))) {
/* 466 */           composer3.updateRememberedValue(Integer.valueOf(i2));
/* 467 */           composer2.apply(Integer.valueOf(i2), function2);
/*     */         } 
/*     */         
/* 470 */         Updater.set-impl(composer2, modifier2, ComposeUiNode.Companion.getSetModifier());
/*     */         
/* 472 */         int i8 = 0xE & i3 >> 6; Composer composer4 = composer1; int i9 = 0;
/* 473 */         ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int i10 = 0x6 | 0x70 & k >> 6; Composer composer5 = composer4; ColumnScope $this$invoke_u24lambda_u248_u24lambda_u243 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-EventDetailsKt$EventDetails$1$1$3 = 0; FontWeight fontWeight = FontWeight.Companion.getBold(); long l = TextUnitKt.getSp(16); TextKt.Text-bAzTDeA("Agent Action Execution Started:", null, 0L, l, null, fontWeight, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 199686, 0, 65494); int i11 = 8, i12 = 0;
/* 474 */         SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i11)), composer5, 6); TextKt.Text-bAzTDeA("Action Name: " + ((AgentActionExecutionStarted)customArtifactEvent1).getActionToExecute().getName(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Description: " + ((AgentActionExecutionStarted)customArtifactEvent1).getActionToExecute().getDescription(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Number of Commands: " + ((AgentActionExecutionStarted)customArtifactEvent1).getActionToExecute().getNumCommands(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Title: " + ((AgentActionExecutionStarted)customArtifactEvent1).getActionToExecute().getTitle(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); ComposerKt.sourceInformationMarkerEnd(composer4);
/* 475 */         composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 476 */         ComposerKt.sourceInformationMarkerEnd(composer1);
/* 477 */         ComposerKt.sourceInformationMarkerEnd(composer1); composer1.endReplaceGroup(); }
/*     */       else if (customArtifactEvent2 instanceof AgentActionExecutionFinished)
/* 479 */       { composer1.startReplaceGroup(-1783984939); int $this$dp$iv = 16, $i$f$getDp = 0; Modifier modifier1 = PaddingKt.padding-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv)); int k = 6, m = 0;
/* 480 */         ComposerKt.sourceInformationMarkerStart(composer1, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/* 481 */         Arrangement.Vertical vertical = Arrangement.INSTANCE.getTop();
/* 482 */         Alignment.Horizontal horizontal = Alignment.Companion.getStart();
/*     */ 
/*     */         
/* 485 */         MeasurePolicy measurePolicy = ColumnKt.columnMeasurePolicy(vertical, horizontal, composer1, 0xE & k >> 3 | 0x70 & k >> 3); int n = 0x70 & k << 3;
/* 486 */         int i1 = 0;
/* 487 */         ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 488 */         int i2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
/* 489 */         CompositionLocalMap compositionLocalMap = composer1.getCurrentCompositionLocalMap();
/* 490 */         Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
/*     */         
/* 492 */         Function0 factory$iv$iv$iv = ComposeUiNode.Companion.getConstructor(); int i3 = 0x6 | 0x380 & n << 6; int i4 = 0;
/* 493 */         ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 494 */         if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 495 */           .startReusableNode();
/* 496 */         if (composer1.getInserting()) { composer1
/* 497 */             .createNode(factory$iv$iv$iv); } else { composer1
/*     */             
/* 499 */             .useNode(); }
/*     */         
/* 501 */         Composer composer2 = Updater.constructor-impl(composer1); int i5 = 0;
/* 502 */         Updater.set-impl(composer2, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 503 */         Updater.set-impl(composer2, compositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         
/* 505 */         Function2 function2 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i6 = 0;
/* 506 */         Composer composer3 = composer2; int i7 = 0;
/* 507 */         if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i2))) {
/* 508 */           composer3.updateRememberedValue(Integer.valueOf(i2));
/* 509 */           composer2.apply(Integer.valueOf(i2), function2);
/*     */         } 
/*     */         
/* 512 */         Updater.set-impl(composer2, modifier2, ComposeUiNode.Companion.getSetModifier());
/*     */         
/* 514 */         int i8 = 0xE & i3 >> 6; Composer composer4 = composer1; int i9 = 0;
/* 515 */         ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int i10 = 0x6 | 0x70 & k >> 6; Composer composer5 = composer4; ColumnScope $this$invoke_u24lambda_u248_u24lambda_u244 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-EventDetailsKt$EventDetails$1$1$4 = 0; FontWeight fontWeight = FontWeight.Companion.getBold(); long l = TextUnitKt.getSp(16); TextKt.Text-bAzTDeA("Agent Action Execution Finished:", null, 0L, l, null, fontWeight, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 199686, 0, 65494); int i11 = 8, i12 = 0;
/* 516 */         SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i11)), composer5, 6); TextKt.Text-bAzTDeA("Action Name: " + ((AgentActionExecutionFinished)customArtifactEvent1).getActionToExecute().getName(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Description: " + ((AgentActionExecutionFinished)customArtifactEvent1).getActionToExecute().getDescription(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Number of Commands: " + ((AgentActionExecutionFinished)customArtifactEvent1).getActionToExecute().getNumCommands(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Title: " + ((AgentActionExecutionFinished)customArtifactEvent1).getActionToExecute().getTitle(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); i11 = 8; i12 = 0;
/* 517 */         SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i11)), composer5, 6); TextKt.Text-bAzTDeA("Result: " + ((AgentActionExecutionFinished)customArtifactEvent1).getResult(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); ComposerKt.sourceInformationMarkerEnd(composer4);
/* 518 */         composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 519 */         ComposerKt.sourceInformationMarkerEnd(composer1);
/* 520 */         ComposerKt.sourceInformationMarkerEnd(composer1); composer1.endReplaceGroup(); }
/*     */       else if (customArtifactEvent2 instanceof AgentActionExecutionFailed)
/* 522 */       { composer1.startReplaceGroup(-1783347641); int $this$dp$iv = 16, $i$f$getDp = 0; Modifier modifier1 = PaddingKt.padding-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv)); int k = 6, m = 0;
/* 523 */         ComposerKt.sourceInformationMarkerStart(composer1, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/* 524 */         Arrangement.Vertical vertical = Arrangement.INSTANCE.getTop();
/* 525 */         Alignment.Horizontal horizontal = Alignment.Companion.getStart();
/*     */ 
/*     */         
/* 528 */         MeasurePolicy measurePolicy = ColumnKt.columnMeasurePolicy(vertical, horizontal, composer1, 0xE & k >> 3 | 0x70 & k >> 3); int n = 0x70 & k << 3;
/* 529 */         int i1 = 0;
/* 530 */         ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 531 */         int i2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
/* 532 */         CompositionLocalMap compositionLocalMap = composer1.getCurrentCompositionLocalMap();
/* 533 */         Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
/*     */         
/* 535 */         Function0 factory$iv$iv$iv = ComposeUiNode.Companion.getConstructor(); int i3 = 0x6 | 0x380 & n << 6; int i4 = 0;
/* 536 */         ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 537 */         if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 538 */           .startReusableNode();
/* 539 */         if (composer1.getInserting()) { composer1
/* 540 */             .createNode(factory$iv$iv$iv); } else { composer1
/*     */             
/* 542 */             .useNode(); }
/*     */         
/* 544 */         Composer composer2 = Updater.constructor-impl(composer1); int i5 = 0;
/* 545 */         Updater.set-impl(composer2, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 546 */         Updater.set-impl(composer2, compositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         
/* 548 */         Function2 function2 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i6 = 0;
/* 549 */         Composer composer3 = composer2; int i7 = 0;
/* 550 */         if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i2))) {
/* 551 */           composer3.updateRememberedValue(Integer.valueOf(i2));
/* 552 */           composer2.apply(Integer.valueOf(i2), function2);
/*     */         } 
/*     */         
/* 555 */         Updater.set-impl(composer2, modifier2, ComposeUiNode.Companion.getSetModifier());
/*     */         
/* 557 */         int i8 = 0xE & i3 >> 6; Composer composer4 = composer1; int i9 = 0;
/* 558 */         ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int i10 = 0x6 | 0x70 & k >> 6; Composer composer5 = composer4; ColumnScope $this$invoke_u24lambda_u248_u24lambda_u245 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-EventDetailsKt$EventDetails$1$1$5 = 0; FontWeight fontWeight = FontWeight.Companion.getBold(); long l = TextUnitKt.getSp(16); TextKt.Text-bAzTDeA("Agent Action Execution Failed:", null, 0L, l, null, fontWeight, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 199686, 0, 65494); int i11 = 8, i12 = 0;
/* 559 */         SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i11)), composer5, 6); TextKt.Text-bAzTDeA("Action Name: " + ((AgentActionExecutionFailed)customArtifactEvent1).getActionToExecute().getName(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Description: " + ((AgentActionExecutionFailed)customArtifactEvent1).getActionToExecute().getDescription(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Number of Commands: " + ((AgentActionExecutionFailed)customArtifactEvent1).getActionToExecute().getNumCommands(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Title: " + ((AgentActionExecutionFailed)customArtifactEvent1).getActionToExecute().getTitle(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); i11 = 8; i12 = 0;
/* 560 */         SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i11)), composer5, 6); if (((AgentActionExecutionFailed)customArtifactEvent1).getException().getMessage() == null)
/* 561 */           ((AgentActionExecutionFailed)customArtifactEvent1).getException().getMessage();  TextKt.Text-bAzTDeA("Error: " + "Unknown error", null, Color.Companion.getRed-0d7_KjU(), 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 384, 0, 65530); ComposerKt.sourceInformationMarkerEnd(composer4); composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 562 */         ComposerKt.sourceInformationMarkerEnd(composer1);
/* 563 */         ComposerKt.sourceInformationMarkerEnd(composer1); composer1.endReplaceGroup(); }
/*     */       else if (customArtifactEvent2 instanceof PlanUpdatedEvent)
/* 565 */       { composer1.startReplaceGroup(-1782692766); composer1.startReplaceGroup(-1858619782); Composer composer = composer1; boolean invalid$iv = false; int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */         
/* 567 */         CharSequence charSequence1 = null; boolean bool = false; CharSequence charSequence2 = null, charSequence3 = null, charSequence4 = "\n"; List list = ((PlanUpdatedEvent)customArtifactEvent1).getPlan(); int $i$a$-cache-EventDetailsKt$EventDetails$1$1$6 = 0; Function1 function12 = EventDetailsKt$EventDetails$1::invoke$lambda$8$lambda$7$lambda$6; Object value$iv = function12;
/* 568 */         composer.updateRememberedValue(value$iv);
/* 569 */         Function1 function11 = (it$iv == Composer.Companion.getEmpty()) ? (Function1)value$iv : 
/* 570 */           (Function1)it$iv; composer1.endReplaceGroup(); TextKt.Text-bAzTDeA("Plan:\n" + CollectionsKt.joinToString$default(list, charSequence4, charSequence3, charSequence2, bool, charSequence1, function11, 30, null), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); composer1.endReplaceGroup(); } else if (customArtifactEvent2 instanceof AgentStateUpdatedEvent) { composer1.startReplaceGroup(-1782551437); TextKt.Text-bAzTDeA("Agent state: " + ((AgentStateUpdatedEvent)customArtifactEvent1).getState(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); composer1.endReplaceGroup(); } else if (customArtifactEvent2 instanceof BeforeArtifactBuildingStarted) { composer1.startReplaceGroup(-1782448827); ((BeforeArtifactBuildingStarted)customArtifactEvent1).getRequestId(); TextKt.Text-bAzTDeA("Id: " + EventDetailsKt.getPresentableArtifactNameAndType((((BeforeArtifactBuildingStarted)customArtifactEvent1).getRequestId() != null) ? ((BeforeArtifactBuildingStarted)customArtifactEvent1).getRequestId().toArtifactId() : null), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); composer1.endReplaceGroup(); } else if (customArtifactEvent2 instanceof AfterArtifactBuildingFinished) { composer1.startReplaceGroup(-1782302011); ((AfterArtifactBuildingFinished)customArtifactEvent1).getRequestId(); TextKt.Text-bAzTDeA("Id: " + EventDetailsKt.getPresentableArtifactNameAndType((((AfterArtifactBuildingFinished)customArtifactEvent1).getRequestId() != null) ? ((AfterArtifactBuildingFinished)customArtifactEvent1).getRequestId().toArtifactId() : null), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); composer1.endReplaceGroup(); } else if (customArtifactEvent2 instanceof StepMetaInfoAppearedEvent) { composer1.startReplaceGroup(-1782159783); TextKt.Text-bAzTDeA("MetaInfo: " + ((StepMetaInfoAppearedEvent)customArtifactEvent1).getStepName() + ", type = " + ((StepMetaInfoAppearedEvent)customArtifactEvent1).getStepType(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); composer1.endReplaceGroup(); } else { composer1.startReplaceGroup(-1782061668); TextKt.Text-bAzTDeA("Event Data: " + customArtifactEvent1, null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); composer1.endReplaceGroup(); }
/* 571 */        ComposerKt.sourceInformationMarkerEnd($composer$iv); $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 572 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 573 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 574 */       if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   private static final CharSequence invoke$lambda$8$lambda$7$lambda$6(PlanItem it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it.getDescription() + " " + it.getDescription();
/*     */   }
/*     */   
/*     */   EventDetailsKt$EventDetails$1(CustomArtifactEvent $event) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\debug\EventDetailsKt$EventDetails$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */