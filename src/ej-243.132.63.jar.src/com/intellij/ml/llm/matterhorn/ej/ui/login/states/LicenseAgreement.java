/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login.states;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\013\n\002\020\016\n\002\b\005\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\n\b\007\030\0002\0020\001:\002+,B-\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\f\020\b\032\b\022\004\022\0020\n0\t¢\006\004\b\013\020\fJ\006\020&\032\0020\nJ\006\020'\032\0020\nJ\006\020(\032\0020\nJ\016\020)\032\0020\n2\006\020*\032\0020\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\021\020\022R\027\020\b\032\b\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\023\020\024R\021\020\025\032\0020\026¢\006\b\n\000\032\004\b\027\020\030R\021\020\031\032\0020\026¢\006\b\n\000\032\004\b\032\020\030R\024\020\033\032\b\022\004\022\0020\0350\034X\004¢\006\002\n\000R\027\020\036\032\b\022\004\022\0020\0350\037¢\006\b\n\000\032\004\b \020!R\024\020\"\032\b\022\004\022\0020#0\034X\004¢\006\002\n\000R\027\020$\032\b\022\004\022\0020#0\037¢\006\b\n\000\032\004\b%\020!¨\006-"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "kind", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreementKind;", "agreement", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;", "onLocalAccept", "Lkotlin/Function0;", "", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreementKind;Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;Lkotlin/jvm/functions/Function0;)V", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "getKind", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreementKind;", "getAgreement", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;", "getOnLocalAccept", "()Lkotlin/jvm/functions/Function0;", "termsOfServiceUrl", "", "getTermsOfServiceUrl", "()Ljava/lang/String;", "acceptableUsePolicyUrl", "getAcceptableUsePolicyUrl", "_urlLoadState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase;", "urlLoadState", "Lkotlinx/coroutines/flow/StateFlow;", "getUrlLoadState", "()Lkotlinx/coroutines/flow/StateFlow;", "_acceptState", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState;", "acceptState", "getAcceptState", "loadUrlToAcceptInBrowser", "acceptLocal", "openLicenseUrl", "openUrl", "url", "UrlLoadPhase", "AcceptState", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nLicenseAgreement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LicenseAgreement.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,71:1\n226#2,5:72\n226#2,5:77\n*S KotlinDebug\n*F\n+ 1 LicenseAgreement.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement\n*L\n35#1:72,5\n49#1:77,5\n*E\n"})
/*    */ public final class LicenseAgreement implements GrazieActivationState { @NotNull
/*    */   private final CoroutineScope scope; @NotNull
/*    */   private final LicenseAgreementKind kind; @NotNull
/*    */   private final AipLicenseAgreement agreement; @NotNull
/*    */   private final Function0<Unit> onLocalAccept; @NotNull
/*    */   private final String termsOfServiceUrl; @NotNull
/*    */   private final String acceptableUsePolicyUrl; @NotNull
/*    */   private final MutableStateFlow<UrlLoadPhase> _urlLoadState; @NotNull
/*    */   private final StateFlow<UrlLoadPhase> urlLoadState; @NotNull
/*    */   private final MutableStateFlow<AcceptState> _acceptState; @NotNull
/*    */   private final StateFlow<AcceptState> acceptState; public static final int $stable = 8;
/* 15 */   public LicenseAgreement(@NotNull CoroutineScope scope, @NotNull LicenseAgreementKind kind, @NotNull AipLicenseAgreement agreement, @NotNull Function0<Unit> onLocalAccept) { this.scope = scope;
/* 16 */     this.kind = kind;
/* 17 */     this.agreement = agreement;
/* 18 */     this.onLocalAccept = onLocalAccept;
/*    */ 
/*    */     
/* 21 */     this.termsOfServiceUrl = this.agreement.getDocumentUrl-VLHUAj8();
/* 22 */     this.acceptableUsePolicyUrl = this.agreement.getAcceptableUsePolicyUrl-VLHUAj8();
/*    */     
/* 24 */     this._urlLoadState = StateFlowKt.MutableStateFlow(UrlLoadPhase.Progress.INSTANCE);
/* 25 */     this.urlLoadState = (StateFlow<UrlLoadPhase>)this._urlLoadState;
/*    */     
/* 27 */     this._acceptState = StateFlowKt.MutableStateFlow(AcceptState.NotAccepted.INSTANCE);
/* 28 */     this.acceptState = (StateFlow<AcceptState>)this._acceptState;
/*    */ 
/*    */     
/* 31 */     loadUrlToAcceptInBrowser(); }
/*    */   @NotNull public final CoroutineScope getScope() { return this.scope; }
/*    */   @NotNull public final LicenseAgreementKind getKind() { return this.kind; }
/*    */   @NotNull public final AipLicenseAgreement getAgreement() { return this.agreement; }
/* 35 */   @NotNull public final Function0<Unit> getOnLocalAccept() { return this.onLocalAccept; } public final void loadUrlToAcceptInBrowser() { MutableStateFlow<UrlLoadPhase> $this$update$iv = this._urlLoadState; int $i$f$update = 0;
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
/*    */     while (true)
/* 73 */     { Object prevValue$iv = $this$update$iv.getValue();
/* 74 */       UrlLoadPhase it = (UrlLoadPhase)prevValue$iv; int $i$a$-update-LicenseAgreement$loadUrlToAcceptInBrowser$1 = 0; Object nextValue$iv = UrlLoadPhase.Progress.INSTANCE;
/* 75 */       if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv)) BuildersKt.launch$default(this.scope, null, null, new LicenseAgreement$loadUrlToAcceptInBrowser$2(null), 3, null);  }  }
/*    */   @NotNull public final String getTermsOfServiceUrl() { return this.termsOfServiceUrl; }
/*    */   @NotNull public final String getAcceptableUsePolicyUrl() { return this.acceptableUsePolicyUrl; } @NotNull public final StateFlow<UrlLoadPhase> getUrlLoadState() { return this.urlLoadState; } @NotNull public final StateFlow<AcceptState> getAcceptState() { return this.acceptState; } @DebugMetadata(f = "LicenseAgreement.kt", l = {38, 38}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.states.LicenseAgreement$loadUrlToAcceptInBrowser$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) @SourceDebugExtension({"SMAP\nLicenseAgreement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LicenseAgreement.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$loadUrlToAcceptInBrowser$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,71:1\n226#2,5:72\n226#2,5:77\n*S KotlinDebug\n*F\n+ 1 LicenseAgreement.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$loadUrlToAcceptInBrowser$2\n*L\n39#1:72,5\n43#1:77,5\n*E\n"}) static final class LicenseAgreement$loadUrlToAcceptInBrowser$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label; LicenseAgreement$loadUrlToAcceptInBrowser$2(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore #8
/*    */       //   5: aload_0
/*    */       //   6: getfield label : I
/*    */       //   9: tableswitch default -> 237, 0 -> 36, 1 -> 65, 2 -> 97
/*    */       //   36: aload_1
/*    */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   40: nop
/*    */       //   41: getstatic com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepository.Companion : Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepository$Companion;
/*    */       //   44: aload_0
/*    */       //   45: checkcast kotlin/coroutines/Continuation
/*    */       //   48: aload_0
/*    */       //   49: iconst_1
/*    */       //   50: putfield label : I
/*    */       //   53: invokevirtual instance : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   56: dup
/*    */       //   57: aload #8
/*    */       //   59: if_acmpne -> 71
/*    */       //   62: aload #8
/*    */       //   64: areturn
/*    */       //   65: nop
/*    */       //   66: aload_1
/*    */       //   67: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   70: aload_1
/*    */       //   71: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepository
/*    */       //   74: aload_0
/*    */       //   75: checkcast kotlin/coroutines/Continuation
/*    */       //   78: aload_0
/*    */       //   79: iconst_2
/*    */       //   80: putfield label : I
/*    */       //   83: invokeinterface getManageAccountUrl : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   88: dup
/*    */       //   89: aload #8
/*    */       //   91: if_acmpne -> 103
/*    */       //   94: aload #8
/*    */       //   96: areturn
/*    */       //   97: nop
/*    */       //   98: aload_1
/*    */       //   99: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   102: aload_1
/*    */       //   103: checkcast java/lang/String
/*    */       //   106: astore_2
/*    */       //   107: aload_0
/*    */       //   108: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement;
/*    */       //   111: invokestatic access$get_urlLoadState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*    */       //   114: astore_3
/*    */       //   115: iconst_0
/*    */       //   116: istore #4
/*    */       //   118: nop
/*    */       //   119: aload_3
/*    */       //   120: invokeinterface getValue : ()Ljava/lang/Object;
/*    */       //   125: astore #5
/*    */       //   127: aload #5
/*    */       //   129: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase
/*    */       //   132: pop
/*    */       //   133: iconst_0
/*    */       //   134: istore #7
/*    */       //   136: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Completed
/*    */       //   139: dup
/*    */       //   140: aload_2
/*    */       //   141: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   144: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase
/*    */       //   147: astore #6
/*    */       //   149: aload_3
/*    */       //   150: aload #5
/*    */       //   152: aload #6
/*    */       //   154: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */       //   159: ifeq -> 118
/*    */       //   162: nop
/*    */       //   163: goto -> 233
/*    */       //   166: astore_2
/*    */       //   167: aload_0
/*    */       //   168: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement;
/*    */       //   171: invokestatic access$get_urlLoadState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*    */       //   174: astore_3
/*    */       //   175: iconst_0
/*    */       //   176: istore #4
/*    */       //   178: nop
/*    */       //   179: aload_3
/*    */       //   180: invokeinterface getValue : ()Ljava/lang/Object;
/*    */       //   185: astore #5
/*    */       //   187: aload #5
/*    */       //   189: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase
/*    */       //   192: pop
/*    */       //   193: iconst_0
/*    */       //   194: istore #7
/*    */       //   196: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Error
/*    */       //   199: dup
/*    */       //   200: aload_2
/*    */       //   201: invokevirtual getMessage : ()Ljava/lang/String;
/*    */       //   204: dup
/*    */       //   205: ifnonnull -> 211
/*    */       //   208: pop
/*    */       //   209: ldc 'Unknown error'
/*    */       //   211: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   214: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase
/*    */       //   217: astore #6
/*    */       //   219: aload_3
/*    */       //   220: aload #5
/*    */       //   222: aload #6
/*    */       //   224: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */       //   229: ifeq -> 178
/*    */       //   232: nop
/*    */       //   233: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   236: areturn
/*    */       //   237: new java/lang/IllegalStateException
/*    */       //   240: dup
/*    */       //   241: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   243: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   246: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #36	-> 3
/*    */       //   #37	-> 40
/*    */       //   #38	-> 41
/*    */       //   #36	-> 62
/*    */       //   #38	-> 71
/*    */       //   #36	-> 94
/*    */       //   #39	-> 107
/*    */       //   #72	-> 118
/*    */       //   #73	-> 119
/*    */       //   #74	-> 127
/*    */       //   #40	-> 136
/*    */       //   #74	-> 147
/*    */       //   #75	-> 149
/*    */       //   #76	-> 162
/*    */       //   #42	-> 166
/*    */       //   #43	-> 167
/*    */       //   #77	-> 178
/*    */       //   #78	-> 179
/*    */       //   #79	-> 187
/*    */       //   #43	-> 196
/*    */       //   #79	-> 217
/*    */       //   #80	-> 219
/*    */       //   #81	-> 232
/*    */       //   #45	-> 233
/*    */       //   #36	-> 237
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   107	56	2	accountUrl	Ljava/lang/String;
/*    */       //   167	66	2	th	Ljava/lang/Throwable;
/*    */       //   115	48	3	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*    */       //   175	58	3	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*    */       //   127	36	5	prevValue$iv	Ljava/lang/Object;
/*    */       //   187	46	5	prevValue$iv	Ljava/lang/Object;
/*    */       //   149	14	6	nextValue$iv	Ljava/lang/Object;
/*    */       //   219	14	6	nextValue$iv	Ljava/lang/Object;
/*    */       //   136	11	7	$i$a$-update-LicenseAgreement$loadUrlToAcceptInBrowser$2$1	I
/*    */       //   118	45	4	$i$f$update	I
/*    */       //   196	21	7	$i$a$-update-LicenseAgreement$loadUrlToAcceptInBrowser$2$2	I
/*    */       //   178	55	4	$i$f$update	I
/*    */       //   0	247	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$loadUrlToAcceptInBrowser$2;
/*    */       //   40	197	1	$result	Ljava/lang/Object;
/*    */       // Exception table:
/*    */       //   from	to	target	type
/*    */       //   40	56	166	java/lang/Throwable
/*    */       //   65	88	166	java/lang/Throwable
/* 78 */       //   97	163	166	java/lang/Throwable } public final Continuation<Unit> create(Object value, Continuation<? super LicenseAgreement$loadUrlToAcceptInBrowser$2> $completion) { return (Continuation<Unit>)new LicenseAgreement$loadUrlToAcceptInBrowser$2($completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((LicenseAgreement$loadUrlToAcceptInBrowser$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } public final void acceptLocal() { MutableStateFlow<AcceptState> $this$update$iv = this._acceptState; int $i$f$update = 0; while (true) { Object prevValue$iv = $this$update$iv.getValue();
/* 79 */       AcceptState it = (AcceptState)prevValue$iv; int $i$a$-update-LicenseAgreement$acceptLocal$1 = 0; Object nextValue$iv = AcceptState.InProgress.INSTANCE;
/* 80 */       if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv))
/*    */         this.onLocalAccept.invoke();  }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void openLicenseUrl() {
/*    */     BrowserUtil.browse(this.acceptableUsePolicyUrl);
/*    */   }
/*    */   
/*    */   public final void openUrl(@NotNull String url) {
/*    */     Intrinsics.checkNotNullParameter(url, "url");
/*    */     BrowserUtil.browse(url);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\003\004\005\006B\t\b\004¢\006\004\b\002\020\003\001\003\007\b\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase;", "", "<init>", "()V", "Progress", "Completed", "Error", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Completed;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Progress;", "ej-ui"})
/*    */   @StabilityInferred(parameters = 1)
/*    */   public static abstract class UrlLoadPhase {
/*    */     public static final int $stable;
/*    */     
/*    */     private UrlLoadPhase() {}
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Progress;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase;", "<init>", "()V", "ej-ui"})
/*    */     @StabilityInferred(parameters = 1)
/*    */     public static final class Progress extends UrlLoadPhase {
/*    */       @NotNull
/*    */       public static final Progress INSTANCE = new Progress();
/*    */       public static final int $stable;
/*    */       
/*    */       private Progress() {
/*    */         super(null);
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Completed;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "ej-ui"})
/*    */     @StabilityInferred(parameters = 1)
/*    */     public static final class Completed extends UrlLoadPhase {
/*    */       @NotNull
/*    */       private final String url;
/*    */       public static final int $stable;
/*    */       
/*    */       public Completed(@NotNull String url) {
/*    */         super(null);
/*    */         this.url = url;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final String getUrl() {
/*    */         return this.url;
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "ej-ui"})
/*    */     @StabilityInferred(parameters = 1)
/*    */     public static final class Error extends UrlLoadPhase {
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
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Progress;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase;", "<init>", "()V", "ej-ui"})
/*    */   @StabilityInferred(parameters = 1)
/*    */   public static final class Progress extends UrlLoadPhase {
/*    */     @NotNull
/*    */     public static final Progress INSTANCE = new Progress();
/*    */     public static final int $stable;
/*    */     
/*    */     private Progress() {
/*    */       super(null);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\002\004\005B\t\b\004¢\006\004\b\002\020\003\001\002\006\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState;", "", "<init>", "()V", "NotAccepted", "InProgress", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState$InProgress;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState$NotAccepted;", "ej-ui"})
/*    */   @StabilityInferred(parameters = 1)
/*    */   public static abstract class AcceptState {
/*    */     public static final int $stable;
/*    */     
/*    */     private AcceptState() {}
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState$NotAccepted;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState;", "<init>", "()V", "ej-ui"})
/*    */     @StabilityInferred(parameters = 1)
/*    */     public static final class NotAccepted extends AcceptState {
/*    */       @NotNull
/*    */       public static final NotAccepted INSTANCE = new NotAccepted();
/*    */       public static final int $stable;
/*    */       
/*    */       private NotAccepted() {
/*    */         super(null);
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState$InProgress;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState;", "<init>", "()V", "ej-ui"})
/*    */     @StabilityInferred(parameters = 1)
/*    */     public static final class InProgress extends AcceptState {
/*    */       @NotNull
/*    */       public static final InProgress INSTANCE = new InProgress();
/*    */       public static final int $stable;
/*    */       
/*    */       private InProgress() {
/*    */         super(null);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState$NotAccepted;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState;", "<init>", "()V", "ej-ui"})
/*    */   @StabilityInferred(parameters = 1)
/*    */   public static final class NotAccepted extends AcceptState {
/*    */     @NotNull
/*    */     public static final NotAccepted INSTANCE = new NotAccepted();
/*    */     public static final int $stable;
/*    */     
/*    */     private NotAccepted() {
/*    */       super(null);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState$InProgress;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState;", "<init>", "()V", "ej-ui"})
/*    */   @StabilityInferred(parameters = 1)
/*    */   public static final class InProgress extends AcceptState {
/*    */     @NotNull
/*    */     public static final InProgress INSTANCE = new InProgress();
/*    */     public static final int $stable;
/*    */     
/*    */     private InProgress() {
/*    */       super(null);
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\states\LicenseAgreement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */