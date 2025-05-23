/*     */ package androidx.compose.ui.graphics.painter;
/*     */ 
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.graphics.ColorFilter;
/*     */ import androidx.compose.ui.graphics.FilterQuality;
/*     */ import androidx.compose.ui.graphics.ImageBitmap;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*     */ import androidx.compose.ui.unit.IntOffset;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import androidx.compose.ui.unit.IntSizeKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000`\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\003\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\030\0002\0020\001B!\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\bJ\020\020\032\032\0020\0332\006\020\t\032\0020\nH\024J\022\020\034\032\0020\0332\b\020\013\032\004\030\0010\fH\024J\023\020\035\032\0020\0332\b\020\036\032\004\030\0010\037H\002J\b\020 \032\0020!H\026J\b\020\"\032\0020#H\026J\"\020$\032\0020\0072\006\020\004\032\0020\0052\006\020\006\032\0020\007H\002ø\001\000¢\006\004\b%\020&J\f\020'\032\0020(*\0020)H\024R\016\020\t\032\0020\nX\016¢\006\002\n\000R\020\020\013\032\004\030\0010\fX\016¢\006\002\n\000R\"\020\r\032\0020\016X\016ø\001\000ø\001\001¢\006\020\n\002\020\023\032\004\b\017\020\020\"\004\b\021\020\022R\016\020\002\032\0020\003X\004¢\006\002\n\000R\032\020\024\032\0020\0258VX\004ø\001\000ø\001\001¢\006\006\032\004\b\026\020\027R\026\020\030\032\0020\007X\004ø\001\000ø\001\001¢\006\004\n\002\020\031R\026\020\004\032\0020\005X\004ø\001\000ø\001\001¢\006\004\n\002\020\031R\026\020\006\032\0020\007X\004ø\001\000ø\001\001¢\006\004\n\002\020\031\002\013\n\005\b¡\0360\001\n\002\b!¨\006*"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/graphics/ImageBitmap;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "getFilterQuality-f-v9h1I$ui_graphics", "()I", "setFilterQuality-vDHp3xo$ui_graphics", "(I)V", "I", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "size", "J", "applyAlpha", "", "applyColorFilter", "equals", "other", "", "hashCode", "", "toString", "", "validateSize", "validateSize-N5eqBDc", "(JJ)J", "onDraw", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nBitmapPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainter\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,159:1\n26#2:160\n26#2:161\n*S KotlinDebug\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainter\n*L\n98#1:160\n99#1:161\n*E\n"})
/*     */ public final class BitmapPainter
/*     */   extends Painter
/*     */ {
/*     */   @NotNull
/*     */   private final ImageBitmap image;
/*     */   private final long srcOffset;
/*     */   private final long srcSize;
/*     */   
/*     */   private BitmapPainter(ImageBitmap image, long srcOffset, long srcSize) {
/*  72 */     this.image = image;
/*  73 */     this.srcOffset = srcOffset;
/*  74 */     this.srcSize = srcSize;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  84 */     this.filterQuality = FilterQuality.Companion.getLow-f-v9h1I();
/*     */     
/*  86 */     this.size = validateSize-N5eqBDc(this.srcOffset, this.srcSize);
/*     */     
/*  88 */     this.alpha = 1.0F;
/*     */   }
/*     */   private int filterQuality; private final long size; private float alpha; @Nullable
/*     */   private ColorFilter colorFilter;
/*     */   protected void onDraw(@NotNull DrawScope $this$onDraw) {
/*  93 */     Intrinsics.checkNotNullParameter($this$onDraw, "<this>");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  98 */     float $this$fastRoundToInt$iv = Size.getWidth-impl($this$onDraw.getSize-NH-jbRc()); int $i$f$fastRoundToInt = 0;
/*  99 */     $this$fastRoundToInt$iv = Size.getHeight-impl($this$onDraw.getSize-NH-jbRc()); $i$f$fastRoundToInt = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 160 */     DrawScope.drawImage-AZ2fEMs$default($this$onDraw, this.image, this.srcOffset, this.srcSize, 0L, IntSizeKt.IntSize(Math.round($this$fastRoundToInt$iv), 
/* 161 */           Math.round($this$fastRoundToInt$iv)), this.alpha, null, this.colorFilter, 0, this.filterQuality, 328, null);
/*     */   }
/*     */   
/*     */   public final int getFilterQuality-f-v9h1I$ui_graphics() {
/*     */     return this.filterQuality;
/*     */   }
/*     */   
/*     */   public final void setFilterQuality-vDHp3xo$ui_graphics(int <set-?>) {
/*     */     this.filterQuality = <set-?>;
/*     */   }
/*     */   
/*     */   public long getIntrinsicSize-NH-jbRc() {
/*     */     return IntSizeKt.toSize-ozmzZPI(this.size);
/*     */   }
/*     */   
/*     */   protected boolean applyAlpha(float alpha) {
/*     */     this.alpha = alpha;
/*     */     return true;
/*     */   }
/*     */   
/*     */   protected boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
/*     */     this.colorFilter = colorFilter;
/*     */     return true;
/*     */   }
/*     */   
/*     */   private final long validateSize-N5eqBDc(long srcOffset, long srcSize) {
/*     */     if (!((IntOffset.getX-impl(srcOffset) >= 0 && IntOffset.getY-impl(srcOffset) >= 0 && IntSize.getWidth-impl(srcSize) >= 0 && IntSize.getHeight-impl(srcSize) >= 0 && IntSize.getWidth-impl(srcSize) <= this.image.getWidth() && IntSize.getHeight-impl(srcSize) <= this.image.getHeight()) ? 1 : 0)) {
/*     */       String str = "Failed requirement.";
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     return srcSize;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof BitmapPainter))
/*     */       return false; 
/*     */     if (!Intrinsics.areEqual(this.image, ((BitmapPainter)other).image))
/*     */       return false; 
/*     */     if (!IntOffset.equals-impl0(this.srcOffset, ((BitmapPainter)other).srcOffset))
/*     */       return false; 
/*     */     if (!IntSize.equals-impl0(this.srcSize, ((BitmapPainter)other).srcSize))
/*     */       return false; 
/*     */     if (!FilterQuality.equals-impl0(this.filterQuality, ((BitmapPainter)other).filterQuality))
/*     */       return false; 
/*     */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     int result = this.image.hashCode();
/*     */     result = 31 * result + IntOffset.hashCode-impl(this.srcOffset);
/*     */     result = 31 * result + IntSize.hashCode-impl(this.srcSize);
/*     */     result = 31 * result + FilterQuality.hashCode-impl(this.filterQuality);
/*     */     return result;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "BitmapPainter(image=" + this.image + ", srcOffset=" + IntOffset.toString-impl(this.srcOffset) + ", srcSize=" + IntSize.toString-impl(this.srcSize) + ", filterQuality=" + FilterQuality.toString-impl(this.filterQuality) + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\painter\BitmapPainter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */