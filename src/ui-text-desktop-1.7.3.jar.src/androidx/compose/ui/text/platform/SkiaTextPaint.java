/*     */ package androidx.compose.ui.text.platform;
/*     */ 
/*     */ import androidx.annotation.VisibleForTesting;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.ColorFilter;
/*     */ import androidx.compose.ui.graphics.Paint;
/*     */ import androidx.compose.ui.graphics.PaintingStyle;
/*     */ import androidx.compose.ui.graphics.PathEffect;
/*     */ import androidx.compose.ui.graphics.ShaderBrush;
/*     */ import androidx.compose.ui.graphics.SkiaBackedPaint_skikoKt;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawStyle;
/*     */ import androidx.compose.ui.graphics.drawscope.Fill;
/*     */ import androidx.compose.ui.graphics.drawscope.Stroke;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.skia.Paint;
/*     */ import org.jetbrains.skia.Shader;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\006\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\r\020W\032\0060Xj\002`YH\001J\b\020Z\032\0020[H\002J,\020\\\032\0020[2\b\020\017\032\004\030\0010\0202\006\020]\032\0020\0272\b\b\002\020\003\032\0020\004ø\001\000¢\006\004\b^\020_J\020\020`\032\0020[2\b\020a\032\004\030\0010bR\030\020\003\032\0020\004X\017¢\006\f\032\004\b\005\020\006\"\004\b\007\020\bR\036\020\t\032\0020\nX\017ø\001\000ø\001\001¢\006\f\032\004\b\013\020\f\"\004\b\r\020\016R&\020\017\032\004\030\0010\0208\000@\000X\016¢\006\024\n\000\022\004\b\021\020\002\032\004\b\022\020\023\"\004\b\024\020\025R,\020\026\032\004\030\0010\0278\000@\000X\016ø\001\000ø\001\001¢\006\024\n\000\022\004\b\030\020\002\032\004\b\031\020\032\"\004\b\033\020\034R\036\020\035\032\0020\036X\017ø\001\000ø\001\001¢\006\f\032\004\b\037\020 \"\004\b!\020\"R\032\020#\032\004\030\0010$X\017¢\006\f\032\004\b%\020&\"\004\b'\020(R\036\020)\032\0020*X\017ø\001\000ø\001\001¢\006\f\032\004\b+\020\f\"\004\b,\020\016R\030\020-\032\0020.X\017¢\006\f\032\004\b-\020/\"\004\b0\0201R\032\0202\032\004\030\00103X\017¢\006\f\032\004\b4\0205\"\004\b6\0207R \0208\032\n\030\00109j\004\030\001`:X\017¢\006\f\032\004\b;\020<\"\004\b=\020>R*\020?\032\022\022\f\022\n\030\00109j\004\030\001`:\030\0010@X\016¢\006\016\n\000\032\004\bA\020B\"\004\bC\020DR\036\020E\032\0020FX\017ø\001\000ø\001\001¢\006\f\032\004\bG\020\f\"\004\bH\020\016R\036\020I\032\0020JX\017ø\001\000ø\001\001¢\006\f\032\004\bK\020\f\"\004\bL\020\016R\030\020M\032\0020\004X\017¢\006\f\032\004\bN\020\006\"\004\bO\020\bR\030\020P\032\0020\004X\017¢\006\f\032\004\bQ\020\006\"\004\bR\020\bR\036\020S\032\0020TX\017ø\001\000ø\001\001¢\006\f\032\004\bU\020\f\"\004\bV\020\016\002\013\n\005\b¡\0360\001\n\002\b!¨\006c"}, d2 = {"Landroidx/compose/ui/text/platform/SkiaTextPaint;", "Landroidx/compose/ui/graphics/Paint;", "()V", "alpha", "", "getAlpha", "()F", "setAlpha", "(F)V", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush$ui_text$annotations", "getBrush$ui_text", "()Landroidx/compose/ui/graphics/Brush;", "setBrush$ui_text", "(Landroidx/compose/ui/graphics/Brush;)V", "brushSize", "Landroidx/compose/ui/geometry/Size;", "getBrushSize-VsRJwc0$ui_text$annotations", "getBrushSize-VsRJwc0$ui_text", "()Landroidx/compose/ui/geometry/Size;", "setBrushSize-iaC8Vc4$ui_text", "(Landroidx/compose/ui/geometry/Size;)V", "color", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "setColor-8_81llA", "(J)V", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "getFilterQuality-f-v9h1I", "setFilterQuality-vDHp3xo", "isAntiAlias", "", "()Z", "setAntiAlias", "(Z)V", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "getPathEffect", "()Landroidx/compose/ui/graphics/PathEffect;", "setPathEffect", "(Landroidx/compose/ui/graphics/PathEffect;)V", "shader", "Lorg/jetbrains/skia/Shader;", "Landroidx/compose/ui/graphics/Shader;", "getShader", "()Lorg/jetbrains/skia/Shader;", "setShader", "(Lorg/jetbrains/skia/Shader;)V", "shaderState", "Landroidx/compose/runtime/State;", "getShaderState$ui_text", "()Landroidx/compose/runtime/State;", "setShaderState$ui_text", "(Landroidx/compose/runtime/State;)V", "strokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "getStrokeCap-KaPHkGw", "setStrokeCap-BeK7IIE", "strokeJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "getStrokeJoin-LxFBmk8", "setStrokeJoin-Ww9F2mQ", "strokeMiterLimit", "getStrokeMiterLimit", "setStrokeMiterLimit", "strokeWidth", "getStrokeWidth", "setStrokeWidth", "style", "Landroidx/compose/ui/graphics/PaintingStyle;", "getStyle-TiuSbCo", "setStyle-k9PVt8s", "asFrameworkPaint", "Lorg/jetbrains/skia/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "clearShader", "", "setBrush", "size", "setBrush-12SF9DM", "(Landroidx/compose/ui/graphics/Brush;JF)V", "setDrawStyle", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nSkiaTextPaint.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkiaTextPaint.skiko.kt\nandroidx/compose/ui/text/platform/SkiaTextPaint\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,114:1\n696#2:115\n198#3:116\n*S KotlinDebug\n*F\n+ 1 SkiaTextPaint.skiko.kt\nandroidx/compose/ui/text/platform/SkiaTextPaint\n*L\n56#1:115\n70#1:116\n*E\n"})
/*     */ public final class SkiaTextPaint implements Paint {
/*     */   @Nullable
/*     */   private Brush brush;
/*     */   @Nullable
/*     */   private State<Shader> shaderState;
/*     */   @Nullable
/*     */   private Size brushSize;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @Nullable
/*  40 */   public final Brush getBrush$ui_text() { return this.brush; } public final void setBrush$ui_text(@Nullable Brush <set-?>) { this.brush = <set-?>; }
/*     */   @Nullable
/*  42 */   public final State<Shader> getShaderState$ui_text() { return this.shaderState; } public final void setShaderState$ui_text(@Nullable State<Shader> <set-?>) { this.shaderState = <set-?>; }
/*     */   
/*     */   @Nullable
/*  45 */   public final Size getBrushSize-VsRJwc0$ui_text() { return this.brushSize; } public final void setBrushSize-iaC8Vc4$ui_text(@Nullable Size <set-?>) { this.brushSize = <set-?>; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void setBrush-12SF9DM(@Nullable Brush brush, long size, float alpha) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: astore #5
/*     */     //   3: aload #5
/*     */     //   5: ifnonnull -> 15
/*     */     //   8: aload_0
/*     */     //   9: invokespecial clearShader : ()V
/*     */     //   12: goto -> 217
/*     */     //   15: aload #5
/*     */     //   17: instanceof androidx/compose/ui/graphics/SolidColor
/*     */     //   20: ifeq -> 72
/*     */     //   23: aload_0
/*     */     //   24: invokevirtual getColor-0d7_KjU : ()J
/*     */     //   27: lstore #6
/*     */     //   29: iconst_0
/*     */     //   30: istore #8
/*     */     //   32: lload #6
/*     */     //   34: ldc2_w 16
/*     */     //   37: lcmp
/*     */     //   38: ifeq -> 45
/*     */     //   41: iconst_1
/*     */     //   42: goto -> 46
/*     */     //   45: iconst_0
/*     */     //   46: ifeq -> 217
/*     */     //   49: aload_0
/*     */     //   50: aload_1
/*     */     //   51: checkcast androidx/compose/ui/graphics/SolidColor
/*     */     //   54: invokevirtual getValue-0d7_KjU : ()J
/*     */     //   57: fload #4
/*     */     //   59: invokestatic modulate-DxMtmZc : (JF)J
/*     */     //   62: invokevirtual setColor-8_81llA : (J)V
/*     */     //   65: aload_0
/*     */     //   66: invokespecial clearShader : ()V
/*     */     //   69: goto -> 217
/*     */     //   72: aload #5
/*     */     //   74: instanceof androidx/compose/ui/graphics/ShaderBrush
/*     */     //   77: ifeq -> 217
/*     */     //   80: aload_0
/*     */     //   81: getfield brush : Landroidx/compose/ui/graphics/Brush;
/*     */     //   84: aload_1
/*     */     //   85: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   88: ifeq -> 114
/*     */     //   91: aload_0
/*     */     //   92: getfield brushSize : Landroidx/compose/ui/geometry/Size;
/*     */     //   95: dup
/*     */     //   96: ifnonnull -> 104
/*     */     //   99: pop
/*     */     //   100: iconst_0
/*     */     //   101: goto -> 111
/*     */     //   104: invokevirtual unbox-impl : ()J
/*     */     //   107: lload_2
/*     */     //   108: invokestatic equals-impl0 : (JJ)Z
/*     */     //   111: ifne -> 169
/*     */     //   114: lload_2
/*     */     //   115: lstore #6
/*     */     //   117: iconst_0
/*     */     //   118: istore #8
/*     */     //   120: lload #6
/*     */     //   122: ldc2_w 9205357640488583168
/*     */     //   125: lcmp
/*     */     //   126: ifeq -> 133
/*     */     //   129: iconst_1
/*     */     //   130: goto -> 134
/*     */     //   133: iconst_0
/*     */     //   134: ifeq -> 169
/*     */     //   137: aload_0
/*     */     //   138: aload_1
/*     */     //   139: putfield brush : Landroidx/compose/ui/graphics/Brush;
/*     */     //   142: aload_0
/*     */     //   143: lload_2
/*     */     //   144: invokestatic box-impl : (J)Landroidx/compose/ui/geometry/Size;
/*     */     //   147: putfield brushSize : Landroidx/compose/ui/geometry/Size;
/*     */     //   150: aload_0
/*     */     //   151: new androidx/compose/ui/text/platform/SkiaTextPaint$setBrush$1
/*     */     //   154: dup
/*     */     //   155: aload_1
/*     */     //   156: lload_2
/*     */     //   157: invokespecial <init> : (Landroidx/compose/ui/graphics/Brush;J)V
/*     */     //   160: checkcast kotlin/jvm/functions/Function0
/*     */     //   163: invokestatic derivedStateOf : (Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;
/*     */     //   166: putfield shaderState : Landroidx/compose/runtime/State;
/*     */     //   169: aload_0
/*     */     //   170: aload_0
/*     */     //   171: getfield shaderState : Landroidx/compose/runtime/State;
/*     */     //   174: dup
/*     */     //   175: ifnull -> 189
/*     */     //   178: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   183: checkcast org/jetbrains/skia/Shader
/*     */     //   186: goto -> 191
/*     */     //   189: pop
/*     */     //   190: aconst_null
/*     */     //   191: invokevirtual setShader : (Lorg/jetbrains/skia/Shader;)V
/*     */     //   194: aload_0
/*     */     //   195: fload #4
/*     */     //   197: invokestatic isNaN : (F)Z
/*     */     //   200: ifeq -> 207
/*     */     //   203: fconst_1
/*     */     //   204: goto -> 214
/*     */     //   207: fload #4
/*     */     //   209: fconst_0
/*     */     //   210: fconst_1
/*     */     //   211: invokestatic coerceIn : (FFF)F
/*     */     //   214: invokevirtual setAlpha : (F)V
/*     */     //   217: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #48	-> 0
/*     */     //   #51	-> 3
/*     */     //   #52	-> 8
/*     */     //   #55	-> 15
/*     */     //   #56	-> 23
/*     */     //   #115	-> 32
/*     */     //   #56	-> 46
/*     */     //   #57	-> 49
/*     */     //   #58	-> 65
/*     */     //   #68	-> 72
/*     */     //   #69	-> 80
/*     */     //   #70	-> 114
/*     */     //   #116	-> 120
/*     */     //   #70	-> 134
/*     */     //   #71	-> 137
/*     */     //   #72	-> 142
/*     */     //   #73	-> 150
/*     */     //   #78	-> 169
/*     */     //   #79	-> 194
/*     */     //   #79	-> 200
/*     */     //   #82	-> 217
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   32	14	8	$i$f$isSpecified-8_81llA	I
/*     */     //   29	17	6	$this$isSpecified$iv	J
/*     */     //   120	14	8	$i$f$isSpecified-uvyYCjk	I
/*     */     //   117	17	6	$this$isSpecified$iv	J
/*     */     //   0	218	0	this	Landroidx/compose/ui/text/platform/SkiaTextPaint;
/*     */     //   0	218	1	brush	Landroidx/compose/ui/graphics/Brush;
/*     */     //   0	218	2	size	J
/*     */     //   0	218	4	alpha	F
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\020\000\032\0060\001j\002`\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "Lorg/jetbrains/skia/Shader;", "Landroidx/compose/ui/graphics/Shader;", "invoke"})
/*     */   static final class SkiaTextPaint$setBrush$1
/*     */     extends Lambda
/*     */     implements Function0<Shader>
/*     */   {
/*     */     @NotNull
/*     */     public final Shader invoke() {
/*  74 */       return ((ShaderBrush)this.$brush).createShader-uvyYCjk(this.$size);
/*     */     }
/*     */ 
/*     */     
/*     */     SkiaTextPaint$setBrush$1(Brush $brush, long $size) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setDrawStyle(@Nullable DrawStyle drawStyle) {
/*  85 */     DrawStyle drawStyle1 = drawStyle;
/*  86 */     if (Intrinsics.areEqual(drawStyle1, Fill.INSTANCE) ? true : ((drawStyle1 == null))) {
/*     */ 
/*     */ 
/*     */       
/*  90 */       setStyle-k9PVt8s(PaintingStyle.Companion.getFill-TiuSbCo());
/*     */     
/*     */     }
/*  93 */     else if (drawStyle1 instanceof Stroke) {
/*  94 */       setStyle-k9PVt8s(PaintingStyle.Companion.getStroke-TiuSbCo());
/*  95 */       setStrokeWidth(((Stroke)drawStyle).getWidth());
/*  96 */       setStrokeMiterLimit(((Stroke)drawStyle).getMiter());
/*  97 */       setStrokeJoin-Ww9F2mQ(((Stroke)drawStyle).getJoin-LxFBmk8());
/*  98 */       setStrokeCap-BeK7IIE(((Stroke)drawStyle).getCap-KaPHkGw());
/*  99 */       setPathEffect(((Stroke)drawStyle).getPathEffect());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void clearShader() {
/* 108 */     this.shaderState = null;
/* 109 */     this.brush = null;
/* 110 */     this.brushSize = null;
/* 111 */     setShader(null);
/*     */   }
/*     */   
/*     */   public float getAlpha() {
/*     */     return this.$$delegate_0.getAlpha();
/*     */   }
/*     */   
/*     */   public void setAlpha(float <set-?>) {
/*     */     this.$$delegate_0.setAlpha(<set-?>);
/*     */   }
/*     */   
/*     */   public int getBlendMode-0nO6VwU() {
/*     */     return this.$$delegate_0.getBlendMode-0nO6VwU();
/*     */   }
/*     */   
/*     */   public void setBlendMode-s9anfk8(int <set-?>) {
/*     */     this.$$delegate_0.setBlendMode-s9anfk8(<set-?>);
/*     */   }
/*     */   
/*     */   public long getColor-0d7_KjU() {
/*     */     return this.$$delegate_0.getColor-0d7_KjU();
/*     */   }
/*     */   
/*     */   public void setColor-8_81llA(long <set-?>) {
/*     */     this.$$delegate_0.setColor-8_81llA(<set-?>);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ColorFilter getColorFilter() {
/*     */     return this.$$delegate_0.getColorFilter();
/*     */   }
/*     */   
/*     */   public void setColorFilter(@Nullable ColorFilter <set-?>) {
/*     */     this.$$delegate_0.setColorFilter(<set-?>);
/*     */   }
/*     */   
/*     */   public int getFilterQuality-f-v9h1I() {
/*     */     return this.$$delegate_0.getFilterQuality-f-v9h1I();
/*     */   }
/*     */   
/*     */   public void setFilterQuality-vDHp3xo(int <set-?>) {
/*     */     this.$$delegate_0.setFilterQuality-vDHp3xo(<set-?>);
/*     */   }
/*     */   
/*     */   public boolean isAntiAlias() {
/*     */     return this.$$delegate_0.isAntiAlias();
/*     */   }
/*     */   
/*     */   public void setAntiAlias(boolean <set-?>) {
/*     */     this.$$delegate_0.setAntiAlias(<set-?>);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public PathEffect getPathEffect() {
/*     */     return this.$$delegate_0.getPathEffect();
/*     */   }
/*     */   
/*     */   public void setPathEffect(@Nullable PathEffect <set-?>) {
/*     */     this.$$delegate_0.setPathEffect(<set-?>);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Shader getShader() {
/*     */     return this.$$delegate_0.getShader();
/*     */   }
/*     */   
/*     */   public void setShader(@Nullable Shader <set-?>) {
/*     */     this.$$delegate_0.setShader(<set-?>);
/*     */   }
/*     */   
/*     */   public int getStrokeCap-KaPHkGw() {
/*     */     return this.$$delegate_0.getStrokeCap-KaPHkGw();
/*     */   }
/*     */   
/*     */   public void setStrokeCap-BeK7IIE(int <set-?>) {
/*     */     this.$$delegate_0.setStrokeCap-BeK7IIE(<set-?>);
/*     */   }
/*     */   
/*     */   public int getStrokeJoin-LxFBmk8() {
/*     */     return this.$$delegate_0.getStrokeJoin-LxFBmk8();
/*     */   }
/*     */   
/*     */   public void setStrokeJoin-Ww9F2mQ(int <set-?>) {
/*     */     this.$$delegate_0.setStrokeJoin-Ww9F2mQ(<set-?>);
/*     */   }
/*     */   
/*     */   public float getStrokeMiterLimit() {
/*     */     return this.$$delegate_0.getStrokeMiterLimit();
/*     */   }
/*     */   
/*     */   public void setStrokeMiterLimit(float <set-?>) {
/*     */     this.$$delegate_0.setStrokeMiterLimit(<set-?>);
/*     */   }
/*     */   
/*     */   public float getStrokeWidth() {
/*     */     return this.$$delegate_0.getStrokeWidth();
/*     */   }
/*     */   
/*     */   public void setStrokeWidth(float <set-?>) {
/*     */     this.$$delegate_0.setStrokeWidth(<set-?>);
/*     */   }
/*     */   
/*     */   public int getStyle-TiuSbCo() {
/*     */     return this.$$delegate_0.getStyle-TiuSbCo();
/*     */   }
/*     */   
/*     */   public void setStyle-k9PVt8s(int <set-?>) {
/*     */     this.$$delegate_0.setStyle-k9PVt8s(<set-?>);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Paint asFrameworkPaint() {
/*     */     return this.$$delegate_0.asFrameworkPaint();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\SkiaTextPaint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */