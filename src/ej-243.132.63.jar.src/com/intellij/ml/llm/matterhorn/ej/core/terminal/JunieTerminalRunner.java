/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.TerminalWidgetImpl;
/*    */ import com.intellij.openapi.Disposable;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.plugins.terminal.ShellStartupOptions;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\002\b\004\030\000 \0302\0020\001:\001\030B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\030\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\024J\030\020\016\032\0020\0172\006\020\n\032\0020\0132\006\020\f\032\0020\rH\002J \020\020\032\0020\0172\006\020\021\032\0020\0132\006\020\f\032\0020\rH@¢\006\004\b\022\020\023J\036\020\024\032\0020\0252\006\020\026\032\0020\0172\006\020\f\032\0020\rH@¢\006\002\020\027R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner_VersionDependent;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/openapi/project/Project;)V", "createShellTerminalWidget", "Lcom/intellij/terminal/ui/TerminalWidget;", "parent", "Lcom/intellij/openapi/Disposable;", "startupOptions", "Lorg/jetbrains/plugins/terminal/ShellStartupOptions;", "createTerminalWidgetImpl", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;", "launchJunieTerminalWidget", "parentDisposable", "launchJunieTerminalWidget$ej_core", "(Lcom/intellij/openapi/Disposable;Lorg/jetbrains/plugins/terminal/ShellStartupOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchWidget", "", "widget", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;Lorg/jetbrains/plugins/terminal/ShellStartupOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-core"})
/*    */ public final class JunieTerminalRunner extends JunieTerminalRunner_VersionDependent {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/* 16 */   public JunieTerminalRunner(@NotNull CoroutineScope scope, @NotNull Project project) { super(project);
/*    */     this.scope = scope; } @NotNull private final CoroutineScope scope; @NotNull
/* 18 */   protected TerminalWidget createShellTerminalWidget(@NotNull Disposable parent, @NotNull ShellStartupOptions startupOptions) { Intrinsics.checkNotNullParameter(parent, "parent"); Intrinsics.checkNotNullParameter(startupOptions, "startupOptions"); return (TerminalWidget)createTerminalWidgetImpl(parent, startupOptions); }
/*    */ 
/*    */   
/*    */   private final TerminalWidgetImpl createTerminalWidgetImpl(Disposable parent, ShellStartupOptions startupOptions) {
/* 22 */     Intrinsics.checkNotNullExpressionValue(this.myProject, "myProject"); Intrinsics.checkNotNullExpressionValue(getSettingsProvider(), "getSettingsProvider(...)"); return new TerminalWidgetImpl(this.myProject, getSettingsProvider(), parent);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final Object launchJunieTerminalWidget$ej_core(@NotNull Disposable parentDisposable, @NotNull ShellStartupOptions startupOptions, @NotNull Continuation $completion)
/*    */   {
/* 29 */     TerminalWidgetImpl widget = createTerminalWidgetImpl(parentDisposable, startupOptions);
/* 30 */     return BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new JunieTerminalRunner$launchJunieTerminalWidget$2(widget, startupOptions, null), $completion); } @DebugMetadata(f = "JunieTerminalRunner.kt", l = {31}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.JunieTerminalRunner$launchJunieTerminalWidget$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;", "Lkotlinx/coroutines/CoroutineScope;"}) static final class JunieTerminalRunner$launchJunieTerminalWidget$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TerminalWidgetImpl>, Object> { int label; JunieTerminalRunner$launchJunieTerminalWidget$2(TerminalWidgetImpl $widget, ShellStartupOptions $startupOptions, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 31 */           this.label = 1; if (JunieTerminalRunner.this.launchWidget(this.$widget, this.$startupOptions, (Continuation)this) == object) return object;  JunieTerminalRunner.this.launchWidget(this.$widget, this.$startupOptions, (Continuation)this);
/* 32 */           return this.$widget;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return this.$widget; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super JunieTerminalRunner$launchJunieTerminalWidget$2> $completion) { return (Continuation<Unit>)new JunieTerminalRunner$launchJunieTerminalWidget$2(this.$widget, this.$startupOptions, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((JunieTerminalRunner$launchJunieTerminalWidget$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*    */   private final Object launchWidget(TerminalWidgetImpl widget, ShellStartupOptions startupOptions, Continuation $completion) { // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner$launchWidget$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner$launchWidget$1
/*    */     //   11: astore #12
/*    */     //   13: aload #12
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #12
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner$launchWidget$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #12
/*    */     //   50: aload #12
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #11
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #13
/*    */     //   62: aload #12
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 515, 0 -> 100, 1 -> 156, 2 -> 251, 3 -> 334, 4 -> 503
/*    */     //   100: aload #11
/*    */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   105: invokestatic getIO : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*    */     //   108: checkcast kotlin/coroutines/CoroutineContext
/*    */     //   111: new com/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner$launchWidget$configuredOptions$1
/*    */     //   114: dup
/*    */     //   115: aload_0
/*    */     //   116: aload_2
/*    */     //   117: aconst_null
/*    */     //   118: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner;Lorg/jetbrains/plugins/terminal/ShellStartupOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   121: checkcast kotlin/jvm/functions/Function2
/*    */     //   124: aload #12
/*    */     //   126: aload #12
/*    */     //   128: aload_0
/*    */     //   129: putfield L$0 : Ljava/lang/Object;
/*    */     //   132: aload #12
/*    */     //   134: aload_1
/*    */     //   135: putfield L$1 : Ljava/lang/Object;
/*    */     //   138: aload #12
/*    */     //   140: iconst_1
/*    */     //   141: putfield label : I
/*    */     //   144: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   147: dup
/*    */     //   148: aload #13
/*    */     //   150: if_acmpne -> 181
/*    */     //   153: aload #13
/*    */     //   155: areturn
/*    */     //   156: aload #12
/*    */     //   158: getfield L$1 : Ljava/lang/Object;
/*    */     //   161: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl
/*    */     //   164: astore_1
/*    */     //   165: aload #12
/*    */     //   167: getfield L$0 : Ljava/lang/Object;
/*    */     //   170: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner
/*    */     //   173: astore_0
/*    */     //   174: aload #11
/*    */     //   176: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   179: aload #11
/*    */     //   181: dup
/*    */     //   182: ldc 'withContext(...)'
/*    */     //   184: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   187: checkcast org/jetbrains/plugins/terminal/ShellStartupOptions
/*    */     //   190: astore #4
/*    */     //   192: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*    */     //   195: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*    */     //   198: new com/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner$launchWidget$initialSizeFuture$1
/*    */     //   201: dup
/*    */     //   202: aload_1
/*    */     //   203: aload #4
/*    */     //   205: aconst_null
/*    */     //   206: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;Lorg/jetbrains/plugins/terminal/ShellStartupOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   209: checkcast kotlin/jvm/functions/Function2
/*    */     //   212: aload #12
/*    */     //   214: aload #12
/*    */     //   216: aload_0
/*    */     //   217: putfield L$0 : Ljava/lang/Object;
/*    */     //   220: aload #12
/*    */     //   222: aload_1
/*    */     //   223: putfield L$1 : Ljava/lang/Object;
/*    */     //   226: aload #12
/*    */     //   228: aload #4
/*    */     //   230: putfield L$2 : Ljava/lang/Object;
/*    */     //   233: aload #12
/*    */     //   235: iconst_2
/*    */     //   236: putfield label : I
/*    */     //   239: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   242: dup
/*    */     //   243: aload #13
/*    */     //   245: if_acmpne -> 286
/*    */     //   248: aload #13
/*    */     //   250: areturn
/*    */     //   251: aload #12
/*    */     //   253: getfield L$2 : Ljava/lang/Object;
/*    */     //   256: checkcast org/jetbrains/plugins/terminal/ShellStartupOptions
/*    */     //   259: astore #4
/*    */     //   261: aload #12
/*    */     //   263: getfield L$1 : Ljava/lang/Object;
/*    */     //   266: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl
/*    */     //   269: astore_1
/*    */     //   270: aload #12
/*    */     //   272: getfield L$0 : Ljava/lang/Object;
/*    */     //   275: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner
/*    */     //   278: astore_0
/*    */     //   279: aload #11
/*    */     //   281: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   284: aload #11
/*    */     //   286: checkcast kotlinx/coroutines/Deferred
/*    */     //   289: astore #5
/*    */     //   291: aload #5
/*    */     //   293: aload #12
/*    */     //   295: aload #12
/*    */     //   297: aload_0
/*    */     //   298: putfield L$0 : Ljava/lang/Object;
/*    */     //   301: aload #12
/*    */     //   303: aload_1
/*    */     //   304: putfield L$1 : Ljava/lang/Object;
/*    */     //   307: aload #12
/*    */     //   309: aload #4
/*    */     //   311: putfield L$2 : Ljava/lang/Object;
/*    */     //   314: aload #12
/*    */     //   316: iconst_3
/*    */     //   317: putfield label : I
/*    */     //   320: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   325: dup
/*    */     //   326: aload #13
/*    */     //   328: if_acmpne -> 369
/*    */     //   331: aload #13
/*    */     //   333: areturn
/*    */     //   334: aload #12
/*    */     //   336: getfield L$2 : Ljava/lang/Object;
/*    */     //   339: checkcast org/jetbrains/plugins/terminal/ShellStartupOptions
/*    */     //   342: astore #4
/*    */     //   344: aload #12
/*    */     //   346: getfield L$1 : Ljava/lang/Object;
/*    */     //   349: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl
/*    */     //   352: astore_1
/*    */     //   353: aload #12
/*    */     //   355: getfield L$0 : Ljava/lang/Object;
/*    */     //   358: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner
/*    */     //   361: astore_0
/*    */     //   362: aload #11
/*    */     //   364: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   367: aload #11
/*    */     //   369: checkcast com/jediterm/core/util/TermSize
/*    */     //   372: astore #6
/*    */     //   374: aload #6
/*    */     //   376: dup
/*    */     //   377: ifnonnull -> 392
/*    */     //   380: pop
/*    */     //   381: new com/jediterm/core/util/TermSize
/*    */     //   384: dup
/*    */     //   385: bipush #80
/*    */     //   387: bipush #24
/*    */     //   389: invokespecial <init> : (II)V
/*    */     //   392: astore #7
/*    */     //   394: aload_0
/*    */     //   395: aload #4
/*    */     //   397: invokevirtual builder : ()Lorg/jetbrains/plugins/terminal/ShellStartupOptions$Builder;
/*    */     //   400: aload #7
/*    */     //   402: invokevirtual initialTermSize : (Lcom/jediterm/core/util/TermSize;)Lorg/jetbrains/plugins/terminal/ShellStartupOptions$Builder;
/*    */     //   405: invokevirtual build : ()Lorg/jetbrains/plugins/terminal/ShellStartupOptions;
/*    */     //   408: invokevirtual createProcess : (Lorg/jetbrains/plugins/terminal/ShellStartupOptions;)Lcom/pty4j/PtyProcess;
/*    */     //   411: astore #9
/*    */     //   413: aload #9
/*    */     //   415: ldc 'createProcess(...)'
/*    */     //   417: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   420: aload #9
/*    */     //   422: astore #8
/*    */     //   424: aload_0
/*    */     //   425: aload #8
/*    */     //   427: invokevirtual createTtyConnector : (Lcom/pty4j/PtyProcess;)Lcom/jediterm/terminal/TtyConnector;
/*    */     //   430: astore #10
/*    */     //   432: aload #10
/*    */     //   434: ldc 'createTtyConnector(...)'
/*    */     //   436: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   439: aload #10
/*    */     //   441: astore #9
/*    */     //   443: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*    */     //   446: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*    */     //   449: new com/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner$launchWidget$2
/*    */     //   452: dup
/*    */     //   453: aload_1
/*    */     //   454: aload #9
/*    */     //   456: aload #7
/*    */     //   458: aconst_null
/*    */     //   459: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;Lcom/jediterm/terminal/TtyConnector;Lcom/jediterm/core/util/TermSize;Lkotlin/coroutines/Continuation;)V
/*    */     //   462: checkcast kotlin/jvm/functions/Function2
/*    */     //   465: aload #12
/*    */     //   467: aload #12
/*    */     //   469: aconst_null
/*    */     //   470: putfield L$0 : Ljava/lang/Object;
/*    */     //   473: aload #12
/*    */     //   475: aconst_null
/*    */     //   476: putfield L$1 : Ljava/lang/Object;
/*    */     //   479: aload #12
/*    */     //   481: aconst_null
/*    */     //   482: putfield L$2 : Ljava/lang/Object;
/*    */     //   485: aload #12
/*    */     //   487: iconst_4
/*    */     //   488: putfield label : I
/*    */     //   491: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   494: dup
/*    */     //   495: aload #13
/*    */     //   497: if_acmpne -> 510
/*    */     //   500: aload #13
/*    */     //   502: areturn
/*    */     //   503: aload #11
/*    */     //   505: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   508: aload #11
/*    */     //   510: pop
/*    */     //   511: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   514: areturn
/*    */     //   515: new java/lang/IllegalStateException
/*    */     //   518: dup
/*    */     //   519: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   521: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   524: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #36	-> 60
/*    */     //   #40	-> 105
/*    */     //   #36	-> 153
/*    */     //   #40	-> 181
/*    */     //   #43	-> 192
/*    */     //   #36	-> 248
/*    */     //   #46	-> 291
/*    */     //   #36	-> 331
/*    */     //   #47	-> 374
/*    */     //   #48	-> 394
/*    */     //   #49	-> 424
/*    */     //   #50	-> 443
/*    */     //   #36	-> 500
/*    */     //   #53	-> 510
/*    */     //   #36	-> 515
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   105	51	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner;
/*    */     //   174	77	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner;
/*    */     //   279	55	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner;
/*    */     //   362	70	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner;
/*    */     //   105	51	1	widget	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;
/*    */     //   165	86	1	widget	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;
/*    */     //   270	64	1	widget	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;
/*    */     //   353	141	1	widget	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;
/*    */     //   105	42	2	startupOptions	Lorg/jetbrains/plugins/terminal/ShellStartupOptions;
/*    */     //   192	59	4	configuredOptions	Lorg/jetbrains/plugins/terminal/ShellStartupOptions;
/*    */     //   261	73	4	configuredOptions	Lorg/jetbrains/plugins/terminal/ShellStartupOptions;
/*    */     //   344	69	4	configuredOptions	Lorg/jetbrains/plugins/terminal/ShellStartupOptions;
/*    */     //   291	34	5	initialSizeFuture	Lkotlinx/coroutines/Deferred;
/*    */     //   374	6	6	detectedTermSize	Lcom/jediterm/core/util/TermSize;
/*    */     //   394	100	7	termSize	Lcom/jediterm/core/util/TermSize;
/*    */     //   424	8	8	process	Lcom/pty4j/PtyProcess;
/*    */     //   443	51	9	connector	Lcom/jediterm/terminal/TtyConnector;
/*    */     //   0	525	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	465	12	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	458	11	$result	Ljava/lang/Object; }
/*    */   @DebugMetadata(f = "JunieTerminalRunner.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.JunieTerminalRunner$launchWidget$configuredOptions$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\020\000\032\f0\001¢\006\002\b\002¢\006\002\b\003*\0020\004H\n"}, d2 = {"<anonymous>", "Lorg/jetbrains/plugins/terminal/ShellStartupOptions;", "Lorg/jetbrains/annotations/NotNull;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class JunieTerminalRunner$launchWidget$configuredOptions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ShellStartupOptions>, Object> { int label;
/*    */     JunieTerminalRunner$launchWidget$configuredOptions$1(ShellStartupOptions $startupOptions, Continuation $completion) { super(2, $completion); }
/* 40 */     public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 41 */           return JunieTerminalRunner.this.configureStartupOptions(this.$startupOptions); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super JunieTerminalRunner$launchWidget$configuredOptions$1> $completion) { return (Continuation<Unit>)new JunieTerminalRunner$launchWidget$configuredOptions$1(this.$startupOptions, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((JunieTerminalRunner$launchWidget$configuredOptions$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } @DebugMetadata(f = "JunieTerminalRunner.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.JunieTerminalRunner$launchWidget$initialSizeFuture$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\020\000\032\020\022\f\022\n \003*\004\030\0010\0020\0020\001*\0020\004H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Deferred;", "Lcom/jediterm/core/util/TermSize;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}) static final class JunieTerminalRunner$launchWidget$initialSizeFuture$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Deferred<? extends TermSize>>, Object> { int label;
/*    */     JunieTerminalRunner$launchWidget$initialSizeFuture$1(TerminalWidgetImpl $widget, ShellStartupOptions $configuredOptions, Continuation $completion) { super(2, $completion); }
/* 43 */     public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 44 */           return FutureKt.asDeferred(this.$widget.initialize(this.$configuredOptions)); }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super JunieTerminalRunner$launchWidget$initialSizeFuture$1> $completion) { return (Continuation<Unit>)new JunieTerminalRunner$launchWidget$initialSizeFuture$1(this.$widget, this.$configuredOptions, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((JunieTerminalRunner$launchWidget$initialSizeFuture$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*    */   @DebugMetadata(f = "JunieTerminalRunner.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.JunieTerminalRunner$launchWidget$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class JunieTerminalRunner$launchWidget$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label;
/*    */     JunieTerminalRunner$launchWidget$2(TerminalWidgetImpl $widget, TtyConnector $connector, TermSize $termSize, Continuation $completion) { super(2, $completion); }
/* 50 */     public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 51 */           this.$widget.connectToTty(this.$connector, this.$termSize);
/* 52 */           return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super JunieTerminalRunner$launchWidget$2> $completion) { return (Continuation<Unit>)new JunieTerminalRunner$launchWidget$2(this.$widget, this.$connector, this.$termSize, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((JunieTerminalRunner$launchWidget$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\013\n\000\n\002\020\016\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007J\016\020\b\032\0020\0052\006\020\006\032\0020\007¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner$Companion;", "", "<init>", "()V", "isPowerShell", "", "shellName", "", "isBashZshFish", "ej-core"})
/*    */   public static final class Companion { private Companion() {}
/* 57 */     public final boolean isPowerShell(@NotNull String shellName) { Intrinsics.checkNotNullParameter(shellName, "shellName"); return JunieTerminalRunner_VersionDependent.Companion.isPowerShell(shellName); }
/*    */ 
/*    */     
/*    */     public final boolean isBashZshFish(@NotNull String shellName) {
/* 61 */       Intrinsics.checkNotNullParameter(shellName, "shellName"); return JunieTerminalRunner_VersionDependent.Companion.isBashZshFish(shellName);
/*    */     } }
/*    */ 
/*    */   
/*    */   @DebugMetadata(f = "JunieTerminalRunner.kt", l = {40, 43, 46, 50}, i = {0, 0, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"this", "widget", "this", "widget", "configuredOptions", "this", "widget", "configuredOptions"}, m = "launchWidget", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.JunieTerminalRunner")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class JunieTerminalRunner$launchWidget$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     JunieTerminalRunner$launchWidget$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return JunieTerminalRunner.this.launchWidget((TerminalWidgetImpl)null, (ShellStartupOptions)null, (Continuation)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\JunieTerminalRunner.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */