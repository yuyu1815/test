/*    */ package ai.grazie.ner.blocking;
/*    */ 
/*    */ import ai.grazie.ner.model.SentenceWithNERAnnotations;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/ner/blocking/BlockingNERAnnotationService$Companion$empty$1", "Lai/grazie/ner/blocking/BlockingNERAnnotationService;", "annotate", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "sentences", "", "model-ner"})
/*    */ @SourceDebugExtension({"SMAP\nBlockingNERAnnotationService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockingNERAnnotationService.kt\nai/grazie/ner/blocking/BlockingNERAnnotationService$Companion$empty$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1557#2:38\n1628#2,3:39\n*S KotlinDebug\n*F\n+ 1 BlockingNERAnnotationService.kt\nai/grazie/ner/blocking/BlockingNERAnnotationService$Companion$empty$1\n*L\n23#1:38\n23#1:39,3\n*E\n"})
/*    */ public final class BlockingNERAnnotationService$Companion$empty$1
/*    */   implements BlockingNERAnnotationService
/*    */ {
/*    */   public List<SentenceWithNERAnnotations> annotate(List sentences) {
/* 23 */     Intrinsics.checkNotNullParameter(sentences, "sentences"); Iterable $this$map$iv = sentences; int $i$f$map = 0;
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
/* 38 */     Iterable iterable1 = $this$map$iv; Collection<SentenceWithNERAnnotations> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 39 */     for (Object item$iv$iv : iterable1) {
/* 40 */       String str = (String)item$iv$iv; Collection<SentenceWithNERAnnotations> collection = destination$iv$iv; int $i$a$-map-BlockingNERAnnotationService$Companion$empty$1$annotate$1 = 0; collection.add(new SentenceWithNERAnnotations(str, new SentenceWithNERAnnotations.Annotation[0]));
/* 41 */     }  return (List<SentenceWithNERAnnotations>)destination$iv$iv;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ner-jvm-0.4.32.jar!\ai\grazie\ner\blocking\BlockingNERAnnotationService$Companion$empty$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */