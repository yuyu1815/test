/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\030\0002\0060\001j\002`\002B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/FailedDependencyException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "artifact", "Lcom/intellij/ml/llm/matterhorn/FailedArtifact;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/FailedArtifact;)V", "getArtifact", "()Lcom/intellij/ml/llm/matterhorn/FailedArtifact;", "core"})
/*    */ public final class FailedDependencyException
/*    */   extends RuntimeException
/*    */ {
/*    */   @NotNull
/*    */   private final FailedArtifact artifact;
/*    */   
/*    */   public FailedDependencyException(@NotNull FailedArtifact artifact) {
/* 25 */     super("Failed to build '" + artifact.getId().getName() + "." + artifact.getId().getType() + "'"); this.artifact = artifact; } @NotNull public final FailedArtifact getArtifact() { return this.artifact; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\FailedDependencyException.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */