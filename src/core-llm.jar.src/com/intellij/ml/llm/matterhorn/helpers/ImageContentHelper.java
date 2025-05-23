/*    */ package com.intellij.ml.llm.matterhorn.helpers;
/*    */ 
/*    */ import io.ktor.http.ContentType;
/*    */ import java.awt.image.BufferedImage;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\022\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J \020\004\032\004\030\0010\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0052\006\020\t\032\0020\nJ\030\020\013\032\004\030\0010\0052\006\020\f\032\0020\r2\006\020\006\032\0020\007¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/helpers/ImageContentHelper;", "", "<init>", "()V", "adjustImageData", "", "contentType", "Lio/ktor/http/ContentType;", "imageData", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "encodeImage", "image", "Ljava/awt/image/BufferedImage;", "core"})
/*    */ @SourceDebugExtension({"SMAP\nImageContentHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageContentHelper.kt\ncom/intellij/ml/llm/matterhorn/helpers/ImageContentHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,36:1\n1#2:37\n14#3:38\n*S KotlinDebug\n*F\n+ 1 ImageContentHelper.kt\ncom/intellij/ml/llm/matterhorn/helpers/ImageContentHelper\n*L\n30#1:38\n*E\n"})
/*    */ public final class ImageContentHelper {
/*    */   @NotNull
/*    */   public static final ImageContentHelper INSTANCE = new ImageContentHelper();
/*    */   
/*    */   @Nullable
/* 14 */   public final byte[] adjustImageData(@NotNull ContentType contentType, @NotNull byte[] imageData, @NotNull ModelParameters modelParameters) { Intrinsics.checkNotNullParameter(contentType, "contentType"); Intrinsics.checkNotNullParameter(imageData, "imageData"); Intrinsics.checkNotNullParameter(modelParameters, "modelParameters"); Object adjustedData = null; adjustedData = imageData;
/* 15 */     LLMVision vision = modelParameters.getModel().getCapabilities().getVision(); int $i$a$-let-ImageContentHelper$adjustImageData$1 = 0;
/* 16 */     ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageData); Throwable throwable = null; try { ByteArrayInputStream it = byteArrayInputStream;
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
/* 37 */       int $i$a$-use-ImageContentHelper$adjustImageData$1$bufferedImage$1 = 0; BufferedImage bufferedImage1 = ImageIO.read(it); } catch (Throwable throwable1) { throwable = throwable1 = null; throw throwable1; } finally { CloseableKt.closeFinally(byteArrayInputStream, throwable); }  BufferedImage bufferedImage = bufferedImage1; Dimension adjustedSize = vision.getMaxSupportedSize(new Dimension(bufferedImage.getWidth(), bufferedImage.getHeight())); if (adjustedSize.width != bufferedImage.getWidth() || adjustedSize.height != bufferedImage.getHeight()) { BufferedImage resizedImage = Scalr.resize(bufferedImage, adjustedSize.width, adjustedSize.height, new java.awt.image.BufferedImageOp[0]); Intrinsics.checkNotNull(resizedImage); if (INSTANCE.encodeImage(resizedImage, contentType) == null) { INSTANCE.encodeImage(resizedImage, contentType); return null; }  }  modelParameters.getModel().getCapabilities().getVision(); return (byte[])adjustedData; } @Nullable public final byte[] encodeImage(@NotNull BufferedImage image, @NotNull ContentType contentType) { Intrinsics.checkNotNullParameter(image, "image"); Intrinsics.checkNotNullParameter(contentType, "contentType"); boolean bool = contentType.match(ContentType.Image.INSTANCE.getAny()); if (_Assertions.ENABLED && !bool) { String str = "Assertion failed"; throw new AssertionError(str); }
/* 38 */      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); Throwable throwable = null; try { ByteArrayOutputStream bos = byteArrayOutputStream; int $i$a$-use-ImageContentHelper$encodeImage$1 = 0; if (!ImageIO.write(image, contentType.getContentSubtype(), bos)) { int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(ImageContentHelper.class), "getInstance(...)"); Logger.getInstance(ImageContentHelper.class).error("Failed to write image to stream. No appropriate writer found.");
/*    */         return null; }
/*    */       
/*    */       byte[] arrayOfByte = bos.toByteArray(); }
/*    */     catch (Throwable throwable1)
/*    */     { throwable = throwable1 = null;
/*    */       throw throwable1; }
/*    */     finally
/*    */     { CloseableKt.closeFinally(byteArrayOutputStream, throwable); }
/*    */     
/*    */     return arrayOfByte; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\helpers\ImageContentHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */