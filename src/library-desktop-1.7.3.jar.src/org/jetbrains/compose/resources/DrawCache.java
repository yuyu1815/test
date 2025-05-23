/*     */ package org.jetbrains.compose.resources;
/*     */ 
/*     */ import androidx.compose.ui.graphics.Canvas;
/*     */ import androidx.compose.ui.graphics.ColorFilter;
/*     */ import androidx.compose.ui.graphics.ImageBitmap;
/*     */ import androidx.compose.ui.graphics.ImageBitmapConfig;
/*     */ import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000b\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\007\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002JI\020\030\032\0020\0312\006\020\007\032\0020\b2\006\020\025\032\0020\0262\006\020\032\032\0020\0242\006\020\n\032\0020\0132\027\020\033\032\023\022\004\022\0020\035\022\004\022\0020\0310\034¢\006\002\b\036ø\001\000¢\006\004\b\037\020 J$\020!\032\0020\0312\006\020\"\032\0020\0352\b\b\002\020#\032\0020$2\n\b\002\020%\032\004\030\0010&J\f\020'\032\0020\031*\0020\035H\002R\016\020\003\032\0020\004X\004¢\006\002\n\000R\020\020\005\032\004\030\0010\006X\016¢\006\002\n\000R\026\020\007\032\0020\bX\016ø\001\000ø\001\001¢\006\004\n\002\020\tR\016\020\n\032\0020\013X\016¢\006\002\n\000R&\020\f\032\004\030\0010\r8\000@\000X\016¢\006\024\n\000\022\004\b\016\020\002\032\004\b\017\020\020\"\004\b\021\020\022R\020\020\023\032\004\030\0010\024X\016¢\006\002\n\000R\026\020\025\032\0020\026X\016ø\001\000ø\001\001¢\006\004\n\002\020\027\002\013\n\005\b¡\0360\001\n\002\b!¨\006("}, d2 = {"Lorg/jetbrains/compose/resources/DrawCache;", "", "()V", "cacheScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "cachedCanvas", "Landroidx/compose/ui/graphics/Canvas;", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "I", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "mCachedImage", "Landroidx/compose/ui/graphics/ImageBitmap;", "getMCachedImage$annotations", "getMCachedImage", "()Landroidx/compose/ui/graphics/ImageBitmap;", "setMCachedImage", "(Landroidx/compose/ui/graphics/ImageBitmap;)V", "scopeDensity", "Landroidx/compose/ui/unit/Density;", "size", "Landroidx/compose/ui/unit/IntSize;", "J", "drawCachedImage", "", "density", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "drawCachedImage-FqjB98A", "(IJLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Lkotlin/jvm/functions/Function1;)V", "drawInto", "target", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "clear", "library"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nDrawCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawCache.kt\norg/jetbrains/compose/resources/DrawCache\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,95:1\n546#2,17:96\n*S KotlinDebug\n*F\n+ 1 DrawCache.kt\norg/jetbrains/compose/resources/DrawCache\n*L\n65#1:96,17\n*E\n"})
/*     */ public final class DrawCache {
/*     */   @Nullable
/*     */   private ImageBitmap mCachedImage;
/*     */   
/*     */   @Nullable
/*  26 */   public final ImageBitmap getMCachedImage() { return this.mCachedImage; } @Nullable private Canvas cachedCanvas; @Nullable private Density scopeDensity; public final void setMCachedImage(@Nullable ImageBitmap <set-?>) { this.mCachedImage = <set-?>; }
/*     */   
/*     */   @NotNull
/*  29 */   private LayoutDirection layoutDirection = LayoutDirection.Ltr;
/*  30 */   private long size = IntSize.Companion.getZero-YbymL2g();
/*  31 */   private int config = ImageBitmapConfig.Companion.getArgb8888-_sVssgQ();
/*     */   @NotNull
/*  33 */   private final CanvasDrawScope cacheScope = new CanvasDrawScope();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int $stable = 8;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void drawCachedImage-FqjB98A(int config, long size, @NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Function1 block) {
/*  47 */     Intrinsics.checkNotNullParameter(density, "density"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(block, "block"); this.scopeDensity = density;
/*  48 */     this.layoutDirection = layoutDirection;
/*  49 */     ImageBitmap targetImage = this.mCachedImage;
/*  50 */     Canvas targetCanvas = this.cachedCanvas;
/*  51 */     if (targetImage == null || 
/*  52 */       targetCanvas == null || 
/*  53 */       IntSize.getWidth-impl(size) > targetImage.getWidth() || 
/*  54 */       IntSize.getHeight-impl(size) > targetImage.getHeight() || 
/*  55 */       !ImageBitmapConfig.equals-impl0(this.config, config)) {
/*     */       
/*  57 */       targetImage = ImageBitmapKt.ImageBitmap-x__-hDU$default(IntSize.getWidth-impl(size), IntSize.getHeight-impl(size), config, false, null, 24, null);
/*  58 */       targetCanvas = CanvasKt.Canvas(targetImage);
/*     */       
/*  60 */       this.mCachedImage = targetImage;
/*  61 */       this.cachedCanvas = targetCanvas;
/*  62 */       this.config = config;
/*     */     } 
/*  64 */     this.size = size;
/*  65 */     CanvasDrawScope canvasDrawScope = this.cacheScope; long size$iv = IntSizeKt.toSize-ozmzZPI(size); int $i$f$draw-yzxVdVo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  96 */     CanvasDrawScope.DrawParams drawParams1 = canvasDrawScope.getDrawParams(); Density prevDensity$iv = drawParams1.component1(); LayoutDirection prevLayoutDirection$iv = drawParams1.component2(); Canvas prevCanvas$iv = drawParams1.component3(); long prevSize$iv = drawParams1.component4-NH-jbRc();
/*  97 */     CanvasDrawScope.DrawParams $this$draw_yzxVdVo_u24lambda_u240$iv = canvasDrawScope.getDrawParams(); int $i$a$-apply-CanvasDrawScope$draw$1$iv = 0;
/*  98 */     $this$draw_yzxVdVo_u24lambda_u240$iv.setDensity(density);
/*  99 */     $this$draw_yzxVdVo_u24lambda_u240$iv.setLayoutDirection(layoutDirection);
/* 100 */     $this$draw_yzxVdVo_u24lambda_u240$iv.setCanvas(targetCanvas);
/* 101 */     $this$draw_yzxVdVo_u24lambda_u240$iv.setSize-uvyYCjk(size$iv);
/*     */     
/* 103 */     targetCanvas.save();
/* 104 */     DrawScope $this$drawCachedImage_FqjB98A_u24lambda_u240 = (DrawScope)canvasDrawScope; int $i$a$-draw-yzxVdVo-DrawCache$drawCachedImage$1 = 0; clear($this$drawCachedImage_FqjB98A_u24lambda_u240); block.invoke($this$drawCachedImage_FqjB98A_u24lambda_u240);
/* 105 */     targetCanvas.restore();
/* 106 */     CanvasDrawScope.DrawParams $this$draw_yzxVdVo_u24lambda_u241$iv = canvasDrawScope.getDrawParams(); int $i$a$-apply-CanvasDrawScope$draw$2$iv = 0;
/* 107 */     $this$draw_yzxVdVo_u24lambda_u241$iv.setDensity(prevDensity$iv);
/* 108 */     $this$draw_yzxVdVo_u24lambda_u241$iv.setLayoutDirection(prevLayoutDirection$iv);
/* 109 */     $this$draw_yzxVdVo_u24lambda_u241$iv.setCanvas(prevCanvas$iv);
/* 110 */     $this$draw_yzxVdVo_u24lambda_u241$iv.setSize-uvyYCjk(prevSize$iv);
/*     */     targetImage.prepareToDraw();
/*     */   }
/*     */   
/*     */   public final void drawInto(@NotNull DrawScope target, float alpha, @Nullable ColorFilter colorFilter) {
/*     */     Intrinsics.checkNotNullParameter(target, "target");
/*     */     ImageBitmap targetImage = this.mCachedImage;
/*     */     if (!((targetImage != null) ? 1 : 0)) {
/*     */       int $i$a$-check-DrawCache$drawInto$1 = 0;
/*     */       String str = "drawCachedImage must be invoked first before attempting to draw the result into another destination";
/*     */       throw new IllegalStateException(str.toString());
/*     */     } 
/*     */     DrawScope.drawImage-AZ2fEMs$default(target, targetImage, 0L, this.size, 0L, 0L, alpha, null, colorFilter, 0, 0, 858, null);
/*     */   }
/*     */   
/*     */   private final void clear(DrawScope $this$clear) {
/*     */     DrawScope.drawRect-n-J9OG0$default($this$clear, Color.Companion.getBlack-0d7_KjU(), 0L, 0L, 0.0F, null, null, BlendMode.Companion.getClear-0nO6VwU(), 62, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\DrawCache.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */