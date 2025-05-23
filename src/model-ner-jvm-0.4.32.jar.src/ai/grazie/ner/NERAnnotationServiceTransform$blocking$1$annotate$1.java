/*    */ package ai.grazie.ner;
/*    */ 
/*    */ import ai.grazie.ner.model.SentenceWithNERAnnotations;
/*    */ import ai.grazie.ner.suspendable.SuspendableMultiNERAnnotationService;
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ @DebugMetadata(f = "NERAnnotationServiceTransform.kt", l = {24}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.ner.NERAnnotationServiceTransform$blocking$1$annotate$1")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class NERAnnotationServiceTransform$blocking$1$annotate$1
/*    */   extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SentenceWithNERAnnotations>>, Object> {
/*    */   int label;
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 24 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$service.annotate(this.$language, this.$sentences, (Continuation)this) == object) ? object : this.$service.annotate(this.$language, this.$sentences, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   NERAnnotationServiceTransform$blocking$1$annotate$1(SuspendableMultiNERAnnotationService $service, Language $language, List<String> $sentences, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super NERAnnotationServiceTransform$blocking$1$annotate$1> $completion) {
/*    */     return (Continuation<Unit>)new NERAnnotationServiceTransform$blocking$1$annotate$1(this.$service, this.$language, this.$sentences, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((NERAnnotationServiceTransform$blocking$1$annotate$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ner-jvm-0.4.32.jar!\ai\grazie\ner\NERAnnotationServiceTransform$blocking$1$annotate$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */