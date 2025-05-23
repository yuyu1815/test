/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/EmptyLineMarkerRenderer;", "Lcom/intellij/openapi/editor/markup/LineMarkerRenderer;", "<init>", "()V", "paint", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "g", "Ljava/awt/Graphics;", "r", "Ljava/awt/Rectangle;", "ej-core"})
/*    */ public final class EmptyLineMarkerRenderer
/*    */   implements LineMarkerRenderer
/*    */ {
/*    */   public void paint(@NotNull Editor editor, @NotNull Graphics g, @NotNull Rectangle r) {
/* 20 */     Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(g, "g"); Intrinsics.checkNotNullParameter(r, "r");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\EmptyLineMarkerRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */