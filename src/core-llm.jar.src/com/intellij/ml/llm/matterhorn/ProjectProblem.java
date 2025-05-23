/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B%\b\020\022\006\020\006\032\0020\007\022\b\020\002\032\004\030\0010\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ\t\020\r\032\0020\003HÆ\003J\023\020\016\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\007HÖ\001J\t\020\023\032\0020\003HÖ\001J%\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032H\001¢\006\002\b\033R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\f¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectProblem;", "", "message", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*    */ public final class ProjectProblem { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final String message; public boolean equals(@Nullable Object other) { if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ProjectProblem))
/*    */       return false; 
/*    */     ProjectProblem projectProblem = (ProjectProblem)other;
/*    */     return !!Intrinsics.areEqual(this.message, projectProblem.message); } public int hashCode() { return this.message.hashCode(); } @NotNull
/*    */   public String toString() { return "ProjectProblem(message=" + this.message + ")"; } @NotNull
/*    */   public final ProjectProblem copy(@NotNull String message) { Intrinsics.checkNotNullParameter(message, "message");
/*    */     return new ProjectProblem(message); } @NotNull
/*    */   public final String component1() { return this.message; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectProblem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ProjectProblem;", "core"})
/*    */   public static final class Companion { @NotNull
/* 21 */     public final KSerializer<ProjectProblem> serializer() { return (KSerializer<ProjectProblem>)ProjectProblem.$serializer.INSTANCE; } private Companion() {} } @NotNull
/* 22 */   public final String getMessage() { return this.message; } public ProjectProblem(@NotNull String message) { this.message = message; }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ProjectProblem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */