/*     */ package ai.grazie.nlp.patterns;
/*     */ 
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000\n\002\020\013\n\002\b\002\n\002\020\b\n\000\b\"\030\0002\0020\001B\r\022\006\020\002\032\0020\001¢\006\002\020\003J\026\020\006\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\nH\026J\020\020\013\032\0020\f2\006\020\t\032\0020\nH\026J\030\020\r\032\0020\f2\006\020\t\032\0020\n2\006\020\016\032\0020\017H&R\021\020\002\032\0020\001¢\006\b\n\000\032\004\b\004\020\005¨\006\020"}, d2 = {"Lai/grazie/nlp/patterns/Pattern$Before;", "Lai/grazie/nlp/patterns/Pattern;", "pattern", "(Lai/grazie/nlp/patterns/Pattern;)V", "getPattern", "()Lai/grazie/nlp/patterns/Pattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "matches", "", "suffixMatches", "at", "", "nlp-patterns"})
/*     */ @SourceDebugExtension({"SMAP\nPattern.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pattern.kt\nai/grazie/nlp/patterns/Pattern$Before\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n774#2:122\n865#2,2:123\n*S KotlinDebug\n*F\n+ 1 Pattern.kt\nai/grazie/nlp/patterns/Pattern$Before\n*L\n74#1:122\n74#1:123,2\n*E\n"})
/*     */ abstract class Before
/*     */   implements Pattern
/*     */ {
/*     */   @NotNull
/*     */   private final Pattern pattern;
/*     */   
/*     */   public Before(@NotNull Pattern pattern) {
/*  69 */     this.pattern = pattern; } @NotNull public final Pattern getPattern() { return this.pattern; } @NotNull
/*     */   public List<TextRange> find(@NotNull CharSequence text) {
/*  71 */     Intrinsics.checkNotNullParameter(text, "text"); List<TextRange> ranges = this.pattern.find(text);
/*  72 */     if (ranges.isEmpty()) return CollectionsKt.emptyList();
/*     */     
/*  74 */     Iterable<TextRange> $this$filter$iv = ranges; int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 123 */     for (TextRange element$iv$iv : iterable1) { TextRange range = element$iv$iv; int $i$a$-filter-Pattern$Before$find$1 = 0; if (suffixMatches(text, range.getEndExclusive())) destination$iv$iv.add(element$iv$iv);  }
/* 124 */      return (List)destination$iv$iv;
/*     */   }
/*     */   
/*     */   public boolean matches(@NotNull CharSequence text) {
/*     */     Intrinsics.checkNotNullParameter(text, "text");
/*     */     return (this.pattern.matches(text) && suffixMatches(text, text.length()));
/*     */   }
/*     */   
/*     */   public abstract boolean suffixMatches(@NotNull CharSequence paramCharSequence, int paramInt);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\Pattern$Before.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */