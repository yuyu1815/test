/*     */ package androidx.compose.ui.text.font;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.text.ExperimentalTextApi;
/*     */ import kotlin.Metadata;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\022\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\007\030\0002\0020\001B7\b\000\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007\022\b\b\003\020\b\032\0020\t\022\b\b\002\020\n\032\0020\013¢\006\002\020\fJ.\020\030\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007ø\001\000¢\006\004\b\031\020\032JD\020\030\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\n\032\0020\0132\b\b\002\020\b\032\0020\tH\007ø\001\000¢\006\004\b\033\020\034J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010 H\002J\b\020!\032\0020\003H\026J\b\020\"\032\0020#H\026R$\020\n\032\0020\0138WX\004ø\001\000ø\001\001¢\006\020\n\002\020\021\022\004\b\r\020\016\032\004\b\017\020\020R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\022\020\020R\034\020\006\032\0020\007X\004ø\001\000ø\001\001¢\006\n\n\002\020\021\032\004\b\023\020\020R\023\020\b\032\0020\t8\007¢\006\b\n\000\032\004\b\024\020\025R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\026\020\027\002\013\n\005\b¡\0360\001\n\002\b!¨\006$"}, d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroidx/compose/ui/text/font/Font;", "resId", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "(ILandroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "getLoadingStrategy-PKNRLFQ", "()I", "I", "getResId", "getStyle-_-LCdwA", "getVariationSettings", "()Landroidx/compose/ui/text/font/FontVariation$Settings;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "copy", "copy-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/ResourceFont;", "copy-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/ResourceFont;", "equals", "", "other", "", "hashCode", "toString", "", "ui-text"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class ResourceFont
/*     */   implements Font
/*     */ {
/*     */   private final int resId;
/*     */   @NotNull
/*     */   private final FontWeight weight;
/*     */   private final int style;
/*     */   @NotNull
/*     */   private final FontVariation.Settings variationSettings;
/*     */   private final int loadingStrategy;
/*     */   public static final int $stable;
/*     */   
/*     */   public final int getResId() {
/*     */     return this.resId;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public FontWeight getWeight() {
/*     */     return this.weight;
/*     */   }
/*     */   
/*     */   private ResourceFont(int resId, FontWeight weight, int style, FontVariation.Settings variationSettings, int loadingStrategy) {
/* 169 */     this.resId = resId;
/* 170 */     this.weight = weight;
/* 171 */     this.style = style;
/* 172 */     this.variationSettings = variationSettings;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 182 */     this.loadingStrategy = loadingStrategy; } @ExperimentalTextApi public int getLoadingStrategy-PKNRLFQ() { return this.loadingStrategy; }
/*     */    public int getStyle-_-LCdwA() {
/*     */     return this.style;
/*     */   }
/*     */   @NotNull
/*     */   public final ResourceFont copy-RetOiIg(int resId, @NotNull FontWeight weight, int style) {
/* 188 */     Intrinsics.checkNotNullParameter(weight, "weight"); return copy-F3nL8kk$default(this, resId, weight, style, getLoadingStrategy-PKNRLFQ(), null, 16, null);
/*     */   }
/*     */   @ExperimentalTextApi
/*     */   @NotNull
/*     */   public final FontVariation.Settings getVariationSettings() {
/*     */     return this.variationSettings;
/*     */   }
/*     */   @ExperimentalTextApi
/*     */   @NotNull
/*     */   public final ResourceFont copy-F3nL8kk(int resId, @NotNull FontWeight weight, int style, int loadingStrategy, @NotNull FontVariation.Settings variationSettings) {
/* 198 */     Intrinsics.checkNotNullParameter(weight, "weight"); Intrinsics.checkNotNullParameter(variationSettings, "variationSettings"); return new ResourceFont(
/* 199 */         resId, 
/* 200 */         weight, 
/* 201 */         style, 
/* 202 */         variationSettings, 
/* 203 */         loadingStrategy, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 208 */     if (this == other) return true; 
/* 209 */     if (!(other instanceof ResourceFont)) return false; 
/* 210 */     if (this.resId != ((ResourceFont)other).resId) return false; 
/* 211 */     if (!Intrinsics.areEqual(getWeight(), ((ResourceFont)other).getWeight())) return false; 
/* 212 */     if (!FontStyle.equals-impl0(getStyle-_-LCdwA(), ((ResourceFont)other).getStyle-_-LCdwA())) return false; 
/* 213 */     if (!Intrinsics.areEqual(this.variationSettings, ((ResourceFont)other).variationSettings)) return false; 
/* 214 */     if (!FontLoadingStrategy.equals-impl0(getLoadingStrategy-PKNRLFQ(), ((ResourceFont)other).getLoadingStrategy-PKNRLFQ())) return false; 
/* 215 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 219 */     int result = this.resId;
/* 220 */     result = 31 * result + getWeight().hashCode();
/* 221 */     result = 31 * result + FontStyle.hashCode-impl(getStyle-_-LCdwA());
/* 222 */     result = 31 * result + FontLoadingStrategy.hashCode-impl(getLoadingStrategy-PKNRLFQ());
/* 223 */     result = 31 * result + this.variationSettings.hashCode();
/* 224 */     return result;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 228 */     return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + FontStyle.toString-impl(getStyle-_-LCdwA()) + ", loadingStrategy=" + FontLoadingStrategy.toString-impl(
/* 229 */         getLoadingStrategy-PKNRLFQ()) + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\ResourceFont.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */