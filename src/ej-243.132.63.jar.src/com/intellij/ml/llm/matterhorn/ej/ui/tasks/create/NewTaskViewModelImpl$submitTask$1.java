package com.intellij.ml.llm.matterhorn.ej.ui.tasks.create;

import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "NewTaskViewModelImpl.kt", l = {143, 149, 152, 156, 173, 174}, i = {4, 5}, s = {"L$0", "L$0"}, n = {"taskChainId", "liveTaskChain"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskViewModelImpl$submitTask$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
@SourceDebugExtension({"SMAP\nNewTaskViewModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewTaskViewModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$submitTask$1\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,293:1\n40#2,3:294\n1557#3:297\n1628#3,3:298\n*S KotlinDebug\n*F\n+ 1 NewTaskViewModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$submitTask$1\n*L\n149#1:294,3\n178#1:297\n178#1:298,3\n*E\n"})
final class NewTaskViewModelImpl$submitTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  Object L$0;
  
  int label;
  
  NewTaskViewModelImpl$submitTask$1(PromptMode $mode, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #22
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 704, 0 -> 52, 1 -> 86, 2 -> 228, 3 -> 277, 4 -> 324, 5 -> 440, 6 -> 670
    //   52: aload_1
    //   53: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   56: invokestatic getConfig : ()Lcom/intellij/ml/llm/matterhorn/configuration/Env;
    //   59: invokevirtual getHasEAPLicenseAgreement : ()Z
    //   62: ifeq -> 98
    //   65: aload_0
    //   66: checkcast kotlin/coroutines/Continuation
    //   69: aload_0
    //   70: iconst_1
    //   71: putfield label : I
    //   74: invokestatic checkAgreements : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   77: dup
    //   78: aload #22
    //   80: if_acmpne -> 91
    //   83: aload #22
    //   85: areturn
    //   86: aload_1
    //   87: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   90: aload_1
    //   91: ifnull -> 98
    //   94: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   97: areturn
    //   98: getstatic com/intellij/ml/llm/matterhorn/ej/ui/statistics/CompositeUiAction.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/statistics/CompositeUiAction;
    //   101: iconst_0
    //   102: invokevirtual logSubmitTask : (Z)V
    //   105: aload_0
    //   106: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
    //   109: invokevirtual getLlmProxy : ()Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
    //   112: instanceof com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy
    //   115: ifeq -> 362
    //   118: iconst_0
    //   119: istore #4
    //   121: ldc com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
    //   123: astore #5
    //   125: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
    //   128: aload #5
    //   130: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
    //   135: dup
    //   136: ifnonnull -> 203
    //   139: pop
    //   140: new java/lang/RuntimeException
    //   143: dup
    //   144: new java/lang/StringBuilder
    //   147: dup
    //   148: invokespecial <init> : ()V
    //   151: ldc 'Cannot find service '
    //   153: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: aload #5
    //   158: invokevirtual getName : ()Ljava/lang/String;
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: ldc ' (classloader='
    //   166: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: aload #5
    //   171: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   174: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   177: ldc ', client='
    //   179: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: getstatic com/intellij/codeWithMe/ClientId.Companion : Lcom/intellij/codeWithMe/ClientId$Companion;
    //   185: invokevirtual getCurrentOrNull : ()Lcom/intellij/codeWithMe/ClientId;
    //   188: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   191: bipush #41
    //   193: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   196: invokevirtual toString : ()Ljava/lang/String;
    //   199: invokespecial <init> : (Ljava/lang/String;)V
    //   202: athrow
    //   203: nop
    //   204: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
    //   207: aload_0
    //   208: checkcast kotlin/coroutines/Continuation
    //   211: aload_0
    //   212: iconst_2
    //   213: putfield label : I
    //   216: invokevirtual getAccessToken : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   219: dup
    //   220: aload #22
    //   222: if_acmpne -> 233
    //   225: aload #22
    //   227: areturn
    //   228: aload_1
    //   229: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   232: aload_1
    //   233: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
    //   236: astore_3
    //   237: aload_3
    //   238: ifnonnull -> 358
    //   241: nop
    //   242: getstatic com/intellij/ml/llm/matterhorn/llm/ModelParameters.Companion : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion;
    //   245: ldc 'SubmitNewTask'
    //   247: getstatic com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$Companion;
    //   250: invokevirtual getInstance : ()Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
    //   253: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
    //   256: aload_0
    //   257: checkcast kotlin/coroutines/Continuation
    //   260: aload_0
    //   261: iconst_3
    //   262: putfield label : I
    //   265: invokevirtual getDefaultModel : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   268: dup
    //   269: aload #22
    //   271: if_acmpne -> 283
    //   274: aload #22
    //   276: areturn
    //   277: nop
    //   278: aload_1
    //   279: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   282: aload_1
    //   283: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
    //   286: astore #4
    //   288: aload #4
    //   290: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
    //   293: invokevirtual getProvider : ()Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
    //   296: aload_0
    //   297: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
    //   300: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
    //   303: aload_0
    //   304: checkcast kotlin/coroutines/Continuation
    //   307: aload_0
    //   308: iconst_4
    //   309: putfield label : I
    //   312: invokestatic getKey : (Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   315: dup
    //   316: aload #22
    //   318: if_acmpne -> 330
    //   321: aload #22
    //   323: areturn
    //   324: nop
    //   325: aload_1
    //   326: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   329: aload_1
    //   330: pop
    //   331: iconst_0
    //   332: istore #4
    //   334: goto -> 353
    //   337: astore #5
    //   339: invokestatic access$getLogger$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   342: aload #5
    //   344: checkcast java/lang/Throwable
    //   347: invokevirtual warn : (Ljava/lang/Throwable;)V
    //   350: iconst_1
    //   351: istore #4
    //   353: iload #4
    //   355: goto -> 363
    //   358: iconst_0
    //   359: goto -> 363
    //   362: iconst_0
    //   363: istore_2
    //   364: iload_2
    //   365: ifeq -> 397
    //   368: aload_0
    //   369: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
    //   372: invokestatic access$getErrorInfo$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   375: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo
    //   378: dup
    //   379: ldc 'LLM key or provider is not configured.'
    //   381: ldc 'Settings...'
    //   383: aconst_null
    //   384: iconst_4
    //   385: aconst_null
    //   386: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   389: invokeinterface setValue : (Ljava/lang/Object;)V
    //   394: goto -> 700
    //   397: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId$Companion;
    //   400: invokevirtual new : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
    //   403: astore_3
    //   404: aload_0
    //   405: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
    //   408: invokevirtual getTaskService : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;
    //   411: aload_3
    //   412: aload_0
    //   413: checkcast kotlin/coroutines/Continuation
    //   416: aload_0
    //   417: aload_3
    //   418: putfield L$0 : Ljava/lang/Object;
    //   421: aload_0
    //   422: iconst_5
    //   423: putfield label : I
    //   426: invokeinterface observeTaskChain : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   431: dup
    //   432: aload #22
    //   434: if_acmpne -> 453
    //   437: aload #22
    //   439: areturn
    //   440: aload_0
    //   441: getfield L$0 : Ljava/lang/Object;
    //   444: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
    //   447: astore_3
    //   448: aload_1
    //   449: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   452: aload_1
    //   453: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain
    //   456: astore #4
    //   458: aload_0
    //   459: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
    //   462: invokevirtual getTaskService : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;
    //   465: aload_3
    //   466: aload_0
    //   467: getfield $mode : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;
    //   470: invokestatic toTaskType : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;)Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;
    //   473: aload_0
    //   474: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
    //   477: invokevirtual getTextState : ()Landroidx/compose/foundation/text/input/TextFieldState;
    //   480: invokevirtual getText : ()Ljava/lang/CharSequence;
    //   483: invokevirtual toString : ()Ljava/lang/String;
    //   486: aload_0
    //   487: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
    //   490: invokevirtual getAttachedFiles : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;
    //   493: invokevirtual getAttachedFiles : ()Lkotlinx/coroutines/flow/StateFlow;
    //   496: invokeinterface getValue : ()Ljava/lang/Object;
    //   501: checkcast java/lang/Iterable
    //   504: astore #5
    //   506: astore #17
    //   508: astore #16
    //   510: astore #15
    //   512: astore #14
    //   514: iconst_0
    //   515: istore #6
    //   517: aload #5
    //   519: astore #7
    //   521: new java/util/ArrayList
    //   524: dup
    //   525: aload #5
    //   527: bipush #10
    //   529: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   532: invokespecial <init> : (I)V
    //   535: checkcast java/util/Collection
    //   538: astore #8
    //   540: iconst_0
    //   541: istore #9
    //   543: aload #7
    //   545: invokeinterface iterator : ()Ljava/util/Iterator;
    //   550: astore #10
    //   552: aload #10
    //   554: invokeinterface hasNext : ()Z
    //   559: ifeq -> 602
    //   562: aload #10
    //   564: invokeinterface next : ()Ljava/lang/Object;
    //   569: astore #11
    //   571: aload #8
    //   573: aload #11
    //   575: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFile
    //   578: astore #12
    //   580: astore #18
    //   582: iconst_0
    //   583: istore #13
    //   585: aload #12
    //   587: invokevirtual getPath : ()Ljava/nio/file/Path;
    //   590: aload #18
    //   592: swap
    //   593: invokeinterface add : (Ljava/lang/Object;)Z
    //   598: pop
    //   599: goto -> 552
    //   602: aload #8
    //   604: checkcast java/util/List
    //   607: nop
    //   608: astore #18
    //   610: aload #14
    //   612: aload #15
    //   614: aload #16
    //   616: aload #17
    //   618: aload #18
    //   620: astore #19
    //   622: astore #20
    //   624: astore #21
    //   626: new com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext
    //   629: dup
    //   630: aload #21
    //   632: aload #20
    //   634: aload #19
    //   636: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;Ljava/lang/String;Ljava/util/List;)V
    //   639: aconst_null
    //   640: aload_0
    //   641: checkcast kotlin/coroutines/Continuation
    //   644: aload_0
    //   645: aload #4
    //   647: putfield L$0 : Ljava/lang/Object;
    //   650: aload_0
    //   651: bipush #6
    //   653: putfield label : I
    //   656: invokeinterface start : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   661: dup
    //   662: aload #22
    //   664: if_acmpne -> 684
    //   667: aload #22
    //   669: areturn
    //   670: aload_0
    //   671: getfield L$0 : Ljava/lang/Object;
    //   674: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain
    //   677: astore #4
    //   679: aload_1
    //   680: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   683: aload_1
    //   684: pop
    //   685: aload_0
    //   686: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
    //   689: invokevirtual getOnOpenTaskPage : ()Lkotlin/jvm/functions/Function1;
    //   692: aload #4
    //   694: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   699: pop
    //   700: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   703: areturn
    //   704: new java/lang/IllegalStateException
    //   707: dup
    //   708: ldc_w 'call to 'resume' before 'invoke' with coroutine'
    //   711: invokespecial <init> : (Ljava/lang/String;)V
    //   714: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #141	-> 3
    //   #142	-> 56
    //   #143	-> 65
    //   #141	-> 83
    //   #143	-> 91
    //   #146	-> 98
    //   #148	-> 105
    //   #149	-> 118
    //   #294	-> 121
    //   #295	-> 125
    //   #296	-> 140
    //   #295	-> 203
    //   #149	-> 211
    //   #141	-> 225
    //   #150	-> 237
    //   #151	-> 241
    //   #152	-> 242
    //   #153	-> 245
    //   #154	-> 247
    //   #152	-> 260
    //   #141	-> 274
    //   #156	-> 288
    //   #141	-> 321
    //   #157	-> 330
    //   #158	-> 337
    //   #159	-> 339
    //   #160	-> 350
    //   #163	-> 358
    //   #166	-> 362
    //   #148	-> 363
    //   #169	-> 364
    //   #170	-> 368
    //   #172	-> 397
    //   #173	-> 404
    //   #141	-> 437
    //   #174	-> 458
    //   #175	-> 465
    //   #176	-> 466
    //   #177	-> 473
    //   #178	-> 486
    //   #297	-> 517
    //   #298	-> 543
    //   #299	-> 571
    //   #178	-> 585
    //   #299	-> 593
    //   #300	-> 602
    //   #297	-> 607
    //   #175	-> 620
    //   #180	-> 639
    //   #174	-> 644
    //   #141	-> 667
    //   #182	-> 684
    //   #185	-> 700
    //   #141	-> 704
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   364	4	2	requiresSetup	Z
    //   237	4	3	accessToken	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
    //   404	36	3	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
    //   448	18	3	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
    //   288	27	4	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
    //   458	212	4	liveTaskChain	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;
    //   679	21	4	liveTaskChain	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;
    //   125	79	5	serviceClass$iv	Ljava/lang/Class;
    //   339	14	5	e	Ljava/lang/Exception;
    //   514	26	5	$this$map$iv	Ljava/lang/Iterable;
    //   540	12	7	$this$mapTo$iv$iv	Ljava/lang/Iterable;
    //   540	64	8	destination$iv$iv	Ljava/util/Collection;
    //   571	28	11	item$iv$iv	Ljava/lang/Object;
    //   582	8	12	it	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFile;
    //   121	83	4	$i$f$service	I
    //   585	5	13	$i$a$-map-NewTaskViewModelImpl$submitTask$1$1	I
    //   543	61	9	$i$f$mapTo	I
    //   517	91	6	$i$f$map	I
    //   0	715	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$submitTask$1;
    //   56	648	1	$result	Ljava/lang/Object;
    // Exception table:
    //   from	to	target	type
    //   241	268	337	java/lang/Exception
    //   277	315	337	java/lang/Exception
    //   324	334	337	java/lang/Exception
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super NewTaskViewModelImpl$submitTask$1> $completion) {
    return (Continuation<Unit>)new NewTaskViewModelImpl$submitTask$1(this.$mode, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((NewTaskViewModelImpl$submitTask$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\create\NewTaskViewModelImpl$submitTask$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */