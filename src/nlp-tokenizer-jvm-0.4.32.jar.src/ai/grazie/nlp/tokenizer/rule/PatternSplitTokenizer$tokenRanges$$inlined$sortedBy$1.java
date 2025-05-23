/*     */ package ai.grazie.nlp.tokenizer.rule;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 PatternSplitTokenizer.kt\nai/grazie/nlp/tokenizer/rule/PatternSplitTokenizer\n*L\n1#1,102:1\n27#2:103\n*E\n"})
/*     */ public final class PatternSplitTokenizer$tokenRanges$$inlined$sortedBy$1<T>
/*     */   implements Comparator
/*     */ {
/*     */   public final int compare(Object a, Object b) {
/* 102 */     TextRange it = (TextRange)a; int $i$a$-sortedBy-PatternSplitTokenizer$tokenRanges$matches$2 = 0; it = (TextRange)b; Integer integer = 
/* 103 */       Integer.valueOf(it.getStart()); $i$a$-sortedBy-PatternSplitTokenizer$tokenRanges$matches$2 = 0; return ComparisonsKt.compareValues(integer, Integer.valueOf(it.getStart()));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\rule\PatternSplitTokenizer$tokenRanges$$inlined$sortedBy$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */