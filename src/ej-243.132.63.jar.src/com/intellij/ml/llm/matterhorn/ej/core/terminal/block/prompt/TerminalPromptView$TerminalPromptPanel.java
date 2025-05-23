/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*     */ 
/*     */ import com.intellij.util.ui.JBInsets;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.Rectangle;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JPanel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\002\b\002\b\002\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006J\020\020\b\032\0020\t2\b\020\n\032\004\030\0010\003J\006\020\013\032\0020\fJ\b\020\r\032\0020\016H\026J\b\020\017\032\0020\tH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\003X\004¢\006\002\n\000R\020\020\007\032\004\030\0010\003X\016¢\006\002\n\000¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptView$TerminalPromptPanel;", "Ljavax/swing/JPanel;", "mainComponent", "Ljavax/swing/JComponent;", "sideComponent", "<init>", "(Ljavax/swing/JComponent;Ljavax/swing/JComponent;)V", "bottomComponent", "setBottomComponent", "", "component", "getAvailableContentWidth", "", "getPreferredSize", "Ljava/awt/Dimension;", "doLayout", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalPromptView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalPromptView.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptView$TerminalPromptPanel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1#2:322\n*E\n"})
/*     */ final class TerminalPromptPanel
/*     */   extends JPanel
/*     */ {
/*     */   @NotNull
/*     */   private final JComponent mainComponent;
/*     */   @NotNull
/*     */   private final JComponent sideComponent;
/*     */   @Nullable
/*     */   private JComponent bottomComponent;
/*     */   
/*     */   public TerminalPromptPanel(@NotNull JComponent mainComponent, @NotNull JComponent sideComponent) {
/* 265 */     super((LayoutManager)null);
/*     */     
/*     */     this.mainComponent = mainComponent;
/*     */     this.sideComponent = sideComponent;
/* 269 */     setOpaque(false);
/* 270 */     add(this.mainComponent);
/* 271 */     add(this.sideComponent);
/*     */   }
/*     */   
/*     */   public final void setBottomComponent(@Nullable JComponent component) {
/* 275 */     if (this.bottomComponent != null) { JComponent it = this.bottomComponent;
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
/* 322 */       int $i$a$-let-TerminalPromptView$TerminalPromptPanel$setBottomComponent$1 = 0;
/*     */       remove(it); }
/*     */     else
/*     */     {  }
/*     */     
/*     */     if (component != null)
/*     */       add(component); 
/*     */     this.bottomComponent = component;
/*     */     revalidate();
/*     */     repaint();
/*     */   }
/*     */   
/*     */   public final int getAvailableContentWidth() {
/*     */     return getWidth() - (getInsets()).left - (getInsets()).right - (this.sideComponent.getPreferredSize()).width;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Dimension getPreferredSize() {
/*     */     Dimension mainComponentSize = this.mainComponent.getPreferredSize();
/*     */     if (this.bottomComponent == null || this.bottomComponent.getPreferredSize() == null)
/*     */       this.bottomComponent.getPreferredSize(); 
/*     */     Dimension bottomComponentSize = new Dimension(0, 0);
/*     */     Dimension sideComponentSize = this.sideComponent.getPreferredSize();
/*     */     Dimension size = new Dimension(mainComponentSize.width + sideComponentSize.width, mainComponentSize.height + bottomComponentSize.height);
/*     */     JBInsets.addTo(size, getInsets());
/*     */     return size;
/*     */   }
/*     */   
/*     */   public void doLayout() {
/*     */     Rectangle rect = new Rectangle(0, 0, getWidth(), getHeight());
/*     */     JBInsets.removeFrom(rect, getInsets());
/*     */     Dimension sidePrefSize = this.sideComponent.getPreferredSize();
/*     */     Dimension mainPrefSize = this.mainComponent.getPreferredSize();
/*     */     if (this.bottomComponent == null || this.bottomComponent.getPreferredSize() == null)
/*     */       this.bottomComponent.getPreferredSize(); 
/*     */     Dimension bottomPrefSize = new Dimension(0, 0);
/*     */     int sideComponentX = Math.max(rect.x + rect.width - sidePrefSize.width, 0);
/*     */     this.sideComponent.setBounds(sideComponentX, rect.y, sidePrefSize.width, sidePrefSize.height);
/*     */     int mainHeight = Math.min(rect.height, mainPrefSize.height);
/*     */     this.mainComponent.setBounds(rect.x, rect.y, rect.width - sidePrefSize.width, mainHeight);
/*     */     int bottomHeight = Math.min(rect.height - mainHeight, bottomPrefSize.height);
/*     */     if (this.bottomComponent != null) {
/*     */       this.bottomComponent.setBounds(rect.x, rect.y + mainHeight, rect.width, bottomHeight);
/*     */     } else {
/*     */     
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalPromptView$TerminalPromptPanel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */