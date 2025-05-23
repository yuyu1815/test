/*     */ package ai.grazie.nlp.patterns.ext;
/*     */ 
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.Comparator;
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
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 AbbreviationPatterns.kt\nai/grazie/nlp/patterns/ext/AbbreviationPatterns\n*L\n1#1,145:1\n426#2:146\n*E\n"})
/*     */ public final class AbbreviationPatterns$removeSubranges$$inlined$thenBy$1<T>
/*     */   implements Comparator
/*     */ {
/*     */   public AbbreviationPatterns$removeSubranges$$inlined$thenBy$1(Comparator $receiver) {}
/*     */   
/*     */   public final int compare(Object a, Object b) {
/* 144 */     int previousCompare = this.$this_thenBy.compare(a, b);
/* 145 */     TextRange it = (TextRange)a; int $i$a$-thenBy-AbbreviationPatterns$removeSubranges$2 = 0; it = (TextRange)b; Integer integer = 
/* 146 */       Integer.valueOf(-it.getLength()); $i$a$-thenBy-AbbreviationPatterns$removeSubranges$2 = 0; return (previousCompare != 0) ? previousCompare : ComparisonsKt.compareValues(integer, Integer.valueOf(-it.getLength()));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\ext\AbbreviationPatterns$removeSubranges$$inlined$thenBy$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */