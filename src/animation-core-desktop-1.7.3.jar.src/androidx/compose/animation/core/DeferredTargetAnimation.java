/*    */ package androidx.compose.animation.core;
/*    */ 
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.runtime.SnapshotStateKt;
/*    */ import androidx.compose.runtime.State;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.reflect.KProperty;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\n\n\002\030\002\n\000\n\002\020\013\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\007\030\000*\004\b\000\020\001*\b\b\001\020\002*\0020\0032\0020\004B\031\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006¢\006\002\020\007J+\020\031\032\0028\0002\006\020\027\032\0028\0002\006\020\032\032\0020\0332\016\b\002\020\034\032\b\022\004\022\0028\0000\035¢\006\002\020\036R/\020\t\032\004\030\0018\0002\b\020\b\032\004\030\0018\0008B@BX\002¢\006\022\n\004\b\016\020\017\032\004\b\n\020\013\"\004\b\f\020\rR\034\020\020\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\021X\016¢\006\002\n\000R\021\020\022\032\0020\0238F¢\006\006\032\004\b\022\020\024R\023\020\025\032\004\030\0018\0008F¢\006\006\032\004\b\026\020\013R\026\020\027\032\004\030\0018\0008BX\004¢\006\006\032\004\b\030\020\013R\032\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006X\004¢\006\002\n\000¨\006\037"}, d2 = {"Landroidx/compose/animation/core/DeferredTargetAnimation;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "", "vectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/TwoWayConverter;)V", "<set-?>", "_pendingTarget", "get_pendingTarget", "()Ljava/lang/Object;", "set_pendingTarget", "(Ljava/lang/Object;)V", "_pendingTarget$delegate", "Landroidx/compose/runtime/MutableState;", "animatable", "Landroidx/compose/animation/core/Animatable;", "isIdle", "", "()Z", "pendingTarget", "getPendingTarget", "target", "getTarget", "updateTarget", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "(Ljava/lang/Object;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/animation/core/FiniteAnimationSpec;)Ljava/lang/Object;", "animation-core"})
/*    */ @ExperimentalAnimatableApi
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nDeferredTargetAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeferredTargetAnimation.kt\nandroidx/compose/animation/core/DeferredTargetAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n81#2:92\n107#2,2:93\n1#3:95\n*S KotlinDebug\n*F\n+ 1 DeferredTargetAnimation.kt\nandroidx/compose/animation/core/DeferredTargetAnimation\n*L\n53#1:92\n53#1:93,2\n*E\n"})
/*    */ public final class DeferredTargetAnimation<T, V extends AnimationVector>
/*    */ {
/*    */   @NotNull
/*    */   private final TwoWayConverter<T, V> vectorConverter;
/*    */   @NotNull
/*    */   private final MutableState _pendingTarget$delegate;
/*    */   @Nullable
/*    */   private Animatable<T, V> animatable;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   @Nullable
/*    */   public final T getPendingTarget() {
/*    */     return get_pendingTarget();
/*    */   }
/*    */   
/*    */   public DeferredTargetAnimation(@NotNull TwoWayConverter<T, V> vectorConverter) {
/* 45 */     this.vectorConverter = vectorConverter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 53 */     this._pendingTarget$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null); } private final T get_pendingTarget() { State state = (State)this._pendingTarget$delegate; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 92 */       (T)state.getValue(); } private final void set_pendingTarget(Object <set-?>) { MutableState mutableState = this._pendingTarget$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 93 */     mutableState.setValue(<set-?>); } public final T updateTarget(Object target, @NotNull CoroutineScope coroutineScope, @NotNull FiniteAnimationSpec<T> animationSpec) { Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope"); Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); set_pendingTarget((T)target); if (this.animatable == null) {
/*    */       Animatable<Object, AnimationVector> animatable1 = new Animatable<>(target, this.vectorConverter, null, null, 12, null), it = animatable1;
/* 95 */       int $i$a$-also-DeferredTargetAnimation$updateTarget$anim$1 = 0;
/*    */       this.animatable = (Animatable)it;
/*    */     } 
/*    */     Animatable<Object, AnimationVector> anim = animatable1;
/*    */     BuildersKt.launch$default(coroutineScope, null, null, new DeferredTargetAnimation$updateTarget$1(this, (T)target, animationSpec, null), 3, null);
/*    */     return (T)anim.getValue(); }
/*    */ 
/*    */   
/*    */   private final T getTarget() {
/*    */     return (this.animatable != null) ? this.animatable.getTargetValue() : null;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "DeferredTargetAnimation.kt", l = {77}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1")
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002\"\b\b\001\020\003*\0020\004*\0020\005H@"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class DeferredTargetAnimation$updateTarget$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     DeferredTargetAnimation$updateTarget$1(DeferredTargetAnimation<T, V> $receiver, Object $target, FiniteAnimationSpec<T> $animationSpec, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore_2
/*    */       //   4: aload_0
/*    */       //   5: getfield label : I
/*    */       //   8: tableswitch default -> 105, 0 -> 32, 1 -> 95
/*    */       //   32: aload_1
/*    */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   36: aload_0
/*    */       //   37: getfield $anim : Landroidx/compose/animation/core/Animatable;
/*    */       //   40: invokevirtual getTargetValue : ()Ljava/lang/Object;
/*    */       //   43: aload_0
/*    */       //   44: getfield this$0 : Landroidx/compose/animation/core/DeferredTargetAnimation;
/*    */       //   47: invokestatic access$get_pendingTarget : (Landroidx/compose/animation/core/DeferredTargetAnimation;)Ljava/lang/Object;
/*    */       //   50: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */       //   53: ifne -> 101
/*    */       //   56: aload_0
/*    */       //   57: getfield $anim : Landroidx/compose/animation/core/Animatable;
/*    */       //   60: aload_0
/*    */       //   61: getfield $target : Ljava/lang/Object;
/*    */       //   64: aload_0
/*    */       //   65: getfield $animationSpec : Landroidx/compose/animation/core/FiniteAnimationSpec;
/*    */       //   68: checkcast androidx/compose/animation/core/AnimationSpec
/*    */       //   71: aconst_null
/*    */       //   72: aconst_null
/*    */       //   73: aload_0
/*    */       //   74: checkcast kotlin/coroutines/Continuation
/*    */       //   77: bipush #12
/*    */       //   79: aconst_null
/*    */       //   80: aload_0
/*    */       //   81: iconst_1
/*    */       //   82: putfield label : I
/*    */       //   85: invokestatic animateTo$default : (Landroidx/compose/animation/core/Animatable;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */       //   88: dup
/*    */       //   89: aload_2
/*    */       //   90: if_acmpne -> 100
/*    */       //   93: aload_2
/*    */       //   94: areturn
/*    */       //   95: aload_1
/*    */       //   96: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   99: aload_1
/*    */       //   100: pop
/*    */       //   101: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   104: areturn
/*    */       //   105: new java/lang/IllegalStateException
/*    */       //   108: dup
/*    */       //   109: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   111: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   114: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #75	-> 3
/*    */       //   #76	-> 36
/*    */       //   #77	-> 56
/*    */       //   #75	-> 93
/*    */       //   #79	-> 100
/*    */       //   #75	-> 105
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   36	69	0	this	Landroidx/compose/animation/core/DeferredTargetAnimation$updateTarget$1;
/*    */       //   36	69	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super DeferredTargetAnimation$updateTarget$1> $completion) {
/*    */       return (Continuation<Unit>)new DeferredTargetAnimation$updateTarget$1(DeferredTargetAnimation.this, this.$target, this.$animationSpec, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((DeferredTargetAnimation$updateTarget$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   public final boolean isIdle() {
/*    */     if (Intrinsics.areEqual(get_pendingTarget(), getTarget()))
/*    */       if (!((this.animatable != null) ? ((this.animatable.isRunning() == true) ? 1 : 0) : 0)); 
/*    */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\DeferredTargetAnimation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */