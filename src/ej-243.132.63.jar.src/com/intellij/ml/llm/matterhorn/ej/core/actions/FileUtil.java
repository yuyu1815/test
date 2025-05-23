/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.openapi.vfs.VirtualFileUtil;
/*    */ import com.intellij.util.concurrency.annotations.RequiresReadLock;
/*    */ import com.intellij.util.concurrency.annotations.RequiresWriteLock;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\032\020\004\032\004\030\0010\0052\006\020\006\032\0020\0052\006\020\007\032\0020\bH\007J\f\020\t\032\0020\n*\0020\005H\007¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/FileUtil;", "", "<init>", "()V", "createFileCreatingDirsIfMissing", "Lcom/intellij/openapi/vfs/VirtualFile;", "baseDir", "path", "Ljava/nio/file/Path;", "isEmpty", "", "ej-core"})
/*    */ public final class FileUtil
/*    */ {
/*    */   @NotNull
/*    */   public static final FileUtil INSTANCE = new FileUtil();
/*    */   
/*    */   @RequiresWriteLock
/*    */   @Nullable
/*    */   public final VirtualFile createFileCreatingDirsIfMissing(@NotNull VirtualFile baseDir, @NotNull Path path) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'baseDir'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'path'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_2
/*    */     //   13: invokeinterface isAbsolute : ()Z
/*    */     //   18: istore_3
/*    */     //   19: aload_2
/*    */     //   20: invokeinterface getParent : ()Ljava/nio/file/Path;
/*    */     //   25: astore #4
/*    */     //   27: aload_2
/*    */     //   28: invokeinterface getFileName : ()Ljava/nio/file/Path;
/*    */     //   33: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   36: astore #5
/*    */     //   38: iload_3
/*    */     //   39: istore #7
/*    */     //   41: iload #7
/*    */     //   43: iconst_1
/*    */     //   44: if_icmpne -> 75
/*    */     //   47: invokestatic getInstance : ()Lcom/intellij/openapi/vfs/VirtualFileManager;
/*    */     //   50: aload #4
/*    */     //   52: dup
/*    */     //   53: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   56: invokevirtual findFileByNioPath : (Ljava/nio/file/Path;)Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   59: dup
/*    */     //   60: ifnonnull -> 134
/*    */     //   63: pop
/*    */     //   64: aload #4
/*    */     //   66: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   69: invokestatic createDirectoryIfMissing : (Ljava/lang/String;)Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   72: goto -> 134
/*    */     //   75: iload #7
/*    */     //   77: ifne -> 126
/*    */     //   80: aload_2
/*    */     //   81: invokeinterface getParent : ()Ljava/nio/file/Path;
/*    */     //   86: astore #8
/*    */     //   88: aload #8
/*    */     //   90: ifnull -> 122
/*    */     //   93: aload_1
/*    */     //   94: aload #8
/*    */     //   96: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   99: getstatic java/io/File.separator : Ljava/lang/String;
/*    */     //   102: dup
/*    */     //   103: ldc 'separator'
/*    */     //   105: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   108: ldc '/'
/*    */     //   110: iconst_0
/*    */     //   111: iconst_4
/*    */     //   112: aconst_null
/*    */     //   113: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
/*    */     //   116: invokestatic createDirectoryIfMissing : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;)Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   119: goto -> 134
/*    */     //   122: aload_1
/*    */     //   123: goto -> 134
/*    */     //   126: new kotlin/NoWhenBranchMatchedException
/*    */     //   129: dup
/*    */     //   130: invokespecial <init> : ()V
/*    */     //   133: athrow
/*    */     //   134: astore #6
/*    */     //   136: aload #6
/*    */     //   138: dup
/*    */     //   139: ifnull -> 151
/*    */     //   142: aload_0
/*    */     //   143: aload #5
/*    */     //   145: invokevirtual createChildData : (Ljava/lang/Object;Ljava/lang/String;)Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   148: goto -> 153
/*    */     //   151: pop
/*    */     //   152: aconst_null
/*    */     //   153: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 12
/*    */     //   #17	-> 19
/*    */     //   #18	-> 27
/*    */     //   #19	-> 38
/*    */     //   #20	-> 41
/*    */     //   #21	-> 47
/*    */     //   #21	-> 69
/*    */     //   #23	-> 75
/*    */     //   #24	-> 80
/*    */     //   #25	-> 88
/*    */     //   #26	-> 93
/*    */     //   #26	-> 99
/*    */     //   #28	-> 122
/*    */     //   #19	-> 126
/*    */     //   #32	-> 136
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   88	35	8	parentPath	Ljava/nio/file/Path;
/*    */     //   19	135	3	isAbsolutePath	Z
/*    */     //   27	127	4	parentDir	Ljava/nio/file/Path;
/*    */     //   38	116	5	fileName	Ljava/lang/String;
/*    */     //   136	18	6	startDir	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   0	154	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/FileUtil;
/*    */     //   0	154	1	baseDir	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   0	154	2	path	Ljava/nio/file/Path;
/*    */   }
/*    */   
/*    */   @RequiresReadLock
/*    */   public final boolean isEmpty(@NotNull VirtualFile $this$isEmpty) {
/* 36 */     Intrinsics.checkNotNullParameter($this$isEmpty, "<this>"); return (((CharSequence)VirtualFileUtil.readText($this$isEmpty)).length() == 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\FileUtil.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */