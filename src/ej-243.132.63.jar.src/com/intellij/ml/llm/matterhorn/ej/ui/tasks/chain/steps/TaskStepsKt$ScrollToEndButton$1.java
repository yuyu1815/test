/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*     */ 
/*     */ import androidx.compose.animation.AnimatedVisibilityScope;
/*     */ import androidx.compose.foundation.BackgroundKt;
/*     */ import androidx.compose.foundation.ClickableKt;
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.SizeKt;
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
/*     */ import androidx.compose.ui.draw.ClipKt;
/*     */ import androidx.compose.ui.graphics.Shape;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.semantics.Role;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.Job;
/*     */ import org.jetbrains.jewel.ui.component.IconKt;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ import org.jetbrains.jewel.ui.icon.PathIconKey;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nTaskSteps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskSteps.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$ScrollToEndButton$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,146:1\n149#2:147\n149#2:148\n149#2:149\n149#2:150\n1225#3,6:151\n71#4:157\n68#4,6:158\n74#4:192\n78#4:196\n79#5,6:164\n86#5,4:179\n90#5,2:189\n94#5:195\n368#6,9:170\n377#6:191\n378#6,2:193\n4034#7,6:183\n*S KotlinDebug\n*F\n+ 1 TaskSteps.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$ScrollToEndButton$1\n*L\n131#1:147\n132#1:148\n133#1:149\n134#1:150\n136#1:151,6\n129#1:157\n129#1:158,6\n129#1:192\n129#1:196\n129#1:164,6\n129#1:179,4\n129#1:189,2\n129#1:195\n129#1:170,9\n129#1:191\n129#1:193,2\n129#1:183,6\n*E\n"})
/*     */ final class TaskStepsKt$ScrollToEndButton$1
/*     */   implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
/* 129 */     Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "$this$AnimatedVisibility"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-584191007, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ScrollToEndButton.<anonymous> (TaskSteps.kt:128)");
/*     */     
/* 131 */     int $this$dp$iv = 12, $i$f$getDp = 0; $this$dp$iv = 12; $i$f$getDp = 0;
/* 132 */     $this$dp$iv = 40; $i$f$getDp = 0;
/* 133 */     $this$dp$iv = 14; $i$f$getDp = 0;
/* 134 */     $this$dp$iv = 14; $i$f$getDp = 0;
/*     */     
/* 136 */     $composer.startReplaceGroup(1537410248); Composer composer1 = $composer; boolean bool1 = $composer.changed(this.$onClick); Function0<Job> function0 = this.$onClick; int $i$f$cache = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 151 */     Object it$iv = composer1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */     
/* 153 */     Role role = null; String str = null; boolean bool = false; Modifier modifier3 = this.$this_ScrollToEndButton.align(ClipKt.clip(BackgroundKt.background-bw27NRU(SizeKt.size-3ABfNKs(PaddingKt.padding-qDBjuR0$default((Modifier)Modifier.Companion, 0.0F, 0.0F, Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv), 3, null), Dp.constructor-impl($this$dp$iv)), MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getArrowDownIconBackgroundColor-0d7_KjU(), (Shape)RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv))), (Shape)RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv))), Alignment.Companion.getBottomEnd()); int $i$a$-cache-TaskStepsKt$ScrollToEndButton$1$1 = 0; Function0 function03 = function0::invoke$lambda$1$lambda$0; Object value$iv = function03;
/* 154 */     composer1.updateRememberedValue(value$iv);
/* 155 */     Function0 function01 = (bool1 || it$iv == Composer.Companion.getEmpty()) ? (Function0)value$iv : 
/* 156 */       (Function0)it$iv; $composer.endReplaceGroup(); Modifier modifier1 = ClickableKt.clickable-XHw0xAI$default(modifier3, bool, str, role, function01, 7, null); int $changed$iv = 0; int $i$f$Box = 0;
/* 157 */     ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/* 158 */     Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/* 159 */     boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */     
/* 162 */     MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 163 */     int $i$f$Layout = 0;
/* 164 */     ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 165 */     int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 166 */     CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 167 */     Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */     
/* 169 */     Function0 function02 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 170 */     ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 171 */     if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 172 */       .startReusableNode();
/* 173 */     if ($composer.getInserting()) { $composer
/* 174 */         .createNode(function02); } else { $composer
/*     */         
/* 176 */         .useNode(); }
/*     */     
/* 178 */     Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 179 */     Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 180 */     Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */     
/* 182 */     Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 183 */     Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 184 */     if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 185 */       $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 186 */       $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */     } 
/*     */     
/* 189 */     Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */     
/* 191 */     int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 192 */     ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer2 = $composer$iv; BoxScope $this$invoke_u24lambda_u242 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-TaskStepsKt$ScrollToEndButton$1$2 = 0; PathIconKey pathIconKey = MatterhornThemeDataKt.getMatterhornTheme(composer2, 0).getArrowDownIcon(); Modifier modifier2 = $this$invoke_u24lambda_u242.align((Modifier)Modifier.Companion, Alignment.Companion.getCenter()); IconKt.Icon-FHprtrg((IconKey)pathIconKey, "scroll to end button", modifier2, null, 0L, new org.jetbrains.jewel.ui.painter.PainterHint[0], composer2, 0x30 | PathIconKey.$stable, 24); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 193 */     $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 194 */     ComposerKt.sourceInformationMarkerEnd($composer);
/* 195 */     ComposerKt.sourceInformationMarkerEnd($composer);
/* 196 */     if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd(); 
/*     */   }
/*     */   
/*     */   private static final Unit invoke$lambda$1$lambda$0(Function0 $onClick) {
/*     */     $onClick.invoke();
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   TaskStepsKt$ScrollToEndButton$1(BoxScope $receiver, Function0<Job> $onClick) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\TaskStepsKt$ScrollToEndButton$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */