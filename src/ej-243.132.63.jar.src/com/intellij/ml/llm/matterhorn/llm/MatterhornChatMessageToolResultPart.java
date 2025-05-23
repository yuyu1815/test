/*    */ package com.intellij.ml.llm.matterhorn.llm;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
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
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @SerialName("toolResult")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\005\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \"2\0020\001:\002!\"B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B%\b\020\022\006\020\006\032\0020\007\022\b\020\002\032\004\030\0010\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ\t\020\021\032\0020\003HÆ\003J\023\020\022\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\026HÖ\003J\t\020\027\032\0020\007HÖ\001J\t\020\030\032\0020\016HÖ\001J%\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037H\001¢\006\002\b R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\0168VX\004¢\006\006\032\004\b\017\020\020¨\006#"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageToolResultPart;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessagePart;", "toolResult", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolResult;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolResult;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/llm/MatterhornToolResult;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getToolResult", "()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolResult;", "representation", "", "getRepresentation", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*    */ public final class MatterhornChatMessageToolResultPart
/*    */   implements MatterhornChatMessagePart
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final MatterhornToolResult toolResult;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageToolResultPart$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageToolResultPart;", "core"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<MatterhornChatMessageToolResultPart> serializer() {
/* 76 */       return (KSerializer<MatterhornChatMessageToolResultPart>)MatterhornChatMessageToolResultPart.$serializer.INSTANCE;
/*    */     }
/* 78 */   } public MatterhornChatMessageToolResultPart(@NotNull MatterhornToolResult toolResult) { this.toolResult = toolResult; } @NotNull public final MatterhornToolResult getToolResult() { return this.toolResult; } @NotNull
/* 79 */   public String getRepresentation() { return this.toolResult.toString(); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final MatterhornToolResult component1() {
/*    */     return this.toolResult;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MatterhornChatMessageToolResultPart copy(@NotNull MatterhornToolResult toolResult) {
/*    */     Intrinsics.checkNotNullParameter(toolResult, "toolResult");
/*    */     return new MatterhornChatMessageToolResultPart(toolResult);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "MatterhornChatMessageToolResultPart(toolResult=" + this.toolResult + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.toolResult.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof MatterhornChatMessageToolResultPart))
/*    */       return false; 
/*    */     MatterhornChatMessageToolResultPart matterhornChatMessageToolResultPart = (MatterhornChatMessageToolResultPart)other;
/*    */     return !!Intrinsics.areEqual(this.toolResult, matterhornChatMessageToolResultPart.toolResult);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\MatterhornChatMessageToolResultPart.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */