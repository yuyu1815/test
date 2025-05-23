/*     */ package ai.grazie.nlp.patterns;
/*     */ 
/*     */ import ai.grazie.nlp.utils.RangesKt;
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.sequences.SequencesKt;
/*     */ import kotlin.text.MatchResult;
/*     */ import kotlin.text.Regex;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000\n\002\020\013\n\000\b\002\030\0002\0020\001B\025\022\006\020\002\032\0020\001\022\006\020\003\032\0020\004¢\006\002\020\005J\026\020\n\032\b\022\004\022\0020\f0\0132\006\020\r\032\0020\016H\026J\020\020\017\032\0020\0202\006\020\r\032\0020\016H\026R\021\020\002\032\0020\001¢\006\b\n\000\032\004\b\006\020\007R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\b\020\t¨\006\021"}, d2 = {"Lai/grazie/nlp/patterns/Pattern$After;", "Lai/grazie/nlp/patterns/Pattern;", "pattern", "prev", "Lkotlin/text/Regex;", "(Lai/grazie/nlp/patterns/Pattern;Lkotlin/text/Regex;)V", "getPattern", "()Lai/grazie/nlp/patterns/Pattern;", "getPrev", "()Lkotlin/text/Regex;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "matches", "", "nlp-patterns"})
/*     */ @SourceDebugExtension({"SMAP\nPattern.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pattern.kt\nai/grazie/nlp/patterns/Pattern$After\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n774#2:122\n865#2,2:123\n*S KotlinDebug\n*F\n+ 1 Pattern.kt\nai/grazie/nlp/patterns/Pattern$After\n*L\n90#1:122\n90#1:123,2\n*E\n"})
/*     */ final class After
/*     */   implements Pattern
/*     */ {
/*     */   @NotNull
/*     */   private final Pattern pattern;
/*     */   @NotNull
/*     */   private final Regex prev;
/*     */   
/*     */   public After(@NotNull Pattern pattern, @NotNull Regex prev) {
/*  84 */     this.pattern = pattern; this.prev = prev; } @NotNull public final Pattern getPattern() { return this.pattern; } @NotNull public final Regex getPrev() { return this.prev; } @NotNull
/*     */   public List<TextRange> find(@NotNull CharSequence text) {
/*  86 */     Intrinsics.checkNotNullParameter(text, "text"); List<TextRange> ranges = this.pattern.find(text);
/*  87 */     if (ranges.isEmpty()) return CollectionsKt.emptyList();
/*     */     
/*  89 */     Set prefixMatchEnds = SequencesKt.toSet(SequencesKt.map(Regex.findAll$default(this.prev, text, 0, 2, null), Pattern$After$find$prefixMatchEnds$1.INSTANCE));
/*  90 */     Iterable<TextRange> $this$filter$iv = ranges; int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 123 */     for (TextRange element$iv$iv : iterable1) { TextRange range = element$iv$iv; int $i$a$-filter-Pattern$After$find$1 = 0; if (prefixMatchEnds.contains(Integer.valueOf(range.getStart()))) destination$iv$iv.add(element$iv$iv);  }
/* 124 */      return (List)destination$iv$iv;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke", "(Lkotlin/text/MatchResult;)Ljava/lang/Integer;"})
/*     */   static final class Pattern$After$find$prefixMatchEnds$1 extends Lambda implements Function1<MatchResult, Integer> {
/*     */     public static final Pattern$After$find$prefixMatchEnds$1 INSTANCE = new Pattern$After$find$prefixMatchEnds$1();
/*     */     
/*     */     Pattern$After$find$prefixMatchEnds$1() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     public final Integer invoke(MatchResult it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return Integer.valueOf(it.getRange().getLast() + 1);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean matches(@NotNull CharSequence text) {
/*     */     Intrinsics.checkNotNullParameter(text, "text");
/*     */     if (this.pattern.matches(text)) {
/*     */       this.prev.matchAt(text, 0).getRange();
/*     */       if ((this.prev.matchAt(text, 0) != null && this.prev.matchAt(text, 0).getRange() != null) ? ((RangesKt.getLength(this.prev.matchAt(text, 0).getRange()) == 0)) : false);
/*     */     } 
/*     */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\Pattern$After.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */