/*    */ package ai.grazie.tree.blocking;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\020 \n\002\b\003\bf\030\000 \b2\0020\001:\001\bJ\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\034\020\002\032\b\022\004\022\0020\0030\0062\f\020\007\032\b\022\004\022\0020\0050\006H&ø\001\000\002\006\n\004\b!0\001¨\006\tÀ\006\001"}, d2 = {"Lai/grazie/tree/blocking/BlockingTreeDependencyService;", "", "parse", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "sentence", "", "", "sentences", "Companion", "model-tree"})
/*    */ public interface BlockingTreeDependencyService {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @NotNull
/* 12 */   default SentenceWithTreeDependencies parse(@NotNull String sentence) { Intrinsics.checkNotNullParameter(sentence, "sentence"); return (SentenceWithTreeDependencies)CollectionsKt.single(parse(CollectionsKt.listOf(sentence))); } @NotNull
/*    */   List<SentenceWithTreeDependencies> parse(@NotNull List<String> paramList); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\026\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b¨\006\t"}, d2 = {"Lai/grazie/tree/blocking/BlockingTreeDependencyService$Companion;", "", "()V", "of", "Lai/grazie/tree/blocking/BlockingTreeDependencyService;", "language", "Lai/grazie/nlp/langs/Language;", "multi", "Lai/grazie/tree/blocking/BlockingMultiTreeDependencyService;", "model-tree"})
/*    */   public static final class Companion { @NotNull
/*    */     public final BlockingTreeDependencyService of(@NotNull Language language, @NotNull BlockingMultiTreeDependencyService multi) {
/* 16 */       Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(multi, "multi"); return new BlockingTreeDependencyService$Companion$of$1(multi, language); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/tree/blocking/BlockingTreeDependencyService$Companion$of$1", "Lai/grazie/tree/blocking/BlockingTreeDependencyService;", "parse", "", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "sentences", "", "model-tree"})
/*    */     public static final class BlockingTreeDependencyService$Companion$of$1 implements BlockingTreeDependencyService { BlockingTreeDependencyService$Companion$of$1(BlockingMultiTreeDependencyService $multi, Language $language) {} public List<SentenceWithTreeDependencies> parse(List<String> sentences) {
/* 18 */         Intrinsics.checkNotNullParameter(sentences, "sentences"); return this.$multi.parse(this.$language, sentences);
/*    */       } }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-tree-jvm-0.4.32.jar!\ai\grazie\tree\blocking\BlockingTreeDependencyService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */