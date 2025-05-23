/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.runtime.FloatState;
/*     */ import androidx.compose.runtime.MutableFloatState;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.PrimitiveSnapshotStateKt;
/*     */ import androidx.compose.runtime.RememberObserver;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.graphics.ClipOp;
/*     */ import androidx.compose.ui.graphics.Path;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawContext;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawTransform;
/*     */ import androidx.compose.ui.graphics.layer.GraphicsLayer;
/*     */ import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
/*     */ import androidx.compose.ui.layout.LayoutCoordinates;
/*     */ import androidx.compose.ui.unit.IntSizeKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000v\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\007\n\002\b\t\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\007\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b2\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\004\b\000\030\0002\0020\0012\0020\002BE\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f\022\006\020\r\032\0020\n\022\006\020\016\032\0020\017\022\006\020\020\032\0020\021¢\006\002\020\022J\023\020a\032\0020bø\001\001ø\001\000¢\006\004\bc\0201J\020\020d\032\0020e2\006\020f\032\0020gH\026J\b\020h\032\0020eH\026J\b\020i\032\0020eH\026J\b\020j\032\0020eH\026R+\020\005\032\0020\0062\006\020\023\032\0020\0068F@FX\002¢\006\022\n\004\b\030\020\031\032\004\b\024\020\025\"\004\b\026\020\027R\034\020\032\032\004\030\0010\033X\016¢\006\016\n\000\032\004\b\034\020\035\"\004\b\036\020\037R/\020!\032\004\030\0010 2\b\020\023\032\004\030\0010 8F@FX\002¢\006\022\n\004\b&\020\031\032\004\b\"\020#\"\004\b$\020%R\"\020'\032\n\022\006\022\004\030\0010)0(X\016¢\006\016\n\000\032\004\b*\020+\"\004\b,\020-R\027\020.\032\0020/8Fø\001\000ø\001\001¢\006\006\032\004\b0\0201R+\020\013\032\0020\f2\006\020\023\032\0020\f8F@FX\002¢\006\022\n\004\b6\020\031\032\004\b2\0203\"\004\b4\0205R\034\0207\032\004\030\0010\000X\016¢\006\016\n\000\032\004\b8\0209\"\004\b:\020;R+\020\007\032\0020\b2\006\020\023\032\0020\b8F@FX\002¢\006\022\n\004\b@\020\031\032\004\b<\020=\"\004\b>\020?R+\020\r\032\0020\n2\006\020\023\032\0020\n8F@FX\002¢\006\022\n\004\bE\020\031\032\004\bA\020B\"\004\bC\020DR+\020\t\032\0020\n2\006\020\023\032\0020\n8F@FX\002¢\006\022\n\004\bH\020\031\032\004\bF\020B\"\004\bG\020DR+\020\003\032\0020\0042\006\020\023\032\0020\0048F@FX\002¢\006\022\n\004\bM\020\031\032\004\bI\020J\"\004\bK\020LR\024\020N\032\0020\n8BX\004¢\006\006\032\004\bO\020BR\024\020P\032\0020\n8@X\004¢\006\006\032\004\bQ\020BR\021\020R\032\0020\n8F¢\006\006\032\004\bS\020BR\021\020T\032\0020\n8F¢\006\006\032\004\bU\020BR+\020\016\032\0020\0172\006\020\023\032\0020\0178F@FX\002¢\006\022\n\004\bZ\020\031\032\004\bV\020W\"\004\bX\020YR+\020\020\032\0020\0212\006\020\023\032\0020\0218V@VX\002¢\006\022\n\004\b_\020`\032\004\b[\020\\\"\004\b]\020^\002\013\n\005\b¡\0360\001\n\002\b!¨\006k"}, d2 = {"Landroidx/compose/animation/SharedElementInternalState;", "Landroidx/compose/animation/LayerRenderer;", "Landroidx/compose/runtime/RememberObserver;", "sharedElement", "Landroidx/compose/animation/SharedElement;", "boundsAnimation", "Landroidx/compose/animation/BoundsAnimation;", "placeHolderSize", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "renderOnlyWhenVisible", "", "overlayClip", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "renderInOverlayDuringTransition", "userState", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "zIndex", "", "(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$OverlayClip;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;F)V", "<set-?>", "getBoundsAnimation", "()Landroidx/compose/animation/BoundsAnimation;", "setBoundsAnimation", "(Landroidx/compose/animation/BoundsAnimation;)V", "boundsAnimation$delegate", "Landroidx/compose/runtime/MutableState;", "clipPathInOverlay", "Landroidx/compose/ui/graphics/Path;", "getClipPathInOverlay$animation", "()Landroidx/compose/ui/graphics/Path;", "setClipPathInOverlay$animation", "(Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "getLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "setLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "layer$delegate", "lookaheadCoords", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLookaheadCoords", "()Lkotlin/jvm/functions/Function0;", "setLookaheadCoords", "(Lkotlin/jvm/functions/Function0;)V", "nonNullLookaheadSize", "Landroidx/compose/ui/geometry/Size;", "getNonNullLookaheadSize-NH-jbRc", "()J", "getOverlayClip", "()Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "setOverlayClip", "(Landroidx/compose/animation/SharedTransitionScope$OverlayClip;)V", "overlayClip$delegate", "parentState", "getParentState", "()Landroidx/compose/animation/SharedElementInternalState;", "setParentState", "(Landroidx/compose/animation/SharedElementInternalState;)V", "getPlaceHolderSize", "()Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "setPlaceHolderSize", "(Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;)V", "placeHolderSize$delegate", "getRenderInOverlayDuringTransition", "()Z", "setRenderInOverlayDuringTransition", "(Z)V", "renderInOverlayDuringTransition$delegate", "getRenderOnlyWhenVisible", "setRenderOnlyWhenVisible", "renderOnlyWhenVisible$delegate", "getSharedElement", "()Landroidx/compose/animation/SharedElement;", "setSharedElement", "(Landroidx/compose/animation/SharedElement;)V", "sharedElement$delegate", "shouldRenderBasedOnTarget", "getShouldRenderBasedOnTarget", "shouldRenderInOverlay", "getShouldRenderInOverlay$animation", "shouldRenderInPlace", "getShouldRenderInPlace", "target", "getTarget", "getUserState", "()Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "setUserState", "(Landroidx/compose/animation/SharedTransitionScope$SharedContentState;)V", "userState$delegate", "getZIndex", "()F", "setZIndex", "(F)V", "zIndex$delegate", "Landroidx/compose/runtime/MutableFloatState;", "calculateLookaheadOffset", "Landroidx/compose/ui/geometry/Offset;", "calculateLookaheadOffset-F1C5BW0", "drawInOverlay", "", "drawScope", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onAbandoned", "onForgotten", "onRemembered", "animation"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nSharedElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElementInternalState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,254:1\n79#2:255\n112#2,2:256\n81#3:258\n107#3,2:259\n81#3:261\n107#3,2:262\n81#3:264\n107#3,2:265\n81#3:267\n107#3,2:268\n81#3:270\n107#3,2:271\n81#3:273\n107#3,2:274\n81#3:276\n107#3,2:277\n81#3:315\n107#3,2:316\n70#4,4:279\n244#5,5:283\n272#5,9:288\n128#5,7:297\n282#5,4:304\n128#5,7:308\n*S KotlinDebug\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElementInternalState\n*L\n180#1:255\n180#1:256,2\n182#1:258\n182#1:259,2\n183#1:261\n183#1:262,2\n184#1:264\n184#1:265,2\n185#1:267\n185#1:268,2\n186#1:270\n186#1:271,2\n187#1:273\n187#1:274,2\n188#1:276\n188#1:277,2\n230#1:315\n230#1:316,2\n199#1:279,4\n201#1:283,5\n201#1:288,9\n202#1:297,7\n201#1:304,4\n206#1:308,7\n*E\n"})
/*     */ public final class SharedElementInternalState
/*     */   implements LayerRenderer, RememberObserver
/*     */ {
/*     */   @NotNull
/*     */   private final MutableFloatState zIndex$delegate;
/*     */   @NotNull
/*     */   private final MutableState renderInOverlayDuringTransition$delegate;
/*     */   @NotNull
/*     */   private final MutableState sharedElement$delegate;
/*     */   @NotNull
/*     */   private final MutableState boundsAnimation$delegate;
/*     */   @NotNull
/*     */   private final MutableState placeHolderSize$delegate;
/*     */   @NotNull
/*     */   private final MutableState renderOnlyWhenVisible$delegate;
/*     */   @NotNull
/*     */   private final MutableState overlayClip$delegate;
/*     */   @NotNull
/*     */   private final MutableState userState$delegate;
/*     */   @Nullable
/*     */   private Path clipPathInOverlay;
/*     */   @NotNull
/*     */   private Function0<? extends LayoutCoordinates> lookaheadCoords;
/*     */   @Nullable
/*     */   private SharedElementInternalState parentState;
/*     */   @NotNull
/*     */   private final MutableState layer$delegate;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public SharedElementInternalState(@NotNull SharedElement sharedElement, @NotNull BoundsAnimation boundsAnimation, @NotNull SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean renderOnlyWhenVisible, @NotNull SharedTransitionScope.OverlayClip overlayClip, boolean renderInOverlayDuringTransition, @NotNull SharedTransitionScope.SharedContentState userState, float zIndex) {
/* 180 */     this.zIndex$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(zIndex);
/*     */     
/* 182 */     this.renderInOverlayDuringTransition$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(renderInOverlayDuringTransition), null, 2, null);
/* 183 */     this.sharedElement$delegate = SnapshotStateKt.mutableStateOf$default(sharedElement, null, 2, null);
/* 184 */     this.boundsAnimation$delegate = SnapshotStateKt.mutableStateOf$default(boundsAnimation, null, 2, null);
/* 185 */     this.placeHolderSize$delegate = SnapshotStateKt.mutableStateOf$default(placeHolderSize, null, 2, null);
/* 186 */     this.renderOnlyWhenVisible$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(renderOnlyWhenVisible), null, 2, null);
/* 187 */     this.overlayClip$delegate = SnapshotStateKt.mutableStateOf$default(overlayClip, null, 2, null);
/* 188 */     this.userState$delegate = SnapshotStateKt.mutableStateOf$default(userState, null, 2, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 215 */     this.lookaheadCoords = SharedElementInternalState$lookaheadCoords$1.INSTANCE;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 230 */     this.layer$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
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
/*     */   public float getZIndex()
/*     */   {
/*     */     FloatState floatState = (FloatState)this.zIndex$delegate;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 255 */     return floatState.getFloatValue(); } public void setZIndex(float <set-?>) { MutableFloatState mutableFloatState = this.zIndex$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 256 */     mutableFloatState.setFloatValue(<set-?>); } public final boolean getRenderInOverlayDuringTransition() { State state = (State)this.renderInOverlayDuringTransition$delegate; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 258 */     return ((Boolean)state.getValue()).booleanValue(); } public final void setRenderInOverlayDuringTransition(boolean <set-?>) { MutableState mutableState = this.renderInOverlayDuringTransition$delegate; Object object = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 259 */     mutableState.setValue(value$iv); } @NotNull public final SharedElement getSharedElement() { State state = (State)this.sharedElement$delegate; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 261 */     return (SharedElement)state.getValue(); } public final void setSharedElement(@NotNull SharedElement <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); MutableState mutableState = this.sharedElement$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 262 */     mutableState.setValue(<set-?>); } @NotNull public final BoundsAnimation getBoundsAnimation() { State state = (State)this.boundsAnimation$delegate; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 264 */     return (BoundsAnimation)state.getValue(); } public final void setBoundsAnimation(@NotNull BoundsAnimation <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); MutableState mutableState = this.boundsAnimation$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 265 */     mutableState.setValue(<set-?>); } @NotNull public final SharedTransitionScope.PlaceHolderSize getPlaceHolderSize() { State state = (State)this.placeHolderSize$delegate; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 267 */     return (SharedTransitionScope.PlaceHolderSize)state.getValue(); } public final void setPlaceHolderSize(@NotNull SharedTransitionScope.PlaceHolderSize <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); MutableState mutableState = this.placeHolderSize$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 268 */     mutableState.setValue(<set-?>); } public final boolean getRenderOnlyWhenVisible() { State state = (State)this.renderOnlyWhenVisible$delegate; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 270 */     return ((Boolean)state.getValue()).booleanValue(); } public final void setRenderOnlyWhenVisible(boolean <set-?>) { MutableState mutableState = this.renderOnlyWhenVisible$delegate; Object object = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 271 */     mutableState.setValue(value$iv); } @NotNull public final SharedTransitionScope.OverlayClip getOverlayClip() { State state = (State)this.overlayClip$delegate; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 273 */     return (SharedTransitionScope.OverlayClip)state.getValue(); } public final void setOverlayClip(@NotNull SharedTransitionScope.OverlayClip <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); MutableState mutableState = this.overlayClip$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 274 */     mutableState.setValue(<set-?>); } @NotNull public final SharedTransitionScope.SharedContentState getUserState() { State state = (State)this.userState$delegate; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 276 */     return (SharedTransitionScope.SharedContentState)state.getValue(); } public final void setUserState(@NotNull SharedTransitionScope.SharedContentState <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); MutableState mutableState = this.userState$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 277 */     mutableState.setValue(<set-?>); } @Nullable public final Path getClipPathInOverlay$animation() { return this.clipPathInOverlay; }
/*     */   public final void setClipPathInOverlay$animation(@Nullable Path <set-?>) { this.clipPathInOverlay = <set-?>; }
/* 279 */   public void drawInOverlay(@NotNull DrawScope drawScope) { GraphicsLayer layer; Intrinsics.checkNotNullParameter(drawScope, "drawScope"); if (getLayer() == null) { getLayer(); return; }  if (getShouldRenderInOverlay$animation()) { DrawScope $this$drawInOverlay_u24lambda_u245 = drawScope; int $i$a$-with-SharedElementInternalState$drawInOverlay$1 = 0; if (getSharedElement().getCurrentBounds() == null) { getSharedElement().getCurrentBounds(); int $i$a$-requireNotNull-SharedElementInternalState$drawInOverlay$1$1 = 0; String str = "Error: current bounds not set yet."; throw new IllegalArgumentException(str.toString()); }  getSharedElement().getCurrentBounds(); getSharedElement().getCurrentBounds(); Intrinsics.checkNotNull((getSharedElement().getCurrentBounds() != null) ? Offset.box-impl(getSharedElement().getCurrentBounds().getTopLeft-F1C5BW0()) : null); long l1 = ((getSharedElement().getCurrentBounds() != null) ? Offset.box-impl(getSharedElement().getCurrentBounds().getTopLeft-F1C5BW0()) : null).unbox-impl(); int $i$f$component1-impl = 0; float x = Offset.getX-impl(l1);
/*     */       
/*     */       int $i$f$component2-impl = 0;
/* 282 */       float y = Offset.getY-impl(l1); Path it = this.clipPathInOverlay;
/*     */       int $i$a$-let-SharedElementInternalState$drawInOverlay$1$2 = 0;
/*     */       $this$clipPath_u2dKD09W0M_u24default$iv = $this$drawInOverlay_u24lambda_u245;
/* 285 */       int clipOp$iv = ClipOp.Companion.getIntersect-rtfAjoo();
/*     */       int $i$f$clipPath-KD09W0M = 0;
/* 287 */       DrawScope $this$withTransform$iv$iv = $this$clipPath_u2dKD09W0M_u24default$iv; int $i$f$withTransform = 0;
/* 288 */       DrawContext $this$withTransform_u24lambda_u246$iv$iv = $this$withTransform$iv$iv.getDrawContext(); int $i$a$-with-DrawScopeKt$withTransform$1$iv$iv = 0;
/*     */ 
/*     */ 
/*     */       
/* 292 */       long previousSize$iv$iv = $this$withTransform_u24lambda_u246$iv$iv.getSize-NH-jbRc();
/* 293 */       $this$withTransform_u24lambda_u246$iv$iv.getCanvas().save();
/*     */       try {
/* 295 */         DrawTransform $this$clipPath_KD09W0M_u24lambda_u245$iv = $this$withTransform_u24lambda_u246$iv$iv.getTransform(); int $i$a$-withTransform-DrawScopeKt$clipPath$1$iv = 0; $this$clipPath_KD09W0M_u24lambda_u245$iv.clipPath-mtrdD-E(it, clipOp$iv);
/* 296 */         DrawScope $this$drawInOverlay_u24lambda_u245_u24lambda_u243_u24lambda_u242 = $this$withTransform$iv$iv; int $i$a$-clipPath-KD09W0M$default-SharedElementInternalState$drawInOverlay$1$2$1 = 0; DrawScope drawScope1 = $this$drawInOverlay_u24lambda_u245_u24lambda_u243_u24lambda_u242; int i = 0;
/* 297 */         drawScope1.getDrawContext().getTransform().translate(x, y);
/*     */         try {
/* 299 */           DrawScope $this$drawInOverlay_u24lambda_u245_u24lambda_u243_u24lambda_u242_u24lambda_u241 = drawScope1; int $i$a$-translate-SharedElementInternalState$drawInOverlay$1$2$1$1 = 0; GraphicsLayerKt.drawLayer($this$drawInOverlay_u24lambda_u245_u24lambda_u243_u24lambda_u242_u24lambda_u241, layer);
/*     */         } finally {
/* 301 */           drawScope1.getDrawContext().getTransform().translate(-x, -y);
/*     */         } 
/*     */       } finally {
/* 304 */         $this$withTransform_u24lambda_u246$iv$iv.getCanvas().restore();
/* 305 */         $this$withTransform_u24lambda_u246$iv$iv.setSize-uvyYCjk(previousSize$iv$iv);
/*     */       }  DrawScope $this$translate$iv = $this$drawInOverlay_u24lambda_u245;
/*     */       int $i$f$translate = 0;
/* 308 */       $this$translate$iv.getDrawContext().getTransform().translate(x, y);
/*     */       
/* 310 */       try { DrawScope $this$drawInOverlay_u24lambda_u245_u24lambda_u244 = $this$translate$iv; int $i$a$-translate-SharedElementInternalState$drawInOverlay$1$3 = 0; GraphicsLayerKt.drawLayer($this$drawInOverlay_u24lambda_u245_u24lambda_u244, layer); }
/*     */       finally
/* 312 */       { $this$translate$iv.getDrawContext().getTransform().translate(-x, -y); }  }  }
/*     */   public final long getNonNullLookaheadSize-NH-jbRc() { if (this.lookaheadCoords.invoke() == null) { this.lookaheadCoords.invoke(); int $i$a$-requireNotNull-SharedElementInternalState$nonNullLookaheadSize$1 = 0; String str = "Error: lookahead coordinates is null for " + getSharedElement().getKey() + '.'; throw new IllegalArgumentException(str.toString()); }  return IntSizeKt.toSize-ozmzZPI(((LayoutCoordinates)this.lookaheadCoords.invoke()).getSize-YbymL2g()); }
/*     */   @NotNull public final Function0<LayoutCoordinates> getLookaheadCoords() { return (Function0)this.lookaheadCoords; } public final void setLookaheadCoords(@NotNull Function0<? extends LayoutCoordinates> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.lookaheadCoords = <set-?>; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\001\n\000\020\000\032\004\030\0010\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class SharedElementInternalState$lookaheadCoords$1 extends Lambda implements Function0 {
/* 315 */     public static final SharedElementInternalState$lookaheadCoords$1 INSTANCE = new SharedElementInternalState$lookaheadCoords$1(); SharedElementInternalState$lookaheadCoords$1() { super(0); } @Nullable public final Void invoke() { return null; } } @Nullable public final GraphicsLayer getLayer() { State state = (State)this.layer$delegate; KProperty property$iv = null; int $i$f$getValue = 0; return (GraphicsLayer)state.getValue(); }
/* 316 */   @Nullable public SharedElementInternalState getParentState() { return this.parentState; } public void setParentState(@Nullable SharedElementInternalState <set-?>) { this.parentState = <set-?>; } public final long calculateLookaheadOffset-F1C5BW0() { if (this.lookaheadCoords.invoke() == null) { this.lookaheadCoords.invoke(); int $i$a$-requireNotNull-SharedElementInternalState$calculateLookaheadOffset$c$1 = 0; String str = "Error: lookahead coordinates is null."; throw new IllegalArgumentException(str.toString()); }  LayoutCoordinates c = (LayoutCoordinates)this.lookaheadCoords.invoke(); return getSharedElement().getScope().getLookaheadRoot$animation().localPositionOf-R5De75A(c, Offset.Companion.getZero-F1C5BW0()); } public final boolean getTarget() { return getBoundsAnimation().getTarget(); } public final void setLayer(@Nullable GraphicsLayer <set-?>) { MutableState mutableState = this.layer$delegate; KProperty property$iv = null; int $i$f$setValue = 0; mutableState.setValue(<set-?>); }
/*     */ 
/*     */   
/*     */   private final boolean getShouldRenderBasedOnTarget() {
/*     */     return (Intrinsics.areEqual(getSharedElement().getTargetBoundsProvider$animation(), this) || !getRenderOnlyWhenVisible());
/*     */   }
/*     */   
/*     */   public final boolean getShouldRenderInOverlay$animation() {
/*     */     return (getShouldRenderBasedOnTarget() && getSharedElement().getFoundMatch() && getRenderInOverlayDuringTransition());
/*     */   }
/*     */   
/*     */   public final boolean getShouldRenderInPlace() {
/*     */     return (!getSharedElement().getFoundMatch() || (!getShouldRenderInOverlay$animation() && getShouldRenderBasedOnTarget()));
/*     */   }
/*     */   
/*     */   public void onRemembered() {
/*     */     getSharedElement().getScope().onStateAdded$animation(this);
/*     */     getSharedElement().updateTargetBoundsProvider();
/*     */   }
/*     */   
/*     */   public void onForgotten() {
/*     */     getSharedElement().getScope().onStateRemoved$animation(this);
/*     */     getSharedElement().updateTargetBoundsProvider();
/*     */   }
/*     */   
/*     */   public void onAbandoned() {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\SharedElementInternalState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */