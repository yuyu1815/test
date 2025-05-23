/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.scraper;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\002\b\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\007\032\0020\b2\006\020\t\032\0020\nH\026J\b\020\013\032\0020\fH\026J\b\020\r\032\0020\nH\026R\022\020\004\032\0060\005j\002`\006X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/SimpleStringCollector;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/StringCollector;", "<init>", "()V", "output", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "write", "", "text", "", "length", "", "buildText", "ej-core"})
/*    */ public final class SimpleStringCollector implements StringCollector {
/*  7 */   public void newline() { StringCollector.DefaultImpls.newline(this); } @NotNull
/*  8 */   private final StringBuilder output = new StringBuilder();
/*    */   
/*    */   public void write(@NotNull String text) {
/* 11 */     Intrinsics.checkNotNullParameter(text, "text"); this.output.append(text);
/*    */   }
/*    */   
/*    */   public int length() {
/* 15 */     return this.output.length();
/*    */   }
/*    */   @NotNull
/*    */   public String buildText() {
/* 19 */     Intrinsics.checkNotNullExpressionValue(this.output.toString(), "toString(...)"); return this.output.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\scraper\SimpleStringCollector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */