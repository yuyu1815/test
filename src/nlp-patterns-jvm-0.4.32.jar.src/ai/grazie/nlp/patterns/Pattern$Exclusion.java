/*     */ package ai.grazie.nlp.patterns;
/*     */ 
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000\n\002\020\013\n\000\030\0002\0020\001B\025\022\006\020\002\032\0020\001\022\006\020\003\032\0020\001¢\006\002\020\004J\026\020\005\032\b\022\004\022\0020\0070\0062\006\020\b\032\0020\tH\026J\020\020\n\032\0020\0132\006\020\b\032\0020\tH\026R\016\020\003\032\0020\001X\004¢\006\002\n\000R\016\020\002\032\0020\001X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lai/grazie/nlp/patterns/Pattern$Exclusion;", "Lai/grazie/nlp/patterns/Pattern;", "main", "exclude", "(Lai/grazie/nlp/patterns/Pattern;Lai/grazie/nlp/patterns/Pattern;)V", "find", "", "Lai/grazie/text/TextRange;", "text", "", "matches", "", "nlp-patterns"})
/*     */ @SourceDebugExtension({"SMAP\nPattern.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pattern.kt\nai/grazie/nlp/patterns/Pattern$Exclusion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n774#2:122\n865#2,2:123\n*S KotlinDebug\n*F\n+ 1 Pattern.kt\nai/grazie/nlp/patterns/Pattern$Exclusion\n*L\n23#1:122\n23#1:123,2\n*E\n"})
/*     */ public final class Exclusion implements Pattern {
/*     */   @NotNull
/*     */   private final Pattern main;
/*     */   @NotNull
/*     */   private final Pattern exclude;
/*     */   
/*  20 */   public Exclusion(@NotNull Pattern main, @NotNull Pattern exclude) { this.main = main; this.exclude = exclude; } @NotNull
/*     */   public List<TextRange> find(@NotNull CharSequence text) {
/*  22 */     Intrinsics.checkNotNullParameter(text, "text"); List<TextRange> matches = this.main.find(text);
/*  23 */     Iterable<TextRange> $this$filter$iv = matches; int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 123 */     for (TextRange element$iv$iv : iterable1) { TextRange it = element$iv$iv; int $i$a$-filter-Pattern$Exclusion$find$1 = 0; if (!this.exclude.matches(text.subSequence(it.getStart(), it.getEndExclusive()))) destination$iv$iv.add(element$iv$iv);  }
/* 124 */      return (List)destination$iv$iv;
/*     */   }
/*     */   
/*     */   public boolean matches(@NotNull CharSequence text) {
/*     */     Intrinsics.checkNotNullParameter(text, "text");
/*     */     return (this.main.matches(text) && !this.exclude.matches(text));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\Pattern$Exclusion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */