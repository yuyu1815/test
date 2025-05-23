/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/GuidelinesEntry;", "", "description", "", "filePath", "Ljava/nio/file/Path;", "<init>", "(Ljava/lang/String;Ljava/nio/file/Path;)V", "getDescription", "()Ljava/lang/String;", "getFilePath", "()Ljava/nio/file/Path;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class GuidelinesEntry
/*    */ {
/*    */   @NotNull
/*    */   private final String description;
/*    */   @NotNull
/*    */   private final Path filePath;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public GuidelinesEntry(@NotNull String description, @NotNull Path filePath) {
/* 22 */     this.description = description;
/* 23 */     this.filePath = filePath; } @NotNull public final Path getFilePath() { return this.filePath; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getDescription() {
/*    */     return this.description;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\prompt\GuidelinesEntry.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */