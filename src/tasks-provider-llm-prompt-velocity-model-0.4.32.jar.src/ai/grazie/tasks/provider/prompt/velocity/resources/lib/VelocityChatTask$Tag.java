/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*    */ 
/*    */ import ai.grazie.tasks.provider.prompt.velocity.resources.model.VelocityModelChatTaskTagDescriptor;
/*    */ import java.nio.file.Path;
/*    */ import java.util.List;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\t\n\002\020\016\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007¢\006\004\b\t\020\nJ\t\020\027\032\0020\003HÆ\003J\t\020\030\032\0020\005HÆ\003J\021\020\031\032\n\022\004\022\0020\b\030\0010\007HÆ\003J/\020\032\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\020\b\002\020\006\032\n\022\004\022\0020\b\030\0010\007HÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\036HÖ\003J\t\020\037\032\0020 HÖ\001J\t\020!\032\0020\022HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016R\031\020\006\032\n\022\004\022\0020\b\030\0010\007¢\006\b\n\000\032\004\b\017\020\020R\024\020\021\032\0020\0228VX\004¢\006\006\032\004\b\023\020\024R\024\020\025\032\0020\0228VX\004¢\006\006\032\004\b\026\020\024¨\006\""}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityChatTask$Tag;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/EntityTag;", "descriptor", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelChatTaskTagDescriptor;", "promptPath", "Ljava/nio/file/Path;", "functions", "", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionTagDescriptor;", "<init>", "(Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelChatTaskTagDescriptor;Ljava/nio/file/Path;Ljava/util/List;)V", "getDescriptor", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelChatTaskTagDescriptor;", "getPromptPath", "()Ljava/nio/file/Path;", "getFunctions", "()Ljava/util/List;", "tagName", "", "getTagName", "()Ljava/lang/String;", "model", "getModel", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class Tag
/*    */   implements EntityTag
/*    */ {
/*    */   @NotNull
/*    */   private final VelocityModelChatTaskTagDescriptor descriptor;
/*    */   @NotNull
/*    */   private final Path promptPath;
/*    */   @Nullable
/*    */   private final List<VelocityFunctionTagDescriptor> functions;
/*    */   
/*    */   @NotNull
/*    */   public final VelocityModelChatTaskTagDescriptor getDescriptor() {
/*    */     return this.descriptor;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Path getPromptPath() {
/*    */     return this.promptPath;
/*    */   }
/*    */   
/*    */   public Tag(@NotNull VelocityModelChatTaskTagDescriptor descriptor, @NotNull Path promptPath, @Nullable List<VelocityFunctionTagDescriptor> functions) {
/* 42 */     this.descriptor = descriptor;
/* 43 */     this.promptPath = promptPath;
/* 44 */     this.functions = functions; } @Nullable public final List<VelocityFunctionTagDescriptor> getFunctions() { return this.functions; }
/*    */    @NotNull
/*    */   public String getTagName() {
/* 47 */     return this.descriptor.getTag();
/*    */   } @NotNull
/*    */   public String getModel() {
/* 50 */     return this.descriptor.getModel();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VelocityModelChatTaskTagDescriptor component1() {
/*    */     return this.descriptor;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Path component2() {
/*    */     return this.promptPath;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final List<VelocityFunctionTagDescriptor> component3() {
/*    */     return this.functions;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Tag copy(@NotNull VelocityModelChatTaskTagDescriptor descriptor, @NotNull Path promptPath, @Nullable List<VelocityFunctionTagDescriptor> functions) {
/*    */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*    */     Intrinsics.checkNotNullParameter(promptPath, "promptPath");
/*    */     return new Tag(descriptor, promptPath, functions);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Tag(descriptor=" + this.descriptor + ", promptPath=" + this.promptPath + ", functions=" + this.functions + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.descriptor.hashCode();
/*    */     result = result * 31 + this.promptPath.hashCode();
/*    */     return result * 31 + ((this.functions == null) ? 0 : this.functions.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Tag))
/*    */       return false; 
/*    */     Tag tag = (Tag)other;
/*    */     return !Intrinsics.areEqual(this.descriptor, tag.descriptor) ? false : (!Intrinsics.areEqual(this.promptPath, tag.promptPath) ? false : (!!Intrinsics.areEqual(this.functions, tag.functions)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityChatTask$Tag.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */