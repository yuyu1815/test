/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptRenderingInfo;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.annotations.VisibleForTesting;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J1\020\004\032\0020\0052\b\020\006\032\004\030\0010\0072\b\020\b\032\004\030\0010\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\001¢\006\002\b\016J\030\020\017\032\0020\0052\006\020\006\032\0020\0072\006\020\n\032\0020\013H\002¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelImpl$Companion;", "", "<init>", "()V", "createCommandAndRightPromptText", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;", "command", "", "prompt", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;", "commandAttributes", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;", "terminalWidth", "", "createCommandAndRightPromptText$ej_core", "createCommandText", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalOutputModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalOutputModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelImpl$Companion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,312:1\n170#2,6:313\n1#3:319\n*S KotlinDebug\n*F\n+ 1 TerminalOutputModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelImpl$Companion\n*L\n275#1:313,6\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @VisibleForTesting
/*     */   @NotNull
/*     */   public final TextWithHighlightings createCommandAndRightPromptText$ej_core(@Nullable String command, @Nullable TerminalPromptRenderingInfo prompt, @NotNull TextAttributesProvider commandAttributes, int terminalWidth) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: ldc 'commandAttributes'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: dup
/*     */     //   8: ifnonnull -> 14
/*     */     //   11: pop
/*     */     //   12: ldc ''
/*     */     //   14: astore #5
/*     */     //   16: aload_2
/*     */     //   17: dup
/*     */     //   18: ifnull -> 28
/*     */     //   21: invokevirtual getRightText : ()Ljava/lang/String;
/*     */     //   24: dup
/*     */     //   25: ifnonnull -> 31
/*     */     //   28: pop
/*     */     //   29: ldc ''
/*     */     //   31: astore #6
/*     */     //   33: aload #6
/*     */     //   35: checkcast java/lang/CharSequence
/*     */     //   38: invokeinterface length : ()I
/*     */     //   43: ifne -> 50
/*     */     //   46: iconst_1
/*     */     //   47: goto -> 51
/*     */     //   50: iconst_0
/*     */     //   51: ifeq -> 62
/*     */     //   54: aload_0
/*     */     //   55: aload #5
/*     */     //   57: aload_3
/*     */     //   58: invokespecial createCommandText : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;
/*     */     //   61: areturn
/*     */     //   62: aload_2
/*     */     //   63: dup
/*     */     //   64: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   67: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   70: astore #7
/*     */     //   72: aload #7
/*     */     //   74: invokevirtual length : ()I
/*     */     //   77: aload #7
/*     */     //   79: checkcast java/lang/CharSequence
/*     */     //   82: astore #9
/*     */     //   84: istore #17
/*     */     //   86: iconst_0
/*     */     //   87: istore #10
/*     */     //   89: aload #9
/*     */     //   91: invokeinterface length : ()I
/*     */     //   96: iconst_m1
/*     */     //   97: iadd
/*     */     //   98: istore #11
/*     */     //   100: iconst_0
/*     */     //   101: iload #11
/*     */     //   103: if_icmpgt -> 153
/*     */     //   106: iload #11
/*     */     //   108: istore #12
/*     */     //   110: iinc #11, -1
/*     */     //   113: aload #9
/*     */     //   115: iload #12
/*     */     //   117: invokeinterface charAt : (I)C
/*     */     //   122: istore #13
/*     */     //   124: iconst_0
/*     */     //   125: istore #14
/*     */     //   127: iload #13
/*     */     //   129: bipush #10
/*     */     //   131: if_icmpne -> 138
/*     */     //   134: iconst_1
/*     */     //   135: goto -> 139
/*     */     //   138: iconst_0
/*     */     //   139: ifeq -> 147
/*     */     //   142: iload #12
/*     */     //   144: goto -> 154
/*     */     //   147: iconst_0
/*     */     //   148: iload #11
/*     */     //   150: if_icmple -> 106
/*     */     //   153: iconst_m1
/*     */     //   154: istore #18
/*     */     //   156: iload #17
/*     */     //   158: iload #18
/*     */     //   160: iconst_1
/*     */     //   161: iadd
/*     */     //   162: isub
/*     */     //   163: istore #8
/*     */     //   165: aload #5
/*     */     //   167: checkcast java/lang/CharSequence
/*     */     //   170: bipush #10
/*     */     //   172: iconst_0
/*     */     //   173: iconst_0
/*     */     //   174: bipush #6
/*     */     //   176: aconst_null
/*     */     //   177: invokestatic indexOf$default : (Ljava/lang/CharSequence;CIZILjava/lang/Object;)I
/*     */     //   180: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   183: astore #11
/*     */     //   185: aload #11
/*     */     //   187: checkcast java/lang/Number
/*     */     //   190: invokevirtual intValue : ()I
/*     */     //   193: istore #12
/*     */     //   195: iconst_0
/*     */     //   196: istore #13
/*     */     //   198: iload #12
/*     */     //   200: iconst_m1
/*     */     //   201: if_icmpeq -> 208
/*     */     //   204: iconst_1
/*     */     //   205: goto -> 209
/*     */     //   208: iconst_0
/*     */     //   209: ifeq -> 217
/*     */     //   212: aload #11
/*     */     //   214: goto -> 218
/*     */     //   217: aconst_null
/*     */     //   218: dup
/*     */     //   219: ifnull -> 228
/*     */     //   222: invokevirtual intValue : ()I
/*     */     //   225: goto -> 234
/*     */     //   228: pop
/*     */     //   229: aload #5
/*     */     //   231: invokevirtual length : ()I
/*     */     //   234: istore #9
/*     */     //   236: iload #8
/*     */     //   238: iload #9
/*     */     //   240: iadd
/*     */     //   241: aload #6
/*     */     //   243: invokevirtual length : ()I
/*     */     //   246: iadd
/*     */     //   247: iload #4
/*     */     //   249: if_icmpge -> 478
/*     */     //   252: iload #4
/*     */     //   254: iload #8
/*     */     //   256: isub
/*     */     //   257: iload #9
/*     */     //   259: isub
/*     */     //   260: aload #6
/*     */     //   262: invokevirtual length : ()I
/*     */     //   265: isub
/*     */     //   266: istore #10
/*     */     //   268: invokestatic createListBuilder : ()Ljava/util/List;
/*     */     //   271: astore #12
/*     */     //   273: aload #12
/*     */     //   275: astore #13
/*     */     //   277: iconst_0
/*     */     //   278: istore #14
/*     */     //   280: iload #9
/*     */     //   282: ifle -> 315
/*     */     //   285: aload #13
/*     */     //   287: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithAttributes
/*     */     //   290: dup
/*     */     //   291: aload #5
/*     */     //   293: iconst_0
/*     */     //   294: iload #9
/*     */     //   296: invokevirtual substring : (II)Ljava/lang/String;
/*     */     //   299: dup
/*     */     //   300: ldc 'substring(...)'
/*     */     //   302: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   305: aload_3
/*     */     //   306: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;)V
/*     */     //   309: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   314: pop
/*     */     //   315: aload #13
/*     */     //   317: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithAttributes
/*     */     //   320: dup
/*     */     //   321: ldc ' '
/*     */     //   323: checkcast java/lang/CharSequence
/*     */     //   326: iload #10
/*     */     //   328: invokestatic repeat : (Ljava/lang/CharSequence;I)Ljava/lang/String;
/*     */     //   331: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/EmptyTextAttributesProvider.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/EmptyTextAttributesProvider;
/*     */     //   334: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider
/*     */     //   337: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;)V
/*     */     //   340: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   345: pop
/*     */     //   346: aload_2
/*     */     //   347: invokevirtual getRightHighlightings : ()Ljava/util/List;
/*     */     //   350: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   355: astore #15
/*     */     //   357: aload #15
/*     */     //   359: invokeinterface hasNext : ()Z
/*     */     //   364: ifeq -> 423
/*     */     //   367: aload #15
/*     */     //   369: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   374: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo
/*     */     //   377: astore #16
/*     */     //   379: aload #13
/*     */     //   381: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithAttributes
/*     */     //   384: dup
/*     */     //   385: aload #6
/*     */     //   387: aload #16
/*     */     //   389: invokevirtual getStartOffset : ()I
/*     */     //   392: aload #16
/*     */     //   394: invokevirtual getEndOffset : ()I
/*     */     //   397: invokevirtual substring : (II)Ljava/lang/String;
/*     */     //   400: dup
/*     */     //   401: ldc 'substring(...)'
/*     */     //   403: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   406: aload #16
/*     */     //   408: invokevirtual getTextAttributesProvider : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;
/*     */     //   411: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;)V
/*     */     //   414: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   419: pop
/*     */     //   420: goto -> 357
/*     */     //   423: iload #9
/*     */     //   425: aload #5
/*     */     //   427: invokevirtual length : ()I
/*     */     //   430: if_icmpge -> 462
/*     */     //   433: aload #13
/*     */     //   435: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithAttributes
/*     */     //   438: dup
/*     */     //   439: aload #5
/*     */     //   441: iload #9
/*     */     //   443: invokevirtual substring : (I)Ljava/lang/String;
/*     */     //   446: dup
/*     */     //   447: ldc 'substring(...)'
/*     */     //   449: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   452: aload_3
/*     */     //   453: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;)V
/*     */     //   456: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   461: pop
/*     */     //   462: nop
/*     */     //   463: aload #12
/*     */     //   465: invokestatic build : (Ljava/util/List;)Ljava/util/List;
/*     */     //   468: astore #11
/*     */     //   470: aload #11
/*     */     //   472: invokestatic toTextWithHighlightings : (Ljava/util/List;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;
/*     */     //   475: goto -> 485
/*     */     //   478: aload_0
/*     */     //   479: aload #5
/*     */     //   481: aload_3
/*     */     //   482: invokespecial createCommandText : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;
/*     */     //   485: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #268	-> 6
/*     */     //   #269	-> 16
/*     */     //   #270	-> 33
/*     */     //   #270	-> 51
/*     */     //   #272	-> 54
/*     */     //   #274	-> 62
/*     */     //   #275	-> 72
/*     */     //   #313	-> 89
/*     */     //   #314	-> 113
/*     */     //   #275	-> 127
/*     */     //   #314	-> 139
/*     */     //   #315	-> 142
/*     */     //   #313	-> 147
/*     */     //   #318	-> 153
/*     */     //   #275	-> 160
/*     */     //   #276	-> 165
/*     */     //   #319	-> 195
/*     */     //   #276	-> 198
/*     */     //   #276	-> 209
/*     */     //   #276	-> 218
/*     */     //   #278	-> 236
/*     */     //   #280	-> 252
/*     */     //   #281	-> 268
/*     */     //   #282	-> 280
/*     */     //   #283	-> 285
/*     */     //   #283	-> 305
/*     */     //   #285	-> 315
/*     */     //   #286	-> 346
/*     */     //   #287	-> 379
/*     */     //   #287	-> 406
/*     */     //   #289	-> 423
/*     */     //   #290	-> 433
/*     */     //   #290	-> 452
/*     */     //   #292	-> 462
/*     */     //   #281	-> 463
/*     */     //   #281	-> 468
/*     */     //   #293	-> 470
/*     */     //   #297	-> 478
/*     */     //   #278	-> 485
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   127	12	14	$i$a$-indexOfLast-TerminalOutputModelImpl$Companion$createCommandAndRightPromptText$promptLastLineLength$1	I
/*     */     //   124	15	13	it	C
/*     */     //   110	43	12	index$iv	I
/*     */     //   89	65	10	$i$f$indexOfLast	I
/*     */     //   86	68	9	$this$indexOfLast$iv	Ljava/lang/CharSequence;
/*     */     //   198	11	13	$i$a$-takeIf-TerminalOutputModelImpl$Companion$createCommandAndRightPromptText$commandFirstLineLength$1	I
/*     */     //   195	14	12	it	I
/*     */     //   379	41	16	highlighting	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo;
/*     */     //   280	183	14	$i$a$-buildList-TerminalOutputModelImpl$Companion$createCommandAndRightPromptText$components$1	I
/*     */     //   277	186	13	$this$createCommandAndRightPromptText_u24lambda_u242	Ljava/util/List;
/*     */     //   268	207	10	spacesCount	I
/*     */     //   470	5	11	components	Ljava/util/List;
/*     */     //   16	470	5	commandText	Ljava/lang/String;
/*     */     //   33	453	6	rightPromptText	Ljava/lang/String;
/*     */     //   72	414	7	promptText	Ljava/lang/String;
/*     */     //   165	321	8	promptLastLineLength	I
/*     */     //   236	250	9	commandFirstLineLength	I
/*     */     //   0	486	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelImpl$Companion;
/*     */     //   0	486	1	command	Ljava/lang/String;
/*     */     //   0	486	2	prompt	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;
/*     */     //   0	486	3	commandAttributes	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;
/*     */     //   0	486	4	terminalWidth	I
/*     */   }
/*     */   
/*     */   private final TextWithHighlightings createCommandText(String command, TextAttributesProvider commandAttributes) {
/* 302 */     List<HighlightingInfo> highlightings = ((((CharSequence)command).length() > 0)) ? CollectionsKt.listOf(new HighlightingInfo(0, command.length(), commandAttributes)) : CollectionsKt.emptyList();
/* 303 */     return new TextWithHighlightings(command, highlightings);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputModelImpl$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */