/*     */ package com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors;
/*     */ 
/*     */ import com.intellij.psi.SmartPsiElementPointer;
/*     */ import java.util.Comparator;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.comparisons.ComparisonsKt;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\007\020\000\032\0020\001\"\004\b\000\020\0022\016\020\003\032\n \004*\004\030\001H\002H\0022\016\020\005\032\n \004*\004\030\001H\002H\002H\n¢\006\004\b\006\020\007¨\006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"})
/*     */ @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 RelevantFilesOrderedExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor\n*L\n1#1,145:1\n58#2:146\n*E\n"})
/*     */ public final class RelevantFilesOrderedExtractor$extract$lambda$6$$inlined$thenBy$1<T>
/*     */   implements Comparator
/*     */ {
/*     */   public RelevantFilesOrderedExtractor$extract$lambda$6$$inlined$thenBy$1(Comparator $receiver) {}
/*     */   
/*     */   public final int compare(Object a, Object b) {
/* 144 */     int previousCompare = this.$this_thenBy.compare(a, b);
/* 145 */     Map.Entry it = (Map.Entry)a; int $i$a$-thenBy-RelevantFilesOrderedExtractor$extract$result$1$2 = 0; it = (Map.Entry)b; Comparable comparable = (
/* 146 */       (SmartPsiElementPointer)it.getKey()).getVirtualFile().getPath(); $i$a$-thenBy-RelevantFilesOrderedExtractor$extract$result$1$2 = 0; return (previousCompare != 0) ? previousCompare : ComparisonsKt.compareValues(comparable, ((SmartPsiElementPointer)it.getKey()).getVirtualFile().getPath());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\extractors\RelevantFilesOrderedExtractor$extract$lambda$6$$inlined$thenBy$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */