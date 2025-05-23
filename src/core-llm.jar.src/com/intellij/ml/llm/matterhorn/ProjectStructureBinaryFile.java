/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import com.intellij.openapi.vfs.LargeFileWriteRequestor;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\n\002\020\b\n\000\n\002\030\002\n\002\b\n\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0372\0020\0012\0020\002:\002\036\037B#\022\006\020\003\032\0020\004\022\b\020\005\032\004\030\0010\004\022\b\b\002\020\006\032\0020\004¢\006\004\b\007\020\bB9\b\020\022\006\020\t\032\0020\n\022\b\020\003\032\004\030\0010\004\022\b\020\005\032\004\030\0010\004\022\b\020\006\032\004\030\0010\004\022\b\020\013\032\004\030\0010\f¢\006\004\b\007\020\rJ\b\020\025\032\0020\004H\026J%\020\026\032\0020\0272\006\020\030\032\0020\0002\006\020\031\032\0020\0322\006\020\033\032\0020\034H\001¢\006\002\b\035R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\016\020\017R\034\020\005\032\004\030\0010\004X\016¢\006\016\n\000\032\004\b\020\020\017\"\004\b\021\020\022R\032\020\006\032\0020\004X\016¢\006\016\n\000\032\004\b\023\020\017\"\004\b\024\020\022¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectStructureBinaryFile;", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;", "Lcom/intellij/openapi/vfs/LargeFileWriteRequestor;", "name", "", "mediaContentId", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getMediaContentId", "setMediaContentId", "(Ljava/lang/String;)V", "getDescription", "setDescription", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */ public final class ProjectStructureBinaryFile
/*     */   implements ProjectStructureItem, LargeFileWriteRequestor
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String name;
/*     */   @Nullable
/*     */   private String mediaContentId;
/*     */   @NotNull
/*     */   private String description;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectStructureBinaryFile$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureBinaryFile;", "core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<ProjectStructureBinaryFile> serializer() {
/* 144 */       return (KSerializer<ProjectStructureBinaryFile>)ProjectStructureBinaryFile.$serializer.INSTANCE;
/* 145 */     } } public ProjectStructureBinaryFile(@NotNull String name, @Nullable String mediaContentId, @NotNull String description) { this.name = name; this.mediaContentId = mediaContentId; this.description = description; } @NotNull public String getName() { return this.name; } @Nullable public final String getMediaContentId() { return this.mediaContentId; } public final void setMediaContentId(@Nullable String <set-?>) { this.mediaContentId = <set-?>; } @NotNull public final String getDescription() { return this.description; } public final void setDescription(@NotNull String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.description = <set-?>; } @NotNull
/*     */   public String toString() {
/* 147 */     return getName() + ", " + getName() + ", " + this.mediaContentId;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ProjectStructureBinaryFile.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */