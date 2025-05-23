/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*    */ 
/*    */ import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @JsonDeserialize(using = VelocityModelMessageContentDeserializer.class)
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\002\004\005B\t\b\004¢\006\004\b\002\020\003\001\002\006\007¨\006\b"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;", "", "<init>", "()V", "Single", "Multipart", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent$Multipart;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent$Single;", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public abstract class VelocityModelMessageContent {
/*    */   private VelocityModelMessageContent() {}
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\016\n\002\020\013\n\000\n\002\020\000\n\002\b\003\b\b\030\0002\0020\001B%\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007¢\006\004\b\b\020\tB'\b\026\022\006\020\002\032\0020\007\022\b\b\002\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007¢\006\004\b\b\020\nJ\t\020\021\032\0020\003HÆ\003J\t\020\022\032\0020\005HÆ\003J\013\020\023\032\004\030\0010\007HÆ\003J)\020\024\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\007HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\030HÖ\003J\t\020\031\032\0020\005HÖ\001J\t\020\032\032\0020\007HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\017\020\020¨\006\033"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent$Single;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;", "content", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent;", "priority", "", "slice", "", "<init>", "(Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent;ILjava/lang/String;)V", "(Ljava/lang/String;ILjava/lang/String;)V", "getContent", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent;", "getPriority", "()I", "getSlice", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */   public static final class Single extends VelocityModelMessageContent
/*    */   {
/*    */     @NotNull
/*    */     private final VelocityModelSingleMessageContent content;
/*    */     private final int priority;
/*    */     @Nullable
/*    */     private final String slice;
/*    */     
/*    */     @NotNull
/* 26 */     public final VelocityModelSingleMessageContent getContent() { return this.content; }
/* 27 */     public final int getPriority() { return this.priority; } @Nullable
/* 28 */     public final String getSlice() { return this.slice; }
/* 29 */     public Single(@NotNull VelocityModelSingleMessageContent content, int priority, @Nullable String slice) { super(null); this.content = content; this.priority = priority;
/* 30 */       this.slice = slice; } public Single(@NotNull String content, int priority, @Nullable String slice) { this(new VelocityModelSingleMessageContent.Plain(content), priority, slice); } @NotNull public final VelocityModelSingleMessageContent component1() { return this.content; } public final int component2() { return this.priority; } @Nullable public final String component3() { return this.slice; } @NotNull public final Single copy(@NotNull VelocityModelSingleMessageContent content, int priority, @Nullable String slice) { Intrinsics.checkNotNullParameter(content, "content"); return new Single(content, priority, slice); } @NotNull public String toString() { return "Single(content=" + this.content + ", priority=" + this.priority + ", slice=" + this.slice + ")"; } public int hashCode() { result = this.content.hashCode(); result = result * 31 + Integer.hashCode(this.priority); return result * 31 + ((this.slice == null) ? 0 : this.slice.hashCode()); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Single)) return false;  Single single = (Single)other; return !Intrinsics.areEqual(this.content, single.content) ? false : ((this.priority != single.priority) ? false : (!!Intrinsics.areEqual(this.slice, single.slice))); }
/*    */   } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006J\017\020\t\032\b\022\004\022\0020\0040\003HÆ\003J\031\020\n\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\016HÖ\003J\t\020\017\032\0020\020HÖ\001J\t\020\021\032\0020\022HÖ\001R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\007\020\b¨\006\023"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent$Multipart;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;", "parts", "", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent$Single;", "<init>", "(Ljava/util/List;)V", "getParts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "tasks-provider-llm-prompt-velocity-model"}) public static final class Multipart extends VelocityModelMessageContent
/*    */   {
/* 33 */     public Multipart(@NotNull List<VelocityModelMessageContent.Single> parts) { super(null); this.parts = parts; } @NotNull private final List<VelocityModelMessageContent.Single> parts; @NotNull public final List<VelocityModelMessageContent.Single> getParts() { return this.parts; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final List<VelocityModelMessageContent.Single> component1() {
/*    */       return this.parts;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Multipart copy(@NotNull List<VelocityModelMessageContent.Single> parts) {
/*    */       Intrinsics.checkNotNullParameter(parts, "parts");
/*    */       return new Multipart(parts);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Multipart(parts=" + this.parts + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.parts.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Multipart))
/*    */         return false; 
/*    */       Multipart multipart = (Multipart)other;
/*    */       return !!Intrinsics.areEqual(this.parts, multipart.parts);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelMessageContent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */