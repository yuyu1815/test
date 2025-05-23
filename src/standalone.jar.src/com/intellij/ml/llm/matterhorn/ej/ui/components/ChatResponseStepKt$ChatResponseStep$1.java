/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.ColumnScope;
/*     */ import androidx.compose.foundation.layout.RowKt;
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.foundation.layout.RowScopeInstance;
/*     */ import androidx.compose.foundation.layout.SizeKt;
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
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import androidx.compose.ui.text.style.TextOverflow;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nChatResponseStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatResponseStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/ChatResponseStepKt$ChatResponseStep$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,77:1\n149#2:78\n149#2:116\n149#2:154\n149#2:198\n86#3:79\n82#3,7:80\n89#3:115\n93#3:242\n79#4,6:87\n86#4,4:102\n90#4,2:112\n79#4,6:125\n86#4,4:140\n90#4,2:150\n79#4,6:161\n86#4,4:176\n90#4,2:186\n94#4:192\n94#4:196\n79#4,6:206\n86#4,4:221\n90#4,2:231\n94#4:237\n94#4:241\n368#5,9:93\n377#5:114\n368#5,9:131\n377#5:152\n368#5,9:167\n377#5:188\n378#5,2:190\n378#5,2:194\n368#5,9:212\n377#5:233\n378#5,2:235\n378#5,2:239\n4034#6,6:106\n4034#6,6:144\n4034#6,6:180\n4034#6,6:225\n99#7:117\n95#7,7:118\n102#7:153\n106#7:197\n99#7:199\n96#7,6:200\n102#7:234\n106#7:238\n71#8:155\n69#8,5:156\n74#8:189\n78#8:193\n*S KotlinDebug\n*F\n+ 1 ChatResponseStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/ChatResponseStepKt$ChatResponseStep$1\n*L\n36#1:78\n41#1:116\n44#1:154\n65#1:198\n35#1:79\n35#1:80,7\n35#1:115\n35#1:242\n35#1:87,6\n35#1:102,4\n35#1:112,2\n39#1:125,6\n39#1:140,4\n39#1:150,2\n43#1:161,6\n43#1:176,4\n43#1:186,2\n43#1:192\n39#1:196\n64#1:206,6\n64#1:221,4\n64#1:231,2\n64#1:237\n35#1:241\n35#1:93,9\n35#1:114\n39#1:131,9\n39#1:152\n43#1:167,9\n43#1:188\n43#1:190,2\n39#1:194,2\n64#1:212,9\n64#1:233\n64#1:235,2\n35#1:239,2\n35#1:106,6\n39#1:144,6\n43#1:180,6\n64#1:225,6\n39#1:117\n39#1:118,7\n39#1:153\n39#1:197\n64#1:199\n64#1:200,6\n64#1:234\n64#1:238\n43#1:155\n43#1:156,5\n43#1:189\n43#1:193\n*E\n"})
/*     */ final class ChatResponseStepKt$ChatResponseStep$1 implements Function3<BoxScope, Composer, Integer, Unit> {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(BoxScope $this$JunieReportCard, Composer $composer, int $changed) {
/*  35 */     Intrinsics.checkNotNullParameter($this$JunieReportCard, "$this$JunieReportCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1101709347, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.ChatResponseStep.<anonymous> (ChatResponseStep.kt:34)"); 
/*  36 */       int $this$dp$iv = 12, $i$f$getDp = 0; Arrangement.Vertical vertical = (Arrangement.Vertical)Arrangement.INSTANCE.spacedBy-0680j_4(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  78 */           Dp.constructor-impl($this$dp$iv)); String str1 = this.$chatResponseText, str2 = this.$markdownActionText; Function0<Unit> function01 = this.$onMarkdownActionClicked; String str3 = this.$chatResponseTitle, str4 = this.$startNewTaskActionText; Function0<Unit> function02 = this.$onStartNewTaskActionClicked; int $changed$iv = 48, $i$f$Column = 0;
/*  79 */       ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/*  80 */       Modifier modifier$iv = (Modifier)Modifier.Companion;
/*     */       
/*  82 */       Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
/*     */ 
/*     */       
/*  85 */       MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(vertical, horizontalAlignment$iv, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*  86 */       int $i$f$Layout = 0;
/*  87 */       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*  88 */       int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*  89 */       CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*  90 */       Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
/*     */       
/*  92 */       Function0 function03 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/*  93 */       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*  94 */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/*  95 */         .startReusableNode();
/*  96 */       if ($composer.getInserting()) { $composer
/*  97 */           .createNode(function03); } else { $composer
/*     */           
/*  99 */           .useNode(); }
/*     */       
/* 101 */       Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 102 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 103 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/* 105 */       Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 106 */       Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 107 */       if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 108 */         $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 109 */         $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */       } 
/*     */       
/* 112 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 114 */       int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-ColumnKt$Column$1$iv = 0;
/* 115 */       ComposerKt.sourceInformationMarkerStart($composer$iv, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; ColumnScope $this$invoke_u24lambda_u243 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-ChatResponseStepKt$ChatResponseStep$1$1 = 0; Alignment.Vertical vertical1 = Alignment.Companion.getCenterVertically(); int m = 8, i1 = 0;
/* 116 */       Arrangement.HorizontalOrVertical horizontalOrVertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(m)); int n = 432; int $i$f$Row = 0;
/* 117 */       ComposerKt.sourceInformationMarkerStart(composer1, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
/* 118 */       Modifier modifier2 = (Modifier)Modifier.Companion;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 123 */       MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy((Arrangement.Horizontal)horizontalOrVertical, vertical1, composer1, 0xE & n >> 3 | 0x70 & n >> 3); int i3 = 0x70 & n << 3;
/* 124 */       int i4 = 0;
/* 125 */       ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 126 */       int i5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
/* 127 */       CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
/* 128 */       Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
/*     */       
/* 130 */       Function0 function04 = ComposeUiNode.Companion.getConstructor(); int i6 = 0x6 | 0x380 & i3 << 6; int i7 = 0;
/* 131 */       ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 132 */       if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 133 */         .startReusableNode();
/* 134 */       if (composer1.getInserting()) { composer1
/* 135 */           .createNode(function04); } else { composer1
/*     */           
/* 137 */           .useNode(); }
/*     */       
/* 139 */       Composer composer2 = Updater.constructor-impl(composer1); int i8 = 0;
/* 140 */       Updater.set-impl(composer2, measurePolicy1, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 141 */       Updater.set-impl(composer2, compositionLocalMap1, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/* 143 */       Function2 function21 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i9 = 0;
/* 144 */       Composer composer3 = composer2; int i10 = 0;
/* 145 */       if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i5))) {
/* 146 */         composer3.updateRememberedValue(Integer.valueOf(i5));
/* 147 */         composer2.apply(Integer.valueOf(i5), function21);
/*     */       } 
/*     */       
/* 150 */       Updater.set-impl(composer2, modifier3, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 152 */       int i12 = 0xE & i6 >> 6; Composer composer4 = composer1; int $i$a$-Layout-RowKt$Row$1$iv = 0;
/* 153 */       ComposerKt.sourceInformationMarkerStart(composer4, -407840262, "C101@5126L9:Row.kt#2w3rfo"); int i14 = 0x6 | 0x70 & n >> 6; Composer composer6 = composer4; RowScope $this$invoke_u24lambda_u243_u24lambda_u241 = (RowScope)RowScopeInstance.INSTANCE; int $i$a$-Row-ChatResponseStepKt$ChatResponseStep$1$1$1 = 0; int i15 = 20, i16 = 0;
/* 154 */       Modifier modifier4 = SizeKt.size-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i15)); Alignment alignment = Alignment.Companion.getCenter(); int i17 = 54; int $i$f$Box = 0;
/* 155 */       ComposerKt.sourceInformationMarkerStart(composer6, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/* 156 */       boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */       
/* 159 */       MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment, propagateMinConstraints$iv); int i18 = 0x70 & i17 << 3;
/* 160 */       int i19 = 0;
/* 161 */       ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 162 */       int i20 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
/* 163 */       CompositionLocalMap compositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
/* 164 */       Modifier modifier5 = ComposedModifierKt.materializeModifier(composer6, modifier4);
/*     */       
/* 166 */       Function0 function05 = ComposeUiNode.Companion.getConstructor(); int i21 = 0x6 | 0x380 & i18 << 6; int i22 = 0;
/* 167 */       ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 168 */       if (!(composer6.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer6
/* 169 */         .startReusableNode();
/* 170 */       if (composer6.getInserting()) { composer6
/* 171 */           .createNode(function05); } else { composer6
/*     */           
/* 173 */           .useNode(); }
/*     */       
/* 175 */       Composer composer7 = Updater.constructor-impl(composer6); int i23 = 0;
/* 176 */       Updater.set-impl(composer7, measurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 177 */       Updater.set-impl(composer7, compositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/* 179 */       Function2 function22 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i24 = 0;
/* 180 */       Composer composer8 = composer7; int i25 = 0;
/* 181 */       if (composer8.getInserting() || !Intrinsics.areEqual(composer8.rememberedValue(), Integer.valueOf(i20))) {
/* 182 */         composer8.updateRememberedValue(Integer.valueOf(i20));
/* 183 */         composer7.apply(Integer.valueOf(i20), function22);
/*     */       } 
/*     */       
/* 186 */       Updater.set-impl(composer7, modifier5, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 188 */       int i26 = 0xE & i21 >> 6; Composer composer9 = composer6; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 189 */       ComposerKt.sourceInformationMarkerStart(composer9, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int i27 = 0x6 | 0x70 & i17 >> 6; Composer composer10 = composer9; BoxScope $this$invoke_u24lambda_u243_u24lambda_u241_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-ChatResponseStepKt$ChatResponseStep$1$1$1$1 = 0; IconKt.Icon-FHprtrg((IconKey)MatterhornThemeDataKt.getMatterhornTheme(composer10, 0).getChatResponsesIcon(), "Chat Response", null, null, 0L, new org.jetbrains.jewel.ui.painter.PainterHint[0], composer10, 0x30 | PathIconKey.$stable, 28); ComposerKt.sourceInformationMarkerEnd(composer9);
/* 190 */       composer6.endNode(); ComposerKt.sourceInformationMarkerEnd(composer6);
/* 191 */       ComposerKt.sourceInformationMarkerEnd(composer6);
/* 192 */       ComposerKt.sourceInformationMarkerEnd(composer6); long l = TextUnitKt.getSp(16); FontWeight fontWeight = FontWeight.Companion.getMedium(); i17 = TextOverflow.Companion.getEllipsis-gIe3tQ8(); TextKt.Text-bAzTDeA(str3, null, 0L, l, null, fontWeight, null, 0L, null, 0, 0L, i17, false, 1, null, null, composer6, 199680, 3120, 55254);
/*     */       ComposerKt.sourceInformationMarkerEnd(composer4);
/* 194 */       composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 195 */       ComposerKt.sourceInformationMarkerEnd(composer1);
/* 196 */       ComposerKt.sourceInformationMarkerEnd(composer1); ChatResponseTextContainerKt.ChatResponseTextContainer(str1, str2, function01, composer1, 0);
/*     */       int k = 4, i2 = 0;
/* 198 */       Modifier modifier1 = PaddingKt.padding-qDBjuR0$default((Modifier)Modifier.Companion, 0.0F, 0.0F, 0.0F, Dp.constructor-impl(k), 7, null); Alignment.Vertical vertical2 = Alignment.Companion.getCenterVertically(); n = 390; $i$f$Row = 0;
/* 199 */       ComposerKt.sourceInformationMarkerStart(composer1, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
/* 200 */       Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
/*     */ 
/*     */ 
/*     */       
/* 204 */       measurePolicy1 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, vertical2, composer1, 0xE & n >> 3 | 0x70 & n >> 3); i3 = 0x70 & n << 3;
/* 205 */       i4 = 0;
/* 206 */       ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 207 */       i5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
/* 208 */       compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
/* 209 */       modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier1);
/*     */       
/* 211 */       Function0 factory$iv$iv$iv = ComposeUiNode.Companion.getConstructor(); i6 = 0x6 | 0x380 & i3 << 6; i7 = 0;
/* 212 */       ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 213 */       if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 214 */         .startReusableNode();
/* 215 */       if (composer1.getInserting()) { composer1
/* 216 */           .createNode(factory$iv$iv$iv); } else { composer1
/*     */           
/* 218 */           .useNode(); }
/*     */       
/* 220 */       composer2 = Updater.constructor-impl(composer1); i8 = 0;
/* 221 */       Updater.set-impl(composer2, measurePolicy1, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 222 */       Updater.set-impl(composer2, compositionLocalMap1, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/* 224 */       function21 = ComposeUiNode.Companion.getSetCompositeKeyHash(); i9 = 0;
/* 225 */       composer3 = composer2; i10 = 0;
/* 226 */       if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i5))) {
/* 227 */         composer3.updateRememberedValue(Integer.valueOf(i5));
/* 228 */         composer2.apply(Integer.valueOf(i5), function21);
/*     */       } 
/*     */       
/* 231 */       Updater.set-impl(composer2, modifier3, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 233 */       int i11 = 0xE & i6 >> 6; composer4 = composer1; $i$a$-Layout-RowKt$Row$1$iv = 0;
/* 234 */       ComposerKt.sourceInformationMarkerStart(composer4, -407840262, "C101@5126L9:Row.kt#2w3rfo"); int i13 = 0x6 | 0x70 & n >> 6; Composer composer5 = composer4; RowScope $this$invoke_u24lambda_u243_u24lambda_u242 = (RowScope)RowScopeInstance.INSTANCE; int $i$a$-Row-ChatResponseStepKt$ChatResponseStep$1$1$2 = 0; ButtonKt.Button(str4, (Modifier)null, false, function02, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>)null, composer5, 384, 18); ComposerKt.sourceInformationMarkerEnd(composer4);
/* 235 */       composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 236 */       ComposerKt.sourceInformationMarkerEnd(composer1);
/* 237 */       ComposerKt.sourceInformationMarkerEnd(composer1);
/*     */       ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 239 */       $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 240 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 241 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 242 */       if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   ChatResponseStepKt$ChatResponseStep$1(String $chatResponseText, String $markdownActionText, Function0<Unit> $onMarkdownActionClicked, String $chatResponseTitle, String $startNewTaskActionText, Function0<Unit> $onStartNewTaskActionClicked) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\ChatResponseStepKt$ChatResponseStep$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */