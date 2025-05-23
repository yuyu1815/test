/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.collection.MutableScatterMap;
/*     */ import androidx.collection.ScatterMapKt;
/*     */ import androidx.compose.animation.core.AnimationSpecKt;
/*     */ import androidx.compose.animation.core.AnimationVector2D;
/*     */ import androidx.compose.animation.core.FiniteAnimationSpec;
/*     */ import androidx.compose.animation.core.Transition;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.ParentDataModifier;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.IntOffset;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import androidx.compose.ui.unit.IntSizeKt;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\032\n\002\030\002\n\002\b\007\n\002\020\013\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\020\b\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\004\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002:\002UVB%\b\000\022\f\020\003\032\b\022\004\022\0028\0000\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b¢\006\002\020\tJ\"\0205\032\002062\006\0207\032\0020\f2\006\020\025\032\0020\fH\002ø\001\000¢\006\004\b8\0209J\027\020:\032\0020;2\006\020<\032\0020=H\001¢\006\004\b>\020?JK\020@\032\0020A2\006\020B\032\002002\f\020C\032\b\022\004\022\002060D2!\020E\032\035\022\023\022\0210G¢\006\f\bH\022\b\bI\022\004\b\b(J\022\004\022\0020G0FH\026ø\001\000¢\006\004\bK\020LJK\020M\032\0020N2\006\020B\032\002002\f\020C\032\b\022\004\022\002060D2!\020O\032\035\022\023\022\0210G¢\006\f\bH\022\b\bI\022\004\b\b(J\022\004\022\0020G0FH\026ø\001\000¢\006\004\bP\020QJ\027\020R\032\0020=*\0020=2\b\020S\032\004\030\0010TH\004R\"\020\n\032\n\022\004\022\0020\f\030\0010\013X\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020R\032\020\005\032\0020\006X\016¢\006\016\n\000\032\004\b\021\020\022\"\004\b\023\020\024R\032\020\025\032\0020\f8BX\004ø\001\000ø\001\001¢\006\006\032\004\b\026\020\027R\024\020\030\032\0028\0008VX\004¢\006\006\032\004\b\031\020\032R\032\020\007\032\0020\bX\016¢\006\016\n\000\032\004\b\033\020\034\"\004\b\035\020\036R1\020 \032\0020\f2\006\020\037\032\0020\f8@@@X\002ø\001\000ø\001\001¢\006\022\n\004\b$\020%\032\004\b!\020\027\"\004\b\"\020#R&\020&\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0020\f0\0130'X\004¢\006\b\n\000\032\004\b(\020)R\024\020*\032\0028\0008VX\004¢\006\006\032\004\b+\020\032R\032\020\003\032\b\022\004\022\0028\0000\004X\004¢\006\b\n\000\032\004\b,\020-R\030\020.\032\0020/*\002008BX\004¢\006\006\032\004\b1\0202R\030\0203\032\0020/*\002008BX\004¢\006\006\032\004\b4\0202\002\013\n\005\b¡\0360\001\n\002\b!¨\006W²\006\020\020X\032\0020/\"\004\b\000\020\001X\002"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "S", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "transition", "Landroidx/compose/animation/core/Transition;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/LayoutDirection;)V", "animatedSize", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/IntSize;", "getAnimatedSize$animation", "()Landroidx/compose/runtime/State;", "setAnimatedSize$animation", "(Landroidx/compose/runtime/State;)V", "getContentAlignment", "()Landroidx/compose/ui/Alignment;", "setContentAlignment", "(Landroidx/compose/ui/Alignment;)V", "currentSize", "getCurrentSize-YbymL2g", "()J", "initialState", "getInitialState", "()Ljava/lang/Object;", "getLayoutDirection$animation", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection$animation", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "<set-?>", "measuredSize", "getMeasuredSize-YbymL2g$animation", "setMeasuredSize-ozmzZPI$animation", "(J)V", "measuredSize$delegate", "Landroidx/compose/runtime/MutableState;", "targetSizeMap", "Landroidx/collection/MutableScatterMap;", "getTargetSizeMap$animation", "()Landroidx/collection/MutableScatterMap;", "targetState", "getTargetState", "getTransition$animation", "()Landroidx/compose/animation/core/Transition;", "isLeft", "", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "isLeft-gWo6LJ4", "(I)Z", "isRight", "isRight-gWo6LJ4", "calculateOffset", "Landroidx/compose/ui/unit/IntOffset;", "fullSize", "calculateOffset-emnUabE", "(JJ)J", "createSizeAnimationModifier", "Landroidx/compose/ui/Modifier;", "contentTransform", "Landroidx/compose/animation/ContentTransform;", "createSizeAnimationModifier$animation", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "slideIntoContainer", "Landroidx/compose/animation/EnterTransition;", "towards", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "initialOffset", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "offsetForFullSlide", "slideIntoContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "slideOutOfContainer", "Landroidx/compose/animation/ExitTransition;", "targetOffset", "slideOutOfContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "using", "sizeTransform", "Landroidx/compose/animation/SizeTransform;", "ChildData", "SizeModifier", "animation", "shouldAnimateSize"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,899:1\n81#2:900\n107#2,2:901\n81#2:915\n107#2,2:916\n1225#3,6:903\n1225#3,6:909\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n*L\n561#1:900\n561#1:901,2\n575#1:915\n575#1:916,2\n575#1:903,6\n587#1:909,6\n*E\n"})
/*     */ public final class AnimatedContentTransitionScopeImpl<S>
/*     */   implements AnimatedContentTransitionScope<S>
/*     */ {
/*     */   @NotNull
/*     */   private final Transition<S> transition;
/*     */   @NotNull
/*     */   private Alignment contentAlignment;
/*     */   @NotNull
/*     */   private LayoutDirection layoutDirection;
/*     */   @NotNull
/*     */   private final MutableState measuredSize$delegate;
/*     */   @NotNull
/*     */   private final MutableScatterMap<S, State<IntSize>> targetSizeMap;
/*     */   @Nullable
/*     */   private State<IntSize> animatedSize;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public AnimatedContentTransitionScopeImpl(@NotNull Transition<S> transition, @NotNull Alignment contentAlignment, @NotNull LayoutDirection layoutDirection) {
/* 406 */     this.transition = transition;
/* 407 */     this.contentAlignment = contentAlignment;
/* 408 */     this.layoutDirection = layoutDirection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 561 */     this.measuredSize$delegate = SnapshotStateKt.mutableStateOf$default(IntSize.box-impl(IntSize.Companion.getZero-YbymL2g()), null, 2, null);
/* 562 */     this.targetSizeMap = ScatterMapKt.mutableScatterMapOf();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Transition<S> getTransition$animation() {
/*     */     return this.transition;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public Alignment getContentAlignment() {
/*     */     return this.contentAlignment;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContentAlignment(@NotNull Alignment <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.contentAlignment = <set-?>;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final LayoutDirection getLayoutDirection$animation() {
/*     */     return this.layoutDirection;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void setLayoutDirection$animation(@NotNull LayoutDirection <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.layoutDirection = <set-?>;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public S getInitialState() {
/*     */     return (S)this.transition.getSegment().getInitialState();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public S getTargetState() {
/*     */     return (S)this.transition.getSegment().getTargetState();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public ContentTransform using(@NotNull ContentTransform $this$using, @Nullable SizeTransform sizeTransform) {
/*     */     Intrinsics.checkNotNullParameter($this$using, "<this>");
/*     */     ContentTransform contentTransform1 = $this$using, $this$using_u24lambda_u240 = contentTransform1;
/*     */     int $i$a$-apply-AnimatedContentTransitionScopeImpl$using$1 = 0;
/*     */     $this$using_u24lambda_u240.setSizeTransform$animation(sizeTransform);
/*     */     return contentTransform1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public EnterTransition slideIntoContainer-mOhB8PU(int towards, @NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super Integer, Integer> initialOffset) {
/*     */     Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
/*     */     Intrinsics.checkNotNullParameter(initialOffset, "initialOffset");
/*     */     return isLeft-gWo6LJ4(towards) ? EnterExitTransitionKt.slideInHorizontally(animationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$1(this)) : (isRight-gWo6LJ4(towards) ? EnterExitTransitionKt.slideInHorizontally(animationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$2(this)) : (AnimatedContentTransitionScope.SlideDirection.equals-impl0(towards, AnimatedContentTransitionScope.SlideDirection.Companion.getUp-DKzdypw()) ? EnterExitTransitionKt.slideInVertically(animationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$3(this)) : (AnimatedContentTransitionScope.SlideDirection.equals-impl0(towards, AnimatedContentTransitionScope.SlideDirection.Companion.getDown-DKzdypw()) ? EnterExitTransitionKt.slideInVertically(animationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$4(this)) : EnterTransition.Companion.getNone())));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\001H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "S", "it", "invoke", "(I)Ljava/lang/Integer;"})
/*     */   static final class AnimatedContentTransitionScopeImpl$slideIntoContainer$1
/*     */     extends Lambda
/*     */     implements Function1<Integer, Integer>
/*     */   {
/*     */     @NotNull
/*     */     public final Integer invoke(int it) {
/*     */       return (Integer)this.$initialOffset.invoke(Integer.valueOf(IntSize.getWidth-impl(AnimatedContentTransitionScopeImpl.this.getCurrentSize-YbymL2g()) - IntOffset.getX-impl(AnimatedContentTransitionScopeImpl.this.calculateOffset-emnUabE(IntSizeKt.IntSize(it, it), AnimatedContentTransitionScopeImpl.this.getCurrentSize-YbymL2g()))));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimatedContentTransitionScopeImpl$slideIntoContainer$1(AnimatedContentTransitionScopeImpl<S> $receiver) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\001H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "S", "it", "invoke", "(I)Ljava/lang/Integer;"})
/*     */   static final class AnimatedContentTransitionScopeImpl$slideIntoContainer$2
/*     */     extends Lambda
/*     */     implements Function1<Integer, Integer>
/*     */   {
/*     */     @NotNull
/*     */     public final Integer invoke(int it) {
/*     */       return (Integer)this.$initialOffset.invoke(Integer.valueOf(-IntOffset.getX-impl(AnimatedContentTransitionScopeImpl.this.calculateOffset-emnUabE(IntSizeKt.IntSize(it, it), AnimatedContentTransitionScopeImpl.this.getCurrentSize-YbymL2g())) - it));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimatedContentTransitionScopeImpl$slideIntoContainer$2(AnimatedContentTransitionScopeImpl<S> $receiver) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\001H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "S", "it", "invoke", "(I)Ljava/lang/Integer;"})
/*     */   static final class AnimatedContentTransitionScopeImpl$slideIntoContainer$3
/*     */     extends Lambda
/*     */     implements Function1<Integer, Integer>
/*     */   {
/*     */     @NotNull
/*     */     public final Integer invoke(int it) {
/*     */       return (Integer)this.$initialOffset.invoke(Integer.valueOf(IntSize.getHeight-impl(AnimatedContentTransitionScopeImpl.this.getCurrentSize-YbymL2g()) - IntOffset.getY-impl(AnimatedContentTransitionScopeImpl.this.calculateOffset-emnUabE(IntSizeKt.IntSize(it, it), AnimatedContentTransitionScopeImpl.this.getCurrentSize-YbymL2g()))));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimatedContentTransitionScopeImpl$slideIntoContainer$3(AnimatedContentTransitionScopeImpl<S> $receiver) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\001H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "S", "it", "invoke", "(I)Ljava/lang/Integer;"})
/*     */   static final class AnimatedContentTransitionScopeImpl$slideIntoContainer$4
/*     */     extends Lambda
/*     */     implements Function1<Integer, Integer>
/*     */   {
/*     */     @NotNull
/*     */     public final Integer invoke(int it) {
/*     */       return (Integer)this.$initialOffset.invoke(Integer.valueOf(-IntOffset.getY-impl(AnimatedContentTransitionScopeImpl.this.calculateOffset-emnUabE(IntSizeKt.IntSize(it, it), AnimatedContentTransitionScopeImpl.this.getCurrentSize-YbymL2g())) - it));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimatedContentTransitionScopeImpl$slideIntoContainer$4(AnimatedContentTransitionScopeImpl<S> $receiver) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final boolean isLeft-gWo6LJ4(int $this$isLeft) {
/*     */     return (AnimatedContentTransitionScope.SlideDirection.equals-impl0($this$isLeft, AnimatedContentTransitionScope.SlideDirection.Companion.getLeft-DKzdypw()) || (AnimatedContentTransitionScope.SlideDirection.equals-impl0($this$isLeft, AnimatedContentTransitionScope.SlideDirection.Companion.getStart-DKzdypw()) && this.layoutDirection == LayoutDirection.Ltr) || (AnimatedContentTransitionScope.SlideDirection.equals-impl0($this$isLeft, AnimatedContentTransitionScope.SlideDirection.Companion.getEnd-DKzdypw()) && this.layoutDirection == LayoutDirection.Rtl));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final boolean isRight-gWo6LJ4(int $this$isRight) {
/*     */     return (AnimatedContentTransitionScope.SlideDirection.equals-impl0($this$isRight, AnimatedContentTransitionScope.SlideDirection.Companion.getRight-DKzdypw()) || (AnimatedContentTransitionScope.SlideDirection.equals-impl0($this$isRight, AnimatedContentTransitionScope.SlideDirection.Companion.getStart-DKzdypw()) && this.layoutDirection == LayoutDirection.Rtl) || (AnimatedContentTransitionScope.SlideDirection.equals-impl0($this$isRight, AnimatedContentTransitionScope.SlideDirection.Companion.getEnd-DKzdypw()) && this.layoutDirection == LayoutDirection.Ltr));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final long calculateOffset-emnUabE(long fullSize, long currentSize) {
/*     */     return getContentAlignment().align-KFBX0sM(fullSize, currentSize, LayoutDirection.Ltr);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public ExitTransition slideOutOfContainer-mOhB8PU(int towards, @NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super Integer, Integer> targetOffset) {
/*     */     Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
/*     */     Intrinsics.checkNotNullParameter(targetOffset, "targetOffset");
/*     */     return isLeft-gWo6LJ4(towards) ? EnterExitTransitionKt.slideOutHorizontally(animationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$1(targetOffset)) : (isRight-gWo6LJ4(towards) ? EnterExitTransitionKt.slideOutHorizontally(animationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$2(targetOffset)) : (AnimatedContentTransitionScope.SlideDirection.equals-impl0(towards, AnimatedContentTransitionScope.SlideDirection.Companion.getUp-DKzdypw()) ? EnterExitTransitionKt.slideOutVertically(animationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$3(targetOffset)) : (AnimatedContentTransitionScope.SlideDirection.equals-impl0(towards, AnimatedContentTransitionScope.SlideDirection.Companion.getDown-DKzdypw()) ? EnterExitTransitionKt.slideOutVertically(animationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$4(targetOffset)) : ExitTransition.Companion.getNone())));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\001H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "S", "it", "invoke", "(I)Ljava/lang/Integer;"})
/*     */   static final class AnimatedContentTransitionScopeImpl$slideOutOfContainer$1
/*     */     extends Lambda
/*     */     implements Function1<Integer, Integer>
/*     */   {
/*     */     @NotNull
/*     */     public final Integer invoke(int it) {
/*     */       (State)AnimatedContentTransitionScopeImpl.this.getTargetSizeMap$animation().get(AnimatedContentTransitionScopeImpl.this.getTransition$animation().getTargetState());
/*     */       long targetSize = ((State)AnimatedContentTransitionScopeImpl.this.getTargetSizeMap$animation().get(AnimatedContentTransitionScopeImpl.this.getTransition$animation().getTargetState()) != null) ? ((IntSize)((State)AnimatedContentTransitionScopeImpl.this.getTargetSizeMap$animation().get(AnimatedContentTransitionScopeImpl.this.getTransition$animation().getTargetState())).getValue()).unbox-impl() : IntSize.Companion.getZero-YbymL2g();
/*     */       return (Integer)this.$targetOffset.invoke(Integer.valueOf(-IntOffset.getX-impl(AnimatedContentTransitionScopeImpl.this.calculateOffset-emnUabE(IntSizeKt.IntSize(it, it), targetSize)) - it));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimatedContentTransitionScopeImpl$slideOutOfContainer$1(Function1<Integer, Integer> $targetOffset) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\001H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "S", "it", "invoke", "(I)Ljava/lang/Integer;"})
/*     */   static final class AnimatedContentTransitionScopeImpl$slideOutOfContainer$2
/*     */     extends Lambda
/*     */     implements Function1<Integer, Integer>
/*     */   {
/*     */     @NotNull
/*     */     public final Integer invoke(int it) {
/*     */       (State)AnimatedContentTransitionScopeImpl.this.getTargetSizeMap$animation().get(AnimatedContentTransitionScopeImpl.this.getTransition$animation().getTargetState());
/*     */       long targetSize = ((State)AnimatedContentTransitionScopeImpl.this.getTargetSizeMap$animation().get(AnimatedContentTransitionScopeImpl.this.getTransition$animation().getTargetState()) != null) ? ((IntSize)((State)AnimatedContentTransitionScopeImpl.this.getTargetSizeMap$animation().get(AnimatedContentTransitionScopeImpl.this.getTransition$animation().getTargetState())).getValue()).unbox-impl() : IntSize.Companion.getZero-YbymL2g();
/*     */       return (Integer)this.$targetOffset.invoke(Integer.valueOf(-IntOffset.getX-impl(AnimatedContentTransitionScopeImpl.this.calculateOffset-emnUabE(IntSizeKt.IntSize(it, it), targetSize)) + IntSize.getWidth-impl(targetSize)));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimatedContentTransitionScopeImpl$slideOutOfContainer$2(Function1<Integer, Integer> $targetOffset) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\001H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "S", "it", "invoke", "(I)Ljava/lang/Integer;"})
/*     */   static final class AnimatedContentTransitionScopeImpl$slideOutOfContainer$3
/*     */     extends Lambda
/*     */     implements Function1<Integer, Integer>
/*     */   {
/*     */     @NotNull
/*     */     public final Integer invoke(int it) {
/*     */       (State)AnimatedContentTransitionScopeImpl.this.getTargetSizeMap$animation().get(AnimatedContentTransitionScopeImpl.this.getTransition$animation().getTargetState());
/*     */       long targetSize = ((State)AnimatedContentTransitionScopeImpl.this.getTargetSizeMap$animation().get(AnimatedContentTransitionScopeImpl.this.getTransition$animation().getTargetState()) != null) ? ((IntSize)((State)AnimatedContentTransitionScopeImpl.this.getTargetSizeMap$animation().get(AnimatedContentTransitionScopeImpl.this.getTransition$animation().getTargetState())).getValue()).unbox-impl() : IntSize.Companion.getZero-YbymL2g();
/*     */       return (Integer)this.$targetOffset.invoke(Integer.valueOf(-IntOffset.getY-impl(AnimatedContentTransitionScopeImpl.this.calculateOffset-emnUabE(IntSizeKt.IntSize(it, it), targetSize)) - it));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimatedContentTransitionScopeImpl$slideOutOfContainer$3(Function1<Integer, Integer> $targetOffset) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\001H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "S", "it", "invoke", "(I)Ljava/lang/Integer;"})
/*     */   static final class AnimatedContentTransitionScopeImpl$slideOutOfContainer$4
/*     */     extends Lambda
/*     */     implements Function1<Integer, Integer>
/*     */   {
/*     */     @NotNull
/*     */     public final Integer invoke(int it) {
/*     */       (State)AnimatedContentTransitionScopeImpl.this.getTargetSizeMap$animation().get(AnimatedContentTransitionScopeImpl.this.getTransition$animation().getTargetState());
/*     */       long targetSize = ((State)AnimatedContentTransitionScopeImpl.this.getTargetSizeMap$animation().get(AnimatedContentTransitionScopeImpl.this.getTransition$animation().getTargetState()) != null) ? ((IntSize)((State)AnimatedContentTransitionScopeImpl.this.getTargetSizeMap$animation().get(AnimatedContentTransitionScopeImpl.this.getTransition$animation().getTargetState())).getValue()).unbox-impl() : IntSize.Companion.getZero-YbymL2g();
/*     */       return (Integer)this.$targetOffset.invoke(Integer.valueOf(-IntOffset.getY-impl(AnimatedContentTransitionScopeImpl.this.calculateOffset-emnUabE(IntSizeKt.IntSize(it, it), targetSize)) + IntSize.getHeight-impl(targetSize)));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimatedContentTransitionScopeImpl$slideOutOfContainer$4(Function1<Integer, Integer> $targetOffset) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getMeasuredSize-YbymL2g$animation()
/*     */   {
/*     */     State state = (State)this.measuredSize$delegate;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 900 */     return ((IntSize)state.getValue()).unbox-impl(); } public final void setMeasuredSize-ozmzZPI$animation(long <set-?>) { MutableState mutableState = this.measuredSize$delegate; Object object = null; Object value$iv = IntSize.box-impl(<set-?>); int $i$f$setValue = 0;
/* 901 */     mutableState.setValue(value$iv); }
/*     */   
/*     */   @NotNull
/*     */   public final MutableScatterMap<S, State<IntSize>> getTargetSizeMap$animation() {
/*     */     return this.targetSizeMap;
/*     */   }
/*     */   @Nullable
/*     */   public final State<IntSize> getAnimatedSize$animation() {
/*     */     return this.animatedSize;
/*     */   }
/*     */   private static final boolean createSizeAnimationModifier$lambda$2(MutableState $shouldAnimateSize$delegate) { State state = (State)$shouldAnimateSize$delegate;
/*     */     Object object = null;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 915 */     return ((Boolean)state.getValue()).booleanValue(); }
/*     */   public final void setAnimatedSize$animation(@Nullable State<IntSize> <set-?>) { this.animatedSize = <set-?>; } private final long getCurrentSize-YbymL2g() { return (this.animatedSize != null) ? ((IntSize)this.animatedSize.getValue()).unbox-impl() : getMeasuredSize-YbymL2g$animation(); } @Composable @NotNull public final Modifier createSizeAnimationModifier$animation(@NotNull ContentTransform contentTransform, @Nullable Composer $composer, int $changed) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'contentTransform'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc_w 93755870
/*     */     //   11: ldc_w 'C(createSizeAnimationModifier)574@27302L40,575@27371L52:AnimatedContent.kt#xbi5r1'
/*     */     //   14: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   17: invokestatic isTraceInProgress : ()Z
/*     */     //   20: ifeq -> 34
/*     */     //   23: ldc_w 93755870
/*     */     //   26: iload_3
/*     */     //   27: iconst_m1
/*     */     //   28: ldc_w 'androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:573)'
/*     */     //   31: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   34: aload_2
/*     */     //   35: ldc_w -546171924
/*     */     //   38: ldc_w 'CC(remember):AnimatedContent.kt#9igjgp'
/*     */     //   41: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   44: aload_2
/*     */     //   45: astore #6
/*     */     //   47: aload_2
/*     */     //   48: aload_0
/*     */     //   49: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   54: istore #7
/*     */     //   56: iconst_0
/*     */     //   57: istore #8
/*     */     //   59: aload #6
/*     */     //   61: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   66: astore #9
/*     */     //   68: iconst_0
/*     */     //   69: istore #10
/*     */     //   71: iload #7
/*     */     //   73: ifne -> 87
/*     */     //   76: aload #9
/*     */     //   78: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   81: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   84: if_acmpne -> 116
/*     */     //   87: iconst_0
/*     */     //   88: istore #11
/*     */     //   90: iconst_0
/*     */     //   91: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   94: aconst_null
/*     */     //   95: iconst_2
/*     */     //   96: aconst_null
/*     */     //   97: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   100: astore #11
/*     */     //   102: aload #6
/*     */     //   104: aload #11
/*     */     //   106: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   111: aload #11
/*     */     //   113: goto -> 118
/*     */     //   116: aload #9
/*     */     //   118: nop
/*     */     //   119: nop
/*     */     //   120: nop
/*     */     //   121: checkcast androidx/compose/runtime/MutableState
/*     */     //   124: astore #5
/*     */     //   126: aload_2
/*     */     //   127: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   130: aload #5
/*     */     //   132: astore #4
/*     */     //   134: aload_1
/*     */     //   135: invokevirtual getSizeTransform : ()Landroidx/compose/animation/SizeTransform;
/*     */     //   138: aload_2
/*     */     //   139: iconst_0
/*     */     //   140: invokestatic rememberUpdatedState : (Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   143: astore #5
/*     */     //   145: aload_0
/*     */     //   146: getfield transition : Landroidx/compose/animation/core/Transition;
/*     */     //   149: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */     //   152: aload_0
/*     */     //   153: getfield transition : Landroidx/compose/animation/core/Transition;
/*     */     //   156: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   159: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   162: ifeq -> 174
/*     */     //   165: aload #4
/*     */     //   167: iconst_0
/*     */     //   168: invokestatic createSizeAnimationModifier$lambda$3 : (Landroidx/compose/runtime/MutableState;Z)V
/*     */     //   171: goto -> 190
/*     */     //   174: aload #5
/*     */     //   176: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   181: ifnull -> 190
/*     */     //   184: aload #4
/*     */     //   186: iconst_1
/*     */     //   187: invokestatic createSizeAnimationModifier$lambda$3 : (Landroidx/compose/runtime/MutableState;Z)V
/*     */     //   190: aload_2
/*     */     //   191: ldc_w -546156510
/*     */     //   194: invokeinterface startReplaceGroup : (I)V
/*     */     //   199: aload_2
/*     */     //   200: ldc_w '585@27840L48,586@27901L205'
/*     */     //   203: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   206: aload #4
/*     */     //   208: invokestatic createSizeAnimationModifier$lambda$2 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   211: ifeq -> 398
/*     */     //   214: aload_0
/*     */     //   215: getfield transition : Landroidx/compose/animation/core/Transition;
/*     */     //   218: getstatic androidx/compose/ui/unit/IntSize.Companion : Landroidx/compose/ui/unit/IntSize$Companion;
/*     */     //   221: invokestatic getVectorConverter : (Landroidx/compose/ui/unit/IntSize$Companion;)Landroidx/compose/animation/core/TwoWayConverter;
/*     */     //   224: aconst_null
/*     */     //   225: aload_2
/*     */     //   226: iconst_0
/*     */     //   227: iconst_2
/*     */     //   228: invokestatic createDeferredAnimation : (Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*     */     //   231: astore #8
/*     */     //   233: aload_2
/*     */     //   234: ldc_w -546152591
/*     */     //   237: ldc_w 'CC(remember):AnimatedContent.kt#9igjgp'
/*     */     //   240: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   243: aload_2
/*     */     //   244: astore #10
/*     */     //   246: aload_2
/*     */     //   247: aload #8
/*     */     //   249: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   254: istore #11
/*     */     //   256: iconst_0
/*     */     //   257: istore #12
/*     */     //   259: aload #10
/*     */     //   261: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   266: astore #13
/*     */     //   268: iconst_0
/*     */     //   269: istore #14
/*     */     //   271: iload #11
/*     */     //   273: ifne -> 287
/*     */     //   276: aload #13
/*     */     //   278: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   281: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   284: if_acmpne -> 379
/*     */     //   287: iconst_0
/*     */     //   288: istore #15
/*     */     //   290: aload #5
/*     */     //   292: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   297: checkcast androidx/compose/animation/SizeTransform
/*     */     //   300: dup
/*     */     //   301: ifnull -> 320
/*     */     //   304: invokeinterface getClip : ()Z
/*     */     //   309: ifne -> 316
/*     */     //   312: iconst_1
/*     */     //   313: goto -> 322
/*     */     //   316: iconst_0
/*     */     //   317: goto -> 322
/*     */     //   320: pop
/*     */     //   321: iconst_0
/*     */     //   322: ifeq -> 334
/*     */     //   325: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   328: checkcast androidx/compose/ui/Modifier
/*     */     //   331: goto -> 343
/*     */     //   334: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   337: checkcast androidx/compose/ui/Modifier
/*     */     //   340: invokestatic clipToBounds : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   343: new androidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifier
/*     */     //   346: dup
/*     */     //   347: aload_0
/*     */     //   348: aload #8
/*     */     //   350: aload #5
/*     */     //   352: invokespecial <init> : (Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;)V
/*     */     //   355: checkcast androidx/compose/ui/Modifier
/*     */     //   358: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   363: astore #16
/*     */     //   365: aload #10
/*     */     //   367: aload #16
/*     */     //   369: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   374: aload #16
/*     */     //   376: goto -> 381
/*     */     //   379: aload #13
/*     */     //   381: nop
/*     */     //   382: nop
/*     */     //   383: nop
/*     */     //   384: checkcast androidx/compose/ui/Modifier
/*     */     //   387: astore #9
/*     */     //   389: aload_2
/*     */     //   390: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   393: aload #9
/*     */     //   395: goto -> 409
/*     */     //   398: aload_0
/*     */     //   399: aconst_null
/*     */     //   400: putfield animatedSize : Landroidx/compose/runtime/State;
/*     */     //   403: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   406: checkcast androidx/compose/ui/Modifier
/*     */     //   409: astore #7
/*     */     //   411: aload_2
/*     */     //   412: invokeinterface endReplaceGroup : ()V
/*     */     //   417: aload #7
/*     */     //   419: astore #6
/*     */     //   421: invokestatic isTraceInProgress : ()Z
/*     */     //   424: ifeq -> 430
/*     */     //   427: invokestatic traceEventEnd : ()V
/*     */     //   430: aload_2
/*     */     //   431: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   434: aload #6
/*     */     //   436: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #574	-> 14
/*     */     //   #575	-> 41
/*     */     //   #903	-> 59
/*     */     //   #904	-> 71
/*     */     //   #905	-> 87
/*     */     //   #575	-> 90
/*     */     //   #905	-> 100
/*     */     //   #906	-> 102
/*     */     //   #907	-> 111
/*     */     //   #908	-> 116
/*     */     //   #904	-> 118
/*     */     //   #903	-> 119
/*     */     //   #903	-> 120
/*     */     //   #575	-> 121
/*     */     //   #576	-> 134
/*     */     //   #577	-> 145
/*     */     //   #578	-> 165
/*     */     //   #581	-> 174
/*     */     //   #582	-> 184
/*     */     //   #585	-> 206
/*     */     //   #586	-> 214
/*     */     //   #587	-> 240
/*     */     //   #909	-> 259
/*     */     //   #910	-> 271
/*     */     //   #911	-> 287
/*     */     //   #588	-> 290
/*     */     //   #589	-> 343
/*     */     //   #911	-> 363
/*     */     //   #912	-> 365
/*     */     //   #913	-> 374
/*     */     //   #914	-> 379
/*     */     //   #910	-> 381
/*     */     //   #909	-> 382
/*     */     //   #909	-> 383
/*     */     //   #587	-> 384
/*     */     //   #592	-> 398
/*     */     //   #593	-> 403
/*     */     //   #585	-> 409
/*     */     //   #574	-> 431
/*     */     //   #585	-> 436
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   90	10	11	$i$a$-cache-AnimatedContentTransitionScopeImpl$createSizeAnimationModifier$shouldAnimateSize$2	I
/*     */     //   102	11	11	value$iv	Ljava/lang/Object;
/*     */     //   71	48	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   68	51	9	it$iv	Ljava/lang/Object;
/*     */     //   59	62	8	$i$f$cache	I
/*     */     //   56	65	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   56	65	7	invalid$iv	Z
/*     */     //   290	73	15	$i$a$-cache-AnimatedContentTransitionScopeImpl$createSizeAnimationModifier$1	I
/*     */     //   365	11	16	value$iv	Ljava/lang/Object;
/*     */     //   271	111	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   268	114	13	it$iv	Ljava/lang/Object;
/*     */     //   259	125	12	$i$f$cache	I
/*     */     //   256	128	10	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   256	128	11	invalid$iv	Z
/*     */     //   233	162	8	sizeAnimation	Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*     */     //   134	303	4	shouldAnimateSize$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   145	292	5	sizeTransform	Landroidx/compose/runtime/State;
/*     */     //   0	437	0	this	Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;
/*     */     //   0	437	1	contentTransform	Landroidx/compose/animation/ContentTransform;
/*     */     //   0	437	2	$composer	Landroidx/compose/runtime/Composer;
/* 916 */     //   0	437	3	$changed	I } private static final void createSizeAnimationModifier$lambda$3(MutableState $shouldAnimateSize$delegate, boolean value) { MutableState mutableState = $shouldAnimateSize$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(value); int $i$f$setValue = 0; mutableState.setValue(value$iv); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\007\n\002\020\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\026\020\n\032\0020\013*\0020\f2\b\020\r\032\004\030\0010\013H\026R+\020\002\032\0020\0032\006\020\005\032\0020\0038F@FX\002¢\006\022\n\004\b\b\020\t\032\004\b\002\020\006\"\004\b\007\020\004¨\006\016"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "isTarget", "", "(Z)V", "<set-?>", "()Z", "setTarget", "isTarget$delegate", "Landroidx/compose/runtime/MutableState;", "modifyParentData", "", "Landroidx/compose/ui/unit/Density;", "parentData", "animation"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,899:1\n81#2:900\n107#2,2:901\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData\n*L\n602#1:900\n602#1:901,2\n*E\n"})
/*     */   public static final class ChildData implements ParentDataModifier {
/*     */     @NotNull
/*     */     private final MutableState isTarget$delegate;
/*     */     public static final int $stable;
/*     */     
/*     */     public ChildData(boolean isTarget) {
/*     */       this.isTarget$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(isTarget), null, 2, null);
/*     */     }
/*     */     
/*     */     public final boolean isTarget() {
/*     */       State state = (State)this.isTarget$delegate;
/*     */       KProperty property$iv = null;
/*     */       int $i$f$getValue = 0;
/*     */       return ((Boolean)state.getValue()).booleanValue();
/*     */     }
/*     */     
/*     */     public final void setTarget(boolean <set-?>) {
/*     */       MutableState mutableState = this.isTarget$delegate;
/*     */       Object object = null;
/*     */       Object value$iv = Boolean.valueOf(<set-?>);
/*     */       int $i$f$setValue = 0;
/*     */       mutableState.setValue(value$iv);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Object modifyParentData(@NotNull Density $this$modifyParentData, @Nullable Object parentData) {
/*     */       Intrinsics.checkNotNullParameter($this$modifyParentData, "<this>");
/*     */       return this;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\004\030\0002\0020\001B3\022\034\020\002\032\030\022\004\022\0020\004\022\004\022\0020\0050\003R\b\022\004\022\0028\0000\006\022\016\020\007\032\n\022\006\022\004\030\0010\t0\b¢\006\002\020\nJ&\020\017\032\0020\020*\0020\0212\006\020\022\032\0020\0232\006\020\024\032\0020\025H\026ø\001\000¢\006\004\b\026\020\027R'\020\002\032\030\022\004\022\0020\004\022\004\022\0020\0050\003R\b\022\004\022\0028\0000\006¢\006\b\n\000\032\004\b\013\020\fR\031\020\007\032\n\022\006\022\004\030\0010\t0\b¢\006\b\n\000\032\004\b\r\020\016\002\007\n\005\b¡\0360\001¨\006\030"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "sizeTransform", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/SizeTransform;", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;)V", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeTransform", "()Landroidx/compose/runtime/State;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "animation"})
/*     */   private final class SizeModifier extends LayoutModifierWithPassThroughIntrinsics {
/*     */     @NotNull
/*     */     private final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
/*     */     @NotNull
/*     */     private final State<SizeTransform> sizeTransform;
/*     */     
/*     */     public SizeModifier(@NotNull Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation, State<SizeTransform> sizeTransform) {
/*     */       this.sizeAnimation = sizeAnimation;
/*     */       this.sizeTransform = sizeTransform;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
/*     */       return this.sizeAnimation;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final State<SizeTransform> getSizeTransform() {
/*     */       return this.sizeTransform;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$measure_u2d3p2s80s, @NotNull Measurable measurable, long constraints) {
/*     */       Intrinsics.checkNotNullParameter($this$measure_u2d3p2s80s, "$this$measure");
/*     */       Intrinsics.checkNotNullParameter(measurable, "measurable");
/*     */       Placeable placeable = measurable.measure-BRTryo0(constraints);
/*     */       State<IntSize> size = this.sizeAnimation.animate(new AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$1(this), new AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$2());
/*     */       AnimatedContentTransitionScopeImpl.this.setAnimatedSize$animation(size);
/*     */       long measuredSize = 0L;
/*     */       if ($this$measure_u2d3p2s80s.isLookingAhead()) {
/*     */         measuredSize = IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight());
/*     */       } else {
/*     */         measuredSize = ((IntSize)size.getValue()).unbox-impl();
/*     */       } 
/*     */       return MeasureScope.layout$default($this$measure_u2d3p2s80s, IntSize.getWidth-impl(measuredSize), IntSize.getHeight-impl(measuredSize), null, new AnimatedContentTransitionScopeImpl$SizeModifier$measure$1(placeable, measuredSize), 4, null);
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\001\"\004\b\000\020\003*\b\022\004\022\002H\0030\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "invoke"})
/*     */     static final class AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$1 extends Lambda implements Function1<Transition.Segment<S>, FiniteAnimationSpec<IntSize>> {
/*     */       @NotNull
/*     */       public final FiniteAnimationSpec<IntSize> invoke(@NotNull Transition.Segment $this$animate) {
/*     */         Intrinsics.checkNotNullParameter($this$animate, "$this$animate");
/*     */         (State)this.this$0.getTargetSizeMap$animation().get($this$animate.getInitialState());
/*     */         long initial = ((State)this.this$0.getTargetSizeMap$animation().get($this$animate.getInitialState()) != null) ? ((IntSize)((State)this.this$0.getTargetSizeMap$animation().get($this$animate.getInitialState())).getValue()).unbox-impl() : IntSize.Companion.getZero-YbymL2g();
/*     */         (State)this.this$0.getTargetSizeMap$animation().get($this$animate.getTargetState());
/*     */         long target = ((State)this.this$0.getTargetSizeMap$animation().get($this$animate.getTargetState()) != null) ? ((IntSize)((State)this.this$0.getTargetSizeMap$animation().get($this$animate.getTargetState())).getValue()).unbox-impl() : IntSize.Companion.getZero-YbymL2g();
/*     */         if ((SizeTransform)AnimatedContentTransitionScopeImpl.SizeModifier.this.getSizeTransform().getValue() == null || ((SizeTransform)AnimatedContentTransitionScopeImpl.SizeModifier.this.getSizeTransform().getValue()).createAnimationSpec-TemP2vQ(initial, target) == null)
/*     */           ((SizeTransform)AnimatedContentTransitionScopeImpl.SizeModifier.this.getSizeTransform().getValue()).createAnimationSpec-TemP2vQ(initial, target); 
/*     */         return (FiniteAnimationSpec<IntSize>)AnimationSpecKt.spring$default(0.0F, 0.0F, null, 7, null);
/*     */       }
/*     */       
/*     */       AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$1(AnimatedContentTransitionScopeImpl.SizeModifier sizeModifier) {
/*     */         super(1);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\002H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "S", "it", "invoke-YEO4UFw", "(Ljava/lang/Object;)J"})
/*     */     static final class AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$2 extends Lambda implements Function1<S, IntSize> {
/*     */       public final long invoke-YEO4UFw(Object it) {
/*     */         (State)AnimatedContentTransitionScopeImpl.this.getTargetSizeMap$animation().get(it);
/*     */         return ((State)AnimatedContentTransitionScopeImpl.this.getTargetSizeMap$animation().get(it) != null) ? ((IntSize)((State)AnimatedContentTransitionScopeImpl.this.getTargetSizeMap$animation().get(it)).getValue()).unbox-impl() : IntSize.Companion.getZero-YbymL2g();
/*     */       }
/*     */       
/*     */       AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$2() {
/*     */         super(1);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\001\"\004\b\000\020\002*\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "S", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/*     */     static final class AnimatedContentTransitionScopeImpl$SizeModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
/*     */       public final void invoke(@NotNull Placeable.PlacementScope $this$layout) {
/*     */         Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */         long offset = AnimatedContentTransitionScopeImpl.this.getContentAlignment().align-KFBX0sM(IntSizeKt.IntSize(this.$placeable.getWidth(), this.$placeable.getHeight()), this.$measuredSize, LayoutDirection.Ltr);
/*     */         Placeable.PlacementScope.place-70tqf50$default($this$layout, this.$placeable, offset, 0.0F, 2, null);
/*     */       }
/*     */       
/*     */       AnimatedContentTransitionScopeImpl$SizeModifier$measure$1(Placeable $placeable, long $measuredSize) {
/*     */         super(1);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\AnimatedContentTransitionScopeImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */