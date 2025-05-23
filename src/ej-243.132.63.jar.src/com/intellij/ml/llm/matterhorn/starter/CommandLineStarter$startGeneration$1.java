/*     */ package com.intellij.ml.llm.matterhorn.starter;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService;
/*     */ import com.intellij.ml.llm.matterhorn.Artifactual;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.MatterhornStarter;
/*     */ import com.intellij.ml.llm.matterhorn.ProjectFileStructure;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "CommandLineStarter.kt", l = {302, 306, 307, 313, 318, 320, 331, 347, 336, 347, 344, 347, 347}, i = {0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 8, 10}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0", "L$0"}, n = {"service", "service", "context", "service", "context", "service", "context", "service", "context", "context", "context", "context", "context"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.starter.CommandLineStarter$startGeneration$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nCommandLineStarter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandLineStarter.kt\ncom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$startGeneration$1\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,380:1\n31#2,2:381\n*S KotlinDebug\n*F\n+ 1 CommandLineStarter.kt\ncom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$startGeneration$1\n*L\n300#1:381,2\n*E\n"})
/*     */ final class CommandLineStarter$startGeneration$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   Object L$0;
/*     */   Object L$1;
/*     */   int label;
/*     */   
/*     */   CommandLineStarter$startGeneration$1(MatterhornStarter $starter, String $name, List<String> $args, String $task, CommandLineStarter $receiver, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore #11
/*     */     //   5: aload_0
/*     */     //   6: getfield label : I
/*     */     //   9: tableswitch default -> 1284, 0 -> 80, 1 -> 181, 2 -> 259, 3 -> 322, 4 -> 429, 5 -> 540, 6 -> 634, 7 -> 745, 8 -> 791, 9 -> 905, 10 -> 956, 11 -> 1111, 12 -> 1157, 13 -> 1233
/*     */     //   80: aload_1
/*     */     //   81: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   84: aload_0
/*     */     //   85: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   88: checkcast com/intellij/openapi/components/ComponentManager
/*     */     //   91: astore_3
/*     */     //   92: iconst_0
/*     */     //   93: istore #4
/*     */     //   95: ldc com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   97: astore #5
/*     */     //   99: aload_3
/*     */     //   100: aload #5
/*     */     //   102: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   107: dup
/*     */     //   108: ifnonnull -> 119
/*     */     //   111: pop
/*     */     //   112: aload_3
/*     */     //   113: aload #5
/*     */     //   115: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*     */     //   118: athrow
/*     */     //   119: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   122: astore_2
/*     */     //   123: getstatic com/intellij/ml/llm/matterhorn/core/llm/MatterhornLLMProxyProvider.INSTANCE : Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornLLMProxyProvider;
/*     */     //   126: aload_2
/*     */     //   127: invokevirtual createLLMProxy : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;)Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*     */     //   130: astore_3
/*     */     //   131: aload_0
/*     */     //   132: getfield $starter : Lcom/intellij/ml/llm/matterhorn/MatterhornStarter;
/*     */     //   135: aload_0
/*     */     //   136: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   139: aload_3
/*     */     //   140: getstatic com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$Companion;
/*     */     //   143: invokevirtual getInstance : ()Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */     //   146: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   149: aload_0
/*     */     //   150: getfield $name : Ljava/lang/String;
/*     */     //   153: aload_0
/*     */     //   154: checkcast kotlin/coroutines/Continuation
/*     */     //   157: aload_0
/*     */     //   158: aload_2
/*     */     //   159: putfield L$0 : Ljava/lang/Object;
/*     */     //   162: aload_0
/*     */     //   163: iconst_1
/*     */     //   164: putfield label : I
/*     */     //   167: invokeinterface createRootContext : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   172: dup
/*     */     //   173: aload #11
/*     */     //   175: if_acmpne -> 194
/*     */     //   178: aload #11
/*     */     //   180: areturn
/*     */     //   181: aload_0
/*     */     //   182: getfield L$0 : Ljava/lang/Object;
/*     */     //   185: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   188: astore_2
/*     */     //   189: aload_1
/*     */     //   190: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   193: aload_1
/*     */     //   194: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   197: astore #4
/*     */     //   199: aload #4
/*     */     //   201: getstatic com/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger;
/*     */     //   204: invokestatic asRootExecutionContextListener : (Lcom/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger;)Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;
/*     */     //   207: invokevirtual addListener : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;)V
/*     */     //   210: nop
/*     */     //   211: aload_0
/*     */     //   212: getfield $starter : Lcom/intellij/ml/llm/matterhorn/MatterhornStarter;
/*     */     //   215: aload_0
/*     */     //   216: getfield $name : Ljava/lang/String;
/*     */     //   219: aload_0
/*     */     //   220: getfield $args : Ljava/util/List;
/*     */     //   223: aload #4
/*     */     //   225: aload_0
/*     */     //   226: checkcast kotlin/coroutines/Continuation
/*     */     //   229: aload_0
/*     */     //   230: aload_2
/*     */     //   231: putfield L$0 : Ljava/lang/Object;
/*     */     //   234: aload_0
/*     */     //   235: aload #4
/*     */     //   237: putfield L$1 : Ljava/lang/Object;
/*     */     //   240: aload_0
/*     */     //   241: iconst_2
/*     */     //   242: putfield label : I
/*     */     //   245: invokeinterface configureProject : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   250: dup
/*     */     //   251: aload #11
/*     */     //   253: if_acmpne -> 282
/*     */     //   256: aload #11
/*     */     //   258: areturn
/*     */     //   259: aload_0
/*     */     //   260: getfield L$1 : Ljava/lang/Object;
/*     */     //   263: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   266: astore #4
/*     */     //   268: aload_0
/*     */     //   269: getfield L$0 : Ljava/lang/Object;
/*     */     //   272: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   275: astore_2
/*     */     //   276: nop
/*     */     //   277: aload_1
/*     */     //   278: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   281: aload_1
/*     */     //   282: pop
/*     */     //   283: getstatic com/intellij/ml/llm/matterhorn/ProjectOpener.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ProjectOpener;
/*     */     //   286: aload_0
/*     */     //   287: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   290: aload_0
/*     */     //   291: checkcast kotlin/coroutines/Continuation
/*     */     //   294: aload_0
/*     */     //   295: aload_2
/*     */     //   296: putfield L$0 : Ljava/lang/Object;
/*     */     //   299: aload_0
/*     */     //   300: aload #4
/*     */     //   302: putfield L$1 : Ljava/lang/Object;
/*     */     //   305: aload_0
/*     */     //   306: iconst_3
/*     */     //   307: putfield label : I
/*     */     //   310: invokevirtual awaitProjConfiguration : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   313: dup
/*     */     //   314: aload #11
/*     */     //   316: if_acmpne -> 345
/*     */     //   319: aload #11
/*     */     //   321: areturn
/*     */     //   322: aload_0
/*     */     //   323: getfield L$1 : Ljava/lang/Object;
/*     */     //   326: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   329: astore #4
/*     */     //   331: aload_0
/*     */     //   332: getfield L$0 : Ljava/lang/Object;
/*     */     //   335: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   338: astore_2
/*     */     //   339: nop
/*     */     //   340: aload_1
/*     */     //   341: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   344: aload_1
/*     */     //   345: checkcast java/util/List
/*     */     //   348: astore #5
/*     */     //   350: aload #5
/*     */     //   352: checkcast java/util/Collection
/*     */     //   355: invokeinterface isEmpty : ()Z
/*     */     //   360: ifne -> 367
/*     */     //   363: iconst_1
/*     */     //   364: goto -> 368
/*     */     //   367: iconst_0
/*     */     //   368: ifeq -> 381
/*     */     //   371: new com/intellij/ml/llm/matterhorn/starter/CannotOpenProjectException
/*     */     //   374: dup
/*     */     //   375: aload #5
/*     */     //   377: invokespecial <init> : (Ljava/util/List;)V
/*     */     //   380: athrow
/*     */     //   381: aload_0
/*     */     //   382: getfield $starter : Lcom/intellij/ml/llm/matterhorn/MatterhornStarter;
/*     */     //   385: aload_0
/*     */     //   386: getfield $name : Ljava/lang/String;
/*     */     //   389: aload_0
/*     */     //   390: getfield $args : Ljava/util/List;
/*     */     //   393: aload #4
/*     */     //   395: aload_0
/*     */     //   396: checkcast kotlin/coroutines/Continuation
/*     */     //   399: aload_0
/*     */     //   400: aload_2
/*     */     //   401: putfield L$0 : Ljava/lang/Object;
/*     */     //   404: aload_0
/*     */     //   405: aload #4
/*     */     //   407: putfield L$1 : Ljava/lang/Object;
/*     */     //   410: aload_0
/*     */     //   411: iconst_4
/*     */     //   412: putfield label : I
/*     */     //   415: invokeinterface validateProject : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   420: dup
/*     */     //   421: aload #11
/*     */     //   423: if_acmpne -> 452
/*     */     //   426: aload #11
/*     */     //   428: areturn
/*     */     //   429: aload_0
/*     */     //   430: getfield L$1 : Ljava/lang/Object;
/*     */     //   433: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   436: astore #4
/*     */     //   438: aload_0
/*     */     //   439: getfield L$0 : Ljava/lang/Object;
/*     */     //   442: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   445: astore_2
/*     */     //   446: nop
/*     */     //   447: aload_1
/*     */     //   448: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   451: aload_1
/*     */     //   452: checkcast java/util/List
/*     */     //   455: astore #6
/*     */     //   457: aload #6
/*     */     //   459: checkcast java/util/Collection
/*     */     //   462: invokeinterface isEmpty : ()Z
/*     */     //   467: ifne -> 474
/*     */     //   470: iconst_1
/*     */     //   471: goto -> 475
/*     */     //   474: iconst_0
/*     */     //   475: ifeq -> 488
/*     */     //   478: new com/intellij/ml/llm/matterhorn/starter/ValidateProjectException
/*     */     //   481: dup
/*     */     //   482: aload #6
/*     */     //   484: invokespecial <init> : (Ljava/util/List;)V
/*     */     //   487: athrow
/*     */     //   488: aload_0
/*     */     //   489: getfield $starter : Lcom/intellij/ml/llm/matterhorn/MatterhornStarter;
/*     */     //   492: aload_0
/*     */     //   493: getfield $name : Ljava/lang/String;
/*     */     //   496: aload_0
/*     */     //   497: getfield $task : Ljava/lang/String;
/*     */     //   500: aload_0
/*     */     //   501: getfield $args : Ljava/util/List;
/*     */     //   504: aload #4
/*     */     //   506: aload_0
/*     */     //   507: checkcast kotlin/coroutines/Continuation
/*     */     //   510: aload_0
/*     */     //   511: aload_2
/*     */     //   512: putfield L$0 : Ljava/lang/Object;
/*     */     //   515: aload_0
/*     */     //   516: aload #4
/*     */     //   518: putfield L$1 : Ljava/lang/Object;
/*     */     //   521: aload_0
/*     */     //   522: iconst_5
/*     */     //   523: putfield label : I
/*     */     //   526: invokeinterface buildArtifactRequest : (Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   531: dup
/*     */     //   532: aload #11
/*     */     //   534: if_acmpne -> 563
/*     */     //   537: aload #11
/*     */     //   539: areturn
/*     */     //   540: aload_0
/*     */     //   541: getfield L$1 : Ljava/lang/Object;
/*     */     //   544: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   547: astore #4
/*     */     //   549: aload_0
/*     */     //   550: getfield L$0 : Ljava/lang/Object;
/*     */     //   553: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   556: astore_2
/*     */     //   557: nop
/*     */     //   558: aload_1
/*     */     //   559: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   562: aload_1
/*     */     //   563: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequest
/*     */     //   566: astore #7
/*     */     //   568: new com/intellij/ml/llm/matterhorn/ProjectFileStructure
/*     */     //   571: dup
/*     */     //   572: invokespecial <init> : ()V
/*     */     //   575: astore #8
/*     */     //   577: invokestatic getDefault : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   580: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   583: new com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$startGeneration$1$artifact$1
/*     */     //   586: dup
/*     */     //   587: aload_2
/*     */     //   588: aload #7
/*     */     //   590: aload #8
/*     */     //   592: aload #4
/*     */     //   594: aconst_null
/*     */     //   595: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   598: checkcast kotlin/jvm/functions/Function2
/*     */     //   601: aload_0
/*     */     //   602: checkcast kotlin/coroutines/Continuation
/*     */     //   605: aload_0
/*     */     //   606: aload #4
/*     */     //   608: putfield L$0 : Ljava/lang/Object;
/*     */     //   611: aload_0
/*     */     //   612: aconst_null
/*     */     //   613: putfield L$1 : Ljava/lang/Object;
/*     */     //   616: aload_0
/*     */     //   617: bipush #6
/*     */     //   619: putfield label : I
/*     */     //   622: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   625: dup
/*     */     //   626: aload #11
/*     */     //   628: if_acmpne -> 649
/*     */     //   631: aload #11
/*     */     //   633: areturn
/*     */     //   634: aload_0
/*     */     //   635: getfield L$0 : Ljava/lang/Object;
/*     */     //   638: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   641: astore #4
/*     */     //   643: nop
/*     */     //   644: aload_1
/*     */     //   645: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   648: aload_1
/*     */     //   649: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */     //   652: astore #9
/*     */     //   654: aload #9
/*     */     //   656: instanceof com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */     //   659: ifeq -> 687
/*     */     //   662: getstatic com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult.Companion : Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult$Companion;
/*     */     //   665: aload #9
/*     */     //   667: checkcast com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */     //   670: invokevirtual getReasoning : ()Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Failure;
/*     */     //   673: invokevirtual getReason : ()Lcom/intellij/ml/llm/matterhorn/FailureReason;
/*     */     //   676: invokeinterface getMessage : ()Ljava/lang/String;
/*     */     //   681: invokevirtual error : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;
/*     */     //   684: goto -> 696
/*     */     //   687: getstatic com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult.Companion : Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult$Companion;
/*     */     //   690: aconst_null
/*     */     //   691: iconst_1
/*     */     //   692: aconst_null
/*     */     //   693: invokestatic success$default : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult$Companion;Ljava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;
/*     */     //   696: astore #10
/*     */     //   698: invokestatic access$getLOG$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   701: aload #10
/*     */     //   703: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;)Ljava/lang/String;
/*     */     //   708: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   711: aload_0
/*     */     //   712: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   715: aload #10
/*     */     //   717: aload_0
/*     */     //   718: checkcast kotlin/coroutines/Continuation
/*     */     //   721: aload_0
/*     */     //   722: aload #4
/*     */     //   724: putfield L$0 : Ljava/lang/Object;
/*     */     //   727: aload_0
/*     */     //   728: bipush #7
/*     */     //   730: putfield label : I
/*     */     //   733: invokestatic access$exitApplication : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   736: dup
/*     */     //   737: aload #11
/*     */     //   739: if_acmpne -> 760
/*     */     //   742: aload #11
/*     */     //   744: areturn
/*     */     //   745: aload_0
/*     */     //   746: getfield L$0 : Ljava/lang/Object;
/*     */     //   749: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   752: astore #4
/*     */     //   754: nop
/*     */     //   755: aload_1
/*     */     //   756: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   759: aload_1
/*     */     //   760: pop
/*     */     //   761: nop
/*     */     //   762: aload #4
/*     */     //   764: aload_0
/*     */     //   765: checkcast kotlin/coroutines/Continuation
/*     */     //   768: aload_0
/*     */     //   769: aconst_null
/*     */     //   770: putfield L$0 : Ljava/lang/Object;
/*     */     //   773: aload_0
/*     */     //   774: bipush #8
/*     */     //   776: putfield label : I
/*     */     //   779: invokevirtual close : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   782: dup
/*     */     //   783: aload #11
/*     */     //   785: if_acmpne -> 797
/*     */     //   788: aload #11
/*     */     //   790: areturn
/*     */     //   791: nop
/*     */     //   792: aload_1
/*     */     //   793: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   796: aload_1
/*     */     //   797: pop
/*     */     //   798: goto -> 826
/*     */     //   801: astore #5
/*     */     //   803: aload #5
/*     */     //   805: athrow
/*     */     //   806: astore #5
/*     */     //   808: invokestatic access$getLOG$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   811: aload #5
/*     */     //   813: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   816: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   821: aload #5
/*     */     //   823: invokevirtual warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   826: goto -> 1280
/*     */     //   829: astore #5
/*     */     //   831: aload #4
/*     */     //   833: invokevirtual getListener : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy;
/*     */     //   836: aload #5
/*     */     //   838: invokevirtual onCancellation : (Ljava/util/concurrent/CancellationException;)V
/*     */     //   841: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   844: invokeinterface isExitInProgress : ()Z
/*     */     //   849: ifne -> 921
/*     */     //   852: aload_0
/*     */     //   853: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   856: getstatic com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult.Companion : Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult$Companion;
/*     */     //   859: aload #5
/*     */     //   861: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   864: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   869: invokevirtual error : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;
/*     */     //   872: aload_0
/*     */     //   873: checkcast kotlin/coroutines/Continuation
/*     */     //   876: aload_0
/*     */     //   877: aload #4
/*     */     //   879: putfield L$0 : Ljava/lang/Object;
/*     */     //   882: aload_0
/*     */     //   883: aconst_null
/*     */     //   884: putfield L$1 : Ljava/lang/Object;
/*     */     //   887: aload_0
/*     */     //   888: bipush #9
/*     */     //   890: putfield label : I
/*     */     //   893: invokestatic access$exitApplication : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   896: dup
/*     */     //   897: aload #11
/*     */     //   899: if_acmpne -> 920
/*     */     //   902: aload #11
/*     */     //   904: areturn
/*     */     //   905: aload_0
/*     */     //   906: getfield L$0 : Ljava/lang/Object;
/*     */     //   909: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   912: astore #4
/*     */     //   914: nop
/*     */     //   915: aload_1
/*     */     //   916: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   919: aload_1
/*     */     //   920: pop
/*     */     //   921: nop
/*     */     //   922: aload #4
/*     */     //   924: aload_0
/*     */     //   925: checkcast kotlin/coroutines/Continuation
/*     */     //   928: aload_0
/*     */     //   929: aconst_null
/*     */     //   930: putfield L$0 : Ljava/lang/Object;
/*     */     //   933: aload_0
/*     */     //   934: aconst_null
/*     */     //   935: putfield L$1 : Ljava/lang/Object;
/*     */     //   938: aload_0
/*     */     //   939: bipush #10
/*     */     //   941: putfield label : I
/*     */     //   944: invokevirtual close : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   947: dup
/*     */     //   948: aload #11
/*     */     //   950: if_acmpne -> 962
/*     */     //   953: aload #11
/*     */     //   955: areturn
/*     */     //   956: nop
/*     */     //   957: aload_1
/*     */     //   958: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   961: aload_1
/*     */     //   962: pop
/*     */     //   963: goto -> 991
/*     */     //   966: astore #5
/*     */     //   968: aload #5
/*     */     //   970: athrow
/*     */     //   971: astore #5
/*     */     //   973: invokestatic access$getLOG$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   976: aload #5
/*     */     //   978: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   981: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   986: aload #5
/*     */     //   988: invokevirtual warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   991: goto -> 1280
/*     */     //   994: astore #5
/*     */     //   996: invokestatic access$getLOG$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   999: aload #5
/*     */     //   1001: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   1004: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1009: aload #5
/*     */     //   1011: invokevirtual error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   1014: getstatic com/intellij/ml/llm/matterhorn/helpers/TeamCityLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/helpers/TeamCityLogger;
/*     */     //   1017: ldc_w 'Generation is failed.'
/*     */     //   1020: aload #5
/*     */     //   1022: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1025: invokevirtual error : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   1028: aload #5
/*     */     //   1030: instanceof java/lang/Exception
/*     */     //   1033: ifeq -> 1063
/*     */     //   1036: aload #4
/*     */     //   1038: invokevirtual getListener : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy;
/*     */     //   1041: aload #5
/*     */     //   1043: checkcast java/lang/Exception
/*     */     //   1046: new com/intellij/ml/llm/matterhorn/ArtifactId
/*     */     //   1049: dup
/*     */     //   1050: aload_0
/*     */     //   1051: getfield $name : Ljava/lang/String;
/*     */     //   1054: invokestatic getRootArtifactType : ()Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   1057: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactType;)V
/*     */     //   1060: invokevirtual onException : (Ljava/lang/Exception;Lcom/intellij/ml/llm/matterhorn/ArtifactId;)V
/*     */     //   1063: aload_0
/*     */     //   1064: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   1067: getstatic com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult.Companion : Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult$Companion;
/*     */     //   1070: aload #5
/*     */     //   1072: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   1075: invokevirtual error : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;
/*     */     //   1078: aload_0
/*     */     //   1079: checkcast kotlin/coroutines/Continuation
/*     */     //   1082: aload_0
/*     */     //   1083: aload #4
/*     */     //   1085: putfield L$0 : Ljava/lang/Object;
/*     */     //   1088: aload_0
/*     */     //   1089: aconst_null
/*     */     //   1090: putfield L$1 : Ljava/lang/Object;
/*     */     //   1093: aload_0
/*     */     //   1094: bipush #11
/*     */     //   1096: putfield label : I
/*     */     //   1099: invokestatic access$exitApplication : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1102: dup
/*     */     //   1103: aload #11
/*     */     //   1105: if_acmpne -> 1126
/*     */     //   1108: aload #11
/*     */     //   1110: areturn
/*     */     //   1111: aload_0
/*     */     //   1112: getfield L$0 : Ljava/lang/Object;
/*     */     //   1115: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   1118: astore #4
/*     */     //   1120: nop
/*     */     //   1121: aload_1
/*     */     //   1122: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1125: aload_1
/*     */     //   1126: pop
/*     */     //   1127: nop
/*     */     //   1128: aload #4
/*     */     //   1130: aload_0
/*     */     //   1131: checkcast kotlin/coroutines/Continuation
/*     */     //   1134: aload_0
/*     */     //   1135: aconst_null
/*     */     //   1136: putfield L$0 : Ljava/lang/Object;
/*     */     //   1139: aload_0
/*     */     //   1140: bipush #12
/*     */     //   1142: putfield label : I
/*     */     //   1145: invokevirtual close : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1148: dup
/*     */     //   1149: aload #11
/*     */     //   1151: if_acmpne -> 1163
/*     */     //   1154: aload #11
/*     */     //   1156: areturn
/*     */     //   1157: nop
/*     */     //   1158: aload_1
/*     */     //   1159: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1162: aload_1
/*     */     //   1163: pop
/*     */     //   1164: goto -> 1192
/*     */     //   1167: astore #5
/*     */     //   1169: aload #5
/*     */     //   1171: athrow
/*     */     //   1172: astore #5
/*     */     //   1174: invokestatic access$getLOG$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   1177: aload #5
/*     */     //   1179: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   1182: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1187: aload #5
/*     */     //   1189: invokevirtual warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   1192: goto -> 1280
/*     */     //   1195: astore #5
/*     */     //   1197: nop
/*     */     //   1198: aload #4
/*     */     //   1200: aload_0
/*     */     //   1201: checkcast kotlin/coroutines/Continuation
/*     */     //   1204: aload_0
/*     */     //   1205: aload #5
/*     */     //   1207: putfield L$0 : Ljava/lang/Object;
/*     */     //   1210: aload_0
/*     */     //   1211: aconst_null
/*     */     //   1212: putfield L$1 : Ljava/lang/Object;
/*     */     //   1215: aload_0
/*     */     //   1216: bipush #13
/*     */     //   1218: putfield label : I
/*     */     //   1221: invokevirtual close : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1224: dup
/*     */     //   1225: aload #11
/*     */     //   1227: if_acmpne -> 1248
/*     */     //   1230: aload #11
/*     */     //   1232: areturn
/*     */     //   1233: aload_0
/*     */     //   1234: getfield L$0 : Ljava/lang/Object;
/*     */     //   1237: checkcast java/lang/Throwable
/*     */     //   1240: astore #5
/*     */     //   1242: nop
/*     */     //   1243: aload_1
/*     */     //   1244: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1247: aload_1
/*     */     //   1248: pop
/*     */     //   1249: goto -> 1277
/*     */     //   1252: astore #6
/*     */     //   1254: aload #6
/*     */     //   1256: athrow
/*     */     //   1257: astore #6
/*     */     //   1259: invokestatic access$getLOG$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   1262: aload #6
/*     */     //   1264: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   1267: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1272: aload #6
/*     */     //   1274: invokevirtual warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   1277: aload #5
/*     */     //   1279: athrow
/*     */     //   1280: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1283: areturn
/*     */     //   1284: new java/lang/IllegalStateException
/*     */     //   1287: dup
/*     */     //   1288: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1291: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1294: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #299	-> 3
/*     */     //   #300	-> 84
/*     */     //   #381	-> 95
/*     */     //   #382	-> 99
/*     */     //   #300	-> 119
/*     */     //   #301	-> 123
/*     */     //   #302	-> 131
/*     */     //   #299	-> 178
/*     */     //   #303	-> 199
/*     */     //   #305	-> 210
/*     */     //   #306	-> 211
/*     */     //   #299	-> 256
/*     */     //   #307	-> 282
/*     */     //   #299	-> 319
/*     */     //   #309	-> 350
/*     */     //   #309	-> 368
/*     */     //   #310	-> 371
/*     */     //   #313	-> 381
/*     */     //   #299	-> 426
/*     */     //   #314	-> 457
/*     */     //   #314	-> 475
/*     */     //   #315	-> 478
/*     */     //   #318	-> 488
/*     */     //   #299	-> 537
/*     */     //   #319	-> 568
/*     */     //   #320	-> 577
/*     */     //   #299	-> 631
/*     */     //   #324	-> 654
/*     */     //   #325	-> 662
/*     */     //   #328	-> 687
/*     */     //   #324	-> 696
/*     */     //   #330	-> 698
/*     */     //   #331	-> 711
/*     */     //   #299	-> 742
/*     */     //   #346	-> 760
/*     */     //   #347	-> 762
/*     */     //   #299	-> 788
/*     */     //   #347	-> 797
/*     */     //   #348	-> 801
/*     */     //   #349	-> 803
/*     */     //   #350	-> 806
/*     */     //   #351	-> 808
/*     */     //   #353	-> 826
/*     */     //   #333	-> 829
/*     */     //   #334	-> 831
/*     */     //   #335	-> 841
/*     */     //   #336	-> 852
/*     */     //   #299	-> 902
/*     */     //   #346	-> 920
/*     */     //   #347	-> 922
/*     */     //   #299	-> 953
/*     */     //   #347	-> 962
/*     */     //   #348	-> 966
/*     */     //   #349	-> 968
/*     */     //   #350	-> 971
/*     */     //   #351	-> 973
/*     */     //   #353	-> 991
/*     */     //   #338	-> 994
/*     */     //   #339	-> 996
/*     */     //   #340	-> 1014
/*     */     //   #341	-> 1028
/*     */     //   #342	-> 1036
/*     */     //   #344	-> 1063
/*     */     //   #299	-> 1108
/*     */     //   #346	-> 1126
/*     */     //   #347	-> 1128
/*     */     //   #299	-> 1154
/*     */     //   #347	-> 1163
/*     */     //   #348	-> 1167
/*     */     //   #349	-> 1169
/*     */     //   #350	-> 1172
/*     */     //   #351	-> 1174
/*     */     //   #353	-> 1192
/*     */     //   #346	-> 1195
/*     */     //   #347	-> 1198
/*     */     //   #299	-> 1230
/*     */     //   #347	-> 1248
/*     */     //   #348	-> 1252
/*     */     //   #349	-> 1254
/*     */     //   #350	-> 1257
/*     */     //   #351	-> 1259
/*     */     //   #354	-> 1280
/*     */     //   #299	-> 1284
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   123	58	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   189	70	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   276	46	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   339	90	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   446	94	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   557	68	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   92	27	3	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */     //   131	41	3	llmProxy	Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*     */     //   199	60	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   268	54	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   331	98	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   438	102	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   549	85	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   643	102	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   754	28	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   829	76	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   914	33	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   994	117	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   1120	28	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   1195	29	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   99	20	5	serviceClass$iv	Ljava/lang/Class;
/*     */     //   350	18	5	openProblems	Ljava/util/List;
/*     */     //   368	13	5	openProblems	Ljava/util/List;
/*     */     //   803	3	5	th	Ljava/util/concurrent/CancellationException;
/*     */     //   808	18	5	th	Ljava/lang/Throwable;
/*     */     //   831	65	5	e	Ljava/util/concurrent/CancellationException;
/*     */     //   968	3	5	th	Ljava/util/concurrent/CancellationException;
/*     */     //   973	18	5	th	Ljava/lang/Throwable;
/*     */     //   996	106	5	e	Ljava/lang/Throwable;
/*     */     //   1169	3	5	th	Ljava/util/concurrent/CancellationException;
/*     */     //   1174	18	5	th	Ljava/lang/Throwable;
/*     */     //   457	18	6	projectProblem	Ljava/util/List;
/*     */     //   475	13	6	projectProblem	Ljava/util/List;
/*     */     //   1254	3	6	th	Ljava/util/concurrent/CancellationException;
/*     */     //   1259	18	6	th	Ljava/lang/Throwable;
/*     */     //   568	57	7	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   577	48	8	source	Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;
/*     */     //   654	33	9	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   698	38	10	exitCode	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;
/*     */     //   95	24	4	$i$f$service	I
/*     */     //   0	1295	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$startGeneration$1;
/*     */     //   84	1200	1	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   210	250	829	java/util/concurrent/CancellationException
/*     */     //   210	250	994	java/lang/Throwable
/*     */     //   210	250	1195	finally
/*     */     //   276	313	829	java/util/concurrent/CancellationException
/*     */     //   276	313	994	java/lang/Throwable
/*     */     //   276	313	1195	finally
/*     */     //   339	420	829	java/util/concurrent/CancellationException
/*     */     //   339	420	994	java/lang/Throwable
/*     */     //   339	420	1195	finally
/*     */     //   446	531	829	java/util/concurrent/CancellationException
/*     */     //   446	531	994	java/lang/Throwable
/*     */     //   446	531	1195	finally
/*     */     //   557	625	829	java/util/concurrent/CancellationException
/*     */     //   557	625	994	java/lang/Throwable
/*     */     //   557	625	1195	finally
/*     */     //   643	736	829	java/util/concurrent/CancellationException
/*     */     //   643	736	994	java/lang/Throwable
/*     */     //   643	736	1195	finally
/*     */     //   754	761	829	java/util/concurrent/CancellationException
/*     */     //   754	761	994	java/lang/Throwable
/*     */     //   754	761	1195	finally
/*     */     //   761	782	801	java/util/concurrent/CancellationException
/*     */     //   761	782	806	java/lang/Throwable
/*     */     //   791	798	801	java/util/concurrent/CancellationException
/*     */     //   791	798	806	java/lang/Throwable
/*     */     //   829	896	1195	finally
/*     */     //   914	921	1195	finally
/*     */     //   921	947	966	java/util/concurrent/CancellationException
/*     */     //   921	947	971	java/lang/Throwable
/*     */     //   956	963	966	java/util/concurrent/CancellationException
/*     */     //   956	963	971	java/lang/Throwable
/*     */     //   994	1102	1195	finally
/*     */     //   1120	1127	1195	finally
/*     */     //   1127	1148	1167	java/util/concurrent/CancellationException
/*     */     //   1127	1148	1172	java/lang/Throwable
/*     */     //   1157	1164	1167	java/util/concurrent/CancellationException
/*     */     //   1157	1164	1172	java/lang/Throwable
/*     */     //   1195	1197	1195	finally
/*     */     //   1197	1224	1252	java/util/concurrent/CancellationException
/*     */     //   1197	1224	1257	java/lang/Throwable
/*     */     //   1242	1249	1252	java/util/concurrent/CancellationException
/*     */     //   1242	1249	1257	java/lang/Throwable
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super CommandLineStarter$startGeneration$1> $completion) {
/*     */     return (Continuation<Unit>)new CommandLineStarter$startGeneration$1(this.$starter, this.$name, this.$args, this.$task, CommandLineStarter.this, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((CommandLineStarter$startGeneration$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CommandLineStarter.kt", l = {321}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.starter.CommandLineStarter$startGeneration$1$artifact$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class CommandLineStarter$startGeneration$1$artifact$1
/*     */     extends SuspendLambda
/*     */     implements Function2<CoroutineScope, Continuation<? super Artifactual>, Object>
/*     */   {
/*     */     int label;
/*     */     
/*     */     CommandLineStarter$startGeneration$1$artifact$1(ArtifactRequestExecutorService $service, ArtifactRequest<?, ?> $request, ProjectFileStructure $source, RootExecutionContext $context, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/* 320 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 321 */           this.label = 1; if (ArtifactRequestExecutorService.getOrCreateArtifact$default(this.$service, this.$request, this.$source, new ExecutionContext(this.$context, null, this.$request, this.$source, null, 16, null), null, (Continuation)this, 8, null) == object) return object;  return ((ArtifactRequestExecutorService.ArtifactResult)ArtifactRequestExecutorService.getOrCreateArtifact$default(this.$service, this.$request, this.$source, new ExecutionContext(this.$context, null, this.$request, this.$source, null, 16, null), null, (Continuation)this, 8, null)).getArtifact();case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return ((ArtifactRequestExecutorService.ArtifactResult)SYNTHETIC_LOCAL_VARIABLE_1).getArtifact(); }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super CommandLineStarter$startGeneration$1$artifact$1> $completion) {
/*     */       return (Continuation<Unit>)new CommandLineStarter$startGeneration$1$artifact$1(this.$service, this.$request, this.$source, this.$context, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((CommandLineStarter$startGeneration$1$artifact$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\CommandLineStarter$startGeneration$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */