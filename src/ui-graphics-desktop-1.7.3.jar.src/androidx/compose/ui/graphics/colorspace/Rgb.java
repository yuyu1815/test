/*      */ package androidx.compose.ui.graphics.colorspace;
/*      */ 
/*      */ import androidx.annotation.Size;
/*      */ import androidx.compose.ui.graphics.ColorKt;
/*      */ import java.util.Arrays;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.collections.ArraysKt;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Lambda;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.ranges.RangesKt;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000h\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\024\n\000\n\002\030\002\n\002\020\006\n\002\b\004\n\002\030\002\n\000\n\002\020\007\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\b\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\017\n\002\020\000\n\002\b\017\n\002\020\t\n\002\b\b\n\002\030\002\n\002\b\b\030\000 ^2\0020\001:\001^BC\b\026\022\b\b\001\020\002\032\0020\003\022\b\b\001\020\004\032\0020\005\022\022\020\006\032\016\022\004\022\0020\b\022\004\022\0020\b0\007\022\022\020\t\032\016\022\004\022\0020\b\022\004\022\0020\b0\007¢\006\002\020\nB[\b\026\022\b\b\001\020\002\032\0020\003\022\b\b\001\020\013\032\0020\005\022\006\020\f\032\0020\r\022\022\020\006\032\016\022\004\022\0020\b\022\004\022\0020\b0\007\022\022\020\t\032\016\022\004\022\0020\b\022\004\022\0020\b0\007\022\006\020\016\032\0020\017\022\006\020\020\032\0020\017¢\006\002\020\021B#\b\026\022\b\b\001\020\002\032\0020\003\022\b\b\001\020\004\032\0020\005\022\006\020\022\032\0020\023¢\006\002\020\024B+\b\026\022\b\b\001\020\002\032\0020\003\022\b\b\001\020\013\032\0020\005\022\006\020\f\032\0020\r\022\006\020\022\032\0020\023¢\006\002\020\025B/\b\020\022\006\020\002\032\0020\003\022\006\020\013\032\0020\005\022\006\020\f\032\0020\r\022\006\020\022\032\0020\023\022\006\020\026\032\0020\027¢\006\002\020\030B#\b\026\022\b\b\001\020\002\032\0020\003\022\b\b\001\020\004\032\0020\005\022\006\020\031\032\0020\b¢\006\002\020\032B+\b\026\022\b\b\001\020\002\032\0020\003\022\b\b\001\020\013\032\0020\005\022\006\020\f\032\0020\r\022\006\020\031\032\0020\b¢\006\002\020\033B?\b\020\022\006\020\002\032\0020\003\022\006\020\013\032\0020\005\022\006\020\f\032\0020\r\022\006\020\031\032\0020\b\022\006\020\016\032\0020\017\022\006\020\020\032\0020\017\022\006\020\026\032\0020\027¢\006\002\020\034B\037\b\020\022\006\020\035\032\0020\000\022\006\020\036\032\0020\005\022\006\020\f\032\0020\r¢\006\002\020\037B[\b\000\022\006\020\002\032\0020\003\022\006\020\013\032\0020\005\022\006\020\f\032\0020\r\022\b\020\036\032\004\030\0010\005\022\006\020\006\032\0020 \022\006\020\t\032\0020 \022\006\020\016\032\0020\017\022\006\020\020\032\0020\017\022\b\020!\032\004\030\0010\023\022\006\020\026\032\0020\027¢\006\002\020\"J\023\020<\032\0020.2\b\020=\032\004\030\0010>H\002J \020?\032\0020\0052\006\020@\032\0020\0172\006\020A\032\0020\0172\006\020B\032\0020\017H\007J\022\020?\032\0020\0052\b\b\001\020C\032\0020\005H\007J\020\020D\032\0020\0052\006\020C\032\0020\005H\026J\b\020E\032\0020\005H\007J\022\020E\032\0020\0052\b\b\001\020*\032\0020\005H\007J\020\020F\032\0020\0172\006\020G\032\0020\027H\026J\020\020H\032\0020\0172\006\020G\032\0020\027H\026J\b\020I\032\0020\005H\007J\022\020I\032\0020\0052\b\b\001\020\013\032\0020\005H\007J\b\020J\032\0020\005H\007J\022\020J\032\0020\0052\b\b\001\020\036\032\0020\005H\007J\b\020K\032\0020\027H\026J \020L\032\0020\0052\006\020@\032\0020\0172\006\020A\032\0020\0172\006\020B\032\0020\017H\007J\022\020L\032\0020\0052\b\b\001\020C\032\0020\005H\007J%\020M\032\0020N2\006\020O\032\0020\0172\006\020P\032\0020\0172\006\020Q\032\0020\017H\020¢\006\002\bRJ\020\020S\032\0020\0052\006\020C\032\0020\005H\026J%\020T\032\0020\0172\006\020O\032\0020\0172\006\020P\032\0020\0172\006\020Q\032\0020\017H\020¢\006\002\bUJ=\020V\032\0020W2\006\020X\032\0020\0172\006\020Y\032\0020\0172\006\020Z\032\0020\0172\006\020[\032\0020\0172\006\020\035\032\0020\001H\020ø\001\000ø\001\001¢\006\004\b\\\020]R\035\020\t\032\016\022\004\022\0020\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b#\020$R\024\020%\032\0020 X\004¢\006\b\n\000\032\004\b&\020'R\024\020(\032\0020 X\004¢\006\b\n\000\032\004\b)\020'R\024\020*\032\0020\005X\004¢\006\b\n\000\032\004\b+\020,R\024\020-\032\0020.X\004¢\006\b\n\000\032\004\b-\020/R\024\0200\032\0020.X\004¢\006\b\n\000\032\004\b0\020/R\016\020\020\032\0020\017X\004¢\006\002\n\000R\016\020\016\032\0020\017X\004¢\006\002\n\000R\035\020\006\032\016\022\004\022\0020\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b1\020$R\024\0202\032\0020 X\004¢\006\b\n\000\032\004\b3\020'R\024\0204\032\0020 X\004¢\006\b\n\000\032\004\b5\020'R\024\020\013\032\0020\005X\004¢\006\b\n\000\032\004\b6\020,R\023\020!\032\004\030\0010\023¢\006\b\n\000\032\004\b7\0208R\024\020\036\032\0020\005X\004¢\006\b\n\000\032\004\b9\020,R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b:\020;\002\013\n\002\b!\n\005\b¡\0360\001¨\006_"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "toXYZ", "", "oetf", "Lkotlin/Function1;", "", "eotf", "(Ljava/lang/String;[FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "primaries", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "min", "", "max", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FF)V", "function", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "id", "", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "colorSpace", "transform", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "transferParameters", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "getEotf", "()Lkotlin/jvm/functions/Function1;", "eotfFunc", "getEotfFunc$ui_graphics", "()Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "eotfOrig", "getEotfOrig$ui_graphics", "inverseTransform", "getInverseTransform$ui_graphics", "()[F", "isSrgb", "", "()Z", "isWideGamut", "getOetf", "oetfFunc", "getOetfFunc$ui_graphics", "oetfOrig", "getOetfOrig$ui_graphics", "getPrimaries$ui_graphics", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransform$ui_graphics", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "equals", "other", "", "fromLinear", "r", "g", "b", "v", "fromXyz", "getInverseTransform", "getMaxValue", "component", "getMinValue", "getPrimaries", "getTransform", "hashCode", "toLinear", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics", "toXyz", "toZ", "toZ$ui_graphics", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "xyzaToColor-JlNiLsg$ui_graphics", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics"})
/*      */ @SourceDebugExtension({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n+ 2 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1382:1\n716#2:1383\n735#2:1384\n754#2:1388\n716#2:1389\n735#2:1390\n754#2:1391\n63#3,3:1385\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n*L\n897#1:1383\n898#1:1384\n908#1:1388\n920#1:1389\n921#1:1390\n922#1:1391\n900#1:1385,3\n*E\n"})
/*      */ public final class Rgb
/*      */   extends ColorSpace
/*      */ {
/*      */   @NotNull
/*      */   public final WhitePoint getWhitePoint() {
/*  189 */     return this.whitePoint;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final TransferParameters getTransferParameters() {
/*  208 */     return this.transferParameters;
/*      */   }
/*  210 */   @NotNull public final float[] getPrimaries$ui_graphics() { return this.primaries; } @NotNull public final float[] getTransform$ui_graphics() { return this.transform; } @NotNull public final float[] getInverseTransform$ui_graphics() { return this.inverseTransform; } @NotNull public final DoubleFunction getOetfOrig$ui_graphics() { return this.oetfOrig; } public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @Nullable float[] transform, @NotNull DoubleFunction oetf, @NotNull DoubleFunction eotf, float min, float max, @Nullable TransferParameters transferParameters, int id) { super(name, ColorModel.Companion.getRgb-xdoWZVw(), id, null);
/*      */     this.whitePoint = whitePoint;
/*      */     this.min = min;
/*      */     this.max = max;
/*      */     this.transferParameters = transferParameters;
/*  215 */     this.oetfOrig = oetf;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  237 */     this.oetf = new Rgb$oetf$1();
/*      */ 
/*      */ 
/*      */     
/*  241 */     this.oetfFunc = this::oetfFunc$lambda$0;
/*      */ 
/*      */ 
/*      */     
/*  245 */     this.eotfOrig = eotf;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  266 */     this.eotf = new Rgb$eotf$1();
/*      */ 
/*      */ 
/*      */     
/*  270 */     this.eotfFunc = this::eotfFunc$lambda$1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  278 */     if (primaries.length != 6 && primaries.length != 9) {
/*  279 */       throw new IllegalArgumentException(
/*      */           
/*  281 */           "The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  287 */     if (this.min >= this.max) {
/*  288 */       throw new IllegalArgumentException(
/*  289 */           "Invalid range: min=" + this.min + ", max=" + this.max + "; min must be strictly < max");
/*      */     }
/*      */     
/*  292 */     this.primaries = Companion.xyPrimaries(primaries);
/*      */     
/*  294 */     if (transform == null) {
/*  295 */       this.transform = Companion.computeXYZMatrix(this.primaries, this.whitePoint);
/*      */     } else {
/*  297 */       if (transform.length != 9) {
/*  298 */         throw new IllegalArgumentException(
/*  299 */             "Transform must have 9 entries! Has " + transform.length);
/*      */       }
/*      */       
/*  302 */       this.transform = transform;
/*      */     } 
/*  304 */     this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
/*      */ 
/*      */ 
/*      */     
/*  308 */     this.isWideGamut = Companion.isWideGamut(this.primaries, this.min, this.max);
/*  309 */     this.isSrgb = Companion.isSrgb(this.primaries, this.whitePoint, oetf, eotf, this.min, this.max, id); }
/*      */   @NotNull
/*      */   public final Function1<Double, Double> getOetf() { return this.oetf; }
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\006\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"})
/*      */   static final class Rgb$oetf$1 extends Lambda implements Function1<Double, Double> {
/*      */     @NotNull
/*      */     public final Double invoke(double x) { return Double.valueOf(RangesKt.coerceIn(Rgb.this.getOetfOrig$ui_graphics().invoke(x), Rgb.this.min, Rgb.this.max)); } Rgb$oetf$1() {
/*      */       super(1);
/*      */     } } @NotNull
/*      */   public final DoubleFunction getOetfFunc$ui_graphics() {
/*      */     return this.oetfFunc;
/*      */   } @Size(6L)
/*      */   @NotNull
/*      */   public final float[] getPrimaries() {
/*  323 */     Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.primaries, this.primaries.length), "copyOf(...)"); return Arrays.copyOf(this.primaries, this.primaries.length); } private static final double oetfFunc$lambda$0(Rgb this$0, double x) { Intrinsics.checkNotNullParameter(this$0, "this$0");
/*      */     return RangesKt.coerceIn(this$0.oetfOrig.invoke(x), this$0.min, this$0.max); }
/*      */   @NotNull public final DoubleFunction getEotfOrig$ui_graphics() { return this.eotfOrig; }
/*      */   @NotNull public final Function1<Double, Double> getEotf() { return this.eotf; }
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\006\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"})
/*      */   static final class Rgb$eotf$1 extends Lambda implements Function1<Double, Double> {
/*      */     @NotNull
/*      */     public final Double invoke(double x) { return Double.valueOf(Rgb.this.getEotfOrig$ui_graphics().invoke(RangesKt.coerceIn(x, Rgb.this.min, Rgb.this.max))); }
/*      */     Rgb$eotf$1() { super(1); } }
/*      */   @NotNull
/*      */   public final DoubleFunction getEotfFunc$ui_graphics() { return this.eotfFunc; }
/*      */   private static final double eotfFunc$lambda$1(Rgb this$0, double x) { Intrinsics.checkNotNullParameter(this$0, "this$0");
/*      */     return this$0.eotfOrig.invoke(RangesKt.coerceIn(x, this$0.min, this$0.max)); }
/*      */   public boolean isWideGamut() { return this.isWideGamut; }
/*      */   public boolean isSrgb() { return this.isSrgb; }
/*      */   @Size(9L)
/*      */   @NotNull
/*  340 */   public final float[] getTransform() { Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.transform, this.transform.length), "copyOf(...)"); return Arrays.copyOf(this.transform, this.transform.length); }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Size(9L)
/*      */   @NotNull
/*      */   public final float[] getInverseTransform() {
/*  357 */     Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.inverseTransform, this.inverseTransform.length), "copyOf(...)"); return Arrays.copyOf(this.inverseTransform, this.inverseTransform.length);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Rgb(@Size(min = 1L) @NotNull String name, @Size(9L) @NotNull float[] toXYZ, @NotNull Function1 oetf, @NotNull Function1 eotf) {
/*  382 */     this(
/*  383 */         name, 
/*  384 */         Companion.computePrimaries$ui_graphics(toXYZ), 
/*  385 */         Companion.computeWhitePoint(toXYZ), 
/*  386 */         null, 
/*  387 */         oetf::_init_$lambda$2, 
/*  388 */         eotf::_init_$lambda$3, 
/*  389 */         0.0F, 
/*  390 */         1.0F, 
/*  391 */         null, 
/*  392 */         -1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final double _init_$lambda$2(Function1 $oetf, double x) {
/*      */     Intrinsics.checkNotNullParameter($oetf, "$oetf");
/*      */     return ((Number)$oetf.invoke(Double.valueOf(x))).doubleValue();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final double _init_$lambda$3(Function1 $eotf, double x) {
/*      */     Intrinsics.checkNotNullParameter($eotf, "$eotf");
/*      */     return ((Number)$eotf.invoke(Double.valueOf(x))).doubleValue();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Rgb(@Size(min = 1L) @NotNull String name, @Size(min = 6L, max = 9L) @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @NotNull Function1 oetf, @NotNull Function1 eotf, float min, float max) {
/*  436 */     this(
/*  437 */         name, 
/*  438 */         primaries, 
/*  439 */         whitePoint, 
/*  440 */         null, 
/*  441 */         oetf::_init_$lambda$4, 
/*  442 */         eotf::_init_$lambda$5, 
/*  443 */         min, 
/*  444 */         max, 
/*  445 */         null, 
/*  446 */         -1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final double _init_$lambda$4(Function1 $oetf, double x) {
/*      */     Intrinsics.checkNotNullParameter($oetf, "$oetf");
/*      */     return ((Number)$oetf.invoke(Double.valueOf(x))).doubleValue();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final double _init_$lambda$5(Function1 $eotf, double x) {
/*      */     Intrinsics.checkNotNullParameter($eotf, "$eotf");
/*      */     return ((Number)$eotf.invoke(Double.valueOf(x))).doubleValue();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Rgb(@Size(min = 1L) @NotNull String name, @Size(9L) @NotNull float[] toXYZ, @NotNull TransferParameters function) {
/*  469 */     this(name, Companion.computePrimaries$ui_graphics(toXYZ), Companion.computeWhitePoint(toXYZ), function, -1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Rgb(@Size(min = 1L) @NotNull String name, @Size(min = 6L, max = 9L) @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @NotNull TransferParameters function) {
/*  505 */     this(name, primaries, whitePoint, function, -1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @NotNull TransferParameters function, int id) {
/*  547 */     this(
/*  548 */         name, primaries, whitePoint, null, 
/*  549 */         (((function.getE() == 0.0D)) && ((function.getF() == 0.0D))) ? function::_init_$lambda$6 : 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  558 */         function::_init_$lambda$7, 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  564 */         (((function.getE() == 0.0D)) && ((function.getF() == 0.0D))) ? function::_init_$lambda$8 : 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  573 */         function::_init_$lambda$9, 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  579 */         0.0F, 1.0F, function, id);
/*      */   }
/*      */ 
/*      */   
/*      */   private static final double _init_$lambda$6(TransferParameters $function, double x) {
/*      */     Intrinsics.checkNotNullParameter($function, "$function");
/*      */     return ColorSpaceKt.rcpResponse(x, $function.getA(), $function.getB(), $function.getC(), $function.getD(), $function.getGamma());
/*      */   }
/*      */   
/*      */   private static final double _init_$lambda$7(TransferParameters $function, double x) {
/*      */     Intrinsics.checkNotNullParameter($function, "$function");
/*      */     return ColorSpaceKt.rcpResponse(x, $function.getA(), $function.getB(), $function.getC(), $function.getD(), $function.getE(), $function.getF(), $function.getGamma());
/*      */   }
/*      */   
/*      */   private static final double _init_$lambda$8(TransferParameters $function, double x) {
/*      */     Intrinsics.checkNotNullParameter($function, "$function");
/*      */     return ColorSpaceKt.response(x, $function.getA(), $function.getB(), $function.getC(), $function.getD(), $function.getGamma());
/*      */   }
/*      */   
/*      */   private static final double _init_$lambda$9(TransferParameters $function, double x) {
/*      */     Intrinsics.checkNotNullParameter($function, "$function");
/*      */     return ColorSpaceKt.response(x, $function.getA(), $function.getB(), $function.getC(), $function.getD(), $function.getE(), $function.getF(), $function.getGamma());
/*      */   }
/*      */   
/*      */   public Rgb(@Size(min = 1L) @NotNull String name, @Size(9L) @NotNull float[] toXYZ, double gamma) {
/*  604 */     this(
/*  605 */         name, Companion.computePrimaries$ui_graphics(toXYZ), Companion.computeWhitePoint(toXYZ), gamma, 0.0F, 1.0F, 
/*  606 */         -1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Rgb(@Size(min = 1L) @NotNull String name, @Size(min = 6L, max = 9L) @NotNull float[] primaries, @NotNull WhitePoint whitePoint, double gamma) {
/*  645 */     this(name, primaries, whitePoint, gamma, 0.0F, 1.0F, -1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, double gamma, float min, float max, int id) {
/*  692 */     this(
/*  693 */         name, primaries, whitePoint, null, (
/*  694 */         (gamma == 1.0D)) ? DoubleIdentity : 
/*  695 */         gamma::_init_$lambda$10, 
/*  696 */         ((gamma == 1.0D)) ? DoubleIdentity : 
/*  697 */         gamma::_init_$lambda$11, 
/*  698 */         min, 
/*  699 */         max, 
/*  700 */         new TransferParameters(gamma, 1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 96, null), 
/*  701 */         id);
/*      */   }
/*      */   
/*      */   private static final double _init_$lambda$10(double $gamma, double x) {
/*      */     return Math.pow((x < 0.0D) ? 0.0D : x, 1.0D / $gamma);
/*      */   }
/*      */   
/*      */   private static final double _init_$lambda$11(double $gamma, double x) {
/*      */     return Math.pow((x < 0.0D) ? 0.0D : x, $gamma);
/*      */   }
/*      */   
/*      */   public Rgb(@NotNull Rgb colorSpace, @NotNull float[] transform, @NotNull WhitePoint whitePoint) {
/*  713 */     this(
/*  714 */         colorSpace.getName(), colorSpace.primaries, whitePoint, transform, 
/*  715 */         colorSpace.oetfOrig, colorSpace.eotfOrig, colorSpace.min, colorSpace.max, 
/*  716 */         colorSpace.transferParameters, 
/*  717 */         -1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Size(min = 6L)
/*      */   @NotNull
/*      */   public final float[] getPrimaries(@Size(min = 6L) @NotNull float[] primaries) {
/*  735 */     Intrinsics.checkNotNullParameter(primaries, "primaries"); return ArraysKt.copyInto$default(this.primaries, primaries, 0, 0, 0, 14, null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Size(min = 9L)
/*      */   @NotNull
/*      */   public final float[] getTransform(@Size(min = 9L) @NotNull float[] transform) {
/*  757 */     Intrinsics.checkNotNullParameter(transform, "transform"); return ArraysKt.copyInto$default(this.transform, transform, 0, 0, 0, 14, null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Size(min = 9L)
/*      */   @NotNull
/*      */   public final float[] getInverseTransform(@Size(min = 9L) @NotNull float[] inverseTransform) {
/*  780 */     Intrinsics.checkNotNullParameter(inverseTransform, "inverseTransform"); return ArraysKt.copyInto$default(this.inverseTransform, inverseTransform, 0, 0, 0, 14, null);
/*      */   }
/*      */   
/*      */   public float getMinValue(int component) {
/*  784 */     return this.min;
/*      */   }
/*      */   
/*      */   public float getMaxValue(int component) {
/*  788 */     return this.max;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Size(3L)
/*      */   @NotNull
/*      */   public final float[] toLinear(float r, float g, float b) {
/*  810 */     float[] arrayOfFloat = new float[3]; arrayOfFloat[0] = r; arrayOfFloat[1] = g; arrayOfFloat[2] = b; return toLinear(arrayOfFloat);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Size(min = 3L)
/*      */   @NotNull
/*      */   public final float[] toLinear(@Size(min = 3L) @NotNull float[] v) {
/*  832 */     Intrinsics.checkNotNullParameter(v, "v"); v[0] = (float)this.eotfFunc.invoke(v[0]);
/*  833 */     v[1] = (float)this.eotfFunc.invoke(v[1]);
/*  834 */     v[2] = (float)this.eotfFunc.invoke(v[2]);
/*  835 */     return v;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Size(3L)
/*      */   @NotNull
/*      */   public final float[] fromLinear(float r, float g, float b) {
/*  857 */     float[] arrayOfFloat = new float[3]; arrayOfFloat[0] = r; arrayOfFloat[1] = g; arrayOfFloat[2] = b; return fromLinear(arrayOfFloat);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Size(min = 3L)
/*      */   @NotNull
/*      */   public final float[] fromLinear(@Size(min = 3L) @NotNull float[] v) {
/*  879 */     Intrinsics.checkNotNullParameter(v, "v"); v[0] = (float)this.oetfFunc.invoke(v[0]);
/*  880 */     v[1] = (float)this.oetfFunc.invoke(v[1]);
/*  881 */     v[2] = (float)this.oetfFunc.invoke(v[2]);
/*  882 */     return v;
/*      */   }
/*      */   @NotNull
/*      */   public float[] toXyz(@NotNull float[] v) {
/*  886 */     Intrinsics.checkNotNullParameter(v, "v"); v[0] = (float)this.eotfFunc.invoke(v[0]);
/*  887 */     v[1] = (float)this.eotfFunc.invoke(v[1]);
/*  888 */     v[2] = (float)this.eotfFunc.invoke(v[2]);
/*  889 */     return ColorSpaceKt.mul3x3Float3(this.transform, v);
/*      */   }
/*      */   
/*      */   public long toXy$ui_graphics(float v0, float v1, float v2) {
/*  893 */     float v00 = (float)this.eotfFunc.invoke(v0);
/*  894 */     float v10 = (float)this.eotfFunc.invoke(v1);
/*  895 */     float v20 = (float)this.eotfFunc.invoke(v2);
/*      */     
/*  897 */     float[] lhs$iv = this.transform; int $i$f$mul3x3Float3_0 = 0; float x = 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1383 */       lhs$iv[0] * v00 + lhs$iv[3] * v10 + lhs$iv[6] * v20; float[] arrayOfFloat1 = this.transform; int $i$f$mul3x3Float3_1 = 0;
/* 1384 */     float y = arrayOfFloat1[1] * v00 + arrayOfFloat1[4] * v10 + arrayOfFloat1[7] * v20; int $i$f$packFloats = 0;
/* 1385 */     long v1$iv = Float.floatToRawIntBits(x);
/* 1386 */     long v2$iv = Float.floatToRawIntBits(y);
/* 1387 */     return v1$iv << 32L | v2$iv & 0xFFFFFFFFL; } public float toZ$ui_graphics(float v0, float v1, float v2) { float v00 = (float)this.eotfFunc.invoke(v0); float v10 = (float)this.eotfFunc.invoke(v1); float v20 = (float)this.eotfFunc.invoke(v2); float[] lhs$iv = this.transform; int $i$f$mul3x3Float3_2 = 0;
/* 1388 */     float z = lhs$iv[2] * v00 + lhs$iv[5] * v10 + lhs$iv[8] * v20; return z; } public long xyzaToColor-JlNiLsg$ui_graphics(float x, float y, float z, float a, @NotNull ColorSpace colorSpace) { Intrinsics.checkNotNullParameter(colorSpace, "colorSpace"); float[] lhs$iv = this.inverseTransform; int $i$f$mul3x3Float3_0 = 0;
/* 1389 */     float v0 = lhs$iv[0] * x + lhs$iv[3] * y + lhs$iv[6] * z; float[] arrayOfFloat1 = this.inverseTransform; int $i$f$mul3x3Float3_1 = 0;
/* 1390 */     float v1 = arrayOfFloat1[1] * x + arrayOfFloat1[4] * y + arrayOfFloat1[7] * z; float[] arrayOfFloat2 = this.inverseTransform; int $i$f$mul3x3Float3_2 = 0;
/* 1391 */     float v2 = arrayOfFloat2[2] * x + arrayOfFloat2[5] * y + arrayOfFloat2[8] * z;
/*      */     v0 = (float)this.oetfFunc.invoke(v0);
/*      */     v1 = (float)this.oetfFunc.invoke(v1);
/*      */     v2 = (float)this.oetfFunc.invoke(v2);
/*      */     return ColorKt.Color(v0, v1, v2, a, colorSpace); }
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public float[] fromXyz(@NotNull float[] v) {
/*      */     Intrinsics.checkNotNullParameter(v, "v");
/*      */     ColorSpaceKt.mul3x3Float3(this.inverseTransform, v);
/*      */     v[0] = (float)this.oetfFunc.invoke(v[0]);
/*      */     v[1] = (float)this.oetfFunc.invoke(v[1]);
/*      */     v[2] = (float)this.oetfFunc.invoke(v[2]);
/*      */     return v;
/*      */   }
/*      */   
/*      */   public boolean equals(@Nullable Object other) {
/*      */     if (this == other)
/*      */       return true; 
/*      */     if (other == null || getClass() != other.getClass())
/*      */       return false; 
/*      */     if (!super.equals(other))
/*      */       return false; 
/*      */     Rgb rgb = (Rgb)other;
/*      */     if (Float.compare(rgb.min, this.min) != 0)
/*      */       return false; 
/*      */     if (Float.compare(rgb.max, this.max) != 0)
/*      */       return false; 
/*      */     if (!Intrinsics.areEqual(this.whitePoint, rgb.whitePoint))
/*      */       return false; 
/*      */     if (!Arrays.equals(this.primaries, rgb.primaries))
/*      */       return false; 
/*      */     if (this.transferParameters != null)
/*      */       return Intrinsics.areEqual(this.transferParameters, rgb.transferParameters); 
/*      */     if (rgb.transferParameters == null)
/*      */       return true; 
/*      */     return !Intrinsics.areEqual(this.oetfOrig, rgb.oetfOrig) ? false : Intrinsics.areEqual(this.eotfOrig, rgb.eotfOrig);
/*      */   }
/*      */   
/*      */   public int hashCode() {
/*      */     int result = super.hashCode();
/*      */     result = 31 * result + this.whitePoint.hashCode();
/*      */     result = 31 * result + Arrays.hashCode(this.primaries);
/*      */     result = 31 * result + (!((this.min == 0.0F) ? 1 : 0) ? Float.floatToIntBits(this.min) : 0);
/*      */     result = 31 * result + (!((this.max == 0.0F) ? 1 : 0) ? Float.floatToIntBits(this.max) : 0);
/*      */     result = 31 * result + ((this.transferParameters != null) ? this.transferParameters.hashCode() : 0);
/*      */     if (this.transferParameters == null) {
/*      */       result = 31 * result + this.oetfOrig.hashCode();
/*      */       result = 31 * result + this.eotfOrig.hashCode();
/*      */     } 
/*      */     return result;
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\007\n\000\n\002\020\024\n\000\n\002\020\013\n\000\n\002\020\006\n\002\b\006\n\002\030\002\n\002\b\020\n\002\020\b\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\005\032\0020\0062\006\020\007\032\0020\bH\002J \020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\0042\006\020\016\032\0020\004H\002J\025\020\017\032\0020\b2\006\020\020\032\0020\bH\000¢\006\002\b\021J\020\020\022\032\0020\0232\006\020\020\032\0020\bH\002J\030\020\024\032\0020\b2\006\020\007\032\0020\b2\006\020\025\032\0020\023H\002J\030\020\026\032\0020\n2\006\020\027\032\0020\b2\006\020\030\032\0020\bH\002J(\020\031\032\0020\0062\006\020\032\032\0020\0062\006\020\033\032\0020\0062\006\020\034\032\0020\0062\006\020\035\032\0020\006H\002J@\020\036\032\0020\n2\006\020\007\032\0020\b2\006\020\025\032\0020\0232\006\020\037\032\0020\0042\006\020 \032\0020\0042\006\020!\032\0020\0062\006\020\"\032\0020\0062\006\020#\032\0020$H\002J \020%\032\0020\n2\006\020\007\032\0020\b2\006\020!\032\0020\0062\006\020\"\032\0020\006H\002J\020\020&\032\0020\b2\006\020\007\032\0020\bH\002R\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006'"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "()V", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "area", "", "primaries", "", "compare", "", "point", "", "a", "b", "computePrimaries", "toXYZ", "computePrimaries$ui_graphics", "computeWhitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "computeXYZMatrix", "whitePoint", "contains", "p1", "p2", "cross", "ax", "ay", "bx", "by", "isSrgb", "OETF", "EOTF", "min", "max", "id", "", "isWideGamut", "xyPrimaries", "ui-graphics"})
/*      */   public static final class Companion {
/*      */     private Companion() {}
/*      */     
/*      */     private final boolean isSrgb(float[] primaries, WhitePoint whitePoint, DoubleFunction OETF, DoubleFunction EOTF, float min, float max, int id) {
/*      */       if (id == 0)
/*      */         return true; 
/*      */       if (!ColorSpaceKt.compare(primaries, ColorSpaces.INSTANCE.getSrgbPrimaries$ui_graphics()))
/*      */         return false; 
/*      */       if (!ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65()))
/*      */         return false; 
/*      */       if (!((min == 0.0F) ? 1 : 0))
/*      */         return false; 
/*      */       if (!((max == 1.0F) ? 1 : 0))
/*      */         return false; 
/*      */       Rgb srgb = ColorSpaces.INSTANCE.getSrgb();
/*      */       double x = 0.0D;
/*      */       while (x <= 1.0D) {
/*      */         if (!compare(x, OETF, srgb.getOetfOrig$ui_graphics()))
/*      */           return false; 
/*      */         if (!compare(x, EOTF, srgb.getEotfOrig$ui_graphics()))
/*      */           return false; 
/*      */         x += 0.00392156862745098D;
/*      */       } 
/*      */       return true;
/*      */     }
/*      */     
/*      */     private final boolean compare(double point, DoubleFunction a, DoubleFunction b) {
/*      */       double rA = a.invoke(point);
/*      */       double rB = b.invoke(point);
/*      */       return (Math.abs(rA - rB) <= 0.001D);
/*      */     }
/*      */     
/*      */     private final boolean isWideGamut(float[] primaries, float min, float max) {
/*      */       if (area(primaries) / area(ColorSpaces.INSTANCE.getNtsc1953Primaries$ui_graphics()) <= 0.9F || !contains(primaries, ColorSpaces.INSTANCE.getSrgbPrimaries$ui_graphics())) {
/*      */         if (min < 0.0F && max > 1.0F);
/*      */         return false;
/*      */       } 
/*      */     }
/*      */     
/*      */     private final float area(float[] primaries) {
/*      */       float rx = primaries[0];
/*      */       float ry = primaries[1];
/*      */       float gx = primaries[2];
/*      */       float gy = primaries[3];
/*      */       float bx = primaries[4];
/*      */       float by = primaries[5];
/*      */       float det = rx * gy + ry * bx + gx * by - gy * bx - ry * gx - rx * by;
/*      */       float r = 0.5F * det;
/*      */       return (r < 0.0F) ? -r : r;
/*      */     }
/*      */     
/*      */     private final float cross(float ax, float ay, float bx, float by) {
/*      */       return ax * by - ay * bx;
/*      */     }
/*      */     
/*      */     private final boolean contains(float[] p1, float[] p2) {
/*      */       float[] arrayOfFloat1 = new float[6];
/*      */       arrayOfFloat1[0] = p1[0] - p2[0];
/*      */       arrayOfFloat1[1] = p1[1] - p2[1];
/*      */       arrayOfFloat1[2] = p1[2] - p2[2];
/*      */       arrayOfFloat1[3] = p1[3] - p2[3];
/*      */       arrayOfFloat1[4] = p1[4] - p2[4];
/*      */       arrayOfFloat1[5] = p1[5] - p2[5];
/*      */       float[] p0 = arrayOfFloat1;
/*      */       if (cross(p0[0], p0[1], p2[0] - p2[4], p2[1] - p2[5]) < 0.0F || cross(p2[0] - p2[2], p2[1] - p2[3], p0[0], p0[1]) < 0.0F)
/*      */         return false; 
/*      */       if (cross(p0[2], p0[3], p2[2] - p2[0], p2[3] - p2[1]) < 0.0F || cross(p2[2] - p2[4], p2[3] - p2[5], p0[2], p0[3]) < 0.0F)
/*      */         return false; 
/*      */       return (cross(p0[4], p0[5], p2[4] - p2[2], p2[5] - p2[3]) >= 0.0F && cross(p2[4] - p2[0], p2[5] - p2[1], p0[4], p0[5]) >= 0.0F);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final float[] computePrimaries$ui_graphics(@NotNull float[] toXYZ) {
/*      */       Intrinsics.checkNotNullParameter(toXYZ, "toXYZ");
/*      */       float[] arrayOfFloat1 = new float[3];
/*      */       arrayOfFloat1[0] = 1.0F;
/*      */       arrayOfFloat1[1] = 0.0F;
/*      */       arrayOfFloat1[2] = 0.0F;
/*      */       float[] r = ColorSpaceKt.mul3x3Float3(toXYZ, arrayOfFloat1);
/*      */       float[] arrayOfFloat2 = new float[3];
/*      */       arrayOfFloat2[0] = 0.0F;
/*      */       arrayOfFloat2[1] = 1.0F;
/*      */       arrayOfFloat2[2] = 0.0F;
/*      */       float[] g = ColorSpaceKt.mul3x3Float3(toXYZ, arrayOfFloat2);
/*      */       float[] arrayOfFloat3 = new float[3];
/*      */       arrayOfFloat3[0] = 0.0F;
/*      */       arrayOfFloat3[1] = 0.0F;
/*      */       arrayOfFloat3[2] = 1.0F;
/*      */       float[] b = ColorSpaceKt.mul3x3Float3(toXYZ, arrayOfFloat3);
/*      */       float rSum = r[0] + r[1] + r[2];
/*      */       float gSum = g[0] + g[1] + g[2];
/*      */       float bSum = b[0] + b[1] + b[2];
/*      */       float[] arrayOfFloat4 = new float[6];
/*      */       arrayOfFloat4[0] = r[0] / rSum;
/*      */       arrayOfFloat4[1] = r[1] / rSum;
/*      */       arrayOfFloat4[2] = g[0] / gSum;
/*      */       arrayOfFloat4[3] = g[1] / gSum;
/*      */       arrayOfFloat4[4] = b[0] / bSum;
/*      */       arrayOfFloat4[5] = b[1] / bSum;
/*      */       return arrayOfFloat4;
/*      */     }
/*      */     
/*      */     private final WhitePoint computeWhitePoint(float[] toXYZ) {
/*      */       float[] arrayOfFloat1 = new float[3];
/*      */       arrayOfFloat1[0] = 1.0F;
/*      */       arrayOfFloat1[1] = 1.0F;
/*      */       arrayOfFloat1[2] = 1.0F;
/*      */       float[] w = ColorSpaceKt.mul3x3Float3(toXYZ, arrayOfFloat1);
/*      */       float sum = w[0] + w[1] + w[2];
/*      */       return new WhitePoint(w[0] / sum, w[1] / sum);
/*      */     }
/*      */     
/*      */     private final float[] xyPrimaries(float[] primaries) {
/*      */       float[] xyPrimaries = new float[6];
/*      */       if (primaries.length == 9) {
/*      */         float sum = primaries[0] + primaries[1] + primaries[2];
/*      */         xyPrimaries[0] = primaries[0] / sum;
/*      */         xyPrimaries[1] = primaries[1] / sum;
/*      */         sum = primaries[3] + primaries[4] + primaries[5];
/*      */         xyPrimaries[2] = primaries[3] / sum;
/*      */         xyPrimaries[3] = primaries[4] / sum;
/*      */         sum = primaries[6] + primaries[7] + primaries[8];
/*      */         xyPrimaries[4] = primaries[6] / sum;
/*      */         xyPrimaries[5] = primaries[7] / sum;
/*      */       } else {
/*      */         ArraysKt.copyInto$default(primaries, xyPrimaries, 0, 0, 6, 6, null);
/*      */       } 
/*      */       return xyPrimaries;
/*      */     }
/*      */     
/*      */     private final float[] computeXYZMatrix(float[] primaries, WhitePoint whitePoint) {
/*      */       float rx = primaries[0];
/*      */       float ry = primaries[1];
/*      */       float gx = primaries[2];
/*      */       float gy = primaries[3];
/*      */       float bx = primaries[4];
/*      */       float by = primaries[5];
/*      */       float wx = whitePoint.getX();
/*      */       float wy = whitePoint.getY();
/*      */       float oneRxRy = (true - rx) / ry;
/*      */       float oneGxGy = (true - gx) / gy;
/*      */       float oneBxBy = (true - bx) / by;
/*      */       float oneWxWy = (true - wx) / wy;
/*      */       float rxRy = rx / ry;
/*      */       float gxGy = gx / gy;
/*      */       float bxBy = bx / by;
/*      */       float wxWy = wx / wy;
/*      */       float byNumerator = (oneWxWy - oneRxRy) * (gxGy - rxRy) - (wxWy - rxRy) * (oneGxGy - oneRxRy);
/*      */       float byDenominator = (oneBxBy - oneRxRy) * (gxGy - rxRy) - (bxBy - rxRy) * (oneGxGy - oneRxRy);
/*      */       float bY = byNumerator / byDenominator;
/*      */       float gY = (wxWy - rxRy - bY * (bxBy - rxRy)) / (gxGy - rxRy);
/*      */       float rY = 1.0F - gY - bY;
/*      */       float rYRy = rY / ry;
/*      */       float gYGy = gY / gy;
/*      */       float bYBy = bY / by;
/*      */       float[] arrayOfFloat = new float[9];
/*      */       arrayOfFloat[0] = rYRy * rx;
/*      */       arrayOfFloat[1] = rY;
/*      */       arrayOfFloat[2] = rYRy * (1.0F - rx - ry);
/*      */       arrayOfFloat[3] = gYGy * gx;
/*      */       arrayOfFloat[4] = gY;
/*      */       arrayOfFloat[5] = gYGy * (1.0F - gx - gy);
/*      */       arrayOfFloat[6] = bYBy * bx;
/*      */       arrayOfFloat[7] = bY;
/*      */       arrayOfFloat[8] = bYBy * (1.0F - bx - by);
/*      */       return arrayOfFloat;
/*      */     }
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public static final Companion Companion = new Companion(null);
/*      */   @NotNull
/*      */   private final WhitePoint whitePoint;
/*      */   private final float min;
/*      */   private final float max;
/*      */   @Nullable
/*      */   private final TransferParameters transferParameters;
/*      */   @NotNull
/*      */   private final float[] primaries;
/*      */   @NotNull
/*      */   private final float[] transform;
/*      */   @NotNull
/*      */   private final float[] inverseTransform;
/*      */   @NotNull
/*      */   private final DoubleFunction oetfOrig;
/*      */   @NotNull
/*      */   private final Function1<Double, Double> oetf;
/*      */   @NotNull
/*      */   private final DoubleFunction oetfFunc;
/*      */   @NotNull
/*      */   private final DoubleFunction eotfOrig;
/*      */   @NotNull
/*      */   private final Function1<Double, Double> eotf;
/*      */   @NotNull
/*      */   private final DoubleFunction eotfFunc;
/*      */   private final boolean isWideGamut;
/*      */   private final boolean isSrgb;
/*      */   @NotNull
/*      */   private static final DoubleFunction DoubleIdentity = Rgb::DoubleIdentity$lambda$12;
/*      */   
/*      */   private static final double DoubleIdentity$lambda$12(double d) {
/*      */     return d;
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\colorspace\Rgb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */