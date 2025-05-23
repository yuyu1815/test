/*    */ package com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.relevance.RelevantSymbolsExtractorContext;
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J@\020\b\032\032\022\026\022\024\022\020\022\016\022\006\b\001\022\0020\0130\nj\002`\f0\t0\t2\030\020\r\032\024\022\020\022\016\022\006\b\001\022\0020\0160\nj\002`\0170\tH@¢\006\002\020\020R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantImportsExtractor;", "", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;)V", "getContext", "()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;", "extract", "", "Lcom/intellij/psi/SmartPsiElementPointer;", "Lcom/intellij/psi/PsiFile;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/PsiFilePointer;", "elements", "Lcom/intellij/psi/PsiElement;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/PsiElementPointer;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nRelevantImportsExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelevantImportsExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantImportsExtractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1611#2,9:31\n1863#2:40\n1864#2:42\n1620#2:43\n1557#2:44\n1628#2,2:45\n827#2:47\n855#2,2:48\n774#2:50\n865#2,2:51\n1630#2:53\n1557#2:54\n1628#2,2:55\n1557#2:57\n1628#2,3:58\n1#3:41\n*S KotlinDebug\n*F\n+ 1 RelevantImportsExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantImportsExtractor\n*L\n15#1:31,9\n15#1:40\n15#1:42\n15#1:43\n21#1:44\n21#1:45,2\n21#1:47\n21#1:48,2\n21#1:50\n21#1:51,2\n21#1:53\n27#1:54\n27#1:55,2\n27#1:57\n27#1:58,3\n15#1:41\n*E\n"})
/*    */ public final class RelevantImportsExtractor {
/* 10 */   public RelevantImportsExtractor(@NotNull RelevantSymbolsExtractorContext context) { this.context = context; } @NotNull private final RelevantSymbolsExtractorContext context; @NotNull public final RelevantSymbolsExtractorContext getContext() { return this.context; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final Object extract(@NotNull List elements, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*    */     //   4: invokevirtual getContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   7: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   10: aload_0
/*    */     //   11: aload_1
/*    */     //   12: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantImportsExtractor;Ljava/util/List;)Lkotlin/jvm/functions/Function0;
/*    */     //   17: aload_2
/*    */     //   18: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   21: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantImportsExtractor;
/*    */     //   0	22	1	elements	Ljava/util/List;
/*    */     //   0	22	2	$completion	Lkotlin/coroutines/Continuation;
/*    */   }
/*    */   
/*    */   private static final List extract$lambda$7(RelevantImportsExtractor this$0, List $elements) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*    */     //   4: invokevirtual getContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   7: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   10: invokestatic guessProjectDir : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   13: dup
/*    */     //   14: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   17: invokevirtual getPath : ()Ljava/lang/String;
/*    */     //   20: dup
/*    */     //   21: ldc 'getPath(...)'
/*    */     //   23: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   26: astore_2
/*    */     //   27: aload_1
/*    */     //   28: checkcast java/lang/Iterable
/*    */     //   31: astore #4
/*    */     //   33: iconst_0
/*    */     //   34: istore #5
/*    */     //   36: aload #4
/*    */     //   38: astore #6
/*    */     //   40: new java/util/ArrayList
/*    */     //   43: dup
/*    */     //   44: invokespecial <init> : ()V
/*    */     //   47: checkcast java/util/Collection
/*    */     //   50: astore #7
/*    */     //   52: iconst_0
/*    */     //   53: istore #8
/*    */     //   55: aload #6
/*    */     //   57: astore #9
/*    */     //   59: iconst_0
/*    */     //   60: istore #10
/*    */     //   62: aload #9
/*    */     //   64: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   69: astore #11
/*    */     //   71: aload #11
/*    */     //   73: invokeinterface hasNext : ()Z
/*    */     //   78: ifeq -> 141
/*    */     //   81: aload #11
/*    */     //   83: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   88: astore #12
/*    */     //   90: aload #12
/*    */     //   92: astore #13
/*    */     //   94: iconst_0
/*    */     //   95: istore #14
/*    */     //   97: aload #13
/*    */     //   99: checkcast com/intellij/psi/SmartPsiElementPointer
/*    */     //   102: astore #15
/*    */     //   104: iconst_0
/*    */     //   105: istore #16
/*    */     //   107: aload #15
/*    */     //   109: invokeinterface getContainingFile : ()Lcom/intellij/psi/PsiFile;
/*    */     //   114: dup
/*    */     //   115: ifnull -> 136
/*    */     //   118: astore #17
/*    */     //   120: iconst_0
/*    */     //   121: istore #18
/*    */     //   123: aload #7
/*    */     //   125: aload #17
/*    */     //   127: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   132: pop
/*    */     //   133: goto -> 137
/*    */     //   136: pop
/*    */     //   137: nop
/*    */     //   138: goto -> 71
/*    */     //   141: nop
/*    */     //   142: aload #7
/*    */     //   144: checkcast java/util/List
/*    */     //   147: nop
/*    */     //   148: checkcast java/lang/Iterable
/*    */     //   151: invokestatic toSet : (Ljava/lang/Iterable;)Ljava/util/Set;
/*    */     //   154: astore_3
/*    */     //   155: aload_3
/*    */     //   156: checkcast java/lang/Iterable
/*    */     //   159: invokestatic toMutableSet : (Ljava/lang/Iterable;)Ljava/util/Set;
/*    */     //   162: astore #4
/*    */     //   164: iconst_1
/*    */     //   165: anewarray java/util/Set
/*    */     //   168: astore #6
/*    */     //   170: aload #6
/*    */     //   172: iconst_0
/*    */     //   173: aload_3
/*    */     //   174: aastore
/*    */     //   175: aload #6
/*    */     //   177: invokestatic mutableListOf : ([Ljava/lang/Object;)Ljava/util/List;
/*    */     //   180: astore #5
/*    */     //   182: aload_0
/*    */     //   183: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*    */     //   186: invokevirtual getParameters : ()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*    */     //   189: invokevirtual getMaxImportDepthIteration : ()I
/*    */     //   192: istore #6
/*    */     //   194: iconst_0
/*    */     //   195: istore #7
/*    */     //   197: iload #7
/*    */     //   199: iload #6
/*    */     //   201: if_icmpge -> 576
/*    */     //   204: iload #7
/*    */     //   206: istore #8
/*    */     //   208: iconst_0
/*    */     //   209: istore #9
/*    */     //   211: aload #5
/*    */     //   213: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   216: checkcast java/lang/Iterable
/*    */     //   219: astore #10
/*    */     //   221: iconst_0
/*    */     //   222: istore #11
/*    */     //   224: aload #10
/*    */     //   226: astore #12
/*    */     //   228: new java/util/ArrayList
/*    */     //   231: dup
/*    */     //   232: aload #10
/*    */     //   234: bipush #10
/*    */     //   236: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   239: invokespecial <init> : (I)V
/*    */     //   242: checkcast java/util/Collection
/*    */     //   245: astore #13
/*    */     //   247: iconst_0
/*    */     //   248: istore #14
/*    */     //   250: aload #12
/*    */     //   252: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   257: astore #15
/*    */     //   259: aload #15
/*    */     //   261: invokeinterface hasNext : ()Z
/*    */     //   266: ifeq -> 526
/*    */     //   269: aload #15
/*    */     //   271: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   276: astore #16
/*    */     //   278: aload #13
/*    */     //   280: aload #16
/*    */     //   282: checkcast com/intellij/psi/PsiFile
/*    */     //   285: astore #17
/*    */     //   287: astore #18
/*    */     //   289: iconst_0
/*    */     //   290: istore #19
/*    */     //   292: getstatic com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$Companion;
/*    */     //   295: aload #17
/*    */     //   297: invokevirtual getImports : (Lcom/intellij/psi/PsiFile;)Ljava/util/List;
/*    */     //   300: checkcast java/lang/Iterable
/*    */     //   303: astore #20
/*    */     //   305: iconst_0
/*    */     //   306: istore #21
/*    */     //   308: aload #20
/*    */     //   310: astore #22
/*    */     //   312: new java/util/ArrayList
/*    */     //   315: dup
/*    */     //   316: invokespecial <init> : ()V
/*    */     //   319: checkcast java/util/Collection
/*    */     //   322: astore #23
/*    */     //   324: iconst_0
/*    */     //   325: istore #24
/*    */     //   327: aload #22
/*    */     //   329: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   334: astore #25
/*    */     //   336: aload #25
/*    */     //   338: invokeinterface hasNext : ()Z
/*    */     //   343: ifeq -> 390
/*    */     //   346: aload #25
/*    */     //   348: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   353: astore #26
/*    */     //   355: aload #26
/*    */     //   357: checkcast com/intellij/psi/PsiFile
/*    */     //   360: astore #27
/*    */     //   362: iconst_0
/*    */     //   363: istore #28
/*    */     //   365: aload #4
/*    */     //   367: aload #27
/*    */     //   369: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */     //   374: ifne -> 336
/*    */     //   377: aload #23
/*    */     //   379: aload #26
/*    */     //   381: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   386: pop
/*    */     //   387: goto -> 336
/*    */     //   390: aload #23
/*    */     //   392: checkcast java/util/List
/*    */     //   395: nop
/*    */     //   396: checkcast java/lang/Iterable
/*    */     //   399: astore #20
/*    */     //   401: nop
/*    */     //   402: iconst_0
/*    */     //   403: istore #21
/*    */     //   405: aload #20
/*    */     //   407: astore #22
/*    */     //   409: new java/util/ArrayList
/*    */     //   412: dup
/*    */     //   413: invokespecial <init> : ()V
/*    */     //   416: checkcast java/util/Collection
/*    */     //   419: astore #23
/*    */     //   421: iconst_0
/*    */     //   422: istore #24
/*    */     //   424: aload #22
/*    */     //   426: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   431: astore #25
/*    */     //   433: aload #25
/*    */     //   435: invokeinterface hasNext : ()Z
/*    */     //   440: ifeq -> 507
/*    */     //   443: aload #25
/*    */     //   445: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   450: astore #26
/*    */     //   452: aload #26
/*    */     //   454: checkcast com/intellij/psi/PsiFile
/*    */     //   457: astore #27
/*    */     //   459: iconst_0
/*    */     //   460: istore #28
/*    */     //   462: aload #27
/*    */     //   464: invokeinterface getVirtualFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   469: invokevirtual getPath : ()Ljava/lang/String;
/*    */     //   472: dup
/*    */     //   473: ldc 'getPath(...)'
/*    */     //   475: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   478: checkcast java/lang/CharSequence
/*    */     //   481: aload_2
/*    */     //   482: checkcast java/lang/CharSequence
/*    */     //   485: iconst_0
/*    */     //   486: iconst_2
/*    */     //   487: aconst_null
/*    */     //   488: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*    */     //   491: ifeq -> 433
/*    */     //   494: aload #23
/*    */     //   496: aload #26
/*    */     //   498: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   503: pop
/*    */     //   504: goto -> 433
/*    */     //   507: aload #23
/*    */     //   509: checkcast java/util/List
/*    */     //   512: nop
/*    */     //   513: nop
/*    */     //   514: aload #18
/*    */     //   516: swap
/*    */     //   517: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   522: pop
/*    */     //   523: goto -> 259
/*    */     //   526: aload #13
/*    */     //   528: checkcast java/util/List
/*    */     //   531: nop
/*    */     //   532: checkcast java/lang/Iterable
/*    */     //   535: invokestatic flatten : (Ljava/lang/Iterable;)Ljava/util/List;
/*    */     //   538: checkcast java/lang/Iterable
/*    */     //   541: invokestatic toSet : (Ljava/lang/Iterable;)Ljava/util/Set;
/*    */     //   544: astore #29
/*    */     //   546: aload #5
/*    */     //   548: aload #29
/*    */     //   550: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   555: pop
/*    */     //   556: aload #4
/*    */     //   558: aload #29
/*    */     //   560: checkcast java/util/Collection
/*    */     //   563: invokeinterface addAll : (Ljava/util/Collection;)Z
/*    */     //   568: pop
/*    */     //   569: nop
/*    */     //   570: iinc #7, 1
/*    */     //   573: goto -> 197
/*    */     //   576: aload #5
/*    */     //   578: checkcast java/lang/Iterable
/*    */     //   581: astore #6
/*    */     //   583: iconst_0
/*    */     //   584: istore #7
/*    */     //   586: aload #6
/*    */     //   588: astore #8
/*    */     //   590: new java/util/ArrayList
/*    */     //   593: dup
/*    */     //   594: aload #6
/*    */     //   596: bipush #10
/*    */     //   598: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   601: invokespecial <init> : (I)V
/*    */     //   604: checkcast java/util/Collection
/*    */     //   607: astore #9
/*    */     //   609: iconst_0
/*    */     //   610: istore #10
/*    */     //   612: aload #8
/*    */     //   614: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   619: astore #11
/*    */     //   621: aload #11
/*    */     //   623: invokeinterface hasNext : ()Z
/*    */     //   628: ifeq -> 771
/*    */     //   631: aload #11
/*    */     //   633: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   638: astore #12
/*    */     //   640: aload #9
/*    */     //   642: aload #12
/*    */     //   644: checkcast java/util/Set
/*    */     //   647: astore #13
/*    */     //   649: astore #30
/*    */     //   651: iconst_0
/*    */     //   652: istore #14
/*    */     //   654: aload #13
/*    */     //   656: checkcast java/lang/Iterable
/*    */     //   659: astore #15
/*    */     //   661: iconst_0
/*    */     //   662: istore #16
/*    */     //   664: aload #15
/*    */     //   666: astore #17
/*    */     //   668: new java/util/ArrayList
/*    */     //   671: dup
/*    */     //   672: aload #15
/*    */     //   674: bipush #10
/*    */     //   676: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   679: invokespecial <init> : (I)V
/*    */     //   682: checkcast java/util/Collection
/*    */     //   685: astore #18
/*    */     //   687: iconst_0
/*    */     //   688: istore #19
/*    */     //   690: aload #17
/*    */     //   692: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   697: astore #20
/*    */     //   699: aload #20
/*    */     //   701: invokeinterface hasNext : ()Z
/*    */     //   706: ifeq -> 752
/*    */     //   709: aload #20
/*    */     //   711: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   716: astore #21
/*    */     //   718: aload #18
/*    */     //   720: aload #21
/*    */     //   722: checkcast com/intellij/psi/PsiFile
/*    */     //   725: astore #22
/*    */     //   727: astore #23
/*    */     //   729: iconst_0
/*    */     //   730: istore #24
/*    */     //   732: aload #22
/*    */     //   734: checkcast com/intellij/psi/PsiElement
/*    */     //   737: invokestatic createSmartPointer : (Lcom/intellij/psi/PsiElement;)Lcom/intellij/psi/SmartPsiElementPointer;
/*    */     //   740: aload #23
/*    */     //   742: swap
/*    */     //   743: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   748: pop
/*    */     //   749: goto -> 699
/*    */     //   752: aload #18
/*    */     //   754: checkcast java/util/List
/*    */     //   757: nop
/*    */     //   758: nop
/*    */     //   759: aload #30
/*    */     //   761: swap
/*    */     //   762: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   767: pop
/*    */     //   768: goto -> 621
/*    */     //   771: aload #9
/*    */     //   773: checkcast java/util/List
/*    */     //   776: nop
/*    */     //   777: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 0
/*    */     //   #15	-> 27
/*    */     //   #31	-> 36
/*    */     //   #39	-> 55
/*    */     //   #40	-> 62
/*    */     //   #39	-> 97
/*    */     //   #15	-> 107
/*    */     //   #39	-> 114
/*    */     //   #41	-> 120
/*    */     //   #39	-> 123
/*    */     //   #39	-> 133
/*    */     //   #39	-> 136
/*    */     //   #40	-> 137
/*    */     //   #42	-> 141
/*    */     //   #43	-> 142
/*    */     //   #31	-> 147
/*    */     //   #15	-> 151
/*    */     //   #17	-> 155
/*    */     //   #18	-> 164
/*    */     //   #20	-> 182
/*    */     //   #21	-> 211
/*    */     //   #44	-> 224
/*    */     //   #45	-> 250
/*    */     //   #46	-> 278
/*    */     //   #21	-> 292
/*    */     //   #47	-> 308
/*    */     //   #48	-> 327
/*    */     //   #21	-> 365
/*    */     //   #48	-> 374
/*    */     //   #49	-> 390
/*    */     //   #47	-> 395
/*    */     //   #21	-> 401
/*    */     //   #50	-> 405
/*    */     //   #51	-> 424
/*    */     //   #21	-> 462
/*    */     //   #51	-> 491
/*    */     //   #52	-> 507
/*    */     //   #50	-> 512
/*    */     //   #21	-> 513
/*    */     //   #46	-> 517
/*    */     //   #53	-> 526
/*    */     //   #44	-> 531
/*    */     //   #21	-> 535
/*    */     //   #23	-> 546
/*    */     //   #24	-> 556
/*    */     //   #25	-> 569
/*    */     //   #20	-> 570
/*    */     //   #27	-> 576
/*    */     //   #54	-> 586
/*    */     //   #55	-> 612
/*    */     //   #56	-> 640
/*    */     //   #27	-> 654
/*    */     //   #57	-> 664
/*    */     //   #58	-> 690
/*    */     //   #59	-> 718
/*    */     //   #27	-> 732
/*    */     //   #59	-> 743
/*    */     //   #60	-> 752
/*    */     //   #57	-> 757
/*    */     //   #27	-> 758
/*    */     //   #56	-> 762
/*    */     //   #60	-> 771
/*    */     //   #54	-> 776
/*    */     //   #27	-> 777
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   107	7	16	$i$a$-mapNotNull-RelevantImportsExtractor$extract$2$initialFiles$1	I
/*    */     //   104	10	15	it	Lcom/intellij/psi/SmartPsiElementPointer;
/*    */     //   123	10	18	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
/*    */     //   120	13	17	it$iv$iv	Ljava/lang/Object;
/*    */     //   97	40	14	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*    */     //   94	43	13	element$iv$iv	Ljava/lang/Object;
/*    */     //   90	48	12	element$iv$iv$iv	Ljava/lang/Object;
/*    */     //   62	80	10	$i$f$forEach	I
/*    */     //   59	83	9	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
/*    */     //   55	89	8	$i$f$mapNotNullTo	I
/*    */     //   52	92	6	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   52	92	7	destination$iv$iv	Ljava/util/Collection;
/*    */     //   36	112	5	$i$f$mapNotNull	I
/*    */     //   33	115	4	$this$mapNotNull$iv	Ljava/lang/Iterable;
/*    */     //   365	9	28	$i$a$-filterNot-RelevantImportsExtractor$extract$2$1$nextFiles$1$1	I
/*    */     //   362	12	27	it	Lcom/intellij/psi/PsiFile;
/*    */     //   355	32	26	element$iv$iv	Ljava/lang/Object;
/*    */     //   327	65	24	$i$f$filterNotTo	I
/*    */     //   324	68	22	$this$filterNotTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   324	68	23	destination$iv$iv	Ljava/util/Collection;
/*    */     //   308	88	21	$i$f$filterNot	I
/*    */     //   305	91	20	$this$filterNot$iv	Ljava/lang/Iterable;
/*    */     //   462	29	28	$i$a$-filter-RelevantImportsExtractor$extract$2$1$nextFiles$1$2	I
/*    */     //   459	32	27	it	Lcom/intellij/psi/PsiFile;
/*    */     //   452	52	26	element$iv$iv	Ljava/lang/Object;
/*    */     //   424	85	24	$i$f$filterTo	I
/*    */     //   421	88	22	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   421	88	23	destination$iv$iv	Ljava/util/Collection;
/*    */     //   405	108	21	$i$f$filter	I
/*    */     //   402	111	20	$this$filter$iv	Ljava/lang/Iterable;
/*    */     //   292	222	19	$i$a$-map-RelevantImportsExtractor$extract$2$1$nextFiles$1	I
/*    */     //   289	225	17	file	Lcom/intellij/psi/PsiFile;
/*    */     //   278	245	16	item$iv$iv	Ljava/lang/Object;
/*    */     //   250	278	14	$i$f$mapTo	I
/*    */     //   247	281	12	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   247	281	13	destination$iv$iv	Ljava/util/Collection;
/*    */     //   224	308	11	$i$f$map	I
/*    */     //   221	311	10	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   211	359	9	$i$a$-repeat-RelevantImportsExtractor$extract$2$1	I
/*    */     //   546	24	29	nextFiles	Ljava/util/Set;
/*    */     //   208	362	8	it	I
/*    */     //   732	8	24	$i$a$-map-RelevantImportsExtractor$extract$2$2$1	I
/*    */     //   729	11	22	it	Lcom/intellij/psi/PsiFile;
/*    */     //   718	31	21	item$iv$iv	Ljava/lang/Object;
/*    */     //   690	64	19	$i$f$mapTo	I
/*    */     //   687	67	17	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   687	67	18	destination$iv$iv	Ljava/util/Collection;
/*    */     //   664	94	16	$i$f$map	I
/*    */     //   661	97	15	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   654	105	14	$i$a$-map-RelevantImportsExtractor$extract$2$2	I
/*    */     //   651	108	13	it	Ljava/util/Set;
/*    */     //   640	128	12	item$iv$iv	Ljava/lang/Object;
/*    */     //   612	161	10	$i$f$mapTo	I
/*    */     //   609	164	8	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   609	164	9	destination$iv$iv	Ljava/util/Collection;
/*    */     //   586	191	7	$i$f$map	I
/*    */     //   583	194	6	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   27	751	2	projDir	Ljava/lang/String;
/*    */     //   155	623	3	initialFiles	Ljava/util/Set;
/*    */     //   164	614	4	addedImports	Ljava/util/Set;
/*    */     //   182	596	5	importedFilesByIteration	Ljava/util/List;
/*    */     //   0	778	0	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantImportsExtractor;
/*    */     //   0	778	1	$elements	Ljava/util/List;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\extractors\RelevantImportsExtractor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */