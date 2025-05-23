/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.nio.file.Path;
/*     */ import javax.swing.Icon;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B!\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\007¢\006\004\b\b\020\tJ\t\020\020\032\0020\003HÆ\003J\t\020\021\032\0020\005HÆ\003J\013\020\022\032\004\030\0010\007HÆ\003J)\020\023\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\007HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\030HÖ\001J\t\020\031\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\016\020\017¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/components/FileListEntry;", "", "fileName", "", "filePath", "Ljava/nio/file/Path;", "fileIcon", "Ljavax/swing/Icon;", "<init>", "(Ljava/lang/String;Ljava/nio/file/Path;Ljavax/swing/Icon;)V", "getFileName", "()Ljava/lang/String;", "getFilePath", "()Ljava/nio/file/Path;", "getFileIcon", "()Ljavax/swing/Icon;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class FileListEntry
/*     */ {
/*     */   @NotNull
/*     */   private final String fileName;
/*     */   @NotNull
/*     */   private final Path filePath;
/*     */   @Nullable
/*     */   private final Icon fileIcon;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public FileListEntry(@NotNull String fileName, @NotNull Path filePath, @Nullable Icon fileIcon) {
/* 230 */     this.fileName = fileName;
/* 231 */     this.filePath = filePath;
/* 232 */     this.fileIcon = fileIcon; } @Nullable public final Icon getFileIcon() { return this.fileIcon; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final String getFileName() {
/*     */     return this.fileName;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Path getFilePath() {
/*     */     return this.filePath;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.fileName;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Path component2() {
/*     */     return this.filePath;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Icon component3() {
/*     */     return this.fileIcon;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final FileListEntry copy(@NotNull String fileName, @NotNull Path filePath, @Nullable Icon fileIcon) {
/*     */     Intrinsics.checkNotNullParameter(fileName, "fileName");
/*     */     Intrinsics.checkNotNullParameter(filePath, "filePath");
/*     */     return new FileListEntry(fileName, filePath, fileIcon);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "FileListEntry(fileName=" + this.fileName + ", filePath=" + this.filePath + ", fileIcon=" + this.fileIcon + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.fileName.hashCode();
/*     */     result = result * 31 + this.filePath.hashCode();
/*     */     return result * 31 + ((this.fileIcon == null) ? 0 : this.fileIcon.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof FileListEntry))
/*     */       return false; 
/*     */     FileListEntry fileListEntry = (FileListEntry)other;
/*     */     return !Intrinsics.areEqual(this.fileName, fileListEntry.fileName) ? false : (!Intrinsics.areEqual(this.filePath, fileListEntry.filePath) ? false : (!!Intrinsics.areEqual(this.fileIcon, fileListEntry.fileIcon)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\FileListEntry.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */