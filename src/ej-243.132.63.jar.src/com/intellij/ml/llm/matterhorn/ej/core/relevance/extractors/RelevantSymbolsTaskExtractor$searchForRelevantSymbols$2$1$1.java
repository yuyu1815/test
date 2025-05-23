/*     */ package com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.ProjectSearchAllService;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.ProjectSearchEverywhereService;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.search.SearchResultItem;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.SmartPsiElementPointer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ 
/*     */ @DebugMetadata(f = "RelevantSymbolsTaskExtractor.kt", l = {144, 151}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\020\000\032\024\022\020\022\016\022\006\b\001\022\0020\0030\002j\002`\0040\001*\0020\005H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/psi/SmartPsiElementPointer;", "Lcom/intellij/psi/PsiElement;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/PsiElementPointer;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nRelevantSymbolsTaskExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelevantSymbolsTaskExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1557#2:220\n1628#2,3:221\n1557#2:224\n1628#2,3:225\n1611#2,9:231\n1863#2:240\n1864#2:242\n1620#2:243\n77#3:228\n97#3,2:229\n99#3,3:244\n1#4:241\n*S KotlinDebug\n*F\n+ 1 RelevantSymbolsTaskExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1\n*L\n113#1:220\n113#1:221,3\n147#1:224\n147#1:225,3\n153#1:231,9\n153#1:240\n153#1:242\n153#1:243\n151#1:228\n151#1:229,2\n151#1:244,3\n153#1:241\n*E\n"})
/*     */ final class RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SmartPsiElementPointer<? extends PsiElement>>>, Object> {
/*     */   int label;
/*     */   
/*     */   RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1(Set<String> $values, ProjectSearchAllService $searchElementsService, ProjectSearchEverywhereService $searchService, int $maxNumSearchFound, RelevantSymbolsTaskExtractor $receiver, Project $project, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore #30
/*     */     //   5: aload_0
/*     */     //   6: getfield label : I
/*     */     //   9: tableswitch default -> 672, 0 -> 36, 1 -> 237, 2 -> 417
/*     */     //   36: aload_1
/*     */     //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   40: aload_0
/*     */     //   41: getfield L$0 : Ljava/lang/Object;
/*     */     //   44: checkcast kotlinx/coroutines/CoroutineScope
/*     */     //   47: astore_2
/*     */     //   48: aload_0
/*     */     //   49: getfield $type : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$ElementType;
/*     */     //   52: getstatic com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   55: swap
/*     */     //   56: invokevirtual ordinal : ()I
/*     */     //   59: iaload
/*     */     //   60: iconst_1
/*     */     //   61: if_icmpne -> 251
/*     */     //   64: aload_0
/*     */     //   65: getfield $values : Ljava/util/Set;
/*     */     //   68: checkcast java/lang/Iterable
/*     */     //   71: astore_3
/*     */     //   72: aload_0
/*     */     //   73: getfield $searchService : Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService;
/*     */     //   76: astore #4
/*     */     //   78: aload_0
/*     */     //   79: getfield $maxNumSearchFound : I
/*     */     //   82: istore #5
/*     */     //   84: aload_0
/*     */     //   85: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */     //   88: astore #6
/*     */     //   90: aload_0
/*     */     //   91: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   94: astore #7
/*     */     //   96: iconst_0
/*     */     //   97: istore #8
/*     */     //   99: aload_3
/*     */     //   100: astore #9
/*     */     //   102: new java/util/ArrayList
/*     */     //   105: dup
/*     */     //   106: aload_3
/*     */     //   107: bipush #10
/*     */     //   109: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   112: invokespecial <init> : (I)V
/*     */     //   115: checkcast java/util/Collection
/*     */     //   118: astore #10
/*     */     //   120: iconst_0
/*     */     //   121: istore #11
/*     */     //   123: aload #9
/*     */     //   125: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   130: astore #12
/*     */     //   132: aload #12
/*     */     //   134: invokeinterface hasNext : ()Z
/*     */     //   139: ifeq -> 207
/*     */     //   142: aload #12
/*     */     //   144: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   149: astore #13
/*     */     //   151: aload #10
/*     */     //   153: aload #13
/*     */     //   155: checkcast java/lang/String
/*     */     //   158: astore #14
/*     */     //   160: astore #29
/*     */     //   162: iconst_0
/*     */     //   163: istore #15
/*     */     //   165: aload_2
/*     */     //   166: aconst_null
/*     */     //   167: aconst_null
/*     */     //   168: new com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1$1$1
/*     */     //   171: dup
/*     */     //   172: aload #14
/*     */     //   174: aload #4
/*     */     //   176: iload #5
/*     */     //   178: aload #6
/*     */     //   180: aload #7
/*     */     //   182: aconst_null
/*     */     //   183: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService;ILcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)V
/*     */     //   186: checkcast kotlin/jvm/functions/Function2
/*     */     //   189: iconst_3
/*     */     //   190: aconst_null
/*     */     //   191: invokestatic async$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
/*     */     //   194: nop
/*     */     //   195: aload #29
/*     */     //   197: swap
/*     */     //   198: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   203: pop
/*     */     //   204: goto -> 132
/*     */     //   207: aload #10
/*     */     //   209: checkcast java/util/List
/*     */     //   212: nop
/*     */     //   213: checkcast java/util/Collection
/*     */     //   216: aload_0
/*     */     //   217: checkcast kotlin/coroutines/Continuation
/*     */     //   220: aload_0
/*     */     //   221: iconst_1
/*     */     //   222: putfield label : I
/*     */     //   225: invokestatic awaitAll : (Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   228: dup
/*     */     //   229: aload #30
/*     */     //   231: if_acmpne -> 242
/*     */     //   234: aload #30
/*     */     //   236: areturn
/*     */     //   237: aload_1
/*     */     //   238: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   241: aload_1
/*     */     //   242: checkcast java/lang/Iterable
/*     */     //   245: invokestatic flatten : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   248: goto -> 671
/*     */     //   251: aload_0
/*     */     //   252: getfield $values : Ljava/util/Set;
/*     */     //   255: checkcast java/lang/Iterable
/*     */     //   258: astore #4
/*     */     //   260: aload_0
/*     */     //   261: getfield $maxNumSearchFound : I
/*     */     //   264: istore #5
/*     */     //   266: aload_0
/*     */     //   267: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */     //   270: astore #6
/*     */     //   272: iconst_0
/*     */     //   273: istore #7
/*     */     //   275: aload #4
/*     */     //   277: astore #8
/*     */     //   279: new java/util/ArrayList
/*     */     //   282: dup
/*     */     //   283: aload #4
/*     */     //   285: bipush #10
/*     */     //   287: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   290: invokespecial <init> : (I)V
/*     */     //   293: checkcast java/util/Collection
/*     */     //   296: astore #9
/*     */     //   298: iconst_0
/*     */     //   299: istore #10
/*     */     //   301: aload #8
/*     */     //   303: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   308: astore #11
/*     */     //   310: aload #11
/*     */     //   312: invokeinterface hasNext : ()Z
/*     */     //   317: ifeq -> 377
/*     */     //   320: aload #11
/*     */     //   322: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   327: astore #12
/*     */     //   329: aload #9
/*     */     //   331: aload #12
/*     */     //   333: checkcast java/lang/String
/*     */     //   336: astore #13
/*     */     //   338: astore #29
/*     */     //   340: iconst_0
/*     */     //   341: istore #14
/*     */     //   343: new com/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery
/*     */     //   346: dup
/*     */     //   347: aload #13
/*     */     //   349: iload #5
/*     */     //   351: iconst_1
/*     */     //   352: iadd
/*     */     //   353: aload #6
/*     */     //   355: invokestatic access$getSearchTimeout : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;)J
/*     */     //   358: aconst_null
/*     */     //   359: bipush #8
/*     */     //   361: aconst_null
/*     */     //   362: invokespecial <init> : (Ljava/lang/String;IJLcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   365: aload #29
/*     */     //   367: swap
/*     */     //   368: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   373: pop
/*     */     //   374: goto -> 310
/*     */     //   377: aload #9
/*     */     //   379: checkcast java/util/List
/*     */     //   382: nop
/*     */     //   383: checkcast java/lang/Iterable
/*     */     //   386: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   389: astore_3
/*     */     //   390: aload_0
/*     */     //   391: getfield $searchElementsService : Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchAllService;
/*     */     //   394: aload_3
/*     */     //   395: iconst_1
/*     */     //   396: aload_0
/*     */     //   397: checkcast kotlin/coroutines/Continuation
/*     */     //   400: aload_0
/*     */     //   401: iconst_2
/*     */     //   402: putfield label : I
/*     */     //   405: invokevirtual searchProject : (Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   408: dup
/*     */     //   409: aload #30
/*     */     //   411: if_acmpne -> 422
/*     */     //   414: aload #30
/*     */     //   416: areturn
/*     */     //   417: aload_1
/*     */     //   418: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   421: aload_1
/*     */     //   422: checkcast java/util/Map
/*     */     //   425: astore #4
/*     */     //   427: aload_0
/*     */     //   428: getfield $maxNumSearchFound : I
/*     */     //   431: istore #5
/*     */     //   433: iconst_0
/*     */     //   434: istore #6
/*     */     //   436: aload #4
/*     */     //   438: astore #7
/*     */     //   440: new java/util/ArrayList
/*     */     //   443: dup
/*     */     //   444: invokespecial <init> : ()V
/*     */     //   447: checkcast java/util/Collection
/*     */     //   450: astore #8
/*     */     //   452: iconst_0
/*     */     //   453: istore #9
/*     */     //   455: aload #7
/*     */     //   457: invokeinterface entrySet : ()Ljava/util/Set;
/*     */     //   462: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   467: astore #10
/*     */     //   469: aload #10
/*     */     //   471: invokeinterface hasNext : ()Z
/*     */     //   476: ifeq -> 665
/*     */     //   479: aload #10
/*     */     //   481: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   486: checkcast java/util/Map$Entry
/*     */     //   489: astore #11
/*     */     //   491: aload #11
/*     */     //   493: astore #12
/*     */     //   495: iconst_0
/*     */     //   496: istore #13
/*     */     //   498: aload #12
/*     */     //   500: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   505: checkcast java/util/List
/*     */     //   508: invokeinterface size : ()I
/*     */     //   513: iload #5
/*     */     //   515: if_icmple -> 524
/*     */     //   518: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   521: goto -> 648
/*     */     //   524: aload #12
/*     */     //   526: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   531: checkcast java/lang/Iterable
/*     */     //   534: astore #14
/*     */     //   536: iconst_0
/*     */     //   537: istore #15
/*     */     //   539: aload #14
/*     */     //   541: astore #16
/*     */     //   543: new java/util/ArrayList
/*     */     //   546: dup
/*     */     //   547: invokespecial <init> : ()V
/*     */     //   550: checkcast java/util/Collection
/*     */     //   553: astore #17
/*     */     //   555: iconst_0
/*     */     //   556: istore #18
/*     */     //   558: aload #16
/*     */     //   560: astore #19
/*     */     //   562: iconst_0
/*     */     //   563: istore #20
/*     */     //   565: aload #19
/*     */     //   567: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   572: astore #21
/*     */     //   574: aload #21
/*     */     //   576: invokeinterface hasNext : ()Z
/*     */     //   581: ifeq -> 641
/*     */     //   584: aload #21
/*     */     //   586: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   591: astore #22
/*     */     //   593: aload #22
/*     */     //   595: astore #23
/*     */     //   597: iconst_0
/*     */     //   598: istore #24
/*     */     //   600: aload #23
/*     */     //   602: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem
/*     */     //   605: astore #25
/*     */     //   607: iconst_0
/*     */     //   608: istore #26
/*     */     //   610: aload #25
/*     */     //   612: invokevirtual getPointer : ()Lcom/intellij/psi/SmartPsiElementPointer;
/*     */     //   615: dup
/*     */     //   616: ifnull -> 637
/*     */     //   619: astore #27
/*     */     //   621: iconst_0
/*     */     //   622: istore #28
/*     */     //   624: aload #17
/*     */     //   626: aload #27
/*     */     //   628: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   633: pop
/*     */     //   634: goto -> 638
/*     */     //   637: pop
/*     */     //   638: goto -> 574
/*     */     //   641: nop
/*     */     //   642: aload #17
/*     */     //   644: checkcast java/util/List
/*     */     //   647: nop
/*     */     //   648: checkcast java/lang/Iterable
/*     */     //   651: nop
/*     */     //   652: astore #12
/*     */     //   654: aload #8
/*     */     //   656: aload #12
/*     */     //   658: invokestatic addAll : (Ljava/util/Collection;Ljava/lang/Iterable;)Z
/*     */     //   661: pop
/*     */     //   662: goto -> 469
/*     */     //   665: aload #8
/*     */     //   667: checkcast java/util/List
/*     */     //   670: nop
/*     */     //   671: areturn
/*     */     //   672: new java/lang/IllegalStateException
/*     */     //   675: dup
/*     */     //   676: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   678: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   681: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #111	-> 3
/*     */     //   #112	-> 48
/*     */     //   #113	-> 60
/*     */     //   #220	-> 99
/*     */     //   #221	-> 123
/*     */     //   #222	-> 151
/*     */     //   #114	-> 165
/*     */     //   #143	-> 194
/*     */     //   #222	-> 198
/*     */     //   #223	-> 207
/*     */     //   #220	-> 212
/*     */     //   #144	-> 220
/*     */     //   #111	-> 234
/*     */     //   #144	-> 242
/*     */     //   #147	-> 251
/*     */     //   #224	-> 275
/*     */     //   #225	-> 301
/*     */     //   #226	-> 329
/*     */     //   #148	-> 343
/*     */     //   #226	-> 368
/*     */     //   #227	-> 377
/*     */     //   #224	-> 382
/*     */     //   #149	-> 386
/*     */     //   #147	-> 389
/*     */     //   #151	-> 390
/*     */     //   #111	-> 414
/*     */     //   #228	-> 436
/*     */     //   #229	-> 455
/*     */     //   #229	-> 467
/*     */     //   #230	-> 491
/*     */     //   #152	-> 498
/*     */     //   #153	-> 524
/*     */     //   #231	-> 539
/*     */     //   #239	-> 558
/*     */     //   #240	-> 565
/*     */     //   #239	-> 600
/*     */     //   #153	-> 610
/*     */     //   #239	-> 615
/*     */     //   #241	-> 621
/*     */     //   #239	-> 624
/*     */     //   #239	-> 634
/*     */     //   #239	-> 637
/*     */     //   #240	-> 638
/*     */     //   #242	-> 641
/*     */     //   #243	-> 642
/*     */     //   #231	-> 647
/*     */     //   #153	-> 651
/*     */     //   #230	-> 652
/*     */     //   #244	-> 654
/*     */     //   #246	-> 665
/*     */     //   #228	-> 670
/*     */     //   #156	-> 671
/*     */     //   #111	-> 672
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   48	147	2	$this$async	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   195	12	2	$this$async	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   96	24	3	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   390	18	3	searchQueries	Ljava/util/List;
/*     */     //   272	26	4	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   433	19	4	$this$flatMap$iv	Ljava/util/Map;
/*     */     //   452	15	7	$this$flatMapTo$iv$iv	Ljava/util/Map;
/*     */     //   298	12	8	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   452	215	8	destination$iv$iv	Ljava/util/Collection;
/*     */     //   120	12	9	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   298	81	9	destination$iv$iv	Ljava/util/Collection;
/*     */     //   120	89	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   491	4	11	element$iv$iv	Ljava/util/Map$Entry;
/*     */     //   329	45	12	item$iv$iv	Ljava/lang/Object;
/*     */     //   495	29	12	it	Ljava/util/Map$Entry;
/*     */     //   524	12	12	it	Ljava/util/Map$Entry;
/*     */     //   654	8	12	list$iv$iv	Ljava/lang/Iterable;
/*     */     //   151	53	13	item$iv$iv	Ljava/lang/Object;
/*     */     //   340	25	13	it	Ljava/lang/String;
/*     */     //   162	33	14	it	Ljava/lang/String;
/*     */     //   536	19	14	$this$mapNotNull$iv	Ljava/lang/Iterable;
/*     */     //   555	7	16	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   555	89	17	destination$iv$iv	Ljava/util/Collection;
/*     */     //   562	12	19	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
/*     */     //   593	4	22	element$iv$iv$iv	Ljava/lang/Object;
/*     */     //   597	41	23	element$iv$iv	Ljava/lang/Object;
/*     */     //   607	8	25	it	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;
/*     */     //   621	13	27	it$iv$iv	Ljava/lang/Object;
/*     */     //   165	30	15	$i$a$-map-RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1$1	I
/*     */     //   123	86	11	$i$f$mapTo	I
/*     */     //   99	114	8	$i$f$map	I
/*     */     //   343	22	14	$i$a$-map-RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1$searchQueries$1	I
/*     */     //   301	78	10	$i$f$mapTo	I
/*     */     //   275	108	7	$i$f$map	I
/*     */     //   610	5	26	$i$a$-mapNotNull-RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1$2$1	I
/*     */     //   624	10	28	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
/*     */     //   600	38	24	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*     */     //   565	77	20	$i$f$forEach	I
/*     */     //   558	86	18	$i$f$mapNotNullTo	I
/*     */     //   539	109	15	$i$f$mapNotNull	I
/*     */     //   498	154	13	$i$a$-flatMap-RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1$2	I
/*     */     //   455	212	9	$i$f$flatMapTo	I
/*     */     //   436	235	6	$i$f$flatMap	I
/*     */     //   0	682	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1;
/*     */     //   40	632	1	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1> $completion) {
/*     */     RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1 relevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1 = new RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1(this.$values, this.$searchElementsService, this.$searchService, this.$maxNumSearchFound, RelevantSymbolsTaskExtractor.this, this.$project, $completion);
/*     */     relevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1.L$0 = value;
/*     */     return (Continuation<Unit>)relevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1;
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\extractors\RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */