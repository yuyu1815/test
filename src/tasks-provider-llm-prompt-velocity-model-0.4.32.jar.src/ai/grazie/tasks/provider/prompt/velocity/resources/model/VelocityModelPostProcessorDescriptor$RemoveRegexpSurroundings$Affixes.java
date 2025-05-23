/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\037\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\003¢\006\004\b\005\020\006J\013\020\n\032\004\030\0010\003HÆ\003J\013\020\013\032\004\030\0010\003HÆ\003J!\020\f\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\003HÆ\001J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\001HÖ\003J\t\020\020\032\0020\021HÖ\001J\t\020\022\032\0020\023HÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\007\020\bR\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\t\020\b¨\006\024"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings$Affixes;", "", "prefix", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings$Affix;", "suffix", "<init>", "(Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings$Affix;Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings$Affix;)V", "getPrefix", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings$Affix;", "getSuffix", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class Affixes
/*    */ {
/*    */   @Nullable
/*    */   private final VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix prefix;
/*    */   @Nullable
/*    */   private final VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix suffix;
/*    */   
/*    */   public Affixes(@Nullable VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix prefix, @Nullable VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix suffix) {
/* 31 */     this.prefix = prefix; this.suffix = suffix; } @Nullable public final VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix getPrefix() { return this.prefix; } @Nullable public final VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix getSuffix() { return this.suffix; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix component1() {
/*    */     return this.prefix;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix component2() {
/*    */     return this.suffix;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Affixes copy(@Nullable VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix prefix, @Nullable VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix suffix) {
/*    */     return new Affixes(prefix, suffix);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Affixes(prefix=" + this.prefix + ", suffix=" + this.suffix + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.prefix == null) ? 0 : this.prefix.hashCode();
/*    */     return result * 31 + ((this.suffix == null) ? 0 : this.suffix.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Affixes))
/*    */       return false; 
/*    */     Affixes affixes = (Affixes)other;
/*    */     return !Intrinsics.areEqual(this.prefix, affixes.prefix) ? false : (!!Intrinsics.areEqual(this.suffix, affixes.suffix));
/*    */   }
/*    */   
/*    */   public Affixes() {
/*    */     this(null, null, 3, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings$Affixes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */