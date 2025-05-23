/*   */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.scraper;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\002\n\002\b\003\n\002\020\b\n\000\b`\030\0002\0020\001J\b\020\002\032\0020\003H&J\020\020\004\032\0020\0052\006\020\006\032\0020\003H&J\b\020\007\032\0020\005H\026J\b\020\b\032\0020\tH&¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/StringCollector;", "", "buildText", "", "write", "", "text", "newline", "length", "", "ej-core"})
/*   */ public interface StringCollector { @NotNull
/*   */   String buildText();
/*   */   void write(@NotNull String paramString);
/*   */   void newline();
/*   */   int length();
/*   */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*   */   public static final class DefaultImpls { public static void newline(@NotNull StringCollector $this) {
/* 9 */       $this.write("\n");
/*   */     } }
/*   */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\scraper\StringCollector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */