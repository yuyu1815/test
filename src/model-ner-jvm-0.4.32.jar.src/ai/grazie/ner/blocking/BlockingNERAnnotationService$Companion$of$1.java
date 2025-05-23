/*    */ package ai.grazie.ner.blocking;
/*    */ 
/*    */ import ai.grazie.ner.model.SentenceWithNERAnnotations;
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/ner/blocking/BlockingNERAnnotationService$Companion$of$1", "Lai/grazie/ner/blocking/BlockingNERAnnotationService;", "annotate", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "sentences", "", "model-ner"})
/*    */ public final class BlockingNERAnnotationService$Companion$of$1
/*    */   implements BlockingNERAnnotationService
/*    */ {
/*    */   BlockingNERAnnotationService$Companion$of$1(BlockingMultiNERAnnotationService $service, Language $language) {}
/*    */   
/*    */   public List<SentenceWithNERAnnotations> annotate(List<String> sentences) {
/* 31 */     Intrinsics.checkNotNullParameter(sentences, "sentences"); return this.$service.annotate(this.$language, sentences);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ner-jvm-0.4.32.jar!\ai\grazie\ner\blocking\BlockingNERAnnotationService$Companion$of$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */