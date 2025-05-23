/*    */ package ai.grazie.nlp.patterns.standard;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\021\020\r\032\0020\016¢\006\b\n\000\032\004\b\017\020\020R\021\020\021\032\0020\022¢\006\b\n\000\032\004\b\023\020\024¨\006\025"}, d2 = {"Lai/grazie/nlp/patterns/standard/StrictPatterns;", "", "()V", "HasNoLetters", "Lai/grazie/nlp/patterns/LambdaMatchPattern;", "getHasNoLetters", "()Lai/grazie/nlp/patterns/LambdaMatchPattern;", "HasNumber", "getHasNumber", "IsApostrophe", "getIsApostrophe", "IsNumber", "getIsNumber", "IsTime", "Lai/grazie/nlp/patterns/AggregatedPattern;", "getIsTime", "()Lai/grazie/nlp/patterns/AggregatedPattern;", "IsUUID", "Lai/grazie/nlp/patterns/RegexPattern;", "getIsUUID", "()Lai/grazie/nlp/patterns/RegexPattern;", "nlp-patterns"})
/*    */ public final class StrictPatterns {
/*    */   @NotNull
/*  7 */   public static final StrictPatterns INSTANCE = new StrictPatterns(); @NotNull private static final LambdaMatchPattern IsNumber = new LambdaMatchPattern(StrictPatterns$IsNumber$1.INSTANCE); @NotNull public final LambdaMatchPattern getIsNumber() { return IsNumber; } @NotNull
/*  8 */   private static final LambdaMatchPattern IsApostrophe = new LambdaMatchPattern(StrictPatterns$IsApostrophe$1.INSTANCE); @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\r\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "text", "", "invoke", "(Ljava/lang/CharSequence;)Ljava/lang/Boolean;"}) @SourceDebugExtension({"SMAP\nStrictPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrictPatterns.kt\nai/grazie/nlp/patterns/standard/StrictPatterns$IsNumber$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,25:1\n1069#2,2:26\n*S KotlinDebug\n*F\n+ 1 StrictPatterns.kt\nai/grazie/nlp/patterns/standard/StrictPatterns$IsNumber$1\n*L\n7#1:26,2\n*E\n"}) static final class StrictPatterns$IsNumber$1 extends Lambda implements Function1<CharSequence, Boolean> { public static final StrictPatterns$IsNumber$1 INSTANCE = new StrictPatterns$IsNumber$1(); StrictPatterns$IsNumber$1() { super(1); } public final Boolean invoke(CharSequence text) { // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'text'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: aload_1
/*    */       //   7: astore_2
/*    */       //   8: iconst_0
/*    */       //   9: istore_3
/*    */       //   10: iconst_0
/*    */       //   11: istore #4
/*    */       //   13: iload #4
/*    */       //   15: aload_2
/*    */       //   16: invokeinterface length : ()I
/*    */       //   21: if_icmpge -> 60
/*    */       //   24: aload_2
/*    */       //   25: iload #4
/*    */       //   27: invokeinterface charAt : (I)C
/*    */       //   32: istore #5
/*    */       //   34: iload #5
/*    */       //   36: istore #6
/*    */       //   38: iconst_0
/*    */       //   39: istore #7
/*    */       //   41: iload #6
/*    */       //   43: invokestatic isDigit : (C)Z
/*    */       //   46: nop
/*    */       //   47: ifne -> 54
/*    */       //   50: iconst_0
/*    */       //   51: goto -> 61
/*    */       //   54: iinc #4, 1
/*    */       //   57: goto -> 13
/*    */       //   60: iconst_1
/*    */       //   61: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */       //   64: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #7	-> 6
/*    */       //   #26	-> 10
/*    */       //   #7	-> 41
/*    */       //   #7	-> 46
/*    */       //   #26	-> 47
/*    */       //   #27	-> 60
/*    */       //   #7	-> 64
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   41	6	7	$i$a$-all-StrictPatterns$IsNumber$1$1	I
/*    */       //   38	9	6	it	C
/*    */       //   34	20	5	element$iv	C
/*    */       //   10	51	3	$i$f$all	I
/*    */       //   8	53	2	$this$all$iv	Ljava/lang/CharSequence;
/*    */       //   0	65	0	this	Lai/grazie/nlp/patterns/standard/StrictPatterns$IsNumber$1;
/*  8 */       //   0	65	1	text	Ljava/lang/CharSequence; } } @NotNull public final LambdaMatchPattern getIsApostrophe() { return IsApostrophe; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\r\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "text", "", "invoke", "(Ljava/lang/CharSequence;)Ljava/lang/Boolean;"}) @SourceDebugExtension({"SMAP\nStrictPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrictPatterns.kt\nai/grazie/nlp/patterns/standard/StrictPatterns$IsApostrophe$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,25:1\n1069#2,2:26\n*S KotlinDebug\n*F\n+ 1 StrictPatterns.kt\nai/grazie/nlp/patterns/standard/StrictPatterns$IsApostrophe$1\n*L\n8#1:26,2\n*E\n"}) static final class StrictPatterns$IsApostrophe$1 extends Lambda implements Function1<CharSequence, Boolean> {
/*    */     public static final StrictPatterns$IsApostrophe$1 INSTANCE = new StrictPatterns$IsApostrophe$1(); StrictPatterns$IsApostrophe$1() { super(1); } public final Boolean invoke(CharSequence text) { // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'text'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: aload_1
/*    */       //   7: astore_2
/*    */       //   8: iconst_0
/*    */       //   9: istore_3
/*    */       //   10: iconst_0
/*    */       //   11: istore #4
/*    */       //   13: iload #4
/*    */       //   15: aload_2
/*    */       //   16: invokeinterface length : ()I
/*    */       //   21: if_icmpge -> 70
/*    */       //   24: aload_2
/*    */       //   25: iload #4
/*    */       //   27: invokeinterface charAt : (I)C
/*    */       //   32: istore #5
/*    */       //   34: iload #5
/*    */       //   36: istore #6
/*    */       //   38: iconst_0
/*    */       //   39: istore #7
/*    */       //   41: getstatic ai/grazie/nlp/utils/Symbols.INSTANCE : Lai/grazie/nlp/utils/Symbols;
/*    */       //   44: invokevirtual getApostrophes : ()Ljava/util/Set;
/*    */       //   47: iload #6
/*    */       //   49: invokestatic valueOf : (C)Ljava/lang/Character;
/*    */       //   52: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */       //   57: ifne -> 64
/*    */       //   60: iconst_0
/*    */       //   61: goto -> 71
/*    */       //   64: iinc #4, 1
/*    */       //   67: goto -> 13
/*    */       //   70: iconst_1
/*    */       //   71: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */       //   74: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #8	-> 6
/*    */       //   #26	-> 10
/*    */       //   #8	-> 41
/*    */       //   #26	-> 57
/*    */       //   #27	-> 70
/*    */       //   #8	-> 74
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   41	16	7	$i$a$-all-StrictPatterns$IsApostrophe$1$1	I
/*    */       //   38	19	6	it	C
/*    */       //   34	30	5	element$iv	C
/*    */       //   10	61	3	$i$f$all	I
/*    */       //   8	63	2	$this$all$iv	Ljava/lang/CharSequence;
/*    */       //   0	75	0	this	Lai/grazie/nlp/patterns/standard/StrictPatterns$IsApostrophe$1;
/*  9 */       //   0	75	1	text	Ljava/lang/CharSequence; } } @NotNull private static final LambdaMatchPattern HasNumber = new LambdaMatchPattern(StrictPatterns$HasNumber$1.INSTANCE); @NotNull public final LambdaMatchPattern getHasNumber() { return HasNumber; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\r\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "text", "", "invoke", "(Ljava/lang/CharSequence;)Ljava/lang/Boolean;"}) @SourceDebugExtension({"SMAP\nStrictPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrictPatterns.kt\nai/grazie/nlp/patterns/standard/StrictPatterns$HasNumber$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,25:1\n1088#2,2:26\n*S KotlinDebug\n*F\n+ 1 StrictPatterns.kt\nai/grazie/nlp/patterns/standard/StrictPatterns$HasNumber$1\n*L\n9#1:26,2\n*E\n"}) static final class StrictPatterns$HasNumber$1 extends Lambda implements Function1<CharSequence, Boolean> {
/*    */     public static final StrictPatterns$HasNumber$1 INSTANCE = new StrictPatterns$HasNumber$1(); StrictPatterns$HasNumber$1() { super(1); }
/*    */     public final Boolean invoke(CharSequence text) { // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'text'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: aload_1
/*    */       //   7: astore_2
/*    */       //   8: iconst_0
/*    */       //   9: istore_3
/*    */       //   10: iconst_0
/*    */       //   11: istore #4
/*    */       //   13: iload #4
/*    */       //   15: aload_2
/*    */       //   16: invokeinterface length : ()I
/*    */       //   21: if_icmpge -> 60
/*    */       //   24: aload_2
/*    */       //   25: iload #4
/*    */       //   27: invokeinterface charAt : (I)C
/*    */       //   32: istore #5
/*    */       //   34: iload #5
/*    */       //   36: istore #6
/*    */       //   38: iconst_0
/*    */       //   39: istore #7
/*    */       //   41: iload #6
/*    */       //   43: invokestatic isDigit : (C)Z
/*    */       //   46: nop
/*    */       //   47: ifeq -> 54
/*    */       //   50: iconst_1
/*    */       //   51: goto -> 61
/*    */       //   54: iinc #4, 1
/*    */       //   57: goto -> 13
/*    */       //   60: iconst_0
/*    */       //   61: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */       //   64: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #9	-> 6
/*    */       //   #26	-> 10
/*    */       //   #9	-> 41
/*    */       //   #9	-> 46
/*    */       //   #26	-> 47
/*    */       //   #27	-> 60
/*    */       //   #9	-> 64
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   41	6	7	$i$a$-any-StrictPatterns$HasNumber$1$1	I
/*    */       //   38	9	6	it	C
/*    */       //   34	20	5	element$iv	C
/*    */       //   10	51	3	$i$f$any	I
/*    */       //   8	53	2	$this$any$iv	Ljava/lang/CharSequence;
/*    */       //   0	65	0	this	Lai/grazie/nlp/patterns/standard/StrictPatterns$HasNumber$1;
/* 11 */       //   0	65	1	text	Ljava/lang/CharSequence; } } @NotNull private static final LambdaMatchPattern HasNoLetters = new LambdaMatchPattern(StrictPatterns$HasNoLetters$1.INSTANCE); @NotNull public final LambdaMatchPattern getHasNoLetters() { return HasNoLetters; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\r\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "text", "", "invoke", "(Ljava/lang/CharSequence;)Ljava/lang/Boolean;"}) @SourceDebugExtension({"SMAP\nStrictPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrictPatterns.kt\nai/grazie/nlp/patterns/standard/StrictPatterns$HasNoLetters$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,25:1\n1069#2,2:26\n*S KotlinDebug\n*F\n+ 1 StrictPatterns.kt\nai/grazie/nlp/patterns/standard/StrictPatterns$HasNoLetters$1\n*L\n11#1:26,2\n*E\n"}) static final class StrictPatterns$HasNoLetters$1 extends Lambda implements Function1<CharSequence, Boolean> {
/*    */     public static final StrictPatterns$HasNoLetters$1 INSTANCE = new StrictPatterns$HasNoLetters$1(); StrictPatterns$HasNoLetters$1() { super(1); }
/*    */     public final Boolean invoke(CharSequence text) { // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'text'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: aload_1
/*    */       //   7: astore_2
/*    */       //   8: iconst_0
/*    */       //   9: istore_3
/*    */       //   10: iconst_0
/*    */       //   11: istore #4
/*    */       //   13: iload #4
/*    */       //   15: aload_2
/*    */       //   16: invokeinterface length : ()I
/*    */       //   21: if_icmpge -> 67
/*    */       //   24: aload_2
/*    */       //   25: iload #4
/*    */       //   27: invokeinterface charAt : (I)C
/*    */       //   32: istore #5
/*    */       //   34: iload #5
/*    */       //   36: istore #6
/*    */       //   38: iconst_0
/*    */       //   39: istore #7
/*    */       //   41: iload #6
/*    */       //   43: invokestatic isLetter : (C)Z
/*    */       //   46: ifne -> 53
/*    */       //   49: iconst_1
/*    */       //   50: goto -> 54
/*    */       //   53: iconst_0
/*    */       //   54: ifne -> 61
/*    */       //   57: iconst_0
/*    */       //   58: goto -> 68
/*    */       //   61: iinc #4, 1
/*    */       //   64: goto -> 13
/*    */       //   67: iconst_1
/*    */       //   68: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */       //   71: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #11	-> 6
/*    */       //   #26	-> 10
/*    */       //   #11	-> 41
/*    */       //   #11	-> 46
/*    */       //   #26	-> 54
/*    */       //   #27	-> 67
/*    */       //   #11	-> 71
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   41	13	7	$i$a$-all-StrictPatterns$HasNoLetters$1$1	I
/*    */       //   38	16	6	it	C
/*    */       //   34	27	5	element$iv	C
/*    */       //   10	58	3	$i$f$all	I
/*    */       //   8	60	2	$this$all$iv	Ljava/lang/CharSequence;
/*    */       //   0	72	0	this	Lai/grazie/nlp/patterns/standard/StrictPatterns$HasNoLetters$1;
/* 13 */       //   0	72	1	text	Ljava/lang/CharSequence; } } @NotNull private static final RegexPattern IsUUID = new RegexPattern(new Regex("([a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12})")); @NotNull private static final AggregatedPattern IsTime; @NotNull public final RegexPattern getIsUUID() { return IsUUID; }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final AggregatedPattern getIsTime()
/*    */   {
/* 20 */     return IsTime; } static {
/* 21 */     Pattern[] arrayOfPattern = new Pattern[2]; arrayOfPattern[0] = (new RegexPattern(new Regex("(0?[1-9]|1[0-2][:.][0-5][0-9])"))).withWordBoundariesAround(); arrayOfPattern[1] = (
/* 22 */       new RegexPattern(new Regex("(0?[1-9]|1[0-2][:.][0-5][0-9][:.][0-5][0-9])"))).withWordBoundariesAround();
/*    */     IsTime = new AggregatedPattern(arrayOfPattern);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\standard\StrictPatterns.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */