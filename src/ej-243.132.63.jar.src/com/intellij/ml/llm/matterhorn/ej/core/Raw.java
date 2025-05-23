/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import kotlin.Metadata;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\000\br\030\0002\0020\001:\003\006\007\bR\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005\001\003\t\n\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/Raw;", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "getFile", "()Lcom/intellij/openapi/vfs/VirtualFile;", "Create", "Delete", "Modify", "Lcom/intellij/ml/llm/matterhorn/ej/core/Raw$Create;", "Lcom/intellij/ml/llm/matterhorn/ej/core/Raw$Delete;", "Lcom/intellij/ml/llm/matterhorn/ej/core/Raw$Modify;", "ej-core"})
/*     */ interface Raw
/*     */ {
/*     */   @NotNull
/*     */   VirtualFile getFile();
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/Raw$Create;", "Lcom/intellij/ml/llm/matterhorn/ej/core/Raw;", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "after", "", "<init>", "(Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;)V", "getFile", "()Lcom/intellij/openapi/vfs/VirtualFile;", "getAfter", "()Ljava/lang/String;", "ej-core"})
/*     */   public static final class Create
/*     */     implements Raw
/*     */   {
/*     */     @NotNull
/*     */     private final VirtualFile file;
/*     */     @NotNull
/*     */     private final String after;
/*     */     
/*     */     public Create(@NotNull VirtualFile file, @NotNull String after) {
/* 277 */       this.file = file; this.after = after; } @NotNull public VirtualFile getFile() { return this.file; } @NotNull public final String getAfter() { return this.after; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/Raw$Delete;", "Lcom/intellij/ml/llm/matterhorn/ej/core/Raw;", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "before", "", "<init>", "(Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;)V", "getFile", "()Lcom/intellij/openapi/vfs/VirtualFile;", "getBefore", "()Ljava/lang/String;", "ej-core"}) public static final class Delete implements Raw { @NotNull private final VirtualFile file; @NotNull
/* 278 */     private final String before; public Delete(@NotNull VirtualFile file, @NotNull String before) { this.file = file; this.before = before; } @NotNull public VirtualFile getFile() { return this.file; } @NotNull public final String getBefore() { return this.before; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\t\030\0002\0020\001B#\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005¢\006\004\b\007\020\bR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\t\020\nR\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\013\020\fR\023\020\006\032\004\030\0010\005¢\006\b\n\000\032\004\b\r\020\f¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/Raw$Modify;", "Lcom/intellij/ml/llm/matterhorn/ej/core/Raw;", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "before", "", "after", "<init>", "(Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Lcom/intellij/openapi/vfs/VirtualFile;", "getBefore", "()Ljava/lang/String;", "getAfter", "ej-core"})
/*     */   public static final class Modify implements Raw { @NotNull
/* 280 */     private final VirtualFile file; public Modify(@NotNull VirtualFile file, @Nullable String before, @Nullable String after) { this.file = file;
/* 281 */       this.before = before; this.after = after; } @Nullable private final String before; @Nullable private final String after; @NotNull public VirtualFile getFile() { return this.file; } @Nullable public final String getBefore() { return this.before; } @Nullable public final String getAfter() { return this.after; }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\Raw.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */