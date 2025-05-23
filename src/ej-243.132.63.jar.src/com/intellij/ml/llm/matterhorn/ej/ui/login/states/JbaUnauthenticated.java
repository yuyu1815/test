/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login.states;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\t\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\002\b\006\b\007\030\0002\0020\001:\001\037B!\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\004\b\b\020\tJ\006\020\031\032\0020\032J\006\020\033\032\0020\032J\006\020\034\032\0020\032J\006\020\035\032\0020\032J\006\020\036\032\0020\032R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017R\024\020\020\032\b\022\004\022\0020\0220\021X\004¢\006\002\n\000R\027\020\023\032\b\022\004\022\0020\0220\024¢\006\b\n\000\032\004\b\025\020\026R\016\020\027\032\0020\030X\004¢\006\002\n\000¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "project", "Lcom/intellij/openapi/project/Project;", "rejected", "", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/openapi/project/Project;Z)V", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "getProject", "()Lcom/intellij/openapi/project/Project;", "getRejected", "()Z", "_phase", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase;", "phase", "Lkotlinx/coroutines/flow/StateFlow;", "getPhase", "()Lkotlinx/coroutines/flow/StateFlow;", "jbaUserRepository", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepository;", "cancel", "", "loginManual", "login", "register", "needHelp", "LoginPhase", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nJbaUnauthenticated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JbaUnauthenticated.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,83:1\n226#2,5:84\n226#2,5:89\n*S KotlinDebug\n*F\n+ 1 JbaUnauthenticated.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated\n*L\n30#1:84,5\n41#1:89,5\n*E\n"})
/*    */ public final class JbaUnauthenticated implements GrazieActivationState {
/*    */   @NotNull
/*    */   private final CoroutineScope scope;
/*    */   @NotNull
/*    */   private final Project project;
/*    */   private final boolean rejected;
/*    */   
/* 19 */   public JbaUnauthenticated(@NotNull CoroutineScope scope, @NotNull Project project, boolean rejected) { this.scope = scope;
/* 20 */     this.project = project;
/* 21 */     this.rejected = rejected;
/*    */ 
/*    */     
/* 24 */     this._phase = StateFlowKt.MutableStateFlow(LoginPhase.INITIAL.INSTANCE);
/* 25 */     this.phase = (StateFlow<LoginPhase>)this._phase;
/*    */     
/* 27 */     this.jbaUserRepository = JunieJbaUserRepository.Companion.syncInstance(); }
/*    */   @NotNull private final MutableStateFlow<LoginPhase> _phase;
/*    */   @NotNull private final StateFlow<LoginPhase> phase;
/* 30 */   @NotNull private final JunieJbaUserRepository jbaUserRepository; public static final int $stable = 8; @NotNull public final CoroutineScope getScope() { return this.scope; } @NotNull public final Project getProject() { return this.project; } public final boolean getRejected() { return this.rejected; } @NotNull public final StateFlow<LoginPhase> getPhase() { return this.phase; } public final void cancel() { MutableStateFlow<LoginPhase> $this$update$iv = this._phase; int $i$f$update = 0;
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
/*    */     while (true) {
/* 85 */       Object prevValue$iv = $this$update$iv.getValue();
/* 86 */       LoginPhase it = (LoginPhase)prevValue$iv; int $i$a$-update-JbaUnauthenticated$cancel$1 = 0; Object nextValue$iv = LoginPhase.INITIAL.INSTANCE;
/* 87 */       if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv))
/*    */         return; 
/*    */     }  } public final void loginManual() { BuildersKt.launch$default(this.scope, null, null, new JbaUnauthenticated$loginManual$1(null), 3, null); }
/* 90 */   public final void login() { if (Intrinsics.areEqual(this._phase.getValue(), LoginPhase.INITIAL.INSTANCE) || this._phase.getValue() instanceof LoginPhase.Error) { MutableStateFlow<LoginPhase> $this$update$iv = this._phase; int $i$f$update = 0; while (true) { Object prevValue$iv = $this$update$iv.getValue();
/* 91 */         LoginPhase it = (LoginPhase)prevValue$iv; int $i$a$-update-JbaUnauthenticated$login$1 = 0; Object nextValue$iv = LoginPhase.PROGRESS.INSTANCE;
/* 92 */         if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv))
/*    */           BuildersKt.launch$default(this.scope, null, null, new JbaUnauthenticated$login$2(null), 3, null);  }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   @DebugMetadata(f = "JbaUnauthenticated.kt", l = {35}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.states.JbaUnauthenticated$loginManual$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class JbaUnauthenticated$loginManual$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     JbaUnauthenticated$loginManual$1(Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           this.label = 1;
/*    */           if (JbaUnauthenticated.this.jbaUserRepository.loginToJba(JBAccountInfoService.LoginMode.MANUAL, null, (Continuation)this) == object)
/*    */             return object; 
/*    */           JbaUnauthenticated.this.jbaUserRepository.loginToJba(JBAccountInfoService.LoginMode.MANUAL, null, (Continuation)this);
/*    */           return Unit.INSTANCE;
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return Unit.INSTANCE;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super JbaUnauthenticated$loginManual$1> $completion) {
/*    */       return (Continuation<Unit>)new JbaUnauthenticated$loginManual$1($completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((JbaUnauthenticated$loginManual$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "JbaUnauthenticated.kt", l = {43}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.states.JbaUnauthenticated$login$2")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   @SourceDebugExtension({"SMAP\nJbaUnauthenticated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JbaUnauthenticated.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$login$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,83:1\n226#2,5:84\n226#2,5:89\n226#2,5:94\n226#2,5:99\n*S KotlinDebug\n*F\n+ 1 JbaUnauthenticated.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$login$2\n*L\n45#1:84,5\n49#1:89,5\n53#1:94,5\n57#1:99,5\n*E\n"})
/*    */   static final class JbaUnauthenticated$login$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     JbaUnauthenticated$login$2(Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore #8
/*    */       //   5: aload_0
/*    */       //   6: getfield label : I
/*    */       //   9: tableswitch default -> 370, 0 -> 32, 1 -> 70
/*    */       //   32: aload_1
/*    */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   36: aload_0
/*    */       //   37: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated;
/*    */       //   40: invokestatic access$getJbaUserRepository$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated;)Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepository;
/*    */       //   43: getstatic com/intellij/ui/JBAccountInfoService$LoginMode.AUTO : Lcom/intellij/ui/JBAccountInfoService$LoginMode;
/*    */       //   46: aconst_null
/*    */       //   47: aload_0
/*    */       //   48: checkcast kotlin/coroutines/Continuation
/*    */       //   51: aload_0
/*    */       //   52: iconst_1
/*    */       //   53: putfield label : I
/*    */       //   56: invokeinterface loginToJba : (Lcom/intellij/ui/JBAccountInfoService$LoginMode;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   61: dup
/*    */       //   62: aload #8
/*    */       //   64: if_acmpne -> 75
/*    */       //   67: aload #8
/*    */       //   69: areturn
/*    */       //   70: aload_1
/*    */       //   71: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   74: aload_1
/*    */       //   75: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult
/*    */       //   78: astore_2
/*    */       //   79: aload_2
/*    */       //   80: getstatic com/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Cancellation.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Cancellation;
/*    */       //   83: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */       //   86: ifeq -> 143
/*    */       //   89: aload_0
/*    */       //   90: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated;
/*    */       //   93: invokestatic access$get_phase$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*    */       //   96: astore_3
/*    */       //   97: iconst_0
/*    */       //   98: istore #4
/*    */       //   100: nop
/*    */       //   101: aload_3
/*    */       //   102: invokeinterface getValue : ()Ljava/lang/Object;
/*    */       //   107: astore #5
/*    */       //   109: aload #5
/*    */       //   111: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase
/*    */       //   114: pop
/*    */       //   115: iconst_0
/*    */       //   116: istore #7
/*    */       //   118: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$INITIAL.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$INITIAL;
/*    */       //   121: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase
/*    */       //   124: astore #6
/*    */       //   126: aload_3
/*    */       //   127: aload #5
/*    */       //   129: aload #6
/*    */       //   131: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */       //   136: ifeq -> 100
/*    */       //   139: nop
/*    */       //   140: goto -> 366
/*    */       //   143: aload_2
/*    */       //   144: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Failure$ErrorResponse
/*    */       //   147: ifeq -> 215
/*    */       //   150: aload_0
/*    */       //   151: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated;
/*    */       //   154: invokestatic access$get_phase$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*    */       //   157: astore_3
/*    */       //   158: iconst_0
/*    */       //   159: istore #4
/*    */       //   161: nop
/*    */       //   162: aload_3
/*    */       //   163: invokeinterface getValue : ()Ljava/lang/Object;
/*    */       //   168: astore #5
/*    */       //   170: aload #5
/*    */       //   172: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase
/*    */       //   175: pop
/*    */       //   176: iconst_0
/*    */       //   177: istore #7
/*    */       //   179: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$Error
/*    */       //   182: dup
/*    */       //   183: aload_2
/*    */       //   184: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Failure$ErrorResponse
/*    */       //   187: invokevirtual getErrorMessage : ()Ljava/lang/String;
/*    */       //   190: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   193: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase
/*    */       //   196: astore #6
/*    */       //   198: aload_3
/*    */       //   199: aload #5
/*    */       //   201: aload #6
/*    */       //   203: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */       //   208: ifeq -> 161
/*    */       //   211: nop
/*    */       //   212: goto -> 366
/*    */       //   215: aload_2
/*    */       //   216: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Failure$Internal
/*    */       //   219: ifeq -> 297
/*    */       //   222: aload_0
/*    */       //   223: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated;
/*    */       //   226: invokestatic access$get_phase$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*    */       //   229: astore_3
/*    */       //   230: iconst_0
/*    */       //   231: istore #4
/*    */       //   233: nop
/*    */       //   234: aload_3
/*    */       //   235: invokeinterface getValue : ()Ljava/lang/Object;
/*    */       //   240: astore #5
/*    */       //   242: aload #5
/*    */       //   244: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase
/*    */       //   247: pop
/*    */       //   248: iconst_0
/*    */       //   249: istore #7
/*    */       //   251: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$Error
/*    */       //   254: dup
/*    */       //   255: aload_2
/*    */       //   256: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Failure$Internal
/*    */       //   259: invokevirtual getThrowable : ()Ljava/lang/Throwable;
/*    */       //   262: invokevirtual getMessage : ()Ljava/lang/String;
/*    */       //   265: dup
/*    */       //   266: ifnonnull -> 272
/*    */       //   269: pop
/*    */       //   270: ldc 'Unknown error'
/*    */       //   272: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   275: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase
/*    */       //   278: astore #6
/*    */       //   280: aload_3
/*    */       //   281: aload #5
/*    */       //   283: aload #6
/*    */       //   285: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */       //   290: ifeq -> 233
/*    */       //   293: nop
/*    */       //   294: goto -> 366
/*    */       //   297: aload_2
/*    */       //   298: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Success
/*    */       //   301: ifeq -> 358
/*    */       //   304: aload_0
/*    */       //   305: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated;
/*    */       //   308: invokestatic access$get_phase$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*    */       //   311: astore_3
/*    */       //   312: iconst_0
/*    */       //   313: istore #4
/*    */       //   315: nop
/*    */       //   316: aload_3
/*    */       //   317: invokeinterface getValue : ()Ljava/lang/Object;
/*    */       //   322: astore #5
/*    */       //   324: aload #5
/*    */       //   326: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase
/*    */       //   329: pop
/*    */       //   330: iconst_0
/*    */       //   331: istore #7
/*    */       //   333: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$COMPLETED.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$COMPLETED;
/*    */       //   336: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase
/*    */       //   339: astore #6
/*    */       //   341: aload_3
/*    */       //   342: aload #5
/*    */       //   344: aload #6
/*    */       //   346: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */       //   351: ifeq -> 315
/*    */       //   354: nop
/*    */       //   355: goto -> 366
/*    */       //   358: new kotlin/NoWhenBranchMatchedException
/*    */       //   361: dup
/*    */       //   362: invokespecial <init> : ()V
/*    */       //   365: athrow
/*    */       //   366: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   369: areturn
/*    */       //   370: new java/lang/IllegalStateException
/*    */       //   373: dup
/*    */       //   374: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   376: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   379: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #42	-> 3
/*    */       //   #43	-> 36
/*    */       //   #42	-> 67
/*    */       //   #44	-> 79
/*    */       //   #45	-> 89
/*    */       //   #84	-> 100
/*    */       //   #85	-> 101
/*    */       //   #86	-> 109
/*    */       //   #45	-> 118
/*    */       //   #86	-> 124
/*    */       //   #87	-> 126
/*    */       //   #88	-> 139
/*    */       //   #48	-> 143
/*    */       //   #49	-> 150
/*    */       //   #89	-> 161
/*    */       //   #90	-> 162
/*    */       //   #91	-> 170
/*    */       //   #49	-> 179
/*    */       //   #91	-> 196
/*    */       //   #92	-> 198
/*    */       //   #93	-> 211
/*    */       //   #52	-> 215
/*    */       //   #53	-> 222
/*    */       //   #94	-> 233
/*    */       //   #95	-> 234
/*    */       //   #96	-> 242
/*    */       //   #53	-> 251
/*    */       //   #96	-> 278
/*    */       //   #97	-> 280
/*    */       //   #98	-> 293
/*    */       //   #56	-> 297
/*    */       //   #57	-> 304
/*    */       //   #99	-> 315
/*    */       //   #100	-> 316
/*    */       //   #101	-> 324
/*    */       //   #57	-> 333
/*    */       //   #101	-> 339
/*    */       //   #102	-> 341
/*    */       //   #103	-> 354
/*    */       //   #43	-> 358
/*    */       //   #60	-> 366
/*    */       //   #42	-> 370
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   79	10	2	loginResult	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult;
/*    */       //   143	53	2	loginResult	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult;
/*    */       //   196	15	2	loginResult	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult;
/*    */       //   215	63	2	loginResult	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult;
/*    */       //   278	15	2	loginResult	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult;
/*    */       //   297	7	2	loginResult	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult;
/*    */       //   97	43	3	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*    */       //   158	54	3	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*    */       //   230	64	3	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*    */       //   312	43	3	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*    */       //   109	31	5	prevValue$iv	Ljava/lang/Object;
/*    */       //   170	42	5	prevValue$iv	Ljava/lang/Object;
/*    */       //   242	52	5	prevValue$iv	Ljava/lang/Object;
/*    */       //   324	31	5	prevValue$iv	Ljava/lang/Object;
/*    */       //   126	14	6	nextValue$iv	Ljava/lang/Object;
/*    */       //   198	14	6	nextValue$iv	Ljava/lang/Object;
/*    */       //   280	14	6	nextValue$iv	Ljava/lang/Object;
/*    */       //   341	14	6	nextValue$iv	Ljava/lang/Object;
/*    */       //   118	6	7	$i$a$-update-JbaUnauthenticated$login$2$1	I
/*    */       //   100	40	4	$i$f$update	I
/*    */       //   179	17	7	$i$a$-update-JbaUnauthenticated$login$2$2	I
/*    */       //   161	51	4	$i$f$update	I
/*    */       //   251	27	7	$i$a$-update-JbaUnauthenticated$login$2$3	I
/*    */       //   233	61	4	$i$f$update	I
/*    */       //   333	6	7	$i$a$-update-JbaUnauthenticated$login$2$4	I
/*    */       //   315	40	4	$i$f$update	I
/*    */       //   0	380	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$login$2;
/*    */       //   36	334	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super JbaUnauthenticated$login$2> $completion) {
/*    */       return (Continuation<Unit>)new JbaUnauthenticated$login$2($completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((JbaUnauthenticated$login$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   public final void register() {
/*    */     BuildersKt.launch$default(this.scope, null, null, new JbaUnauthenticated$register$1(null), 3, null);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "JbaUnauthenticated.kt", l = {66, 66}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.states.JbaUnauthenticated$register$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class JbaUnauthenticated$register$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     JbaUnauthenticated$register$1(Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           this.label = 1;
/*    */           if (JunieAipLicenseRepository.Companion.instance((Continuation)this) == object)
/*    */             return object; 
/*    */           this.label = 2;
/*    */           if (((JunieAipLicenseRepository)JunieAipLicenseRepository.Companion.instance((Continuation)this)).getRegisterAccountUrl((Continuation)this) == object)
/*    */             return object; 
/*    */           BrowserUtil.open((String)((JunieAipLicenseRepository)JunieAipLicenseRepository.Companion.instance((Continuation)this)).getRegisterAccountUrl((Continuation)this));
/*    */           return Unit.INSTANCE;
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           this.label = 2;
/*    */           if (((JunieAipLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1).getRegisterAccountUrl((Continuation)this) == object)
/*    */             return object; 
/*    */           BrowserUtil.open((String)((JunieAipLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1).getRegisterAccountUrl((Continuation)this));
/*    */           return Unit.INSTANCE;
/*    */         case 2:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           BrowserUtil.open((String)SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return Unit.INSTANCE;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super JbaUnauthenticated$register$1> $completion) {
/*    */       return (Continuation<Unit>)new JbaUnauthenticated$register$1($completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((JbaUnauthenticated$register$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   public final void needHelp() {
/*    */     (new JunieFeedbackDialog(this.project)).show();
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\004\004\005\006\007B\t\b\004¢\006\004\b\002\020\003\001\004\b\t\n\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase;", "", "<init>", "()V", "INITIAL", "PROGRESS", "COMPLETED", "Error", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$COMPLETED;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$INITIAL;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$PROGRESS;", "ej-ui"})
/*    */   @StabilityInferred(parameters = 1)
/*    */   public static abstract class LoginPhase {
/*    */     public static final int $stable;
/*    */     
/*    */     private LoginPhase() {}
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$INITIAL;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase;", "<init>", "()V", "ej-ui"})
/*    */     @StabilityInferred(parameters = 1)
/*    */     public static final class INITIAL extends LoginPhase {
/*    */       @NotNull
/*    */       public static final INITIAL INSTANCE = new INITIAL();
/*    */       public static final int $stable;
/*    */       
/*    */       private INITIAL() {
/*    */         super(null);
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$PROGRESS;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase;", "<init>", "()V", "ej-ui"})
/*    */     @StabilityInferred(parameters = 1)
/*    */     public static final class PROGRESS extends LoginPhase {
/*    */       @NotNull
/*    */       public static final PROGRESS INSTANCE = new PROGRESS();
/*    */       public static final int $stable;
/*    */       
/*    */       private PROGRESS() {
/*    */         super(null);
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$COMPLETED;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase;", "<init>", "()V", "ej-ui"})
/*    */     @StabilityInferred(parameters = 1)
/*    */     public static final class COMPLETED extends LoginPhase {
/*    */       @NotNull
/*    */       public static final COMPLETED INSTANCE = new COMPLETED();
/*    */       public static final int $stable;
/*    */       
/*    */       private COMPLETED() {
/*    */         super(null);
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "ej-ui"})
/*    */     @StabilityInferred(parameters = 1)
/*    */     public static final class Error extends LoginPhase {
/*    */       @NotNull
/*    */       private final String message;
/*    */       public static final int $stable;
/*    */       
/*    */       public Error(@NotNull String message) {
/*    */         super(null);
/*    */         this.message = message;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final String getMessage() {
/*    */         return this.message;
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$INITIAL;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase;", "<init>", "()V", "ej-ui"})
/*    */   @StabilityInferred(parameters = 1)
/*    */   public static final class INITIAL extends LoginPhase {
/*    */     @NotNull
/*    */     public static final INITIAL INSTANCE = new INITIAL();
/*    */     public static final int $stable;
/*    */     
/*    */     private INITIAL() {
/*    */       super(null);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$PROGRESS;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase;", "<init>", "()V", "ej-ui"})
/*    */   @StabilityInferred(parameters = 1)
/*    */   public static final class PROGRESS extends LoginPhase {
/*    */     @NotNull
/*    */     public static final PROGRESS INSTANCE = new PROGRESS();
/*    */     public static final int $stable;
/*    */     
/*    */     private PROGRESS() {
/*    */       super(null);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\states\JbaUnauthenticated.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */