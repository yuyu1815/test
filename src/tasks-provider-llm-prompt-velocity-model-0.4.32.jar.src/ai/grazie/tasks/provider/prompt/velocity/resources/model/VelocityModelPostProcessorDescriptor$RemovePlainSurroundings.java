/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\b\030\0002\0020\001:\001\027B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006J\017\020\r\032\b\022\004\022\0020\0040\003HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\026HÖ\001R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nX\004¢\006\b\n\000\032\004\b\013\020\f¨\006\030"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemovePlainSurroundings;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor;", "surroundings", "", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemovePlainSurroundings$Affixes;", "<init>", "(Ljava/util/List;)V", "getSurroundings", "()Ljava/util/List;", "kind", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorKind;", "getKind", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorKind;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Affixes", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class RemovePlainSurroundings
/*    */   extends VelocityModelPostProcessorDescriptor
/*    */ {
/*    */   @NotNull
/*    */   private final List<Affixes> surroundings;
/*    */   @NotNull
/*    */   private final VelocityModelPostProcessorKind kind;
/*    */   
/*    */   public RemovePlainSurroundings(@NotNull List<Affixes> surroundings) {
/* 22 */     super(null); this.surroundings = surroundings;
/* 23 */     this.kind = VelocityModelPostProcessorKind.RemovePlainSurroundings; } @NotNull public final List<Affixes> getSurroundings() { return this.surroundings; } @NotNull public VelocityModelPostProcessorKind getKind() { return this.kind; } @NotNull public final List<Affixes> component1() { return this.surroundings; } @NotNull public final RemovePlainSurroundings copy(@NotNull List<Affixes> surroundings) { Intrinsics.checkNotNullParameter(surroundings, "surroundings"); return new RemovePlainSurroundings(surroundings); } @NotNull public String toString() { return "RemovePlainSurroundings(surroundings=" + this.surroundings + ")"; } public int hashCode() { return this.surroundings.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof RemovePlainSurroundings)) return false;  RemovePlainSurroundings removePlainSurroundings = (RemovePlainSurroundings)other; return !!Intrinsics.areEqual(this.surroundings, removePlainSurroundings.surroundings); } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003¢\006\004\b\005\020\006J\t\020\n\032\0020\003HÆ\003J\t\020\013\032\0020\003HÆ\003J\035\020\f\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\001HÖ\003J\t\020\020\032\0020\021HÖ\001J\t\020\022\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\b¨\006\023"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemovePlainSurroundings$Affixes;", "", "prefix", "", "suffix", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPrefix", "()Ljava/lang/String;", "getSuffix", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"}) public static final class Affixes
/*    */   {
/* 25 */     @NotNull private final String prefix; public Affixes(@NotNull String prefix, @NotNull String suffix) { this.prefix = prefix; this.suffix = suffix; } @NotNull private final String suffix; @NotNull public final String getPrefix() { return this.prefix; } @NotNull public final String getSuffix() { return this.suffix; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.prefix;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component2() {
/*    */       return this.suffix;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Affixes copy(@NotNull String prefix, @NotNull String suffix) {
/*    */       Intrinsics.checkNotNullParameter(prefix, "prefix");
/*    */       Intrinsics.checkNotNullParameter(suffix, "suffix");
/*    */       return new Affixes(prefix, suffix);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Affixes(prefix=" + this.prefix + ", suffix=" + this.suffix + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.prefix.hashCode();
/*    */       return result * 31 + this.suffix.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Affixes))
/*    */         return false; 
/*    */       Affixes affixes = (Affixes)other;
/*    */       return !Intrinsics.areEqual(this.prefix, affixes.prefix) ? false : (!!Intrinsics.areEqual(this.suffix, affixes.suffix));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelPostProcessorDescriptor$RemovePlainSurroundings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */