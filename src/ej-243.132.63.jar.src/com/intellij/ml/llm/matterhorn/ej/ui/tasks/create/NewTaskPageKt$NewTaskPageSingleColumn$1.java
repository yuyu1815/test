/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.create;
/*     */ 
/*     */ import androidx.compose.foundation.BackgroundKt;
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*     */ import androidx.compose.foundation.layout.ColumnKt;
/*     */ import androidx.compose.foundation.layout.ColumnScope;
/*     */ import androidx.compose.foundation.layout.ColumnScopeInstance;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.foundation.text.input.TextFieldStateKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.components.ErrorComponentKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.components.JunieCircularProgressIndicatorKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.Tip;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptAreaKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptMode;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.flow.StateFlow;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nNewTaskPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewTaskPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskPageKt$NewTaskPageSingleColumn$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,164:1\n86#2:165\n82#2,7:166\n89#2:201\n86#2:203\n83#2,6:204\n89#2:238\n93#2:256\n93#2:306\n79#3,6:173\n86#3,4:188\n90#3,2:198\n79#3,6:210\n86#3,4:225\n90#3,2:235\n94#3:255\n79#3,6:263\n86#3,4:278\n90#3,2:288\n94#3:294\n94#3:305\n368#4,9:179\n377#4:200\n368#4,9:216\n377#4:237\n378#4,2:253\n368#4,9:269\n377#4:290\n378#4,2:292\n378#4,2:303\n4034#5,6:192\n4034#5,6:229\n4034#5,6:282\n149#6:202\n149#6:252\n149#6:302\n1225#7,6:239\n1225#7,6:245\n1225#7,6:296\n1#8:251\n71#9:257\n69#9,5:258\n74#9:291\n78#9:295\n81#10:307\n81#10:308\n*S KotlinDebug\n*F\n+ 1 NewTaskPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskPageKt$NewTaskPageSingleColumn$1\n*L\n89#1:165\n89#1:166,7\n89#1:201\n90#1:203\n90#1:204,6\n90#1:238\n90#1:256\n89#1:306\n89#1:173,6\n89#1:188,4\n89#1:198,2\n90#1:210,6\n90#1:225,4\n90#1:235,2\n90#1:255\n115#1:263,6\n115#1:278,4\n115#1:288,2\n115#1:294\n89#1:305\n89#1:179,9\n89#1:200\n90#1:216,9\n90#1:237\n90#1:253,2\n115#1:269,9\n115#1:290\n115#1:292,2\n89#1:303,2\n89#1:192,6\n90#1:229,6\n115#1:282,6\n94#1:202\n110#1:252\n125#1:302\n99#1:239,6\n108#1:245,6\n124#1:296,6\n115#1:257\n115#1:258,5\n115#1:291\n115#1:295\n112#1:307\n113#1:308\n*E\n"})
/*     */ final class NewTaskPageKt$NewTaskPageSingleColumn$1
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   private static final String invoke$lambda$13$lambda$7$lambda$3$lambda$2(boolean $sendPromptEnabled, PromptMode promptMode) {
/*     */     String str1, it;
/*     */     int $i$a$-takeIf-NewTaskPageKt$NewTaskPageSingleColumn$1$1$1$1$1$1, $i$a$-takeIf-NewTaskPageKt$NewTaskPageSingleColumn$1$1$1$1$1$2;
/*     */     Intrinsics.checkNotNullParameter(promptMode, "promptMode");
/*     */     switch (WhenMappings.$EnumSwitchMapping$0[promptMode.ordinal()]) {
/*     */       case 1:
/*     */         it = str1 = "Type your question here, press Enter to send prompt";
/*     */         $i$a$-takeIf-NewTaskPageKt$NewTaskPageSingleColumn$1$1$1$1$1$1 = 0;
/*     */         if (($sendPromptEnabled ? str1 : null) == null)
/*     */           $sendPromptEnabled ? str1 : null; 
/*     */         return "";
/*     */       case 2:
/*     */         it = str1 = "Type your task here, press Enter to send prompt";
/*     */         $i$a$-takeIf-NewTaskPageKt$NewTaskPageSingleColumn$1$1$1$1$1$2 = 0;
/*     */         if (($sendPromptEnabled ? str1 : null) == null)
/*     */           $sendPromptEnabled ? str1 : null; 
/*     */         return "";
/*     */     } 
/*     */     throw new NoWhenBranchMatchedException();
/*     */   }
/*     */   
/*     */   private static final Unit invoke$lambda$13$lambda$7$lambda$5$lambda$4(NewTaskViewModelImpl $model, PromptMode it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     $model.getPromptMode().setValue(it);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/*  89 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { ErrorInfo it; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-781311727, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskPageSingleColumn.<anonymous> (NewTaskPage.kt:88)");  NewTaskViewModelImpl newTaskViewModelImpl1 = this.$model; boolean bool1 = this.$sendPromptEnabled; State<ErrorInfo> state = this.$errorState$delegate; int $changed$iv = 0, $i$f$Column = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 165 */       ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/* 166 */       Modifier modifier$iv = (Modifier)Modifier.Companion;
/* 167 */       Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
/* 168 */       Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
/*     */ 
/*     */       
/* 171 */       MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 172 */       int $i$f$Layout = 0;
/* 173 */       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 174 */       int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 175 */       CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 176 */       Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
/*     */       
/* 178 */       Function0 function01 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 179 */       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 180 */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 181 */         .startReusableNode();
/* 182 */       if ($composer.getInserting()) { $composer
/* 183 */           .createNode(function01); } else { $composer
/*     */           
/* 185 */           .useNode(); }
/*     */       
/* 187 */       Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 188 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 189 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/* 191 */       Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 192 */       Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 193 */       if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 194 */         $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 195 */         $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */       } 
/*     */       
/* 198 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 200 */       int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-ColumnKt$Column$1$iv = 0;
/* 201 */       ComposerKt.sourceInformationMarkerStart($composer$iv, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; ColumnScope $this$invoke_u24lambda_u2413 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-NewTaskPageKt$NewTaskPageSingleColumn$1$1 = 0; int $this$dp$iv = 12, $i$f$getDp = 0;
/* 202 */       Modifier modifier1 = PaddingKt.padding-3ABfNKs(BackgroundKt.background-bw27NRU$default((Modifier)Modifier.Companion, MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getBackgroundColor-0d7_KjU(), null, 2, null), Dp.constructor-impl($this$dp$iv)); int k = 0; int m = 0;
/* 203 */       ComposerKt.sourceInformationMarkerStart(composer1, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/* 204 */       Arrangement.Vertical vertical1 = Arrangement.INSTANCE.getTop();
/* 205 */       Alignment.Horizontal horizontal1 = Alignment.Companion.getStart();
/*     */ 
/*     */       
/* 208 */       MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(vertical1, horizontal1, composer1, 0xE & k >> 3 | 0x70 & k >> 3); int n = 0x70 & k << 3;
/* 209 */       int i1 = 0;
/* 210 */       ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 211 */       int i2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
/* 212 */       CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
/* 213 */       Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
/*     */       
/* 215 */       Function0 function02 = ComposeUiNode.Companion.getConstructor(); int i3 = 0x6 | 0x380 & n << 6; int i4 = 0;
/* 216 */       ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 217 */       if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 218 */         .startReusableNode();
/* 219 */       if (composer1.getInserting()) { composer1
/* 220 */           .createNode(function02); } else { composer1
/*     */           
/* 222 */           .useNode(); }
/*     */       
/* 224 */       Composer composer2 = Updater.constructor-impl(composer1); int i5 = 0;
/* 225 */       Updater.set-impl(composer2, measurePolicy1, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 226 */       Updater.set-impl(composer2, compositionLocalMap1, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/* 228 */       Function2 function21 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i6 = 0;
/* 229 */       Composer composer3 = composer2; int i7 = 0;
/* 230 */       if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i2))) {
/* 231 */         composer3.updateRememberedValue(Integer.valueOf(i2));
/* 232 */         composer2.apply(Integer.valueOf(i2), function21);
/*     */       } 
/*     */       
/* 235 */       Updater.set-impl(composer2, modifier2, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 237 */       int i8 = 0xE & i3 >> 6; Composer composer4 = composer1; int i9 = 0;
/* 238 */       ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int i10 = 0x6 | 0x70 & k >> 6; Composer composer5 = composer4; ColumnScope $this$invoke_u24lambda_u2413_u24lambda_u247 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-NewTaskPageKt$NewTaskPageSingleColumn$1$1$1 = 0; composer5.startReplaceGroup(1256632829); Composer composer6 = composer5; boolean invalid$iv = composer5.changed(bool1); int $i$f$cache = 0;
/* 239 */       Object it$iv = composer6.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */       
/* 241 */       NewTaskViewModelImpl newTaskViewModelImpl2 = newTaskViewModelImpl1; boolean bool2 = bool1; Modifier modifier3 = null; int $i$a$-cache-NewTaskPageKt$NewTaskPageSingleColumn$1$1$1$1 = 0; Function1 function11 = bool1::invoke$lambda$13$lambda$7$lambda$3$lambda$2; Object value$iv = function11;
/* 242 */       composer6.updateRememberedValue(value$iv);
/* 243 */       Function1 function12 = (invalid$iv || it$iv == Composer.Companion.getEmpty()) ? (Function1)value$iv : 
/* 244 */         (Function1)it$iv; composer5.endReplaceGroup(); composer5.startReplaceGroup(1256645905); Composer $this$cache$iv = composer5; invalid$iv = composer5.changedInstance(newTaskViewModelImpl1); $i$f$cache = 0;
/* 245 */       it$iv = $this$cache$iv.rememberedValue(); $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */       
/* 247 */       PromptMode promptMode = (PromptMode)newTaskViewModelImpl1.getPromptMode().getValue(); function11 = function12; newTaskViewModelImpl2 = newTaskViewModelImpl2; bool2 = bool2; modifier3 = modifier3; int $i$a$-cache-NewTaskPageKt$NewTaskPageSingleColumn$1$1$1$2 = 0; Function1 function13 = newTaskViewModelImpl1::invoke$lambda$13$lambda$7$lambda$5$lambda$4; value$iv = function13;
/* 248 */       $this$cache$iv.updateRememberedValue(value$iv);
/* 249 */       function12 = (invalid$iv || it$iv == Composer.Companion.getEmpty()) ? (Function1)value$iv : 
/* 250 */         (Function1)it$iv; composer5.endReplaceGroup(); PromptAreaKt.PromptArea(modifier3, bool2, newTaskViewModelImpl2, function11, promptMode, function12, composer5, 0, 1); ErrorInfo errorInfo1 = NewTaskPageKt.access$NewTaskPageSingleColumn$lambda$13(state); composer5.startReplaceGroup(1256647943);
/* 251 */       int $i$a$-let-NewTaskPageKt$NewTaskPageSingleColumn$1$1$1$3 = 0; int i11 = 12, i12 = 0;
/* 252 */       ErrorComponentKt.ErrorComponent(PaddingKt.padding-VpY3zN4$default((Modifier)Modifier.Companion, 0.0F, Dp.constructor-impl(i11), 1, null), it, composer5, 6, 0); (errorInfo1 == null) ? null : Unit.INSTANCE; composer5.endReplaceGroup(); ComposerKt.sourceInformationMarkerEnd(composer4);
/* 253 */       composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 254 */       ComposerKt.sourceInformationMarkerEnd(composer1);
/* 255 */       ComposerKt.sourceInformationMarkerEnd(composer1); State<? extends List<Tip>> tips$delegate = SnapshotStateKt.collectAsState((StateFlow)newTaskViewModelImpl1.getTips(), null, composer1, 0, 1); State<? extends RecentTaskLoadState> taskHistory$delegate = SnapshotStateKt.collectAsState(newTaskViewModelImpl1.getRecentTasks(), null, composer1, 0, 1); RecentTaskLoadState recentTasksList = invoke$lambda$13$lambda$9(taskHistory$delegate); if (Intrinsics.areEqual(recentTasksList, RecentTaskLoadState.Loading.INSTANCE))
/*     */       { composer1.startReplaceGroup(-1490222153); Modifier modifier4 = SizeKt.fillMaxWidth$default((Modifier)Modifier.Companion, 0.0F, 1, null); Alignment alignment = Alignment.Companion.getCenter(); int i13 = 54; int $i$f$Box = 0;
/* 257 */         ComposerKt.sourceInformationMarkerStart(composer1, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/* 258 */         boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */         
/* 261 */         MeasurePolicy measurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment, propagateMinConstraints$iv); int i14 = 0x70 & i13 << 3;
/* 262 */         int i15 = 0;
/* 263 */         ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 264 */         int i16 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
/* 265 */         CompositionLocalMap compositionLocalMap = composer1.getCurrentCompositionLocalMap();
/* 266 */         Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
/*     */         
/* 268 */         Function0 function0 = ComposeUiNode.Companion.getConstructor(); int i17 = 0x6 | 0x380 & i14 << 6; int i18 = 0;
/* 269 */         ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 270 */         if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 271 */           .startReusableNode();
/* 272 */         if (composer1.getInserting()) { composer1
/* 273 */             .createNode(function0); } else { composer1
/*     */             
/* 275 */             .useNode(); }
/*     */         
/* 277 */         Composer composer7 = Updater.constructor-impl(composer1); int i19 = 0;
/* 278 */         Updater.set-impl(composer7, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 279 */         Updater.set-impl(composer7, compositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         
/* 281 */         Function2 function2 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i20 = 0;
/* 282 */         Composer composer8 = composer7; int i21 = 0;
/* 283 */         if (composer8.getInserting() || !Intrinsics.areEqual(composer8.rememberedValue(), Integer.valueOf(i16))) {
/* 284 */           composer8.updateRememberedValue(Integer.valueOf(i16));
/* 285 */           composer7.apply(Integer.valueOf(i16), function2);
/*     */         } 
/*     */         
/* 288 */         Updater.set-impl(composer7, modifier5, ComposeUiNode.Companion.getSetModifier());
/*     */         
/* 290 */         int i22 = 0xE & i17 >> 6; Composer composer9 = composer1; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 291 */         ComposerKt.sourceInformationMarkerStart(composer9, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); $i$a$-Column-NewTaskPageKt$NewTaskPageSingleColumn$1$1$1 = 0x6 | 0x70 & i13 >> 6; $this$cache$iv = composer9; BoxScope $this$invoke_u24lambda_u2413_u24lambda_u2410 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-NewTaskPageKt$NewTaskPageSingleColumn$1$1$2 = 0; JunieCircularProgressIndicatorKt.JunieCircularProgressIndicator-3IgeMak(null, 0L, null, $this$cache$iv, 0, 7); ComposerKt.sourceInformationMarkerEnd(composer9);
/* 292 */         composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 293 */         ComposerKt.sourceInformationMarkerEnd(composer1);
/* 294 */         ComposerKt.sourceInformationMarkerEnd(composer1); composer1.endReplaceGroup(); }
/*     */       else if (recentTasksList instanceof RecentTaskLoadState.Ready)
/* 296 */       { composer1.startReplaceGroup(-1490216475); composer1.startReplaceGroup(-1490212187); Composer composer = composer1; boolean bool = composer1.changedInstance(newTaskViewModelImpl1); int i15 = 0; Object object1 = composer.rememberedValue(); int i16 = 0;
/*     */         
/* 298 */         List<Tip> list = invoke$lambda$13$lambda$8(tips$delegate); NewTaskViewModelImpl newTaskViewModelImpl = newTaskViewModelImpl1; List<SortedRecentTaskChain> list1 = ((RecentTaskLoadState.Ready)recentTasksList).getTasks(); int $i$a$-cache-NewTaskPageKt$NewTaskPageSingleColumn$1$1$3 = 0; Function1 function15 = newTaskViewModelImpl1::invoke$lambda$13$lambda$12$lambda$11; Object object2 = function15;
/* 299 */         composer.updateRememberedValue(object2);
/* 300 */         Function1 function14 = (bool || object1 == Composer.Companion.getEmpty()) ? (Function1)object2 : 
/* 301 */           (Function1)object1; composer1.endReplaceGroup(); int i13 = 12, i14 = 0;
/* 302 */         NewTaskPageKt.access$ShowTaskExplorer-3xixttE(list1, newTaskViewModelImpl, list, function14, Dp.constructor-impl(i13), composer1, 24576); composer1.endReplaceGroup(); } else { composer1.startReplaceGroup(-1490224403); composer1.endReplaceGroup(); throw new NoWhenBranchMatchedException(); }
/* 303 */        ComposerKt.sourceInformationMarkerEnd($composer$iv); $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 304 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 305 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 306 */       if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/* 307 */      } private static final List<Tip> invoke$lambda$13$lambda$8(State $tips$delegate) { State state = $tips$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (List<Tip>)state.getValue(); } private static final RecentTaskLoadState invoke$lambda$13$lambda$9(State $taskHistory$delegate) { State state = $taskHistory$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 308 */     return (RecentTaskLoadState)state.getValue(); }
/*     */ 
/*     */   
/*     */   private static final Unit invoke$lambda$13$lambda$12$lambda$11(NewTaskViewModelImpl $model, String it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     TextFieldStateKt.setTextAndPlaceCursorAtEnd($model.getTextState(), it);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   NewTaskPageKt$NewTaskPageSingleColumn$1(NewTaskViewModelImpl $model, boolean $sendPromptEnabled, State<ErrorInfo> $errorState$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\create\NewTaskPageKt$NewTaskPageSingleColumn$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */