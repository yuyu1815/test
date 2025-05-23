/*   */ package org.jetbrains.jewel.foundation.code.highlighting;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J%\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¢\006\004\b\013\020\f¨\006\r"}, d2 = {"Lorg/jetbrains/jewel/foundation/code/highlighting/NoOpCodeHighlighter;", "Lorg/jetbrains/jewel/foundation/code/highlighting/CodeHighlighter;", "<init>", "()V", "highlight", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/ui/text/AnnotatedString;", "code", "", "mimeType", "Lorg/jetbrains/jewel/foundation/code/MimeType;", "highlight-C7ITchA", "(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "foundation"})
/*   */ @StabilityInferred(parameters = 1)
/*   */ public final class NoOpCodeHighlighter implements CodeHighlighter {
/*   */   @NotNull
/*   */   public Flow<AnnotatedString> highlight-C7ITchA(@NotNull String code, @NotNull String mimeType) {
/* 9 */     Intrinsics.checkNotNullParameter(code, "code"); Intrinsics.checkNotNullParameter(mimeType, "mimeType"); return FlowKt.flowOf(new AnnotatedString(code, null, null, 6, null));
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public static final NoOpCodeHighlighter INSTANCE = new NoOpCodeHighlighter();
/*   */   public static final int $stable;
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\code\highlighting\NoOpCodeHighlighter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */