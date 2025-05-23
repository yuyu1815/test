/*     */ package androidx.lifecycle;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Result;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CancellableContinuation;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.CoroutineScopeKt;
/*     */ import kotlinx.coroutines.Dispatchers;
/*     */ import kotlinx.coroutines.Job;
/*     */ import kotlinx.coroutines.sync.Mutex;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032C\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0042'\020\005\032#\b\001\022\004\022\0020\007\022\n\022\b\022\004\022\0020\0010\b\022\006\022\004\030\0010\t0\006¢\006\002\b\nH@¢\006\002\020\013\032C\020\000\032\0020\001*\0020\f2\006\020\003\032\0020\0042'\020\005\032#\b\001\022\004\022\0020\007\022\n\022\b\022\004\022\0020\0010\b\022\006\022\004\030\0010\t0\006¢\006\002\b\nH@¢\006\002\020\r¨\006\016"}, d2 = {"repeatOnLifecycle", "", "Landroidx/lifecycle/Lifecycle;", "state", "Landroidx/lifecycle/Lifecycle$State;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-runtime"})
/*     */ public final class RepeatOnLifecycleKt
/*     */ {
/*     */   @Nullable
/*     */   public static final Object repeatOnLifecycle(@NotNull Lifecycle $this$repeatOnLifecycle, @NotNull Lifecycle.State state, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block, @NotNull Continuation $completion) {
/*  74 */     if (!((state != Lifecycle.State.INITIALIZED) ? 1 : 0)) { int $i$a$-require-RepeatOnLifecycleKt$repeatOnLifecycle$2 = 0; String str = 
/*  75 */         "repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.";
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */     
/*  78 */     if ($this$repeatOnLifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
/*  79 */       return Unit.INSTANCE;
/*     */     }
/*     */ 
/*     */     
/*  83 */     if (CoroutineScopeKt.coroutineScope(new RepeatOnLifecycleKt$repeatOnLifecycle$3($this$repeatOnLifecycle, state, block, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return CoroutineScopeKt.coroutineScope(new RepeatOnLifecycleKt$repeatOnLifecycle$3($this$repeatOnLifecycle, state, block, null), $completion);  CoroutineScopeKt.coroutineScope(new RepeatOnLifecycleKt$repeatOnLifecycle$3($this$repeatOnLifecycle, state, block, null), $completion); return Unit.INSTANCE; } @DebugMetadata(f = "RepeatOnLifecycle.kt", l = {84}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle $receiver, Lifecycle.State $state, Function2<CoroutineScope, Continuation<? super Unit>, Object> $block, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { CoroutineScope $this$coroutineScope; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$coroutineScope = (CoroutineScope)this.L$0;
/*  84 */           this.label = 1; if (BuildersKt.withContext((CoroutineContext)Dispatchers.getMain().getImmediate(), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$this_repeatOnLifecycle, this.$state, $this$coroutineScope, this.$block, null) { Object L$0; Object L$1; Object L$2; Object L$3; Object L$4; Object L$5; int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore #17
/*     */                   //   5: aload_0
/*     */                   //   6: getfield label : I
/*     */                   //   9: tableswitch default -> 474, 0 -> 32, 1 -> 278
/*     */                   //   32: aload_1
/*     */                   //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   36: aload_0
/*     */                   //   37: getfield $this_repeatOnLifecycle : Landroidx/lifecycle/Lifecycle;
/*     */                   //   40: invokevirtual getCurrentState : ()Landroidx/lifecycle/Lifecycle$State;
/*     */                   //   43: getstatic androidx/lifecycle/Lifecycle$State.DESTROYED : Landroidx/lifecycle/Lifecycle$State;
/*     */                   //   46: if_acmpne -> 53
/*     */                   //   49: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   52: areturn
/*     */                   //   53: new kotlin/jvm/internal/Ref$ObjectRef
/*     */                   //   56: dup
/*     */                   //   57: invokespecial <init> : ()V
/*     */                   //   60: astore_2
/*     */                   //   61: new kotlin/jvm/internal/Ref$ObjectRef
/*     */                   //   64: dup
/*     */                   //   65: invokespecial <init> : ()V
/*     */                   //   68: astore_3
/*     */                   //   69: nop
/*     */                   //   70: aload_0
/*     */                   //   71: getfield $state : Landroidx/lifecycle/Lifecycle$State;
/*     */                   //   74: astore #4
/*     */                   //   76: aload_0
/*     */                   //   77: getfield $this_repeatOnLifecycle : Landroidx/lifecycle/Lifecycle;
/*     */                   //   80: astore #5
/*     */                   //   82: aload_0
/*     */                   //   83: getfield $$this$coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */                   //   86: astore #6
/*     */                   //   88: aload_0
/*     */                   //   89: getfield $block : Lkotlin/jvm/functions/Function2;
/*     */                   //   92: astore #7
/*     */                   //   94: iconst_0
/*     */                   //   95: istore #8
/*     */                   //   97: aload_0
/*     */                   //   98: aload_2
/*     */                   //   99: putfield L$0 : Ljava/lang/Object;
/*     */                   //   102: aload_0
/*     */                   //   103: aload_3
/*     */                   //   104: putfield L$1 : Ljava/lang/Object;
/*     */                   //   107: aload_0
/*     */                   //   108: aload #4
/*     */                   //   110: putfield L$2 : Ljava/lang/Object;
/*     */                   //   113: aload_0
/*     */                   //   114: aload #5
/*     */                   //   116: putfield L$3 : Ljava/lang/Object;
/*     */                   //   119: aload_0
/*     */                   //   120: aload #6
/*     */                   //   122: putfield L$4 : Ljava/lang/Object;
/*     */                   //   125: aload_0
/*     */                   //   126: aload #7
/*     */                   //   128: putfield L$5 : Ljava/lang/Object;
/*     */                   //   131: aload_0
/*     */                   //   132: iconst_1
/*     */                   //   133: putfield label : I
/*     */                   //   136: aload_0
/*     */                   //   137: checkcast kotlin/coroutines/Continuation
/*     */                   //   140: astore #9
/*     */                   //   142: iconst_0
/*     */                   //   143: istore #10
/*     */                   //   145: new kotlinx/coroutines/CancellableContinuationImpl
/*     */                   //   148: dup
/*     */                   //   149: aload #9
/*     */                   //   151: invokestatic intercepted : (Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
/*     */                   //   154: iconst_1
/*     */                   //   155: invokespecial <init> : (Lkotlin/coroutines/Continuation;I)V
/*     */                   //   158: astore #11
/*     */                   //   160: aload #11
/*     */                   //   162: invokevirtual initCancellability : ()V
/*     */                   //   165: aload #11
/*     */                   //   167: checkcast kotlinx/coroutines/CancellableContinuation
/*     */                   //   170: astore #12
/*     */                   //   172: iconst_0
/*     */                   //   173: istore #13
/*     */                   //   175: getstatic androidx/lifecycle/Lifecycle$Event.Companion : Landroidx/lifecycle/Lifecycle$Event$Companion;
/*     */                   //   178: aload #4
/*     */                   //   180: invokevirtual upTo : (Landroidx/lifecycle/Lifecycle$State;)Landroidx/lifecycle/Lifecycle$Event;
/*     */                   //   183: astore #14
/*     */                   //   185: getstatic androidx/lifecycle/Lifecycle$Event.Companion : Landroidx/lifecycle/Lifecycle$Event$Companion;
/*     */                   //   188: aload #4
/*     */                   //   190: invokevirtual downFrom : (Landroidx/lifecycle/Lifecycle$State;)Landroidx/lifecycle/Lifecycle$Event;
/*     */                   //   193: astore #15
/*     */                   //   195: iconst_0
/*     */                   //   196: iconst_1
/*     */                   //   197: aconst_null
/*     */                   //   198: invokestatic Mutex$default : (ZILjava/lang/Object;)Lkotlinx/coroutines/sync/Mutex;
/*     */                   //   201: astore #16
/*     */                   //   203: aload_3
/*     */                   //   204: new androidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1
/*     */                   //   207: dup
/*     */                   //   208: aload #14
/*     */                   //   210: aload_2
/*     */                   //   211: aload #6
/*     */                   //   213: aload #15
/*     */                   //   215: aload #12
/*     */                   //   217: aload #16
/*     */                   //   219: aload #7
/*     */                   //   221: invokespecial <init> : (Landroidx/lifecycle/Lifecycle$Event;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlinx/coroutines/CoroutineScope;Landroidx/lifecycle/Lifecycle$Event;Lkotlinx/coroutines/CancellableContinuation;Lkotlinx/coroutines/sync/Mutex;Lkotlin/jvm/functions/Function2;)V
/*     */                   //   224: putfield element : Ljava/lang/Object;
/*     */                   //   227: aload #5
/*     */                   //   229: aload_3
/*     */                   //   230: getfield element : Ljava/lang/Object;
/*     */                   //   233: dup
/*     */                   //   234: ldc 'null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver'
/*     */                   //   236: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */                   //   239: checkcast androidx/lifecycle/LifecycleEventObserver
/*     */                   //   242: checkcast androidx/lifecycle/LifecycleObserver
/*     */                   //   245: invokevirtual addObserver : (Landroidx/lifecycle/LifecycleObserver;)V
/*     */                   //   248: nop
/*     */                   //   249: nop
/*     */                   //   250: aload #11
/*     */                   //   252: invokevirtual getResult : ()Ljava/lang/Object;
/*     */                   //   255: dup
/*     */                   //   256: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   259: if_acmpne -> 269
/*     */                   //   262: aload_0
/*     */                   //   263: checkcast kotlin/coroutines/Continuation
/*     */                   //   266: invokestatic probeCoroutineSuspended : (Lkotlin/coroutines/Continuation;)V
/*     */                   //   269: dup
/*     */                   //   270: aload #17
/*     */                   //   272: if_acmpne -> 335
/*     */                   //   275: aload #17
/*     */                   //   277: areturn
/*     */                   //   278: iconst_0
/*     */                   //   279: istore #8
/*     */                   //   281: aload_0
/*     */                   //   282: getfield L$5 : Ljava/lang/Object;
/*     */                   //   285: checkcast kotlin/jvm/functions/Function2
/*     */                   //   288: pop
/*     */                   //   289: aload_0
/*     */                   //   290: getfield L$4 : Ljava/lang/Object;
/*     */                   //   293: checkcast kotlinx/coroutines/CoroutineScope
/*     */                   //   296: pop
/*     */                   //   297: aload_0
/*     */                   //   298: getfield L$3 : Ljava/lang/Object;
/*     */                   //   301: checkcast androidx/lifecycle/Lifecycle
/*     */                   //   304: pop
/*     */                   //   305: aload_0
/*     */                   //   306: getfield L$2 : Ljava/lang/Object;
/*     */                   //   309: checkcast androidx/lifecycle/Lifecycle$State
/*     */                   //   312: pop
/*     */                   //   313: aload_0
/*     */                   //   314: getfield L$1 : Ljava/lang/Object;
/*     */                   //   317: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */                   //   320: astore_3
/*     */                   //   321: aload_0
/*     */                   //   322: getfield L$0 : Ljava/lang/Object;
/*     */                   //   325: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */                   //   328: astore_2
/*     */                   //   329: nop
/*     */                   //   330: aload_1
/*     */                   //   331: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   334: aload_1
/*     */                   //   335: nop
/*     */                   //   336: pop
/*     */                   //   337: aload_2
/*     */                   //   338: getfield element : Ljava/lang/Object;
/*     */                   //   341: checkcast kotlinx/coroutines/Job
/*     */                   //   344: dup
/*     */                   //   345: ifnull -> 357
/*     */                   //   348: aconst_null
/*     */                   //   349: iconst_1
/*     */                   //   350: aconst_null
/*     */                   //   351: invokestatic cancel$default : (Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
/*     */                   //   354: goto -> 358
/*     */                   //   357: pop
/*     */                   //   358: aload_3
/*     */                   //   359: getfield element : Ljava/lang/Object;
/*     */                   //   362: checkcast androidx/lifecycle/LifecycleEventObserver
/*     */                   //   365: dup
/*     */                   //   366: ifnull -> 398
/*     */                   //   369: astore #5
/*     */                   //   371: aload_0
/*     */                   //   372: getfield $this_repeatOnLifecycle : Landroidx/lifecycle/Lifecycle;
/*     */                   //   375: astore #6
/*     */                   //   377: aload #5
/*     */                   //   379: astore #7
/*     */                   //   381: iconst_0
/*     */                   //   382: istore #8
/*     */                   //   384: aload #6
/*     */                   //   386: aload #7
/*     */                   //   388: checkcast androidx/lifecycle/LifecycleObserver
/*     */                   //   391: invokevirtual removeObserver : (Landroidx/lifecycle/LifecycleObserver;)V
/*     */                   //   394: nop
/*     */                   //   395: goto -> 400
/*     */                   //   398: pop
/*     */                   //   399: nop
/*     */                   //   400: goto -> 470
/*     */                   //   403: astore #4
/*     */                   //   405: aload_2
/*     */                   //   406: getfield element : Ljava/lang/Object;
/*     */                   //   409: checkcast kotlinx/coroutines/Job
/*     */                   //   412: dup
/*     */                   //   413: ifnull -> 425
/*     */                   //   416: aconst_null
/*     */                   //   417: iconst_1
/*     */                   //   418: aconst_null
/*     */                   //   419: invokestatic cancel$default : (Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
/*     */                   //   422: goto -> 426
/*     */                   //   425: pop
/*     */                   //   426: aload_3
/*     */                   //   427: getfield element : Ljava/lang/Object;
/*     */                   //   430: checkcast androidx/lifecycle/LifecycleEventObserver
/*     */                   //   433: dup
/*     */                   //   434: ifnull -> 466
/*     */                   //   437: astore #6
/*     */                   //   439: aload_0
/*     */                   //   440: getfield $this_repeatOnLifecycle : Landroidx/lifecycle/Lifecycle;
/*     */                   //   443: astore #7
/*     */                   //   445: aload #6
/*     */                   //   447: astore #8
/*     */                   //   449: iconst_0
/*     */                   //   450: istore #9
/*     */                   //   452: aload #7
/*     */                   //   454: aload #8
/*     */                   //   456: checkcast androidx/lifecycle/LifecycleObserver
/*     */                   //   459: invokevirtual removeObserver : (Landroidx/lifecycle/LifecycleObserver;)V
/*     */                   //   462: nop
/*     */                   //   463: goto -> 467
/*     */                   //   466: pop
/*     */                   //   467: aload #4
/*     */                   //   469: athrow
/*     */                   //   470: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   473: areturn
/*     */                   //   474: new java/lang/IllegalStateException
/*     */                   //   477: dup
/*     */                   //   478: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   480: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   483: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #84	-> 3
/*     */                   //   #87	-> 36
/*     */                   //   #90	-> 53
/*     */                   //   #93	-> 61
/*     */                   //   #94	-> 69
/*     */                   //   #97	-> 70
/*     */                   //   #166	-> 97
/*     */                   //   #167	-> 145
/*     */                   //   #173	-> 160
/*     */                   //   #174	-> 165
/*     */                   //   #100	-> 175
/*     */                   //   #101	-> 185
/*     */                   //   #102	-> 195
/*     */                   //   #103	-> 203
/*     */                   //   #125	-> 227
/*     */                   //   #126	-> 248
/*     */                   //   #174	-> 249
/*     */                   //   #175	-> 250
/*     */                   //   #166	-> 255
/*     */                   //   #84	-> 275
/*     */                   //   #176	-> 335
/*     */                   //   #128	-> 337
/*     */                   //   #129	-> 358
/*     */                   //   #130	-> 384
/*     */                   //   #131	-> 394
/*     */                   //   #129	-> 395
/*     */                   //   #129	-> 398
/*     */                   //   #132	-> 400
/*     */                   //   #128	-> 403
/*     */                   //   #129	-> 426
/*     */                   //   #130	-> 452
/*     */                   //   #131	-> 462
/*     */                   //   #129	-> 463
/*     */                   //   #129	-> 466
/*     */                   //   #133	-> 470
/*     */                   //   #84	-> 474
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   61	188	2	launchedJob	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   249	29	2	launchedJob	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   329	7	2	launchedJob	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   336	8	2	launchedJob	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   403	9	2	launchedJob	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   69	180	3	observer	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   249	29	3	observer	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   321	15	3	observer	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   336	29	3	observer	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   403	30	3	observer	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   381	14	7	it	Landroidx/lifecycle/LifecycleEventObserver;
/*     */                   //   449	14	8	it	Landroidx/lifecycle/LifecycleEventObserver;
/*     */                   //   142	113	9	uCont$iv	Lkotlin/coroutines/Continuation;
/*     */                   //   160	95	11	cancellable$iv	Lkotlinx/coroutines/CancellableContinuationImpl;
/*     */                   //   172	77	12	cont	Lkotlinx/coroutines/CancellableContinuation;
/*     */                   //   185	64	14	startWorkEvent	Landroidx/lifecycle/Lifecycle$Event;
/*     */                   //   195	54	15	cancelWorkEvent	Landroidx/lifecycle/Lifecycle$Event;
/*     */                   //   203	46	16	mutex	Lkotlinx/coroutines/sync/Mutex;
/*     */                   //   175	74	13	$i$a$-suspendCancellableCoroutine-RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1	I
/*     */                   //   145	110	10	$i$a$-suspendCoroutineUninterceptedOrReturn-CancellableContinuationKt$suspendCancellableCoroutine$2$iv	I
/*     */                   //   97	181	8	$i$f$suspendCancellableCoroutine	I
/*     */                   //   384	11	8	$i$a$-let-RepeatOnLifecycleKt$repeatOnLifecycle$3$1$2	I
/*     */                   //   452	11	9	$i$a$-let-RepeatOnLifecycleKt$repeatOnLifecycle$3$1$2	I
/*     */                   //   36	438	0	this	Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1;
/*     */                   //   36	438	1	$result	Ljava/lang/Object;
/*     */                   //   281	55	8	$i$f$suspendCancellableCoroutine	I
/*     */                   // Exception table:
/*     */                   //   from	to	target	type
/*     */                   //   69	269	403	finally
/*     */                   //   329	337	403	finally
/*  84 */                   //   403	405	403	finally } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object) return object;  BuildersKt.withContext((CoroutineContext)Dispatchers.getMain().getImmediate(), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$this_repeatOnLifecycle, this.$state, $this$coroutineScope, this.$block, null) { Object L$0; Object L$1; Object L$2; Object L$3; Object L$4; Object L$5; int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore #17
/*     */                   //   5: aload_0
/*     */                   //   6: getfield label : I
/*     */                   //   9: tableswitch default -> 474, 0 -> 32, 1 -> 278
/*     */                   //   32: aload_1
/*     */                   //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   36: aload_0
/*     */                   //   37: getfield $this_repeatOnLifecycle : Landroidx/lifecycle/Lifecycle;
/*     */                   //   40: invokevirtual getCurrentState : ()Landroidx/lifecycle/Lifecycle$State;
/*     */                   //   43: getstatic androidx/lifecycle/Lifecycle$State.DESTROYED : Landroidx/lifecycle/Lifecycle$State;
/*     */                   //   46: if_acmpne -> 53
/*     */                   //   49: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   52: areturn
/*     */                   //   53: new kotlin/jvm/internal/Ref$ObjectRef
/*     */                   //   56: dup
/*     */                   //   57: invokespecial <init> : ()V
/*     */                   //   60: astore_2
/*     */                   //   61: new kotlin/jvm/internal/Ref$ObjectRef
/*     */                   //   64: dup
/*     */                   //   65: invokespecial <init> : ()V
/*     */                   //   68: astore_3
/*     */                   //   69: nop
/*     */                   //   70: aload_0
/*     */                   //   71: getfield $state : Landroidx/lifecycle/Lifecycle$State;
/*     */                   //   74: astore #4
/*     */                   //   76: aload_0
/*     */                   //   77: getfield $this_repeatOnLifecycle : Landroidx/lifecycle/Lifecycle;
/*     */                   //   80: astore #5
/*     */                   //   82: aload_0
/*     */                   //   83: getfield $$this$coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */                   //   86: astore #6
/*     */                   //   88: aload_0
/*     */                   //   89: getfield $block : Lkotlin/jvm/functions/Function2;
/*     */                   //   92: astore #7
/*     */                   //   94: iconst_0
/*     */                   //   95: istore #8
/*     */                   //   97: aload_0
/*     */                   //   98: aload_2
/*     */                   //   99: putfield L$0 : Ljava/lang/Object;
/*     */                   //   102: aload_0
/*     */                   //   103: aload_3
/*     */                   //   104: putfield L$1 : Ljava/lang/Object;
/*     */                   //   107: aload_0
/*     */                   //   108: aload #4
/*     */                   //   110: putfield L$2 : Ljava/lang/Object;
/*     */                   //   113: aload_0
/*     */                   //   114: aload #5
/*     */                   //   116: putfield L$3 : Ljava/lang/Object;
/*     */                   //   119: aload_0
/*     */                   //   120: aload #6
/*     */                   //   122: putfield L$4 : Ljava/lang/Object;
/*     */                   //   125: aload_0
/*     */                   //   126: aload #7
/*     */                   //   128: putfield L$5 : Ljava/lang/Object;
/*     */                   //   131: aload_0
/*     */                   //   132: iconst_1
/*     */                   //   133: putfield label : I
/*     */                   //   136: aload_0
/*     */                   //   137: checkcast kotlin/coroutines/Continuation
/*     */                   //   140: astore #9
/*     */                   //   142: iconst_0
/*     */                   //   143: istore #10
/*     */                   //   145: new kotlinx/coroutines/CancellableContinuationImpl
/*     */                   //   148: dup
/*     */                   //   149: aload #9
/*     */                   //   151: invokestatic intercepted : (Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
/*     */                   //   154: iconst_1
/*     */                   //   155: invokespecial <init> : (Lkotlin/coroutines/Continuation;I)V
/*     */                   //   158: astore #11
/*     */                   //   160: aload #11
/*     */                   //   162: invokevirtual initCancellability : ()V
/*     */                   //   165: aload #11
/*     */                   //   167: checkcast kotlinx/coroutines/CancellableContinuation
/*     */                   //   170: astore #12
/*     */                   //   172: iconst_0
/*     */                   //   173: istore #13
/*     */                   //   175: getstatic androidx/lifecycle/Lifecycle$Event.Companion : Landroidx/lifecycle/Lifecycle$Event$Companion;
/*     */                   //   178: aload #4
/*     */                   //   180: invokevirtual upTo : (Landroidx/lifecycle/Lifecycle$State;)Landroidx/lifecycle/Lifecycle$Event;
/*     */                   //   183: astore #14
/*     */                   //   185: getstatic androidx/lifecycle/Lifecycle$Event.Companion : Landroidx/lifecycle/Lifecycle$Event$Companion;
/*     */                   //   188: aload #4
/*     */                   //   190: invokevirtual downFrom : (Landroidx/lifecycle/Lifecycle$State;)Landroidx/lifecycle/Lifecycle$Event;
/*     */                   //   193: astore #15
/*     */                   //   195: iconst_0
/*     */                   //   196: iconst_1
/*     */                   //   197: aconst_null
/*     */                   //   198: invokestatic Mutex$default : (ZILjava/lang/Object;)Lkotlinx/coroutines/sync/Mutex;
/*     */                   //   201: astore #16
/*     */                   //   203: aload_3
/*     */                   //   204: new androidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1
/*     */                   //   207: dup
/*     */                   //   208: aload #14
/*     */                   //   210: aload_2
/*     */                   //   211: aload #6
/*     */                   //   213: aload #15
/*     */                   //   215: aload #12
/*     */                   //   217: aload #16
/*     */                   //   219: aload #7
/*     */                   //   221: invokespecial <init> : (Landroidx/lifecycle/Lifecycle$Event;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlinx/coroutines/CoroutineScope;Landroidx/lifecycle/Lifecycle$Event;Lkotlinx/coroutines/CancellableContinuation;Lkotlinx/coroutines/sync/Mutex;Lkotlin/jvm/functions/Function2;)V
/*     */                   //   224: putfield element : Ljava/lang/Object;
/*     */                   //   227: aload #5
/*     */                   //   229: aload_3
/*     */                   //   230: getfield element : Ljava/lang/Object;
/*     */                   //   233: dup
/*     */                   //   234: ldc 'null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver'
/*     */                   //   236: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */                   //   239: checkcast androidx/lifecycle/LifecycleEventObserver
/*     */                   //   242: checkcast androidx/lifecycle/LifecycleObserver
/*     */                   //   245: invokevirtual addObserver : (Landroidx/lifecycle/LifecycleObserver;)V
/*     */                   //   248: nop
/*     */                   //   249: nop
/*     */                   //   250: aload #11
/*     */                   //   252: invokevirtual getResult : ()Ljava/lang/Object;
/*     */                   //   255: dup
/*     */                   //   256: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   259: if_acmpne -> 269
/*     */                   //   262: aload_0
/*     */                   //   263: checkcast kotlin/coroutines/Continuation
/*     */                   //   266: invokestatic probeCoroutineSuspended : (Lkotlin/coroutines/Continuation;)V
/*     */                   //   269: dup
/*     */                   //   270: aload #17
/*     */                   //   272: if_acmpne -> 335
/*     */                   //   275: aload #17
/*     */                   //   277: areturn
/*     */                   //   278: iconst_0
/*     */                   //   279: istore #8
/*     */                   //   281: aload_0
/*     */                   //   282: getfield L$5 : Ljava/lang/Object;
/*     */                   //   285: checkcast kotlin/jvm/functions/Function2
/*     */                   //   288: pop
/*     */                   //   289: aload_0
/*     */                   //   290: getfield L$4 : Ljava/lang/Object;
/*     */                   //   293: checkcast kotlinx/coroutines/CoroutineScope
/*     */                   //   296: pop
/*     */                   //   297: aload_0
/*     */                   //   298: getfield L$3 : Ljava/lang/Object;
/*     */                   //   301: checkcast androidx/lifecycle/Lifecycle
/*     */                   //   304: pop
/*     */                   //   305: aload_0
/*     */                   //   306: getfield L$2 : Ljava/lang/Object;
/*     */                   //   309: checkcast androidx/lifecycle/Lifecycle$State
/*     */                   //   312: pop
/*     */                   //   313: aload_0
/*     */                   //   314: getfield L$1 : Ljava/lang/Object;
/*     */                   //   317: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */                   //   320: astore_3
/*     */                   //   321: aload_0
/*     */                   //   322: getfield L$0 : Ljava/lang/Object;
/*     */                   //   325: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */                   //   328: astore_2
/*     */                   //   329: nop
/*     */                   //   330: aload_1
/*     */                   //   331: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   334: aload_1
/*     */                   //   335: nop
/*     */                   //   336: pop
/*     */                   //   337: aload_2
/*     */                   //   338: getfield element : Ljava/lang/Object;
/*     */                   //   341: checkcast kotlinx/coroutines/Job
/*     */                   //   344: dup
/*     */                   //   345: ifnull -> 357
/*     */                   //   348: aconst_null
/*     */                   //   349: iconst_1
/*     */                   //   350: aconst_null
/*     */                   //   351: invokestatic cancel$default : (Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
/*     */                   //   354: goto -> 358
/*     */                   //   357: pop
/*     */                   //   358: aload_3
/*     */                   //   359: getfield element : Ljava/lang/Object;
/*     */                   //   362: checkcast androidx/lifecycle/LifecycleEventObserver
/*     */                   //   365: dup
/*     */                   //   366: ifnull -> 398
/*     */                   //   369: astore #5
/*     */                   //   371: aload_0
/*     */                   //   372: getfield $this_repeatOnLifecycle : Landroidx/lifecycle/Lifecycle;
/*     */                   //   375: astore #6
/*     */                   //   377: aload #5
/*     */                   //   379: astore #7
/*     */                   //   381: iconst_0
/*     */                   //   382: istore #8
/*     */                   //   384: aload #6
/*     */                   //   386: aload #7
/*     */                   //   388: checkcast androidx/lifecycle/LifecycleObserver
/*     */                   //   391: invokevirtual removeObserver : (Landroidx/lifecycle/LifecycleObserver;)V
/*     */                   //   394: nop
/*     */                   //   395: goto -> 400
/*     */                   //   398: pop
/*     */                   //   399: nop
/*     */                   //   400: goto -> 470
/*     */                   //   403: astore #4
/*     */                   //   405: aload_2
/*     */                   //   406: getfield element : Ljava/lang/Object;
/*     */                   //   409: checkcast kotlinx/coroutines/Job
/*     */                   //   412: dup
/*     */                   //   413: ifnull -> 425
/*     */                   //   416: aconst_null
/*     */                   //   417: iconst_1
/*     */                   //   418: aconst_null
/*     */                   //   419: invokestatic cancel$default : (Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
/*     */                   //   422: goto -> 426
/*     */                   //   425: pop
/*     */                   //   426: aload_3
/*     */                   //   427: getfield element : Ljava/lang/Object;
/*     */                   //   430: checkcast androidx/lifecycle/LifecycleEventObserver
/*     */                   //   433: dup
/*     */                   //   434: ifnull -> 466
/*     */                   //   437: astore #6
/*     */                   //   439: aload_0
/*     */                   //   440: getfield $this_repeatOnLifecycle : Landroidx/lifecycle/Lifecycle;
/*     */                   //   443: astore #7
/*     */                   //   445: aload #6
/*     */                   //   447: astore #8
/*     */                   //   449: iconst_0
/*     */                   //   450: istore #9
/*     */                   //   452: aload #7
/*     */                   //   454: aload #8
/*     */                   //   456: checkcast androidx/lifecycle/LifecycleObserver
/*     */                   //   459: invokevirtual removeObserver : (Landroidx/lifecycle/LifecycleObserver;)V
/*     */                   //   462: nop
/*     */                   //   463: goto -> 467
/*     */                   //   466: pop
/*     */                   //   467: aload #4
/*     */                   //   469: athrow
/*     */                   //   470: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   473: areturn
/*     */                   //   474: new java/lang/IllegalStateException
/*     */                   //   477: dup
/*     */                   //   478: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   480: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   483: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #84	-> 3
/*     */                   //   #87	-> 36
/*     */                   //   #90	-> 53
/*     */                   //   #93	-> 61
/*     */                   //   #94	-> 69
/*     */                   //   #97	-> 70
/*     */                   //   #166	-> 97
/*     */                   //   #167	-> 145
/*     */                   //   #173	-> 160
/*     */                   //   #174	-> 165
/*     */                   //   #100	-> 175
/*     */                   //   #101	-> 185
/*     */                   //   #102	-> 195
/*     */                   //   #103	-> 203
/*     */                   //   #125	-> 227
/*     */                   //   #126	-> 248
/*     */                   //   #174	-> 249
/*     */                   //   #175	-> 250
/*     */                   //   #166	-> 255
/*     */                   //   #84	-> 275
/*     */                   //   #176	-> 335
/*     */                   //   #128	-> 337
/*     */                   //   #129	-> 358
/*     */                   //   #130	-> 384
/*     */                   //   #131	-> 394
/*     */                   //   #129	-> 395
/*     */                   //   #129	-> 398
/*     */                   //   #132	-> 400
/*     */                   //   #128	-> 403
/*     */                   //   #129	-> 426
/*     */                   //   #130	-> 452
/*     */                   //   #131	-> 462
/*     */                   //   #129	-> 463
/*     */                   //   #129	-> 466
/*     */                   //   #133	-> 470
/*     */                   //   #84	-> 474
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   61	188	2	launchedJob	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   249	29	2	launchedJob	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   329	7	2	launchedJob	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   336	8	2	launchedJob	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   403	9	2	launchedJob	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   69	180	3	observer	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   249	29	3	observer	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   321	15	3	observer	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   336	29	3	observer	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   403	30	3	observer	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   381	14	7	it	Landroidx/lifecycle/LifecycleEventObserver;
/*     */                   //   449	14	8	it	Landroidx/lifecycle/LifecycleEventObserver;
/*     */                   //   142	113	9	uCont$iv	Lkotlin/coroutines/Continuation;
/*     */                   //   160	95	11	cancellable$iv	Lkotlinx/coroutines/CancellableContinuationImpl;
/*     */                   //   172	77	12	cont	Lkotlinx/coroutines/CancellableContinuation;
/*     */                   //   185	64	14	startWorkEvent	Landroidx/lifecycle/Lifecycle$Event;
/*     */                   //   195	54	15	cancelWorkEvent	Landroidx/lifecycle/Lifecycle$Event;
/*     */                   //   203	46	16	mutex	Lkotlinx/coroutines/sync/Mutex;
/*     */                   //   175	74	13	$i$a$-suspendCancellableCoroutine-RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1	I
/*     */                   //   145	110	10	$i$a$-suspendCoroutineUninterceptedOrReturn-CancellableContinuationKt$suspendCancellableCoroutine$2$iv	I
/*     */                   //   97	181	8	$i$f$suspendCancellableCoroutine	I
/*     */                   //   384	11	8	$i$a$-let-RepeatOnLifecycleKt$repeatOnLifecycle$3$1$2	I
/*     */                   //   452	11	9	$i$a$-let-RepeatOnLifecycleKt$repeatOnLifecycle$3$1$2	I
/*     */                   //   36	438	0	this	Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1;
/*     */                   //   36	438	1	$result	Ljava/lang/Object;
/*     */                   //   281	55	8	$i$f$suspendCancellableCoroutine	I
/*     */                   // Exception table:
/*     */                   //   from	to	target	type
/*     */                   //   69	269	403	finally
/*     */                   //   329	337	403	finally
/*  84 */                   //   403	405	403	finally } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 134 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> $completion) {
/*     */       RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, $completion);
/*     */       repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = value;
/*     */       return (Continuation<Unit>)repeatOnLifecycleKt$repeatOnLifecycle$3;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((RepeatOnLifecycleKt$repeatOnLifecycle$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static final Object repeatOnLifecycle(@NotNull LifecycleOwner $this$repeatOnLifecycle, @NotNull Lifecycle.State state, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block, @NotNull Continuation<? super Unit> $completion) {
/* 164 */     if (repeatOnLifecycle($this$repeatOnLifecycle.getLifecycle(), state, block, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return repeatOnLifecycle($this$repeatOnLifecycle.getLifecycle(), state, block, $completion);  repeatOnLifecycle($this$repeatOnLifecycle.getLifecycle(), state, block, $completion); return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-runtime-desktop-2.8.5.jar!\androidx\lifecycle\RepeatOnLifecycleKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */