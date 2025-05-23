/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*     */ import androidx.compose.foundation.layout.RowKt;
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.foundation.layout.RowScopeInstance;
/*     */ import androidx.compose.foundation.layout.SizeKt;
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
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nJunieFilePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1$3$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,234:1\n149#2:235\n149#2:273\n99#3:236\n95#3,7:237\n102#3:272\n106#3:317\n79#4,6:244\n86#4,4:259\n90#4,2:269\n79#4,6:281\n86#4,4:296\n90#4,2:306\n94#4:312\n94#4:316\n368#5,9:250\n377#5:271\n368#5,9:287\n377#5:308\n378#5,2:310\n378#5,2:314\n4034#6,6:263\n4034#6,6:300\n71#7:274\n68#7,6:275\n74#7:309\n78#7:313\n*S KotlinDebug\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1$3$2\n*L\n192#1:235\n193#1:273\n192#1:236\n192#1:237,7\n192#1:272\n192#1:317\n192#1:244,6\n192#1:259,4\n192#1:269,2\n193#1:281,6\n193#1:296,4\n193#1:306,2\n193#1:312\n192#1:316\n192#1:250,9\n192#1:271\n193#1:287,9\n193#1:308\n193#1:310,2\n192#1:314,2\n192#1:263,6\n193#1:300,6\n193#1:274\n193#1:275,6\n193#1:309\n193#1:313\n*E\n"})
/*     */ final class JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1$3$2
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/* 192 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(378470621, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.JunieFilePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JunieFilePicker.kt:191)");  Alignment.Vertical vertical = Alignment.Companion.getCenterVertically(); int $this$dp$iv = 4, $i$f$getDp = 0; Arrangement.HorizontalOrVertical horizontalOrVertical = Arrangement.INSTANCE.spacedBy-0680j_4(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 235 */           Dp.constructor-impl($this$dp$iv)); FileListEntry fileListEntry = this.$fileListEntry; int $changed$iv = 432, $i$f$Row = 0;
/* 236 */       ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
/* 237 */       Modifier modifier$iv = (Modifier)Modifier.Companion;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 242 */       MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy((Arrangement.Horizontal)horizontalOrVertical, vertical, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 243 */       int $i$f$Layout = 0;
/* 244 */       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 245 */       int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 246 */       CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 247 */       Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
/*     */       
/* 249 */       Function0 function01 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 250 */       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 251 */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 252 */         .startReusableNode();
/* 253 */       if ($composer.getInserting()) { $composer
/* 254 */           .createNode(function01); } else { $composer
/*     */           
/* 256 */           .useNode(); }
/*     */       
/* 258 */       Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 259 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 260 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/* 262 */       Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 263 */       Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 264 */       if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 265 */         $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 266 */         $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */       } 
/*     */       
/* 269 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 271 */       int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-RowKt$Row$1$iv = 0;
/* 272 */       ComposerKt.sourceInformationMarkerStart($composer$iv, -407840262, "C101@5126L9:Row.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; RowScope $this$invoke_u24lambda_u241 = (RowScope)RowScopeInstance.INSTANCE; int $i$a$-Row-JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1$3$2$1 = 0; int k = 16, m = 0;
/* 273 */       Modifier modifier1 = SizeKt.size-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(k)); int n = 6, $i$f$Box = 0;
/* 274 */       ComposerKt.sourceInformationMarkerStart(composer1, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/* 275 */       Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/* 276 */       boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */       
/* 279 */       MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int i1 = 0x70 & n << 3;
/* 280 */       int i2 = 0;
/* 281 */       ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 282 */       int i3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
/* 283 */       CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
/* 284 */       Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
/*     */       
/* 286 */       Function0 function02 = ComposeUiNode.Companion.getConstructor(); int i4 = 0x6 | 0x380 & i1 << 6; int i5 = 0;
/* 287 */       ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 288 */       if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 289 */         .startReusableNode();
/* 290 */       if (composer1.getInserting()) { composer1
/* 291 */           .createNode(function02); } else { composer1
/*     */           
/* 293 */           .useNode(); }
/*     */       
/* 295 */       Composer composer2 = Updater.constructor-impl(composer1); int i6 = 0;
/* 296 */       Updater.set-impl(composer2, measurePolicy1, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 297 */       Updater.set-impl(composer2, compositionLocalMap1, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/* 299 */       Function2 function21 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i7 = 0;
/* 300 */       Composer composer3 = composer2; int i8 = 0;
/* 301 */       if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i3))) {
/* 302 */         composer3.updateRememberedValue(Integer.valueOf(i3));
/* 303 */         composer2.apply(Integer.valueOf(i3), function21);
/*     */       } 
/*     */       
/* 306 */       Updater.set-impl(composer2, modifier2, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 308 */       int i9 = 0xE & i4 >> 6; Composer composer4 = composer1; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 309 */       ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int i10 = 0x6 | 0x70 & n >> 6; Composer composer5 = composer4; BoxScope $this$invoke_u24lambda_u241_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1$3$2$1$1 = 0; composer5.startReplaceGroup(523406596); if (fileListEntry.getFileIcon() != null) SwingIconKt.SwingIcon(fileListEntry.getFileIcon(), "file icon", composer5, 48);  composer5.endReplaceGroup(); ComposerKt.sourceInformationMarkerEnd(composer4);
/* 310 */       composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 311 */       ComposerKt.sourceInformationMarkerEnd(composer1);
/* 312 */       ComposerKt.sourceInformationMarkerEnd(composer1); TextKt.Text-bAzTDeA(fileListEntry.getFileName(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534);
/*     */       ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 314 */       $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 315 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 316 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 317 */       if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1$3$2(FileListEntry $fileListEntry) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1$3$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */