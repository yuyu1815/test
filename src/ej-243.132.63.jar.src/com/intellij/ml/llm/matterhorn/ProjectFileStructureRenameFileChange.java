/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerialName;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Serializable
/*     */ @SerialName("Rename")
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\020\002\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 '2\0020\001:\002&'B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\004\b\006\020\007B9\b\020\022\006\020\b\032\0020\t\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\005\032\004\030\0010\003\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ\020\020\021\032\0020\0222\006\020\023\032\0020\024H\026J\b\020\025\032\0020\003H\026J\t\020\026\032\0020\003HÆ\003J\t\020\027\032\0020\003HÆ\003J\t\020\030\032\0020\003HÆ\003J'\020\031\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\003HÆ\001J\023\020\032\032\0020\0332\b\020\034\032\004\030\0010\035HÖ\003J\t\020\036\032\0020\tHÖ\001J%\020\037\032\0020\0222\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$H\001¢\006\002\b%R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\017\020\016R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\020\020\016¨\006("}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureRenameFileChange;", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureChange;", "oldFilePath", "", "newFilePath", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOldFilePath", "()Ljava/lang/String;", "getNewFilePath", "getDescription", "applyChange", "", "structure", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;", "toString", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */ @SourceDebugExtension({"SMAP\nProjectFileStructureChange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectFileStructureChange.kt\ncom/intellij/ml/llm/matterhorn/ProjectFileStructureRenameFileChange\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
/*     */ public final class ProjectFileStructureRenameFileChange
/*     */   implements ProjectFileStructureChange
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String oldFilePath;
/*     */   @NotNull
/*     */   private final String newFilePath;
/*     */   @NotNull
/*     */   private final String description;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureRenameFileChange$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureRenameFileChange;", "core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<ProjectFileStructureRenameFileChange> serializer() {
/*  60 */       return (KSerializer<ProjectFileStructureRenameFileChange>)ProjectFileStructureRenameFileChange.$serializer.INSTANCE;
/*     */     }
/*  62 */   } public ProjectFileStructureRenameFileChange(@NotNull String oldFilePath, @NotNull String newFilePath, @NotNull String description) { this.oldFilePath = oldFilePath; this.newFilePath = newFilePath; this.description = description; } @NotNull public final String getOldFilePath() { return this.oldFilePath; } @NotNull public final String getNewFilePath() { return this.newFilePath; } @NotNull public final String getDescription() { return this.description; }
/*     */   
/*     */   public void applyChange(@NotNull ProjectFileStructure structure) {
/*  65 */     Intrinsics.checkNotNullParameter(structure, "structure"); if (structure.getRoot().findChild(this.oldFilePath) == null) { structure.getRoot().findChild(this.oldFilePath);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 139 */       int $i$a$-requireNotNull-ProjectFileStructureRenameFileChange$applyChange$oldFile$1 = 0;
/*     */       String str = this.oldFilePath + " does not exist.";
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */     
/*     */     Intrinsics.checkNotNull(structure.getRoot().findChild(this.oldFilePath), "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ProjectStructureFile");
/*     */     ProjectStructureFile oldFile = (ProjectStructureFile)structure.getRoot().findChild(this.oldFilePath);
/*     */     String newFileContent = oldFile.getContent();
/*     */     structure.getRoot().removeChild(this.oldFilePath);
/*     */     structure.getRoot().updateOrCreateFile(this.newFilePath, newFileContent);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     String filePath = Intrinsics.areEqual(this.oldFilePath, this.newFilePath) ? this.newFilePath : (this.oldFilePath + " -> " + this.oldFilePath);
/*     */     return "## Rename " + filePath + "\n\n" + this.description + "\n";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.oldFilePath;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.newFilePath;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component3() {
/*     */     return this.description;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ProjectFileStructureRenameFileChange copy(@NotNull String oldFilePath, @NotNull String newFilePath, @NotNull String description) {
/*     */     Intrinsics.checkNotNullParameter(oldFilePath, "oldFilePath");
/*     */     Intrinsics.checkNotNullParameter(newFilePath, "newFilePath");
/*     */     Intrinsics.checkNotNullParameter(description, "description");
/*     */     return new ProjectFileStructureRenameFileChange(oldFilePath, newFilePath, description);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.oldFilePath.hashCode();
/*     */     result = result * 31 + this.newFilePath.hashCode();
/*     */     return result * 31 + this.description.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ProjectFileStructureRenameFileChange))
/*     */       return false; 
/*     */     ProjectFileStructureRenameFileChange projectFileStructureRenameFileChange = (ProjectFileStructureRenameFileChange)other;
/*     */     return !Intrinsics.areEqual(this.oldFilePath, projectFileStructureRenameFileChange.oldFilePath) ? false : (!Intrinsics.areEqual(this.newFilePath, projectFileStructureRenameFileChange.newFilePath) ? false : (!!Intrinsics.areEqual(this.description, projectFileStructureRenameFileChange.description)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ProjectFileStructureRenameFileChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */