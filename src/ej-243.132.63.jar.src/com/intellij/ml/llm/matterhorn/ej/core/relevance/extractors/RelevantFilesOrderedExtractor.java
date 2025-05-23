/*     */ package com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors;
/*     */ 
/*     */ import com.intellij.psi.SmartPsiElementPointer;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.coroutines.Continuation;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\020$\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J:\020\b\032\024\022\020\022\016\022\006\b\001\022\0020\0130\nj\002`\f0\t2\030\020\r\032\024\022\020\022\016\022\006\b\001\022\0020\0130\nj\002`\f0\tH@¢\006\002\020\016J>\020\017\032\024\022\020\022\016\022\006\b\001\022\0020\0130\nj\002`\f0\t*\0020\0202\036\020\021\032\032\022\004\022\0020\020\022\020\022\016\022\006\b\001\022\0020\0130\nj\002`\f0\022H\002J8\020\023\032\0020\0202\006\020\024\032\0020\0252\036\020\026\032\032\022\004\022\0020\020\022\020\022\016\022\006\b\001\022\0020\0130\nj\002`\f0\0222\006\020\027\032\0020\030H\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor;", "", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;)V", "getContext", "()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;", "extract", "", "Lcom/intellij/psi/SmartPsiElementPointer;", "Lcom/intellij/psi/PsiFile;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/PsiFilePointer;", "elements", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extractAnswer", "", "fileMap", "", "getFileOrderingPrompt", "issue", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "filePaths", "maxFiles", "", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nRelevantFilesOrderedExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelevantFilesOrderedExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1872#2,3:102\n1557#2:105\n1628#2,3:106\n774#2:109\n865#2,2:110\n1611#2,9:112\n1863#2:121\n1864#2:123\n1620#2:124\n1611#2,9:125\n1863#2:134\n1864#2:136\n1620#2:137\n1557#2:138\n1628#2,3:139\n1611#2,9:142\n1863#2:151\n1864#2:153\n1620#2:154\n1#3:122\n1#3:135\n1#3:152\n*S KotlinDebug\n*F\n+ 1 RelevantFilesOrderedExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor\n*L\n52#1:102,3\n70#1:105\n70#1:106,3\n70#1:109\n70#1:110,2\n71#1:112,9\n71#1:121\n71#1:123\n71#1:124\n22#1:125,9\n22#1:134\n22#1:136\n22#1:137\n59#1:138\n59#1:139,3\n63#1:142,9\n63#1:151\n63#1:153\n63#1:154\n71#1:122\n22#1:135\n63#1:152\n*E\n"})
/*     */ public final class RelevantFilesOrderedExtractor {
/*     */   @NotNull
/*     */   private final RelevantSymbolsExtractorContext context;
/*     */   
/*  14 */   public RelevantFilesOrderedExtractor(@NotNull RelevantSymbolsExtractorContext context) { this.context = context; } @NotNull public final RelevantSymbolsExtractorContext getContext() { return this.context; } @Nullable public final Object extract(@NotNull List elements, @NotNull Continuation $completion) { // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor$extract$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor$extract$1
/*     */     //   11: astore #32
/*     */     //   13: aload #32
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #32
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor$extract$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #32
/*     */     //   50: aload #32
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #31
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #33
/*     */     //   62: aload #32
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 998, 0 -> 104, 1 -> 152, 2 -> 345, 3 -> 637, 4 -> 809, 5 -> 977
/*     */     //   104: aload #31
/*     */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   109: invokestatic currentTimeMillis : ()J
/*     */     //   112: lstore_3
/*     */     //   113: aload_1
/*     */     //   114: aload_0
/*     */     //   115: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor;)Lkotlin/jvm/functions/Function0;
/*     */     //   120: aload #32
/*     */     //   122: aload #32
/*     */     //   124: aload_0
/*     */     //   125: putfield L$0 : Ljava/lang/Object;
/*     */     //   128: aload #32
/*     */     //   130: lload_3
/*     */     //   131: putfield J$0 : J
/*     */     //   134: aload #32
/*     */     //   136: iconst_1
/*     */     //   137: putfield label : I
/*     */     //   140: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   143: dup
/*     */     //   144: aload #33
/*     */     //   146: if_acmpne -> 174
/*     */     //   149: aload #33
/*     */     //   151: areturn
/*     */     //   152: aload #32
/*     */     //   154: getfield J$0 : J
/*     */     //   157: lstore_3
/*     */     //   158: aload #32
/*     */     //   160: getfield L$0 : Ljava/lang/Object;
/*     */     //   163: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor
/*     */     //   166: astore_0
/*     */     //   167: aload #31
/*     */     //   169: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   172: aload #31
/*     */     //   174: checkcast java/util/Map
/*     */     //   177: astore #5
/*     */     //   179: aload #5
/*     */     //   181: invokeinterface isEmpty : ()Z
/*     */     //   186: ifeq -> 193
/*     */     //   189: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   192: areturn
/*     */     //   193: aload_0
/*     */     //   194: aload_0
/*     */     //   195: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   198: invokevirtual getIssue : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   201: aload #5
/*     */     //   203: aload_0
/*     */     //   204: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   207: invokevirtual getParameters : ()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   210: invokevirtual getMaxAnswersRelevantFiles : ()I
/*     */     //   213: invokespecial getFileOrderingPrompt : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Ljava/util/Map;I)Ljava/lang/String;
/*     */     //   216: astore #6
/*     */     //   218: new com/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest
/*     */     //   221: dup
/*     */     //   222: ldc 'SETTING: Your role is a coding assistant. You should help to solve the issue, described below.'
/*     */     //   224: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   227: dup
/*     */     //   228: aload #6
/*     */     //   230: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   233: aconst_null
/*     */     //   234: aconst_null
/*     */     //   235: bipush #12
/*     */     //   237: aconst_null
/*     */     //   238: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   241: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   244: aload_0
/*     */     //   245: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   248: invokevirtual getParameters : ()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   251: invokevirtual getModelParameters : ()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   254: aload_0
/*     */     //   255: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   258: invokevirtual getParameters : ()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   261: invokevirtual getNumResponsesRelevantFilesOrdered : ()I
/*     */     //   264: aconst_null
/*     */     //   265: new com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor$extract$request$1
/*     */     //   268: dup
/*     */     //   269: aconst_null
/*     */     //   270: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   273: checkcast kotlin/jvm/functions/Function3
/*     */     //   276: bipush #16
/*     */     //   278: aconst_null
/*     */     //   279: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ILjava/util/List;Lkotlin/jvm/functions/Function3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   282: astore #7
/*     */     //   284: aload_0
/*     */     //   285: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   288: invokevirtual getContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   291: aload #7
/*     */     //   293: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
/*     */     //   296: iconst_0
/*     */     //   297: aload #32
/*     */     //   299: iconst_2
/*     */     //   300: aconst_null
/*     */     //   301: aload #32
/*     */     //   303: aload_0
/*     */     //   304: putfield L$0 : Ljava/lang/Object;
/*     */     //   307: aload #32
/*     */     //   309: aload #5
/*     */     //   311: putfield L$1 : Ljava/lang/Object;
/*     */     //   314: aload #32
/*     */     //   316: aload #6
/*     */     //   318: putfield L$2 : Ljava/lang/Object;
/*     */     //   321: aload #32
/*     */     //   323: lload_3
/*     */     //   324: putfield J$0 : J
/*     */     //   327: aload #32
/*     */     //   329: iconst_2
/*     */     //   330: putfield label : I
/*     */     //   333: invokestatic sendToGrazie$default : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   336: dup
/*     */     //   337: aload #33
/*     */     //   339: if_acmpne -> 387
/*     */     //   342: aload #33
/*     */     //   344: areturn
/*     */     //   345: aload #32
/*     */     //   347: getfield J$0 : J
/*     */     //   350: lstore_3
/*     */     //   351: aload #32
/*     */     //   353: getfield L$2 : Ljava/lang/Object;
/*     */     //   356: checkcast java/lang/String
/*     */     //   359: astore #6
/*     */     //   361: aload #32
/*     */     //   363: getfield L$1 : Ljava/lang/Object;
/*     */     //   366: checkcast java/util/Map
/*     */     //   369: astore #5
/*     */     //   371: aload #32
/*     */     //   373: getfield L$0 : Ljava/lang/Object;
/*     */     //   376: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor
/*     */     //   379: astore_0
/*     */     //   380: aload #31
/*     */     //   382: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   385: aload #31
/*     */     //   387: checkcast java/lang/String
/*     */     //   390: astore #8
/*     */     //   392: new java/util/concurrent/ConcurrentHashMap
/*     */     //   395: dup
/*     */     //   396: invokespecial <init> : ()V
/*     */     //   399: astore #9
/*     */     //   401: aload #8
/*     */     //   403: invokestatic splitMultipleResponse : (Ljava/lang/String;)Ljava/util/List;
/*     */     //   406: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   411: astore #10
/*     */     //   413: aload #10
/*     */     //   415: invokeinterface hasNext : ()Z
/*     */     //   420: ifeq -> 583
/*     */     //   423: aload #10
/*     */     //   425: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   430: checkcast java/lang/String
/*     */     //   433: astore #11
/*     */     //   435: aload_0
/*     */     //   436: aload #11
/*     */     //   438: aload #5
/*     */     //   440: invokespecial extractAnswer : (Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;
/*     */     //   443: astore #12
/*     */     //   445: aload #12
/*     */     //   447: checkcast java/lang/Iterable
/*     */     //   450: astore #13
/*     */     //   452: iconst_0
/*     */     //   453: istore #14
/*     */     //   455: iconst_0
/*     */     //   456: istore #15
/*     */     //   458: aload #13
/*     */     //   460: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   465: astore #16
/*     */     //   467: aload #16
/*     */     //   469: invokeinterface hasNext : ()Z
/*     */     //   474: ifeq -> 579
/*     */     //   477: aload #16
/*     */     //   479: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   484: astore #17
/*     */     //   486: iload #15
/*     */     //   488: iinc #15, 1
/*     */     //   491: istore #18
/*     */     //   493: iload #18
/*     */     //   495: ifge -> 501
/*     */     //   498: invokestatic throwIndexOverflow : ()V
/*     */     //   501: iload #18
/*     */     //   503: aload #17
/*     */     //   505: checkcast com/intellij/psi/SmartPsiElementPointer
/*     */     //   508: astore #19
/*     */     //   510: istore #20
/*     */     //   512: iconst_0
/*     */     //   513: istore #21
/*     */     //   515: aload #9
/*     */     //   517: checkcast java/util/Map
/*     */     //   520: astore #22
/*     */     //   522: aload #9
/*     */     //   524: aload #19
/*     */     //   526: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   529: checkcast java/lang/Integer
/*     */     //   532: dup
/*     */     //   533: ifnull -> 542
/*     */     //   536: invokevirtual intValue : ()I
/*     */     //   539: goto -> 544
/*     */     //   542: pop
/*     */     //   543: iconst_0
/*     */     //   544: aload_0
/*     */     //   545: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   548: invokevirtual getParameters : ()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   551: invokevirtual getMaxAnswersRelevantFiles : ()I
/*     */     //   554: iadd
/*     */     //   555: iload #20
/*     */     //   557: isub
/*     */     //   558: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */     //   561: astore #23
/*     */     //   563: aload #22
/*     */     //   565: aload #19
/*     */     //   567: aload #23
/*     */     //   569: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   574: pop
/*     */     //   575: nop
/*     */     //   576: goto -> 467
/*     */     //   579: nop
/*     */     //   580: goto -> 413
/*     */     //   583: aload #9
/*     */     //   585: aload_0
/*     */     //   586: <illegal opcode> invoke : (Ljava/util/concurrent/ConcurrentHashMap;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor;)Lkotlin/jvm/functions/Function0;
/*     */     //   591: aload #32
/*     */     //   593: aload #32
/*     */     //   595: aload_0
/*     */     //   596: putfield L$0 : Ljava/lang/Object;
/*     */     //   599: aload #32
/*     */     //   601: aload #6
/*     */     //   603: putfield L$1 : Ljava/lang/Object;
/*     */     //   606: aload #32
/*     */     //   608: aload #8
/*     */     //   610: putfield L$2 : Ljava/lang/Object;
/*     */     //   613: aload #32
/*     */     //   615: lload_3
/*     */     //   616: putfield J$0 : J
/*     */     //   619: aload #32
/*     */     //   621: iconst_3
/*     */     //   622: putfield label : I
/*     */     //   625: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   628: dup
/*     */     //   629: aload #33
/*     */     //   631: if_acmpne -> 679
/*     */     //   634: aload #33
/*     */     //   636: areturn
/*     */     //   637: aload #32
/*     */     //   639: getfield J$0 : J
/*     */     //   642: lstore_3
/*     */     //   643: aload #32
/*     */     //   645: getfield L$2 : Ljava/lang/Object;
/*     */     //   648: checkcast java/lang/String
/*     */     //   651: astore #8
/*     */     //   653: aload #32
/*     */     //   655: getfield L$1 : Ljava/lang/Object;
/*     */     //   658: checkcast java/lang/String
/*     */     //   661: astore #6
/*     */     //   663: aload #32
/*     */     //   665: getfield L$0 : Ljava/lang/Object;
/*     */     //   668: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor
/*     */     //   671: astore_0
/*     */     //   672: aload #31
/*     */     //   674: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   677: aload #31
/*     */     //   679: checkcast java/util/List
/*     */     //   682: astore #10
/*     */     //   684: invokestatic currentTimeMillis : ()J
/*     */     //   687: lload_3
/*     */     //   688: lsub
/*     */     //   689: lstore #11
/*     */     //   691: aload_0
/*     */     //   692: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   695: invokevirtual getContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   698: ldc 'repomap_FindFiles'
/*     */     //   700: aload_0
/*     */     //   701: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   704: invokevirtual getParameters : ()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   707: ldc 'SETTING: Your role is a coding assistant. You should help to solve the issue, described below.'
/*     */     //   709: aload #6
/*     */     //   711: aload #8
/*     */     //   713: astore #29
/*     */     //   715: astore #28
/*     */     //   717: astore #27
/*     */     //   719: astore #26
/*     */     //   721: astore #25
/*     */     //   723: astore #24
/*     */     //   725: aload #10
/*     */     //   727: aload_0
/*     */     //   728: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor;)Lkotlin/jvm/functions/Function0;
/*     */     //   733: aload #32
/*     */     //   735: aload #32
/*     */     //   737: aload #10
/*     */     //   739: putfield L$0 : Ljava/lang/Object;
/*     */     //   742: aload #32
/*     */     //   744: aload #24
/*     */     //   746: putfield L$1 : Ljava/lang/Object;
/*     */     //   749: aload #32
/*     */     //   751: aload #25
/*     */     //   753: putfield L$2 : Ljava/lang/Object;
/*     */     //   756: aload #32
/*     */     //   758: aload #26
/*     */     //   760: putfield L$3 : Ljava/lang/Object;
/*     */     //   763: aload #32
/*     */     //   765: aload #27
/*     */     //   767: putfield L$4 : Ljava/lang/Object;
/*     */     //   770: aload #32
/*     */     //   772: aload #28
/*     */     //   774: putfield L$5 : Ljava/lang/Object;
/*     */     //   777: aload #32
/*     */     //   779: aload #29
/*     */     //   781: putfield L$6 : Ljava/lang/Object;
/*     */     //   784: aload #32
/*     */     //   786: lload #11
/*     */     //   788: putfield J$0 : J
/*     */     //   791: aload #32
/*     */     //   793: iconst_4
/*     */     //   794: putfield label : I
/*     */     //   797: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   800: dup
/*     */     //   801: aload #33
/*     */     //   803: if_acmpne -> 893
/*     */     //   806: aload #33
/*     */     //   808: areturn
/*     */     //   809: aload #32
/*     */     //   811: getfield J$0 : J
/*     */     //   814: lstore #11
/*     */     //   816: aload #32
/*     */     //   818: getfield L$6 : Ljava/lang/Object;
/*     */     //   821: checkcast java/lang/String
/*     */     //   824: astore #29
/*     */     //   826: aload #32
/*     */     //   828: getfield L$5 : Ljava/lang/Object;
/*     */     //   831: checkcast java/lang/String
/*     */     //   834: astore #28
/*     */     //   836: aload #32
/*     */     //   838: getfield L$4 : Ljava/lang/Object;
/*     */     //   841: checkcast java/lang/String
/*     */     //   844: astore #27
/*     */     //   846: aload #32
/*     */     //   848: getfield L$3 : Ljava/lang/Object;
/*     */     //   851: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters
/*     */     //   854: astore #26
/*     */     //   856: aload #32
/*     */     //   858: getfield L$2 : Ljava/lang/Object;
/*     */     //   861: checkcast java/lang/String
/*     */     //   864: astore #25
/*     */     //   866: aload #32
/*     */     //   868: getfield L$1 : Ljava/lang/Object;
/*     */     //   871: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   874: astore #24
/*     */     //   876: aload #32
/*     */     //   878: getfield L$0 : Ljava/lang/Object;
/*     */     //   881: checkcast java/util/List
/*     */     //   884: astore #10
/*     */     //   886: aload #31
/*     */     //   888: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   891: aload #31
/*     */     //   893: astore #30
/*     */     //   895: aload #24
/*     */     //   897: aload #25
/*     */     //   899: aload #26
/*     */     //   901: aload #27
/*     */     //   903: aload #28
/*     */     //   905: aload #29
/*     */     //   907: aload #30
/*     */     //   909: checkcast java/lang/String
/*     */     //   912: lload #11
/*     */     //   914: aload #32
/*     */     //   916: aload #32
/*     */     //   918: aload #10
/*     */     //   920: putfield L$0 : Ljava/lang/Object;
/*     */     //   923: aload #32
/*     */     //   925: aconst_null
/*     */     //   926: putfield L$1 : Ljava/lang/Object;
/*     */     //   929: aload #32
/*     */     //   931: aconst_null
/*     */     //   932: putfield L$2 : Ljava/lang/Object;
/*     */     //   935: aload #32
/*     */     //   937: aconst_null
/*     */     //   938: putfield L$3 : Ljava/lang/Object;
/*     */     //   941: aload #32
/*     */     //   943: aconst_null
/*     */     //   944: putfield L$4 : Ljava/lang/Object;
/*     */     //   947: aload #32
/*     */     //   949: aconst_null
/*     */     //   950: putfield L$5 : Ljava/lang/Object;
/*     */     //   953: aload #32
/*     */     //   955: aconst_null
/*     */     //   956: putfield L$6 : Ljava/lang/Object;
/*     */     //   959: aload #32
/*     */     //   961: iconst_5
/*     */     //   962: putfield label : I
/*     */     //   965: invokestatic logTrajectories : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   968: dup
/*     */     //   969: aload #33
/*     */     //   971: if_acmpne -> 994
/*     */     //   974: aload #33
/*     */     //   976: areturn
/*     */     //   977: aload #32
/*     */     //   979: getfield L$0 : Ljava/lang/Object;
/*     */     //   982: checkcast java/util/List
/*     */     //   985: astore #10
/*     */     //   987: aload #31
/*     */     //   989: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   992: aload #31
/*     */     //   994: pop
/*     */     //   995: aload #10
/*     */     //   997: areturn
/*     */     //   998: new java/lang/IllegalStateException
/*     */     //   1001: dup
/*     */     //   1002: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1005: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1008: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #16	-> 60
/*     */     //   #17	-> 109
/*     */     //   #21	-> 113
/*     */     //   #16	-> 149
/*     */     //   #31	-> 179
/*     */     //   #33	-> 193
/*     */     //   #34	-> 194
/*     */     //   #35	-> 201
/*     */     //   #36	-> 203
/*     */     //   #33	-> 213
/*     */     //   #39	-> 218
/*     */     //   #40	-> 222
/*     */     //   #41	-> 224
/*     */     //   #42	-> 244
/*     */     //   #43	-> 254
/*     */     //   #39	-> 264
/*     */     //   #47	-> 284
/*     */     //   #16	-> 342
/*     */     //   #49	-> 392
/*     */     //   #50	-> 401
/*     */     //   #51	-> 435
/*     */     //   #52	-> 445
/*     */     //   #102	-> 455
/*     */     //   #103	-> 458
/*     */     //   #103	-> 503
/*     */     //   #53	-> 515
/*     */     //   #54	-> 575
/*     */     //   #103	-> 576
/*     */     //   #104	-> 579
/*     */     //   #57	-> 583
/*     */     //   #16	-> 634
/*     */     //   #61	-> 684
/*     */     //   #62	-> 691
/*     */     //   #63	-> 707
/*     */     //   #16	-> 806
/*     */     //   #62	-> 916
/*     */     //   #16	-> 974
/*     */     //   #65	-> 994
/*     */     //   #16	-> 998
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   109	43	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor;
/*     */     //   167	178	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor;
/*     */     //   380	121	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor;
/*     */     //   501	136	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor;
/*     */     //   672	128	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor;
/*     */     //   109	34	1	elements	Ljava/util/List;
/*     */     //   113	39	3	startTime	J
/*     */     //   158	187	3	startTime	J
/*     */     //   351	150	3	startTime	J
/*     */     //   501	136	3	startTime	J
/*     */     //   643	48	3	startTime	J
/*     */     //   179	166	5	fileMap	Ljava/util/Map;
/*     */     //   371	130	5	fileMap	Ljava/util/Map;
/*     */     //   501	75	5	fileMap	Ljava/util/Map;
/*     */     //   576	4	5	fileMap	Ljava/util/Map;
/*     */     //   580	3	5	fileMap	Ljava/util/Map;
/*     */     //   218	127	6	prompt	Ljava/lang/String;
/*     */     //   361	140	6	prompt	Ljava/lang/String;
/*     */     //   501	136	6	prompt	Ljava/lang/String;
/*     */     //   663	137	6	prompt	Ljava/lang/String;
/*     */     //   284	52	7	request	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*     */     //   392	109	8	allResponses	Ljava/lang/String;
/*     */     //   501	136	8	allResponses	Ljava/lang/String;
/*     */     //   653	147	8	allResponses	Ljava/lang/String;
/*     */     //   401	100	9	extractedFiles	Ljava/util/concurrent/ConcurrentHashMap;
/*     */     //   501	75	9	extractedFiles	Ljava/util/concurrent/ConcurrentHashMap;
/*     */     //   576	4	9	extractedFiles	Ljava/util/concurrent/ConcurrentHashMap;
/*     */     //   580	48	9	extractedFiles	Ljava/util/concurrent/ConcurrentHashMap;
/*     */     //   684	125	10	result	Ljava/util/List;
/*     */     //   886	91	10	result	Ljava/util/List;
/*     */     //   987	11	10	result	Ljava/util/List;
/*     */     //   435	10	11	response	Ljava/lang/String;
/*     */     //   691	118	11	execTime	J
/*     */     //   816	100	11	execTime	J
/*     */     //   445	7	12	rankedFiles	Ljava/util/List;
/*     */     //   452	15	13	$this$forEachIndexed$iv	Ljava/lang/Iterable;
/*     */     //   458	43	15	index$iv	I
/*     */     //   501	79	15	index$iv	I
/*     */     //   486	15	17	item$iv	Ljava/lang/Object;
/*     */     //   501	11	17	item$iv	Ljava/lang/Object;
/*     */     //   512	64	19	file	Lcom/intellij/psi/SmartPsiElementPointer;
/*     */     //   512	64	20	index	I
/*     */     //   515	61	21	$i$a$-forEachIndexed-RelevantFilesOrderedExtractor$extract$2	I
/*     */     //   455	125	14	$i$f$forEachIndexed	I
/*     */     //   0	1009	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	948	32	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	941	31	$result	Ljava/lang/Object; } @DebugMetadata(f = "RelevantFilesOrderedExtractor.kt", l = {21, 47, 57, 63, 62}, i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 4}, s = {"L$0", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "J$0", "L$0"}, n = {"this", "startTime", "this", "fileMap", "prompt", "startTime", "this", "prompt", "allResponses", "startTime", "result", "execTime", "result"}, m = "extract", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.RelevantFilesOrderedExtractor") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RelevantFilesOrderedExtractor$extract$1 extends ContinuationImpl {
/*     */     Object L$0; Object L$1; Object L$2; Object L$3; Object L$4; Object L$5; Object L$6; long J$0; int label;
/*     */     RelevantFilesOrderedExtractor$extract$1(Continuation $completion) { super($completion); }
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RelevantFilesOrderedExtractor.this.extract(null, (Continuation<? super List<? extends SmartPsiElementPointer<? extends PsiFile>>>)this); } }
/*  22 */   private static final Map extract$lambda$1(List $elements, RelevantFilesOrderedExtractor this$0) { Iterable $this$mapNotNull$iv = $elements; int $i$f$mapNotNull = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     Iterable iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 133 */     Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 134 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; SmartPsiElementPointer it = (SmartPsiElementPointer)element$iv$iv;
/*     */       int $i$a$-mapNotNull-RelevantFilesOrderedExtractor$extract$fileMap$1$1 = 0; }
/*     */     
/* 137 */     return MapsKt.toMap(destination$iv$iv); } private static final List extract$lambda$6(ConcurrentHashMap $extractedFiles, RelevantFilesOrderedExtractor this$0) { Intrinsics.checkNotNullExpressionValue($extractedFiles.entrySet(), "<get-entries>(...)"); RelevantFilesOrderedExtractor$extract$lambda$6$$inlined$compareBy$1 relevantFilesOrderedExtractor$extract$lambda$6$$inlined$compareBy$1 = new RelevantFilesOrderedExtractor$extract$lambda$6$$inlined$compareBy$1(); List list1 = CollectionsKt.sortedWith($extractedFiles.entrySet(), new RelevantFilesOrderedExtractor$extract$lambda$6$$inlined$thenBy$1(relevantFilesOrderedExtractor$extract$lambda$6$$inlined$compareBy$1)); int $i$f$map = 0;
/* 138 */     List list2 = list1; Collection<SmartPsiElementPointer> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 139 */     for (Object item$iv$iv : list2) {
/* 140 */       Map.Entry entry = (Map.Entry)item$iv$iv; Collection<SmartPsiElementPointer> collection = destination$iv$iv; int $i$a$-map-RelevantFilesOrderedExtractor$extract$result$1$3 = 0; collection.add((SmartPsiElementPointer)entry.getKey());
/* 141 */     }  return CollectionsKt.take(destination$iv$iv, this$0.context.getParameters().getMaxRelevantFilesOrdered()); } @DebugMetadata(f = "RelevantFilesOrderedExtractor.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.RelevantFilesOrderedExtractor$extract$request$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\0042\f\020\005\032\b\022\004\022\0020\0020\001H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "<unused var>", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "optionsToRank"}) static final class RelevantFilesOrderedExtractor$extract$request$1 extends SuspendLambda implements Function3<ExecutionContext, List<? extends MatterhornChatElement>, Continuation<? super List<? extends MatterhornChatElement>>, Object> {
/* 142 */     int label; RelevantFilesOrderedExtractor$extract$request$1(Continuation $completion) { super(3, $completion); } public final Object invokeSuspend(Object $result) { List<? extends MatterhornChatElement> optionsToRank; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); optionsToRank = (List)this.L$0; return CollectionsKt.listOf(ExtractorUtilsKt.combineMultipleResponse(optionsToRank)); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invoke(ExecutionContext p1, List p2, Continuation<? super RelevantFilesOrderedExtractor$extract$request$1> p3) { RelevantFilesOrderedExtractor$extract$request$1 relevantFilesOrderedExtractor$extract$request$1 = new RelevantFilesOrderedExtractor$extract$request$1(p3); relevantFilesOrderedExtractor$extract$request$1.L$0 = p2; return relevantFilesOrderedExtractor$extract$request$1.invokeSuspend(Unit.INSTANCE); } } private static final String extract$lambda$8(List $result, RelevantFilesOrderedExtractor this$0) { Iterable $this$mapNotNull$iv = $result; int $i$f$mapNotNull = 0; Iterable iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 151 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; SmartPsiElementPointer it = (SmartPsiElementPointer)element$iv$iv;
/*     */       int $i$a$-mapNotNull-RelevantFilesOrderedExtractor$extract$3$1 = 0; }
/*     */     
/* 154 */     return CollectionsKt.joinToString$default(destination$iv$iv, "\n", null, null, 0, null, null, 62, null); }
/*     */ 
/*     */   
/*     */   private final List<SmartPsiElementPointer<? extends PsiFile>> extractAnswer(String $this$extractAnswer, Map fileMap) {
/*     */     String rawContent = ExtractorUtilsKt.getTextByXMLTag($this$extractAnswer, "ranked_files");
/*     */     String[] arrayOfString = new String[1];
/*     */     arrayOfString[0] = "\n";
/*     */     Iterable $this$map$iv = StringsKt.split$default(rawContent, arrayOfString, false, 0, 6, null);
/*     */     int $i$f$map = 0;
/*     */     Iterable iterable1 = $this$map$iv;
/*     */     Collection<String> collection1 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
/*     */     int $i$f$mapTo = 0;
/*     */     for (Object item$iv$iv : iterable1) {
/*     */       String str = (String)item$iv$iv;
/*     */       Collection<String> collection2 = collection1;
/*     */       int $i$a$-map-RelevantFilesOrderedExtractor$extractAnswer$processedContent$1 = 0;
/*     */       collection2.add(StringsKt.trim(str).toString());
/*     */     } 
/*     */     $this$map$iv = collection1;
/*     */     int $i$f$filter = 0;
/*     */     Iterable $this$mapTo$iv$iv = $this$map$iv;
/*     */     Collection<Object> collection = new ArrayList();
/*     */     int $i$f$filterTo = 0;
/*     */     for (Object element$iv$iv : $this$mapTo$iv$iv) {
/*     */       String it = (String)element$iv$iv;
/*     */       int $i$a$-filter-RelevantFilesOrderedExtractor$extractAnswer$processedContent$2 = 0;
/*     */       if ((((CharSequence)it).length() > 0))
/*     */         collection.add(element$iv$iv); 
/*     */     } 
/*     */     List processedContent = (List)collection;
/*     */     Iterable $this$mapNotNull$iv = processedContent;
/*     */     int $i$f$mapNotNull = 0;
/*     */     Iterable $this$filterTo$iv$iv = $this$mapNotNull$iv;
/*     */     Collection destination$iv$iv = new ArrayList();
/*     */     int $i$f$mapNotNullTo = 0;
/*     */     Iterable $this$forEach$iv$iv$iv = $this$filterTo$iv$iv;
/*     */     int $i$f$forEach = 0;
/*     */     Iterator iterator = $this$forEach$iv$iv$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv;
/*     */       int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0;
/*     */       String it = (String)element$iv$iv;
/*     */       int $i$a$-mapNotNull-RelevantFilesOrderedExtractor$extractAnswer$1 = 0;
/*     */     } 
/*     */     return (List<SmartPsiElementPointer<? extends PsiFile>>)destination$iv$iv;
/*     */   }
/*     */   
/*     */   private final String getFileOrderingPrompt(AgentIssue issue, Map filePaths, int maxFiles) {
/*     */     return "\n<issue_description>\n" + issue + "\n</issue_description>\n\n<instruction>\nAs a first step, find which files could be related to this <issue_description>. \n\"Related\" means files containing code that might be helpful for inspection or editing to resolve the issue. This includes both code that is directly connected to the issue and code that could potentially be relevant.\nRank all the provided files, placing the most relevant ones at the top of the list.\nList up to " + maxFiles + " of these ranked files, with each file on a separate line.\nUse ONLY data, provided as <repo_files>.\nUse XML format for your ranking (tag \"ranked_files\").\n\n```xml\n<ranked_files>\n  file_path1\n  file_path2\n  ...\n</ranked_files>\n```\n</instruction>\n\nBelow list of files in repository.\n<repo_files>\n" + CollectionsKt.joinToString$default(CollectionsKt.sorted(filePaths.keySet()), "\n", null, null, 0, null, null, 62, null) + "\n</repo_files>\n";
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\extractors\RelevantFilesOrderedExtractor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */