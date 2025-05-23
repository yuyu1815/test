/*     */ package androidx.compose.ui.text.font;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\027\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B1\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\b\020\n\032\004\030\0010\001¢\006\002\020\013J\013\020\026\032\004\030\0010\003HÆ\003J\t\020\027\032\0020\005HÆ\003J\026\020\030\032\0020\007HÆ\003ø\001\001ø\001\000¢\006\004\b\031\020\017J\026\020\032\032\0020\tHÆ\003ø\001\001ø\001\000¢\006\004\b\033\020\017J\013\020\034\032\004\030\0010\001HÆ\003JI\020\035\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\n\b\002\020\n\032\004\030\0010\001HÆ\001ø\001\000¢\006\004\b\036\020\037J\023\020 \032\0020!2\b\020\"\032\004\030\0010\001HÖ\003J\t\020#\032\0020$HÖ\001J\t\020%\032\0020&HÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\f\020\rR\031\020\006\032\0020\007ø\001\000ø\001\001¢\006\n\n\002\020\020\032\004\b\016\020\017R\031\020\b\032\0020\tø\001\000ø\001\001¢\006\n\n\002\020\020\032\004\b\021\020\017R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R\023\020\n\032\004\030\0010\001¢\006\b\n\000\032\004\b\024\020\025\002\013\n\005\b¡\0360\001\n\002\b!¨\006'"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequest;", "", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "resourceLoaderCacheKey", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;IILjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontStyle-_-LCdwA", "()I", "I", "getFontSynthesis-GVVA2EU", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getResourceLoaderCacheKey", "()Ljava/lang/Object;", "component1", "component2", "component3", "component3-_-LCdwA", "component4", "component4-GVVA2EU", "component5", "copy", "copy-e1PVR60", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;IILjava/lang/Object;)Landroidx/compose/ui/text/font/TypefaceRequest;", "equals", "", "other", "hashCode", "", "toString", "", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class TypefaceRequest
/*     */ {
/*     */   @Nullable
/*     */   private final FontFamily fontFamily;
/*     */   @NotNull
/*     */   private final FontWeight fontWeight;
/*     */   private final int fontStyle;
/*     */   private final int fontSynthesis;
/*     */   @Nullable
/*     */   private final Object resourceLoaderCacheKey;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   private TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int fontStyle, int fontSynthesis, Object resourceLoaderCacheKey) {
/* 142 */     this.fontFamily = fontFamily;
/* 143 */     this.fontWeight = fontWeight;
/* 144 */     this.fontStyle = fontStyle;
/* 145 */     this.fontSynthesis = fontSynthesis;
/* 146 */     this.resourceLoaderCacheKey = resourceLoaderCacheKey; } @Nullable public final Object getResourceLoaderCacheKey() { return this.resourceLoaderCacheKey; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final FontFamily getFontFamily() {
/*     */     return this.fontFamily;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final FontWeight getFontWeight() {
/*     */     return this.fontWeight;
/*     */   }
/*     */   
/*     */   public final int getFontStyle-_-LCdwA() {
/*     */     return this.fontStyle;
/*     */   }
/*     */   
/*     */   public final int getFontSynthesis-GVVA2EU() {
/*     */     return this.fontSynthesis;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final FontFamily component1() {
/*     */     return this.fontFamily;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final FontWeight component2() {
/*     */     return this.fontWeight;
/*     */   }
/*     */   
/*     */   public final int component3-_-LCdwA() {
/*     */     return this.fontStyle;
/*     */   }
/*     */   
/*     */   public final int component4-GVVA2EU() {
/*     */     return this.fontSynthesis;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object component5() {
/*     */     return this.resourceLoaderCacheKey;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TypefaceRequest copy-e1PVR60(@Nullable FontFamily fontFamily, @NotNull FontWeight fontWeight, int fontStyle, int fontSynthesis, @Nullable Object resourceLoaderCacheKey) {
/*     */     Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
/*     */     return new TypefaceRequest(fontFamily, fontWeight, fontStyle, fontSynthesis, resourceLoaderCacheKey, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "TypefaceRequest(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + FontStyle.toString-impl(this.fontStyle) + ", fontSynthesis=" + FontSynthesis.toString-impl(this.fontSynthesis) + ", resourceLoaderCacheKey=" + this.resourceLoaderCacheKey + ')';
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = (this.fontFamily == null) ? 0 : this.fontFamily.hashCode();
/*     */     result = result * 31 + this.fontWeight.hashCode();
/*     */     result = result * 31 + FontStyle.hashCode-impl(this.fontStyle);
/*     */     result = result * 31 + FontSynthesis.hashCode-impl(this.fontSynthesis);
/*     */     return result * 31 + ((this.resourceLoaderCacheKey == null) ? 0 : this.resourceLoaderCacheKey.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof TypefaceRequest))
/*     */       return false; 
/*     */     TypefaceRequest typefaceRequest = (TypefaceRequest)other;
/*     */     return !Intrinsics.areEqual(this.fontFamily, typefaceRequest.fontFamily) ? false : (!Intrinsics.areEqual(this.fontWeight, typefaceRequest.fontWeight) ? false : (!FontStyle.equals-impl0(this.fontStyle, typefaceRequest.fontStyle) ? false : (!FontSynthesis.equals-impl0(this.fontSynthesis, typefaceRequest.fontSynthesis) ? false : (!!Intrinsics.areEqual(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey)))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\TypefaceRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */