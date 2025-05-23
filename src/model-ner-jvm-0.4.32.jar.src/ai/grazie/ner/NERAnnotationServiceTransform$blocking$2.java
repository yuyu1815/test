/*    */ package ai.grazie.ner;
/*    */ 
/*    */ import ai.grazie.ner.blocking.BlockingNERAnnotationService;
/*    */ import ai.grazie.ner.model.SentenceWithNERAnnotations;
/*    */ import ai.grazie.ner.suspendable.SuspendableNERAnnotationService;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/ner/NERAnnotationServiceTransform$blocking$2", "Lai/grazie/ner/blocking/BlockingNERAnnotationService;", "annotate", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "sentences", "", "model-ner"})
/*    */ public final class NERAnnotationServiceTransform$blocking$2
/*    */   implements BlockingNERAnnotationService
/*    */ {
/*    */   NERAnnotationServiceTransform$blocking$2(CoroutineContext $context, SuspendableNERAnnotationService $service) {}
/*    */   
/*    */   public List<SentenceWithNERAnnotations> annotate(List<String> sentences) {
/* 38 */     Intrinsics.checkNotNullParameter(sentences, "sentences"); return (List<SentenceWithNERAnnotations>)BuildersKt.runBlocking(this.$context, new NERAnnotationServiceTransform$blocking$2$annotate$1(this.$service, sentences, null)); } @DebugMetadata(f = "NERAnnotationServiceTransform.kt", l = {38}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.ner.NERAnnotationServiceTransform$blocking$2$annotate$1") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "Lkotlinx/coroutines/CoroutineScope;"}) static final class NERAnnotationServiceTransform$blocking$2$annotate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SentenceWithNERAnnotations>>, Object> { public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$service.annotate(this.$sentences, (Continuation)this) == object) ? object : this.$service.annotate(this.$sentences, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     int label;
/*    */     
/*    */     NERAnnotationServiceTransform$blocking$2$annotate$1(SuspendableNERAnnotationService $service, List<String> $sentences, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super NERAnnotationServiceTransform$blocking$2$annotate$1> $completion) {
/*    */       return (Continuation<Unit>)new NERAnnotationServiceTransform$blocking$2$annotate$1(this.$service, this.$sentences, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((NERAnnotationServiceTransform$blocking$2$annotate$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ner-jvm-0.4.32.jar!\ai\grazie\ner\NERAnnotationServiceTransform$blocking$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */