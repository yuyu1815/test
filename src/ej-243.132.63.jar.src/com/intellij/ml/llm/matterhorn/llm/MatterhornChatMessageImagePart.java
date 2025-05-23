/*     */ package com.intellij.ml.llm.matterhorn.llm;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.helpers.ImageContentHelper;
/*     */ import io.ktor.http.ContentType;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.io.encoding.Base64;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SerialName("image")
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002#$B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006B/\b\020\022\006\020\007\032\0020\b\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\t\032\004\030\0010\n¢\006\004\b\005\020\013J\006\020\021\032\0020\003J\t\020\022\032\0020\003HÆ\003J\t\020\023\032\0020\003HÆ\003J\035\020\024\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\030HÖ\003J\t\020\031\032\0020\bHÖ\001J\t\020\032\032\0020\003HÖ\001J%\020\033\032\0020\0342\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!H\001¢\006\002\b\"R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\016\020\rR\024\020\017\032\0020\0038VX\004¢\006\006\032\004\b\020\020\r¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessagePart;", "contentType", "", "base64", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContentType", "()Ljava/lang/String;", "getBase64", "representation", "getRepresentation", "toMarkdown", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "Companion", "$serializer", "core"})
/*     */ public final class MatterhornChatMessageImagePart
/*     */   implements MatterhornChatMessagePart
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String contentType;
/*     */   @NotNull
/*     */   private final String base64;
/*     */   public static final int PROMPT_CACHE_OFFSET_USER_MESSAGES = 0;
/*     */   
/*     */   @NotNull
/*     */   public final String getContentType() {
/*     */     return this.contentType;
/*     */   }
/*     */   
/*     */   public MatterhornChatMessageImagePart(@NotNull String contentType, @NotNull String base64) {
/*  85 */     this.contentType = contentType;
/*  86 */     this.base64 = base64; } @NotNull public final String getBase64() { return this.base64; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\022\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013J\030\020\f\032\004\030\0010\0072\006\020\r\032\0020\0162\006\020\017\032\0020\020J\016\020\021\032\0020\0072\006\020\022\032\0020\023J\f\020\024\032\b\022\004\022\0020\0070\025R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart$Companion;", "", "<init>", "()V", "PROMPT_CACHE_OFFSET_USER_MESSAGES", "", "fromBytes", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart;", "mediaType", "", "data", "", "fromBufferedImage", "image", "Ljava/awt/image/BufferedImage;", "contentType", "Lio/ktor/http/ContentType;", "fromPath", "file", "Ljava/nio/file/Path;", "serializer", "Lkotlinx/serialization/KSerializer;", "core"}) @SourceDebugExtension({"SMAP\nMatterhornChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornChat.kt\ncom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
/*     */   public static final class Companion { @NotNull
/*  88 */     public final KSerializer<MatterhornChatMessageImagePart> serializer() { return (KSerializer<MatterhornChatMessageImagePart>)MatterhornChatMessageImagePart.$serializer.INSTANCE; }
/*     */     
/*     */     private Companion() {}
/*     */     @NotNull
/*     */     public final MatterhornChatMessageImagePart fromBytes(@NotNull String mediaType, @NotNull byte[] data) {
/*  93 */       Intrinsics.checkNotNullParameter(mediaType, "mediaType"); Intrinsics.checkNotNullParameter(data, "data"); return new MatterhornChatMessageImagePart(mediaType, Base64.encode$default((Base64)Base64.Default, data, 0, 0, 6, null)); } @Nullable
/*     */     public final MatterhornChatMessageImagePart fromBufferedImage(@NotNull BufferedImage image, @NotNull ContentType contentType) {
/*  95 */       Intrinsics.checkNotNullParameter(image, "image"); Intrinsics.checkNotNullParameter(contentType, "contentType"); byte[] bytes = ImageContentHelper.INSTANCE.encodeImage(image, contentType);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 341 */       int $i$a$-let-MatterhornChatMessageImagePart$Companion$fromBufferedImage$1 = 0;
/*     */       ImageContentHelper.INSTANCE.encodeImage(image, contentType);
/*     */       return (ImageContentHelper.INSTANCE.encodeImage(image, contentType) != null) ? MatterhornChatMessageImagePart.Companion.fromBytes(contentType.toString(), bytes) : null;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final MatterhornChatMessageImagePart fromPath(@NotNull Path file) {
/*     */       String mimeType;
/*     */       Intrinsics.checkNotNullParameter(file, "file");
/*     */       if (Files.probeContentType(file) == null) {
/*     */         Files.probeContentType(file);
/*     */         throw new IllegalArgumentException("Can't probe content type of " + file);
/*     */       } 
/*     */       Intrinsics.checkNotNullExpressionValue(Files.readAllBytes(file), "readAllBytes(...)");
/*     */       return fromBytes(mimeType, Files.readAllBytes(file));
/*     */     } }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String getRepresentation() {
/*     */     return "data:" + this.contentType + ";base64,...";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String toMarkdown() {
/*     */     return "![image](data:" + this.contentType + ";base64," + this.base64 + ")";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.contentType;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.base64;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MatterhornChatMessageImagePart copy(@NotNull String contentType, @NotNull String base64) {
/*     */     Intrinsics.checkNotNullParameter(contentType, "contentType");
/*     */     Intrinsics.checkNotNullParameter(base64, "base64");
/*     */     return new MatterhornChatMessageImagePart(contentType, base64);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "MatterhornChatMessageImagePart(contentType=" + this.contentType + ", base64=" + this.base64 + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.contentType.hashCode();
/*     */     return result * 31 + this.base64.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof MatterhornChatMessageImagePart))
/*     */       return false; 
/*     */     MatterhornChatMessageImagePart matterhornChatMessageImagePart = (MatterhornChatMessageImagePart)other;
/*     */     return !Intrinsics.areEqual(this.contentType, matterhornChatMessageImagePart.contentType) ? false : (!!Intrinsics.areEqual(this.base64, matterhornChatMessageImagePart.base64));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\MatterhornChatMessageImagePart.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */