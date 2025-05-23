/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.IdeLicenseAiFlag;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieIdeLicenseRepository;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\032\027\020\000\032\0020\0012\b\b\002\020\002\032\0020\003H\001¢\006\002\020\004\"\016\020\005\032\0020\006X\004¢\006\002\n\000¨\006\007"}, d2 = {"ideLicenseAiAllowanceStep", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/IdeLicenseAiAllowanceStep;", "ideLicenseStore", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/IdeLicenseStore;", "(Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/IdeLicenseStore;Landroidx/compose/runtime/Composer;II)Lcom/intellij/ml/llm/matterhorn/activation/state/model/IdeLicenseAiAllowanceStep;", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "state.junie.impl"})
/*    */ @SourceDebugExtension({"SMAP\nideLicenseAiAllowanceStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ideLicenseAiAllowanceStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/IdeLicenseAiAllowanceStepKt\n+ 2 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStoreKt\n+ 3 service.kt\ncom/intellij/openapi/components/ServiceKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,48:1\n47#2:49\n40#3,3:50\n1225#4,6:53\n1225#4,6:59\n58#5:65\n36#5,2:66\n*S KotlinDebug\n*F\n+ 1 ideLicenseAiAllowanceStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/IdeLicenseAiAllowanceStepKt\n*L\n26#1:49\n26#1:50,3\n27#1:53,6\n31#1:59,6\n47#1:65\n47#1:66,2\n*E\n"})
/*    */ public final class IdeLicenseAiAllowanceStepKt {
/*    */   @NotNull
/*    */   private static final Logger LOG;
/*    */   
/*    */   @Composable
/*    */   @NotNull
/*    */   public static final IdeLicenseAiAllowanceStep ideLicenseAiAllowanceStep(@Nullable IdeLicenseStore ideLicenseStore, @Nullable Composer $composer, int $changed, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 1151597479
/*    */     //   3: invokeinterface startReplaceGroup : (I)V
/*    */     //   8: iload_3
/*    */     //   9: iconst_1
/*    */     //   10: iand
/*    */     //   11: ifeq -> 111
/*    */     //   14: iconst_0
/*    */     //   15: istore #4
/*    */     //   17: iconst_0
/*    */     //   18: istore #5
/*    */     //   20: ldc com/intellij/ml/llm/matterhorn/activation/state/junie/data/IdeLicenseStore
/*    */     //   22: astore #6
/*    */     //   24: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*    */     //   27: aload #6
/*    */     //   29: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*    */     //   34: dup
/*    */     //   35: ifnonnull -> 102
/*    */     //   38: pop
/*    */     //   39: new java/lang/RuntimeException
/*    */     //   42: dup
/*    */     //   43: new java/lang/StringBuilder
/*    */     //   46: dup
/*    */     //   47: invokespecial <init> : ()V
/*    */     //   50: ldc 'Cannot find service '
/*    */     //   52: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   55: aload #6
/*    */     //   57: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   60: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   63: ldc ' (classloader='
/*    */     //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   68: aload #6
/*    */     //   70: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
/*    */     //   73: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   76: ldc ', client='
/*    */     //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   81: getstatic com/intellij/codeWithMe/ClientId.Companion : Lcom/intellij/codeWithMe/ClientId$Companion;
/*    */     //   84: invokevirtual getCurrentOrNull : ()Lcom/intellij/codeWithMe/ClientId;
/*    */     //   87: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   90: bipush #41
/*    */     //   92: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   95: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   98: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   101: athrow
/*    */     //   102: nop
/*    */     //   103: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStore
/*    */     //   106: nop
/*    */     //   107: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/data/IdeLicenseStore
/*    */     //   110: astore_0
/*    */     //   111: invokestatic isTraceInProgress : ()Z
/*    */     //   114: ifeq -> 126
/*    */     //   117: ldc 1151597479
/*    */     //   119: iload_2
/*    */     //   120: iconst_m1
/*    */     //   121: ldc 'com.intellij.ml.llm.matterhorn.activation.state.junie.ideLicenseAiAllowanceStep (ideLicenseAiAllowanceStep.kt:25)'
/*    */     //   123: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   126: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/IdeLicenseAiAllowanceStepKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   129: aload_1
/*    */     //   130: ldc 1453292862
/*    */     //   132: invokeinterface startReplaceGroup : (I)V
/*    */     //   137: aload_1
/*    */     //   138: astore #5
/*    */     //   140: iconst_0
/*    */     //   141: istore #6
/*    */     //   143: iconst_0
/*    */     //   144: istore #7
/*    */     //   146: aload #5
/*    */     //   148: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   153: astore #8
/*    */     //   155: iconst_0
/*    */     //   156: istore #9
/*    */     //   158: aload #8
/*    */     //   160: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   163: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   166: if_acmpne -> 198
/*    */     //   169: astore #13
/*    */     //   171: iconst_0
/*    */     //   172: istore #10
/*    */     //   174: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*    */     //   179: aload #13
/*    */     //   181: swap
/*    */     //   182: astore #10
/*    */     //   184: aload #5
/*    */     //   186: aload #10
/*    */     //   188: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   193: aload #10
/*    */     //   195: goto -> 200
/*    */     //   198: aload #8
/*    */     //   200: nop
/*    */     //   201: nop
/*    */     //   202: nop
/*    */     //   203: checkcast kotlin/jvm/functions/Function0
/*    */     //   206: astore #4
/*    */     //   208: aload_1
/*    */     //   209: invokeinterface endReplaceGroup : ()V
/*    */     //   214: aload #4
/*    */     //   216: aload_1
/*    */     //   217: bipush #48
/*    */     //   219: invokestatic TraceComposition : (Lcom/intellij/openapi/diagnostic/Logger;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*    */     //   222: aload_0
/*    */     //   223: invokevirtual getAiFlagLazy : ()Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazy;
/*    */     //   226: aload_1
/*    */     //   227: iconst_0
/*    */     //   228: invokestatic observeValue : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazy;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
/*    */     //   231: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag
/*    */     //   234: astore #4
/*    */     //   236: aload_1
/*    */     //   237: iconst_0
/*    */     //   238: invokestatic rememberActivityLauncher : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncher;
/*    */     //   241: aload_1
/*    */     //   242: ldc 1453297617
/*    */     //   244: invokeinterface startReplaceGroup : (I)V
/*    */     //   249: aload_1
/*    */     //   250: astore #7
/*    */     //   252: iconst_0
/*    */     //   253: istore #8
/*    */     //   255: iconst_0
/*    */     //   256: istore #9
/*    */     //   258: aload #7
/*    */     //   260: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   265: astore #10
/*    */     //   267: iconst_0
/*    */     //   268: istore #11
/*    */     //   270: aload #10
/*    */     //   272: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   275: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   278: if_acmpne -> 316
/*    */     //   281: astore #13
/*    */     //   283: iconst_0
/*    */     //   284: istore #12
/*    */     //   286: new com/intellij/ml/llm/matterhorn/activation/state/junie/IdeLicenseAiAllowanceStepKt$ideLicenseAiAllowanceStep$verifyCallable$1$1
/*    */     //   289: dup
/*    */     //   290: aconst_null
/*    */     //   291: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   294: checkcast kotlin/jvm/functions/Function1
/*    */     //   297: aload #13
/*    */     //   299: swap
/*    */     //   300: astore #12
/*    */     //   302: aload #7
/*    */     //   304: aload #12
/*    */     //   306: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   311: aload #12
/*    */     //   313: goto -> 318
/*    */     //   316: aload #10
/*    */     //   318: nop
/*    */     //   319: nop
/*    */     //   320: nop
/*    */     //   321: checkcast kotlin/jvm/functions/Function1
/*    */     //   324: astore #6
/*    */     //   326: aload_1
/*    */     //   327: invokeinterface endReplaceGroup : ()V
/*    */     //   332: aload #6
/*    */     //   334: invokestatic bind : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncher;Lkotlin/jvm/functions/Function1;)Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityCallable;
/*    */     //   337: astore #5
/*    */     //   339: new com/intellij/ml/llm/matterhorn/activation/state/model/IdeLicenseAiAllowanceStep
/*    */     //   342: dup
/*    */     //   343: aload #5
/*    */     //   345: checkcast kotlin/jvm/functions/Function0
/*    */     //   348: aload #4
/*    */     //   350: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/IdeLicenseAiAllowanceStepKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*    */     //   353: swap
/*    */     //   354: invokevirtual ordinal : ()I
/*    */     //   357: iaload
/*    */     //   358: tableswitch default -> 417, 1 -> 384, 2 -> 396, 3 -> 408
/*    */     //   384: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/IdeLicenseAiAllowancePending$IdeLicenseAiUnknown.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/IdeLicenseAiAllowancePending$IdeLicenseAiUnknown;
/*    */     //   387: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationProgressing
/*    */     //   390: invokestatic activationProgressing : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationProgressing;)Ljava/lang/Object;
/*    */     //   393: goto -> 425
/*    */     //   396: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/IdeLicenseAiAllowancePending$IdeLicenseAiProhibited.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/IdeLicenseAiAllowancePending$IdeLicenseAiProhibited;
/*    */     //   399: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked
/*    */     //   402: invokestatic activationRoadblocked : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked;)Ljava/lang/Object;
/*    */     //   405: goto -> 425
/*    */     //   408: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   411: invokestatic done : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   414: goto -> 425
/*    */     //   417: new kotlin/NoWhenBranchMatchedException
/*    */     //   420: dup
/*    */     //   421: invokespecial <init> : ()V
/*    */     //   424: athrow
/*    */     //   425: aconst_null
/*    */     //   426: invokespecial <init> : (Lkotlin/jvm/functions/Function0;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   429: astore #6
/*    */     //   431: invokestatic isTraceInProgress : ()Z
/*    */     //   434: ifeq -> 440
/*    */     //   437: invokestatic traceEventEnd : ()V
/*    */     //   440: aload_1
/*    */     //   441: invokeinterface endReplaceGroup : ()V
/*    */     //   446: aload #6
/*    */     //   448: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #26	-> 14
/*    */     //   #49	-> 17
/*    */     //   #50	-> 20
/*    */     //   #51	-> 24
/*    */     //   #52	-> 39
/*    */     //   #51	-> 102
/*    */     //   #49	-> 106
/*    */     //   #26	-> 123
/*    */     //   #27	-> 126
/*    */     //   #53	-> 146
/*    */     //   #54	-> 158
/*    */     //   #55	-> 169
/*    */     //   #55	-> 182
/*    */     //   #56	-> 184
/*    */     //   #57	-> 193
/*    */     //   #58	-> 198
/*    */     //   #54	-> 200
/*    */     //   #53	-> 201
/*    */     //   #53	-> 202
/*    */     //   #27	-> 203
/*    */     //   #29	-> 222
/*    */     //   #31	-> 238
/*    */     //   #59	-> 258
/*    */     //   #60	-> 270
/*    */     //   #61	-> 281
/*    */     //   #31	-> 286
/*    */     //   #61	-> 300
/*    */     //   #62	-> 302
/*    */     //   #63	-> 311
/*    */     //   #64	-> 316
/*    */     //   #60	-> 318
/*    */     //   #59	-> 319
/*    */     //   #59	-> 320
/*    */     //   #31	-> 321
/*    */     //   #37	-> 339
/*    */     //   #38	-> 343
/*    */     //   #39	-> 348
/*    */     //   #40	-> 384
/*    */     //   #41	-> 396
/*    */     //   #42	-> 408
/*    */     //   #39	-> 417
/*    */     //   #37	-> 426
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   20	83	5	$i$f$service	I
/*    */     //   24	79	6	serviceClass$iv$iv	Ljava/lang/Class;
/*    */     //   17	90	4	$i$f$rememberDataStore	I
/*    */     //   174	5	10	$i$a$-cache-IdeLicenseAiAllowanceStepKt$ideLicenseAiAllowanceStep$1	I
/*    */     //   184	11	10	value$iv	Ljava/lang/Object;
/*    */     //   158	43	9	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   155	46	8	it$iv	Ljava/lang/Object;
/*    */     //   146	57	7	$i$f$cache	I
/*    */     //   143	60	5	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   143	60	6	invalid$iv	Z
/*    */     //   286	11	12	$i$a$-cache-IdeLicenseAiAllowanceStepKt$ideLicenseAiAllowanceStep$verifyCallable$1	I
/*    */     //   302	11	12	value$iv	Ljava/lang/Object;
/*    */     //   270	49	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   267	52	10	it$iv	Ljava/lang/Object;
/*    */     //   258	63	9	$i$f$cache	I
/*    */     //   255	66	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   255	66	8	invalid$iv	Z
/*    */     //   236	213	4	aiFlag	Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;
/*    */     //   339	110	5	verifyCallable	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityCallable;
/*    */     //   0	449	0	ideLicenseStore	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/IdeLicenseStore;
/*    */     //   0	449	1	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	449	2	$changed	I
/*    */   }
/*    */   
/* 27 */   private static final String ideLicenseAiAllowanceStep$lambda$1$lambda$0() { return "IDE license AI flag"; } @DebugMetadata(f = "ideLicenseAiAllowanceStep.kt", l = {32}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.IdeLicenseAiAllowanceStepKt$ideLicenseAiAllowanceStep$verifyCallable$1$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\002\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
/*    */   static final class IdeLicenseAiAllowanceStepKt$ideLicenseAiAllowanceStep$verifyCallable$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> { int label; IdeLicenseAiAllowanceStepKt$ideLicenseAiAllowanceStep$verifyCallable$1$1(Continuation $completion) { super(1, $completion); }
/*    */     public final Object invokeSuspend(Object $result) {
/* 31 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 32 */           this.label = 1; if (TimeoutKt.withTimeout-KLykuaI(DurationKt.toDuration(10, DurationUnit.SECONDS), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>($completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 33 */                       this.label = 1; if (JunieIdeLicenseRepository.Companion.instance((Continuation)this) == object) return object;  this.label = 2; if (JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)JunieIdeLicenseRepository.Companion.instance((Continuation)this), null, (Continuation)this, 1, null) == object) return object;  JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)JunieIdeLicenseRepository.Companion.instance((Continuation)this), null, (Continuation)this, 1, null);
/* 34 */                       return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 2; if (JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1, null, (Continuation)this, 1, null) == object) return object;  JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1, null, (Continuation)this, 1, null); return Unit.INSTANCE;case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } }(Continuation)this) == object) return object;  TimeoutKt.withTimeout-KLykuaI(DurationKt.toDuration(10, DurationUnit.SECONDS), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (JunieIdeLicenseRepository.Companion.instance((Continuation)this) == object) return object;  this.label = 2; if (JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)JunieIdeLicenseRepository.Companion.instance((Continuation)this), null, (Continuation)this, 1, null) == object) return object;  JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)JunieIdeLicenseRepository.Companion.instance((Continuation)this), null, (Continuation)this, 1, null); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 2; if (JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1, null, (Continuation)this, 1, null) == object) return object;  JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1, null, (Continuation)this, 1, null); return Unit.INSTANCE;case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/* 35 */                 int label; public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>($completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     public final Continuation<Unit> create(Continuation<? super IdeLicenseAiAllowanceStepKt$ideLicenseAiAllowanceStep$verifyCallable$1$1> $completion) {
/*    */       return (Continuation<Unit>)new IdeLicenseAiAllowanceStepKt$ideLicenseAiAllowanceStep$verifyCallable$1$1($completion);
/*    */     }
/*    */     public final Object invoke(Continuation<?> p1) {
/*    */       return ((IdeLicenseAiAllowanceStepKt$ideLicenseAiAllowanceStep$verifyCallable$1$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */   
/*    */   static {
/* 47 */     int $i$f$fileLogger = 0;
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
/* 65 */     int $i$f$currentClassLogger = 0;
/* 66 */     Class<?> clazz$iv$iv = MethodHandles.lookup().lookupClass();
/* 67 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(clazz$iv$iv), "getInstance(...)"); LOG = Logger.getInstance(clazz$iv$iv);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\IdeLicenseAiAllowanceStepKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */