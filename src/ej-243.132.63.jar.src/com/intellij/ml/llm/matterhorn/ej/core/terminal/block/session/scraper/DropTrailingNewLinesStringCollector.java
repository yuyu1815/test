/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.scraper;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\b\n\000\n\002\020\002\n\000\n\002\020\016\n\002\b\004\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\001¢\006\004\b\003\020\004J\020\020\007\032\0020\b2\006\020\t\032\0020\nH\026J\b\020\013\032\0020\bH\026J\b\020\f\032\0020\nH\026J\b\020\r\032\0020\006H\026R\016\020\002\032\0020\001X\004¢\006\002\n\000R\016\020\005\032\0020\006X\016¢\006\002\n\000¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/DropTrailingNewLinesStringCollector;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/StringCollector;", "delegate", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/StringCollector;)V", "pendingNewLines", "", "write", "", "text", "", "newline", "buildText", "length", "ej-core"})
/*    */ public final class DropTrailingNewLinesStringCollector implements StringCollector {
/*    */   public DropTrailingNewLinesStringCollector(@NotNull StringCollector delegate) {
/*  8 */     this.delegate = delegate;
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   private final StringCollector delegate;
/*    */   
/*    */   private int pendingNewLines;
/*    */ 
/*    */   
/*    */   public void write(@NotNull String text) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'text'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: checkcast java/lang/CharSequence
/*    */     //   10: invokeinterface length : ()I
/*    */     //   15: ifne -> 22
/*    */     //   18: iconst_1
/*    */     //   19: goto -> 23
/*    */     //   22: iconst_0
/*    */     //   23: ifne -> 65
/*    */     //   26: aload_0
/*    */     //   27: getfield pendingNewLines : I
/*    */     //   30: istore_2
/*    */     //   31: iconst_0
/*    */     //   32: istore_3
/*    */     //   33: iload_3
/*    */     //   34: iload_2
/*    */     //   35: if_icmpge -> 60
/*    */     //   38: iload_3
/*    */     //   39: istore #4
/*    */     //   41: iconst_0
/*    */     //   42: istore #5
/*    */     //   44: aload_0
/*    */     //   45: getfield delegate : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/StringCollector;
/*    */     //   48: invokeinterface newline : ()V
/*    */     //   53: nop
/*    */     //   54: iinc #3, 1
/*    */     //   57: goto -> 33
/*    */     //   60: aload_0
/*    */     //   61: iconst_0
/*    */     //   62: putfield pendingNewLines : I
/*    */     //   65: aload_0
/*    */     //   66: getfield delegate : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/StringCollector;
/*    */     //   69: aload_1
/*    */     //   70: invokeinterface write : (Ljava/lang/String;)V
/*    */     //   75: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 6
/*    */     //   #13	-> 23
/*    */     //   #14	-> 26
/*    */     //   #15	-> 44
/*    */     //   #16	-> 53
/*    */     //   #14	-> 54
/*    */     //   #17	-> 60
/*    */     //   #19	-> 65
/*    */     //   #20	-> 75
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   44	10	5	$i$a$-repeat-DropTrailingNewLinesStringCollector$write$1	I
/*    */     //   41	13	4	it	I
/*    */     //   0	76	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/DropTrailingNewLinesStringCollector;
/*    */     //   0	76	1	text	Ljava/lang/String;
/*    */   }
/*    */   
/*    */   public void newline() {
/* 23 */     int i = this.pendingNewLines; this.pendingNewLines = i + 1;
/*    */   }
/*    */   @NotNull
/*    */   public String buildText() {
/* 27 */     return this.delegate.buildText();
/*    */   }
/*    */   
/*    */   public int length() {
/* 31 */     return this.delegate.length();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\scraper\DropTrailingNewLinesStringCollector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */