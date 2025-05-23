/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.BlockTerminalSession;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandListener;
/*    */ import com.intellij.openapi.editor.ex.EditorEx;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.plugins.terminal.util.ShellType;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\020\020\n\032\0020\0132\006\020\f\032\0020\rH\026J\b\020\016\032\0020\013H\026J\020\020\017\032\0020\0132\006\020\020\032\0020\021H\026J\020\020\022\032\0020\0132\006\020\002\032\0020\003H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/ShellEditorBufferReportShellCommandListener;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener;", "blockTerminalSession", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "model", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel;", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel;Lcom/intellij/openapi/editor/ex/EditorEx;)V", "commandBufferReceived", "", "buffer", "", "initialized", "commandFinished", "event", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;", "sendCodeToReportBuffer", "ej-core"})
/*    */ public final class ShellEditorBufferReportShellCommandListener implements ShellCommandListener {
/*    */   @NotNull
/*    */   private final BlockTerminalSession blockTerminalSession;
/*    */   @NotNull
/*    */   private final TerminalPromptModel model;
/*    */   @NotNull
/*    */   private final EditorEx editor;
/*    */   
/* 20 */   public ShellEditorBufferReportShellCommandListener(@NotNull BlockTerminalSession blockTerminalSession, @NotNull TerminalPromptModel model, @NotNull EditorEx editor) { this.blockTerminalSession = blockTerminalSession;
/* 21 */     this.model = model;
/* 22 */     this.editor = editor; }
/*    */   public void promptShown() { ShellCommandListener.DefaultImpls.promptShown(this); }
/*    */   public void commandStarted(@NotNull String command) { ShellCommandListener.DefaultImpls.commandStarted(this, command); }
/*    */   public void promptStateUpdated(@NotNull TerminalPromptState newState) { ShellCommandListener.DefaultImpls.promptStateUpdated(this, newState); }
/*    */   public void commandHistoryReceived(@NotNull String history) { ShellCommandListener.DefaultImpls.commandHistoryReceived(this, history); }
/* 27 */   private static final boolean commandBufferReceived$lambda$0(ShellEditorBufferReportShellCommandListener this$0) { return this$0.editor.isDisposed(); }
/*    */   public void shellInfoReceived(@NotNull String rawShellInfo) { ShellCommandListener.DefaultImpls.shellInfoReceived(this, rawShellInfo); }
/*    */   public void generatorFinished(@NotNull GeneratorFinishedEvent event) { ShellCommandListener.DefaultImpls.generatorFinished(this, event); }
/*    */   public void clearInvoked() { ShellCommandListener.DefaultImpls.clearInvoked(this); } public void commandBufferReceived(@NotNull String buffer) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'buffer'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/ShellEditorBufferReportShellCommandListener;)Lkotlin/jvm/functions/Function0;
/*    */     //   12: astore_2
/*    */     //   13: aload_2
/*    */     //   14: aconst_null
/*    */     //   15: aload_0
/*    */     //   16: aload_1
/*    */     //   17: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/ShellEditorBufferReportShellCommandListener;Ljava/lang/String;)Ljava/lang/Runnable;
/*    */     //   22: iconst_2
/*    */     //   23: aconst_null
/*    */     //   24: invokestatic invokeLater$default : (Lkotlin/jvm/functions/Function0;Lcom/intellij/openapi/application/ModalityState;Ljava/lang/Runnable;ILjava/lang/Object;)V
/*    */     //   27: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #26	-> 6
/*    */     //   #29	-> 13
/*    */     //   #33	-> 27
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   13	15	2	condition	Lkotlin/jvm/functions/Function0;
/*    */     //   0	28	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/ShellEditorBufferReportShellCommandListener;
/* 30 */     //   0	28	1	buffer	Ljava/lang/String; } private static final void commandBufferReceived$lambda$1(ShellEditorBufferReportShellCommandListener this$0, String $buffer) { this$0.model.setCommandText($buffer);
/* 31 */     this$0.editor.getCaretModel().moveToOffset(this$0.editor.getDocument().getTextLength()); }
/*    */ 
/*    */ 
/*    */   
/*    */   public void initialized() {
/* 36 */     sendCodeToReportBuffer(this.blockTerminalSession);
/*    */   }
/*    */   
/*    */   public void commandFinished(@NotNull CommandFinishedEvent event) {
/* 40 */     Intrinsics.checkNotNullParameter(event, "event"); sendCodeToReportBuffer(this.blockTerminalSession);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private final void sendCodeToReportBuffer(BlockTerminalSession blockTerminalSession) {
/* 46 */     ShellType[] arrayOfShellType = new ShellType[2]; arrayOfShellType[0] = ShellType.ZSH; arrayOfShellType[1] = ShellType.BASH; if (!SetsKt.setOf((Object[])arrayOfShellType).contains(blockTerminalSession.getShellIntegration().getShellType())) {
/*    */       return;
/*    */     }
/*    */ 
/*    */     
/* 51 */     byte[] arrayOfByte1 = new byte[1]; arrayOfByte1[0] = 27; byte[] escapeSymbol = arrayOfByte1;
/* 52 */     String str = "o"; Intrinsics.checkNotNullExpressionValue(StandardCharsets.UTF_8, "UTF_8"); Intrinsics.checkNotNullExpressionValue(str.getBytes(StandardCharsets.UTF_8), "getBytes(...)"); byte[] iSymbol = str.getBytes(StandardCharsets.UTF_8);
/* 53 */     blockTerminalSession.getCommandExecutionManager$ej_core().sendKeyBinding(new KeyBinding(ArraysKt.plus(escapeSymbol, iSymbol)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\ShellEditorBufferReportShellCommandListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */