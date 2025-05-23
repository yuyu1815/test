/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.animation.core.AnimationSpecKt;
/*     */ import androidx.compose.animation.core.FiniteAnimationSpec;
/*     */ import androidx.compose.animation.core.Transition;
/*     */ import androidx.compose.animation.core.VisibilityThresholdsKt;
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.unit.IntOffset;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\b\n\002\030\002\n\002\b\t\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bv\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002:\001#JO\020\f\032\0020\r2\006\020\016\032\0020\0172\016\b\002\020\020\032\b\022\004\022\0020\0220\0212#\b\002\020\023\032\035\022\023\022\0210\025¢\006\f\b\026\022\b\b\027\022\004\b\b(\030\022\004\022\0020\0250\024H&ø\001\000¢\006\004\b\031\020\032JO\020\033\032\0020\b2\006\020\016\032\0020\0172\016\b\002\020\020\032\b\022\004\022\0020\0220\0212#\b\002\020\034\032\035\022\023\022\0210\025¢\006\f\b\026\022\b\b\027\022\004\b\b(\030\022\004\022\0020\0250\024H&ø\001\000¢\006\004\b\035\020\036J\027\020\037\032\0020 *\0020 2\b\020!\032\004\030\0010\"H¦\004R\022\020\003\032\0020\004X¦\004¢\006\006\032\004\b\005\020\006R\030\020\007\032\0020\b*\0020\t8VX\004¢\006\006\032\004\b\n\020\013\001\001$ø\001\001\002\r\n\005\b¡\0360\001\n\004\b!0\001¨\006%À\006\001"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "getContentAlignment", "()Landroidx/compose/ui/Alignment;", "KeepUntilTransitionsFinished", "Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/animation/ExitTransition$Companion;", "getKeepUntilTransitionsFinished", "(Landroidx/compose/animation/ExitTransition$Companion;)Landroidx/compose/animation/ExitTransition;", "slideIntoContainer", "Landroidx/compose/animation/EnterTransition;", "towards", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "initialOffset", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "offsetForFullSlide", "slideIntoContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "slideOutOfContainer", "targetOffset", "slideOutOfContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "using", "Landroidx/compose/animation/ContentTransform;", "sizeTransform", "Landroidx/compose/animation/SizeTransform;", "SlideDirection", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "animation"})
/*     */ public interface AnimatedContentTransitionScope<S>
/*     */   extends Transition.Segment<S>
/*     */ {
/*     */   @NotNull
/*     */   ContentTransform using(@NotNull ContentTransform paramContentTransform, @Nullable SizeTransform paramSizeTransform);
/*     */   
/*     */   @NotNull
/*     */   EnterTransition slideIntoContainer-mOhB8PU(int paramInt, @NotNull FiniteAnimationSpec<IntOffset> paramFiniteAnimationSpec, @NotNull Function1<? super Integer, Integer> paramFunction1);
/*     */   
/*     */   @JvmInline
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\004\b@\030\000 \0212\0020\001:\001\021B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\006\032\0020\0072\b\020\b\032\004\030\0010\001HÖ\003¢\006\004\b\t\020\nJ\020\020\013\032\0020\003HÖ\001¢\006\004\b\f\020\005J\017\020\r\032\0020\016H\026¢\006\004\b\017\020\020R\016\020\002\032\0020\003X\004¢\006\002\n\000\001\002\001\0020\003¨\006\022"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "animation"})
/*     */   @Immutable
/*     */   public static final class SlideDirection
/*     */   {
/*     */     public static final boolean equals-impl0(int p1, int p2) {
/*     */       return (p1 == p2);
/*     */     }
/*     */     
/*     */     public static int constructor-impl(int value) {
/*     */       return value;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\016\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006R\031\020\n\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\013\020\006R\031\020\f\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\r\020\006R\031\020\016\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\017\020\006R\031\020\020\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\021\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\022"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection$Companion;", "", "()V", "Down", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "getDown-DKzdypw", "()I", "I", "End", "getEnd-DKzdypw", "Left", "getLeft-DKzdypw", "Right", "getRight-DKzdypw", "Start", "getStart-DKzdypw", "Up", "getUp-DKzdypw", "animation"})
/*     */     public static final class Companion
/*     */     {
/*     */       private Companion() {}
/*     */       
/*     */       public final int getLeft-DKzdypw() {
/* 303 */         return AnimatedContentTransitionScope.SlideDirection.Left;
/* 304 */       } public final int getRight-DKzdypw() { return AnimatedContentTransitionScope.SlideDirection.Right; }
/* 305 */       public final int getUp-DKzdypw() { return AnimatedContentTransitionScope.SlideDirection.Up; }
/* 306 */       public final int getDown-DKzdypw() { return AnimatedContentTransitionScope.SlideDirection.Down; }
/* 307 */       public final int getStart-DKzdypw() { return AnimatedContentTransitionScope.SlideDirection.Start; }
/* 308 */       public final int getEnd-DKzdypw() { return AnimatedContentTransitionScope.SlideDirection.End; } } @NotNull public static final Companion Companion = new Companion(null); private final int value; private static final int Left = constructor-impl(0); private static final int Right = constructor-impl(1); private static final int Up = constructor-impl(2); private static final int Down = constructor-impl(3); private static final int Start = constructor-impl(4); private static final int End = constructor-impl(5);
/*     */     public boolean equals(Object other) { return equals-impl(this.value, other); }
/*     */     public static boolean equals-impl(int arg0, Object other) { if (!(other instanceof SlideDirection))
/* 311 */         return false;  int i = ((SlideDirection)other).unbox-impl(); return !(arg0 != i); } @NotNull public String toString() { return toString-impl(this.value); }
/* 312 */     public int hashCode() { return hashCode-impl(this.value); } public static int hashCode-impl(int arg0) { return Integer.hashCode(arg0); } @NotNull public static String toString-impl(int arg0) { int i = arg0; return 
/* 313 */         equals-impl0(i, Left) ? "Left" : (
/* 314 */         equals-impl0(i, Right) ? "Right" : (
/* 315 */         equals-impl0(i, Up) ? "Up" : (
/* 316 */         equals-impl0(i, Down) ? "Down" : (
/* 317 */         equals-impl0(i, Start) ? "Start" : (
/* 318 */         equals-impl0(i, End) ? "End" : 
/* 319 */         "Invalid"))))); }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   ExitTransition slideOutOfContainer-mOhB8PU(int paramInt, @NotNull FiniteAnimationSpec<IntOffset> paramFiniteAnimationSpec, @NotNull Function1<? super Integer, Integer> paramFunction1);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\001H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "S", "it", "invoke", "(I)Ljava/lang/Integer;"})
/*     */   static final class AnimatedContentTransitionScope$slideIntoContainer$1
/*     */     extends Lambda
/*     */     implements Function1<Integer, Integer>
/*     */   {
/*     */     public static final AnimatedContentTransitionScope$slideIntoContainer$1 INSTANCE = new AnimatedContentTransitionScope$slideIntoContainer$1();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimatedContentTransitionScope$slideIntoContainer$1() {
/*     */       super(1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Integer invoke(int it) {
/* 351 */       return Integer.valueOf(it);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\001H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "S", "it", "invoke", "(I)Ljava/lang/Integer;"})
/*     */   static final class AnimatedContentTransitionScope$slideOutOfContainer$1
/*     */     extends Lambda
/*     */     implements Function1<Integer, Integer>
/*     */   {
/*     */     public static final AnimatedContentTransitionScope$slideOutOfContainer$1 INSTANCE = new AnimatedContentTransitionScope$slideOutOfContainer$1();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimatedContentTransitionScope$slideOutOfContainer$1() {
/*     */       super(1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Integer invoke(int it) {
/* 380 */       return Integer.valueOf(it);
/*     */     }
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
/*     */   @NotNull
/*     */   default ExitTransition getKeepUntilTransitionsFinished(@NotNull ExitTransition.Companion $this$KeepUntilTransitionsFinished) {
/* 397 */     Intrinsics.checkNotNullParameter($this$KeepUntilTransitionsFinished, "<this>"); return $this$KeepUntilTransitionsFinished.getKeepUntilTransitionsFinished$animation();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   Alignment getContentAlignment();
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\AnimatedContentTransitionScope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */