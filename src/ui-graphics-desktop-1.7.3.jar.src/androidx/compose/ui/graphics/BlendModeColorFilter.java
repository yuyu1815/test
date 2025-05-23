/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.skia.ColorFilter;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\007\030\0002\0020\001B\027\b\026\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006B#\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\n\020\007\032\0060\bj\002`\t¢\006\002\020\nJ\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\024H\002J\b\020\025\032\0020\026H\026J\b\020\027\032\0020\030H\026R\031\020\004\032\0020\005ø\001\000ø\001\001¢\006\n\n\002\020\r\032\004\b\013\020\fR\031\020\002\032\0020\003ø\001\000ø\001\001¢\006\n\n\002\020\020\032\004\b\016\020\017\002\013\n\005\b¡\0360\001\n\002\b!¨\006\031"}, d2 = {"Landroidx/compose/ui/graphics/BlendModeColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "color", "Landroidx/compose/ui/graphics/Color;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "(JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "nativeColorFilter", "Lorg/jetbrains/skia/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "(JILorg/jetbrains/skia/ColorFilter;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBlendMode-0nO6VwU", "()I", "I", "getColor-0d7_KjU", "()J", "J", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics"})
/*     */ @Immutable
/*     */ public final class BlendModeColorFilter
/*     */   extends ColorFilter
/*     */ {
/*     */   private final long color;
/*     */   private final int blendMode;
/*     */   
/*     */   public final long getColor-0d7_KjU() {
/*  86 */     return this.color; } public final int getBlendMode-0nO6VwU() {
/*  87 */     return this.blendMode;
/*     */   } private BlendModeColorFilter(long color, int blendMode, ColorFilter nativeColorFilter) {
/*  89 */     super(nativeColorFilter);
/*     */     this.color = color;
/*     */     this.blendMode = blendMode;
/*     */   }
/*     */   private BlendModeColorFilter(long color, int blendMode) {
/*  94 */     this(color, blendMode, SkiaColorFilter_skikoKt.actualTintColorFilter-xETnrds(color, blendMode), null);
/*     */   }
/*     */   public boolean equals(@Nullable Object other) {
/*  97 */     if (this == other) return true; 
/*  98 */     if (!(other instanceof BlendModeColorFilter)) return false;
/*     */     
/* 100 */     if (!Color.equals-impl0(this.color, ((BlendModeColorFilter)other).color)) return false; 
/* 101 */     if (!BlendMode.equals-impl0(this.blendMode, ((BlendModeColorFilter)other).blendMode)) return false;
/*     */     
/* 103 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 107 */     int result = Color.hashCode-impl(this.color);
/* 108 */     result = 31 * result + BlendMode.hashCode-impl(this.blendMode);
/* 109 */     return result;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 113 */     return "BlendModeColorFilter(color=" + Color.toString-impl(this.color) + ", blendMode=" + BlendMode.toString-impl(this.blendMode) + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\BlendModeColorFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */