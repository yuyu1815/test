/*     */ package com.intellij.ml.llm.matterhorn.llm;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.helpers.ImageContentHelper;
/*     */ import io.ktor.http.ContentType;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.io.encoding.Base64;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.KSerializer;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\022\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013J\030\020\f\032\004\030\0010\0072\006\020\r\032\0020\0162\006\020\017\032\0020\020J\016\020\021\032\0020\0072\006\020\022\032\0020\023J\f\020\024\032\b\022\004\022\0020\0070\025R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart$Companion;", "", "<init>", "()V", "PROMPT_CACHE_OFFSET_USER_MESSAGES", "", "fromBytes", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart;", "mediaType", "", "data", "", "fromBufferedImage", "image", "Ljava/awt/image/BufferedImage;", "contentType", "Lio/ktor/http/ContentType;", "fromPath", "file", "Ljava/nio/file/Path;", "serializer", "Lkotlinx/serialization/KSerializer;", "core"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornChat.kt\ncom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final KSerializer<MatterhornChatMessageImagePart> serializer() {
/*  88 */     return (KSerializer<MatterhornChatMessageImagePart>)MatterhornChatMessageImagePart.$serializer.INSTANCE;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MatterhornChatMessageImagePart fromBytes(@NotNull String mediaType, @NotNull byte[] data) {
/*  93 */     Intrinsics.checkNotNullParameter(mediaType, "mediaType"); Intrinsics.checkNotNullParameter(data, "data"); return new MatterhornChatMessageImagePart(mediaType, Base64.encode$default((Base64)Base64.Default, data, 0, 0, 6, null)); } @Nullable
/*     */   public final MatterhornChatMessageImagePart fromBufferedImage(@NotNull BufferedImage image, @NotNull ContentType contentType) {
/*  95 */     Intrinsics.checkNotNullParameter(image, "image"); Intrinsics.checkNotNullParameter(contentType, "contentType"); byte[] bytes = ImageContentHelper.INSTANCE.encodeImage(image, contentType);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 341 */     int $i$a$-let-MatterhornChatMessageImagePart$Companion$fromBufferedImage$1 = 0;
/*     */     ImageContentHelper.INSTANCE.encodeImage(image, contentType);
/*     */     return (ImageContentHelper.INSTANCE.encodeImage(image, contentType) != null) ? MatterhornChatMessageImagePart.Companion.fromBytes(contentType.toString(), bytes) : null;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MatterhornChatMessageImagePart fromPath(@NotNull Path file) {
/*     */     String mimeType;
/*     */     Intrinsics.checkNotNullParameter(file, "file");
/*     */     if (Files.probeContentType(file) == null) {
/*     */       Files.probeContentType(file);
/*     */       throw new IllegalArgumentException("Can't probe content type of " + file);
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(Files.readAllBytes(file), "readAllBytes(...)");
/*     */     return fromBytes(mimeType, Files.readAllBytes(file));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\MatterhornChatMessageImagePart$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */