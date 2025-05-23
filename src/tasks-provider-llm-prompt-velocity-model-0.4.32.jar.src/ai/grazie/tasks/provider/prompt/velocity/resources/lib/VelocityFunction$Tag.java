/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*    */ 
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\016\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\022\032\0020\003HÆ\003J\t\020\023\032\0020\005HÆ\003J\035\020\024\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\030HÖ\003J\t\020\031\032\0020\032HÖ\001J\t\020\033\032\0020\rHÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\024\020\f\032\0020\r8VX\004¢\006\006\032\004\b\016\020\017R\024\020\020\032\0020\r8VX\004¢\006\006\032\004\b\021\020\017¨\006\034"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction$Tag;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/EntityTag;", "tag", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionTag;", "implementation", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionImpl;", "<init>", "(Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionTag;Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionImpl;)V", "getTag", "()Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionTag;", "getImplementation", "()Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionImpl;", "tagName", "", "getTagName", "()Ljava/lang/String;", "model", "getModel", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class Tag
/*    */   implements EntityTag
/*    */ {
/*    */   @NotNull
/*    */   private final VelocityFunctionTag tag;
/*    */   @NotNull
/*    */   private final VelocityFunctionImpl implementation;
/*    */   
/*    */   public Tag(@NotNull VelocityFunctionTag tag, @NotNull VelocityFunctionImpl implementation) {
/* 30 */     this.tag = tag; this.implementation = implementation; } @NotNull public final VelocityFunctionTag getTag() { return this.tag; } @NotNull public final VelocityFunctionImpl getImplementation() { return this.implementation; } @NotNull
/*    */   public String getTagName() {
/* 32 */     return this.tag.getTagName();
/*    */   } @NotNull
/*    */   public String getModel() {
/* 35 */     return this.tag.getLlmProfileId();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VelocityFunctionTag component1() {
/*    */     return this.tag;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VelocityFunctionImpl component2() {
/*    */     return this.implementation;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Tag copy(@NotNull VelocityFunctionTag tag, @NotNull VelocityFunctionImpl implementation) {
/*    */     Intrinsics.checkNotNullParameter(tag, "tag");
/*    */     Intrinsics.checkNotNullParameter(implementation, "implementation");
/*    */     return new Tag(tag, implementation);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Tag(tag=" + this.tag + ", implementation=" + this.implementation + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.tag.hashCode();
/*    */     return result * 31 + this.implementation.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Tag))
/*    */       return false; 
/*    */     Tag tag = (Tag)other;
/*    */     return !Intrinsics.areEqual(this.tag, tag.tag) ? false : (!!Intrinsics.areEqual(this.implementation, tag.implementation));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityFunction$Tag.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */