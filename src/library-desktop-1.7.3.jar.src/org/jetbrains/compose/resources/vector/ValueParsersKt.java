/*     */ package org.jetbrains.compose.resources.vector;
/*     */ 
/*     */ import androidx.compose.ui.graphics.PathFillType;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlin.text.UStringsKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000>\n\000\n\002\020\b\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032\020\020\002\032\0020\0012\006\020\003\032\0020\004H\000\032\025\020\005\032\0020\0062\006\020\007\032\0020\004H\000¢\006\002\020\b\032\025\020\t\032\0020\n2\006\020\013\032\0020\004H\000¢\006\002\020\b\032\025\020\f\032\0020\r2\006\020\016\032\0020\004H\000¢\006\002\020\b\032\025\020\017\032\0020\0202\006\020\021\032\0020\004H\000¢\006\002\020\b\032\033\020\022\032\0020\023*\004\030\0010\0042\006\020\024\032\0020\025H\000¢\006\002\020\026\"\016\020\000\032\0020\001XT¢\006\002\n\000¨\006\027"}, d2 = {"ALPHA_MASK", "", "parseColorValue", "color", "", "parseFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fillType", "(Ljava/lang/String;)I", "parseStrokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeCap", "parseStrokeJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeJoin", "parseTileMode", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "parseDp", "Landroidx/compose/ui/unit/Dp;", "density", "Landroidx/compose/ui/unit/Density;", "(Ljava/lang/String;Landroidx/compose/ui/unit/Density;)F", "library"})
/*     */ @SourceDebugExtension({"SMAP\nValueParsers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueParsers.kt\norg/jetbrains/compose/resources/vector/ValueParsersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,105:1\n1#2:106\n169#3:107\n169#3:108\n*S KotlinDebug\n*F\n+ 1 ValueParsers.kt\norg/jetbrains/compose/resources/vector/ValueParsersKt\n*L\n99#1:107\n100#1:108\n*E\n"})
/*     */ public final class ValueParsersKt
/*     */ {
/*     */   private static final int ALPHA_MASK = -16777216;
/*     */   
/*     */   public static final int parseColorValue(@NotNull String color) {
/*     */     int v, k;
/*  38 */     Intrinsics.checkNotNullParameter(color, "color"); if (!StringsKt.startsWith$default(color, "#", false, 2, null))
/*     */     
/*     */     { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 106 */       int $i$a$-require-ValueParsersKt$parseColorValue$1 = 0; String str = "Invalid color value " + color; throw new IllegalArgumentException(str.toString()); }  switch (color.length()) { case 7: Intrinsics.checkNotNullExpressionValue(color.substring(1), "substring(...)");case 9: Intrinsics.checkNotNullExpressionValue(color.substring(1), "substring(...)");case 4: Intrinsics.checkNotNullExpressionValue(color.substring(1), "substring(...)"); v = UStringsKt.toUInt(color.substring(1), 16); k = (v >> 8 & 0xF) * 1114112; k |= (v >> 4 & 0xF) * 4352; k |= (v & 0xF) * 17;
/* 107 */       case 5: Intrinsics.checkNotNullExpressionValue(color.substring(1), "substring(...)"); v = UStringsKt.toUInt(color.substring(1), 16); k = (v >> 12 & 0xF) * 285212672; k |= (v >> 8 & 0xF) * 1114112; k |= (v >> 4 & 0xF) * 4352; k |= (v & 0xF) * 17; }  return -16777216; } public static final float parseDp(@Nullable String $this$parseDp, @NotNull Density density) { Intrinsics.checkNotNullParameter(density, "density"); Density $this$parseDp_u24lambda_u241 = density; int $i$a$-with-ValueParsersKt$parseDp$1 = 0; float $this$dp$iv = 0.0F; int $i$f$getDp = 0; $this$dp$iv = Float.parseFloat(StringsKt.removeSuffix($this$parseDp, "dp")); $i$f$getDp = 0; if (StringsKt.endsWith$default($this$parseDp, "px", false, 2, null)) {  } else { throw new UnsupportedOperationException("value should ends with dp or px"); }  return ($this$parseDp == null) ? Dp.constructor-impl($this$dp$iv) : (StringsKt.endsWith$default($this$parseDp, "dp", false, 2, null) ? 
/* 108 */       Dp.constructor-impl($this$dp$iv) : "JD-Core does not support Kotlin"); }
/*     */ 
/*     */   
/*     */   public static final int parseFillType(@NotNull String fillType) {
/*     */     Intrinsics.checkNotNullParameter(fillType, "fillType");
/*     */     String str = fillType;
/*     */     if (Intrinsics.areEqual(str, "evenOdd")) {
/*     */     
/*     */     } else {
/*     */       throw new UnsupportedOperationException("unknown fillType: " + fillType);
/*     */     } 
/*     */     return Intrinsics.areEqual(str, "nonZero") ? PathFillType.Companion.getNonZero-Rg-k1Os() : "JD-Core does not support Kotlin";
/*     */   }
/*     */   
/*     */   public static final int parseStrokeCap(@NotNull String strokeCap) {
/*     */     Intrinsics.checkNotNullParameter(strokeCap, "strokeCap");
/*     */     String str = strokeCap;
/*     */     switch (str.hashCode()) {
/*     */       case -894674659:
/*     */         if (!str.equals("square"))
/*     */           break; 
/*     */       case 108704142:
/*     */         if (!str.equals("round"))
/*     */           break; 
/*     */       case 3035667:
/*     */         if (str.equals("butt"));
/*     */         break;
/*     */     } 
/*     */     throw new UnsupportedOperationException("unknown strokeCap: " + strokeCap);
/*     */   }
/*     */   
/*     */   public static final int parseStrokeJoin(@NotNull String strokeJoin) {
/*     */     Intrinsics.checkNotNullParameter(strokeJoin, "strokeJoin");
/*     */     String str = strokeJoin;
/*     */     switch (str.hashCode()) {
/*     */       case 103906565:
/*     */         if (!str.equals("miter"))
/*     */           break; 
/*     */       case 108704142:
/*     */         if (!str.equals("round"))
/*     */           break; 
/*     */       case 93630586:
/*     */         if (!str.equals("bevel"))
/*     */           break; 
/*     */     } 
/*     */     throw new UnsupportedOperationException("unknown strokeJoin: " + strokeJoin);
/*     */   }
/*     */   
/*     */   public static final int parseTileMode(@NotNull String tileMode) {
/*     */     Intrinsics.checkNotNullParameter(tileMode, "tileMode");
/*     */     String str = tileMode;
/*     */     switch (str.hashCode()) {
/*     */       case -1073910849:
/*     */         if (!str.equals("mirror"))
/*     */           break; 
/*     */       case -436781190:
/*     */         if (!str.equals("repeated"))
/*     */           break; 
/*     */       case 94742715:
/*     */         if (str.equals("clamp"));
/*     */         break;
/*     */     } 
/*     */     throw new UnsupportedOperationException("unknown tileMode: " + tileMode);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\vector\ValueParsersKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */