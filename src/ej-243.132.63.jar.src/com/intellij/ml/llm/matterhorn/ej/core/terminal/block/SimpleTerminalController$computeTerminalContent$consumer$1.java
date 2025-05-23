/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.HighlightingInfo;
/*     */ import com.jediterm.terminal.StyledTextConsumer;
/*     */ import com.jediterm.terminal.TextStyle;
/*     */ import com.jediterm.terminal.model.CharBuffer;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005*\001\000\b\n\030\0002\0020\001J0\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0052\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\005H\026J8\020\f\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0052\006\020\r\032\0020\0052\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\005H\026J(\020\016\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0052\006\020\r\032\0020\0052\006\020\013\032\0020\005H\026¨\006\017"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalController$computeTerminalContent$consumer$1", "Lcom/jediterm/terminal/StyledTextConsumer;", "consume", "", "x", "", "y", "style", "Lcom/jediterm/terminal/TextStyle;", "characters", "Lcom/jediterm/terminal/model/CharBuffer;", "startRow", "consumeNul", "nulIndex", "consumeQueue", "ej-core"})
/*     */ public final class SimpleTerminalController$computeTerminalContent$consumer$1
/*     */   implements StyledTextConsumer
/*     */ {
/*     */   SimpleTerminalController$computeTerminalContent$consumer$1(List<HighlightingInfo> $highlightings, SimpleTerminalController $receiver) {}
/*     */   
/*     */   public void consume(int x, int y, TextStyle style, CharBuffer characters, int startRow) {
/*  89 */     Intrinsics.checkNotNullParameter(style, "style"); Intrinsics.checkNotNullParameter(characters, "characters"); int startOffset = this.$builder.length();
/*  90 */     this.$builder.append(characters.toString());
/*  91 */     this.$highlightings.add(new HighlightingInfo(startOffset, this.$builder.length(), SimpleTerminalController.access$toTextAttributesProvider(SimpleTerminalController.this, style)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void consumeNul(int x, int y, int nulIndex, TextStyle style, CharBuffer characters, int startRow) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: ldc 'style'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #5
/*     */     //   9: ldc 'characters'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_0
/*     */     //   15: getfield $builder : Ljava/lang/StringBuilder;
/*     */     //   18: invokevirtual length : ()I
/*     */     //   21: istore #7
/*     */     //   23: aload #5
/*     */     //   25: invokevirtual getBuf : ()[C
/*     */     //   28: arraylength
/*     */     //   29: istore #8
/*     */     //   31: aload_0
/*     */     //   32: getfield $builder : Ljava/lang/StringBuilder;
/*     */     //   35: astore #9
/*     */     //   37: iconst_0
/*     */     //   38: istore #10
/*     */     //   40: iload #10
/*     */     //   42: iload #8
/*     */     //   44: if_icmpge -> 69
/*     */     //   47: iload #10
/*     */     //   49: istore #11
/*     */     //   51: iconst_0
/*     */     //   52: istore #12
/*     */     //   54: aload #9
/*     */     //   56: bipush #32
/*     */     //   58: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   61: pop
/*     */     //   62: nop
/*     */     //   63: iinc #10, 1
/*     */     //   66: goto -> 40
/*     */     //   69: aload_0
/*     */     //   70: getfield $highlightings : Ljava/util/List;
/*     */     //   73: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo
/*     */     //   76: dup
/*     */     //   77: iload #7
/*     */     //   79: aload_0
/*     */     //   80: getfield $builder : Ljava/lang/StringBuilder;
/*     */     //   83: invokevirtual length : ()I
/*     */     //   86: aload_0
/*     */     //   87: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalController;
/*     */     //   90: getstatic com/jediterm/terminal/TextStyle.EMPTY : Lcom/jediterm/terminal/TextStyle;
/*     */     //   93: dup
/*     */     //   94: ldc 'EMPTY'
/*     */     //   96: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   99: invokestatic access$toTextAttributesProvider : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalController;Lcom/jediterm/terminal/TextStyle;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;
/*     */     //   102: invokespecial <init> : (IILcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;)V
/*     */     //   105: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   110: pop
/*     */     //   111: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #100	-> 14
/*     */     //   #101	-> 23
/*     */     //   #102	-> 54
/*     */     //   #103	-> 62
/*     */     //   #101	-> 63
/*     */     //   #104	-> 69
/*     */     //   #105	-> 111
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   54	9	12	$i$a$-repeat-SimpleTerminalController$computeTerminalContent$consumer$1$consumeNul$1	I
/*     */     //   51	12	11	it	I
/*     */     //   23	89	7	startOffset	I
/*     */     //   0	112	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalController$computeTerminalContent$consumer$1;
/*     */     //   0	112	1	x	I
/*     */     //   0	112	2	y	I
/*     */     //   0	112	3	nulIndex	I
/*     */     //   0	112	4	style	Lcom/jediterm/terminal/TextStyle;
/*     */     //   0	112	5	characters	Lcom/jediterm/terminal/model/CharBuffer;
/*     */     //   0	112	6	startRow	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void consumeQueue(int x, int y, int nulIndex, int startRow) {
/* 108 */     this.$builder.append("\n");
/* 109 */     Intrinsics.checkNotNullExpressionValue(TextStyle.EMPTY, "EMPTY"); this.$highlightings.add(new HighlightingInfo(this.$builder.length() - 1, this.$builder.length(), SimpleTerminalController.access$toTextAttributesProvider(SimpleTerminalController.this, TextStyle.EMPTY)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\SimpleTerminalController$computeTerminalContent$consumer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */