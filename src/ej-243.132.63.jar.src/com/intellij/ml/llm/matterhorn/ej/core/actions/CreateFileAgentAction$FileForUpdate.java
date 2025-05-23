/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\f\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0052\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\024HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CreateFileAgentAction$FileForUpdate;", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "created", "", "<init>", "(Lcom/intellij/openapi/vfs/VirtualFile;Z)V", "getFile", "()Lcom/intellij/openapi/vfs/VirtualFile;", "getCreated", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "ej-core"})
/*    */ public final class FileForUpdate
/*    */ {
/*    */   @NotNull
/*    */   private final VirtualFile file;
/*    */   private final boolean created;
/*    */   
/*    */   public FileForUpdate(@NotNull VirtualFile file, boolean created) {
/* 60 */     this.file = file; this.created = created; } @NotNull public final VirtualFile getFile() { return this.file; } public final boolean getCreated() { return this.created; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final VirtualFile component1() {
/*    */     return this.file;
/*    */   }
/*    */   
/*    */   public final boolean component2() {
/*    */     return this.created;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FileForUpdate copy(@NotNull VirtualFile file, boolean created) {
/*    */     Intrinsics.checkNotNullParameter(file, "file");
/*    */     return new FileForUpdate(file, created);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "FileForUpdate(file=" + this.file + ", created=" + this.created + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.file.hashCode();
/*    */     return result * 31 + Boolean.hashCode(this.created);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof FileForUpdate))
/*    */       return false; 
/*    */     FileForUpdate fileForUpdate = (FileForUpdate)other;
/*    */     return !Intrinsics.areEqual(this.file, fileForUpdate.file) ? false : (!(this.created != fileForUpdate.created));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\CreateFileAgentAction$FileForUpdate.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */