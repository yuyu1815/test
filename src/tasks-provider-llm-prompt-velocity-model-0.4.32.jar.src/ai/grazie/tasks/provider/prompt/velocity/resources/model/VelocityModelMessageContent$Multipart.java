/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006J\017\020\t\032\b\022\004\022\0020\0040\003HÆ\003J\031\020\n\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\016HÖ\003J\t\020\017\032\0020\020HÖ\001J\t\020\021\032\0020\022HÖ\001R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\007\020\b¨\006\023"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent$Multipart;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;", "parts", "", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent$Single;", "<init>", "(Ljava/util/List;)V", "getParts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class Multipart
/*    */   extends VelocityModelMessageContent
/*    */ {
/*    */   @NotNull
/*    */   private final List<VelocityModelMessageContent.Single> parts;
/*    */   
/*    */   public Multipart(@NotNull List<VelocityModelMessageContent.Single> parts) {
/* 33 */     super(null); this.parts = parts; } @NotNull public final List<VelocityModelMessageContent.Single> getParts() { return this.parts; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final List<VelocityModelMessageContent.Single> component1() {
/*    */     return this.parts;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Multipart copy(@NotNull List<VelocityModelMessageContent.Single> parts) {
/*    */     Intrinsics.checkNotNullParameter(parts, "parts");
/*    */     return new Multipart(parts);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Multipart(parts=" + this.parts + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.parts.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Multipart))
/*    */       return false; 
/*    */     Multipart multipart = (Multipart)other;
/*    */     return !!Intrinsics.areEqual(this.parts, multipart.parts);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelMessageContent$Multipart.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */