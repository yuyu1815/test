/*     */ package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.comparisons.ComparisonsKt;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\007\020\000\032\0020\001\"\004\b\000\020\0022\016\020\003\032\n \004*\004\030\001H\002H\0022\016\020\005\032\n \004*\004\030\001H\002H\002H\n¢\006\004\b\006\020\007¨\006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
/*     */ @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl\n*L\n1#1,102:1\n87#2:103\n*E\n"})
/*     */ public final class TaskStorageImpl$loadAllSteps$lambda$10$$inlined$sortedBy$1<T>
/*     */   implements Comparator
/*     */ {
/*     */   public TaskStorageImpl$loadAllSteps$lambda$10$$inlined$sortedBy$1(String paramString) {}
/*     */   
/*     */   public final int compare(Object a, Object b) {
/* 102 */     String path = (String)a; int $i$a$-sortedBy-TaskStorageImpl$loadAllSteps$2$sortedStepPaths$1 = 0;
/* 103 */     TaskStorageImpl.access$parseStepIndexFromFilename(TaskStorageImpl.this, StringsKt.removePrefix(path, this.$baseDir$inlined)); path = (String)b; Integer integer = Integer.valueOf((TaskStorageImpl.access$parseStepIndexFromFilename(TaskStorageImpl.this, StringsKt.removePrefix(path, this.$baseDir$inlined)) != null) ? TaskStorageImpl.access$parseStepIndexFromFilename(TaskStorageImpl.this, StringsKt.removePrefix(path, this.$baseDir$inlined)).intValue() : Integer.MAX_VALUE); $i$a$-sortedBy-TaskStorageImpl$loadAllSteps$2$sortedStepPaths$1 = 0; TaskStorageImpl.access$parseStepIndexFromFilename(TaskStorageImpl.this, StringsKt.removePrefix(path, this.$baseDir$inlined)); return ComparisonsKt.compareValues(integer, Integer.valueOf((TaskStorageImpl.access$parseStepIndexFromFilename(TaskStorageImpl.this, StringsKt.removePrefix(path, this.$baseDir$inlined)) != null) ? TaskStorageImpl.access$parseStepIndexFromFilename(TaskStorageImpl.this, StringsKt.removePrefix(path, this.$baseDir$inlined)).intValue() : Integer.MAX_VALUE));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\TaskStorageImpl$loadAllSteps$lambda$10$$inlined$sortedBy$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */