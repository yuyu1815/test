/*    */ package com.intellij.ml.llm.matterhorn.ej.core.aiignore;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import java.nio.file.Path;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import kotlin.Result;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\020\016\n\000\n\002\020\"\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\013\n\000\032\026\020\006\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\nH\000\032\020\020\013\032\004\030\0010\b2\006\020\t\032\0020\n\032\032\020\f\032\016\022\004\022\0020\016\022\004\022\0020\0170\r2\006\020\t\032\0020\n\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\032\020\002\032\b\022\004\022\0020\0010\003X\004¢\006\b\n\000\032\004\b\004\020\005¨\006\020"}, d2 = {"AIIGNORE_FILENAME", "", "ALL_FILE_NAMES", "", "getALL_FILE_NAMES", "()Ljava/util/Set;", "guessRoots", "", "Lcom/intellij/openapi/vfs/VirtualFile;", "project", "Lcom/intellij/openapi/project/Project;", "locateFirstIgnoreFile", "obtainAIIgnoreChecker", "Lkotlin/Function1;", "Ljava/nio/file/Path;", "", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nAiIgnoreUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiIgnoreUtil.kt\ncom/intellij/ml/llm/matterhorn/ej/core/aiignore/AiIgnoreUtilKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n11500#2,3:51\n1#3:54\n1863#4,2:55\n*S KotlinDebug\n*F\n+ 1 AiIgnoreUtil.kt\ncom/intellij/ml/llm/matterhorn/ej/core/aiignore/AiIgnoreUtilKt\n*L\n23#1:51,3\n31#1:55,2\n*E\n"})
/*    */ public final class AiIgnoreUtilKt {
/*    */   @NotNull
/*    */   public static final String AIIGNORE_FILENAME = ".aiignore";
/*    */   @NotNull
/* 17 */   private static final Set<String> ALL_FILE_NAMES = SetsKt.setOf(".aiignore"); @NotNull public static final Set<String> getALL_FILE_NAMES() { return ALL_FILE_NAMES; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final List<VirtualFile> guessRoots(@NotNull Project project) {
/* 22 */     Intrinsics.checkNotNullParameter(project, "project"); List<VirtualFile> out = new ArrayList();
/* 23 */     Intrinsics.checkNotNullExpressionValue(ProjectLevelVcsManager.getInstance(project).getAllVcsRoots(), "getAllVcsRoots(...)"); Object[] $this$mapTo$iv = (Object[])ProjectLevelVcsManager.getInstance(project).getAllVcsRoots(); int $i$f$mapTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     byte b;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     int i;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 51 */     for (b = 0, i = $this$mapTo$iv.length; b < i; ) { Object item$iv = $this$mapTo$iv[b];
/* 52 */       VcsRoot vcsRoot = (VcsRoot)item$iv; List<VirtualFile> list = out; int $i$a$-mapTo-AiIgnoreUtilKt$guessRoots$1 = 0; list.add(vcsRoot.getPath()); }
/*    */      if (ProjectUtil.guessProjectDir(project) != null)
/* 54 */     { VirtualFile p0 = ProjectUtil.guessProjectDir(project); int $i$a$-let-AiIgnoreUtilKt$guessRoots$2 = 0; out.add(p0); } else { ProjectUtil.guessProjectDir(project); }
/* 55 */      return CollectionsKt.distinct(out); } @Nullable public static final VirtualFile locateFirstIgnoreFile(@NotNull Project project) { VirtualFile root; Iterator<String> iterator1; Intrinsics.checkNotNullParameter(project, "project"); Iterator<VirtualFile> iterator = guessRoots(project).iterator(); if (iterator.hasNext()) { root = iterator.next(); Iterable<String> $this$forEach$iv = ALL_FILE_NAMES; int $i$f$forEach = 0; iterator1 = $this$forEach$iv.iterator(); } else { return null; }  if (iterator1.hasNext()) { Object element$iv = iterator1.next(); String name = (String)element$iv; int $i$a$-forEach-AiIgnoreUtilKt$locateFirstIgnoreFile$1 = 0;
/*    */       if (root.findChild(name) != null) {
/*    */         VirtualFile virtualFile1 = root.findChild(name), it = virtualFile1;
/*    */         int $i$a$-takeIf-AiIgnoreUtilKt$locateFirstIgnoreFile$1$1 = 0;
/*    */         if (((!it.isDirectory()) ? virtualFile1 : null) != null) {
/*    */           Object object = (!it.isDirectory()) ? virtualFile1 : null;
/*    */           int $i$a$-let-AiIgnoreUtilKt$locateFirstIgnoreFile$1$2 = 0;
/*    */           return (VirtualFile)object;
/*    */         } 
/*    */       }  }
/*    */      }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Function1<Path, Boolean> obtainAIIgnoreChecker(@NotNull Project project) {
/*    */     VirtualFile file;
/*    */     IgnoreMatcher matcher;
/*    */     Intrinsics.checkNotNullParameter(project, "project");
/*    */     if (locateFirstIgnoreFile(project) == null) {
/*    */       locateFirstIgnoreFile(project);
/*    */       return AiIgnoreUtilKt::obtainAIIgnoreChecker$lambda$4;
/*    */     } 
/*    */     try {
/*    */       int $i$a$-runCatching-AiIgnoreUtilKt$obtainAIIgnoreChecker$matcher$1 = 0;
/*    */       object = Result.constructor-impl(IgnoreMatcher.Companion.fromVirtualFile(file));
/*    */     } catch (Throwable throwable) {
/*    */       object = Result.constructor-impl(ResultKt.createFailure(throwable));
/*    */     } 
/*    */     Object object = object;
/*    */     if ((IgnoreMatcher)(Result.isFailure-impl(object) ? null : (IgnoreMatcher)object) == null) {
/*    */       (IgnoreMatcher)(Result.isFailure-impl(object) ? null : (IgnoreMatcher)object);
/*    */       return AiIgnoreUtilKt::obtainAIIgnoreChecker$lambda$6;
/*    */     } 
/*    */     return matcher::obtainAIIgnoreChecker$lambda$7;
/*    */   }
/*    */   
/*    */   private static final boolean obtainAIIgnoreChecker$lambda$4(Path it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     return false;
/*    */   }
/*    */   
/*    */   private static final boolean obtainAIIgnoreChecker$lambda$6(Path it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     return false;
/*    */   }
/*    */   
/*    */   private static final boolean obtainAIIgnoreChecker$lambda$7(IgnoreMatcher $matcher, Path it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     return it.endsWith(".aiignore") ? true : $matcher.isIgnored(it);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\aiignore\AiIgnoreUtilKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */