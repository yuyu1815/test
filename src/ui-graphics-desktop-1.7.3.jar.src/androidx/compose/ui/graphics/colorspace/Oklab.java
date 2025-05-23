/*     */ package androidx.compose.ui.graphics.colorspace;
/*     */ 
/*     */ import androidx.compose.ui.graphics.ColorKt;
/*     */ import androidx.compose.ui.util.MathHelpersKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\002\n\002\020\024\n\002\b\002\n\002\020\007\n\002\b\003\n\002\020\t\n\002\b\b\n\002\030\002\n\002\b\t\b\000\030\000 #2\0020\001:\001#B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\020\020\n\032\0020\0132\006\020\f\032\0020\013H\026J\020\020\r\032\0020\0162\006\020\017\032\0020\005H\026J\020\020\020\032\0020\0162\006\020\017\032\0020\005H\026J%\020\021\032\0020\0222\006\020\023\032\0020\0162\006\020\024\032\0020\0162\006\020\025\032\0020\016H\020¢\006\002\b\026J\020\020\027\032\0020\0132\006\020\f\032\0020\013H\026J%\020\030\032\0020\0162\006\020\023\032\0020\0162\006\020\024\032\0020\0162\006\020\025\032\0020\016H\020¢\006\002\b\031J=\020\032\032\0020\0332\006\020\034\032\0020\0162\006\020\035\032\0020\0162\006\020\036\032\0020\0162\006\020\037\032\0020\0162\006\020 \032\0020\001H\020ø\001\000ø\001\001¢\006\004\b!\020\"R\024\020\007\032\0020\b8VX\004¢\006\006\032\004\b\007\020\t\002\013\n\002\b!\n\005\b¡\0360\001¨\006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Oklab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics", "toXyz", "toZ", "toZ$ui_graphics", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nOklab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,171:1\n71#2,16:172\n71#2,16:188\n71#2,16:204\n71#2,16:220\n71#2,16:236\n71#2,16:252\n71#2,16:276\n71#2,16:292\n71#2,16:308\n716#3:268\n735#3:269\n754#3:270\n716#3:271\n735#3:272\n716#3:324\n735#3:325\n754#3:326\n754#3:327\n716#3:328\n735#3:329\n754#3:330\n716#3:331\n735#3:332\n754#3:333\n63#4,3:273\n*S KotlinDebug\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n*L\n48#1:172,16\n49#1:188,16\n50#1:204,16\n62#1:220,16\n63#1:236,16\n64#1:252,16\n81#1:276,16\n82#1:292,16\n83#1:308,16\n66#1:268\n67#1:269\n68#1:270\n74#1:271\n75#1:272\n85#1:324\n86#1:325\n87#1:326\n93#1:327\n105#1:328\n106#1:329\n107#1:330\n113#1:331\n114#1:332\n115#1:333\n77#1:273,3\n*E\n"})
/*     */ public final class Oklab
/*     */   extends ColorSpace
/*     */ {
/*     */   public Oklab(@NotNull String name, int id) {
/*  31 */     super(
/*  32 */         name, 
/*  33 */         ColorModel.Companion.getLab-xdoWZVw(), id, null);
/*     */   }
/*     */   
/*     */   public boolean isWideGamut() {
/*  37 */     return true;
/*     */   }
/*     */   public float getMinValue(int component) {
/*  40 */     return (component == 0) ? 0.0F : -0.5F;
/*     */   }
/*     */   
/*     */   public float getMaxValue(int component) {
/*  44 */     return (component == 0) ? 1.0F : 0.5F;
/*     */   }
/*     */   
/*     */   @NotNull
/*  48 */   public float[] toXyz(@NotNull float[] v) { Intrinsics.checkNotNullParameter(v, "v"); float f1 = v[0], f2 = 0.0F, maximumValue$iv = 1.0F; int $i$f$fastCoerceIn = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 172 */     float f6 = f1; int m = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 179 */     float f5 = (f6 < f2) ? f2 : f6;
/*     */ 
/*     */ 
/*     */     
/*     */     int k = 0;
/*     */ 
/*     */ 
/*     */     
/* 187 */     v[0] = (f5 > maximumValue$iv) ? maximumValue$iv : f5; float $this$fastCoerceIn$iv = v[1], minimumValue$iv = -0.5F; maximumValue$iv = 0.5F; $i$f$fastCoerceIn = 0;
/* 188 */     float f4 = $this$fastCoerceIn$iv; int j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 195 */     float f3 = (f4 < minimumValue$iv) ? minimumValue$iv : f4;
/*     */ 
/*     */ 
/*     */     
/*     */     int i = 0;
/*     */ 
/*     */ 
/*     */     
/* 203 */     v[1] = (f3 > maximumValue$iv) ? maximumValue$iv : f3; $this$fastCoerceIn$iv = v[2]; minimumValue$iv = -0.5F; maximumValue$iv = 0.5F; $i$f$fastCoerceIn = 0;
/* 204 */     float $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv; int $i$f$fastCoerceAtLeast = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 211 */     float $this$fastCoerceAtMost$iv$iv = ($this$fastCoerceAtLeast$iv$iv < minimumValue$iv) ? minimumValue$iv : $this$fastCoerceAtLeast$iv$iv;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */     
/* 219 */     v[2] = ($this$fastCoerceAtMost$iv$iv > maximumValue$iv) ? maximumValue$iv : $this$fastCoerceAtMost$iv$iv; ColorSpaceKt.mul3x3Float3(InverseM2, v); v[0] = v[0] * v[0] * v[0]; v[1] = v[1] * v[1] * v[1]; v[2] = v[2] * v[2] * v[2]; ColorSpaceKt.mul3x3Float3(InverseM1, v); return v; } public long toXy$ui_graphics(float v0, float v1, float v2) { float f1 = v0, f2 = 0.0F, maximumValue$iv = 1.0F; int $i$f$fastCoerceIn = 0;
/* 220 */     float $this$fastCoerceAtLeast$iv$iv = f1; int $i$f$fastCoerceAtLeast = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 227 */     float $this$fastCoerceAtMost$iv$iv = ($this$fastCoerceAtLeast$iv$iv < f2) ? f2 : $this$fastCoerceAtLeast$iv$iv;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */     
/* 235 */     float v00 = ($this$fastCoerceAtMost$iv$iv > maximumValue$iv) ? maximumValue$iv : $this$fastCoerceAtMost$iv$iv; float minimumValue$iv = v1; maximumValue$iv = -0.5F; float f4 = 0.5F; int i = 0;
/* 236 */     float f7 = minimumValue$iv; int m = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 243 */     float f6 = (f7 < maximumValue$iv) ? maximumValue$iv : f7;
/*     */ 
/*     */ 
/*     */     
/*     */     int k = 0;
/*     */ 
/*     */ 
/*     */     
/* 251 */     float v10 = (f6 > f4) ? f4 : f6; float f3 = v2; f4 = -0.5F; float f5 = 0.5F; int j = 0;
/* 252 */     float f9 = f3; int i1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 259 */     float f8 = (f9 < f4) ? f4 : f9;
/*     */ 
/*     */ 
/*     */     
/*     */     int n = 0;
/*     */ 
/*     */ 
/*     */     
/* 267 */     float v20 = (f8 > f5) ? f5 : f8; float[] lhs$iv = InverseM2; int $i$f$mul3x3Float3_0 = 0;
/* 268 */     float v01 = lhs$iv[0] * v00 + lhs$iv[3] * v10 + lhs$iv[6] * v20; float[] arrayOfFloat1 = InverseM2; int $i$f$mul3x3Float3_1 = 0;
/* 269 */     float v11 = arrayOfFloat1[1] * v00 + arrayOfFloat1[4] * v10 + arrayOfFloat1[7] * v20; float[] arrayOfFloat2 = InverseM2; int $i$f$mul3x3Float3_2 = 0;
/* 270 */     float v21 = arrayOfFloat2[2] * v00 + arrayOfFloat2[5] * v10 + arrayOfFloat2[8] * v20; float v02 = v01 * v01 * v01; float v12 = v11 * v11 * v11; float v22 = v21 * v21 * v21; float[] arrayOfFloat3 = InverseM1; int i2 = 0;
/* 271 */     float v03 = arrayOfFloat3[0] * v02 + arrayOfFloat3[3] * v12 + arrayOfFloat3[6] * v22; float[] arrayOfFloat4 = InverseM1; int i3 = 0;
/* 272 */     float v13 = arrayOfFloat4[1] * v02 + arrayOfFloat4[4] * v12 + arrayOfFloat4[7] * v22; int $i$f$packFloats = 0;
/* 273 */     long v1$iv = Float.floatToRawIntBits(v03);
/* 274 */     long v2$iv = Float.floatToRawIntBits(v13);
/* 275 */     return v1$iv << 32L | v2$iv & 0xFFFFFFFFL; } public float toZ$ui_graphics(float v0, float v1, float v2) { float f1 = v0, f2 = 0.0F, maximumValue$iv = 1.0F; int $i$f$fastCoerceIn = 0;
/* 276 */     float $this$fastCoerceAtLeast$iv$iv = f1; int $i$f$fastCoerceAtLeast = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 283 */     float $this$fastCoerceAtMost$iv$iv = ($this$fastCoerceAtLeast$iv$iv < f2) ? f2 : $this$fastCoerceAtLeast$iv$iv;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */     
/* 291 */     float v00 = ($this$fastCoerceAtMost$iv$iv > maximumValue$iv) ? maximumValue$iv : $this$fastCoerceAtMost$iv$iv; float minimumValue$iv = v1; maximumValue$iv = -0.5F; float f4 = 0.5F; int i = 0;
/* 292 */     float f7 = minimumValue$iv; int m = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 299 */     float f6 = (f7 < maximumValue$iv) ? maximumValue$iv : f7;
/*     */ 
/*     */ 
/*     */     
/*     */     int k = 0;
/*     */ 
/*     */ 
/*     */     
/* 307 */     float v10 = (f6 > f4) ? f4 : f6; float f3 = v2; f4 = -0.5F; float f5 = 0.5F; int j = 0;
/* 308 */     float f9 = f3; int i1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 315 */     float f8 = (f9 < f4) ? f4 : f9;
/*     */ 
/*     */ 
/*     */     
/*     */     int n = 0;
/*     */ 
/*     */ 
/*     */     
/* 323 */     float v20 = (f8 > f5) ? f5 : f8; float[] lhs$iv = InverseM2; int $i$f$mul3x3Float3_0 = 0;
/* 324 */     float v01 = lhs$iv[0] * v00 + lhs$iv[3] * v10 + lhs$iv[6] * v20; float[] arrayOfFloat1 = InverseM2; int $i$f$mul3x3Float3_1 = 0;
/* 325 */     float v11 = arrayOfFloat1[1] * v00 + arrayOfFloat1[4] * v10 + arrayOfFloat1[7] * v20; float[] arrayOfFloat2 = InverseM2; int $i$f$mul3x3Float3_2 = 0;
/* 326 */     float v21 = arrayOfFloat2[2] * v00 + arrayOfFloat2[5] * v10 + arrayOfFloat2[8] * v20; float v02 = v01 * v01 * v01; float v12 = v11 * v11 * v11; float v22 = v21 * v21 * v21; float[] arrayOfFloat3 = InverseM1; int i2 = 0;
/* 327 */     float v23 = arrayOfFloat3[2] * v02 + arrayOfFloat3[5] * v12 + arrayOfFloat3[8] * v22; return v23; } public long xyzaToColor-JlNiLsg$ui_graphics(float x, float y, float z, float a, @NotNull ColorSpace colorSpace) { Intrinsics.checkNotNullParameter(colorSpace, "colorSpace"); float[] lhs$iv = M1; int $i$f$mul3x3Float3_0 = 0;
/* 328 */     float v0 = lhs$iv[0] * x + lhs$iv[3] * y + lhs$iv[6] * z; float[] arrayOfFloat1 = M1; int $i$f$mul3x3Float3_1 = 0;
/* 329 */     float v1 = arrayOfFloat1[1] * x + arrayOfFloat1[4] * y + arrayOfFloat1[7] * z; float[] arrayOfFloat2 = M1; int $i$f$mul3x3Float3_2 = 0;
/* 330 */     float v2 = arrayOfFloat2[2] * x + arrayOfFloat2[5] * y + arrayOfFloat2[8] * z; v0 = MathHelpersKt.fastCbrt(v0); v1 = MathHelpersKt.fastCbrt(v1); v2 = MathHelpersKt.fastCbrt(v2); float[] arrayOfFloat3 = M2; int i = 0;
/* 331 */     float v01 = arrayOfFloat3[0] * v0 + arrayOfFloat3[3] * v1 + arrayOfFloat3[6] * v2; float[] arrayOfFloat4 = M2; int j = 0;
/* 332 */     float v11 = arrayOfFloat4[1] * v0 + arrayOfFloat4[4] * v1 + arrayOfFloat4[7] * v2; float[] arrayOfFloat5 = M2; int k = 0;
/* 333 */     float v21 = arrayOfFloat5[2] * v0 + arrayOfFloat5[5] * v1 + arrayOfFloat5[8] * v2;
/*     */     return ColorKt.Color(v01, v11, v21, a, colorSpace); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public float[] fromXyz(@NotNull float[] v) {
/*     */     Intrinsics.checkNotNullParameter(v, "v");
/*     */     ColorSpaceKt.mul3x3Float3(M1, v);
/*     */     v[0] = MathHelpersKt.fastCbrt(v[0]);
/*     */     v[1] = MathHelpersKt.fastCbrt(v[1]);
/*     */     v[2] = MathHelpersKt.fastCbrt(v[2]);
/*     */     ColorSpaceKt.mul3x3Float3(M2, v);
/*     */     return v;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\024\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004X\004¢\006\002\n\000R\016\020\005\032\0020\004X\004¢\006\002\n\000R\016\020\006\032\0020\004X\004¢\006\002\n\000R\016\020\007\032\0020\004X\004¢\006\002\n\000¨\006\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Oklab$Companion;", "", "()V", "InverseM1", "", "InverseM2", "M1", "M2", "ui-graphics"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private static final float[] M1;
/*     */   @NotNull
/*     */   private static final float[] M2;
/*     */   
/*     */   static {
/*     */     float[] arrayOfFloat = new float[9];
/*     */     arrayOfFloat[0] = 0.818933F;
/*     */     arrayOfFloat[1] = 0.032984544F;
/*     */     arrayOfFloat[2] = 0.0482003F;
/*     */     arrayOfFloat[3] = 0.36186674F;
/*     */     arrayOfFloat[4] = 0.9293119F;
/*     */     arrayOfFloat[5] = 0.26436627F;
/*     */     arrayOfFloat[6] = -0.12885971F;
/*     */     arrayOfFloat[7] = 0.03614564F;
/*     */     arrayOfFloat[8] = 0.6338517F;
/*     */     M1 = ColorSpaceKt.mul3x3(arrayOfFloat, ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics(), Illuminant.INSTANCE.getD50().toXyz$ui_graphics(), Illuminant.INSTANCE.getD65().toXyz$ui_graphics()));
/*     */     arrayOfFloat = new float[9];
/*     */     arrayOfFloat[0] = 0.21045426F;
/*     */     arrayOfFloat[1] = 1.9779985F;
/*     */     arrayOfFloat[2] = 0.025904037F;
/*     */     arrayOfFloat[3] = 0.7936178F;
/*     */     arrayOfFloat[4] = -2.4285922F;
/*     */     arrayOfFloat[5] = 0.78277177F;
/*     */     arrayOfFloat[6] = -0.004072047F;
/*     */     arrayOfFloat[7] = 0.4505937F;
/*     */     arrayOfFloat[8] = -0.80867577F;
/*     */     M2 = arrayOfFloat;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final float[] InverseM1 = ColorSpaceKt.inverse3x3(M1);
/*     */   @NotNull
/*     */   private static final float[] InverseM2 = ColorSpaceKt.inverse3x3(M2);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\colorspace\Oklab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */