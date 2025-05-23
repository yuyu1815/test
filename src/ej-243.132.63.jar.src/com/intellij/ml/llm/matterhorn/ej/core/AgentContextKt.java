/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskId;
/*     */ import com.intellij.openapi.diff.impl.patch.FilePatch;
/*     */ import com.intellij.openapi.diff.impl.patch.IdeaTextPatchBuilder;
/*     */ import com.intellij.openapi.vcs.FilePath;
/*     */ import com.intellij.openapi.vcs.changes.Change;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.nio.file.Paths;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000(\n\000\n\002\020\016\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\032\034\020\000\032\0020\001*\0020\0022\b\b\002\020\003\032\0020\004H@¢\006\002\020\005\032\030\020\006\032\020\022\004\022\0020\b\022\004\022\0020\t\030\0010\007*\0020\002\032\n\020\n\032\0020\002*\0020\013¨\006\f"}, d2 = {"buildPatchForChanges", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "includeNewCreatedFiles", "", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChainAndTaskIdPair", "Lkotlin/Pair;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "getExecutionAgentContext", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAgentContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentContextKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,332:1\n808#2,11:333\n*S KotlinDebug\n*F\n+ 1 AgentContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentContextKt\n*L\n213#1:333,11\n*E\n"})
/*     */ public final class AgentContextKt
/*     */ {
/*     */   @Nullable
/*     */   public static final Object buildPatchForChanges(@NotNull ExecutionAgentContext $this$buildPatchForChanges, boolean includeNewCreatedFiles, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/AgentContextKt$buildPatchForChanges$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentContextKt$buildPatchForChanges$1
/*     */     //   11: astore #16
/*     */     //   13: aload #16
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #16
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 49
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/AgentContextKt$buildPatchForChanges$1
/*     */     //   42: dup
/*     */     //   43: aload_2
/*     */     //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   47: astore #16
/*     */     //   49: aload #16
/*     */     //   51: getfield result : Ljava/lang/Object;
/*     */     //   54: astore #15
/*     */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   59: astore #17
/*     */     //   61: aload #16
/*     */     //   63: getfield label : I
/*     */     //   66: tableswitch default -> 566, 0 -> 88, 1 -> 364
/*     */     //   88: aload #15
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: invokeinterface getChanges : ()Ljava/util/List;
/*     */     //   99: invokeinterface isEmpty : ()Z
/*     */     //   104: ifeq -> 110
/*     */     //   107: ldc ''
/*     */     //   109: areturn
/*     */     //   110: new java/util/LinkedHashMap
/*     */     //   113: dup
/*     */     //   114: invokespecial <init> : ()V
/*     */     //   117: checkcast java/util/Map
/*     */     //   120: astore_3
/*     */     //   121: aload_0
/*     */     //   122: invokeinterface getChanges : ()Ljava/util/List;
/*     */     //   127: checkcast java/lang/Iterable
/*     */     //   130: invokestatic flatten : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   133: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   138: astore #4
/*     */     //   140: aload #4
/*     */     //   142: invokeinterface hasNext : ()Z
/*     */     //   147: ifeq -> 310
/*     */     //   150: aload #4
/*     */     //   152: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   157: checkcast com/intellij/openapi/vcs/changes/Change
/*     */     //   160: astore #5
/*     */     //   162: aload #5
/*     */     //   164: invokevirtual getBeforeRevision : ()Lcom/intellij/openapi/vcs/changes/ContentRevision;
/*     */     //   167: dup
/*     */     //   168: ifnull -> 179
/*     */     //   171: invokeinterface getFile : ()Lcom/intellij/openapi/vcs/FilePath;
/*     */     //   176: goto -> 181
/*     */     //   179: pop
/*     */     //   180: aconst_null
/*     */     //   181: astore #6
/*     */     //   183: aload #5
/*     */     //   185: invokevirtual getAfterRevision : ()Lcom/intellij/openapi/vcs/changes/ContentRevision;
/*     */     //   188: dup
/*     */     //   189: ifnull -> 201
/*     */     //   192: invokeinterface getFile : ()Lcom/intellij/openapi/vcs/FilePath;
/*     */     //   197: dup
/*     */     //   198: ifnonnull -> 212
/*     */     //   201: pop
/*     */     //   202: aload #6
/*     */     //   204: dup
/*     */     //   205: ifnonnull -> 212
/*     */     //   208: pop
/*     */     //   209: goto -> 140
/*     */     //   212: astore #7
/*     */     //   214: aload #6
/*     */     //   216: ifnull -> 230
/*     */     //   219: aload_3
/*     */     //   220: aload #6
/*     */     //   222: invokeinterface containsKey : (Ljava/lang/Object;)Z
/*     */     //   227: ifne -> 244
/*     */     //   230: aload_3
/*     */     //   231: aload #7
/*     */     //   233: aload #5
/*     */     //   235: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   240: pop
/*     */     //   241: goto -> 140
/*     */     //   244: aload_3
/*     */     //   245: aload #6
/*     */     //   247: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   252: checkcast com/intellij/openapi/vcs/changes/Change
/*     */     //   255: astore #8
/*     */     //   257: aload #8
/*     */     //   259: dup
/*     */     //   260: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   263: invokevirtual getBeforeRevision : ()Lcom/intellij/openapi/vcs/changes/ContentRevision;
/*     */     //   266: ifnonnull -> 277
/*     */     //   269: aload #5
/*     */     //   271: invokevirtual getAfterRevision : ()Lcom/intellij/openapi/vcs/changes/ContentRevision;
/*     */     //   274: ifnull -> 140
/*     */     //   277: new com/intellij/openapi/vcs/changes/Change
/*     */     //   280: dup
/*     */     //   281: aload #8
/*     */     //   283: invokevirtual getBeforeRevision : ()Lcom/intellij/openapi/vcs/changes/ContentRevision;
/*     */     //   286: aload #5
/*     */     //   288: invokevirtual getAfterRevision : ()Lcom/intellij/openapi/vcs/changes/ContentRevision;
/*     */     //   291: invokespecial <init> : (Lcom/intellij/openapi/vcs/changes/ContentRevision;Lcom/intellij/openapi/vcs/changes/ContentRevision;)V
/*     */     //   294: astore #9
/*     */     //   296: aload_3
/*     */     //   297: aload #7
/*     */     //   299: aload #9
/*     */     //   301: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   306: pop
/*     */     //   307: goto -> 140
/*     */     //   310: invokestatic getIO : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   313: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   316: new com/intellij/ml/llm/matterhorn/ej/core/AgentContextKt$buildPatchForChanges$patches$1
/*     */     //   319: dup
/*     */     //   320: aload_0
/*     */     //   321: aload_3
/*     */     //   322: iload_1
/*     */     //   323: ifeq -> 330
/*     */     //   326: iconst_1
/*     */     //   327: goto -> 331
/*     */     //   330: iconst_0
/*     */     //   331: aconst_null
/*     */     //   332: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/util/Map;ZLkotlin/coroutines/Continuation;)V
/*     */     //   335: checkcast kotlin/jvm/functions/Function2
/*     */     //   338: aload #16
/*     */     //   340: aload #16
/*     */     //   342: aload_0
/*     */     //   343: putfield L$0 : Ljava/lang/Object;
/*     */     //   346: aload #16
/*     */     //   348: iconst_1
/*     */     //   349: putfield label : I
/*     */     //   352: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   355: dup
/*     */     //   356: aload #17
/*     */     //   358: if_acmpne -> 380
/*     */     //   361: aload #17
/*     */     //   363: areturn
/*     */     //   364: aload #16
/*     */     //   366: getfield L$0 : Ljava/lang/Object;
/*     */     //   369: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   372: astore_0
/*     */     //   373: aload #15
/*     */     //   375: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   378: aload #15
/*     */     //   380: checkcast java/util/List
/*     */     //   383: astore #4
/*     */     //   385: aload #4
/*     */     //   387: invokeinterface isEmpty : ()Z
/*     */     //   392: ifeq -> 398
/*     */     //   395: ldc ''
/*     */     //   397: areturn
/*     */     //   398: new java/io/StringWriter
/*     */     //   401: dup
/*     */     //   402: invokespecial <init> : ()V
/*     */     //   405: astore #5
/*     */     //   407: aload_0
/*     */     //   408: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   413: invokestatic getStateStore : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/components/impl/stores/IProjectStore;
/*     */     //   416: invokeinterface getProjectBasePath : ()Ljava/nio/file/Path;
/*     */     //   421: dup
/*     */     //   422: ldc 'getProjectBasePath(...)'
/*     */     //   424: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   427: astore #6
/*     */     //   429: aload_0
/*     */     //   430: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   435: aload #4
/*     */     //   437: checkcast java/util/Collection
/*     */     //   440: aload #5
/*     */     //   442: checkcast java/io/Writer
/*     */     //   445: ldc '\\n'
/*     */     //   447: aconst_null
/*     */     //   448: invokestatic write : (Lcom/intellij/openapi/project/Project;Ljava/util/Collection;Ljava/io/Writer;Ljava/lang/String;Lcom/intellij/openapi/vcs/changes/CommitContext;)V
/*     */     //   451: aload #6
/*     */     //   453: aload #4
/*     */     //   455: checkcast java/lang/Iterable
/*     */     //   458: astore #7
/*     */     //   460: astore #14
/*     */     //   462: iconst_0
/*     */     //   463: istore #8
/*     */     //   465: aload #7
/*     */     //   467: astore #9
/*     */     //   469: new java/util/ArrayList
/*     */     //   472: dup
/*     */     //   473: invokespecial <init> : ()V
/*     */     //   476: checkcast java/util/Collection
/*     */     //   479: astore #10
/*     */     //   481: iconst_0
/*     */     //   482: istore #11
/*     */     //   484: aload #9
/*     */     //   486: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   491: astore #12
/*     */     //   493: aload #12
/*     */     //   495: invokeinterface hasNext : ()Z
/*     */     //   500: ifeq -> 533
/*     */     //   503: aload #12
/*     */     //   505: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   510: astore #13
/*     */     //   512: aload #13
/*     */     //   514: instanceof com/intellij/openapi/diff/impl/patch/BinaryFilePatch
/*     */     //   517: ifeq -> 493
/*     */     //   520: aload #10
/*     */     //   522: aload #13
/*     */     //   524: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   529: pop
/*     */     //   530: goto -> 493
/*     */     //   533: aload #10
/*     */     //   535: checkcast java/util/List
/*     */     //   538: nop
/*     */     //   539: aload #14
/*     */     //   541: swap
/*     */     //   542: aload #5
/*     */     //   544: checkcast java/io/Writer
/*     */     //   547: invokestatic writeBinaries : (Ljava/nio/file/Path;Ljava/util/List;Ljava/io/Writer;)V
/*     */     //   550: aload #5
/*     */     //   552: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   555: dup
/*     */     //   556: ldc 'toString(...)'
/*     */     //   558: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   561: astore #7
/*     */     //   563: aload #7
/*     */     //   565: areturn
/*     */     //   566: new java/lang/IllegalStateException
/*     */     //   569: dup
/*     */     //   570: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   572: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   575: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #174	-> 59
/*     */     //   #175	-> 93
/*     */     //   #176	-> 107
/*     */     //   #179	-> 110
/*     */     //   #179	-> 120
/*     */     //   #181	-> 121
/*     */     //   #182	-> 162
/*     */     //   #183	-> 183
/*     */     //   #185	-> 214
/*     */     //   #186	-> 230
/*     */     //   #188	-> 244
/*     */     //   #189	-> 257
/*     */     //   #190	-> 277
/*     */     //   #191	-> 296
/*     */     //   #196	-> 310
/*     */     //   #174	-> 361
/*     */     //   #205	-> 385
/*     */     //   #206	-> 395
/*     */     //   #209	-> 398
/*     */     //   #210	-> 407
/*     */     //   #211	-> 429
/*     */     //   #213	-> 451
/*     */     //   #333	-> 465
/*     */     //   #342	-> 484
/*     */     //   #343	-> 533
/*     */     //   #333	-> 538
/*     */     //   #213	-> 542
/*     */     //   #214	-> 550
/*     */     //   #215	-> 563
/*     */     //   #174	-> 566
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	14	0	$this$buildPatchForChanges	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   110	10	0	$this$buildPatchForChanges	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   120	92	0	$this$buildPatchForChanges	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   212	29	0	$this$buildPatchForChanges	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   241	66	0	$this$buildPatchForChanges	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   307	57	0	$this$buildPatchForChanges	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   373	22	0	$this$buildPatchForChanges	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   398	53	0	$this$buildPatchForChanges	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   93	14	1	includeNewCreatedFiles	Z
/*     */     //   110	10	1	includeNewCreatedFiles	Z
/*     */     //   120	92	1	includeNewCreatedFiles	Z
/*     */     //   212	29	1	includeNewCreatedFiles	Z
/*     */     //   241	66	1	includeNewCreatedFiles	Z
/*     */     //   307	23	1	includeNewCreatedFiles	Z
/*     */     //   121	91	3	changePerFile	Ljava/util/Map;
/*     */     //   212	29	3	changePerFile	Ljava/util/Map;
/*     */     //   241	66	3	changePerFile	Ljava/util/Map;
/*     */     //   307	23	3	changePerFile	Ljava/util/Map;
/*     */     //   385	10	4	patches	Ljava/util/List;
/*     */     //   398	64	4	patches	Ljava/util/List;
/*     */     //   162	46	5	change	Lcom/intellij/openapi/vcs/changes/Change;
/*     */     //   212	29	5	change	Lcom/intellij/openapi/vcs/changes/Change;
/*     */     //   244	52	5	change	Lcom/intellij/openapi/vcs/changes/Change;
/*     */     //   407	159	5	sw	Ljava/io/StringWriter;
/*     */     //   183	25	6	before	Lcom/intellij/openapi/vcs/FilePath;
/*     */     //   212	18	6	before	Lcom/intellij/openapi/vcs/FilePath;
/*     */     //   244	13	6	before	Lcom/intellij/openapi/vcs/FilePath;
/*     */     //   429	33	6	basePath	Ljava/nio/file/Path;
/*     */     //   214	27	7	file	Lcom/intellij/openapi/vcs/FilePath;
/*     */     //   244	63	7	file	Lcom/intellij/openapi/vcs/FilePath;
/*     */     //   462	19	7	$this$filterIsInstance$iv	Ljava/lang/Iterable;
/*     */     //   563	3	7	patchContent	Ljava/lang/String;
/*     */     //   257	39	8	previous	Lcom/intellij/openapi/vcs/changes/Change;
/*     */     //   296	11	9	compositeChange	Lcom/intellij/openapi/vcs/changes/Change;
/*     */     //   481	12	9	$this$filterIsInstanceTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   481	54	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   512	18	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   484	51	11	$i$f$filterIsInstanceTo	I
/*     */     //   465	74	8	$i$f$filterIsInstance	I
/*     */     //   0	576	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   49	517	16	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   56	510	15	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AgentContext.kt", l = {196}, i = {0}, s = {"L$0"}, n = {"$this$buildPatchForChanges"}, m = "buildPatchForChanges", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentContextKt")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AgentContextKt$buildPatchForChanges$1
/*     */     extends ContinuationImpl
/*     */   {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     AgentContextKt$buildPatchForChanges$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AgentContextKt.buildPatchForChanges(null, false, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AgentContext.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentContextKt$buildPatchForChanges$patches$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\020\000\032\020\022\f\022\n \003*\004\030\0010\0020\0020\001*\0020\004H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/openapi/diff/impl/patch/FilePatch;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nAgentContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentContextKt$buildPatchForChanges$patches$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,332:1\n774#2:333\n865#2,2:334\n*S KotlinDebug\n*F\n+ 1 AgentContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentContextKt$buildPatchForChanges$patches$1\n*L\n198#1:333\n198#1:334,2\n*E\n"})
/*     */   static final class AgentContextKt$buildPatchForChanges$patches$1
/*     */     extends SuspendLambda
/*     */     implements Function2<CoroutineScope, Continuation<? super List<? extends FilePatch>>, Object>
/*     */   {
/*     */     int label;
/*     */     
/*     */     AgentContextKt$buildPatchForChanges$patches$1(ExecutionAgentContext $receiver, Map<FilePath, Change> $changePerFile, boolean $includeNewCreatedFiles, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       VirtualFile projectDir;
/*     */       List filteredChanges;
/*     */       Collection<Change> collection1;
/*     */       boolean bool;
/*     */       int $i$f$filter;
/*     */       Collection<Change> collection2;
/*     */       Collection<Object> destination$iv$iv;
/*     */       int $i$f$filterTo;
/* 196 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 197 */           projectDir = this.$this_buildPatchForChanges.getProjectDir();
/* 198 */           collection1 = this.$changePerFile.values(); bool = this.$includeNewCreatedFiles; $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 333 */           collection2 = collection1; destination$iv$iv = new ArrayList(); $i$f$filterTo = 0;
/* 334 */           for (Change element$iv$iv : collection2) { Change it = element$iv$iv; int $i$a$-filter-AgentContextKt$buildPatchForChanges$patches$1$filteredChanges$1 = 0; if ((bool || it.getBeforeRevision() != null)) destination$iv$iv.add(element$iv$iv);  }
/* 335 */            filteredChanges = (List)destination$iv$iv;
/*     */           if (filteredChanges.isEmpty())
/*     */             return CollectionsKt.emptyList(); 
/*     */           Intrinsics.checkNotNullExpressionValue(IdeaTextPatchBuilder.buildPatch(this.$this_buildPatchForChanges.getProject(), filteredChanges, Paths.get(projectDir.getPath(), new String[0]), false), "buildPatch(...)");
/*     */           return IdeaTextPatchBuilder.buildPatch(this.$this_buildPatchForChanges.getProject(), filteredChanges, Paths.get(projectDir.getPath(), new String[0]), false); }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AgentContextKt$buildPatchForChanges$patches$1> $completion) {
/*     */       return (Continuation<Unit>)new AgentContextKt$buildPatchForChanges$patches$1(this.$this_buildPatchForChanges, this.$changePerFile, this.$includeNewCreatedFiles, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((AgentContextKt$buildPatchForChanges$patches$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Pair<TaskChainId, TaskId> getChainAndTaskIdPair(@NotNull ExecutionAgentContext $this$getChainAndTaskIdPair) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   12: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   15: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   18: astore_1
/*     */     //   19: aload_1
/*     */     //   20: checkcast java/lang/CharSequence
/*     */     //   23: iconst_1
/*     */     //   24: anewarray java/lang/String
/*     */     //   27: astore_3
/*     */     //   28: aload_3
/*     */     //   29: iconst_0
/*     */     //   30: ldc_w ' '
/*     */     //   33: aastore
/*     */     //   34: aload_3
/*     */     //   35: iconst_0
/*     */     //   36: iconst_0
/*     */     //   37: bipush #6
/*     */     //   39: aconst_null
/*     */     //   40: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*     */     //   43: astore_2
/*     */     //   44: nop
/*     */     //   45: aload_2
/*     */     //   46: iconst_0
/*     */     //   47: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   52: checkcast java/lang/String
/*     */     //   55: invokestatic fromString : (Ljava/lang/String;)Ljava/util/UUID;
/*     */     //   58: astore #4
/*     */     //   60: goto -> 67
/*     */     //   63: astore #5
/*     */     //   65: aconst_null
/*     */     //   66: areturn
/*     */     //   67: aload #4
/*     */     //   69: astore_3
/*     */     //   70: new com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   73: dup
/*     */     //   74: aload_3
/*     */     //   75: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   78: aload_3
/*     */     //   79: invokespecial <init> : (Ljava/util/UUID;)V
/*     */     //   82: astore #4
/*     */     //   84: new com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId
/*     */     //   87: dup
/*     */     //   88: aload_2
/*     */     //   89: iconst_1
/*     */     //   90: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   95: checkcast java/lang/String
/*     */     //   98: invokestatic toIntOrNull : (Ljava/lang/String;)Ljava/lang/Integer;
/*     */     //   101: dup
/*     */     //   102: ifnull -> 111
/*     */     //   105: invokevirtual intValue : ()I
/*     */     //   108: goto -> 114
/*     */     //   111: pop
/*     */     //   112: aconst_null
/*     */     //   113: areturn
/*     */     //   114: invokespecial <init> : (I)V
/*     */     //   117: astore #5
/*     */     //   119: new kotlin/Pair
/*     */     //   122: dup
/*     */     //   123: aload #4
/*     */     //   125: aload #5
/*     */     //   127: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   130: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #222	-> 6
/*     */     //   #223	-> 19
/*     */     //   #225	-> 44
/*     */     //   #226	-> 45
/*     */     //   #227	-> 63
/*     */     //   #228	-> 65
/*     */     //   #225	-> 67
/*     */     //   #231	-> 70
/*     */     //   #232	-> 84
/*     */     //   #233	-> 119
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   65	2	5	<unused var>	Ljava/lang/IllegalArgumentException;
/*     */     //   19	112	1	rootName	Ljava/lang/String;
/*     */     //   44	87	2	split	Ljava/util/List;
/*     */     //   70	61	3	id	Ljava/util/UUID;
/*     */     //   84	47	4	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   119	12	5	taskId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   0	131	0	$this$getChainAndTaskIdPair	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   44	60	63	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final ExecutionAgentContext getExecutionAgentContext(@NotNull ExecutionContext $this$getExecutionAgentContext) {
/*     */     Intrinsics.checkNotNullParameter($this$getExecutionAgentContext, "<this>");
/*     */     Intrinsics.checkNotNull($this$getExecutionAgentContext.lookupContext(AgentContext.Companion.getKEY()));
/*     */     return new SimpleExecutionAgentContext((AgentContext)$this$getExecutionAgentContext.lookupContext(AgentContext.Companion.getKEY()), $this$getExecutionAgentContext);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentContextKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */