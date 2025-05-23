/*    */ package ai.grazie.nlp.langs.alphabet;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\"\n\002\020\f\n\002\b\002\n\002\020\013\n\000\n\002\020\r\n\002\b\004\b\026\030\0002\0020\001B'\b\026\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005¢\006\002\020\bB7\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\n0\t\022\f\020\006\032\b\022\004\022\0020\n0\t\022\f\020\007\032\b\022\004\022\0020\n0\t¢\006\002\020\013J\020\020\f\032\0020\r2\006\020\016\032\0020\017H\026J\020\020\020\032\0020\r2\006\020\016\032\0020\017H\026J\020\020\021\032\0020\r2\006\020\016\032\0020\017H\026J\020\020\022\032\0020\r2\006\020\016\032\0020\017H\026R\024\020\004\032\b\022\004\022\0020\n0\tX\004¢\006\002\n\000R\024\020\006\032\b\022\004\022\0020\n0\tX\004¢\006\002\n\000R\024\020\007\032\b\022\004\022\0020\n0\tX\004¢\006\002\n\000¨\006\023"}, d2 = {"Lai/grazie/nlp/langs/alphabet/SetBasedAlphabet;", "Lai/grazie/nlp/langs/alphabet/Alphabet;", "group", "Lai/grazie/nlp/langs/alphabet/Alphabet$Group;", "all", "", "special", "unique", "(Lai/grazie/nlp/langs/alphabet/Alphabet$Group;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "", "(Lai/grazie/nlp/langs/alphabet/Alphabet$Group;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V", "matchAny", "", "input", "", "matchAnySpecial", "matchAnyUnique", "matchEntire", "nlp-langs"})
/*    */ @SourceDebugExtension({"SMAP\nSetBasedAlphabet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetBasedAlphabet.kt\nai/grazie/nlp/langs/alphabet/SetBasedAlphabet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,33:1\n1557#2:34\n1628#2,3:35\n1557#2:38\n1628#2,3:39\n1557#2:42\n1628#2,3:43\n1088#3,2:46\n1088#3,2:48\n1088#3,2:50\n1069#3,2:52\n*S KotlinDebug\n*F\n+ 1 SetBasedAlphabet.kt\nai/grazie/nlp/langs/alphabet/SetBasedAlphabet\n*L\n8#1:34\n8#1:35,3\n9#1:38\n9#1:39,3\n10#1:42\n10#1:43,3\n18#1:46,2\n25#1:48,2\n28#1:50,2\n30#1:52,2\n*E\n"})
/*    */ public class SetBasedAlphabet extends Alphabet {
/*    */   public SetBasedAlphabet(@NotNull Alphabet.Group group, @NotNull Set all, @NotNull Set special, @NotNull Set unique) {
/*  7 */     super(group, null);
/*  8 */     Set set1 = all, set3 = all; SetBasedAlphabet setBasedAlphabet = this; int $i$f$map = 0;
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
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 34 */     Set set2 = set1; Collection<Character> collection2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set1, 10)); int $i$f$mapTo = 0;
/* 35 */     for (Object item$iv$iv : set2) {
/* 36 */       char c = ((Character)item$iv$iv).charValue(); Collection<Character> collection = collection2; int $i$a$-map-SetBasedAlphabet$all$1 = 0; collection.add(Character.valueOf(Character.toUpperCase(c)));
/* 37 */     }  List list = (List)collection2; setBasedAlphabet.all = CollectionsKt.toSet(SetsKt.plus(set3, list)); Iterable $this$map$iv = special; set3 = special; setBasedAlphabet = this; $i$f$map = 0;
/* 38 */     Iterable $this$mapTo$iv$iv = $this$map$iv; Collection<Character> collection1 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); $i$f$mapTo = 0;
/* 39 */     for (Object item$iv$iv : $this$mapTo$iv$iv) {
/* 40 */       char it = ((Character)item$iv$iv).charValue(); Collection<Character> collection = collection1; int $i$a$-map-SetBasedAlphabet$special$1 = 0; collection.add(Character.valueOf(Character.toUpperCase(it)));
/* 41 */     }  list = (List)collection1; setBasedAlphabet.special = CollectionsKt.toSet(SetsKt.plus(set3, list)); $this$map$iv = unique; set3 = unique; setBasedAlphabet = this; $i$f$map = 0;
/* 42 */     $this$mapTo$iv$iv = $this$map$iv; Collection<Character> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); $i$f$mapTo = 0;
/* 43 */     for (Object item$iv$iv : $this$mapTo$iv$iv) {
/* 44 */       char it = ((Character)item$iv$iv).charValue(); Collection<Character> collection = destination$iv$iv; int $i$a$-map-SetBasedAlphabet$unique$1 = 0; collection.add(Character.valueOf(Character.toUpperCase(it)));
/* 45 */     }  list = (List)destination$iv$iv;
/*    */     setBasedAlphabet.unique = CollectionsKt.toSet(SetsKt.plus(set3, list));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final Set<Character> all;
/*    */   @NotNull
/*    */   private final Set<Character> special;
/*    */   @NotNull
/*    */   private final Set<Character> unique;
/*    */   
/*    */   public SetBasedAlphabet(@NotNull Alphabet.Group group, @NotNull String all, @NotNull String special, @NotNull String unique) {
/*    */     this(group, StringsKt.toSet(all), StringsKt.toSet(special), StringsKt.toSet(unique));
/*    */   }
/*    */   
/*    */   public boolean matchAnyUnique(@NotNull CharSequence input) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'input'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield unique : Ljava/util/Set;
/*    */     //   10: invokeinterface isEmpty : ()Z
/*    */     //   15: ifeq -> 20
/*    */     //   18: iconst_0
/*    */     //   19: ireturn
/*    */     //   20: aload_1
/*    */     //   21: astore_2
/*    */     //   22: iconst_0
/*    */     //   23: istore_3
/*    */     //   24: iconst_0
/*    */     //   25: istore #4
/*    */     //   27: iload #4
/*    */     //   29: aload_2
/*    */     //   30: invokeinterface length : ()I
/*    */     //   35: if_icmpge -> 82
/*    */     //   38: aload_2
/*    */     //   39: iload #4
/*    */     //   41: invokeinterface charAt : (I)C
/*    */     //   46: istore #5
/*    */     //   48: iload #5
/*    */     //   50: istore #6
/*    */     //   52: iconst_0
/*    */     //   53: istore #7
/*    */     //   55: aload_0
/*    */     //   56: getfield unique : Ljava/util/Set;
/*    */     //   59: iload #6
/*    */     //   61: invokestatic valueOf : (C)Ljava/lang/Character;
/*    */     //   64: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */     //   69: ifeq -> 76
/*    */     //   72: iconst_1
/*    */     //   73: goto -> 83
/*    */     //   76: iinc #4, 1
/*    */     //   79: goto -> 27
/*    */     //   82: iconst_0
/*    */     //   83: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 6
/*    */     //   #16	-> 18
/*    */     //   #18	-> 20
/*    */     //   #46	-> 24
/*    */     //   #18	-> 55
/*    */     //   #46	-> 69
/*    */     //   #47	-> 82
/*    */     //   #18	-> 83
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   55	14	7	$i$a$-any-SetBasedAlphabet$matchAnyUnique$1	I
/*    */     //   52	17	6	it	C
/*    */     //   48	28	5	element$iv	C
/*    */     //   24	59	3	$i$f$any	I
/*    */     //   22	61	2	$this$any$iv	Ljava/lang/CharSequence;
/*    */     //   0	84	0	this	Lai/grazie/nlp/langs/alphabet/SetBasedAlphabet;
/*    */     //   0	84	1	input	Ljava/lang/CharSequence;
/*    */   }
/*    */   
/*    */   public boolean matchAnySpecial(@NotNull CharSequence input) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'input'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield special : Ljava/util/Set;
/*    */     //   10: invokeinterface isEmpty : ()Z
/*    */     //   15: ifeq -> 20
/*    */     //   18: iconst_0
/*    */     //   19: ireturn
/*    */     //   20: aload_1
/*    */     //   21: astore_2
/*    */     //   22: iconst_0
/*    */     //   23: istore_3
/*    */     //   24: iconst_0
/*    */     //   25: istore #4
/*    */     //   27: iload #4
/*    */     //   29: aload_2
/*    */     //   30: invokeinterface length : ()I
/*    */     //   35: if_icmpge -> 82
/*    */     //   38: aload_2
/*    */     //   39: iload #4
/*    */     //   41: invokeinterface charAt : (I)C
/*    */     //   46: istore #5
/*    */     //   48: iload #5
/*    */     //   50: istore #6
/*    */     //   52: iconst_0
/*    */     //   53: istore #7
/*    */     //   55: aload_0
/*    */     //   56: getfield special : Ljava/util/Set;
/*    */     //   59: iload #6
/*    */     //   61: invokestatic valueOf : (C)Ljava/lang/Character;
/*    */     //   64: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */     //   69: ifeq -> 76
/*    */     //   72: iconst_1
/*    */     //   73: goto -> 83
/*    */     //   76: iinc #4, 1
/*    */     //   79: goto -> 27
/*    */     //   82: iconst_0
/*    */     //   83: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 6
/*    */     //   #23	-> 18
/*    */     //   #25	-> 20
/*    */     //   #48	-> 24
/*    */     //   #25	-> 55
/*    */     //   #48	-> 69
/*    */     //   #49	-> 82
/*    */     //   #25	-> 83
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   55	14	7	$i$a$-any-SetBasedAlphabet$matchAnySpecial$1	I
/*    */     //   52	17	6	it	C
/*    */     //   48	28	5	element$iv	C
/*    */     //   24	59	3	$i$f$any	I
/*    */     //   22	61	2	$this$any$iv	Ljava/lang/CharSequence;
/*    */     //   0	84	0	this	Lai/grazie/nlp/langs/alphabet/SetBasedAlphabet;
/*    */     //   0	84	1	input	Ljava/lang/CharSequence;
/*    */   }
/*    */   
/*    */   public boolean matchAny(@NotNull CharSequence input) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'input'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: astore_2
/*    */     //   8: iconst_0
/*    */     //   9: istore_3
/*    */     //   10: iconst_0
/*    */     //   11: istore #4
/*    */     //   13: iload #4
/*    */     //   15: aload_2
/*    */     //   16: invokeinterface length : ()I
/*    */     //   21: if_icmpge -> 68
/*    */     //   24: aload_2
/*    */     //   25: iload #4
/*    */     //   27: invokeinterface charAt : (I)C
/*    */     //   32: istore #5
/*    */     //   34: iload #5
/*    */     //   36: istore #6
/*    */     //   38: iconst_0
/*    */     //   39: istore #7
/*    */     //   41: aload_0
/*    */     //   42: getfield all : Ljava/util/Set;
/*    */     //   45: iload #6
/*    */     //   47: invokestatic valueOf : (C)Ljava/lang/Character;
/*    */     //   50: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */     //   55: ifeq -> 62
/*    */     //   58: iconst_1
/*    */     //   59: goto -> 69
/*    */     //   62: iinc #4, 1
/*    */     //   65: goto -> 13
/*    */     //   68: iconst_0
/*    */     //   69: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #28	-> 6
/*    */     //   #50	-> 10
/*    */     //   #28	-> 41
/*    */     //   #50	-> 55
/*    */     //   #51	-> 68
/*    */     //   #28	-> 69
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   41	14	7	$i$a$-any-SetBasedAlphabet$matchAny$1	I
/*    */     //   38	17	6	it	C
/*    */     //   34	28	5	element$iv	C
/*    */     //   10	59	3	$i$f$any	I
/*    */     //   8	61	2	$this$any$iv	Ljava/lang/CharSequence;
/*    */     //   0	70	0	this	Lai/grazie/nlp/langs/alphabet/SetBasedAlphabet;
/*    */     //   0	70	1	input	Ljava/lang/CharSequence;
/*    */   }
/*    */   
/*    */   public boolean matchEntire(@NotNull CharSequence input) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'input'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: astore_2
/*    */     //   8: iconst_0
/*    */     //   9: istore_3
/*    */     //   10: iconst_0
/*    */     //   11: istore #4
/*    */     //   13: iload #4
/*    */     //   15: aload_2
/*    */     //   16: invokeinterface length : ()I
/*    */     //   21: if_icmpge -> 68
/*    */     //   24: aload_2
/*    */     //   25: iload #4
/*    */     //   27: invokeinterface charAt : (I)C
/*    */     //   32: istore #5
/*    */     //   34: iload #5
/*    */     //   36: istore #6
/*    */     //   38: iconst_0
/*    */     //   39: istore #7
/*    */     //   41: aload_0
/*    */     //   42: getfield all : Ljava/util/Set;
/*    */     //   45: iload #6
/*    */     //   47: invokestatic valueOf : (C)Ljava/lang/Character;
/*    */     //   50: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */     //   55: ifne -> 62
/*    */     //   58: iconst_0
/*    */     //   59: goto -> 69
/*    */     //   62: iinc #4, 1
/*    */     //   65: goto -> 13
/*    */     //   68: iconst_1
/*    */     //   69: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #30	-> 6
/*    */     //   #52	-> 10
/*    */     //   #30	-> 41
/*    */     //   #52	-> 55
/*    */     //   #53	-> 68
/*    */     //   #30	-> 69
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   41	14	7	$i$a$-all-SetBasedAlphabet$matchEntire$1	I
/*    */     //   38	17	6	it	C
/*    */     //   34	28	5	element$iv	C
/*    */     //   10	59	3	$i$f$all	I
/*    */     //   8	61	2	$this$all$iv	Ljava/lang/CharSequence;
/*    */     //   0	70	0	this	Lai/grazie/nlp/langs/alphabet/SetBasedAlphabet;
/*    */     //   0	70	1	input	Ljava/lang/CharSequence;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-langs-jvm-0.4.32.jar!\ai\grazie\nlp\langs\alphabet\SetBasedAlphabet.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */