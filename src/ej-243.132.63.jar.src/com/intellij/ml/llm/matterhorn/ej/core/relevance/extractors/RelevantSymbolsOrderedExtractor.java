/*     */ package com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.relevance.RelevantSymbolsExtractorContext;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*     */ import com.intellij.psi.SmartPsiElementPointer;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\016\n\000\n\002\020%\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J:\020\b\032\024\022\020\022\016\022\006\b\001\022\0020\0130\nj\002`\f0\t2\030\020\r\032\024\022\020\022\016\022\006\b\001\022\0020\0130\nj\002`\f0\tH@¢\006\002\020\016J8\020\017\032\b\022\004\022\002H\0200\t\"\004\b\000\020\020*\0020\0212\036\020\022\032\032\022\004\022\0020\021\022\020\022\016\022\004\022\0020\021\022\004\022\002H\0200\0230\023H\002J \020\024\032\0020\0212\006\020\025\032\0020\0262\006\020\027\032\0020\0212\006\020\030\032\0020\031H\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor;", "", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;)V", "getContext", "()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;", "extract", "", "Lcom/intellij/psi/SmartPsiElementPointer;", "Lcom/intellij/psi/PsiElement;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/PsiElementPointer;", "files", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extractAnswer", "T", "", "symbolMap", "", "getSymbolOrderingPrompt", "issue", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "symbols", "maxSymbols", "", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nRelevantSymbolsOrderedExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelevantSymbolsOrderedExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,146:1\n1872#2,3:147\n774#2:150\n865#2,2:151\n1611#2,9:153\n1863#2:162\n1864#2:164\n1620#2:165\n1368#2:173\n1454#2,5:174\n1557#2:179\n1628#2,3:180\n1611#2,9:183\n1863#2:192\n1864#2:194\n1620#2:195\n1#3:163\n1#3:193\n381#4,7:166\n*S KotlinDebug\n*F\n+ 1 RelevantSymbolsOrderedExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor\n*L\n66#1:147,3\n90#1:150\n90#1:151,2\n91#1:153,9\n91#1:162\n91#1:164\n91#1:165\n22#1:173\n22#1:174,5\n73#1:179\n73#1:180,3\n82#1:183,9\n82#1:192\n82#1:194\n82#1:195\n91#1:163\n82#1:193\n38#1:166,7\n*E\n"})
/*     */ public final class RelevantSymbolsOrderedExtractor {
/*  16 */   public RelevantSymbolsOrderedExtractor(@NotNull RelevantSymbolsExtractorContext context) { this.context = context; } @NotNull private final RelevantSymbolsExtractorContext context; @NotNull public final RelevantSymbolsExtractorContext getContext() { return this.context; }
/*     */   
/*     */   @Nullable
/*     */   public final Object extract(@NotNull List files, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor$extract$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor$extract$1
/*     */     //   11: astore #34
/*     */     //   13: aload #34
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #34
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor$extract$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #34
/*     */     //   50: aload #34
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #33
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #35
/*     */     //   62: aload #34
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 1073, 0 -> 104, 1 -> 151, 2 -> 420, 3 -> 712, 4 -> 884, 5 -> 1052
/*     */     //   104: aload #33
/*     */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   109: invokestatic currentTimeMillis : ()J
/*     */     //   112: lstore_3
/*     */     //   113: aload_1
/*     */     //   114: <illegal opcode> invoke : (Ljava/util/List;)Lkotlin/jvm/functions/Function0;
/*     */     //   119: aload #34
/*     */     //   121: aload #34
/*     */     //   123: aload_0
/*     */     //   124: putfield L$0 : Ljava/lang/Object;
/*     */     //   127: aload #34
/*     */     //   129: lload_3
/*     */     //   130: putfield J$0 : J
/*     */     //   133: aload #34
/*     */     //   135: iconst_1
/*     */     //   136: putfield label : I
/*     */     //   139: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   142: dup
/*     */     //   143: aload #35
/*     */     //   145: if_acmpne -> 173
/*     */     //   148: aload #35
/*     */     //   150: areturn
/*     */     //   151: aload #34
/*     */     //   153: getfield J$0 : J
/*     */     //   156: lstore_3
/*     */     //   157: aload #34
/*     */     //   159: getfield L$0 : Ljava/lang/Object;
/*     */     //   162: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor
/*     */     //   165: astore_0
/*     */     //   166: aload #33
/*     */     //   168: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   171: aload #33
/*     */     //   173: checkcast kotlin/Pair
/*     */     //   176: astore #5
/*     */     //   178: aload #5
/*     */     //   180: invokevirtual component1 : ()Ljava/lang/Object;
/*     */     //   183: checkcast java/util/Map
/*     */     //   186: astore #6
/*     */     //   188: aload #5
/*     */     //   190: invokevirtual component2 : ()Ljava/lang/Object;
/*     */     //   193: dup
/*     */     //   194: ldc 'component2(...)'
/*     */     //   196: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   199: checkcast java/lang/String
/*     */     //   202: astore #7
/*     */     //   204: aload #6
/*     */     //   206: invokeinterface isEmpty : ()Z
/*     */     //   211: ifeq -> 218
/*     */     //   214: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   217: areturn
/*     */     //   218: aload_0
/*     */     //   219: aload_0
/*     */     //   220: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   223: invokevirtual getIssue : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   226: aload #7
/*     */     //   228: checkcast java/lang/CharSequence
/*     */     //   231: iconst_1
/*     */     //   232: anewarray java/lang/String
/*     */     //   235: astore #9
/*     */     //   237: aload #9
/*     */     //   239: iconst_0
/*     */     //   240: ldc '\\n'
/*     */     //   242: aastore
/*     */     //   243: aload #9
/*     */     //   245: iconst_0
/*     */     //   246: iconst_0
/*     */     //   247: bipush #6
/*     */     //   249: aconst_null
/*     */     //   250: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*     */     //   253: checkcast java/lang/Iterable
/*     */     //   256: invokestatic sorted : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   259: checkcast java/lang/Iterable
/*     */     //   262: ldc '\\n'
/*     */     //   264: checkcast java/lang/CharSequence
/*     */     //   267: aconst_null
/*     */     //   268: aconst_null
/*     */     //   269: iconst_0
/*     */     //   270: aconst_null
/*     */     //   271: aconst_null
/*     */     //   272: bipush #62
/*     */     //   274: aconst_null
/*     */     //   275: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   278: aload_0
/*     */     //   279: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   282: invokevirtual getParameters : ()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   285: invokevirtual getMaxAnswersRelevantSymbols : ()I
/*     */     //   288: invokespecial getSymbolOrderingPrompt : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Ljava/lang/String;I)Ljava/lang/String;
/*     */     //   291: astore #8
/*     */     //   293: new com/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest
/*     */     //   296: dup
/*     */     //   297: ldc 'SETTING: Your role is a coding assistant. You should help to solve the issue, described below.'
/*     */     //   299: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   302: dup
/*     */     //   303: aload #8
/*     */     //   305: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   308: aconst_null
/*     */     //   309: aconst_null
/*     */     //   310: bipush #12
/*     */     //   312: aconst_null
/*     */     //   313: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   316: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   319: aload_0
/*     */     //   320: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   323: invokevirtual getParameters : ()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   326: invokevirtual getModelParameters : ()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   329: aload_0
/*     */     //   330: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   333: invokevirtual getParameters : ()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   336: invokevirtual getNumResponsesRelevantSymbolsOrdered : ()I
/*     */     //   339: aconst_null
/*     */     //   340: new com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor$extract$request$1
/*     */     //   343: dup
/*     */     //   344: aconst_null
/*     */     //   345: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   348: checkcast kotlin/jvm/functions/Function3
/*     */     //   351: bipush #16
/*     */     //   353: aconst_null
/*     */     //   354: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ILjava/util/List;Lkotlin/jvm/functions/Function3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   357: astore #9
/*     */     //   359: aload_0
/*     */     //   360: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   363: invokevirtual getContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   366: aload #9
/*     */     //   368: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
/*     */     //   371: iconst_0
/*     */     //   372: aload #34
/*     */     //   374: iconst_2
/*     */     //   375: aconst_null
/*     */     //   376: aload #34
/*     */     //   378: aload_0
/*     */     //   379: putfield L$0 : Ljava/lang/Object;
/*     */     //   382: aload #34
/*     */     //   384: aload #6
/*     */     //   386: putfield L$1 : Ljava/lang/Object;
/*     */     //   389: aload #34
/*     */     //   391: aload #8
/*     */     //   393: putfield L$2 : Ljava/lang/Object;
/*     */     //   396: aload #34
/*     */     //   398: lload_3
/*     */     //   399: putfield J$0 : J
/*     */     //   402: aload #34
/*     */     //   404: iconst_2
/*     */     //   405: putfield label : I
/*     */     //   408: invokestatic sendToGrazie$default : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   411: dup
/*     */     //   412: aload #35
/*     */     //   414: if_acmpne -> 462
/*     */     //   417: aload #35
/*     */     //   419: areturn
/*     */     //   420: aload #34
/*     */     //   422: getfield J$0 : J
/*     */     //   425: lstore_3
/*     */     //   426: aload #34
/*     */     //   428: getfield L$2 : Ljava/lang/Object;
/*     */     //   431: checkcast java/lang/String
/*     */     //   434: astore #8
/*     */     //   436: aload #34
/*     */     //   438: getfield L$1 : Ljava/lang/Object;
/*     */     //   441: checkcast java/util/Map
/*     */     //   444: astore #6
/*     */     //   446: aload #34
/*     */     //   448: getfield L$0 : Ljava/lang/Object;
/*     */     //   451: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor
/*     */     //   454: astore_0
/*     */     //   455: aload #33
/*     */     //   457: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   460: aload #33
/*     */     //   462: checkcast java/lang/String
/*     */     //   465: astore #10
/*     */     //   467: new java/util/concurrent/ConcurrentHashMap
/*     */     //   470: dup
/*     */     //   471: invokespecial <init> : ()V
/*     */     //   474: astore #11
/*     */     //   476: aload #10
/*     */     //   478: invokestatic splitMultipleResponse : (Ljava/lang/String;)Ljava/util/List;
/*     */     //   481: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   486: astore #12
/*     */     //   488: aload #12
/*     */     //   490: invokeinterface hasNext : ()Z
/*     */     //   495: ifeq -> 658
/*     */     //   498: aload #12
/*     */     //   500: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   505: checkcast java/lang/String
/*     */     //   508: astore #13
/*     */     //   510: aload_0
/*     */     //   511: aload #13
/*     */     //   513: aload #6
/*     */     //   515: invokespecial extractAnswer : (Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;
/*     */     //   518: astore #14
/*     */     //   520: aload #14
/*     */     //   522: checkcast java/lang/Iterable
/*     */     //   525: astore #15
/*     */     //   527: iconst_0
/*     */     //   528: istore #16
/*     */     //   530: iconst_0
/*     */     //   531: istore #17
/*     */     //   533: aload #15
/*     */     //   535: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   540: astore #18
/*     */     //   542: aload #18
/*     */     //   544: invokeinterface hasNext : ()Z
/*     */     //   549: ifeq -> 654
/*     */     //   552: aload #18
/*     */     //   554: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   559: astore #19
/*     */     //   561: iload #17
/*     */     //   563: iinc #17, 1
/*     */     //   566: istore #20
/*     */     //   568: iload #20
/*     */     //   570: ifge -> 576
/*     */     //   573: invokestatic throwIndexOverflow : ()V
/*     */     //   576: iload #20
/*     */     //   578: aload #19
/*     */     //   580: checkcast com/intellij/psi/SmartPsiElementPointer
/*     */     //   583: astore #21
/*     */     //   585: istore #22
/*     */     //   587: iconst_0
/*     */     //   588: istore #23
/*     */     //   590: aload #11
/*     */     //   592: checkcast java/util/Map
/*     */     //   595: astore #24
/*     */     //   597: aload #11
/*     */     //   599: aload #21
/*     */     //   601: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   604: checkcast java/lang/Integer
/*     */     //   607: dup
/*     */     //   608: ifnull -> 617
/*     */     //   611: invokevirtual intValue : ()I
/*     */     //   614: goto -> 619
/*     */     //   617: pop
/*     */     //   618: iconst_0
/*     */     //   619: aload_0
/*     */     //   620: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   623: invokevirtual getParameters : ()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   626: invokevirtual getMaxAnswersRelevantSymbols : ()I
/*     */     //   629: iadd
/*     */     //   630: iload #22
/*     */     //   632: isub
/*     */     //   633: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */     //   636: astore #25
/*     */     //   638: aload #24
/*     */     //   640: aload #21
/*     */     //   642: aload #25
/*     */     //   644: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   649: pop
/*     */     //   650: nop
/*     */     //   651: goto -> 542
/*     */     //   654: nop
/*     */     //   655: goto -> 488
/*     */     //   658: aload #11
/*     */     //   660: aload_0
/*     */     //   661: <illegal opcode> invoke : (Ljava/util/concurrent/ConcurrentHashMap;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor;)Lkotlin/jvm/functions/Function0;
/*     */     //   666: aload #34
/*     */     //   668: aload #34
/*     */     //   670: aload_0
/*     */     //   671: putfield L$0 : Ljava/lang/Object;
/*     */     //   674: aload #34
/*     */     //   676: aload #8
/*     */     //   678: putfield L$1 : Ljava/lang/Object;
/*     */     //   681: aload #34
/*     */     //   683: aload #10
/*     */     //   685: putfield L$2 : Ljava/lang/Object;
/*     */     //   688: aload #34
/*     */     //   690: lload_3
/*     */     //   691: putfield J$0 : J
/*     */     //   694: aload #34
/*     */     //   696: iconst_3
/*     */     //   697: putfield label : I
/*     */     //   700: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   703: dup
/*     */     //   704: aload #35
/*     */     //   706: if_acmpne -> 754
/*     */     //   709: aload #35
/*     */     //   711: areturn
/*     */     //   712: aload #34
/*     */     //   714: getfield J$0 : J
/*     */     //   717: lstore_3
/*     */     //   718: aload #34
/*     */     //   720: getfield L$2 : Ljava/lang/Object;
/*     */     //   723: checkcast java/lang/String
/*     */     //   726: astore #10
/*     */     //   728: aload #34
/*     */     //   730: getfield L$1 : Ljava/lang/Object;
/*     */     //   733: checkcast java/lang/String
/*     */     //   736: astore #8
/*     */     //   738: aload #34
/*     */     //   740: getfield L$0 : Ljava/lang/Object;
/*     */     //   743: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor
/*     */     //   746: astore_0
/*     */     //   747: aload #33
/*     */     //   749: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   752: aload #33
/*     */     //   754: checkcast java/util/List
/*     */     //   757: astore #12
/*     */     //   759: invokestatic currentTimeMillis : ()J
/*     */     //   762: lload_3
/*     */     //   763: lsub
/*     */     //   764: lstore #13
/*     */     //   766: aload_0
/*     */     //   767: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   770: invokevirtual getContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   773: ldc_w 'repomap_FindSymbols'
/*     */     //   776: aload_0
/*     */     //   777: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   780: invokevirtual getParameters : ()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   783: ldc 'SETTING: Your role is a coding assistant. You should help to solve the issue, described below.'
/*     */     //   785: aload #8
/*     */     //   787: aload #10
/*     */     //   789: astore #31
/*     */     //   791: astore #30
/*     */     //   793: astore #29
/*     */     //   795: astore #28
/*     */     //   797: astore #27
/*     */     //   799: astore #26
/*     */     //   801: aload #12
/*     */     //   803: <illegal opcode> invoke : (Ljava/util/List;)Lkotlin/jvm/functions/Function0;
/*     */     //   808: aload #34
/*     */     //   810: aload #34
/*     */     //   812: aload #12
/*     */     //   814: putfield L$0 : Ljava/lang/Object;
/*     */     //   817: aload #34
/*     */     //   819: aload #26
/*     */     //   821: putfield L$1 : Ljava/lang/Object;
/*     */     //   824: aload #34
/*     */     //   826: aload #27
/*     */     //   828: putfield L$2 : Ljava/lang/Object;
/*     */     //   831: aload #34
/*     */     //   833: aload #28
/*     */     //   835: putfield L$3 : Ljava/lang/Object;
/*     */     //   838: aload #34
/*     */     //   840: aload #29
/*     */     //   842: putfield L$4 : Ljava/lang/Object;
/*     */     //   845: aload #34
/*     */     //   847: aload #30
/*     */     //   849: putfield L$5 : Ljava/lang/Object;
/*     */     //   852: aload #34
/*     */     //   854: aload #31
/*     */     //   856: putfield L$6 : Ljava/lang/Object;
/*     */     //   859: aload #34
/*     */     //   861: lload #13
/*     */     //   863: putfield J$0 : J
/*     */     //   866: aload #34
/*     */     //   868: iconst_4
/*     */     //   869: putfield label : I
/*     */     //   872: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   875: dup
/*     */     //   876: aload #35
/*     */     //   878: if_acmpne -> 968
/*     */     //   881: aload #35
/*     */     //   883: areturn
/*     */     //   884: aload #34
/*     */     //   886: getfield J$0 : J
/*     */     //   889: lstore #13
/*     */     //   891: aload #34
/*     */     //   893: getfield L$6 : Ljava/lang/Object;
/*     */     //   896: checkcast java/lang/String
/*     */     //   899: astore #31
/*     */     //   901: aload #34
/*     */     //   903: getfield L$5 : Ljava/lang/Object;
/*     */     //   906: checkcast java/lang/String
/*     */     //   909: astore #30
/*     */     //   911: aload #34
/*     */     //   913: getfield L$4 : Ljava/lang/Object;
/*     */     //   916: checkcast java/lang/String
/*     */     //   919: astore #29
/*     */     //   921: aload #34
/*     */     //   923: getfield L$3 : Ljava/lang/Object;
/*     */     //   926: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters
/*     */     //   929: astore #28
/*     */     //   931: aload #34
/*     */     //   933: getfield L$2 : Ljava/lang/Object;
/*     */     //   936: checkcast java/lang/String
/*     */     //   939: astore #27
/*     */     //   941: aload #34
/*     */     //   943: getfield L$1 : Ljava/lang/Object;
/*     */     //   946: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   949: astore #26
/*     */     //   951: aload #34
/*     */     //   953: getfield L$0 : Ljava/lang/Object;
/*     */     //   956: checkcast java/util/List
/*     */     //   959: astore #12
/*     */     //   961: aload #33
/*     */     //   963: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   966: aload #33
/*     */     //   968: astore #32
/*     */     //   970: aload #26
/*     */     //   972: aload #27
/*     */     //   974: aload #28
/*     */     //   976: aload #29
/*     */     //   978: aload #30
/*     */     //   980: aload #31
/*     */     //   982: aload #32
/*     */     //   984: checkcast java/lang/String
/*     */     //   987: lload #13
/*     */     //   989: aload #34
/*     */     //   991: aload #34
/*     */     //   993: aload #12
/*     */     //   995: putfield L$0 : Ljava/lang/Object;
/*     */     //   998: aload #34
/*     */     //   1000: aconst_null
/*     */     //   1001: putfield L$1 : Ljava/lang/Object;
/*     */     //   1004: aload #34
/*     */     //   1006: aconst_null
/*     */     //   1007: putfield L$2 : Ljava/lang/Object;
/*     */     //   1010: aload #34
/*     */     //   1012: aconst_null
/*     */     //   1013: putfield L$3 : Ljava/lang/Object;
/*     */     //   1016: aload #34
/*     */     //   1018: aconst_null
/*     */     //   1019: putfield L$4 : Ljava/lang/Object;
/*     */     //   1022: aload #34
/*     */     //   1024: aconst_null
/*     */     //   1025: putfield L$5 : Ljava/lang/Object;
/*     */     //   1028: aload #34
/*     */     //   1030: aconst_null
/*     */     //   1031: putfield L$6 : Ljava/lang/Object;
/*     */     //   1034: aload #34
/*     */     //   1036: iconst_5
/*     */     //   1037: putfield label : I
/*     */     //   1040: invokestatic logTrajectories : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1043: dup
/*     */     //   1044: aload #35
/*     */     //   1046: if_acmpne -> 1069
/*     */     //   1049: aload #35
/*     */     //   1051: areturn
/*     */     //   1052: aload #34
/*     */     //   1054: getfield L$0 : Ljava/lang/Object;
/*     */     //   1057: checkcast java/util/List
/*     */     //   1060: astore #12
/*     */     //   1062: aload #33
/*     */     //   1064: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1067: aload #33
/*     */     //   1069: pop
/*     */     //   1070: aload #12
/*     */     //   1072: areturn
/*     */     //   1073: new java/lang/IllegalStateException
/*     */     //   1076: dup
/*     */     //   1077: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1080: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1083: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #18	-> 60
/*     */     //   #19	-> 109
/*     */     //   #21	-> 113
/*     */     //   #18	-> 148
/*     */     //   #21	-> 173
/*     */     //   #45	-> 204
/*     */     //   #47	-> 218
/*     */     //   #48	-> 219
/*     */     //   #49	-> 226
/*     */     //   #50	-> 278
/*     */     //   #47	-> 288
/*     */     //   #53	-> 293
/*     */     //   #54	-> 297
/*     */     //   #55	-> 299
/*     */     //   #56	-> 319
/*     */     //   #57	-> 329
/*     */     //   #53	-> 339
/*     */     //   #61	-> 359
/*     */     //   #18	-> 417
/*     */     //   #63	-> 467
/*     */     //   #64	-> 476
/*     */     //   #65	-> 510
/*     */     //   #66	-> 520
/*     */     //   #147	-> 530
/*     */     //   #148	-> 533
/*     */     //   #148	-> 578
/*     */     //   #67	-> 590
/*     */     //   #68	-> 650
/*     */     //   #148	-> 651
/*     */     //   #149	-> 654
/*     */     //   #71	-> 658
/*     */     //   #18	-> 709
/*     */     //   #75	-> 759
/*     */     //   #76	-> 766
/*     */     //   #77	-> 773
/*     */     //   #78	-> 776
/*     */     //   #79	-> 783
/*     */     //   #80	-> 785
/*     */     //   #81	-> 787
/*     */     //   #82	-> 801
/*     */     //   #18	-> 881
/*     */     //   #83	-> 987
/*     */     //   #76	-> 991
/*     */     //   #18	-> 1049
/*     */     //   #85	-> 1069
/*     */     //   #18	-> 1073
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   109	42	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor;
/*     */     //   166	254	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor;
/*     */     //   455	121	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor;
/*     */     //   576	136	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor;
/*     */     //   747	36	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor;
/*     */     //   109	33	1	files	Ljava/util/List;
/*     */     //   113	38	3	startTime	J
/*     */     //   157	263	3	startTime	J
/*     */     //   426	150	3	startTime	J
/*     */     //   576	136	3	startTime	J
/*     */     //   718	48	3	startTime	J
/*     */     //   188	232	6	symbolMap	Ljava/util/Map;
/*     */     //   446	130	6	symbolMap	Ljava/util/Map;
/*     */     //   576	75	6	symbolMap	Ljava/util/Map;
/*     */     //   651	4	6	symbolMap	Ljava/util/Map;
/*     */     //   655	3	6	symbolMap	Ljava/util/Map;
/*     */     //   204	14	7	text	Ljava/lang/String;
/*     */     //   218	19	7	text	Ljava/lang/String;
/*     */     //   293	127	8	prompt	Ljava/lang/String;
/*     */     //   436	140	8	prompt	Ljava/lang/String;
/*     */     //   576	136	8	prompt	Ljava/lang/String;
/*     */     //   738	49	8	prompt	Ljava/lang/String;
/*     */     //   359	52	9	request	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*     */     //   467	109	10	allResponses	Ljava/lang/String;
/*     */     //   576	136	10	allResponses	Ljava/lang/String;
/*     */     //   728	73	10	allResponses	Ljava/lang/String;
/*     */     //   476	100	11	extractedSymbols	Ljava/util/concurrent/ConcurrentHashMap;
/*     */     //   576	75	11	extractedSymbols	Ljava/util/concurrent/ConcurrentHashMap;
/*     */     //   651	4	11	extractedSymbols	Ljava/util/concurrent/ConcurrentHashMap;
/*     */     //   655	48	11	extractedSymbols	Ljava/util/concurrent/ConcurrentHashMap;
/*     */     //   759	125	12	result	Ljava/util/List;
/*     */     //   961	91	12	result	Ljava/util/List;
/*     */     //   1062	11	12	result	Ljava/util/List;
/*     */     //   510	10	13	response	Ljava/lang/String;
/*     */     //   766	118	13	execTime	J
/*     */     //   891	100	13	execTime	J
/*     */     //   520	7	14	rankedSymbols	Ljava/util/List;
/*     */     //   527	15	15	$this$forEachIndexed$iv	Ljava/lang/Iterable;
/*     */     //   533	43	17	index$iv	I
/*     */     //   576	79	17	index$iv	I
/*     */     //   561	15	19	item$iv	Ljava/lang/Object;
/*     */     //   576	11	19	item$iv	Ljava/lang/Object;
/*     */     //   587	64	21	symbol	Lcom/intellij/psi/SmartPsiElementPointer;
/*     */     //   587	64	22	index	I
/*     */     //   590	61	23	$i$a$-forEachIndexed-RelevantSymbolsOrderedExtractor$extract$3	I
/*     */     //   530	125	16	$i$f$forEachIndexed	I
/*     */     //   0	1084	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	1023	34	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	1016	33	$result	Ljava/lang/Object;
/*     */   }
/*     */   private static final Pair extract$lambda$3(List $files) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: checkcast java/lang/Iterable
/*     */     //   4: astore_2
/*     */     //   5: iconst_0
/*     */     //   6: istore_3
/*     */     //   7: aload_2
/*     */     //   8: astore #4
/*     */     //   10: new java/util/ArrayList
/*     */     //   13: dup
/*     */     //   14: invokespecial <init> : ()V
/*     */     //   17: checkcast java/util/Collection
/*     */     //   20: astore #5
/*     */     //   22: iconst_0
/*     */     //   23: istore #6
/*     */     //   25: aload #4
/*     */     //   27: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   32: astore #7
/*     */     //   34: aload #7
/*     */     //   36: invokeinterface hasNext : ()Z
/*     */     //   41: ifeq -> 127
/*     */     //   44: aload #7
/*     */     //   46: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   51: astore #8
/*     */     //   53: aload #8
/*     */     //   55: checkcast com/intellij/psi/SmartPsiElementPointer
/*     */     //   58: astore #9
/*     */     //   60: iconst_0
/*     */     //   61: istore #10
/*     */     //   63: aload #9
/*     */     //   65: invokeinterface getElement : ()Lcom/intellij/psi/PsiElement;
/*     */     //   70: astore #11
/*     */     //   72: aload #11
/*     */     //   74: ifnonnull -> 83
/*     */     //   77: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   80: goto -> 110
/*     */     //   83: aload #11
/*     */     //   85: instanceof com/intellij/psi/PsiFile
/*     */     //   88: ifeq -> 105
/*     */     //   91: getstatic com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$Companion;
/*     */     //   94: aload #11
/*     */     //   96: checkcast com/intellij/psi/PsiFile
/*     */     //   99: invokevirtual extractElements : (Lcom/intellij/psi/PsiFile;)Ljava/util/List;
/*     */     //   102: goto -> 110
/*     */     //   105: aload #11
/*     */     //   107: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   110: checkcast java/lang/Iterable
/*     */     //   113: nop
/*     */     //   114: astore #9
/*     */     //   116: aload #5
/*     */     //   118: aload #9
/*     */     //   120: invokestatic addAll : (Ljava/util/Collection;Ljava/lang/Iterable;)Z
/*     */     //   123: pop
/*     */     //   124: goto -> 34
/*     */     //   127: aload #5
/*     */     //   129: checkcast java/util/List
/*     */     //   132: nop
/*     */     //   133: astore_1
/*     */     //   134: new java/lang/StringBuilder
/*     */     //   137: dup
/*     */     //   138: invokespecial <init> : ()V
/*     */     //   141: astore_2
/*     */     //   142: new java/util/LinkedHashMap
/*     */     //   145: dup
/*     */     //   146: invokespecial <init> : ()V
/*     */     //   149: checkcast java/util/Map
/*     */     //   152: astore_3
/*     */     //   153: new com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/FormatHierarchyParams
/*     */     //   156: dup
/*     */     //   157: iconst_1
/*     */     //   158: getstatic com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType.NAME_ONLY : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;
/*     */     //   161: invokespecial <init> : (ZLcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;)V
/*     */     //   164: astore #4
/*     */     //   166: aload_1
/*     */     //   167: aload #4
/*     */     //   169: aload_2
/*     */     //   170: aload_3
/*     */     //   171: <illegal opcode> invoke : (Ljava/lang/StringBuilder;Ljava/util/Map;)Lkotlin/jvm/functions/Function2;
/*     */     //   176: invokestatic formatHierarchy : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/FormatHierarchyParams;Lkotlin/jvm/functions/Function2;)V
/*     */     //   179: aload_3
/*     */     //   180: aload_2
/*     */     //   181: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   184: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   187: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #22	-> 0
/*     */     //   #173	-> 7
/*     */     //   #174	-> 25
/*     */     //   #175	-> 53
/*     */     //   #23	-> 63
/*     */     //   #24	-> 72
/*     */     //   #25	-> 83
/*     */     //   #26	-> 105
/*     */     //   #27	-> 113
/*     */     //   #175	-> 114
/*     */     //   #176	-> 116
/*     */     //   #178	-> 127
/*     */     //   #173	-> 132
/*     */     //   #22	-> 133
/*     */     //   #30	-> 134
/*     */     //   #31	-> 142
/*     */     //   #31	-> 152
/*     */     //   #32	-> 153
/*     */     //   #33	-> 166
/*     */     //   #42	-> 179
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   72	38	11	file	Lcom/intellij/psi/PsiElement;
/*     */     //   63	51	10	$i$a$-flatMap-RelevantSymbolsOrderedExtractor$extract$2$elements$1	I
/*     */     //   60	54	9	it	Lcom/intellij/psi/SmartPsiElementPointer;
/*     */     //   116	8	9	list$iv$iv	Ljava/lang/Iterable;
/*     */     //   53	71	8	element$iv$iv	Ljava/lang/Object;
/*     */     //   25	104	6	$i$f$flatMapTo	I
/*     */     //   22	107	4	$this$flatMapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   22	107	5	destination$iv$iv	Ljava/util/Collection;
/*     */     //   7	126	3	$i$f$flatMap	I
/*     */     //   5	128	2	$this$flatMap$iv	Ljava/lang/Iterable;
/*     */     //   134	54	1	elements	Ljava/util/List;
/*     */     //   142	46	2	textBuilder	Ljava/lang/StringBuilder;
/*     */     //   153	35	3	fileToPresentationToSymbol	Ljava/util/Map;
/*     */     //   166	22	4	format	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/FormatHierarchyParams;
/*     */     //   0	188	0	$files	Ljava/util/List;
/*     */   }
/*     */   private static final Unit extract$lambda$3$lambda$2(StringBuilder $textBuilder, Map<String, Object<Object, Object>> $fileToPresentationToSymbol, PsiElement element, String text) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc_w 'element'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_3
/*     */     //   8: ldc_w 'text'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_2
/*     */     //   15: invokeinterface getContainingFile : ()Lcom/intellij/psi/PsiFile;
/*     */     //   20: dup
/*     */     //   21: ifnull -> 43
/*     */     //   24: aload_2
/*     */     //   25: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   30: dup
/*     */     //   31: ldc_w 'getProject(...)'
/*     */     //   34: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   37: invokestatic relativePath : (Lcom/intellij/psi/PsiFile;Lcom/intellij/openapi/project/Project;)Ljava/lang/String;
/*     */     //   40: goto -> 45
/*     */     //   43: pop
/*     */     //   44: aconst_null
/*     */     //   45: astore #4
/*     */     //   47: aload #4
/*     */     //   49: ifnull -> 163
/*     */     //   52: aload_0
/*     */     //   53: aload #4
/*     */     //   55: aload_3
/*     */     //   56: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   61: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   64: dup
/*     */     //   65: ldc_w 'append(...)'
/*     */     //   68: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   71: bipush #10
/*     */     //   73: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   76: dup
/*     */     //   77: ldc_w 'append(...)'
/*     */     //   80: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   83: pop
/*     */     //   84: aload_1
/*     */     //   85: astore #6
/*     */     //   87: iconst_0
/*     */     //   88: istore #7
/*     */     //   90: aload #6
/*     */     //   92: aload #4
/*     */     //   94: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   99: astore #8
/*     */     //   101: aload #8
/*     */     //   103: ifnonnull -> 139
/*     */     //   106: iconst_0
/*     */     //   107: istore #9
/*     */     //   109: new java/util/LinkedHashMap
/*     */     //   112: dup
/*     */     //   113: invokespecial <init> : ()V
/*     */     //   116: checkcast java/util/Map
/*     */     //   119: nop
/*     */     //   120: astore #9
/*     */     //   122: aload #6
/*     */     //   124: aload #4
/*     */     //   126: aload #9
/*     */     //   128: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   133: pop
/*     */     //   134: aload #9
/*     */     //   136: goto -> 141
/*     */     //   139: aload #8
/*     */     //   141: nop
/*     */     //   142: checkcast java/util/Map
/*     */     //   145: astore #5
/*     */     //   147: aload #5
/*     */     //   149: aload_3
/*     */     //   150: invokestatic removeLineRange : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   153: aload_2
/*     */     //   154: invokestatic createSmartPointer : (Lcom/intellij/psi/PsiElement;)Lcom/intellij/psi/SmartPsiElementPointer;
/*     */     //   157: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   162: pop
/*     */     //   163: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   166: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #34	-> 14
/*     */     //   #35	-> 47
/*     */     //   #36	-> 52
/*     */     //   #38	-> 84
/*     */     //   #166	-> 90
/*     */     //   #167	-> 101
/*     */     //   #168	-> 106
/*     */     //   #38	-> 109
/*     */     //   #38	-> 119
/*     */     //   #168	-> 120
/*     */     //   #169	-> 122
/*     */     //   #170	-> 134
/*     */     //   #172	-> 139
/*     */     //   #167	-> 141
/*     */     //   #38	-> 142
/*     */     //   #39	-> 147
/*     */     //   #41	-> 163
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   109	11	9	$i$a$-getOrPut-RelevantSymbolsOrderedExtractor$extract$2$1$presentationToElement$1	I
/*     */     //   122	14	9	answer$iv	Ljava/lang/Object;
/*     */     //   90	52	7	$i$f$getOrPut	I
/*     */     //   101	41	8	value$iv	Ljava/lang/Object;
/*     */     //   87	55	6	$this$getOrPut$iv	Ljava/util/Map;
/*     */     //   147	16	5	presentationToElement	Ljava/util/Map;
/*     */     //   47	120	4	filePath	Ljava/lang/String;
/*     */     //   0	167	0	$textBuilder	Ljava/lang/StringBuilder;
/*     */     //   0	167	1	$fileToPresentationToSymbol	Ljava/util/Map;
/*     */     //   0	167	2	element	Lcom/intellij/psi/PsiElement;
/*     */     //   0	167	3	text	Ljava/lang/String;
/*     */   }
/*     */   @DebugMetadata(f = "RelevantSymbolsOrderedExtractor.kt", l = {21, 61, 71, 82, 76}, i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 4}, s = {"L$0", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "J$0", "L$0"}, n = {"this", "startTime", "this", "symbolMap", "prompt", "startTime", "this", "prompt", "allResponses", "startTime", "result", "execTime", "result"}, m = "extract", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.RelevantSymbolsOrderedExtractor")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RelevantSymbolsOrderedExtractor$extract$1 extends ContinuationImpl {
/*     */     Object L$0; Object L$1; Object L$2; Object L$3; Object L$4; Object L$5;
/*     */     Object L$6;
/*     */     long J$0;
/*     */     int label;
/*     */     
/*     */     RelevantSymbolsOrderedExtractor$extract$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RelevantSymbolsOrderedExtractor.this.extract(null, (Continuation<? super List<? extends SmartPsiElementPointer<? extends PsiElement>>>)this);
/*     */     } }
/*     */   
/*     */   @DebugMetadata(f = "RelevantSymbolsOrderedExtractor.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.RelevantSymbolsOrderedExtractor$extract$request$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\0042\f\020\005\032\b\022\004\022\0020\0020\001H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "<unused var>", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "optionsToRank"})
/*     */   static final class RelevantSymbolsOrderedExtractor$extract$request$1 extends SuspendLambda implements Function3<ExecutionContext, List<? extends MatterhornChatElement>, Continuation<? super List<? extends MatterhornChatElement>>, Object> { int label;
/*     */     
/*     */     RelevantSymbolsOrderedExtractor$extract$request$1(Continuation $completion) {
/*     */       super(3, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       List<? extends MatterhornChatElement> optionsToRank;
/*  57 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); optionsToRank = (List)this.L$0;
/*     */           
/*  59 */           return CollectionsKt.listOf(ExtractorUtilsKt.combineMultipleResponse(optionsToRank)); }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Object invoke(ExecutionContext p1, List p2, Continuation<? super RelevantSymbolsOrderedExtractor$extract$request$1> p3) {
/*     */       RelevantSymbolsOrderedExtractor$extract$request$1 relevantSymbolsOrderedExtractor$extract$request$1 = new RelevantSymbolsOrderedExtractor$extract$request$1(p3);
/*     */       relevantSymbolsOrderedExtractor$extract$request$1.L$0 = p2;
/*     */       return relevantSymbolsOrderedExtractor$extract$request$1.invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */ 
/*     */   
/*  71 */   private static final List extract$lambda$8(ConcurrentHashMap $extractedSymbols, RelevantSymbolsOrderedExtractor this$0) { Intrinsics.checkNotNullExpressionValue($extractedSymbols.entrySet(), "<get-entries>(...)");
/*  72 */     RelevantSymbolsOrderedExtractor$extract$lambda$8$$inlined$compareBy$1 relevantSymbolsOrderedExtractor$extract$lambda$8$$inlined$compareBy$1 = new RelevantSymbolsOrderedExtractor$extract$lambda$8$$inlined$compareBy$1(); List list1 = CollectionsKt.sortedWith($extractedSymbols.entrySet(), new RelevantSymbolsOrderedExtractor$extract$lambda$8$$inlined$thenBy$1(relevantSymbolsOrderedExtractor$extract$lambda$8$$inlined$compareBy$1));
/*  73 */     int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 179 */     List list2 = list1; Collection<SmartPsiElementPointer> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 180 */     for (Object item$iv$iv : list2) {
/* 181 */       Map.Entry entry = (Map.Entry)item$iv$iv; Collection<SmartPsiElementPointer> collection = destination$iv$iv; int $i$a$-map-RelevantSymbolsOrderedExtractor$extract$result$1$3 = 0; collection.add((SmartPsiElementPointer)entry.getKey());
/* 182 */     }  return CollectionsKt.take(destination$iv$iv, this$0.context.getParameters().getMaxRelevantSymbolsOrdered()); } private static final String extract$lambda$10(List $result) { Iterable $this$mapNotNull$iv = $result; int $i$f$mapNotNull = 0;
/* 183 */     Iterable iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 191 */     Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 192 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; SmartPsiElementPointer it = (SmartPsiElementPointer)element$iv$iv;
/*     */       int $i$a$-mapNotNull-RelevantSymbolsOrderedExtractor$extract$4$1 = 0; }
/*     */     
/* 195 */     return ExtractorUtilsKt.formatHierarchy((List<? extends PsiElement>)destination$iv$iv, new FormatHierarchyParams(true, null, 2, null)); }
/*     */ 
/*     */   
/*     */   private final <T> List<T> extractAnswer(String $this$extractAnswer, Map symbolMap) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'ranked_symbols'
/*     */     //   4: invokestatic getTextByXMLTag : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   7: astore_3
/*     */     //   8: aload_3
/*     */     //   9: checkcast java/lang/CharSequence
/*     */     //   12: iconst_1
/*     */     //   13: anewarray java/lang/String
/*     */     //   16: astore #5
/*     */     //   18: aload #5
/*     */     //   20: iconst_0
/*     */     //   21: ldc '\\n'
/*     */     //   23: aastore
/*     */     //   24: aload #5
/*     */     //   26: iconst_0
/*     */     //   27: iconst_0
/*     */     //   28: bipush #6
/*     */     //   30: aconst_null
/*     */     //   31: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*     */     //   34: checkcast java/lang/Iterable
/*     */     //   37: astore #5
/*     */     //   39: iconst_0
/*     */     //   40: istore #6
/*     */     //   42: aload #5
/*     */     //   44: astore #7
/*     */     //   46: new java/util/ArrayList
/*     */     //   49: dup
/*     */     //   50: invokespecial <init> : ()V
/*     */     //   53: checkcast java/util/Collection
/*     */     //   56: astore #8
/*     */     //   58: iconst_0
/*     */     //   59: istore #9
/*     */     //   61: aload #7
/*     */     //   63: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   68: astore #10
/*     */     //   70: aload #10
/*     */     //   72: invokeinterface hasNext : ()Z
/*     */     //   77: ifeq -> 134
/*     */     //   80: aload #10
/*     */     //   82: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   87: astore #11
/*     */     //   89: aload #11
/*     */     //   91: checkcast java/lang/String
/*     */     //   94: astore #12
/*     */     //   96: iconst_0
/*     */     //   97: istore #13
/*     */     //   99: aload #12
/*     */     //   101: checkcast java/lang/CharSequence
/*     */     //   104: invokeinterface length : ()I
/*     */     //   109: ifle -> 116
/*     */     //   112: iconst_1
/*     */     //   113: goto -> 117
/*     */     //   116: iconst_0
/*     */     //   117: nop
/*     */     //   118: ifeq -> 70
/*     */     //   121: aload #8
/*     */     //   123: aload #11
/*     */     //   125: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   130: pop
/*     */     //   131: goto -> 70
/*     */     //   134: aload #8
/*     */     //   136: checkcast java/util/List
/*     */     //   139: nop
/*     */     //   140: astore #4
/*     */     //   142: aload #4
/*     */     //   144: checkcast java/lang/Iterable
/*     */     //   147: astore #5
/*     */     //   149: iconst_0
/*     */     //   150: istore #6
/*     */     //   152: aload #5
/*     */     //   154: astore #7
/*     */     //   156: new java/util/ArrayList
/*     */     //   159: dup
/*     */     //   160: invokespecial <init> : ()V
/*     */     //   163: checkcast java/util/Collection
/*     */     //   166: astore #8
/*     */     //   168: iconst_0
/*     */     //   169: istore #9
/*     */     //   171: aload #7
/*     */     //   173: astore #10
/*     */     //   175: iconst_0
/*     */     //   176: istore #11
/*     */     //   178: aload #10
/*     */     //   180: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   185: astore #12
/*     */     //   187: aload #12
/*     */     //   189: invokeinterface hasNext : ()Z
/*     */     //   194: ifeq -> 470
/*     */     //   197: aload #12
/*     */     //   199: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   204: astore #13
/*     */     //   206: aload #13
/*     */     //   208: astore #14
/*     */     //   210: iconst_0
/*     */     //   211: istore #15
/*     */     //   213: aload #14
/*     */     //   215: checkcast java/lang/String
/*     */     //   218: astore #16
/*     */     //   220: iconst_0
/*     */     //   221: istore #17
/*     */     //   223: aload #16
/*     */     //   225: checkcast java/lang/CharSequence
/*     */     //   228: iconst_1
/*     */     //   229: anewarray java/lang/String
/*     */     //   232: astore #18
/*     */     //   234: aload #18
/*     */     //   236: iconst_0
/*     */     //   237: ldc_w '::'
/*     */     //   240: aastore
/*     */     //   241: aload #18
/*     */     //   243: iconst_0
/*     */     //   244: iconst_0
/*     */     //   245: bipush #6
/*     */     //   247: aconst_null
/*     */     //   248: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*     */     //   251: astore #19
/*     */     //   253: aload #19
/*     */     //   255: invokeinterface size : ()I
/*     */     //   260: iconst_2
/*     */     //   261: if_icmpeq -> 268
/*     */     //   264: aconst_null
/*     */     //   265: goto -> 443
/*     */     //   268: aload #19
/*     */     //   270: iconst_0
/*     */     //   271: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   276: checkcast java/lang/String
/*     */     //   279: checkcast java/lang/CharSequence
/*     */     //   282: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   285: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   288: iconst_2
/*     */     //   289: newarray char
/*     */     //   291: astore #20
/*     */     //   293: aload #20
/*     */     //   295: iconst_0
/*     */     //   296: bipush #60
/*     */     //   298: castore
/*     */     //   299: aload #20
/*     */     //   301: iconst_1
/*     */     //   302: bipush #62
/*     */     //   304: castore
/*     */     //   305: aload #20
/*     */     //   307: invokestatic trim : (Ljava/lang/String;[C)Ljava/lang/String;
/*     */     //   310: astore #18
/*     */     //   312: aload #19
/*     */     //   314: iconst_1
/*     */     //   315: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   320: checkcast java/lang/String
/*     */     //   323: checkcast java/lang/CharSequence
/*     */     //   326: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   329: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   332: invokestatic removeLineRange : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   335: astore #20
/*     */     //   337: aload_2
/*     */     //   338: aload #18
/*     */     //   340: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   345: checkcast java/util/Map
/*     */     //   348: dup
/*     */     //   349: ifnull -> 440
/*     */     //   352: invokeinterface entrySet : ()Ljava/util/Set;
/*     */     //   357: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   362: astore #21
/*     */     //   364: aload #21
/*     */     //   366: invokeinterface hasNext : ()Z
/*     */     //   371: ifeq -> 436
/*     */     //   374: aload #21
/*     */     //   376: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   381: checkcast java/util/Map$Entry
/*     */     //   384: astore #22
/*     */     //   386: iconst_0
/*     */     //   387: istore #23
/*     */     //   389: aload #22
/*     */     //   391: invokeinterface getKey : ()Ljava/lang/Object;
/*     */     //   396: checkcast java/lang/CharSequence
/*     */     //   399: aload #20
/*     */     //   401: checkcast java/lang/CharSequence
/*     */     //   404: iconst_0
/*     */     //   405: iconst_2
/*     */     //   406: aconst_null
/*     */     //   407: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   410: ifeq -> 423
/*     */     //   413: aload #22
/*     */     //   415: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   420: goto -> 424
/*     */     //   423: aconst_null
/*     */     //   424: astore #22
/*     */     //   426: aload #22
/*     */     //   428: ifnull -> 364
/*     */     //   431: aload #22
/*     */     //   433: goto -> 442
/*     */     //   436: aconst_null
/*     */     //   437: goto -> 442
/*     */     //   440: pop
/*     */     //   441: aconst_null
/*     */     //   442: nop
/*     */     //   443: dup
/*     */     //   444: ifnull -> 465
/*     */     //   447: astore #24
/*     */     //   449: iconst_0
/*     */     //   450: istore #25
/*     */     //   452: aload #8
/*     */     //   454: aload #24
/*     */     //   456: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   461: pop
/*     */     //   462: goto -> 466
/*     */     //   465: pop
/*     */     //   466: nop
/*     */     //   467: goto -> 187
/*     */     //   470: nop
/*     */     //   471: aload #8
/*     */     //   473: checkcast java/util/List
/*     */     //   476: nop
/*     */     //   477: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #89	-> 0
/*     */     //   #90	-> 8
/*     */     //   #150	-> 42
/*     */     //   #151	-> 61
/*     */     //   #90	-> 99
/*     */     //   #90	-> 117
/*     */     //   #151	-> 118
/*     */     //   #152	-> 134
/*     */     //   #150	-> 139
/*     */     //   #90	-> 140
/*     */     //   #91	-> 142
/*     */     //   #153	-> 152
/*     */     //   #161	-> 171
/*     */     //   #162	-> 178
/*     */     //   #161	-> 213
/*     */     //   #92	-> 223
/*     */     //   #93	-> 253
/*     */     //   #95	-> 268
/*     */     //   #95	-> 288
/*     */     //   #96	-> 312
/*     */     //   #96	-> 332
/*     */     //   #97	-> 337
/*     */     //   #98	-> 389
/*     */     //   #97	-> 424
/*     */     //   #97	-> 440
/*     */     //   #99	-> 442
/*     */     //   #161	-> 443
/*     */     //   #163	-> 449
/*     */     //   #161	-> 452
/*     */     //   #161	-> 462
/*     */     //   #161	-> 465
/*     */     //   #162	-> 466
/*     */     //   #164	-> 470
/*     */     //   #165	-> 471
/*     */     //   #153	-> 476
/*     */     //   #91	-> 477
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   99	19	13	$i$a$-filter-RelevantSymbolsOrderedExtractor$extractAnswer$processedContent$1	I
/*     */     //   96	22	12	it	Ljava/lang/String;
/*     */     //   89	42	11	element$iv$iv	Ljava/lang/Object;
/*     */     //   61	75	9	$i$f$filterTo	I
/*     */     //   58	78	7	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   58	78	8	destination$iv$iv	Ljava/util/Collection;
/*     */     //   42	98	6	$i$f$filter	I
/*     */     //   39	101	5	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   389	35	23	$i$a$-firstNotNullOfOrNull-RelevantSymbolsOrderedExtractor$extractAnswer$1$1	I
/*     */     //   386	38	22	it	Ljava/util/Map$Entry;
/*     */     //   223	220	17	$i$a$-mapNotNull-RelevantSymbolsOrderedExtractor$extractAnswer$1	I
/*     */     //   253	190	19	parts	Ljava/util/List;
/*     */     //   312	131	18	filePath	Ljava/lang/String;
/*     */     //   337	106	20	presentation	Ljava/lang/String;
/*     */     //   220	223	16	entry	Ljava/lang/String;
/*     */     //   452	10	25	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
/*     */     //   449	13	24	it$iv$iv	Ljava/lang/Object;
/*     */     //   213	253	15	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*     */     //   210	256	14	element$iv$iv	Ljava/lang/Object;
/*     */     //   206	261	13	element$iv$iv$iv	Ljava/lang/Object;
/*     */     //   178	293	11	$i$f$forEach	I
/*     */     //   175	296	10	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
/*     */     //   171	302	9	$i$f$mapNotNullTo	I
/*     */     //   168	305	7	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   168	305	8	destination$iv$iv	Ljava/util/Collection;
/*     */     //   152	325	6	$i$f$mapNotNull	I
/*     */     //   149	328	5	$this$mapNotNull$iv	Ljava/lang/Iterable;
/*     */     //   8	470	3	rawContent	Ljava/lang/String;
/*     */     //   142	336	4	processedContent	Ljava/util/List;
/*     */     //   0	478	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor;
/*     */     //   0	478	1	$this$extractAnswer	Ljava/lang/String;
/*     */     //   0	478	2	symbolMap	Ljava/util/Map;
/*     */   }
/*     */   
/*     */   private final String getSymbolOrderingPrompt(AgentIssue issue, String symbols, int maxSymbols) {
/*     */     return "\n<issue_description>\n" + issue + "\n</issue_description>\n\n<instruction>\nAs a first step find which symbols (classes, methods/functions) could be related to this <issue_description>.\n\"Related\" means symbols containing code that might be helpful for inspection or editing to resolve the issue. This includes both code that is directly connected to the issue and code that could potentially be relevant.\nRank all the provided symbols, placing the most relevant ones at the top of the list.\nList up to " + maxSymbols + " of these ranked symbols, with each symbol on a separate line.\nTry to chose methods, use classes only if you could not find proper method inside this class.\nUse ONLY data, provided as <repo_data>. Use the same format for final ranking as format of REPO DATA.  \nProvide final ranking in XML format (tag \"ranked_symbols\").\n\n```xml\n<ranked_symbols>\nfile_path1:: def method1(parameters) (line method start-line method end)\nfile_path2:: class class1(base_class) (line class start-line class end)\nfile_path3:: class class2(base_class) def method2(parameters) (line method start-line method end)\n...\n</ranked_symbols>\n```\n</instruction>\n\nBelow is a structure of repository with symbols (classes, methods, etc) in the following format:\n<file_path>:: <method>(<parameters>) (<line method start>-<line method end>)\n<file_path>:: <class_name>(<base_classes>) (<line class start>-<line class end>) \n<file_path>:: <class_name>(<base_classes>) def <method>(<parameters>) (<line method start>-<line method end>)\n...\n\nWhere:  \n - <file_path> is the path to the file containing the class.  \n - <class_name> is the name of the class.  \n - <base_classes> is the name of the classes that the current class inherits from.  \n - def <method> is a method.  \n - <parameters> is list of parameters of method.\n - if class exists in a row before methods it means that method belongs to this class. \n - if class not mentioned before methods it means standalone method.\n\n<repo_data>\n" + symbols + "\n</repo_data>\n";
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\extractors\RelevantSymbolsOrderedExtractor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */