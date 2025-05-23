/*     */ package androidx.lifecycle;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.PublishedApi;
/*     */ import kotlin.Result;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.EmptyCoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugProbesKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.InlineMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CancellableContinuation;
/*     */ import kotlinx.coroutines.CancellableContinuationImpl;
/*     */ import kotlinx.coroutines.CoroutineDispatcher;
/*     */ import kotlinx.coroutines.Dispatchers;
/*     */ import kotlinx.coroutines.MainCoroutineDispatcher;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000,\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\b\032>\020\000\032\002H\001\"\004\b\000\020\001*\0020\0022\006\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\f\020\t\032\b\022\004\022\002H\0010\nH@¢\006\002\020\013\032(\020\f\032\002H\001\"\004\b\000\020\001*\0020\0022\016\b\004\020\t\032\b\022\004\022\002H\0010\nHH¢\006\002\020\r\032(\020\f\032\002H\001\"\004\b\000\020\001*\0020\0162\016\b\004\020\t\032\b\022\004\022\002H\0010\nHH¢\006\002\020\017\032(\020\020\032\002H\001\"\004\b\000\020\001*\0020\0022\016\b\004\020\t\032\b\022\004\022\002H\0010\nHH¢\006\002\020\r\032(\020\020\032\002H\001\"\004\b\000\020\001*\0020\0162\016\b\004\020\t\032\b\022\004\022\002H\0010\nHH¢\006\002\020\017\032(\020\021\032\002H\001\"\004\b\000\020\001*\0020\0022\016\b\004\020\t\032\b\022\004\022\002H\0010\nHH¢\006\002\020\r\032(\020\021\032\002H\001\"\004\b\000\020\001*\0020\0162\016\b\004\020\t\032\b\022\004\022\002H\0010\nHH¢\006\002\020\017\0320\020\022\032\002H\001\"\004\b\000\020\001*\0020\0022\006\020\003\032\0020\0042\016\b\004\020\t\032\b\022\004\022\002H\0010\nHH¢\006\002\020\023\0320\020\022\032\002H\001\"\004\b\000\020\001*\0020\0162\006\020\003\032\0020\0042\016\b\004\020\t\032\b\022\004\022\002H\0010\nHH¢\006\002\020\024\0320\020\025\032\002H\001\"\004\b\000\020\001*\0020\0022\006\020\003\032\0020\0042\016\b\004\020\t\032\b\022\004\022\002H\0010\nHH¢\006\002\020\023¨\006\026"}, d2 = {"suspendWithStateAtLeastUnchecked", "R", "Landroidx/lifecycle/Lifecycle;", "state", "Landroidx/lifecycle/Lifecycle$State;", "dispatchNeeded", "", "lifecycleDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "block", "Lkotlin/Function0;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;ZLkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withCreated", "(Landroidx/lifecycle/Lifecycle;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withResumed", "withStarted", "withStateAtLeast", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withStateAtLeastUnchecked", "lifecycle-runtime"})
/*     */ @SourceDebugExtension({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,207:1\n155#1,8:208\n155#1,8:216\n155#1,8:224\n155#1,8:232\n44#1,5:240\n155#1,8:245\n44#1,5:253\n155#1,8:258\n155#1,8:266\n155#1,8:274\n155#1,8:282\n314#2,9:290\n323#2,2:300\n17#3:299\n*S KotlinDebug\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n48#1:208,8\n59#1:216,8\n72#1:224,8\n85#1:232,8\n99#1:240,5\n99#1:245,8\n99#1:253,5\n99#1:258,8\n112#1:266,8\n125#1:274,8\n138#1:282,8\n178#1:290,9\n178#1:300,2\n194#1:299\n*E\n"})
/*     */ public final class WithLifecycleStateKt
/*     */ {
/*     */   @Nullable
/*     */   public static final <R> Object withStateAtLeast(@NotNull Lifecycle $this$withStateAtLeast, @NotNull Lifecycle.State state, @NotNull Function0<? extends R> block, @NotNull Continuation<?> $completion) {
/*  44 */     int $i$f$withStateAtLeast = 0; if (!((state.compareTo((Enum)Lifecycle.State.CREATED) >= 0) ? 1 : 0)) { int $i$a$-require-WithLifecycleStateKt$withStateAtLeast$2 = 0; String str = "target state must be CREATED or greater, found " + 
/*  45 */         state;
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */     
/*  48 */     Lifecycle $this$withStateAtLeastUnchecked$iv = $this$withStateAtLeast; int $i$f$withStateAtLeastUnchecked = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 208 */     MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
/* 209 */     boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded($completion.getContext());
/* 210 */     if (!dispatchNeeded$iv) {
/* 211 */       if ($this$withStateAtLeastUnchecked$iv.getCurrentState() == Lifecycle.State.DESTROYED) throw new LifecycleDestroyedException(); 
/* 212 */       if ($this$withStateAtLeastUnchecked$iv.getCurrentState().compareTo((Enum)state) >= 0);
/*     */     } 
/*     */     
/* 215 */     return suspendWithStateAtLeastUnchecked($this$withStateAtLeastUnchecked$iv, state, dispatchNeeded$iv, (CoroutineDispatcher)lifecycleDispatcher$iv, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(block), $completion);
/* 216 */   } private static final <R> Object withStateAtLeast$$forInline(Lifecycle $this$withStateAtLeast, Lifecycle.State state, Function0 block, Continuation $completion) { int $i$f$withStateAtLeast = 0; boolean bool = (state.compareTo((Enum)Lifecycle.State.CREATED) >= 0) ? true : false; if (!bool) int $i$a$-require-WithLifecycleStateKt$withStateAtLeast$2 = 0;  } private static final <R> Object withCreated$$forInline(Lifecycle $this$withCreated, Function0 block, Continuation $completion) { int $i$f$withCreated = 0; Lifecycle lifecycle = $this$withCreated; Lifecycle.State state = Lifecycle.State.CREATED; int $i$f$withStateAtLeastUnchecked = 0; MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate(); InlineMarker.mark(3); } @Nullable public static final <R> Object withCreated(@NotNull Lifecycle $this$withCreated, @NotNull Function0<? extends R> block, @NotNull Continuation<?> $completion) { int $i$f$withCreated = 0; Lifecycle lifecycle = $this$withCreated; Lifecycle.State state = Lifecycle.State.CREATED; int $i$f$withStateAtLeastUnchecked = 0; MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
/* 217 */     boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded($completion.getContext());
/* 218 */     if (!dispatchNeeded$iv) {
/* 219 */       if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) throw new LifecycleDestroyedException(); 
/* 220 */       if (lifecycle.getCurrentState().compareTo((Enum)state) >= 0);
/*     */     } 
/*     */     
/* 223 */     return suspendWithStateAtLeastUnchecked(lifecycle, state, dispatchNeeded$iv, (CoroutineDispatcher)lifecycleDispatcher$iv, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(block), $completion); } @Nullable public static final <R> Object withStarted(@NotNull Lifecycle $this$withStarted, @NotNull Function0<? extends R> block, @NotNull Continuation<?> $completion) { int $i$f$withStarted = 0; Lifecycle lifecycle = $this$withStarted; Lifecycle.State state = Lifecycle.State.STARTED; int $i$f$withStateAtLeastUnchecked = 0;
/* 224 */     MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
/* 225 */     boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded($completion.getContext());
/* 226 */     if (!dispatchNeeded$iv) {
/* 227 */       if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) throw new LifecycleDestroyedException(); 
/* 228 */       if (lifecycle.getCurrentState().compareTo((Enum)state) >= 0);
/*     */     } 
/*     */     
/* 231 */     return suspendWithStateAtLeastUnchecked(lifecycle, state, dispatchNeeded$iv, (CoroutineDispatcher)lifecycleDispatcher$iv, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(block), $completion); } private static final <R> Object withStarted$$forInline(Lifecycle $this$withStarted, Function0 block, Continuation $completion) { int $i$f$withStarted = 0; Lifecycle lifecycle = $this$withStarted; Lifecycle.State state = Lifecycle.State.STARTED; int $i$f$withStateAtLeastUnchecked = 0; MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate(); InlineMarker.mark(3); }
/* 232 */   @Nullable public static final <R> Object withResumed(@NotNull Lifecycle $this$withResumed, @NotNull Function0<? extends R> block, @NotNull Continuation<?> $completion) { int $i$f$withResumed = 0; Lifecycle lifecycle = $this$withResumed; Lifecycle.State state = Lifecycle.State.RESUMED; int $i$f$withStateAtLeastUnchecked = 0; MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
/* 233 */     boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded($completion.getContext());
/* 234 */     if (!dispatchNeeded$iv) {
/* 235 */       if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) throw new LifecycleDestroyedException(); 
/* 236 */       if (lifecycle.getCurrentState().compareTo((Enum)state) >= 0);
/*     */     } 
/*     */     
/* 239 */     return suspendWithStateAtLeastUnchecked(lifecycle, state, dispatchNeeded$iv, (CoroutineDispatcher)lifecycleDispatcher$iv, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(block), $completion); }
/*     */ 
/*     */   
/*     */   private static final <R> Object withResumed$$forInline(Lifecycle $this$withResumed, Function0 block, Continuation $completion) {
/*     */     int $i$f$withResumed = 0;
/*     */     Lifecycle lifecycle = $this$withResumed;
/*     */     Lifecycle.State state = Lifecycle.State.RESUMED;
/*     */     int $i$f$withStateAtLeastUnchecked = 0;
/*     */     MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
/*     */     InlineMarker.mark(3);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final <R> Object withStateAtLeast(@NotNull LifecycleOwner $this$withStateAtLeast, @NotNull Lifecycle.State state, @NotNull Function0 block, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore #4
/*     */     //   3: aload_0
/*     */     //   4: invokeinterface getLifecycle : ()Landroidx/lifecycle/Lifecycle;
/*     */     //   9: astore #5
/*     */     //   11: iconst_0
/*     */     //   12: istore #6
/*     */     //   14: aload_1
/*     */     //   15: getstatic androidx/lifecycle/Lifecycle$State.CREATED : Landroidx/lifecycle/Lifecycle$State;
/*     */     //   18: checkcast java/lang/Enum
/*     */     //   21: invokevirtual compareTo : (Ljava/lang/Enum;)I
/*     */     //   24: iflt -> 31
/*     */     //   27: iconst_1
/*     */     //   28: goto -> 32
/*     */     //   31: iconst_0
/*     */     //   32: ifne -> 59
/*     */     //   35: iconst_0
/*     */     //   36: istore #8
/*     */     //   38: aload_1
/*     */     //   39: <illegal opcode> makeConcatWithConstants : (Landroidx/lifecycle/Lifecycle$State;)Ljava/lang/String;
/*     */     //   44: astore #8
/*     */     //   46: new java/lang/IllegalArgumentException
/*     */     //   49: dup
/*     */     //   50: aload #8
/*     */     //   52: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   55: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   58: athrow
/*     */     //   59: aload #5
/*     */     //   61: astore #7
/*     */     //   63: iconst_0
/*     */     //   64: istore #8
/*     */     //   66: invokestatic getMain : ()Lkotlinx/coroutines/MainCoroutineDispatcher;
/*     */     //   69: invokevirtual getImmediate : ()Lkotlinx/coroutines/MainCoroutineDispatcher;
/*     */     //   72: astore #9
/*     */     //   74: aload #9
/*     */     //   76: aload_3
/*     */     //   77: invokeinterface getContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */     //   82: invokevirtual isDispatchNeeded : (Lkotlin/coroutines/CoroutineContext;)Z
/*     */     //   85: istore #10
/*     */     //   87: iload #10
/*     */     //   89: ifne -> 135
/*     */     //   92: aload #7
/*     */     //   94: invokevirtual getCurrentState : ()Landroidx/lifecycle/Lifecycle$State;
/*     */     //   97: getstatic androidx/lifecycle/Lifecycle$State.DESTROYED : Landroidx/lifecycle/Lifecycle$State;
/*     */     //   100: if_acmpne -> 111
/*     */     //   103: new androidx/lifecycle/LifecycleDestroyedException
/*     */     //   106: dup
/*     */     //   107: invokespecial <init> : ()V
/*     */     //   110: athrow
/*     */     //   111: aload #7
/*     */     //   113: invokevirtual getCurrentState : ()Landroidx/lifecycle/Lifecycle$State;
/*     */     //   116: aload_1
/*     */     //   117: checkcast java/lang/Enum
/*     */     //   120: invokevirtual compareTo : (Ljava/lang/Enum;)I
/*     */     //   123: iflt -> 135
/*     */     //   126: aload_2
/*     */     //   127: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   132: goto -> 160
/*     */     //   135: aload #7
/*     */     //   137: aload_1
/*     */     //   138: iload #10
/*     */     //   140: aload #9
/*     */     //   142: checkcast kotlinx/coroutines/CoroutineDispatcher
/*     */     //   145: new androidx/lifecycle/WithLifecycleStateKt$withStateAtLeastUnchecked$2
/*     */     //   148: dup
/*     */     //   149: aload_2
/*     */     //   150: invokespecial <init> : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   153: checkcast kotlin/jvm/functions/Function0
/*     */     //   156: aload_3
/*     */     //   157: invokestatic suspendWithStateAtLeastUnchecked : (Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;ZLkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   160: nop
/*     */     //   161: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #99	-> 3
/*     */     //   #240	-> 14
/*     */     //   #241	-> 38
/*     */     //   #240	-> 44
/*     */     //   #244	-> 59
/*     */     //   #245	-> 66
/*     */     //   #246	-> 74
/*     */     //   #246	-> 82
/*     */     //   #247	-> 87
/*     */     //   #248	-> 92
/*     */     //   #249	-> 111
/*     */     //   #252	-> 135
/*     */     //   #244	-> 160
/*     */     //   #102	-> 161
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   38	6	8	$i$a$-require-WithLifecycleStateKt$withStateAtLeast$2$iv	I
/*     */     //   66	94	8	$i$f$withStateAtLeastUnchecked	I
/*     */     //   74	86	9	lifecycleDispatcher$iv$iv	Lkotlinx/coroutines/MainCoroutineDispatcher;
/*     */     //   87	73	10	dispatchNeeded$iv$iv	Z
/*     */     //   63	97	7	$this$withStateAtLeastUnchecked$iv$iv	Landroidx/lifecycle/Lifecycle;
/*     */     //   14	147	6	$i$f$withStateAtLeast	I
/*     */     //   11	150	5	$this$withStateAtLeast$iv	Landroidx/lifecycle/Lifecycle;
/*     */     //   3	159	4	$i$f$withStateAtLeast	I
/*     */     //   0	162	0	$this$withStateAtLeast	Landroidx/lifecycle/LifecycleOwner;
/*     */     //   0	162	1	state	Landroidx/lifecycle/Lifecycle$State;
/*     */     //   0	162	2	block	Lkotlin/jvm/functions/Function0;
/*     */     //   0	162	3	$completion	Lkotlin/coroutines/Continuation;
/*     */   }
/*     */   
/*     */   private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner $this$withStateAtLeast, Lifecycle.State state, Function0 block, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore #4
/*     */     //   3: aload_0
/*     */     //   4: invokeinterface getLifecycle : ()Landroidx/lifecycle/Lifecycle;
/*     */     //   9: astore #5
/*     */     //   11: nop
/*     */     //   12: iconst_0
/*     */     //   13: istore #6
/*     */     //   15: aload_1
/*     */     //   16: getstatic androidx/lifecycle/Lifecycle$State.CREATED : Landroidx/lifecycle/Lifecycle$State;
/*     */     //   19: checkcast java/lang/Enum
/*     */     //   22: invokevirtual compareTo : (Ljava/lang/Enum;)I
/*     */     //   25: iconst_0
/*     */     //   26: if_icmplt -> 33
/*     */     //   29: iconst_1
/*     */     //   30: goto -> 34
/*     */     //   33: iconst_0
/*     */     //   34: istore #7
/*     */     //   36: nop
/*     */     //   37: nop
/*     */     //   38: iload #7
/*     */     //   40: ifne -> 72
/*     */     //   43: nop
/*     */     //   44: iconst_0
/*     */     //   45: istore #8
/*     */     //   47: aload_1
/*     */     //   48: <illegal opcode> makeConcatWithConstants : (Landroidx/lifecycle/Lifecycle$State;)Ljava/lang/String;
/*     */     //   53: nop
/*     */     //   54: goto -> 57
/*     */     //   57: astore #8
/*     */     //   59: new java/lang/IllegalArgumentException
/*     */     //   62: dup
/*     */     //   63: aload #8
/*     */     //   65: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   68: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   71: athrow
/*     */     //   72: nop
/*     */     //   73: goto -> 76
/*     */     //   76: aload #5
/*     */     //   78: astore #7
/*     */     //   80: nop
/*     */     //   81: iconst_0
/*     */     //   82: istore #8
/*     */     //   84: invokestatic getMain : ()Lkotlinx/coroutines/MainCoroutineDispatcher;
/*     */     //   87: invokevirtual getImmediate : ()Lkotlinx/coroutines/MainCoroutineDispatcher;
/*     */     //   90: astore #9
/*     */     //   92: aload #9
/*     */     //   94: nop
/*     */     //   95: iconst_3
/*     */     //   96: invokestatic mark : (I)V
/*     */     //   99: aconst_null
/*     */     //   100: invokeinterface getContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */     //   105: nop
/*     */     //   106: goto -> 109
/*     */     //   109: invokevirtual isDispatchNeeded : (Lkotlin/coroutines/CoroutineContext;)Z
/*     */     //   112: istore #10
/*     */     //   114: iload #10
/*     */     //   116: ifne -> 164
/*     */     //   119: aload #7
/*     */     //   121: invokevirtual getCurrentState : ()Landroidx/lifecycle/Lifecycle$State;
/*     */     //   124: getstatic androidx/lifecycle/Lifecycle$State.DESTROYED : Landroidx/lifecycle/Lifecycle$State;
/*     */     //   127: if_acmpne -> 138
/*     */     //   130: new androidx/lifecycle/LifecycleDestroyedException
/*     */     //   133: dup
/*     */     //   134: invokespecial <init> : ()V
/*     */     //   137: athrow
/*     */     //   138: aload #7
/*     */     //   140: invokevirtual getCurrentState : ()Landroidx/lifecycle/Lifecycle$State;
/*     */     //   143: aload_1
/*     */     //   144: checkcast java/lang/Enum
/*     */     //   147: invokevirtual compareTo : (Ljava/lang/Enum;)I
/*     */     //   150: iconst_0
/*     */     //   151: if_icmplt -> 164
/*     */     //   154: aload_2
/*     */     //   155: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   160: nop
/*     */     //   161: goto -> 201
/*     */     //   164: aload #7
/*     */     //   166: aload_1
/*     */     //   167: iload #10
/*     */     //   169: aload #9
/*     */     //   171: checkcast kotlinx/coroutines/CoroutineDispatcher
/*     */     //   174: new androidx/lifecycle/WithLifecycleStateKt$withStateAtLeastUnchecked$2
/*     */     //   177: dup
/*     */     //   178: aload_2
/*     */     //   179: invokespecial <init> : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   182: checkcast kotlin/jvm/functions/Function0
/*     */     //   185: aload_3
/*     */     //   186: iconst_0
/*     */     //   187: invokestatic mark : (I)V
/*     */     //   190: invokestatic suspendWithStateAtLeastUnchecked : (Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;ZLkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   193: iconst_1
/*     */     //   194: invokestatic mark : (I)V
/*     */     //   197: nop
/*     */     //   198: goto -> 201
/*     */     //   201: nop
/*     */     //   202: goto -> 205
/*     */     //   205: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #99	-> 3
/*     */     //   #253	-> 15
/*     */     //   #254	-> 47
/*     */     //   #253	-> 57
/*     */     //   #257	-> 76
/*     */     //   #258	-> 84
/*     */     //   #259	-> 92
/*     */     //   #259	-> 109
/*     */     //   #260	-> 114
/*     */     //   #261	-> 119
/*     */     //   #262	-> 138
/*     */     //   #265	-> 164
/*     */     //   #257	-> 201
/*     */     //   #102	-> 205
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   47	10	8	$i$a$-require-WithLifecycleStateKt$withStateAtLeast$2$iv	I
/*     */     //   84	117	8	$i$f$withStateAtLeastUnchecked	I
/*     */     //   92	109	9	lifecycleDispatcher$iv$iv	Lkotlinx/coroutines/MainCoroutineDispatcher;
/*     */     //   114	87	10	dispatchNeeded$iv$iv	Z
/*     */     //   81	120	7	$this$withStateAtLeastUnchecked$iv$iv	Landroidx/lifecycle/Lifecycle;
/*     */     //   15	190	6	$i$f$withStateAtLeast	I
/*     */     //   12	193	5	$this$withStateAtLeast$iv	Landroidx/lifecycle/Lifecycle;
/*     */     //   3	203	4	$i$f$withStateAtLeast	I
/*     */     //   0	206	0	$this$withStateAtLeast	Landroidx/lifecycle/LifecycleOwner;
/*     */     //   0	206	1	state	Landroidx/lifecycle/Lifecycle$State;
/*     */     //   0	206	2	block	Lkotlin/jvm/functions/Function0;
/*     */     //   0	206	3	$completion	Lkotlin/coroutines/Continuation;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final <R> Object withCreated(@NotNull LifecycleOwner $this$withCreated, @NotNull Function0<? extends R> block, @NotNull Continuation<?> $completion) {
/*     */     int $i$f$withCreated = 0;
/*     */     Lifecycle lifecycle = $this$withCreated.getLifecycle();
/*     */     Lifecycle.State state = Lifecycle.State.CREATED;
/*     */     int $i$f$withStateAtLeastUnchecked = 0;
/* 266 */     MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
/* 267 */     boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded($completion.getContext());
/* 268 */     if (!dispatchNeeded$iv) {
/* 269 */       if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) throw new LifecycleDestroyedException(); 
/* 270 */       if (lifecycle.getCurrentState().compareTo((Enum)state) >= 0);
/*     */     } 
/*     */     
/* 273 */     return suspendWithStateAtLeastUnchecked(lifecycle, state, dispatchNeeded$iv, (CoroutineDispatcher)lifecycleDispatcher$iv, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(block), $completion);
/* 274 */   } private static final <R> Object withCreated$$forInline(LifecycleOwner $this$withCreated, Function0 block, Continuation $completion) { int $i$f$withCreated = 0; Lifecycle lifecycle = $this$withCreated.getLifecycle(); Lifecycle.State state = Lifecycle.State.CREATED; int $i$f$withStateAtLeastUnchecked = 0; MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate(); InlineMarker.mark(3); } @Nullable public static final <R> Object withStarted(@NotNull LifecycleOwner $this$withStarted, @NotNull Function0<? extends R> block, @NotNull Continuation<?> $completion) { int $i$f$withStarted = 0; Lifecycle lifecycle = $this$withStarted.getLifecycle(); Lifecycle.State state = Lifecycle.State.STARTED; int $i$f$withStateAtLeastUnchecked = 0; MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
/* 275 */     boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded($completion.getContext());
/* 276 */     if (!dispatchNeeded$iv) {
/* 277 */       if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) throw new LifecycleDestroyedException(); 
/* 278 */       if (lifecycle.getCurrentState().compareTo((Enum)state) >= 0);
/*     */     } 
/*     */     
/* 281 */     return suspendWithStateAtLeastUnchecked(lifecycle, state, dispatchNeeded$iv, (CoroutineDispatcher)lifecycleDispatcher$iv, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(block), $completion); } private static final <R> Object withStarted$$forInline(LifecycleOwner $this$withStarted, Function0 block, Continuation $completion) { int $i$f$withStarted = 0; Lifecycle lifecycle = $this$withStarted.getLifecycle(); Lifecycle.State state = Lifecycle.State.STARTED; int $i$f$withStateAtLeastUnchecked = 0; MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate(); InlineMarker.mark(3); }
/* 282 */   @Nullable public static final <R> Object withResumed(@NotNull LifecycleOwner $this$withResumed, @NotNull Function0<? extends R> block, @NotNull Continuation<?> $completion) { int $i$f$withResumed = 0; Lifecycle lifecycle = $this$withResumed.getLifecycle(); Lifecycle.State state = Lifecycle.State.RESUMED; int $i$f$withStateAtLeastUnchecked = 0; MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
/* 283 */     boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded($completion.getContext());
/* 284 */     if (!dispatchNeeded$iv) {
/* 285 */       if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) throw new LifecycleDestroyedException(); 
/* 286 */       if (lifecycle.getCurrentState().compareTo((Enum)state) >= 0);
/*     */     } 
/*     */     
/* 289 */     return suspendWithStateAtLeastUnchecked(lifecycle, state, dispatchNeeded$iv, (CoroutineDispatcher)lifecycleDispatcher$iv, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(block), $completion); } private static final <R> Object withResumed$$forInline(LifecycleOwner $this$withResumed, Function0 block, Continuation $completion) { int $i$f$withResumed = 0; Lifecycle lifecycle = $this$withResumed.getLifecycle(); Lifecycle.State state = Lifecycle.State.RESUMED; int $i$f$withStateAtLeastUnchecked = 0; MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate(); InlineMarker.mark(3); }
/* 290 */   @PublishedApi @Nullable public static final <R> Object suspendWithStateAtLeastUnchecked(@NotNull Lifecycle $this$suspendWithStateAtLeastUnchecked, @NotNull Lifecycle.State state, boolean dispatchNeeded, @NotNull CoroutineDispatcher lifecycleDispatcher, @NotNull Function0<? extends R> block, @NotNull Continuation $completion) { int $i$f$suspendCancellableCoroutine = 0; Continuation uCont$iv = $completion; int $i$a$-suspendCoroutineUninterceptedOrReturn-CancellableContinuationKt$suspendCancellableCoroutine$2$iv = 0;
/* 291 */     CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(uCont$iv), 1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 297 */     cancellable$iv.initCancellability();
/* 298 */     CancellableContinuation<? super R> co = (CancellableContinuation)cancellable$iv; int $i$a$-suspendCancellableCoroutine-WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2 = 0; WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 observer = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1(state, $this$suspendWithStateAtLeastUnchecked, co, block); if (dispatchNeeded)
/* 299 */     { int $i$f$Runnable = 0; lifecycleDispatcher.dispatch((CoroutineContext)EmptyCoroutineContext.INSTANCE, new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$lambda$2$$inlined$Runnable$1($this$suspendWithStateAtLeastUnchecked, observer)); } else { $this$suspendWithStateAtLeastUnchecked.addObserver((LifecycleObserver)observer); }
/* 300 */      co.invokeOnCancellation(new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(lifecycleDispatcher, $this$suspendWithStateAtLeastUnchecked, observer)); if (cancellable$iv.getResult() == IntrinsicsKt.getCOROUTINE_SUSPENDED()) DebugProbesKt.probeCoroutineSuspended($completion);  return cancellable$iv.getResult(); }
/*     */ 
/*     */   
/*     */   @PublishedApi
/*     */   @Nullable
/*     */   public static final <R> Object withStateAtLeastUnchecked(@NotNull Lifecycle $this$withStateAtLeastUnchecked, @NotNull Lifecycle.State state, @NotNull Function0<? extends R> block, @NotNull Continuation<?> $completion) {
/*     */     int $i$f$withStateAtLeastUnchecked = 0;
/*     */     MainCoroutineDispatcher lifecycleDispatcher = Dispatchers.getMain().getImmediate();
/*     */     boolean dispatchNeeded = lifecycleDispatcher.isDispatchNeeded($completion.getContext());
/*     */     if (!dispatchNeeded) {
/*     */       if ($this$withStateAtLeastUnchecked.getCurrentState() == Lifecycle.State.DESTROYED)
/*     */         throw new LifecycleDestroyedException(); 
/*     */       if ($this$withStateAtLeastUnchecked.getCurrentState().compareTo((Enum)state) >= 0)
/*     */         return block.invoke(); 
/*     */     } 
/*     */     return suspendWithStateAtLeastUnchecked($this$withStateAtLeastUnchecked, state, dispatchNeeded, (CoroutineDispatcher)lifecycleDispatcher, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(block), $completion);
/*     */   }
/*     */   
/*     */   @PublishedApi
/*     */   private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle $this$withStateAtLeastUnchecked, Lifecycle.State state, Function0 block, Continuation $completion) {
/*     */     int $i$f$withStateAtLeastUnchecked = 0;
/*     */     MainCoroutineDispatcher lifecycleDispatcher = Dispatchers.getMain().getImmediate();
/*     */     InlineMarker.mark(3);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 176, d1 = {"\000\004\n\002\b\004\020\000\032\002H\001\"\004\b\000\020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "R", "invoke", "()Ljava/lang/Object;"})
/*     */   @SourceDebugExtension({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt$withStateAtLeastUnchecked$2\n*L\n1#1,207:1\n*E\n"})
/*     */   public static final class WithLifecycleStateKt$withStateAtLeastUnchecked$2 extends Lambda implements Function0<R> {
/*     */     public WithLifecycleStateKt$withStateAtLeastUnchecked$2(Function0<R> $block) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     public final R invoke() {
/*     */       return (R)this.$block.invoke();
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/LifecycleEventObserver;", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycle-runtime"})
/*     */   public static final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements LifecycleEventObserver {
/*     */     WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1(Lifecycle.State $state, Lifecycle $receiver, CancellableContinuation<R> $co, Function0<R> $block) {}
/*     */     
/*     */     public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
/*     */       Intrinsics.checkNotNullParameter(source, "source");
/*     */       Intrinsics.checkNotNullParameter(event, "event");
/*     */       if (event == Lifecycle.Event.Companion.upTo(this.$state)) {
/*     */         Object object;
/*     */         this.$this_suspendWithStateAtLeastUnchecked.removeObserver((LifecycleObserver)this);
/*     */         Function0<R> function0 = this.$block;
/*     */         CancellableContinuation<R> cancellableContinuation = this.$co;
/*     */         try {
/*     */           object = Result.constructor-impl(function0.invoke());
/*     */         } catch (Throwable throwable) {
/*     */           object = Result.constructor-impl(ResultKt.createFailure(throwable));
/*     */         } 
/*     */         cancellableContinuation.resumeWith(object);
/*     */       } else if (event == Lifecycle.Event.ON_DESTROY) {
/*     */         this.$this_suspendWithStateAtLeastUnchecked.removeObserver((LifecycleObserver)this);
/*     */         ((Continuation)this.$co).resumeWith(Result.constructor-impl(ResultKt.createFailure(new LifecycleDestroyedException())));
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\b\002\n\002\020\003\n\000\020\000\032\0020\001\"\004\b\000\020\0022\b\020\003\032\004\030\0010\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "R", "it", "", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,207:1\n17#2:208\n*S KotlinDebug\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2\n*L\n202#1:208\n*E\n"})
/*     */   static final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2 extends Lambda implements Function1<Throwable, Unit> {
/*     */     public final void invoke(@Nullable Throwable it) {
/*     */       if (this.$lifecycleDispatcher.isDispatchNeeded((CoroutineContext)EmptyCoroutineContext.INSTANCE)) {
/*     */         Lifecycle lifecycle = this.$this_suspendWithStateAtLeastUnchecked;
/*     */         WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1<R> withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = this.$observer;
/*     */         int $i$f$Runnable = 0;
/*     */         this.$lifecycleDispatcher.dispatch((CoroutineContext)EmptyCoroutineContext.INSTANCE, new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$invoke$$inlined$Runnable$1(lifecycle, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1));
/*     */       } else {
/*     */         this.$this_suspendWithStateAtLeastUnchecked.removeObserver((LifecycleObserver)this.$observer);
/*     */       } 
/*     */     }
/*     */     
/*     */     WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(CoroutineDispatcher $lifecycleDispatcher, Lifecycle $receiver, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 $observer) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-runtime-desktop-2.8.5.jar!\androidx\lifecycle\WithLifecycleStateKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */