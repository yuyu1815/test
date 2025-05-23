/*    */ package ai.grazie.nlc;
/*    */ import ai.grazie.nlp.utils.WhiteSpacesKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\n\020\007\032\0020\006*\0020\006¨\006\b"}, d2 = {"Lai/grazie/nlc/CompletionTextSplitter;", "", "()V", "split", "Lai/grazie/nlc/CompletionTextSplit;", "text", "", "dropPrefix", "model-nlc"})
/*    */ public final class CompletionTextSplitter {
/*    */   @NotNull
/*    */   public final CompletionTextSplit split(@NotNull String text) {
/* 10 */     Intrinsics.checkNotNullParameter(text, "text"); if ((((CharSequence)text).length() == 0)) return CompletionTextSplit.Companion.getEmpty();
/*    */     
/* 12 */     if (CharsKt.isWhitespace(StringsKt.last(text))) {
/* 13 */       return new CompletionTextSplit(WhiteSpacesKt.dropLastWhitespaces(text), WhiteSpacesKt.takeLastWhitespaces(text));
/*    */     }
/*    */     
/* 16 */     String context = dropPrefix(text);
/*    */     
/* 18 */     return new CompletionTextSplit(
/* 19 */         context, 
/* 20 */         StringsKt.drop(text, context.length()));
/*    */   } @NotNull
/*    */   public static final CompletionTextSplitter INSTANCE = new CompletionTextSplitter(); @NotNull
/*    */   public final String dropPrefix(@NotNull String $this$dropPrefix) {
/* 24 */     Intrinsics.checkNotNullParameter($this$dropPrefix, "<this>"); return WhiteSpacesKt.dropLastWhitespaces(WhiteSpacesKt.dropLastNonWhitespaces($this$dropPrefix));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-nlc-jvm-0.4.32.jar!\ai\grazie\nlc\CompletionTextSplitter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */