/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*    */ 
/*    */ import com.intellij.openapi.diff.impl.patch.PatchHunk;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\007\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult$Success;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult;", "document", "Lcom/intellij/openapi/editor/Document;", "reversePatch", "", "Lcom/intellij/openapi/diff/impl/patch/PatchHunk;", "<init>", "(Lcom/intellij/openapi/editor/Document;Ljava/util/List;)V", "getDocument", "()Lcom/intellij/openapi/editor/Document;", "getReversePatch", "()Ljava/util/List;", "ej-core"})
/*    */ public final class Success
/*    */   extends UndoResult
/*    */ {
/*    */   @NotNull
/*    */   private final Document document;
/*    */   @NotNull
/*    */   private final List<PatchHunk> reversePatch;
/*    */   
/*    */   public Success(@NotNull Document document, @NotNull List<PatchHunk> reversePatch) {
/* 22 */     super(null); this.document = document; this.reversePatch = reversePatch; } @NotNull public final Document getDocument() { return this.document; } @NotNull public final List<PatchHunk> getReversePatch() { return this.reversePatch; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\UndoResult$Success.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */