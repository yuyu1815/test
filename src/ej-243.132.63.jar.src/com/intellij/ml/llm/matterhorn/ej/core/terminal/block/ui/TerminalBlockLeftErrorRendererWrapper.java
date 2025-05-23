/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui;
/*    */ 
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.markup.LineMarkerRenderer;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Rectangle;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J \020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalBlockLeftErrorRendererWrapper;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalBlockLeftErrorRenderer;", "superRenderer", "Lcom/intellij/openapi/editor/markup/LineMarkerRenderer;", "<init>", "(Lcom/intellij/openapi/editor/markup/LineMarkerRenderer;)V", "paint", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "g", "Ljava/awt/Graphics;", "r", "Ljava/awt/Rectangle;", "ej-core"})
/*    */ public final class TerminalBlockLeftErrorRendererWrapper
/*    */   extends TerminalBlockLeftErrorRenderer
/*    */ {
/*    */   @NotNull
/*    */   private final LineMarkerRenderer superRenderer;
/*    */   
/*    */   public TerminalBlockLeftErrorRendererWrapper(@NotNull LineMarkerRenderer superRenderer) {
/* 39 */     this.superRenderer = superRenderer;
/*    */   } public void paint(@NotNull Editor editor, @NotNull Graphics g, @NotNull Rectangle r) {
/* 41 */     Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(g, "g"); Intrinsics.checkNotNullParameter(r, "r"); this.superRenderer.paint(editor, g, r); super
/* 42 */       .paint(editor, g, r);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\bloc\\ui\TerminalBlockLeftErrorRendererWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */