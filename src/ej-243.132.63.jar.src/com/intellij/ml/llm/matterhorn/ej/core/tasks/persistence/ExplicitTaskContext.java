/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.IssueType;
/*    */ import java.nio.file.Path;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.EnumsKt;
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
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\016\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 *2\0020\001:\002)*B)\022\b\b\002\020\002\032\0020\003\022\006\020\004\032\0020\005\022\016\b\002\020\006\032\b\022\004\022\0020\b0\007¢\006\004\b\t\020\nB?\b\020\022\006\020\013\032\0020\f\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\r\032\004\030\0010\016¢\006\004\b\t\020\017J\t\020\030\032\0020\003HÆ\003J\t\020\031\032\0020\005HÆ\003J\017\020\032\032\b\022\004\022\0020\b0\007HÆ\003J-\020\033\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\007HÆ\001J\023\020\034\032\0020\0352\b\020\036\032\004\030\0010\001HÖ\003J\t\020\037\032\0020\fHÖ\001J\t\020 \032\0020\005HÖ\001J%\020!\032\0020\"2\006\020#\032\0020\0002\006\020$\032\0020%2\006\020&\032\0020'H\001¢\006\002\b(R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\020\020\021R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R\"\020\006\032\b\022\004\022\0020\b0\0078\006X\004¢\006\016\n\000\022\004\b\024\020\025\032\004\b\026\020\027¨\006+"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;", "", "type", "Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;", "description", "", "explicitlySelectedContextFiles", "", "Ljava/nio/file/Path;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;Ljava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/ej/core/IssueType;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType", "()Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;", "getDescription", "()Ljava/lang/String;", "getExplicitlySelectedContextFiles$annotations", "()V", "getExplicitlySelectedContextFiles", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class ExplicitTaskContext
/*    */ {
/*    */   @NotNull
/*    */   private final IssueType type;
/*    */   @NotNull
/*    */   private final String description;
/*    */   @NotNull
/* 50 */   public static final Companion Companion = new Companion(null); @NotNull private final List<Path> explicitlySelectedContextFiles; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = EnumsKt.createSimpleEnumSerializer("com.intellij.ml.llm.matterhorn.ej.core.IssueType", (Enum[])IssueType.values()); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;", "ej-core"}) public static final class Companion { @NotNull public final KSerializer<ExplicitTaskContext> serializer() { return (KSerializer<ExplicitTaskContext>)ExplicitTaskContext.$serializer.INSTANCE; }
/*    */      private Companion() {} }
/*    */   public ExplicitTaskContext(@NotNull IssueType type, @NotNull String description, @NotNull List<Path> explicitlySelectedContextFiles) {
/* 53 */     this.type = type;
/* 54 */     this.description = description;
/* 55 */     this.explicitlySelectedContextFiles = explicitlySelectedContextFiles; } @NotNull public final List<Path> getExplicitlySelectedContextFiles() { return this.explicitlySelectedContextFiles; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final IssueType getType() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getDescription() {
/*    */     return this.description;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IssueType component1() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.description;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<Path> component3() {
/*    */     return this.explicitlySelectedContextFiles;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ExplicitTaskContext copy(@NotNull IssueType type, @NotNull String description, @NotNull List<? extends Path> explicitlySelectedContextFiles) {
/*    */     Intrinsics.checkNotNullParameter(type, "type");
/*    */     Intrinsics.checkNotNullParameter(description, "description");
/*    */     Intrinsics.checkNotNullParameter(explicitlySelectedContextFiles, "explicitlySelectedContextFiles");
/*    */     return new ExplicitTaskContext(type, description, explicitlySelectedContextFiles);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ExplicitTaskContext(type=" + this.type + ", description=" + this.description + ", explicitlySelectedContextFiles=" + this.explicitlySelectedContextFiles + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.type.hashCode();
/*    */     result = result * 31 + this.description.hashCode();
/*    */     return result * 31 + this.explicitlySelectedContextFiles.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ExplicitTaskContext))
/*    */       return false; 
/*    */     ExplicitTaskContext explicitTaskContext = (ExplicitTaskContext)other;
/*    */     return (this.type != explicitTaskContext.type) ? false : (!Intrinsics.areEqual(this.description, explicitTaskContext.description) ? false : (!!Intrinsics.areEqual(this.explicitlySelectedContextFiles, explicitTaskContext.explicitlySelectedContextFiles)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\ExplicitTaskContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */