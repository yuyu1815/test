/*     */ package com.intellij.ml.llm.matterhorn.ej.core.services.search;
/*     */ 
/*     */ import com.intellij.find.FindModel;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.intellij.usageView.UsageInfo;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Job;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\030\000 \0222\0020\001:\001\022B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J$\020\006\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\n2\006\020\013\032\0020\fH@¢\006\002\020\rJ\"\020\016\032\b\022\004\022\0020\b0\0072\f\020\017\032\b\022\004\022\0020\0200\007H@¢\006\002\020\021¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher;", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractProjectSearcher;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "searchProject", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;", "query", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;", "disposable", "Lcom/intellij/openapi/Disposable;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/openapi/Disposable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareContent", "results", "Lcom/intellij/usageView/UsageInfo;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTextProjectSearcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextProjectSearcher.kt\ncom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,104:1\n1#2:105\n14#3:106\n*S KotlinDebug\n*F\n+ 1 TextProjectSearcher.kt\ncom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher\n*L\n29#1:106\n*E\n"})
/*     */ public final class TextProjectSearcher extends AbstractProjectSearcher {
/*  27 */   public TextProjectSearcher(@NotNull Project project) { super(project); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "ej-core"}) public static final class Companion {
/*     */     private Companion() {} } @NotNull
/*  29 */   public static final Companion Companion = new Companion(null); static { int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 106 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(TextProjectSearcher.class), "getInstance(...)"); } @Nullable protected Object searchProject(@NotNull SearchQuery query, @NotNull Disposable paramDisposable, @NotNull Continuation $completion) { // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher$searchProject$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher$searchProject$1
/*     */     //   11: astore #11
/*     */     //   13: aload #11
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #11
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher$searchProject$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #11
/*     */     //   50: aload #11
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #10
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #12
/*     */     //   62: aload #11
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 551, 0 -> 96, 1 -> 298, 2 -> 418, 3 -> 543
/*     */     //   96: aload #10
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: invokestatic ConcurrentSet : ()Ljava/util/Set;
/*     */     //   104: astore #4
/*     */     //   106: new com/intellij/find/FindModel
/*     */     //   109: dup
/*     */     //   110: invokespecial <init> : ()V
/*     */     //   113: astore #6
/*     */     //   115: aload #6
/*     */     //   117: astore #7
/*     */     //   119: iconst_0
/*     */     //   120: istore #8
/*     */     //   122: aload #7
/*     */     //   124: iconst_0
/*     */     //   125: invokevirtual setCaseSensitive : (Z)V
/*     */     //   128: aload #7
/*     */     //   130: iconst_0
/*     */     //   131: invokevirtual setRegularExpressions : (Z)V
/*     */     //   134: aload #7
/*     */     //   136: iconst_1
/*     */     //   137: invokevirtual setGlobal : (Z)V
/*     */     //   140: aload #7
/*     */     //   142: aload_1
/*     */     //   143: invokevirtual getQuery : ()Ljava/lang/String;
/*     */     //   146: invokevirtual setStringToFind : (Ljava/lang/String;)V
/*     */     //   149: aload #7
/*     */     //   151: iconst_0
/*     */     //   152: invokevirtual setFromCursor : (Z)V
/*     */     //   155: aload #7
/*     */     //   157: iconst_1
/*     */     //   158: invokevirtual setMultipleFiles : (Z)V
/*     */     //   161: aload #7
/*     */     //   163: iconst_1
/*     */     //   164: invokevirtual setSearchInProjectFiles : (Z)V
/*     */     //   167: aload #7
/*     */     //   169: getstatic com/intellij/find/FindModel$SearchContext.ANY : Lcom/intellij/find/FindModel$SearchContext;
/*     */     //   172: invokevirtual setSearchContext : (Lcom/intellij/find/FindModel$SearchContext;)V
/*     */     //   175: aload #7
/*     */     //   177: aload_0
/*     */     //   178: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   181: invokestatic projectScope : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/search/GlobalSearchScope;
/*     */     //   184: checkcast com/intellij/psi/search/SearchScope
/*     */     //   187: invokevirtual setCustomScope : (Lcom/intellij/psi/search/SearchScope;)V
/*     */     //   190: aload_1
/*     */     //   191: invokevirtual getFilter : ()Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;
/*     */     //   194: astore #9
/*     */     //   196: aload #9
/*     */     //   198: instanceof com/intellij/ml/llm/matterhorn/ej/core/services/search/DirectoryFilter
/*     */     //   201: ifeq -> 236
/*     */     //   204: aload #7
/*     */     //   206: aload_1
/*     */     //   207: invokevirtual getFilter : ()Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;
/*     */     //   210: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/DirectoryFilter
/*     */     //   213: invokevirtual getDirectory : ()Lcom/intellij/psi/PsiDirectory;
/*     */     //   216: invokeinterface getVirtualFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   221: invokevirtual getPath : ()Ljava/lang/String;
/*     */     //   224: invokevirtual setDirectoryName : (Ljava/lang/String;)V
/*     */     //   227: aload #7
/*     */     //   229: iconst_0
/*     */     //   230: invokevirtual setProjectScope : (Z)V
/*     */     //   233: goto -> 347
/*     */     //   236: aload #9
/*     */     //   238: instanceof com/intellij/ml/llm/matterhorn/ej/core/services/search/FileFilter
/*     */     //   241: ifeq -> 347
/*     */     //   244: aload_1
/*     */     //   245: aload #7
/*     */     //   247: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/find/FindModel;)Lkotlin/jvm/functions/Function0;
/*     */     //   252: aload #11
/*     */     //   254: aload #11
/*     */     //   256: aload_0
/*     */     //   257: putfield L$0 : Ljava/lang/Object;
/*     */     //   260: aload #11
/*     */     //   262: aload_1
/*     */     //   263: putfield L$1 : Ljava/lang/Object;
/*     */     //   266: aload #11
/*     */     //   268: aload #4
/*     */     //   270: putfield L$2 : Ljava/lang/Object;
/*     */     //   273: aload #11
/*     */     //   275: aload #6
/*     */     //   277: putfield L$3 : Ljava/lang/Object;
/*     */     //   280: aload #11
/*     */     //   282: iconst_1
/*     */     //   283: putfield label : I
/*     */     //   286: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   289: dup
/*     */     //   290: aload #12
/*     */     //   292: if_acmpne -> 346
/*     */     //   295: aload #12
/*     */     //   297: areturn
/*     */     //   298: iconst_0
/*     */     //   299: istore #8
/*     */     //   301: aload #11
/*     */     //   303: getfield L$3 : Ljava/lang/Object;
/*     */     //   306: checkcast com/intellij/find/FindModel
/*     */     //   309: astore #6
/*     */     //   311: aload #11
/*     */     //   313: getfield L$2 : Ljava/lang/Object;
/*     */     //   316: checkcast java/util/Set
/*     */     //   319: astore #4
/*     */     //   321: aload #11
/*     */     //   323: getfield L$1 : Ljava/lang/Object;
/*     */     //   326: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery
/*     */     //   329: astore_1
/*     */     //   330: aload #11
/*     */     //   332: getfield L$0 : Ljava/lang/Object;
/*     */     //   335: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher
/*     */     //   338: astore_0
/*     */     //   339: aload #10
/*     */     //   341: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   344: aload #10
/*     */     //   346: pop
/*     */     //   347: aload #6
/*     */     //   349: astore #5
/*     */     //   351: nop
/*     */     //   352: aload_1
/*     */     //   353: invokevirtual getTimeoutMs : ()J
/*     */     //   356: new com/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher$searchProject$2
/*     */     //   359: dup
/*     */     //   360: aload #5
/*     */     //   362: aload_0
/*     */     //   363: aload_1
/*     */     //   364: aload #4
/*     */     //   366: aconst_null
/*     */     //   367: invokespecial <init> : (Lcom/intellij/find/FindModel;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Ljava/util/Set;Lkotlin/coroutines/Continuation;)V
/*     */     //   370: checkcast kotlin/jvm/functions/Function2
/*     */     //   373: aload #11
/*     */     //   375: aload #11
/*     */     //   377: aload_0
/*     */     //   378: putfield L$0 : Ljava/lang/Object;
/*     */     //   381: aload #11
/*     */     //   383: aload_1
/*     */     //   384: putfield L$1 : Ljava/lang/Object;
/*     */     //   387: aload #11
/*     */     //   389: aload #4
/*     */     //   391: putfield L$2 : Ljava/lang/Object;
/*     */     //   394: aload #11
/*     */     //   396: aconst_null
/*     */     //   397: putfield L$3 : Ljava/lang/Object;
/*     */     //   400: aload #11
/*     */     //   402: iconst_2
/*     */     //   403: putfield label : I
/*     */     //   406: invokestatic withOptionalTimeout : (JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   409: dup
/*     */     //   410: aload #12
/*     */     //   412: if_acmpne -> 454
/*     */     //   415: aload #12
/*     */     //   417: areturn
/*     */     //   418: aload #11
/*     */     //   420: getfield L$2 : Ljava/lang/Object;
/*     */     //   423: checkcast java/util/Set
/*     */     //   426: astore #4
/*     */     //   428: aload #11
/*     */     //   430: getfield L$1 : Ljava/lang/Object;
/*     */     //   433: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery
/*     */     //   436: astore_1
/*     */     //   437: aload #11
/*     */     //   439: getfield L$0 : Ljava/lang/Object;
/*     */     //   442: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher
/*     */     //   445: astore_0
/*     */     //   446: nop
/*     */     //   447: aload #10
/*     */     //   449: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   452: aload #10
/*     */     //   454: pop
/*     */     //   455: goto -> 486
/*     */     //   458: astore #7
/*     */     //   460: getstatic com/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   463: aload_1
/*     */     //   464: aload #4
/*     */     //   466: invokeinterface size : ()I
/*     */     //   471: aload_1
/*     */     //   472: invokevirtual getQueryLimit : ()I
/*     */     //   475: invokestatic min : (II)I
/*     */     //   478: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;I)Ljava/lang/String;
/*     */     //   483: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   486: aload_0
/*     */     //   487: aload #4
/*     */     //   489: checkcast java/lang/Iterable
/*     */     //   492: aload_1
/*     */     //   493: invokevirtual getQueryLimit : ()I
/*     */     //   496: invokestatic take : (Ljava/lang/Iterable;I)Ljava/util/List;
/*     */     //   499: aload #11
/*     */     //   501: aload #11
/*     */     //   503: aconst_null
/*     */     //   504: putfield L$0 : Ljava/lang/Object;
/*     */     //   507: aload #11
/*     */     //   509: aconst_null
/*     */     //   510: putfield L$1 : Ljava/lang/Object;
/*     */     //   513: aload #11
/*     */     //   515: aconst_null
/*     */     //   516: putfield L$2 : Ljava/lang/Object;
/*     */     //   519: aload #11
/*     */     //   521: aconst_null
/*     */     //   522: putfield L$3 : Ljava/lang/Object;
/*     */     //   525: aload #11
/*     */     //   527: iconst_3
/*     */     //   528: putfield label : I
/*     */     //   531: invokespecial prepareContent : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   534: dup
/*     */     //   535: aload #12
/*     */     //   537: if_acmpne -> 550
/*     */     //   540: aload #12
/*     */     //   542: areturn
/*     */     //   543: aload #10
/*     */     //   545: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   548: aload #10
/*     */     //   550: areturn
/*     */     //   551: new java/lang/IllegalStateException
/*     */     //   554: dup
/*     */     //   555: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   557: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   560: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #32	-> 60
/*     */     //   #34	-> 101
/*     */     //   #35	-> 106
/*     */     //   #36	-> 122
/*     */     //   #37	-> 128
/*     */     //   #38	-> 134
/*     */     //   #39	-> 140
/*     */     //   #40	-> 149
/*     */     //   #41	-> 155
/*     */     //   #42	-> 161
/*     */     //   #43	-> 167
/*     */     //   #44	-> 175
/*     */     //   #46	-> 190
/*     */     //   #47	-> 196
/*     */     //   #48	-> 204
/*     */     //   #49	-> 227
/*     */     //   #51	-> 236
/*     */     //   #32	-> 295
/*     */     //   #57	-> 346
/*     */     //   #35	-> 347
/*     */     //   #35	-> 349
/*     */     //   #59	-> 351
/*     */     //   #60	-> 352
/*     */     //   #32	-> 415
/*     */     //   #60	-> 454
/*     */     //   #80	-> 458
/*     */     //   #81	-> 460
/*     */     //   #81	-> 483
/*     */     //   #84	-> 486
/*     */     //   #32	-> 540
/*     */     //   #84	-> 550
/*     */     //   #32	-> 551
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	197	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher;
/*     */     //   339	79	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher;
/*     */     //   446	32	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher;
/*     */     //   478	56	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher;
/*     */     //   101	197	1	query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*     */     //   330	88	1	query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*     */     //   437	41	1	query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*     */     //   478	56	1	query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*     */     //   106	192	4	result	Ljava/util/Set;
/*     */     //   321	97	4	result	Ljava/util/Set;
/*     */     //   428	50	4	result	Ljava/util/Set;
/*     */     //   478	56	4	result	Ljava/util/Set;
/*     */     //   351	58	5	findModel	Lcom/intellij/find/FindModel;
/*     */     //   119	117	7	$this$searchProject_u24lambda_u242	Lcom/intellij/find/FindModel;
/*     */     //   236	53	7	$this$searchProject_u24lambda_u242	Lcom/intellij/find/FindModel;
/*     */     //   122	176	8	$i$a$-apply-TextProjectSearcher$searchProject$findModel$1	I
/*     */     //   0	561	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	501	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	494	10	$result	Ljava/lang/Object;
/*     */     //   301	46	8	$i$a$-apply-TextProjectSearcher$searchProject$findModel$1	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   351	409	458	kotlinx/coroutines/TimeoutCancellationException
/* 106 */     //   446	455	458	kotlinx/coroutines/TimeoutCancellationException } @NotNull private static final Logger logger = Logger.getInstance(TextProjectSearcher.class);
/*     */   
/*     */   private static final Unit searchProject$lambda$2$lambda$1(SearchQuery $query, FindModel $this_apply) {
/*     */     if (((FileFilter)$query.getFilter()).getFile().getParent() != null && ((FileFilter)$query.getFilter()).getFile().getParent().getVirtualFile() != null && ((FileFilter)$query.getFilter()).getFile().getParent().getVirtualFile().getPath() != null) {
/*     */       String it = ((FileFilter)$query.getFilter()).getFile().getParent().getVirtualFile().getPath();
/*     */       int $i$a$-let-TextProjectSearcher$searchProject$findModel$1$1$1 = 0;
/*     */       $this_apply.setDirectoryName(it);
/*     */     } else {
/*     */       ((FileFilter)$query.getFilter()).getFile().getParent().getVirtualFile().getPath();
/*     */     } 
/*     */     $this_apply.setFileFilter(((FileFilter)$query.getFilter()).getFile().getName());
/*     */     $this_apply.setProjectScope(false);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TextProjectSearcher.kt", l = {89}, i = {}, s = {}, n = {}, m = "prepareContent", c = "com.intellij.ml.llm.matterhorn.ej.core.services.search.TextProjectSearcher")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class TextProjectSearcher$prepareContent$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     TextProjectSearcher$prepareContent$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return TextProjectSearcher.this.prepareContent(null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TextProjectSearcher.kt", l = {51, 60, 84}, i = {0, 0, 0, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"this", "query", "result", "this", "query", "result"}, m = "searchProject", c = "com.intellij.ml.llm.matterhorn.ej.core.services.search.TextProjectSearcher")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class TextProjectSearcher$searchProject$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     TextProjectSearcher$searchProject$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return TextProjectSearcher.this.searchProject(null, null, (Continuation<? super List<SearchResultItem>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TextProjectSearcher.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.services.search.TextProjectSearcher$searchProject$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class TextProjectSearcher$searchProject$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
/*     */     int label;
/*     */     
/*     */     TextProjectSearcher$searchProject$2(TextProjectSearcher $receiver, SearchQuery $query, Set<UsageInfo> $result, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       CoroutineScope $this$withOptionalTimeout;
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           $this$withOptionalTimeout = (CoroutineScope)this.L$0;
/*     */           return BuildersKt.launch$default($this$withOptionalTimeout, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(TextProjectSearcher.this, this.$query, this.$result, null) {
/*     */                 int label;
/*     */                 
/*     */                 public final Object invokeSuspend(Object $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore_2
/*     */                   //   4: aload_0
/*     */                   //   5: getfield label : I
/*     */                   //   8: tableswitch default -> 86, 0 -> 32, 1 -> 76
/*     */                   //   32: aload_1
/*     */                   //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   36: aload_0
/*     */                   //   37: getfield $findModel : Lcom/intellij/find/FindModel;
/*     */                   //   40: aload_0
/*     */                   //   41: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher;
/*     */                   //   44: aload_0
/*     */                   //   45: getfield $query : Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*     */                   //   48: aload_0
/*     */                   //   49: getfield $result : Ljava/util/Set;
/*     */                   //   52: <illegal opcode> invoke : (Lcom/intellij/find/FindModel;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Ljava/util/Set;)Lkotlin/jvm/functions/Function0;
/*     */                   //   57: aload_0
/*     */                   //   58: checkcast kotlin/coroutines/Continuation
/*     */                   //   61: aload_0
/*     */                   //   62: iconst_1
/*     */                   //   63: putfield label : I
/*     */                   //   66: invokestatic coroutineToIndicator : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   69: dup
/*     */                   //   70: aload_2
/*     */                   //   71: if_acmpne -> 81
/*     */                   //   74: aload_2
/*     */                   //   75: areturn
/*     */                   //   76: aload_1
/*     */                   //   77: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   80: aload_1
/*     */                   //   81: pop
/*     */                   //   82: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   85: areturn
/*     */                   //   86: new java/lang/IllegalStateException
/*     */                   //   89: dup
/*     */                   //   90: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   92: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   95: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #61	-> 3
/*     */                   //   #62	-> 36
/*     */                   //   #61	-> 74
/*     */                   //   #78	-> 81
/*     */                   //   #61	-> 86
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   0	96	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher$searchProject$2$1;
/*     */                   //   36	50	1	$result	Ljava/lang/Object;
/*     */                 }
/*     */                 
/*     */                 private static final Unit invokeSuspend$lambda$4(FindModel $findModel, TextProjectSearcher this$0, SearchQuery $query, Set $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getGlobalProgressIndicator : ()Lcom/intellij/openapi/progress/ProgressIndicator;
/*     */                   //   3: astore #4
/*     */                   //   5: new com/intellij/usages/UsageViewPresentation
/*     */                   //   8: dup
/*     */                   //   9: invokespecial <init> : ()V
/*     */                   //   12: astore #6
/*     */                   //   14: aload #6
/*     */                   //   16: astore #7
/*     */                   //   18: iconst_0
/*     */                   //   19: istore #8
/*     */                   //   21: aload #7
/*     */                   //   23: iconst_1
/*     */                   //   24: invokevirtual setDetachedMode : (Z)V
/*     */                   //   27: aload #6
/*     */                   //   29: astore #9
/*     */                   //   31: new com/intellij/usages/FindUsagesProcessPresentation
/*     */                   //   34: dup
/*     */                   //   35: aload #9
/*     */                   //   37: invokespecial <init> : (Lcom/intellij/usages/UsageViewPresentation;)V
/*     */                   //   40: astore #5
/*     */                   //   42: aload_0
/*     */                   //   43: aload_1
/*     */                   //   44: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */                   //   47: aload #4
/*     */                   //   49: aload #5
/*     */                   //   51: invokestatic emptySet : ()Ljava/util/Set;
/*     */                   //   54: aload_1
/*     */                   //   55: aload_2
/*     */                   //   56: aload_3
/*     */                   //   57: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Ljava/util/Set;)Lkotlin/jvm/functions/Function1;
/*     */                   //   62: <illegal opcode> process : (Lkotlin/jvm/functions/Function1;)Lcom/intellij/util/Processor;
/*     */                   //   67: invokestatic findUsages : (Lcom/intellij/find/FindModel;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/progress/ProgressIndicator;Lcom/intellij/usages/FindUsagesProcessPresentation;Ljava/util/Set;Lcom/intellij/util/Processor;)V
/*     */                   //   70: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   73: areturn
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #63	-> 0
/*     */                   //   #64	-> 5
/*     */                   //   #108	-> 18
/*     */                   //   #64	-> 21
/*     */                   //   #64	-> 27
/*     */                   //   #64	-> 29
/*     */                   //   #65	-> 42
/*     */                   //   #77	-> 70
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   21	6	8	$i$a$-apply-TextProjectSearcher$searchProject$2$1$1$presentation$1	I
/*     */                   //   18	9	7	$this$invokeSuspend_u24lambda_u244_u24lambda_u240	Lcom/intellij/usages/UsageViewPresentation;
/*     */                   //   5	69	4	progressIndicator	Lcom/intellij/openapi/progress/ProgressIndicator;
/*     */                   //   42	32	5	presentation	Lcom/intellij/usages/FindUsagesProcessPresentation;
/*     */                   //   0	74	0	$findModel	Lcom/intellij/find/FindModel;
/*     */                   //   0	74	1	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher;
/*     */                   //   0	74	2	$query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*     */                   //   0	74	3	$result	Ljava/util/Set;
/*     */                 }
/*     */                 
/*     */                 private static final boolean invokeSuspend$lambda$4$lambda$3(Function1 $tmp0, Object p0) {
/*     */                   return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */                 }
/*     */                 
/*     */                 private static final boolean invokeSuspend$lambda$4$lambda$2(TextProjectSearcher this$0, SearchQuery $query, Set $result, UsageInfo info) {
/*     */                   // Byte code:
/*     */                   //   0: aload_3
/*     */                   //   1: invokevirtual getFile : ()Lcom/intellij/psi/PsiFile;
/*     */                   //   4: astore #4
/*     */                   //   6: aload #4
/*     */                   //   8: dup
/*     */                   //   9: ifnull -> 28
/*     */                   //   12: invokeinterface getVirtualFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */                   //   17: dup
/*     */                   //   18: ifnull -> 28
/*     */                   //   21: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*     */                   //   24: dup
/*     */                   //   25: ifnonnull -> 31
/*     */                   //   28: pop
/*     */                   //   29: iconst_1
/*     */                   //   30: ireturn
/*     */                   //   31: astore #5
/*     */                   //   33: aload #5
/*     */                   //   35: invokevirtual toString : ()Ljava/lang/String;
/*     */                   //   38: checkcast java/lang/CharSequence
/*     */                   //   41: iconst_1
/*     */                   //   42: anewarray java/lang/String
/*     */                   //   45: astore #6
/*     */                   //   47: aload #6
/*     */                   //   49: iconst_0
/*     */                   //   50: ldc '/'
/*     */                   //   52: aastore
/*     */                   //   53: aload #6
/*     */                   //   55: iconst_0
/*     */                   //   56: iconst_0
/*     */                   //   57: bipush #6
/*     */                   //   59: aconst_null
/*     */                   //   60: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*     */                   //   63: checkcast java/lang/Iterable
/*     */                   //   66: astore #6
/*     */                   //   68: iconst_0
/*     */                   //   69: istore #7
/*     */                   //   71: aload #6
/*     */                   //   73: instanceof java/util/Collection
/*     */                   //   76: ifeq -> 96
/*     */                   //   79: aload #6
/*     */                   //   81: checkcast java/util/Collection
/*     */                   //   84: invokeinterface isEmpty : ()Z
/*     */                   //   89: ifeq -> 96
/*     */                   //   92: iconst_0
/*     */                   //   93: goto -> 152
/*     */                   //   96: aload #6
/*     */                   //   98: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */                   //   103: astore #8
/*     */                   //   105: aload #8
/*     */                   //   107: invokeinterface hasNext : ()Z
/*     */                   //   112: ifeq -> 151
/*     */                   //   115: aload #8
/*     */                   //   117: invokeinterface next : ()Ljava/lang/Object;
/*     */                   //   122: astore #9
/*     */                   //   124: aload #9
/*     */                   //   126: checkcast java/lang/String
/*     */                   //   129: astore #10
/*     */                   //   131: iconst_0
/*     */                   //   132: istore #11
/*     */                   //   134: aload #10
/*     */                   //   136: ldc '.'
/*     */                   //   138: iconst_0
/*     */                   //   139: iconst_2
/*     */                   //   140: aconst_null
/*     */                   //   141: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */                   //   144: ifeq -> 105
/*     */                   //   147: iconst_1
/*     */                   //   148: goto -> 152
/*     */                   //   151: iconst_0
/*     */                   //   152: ifeq -> 157
/*     */                   //   155: iconst_1
/*     */                   //   156: ireturn
/*     */                   //   157: aload_0
/*     */                   //   158: aload_1
/*     */                   //   159: invokevirtual getFilter : ()Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;
/*     */                   //   162: aload #4
/*     */                   //   164: invokevirtual checkFile : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;Lcom/intellij/psi/PsiFile;)Z
/*     */                   //   167: ifne -> 172
/*     */                   //   170: iconst_1
/*     */                   //   171: ireturn
/*     */                   //   172: aload_2
/*     */                   //   173: aload_3
/*     */                   //   174: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */                   //   177: aload_3
/*     */                   //   178: invokeinterface add : (Ljava/lang/Object;)Z
/*     */                   //   183: pop
/*     */                   //   184: aload_2
/*     */                   //   185: invokeinterface size : ()I
/*     */                   //   190: aload_1
/*     */                   //   191: invokevirtual getQueryLimit : ()I
/*     */                   //   194: if_icmpge -> 201
/*     */                   //   197: iconst_1
/*     */                   //   198: goto -> 202
/*     */                   //   201: iconst_0
/*     */                   //   202: ireturn
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #66	-> 0
/*     */                   //   #67	-> 6
/*     */                   //   #68	-> 33
/*     */                   //   #68	-> 38
/*     */                   //   #105	-> 71
/*     */                   //   #106	-> 96
/*     */                   //   #68	-> 134
/*     */                   //   #106	-> 144
/*     */                   //   #107	-> 151
/*     */                   //   #68	-> 152
/*     */                   //   #69	-> 155
/*     */                   //   #71	-> 157
/*     */                   //   #72	-> 170
/*     */                   //   #74	-> 172
/*     */                   //   #75	-> 184
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   134	10	11	$i$a$-any-TextProjectSearcher$searchProject$2$1$1$1$1	I
/*     */                   //   131	13	10	it	Ljava/lang/String;
/*     */                   //   124	27	9	element$iv	Ljava/lang/Object;
/*     */                   //   71	81	7	$i$f$any	I
/*     */                   //   68	84	6	$this$any$iv	Ljava/lang/Iterable;
/*     */                   //   6	197	4	file	Lcom/intellij/psi/PsiFile;
/*     */                   //   33	170	5	path	Ljava/nio/file/Path;
/*     */                   //   0	203	0	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher;
/*     */                   //   0	203	1	$query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*     */                   //   0	203	2	$result	Ljava/util/Set;
/*     */                   //   0	203	3	info	Lcom/intellij/usageView/UsageInfo;
/*     */                 }
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   return (Continuation)new Function2<>(this.$findModel, TextProjectSearcher.this, this.$query, this.$result, $completion);
/*     */                 }
/*     */                 
/*     */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }3, null);
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TextProjectSearcher$searchProject$2> $completion) {
/*     */       TextProjectSearcher$searchProject$2 textProjectSearcher$searchProject$2 = new TextProjectSearcher$searchProject$2(TextProjectSearcher.this, this.$query, this.$result, $completion);
/*     */       textProjectSearcher$searchProject$2.L$0 = value;
/*     */       return (Continuation<Unit>)textProjectSearcher$searchProject$2;
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((TextProjectSearcher$searchProject$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private final Object prepareContent(List results, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher$prepareContent$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher$prepareContent$1
/*     */     //   11: astore #7
/*     */     //   13: aload #7
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #7
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher$prepareContent$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #7
/*     */     //   50: aload #7
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #6
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #8
/*     */     //   62: aload #7
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 162, 0 -> 88, 1 -> 137
/*     */     //   88: aload #6
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: invokestatic createListBuilder : ()Ljava/util/List;
/*     */     //   96: astore_3
/*     */     //   97: aload_3
/*     */     //   98: astore #4
/*     */     //   100: iconst_0
/*     */     //   101: istore #5
/*     */     //   103: aload_1
/*     */     //   104: aload #4
/*     */     //   106: <illegal opcode> invoke : (Ljava/util/List;Ljava/util/List;)Lkotlin/jvm/functions/Function0;
/*     */     //   111: aload #7
/*     */     //   113: aload #7
/*     */     //   115: aload_3
/*     */     //   116: putfield L$0 : Ljava/lang/Object;
/*     */     //   119: aload #7
/*     */     //   121: iconst_1
/*     */     //   122: putfield label : I
/*     */     //   125: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   128: dup
/*     */     //   129: aload #8
/*     */     //   131: if_acmpne -> 156
/*     */     //   134: aload #8
/*     */     //   136: areturn
/*     */     //   137: iconst_0
/*     */     //   138: istore #5
/*     */     //   140: aload #7
/*     */     //   142: getfield L$0 : Ljava/lang/Object;
/*     */     //   145: checkcast java/util/List
/*     */     //   148: astore_3
/*     */     //   149: aload #6
/*     */     //   151: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   154: aload #6
/*     */     //   156: pop
/*     */     //   157: aload_3
/*     */     //   158: invokestatic build : (Ljava/util/List;)Ljava/util/List;
/*     */     //   161: areturn
/*     */     //   162: new java/lang/IllegalStateException
/*     */     //   165: dup
/*     */     //   166: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   168: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   171: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #87	-> 60
/*     */     //   #88	-> 93
/*     */     //   #89	-> 103
/*     */     //   #87	-> 134
/*     */     //   #102	-> 156
/*     */     //   #88	-> 157
/*     */     //   #88	-> 161
/*     */     //   #87	-> 162
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	35	1	results	Ljava/util/List;
/*     */     //   100	28	4	$this$prepareContent_u24lambda_u245	Ljava/util/List;
/*     */     //   103	34	5	$i$a$-buildList-TextProjectSearcher$prepareContent$2	I
/*     */     //   0	172	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	112	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	105	6	$result	Ljava/lang/Object;
/*     */     //   140	17	5	$i$a$-buildList-TextProjectSearcher$prepareContent$2	I
/*     */   }
/*     */   
/*     */   private static final Unit prepareContent$lambda$5$lambda$4(List $results, List<SearchResultItem> $this_buildList) {
/*     */     for (UsageInfo result : $results) {
/*     */       PsiFile containingFile = result.getFile();
/*     */       if (containingFile == null || result.getNavigationOffset() < 0)
/*     */         continue; 
/*     */       Intrinsics.checkNotNullExpressionValue(containingFile.getFileDocument(), "getFileDocument(...)");
/*     */       Document document = containingFile.getFileDocument();
/*     */       int lineNum = document.getLineNumber(result.getNavigationOffset());
/*     */       Intrinsics.checkNotNullExpressionValue(document.getText(DocumentUtil.getLineTextRange(containingFile.getFileDocument(), lineNum)), "getText(...)");
/*     */       String lineText = StringsKt.trim(document.getText(DocumentUtil.getLineTextRange(containingFile.getFileDocument(), lineNum))).toString();
/*     */       SearchResultContent searchResultContent1 = new SearchResultContent(lineNum), it = searchResultContent1;
/*     */       int $i$a$-also-TextProjectSearcher$prepareContent$2$1$content$1 = 0;
/*     */       it.setLineText(lineText);
/*     */       SearchResultContent content = searchResultContent1;
/*     */       Intrinsics.checkNotNullExpressionValue(containingFile.getVirtualFile(), "getVirtualFile(...)");
/*     */       $this_buildList.add(new SearchResultItem(containingFile.getVirtualFile(), content, null, 4, null));
/*     */     } 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\TextProjectSearcher.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */