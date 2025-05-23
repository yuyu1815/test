/*    */ package com.intellij.ml.llm.matterhorn.ej.idea;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\036\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH@¢\006\002\020\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/JavaSensitiveFileDetector;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SensitiveFileDetector;", "<init>", "()V", "isSensitiveFile", "", "project", "Lcom/intellij/openapi/project/Project;", "path", "Ljava/nio/file/Path;", "(Lcom/intellij/openapi/project/Project;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-idea"})
/*    */ public final class JavaSensitiveFileDetector implements SensitiveFileDetector {
/*    */   @Nullable
/*    */   public Object isSensitiveFile(@NotNull Project project, @NotNull Path path, @NotNull Continuation $completion) {
/*  9 */     Intrinsics.checkNotNullExpressionValue(path.getFileName().toString().toLowerCase(Locale.ROOT), "toLowerCase(...)"); String fileName = path.getFileName().toString().toLowerCase(Locale.ROOT);
/* 10 */     return 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 20 */       Boxing.boxBoolean((StringsKt.endsWith$default(fileName, ".gradle", false, 2, null) || StringsKt.endsWith$default(fileName, ".gradle.kts", false, 2, null) || StringsKt.endsWith$default(fileName, ".pom", false, 2, null) || StringsKt.endsWith$default(fileName, ".properties", false, 2, null) || StringsKt.endsWith$default(fileName, ".toml", false, 2, null) || Intrinsics.areEqual(fileName, "build.gradle") || Intrinsics.areEqual(fileName, "build.gradle.kts") || Intrinsics.areEqual(fileName, "settings.gradle") || Intrinsics.areEqual(fileName, "settings.gradle.kts") || Intrinsics.areEqual(fileName, "pom.xml") || Intrinsics.areEqual(fileName, "gradle.properties")));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\JavaSensitiveFileDetector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */