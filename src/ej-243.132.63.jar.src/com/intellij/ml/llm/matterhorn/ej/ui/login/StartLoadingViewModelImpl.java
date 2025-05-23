/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*     */ import com.intellij.ml.llm.matterhorn.core.llm.ingrazzio.IngrazzioAuthService;
/*     */ import com.intellij.openapi.application.ApplicationManager;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import java.awt.Desktop;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Job;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import kotlinx.coroutines.flow.MutableStateFlow;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000n\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\013\n\002\b\n\b\007\030\0002\0020\0012\0020\002B\037\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b¢\006\004\b\t\020\nJ\b\020%\032\0020&H\026J\b\020'\032\0020(H\026J\020\020)\032\0020&2\006\020*\032\0020(H\026J\b\020+\032\0020&H\026J\030\020,\032\0020&2\b\b\002\020-\032\0020(H@¢\006\002\020.J\016\020/\032\0020(H@¢\006\002\0200J\b\0201\032\0020&H\026R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\007\032\0020\bX\004¢\006\002\n\000R\033\020\013\032\0020\f8BX\002¢\006\f\n\004\b\017\020\020\032\004\b\r\020\016R\024\020\021\032\b\022\004\022\0020\0230\022X\004¢\006\002\n\000R\032\020\024\032\b\022\004\022\0020\0230\025X\004¢\006\b\n\000\032\004\b\026\020\027R\024\020\030\032\b\022\004\022\0020\0320\031X\004¢\006\002\n\000R\032\020\033\032\b\022\004\022\0020\0320\034X\004¢\006\b\n\000\032\004\b\035\020\036R\020\020\037\032\004\030\0010 X\016¢\006\002\n\000R\016\020!\032\0020\"X\004¢\006\002\n\000R\024\020#\032\b\022\004\022\0020$0\025X\004¢\006\002\n\000¨\0062"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModel;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lcom/intellij/openapi/project/Project;)V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "logger$delegate", "Lkotlin/Lazy;", "_effect", "Lkotlinx/coroutines/channels/Channel;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenEffect;", "effect", "Lkotlinx/coroutines/flow/Flow;", "getEffect", "()Lkotlinx/coroutines/flow/Flow;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "checkAccessJob", "Lkotlinx/coroutines/Job;", "authService", "Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;", "authLinkFlow", "Lio/ktor/http/Url;", "openJoinWaitListAction", "", "isExternalBrowseSupported", "", "startLoginAction", "openBrowser", "onBackToLogin", "applyCheckAccess", "showErrorIfNotGranted", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasDirectLLMKeyAccess", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userAskForHelp", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nStartLoadingViewModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartLoadingViewModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,150:1\n40#2,3:151\n40#2,3:164\n226#3,5:154\n226#3,5:159\n226#3,5:167\n226#3,5:172\n226#3,5:177\n14#4:182\n*S KotlinDebug\n*F\n+ 1 StartLoadingViewModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl\n*L\n52#1:151,3\n107#1:164,3\n81#1:154,5\n103#1:159,5\n114#1:167,5\n121#1:172,5\n125#1:177,5\n42#1:182\n*E\n"})
/*     */ public final class StartLoadingViewModelImpl extends ViewModel implements StartLoadingViewModel {
/*     */   @NotNull
/*     */   private final MatterhornPropertyProvider propertyProvider;
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final Lazy logger$delegate;
/*     */   @NotNull
/*     */   private final Channel<LoginScreenEffect> _effect;
/*     */   @NotNull
/*     */   private final Flow<LoginScreenEffect> effect;
/*     */   
/*     */   public StartLoadingViewModelImpl(@NotNull CoroutineScope coroutineScope, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull Project project) {
/*  40 */     super(coroutineScope, "Start page loading model"); this.propertyProvider = propertyProvider;
/*     */     this.project = project;
/*  42 */     this.logger$delegate = LazyKt.lazy(StartLoadingViewModelImpl::logger_delegate$lambda$0);
/*     */     
/*  44 */     this._effect = ChannelKt.Channel$default(-2, null, null, 6, null);
/*  45 */     this.effect = FlowKt.receiveAsFlow((ReceiveChannel)this._effect);
/*     */     
/*  47 */     this._state = StateFlowKt.MutableStateFlow(new LoginScreenState.Idle(null, 1, null));
/*  48 */     this.state = (StateFlow<LoginScreenState>)this._state;
/*     */ 
/*     */ 
/*     */     
/*  52 */     int $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 151 */     Class<IngrazzioAuthService> serviceClass$iv = IngrazzioAuthService.class;
/* 152 */     if (ApplicationManager.getApplication().getService(serviceClass$iv) == null) { ApplicationManager.getApplication().getService(serviceClass$iv);
/* 153 */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ')'); }  ((StartLoadingViewModelImpl)ApplicationManager.getApplication().getService(serviceClass$iv)).authService = (IngrazzioAuthService)ApplicationManager.getApplication().getService(serviceClass$iv); this.authLinkFlow = this.authService.getAuthLinkFlow(); BuildersKt.launch$default(getScope(), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; public final Object invokeSuspend(Object $result) { MutableStateFlow $this$update$iv; int $i$f$update; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$update$iv = StartLoadingViewModelImpl.this._state; $i$f$update = 0; while (true) { Object prevValue$iv = $this$update$iv.getValue(); (LoginScreenState)prevValue$iv; int $i$a$-update-StartLoadingViewModelImpl$1$1 = 0; Object nextValue$iv = new LoginScreenState.Loading(false);
/* 154 */                   if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv)) {
/*     */                     this.label = 1;
/*     */                     if (StartLoadingViewModelImpl.this.applyCheckAccess(false, (Continuation)this) == object)
/*     */                       return object; 
/*     */                   }  }
/*     */               
/*     */               case 1:
/*     */                 ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                 return Unit.INSTANCE; }
/*     */             
/*     */             throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */            public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */             return (Continuation)new Function2<>(StartLoadingViewModelImpl.this, $completion);
/*     */           } public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */             return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */           } }
/*     */         3, null);
/*     */   } @NotNull
/*     */   private final MutableStateFlow<LoginScreenState> _state; @NotNull
/*     */   private final StateFlow<LoginScreenState> state; @Nullable
/*     */   private Job checkAccessJob; @NotNull
/*     */   private final IngrazzioAuthService authService; @NotNull
/*     */   private final Flow<Url> authLinkFlow; public static final int $stable = 8; private final Logger getLogger() {
/*     */     Lazy lazy = this.logger$delegate;
/*     */     return (Logger)lazy.getValue();
/*     */   }
/*     */   private static final Logger logger_delegate$lambda$0() {
/*     */     int $i$f$logger = 0;
/* 182 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(StartLoadingViewModelImpl.class), "getInstance(...)"); return Logger.getInstance(StartLoadingViewModelImpl.class);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Flow<LoginScreenEffect> getEffect() {
/*     */     return this.effect;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public StateFlow<LoginScreenState> getState() {
/*     */     return this.state;
/*     */   }
/*     */   
/*     */   public void openJoinWaitListAction() {
/*     */     Url authorizationUrl = URLUtilsKt.URLBuilder("https://lp.jetbrains.com/junie-join-access-waitlist").build();
/*     */     if (isExternalBrowseSupported()) {
/*     */       Desktop.getDesktop().browse(URLUtilsJvmKt.toURI(authorizationUrl));
/*     */       getLogger().info("Browser opened with the WaitList URL");
/*     */     } else {
/*     */       getLogger().info("Can't open WaitList URL in browser");
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean isExternalBrowseSupported() {
/*     */     return (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE));
/*     */   }
/*     */   
/*     */   public void startLoginAction(boolean openBrowser) {
/*     */     if (openBrowser) {
/*     */       MutableStateFlow<LoginScreenState> $this$update$iv = this._state;
/*     */       int $i$f$update = 0;
/*     */       while (true) {
/*     */         Object prevValue$iv = $this$update$iv.getValue();
/*     */         LoginScreenState it = (LoginScreenState)prevValue$iv;
/*     */         int $i$a$-update-StartLoadingViewModelImpl$startLoginAction$1 = 0;
/*     */         Object nextValue$iv = new LoginScreenState.Loading(true);
/*     */         if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv))
/*     */           break; 
/*     */       } 
/*     */     } 
/*     */     BuildersKt.launch$default(getScope(), null, null, new StartLoadingViewModelImpl$startLoginAction$2(openBrowser, null), 3, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "StartLoadingViewModelImpl.kt", l = {109, 111, 120}, i = {0, 0, 0, 1, 1, 1, 1, 2, 2}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1"}, n = {"this", "authService", "showErrorIfNotGranted", "this", "authService", "accessToken", "showErrorIfNotGranted", "this", "authService"}, m = "applyCheckAccess", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.StartLoadingViewModelImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class StartLoadingViewModelImpl$applyCheckAccess$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     boolean Z$0;
/*     */     int label;
/*     */     
/*     */     StartLoadingViewModelImpl$applyCheckAccess$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return StartLoadingViewModelImpl.this.applyCheckAccess(false, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "StartLoadingViewModelImpl.kt", l = {130, 131}, i = {0}, s = {"L$0"}, n = {"this"}, m = "hasDirectLLMKeyAccess", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.StartLoadingViewModelImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class StartLoadingViewModelImpl$hasDirectLLMKeyAccess$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     StartLoadingViewModelImpl$hasDirectLLMKeyAccess$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return StartLoadingViewModelImpl.this.hasDirectLLMKeyAccess((Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "StartLoadingViewModelImpl.kt", l = {87}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.StartLoadingViewModelImpl$startLoginAction$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class StartLoadingViewModelImpl$startLoginAction$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     StartLoadingViewModelImpl$startLoginAction$2(boolean $openBrowser, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_2
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 120, 0 -> 32, 1 -> 66
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;
/*     */       //   40: invokestatic access$getCheckAccessJob$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;)Lkotlinx/coroutines/Job;
/*     */       //   43: dup
/*     */       //   44: ifnull -> 75
/*     */       //   47: aload_0
/*     */       //   48: checkcast kotlin/coroutines/Continuation
/*     */       //   51: aload_0
/*     */       //   52: iconst_1
/*     */       //   53: putfield label : I
/*     */       //   56: invokestatic cancelAndJoin : (Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   59: dup
/*     */       //   60: aload_2
/*     */       //   61: if_acmpne -> 71
/*     */       //   64: aload_2
/*     */       //   65: areturn
/*     */       //   66: aload_1
/*     */       //   67: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   70: aload_1
/*     */       //   71: pop
/*     */       //   72: goto -> 76
/*     */       //   75: pop
/*     */       //   76: aload_0
/*     */       //   77: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;
/*     */       //   80: aload_0
/*     */       //   81: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;
/*     */       //   84: invokevirtual getScope : ()Lkotlinx/coroutines/CoroutineScope;
/*     */       //   87: aconst_null
/*     */       //   88: aconst_null
/*     */       //   89: new com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl$startLoginAction$2$1
/*     */       //   92: dup
/*     */       //   93: aload_0
/*     */       //   94: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;
/*     */       //   97: aload_0
/*     */       //   98: getfield $openBrowser : Z
/*     */       //   101: aconst_null
/*     */       //   102: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;ZLkotlin/coroutines/Continuation;)V
/*     */       //   105: checkcast kotlin/jvm/functions/Function2
/*     */       //   108: iconst_3
/*     */       //   109: aconst_null
/*     */       //   110: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*     */       //   113: invokestatic access$setCheckAccessJob$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;Lkotlinx/coroutines/Job;)V
/*     */       //   116: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   119: areturn
/*     */       //   120: new java/lang/IllegalStateException
/*     */       //   123: dup
/*     */       //   124: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   126: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   129: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #86	-> 3
/*     */       //   #87	-> 36
/*     */       //   #86	-> 64
/*     */       //   #87	-> 71
/*     */       //   #88	-> 76
/*     */       //   #99	-> 116
/*     */       //   #86	-> 120
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	130	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl$startLoginAction$2;
/*     */       //   36	84	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super StartLoadingViewModelImpl$startLoginAction$2> $completion) {
/*     */       return (Continuation<Unit>)new StartLoadingViewModelImpl$startLoginAction$2(this.$openBrowser, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((StartLoadingViewModelImpl$startLoginAction$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   public void onBackToLogin() {
/*     */     MutableStateFlow<LoginScreenState> $this$update$iv = this._state;
/*     */     int $i$f$update = 0;
/*     */     while (true) {
/*     */       Object prevValue$iv = $this$update$iv.getValue();
/*     */       LoginScreenState it = (LoginScreenState)prevValue$iv;
/*     */       int $i$a$-update-StartLoadingViewModelImpl$onBackToLogin$1 = 0;
/*     */       Object nextValue$iv = new LoginScreenState.Idle(null, 1, null);
/*     */       if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv))
/*     */         return; 
/*     */     } 
/*     */   }
/*     */   
/*     */   private final Object applyCheckAccess(boolean showErrorIfNotGranted, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl$applyCheckAccess$1
/*     */     //   4: ifeq -> 41
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl$applyCheckAccess$1
/*     */     //   11: astore #13
/*     */     //   13: aload #13
/*     */     //   15: getfield label : I
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload #13
/*     */     //   27: dup
/*     */     //   28: getfield label : I
/*     */     //   31: ldc_w -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 52
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl$applyCheckAccess$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload_2
/*     */     //   47: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   50: astore #13
/*     */     //   52: aload #13
/*     */     //   54: getfield result : Ljava/lang/Object;
/*     */     //   57: astore #12
/*     */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   62: astore #14
/*     */     //   64: aload #13
/*     */     //   66: getfield label : I
/*     */     //   69: tableswitch default -> 679, 0 -> 100, 1 -> 234, 2 -> 316, 3 -> 508
/*     */     //   100: aload #12
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: iconst_0
/*     */     //   106: istore #4
/*     */     //   108: ldc com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */     //   110: astore #5
/*     */     //   112: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   115: aload #5
/*     */     //   117: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   122: dup
/*     */     //   123: ifnonnull -> 190
/*     */     //   126: pop
/*     */     //   127: new java/lang/RuntimeException
/*     */     //   130: dup
/*     */     //   131: new java/lang/StringBuilder
/*     */     //   134: dup
/*     */     //   135: invokespecial <init> : ()V
/*     */     //   138: ldc 'Cannot find service '
/*     */     //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   143: aload #5
/*     */     //   145: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   148: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   151: ldc ' (classloader='
/*     */     //   153: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   156: aload #5
/*     */     //   158: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
/*     */     //   161: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   164: ldc ', client='
/*     */     //   166: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   169: getstatic com/intellij/codeWithMe/ClientId.Companion : Lcom/intellij/codeWithMe/ClientId$Companion;
/*     */     //   172: invokevirtual getCurrentOrNull : ()Lcom/intellij/codeWithMe/ClientId;
/*     */     //   175: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   178: bipush #41
/*     */     //   180: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   183: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   186: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   189: athrow
/*     */     //   190: nop
/*     */     //   191: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */     //   194: astore_3
/*     */     //   195: aload_3
/*     */     //   196: aload #13
/*     */     //   198: aload #13
/*     */     //   200: aload_0
/*     */     //   201: putfield L$0 : Ljava/lang/Object;
/*     */     //   204: aload #13
/*     */     //   206: aload_3
/*     */     //   207: putfield L$1 : Ljava/lang/Object;
/*     */     //   210: aload #13
/*     */     //   212: iload_1
/*     */     //   213: putfield Z$0 : Z
/*     */     //   216: aload #13
/*     */     //   218: iconst_1
/*     */     //   219: putfield label : I
/*     */     //   222: invokevirtual getAccessToken : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   225: dup
/*     */     //   226: aload #14
/*     */     //   228: if_acmpne -> 265
/*     */     //   231: aload #14
/*     */     //   233: areturn
/*     */     //   234: aload #13
/*     */     //   236: getfield Z$0 : Z
/*     */     //   239: istore_1
/*     */     //   240: aload #13
/*     */     //   242: getfield L$1 : Ljava/lang/Object;
/*     */     //   245: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */     //   248: astore_3
/*     */     //   249: aload #13
/*     */     //   251: getfield L$0 : Ljava/lang/Object;
/*     */     //   254: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl
/*     */     //   257: astore_0
/*     */     //   258: aload #12
/*     */     //   260: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   263: aload #12
/*     */     //   265: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
/*     */     //   268: astore #4
/*     */     //   270: aload_0
/*     */     //   271: aload #13
/*     */     //   273: aload #13
/*     */     //   275: aload_0
/*     */     //   276: putfield L$0 : Ljava/lang/Object;
/*     */     //   279: aload #13
/*     */     //   281: aload_3
/*     */     //   282: putfield L$1 : Ljava/lang/Object;
/*     */     //   285: aload #13
/*     */     //   287: aload #4
/*     */     //   289: putfield L$2 : Ljava/lang/Object;
/*     */     //   292: aload #13
/*     */     //   294: iload_1
/*     */     //   295: putfield Z$0 : Z
/*     */     //   298: aload #13
/*     */     //   300: iconst_2
/*     */     //   301: putfield label : I
/*     */     //   304: invokespecial hasDirectLLMKeyAccess : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   307: dup
/*     */     //   308: aload #14
/*     */     //   310: if_acmpne -> 357
/*     */     //   313: aload #14
/*     */     //   315: areturn
/*     */     //   316: aload #13
/*     */     //   318: getfield Z$0 : Z
/*     */     //   321: istore_1
/*     */     //   322: aload #13
/*     */     //   324: getfield L$2 : Ljava/lang/Object;
/*     */     //   327: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
/*     */     //   330: astore #4
/*     */     //   332: aload #13
/*     */     //   334: getfield L$1 : Ljava/lang/Object;
/*     */     //   337: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */     //   340: astore_3
/*     */     //   341: aload #13
/*     */     //   343: getfield L$0 : Ljava/lang/Object;
/*     */     //   346: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl
/*     */     //   349: astore_0
/*     */     //   350: aload #12
/*     */     //   352: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   355: aload #12
/*     */     //   357: checkcast java/lang/Boolean
/*     */     //   360: invokevirtual booleanValue : ()Z
/*     */     //   363: istore #5
/*     */     //   365: iload #5
/*     */     //   367: ifne -> 457
/*     */     //   370: aload #4
/*     */     //   372: ifnonnull -> 457
/*     */     //   375: aload_0
/*     */     //   376: getfield _state : Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   379: astore #6
/*     */     //   381: iconst_0
/*     */     //   382: istore #7
/*     */     //   384: nop
/*     */     //   385: aload #6
/*     */     //   387: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   392: astore #8
/*     */     //   394: aload #8
/*     */     //   396: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState
/*     */     //   399: pop
/*     */     //   400: iconst_0
/*     */     //   401: istore #10
/*     */     //   403: new com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$Idle
/*     */     //   406: dup
/*     */     //   407: iload_1
/*     */     //   408: ifeq -> 429
/*     */     //   411: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo
/*     */     //   414: dup
/*     */     //   415: ldc_w 'You are not logged in JB Account'
/*     */     //   418: aconst_null
/*     */     //   419: aconst_null
/*     */     //   420: bipush #6
/*     */     //   422: aconst_null
/*     */     //   423: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   426: goto -> 430
/*     */     //   429: aconst_null
/*     */     //   430: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;)V
/*     */     //   433: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState
/*     */     //   436: astore #9
/*     */     //   438: aload #6
/*     */     //   440: aload #8
/*     */     //   442: aload #9
/*     */     //   444: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   449: ifeq -> 384
/*     */     //   452: nop
/*     */     //   453: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   456: areturn
/*     */     //   457: iload #5
/*     */     //   459: ifne -> 542
/*     */     //   462: aload #4
/*     */     //   464: ifnull -> 612
/*     */     //   467: aload_3
/*     */     //   468: aload #4
/*     */     //   470: aload #13
/*     */     //   472: aload #13
/*     */     //   474: aload_0
/*     */     //   475: putfield L$0 : Ljava/lang/Object;
/*     */     //   478: aload #13
/*     */     //   480: aload_3
/*     */     //   481: putfield L$1 : Ljava/lang/Object;
/*     */     //   484: aload #13
/*     */     //   486: aconst_null
/*     */     //   487: putfield L$2 : Ljava/lang/Object;
/*     */     //   490: aload #13
/*     */     //   492: iconst_3
/*     */     //   493: putfield label : I
/*     */     //   496: invokevirtual checkIngrazzioAccess : (Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   499: dup
/*     */     //   500: aload #14
/*     */     //   502: if_acmpne -> 533
/*     */     //   505: aload #14
/*     */     //   507: areturn
/*     */     //   508: aload #13
/*     */     //   510: getfield L$1 : Ljava/lang/Object;
/*     */     //   513: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */     //   516: astore_3
/*     */     //   517: aload #13
/*     */     //   519: getfield L$0 : Ljava/lang/Object;
/*     */     //   522: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl
/*     */     //   525: astore_0
/*     */     //   526: aload #12
/*     */     //   528: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   531: aload #12
/*     */     //   533: checkcast java/lang/Boolean
/*     */     //   536: invokevirtual booleanValue : ()Z
/*     */     //   539: ifeq -> 612
/*     */     //   542: aload_0
/*     */     //   543: getfield _state : Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   546: astore #6
/*     */     //   548: iconst_0
/*     */     //   549: istore #7
/*     */     //   551: nop
/*     */     //   552: aload #6
/*     */     //   554: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   559: astore #8
/*     */     //   561: aload #8
/*     */     //   563: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState
/*     */     //   566: pop
/*     */     //   567: iconst_0
/*     */     //   568: istore #10
/*     */     //   570: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$LoginSuccessWithLicense.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$LoginSuccessWithLicense;
/*     */     //   573: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState
/*     */     //   576: astore #9
/*     */     //   578: aload #6
/*     */     //   580: aload #8
/*     */     //   582: aload #9
/*     */     //   584: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   589: ifeq -> 551
/*     */     //   592: nop
/*     */     //   593: aload_0
/*     */     //   594: getfield _effect : Lkotlinx/coroutines/channels/Channel;
/*     */     //   597: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenEffect$OpenNewTaskPage.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenEffect$OpenNewTaskPage;
/*     */     //   600: invokeinterface trySend-JP2dKIU : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   605: invokestatic box-impl : (Ljava/lang/Object;)Lkotlinx/coroutines/channels/ChannelResult;
/*     */     //   608: pop
/*     */     //   609: goto -> 675
/*     */     //   612: aload_3
/*     */     //   613: invokevirtual getCurrentJbAUserName : ()Ljava/lang/String;
/*     */     //   616: astore #6
/*     */     //   618: aload_0
/*     */     //   619: getfield _state : Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   622: astore #7
/*     */     //   624: iconst_0
/*     */     //   625: istore #8
/*     */     //   627: nop
/*     */     //   628: aload #7
/*     */     //   630: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   635: astore #9
/*     */     //   637: aload #9
/*     */     //   639: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState
/*     */     //   642: pop
/*     */     //   643: iconst_0
/*     */     //   644: istore #11
/*     */     //   646: new com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$LoginSuccessNoLicense
/*     */     //   649: dup
/*     */     //   650: aload #6
/*     */     //   652: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   655: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState
/*     */     //   658: astore #10
/*     */     //   660: aload #7
/*     */     //   662: aload #9
/*     */     //   664: aload #10
/*     */     //   666: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   671: ifeq -> 627
/*     */     //   674: nop
/*     */     //   675: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   678: areturn
/*     */     //   679: new java/lang/IllegalStateException
/*     */     //   682: dup
/*     */     //   683: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   686: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   689: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #106	-> 62
/*     */     //   #107	-> 105
/*     */     //   #164	-> 108
/*     */     //   #165	-> 112
/*     */     //   #166	-> 127
/*     */     //   #165	-> 190
/*     */     //   #107	-> 191
/*     */     //   #109	-> 195
/*     */     //   #106	-> 231
/*     */     //   #111	-> 270
/*     */     //   #106	-> 313
/*     */     //   #111	-> 357
/*     */     //   #113	-> 365
/*     */     //   #114	-> 375
/*     */     //   #167	-> 384
/*     */     //   #168	-> 385
/*     */     //   #169	-> 394
/*     */     //   #115	-> 403
/*     */     //   #169	-> 436
/*     */     //   #170	-> 438
/*     */     //   #171	-> 452
/*     */     //   #117	-> 453
/*     */     //   #120	-> 457
/*     */     //   #106	-> 505
/*     */     //   #120	-> 533
/*     */     //   #121	-> 542
/*     */     //   #172	-> 551
/*     */     //   #173	-> 552
/*     */     //   #174	-> 561
/*     */     //   #121	-> 570
/*     */     //   #174	-> 576
/*     */     //   #175	-> 578
/*     */     //   #176	-> 592
/*     */     //   #122	-> 593
/*     */     //   #124	-> 612
/*     */     //   #125	-> 618
/*     */     //   #177	-> 627
/*     */     //   #178	-> 628
/*     */     //   #179	-> 637
/*     */     //   #125	-> 646
/*     */     //   #179	-> 658
/*     */     //   #180	-> 660
/*     */     //   #181	-> 674
/*     */     //   #127	-> 675
/*     */     //   #106	-> 679
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	129	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;
/*     */     //   258	58	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;
/*     */     //   350	31	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;
/*     */     //   457	51	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;
/*     */     //   526	50	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;
/*     */     //   576	17	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;
/*     */     //   593	19	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;
/*     */     //   612	12	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;
/*     */     //   105	129	1	showErrorIfNotGranted	Z
/*     */     //   240	76	1	showErrorIfNotGranted	Z
/*     */     //   322	114	1	showErrorIfNotGranted	Z
/*     */     //   436	16	1	showErrorIfNotGranted	Z
/*     */     //   195	39	3	authService	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   249	67	3	authService	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   341	34	3	authService	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   457	51	3	authService	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   517	25	3	authService	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   612	6	3	authService	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   270	46	4	accessToken	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */     //   332	43	4	accessToken	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */     //   457	42	4	accessToken	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */     //   112	79	5	serviceClass$iv	Ljava/lang/Class;
/*     */     //   365	10	5	hasDirectLLMKeyAccess	Z
/*     */     //   457	42	5	hasDirectLLMKeyAccess	Z
/*     */     //   381	72	6	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   548	45	6	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   618	57	6	username	Ljava/lang/String;
/*     */     //   624	51	7	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   394	59	8	prevValue$iv	Ljava/lang/Object;
/*     */     //   561	32	8	prevValue$iv	Ljava/lang/Object;
/*     */     //   438	15	9	nextValue$iv	Ljava/lang/Object;
/*     */     //   578	15	9	nextValue$iv	Ljava/lang/Object;
/*     */     //   637	38	9	prevValue$iv	Ljava/lang/Object;
/*     */     //   660	15	10	nextValue$iv	Ljava/lang/Object;
/*     */     //   108	83	4	$i$f$service	I
/*     */     //   403	33	10	$i$a$-update-StartLoadingViewModelImpl$applyCheckAccess$2	I
/*     */     //   384	69	7	$i$f$update	I
/*     */     //   570	6	10	$i$a$-update-StartLoadingViewModelImpl$applyCheckAccess$3	I
/*     */     //   551	42	7	$i$f$update	I
/*     */     //   646	12	11	$i$a$-update-StartLoadingViewModelImpl$applyCheckAccess$4	I
/*     */     //   627	48	8	$i$f$update	I
/*     */     //   0	690	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   52	627	13	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   59	620	12	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private final Object hasDirectLLMKeyAccess(Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl$hasDirectLLMKeyAccess$1
/*     */     //   4: ifeq -> 41
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl$hasDirectLLMKeyAccess$1
/*     */     //   11: astore #4
/*     */     //   13: aload #4
/*     */     //   15: getfield label : I
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload #4
/*     */     //   27: dup
/*     */     //   28: getfield label : I
/*     */     //   31: ldc_w -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 52
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl$hasDirectLLMKeyAccess$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload_1
/*     */     //   47: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   50: astore #4
/*     */     //   52: aload #4
/*     */     //   54: getfield result : Ljava/lang/Object;
/*     */     //   57: astore_3
/*     */     //   58: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   61: astore #5
/*     */     //   63: aload #4
/*     */     //   65: getfield label : I
/*     */     //   68: tableswitch default -> 213, 0 -> 96, 1 -> 141, 2 -> 196
/*     */     //   96: aload_3
/*     */     //   97: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   100: getstatic com/intellij/ml/llm/matterhorn/llm/ModelParameters.Companion : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion;
/*     */     //   103: ldc_w 'SubmitNewTask'
/*     */     //   106: getstatic com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$Companion;
/*     */     //   109: invokevirtual getInstance : ()Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */     //   112: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   115: aload #4
/*     */     //   117: aload #4
/*     */     //   119: aload_0
/*     */     //   120: putfield L$0 : Ljava/lang/Object;
/*     */     //   123: aload #4
/*     */     //   125: iconst_1
/*     */     //   126: putfield label : I
/*     */     //   129: invokevirtual getDefaultModel : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   132: dup
/*     */     //   133: aload #5
/*     */     //   135: if_acmpne -> 155
/*     */     //   138: aload #5
/*     */     //   140: areturn
/*     */     //   141: aload #4
/*     */     //   143: getfield L$0 : Ljava/lang/Object;
/*     */     //   146: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl
/*     */     //   149: astore_0
/*     */     //   150: aload_3
/*     */     //   151: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   154: aload_3
/*     */     //   155: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */     //   158: astore_2
/*     */     //   159: aload_2
/*     */     //   160: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   163: invokevirtual getProvider : ()Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*     */     //   166: aload_0
/*     */     //   167: getfield propertyProvider : Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   170: aload #4
/*     */     //   172: aload #4
/*     */     //   174: aconst_null
/*     */     //   175: putfield L$0 : Ljava/lang/Object;
/*     */     //   178: aload #4
/*     */     //   180: iconst_2
/*     */     //   181: putfield label : I
/*     */     //   184: invokestatic getKeySafe : (Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   187: dup
/*     */     //   188: aload #5
/*     */     //   190: if_acmpne -> 201
/*     */     //   193: aload #5
/*     */     //   195: areturn
/*     */     //   196: aload_3
/*     */     //   197: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   200: aload_3
/*     */     //   201: ifnull -> 208
/*     */     //   204: iconst_1
/*     */     //   205: goto -> 209
/*     */     //   208: iconst_0
/*     */     //   209: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   212: areturn
/*     */     //   213: new java/lang/IllegalStateException
/*     */     //   216: dup
/*     */     //   217: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   220: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   223: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #129	-> 61
/*     */     //   #130	-> 100
/*     */     //   #129	-> 138
/*     */     //   #131	-> 159
/*     */     //   #129	-> 193
/*     */     //   #131	-> 201
/*     */     //   #129	-> 213
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   100	41	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;
/*     */     //   150	37	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;
/*     */     //   159	28	2	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   0	224	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   52	161	4	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   58	155	3	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public void userAskForHelp() {
/*     */     BuildersKt.launch$default(getScope(), null, null, new StartLoadingViewModelImpl$userAskForHelp$1(null), 3, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "StartLoadingViewModelImpl.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.StartLoadingViewModelImpl$userAskForHelp$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nStartLoadingViewModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartLoadingViewModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl$userAskForHelp$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,150:1\n226#2,5:151\n*S KotlinDebug\n*F\n+ 1 StartLoadingViewModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl$userAskForHelp$1\n*L\n139#1:151,5\n*E\n"})
/*     */   static final class StartLoadingViewModelImpl$userAskForHelp$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     StartLoadingViewModelImpl$userAskForHelp$1(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       MutableStateFlow mutableStateFlow;
/*     */       StartLoadingViewModelImpl startLoadingViewModelImpl;
/*     */       int $i$f$update;
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           StartLoadingViewModelImpl.this.checkAccessJob;
/*     */           if (!((StartLoadingViewModelImpl.this.checkAccessJob != null) ? ((StartLoadingViewModelImpl.this.checkAccessJob.isActive() == true) ? 1 : 0) : 0))
/*     */             StartLoadingViewModelImpl.this.startLoginAction(false); 
/*     */           mutableStateFlow = StartLoadingViewModelImpl.this._state;
/*     */           startLoadingViewModelImpl = StartLoadingViewModelImpl.this;
/*     */           $i$f$update = 0;
/*     */           while (true) {
/*     */             Object prevValue$iv = mutableStateFlow.getValue();
/*     */             (LoginScreenState)prevValue$iv;
/*     */             int $i$a$-update-StartLoadingViewModelImpl$userAskForHelp$1$1 = 0;
/*     */             Object nextValue$iv = new LoginScreenState.NeedHelp(startLoadingViewModelImpl.authLinkFlow, startLoadingViewModelImpl::invokeSuspend$lambda$1$lambda$0);
/*     */             if (mutableStateFlow.compareAndSet(prevValue$iv, nextValue$iv))
/*     */               return Unit.INSTANCE; 
/*     */           } 
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super StartLoadingViewModelImpl$userAskForHelp$1> $completion) {
/*     */       return (Continuation<Unit>)new StartLoadingViewModelImpl$userAskForHelp$1($completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((StartLoadingViewModelImpl$userAskForHelp$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     private static final Unit invokeSuspend$lambda$1$lambda$0(StartLoadingViewModelImpl this$0) {
/*     */       BuildersKt.launch$default(StartLoadingViewModelImpl.this.getScope(), null, null, new StartLoadingViewModelImpl$userAskForHelp$1$1$1$1(null), 3, null);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\StartLoadingViewModelImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */