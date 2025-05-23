/*     */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*     */ 
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicense;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseAgreement;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseAgreementRepository;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AipLicenseAgreementAcceptPending;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.Outcome;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.reflect.KFunction;
/*     */ import kotlin.time.DurationKt;
/*     */ import kotlin.time.DurationUnit;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.DelayKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\002\032%\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\001¢\006\002\020\b\032\020\020\t\032\0020\0072\006\020\004\032\0020\005H\002\"\016\020\n\032\0020\013X\004¢\006\002\n\000¨\006\f²\006\n\020\r\032\0020\007X\002²\006\026\020\016\032\016\022\004\022\0020\020\022\004\022\0020\0210\017X\002"}, d2 = {"aipLicenseAgreementAcceptStep", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;", "agreement", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;", "license", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;", "licenseAgreementAutoAccept", "", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;ZLandroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;", "isEndUserAbleToAcceptAgreement", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "state.junie.impl", "localAgreementAcceptPerformed", "outcome", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptPending;", ""})
/*     */ @SourceDebugExtension({"SMAP\naipLicenseAgreementAcceptStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 aipLicenseAgreementAcceptStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseAgreementAcceptStepKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,115:1\n1225#2,6:116\n1225#2,6:122\n1225#2,6:128\n1225#2,6:134\n1225#2,6:140\n1225#2,3:151\n1228#2,3:157\n1225#2,6:161\n1225#2,6:167\n481#3:146\n480#3,4:147\n484#3,2:154\n488#3:160\n480#4:156\n81#5:173\n107#5,2:174\n81#5:176\n107#5,2:177\n58#6:179\n36#6,2:180\n*S KotlinDebug\n*F\n+ 1 aipLicenseAgreementAcceptStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseAgreementAcceptStepKt\n*L\n33#1:116,6\n37#1:122,6\n58#1:128,6\n62#1:134,6\n78#1:140,6\n82#1:151,3\n82#1:157,3\n103#1:161,6\n104#1:167,6\n82#1:146\n82#1:147,4\n82#1:154,2\n82#1:160\n82#1:156\n37#1:173\n37#1:174,2\n58#1:176\n58#1:177,2\n114#1:179\n114#1:180,2\n*E\n"})
/*     */ public final class AipLicenseAgreementAcceptStepKt {
/*     */   @Composable
/*     */   @NotNull
/*  32 */   public static final AipLicenseAgreementAcceptStep aipLicenseAgreementAcceptStep(@NotNull AipLicenseAgreement agreement, @NotNull AipLicense license, boolean licenseAgreementAutoAccept, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(agreement, "agreement"); Intrinsics.checkNotNullParameter(license, "license"); $composer.startReplaceGroup(-870890577); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-870890577, $changed, -1, "com.intellij.ml.llm.matterhorn.activation.state.junie.aipLicenseAgreementAcceptStep (aipLicenseAgreementAcceptStep.kt:31)"); 
/*  33 */     $composer.startReplaceGroup(1499024691); Composer composer1 = $composer; boolean invalid$iv = false; int $i$f$cache = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     Object it$iv = composer1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */     
/* 118 */     Logger logger = LOG; int $i$a$-cache-AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$1 = 0; Object value$iv = AipLicenseAgreementAcceptStepKt::aipLicenseAgreementAcceptStep$lambda$1$lambda$0;
/* 119 */     composer1.updateRememberedValue(value$iv);
/* 120 */     Function0 function01 = (it$iv == Composer.Companion.getEmpty()) ? (Function0)value$iv : 
/* 121 */       (Function0)it$iv; $composer.endReplaceGroup(); LoggingComposeKt.TraceComposition(logger, function01, $composer, 48); String agreementId = agreement.getName() + agreement.getName(); $composer.startReplaceGroup(1499029917); Composer composer2 = $composer; int i = $composer.changed(agreementId) | $composer.changed(license), k = 0;
/* 122 */     Object object1 = composer2.rememberedValue(); int i1 = 0;
/* 123 */     if (i != 0 || object1 == Composer.Companion.getEmpty()) {
/* 124 */       int $i$a$-cache-AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$localAgreementAcceptPerformed$2 = 0; Object object = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(false), null, 2, null);
/* 125 */       composer2.updateRememberedValue(object);
/*     */     } 
/* 127 */     MutableState<Boolean> mutableState1 = (MutableState)object1; $composer.endReplaceGroup(); MutableState<Boolean> localAgreementAcceptPerformed$delegate = mutableState1; $composer.startReplaceGroup(1499062984); Composer composer3 = $composer; boolean bool1 = $composer.changed(agreementId); int m = 0;
/* 128 */     Object object2 = composer3.rememberedValue(); int i3 = 0;
/* 129 */     if (bool1 || object2 == Composer.Companion.getEmpty()) {
/* 130 */       int $i$a$-cache-AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$outcome$2 = 0; Object object = SnapshotStateKt.mutableStateOf$default(Outcome.box-impl(OutcomeKt.activationProgressing((AiaActivationProgressing)AipLicenseAgreementAcceptPending.AipLicenseAgreementAcceptStateInitializing.INSTANCE)), null, 2, null);
/* 131 */       composer3.updateRememberedValue(object);
/*     */     } 
/* 133 */     MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> mutableState2 = (MutableState)object2; $composer.endReplaceGroup(); MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> outcome$delegate = mutableState2; $composer.startReplaceGroup(1499069615); Composer $this$cache$iv = $composer; int j = $composer.changed(outcome$delegate) | (((($changed & 0x380 ^ 0x180) > 256 && $composer.changed(licenseAgreementAutoAccept)) || ($changed & 0x180) == 256) ? 1 : 0) | $composer.changedInstance(agreement) | $composer.changed(localAgreementAcceptPerformed$delegate); m = 0;
/* 134 */     object2 = $this$cache$iv.rememberedValue(); i3 = 0;
/* 135 */     if (j != 0 || object2 == Composer.Companion.getEmpty()) {
/* 136 */       AipLicense aipLicense = license; AipLicenseAgreement aipLicenseAgreement = agreement; int $i$a$-cache-AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$2 = 0; AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$2$1 aipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$2$1 = new AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$2$1(licenseAgreementAutoAccept, agreement, localAgreementAcceptPerformed$delegate, outcome$delegate, null); Object object = aipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$2$1;
/* 137 */       $this$cache$iv.updateRememberedValue(object);
/*     */     } 
/* 139 */     Function2 function2 = (Function2)object2; $composer.endReplaceGroup(); EffectsKt.LaunchedEffect(aipLicenseAgreement, aipLicense, function2, $composer, 0xE & $changed | 0x70 & $changed); ActivityLauncher acceptActivity = ActivityLauncherKt.rememberActivityLauncher($composer, 0); $composer.startReplaceGroup(1499083139); Composer composer4 = $composer; int n = $composer.changed(outcome$delegate) | $composer.changedInstance(agreement) | $composer.changed(localAgreementAcceptPerformed$delegate), i2 = 0;
/* 140 */     Object object4 = composer4.rememberedValue(); int i5 = 0;
/* 141 */     if (n != 0 || object4 == Composer.Companion.getEmpty()) {
/* 142 */       ActivityLauncher activityLauncher = acceptActivity; int $i$a$-cache-AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$acceptCallable$1 = 0; Object object = new AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$acceptCallable$1$1(agreement, localAgreementAcceptPerformed$delegate, outcome$delegate, null);
/* 143 */       composer4.updateRememberedValue(object);
/*     */     } 
/* 145 */     Function1 function1 = (Function1)object4; $composer.endReplaceGroup(); ActivityCallable acceptCallable = ActivityCallableKt.bind(activityLauncher, function1); int $changed$iv = 0; int $i$f$rememberCoroutineScope = 0;
/* 146 */     ComposerKt.sourceInformationMarkerStart($composer, 773894976, "CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp");
/*     */ 
/*     */     
/* 149 */     Composer composer$iv = $composer;
/* 150 */     ComposerKt.sourceInformationMarkerStart($composer, -954370320, "CC(remember):Effects.kt#9igjgp"); Composer composer5 = $composer; boolean invalid$iv$iv = false; int i9 = 0;
/* 151 */     Object it$iv$iv = composer5.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv$iv = 0;
/*     */     
/* 153 */     int $i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv = 0;
/*     */     
/* 155 */     int $i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1 = 0; CoroutineScope coroutineScope2 = EffectsKt.createCompositionCoroutineScope(
/* 156 */         (CoroutineContext)EmptyCoroutineContext.INSTANCE, composer$iv); Object value$iv$iv = new CompositionScopedCoroutineScopeCanceller(coroutineScope2);
/* 157 */     composer5.updateRememberedValue(value$iv$iv);
/* 158 */     CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1 = (it$iv$iv == Composer.Companion.getEmpty()) ? (CompositionScopedCoroutineScopeCanceller)value$iv$iv : 
/* 159 */       (CompositionScopedCoroutineScopeCanceller)it$iv$iv; ComposerKt.sourceInformationMarkerEnd($composer); CompositionScopedCoroutineScopeCanceller wrapper$iv = compositionScopedCoroutineScopeCanceller1;
/* 160 */     CoroutineScope coroutineScope1 = wrapper$iv.getCoroutineScope(); ComposerKt.sourceInformationMarkerEnd($composer); CoroutineScope scope = coroutineScope1; $composer.startReplaceGroup(1499115379); composer$iv = $composer; int i4 = $composer.changedInstance(scope) | $composer.changed(outcome$delegate) | $composer.changedInstance(agreement); int i7 = 0;
/* 161 */     Object object5 = composer$iv.rememberedValue(); int i10 = 0;
/* 162 */     if (i4 != 0 || object5 == Composer.Companion.getEmpty()) {
/* 163 */       int $i$a$-cache-AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$3 = 0; Object object = new AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$3$1(scope, agreement, outcome$delegate);
/* 164 */       composer$iv.updateRememberedValue(object);
/*     */     } 
/* 166 */     Function0 function03 = (Function0)object5; $composer.endReplaceGroup(); Function0 function02 = function03; Object object3 = aipLicenseAgreementAcceptStep$lambda$6(outcome$delegate); $composer.startReplaceGroup(1499116728); Composer $this$cache$iv$iv = $composer; int i6 = $composer.changed(outcome$delegate) | $composer.changed(localAgreementAcceptPerformed$delegate) | $composer.changedInstance(license); int i8 = 0;
/* 167 */     Object object6 = $this$cache$iv$iv.rememberedValue(); int i11 = 0;
/*     */     
/* 169 */     Function0 function04 = (Function0)acceptCallable; AipLicenseAgreement aipLicenseAgreement1 = agreement; int $i$a$-cache-AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$4 = 0; KFunction kFunction2 = (KFunction)new AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$4$1(license, localAgreementAcceptPerformed$delegate, outcome$delegate); Object object7 = kFunction2;
/* 170 */     $this$cache$iv$iv.updateRememberedValue(object7);
/* 171 */     KFunction kFunction1 = (i6 != 0 || object6 == Composer.Companion.getEmpty()) ? (KFunction)object7 : 
/* 172 */       (KFunction)object6; $composer.endReplaceGroup(); DefaultConstructorMarker defaultConstructorMarker = null; Object object8 = object3; Function0 function05 = function02, function06 = (Function0)kFunction1, function07 = function04; AipLicenseAgreement aipLicenseAgreement2 = aipLicenseAgreement1; AipLicenseAgreementAcceptStep aipLicenseAgreementAcceptStep = new AipLicenseAgreementAcceptStep(aipLicenseAgreement2, function07, function06, function05, object8, defaultConstructorMarker); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return aipLicenseAgreementAcceptStep; }
/* 173 */   @NotNull private static final Logger LOG; private static final String aipLicenseAgreementAcceptStep$lambda$1$lambda$0() { return "AI Pro accept end user license agreement"; } private static final boolean aipLicenseAgreementAcceptStep$lambda$3(MutableState $localAgreementAcceptPerformed$delegate) { State state = (State)$localAgreementAcceptPerformed$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } private static final void aipLicenseAgreementAcceptStep$lambda$4(MutableState $localAgreementAcceptPerformed$delegate, boolean <set-?>) { MutableState mutableState = $localAgreementAcceptPerformed$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 174 */     mutableState.setValue(value$iv); } private static final Object aipLicenseAgreementAcceptStep$initial(AipLicenseAgreement $agreement, Continuation $completion) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$initial$1
/*     */     //   4: ifeq -> 41
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$initial$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload #5
/*     */     //   27: dup
/*     */     //   28: getfield label : I
/*     */     //   31: ldc_w -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 51
/*     */     //   41: new com/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$initial$1
/*     */     //   44: dup
/*     */     //   45: aload_1
/*     */     //   46: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   49: astore #5
/*     */     //   51: aload #5
/*     */     //   53: getfield result : Ljava/lang/Object;
/*     */     //   56: astore #4
/*     */     //   58: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   61: astore #6
/*     */     //   63: aload #5
/*     */     //   65: getfield label : I
/*     */     //   68: tableswitch default -> 261, 0 -> 96, 1 -> 130, 2 -> 179
/*     */     //   96: aload #4
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: getstatic com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepository.Companion : Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepository$Companion;
/*     */     //   104: aload #5
/*     */     //   106: aload #5
/*     */     //   108: aload_0
/*     */     //   109: putfield L$0 : Ljava/lang/Object;
/*     */     //   112: aload #5
/*     */     //   114: iconst_1
/*     */     //   115: putfield label : I
/*     */     //   118: invokevirtual instance : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   121: dup
/*     */     //   122: aload #6
/*     */     //   124: if_acmpne -> 146
/*     */     //   127: aload #6
/*     */     //   129: areturn
/*     */     //   130: aload #5
/*     */     //   132: getfield L$0 : Ljava/lang/Object;
/*     */     //   135: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement
/*     */     //   138: astore_0
/*     */     //   139: aload #4
/*     */     //   141: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   144: aload #4
/*     */     //   146: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepository
/*     */     //   149: astore_2
/*     */     //   150: aload_2
/*     */     //   151: aload #5
/*     */     //   153: aload #5
/*     */     //   155: aload_0
/*     */     //   156: putfield L$0 : Ljava/lang/Object;
/*     */     //   159: aload #5
/*     */     //   161: iconst_2
/*     */     //   162: putfield label : I
/*     */     //   165: invokeinterface getLocalAcceptedVersion : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   170: dup
/*     */     //   171: aload #6
/*     */     //   173: if_acmpne -> 195
/*     */     //   176: aload #6
/*     */     //   178: areturn
/*     */     //   179: aload #5
/*     */     //   181: getfield L$0 : Ljava/lang/Object;
/*     */     //   184: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement
/*     */     //   187: astore_0
/*     */     //   188: aload #4
/*     */     //   190: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   193: aload #4
/*     */     //   195: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement$Version
/*     */     //   198: astore_3
/*     */     //   199: nop
/*     */     //   200: aload_3
/*     */     //   201: getstatic com/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement$Version.Companion : Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement$Version$Companion;
/*     */     //   204: invokevirtual getUnknown : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement$Version;
/*     */     //   207: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   210: ifeq -> 225
/*     */     //   213: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptPending$AipLicenseAgreementAcceptRequired$AipLicenseEndUserMayAcceptAgreementFirstTime.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptPending$AipLicenseAgreementAcceptRequired$AipLicenseEndUserMayAcceptAgreementFirstTime;
/*     */     //   216: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked
/*     */     //   219: invokestatic activationRoadblocked : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked;)Ljava/lang/Object;
/*     */     //   222: goto -> 260
/*     */     //   225: aload_3
/*     */     //   226: invokevirtual getMajor : ()I
/*     */     //   229: aload_0
/*     */     //   230: invokevirtual getDocument : ()Lcom/intellij/ide/gdpr/EndUserAgreement$Document;
/*     */     //   233: invokevirtual getVersion : ()Lcom/intellij/ide/gdpr/Version;
/*     */     //   236: invokevirtual getMajor : ()I
/*     */     //   239: if_icmpge -> 254
/*     */     //   242: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptPending$AipLicenseAgreementAcceptRequired$AipLicenseEndUserMayAcceptAgreementUpdatedVersion.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptPending$AipLicenseAgreementAcceptRequired$AipLicenseEndUserMayAcceptAgreementUpdatedVersion;
/*     */     //   245: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked
/*     */     //   248: invokestatic activationRoadblocked : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked;)Ljava/lang/Object;
/*     */     //   251: goto -> 260
/*     */     //   254: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   257: invokestatic done : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   260: areturn
/*     */     //   261: new java/lang/IllegalStateException
/*     */     //   264: dup
/*     */     //   265: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   268: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   271: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #39	-> 61
/*     */     //   #40	-> 101
/*     */     //   #39	-> 127
/*     */     //   #41	-> 150
/*     */     //   #39	-> 176
/*     */     //   #42	-> 199
/*     */     //   #43	-> 200
/*     */     //   #44	-> 225
/*     */     //   #45	-> 254
/*     */     //   #42	-> 260
/*     */     //   #39	-> 261
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	29	0	$agreement	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;
/*     */     //   139	40	0	$agreement	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;
/*     */     //   188	37	0	$agreement	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;
/*     */     //   225	29	0	$agreement	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;
/*     */     //   150	20	2	repository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepository;
/*     */     //   199	26	3	acceptedVersion	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement$Version;
/*     */     //   225	29	3	acceptedVersion	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement$Version;
/*     */     //   0	272	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   51	210	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   58	203	4	$result	Ljava/lang/Object; }
/*     */   private static final Object aipLicenseAgreementAcceptStep$doAccept(AipLicenseAgreement $agreement, MutableState localAgreementAcceptPerformed$delegate, Continuation $completion) { // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$doAccept$1
/*     */     //   4: ifeq -> 41
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$doAccept$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload #5
/*     */     //   27: dup
/*     */     //   28: getfield label : I
/*     */     //   31: ldc_w -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 51
/*     */     //   41: new com/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$doAccept$1
/*     */     //   44: dup
/*     */     //   45: aload_2
/*     */     //   46: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   49: astore #5
/*     */     //   51: aload #5
/*     */     //   53: getfield result : Ljava/lang/Object;
/*     */     //   56: astore #4
/*     */     //   58: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   61: astore #6
/*     */     //   63: aload #5
/*     */     //   65: getfield label : I
/*     */     //   68: tableswitch default -> 353, 0 -> 104, 1 -> 144, 2 -> 209, 3 -> 270, 4 -> 324
/*     */     //   104: aload #4
/*     */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   109: getstatic com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepository.Companion : Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepository$Companion;
/*     */     //   112: aload #5
/*     */     //   114: aload #5
/*     */     //   116: aload_0
/*     */     //   117: putfield L$0 : Ljava/lang/Object;
/*     */     //   120: aload #5
/*     */     //   122: aload_1
/*     */     //   123: putfield L$1 : Ljava/lang/Object;
/*     */     //   126: aload #5
/*     */     //   128: iconst_1
/*     */     //   129: putfield label : I
/*     */     //   132: invokevirtual instance : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   135: dup
/*     */     //   136: aload #6
/*     */     //   138: if_acmpne -> 169
/*     */     //   141: aload #6
/*     */     //   143: areturn
/*     */     //   144: aload #5
/*     */     //   146: getfield L$1 : Ljava/lang/Object;
/*     */     //   149: checkcast androidx/compose/runtime/MutableState
/*     */     //   152: astore_1
/*     */     //   153: aload #5
/*     */     //   155: getfield L$0 : Ljava/lang/Object;
/*     */     //   158: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement
/*     */     //   161: astore_0
/*     */     //   162: aload #4
/*     */     //   164: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   167: aload #4
/*     */     //   169: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepository
/*     */     //   172: astore_3
/*     */     //   173: aload_3
/*     */     //   174: aload_0
/*     */     //   175: aload #5
/*     */     //   177: aload #5
/*     */     //   179: aload_1
/*     */     //   180: putfield L$0 : Ljava/lang/Object;
/*     */     //   183: aload #5
/*     */     //   185: aload_3
/*     */     //   186: putfield L$1 : Ljava/lang/Object;
/*     */     //   189: aload #5
/*     */     //   191: iconst_2
/*     */     //   192: putfield label : I
/*     */     //   195: invokeinterface setLocalAcceptedVersion : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   200: dup
/*     */     //   201: aload #6
/*     */     //   203: if_acmpne -> 234
/*     */     //   206: aload #6
/*     */     //   208: areturn
/*     */     //   209: aload #5
/*     */     //   211: getfield L$1 : Ljava/lang/Object;
/*     */     //   214: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepository
/*     */     //   217: astore_3
/*     */     //   218: aload #5
/*     */     //   220: getfield L$0 : Ljava/lang/Object;
/*     */     //   223: checkcast androidx/compose/runtime/MutableState
/*     */     //   226: astore_1
/*     */     //   227: aload #4
/*     */     //   229: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   232: aload #4
/*     */     //   234: pop
/*     */     //   235: aload_3
/*     */     //   236: aload #5
/*     */     //   238: aload #5
/*     */     //   240: aload_1
/*     */     //   241: putfield L$0 : Ljava/lang/Object;
/*     */     //   244: aload #5
/*     */     //   246: aconst_null
/*     */     //   247: putfield L$1 : Ljava/lang/Object;
/*     */     //   250: aload #5
/*     */     //   252: iconst_3
/*     */     //   253: putfield label : I
/*     */     //   256: invokeinterface updateAgreementDocument : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   261: dup
/*     */     //   262: aload #6
/*     */     //   264: if_acmpne -> 286
/*     */     //   267: aload #6
/*     */     //   269: areturn
/*     */     //   270: aload #5
/*     */     //   272: getfield L$0 : Ljava/lang/Object;
/*     */     //   275: checkcast androidx/compose/runtime/MutableState
/*     */     //   278: astore_1
/*     */     //   279: aload #4
/*     */     //   281: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   284: aload #4
/*     */     //   286: pop
/*     */     //   287: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*     */     //   290: pop
/*     */     //   291: iconst_1
/*     */     //   292: getstatic kotlin/time/DurationUnit.SECONDS : Lkotlin/time/DurationUnit;
/*     */     //   295: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*     */     //   298: aload #5
/*     */     //   300: aload #5
/*     */     //   302: aload_1
/*     */     //   303: putfield L$0 : Ljava/lang/Object;
/*     */     //   306: aload #5
/*     */     //   308: iconst_4
/*     */     //   309: putfield label : I
/*     */     //   312: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   315: dup
/*     */     //   316: aload #6
/*     */     //   318: if_acmpne -> 340
/*     */     //   321: aload #6
/*     */     //   323: areturn
/*     */     //   324: aload #5
/*     */     //   326: getfield L$0 : Ljava/lang/Object;
/*     */     //   329: checkcast androidx/compose/runtime/MutableState
/*     */     //   332: astore_1
/*     */     //   333: aload #4
/*     */     //   335: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   338: aload #4
/*     */     //   340: pop
/*     */     //   341: aload_1
/*     */     //   342: iconst_1
/*     */     //   343: invokestatic aipLicenseAgreementAcceptStep$lambda$4 : (Landroidx/compose/runtime/MutableState;Z)V
/*     */     //   346: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   349: invokestatic done : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   352: areturn
/*     */     //   353: new java/lang/IllegalStateException
/*     */     //   356: dup
/*     */     //   357: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   360: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   363: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #49	-> 61
/*     */     //   #50	-> 109
/*     */     //   #49	-> 141
/*     */     //   #51	-> 173
/*     */     //   #49	-> 206
/*     */     //   #52	-> 234
/*     */     //   #49	-> 267
/*     */     //   #53	-> 286
/*     */     //   #53	-> 300
/*     */     //   #49	-> 321
/*     */     //   #54	-> 340
/*     */     //   #55	-> 346
/*     */     //   #49	-> 353
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   109	35	0	$agreement	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;
/*     */     //   162	38	0	$agreement	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;
/*     */     //   109	35	1	localAgreementAcceptPerformed$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   153	56	1	localAgreementAcceptPerformed$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   227	43	1	localAgreementAcceptPerformed$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   279	45	1	localAgreementAcceptPerformed$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   333	20	1	localAgreementAcceptPerformed$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   173	36	3	repository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepository;
/*     */     //   218	43	3	repository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepository;
/*     */     //   0	364	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   51	302	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   58	295	4	$result	Ljava/lang/Object; }
/* 176 */   private static final Object aipLicenseAgreementAcceptStep$lambda$6(MutableState $outcome$delegate) { State state = (State)$outcome$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Outcome)state.getValue()).unbox-impl(); } private static final void aipLicenseAgreementAcceptStep$lambda$7(MutableState $outcome$delegate, Object <set-?>) { MutableState mutableState = $outcome$delegate; Object object1 = null, object2 = null; Object value$iv = Outcome.box-impl(<set-?>); int $i$f$setValue = 0;
/* 177 */     mutableState.setValue(value$iv); } static {
/*     */     int $i$f$fileLogger = 0;
/* 179 */     int $i$f$currentClassLogger = 0;
/* 180 */     Class<?> clazz$iv$iv = MethodHandles.lookup().lookupClass();
/* 181 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(clazz$iv$iv), "getInstance(...)"); LOG = Logger.getInstance(clazz$iv$iv);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "aipLicenseAgreementAcceptStep.kt", l = {66, 69, 72}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$2$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$2$1(boolean $licenseAgreementAutoAccept, AipLicenseAgreement $agreement, MutableState<Boolean> $localAgreementAcceptPerformed$delegate, MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> $outcome$delegate, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object1;
/*     */       MutableState mutableState1, mutableState2;
/*     */       Object object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           if (this.$licenseAgreementAutoAccept) {
/*     */             Object object;
/*     */             AipLicenseAgreementAcceptStepKt.LOG.info("Auto-accepting license agreement: " + this.$agreement.getName());
/*     */             MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> mutableState = this.$outcome$delegate;
/*     */             try {
/*     */               MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> mutableState3 = mutableState;
/*     */               this.L$0 = mutableState;
/*     */               this.L$1 = mutableState3;
/*     */               this.label = 1;
/*     */               if (AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$doAccept(this.$agreement, this.$localAgreementAcceptPerformed$delegate, (Continuation)this) == object2)
/*     */                 return object2; 
/*     */               object = AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$doAccept(this.$agreement, this.$localAgreementAcceptPerformed$delegate, (Continuation)this);
/*     */             } catch (Throwable throwable) {
/*     */               AipLicenseAgreementAcceptStepKt.LOG.warn("Failed to auto-accept license agreement: " + this.$agreement.getName(), throwable);
/*     */               mutableState = mutableState;
/*     */               this.L$0 = mutableState;
/*     */               this.L$1 = null;
/*     */               this.label = 2;
/*     */               if (AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this) == object2)
/*     */                 return object2; 
/*     */               object = AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this);
/*     */             } 
/*     */           } else {
/*     */             MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> mutableState = this.$outcome$delegate;
/*     */             this.L$0 = mutableState;
/*     */             this.label = 3;
/*     */             if (AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this) == object2)
/*     */               return object2; 
/*     */           } 
/*     */           AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$lambda$7(mutableState, AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this));
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           mutableState2 = (MutableState)this.L$1;
/*     */           mutableState1 = (MutableState)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           object1 = ((Outcome)SYNTHETIC_LOCAL_VARIABLE_1).unbox-impl();
/*     */         case 2:
/*     */           mutableState1 = (MutableState)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           object1 = ((Outcome)SYNTHETIC_LOCAL_VARIABLE_1).unbox-impl();
/*     */         case 3:
/*     */           mutableState1 = (MutableState)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$2$1> $completion) {
/*     */       return (Continuation<Unit>)new AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$2$1(this.$licenseAgreementAutoAccept, this.$agreement, this.$localAgreementAcceptPerformed$delegate, this.$outcome$delegate, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "aipLicenseAgreementAcceptStep.kt", l = {79}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$acceptCallable$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\002\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
/*     */   static final class AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$acceptCallable$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$acceptCallable$1$1(AipLicenseAgreement $agreement, MutableState<Boolean> $localAgreementAcceptPerformed$delegate, MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> $outcome$delegate, Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> mutableState;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.L$0 = mutableState = this.$outcome$delegate;
/*     */           this.label = 1;
/*     */           if (AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$doAccept(this.$agreement, this.$localAgreementAcceptPerformed$delegate, (Continuation)this) == object)
/*     */             return object; 
/*     */           AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$lambda$7(mutableState, AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$doAccept(this.$agreement, this.$localAgreementAcceptPerformed$delegate, (Continuation)this));
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           mutableState = (MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>>)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$lambda$7(mutableState, ((Outcome)SYNTHETIC_LOCAL_VARIABLE_1).unbox-impl());
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Continuation<? super AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$acceptCallable$1$1> $completion) {
/*     */       return (Continuation<Unit>)new AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$acceptCallable$1$1(this.$agreement, this.$localAgreementAcceptPerformed$delegate, this.$outcome$delegate, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(Continuation<?> p1) {
/*     */       return ((AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$acceptCallable$1$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Job aipLicenseAgreementAcceptStep$resetInitial(CoroutineScope scope, AipLicenseAgreement $agreement, MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> outcome$delegate) {
/*     */     return BuildersKt.launch$default(scope, null, null, new AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$resetInitial$1($agreement, outcome$delegate, null), 3, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "aipLicenseAgreementAcceptStep.kt", l = {85, 86, 87, 88}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$resetInitial$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$resetInitial$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$resetInitial$1(AipLicenseAgreement $agreement, MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> $outcome$delegate, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       JunieAipLicenseAgreementRepository repository;
/*     */       MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> mutableState;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (JunieAipLicenseAgreementRepository.Companion.instance((Continuation)this) == object)
/*     */             return object; 
/*     */           repository = (JunieAipLicenseAgreementRepository)JunieAipLicenseAgreementRepository.Companion.instance((Continuation)this);
/*     */           this.label = 2;
/*     */           if (repository.updateAgreementDocument((Continuation)this) == object)
/*     */             return object; 
/*     */           repository.updateAgreementDocument((Continuation)this);
/*     */           this.label = 3;
/*     */           if (DelayKt.delay-VtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), (Continuation)this) == object)
/*     */             return object; 
/*     */           DelayKt.delay-VtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), (Continuation)this);
/*     */           this.L$0 = mutableState = this.$outcome$delegate;
/*     */           this.label = 4;
/*     */           if (AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this) == object)
/*     */             return object; 
/*     */           AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$lambda$7(mutableState, AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this));
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           repository = (JunieAipLicenseAgreementRepository)SYNTHETIC_LOCAL_VARIABLE_1;
/*     */           this.label = 2;
/*     */           if (repository.updateAgreementDocument((Continuation)this) == object)
/*     */             return object; 
/*     */           repository.updateAgreementDocument((Continuation)this);
/*     */           this.label = 3;
/*     */           if (DelayKt.delay-VtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), (Continuation)this) == object)
/*     */             return object; 
/*     */           DelayKt.delay-VtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), (Continuation)this);
/*     */           this.L$0 = mutableState = this.$outcome$delegate;
/*     */           this.label = 4;
/*     */           if (AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this) == object)
/*     */             return object; 
/*     */           AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$lambda$7(mutableState, AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this));
/*     */           return Unit.INSTANCE;
/*     */         case 2:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 3;
/*     */           if (DelayKt.delay-VtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), (Continuation)this) == object)
/*     */             return object; 
/*     */           DelayKt.delay-VtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), (Continuation)this);
/*     */           this.L$0 = mutableState = this.$outcome$delegate;
/*     */           this.label = 4;
/*     */           if (AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this) == object)
/*     */             return object; 
/*     */           AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$lambda$7(mutableState, AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this));
/*     */           return Unit.INSTANCE;
/*     */         case 3:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.L$0 = mutableState = this.$outcome$delegate;
/*     */           this.label = 4;
/*     */           if (AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this) == object)
/*     */             return object; 
/*     */           AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$lambda$7(mutableState, AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$initial(this.$agreement, (Continuation)this));
/*     */           return Unit.INSTANCE;
/*     */         case 4:
/*     */           mutableState = (MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>>)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$lambda$7(mutableState, ((Outcome)SYNTHETIC_LOCAL_VARIABLE_1).unbox-impl());
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$resetInitial$1> $completion) {
/*     */       return (Continuation<Unit>)new AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$resetInitial$1(this.$agreement, this.$outcome$delegate, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$resetInitial$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final void aipLicenseAgreementAcceptStep$agreementRequired(AipLicense $license, MutableState<Boolean> localAgreementAcceptPerformed$delegate, MutableState<Outcome<AipLicenseAgreementAcceptPending, Unit>> outcome$delegate) {
/*     */     aipLicenseAgreementAcceptStep$lambda$7(outcome$delegate, !aipLicenseAgreementAcceptStep$lambda$3(localAgreementAcceptPerformed$delegate) ? OutcomeKt.activationRoadblocked((AiaActivationRoadblocked)AipLicenseAgreementAcceptPending.AipLicenseAgreementAcceptRequired.AipLicenseEndUserMayAcceptAgreementFirstTime.INSTANCE) : (isEndUserAbleToAcceptAgreement($license) ? OutcomeKt.activationRoadblocked((AiaActivationRoadblocked)AipLicenseAgreementAcceptPending.AipLicenseAgreementAcceptRequired.AipLicenseEndUserHasToAcceptCustomerAgreementInBrowser.INSTANCE) : OutcomeKt.activationRoadblocked((AiaActivationRoadblocked)AipLicenseAgreementAcceptPending.AipLicenseAgreementAcceptRequired.AipLicenseEndUserHasToAskAdminToAcceptAgreement.INSTANCE)));
/*     */   }
/*     */   
/*     */   private static final boolean isEndUserAbleToAcceptAgreement(AipLicense license) {
/*     */     return license.isIndividual();
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "aipLicenseAgreementAcceptStep.kt", l = {50, 51, 52, 53}, i = {0, 0, 1, 1, 2, 3}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"}, n = {"$agreement", "localAgreementAcceptPerformed$delegate", "localAgreementAcceptPerformed$delegate", "repository", "localAgreementAcceptPerformed$delegate", "localAgreementAcceptPerformed$delegate"}, m = "aipLicenseAgreementAcceptStep$doAccept", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseAgreementAcceptStepKt")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$doAccept$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$doAccept$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return (AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$doAccept(null, null, (Continuation)this) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$doAccept(null, null, (Continuation)this) : Outcome.box-impl(AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$doAccept(null, null, (Continuation)this));
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "aipLicenseAgreementAcceptStep.kt", l = {40, 41}, i = {0, 1}, s = {"L$0", "L$0"}, n = {"$agreement", "$agreement"}, m = "aipLicenseAgreementAcceptStep$initial", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseAgreementAcceptStepKt")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$initial$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$initial$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return (AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$initial(null, (Continuation)this) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$initial(null, (Continuation)this) : Outcome.box-impl(AipLicenseAgreementAcceptStepKt.aipLicenseAgreementAcceptStep$initial(null, (Continuation)this));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AipLicenseAgreementAcceptStepKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */