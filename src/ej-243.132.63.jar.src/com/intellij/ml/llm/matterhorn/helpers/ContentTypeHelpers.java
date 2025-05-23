/*    */ package com.intellij.ml.llm.matterhorn.helpers;
/*    */ 
/*    */ import java.nio.file.Path;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\004\030\0010\0052\006\020\006\032\0020\007J\020\020\004\032\004\030\0010\0052\006\020\b\032\0020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/helpers/ContentTypeHelpers;", "", "<init>", "()V", "getContentTypeByPath", "Lio/ktor/http/ContentType;", "pathString", "", "path", "Ljava/nio/file/Path;", "core"})
/*    */ @SourceDebugExtension({"SMAP\nContentTypeHelpers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentTypeHelpers.kt\ncom/intellij/ml/llm/matterhorn/helpers/ContentTypeHelpers\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,15:1\n1#2:16\n*E\n"})
/*    */ public final class ContentTypeHelpers {
/*    */   @Nullable
/*  9 */   public final ContentType getContentTypeByPath(@NotNull String pathString) { Intrinsics.checkNotNullParameter(pathString, "pathString"); Path it = PathHelpers.INSTANCE.tryGetPathWithSameExtension(pathString);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 16 */     int $i$a$-let-ContentTypeHelpers$getContentTypeByPath$1 = 0; PathHelpers.INSTANCE.tryGetPathWithSameExtension(pathString); return (PathHelpers.INSTANCE.tryGetPathWithSameExtension(pathString) != null) ? INSTANCE.getContentTypeByPath(it) : null; } @NotNull public static final ContentTypeHelpers INSTANCE = new ContentTypeHelpers(); @Nullable public final ContentType getContentTypeByPath(@NotNull Path path) { Intrinsics.checkNotNullParameter(path, "path"); String it = Files.probeContentType(path); int $i$a$-let-ContentTypeHelpers$getContentTypeByPath$2 = 0;
/*    */     Files.probeContentType(path);
/*    */     return (Files.probeContentType(path) != null) ? ContentType.Companion.parse(it) : null; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\helpers\ContentTypeHelpers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */