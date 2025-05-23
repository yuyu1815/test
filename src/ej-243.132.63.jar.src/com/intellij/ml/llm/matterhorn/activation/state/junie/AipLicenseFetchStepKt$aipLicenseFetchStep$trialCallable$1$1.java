/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ 
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicense;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseProductType;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseResult;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseRepository;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ 
/*    */ @DebugMetadata(f = "aipLicenseFetchStep.kt", l = {97, 100}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\030\002\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;"})
/*    */ @SourceDebugExtension({"SMAP\naipLicenseFetchStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 aipLicenseFetchStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1\n+ 2 AipLicenseResultMapper.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseResultMapperKt\n*L\n1#1,147:1\n23#2,3:148\n27#2,3:151\n*S KotlinDebug\n*F\n+ 1 aipLicenseFetchStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1\n*L\n100#1:148,3\n101#1:151,3\n*E\n"})
/*    */ final class AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1 extends SuspendLambda implements Function1<Continuation<? super AipLicenseResult>, Object> {
/*    */   Object L$0;
/*    */   int label;
/*    */   
/*    */   AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1(AipLicenseProductType $productType, Function1<Continuation<? super Unit>, Object> $onAuthRejected, MutableState<List<AipLicense>> $latestTrialLicensesToAppendToResultList$delegate, Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore #10
/*    */     //   5: aload_0
/*    */     //   6: getfield label : I
/*    */     //   9: tableswitch default -> 220, 0 -> 36, 1 -> 76, 2 -> 141
/*    */     //   36: aload_1
/*    */     //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   40: new com/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1$1
/*    */     //   43: dup
/*    */     //   44: aload_0
/*    */     //   45: getfield $productType : Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*    */     //   48: aconst_null
/*    */     //   49: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;Lkotlin/coroutines/Continuation;)V
/*    */     //   52: checkcast kotlin/jvm/functions/Function2
/*    */     //   55: aload_0
/*    */     //   56: checkcast kotlin/coroutines/Continuation
/*    */     //   59: aload_0
/*    */     //   60: iconst_1
/*    */     //   61: putfield label : I
/*    */     //   64: invokestatic access$performLicenseRequestWithTimeout : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   67: dup
/*    */     //   68: aload #10
/*    */     //   70: if_acmpne -> 81
/*    */     //   73: aload #10
/*    */     //   75: areturn
/*    */     //   76: aload_1
/*    */     //   77: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   80: aload_1
/*    */     //   81: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult
/*    */     //   84: astore_2
/*    */     //   85: aload_0
/*    */     //   86: getfield $onAuthRejected : Lkotlin/jvm/functions/Function1;
/*    */     //   89: astore_3
/*    */     //   90: iconst_0
/*    */     //   91: istore #4
/*    */     //   93: aload_2
/*    */     //   94: astore #5
/*    */     //   96: aload #5
/*    */     //   98: astore #6
/*    */     //   100: iconst_0
/*    */     //   101: istore #7
/*    */     //   103: aload #6
/*    */     //   105: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$AuthRequired
/*    */     //   108: ifeq -> 165
/*    */     //   111: iconst_0
/*    */     //   112: istore #8
/*    */     //   114: aload_3
/*    */     //   115: aload_0
/*    */     //   116: aload_0
/*    */     //   117: aload #5
/*    */     //   119: putfield L$0 : Ljava/lang/Object;
/*    */     //   122: aload_0
/*    */     //   123: iconst_2
/*    */     //   124: putfield label : I
/*    */     //   127: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   132: dup
/*    */     //   133: aload #10
/*    */     //   135: if_acmpne -> 164
/*    */     //   138: aload #10
/*    */     //   140: areturn
/*    */     //   141: iconst_0
/*    */     //   142: istore #4
/*    */     //   144: iconst_0
/*    */     //   145: istore #7
/*    */     //   147: iconst_0
/*    */     //   148: istore #8
/*    */     //   150: aload_0
/*    */     //   151: getfield L$0 : Ljava/lang/Object;
/*    */     //   154: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult
/*    */     //   157: astore #5
/*    */     //   159: aload_1
/*    */     //   160: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   163: aload_1
/*    */     //   164: pop
/*    */     //   165: nop
/*    */     //   166: aload #5
/*    */     //   168: nop
/*    */     //   169: astore_2
/*    */     //   170: aload_0
/*    */     //   171: getfield $latestTrialLicensesToAppendToResultList$delegate : Landroidx/compose/runtime/MutableState;
/*    */     //   174: astore_3
/*    */     //   175: iconst_0
/*    */     //   176: istore #4
/*    */     //   178: aload_2
/*    */     //   179: astore #5
/*    */     //   181: aload #5
/*    */     //   183: astore #6
/*    */     //   185: iconst_0
/*    */     //   186: istore #7
/*    */     //   188: aload #6
/*    */     //   190: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult$Success
/*    */     //   193: ifeq -> 215
/*    */     //   196: aload #6
/*    */     //   198: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult$Success
/*    */     //   201: invokevirtual getLicenses : ()Ljava/util/List;
/*    */     //   204: astore #8
/*    */     //   206: iconst_0
/*    */     //   207: istore #9
/*    */     //   209: aload_3
/*    */     //   210: aload #8
/*    */     //   212: invokestatic access$aipLicenseFetchStep$lambda$11 : (Landroidx/compose/runtime/MutableState;Ljava/util/List;)V
/*    */     //   215: nop
/*    */     //   216: aload #5
/*    */     //   218: nop
/*    */     //   219: areturn
/*    */     //   220: new java/lang/IllegalStateException
/*    */     //   223: dup
/*    */     //   224: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   226: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   229: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #96	-> 3
/*    */     //   #97	-> 40
/*    */     //   #96	-> 73
/*    */     //   #100	-> 85
/*    */     //   #148	-> 93
/*    */     //   #149	-> 103
/*    */     //   #100	-> 114
/*    */     //   #96	-> 138
/*    */     //   #100	-> 164
/*    */     //   #149	-> 165
/*    */     //   #150	-> 165
/*    */     //   #148	-> 166
/*    */     //   #150	-> 168
/*    */     //   #101	-> 170
/*    */     //   #151	-> 178
/*    */     //   #152	-> 188
/*    */     //   #101	-> 209
/*    */     //   #152	-> 215
/*    */     //   #153	-> 215
/*    */     //   #151	-> 216
/*    */     //   #153	-> 218
/*    */     //   #101	-> 219
/*    */     //   #96	-> 220
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   85	15	2	$this$onAuthRequired$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;
/*    */     //   170	15	2	$this$onSuccess$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;
/*    */     //   100	11	6	$this$onAuthRequired_u24lambda_u240$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;
/*    */     //   185	21	6	$this$onSuccess_u24lambda_u241$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;
/*    */     //   206	9	8	licenses	Ljava/util/List;
/*    */     //   114	27	8	$i$a$-onAuthRequired-AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1$2	I
/*    */     //   103	38	7	$i$a$-apply-AipLicenseResultMapperKt$onAuthRequired$1$iv	I
/*    */     //   93	48	4	$i$f$onAuthRequired	I
/*    */     //   209	6	9	$i$a$-onSuccess-AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1$3	I
/*    */     //   188	28	7	$i$a$-apply-AipLicenseResultMapperKt$onSuccess$1$iv	I
/*    */     //   178	41	4	$i$f$onSuccess	I
/*    */     //   0	230	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1;
/*    */     //   40	180	1	$result	Ljava/lang/Object;
/*    */     //   150	15	8	$i$a$-onAuthRequired-AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1$2	I
/*    */     //   147	19	7	$i$a$-apply-AipLicenseResultMapperKt$onAuthRequired$1$iv	I
/*    */     //   144	25	4	$i$f$onAuthRequired	I
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Continuation<? super AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1> $completion) {
/*    */     return (Continuation<Unit>)new AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1(this.$productType, this.$onAuthRejected, this.$latestTrialLicensesToAppendToResultList$delegate, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(Continuation<?> p1) {
/*    */     return ((AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */