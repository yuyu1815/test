/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.util.concurrency.annotations.RequiresEdt;
/*    */ import java.awt.Rectangle;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\032\016\020\000\032\004\030\0010\001*\0020\002H\000\032\026\020\003\032\004\030\0010\001*\0020\0022\006\020\004\032\0020\005H\000\032\024\020\006\032\0020\007*\0020\0022\006\020\b\032\0020\001H\001\032\024\020\t\032\0020\n*\0020\0022\006\020\b\032\0020\001H\000¨\006\013"}, d2 = {"getActiveBlock", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;", "getByOffset", "offset", "", "getBlockBounds", "Ljava/awt/Rectangle;", "block", "isErrorBlock", "", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nTerminalOutputModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalOutputModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
/*    */ public final class TerminalOutputModelKt
/*    */ {
/*    */   @Nullable
/*    */   public static final CommandBlock getActiveBlock(@NotNull TerminalOutputModel $this$getActiveBlock) {
/* 80 */     Intrinsics.checkNotNullParameter($this$getActiveBlock, "<this>"); CommandBlock commandBlock1 = (CommandBlock)CollectionsKt.lastOrNull($this$getActiveBlock.getBlocks()), it = commandBlock1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 99 */     int $i$a$-takeIf-TerminalOutputModelKt$getActiveBlock$1 = 0; (CommandBlock)CollectionsKt.lastOrNull($this$getActiveBlock.getBlocks()); return ((CommandBlock)CollectionsKt.lastOrNull($this$getActiveBlock.getBlocks()) != null) ? ((!it.isFinalized()) ? commandBlock1 : null) : null; } public static final boolean isErrorBlock(@NotNull TerminalOutputModel $this$isErrorBlock, @NotNull CommandBlock block) { Intrinsics.checkNotNullParameter($this$isErrorBlock, "<this>"); Intrinsics.checkNotNullParameter(block, "block"); CommandBlockInfo it = $this$isErrorBlock.getBlockInfo(block); int $i$a$-let-TerminalOutputModelKt$isErrorBlock$1 = 0;
/*    */     return (it != null && it.getExitCode() != 0); }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public static final CommandBlock getByOffset(@NotNull TerminalOutputModel $this$getByOffset, int offset) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc '<this>'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: invokeinterface getBlocks : ()Ljava/util/List;
/*    */     //   12: checkcast java/lang/Iterable
/*    */     //   15: astore_2
/*    */     //   16: aload_2
/*    */     //   17: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   22: astore_3
/*    */     //   23: aload_3
/*    */     //   24: invokeinterface hasNext : ()Z
/*    */     //   29: ifeq -> 93
/*    */     //   32: aload_3
/*    */     //   33: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   38: astore #4
/*    */     //   40: aload #4
/*    */     //   42: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock
/*    */     //   45: astore #5
/*    */     //   47: iconst_0
/*    */     //   48: istore #6
/*    */     //   50: aload #5
/*    */     //   52: invokeinterface getStartOffset : ()I
/*    */     //   57: istore #7
/*    */     //   59: iload_1
/*    */     //   60: aload #5
/*    */     //   62: invokeinterface getEndOffset : ()I
/*    */     //   67: if_icmpgt -> 84
/*    */     //   70: iload #7
/*    */     //   72: iload_1
/*    */     //   73: if_icmpgt -> 80
/*    */     //   76: iconst_1
/*    */     //   77: goto -> 85
/*    */     //   80: iconst_0
/*    */     //   81: goto -> 85
/*    */     //   84: iconst_0
/*    */     //   85: ifeq -> 23
/*    */     //   88: aload #4
/*    */     //   90: goto -> 94
/*    */     //   93: aconst_null
/*    */     //   94: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock
/*    */     //   97: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #85	-> 6
/*    */     //   #99	-> 47
/*    */     //   #85	-> 50
/*    */     //   #85	-> 85
/*    */     //   #85	-> 97
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   50	35	6	$i$a$-find-TerminalOutputModelKt$getByOffset$1	I
/*    */     //   47	38	5	it	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;
/*    */     //   0	98	0	$this$getByOffset	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;
/*    */     //   0	98	1	offset	I
/*    */   }
/*    */   
/*    */   @RequiresEdt
/*    */   @NotNull
/*    */   public static final Rectangle getBlockBounds(@NotNull TerminalOutputModel $this$getBlockBounds, @NotNull CommandBlock block) {
/*    */     Intrinsics.checkNotNullParameter($this$getBlockBounds, "<this>");
/*    */     Intrinsics.checkNotNullParameter(block, "block");
/*    */     int topY = ($this$getBlockBounds.getEditor().offsetToXY(block.getStartOffset())).y - 6;
/*    */     int bottomY = ($this$getBlockBounds.getEditor().offsetToXY(block.getEndOffset())).y + $this$getBlockBounds.getEditor().getLineHeight() + 6;
/*    */     int width = ($this$getBlockBounds.getEditor().getScrollingModel().getVisibleArea()).width - 7;
/*    */     return new Rectangle(0, topY, width, bottomY - topY);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputModelKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */