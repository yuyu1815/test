/*    */ package com.intellij.ml.llm.matterhorn.ej.core.eula;
/*    */ import com.intellij.ide.gdpr.EndUserAgreement;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.Dispatchers;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\004\030\000 \0172\0020\001:\001\017B\007¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\bJ\030\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\t\032\0020\nH\003J\016\020\013\032\0020\fH@¢\006\002\020\rJ\b\020\016\032\0020\005H\027¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/eula/JunieAgreementConfirmation;", "Lcom/intellij/ml/llm/matterhorn/ej/core/eula/MatterhornAgreementConfirmation;", "<init>", "()V", "showAcceptanceDialogForDocument", "", "document", "Lcom/intellij/ide/gdpr/EndUserAgreement$Document;", "(Lcom/intellij/ide/gdpr/EndUserAgreement$Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "Lcom/intellij/ml/llm/matterhorn/ej/core/eula/JunieAgreementUiData;", "confirmAgreement", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAgreement", "Companion", "ej-core"})
/*    */ public final class JunieAgreementConfirmation implements MatterhornAgreementConfirmation {
/*    */   @NotNull
/* 14 */   public static final Companion Companion = new Companion(null); @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\023\020\004\032\0070\005¢\006\002\b\006X\004¢\006\002\n\000R\016\020\007\032\0020\bXT¢\006\002\n\000¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/eula/JunieAgreementConfirmation$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "Lorg/jetbrains/annotations/NotNull;", "JUNIE_TERMS_OF_SERVICE_URL", "", "ej-core"}) public static final class Companion { private Companion() {} } @NotNull private static final Logger logger = Logger.getInstance(JunieAgreementConfirmation.class); @NotNull private static final String JUNIE_TERMS_OF_SERVICE_URL = "https://www.jetbrains.com/legal/docs/terms/jetbrains-junie/"; static { Intrinsics.checkNotNullExpressionValue(Logger.getInstance(JunieAgreementConfirmation.class), "getInstance(...)"); } @DebugMetadata(f = "JunieAgreementConfirmation.kt", l = {52}, i = {0}, s = {"L$0"}, n = {"document"}, m = "confirmAgreement", c = "com.intellij.ml.llm.matterhorn.ej.core.eula.JunieAgreementConfirmation") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class JunieAgreementConfirmation$confirmAgreement$1 extends ContinuationImpl {
/*    */     Object L$0; int label; JunieAgreementConfirmation$confirmAgreement$1(Continuation $completion) { super($completion); }
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return JunieAgreementConfirmation.this.confirmAgreement((Continuation<? super Boolean>)this); } }
/* 20 */   private final Object showAcceptanceDialogForDocument(EndUserAgreement.Document document, Continuation $completion) { JunieAgreementUiData data = new JunieAgreementUiData(document, "https://www.jetbrains.com/legal/docs/terms/jetbrains-junie/");
/* 21 */     if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new JunieAgreementConfirmation$showAcceptanceDialogForDocument$2(document, data, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new JunieAgreementConfirmation$showAcceptanceDialogForDocument$2(document, data, null), $completion);  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new JunieAgreementConfirmation$showAcceptanceDialogForDocument$2(document, data, null), $completion); return Unit.INSTANCE; } @DebugMetadata(f = "JunieAgreementConfirmation.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.eula.JunieAgreementConfirmation$showAcceptanceDialogForDocument$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class JunieAgreementConfirmation$showAcceptanceDialogForDocument$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; JunieAgreementConfirmation$showAcceptanceDialogForDocument$2(EndUserAgreement.Document $document, JunieAgreementUiData $data, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 22 */           JunieAgreementConfirmation.this.showAcceptanceDialogForDocument(this.$document, this.$data);
/* 23 */           return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super JunieAgreementConfirmation$showAcceptanceDialogForDocument$2> $completion) { return (Continuation<Unit>)new JunieAgreementConfirmation$showAcceptanceDialogForDocument$2(this.$document, this.$data, $completion); }
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((JunieAgreementConfirmation$showAcceptanceDialogForDocument$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*    */   @RequiresEdt
/*    */   private final void showAcceptanceDialogForDocument(EndUserAgreement.Document document, JunieAgreementUiData data) {
/* 29 */     logger.debug("Showing a short agreement dialog version");
/*    */     
/* 31 */     Intrinsics.checkNotNullExpressionValue(document.getName(), "getName(...)"); Version acceptedVersion = JunieAgreement.INSTANCE.getAcceptedPrivacyPolicyVersion(document.getName());
/* 32 */     boolean result = (Messages.showOkCancelDialog(
/* 33 */         data.getAcceptanceText(acceptedVersion), 
/* 34 */         data.getTitle(), 
/* 35 */         data.getAgreeButtonText(), 
/* 36 */         data.getDeclinedButtonText(), 
/* 37 */         Messages.getQuestionIcon()) == 0);
/*    */     
/* 39 */     if (result) {
/* 40 */       Intrinsics.checkNotNullExpressionValue(document.getName(), "getName(...)"); Intrinsics.checkNotNullExpressionValue(document.getVersion(), "getVersion(...)"); JunieAgreement.INSTANCE.setAcceptedPrivacyPolicyVersion(document.getName(), document.getVersion());
/*    */     } else {
/* 42 */       logger.info("AI agreement declined by user. Short version");
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object confirmAgreement(@NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/eula/JunieAgreementConfirmation$confirmAgreement$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/eula/JunieAgreementConfirmation$confirmAgreement$1
/*    */     //   11: astore #4
/*    */     //   13: aload #4
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #4
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/eula/JunieAgreementConfirmation$confirmAgreement$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_1
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/eula/JunieAgreementConfirmation;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #4
/*    */     //   50: aload #4
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore_3
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #5
/*    */     //   61: aload #4
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 200, 0 -> 88, 1 -> 158
/*    */     //   88: aload_3
/*    */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   92: getstatic com/intellij/ml/llm/matterhorn/ej/core/eula/JunieAgreement.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/eula/JunieAgreement;
/*    */     //   95: invokevirtual getLatestAgreement$ej_core : ()Lcom/intellij/ide/gdpr/EndUserAgreement$Document;
/*    */     //   98: astore_2
/*    */     //   99: getstatic com/intellij/ml/llm/matterhorn/ej/core/eula/JunieAgreement.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/eula/JunieAgreement;
/*    */     //   102: aload_2
/*    */     //   103: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   106: dup
/*    */     //   107: ldc 'getName(...)'
/*    */     //   109: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   112: invokevirtual getAcceptedPrivacyPolicyVersion : (Ljava/lang/String;)Lcom/intellij/ide/gdpr/Version;
/*    */     //   115: aload_2
/*    */     //   116: invokevirtual getVersion : ()Lcom/intellij/ide/gdpr/Version;
/*    */     //   119: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   122: ifeq -> 130
/*    */     //   125: iconst_1
/*    */     //   126: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   129: areturn
/*    */     //   130: aload_0
/*    */     //   131: aload_2
/*    */     //   132: aload #4
/*    */     //   134: aload #4
/*    */     //   136: aload_2
/*    */     //   137: putfield L$0 : Ljava/lang/Object;
/*    */     //   140: aload #4
/*    */     //   142: iconst_1
/*    */     //   143: putfield label : I
/*    */     //   146: invokespecial showAcceptanceDialogForDocument : (Lcom/intellij/ide/gdpr/EndUserAgreement$Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   149: dup
/*    */     //   150: aload #5
/*    */     //   152: if_acmpne -> 172
/*    */     //   155: aload #5
/*    */     //   157: areturn
/*    */     //   158: aload #4
/*    */     //   160: getfield L$0 : Ljava/lang/Object;
/*    */     //   163: checkcast com/intellij/ide/gdpr/EndUserAgreement$Document
/*    */     //   166: astore_2
/*    */     //   167: aload_3
/*    */     //   168: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   171: aload_3
/*    */     //   172: pop
/*    */     //   173: getstatic com/intellij/ml/llm/matterhorn/ej/core/eula/JunieAgreement.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/eula/JunieAgreement;
/*    */     //   176: aload_2
/*    */     //   177: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   180: dup
/*    */     //   181: ldc 'getName(...)'
/*    */     //   183: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   186: invokevirtual getAcceptedPrivacyPolicyVersion : (Ljava/lang/String;)Lcom/intellij/ide/gdpr/Version;
/*    */     //   189: aload_2
/*    */     //   190: invokevirtual getVersion : ()Lcom/intellij/ide/gdpr/Version;
/*    */     //   193: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   196: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   199: areturn
/*    */     //   200: new java/lang/IllegalStateException
/*    */     //   203: dup
/*    */     //   204: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   206: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   209: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #46	-> 59
/*    */     //   #47	-> 92
/*    */     //   #49	-> 99
/*    */     //   #50	-> 125
/*    */     //   #52	-> 130
/*    */     //   #46	-> 155
/*    */     //   #53	-> 172
/*    */     //   #46	-> 200
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   92	33	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/eula/JunieAgreementConfirmation;
/*    */     //   130	19	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/eula/JunieAgreementConfirmation;
/*    */     //   99	59	2	document	Lcom/intellij/ide/gdpr/EndUserAgreement$Document;
/*    */     //   167	33	2	document	Lcom/intellij/ide/gdpr/EndUserAgreement$Document;
/*    */     //   0	210	1	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	150	4	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	144	3	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Internal
/*    */   public void clearAgreement() {
/* 58 */     JunieAgreement.INSTANCE.dropAgreement();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\eula\JunieAgreementConfirmation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */