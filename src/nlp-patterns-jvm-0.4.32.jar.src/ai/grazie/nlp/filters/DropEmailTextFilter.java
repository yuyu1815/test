/*    */ package ai.grazie.nlp.filters;
/*    */ import ai.grazie.nlp.patterns.standard.LikelyPatterns;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\016\n\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"Lai/grazie/nlp/filters/DropEmailTextFilter;", "Lai/grazie/nlp/filters/TextFilter;", "()V", "shouldRetain", "", "text", "", "nlp-patterns"})
/*    */ public final class DropEmailTextFilter implements TextFilter {
/*    */   public boolean shouldRetain(@NotNull String text) {
/* 10 */     Intrinsics.checkNotNullParameter(text, "text"); return !LikelyPatterns.IsEmail.contains(text);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\filters\DropEmailTextFilter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */