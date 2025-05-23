/*     */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.JbaAuthData;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.JbaUserLoginResult;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.ui.JBAccountInfoService;
/*     */ import com.intellij.util.ApplicationKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import kotlinx.coroutines.flow.FlowKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\024\020\r\032\b\022\004\022\0020\0170\016H@¢\006\002\020\020J\020\020\021\032\004\030\0010\022H@¢\006\002\020\020J \020\023\032\0020\0242\006\020\025\032\0020\0262\b\020\027\032\004\030\0010\030H@¢\006\002\020\031R\024\020\004\032\0020\0058BX\004¢\006\006\032\004\b\006\020\007R\034\020\b\032\n\022\006\022\004\030\0010\n0\tX\004¢\006\b\n\000\032\004\b\013\020\f¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepository;", "<init>", "()V", "jbaInfoService", "Lcom/intellij/ui/JBAccountInfoService;", "getJbaInfoService", "()Lcom/intellij/ui/JBAccountInfoService;", "authDataFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;", "getAuthDataFlow", "()Lkotlinx/coroutines/flow/Flow;", "getOAuthProviders", "", "Lcom/intellij/ui/JBAccountInfoService$JbaOAuthProvider;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadJbaServiceConfiguration", "Lcom/intellij/ui/JBAccountInfoService$JbaServiceConfiguration;", "loginToJba", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult;", "mode", "Lcom/intellij/ui/JBAccountInfoService$LoginMode;", "authProviderId", "", "(Lcom/intellij/ui/JBAccountInfoService$LoginMode;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data.repos"})
/*     */ @SourceDebugExtension({"SMAP\nJunieJbaUserRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieJbaUserRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,117:1\n49#2:118\n51#2:122\n46#3:119\n51#3:121\n105#4:120\n1#5:123\n61#6,5:124\n*S KotlinDebug\n*F\n+ 1 JunieJbaUserRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl\n*L\n49#1:118\n49#1:122\n49#1:119\n49#1:121\n49#1:120\n66#1:124,5\n*E\n"})
/*     */ final class JunieJbaUserRepositoryImpl
/*     */   implements JunieJbaUserRepository
/*     */ {
/*     */   @NotNull
/*     */   private final Flow<JbaAuthData> authDataFlow;
/*     */   
/*     */   public JunieJbaUserRepositoryImpl() {
/*  48 */     Flow flow1 = FlowKt.onStart(JunieJbaUserRepositoryKt.access$jbaAuthUpdates((ComponentManager)ApplicationKt.getApplication()), new JunieJbaUserRepositoryImpl$authDataFlow$1(null));
/*  49 */     int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 118 */     Flow $this$unsafeTransform$iv$iv = flow1; int $i$f$unsafeTransform = 0;
/* 119 */     int $i$f$unsafeFlow = 0;
/* 120 */     this.authDataFlow = new JunieJbaUserRepositoryImpl$special$$inlined$map$1($this$unsafeTransform$iv$iv, this); } private final JBAccountInfoService getJbaInfoService() {
/*     */     if (JBAccountInfoService.getInstance() == null) {
/*     */       JBAccountInfoService.getInstance();
/* 123 */       int $i$a$-checkNotNull-JunieJbaUserRepositoryImpl$jbaInfoService$1 = 0;
/*     */       String str = "JBAccountInfoService is unavailable";
/*     */       throw new IllegalStateException(str.toString());
/*     */     } 
/*     */     return JBAccountInfoService.getInstance();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Flow<JbaAuthData> getAuthDataFlow() {
/*     */     return this.authDataFlow;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieJbaUserRepository.kt", l = {48}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieJbaUserRepositoryImpl$authDataFlow$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\n\022\006\022\004\030\0010\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/intellij/ui/JBAccountInfoService$JBAData;"})
/*     */   static final class JunieJbaUserRepositoryImpl$authDataFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super JBAccountInfoService.JBAData>, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     JunieJbaUserRepositoryImpl$authDataFlow$1(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       FlowCollector $this$onStart;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           $this$onStart = (FlowCollector)this.L$0;
/*     */           this.label = 1;
/*     */           if ($this$onStart.emit(JunieJbaUserRepositoryImpl.this.getJbaInfoService().getUserData(), (Continuation)this) == object)
/*     */             return object; 
/*     */           $this$onStart.emit(JunieJbaUserRepositoryImpl.this.getJbaInfoService().getUserData(), (Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super JunieJbaUserRepositoryImpl$authDataFlow$1> $completion) {
/*     */       JunieJbaUserRepositoryImpl$authDataFlow$1 junieJbaUserRepositoryImpl$authDataFlow$1 = new JunieJbaUserRepositoryImpl$authDataFlow$1($completion);
/*     */       junieJbaUserRepositoryImpl$authDataFlow$1.L$0 = value;
/*     */       return (Continuation<Unit>)junieJbaUserRepositoryImpl$authDataFlow$1;
/*     */     }
/*     */     
/*     */     public final Object invoke(FlowCollector p1, Continuation<?> p2) {
/*     */       return ((JunieJbaUserRepositoryImpl$authDataFlow$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getOAuthProviders(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl$getOAuthProviders$1
/*     */     //   4: ifeq -> 36
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl$getOAuthProviders$1
/*     */     //   11: astore_3
/*     */     //   12: aload_3
/*     */     //   13: getfield label : I
/*     */     //   16: ldc -2147483648
/*     */     //   18: iand
/*     */     //   19: ifeq -> 36
/*     */     //   22: aload_3
/*     */     //   23: dup
/*     */     //   24: getfield label : I
/*     */     //   27: ldc -2147483648
/*     */     //   29: isub
/*     */     //   30: putfield label : I
/*     */     //   33: goto -> 46
/*     */     //   36: new com/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl$getOAuthProviders$1
/*     */     //   39: dup
/*     */     //   40: aload_0
/*     */     //   41: aload_1
/*     */     //   42: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   45: astore_3
/*     */     //   46: aload_3
/*     */     //   47: getfield result : Ljava/lang/Object;
/*     */     //   50: astore_2
/*     */     //   51: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   54: astore #4
/*     */     //   56: aload_3
/*     */     //   57: getfield label : I
/*     */     //   60: tableswitch default -> 131, 0 -> 84, 1 -> 107
/*     */     //   84: aload_2
/*     */     //   85: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   88: aload_0
/*     */     //   89: aload_3
/*     */     //   90: aload_3
/*     */     //   91: iconst_1
/*     */     //   92: putfield label : I
/*     */     //   95: invokespecial loadJbaServiceConfiguration : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   98: dup
/*     */     //   99: aload #4
/*     */     //   101: if_acmpne -> 112
/*     */     //   104: aload #4
/*     */     //   106: areturn
/*     */     //   107: aload_2
/*     */     //   108: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   111: aload_2
/*     */     //   112: checkcast com/intellij/ui/JBAccountInfoService$JbaServiceConfiguration
/*     */     //   115: dup
/*     */     //   116: ifnull -> 126
/*     */     //   119: invokevirtual authProviders : ()Ljava/util/List;
/*     */     //   122: dup
/*     */     //   123: ifnonnull -> 130
/*     */     //   126: pop
/*     */     //   127: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   130: areturn
/*     */     //   131: new java/lang/IllegalStateException
/*     */     //   134: dup
/*     */     //   135: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   137: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   140: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #55	-> 54
/*     */     //   #56	-> 88
/*     */     //   #55	-> 104
/*     */     //   #56	-> 112
/*     */     //   #55	-> 131
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   88	10	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl;
/*     */     //   0	141	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   46	85	3	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   51	80	2	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private final Object loadJbaServiceConfiguration(Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl$loadJbaServiceConfiguration$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl$loadJbaServiceConfiguration$1
/*     */     //   11: astore #7
/*     */     //   13: aload #7
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #7
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl$loadJbaServiceConfiguration$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #7
/*     */     //   50: aload #7
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #6
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #8
/*     */     //   62: aload #7
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 195, 0 -> 88, 1 -> 151
/*     */     //   88: aload #6
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: astore_2
/*     */     //   95: nop
/*     */     //   96: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */     //   99: pop
/*     */     //   100: aload_2
/*     */     //   101: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl
/*     */     //   104: astore_3
/*     */     //   105: iconst_0
/*     */     //   106: istore #4
/*     */     //   108: aload_3
/*     */     //   109: invokespecial getJbaInfoService : ()Lcom/intellij/ui/JBAccountInfoService;
/*     */     //   112: invokeinterface getServiceConfiguration : ()Ljava/util/concurrent/CompletableFuture;
/*     */     //   117: astore #5
/*     */     //   119: aload #5
/*     */     //   121: ldc 'getServiceConfiguration(...)'
/*     */     //   123: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   126: aload #5
/*     */     //   128: checkcast java/util/concurrent/CompletionStage
/*     */     //   131: aload #7
/*     */     //   133: aload #7
/*     */     //   135: iconst_1
/*     */     //   136: putfield label : I
/*     */     //   139: invokestatic await : (Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   142: dup
/*     */     //   143: aload #8
/*     */     //   145: if_acmpne -> 162
/*     */     //   148: aload #8
/*     */     //   150: areturn
/*     */     //   151: iconst_0
/*     */     //   152: istore #4
/*     */     //   154: nop
/*     */     //   155: aload #6
/*     */     //   157: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   160: aload #6
/*     */     //   162: checkcast com/intellij/ui/JBAccountInfoService$JbaServiceConfiguration
/*     */     //   165: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   168: astore_3
/*     */     //   169: goto -> 187
/*     */     //   172: astore #4
/*     */     //   174: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */     //   177: pop
/*     */     //   178: aload #4
/*     */     //   180: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*     */     //   183: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   186: astore_3
/*     */     //   187: aload_3
/*     */     //   188: invokestatic access$getLOG$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   191: invokestatic getOrLogException : (Ljava/lang/Object;Lcom/intellij/openapi/diagnostic/Logger;)Ljava/lang/Object;
/*     */     //   194: areturn
/*     */     //   195: new java/lang/IllegalStateException
/*     */     //   198: dup
/*     */     //   199: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   201: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   204: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #59	-> 60
/*     */     //   #60	-> 93
/*     */     //   #61	-> 108
/*     */     //   #59	-> 148
/*     */     //   #61	-> 162
/*     */     //   #60	-> 165
/*     */     //   #62	-> 188
/*     */     //   #60	-> 194
/*     */     //   #59	-> 195
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	2	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl;
/*     */     //   105	14	3	$this$loadJbaServiceConfiguration_u24lambda_u244	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl;
/*     */     //   108	43	4	$i$a$-runCatching-JunieJbaUserRepositoryImpl$loadJbaServiceConfiguration$2	I
/*     */     //   0	205	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	145	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	138	6	$result	Ljava/lang/Object;
/*     */     //   154	11	4	$i$a$-runCatching-JunieJbaUserRepositoryImpl$loadJbaServiceConfiguration$2	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   95	142	172	java/lang/Throwable
/*     */     //   154	169	172	java/lang/Throwable
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object loginToJba(@NotNull JBAccountInfoService.LoginMode mode, @Nullable String authProviderId, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl$loginToJba$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl$loginToJba$1
/*     */     //   11: astore #12
/*     */     //   13: aload #12
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #12
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl$loginToJba$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #12
/*     */     //   50: aload #12
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #11
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #13
/*     */     //   62: aload #12
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 353, 0 -> 92, 1 -> 227, 2 -> 345
/*     */     //   92: aload #11
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: invokestatic access$getLOG$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   100: astore #4
/*     */     //   102: aconst_null
/*     */     //   103: astore #5
/*     */     //   105: iconst_0
/*     */     //   106: istore #6
/*     */     //   108: aload #4
/*     */     //   110: invokevirtual isDebugEnabled : ()Z
/*     */     //   113: ifeq -> 137
/*     */     //   116: aload #4
/*     */     //   118: astore #10
/*     */     //   120: iconst_0
/*     */     //   121: istore #7
/*     */     //   123: aload_1
/*     */     //   124: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ui/JBAccountInfoService$LoginMode;)Ljava/lang/String;
/*     */     //   129: aload #10
/*     */     //   131: swap
/*     */     //   132: aload #5
/*     */     //   134: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   137: nop
/*     */     //   138: nop
/*     */     //   139: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */     //   142: pop
/*     */     //   143: iconst_0
/*     */     //   144: istore #4
/*     */     //   146: aload_0
/*     */     //   147: invokespecial getJbaInfoService : ()Lcom/intellij/ui/JBAccountInfoService;
/*     */     //   150: aload_1
/*     */     //   151: aload_2
/*     */     //   152: invokestatic emptyMap : ()Ljava/util/Map;
/*     */     //   155: invokeinterface startLoginSession : (Lcom/intellij/ui/JBAccountInfoService$LoginMode;Ljava/lang/String;Ljava/util/Map;)Lcom/intellij/ui/JBAccountInfoService$LoginSession;
/*     */     //   160: checkcast java/lang/AutoCloseable
/*     */     //   163: astore #5
/*     */     //   165: aconst_null
/*     */     //   166: astore #6
/*     */     //   168: nop
/*     */     //   169: aload #5
/*     */     //   171: checkcast com/intellij/ui/JBAccountInfoService$LoginSession
/*     */     //   174: astore #7
/*     */     //   176: iconst_0
/*     */     //   177: istore #8
/*     */     //   179: aload #7
/*     */     //   181: invokeinterface onCompleted : ()Ljava/util/concurrent/CompletableFuture;
/*     */     //   186: astore #9
/*     */     //   188: aload #9
/*     */     //   190: ldc 'onCompleted(...)'
/*     */     //   192: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   195: aload #9
/*     */     //   197: checkcast java/util/concurrent/CompletionStage
/*     */     //   200: aload #12
/*     */     //   202: aload #12
/*     */     //   204: aload #5
/*     */     //   206: putfield L$0 : Ljava/lang/Object;
/*     */     //   209: aload #12
/*     */     //   211: iconst_1
/*     */     //   212: putfield label : I
/*     */     //   215: invokestatic await : (Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   218: dup
/*     */     //   219: aload #13
/*     */     //   221: if_acmpne -> 254
/*     */     //   224: aload #13
/*     */     //   226: areturn
/*     */     //   227: iconst_0
/*     */     //   228: istore #4
/*     */     //   230: iconst_0
/*     */     //   231: istore #8
/*     */     //   233: aconst_null
/*     */     //   234: astore #6
/*     */     //   236: aload #12
/*     */     //   238: getfield L$0 : Ljava/lang/Object;
/*     */     //   241: checkcast java/lang/AutoCloseable
/*     */     //   244: astore #5
/*     */     //   246: nop
/*     */     //   247: aload #11
/*     */     //   249: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   252: aload #11
/*     */     //   254: checkcast com/intellij/ui/JBAccountInfoService$LoginResult
/*     */     //   257: astore #7
/*     */     //   259: aload #5
/*     */     //   261: aload #6
/*     */     //   263: invokestatic closeFinally : (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
/*     */     //   266: aload #7
/*     */     //   268: goto -> 292
/*     */     //   271: astore #7
/*     */     //   273: aload #7
/*     */     //   275: astore #6
/*     */     //   277: aload #7
/*     */     //   279: athrow
/*     */     //   280: astore #7
/*     */     //   282: aload #5
/*     */     //   284: aload #6
/*     */     //   286: invokestatic closeFinally : (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
/*     */     //   289: aload #7
/*     */     //   291: athrow
/*     */     //   292: nop
/*     */     //   293: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   296: astore #4
/*     */     //   298: goto -> 317
/*     */     //   301: astore #5
/*     */     //   303: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */     //   306: pop
/*     */     //   307: aload #5
/*     */     //   309: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*     */     //   312: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   315: astore #4
/*     */     //   317: aload #4
/*     */     //   319: aload #12
/*     */     //   321: aload #12
/*     */     //   323: aconst_null
/*     */     //   324: putfield L$0 : Ljava/lang/Object;
/*     */     //   327: aload #12
/*     */     //   329: iconst_2
/*     */     //   330: putfield label : I
/*     */     //   333: invokestatic access$toJbaUserLoginResult : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   336: dup
/*     */     //   337: aload #13
/*     */     //   339: if_acmpne -> 352
/*     */     //   342: aload #13
/*     */     //   344: areturn
/*     */     //   345: aload #11
/*     */     //   347: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   350: aload #11
/*     */     //   352: areturn
/*     */     //   353: new java/lang/IllegalStateException
/*     */     //   356: dup
/*     */     //   357: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   359: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   362: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #65	-> 60
/*     */     //   #66	-> 97
/*     */     //   #124	-> 102
/*     */     //   #125	-> 108
/*     */     //   #126	-> 116
/*     */     //   #66	-> 123
/*     */     //   #126	-> 132
/*     */     //   #128	-> 137
/*     */     //   #67	-> 138
/*     */     //   #68	-> 146
/*     */     //   #69	-> 179
/*     */     //   #65	-> 224
/*     */     //   #69	-> 254
/*     */     //   #68	-> 257
/*     */     //   #70	-> 292
/*     */     //   #67	-> 293
/*     */     //   #71	-> 321
/*     */     //   #65	-> 342
/*     */     //   #67	-> 352
/*     */     //   #65	-> 353
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	32	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl;
/*     */     //   129	9	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl;
/*     */     //   138	27	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl;
/*     */     //   97	32	1	mode	Lcom/intellij/ui/JBAccountInfoService$LoginMode;
/*     */     //   129	9	1	mode	Lcom/intellij/ui/JBAccountInfoService$LoginMode;
/*     */     //   138	27	1	mode	Lcom/intellij/ui/JBAccountInfoService$LoginMode;
/*     */     //   97	32	2	authProviderId	Ljava/lang/String;
/*     */     //   129	9	2	authProviderId	Ljava/lang/String;
/*     */     //   138	27	2	authProviderId	Ljava/lang/String;
/*     */     //   102	18	4	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   105	24	5	e$iv	Ljava/lang/Exception;
/*     */     //   129	8	5	e$iv	Ljava/lang/Exception;
/*     */     //   176	12	7	loginSession	Lcom/intellij/ui/JBAccountInfoService$LoginSession;
/*     */     //   123	6	7	$i$a$-debug$default-JunieJbaUserRepositoryImpl$loginToJba$2	I
/*     */     //   108	30	6	$i$f$debug	I
/*     */     //   179	48	8	$i$a$-use-JunieJbaUserRepositoryImpl$loginToJba$3$1	I
/*     */     //   146	81	4	$i$a$-runCatching-JunieJbaUserRepositoryImpl$loginToJba$3	I
/*     */     //   0	363	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	303	12	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	296	11	$result	Ljava/lang/Object;
/*     */     //   233	24	8	$i$a$-use-JunieJbaUserRepositoryImpl$loginToJba$3$1	I
/*     */     //   230	63	4	$i$a$-runCatching-JunieJbaUserRepositoryImpl$loginToJba$3	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   138	218	301	java/lang/Throwable
/*     */     //   168	218	271	java/lang/Throwable
/*     */     //   168	218	280	finally
/*     */     //   246	259	271	java/lang/Throwable
/*     */     //   246	259	280	finally
/*     */     //   246	298	301	java/lang/Throwable
/*     */     //   271	280	280	finally
/*     */     //   280	282	280	finally
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieJbaUserRepository.kt", l = {56}, i = {}, s = {}, n = {}, m = "getOAuthProviders", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieJbaUserRepositoryImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JunieJbaUserRepositoryImpl$getOAuthProviders$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     JunieJbaUserRepositoryImpl$getOAuthProviders$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JunieJbaUserRepositoryImpl.this.getOAuthProviders((Continuation<? super List<JBAccountInfoService.JbaOAuthProvider>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieJbaUserRepository.kt", l = {61}, i = {}, s = {}, n = {}, m = "loadJbaServiceConfiguration", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieJbaUserRepositoryImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JunieJbaUserRepositoryImpl$loadJbaServiceConfiguration$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     JunieJbaUserRepositoryImpl$loadJbaServiceConfiguration$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JunieJbaUserRepositoryImpl.this.loadJbaServiceConfiguration((Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieJbaUserRepository.kt", l = {69, 71}, i = {}, s = {}, n = {}, m = "loginToJba", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieJbaUserRepositoryImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JunieJbaUserRepositoryImpl$loginToJba$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     JunieJbaUserRepositoryImpl$loginToJba$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JunieJbaUserRepositoryImpl.this.loginToJba(null, null, (Continuation<? super JbaUserLoginResult>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieJbaUserRepositoryImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */