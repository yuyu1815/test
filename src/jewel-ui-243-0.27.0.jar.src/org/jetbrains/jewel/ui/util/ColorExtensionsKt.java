/*    */ package org.jetbrains.jewel.ui.util;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import java.awt.Color;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\020\016\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\032\n\020\000\032\0020\001*\0020\002\032\021\020\000\032\0020\001*\0020\003¢\006\004\b\004\020\005\032\024\020\006\032\004\030\0010\003*\0020\0072\006\020\b\032\0020\001\032\021\020\t\032\0020\n*\0020\003¢\006\004\b\013\020\f¨\006\r"}, d2 = {"toRgbaHexString", "", "Ljava/awt/Color;", "Landroidx/compose/ui/graphics/Color;", "toRgbaHexString-8_81llA", "(J)Ljava/lang/String;", "fromRGBAHexStringOrNull", "Landroidx/compose/ui/graphics/Color$Companion;", "rgba", "isDark", "", "isDark-8_81llA", "(J)Z", "ui"})
/*    */ @SourceDebugExtension({"SMAP\nColorExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorExtensions.kt\norg/jetbrains/jewel/ui/util/ColorExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
/*    */ public final class ColorExtensionsKt {
/*    */   @NotNull
/*    */   public static final String toRgbaHexString(@NotNull Color $this$toRgbaHexString) {
/* 12 */     Intrinsics.checkNotNullParameter($this$toRgbaHexString, "<this>"); String r = Integer.toHexString($this$toRgbaHexString.getRed());
/* 13 */     String g = Integer.toHexString($this$toRgbaHexString.getGreen());
/* 14 */     String b = Integer.toHexString($this$toRgbaHexString.getBlue());
/*    */     
/* 16 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$toRgbaHexString_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-ColorExtensionsKt$toRgbaHexString$1 = 0;
/* 17 */     $this$toRgbaHexString_u24lambda_u240.append('#');
/* 18 */     Intrinsics.checkNotNull(r); $this$toRgbaHexString_u24lambda_u240.append(StringsKt.padStart(r, 2, '0'));
/* 19 */     Intrinsics.checkNotNull(g); $this$toRgbaHexString_u24lambda_u240.append(StringsKt.padStart(g, 2, '0'));
/* 20 */     Intrinsics.checkNotNull(b); $this$toRgbaHexString_u24lambda_u240.append(StringsKt.padStart(b, 2, '0'));
/*    */     
/* 22 */     if ($this$toRgbaHexString.getAlpha() < 255) {
/* 23 */       String a = Integer.toHexString($this$toRgbaHexString.getAlpha());
/* 24 */       Intrinsics.checkNotNull(a); $this$toRgbaHexString_u24lambda_u240.append(StringsKt.padStart(a, 2, '0'));
/*    */     } 
/*    */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*    */     return stringBuilder1.toString();
/*    */   }
/*    */   @NotNull
/*    */   public static final String toRgbaHexString-8_81llA(long $this$toRgbaHexString_u2d8_81llA) {
/* 31 */     String r = Integer.toHexString(MathKt.roundToInt(Color.getRed-impl($this$toRgbaHexString_u2d8_81llA) * 'ÿ'));
/* 32 */     String g = Integer.toHexString(MathKt.roundToInt(Color.getGreen-impl($this$toRgbaHexString_u2d8_81llA) * 'ÿ'));
/* 33 */     String b = Integer.toHexString(MathKt.roundToInt(Color.getBlue-impl($this$toRgbaHexString_u2d8_81llA) * 'ÿ'));
/*    */     
/* 35 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$toRgbaHexString_8_81llA_u24lambda_u241 = stringBuilder1; int $i$a$-buildString-ColorExtensionsKt$toRgbaHexString$2 = 0;
/* 36 */     $this$toRgbaHexString_8_81llA_u24lambda_u241.append('#');
/* 37 */     Intrinsics.checkNotNull(r); $this$toRgbaHexString_8_81llA_u24lambda_u241.append(StringsKt.padStart(r, 2, '0'));
/* 38 */     Intrinsics.checkNotNull(g); $this$toRgbaHexString_8_81llA_u24lambda_u241.append(StringsKt.padStart(g, 2, '0'));
/* 39 */     Intrinsics.checkNotNull(b); $this$toRgbaHexString_8_81llA_u24lambda_u241.append(StringsKt.padStart(b, 2, '0'));
/*    */     
/* 41 */     if (!((Color.getAlpha-impl($this$toRgbaHexString_u2d8_81llA) == 1.0F) ? 1 : 0)) {
/* 42 */       String a = Integer.toHexString(MathKt.roundToInt(Color.getAlpha-impl($this$toRgbaHexString_u2d8_81llA) * 'ÿ'));
/* 43 */       Intrinsics.checkNotNull(a); $this$toRgbaHexString_8_81llA_u24lambda_u241.append(StringsKt.padStart(a, 2, '0'));
/*    */     } 
/*    */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*    */     return stringBuilder1.toString();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public static final Color fromRGBAHexStringOrNull(@NotNull Color.Companion $this$fromRGBAHexStringOrNull, @NotNull String rgba) {
/* 62 */     Intrinsics.checkNotNullParameter($this$fromRGBAHexStringOrNull, "<this>"); Intrinsics.checkNotNullParameter(rgba, "rgba"); Intrinsics.checkNotNullExpressionValue(rgba.toLowerCase(Locale.ROOT), "toLowerCase(...)"); String it = StringsKt.removePrefix(rgba.toLowerCase(Locale.ROOT), "#"); int $i$a$-let-ColorExtensionsKt$fromRGBAHexStringOrNull$1 = 0; switch (it.length()) { case 3: case 4: case 6: case 8: default: break; }  String str1 = null; if (str1 != null) { Long long_ = StringsKt.toLongOrNull(str1, 16);
/* 63 */       if (long_ != null) { long l = long_.longValue();
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 68 */         int $i$a$-let-ColorExtensionsKt$fromRGBAHexStringOrNull$2 = 0; }
/*    */        }
/*    */     
/*    */     return null;
/*    */   }
/*    */   
/*    */   public static final boolean isDark-8_81llA(long $this$isDark_u2d8_81llA) {
/*    */     return ((ColorKt.luminance-8_81llA($this$isDark_u2d8_81llA) + 0.05D) / 0.05D < 4.5D);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\u\\util\ColorExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */