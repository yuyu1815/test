/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SealedClassSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.ArrayListSerializer;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\020!\n\000\n\002\030\002\n\002\b\004\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 !2\0020\001:\002 !B\007¢\006\004\b\002\020\003B\027\b\026\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\004\b\002\020\007B+\b\020\022\006\020\b\032\0020\t\022\016\020\n\032\n\022\004\022\0020\006\030\0010\013\022\b\020\f\032\004\030\0010\r¢\006\004\b\002\020\016J\016\020\021\032\0020\0222\006\020\023\032\0020\024J\016\020\025\032\0020\0222\006\020\026\032\0020\006J\016\020\025\032\0020\0222\006\020\026\032\0020\000J\b\020\027\032\0020\030H\026J%\020\031\032\0020\0222\006\020\032\032\0020\0002\006\020\033\032\0020\0342\006\020\035\032\0020\036H\001¢\006\002\b\037R\027\020\n\032\b\022\004\022\0020\0060\013¢\006\b\n\000\032\004\b\017\020\020¨\006\""}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureFileChanges;", "", "<init>", "()V", "changeList", "", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureChange;", "(Ljava/util/List;)V", "seen0", "", "changes", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getChanges", "()Ljava/util/List;", "apply", "", "fileStructure", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;", "append", "other", "toString", "", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */ public final class ProjectFileStructureFileChanges
/*     */ {
/*     */   @NotNull
/* 104 */   public static final Companion Companion = new Companion(null); @NotNull private final List<ProjectFileStructureChange> changes; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer1 = new KSerializer[1]; KClass[] arrayOfKClass = new KClass[5]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(ProjectFileStructureCreateFileChange.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ProjectFileStructureCreateMediaChange.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(ProjectFileStructureRemoveFileChange.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(ProjectFileStructureRenameFileChange.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(ProjectFileStructureUpdateFileChange.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[5]; arrayOfKSerializer2[0] = (KSerializer)ProjectFileStructureCreateFileChange.$serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)ProjectFileStructureCreateMediaChange.$serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)ProjectFileStructureRemoveFileChange.$serializer.INSTANCE; arrayOfKSerializer2[3] = (KSerializer)ProjectFileStructureRenameFileChange.$serializer.INSTANCE; arrayOfKSerializer2[4] = (KSerializer)ProjectFileStructureUpdateFileChange.$serializer.INSTANCE; arrayOfKSerializer1[0] = (KSerializer)new ArrayListSerializer((KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.ProjectFileStructureChange", Reflection.getOrCreateKotlinClass(ProjectFileStructureChange.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0])); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureFileChanges$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureFileChanges;", "core"}) public static final class Companion { @NotNull public final KSerializer<ProjectFileStructureFileChanges> serializer() { return (KSerializer<ProjectFileStructureFileChanges>)ProjectFileStructureFileChanges.$serializer.INSTANCE; }
/*     */      private Companion() {} } public ProjectFileStructureFileChanges() {
/* 106 */     this.changes = new ArrayList<>(); } @NotNull public final List<ProjectFileStructureChange> getChanges() { return this.changes; }
/*     */    public ProjectFileStructureFileChanges(@NotNull List changeList) {
/* 108 */     this();
/* 109 */     for (ProjectFileStructureChange change : changeList)
/* 110 */       append(change); 
/*     */   }
/*     */   
/*     */   public final void apply(@NotNull ProjectFileStructure fileStructure) {
/* 114 */     Intrinsics.checkNotNullParameter(fileStructure, "fileStructure"); for (ProjectFileStructureChange change : this.changes) {
/* 115 */       change.applyChange(fileStructure);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void append(@NotNull ProjectFileStructureChange other) {
/* 120 */     Intrinsics.checkNotNullParameter(other, "other"); this.changes.add(other);
/*     */   }
/*     */   
/*     */   public final void append(@NotNull ProjectFileStructureFileChanges other) {
/* 124 */     Intrinsics.checkNotNullParameter(other, "other"); this.changes.addAll(other.changes);
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 128 */     return CollectionsKt.joinToString$default(this.changes, "\n----------------------------\n", null, null, 0, null, null, 62, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ProjectFileStructureFileChanges.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */