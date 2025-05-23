/*     */ package com.intellij.ml.llm.matterhorn.ej.core.aiignore;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Regex;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\017\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\b\030\000 \0302\0020\001:\001\030B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\004\b\007\020\bJ\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\005HÆ\003J\t\020\020\032\0020\005HÆ\003J'\020\021\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\005HÆ\001J\023\020\022\032\0020\0052\b\020\023\032\004\030\0010\001HÖ\003J\t\020\024\032\0020\025HÖ\001J\t\020\026\032\0020\027HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\fR\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\r\020\f¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/aiignore/Rule;", "", "regex", "Lkotlin/text/Regex;", "negated", "", "directoryOnly", "<init>", "(Lkotlin/text/Regex;ZZ)V", "getRegex", "()Lkotlin/text/Regex;", "getNegated", "()Z", "getDirectoryOnly", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "ej-core"})
/*     */ final class Rule
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final Regex regex;
/*     */   private final boolean negated;
/*     */   private final boolean directoryOnly;
/*     */   
/*     */   @NotNull
/*     */   public final Regex getRegex() {
/*     */     return this.regex;
/*     */   }
/*     */   
/*     */   public final boolean getNegated() {
/*     */     return this.negated;
/*     */   }
/*     */   
/*     */   public Rule(@NotNull Regex regex, boolean negated, boolean directoryOnly) {
/*  81 */     this.regex = regex;
/*  82 */     this.negated = negated;
/*  83 */     this.directoryOnly = directoryOnly; } public final boolean getDirectoryOnly() { return this.directoryOnly; }
/*     */   
/*     */   @NotNull
/*     */   public final Regex component1() {
/*     */     return this.regex;
/*     */   }
/*     */   public final boolean component2() {
/*     */     return this.negated;
/*     */   }
/*     */   public final boolean component3() {
/*     */     return this.directoryOnly;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Rule copy(@NotNull Regex regex, boolean negated, boolean directoryOnly) {
/*     */     Intrinsics.checkNotNullParameter(regex, "regex");
/*     */     return new Rule(regex, negated, directoryOnly);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Rule(regex=" + this.regex + ", negated=" + this.negated + ", directoryOnly=" + this.directoryOnly + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.regex.hashCode();
/*     */     result = result * 31 + Boolean.hashCode(this.negated);
/*     */     return result * 31 + Boolean.hashCode(this.directoryOnly);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof Rule))
/*     */       return false; 
/*     */     Rule rule = (Rule)other;
/*     */     return !Intrinsics.areEqual(this.regex, rule.regex) ? false : ((this.negated != rule.negated) ? false : (!(this.directoryOnly != rule.directoryOnly)));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\004\030\0010\0052\006\020\006\032\0020\007J\030\020\b\032\0020\t2\006\020\n\032\0020\0072\006\020\013\032\0020\fH\002¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/aiignore/Rule$Companion;", "", "<init>", "()V", "parse", "Lcom/intellij/ml/llm/matterhorn/ej/core/aiignore/Rule;", "rawLine", "", "compileGlob", "Lkotlin/text/Regex;", "input", "dirOnly", "", "ej-core"})
/*     */   @SourceDebugExtension({"SMAP\nIgnoreMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IgnoreMatcher.kt\ncom/intellij/ml/llm/matterhorn/ej/core/aiignore/Rule$Companion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,189:1\n621#2,6:190\n*S KotlinDebug\n*F\n+ 1 IgnoreMatcher.kt\ncom/intellij/ml/llm/matterhorn/ej/core/aiignore/Rule$Companion\n*L\n118#1:190,6\n*E\n"})
/*     */   public static final class Companion { private Companion() {}
/*     */     
/*     */     @Nullable
/*     */     public final Rule parse(@NotNull String rawLine) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'rawLine'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_1
/*     */       //   7: ldc '\\r'
/*     */       //   9: checkcast java/lang/CharSequence
/*     */       //   12: invokestatic removeSuffix : (Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */       //   15: astore_2
/*     */       //   16: aload_2
/*     */       //   17: checkcast java/lang/CharSequence
/*     */       //   20: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */       //   23: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   26: checkcast java/lang/CharSequence
/*     */       //   29: invokeinterface length : ()I
/*     */       //   34: ifne -> 41
/*     */       //   37: iconst_1
/*     */       //   38: goto -> 42
/*     */       //   41: iconst_0
/*     */       //   42: ifeq -> 47
/*     */       //   45: aconst_null
/*     */       //   46: areturn
/*     */       //   47: aload_2
/*     */       //   48: iconst_0
/*     */       //   49: invokevirtual charAt : (I)C
/*     */       //   52: bipush #35
/*     */       //   54: if_icmpne -> 59
/*     */       //   57: aconst_null
/*     */       //   58: areturn
/*     */       //   59: iconst_0
/*     */       //   60: istore_3
/*     */       //   61: aload_2
/*     */       //   62: astore #4
/*     */       //   64: aload_2
/*     */       //   65: ldc '\#'
/*     */       //   67: iconst_0
/*     */       //   68: iconst_2
/*     */       //   69: aconst_null
/*     */       //   70: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */       //   73: ifne -> 88
/*     */       //   76: aload_2
/*     */       //   77: ldc '\!'
/*     */       //   79: iconst_0
/*     */       //   80: iconst_2
/*     */       //   81: aconst_null
/*     */       //   82: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */       //   85: ifeq -> 98
/*     */       //   88: aload_2
/*     */       //   89: iconst_1
/*     */       //   90: invokestatic drop : (Ljava/lang/String;I)Ljava/lang/String;
/*     */       //   93: astore #4
/*     */       //   95: goto -> 122
/*     */       //   98: aload_2
/*     */       //   99: checkcast java/lang/CharSequence
/*     */       //   102: bipush #33
/*     */       //   104: iconst_0
/*     */       //   105: iconst_2
/*     */       //   106: aconst_null
/*     */       //   107: invokestatic startsWith$default : (Ljava/lang/CharSequence;CZILjava/lang/Object;)Z
/*     */       //   110: ifeq -> 122
/*     */       //   113: iconst_1
/*     */       //   114: istore_3
/*     */       //   115: aload_2
/*     */       //   116: iconst_1
/*     */       //   117: invokestatic drop : (Ljava/lang/String;I)Ljava/lang/String;
/*     */       //   120: astore #4
/*     */       //   122: new java/lang/StringBuilder
/*     */       //   125: dup
/*     */       //   126: invokespecial <init> : ()V
/*     */       //   129: astore #5
/*     */       //   131: iconst_0
/*     */       //   132: istore #6
/*     */       //   134: aload #4
/*     */       //   136: astore #7
/*     */       //   138: iconst_0
/*     */       //   139: istore #8
/*     */       //   141: aload #7
/*     */       //   143: invokevirtual length : ()I
/*     */       //   146: istore #9
/*     */       //   148: iload #8
/*     */       //   150: iload #9
/*     */       //   152: if_icmpge -> 199
/*     */       //   155: aload #7
/*     */       //   157: iload #8
/*     */       //   159: invokevirtual charAt : (I)C
/*     */       //   162: istore #10
/*     */       //   164: iload #6
/*     */       //   166: ifne -> 182
/*     */       //   169: iload #10
/*     */       //   171: bipush #92
/*     */       //   173: if_icmpne -> 182
/*     */       //   176: iconst_1
/*     */       //   177: istore #6
/*     */       //   179: goto -> 193
/*     */       //   182: aload #5
/*     */       //   184: iload #10
/*     */       //   186: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */       //   189: pop
/*     */       //   190: iconst_0
/*     */       //   191: istore #6
/*     */       //   193: iinc #8, 1
/*     */       //   196: goto -> 148
/*     */       //   199: aload #5
/*     */       //   201: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   204: dup
/*     */       //   205: ldc 'toString(...)'
/*     */       //   207: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   210: astore #7
/*     */       //   212: iconst_0
/*     */       //   213: istore #8
/*     */       //   215: aload #7
/*     */       //   217: checkcast java/lang/CharSequence
/*     */       //   220: bipush #47
/*     */       //   222: iconst_0
/*     */       //   223: iconst_2
/*     */       //   224: aconst_null
/*     */       //   225: invokestatic endsWith$default : (Ljava/lang/CharSequence;CZILjava/lang/Object;)Z
/*     */       //   228: ifeq -> 338
/*     */       //   231: aload #7
/*     */       //   233: astore #10
/*     */       //   235: iconst_0
/*     */       //   236: istore #11
/*     */       //   238: aload #10
/*     */       //   240: checkcast java/lang/CharSequence
/*     */       //   243: invokestatic getLastIndex : (Ljava/lang/CharSequence;)I
/*     */       //   246: istore #12
/*     */       //   248: iconst_m1
/*     */       //   249: iload #12
/*     */       //   251: if_icmpge -> 313
/*     */       //   254: aload #10
/*     */       //   256: iload #12
/*     */       //   258: invokevirtual charAt : (I)C
/*     */       //   261: istore #13
/*     */       //   263: iconst_0
/*     */       //   264: istore #14
/*     */       //   266: iload #13
/*     */       //   268: bipush #92
/*     */       //   270: if_icmpne -> 277
/*     */       //   273: iconst_1
/*     */       //   274: goto -> 278
/*     */       //   277: iconst_0
/*     */       //   278: ifne -> 307
/*     */       //   281: aload #10
/*     */       //   283: astore #13
/*     */       //   285: iload #12
/*     */       //   287: iconst_1
/*     */       //   288: iadd
/*     */       //   289: istore #14
/*     */       //   291: aload #13
/*     */       //   293: iload #14
/*     */       //   295: invokevirtual substring : (I)Ljava/lang/String;
/*     */       //   298: dup
/*     */       //   299: ldc 'substring(...)'
/*     */       //   301: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   304: goto -> 315
/*     */       //   307: iinc #12, -1
/*     */       //   310: goto -> 248
/*     */       //   313: aload #10
/*     */       //   315: invokevirtual length : ()I
/*     */       //   318: istore #9
/*     */       //   320: iload #9
/*     */       //   322: iconst_2
/*     */       //   323: irem
/*     */       //   324: ifne -> 338
/*     */       //   327: iconst_1
/*     */       //   328: istore #8
/*     */       //   330: aload #7
/*     */       //   332: iconst_1
/*     */       //   333: invokestatic dropLast : (Ljava/lang/String;I)Ljava/lang/String;
/*     */       //   336: astore #7
/*     */       //   338: aload_0
/*     */       //   339: aload #7
/*     */       //   341: iload #8
/*     */       //   343: invokespecial compileGlob : (Ljava/lang/String;Z)Lkotlin/text/Regex;
/*     */       //   346: astore #9
/*     */       //   348: new com/intellij/ml/llm/matterhorn/ej/core/aiignore/Rule
/*     */       //   351: dup
/*     */       //   352: aload #9
/*     */       //   354: iload_3
/*     */       //   355: iload #8
/*     */       //   357: invokespecial <init> : (Lkotlin/text/Regex;ZZ)V
/*     */       //   360: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #88	-> 6
/*     */       //   #89	-> 16
/*     */       //   #89	-> 26
/*     */       //   #89	-> 42
/*     */       //   #92	-> 47
/*     */       //   #94	-> 59
/*     */       //   #95	-> 61
/*     */       //   #96	-> 64
/*     */       //   #97	-> 88
/*     */       //   #98	-> 98
/*     */       //   #99	-> 113
/*     */       //   #100	-> 115
/*     */       //   #104	-> 122
/*     */       //   #105	-> 131
/*     */       //   #106	-> 134
/*     */       //   #107	-> 164
/*     */       //   #108	-> 176
/*     */       //   #110	-> 182
/*     */       //   #106	-> 193
/*     */       //   #113	-> 199
/*     */       //   #115	-> 212
/*     */       //   #116	-> 215
/*     */       //   #118	-> 231
/*     */       //   #190	-> 238
/*     */       //   #191	-> 254
/*     */       //   #118	-> 266
/*     */       //   #191	-> 278
/*     */       //   #192	-> 281
/*     */       //   #192	-> 304
/*     */       //   #190	-> 307
/*     */       //   #195	-> 313
/*     */       //   #118	-> 315
/*     */       //   #119	-> 320
/*     */       //   #120	-> 327
/*     */       //   #121	-> 330
/*     */       //   #125	-> 338
/*     */       //   #127	-> 348
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   164	29	10	c	C
/*     */       //   266	12	14	$i$a$-takeLastWhile-Rule$Companion$parse$backslashes$1	I
/*     */       //   263	15	13	it	C
/*     */       //   248	65	12	index$iv	I
/*     */       //   238	77	11	$i$f$takeLastWhile	I
/*     */       //   235	80	10	$this$takeLastWhile$iv	Ljava/lang/String;
/*     */       //   320	18	9	backslashes	I
/*     */       //   16	345	2	raw	Ljava/lang/String;
/*     */       //   61	300	3	negated	Z
/*     */       //   64	297	4	line	Ljava/lang/String;
/*     */       //   131	230	5	sb	Ljava/lang/StringBuilder;
/*     */       //   134	227	6	esc	Z
/*     */       //   212	149	7	pattern	Ljava/lang/String;
/*     */       //   215	146	8	dirOnly	Z
/*     */       //   348	13	9	regex	Lkotlin/text/Regex;
/*     */       //   0	361	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/aiignore/Rule$Companion;
/*     */       //   0	361	1	rawLine	Ljava/lang/String;
/*     */     }
/*     */     
/*     */     private final Regex compileGlob(String input, boolean dirOnly) {
/* 132 */       boolean leadingSlash = StringsKt.startsWith$default(input, '/', false, 2, null);
/* 133 */       boolean anchored = (leadingSlash || StringsKt.contains$default(input, '/', false, 2, null));
/*     */       
/* 135 */       Intrinsics.checkNotNullExpressionValue(input.substring(1), "substring(...)"); String pat = leadingSlash ? input.substring(1) : input;
/* 136 */       if (!anchored) pat = "**/" + pat;
/*     */       
/* 138 */       StringBuilder rx = new StringBuilder("^");
/* 139 */       if (!anchored) rx.append("(?:.*/)?");
/*     */       
/* 141 */       int i = 0;
/* 142 */       while (i < pat.length()) {
/* 143 */         char c = pat.charAt(i); switch (c) {
/*     */           case '*':
/* 145 */             if (i + 1 < pat.length() && pat.charAt(i + 1) == '*') {
/* 146 */               i++;
/*     */               
/* 148 */               i++;
/*     */               boolean slash = (i + 1 < pat.length() && pat.charAt(i + 1) == '/');
/*     */             } 
/*     */ 
/*     */           
/*     */           case '?':
/*     */           
/*     */ 
/*     */           
/*     */           case '[':
/* 158 */             rx.append('['); i++;
/* 159 */             if (i < pat.length() && pat.charAt(i) == '!') {
/* 160 */               rx.append('^'); i++;
/*     */             } 
/* 162 */             if (i < pat.length() && pat.charAt(i) == ']') {
/* 163 */               rx.append(']'); i++;
/*     */             } 
/* 165 */             while (i < pat.length() && pat.charAt(i) != ']') {
/* 166 */               char ch = pat.charAt(i);
/* 167 */               if (StringsKt.indexOf$default("\\^-", ch, 0, false, 6, null) >= 0) rx.append('\\'); 
/* 168 */               rx.append(ch); i++;
/*     */             } 
/*     */           
/*     */           case '/':
/*     */           
/*     */           
/*     */           default:
/* 175 */             if (StringsKt.indexOf$default("\\.[]{}()+-^$|", c, 0, false, 6, null) >= 0) rx.append('\\');  break;
/* 176 */         }  rx.append(c);
/*     */ 
/*     */         
/* 179 */         i++;
/*     */       } 
/*     */ 
/*     */       
/* 183 */       if (dirOnly) rx.append("(?:/.*)?"); 
/* 184 */       rx.append('$');
/*     */       
/* 186 */       Intrinsics.checkNotNullExpressionValue(rx.toString(), "toString(...)"); String str1 = rx.toString(); return new Regex(str1);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\aiignore\Rule.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */