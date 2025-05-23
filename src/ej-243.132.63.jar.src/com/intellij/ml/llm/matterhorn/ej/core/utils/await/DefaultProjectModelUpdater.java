/*    */ package com.intellij.ml.llm.matterhorn.ej.core.utils.await;
/*    */ 
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\t\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\003\030\000 \0132\0020\001:\001\013B\021\022\b\b\002\020\002\032\0020\003¢\006\004\b\004\020\005J\026\020\006\032\0020\0072\006\020\b\032\0020\tH@¢\006\002\020\nR\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/await/ProjectModelUpdater;", "timeoutMs", "", "<init>", "(J)V", "updateProjectModelAndWait", "", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nDefaultProjectModelUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultProjectModelUpdater.kt\ncom/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,43:1\n14#2:44\n*S KotlinDebug\n*F\n+ 1 DefaultProjectModelUpdater.kt\ncom/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater\n*L\n15#1:44\n*E\n"})
/*    */ public final class DefaultProjectModelUpdater implements ProjectModelUpdater {
/* 13 */   public DefaultProjectModelUpdater(long timeoutMs) { this.timeoutMs = timeoutMs; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "ej-core"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 15 */     public final Logger getLogger() { return DefaultProjectModelUpdater.logger; } } @NotNull public static final Companion Companion = new Companion(null); private final long timeoutMs; static { int $i$f$logger = 0;
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
/* 44 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(DefaultProjectModelUpdater.class), "getInstance(...)"); } @Nullable public Object updateProjectModelAndWait(@NotNull Project project, @NotNull Continuation $completion) { // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater$updateProjectModelAndWait$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater$updateProjectModelAndWait$1
/*    */     //   11: astore #6
/*    */     //   13: aload #6
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #6
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater$updateProjectModelAndWait$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #5
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #7
/*    */     //   62: aload #6
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 345, 0 -> 96, 1 -> 159, 2 -> 233, 3 -> 304
/*    */     //   96: aload #5
/*    */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   101: getstatic com/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   104: ldc 'Awaiting project model update'
/*    */     //   106: invokevirtual info : (Ljava/lang/String;)V
/*    */     //   109: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*    */     //   112: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*    */     //   115: new com/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater$updateProjectModelAndWait$2
/*    */     //   118: dup
/*    */     //   119: aload_1
/*    */     //   120: aconst_null
/*    */     //   121: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)V
/*    */     //   124: checkcast kotlin/jvm/functions/Function2
/*    */     //   127: aload #6
/*    */     //   129: aload #6
/*    */     //   131: aload_0
/*    */     //   132: putfield L$0 : Ljava/lang/Object;
/*    */     //   135: aload #6
/*    */     //   137: aload_1
/*    */     //   138: putfield L$1 : Ljava/lang/Object;
/*    */     //   141: aload #6
/*    */     //   143: iconst_1
/*    */     //   144: putfield label : I
/*    */     //   147: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   150: dup
/*    */     //   151: aload #7
/*    */     //   153: if_acmpne -> 184
/*    */     //   156: aload #7
/*    */     //   158: areturn
/*    */     //   159: aload #6
/*    */     //   161: getfield L$1 : Ljava/lang/Object;
/*    */     //   164: checkcast com/intellij/openapi/project/Project
/*    */     //   167: astore_1
/*    */     //   168: aload #6
/*    */     //   170: getfield L$0 : Ljava/lang/Object;
/*    */     //   173: checkcast com/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater
/*    */     //   176: astore_0
/*    */     //   177: aload #5
/*    */     //   179: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   182: aload #5
/*    */     //   184: pop
/*    */     //   185: nop
/*    */     //   186: ldc2_w 1000
/*    */     //   189: new com/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater$updateProjectModelAndWait$3
/*    */     //   192: dup
/*    */     //   193: aload_1
/*    */     //   194: aconst_null
/*    */     //   195: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)V
/*    */     //   198: checkcast kotlin/jvm/functions/Function2
/*    */     //   201: aload #6
/*    */     //   203: aload #6
/*    */     //   205: aload_0
/*    */     //   206: putfield L$0 : Ljava/lang/Object;
/*    */     //   209: aload #6
/*    */     //   211: aconst_null
/*    */     //   212: putfield L$1 : Ljava/lang/Object;
/*    */     //   215: aload #6
/*    */     //   217: iconst_2
/*    */     //   218: putfield label : I
/*    */     //   221: invokestatic withTimeout : (JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   224: dup
/*    */     //   225: aload #7
/*    */     //   227: if_acmpne -> 250
/*    */     //   230: aload #7
/*    */     //   232: areturn
/*    */     //   233: aload #6
/*    */     //   235: getfield L$0 : Ljava/lang/Object;
/*    */     //   238: checkcast com/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater
/*    */     //   241: astore_0
/*    */     //   242: nop
/*    */     //   243: aload #5
/*    */     //   245: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   248: aload #5
/*    */     //   250: pop
/*    */     //   251: goto -> 256
/*    */     //   254: astore #4
/*    */     //   256: nop
/*    */     //   257: aload_0
/*    */     //   258: getfield timeoutMs : J
/*    */     //   261: new com/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater$updateProjectModelAndWait$5
/*    */     //   264: dup
/*    */     //   265: aconst_null
/*    */     //   266: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   269: checkcast kotlin/jvm/functions/Function2
/*    */     //   272: aload #6
/*    */     //   274: aload #6
/*    */     //   276: aload_0
/*    */     //   277: putfield L$0 : Ljava/lang/Object;
/*    */     //   280: aload #6
/*    */     //   282: aconst_null
/*    */     //   283: putfield L$1 : Ljava/lang/Object;
/*    */     //   286: aload #6
/*    */     //   288: iconst_3
/*    */     //   289: putfield label : I
/*    */     //   292: invokestatic withTimeout : (JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   295: dup
/*    */     //   296: aload #7
/*    */     //   298: if_acmpne -> 321
/*    */     //   301: aload #7
/*    */     //   303: areturn
/*    */     //   304: aload #6
/*    */     //   306: getfield L$0 : Ljava/lang/Object;
/*    */     //   309: checkcast com/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater
/*    */     //   312: astore_0
/*    */     //   313: nop
/*    */     //   314: aload #5
/*    */     //   316: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   319: aload #5
/*    */     //   321: pop
/*    */     //   322: goto -> 341
/*    */     //   325: astore_3
/*    */     //   326: getstatic com/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   329: aload_0
/*    */     //   330: getfield timeoutMs : J
/*    */     //   333: <illegal opcode> makeConcatWithConstants : (J)Ljava/lang/String;
/*    */     //   338: invokevirtual info : (Ljava/lang/String;)V
/*    */     //   341: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   344: areturn
/*    */     //   345: new java/lang/IllegalStateException
/*    */     //   348: dup
/*    */     //   349: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   351: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   354: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 60
/*    */     //   #19	-> 101
/*    */     //   #20	-> 109
/*    */     //   #18	-> 156
/*    */     //   #27	-> 184
/*    */     //   #28	-> 186
/*    */     //   #18	-> 230
/*    */     //   #28	-> 250
/*    */     //   #31	-> 254
/*    */     //   #33	-> 256
/*    */     //   #34	-> 257
/*    */     //   #18	-> 301
/*    */     //   #34	-> 321
/*    */     //   #39	-> 325
/*    */     //   #40	-> 326
/*    */     //   #42	-> 341
/*    */     //   #18	-> 345
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	58	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater;
/*    */     //   177	56	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater;
/*    */     //   242	62	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater;
/*    */     //   313	9	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater;
/*    */     //   325	16	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater;
/*    */     //   101	58	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   168	56	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   0	355	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	295	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	288	5	$result	Ljava/lang/Object;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   185	224	254	kotlinx/coroutines/TimeoutCancellationException
/*    */     //   242	251	254	kotlinx/coroutines/TimeoutCancellationException
/*    */     //   256	295	325	kotlinx/coroutines/TimeoutCancellationException
/* 44 */     //   313	322	325	kotlinx/coroutines/TimeoutCancellationException } @NotNull private static final Logger logger = Logger.getInstance(DefaultProjectModelUpdater.class);
/*    */   
/*    */   @DebugMetadata(f = "DefaultProjectModelUpdater.kt", l = {20, 28, 34}, i = {0, 0, 1, 2}, s = {"L$0", "L$1", "L$0", "L$0"}, n = {"this", "project", "this", "this"}, m = "updateProjectModelAndWait", c = "com.intellij.ml.llm.matterhorn.ej.core.utils.await.DefaultProjectModelUpdater")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class DefaultProjectModelUpdater$updateProjectModelAndWait$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     DefaultProjectModelUpdater$updateProjectModelAndWait$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return DefaultProjectModelUpdater.this.updateProjectModelAndWait(null, (Continuation<? super Unit>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "DefaultProjectModelUpdater.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.utils.await.DefaultProjectModelUpdater$updateProjectModelAndWait$2")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class DefaultProjectModelUpdater$updateProjectModelAndWait$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     DefaultProjectModelUpdater$updateProjectModelAndWait$2(Project $project, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           TrackingUtil.trackActivityBlocking(this.$project, (ActivityKey)MatterhornActivityKey.INSTANCE, this.$project::invokeSuspend$lambda$0);
/*    */           return Unit.INSTANCE;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super DefaultProjectModelUpdater$updateProjectModelAndWait$2> $completion) {
/*    */       return (Continuation<Unit>)new DefaultProjectModelUpdater$updateProjectModelAndWait$2(this.$project, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((DefaultProjectModelUpdater$updateProjectModelAndWait$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */     
/*    */     private static final Unit invokeSuspend$lambda$0(Project $project) {
/*    */       ExternalSystemProjectTracker.Companion.getInstance($project).scheduleProjectRefresh();
/*    */       return Unit.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "DefaultProjectModelUpdater.kt", l = {29}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.utils.await.DefaultProjectModelUpdater$updateProjectModelAndWait$3")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class DefaultProjectModelUpdater$updateProjectModelAndWait$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
/*    */     int label;
/*    */     
/*    */     DefaultProjectModelUpdater$updateProjectModelAndWait$3(Project $project, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           this.label = 1;
/*    */           if (Observation.INSTANCE.awaitConfiguration(this.$project, DefaultProjectModelUpdater$updateProjectModelAndWait$3::invokeSuspend$lambda$0, (Continuation)this) == object)
/*    */             return object; 
/*    */           return Observation.INSTANCE.awaitConfiguration(this.$project, DefaultProjectModelUpdater$updateProjectModelAndWait$3::invokeSuspend$lambda$0, (Continuation)this);
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super DefaultProjectModelUpdater$updateProjectModelAndWait$3> $completion) {
/*    */       return (Continuation<Unit>)new DefaultProjectModelUpdater$updateProjectModelAndWait$3(this.$project, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((DefaultProjectModelUpdater$updateProjectModelAndWait$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */     
/*    */     private static final Unit invokeSuspend$lambda$0(String it) {
/*    */       DefaultProjectModelUpdater.Companion.getLogger().debug(it);
/*    */       return Unit.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "DefaultProjectModelUpdater.kt", l = {36}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.utils.await.DefaultProjectModelUpdater$updateProjectModelAndWait$5")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class DefaultProjectModelUpdater$updateProjectModelAndWait$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     DefaultProjectModelUpdater$updateProjectModelAndWait$5(Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore_2
/*    */       //   4: aload_0
/*    */       //   5: getfield label : I
/*    */       //   8: tableswitch default -> 82, 0 -> 32, 1 -> 69
/*    */       //   32: aload_1
/*    */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   36: invokestatic getCurrentIndicators : ()Ljava/util/List;
/*    */       //   39: invokeinterface size : ()I
/*    */       //   44: ifeq -> 78
/*    */       //   47: ldc2_w 10
/*    */       //   50: aload_0
/*    */       //   51: checkcast kotlin/coroutines/Continuation
/*    */       //   54: aload_0
/*    */       //   55: iconst_1
/*    */       //   56: putfield label : I
/*    */       //   59: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   62: dup
/*    */       //   63: aload_2
/*    */       //   64: if_acmpne -> 74
/*    */       //   67: aload_2
/*    */       //   68: areturn
/*    */       //   69: aload_1
/*    */       //   70: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   73: aload_1
/*    */       //   74: pop
/*    */       //   75: goto -> 36
/*    */       //   78: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   81: areturn
/*    */       //   82: new java/lang/IllegalStateException
/*    */       //   85: dup
/*    */       //   86: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   88: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   91: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #34	-> 3
/*    */       //   #35	-> 36
/*    */       //   #36	-> 47
/*    */       //   #34	-> 67
/*    */       //   #36	-> 74
/*    */       //   #38	-> 78
/*    */       //   #34	-> 82
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	92	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater$updateProjectModelAndWait$5;
/*    */       //   36	46	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super DefaultProjectModelUpdater$updateProjectModelAndWait$5> $completion) {
/*    */       return (Continuation<Unit>)new DefaultProjectModelUpdater$updateProjectModelAndWait$5($completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((DefaultProjectModelUpdater$updateProjectModelAndWait$5)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   public DefaultProjectModelUpdater() {
/*    */     this(0L, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\cor\\utils\await\DefaultProjectModelUpdater.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */