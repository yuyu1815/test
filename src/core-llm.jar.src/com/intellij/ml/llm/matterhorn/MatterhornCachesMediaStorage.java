/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import java.nio.file.Path;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\020\022\n\002\b\004\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\006\032\0020\0072\006\020\b\032\0020\t2\b\020\n\032\004\030\0010\007H\026J\022\020\013\032\004\030\0010\t2\006\020\f\032\0020\007H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/MatterhornCachesMediaStorage;", "Lcom/intellij/ml/llm/matterhorn/MediaStorage;", "caches", "Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;)V", "store", "", "content", "", "originalFilePath", "get", "mediaContentId", "core"})
/*    */ @SourceDebugExtension({"SMAP\nMatterhornCachesMediaStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornCachesMediaStorage.kt\ncom/intellij/ml/llm/matterhorn/MatterhornCachesMediaStorage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
/*    */ public final class MatterhornCachesMediaStorage implements MediaStorage {
/*  8 */   public MatterhornCachesMediaStorage(@NotNull MatterhornCaches caches) { this.caches = caches; } @NotNull
/*    */   private final MatterhornCaches caches; @NotNull
/* 10 */   public String store(@NotNull byte[] content, @Nullable String originalFilePath) { Intrinsics.checkNotNullParameter(content, "content"); String hashCode = HashUtilsKt.hash256(content);
/* 11 */     String it = originalFilePath;
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
/* 26 */     int $i$a$-let-MatterhornCachesMediaStorage$store$originalFilePath$1 = 0;
/*    */     Path path = (originalFilePath != null) ? PathHelpers.INSTANCE.tryGetPathWithSameExtension(originalFilePath) : null;
/*    */     if (ContentTypeHelpers.INSTANCE.getContentTypeByPath(path) == null || ContentTypeHelpers.INSTANCE.getContentTypeByPath(path).getContentType() == null)
/*    */       ContentTypeHelpers.INSTANCE.getContentTypeByPath(path).getContentType(); 
/*    */     String contentType = "file";
/*    */     String fileName = (path != null) ? (contentType + "-" + contentType + "." + hashCode) : ("image-" + hashCode + ".jpg");
/*    */     this.caches.saveBinary(CacheType.Media, fileName, content);
/*    */     return fileName; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public byte[] get(@NotNull String mediaContentId) {
/*    */     Intrinsics.checkNotNullParameter(mediaContentId, "mediaContentId");
/*    */     return this.caches.loadBinary(CacheType.Media, mediaContentId);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\MatterhornCachesMediaStorage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */