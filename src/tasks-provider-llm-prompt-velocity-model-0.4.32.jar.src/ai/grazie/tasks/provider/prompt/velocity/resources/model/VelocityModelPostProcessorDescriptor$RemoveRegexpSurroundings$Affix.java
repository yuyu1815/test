/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\f\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005¢\006\004\b\006\020\007J\t\020\r\032\0020\003HÆ\003J\020\020\016\032\004\030\0010\005HÆ\003¢\006\002\020\013J$\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\005HÆ\001¢\006\002\020\020J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001HÖ\003J\t\020\024\032\0020\005HÖ\001J\t\020\025\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\025\020\004\032\004\030\0010\005¢\006\n\n\002\020\f\032\004\b\n\020\013¨\006\026"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings$Affix;", "", "pattern", "", "maxMatchLength", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getPattern", "()Ljava/lang/String;", "getMaxMatchLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings$Affix;", "equals", "", "other", "hashCode", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class Affix
/*    */ {
/*    */   @NotNull
/*    */   private final String pattern;
/*    */   @Nullable
/*    */   private final Integer maxMatchLength;
/*    */   
/*    */   public Affix(@NotNull String pattern, @Nullable Integer maxMatchLength) {
/* 33 */     this.pattern = pattern; this.maxMatchLength = maxMatchLength; } @NotNull public final String getPattern() { return this.pattern; } @Nullable public final Integer getMaxMatchLength() { return this.maxMatchLength; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.pattern;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer component2() {
/*    */     return this.maxMatchLength;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Affix copy(@NotNull String pattern, @Nullable Integer maxMatchLength) {
/*    */     Intrinsics.checkNotNullParameter(pattern, "pattern");
/*    */     return new Affix(pattern, maxMatchLength);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Affix(pattern=" + this.pattern + ", maxMatchLength=" + this.maxMatchLength + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.pattern.hashCode();
/*    */     return result * 31 + ((this.maxMatchLength == null) ? 0 : this.maxMatchLength.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Affix))
/*    */       return false; 
/*    */     Affix affix = (Affix)other;
/*    */     return !Intrinsics.areEqual(this.pattern, affix.pattern) ? false : (!!Intrinsics.areEqual(this.maxMatchLength, affix.maxMatchLength));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings$Affix.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */