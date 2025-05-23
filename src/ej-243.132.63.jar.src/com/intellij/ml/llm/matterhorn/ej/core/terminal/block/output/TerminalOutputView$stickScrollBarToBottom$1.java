/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import javax.swing.BoundedRangeModel;
/*     */ import javax.swing.JScrollBar;
/*     */ import javax.swing.event.ChangeEvent;
/*     */ import javax.swing.event.ChangeListener;
/*     */ import kotlin.Metadata;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\005\n\002\020\b\n\002\b\013\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\022\020\024\032\0020\0252\b\020\026\032\004\030\0010\027H\026R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\004\020\005\"\004\b\006\020\007R\032\020\b\032\0020\tX\016¢\006\016\n\000\032\004\b\n\020\013\"\004\b\f\020\rR\032\020\016\032\0020\tX\016¢\006\016\n\000\032\004\b\017\020\013\"\004\b\020\020\rR\032\020\021\032\0020\tX\016¢\006\016\n\000\032\004\b\022\020\013\"\004\b\023\020\r¨\006\030"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputView$stickScrollBarToBottom$1", "Ljavax/swing/event/ChangeListener;", "preventRecursion", "", "getPreventRecursion", "()Z", "setPreventRecursion", "(Z)V", "prevValue", "", "getPrevValue", "()I", "setPrevValue", "(I)V", "prevMaximum", "getPrevMaximum", "setPrevMaximum", "prevExtent", "getPrevExtent", "setPrevExtent", "stateChanged", "", "e", "Ljavax/swing/event/ChangeEvent;", "ej-core"})
/*     */ public final class TerminalOutputView$stickScrollBarToBottom$1
/*     */   implements ChangeListener
/*     */ {
/*     */   private boolean preventRecursion;
/*     */   private int prevValue;
/*     */   private int prevMaximum;
/*     */   private int prevExtent;
/*     */   
/*     */   TerminalOutputView$stickScrollBarToBottom$1(JScrollBar $verticalScrollBar) {}
/*     */   
/*     */   public final boolean getPreventRecursion() {
/*  79 */     return this.preventRecursion; } public final void setPreventRecursion(boolean <set-?>) { this.preventRecursion = <set-?>; }
/*  80 */   public final int getPrevValue() { return this.prevValue; } public final void setPrevValue(int <set-?>) { this.prevValue = <set-?>; }
/*  81 */   public final int getPrevMaximum() { return this.prevMaximum; } public final void setPrevMaximum(int <set-?>) { this.prevMaximum = <set-?>; }
/*  82 */   public final int getPrevExtent() { return this.prevExtent; } public final void setPrevExtent(int <set-?>) { this.prevExtent = <set-?>; }
/*     */   
/*     */   public void stateChanged(ChangeEvent e) {
/*  85 */     if (this.preventRecursion)
/*     */       return; 
/*  87 */     BoundedRangeModel model = this.$verticalScrollBar.getModel();
/*  88 */     int maximum = model.getMaximum();
/*  89 */     int extent = model.getExtent();
/*     */     
/*  91 */     if (extent != this.prevExtent || maximum != this.prevMaximum)
/*     */     {
/*  93 */       if (this.prevValue == this.prevMaximum - this.prevExtent) {
/*  94 */         this.preventRecursion = true;
/*     */         try {
/*  96 */           model.setValue(maximum - extent);
/*     */         } finally {
/*     */           
/*  99 */           this.preventRecursion = false;
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 104 */     this.prevValue = model.getValue();
/* 105 */     this.prevMaximum = model.getMaximum();
/* 106 */     this.prevExtent = model.getExtent();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputView$stickScrollBarToBottom$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */