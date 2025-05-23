/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.openapi.editor.markup.TextAttributes;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\bÀ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\b\020\004\032\0020\005H\026¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/EmptyTextAttributesProvider;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;", "<init>", "()V", "getTextAttributes", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "ej-core"})
/*    */ public final class EmptyTextAttributesProvider
/*    */   implements TextAttributesProvider
/*    */ {
/*    */   @NotNull
/*    */   public static final EmptyTextAttributesProvider INSTANCE = new EmptyTextAttributesProvider();
/*    */   
/*    */   @NotNull
/*    */   public TextAttributes getTextAttributes() {
/* 36 */     Intrinsics.checkNotNullExpressionValue(TextAttributes.ERASE_MARKER, "ERASE_MARKER"); return TextAttributes.ERASE_MARKER;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\EmptyTextAttributesProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */