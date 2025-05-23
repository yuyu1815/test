/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieApiUrl;
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
/*    */ @DebugMetadata(f = "grazieCloudUrlStep.kt", l = {46}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.GrazieCloudUrlStepKt$grazieCloudUrlStep$resolveUrlCallable$1$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieApiUrl;"})
/*    */ final class GrazieCloudUrlStepKt$grazieCloudUrlStep$resolveUrlCallable$1$1
/*    */   extends SuspendLambda
/*    */   implements Function1<Continuation<? super GrazieResult<? extends GrazieApiUrl>>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   GrazieCloudUrlStepKt$grazieCloudUrlStep$resolveUrlCallable$1$1(String $configJsonRawUrl, Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 45 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 46 */         this.label = 1; if (TimeoutKt.withTimeout-KLykuaI(DurationKt.toDuration(20, DurationUnit.SECONDS), new Function2<CoroutineScope, Continuation<? super GrazieResult<? extends GrazieApiUrl>>, Object>(this.$configJsonRawUrl, null) { int label; public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 47 */                     this.label = 1; if (GrazieCloudUrlStepKt.access$resolveApiUrl(this.$configJsonRawUrl, (Continuation)this) == object) return object;  return GrazieCloudUrlStepKt.access$resolveApiUrl(this.$configJsonRawUrl, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (GrazieCloudUrlStepKt.access$resolveApiUrl(this.$configJsonRawUrl, (Continuation)this) == object) return object;  return GrazieCloudUrlStepKt.access$resolveApiUrl(this.$configJsonRawUrl, (Continuation)this);
/*    */                   case 1:
/*    */                     ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                     return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */                 
/*    */                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */               
/*    */               public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */                 return (Continuation)new Function2<>(this.$configJsonRawUrl, $completion);
/*    */               }
/*    */               
/*    */               public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */               } }
/*    */             (Continuation)this) == object)
/*    */           return object; 
/*    */         return TimeoutKt.withTimeout-KLykuaI(DurationKt.toDuration(20, DurationUnit.SECONDS), new Function2<CoroutineScope, Continuation<? super GrazieResult<? extends GrazieApiUrl>>, Object>(this.$configJsonRawUrl, null) {
/*    */               int label;
/*    */               
/*    */               public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */                 return (Continuation)new Function2<>(this.$configJsonRawUrl, $completion);
/*    */               }
/*    */               
/*    */               public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */               }
/*    */             }(Continuation)this);
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Continuation<? super GrazieCloudUrlStepKt$grazieCloudUrlStep$resolveUrlCallable$1$1> $completion) {
/*    */     return (Continuation<Unit>)new GrazieCloudUrlStepKt$grazieCloudUrlStep$resolveUrlCallable$1$1(this.$configJsonRawUrl, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(Continuation<?> p1) {
/*    */     return ((GrazieCloudUrlStepKt$grazieCloudUrlStep$resolveUrlCallable$1$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\GrazieCloudUrlStepKt$grazieCloudUrlStep$resolveUrlCallable$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */