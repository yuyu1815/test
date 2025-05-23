/*     */ package androidx.compose.ui.graphics.colorspace;
/*     */ 
/*     */ import androidx.annotation.Size;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\013\n\002\030\002\n\002\b\005\n\002\020\021\n\002\b\016\n\002\030\002\n\002\b\003\n\002\020\024\n\002\b\023\n\002\020\b\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\026\020;\032\0020\0202\006\020<\032\0020=H\b¢\006\002\b>J\032\020?\032\004\030\0010\0202\b\b\001\020@\032\0020)2\006\020A\032\0020%R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\021\020\r\032\0020\004¢\006\b\n\000\032\004\b\016\020\006R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b\021\020\022R\021\020\023\032\0020\020¢\006\b\n\000\032\004\b\024\020\022R\034\020\025\032\b\022\004\022\0020\0200\026X\004¢\006\n\n\002\020\031\032\004\b\027\020\030R\021\020\032\032\0020\004¢\006\b\n\000\032\004\b\033\020\006R\021\020\034\032\0020\004¢\006\b\n\000\032\004\b\035\020\006R\021\020\036\032\0020\004¢\006\b\n\000\032\004\b\037\020\006R\021\020 \032\0020\004¢\006\b\n\000\032\004\b!\020\006R\021\020\"\032\0020\004¢\006\b\n\000\032\004\b#\020\006R\016\020$\032\0020%X\004¢\006\002\n\000R\021\020&\032\0020\004¢\006\b\n\000\032\004\b'\020\006R\024\020(\032\0020)X\004¢\006\b\n\000\032\004\b*\020+R\021\020,\032\0020\020¢\006\b\n\000\032\004\b-\020\022R\021\020.\032\0020\004¢\006\b\n\000\032\004\b/\020\006R\021\0200\032\0020\004¢\006\b\n\000\032\004\b1\020\006R\021\0202\032\0020\004¢\006\b\n\000\032\004\b3\020\006R\024\0204\032\0020)X\004¢\006\b\n\000\032\004\b5\020+R\024\0206\032\0020%X\004¢\006\b\n\000\032\004\b7\0208R\024\0209\032\0020\004X\004¢\006\b\n\000\032\004\b:\020\006¨\006B"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpaces;", "", "()V", "Aces", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "getAces", "()Landroidx/compose/ui/graphics/colorspace/Rgb;", "Acescg", "getAcescg", "AdobeRgb", "getAdobeRgb", "Bt2020", "getBt2020", "Bt709", "getBt709", "CieLab", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getCieLab", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "CieXyz", "getCieXyz", "ColorSpacesArray", "", "getColorSpacesArray$ui_graphics", "()[Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "[Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "DciP3", "getDciP3", "DisplayP3", "getDisplayP3", "ExtendedSrgb", "getExtendedSrgb", "LinearExtendedSrgb", "getLinearExtendedSrgb", "LinearSrgb", "getLinearSrgb", "NoneTransferParameters", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "Ntsc1953", "getNtsc1953", "Ntsc1953Primaries", "", "getNtsc1953Primaries$ui_graphics", "()[F", "Oklab", "getOklab", "ProPhotoRgb", "getProPhotoRgb", "SmpteC", "getSmpteC", "Srgb", "getSrgb", "SrgbPrimaries", "getSrgbPrimaries$ui_graphics", "SrgbTransferParameters", "getSrgbTransferParameters$ui_graphics", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "Unspecified", "getUnspecified$ui_graphics", "getColorSpace", "id", "", "getColorSpace$ui_graphics", "match", "toXYZD50", "function", "ui-graphics"})
/*     */ public final class ColorSpaces
/*     */ {
/*     */   @NotNull
/*  24 */   public static final ColorSpaces INSTANCE = new ColorSpaces(); @NotNull private static final float[] SrgbPrimaries; @NotNull private static final float[] Ntsc1953Primaries; @NotNull public final float[] getSrgbPrimaries$ui_graphics() { return SrgbPrimaries; } static { float[] arrayOfFloat = new float[6]; arrayOfFloat[0] = 0.64F; arrayOfFloat[1] = 0.33F; arrayOfFloat[2] = 0.3F; arrayOfFloat[3] = 0.6F; arrayOfFloat[4] = 0.15F; arrayOfFloat[5] = 0.06F; SrgbPrimaries = arrayOfFloat;
/*  25 */     arrayOfFloat = new float[6]; arrayOfFloat[0] = 0.67F; arrayOfFloat[1] = 0.33F; arrayOfFloat[2] = 0.21F; arrayOfFloat[3] = 0.71F; arrayOfFloat[4] = 0.14F; arrayOfFloat[5] = 0.08F; Ntsc1953Primaries = arrayOfFloat; } @NotNull public final float[] getNtsc1953Primaries$ui_graphics() { return Ntsc1953Primaries; } @NotNull
/*  26 */   public final TransferParameters getSrgbTransferParameters$ui_graphics() { return SrgbTransferParameters; } @NotNull
/*  27 */   private static final TransferParameters SrgbTransferParameters = new TransferParameters(2.4D, 0.9478672985781991D, 0.05213270142180095D, 0.07739938080495357D, 0.04045D, 0.0D, 0.0D, 96, null);
/*     */   @NotNull
/*  29 */   private static final TransferParameters NoneTransferParameters = new TransferParameters(2.2D, 0.9478672985781991D, 0.05213270142180095D, 0.07739938080495357D, 0.04045D, 0.0D, 0.0D, 96, null);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  35 */   private static final Rgb Srgb = new Rgb(
/*  36 */       "sRGB IEC61966-2.1", 
/*  37 */       SrgbPrimaries, 
/*  38 */       Illuminant.INSTANCE.getD65(), 
/*  39 */       SrgbTransferParameters, 
/*  40 */       0);
/*     */   @NotNull
/*     */   public final Rgb getSrgb() {
/*     */     return Srgb;
/*     */   }
/*     */   
/*     */   @NotNull
/*  47 */   private static final Rgb LinearSrgb = new Rgb(
/*  48 */       "sRGB IEC61966-2.1 (Linear)", 
/*  49 */       SrgbPrimaries, 
/*  50 */       Illuminant.INSTANCE.getD65(), 
/*  51 */       1.0D, 
/*  52 */       0.0F, 1.0F, 
/*  53 */       1);
/*     */   @NotNull
/*     */   public final Rgb getLinearSrgb() {
/*     */     return LinearSrgb;
/*     */   }
/*     */   
/*     */   @NotNull
/*  60 */   private static final Rgb ExtendedSrgb = new Rgb(
/*  61 */       "scRGB-nl IEC 61966-2-2:2003", 
/*  62 */       SrgbPrimaries, 
/*  63 */       Illuminant.INSTANCE.getD65(), null, ColorSpaces::ExtendedSrgb$lambda$0, ColorSpaces::ExtendedSrgb$lambda$1, 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  84 */       -0.799F, 2.399F, SrgbTransferParameters, 
/*  85 */       2); @NotNull
/*     */   public final Rgb getExtendedSrgb() { return ExtendedSrgb; } private static final double ExtendedSrgb$lambda$0(double x) {
/*     */     return ColorSpaceKt.absRcpResponse(x, 0.9478672985781991D, 0.05213270142180095D, 0.07739938080495357D, 0.04045D, 2.4D);
/*     */   } private static final double ExtendedSrgb$lambda$1(double x) {
/*     */     return ColorSpaceKt.absResponse(x, 0.9478672985781991D, 0.05213270142180095D, 0.07739938080495357D, 0.04045D, 2.4D);
/*     */   }
/*     */   @NotNull
/*  92 */   private static final Rgb LinearExtendedSrgb = new Rgb(
/*  93 */       "scRGB IEC 61966-2-2:2003", 
/*  94 */       SrgbPrimaries, 
/*  95 */       Illuminant.INSTANCE.getD65(), 
/*  96 */       1.0D, 
/*  97 */       -0.5F, 7.499F, 
/*  98 */       3); @NotNull
/*     */   private static final Rgb Bt709; @NotNull
/*     */   private static final Rgb Bt2020; @NotNull
/*     */   private static final Rgb DciP3; @NotNull
/*     */   private static final Rgb DisplayP3; @NotNull
/*     */   public final Rgb getLinearExtendedSrgb() { return LinearExtendedSrgb; }
/*     */   @NotNull
/* 105 */   public final Rgb getBt709() { return Bt709; }
/*     */   @NotNull public final Rgb getBt2020() { return Bt2020; }
/* 107 */   @NotNull public final Rgb getDciP3() { return DciP3; } static { arrayOfFloat = new float[6]; arrayOfFloat[0] = 0.64F; arrayOfFloat[1] = 0.33F; arrayOfFloat[2] = 0.3F; arrayOfFloat[3] = 0.6F; arrayOfFloat[4] = 0.15F; arrayOfFloat[5] = 0.06F; Bt709 = new Rgb("Rec. ITU-R BT.709-5", arrayOfFloat, 
/* 108 */         Illuminant.INSTANCE.getD65(), 
/* 109 */         new TransferParameters(2.2222222222222223D, 0.9099181073703367D, 0.09008189262966333D, 0.2222222222222222D, 0.081D, 0.0D, 0.0D, 96, null), 
/* 110 */         4);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 119 */     arrayOfFloat = new float[6]; arrayOfFloat[0] = 0.708F; arrayOfFloat[1] = 0.292F; arrayOfFloat[2] = 0.17F; arrayOfFloat[3] = 0.797F; arrayOfFloat[4] = 0.131F; arrayOfFloat[5] = 0.046F; Bt2020 = new Rgb("Rec. ITU-R BT.2020-1", arrayOfFloat, 
/* 120 */         Illuminant.INSTANCE.getD65(), 
/* 121 */         new TransferParameters(2.2222222222222223D, 0.9096697898662786D, 0.09033021013372146D, 0.2222222222222222D, 0.08145D, 0.0D, 0.0D, 96, null), 
/* 122 */         5);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 131 */     arrayOfFloat = new float[6]; arrayOfFloat[0] = 0.68F; arrayOfFloat[1] = 0.32F; arrayOfFloat[2] = 0.265F; arrayOfFloat[3] = 0.69F; arrayOfFloat[4] = 0.15F; arrayOfFloat[5] = 0.06F; DciP3 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", arrayOfFloat, 
/* 132 */         new WhitePoint(0.314F, 0.351F), 
/* 133 */         2.6D, 
/* 134 */         0.0F, 1.0F, 
/* 135 */         6);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 144 */     arrayOfFloat = new float[6]; arrayOfFloat[0] = 0.68F; arrayOfFloat[1] = 0.32F; arrayOfFloat[2] = 0.265F; arrayOfFloat[3] = 0.69F; arrayOfFloat[4] = 0.15F; arrayOfFloat[5] = 0.06F; DisplayP3 = new Rgb("Display P3", arrayOfFloat, 
/* 145 */         Illuminant.INSTANCE.getD65(), 
/* 146 */         SrgbTransferParameters, 
/* 147 */         7); }
/*     */   
/*     */   @NotNull
/*     */   public final Rgb getDisplayP3() {
/*     */     return DisplayP3;
/*     */   }
/*     */   @NotNull
/* 154 */   private static final Rgb Ntsc1953 = new Rgb(
/* 155 */       "NTSC (1953)", 
/* 156 */       Ntsc1953Primaries, 
/* 157 */       Illuminant.INSTANCE.getC(), 
/* 158 */       new TransferParameters(2.2222222222222223D, 0.9099181073703367D, 0.09008189262966333D, 0.2222222222222222D, 0.081D, 0.0D, 0.0D, 96, null), 
/* 159 */       8); @NotNull private static final Rgb SmpteC; @NotNull
/*     */   private static final Rgb AdobeRgb; @NotNull
/*     */   private static final Rgb ProPhotoRgb; @NotNull
/*     */   private static final Rgb Aces; @NotNull
/*     */   private static final Rgb Acescg; @NotNull
/*     */   public final Rgb getNtsc1953() { return Ntsc1953; }
/*     */   @NotNull
/* 166 */   public final Rgb getSmpteC() { return SmpteC; }
/*     */    static {
/* 168 */     arrayOfFloat = new float[6]; arrayOfFloat[0] = 0.63F; arrayOfFloat[1] = 0.34F; arrayOfFloat[2] = 0.31F; arrayOfFloat[3] = 0.595F; arrayOfFloat[4] = 0.155F; arrayOfFloat[5] = 0.07F; SmpteC = new Rgb("SMPTE-C RGB", arrayOfFloat, 
/* 169 */         Illuminant.INSTANCE.getD65(), 
/* 170 */         new TransferParameters(2.2222222222222223D, 0.9099181073703367D, 0.09008189262966333D, 0.2222222222222222D, 0.081D, 0.0D, 0.0D, 96, null), 
/* 171 */         9);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 180 */     arrayOfFloat = new float[6]; arrayOfFloat[0] = 0.64F; arrayOfFloat[1] = 0.33F; arrayOfFloat[2] = 0.21F; arrayOfFloat[3] = 0.71F; arrayOfFloat[4] = 0.15F; arrayOfFloat[5] = 0.06F; AdobeRgb = new Rgb("Adobe RGB (1998)", arrayOfFloat, 
/* 181 */         Illuminant.INSTANCE.getD65(), 
/* 182 */         2.2D, 
/* 183 */         0.0F, 1.0F, 
/* 184 */         10);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 193 */     arrayOfFloat = new float[6]; arrayOfFloat[0] = 0.7347F; arrayOfFloat[1] = 0.2653F; arrayOfFloat[2] = 0.1596F; arrayOfFloat[3] = 0.8404F; arrayOfFloat[4] = 0.0366F; arrayOfFloat[5] = 1.0E-4F; ProPhotoRgb = new Rgb("ROMM RGB ISO 22028-2:2013", arrayOfFloat, 
/* 194 */         Illuminant.INSTANCE.getD50(), 
/* 195 */         new TransferParameters(1.8D, 1.0D, 0.0D, 0.0625D, 0.031248D, 0.0D, 0.0D, 96, null), 
/* 196 */         11);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 205 */     arrayOfFloat = new float[6]; arrayOfFloat[0] = 0.7347F; arrayOfFloat[1] = 0.2653F; arrayOfFloat[2] = 0.0F; arrayOfFloat[3] = 1.0F; arrayOfFloat[4] = 1.0E-4F; arrayOfFloat[5] = -0.077F; Aces = new Rgb("SMPTE ST 2065-1:2012 ACES", arrayOfFloat, 
/* 206 */         Illuminant.INSTANCE.getD60(), 
/* 207 */         1.0D, 
/* 208 */         -65504.0F, 65504.0F, 
/* 209 */         12);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 218 */     arrayOfFloat = new float[6]; arrayOfFloat[0] = 0.713F; arrayOfFloat[1] = 0.293F; arrayOfFloat[2] = 0.165F; arrayOfFloat[3] = 0.83F; arrayOfFloat[4] = 0.128F; arrayOfFloat[5] = 0.044F; Acescg = new Rgb("Academy S-2014-004 ACEScg", arrayOfFloat, 
/* 219 */         Illuminant.INSTANCE.getD60(), 
/* 220 */         1.0D, 
/* 221 */         -65504.0F, 65504.0F, 
/* 222 */         13);
/*     */   } @NotNull
/*     */   public final Rgb getAdobeRgb() {
/*     */     return AdobeRgb;
/*     */   } @NotNull
/*     */   public final Rgb getProPhotoRgb() {
/*     */     return ProPhotoRgb;
/*     */   } @NotNull
/*     */   public final Rgb getAces() {
/*     */     return Aces;
/*     */   } @NotNull
/*     */   public final Rgb getAcescg() {
/*     */     return Acescg;
/*     */   }
/*     */   @NotNull
/* 237 */   private static final ColorSpace CieXyz = new Xyz(
/* 238 */       "Generic XYZ", 
/* 239 */       14);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final ColorSpace getCieXyz() {
/*     */     return CieXyz;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 254 */   private static final ColorSpace CieLab = new Lab(
/* 255 */       "Generic L*a*b*", 
/* 256 */       15);
/*     */   @NotNull
/*     */   public final ColorSpace getCieLab() {
/*     */     return CieLab;
/*     */   }
/*     */   @NotNull
/* 262 */   private static final Rgb Unspecified = new Rgb(
/* 263 */       "None", 
/* 264 */       SrgbPrimaries, 
/* 265 */       Illuminant.INSTANCE.getD65(), 
/* 266 */       NoneTransferParameters, 
/* 267 */       16);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Rgb getUnspecified$ui_graphics() {
/*     */     return Unspecified;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 282 */   private static final ColorSpace Oklab = new Oklab(
/* 283 */       "Oklab", 
/* 284 */       17);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final ColorSpace[] ColorSpacesArray;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final ColorSpace getOklab() {
/*     */     return Oklab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final ColorSpace match(@Size(9L) @NotNull float[] toXYZD50, @NotNull TransferParameters function) {
/* 305 */     Intrinsics.checkNotNullParameter(toXYZD50, "toXYZD50"); Intrinsics.checkNotNullParameter(function, "function"); ColorSpace[] arrayOfColorSpace; byte b; int i; for (arrayOfColorSpace = ColorSpacesArray, b = 0, i = arrayOfColorSpace.length; b < i; ) { ColorSpace colorSpace = arrayOfColorSpace[b];
/* 306 */       if (ColorModel.equals-impl0(colorSpace.getModel-xdoWZVw(), ColorModel.Companion.getRgb-xdoWZVw())) {
/* 307 */         Intrinsics.checkNotNull(ColorSpaceKt.adapt$default(colorSpace, Illuminant.INSTANCE.getD50(), null, 2, null), "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb"); Rgb rgb = (Rgb)ColorSpaceKt.adapt$default(colorSpace, Illuminant.INSTANCE.getD50(), null, 2, null);
/*     */         
/* 309 */         if (ColorSpaceKt.compare(toXYZD50, rgb.getTransform$ui_graphics()) && 
/* 310 */           ColorSpaceKt.compare(function, rgb.getTransferParameters()))
/*     */         {
/*     */           
/* 313 */           return colorSpace;
/*     */         }
/*     */       } 
/*     */       b++; }
/*     */     
/* 318 */     return null;
/*     */   }
/*     */   @NotNull
/*     */   public final ColorSpace getColorSpace$ui_graphics(int id) {
/* 322 */     int $i$f$getColorSpace$ui_graphics = 0; return getColorSpacesArray$ui_graphics()[id];
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ColorSpace[] getColorSpacesArray$ui_graphics() {
/* 327 */     return ColorSpacesArray; } static {
/* 328 */     ColorSpace[] arrayOfColorSpace = new ColorSpace[18]; arrayOfColorSpace[0] = Srgb; arrayOfColorSpace[1] = 
/* 329 */       LinearSrgb;
/* 330 */     arrayOfColorSpace[2] = ExtendedSrgb;
/* 331 */     arrayOfColorSpace[3] = LinearExtendedSrgb;
/* 332 */     arrayOfColorSpace[4] = Bt709;
/* 333 */     arrayOfColorSpace[5] = Bt2020;
/* 334 */     arrayOfColorSpace[6] = DciP3;
/* 335 */     arrayOfColorSpace[7] = DisplayP3;
/* 336 */     arrayOfColorSpace[8] = Ntsc1953;
/* 337 */     arrayOfColorSpace[9] = SmpteC;
/* 338 */     arrayOfColorSpace[10] = AdobeRgb;
/* 339 */     arrayOfColorSpace[11] = ProPhotoRgb;
/* 340 */     arrayOfColorSpace[12] = Aces;
/* 341 */     arrayOfColorSpace[13] = Acescg;
/* 342 */     arrayOfColorSpace[14] = CieXyz;
/* 343 */     arrayOfColorSpace[15] = CieLab;
/* 344 */     arrayOfColorSpace[16] = Unspecified;
/* 345 */     arrayOfColorSpace[17] = Oklab;
/*     */     ColorSpacesArray = arrayOfColorSpace;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\colorspace\ColorSpaces.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */