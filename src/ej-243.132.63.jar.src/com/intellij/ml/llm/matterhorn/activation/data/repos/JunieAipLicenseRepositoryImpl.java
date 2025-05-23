/*     */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseProductType;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseResult;
/*     */ import com.intellij.ui.JBAccountInfoService;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\007\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\016\020\b\032\0020\tH@¢\006\002\020\nJ\016\020\013\032\0020\tH@¢\006\002\020\nJ\016\020\f\032\0020\tH@¢\006\002\020\nJ\016\020\r\032\0020\tH@¢\006\002\020\nJ\016\020\016\032\0020\tH@¢\006\002\020\nJ\016\020\017\032\0020\tH@¢\006\002\020\nJ\020\020\020\032\004\030\0010\021H@¢\006\002\020\nJ\026\020\022\032\0020\t2\006\020\023\032\0020\tH@¢\006\002\020\024J\026\020\025\032\0020\0262\006\020\027\032\0020\030H@¢\006\002\020\031J\026\020\032\032\0020\0262\006\020\027\032\0020\030H@¢\006\002\020\031J\030\020\033\032\0020\0342\006\020\027\032\0020\0302\006\020\035\032\0020\036H\002R\024\020\004\032\0020\0058BX\004¢\006\006\032\004\b\006\020\007¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepository;", "<init>", "()V", "jbaInfoService", "Lcom/intellij/ui/JBAccountInfoService;", "getJbaInfoService", "()Lcom/intellij/ui/JBAccountInfoService;", "getPurchaseAipUrl", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentMethodsUrl", "getManageAccountUrl", "getLicenseUrl", "getRegisterAccountUrl", "getLicensePurchaseUrl", "loadJbaServiceConfiguration", "Lcom/intellij/ui/JBAccountInfoService$JbaServiceConfiguration;", "regionalUrl", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActiveLicenses", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;", "productType", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "issueTrialLicense", "logLicenseListResult", "", "result", "Lcom/intellij/ui/JBAccountInfoService$LicenseListResult;", "data.repos"})
/*     */ @SourceDebugExtension({"SMAP\nJunieAipLicenseRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieAipLicenseRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
/*     */ final class JunieAipLicenseRepositoryImpl
/*     */   implements JunieAipLicenseRepository
/*     */ {
/*     */   private final JBAccountInfoService getJbaInfoService() {
/*  50 */     if (JBAccountInfoService.getInstance() == null) { JBAccountInfoService.getInstance();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 209 */       int $i$a$-checkNotNull-JunieAipLicenseRepositoryImpl$jbaInfoService$1 = 0;
/*     */       String str = "JBAccountInfoService is unavailable";
/*     */       throw new IllegalStateException(str.toString()); }
/*     */     
/*     */     return JBAccountInfoService.getInstance();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getPurchaseAipUrl(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$getPurchaseAipUrl$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$getPurchaseAipUrl$1
/*     */     //   11: astore #4
/*     */     //   13: aload #4
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #4
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$getPurchaseAipUrl$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #4
/*     */     //   50: aload #4
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore_3
/*     */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   59: astore #5
/*     */     //   61: aload #4
/*     */     //   63: getfield label : I
/*     */     //   66: tableswitch default -> 138, 0 -> 88, 1 -> 115
/*     */     //   88: aload_3
/*     */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   92: aload_0
/*     */     //   93: ldc 'https://jb.gg/ai-pricing'
/*     */     //   95: aload #4
/*     */     //   97: aload #4
/*     */     //   99: iconst_1
/*     */     //   100: putfield label : I
/*     */     //   103: invokespecial regionalUrl : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   106: dup
/*     */     //   107: aload #5
/*     */     //   109: if_acmpne -> 120
/*     */     //   112: aload #5
/*     */     //   114: areturn
/*     */     //   115: aload_3
/*     */     //   116: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   119: aload_3
/*     */     //   120: checkcast java/lang/String
/*     */     //   123: astore_2
/*     */     //   124: invokestatic getInstance : ()Lcom/intellij/openapi/application/IdeUrlTrackingParametersProvider;
/*     */     //   127: aload_2
/*     */     //   128: invokevirtual augmentUrl : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   131: dup
/*     */     //   132: ldc 'augmentUrl(...)'
/*     */     //   134: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   137: areturn
/*     */     //   138: new java/lang/IllegalStateException
/*     */     //   141: dup
/*     */     //   142: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   144: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   147: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #52	-> 59
/*     */     //   #54	-> 92
/*     */     //   #52	-> 112
/*     */     //   #55	-> 124
/*     */     //   #52	-> 138
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   92	14	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;
/*     */     //   124	14	2	regionalLandingUrl	Ljava/lang/String;
/*     */     //   0	148	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	88	4	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   56	82	3	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getPaymentMethodsUrl(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$getPaymentMethodsUrl$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$getPaymentMethodsUrl$1
/*     */     //   11: astore #10
/*     */     //   13: aload #10
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #10
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$getPaymentMethodsUrl$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #10
/*     */     //   50: aload #10
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #9
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #11
/*     */     //   62: aload #10
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 265, 0 -> 92, 1 -> 124, 2 -> 207
/*     */     //   92: aload #9
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: aload #10
/*     */     //   100: aload #10
/*     */     //   102: aload_0
/*     */     //   103: putfield L$0 : Ljava/lang/Object;
/*     */     //   106: aload #10
/*     */     //   108: iconst_1
/*     */     //   109: putfield label : I
/*     */     //   112: invokespecial loadJbaServiceConfiguration : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   115: dup
/*     */     //   116: aload #11
/*     */     //   118: if_acmpne -> 140
/*     */     //   121: aload #11
/*     */     //   123: areturn
/*     */     //   124: aload #10
/*     */     //   126: getfield L$0 : Ljava/lang/Object;
/*     */     //   129: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl
/*     */     //   132: astore_0
/*     */     //   133: aload #9
/*     */     //   135: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   138: aload #9
/*     */     //   140: checkcast com/intellij/ui/JBAccountInfoService$JbaServiceConfiguration
/*     */     //   143: astore_2
/*     */     //   144: aload_2
/*     */     //   145: dup
/*     */     //   146: ifnull -> 156
/*     */     //   149: invokevirtual paymentMethodsUrl : ()Ljava/lang/String;
/*     */     //   152: dup
/*     */     //   153: ifnonnull -> 264
/*     */     //   156: pop
/*     */     //   157: aload_0
/*     */     //   158: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl
/*     */     //   161: astore_3
/*     */     //   162: iconst_0
/*     */     //   163: istore #4
/*     */     //   165: aload_2
/*     */     //   166: dup
/*     */     //   167: ifnull -> 177
/*     */     //   170: invokevirtual accountUrl : ()Ljava/lang/String;
/*     */     //   173: dup
/*     */     //   174: ifnonnull -> 220
/*     */     //   177: pop
/*     */     //   178: aload_3
/*     */     //   179: ldc 'https://account.jetbrains.com/'
/*     */     //   181: aload #10
/*     */     //   183: aload #10
/*     */     //   185: aconst_null
/*     */     //   186: putfield L$0 : Ljava/lang/Object;
/*     */     //   189: aload #10
/*     */     //   191: iconst_2
/*     */     //   192: putfield label : I
/*     */     //   195: invokespecial regionalUrl : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   198: dup
/*     */     //   199: aload #11
/*     */     //   201: if_acmpne -> 217
/*     */     //   204: aload #11
/*     */     //   206: areturn
/*     */     //   207: iconst_0
/*     */     //   208: istore #4
/*     */     //   210: aload #9
/*     */     //   212: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   215: aload #9
/*     */     //   217: checkcast java/lang/String
/*     */     //   220: astore #6
/*     */     //   222: aload #6
/*     */     //   224: ldc '/'
/*     */     //   226: checkcast java/lang/CharSequence
/*     */     //   229: invokestatic removeSuffix : (Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   232: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   237: astore #5
/*     */     //   239: aload #5
/*     */     //   241: astore #7
/*     */     //   243: iconst_0
/*     */     //   244: istore #8
/*     */     //   246: invokestatic access$getLOG$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   249: aload #7
/*     */     //   251: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   256: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   259: nop
/*     */     //   260: aload #5
/*     */     //   262: nop
/*     */     //   263: nop
/*     */     //   264: areturn
/*     */     //   265: new java/lang/IllegalStateException
/*     */     //   268: dup
/*     */     //   269: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   271: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   274: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #58	-> 60
/*     */     //   #59	-> 97
/*     */     //   #58	-> 121
/*     */     //   #60	-> 144
/*     */     //   #61	-> 165
/*     */     //   #58	-> 204
/*     */     //   #62	-> 222
/*     */     //   #63	-> 246
/*     */     //   #64	-> 259
/*     */     //   #62	-> 260
/*     */     //   #64	-> 262
/*     */     //   #60	-> 263
/*     */     //   #60	-> 264
/*     */     //   #58	-> 265
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	27	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;
/*     */     //   133	23	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;
/*     */     //   156	2	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;
/*     */     //   144	12	2	jbaServiceConfiguration	Lcom/intellij/ui/JBAccountInfoService$JbaServiceConfiguration;
/*     */     //   156	17	2	jbaServiceConfiguration	Lcom/intellij/ui/JBAccountInfoService$JbaServiceConfiguration;
/*     */     //   162	15	3	$this$getPaymentMethodsUrl_u24lambda_u242	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;
/*     */     //   177	21	3	$this$getPaymentMethodsUrl_u24lambda_u242	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;
/*     */     //   222	41	6	accountUrl	Ljava/lang/String;
/*     */     //   243	17	7	url	Ljava/lang/String;
/*     */     //   246	14	8	$i$a$-also-JunieAipLicenseRepositoryImpl$getPaymentMethodsUrl$2$1	I
/*     */     //   165	42	4	$i$a$-run-JunieAipLicenseRepositoryImpl$getPaymentMethodsUrl$2	I
/*     */     //   0	275	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	215	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	208	9	$result	Ljava/lang/Object;
/*     */     //   210	53	4	$i$a$-run-JunieAipLicenseRepositoryImpl$getPaymentMethodsUrl$2	I
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getManageAccountUrl(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$getManageAccountUrl$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$getManageAccountUrl$1
/*     */     //   11: astore #6
/*     */     //   13: aload #6
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #6
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$getManageAccountUrl$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #6
/*     */     //   50: aload #6
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #6
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 218, 0 -> 92, 1 -> 124, 2 -> 184
/*     */     //   92: aload #5
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: aload #6
/*     */     //   100: aload #6
/*     */     //   102: aload_0
/*     */     //   103: putfield L$0 : Ljava/lang/Object;
/*     */     //   106: aload #6
/*     */     //   108: iconst_1
/*     */     //   109: putfield label : I
/*     */     //   112: invokespecial loadJbaServiceConfiguration : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   115: dup
/*     */     //   116: aload #7
/*     */     //   118: if_acmpne -> 140
/*     */     //   121: aload #7
/*     */     //   123: areturn
/*     */     //   124: aload #6
/*     */     //   126: getfield L$0 : Ljava/lang/Object;
/*     */     //   129: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl
/*     */     //   132: astore_0
/*     */     //   133: aload #5
/*     */     //   135: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   138: aload #5
/*     */     //   140: checkcast com/intellij/ui/JBAccountInfoService$JbaServiceConfiguration
/*     */     //   143: dup
/*     */     //   144: ifnull -> 154
/*     */     //   147: invokevirtual accountUrl : ()Ljava/lang/String;
/*     */     //   150: dup
/*     */     //   151: ifnonnull -> 217
/*     */     //   154: pop
/*     */     //   155: aload_0
/*     */     //   156: ldc 'https://account.jetbrains.com/'
/*     */     //   158: aload #6
/*     */     //   160: aload #6
/*     */     //   162: aconst_null
/*     */     //   163: putfield L$0 : Ljava/lang/Object;
/*     */     //   166: aload #6
/*     */     //   168: iconst_2
/*     */     //   169: putfield label : I
/*     */     //   172: invokespecial regionalUrl : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   175: dup
/*     */     //   176: aload #7
/*     */     //   178: if_acmpne -> 191
/*     */     //   181: aload #7
/*     */     //   183: areturn
/*     */     //   184: aload #5
/*     */     //   186: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   189: aload #5
/*     */     //   191: astore_2
/*     */     //   192: aload_2
/*     */     //   193: checkcast java/lang/String
/*     */     //   196: astore_3
/*     */     //   197: iconst_0
/*     */     //   198: istore #4
/*     */     //   200: invokestatic access$getLOG$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   203: aload_3
/*     */     //   204: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   209: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   212: nop
/*     */     //   213: aload_2
/*     */     //   214: checkcast java/lang/String
/*     */     //   217: areturn
/*     */     //   218: new java/lang/IllegalStateException
/*     */     //   221: dup
/*     */     //   222: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   224: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   227: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #68	-> 60
/*     */     //   #69	-> 97
/*     */     //   #68	-> 121
/*     */     //   #69	-> 140
/*     */     //   #68	-> 181
/*     */     //   #70	-> 200
/*     */     //   #71	-> 212
/*     */     //   #69	-> 213
/*     */     //   #69	-> 217
/*     */     //   #68	-> 218
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	27	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;
/*     */     //   133	21	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;
/*     */     //   154	21	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;
/*     */     //   197	16	3	url	Ljava/lang/String;
/*     */     //   200	13	4	$i$a$-also-JunieAipLicenseRepositoryImpl$getManageAccountUrl$2	I
/*     */     //   0	228	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	168	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	161	5	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getLicenseUrl(@NotNull Continuation<? super String> $completion) {
/*     */     JunieAipLicenseRepositoryKt.access$getLOG$p().warn("Using the default URL for jetbrains ai service license: https://www.jetbrains.com/legal/docs/terms/jetbrains-ai-service/");
/*     */     return regionalUrl("https://www.jetbrains.com/legal/docs/terms/jetbrains-ai-service/", $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getRegisterAccountUrl(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$getRegisterAccountUrl$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$getRegisterAccountUrl$1
/*     */     //   11: astore #6
/*     */     //   13: aload #6
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #6
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$getRegisterAccountUrl$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #6
/*     */     //   50: aload #6
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #6
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 218, 0 -> 92, 1 -> 124, 2 -> 184
/*     */     //   92: aload #5
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: aload #6
/*     */     //   100: aload #6
/*     */     //   102: aload_0
/*     */     //   103: putfield L$0 : Ljava/lang/Object;
/*     */     //   106: aload #6
/*     */     //   108: iconst_1
/*     */     //   109: putfield label : I
/*     */     //   112: invokespecial loadJbaServiceConfiguration : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   115: dup
/*     */     //   116: aload #7
/*     */     //   118: if_acmpne -> 140
/*     */     //   121: aload #7
/*     */     //   123: areturn
/*     */     //   124: aload #6
/*     */     //   126: getfield L$0 : Ljava/lang/Object;
/*     */     //   129: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl
/*     */     //   132: astore_0
/*     */     //   133: aload #5
/*     */     //   135: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   138: aload #5
/*     */     //   140: checkcast com/intellij/ui/JBAccountInfoService$JbaServiceConfiguration
/*     */     //   143: dup
/*     */     //   144: ifnull -> 154
/*     */     //   147: invokevirtual signupUrl : ()Ljava/lang/String;
/*     */     //   150: dup
/*     */     //   151: ifnonnull -> 217
/*     */     //   154: pop
/*     */     //   155: aload_0
/*     */     //   156: ldc 'https://account.jetbrains.com/signup'
/*     */     //   158: aload #6
/*     */     //   160: aload #6
/*     */     //   162: aconst_null
/*     */     //   163: putfield L$0 : Ljava/lang/Object;
/*     */     //   166: aload #6
/*     */     //   168: iconst_2
/*     */     //   169: putfield label : I
/*     */     //   172: invokespecial regionalUrl : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   175: dup
/*     */     //   176: aload #7
/*     */     //   178: if_acmpne -> 191
/*     */     //   181: aload #7
/*     */     //   183: areturn
/*     */     //   184: aload #5
/*     */     //   186: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   189: aload #5
/*     */     //   191: astore_2
/*     */     //   192: aload_2
/*     */     //   193: checkcast java/lang/String
/*     */     //   196: astore_3
/*     */     //   197: iconst_0
/*     */     //   198: istore #4
/*     */     //   200: invokestatic access$getLOG$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   203: aload_3
/*     */     //   204: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   209: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   212: nop
/*     */     //   213: aload_2
/*     */     //   214: checkcast java/lang/String
/*     */     //   217: areturn
/*     */     //   218: new java/lang/IllegalStateException
/*     */     //   221: dup
/*     */     //   222: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   224: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   227: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #79	-> 60
/*     */     //   #80	-> 97
/*     */     //   #79	-> 121
/*     */     //   #80	-> 140
/*     */     //   #79	-> 181
/*     */     //   #81	-> 200
/*     */     //   #82	-> 212
/*     */     //   #80	-> 213
/*     */     //   #80	-> 217
/*     */     //   #79	-> 218
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	27	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;
/*     */     //   133	21	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;
/*     */     //   154	21	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;
/*     */     //   197	16	3	url	Ljava/lang/String;
/*     */     //   200	13	4	$i$a$-also-JunieAipLicenseRepositoryImpl$getRegisterAccountUrl$2	I
/*     */     //   0	228	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	168	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	161	5	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getLicensePurchaseUrl(@NotNull Continuation<? super String> $completion) {
/*     */     JunieAipLicenseRepositoryKt.access$getLOG$p().warn("Using the default URL for jetbrains ai purchase license: https://account.jetbrains.com/licenses/");
/*     */     return regionalUrl("https://account.jetbrains.com/licenses/", $completion);
/*     */   }
/*     */   
/*     */   private final Object loadJbaServiceConfiguration(Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$loadJbaServiceConfiguration$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$loadJbaServiceConfiguration$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$loadJbaServiceConfiguration$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;Lkotlin/coroutines/Continuation;)V
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
/*     */     //   101: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl
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
/*     */     //   #91	-> 60
/*     */     //   #92	-> 93
/*     */     //   #93	-> 108
/*     */     //   #91	-> 148
/*     */     //   #93	-> 162
/*     */     //   #92	-> 165
/*     */     //   #94	-> 188
/*     */     //   #92	-> 194
/*     */     //   #91	-> 195
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	2	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;
/*     */     //   105	14	3	$this$loadJbaServiceConfiguration_u24lambda_u245	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;
/*     */     //   108	43	4	$i$a$-runCatching-JunieAipLicenseRepositoryImpl$loadJbaServiceConfiguration$2	I
/*     */     //   0	205	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	145	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	138	6	$result	Ljava/lang/Object;
/*     */     //   154	11	4	$i$a$-runCatching-JunieAipLicenseRepositoryImpl$loadJbaServiceConfiguration$2	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   95	142	172	java/lang/Throwable
/*     */     //   154	169	172	java/lang/Throwable
/*     */   }
/*     */   
/*     */   private final Object regionalUrl(String url, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$regionalUrl$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$regionalUrl$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #5
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$regionalUrl$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #5
/*     */     //   50: aload #5
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #4
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #6
/*     */     //   62: aload #5
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 143, 0 -> 88, 1 -> 128
/*     */     //   88: aload #4
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_1
/*     */     //   94: invokestatic tryMapUrl : (Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;
/*     */     //   97: astore_3
/*     */     //   98: aload_3
/*     */     //   99: ldc 'tryMapUrl(...)'
/*     */     //   101: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   104: aload_3
/*     */     //   105: checkcast java/util/concurrent/CompletionStage
/*     */     //   108: aload #5
/*     */     //   110: aload #5
/*     */     //   112: iconst_1
/*     */     //   113: putfield label : I
/*     */     //   116: invokestatic await : (Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   119: dup
/*     */     //   120: aload #6
/*     */     //   122: if_acmpne -> 135
/*     */     //   125: aload #6
/*     */     //   127: areturn
/*     */     //   128: aload #4
/*     */     //   130: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   133: aload #4
/*     */     //   135: dup
/*     */     //   136: ldc_w 'await(...)'
/*     */     //   139: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   142: areturn
/*     */     //   143: new java/lang/IllegalStateException
/*     */     //   146: dup
/*     */     //   147: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   149: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   152: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #97	-> 60
/*     */     //   #98	-> 93
/*     */     //   #97	-> 125
/*     */     //   #98	-> 135
/*     */     //   #97	-> 143
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	5	1	url	Ljava/lang/String;
/*     */     //   0	153	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	93	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	86	4	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getActiveLicenses(@NotNull AipLicenseProductType productType, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$getActiveLicenses$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$getActiveLicenses$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #5
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$getActiveLicenses$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #5
/*     */     //   50: aload #5
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #4
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #6
/*     */     //   62: aload #5
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 205, 0 -> 88, 1 -> 160
/*     */     //   88: aload #4
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: invokestatic access$getLOG$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   96: aload_1
/*     */     //   97: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;)Ljava/lang/String;
/*     */     //   102: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   105: aload_0
/*     */     //   106: invokespecial getJbaInfoService : ()Lcom/intellij/ui/JBAccountInfoService;
/*     */     //   109: aload_1
/*     */     //   110: invokevirtual getProductCode : ()Ljava/lang/String;
/*     */     //   113: invokeinterface getAvailableLicenses : (Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;
/*     */     //   118: dup
/*     */     //   119: ldc_w 'getAvailableLicenses(...)'
/*     */     //   122: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   125: checkcast java/util/concurrent/CompletionStage
/*     */     //   128: aload #5
/*     */     //   130: aload #5
/*     */     //   132: aload_0
/*     */     //   133: putfield L$0 : Ljava/lang/Object;
/*     */     //   136: aload #5
/*     */     //   138: aload_1
/*     */     //   139: putfield L$1 : Ljava/lang/Object;
/*     */     //   142: aload #5
/*     */     //   144: iconst_1
/*     */     //   145: putfield label : I
/*     */     //   148: invokestatic await : (Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   151: dup
/*     */     //   152: aload #6
/*     */     //   154: if_acmpne -> 185
/*     */     //   157: aload #6
/*     */     //   159: areturn
/*     */     //   160: aload #5
/*     */     //   162: getfield L$1 : Ljava/lang/Object;
/*     */     //   165: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType
/*     */     //   168: astore_1
/*     */     //   169: aload #5
/*     */     //   171: getfield L$0 : Ljava/lang/Object;
/*     */     //   174: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl
/*     */     //   177: astore_0
/*     */     //   178: aload #4
/*     */     //   180: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   183: aload #4
/*     */     //   185: checkcast com/intellij/ui/JBAccountInfoService$LicenseListResult
/*     */     //   188: astore_3
/*     */     //   189: aload_0
/*     */     //   190: aload_1
/*     */     //   191: aload_3
/*     */     //   192: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   195: aload_3
/*     */     //   196: invokespecial logLicenseListResult : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;Lcom/intellij/ui/JBAccountInfoService$LicenseListResult;)V
/*     */     //   199: aload_3
/*     */     //   200: aload_1
/*     */     //   201: invokestatic access$toAipLicenseResult : (Lcom/intellij/ui/JBAccountInfoService$LicenseListResult;Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;
/*     */     //   204: areturn
/*     */     //   205: new java/lang/IllegalStateException
/*     */     //   208: dup
/*     */     //   209: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   211: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   214: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #101	-> 60
/*     */     //   #102	-> 93
/*     */     //   #103	-> 105
/*     */     //   #101	-> 157
/*     */     //   #104	-> 189
/*     */     //   #105	-> 199
/*     */     //   #101	-> 205
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	67	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;
/*     */     //   178	27	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;
/*     */     //   93	67	1	productType	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */     //   169	36	1	productType	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */     //   189	16	3	licenseListResult	Lcom/intellij/ui/JBAccountInfoService$LicenseListResult;
/*     */     //   0	215	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	155	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	148	4	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object issueTrialLicense(@NotNull AipLicenseProductType productType, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$issueTrialLicense$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$issueTrialLicense$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #5
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl$issueTrialLicense$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #5
/*     */     //   50: aload #5
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #4
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #6
/*     */     //   62: aload #5
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 208, 0 -> 88, 1 -> 163
/*     */     //   88: aload #4
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: invokestatic access$getLOG$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   96: aload_1
/*     */     //   97: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;)Ljava/lang/String;
/*     */     //   102: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   105: aload_0
/*     */     //   106: invokespecial getJbaInfoService : ()Lcom/intellij/ui/JBAccountInfoService;
/*     */     //   109: aload_1
/*     */     //   110: invokevirtual getProductCode : ()Ljava/lang/String;
/*     */     //   113: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   116: invokeinterface issueTrialLicense : (Ljava/lang/String;Ljava/util/List;)Ljava/util/concurrent/CompletableFuture;
/*     */     //   121: dup
/*     */     //   122: ldc_w 'issueTrialLicense(...)'
/*     */     //   125: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   128: checkcast java/util/concurrent/CompletionStage
/*     */     //   131: aload #5
/*     */     //   133: aload #5
/*     */     //   135: aload_0
/*     */     //   136: putfield L$0 : Ljava/lang/Object;
/*     */     //   139: aload #5
/*     */     //   141: aload_1
/*     */     //   142: putfield L$1 : Ljava/lang/Object;
/*     */     //   145: aload #5
/*     */     //   147: iconst_1
/*     */     //   148: putfield label : I
/*     */     //   151: invokestatic await : (Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   154: dup
/*     */     //   155: aload #6
/*     */     //   157: if_acmpne -> 188
/*     */     //   160: aload #6
/*     */     //   162: areturn
/*     */     //   163: aload #5
/*     */     //   165: getfield L$1 : Ljava/lang/Object;
/*     */     //   168: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType
/*     */     //   171: astore_1
/*     */     //   172: aload #5
/*     */     //   174: getfield L$0 : Ljava/lang/Object;
/*     */     //   177: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl
/*     */     //   180: astore_0
/*     */     //   181: aload #4
/*     */     //   183: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   186: aload #4
/*     */     //   188: checkcast com/intellij/ui/JBAccountInfoService$LicenseListResult
/*     */     //   191: astore_3
/*     */     //   192: aload_0
/*     */     //   193: aload_1
/*     */     //   194: aload_3
/*     */     //   195: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   198: aload_3
/*     */     //   199: invokespecial logLicenseListResult : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;Lcom/intellij/ui/JBAccountInfoService$LicenseListResult;)V
/*     */     //   202: aload_3
/*     */     //   203: aload_1
/*     */     //   204: invokestatic access$toAipLicenseResult : (Lcom/intellij/ui/JBAccountInfoService$LicenseListResult;Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;
/*     */     //   207: areturn
/*     */     //   208: new java/lang/IllegalStateException
/*     */     //   211: dup
/*     */     //   212: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   214: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   217: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #108	-> 60
/*     */     //   #109	-> 93
/*     */     //   #110	-> 105
/*     */     //   #108	-> 160
/*     */     //   #111	-> 192
/*     */     //   #112	-> 202
/*     */     //   #108	-> 208
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	70	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;
/*     */     //   181	27	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryImpl;
/*     */     //   93	70	1	productType	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */     //   172	36	1	productType	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */     //   192	16	3	licenseListResult	Lcom/intellij/ui/JBAccountInfoService$LicenseListResult;
/*     */     //   0	218	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	158	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	151	4	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private final void logLicenseListResult(AipLicenseProductType productType, JBAccountInfoService.LicenseListResult result) {
/*     */     JBAccountInfoService.LicenseListResult licenseListResult = result;
/*     */     if (licenseListResult instanceof JBAccountInfoService.LicenseListResult.LicenseList) {
/*     */       Intrinsics.checkNotNullExpressionValue(((JBAccountInfoService.LicenseListResult.LicenseList)result).licenses(), "licenses(...)");
/*     */       JunieAipLicenseRepositoryKt.access$getLOG$p().info("Retrieved " + productType + " license(s): " + CollectionsKt.joinToString$default(((JBAccountInfoService.LicenseListResult.LicenseList)result).licenses(), null, null, null, 0, null, JunieAipLicenseRepositoryImpl::logLicenseListResult$lambda$6, 31, null));
/*     */     } else if (licenseListResult instanceof JBAccountInfoService.LicenseListResult.RequestDeclined) {
/*     */       JunieAipLicenseRepositoryKt.access$getLOG$p().info("" + productType + " license request declined: " + productType + " " + ((JBAccountInfoService.LicenseListResult.RequestDeclined)result).errorCode());
/*     */     } else if (licenseListResult instanceof JBAccountInfoService.LicenseListResult.RequestFailed) {
/*     */       JunieAipLicenseRepositoryKt.access$getLOG$p().info("" + productType + " license request failed: " + productType);
/*     */     } else if (licenseListResult instanceof JBAccountInfoService.AuthRequired) {
/*     */       JunieAipLicenseRepositoryKt.access$getLOG$p().info("Relogin required to complete " + productType + " license request");
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final CharSequence logLicenseListResult$lambda$6(JBAccountInfoService.JbaLicense it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     Intrinsics.checkNotNullExpressionValue(it.licenseId(), "licenseId(...)");
/*     */     return it.licenseId();
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieAipLicenseRepository.kt", l = {103}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "productType"}, m = "getActiveLicenses", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseRepositoryImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JunieAipLicenseRepositoryImpl$getActiveLicenses$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     JunieAipLicenseRepositoryImpl$getActiveLicenses$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JunieAipLicenseRepositoryImpl.this.getActiveLicenses(null, (Continuation<? super AipLicenseResult>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieAipLicenseRepository.kt", l = {69, 69}, i = {0}, s = {"L$0"}, n = {"this"}, m = "getManageAccountUrl", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseRepositoryImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JunieAipLicenseRepositoryImpl$getManageAccountUrl$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     JunieAipLicenseRepositoryImpl$getManageAccountUrl$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JunieAipLicenseRepositoryImpl.this.getManageAccountUrl((Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieAipLicenseRepository.kt", l = {59, 61}, i = {0}, s = {"L$0"}, n = {"this"}, m = "getPaymentMethodsUrl", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseRepositoryImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JunieAipLicenseRepositoryImpl$getPaymentMethodsUrl$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     JunieAipLicenseRepositoryImpl$getPaymentMethodsUrl$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JunieAipLicenseRepositoryImpl.this.getPaymentMethodsUrl((Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieAipLicenseRepository.kt", l = {54}, i = {}, s = {}, n = {}, m = "getPurchaseAipUrl", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseRepositoryImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JunieAipLicenseRepositoryImpl$getPurchaseAipUrl$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     JunieAipLicenseRepositoryImpl$getPurchaseAipUrl$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JunieAipLicenseRepositoryImpl.this.getPurchaseAipUrl((Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieAipLicenseRepository.kt", l = {80, 80}, i = {0}, s = {"L$0"}, n = {"this"}, m = "getRegisterAccountUrl", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseRepositoryImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JunieAipLicenseRepositoryImpl$getRegisterAccountUrl$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     JunieAipLicenseRepositoryImpl$getRegisterAccountUrl$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JunieAipLicenseRepositoryImpl.this.getRegisterAccountUrl((Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieAipLicenseRepository.kt", l = {110}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "productType"}, m = "issueTrialLicense", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseRepositoryImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JunieAipLicenseRepositoryImpl$issueTrialLicense$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     JunieAipLicenseRepositoryImpl$issueTrialLicense$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JunieAipLicenseRepositoryImpl.this.issueTrialLicense(null, (Continuation<? super AipLicenseResult>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieAipLicenseRepository.kt", l = {93}, i = {}, s = {}, n = {}, m = "loadJbaServiceConfiguration", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseRepositoryImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JunieAipLicenseRepositoryImpl$loadJbaServiceConfiguration$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     JunieAipLicenseRepositoryImpl$loadJbaServiceConfiguration$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JunieAipLicenseRepositoryImpl.this.loadJbaServiceConfiguration((Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieAipLicenseRepository.kt", l = {98}, i = {}, s = {}, n = {}, m = "regionalUrl", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseRepositoryImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JunieAipLicenseRepositoryImpl$regionalUrl$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     JunieAipLicenseRepositoryImpl$regionalUrl$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JunieAipLicenseRepositoryImpl.this.regionalUrl(null, (Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieAipLicenseRepositoryImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */