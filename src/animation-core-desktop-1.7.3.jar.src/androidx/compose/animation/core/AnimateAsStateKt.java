/*     */ package androidx.compose.animation.core;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000f\n\000\n\002\030\002\n\002\020\007\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\003\n\002\020\016\n\002\b\035\n\002\030\002\n\000\n\002\030\002\n\002\b\005\032H\020\021\032\b\022\004\022\0020\0040\0222\006\020\023\032\0020\0042\016\b\002\020\024\032\b\022\004\022\0020\0040\0252\026\b\002\020\026\032\020\022\004\022\0020\004\022\004\022\0020\030\030\0010\027H\007ø\001\000¢\006\004\b\031\020\032\032R\020\021\032\b\022\004\022\0020\0040\0222\006\020\023\032\0020\0042\016\b\002\020\024\032\b\022\004\022\0020\0040\0252\b\b\002\020\033\032\0020\0342\026\b\002\020\026\032\020\022\004\022\0020\004\022\004\022\0020\030\030\0010\027H\007ø\001\000¢\006\004\b\035\020\036\032M\020\037\032\b\022\004\022\0020\0020\0222\006\020\023\032\0020\0022\016\b\002\020\024\032\b\022\004\022\0020\0020\0252\b\b\002\020 \032\0020\0022\026\b\002\020\026\032\020\022\004\022\0020\002\022\004\022\0020\030\030\0010\027H\007¢\006\002\020!\032W\020\037\032\b\022\004\022\0020\0020\0222\006\020\023\032\0020\0022\016\b\002\020\024\032\b\022\004\022\0020\0020\0252\b\b\002\020 \032\0020\0022\b\b\002\020\033\032\0020\0342\026\b\002\020\026\032\020\022\004\022\0020\002\022\004\022\0020\030\030\0010\027H\007¢\006\002\020\"\032C\020#\032\b\022\004\022\0020\0060\0222\006\020\023\032\0020\0062\016\b\002\020\024\032\b\022\004\022\0020\0060\0252\026\b\002\020\026\032\020\022\004\022\0020\006\022\004\022\0020\030\030\0010\027H\007¢\006\002\020$\032M\020#\032\b\022\004\022\0020\0060\0222\006\020\023\032\0020\0062\016\b\002\020\024\032\b\022\004\022\0020\0060\0252\b\b\002\020\033\032\0020\0342\026\b\002\020\026\032\020\022\004\022\0020\006\022\004\022\0020\030\030\0010\027H\007¢\006\002\020%\032H\020&\032\b\022\004\022\0020\b0\0222\006\020\023\032\0020\b2\016\b\002\020\024\032\b\022\004\022\0020\b0\0252\026\b\002\020\026\032\020\022\004\022\0020\b\022\004\022\0020\030\030\0010\027H\007ø\001\000¢\006\004\b'\020(\032R\020&\032\b\022\004\022\0020\b0\0222\006\020\023\032\0020\b2\016\b\002\020\024\032\b\022\004\022\0020\b0\0252\b\b\002\020\033\032\0020\0342\026\b\002\020\026\032\020\022\004\022\0020\b\022\004\022\0020\030\030\0010\027H\007ø\001\000¢\006\004\b)\020*\032H\020+\032\b\022\004\022\0020\n0\0222\006\020\023\032\0020\n2\016\b\002\020\024\032\b\022\004\022\0020\n0\0252\026\b\002\020\026\032\020\022\004\022\0020\n\022\004\022\0020\030\030\0010\027H\007ø\001\000¢\006\004\b,\020(\032R\020+\032\b\022\004\022\0020\n0\0222\006\020\023\032\0020\n2\016\b\002\020\024\032\b\022\004\022\0020\n0\0252\b\b\002\020\033\032\0020\0342\026\b\002\020\026\032\020\022\004\022\0020\n\022\004\022\0020\030\030\0010\027H\007ø\001\000¢\006\004\b-\020*\032H\020.\032\b\022\004\022\0020\f0\0222\006\020\023\032\0020\f2\016\b\002\020\024\032\b\022\004\022\0020\f0\0252\026\b\002\020\026\032\020\022\004\022\0020\f\022\004\022\0020\030\030\0010\027H\007ø\001\000¢\006\004\b/\020(\032R\020.\032\b\022\004\022\0020\f0\0222\006\020\023\032\0020\f2\016\b\002\020\024\032\b\022\004\022\0020\f0\0252\b\b\002\020\033\032\0020\0342\026\b\002\020\026\032\020\022\004\022\0020\f\022\004\022\0020\030\030\0010\027H\007ø\001\000¢\006\004\b0\020*\032C\0201\032\b\022\004\022\0020\0160\0222\006\020\023\032\0020\0162\016\b\002\020\024\032\b\022\004\022\0020\0160\0252\026\b\002\020\026\032\020\022\004\022\0020\016\022\004\022\0020\030\030\0010\027H\007¢\006\002\0202\032M\0201\032\b\022\004\022\0020\0160\0222\006\020\023\032\0020\0162\016\b\002\020\024\032\b\022\004\022\0020\0160\0252\b\b\002\020\033\032\0020\0342\026\b\002\020\026\032\020\022\004\022\0020\016\022\004\022\0020\030\030\0010\027H\007¢\006\002\0203\032H\0204\032\b\022\004\022\0020\0200\0222\006\020\023\032\0020\0202\016\b\002\020\024\032\b\022\004\022\0020\0200\0252\026\b\002\020\026\032\020\022\004\022\0020\020\022\004\022\0020\030\030\0010\027H\007ø\001\000¢\006\004\b5\020(\032R\0204\032\b\022\004\022\0020\0200\0222\006\020\023\032\0020\0202\016\b\002\020\024\032\b\022\004\022\0020\0200\0252\b\b\002\020\033\032\0020\0342\026\b\002\020\026\032\020\022\004\022\0020\020\022\004\022\0020\030\030\0010\027H\007ø\001\000¢\006\004\b6\020*\032s\0207\032\b\022\004\022\002H80\022\"\004\b\000\0208\"\b\b\001\0209*\0020:2\006\020\023\032\002H82\022\020;\032\016\022\004\022\002H8\022\004\022\002H90<2\016\b\002\020\024\032\b\022\004\022\002H80\0252\n\b\002\020 \032\004\030\001H82\026\b\002\020\026\032\020\022\004\022\002H8\022\004\022\0020\030\030\0010\027H\007¢\006\002\020=\032}\0207\032\b\022\004\022\002H80\022\"\004\b\000\0208\"\b\b\001\0209*\0020:2\006\020\023\032\002H82\022\020;\032\016\022\004\022\002H8\022\004\022\002H90<2\016\b\002\020\024\032\b\022\004\022\002H80\0252\n\b\002\020 \032\004\030\001H82\b\b\002\020\033\032\0020\0342\026\b\002\020\026\032\020\022\004\022\002H8\022\004\022\0020\030\030\0010\027H\007¢\006\002\020>\"\024\020\000\032\b\022\004\022\0020\0020\001X\004¢\006\002\n\000\"\024\020\003\032\b\022\004\022\0020\0040\001X\004¢\006\002\n\000\"\024\020\005\032\b\022\004\022\0020\0060\001X\004¢\006\002\n\000\"\024\020\007\032\b\022\004\022\0020\b0\001X\004¢\006\002\n\000\"\024\020\t\032\b\022\004\022\0020\n0\001X\004¢\006\002\n\000\"\024\020\013\032\b\022\004\022\0020\f0\001X\004¢\006\002\n\000\"\024\020\r\032\b\022\004\022\0020\0160\001X\004¢\006\002\n\000\"\024\020\017\032\b\022\004\022\0020\0200\001X\004¢\006\002\n\000\002\007\n\005\b¡\0360\001¨\006?²\006(\020@\032\020\022\004\022\002H8\022\004\022\0020\030\030\0010\027\"\004\b\000\0208\"\b\b\001\0209*\0020:X\002²\006 \020A\032\b\022\004\022\002H80\025\"\004\b\000\0208\"\b\b\001\0209*\0020:X\002"}, d2 = {"defaultAnimation", "Landroidx/compose/animation/core/SpringSpec;", "", "dpDefaultSpring", "Landroidx/compose/ui/unit/Dp;", "intDefaultSpring", "", "intOffsetDefaultSpring", "Landroidx/compose/ui/unit/IntOffset;", "intSizeDefaultSpring", "Landroidx/compose/ui/unit/IntSize;", "offsetDefaultSpring", "Landroidx/compose/ui/geometry/Offset;", "rectDefaultSpring", "Landroidx/compose/ui/geometry/Rect;", "sizeDefaultSpring", "Landroidx/compose/ui/geometry/Size;", "animateDpAsState", "Landroidx/compose/runtime/State;", "targetValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "finishedListener", "Lkotlin/Function1;", "", "animateDpAsState-Kz89ssw", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "label", "", "animateDpAsState-AjpBEmI", "(FLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateFloatAsState", "visibilityThreshold", "(FLandroidx/compose/animation/core/AnimationSpec;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntAsState", "(ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(ILandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntOffsetAsState", "animateIntOffsetAsState-8f6pmRE", "(JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntOffsetAsState-HyPO7BM", "(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntSizeAsState", "animateIntSizeAsState-zTRF_AQ", "animateIntSizeAsState-4goxYXU", "animateOffsetAsState", "animateOffsetAsState-N6fFfp4", "animateOffsetAsState-7362WCg", "animateRectAsState", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateSizeAsState", "animateSizeAsState-LjSzlW0", "animateSizeAsState-YLp_XPw", "animateValueAsState", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation-core", "listener", "animSpec"})
/*     */ @SourceDebugExtension({"SMAP\nAnimateAsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,584:1\n1225#2,6:585\n1225#2,6:591\n1225#2,6:597\n1225#2,6:603\n1225#2,6:609\n1225#2,6:615\n1225#2,6:621\n1225#2,6:627\n81#3:633\n81#3:634\n*S KotlinDebug\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n*L\n72#1:585,6\n394#1:591,6\n400#1:597,6\n401#1:603,6\n414#1:609,6\n415#1:615,6\n418#1:621,6\n573#1:627,6\n402#1:633\n403#1:634\n*E\n"})
/*     */ public final class AnimateAsStateKt {
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final State<Dp> animateDpAsState-AjpBEmI(float targetValue, @Nullable AnimationSpec<Dp> animationSpec, @Nullable String label, @Nullable Function1<? super Dp, Unit> finishedListener, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     ComposerKt.sourceInformationMarkerStart($composer, -1407150062, "C(animateDpAsState)P(3:c#ui.unit.Dp!1,2)114@5081L165:AnimateAsState.kt#pdpnli");
/*     */     if ((paramInt1 & 0x2) != 0)
/*     */       animationSpec = dpDefaultSpring; 
/*     */     if ((paramInt1 & 0x4) != 0)
/*     */       label = "DpAnimation"; 
/*     */     if ((paramInt1 & 0x8) != 0)
/*     */       finishedListener = null; 
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(-1407150062, $changed, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)"); 
/*     */     State<Dp> state = animateValueAsState(Dp.box-impl(targetValue), VectorConvertersKt.getVectorConverter(Dp.Companion), animationSpec, null, label, finishedListener, $composer, 0xE & $changed | 0x380 & $changed << 3 | 0xE000 & $changed << 6 | 0x70000 & $changed << 6, 8);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return state;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final SpringSpec<Dp> dpDefaultSpring = AnimationSpecKt.spring$default(0.0F, 0.0F, Dp.box-impl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.Companion)), 3, null);
/*     */   @NotNull
/*  36 */   private static final SpringSpec<Float> defaultAnimation = AnimationSpecKt.spring$default(0.0F, 0.0F, null, 7, null);
/*     */   @Composable @NotNull public static final State<Size> animateSizeAsState-YLp_XPw(long targetValue, @Nullable AnimationSpec<Size> animationSpec, @Nullable String label, @Nullable Function1<? super Size, Unit> finishedListener, @Nullable Composer $composer, int $changed, int paramInt1) { ComposerKt.sourceInformationMarkerStart($composer, 1374633148, "C(animateSizeAsState)P(3:c#ui.geometry.Size!1,2)155@6928L167:AnimateAsState.kt#pdpnli"); if ((paramInt1 & 0x2) != 0)
/*     */       animationSpec = sizeDefaultSpring;  if ((paramInt1 & 0x4) != 0)
/*     */       label = "SizeAnimation";  if ((paramInt1 & 0x8) != 0)
/*     */       finishedListener = null;  if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(1374633148, $changed, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:154)");  State<Size> state = animateValueAsState(Size.box-impl(targetValue), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec, null, label, finishedListener, $composer, 0xE & $changed | 0x380 & $changed << 3 | 0xE000 & $changed << 6 | 0x70000 & $changed << 6, 8); if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); return state; }
/*     */   @NotNull private static final SpringSpec<Size> sizeDefaultSpring = AnimationSpecKt.spring$default(0.0F, 0.0F, Size.box-impl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);
/*     */   @Composable @NotNull public static final State<Offset> animateOffsetAsState-7362WCg(long targetValue, @Nullable AnimationSpec<Offset> animationSpec, @Nullable String label, @Nullable Function1<? super Offset, Unit> finishedListener, @Nullable Composer $composer, int $changed, int paramInt1) { ComposerKt.sourceInformationMarkerStart($composer, 357896800, "C(animateOffsetAsState)P(3:c#ui.geometry.Offset!1,2)195@8761L169:AnimateAsState.kt#pdpnli"); if ((paramInt1 & 0x2) != 0)
/*     */       animationSpec = offsetDefaultSpring;  if ((paramInt1 & 0x4) != 0)
/*     */       label = "OffsetAnimation"; 
/*     */     if ((paramInt1 & 0x8) != 0)
/*     */       finishedListener = null; 
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(357896800, $changed, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:194)"); 
/*     */     State<Offset> state = animateValueAsState(Offset.box-impl(targetValue), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec, null, label, finishedListener, $composer, 0xE & $changed | 0x380 & $changed << 3 | 0xE000 & $changed << 6 | 0x70000 & $changed << 6, 8);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return state; } @NotNull private static final SpringSpec<Offset> offsetDefaultSpring = AnimationSpecKt.spring$default(0.0F, 0.0F, Offset.box-impl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null); @Composable @NotNull public static final State<Rect> animateRectAsState(@NotNull Rect targetValue, @Nullable AnimationSpec<Rect> animationSpec, @Nullable String label, @Nullable Function1<? super Rect, Unit> finishedListener, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter(targetValue, "targetValue");
/*     */     ComposerKt.sourceInformationMarkerStart($composer, 536062978, "C(animateRectAsState)P(3!1,2)236@10633L167:AnimateAsState.kt#pdpnli");
/*     */     if ((paramInt1 & 0x2) != 0)
/*     */       animationSpec = rectDefaultSpring; 
/*     */     if ((paramInt1 & 0x4) != 0)
/*     */       label = "RectAnimation"; 
/*     */     if ((paramInt1 & 0x8) != 0)
/*     */       finishedListener = null; 
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(536062978, $changed, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:235)"); 
/*     */     State<Rect> state = animateValueAsState(targetValue, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec, null, label, finishedListener, $composer, 0xE & $changed | 0x380 & $changed << 3 | 0xE000 & $changed << 6 | 0x70000 & $changed << 6, 8);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*  69 */     return state; } @NotNull private static final SpringSpec<Rect> rectDefaultSpring = AnimationSpecKt.spring$default(0.0F, 0.0F, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null); @Composable @NotNull public static final State<Float> animateFloatAsState(float targetValue, @Nullable AnimationSpec<Float> animationSpec, float visibilityThreshold, @Nullable String label, @Nullable Function1 finishedListener, @Nullable Composer $composer, int $changed, int paramInt1) { ComposerKt.sourceInformationMarkerStart($composer, 668842840, "C(animateFloatAsState)P(3!1,4,2)75@3368L173:AnimateAsState.kt#pdpnli"); if ((paramInt1 & 0x2) != 0) animationSpec = defaultAnimation;  if ((paramInt1 & 0x4) != 0) visibilityThreshold = 0.01F;  if ((paramInt1 & 0x8) != 0) label = "FloatAnimation";  if ((paramInt1 & 0x10) != 0) finishedListener = null;  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(668842840, $changed, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");  $composer.startReplaceGroup(313403102); ComposerKt.sourceInformation($composer, "71@3220L83");
/*     */     
/*  71 */     if (animationSpec == defaultAnimation) {
/*  72 */       ComposerKt.sourceInformationMarkerStart($composer, 313404723, "CC(remember):AnimateAsState.kt#9igjgp"); Composer composer = $composer; boolean invalid$iv = ((($changed & 0x380 ^ 0x180) > 256 && $composer.changed(visibilityThreshold)) || ($changed & 0x180) == 256); int $i$f$cache = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 585 */       Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 586 */       if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/* 587 */         int $i$a$-cache-AnimateAsStateKt$animateFloatAsState$resolvedAnimSpec$1 = 0; Object value$iv = AnimationSpecKt.spring$default(0.0F, 0.0F, Float.valueOf(visibilityThreshold), 3, null);
/* 588 */         composer.updateRememberedValue(value$iv);
/*     */       } 
/*     */     } else {
/*     */       AnimationSpec<Float> animationSpec1 = animationSpec; $composer.endReplaceGroup();
/*     */     }  SpringSpec springSpec = (SpringSpec)animationSpec1; ComposerKt.sourceInformationMarkerEnd($composer); } @Composable @NotNull public static final State<Integer> animateIntAsState(int targetValue, @Nullable AnimationSpec<Integer> animationSpec, @Nullable String label, @Nullable Function1<? super Integer, Unit> finishedListener, @Nullable Composer $composer, int $changed, int paramInt1) { ComposerKt.sourceInformationMarkerStart($composer, 428074472, "C(animateIntAsState)P(3!1,2)274@12363L166:AnimateAsState.kt#pdpnli"); if ((paramInt1 & 0x2) != 0)
/*     */       animationSpec = intDefaultSpring;  if ((paramInt1 & 0x4) != 0)
/*     */       label = "IntAnimation";  if ((paramInt1 & 0x8) != 0)
/*     */       finishedListener = null;  if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(428074472, $changed, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:273)");  State<Integer> state = animateValueAsState(Integer.valueOf(targetValue), VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), animationSpec, null, label, finishedListener, $composer, 0xE & $changed | 0x380 & $changed << 3 | 0xE000 & $changed << 6 | 0x70000 & $changed << 6, 8); if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return state; } @NotNull private static final SpringSpec<Integer> intDefaultSpring = AnimationSpecKt.spring$default(0.0F, 0.0F, Integer.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(IntCompanionObject.INSTANCE)), 3, null); @Composable @NotNull public static final State<IntOffset> animateIntOffsetAsState-HyPO7BM(long targetValue, @Nullable AnimationSpec<IntOffset> animationSpec, @Nullable String label, @Nullable Function1<? super IntOffset, Unit> finishedListener, @Nullable Composer $composer, int $changed, int paramInt1) { ComposerKt.sourceInformationMarkerStart($composer, -696782904, "C(animateIntOffsetAsState)P(3:c#ui.unit.IntOffset!1,2)314@14224L172:AnimateAsState.kt#pdpnli");
/*     */     if ((paramInt1 & 0x2) != 0)
/*     */       animationSpec = intOffsetDefaultSpring; 
/*     */     if ((paramInt1 & 0x4) != 0)
/*     */       label = "IntOffsetAnimation"; 
/*     */     if ((paramInt1 & 0x8) != 0)
/*     */       finishedListener = null; 
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(-696782904, $changed, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:313)"); 
/*     */     State<IntOffset> state = animateValueAsState(IntOffset.box-impl(targetValue), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec, null, label, finishedListener, $composer, 0xE & $changed | 0x380 & $changed << 3 | 0xE000 & $changed << 6 | 0x70000 & $changed << 6, 8);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return state; } @NotNull private static final SpringSpec<IntOffset> intOffsetDefaultSpring = AnimationSpecKt.spring$default(0.0F, 0.0F, IntOffset.box-impl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
/*     */   @Composable @NotNull public static final State<IntSize> animateIntSizeAsState-4goxYXU(long targetValue, @Nullable AnimationSpec<IntSize> animationSpec, @Nullable String label, @Nullable Function1<? super IntSize, Unit> finishedListener, @Nullable Composer $composer, int $changed, int paramInt1) { ComposerKt.sourceInformationMarkerStart($composer, 582576328, "C(animateIntSizeAsState)P(3:c#ui.unit.IntSize!1,2)352@16009L170:AnimateAsState.kt#pdpnli");
/*     */     if ((paramInt1 & 0x2) != 0)
/*     */       animationSpec = intSizeDefaultSpring; 
/*     */     if ((paramInt1 & 0x4) != 0)
/*     */       label = "IntSizeAnimation"; 
/*     */     if ((paramInt1 & 0x8) != 0)
/*     */       finishedListener = null; 
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(582576328, $changed, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:351)"); 
/*     */     State<IntSize> state = animateValueAsState(IntSize.box-impl(targetValue), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec, null, label, finishedListener, $composer, 0xE & $changed | 0x380 & $changed << 3 | 0xE000 & $changed << 6 | 0x70000 & $changed << 6, 8);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return state; }
/*     */   @NotNull private static final SpringSpec<IntSize> intSizeDefaultSpring = AnimationSpecKt.spring$default(0.0F, 0.0F, IntSize.box-impl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 3, null);
/*     */   @Composable @NotNull public static final <T, V extends AnimationVector> State<T> animateValueAsState(Object targetValue, @NotNull TwoWayConverter typeConverter, @Nullable AnimationSpec animationSpec, @Nullable Object visibilityThreshold, @Nullable String label, @Nullable Function1 finishedListener, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'typeConverter'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #6
/*     */     //   9: ldc_w -1994373980
/*     */     //   12: ldc_w 'C(animateValueAsState)P(3,4!1,5,2)393@18031L21,399@18213L44,400@18279L79,401@18379L38,402@18456L339,413@18814L42,414@18872L44,414@18861L55,417@18945L697,417@18921L721:AnimateAsState.kt#pdpnli'
/*     */     //   15: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   18: iload #8
/*     */     //   20: iconst_4
/*     */     //   21: iand
/*     */     //   22: ifeq -> 117
/*     */     //   25: aload #6
/*     */     //   27: ldc_w 728506592
/*     */     //   30: ldc 'CC(remember):AnimateAsState.kt#9igjgp'
/*     */     //   32: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   35: aload #6
/*     */     //   37: astore #10
/*     */     //   39: iconst_0
/*     */     //   40: istore #11
/*     */     //   42: iconst_0
/*     */     //   43: istore #12
/*     */     //   45: aload #10
/*     */     //   47: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   52: astore #13
/*     */     //   54: iconst_0
/*     */     //   55: istore #14
/*     */     //   57: aload #13
/*     */     //   59: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   62: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   65: if_acmpne -> 96
/*     */     //   68: iconst_0
/*     */     //   69: istore #15
/*     */     //   71: fconst_0
/*     */     //   72: fconst_0
/*     */     //   73: aconst_null
/*     */     //   74: bipush #7
/*     */     //   76: aconst_null
/*     */     //   77: invokestatic spring$default : (FFLjava/lang/Object;ILjava/lang/Object;)Landroidx/compose/animation/core/SpringSpec;
/*     */     //   80: astore #15
/*     */     //   82: aload #10
/*     */     //   84: aload #15
/*     */     //   86: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   91: aload #15
/*     */     //   93: goto -> 98
/*     */     //   96: aload #13
/*     */     //   98: nop
/*     */     //   99: nop
/*     */     //   100: nop
/*     */     //   101: checkcast androidx/compose/animation/core/SpringSpec
/*     */     //   104: astore #9
/*     */     //   106: aload #6
/*     */     //   108: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   111: aload #9
/*     */     //   113: checkcast androidx/compose/animation/core/AnimationSpec
/*     */     //   116: astore_2
/*     */     //   117: iload #8
/*     */     //   119: bipush #8
/*     */     //   121: iand
/*     */     //   122: ifeq -> 127
/*     */     //   125: aconst_null
/*     */     //   126: astore_3
/*     */     //   127: iload #8
/*     */     //   129: bipush #16
/*     */     //   131: iand
/*     */     //   132: ifeq -> 140
/*     */     //   135: ldc_w 'ValueAnimation'
/*     */     //   138: astore #4
/*     */     //   140: iload #8
/*     */     //   142: bipush #32
/*     */     //   144: iand
/*     */     //   145: ifeq -> 151
/*     */     //   148: aconst_null
/*     */     //   149: astore #5
/*     */     //   151: invokestatic isTraceInProgress : ()Z
/*     */     //   154: ifeq -> 169
/*     */     //   157: ldc_w -1994373980
/*     */     //   160: iload #7
/*     */     //   162: iconst_m1
/*     */     //   163: ldc_w 'androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)'
/*     */     //   166: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   169: aload #6
/*     */     //   171: ldc_w 728512439
/*     */     //   174: ldc 'CC(remember):AnimateAsState.kt#9igjgp'
/*     */     //   176: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   179: aload #6
/*     */     //   181: astore #11
/*     */     //   183: iconst_0
/*     */     //   184: istore #12
/*     */     //   186: iconst_0
/*     */     //   187: istore #13
/*     */     //   189: aload #11
/*     */     //   191: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   196: astore #14
/*     */     //   198: iconst_0
/*     */     //   199: istore #15
/*     */     //   201: aload #14
/*     */     //   203: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   206: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   209: if_acmpne -> 238
/*     */     //   212: iconst_0
/*     */     //   213: istore #16
/*     */     //   215: aconst_null
/*     */     //   216: aconst_null
/*     */     //   217: iconst_2
/*     */     //   218: aconst_null
/*     */     //   219: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   222: astore #16
/*     */     //   224: aload #11
/*     */     //   226: aload #16
/*     */     //   228: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   233: aload #16
/*     */     //   235: goto -> 240
/*     */     //   238: aload #14
/*     */     //   240: nop
/*     */     //   241: nop
/*     */     //   242: nop
/*     */     //   243: checkcast androidx/compose/runtime/MutableState
/*     */     //   246: astore #10
/*     */     //   248: aload #6
/*     */     //   250: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   253: aload #10
/*     */     //   255: astore #9
/*     */     //   257: aload #6
/*     */     //   259: ldc_w 728514586
/*     */     //   262: ldc 'CC(remember):AnimateAsState.kt#9igjgp'
/*     */     //   264: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   267: aload #6
/*     */     //   269: astore #12
/*     */     //   271: iconst_0
/*     */     //   272: istore #13
/*     */     //   274: iconst_0
/*     */     //   275: istore #14
/*     */     //   277: aload #12
/*     */     //   279: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   284: astore #15
/*     */     //   286: iconst_0
/*     */     //   287: istore #16
/*     */     //   289: aload #15
/*     */     //   291: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   294: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   297: if_acmpne -> 331
/*     */     //   300: iconst_0
/*     */     //   301: istore #17
/*     */     //   303: new androidx/compose/animation/core/Animatable
/*     */     //   306: dup
/*     */     //   307: aload_0
/*     */     //   308: aload_1
/*     */     //   309: aload_3
/*     */     //   310: aload #4
/*     */     //   312: invokespecial <init> : (Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   315: astore #18
/*     */     //   317: aload #12
/*     */     //   319: aload #18
/*     */     //   321: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   326: aload #18
/*     */     //   328: goto -> 333
/*     */     //   331: aload #15
/*     */     //   333: nop
/*     */     //   334: nop
/*     */     //   335: nop
/*     */     //   336: checkcast androidx/compose/animation/core/Animatable
/*     */     //   339: astore #11
/*     */     //   341: aload #6
/*     */     //   343: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   346: aload #11
/*     */     //   348: astore #10
/*     */     //   350: aload #5
/*     */     //   352: aload #6
/*     */     //   354: bipush #14
/*     */     //   356: iload #7
/*     */     //   358: bipush #15
/*     */     //   360: ishr
/*     */     //   361: iand
/*     */     //   362: invokestatic rememberUpdatedState : (Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   365: astore #11
/*     */     //   367: aload_2
/*     */     //   368: astore #14
/*     */     //   370: iconst_0
/*     */     //   371: istore #15
/*     */     //   373: aload_3
/*     */     //   374: ifnull -> 426
/*     */     //   377: aload #14
/*     */     //   379: instanceof androidx/compose/animation/core/SpringSpec
/*     */     //   382: ifeq -> 426
/*     */     //   385: aload #14
/*     */     //   387: checkcast androidx/compose/animation/core/SpringSpec
/*     */     //   390: invokevirtual getVisibilityThreshold : ()Ljava/lang/Object;
/*     */     //   393: aload_3
/*     */     //   394: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   397: ifne -> 426
/*     */     //   400: aload #14
/*     */     //   402: checkcast androidx/compose/animation/core/SpringSpec
/*     */     //   405: invokevirtual getDampingRatio : ()F
/*     */     //   408: aload #14
/*     */     //   410: checkcast androidx/compose/animation/core/SpringSpec
/*     */     //   413: invokevirtual getStiffness : ()F
/*     */     //   416: aload_3
/*     */     //   417: invokestatic spring : (FFLjava/lang/Object;)Landroidx/compose/animation/core/SpringSpec;
/*     */     //   420: checkcast androidx/compose/animation/core/AnimationSpec
/*     */     //   423: goto -> 428
/*     */     //   426: aload #14
/*     */     //   428: nop
/*     */     //   429: aload #6
/*     */     //   431: iconst_0
/*     */     //   432: invokestatic rememberUpdatedState : (Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   435: astore #12
/*     */     //   437: aload #6
/*     */     //   439: ldc_w 728531669
/*     */     //   442: ldc 'CC(remember):AnimateAsState.kt#9igjgp'
/*     */     //   444: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   447: aload #6
/*     */     //   449: astore #15
/*     */     //   451: iconst_0
/*     */     //   452: istore #16
/*     */     //   454: iconst_0
/*     */     //   455: istore #17
/*     */     //   457: aload #15
/*     */     //   459: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   464: astore #18
/*     */     //   466: iconst_0
/*     */     //   467: istore #19
/*     */     //   469: aload #18
/*     */     //   471: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   474: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   477: if_acmpne -> 508
/*     */     //   480: iconst_0
/*     */     //   481: istore #20
/*     */     //   483: iconst_m1
/*     */     //   484: aconst_null
/*     */     //   485: aconst_null
/*     */     //   486: bipush #6
/*     */     //   488: aconst_null
/*     */     //   489: invokestatic Channel$default : (ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/Channel;
/*     */     //   492: astore #20
/*     */     //   494: aload #15
/*     */     //   496: aload #20
/*     */     //   498: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   503: aload #20
/*     */     //   505: goto -> 510
/*     */     //   508: aload #18
/*     */     //   510: nop
/*     */     //   511: nop
/*     */     //   512: nop
/*     */     //   513: checkcast kotlinx/coroutines/channels/Channel
/*     */     //   516: astore #14
/*     */     //   518: aload #6
/*     */     //   520: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   523: aload #14
/*     */     //   525: astore #13
/*     */     //   527: aload #6
/*     */     //   529: ldc_w 728533527
/*     */     //   532: ldc 'CC(remember):AnimateAsState.kt#9igjgp'
/*     */     //   534: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   537: aload #6
/*     */     //   539: astore #15
/*     */     //   541: aload #6
/*     */     //   543: aload #13
/*     */     //   545: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   550: iload #7
/*     */     //   552: bipush #14
/*     */     //   554: iand
/*     */     //   555: bipush #6
/*     */     //   557: ixor
/*     */     //   558: iconst_4
/*     */     //   559: if_icmple -> 573
/*     */     //   562: aload #6
/*     */     //   564: aload_0
/*     */     //   565: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   570: ifne -> 582
/*     */     //   573: iload #7
/*     */     //   575: bipush #6
/*     */     //   577: iand
/*     */     //   578: iconst_4
/*     */     //   579: if_icmpne -> 586
/*     */     //   582: iconst_1
/*     */     //   583: goto -> 587
/*     */     //   586: iconst_0
/*     */     //   587: ior
/*     */     //   588: istore #16
/*     */     //   590: iconst_0
/*     */     //   591: istore #17
/*     */     //   593: aload #15
/*     */     //   595: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   600: astore #18
/*     */     //   602: iconst_0
/*     */     //   603: istore #19
/*     */     //   605: iload #16
/*     */     //   607: ifne -> 621
/*     */     //   610: aload #18
/*     */     //   612: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   615: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   618: if_acmpne -> 653
/*     */     //   621: iconst_0
/*     */     //   622: istore #20
/*     */     //   624: new androidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$2$1
/*     */     //   627: dup
/*     */     //   628: aload #13
/*     */     //   630: aload_0
/*     */     //   631: invokespecial <init> : (Lkotlinx/coroutines/channels/Channel;Ljava/lang/Object;)V
/*     */     //   634: checkcast kotlin/jvm/functions/Function0
/*     */     //   637: astore #21
/*     */     //   639: aload #15
/*     */     //   641: aload #21
/*     */     //   643: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   648: aload #21
/*     */     //   650: goto -> 655
/*     */     //   653: aload #18
/*     */     //   655: nop
/*     */     //   656: nop
/*     */     //   657: nop
/*     */     //   658: checkcast kotlin/jvm/functions/Function0
/*     */     //   661: astore #14
/*     */     //   663: aload #6
/*     */     //   665: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   668: aload #14
/*     */     //   670: aload #6
/*     */     //   672: iconst_0
/*     */     //   673: invokestatic SideEffect : (Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */     //   676: aload #13
/*     */     //   678: aload #6
/*     */     //   680: ldc_w 728536516
/*     */     //   683: ldc 'CC(remember):AnimateAsState.kt#9igjgp'
/*     */     //   685: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   688: aload #6
/*     */     //   690: astore #15
/*     */     //   692: aload #6
/*     */     //   694: aload #13
/*     */     //   696: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   701: aload #6
/*     */     //   703: aload #10
/*     */     //   705: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   710: ior
/*     */     //   711: aload #6
/*     */     //   713: aload #12
/*     */     //   715: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   720: ior
/*     */     //   721: aload #6
/*     */     //   723: aload #11
/*     */     //   725: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   730: ior
/*     */     //   731: istore #16
/*     */     //   733: iconst_0
/*     */     //   734: istore #17
/*     */     //   736: aload #15
/*     */     //   738: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   743: astore #18
/*     */     //   745: iconst_0
/*     */     //   746: istore #19
/*     */     //   748: iload #16
/*     */     //   750: ifne -> 764
/*     */     //   753: aload #18
/*     */     //   755: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   758: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   761: if_acmpne -> 807
/*     */     //   764: astore #22
/*     */     //   766: iconst_0
/*     */     //   767: istore #20
/*     */     //   769: new androidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3$1
/*     */     //   772: dup
/*     */     //   773: aload #13
/*     */     //   775: aload #10
/*     */     //   777: aload #12
/*     */     //   779: aload #11
/*     */     //   781: aconst_null
/*     */     //   782: invokespecial <init> : (Lkotlinx/coroutines/channels/Channel;Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)V
/*     */     //   785: checkcast kotlin/jvm/functions/Function2
/*     */     //   788: aload #22
/*     */     //   790: swap
/*     */     //   791: astore #21
/*     */     //   793: aload #15
/*     */     //   795: aload #21
/*     */     //   797: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   802: aload #21
/*     */     //   804: goto -> 809
/*     */     //   807: aload #18
/*     */     //   809: nop
/*     */     //   810: nop
/*     */     //   811: nop
/*     */     //   812: checkcast kotlin/jvm/functions/Function2
/*     */     //   815: astore #14
/*     */     //   817: aload #6
/*     */     //   819: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   822: aload #14
/*     */     //   824: aload #6
/*     */     //   826: iconst_0
/*     */     //   827: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   830: aload #9
/*     */     //   832: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   837: checkcast androidx/compose/runtime/State
/*     */     //   840: dup
/*     */     //   841: ifnonnull -> 850
/*     */     //   844: pop
/*     */     //   845: aload #10
/*     */     //   847: invokevirtual asState : ()Landroidx/compose/runtime/State;
/*     */     //   850: astore #14
/*     */     //   852: invokestatic isTraceInProgress : ()Z
/*     */     //   855: ifeq -> 861
/*     */     //   858: invokestatic traceEventEnd : ()V
/*     */     //   861: aload #6
/*     */     //   863: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   866: aload #14
/*     */     //   868: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #398	-> 15
/*     */     //   #394	-> 25
/*     */     //   #591	-> 45
/*     */     //   #592	-> 57
/*     */     //   #593	-> 68
/*     */     //   #394	-> 71
/*     */     //   #593	-> 80
/*     */     //   #594	-> 82
/*     */     //   #595	-> 91
/*     */     //   #596	-> 96
/*     */     //   #592	-> 98
/*     */     //   #591	-> 99
/*     */     //   #591	-> 100
/*     */     //   #394	-> 101
/*     */     //   #395	-> 125
/*     */     //   #396	-> 135
/*     */     //   #397	-> 148
/*     */     //   #398	-> 166
/*     */     //   #400	-> 176
/*     */     //   #597	-> 189
/*     */     //   #598	-> 201
/*     */     //   #599	-> 212
/*     */     //   #400	-> 215
/*     */     //   #599	-> 222
/*     */     //   #600	-> 224
/*     */     //   #601	-> 233
/*     */     //   #602	-> 238
/*     */     //   #598	-> 240
/*     */     //   #597	-> 241
/*     */     //   #597	-> 242
/*     */     //   #400	-> 243
/*     */     //   #401	-> 264
/*     */     //   #603	-> 277
/*     */     //   #604	-> 289
/*     */     //   #605	-> 300
/*     */     //   #401	-> 303
/*     */     //   #605	-> 315
/*     */     //   #606	-> 317
/*     */     //   #607	-> 326
/*     */     //   #608	-> 331
/*     */     //   #604	-> 333
/*     */     //   #603	-> 334
/*     */     //   #603	-> 335
/*     */     //   #401	-> 336
/*     */     //   #402	-> 350
/*     */     //   #404	-> 367
/*     */     //   #405	-> 373
/*     */     //   #406	-> 385
/*     */     //   #408	-> 400
/*     */     //   #410	-> 426
/*     */     //   #405	-> 428
/*     */     //   #404	-> 429
/*     */     //   #403	-> 432
/*     */     //   #414	-> 444
/*     */     //   #609	-> 457
/*     */     //   #610	-> 469
/*     */     //   #611	-> 480
/*     */     //   #414	-> 483
/*     */     //   #611	-> 492
/*     */     //   #612	-> 494
/*     */     //   #613	-> 503
/*     */     //   #614	-> 508
/*     */     //   #610	-> 510
/*     */     //   #609	-> 511
/*     */     //   #609	-> 512
/*     */     //   #414	-> 513
/*     */     //   #415	-> 534
/*     */     //   #615	-> 593
/*     */     //   #616	-> 605
/*     */     //   #617	-> 621
/*     */     //   #415	-> 624
/*     */     //   #617	-> 637
/*     */     //   #618	-> 639
/*     */     //   #619	-> 648
/*     */     //   #620	-> 653
/*     */     //   #616	-> 655
/*     */     //   #615	-> 656
/*     */     //   #615	-> 657
/*     */     //   #415	-> 658
/*     */     //   #418	-> 676
/*     */     //   #621	-> 736
/*     */     //   #622	-> 748
/*     */     //   #623	-> 764
/*     */     //   #418	-> 769
/*     */     //   #623	-> 791
/*     */     //   #624	-> 793
/*     */     //   #625	-> 802
/*     */     //   #626	-> 807
/*     */     //   #622	-> 809
/*     */     //   #621	-> 810
/*     */     //   #621	-> 811
/*     */     //   #418	-> 812
/*     */     //   #434	-> 830
/*     */     //   #398	-> 863
/*     */     //   #434	-> 868
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   71	9	15	$i$a$-cache-AnimateAsStateKt$animateValueAsState$1	I
/*     */     //   82	11	15	value$iv	Ljava/lang/Object;
/*     */     //   57	42	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   54	45	13	it$iv	Ljava/lang/Object;
/*     */     //   45	56	12	$i$f$cache	I
/*     */     //   42	59	10	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   42	59	11	invalid$iv	Z
/*     */     //   215	7	16	$i$a$-cache-AnimateAsStateKt$animateValueAsState$toolingOverride$1	I
/*     */     //   224	11	16	value$iv	Ljava/lang/Object;
/*     */     //   201	40	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   198	43	14	it$iv	Ljava/lang/Object;
/*     */     //   189	54	13	$i$f$cache	I
/*     */     //   186	57	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   186	57	12	invalid$iv	Z
/*     */     //   303	12	17	$i$a$-cache-AnimateAsStateKt$animateValueAsState$animatable$1	I
/*     */     //   317	11	18	value$iv	Ljava/lang/Object;
/*     */     //   289	45	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   286	48	15	it$iv	Ljava/lang/Object;
/*     */     //   277	59	14	$i$f$cache	I
/*     */     //   274	62	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   274	62	13	invalid$iv	Z
/*     */     //   373	56	15	$i$a$-run-AnimateAsStateKt$animateValueAsState$animSpec$2	I
/*     */     //   370	59	14	$this$animateValueAsState_u24lambda_u245	Landroidx/compose/animation/core/AnimationSpec;
/*     */     //   483	9	20	$i$a$-cache-AnimateAsStateKt$animateValueAsState$channel$1	I
/*     */     //   494	11	20	value$iv	Ljava/lang/Object;
/*     */     //   469	42	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   466	45	18	it$iv	Ljava/lang/Object;
/*     */     //   457	56	17	$i$f$cache	I
/*     */     //   454	59	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   454	59	16	invalid$iv	Z
/*     */     //   624	13	20	$i$a$-cache-AnimateAsStateKt$animateValueAsState$2	I
/*     */     //   639	11	21	value$iv	Ljava/lang/Object;
/*     */     //   605	51	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   602	54	18	it$iv	Ljava/lang/Object;
/*     */     //   593	65	17	$i$f$cache	I
/*     */     //   590	68	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   590	68	16	invalid$iv	Z
/*     */     //   769	19	20	$i$a$-cache-AnimateAsStateKt$animateValueAsState$3	I
/*     */     //   793	11	21	value$iv	Ljava/lang/Object;
/*     */     //   748	62	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   745	65	18	it$iv	Ljava/lang/Object;
/*     */     //   736	76	17	$i$f$cache	I
/*     */     //   733	79	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   733	79	16	invalid$iv	Z
/*     */     //   257	612	9	toolingOverride	Landroidx/compose/runtime/MutableState;
/*     */     //   350	519	10	animatable	Landroidx/compose/animation/core/Animatable;
/*     */     //   367	502	11	listener$delegate	Landroidx/compose/runtime/State;
/*     */     //   437	432	12	animSpec$delegate	Landroidx/compose/runtime/State;
/*     */     //   527	342	13	channel	Lkotlinx/coroutines/channels/Channel;
/*     */     //   0	869	0	targetValue	Ljava/lang/Object;
/*     */     //   0	869	1	typeConverter	Landroidx/compose/animation/core/TwoWayConverter;
/*     */     //   0	869	2	animationSpec	Landroidx/compose/animation/core/AnimationSpec;
/*     */     //   0	869	3	visibilityThreshold	Ljava/lang/Object;
/*     */     //   0	869	4	label	Ljava/lang/String;
/*     */     //   0	869	5	finishedListener	Lkotlin/jvm/functions/Function1;
/*     */     //   0	869	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	869	7	$changed	I }
/*     */   private static final <T> Function1<T, Unit> animateValueAsState$lambda$4(State $listener$delegate) { State state = $listener$delegate;
/*     */     Object object = null;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 633 */     return (Function1<T, Unit>)state.getValue(); } private static final <T> AnimationSpec<T> animateValueAsState$lambda$6(State $animSpec$delegate) { State state = $animSpec$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 634 */     return (AnimationSpec<T>)state.getValue(); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\020\000\032\0020\001\"\004\b\000\020\002\"\b\b\001\020\003*\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "invoke"})
/*     */   static final class AnimateAsStateKt$animateValueAsState$2$1 extends Lambda implements Function0<Unit> {
/*     */     public final void invoke() {
/*     */       this.$channel.trySend-JP2dKIU(this.$targetValue);
/*     */     }
/*     */     
/*     */     AnimateAsStateKt$animateValueAsState$2$1(Channel<T> $channel, Object $targetValue) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AnimateAsState.kt", l = {419}, i = {0}, s = {"L$0"}, n = {"$this$LaunchedEffect"}, m = "invokeSuspend", c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002\"\b\b\001\020\003*\0020\004*\0020\005H@"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class AnimateAsStateKt$animateValueAsState$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     AnimateAsStateKt$animateValueAsState$3$1(Channel<T> $channel, Animatable<T, V> $animatable, State<AnimationSpec<T>> $animSpec$delegate, State<Function1<T, Unit>> $listener$delegate, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #6
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 188, 0 -> 32, 1 -> 88
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield L$0 : Ljava/lang/Object;
/*     */       //   40: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   43: astore_2
/*     */       //   44: aload_0
/*     */       //   45: getfield $channel : Lkotlinx/coroutines/channels/Channel;
/*     */       //   48: invokeinterface iterator : ()Lkotlinx/coroutines/channels/ChannelIterator;
/*     */       //   53: astore_3
/*     */       //   54: aload_3
/*     */       //   55: aload_0
/*     */       //   56: checkcast kotlin/coroutines/Continuation
/*     */       //   59: aload_0
/*     */       //   60: aload_2
/*     */       //   61: putfield L$0 : Ljava/lang/Object;
/*     */       //   64: aload_0
/*     */       //   65: aload_3
/*     */       //   66: putfield L$1 : Ljava/lang/Object;
/*     */       //   69: aload_0
/*     */       //   70: iconst_1
/*     */       //   71: putfield label : I
/*     */       //   74: invokeinterface hasNext : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   79: dup
/*     */       //   80: aload #6
/*     */       //   82: if_acmpne -> 109
/*     */       //   85: aload #6
/*     */       //   87: areturn
/*     */       //   88: aload_0
/*     */       //   89: getfield L$1 : Ljava/lang/Object;
/*     */       //   92: checkcast kotlinx/coroutines/channels/ChannelIterator
/*     */       //   95: astore_3
/*     */       //   96: aload_0
/*     */       //   97: getfield L$0 : Ljava/lang/Object;
/*     */       //   100: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   103: astore_2
/*     */       //   104: aload_1
/*     */       //   105: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   108: aload_1
/*     */       //   109: checkcast java/lang/Boolean
/*     */       //   112: invokevirtual booleanValue : ()Z
/*     */       //   115: ifeq -> 184
/*     */       //   118: aload_3
/*     */       //   119: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   124: astore #4
/*     */       //   126: aload_0
/*     */       //   127: getfield $channel : Lkotlinx/coroutines/channels/Channel;
/*     */       //   130: invokeinterface tryReceive-PtdJZtk : ()Ljava/lang/Object;
/*     */       //   135: invokestatic getOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   138: dup
/*     */       //   139: ifnonnull -> 145
/*     */       //   142: pop
/*     */       //   143: aload #4
/*     */       //   145: astore #5
/*     */       //   147: aload_2
/*     */       //   148: aconst_null
/*     */       //   149: aconst_null
/*     */       //   150: new androidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3$1$1
/*     */       //   153: dup
/*     */       //   154: aload #5
/*     */       //   156: aload_0
/*     */       //   157: getfield $animatable : Landroidx/compose/animation/core/Animatable;
/*     */       //   160: aload_0
/*     */       //   161: getfield $animSpec$delegate : Landroidx/compose/runtime/State;
/*     */       //   164: aload_0
/*     */       //   165: getfield $listener$delegate : Landroidx/compose/runtime/State;
/*     */       //   168: aconst_null
/*     */       //   169: invokespecial <init> : (Ljava/lang/Object;Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)V
/*     */       //   172: checkcast kotlin/jvm/functions/Function2
/*     */       //   175: iconst_3
/*     */       //   176: aconst_null
/*     */       //   177: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*     */       //   180: pop
/*     */       //   181: goto -> 54
/*     */       //   184: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   187: areturn
/*     */       //   188: new java/lang/IllegalStateException
/*     */       //   191: dup
/*     */       //   192: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   194: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   197: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #418	-> 3
/*     */       //   #419	-> 44
/*     */       //   #418	-> 85
/*     */       //   #419	-> 109
/*     */       //   #425	-> 126
/*     */       //   #426	-> 147
/*     */       //   #433	-> 184
/*     */       //   #418	-> 188
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   44	44	2	$this$LaunchedEffect	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   104	84	2	$this$LaunchedEffect	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   126	16	4	target	Ljava/lang/Object;
/*     */       //   142	3	4	target	Ljava/lang/Object;
/*     */       //   147	34	5	newTarget	Ljava/lang/Object;
/*     */       //   36	152	0	this	Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3$1;
/*     */       //   36	152	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super AnimateAsStateKt$animateValueAsState$3$1> $completion) {
/*     */       AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, $completion);
/*     */       animateAsStateKt$animateValueAsState$3$1.L$0 = value;
/*     */       return (Continuation<Unit>)animateAsStateKt$animateValueAsState$3$1;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((AnimateAsStateKt$animateValueAsState$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\AnimateAsStateKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */