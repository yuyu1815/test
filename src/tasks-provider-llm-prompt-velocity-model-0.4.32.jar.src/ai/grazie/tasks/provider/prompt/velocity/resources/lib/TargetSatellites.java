/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*    */ 
/*    */ import java.nio.file.Path;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020 \n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0030\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\017\020\r\032\b\022\004\022\0020\0030\005HÆ\003J#\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0030\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\025HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\027\020\004\032\b\022\004\022\0020\0030\005¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TargetSatellites;", "", "parameters", "Ljava/nio/file/Path;", "tags", "", "<init>", "(Ljava/nio/file/Path;Ljava/util/List;)V", "getParameters", "()Ljava/nio/file/Path;", "getTags", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class TargetSatellites {
/*    */   @NotNull
/*    */   private final Path parameters;
/*    */   
/* 13 */   public TargetSatellites(@NotNull Path parameters, @NotNull List<Path> tags) { this.parameters = parameters;
/* 14 */     this.tags = tags; } @NotNull private final List<Path> tags; @NotNull public final List<Path> getTags() { return this.tags; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Path getParameters() {
/*    */     return this.parameters;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Path component1() {
/*    */     return this.parameters;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<Path> component2() {
/*    */     return this.tags;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TargetSatellites copy(@NotNull Path parameters, @NotNull List<? extends Path> tags) {
/*    */     Intrinsics.checkNotNullParameter(parameters, "parameters");
/*    */     Intrinsics.checkNotNullParameter(tags, "tags");
/*    */     return new TargetSatellites(parameters, tags);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TargetSatellites(parameters=" + this.parameters + ", tags=" + this.tags + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.parameters.hashCode();
/*    */     return result * 31 + this.tags.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TargetSatellites))
/*    */       return false; 
/*    */     TargetSatellites targetSatellites = (TargetSatellites)other;
/*    */     return !Intrinsics.areEqual(this.parameters, targetSatellites.parameters) ? false : (!!Intrinsics.areEqual(this.tags, targetSatellites.tags));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\TargetSatellites.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */