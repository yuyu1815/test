/*     */ package androidx.compose.ui.graphics.colorspace;
/*     */ 
/*     */ import androidx.compose.ui.graphics.ColorKt;
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\002\n\002\020\007\n\002\b\002\n\002\020\024\n\002\b\005\n\002\020\t\n\002\b\b\n\002\030\002\n\002\b\007\b\000\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\021\020\n\032\0020\0132\006\020\f\032\0020\013H\bJ\020\020\r\032\0020\0162\006\020\017\032\0020\016H\026J\020\020\020\032\0020\0132\006\020\021\032\0020\005H\026J\020\020\022\032\0020\0132\006\020\021\032\0020\005H\026J%\020\023\032\0020\0242\006\020\025\032\0020\0132\006\020\026\032\0020\0132\006\020\027\032\0020\013H\020¢\006\002\b\030J\020\020\031\032\0020\0162\006\020\017\032\0020\016H\026J%\020\032\032\0020\0132\006\020\025\032\0020\0132\006\020\026\032\0020\0132\006\020\027\032\0020\013H\020¢\006\002\b\033J=\020\034\032\0020\0352\006\020\f\032\0020\0132\006\020\036\032\0020\0132\006\020\037\032\0020\0132\006\020 \032\0020\0132\006\020!\032\0020\001H\020ø\001\000ø\001\001¢\006\004\b\"\020#R\024\020\007\032\0020\b8VX\004¢\006\006\032\004\b\007\020\t\002\013\n\002\b!\n\005\b¡\0360\001¨\006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Xyz;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "clamp", "", "x", "fromXyz", "", "v", "getMaxValue", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics", "toXyz", "toZ", "toZ$ui_graphics", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nXyz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,82:1\n79#1:83\n79#1:100\n79#1:117\n79#1:134\n79#1:154\n79#1:171\n79#1:188\n79#1:205\n79#1:222\n71#2,16:84\n71#2,16:101\n71#2,16:118\n71#2,16:135\n71#2,16:155\n71#2,16:172\n71#2,16:189\n71#2,16:206\n71#2,16:223\n71#2,16:239\n63#3,3:151\n*S KotlinDebug\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n*L\n46#1:83\n47#1:100\n48#1:117\n53#1:134\n57#1:154\n67#1:171\n71#1:188\n72#1:205\n73#1:222\n46#1:84,16\n47#1:101,16\n48#1:118,16\n53#1:135,16\n57#1:155,16\n67#1:172,16\n71#1:189,16\n72#1:206,16\n73#1:223,16\n79#1:239,16\n53#1:151,3\n*E\n"})
/*     */ public final class Xyz
/*     */   extends ColorSpace
/*     */ {
/*     */   public Xyz(@NotNull String name, int id) {
/*  29 */     super(
/*  30 */         name, 
/*  31 */         ColorModel.Companion.getXyz-xdoWZVw(), id, null);
/*     */   }
/*     */   
/*     */   public boolean isWideGamut() {
/*  35 */     return true;
/*     */   }
/*     */   public float getMinValue(int component) {
/*  38 */     return -2.0F;
/*     */   }
/*     */   
/*     */   public float getMaxValue(int component) {
/*  42 */     return 2.0F;
/*     */   }
/*     */   
/*     */   @NotNull
/*  46 */   public float[] toXyz(@NotNull float[] v) { Intrinsics.checkNotNullParameter(v, "v"); Xyz xyz1 = this; float x$iv = v[0]; int $i$f$clamp = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  83 */     float f1 = x$iv, f2 = -2.0F, maximumValue$iv$iv = 2.0F; int $i$f$fastCoerceIn = 0;
/*  84 */     float f6 = f1; int m = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  91 */     float f5 = (f6 < f2) ? f2 : f6;
/*     */ 
/*     */ 
/*     */     
/*     */     int k = 0;
/*     */ 
/*     */ 
/*     */     
/*  99 */     v[0] = (f5 > maximumValue$iv$iv) ? maximumValue$iv$iv : f5; Xyz this_$iv = this; x$iv = v[1]; $i$f$clamp = 0;
/* 100 */     float $this$fastCoerceIn$iv$iv = x$iv, minimumValue$iv$iv = -2.0F; maximumValue$iv$iv = 2.0F; $i$f$fastCoerceIn = 0;
/* 101 */     float f4 = $this$fastCoerceIn$iv$iv; int j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 108 */     float f3 = (f4 < minimumValue$iv$iv) ? minimumValue$iv$iv : f4;
/*     */ 
/*     */ 
/*     */     
/*     */     int i = 0;
/*     */ 
/*     */ 
/*     */     
/* 116 */     v[1] = (f3 > maximumValue$iv$iv) ? maximumValue$iv$iv : f3; this_$iv = this; x$iv = v[2]; $i$f$clamp = 0;
/* 117 */     $this$fastCoerceIn$iv$iv = x$iv; minimumValue$iv$iv = -2.0F; maximumValue$iv$iv = 2.0F; $i$f$fastCoerceIn = 0;
/* 118 */     float $this$fastCoerceAtLeast$iv$iv$iv = $this$fastCoerceIn$iv$iv; int $i$f$fastCoerceAtLeast = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     float $this$fastCoerceAtMost$iv$iv$iv = ($this$fastCoerceAtLeast$iv$iv$iv < minimumValue$iv$iv) ? minimumValue$iv$iv : $this$fastCoerceAtLeast$iv$iv$iv;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */     
/* 133 */     v[2] = ($this$fastCoerceAtMost$iv$iv$iv > maximumValue$iv$iv) ? maximumValue$iv$iv : $this$fastCoerceAtMost$iv$iv$iv; return v; } public long toXy$ui_graphics(float v0, float v1, float v2) { Xyz this_$iv = this; int $i$f$clamp = 0;
/* 134 */     float f2 = v0, f3 = -2.0F, maximumValue$iv$iv = 2.0F; int $i$f$fastCoerceIn = 0;
/* 135 */     float $this$fastCoerceAtLeast$iv$iv$iv = f2; int $i$f$fastCoerceAtLeast = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 142 */     float $this$fastCoerceAtMost$iv$iv$iv = ($this$fastCoerceAtLeast$iv$iv$iv < f3) ? f3 : $this$fastCoerceAtLeast$iv$iv$iv;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */     
/* 150 */     float f1 = ($this$fastCoerceAtMost$iv$iv$iv > maximumValue$iv$iv) ? maximumValue$iv$iv : $this$fastCoerceAtMost$iv$iv$iv; Xyz xyz1 = this; int i = 0; float minimumValue$iv$iv = v1; maximumValue$iv$iv = -2.0F; float f4 = 2.0F; int j = 0; float f6 = minimumValue$iv$iv; int m = 0; float f5 = (f6 < maximumValue$iv$iv) ? maximumValue$iv$iv : f6; int k = 0; float val2$iv = (f5 > f4) ? f4 : f5; int $i$f$packFloats = 0;
/* 151 */     long v1$iv = Float.floatToRawIntBits(f1);
/* 152 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 153 */     return v1$iv << 32L | v2$iv & 0xFFFFFFFFL; } public float toZ$ui_graphics(float v0, float v1, float v2) { Xyz this_$iv = this; int $i$f$clamp = 0;
/* 154 */     float f1 = v2, f2 = -2.0F, maximumValue$iv$iv = 2.0F; int $i$f$fastCoerceIn = 0;
/* 155 */     float $this$fastCoerceAtLeast$iv$iv$iv = f1; int $i$f$fastCoerceAtLeast = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 162 */     float $this$fastCoerceAtMost$iv$iv$iv = ($this$fastCoerceAtLeast$iv$iv$iv < f2) ? f2 : $this$fastCoerceAtLeast$iv$iv$iv;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */     
/* 170 */     return ($this$fastCoerceAtMost$iv$iv$iv > maximumValue$iv$iv) ? maximumValue$iv$iv : $this$fastCoerceAtMost$iv$iv$iv; } public long xyzaToColor-JlNiLsg$ui_graphics(float x, float y, float z, float a, @NotNull ColorSpace colorSpace) { Intrinsics.checkNotNullParameter(colorSpace, "colorSpace"); Xyz this_$iv = this; int $i$f$clamp = 0;
/* 171 */     float f1 = x, f2 = -2.0F, maximumValue$iv$iv = 2.0F; int $i$f$fastCoerceIn = 0;
/* 172 */     float f6 = f1; int m = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 179 */     float f5 = (f6 < f2) ? f2 : f6; int k = 0; this_$iv = this; $i$f$clamp = 0; float $this$fastCoerceIn$iv$iv = y, minimumValue$iv$iv = -2.0F; maximumValue$iv$iv = 2.0F; $i$f$fastCoerceIn = 0; float f4 = $this$fastCoerceIn$iv$iv; int j = 0; float f3 = (f4 < minimumValue$iv$iv) ? minimumValue$iv$iv : f4; int i = 0; this_$iv = this; $i$f$clamp = 0; $this$fastCoerceIn$iv$iv = z; minimumValue$iv$iv = -2.0F; maximumValue$iv$iv = 2.0F; $i$f$fastCoerceIn = 0; float $this$fastCoerceAtLeast$iv$iv$iv = $this$fastCoerceIn$iv$iv; int $i$f$fastCoerceAtLeast = 0; float $this$fastCoerceAtMost$iv$iv$iv = ($this$fastCoerceAtLeast$iv$iv$iv < minimumValue$iv$iv) ? minimumValue$iv$iv : $this$fastCoerceAtLeast$iv$iv$iv;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */     
/* 187 */     return ColorKt.Color((f5 > maximumValue$iv$iv) ? maximumValue$iv$iv : f5, (f3 > maximumValue$iv$iv) ? maximumValue$iv$iv : f3, ($this$fastCoerceAtMost$iv$iv$iv > maximumValue$iv$iv) ? maximumValue$iv$iv : $this$fastCoerceAtMost$iv$iv$iv, a, colorSpace); } @NotNull public float[] fromXyz(@NotNull float[] v) { Intrinsics.checkNotNullParameter(v, "v"); Xyz xyz1 = this; float x$iv = v[0]; int $i$f$clamp = 0;
/* 188 */     float f1 = x$iv, f2 = -2.0F, maximumValue$iv$iv = 2.0F; int $i$f$fastCoerceIn = 0;
/* 189 */     float f6 = f1; int m = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 196 */     float f5 = (f6 < f2) ? f2 : f6;
/*     */ 
/*     */ 
/*     */     
/*     */     int k = 0;
/*     */ 
/*     */ 
/*     */     
/* 204 */     v[0] = (f5 > maximumValue$iv$iv) ? maximumValue$iv$iv : f5; Xyz this_$iv = this; x$iv = v[1]; $i$f$clamp = 0;
/* 205 */     float $this$fastCoerceIn$iv$iv = x$iv, minimumValue$iv$iv = -2.0F; maximumValue$iv$iv = 2.0F; $i$f$fastCoerceIn = 0;
/* 206 */     float f4 = $this$fastCoerceIn$iv$iv; int j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 213 */     float f3 = (f4 < minimumValue$iv$iv) ? minimumValue$iv$iv : f4;
/*     */ 
/*     */ 
/*     */     
/*     */     int i = 0;
/*     */ 
/*     */ 
/*     */     
/* 221 */     v[1] = (f3 > maximumValue$iv$iv) ? maximumValue$iv$iv : f3; this_$iv = this; x$iv = v[2]; $i$f$clamp = 0;
/* 222 */     $this$fastCoerceIn$iv$iv = x$iv; minimumValue$iv$iv = -2.0F; maximumValue$iv$iv = 2.0F; $i$f$fastCoerceIn = 0;
/* 223 */     float $this$fastCoerceAtLeast$iv$iv$iv = $this$fastCoerceIn$iv$iv; int $i$f$fastCoerceAtLeast = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 230 */     float $this$fastCoerceAtMost$iv$iv$iv = ($this$fastCoerceAtLeast$iv$iv$iv < minimumValue$iv$iv) ? minimumValue$iv$iv : $this$fastCoerceAtLeast$iv$iv$iv;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */     
/* 238 */     v[2] = ($this$fastCoerceAtMost$iv$iv$iv > maximumValue$iv$iv) ? maximumValue$iv$iv : $this$fastCoerceAtMost$iv$iv$iv; return v; } private final float clamp(float x) { int $i$f$clamp = 0; float f1 = x, f2 = -2.0F, maximumValue$iv = 2.0F; int $i$f$fastCoerceIn = 0;
/* 239 */     float $this$fastCoerceAtLeast$iv$iv = f1; int $i$f$fastCoerceAtLeast = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 246 */     float $this$fastCoerceAtMost$iv$iv = ($this$fastCoerceAtLeast$iv$iv < f2) ? f2 : $this$fastCoerceAtLeast$iv$iv;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */     
/* 254 */     return ($this$fastCoerceAtMost$iv$iv > maximumValue$iv) ? maximumValue$iv : $this$fastCoerceAtMost$iv$iv; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\colorspace\Xyz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */