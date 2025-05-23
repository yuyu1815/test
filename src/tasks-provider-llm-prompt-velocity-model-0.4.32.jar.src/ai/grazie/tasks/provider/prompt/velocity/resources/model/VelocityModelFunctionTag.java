/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\r\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\003HÆ\003J\t\020\016\032\0020\003HÆ\003J'\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\003HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\n\020\tR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\013\020\t¨\006\026"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelFunctionTag;", "", "tag", "", "model", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "getModel", "getDescription", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class VelocityModelFunctionTag
/*    */ {
/*    */   @NotNull
/*    */   private final String tag;
/*    */   @NotNull
/*    */   private final String model;
/*    */   @NotNull
/*    */   private final String description;
/*    */   
/*    */   public VelocityModelFunctionTag(@NotNull String tag, @NotNull String model, @NotNull String description) {
/* 21 */     this.tag = tag;
/* 22 */     this.model = model;
/* 23 */     this.description = description; } @NotNull public final String getDescription() { return this.description; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getTag() {
/*    */     return this.tag;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getModel() {
/*    */     return this.model;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.tag;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.model;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.description;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VelocityModelFunctionTag copy(@NotNull String tag, @NotNull String model, @NotNull String description) {
/*    */     Intrinsics.checkNotNullParameter(tag, "tag");
/*    */     Intrinsics.checkNotNullParameter(model, "model");
/*    */     Intrinsics.checkNotNullParameter(description, "description");
/*    */     return new VelocityModelFunctionTag(tag, model, description);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "VelocityModelFunctionTag(tag=" + this.tag + ", model=" + this.model + ", description=" + this.description + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.tag.hashCode();
/*    */     result = result * 31 + this.model.hashCode();
/*    */     return result * 31 + this.description.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof VelocityModelFunctionTag))
/*    */       return false; 
/*    */     VelocityModelFunctionTag velocityModelFunctionTag = (VelocityModelFunctionTag)other;
/*    */     return !Intrinsics.areEqual(this.tag, velocityModelFunctionTag.tag) ? false : (!Intrinsics.areEqual(this.model, velocityModelFunctionTag.model) ? false : (!!Intrinsics.areEqual(this.description, velocityModelFunctionTag.description)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelFunctionTag.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */