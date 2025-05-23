/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ 
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\002\030\002\n\002\b\007\030\0002\0020\001B\033\022\006\020\002\032\0020\003\022\n\020\004\032\0060\005j\002`\006¢\006\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\025\020\004\032\0060\005j\002`\006¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "line", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/OneBasedIndex;", "<init>", "(Lcom/intellij/openapi/vfs/VirtualFile;I)V", "getFile", "()Lcom/intellij/openapi/vfs/VirtualFile;", "getLine", "()I", "ej-core"})
/*    */ public final class FileWithLine
/*    */ {
/*    */   @NotNull
/*    */   private final VirtualFile file;
/*    */   private final int line;
/*    */   
/*    */   public FileWithLine(@NotNull VirtualFile file, int line) {
/* 34 */     this.file = file;
/* 35 */     this.line = line; } public final int getLine() { return this.line; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final VirtualFile getFile() {
/*    */     return this.file;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\FileWithLine.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */