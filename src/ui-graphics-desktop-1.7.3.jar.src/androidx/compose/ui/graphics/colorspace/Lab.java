/*     */ package androidx.compose.ui.graphics.colorspace;
/*     */ 
/*     */ import androidx.compose.ui.graphics.ColorKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\002\n\002\020\024\n\002\b\002\n\002\020\007\n\002\b\003\n\002\020\t\n\002\b\b\n\002\030\002\n\002\b\t\b\000\030\000 #2\0020\001:\001#B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\020\020\n\032\0020\0132\006\020\f\032\0020\013H\026J\020\020\r\032\0020\0162\006\020\017\032\0020\005H\026J\020\020\020\032\0020\0162\006\020\017\032\0020\005H\026J%\020\021\032\0020\0222\006\020\023\032\0020\0162\006\020\024\032\0020\0162\006\020\025\032\0020\016H\020¢\006\002\b\026J\020\020\027\032\0020\0132\006\020\f\032\0020\013H\026J%\020\030\032\0020\0162\006\020\023\032\0020\0162\006\020\024\032\0020\0162\006\020\025\032\0020\016H\020¢\006\002\b\031J=\020\032\032\0020\0332\006\020\034\032\0020\0162\006\020\035\032\0020\0162\006\020\036\032\0020\0162\006\020\037\032\0020\0162\006\020 \032\0020\001H\020ø\001\000ø\001\001¢\006\004\b!\020\"R\024\020\007\032\0020\b8VX\004¢\006\006\032\004\b\007\020\t\002\013\n\002\b!\n\005\b¡\0360\001¨\006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics", "toXyz", "toZ", "toZ$ui_graphics", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,142:1\n71#2,16:143\n71#2,16:159\n71#2,16:175\n71#2,16:191\n71#2,16:207\n71#2,16:226\n71#2,16:242\n71#2,16:258\n71#2,16:274\n71#2,16:290\n71#2,16:306\n71#2,16:322\n71#2,16:338\n63#3,3:223\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n48#1:143,16\n49#1:159,16\n50#1:175,16\n67#1:191,16\n68#1:207,16\n79#1:226,16\n80#1:242,16\n107#1:258,16\n108#1:274,16\n109#1:290,16\n128#1:306,16\n129#1:322,16\n130#1:338,16\n75#1:223,3\n*E\n"})
/*     */ public final class Lab
/*     */   extends ColorSpace
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private static final float A = 0.008856452F;
/*     */   private static final float B = 7.787037F;
/*     */   private static final float C = 0.13793103F;
/*     */   private static final float D = 0.20689656F;
/*     */   
/*     */   public Lab(@NotNull String name, int id) {
/*  31 */     super(
/*  32 */         name, 
/*  33 */         ColorModel.Companion.getLab-xdoWZVw(), id, null);
/*     */   }
/*     */   
/*     */   public boolean isWideGamut() {
/*  37 */     return true;
/*     */   }
/*     */   public float getMinValue(int component) {
/*  40 */     return (component == 0) ? 0.0F : -128.0F;
/*     */   }
/*     */   
/*     */   public float getMaxValue(int component) {
/*  44 */     return (component == 0) ? 100.0F : 128.0F;
/*     */   }
/*     */   
/*     */   @NotNull
/*  48 */   public float[] toXyz(@NotNull float[] v) { Intrinsics.checkNotNullParameter(v, "v"); float f1 = v[0], f2 = 0.0F, maximumValue$iv = 100.0F; int $i$f$fastCoerceIn = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 143 */     float f6 = f1; int m = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     float f5 = (f6 < f2) ? f2 : f6;
/*     */ 
/*     */ 
/*     */     
/*     */     int k = 0;
/*     */ 
/*     */ 
/*     */     
/* 158 */     v[0] = (f5 > maximumValue$iv) ? maximumValue$iv : f5; float $this$fastCoerceIn$iv = v[1], minimumValue$iv = -128.0F; maximumValue$iv = 128.0F; $i$f$fastCoerceIn = 0;
/* 159 */     float f4 = $this$fastCoerceIn$iv; int j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 166 */     float f3 = (f4 < minimumValue$iv) ? minimumValue$iv : f4;
/*     */ 
/*     */ 
/*     */     
/*     */     int i = 0;
/*     */ 
/*     */ 
/*     */     
/* 174 */     v[1] = (f3 > maximumValue$iv) ? maximumValue$iv : f3; $this$fastCoerceIn$iv = v[2]; minimumValue$iv = -128.0F; maximumValue$iv = 128.0F; $i$f$fastCoerceIn = 0;
/* 175 */     float $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv; int $i$f$fastCoerceAtLeast = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 182 */     float $this$fastCoerceAtMost$iv$iv = ($this$fastCoerceAtLeast$iv$iv < minimumValue$iv) ? minimumValue$iv : $this$fastCoerceAtLeast$iv$iv;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */     
/* 190 */     v[2] = ($this$fastCoerceAtMost$iv$iv > maximumValue$iv) ? maximumValue$iv : $this$fastCoerceAtMost$iv$iv; float fy = (v[0] + 16.0F) / 116.0F; float fx = fy + v[1] * 0.002F; float fz = fy - v[2] * 0.005F; float x = (fx > 0.20689656F) ? (fx * fx * fx) : (0.12841855F * (fx - 0.13793103F)); float y = (fy > 0.20689656F) ? (fy * fy * fy) : (0.12841855F * (fy - 0.13793103F)); float z = (fz > 0.20689656F) ? (fz * fz * fz) : (0.12841855F * (fz - 0.13793103F)); v[0] = x * Illuminant.INSTANCE.getD50Xyz$ui_graphics()[0]; v[1] = y * Illuminant.INSTANCE.getD50Xyz$ui_graphics()[1]; v[2] = z * Illuminant.INSTANCE.getD50Xyz$ui_graphics()[2]; return v; } public long toXy$ui_graphics(float v0, float v1, float v2) { float f1 = v0, f2 = 0.0F, maximumValue$iv = 100.0F; int $i$f$fastCoerceIn = 0;
/* 191 */     float $this$fastCoerceAtLeast$iv$iv = f1; int $i$f$fastCoerceAtLeast = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 198 */     float $this$fastCoerceAtMost$iv$iv = ($this$fastCoerceAtLeast$iv$iv < f2) ? f2 : $this$fastCoerceAtLeast$iv$iv;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */     
/* 206 */     float v00 = ($this$fastCoerceAtMost$iv$iv > maximumValue$iv) ? maximumValue$iv : $this$fastCoerceAtMost$iv$iv; float minimumValue$iv = v1; maximumValue$iv = -128.0F; float f3 = 128.0F; int i = 0;
/* 207 */     float f5 = minimumValue$iv; int k = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 214 */     float f4 = (f5 < maximumValue$iv) ? maximumValue$iv : f5;
/*     */ 
/*     */ 
/*     */     
/*     */     int j = 0;
/*     */ 
/*     */ 
/*     */     
/* 222 */     float v10 = (f4 > f3) ? f3 : f4; float fy = (v00 + 16.0F) / 116.0F; float fx = fy + v10 * 0.002F; float x = (fx > 0.20689656F) ? (fx * fx * fx) : (0.12841855F * (fx - 0.13793103F)); float y = (fy > 0.20689656F) ? (fy * fy * fy) : (0.12841855F * (fy - 0.13793103F)); f4 = x * Illuminant.INSTANCE.getD50Xyz$ui_graphics()[0]; float val2$iv = y * Illuminant.INSTANCE.getD50Xyz$ui_graphics()[1]; int $i$f$packFloats = 0;
/* 223 */     long v1$iv = Float.floatToRawIntBits(f4);
/* 224 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 225 */     return v1$iv << 32L | v2$iv & 0xFFFFFFFFL; } public float toZ$ui_graphics(float v0, float v1, float v2) { float f1 = v0, f2 = 0.0F, maximumValue$iv = 100.0F; int $i$f$fastCoerceIn = 0;
/* 226 */     float $this$fastCoerceAtLeast$iv$iv = f1; int $i$f$fastCoerceAtLeast = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 233 */     float $this$fastCoerceAtMost$iv$iv = ($this$fastCoerceAtLeast$iv$iv < f2) ? f2 : $this$fastCoerceAtLeast$iv$iv;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */     
/* 241 */     float v00 = ($this$fastCoerceAtMost$iv$iv > maximumValue$iv) ? maximumValue$iv : $this$fastCoerceAtMost$iv$iv; float minimumValue$iv = v2; maximumValue$iv = -128.0F; float f3 = 128.0F; int i = 0;
/* 242 */     float f5 = minimumValue$iv; int k = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 249 */     float f4 = (f5 < maximumValue$iv) ? maximumValue$iv : f5;
/*     */ 
/*     */ 
/*     */     
/*     */     int j = 0;
/*     */ 
/*     */ 
/*     */     
/* 257 */     float v20 = (f4 > f3) ? f3 : f4; float fy = (v00 + 16.0F) / 116.0F; float fz = fy - v20 * 0.005F; float z = (fz > 0.20689656F) ? (fz * fz * fz) : (0.12841855F * (fz - 0.13793103F)); return z * Illuminant.INSTANCE.getD50Xyz$ui_graphics()[2]; } public long xyzaToColor-JlNiLsg$ui_graphics(float x, float y, float z, float a, @NotNull ColorSpace colorSpace) { Intrinsics.checkNotNullParameter(colorSpace, "colorSpace"); float x1 = x / Illuminant.INSTANCE.getD50Xyz$ui_graphics()[0]; float y1 = y / Illuminant.INSTANCE.getD50Xyz$ui_graphics()[1]; float z1 = z / Illuminant.INSTANCE.getD50Xyz$ui_graphics()[2]; float fx = (x1 > 0.008856452F) ? (float)Math.cbrt(x1) : (7.787037F * x1 + 0.13793103F); float fy = (y1 > 0.008856452F) ? (float)Math.cbrt(y1) : (7.787037F * y1 + 0.13793103F); float fz = (z1 > 0.008856452F) ? (float)Math.cbrt(z1) : (7.787037F * z1 + 0.13793103F); float l = 116.0F * fy - 16.0F; float a1 = 500.0F * (fx - fy); float b = 200.0F * (fy - fz); float f1 = l, f2 = 0.0F, maximumValue$iv = 100.0F; int $i$f$fastCoerceIn = 0;
/* 258 */     float f6 = f1; int m = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 265 */     float f5 = (f6 < f2) ? f2 : f6;
/*     */     
/*     */     int k = 0;
/*     */     
/*     */     float $this$fastCoerceIn$iv = a1, minimumValue$iv = -128.0F;
/*     */     
/*     */     maximumValue$iv = 128.0F;
/*     */     
/*     */     $i$f$fastCoerceIn = 0;
/* 274 */     float f4 = $this$fastCoerceIn$iv; int j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 281 */     float f3 = (f4 < minimumValue$iv) ? minimumValue$iv : f4;
/*     */     
/*     */     int i = 0;
/*     */     
/*     */     $this$fastCoerceIn$iv = b;
/*     */     
/*     */     minimumValue$iv = -128.0F;
/*     */     maximumValue$iv = 128.0F;
/*     */     $i$f$fastCoerceIn = 0;
/* 290 */     float $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv; int $i$f$fastCoerceAtLeast = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 297 */     float $this$fastCoerceAtMost$iv$iv = ($this$fastCoerceAtLeast$iv$iv < minimumValue$iv) ? minimumValue$iv : $this$fastCoerceAtLeast$iv$iv;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */     
/* 305 */     return ColorKt.Color((f5 > maximumValue$iv) ? maximumValue$iv : f5, (f3 > maximumValue$iv) ? maximumValue$iv : f3, ($this$fastCoerceAtMost$iv$iv > maximumValue$iv) ? maximumValue$iv : $this$fastCoerceAtMost$iv$iv, a, colorSpace); } @NotNull public float[] fromXyz(@NotNull float[] v) { Intrinsics.checkNotNullParameter(v, "v"); float x = v[0] / Illuminant.INSTANCE.getD50Xyz$ui_graphics()[0]; float y = v[1] / Illuminant.INSTANCE.getD50Xyz$ui_graphics()[1]; float z = v[2] / Illuminant.INSTANCE.getD50Xyz$ui_graphics()[2]; float fx = (x > 0.008856452F) ? (float)Math.cbrt(x) : (7.787037F * x + 0.13793103F); float fy = (y > 0.008856452F) ? (float)Math.cbrt(y) : (7.787037F * y + 0.13793103F); float fz = (z > 0.008856452F) ? (float)Math.cbrt(z) : (7.787037F * z + 0.13793103F); float l = 116.0F * fy - 16.0F; float a = 500.0F * (fx - fy); float b = 200.0F * (fy - fz); float f1 = l, f2 = 0.0F, maximumValue$iv = 100.0F; int $i$f$fastCoerceIn = 0;
/* 306 */     float f6 = f1; int m = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 313 */     float f5 = (f6 < f2) ? f2 : f6;
/*     */ 
/*     */ 
/*     */     
/*     */     int k = 0;
/*     */ 
/*     */ 
/*     */     
/* 321 */     v[0] = (f5 > maximumValue$iv) ? maximumValue$iv : f5; float $this$fastCoerceIn$iv = a, minimumValue$iv = -128.0F; maximumValue$iv = 128.0F; $i$f$fastCoerceIn = 0;
/* 322 */     float f4 = $this$fastCoerceIn$iv; int j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 329 */     float f3 = (f4 < minimumValue$iv) ? minimumValue$iv : f4;
/*     */ 
/*     */ 
/*     */     
/*     */     int i = 0;
/*     */ 
/*     */ 
/*     */     
/* 337 */     v[1] = (f3 > maximumValue$iv) ? maximumValue$iv : f3; $this$fastCoerceIn$iv = b; minimumValue$iv = -128.0F; maximumValue$iv = 128.0F; $i$f$fastCoerceIn = 0;
/* 338 */     float $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv; int $i$f$fastCoerceAtLeast = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 345 */     float $this$fastCoerceAtMost$iv$iv = ($this$fastCoerceAtLeast$iv$iv < minimumValue$iv) ? minimumValue$iv : $this$fastCoerceAtLeast$iv$iv;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */     
/* 353 */     v[2] = ($this$fastCoerceAtMost$iv$iv > maximumValue$iv) ? maximumValue$iv : $this$fastCoerceAtMost$iv$iv;
/*     */     return v; }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\007\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\004XT¢\006\002\n\000R\016\020\007\032\0020\004XT¢\006\002\n\000¨\006\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab$Companion;", "", "()V", "A", "", "B", "C", "D", "ui-graphics"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\colorspace\Lab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */