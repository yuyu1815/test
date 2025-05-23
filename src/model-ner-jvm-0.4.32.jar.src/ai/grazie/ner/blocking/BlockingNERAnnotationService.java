/*    */ package ai.grazie.ner.blocking;
/*    */ import ai.grazie.ner.model.SentenceWithNERAnnotations;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\020 \n\002\b\004\bf\030\000 \t2\0020\001:\001\tJ\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\034\020\002\032\b\022\004\022\0020\0030\0062\f\020\007\032\b\022\004\022\0020\0050\006H&J\020\020\b\032\0020\0032\006\020\004\032\0020\003H\026J\034\020\b\032\b\022\004\022\0020\0030\0062\f\020\007\032\b\022\004\022\0020\0030\006H\026ø\001\000\002\006\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Lai/grazie/ner/blocking/BlockingNERAnnotationService;", "", "annotate", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "sentence", "", "", "sentences", "reannotate", "Companion", "model-ner"})
/*    */ @SourceDebugExtension({"SMAP\nBlockingNERAnnotationService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockingNERAnnotationService.kt\nai/grazie/ner/blocking/BlockingNERAnnotationService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1557#2:38\n1628#2,3:39\n*S KotlinDebug\n*F\n+ 1 BlockingNERAnnotationService.kt\nai/grazie/ner/blocking/BlockingNERAnnotationService\n*L\n10#1:38\n10#1:39,3\n*E\n"})
/*    */ public interface BlockingNERAnnotationService { @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE; @NotNull
/*    */   List<SentenceWithNERAnnotations> annotate(@NotNull List<String> paramList); @NotNull
/*    */   default SentenceWithNERAnnotations annotate(@NotNull String sentence) { Intrinsics.checkNotNullParameter(sentence, "sentence");
/*    */     return (SentenceWithNERAnnotations)CollectionsKt.single(annotate(CollectionsKt.listOf(sentence))); } @NotNull
/* 10 */   default List<SentenceWithNERAnnotations> reannotate(@NotNull List sentences) { Intrinsics.checkNotNullParameter(sentences, "sentences"); Iterable $this$map$iv = sentences; int $i$f$map = 0;
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
/* 38 */     Iterable iterable1 = $this$map$iv; Collection<SentenceWithNERAnnotations> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 39 */     for (Object item$iv$iv : iterable1) {
/* 40 */       SentenceWithNERAnnotations sentenceWithNERAnnotations = (SentenceWithNERAnnotations)item$iv$iv; Collection<SentenceWithNERAnnotations> collection = destination$iv$iv; int $i$a$-map-BlockingNERAnnotationService$reannotate$1 = 0; collection.add(new SentenceWithNERAnnotations(sentenceWithNERAnnotations.getText(), (SentenceWithNERAnnotations.Annotation[])ArraysKt.plus((Object[])annotate(sentenceWithNERAnnotations.getText()).getAnnotations(), (Object[])sentenceWithNERAnnotations.getAnnotations())));
/* 41 */     }  return (List<SentenceWithNERAnnotations>)destination$iv$iv; } @NotNull default SentenceWithNERAnnotations reannotate(@NotNull SentenceWithNERAnnotations sentence) { Intrinsics.checkNotNullParameter(sentence, "sentence"); return new SentenceWithNERAnnotations(sentence.getText(), (SentenceWithNERAnnotations.Annotation[])ArraysKt.plus((Object[])sentence.getAnnotations(), (Object[])annotate(sentence.getText()).getAnnotations())); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\030\020\007\032\0020\0042\006\020\b\032\0020\t2\006\020\n\032\0020\013H\007R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\f"}, d2 = {"Lai/grazie/ner/blocking/BlockingNERAnnotationService$Companion;", "", "()V", "empty", "Lai/grazie/ner/blocking/BlockingNERAnnotationService;", "getEmpty", "()Lai/grazie/ner/blocking/BlockingNERAnnotationService;", "of", "service", "Lai/grazie/ner/blocking/BlockingMultiNERAnnotationService;", "language", "Lai/grazie/nlp/langs/Language;", "model-ner"}) public static final class Companion { @NotNull private static final BlockingNERAnnotationService empty = new BlockingNERAnnotationService$Companion$empty$1(); @NotNull public final BlockingNERAnnotationService getEmpty() { return empty; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/ner/blocking/BlockingNERAnnotationService$Companion$empty$1", "Lai/grazie/ner/blocking/BlockingNERAnnotationService;", "annotate", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "sentences", "", "model-ner"}) @SourceDebugExtension({"SMAP\nBlockingNERAnnotationService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockingNERAnnotationService.kt\nai/grazie/ner/blocking/BlockingNERAnnotationService$Companion$empty$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1557#2:38\n1628#2,3:39\n*S KotlinDebug\n*F\n+ 1 BlockingNERAnnotationService.kt\nai/grazie/ner/blocking/BlockingNERAnnotationService$Companion$empty$1\n*L\n23#1:38\n23#1:39,3\n*E\n"}) public static final class BlockingNERAnnotationService$Companion$empty$1 implements BlockingNERAnnotationService { public List<SentenceWithNERAnnotations> annotate(List sentences) { Intrinsics.checkNotNullParameter(sentences, "sentences"); Iterable $this$map$iv = sentences; int $i$f$map = 0; Iterable iterable1 = $this$map$iv; Collection<SentenceWithNERAnnotations> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0; for (Object item$iv$iv : iterable1) { String str = (String)item$iv$iv; Collection<SentenceWithNERAnnotations> collection = destination$iv$iv; int $i$a$-map-BlockingNERAnnotationService$Companion$empty$1$annotate$1 = 0; collection.add(new SentenceWithNERAnnotations(str, new SentenceWithNERAnnotations.Annotation[0])); }  return (List<SentenceWithNERAnnotations>)destination$iv$iv; }
/*    */        }
/*    */ 
/*    */     
/*    */     @JvmStatic
/*    */     @NotNull
/*    */     public final BlockingNERAnnotationService of(@NotNull BlockingMultiNERAnnotationService service, @NotNull Language language) {
/*    */       Intrinsics.checkNotNullParameter(service, "service");
/*    */       Intrinsics.checkNotNullParameter(language, "language");
/*    */       return new BlockingNERAnnotationService$Companion$of$1(service, language);
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/ner/blocking/BlockingNERAnnotationService$Companion$of$1", "Lai/grazie/ner/blocking/BlockingNERAnnotationService;", "annotate", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "sentences", "", "model-ner"})
/*    */     public static final class BlockingNERAnnotationService$Companion$of$1 implements BlockingNERAnnotationService {
/*    */       BlockingNERAnnotationService$Companion$of$1(BlockingMultiNERAnnotationService $service, Language $language) {}
/*    */       
/*    */       public List<SentenceWithNERAnnotations> annotate(List<String> sentences) {
/*    */         Intrinsics.checkNotNullParameter(sentences, "sentences");
/*    */         return this.$service.annotate(this.$language, sentences);
/*    */       }
/*    */     } }
/*    */ 
/*    */   
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   static BlockingNERAnnotationService of(@NotNull BlockingMultiNERAnnotationService service, @NotNull Language language) {
/*    */     return Companion.of(service, language);
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ner-jvm-0.4.32.jar!\ai\grazie\ner\blocking\BlockingNERAnnotationService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */