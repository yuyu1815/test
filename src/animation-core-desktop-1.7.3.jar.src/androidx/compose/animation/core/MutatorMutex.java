/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.Stable;
/*     */ import java.util.concurrent.CancellationException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.CoroutineScopeKt;
/*     */ import kotlinx.coroutines.Job;
/*     */ import kotlinx.coroutines.sync.Mutex;
/*     */ import kotlinx.coroutines.sync.MutexKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\003\b\001\030\0002\0020\001:\001\031B\005¢\006\002\020\002J<\020\b\032\002H\t\"\004\b\000\020\t2\b\b\002\020\n\032\0020\0132\034\020\f\032\030\b\001\022\n\022\b\022\004\022\002H\t0\016\022\006\022\004\030\0010\0010\rH@¢\006\002\020\017JU\020\020\032\002H\t\"\004\b\000\020\021\"\004\b\001\020\t2\006\020\022\032\002H\0212\b\b\002\020\n\032\0020\0132'\020\f\032#\b\001\022\004\022\002H\021\022\n\022\b\022\004\022\002H\t0\016\022\006\022\004\030\0010\0010\023¢\006\002\b\024H@¢\006\002\020\025J\020\020\026\032\0020\0272\006\020\030\032\0020\005H\002R\026\020\003\032\n\022\006\022\004\030\0010\0050\004X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000¨\006\032"}, d2 = {"Landroidx/compose/animation/core/MutatorMutex;", "", "()V", "currentMutator", "Landroidx/compose/animation/core/AtomicReference;", "Landroidx/compose/animation/core/MutatorMutex$Mutator;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "mutate", "R", "priority", "Landroidx/compose/animation/core/MutatePriority;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Landroidx/compose/animation/core/MutatePriority;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mutateWith", "T", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Landroidx/compose/animation/core/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryMutateOrCancel", "", "mutator", "Mutator", "animation-core"})
/*     */ @Stable
/*     */ public final class MutatorMutex
/*     */ {
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\002\n\000\b\002\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\016\020\013\032\0020\f2\006\020\r\032\0020\000J\006\020\016\032\0020\017R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\020"}, d2 = {"Landroidx/compose/animation/core/MutatorMutex$Mutator;", "", "priority", "Landroidx/compose/animation/core/MutatePriority;", "job", "Lkotlinx/coroutines/Job;", "(Landroidx/compose/animation/core/MutatePriority;Lkotlinx/coroutines/Job;)V", "getJob", "()Lkotlinx/coroutines/Job;", "getPriority", "()Landroidx/compose/animation/core/MutatePriority;", "canInterrupt", "", "other", "cancel", "", "animation-core"})
/*     */   private static final class Mutator
/*     */   {
/*     */     @NotNull
/*     */     private final MutatePriority priority;
/*     */     @NotNull
/*     */     private final Job job;
/*     */     
/*     */     public Mutator(@NotNull MutatePriority priority, @NotNull Job job) {
/*  82 */       this.priority = priority; this.job = job; } @NotNull public final MutatePriority getPriority() { return this.priority; } @NotNull public final Job getJob() { return this.job; } public final boolean canInterrupt(@NotNull Mutator other) {
/*  83 */       Intrinsics.checkNotNullParameter(other, "other"); return (this.priority.compareTo(other.priority) >= 0);
/*     */     } public final void cancel() {
/*  85 */       this.job.cancel((CancellationException)new MutationInterruptedException());
/*     */     } }
/*     */   @NotNull
/*  88 */   private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null); @NotNull
/*  89 */   private final Mutex mutex = MutexKt.Mutex$default(false, 1, null); public static final int $stable;
/*     */   
/*     */   private final void tryMutateOrCancel(Mutator mutator) {
/*     */     while (true) {
/*  93 */       Mutator oldMutator = this.currentMutator.get();
/*  94 */       if (oldMutator == null || mutator.canInterrupt(oldMutator)) {
/*  95 */         if (this.currentMutator.compareAndSet(oldMutator, mutator)) {
/*  96 */           if (oldMutator != null) { oldMutator.cancel(); } else {  }  return;
/*     */         }  continue;
/*     */       }  break;
/*  99 */     }  throw new CancellationException("Current mutation had a higher priority");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final <R> Object mutate(@NotNull MutatePriority priority, @NotNull Function1<? super Continuation<? super R>, ? extends Object> block, @NotNull Continuation $completion) {
/* 121 */     return CoroutineScopeKt.coroutineScope(new MutatorMutex$mutate$2(this, block, null), $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "InternalMutatorMutex.kt", l = {179, 128}, i = {0, 0, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1"}, n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, m = "invokeSuspend", c = "androidx.compose.animation.core.MutatorMutex$mutate$2")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H@"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,174:1\n116#2,10:175\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutate$2\n*L\n126#1:175,10\n*E\n"})
/*     */   static final class MutatorMutex$mutate$2
/*     */     extends SuspendLambda
/*     */     implements Function2<CoroutineScope, Continuation<? super R>, Object>
/*     */   {
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     MutatorMutex$mutate$2(MutatorMutex $receiver, Function1<Continuation<? super R>, Object> $block, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #14
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 374, 0 -> 36, 1 -> 170, 2 -> 266
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: aload_0
/*     */       //   41: getfield L$0 : Ljava/lang/Object;
/*     */       //   44: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   47: astore_2
/*     */       //   48: new androidx/compose/animation/core/MutatorMutex$Mutator
/*     */       //   51: dup
/*     */       //   52: aload_0
/*     */       //   53: getfield $priority : Landroidx/compose/animation/core/MutatePriority;
/*     */       //   56: aload_2
/*     */       //   57: invokeinterface getCoroutineContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */       //   62: getstatic kotlinx/coroutines/Job.Key : Lkotlinx/coroutines/Job$Key;
/*     */       //   65: checkcast kotlin/coroutines/CoroutineContext$Key
/*     */       //   68: invokeinterface get : (Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;
/*     */       //   73: dup
/*     */       //   74: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */       //   77: checkcast kotlinx/coroutines/Job
/*     */       //   80: invokespecial <init> : (Landroidx/compose/animation/core/MutatePriority;Lkotlinx/coroutines/Job;)V
/*     */       //   83: astore_3
/*     */       //   84: aload_0
/*     */       //   85: getfield this$0 : Landroidx/compose/animation/core/MutatorMutex;
/*     */       //   88: aload_3
/*     */       //   89: invokestatic access$tryMutateOrCancel : (Landroidx/compose/animation/core/MutatorMutex;Landroidx/compose/animation/core/MutatorMutex$Mutator;)V
/*     */       //   92: aload_0
/*     */       //   93: getfield this$0 : Landroidx/compose/animation/core/MutatorMutex;
/*     */       //   96: invokestatic access$getMutex$p : (Landroidx/compose/animation/core/MutatorMutex;)Lkotlinx/coroutines/sync/Mutex;
/*     */       //   99: astore #4
/*     */       //   101: aload_0
/*     */       //   102: getfield $block : Lkotlin/jvm/functions/Function1;
/*     */       //   105: astore #6
/*     */       //   107: aload_0
/*     */       //   108: getfield this$0 : Landroidx/compose/animation/core/MutatorMutex;
/*     */       //   111: astore #7
/*     */       //   113: aconst_null
/*     */       //   114: astore #5
/*     */       //   116: iconst_0
/*     */       //   117: istore #8
/*     */       //   119: nop
/*     */       //   120: aload #4
/*     */       //   122: aload #5
/*     */       //   124: aload_0
/*     */       //   125: checkcast kotlin/coroutines/Continuation
/*     */       //   128: aload_0
/*     */       //   129: aload_3
/*     */       //   130: putfield L$0 : Ljava/lang/Object;
/*     */       //   133: aload_0
/*     */       //   134: aload #4
/*     */       //   136: putfield L$1 : Ljava/lang/Object;
/*     */       //   139: aload_0
/*     */       //   140: aload #6
/*     */       //   142: putfield L$2 : Ljava/lang/Object;
/*     */       //   145: aload_0
/*     */       //   146: aload #7
/*     */       //   148: putfield L$3 : Ljava/lang/Object;
/*     */       //   151: aload_0
/*     */       //   152: iconst_1
/*     */       //   153: putfield label : I
/*     */       //   156: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   161: dup
/*     */       //   162: aload #14
/*     */       //   164: if_acmpne -> 216
/*     */       //   167: aload #14
/*     */       //   169: areturn
/*     */       //   170: iconst_0
/*     */       //   171: istore #8
/*     */       //   173: aload_0
/*     */       //   174: getfield L$3 : Ljava/lang/Object;
/*     */       //   177: checkcast androidx/compose/animation/core/MutatorMutex
/*     */       //   180: astore #7
/*     */       //   182: aload_0
/*     */       //   183: getfield L$2 : Ljava/lang/Object;
/*     */       //   186: checkcast kotlin/jvm/functions/Function1
/*     */       //   189: astore #6
/*     */       //   191: aconst_null
/*     */       //   192: astore #5
/*     */       //   194: aload_0
/*     */       //   195: getfield L$1 : Ljava/lang/Object;
/*     */       //   198: checkcast kotlinx/coroutines/sync/Mutex
/*     */       //   201: astore #4
/*     */       //   203: aload_0
/*     */       //   204: getfield L$0 : Ljava/lang/Object;
/*     */       //   207: checkcast androidx/compose/animation/core/MutatorMutex$Mutator
/*     */       //   210: astore_3
/*     */       //   211: aload_1
/*     */       //   212: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   215: aload_1
/*     */       //   216: pop
/*     */       //   217: nop
/*     */       //   218: iconst_0
/*     */       //   219: istore #9
/*     */       //   221: nop
/*     */       //   222: aload #6
/*     */       //   224: aload_0
/*     */       //   225: aload_0
/*     */       //   226: aload_3
/*     */       //   227: putfield L$0 : Ljava/lang/Object;
/*     */       //   230: aload_0
/*     */       //   231: aload #4
/*     */       //   233: putfield L$1 : Ljava/lang/Object;
/*     */       //   236: aload_0
/*     */       //   237: aload #7
/*     */       //   239: putfield L$2 : Ljava/lang/Object;
/*     */       //   242: aload_0
/*     */       //   243: aconst_null
/*     */       //   244: putfield L$3 : Ljava/lang/Object;
/*     */       //   247: aload_0
/*     */       //   248: iconst_2
/*     */       //   249: putfield label : I
/*     */       //   252: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   257: dup
/*     */       //   258: aload #14
/*     */       //   260: if_acmpne -> 307
/*     */       //   263: aload #14
/*     */       //   265: areturn
/*     */       //   266: iconst_0
/*     */       //   267: istore #8
/*     */       //   269: iconst_0
/*     */       //   270: istore #9
/*     */       //   272: aload_0
/*     */       //   273: getfield L$2 : Ljava/lang/Object;
/*     */       //   276: checkcast androidx/compose/animation/core/MutatorMutex
/*     */       //   279: astore #7
/*     */       //   281: aconst_null
/*     */       //   282: astore #5
/*     */       //   284: aload_0
/*     */       //   285: getfield L$1 : Ljava/lang/Object;
/*     */       //   288: checkcast kotlinx/coroutines/sync/Mutex
/*     */       //   291: astore #4
/*     */       //   293: aload_0
/*     */       //   294: getfield L$0 : Ljava/lang/Object;
/*     */       //   297: checkcast androidx/compose/animation/core/MutatorMutex$Mutator
/*     */       //   300: astore_3
/*     */       //   301: nop
/*     */       //   302: aload_1
/*     */       //   303: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   306: aload_1
/*     */       //   307: astore #10
/*     */       //   309: aload #7
/*     */       //   311: invokestatic access$getCurrentMutator$p : (Landroidx/compose/animation/core/MutatorMutex;)Landroidx/compose/animation/core/AtomicReference;
/*     */       //   314: aload_3
/*     */       //   315: aconst_null
/*     */       //   316: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   319: pop
/*     */       //   320: goto -> 339
/*     */       //   323: astore #11
/*     */       //   325: aload #7
/*     */       //   327: invokestatic access$getCurrentMutator$p : (Landroidx/compose/animation/core/MutatorMutex;)Landroidx/compose/animation/core/AtomicReference;
/*     */       //   330: aload_3
/*     */       //   331: aconst_null
/*     */       //   332: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   335: pop
/*     */       //   336: aload #11
/*     */       //   338: athrow
/*     */       //   339: aload #10
/*     */       //   341: nop
/*     */       //   342: astore #12
/*     */       //   344: aload #4
/*     */       //   346: aload #5
/*     */       //   348: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */       //   353: goto -> 370
/*     */       //   356: astore #13
/*     */       //   358: aload #4
/*     */       //   360: aload #5
/*     */       //   362: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */       //   367: aload #13
/*     */       //   369: athrow
/*     */       //   370: aload #12
/*     */       //   372: nop
/*     */       //   373: areturn
/*     */       //   374: new java/lang/IllegalStateException
/*     */       //   377: dup
/*     */       //   378: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   380: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   383: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #121	-> 3
/*     */       //   #122	-> 48
/*     */       //   #124	-> 84
/*     */       //   #126	-> 92
/*     */       //   #175	-> 113
/*     */       //   #176	-> 119
/*     */       //   #179	-> 120
/*     */       //   #121	-> 167
/*     */       //   #180	-> 216
/*     */       //   #181	-> 218
/*     */       //   #127	-> 221
/*     */       //   #128	-> 222
/*     */       //   #121	-> 263
/*     */       //   #128	-> 307
/*     */       //   #130	-> 309
/*     */       //   #131	-> 320
/*     */       //   #130	-> 323
/*     */       //   #127	-> 341
/*     */       //   #181	-> 342
/*     */       //   #183	-> 344
/*     */       //   #184	-> 353
/*     */       //   #183	-> 356
/*     */       //   #180	-> 372
/*     */       //   #126	-> 373
/*     */       //   #121	-> 374
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   48	36	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   84	86	3	mutator	Landroidx/compose/animation/core/MutatorMutex$Mutator;
/*     */       //   211	55	3	mutator	Landroidx/compose/animation/core/MutatorMutex$Mutator;
/*     */       //   301	19	3	mutator	Landroidx/compose/animation/core/MutatorMutex$Mutator;
/*     */       //   323	13	3	mutator	Landroidx/compose/animation/core/MutatorMutex$Mutator;
/*     */       //   113	57	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   203	63	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   293	49	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   342	11	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   356	17	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   116	54	5	owner$iv	Ljava/lang/Object;
/*     */       //   203	63	5	owner$iv	Ljava/lang/Object;
/*     */       //   293	49	5	owner$iv	Ljava/lang/Object;
/*     */       //   342	11	5	owner$iv	Ljava/lang/Object;
/*     */       //   356	17	5	owner$iv	Ljava/lang/Object;
/*     */       //   221	45	9	$i$a$-withLock$default-MutatorMutex$mutate$2$1	I
/*     */       //   119	51	8	$i$f$withLock	I
/*     */       //   40	334	0	this	Landroidx/compose/animation/core/MutatorMutex$mutate$2;
/*     */       //   40	334	1	$result	Ljava/lang/Object;
/*     */       //   173	93	8	$i$f$withLock	I
/*     */       //   272	70	9	$i$a$-withLock$default-MutatorMutex$mutate$2$1	I
/*     */       //   269	104	8	$i$f$withLock	I
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   217	257	356	finally
/*     */       //   221	257	323	finally
/*     */       //   301	309	323	finally
/*     */       //   301	344	356	finally
/*     */       //   323	325	323	finally
/*     */       //   356	358	356	finally
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super MutatorMutex$mutate$2> $completion) {
/*     */       MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(MutatorMutex.this, this.$block, $completion);
/*     */       mutatorMutex$mutate$2.L$0 = value;
/*     */       return (Continuation<Unit>)mutatorMutex$mutate$2;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((MutatorMutex$mutate$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final <T, R> Object mutateWith(Object receiver, @NotNull MutatePriority priority, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> block, @NotNull Continuation $completion) {
/* 160 */     return CoroutineScopeKt.coroutineScope(new MutatorMutex$mutateWith$2(this, block, (T)receiver, null), $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "InternalMutatorMutex.kt", l = {179, 167}, i = {0, 0, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1"}, n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, m = "invokeSuspend", c = "androidx.compose.animation.core.MutatorMutex$mutateWith$2")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\003\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\002\"\004\b\001\020\001*\0020\003H@"}, d2 = {"<anonymous>", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,174:1\n116#2,10:175\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutateWith$2\n*L\n165#1:175,10\n*E\n"})
/*     */   static final class MutatorMutex$mutateWith$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     int label;
/*     */     
/*     */     MutatorMutex$mutateWith$2(MutatorMutex $receiver, Function2<T, Continuation<? super R>, Object> $block, Object object, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #15
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 399, 0 -> 36, 1 -> 182, 2 -> 291
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: aload_0
/*     */       //   41: getfield L$0 : Ljava/lang/Object;
/*     */       //   44: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   47: astore_2
/*     */       //   48: new androidx/compose/animation/core/MutatorMutex$Mutator
/*     */       //   51: dup
/*     */       //   52: aload_0
/*     */       //   53: getfield $priority : Landroidx/compose/animation/core/MutatePriority;
/*     */       //   56: aload_2
/*     */       //   57: invokeinterface getCoroutineContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */       //   62: getstatic kotlinx/coroutines/Job.Key : Lkotlinx/coroutines/Job$Key;
/*     */       //   65: checkcast kotlin/coroutines/CoroutineContext$Key
/*     */       //   68: invokeinterface get : (Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;
/*     */       //   73: dup
/*     */       //   74: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */       //   77: checkcast kotlinx/coroutines/Job
/*     */       //   80: invokespecial <init> : (Landroidx/compose/animation/core/MutatePriority;Lkotlinx/coroutines/Job;)V
/*     */       //   83: astore_3
/*     */       //   84: aload_0
/*     */       //   85: getfield this$0 : Landroidx/compose/animation/core/MutatorMutex;
/*     */       //   88: aload_3
/*     */       //   89: invokestatic access$tryMutateOrCancel : (Landroidx/compose/animation/core/MutatorMutex;Landroidx/compose/animation/core/MutatorMutex$Mutator;)V
/*     */       //   92: aload_0
/*     */       //   93: getfield this$0 : Landroidx/compose/animation/core/MutatorMutex;
/*     */       //   96: invokestatic access$getMutex$p : (Landroidx/compose/animation/core/MutatorMutex;)Lkotlinx/coroutines/sync/Mutex;
/*     */       //   99: astore #4
/*     */       //   101: aload_0
/*     */       //   102: getfield $block : Lkotlin/jvm/functions/Function2;
/*     */       //   105: astore #6
/*     */       //   107: aload_0
/*     */       //   108: getfield $receiver : Ljava/lang/Object;
/*     */       //   111: astore #7
/*     */       //   113: aload_0
/*     */       //   114: getfield this$0 : Landroidx/compose/animation/core/MutatorMutex;
/*     */       //   117: astore #8
/*     */       //   119: aconst_null
/*     */       //   120: astore #5
/*     */       //   122: iconst_0
/*     */       //   123: istore #9
/*     */       //   125: nop
/*     */       //   126: aload #4
/*     */       //   128: aload #5
/*     */       //   130: aload_0
/*     */       //   131: checkcast kotlin/coroutines/Continuation
/*     */       //   134: aload_0
/*     */       //   135: aload_3
/*     */       //   136: putfield L$0 : Ljava/lang/Object;
/*     */       //   139: aload_0
/*     */       //   140: aload #4
/*     */       //   142: putfield L$1 : Ljava/lang/Object;
/*     */       //   145: aload_0
/*     */       //   146: aload #6
/*     */       //   148: putfield L$2 : Ljava/lang/Object;
/*     */       //   151: aload_0
/*     */       //   152: aload #7
/*     */       //   154: putfield L$3 : Ljava/lang/Object;
/*     */       //   157: aload_0
/*     */       //   158: aload #8
/*     */       //   160: putfield L$4 : Ljava/lang/Object;
/*     */       //   163: aload_0
/*     */       //   164: iconst_1
/*     */       //   165: putfield label : I
/*     */       //   168: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   173: dup
/*     */       //   174: aload #15
/*     */       //   176: if_acmpne -> 234
/*     */       //   179: aload #15
/*     */       //   181: areturn
/*     */       //   182: iconst_0
/*     */       //   183: istore #9
/*     */       //   185: aload_0
/*     */       //   186: getfield L$4 : Ljava/lang/Object;
/*     */       //   189: checkcast androidx/compose/animation/core/MutatorMutex
/*     */       //   192: astore #8
/*     */       //   194: aload_0
/*     */       //   195: getfield L$3 : Ljava/lang/Object;
/*     */       //   198: astore #7
/*     */       //   200: aload_0
/*     */       //   201: getfield L$2 : Ljava/lang/Object;
/*     */       //   204: checkcast kotlin/jvm/functions/Function2
/*     */       //   207: astore #6
/*     */       //   209: aconst_null
/*     */       //   210: astore #5
/*     */       //   212: aload_0
/*     */       //   213: getfield L$1 : Ljava/lang/Object;
/*     */       //   216: checkcast kotlinx/coroutines/sync/Mutex
/*     */       //   219: astore #4
/*     */       //   221: aload_0
/*     */       //   222: getfield L$0 : Ljava/lang/Object;
/*     */       //   225: checkcast androidx/compose/animation/core/MutatorMutex$Mutator
/*     */       //   228: astore_3
/*     */       //   229: aload_1
/*     */       //   230: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   233: aload_1
/*     */       //   234: pop
/*     */       //   235: nop
/*     */       //   236: iconst_0
/*     */       //   237: istore #10
/*     */       //   239: nop
/*     */       //   240: aload #6
/*     */       //   242: aload #7
/*     */       //   244: aload_0
/*     */       //   245: aload_0
/*     */       //   246: aload_3
/*     */       //   247: putfield L$0 : Ljava/lang/Object;
/*     */       //   250: aload_0
/*     */       //   251: aload #4
/*     */       //   253: putfield L$1 : Ljava/lang/Object;
/*     */       //   256: aload_0
/*     */       //   257: aload #8
/*     */       //   259: putfield L$2 : Ljava/lang/Object;
/*     */       //   262: aload_0
/*     */       //   263: aconst_null
/*     */       //   264: putfield L$3 : Ljava/lang/Object;
/*     */       //   267: aload_0
/*     */       //   268: aconst_null
/*     */       //   269: putfield L$4 : Ljava/lang/Object;
/*     */       //   272: aload_0
/*     */       //   273: iconst_2
/*     */       //   274: putfield label : I
/*     */       //   277: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   282: dup
/*     */       //   283: aload #15
/*     */       //   285: if_acmpne -> 332
/*     */       //   288: aload #15
/*     */       //   290: areturn
/*     */       //   291: iconst_0
/*     */       //   292: istore #9
/*     */       //   294: iconst_0
/*     */       //   295: istore #10
/*     */       //   297: aload_0
/*     */       //   298: getfield L$2 : Ljava/lang/Object;
/*     */       //   301: checkcast androidx/compose/animation/core/MutatorMutex
/*     */       //   304: astore #8
/*     */       //   306: aconst_null
/*     */       //   307: astore #5
/*     */       //   309: aload_0
/*     */       //   310: getfield L$1 : Ljava/lang/Object;
/*     */       //   313: checkcast kotlinx/coroutines/sync/Mutex
/*     */       //   316: astore #4
/*     */       //   318: aload_0
/*     */       //   319: getfield L$0 : Ljava/lang/Object;
/*     */       //   322: checkcast androidx/compose/animation/core/MutatorMutex$Mutator
/*     */       //   325: astore_3
/*     */       //   326: nop
/*     */       //   327: aload_1
/*     */       //   328: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   331: aload_1
/*     */       //   332: astore #11
/*     */       //   334: aload #8
/*     */       //   336: invokestatic access$getCurrentMutator$p : (Landroidx/compose/animation/core/MutatorMutex;)Landroidx/compose/animation/core/AtomicReference;
/*     */       //   339: aload_3
/*     */       //   340: aconst_null
/*     */       //   341: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   344: pop
/*     */       //   345: goto -> 364
/*     */       //   348: astore #12
/*     */       //   350: aload #8
/*     */       //   352: invokestatic access$getCurrentMutator$p : (Landroidx/compose/animation/core/MutatorMutex;)Landroidx/compose/animation/core/AtomicReference;
/*     */       //   355: aload_3
/*     */       //   356: aconst_null
/*     */       //   357: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   360: pop
/*     */       //   361: aload #12
/*     */       //   363: athrow
/*     */       //   364: aload #11
/*     */       //   366: nop
/*     */       //   367: astore #13
/*     */       //   369: aload #4
/*     */       //   371: aload #5
/*     */       //   373: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */       //   378: goto -> 395
/*     */       //   381: astore #14
/*     */       //   383: aload #4
/*     */       //   385: aload #5
/*     */       //   387: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */       //   392: aload #14
/*     */       //   394: athrow
/*     */       //   395: aload #13
/*     */       //   397: nop
/*     */       //   398: areturn
/*     */       //   399: new java/lang/IllegalStateException
/*     */       //   402: dup
/*     */       //   403: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   405: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   408: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #160	-> 3
/*     */       //   #161	-> 48
/*     */       //   #163	-> 84
/*     */       //   #165	-> 92
/*     */       //   #175	-> 119
/*     */       //   #176	-> 125
/*     */       //   #179	-> 126
/*     */       //   #160	-> 179
/*     */       //   #180	-> 234
/*     */       //   #181	-> 236
/*     */       //   #166	-> 239
/*     */       //   #167	-> 240
/*     */       //   #160	-> 288
/*     */       //   #167	-> 332
/*     */       //   #169	-> 334
/*     */       //   #170	-> 345
/*     */       //   #169	-> 348
/*     */       //   #166	-> 366
/*     */       //   #181	-> 367
/*     */       //   #183	-> 369
/*     */       //   #184	-> 378
/*     */       //   #183	-> 381
/*     */       //   #180	-> 397
/*     */       //   #165	-> 398
/*     */       //   #160	-> 399
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   48	36	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   84	98	3	mutator	Landroidx/compose/animation/core/MutatorMutex$Mutator;
/*     */       //   229	62	3	mutator	Landroidx/compose/animation/core/MutatorMutex$Mutator;
/*     */       //   326	19	3	mutator	Landroidx/compose/animation/core/MutatorMutex$Mutator;
/*     */       //   348	13	3	mutator	Landroidx/compose/animation/core/MutatorMutex$Mutator;
/*     */       //   119	63	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   221	70	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   318	49	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   367	11	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   381	17	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   122	60	5	owner$iv	Ljava/lang/Object;
/*     */       //   221	70	5	owner$iv	Ljava/lang/Object;
/*     */       //   318	49	5	owner$iv	Ljava/lang/Object;
/*     */       //   367	11	5	owner$iv	Ljava/lang/Object;
/*     */       //   381	17	5	owner$iv	Ljava/lang/Object;
/*     */       //   239	52	10	$i$a$-withLock$default-MutatorMutex$mutateWith$2$1	I
/*     */       //   125	57	9	$i$f$withLock	I
/*     */       //   40	359	0	this	Landroidx/compose/animation/core/MutatorMutex$mutateWith$2;
/*     */       //   40	359	1	$result	Ljava/lang/Object;
/*     */       //   185	106	9	$i$f$withLock	I
/*     */       //   297	70	10	$i$a$-withLock$default-MutatorMutex$mutateWith$2$1	I
/*     */       //   294	104	9	$i$f$withLock	I
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   235	282	381	finally
/*     */       //   239	282	348	finally
/*     */       //   326	334	348	finally
/*     */       //   326	369	381	finally
/*     */       //   348	350	348	finally
/*     */       //   381	383	381	finally
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super MutatorMutex$mutateWith$2> $completion) {
/*     */       MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(MutatorMutex.this, this.$block, this.$receiver, $completion);
/*     */       mutatorMutex$mutateWith$2.L$0 = value;
/*     */       return (Continuation<Unit>)mutatorMutex$mutateWith$2;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((MutatorMutex$mutateWith$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\MutatorMutex.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */