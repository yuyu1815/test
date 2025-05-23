/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*    */ 
/*    */ import java.awt.event.FocusAdapter;
/*    */ import java.awt.event.FocusEvent;
/*    */ import java.util.Iterator;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel$2$1", "Ljava/awt/event/FocusAdapter;", "focusGained", "", "e", "Ljava/awt/event/FocusEvent;", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nTerminalFocusModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalFocusModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1863#2,2:97\n*S KotlinDebug\n*F\n+ 1 TerminalFocusModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel$2$1\n*L\n55#1:97,2\n*E\n"})
/*    */ public final class TerminalFocusModel$2$1
/*    */   extends FocusAdapter
/*    */ {
/*    */   public void focusGained(FocusEvent e) {
/* 55 */     Iterable $this$forEach$iv = TerminalFocusModel.access$getListeners$p(TerminalFocusModel.this); int $i$f$forEach = 0;
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
/* 97 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); TerminalFocusModel.TerminalFocusListener it = (TerminalFocusModel.TerminalFocusListener)element$iv; int $i$a$-forEach-TerminalFocusModel$2$1$focusGained$1 = 0;
/*    */       it.promptFocused(); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\TerminalFocusModel$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */