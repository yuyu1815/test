/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.draw.AlphaKt;
/*     */ import androidx.compose.ui.graphics.ColorFilter;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.unit.DpSize;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.foundation.state.InteractiveComponentState;
/*     */ import org.jetbrains.jewel.ui.DisabledColorFilterKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.DropdownStyle;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ import org.jetbrains.jewel.ui.painter.PainterHint;
/*     */ import org.jetbrains.jewel.ui.painter.hints.StatefulKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nDropdown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dropdown.kt\norg/jetbrains/jewel/ui/component/DropdownKt$Dropdown$8$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,218:1\n71#2:219\n69#2,5:220\n74#2:253\n78#2:257\n71#2:258\n69#2,5:259\n74#2:292\n78#2:296\n79#3,6:225\n86#3,4:240\n90#3,2:250\n94#3:256\n79#3,6:264\n86#3,4:279\n90#3,2:289\n94#3:295\n368#4,9:231\n377#4:252\n378#4,2:254\n368#4,9:270\n377#4:291\n378#4,2:293\n4034#5,6:244\n4034#5,6:283\n*S KotlinDebug\n*F\n+ 1 Dropdown.kt\norg/jetbrains/jewel/ui/component/DropdownKt$Dropdown$8$1\n*L\n126#1:219\n126#1:220,5\n126#1:253\n126#1:257\n133#1:258\n133#1:259,5\n133#1:292\n133#1:296\n126#1:225,6\n126#1:240,4\n126#1:250,2\n126#1:256\n133#1:264,6\n133#1:279,4\n133#1:289,2\n133#1:295\n126#1:231,9\n126#1:252\n126#1:254,2\n133#1:270,9\n133#1:291\n133#1:293,2\n126#1:244,6\n133#1:283,6\n*E\n"})
/*     */ final class DropdownKt$Dropdown$8$1
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/* 126 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1762864020, $changed, -1, "org.jetbrains.jewel.ui.component.Dropdown.<anonymous>.<anonymous> (Dropdown.kt:125)");
/*     */       
/* 128 */       Modifier modifier1 = PaddingKt.padding-qDBjuR0$default(PaddingKt.padding(SizeKt.fillMaxWidth$default((Modifier)Modifier.Companion, 0.0F, 1, null), this.$style.getMetrics().getContentPadding()), 0.0F, 0.0F, DpSize.getWidth-D9Ej5fM(this.$arrowMinSize), 0.0F, 11, null);
/* 129 */       Alignment alignment1 = Alignment.Companion.getCenterStart();
/* 130 */       Function3<BoxScope, Composer, Integer, Unit> function3 = this.$content; int $changed$iv = 48;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       int $i$f$Box = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 219 */       ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/* 220 */       boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */       
/* 223 */       MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(alignment1, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 224 */       int $i$f$Layout = 0;
/* 225 */       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 226 */       int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 227 */       CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 228 */       Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */       
/* 230 */       Function0 function01 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 231 */       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 232 */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 233 */         .startReusableNode();
/* 234 */       if ($composer.getInserting()) { $composer
/* 235 */           .createNode(function01); } else { $composer
/*     */           
/* 237 */           .useNode(); }
/*     */       
/* 239 */       Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 240 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 241 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/* 243 */       Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 244 */       Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 245 */       if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 246 */         $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 247 */         $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */       } 
/*     */       
/* 250 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 252 */       int i6 = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 253 */       ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); function3.invoke(BoxScopeInstance.INSTANCE, $composer$iv, Integer.valueOf(0x6 | 0x70 & $changed$iv >> 6)); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 254 */       $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 255 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 256 */       ComposerKt.sourceInformationMarkerEnd($composer); Modifier modifier$iv = this.$this_Box.align(SizeKt.size-6HolHcs((Modifier)Modifier.Companion, this.$arrowMinSize), Alignment.Companion.getCenterEnd()); Alignment contentAlignment$iv = Alignment.Companion.getCenter(); DropdownStyle dropdownStyle = this.$style; MutableState<DropdownState> mutableState = this.$dropdownState$delegate;
/*     */       int i = 48, j = 0;
/* 258 */       ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/* 259 */       propagateMinConstraints$iv = false;
/*     */ 
/*     */       
/* 262 */       MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int k = 0x70 & i << 3;
/* 263 */       int m = 0;
/* 264 */       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 265 */       int n = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 266 */       CompositionLocalMap compositionLocalMap1 = $composer.getCurrentCompositionLocalMap();
/* 267 */       Modifier modifier2 = ComposedModifierKt.materializeModifier($composer, modifier$iv);
/*     */       
/* 269 */       Function0 function02 = ComposeUiNode.Companion.getConstructor(); int i1 = 0x6 | 0x380 & k << 6; int i2 = 0;
/* 270 */       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 271 */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 272 */         .startReusableNode();
/* 273 */       if ($composer.getInserting()) { $composer
/* 274 */           .createNode(function02); } else { $composer
/*     */           
/* 276 */           .useNode(); }
/*     */       
/* 278 */       Composer composer1 = Updater.constructor-impl($composer); int i3 = 0;
/* 279 */       Updater.set-impl(composer1, measurePolicy1, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 280 */       Updater.set-impl(composer1, compositionLocalMap1, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/* 282 */       Function2 function21 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i4 = 0;
/* 283 */       Composer composer2 = composer1; int i5 = 0;
/* 284 */       if (composer2.getInserting() || !Intrinsics.areEqual(composer2.rememberedValue(), Integer.valueOf(n))) {
/* 285 */         composer2.updateRememberedValue(Integer.valueOf(n));
/* 286 */         composer1.apply(Integer.valueOf(n), function21);
/*     */       } 
/*     */       
/* 289 */       Updater.set-impl(composer1, modifier2, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 291 */       int i7 = 0xE & i1 >> 6; Composer composer3 = $composer; int i8 = 0;
/* 292 */       ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int i9 = 0x6 | 0x70 & i >> 6; Composer composer4 = composer3; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-DropdownKt$Dropdown$8$1$1 = 0; float alpha = DropdownState.isEnabled-impl(DropdownKt.access$Dropdown$lambda$8(mutableState)) ? 1.0F : 0.5F; ColorFilter colorFilter = DropdownState.isEnabled-impl(DropdownKt.access$Dropdown$lambda$8(mutableState)) ? null : DisabledColorFilterKt.disabled(ColorFilter.Companion); Modifier modifier3 = AlphaKt.alpha((Modifier)Modifier.Companion, alpha); IconKey iconKey = dropdownStyle.getIcons().getChevronDown(); PainterHint painterHint = StatefulKt.Stateful((InteractiveComponentState)DropdownState.box-impl(DropdownKt.access$Dropdown$lambda$8(mutableState))); IconKt.Icon(iconKey, "Dropdown Chevron", modifier3, (Class<?>)null, colorFilter, painterHint, composer4, 48, 8); ComposerKt.sourceInformationMarkerEnd(composer3);
/* 293 */       $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 294 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 295 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 296 */       if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   DropdownKt$Dropdown$8$1(DropdownStyle $style, long $arrowMinSize, Function3<BoxScope, Composer, Integer, Unit> $content, BoxScope $receiver, MutableState<DropdownState> $dropdownState$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\DropdownKt$Dropdown$8$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */