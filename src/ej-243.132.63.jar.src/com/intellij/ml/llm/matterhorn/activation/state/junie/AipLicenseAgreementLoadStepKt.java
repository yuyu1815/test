/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ 
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseAgreement;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseAgreementRepository;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.junie.activity.ActivityCallable;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.junie.activity.ActivityLauncher;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.AipLicenseAgreementLoadStep;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.OpResult;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\032\r\020\000\032\0020\001H\001¢\006\002\020\002\"\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\005"}, d2 = {"aipLicenseAgreementLoadStep", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadStep;", "(Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadStep;", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "state.junie.impl"})
/*    */ @SourceDebugExtension({"SMAP\naipLicenseAgreementLoadStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 aipLicenseAgreementLoadStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseAgreementLoadStepKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,71:1\n1225#2,6:72\n1225#2,6:78\n1225#2,6:84\n1225#2,6:90\n58#3:96\n36#3,2:97\n*S KotlinDebug\n*F\n+ 1 aipLicenseAgreementLoadStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseAgreementLoadStepKt\n*L\n30#1:72,6\n35#1:78,6\n42#1:84,6\n47#1:90,6\n70#1:96\n70#1:97,2\n*E\n"})
/*    */ public final class AipLicenseAgreementLoadStepKt {
/*    */   @Composable
/*    */   @NotNull
/* 29 */   public static final AipLicenseAgreementLoadStep aipLicenseAgreementLoadStep(@Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(1022378817); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1022378817, $changed, -1, "com.intellij.ml.llm.matterhorn.activation.state.junie.aipLicenseAgreementLoadStep (aipLicenseAgreementLoadStep.kt:28)"); 
/* 30 */     $composer.startReplaceGroup(-1021072849); Composer composer1 = $composer; boolean invalid$iv = false; int $i$f$cache = 0;
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
/* 72 */     Object it$iv = composer1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*    */     
/* 74 */     Logger logger = LOG; int $i$a$-cache-AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$1 = 0; Object value$iv = AipLicenseAgreementLoadStepKt::aipLicenseAgreementLoadStep$lambda$1$lambda$0;
/* 75 */     composer1.updateRememberedValue(value$iv);
/* 76 */     Function0 function0 = (it$iv == Composer.Companion.getEmpty()) ? (Function0)value$iv : 
/* 77 */       (Function0)it$iv; $composer.endReplaceGroup(); LoggingComposeKt.TraceComposition(logger, function0, $composer, 48); ActivityLauncher loadActivity = ActivityLauncherKt.rememberActivityLauncher($composer, 0); OpResult result = loadActivity.getLatestOpResult(); $composer.startReplaceGroup(-1021066363); it$iv = $composer; boolean bool1 = false; int i = 0;
/* 78 */     Object object1 = it$iv.rememberedValue(); int j = 0;
/* 79 */     if (object1 == Composer.Companion.getEmpty()) {
/* 80 */       ActivityLauncher activityLauncher = loadActivity; int $i$a$-cache-AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$loadCallable$1 = 0; Object object = new AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$loadCallable$1$1(null);
/* 81 */       it$iv.updateRememberedValue(object);
/*    */     } 
/* 83 */     Function1 function1 = (Function1)object1; $composer.endReplaceGroup(); ActivityCallable loadCallable = ActivityCallableKt.bind(activityLauncher, function1); $composer.startReplaceGroup(-1021059525); Composer $this$cache$iv = $composer; bool1 = $composer.changedInstance(loadCallable); i = 0;
/* 84 */     object1 = $this$cache$iv.rememberedValue(); j = 0;
/* 85 */     if (bool1 || object1 == Composer.Companion.getEmpty()) {
/* 86 */       Unit unit = Unit.INSTANCE; int $i$a$-cache-AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$2 = 0; Object object = new AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$2$1(loadCallable, null);
/* 87 */       $this$cache$iv.updateRememberedValue(object);
/*    */     } 
/* 89 */     Function2 function2 = (Function2)object1; $composer.endReplaceGroup(); EffectsKt.LaunchedEffect(unit, function2, $composer, 6); if (result instanceof OpResult.OpCompleted.OpSucceeded)
/* 90 */     { $composer.startReplaceGroup(-1021056664); $this$cache$iv = $composer; bool1 = $composer.changedInstance(loadCallable); i = 0; object1 = $this$cache$iv.rememberedValue(); j = 0;
/*    */       
/* 92 */       Unit unit = Unit.INSTANCE; int $i$a$-cache-AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$3 = 0; Object object = new AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$3$1(loadCallable, null);
/* 93 */       $this$cache$iv.updateRememberedValue(object);
/* 94 */       function2 = (bool1 || object1 == Composer.Companion.getEmpty()) ? (Function2)object : 
/* 95 */         (Function2)object1; $composer.endReplaceGroup(); EffectsKt.LaunchedEffect(unit, function2, $composer, 6); }  OpResult opResult1 = result; Object outcome = (opResult1 == null) ? OutcomeKt.activationProgressing((AiaActivationProgressing)AipLicenseAgreementLoadPending.AipLicenseAgreementLoading.INSTANCE) : (!(opResult1 instanceof OpResult.OpCompleted.OpSucceeded) ? OutcomeKt.activationStalled((AiaActivationStalled)AipLicenseAgreementLoadPending.AipLicenseAgreementLoadFailure.INSTANCE) : OutcomeKt.done(((OpResult.OpCompleted.OpSucceeded)result).getValue())); AipLicenseAgreementLoadStep aipLicenseAgreementLoadStep = new AipLicenseAgreementLoadStep((Function0)loadCallable, outcome, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return aipLicenseAgreementLoadStep; }
/* 96 */   @NotNull private static final Logger LOG; private static final String aipLicenseAgreementLoadStep$lambda$1$lambda$0() { return "AI Pro load end user license agreement"; } static { int $i$f$fileLogger = 0; int $i$f$currentClassLogger = 0;
/* 97 */     Class<?> clazz$iv$iv = MethodHandles.lookup().lookupClass();
/* 98 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(clazz$iv$iv), "getInstance(...)"); LOG = Logger.getInstance(clazz$iv$iv); }
/*    */ 
/*    */   
/*    */   @DebugMetadata(f = "aipLicenseAgreementLoadStep.kt", l = {36}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$loadCallable$1$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\030\002\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;"})
/*    */   static final class AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$loadCallable$1$1 extends SuspendLambda implements Function1<Continuation<? super AipLicenseAgreement>, Object> {
/*    */     int label;
/*    */     
/*    */     AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$loadCallable$1$1(Continuation $completion) {
/*    */       super(1, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           this.label = 1;
/*    */           if (TimeoutKt.withTimeout-KLykuaI(DurationKt.toDuration(20, DurationUnit.SECONDS), new Function2<CoroutineScope, Continuation<? super AipLicenseAgreement>, Object>(null) {
/*    */                 int label;
/*    */                 
/*    */                 public final Object invokeSuspend(Object $result) {
/*    */                   Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */                   switch (this.label) {
/*    */                     case 0:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       this.label = 1;
/*    */                       if (JunieAipLicenseAgreementRepository.Companion.instance((Continuation)this) == object)
/*    */                         return object; 
/*    */                       this.label = 2;
/*    */                       if (((JunieAipLicenseAgreementRepository)JunieAipLicenseAgreementRepository.Companion.instance((Continuation)this)).loadLocalAgreementDocument((Continuation)this) == object)
/*    */                         return object; 
/*    */                       return ((JunieAipLicenseAgreementRepository)JunieAipLicenseAgreementRepository.Companion.instance((Continuation)this)).loadLocalAgreementDocument((Continuation)this);
/*    */                     case 1:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       this.label = 2;
/*    */                       if (((JunieAipLicenseAgreementRepository)SYNTHETIC_LOCAL_VARIABLE_1).loadLocalAgreementDocument((Continuation)this) == object)
/*    */                         return object; 
/*    */                       return ((JunieAipLicenseAgreementRepository)SYNTHETIC_LOCAL_VARIABLE_1).loadLocalAgreementDocument((Continuation)this);
/*    */                     case 2:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       return SYNTHETIC_LOCAL_VARIABLE_1;
/*    */                   } 
/*    */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */                 }
/*    */                 
/*    */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */                   return (Continuation)new Function2<>($completion);
/*    */                 }
/*    */                 
/*    */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */                 }
/*    */               }(Continuation)this) == object)
/*    */             return object; 
/*    */           return TimeoutKt.withTimeout-KLykuaI(DurationKt.toDuration(20, DurationUnit.SECONDS), new Function2<CoroutineScope, Continuation<? super AipLicenseAgreement>, Object>(null) {
/*    */                 int label;
/*    */                 
/*    */                 public final Object invokeSuspend(Object $result) {
/*    */                   Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */                   switch (this.label) {
/*    */                     case 0:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       this.label = 1;
/*    */                       if (JunieAipLicenseAgreementRepository.Companion.instance((Continuation)this) == object)
/*    */                         return object; 
/*    */                       this.label = 2;
/*    */                       if (((JunieAipLicenseAgreementRepository)JunieAipLicenseAgreementRepository.Companion.instance((Continuation)this)).loadLocalAgreementDocument((Continuation)this) == object)
/*    */                         return object; 
/*    */                       return ((JunieAipLicenseAgreementRepository)JunieAipLicenseAgreementRepository.Companion.instance((Continuation)this)).loadLocalAgreementDocument((Continuation)this);
/*    */                     case 1:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       this.label = 2;
/*    */                       if (((JunieAipLicenseAgreementRepository)SYNTHETIC_LOCAL_VARIABLE_1).loadLocalAgreementDocument((Continuation)this) == object)
/*    */                         return object; 
/*    */                       return ((JunieAipLicenseAgreementRepository)SYNTHETIC_LOCAL_VARIABLE_1).loadLocalAgreementDocument((Continuation)this);
/*    */                     case 2:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       return SYNTHETIC_LOCAL_VARIABLE_1;
/*    */                   } 
/*    */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */                 }
/*    */                 
/*    */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */                   return (Continuation)new Function2<>($completion);
/*    */                 }
/*    */                 
/*    */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */                 }
/*    */               }(Continuation)this);
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Continuation<? super AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$loadCallable$1$1> $completion) {
/*    */       return (Continuation<Unit>)new AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$loadCallable$1$1($completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(Continuation<?> p1) {
/*    */       return ((AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$loadCallable$1$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "aipLicenseAgreementLoadStep.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$2$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$2$1(ActivityCallable $loadCallable, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           this.$loadCallable.invoke();
/*    */           return Unit.INSTANCE;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$2$1> $completion) {
/*    */       return (Continuation<Unit>)new AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$2$1(this.$loadCallable, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "aipLicenseAgreementLoadStep.kt", l = {48, 50, 55}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$3$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$3$1(ActivityCallable $loadCallable, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore #5
/*    */       //   5: aload_0
/*    */       //   6: getfield label : I
/*    */       //   9: tableswitch default -> 185, 0 -> 40, 1 -> 76, 2 -> 112, 3 -> 176
/*    */       //   40: aload_1
/*    */       //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   44: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*    */       //   47: pop
/*    */       //   48: iconst_1
/*    */       //   49: getstatic kotlin/time/DurationUnit.MINUTES : Lkotlin/time/DurationUnit;
/*    */       //   52: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*    */       //   55: aload_0
/*    */       //   56: checkcast kotlin/coroutines/Continuation
/*    */       //   59: aload_0
/*    */       //   60: iconst_1
/*    */       //   61: putfield label : I
/*    */       //   64: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   67: dup
/*    */       //   68: aload #5
/*    */       //   70: if_acmpne -> 81
/*    */       //   73: aload #5
/*    */       //   75: areturn
/*    */       //   76: aload_1
/*    */       //   77: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   80: aload_1
/*    */       //   81: pop
/*    */       //   82: aload_0
/*    */       //   83: getfield $loadCallable : Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityCallable;
/*    */       //   86: invokeinterface invoke : ()Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle;
/*    */       //   91: aload_0
/*    */       //   92: checkcast kotlin/coroutines/Continuation
/*    */       //   95: aload_0
/*    */       //   96: iconst_2
/*    */       //   97: putfield label : I
/*    */       //   100: invokevirtual awaitOpResult : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   103: dup
/*    */       //   104: aload #5
/*    */       //   106: if_acmpne -> 117
/*    */       //   109: aload #5
/*    */       //   111: areturn
/*    */       //   112: aload_1
/*    */       //   113: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   116: aload_1
/*    */       //   117: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult
/*    */       //   120: astore_2
/*    */       //   121: aload_2
/*    */       //   122: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpSucceeded
/*    */       //   125: ifeq -> 142
/*    */       //   128: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*    */       //   131: pop
/*    */       //   132: iconst_1
/*    */       //   133: getstatic kotlin/time/DurationUnit.DAYS : Lkotlin/time/DurationUnit;
/*    */       //   136: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*    */       //   139: goto -> 153
/*    */       //   142: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*    */       //   145: pop
/*    */       //   146: iconst_1
/*    */       //   147: getstatic kotlin/time/DurationUnit.HOURS : Lkotlin/time/DurationUnit;
/*    */       //   150: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*    */       //   153: lstore_3
/*    */       //   154: lload_3
/*    */       //   155: aload_0
/*    */       //   156: checkcast kotlin/coroutines/Continuation
/*    */       //   159: aload_0
/*    */       //   160: iconst_3
/*    */       //   161: putfield label : I
/*    */       //   164: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   167: dup
/*    */       //   168: aload #5
/*    */       //   170: if_acmpne -> 181
/*    */       //   173: aload #5
/*    */       //   175: areturn
/*    */       //   176: aload_1
/*    */       //   177: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   180: aload_1
/*    */       //   181: pop
/*    */       //   182: goto -> 82
/*    */       //   185: new java/lang/IllegalStateException
/*    */       //   188: dup
/*    */       //   189: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   191: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   194: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #47	-> 3
/*    */       //   #48	-> 44
/*    */       //   #48	-> 59
/*    */       //   #47	-> 73
/*    */       //   #49	-> 81
/*    */       //   #50	-> 82
/*    */       //   #47	-> 109
/*    */       //   #51	-> 121
/*    */       //   #52	-> 122
/*    */       //   #53	-> 142
/*    */       //   #51	-> 153
/*    */       //   #55	-> 154
/*    */       //   #47	-> 173
/*    */       //   #55	-> 181
/*    */       //   #47	-> 185
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   121	1	2	result	Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
/*    */       //   154	13	3	delayUntilUpdate	J
/*    */       //   0	195	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$3$1;
/*    */       //   44	141	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$3$1> $completion) {
/*    */       return (Continuation<Unit>)new AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$3$1(this.$loadCallable, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((AipLicenseAgreementLoadStepKt$aipLicenseAgreementLoadStep$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AipLicenseAgreementLoadStepKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */