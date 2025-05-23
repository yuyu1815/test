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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003¢\006\004\b\005\020\006J\t\020\n\032\0020\003HÆ\003J\t\020\013\032\0020\003HÆ\003J\035\020\f\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\001HÖ\003J\t\020\020\032\0020\021HÖ\001J\t\020\022\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\b¨\006\023"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemovePlainSurroundings$Affixes;", "", "prefix", "", "suffix", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPrefix", "()Ljava/lang/String;", "getSuffix", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class Affixes
/*    */ {
/*    */   @NotNull
/*    */   private final String prefix;
/*    */   @NotNull
/*    */   private final String suffix;
/*    */   
/*    */   public Affixes(@NotNull String prefix, @NotNull String suffix) {
/* 25 */     this.prefix = prefix; this.suffix = suffix; } @NotNull public final String getPrefix() { return this.prefix; } @NotNull public final String getSuffix() { return this.suffix; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.prefix;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.suffix;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Affixes copy(@NotNull String prefix, @NotNull String suffix) {
/*    */     Intrinsics.checkNotNullParameter(prefix, "prefix");
/*    */     Intrinsics.checkNotNullParameter(suffix, "suffix");
/*    */     return new Affixes(prefix, suffix);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Affixes(prefix=" + this.prefix + ", suffix=" + this.suffix + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.prefix.hashCode();
/*    */     return result * 31 + this.suffix.hashCode();
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
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelPostProcessorDescriptor$RemovePlainSurroundings$Affixes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */