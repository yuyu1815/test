/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseId;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthData;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.GrazieResult;
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
/*    */ import kotlin.time.DurationKt;
/*    */ import kotlin.time.DurationUnit;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.TimeoutKt;
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
/*    */ @DebugMetadata(f = "grazieJbaAuthStep.kt", l = {64}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;"})
/*    */ final class GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1
/*    */   extends SuspendLambda
/*    */   implements Function1<Continuation<? super GrazieResult<? extends GrazieAuthData>>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1(String $aipLicenseId, String $apiUrl, String $jbaIdToken, Function1<Continuation<? super Unit>, Object> $onAuthRejected, Function1<Continuation<? super Unit>, Object> $onLicenseRejected, Function1<Continuation<? super Unit>, Object> $onAgreementRequired, Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 62 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 63 */         AipLicenseChoiceStepKt.getLog().info("aipLicenseChoiceOutcome-grazieJbaAuthStep:" + AipLicenseId.toString-impl(this.$aipLicenseId));
/* 64 */         this.label = 1; if (TimeoutKt.withTimeout-KLykuaI(DurationKt.toDuration(15, DurationUnit.SECONDS), new Function2<CoroutineScope, Continuation<? super GrazieResult<? extends GrazieAuthData>>, Object>(this.$apiUrl, this.$jbaIdToken, this.$aipLicenseId, this.$onAuthRejected, this.$onLicenseRejected, this.$onAgreementRequired, null) { Object L$0; int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*    */                 //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */                 //   3: astore #12
/*    */                 //   5: aload_0
/*    */                 //   6: getfield label : I
/*    */                 //   9: tableswitch default -> 193, 0 -> 36, 1 -> 73, 2 -> 164
/*    */                 //   36: aload_1
/*    */                 //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   40: aload_0
/*    */                 //   41: getfield $apiUrl : Ljava/lang/String;
/*    */                 //   44: aload_0
/*    */                 //   45: getfield $jbaIdToken : Ljava/lang/String;
/*    */                 //   48: aload_0
/*    */                 //   49: getfield $aipLicenseId : Ljava/lang/String;
/*    */                 //   52: aload_0
/*    */                 //   53: checkcast kotlin/coroutines/Continuation
/*    */                 //   56: aload_0
/*    */                 //   57: iconst_1
/*    */                 //   58: putfield label : I
/*    */                 //   61: invokestatic access$getAccess-SRYjgCQ : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */                 //   64: dup
/*    */                 //   65: aload #12
/*    */                 //   67: if_acmpne -> 78
/*    */                 //   70: aload #12
/*    */                 //   72: areturn
/*    */                 //   73: aload_1
/*    */                 //   74: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   77: aload_1
/*    */                 //   78: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*    */                 //   81: astore_2
/*    */                 //   82: aload_0
/*    */                 //   83: getfield $onAuthRejected : Lkotlin/jvm/functions/Function1;
/*    */                 //   86: astore_3
/*    */                 //   87: aload_0
/*    */                 //   88: getfield $onLicenseRejected : Lkotlin/jvm/functions/Function1;
/*    */                 //   91: astore #4
/*    */                 //   93: aload_0
/*    */                 //   94: getfield $onAgreementRequired : Lkotlin/jvm/functions/Function1;
/*    */                 //   97: astore #5
/*    */                 //   99: iconst_0
/*    */                 //   100: istore #6
/*    */                 //   102: aload_2
/*    */                 //   103: astore #7
/*    */                 //   105: aload #7
/*    */                 //   107: astore #8
/*    */                 //   109: iconst_0
/*    */                 //   110: istore #9
/*    */                 //   112: aload #8
/*    */                 //   114: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*    */                 //   117: ifeq -> 188
/*    */                 //   120: aload #8
/*    */                 //   122: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*    */                 //   125: astore #10
/*    */                 //   127: iconst_0
/*    */                 //   128: istore #11
/*    */                 //   130: aload_3
/*    */                 //   131: aload #4
/*    */                 //   133: aload #5
/*    */                 //   135: aload #10
/*    */                 //   137: invokevirtual getHttpError : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;
/*    */                 //   140: aload_0
/*    */                 //   141: aload_0
/*    */                 //   142: aload #7
/*    */                 //   144: putfield L$0 : Ljava/lang/Object;
/*    */                 //   147: aload_0
/*    */                 //   148: iconst_2
/*    */                 //   149: putfield label : I
/*    */                 //   152: invokestatic access$grazieJbaAuthStep_toclVnw$handleAuthFailure : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */                 //   155: dup
/*    */                 //   156: aload #12
/*    */                 //   158: if_acmpne -> 187
/*    */                 //   161: aload #12
/*    */                 //   163: areturn
/*    */                 //   164: iconst_0
/*    */                 //   165: istore #6
/*    */                 //   167: iconst_0
/*    */                 //   168: istore #9
/*    */                 //   170: iconst_0
/*    */                 //   171: istore #11
/*    */                 //   173: aload_0
/*    */                 //   174: getfield L$0 : Ljava/lang/Object;
/*    */                 //   177: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*    */                 //   180: astore #7
/*    */                 //   182: aload_1
/*    */                 //   183: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   186: aload_1
/*    */                 //   187: pop
/*    */                 //   188: nop
/*    */                 //   189: aload #7
/*    */                 //   191: nop
/*    */                 //   192: areturn
/*    */                 //   193: new java/lang/IllegalStateException
/*    */                 //   196: dup
/*    */                 //   197: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */                 //   199: invokespecial <init> : (Ljava/lang/String;)V
/*    */                 //   202: athrow
/*    */                 // Line number table:
/*    */                 //   Java source line number -> byte code offset
/*    */                 //   #64	-> 3
/*    */                 //   #65	-> 40
/*    */                 //   #64	-> 70
/*    */                 //   #66	-> 82
/*    */                 //   #190	-> 102
/*    */                 //   #191	-> 112
/*    */                 //   #66	-> 130
/*    */                 //   #64	-> 161
/*    */                 //   #66	-> 187
/*    */                 //   #191	-> 188
/*    */                 //   #192	-> 188
/*    */                 //   #190	-> 189
/*    */                 //   #192	-> 191
/*    */                 //   #66	-> 192
/*    */                 //   #64	-> 193
/*    */                 // Local variable table:
/*    */                 //   start	length	slot	name	descriptor
/*    */                 //   82	27	2	$this$onFailure$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*    */                 //   109	18	8	$this$onFailure_u24lambda_u240$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*    */                 //   127	28	10	it	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;
/*    */                 //   130	34	11	$i$a$-onFailure-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1$1$1	I
/*    */                 //   112	52	9	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
/*    */                 //   102	62	6	$i$f$onFailure	I
/*    */                 //   0	203	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1$1;
/*    */                 //   40	153	1	$result	Ljava/lang/Object;
/*    */                 //   173	15	11	$i$a$-onFailure-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1$1$1	I
/*    */                 //   170	19	9	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
/* 64 */                 //   167	25	6	$i$f$onFailure	I } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$apiUrl, this.$jbaIdToken, this.$aipLicenseId, this.$onAuthRejected, this.$onLicenseRejected, this.$onAgreementRequired, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object) return object;  return TimeoutKt.withTimeout-KLykuaI(DurationKt.toDuration(15, DurationUnit.SECONDS), new Function2<CoroutineScope, Continuation<? super GrazieResult<? extends GrazieAuthData>>, Object>(this.$apiUrl, this.$jbaIdToken, this.$aipLicenseId, this.$onAuthRejected, this.$onLicenseRejected, this.$onAgreementRequired, null) { Object L$0; int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*    */                 //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */                 //   3: astore #12
/*    */                 //   5: aload_0
/*    */                 //   6: getfield label : I
/*    */                 //   9: tableswitch default -> 193, 0 -> 36, 1 -> 73, 2 -> 164
/*    */                 //   36: aload_1
/*    */                 //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   40: aload_0
/*    */                 //   41: getfield $apiUrl : Ljava/lang/String;
/*    */                 //   44: aload_0
/*    */                 //   45: getfield $jbaIdToken : Ljava/lang/String;
/*    */                 //   48: aload_0
/*    */                 //   49: getfield $aipLicenseId : Ljava/lang/String;
/*    */                 //   52: aload_0
/*    */                 //   53: checkcast kotlin/coroutines/Continuation
/*    */                 //   56: aload_0
/*    */                 //   57: iconst_1
/*    */                 //   58: putfield label : I
/*    */                 //   61: invokestatic access$getAccess-SRYjgCQ : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */                 //   64: dup
/*    */                 //   65: aload #12
/*    */                 //   67: if_acmpne -> 78
/*    */                 //   70: aload #12
/*    */                 //   72: areturn
/*    */                 //   73: aload_1
/*    */                 //   74: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   77: aload_1
/*    */                 //   78: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*    */                 //   81: astore_2
/*    */                 //   82: aload_0
/*    */                 //   83: getfield $onAuthRejected : Lkotlin/jvm/functions/Function1;
/*    */                 //   86: astore_3
/*    */                 //   87: aload_0
/*    */                 //   88: getfield $onLicenseRejected : Lkotlin/jvm/functions/Function1;
/*    */                 //   91: astore #4
/*    */                 //   93: aload_0
/*    */                 //   94: getfield $onAgreementRequired : Lkotlin/jvm/functions/Function1;
/*    */                 //   97: astore #5
/*    */                 //   99: iconst_0
/*    */                 //   100: istore #6
/*    */                 //   102: aload_2
/*    */                 //   103: astore #7
/*    */                 //   105: aload #7
/*    */                 //   107: astore #8
/*    */                 //   109: iconst_0
/*    */                 //   110: istore #9
/*    */                 //   112: aload #8
/*    */                 //   114: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*    */                 //   117: ifeq -> 188
/*    */                 //   120: aload #8
/*    */                 //   122: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*    */                 //   125: astore #10
/*    */                 //   127: iconst_0
/*    */                 //   128: istore #11
/*    */                 //   130: aload_3
/*    */                 //   131: aload #4
/*    */                 //   133: aload #5
/*    */                 //   135: aload #10
/*    */                 //   137: invokevirtual getHttpError : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;
/*    */                 //   140: aload_0
/*    */                 //   141: aload_0
/*    */                 //   142: aload #7
/*    */                 //   144: putfield L$0 : Ljava/lang/Object;
/*    */                 //   147: aload_0
/*    */                 //   148: iconst_2
/*    */                 //   149: putfield label : I
/*    */                 //   152: invokestatic access$grazieJbaAuthStep_toclVnw$handleAuthFailure : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */                 //   155: dup
/*    */                 //   156: aload #12
/*    */                 //   158: if_acmpne -> 187
/*    */                 //   161: aload #12
/*    */                 //   163: areturn
/*    */                 //   164: iconst_0
/*    */                 //   165: istore #6
/*    */                 //   167: iconst_0
/*    */                 //   168: istore #9
/*    */                 //   170: iconst_0
/*    */                 //   171: istore #11
/*    */                 //   173: aload_0
/*    */                 //   174: getfield L$0 : Ljava/lang/Object;
/*    */                 //   177: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*    */                 //   180: astore #7
/*    */                 //   182: aload_1
/*    */                 //   183: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   186: aload_1
/*    */                 //   187: pop
/*    */                 //   188: nop
/*    */                 //   189: aload #7
/*    */                 //   191: nop
/*    */                 //   192: areturn
/*    */                 //   193: new java/lang/IllegalStateException
/*    */                 //   196: dup
/*    */                 //   197: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */                 //   199: invokespecial <init> : (Ljava/lang/String;)V
/*    */                 //   202: athrow
/*    */                 // Line number table:
/*    */                 //   Java source line number -> byte code offset
/*    */                 //   #64	-> 3
/*    */                 //   #65	-> 40
/*    */                 //   #64	-> 70
/*    */                 //   #66	-> 82
/*    */                 //   #190	-> 102
/*    */                 //   #191	-> 112
/*    */                 //   #66	-> 130
/*    */                 //   #64	-> 161
/*    */                 //   #66	-> 187
/*    */                 //   #191	-> 188
/*    */                 //   #192	-> 188
/*    */                 //   #190	-> 189
/*    */                 //   #192	-> 191
/*    */                 //   #66	-> 192
/*    */                 //   #64	-> 193
/*    */                 // Local variable table:
/*    */                 //   start	length	slot	name	descriptor
/*    */                 //   82	27	2	$this$onFailure$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*    */                 //   109	18	8	$this$onFailure_u24lambda_u240$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*    */                 //   127	28	10	it	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;
/*    */                 //   130	34	11	$i$a$-onFailure-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1$1$1	I
/*    */                 //   112	52	9	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
/*    */                 //   102	62	6	$i$f$onFailure	I
/*    */                 //   0	203	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1$1;
/*    */                 //   40	153	1	$result	Ljava/lang/Object;
/*    */                 //   173	15	11	$i$a$-onFailure-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1$1$1	I
/*    */                 //   170	19	9	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
/* 64 */                 //   167	25	6	$i$f$onFailure	I } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$apiUrl, this.$jbaIdToken, this.$aipLicenseId, this.$onAuthRejected, this.$onLicenseRejected, this.$onAgreementRequired, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this);
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Continuation<? super GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1> $completion) {
/*    */     return (Continuation<Unit>)new GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1(this.$aipLicenseId, this.$apiUrl, this.$jbaIdToken, this.$onAuthRejected, this.$onLicenseRejected, this.$onAgreementRequired, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(Continuation<?> p1) {
/*    */     return ((GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */