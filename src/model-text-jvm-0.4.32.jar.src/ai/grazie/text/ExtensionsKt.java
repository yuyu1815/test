/*    */ package ai.grazie.text;@Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\002\020\r\n\002\b\003\n\002\020\b\n\002\b\003\n\002\020\016\n\002\b\006\032\024\020\t\032\004\030\0010\001*\0020\n2\006\020\013\032\0020\n\032\032\020\f\032\0020\n*\0020\n2\006\020\000\032\0020\0012\006\020\r\032\0020\n\032\022\020\013\032\0020\n*\0020\n2\006\020\000\032\0020\001\032\022\020\016\032\0020\001*\0020\0012\006\020\017\032\0020\006\"\025\020\000\032\0020\001*\0020\0028F¢\006\006\032\004\b\003\020\004\"\025\020\005\032\0020\006*\0020\0018F¢\006\006\032\004\b\007\020\b¨\006\020"}, d2 = {"range", "Lai/grazie/text/TextRange;", "", "getRange", "(Ljava/lang/CharSequence;)Lai/grazie/text/TextRange;", "startExclusive", "", "getStartExclusive", "(Lai/grazie/text/TextRange;)I", "find", "", "substring", "replace", "value", "withOffset", "offset", "model-text"})
/*    */ @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nai/grazie/text/ExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
/*    */ public final class ExtensionsKt { @NotNull
/*  4 */   public static final TextRange getRange(@NotNull CharSequence $this$range) { Intrinsics.checkNotNullParameter($this$range, "<this>"); return new TextRange(0, $this$range.length()); }
/*    */   
/*    */   public static final int getStartExclusive(@NotNull TextRange $this$startExclusive) {
/*  7 */     Intrinsics.checkNotNullParameter($this$startExclusive, "<this>"); return $this$startExclusive.getStart() - 1;
/*    */   }
/*    */   @Nullable
/*    */   public static final TextRange find(@NotNull String $this$find, @NotNull String substring) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc '<this>'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc 'substring'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_0
/*    */     //   13: checkcast java/lang/CharSequence
/*    */     //   16: aload_1
/*    */     //   17: iconst_0
/*    */     //   18: iconst_0
/*    */     //   19: bipush #6
/*    */     //   21: aconst_null
/*    */     //   22: invokestatic indexOf$default : (Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I
/*    */     //   25: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   28: astore #4
/*    */     //   30: aload #4
/*    */     //   32: checkcast java/lang/Number
/*    */     //   35: invokevirtual intValue : ()I
/*    */     //   38: istore #5
/*    */     //   40: iconst_0
/*    */     //   41: istore #6
/*    */     //   43: iload #5
/*    */     //   45: iconst_m1
/*    */     //   46: if_icmpeq -> 53
/*    */     //   49: iconst_1
/*    */     //   50: goto -> 54
/*    */     //   53: iconst_0
/*    */     //   54: ifeq -> 62
/*    */     //   57: aload #4
/*    */     //   59: goto -> 63
/*    */     //   62: aconst_null
/*    */     //   63: dup
/*    */     //   64: ifnull -> 73
/*    */     //   67: invokevirtual intValue : ()I
/*    */     //   70: goto -> 76
/*    */     //   73: pop
/*    */     //   74: aconst_null
/*    */     //   75: areturn
/*    */     //   76: istore_2
/*    */     //   77: iload_2
/*    */     //   78: aload_1
/*    */     //   79: invokevirtual length : ()I
/*    */     //   82: iadd
/*    */     //   83: istore_3
/*    */     //   84: new ai/grazie/text/TextRange
/*    */     //   87: dup
/*    */     //   88: iload_2
/*    */     //   89: iload_3
/*    */     //   90: invokespecial <init> : (II)V
/*    */     //   93: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #10	-> 12
/*    */     //   #30	-> 40
/*    */     //   #10	-> 43
/*    */     //   #10	-> 54
/*    */     //   #10	-> 63
/*    */     //   #11	-> 77
/*    */     //   #12	-> 84
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   43	11	6	$i$a$-takeIf-ExtensionsKt$find$start$1	I
/*    */     //   40	14	5	it	I
/*    */     //   77	17	2	start	I
/*    */     //   84	10	3	end	I
/*    */     //   0	94	0	$this$find	Ljava/lang/String;
/*    */     //   0	94	1	substring	Ljava/lang/String;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final String replace(@NotNull String $this$replace, @NotNull TextRange range, @NotNull String value) {
/* 16 */     Intrinsics.checkNotNullParameter($this$replace, "<this>"); Intrinsics.checkNotNullParameter(range, "range"); Intrinsics.checkNotNullParameter(value, "value"); Intrinsics.checkNotNullExpressionValue($this$replace.substring(0, range.getStart()), "substring(...)"); String start = $this$replace.substring(0, range.getStart());
/* 17 */     String middle = value;
/*    */     
/* 19 */     Intrinsics.checkNotNullExpressionValue($this$replace.substring(range.getEndExclusive(), $this$replace.length()), "substring(...)"); String end = (range.getEndExclusive() != $this$replace.length()) ? $this$replace.substring(range.getEndExclusive(), $this$replace.length()) : 
/* 20 */       "";
/* 21 */     return start + start + middle;
/*    */   }
/*    */   @NotNull
/*    */   public static final TextRange withOffset(@NotNull TextRange $this$withOffset, int offset) {
/* 25 */     Intrinsics.checkNotNullParameter($this$withOffset, "<this>"); return new TextRange($this$withOffset.getStart() + offset, $this$withOffset.getEndExclusive() + offset);
/*    */   } @NotNull
/*    */   public static final String substring(@NotNull String $this$substring, @NotNull TextRange range) {
/* 28 */     Intrinsics.checkNotNullParameter($this$substring, "<this>"); Intrinsics.checkNotNullParameter(range, "range"); return range.substring($this$substring);
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-text-jvm-0.4.32.jar!\ai\grazie\text\ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */