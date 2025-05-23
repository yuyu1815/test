/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
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
/*    */ @Serializable
/*    */ @SerialName("Create")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\020\002\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 '2\0020\001:\002&'B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\004\b\006\020\007B9\b\020\022\006\020\b\032\0020\t\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\005\032\004\030\0010\003\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ\020\020\021\032\0020\0222\006\020\023\032\0020\024H\026J\b\020\025\032\0020\003H\026J\t\020\026\032\0020\003HÆ\003J\t\020\027\032\0020\003HÆ\003J\t\020\030\032\0020\003HÆ\003J'\020\031\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\003HÆ\001J\023\020\032\032\0020\0332\b\020\034\032\004\030\0010\035HÖ\003J\t\020\036\032\0020\tHÖ\001J%\020\037\032\0020\0222\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$H\001¢\006\002\b%R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\017\020\016R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\020\020\016¨\006("}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureCreateFileChange;", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureChange;", "filePath", "", "content", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFilePath", "()Ljava/lang/String;", "getContent", "getDescription", "applyChange", "", "structure", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;", "toString", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*    */ public final class ProjectFileStructureCreateFileChange
/*    */   implements ProjectFileStructureChange
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String filePath;
/*    */   @NotNull
/*    */   private final String content;
/*    */   @NotNull
/*    */   private final String description;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureCreateFileChange$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureCreateFileChange;", "core"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<ProjectFileStructureCreateFileChange> serializer() {
/* 77 */       return (KSerializer<ProjectFileStructureCreateFileChange>)ProjectFileStructureCreateFileChange.$serializer.INSTANCE;
/*    */     }
/* 79 */   } public ProjectFileStructureCreateFileChange(@NotNull String filePath, @NotNull String content, @NotNull String description) { this.filePath = filePath; this.content = content; this.description = description; } @NotNull public final String getFilePath() { return this.filePath; } @NotNull public final String getContent() { return this.content; } @NotNull public final String getDescription() { return this.description; }
/*    */   
/*    */   public void applyChange(@NotNull ProjectFileStructure structure) {
/* 82 */     Intrinsics.checkNotNullParameter(structure, "structure"); structure.getRoot().updateOrCreateFile(this.filePath, this.content);
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/* 86 */     return "#### Create " + this.filePath + "\n" + this.description + "\n\n```\n" + this.content + "\n```\n";
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.filePath;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.description;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ProjectFileStructureCreateFileChange copy(@NotNull String filePath, @NotNull String content, @NotNull String description) {
/*    */     Intrinsics.checkNotNullParameter(filePath, "filePath");
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     Intrinsics.checkNotNullParameter(description, "description");
/*    */     return new ProjectFileStructureCreateFileChange(filePath, content, description);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.filePath.hashCode();
/*    */     result = result * 31 + this.content.hashCode();
/*    */     return result * 31 + this.description.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ProjectFileStructureCreateFileChange))
/*    */       return false; 
/*    */     ProjectFileStructureCreateFileChange projectFileStructureCreateFileChange = (ProjectFileStructureCreateFileChange)other;
/*    */     return !Intrinsics.areEqual(this.filePath, projectFileStructureCreateFileChange.filePath) ? false : (!Intrinsics.areEqual(this.content, projectFileStructureCreateFileChange.content) ? false : (!!Intrinsics.areEqual(this.description, projectFileStructureCreateFileChange.description)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ProjectFileStructureCreateFileChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */