/*     */ package ai.grazie.nlp.patterns.standard;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\f\n\002\030\002\n\002\b\016\n\002\020\016\n\002\b\f\n\002\020\013\n\000\n\002\020\r\n\002\b\002\n\002\020\b\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020,\032\0020-2\006\020.\032\0020/H\002J\016\0200\032\0020\0042\006\0201\032\00202J\020\0203\032\0020-2\006\020.\032\0020/H\002R\020\020\003\032\0020\0048\006X\004¢\006\002\n\000R\020\020\005\032\0020\0048\006X\004¢\006\002\n\000R\020\020\006\032\0020\0048\006X\004¢\006\002\n\000R\020\020\007\032\0020\0048\006X\004¢\006\002\n\000R\020\020\b\032\0020\0048\006X\004¢\006\002\n\000R\020\020\t\032\0020\0048\006X\004¢\006\002\n\000R\020\020\n\032\0020\0048\006X\004¢\006\002\n\000R\020\020\013\032\0020\0048\006X\004¢\006\002\n\000R\020\020\f\032\0020\0048\006X\004¢\006\002\n\000R\020\020\r\032\0020\0048\006X\004¢\006\002\n\000R\020\020\016\032\0020\0048\006X\004¢\006\002\n\000R\020\020\017\032\0020\0048\006X\004¢\006\002\n\000R\020\020\020\032\0020\0218\006X\004¢\006\002\n\000R\020\020\022\032\0020\0048\006X\004¢\006\002\n\000R\020\020\023\032\0020\0048\006X\004¢\006\002\n\000R\020\020\024\032\0020\0048\006X\004¢\006\002\n\000R\020\020\025\032\0020\0048\006X\004¢\006\002\n\000R\020\020\026\032\0020\0048\006X\004¢\006\002\n\000R\020\020\027\032\0020\0048\006X\004¢\006\002\n\000R\020\020\030\032\0020\0048\006X\004¢\006\002\n\000R\020\020\031\032\0020\0048\006X\004¢\006\002\n\000R\020\020\032\032\0020\0048\006X\004¢\006\002\n\000R\020\020\033\032\0020\0048\006X\004¢\006\002\n\000R\020\020\034\032\0020\0048\006X\004¢\006\002\n\000R\020\020\035\032\0020\0048\006X\004¢\006\002\n\000R\020\020\036\032\0020\0048\006X\004¢\006\002\n\000R\016\020\037\032\0020 XT¢\006\002\n\000R\016\020!\032\0020 XT¢\006\002\n\000R\016\020\"\032\0020 XT¢\006\002\n\000R\016\020#\032\0020 XT¢\006\002\n\000R\016\020$\032\0020 XT¢\006\002\n\000R\016\020%\032\0020 XT¢\006\002\n\000R\016\020&\032\0020 XT¢\006\002\n\000R\016\020'\032\0020 X\004¢\006\002\n\000R\016\020(\032\0020 XT¢\006\002\n\000R\016\020)\032\0020 XT¢\006\002\n\000R\016\020*\032\0020 XT¢\006\002\n\000R\016\020+\032\0020 XT¢\006\002\n\000¨\0064"}, d2 = {"Lai/grazie/nlp/patterns/standard/LikelyPatterns;", "", "()V", "AcademicCitation", "Lai/grazie/nlp/patterns/Pattern;", "ChainedName", "ChatTextEmoji", "Chemical", "CommandLineOption", "FunctionName", "GeneratedId", "IsAbbreviation", "IsCommitHash", "IsCompositeInflection", "IsDotInBashCommand", "IsEmail", "IsEncodedBinary", "Lai/grazie/nlp/patterns/LambdaMatchPattern;", "IsExcelFormula", "IsFilePath", "IsGermanDateWithDot", "IsGermanOrdinal", "IsGermanOrdinalAfterNames", "IsIBAN", "IsIPv4", "IsMention", "IsRebusAbbreviation", "IsURL", "NameInitials", "PunctuationOperator", "TicketName", "dashLikeChars", "", "deBeforeNumerals", "firstNameInitials", "germanExtendedInitial", "initial", "lastNameInitial", "onlyInitials", "quotes", "romanDigits", "russianExtendedInitial", "smileyPattern", "smileyStartChars", "looksLikeNonBullet", "", "text", "", "snakeKebabName", "minSeparatorCount", "", "startsWithLowerCase", "nlp-patterns"}) public final class LikelyPatterns { @NotNull public static final LikelyPatterns INSTANCE; @JvmField @NotNull
/*     */   public static final Pattern AcademicCitation; @JvmField
/*     */   @NotNull
/*     */   public static final Pattern IsEmail; @JvmField
/*     */   @NotNull
/*     */   public static final Pattern CommandLineOption; @JvmField
/*     */   @NotNull
/*     */   public static final Pattern ChainedName; @JvmField
/*     */   @NotNull
/*     */   public static final Pattern FunctionName; @JvmField
/*     */   @NotNull
/*     */   public static final Pattern IsMention; @JvmField
/*     */   @NotNull
/*     */   public static final Pattern ChatTextEmoji; @JvmField
/*     */   @NotNull
/*  16 */   public static final Pattern GeneratedId; static { LikelyPatterns $this$AcademicCitation_u24lambda_u242 = INSTANCE = new LikelyPatterns(); int $i$a$-run-LikelyPatterns$AcademicCitation$1 = 0;
/*  17 */     String year = "(1[89]|20)\\d\\d";
/*     */     
/*  19 */     LikelyPatterns $this$AcademicCitation_u24lambda_u242_u24lambda_u240 = $this$AcademicCitation_u24lambda_u242; int $i$a$-run-LikelyPatterns$AcademicCitation$1$authors$1 = 0;
/*  20 */     String surname = "\\p{Lu}\\p{Ll}+";
/*  21 */     String andWord = "and|und|и|та";
/*  22 */     String etAlWords = "et\\sal\\.|и\\sдр\\.|та\\sін\\.";
/*  23 */     String authors = surname + "((\\s?&\\s?|,\\s|/|\\s(" + surname + ")\\s)" + andWord + ")*(\\s(" + surname + ")|,)?";
/*     */ 
/*     */     
/*  26 */     String citationWithInnerParens = authors + "\\s\\(" + authors + "\\p{L}?";
/*     */ 
/*     */     
/*  29 */     LikelyPatterns $this$AcademicCitation_u24lambda_u242_u24lambda_u241 = $this$AcademicCitation_u24lambda_u242; int $i$a$-run-LikelyPatterns$AcademicCitation$1$citationInParens$1 = 0;
/*  30 */     String cf = "(cf|vgl|ср)\\.\\s";
/*  31 */     String pageOrYear = "[1-9]\\d*";
/*  32 */     String singleRef = authors + "\\s" + authors + "\\p{L}?";
/*  33 */     String citationInParens = "[(\\[](" + cf + ")?" + singleRef + "([,;]\\s" + singleRef + ")*";
/*     */ 
/*     */     
/*  36 */     AcademicCitation = (new RegexPattern(new Regex(citationInParens + "|" + citationInParens))).withWordBoundariesAround();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  44 */     LikelyPatterns $this$IsEmail_u24lambda_u243 = INSTANCE; int $i$a$-run-LikelyPatterns$IsEmail$1 = 0;
/*  45 */     String specialPrefixChars = "_.+-";
/*  46 */     Regex regex4 = new Regex("[a-zA-Z0-9" + specialPrefixChars + "]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)+"); IsEmail = (Pattern)new LikelyPatterns$IsEmail$1$1(specialPrefixChars, regex4);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  63 */     Regex regex1 = new Regex("--[a-z0-9][a-z0-9-]+|-[XJD]?[a-z]{1,3}");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  69 */     CommandLineOption = (new LikelyPatterns$CommandLineOption$1(regex1)).after(new Regex("^|[\\s\\p{Pi}\\p{Po}(]"));
/*     */     
/*  71 */     LikelyPatterns $this$ChainedName_u24lambda_u244 = INSTANCE; int $i$a$-run-LikelyPatterns$ChainedName$1 = 0;
/*  72 */     String str1 = "[a-zA-Z_]([a-zA-Z_\\d]*)";
/*  73 */     regex4 = new Regex(str1 + "(\\." + str1 + ")+"); ChainedName = (new LikelyPatterns$ChainedName$1$1(regex4))
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  78 */       .withWordBoundariesAround();
/*     */ 
/*     */     
/*  81 */     LikelyPatterns $this$FunctionName_u24lambda_u245 = INSTANCE; int $i$a$-run-LikelyPatterns$FunctionName$1 = 0;
/*  82 */     Regex regex2 = new Regex("[a-zA-Z_]([a-zA-Z_\\d]*)\\(\\)"); FunctionName = (new LikelyPatterns$FunctionName$1$1(regex2))
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  87 */       .withWordBoundariesAround();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 104 */     LikelyPatterns $this$IsMention_u24lambda_u246 = INSTANCE; int $i$a$-run-LikelyPatterns$IsMention$1 = 0;
/* 105 */     String nickname = "[\\w.]+";
/* 106 */     String fullName = "\\p{Lu}\\p{Ll}+([\\s.]\\p{Lu}\\p{Ll}+)+";
/* 107 */     String personMention = "@(" + fullName + "|" + nickname + ")";
/* 108 */     String hashtag = "#[\\p{L}\\d_]([\\p{L}\\d_-]+)?[\\p{L}\\d_]";
/* 109 */     Regex regex5 = new Regex(personMention + "|" + personMention); IsMention = (new LikelyPatterns$IsMention$1$1(regex5))
/*     */ 
/*     */ 
/*     */       
/* 113 */       .afterWordBoundary();
/*     */ 
/*     */ 
/*     */     
/* 117 */     regex1 = new Regex(":\\w+:"); ChatTextEmoji = (Pattern)new LikelyPatterns$ChatTextEmoji$1(regex1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     regex1 = new Regex("[a-zA-Z_0-9-]{10,}");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 133 */     GeneratedId = (new LikelyPatterns$GeneratedId$1(regex1)).withWordBoundariesAround(); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$IsEmail$1$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   @SourceDebugExtension({"SMAP\nLikelyPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LikelyPatterns.kt\nai/grazie/nlp/patterns/standard/LikelyPatterns$IsEmail$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,508:1\n1#2:509\n*E\n"})
/*     */   public static final class LikelyPatterns$IsEmail$1$1
/*     */     extends RegexPattern
/*     */   {
/*     */     LikelyPatterns$IsEmail$1$1(String $specialPrefixChars, Regex $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'text'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: new java/util/ArrayList
/*     */       //   9: dup
/*     */       //   10: invokespecial <init> : ()V
/*     */       //   13: astore_2
/*     */       //   14: iconst_1
/*     */       //   15: istore_3
/*     */       //   16: aload_1
/*     */       //   17: invokeinterface length : ()I
/*     */       //   22: iconst_3
/*     */       //   23: isub
/*     */       //   24: istore #4
/*     */       //   26: iload_3
/*     */       //   27: iload #4
/*     */       //   29: if_icmpge -> 174
/*     */       //   32: aload_1
/*     */       //   33: iload_3
/*     */       //   34: invokeinterface charAt : (I)C
/*     */       //   39: bipush #64
/*     */       //   41: if_icmpne -> 168
/*     */       //   44: iconst_0
/*     */       //   45: istore #5
/*     */       //   47: iload_3
/*     */       //   48: istore #5
/*     */       //   50: iload #5
/*     */       //   52: iconst_1
/*     */       //   53: isub
/*     */       //   54: ifle -> 112
/*     */       //   57: aload_1
/*     */       //   58: iload #5
/*     */       //   60: iconst_1
/*     */       //   61: isub
/*     */       //   62: invokeinterface charAt : (I)C
/*     */       //   67: invokestatic isLetterOrDigit : (C)Z
/*     */       //   70: ifne -> 99
/*     */       //   73: aload_0
/*     */       //   74: getfield $specialPrefixChars : Ljava/lang/String;
/*     */       //   77: checkcast java/lang/CharSequence
/*     */       //   80: aload_1
/*     */       //   81: iload #5
/*     */       //   83: iconst_1
/*     */       //   84: isub
/*     */       //   85: invokeinterface charAt : (I)C
/*     */       //   90: iconst_0
/*     */       //   91: iconst_2
/*     */       //   92: aconst_null
/*     */       //   93: invokestatic contains$default : (Ljava/lang/CharSequence;CZILjava/lang/Object;)Z
/*     */       //   96: ifeq -> 112
/*     */       //   99: iload #5
/*     */       //   101: istore #6
/*     */       //   103: iload #6
/*     */       //   105: iconst_m1
/*     */       //   106: iadd
/*     */       //   107: istore #5
/*     */       //   109: goto -> 50
/*     */       //   112: iload #5
/*     */       //   114: iload_3
/*     */       //   115: if_icmpge -> 168
/*     */       //   118: aload_0
/*     */       //   119: invokevirtual getRegex : ()Lkotlin/text/Regex;
/*     */       //   122: aload_1
/*     */       //   123: iload #5
/*     */       //   125: invokevirtual matchAt : (Ljava/lang/CharSequence;I)Lkotlin/text/MatchResult;
/*     */       //   128: dup
/*     */       //   129: ifnull -> 166
/*     */       //   132: astore #7
/*     */       //   134: iconst_0
/*     */       //   135: istore #8
/*     */       //   137: aload_2
/*     */       //   138: new ai/grazie/text/TextRange
/*     */       //   141: dup
/*     */       //   142: iload #5
/*     */       //   144: aload #7
/*     */       //   146: invokeinterface getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   151: invokevirtual getLast : ()I
/*     */       //   154: iconst_1
/*     */       //   155: iadd
/*     */       //   156: invokespecial <init> : (II)V
/*     */       //   159: invokevirtual add : (Ljava/lang/Object;)Z
/*     */       //   162: pop
/*     */       //   163: goto -> 168
/*     */       //   166: pop
/*     */       //   167: nop
/*     */       //   168: iinc #3, 1
/*     */       //   171: goto -> 26
/*     */       //   174: aload_2
/*     */       //   175: checkcast java/util/List
/*     */       //   178: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #48	-> 6
/*     */       //   #49	-> 14
/*     */       //   #50	-> 32
/*     */       //   #51	-> 44
/*     */       //   #52	-> 50
/*     */       //   #52	-> 70
/*     */       //   #53	-> 112
/*     */       //   #54	-> 118
/*     */       //   #509	-> 134
/*     */       //   #54	-> 137
/*     */       //   #54	-> 163
/*     */       //   #54	-> 166
/*     */       //   #49	-> 168
/*     */       //   #58	-> 174
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   137	25	8	$i$a$-let-LikelyPatterns$IsEmail$1$1$find$1	I
/*     */       //   134	28	7	it	Lkotlin/text/MatchResult;
/*     */       //   47	121	5	start	I
/*     */       //   16	158	3	i	I
/*     */       //   14	165	2	result	Ljava/util/ArrayList;
/*     */       //   0	179	0	this	Lai/grazie/nlp/patterns/standard/LikelyPatterns$IsEmail$1$1;
/*     */       //   0	179	1	text	Ljava/lang/CharSequence;
/*     */     }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$CommandLineOption$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   public static final class LikelyPatterns$CommandLineOption$1
/*     */     extends RegexPattern
/*     */   {
/*     */     LikelyPatterns$CommandLineOption$1(Regex $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return super.find(text);
/*     */     }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$ChainedName$1$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   public static final class LikelyPatterns$ChainedName$1$1
/*     */     extends RegexPattern
/*     */   {
/*     */     LikelyPatterns$ChainedName$1$1(Regex $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return super.find(text);
/*     */     }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$FunctionName$1$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   public static final class LikelyPatterns$FunctionName$1$1
/*     */     extends RegexPattern
/*     */   {
/*     */     LikelyPatterns$FunctionName$1$1(Regex $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return super.find(text);
/*     */     }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Pattern snakeKebabName(int minSeparatorCount) {
/*     */     String version = "\\d+(.\\d+)*";
/*     */     String part = "[a-z]+\\*?";
/*     */     String id = part + "([-_]\\*?" + part + "){" + part + ",}";
/*     */     Regex regex = new Regex(id + "(-?" + id + ")?|" + version + "(-" + version + ")+");
/*     */     return (new LikelyPatterns$snakeKebabName$1(regex)).withWordBoundariesAround();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$snakeKebabName$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   public static final class LikelyPatterns$snakeKebabName$1
/*     */     extends RegexPattern
/*     */   {
/*     */     LikelyPatterns$snakeKebabName$1(Regex $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return super.find(text);
/*     */     }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$IsMention$1$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   @SourceDebugExtension({"SMAP\nLikelyPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LikelyPatterns.kt\nai/grazie/nlp/patterns/standard/LikelyPatterns$IsMention$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,508:1\n774#2:509\n865#2,2:510\n*S KotlinDebug\n*F\n+ 1 LikelyPatterns.kt\nai/grazie/nlp/patterns/standard/LikelyPatterns$IsMention$1$1\n*L\n111#1:509\n111#1:510,2\n*E\n"})
/*     */   public static final class LikelyPatterns$IsMention$1$1
/*     */     extends RegexPattern
/*     */   {
/*     */     LikelyPatterns$IsMention$1$1(Regex $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public List<TextRange> find(CharSequence text)
/*     */     {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       Iterable $this$filter$iv = super.find(text);
/*     */       int $i$f$filter = 0;
/* 509 */       Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 510 */       for (Object element$iv$iv : iterable1) { TextRange it = (TextRange)element$iv$iv; int $i$a$-filter-LikelyPatterns$IsMention$1$1$find$1 = 0; if (Pattern.Companion.isWordBoundaryOrApostrophe$nlp_patterns(text, it.getEndExclusive())) destination$iv$iv.add(element$iv$iv);  }
/* 511 */        return (List)destination$iv$iv; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$ChatTextEmoji$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"}) public static final class LikelyPatterns$ChatTextEmoji$1 extends RegexPattern { LikelyPatterns$ChatTextEmoji$1(Regex $super_call_param$1) { super($super_call_param$1); } public List<TextRange> find(CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); return super.find(text); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$GeneratedId$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"}) @SourceDebugExtension({"SMAP\nLikelyPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LikelyPatterns.kt\nai/grazie/nlp/patterns/standard/LikelyPatterns$GeneratedId$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,508:1\n774#2:509\n865#2:510\n866#2:514\n1104#3,3:511\n*S KotlinDebug\n*F\n+ 1 LikelyPatterns.kt\nai/grazie/nlp/patterns/standard/LikelyPatterns$GeneratedId$1\n*L\n127#1:509\n127#1:510\n127#1:514\n130#1:511,3\n*E\n"}) public static final class LikelyPatterns$GeneratedId$1 extends RegexPattern { LikelyPatterns$GeneratedId$1(Regex $super_call_param$1) { super($super_call_param$1); } public List<TextRange> find(CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); Iterable $this$filter$iv = super.find(text); int $i$f$filter = 0; Iterable iterable1 = $this$filter$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0; for (Object element$iv$iv : iterable1) { TextRange range = (TextRange)element$iv$iv; int $i$a$-filter-LikelyPatterns$GeneratedId$1$find$1 = 0; continue; found = text.subSequence(SYNTHETIC_LOCAL_VARIABLE_9.getStart(), SYNTHETIC_LOCAL_VARIABLE_9.getEndExclusive()); minCount = 3; $this$count$iv = found; $i$f$count = 0; count$iv = 0;
/* 512 */         for (byte b = 0; b < $this$count$iv.length(); ) { char element$iv = $this$count$iv.charAt(b), it = element$iv; int $i$a$-count-LikelyPatterns$GeneratedId$1$find$1$1 = 0; if (Character.isUpperCase(it)) count$iv++;  }
/*     */          }
/* 514 */        return (List<TextRange>)destination$iv$iv; } } @JvmField @NotNull public static final LambdaMatchPattern IsEncodedBinary = new LambdaMatchPattern(LikelyPatterns$IsEncodedBinary$1.INSTANCE); @JvmField @NotNull public static final Pattern IsIPv4; @JvmField @NotNull public static final Pattern IsFilePath; @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\r\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "text", "", "invoke", "(Ljava/lang/CharSequence;)Ljava/lang/Boolean;"}) @SourceDebugExtension({"SMAP\nLikelyPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LikelyPatterns.kt\nai/grazie/nlp/patterns/standard/LikelyPatterns$IsEncodedBinary$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,508:1\n1069#2,2:509\n1088#2,2:511\n*S KotlinDebug\n*F\n+ 1 LikelyPatterns.kt\nai/grazie/nlp/patterns/standard/LikelyPatterns$IsEncodedBinary$1\n*L\n141#1:509,2\n141#1:511,2\n*E\n"}) static final class LikelyPatterns$IsEncodedBinary$1 extends Lambda implements Function1<CharSequence, Boolean> { public static final LikelyPatterns$IsEncodedBinary$1 INSTANCE = new LikelyPatterns$IsEncodedBinary$1(); public final Boolean invoke(CharSequence text) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'text'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_1
/*     */       //   7: astore_2
/*     */       //   8: iconst_0
/*     */       //   9: istore_3
/*     */       //   10: iconst_0
/*     */       //   11: istore #4
/*     */       //   13: iload #4
/*     */       //   15: aload_2
/*     */       //   16: invokeinterface length : ()I
/*     */       //   21: if_icmpge -> 75
/*     */       //   24: aload_2
/*     */       //   25: iload #4
/*     */       //   27: invokeinterface charAt : (I)C
/*     */       //   32: istore #5
/*     */       //   34: iload #5
/*     */       //   36: istore #6
/*     */       //   38: iconst_0
/*     */       //   39: istore #7
/*     */       //   41: iload #6
/*     */       //   43: invokestatic isUpperCase : (C)Z
/*     */       //   46: ifne -> 57
/*     */       //   49: iload #6
/*     */       //   51: invokestatic isDigit : (C)Z
/*     */       //   54: ifeq -> 61
/*     */       //   57: iconst_1
/*     */       //   58: goto -> 62
/*     */       //   61: iconst_0
/*     */       //   62: ifne -> 69
/*     */       //   65: iconst_0
/*     */       //   66: goto -> 76
/*     */       //   69: iinc #4, 1
/*     */       //   72: goto -> 13
/*     */       //   75: iconst_1
/*     */       //   76: ifeq -> 199
/*     */       //   79: aload_1
/*     */       //   80: astore_2
/*     */       //   81: iconst_0
/*     */       //   82: istore_3
/*     */       //   83: iconst_0
/*     */       //   84: istore #4
/*     */       //   86: iload #4
/*     */       //   88: aload_2
/*     */       //   89: invokeinterface length : ()I
/*     */       //   94: if_icmpge -> 133
/*     */       //   97: aload_2
/*     */       //   98: iload #4
/*     */       //   100: invokeinterface charAt : (I)C
/*     */       //   105: istore #5
/*     */       //   107: iload #5
/*     */       //   109: istore #6
/*     */       //   111: iconst_0
/*     */       //   112: istore #7
/*     */       //   114: iload #6
/*     */       //   116: invokestatic isLetterOrDigit : (C)Z
/*     */       //   119: nop
/*     */       //   120: ifne -> 127
/*     */       //   123: iconst_0
/*     */       //   124: goto -> 134
/*     */       //   127: iinc #4, 1
/*     */       //   130: goto -> 86
/*     */       //   133: iconst_1
/*     */       //   134: ifeq -> 199
/*     */       //   137: aload_1
/*     */       //   138: astore_2
/*     */       //   139: iconst_0
/*     */       //   140: istore_3
/*     */       //   141: iconst_0
/*     */       //   142: istore #4
/*     */       //   144: iload #4
/*     */       //   146: aload_2
/*     */       //   147: invokeinterface length : ()I
/*     */       //   152: if_icmpge -> 191
/*     */       //   155: aload_2
/*     */       //   156: iload #4
/*     */       //   158: invokeinterface charAt : (I)C
/*     */       //   163: istore #5
/*     */       //   165: iload #5
/*     */       //   167: istore #6
/*     */       //   169: iconst_0
/*     */       //   170: istore #7
/*     */       //   172: iload #6
/*     */       //   174: invokestatic isDigit : (C)Z
/*     */       //   177: nop
/*     */       //   178: ifeq -> 185
/*     */       //   181: iconst_1
/*     */       //   182: goto -> 192
/*     */       //   185: iinc #4, 1
/*     */       //   188: goto -> 144
/*     */       //   191: iconst_0
/*     */       //   192: ifeq -> 199
/*     */       //   195: iconst_1
/*     */       //   196: goto -> 200
/*     */       //   199: iconst_0
/*     */       //   200: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */       //   203: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #141	-> 6
/*     */       //   #509	-> 10
/*     */       //   #141	-> 41
/*     */       //   #141	-> 46
/*     */       //   #141	-> 54
/*     */       //   #509	-> 62
/*     */       //   #510	-> 75
/*     */       //   #141	-> 76
/*     */       //   #509	-> 83
/*     */       //   #141	-> 114
/*     */       //   #141	-> 119
/*     */       //   #509	-> 120
/*     */       //   #510	-> 133
/*     */       //   #141	-> 134
/*     */       //   #511	-> 141
/*     */       //   #141	-> 172
/*     */       //   #141	-> 177
/*     */       //   #511	-> 178
/*     */       //   #512	-> 191
/*     */       //   #141	-> 192
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   41	21	7	$i$a$-all-LikelyPatterns$IsEncodedBinary$1$1	I
/*     */       //   38	24	6	it	C
/*     */       //   34	35	5	element$iv	C
/*     */       //   10	66	3	$i$f$all	I
/*     */       //   8	68	2	$this$all$iv	Ljava/lang/CharSequence;
/*     */       //   114	6	7	$i$a$-all-LikelyPatterns$IsEncodedBinary$1$2	I
/*     */       //   111	9	6	it	C
/*     */       //   107	20	5	element$iv	C
/*     */       //   83	51	3	$i$f$all	I
/*     */       //   81	53	2	$this$all$iv	Ljava/lang/CharSequence;
/*     */       //   172	6	7	$i$a$-any-LikelyPatterns$IsEncodedBinary$1$3	I
/*     */       //   169	9	6	it	C
/*     */       //   165	20	5	element$iv	C
/*     */       //   141	51	3	$i$f$any	I
/*     */       //   139	53	2	$this$any$iv	Ljava/lang/CharSequence;
/*     */       //   0	204	0	this	Lai/grazie/nlp/patterns/standard/LikelyPatterns$IsEncodedBinary$1;
/* 514 */       //   0	204	1	text	Ljava/lang/CharSequence; } LikelyPatterns$IsEncodedBinary$1() { super(1); } } static { regex1 = new Regex("(?:[1-9]\\d?|1\\d\\d|2[01]\\d|22[0-3])(?:\\.(?:1?\\d{1,2}|2[0-4]\\d|25[0-5])){2}\\.(?:[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-4])"); IsIPv4 = (Pattern)new LikelyPatterns$IsIPv4$1(regex1); LikelyPatterns $this$IsFilePath_u24lambda_u247 = INSTANCE; int $i$a$-run-LikelyPatterns$IsFilePath$1 = 0; String slash = "([/\\\\]{1,2})"; String namePart = "(\\.?[\\w~-])"; String pathPart = "(<(" + namePart + "| ){1,100}>|%(" + namePart + "| ){1,100}%|\\$\\{" + namePart + "{1,100}\\}|" + namePart + "{1,100}|\\*+)"; String pathWithSlashes = slash + "?" + slash + "(" + pathPart + slash + "){1,100}" + pathPart + "?|" + slash + slash; String dotName = "\\*?\\.[a-z][a-z0-9]{1,6}"; String nameWithExtensionAndPunctuation = "[a-zA-Z][\\w\\*]+-[-\\w‹›<>{}]*\\*?\\.\\*?[a-z]{1,5}"; String pathWildcard = "<" + namePart + "{1,100}?_" + namePart + "{1,100}>"; Regex regex6 = new Regex(pathWithSlashes + "|" + pathWithSlashes + "|" + nameWithExtensionAndPunctuation + "|" + pathWildcard); IsFilePath = (new LikelyPatterns$IsFilePath$1$1(regex6)).beforeWordBoundary(); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$IsIPv4$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"}) public static final class LikelyPatterns$IsIPv4$1 extends RegexPattern { LikelyPatterns$IsIPv4$1(Regex $super_call_param$1) { super($super_call_param$1); } public List<TextRange> find(CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); return super.find(text); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000/\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000\n\002\020\013\n\000\n\002\020\f\n\002\b\002\n\002\020\b\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026J\020\020\007\032\0020\b2\006\020\t\032\0020\nH\002J\030\020\013\032\0020\b2\006\020\005\032\0020\0062\006\020\f\032\0020\rH\002¨\006\016"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$IsFilePath$1$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "isNamePatternPart", "", "c", "", "isPathStartAllowed", "start", "", "nlp-patterns"}) public static final class LikelyPatterns$IsFilePath$1$1 extends RegexPattern { LikelyPatterns$IsFilePath$1$1(Regex $super_call_param$1) { super($super_call_param$1); } private final boolean isNamePatternPart(char c) { if (!StringsKt.contains$default("~_-‹›<>{}*", c, false, 2, null)) if (!(('0' <= c) ? ((c < ':') ? 1 : 0) : 0)) if (!(('a' <= c) ? ((c < '{') ? 1 : 0) : 0)) { if (('A' <= c) ? ((c < '[')) : false); return false; }    } public List<TextRange> find(CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); ArrayList<TextRange> result = new ArrayList(); int i = 0; int minStart = 0; while (i < text.length()) { char c = text.charAt(i); boolean retreat = (c == '/' || c == '\\' || c == '<' || c == '.'); if (retreat || c == '%' || c == '$') { int start = i; if (retreat) for (; start > minStart && isNamePatternPart(text.charAt(start - 1)); start--);  while (start <= i) { if (isPathStartAllowed(text, start)) { MatchResult match = getRegex().matchAt(text, start); if (match != null) { minStart = match.getRange().getLast() + 1; result.add(TextRange.Companion.invoke(match.getRange())); i = Math.max(match.getRange().getLast(), i); break; }  }  start++; }  }  i++; }  return result; } private final boolean isPathStartAllowed(CharSequence text, int start) { return (Pattern.Companion.isWordBoundaryBefore(text, start) && (start <= 0 || !Character.isLetterOrDigit(text.charAt(start - 1)))); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0005\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\r\n\000\n\002\020 \n\000\n\002\020\013\n\000\n\002\020\f\n\002\b\002*\001\000\b\n\030\0002\0020\001J\032\020\005\032\004\030\0010\0062\006\020\007\032\0020\0062\006\020\b\032\0020\tH\002J\026\020\n\032\b\022\004\022\0020\0060\0132\006\020\b\032\0020\tH\026J\020\020\f\032\0020\r2\006\020\016\032\0020\017H\002J\020\020\020\032\0020\r2\006\020\b\032\0020\tH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\003X\004¢\006\002\n\000¨\006\021"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$IsURL$1", "Lai/grazie/nlp/patterns/Pattern;", "mainUrlPartsRegex", "Lkotlin/text/Regex;", "optionalPrefixRegex", "addPrefixes", "Lai/grazie/text/TextRange;", "range", "text", "", "find", "", "isMainUrlPart", "", "c", "", "matches", "nlp-patterns"}) public static final class LikelyPatterns$IsURL$1 implements Pattern { private final Regex optionalPrefixRegex; private final Regex mainUrlPartsRegex; LikelyPatterns$IsURL$1() { this.optionalPrefixRegex = new Regex("(?:[-\\w+.]{2,}://)?(?:\\S+(?::\\S+)?@)?"); this.mainUrlPartsRegex = new Regex("(?:(?:[1-9]\\d?|1\\d\\d|2[01]\\d|22[0-3])(?:\\.(?:1?\\d{1,2}|2[0-4]\\d|25[0-5])){2}\\.(?:[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-4])|(?:(?:[\\p{L}\\d][\\p{L}\\d_-]{0,62})?[\\p{L}\\d]\\.)+(?:\\p{L}\\p{Ll}{1,20}|\\p{Lu}{2,4}))(?::\\d{2,5})?(?:[/?#]\\S*)?"); } private final boolean isMainUrlPart(char c) { return (c == '_' || c == '-' || Character.isLetterOrDigit(c)); } public List<TextRange> find(CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); ArrayList<TextRange> result = new ArrayList(); int i = 1; while (i < text.length() - 1) { if (text.charAt(i) == '.' && isMainUrlPart(text.charAt(i - 1)) && isMainUrlPart(text.charAt(i + 1))) { IntRange mainMatch; int mainStart = i - 1; for (; mainStart > 0 && isMainUrlPart(text.charAt(mainStart - 1)); mainStart--); for (; i < text.length() && !CharsKt.isWhitespace(text.charAt(i)); i++); if (this.mainUrlPartsRegex.matchAt(text, mainStart) == null || this.mainUrlPartsRegex.matchAt(text, mainStart).getRange() == null) { this.mainUrlPartsRegex.matchAt(text, mainStart).getRange(); continue; }  if (mainMatch.getLast() + 1 >= text.length() || !isMainUrlPart(text.charAt(mainMatch.getLast() + 1))) { TextRange range; if (addPrefixes(TextRange.Companion.invoke(mainMatch), text) == null) { addPrefixes(TextRange.Companion.invoke(mainMatch), text); continue; }  result.add(range); }  continue; }  i++; }  return result; } private final TextRange addPrefixes(TextRange range, CharSequence text) { if (range.getStart() > 2) { int start = range.getStart() - 1; if (text.charAt(start) == '@' || text.charAt(start) == '/') { for (; start > 0 && !CharsKt.isWhitespace(text.charAt(start - 1)); start--); while (start < range.getStart() - 1) { if (Pattern.Companion.isWordBoundaryBefore(text, start) && this.optionalPrefixRegex.matches(text.subSequence(start, range.getStart()))) return new TextRange(start, range.getEndExclusive());  start++; }  return null; }  }  return range; } public boolean matches(CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); int dot = StringsKt.indexOf$default(text, '.', 1, false, 4, null); if (dot < 0 || dot >= text.length() - 2 || !isMainUrlPart(text.charAt(dot - 1)) || !isMainUrlPart(text.charAt(dot + 1))) return false;  MatchResult prefix = this.optionalPrefixRegex.matchAt(text, 0); return text.matchesAt((CharSequence)prefix, (prefix == null) ? 0 : (prefix.getRange().getLast() + 1)); } } @JvmField @NotNull public static final Pattern IsURL = (new LikelyPatterns$IsURL$1()).exclude(IsIPv4).exclude(IsEmail); @JvmField @NotNull public static final Pattern IsAbbreviation = AbbreviationPatterns.All; @NotNull public static final String romanDigits = "IVXLMCD"; @NotNull private static final String deBeforeNumerals = "rsmneudt"; @JvmField @NotNull public static final Pattern IsGermanOrdinal; @JvmField @NotNull public static final Pattern IsGermanDateWithDot; @JvmField @NotNull public static final Pattern IsGermanOrdinalAfterNames; @JvmField @NotNull public static final Pattern IsCompositeInflection; @NotNull private static final String russianExtendedInitial = "Вяч|Всев|Ив"; @NotNull private static final String germanExtendedInitial = "S(ch|p)"; @NotNull private static final String initial = "(\\p{Lu}|Вяч|Всев|Ив|S(ch|p))\\."; @NotNull private static final String firstNameInitials = "((\\p{Lu}|Вяч|Всев|Ив|S(ch|p))\\.\\s?){1,2}([:?!)–—-]|\\p{Lu}\\p{Ll}+)"; @NotNull private static final String onlyInitials = "(\\p{Lu}|Вяч|Всев|Ив|S(ch|p))\\.(\\s?(\\p{Lu}|Вяч|Всев|Ив|S(ch|p))\\.)*"; @NotNull private static final String lastNameInitial = "\\p{Lu}(\\p{Ll})+\\s\\p{Lu}\\."; @JvmField @NotNull public static final Pattern NameInitials; @NotNull public static final String smileyStartChars = ":;"; @NotNull public static final String smileyPattern = "[:;]-?[()]+"; @NotNull public static final String dashLikeChars = "-–—"; @JvmField @NotNull public static final Pattern PunctuationOperator; @JvmField @NotNull public static final Pattern TicketName; @JvmField @NotNull public static final Pattern Chemical; @JvmField @NotNull public static final Pattern IsIBAN; @JvmField @NotNull public static final Pattern IsCommitHash; @JvmField @NotNull public static final Pattern IsRebusAbbreviation; @JvmField @NotNull public static final Pattern IsExcelFormula; @NotNull private static final String quotes = "'\"`‘’" + CollectionsKt.joinToString$default(UnicodePunctuationNormalizer.Companion.getDoubleQuotes(), "", null, null, 0, null, null, 62, null); @JvmField @NotNull public static final Pattern IsDotInBashCommand; private final boolean startsWithLowerCase(CharSequence text) { return (((text.length() > 0)) && Character.isLowerCase(text.charAt(0))); } static { regex1 = new Regex("(\\d{1,3})\\."); Intrinsics.checkNotNullExpressionValue("rsmneudt".toUpperCase(Locale.ROOT), "toUpperCase(...)"); IsGermanOrdinal = (new LikelyPatterns$IsGermanOrdinal$1(regex1)).after(new Regex("^|([,.rsmneudt" + "rsmneudt".toUpperCase(Locale.ROOT) + "],?|" + TextRegex.INSTANCE.getPunctuation().getPattern() + ")[ \\t]+")).before(new Regex("[  ]([a-zäöüA-ZÄÖÜ]\\p{L}*|bis|zu|an|und|oder|od\\.)")); regex1 = new Regex("(0?\\d|[12]\\d|3[01])\\.(0?\\d|1[012])\\."); IsGermanDateWithDot = (new LikelyPatterns$IsGermanDateWithDot$1(regex1)).withWordBoundariesAround(); Intrinsics.checkNotNullExpressionValue("IVXLMCD".toLowerCase(Locale.ROOT), "toLowerCase(...)"); regex1 = new Regex("[IVXLMCD" + "IVXLMCD".toLowerCase(Locale.ROOT) + "]+\\."); IsGermanOrdinalAfterNames = (new LikelyPatterns$IsGermanOrdinalAfterNames$1(regex1)).withWordBoundariesAround(); LikelyPatterns $this$IsCompositeInflection_u24lambda_u248 = INSTANCE; int $i$a$-run-LikelyPatterns$IsCompositeInflection$1 = 0; String russianAdjEndings = "([ыиое]?й|[аь]?я|[оьы]?е|ь?и|([ое]?г)?о|([ыоеи]?м)?у|[ьу]?ю|[ыи]?х|(ыи)?ми?)"; String ukrainianAdjEndings = "(і([ймх]|ми)|[ауеіяєю]|о?(го|му|ї)|и?([ймх]|ми)|ьо(го|му|ї))"; String latinLikeWord = "[a-zA-ZäöüÄÖÜßs0-9]+"; Pattern latinWithCyrillicEnding = (new RegexPattern(new Regex("(щи)?[а-яёїієґ]{1,4}"))).beforeWordBoundary().after(new Regex(latinLikeWord + "[-']|[A-ZÄÖÜ]{2,}")); RegexPattern parenthesizedSurnameEnding = new RegexPattern(new Regex("\\p{Lu}\\p{L}+в\\(в(а|ой|у|ы|ыми?|ых)\\)")); RegexPattern slashEnding = new RegexPattern(new Regex("[а-яёА-ЯЁ]+/" + russianAdjEndings)); RegexPattern wordWithOptionalEnding = new RegexPattern(new Regex("\\p{L}+\\(-?\\p{L}{1,3}\\)")); RegexPattern germanGendern = new RegexPattern(new Regex("\\p{Lu}\\p{L}+(I|\\*i|:i)nnen|\\p{L}{2,}\\p{Ll}(e[RN]|E)")); RegexPattern russianGender = new RegexPattern(new Regex("\\p{L}{3,}[_:*/]([вртм]?" + russianAdjEndings + "|((ни)?[кц])?([аиыеу]|ой|ей|ами?|ах)|о?к|и?ц|\\p{L}?([ауеыяюи]|ом|ем|ём|ами?|ями?|ах|ях|ов|ев))")); Pattern russianNumeralOrEnding = (new RegexPattern(new Regex("(\\d+%?|%|-)(ов|ом|[вртмн]?" + russianAdjEndings + "|ами?|ах|[ауеы])"))).beforeWordBoundary(); Pattern ukrainianNumeralOrEnding = (new RegexPattern(new Regex("(\\d+%?|%)?-[шгтмвн]?" + ukrainianAdjEndings))).beforeWordBoundary(); RegexPattern englishOrdinal = new RegexPattern(new Regex("\\d+(st|nd|rd|th)")); Pattern germanNumeralEnding = (new RegexPattern(new Regex("\\d((s?t)?e[rmns]?|%-?ig(e[rmns]?)?)"))).beforeWordBoundary(); Pattern latinSuffix = (new RegexPattern(new Regex("[-']itis"))).beforeWordBoundary().after(new Regex(latinLikeWord)); Pattern[] arrayOfPattern1 = new Pattern[6]; Pattern[] arrayOfPattern2 = new Pattern[6]; arrayOfPattern2[0] = (Pattern)parenthesizedSurnameEnding; arrayOfPattern2[1] = (Pattern)slashEnding; arrayOfPattern2[2] = (Pattern)wordWithOptionalEnding; arrayOfPattern2[3] = (Pattern)germanGendern; arrayOfPattern2[4] = (Pattern)russianGender; arrayOfPattern2[5] = (Pattern)englishOrdinal; arrayOfPattern1[0] = (new AggregatedPattern(arrayOfPattern2)).withWordBoundariesAround(); arrayOfPattern1[1] = russianNumeralOrEnding; arrayOfPattern1[2] = ukrainianNumeralOrEnding; arrayOfPattern1[3] = germanNumeralEnding; arrayOfPattern1[4] = latinWithCyrillicEnding; arrayOfPattern1[5] = latinSuffix; Pattern[] arrayOfPattern3 = arrayOfPattern1; IsCompositeInflection = (Pattern)new LikelyPatterns$IsCompositeInflection$1$1(arrayOfPattern3); regex1 = new Regex("((\\p{Lu}|Вяч|Всев|Ив|S(ch|p))\\.\\s?){1,2}([:?!)–—-]|\\p{Lu}\\p{Ll}+)|\\p{Lu}(\\p{Ll})+\\s\\p{Lu}\\.|(\\p{Lu}|Вяч|Всев|Ив|S(ch|p))\\.(\\s?(\\p{Lu}|Вяч|Всев|Ив|S(ch|p))\\.)*"); NameInitials = (new LikelyPatterns$NameInitials$1(regex1)).afterWordBoundary(); LikelyPatterns $this$PunctuationOperator_u24lambda_u249 = INSTANCE; int $i$a$-run-LikelyPatterns$PunctuationOperator$1 = 0; String operatorSign = "(!{1,2}|\\?{2,3}|\\?\\.?|//[?!]+)"; Regex regex3 = new Regex("['\"]" + operatorSign + "['\"]|[\\p{L},:]\\s{1,4}" + operatorSign + "(\\s{1,4}[\\p{Ll},])"); PunctuationOperator = (Pattern)new LikelyPatterns$PunctuationOperator$1$1(regex3); regex1 = new Regex("[A-Z]+-([A-Z]+-)?[0-9]+"); TicketName = (new LikelyPatterns$TicketName$1(regex1)).withWordBoundariesAround(); LikelyPatterns $this$Chemical_u24lambda_u2410 = INSTANCE; int $i$a$-run-LikelyPatterns$Chemical$1 = 0; String part = "\\d(,\\d)+-[A-Za-z][a-z]+ne"; regex3 = new Regex(part + "(-" + part + ")*"); Chemical = (new LikelyPatterns$Chemical$1$1(regex3)).withWordBoundariesAround(); LikelyPatterns $this$IsIBAN_u24lambda_u2411 = INSTANCE; int $i$a$-run-LikelyPatterns$IsIBAN$1 = 0; String separator = "[\\s ]?"; regex3 = new Regex("[A-Z]{2}" + separator + "\\d{2}" + separator + "(?:[A-Z0-9]" + separator + "){1,30}"); IsIBAN = (new LikelyPatterns$IsIBAN$1$1(regex3)).withWordBoundariesAround(); regex1 = new Regex("[0-9a-f]{40}"); IsCommitHash = (new LikelyPatterns$IsCommitHash$1(regex1)).withWordBoundariesAround(); regex1 = new Regex("[A-Za-z]*[24][A-Za-z]+"); IsRebusAbbreviation = (new LikelyPatterns$IsRebusAbbreviation$1(regex1)).afterWordBoundary(); regex1 = new Regex("=[A-Z]{3,7}\\(\\S+\\)"); IsExcelFormula = (new LikelyPatterns$IsExcelFormula$1(regex1)).withWordBoundariesAround(); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\t"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$IsGermanOrdinal$1", "Lai/grazie/nlp/patterns/RegexPattern;", "definiteContinuation", "Lkotlin/text/Regex;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"}) @SourceDebugExtension({"SMAP\nLikelyPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LikelyPatterns.kt\nai/grazie/nlp/patterns/standard/LikelyPatterns$IsGermanOrdinal$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,508:1\n774#2:509\n865#2,2:510\n*S KotlinDebug\n*F\n+ 1 LikelyPatterns.kt\nai/grazie/nlp/patterns/standard/LikelyPatterns$IsGermanOrdinal$1\n*L\n326#1:509\n326#1:510,2\n*E\n"}) public static final class LikelyPatterns$IsGermanOrdinal$1 extends RegexPattern { private final Regex definiteContinuation; LikelyPatterns$IsGermanOrdinal$1(Regex $super_call_param$1) { super($super_call_param$1); this.definiteContinuation = new Regex(" ((" + CollectionsKt.joinToString$default(AbbreviationPatterns.INSTANCE.getGermanMonthsShort(), "|", null, null, 0, null, null, 62, null) + ")\\.|" + CollectionsKt.joinToString$default(AbbreviationPatterns.INSTANCE.getGermanMonthsFull(), "|", null, null, 0, null, null, 62, null) + ")"); } public List<TextRange> find(CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); Iterable $this$filter$iv = super.find(text); int $i$f$filter = 0; Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0; for (Object element$iv$iv : iterable1) { TextRange range = (TextRange)element$iv$iv; int $i$a$-filter-LikelyPatterns$IsGermanOrdinal$1$find$1 = 0; if ((range.getStart() > 0 || this.definiteContinuation.matchesAt(text, range.getEndExclusive()) || LikelyPatterns.INSTANCE.startsWithLowerCase(StringsKt.trim(text.subSequence(range.getEndExclusive(), text.length()))))) destination$iv$iv.add(element$iv$iv);  }  return (List)destination$iv$iv; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$IsGermanDateWithDot$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"}) public static final class LikelyPatterns$IsGermanDateWithDot$1 extends RegexPattern { LikelyPatterns$IsGermanDateWithDot$1(Regex $super_call_param$1) { super($super_call_param$1); } public List<TextRange> find(CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); return super.find(text); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$IsGermanOrdinalAfterNames$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"}) public static final class LikelyPatterns$IsGermanOrdinalAfterNames$1 extends RegexPattern { LikelyPatterns$IsGermanOrdinalAfterNames$1(Regex $super_call_param$1) { super($super_call_param$1); } public List<TextRange> find(CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); return super.find(text); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$IsCompositeInflection$1$1", "Lai/grazie/nlp/patterns/AggregatedPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"}) public static final class LikelyPatterns$IsCompositeInflection$1$1 extends AggregatedPattern { LikelyPatterns$IsCompositeInflection$1$1(Pattern[] $super_call_param$1) { super($super_call_param$1); } public List<TextRange> find(CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); return super.find(text); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$NameInitials$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"}) @SourceDebugExtension({"SMAP\nLikelyPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LikelyPatterns.kt\nai/grazie/nlp/patterns/standard/LikelyPatterns$NameInitials$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,508:1\n774#2:509\n865#2,2:510\n774#2:512\n865#2,2:513\n*S KotlinDebug\n*F\n+ 1 LikelyPatterns.kt\nai/grazie/nlp/patterns/standard/LikelyPatterns$NameInitials$1\n*L\n410#1:509\n410#1:510,2\n411#1:512\n411#1:513,2\n*E\n"}) public static final class LikelyPatterns$NameInitials$1 extends RegexPattern { public List<TextRange> find(CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); Iterable $this$filter$iv = super.find(text); int $i$f$filter = 0; Iterable iterable1 = $this$filter$iv; Collection<Object> collection1 = new ArrayList(); int $i$f$filterTo = 0; for (Object element$iv$iv : iterable1) { TextRange it = (TextRange)element$iv$iv; int $i$a$-filter-LikelyPatterns$NameInitials$1$find$1 = 0; if ((it.getStart() > 0 || LikelyPatterns.INSTANCE.looksLikeNonBullet(text.subSequence(0, it.getEndExclusive())) || (it.getEndExclusive() - it.getStart() < 5 && LikelyPatterns.INSTANCE.startsWithLowerCase(StringsKt.trim(text.subSequence(it.getEndExclusive(), text.length())))))) collection1.add(element$iv$iv);  }  $this$filter$iv = collection1; $i$f$filter = 0; Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); $i$f$filterTo = 0; for (Object element$iv$iv : $this$filterTo$iv$iv) { TextRange it = (TextRange)element$iv$iv; int $i$a$-filter-LikelyPatterns$NameInitials$1$find$2 = 0; if (Pattern.Companion.isWordBoundaryOrApostrophe$nlp_patterns(text, it.getEndExclusive())) destination$iv$iv.add(element$iv$iv);  }  return (List)destination$iv$iv; }
/*     */ 
/*     */     
/*     */     LikelyPatterns$NameInitials$1(Regex $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     } }
/*     */ 
/*     */   
/*     */   private final boolean looksLikeNonBullet(CharSequence text) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokeinterface length : ()I
/*     */     //   6: iconst_3
/*     */     //   7: if_icmplt -> 71
/*     */     //   10: aload_1
/*     */     //   11: ldc '. '
/*     */     //   13: checkcast java/lang/CharSequence
/*     */     //   16: iconst_1
/*     */     //   17: iconst_0
/*     */     //   18: iconst_4
/*     */     //   19: aconst_null
/*     */     //   20: invokestatic startsWith$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;IZILjava/lang/Object;)Z
/*     */     //   23: ifeq -> 67
/*     */     //   26: aload_1
/*     */     //   27: astore_2
/*     */     //   28: iconst_3
/*     */     //   29: istore_3
/*     */     //   30: aload_2
/*     */     //   31: invokeinterface length : ()I
/*     */     //   36: istore #4
/*     */     //   38: aload_2
/*     */     //   39: iload_3
/*     */     //   40: iload #4
/*     */     //   42: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
/*     */     //   47: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   50: checkcast java/lang/CharSequence
/*     */     //   53: ldc '. '
/*     */     //   55: checkcast java/lang/CharSequence
/*     */     //   58: iconst_0
/*     */     //   59: iconst_2
/*     */     //   60: aconst_null
/*     */     //   61: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   64: ifeq -> 71
/*     */     //   67: iconst_1
/*     */     //   68: goto -> 72
/*     */     //   71: iconst_0
/*     */     //   72: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #416	-> 0
/*     */     //   #416	-> 53
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	73	0	this	Lai/grazie/nlp/patterns/standard/LikelyPatterns;
/*     */     //   0	73	1	text	Ljava/lang/CharSequence;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$PunctuationOperator$1$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   public static final class LikelyPatterns$PunctuationOperator$1$1 extends RegexPattern {
/*     */     LikelyPatterns$PunctuationOperator$1$1(Regex $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return super.find(text);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$TicketName$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   public static final class LikelyPatterns$TicketName$1 extends RegexPattern {
/*     */     LikelyPatterns$TicketName$1(Regex $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return super.find(text);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$Chemical$1$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   public static final class LikelyPatterns$Chemical$1$1 extends RegexPattern {
/*     */     LikelyPatterns$Chemical$1$1(Regex $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return super.find(text);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$IsIBAN$1$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   public static final class LikelyPatterns$IsIBAN$1$1 extends RegexPattern {
/*     */     LikelyPatterns$IsIBAN$1$1(Regex $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return super.find(text);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$IsCommitHash$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   public static final class LikelyPatterns$IsCommitHash$1 extends RegexPattern {
/*     */     LikelyPatterns$IsCommitHash$1(Regex $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return super.find(text);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$IsRebusAbbreviation$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   @SourceDebugExtension({"SMAP\nLikelyPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LikelyPatterns.kt\nai/grazie/nlp/patterns/standard/LikelyPatterns$IsRebusAbbreviation$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,508:1\n774#2:509\n865#2,2:510\n*S KotlinDebug\n*F\n+ 1 LikelyPatterns.kt\nai/grazie/nlp/patterns/standard/LikelyPatterns$IsRebusAbbreviation$1\n*L\n488#1:509\n488#1:510,2\n*E\n"})
/*     */   public static final class LikelyPatterns$IsRebusAbbreviation$1 extends RegexPattern {
/*     */     LikelyPatterns$IsRebusAbbreviation$1(Regex $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       Iterable $this$filter$iv = super.find(text);
/*     */       int $i$f$filter = 0;
/*     */       Iterable iterable1 = $this$filter$iv;
/*     */       Collection<Object> destination$iv$iv = new ArrayList();
/*     */       int $i$f$filterTo = 0;
/*     */       for (Object element$iv$iv : iterable1) {
/*     */         TextRange it = (TextRange)element$iv$iv;
/*     */         int $i$a$-filter-LikelyPatterns$IsRebusAbbreviation$1$find$1 = 0;
/*     */         if (Pattern.Companion.isWordBoundaryOrApostrophe$nlp_patterns(text, it.getEndExclusive()))
/*     */           destination$iv$iv.add(element$iv$iv); 
/*     */       } 
/*     */       return (List)destination$iv$iv;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$IsExcelFormula$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   public static final class LikelyPatterns$IsExcelFormula$1 extends RegexPattern {
/*     */     LikelyPatterns$IsExcelFormula$1(Regex $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return super.find(text);
/*     */     }
/*     */   }
/*     */   
/*     */   static {
/*     */     regex1 = new Regex(" \\.[ ?" + quotes + "]");
/*     */     IsDotInBashCommand = (Pattern)new LikelyPatterns$IsDotInBashCommand$1(regex1);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$IsDotInBashCommand$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   public static final class LikelyPatterns$IsDotInBashCommand$1 extends RegexPattern {
/*     */     LikelyPatterns$IsDotInBashCommand$1(Regex $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return super.find(text);
/*     */     }
/*     */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\standard\LikelyPatterns.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */