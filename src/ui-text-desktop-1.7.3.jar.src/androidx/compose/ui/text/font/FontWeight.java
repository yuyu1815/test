/*     */ package androidx.compose.ui.text.font;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\017\n\000\n\002\020\b\n\002\b\006\n\002\020\013\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\002\b\007\030\000 \0172\b\022\004\022\0020\0000\001:\001\017B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\021\020\007\032\0020\0032\006\020\b\032\0020\000H\002J\023\020\t\032\0020\n2\b\020\b\032\004\030\0010\013H\002J\b\020\f\032\0020\003H\026J\b\020\r\032\0020\016H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\020"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight;", "", "weight", "", "(I)V", "getWeight", "()I", "compareTo", "other", "equals", "", "", "hashCode", "toString", "", "Companion", "ui-text"})
/*     */ @Immutable
/*     */ public final class FontWeight
/*     */   implements Comparable<FontWeight>
/*     */ {
/*     */   public FontWeight(int weight) {
/*  31 */     this.weight = weight;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 107 */     int i = this.weight; if (!((1 <= i) ? ((i < 1001) ? 1 : 0) : 0)) { int $i$a$-require-FontWeight$1 = 0; String str = 
/* 108 */         "Font weight can be in range [1, 1000]. Current value: " + this.weight; throw new IllegalArgumentException(str.toString()); } 
/*     */   }
/*     */   public final int getWeight() { return this.weight; }
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b7\n\002\020 \n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\034\020\b\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\007R\034\020\013\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\f\020\002\032\004\b\r\020\007R\034\020\016\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\017\020\002\032\004\b\020\020\007R\034\020\021\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\022\020\002\032\004\b\023\020\007R\034\020\024\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\025\020\002\032\004\b\026\020\007R\034\020\027\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\030\020\002\032\004\b\031\020\007R\034\020\032\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\033\020\002\032\004\b\034\020\007R\034\020\035\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\036\020\002\032\004\b\037\020\007R\034\020 \032\0020\0048\006X\004¢\006\016\n\000\022\004\b!\020\002\032\004\b\"\020\007R\034\020#\032\0020\0048\006X\004¢\006\016\n\000\022\004\b$\020\002\032\004\b%\020\007R\034\020&\032\0020\0048\006X\004¢\006\016\n\000\022\004\b'\020\002\032\004\b(\020\007R\034\020)\032\0020\0048\006X\004¢\006\016\n\000\022\004\b*\020\002\032\004\b+\020\007R\034\020,\032\0020\0048\006X\004¢\006\016\n\000\022\004\b-\020\002\032\004\b.\020\007R\034\020/\032\0020\0048\006X\004¢\006\016\n\000\022\004\b0\020\002\032\004\b1\020\007R\034\0202\032\0020\0048\006X\004¢\006\016\n\000\022\004\b3\020\002\032\004\b4\020\007R\034\0205\032\0020\0048\006X\004¢\006\016\n\000\022\004\b6\020\002\032\004\b7\020\007R\034\0208\032\0020\0048\006X\004¢\006\016\n\000\022\004\b9\020\002\032\004\b:\020\007R\032\020;\032\b\022\004\022\0020\0040<X\004¢\006\b\n\000\032\004\b=\020>¨\006?"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight$Companion;", "", "()V", "Black", "Landroidx/compose/ui/text/font/FontWeight;", "getBlack$annotations", "getBlack", "()Landroidx/compose/ui/text/font/FontWeight;", "Bold", "getBold$annotations", "getBold", "ExtraBold", "getExtraBold$annotations", "getExtraBold", "ExtraLight", "getExtraLight$annotations", "getExtraLight", "Light", "getLight$annotations", "getLight", "Medium", "getMedium$annotations", "getMedium", "Normal", "getNormal$annotations", "getNormal", "SemiBold", "getSemiBold$annotations", "getSemiBold", "Thin", "getThin$annotations", "getThin", "W100", "getW100$annotations", "getW100", "W200", "getW200$annotations", "getW200", "W300", "getW300$annotations", "getW300", "W400", "getW400$annotations", "getW400", "W500", "getW500$annotations", "getW500", "W600", "getW600$annotations", "getW600", "W700", "getW700$annotations", "getW700", "W800", "getW800$annotations", "getW800", "W900", "getW900$annotations", "getW900", "values", "", "getValues$ui_text", "()Ljava/util/List;", "ui-text"}) public static final class Companion {
/*     */     private Companion() {}
/* 113 */     @NotNull public final FontWeight getW100() { return FontWeight.W100; } @NotNull public final FontWeight getW200() { return FontWeight.W200; } @NotNull public final FontWeight getW300() { return FontWeight.W300; } @NotNull public final FontWeight getW400() { return FontWeight.W400; } @NotNull public final FontWeight getW500() { return FontWeight.W500; } @NotNull public final FontWeight getW600() { return FontWeight.W600; } @NotNull public final FontWeight getW700() { return FontWeight.W700; } @NotNull public final FontWeight getW800() { return FontWeight.W800; } @NotNull public final FontWeight getW900() { return FontWeight.W900; } @NotNull public final FontWeight getThin() { return FontWeight.Thin; } @NotNull public final FontWeight getExtraLight() { return FontWeight.ExtraLight; } @NotNull public final FontWeight getLight() { return FontWeight.Light; } @NotNull public final FontWeight getNormal() { return FontWeight.Normal; } @NotNull public final FontWeight getMedium() { return FontWeight.Medium; } @NotNull public final FontWeight getSemiBold() { return FontWeight.SemiBold; } @NotNull public final FontWeight getBold() { return FontWeight.Bold; } @NotNull public final FontWeight getExtraBold() { return FontWeight.ExtraBold; } @NotNull public final FontWeight getBlack() { return FontWeight.Black; } @NotNull public final List<FontWeight> getValues$ui_text() { return FontWeight.values; } } @NotNull public static final Companion Companion = new Companion(null); private final int weight; public static final int $stable; @NotNull private static final FontWeight W100 = new FontWeight(100); @NotNull private static final FontWeight W200 = new FontWeight(200); @NotNull private static final FontWeight W300 = new FontWeight(300); @NotNull private static final FontWeight W400 = new FontWeight(400); @NotNull private static final FontWeight W500 = new FontWeight(500); @NotNull private static final FontWeight W600 = new FontWeight(600); @NotNull private static final FontWeight W700 = new FontWeight(700); public int compareTo(@NotNull FontWeight other) { Intrinsics.checkNotNullParameter(other, "other"); return Intrinsics.compare(this.weight, other.weight); }
/*     */   @NotNull private static final FontWeight W800 = new FontWeight(800); @NotNull private static final FontWeight W900 = new FontWeight(900); @NotNull private static final FontWeight Thin = W100; @NotNull private static final FontWeight ExtraLight = W200; @NotNull private static final FontWeight Light = W300; @NotNull private static final FontWeight Normal = W400; @NotNull private static final FontWeight Medium = W500; @NotNull private static final FontWeight SemiBold = W600; @NotNull private static final FontWeight Bold = W700; @NotNull private static final FontWeight ExtraBold = W800; @NotNull private static final FontWeight Black = W900; @NotNull private static final List<FontWeight> values; static { FontWeight[] arrayOfFontWeight = new FontWeight[9]; arrayOfFontWeight[0] = W100; arrayOfFontWeight[1] = W200; arrayOfFontWeight[2] = W300; arrayOfFontWeight[3] = W400; arrayOfFontWeight[4] = W500; arrayOfFontWeight[5] = W600; arrayOfFontWeight[6] = W700;
/*     */     arrayOfFontWeight[7] = W800;
/*     */     arrayOfFontWeight[8] = W900;
/* 117 */     values = CollectionsKt.listOf((Object[])arrayOfFontWeight); } public boolean equals(@Nullable Object other) { if (this == other) return true; 
/* 118 */     if (!(other instanceof FontWeight)) return false; 
/* 119 */     if (this.weight != ((FontWeight)other).weight) return false; 
/* 120 */     return true; }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 124 */     return this.weight;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 128 */     return "FontWeight(weight=" + this.weight + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\FontWeight.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */