/*    */ package ai.grazie.nlp.tokenizer.retokenizer.pattern;
/*    */ 
/*    */ import ai.grazie.nlp.patterns.Pattern;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\bÆ\002\030\0002\0020\001:\002\013\fB\007\b\002¢\006\002\020\002J\016\020\b\032\0020\t2\006\020\n\032\0020\tR\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007¨\006\r"}, d2 = {"Lai/grazie/nlp/tokenizer/retokenizer/pattern/PatternRetokenizers;", "", "()V", "defaultIgnorePatterns", "", "Lai/grazie/nlp/patterns/Pattern;", "getDefaultIgnorePatterns", "()Ljava/util/List;", "default", "Lai/grazie/nlp/tokenizer/NonDestructiveTokenizer;", "tokenizer", "URL", "UUID", "nlp-tokenizer"})
/*    */ @SourceDebugExtension({"SMAP\nPatternRetokenizers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PatternRetokenizers.kt\nai/grazie/nlp/tokenizer/retokenizer/pattern/PatternRetokenizers\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,28:1\n1863#2,2:29\n*S KotlinDebug\n*F\n+ 1 PatternRetokenizers.kt\nai/grazie/nlp/tokenizer/retokenizer/pattern/PatternRetokenizers\n*L\n24#1:29,2\n*E\n"})
/*    */ public final class PatternRetokenizers {
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004¨\006\005"}, d2 = {"Lai/grazie/nlp/tokenizer/retokenizer/pattern/PatternRetokenizers$URL;", "Lai/grazie/nlp/tokenizer/retokenizer/PatternRetokenizer;", "tokenizer", "Lai/grazie/nlp/tokenizer/NonDestructiveTokenizer;", "(Lai/grazie/nlp/tokenizer/NonDestructiveTokenizer;)V", "nlp-tokenizer"})
/*  9 */   public static final class URL extends PatternRetokenizer { public URL(@NotNull NonDestructiveTokenizer tokenizer) { super(LikelyPatterns.IsURL, tokenizer); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004¨\006\005"}, d2 = {"Lai/grazie/nlp/tokenizer/retokenizer/pattern/PatternRetokenizers$UUID;", "Lai/grazie/nlp/tokenizer/retokenizer/PatternRetokenizer;", "tokenizer", "Lai/grazie/nlp/tokenizer/NonDestructiveTokenizer;", "(Lai/grazie/nlp/tokenizer/NonDestructiveTokenizer;)V", "nlp-tokenizer"})
/* 10 */   public static final class UUID extends PatternRetokenizer { public UUID(@NotNull NonDestructiveTokenizer tokenizer) { super((Pattern)StrictPatterns.INSTANCE.getIsUUID(), tokenizer); }
/*    */      } @NotNull
/* 12 */   public static final PatternRetokenizers INSTANCE = new PatternRetokenizers(); @NotNull private static final List<Pattern> defaultIgnorePatterns; @NotNull public final List<Pattern> getDefaultIgnorePatterns() { return defaultIgnorePatterns; } static {
/* 13 */     Pattern[] arrayOfPattern = new Pattern[21]; arrayOfPattern[0] = LikelyPatterns.IsURL; arrayOfPattern[1] = LikelyPatterns.IsAbbreviation; arrayOfPattern[2] = LikelyPatterns.IsEmail; arrayOfPattern[3] = LikelyPatterns.IsIPv4; arrayOfPattern[4] = 
/* 14 */       (Pattern)StrictPatterns.INSTANCE.getIsUUID(); arrayOfPattern[5] = LikelyPatterns.TicketName; arrayOfPattern[6] = LikelyPatterns.IsMention; arrayOfPattern[7] = LikelyPatterns.AcademicCitation;
/* 15 */     arrayOfPattern[8] = LikelyPatterns.IsFilePath; arrayOfPattern[9] = LikelyPatterns.CommandLineOption; arrayOfPattern[10] = LikelyPatterns.ChainedName; arrayOfPattern[11] = LikelyPatterns.INSTANCE.snakeKebabName(2);
/* 16 */     arrayOfPattern[12] = LikelyPatterns.FunctionName;
/* 17 */     arrayOfPattern[13] = LikelyPatterns.IsCompositeInflection;
/* 18 */     arrayOfPattern[14] = LikelyPatterns.Chemical; arrayOfPattern[15] = LikelyPatterns.ChatTextEmoji; arrayOfPattern[16] = LikelyPatterns.GeneratedId;
/* 19 */     arrayOfPattern[17] = LikelyPatterns.IsIBAN; arrayOfPattern[18] = LikelyPatterns.IsCommitHash; arrayOfPattern[19] = LikelyPatterns.IsRebusAbbreviation; arrayOfPattern[20] = LikelyPatterns.IsExcelFormula;
/*    */     defaultIgnorePatterns = CollectionsKt.listOf((Object[])arrayOfPattern);
/*    */   } @NotNull
/*    */   public final NonDestructiveTokenizer default(@NotNull NonDestructiveTokenizer tokenizer) {
/* 23 */     Intrinsics.checkNotNullParameter(tokenizer, "tokenizer"); Object result = null; result = tokenizer;
/* 24 */     Iterable $this$forEach$iv = CollectionsKt.reversed(defaultIgnorePatterns); int $i$f$forEach = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 29 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Pattern it = (Pattern)element$iv; int $i$a$-forEach-PatternRetokenizers$default$1 = 0;
/*    */       result = new PatternRetokenizer(it, (NonDestructiveTokenizer)result); }
/*    */     
/*    */     return (NonDestructiveTokenizer)result;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\retokenizer\pattern\PatternRetokenizers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */