/*     */ package com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.ProjectSearchEverywhereService;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.search.SearchResultItem;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.SmartPsiElementPointer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "RelevantSymbolsTaskExtractor.kt", l = {120, 125, 136}, i = {0}, s = {"I$0"}, n = {"line"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1$1$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\020\000\032\024\022\020\022\016\022\006\b\001\022\0020\0030\002j\002`\0040\001*\0020\005H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/psi/SmartPsiElementPointer;", "Lcom/intellij/psi/PsiElement;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/PsiElementPointer;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nRelevantSymbolsTaskExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelevantSymbolsTaskExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1611#2,9:220\n1863#2:229\n1864#2:231\n1620#2:232\n1611#2,9:233\n1863#2:242\n1864#2:244\n1620#2:245\n1#3:230\n1#3:243\n*S KotlinDebug\n*F\n+ 1 RelevantSymbolsTaskExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1$1$1\n*L\n141#1:220,9\n141#1:229\n141#1:231\n141#1:232\n126#1:233,9\n126#1:242\n126#1:244\n126#1:245\n141#1:230\n126#1:243\n*E\n"})
/*     */ final class RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1$1$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super List<? extends SmartPsiElementPointer<? extends PsiElement>>>, Object>
/*     */ {
/*     */   int I$0;
/*     */   int label;
/*     */   
/*     */   RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1$1$1(ProjectSearchEverywhereService $searchService, int $maxNumSearchFound, RelevantSymbolsTaskExtractor $receiver, Project $project, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore #19
/*     */     //   5: aload_0
/*     */     //   6: getfield label : I
/*     */     //   9: tableswitch default -> 466, 0 -> 40, 1 -> 182, 2 -> 252, 3 -> 319
/*     */     //   40: aload_1
/*     */     //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   44: aload_0
/*     */     //   45: getfield $it : Ljava/lang/String;
/*     */     //   48: checkcast java/lang/CharSequence
/*     */     //   51: iconst_1
/*     */     //   52: anewarray java/lang/String
/*     */     //   55: astore_3
/*     */     //   56: aload_3
/*     */     //   57: iconst_0
/*     */     //   58: ldc ':'
/*     */     //   60: aastore
/*     */     //   61: aload_3
/*     */     //   62: iconst_0
/*     */     //   63: iconst_0
/*     */     //   64: bipush #6
/*     */     //   66: aconst_null
/*     */     //   67: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*     */     //   70: astore_2
/*     */     //   71: aload_2
/*     */     //   72: invokeinterface size : ()I
/*     */     //   77: iconst_2
/*     */     //   78: if_icmpne -> 263
/*     */     //   81: aload_2
/*     */     //   82: iconst_1
/*     */     //   83: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   88: checkcast java/lang/String
/*     */     //   91: invokestatic toIntOrNull : (Ljava/lang/String;)Ljava/lang/Integer;
/*     */     //   94: ifnull -> 263
/*     */     //   97: aload_2
/*     */     //   98: iconst_0
/*     */     //   99: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   104: checkcast java/lang/String
/*     */     //   107: astore_3
/*     */     //   108: aload_2
/*     */     //   109: iconst_1
/*     */     //   110: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   115: checkcast java/lang/String
/*     */     //   118: invokestatic parseInt : (Ljava/lang/String;)I
/*     */     //   121: istore #4
/*     */     //   123: aload_0
/*     */     //   124: getfield $searchService : Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService;
/*     */     //   127: new com/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery
/*     */     //   130: dup
/*     */     //   131: aload_3
/*     */     //   132: aload_0
/*     */     //   133: getfield $maxNumSearchFound : I
/*     */     //   136: iconst_1
/*     */     //   137: iadd
/*     */     //   138: aload_0
/*     */     //   139: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */     //   142: invokestatic access$getSearchTimeout : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;)J
/*     */     //   145: aconst_null
/*     */     //   146: bipush #8
/*     */     //   148: aconst_null
/*     */     //   149: invokespecial <init> : (Ljava/lang/String;IJLcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   152: getstatic com/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType.FILES : Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;
/*     */     //   155: aload_0
/*     */     //   156: checkcast kotlin/coroutines/Continuation
/*     */     //   159: aload_0
/*     */     //   160: iload #4
/*     */     //   162: putfield I$0 : I
/*     */     //   165: aload_0
/*     */     //   166: iconst_1
/*     */     //   167: putfield label : I
/*     */     //   170: invokevirtual search : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   173: dup
/*     */     //   174: aload #19
/*     */     //   176: if_acmpne -> 193
/*     */     //   179: aload #19
/*     */     //   181: areturn
/*     */     //   182: aload_0
/*     */     //   183: getfield I$0 : I
/*     */     //   186: istore #4
/*     */     //   188: aload_1
/*     */     //   189: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   192: aload_1
/*     */     //   193: checkcast java/util/List
/*     */     //   196: astore #5
/*     */     //   198: aload #5
/*     */     //   200: invokeinterface size : ()I
/*     */     //   205: aload_0
/*     */     //   206: getfield $maxNumSearchFound : I
/*     */     //   209: if_icmple -> 218
/*     */     //   212: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   215: goto -> 465
/*     */     //   218: aload #5
/*     */     //   220: aload_0
/*     */     //   221: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   224: iload #4
/*     */     //   226: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/openapi/project/Project;I)Lkotlin/jvm/functions/Function0;
/*     */     //   231: aload_0
/*     */     //   232: checkcast kotlin/coroutines/Continuation
/*     */     //   235: aload_0
/*     */     //   236: iconst_2
/*     */     //   237: putfield label : I
/*     */     //   240: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   243: dup
/*     */     //   244: aload #19
/*     */     //   246: if_acmpne -> 257
/*     */     //   249: aload #19
/*     */     //   251: areturn
/*     */     //   252: aload_1
/*     */     //   253: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   256: aload_1
/*     */     //   257: checkcast java/util/List
/*     */     //   260: goto -> 465
/*     */     //   263: aload_0
/*     */     //   264: getfield $searchService : Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService;
/*     */     //   267: new com/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery
/*     */     //   270: dup
/*     */     //   271: aload_0
/*     */     //   272: getfield $it : Ljava/lang/String;
/*     */     //   275: aload_0
/*     */     //   276: getfield $maxNumSearchFound : I
/*     */     //   279: iconst_1
/*     */     //   280: iadd
/*     */     //   281: aload_0
/*     */     //   282: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */     //   285: invokestatic access$getSearchTimeout : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;)J
/*     */     //   288: aconst_null
/*     */     //   289: bipush #8
/*     */     //   291: aconst_null
/*     */     //   292: invokespecial <init> : (Ljava/lang/String;IJLcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   295: getstatic com/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType.FILES : Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;
/*     */     //   298: aload_0
/*     */     //   299: checkcast kotlin/coroutines/Continuation
/*     */     //   302: aload_0
/*     */     //   303: iconst_3
/*     */     //   304: putfield label : I
/*     */     //   307: invokevirtual search : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   310: dup
/*     */     //   311: aload #19
/*     */     //   313: if_acmpne -> 324
/*     */     //   316: aload #19
/*     */     //   318: areturn
/*     */     //   319: aload_1
/*     */     //   320: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   323: aload_1
/*     */     //   324: checkcast java/util/List
/*     */     //   327: astore_3
/*     */     //   328: aload_3
/*     */     //   329: invokeinterface size : ()I
/*     */     //   334: aload_0
/*     */     //   335: getfield $maxNumSearchFound : I
/*     */     //   338: if_icmple -> 347
/*     */     //   341: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   344: goto -> 465
/*     */     //   347: aload_3
/*     */     //   348: checkcast java/lang/Iterable
/*     */     //   351: astore #4
/*     */     //   353: iconst_0
/*     */     //   354: istore #5
/*     */     //   356: aload #4
/*     */     //   358: astore #6
/*     */     //   360: new java/util/ArrayList
/*     */     //   363: dup
/*     */     //   364: invokespecial <init> : ()V
/*     */     //   367: checkcast java/util/Collection
/*     */     //   370: astore #7
/*     */     //   372: iconst_0
/*     */     //   373: istore #8
/*     */     //   375: aload #6
/*     */     //   377: astore #9
/*     */     //   379: iconst_0
/*     */     //   380: istore #10
/*     */     //   382: aload #9
/*     */     //   384: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   389: astore #11
/*     */     //   391: aload #11
/*     */     //   393: invokeinterface hasNext : ()Z
/*     */     //   398: ifeq -> 458
/*     */     //   401: aload #11
/*     */     //   403: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   408: astore #12
/*     */     //   410: aload #12
/*     */     //   412: astore #13
/*     */     //   414: iconst_0
/*     */     //   415: istore #14
/*     */     //   417: aload #13
/*     */     //   419: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem
/*     */     //   422: astore #15
/*     */     //   424: iconst_0
/*     */     //   425: istore #16
/*     */     //   427: aload #15
/*     */     //   429: invokevirtual getPointer : ()Lcom/intellij/psi/SmartPsiElementPointer;
/*     */     //   432: dup
/*     */     //   433: ifnull -> 454
/*     */     //   436: astore #17
/*     */     //   438: iconst_0
/*     */     //   439: istore #18
/*     */     //   441: aload #7
/*     */     //   443: aload #17
/*     */     //   445: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   450: pop
/*     */     //   451: goto -> 455
/*     */     //   454: pop
/*     */     //   455: goto -> 391
/*     */     //   458: nop
/*     */     //   459: aload #7
/*     */     //   461: checkcast java/util/List
/*     */     //   464: nop
/*     */     //   465: areturn
/*     */     //   466: new java/lang/IllegalStateException
/*     */     //   469: dup
/*     */     //   470: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   472: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   475: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #114	-> 3
/*     */     //   #115	-> 44
/*     */     //   #116	-> 71
/*     */     //   #117	-> 97
/*     */     //   #118	-> 108
/*     */     //   #118	-> 121
/*     */     //   #120	-> 123
/*     */     //   #121	-> 127
/*     */     //   #122	-> 152
/*     */     //   #120	-> 159
/*     */     //   #114	-> 179
/*     */     //   #119	-> 196
/*     */     //   #124	-> 198
/*     */     //   #125	-> 218
/*     */     //   #114	-> 249
/*     */     //   #125	-> 257
/*     */     //   #136	-> 263
/*     */     //   #137	-> 267
/*     */     //   #138	-> 295
/*     */     //   #136	-> 302
/*     */     //   #114	-> 316
/*     */     //   #140	-> 328
/*     */     //   #141	-> 347
/*     */     //   #220	-> 356
/*     */     //   #228	-> 375
/*     */     //   #229	-> 382
/*     */     //   #228	-> 417
/*     */     //   #141	-> 427
/*     */     //   #228	-> 432
/*     */     //   #230	-> 438
/*     */     //   #228	-> 441
/*     */     //   #228	-> 451
/*     */     //   #228	-> 454
/*     */     //   #229	-> 455
/*     */     //   #231	-> 458
/*     */     //   #232	-> 459
/*     */     //   #220	-> 464
/*     */     //   #142	-> 465
/*     */     //   #114	-> 466
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   71	50	2	parts	Ljava/util/List;
/*     */     //   108	13	3	name	Ljava/lang/String;
/*     */     //   121	31	3	name	Ljava/lang/String;
/*     */     //   328	19	3	tmp	Ljava/util/List;
/*     */     //   347	6	3	tmp	Ljava/util/List;
/*     */     //   123	59	4	line	I
/*     */     //   188	30	4	line	I
/*     */     //   218	25	4	line	I
/*     */     //   353	19	4	$this$mapNotNull$iv	Ljava/lang/Iterable;
/*     */     //   198	20	5	tmp	Ljava/util/List;
/*     */     //   218	25	5	tmp	Ljava/util/List;
/*     */     //   372	7	6	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   372	60	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   432	29	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   379	12	9	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
/*     */     //   410	4	12	element$iv$iv$iv	Ljava/lang/Object;
/*     */     //   414	41	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   424	8	15	it	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;
/*     */     //   438	13	17	it$iv$iv	Ljava/lang/Object;
/*     */     //   427	5	16	$i$a$-mapNotNull-RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1$1$1$2	I
/*     */     //   441	10	18	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
/*     */     //   417	38	14	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*     */     //   382	77	10	$i$f$forEach	I
/*     */     //   375	86	8	$i$f$mapNotNullTo	I
/*     */     //   356	109	5	$i$f$mapNotNull	I
/*     */     //   0	476	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1$1$1;
/*     */     //   44	422	1	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1$1$1> $completion) {
/*     */     return (Continuation<Unit>)new RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1$1$1(this.$searchService, this.$maxNumSearchFound, RelevantSymbolsTaskExtractor.this, this.$project, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   private static final List invokeSuspend$lambda$2(List $tmp, Project $project, int $line) {
/* 126 */     Iterable $this$mapNotNull$iv = $tmp; int $i$f$mapNotNull = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 233 */     Iterable iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 241 */     Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 242 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; SearchResultItem occurrence = (SearchResultItem)element$iv$iv;
/*     */       int $i$a$-mapNotNull-RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1$1$1$1$1 = 0; }
/*     */     
/* 245 */     return (List)destination$iv$iv;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\extractors\RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */