/*     */ package androidx.compose.ui.text.style;
/*     */ 
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.ShaderBrush;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\007\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\023\032\0020\003HÆ\003J\t\020\024\032\0020\005HÆ\003J\035\020\025\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\031HÖ\003J\t\020\032\032\0020\033HÖ\001J\t\020\034\032\0020\035HÖ\001R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\n8VX\004¢\006\006\032\004\b\013\020\fR\032\020\r\032\0020\0168VX\004ø\001\000ø\001\001¢\006\006\032\004\b\017\020\020R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\021\020\022\002\013\n\005\b¡\0360\001\n\002\b!¨\006\036"}, d2 = {"Landroidx/compose/ui/text/style/BrushStyle;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "value", "Landroidx/compose/ui/graphics/ShaderBrush;", "alpha", "", "(Landroidx/compose/ui/graphics/ShaderBrush;F)V", "getAlpha", "()F", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "color", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "getValue", "()Landroidx/compose/ui/graphics/ShaderBrush;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-text"})
/*     */ final class BrushStyle
/*     */   implements TextForegroundStyle
/*     */ {
/*     */   @NotNull
/*     */   private final ShaderBrush value;
/*     */   private final float alpha;
/*     */   
/*     */   public BrushStyle(@NotNull ShaderBrush value, float alpha) {
/* 111 */     this.value = value;
/* 112 */     this.alpha = alpha; } public float getAlpha() { return this.alpha; }
/*     */   @NotNull
/*     */   public final ShaderBrush getValue() { return this.value; } public long getColor-0d7_KjU() {
/* 115 */     return Color.Companion.getUnspecified-0d7_KjU();
/*     */   } @NotNull
/*     */   public Brush getBrush() {
/* 118 */     return (Brush)this.value;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ShaderBrush component1() {
/*     */     return this.value;
/*     */   }
/*     */   
/*     */   public final float component2() {
/*     */     return this.alpha;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final BrushStyle copy(@NotNull ShaderBrush value, float alpha) {
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     return new BrushStyle(value, alpha);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "BrushStyle(value=" + this.value + ", alpha=" + this.alpha + ')';
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.value.hashCode();
/*     */     return result * 31 + Float.hashCode(this.alpha);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof BrushStyle))
/*     */       return false; 
/*     */     BrushStyle brushStyle = (BrushStyle)other;
/*     */     return !Intrinsics.areEqual(this.value, brushStyle.value) ? false : (!(Float.compare(this.alpha, brushStyle.alpha) != 0));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\style\BrushStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */