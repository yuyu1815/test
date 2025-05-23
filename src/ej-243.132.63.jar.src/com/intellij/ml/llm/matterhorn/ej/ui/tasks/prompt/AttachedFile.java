/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.nio.file.Path;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\031\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\013\020\f\032\004\030\0010\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\037\020\016\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\003HÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFile;", "", "shortName", "", "path", "Ljava/nio/file/Path;", "<init>", "(Ljava/lang/String;Ljava/nio/file/Path;)V", "getShortName", "()Ljava/lang/String;", "getPath", "()Ljava/nio/file/Path;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class AttachedFile
/*     */ {
/*     */   @Nullable
/*     */   private final String shortName;
/*     */   @NotNull
/*     */   private final Path path;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public AttachedFile(@Nullable String shortName, @NotNull Path path) {
/* 154 */     this.shortName = shortName; this.path = path; } @Nullable public final String getShortName() { return this.shortName; } @NotNull public final Path getPath() { return this.path; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final String component1() {
/*     */     return this.shortName;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Path component2() {
/*     */     return this.path;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final AttachedFile copy(@Nullable String shortName, @NotNull Path path) {
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     return new AttachedFile(shortName, path);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "AttachedFile(shortName=" + this.shortName + ", path=" + this.path + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = (this.shortName == null) ? 0 : this.shortName.hashCode();
/*     */     return result * 31 + this.path.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof AttachedFile))
/*     */       return false; 
/*     */     AttachedFile attachedFile = (AttachedFile)other;
/*     */     return !Intrinsics.areEqual(this.shortName, attachedFile.shortName) ? false : (!!Intrinsics.areEqual(this.path, attachedFile.path));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\prompt\AttachedFile.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */