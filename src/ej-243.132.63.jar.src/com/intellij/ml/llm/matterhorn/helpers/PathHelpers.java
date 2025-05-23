/*    */ package com.intellij.ml.llm.matterhorn.helpers;
/*    */ import java.nio.file.InvalidPathException;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.Paths;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\005J\020\020\007\032\004\030\0010\b2\006\020\t\032\0020\005¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/helpers/PathHelpers;", "", "<init>", "()V", "getExtension", "", "fileName", "tryGetPathWithSameExtension", "Ljava/nio/file/Path;", "pathString", "core"})
/*    */ public final class PathHelpers {
/*    */   @NotNull
/*    */   public final String getExtension(@NotNull String fileName) {
/* 12 */     Intrinsics.checkNotNullParameter(fileName, "fileName"); for (int i = fileName.length() - 1; -1 < i; i--) {
/* 13 */       char ch = fileName.charAt(i);
/* 14 */       switch (ch) { case '.':
/* 15 */           Intrinsics.checkNotNullExpressionValue(fileName.substring(i + 1), "substring(...)");
/*    */         case '/':
/*    */         case '\\':
/*    */          }
/*    */     
/* 20 */     }  return "";
/*    */   }
/*    */   @NotNull
/*    */   public static final PathHelpers INSTANCE = new PathHelpers();
/*    */   @Nullable
/*    */   public final Path tryGetPathWithSameExtension(@NotNull String pathString) {
/*    */     Path path;
/* 27 */     Intrinsics.checkNotNullParameter(pathString, "pathString"); 
/* 28 */     try { Intrinsics.checkNotNullExpressionValue(Paths.get(pathString, new String[0]), "get(...)"); path = Paths.get(pathString, new String[0]); }
/* 29 */     catch (InvalidPathException <unused var>)
/*    */     { Path path1; 
/* 31 */       try { Intrinsics.checkNotNullExpressionValue(Paths.get("file." + getExtension(pathString), new String[0]), "get(...)"); path1 = Paths.get("file." + getExtension(pathString), new String[0]); }
/* 32 */       catch (InvalidPathException invalidPathException)
/* 33 */       { return null; }  path = path1; }  return path;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\helpers\PathHelpers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */