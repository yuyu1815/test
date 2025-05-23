/*    */ package com.intellij.ml.llm.matterhorn.helpers;
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\004\0321\020\000\032\0020\0012\006\020\002\032\0020\0012\b\020\003\032\004\030\0010\0042\b\020\005\032\004\030\0010\0042\b\020\006\032\004\030\0010\004¢\006\002\020\007¨\006\b"}, d2 = {"truncateLongOutput", "", "commandOutput", "maxLines", "", "maxLineLength", "saveLines", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;", "core"})
/*    */ public final class OutputHelperKt {
/*    */   @NotNull
/*    */   public static final String truncateLongOutput(@NotNull String commandOutput, @Nullable Integer maxLines, @Nullable Integer maxLineLength, @Nullable Integer saveLines) {
/*  6 */     Intrinsics.checkNotNullParameter(commandOutput, "commandOutput"); List lines = StringsKt.lines(commandOutput);
/*    */ 
/*    */ 
/*    */     
/* 10 */     int linesToTake = Math.min(lines.size() / 2, (saveLines != null) ? saveLines.intValue() : 10);
/* 11 */     int omittedLinesCount = lines.size() - linesToTake * 2;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 16 */     String fistSavedLines = CollectionsKt.joinToString$default(CollectionsKt.take(lines, linesToTake), "\n", null, null, 0, null, null, 62, null);
/* 17 */     String lastSavedLines = CollectionsKt.joinToString$default(CollectionsKt.takeLast(lines, linesToTake), "\n", null, null, 0, null, null, 62, null);
/* 18 */     String res = (maxLines != null && lines.size() > maxLines.intValue()) ? ((omittedLinesCount < 2) ? commandOutput : (fistSavedLines + "\n(" + fistSavedLines + " lines omitted)\n" + omittedLinesCount)) : 
/*    */ 
/*    */ 
/*    */       
/* 22 */       commandOutput;
/*    */     
/* 24 */     if (maxLineLength != null) {
/* 25 */       lines = StringsKt.lines(res);
/* 26 */       res = CollectionsKt.joinToString$default(lines, "\n", null, null, 0, null, maxLineLength::truncateLongOutput$lambda$0, 30, null);
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 34 */     return res;
/*    */   }
/*    */   
/*    */   private static final CharSequence truncateLongOutput$lambda$0(Integer $maxLineLength, String line) {
/*    */     Intrinsics.checkNotNullParameter(line, "line");
/*    */     return (line.length() > $maxLineLength.intValue()) ? (StringsKt.substring(line, RangesKt.until(0, $maxLineLength.intValue())) + " ...") : line;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\helpers\OutputHelperKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */