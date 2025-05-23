/*      */ package androidx.compose.animation;
/*      */ 
/*      */ import androidx.compose.animation.core.AnimationSpecKt;
/*      */ import androidx.compose.animation.core.AnimationVector2D;
/*      */ import androidx.compose.animation.core.FiniteAnimationSpec;
/*      */ import androidx.compose.animation.core.SpringSpec;
/*      */ import androidx.compose.animation.core.Transition;
/*      */ import androidx.compose.animation.core.TwoWayConverter;
/*      */ import androidx.compose.animation.core.VectorConvertersKt;
/*      */ import androidx.compose.animation.core.VisibilityThresholdsKt;
/*      */ import androidx.compose.runtime.Composable;
/*      */ import androidx.compose.runtime.Composer;
/*      */ import androidx.compose.runtime.ComposerKt;
/*      */ import androidx.compose.runtime.MutableState;
/*      */ import androidx.compose.runtime.SnapshotStateKt;
/*      */ import androidx.compose.runtime.Stable;
/*      */ import androidx.compose.runtime.State;
/*      */ import androidx.compose.ui.Alignment;
/*      */ import androidx.compose.ui.Modifier;
/*      */ import androidx.compose.ui.graphics.GraphicsLayerScope;
/*      */ import androidx.compose.ui.graphics.TransformOrigin;
/*      */ import androidx.compose.ui.graphics.TransformOriginKt;
/*      */ import androidx.compose.ui.unit.IntOffset;
/*      */ import androidx.compose.ui.unit.IntOffsetKt;
/*      */ import androidx.compose.ui.unit.IntSize;
/*      */ import androidx.compose.ui.unit.IntSizeKt;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.TuplesKt;
/*      */ import kotlin.Unit;
/*      */ import kotlin.collections.MapsKt;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Lambda;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.reflect.KProperty;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\001\n\000\n\002\030\002\n\002\020\007\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\020\b\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\036\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\f\032Q\020\013\032\0020\f2\016\b\002\020\r\032\b\022\004\022\0020\0060\0162\b\b\002\020\017\032\0020\0202\b\b\002\020\021\032\0020\0222#\b\002\020\023\032\035\022\023\022\0210\025¢\006\f\b\026\022\b\b\027\022\004\b\b(\030\022\004\022\0020\0250\024H\007\032Q\020\031\032\0020\f2\016\b\002\020\r\032\b\022\004\022\0020\0060\0162\b\b\002\020\017\032\0020\0322\b\b\002\020\021\032\0020\0222#\b\002\020\033\032\035\022\023\022\0210\006¢\006\f\b\026\022\b\b\027\022\004\b\b(\034\022\004\022\0020\0060\024H\007\032Q\020\035\032\0020\f2\016\b\002\020\r\032\b\022\004\022\0020\0060\0162\b\b\002\020\017\032\0020\0362\b\b\002\020\021\032\0020\0222#\b\002\020\037\032\035\022\023\022\0210\025¢\006\f\b\026\022\b\b\027\022\004\b\b( \022\004\022\0020\0250\024H\007\032\"\020!\032\0020\f2\016\b\002\020\r\032\b\022\004\022\0020\0020\0162\b\b\002\020\"\032\0020\002H\007\032\"\020#\032\0020$2\016\b\002\020\r\032\b\022\004\022\0020\0020\0162\b\b\002\020%\032\0020\002H\007\0326\020&\032\0020\f2\016\b\002\020\r\032\b\022\004\022\0020\0020\0162\b\b\002\020'\032\0020\0022\b\b\002\020(\032\0020\tH\007ø\001\000¢\006\004\b)\020*\0326\020+\032\0020$2\016\b\002\020\r\032\b\022\004\022\0020\0020\0162\b\b\002\020,\032\0020\0022\b\b\002\020(\032\0020\tH\007ø\001\000¢\006\004\b-\020.\032Q\020/\032\0020$2\016\b\002\020\r\032\b\022\004\022\0020\0060\0162\b\b\002\0200\032\0020\0202\b\b\002\020\021\032\0020\0222#\b\002\0201\032\035\022\023\022\0210\025¢\006\f\b\026\022\b\b\027\022\004\b\b(\030\022\004\022\0020\0250\024H\007\032Q\0202\032\0020$2\016\b\002\020\r\032\b\022\004\022\0020\0060\0162\b\b\002\0200\032\0020\0322\b\b\002\020\021\032\0020\0222#\b\002\0203\032\035\022\023\022\0210\006¢\006\f\b\026\022\b\b\027\022\004\b\b(\034\022\004\022\0020\0060\024H\007\032Q\0204\032\0020$2\016\b\002\020\r\032\b\022\004\022\0020\0060\0162\b\b\002\0200\032\0020\0362\b\b\002\020\021\032\0020\0222#\b\002\0205\032\035\022\023\022\0210\025¢\006\f\b\026\022\b\b\027\022\004\b\b( \022\004\022\0020\0250\024H\007\032;\0206\032\0020\f2\016\b\002\020\r\032\b\022\004\022\0020\0040\0162!\0207\032\035\022\023\022\0210\006¢\006\f\b\026\022\b\b\027\022\004\b\b(\034\022\004\022\0020\0040\024H\007\032=\0208\032\0020\f2\016\b\002\020\r\032\b\022\004\022\0020\0040\0162#\b\002\0209\032\035\022\023\022\0210\025¢\006\f\b\026\022\b\b\027\022\004\b\b(\030\022\004\022\0020\0250\024H\007\032=\020:\032\0020\f2\016\b\002\020\r\032\b\022\004\022\0020\0040\0162#\b\002\020;\032\035\022\023\022\0210\025¢\006\f\b\026\022\b\b\027\022\004\b\b( \022\004\022\0020\0250\024H\007\032;\020<\032\0020$2\016\b\002\020\r\032\b\022\004\022\0020\0040\0162!\020=\032\035\022\023\022\0210\006¢\006\f\b\026\022\b\b\027\022\004\b\b(\034\022\004\022\0020\0040\024H\007\032=\020>\032\0020$2\016\b\002\020\r\032\b\022\004\022\0020\0040\0162#\b\002\020?\032\035\022\023\022\0210\025¢\006\f\b\026\022\b\b\027\022\004\b\b(\030\022\004\022\0020\0250\024H\007\032=\020@\032\0020$2\016\b\002\020\r\032\b\022\004\022\0020\0040\0162#\b\002\020A\032\035\022\023\022\0210\025¢\006\f\b\026\022\b\b\027\022\004\b\b( \022\004\022\0020\0250\024H\007\032/\020B\032\0020C*\b\022\004\022\0020E0D2\006\020F\032\0020\f2\006\020G\032\0020$2\006\020H\032\0020IH\003¢\006\002\020J\032?\020K\032\0020L*\b\022\004\022\0020E0D2\006\020F\032\0020\f2\006\020G\032\0020$2\016\b\002\020M\032\b\022\004\022\0020\0220N2\006\020H\032\0020IH\001¢\006\002\020O\032,\020P\032\004\030\001HQ\"\b\b\000\020Q*\0020R*\0020\f2\f\020S\032\b\022\004\022\002HQ0TH\002¢\006\002\020U\032,\020P\032\004\030\001HQ\"\b\b\000\020Q*\0020R*\0020$2\f\020S\032\b\022\004\022\002HQ0TH\002¢\006\002\020V\032\f\020W\032\0020\032*\0020\020H\002\032\f\020W\032\0020\032*\0020\036H\002\032\037\020X\032\0020\f*\b\022\004\022\0020E0D2\006\020F\032\0020\fH\001¢\006\002\020Y\032\037\020Z\032\0020$*\b\022\004\022\0020E0D2\006\020G\032\0020$H\001¢\006\002\020[\032\025\020\\\032\0020\f*\0020\f2\006\020]\032\0020RH\004\032\025\020\\\032\0020$*\0020$2\006\020]\032\0020RH\004\"\024\020\000\032\b\022\004\022\0020\0020\001X\004¢\006\002\n\000\"\024\020\003\032\b\022\004\022\0020\0040\001X\004¢\006\002\n\000\"\024\020\005\032\b\022\004\022\0020\0060\001X\004¢\006\002\n\000\"\032\020\007\032\016\022\004\022\0020\t\022\004\022\0020\n0\bX\004¢\006\002\n\000\002\007\n\005\b¡\0360\001¨\006^²\006\n\020_\032\0020\fX\002²\006\n\020`\032\0020$X\002"}, d2 = {"DefaultAlphaAndScaleSpring", "Landroidx/compose/animation/core/SpringSpec;", "", "DefaultOffsetAnimationSpec", "Landroidx/compose/ui/unit/IntOffset;", "DefaultSizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "TransformOriginVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/TransformOrigin;", "Landroidx/compose/animation/core/AnimationVector2D;", "expandHorizontally", "Landroidx/compose/animation/EnterTransition;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "expandFrom", "Landroidx/compose/ui/Alignment$Horizontal;", "clip", "", "initialWidth", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "fullWidth", "expandIn", "Landroidx/compose/ui/Alignment;", "initialSize", "fullSize", "expandVertically", "Landroidx/compose/ui/Alignment$Vertical;", "initialHeight", "fullHeight", "fadeIn", "initialAlpha", "fadeOut", "Landroidx/compose/animation/ExitTransition;", "targetAlpha", "scaleIn", "initialScale", "transformOrigin", "scaleIn-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "scaleOut", "targetScale", "scaleOut-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/ExitTransition;", "shrinkHorizontally", "shrinkTowards", "targetWidth", "shrinkOut", "targetSize", "shrinkVertically", "targetHeight", "slideIn", "initialOffset", "slideInHorizontally", "initialOffsetX", "slideInVertically", "initialOffsetY", "slideOut", "targetOffset", "slideOutHorizontally", "targetOffsetX", "slideOutVertically", "targetOffsetY", "createGraphicsLayerBlock", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", "exit", "label", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "createModifier", "Landroidx/compose/ui/Modifier;", "isEnabled", "Lkotlin/Function0;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "get", "T", "Landroidx/compose/animation/TransitionEffect;", "key", "Landroidx/compose/animation/TransitionEffectKey;", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/TransitionEffectKey;)Landroidx/compose/animation/TransitionEffect;", "(Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/TransitionEffectKey;)Landroidx/compose/animation/TransitionEffect;", "toAlignment", "trackActiveEnter", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterTransition;", "trackActiveExit", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/ExitTransition;", "withEffect", "effect", "animation", "activeEnter", "activeExit"})
/*      */ @SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1272:1\n1225#2,6:1273\n1225#2,6:1279\n1225#2,6:1285\n1225#2,6:1291\n1225#2,6:1297\n1225#2,6:1303\n1225#2,6:1309\n1225#2,6:1315\n1225#2,6:1321\n81#3:1327\n107#3,2:1328\n81#3:1330\n107#3,2:1331\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n*L\n879#1:1273,6\n884#1:1279,6\n890#1:1285,6\n899#1:1291,6\n916#1:1297,6\n936#1:1303,6\n969#1:1309,6\n975#1:1315,6\n986#1:1321,6\n916#1:1327\n916#1:1328,2\n936#1:1330\n936#1:1331,2\n*E\n"})
/*      */ public final class EnterExitTransitionKt
/*      */ {
/*      */   @NotNull
/*      */   public static final EnterTransition withEffect(@NotNull EnterTransition $this$withEffect, @NotNull TransitionEffect effect) {
/*  268 */     Intrinsics.checkNotNullParameter($this$withEffect, "<this>"); Intrinsics.checkNotNullParameter(effect, "effect"); return new EnterTransitionImpl(new TransitionData(null, null, null, null, false, MapsKt.mapOf(TuplesKt.to(effect.getKey$animation(), effect)), 31, null));
/*      */   } @NotNull
/*      */   public static final ExitTransition withEffect(@NotNull ExitTransition $this$withEffect, @NotNull TransitionEffect effect) {
/*  271 */     Intrinsics.checkNotNullParameter($this$withEffect, "<this>"); Intrinsics.checkNotNullParameter(effect, "effect"); return new ExitTransitionImpl(new TransitionData(null, null, null, null, false, MapsKt.mapOf(TuplesKt.to(effect.getKey$animation(), effect)), 31, null));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Stable
/*      */   @NotNull
/*      */   public static final EnterTransition fadeIn(@NotNull FiniteAnimationSpec<Float> animationSpec, float initialAlpha) {
/*  288 */     Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); return new EnterTransitionImpl(new TransitionData(new Fade(initialAlpha, animationSpec), null, null, null, false, null, 62, null));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Stable
/*      */   @NotNull
/*      */   public static final ExitTransition fadeOut(@NotNull FiniteAnimationSpec<Float> animationSpec, float targetAlpha) {
/*  307 */     Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); return new ExitTransitionImpl(new TransitionData(new Fade(targetAlpha, animationSpec), null, null, null, false, null, 62, null));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Stable
/*      */   @NotNull
/*      */   public static final EnterTransition slideIn(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super IntSize, IntOffset> initialOffset) {
/*  338 */     Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); Intrinsics.checkNotNullParameter(initialOffset, "initialOffset"); return new EnterTransitionImpl(new TransitionData(null, new Slide(initialOffset, animationSpec), null, null, false, null, 61, null));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Stable
/*      */   @NotNull
/*      */   public static final ExitTransition slideOut(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super IntSize, IntOffset> targetOffset) {
/*  369 */     Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); Intrinsics.checkNotNullParameter(targetOffset, "targetOffset"); return new ExitTransitionImpl(new TransitionData(null, new Slide(targetOffset, animationSpec), null, null, false, null, 61, null));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Stable
/*      */   @NotNull
/*      */   public static final EnterTransition scaleIn-L8ZKh-E(@NotNull FiniteAnimationSpec animationSpec, float initialScale, long transformOrigin) {
/*  397 */     Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); return new EnterTransitionImpl(
/*  398 */         new TransitionData(null, null, null, new Scale(initialScale, transformOrigin, animationSpec, null), false, null, 55, null));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Stable
/*      */   @NotNull
/*      */   public static final ExitTransition scaleOut-L8ZKh-E(@NotNull FiniteAnimationSpec animationSpec, float targetScale, long transformOrigin) {
/*  427 */     Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); return new ExitTransitionImpl(
/*  428 */         new TransitionData(null, null, null, new Scale(targetScale, transformOrigin, animationSpec, null), false, null, 55, null));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"})
/*      */   static final class EnterExitTransitionKt$expandIn$1
/*      */     extends Lambda
/*      */     implements Function1<IntSize, IntSize>
/*      */   {
/*      */     public static final EnterExitTransitionKt$expandIn$1 INSTANCE = new EnterExitTransitionKt$expandIn$1();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     EnterExitTransitionKt$expandIn$1() {
/*      */       super(1);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public final long invoke-mzRDjE0(long it)
/*      */     {
/*  467 */       return IntSizeKt.IntSize(0, 0); } } @Stable
/*      */   @NotNull
/*  469 */   public static final EnterTransition expandIn(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment expandFrom, boolean clip, @NotNull Function1<? super IntSize, IntSize> initialSize) { Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); Intrinsics.checkNotNullParameter(expandFrom, "expandFrom"); Intrinsics.checkNotNullParameter(initialSize, "initialSize"); return new EnterTransitionImpl(
/*  470 */         new TransitionData(null, null, 
/*  471 */           new ChangeSize(expandFrom, initialSize, animationSpec, clip), null, false, null, 59, null)); }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"})
/*      */   static final class EnterExitTransitionKt$shrinkOut$1
/*      */     extends Lambda
/*      */     implements Function1<IntSize, IntSize>
/*      */   {
/*      */     public static final EnterExitTransitionKt$shrinkOut$1 INSTANCE = new EnterExitTransitionKt$shrinkOut$1();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     EnterExitTransitionKt$shrinkOut$1() {
/*      */       super(1);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public final long invoke-mzRDjE0(long it)
/*      */     {
/*  510 */       return IntSizeKt.IntSize(0, 0); } } @Stable
/*      */   @NotNull
/*  512 */   public static final ExitTransition shrinkOut(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment shrinkTowards, boolean clip, @NotNull Function1<? super IntSize, IntSize> targetSize) { Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards"); Intrinsics.checkNotNullParameter(targetSize, "targetSize"); return new ExitTransitionImpl(
/*  513 */         new TransitionData(null, null, 
/*  514 */           new ChangeSize(shrinkTowards, targetSize, animationSpec, clip), null, false, null, 59, null)); }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"})
/*      */   static final class EnterExitTransitionKt$expandHorizontally$1
/*      */     extends Lambda
/*      */     implements Function1<Integer, Integer>
/*      */   {
/*      */     public static final EnterExitTransitionKt$expandHorizontally$1 INSTANCE = new EnterExitTransitionKt$expandHorizontally$1();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     EnterExitTransitionKt$expandHorizontally$1() {
/*      */       super(1);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @NotNull
/*      */     public final Integer invoke(int it)
/*      */     {
/*  551 */       return Integer.valueOf(0); } } @Stable
/*      */   @NotNull
/*  553 */   public static final EnterTransition expandHorizontally(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Horizontal expandFrom, boolean clip, @NotNull Function1<? super Integer, Integer> initialWidth) { Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); Intrinsics.checkNotNullParameter(expandFrom, "expandFrom"); Intrinsics.checkNotNullParameter(initialWidth, "initialWidth"); return expandIn(animationSpec, toAlignment(expandFrom), clip, new EnterExitTransitionKt$expandHorizontally$2(initialWidth)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"})
/*  554 */   static final class EnterExitTransitionKt$expandHorizontally$2 extends Lambda implements Function1<IntSize, IntSize> { public final long invoke-mzRDjE0(long it) { return IntSizeKt.IntSize(((Number)this.$initialWidth.invoke(Integer.valueOf(IntSize.getWidth-impl(it)))).intValue(), IntSize.getHeight-impl(it)); }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     EnterExitTransitionKt$expandHorizontally$2(Function1<Integer, Integer> $initialWidth) {
/*      */       super(1);
/*      */     } }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"})
/*      */   static final class EnterExitTransitionKt$expandVertically$1
/*      */     extends Lambda
/*      */     implements Function1<Integer, Integer>
/*      */   {
/*      */     public static final EnterExitTransitionKt$expandVertically$1 INSTANCE = new EnterExitTransitionKt$expandVertically$1();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     EnterExitTransitionKt$expandVertically$1() {
/*      */       super(1);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @NotNull
/*      */     public final Integer invoke(int it)
/*      */     {
/*  590 */       return Integer.valueOf(0); } } @Stable
/*      */   @NotNull
/*  592 */   public static final EnterTransition expandVertically(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Vertical expandFrom, boolean clip, @NotNull Function1<? super Integer, Integer> initialHeight) { Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); Intrinsics.checkNotNullParameter(expandFrom, "expandFrom"); Intrinsics.checkNotNullParameter(initialHeight, "initialHeight"); return expandIn(animationSpec, toAlignment(expandFrom), clip, new EnterExitTransitionKt$expandVertically$2(initialHeight)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"})
/*  593 */   static final class EnterExitTransitionKt$expandVertically$2 extends Lambda implements Function1<IntSize, IntSize> { public final long invoke-mzRDjE0(long it) { return IntSizeKt.IntSize(IntSize.getWidth-impl(it), ((Number)this.$initialHeight.invoke(Integer.valueOf(IntSize.getHeight-impl(it)))).intValue()); }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     EnterExitTransitionKt$expandVertically$2(Function1<Integer, Integer> $initialHeight) {
/*      */       super(1);
/*      */     } }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"})
/*      */   static final class EnterExitTransitionKt$shrinkHorizontally$1
/*      */     extends Lambda
/*      */     implements Function1<Integer, Integer>
/*      */   {
/*      */     public static final EnterExitTransitionKt$shrinkHorizontally$1 INSTANCE = new EnterExitTransitionKt$shrinkHorizontally$1();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     EnterExitTransitionKt$shrinkHorizontally$1() {
/*      */       super(1);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @NotNull
/*      */     public final Integer invoke(int it) {
/*  629 */       return Integer.valueOf(0);
/*      */     } } @Stable
/*      */   @NotNull
/*  632 */   public static final ExitTransition shrinkHorizontally(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Horizontal shrinkTowards, boolean clip, @NotNull Function1<? super Integer, Integer> targetWidth) { Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards"); Intrinsics.checkNotNullParameter(targetWidth, "targetWidth"); return shrinkOut(animationSpec, toAlignment(shrinkTowards), clip, new EnterExitTransitionKt$shrinkHorizontally$2(targetWidth)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"})
/*  633 */   static final class EnterExitTransitionKt$shrinkHorizontally$2 extends Lambda implements Function1<IntSize, IntSize> { public final long invoke-mzRDjE0(long it) { return IntSizeKt.IntSize(((Number)this.$targetWidth.invoke(Integer.valueOf(IntSize.getWidth-impl(it)))).intValue(), IntSize.getHeight-impl(it)); }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     EnterExitTransitionKt$shrinkHorizontally$2(Function1<Integer, Integer> $targetWidth) {
/*      */       super(1);
/*      */     } }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"})
/*      */   static final class EnterExitTransitionKt$shrinkVertically$1
/*      */     extends Lambda
/*      */     implements Function1<Integer, Integer>
/*      */   {
/*      */     public static final EnterExitTransitionKt$shrinkVertically$1 INSTANCE = new EnterExitTransitionKt$shrinkVertically$1();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     EnterExitTransitionKt$shrinkVertically$1() {
/*      */       super(1);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @NotNull
/*      */     public final Integer invoke(int it) {
/*  669 */       return Integer.valueOf(0);
/*      */     } } @Stable
/*      */   @NotNull
/*  672 */   public static final ExitTransition shrinkVertically(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Vertical shrinkTowards, boolean clip, @NotNull Function1<? super Integer, Integer> targetHeight) { Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards"); Intrinsics.checkNotNullParameter(targetHeight, "targetHeight"); return shrinkOut(animationSpec, toAlignment(shrinkTowards), clip, new EnterExitTransitionKt$shrinkVertically$2(targetHeight)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"})
/*  673 */   static final class EnterExitTransitionKt$shrinkVertically$2 extends Lambda implements Function1<IntSize, IntSize> { public final long invoke-mzRDjE0(long it) { return IntSizeKt.IntSize(IntSize.getWidth-impl(it), ((Number)this.$targetHeight.invoke(Integer.valueOf(IntSize.getHeight-impl(it)))).intValue()); }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     EnterExitTransitionKt$shrinkVertically$2(Function1<Integer, Integer> $targetHeight) {
/*      */       super(1);
/*      */     } }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"})
/*      */   static final class EnterExitTransitionKt$slideInHorizontally$1
/*      */     extends Lambda
/*      */     implements Function1<Integer, Integer>
/*      */   {
/*      */     public static final EnterExitTransitionKt$slideInHorizontally$1 INSTANCE = new EnterExitTransitionKt$slideInHorizontally$1();
/*      */ 
/*      */ 
/*      */     
/*      */     EnterExitTransitionKt$slideInHorizontally$1() {
/*      */       super(1);
/*      */     }
/*      */ 
/*      */     
/*      */     @NotNull
/*      */     public final Integer invoke(int it) {
/*  701 */       return Integer.valueOf(-it / 2);
/*      */     } }
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/ui/unit/IntSize;", "invoke-mHKZG7I", "(J)J"})
/*  704 */   static final class EnterExitTransitionKt$slideInHorizontally$2 extends Lambda implements Function1<IntSize, IntOffset> { public final long invoke-mHKZG7I(long it) { return IntOffsetKt.IntOffset(((Number)this.$initialOffsetX.invoke(Integer.valueOf(IntSize.getWidth-impl(it)))).intValue(), 0); } EnterExitTransitionKt$slideInHorizontally$2(Function1<Integer, Integer> $initialOffsetX) { super(1); } }
/*  705 */   @Stable @NotNull public static final EnterTransition slideInHorizontally(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super Integer, Integer> initialOffsetX) { Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); Intrinsics.checkNotNullParameter(initialOffsetX, "initialOffsetX"); return slideIn(animationSpec, new EnterExitTransitionKt$slideInHorizontally$2(initialOffsetX)); }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"})
/*      */   static final class EnterExitTransitionKt$slideInVertically$1
/*      */     extends Lambda
/*      */     implements Function1<Integer, Integer>
/*      */   {
/*      */     public static final EnterExitTransitionKt$slideInVertically$1 INSTANCE = new EnterExitTransitionKt$slideInVertically$1();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     EnterExitTransitionKt$slideInVertically$1() {
/*      */       super(1);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @NotNull
/*      */     public final Integer invoke(int it) {
/*  732 */       return Integer.valueOf(-it / 2);
/*      */     } }
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/ui/unit/IntSize;", "invoke-mHKZG7I", "(J)J"})
/*  735 */   static final class EnterExitTransitionKt$slideInVertically$2 extends Lambda implements Function1<IntSize, IntOffset> { public final long invoke-mHKZG7I(long it) { return IntOffsetKt.IntOffset(0, ((Number)this.$initialOffsetY.invoke(Integer.valueOf(IntSize.getHeight-impl(it)))).intValue()); } EnterExitTransitionKt$slideInVertically$2(Function1<Integer, Integer> $initialOffsetY) { super(1); } }
/*  736 */   @Stable @NotNull public static final EnterTransition slideInVertically(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super Integer, Integer> initialOffsetY) { Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); Intrinsics.checkNotNullParameter(initialOffsetY, "initialOffsetY"); return slideIn(animationSpec, new EnterExitTransitionKt$slideInVertically$2(initialOffsetY)); }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"})
/*      */   static final class EnterExitTransitionKt$slideOutHorizontally$1
/*      */     extends Lambda
/*      */     implements Function1<Integer, Integer>
/*      */   {
/*      */     public static final EnterExitTransitionKt$slideOutHorizontally$1 INSTANCE = new EnterExitTransitionKt$slideOutHorizontally$1();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     EnterExitTransitionKt$slideOutHorizontally$1() {
/*      */       super(1);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @NotNull
/*      */     public final Integer invoke(int it) {
/*  763 */       return Integer.valueOf(-it / 2);
/*      */     } }
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/ui/unit/IntSize;", "invoke-mHKZG7I", "(J)J"})
/*  766 */   static final class EnterExitTransitionKt$slideOutHorizontally$2 extends Lambda implements Function1<IntSize, IntOffset> { public final long invoke-mHKZG7I(long it) { return IntOffsetKt.IntOffset(((Number)this.$targetOffsetX.invoke(Integer.valueOf(IntSize.getWidth-impl(it)))).intValue(), 0); } EnterExitTransitionKt$slideOutHorizontally$2(Function1<Integer, Integer> $targetOffsetX) { super(1); } }
/*  767 */   @Stable @NotNull public static final ExitTransition slideOutHorizontally(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super Integer, Integer> targetOffsetX) { Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); Intrinsics.checkNotNullParameter(targetOffsetX, "targetOffsetX"); return slideOut(animationSpec, new EnterExitTransitionKt$slideOutHorizontally$2(targetOffsetX)); }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"})
/*      */   static final class EnterExitTransitionKt$slideOutVertically$1
/*      */     extends Lambda
/*      */     implements Function1<Integer, Integer>
/*      */   {
/*      */     public static final EnterExitTransitionKt$slideOutVertically$1 INSTANCE = new EnterExitTransitionKt$slideOutVertically$1();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     EnterExitTransitionKt$slideOutVertically$1() {
/*      */       super(1);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @NotNull
/*      */     public final Integer invoke(int it) {
/*  792 */       return Integer.valueOf(-it / 2);
/*      */     } }
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/ui/unit/IntSize;", "invoke-mHKZG7I", "(J)J"})
/*  795 */   static final class EnterExitTransitionKt$slideOutVertically$2 extends Lambda implements Function1<IntSize, IntOffset> { public final long invoke-mHKZG7I(long it) { return IntOffsetKt.IntOffset(0, ((Number)this.$targetOffsetY.invoke(Integer.valueOf(IntSize.getHeight-impl(it)))).intValue()); } EnterExitTransitionKt$slideOutVertically$2(Function1<Integer, Integer> $targetOffsetY) { super(1); } }
/*  796 */   @Stable @NotNull public static final ExitTransition slideOutVertically(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super Integer, Integer> targetOffsetY) { Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); Intrinsics.checkNotNullParameter(targetOffsetY, "targetOffsetY"); return slideOut(animationSpec, new EnterExitTransitionKt$slideOutVertically$2(targetOffsetY)); }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final Alignment toAlignment(Alignment.Horizontal $this$toAlignment) {
/*  831 */     Alignment.Horizontal horizontal = $this$toAlignment;
/*  832 */     return Intrinsics.areEqual(horizontal, Alignment.Companion.getStart()) ? Alignment.Companion.getCenterStart() : (
/*  833 */       Intrinsics.areEqual(horizontal, Alignment.Companion.getEnd()) ? Alignment.Companion.getCenterEnd() : 
/*  834 */       Alignment.Companion.getCenter());
/*      */   }
/*      */   
/*      */   private static final Alignment toAlignment(Alignment.Vertical $this$toAlignment) {
/*  838 */     Alignment.Vertical vertical = $this$toAlignment;
/*  839 */     return Intrinsics.areEqual(vertical, Alignment.Companion.getTop()) ? Alignment.Companion.getTopCenter() : (
/*  840 */       Intrinsics.areEqual(vertical, Alignment.Companion.getBottom()) ? Alignment.Companion.getBottomCenter() : 
/*  841 */       Alignment.Companion.getCenter());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public static final <T extends TransitionEffect> T get(@NotNull EnterTransition $this$get, @NotNull TransitionEffectKey key) {
/*  856 */     Intrinsics.checkNotNullParameter($this$get, "<this>"); Intrinsics.checkNotNullParameter(key, "key"); TransitionEffect transitionEffect = (TransitionEffect)$this$get.getData$animation().getEffectsMap().get(key); return (transitionEffect instanceof TransitionEffect) ? (T)transitionEffect : null;
/*      */   }
/*      */   @Nullable
/*      */   public static final <T extends TransitionEffect> T get(@NotNull ExitTransition $this$get, @NotNull TransitionEffectKey key) {
/*  860 */     Intrinsics.checkNotNullParameter($this$get, "<this>"); Intrinsics.checkNotNullParameter(key, "key"); TransitionEffect transitionEffect = (TransitionEffect)$this$get.getData$animation().getEffectsMap().get(key); return (transitionEffect instanceof TransitionEffect) ? (T)transitionEffect : null;
/*      */   } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*      */   static final class EnterExitTransitionKt$createModifier$1 extends Lambda implements Function0<Boolean> { public static final EnterExitTransitionKt$createModifier$1 INSTANCE = new EnterExitTransitionKt$createModifier$1();
/*      */     EnterExitTransitionKt$createModifier$1() {
/*      */       super(0);
/*      */     }
/*      */     @NotNull
/*      */     public final Boolean invoke() {
/*  868 */       return Boolean.valueOf(true);
/*      */     } }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Composable
/*      */   @NotNull
/*      */   public static final Modifier createModifier(@NotNull Transition $this$createModifier, @NotNull EnterTransition enter, @NotNull ExitTransition exit, @Nullable Function0 isEnabled, @NotNull String label, @Nullable Composer $composer, int $changed, int paramInt1) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc '<this>'
/*      */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   6: aload_1
/*      */     //   7: ldc_w 'enter'
/*      */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   13: aload_2
/*      */     //   14: ldc_w 'exit'
/*      */     //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   20: aload #4
/*      */     //   22: ldc_w 'label'
/*      */     //   25: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   28: aload #5
/*      */     //   30: ldc_w 28261782
/*      */     //   33: ldc_w 'C(createModifier)870@38224L31,871@38277L28,896@39249L56,898@39349L58:EnterExitTransition.kt#xbi5r1'
/*      */     //   36: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   39: iload #7
/*      */     //   41: iconst_4
/*      */     //   42: iand
/*      */     //   43: ifeq -> 53
/*      */     //   46: getstatic androidx/compose/animation/EnterExitTransitionKt$createModifier$1.INSTANCE : Landroidx/compose/animation/EnterExitTransitionKt$createModifier$1;
/*      */     //   49: checkcast kotlin/jvm/functions/Function0
/*      */     //   52: astore_3
/*      */     //   53: invokestatic isTraceInProgress : ()Z
/*      */     //   56: ifeq -> 71
/*      */     //   59: ldc_w 28261782
/*      */     //   62: iload #6
/*      */     //   64: iconst_m1
/*      */     //   65: ldc_w 'androidx.compose.animation.createModifier (EnterExitTransition.kt:869)'
/*      */     //   68: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   71: aload_0
/*      */     //   72: aload_1
/*      */     //   73: aload #5
/*      */     //   75: bipush #14
/*      */     //   77: iload #6
/*      */     //   79: iand
/*      */     //   80: bipush #112
/*      */     //   82: iload #6
/*      */     //   84: iand
/*      */     //   85: ior
/*      */     //   86: invokestatic trackActiveEnter : (Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterTransition;
/*      */     //   89: astore #8
/*      */     //   91: aload_0
/*      */     //   92: aload_2
/*      */     //   93: aload #5
/*      */     //   95: bipush #14
/*      */     //   97: iload #6
/*      */     //   99: iand
/*      */     //   100: bipush #112
/*      */     //   102: iload #6
/*      */     //   104: iconst_3
/*      */     //   105: ishr
/*      */     //   106: iand
/*      */     //   107: ior
/*      */     //   108: invokestatic trackActiveExit : (Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/ExitTransition;
/*      */     //   111: astore #9
/*      */     //   113: aload #8
/*      */     //   115: invokevirtual getData$animation : ()Landroidx/compose/animation/TransitionData;
/*      */     //   118: invokevirtual getSlide : ()Landroidx/compose/animation/Slide;
/*      */     //   121: ifnonnull -> 135
/*      */     //   124: aload #9
/*      */     //   126: invokevirtual getData$animation : ()Landroidx/compose/animation/TransitionData;
/*      */     //   129: invokevirtual getSlide : ()Landroidx/compose/animation/Slide;
/*      */     //   132: ifnull -> 139
/*      */     //   135: iconst_1
/*      */     //   136: goto -> 140
/*      */     //   139: iconst_0
/*      */     //   140: istore #10
/*      */     //   142: aload #8
/*      */     //   144: invokevirtual getData$animation : ()Landroidx/compose/animation/TransitionData;
/*      */     //   147: invokevirtual getChangeSize : ()Landroidx/compose/animation/ChangeSize;
/*      */     //   150: ifnonnull -> 164
/*      */     //   153: aload #9
/*      */     //   155: invokevirtual getData$animation : ()Landroidx/compose/animation/TransitionData;
/*      */     //   158: invokevirtual getChangeSize : ()Landroidx/compose/animation/ChangeSize;
/*      */     //   161: ifnull -> 168
/*      */     //   164: iconst_1
/*      */     //   165: goto -> 169
/*      */     //   168: iconst_0
/*      */     //   169: istore #11
/*      */     //   171: aload #5
/*      */     //   173: ldc_w -165044049
/*      */     //   176: invokeinterface startReplaceGroup : (I)V
/*      */     //   181: aload #5
/*      */     //   183: ldc_w '878@38627L27,878@38576L79'
/*      */     //   186: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*      */     //   189: iload #10
/*      */     //   191: ifeq -> 332
/*      */     //   194: aload_0
/*      */     //   195: getstatic androidx/compose/ui/unit/IntOffset.Companion : Landroidx/compose/ui/unit/IntOffset$Companion;
/*      */     //   198: invokestatic getVectorConverter : (Landroidx/compose/ui/unit/IntOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;
/*      */     //   201: aload #5
/*      */     //   203: ldc_w -165041447
/*      */     //   206: ldc_w 'CC(remember):EnterExitTransition.kt#9igjgp'
/*      */     //   209: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   212: aload #5
/*      */     //   214: astore #15
/*      */     //   216: iconst_0
/*      */     //   217: istore #16
/*      */     //   219: iconst_0
/*      */     //   220: istore #17
/*      */     //   222: aload #15
/*      */     //   224: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   229: astore #18
/*      */     //   231: iconst_0
/*      */     //   232: istore #19
/*      */     //   234: aload #18
/*      */     //   236: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   239: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   242: if_acmpne -> 297
/*      */     //   245: astore #27
/*      */     //   247: astore #26
/*      */     //   249: iconst_0
/*      */     //   250: istore #20
/*      */     //   252: new java/lang/StringBuilder
/*      */     //   255: dup
/*      */     //   256: invokespecial <init> : ()V
/*      */     //   259: aload #4
/*      */     //   261: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   264: ldc_w ' slide'
/*      */     //   267: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   270: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   273: astore #28
/*      */     //   275: aload #26
/*      */     //   277: aload #27
/*      */     //   279: aload #28
/*      */     //   281: astore #21
/*      */     //   283: aload #15
/*      */     //   285: aload #21
/*      */     //   287: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   292: aload #21
/*      */     //   294: goto -> 299
/*      */     //   297: aload #18
/*      */     //   299: nop
/*      */     //   300: nop
/*      */     //   301: nop
/*      */     //   302: checkcast java/lang/String
/*      */     //   305: astore #14
/*      */     //   307: aload #5
/*      */     //   309: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   312: aload #14
/*      */     //   314: aload #5
/*      */     //   316: sipush #384
/*      */     //   319: bipush #14
/*      */     //   321: iload #6
/*      */     //   323: iand
/*      */     //   324: ior
/*      */     //   325: iconst_0
/*      */     //   326: invokestatic createDeferredAnimation : (Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*      */     //   329: goto -> 333
/*      */     //   332: aconst_null
/*      */     //   333: astore #13
/*      */     //   335: aload #5
/*      */     //   337: invokeinterface endReplaceGroup : ()V
/*      */     //   342: aload #13
/*      */     //   344: astore #12
/*      */     //   346: aload #5
/*      */     //   348: ldc_w -165038614
/*      */     //   351: invokeinterface startReplaceGroup : (I)V
/*      */     //   356: aload #5
/*      */     //   358: ldc_w '883@38800L35,883@38751L85'
/*      */     //   361: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*      */     //   364: iload #11
/*      */     //   366: ifeq -> 507
/*      */     //   369: aload_0
/*      */     //   370: getstatic androidx/compose/ui/unit/IntSize.Companion : Landroidx/compose/ui/unit/IntSize$Companion;
/*      */     //   373: invokestatic getVectorConverter : (Landroidx/compose/ui/unit/IntSize$Companion;)Landroidx/compose/animation/core/TwoWayConverter;
/*      */     //   376: aload #5
/*      */     //   378: ldc_w -165035903
/*      */     //   381: ldc_w 'CC(remember):EnterExitTransition.kt#9igjgp'
/*      */     //   384: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   387: aload #5
/*      */     //   389: astore #16
/*      */     //   391: iconst_0
/*      */     //   392: istore #17
/*      */     //   394: iconst_0
/*      */     //   395: istore #18
/*      */     //   397: aload #16
/*      */     //   399: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   404: astore #19
/*      */     //   406: iconst_0
/*      */     //   407: istore #20
/*      */     //   409: aload #19
/*      */     //   411: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   414: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   417: if_acmpne -> 472
/*      */     //   420: astore #27
/*      */     //   422: astore #26
/*      */     //   424: iconst_0
/*      */     //   425: istore #21
/*      */     //   427: new java/lang/StringBuilder
/*      */     //   430: dup
/*      */     //   431: invokespecial <init> : ()V
/*      */     //   434: aload #4
/*      */     //   436: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   439: ldc_w ' shrink/expand'
/*      */     //   442: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   445: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   448: astore #28
/*      */     //   450: aload #26
/*      */     //   452: aload #27
/*      */     //   454: aload #28
/*      */     //   456: astore #22
/*      */     //   458: aload #16
/*      */     //   460: aload #22
/*      */     //   462: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   467: aload #22
/*      */     //   469: goto -> 474
/*      */     //   472: aload #19
/*      */     //   474: nop
/*      */     //   475: nop
/*      */     //   476: nop
/*      */     //   477: checkcast java/lang/String
/*      */     //   480: astore #15
/*      */     //   482: aload #5
/*      */     //   484: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   487: aload #15
/*      */     //   489: aload #5
/*      */     //   491: sipush #384
/*      */     //   494: bipush #14
/*      */     //   496: iload #6
/*      */     //   498: iand
/*      */     //   499: ior
/*      */     //   500: iconst_0
/*      */     //   501: invokestatic createDeferredAnimation : (Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*      */     //   504: goto -> 508
/*      */     //   507: aconst_null
/*      */     //   508: astore #14
/*      */     //   510: aload #5
/*      */     //   512: invokeinterface endReplaceGroup : ()V
/*      */     //   517: aload #14
/*      */     //   519: astore #13
/*      */     //   521: aload #5
/*      */     //   523: ldc_w -165033189
/*      */     //   526: invokeinterface startReplaceGroup : (I)V
/*      */     //   531: aload #5
/*      */     //   533: ldc_w '889@38995L48,887@38919L134'
/*      */     //   536: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*      */     //   539: iload #11
/*      */     //   541: ifeq -> 682
/*      */     //   544: aload_0
/*      */     //   545: getstatic androidx/compose/ui/unit/IntOffset.Companion : Landroidx/compose/ui/unit/IntOffset$Companion;
/*      */     //   548: invokestatic getVectorConverter : (Landroidx/compose/ui/unit/IntOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;
/*      */     //   551: aload #5
/*      */     //   553: ldc_w -165029650
/*      */     //   556: ldc_w 'CC(remember):EnterExitTransition.kt#9igjgp'
/*      */     //   559: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   562: aload #5
/*      */     //   564: astore #17
/*      */     //   566: iconst_0
/*      */     //   567: istore #18
/*      */     //   569: iconst_0
/*      */     //   570: istore #19
/*      */     //   572: aload #17
/*      */     //   574: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   579: astore #20
/*      */     //   581: iconst_0
/*      */     //   582: istore #21
/*      */     //   584: aload #20
/*      */     //   586: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   589: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   592: if_acmpne -> 647
/*      */     //   595: astore #27
/*      */     //   597: astore #26
/*      */     //   599: iconst_0
/*      */     //   600: istore #22
/*      */     //   602: new java/lang/StringBuilder
/*      */     //   605: dup
/*      */     //   606: invokespecial <init> : ()V
/*      */     //   609: aload #4
/*      */     //   611: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   614: ldc_w ' InterruptionHandlingOffset'
/*      */     //   617: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   620: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   623: astore #28
/*      */     //   625: aload #26
/*      */     //   627: aload #27
/*      */     //   629: aload #28
/*      */     //   631: astore #23
/*      */     //   633: aload #17
/*      */     //   635: aload #23
/*      */     //   637: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   642: aload #23
/*      */     //   644: goto -> 649
/*      */     //   647: aload #20
/*      */     //   649: nop
/*      */     //   650: nop
/*      */     //   651: nop
/*      */     //   652: checkcast java/lang/String
/*      */     //   655: astore #16
/*      */     //   657: aload #5
/*      */     //   659: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   662: aload #16
/*      */     //   664: aload #5
/*      */     //   666: sipush #384
/*      */     //   669: bipush #14
/*      */     //   671: iload #6
/*      */     //   673: iand
/*      */     //   674: ior
/*      */     //   675: iconst_0
/*      */     //   676: invokestatic createDeferredAnimation : (Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*      */     //   679: goto -> 683
/*      */     //   682: aconst_null
/*      */     //   683: astore #15
/*      */     //   685: aload #5
/*      */     //   687: invokeinterface endReplaceGroup : ()V
/*      */     //   692: aload #15
/*      */     //   694: astore #14
/*      */     //   696: aload #8
/*      */     //   698: invokevirtual getData$animation : ()Landroidx/compose/animation/TransitionData;
/*      */     //   701: invokevirtual getChangeSize : ()Landroidx/compose/animation/ChangeSize;
/*      */     //   704: dup
/*      */     //   705: ifnull -> 722
/*      */     //   708: invokevirtual getClip : ()Z
/*      */     //   711: ifne -> 718
/*      */     //   714: iconst_1
/*      */     //   715: goto -> 724
/*      */     //   718: iconst_0
/*      */     //   719: goto -> 724
/*      */     //   722: pop
/*      */     //   723: iconst_0
/*      */     //   724: ifne -> 763
/*      */     //   727: aload #9
/*      */     //   729: invokevirtual getData$animation : ()Landroidx/compose/animation/TransitionData;
/*      */     //   732: invokevirtual getChangeSize : ()Landroidx/compose/animation/ChangeSize;
/*      */     //   735: dup
/*      */     //   736: ifnull -> 753
/*      */     //   739: invokevirtual getClip : ()Z
/*      */     //   742: ifne -> 749
/*      */     //   745: iconst_1
/*      */     //   746: goto -> 755
/*      */     //   749: iconst_0
/*      */     //   750: goto -> 755
/*      */     //   753: pop
/*      */     //   754: iconst_0
/*      */     //   755: ifne -> 763
/*      */     //   758: iload #11
/*      */     //   760: ifne -> 767
/*      */     //   763: iconst_1
/*      */     //   764: goto -> 768
/*      */     //   767: iconst_0
/*      */     //   768: istore #15
/*      */     //   770: aload_0
/*      */     //   771: aload #8
/*      */     //   773: aload #9
/*      */     //   775: aload #4
/*      */     //   777: aload #5
/*      */     //   779: bipush #14
/*      */     //   781: iload #6
/*      */     //   783: iand
/*      */     //   784: sipush #7168
/*      */     //   787: iload #6
/*      */     //   789: iconst_3
/*      */     //   790: ishr
/*      */     //   791: iand
/*      */     //   792: ior
/*      */     //   793: invokestatic createGraphicsLayerBlock : (Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;
/*      */     //   796: astore #16
/*      */     //   798: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   801: checkcast androidx/compose/ui/Modifier
/*      */     //   804: aload #5
/*      */     //   806: ldc_w -165018312
/*      */     //   809: ldc_w 'CC(remember):EnterExitTransition.kt#9igjgp'
/*      */     //   812: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   815: aload #5
/*      */     //   817: astore #19
/*      */     //   819: aload #5
/*      */     //   821: iload #15
/*      */     //   823: invokeinterface changed : (Z)Z
/*      */     //   828: iload #6
/*      */     //   830: sipush #7168
/*      */     //   833: iand
/*      */     //   834: sipush #3072
/*      */     //   837: ixor
/*      */     //   838: sipush #2048
/*      */     //   841: if_icmple -> 855
/*      */     //   844: aload #5
/*      */     //   846: aload_3
/*      */     //   847: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   852: ifne -> 867
/*      */     //   855: iload #6
/*      */     //   857: sipush #3072
/*      */     //   860: iand
/*      */     //   861: sipush #2048
/*      */     //   864: if_icmpne -> 871
/*      */     //   867: iconst_1
/*      */     //   868: goto -> 872
/*      */     //   871: iconst_0
/*      */     //   872: ior
/*      */     //   873: istore #20
/*      */     //   875: iconst_0
/*      */     //   876: istore #21
/*      */     //   878: aload #19
/*      */     //   880: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   885: astore #22
/*      */     //   887: iconst_0
/*      */     //   888: istore #23
/*      */     //   890: iload #20
/*      */     //   892: ifne -> 906
/*      */     //   895: aload #22
/*      */     //   897: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   900: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   903: if_acmpne -> 943
/*      */     //   906: astore #26
/*      */     //   908: iconst_0
/*      */     //   909: istore #24
/*      */     //   911: new androidx/compose/animation/EnterExitTransitionKt$createModifier$2$1
/*      */     //   914: dup
/*      */     //   915: iload #15
/*      */     //   917: aload_3
/*      */     //   918: invokespecial <init> : (ZLkotlin/jvm/functions/Function0;)V
/*      */     //   921: checkcast kotlin/jvm/functions/Function1
/*      */     //   924: aload #26
/*      */     //   926: swap
/*      */     //   927: astore #25
/*      */     //   929: aload #19
/*      */     //   931: aload #25
/*      */     //   933: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   938: aload #25
/*      */     //   940: goto -> 945
/*      */     //   943: aload #22
/*      */     //   945: nop
/*      */     //   946: nop
/*      */     //   947: nop
/*      */     //   948: checkcast kotlin/jvm/functions/Function1
/*      */     //   951: astore #18
/*      */     //   953: aload #5
/*      */     //   955: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   958: aload #18
/*      */     //   960: invokestatic graphicsLayer : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*      */     //   963: new androidx/compose/animation/EnterExitTransitionElement
/*      */     //   966: dup
/*      */     //   967: aload_0
/*      */     //   968: aload #13
/*      */     //   970: aload #14
/*      */     //   972: aload #12
/*      */     //   974: aload #8
/*      */     //   976: aload #9
/*      */     //   978: aload_3
/*      */     //   979: aload #16
/*      */     //   981: invokespecial <init> : (Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V
/*      */     //   984: checkcast androidx/compose/ui/Modifier
/*      */     //   987: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   992: astore #17
/*      */     //   994: invokestatic isTraceInProgress : ()Z
/*      */     //   997: ifeq -> 1003
/*      */     //   1000: invokestatic traceEventEnd : ()V
/*      */     //   1003: aload #5
/*      */     //   1005: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1008: aload #17
/*      */     //   1010: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #870	-> 36
/*      */     //   #868	-> 46
/*      */     //   #870	-> 68
/*      */     //   #871	-> 71
/*      */     //   #872	-> 91
/*      */     //   #874	-> 113
/*      */     //   #876	-> 142
/*      */     //   #875	-> 169
/*      */     //   #878	-> 189
/*      */     //   #879	-> 194
/*      */     //   #1273	-> 222
/*      */     //   #1274	-> 234
/*      */     //   #1275	-> 245
/*      */     //   #879	-> 252
/*      */     //   #1275	-> 281
/*      */     //   #1276	-> 283
/*      */     //   #1277	-> 292
/*      */     //   #1278	-> 297
/*      */     //   #1274	-> 299
/*      */     //   #1273	-> 300
/*      */     //   #1273	-> 301
/*      */     //   #879	-> 302
/*      */     //   #881	-> 332
/*      */     //   #878	-> 333
/*      */     //   #883	-> 364
/*      */     //   #884	-> 369
/*      */     //   #1279	-> 397
/*      */     //   #1280	-> 409
/*      */     //   #1281	-> 420
/*      */     //   #884	-> 427
/*      */     //   #1281	-> 456
/*      */     //   #1282	-> 458
/*      */     //   #1283	-> 467
/*      */     //   #1284	-> 472
/*      */     //   #1280	-> 474
/*      */     //   #1279	-> 475
/*      */     //   #1279	-> 476
/*      */     //   #884	-> 477
/*      */     //   #885	-> 507
/*      */     //   #883	-> 508
/*      */     //   #887	-> 539
/*      */     //   #888	-> 544
/*      */     //   #889	-> 545
/*      */     //   #890	-> 559
/*      */     //   #1285	-> 572
/*      */     //   #1286	-> 584
/*      */     //   #1287	-> 595
/*      */     //   #890	-> 602
/*      */     //   #1287	-> 631
/*      */     //   #1288	-> 633
/*      */     //   #1289	-> 642
/*      */     //   #1290	-> 647
/*      */     //   #1286	-> 649
/*      */     //   #1285	-> 650
/*      */     //   #1285	-> 651
/*      */     //   #890	-> 652
/*      */     //   #888	-> 676
/*      */     //   #892	-> 682
/*      */     //   #887	-> 683
/*      */     //   #894	-> 696
/*      */     //   #895	-> 727
/*      */     //   #894	-> 768
/*      */     //   #897	-> 770
/*      */     //   #898	-> 798
/*      */     //   #899	-> 812
/*      */     //   #1291	-> 878
/*      */     //   #1292	-> 890
/*      */     //   #1293	-> 906
/*      */     //   #899	-> 911
/*      */     //   #1293	-> 927
/*      */     //   #1294	-> 929
/*      */     //   #1295	-> 938
/*      */     //   #1296	-> 943
/*      */     //   #1292	-> 945
/*      */     //   #1291	-> 946
/*      */     //   #1291	-> 947
/*      */     //   #899	-> 948
/*      */     //   #903	-> 963
/*      */     //   #904	-> 967
/*      */     //   #905	-> 974
/*      */     //   #903	-> 981
/*      */     //   #902	-> 987
/*      */     //   #870	-> 1005
/*      */     //   #902	-> 1010
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   252	21	20	$i$a$-cache-EnterExitTransitionKt$createModifier$slideAnimation$1	I
/*      */     //   283	11	21	value$iv	Ljava/lang/Object;
/*      */     //   234	66	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   231	69	18	it$iv	Ljava/lang/Object;
/*      */     //   222	80	17	$i$f$cache	I
/*      */     //   219	83	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   219	83	16	invalid$iv	Z
/*      */     //   427	21	21	$i$a$-cache-EnterExitTransitionKt$createModifier$sizeAnimation$1	I
/*      */     //   458	11	22	value$iv	Ljava/lang/Object;
/*      */     //   409	66	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   406	69	19	it$iv	Ljava/lang/Object;
/*      */     //   397	80	18	$i$f$cache	I
/*      */     //   394	83	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   394	83	17	invalid$iv	Z
/*      */     //   602	21	22	$i$a$-cache-EnterExitTransitionKt$createModifier$offsetAnimation$1	I
/*      */     //   633	11	23	value$iv	Ljava/lang/Object;
/*      */     //   584	66	21	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   581	69	20	it$iv	Ljava/lang/Object;
/*      */     //   572	80	19	$i$f$cache	I
/*      */     //   569	83	17	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   569	83	18	invalid$iv	Z
/*      */     //   911	13	24	$i$a$-cache-EnterExitTransitionKt$createModifier$2	I
/*      */     //   929	11	25	value$iv	Ljava/lang/Object;
/*      */     //   890	56	23	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   887	59	22	it$iv	Ljava/lang/Object;
/*      */     //   878	70	21	$i$f$cache	I
/*      */     //   875	73	19	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   875	73	20	invalid$iv	Z
/*      */     //   91	920	8	activeEnter	Landroidx/compose/animation/EnterTransition;
/*      */     //   113	898	9	activeExit	Landroidx/compose/animation/ExitTransition;
/*      */     //   142	869	10	shouldAnimateSlide	Z
/*      */     //   171	840	11	shouldAnimateSizeChange	Z
/*      */     //   346	665	12	slideAnimation	Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*      */     //   521	490	13	sizeAnimation	Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*      */     //   696	315	14	offsetAnimation	Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*      */     //   770	241	15	disableClip	Z
/*      */     //   798	213	16	graphicsLayerBlock	Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;
/*      */     //   0	1011	0	$this$createModifier	Landroidx/compose/animation/core/Transition;
/*      */     //   0	1011	1	enter	Landroidx/compose/animation/EnterTransition;
/*      */     //   0	1011	2	exit	Landroidx/compose/animation/ExitTransition;
/*      */     //   0	1011	3	isEnabled	Lkotlin/jvm/functions/Function0;
/*      */     //   0	1011	4	label	Ljava/lang/String;
/*      */     //   0	1011	5	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   0	1011	6	$changed	I
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"})
/*      */   static final class EnterExitTransitionKt$createModifier$2$1
/*      */     extends Lambda
/*      */     implements Function1<GraphicsLayerScope, Unit>
/*      */   {
/*      */     public final void invoke(@NotNull GraphicsLayerScope $this$graphicsLayer) {
/*  900 */       Intrinsics.checkNotNullParameter($this$graphicsLayer, "$this$graphicsLayer"); $this$graphicsLayer.setClip((!this.$disableClip && ((Boolean)this.$isEnabled.invoke()).booleanValue()));
/*      */     }
/*      */     
/*      */     EnterExitTransitionKt$createModifier$2$1(boolean $disableClip, Function0<Boolean> $isEnabled) {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   @Composable
/*      */   @NotNull
/*      */   public static final EnterTransition trackActiveEnter(@NotNull Transition $this$trackActiveEnter, @NotNull EnterTransition enter, @Nullable Composer $composer, int $changed) {
/*  911 */     Intrinsics.checkNotNullParameter($this$trackActiveEnter, "<this>"); Intrinsics.checkNotNullParameter(enter, "enter"); ComposerKt.sourceInformationMarkerStart($composer, 21614502, "C(trackActiveEnter)915@40149L40:EnterExitTransition.kt#xbi5r1"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(21614502, $changed, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:910)");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  916 */     ComposerKt.sourceInformationMarkerStart($composer, -1583278438, "CC(remember):EnterExitTransition.kt#9igjgp"); Composer composer = $composer; boolean invalid$iv = ((($changed & 0xE ^ 0x6) > 4 && $composer.changed($this$trackActiveEnter)) || ($changed & 0x6) == 4); int $i$f$cache = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1297 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 1298 */     if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/* 1299 */       int $i$a$-cache-EnterExitTransitionKt$trackActiveEnter$activeEnter$2 = 0; Object value$iv = SnapshotStateKt.mutableStateOf$default(enter, null, 2, null);
/* 1300 */       composer.updateRememberedValue(value$iv);
/*      */     } 
/* 1302 */     MutableState<EnterTransition> mutableState1 = (MutableState)it$iv;
/*      */     ComposerKt.sourceInformationMarkerEnd($composer);
/*      */     MutableState<EnterTransition> activeEnter$delegate = mutableState1;
/*      */     if ($this$trackActiveEnter.getCurrentState() == $this$trackActiveEnter.getTargetState() && $this$trackActiveEnter.getCurrentState() == EnterExitState.Visible) {
/*      */       if ($this$trackActiveEnter.isSeeking()) {
/*      */         trackActiveEnter$lambda$6(activeEnter$delegate, enter);
/*      */       } else {
/*      */         trackActiveEnter$lambda$6(activeEnter$delegate, EnterTransition.Companion.getNone());
/*      */       } 
/*      */     } else if ($this$trackActiveEnter.getTargetState() == EnterExitState.Visible) {
/*      */       trackActiveEnter$lambda$6(activeEnter$delegate, trackActiveEnter$lambda$5(activeEnter$delegate).plus(enter));
/*      */     } 
/*      */     EnterTransition enterTransition = trackActiveEnter$lambda$5(activeEnter$delegate);
/*      */     if (ComposerKt.isTraceInProgress()) {
/*      */       ComposerKt.traceEventEnd();
/*      */     }
/*      */     ComposerKt.sourceInformationMarkerEnd($composer);
/*      */     return enterTransition;
/*      */   }
/*      */   
/*      */   private static final EnterTransition trackActiveEnter$lambda$5(MutableState $activeEnter$delegate) {
/*      */     State state = (State)$activeEnter$delegate;
/*      */     Object object = null;
/*      */     KProperty property$iv = null;
/*      */     int $i$f$getValue = 0;
/* 1327 */     return (EnterTransition)state.getValue(); } private static final void trackActiveEnter$lambda$6(MutableState $activeEnter$delegate, EnterTransition value) { MutableState mutableState = $activeEnter$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 1328 */     mutableState.setValue(value); } private static final ExitTransition trackActiveExit$lambda$8(MutableState $activeExit$delegate) { State state = (State)$activeExit$delegate; Object object = null; KProperty property$iv = null;
/*      */     int $i$f$getValue = 0;
/* 1330 */     return (ExitTransition)state.getValue(); }
/* 1331 */   @Composable @NotNull public static final ExitTransition trackActiveExit(@NotNull Transition $this$trackActiveExit, @NotNull ExitTransition exit, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$trackActiveExit, "<this>"); Intrinsics.checkNotNullParameter(exit, "exit"); ComposerKt.sourceInformationMarkerStart($composer, -1363864804, "C(trackActiveExit)935@41130L39:EnterExitTransition.kt#xbi5r1"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1363864804, $changed, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:930)");  ComposerKt.sourceInformationMarkerStart($composer, 1483140299, "CC(remember):EnterExitTransition.kt#9igjgp"); Composer composer = $composer; boolean invalid$iv = ((($changed & 0xE ^ 0x6) > 4 && $composer.changed($this$trackActiveExit)) || ($changed & 0x6) == 4); int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0; if (invalid$iv || it$iv == Composer.Companion.getEmpty()) { int $i$a$-cache-EnterExitTransitionKt$trackActiveExit$activeExit$2 = 0; Object value$iv = SnapshotStateKt.mutableStateOf$default(exit, null, 2, null); composer.updateRememberedValue(value$iv); }  MutableState<ExitTransition> mutableState1 = (MutableState)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); MutableState<ExitTransition> activeExit$delegate = mutableState1; if ($this$trackActiveExit.getCurrentState() == $this$trackActiveExit.getTargetState() && $this$trackActiveExit.getCurrentState() == EnterExitState.Visible) { if ($this$trackActiveExit.isSeeking()) { trackActiveExit$lambda$9(activeExit$delegate, exit); } else { trackActiveExit$lambda$9(activeExit$delegate, ExitTransition.Companion.getNone()); }  } else if ($this$trackActiveExit.getTargetState() != EnterExitState.Visible) { trackActiveExit$lambda$9(activeExit$delegate, trackActiveExit$lambda$8(activeExit$delegate).plus(exit)); }  ExitTransition exitTransition = trackActiveExit$lambda$8(activeExit$delegate); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); return exitTransition; } private static final void trackActiveExit$lambda$9(MutableState $activeExit$delegate, ExitTransition value) { MutableState mutableState = $activeExit$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0; mutableState.setValue(value); }
/*      */ 
/*      */   
/*      */   @Composable
/*      */   private static final GraphicsLayerBlockForEnterExit createGraphicsLayerBlock(Transition $this$createGraphicsLayerBlock, EnterTransition enter, ExitTransition exit, String label, Composer $composer, int $changed) {
/*      */     // Byte code:
/*      */     //   0: aload #4
/*      */     //   2: ldc_w 642253525
/*      */     //   5: ldc_w 'C(createGraphicsLayerBlock)985@42946L2853:EnterExitTransition.kt#xbi5r1'
/*      */     //   8: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   11: invokestatic isTraceInProgress : ()Z
/*      */     //   14: ifeq -> 29
/*      */     //   17: ldc_w 642253525
/*      */     //   20: iload #5
/*      */     //   22: iconst_m1
/*      */     //   23: ldc_w 'androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:958)'
/*      */     //   26: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   29: aload_1
/*      */     //   30: invokevirtual getData$animation : ()Landroidx/compose/animation/TransitionData;
/*      */     //   33: invokevirtual getFade : ()Landroidx/compose/animation/Fade;
/*      */     //   36: ifnonnull -> 49
/*      */     //   39: aload_2
/*      */     //   40: invokevirtual getData$animation : ()Landroidx/compose/animation/TransitionData;
/*      */     //   43: invokevirtual getFade : ()Landroidx/compose/animation/Fade;
/*      */     //   46: ifnull -> 53
/*      */     //   49: iconst_1
/*      */     //   50: goto -> 54
/*      */     //   53: iconst_0
/*      */     //   54: istore #6
/*      */     //   56: aload_1
/*      */     //   57: invokevirtual getData$animation : ()Landroidx/compose/animation/TransitionData;
/*      */     //   60: invokevirtual getScale : ()Landroidx/compose/animation/Scale;
/*      */     //   63: ifnonnull -> 76
/*      */     //   66: aload_2
/*      */     //   67: invokevirtual getData$animation : ()Landroidx/compose/animation/TransitionData;
/*      */     //   70: invokevirtual getScale : ()Landroidx/compose/animation/Scale;
/*      */     //   73: ifnull -> 80
/*      */     //   76: iconst_1
/*      */     //   77: goto -> 81
/*      */     //   80: iconst_0
/*      */     //   81: istore #7
/*      */     //   83: aload #4
/*      */     //   85: ldc_w -1545808136
/*      */     //   88: invokeinterface startReplaceGroup : (I)V
/*      */     //   93: aload #4
/*      */     //   95: ldc_w '968@42460L27,967@42377L120'
/*      */     //   98: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*      */     //   101: iload #6
/*      */     //   103: ifeq -> 243
/*      */     //   106: aload_0
/*      */     //   107: getstatic kotlin/jvm/internal/FloatCompanionObject.INSTANCE : Lkotlin/jvm/internal/FloatCompanionObject;
/*      */     //   110: invokestatic getVectorConverter : (Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;
/*      */     //   113: aload #4
/*      */     //   115: ldc_w -1545804535
/*      */     //   118: ldc_w 'CC(remember):EnterExitTransition.kt#9igjgp'
/*      */     //   121: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   124: aload #4
/*      */     //   126: astore #11
/*      */     //   128: iconst_0
/*      */     //   129: istore #12
/*      */     //   131: iconst_0
/*      */     //   132: istore #13
/*      */     //   134: aload #11
/*      */     //   136: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   141: astore #14
/*      */     //   143: iconst_0
/*      */     //   144: istore #15
/*      */     //   146: aload #14
/*      */     //   148: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   151: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   154: if_acmpne -> 208
/*      */     //   157: astore #21
/*      */     //   159: astore #20
/*      */     //   161: iconst_0
/*      */     //   162: istore #16
/*      */     //   164: new java/lang/StringBuilder
/*      */     //   167: dup
/*      */     //   168: invokespecial <init> : ()V
/*      */     //   171: aload_3
/*      */     //   172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   175: ldc_w ' alpha'
/*      */     //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   181: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   184: astore #22
/*      */     //   186: aload #20
/*      */     //   188: aload #21
/*      */     //   190: aload #22
/*      */     //   192: astore #17
/*      */     //   194: aload #11
/*      */     //   196: aload #17
/*      */     //   198: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   203: aload #17
/*      */     //   205: goto -> 210
/*      */     //   208: aload #14
/*      */     //   210: nop
/*      */     //   211: nop
/*      */     //   212: nop
/*      */     //   213: checkcast java/lang/String
/*      */     //   216: astore #10
/*      */     //   218: aload #4
/*      */     //   220: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   223: aload #10
/*      */     //   225: aload #4
/*      */     //   227: sipush #384
/*      */     //   230: bipush #14
/*      */     //   232: iload #5
/*      */     //   234: iand
/*      */     //   235: ior
/*      */     //   236: iconst_0
/*      */     //   237: invokestatic createDeferredAnimation : (Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*      */     //   240: goto -> 244
/*      */     //   243: aconst_null
/*      */     //   244: astore #9
/*      */     //   246: aload #4
/*      */     //   248: invokeinterface endReplaceGroup : ()V
/*      */     //   253: aload #9
/*      */     //   255: astore #8
/*      */     //   257: aload #4
/*      */     //   259: ldc_w -1545801832
/*      */     //   262: invokeinterface startReplaceGroup : (I)V
/*      */     //   267: aload #4
/*      */     //   269: ldc_w '974@42657L27,973@42574L120'
/*      */     //   272: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*      */     //   275: iload #7
/*      */     //   277: ifeq -> 417
/*      */     //   280: aload_0
/*      */     //   281: getstatic kotlin/jvm/internal/FloatCompanionObject.INSTANCE : Lkotlin/jvm/internal/FloatCompanionObject;
/*      */     //   284: invokestatic getVectorConverter : (Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;
/*      */     //   287: aload #4
/*      */     //   289: ldc_w -1545798231
/*      */     //   292: ldc_w 'CC(remember):EnterExitTransition.kt#9igjgp'
/*      */     //   295: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   298: aload #4
/*      */     //   300: astore #12
/*      */     //   302: iconst_0
/*      */     //   303: istore #13
/*      */     //   305: iconst_0
/*      */     //   306: istore #14
/*      */     //   308: aload #12
/*      */     //   310: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   315: astore #15
/*      */     //   317: iconst_0
/*      */     //   318: istore #16
/*      */     //   320: aload #15
/*      */     //   322: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   325: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   328: if_acmpne -> 382
/*      */     //   331: astore #21
/*      */     //   333: astore #20
/*      */     //   335: iconst_0
/*      */     //   336: istore #17
/*      */     //   338: new java/lang/StringBuilder
/*      */     //   341: dup
/*      */     //   342: invokespecial <init> : ()V
/*      */     //   345: aload_3
/*      */     //   346: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   349: ldc_w ' scale'
/*      */     //   352: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   355: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   358: astore #22
/*      */     //   360: aload #20
/*      */     //   362: aload #21
/*      */     //   364: aload #22
/*      */     //   366: astore #18
/*      */     //   368: aload #12
/*      */     //   370: aload #18
/*      */     //   372: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   377: aload #18
/*      */     //   379: goto -> 384
/*      */     //   382: aload #15
/*      */     //   384: nop
/*      */     //   385: nop
/*      */     //   386: nop
/*      */     //   387: checkcast java/lang/String
/*      */     //   390: astore #11
/*      */     //   392: aload #4
/*      */     //   394: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   397: aload #11
/*      */     //   399: aload #4
/*      */     //   401: sipush #384
/*      */     //   404: bipush #14
/*      */     //   406: iload #5
/*      */     //   408: iand
/*      */     //   409: ior
/*      */     //   410: iconst_0
/*      */     //   411: invokestatic createDeferredAnimation : (Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*      */     //   414: goto -> 418
/*      */     //   417: aconst_null
/*      */     //   418: astore #10
/*      */     //   420: aload #4
/*      */     //   422: invokeinterface endReplaceGroup : ()V
/*      */     //   427: aload #10
/*      */     //   429: astore #9
/*      */     //   431: aload #4
/*      */     //   433: ldc_w -1545795192
/*      */     //   436: invokeinterface startReplaceGroup : (I)V
/*      */     //   441: aload #4
/*      */     //   443: ldc_w '979@42781L136'
/*      */     //   446: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*      */     //   449: iload #7
/*      */     //   451: ifeq -> 479
/*      */     //   454: aload_0
/*      */     //   455: getstatic androidx/compose/animation/EnterExitTransitionKt.TransformOriginVectorConverter : Landroidx/compose/animation/core/TwoWayConverter;
/*      */     //   458: ldc_w 'TransformOriginInterruptionHandling'
/*      */     //   461: aload #4
/*      */     //   463: sipush #384
/*      */     //   466: bipush #14
/*      */     //   468: iload #5
/*      */     //   470: iand
/*      */     //   471: ior
/*      */     //   472: iconst_0
/*      */     //   473: invokestatic createDeferredAnimation : (Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*      */     //   476: goto -> 480
/*      */     //   479: aconst_null
/*      */     //   480: astore #11
/*      */     //   482: aload #4
/*      */     //   484: invokeinterface endReplaceGroup : ()V
/*      */     //   489: aload #11
/*      */     //   491: astore #10
/*      */     //   493: aload #4
/*      */     //   495: ldc_w -1545786157
/*      */     //   498: ldc_w 'CC(remember):EnterExitTransition.kt#9igjgp'
/*      */     //   501: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   504: aload #4
/*      */     //   506: astore #13
/*      */     //   508: aload #4
/*      */     //   510: aload #8
/*      */     //   512: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   517: iload #5
/*      */     //   519: bipush #112
/*      */     //   521: iand
/*      */     //   522: bipush #48
/*      */     //   524: ixor
/*      */     //   525: bipush #32
/*      */     //   527: if_icmple -> 541
/*      */     //   530: aload #4
/*      */     //   532: aload_1
/*      */     //   533: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   538: ifne -> 551
/*      */     //   541: iload #5
/*      */     //   543: bipush #48
/*      */     //   545: iand
/*      */     //   546: bipush #32
/*      */     //   548: if_icmpne -> 555
/*      */     //   551: iconst_1
/*      */     //   552: goto -> 556
/*      */     //   555: iconst_0
/*      */     //   556: ior
/*      */     //   557: iload #5
/*      */     //   559: sipush #896
/*      */     //   562: iand
/*      */     //   563: sipush #384
/*      */     //   566: ixor
/*      */     //   567: sipush #256
/*      */     //   570: if_icmple -> 584
/*      */     //   573: aload #4
/*      */     //   575: aload_2
/*      */     //   576: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   581: ifne -> 596
/*      */     //   584: iload #5
/*      */     //   586: sipush #384
/*      */     //   589: iand
/*      */     //   590: sipush #256
/*      */     //   593: if_icmpne -> 600
/*      */     //   596: iconst_1
/*      */     //   597: goto -> 601
/*      */     //   600: iconst_0
/*      */     //   601: ior
/*      */     //   602: aload #4
/*      */     //   604: aload #9
/*      */     //   606: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   611: ior
/*      */     //   612: iload #5
/*      */     //   614: bipush #14
/*      */     //   616: iand
/*      */     //   617: bipush #6
/*      */     //   619: ixor
/*      */     //   620: iconst_4
/*      */     //   621: if_icmple -> 635
/*      */     //   624: aload #4
/*      */     //   626: aload_0
/*      */     //   627: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   632: ifne -> 644
/*      */     //   635: iload #5
/*      */     //   637: bipush #6
/*      */     //   639: iand
/*      */     //   640: iconst_4
/*      */     //   641: if_icmpne -> 648
/*      */     //   644: iconst_1
/*      */     //   645: goto -> 649
/*      */     //   648: iconst_0
/*      */     //   649: ior
/*      */     //   650: aload #4
/*      */     //   652: aload #10
/*      */     //   654: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   659: ior
/*      */     //   660: istore #14
/*      */     //   662: iconst_0
/*      */     //   663: istore #15
/*      */     //   665: aload #13
/*      */     //   667: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   672: astore #16
/*      */     //   674: iconst_0
/*      */     //   675: istore #17
/*      */     //   677: iload #14
/*      */     //   679: ifne -> 693
/*      */     //   682: aload #16
/*      */     //   684: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   687: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   690: if_acmpne -> 726
/*      */     //   693: iconst_0
/*      */     //   694: istore #18
/*      */     //   696: aload #8
/*      */     //   698: aload #9
/*      */     //   700: aload_0
/*      */     //   701: aload_1
/*      */     //   702: aload_2
/*      */     //   703: aload #10
/*      */     //   705: <illegal opcode> init : (Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/core/Transition$DeferredAnimation;)Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;
/*      */     //   710: astore #19
/*      */     //   712: aload #13
/*      */     //   714: aload #19
/*      */     //   716: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   721: aload #19
/*      */     //   723: goto -> 728
/*      */     //   726: aload #16
/*      */     //   728: nop
/*      */     //   729: nop
/*      */     //   730: nop
/*      */     //   731: checkcast androidx/compose/animation/GraphicsLayerBlockForEnterExit
/*      */     //   734: astore #12
/*      */     //   736: aload #4
/*      */     //   738: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   741: aload #12
/*      */     //   743: astore #11
/*      */     //   745: invokestatic isTraceInProgress : ()Z
/*      */     //   748: ifeq -> 754
/*      */     //   751: invokestatic traceEventEnd : ()V
/*      */     //   754: aload #4
/*      */     //   756: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   759: aload #11
/*      */     //   761: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #959	-> 8
/*      */     //   #961	-> 29
/*      */     //   #962	-> 56
/*      */     //   #967	-> 101
/*      */     //   #968	-> 106
/*      */     //   #969	-> 121
/*      */     //   #1309	-> 134
/*      */     //   #1310	-> 146
/*      */     //   #1311	-> 157
/*      */     //   #969	-> 164
/*      */     //   #1311	-> 192
/*      */     //   #1312	-> 194
/*      */     //   #1313	-> 203
/*      */     //   #1314	-> 208
/*      */     //   #1310	-> 210
/*      */     //   #1309	-> 211
/*      */     //   #1309	-> 212
/*      */     //   #969	-> 213
/*      */     //   #968	-> 237
/*      */     //   #971	-> 243
/*      */     //   #967	-> 244
/*      */     //   #973	-> 275
/*      */     //   #974	-> 280
/*      */     //   #975	-> 295
/*      */     //   #1315	-> 308
/*      */     //   #1316	-> 320
/*      */     //   #1317	-> 331
/*      */     //   #975	-> 338
/*      */     //   #1317	-> 366
/*      */     //   #1318	-> 368
/*      */     //   #1319	-> 377
/*      */     //   #1320	-> 382
/*      */     //   #1316	-> 384
/*      */     //   #1315	-> 385
/*      */     //   #1315	-> 386
/*      */     //   #975	-> 387
/*      */     //   #974	-> 411
/*      */     //   #977	-> 417
/*      */     //   #973	-> 418
/*      */     //   #979	-> 449
/*      */     //   #980	-> 454
/*      */     //   #981	-> 455
/*      */     //   #982	-> 458
/*      */     //   #980	-> 473
/*      */     //   #984	-> 479
/*      */     //   #979	-> 480
/*      */     //   #986	-> 501
/*      */     //   #1321	-> 665
/*      */     //   #1322	-> 677
/*      */     //   #1323	-> 693
/*      */     //   #986	-> 696
/*      */     //   #1323	-> 710
/*      */     //   #1324	-> 712
/*      */     //   #1325	-> 721
/*      */     //   #1326	-> 726
/*      */     //   #1322	-> 728
/*      */     //   #1321	-> 729
/*      */     //   #1321	-> 730
/*      */     //   #986	-> 731
/*      */     //   #959	-> 756
/*      */     //   #986	-> 761
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   164	20	16	$i$a$-cache-EnterExitTransitionKt$createGraphicsLayerBlock$alphaAnimation$1	I
/*      */     //   194	11	17	value$iv	Ljava/lang/Object;
/*      */     //   146	65	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   143	68	14	it$iv	Ljava/lang/Object;
/*      */     //   134	79	13	$i$f$cache	I
/*      */     //   131	82	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   131	82	12	invalid$iv	Z
/*      */     //   338	20	17	$i$a$-cache-EnterExitTransitionKt$createGraphicsLayerBlock$scaleAnimation$1	I
/*      */     //   368	11	18	value$iv	Ljava/lang/Object;
/*      */     //   320	65	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   317	68	15	it$iv	Ljava/lang/Object;
/*      */     //   308	79	14	$i$f$cache	I
/*      */     //   305	82	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   305	82	13	invalid$iv	Z
/*      */     //   696	14	18	$i$a$-cache-EnterExitTransitionKt$createGraphicsLayerBlock$1	I
/*      */     //   712	11	19	value$iv	Ljava/lang/Object;
/*      */     //   677	52	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   674	55	16	it$iv	Ljava/lang/Object;
/*      */     //   665	66	15	$i$f$cache	I
/*      */     //   662	69	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   662	69	14	invalid$iv	Z
/*      */     //   56	706	6	shouldAnimateAlpha	Z
/*      */     //   83	679	7	shouldAnimateScale	Z
/*      */     //   257	505	8	alphaAnimation	Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*      */     //   431	331	9	scaleAnimation	Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*      */     //   493	269	10	transformOriginAnimation	Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*      */     //   0	762	0	$this$createGraphicsLayerBlock	Landroidx/compose/animation/core/Transition;
/*      */     //   0	762	1	enter	Landroidx/compose/animation/EnterTransition;
/*      */     //   0	762	2	exit	Landroidx/compose/animation/ExitTransition;
/*      */     //   0	762	3	label	Ljava/lang/String;
/*      */     //   0	762	4	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   0	762	5	$changed	I
/*      */   }
/*      */   
/*      */   private static final Function1 createGraphicsLayerBlock$lambda$13$lambda$12(Transition.DeferredAnimation $alphaAnimation, Transition.DeferredAnimation $scaleAnimation, Transition $this_createGraphicsLayerBlock, EnterTransition $enter, ExitTransition $exit, Transition.DeferredAnimation $transformOriginAnimation) {
/*      */     Intrinsics.checkNotNullParameter($this_createGraphicsLayerBlock, "$this_createGraphicsLayerBlock");
/*      */     Intrinsics.checkNotNullParameter($enter, "$enter");
/*      */     Intrinsics.checkNotNullParameter($exit, "$exit");
/*      */     State<Float> alpha = ($alphaAnimation != null) ? $alphaAnimation.animate(new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1($enter, $exit), new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2($enter, $exit)) : null;
/*      */     State<Float> scale = ($scaleAnimation != null) ? $scaleAnimation.animate(new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1($enter, $exit), new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2($enter, $exit)) : null;
/*      */     $enter.getData$animation().getScale();
/*      */     $exit.getData$animation().getScale();
/*      */     $exit.getData$animation().getScale();
/*      */     $enter.getData$animation().getScale();
/*      */     TransformOrigin transformOriginWhenVisible = ($this_createGraphicsLayerBlock.getCurrentState() == EnterExitState.PreEnter) ? (($enter.getData$animation().getScale() != null) ? TransformOrigin.box-impl($enter.getData$animation().getScale().getTransformOrigin-SzJe1aQ()) : (($exit.getData$animation().getScale() != null) ? TransformOrigin.box-impl($exit.getData$animation().getScale().getTransformOrigin-SzJe1aQ()) : null)) : (($exit.getData$animation().getScale() != null) ? TransformOrigin.box-impl($exit.getData$animation().getScale().getTransformOrigin-SzJe1aQ()) : (($enter.getData$animation().getScale() != null) ? TransformOrigin.box-impl($enter.getData$animation().getScale().getTransformOrigin-SzJe1aQ()) : null));
/*      */     State<TransformOrigin> transformOrigin = ($transformOriginAnimation != null) ? $transformOriginAnimation.animate(EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1.INSTANCE, new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2(transformOriginWhenVisible, $enter, $exit)) : null;
/*      */     Function1 block = new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1(alpha, scale, transformOrigin);
/*      */     return block;
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\020\007\n\002\030\002\n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\001*\b\022\004\022\0020\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/EnterExitState;", "invoke"})
/*      */   static final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1 extends Lambda implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<Float>> {
/*      */     @NotNull
/*      */     public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment $this$animate) {
/*      */       Intrinsics.checkNotNullParameter($this$animate, "$this$animate");
/*      */       if ($this$animate.isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
/*      */         if (this.$enter.getData$animation().getFade() == null || this.$enter.getData$animation().getFade().getAnimationSpec() == null)
/*      */           this.$enter.getData$animation().getFade().getAnimationSpec(); 
/*      */       } else if ($this$animate.isTransitioningTo(EnterExitState.Visible, EnterExitState.PostExit)) {
/*      */         if (this.$exit.getData$animation().getFade() == null || this.$exit.getData$animation().getFade().getAnimationSpec() == null)
/*      */           this.$exit.getData$animation().getFade().getAnimationSpec(); 
/*      */       } else {
/*      */       
/*      */       } 
/*      */       return (FiniteAnimationSpec<Float>)EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
/*      */     }
/*      */     
/*      */     EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1(EnterTransition $enter, ExitTransition $exit) {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\007\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/animation/EnterExitState;", "invoke", "(Landroidx/compose/animation/EnterExitState;)Ljava/lang/Float;"})
/*      */   static final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2 extends Lambda implements Function1<EnterExitState, Float> {
/*      */     @NotNull
/*      */     public final Float invoke(@NotNull EnterExitState it) {
/*      */       // Byte code:
/*      */       //   0: aload_1
/*      */       //   1: ldc 'it'
/*      */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */       //   6: aload_1
/*      */       //   7: getstatic androidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2$WhenMappings.$EnumSwitchMapping$0 : [I
/*      */       //   10: swap
/*      */       //   11: invokevirtual ordinal : ()I
/*      */       //   14: iaload
/*      */       //   15: tableswitch default -> 94, 1 -> 40, 2 -> 44, 3 -> 69
/*      */       //   40: fconst_1
/*      */       //   41: goto -> 102
/*      */       //   44: aload_0
/*      */       //   45: getfield $enter : Landroidx/compose/animation/EnterTransition;
/*      */       //   48: invokevirtual getData$animation : ()Landroidx/compose/animation/TransitionData;
/*      */       //   51: invokevirtual getFade : ()Landroidx/compose/animation/Fade;
/*      */       //   54: dup
/*      */       //   55: ifnull -> 64
/*      */       //   58: invokevirtual getAlpha : ()F
/*      */       //   61: goto -> 102
/*      */       //   64: pop
/*      */       //   65: fconst_1
/*      */       //   66: goto -> 102
/*      */       //   69: aload_0
/*      */       //   70: getfield $exit : Landroidx/compose/animation/ExitTransition;
/*      */       //   73: invokevirtual getData$animation : ()Landroidx/compose/animation/TransitionData;
/*      */       //   76: invokevirtual getFade : ()Landroidx/compose/animation/Fade;
/*      */       //   79: dup
/*      */       //   80: ifnull -> 89
/*      */       //   83: invokevirtual getAlpha : ()F
/*      */       //   86: goto -> 102
/*      */       //   89: pop
/*      */       //   90: fconst_1
/*      */       //   91: goto -> 102
/*      */       //   94: new kotlin/NoWhenBranchMatchedException
/*      */       //   97: dup
/*      */       //   98: invokespecial <init> : ()V
/*      */       //   101: athrow
/*      */       //   102: invokestatic valueOf : (F)Ljava/lang/Float;
/*      */       //   105: areturn
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #1000	-> 6
/*      */       //   #1001	-> 40
/*      */       //   #1002	-> 44
/*      */       //   #1003	-> 69
/*      */       //   #1000	-> 105
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   0	106	0	this	Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2;
/*      */       //   0	106	1	it	Landroidx/compose/animation/EnterExitState;
/*      */     }
/*      */     
/*      */     EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2(EnterTransition $enter, ExitTransition $exit) {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\020\007\n\002\030\002\n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\001*\b\022\004\022\0020\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/EnterExitState;", "invoke"})
/*      */   static final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1 extends Lambda implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<Float>> {
/*      */     @NotNull
/*      */     public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment $this$animate) {
/*      */       Intrinsics.checkNotNullParameter($this$animate, "$this$animate");
/*      */       if ($this$animate.isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
/*      */         if (this.$enter.getData$animation().getScale() == null || this.$enter.getData$animation().getScale().getAnimationSpec() == null)
/*      */           this.$enter.getData$animation().getScale().getAnimationSpec(); 
/*      */       } else if ($this$animate.isTransitioningTo(EnterExitState.Visible, EnterExitState.PostExit)) {
/*      */         if (this.$exit.getData$animation().getScale() == null || this.$exit.getData$animation().getScale().getAnimationSpec() == null)
/*      */           this.$exit.getData$animation().getScale().getAnimationSpec(); 
/*      */       } else {
/*      */       
/*      */       } 
/*      */       return (FiniteAnimationSpec<Float>)EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
/*      */     }
/*      */     
/*      */     EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1(EnterTransition $enter, ExitTransition $exit) {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\007\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/animation/EnterExitState;", "invoke", "(Landroidx/compose/animation/EnterExitState;)Ljava/lang/Float;"})
/*      */   static final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2 extends Lambda implements Function1<EnterExitState, Float> {
/*      */     @NotNull
/*      */     public final Float invoke(@NotNull EnterExitState it) {
/*      */       // Byte code:
/*      */       //   0: aload_1
/*      */       //   1: ldc 'it'
/*      */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */       //   6: aload_1
/*      */       //   7: getstatic androidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2$WhenMappings.$EnumSwitchMapping$0 : [I
/*      */       //   10: swap
/*      */       //   11: invokevirtual ordinal : ()I
/*      */       //   14: iaload
/*      */       //   15: tableswitch default -> 94, 1 -> 40, 2 -> 44, 3 -> 69
/*      */       //   40: fconst_1
/*      */       //   41: goto -> 102
/*      */       //   44: aload_0
/*      */       //   45: getfield $enter : Landroidx/compose/animation/EnterTransition;
/*      */       //   48: invokevirtual getData$animation : ()Landroidx/compose/animation/TransitionData;
/*      */       //   51: invokevirtual getScale : ()Landroidx/compose/animation/Scale;
/*      */       //   54: dup
/*      */       //   55: ifnull -> 64
/*      */       //   58: invokevirtual getScale : ()F
/*      */       //   61: goto -> 102
/*      */       //   64: pop
/*      */       //   65: fconst_1
/*      */       //   66: goto -> 102
/*      */       //   69: aload_0
/*      */       //   70: getfield $exit : Landroidx/compose/animation/ExitTransition;
/*      */       //   73: invokevirtual getData$animation : ()Landroidx/compose/animation/TransitionData;
/*      */       //   76: invokevirtual getScale : ()Landroidx/compose/animation/Scale;
/*      */       //   79: dup
/*      */       //   80: ifnull -> 89
/*      */       //   83: invokevirtual getScale : ()F
/*      */       //   86: goto -> 102
/*      */       //   89: pop
/*      */       //   90: fconst_1
/*      */       //   91: goto -> 102
/*      */       //   94: new kotlin/NoWhenBranchMatchedException
/*      */       //   97: dup
/*      */       //   98: invokespecial <init> : ()V
/*      */       //   101: athrow
/*      */       //   102: invokestatic valueOf : (F)Ljava/lang/Float;
/*      */       //   105: areturn
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #1020	-> 6
/*      */       //   #1021	-> 40
/*      */       //   #1022	-> 44
/*      */       //   #1023	-> 69
/*      */       //   #1020	-> 105
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   0	106	0	this	Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2;
/*      */       //   0	106	1	it	Landroidx/compose/animation/EnterExitState;
/*      */     }
/*      */     
/*      */     EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2(EnterTransition $enter, ExitTransition $exit) {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\001*\b\022\004\022\0020\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/graphics/TransformOrigin;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/EnterExitState;", "invoke"})
/*      */   static final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1 extends Lambda implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<TransformOrigin>> {
/*      */     public static final EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1 INSTANCE = new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1();
/*      */     
/*      */     EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1() {
/*      */       super(1);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final FiniteAnimationSpec<TransformOrigin> invoke(@NotNull Transition.Segment $this$animate) {
/*      */       Intrinsics.checkNotNullParameter($this$animate, "$this$animate");
/*      */       return (FiniteAnimationSpec<TransformOrigin>)AnimationSpecKt.spring$default(0.0F, 0.0F, null, 7, null);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/TransformOrigin;", "it", "Landroidx/compose/animation/EnterExitState;", "invoke-LIALnN8", "(Landroidx/compose/animation/EnterExitState;)J"})
/*      */   static final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2 extends Lambda implements Function1<EnterExitState, TransformOrigin> {
/*      */     public final long invoke-LIALnN8(@NotNull EnterExitState it) {
/*      */       // Byte code:
/*      */       //   0: aload_1
/*      */       //   1: ldc 'it'
/*      */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */       //   6: aload_1
/*      */       //   7: getstatic androidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2$WhenMappings.$EnumSwitchMapping$0 : [I
/*      */       //   10: swap
/*      */       //   11: invokevirtual ordinal : ()I
/*      */       //   14: iaload
/*      */       //   15: tableswitch default -> 151, 1 -> 40, 2 -> 47, 3 -> 99
/*      */       //   40: aload_0
/*      */       //   41: getfield $transformOriginWhenVisible : Landroidx/compose/ui/graphics/TransformOrigin;
/*      */       //   44: goto -> 159
/*      */       //   47: aload_0
/*      */       //   48: getfield $enter : Landroidx/compose/animation/EnterTransition;
/*      */       //   51: invokevirtual getData$animation : ()Landroidx/compose/animation/TransitionData;
/*      */       //   54: invokevirtual getScale : ()Landroidx/compose/animation/Scale;
/*      */       //   57: dup
/*      */       //   58: ifnull -> 70
/*      */       //   61: invokevirtual getTransformOrigin-SzJe1aQ : ()J
/*      */       //   64: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/TransformOrigin;
/*      */       //   67: goto -> 159
/*      */       //   70: pop
/*      */       //   71: aload_0
/*      */       //   72: getfield $exit : Landroidx/compose/animation/ExitTransition;
/*      */       //   75: invokevirtual getData$animation : ()Landroidx/compose/animation/TransitionData;
/*      */       //   78: invokevirtual getScale : ()Landroidx/compose/animation/Scale;
/*      */       //   81: dup
/*      */       //   82: ifnull -> 94
/*      */       //   85: invokevirtual getTransformOrigin-SzJe1aQ : ()J
/*      */       //   88: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/TransformOrigin;
/*      */       //   91: goto -> 159
/*      */       //   94: pop
/*      */       //   95: aconst_null
/*      */       //   96: goto -> 159
/*      */       //   99: aload_0
/*      */       //   100: getfield $exit : Landroidx/compose/animation/ExitTransition;
/*      */       //   103: invokevirtual getData$animation : ()Landroidx/compose/animation/TransitionData;
/*      */       //   106: invokevirtual getScale : ()Landroidx/compose/animation/Scale;
/*      */       //   109: dup
/*      */       //   110: ifnull -> 122
/*      */       //   113: invokevirtual getTransformOrigin-SzJe1aQ : ()J
/*      */       //   116: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/TransformOrigin;
/*      */       //   119: goto -> 159
/*      */       //   122: pop
/*      */       //   123: aload_0
/*      */       //   124: getfield $enter : Landroidx/compose/animation/EnterTransition;
/*      */       //   127: invokevirtual getData$animation : ()Landroidx/compose/animation/TransitionData;
/*      */       //   130: invokevirtual getScale : ()Landroidx/compose/animation/Scale;
/*      */       //   133: dup
/*      */       //   134: ifnull -> 146
/*      */       //   137: invokevirtual getTransformOrigin-SzJe1aQ : ()J
/*      */       //   140: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/TransformOrigin;
/*      */       //   143: goto -> 159
/*      */       //   146: pop
/*      */       //   147: aconst_null
/*      */       //   148: goto -> 159
/*      */       //   151: new kotlin/NoWhenBranchMatchedException
/*      */       //   154: dup
/*      */       //   155: invokespecial <init> : ()V
/*      */       //   158: athrow
/*      */       //   159: dup
/*      */       //   160: ifnull -> 169
/*      */       //   163: invokevirtual unbox-impl : ()J
/*      */       //   166: goto -> 176
/*      */       //   169: pop
/*      */       //   170: getstatic androidx/compose/ui/graphics/TransformOrigin.Companion : Landroidx/compose/ui/graphics/TransformOrigin$Companion;
/*      */       //   173: invokevirtual getCenter-SzJe1aQ : ()J
/*      */       //   176: lreturn
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #1035	-> 6
/*      */       //   #1036	-> 40
/*      */       //   #1038	-> 47
/*      */       //   #1041	-> 99
/*      */       //   #1035	-> 159
/*      */       //   #1042	-> 170
/*      */       //   #1035	-> 176
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   0	177	0	this	Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2;
/*      */       //   0	177	1	it	Landroidx/compose/animation/EnterExitState;
/*      */     }
/*      */     
/*      */     EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2(TransformOrigin $transformOriginWhenVisible, EnterTransition $enter, ExitTransition $exit) {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"})
/*      */   static final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
/*      */     public final void invoke(@NotNull GraphicsLayerScope $this$null) {
/*      */       Intrinsics.checkNotNullParameter($this$null, "$this$null");
/*      */       $this$null.setAlpha((this.$alpha != null) ? ((Number)this.$alpha.getValue()).floatValue() : 1.0F);
/*      */       $this$null.setScaleX((this.$scale != null) ? ((Number)this.$scale.getValue()).floatValue() : 1.0F);
/*      */       $this$null.setScaleY((this.$scale != null) ? ((Number)this.$scale.getValue()).floatValue() : 1.0F);
/*      */       $this$null.setTransformOrigin-__ExYCQ((this.$transformOrigin != null) ? ((TransformOrigin)this.$transformOrigin.getValue()).unbox-impl() : TransformOrigin.Companion.getCenter-SzJe1aQ());
/*      */     }
/*      */     
/*      */     EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1(State<Float> $alpha, State<Float> $scale, State<TransformOrigin> $transformOrigin) {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(EnterExitTransitionKt$TransformOriginVectorConverter$1.INSTANCE, EnterExitTransitionKt$TransformOriginVectorConverter$2.INSTANCE);
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector2D;", "it", "Landroidx/compose/ui/graphics/TransformOrigin;", "invoke-__ExYCQ", "(J)Landroidx/compose/animation/core/AnimationVector2D;"})
/*      */   static final class EnterExitTransitionKt$TransformOriginVectorConverter$1 extends Lambda implements Function1<TransformOrigin, AnimationVector2D> {
/*      */     public static final EnterExitTransitionKt$TransformOriginVectorConverter$1 INSTANCE = new EnterExitTransitionKt$TransformOriginVectorConverter$1();
/*      */     
/*      */     @NotNull
/*      */     public final AnimationVector2D invoke-__ExYCQ(long it) {
/*      */       return new AnimationVector2D(TransformOrigin.getPivotFractionX-impl(it), TransformOrigin.getPivotFractionY-impl(it));
/*      */     }
/*      */     
/*      */     EnterExitTransitionKt$TransformOriginVectorConverter$1() {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/TransformOrigin;", "it", "Landroidx/compose/animation/core/AnimationVector2D;", "invoke-LIALnN8", "(Landroidx/compose/animation/core/AnimationVector2D;)J"})
/*      */   static final class EnterExitTransitionKt$TransformOriginVectorConverter$2 extends Lambda implements Function1<AnimationVector2D, TransformOrigin> {
/*      */     public static final EnterExitTransitionKt$TransformOriginVectorConverter$2 INSTANCE = new EnterExitTransitionKt$TransformOriginVectorConverter$2();
/*      */     
/*      */     public final long invoke-LIALnN8(@NotNull AnimationVector2D it) {
/*      */       Intrinsics.checkNotNullParameter(it, "it");
/*      */       return TransformOriginKt.TransformOrigin(it.getV1(), it.getV2());
/*      */     }
/*      */     
/*      */     EnterExitTransitionKt$TransformOriginVectorConverter$2() {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   @NotNull
/*      */   private static final SpringSpec<Float> DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0F, 400.0F, null, 5, null);
/*      */   @NotNull
/*      */   private static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0F, 400.0F, IntOffset.box-impl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
/*      */   @NotNull
/*      */   private static final SpringSpec<IntSize> DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0F, 400.0F, IntSize.box-impl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\EnterExitTransitionKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */