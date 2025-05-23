/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\bÆ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\b\032\0020\t2\b\020\n\032\004\030\0010\013HÖ\003J\t\020\f\032\0020\rHÖ\001J\t\020\016\032\0020\005HÖ\001R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction$BuildAction;", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;", "<init>", "()V", "allowListActionName", "", "getAllowListActionName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "core"})
/*     */ public final class BuildAction
/*     */   extends HumanInLoopAction
/*     */ {
/*     */   @NotNull
/*     */   public static final BuildAction INSTANCE = new BuildAction();
/*     */   
/*     */   private BuildAction() {
/*  99 */     super(ActionType.Build, null); } @NotNull
/*     */   public String getAllowListActionName() {
/* 101 */     return "build";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "BuildAction";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return -1425675042;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof BuildAction))
/*     */       return false; 
/*     */     (BuildAction)other;
/*     */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\HumanInLoopAction$BuildAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */