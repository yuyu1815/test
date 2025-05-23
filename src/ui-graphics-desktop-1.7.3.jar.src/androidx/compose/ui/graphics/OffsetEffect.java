/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.skia.ImageFilter;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\007\030\0002\0020\001B\027\022\b\020\002\032\004\030\0010\001\022\006\020\003\032\0020\004¢\006\002\020\005J\b\020\007\032\0020\bH\024J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\fH\002J\b\020\r\032\0020\016H\026J\b\020\017\032\0020\020H\026R\026\020\003\032\0020\004X\004ø\001\000ø\001\001¢\006\004\n\002\020\006R\020\020\002\032\004\030\0010\001X\004¢\006\002\n\000\002\013\n\005\b¡\0360\001\n\002\b!¨\006\021"}, d2 = {"Landroidx/compose/ui/graphics/OffsetEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "offset", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/graphics/RenderEffect;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "createImageFilter", "Lorg/jetbrains/skia/ImageFilter;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics"})
/*     */ @Immutable
/*     */ public final class OffsetEffect
/*     */   extends RenderEffect
/*     */ {
/*     */   @Nullable
/*     */   private final RenderEffect renderEffect;
/*     */   private final long offset;
/*     */   
/*     */   private OffsetEffect(RenderEffect renderEffect, long offset) {
/* 129 */     super((DefaultConstructorMarker)null);
/*     */     this.renderEffect = renderEffect;
/*     */     this.offset = offset; } @NotNull
/* 132 */   protected ImageFilter createImageFilter() { return ImageFilter.Companion.makeOffset(Offset.getX-impl(this.offset), Offset.getY-impl(this.offset), (this.renderEffect != null) ? this.renderEffect.asSkiaImageFilter() : null, null); }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 135 */     if (this == other) return true; 
/* 136 */     if (!(other instanceof OffsetEffect)) return false;
/*     */     
/* 138 */     if (!Intrinsics.areEqual(this.renderEffect, ((OffsetEffect)other).renderEffect)) return false; 
/* 139 */     if (!Offset.equals-impl0(this.offset, ((OffsetEffect)other).offset)) return false;
/*     */     
/* 141 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 145 */     int result = (this.renderEffect != null) ? this.renderEffect.hashCode() : 0;
/* 146 */     result = 31 * result + Offset.hashCode-impl(this.offset);
/* 147 */     return result;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 151 */     return "OffsetEffect(renderEffect=" + this.renderEffect + ", offset=" + Offset.toString-impl(this.offset) + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\OffsetEffect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */