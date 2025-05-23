/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*    */ import com.intellij.openapi.Disposable;
/*    */ import com.intellij.openapi.actionSystem.DataKey;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.util.concurrency.annotations.RequiresEdt;
/*    */ import com.intellij.util.ui.UIUtil;
/*    */ import java.awt.Toolkit;
/*    */ import java.awt.event.AWTEventListener;
/*    */ import java.util.Iterator;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JPopupMenu;
/*    */ import javax.swing.MenuSelectionManager;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\005\n\002\020!\n\002\030\002\n\000\n\002\020\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\000\030\000 \0342\0020\001:\002\033\034B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\b\020\021\032\0020\022H\007J\b\020\023\032\0020\022H\007J\032\020\024\032\0020\0222\006\020\025\032\0020\0202\n\b\002\020\026\032\004\030\0010\027J\020\020\030\032\0020\0222\006\020\031\032\0020\032H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R$\020\n\032\0020\t2\006\020\b\032\0020\t@BX\016¢\006\016\n\000\032\004\b\n\020\013\"\004\b\f\020\rR\024\020\016\032\b\022\004\022\0020\0200\017X\004¢\006\002\n\000¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel;", "", "project", "Lcom/intellij/openapi/project/Project;", "terminalView", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;)V", "value", "", "isActive", "()Z", "setActive", "(Z)V", "listeners", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel$TerminalFocusListener;", "focusOutput", "", "focusPrompt", "addListener", "listener", "disposable", "Lcom/intellij/openapi/Disposable;", "requestFocus", "target", "Ljavax/swing/JComponent;", "TerminalFocusListener", "Companion", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nTerminalFocusModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalFocusModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1863#2,2:97\n*S KotlinDebug\n*F\n+ 1 TerminalFocusModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel\n*L\n29#1:97,2\n*E\n"})
/*    */ public final class TerminalFocusModel {
/*    */   public TerminalFocusModel(@NotNull Project project, @NotNull BlockTerminalView terminalView) {
/* 22 */     this.project = project;
/* 23 */     this.terminalView = terminalView;
/*    */     
/* 25 */     this.isActive = true;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 33 */     this.listeners = new CopyOnWriteArrayList<>();
/*    */ 
/*    */     
/* 36 */     AWTEventListener listener = this::_init_$lambda$1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 46 */     Toolkit.getDefaultToolkit().addAWTEventListener(listener, 4L);
/* 47 */     Disposer.register(this.terminalView, listener::_init_$lambda$2);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 52 */     ActionsKt.invokeLater$default(null, this::_init_$lambda$3, 1, null);
/*    */   }
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
/*    */   public final boolean isActive() {
/*    */     return this.isActive;
/*    */   }
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
/*    */   private final void setActive(boolean value) {
/*    */     Iterator<TerminalFocusListener> iterator;
/*    */     if (value != this.isActive)
/*    */     { this.isActive = value;
/*    */       Iterable<TerminalFocusListener> $this$forEach$iv = this.listeners;
/*    */       int $i$f$forEach = 0;
/* 97 */       iterator = $this$forEach$iv.iterator(); } else { return; }  if (iterator.hasNext()) { Object element$iv = iterator.next(); TerminalFocusListener it = (TerminalFocusListener)element$iv; int $i$a$-forEach-TerminalFocusModel$isActive$1 = 0;
/*    */       it.activeStateChanged(value); }
/*    */   
/*    */   }
/*    */   
/*    */   private static final void _init_$lambda$1(TerminalFocusModel this$0, AWTEvent it) {
/*    */     if (UIUtil.isFocusAncestor(this$0.terminalView.getComponent())) {
/*    */       this$0.setActive(true);
/*    */     } else {
/*    */       Intrinsics.checkNotNullExpressionValue(MenuSelectionManager.defaultManager().getSelectedPath(), "getSelectedPath(...)");
/*    */       Object object = ArraysKt.firstOrNull((Object[])MenuSelectionManager.defaultManager().getSelectedPath());
/*    */       JPopupMenu menu = (object instanceof JPopupMenu) ? (JPopupMenu)object : null;
/*    */       this$0.setActive(UIUtil.isDescendingFrom(menu, this$0.terminalView.getComponent()));
/*    */     } 
/*    */   }
/*    */   
/*    */   private static final void _init_$lambda$2(AWTEventListener $listener) {
/*    */     Toolkit.getDefaultToolkit().removeAWTEventListener($listener);
/*    */   }
/*    */   
/*    */   private static final Unit _init_$lambda$3(TerminalFocusModel this$0) {
/*    */     this$0.terminalView.getPromptView().getPreferredFocusableComponent().addFocusListener(new TerminalFocusModel$2$1());
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @RequiresEdt
/*    */   public final void focusOutput() {
/*    */     requestFocus(this.terminalView.getOutputView().getPreferredFocusableComponent());
/*    */   }
/*    */   
/*    */   @RequiresEdt
/*    */   public final void focusPrompt() {
/*    */     requestFocus(this.terminalView.getPromptView().getPreferredFocusableComponent());
/*    */   }
/*    */   
/*    */   public final void addListener(@NotNull TerminalFocusListener listener, @Nullable Disposable disposable) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'listener'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield listeners : Ljava/util/List;
/*    */     //   10: aload_1
/*    */     //   11: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   16: pop
/*    */     //   17: aload_2
/*    */     //   18: ifnull -> 32
/*    */     //   21: aload_2
/*    */     //   22: aload_0
/*    */     //   23: aload_1
/*    */     //   24: <illegal opcode> dispose : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel$TerminalFocusListener;)Lcom/intellij/openapi/Disposable;
/*    */     //   29: invokestatic register : (Lcom/intellij/openapi/Disposable;Lcom/intellij/openapi/Disposable;)V
/*    */     //   32: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #72	-> 6
/*    */     //   #73	-> 17
/*    */     //   #74	-> 21
/*    */     //   #78	-> 32
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	33	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel;
/*    */     //   0	33	1	listener	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel$TerminalFocusListener;
/*    */     //   0	33	2	disposable	Lcom/intellij/openapi/Disposable;
/*    */   }
/*    */   
/*    */   private static final void addListener$lambda$4(TerminalFocusModel this$0, TerminalFocusListener $listener) {
/*    */     this$0.listeners.remove($listener);
/*    */   }
/*    */   
/*    */   private final void requestFocus(JComponent target) {
/*    */     if (!target.hasFocus())
/*    */       IdeFocusManager.getInstance(this.project).requestFocus(target, true); 
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\002\b\002\n\002\020\013\n\000\bf\030\0002\0020\001J\b\020\002\032\0020\003H\026J\020\020\004\032\0020\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel$TerminalFocusListener;", "", "promptFocused", "", "activeStateChanged", "isActive", "", "ej-core"})
/*    */   public static interface TerminalFocusListener {
/*    */     void promptFocused();
/*    */     
/*    */     void activeStateChanged(boolean param1Boolean);
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */     public static final class DefaultImpls {
/*    */       public static void promptFocused(@NotNull TerminalFocusModel.TerminalFocusListener $this) {}
/*    */       
/*    */       public static void activeStateChanged(@NotNull TerminalFocusModel.TerminalFocusListener $this, boolean isActive) {}
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel$Companion;", "", "<init>", "()V", "KEY", "Lcom/intellij/openapi/actionSystem/DataKey;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel;", "getKEY", "()Lcom/intellij/openapi/actionSystem/DataKey;", "ej-core"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final DataKey<TerminalFocusModel> getKEY() {
/*    */       return TerminalFocusModel.KEY;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Project project;
/*    */   @NotNull
/*    */   private final BlockTerminalView terminalView;
/*    */   private boolean isActive;
/*    */   @NotNull
/*    */   private final List<TerminalFocusListener> listeners;
/*    */   @NotNull
/*    */   private static final DataKey<TerminalFocusModel> KEY = DataKey.Companion.create("Junie.TerminalFocusModel");
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\TerminalFocusModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */