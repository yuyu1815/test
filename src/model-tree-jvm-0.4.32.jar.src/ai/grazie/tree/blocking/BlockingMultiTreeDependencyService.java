/*    */ package ai.grazie.tree.blocking;
/*    */ 
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import ai.grazie.tree.model.SentenceWithTreeDependencies;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\020 \n\002\b\002\bf\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026J$\020\002\032\b\022\004\022\0020\0030\b2\006\020\004\032\0020\0052\f\020\t\032\b\022\004\022\0020\0070\bH&ø\001\000\002\006\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Lai/grazie/tree/blocking/BlockingMultiTreeDependencyService;", "", "parse", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "language", "Lai/grazie/nlp/langs/Language;", "sentence", "", "", "sentences", "model-tree"})
/*    */ public interface BlockingMultiTreeDependencyService
/*    */ {
/*    */   @NotNull
/*    */   default SentenceWithTreeDependencies parse(@NotNull Language language, @NotNull String sentence) {
/* 16 */     Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(sentence, "sentence"); return (SentenceWithTreeDependencies)CollectionsKt.single(parse(language, CollectionsKt.listOf(sentence)));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   List<SentenceWithTreeDependencies> parse(@NotNull Language paramLanguage, @NotNull List<String> paramList);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-tree-jvm-0.4.32.jar!\ai\grazie\tree\blocking\BlockingMultiTreeDependencyService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */