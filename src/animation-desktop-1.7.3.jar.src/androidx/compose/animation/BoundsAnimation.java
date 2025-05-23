/*     */ package androidx.compose.animation;
/*     */ import androidx.compose.animation.core.AnimationVector4D;
/*     */ import androidx.compose.animation.core.FiniteAnimationSpec;
/*     */ import androidx.compose.animation.core.Transition;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\027\n\002\020\002\n\002\b\003\b\001\030\0002\0020\001BA\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005\022\034\020\007\032\030\022\004\022\0020\t\022\004\022\0020\n0\bR\b\022\004\022\0020\0060\005\022\006\020\013\032\0020\f¢\006\002\020\rJ\026\0202\032\002032\006\0204\032\0020\t2\006\0205\032\0020\tJ,\0206\032\002032\034\020\007\032\030\022\004\022\0020\t\022\004\022\0020\n0\bR\b\022\004\022\0020\0060\0052\006\020\013\032\0020\fRW\020\007\032\030\022\004\022\0020\t\022\004\022\0020\n0\bR\b\022\004\022\0020\0060\0052\034\020\016\032\030\022\004\022\0020\t\022\004\022\0020\n0\bR\b\022\004\022\0020\0060\0058F@BX\002¢\006\022\n\004\b\023\020\024\032\004\b\017\020\020\"\004\b\021\020\022R \020\025\032\b\022\004\022\0020\t0\026X\016¢\006\016\n\000\032\004\b\027\020\030\"\004\b\031\020\032R;\020\034\032\n\022\004\022\0020\t\030\0010\0332\016\020\016\032\n\022\004\022\0020\t\030\0010\0338F@FX\002¢\006\022\n\004\b!\020\024\032\004\b\035\020\036\"\004\b\037\020 R+\020\013\032\0020\f2\006\020\016\032\0020\f8B@BX\002¢\006\022\n\004\b&\020\024\032\004\b\"\020#\"\004\b$\020%R\021\020'\032\0020\0068F¢\006\006\032\004\b'\020(R\021\020)\032\0020\0068F¢\006\006\032\004\b*\020(R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b+\020,R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b-\020.R\023\020/\032\004\030\0010\t8F¢\006\006\032\004\b0\0201¨\006\007"}, d2 = {"Landroidx/compose/animation/BoundsAnimation;", "", "transitionScope", "Landroidx/compose/animation/SharedTransitionScope;", "transition", "Landroidx/compose/animation/core/Transition;", "", "animation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/animation/core/AnimationVector4D;", "boundsTransform", "Landroidx/compose/animation/BoundsTransform;", "(Landroidx/compose/animation/SharedTransitionScope;Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/BoundsTransform;)V", "<set-?>", "getAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "setAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "animation$delegate", "Landroidx/compose/runtime/MutableState;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "Landroidx/compose/runtime/State;", "animationState", "getAnimationState", "()Landroidx/compose/runtime/State;", "setAnimationState", "(Landroidx/compose/runtime/State;)V", "animationState$delegate", "getBoundsTransform", "()Landroidx/compose/animation/BoundsTransform;", "setBoundsTransform", "(Landroidx/compose/animation/BoundsTransform;)V", "boundsTransform$delegate", "isRunning", "()Z", "target", "getTarget", "getTransition", "()Landroidx/compose/animation/core/Transition;", "getTransitionScope", "()Landroidx/compose/animation/SharedTransitionScope;", "value", "getValue", "()Landroidx/compose/ui/geometry/Rect;", "animate", "", "currentBounds", "targetBounds", "updateAnimation"})
/*     */ @ExperimentalSharedTransitionApi
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nBoundsAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoundsAnimation.kt\nandroidx/compose/animation/BoundsAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,102:1\n81#2:103\n107#2,2:104\n81#2:106\n107#2,2:107\n81#2:109\n107#2,2:110\n*S KotlinDebug\n*F\n+ 1 BoundsAnimation.kt\nandroidx/compose/animation/BoundsAnimation\n*L\n39#1:103\n39#1:104,2\n54#1:106\n54#1:107,2\n69#1:109\n69#1:110,2\n*E\n"})
/*     */ public final class BoundsAnimation {
/*     */   @NotNull
/*     */   private final SharedTransitionScope transitionScope;
/*     */   @NotNull
/*     */   private final Transition<Boolean> transition;
/*     */   @NotNull
/*     */   private final MutableState animation$delegate;
/*     */   @NotNull
/*     */   private final MutableState boundsTransform$delegate;
/*     */   @NotNull
/*     */   private FiniteAnimationSpec<Rect> animationSpec;
/*     */   @NotNull
/*     */   private final MutableState animationState$delegate;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public BoundsAnimation(@NotNull SharedTransitionScope transitionScope, @NotNull Transition<Boolean> transition, @NotNull Transition.DeferredAnimation animation, @NotNull BoundsTransform boundsTransform) {
/*  33 */     this.transitionScope = transitionScope;
/*  34 */     this.transition = transition;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  39 */     this.animation$delegate = SnapshotStateKt.mutableStateOf$default(animation, null, 2, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  54 */     this.boundsTransform$delegate = SnapshotStateKt.mutableStateOf$default(boundsTransform, null, 2, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  65 */     this.animationSpec = (FiniteAnimationSpec<Rect>)BoundsAnimationKt.access$getDefaultBoundsAnimation$p();
/*     */ 
/*     */ 
/*     */     
/*  69 */     this.animationState$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final SharedTransitionScope getTransitionScope() {
/*     */     return this.transitionScope;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Transition<Boolean> getTransition() {
/*     */     return this.transition;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> getAnimation()
/*     */   {
/*     */     State state = (State)this.animation$delegate;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 103 */     return (Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D>)state.getValue(); } private final void setAnimation(Transition.DeferredAnimation <set-?>) { MutableState mutableState = this.animation$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 104 */     mutableState.setValue(<set-?>); } public final void updateAnimation(@NotNull Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> animation, @NotNull BoundsTransform boundsTransform) { Intrinsics.checkNotNullParameter(animation, "animation"); Intrinsics.checkNotNullParameter(boundsTransform, "boundsTransform"); if (!Intrinsics.areEqual(getAnimation(), animation)) { setAnimation(animation); setAnimationState(null); this.animationSpec = (FiniteAnimationSpec<Rect>)BoundsAnimationKt.access$getDefaultBoundsAnimation$p(); }
/*     */      setBoundsTransform(boundsTransform); }
/* 106 */   private final BoundsTransform getBoundsTransform() { State state = (State)this.boundsTransform$delegate; KProperty property$iv = null; int $i$f$getValue = 0; return (BoundsTransform)state.getValue(); } private final void setBoundsTransform(BoundsTransform <set-?>) { MutableState mutableState = this.boundsTransform$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 107 */     mutableState.setValue(<set-?>); }
/*     */   public final boolean isRunning() { Transition<Boolean> parent = this.transition; while (parent.getParentTransition() != null) { Intrinsics.checkNotNull(parent.getParentTransition()); parent = parent.getParentTransition(); }
/* 109 */      return !Intrinsics.areEqual(parent.getCurrentState(), parent.getTargetState()); } @Nullable public final State<Rect> getAnimationState() { State state = (State)this.animationState$delegate; KProperty property$iv = null; int $i$f$getValue = 0; return (State<Rect>)state.getValue(); }
/* 110 */   @NotNull public final FiniteAnimationSpec<Rect> getAnimationSpec() { return this.animationSpec; } public final void setAnimationSpec(@NotNull FiniteAnimationSpec<Rect> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.animationSpec = <set-?>; } public final void setAnimationState(@Nullable State <set-?>) { MutableState mutableState = this.animationState$delegate; KProperty property$iv = null; int $i$f$setValue = 0; mutableState.setValue(<set-?>); }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Rect getValue() {
/*     */     getAnimationState();
/*     */     return this.transitionScope.isTransitionActive() ? ((getAnimationState() != null) ? (Rect)getAnimationState().getValue() : null) : null;
/*     */   }
/*     */   
/*     */   public final void animate(@NotNull Rect currentBounds, @NotNull Rect targetBounds) {
/*     */     Intrinsics.checkNotNullParameter(currentBounds, "currentBounds");
/*     */     Intrinsics.checkNotNullParameter(targetBounds, "targetBounds");
/*     */     if (this.transitionScope.isTransitionActive()) {
/*     */       if (getAnimationState() == null)
/*     */         this.animationSpec = getBoundsTransform().transform(currentBounds, targetBounds); 
/*     */       setAnimationState(getAnimation().animate(new BoundsAnimation$animate$1(), new BoundsAnimation$animate$2(targetBounds, currentBounds)));
/*     */     } 
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\000\020\000\032\b\022\004\022\0020\0020\001*\b\022\004\022\0020\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/animation/core/Transition$Segment;", "", "invoke"})
/*     */   static final class BoundsAnimation$animate$1 extends Lambda implements Function1<Transition.Segment<Boolean>, FiniteAnimationSpec<Rect>> {
/*     */     BoundsAnimation$animate$1() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final FiniteAnimationSpec<Rect> invoke(@NotNull Transition.Segment $this$animate) {
/*     */       Intrinsics.checkNotNullParameter($this$animate, "$this$animate");
/*     */       return BoundsAnimation.this.getAnimationSpec();
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\013\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Rect;", "it", "", "invoke"})
/*     */   static final class BoundsAnimation$animate$2 extends Lambda implements Function1<Boolean, Rect> {
/*     */     @NotNull
/*     */     public final Rect invoke(boolean it) {
/*     */       return (it == ((Boolean)BoundsAnimation.this.getTransition().getTargetState()).booleanValue()) ? this.$targetBounds : this.$currentBounds;
/*     */     }
/*     */     
/*     */     BoundsAnimation$animate$2(Rect $targetBounds, Rect $currentBounds) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   public final boolean getTarget() {
/*     */     return ((Boolean)this.transition.getTargetState()).booleanValue();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\BoundsAnimation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */