/*     */ package androidx.compose.ui.graphics.colorspace;
/*     */ 
/*     */ import androidx.annotation.IntRange;
/*     */ import androidx.annotation.Size;
/*     */ import androidx.compose.ui.graphics.ColorKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\006\n\002\020\013\n\002\b\n\n\002\020\024\n\000\n\002\020\007\n\002\b\t\n\002\020\t\n\002\b\013\n\002\030\002\n\002\b\006\b&\030\000 72\0020\001:\0017B\027\b\026\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006B\037\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\007\032\0020\b¢\006\002\020\tJ\023\020\027\032\0020\0172\b\020\030\032\004\030\0010\001H\002J \020\031\032\0020\0322\006\020\033\032\0020\0342\006\020\035\032\0020\0342\006\020\036\032\0020\034H\007J\022\020\031\032\0020\0322\b\b\001\020\037\032\0020\032H'J\022\020 \032\0020\0342\b\b\001\020!\032\0020\bH&J\022\020\"\032\0020\0342\b\b\001\020!\032\0020\bH&J\b\020#\032\0020\bH\026J\b\020$\032\0020\003H\026J%\020%\032\0020&2\006\020'\032\0020\0342\006\020(\032\0020\0342\006\020)\032\0020\034H\020¢\006\002\b*J \020+\032\0020\0322\006\020,\032\0020\0342\006\020-\032\0020\0342\006\020.\032\0020\034H\007J\022\020+\032\0020\0322\b\b\001\020\037\032\0020\032H'J%\020/\032\0020\0342\006\020'\032\0020\0342\006\020(\032\0020\0342\006\020)\032\0020\034H\020¢\006\002\b0J=\0201\032\002022\006\020\033\032\0020\0342\006\020\035\032\0020\0342\006\020\036\032\0020\0342\006\0203\032\0020\0342\006\0204\032\0020\000H\020ø\001\001ø\001\000¢\006\004\b5\0206R\021\020\n\032\0020\b8G¢\006\006\032\004\b\013\020\fR\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\r\020\fR\024\020\016\032\0020\0178VX\004¢\006\006\032\004\b\016\020\020R\022\020\021\032\0020\017X¦\004¢\006\006\032\004\b\021\020\020R\031\020\004\032\0020\005ø\001\000ø\001\001¢\006\n\n\002\020\024\032\004\b\022\020\023R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\025\020\026\002\013\n\005\b¡\0360\001\n\002\b!¨\0068"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "name", "", "model", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "id", "", "(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "componentCount", "getComponentCount", "()I", "getId$ui_graphics", "isSrgb", "", "()Z", "isWideGamut", "getModel-xdoWZVw", "()J", "J", "getName", "()Ljava/lang/String;", "equals", "other", "fromXyz", "", "x", "", "y", "z", "v", "getMaxValue", "component", "getMinValue", "hashCode", "toString", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics", "toXyz", "r", "g", "b", "toZ", "toZ$ui_graphics", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,802:1\n63#2,3:803\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n*L\n290#1:803,3\n*E\n"})
/*     */ public abstract class ColorSpace
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String name;
/*     */   private final long model;
/*     */   private final int id;
/*     */   public static final int MinId = -1;
/*     */   public static final int MaxId = 63;
/*     */   
/*     */   private ColorSpace(String name, long model, int id) {
/* 127 */     this.name = name;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 135 */     this.model = model;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 142 */     this.id = id;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 202 */     if ((((CharSequence)this.name).length() == 0)) {
/* 203 */       throw new IllegalArgumentException(
/* 204 */           "The name of a color space cannot be null and must contain at least 1 character");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 209 */     if (this.id < -1 || this.id > 63) {
/* 210 */       throw new IllegalArgumentException("The id must be between -1 and 63");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final String getName() {
/*     */     return this.name;
/*     */   }
/*     */ 
/*     */   
/*     */   public final long getModel-xdoWZVw() {
/*     */     return this.model;
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getId$ui_graphics() {
/*     */     return this.id;
/*     */   }
/*     */ 
/*     */   
/*     */   private ColorSpace(String name, long model) {
/*     */     this(name, model, -1, null);
/*     */   }
/*     */ 
/*     */   
/*     */   @IntRange(from = 1L, to = 4L)
/*     */   public final int getComponentCount() {
/*     */     return ColorModel.getComponentCount-impl(this.model);
/*     */   }
/*     */ 
/*     */   
/*     */   public abstract boolean isWideGamut();
/*     */ 
/*     */   
/*     */   public boolean isSrgb() {
/*     */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public abstract float getMinValue(@IntRange(from = 0L, to = 3L) int paramInt);
/*     */ 
/*     */   
/*     */   public abstract float getMaxValue(@IntRange(from = 0L, to = 3L) int paramInt);
/*     */ 
/*     */   
/*     */   @Size(3L)
/*     */   @NotNull
/*     */   public final float[] toXyz(float r, float g, float b) {
/* 260 */     float[] arrayOfFloat = new float[3]; arrayOfFloat[0] = r; arrayOfFloat[1] = g; arrayOfFloat[2] = b; return toXyz(arrayOfFloat);
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
/*     */   @Size(min = 3L)
/*     */   @NotNull
/*     */   public abstract float[] toXyz(@Size(min = 3L) @NotNull float[] paramArrayOffloat);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long toXy$ui_graphics(float v0, float v1, float v2) {
/* 289 */     float[] xyz = toXyz(v0, v1, v2);
/* 290 */     float f1 = xyz[0], val2$iv = xyz[1]; int $i$f$packFloats = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 803 */     long v1$iv = Float.floatToRawIntBits(f1);
/* 804 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 805 */     return v1$iv << 32L | v2$iv & 0xFFFFFFFFL;
/*     */   }
/*     */   
/*     */   public float toZ$ui_graphics(float v0, float v1, float v2) {
/*     */     float[] xyz = toXyz(v0, v1, v2);
/*     */     return xyz[2];
/*     */   }
/*     */   
/*     */   public long xyzaToColor-JlNiLsg$ui_graphics(float x, float y, float z, float a, @NotNull ColorSpace colorSpace) {
/*     */     Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
/*     */     float[] colors = fromXyz(x, y, z);
/*     */     return ColorKt.Color(colors[0], colors[1], colors[2], a, colorSpace);
/*     */   }
/*     */   
/*     */   @Size(min = 3L)
/*     */   @NotNull
/*     */   public final float[] fromXyz(float x, float y, float z) {
/*     */     float[] xyz = new float[ColorModel.getComponentCount-impl(this.model)];
/*     */     xyz[0] = x;
/*     */     xyz[1] = y;
/*     */     xyz[2] = z;
/*     */     return fromXyz(xyz);
/*     */   }
/*     */   
/*     */   @Size(min = 3L)
/*     */   @NotNull
/*     */   public abstract float[] fromXyz(@Size(min = 3L) @NotNull float[] paramArrayOffloat);
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return this.name + " (id=" + this.id + ", model=" + ColorModel.toString-impl(this.model) + ')';
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (other == null || getClass() != other.getClass())
/*     */       return false; 
/*     */     ColorSpace that = (ColorSpace)other;
/*     */     if (this.id != that.id)
/*     */       return false; 
/*     */     return !Intrinsics.areEqual(this.name, that.name) ? false : ColorModel.equals-impl0(this.model, that.model);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     int result = this.name.hashCode();
/*     */     result = 31 * result + ColorModel.hashCode-impl(this.model);
/*     */     result = 31 * result + this.id;
/*     */     return result;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000¨\006\006"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace$Companion;", "", "()V", "MaxId", "", "MinId", "ui-graphics"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\colorspace\ColorSpace.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */