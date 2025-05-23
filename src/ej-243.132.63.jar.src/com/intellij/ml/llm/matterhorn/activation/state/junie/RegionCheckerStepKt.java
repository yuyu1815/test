/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ 
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.DisposableEffectScope;
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.runtime.State;
/*    */ import com.intellij.ide.Region;
/*    */ import com.intellij.ide.RegionSettings;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.RegionCheckStep;
/*    */ import com.intellij.util.messages.MessageBusConnection;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\032\r\020\000\032\0020\001H\007¢\006\002\020\002¨\006\003²\006\017\020\004\032\0070\005¢\006\002\b\006X\002"}, d2 = {"regionCheckerStep", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/RegionCheckStep;", "(Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/model/RegionCheckStep;", "state.junie.impl", "region", "Lcom/intellij/ide/Region;", "Lorg/jetbrains/annotations/NotNull;"})
/*    */ @SourceDebugExtension({"SMAP\nregionCheckerStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 regionCheckerStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/RegionCheckerStepKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,47:1\n1225#2,6:48\n1225#2,6:54\n81#3:60\n107#3,2:61\n63#4,5:63\n*S KotlinDebug\n*F\n+ 1 regionCheckerStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/RegionCheckerStepKt\n*L\n22#1:48,6\n28#1:54,6\n22#1:60\n22#1:61,2\n38#1:63,5\n*E\n"})
/*    */ public final class RegionCheckerStepKt {
/*    */   @Composable
/*    */   @NotNull
/* 20 */   public static final RegionCheckStep regionCheckerStep(@Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(1727871978); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1727871978, $changed, -1, "com.intellij.ml.llm.matterhorn.activation.state.junie.regionCheckerStep (regionCheckerStep.kt:19)");  $composer.startReplaceGroup(-223544138); Composer composer1 = $composer; boolean invalid$iv = false;
/*    */     
/* 22 */     int $i$f$cache = 0;
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
/* 48 */     Object it$iv = composer1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 49 */     if (it$iv == Composer.Companion.getEmpty()) {
/* 50 */       int $i$a$-cache-RegionCheckerStepKt$regionCheckerStep$region$2 = 0;
/*    */     }
/*    */     
/* 53 */     MutableState<Region> mutableState1 = (MutableState)it$iv; $composer.endReplaceGroup(); MutableState<Region> region$delegate = mutableState1; $composer.startReplaceGroup(-223540566); Composer $this$cache$iv = $composer; invalid$iv = false; $i$f$cache = 0;
/* 54 */     it$iv = $this$cache$iv.rememberedValue(); $i$a$-let-ComposerKt$cache$1$iv = 0;
/*    */     
/* 56 */     Unit unit = Unit.INSTANCE; int $i$a$-cache-RegionCheckerStepKt$regionCheckerStep$1 = 0; Object value$iv = RegionCheckerStepKt::regionCheckerStep$lambda$5$lambda$4;
/* 57 */     $this$cache$iv.updateRememberedValue(value$iv);
/* 58 */     Function1 function1 = (it$iv == Composer.Companion.getEmpty()) ? (Function1)value$iv : 
/* 59 */       (Function1)it$iv; $composer.endReplaceGroup(); EffectsKt.DisposableEffect(unit, function1, $composer, 54); if (regionCheckerStep$lambda$1(region$delegate) == Region.CHINA) { RegionCheckStep regionCheckStep1 = new RegionCheckStep(OutcomeKt.activationRoadblocked((AiaActivationRoadblocked)JunieRegionCheckProhibited.INSTANCE), null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return regionCheckStep1; }  RegionCheckStep regionCheckStep = new RegionCheckStep(OutcomeKt.done(Unit.INSTANCE), null); if (ComposerKt.isTraceInProgress())
/* 60 */       ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return regionCheckStep; } private static final Region regionCheckerStep$lambda$1(MutableState $region$delegate) { State state = (State)$region$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (Region)state.getValue(); } private static final void regionCheckerStep$lambda$2(MutableState $region$delegate, Region <set-?>) { MutableState mutableState = $region$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 61 */     mutableState.setValue(<set-?>); } private static final DisposableEffectResult regionCheckerStep$lambda$5$lambda$4(DisposableEffectScope $this$DisposableEffect) { Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect"); MessageBusConnection connect = ApplicationKt.getApplication().getMessageBus().connect(); Intrinsics.checkNotNullExpressionValue(RegionSettings.RegionSettingsListener.UPDATE_TOPIC, "UPDATE_TOPIC"); connect.subscribe(RegionSettings.RegionSettingsListener.UPDATE_TOPIC, new RegionCheckerStepKt$regionCheckerStep$1$1$1()); DisposableEffectScope this_$iv = $this$DisposableEffect;
/*    */     int $i$f$onDispose = 0;
/* 63 */     return new RegionCheckerStepKt$regionCheckerStep$lambda$5$lambda$4$$inlined$onDispose$1(connect); }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/matterhorn/activation/state/junie/RegionCheckerStepKt$regionCheckerStep$1$1$1", "Lcom/intellij/ide/RegionSettings$RegionSettingsListener;", "regionChanged", "", "state.junie.impl"})
/*    */   public static final class RegionCheckerStepKt$regionCheckerStep$1$1$1 implements RegionSettings.RegionSettingsListener {
/*    */     public void regionChanged() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\RegionCheckerStepKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */