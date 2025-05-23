/*     */ package androidx.compose.ui.graphics.layer;
/*     */ import androidx.compose.ui.graphics.Outline;
/*     */ import kotlin.Unit;
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000Þ\001\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\005\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\n\n\002\030\002\n\002\020\013\n\002\b\005\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\020\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\020\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\t\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\020\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\030\0002\0020\001B\017\b\000\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020z\032\002032\006\020{\032\0020\000H\002J\b\020|\032\00205H\002JA\020}\032\002052\006\020~\032\0020J2\006\020\032\0020_2\032\020\001\032\025\022\004\022\0020J\022\004\022\0020_\022\004\022\002050\001H\bø\001\000¢\006\006\b\001\020\001J\t\020\001\032\00203H\002J$\020\001\032\002032\b\020\001\032\0030\0012\t\020\001\032\004\030\0010\000H\000¢\006\003\b\001J\023\020\001\032\002032\b\020\001\032\0030\001H\002J\024\020\001\032\002032\t\b\002\020\001\032\0020\037H\002J\t\020\001\032\00203H\002J\t\020\001\032\00203H\002JJ\020\001\032\002032\006\020/\032\002002\b\020\001\032\0030\0012\006\020k\032\0020j2\033\020\001\032\026\022\005\022\0030\001\022\004\022\002030\001¢\006\003\b\001ø\001\000¢\006\006\b\001\020\001J\017\020\001\032\00203H\000¢\006\003\b\001J\t\020\001\032\00203H\002J\t\020\001\032\0020\037H\002J\t\020\001\032\00203H\002J\020\020\001\032\002032\007\020\001\032\0020AJ'\020\001\032\002032\b\b\002\020q\032\0020J2\b\b\002\020k\032\0020_ø\001\000¢\006\006\b\001\020\001J2\020 \001\032\002032\b\b\002\020q\032\0020J2\b\b\002\020k\032\0020_2\t\b\002\020¡\001\032\0020\006ø\001\000¢\006\006\b¢\001\020£\001J\021\020¤\001\032\0030¥\001H@¢\006\003\020¦\001J\031\020§\001\032\002032\016\020\001\032\t\022\004\022\002030¨\001H\002J\024\020©\001\032\002032\t\b\002\020\001\032\0020\037H\002J\t\020ª\001\032\00203H\002R$\020\007\032\0020\0062\006\020\005\032\0020\006@FX\016¢\006\016\n\000\032\004\b\b\020\t\"\004\b\n\020\013R,\020\r\032\0020\f2\006\020\005\032\0020\f@FX\016ø\001\000ø\001\001¢\006\020\n\002\020\022\032\004\b\016\020\017\"\004\b\020\020\021R,\020\024\032\0020\0232\006\020\005\032\0020\023@FX\016ø\001\000ø\001\001¢\006\020\n\002\020\031\032\004\b\025\020\026\"\004\b\027\020\030R$\020\032\032\0020\0062\006\020\005\032\0020\006@FX\016¢\006\016\n\000\032\004\b\033\020\t\"\004\b\034\020\013R\016\020\035\032\0020\036X\004¢\006\002\n\000R$\020 \032\0020\0372\006\020\005\032\0020\037@FX\016¢\006\016\n\000\032\004\b!\020\"\"\004\b#\020$R(\020&\032\004\030\0010%2\b\020\005\032\004\030\0010%@FX\016¢\006\016\n\000\032\004\b'\020(\"\004\b)\020*R\"\020+\032\0020,X\016ø\001\000ø\001\001¢\006\020\n\002\020\031\032\004\b-\020\026\"\004\b.\020\030R\016\020/\032\00200X\016¢\006\002\n\000R\024\0201\032\b\022\004\022\0020302X\004¢\006\002\n\000R\020\0204\032\004\030\00105X\016¢\006\002\n\000R\036\0207\032\0020\0372\006\0206\032\0020\037@BX\016¢\006\b\n\000\032\004\b7\020\"R\026\0208\032\00209X\004ø\001\000ø\001\001¢\006\004\n\002\020:R\016\020;\032\0020\037X\016¢\006\002\n\000R\021\020<\032\002058F¢\006\006\032\004\b=\020>R\016\020?\032\0020\037X\016¢\006\002\n\000R\020\020@\032\004\030\0010AX\016¢\006\002\n\000R\016\020B\032\0020CX\016¢\006\002\n\000R\020\020D\032\004\030\0010EX\016¢\006\002\n\000R\016\020F\032\0020GX\004¢\006\002\n\000R\016\020H\032\0020IX\004¢\006\002\n\000R,\020K\032\0020J2\006\020\005\032\0020J@FX\016ø\001\000ø\001\001¢\006\020\n\002\020\022\032\004\bL\020\017\"\004\bM\020\021R(\020O\032\004\030\0010N2\b\020\005\032\004\030\0010N@FX\016¢\006\016\n\000\032\004\bP\020Q\"\004\bR\020SR$\020T\032\0020\0062\006\020\005\032\0020\006@FX\016¢\006\016\n\000\032\004\bU\020\t\"\004\bV\020\013R$\020W\032\0020\0062\006\020\005\032\0020\006@FX\016¢\006\016\n\000\032\004\bX\020\t\"\004\bY\020\013R$\020Z\032\0020\0062\006\020\005\032\0020\006@FX\016¢\006\016\n\000\032\004\b[\020\t\"\004\b\\\020\013R\016\020]\032\0020\006X\016¢\006\002\n\000R\026\020^\032\0020_X\016ø\001\000ø\001\001¢\006\004\n\002\020\022R\026\020`\032\0020JX\016ø\001\000ø\001\001¢\006\004\n\002\020\022R$\020a\032\0020\0062\006\020\005\032\0020\006@FX\016¢\006\016\n\000\032\004\bb\020\t\"\004\bc\020\013R$\020d\032\0020\0062\006\020\005\032\0020\006@FX\016¢\006\016\n\000\032\004\be\020\t\"\004\bf\020\013R$\020g\032\0020\0062\006\020\005\032\0020\006@FX\016¢\006\016\n\000\032\004\bh\020\t\"\004\bi\020\013R&\020k\032\0020j2\006\0206\032\0020j@BX\016ø\001\000ø\001\001¢\006\n\n\002\020\022\032\004\bl\020\017R\016\020\002\032\0020\003X\004¢\006\002\n\000R,\020m\032\0020\f2\006\020\005\032\0020\f@FX\016ø\001\000ø\001\001¢\006\020\n\002\020\022\032\004\bn\020\017\"\004\bo\020\021R,\020q\032\0020p2\006\020\005\032\0020p@FX\016ø\001\000ø\001\001¢\006\020\n\002\020\022\032\004\br\020\017\"\004\bs\020\021R$\020t\032\0020\0062\006\020\005\032\0020\006@FX\016¢\006\016\n\000\032\004\bu\020\t\"\004\bv\020\013R$\020w\032\0020\0062\006\020\005\032\0020\006@FX\016¢\006\016\n\000\032\004\bx\020\t\"\004\by\020\013\002\013\n\005\b¡\0360\001\n\002\b!¨\006«\001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "snapshotObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "(Landroidx/compose/runtime/snapshots/SnapshotStateObserver;)V", "value", "", "alpha", "getAlpha", "()F", "setAlpha", "(F)V", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "J", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "I", "cameraDistance", "getCameraDistance", "setCameraDistance", "childDependenciesTracker", "Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "", "clip", "getClip", "()Z", "setClip", "(Z)V", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "compositingStrategy", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "getCompositingStrategy-ke2Ky5w", "setCompositingStrategy-Wpw9cng", "density", "Landroidx/compose/ui/unit/Density;", "drawState", "Landroidx/compose/runtime/MutableState;", "", "internalOutline", "Landroidx/compose/ui/graphics/Outline;", "<set-?>", "isReleased", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "matrixDirty", "outline", "getOutline", "()Landroidx/compose/ui/graphics/Outline;", "outlineDirty", "outlinePath", "Landroidx/compose/ui/graphics/Path;", "parentLayerUsages", "", "picture", "Lorg/jetbrains/skia/Picture;", "pictureDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "pictureRecorder", "Lorg/jetbrains/skia/PictureRecorder;", "Landroidx/compose/ui/geometry/Offset;", "pivotOffset", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "roundRectCornerRadius", "roundRectOutlineSize", "Landroidx/compose/ui/geometry/Size;", "roundRectOutlineTopLeft", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "shadowElevation", "getShadowElevation", "setShadowElevation", "Landroidx/compose/ui/unit/IntSize;", "size", "getSize-YbymL2g", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "Landroidx/compose/ui/unit/IntOffset;", "topLeft", "getTopLeft-nOcc-ac", "setTopLeft--gyyYBs", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "addSubLayer", "graphicsLayer", "configureOutline", "createOutlineWithPosition", "outlineTopLeft", "outlineSize", "block", "Lkotlin/Function2;", "createOutlineWithPosition-TNW_H78", "(JJLkotlin/jvm/functions/Function2;)Landroidx/compose/ui/graphics/Outline;", "discardContentIfReleasedAndHaveNoParentLayerUsages", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "parentLayer", "draw$ui_graphics", "drawShadow", "invalidateMatrix", "requestDraw", "onAddedToParentLayer", "onRemovedFromParentLayer", "record", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "record-mL-hObY", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;JLkotlin/jvm/functions/Function1;)V", "release", "release$ui_graphics", "requiresLayer", "resetOutlineParams", "setPathOutline", "path", "setRectOutline", "setRectOutline-tz77jQw", "(JJ)V", "setRoundRectOutline", "cornerRadius", "setRoundRectOutline-TNW_H78", "(JJF)V", "toImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackRecord", "Lkotlin/Function0;", "updateLayerConfiguration", "updateMatrix", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nSkiaGraphicsLayer.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkiaGraphicsLayer.skiko.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer\n+ 2 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,530:1\n250#1:583\n251#1,5:585\n44#2,20:531\n64#2,4:578\n107#2,6:590\n113#2,3:623\n267#3,4:551\n237#3,7:555\n248#3,3:563\n251#3,2:567\n272#3,2:569\n254#3,6:571\n274#3:577\n267#3,4:596\n237#3,7:600\n248#3,3:608\n251#3,2:612\n272#3,2:614\n254#3,6:616\n274#3:622\n1810#4:562\n1672#4:566\n1810#4:607\n1672#4:611\n205#5:582\n205#5:584\n1#6:626\n149#7:627\n149#7:628\n*S KotlinDebug\n*F\n+ 1 SkiaGraphicsLayer.skiko.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer\n*L\n265#1:583\n265#1:585,5\n219#1:531,20\n219#1:578,4\n471#1:590,6\n471#1:623,3\n219#1:551,4\n219#1:555,7\n219#1:563,3\n219#1:567,2\n219#1:569,2\n219#1:571,6\n219#1:577\n471#1:596,4\n471#1:600,7\n471#1:608,3\n471#1:612,2\n471#1:614,2\n471#1:616,6\n471#1:622\n219#1:562\n219#1:566\n471#1:607\n471#1:611\n250#1:582\n265#1:584\n511#1:627\n512#1:628\n*E\n"})
/*     */ public final class GraphicsLayer { @NotNull
/*     */   private final SnapshotStateObserver snapshotObserver; @NotNull
/*     */   private final CanvasDrawScope pictureDrawScope; @NotNull
/*     */   private final PictureRecorder pictureRecorder; @Nullable
/*     */   private Picture picture; @NotNull
/*     */   private final MutableState<Unit> drawState; private boolean matrixDirty; @NotNull
/*     */   private final float[] matrix; private int compositingStrategy; @Nullable
/*     */   private Outline internalOutline; private boolean outlineDirty; private long roundRectOutlineTopLeft; private long roundRectOutlineSize; private float roundRectCornerRadius; @Nullable
/*     */   private Path outlinePath; private int parentLayerUsages; @NotNull
/*     */   private final ChildLayerDependenciesTracker childDependenciesTracker; private long topLeft; private long size; private float alpha; private float scaleX; private float scaleY; private float translationX; private float translationY; private float shadowElevation; private float rotationX; private float rotationY; private float rotationZ; private float cameraDistance; @Nullable
/*     */   private RenderEffect renderEffect; @NotNull
/*     */   private Density density; private boolean clip; private long pivotOffset; private int blendMode; @Nullable
/*     */   private ColorFilter colorFilter; private boolean isReleased; private long ambientShadowColor; private long spotShadowColor; @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\002\020\002\n\000\n\002\020\013\n\002\b\t*\001\000\b\n\030\0002\b\022\004\022\0020\0020\001J\035\020\003\032\0020\0042\006\020\005\032\0020\0022\006\020\006\032\0020\002H\026¢\006\002\020\007J%\020\b\032\0020\0022\006\020\t\032\0020\0022\006\020\n\032\0020\0022\006\020\013\032\0020\002H\026¢\006\002\020\f¨\006\r"}, d2 = {"androidx/compose/ui/graphics/layer/GraphicsLayer$drawState$1", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "", "equivalent", "", "a", "b", "(Lkotlin/Unit;Lkotlin/Unit;)Z", "merge", "previous", "current", "applied", "(Lkotlin/Unit;Lkotlin/Unit;Lkotlin/Unit;)V", "ui-graphics"})
/*     */   public static final class GraphicsLayer$drawState$1 implements SnapshotMutationPolicy<Unit> { public boolean equivalent(@NotNull Unit a, @NotNull Unit b) { Intrinsics.checkNotNullParameter(a, "a");
/*     */       Intrinsics.checkNotNullParameter(b, "b");
/*     */       return false; } public void merge(@NotNull Unit previous, @NotNull Unit current, @NotNull Unit applied) {
/*     */       Intrinsics.checkNotNullParameter(previous, "previous");
/*     */       Intrinsics.checkNotNullParameter(current, "current");
/*     */       Intrinsics.checkNotNullParameter(applied, "applied");
/*     */     } } public final int getCompositingStrategy-ke2Ky5w() {
/*     */     return this.compositingStrategy;
/*     */   } public final void setCompositingStrategy-Wpw9cng(int <set-?>) {
/*     */     this.compositingStrategy = <set-?>;
/*     */   } public final long getTopLeft-nOcc-ac() {
/*     */     return this.topLeft;
/*     */   } public final void setTopLeft--gyyYBs(long value) {
/*     */     if (!IntOffset.equals-impl0(this.topLeft, value)) {
/*     */       this.topLeft = value;
/*     */       updateLayerConfiguration$default(this, false, 1, null);
/*     */     } 
/*     */   } public final long getSize-YbymL2g() {
/*     */     return this.size;
/*     */   } public final float getAlpha() {
/*     */     return this.alpha;
/*     */   } public final void setAlpha(float value) {
/*     */     this.alpha = value;
/*     */     requestDraw();
/*     */   } public final float getScaleX() {
/*     */     return this.scaleX;
/*     */   } public final void setScaleX(float value) {
/*     */     this.scaleX = value;
/*     */     invalidateMatrix$default(this, false, 1, null);
/*     */   } public final float getScaleY() {
/*     */     return this.scaleY;
/*     */   } public final void setScaleY(float value) {
/*     */     this.scaleY = value;
/*     */     invalidateMatrix$default(this, false, 1, null);
/*     */   } public final float getTranslationX() {
/*     */     return this.translationX;
/*     */   } public final void setTranslationX(float value) {
/*     */     this.translationX = value;
/*     */     invalidateMatrix$default(this, false, 1, null);
/*     */   } public final float getTranslationY() {
/*     */     return this.translationY;
/*     */   } public final void setTranslationY(float value) {
/*     */     this.translationY = value;
/*     */     invalidateMatrix$default(this, false, 1, null);
/*  63 */   } public GraphicsLayer(@NotNull SnapshotStateObserver snapshotObserver) { this.snapshotObserver = snapshotObserver;
/*     */     
/*  65 */     this.pictureDrawScope = new CanvasDrawScope();
/*  66 */     this.pictureRecorder = new PictureRecorder();
/*     */ 
/*     */ 
/*     */     
/*  70 */     this.drawState = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, new GraphicsLayer$drawState$1());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  75 */     this.matrixDirty = true;
/*  76 */     this.matrix = Matrix.constructor-impl$default(null, 1, null);
/*     */     
/*  78 */     this.compositingStrategy = CompositingStrategy.Companion.getAuto-ke2Ky5w();
/*     */ 
/*     */     
/*  81 */     this.outlineDirty = true;
/*  82 */     this.roundRectOutlineTopLeft = Offset.Companion.getZero-F1C5BW0();
/*  83 */     this.roundRectOutlineSize = Size.Companion.getUnspecified-NH-jbRc();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  88 */     this.childDependenciesTracker = new ChildLayerDependenciesTracker();
/*     */     
/*  90 */     this.topLeft = IntOffset.Companion.getZero-nOcc-ac();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  98 */     this.size = IntSize.Companion.getZero-YbymL2g();
/*     */ 
/*     */     
/* 101 */     this.alpha = 1.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 107 */     this.scaleX = 1.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 112 */     this.scaleY = 1.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 149 */     this.cameraDistance = 8.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 161 */     this.density = DensityKt.Density$default(1.0F, 0.0F, 2, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 381 */     this.pivotOffset = Offset.Companion.getUnspecified-F1C5BW0();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 387 */     this.blendMode = BlendMode.Companion.getSrcOver-0nO6VwU();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 479 */     this.ambientShadowColor = Color.Companion.getBlack-0d7_KjU();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 485 */     this.spotShadowColor = Color.Companion.getBlack-0d7_KjU(); }
/*     */   public final float getShadowElevation() { return this.shadowElevation; }
/*     */   public final void setShadowElevation(float value) { this.shadowElevation = value; requestDraw(); }
/*     */   public final float getRotationX() { return this.rotationX; }
/*     */   public final void setRotationX(float value) { this.rotationX = value; invalidateMatrix$default(this, false, 1, null); }
/*     */   public final float getRotationY() { return this.rotationY; }
/*     */   public final void setRotationY(float value) { this.rotationY = value; invalidateMatrix$default(this, false, 1, null); }
/*     */   public final float getRotationZ() { return this.rotationZ; }
/*     */   public final void setRotationZ(float value) { this.rotationZ = value; invalidateMatrix$default(this, false, 1, null); }
/*     */   public final float getCameraDistance() { return this.cameraDistance; }
/*     */   public final void setCameraDistance(float value) { this.cameraDistance = value; invalidateMatrix$default(this, false, 1, null); }
/*     */   @Nullable public final RenderEffect getRenderEffect() { return this.renderEffect; }
/*     */   public final void setRenderEffect(@Nullable RenderEffect value) { this.renderEffect = value;
/*     */     requestDraw(); }
/*     */   private final void invalidateMatrix(boolean requestDraw) { this.matrixDirty = true;
/*     */     if (requestDraw)
/*     */       requestDraw();  }
/*     */   private final void requestDraw() { this.drawState.setValue(Unit.INSTANCE); } private final void updateLayerConfiguration(boolean requestDraw) { this.outlineDirty = true;
/*     */     invalidateMatrix(requestDraw); } public final void record-mL-hObY(@NotNull Density density, @NotNull LayoutDirection layoutDirection, long size, @NotNull Function1<? super DrawScope, Unit> block) { Intrinsics.checkNotNullParameter(density, "density");
/*     */     Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*     */     Intrinsics.checkNotNullParameter(block, "block");
/*     */     if (this.picture != null) {
/*     */       this.picture.close();
/*     */     } else {
/*     */     
/*     */     } 
/*     */     this.picture = null;
/*     */     this.density = density;
/*     */     this.size = size;
/*     */     updateLayerConfiguration(false);
/*     */     Rect bounds = Rects_skikoKt.toSkiaRect(SizeKt.toRect-uvyYCjk(IntSizeKt.toSize-ozmzZPI(size)));
/*     */     Canvas canvas = PictureRecorder.beginRecording$default(this.pictureRecorder, bounds, null, 2, null);
/*     */     Intrinsics.checkNotNull(SkiaBackedCanvas_skikoKt.asComposeCanvas(canvas), "null cannot be cast to non-null type androidx.compose.ui.graphics.SkiaBackedCanvas");
/*     */     SkiaBackedCanvas skiaCanvas = (SkiaBackedCanvas)SkiaBackedCanvas_skikoKt.asComposeCanvas(canvas);
/*     */     skiaCanvas.setAlphaMultiplier$ui_graphics(CompositingStrategy.equals-impl0(this.compositingStrategy, CompositingStrategy.Companion.getModulateAlpha-ke2Ky5w()) ? this.alpha : 1.0F);
/*     */     trackRecord(new GraphicsLayer$record$1(density, layoutDirection, skiaCanvas, size, block));
/*     */     this.picture = this.pictureRecorder.finishRecordingAsPicture(); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) @SourceDebugExtension({"SMAP\nSkiaGraphicsLayer.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkiaGraphicsLayer.skiko.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer$record$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,530:1\n329#2,26:531\n*S KotlinDebug\n*F\n+ 1 SkiaGraphicsLayer.skiko.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer$record$1\n*L\n206#1:531,26\n*E\n"}) static final class GraphicsLayer$record$1 extends Lambda implements Function0<Unit>
/*     */   {
/*     */     public final void invoke() { DrawScope drawScope = (DrawScope)GraphicsLayer.this.pictureDrawScope;
/*     */       Density density1 = this.$density;
/*     */       LayoutDirection layoutDirection1 = this.$layoutDirection;
/*     */       Canvas canvas1 = (Canvas)this.$skiaCanvas;
/*     */       long l1 = IntSizeKt.toSize-ozmzZPI(this.$size);
/*     */       GraphicsLayer graphicsLayer1 = GraphicsLayer.this;
/*     */       Function1<DrawScope, Unit> function1 = this.$block;
/*     */       int $i$f$draw-ymL40Pk = 0;
/* 531 */       Density prevDensity$iv = drawScope.getDrawContext().getDensity();
/* 532 */       LayoutDirection prevLayoutDirection$iv = drawScope.getDrawContext().getLayoutDirection();
/* 533 */       Canvas prevCanvas$iv = drawScope.getDrawContext().getCanvas();
/* 534 */       long prevSize$iv = drawScope.getDrawContext().getSize-NH-jbRc();
/* 535 */       GraphicsLayer prevLayer$iv = drawScope.getDrawContext().getGraphicsLayer();
/* 536 */       DrawContext $this$draw_ymL40Pk_u24lambda_u247$iv = null = drawScope.getDrawContext(); int $i$a$-apply-DrawScopeKt$draw$1$iv = 0;
/* 537 */       $this$draw_ymL40Pk_u24lambda_u247$iv.setDensity(density1);
/* 538 */       $this$draw_ymL40Pk_u24lambda_u247$iv.setLayoutDirection(layoutDirection1);
/* 539 */       $this$draw_ymL40Pk_u24lambda_u247$iv.setCanvas(canvas1);
/* 540 */       $this$draw_ymL40Pk_u24lambda_u247$iv.setSize-uvyYCjk(l1);
/* 541 */       $this$draw_ymL40Pk_u24lambda_u247$iv.setGraphicsLayer(graphicsLayer1);
/*     */       
/* 543 */       canvas1.save();
/*     */       
/* 545 */       try { function1.invoke(drawScope); }
/*     */       finally
/* 547 */       { canvas1.restore();
/* 548 */         DrawContext $this$draw_ymL40Pk_u24lambda_u248$iv = $this$draw_ymL40Pk_u24lambda_u247$iv = drawScope.getDrawContext(); int $i$a$-apply-DrawScopeKt$draw$2$iv = 0;
/* 549 */         $this$draw_ymL40Pk_u24lambda_u248$iv.setDensity(prevDensity$iv);
/* 550 */         $this$draw_ymL40Pk_u24lambda_u248$iv.setLayoutDirection(prevLayoutDirection$iv);
/* 551 */         $this$draw_ymL40Pk_u24lambda_u248$iv.setCanvas(prevCanvas$iv);
/* 552 */         $this$draw_ymL40Pk_u24lambda_u248$iv.setSize-uvyYCjk(prevSize$iv);
/* 553 */         $this$draw_ymL40Pk_u24lambda_u248$iv.setGraphicsLayer(prevLayer$iv); }  } GraphicsLayer$record$1(Density $density, LayoutDirection $layoutDirection, SkiaBackedCanvas $skiaCanvas, long $size, Function1<DrawScope, Unit> $block) { super(0); } }
/* 554 */   private final void trackRecord(Function0 block) { ChildLayerDependenciesTracker this_$iv = this.childDependenciesTracker; int $i$f$withTracking = 0; ChildLayerDependenciesTracker.access$setOldDependency$p(this_$iv, ChildLayerDependenciesTracker.access$getDependency$p(this_$iv)); MutableScatterSet currentSet$iv = ChildLayerDependenciesTracker.access$getDependenciesSet$p(this_$iv); int $i$a$-let-ChildLayerDependenciesTracker$withTracking$1$iv = 0; if (currentSet$iv.isNotEmpty()) { if (ChildLayerDependenciesTracker.access$getOldDependenciesSet$p(this_$iv) == null) { ChildLayerDependenciesTracker.access$getOldDependenciesSet$p(this_$iv); MutableScatterSet mutableScatterSet1 = ScatterSetKt.mutableScatterSetOf(), it$iv = mutableScatterSet1; int $i$a$-also-ChildLayerDependenciesTracker$withTracking$1$oldSet$1$iv = 0; ChildLayerDependenciesTracker.access$setOldDependenciesSet$p(this_$iv, it$iv); }  MutableScatterSet mutableScatterSet = mutableScatterSet1; mutableScatterSet.addAll((ScatterSet)currentSet$iv); currentSet$iv.clear(); }  ChildLayerDependenciesTracker.access$getDependenciesSet$p(this_$iv); ChildLayerDependenciesTracker.access$setTrackingInProgress$p(this_$iv, true); int $i$a$-withTracking-GraphicsLayer$trackRecord$2 = 0; this.snapshotObserver.observeReads(this, GraphicsLayer$trackRecord$2$1.INSTANCE, block); ChildLayerDependenciesTracker.access$setTrackingInProgress$p(this_$iv, false); if (ChildLayerDependenciesTracker.access$getOldDependency$p(this_$iv) != null) { GraphicsLayer it = ChildLayerDependenciesTracker.access$getOldDependency$p(this_$iv); int $i$a$-withTracking-GraphicsLayer$trackRecord$1 = 0; it.onRemovedFromParentLayer(); }  ChildLayerDependenciesTracker.access$getOldDependency$p(this_$iv); MutableScatterSet oldSet$iv = ChildLayerDependenciesTracker.access$getOldDependenciesSet$p(this_$iv); int $i$a$-let-ChildLayerDependenciesTracker$withTracking$2$iv = 0; if (oldSet$iv.isNotEmpty()) { ScatterSet this_$iv$iv = (ScatterSet)oldSet$iv; int $i$f$forEach = 0; Object[] k$iv$iv = this_$iv$iv.elements; ScatterSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
/*     */       
/* 556 */       long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 557 */       int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*     */       
/* 559 */       int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 560 */           long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 561 */           long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 562 */           if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 563 */           { int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 564 */             for (int j$iv$iv$iv = 0;; j$iv$iv$iv++);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 573 */             if (bitCount$iv$iv$iv == 8)
/*     */               continue;  break; }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*     */            // Byte code: goto -> 374
/*     */         }  }
/*     */       else {  }
/* 578 */        oldSet$iv.clear(); }  ChildLayerDependenciesTracker.access$getOldDependenciesSet$p(this_$iv); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "invoke"}) static final class GraphicsLayer$trackRecord$2$1 extends Lambda implements Function1<GraphicsLayer, Unit> {
/*     */     public static final GraphicsLayer$trackRecord$2$1 INSTANCE = new GraphicsLayer$trackRecord$2$1(); public final void invoke(@NotNull GraphicsLayer it) { Intrinsics.checkNotNullParameter(it, "it"); it.requestDraw(); } GraphicsLayer$trackRecord$2$1() { super(1); } } private final void addSubLayer(GraphicsLayer graphicsLayer) { if (this.childDependenciesTracker.onDependencyAdded(graphicsLayer)) graphicsLayer.onAddedToParentLayer();  }
/*     */   public final boolean getClip() { return this.clip; }
/*     */   public final void setClip(boolean value) { this.clip = value; requestDraw(); }
/* 582 */   private final Outline createOutlineWithPosition-TNW_H78(long outlineTopLeft, long outlineSize, Function2 block) { int $i$f$createOutlineWithPosition-TNW_H78 = 0; long $this$isUnspecified$iv = outlineSize; int $i$f$isUnspecified-uvyYCjk = 0; long targetSize = (($this$isUnspecified$iv == 9205357640488583168L)) ? IntSizeKt.toSize-ozmzZPI(this.size) : outlineSize; return (Outline)block.invoke(Offset.box-impl(outlineTopLeft), Size.box-impl(targetSize)); } private final Outline configureOutline() { Outline tmpOutline = this.internalOutline; if (this.outlineDirty || tmpOutline == null)
/* 583 */     { Path tmpPath = this.outlinePath; GraphicsLayer graphicsLayer = this; long l1 = this.roundRectOutlineTopLeft; long outlineSize$iv = this.roundRectOutlineSize; int $i$f$createOutlineWithPosition-TNW_H78 = 0; long $this$isUnspecified$iv$iv = outlineSize$iv; int $i$f$isUnspecified-uvyYCjk = 0; long targetSize$iv = (
/* 584 */         ($this$isUnspecified$iv$iv == 9205357640488583168L)) ? 
/* 585 */         IntSizeKt.toSize-ozmzZPI(graphicsLayer.size) : 
/*     */         
/* 587 */         outlineSize$iv;
/*     */       
/* 589 */       long l2 = targetSize$iv, outlineTopLeft = l1; int $i$a$-createOutlineWithPosition-TNW_H78-GraphicsLayer$configureOutline$1 = 0; tmpOutline = (tmpPath != null) ? (Outline)new Outline.Generic(tmpPath) : ((this.roundRectCornerRadius > 0.0F) ? (Outline)new Outline.Rounded(RoundRectKt.RoundRect-gG7oq9Y(Offset.getX-impl(outlineTopLeft), Offset.getY-impl(outlineTopLeft), Offset.getX-impl(outlineTopLeft) + Size.getWidth-impl(l2), Offset.getY-impl(outlineTopLeft) + Size.getHeight-impl(l2), CornerRadiusKt.CornerRadius$default(this.roundRectCornerRadius, 0.0F, 2, null))) : (Outline)new Outline.Rectangle(new Rect(Offset.getX-impl(outlineTopLeft), Offset.getY-impl(outlineTopLeft), Offset.getX-impl(outlineTopLeft) + Size.getWidth-impl(l2), Offset.getY-impl(outlineTopLeft) + Size.getHeight-impl(l2)))); this.internalOutline = tmpOutline; this.outlineDirty = false; }  return tmpOutline; } public final void draw$ui_graphics(@NotNull Canvas canvas, @Nullable GraphicsLayer parentLayer) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'canvas'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: getfield isReleased : Z
/*     */     //   11: ifeq -> 15
/*     */     //   14: return
/*     */     //   15: iconst_0
/*     */     //   16: istore_3
/*     */     //   17: aload_2
/*     */     //   18: dup
/*     */     //   19: ifnull -> 29
/*     */     //   22: aload_0
/*     */     //   23: invokespecial addSubLayer : (Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V
/*     */     //   26: goto -> 30
/*     */     //   29: pop
/*     */     //   30: aload_0
/*     */     //   31: getfield drawState : Landroidx/compose/runtime/MutableState;
/*     */     //   34: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   39: pop
/*     */     //   40: aload_0
/*     */     //   41: getfield picture : Lorg/jetbrains/skia/Picture;
/*     */     //   44: dup
/*     */     //   45: ifnull -> 481
/*     */     //   48: astore #4
/*     */     //   50: iconst_0
/*     */     //   51: istore #5
/*     */     //   53: aload_0
/*     */     //   54: invokespecial configureOutline : ()Landroidx/compose/ui/graphics/Outline;
/*     */     //   57: pop
/*     */     //   58: aload_0
/*     */     //   59: invokespecial updateMatrix : ()V
/*     */     //   62: aload_1
/*     */     //   63: invokeinterface save : ()V
/*     */     //   68: iload_3
/*     */     //   69: iconst_1
/*     */     //   70: iadd
/*     */     //   71: istore_3
/*     */     //   72: aload_1
/*     */     //   73: aload_0
/*     */     //   74: getfield matrix : [F
/*     */     //   77: invokeinterface concat-58bKbWc : ([F)V
/*     */     //   82: aload_1
/*     */     //   83: aload_0
/*     */     //   84: getfield topLeft : J
/*     */     //   87: invokestatic getX-impl : (J)I
/*     */     //   90: i2f
/*     */     //   91: aload_0
/*     */     //   92: getfield topLeft : J
/*     */     //   95: invokestatic getY-impl : (J)I
/*     */     //   98: i2f
/*     */     //   99: invokeinterface translate : (FF)V
/*     */     //   104: aload_0
/*     */     //   105: getfield shadowElevation : F
/*     */     //   108: fconst_0
/*     */     //   109: fcmpl
/*     */     //   110: ifle -> 118
/*     */     //   113: aload_0
/*     */     //   114: aload_1
/*     */     //   115: invokespecial drawShadow : (Landroidx/compose/ui/graphics/Canvas;)V
/*     */     //   118: aload_0
/*     */     //   119: getfield clip : Z
/*     */     //   122: ifne -> 134
/*     */     //   125: aload_0
/*     */     //   126: getfield shadowElevation : F
/*     */     //   129: fconst_0
/*     */     //   130: fcmpl
/*     */     //   131: ifle -> 262
/*     */     //   134: aload_1
/*     */     //   135: invokeinterface save : ()V
/*     */     //   140: iload_3
/*     */     //   141: iconst_1
/*     */     //   142: iadd
/*     */     //   143: istore_3
/*     */     //   144: aload_0
/*     */     //   145: getfield internalOutline : Landroidx/compose/ui/graphics/Outline;
/*     */     //   148: astore #6
/*     */     //   150: aload #6
/*     */     //   152: instanceof androidx/compose/ui/graphics/Outline$Rectangle
/*     */     //   155: ifeq -> 176
/*     */     //   158: aload_1
/*     */     //   159: aload #6
/*     */     //   161: checkcast androidx/compose/ui/graphics/Outline$Rectangle
/*     */     //   164: invokevirtual getRect : ()Landroidx/compose/ui/geometry/Rect;
/*     */     //   167: iconst_0
/*     */     //   168: iconst_2
/*     */     //   169: aconst_null
/*     */     //   170: invokestatic clipRect-mtrdD-E$default : (Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/geometry/Rect;IILjava/lang/Object;)V
/*     */     //   173: goto -> 262
/*     */     //   176: aload #6
/*     */     //   178: instanceof androidx/compose/ui/graphics/Outline$Rounded
/*     */     //   181: ifeq -> 205
/*     */     //   184: aload_1
/*     */     //   185: checkcast androidx/compose/ui/graphics/SkiaBackedCanvas
/*     */     //   188: aload #6
/*     */     //   190: checkcast androidx/compose/ui/graphics/Outline$Rounded
/*     */     //   193: invokevirtual getRoundRect : ()Landroidx/compose/ui/geometry/RoundRect;
/*     */     //   196: iconst_0
/*     */     //   197: iconst_2
/*     */     //   198: aconst_null
/*     */     //   199: invokestatic clipRoundRect-mtrdD-E$default : (Landroidx/compose/ui/graphics/SkiaBackedCanvas;Landroidx/compose/ui/geometry/RoundRect;IILjava/lang/Object;)V
/*     */     //   202: goto -> 262
/*     */     //   205: aload #6
/*     */     //   207: instanceof androidx/compose/ui/graphics/Outline$Generic
/*     */     //   210: ifeq -> 231
/*     */     //   213: aload_1
/*     */     //   214: aload #6
/*     */     //   216: checkcast androidx/compose/ui/graphics/Outline$Generic
/*     */     //   219: invokevirtual getPath : ()Landroidx/compose/ui/graphics/Path;
/*     */     //   222: iconst_0
/*     */     //   223: iconst_2
/*     */     //   224: aconst_null
/*     */     //   225: invokestatic clipPath-mtrdD-E$default : (Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Path;IILjava/lang/Object;)V
/*     */     //   228: goto -> 262
/*     */     //   231: aload #6
/*     */     //   233: ifnonnull -> 262
/*     */     //   236: aload_1
/*     */     //   237: fconst_0
/*     */     //   238: fconst_0
/*     */     //   239: aload_0
/*     */     //   240: getfield size : J
/*     */     //   243: invokestatic getWidth-impl : (J)I
/*     */     //   246: i2f
/*     */     //   247: aload_0
/*     */     //   248: getfield size : J
/*     */     //   251: invokestatic getHeight-impl : (J)I
/*     */     //   254: i2f
/*     */     //   255: iconst_0
/*     */     //   256: bipush #16
/*     */     //   258: aconst_null
/*     */     //   259: invokestatic clipRect-N_I0leg$default : (Landroidx/compose/ui/graphics/Canvas;FFFFIILjava/lang/Object;)V
/*     */     //   262: aload_0
/*     */     //   263: invokespecial requiresLayer : ()Z
/*     */     //   266: istore #6
/*     */     //   268: iload #6
/*     */     //   270: ifeq -> 422
/*     */     //   273: aload_1
/*     */     //   274: new androidx/compose/ui/geometry/Rect
/*     */     //   277: dup
/*     */     //   278: fconst_0
/*     */     //   279: fconst_0
/*     */     //   280: aload_0
/*     */     //   281: getfield size : J
/*     */     //   284: invokestatic getWidth-impl : (J)I
/*     */     //   287: i2f
/*     */     //   288: aload_0
/*     */     //   289: getfield size : J
/*     */     //   292: invokestatic getHeight-impl : (J)I
/*     */     //   295: i2f
/*     */     //   296: invokespecial <init> : (FFFF)V
/*     */     //   299: invokestatic Paint : ()Landroidx/compose/ui/graphics/Paint;
/*     */     //   302: astore #7
/*     */     //   304: aload #7
/*     */     //   306: astore #8
/*     */     //   308: astore #9
/*     */     //   310: astore #10
/*     */     //   312: iconst_0
/*     */     //   313: istore #11
/*     */     //   315: aload #8
/*     */     //   317: aload_0
/*     */     //   318: getfield alpha : F
/*     */     //   321: invokeinterface setAlpha : (F)V
/*     */     //   326: aload #8
/*     */     //   328: invokeinterface asFrameworkPaint : ()Lorg/jetbrains/skia/Paint;
/*     */     //   333: astore #12
/*     */     //   335: aload #12
/*     */     //   337: astore #13
/*     */     //   339: iconst_0
/*     */     //   340: istore #14
/*     */     //   342: aload #13
/*     */     //   344: aload_0
/*     */     //   345: getfield renderEffect : Landroidx/compose/ui/graphics/RenderEffect;
/*     */     //   348: dup
/*     */     //   349: ifnull -> 358
/*     */     //   352: invokevirtual asSkiaImageFilter : ()Lorg/jetbrains/skia/ImageFilter;
/*     */     //   355: goto -> 360
/*     */     //   358: pop
/*     */     //   359: aconst_null
/*     */     //   360: invokevirtual setImageFilter : (Lorg/jetbrains/skia/ImageFilter;)V
/*     */     //   363: aload #13
/*     */     //   365: aload_0
/*     */     //   366: getfield colorFilter : Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   369: dup
/*     */     //   370: ifnull -> 379
/*     */     //   373: invokestatic asSkiaColorFilter : (Landroidx/compose/ui/graphics/ColorFilter;)Lorg/jetbrains/skia/ColorFilter;
/*     */     //   376: goto -> 381
/*     */     //   379: pop
/*     */     //   380: aconst_null
/*     */     //   381: invokevirtual setColorFilter : (Lorg/jetbrains/skia/ColorFilter;)V
/*     */     //   384: aload #13
/*     */     //   386: aload_0
/*     */     //   387: getfield blendMode : I
/*     */     //   390: invokestatic toSkia-s9anfk8 : (I)Lorg/jetbrains/skia/BlendMode;
/*     */     //   393: invokevirtual setBlendMode : (Lorg/jetbrains/skia/BlendMode;)V
/*     */     //   396: nop
/*     */     //   397: nop
/*     */     //   398: nop
/*     */     //   399: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   402: astore #15
/*     */     //   404: aload #10
/*     */     //   406: aload #9
/*     */     //   408: aload #7
/*     */     //   410: invokeinterface saveLayer : (Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Paint;)V
/*     */     //   415: iload_3
/*     */     //   416: iconst_1
/*     */     //   417: iadd
/*     */     //   418: istore_3
/*     */     //   419: goto -> 432
/*     */     //   422: aload_1
/*     */     //   423: invokeinterface save : ()V
/*     */     //   428: iload_3
/*     */     //   429: iconst_1
/*     */     //   430: iadd
/*     */     //   431: istore_3
/*     */     //   432: aload_1
/*     */     //   433: invokestatic getNativeCanvas : (Landroidx/compose/ui/graphics/Canvas;)Lorg/jetbrains/skia/Canvas;
/*     */     //   436: aload #4
/*     */     //   438: aconst_null
/*     */     //   439: aconst_null
/*     */     //   440: invokevirtual drawPicture : (Lorg/jetbrains/skia/Picture;Lorg/jetbrains/skia/Matrix33;Lorg/jetbrains/skia/Paint;)Lorg/jetbrains/skia/Canvas;
/*     */     //   443: pop
/*     */     //   444: iload_3
/*     */     //   445: istore #7
/*     */     //   447: iconst_0
/*     */     //   448: istore #8
/*     */     //   450: iload #8
/*     */     //   452: iload #7
/*     */     //   454: if_icmpge -> 477
/*     */     //   457: iload #8
/*     */     //   459: istore #11
/*     */     //   461: iconst_0
/*     */     //   462: istore #12
/*     */     //   464: aload_1
/*     */     //   465: invokeinterface restore : ()V
/*     */     //   470: nop
/*     */     //   471: iinc #8, 1
/*     */     //   474: goto -> 450
/*     */     //   477: nop
/*     */     //   478: goto -> 483
/*     */     //   481: pop
/*     */     //   482: nop
/*     */     //   483: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #298	-> 7
/*     */     //   #300	-> 15
/*     */     //   #301	-> 17
/*     */     //   #304	-> 30
/*     */     //   #306	-> 40
/*     */     //   #307	-> 53
/*     */     //   #309	-> 58
/*     */     //   #311	-> 62
/*     */     //   #312	-> 68
/*     */     //   #314	-> 72
/*     */     //   #315	-> 82
/*     */     //   #317	-> 104
/*     */     //   #318	-> 113
/*     */     //   #321	-> 118
/*     */     //   #322	-> 134
/*     */     //   #323	-> 140
/*     */     //   #325	-> 144
/*     */     //   #326	-> 150
/*     */     //   #327	-> 158
/*     */     //   #328	-> 176
/*     */     //   #329	-> 184
/*     */     //   #330	-> 205
/*     */     //   #331	-> 213
/*     */     //   #332	-> 231
/*     */     //   #333	-> 236
/*     */     //   #338	-> 262
/*     */     //   #339	-> 268
/*     */     //   #340	-> 273
/*     */     //   #341	-> 274
/*     */     //   #342	-> 299
/*     */     //   #343	-> 315
/*     */     //   #344	-> 326
/*     */     //   #345	-> 342
/*     */     //   #346	-> 363
/*     */     //   #347	-> 384
/*     */     //   #348	-> 396
/*     */     //   #344	-> 397
/*     */     //   #349	-> 398
/*     */     //   #342	-> 408
/*     */     //   #340	-> 410
/*     */     //   #351	-> 415
/*     */     //   #353	-> 422
/*     */     //   #354	-> 428
/*     */     //   #357	-> 432
/*     */     //   #359	-> 444
/*     */     //   #360	-> 464
/*     */     //   #361	-> 470
/*     */     //   #359	-> 471
/*     */     //   #362	-> 477
/*     */     //   #306	-> 478
/*     */     //   #306	-> 481
/*     */     //   #363	-> 483
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   150	112	6	outline	Landroidx/compose/ui/graphics/Outline;
/*     */     //   342	55	14	$i$a$-apply-GraphicsLayer$draw$1$1$1	I
/*     */     //   339	58	13	$this$draw_u24lambda_u246_u24lambda_u244_u24lambda_u243	Lorg/jetbrains/skia/Paint;
/*     */     //   315	84	11	$i$a$-apply-GraphicsLayer$draw$1$1	I
/*     */     //   312	87	8	$this$draw_u24lambda_u246_u24lambda_u244	Landroidx/compose/ui/graphics/Paint;
/*     */     //   464	7	12	$i$a$-repeat-GraphicsLayer$draw$1$2	I
/*     */     //   461	10	11	it	I
/*     */     //   53	425	5	$i$a$-let-GraphicsLayer$draw$1	I
/*     */     //   268	210	6	useLayer	Z
/*     */     //   50	428	4	it	Lorg/jetbrains/skia/Picture;
/*     */     //   17	467	3	restoreCount	I
/*     */     //   0	484	0	this	Landroidx/compose/ui/graphics/layer/GraphicsLayer;
/*     */     //   0	484	1	canvas	Landroidx/compose/ui/graphics/Canvas;
/*     */     //   0	484	2	parentLayer	Landroidx/compose/ui/graphics/layer/GraphicsLayer; } private final void onAddedToParentLayer() { int i = this.parentLayerUsages; this.parentLayerUsages = i + 1; } private final void onRemovedFromParentLayer() { int i = this.parentLayerUsages; this.parentLayerUsages = i + -1; discardContentIfReleasedAndHaveNoParentLayerUsages(); } public final void release$ui_graphics() { if (!this.isReleased) { this.isReleased = true; discardContentIfReleasedAndHaveNoParentLayerUsages(); }  } public final long getPivotOffset-F1C5BW0() { return this.pivotOffset; } public final void setPivotOffset-k-4lQ0M(long value) { this.pivotOffset = value; invalidateMatrix$default(this, false, 1, null); } public final int getBlendMode-0nO6VwU() { return this.blendMode; } public final void setBlendMode-s9anfk8(int value) { this.blendMode = value; requestDraw(); } @Nullable public final ColorFilter getColorFilter() { return this.colorFilter; } public final void setColorFilter(@Nullable ColorFilter value) { this.colorFilter = value; requestDraw(); } private final void resetOutlineParams() { this.internalOutline = null; this.outlinePath = null; this.roundRectOutlineSize = Size.Companion.getUnspecified-NH-jbRc(); this.roundRectOutlineTopLeft = Offset.Companion.getZero-F1C5BW0(); this.roundRectCornerRadius = 0.0F; this.outlineDirty = true; } public final void setRoundRectOutline-TNW_H78(long topLeft, long size, float cornerRadius) { resetOutlineParams(); this.roundRectOutlineTopLeft = topLeft; this.roundRectOutlineSize = size; this.roundRectCornerRadius = cornerRadius; } public final void setPathOutline(@NotNull Path path) { Intrinsics.checkNotNullParameter(path, "path"); resetOutlineParams(); this.outlinePath = path; } @NotNull public final Outline getOutline() { return configureOutline(); } public final void setRectOutline-tz77jQw(long topLeft, long size) { setRoundRectOutline-TNW_H78(topLeft, size, 0.0F); } private final void updateMatrix() { if (!this.matrixDirty) return;  float pivotX = 0.0F; float pivotY = 0.0F; if (OffsetKt.isUnspecified-k-4lQ0M(this.pivotOffset)) { pivotX = IntSize.getWidth-impl(this.size) / 2.0F; pivotY = IntSize.getHeight-impl(this.size) / 2.0F; } else { pivotX = Offset.getX-impl(this.pivotOffset); pivotY = Offset.getY-impl(this.pivotOffset); }  Matrices_skikoKt.prepareTransformationMatrix-ao2toNE(this.matrix, pivotX, pivotY, this.translationX, this.translationY, this.rotationX, this.rotationY, this.rotationZ, this.scaleX, this.scaleY, this.cameraDistance); this.matrixDirty = false; } public final boolean isReleased() { return this.isReleased; }
/* 590 */   private final void discardContentIfReleasedAndHaveNoParentLayerUsages() { ChildLayerDependenciesTracker this_$iv; if (this.isReleased && this.parentLayerUsages == 0) { if (this.picture != null) { this.picture.close(); } else {  }  this.pictureRecorder.close(); this_$iv = this.childDependenciesTracker; int $i$f$removeDependencies = 0; if (ChildLayerDependenciesTracker.access$getDependency$p(this_$iv) != null) { GraphicsLayer graphicsLayer1 = ChildLayerDependenciesTracker.access$getDependency$p(this_$iv); int $i$a$-let-ChildLayerDependenciesTracker$removeDependencies$1$iv = 0;
/* 591 */         GraphicsLayer it = graphicsLayer1; int $i$a$-removeDependencies-GraphicsLayer$discardContentIfReleasedAndHaveNoParentLayerUsages$1 = 0; it.onRemovedFromParentLayer();
/* 592 */         ChildLayerDependenciesTracker.access$setDependency$p(this_$iv, null); }  ChildLayerDependenciesTracker.access$getDependency$p(this_$iv); }
/*     */     else { return; }
/* 594 */      MutableScatterSet it$iv = ChildLayerDependenciesTracker.access$getDependenciesSet$p(this_$iv); int $i$a$-let-ChildLayerDependenciesTracker$removeDependencies$2$iv = 0;
/* 595 */     ScatterSet this_$iv$iv = (ScatterSet)it$iv; int $i$f$forEach = 0;
/*     */     
/* 597 */     Object[] k$iv$iv = this_$iv$iv.elements;
/*     */     
/* 599 */     ScatterSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
/*     */     
/* 601 */     long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 602 */     int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*     */     
/* 604 */     int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 605 */         long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 606 */         long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 607 */         if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 608 */         { int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 609 */           for (int j$iv$iv$iv = 0;; j$iv$iv$iv++);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 618 */           if (bitCount$iv$iv$iv == 8)
/*     */             continue;  break; }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*     */          // Byte code: goto -> 301
/*     */       }  }
/*     */     else {  }
/* 623 */      it$iv.clear(); ChildLayerDependenciesTracker.access$getDependenciesSet$p(this_$iv); this.snapshotObserver.clear(this); } public final long getAmbientShadowColor-0d7_KjU() { return this.ambientShadowColor; } public final void setAmbientShadowColor-8_81llA(long value) { this.ambientShadowColor = value; requestDraw(); } public final long getSpotShadowColor-0d7_KjU() { return this.spotShadowColor; }
/*     */   public final void setSpotShadowColor-8_81llA(long value) { this.spotShadowColor = value; requestDraw(); }
/*     */   private final boolean requiresLayer() { boolean alphaNeedsLayer = (this.alpha < 1.0F && !CompositingStrategy.equals-impl0(this.compositingStrategy, CompositingStrategy.Companion.getModulateAlpha-ke2Ky5w())); boolean hasColorFilter = (this.colorFilter != null); boolean hasBlendMode = !BlendMode.equals-impl0(this.blendMode, BlendMode.Companion.getSrcOver-0nO6VwU()); boolean hasRenderEffect = (this.renderEffect != null); boolean offscreenBufferRequested = CompositingStrategy.equals-impl0(this.compositingStrategy, CompositingStrategy.Companion.getOffscreen-ke2Ky5w()); return (alphaNeedsLayer || hasColorFilter || hasBlendMode || hasRenderEffect || offscreenBufferRequested); }
/* 626 */   private final void drawShadow(Canvas canvas) { Density $this$drawShadow_u24lambda_u2410 = this.density; int $i$a$-with-GraphicsLayer$drawShadow$1 = 0; Outline tmpOutline = this.internalOutline; Path path1 = SkiaBackedPath_skikoKt.Path(), $this$drawShadow_u24lambda_u2410_u24lambda_u248 = path1; int $i$a$-apply-GraphicsLayer$drawShadow$1$path$1 = 0; Path.addRect$default($this$drawShadow_u24lambda_u2410_u24lambda_u248, ((Outline.Rectangle)tmpOutline).getRect(), null, 2, null); Path $this$drawShadow_u24lambda_u2410_u24lambda_u249 = path1 = SkiaBackedPath_skikoKt.Path(); int $i$a$-apply-GraphicsLayer$drawShadow$1$path$2 = 0; Path.addRoundRect$default($this$drawShadow_u24lambda_u2410_u24lambda_u249, ((Outline.Rounded)tmpOutline).getRoundRect(), null, 2, null); if (tmpOutline instanceof Outline.Generic) {  } else { return; }
/* 627 */      Path path = (tmpOutline instanceof Outline.Rectangle) ? path1 : ((tmpOutline instanceof Outline.Rounded) ? path1 : (Path)"JD-Core does not support Kotlin"); Point3 zParams = new Point3(0.0F, 0.0F, this.shadowElevation); int $this$dp$iv = 300, $i$f$getDp = 0; $this$dp$iv = 600; $i$f$getDp = 0; Point3 lightPos = new Point3(0.0F, -$this$drawShadow_u24lambda_u2410.toPx-0680j_4(Dp.constructor-impl($this$dp$iv)), $this$drawShadow_u24lambda_u2410.toPx-0680j_4(Dp.constructor-impl($this$dp$iv))); int i = 800, j = 0;
/* 628 */     float lightRad = $this$drawShadow_u24lambda_u2410.toPx-0680j_4(Dp.constructor-impl(i));
/*     */     float ambientAlpha = 0.039F * this.alpha;
/*     */     float spotAlpha = 0.19F * this.alpha;
/*     */     long ambientColor = Color.copy-wmQWz5c$default(this.ambientShadowColor, ambientAlpha, 0.0F, 0.0F, 0.0F, 14, null);
/*     */     long spotColor = Color.copy-wmQWz5c$default(this.spotShadowColor, spotAlpha, 0.0F, 0.0F, 0.0F, 14, null);
/*     */     ShadowUtils.INSTANCE.drawShadow(SkiaBackedCanvas_skikoKt.getNativeCanvas(canvas), SkiaBackedPath_skikoKt.asSkiaPath(path), zParams, lightPos, lightRad, ColorKt.toArgb-8_81llA(ambientColor), ColorKt.toArgb-8_81llA(spotColor), (this.alpha < 1.0F), false); }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object toImageBitmap(@NotNull Continuation $completion) {
/*     */     ImageBitmap imageBitmap1 = ImageBitmapKt.ImageBitmap-x__-hDU$default(IntSize.getWidth-impl(this.size), IntSize.getHeight-impl(this.size), 0, false, null, 28, null), $this$toImageBitmap_u24lambda_u2411 = imageBitmap1;
/*     */     int $i$a$-apply-GraphicsLayer$toImageBitmap$2 = 0;
/*     */     draw$ui_graphics(CanvasKt.Canvas($this$toImageBitmap_u24lambda_u2411), null);
/*     */     return imageBitmap1;
/*     */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\layer\GraphicsLayer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */