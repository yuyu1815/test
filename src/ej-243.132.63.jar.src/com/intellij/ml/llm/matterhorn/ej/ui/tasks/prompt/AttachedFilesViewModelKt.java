/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt;
/*     */ 
/*     */ import com.intellij.filename.UniqueNameBuilder;
/*     */ import com.intellij.openapi.util.io.FileUtilRt;
/*     */ import java.io.File;
/*     */ import java.nio.file.Path;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.io.path.PathsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.collections.immutable.PersistentList;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020$\n\002\b\003\n\002\030\002\n\002\b\002\032$\020\000\032\b\022\004\022\0020\0020\0012\f\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\007H\002\032V\020\b\032\016\022\004\022\002H\n\022\004\022\0020\0070\t\"\004\b\000\020\n2\f\020\013\032\b\022\004\022\002H\n0\0012\006\020\006\032\0020\0072\022\020\f\032\016\022\004\022\002H\n\022\004\022\0020\0070\r2\022\020\016\032\016\022\004\022\002H\n\022\004\022\0020\0070\r¨\006\017"}, d2 = {"mapState", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFile;", "paths", "Lkotlinx/collections/immutable/PersistentList;", "Ljava/nio/file/Path;", "projectBasePath", "", "createNameMappings", "", "F", "files", "fileToName", "Lkotlin/Function1;", "fileToPath", "ej-ui"})
/*     */ @SourceDebugExtension({"SMAP\nAttachedFilesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachedFilesViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n1557#2:208\n1628#2,3:209\n1863#2,2:212\n1863#2,2:214\n*S KotlinDebug\n*F\n+ 1 AttachedFilesViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModelKt\n*L\n163#1:208\n163#1:209,3\n200#1:212,2\n202#1:214,2\n*E\n"})
/*     */ public final class AttachedFilesViewModelKt
/*     */ {
/*     */   private static final List<AttachedFile> mapState(PersistentList paths, String projectBasePath) {
/* 160 */     Map<?, String> mappings = 
/* 161 */       createNameMappings((List)paths, projectBasePath, AttachedFilesViewModelKt::mapState$lambda$0, AttachedFilesViewModelKt::mapState$lambda$1);
/*     */     
/* 163 */     Iterable $this$map$iv = (Iterable)paths; int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 208 */     Iterable iterable1 = $this$map$iv; Collection<AttachedFile> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 209 */     for (Object item$iv$iv : iterable1) {
/* 210 */       Path path = (Path)item$iv$iv; Collection<AttachedFile> collection = destination$iv$iv; int $i$a$-map-AttachedFilesViewModelKt$mapState$1 = 0; collection.add(new AttachedFile(mappings.get(path), path));
/* 211 */     }  return (List<AttachedFile>)destination$iv$iv; } @NotNull public static final <F> Map<F, String> createNameMappings(@NotNull List files, @NotNull String projectBasePath, @NotNull Function1 fileToName, @NotNull Function1 fileToPath) { UniqueNameBuilder builder; Intrinsics.checkNotNullParameter(files, "files"); Intrinsics.checkNotNullParameter(projectBasePath, "projectBasePath"); Intrinsics.checkNotNullParameter(fileToName, "fileToName"); Intrinsics.checkNotNullParameter(fileToPath, "fileToPath"); Set<String> allNames = new LinkedHashSet(); LinkedHashSet<Object> equalNameFiles = new LinkedHashSet(); Map<Object, Object> nameToFile = new LinkedHashMap<>(); for (Object file : files) { String name = (String)fileToName.invoke(file); if (allNames.add(name)) { nameToFile.put(name, file); continue; }  equalNameFiles.add(file); Intrinsics.checkNotNull(nameToFile.get(name)); equalNameFiles.add(nameToFile.get(name)); }  Map<Object, Object> result = new LinkedHashMap<>(); for (Object file : files) { if (!equalNameFiles.contains(file))
/* 212 */         result.put(file, fileToName.invoke(file));  }  if (!equalNameFiles.isEmpty()) { String path = projectBasePath; Intrinsics.checkNotNullExpressionValue(FileUtilRt.toSystemIndependentName(path), "toSystemIndependentName(...)"); path = FileUtilRt.toSystemIndependentName(path); builder = new UniqueNameBuilder(path, File.separator); Iterable<Object> iterable = equalNameFiles; int i = 0; iterator = iterable.iterator(); } else { return (Map)result; }  if (iterator.hasNext()) { Object element$iv = iterator.next(), it = element$iv; int $i$a$-forEach-AttachedFilesViewModelKt$createNameMappings$1 = 0; builder.addPath(it, (String)fileToPath.invoke(it)); }
/*     */      Iterable<Object> $this$forEach$iv = equalNameFiles; int $i$f$forEach = 0;
/* 214 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(), it = element$iv; int $i$a$-forEach-AttachedFilesViewModelKt$createNameMappings$2 = 0;
/*     */       result.put(it, builder.getShortPath(it)); }
/*     */     
/*     */     return (Map)result; }
/*     */ 
/*     */   
/*     */   private static final String mapState$lambda$0(Path it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return PathsKt.getName(it);
/*     */   }
/*     */   
/*     */   private static final String mapState$lambda$1(Path it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it.toAbsolutePath().toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\prompt\AttachedFilesViewModelKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */