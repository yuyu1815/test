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
/*     */ import java.util.Map;
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
/*     */ @DebugMetadata(f = "RelevantSymbolsTaskExtractor.kt", l = {158}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020\"\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\020\000\032\024\022\020\022\016\022\006\b\001\022\0020\0030\002j\002`\0040\001*\0020\005H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/psi/SmartPsiElementPointer;", "Lcom/intellij/psi/PsiElement;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/PsiElementPointer;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nRelevantSymbolsTaskExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelevantSymbolsTaskExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n126#2:220\n153#2,3:221\n774#3:224\n865#3,2:225\n*S KotlinDebug\n*F\n+ 1 RelevantSymbolsTaskExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2\n*L\n110#1:220\n110#1:221,3\n158#1:224\n158#1:225,2\n*E\n"})
/*     */ final class RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Set<? extends SmartPsiElementPointer<? extends PsiElement>>>, Object> {
/*     */   int label;
/*     */   
/*     */   RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2(ProjectSearchAllService $searchElementsService, ProjectSearchEverywhereService $searchService, int $maxNumSearchFound, RelevantSymbolsTaskExtractor $receiver, Project $project, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore #20
/*     */     //   5: aload_0
/*     */     //   6: getfield label : I
/*     */     //   9: tableswitch default -> 380, 0 -> 32, 1 -> 253
/*     */     //   32: aload_1
/*     */     //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   36: aload_0
/*     */     //   37: getfield L$0 : Ljava/lang/Object;
/*     */     //   40: checkcast kotlinx/coroutines/CoroutineScope
/*     */     //   43: astore_2
/*     */     //   44: aload_0
/*     */     //   45: getfield $targetElement : Ljava/util/Map;
/*     */     //   48: astore_3
/*     */     //   49: aload_0
/*     */     //   50: getfield $searchElementsService : Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchAllService;
/*     */     //   53: astore #4
/*     */     //   55: aload_0
/*     */     //   56: getfield $searchService : Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService;
/*     */     //   59: astore #5
/*     */     //   61: aload_0
/*     */     //   62: getfield $maxNumSearchFound : I
/*     */     //   65: istore #6
/*     */     //   67: aload_0
/*     */     //   68: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */     //   71: astore #7
/*     */     //   73: aload_0
/*     */     //   74: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   77: astore #8
/*     */     //   79: iconst_0
/*     */     //   80: istore #9
/*     */     //   82: aload_3
/*     */     //   83: astore #10
/*     */     //   85: new java/util/ArrayList
/*     */     //   88: dup
/*     */     //   89: aload_3
/*     */     //   90: invokeinterface size : ()I
/*     */     //   95: invokespecial <init> : (I)V
/*     */     //   98: checkcast java/util/Collection
/*     */     //   101: astore #11
/*     */     //   103: iconst_0
/*     */     //   104: istore #12
/*     */     //   106: aload #10
/*     */     //   108: invokeinterface entrySet : ()Ljava/util/Set;
/*     */     //   113: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   118: astore #13
/*     */     //   120: aload #13
/*     */     //   122: invokeinterface hasNext : ()Z
/*     */     //   127: ifeq -> 223
/*     */     //   130: aload #13
/*     */     //   132: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   137: checkcast java/util/Map$Entry
/*     */     //   140: astore #14
/*     */     //   142: aload #11
/*     */     //   144: aload #14
/*     */     //   146: astore #15
/*     */     //   148: astore #19
/*     */     //   150: iconst_0
/*     */     //   151: istore #16
/*     */     //   153: aload #15
/*     */     //   155: invokeinterface getKey : ()Ljava/lang/Object;
/*     */     //   160: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$ElementType
/*     */     //   163: astore #17
/*     */     //   165: aload #15
/*     */     //   167: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   172: checkcast java/util/Set
/*     */     //   175: astore #18
/*     */     //   177: aload_2
/*     */     //   178: aconst_null
/*     */     //   179: aconst_null
/*     */     //   180: new com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1
/*     */     //   183: dup
/*     */     //   184: aload #17
/*     */     //   186: aload #18
/*     */     //   188: aload #4
/*     */     //   190: aload #5
/*     */     //   192: iload #6
/*     */     //   194: aload #7
/*     */     //   196: aload #8
/*     */     //   198: aconst_null
/*     */     //   199: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$ElementType;Ljava/util/Set;Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchAllService;Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService;ILcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)V
/*     */     //   202: checkcast kotlin/jvm/functions/Function2
/*     */     //   205: iconst_3
/*     */     //   206: aconst_null
/*     */     //   207: invokestatic async$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
/*     */     //   210: nop
/*     */     //   211: aload #19
/*     */     //   213: swap
/*     */     //   214: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   219: pop
/*     */     //   220: goto -> 120
/*     */     //   223: aload #11
/*     */     //   225: checkcast java/util/List
/*     */     //   228: nop
/*     */     //   229: checkcast java/util/Collection
/*     */     //   232: aload_0
/*     */     //   233: checkcast kotlin/coroutines/Continuation
/*     */     //   236: aload_0
/*     */     //   237: iconst_1
/*     */     //   238: putfield label : I
/*     */     //   241: invokestatic awaitAll : (Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   244: dup
/*     */     //   245: aload #20
/*     */     //   247: if_acmpne -> 258
/*     */     //   250: aload #20
/*     */     //   252: areturn
/*     */     //   253: aload_1
/*     */     //   254: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   257: aload_1
/*     */     //   258: checkcast java/lang/Iterable
/*     */     //   261: invokestatic flatten : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   264: checkcast java/lang/Iterable
/*     */     //   267: astore_3
/*     */     //   268: aload_0
/*     */     //   269: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */     //   272: astore #4
/*     */     //   274: iconst_0
/*     */     //   275: istore #5
/*     */     //   277: aload_3
/*     */     //   278: astore #6
/*     */     //   280: new java/util/ArrayList
/*     */     //   283: dup
/*     */     //   284: invokespecial <init> : ()V
/*     */     //   287: checkcast java/util/Collection
/*     */     //   290: astore #7
/*     */     //   292: iconst_0
/*     */     //   293: istore #8
/*     */     //   295: aload #6
/*     */     //   297: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   302: astore #9
/*     */     //   304: aload #9
/*     */     //   306: invokeinterface hasNext : ()Z
/*     */     //   311: ifeq -> 367
/*     */     //   314: aload #9
/*     */     //   316: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   321: astore #10
/*     */     //   323: aload #10
/*     */     //   325: checkcast com/intellij/psi/SmartPsiElementPointer
/*     */     //   328: astore #11
/*     */     //   330: iconst_0
/*     */     //   331: istore #12
/*     */     //   333: aload #4
/*     */     //   335: aload #11
/*     */     //   337: invokeinterface getVirtualFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   342: dup
/*     */     //   343: ldc 'getVirtualFile(...)'
/*     */     //   345: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   348: invokestatic access$isSuitable : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;Lcom/intellij/openapi/vfs/VirtualFile;)Z
/*     */     //   351: ifeq -> 304
/*     */     //   354: aload #7
/*     */     //   356: aload #10
/*     */     //   358: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   363: pop
/*     */     //   364: goto -> 304
/*     */     //   367: aload #7
/*     */     //   369: checkcast java/util/List
/*     */     //   372: nop
/*     */     //   373: checkcast java/lang/Iterable
/*     */     //   376: invokestatic toSet : (Ljava/lang/Iterable;)Ljava/util/Set;
/*     */     //   379: areturn
/*     */     //   380: new java/lang/IllegalStateException
/*     */     //   383: dup
/*     */     //   384: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   386: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   389: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #109	-> 3
/*     */     //   #110	-> 44
/*     */     //   #220	-> 82
/*     */     //   #221	-> 106
/*     */     //   #221	-> 118
/*     */     //   #222	-> 142
/*     */     //   #110	-> 153
/*     */     //   #110	-> 160
/*     */     //   #110	-> 172
/*     */     //   #111	-> 177
/*     */     //   #157	-> 210
/*     */     //   #222	-> 214
/*     */     //   #223	-> 223
/*     */     //   #220	-> 228
/*     */     //   #158	-> 236
/*     */     //   #109	-> 250
/*     */     //   #158	-> 258
/*     */     //   #224	-> 277
/*     */     //   #225	-> 295
/*     */     //   #158	-> 333
/*     */     //   #225	-> 351
/*     */     //   #226	-> 367
/*     */     //   #224	-> 372
/*     */     //   #158	-> 376
/*     */     //   #109	-> 380
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   44	167	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   211	12	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   79	24	3	$this$map$iv	Ljava/util/Map;
/*     */     //   274	18	3	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   292	12	6	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   292	77	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   103	15	10	$this$mapTo$iv$iv	Ljava/util/Map;
/*     */     //   323	41	10	element$iv$iv	Ljava/lang/Object;
/*     */     //   103	122	11	destination$iv$iv	Ljava/util/Collection;
/*     */     //   330	21	11	it	Lcom/intellij/psi/SmartPsiElementPointer;
/*     */     //   142	78	14	item$iv$iv	Ljava/util/Map$Entry;
/*     */     //   165	46	17	type	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$ElementType;
/*     */     //   177	34	18	values	Ljava/util/Set;
/*     */     //   153	58	16	$i$a$-map-RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1	I
/*     */     //   106	119	12	$i$f$mapTo	I
/*     */     //   82	147	9	$i$f$map	I
/*     */     //   333	18	12	$i$a$-filter-RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$2	I
/*     */     //   295	74	8	$i$f$filterTo	I
/*     */     //   277	96	5	$i$f$filter	I
/*     */     //   0	390	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2;
/*     */     //   36	344	1	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2> $completion) {
/*     */     RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2 relevantSymbolsTaskExtractor$searchForRelevantSymbols$2 = new RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2(this.$searchElementsService, this.$searchService, this.$maxNumSearchFound, RelevantSymbolsTaskExtractor.this, this.$project, $completion);
/*     */     relevantSymbolsTaskExtractor$searchForRelevantSymbols$2.L$0 = value;
/*     */     return (Continuation<Unit>)relevantSymbolsTaskExtractor$searchForRelevantSymbols$2;
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\extractors\RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */