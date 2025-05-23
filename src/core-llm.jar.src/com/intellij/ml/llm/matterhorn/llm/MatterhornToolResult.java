/*     */ package com.intellij.ml.llm.matterhorn.llm;
/*     */ 
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
/*     */ import kotlinx.serialization.internal.BooleanSerializer;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\021\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 (2\0020\001:\002'(B+\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006\022\n\b\002\020\007\032\004\030\0010\b¢\006\004\b\t\020\nBA\b\020\022\006\020\013\032\0020\f\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\006\020\005\032\0020\006\022\b\020\007\032\004\030\0010\b\022\b\020\r\032\004\030\0010\016¢\006\004\b\t\020\017J\b\020\026\032\0020\003H\026J\t\020\027\032\0020\003HÆ\003J\t\020\030\032\0020\003HÆ\003J\t\020\031\032\0020\006HÆ\003J\013\020\032\032\004\030\0010\bHÆ\003J3\020\033\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0062\n\b\002\020\007\032\004\030\0010\bHÆ\001J\023\020\034\032\0020\0062\b\020\035\032\004\030\0010\001HÖ\003J\t\020\036\032\0020\fHÖ\001J%\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%H\001¢\006\002\b&R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\020\020\021R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\022\020\021R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\005\020\023R\023\020\007\032\004\030\0010\b¢\006\b\n\000\032\004\b\024\020\025¨\006)"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolResult;", "", "id", "", "content", "isError", "", "image", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZLcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getContent", "()Z", "getImage", "()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart;", "toString", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */ public final class MatterhornToolResult
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String id;
/*     */   @NotNull
/*     */   private final String content;
/*     */   private final boolean isError;
/*     */   @Nullable
/*     */   private final MatterhornChatMessageImagePart image;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolResult;", "core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<MatterhornToolResult> serializer() {
/* 144 */       return (KSerializer<MatterhornToolResult>)MatterhornToolResult.$serializer.INSTANCE;
/* 145 */     } } public MatterhornToolResult(@NotNull String id, @NotNull String content, boolean isError, @Nullable MatterhornChatMessageImagePart image) { this.id = id; this.content = content; this.isError = isError; this.image = image; } @NotNull public final String getId() { return this.id; } @NotNull public final String getContent() { return this.content; } public final boolean isError() { return this.isError; } @Nullable public final MatterhornChatMessageImagePart getImage() { return this.image; } @NotNull
/*     */   public String toString() {
/* 147 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$toString_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-MatterhornToolResult$toString$1 = 0;
/* 148 */     $this$toString_u24lambda_u240.append("id: \"" + this.id + "\"");
/* 149 */     if (this.isError) $this$toString_u24lambda_u240.append(" isError: true"); 
/* 150 */     if ((((CharSequence)this.content).length() > 0)) $this$toString_u24lambda_u240.append(' ').append(this.content); 
/* 151 */     if (this.image != null) { Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append('\n'), "append(...)"); $this$toString_u24lambda_u240.append('\n').append(" image: " + this.image.getRepresentation()); }
/*     */     
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.id;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.content;
/*     */   }
/*     */   
/*     */   public final boolean component3() {
/*     */     return this.isError;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final MatterhornChatMessageImagePart component4() {
/*     */     return this.image;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MatterhornToolResult copy(@NotNull String id, @NotNull String content, boolean isError, @Nullable MatterhornChatMessageImagePart image) {
/*     */     Intrinsics.checkNotNullParameter(id, "id");
/*     */     Intrinsics.checkNotNullParameter(content, "content");
/*     */     return new MatterhornToolResult(id, content, isError, image);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.id.hashCode();
/*     */     result = result * 31 + this.content.hashCode();
/*     */     result = result * 31 + Boolean.hashCode(this.isError);
/*     */     return result * 31 + ((this.image == null) ? 0 : this.image.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof MatterhornToolResult))
/*     */       return false; 
/*     */     MatterhornToolResult matterhornToolResult = (MatterhornToolResult)other;
/*     */     return !Intrinsics.areEqual(this.id, matterhornToolResult.id) ? false : (!Intrinsics.areEqual(this.content, matterhornToolResult.content) ? false : ((this.isError != matterhornToolResult.isError) ? false : (!!Intrinsics.areEqual(this.image, matterhornToolResult.image))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\llm\MatterhornToolResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */