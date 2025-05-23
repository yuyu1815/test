/*     */ package ai.grazie.nlp.patterns;
/*     */ 
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000\n\002\020\013\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026J\020\020\007\032\0020\b2\006\020\005\032\0020\006H\026¨\006\t"}, d2 = {"ai/grazie/nlp/patterns/Pattern$afterWordBoundary$1", "Lai/grazie/nlp/patterns/Pattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "matches", "", "nlp-patterns"})
/*     */ @SourceDebugExtension({"SMAP\nPattern.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pattern.kt\nai/grazie/nlp/patterns/Pattern$afterWordBoundary$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n774#2:122\n865#2,2:123\n*S KotlinDebug\n*F\n+ 1 Pattern.kt\nai/grazie/nlp/patterns/Pattern$afterWordBoundary$1\n*L\n58#1:122\n58#1:123,2\n*E\n"})
/*     */ public final class Pattern$afterWordBoundary$1
/*     */   implements Pattern
/*     */ {
/*     */   public List<TextRange> find(CharSequence text) {
/*  58 */     Intrinsics.checkNotNullParameter(text, "text"); Iterable<TextRange> $this$filter$iv = Pattern.this.find(text); int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 122 */     Iterable<TextRange> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 123 */     for (TextRange element$iv$iv : iterable1) { TextRange it = element$iv$iv; int $i$a$-filter-Pattern$afterWordBoundary$1$find$1 = 0; if (Pattern.Companion.isWordBoundaryBefore(text, it.getStart())) destination$iv$iv.add(element$iv$iv);  }
/* 124 */      return (List)destination$iv$iv;
/*     */   }
/*     */   
/*     */   public boolean matches(CharSequence text) {
/*     */     Intrinsics.checkNotNullParameter(text, "text");
/*     */     return Pattern.this.matches(text);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\Pattern$afterWordBoundary$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */