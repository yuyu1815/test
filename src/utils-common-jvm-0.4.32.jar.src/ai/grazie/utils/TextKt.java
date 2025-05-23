/*     */ package ai.grazie.utils;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000>\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\002\b\004\n\002\020\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\020 \n\000\n\002\030\002\n\002\020\r\n\002\030\002\n\002\b\002\032\022\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\001\032\n\020\003\032\0020\001*\0020\001\032\022\020\004\032\0020\001*\0020\0012\006\020\005\032\0020\001\032\022\020\006\032\0020\001*\0020\0012\006\020\007\032\0020\001\032\n\020\b\032\0020\t*\0020\001\032\n\020\n\032\0020\t*\0020\001\032\n\020\013\032\0020\t*\0020\001\032\n\020\f\032\0020\001*\0020\001\032&\020\r\032\0020\016*\0060\017j\002`\0202\006\020\021\032\0020\0222\006\020\023\032\0020\0222\006\020\024\032\0020\001\032.\020\025\032\0020\001\"\004\b\000\020\026*\b\022\004\022\002H\0260\0272\026\b\002\020\030\032\020\022\004\022\002H\026\022\004\022\0020\032\030\0010\031\0326\020\025\032\0020\001\"\004\b\000\020\026*\b\022\004\022\002H\0260\0332\026\b\002\020\030\032\020\022\004\022\002H\026\022\004\022\0020\032\030\0010\031H@¢\006\002\020\034¨\006\035"}, d2 = {"alignCasingTo", "", "other", "capitalize", "dropPostfix", "postfix", "dropPrefix", "prefix", "isCapitalized", "", "isLowercase", "isUppercase", "normalizeAccents", "replace", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "start", "", "endExclusive", "value", "text", "T", "", "transform", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-common"})
/*     */ @SourceDebugExtension({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\nai/grazie/utils/TextKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,155:1\n1#2:156\n1069#3,2:157\n1069#3,2:159\n1069#3,2:161\n*S KotlinDebug\n*F\n+ 1 Text.kt\nai/grazie/utils/TextKt\n*L\n32#1:157,2\n39#1:159,2\n47#1:161,2\n*E\n"})
/*     */ public final class TextKt {
/*     */   @NotNull
/*     */   public static final String dropPrefix(@NotNull String $this$dropPrefix, @NotNull String prefix) {
/*   9 */     Intrinsics.checkNotNullParameter($this$dropPrefix, "<this>"); Intrinsics.checkNotNullParameter(prefix, "prefix"); return StringsKt.startsWith$default($this$dropPrefix, prefix, false, 2, null) ? 
/*  10 */       StringsKt.drop($this$dropPrefix, prefix.length()) : 
/*     */       
/*  12 */       $this$dropPrefix;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String dropPostfix(@NotNull String $this$dropPostfix, @NotNull String postfix) {
/*  17 */     Intrinsics.checkNotNullParameter($this$dropPostfix, "<this>"); Intrinsics.checkNotNullParameter(postfix, "postfix"); return StringsKt.endsWith$default($this$dropPostfix, postfix, false, 2, null) ? 
/*  18 */       StringsKt.dropLast($this$dropPostfix, postfix.length()) : 
/*     */       
/*  20 */       $this$dropPostfix;
/*     */   }
/*     */   @NotNull
/*     */   public static final String capitalize(@NotNull String $this$capitalize) {
/*  24 */     Intrinsics.checkNotNullParameter($this$capitalize, "<this>"); String str1 = $this$capitalize; char c = str1.charAt(0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 156 */     StringBuilder stringBuilder = new StringBuilder(); int $i$a$-replaceFirstCharWithCharSequence-TextKt$capitalize$1 = 0;
/*     */     String str2 = str1;
/*     */     $i$a$-replaceFirstCharWithCharSequence-TextKt$capitalize$1 = 1;
/*     */     Intrinsics.checkNotNullExpressionValue(str2.substring($i$a$-replaceFirstCharWithCharSequence-TextKt$capitalize$1), "substring(...)");
/*     */     return ((str1.length() > 0)) ? stringBuilder.append(Character.isLowerCase(c) ? CharsKt.titlecase(c) : String.valueOf(c)).append(str2.substring($i$a$-replaceFirstCharWithCharSequence-TextKt$capitalize$1)).toString() : str1;
/*     */   }
/*     */   
/*     */   public static final boolean isCapitalized(@NotNull String $this$isCapitalized) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: checkcast java/lang/CharSequence
/*     */     //   10: invokestatic firstOrNull : (Ljava/lang/CharSequence;)Ljava/lang/Character;
/*     */     //   13: dup
/*     */     //   14: ifnull -> 26
/*     */     //   17: invokevirtual charValue : ()C
/*     */     //   20: invokestatic isUpperCase : (C)Z
/*     */     //   23: goto -> 28
/*     */     //   26: pop
/*     */     //   27: iconst_0
/*     */     //   28: ifeq -> 97
/*     */     //   31: aload_0
/*     */     //   32: iconst_1
/*     */     //   33: invokestatic drop : (Ljava/lang/String;I)Ljava/lang/String;
/*     */     //   36: checkcast java/lang/CharSequence
/*     */     //   39: astore_1
/*     */     //   40: iconst_0
/*     */     //   41: istore_2
/*     */     //   42: iconst_0
/*     */     //   43: istore_3
/*     */     //   44: iload_3
/*     */     //   45: aload_1
/*     */     //   46: invokeinterface length : ()I
/*     */     //   51: if_icmpge -> 89
/*     */     //   54: aload_1
/*     */     //   55: iload_3
/*     */     //   56: invokeinterface charAt : (I)C
/*     */     //   61: istore #4
/*     */     //   63: iload #4
/*     */     //   65: istore #5
/*     */     //   67: iconst_0
/*     */     //   68: istore #6
/*     */     //   70: iload #5
/*     */     //   72: invokestatic isLowerCase : (C)Z
/*     */     //   75: nop
/*     */     //   76: ifne -> 83
/*     */     //   79: iconst_0
/*     */     //   80: goto -> 90
/*     */     //   83: iinc #3, 1
/*     */     //   86: goto -> 44
/*     */     //   89: iconst_1
/*     */     //   90: ifeq -> 97
/*     */     //   93: iconst_1
/*     */     //   94: goto -> 98
/*     */     //   97: iconst_0
/*     */     //   98: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #32	-> 6
/*     */     //   #32	-> 23
/*     */     //   #157	-> 42
/*     */     //   #32	-> 70
/*     */     //   #32	-> 75
/*     */     //   #157	-> 76
/*     */     //   #158	-> 89
/*     */     //   #32	-> 90
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   70	6	6	$i$a$-all-TextKt$isCapitalized$1	I
/*     */     //   67	9	5	it	C
/*     */     //   63	20	4	element$iv	C
/*     */     //   42	48	2	$i$f$all	I
/*     */     //   40	50	1	$this$all$iv	Ljava/lang/CharSequence;
/*     */     //   0	99	0	$this$isCapitalized	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   public static final boolean isUppercase(@NotNull String $this$isUppercase) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: checkcast java/lang/CharSequence
/*     */     //   10: invokeinterface length : ()I
/*     */     //   15: ifle -> 22
/*     */     //   18: iconst_1
/*     */     //   19: goto -> 23
/*     */     //   22: iconst_0
/*     */     //   23: ifeq -> 88
/*     */     //   26: aload_0
/*     */     //   27: checkcast java/lang/CharSequence
/*     */     //   30: astore_1
/*     */     //   31: iconst_0
/*     */     //   32: istore_2
/*     */     //   33: iconst_0
/*     */     //   34: istore_3
/*     */     //   35: iload_3
/*     */     //   36: aload_1
/*     */     //   37: invokeinterface length : ()I
/*     */     //   42: if_icmpge -> 80
/*     */     //   45: aload_1
/*     */     //   46: iload_3
/*     */     //   47: invokeinterface charAt : (I)C
/*     */     //   52: istore #4
/*     */     //   54: iload #4
/*     */     //   56: istore #5
/*     */     //   58: iconst_0
/*     */     //   59: istore #6
/*     */     //   61: iload #5
/*     */     //   63: invokestatic isUpperCase : (C)Z
/*     */     //   66: nop
/*     */     //   67: ifne -> 74
/*     */     //   70: iconst_0
/*     */     //   71: goto -> 81
/*     */     //   74: iinc #3, 1
/*     */     //   77: goto -> 35
/*     */     //   80: iconst_1
/*     */     //   81: ifeq -> 88
/*     */     //   84: iconst_1
/*     */     //   85: goto -> 89
/*     */     //   88: iconst_0
/*     */     //   89: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #39	-> 6
/*     */     //   #39	-> 23
/*     */     //   #159	-> 33
/*     */     //   #39	-> 61
/*     */     //   #39	-> 66
/*     */     //   #159	-> 67
/*     */     //   #160	-> 80
/*     */     //   #39	-> 81
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   61	6	6	$i$a$-all-TextKt$isUppercase$1	I
/*     */     //   58	9	5	it	C
/*     */     //   54	20	4	element$iv	C
/*     */     //   33	48	2	$i$f$all	I
/*     */     //   31	50	1	$this$all$iv	Ljava/lang/CharSequence;
/*     */     //   0	90	0	$this$isUppercase	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   public static final boolean isLowercase(@NotNull String $this$isLowercase) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: checkcast java/lang/CharSequence
/*     */     //   10: invokeinterface length : ()I
/*     */     //   15: ifle -> 22
/*     */     //   18: iconst_1
/*     */     //   19: goto -> 23
/*     */     //   22: iconst_0
/*     */     //   23: ifeq -> 88
/*     */     //   26: aload_0
/*     */     //   27: checkcast java/lang/CharSequence
/*     */     //   30: astore_1
/*     */     //   31: iconst_0
/*     */     //   32: istore_2
/*     */     //   33: iconst_0
/*     */     //   34: istore_3
/*     */     //   35: iload_3
/*     */     //   36: aload_1
/*     */     //   37: invokeinterface length : ()I
/*     */     //   42: if_icmpge -> 80
/*     */     //   45: aload_1
/*     */     //   46: iload_3
/*     */     //   47: invokeinterface charAt : (I)C
/*     */     //   52: istore #4
/*     */     //   54: iload #4
/*     */     //   56: istore #5
/*     */     //   58: iconst_0
/*     */     //   59: istore #6
/*     */     //   61: iload #5
/*     */     //   63: invokestatic isLowerCase : (C)Z
/*     */     //   66: nop
/*     */     //   67: ifne -> 74
/*     */     //   70: iconst_0
/*     */     //   71: goto -> 81
/*     */     //   74: iinc #3, 1
/*     */     //   77: goto -> 35
/*     */     //   80: iconst_1
/*     */     //   81: ifeq -> 88
/*     */     //   84: iconst_1
/*     */     //   85: goto -> 89
/*     */     //   88: iconst_0
/*     */     //   89: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #47	-> 6
/*     */     //   #47	-> 23
/*     */     //   #161	-> 33
/*     */     //   #47	-> 61
/*     */     //   #47	-> 66
/*     */     //   #161	-> 67
/*     */     //   #162	-> 80
/*     */     //   #47	-> 81
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   61	6	6	$i$a$-all-TextKt$isLowercase$1	I
/*     */     //   58	9	5	it	C
/*     */     //   54	20	4	element$iv	C
/*     */     //   33	48	2	$i$f$all	I
/*     */     //   31	50	1	$this$all$iv	Ljava/lang/CharSequence;
/*     */     //   0	90	0	$this$isLowercase	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String alignCasingTo(@NotNull String $this$alignCasingTo, @NotNull String other) {
/*     */     Intrinsics.checkNotNullParameter($this$alignCasingTo, "<this>");
/*     */     Intrinsics.checkNotNullParameter(other, "other");
/*     */     if (isLowercase(other)) {
/*     */       Intrinsics.checkNotNullExpressionValue($this$alignCasingTo.toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*     */       return $this$alignCasingTo.toLowerCase(Locale.ROOT);
/*     */     } 
/*     */     if (isUppercase(other)) {
/*     */       Intrinsics.checkNotNullExpressionValue($this$alignCasingTo.toUpperCase(Locale.ROOT), "toUpperCase(...)");
/*     */       return $this$alignCasingTo.toUpperCase(Locale.ROOT);
/*     */     } 
/*     */     if (isCapitalized(other))
/*     */       return capitalize($this$alignCasingTo); 
/*     */     return $this$alignCasingTo;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String normalizeAccents(@NotNull String $this$normalizeAccents) {
/*     */     Intrinsics.checkNotNullParameter($this$normalizeAccents, "<this>");
/*     */     StringBuilder stringBuilder1 = new StringBuilder(), $this$normalizeAccents_u24lambda_u244 = stringBuilder1;
/*     */     int $i$a$-buildString-TextKt$normalizeAccents$1 = 0;
/*     */     String mText = PolyfillJVMKt.normalizeToUnicode($this$normalizeAccents, true, false);
/*     */     byte b;
/*     */     int i;
/*     */     for (b = 0, i = mText.length(); b < i; ) {
/*     */       char char = mText.charAt(b);
/*     */       if (CharsKt.getCategory(char) != CharCategory.NON_SPACING_MARK)
/*     */         $this$normalizeAccents_u24lambda_u244.append(char); 
/*     */       b++;
/*     */     } 
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */   
/*     */   public static final void replace(@NotNull StringBuilder $this$replace, int start, int endExclusive, @NotNull String value) {
/*     */     Intrinsics.checkNotNullParameter($this$replace, "<this>");
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     Intrinsics.checkNotNullExpressionValue($this$replace.toString(), "this.toString()");
/*     */     String text = $this$replace.toString();
/*     */     StringsKt.clear($this$replace);
/*     */     Intrinsics.checkNotNullExpressionValue(text.substring(0, start), "substring(...)");
/*     */     $this$replace.append(text.substring(0, start));
/*     */     $this$replace.append(value);
/*     */     Intrinsics.checkNotNullExpressionValue(text.substring(endExclusive, value.length()), "substring(...)");
/*     */     $this$replace.append(text.substring(endExclusive, value.length()));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final <T> Object text(@NotNull Flow $this$text, @Nullable Function1 transform, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof ai/grazie/utils/TextKt$text$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast ai/grazie/utils/TextKt$text$1
/*     */     //   11: astore #4
/*     */     //   13: aload #4
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #4
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 49
/*     */     //   39: new ai/grazie/utils/TextKt$text$1
/*     */     //   42: dup
/*     */     //   43: aload_2
/*     */     //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   47: astore #4
/*     */     //   49: aload #4
/*     */     //   51: getfield result : Ljava/lang/Object;
/*     */     //   54: astore_3
/*     */     //   55: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   58: astore #5
/*     */     //   60: aload #4
/*     */     //   62: getfield label : I
/*     */     //   65: tableswitch default -> 144, 0 -> 88, 1 -> 122
/*     */     //   88: aload_3
/*     */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   92: aload_0
/*     */     //   93: aconst_null
/*     */     //   94: aload #4
/*     */     //   96: iconst_1
/*     */     //   97: aconst_null
/*     */     //   98: aload #4
/*     */     //   100: aload_1
/*     */     //   101: putfield L$0 : Ljava/lang/Object;
/*     */     //   104: aload #4
/*     */     //   106: iconst_1
/*     */     //   107: putfield label : I
/*     */     //   110: invokestatic toList$default : (Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   113: dup
/*     */     //   114: aload #5
/*     */     //   116: if_acmpne -> 136
/*     */     //   119: aload #5
/*     */     //   121: areturn
/*     */     //   122: aload #4
/*     */     //   124: getfield L$0 : Ljava/lang/Object;
/*     */     //   127: checkcast kotlin/jvm/functions/Function1
/*     */     //   130: astore_1
/*     */     //   131: aload_3
/*     */     //   132: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   135: aload_3
/*     */     //   136: checkcast java/util/List
/*     */     //   139: aload_1
/*     */     //   140: invokestatic text : (Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;
/*     */     //   143: areturn
/*     */     //   144: new java/lang/IllegalStateException
/*     */     //   147: dup
/*     */     //   148: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   150: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   153: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #141	-> 58
/*     */     //   #141	-> 92
/*     */     //   #141	-> 119
/*     */     //   #141	-> 136
/*     */     //   #141	-> 144
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   92	21	0	$this$text	Lkotlinx/coroutines/flow/Flow;
/*     */     //   92	30	1	transform	Lkotlin/jvm/functions/Function1;
/*     */     //   131	13	1	transform	Lkotlin/jvm/functions/Function1;
/*     */     //   0	154	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   49	95	4	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   55	89	3	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final <T> String text(@NotNull List $this$text, @Nullable Function1 transform) {
/*     */     Intrinsics.checkNotNullParameter($this$text, "<this>");
/*     */     return CollectionsKt.joinToString$default($this$text, "", null, null, 0, null, transform, 30, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "Text.kt", l = {141}, i = {0}, s = {"L$0"}, n = {"transform"}, m = "text", c = "ai.grazie.utils.TextKt")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class TextKt$text$1<T> extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     TextKt$text$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return TextKt.text(null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\TextKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */