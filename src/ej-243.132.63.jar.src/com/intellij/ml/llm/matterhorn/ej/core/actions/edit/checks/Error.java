/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks;
/*    */ 
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\005\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b6\030\0002\0020\001B\021\b\004\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\013H&R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007\001\002\f\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error;", "", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getStartLineOneBasedIndex", "", "document", "Lcom/intellij/openapi/editor/Document;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/LineColumnError;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/OffsetError;", "ej-core"})
/*    */ public abstract class Error
/*    */ {
/*    */   @NotNull
/*    */   private final String text;
/*    */   
/*    */   private Error(String text) {
/* 44 */     this.text = text; } @NotNull public final String getText() { return this.text; }
/*    */ 
/*    */   
/*    */   public abstract int getStartLineOneBasedIndex(@NotNull Document paramDocument);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\checks\Error.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */