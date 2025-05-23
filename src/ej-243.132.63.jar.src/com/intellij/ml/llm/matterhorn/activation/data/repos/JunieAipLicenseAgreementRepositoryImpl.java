/*     */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*     */ 
/*     */ import com.intellij.ide.Region;
/*     */ import com.intellij.ide.RegionSettings;
/*     */ import com.intellij.ide.gdpr.EndUserAgreement;
/*     */ import com.intellij.ide.gdpr.Version;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseAgreement;
/*     */ import com.intellij.ui.JBAccountInfoService;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\002\b\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\016\020\b\032\0020\tH@¢\006\002\020\nJ\016\020\013\032\0020\tH@¢\006\002\020\nJ\036\020\f\032\0020\t2\006\020\r\032\0020\0162\006\020\017\032\0020\020H@¢\006\002\020\021J&\020\f\032\0020\t2\006\020\r\032\0020\0162\006\020\022\032\0020\0232\006\020\024\032\0020\020H@¢\006\002\020\025J\016\020\026\032\0020\027H@¢\006\002\020\nJ\026\020\030\032\0020\0312\006\020\032\032\0020\tH@¢\006\002\020\033J\b\020\034\032\0020\035H\002J\020\020\036\032\0020\0312\006\020\032\032\0020\tH\002R\024\020\004\032\0020\0058BX\004¢\006\006\032\004\b\006\020\007¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepository;", "<init>", "()V", "jbaInfoService", "Lcom/intellij/ui/JBAccountInfoService;", "getJbaInfoService", "()Lcom/intellij/ui/JBAccountInfoService;", "loadLocalAgreementDocument", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAgreementDocument", "localAgreement", "region", "Lcom/intellij/ide/Region;", "euaDocument", "Lcom/intellij/ide/gdpr/EndUserAgreement$Document;", "(Lcom/intellij/ide/Region;Lcom/intellij/ide/gdpr/EndUserAgreement$Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "docName", "", "document", "(Lcom/intellij/ide/Region;Ljava/lang/String;Lcom/intellij/ide/gdpr/EndUserAgreement$Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocalAcceptedVersion", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement$Version;", "setLocalAcceptedVersion", "", "agreement", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAcceptedEuaVersion", "Lcom/intellij/ide/gdpr/Version;", "setAcceptedEuaVersion", "data.repos"})
/*     */ @SourceDebugExtension({"SMAP\nJunieAipLicenseAgreementRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieAipLicenseAgreementRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
/*     */ final class JunieAipLicenseAgreementRepositoryImpl
/*     */   implements JunieAipLicenseAgreementRepository
/*     */ {
/*     */   private final JBAccountInfoService getJbaInfoService() {
/*  34 */     if (JBAccountInfoService.getInstance() == null) { JBAccountInfoService.getInstance();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 128 */       int $i$a$-checkNotNull-JunieAipLicenseAgreementRepositoryImpl$jbaInfoService$1 = 0;
/*     */       String str = "JBAccountInfoService is unavailable";
/*     */       throw new IllegalStateException(str.toString()); }
/*     */     
/*     */     return JBAccountInfoService.getInstance();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object loadLocalAgreementDocument(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl$loadLocalAgreementDocument$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl$loadLocalAgreementDocument$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl$loadLocalAgreementDocument$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #6
/*     */     //   50: aload #6
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #6
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 258, 0 -> 92, 1 -> 168, 2 -> 250
/*     */     //   92: aload #5
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: invokestatic getRegion : ()Lcom/intellij/ide/Region;
/*     */     //   100: dup
/*     */     //   101: ldc 'getRegion(...)'
/*     */     //   103: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   106: astore_2
/*     */     //   107: aload_2
/*     */     //   108: invokestatic access$regionalDocumentName : (Lcom/intellij/ide/Region;)Ljava/lang/String;
/*     */     //   111: astore_3
/*     */     //   112: invokestatic getIO : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   115: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   118: new com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl$loadLocalAgreementDocument$document$1
/*     */     //   121: dup
/*     */     //   122: aload_3
/*     */     //   123: aconst_null
/*     */     //   124: invokespecial <init> : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
/*     */     //   127: checkcast kotlin/jvm/functions/Function2
/*     */     //   130: aload #6
/*     */     //   132: aload #6
/*     */     //   134: aload_0
/*     */     //   135: putfield L$0 : Ljava/lang/Object;
/*     */     //   138: aload #6
/*     */     //   140: aload_2
/*     */     //   141: putfield L$1 : Ljava/lang/Object;
/*     */     //   144: aload #6
/*     */     //   146: aload_3
/*     */     //   147: putfield L$2 : Ljava/lang/Object;
/*     */     //   150: aload #6
/*     */     //   152: iconst_1
/*     */     //   153: putfield label : I
/*     */     //   156: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   159: dup
/*     */     //   160: aload #7
/*     */     //   162: if_acmpne -> 202
/*     */     //   165: aload #7
/*     */     //   167: areturn
/*     */     //   168: aload #6
/*     */     //   170: getfield L$2 : Ljava/lang/Object;
/*     */     //   173: checkcast java/lang/String
/*     */     //   176: astore_3
/*     */     //   177: aload #6
/*     */     //   179: getfield L$1 : Ljava/lang/Object;
/*     */     //   182: checkcast com/intellij/ide/Region
/*     */     //   185: astore_2
/*     */     //   186: aload #6
/*     */     //   188: getfield L$0 : Ljava/lang/Object;
/*     */     //   191: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl
/*     */     //   194: astore_0
/*     */     //   195: aload #5
/*     */     //   197: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   200: aload #5
/*     */     //   202: checkcast com/intellij/ide/gdpr/EndUserAgreement$Document
/*     */     //   205: astore #4
/*     */     //   207: aload_0
/*     */     //   208: aload_2
/*     */     //   209: aload_3
/*     */     //   210: aload #4
/*     */     //   212: aload #6
/*     */     //   214: aload #6
/*     */     //   216: aconst_null
/*     */     //   217: putfield L$0 : Ljava/lang/Object;
/*     */     //   220: aload #6
/*     */     //   222: aconst_null
/*     */     //   223: putfield L$1 : Ljava/lang/Object;
/*     */     //   226: aload #6
/*     */     //   228: aconst_null
/*     */     //   229: putfield L$2 : Ljava/lang/Object;
/*     */     //   232: aload #6
/*     */     //   234: iconst_2
/*     */     //   235: putfield label : I
/*     */     //   238: invokespecial localAgreement : (Lcom/intellij/ide/Region;Ljava/lang/String;Lcom/intellij/ide/gdpr/EndUserAgreement$Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   241: dup
/*     */     //   242: aload #7
/*     */     //   244: if_acmpne -> 257
/*     */     //   247: aload #7
/*     */     //   249: areturn
/*     */     //   250: aload #5
/*     */     //   252: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   255: aload #5
/*     */     //   257: areturn
/*     */     //   258: new java/lang/IllegalStateException
/*     */     //   261: dup
/*     */     //   262: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   264: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   267: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #36	-> 60
/*     */     //   #37	-> 97
/*     */     //   #38	-> 107
/*     */     //   #40	-> 112
/*     */     //   #36	-> 165
/*     */     //   #44	-> 207
/*     */     //   #36	-> 247
/*     */     //   #44	-> 257
/*     */     //   #36	-> 258
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	71	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl;
/*     */     //   195	46	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl;
/*     */     //   107	61	2	region	Lcom/intellij/ide/Region;
/*     */     //   186	55	2	region	Lcom/intellij/ide/Region;
/*     */     //   112	56	3	docName	Ljava/lang/String;
/*     */     //   177	64	3	docName	Ljava/lang/String;
/*     */     //   207	34	4	document	Lcom/intellij/ide/gdpr/EndUserAgreement$Document;
/*     */     //   0	268	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	208	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	201	5	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieAipLicenseAgreementRepository.kt", l = {40, 44}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "region", "docName"}, m = "loadLocalAgreementDocument", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseAgreementRepositoryImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JunieAipLicenseAgreementRepositoryImpl$loadLocalAgreementDocument$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     JunieAipLicenseAgreementRepositoryImpl$loadLocalAgreementDocument$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JunieAipLicenseAgreementRepositoryImpl.this.loadLocalAgreementDocument((Continuation<? super AipLicenseAgreement>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieAipLicenseAgreementRepository.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseAgreementRepositoryImpl$loadLocalAgreementDocument$document$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ide/gdpr/EndUserAgreement$Document;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class JunieAipLicenseAgreementRepositoryImpl$loadLocalAgreementDocument$document$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EndUserAgreement.Document>, Object> {
/*     */     int label;
/*     */     
/*     */     JunieAipLicenseAgreementRepositoryImpl$loadLocalAgreementDocument$document$1(String $docName, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return JunieAipLicenseAgreementRepositoryKt.loadDocumentBlocking(this.$docName);
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super JunieAipLicenseAgreementRepositoryImpl$loadLocalAgreementDocument$document$1> $completion) {
/*     */       return (Continuation<Unit>)new JunieAipLicenseAgreementRepositoryImpl$loadLocalAgreementDocument$document$1(this.$docName, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((JunieAipLicenseAgreementRepositoryImpl$loadLocalAgreementDocument$document$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object updateAgreementDocument(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl$updateAgreementDocument$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl$updateAgreementDocument$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl$updateAgreementDocument$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #10
/*     */     //   50: aload #10
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #9
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #11
/*     */     //   62: aload #10
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 382, 0 -> 96, 1 -> 188, 2 -> 313, 3 -> 374
/*     */     //   96: aload #9
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: invokestatic getRegion : ()Lcom/intellij/ide/Region;
/*     */     //   104: dup
/*     */     //   105: ldc 'getRegion(...)'
/*     */     //   107: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   110: astore_2
/*     */     //   111: aload_2
/*     */     //   112: invokestatic access$regionalDocumentName : (Lcom/intellij/ide/Region;)Ljava/lang/String;
/*     */     //   115: astore_3
/*     */     //   116: aload_3
/*     */     //   117: invokestatic getAcceptedVersion : (Ljava/lang/String;)Lcom/intellij/ide/gdpr/Version;
/*     */     //   120: dup
/*     */     //   121: ldc 'getAcceptedVersion(...)'
/*     */     //   123: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   126: astore #4
/*     */     //   128: aload_0
/*     */     //   129: invokespecial getJbaInfoService : ()Lcom/intellij/ui/JBAccountInfoService;
/*     */     //   132: ldc 'AI'
/*     */     //   134: aload_3
/*     */     //   135: aload #4
/*     */     //   137: invokeinterface recordAgreementAcceptance : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ide/gdpr/Version;)Ljava/util/concurrent/CompletableFuture;
/*     */     //   142: astore #6
/*     */     //   144: aload #6
/*     */     //   146: ldc 'recordAgreementAcceptance(...)'
/*     */     //   148: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   151: aload #6
/*     */     //   153: checkcast java/util/concurrent/CompletionStage
/*     */     //   156: aload #10
/*     */     //   158: aload #10
/*     */     //   160: aload_0
/*     */     //   161: putfield L$0 : Ljava/lang/Object;
/*     */     //   164: aload #10
/*     */     //   166: aload_2
/*     */     //   167: putfield L$1 : Ljava/lang/Object;
/*     */     //   170: aload #10
/*     */     //   172: iconst_1
/*     */     //   173: putfield label : I
/*     */     //   176: invokestatic await : (Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   179: dup
/*     */     //   180: aload #11
/*     */     //   182: if_acmpne -> 213
/*     */     //   185: aload #11
/*     */     //   187: areturn
/*     */     //   188: aload #10
/*     */     //   190: getfield L$1 : Ljava/lang/Object;
/*     */     //   193: checkcast com/intellij/ide/Region
/*     */     //   196: astore_2
/*     */     //   197: aload #10
/*     */     //   199: getfield L$0 : Ljava/lang/Object;
/*     */     //   202: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl
/*     */     //   205: astore_0
/*     */     //   206: aload #9
/*     */     //   208: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   211: aload #9
/*     */     //   213: checkcast com/intellij/ui/JBAccountInfoService$AgreementAcceptanceResult
/*     */     //   216: astore #5
/*     */     //   218: aload #5
/*     */     //   220: instanceof com/intellij/ui/JBAccountInfoService$AgreementAcceptanceResult$AckAccepted
/*     */     //   223: ifeq -> 328
/*     */     //   226: aload #5
/*     */     //   228: checkcast com/intellij/ui/JBAccountInfoService$AgreementAcceptanceResult$AckAccepted
/*     */     //   231: invokevirtual newerDocument : ()Lcom/intellij/ide/gdpr/EndUserAgreement$Document;
/*     */     //   234: dup
/*     */     //   235: ifnull -> 324
/*     */     //   238: astore #7
/*     */     //   240: iconst_0
/*     */     //   241: istore #8
/*     */     //   243: invokestatic access$getLOG$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   246: aload #7
/*     */     //   248: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   251: aload #7
/*     */     //   253: invokevirtual getVersion : ()Lcom/intellij/ide/gdpr/Version;
/*     */     //   256: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Lcom/intellij/ide/gdpr/Version;)Ljava/lang/String;
/*     */     //   261: invokevirtual debug : (Ljava/lang/String;)V
/*     */     //   264: aload #7
/*     */     //   266: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   269: aload #7
/*     */     //   271: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   274: invokestatic updateContent : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   277: aload_0
/*     */     //   278: aload_2
/*     */     //   279: aload #7
/*     */     //   281: aload #10
/*     */     //   283: aload #10
/*     */     //   285: aconst_null
/*     */     //   286: putfield L$0 : Ljava/lang/Object;
/*     */     //   289: aload #10
/*     */     //   291: aconst_null
/*     */     //   292: putfield L$1 : Ljava/lang/Object;
/*     */     //   295: aload #10
/*     */     //   297: iconst_2
/*     */     //   298: putfield label : I
/*     */     //   301: invokespecial localAgreement : (Lcom/intellij/ide/Region;Lcom/intellij/ide/gdpr/EndUserAgreement$Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   304: dup
/*     */     //   305: aload #11
/*     */     //   307: if_acmpne -> 323
/*     */     //   310: aload #11
/*     */     //   312: areturn
/*     */     //   313: iconst_0
/*     */     //   314: istore #8
/*     */     //   316: aload #9
/*     */     //   318: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   321: aload #9
/*     */     //   323: areturn
/*     */     //   324: pop
/*     */     //   325: goto -> 341
/*     */     //   328: invokestatic access$getLOG$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   331: aload #5
/*     */     //   333: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ui/JBAccountInfoService$AgreementAcceptanceResult;)Ljava/lang/String;
/*     */     //   338: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   341: aload_0
/*     */     //   342: aload #10
/*     */     //   344: aload #10
/*     */     //   346: aconst_null
/*     */     //   347: putfield L$0 : Ljava/lang/Object;
/*     */     //   350: aload #10
/*     */     //   352: aconst_null
/*     */     //   353: putfield L$1 : Ljava/lang/Object;
/*     */     //   356: aload #10
/*     */     //   358: iconst_3
/*     */     //   359: putfield label : I
/*     */     //   362: invokevirtual loadLocalAgreementDocument : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   365: dup
/*     */     //   366: aload #11
/*     */     //   368: if_acmpne -> 381
/*     */     //   371: aload #11
/*     */     //   373: areturn
/*     */     //   374: aload #9
/*     */     //   376: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   379: aload #9
/*     */     //   381: areturn
/*     */     //   382: new java/lang/IllegalStateException
/*     */     //   385: dup
/*     */     //   386: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   388: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   391: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #47	-> 60
/*     */     //   #48	-> 101
/*     */     //   #49	-> 111
/*     */     //   #50	-> 116
/*     */     //   #52	-> 128
/*     */     //   #47	-> 185
/*     */     //   #53	-> 218
/*     */     //   #54	-> 226
/*     */     //   #55	-> 243
/*     */     //   #56	-> 264
/*     */     //   #57	-> 277
/*     */     //   #47	-> 310
/*     */     //   #57	-> 323
/*     */     //   #61	-> 328
/*     */     //   #63	-> 341
/*     */     //   #47	-> 371
/*     */     //   #63	-> 381
/*     */     //   #47	-> 382
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	87	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl;
/*     */     //   206	98	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl;
/*     */     //   324	41	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl;
/*     */     //   111	77	2	region	Lcom/intellij/ide/Region;
/*     */     //   197	107	2	region	Lcom/intellij/ide/Region;
/*     */     //   116	28	3	docName	Ljava/lang/String;
/*     */     //   128	16	4	acceptedVersion	Lcom/intellij/ide/gdpr/Version;
/*     */     //   218	16	5	result	Lcom/intellij/ui/JBAccountInfoService$AgreementAcceptanceResult;
/*     */     //   328	13	5	result	Lcom/intellij/ui/JBAccountInfoService$AgreementAcceptanceResult;
/*     */     //   240	64	7	newerDoc	Lcom/intellij/ide/gdpr/EndUserAgreement$Document;
/*     */     //   243	70	8	$i$a$-let-JunieAipLicenseAgreementRepositoryImpl$updateAgreementDocument$2	I
/*     */     //   0	392	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	332	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	325	9	$result	Ljava/lang/Object;
/*     */     //   316	8	8	$i$a$-let-JunieAipLicenseAgreementRepositoryImpl$updateAgreementDocument$2	I
/*     */   }
/*     */   
/*     */   private final Object localAgreement(Region region, EndUserAgreement.Document euaDocument, Continuation<? super AipLicenseAgreement> $completion) {
/*     */     Intrinsics.checkNotNullExpressionValue(euaDocument.getName(), "getName(...)");
/*     */     return localAgreement(region, euaDocument.getName(), euaDocument, $completion);
/*     */   }
/*     */   
/*     */   private final Object localAgreement(Region region, String docName, EndUserAgreement.Document document, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl$localAgreement$2
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl$localAgreement$2
/*     */     //   13: astore #12
/*     */     //   15: aload #12
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #12
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl$localAgreement$2
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #12
/*     */     //   53: aload #12
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #11
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #13
/*     */     //   65: aload #12
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 407, 0 -> 100, 1 -> 146, 2 -> 239, 3 -> 342
/*     */     //   100: aload #11
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: getstatic com/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepository.Companion : Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepository$Companion;
/*     */     //   108: aload #12
/*     */     //   110: aload #12
/*     */     //   112: aload_1
/*     */     //   113: putfield L$0 : Ljava/lang/Object;
/*     */     //   116: aload #12
/*     */     //   118: aload_2
/*     */     //   119: putfield L$1 : Ljava/lang/Object;
/*     */     //   122: aload #12
/*     */     //   124: aload_3
/*     */     //   125: putfield L$2 : Ljava/lang/Object;
/*     */     //   128: aload #12
/*     */     //   130: iconst_1
/*     */     //   131: putfield label : I
/*     */     //   134: invokevirtual instance : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   137: dup
/*     */     //   138: aload #13
/*     */     //   140: if_acmpne -> 180
/*     */     //   143: aload #13
/*     */     //   145: areturn
/*     */     //   146: aload #12
/*     */     //   148: getfield L$2 : Ljava/lang/Object;
/*     */     //   151: checkcast com/intellij/ide/gdpr/EndUserAgreement$Document
/*     */     //   154: astore_3
/*     */     //   155: aload #12
/*     */     //   157: getfield L$1 : Ljava/lang/Object;
/*     */     //   160: checkcast java/lang/String
/*     */     //   163: astore_2
/*     */     //   164: aload #12
/*     */     //   166: getfield L$0 : Ljava/lang/Object;
/*     */     //   169: checkcast com/intellij/ide/Region
/*     */     //   172: astore_1
/*     */     //   173: aload #11
/*     */     //   175: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   178: aload #11
/*     */     //   180: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepository
/*     */     //   183: astore #5
/*     */     //   185: aload_1
/*     */     //   186: invokestatic access$regionalDocumentUnmappedUrl : (Lcom/intellij/ide/Region;)Ljava/lang/String;
/*     */     //   189: astore #8
/*     */     //   191: iconst_0
/*     */     //   192: istore #9
/*     */     //   194: aload #5
/*     */     //   196: aload #8
/*     */     //   198: aload #12
/*     */     //   200: aload #12
/*     */     //   202: aload_2
/*     */     //   203: putfield L$0 : Ljava/lang/Object;
/*     */     //   206: aload #12
/*     */     //   208: aload_3
/*     */     //   209: putfield L$1 : Ljava/lang/Object;
/*     */     //   212: aload #12
/*     */     //   214: aload #5
/*     */     //   216: putfield L$2 : Ljava/lang/Object;
/*     */     //   219: aload #12
/*     */     //   221: iconst_2
/*     */     //   222: putfield label : I
/*     */     //   225: invokeinterface mapRegionUrl-dorYjGE : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   230: dup
/*     */     //   231: aload #13
/*     */     //   233: if_acmpne -> 283
/*     */     //   236: aload #13
/*     */     //   238: areturn
/*     */     //   239: iconst_0
/*     */     //   240: istore #9
/*     */     //   242: aload #12
/*     */     //   244: getfield L$2 : Ljava/lang/Object;
/*     */     //   247: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepository
/*     */     //   250: astore #5
/*     */     //   252: aload #12
/*     */     //   254: getfield L$1 : Ljava/lang/Object;
/*     */     //   257: checkcast com/intellij/ide/gdpr/EndUserAgreement$Document
/*     */     //   260: astore_3
/*     */     //   261: aload #12
/*     */     //   263: getfield L$0 : Ljava/lang/Object;
/*     */     //   266: checkcast java/lang/String
/*     */     //   269: astore_2
/*     */     //   270: aload #11
/*     */     //   272: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   275: aload #11
/*     */     //   277: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/RegionUrl
/*     */     //   280: invokevirtual unbox-impl : ()Ljava/lang/String;
/*     */     //   283: checkcast java/lang/String
/*     */     //   286: nop
/*     */     //   287: astore #6
/*     */     //   289: ldc_w 'https://www.jetbrains.com/legal/docs/terms/jetbrains-ai/acceptable-use/'
/*     */     //   292: astore #9
/*     */     //   294: iconst_0
/*     */     //   295: istore #10
/*     */     //   297: aload #5
/*     */     //   299: aload #9
/*     */     //   301: aload #12
/*     */     //   303: aload #12
/*     */     //   305: aload_2
/*     */     //   306: putfield L$0 : Ljava/lang/Object;
/*     */     //   309: aload #12
/*     */     //   311: aload_3
/*     */     //   312: putfield L$1 : Ljava/lang/Object;
/*     */     //   315: aload #12
/*     */     //   317: aload #6
/*     */     //   319: putfield L$2 : Ljava/lang/Object;
/*     */     //   322: aload #12
/*     */     //   324: iconst_3
/*     */     //   325: putfield label : I
/*     */     //   328: invokeinterface mapRegionUrl-dorYjGE : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   333: dup
/*     */     //   334: aload #13
/*     */     //   336: if_acmpne -> 386
/*     */     //   339: aload #13
/*     */     //   341: areturn
/*     */     //   342: iconst_0
/*     */     //   343: istore #10
/*     */     //   345: aload #12
/*     */     //   347: getfield L$2 : Ljava/lang/Object;
/*     */     //   350: checkcast java/lang/String
/*     */     //   353: astore #6
/*     */     //   355: aload #12
/*     */     //   357: getfield L$1 : Ljava/lang/Object;
/*     */     //   360: checkcast com/intellij/ide/gdpr/EndUserAgreement$Document
/*     */     //   363: astore_3
/*     */     //   364: aload #12
/*     */     //   366: getfield L$0 : Ljava/lang/Object;
/*     */     //   369: checkcast java/lang/String
/*     */     //   372: astore_2
/*     */     //   373: aload #11
/*     */     //   375: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   378: aload #11
/*     */     //   380: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/RegionUrl
/*     */     //   383: invokevirtual unbox-impl : ()Ljava/lang/String;
/*     */     //   386: checkcast java/lang/String
/*     */     //   389: nop
/*     */     //   390: astore #7
/*     */     //   392: new com/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement
/*     */     //   395: dup
/*     */     //   396: aload_2
/*     */     //   397: aload_3
/*     */     //   398: aload #6
/*     */     //   400: aload #7
/*     */     //   402: aconst_null
/*     */     //   403: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ide/gdpr/EndUserAgreement$Document;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   406: areturn
/*     */     //   407: new java/lang/IllegalStateException
/*     */     //   410: dup
/*     */     //   411: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   413: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   416: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #70	-> 63
/*     */     //   #71	-> 105
/*     */     //   #70	-> 143
/*     */     //   #72	-> 185
/*     */     //   #128	-> 191
/*     */     //   #72	-> 194
/*     */     //   #70	-> 236
/*     */     //   #72	-> 283
/*     */     //   #72	-> 286
/*     */     //   #72	-> 287
/*     */     //   #73	-> 289
/*     */     //   #128	-> 294
/*     */     //   #73	-> 297
/*     */     //   #70	-> 339
/*     */     //   #73	-> 386
/*     */     //   #73	-> 389
/*     */     //   #73	-> 390
/*     */     //   #75	-> 392
/*     */     //   #76	-> 396
/*     */     //   #77	-> 397
/*     */     //   #78	-> 398
/*     */     //   #79	-> 400
/*     */     //   #75	-> 403
/*     */     //   #70	-> 407
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	41	1	region	Lcom/intellij/ide/Region;
/*     */     //   173	16	1	region	Lcom/intellij/ide/Region;
/*     */     //   105	41	2	docName	Ljava/lang/String;
/*     */     //   164	75	2	docName	Ljava/lang/String;
/*     */     //   270	72	2	docName	Ljava/lang/String;
/*     */     //   373	34	2	docName	Ljava/lang/String;
/*     */     //   105	41	3	document	Lcom/intellij/ide/gdpr/EndUserAgreement$Document;
/*     */     //   155	84	3	document	Lcom/intellij/ide/gdpr/EndUserAgreement$Document;
/*     */     //   261	81	3	document	Lcom/intellij/ide/gdpr/EndUserAgreement$Document;
/*     */     //   364	43	3	document	Lcom/intellij/ide/gdpr/EndUserAgreement$Document;
/*     */     //   185	54	5	regionUrlRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepository;
/*     */     //   252	34	5	regionUrlRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepository;
/*     */     //   286	1	5	regionUrlRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepository;
/*     */     //   287	46	5	regionUrlRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepository;
/*     */     //   289	53	6	documentUrl	Ljava/lang/String;
/*     */     //   355	52	6	documentUrl	Ljava/lang/String;
/*     */     //   392	15	7	acceptableUsePolicyUrl	Ljava/lang/String;
/*     */     //   191	39	8	it	Ljava/lang/String;
/*     */     //   294	39	9	it	Ljava/lang/String;
/*     */     //   194	45	9	$i$a$-let-JunieAipLicenseAgreementRepositoryImpl$localAgreement$documentUrl$1	I
/*     */     //   297	45	10	$i$a$-let-JunieAipLicenseAgreementRepositoryImpl$localAgreement$acceptableUsePolicyUrl$1	I
/*     */     //   0	417	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	354	12	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	347	11	$result	Ljava/lang/Object;
/*     */     //   242	44	9	$i$a$-let-JunieAipLicenseAgreementRepositoryImpl$localAgreement$documentUrl$1	I
/*     */     //   345	44	10	$i$a$-let-JunieAipLicenseAgreementRepositoryImpl$localAgreement$acceptableUsePolicyUrl$1	I
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getLocalAcceptedVersion(@NotNull Continuation $completion) {
/*     */     return JunieAipLicenseAgreementRepositoryKt.access$toModelVersion(getAcceptedEuaVersion());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object setLocalAcceptedVersion(@NotNull AipLicenseAgreement agreement, @NotNull Continuation $completion) {
/*     */     setAcceptedEuaVersion(agreement);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final Version getAcceptedEuaVersion() {
/*     */     Intrinsics.checkNotNullExpressionValue(RegionSettings.getRegion(), "getRegion(...)");
/*     */     Region region = RegionSettings.getRegion();
/*     */     String docName = JunieAipLicenseAgreementRepositoryKt.access$regionalDocumentName(region);
/*     */     Intrinsics.checkNotNullExpressionValue(EndUserAgreement.getAcceptedVersion(docName), "getAcceptedVersion(...)");
/*     */     return EndUserAgreement.getAcceptedVersion(docName);
/*     */   }
/*     */   
/*     */   private final void setAcceptedEuaVersion(AipLicenseAgreement agreement) {
/*     */     EndUserAgreement.setAccepted(agreement.getDocument());
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieAipLicenseAgreementRepository.kt", l = {71, 72, 73}, i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"region", "docName", "document", "docName", "document", "regionUrlRepository", "docName", "document", "documentUrl"}, m = "localAgreement", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseAgreementRepositoryImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JunieAipLicenseAgreementRepositoryImpl$localAgreement$2 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     JunieAipLicenseAgreementRepositoryImpl$localAgreement$2(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JunieAipLicenseAgreementRepositoryImpl.this.localAgreement(null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieAipLicenseAgreementRepository.kt", l = {52, 57, 63}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "region"}, m = "updateAgreementDocument", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseAgreementRepositoryImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JunieAipLicenseAgreementRepositoryImpl$updateAgreementDocument$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     JunieAipLicenseAgreementRepositoryImpl$updateAgreementDocument$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JunieAipLicenseAgreementRepositoryImpl.this.updateAgreementDocument((Continuation<? super AipLicenseAgreement>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieAipLicenseAgreementRepositoryImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */