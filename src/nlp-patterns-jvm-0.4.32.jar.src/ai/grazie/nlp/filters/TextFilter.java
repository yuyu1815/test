/*   */ package ai.grazie.nlp.filters;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002\bf\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H&ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Lai/grazie/nlp/filters/TextFilter;", "", "shouldDrop", "", "text", "", "shouldRetain", "nlp-patterns"})
/*   */ public interface TextFilter {
/*   */   default boolean shouldDrop(@NotNull String text) {
/* 7 */     Intrinsics.checkNotNullParameter(text, "text"); return !shouldRetain(text);
/*   */   }
/*   */   
/*   */   boolean shouldRetain(@NotNull String paramString);
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\filters\TextFilter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */