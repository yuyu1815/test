/*    */ package ai.grazie.utils;
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\020\013\n\000\n\002\020\b\n\000\n\002\030\002\n\002\020\016\n\000\032\016\020\000\032\0020\0012\006\020\002\032\0020\003\032\020\020\004\032\b\022\004\022\0020\0030\005*\0020\006¨\006\007"}, d2 = {"isCodePointIdeographic", "", "codePoint", "", "codePointsSequence", "Lkotlin/sequences/Sequence;", "", "utils-common"})
/*    */ public final class TextJVMKt {
/*    */   @NotNull
/*    */   public static final Sequence<Integer> codePointsSequence(@NotNull String $this$codePointsSequence) {
/*  6 */     Intrinsics.checkNotNullParameter($this$codePointsSequence, "<this>"); Intrinsics.checkNotNullExpressionValue($this$codePointsSequence.codePoints(), "codePoints()"); return StreamsKt.asSequence($this$codePointsSequence.codePoints());
/*    */   }
/*    */   
/*    */   public static final boolean isCodePointIdeographic(int codePoint) {
/* 10 */     return Character.isIdeographic(codePoint);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\TextJVMKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */