/*     */ package com.intellij.ml.llm.matterhorn.ej.core.relevance;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatKt;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.KSerializer;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0372\0020\001:\002\036\037B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B%\b\020\022\006\020\006\032\0020\007\022\b\020\002\032\004\030\0010\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ\b\020\r\032\0020\003H\026J\b\020\016\032\004\030\0010\017J\t\020\020\032\0020\003HÆ\003J\023\020\021\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\001HÖ\003J\t\020\025\032\0020\007HÖ\001J%\020\026\032\0020\0272\006\020\030\032\0020\0002\006\020\031\032\0020\0322\006\020\033\032\0020\034H\001¢\006\002\b\035R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\f¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrResponse;", "", "files", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFiles", "()Ljava/lang/String;", "toString", "toUserMessage", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;", "component1", "copy", "equals", "", "other", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*     */ public final class ProjectStrResponse
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String files;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrResponse;", "ej-core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<ProjectStrResponse> serializer() {
/* 105 */       return (KSerializer<ProjectStrResponse>)ProjectStrResponse.$serializer.INSTANCE;
/*     */     }
/* 107 */   } public ProjectStrResponse(@NotNull String files) { this.files = files; } @NotNull public final String getFiles() { return this.files; }
/*     */    @NotNull
/*     */   public String toString() {
/* 110 */     return 
/*     */       
/* 112 */       StringsKt.trimMargin$default("### PROJECT STRUCTURE\n    |" + this.files + "\n    ", null, 1, null);
/*     */   }
/*     */   @Nullable
/*     */   public final MatterhornChatMessage toUserMessage() {
/* 116 */     return ((((CharSequence)this.files).length() > 0)) ? 
/*     */ 
/*     */       
/* 119 */       MatterhornChatKt.toUserMessage(StringsKt.trimMargin$default("## PROJECT STRUCTURE\n      |" + this.files + "\n      ", null, 1, null)) : 
/* 120 */       null;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.files;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ProjectStrResponse copy(@NotNull String files) {
/*     */     Intrinsics.checkNotNullParameter(files, "files");
/*     */     return new ProjectStrResponse(files);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return this.files.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ProjectStrResponse))
/*     */       return false; 
/*     */     ProjectStrResponse projectStrResponse = (ProjectStrResponse)other;
/*     */     return !!Intrinsics.areEqual(this.files, projectStrResponse.files);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\ProjectStrResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */