/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*     */ import com.intellij.ml.llm.matterhorn.HumanInLoop;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.vcs.changes.Change;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\030\000 \0272\0020\001:\001\027B+\022\006\020\002\032\0020\003\022\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005\022\006\020\b\032\0020\t¢\006\004\b\n\020\013J\016\020\f\032\0020\rH@¢\006\002\020\016J\024\020\017\032\b\022\004\022\0020\0210\020H@¢\006\002\020\016J\036\020\022\032\0020\0212\006\020\023\032\0020\0242\006\020\025\032\0020\003H@¢\006\002\020\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\032\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditService;", "executionContext", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "sendEvent", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "", "humanInLoop", "Lcom/intellij/ml/llm/matterhorn/HumanInLoop;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/HumanInLoop;)V", "startEditingSession", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSession;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "undoLastEdit", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult;", "undoEdit", "change", "Lcom/intellij/openapi/vcs/changes/Change;", "context", "(Lcom/intellij/openapi/vcs/changes/Change;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nEditServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditServiceImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,87:1\n1485#2:88\n1510#2,3:89\n1513#2,3:99\n1557#2:102\n1628#2,2:103\n1557#2:105\n1628#2,3:106\n1630#2:109\n1368#2:110\n1454#2,5:111\n381#3,7:92\n14#4:116\n*S KotlinDebug\n*F\n+ 1 EditServiceImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl\n*L\n40#1:88\n40#1:89,3\n40#1:99,3\n41#1:102\n41#1:103,2\n43#1:105\n43#1:106,3\n41#1:109\n68#1:110\n68#1:111,5\n40#1:92,7\n24#1:116\n*E\n"})
/*     */ public final class EditServiceImpl implements EditService {
/*  19 */   public EditServiceImpl(@NotNull ExecutionAgentContext executionContext, @NotNull Function1<CustomArtifactEvent, Unit> sendEvent, @NotNull HumanInLoop humanInLoop) { this.executionContext = executionContext;
/*  20 */     this.sendEvent = sendEvent;
/*  21 */     this.humanInLoop = humanInLoop; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {} } @NotNull
/*  24 */   public static final Companion Companion = new Companion(null); @NotNull private final ExecutionAgentContext executionContext; @NotNull private final Function1<CustomArtifactEvent, Unit> sendEvent; @NotNull private final HumanInLoop humanInLoop; static { int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(EditServiceImpl.class), "getInstance(...)"); } @Nullable public Object startEditingSession(@NotNull Continuation $completion) { return new EditSessionImpl(this.sendEvent, this.executionContext.getProject(), this::startEditingSession$lambda$0, this.humanInLoop); } @NotNull private static final Logger logger = Logger.getInstance(EditServiceImpl.class);
/*     */   
/*     */   private static final Unit startEditingSession$lambda$0(EditServiceImpl this$0, List it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     this$0.executionContext.pushChange(it);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object undoLastEdit(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl$undoLastEdit$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl$undoLastEdit$1
/*     */     //   11: astore #26
/*     */     //   13: aload #26
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #26
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl$undoLastEdit$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #26
/*     */     //   50: aload #26
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #25
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #27
/*     */     //   62: aload #26
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 653, 0 -> 88, 1 -> 509
/*     */     //   88: aload #25
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield executionContext : Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   97: invokeinterface popChange : ()Ljava/util/List;
/*     */     //   102: astore_2
/*     */     //   103: aload_2
/*     */     //   104: checkcast java/lang/Iterable
/*     */     //   107: astore #4
/*     */     //   109: iconst_0
/*     */     //   110: istore #5
/*     */     //   112: aload #4
/*     */     //   114: astore #6
/*     */     //   116: new java/util/LinkedHashMap
/*     */     //   119: dup
/*     */     //   120: invokespecial <init> : ()V
/*     */     //   123: checkcast java/util/Map
/*     */     //   126: astore #7
/*     */     //   128: iconst_0
/*     */     //   129: istore #8
/*     */     //   131: aload #6
/*     */     //   133: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   138: astore #9
/*     */     //   140: aload #9
/*     */     //   142: invokeinterface hasNext : ()Z
/*     */     //   147: ifeq -> 264
/*     */     //   150: aload #9
/*     */     //   152: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   157: astore #10
/*     */     //   159: aload #10
/*     */     //   161: checkcast com/intellij/openapi/vcs/changes/Change
/*     */     //   164: astore #11
/*     */     //   166: iconst_0
/*     */     //   167: istore #12
/*     */     //   169: aload #11
/*     */     //   171: invokevirtual getVirtualFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   174: dup
/*     */     //   175: ifnull -> 184
/*     */     //   178: invokevirtual getPath : ()Ljava/lang/String;
/*     */     //   181: goto -> 186
/*     */     //   184: pop
/*     */     //   185: aconst_null
/*     */     //   186: astore #13
/*     */     //   188: aload #7
/*     */     //   190: astore #14
/*     */     //   192: iconst_0
/*     */     //   193: istore #15
/*     */     //   195: aload #14
/*     */     //   197: aload #13
/*     */     //   199: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   204: astore #16
/*     */     //   206: aload #16
/*     */     //   208: ifnonnull -> 243
/*     */     //   211: iconst_0
/*     */     //   212: istore #17
/*     */     //   214: new java/util/ArrayList
/*     */     //   217: dup
/*     */     //   218: invokespecial <init> : ()V
/*     */     //   221: checkcast java/util/List
/*     */     //   224: astore #17
/*     */     //   226: aload #14
/*     */     //   228: aload #13
/*     */     //   230: aload #17
/*     */     //   232: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   237: pop
/*     */     //   238: aload #17
/*     */     //   240: goto -> 245
/*     */     //   243: aload #16
/*     */     //   245: nop
/*     */     //   246: checkcast java/util/List
/*     */     //   249: astore #11
/*     */     //   251: aload #11
/*     */     //   253: aload #10
/*     */     //   255: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   260: pop
/*     */     //   261: goto -> 140
/*     */     //   264: aload #7
/*     */     //   266: nop
/*     */     //   267: astore_3
/*     */     //   268: aload_3
/*     */     //   269: invokeinterface values : ()Ljava/util/Collection;
/*     */     //   274: checkcast java/lang/Iterable
/*     */     //   277: astore #5
/*     */     //   279: iconst_0
/*     */     //   280: istore #6
/*     */     //   282: aload #5
/*     */     //   284: astore #7
/*     */     //   286: new java/util/ArrayList
/*     */     //   289: dup
/*     */     //   290: aload #5
/*     */     //   292: bipush #10
/*     */     //   294: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   297: invokespecial <init> : (I)V
/*     */     //   300: checkcast java/util/Collection
/*     */     //   303: astore #8
/*     */     //   305: iconst_0
/*     */     //   306: istore #9
/*     */     //   308: aload #7
/*     */     //   310: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   315: astore #10
/*     */     //   317: aload #10
/*     */     //   319: invokeinterface hasNext : ()Z
/*     */     //   324: ifeq -> 642
/*     */     //   327: aload #10
/*     */     //   329: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   334: astore #11
/*     */     //   336: aload #8
/*     */     //   338: aload #11
/*     */     //   340: checkcast java/util/List
/*     */     //   343: astore #12
/*     */     //   345: astore #24
/*     */     //   347: iconst_0
/*     */     //   348: istore #13
/*     */     //   350: aload #12
/*     */     //   352: checkcast java/lang/Iterable
/*     */     //   355: invokestatic reversed : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   358: checkcast java/lang/Iterable
/*     */     //   361: astore #14
/*     */     //   363: iconst_0
/*     */     //   364: istore #15
/*     */     //   366: aload #14
/*     */     //   368: astore #16
/*     */     //   370: new java/util/ArrayList
/*     */     //   373: dup
/*     */     //   374: aload #14
/*     */     //   376: bipush #10
/*     */     //   378: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   381: invokespecial <init> : (I)V
/*     */     //   384: checkcast java/util/Collection
/*     */     //   387: astore #17
/*     */     //   389: iconst_0
/*     */     //   390: istore #18
/*     */     //   392: aload #16
/*     */     //   394: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   399: astore #19
/*     */     //   401: aload #19
/*     */     //   403: invokeinterface hasNext : ()Z
/*     */     //   408: ifeq -> 618
/*     */     //   411: aload #19
/*     */     //   413: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   418: astore #20
/*     */     //   420: aload #17
/*     */     //   422: aload #20
/*     */     //   424: checkcast com/intellij/openapi/vcs/changes/Change
/*     */     //   427: astore #21
/*     */     //   429: astore #22
/*     */     //   431: iconst_0
/*     */     //   432: istore #23
/*     */     //   434: aload_0
/*     */     //   435: aload #21
/*     */     //   437: aload_0
/*     */     //   438: getfield executionContext : Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   441: aload #26
/*     */     //   443: aload #26
/*     */     //   445: aload_0
/*     */     //   446: putfield L$0 : Ljava/lang/Object;
/*     */     //   449: aload #26
/*     */     //   451: aload #8
/*     */     //   453: putfield L$1 : Ljava/lang/Object;
/*     */     //   456: aload #26
/*     */     //   458: aload #10
/*     */     //   460: putfield L$2 : Ljava/lang/Object;
/*     */     //   463: aload #26
/*     */     //   465: aload #17
/*     */     //   467: putfield L$3 : Ljava/lang/Object;
/*     */     //   470: aload #26
/*     */     //   472: aload #19
/*     */     //   474: putfield L$4 : Ljava/lang/Object;
/*     */     //   477: aload #26
/*     */     //   479: aload #22
/*     */     //   481: putfield L$5 : Ljava/lang/Object;
/*     */     //   484: aload #26
/*     */     //   486: aload #24
/*     */     //   488: putfield L$6 : Ljava/lang/Object;
/*     */     //   491: aload #26
/*     */     //   493: iconst_1
/*     */     //   494: putfield label : I
/*     */     //   497: invokespecial undoEdit : (Lcom/intellij/openapi/vcs/changes/Change;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   500: dup
/*     */     //   501: aload #27
/*     */     //   503: if_acmpne -> 603
/*     */     //   506: aload #27
/*     */     //   508: areturn
/*     */     //   509: iconst_0
/*     */     //   510: istore #6
/*     */     //   512: iconst_0
/*     */     //   513: istore #9
/*     */     //   515: iconst_0
/*     */     //   516: istore #13
/*     */     //   518: iconst_0
/*     */     //   519: istore #15
/*     */     //   521: iconst_0
/*     */     //   522: istore #18
/*     */     //   524: iconst_0
/*     */     //   525: istore #23
/*     */     //   527: aload #26
/*     */     //   529: getfield L$6 : Ljava/lang/Object;
/*     */     //   532: checkcast java/util/Collection
/*     */     //   535: astore #24
/*     */     //   537: aload #26
/*     */     //   539: getfield L$5 : Ljava/lang/Object;
/*     */     //   542: checkcast java/util/Collection
/*     */     //   545: astore #22
/*     */     //   547: aload #26
/*     */     //   549: getfield L$4 : Ljava/lang/Object;
/*     */     //   552: checkcast java/util/Iterator
/*     */     //   555: astore #19
/*     */     //   557: aload #26
/*     */     //   559: getfield L$3 : Ljava/lang/Object;
/*     */     //   562: checkcast java/util/Collection
/*     */     //   565: astore #17
/*     */     //   567: aload #26
/*     */     //   569: getfield L$2 : Ljava/lang/Object;
/*     */     //   572: checkcast java/util/Iterator
/*     */     //   575: astore #10
/*     */     //   577: aload #26
/*     */     //   579: getfield L$1 : Ljava/lang/Object;
/*     */     //   582: checkcast java/util/Collection
/*     */     //   585: astore #8
/*     */     //   587: aload #26
/*     */     //   589: getfield L$0 : Ljava/lang/Object;
/*     */     //   592: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl
/*     */     //   595: astore_0
/*     */     //   596: aload #25
/*     */     //   598: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   601: aload #25
/*     */     //   603: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult
/*     */     //   606: aload #22
/*     */     //   608: swap
/*     */     //   609: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   614: pop
/*     */     //   615: goto -> 401
/*     */     //   618: aload #17
/*     */     //   620: checkcast java/util/List
/*     */     //   623: nop
/*     */     //   624: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   627: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult
/*     */     //   630: aload #24
/*     */     //   632: swap
/*     */     //   633: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   638: pop
/*     */     //   639: goto -> 317
/*     */     //   642: aload #8
/*     */     //   644: checkcast java/util/List
/*     */     //   647: nop
/*     */     //   648: astore #4
/*     */     //   650: aload #4
/*     */     //   652: areturn
/*     */     //   653: new java/lang/IllegalStateException
/*     */     //   656: dup
/*     */     //   657: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   659: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   662: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #38	-> 60
/*     */     //   #39	-> 93
/*     */     //   #40	-> 103
/*     */     //   #88	-> 112
/*     */     //   #89	-> 131
/*     */     //   #90	-> 159
/*     */     //   #40	-> 169
/*     */     //   #90	-> 186
/*     */     //   #91	-> 188
/*     */     //   #92	-> 195
/*     */     //   #93	-> 206
/*     */     //   #94	-> 211
/*     */     //   #91	-> 214
/*     */     //   #94	-> 224
/*     */     //   #95	-> 226
/*     */     //   #96	-> 238
/*     */     //   #98	-> 243
/*     */     //   #93	-> 245
/*     */     //   #91	-> 246
/*     */     //   #99	-> 251
/*     */     //   #101	-> 264
/*     */     //   #88	-> 266
/*     */     //   #40	-> 267
/*     */     //   #41	-> 268
/*     */     //   #102	-> 282
/*     */     //   #103	-> 308
/*     */     //   #104	-> 336
/*     */     //   #43	-> 350
/*     */     //   #105	-> 366
/*     */     //   #106	-> 392
/*     */     //   #107	-> 420
/*     */     //   #44	-> 434
/*     */     //   #38	-> 506
/*     */     //   #44	-> 603
/*     */     //   #107	-> 609
/*     */     //   #108	-> 618
/*     */     //   #105	-> 623
/*     */     //   #45	-> 624
/*     */     //   #104	-> 633
/*     */     //   #109	-> 642
/*     */     //   #102	-> 647
/*     */     //   #41	-> 648
/*     */     //   #47	-> 650
/*     */     //   #38	-> 653
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	93	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl;
/*     */     //   186	81	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl;
/*     */     //   267	242	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl;
/*     */     //   596	57	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl;
/*     */     //   103	6	2	popChange	Ljava/util/List;
/*     */     //   268	11	3	changesByFile	Ljava/util/Map;
/*     */     //   109	19	4	$this$groupBy$iv	Ljava/lang/Iterable;
/*     */     //   650	3	4	result	Ljava/util/List;
/*     */     //   279	26	5	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   128	12	6	$this$groupByTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   128	58	7	destination$iv$iv	Ljava/util/Map;
/*     */     //   186	80	7	destination$iv$iv	Ljava/util/Map;
/*     */     //   305	12	7	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   305	204	8	destination$iv$iv	Ljava/util/Collection;
/*     */     //   587	57	8	destination$iv$iv	Ljava/util/Collection;
/*     */     //   159	27	10	element$iv$iv	Ljava/lang/Object;
/*     */     //   186	75	10	element$iv$iv	Ljava/lang/Object;
/*     */     //   166	18	11	it	Lcom/intellij/openapi/vcs/changes/Change;
/*     */     //   251	10	11	list$iv$iv	Ljava/util/List;
/*     */     //   336	11	11	item$iv$iv	Ljava/lang/Object;
/*     */     //   347	16	12	changes	Ljava/util/List;
/*     */     //   188	50	13	key$iv$iv	Ljava/lang/Object;
/*     */     //   192	46	14	$this$getOrPut$iv$iv$iv	Ljava/util/Map;
/*     */     //   363	26	14	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   206	5	16	value$iv$iv$iv	Ljava/lang/Object;
/*     */     //   243	2	16	value$iv$iv$iv	Ljava/lang/Object;
/*     */     //   389	12	16	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   226	14	17	answer$iv$iv$iv	Ljava/lang/Object;
/*     */     //   389	120	17	destination$iv$iv	Ljava/util/Collection;
/*     */     //   567	53	17	destination$iv$iv	Ljava/util/Collection;
/*     */     //   420	11	20	item$iv$iv	Ljava/lang/Object;
/*     */     //   431	69	21	change	Lcom/intellij/openapi/vcs/changes/Change;
/*     */     //   169	17	12	$i$a$-groupBy-EditServiceImpl$undoLastEdit$changesByFile$1	I
/*     */     //   214	10	17	$i$a$-getOrPut-CollectionsKt___CollectionsKt$groupByTo$list$1$iv$iv	I
/*     */     //   195	51	15	$i$f$getOrPut	I
/*     */     //   131	135	8	$i$f$groupByTo	I
/*     */     //   112	155	5	$i$f$groupBy	I
/*     */     //   434	75	23	$i$a$-map-EditServiceImpl$undoLastEdit$result$1$1	I
/*     */     //   392	117	18	$i$f$mapTo	I
/*     */     //   366	143	15	$i$f$map	I
/*     */     //   350	159	13	$i$a$-map-EditServiceImpl$undoLastEdit$result$1	I
/*     */     //   308	201	9	$i$f$mapTo	I
/*     */     //   282	227	6	$i$f$map	I
/*     */     //   0	663	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	603	26	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	596	25	$result	Ljava/lang/Object;
/*     */     //   527	79	23	$i$a$-map-EditServiceImpl$undoLastEdit$result$1$1	I
/*     */     //   524	96	18	$i$f$mapTo	I
/*     */     //   521	103	15	$i$f$map	I
/*     */     //   518	112	13	$i$a$-map-EditServiceImpl$undoLastEdit$result$1	I
/*     */     //   515	129	9	$i$f$mapTo	I
/*     */     //   512	136	6	$i$f$map	I
/*     */   }
/*     */   
/*     */   private final Object undoEdit(Change change, ExecutionAgentContext context, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl$undoEdit$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl$undoEdit$1
/*     */     //   11: astore #19
/*     */     //   13: aload #19
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #19
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl$undoEdit$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #19
/*     */     //   50: aload #19
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #18
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #20
/*     */     //   62: aload #19
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 674, 0 -> 96, 1 -> 146, 2 -> 294, 3 -> 634
/*     */     //   96: aload #18
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_2
/*     */     //   102: aload_1
/*     */     //   103: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/openapi/vcs/changes/Change;)Lkotlin/jvm/functions/Function0;
/*     */     //   108: aload #19
/*     */     //   110: aload #19
/*     */     //   112: aload_0
/*     */     //   113: putfield L$0 : Ljava/lang/Object;
/*     */     //   116: aload #19
/*     */     //   118: aload_1
/*     */     //   119: putfield L$1 : Ljava/lang/Object;
/*     */     //   122: aload #19
/*     */     //   124: aload_2
/*     */     //   125: putfield L$2 : Ljava/lang/Object;
/*     */     //   128: aload #19
/*     */     //   130: iconst_1
/*     */     //   131: putfield label : I
/*     */     //   134: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   137: dup
/*     */     //   138: aload #20
/*     */     //   140: if_acmpne -> 180
/*     */     //   143: aload #20
/*     */     //   145: areturn
/*     */     //   146: aload #19
/*     */     //   148: getfield L$2 : Ljava/lang/Object;
/*     */     //   151: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   154: astore_2
/*     */     //   155: aload #19
/*     */     //   157: getfield L$1 : Ljava/lang/Object;
/*     */     //   160: checkcast com/intellij/openapi/vcs/changes/Change
/*     */     //   163: astore_1
/*     */     //   164: aload #19
/*     */     //   166: getfield L$0 : Ljava/lang/Object;
/*     */     //   169: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl
/*     */     //   172: astore_0
/*     */     //   173: aload #18
/*     */     //   175: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   178: aload #18
/*     */     //   180: dup
/*     */     //   181: ldc_w 'readAction(...)'
/*     */     //   184: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   187: checkcast java/util/List
/*     */     //   190: astore #4
/*     */     //   192: aload #4
/*     */     //   194: checkcast java/util/Collection
/*     */     //   197: ldc_w com/intellij/openapi/diff/impl/patch/TextFilePatch
/*     */     //   200: invokestatic findAll : (Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/List;
/*     */     //   203: astore #6
/*     */     //   205: aload #6
/*     */     //   207: ldc_w 'findAll(...)'
/*     */     //   210: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   213: aload #6
/*     */     //   215: astore #5
/*     */     //   217: aload_1
/*     */     //   218: invokevirtual getVirtualFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   221: astore #6
/*     */     //   223: aload #6
/*     */     //   225: ifnonnull -> 241
/*     */     //   228: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   231: ldc_w 'Change is not valid'
/*     */     //   234: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   237: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult$Failure.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult$Failure;
/*     */     //   240: areturn
/*     */     //   241: aload #6
/*     */     //   243: <illegal opcode> invoke : (Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function0;
/*     */     //   248: aload #19
/*     */     //   250: aload #19
/*     */     //   252: aload_0
/*     */     //   253: putfield L$0 : Ljava/lang/Object;
/*     */     //   256: aload #19
/*     */     //   258: aload_2
/*     */     //   259: putfield L$1 : Ljava/lang/Object;
/*     */     //   262: aload #19
/*     */     //   264: aload #5
/*     */     //   266: putfield L$2 : Ljava/lang/Object;
/*     */     //   269: aload #19
/*     */     //   271: aload #6
/*     */     //   273: putfield L$3 : Ljava/lang/Object;
/*     */     //   276: aload #19
/*     */     //   278: iconst_2
/*     */     //   279: putfield label : I
/*     */     //   282: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   285: dup
/*     */     //   286: aload #20
/*     */     //   288: if_acmpne -> 339
/*     */     //   291: aload #20
/*     */     //   293: areturn
/*     */     //   294: aload #19
/*     */     //   296: getfield L$3 : Ljava/lang/Object;
/*     */     //   299: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   302: astore #6
/*     */     //   304: aload #19
/*     */     //   306: getfield L$2 : Ljava/lang/Object;
/*     */     //   309: checkcast java/util/List
/*     */     //   312: astore #5
/*     */     //   314: aload #19
/*     */     //   316: getfield L$1 : Ljava/lang/Object;
/*     */     //   319: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   322: astore_2
/*     */     //   323: aload #19
/*     */     //   325: getfield L$0 : Ljava/lang/Object;
/*     */     //   328: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl
/*     */     //   331: astore_0
/*     */     //   332: aload #18
/*     */     //   334: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   337: aload #18
/*     */     //   339: checkcast com/intellij/openapi/editor/Document
/*     */     //   342: astore #7
/*     */     //   344: aload #7
/*     */     //   346: ifnonnull -> 366
/*     */     //   349: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   352: aload #6
/*     */     //   354: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/lang/String;
/*     */     //   359: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   362: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult$Failure.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult$Failure;
/*     */     //   365: areturn
/*     */     //   366: aload #5
/*     */     //   368: checkcast java/lang/Iterable
/*     */     //   371: astore #9
/*     */     //   373: iconst_0
/*     */     //   374: istore #10
/*     */     //   376: aload #9
/*     */     //   378: astore #11
/*     */     //   380: new java/util/ArrayList
/*     */     //   383: dup
/*     */     //   384: invokespecial <init> : ()V
/*     */     //   387: checkcast java/util/Collection
/*     */     //   390: astore #12
/*     */     //   392: iconst_0
/*     */     //   393: istore #13
/*     */     //   395: aload #11
/*     */     //   397: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   402: astore #14
/*     */     //   404: aload #14
/*     */     //   406: invokeinterface hasNext : ()Z
/*     */     //   411: ifeq -> 461
/*     */     //   414: aload #14
/*     */     //   416: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   421: astore #15
/*     */     //   423: aload #15
/*     */     //   425: checkcast com/intellij/openapi/diff/impl/patch/TextFilePatch
/*     */     //   428: astore #16
/*     */     //   430: iconst_0
/*     */     //   431: istore #17
/*     */     //   433: aload #16
/*     */     //   435: invokevirtual getHunks : ()Ljava/util/List;
/*     */     //   438: dup
/*     */     //   439: ldc_w 'getHunks(...)'
/*     */     //   442: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   445: checkcast java/lang/Iterable
/*     */     //   448: astore #16
/*     */     //   450: aload #12
/*     */     //   452: aload #16
/*     */     //   454: invokestatic addAll : (Ljava/util/Collection;Ljava/lang/Iterable;)Z
/*     */     //   457: pop
/*     */     //   458: goto -> 404
/*     */     //   461: aload #12
/*     */     //   463: checkcast java/util/List
/*     */     //   466: nop
/*     */     //   467: astore #8
/*     */     //   469: aload #7
/*     */     //   471: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   476: checkcast java/lang/CharSequence
/*     */     //   479: aload #8
/*     */     //   481: invokestatic apply : (Ljava/lang/CharSequence;Ljava/util/List;)Lcom/intellij/openapi/diff/impl/patch/apply/GenericPatchApplier$AppliedPatch;
/*     */     //   484: dup
/*     */     //   485: ifnull -> 494
/*     */     //   488: getfield patchedText : Ljava/lang/String;
/*     */     //   491: goto -> 496
/*     */     //   494: pop
/*     */     //   495: aconst_null
/*     */     //   496: astore #9
/*     */     //   498: aload #9
/*     */     //   500: ifnonnull -> 520
/*     */     //   503: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   506: aload #6
/*     */     //   508: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/lang/String;
/*     */     //   513: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   516: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult$Failure.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult$Failure;
/*     */     //   519: areturn
/*     */     //   520: aload #7
/*     */     //   522: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   527: aload #9
/*     */     //   529: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   532: ifne -> 565
/*     */     //   535: aload_2
/*     */     //   536: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange$Companion;
/*     */     //   539: aload_2
/*     */     //   540: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   545: aload #6
/*     */     //   547: aload #7
/*     */     //   549: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   554: aload #9
/*     */     //   556: invokevirtual from : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;
/*     */     //   559: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   562: invokestatic createEditPathMarker : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/util/List;)V
/*     */     //   565: aload_0
/*     */     //   566: getfield executionContext : Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   569: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   574: aload #7
/*     */     //   576: aload #9
/*     */     //   578: ldc_w 'command.undo.name'
/*     */     //   581: iconst_0
/*     */     //   582: anewarray java/lang/Object
/*     */     //   585: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   588: aload #19
/*     */     //   590: aload #19
/*     */     //   592: aload #7
/*     */     //   594: putfield L$0 : Ljava/lang/Object;
/*     */     //   597: aload #19
/*     */     //   599: aload #8
/*     */     //   601: putfield L$1 : Ljava/lang/Object;
/*     */     //   604: aload #19
/*     */     //   606: aconst_null
/*     */     //   607: putfield L$2 : Ljava/lang/Object;
/*     */     //   610: aload #19
/*     */     //   612: aconst_null
/*     */     //   613: putfield L$3 : Ljava/lang/Object;
/*     */     //   616: aload #19
/*     */     //   618: iconst_3
/*     */     //   619: putfield label : I
/*     */     //   622: invokestatic updateDocument : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   625: dup
/*     */     //   626: aload #20
/*     */     //   628: if_acmpne -> 661
/*     */     //   631: aload #20
/*     */     //   633: areturn
/*     */     //   634: aload #19
/*     */     //   636: getfield L$1 : Ljava/lang/Object;
/*     */     //   639: checkcast java/util/List
/*     */     //   642: astore #8
/*     */     //   644: aload #19
/*     */     //   646: getfield L$0 : Ljava/lang/Object;
/*     */     //   649: checkcast com/intellij/openapi/editor/Document
/*     */     //   652: astore #7
/*     */     //   654: aload #18
/*     */     //   656: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   659: aload #18
/*     */     //   661: pop
/*     */     //   662: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult$Success
/*     */     //   665: dup
/*     */     //   666: aload #7
/*     */     //   668: aload #8
/*     */     //   670: invokespecial <init> : (Lcom/intellij/openapi/editor/Document;Ljava/util/List;)V
/*     */     //   673: areturn
/*     */     //   674: new java/lang/IllegalStateException
/*     */     //   677: dup
/*     */     //   678: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   680: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   683: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #50	-> 60
/*     */     //   #51	-> 101
/*     */     //   #50	-> 143
/*     */     //   #51	-> 180
/*     */     //   #54	-> 192
/*     */     //   #55	-> 217
/*     */     //   #56	-> 223
/*     */     //   #57	-> 225
/*     */     //   #58	-> 228
/*     */     //   #59	-> 237
/*     */     //   #63	-> 241
/*     */     //   #50	-> 291
/*     */     //   #64	-> 344
/*     */     //   #65	-> 349
/*     */     //   #66	-> 362
/*     */     //   #68	-> 366
/*     */     //   #110	-> 376
/*     */     //   #111	-> 395
/*     */     //   #112	-> 423
/*     */     //   #68	-> 433
/*     */     //   #112	-> 448
/*     */     //   #113	-> 450
/*     */     //   #115	-> 461
/*     */     //   #110	-> 466
/*     */     //   #68	-> 467
/*     */     //   #69	-> 469
/*     */     //   #70	-> 498
/*     */     //   #71	-> 503
/*     */     //   #72	-> 516
/*     */     //   #74	-> 520
/*     */     //   #77	-> 535
/*     */     //   #78	-> 536
/*     */     //   #76	-> 562
/*     */     //   #81	-> 565
/*     */     //   #50	-> 631
/*     */     //   #82	-> 661
/*     */     //   #50	-> 674
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	45	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl;
/*     */     //   173	121	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl;
/*     */     //   332	17	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl;
/*     */     //   366	82	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl;
/*     */     //   448	19	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl;
/*     */     //   467	36	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl;
/*     */     //   520	105	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditServiceImpl;
/*     */     //   101	45	1	change	Lcom/intellij/openapi/vcs/changes/Change;
/*     */     //   164	59	1	change	Lcom/intellij/openapi/vcs/changes/Change;
/*     */     //   101	45	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   155	139	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   323	26	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   366	82	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   448	19	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   467	36	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   520	42	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   192	13	4	reversePatches	Ljava/util/List;
/*     */     //   217	77	5	applicablePatches	Ljava/util/List;
/*     */     //   314	35	5	applicablePatches	Ljava/util/List;
/*     */     //   366	7	5	applicablePatches	Ljava/util/List;
/*     */     //   223	71	6	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   304	58	6	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   366	82	6	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   448	19	6	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   467	49	6	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   520	42	6	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   344	5	7	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   366	82	7	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   448	19	7	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   467	36	7	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   520	114	7	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   654	20	7	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   469	34	8	hunks	Ljava/util/List;
/*     */     //   520	114	8	hunks	Ljava/util/List;
/*     */     //   644	30	8	hunks	Ljava/util/List;
/*     */     //   373	19	9	$this$flatMap$iv	Ljava/lang/Iterable;
/*     */     //   498	5	9	reverted	Ljava/lang/String;
/*     */     //   520	105	9	reverted	Ljava/lang/String;
/*     */     //   392	12	11	$this$flatMapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   392	71	12	destination$iv$iv	Ljava/util/Collection;
/*     */     //   423	35	15	element$iv$iv	Ljava/lang/Object;
/*     */     //   430	18	16	it	Lcom/intellij/openapi/diff/impl/patch/TextFilePatch;
/*     */     //   450	8	16	list$iv$iv	Ljava/lang/Iterable;
/*     */     //   433	15	17	$i$a$-flatMap-EditServiceImpl$undoEdit$hunks$1	I
/*     */     //   395	68	13	$i$f$flatMapTo	I
/*     */     //   376	91	10	$i$f$flatMap	I
/*     */     //   0	684	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	624	19	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	617	18	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private static final List undoEdit$lambda$4(ExecutionAgentContext $context, Change $change) {
/*     */     return IdeaTextPatchBuilder.buildPatch($context.getProject(), CollectionsKt.listOf($change), Paths.get("/", new String[0]), true);
/*     */   }
/*     */   
/*     */   private static final Document undoEdit$lambda$5(VirtualFile $file) {
/*     */     return FileDocumentManager.getInstance().getDocument($file);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditServiceImpl.kt", l = {51, 63, 81}, i = {0, 0, 0, 1, 1, 1, 1, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"}, n = {"this", "change", "context", "this", "context", "applicablePatches", "file", "document", "hunks"}, m = "undoEdit", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditServiceImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EditServiceImpl$undoEdit$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     EditServiceImpl$undoEdit$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EditServiceImpl.this.undoEdit(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditServiceImpl.kt", l = {44}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$3"}, n = {"this", "destination$iv$iv", "destination$iv$iv"}, m = "undoLastEdit", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditServiceImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EditServiceImpl$undoLastEdit$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     int label;
/*     */     
/*     */     EditServiceImpl$undoLastEdit$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EditServiceImpl.this.undoLastEdit((Continuation<? super List<? extends UndoResult>>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\EditServiceImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */