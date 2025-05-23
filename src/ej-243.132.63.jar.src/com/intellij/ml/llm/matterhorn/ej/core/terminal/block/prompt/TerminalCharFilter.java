/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*    */ 
/*    */ import com.intellij.codeInsight.completion.PrefixMatcher;
/*    */ import com.intellij.codeInsight.lookup.CharFilter;
/*    */ import com.intellij.codeInsight.lookup.Lookup;
/*    */ import com.intellij.codeInsight.lookup.LookupElement;
/*    */ import com.intellij.codeInsight.lookup.impl.LookupImpl;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\f\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\000\b\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\"\020\004\032\004\030\0010\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026J \020\f\032\0020\r2\006\020\n\032\0020\0132\006\020\016\032\0020\0172\006\020\006\032\0020\007H\002J\020\020\020\032\0020\r2\006\020\021\032\0020\022H\002¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalCharFilter;", "Lcom/intellij/codeInsight/lookup/CharFilter;", "<init>", "()V", "acceptChar", "Lcom/intellij/codeInsight/lookup/CharFilter$Result;", "c", "", "prefixLength", "", "lookup", "Lcom/intellij/codeInsight/lookup/Lookup;", "matchesAfterAppendingChar", "", "item", "Lcom/intellij/codeInsight/lookup/LookupElement;", "isSingleCharParameter", "value", "", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nTerminalCharFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalCharFilter.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalCharFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n774#2:47\n865#2,2:48\n1734#2,3:50\n1755#2,3:53\n*S KotlinDebug\n*F\n+ 1 TerminalCharFilter.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalCharFilter\n*L\n24#1:47\n24#1:48,2\n26#1:50,3\n27#1:53,3\n*E\n"})
/*    */ public final class TerminalCharFilter
/*    */   extends CharFilter
/*    */ {
/*    */   @Nullable
/*    */   public CharFilter.Result acceptChar(char c, int prefixLength, @NotNull Lookup lookup) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: ldc 'lookup'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter$Companion;
/*    */     //   9: aload_3
/*    */     //   10: invokevirtual isTerminalCommandHistory : (Lcom/intellij/codeInsight/lookup/Lookup;)Z
/*    */     //   13: ifeq -> 22
/*    */     //   16: getstatic com/intellij/codeInsight/lookup/CharFilter$Result.HIDE_LOOKUP : Lcom/intellij/codeInsight/lookup/CharFilter$Result;
/*    */     //   19: goto -> 442
/*    */     //   22: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchPresenter.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchPresenter$Companion;
/*    */     //   25: aload_3
/*    */     //   26: invokevirtual isTerminalCommandSearch : (Lcom/intellij/codeInsight/lookup/Lookup;)Z
/*    */     //   29: ifeq -> 38
/*    */     //   32: getstatic com/intellij/codeInsight/lookup/CharFilter$Result.ADD_TO_PREFIX : Lcom/intellij/codeInsight/lookup/CharFilter$Result;
/*    */     //   35: goto -> 442
/*    */     //   38: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/util/TerminalDataContextUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/util/TerminalDataContextUtils;
/*    */     //   41: aload_3
/*    */     //   42: invokeinterface getEditor : ()Lcom/intellij/openapi/editor/Editor;
/*    */     //   47: dup
/*    */     //   48: ldc 'getEditor(...)'
/*    */     //   50: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   53: invokevirtual isPromptEditor : (Lcom/intellij/openapi/editor/Editor;)Z
/*    */     //   56: ifeq -> 441
/*    */     //   59: aload_3
/*    */     //   60: invokeinterface getItems : ()Ljava/util/List;
/*    */     //   65: dup
/*    */     //   66: ldc 'getItems(...)'
/*    */     //   68: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   71: checkcast java/lang/Iterable
/*    */     //   74: astore #5
/*    */     //   76: iconst_0
/*    */     //   77: istore #6
/*    */     //   79: aload #5
/*    */     //   81: astore #7
/*    */     //   83: new java/util/ArrayList
/*    */     //   86: dup
/*    */     //   87: invokespecial <init> : ()V
/*    */     //   90: checkcast java/util/Collection
/*    */     //   93: astore #8
/*    */     //   95: iconst_0
/*    */     //   96: istore #9
/*    */     //   98: aload #7
/*    */     //   100: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   105: astore #10
/*    */     //   107: aload #10
/*    */     //   109: invokeinterface hasNext : ()Z
/*    */     //   114: ifeq -> 165
/*    */     //   117: aload #10
/*    */     //   119: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   124: astore #11
/*    */     //   126: aload #11
/*    */     //   128: checkcast com/intellij/codeInsight/lookup/LookupElement
/*    */     //   131: astore #12
/*    */     //   133: iconst_0
/*    */     //   134: istore #13
/*    */     //   136: aload_0
/*    */     //   137: aload_3
/*    */     //   138: aload #12
/*    */     //   140: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   143: aload #12
/*    */     //   145: iload_1
/*    */     //   146: invokespecial matchesAfterAppendingChar : (Lcom/intellij/codeInsight/lookup/Lookup;Lcom/intellij/codeInsight/lookup/LookupElement;C)Z
/*    */     //   149: ifeq -> 107
/*    */     //   152: aload #8
/*    */     //   154: aload #11
/*    */     //   156: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   161: pop
/*    */     //   162: goto -> 107
/*    */     //   165: aload #8
/*    */     //   167: checkcast java/util/List
/*    */     //   170: nop
/*    */     //   171: astore #4
/*    */     //   173: aload #4
/*    */     //   175: checkcast java/util/Collection
/*    */     //   178: invokeinterface isEmpty : ()Z
/*    */     //   183: ifne -> 190
/*    */     //   186: iconst_1
/*    */     //   187: goto -> 191
/*    */     //   190: iconst_0
/*    */     //   191: ifeq -> 435
/*    */     //   194: aload #4
/*    */     //   196: checkcast java/lang/Iterable
/*    */     //   199: astore #5
/*    */     //   201: iconst_0
/*    */     //   202: istore #6
/*    */     //   204: aload #5
/*    */     //   206: instanceof java/util/Collection
/*    */     //   209: ifeq -> 229
/*    */     //   212: aload #5
/*    */     //   214: checkcast java/util/Collection
/*    */     //   217: invokeinterface isEmpty : ()Z
/*    */     //   222: ifeq -> 229
/*    */     //   225: iconst_1
/*    */     //   226: goto -> 290
/*    */     //   229: aload #5
/*    */     //   231: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   236: astore #7
/*    */     //   238: aload #7
/*    */     //   240: invokeinterface hasNext : ()Z
/*    */     //   245: ifeq -> 289
/*    */     //   248: aload #7
/*    */     //   250: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   255: astore #8
/*    */     //   257: aload #8
/*    */     //   259: checkcast com/intellij/codeInsight/lookup/LookupElement
/*    */     //   262: astore #9
/*    */     //   264: iconst_0
/*    */     //   265: istore #10
/*    */     //   267: aload_0
/*    */     //   268: aload #9
/*    */     //   270: invokevirtual getLookupString : ()Ljava/lang/String;
/*    */     //   273: dup
/*    */     //   274: ldc 'getLookupString(...)'
/*    */     //   276: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   279: invokespecial isSingleCharParameter : (Ljava/lang/String;)Z
/*    */     //   282: ifne -> 238
/*    */     //   285: iconst_0
/*    */     //   286: goto -> 290
/*    */     //   289: iconst_1
/*    */     //   290: ifeq -> 429
/*    */     //   293: aload_3
/*    */     //   294: invokeinterface getItems : ()Ljava/util/List;
/*    */     //   299: dup
/*    */     //   300: ldc 'getItems(...)'
/*    */     //   302: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   305: checkcast java/lang/Iterable
/*    */     //   308: astore #5
/*    */     //   310: iconst_0
/*    */     //   311: istore #6
/*    */     //   313: aload #5
/*    */     //   315: instanceof java/util/Collection
/*    */     //   318: ifeq -> 338
/*    */     //   321: aload #5
/*    */     //   323: checkcast java/util/Collection
/*    */     //   326: invokeinterface isEmpty : ()Z
/*    */     //   331: ifeq -> 338
/*    */     //   334: iconst_0
/*    */     //   335: goto -> 420
/*    */     //   338: aload #5
/*    */     //   340: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   345: astore #7
/*    */     //   347: aload #7
/*    */     //   349: invokeinterface hasNext : ()Z
/*    */     //   354: ifeq -> 419
/*    */     //   357: aload #7
/*    */     //   359: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   364: astore #8
/*    */     //   366: aload #8
/*    */     //   368: checkcast com/intellij/codeInsight/lookup/LookupElement
/*    */     //   371: astore #9
/*    */     //   373: iconst_0
/*    */     //   374: istore #10
/*    */     //   376: aload_0
/*    */     //   377: aload #9
/*    */     //   379: invokevirtual getLookupString : ()Ljava/lang/String;
/*    */     //   382: dup
/*    */     //   383: ldc 'getLookupString(...)'
/*    */     //   385: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   388: invokespecial isSingleCharParameter : (Ljava/lang/String;)Z
/*    */     //   391: ifeq -> 411
/*    */     //   394: aload #9
/*    */     //   396: invokevirtual getLookupString : ()Ljava/lang/String;
/*    */     //   399: iconst_1
/*    */     //   400: invokevirtual charAt : (I)C
/*    */     //   403: iload_1
/*    */     //   404: if_icmpne -> 411
/*    */     //   407: iconst_1
/*    */     //   408: goto -> 412
/*    */     //   411: iconst_0
/*    */     //   412: ifeq -> 347
/*    */     //   415: iconst_1
/*    */     //   416: goto -> 420
/*    */     //   419: iconst_0
/*    */     //   420: ifne -> 429
/*    */     //   423: getstatic com/intellij/codeInsight/lookup/CharFilter$Result.HIDE_LOOKUP : Lcom/intellij/codeInsight/lookup/CharFilter$Result;
/*    */     //   426: goto -> 442
/*    */     //   429: getstatic com/intellij/codeInsight/lookup/CharFilter$Result.ADD_TO_PREFIX : Lcom/intellij/codeInsight/lookup/CharFilter$Result;
/*    */     //   432: goto -> 442
/*    */     //   435: getstatic com/intellij/codeInsight/lookup/CharFilter$Result.HIDE_LOOKUP : Lcom/intellij/codeInsight/lookup/CharFilter$Result;
/*    */     //   438: goto -> 442
/*    */     //   441: aconst_null
/*    */     //   442: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 6
/*    */     //   #16	-> 16
/*    */     //   #18	-> 22
/*    */     //   #20	-> 32
/*    */     //   #22	-> 38
/*    */     //   #24	-> 59
/*    */     //   #47	-> 79
/*    */     //   #48	-> 98
/*    */     //   #24	-> 136
/*    */     //   #48	-> 149
/*    */     //   #49	-> 165
/*    */     //   #47	-> 170
/*    */     //   #24	-> 171
/*    */     //   #25	-> 173
/*    */     //   #25	-> 191
/*    */     //   #26	-> 194
/*    */     //   #50	-> 204
/*    */     //   #51	-> 229
/*    */     //   #26	-> 267
/*    */     //   #51	-> 282
/*    */     //   #52	-> 289
/*    */     //   #26	-> 290
/*    */     //   #27	-> 293
/*    */     //   #53	-> 313
/*    */     //   #54	-> 338
/*    */     //   #27	-> 376
/*    */     //   #54	-> 412
/*    */     //   #55	-> 419
/*    */     //   #27	-> 420
/*    */     //   #30	-> 423
/*    */     //   #32	-> 429
/*    */     //   #34	-> 435
/*    */     //   #36	-> 441
/*    */     //   #14	-> 442
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   136	13	13	$i$a$-filter-TerminalCharFilter$acceptChar$matches$1	I
/*    */     //   133	16	12	it	Lcom/intellij/codeInsight/lookup/LookupElement;
/*    */     //   126	36	11	element$iv$iv	Ljava/lang/Object;
/*    */     //   98	69	9	$i$f$filterTo	I
/*    */     //   95	72	7	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   95	72	8	destination$iv$iv	Ljava/util/Collection;
/*    */     //   79	92	6	$i$f$filter	I
/*    */     //   76	95	5	$this$filter$iv	Ljava/lang/Iterable;
/*    */     //   267	15	10	$i$a$-all-TerminalCharFilter$acceptChar$1	I
/*    */     //   264	18	9	it	Lcom/intellij/codeInsight/lookup/LookupElement;
/*    */     //   257	32	8	element$iv	Ljava/lang/Object;
/*    */     //   204	86	6	$i$f$all	I
/*    */     //   201	89	5	$this$all$iv	Ljava/lang/Iterable;
/*    */     //   376	36	10	$i$a$-any-TerminalCharFilter$acceptChar$2	I
/*    */     //   373	39	9	it	Lcom/intellij/codeInsight/lookup/LookupElement;
/*    */     //   366	53	8	element$iv	Ljava/lang/Object;
/*    */     //   313	107	6	$i$f$any	I
/*    */     //   310	110	5	$this$any$iv	Ljava/lang/Iterable;
/*    */     //   173	265	4	matches	Ljava/util/List;
/*    */     //   0	443	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalCharFilter;
/*    */     //   0	443	1	c	C
/*    */     //   0	443	2	prefixLength	I
/*    */     //   0	443	3	lookup	Lcom/intellij/codeInsight/lookup/Lookup;
/*    */   }
/*    */   
/*    */   private final boolean matchesAfterAppendingChar(Lookup lookup, LookupElement item, char c) {
/* 40 */     Intrinsics.checkNotNullExpressionValue(lookup.itemMatcher(item), "itemMatcher(...)"); PrefixMatcher matcher = lookup.itemMatcher(item);
/* 41 */     Intrinsics.checkNotNull(lookup, "null cannot be cast to non-null type com.intellij.codeInsight.lookup.impl.LookupImpl"); return matcher.cloneWithPrefix(matcher.getPrefix() + matcher.getPrefix() + ((LookupImpl)lookup).getAdditionalPrefix()).prefixMatches(item);
/*    */   }
/*    */   private final boolean isSingleCharParameter(String value) {
/* 44 */     return (value.length() == 2 && value.charAt(0) == '-');
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalCharFilter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */