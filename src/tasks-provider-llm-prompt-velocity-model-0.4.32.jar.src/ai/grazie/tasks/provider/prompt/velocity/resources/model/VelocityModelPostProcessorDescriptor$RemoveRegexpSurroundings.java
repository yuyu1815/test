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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\003\b\b\030\0002\0020\001:\002\027\030B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006J\017\020\r\032\b\022\004\022\0020\0040\003HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\026HÖ\001R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nX\004¢\006\b\n\000\032\004\b\013\020\f¨\006\031"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor;", "surroundings", "", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings$Affixes;", "<init>", "(Ljava/util/List;)V", "getSurroundings", "()Ljava/util/List;", "kind", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorKind;", "getKind", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorKind;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Affixes", "Affix", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class RemoveRegexpSurroundings
/*    */   extends VelocityModelPostProcessorDescriptor
/*    */ {
/*    */   @NotNull
/*    */   private final List<Affixes> surroundings;
/*    */   @NotNull
/*    */   private final VelocityModelPostProcessorKind kind;
/*    */   
/*    */   public RemoveRegexpSurroundings(@NotNull List<Affixes> surroundings) {
/* 28 */     super(null); this.surroundings = surroundings;
/* 29 */     this.kind = VelocityModelPostProcessorKind.RemoveRegexpSurroundings; } @NotNull public final List<Affixes> getSurroundings() { return this.surroundings; } @NotNull public VelocityModelPostProcessorKind getKind() { return this.kind; } @NotNull public final List<Affixes> component1() { return this.surroundings; } @NotNull public final RemoveRegexpSurroundings copy(@NotNull List<Affixes> surroundings) { Intrinsics.checkNotNullParameter(surroundings, "surroundings"); return new RemoveRegexpSurroundings(surroundings); } @NotNull public String toString() { return "RemoveRegexpSurroundings(surroundings=" + this.surroundings + ")"; } public int hashCode() { return this.surroundings.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof RemoveRegexpSurroundings)) return false;  RemoveRegexpSurroundings removeRegexpSurroundings = (RemoveRegexpSurroundings)other; return !!Intrinsics.areEqual(this.surroundings, removeRegexpSurroundings.surroundings); }
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\037\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\003¢\006\004\b\005\020\006J\013\020\n\032\004\030\0010\003HÆ\003J\013\020\013\032\004\030\0010\003HÆ\003J!\020\f\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\003HÆ\001J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\001HÖ\003J\t\020\020\032\0020\021HÖ\001J\t\020\022\032\0020\023HÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\007\020\bR\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\t\020\b¨\006\024"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings$Affixes;", "", "prefix", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings$Affix;", "suffix", "<init>", "(Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings$Affix;Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings$Affix;)V", "getPrefix", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings$Affix;", "getSuffix", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tasks-provider-llm-prompt-velocity-model"}) public static final class Affixes { @Nullable private final VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix prefix; @Nullable private final VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix suffix;
/* 31 */     public Affixes(@Nullable VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix prefix, @Nullable VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix suffix) { this.prefix = prefix; this.suffix = suffix; } @Nullable public final VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix getPrefix() { return this.prefix; } @Nullable public final VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix getSuffix() { return this.suffix; } @Nullable public final VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix component1() { return this.prefix; } @Nullable public final VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix component2() { return this.suffix; } @NotNull public final Affixes copy(@Nullable VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix prefix, @Nullable VelocityModelPostProcessorDescriptor.RemoveRegexpSurroundings.Affix suffix) { return new Affixes(prefix, suffix); } @NotNull public String toString() { return "Affixes(prefix=" + this.prefix + ", suffix=" + this.suffix + ")"; } public int hashCode() { result = (this.prefix == null) ? 0 : this.prefix.hashCode(); return result * 31 + ((this.suffix == null) ? 0 : this.suffix.hashCode()); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Affixes)) return false;  Affixes affixes = (Affixes)other; return !Intrinsics.areEqual(this.prefix, affixes.prefix) ? false : (!!Intrinsics.areEqual(this.suffix, affixes.suffix)); } public Affixes() { this(null, null, 3, null); } }
/*    */    @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\f\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005¢\006\004\b\006\020\007J\t\020\r\032\0020\003HÆ\003J\020\020\016\032\004\030\0010\005HÆ\003¢\006\002\020\013J$\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\005HÆ\001¢\006\002\020\020J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001HÖ\003J\t\020\024\032\0020\005HÖ\001J\t\020\025\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\025\020\004\032\004\030\0010\005¢\006\n\n\002\020\f\032\004\b\n\020\013¨\006\026"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings$Affix;", "", "pattern", "", "maxMatchLength", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getPattern", "()Ljava/lang/String;", "getMaxMatchLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings$Affix;", "equals", "", "other", "hashCode", "toString", "tasks-provider-llm-prompt-velocity-model"}) public static final class Affix {
/* 33 */     @NotNull private final String pattern; public Affix(@NotNull String pattern, @Nullable Integer maxMatchLength) { this.pattern = pattern; this.maxMatchLength = maxMatchLength; } @Nullable private final Integer maxMatchLength; @NotNull public final String getPattern() { return this.pattern; } @Nullable public final Integer getMaxMatchLength() { return this.maxMatchLength; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.pattern;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Integer component2() {
/*    */       return this.maxMatchLength;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Affix copy(@NotNull String pattern, @Nullable Integer maxMatchLength) {
/*    */       Intrinsics.checkNotNullParameter(pattern, "pattern");
/*    */       return new Affix(pattern, maxMatchLength);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Affix(pattern=" + this.pattern + ", maxMatchLength=" + this.maxMatchLength + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.pattern.hashCode();
/*    */       return result * 31 + ((this.maxMatchLength == null) ? 0 : this.maxMatchLength.hashCode());
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Affix))
/*    */         return false; 
/*    */       Affix affix = (Affix)other;
/*    */       return !Intrinsics.areEqual(this.pattern, affix.pattern) ? false : (!!Intrinsics.areEqual(this.maxMatchLength, affix.maxMatchLength));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */