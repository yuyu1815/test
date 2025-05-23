/*     */ package ai.grazie.nlp.tokenizer.sentence;
/*     */ 
/*     */ import ai.grazie.nlp.langs.Language;
/*     */ import ai.grazie.nlp.patterns.Pattern;
/*     */ import ai.grazie.nlp.patterns.RegexPattern;
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\b\003\n\002\b\003\n\002\b\003\n\002\020\016\n\002\b\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\004\t\f\017\025\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\035\032\0020\0042\006\020\036\032\0020\037H\007J\b\020 \032\0020!H\002J\b\020\"\032\0020#H\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\020\020\b\032\0020\tX\004¢\006\004\n\002\020\nR\020\020\013\032\0020\fX\004¢\006\004\n\002\020\rR\020\020\016\032\0020\017X\004¢\006\004\n\002\020\020R\016\020\021\032\0020\022XT¢\006\002\n\000R\016\020\023\032\0020\022XT¢\006\002\n\000R\020\020\024\032\0020\025X\004¢\006\004\n\002\020\026R\016\020\027\032\0020\022X\004¢\006\002\n\000R\016\020\030\032\0020\022X\004¢\006\002\n\000R\016\020\031\032\0020\022X\004¢\006\002\n\000R\016\020\032\032\0020\033X\004¢\006\002\n\000R\016\020\034\032\0020\022XT¢\006\002\n\000¨\006$"}, d2 = {"Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion;", "", "()V", "Default", "Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer;", "getDefault$annotations", "getDefault", "()Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer;", "Ellipsis", "ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Ellipsis$1$1", "Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Ellipsis$1$1;", "Parenthetical", "ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Parenthetical$1", "Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Parenthetical$1;", "QuotedStuff", "ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$QuotedStuff$1", "Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$QuotedStuff$1;", "braceBullet", "", "braceBulletContents", "endPunctuation", "ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$endPunctuation$1", "Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$endPunctuation$1;", "normalSentenceEnd", "quotes", "romanBullet", "sentenceContinuation", "Lkotlin/text/Regex;", "spaceOrEnd", "defaultFor", "language", "Lai/grazie/nlp/langs/Language;", "pairedDashes", "Lai/grazie/nlp/patterns/Pattern;", "pairedParentheses", "Lai/grazie/nlp/patterns/RegexPattern;", "nlp-tokenizer"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @JvmStatic
/*     */   @NotNull
/*     */   public final StandardSentenceTokenizer defaultFor(@NotNull Language language) {
/*  40 */     Intrinsics.checkNotNullParameter(language, "language"); return new StandardSentenceTokenizer(Integer.valueOf(2), language);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final RegexPattern pairedParentheses() {
/*  53 */     String noParentheses = "[^()]";
/*  54 */     String nestedParentheses = "\\(" + noParentheses + "{1,500}\\)" + noParentheses + "{0,500}";
/*  55 */     return new RegexPattern(new Regex("\\(" + noParentheses + "{1,500}(" + nestedParentheses + ")*\\)"));
/*     */   }
/*     */   
/*     */   private final Pattern pairedDashes() {
/*  59 */     Regex dashRegex = new Regex("\\s+[-–—]+\\s+([^-–—]{1,100})\\s+[-–—]+\\s+");
/*  60 */     Regex smileyRegex = new Regex("[:;]-?[()]+");
/*  61 */     return (Pattern)new StandardSentenceTokenizer$Companion$pairedDashes$1(dashRegex, smileyRegex); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$pairedDashes$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-tokenizer"}) @SourceDebugExtension({"SMAP\nStandardSentenceTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardSentenceTokenizer.kt\nai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$pairedDashes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,197:1\n774#2:198\n865#2,2:199\n*S KotlinDebug\n*F\n+ 1 StandardSentenceTokenizer.kt\nai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$pairedDashes$1\n*L\n63#1:198\n63#1:199,2\n*E\n"}) public static final class StandardSentenceTokenizer$Companion$pairedDashes$1 extends RegexPattern { StandardSentenceTokenizer$Companion$pairedDashes$1(Regex $dashRegex, Regex $smileyRegex) { super($dashRegex); }
/*     */      public List<TextRange> find(CharSequence text) {
/*  63 */       Intrinsics.checkNotNullParameter(text, "text"); List list1 = super.find(text); Regex regex1 = this.$dashRegex, regex2 = this.$smileyRegex; int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 198 */       List list2 = list1; Collection destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 199 */       for (Object element$iv$iv : list2) { TextRange it = (TextRange)element$iv$iv; int $i$a$-filter-StandardSentenceTokenizer$Companion$pairedDashes$1$find$1 = 0; CharSequence withDashes = text.subSequence(it.getStart(), it.getEndExclusive()); Intrinsics.checkNotNull(regex1.matchEntire(withDashes)); String withoutDashes = regex1.matchEntire(withDashes).getGroupValues().get(1); }
/* 200 */        return (List<TextRange>)destination$iv$iv;
/*     */     } }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final StandardSentenceTokenizer getDefault() {
/*     */     return StandardSentenceTokenizer.access$getDefault$cp();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\sentence\StandardSentenceTokenizer$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */