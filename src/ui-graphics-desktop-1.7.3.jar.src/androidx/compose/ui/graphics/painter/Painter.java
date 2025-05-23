/*     */ package androidx.compose.ui.graphics.painter;
/*     */ 
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.geometry.RectKt;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.geometry.SizeKt;
/*     */ import androidx.compose.ui.graphics.Canvas;
/*     */ import androidx.compose.ui.graphics.ColorFilter;
/*     */ import androidx.compose.ui.graphics.Paint;
/*     */ import androidx.compose.ui.graphics.SkiaBackedPaint_skikoKt;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\007\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\016\b&\030\0002\0020\001B\005¢\006\002\020\002J\020\020\026\032\0020\0252\006\020\003\032\0020\004H\024J\022\020\027\032\0020\0252\b\020\005\032\004\030\0010\006H\024J\020\020\030\032\0020\0252\006\020\022\032\0020\023H\024J\020\020\031\032\0020\n2\006\020\003\032\0020\004H\002J\022\020\032\032\0020\n2\b\020\005\032\004\030\0010\006H\002J\020\020\033\032\0020\n2\006\020\034\032\0020\023H\002J\b\020\035\032\0020\021H\002J2\020\036\032\0020\n*\0020\t2\006\020\037\032\0020\r2\b\b\002\020\003\032\0020\0042\n\b\002\020\005\032\004\030\0010\006ø\001\000¢\006\004\b \020!J\f\020\"\032\0020\n*\0020\tH$R\016\020\003\032\0020\004X\016¢\006\002\n\000R\020\020\005\032\004\030\0010\006X\016¢\006\002\n\000R\037\020\007\032\023\022\004\022\0020\t\022\004\022\0020\n0\b¢\006\002\b\013X\004¢\006\002\n\000R\030\020\f\032\0020\rX¦\004ø\001\000ø\001\001¢\006\006\032\004\b\016\020\017R\020\020\020\032\004\030\0010\021X\016¢\006\002\n\000R\016\020\022\032\0020\023X\016¢\006\002\n\000R\016\020\024\032\0020\025X\016¢\006\002\n\000\002\013\n\005\b¡\0360\001\n\002\b!¨\006#"}, d2 = {"Landroidx/compose/ui/graphics/painter/Painter;", "", "()V", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "drawLambda", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "layerPaint", "Landroidx/compose/ui/graphics/Paint;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "useLayer", "", "applyAlpha", "applyColorFilter", "applyLayoutDirection", "configureAlpha", "configureColorFilter", "configureLayoutDirection", "rtl", "obtainPaint", "draw", "size", "draw-x_KDEd0", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/ui/graphics/ColorFilter;)V", "onDraw", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,218:1\n68#2,3:219\n256#2:222\n72#2,3:230\n111#3,7:223\n*S KotlinDebug\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n*L\n195#1:219,3\n206#1:222\n195#1:230,3\n207#1:223,7\n*E\n"})
/*     */ public abstract class Painter
/*     */ {
/*     */   @Nullable
/*     */   private Paint layerPaint;
/*     */   private boolean useLayer;
/*     */   @Nullable
/*     */   private ColorFilter colorFilter;
/*     */   
/*     */   private final Paint obtainPaint() {
/*  53 */     Paint target = this.layerPaint;
/*  54 */     if (target == null) {
/*  55 */       target = SkiaBackedPaint_skikoKt.Paint();
/*  56 */       this.layerPaint = target;
/*     */     } 
/*  58 */     return target;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void configureColorFilter(ColorFilter colorFilter) {
/*  83 */     if (!Intrinsics.areEqual(this.colorFilter, colorFilter)) {
/*  84 */       boolean consumedColorFilter = applyColorFilter(colorFilter);
/*  85 */       if (!consumedColorFilter) {
/*  86 */         if (colorFilter == null) {
/*  87 */           if (this.layerPaint == null) {  } else { this.layerPaint.setColorFilter(null); }
/*  88 */            this.useLayer = false;
/*     */         } else {
/*  90 */           obtainPaint().setColorFilter(colorFilter);
/*  91 */           this.useLayer = true;
/*     */         } 
/*     */       }
/*  94 */       this.colorFilter = colorFilter;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 101 */   private float alpha = 1.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void configureAlpha(float alpha) {
/* 117 */     if (!((this.alpha == alpha) ? 1 : 0)) {
/* 118 */       boolean consumed = applyAlpha(alpha);
/* 119 */       if (!consumed) {
/* 120 */         if ((alpha == 1.0F)) {
/*     */           
/* 122 */           if (this.layerPaint == null) {  } else { this.layerPaint.setAlpha(alpha); }
/* 123 */            this.useLayer = false;
/*     */         } else {
/* 125 */           obtainPaint().setAlpha(alpha);
/* 126 */           this.useLayer = true;
/*     */         } 
/*     */       }
/* 129 */       this.alpha = alpha;
/*     */     } 
/*     */   }
/*     */   @NotNull
/* 133 */   private LayoutDirection layoutDirection = LayoutDirection.Ltr;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void configureLayoutDirection(LayoutDirection rtl) {
/* 142 */     if (this.layoutDirection != rtl) {
/* 143 */       applyLayoutDirection(rtl);
/* 144 */       this.layoutDirection = rtl;
/*     */     } 
/*     */   }
/*     */   @NotNull
/* 148 */   private final Function1<DrawScope, Unit> drawLambda = new Painter$drawLambda$1(); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}) static final class Painter$drawLambda$1 extends Lambda implements Function1<DrawScope, Unit> { public final void invoke(@NotNull DrawScope $this$null) { Intrinsics.checkNotNullParameter($this$null, "$this$null"); Painter.this.onDraw($this$null); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     Painter$drawLambda$1() {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean applyAlpha(float alpha) {
/* 171 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
/* 177 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean applyLayoutDirection(@NotNull LayoutDirection layoutDirection) {
/* 183 */     Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void draw-x_KDEd0(@NotNull DrawScope $this$draw_u2dx_KDEd0, long size, float alpha, @Nullable ColorFilter colorFilter) {
/* 190 */     Intrinsics.checkNotNullParameter($this$draw_u2dx_KDEd0, "$this$draw"); configureAlpha(alpha);
/* 191 */     configureColorFilter(colorFilter);
/* 192 */     configureLayoutDirection($this$draw_u2dx_KDEd0.getLayoutDirection());
/*     */ 
/*     */     
/* 195 */     DrawScope drawScope = $this$draw_u2dx_KDEd0;
/* 196 */     float f1 = 0.0F;
/* 197 */     float f2 = 0.0F;
/* 198 */     float f3 = Size.getWidth-impl($this$draw_u2dx_KDEd0.getSize-NH-jbRc()) - Size.getWidth-impl(size);
/* 199 */     float bottom$iv = Size.getHeight-impl($this$draw_u2dx_KDEd0.getSize-NH-jbRc()) - Size.getHeight-impl(size);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$inset = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 219 */     drawScope.getDrawContext().getTransform().inset(f1, f2, f3, bottom$iv);
/*     */     
/* 221 */     try { DrawScope $this$draw_x_KDEd0_u24lambda_u242 = drawScope; int $i$a$-inset-Painter$draw$1 = 0; if (alpha > 0.0F && Size.getWidth-impl(size) > 0.0F && Size.getHeight-impl(size) > 0.0F) {
/* 222 */         Rect layerRect = RectKt.Rect-tz77jQw(Offset.Companion.getZero-F1C5BW0(), SizeKt.Size(Size.getWidth-impl(size), Size.getHeight-impl(size))); DrawScope $this$drawIntoCanvas$iv = $this$draw_x_KDEd0_u24lambda_u242; int $i$f$drawIntoCanvas = 0; Canvas canvas = $this$drawIntoCanvas$iv.getDrawContext().getCanvas(); int $i$a$-drawIntoCanvas-Painter$draw$1$1 = 0; Canvas canvas1 = canvas; Paint paint$iv = obtainPaint(); int $i$f$withSaveLayer = 0;
/*     */         try {
/* 224 */           canvas1.saveLayer(layerRect, paint$iv);
/* 225 */           int $i$a$-withSaveLayer-Painter$draw$1$1$1 = 0; onDraw($this$draw_x_KDEd0_u24lambda_u242);
/*     */         } finally {
/* 227 */           canvas1.restore();
/*     */         }  onDraw($this$draw_x_KDEd0_u24lambda_u242);
/*     */       }  }
/* 230 */     finally { drawScope.getDrawContext().getTransform().inset(-f1, -f2, -f3, -bottom$iv); }
/*     */   
/*     */   }
/*     */   
/*     */   public abstract long getIntrinsicSize-NH-jbRc();
/*     */   
/*     */   protected abstract void onDraw(@NotNull DrawScope paramDrawScope);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\painter\Painter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */