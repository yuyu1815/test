/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.FocusableKt;
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
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
/*     */ import androidx.compose.ui.focus.FocusProperties;
/*     */ import androidx.compose.ui.focus.FocusPropertiesKt;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.platform.TestTagKt;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import androidx.compose.ui.text.style.TextOverflow;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.ui.component.styling.ComboBoxStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nComboBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComboBox.kt\norg/jetbrains/jewel/ui/component/ComboBoxKt$ComboBox$11$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,233:1\n1225#2,6:234\n99#3:240\n96#3,6:241\n102#3:275\n106#3:279\n79#4,6:247\n86#4,4:262\n90#4,2:272\n94#4:278\n368#5,9:253\n377#5:274\n378#5,2:276\n4034#6,6:266\n*S KotlinDebug\n*F\n+ 1 ComboBox.kt\norg/jetbrains/jewel/ui/component/ComboBoxKt$ComboBox$11$1\n*L\n175#1:234,6\n173#1:240\n173#1:241,6\n173#1:275\n173#1:279\n173#1:247,6\n173#1:262,4\n173#1:272,2\n173#1:278\n173#1:253,9\n173#1:274\n173#1:276,2\n173#1:266,6\n*E\n"})
/*     */ final class ComboBoxKt$ComboBox$11$1
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/* 173 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(692284384, $changed, -1, "org.jetbrains.jewel.ui.component.ComboBox.<anonymous>.<anonymous> (ComboBox.kt:172)"); 
/* 174 */       Alignment.Vertical vertical = Alignment.Companion.getCenterVertically();
/* 175 */       $composer.startReplaceGroup(844785325); Composer composer1 = $composer; boolean invalid$iv = false; int $i$f$cache = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 234 */       Object it$iv = composer1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */       
/* 236 */       Modifier modifier3 = FocusableKt.focusable$default((Modifier)Modifier.Companion, false, null, 2, null); int $i$a$-cache-ComboBoxKt$ComboBox$11$1$1 = 0; Object value$iv = ComboBoxKt$ComboBox$11$1::invoke$lambda$1$lambda$0;
/* 237 */       composer1.updateRememberedValue(value$iv);
/* 238 */       Function1 function1 = (it$iv == Composer.Companion.getEmpty()) ? (Function1)value$iv : 
/* 239 */         (Function1)it$iv; $composer.endReplaceGroup(); Modifier modifier1 = FocusPropertiesKt.focusProperties(modifier3, function1); boolean bool1 = this.$isEnabled; ComboBoxStyle comboBoxStyle = this.$style; TextStyle textStyle1 = this.$textStyle; it$iv = this.$labelText; int $changed$iv = 384, $i$f$Row = 0;
/* 240 */       ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
/* 241 */       Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
/*     */ 
/*     */ 
/*     */       
/* 245 */       MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, vertical, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 246 */       int $i$f$Layout = 0;
/* 247 */       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 248 */       int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 249 */       CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 250 */       Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */       
/* 252 */       Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 253 */       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 254 */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 255 */         .startReusableNode();
/* 256 */       if ($composer.getInserting()) { $composer
/* 257 */           .createNode(function0); } else { $composer
/*     */           
/* 259 */           .useNode(); }
/*     */       
/* 261 */       Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 262 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 263 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/* 265 */       Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 266 */       Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 267 */       if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 268 */         $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 269 */         $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */       } 
/*     */       
/* 272 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 274 */       int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-RowKt$Row$1$iv = 0;
/* 275 */       ComposerKt.sourceInformationMarkerStart($composer$iv, -407840262, "C101@5126L9:Row.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer2 = $composer$iv; RowScope $this$invoke_u24lambda_u242 = (RowScope)RowScopeInstance.INSTANCE; int $i$a$-Row-ComboBoxKt$ComboBox$11$1$2 = 0; long textColor = bool1 ? Color.Companion.getUnspecified-0d7_KjU() : comboBoxStyle.getColors().getBorderDisabled-0d7_KjU(); TextStyle textStyle2 = TextStyle.copy-p1EtxEg$default(textStyle1, textColor, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null); int k = TextOverflow.Companion.getEllipsis-gIe3tQ8(); Modifier modifier2 = PaddingKt.padding(RowScope.weight$default($this$invoke_u24lambda_u242, SizeKt.fillMaxWidth$default(TestTagKt.testTag((Modifier)Modifier.Companion, "Jewel.ComboBox.NonEditableText"), 0.0F, 1, null), 1.0F, false, 2, null), comboBoxStyle.getMetrics().getContentPadding()); TextKt.Text-bAzTDeA((String)it$iv, modifier2, 0L, 0L, null, null, null, 0L, null, 0, 0L, k, false, 1, null, textStyle2, composer2, 0, 3120, 22524); ComboBoxKt.access$Chevron(comboBoxStyle, bool1, composer2, 0); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 276 */       $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 277 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 278 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 279 */       if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   private static final Unit invoke$lambda$1$lambda$0(FocusProperties $this$focusProperties) {
/*     */     Intrinsics.checkNotNullParameter($this$focusProperties, "$this$focusProperties");
/*     */     $this$focusProperties.setCanFocus(false);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   ComboBoxKt$ComboBox$11$1(boolean $isEnabled, ComboBoxStyle $style, TextStyle $textStyle, String $labelText) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ComboBoxKt$ComboBox$11$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */