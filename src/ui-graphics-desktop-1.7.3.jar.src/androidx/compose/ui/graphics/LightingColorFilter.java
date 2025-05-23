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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\007\030\0002\0020\001B\027\b\026\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005B#\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\n\020\006\032\0060\007j\002`\b¢\006\002\020\tJ\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021H\002J\b\020\022\032\0020\023H\026J\b\020\024\032\0020\025H\026R\031\020\004\032\0020\003ø\001\000ø\001\001¢\006\n\n\002\020\f\032\004\b\n\020\013R\031\020\002\032\0020\003ø\001\000ø\001\001¢\006\n\n\002\020\f\032\004\b\r\020\013\002\013\n\005\b¡\0360\001\n\002\b!¨\006\026"}, d2 = {"Landroidx/compose/ui/graphics/LightingColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "multiply", "Landroidx/compose/ui/graphics/Color;", "add", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "nativeColorFilter", "Lorg/jetbrains/skia/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "(JJLorg/jetbrains/skia/ColorFilter;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdd-0d7_KjU", "()J", "J", "getMultiply-0d7_KjU", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics"})
/*     */ @Immutable
/*     */ public final class LightingColorFilter
/*     */   extends ColorFilter
/*     */ {
/*     */   private final long multiply;
/*     */   private final long add;
/*     */   
/*     */   public final long getMultiply-0d7_KjU() {
/* 184 */     return this.multiply; } public final long getAdd-0d7_KjU() {
/* 185 */     return this.add;
/*     */   } private LightingColorFilter(long multiply, long add, ColorFilter nativeColorFilter) {
/* 187 */     super(nativeColorFilter);
/*     */     this.multiply = multiply;
/*     */     this.add = add;
/*     */   }
/*     */   private LightingColorFilter(long multiply, long add) {
/* 192 */     this(multiply, add, SkiaColorFilter_skikoKt.actualLightingColorFilter--OWjLjI(multiply, add), null);
/*     */   }
/*     */   public boolean equals(@Nullable Object other) {
/* 195 */     if (this == other) return true; 
/* 196 */     if (!(other instanceof LightingColorFilter)) return false;
/*     */     
/* 198 */     if (!Color.equals-impl0(this.multiply, ((LightingColorFilter)other).multiply)) return false; 
/* 199 */     if (!Color.equals-impl0(this.add, ((LightingColorFilter)other).add)) return false;
/*     */     
/* 201 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 205 */     int result = Color.hashCode-impl(this.multiply);
/* 206 */     result = 31 * result + Color.hashCode-impl(this.add);
/* 207 */     return result;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 211 */     return "LightingColorFilter(multiply=" + Color.toString-impl(this.multiply) + ", add=" + Color.toString-impl(this.add) + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\LightingColorFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */