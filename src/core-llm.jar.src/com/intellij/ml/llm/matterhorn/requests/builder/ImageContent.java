/*    */ package com.intellij.ml.llm.matterhorn.requests.builder;
/*    */ 
/*    */ import io.ktor.http.ContentType;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\022\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J \020\f\032\004\030\0010\r2\006\020\016\032\0020\0172\006\020\020\032\0020\021H@¢\006\002\020\022R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/ImageContent;", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content;", "contentType", "Lio/ktor/http/ContentType;", "imageData", "", "<init>", "(Lio/ktor/http/ContentType;[B)V", "getContentType", "()Lio/ktor/http/ContentType;", "getImageData", "()[B", "toChatMessagePart", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessagePart;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
/*    */ public final class ImageContent implements GrazieRequest.Content {
/*    */   @NotNull
/*    */   private final ContentType contentType;
/*    */   
/* 11 */   public ImageContent(@NotNull ContentType contentType, @NotNull byte[] imageData) { this.contentType = contentType; this.imageData = imageData; } @NotNull private final byte[] imageData; @NotNull public final ContentType getContentType() { return this.contentType; } @NotNull public final byte[] getImageData() { return this.imageData; } @Nullable
/*    */   public Object toChatMessagePart(@NotNull ExecutionContext context, @NotNull ModelParameters modelParameters, @NotNull Continuation $completion) { byte[] adjustedData;
/* 13 */     if (ImageContentHelper.INSTANCE.adjustImageData(this.contentType, this.imageData, modelParameters) == null) { ImageContentHelper.INSTANCE.adjustImageData(this.contentType, this.imageData, modelParameters); return null; }
/* 14 */      return MatterhornChatMessageImagePart.Companion.fromBytes(this.contentType.toString(), adjustedData); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\requests\builder\ImageContent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */