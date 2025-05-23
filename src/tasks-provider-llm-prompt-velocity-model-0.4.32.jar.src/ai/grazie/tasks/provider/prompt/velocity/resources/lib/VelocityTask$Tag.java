/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*    */ 
/*    */ import ai.grazie.tasks.provider.prompt.velocity.resources.model.VelocityModelTaskTagDescriptor;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\016\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\022\032\0020\003HÆ\003J\t\020\023\032\0020\005HÆ\003J\035\020\024\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\030HÖ\003J\t\020\031\032\0020\032HÖ\001J\t\020\033\032\0020\rHÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\024\020\f\032\0020\r8VX\004¢\006\006\032\004\b\016\020\017R\024\020\020\032\0020\r8VX\004¢\006\006\032\004\b\021\020\017¨\006\034"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTask$Tag;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/EntityTag;", "descriptor", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelTaskTagDescriptor;", "promptPath", "Ljava/nio/file/Path;", "<init>", "(Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelTaskTagDescriptor;Ljava/nio/file/Path;)V", "getDescriptor", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelTaskTagDescriptor;", "getPromptPath", "()Ljava/nio/file/Path;", "tagName", "", "getTagName", "()Ljava/lang/String;", "model", "getModel", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class Tag implements EntityTag {
/*    */   @NotNull
/*    */   private final VelocityModelTaskTagDescriptor descriptor;
/*    */   @NotNull
/*    */   private final Path promptPath;
/*    */   
/*    */   @NotNull
/*    */   public final VelocityModelTaskTagDescriptor getDescriptor() {
/*    */     return this.descriptor;
/*    */   }
/*    */   
/* 20 */   public Tag(@NotNull VelocityModelTaskTagDescriptor descriptor, @NotNull Path promptPath) { this.descriptor = descriptor;
/* 21 */     this.promptPath = promptPath; } @NotNull public final Path getPromptPath() { return this.promptPath; }
/*    */    @NotNull
/*    */   public String getTagName() {
/* 24 */     return this.descriptor.getTag();
/*    */   } @NotNull
/*    */   public String getModel() {
/* 27 */     return this.descriptor.getModel();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VelocityModelTaskTagDescriptor component1() {
/*    */     return this.descriptor;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Path component2() {
/*    */     return this.promptPath;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Tag copy(@NotNull VelocityModelTaskTagDescriptor descriptor, @NotNull Path promptPath) {
/*    */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*    */     Intrinsics.checkNotNullParameter(promptPath, "promptPath");
/*    */     return new Tag(descriptor, promptPath);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Tag(descriptor=" + this.descriptor + ", promptPath=" + this.promptPath + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.descriptor.hashCode();
/*    */     return result * 31 + this.promptPath.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Tag))
/*    */       return false; 
/*    */     Tag tag = (Tag)other;
/*    */     return !Intrinsics.areEqual(this.descriptor, tag.descriptor) ? false : (!!Intrinsics.areEqual(this.promptPath, tag.promptPath));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityTask$Tag.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */