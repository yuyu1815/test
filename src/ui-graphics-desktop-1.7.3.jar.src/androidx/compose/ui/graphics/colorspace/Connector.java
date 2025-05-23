/*     */ package androidx.compose.ui.graphics.colorspace;
/*     */ 
/*     */ import androidx.annotation.Size;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.ColorKt;
/*     */ import java.util.Arrays;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020\024\n\002\b\b\n\002\020\007\n\002\b\004\n\002\030\002\n\002\b\006\b\026\030\000 \0362\0020\001:\002\036\037B\037\b\020\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\002\020\007B9\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\b\032\0020\003\022\006\020\t\032\0020\003\022\006\020\n\032\0020\006\022\b\020\013\032\004\030\0010\f¢\006\002\020\rJ \020\013\032\0020\f2\006\020\024\032\0020\0252\006\020\026\032\0020\0252\006\020\027\032\0020\025H\007J\022\020\013\032\0020\f2\b\b\001\020\030\032\0020\fH\027J\032\020\031\032\0020\0322\006\020\033\032\0020\032H\020ø\001\000¢\006\004\b\034\020\035R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\016\020\017R\031\020\n\032\0020\006ø\001\000ø\001\001¢\006\n\n\002\020\022\032\004\b\020\020\021R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\023\020\017R\020\020\013\032\004\030\0010\fX\004¢\006\002\n\000R\016\020\t\032\0020\003X\004¢\006\002\n\000R\016\020\b\032\0020\003X\004¢\006\002\n\000\002\013\n\005\b¡\0360\001\n\002\b!¨\006 "}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector;", "", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "destination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "transformSource", "transformDestination", "renderIntent", "transform", "", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDestination", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getRenderIntent-uksYyKA", "()I", "I", "getSource", "r", "", "g", "b", "v", "transformToColor", "Landroidx/compose/ui/graphics/Color;", "color", "transformToColor-l2rxGTc$ui_graphics", "(J)J", "Companion", "RgbConnector", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n+ 2 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,349:1\n231#2:350\n235#2,9:351\n72#3:360\n86#3:362\n22#4:361\n22#4:363\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n*L\n-1#1:350\n163#1:351,9\n165#1:360\n166#1:362\n165#1:361\n166#1:363\n*E\n"})
/*     */ public class Connector
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final ColorSpace source;
/*     */   @NotNull
/*     */   private final ColorSpace destination;
/*     */   @NotNull
/*     */   private final ColorSpace transformSource;
/*     */   @NotNull
/*     */   private final ColorSpace transformDestination;
/*     */   private final int renderIntent;
/*     */   @Nullable
/*     */   private final float[] transform;
/*     */   
/*     */   private Connector(ColorSpace source, ColorSpace destination, ColorSpace transformSource, ColorSpace transformDestination, int renderIntent, float[] transform) {
/*  70 */     this.source = source;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  78 */     this.destination = destination;
/*  79 */     this.transformSource = transformSource;
/*  80 */     this.transformDestination = transformDestination;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  89 */     this.renderIntent = renderIntent;
/*  90 */     this.transform = transform;
/*     */   } @NotNull
/*     */   public final ColorSpace getSource() {
/*     */     return this.source;
/*     */   }
/*     */   @NotNull
/*     */   public final ColorSpace getDestination() {
/*     */     return this.destination;
/*     */   }
/*     */   public final int getRenderIntent-uksYyKA() {
/*     */     return this.renderIntent;
/*     */   }
/*     */   private Connector(ColorSpace source, ColorSpace destination, int intent) {
/* 103 */     this(
/* 104 */         source, destination, 
/* 105 */         ColorModel.equals-impl0(source.getModel-xdoWZVw(), ColorModel.Companion.getRgb-xdoWZVw()) ? ColorSpaceKt.adapt$default(source, Illuminant.INSTANCE.getD50(), null, 2, null) : source, 
/* 106 */         ColorModel.equals-impl0(destination.getModel-xdoWZVw(), ColorModel.Companion.getRgb-xdoWZVw()) ? 
/* 107 */         ColorSpaceKt.adapt$default(destination, Illuminant.INSTANCE.getD50(), null, 2, null) : 
/*     */         
/* 109 */         destination, 
/*     */         
/* 111 */         intent, 
/* 112 */         Companion.computeTransform-YBCOT_4(
/* 113 */           source, 
/* 114 */           destination, 
/* 115 */           intent), null);
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
/*     */   @Size(3L)
/*     */   @NotNull
/*     */   public final float[] transform(float r, float g, float b) {
/* 137 */     float[] arrayOfFloat = new float[3]; arrayOfFloat[0] = r; arrayOfFloat[1] = g; arrayOfFloat[2] = b; return transform(arrayOfFloat);
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
/*     */   @Size(min = 3L)
/*     */   @NotNull
/*     */   public float[] transform(@Size(min = 3L) @NotNull float[] v) {
/* 153 */     Intrinsics.checkNotNullParameter(v, "v"); float[] xyz = this.transformSource.toXyz(v);
/* 154 */     if (this.transform != null) {
/* 155 */       xyz[0] = xyz[0] * this.transform[0];
/* 156 */       xyz[1] = xyz[1] * this.transform[1];
/* 157 */       xyz[2] = xyz[2] * this.transform[2];
/*     */     } 
/* 159 */     return this.transformDestination.fromXyz(xyz);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\024\n\002\b\b\n\002\030\002\n\002\b\004\b\000\030\0002\0020\001B\037\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\002\020\007J*\020\n\032\0020\t2\006\020\013\032\0020\0032\006\020\f\032\0020\0032\006\020\005\032\0020\006H\002ø\001\000¢\006\004\b\r\020\016J\020\020\017\032\0020\t2\006\020\020\032\0020\tH\026J\032\020\021\032\0020\0222\006\020\023\032\0020\022H\020ø\001\000¢\006\004\b\024\020\025R\016\020\004\032\0020\003X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000\002\007\n\005\b¡\0360\001¨\006\026"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$RgbConnector;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "mSource", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "mDestination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "mTransform", "", "computeTransform", "source", "destination", "computeTransform-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;I)[F", "transform", "v", "transformToColor", "Landroidx/compose/ui/graphics/Color;", "color", "transformToColor-l2rxGTc$ui_graphics", "(J)J", "ui-graphics"})
/*     */   @SourceDebugExtension({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector$RgbConnector\n+ 2 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 3 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n*L\n1#1,349:1\n231#2:350\n235#2,9:351\n716#3:360\n735#3:361\n754#3:362\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector$RgbConnector\n*L\n-1#1:350\n202#1:351,9\n206#1:360\n207#1:361\n208#1:362\n*E\n"})
/*     */   public static final class RgbConnector
/*     */     extends Connector
/*     */   {
/*     */     @NotNull
/*     */     private final Rgb mSource;
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     private final Rgb mDestination;
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     private final float[] mTransform;
/*     */ 
/*     */ 
/*     */     
/*     */     private RgbConnector(Rgb mSource, Rgb mDestination, int intent) {
/* 183 */       super(mSource, mDestination, mSource, mDestination, intent, null, null);
/*     */       
/*     */       this.mSource = mSource;
/*     */       this.mDestination = mDestination;
/* 187 */       this.mTransform = computeTransform-YBCOT_4(this.mSource, this.mDestination, intent);
/*     */     }
/*     */     @NotNull
/*     */     public float[] transform(@NotNull float[] v) {
/* 191 */       Intrinsics.checkNotNullParameter(v, "v"); v[0] = (float)this.mSource.getEotfFunc$ui_graphics().invoke(v[0]);
/* 192 */       v[1] = (float)this.mSource.getEotfFunc$ui_graphics().invoke(v[1]);
/* 193 */       v[2] = (float)this.mSource.getEotfFunc$ui_graphics().invoke(v[2]);
/* 194 */       ColorSpaceKt.mul3x3Float3(this.mTransform, v);
/* 195 */       v[0] = (float)this.mDestination.getOetfFunc$ui_graphics().invoke(v[0]);
/* 196 */       v[1] = (float)this.mDestination.getOetfFunc$ui_graphics().invoke(v[1]);
/* 197 */       v[2] = (float)this.mDestination.getOetfFunc$ui_graphics().invoke(v[2]);
/* 198 */       return v;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final float[] computeTransform-YBCOT_4(Rgb source, Rgb destination, int intent) {
/* 236 */       if (ColorSpaceKt.compare(source.getWhitePoint(), destination.getWhitePoint()))
/*     */       {
/* 238 */         return ColorSpaceKt.mul3x3(destination.getInverseTransform$ui_graphics(), source.getTransform$ui_graphics());
/*     */       }
/*     */       
/* 241 */       float[] transform = source.getTransform$ui_graphics();
/* 242 */       float[] inverseTransform = destination.getInverseTransform$ui_graphics();
/*     */       
/* 244 */       float[] srcXYZ = source.getWhitePoint().toXyz$ui_graphics();
/* 245 */       float[] dstXYZ = destination.getWhitePoint().toXyz$ui_graphics();
/*     */       
/* 247 */       if (!ColorSpaceKt.compare(source.getWhitePoint(), Illuminant.INSTANCE.getD50())) {
/*     */ 
/*     */ 
/*     */         
/* 251 */         Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(Illuminant.INSTANCE.getD50Xyz$ui_graphics(), (Illuminant.INSTANCE.getD50Xyz$ui_graphics()).length), "copyOf(...)"); float[] srcAdaptation = ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics(), srcXYZ, Arrays.copyOf(Illuminant.INSTANCE.getD50Xyz$ui_graphics(), (Illuminant.INSTANCE.getD50Xyz$ui_graphics()).length));
/*     */         
/* 253 */         transform = ColorSpaceKt.mul3x3(srcAdaptation, source.getTransform$ui_graphics());
/*     */       } 
/*     */       
/* 256 */       if (!ColorSpaceKt.compare(destination.getWhitePoint(), Illuminant.INSTANCE.getD50())) {
/*     */ 
/*     */ 
/*     */         
/* 260 */         Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(Illuminant.INSTANCE.getD50Xyz$ui_graphics(), (Illuminant.INSTANCE.getD50Xyz$ui_graphics()).length), "copyOf(...)"); float[] dstAdaptation = ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics(), dstXYZ, Arrays.copyOf(Illuminant.INSTANCE.getD50Xyz$ui_graphics(), (Illuminant.INSTANCE.getD50Xyz$ui_graphics()).length));
/*     */         
/* 262 */         inverseTransform = ColorSpaceKt.inverse3x3(
/* 263 */             ColorSpaceKt.mul3x3(
/* 264 */               dstAdaptation, 
/* 265 */               destination.getTransform$ui_graphics()));
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 270 */       if (RenderIntent.equals-impl0(intent, RenderIntent.Companion.getAbsolute-uksYyKA())) {
/*     */ 
/*     */         
/* 273 */         float[] arrayOfFloat = new float[3]; arrayOfFloat[0] = srcXYZ[0] / dstXYZ[0]; arrayOfFloat[1] = 
/* 274 */           srcXYZ[1] / dstXYZ[1];
/* 275 */         arrayOfFloat[2] = srcXYZ[2] / dstXYZ[2];
/*     */         
/* 277 */         transform = ColorSpaceKt.mul3x3Diag(arrayOfFloat, transform);
/*     */       } 
/*     */ 
/*     */       
/* 281 */       return ColorSpaceKt.mul3x3(inverseTransform, transform);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public long transformToColor-l2rxGTc$ui_graphics(long color)
/*     */     {
/* 350 */       int $i$f$component1-impl = 0; float r = Color.getRed-impl(color); int $i$f$component2-impl = 0;
/* 351 */       float g = Color.getGreen-impl(color);
/*     */       
/*     */       int $i$f$component3-impl = 0;
/*     */       
/* 355 */       float b = Color.getBlue-impl(color);
/*     */       
/*     */       int $i$f$component4-impl = 0;
/*     */       
/* 359 */       float a = Color.getAlpha-impl(color); float v0 = (float)this.mSource.getEotfFunc$ui_graphics().invoke(r); float v1 = (float)this.mSource.getEotfFunc$ui_graphics().invoke(g); float v2 = (float)this.mSource.getEotfFunc$ui_graphics().invoke(b); float[] lhs$iv = this.mTransform; int $i$f$mul3x3Float3_0 = 0;
/* 360 */       float v01 = lhs$iv[0] * v0 + lhs$iv[3] * v1 + lhs$iv[6] * v2; float[] arrayOfFloat1 = this.mTransform; int $i$f$mul3x3Float3_1 = 0;
/* 361 */       float v11 = arrayOfFloat1[1] * v0 + arrayOfFloat1[4] * v1 + arrayOfFloat1[7] * v2; float[] arrayOfFloat2 = this.mTransform; int $i$f$mul3x3Float3_2 = 0;
/* 362 */       float v21 = arrayOfFloat2[2] * v0 + arrayOfFloat2[5] * v1 + arrayOfFloat2[8] * v2; float v02 = (float)this.mDestination.getOetfFunc$ui_graphics().invoke(v01); float v12 = (float)this.mDestination.getOetfFunc$ui_graphics().invoke(v11); float v22 = (float)this.mDestination.getOetfFunc$ui_graphics().invoke(v21); return ColorKt.Color(v02, v12, v22, a, this.mDestination); } } public long transformToColor-l2rxGTc$ui_graphics(long color) { int $i$f$component1-impl = 0; float r = Color.getRed-impl(color); int $i$f$component2-impl = 0; float g = Color.getGreen-impl(color); int $i$f$component3-impl = 0; float b = Color.getBlue-impl(color); int $i$f$component4-impl = 0; float a = Color.getAlpha-impl(color); long packed = this.transformSource.toXy$ui_graphics(r, g, b); int $i$f$unpackFloat1 = 0; int bits$iv$iv = (int)(packed >> 32L), $i$f$floatFromBits = 0; float x = Float.intBitsToFloat(bits$iv$iv); int $i$f$unpackFloat2 = 0; int i = (int)(packed & 0xFFFFFFFFL), j = 0;
/* 363 */     float y = Float.intBitsToFloat(i);
/*     */     float z = this.transformSource.toZ$ui_graphics(r, g, b);
/*     */     if (this.transform != null) {
/*     */       x *= this.transform[0];
/*     */       y *= this.transform[1];
/*     */       z *= this.transform[2];
/*     */     } 
/*     */     return this.transformDestination.xyzaToColor-JlNiLsg$ui_graphics(x, y, z, a, this.destination); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\024\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J,\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\tH\002ø\001\000¢\006\004\b\n\020\013J\025\020\f\032\0020\r2\006\020\005\032\0020\006H\000¢\006\002\b\016\002\007\n\005\b¡\0360\001¨\006\017"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$Companion;", "", "()V", "computeTransform", "", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "destination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "computeTransform-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)[F", "identity", "Landroidx/compose/ui/graphics/colorspace/Connector;", "identity$ui_graphics", "ui-graphics"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     private final float[] computeTransform-YBCOT_4(ColorSpace source, ColorSpace destination, int intent) {
/*     */       if (!RenderIntent.equals-impl0(intent, RenderIntent.Companion.getAbsolute-uksYyKA()))
/*     */         return null; 
/*     */       boolean srcRGB = ColorModel.equals-impl0(source.getModel-xdoWZVw(), ColorModel.Companion.getRgb-xdoWZVw());
/*     */       boolean dstRGB = ColorModel.equals-impl0(destination.getModel-xdoWZVw(), ColorModel.Companion.getRgb-xdoWZVw());
/*     */       if (srcRGB && dstRGB)
/*     */         return null; 
/*     */       if (srcRGB || dstRGB) {
/*     */         Intrinsics.checkNotNull(srcRGB ? (Rgb)source : (Rgb)destination, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
/*     */         Rgb rgb = srcRGB ? (Rgb)source : (Rgb)destination;
/*     */         float[] srcXYZ = srcRGB ? rgb.getWhitePoint().toXyz$ui_graphics() : Illuminant.INSTANCE.getD50Xyz$ui_graphics();
/*     */         float[] dstXYZ = dstRGB ? rgb.getWhitePoint().toXyz$ui_graphics() : Illuminant.INSTANCE.getD50Xyz$ui_graphics();
/*     */         float[] arrayOfFloat1 = new float[3];
/*     */         arrayOfFloat1[0] = srcXYZ[0] / dstXYZ[0];
/*     */         arrayOfFloat1[1] = srcXYZ[1] / dstXYZ[1];
/*     */         arrayOfFloat1[2] = srcXYZ[2] / dstXYZ[2];
/*     */         return arrayOfFloat1;
/*     */       } 
/*     */       return null;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Connector identity$ui_graphics(@NotNull ColorSpace source) {
/*     */       Intrinsics.checkNotNullParameter(source, "source");
/*     */       int i = RenderIntent.Companion.getRelative-uksYyKA();
/*     */       return new Connector$Companion$identity$1(source, i);
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020\024\n\002\b\002\n\002\030\002\n\002\b\004*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\003H\026J\032\020\005\032\0020\0062\006\020\007\032\0020\006H\020ø\001\000¢\006\004\b\b\020\t\002\007\n\005\b¡\0360\001¨\006\n"}, d2 = {"androidx/compose/ui/graphics/colorspace/Connector$Companion$identity$1", "Landroidx/compose/ui/graphics/colorspace/Connector;", "transform", "", "v", "transformToColor", "Landroidx/compose/ui/graphics/Color;", "color", "transformToColor-l2rxGTc$ui_graphics", "(J)J", "ui-graphics"})
/*     */     public static final class Connector$Companion$identity$1 extends Connector {
/*     */       Connector$Companion$identity$1(ColorSpace $source, int $super_call_param$1) {
/*     */         super($source, $source, $super_call_param$1, null);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public float[] transform(@NotNull float[] v) {
/*     */         Intrinsics.checkNotNullParameter(v, "v");
/*     */         return v;
/*     */       }
/*     */       
/*     */       public long transformToColor-l2rxGTc$ui_graphics(long color) {
/*     */         return color;
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\colorspace\Connector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */