/*    */ package ai.grazie.nlp.utils.normalization;
/*    */ 
/*    */ import kotlin.Pair;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\020\016\n\002\b\003\030\000 \b2\0020\001:\001\bB\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\020\020\005\032\0020\0062\006\020\007\032\0020\006H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\t"}, d2 = {"Lai/grazie/nlp/utils/normalization/UnicodePunctuationNormalizer;", "Lai/grazie/nlp/utils/normalization/Normalizer;", "replaceApostropheWithQuote", "", "(Z)V", "normalize", "", "text", "Companion", "nlp-common"})
/*    */ @SourceDebugExtension({"SMAP\nUnicodePunctuationNormalizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnicodePunctuationNormalizer.kt\nai/grazie/nlp/utils/normalization/UnicodePunctuationNormalizer\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n975#2:63\n1046#2,3:64\n216#3:67\n217#3:70\n1863#4,2:68\n*S KotlinDebug\n*F\n+ 1 UnicodePunctuationNormalizer.kt\nai/grazie/nlp/utils/normalization/UnicodePunctuationNormalizer\n*L\n52#1:63\n52#1:64,3\n45#1:67\n45#1:70\n45#1:68,2\n*E\n"})
/*    */ public final class UnicodePunctuationNormalizer implements Normalizer {
/*  9 */   public UnicodePunctuationNormalizer(boolean replaceApostropheWithQuote) { this.replaceApostropheWithQuote = replaceApostropheWithQuote; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020$\n\002\020\f\n\002\020 \n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R \020\003\032\024\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0050\0060\004X\004¢\006\002\n\000R\027\020\007\032\b\022\004\022\0020\0050\006¢\006\b\n\000\032\004\b\b\020\tR\032\020\n\032\016\022\004\022\0020\005\022\004\022\0020\0050\004X\004¢\006\002\n\000¨\006\013"}, d2 = {"Lai/grazie/nlp/utils/normalization/UnicodePunctuationNormalizer$Companion;", "", "()V", "asciiToUnicode", "", "", "", "doubleQuotes", "getDoubleQuotes", "()Ljava/util/List;", "unicodeToAscii", "nlp-common"})
/*    */   public static final class Companion {
/*    */     private Companion() {} @NotNull
/* 12 */     public final List<Character> getDoubleQuotes() { return UnicodePunctuationNormalizer.doubleQuotes; } } @NotNull public static final Companion Companion = new Companion(null); private final boolean replaceApostropheWithQuote; @NotNull private static final List<Character> doubleQuotes; @NotNull private static final Map<Character, List<Character>> asciiToUnicode; @NotNull private static final Map<Character, Character> unicodeToAscii; static { Character[] arrayOfCharacter1 = new Character[17]; arrayOfCharacter1[0] = Character.valueOf('«'); arrayOfCharacter1[1] = Character.valueOf('»'); arrayOfCharacter1[2] = Character.valueOf('ʺ'); arrayOfCharacter1[3] = Character.valueOf('̋'); arrayOfCharacter1[4] = Character.valueOf('̎'); arrayOfCharacter1[5] = Character.valueOf('“'); arrayOfCharacter1[6] = Character.valueOf('”'); arrayOfCharacter1[7] = Character.valueOf('„'); arrayOfCharacter1[8] = Character.valueOf('‟'); arrayOfCharacter1[9] = Character.valueOf('″'); arrayOfCharacter1[10] = Character.valueOf('‶'); arrayOfCharacter1[11] = Character.valueOf('〃'); arrayOfCharacter1[12] = Character.valueOf('〝'); arrayOfCharacter1[13] = Character.valueOf('〞'); arrayOfCharacter1[14] = Character.valueOf('〟'); arrayOfCharacter1[15] = Character.valueOf('‴'); arrayOfCharacter1[16] = Character.valueOf('‷'); doubleQuotes = CollectionsKt.listOf((Object[])arrayOfCharacter1);
/*    */ 
/*    */     
/* 15 */     Pair[] arrayOfPair = new Pair[24]; Character[] arrayOfCharacter2 = new Character[3]; arrayOfCharacter2[0] = Character.valueOf('​'); arrayOfCharacter2[1] = Character.valueOf('⁠'); arrayOfCharacter2[2] = Character.valueOf('﻿'); arrayOfPair[0] = TuplesKt.to(Character.valueOf(' '), CollectionsKt.listOf((Object[])arrayOfCharacter2));
/* 16 */     arrayOfCharacter2 = new Character[2]; arrayOfCharacter2[0] = Character.valueOf('ǃ'); arrayOfCharacter2[1] = Character.valueOf('❢'); arrayOfPair[1] = TuplesKt.to(Character.valueOf('!'), CollectionsKt.listOf((Object[])arrayOfCharacter2));
/* 17 */     arrayOfPair[2] = TuplesKt.to(Character.valueOf('"'), doubleQuotes);
/* 18 */     arrayOfPair[3] = TuplesKt.to(Character.valueOf('#'), CollectionsKt.listOf(Character.valueOf('♯')));
/* 19 */     arrayOfCharacter2 = new Character[2]; arrayOfCharacter2[0] = Character.valueOf('٪'); arrayOfCharacter2[1] = Character.valueOf('⁒'); arrayOfPair[4] = TuplesKt.to(Character.valueOf('%'), CollectionsKt.listOf((Object[])arrayOfCharacter2));
/* 20 */     arrayOfCharacter2 = new Character[9]; arrayOfCharacter2[0] = Character.valueOf('´'); arrayOfCharacter2[1] = Character.valueOf('ʹ'); arrayOfCharacter2[2] = Character.valueOf('ʼ'); arrayOfCharacter2[3] = Character.valueOf('ˈ'); arrayOfCharacter2[4] = Character.valueOf('́'); arrayOfCharacter2[5] = Character.valueOf('‘'); arrayOfCharacter2[6] = Character.valueOf('’'); arrayOfCharacter2[7] = Character.valueOf('‛'); arrayOfCharacter2[8] = Character.valueOf('′'); arrayOfPair[5] = TuplesKt.to(Character.valueOf('\''), CollectionsKt.listOf((Object[])arrayOfCharacter2));
/* 21 */     arrayOfCharacter2 = new Character[4]; arrayOfCharacter2[0] = Character.valueOf('٭'); arrayOfCharacter2[1] = Character.valueOf('⁎'); arrayOfCharacter2[2] = Character.valueOf('∗'); arrayOfCharacter2[3] = Character.valueOf('✱'); arrayOfPair[6] = TuplesKt.to(Character.valueOf('*'), CollectionsKt.listOf((Object[])arrayOfCharacter2));
/* 22 */     arrayOfPair[7] = TuplesKt.to(Character.valueOf(','), CollectionsKt.listOf(Character.valueOf('‚')));
/* 23 */     arrayOfCharacter2 = new Character[8]; char c = '­'; arrayOfCharacter2[0] = Character.valueOf((char)c); arrayOfCharacter2[1] = Character.valueOf('‐'); arrayOfCharacter2[2] = Character.valueOf('‑'); arrayOfCharacter2[3] = Character.valueOf('−'); arrayOfCharacter2[4] = Character.valueOf('‒'); arrayOfCharacter2[5] = Character.valueOf('–'); arrayOfCharacter2[6] = Character.valueOf('—'); arrayOfCharacter2[7] = Character.valueOf('―'); arrayOfPair[8] = TuplesKt.to(Character.valueOf('-'), CollectionsKt.listOf((Object[])arrayOfCharacter2));
/* 24 */     arrayOfCharacter2 = new Character[4]; arrayOfCharacter2[0] = Character.valueOf('÷'); arrayOfCharacter2[1] = Character.valueOf('̸'); arrayOfCharacter2[2] = Character.valueOf('⁄'); arrayOfCharacter2[3] = Character.valueOf('∕'); arrayOfPair[9] = TuplesKt.to(Character.valueOf('/'), CollectionsKt.listOf((Object[])arrayOfCharacter2));
/* 25 */     arrayOfCharacter2 = new Character[3]; arrayOfCharacter2[0] = Character.valueOf('։'); arrayOfCharacter2[1] = Character.valueOf('׃'); arrayOfCharacter2[2] = Character.valueOf('∶'); arrayOfPair[10] = TuplesKt.to(Character.valueOf(':'), CollectionsKt.listOf((Object[])arrayOfCharacter2));
/* 26 */     arrayOfCharacter2 = new Character[3]; arrayOfCharacter2[0] = Character.valueOf('‹'); arrayOfCharacter2[1] = Character.valueOf('〈'); arrayOfCharacter2[2] = Character.valueOf('⟨'); arrayOfPair[11] = TuplesKt.to(Character.valueOf('<'), CollectionsKt.listOf((Object[])arrayOfCharacter2));
/* 27 */     arrayOfCharacter2 = new Character[3]; arrayOfCharacter2[0] = Character.valueOf('›'); arrayOfCharacter2[1] = Character.valueOf('〉'); arrayOfCharacter2[2] = Character.valueOf('⟩'); arrayOfPair[12] = TuplesKt.to(Character.valueOf('>'), CollectionsKt.listOf((Object[])arrayOfCharacter2));
/* 28 */     arrayOfPair[13] = TuplesKt.to(Character.valueOf('?'), CollectionsKt.listOf(Character.valueOf('‽')));
/* 29 */     arrayOfPair[14] = TuplesKt.to(Character.valueOf('['), CollectionsKt.listOf(Character.valueOf('⟦')));
/* 30 */     arrayOfCharacter2 = new Character[2]; arrayOfCharacter2[0] = Character.valueOf('⃥'); arrayOfCharacter2[1] = Character.valueOf('∖'); arrayOfPair[15] = TuplesKt.to(Character.valueOf('\\'), CollectionsKt.listOf((Object[])arrayOfCharacter2));
/* 31 */     arrayOfPair[16] = TuplesKt.to(Character.valueOf(']'), CollectionsKt.listOf(Character.valueOf('〛')));
/* 32 */     arrayOfCharacter2 = new Character[5]; arrayOfCharacter2[0] = Character.valueOf('˄'); arrayOfCharacter2[1] = Character.valueOf('ˆ'); arrayOfCharacter2[2] = Character.valueOf('̂'); arrayOfCharacter2[3] = Character.valueOf('‸'); arrayOfCharacter2[4] = Character.valueOf('⌃'); arrayOfPair[17] = TuplesKt.to(Character.valueOf('^'), CollectionsKt.listOf((Object[])arrayOfCharacter2));
/* 33 */     arrayOfCharacter2 = new Character[4]; arrayOfCharacter2[0] = Character.valueOf('ˍ'); arrayOfCharacter2[1] = Character.valueOf('̱'); arrayOfCharacter2[2] = Character.valueOf('̲'); arrayOfCharacter2[3] = Character.valueOf('‗'); arrayOfPair[18] = TuplesKt.to(Character.valueOf('_'), CollectionsKt.listOf((Object[])arrayOfCharacter2));
/* 34 */     arrayOfCharacter2 = new Character[3]; arrayOfCharacter2[0] = Character.valueOf('ˋ'); arrayOfCharacter2[1] = Character.valueOf('̀'); arrayOfCharacter2[2] = Character.valueOf('‵'); arrayOfPair[19] = TuplesKt.to(Character.valueOf('`'), CollectionsKt.listOf((Object[])arrayOfCharacter2));
/* 35 */     arrayOfPair[20] = TuplesKt.to(Character.valueOf('{'), CollectionsKt.listOf(Character.valueOf('⦃')));
/* 36 */     arrayOfCharacter2 = new Character[4]; arrayOfCharacter2[0] = Character.valueOf('ǀ'); arrayOfCharacter2[1] = Character.valueOf('׀'); arrayOfCharacter2[2] = Character.valueOf('∣'); arrayOfCharacter2[3] = Character.valueOf('❘'); arrayOfPair[21] = TuplesKt.to(Character.valueOf('|'), CollectionsKt.listOf((Object[])arrayOfCharacter2));
/* 37 */     arrayOfPair[22] = TuplesKt.to(Character.valueOf('}'), CollectionsKt.listOf(Character.valueOf('⦄')));
/* 38 */     arrayOfCharacter2 = new Character[5]; arrayOfCharacter2[0] = Character.valueOf('˜'); arrayOfCharacter2[1] = Character.valueOf('̃'); arrayOfCharacter2[2] = Character.valueOf('⁓'); arrayOfCharacter2[3] = Character.valueOf('∼'); arrayOfCharacter2[4] = Character.valueOf('〜'); arrayOfPair[23] = TuplesKt.to(Character.valueOf('~'), CollectionsKt.listOf((Object[])arrayOfCharacter2));
/*    */ 
/*    */     
/*    */     asciiToUnicode = MapsKt.mapOf(arrayOfPair);
/*    */ 
/*    */     
/* 44 */     HashMap<Object, Object> unicodeToAsciiMutable = new HashMap<>();
/* 45 */     Map<Character, List<Character>> $this$forEach$iv = asciiToUnicode; int $i$f$forEach = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 67 */     Iterator<Map.Entry> iterator = $this$forEach$iv.entrySet().iterator(); if (iterator.hasNext()) { Map.Entry element$iv = iterator.next(), entry1 = element$iv; int $i$a$-forEach-UnicodePunctuationNormalizer$Companion$1 = 0; char ascii = ((Character)entry1.getKey()).charValue(); List unicodeList = (List)entry1.getValue(); Iterable iterable = unicodeList; int i = 0;
/* 68 */       Iterator iterator1 = iterable.iterator(); }
/*    */     
/*    */     unicodeToAscii = (Map)unicodeToAsciiMutable; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public String normalize(@NotNull String text) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     CharSequence $this$map$iv = text;
/*    */     int $i$f$map = 0;
/*    */     CharSequence charSequence1 = $this$map$iv;
/*    */     Collection destination$iv$iv = new ArrayList($this$map$iv.length());
/*    */     int $i$f$mapTo = 0;
/*    */     for (byte b = 0; b < charSequence1.length(); character = Character.valueOf(c)) {
/*    */       Character character;
/*    */       char item$iv$iv = charSequence1.charAt(b);
/*    */       char c = item$iv$iv;
/*    */       Collection collection = destination$iv$iv;
/*    */       int $i$a$-map-UnicodePunctuationNormalizer$normalize$normalized$1 = 0;
/*    */     } 
/*    */     String normalized = CollectionsKt.joinToString$default(destination$iv$iv, "", null, null, 0, null, null, 62, null);
/*    */     return normalized;
/*    */   }
/*    */   
/*    */   public UnicodePunctuationNormalizer() {
/*    */     this(false, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\normalization\UnicodePunctuationNormalizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */