/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006J\t\020\n\032\0020\003HÆ\003J\t\020\013\032\0020\003HÆ\003J\035\020\f\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\001HÖ\003J\t\020\020\032\0020\021HÖ\001J\t\020\022\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\b¨\006\023"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionTag;", "", "tagName", "", "llmProfileId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTagName", "()Ljava/lang/String;", "getLlmProfileId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class VelocityFunctionTag {
/*    */   @NotNull
/*    */   private final String tagName;
/*    */   @NotNull
/*    */   private final String llmProfileId;
/*    */   
/* 14 */   public VelocityFunctionTag(@NotNull String tagName, @NotNull String llmProfileId) { this.tagName = tagName; this.llmProfileId = llmProfileId; } @NotNull public final String getTagName() { return this.tagName; } @NotNull public final String getLlmProfileId() { return this.llmProfileId; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.tagName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.llmProfileId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VelocityFunctionTag copy(@NotNull String tagName, @NotNull String llmProfileId) {
/*    */     Intrinsics.checkNotNullParameter(tagName, "tagName");
/*    */     Intrinsics.checkNotNullParameter(llmProfileId, "llmProfileId");
/*    */     return new VelocityFunctionTag(tagName, llmProfileId);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "VelocityFunctionTag(tagName=" + this.tagName + ", llmProfileId=" + this.llmProfileId + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.tagName.hashCode();
/*    */     return result * 31 + this.llmProfileId.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof VelocityFunctionTag))
/*    */       return false; 
/*    */     VelocityFunctionTag velocityFunctionTag = (VelocityFunctionTag)other;
/*    */     return !Intrinsics.areEqual(this.tagName, velocityFunctionTag.tagName) ? false : (!!Intrinsics.areEqual(this.llmProfileId, velocityFunctionTag.llmProfileId));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityFunctionTag.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */