/*     */ package androidx.compose.ui.text.style;
/*     */ 
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\003\n\002\030\002\n\002\b\r\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\026\020\022\032\0020\003HÆ\003ø\001\001ø\001\000¢\006\004\b\023\020\017J\035\020\024\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001ø\001\000¢\006\004\b\025\020\026J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\032HÖ\003J\t\020\033\032\0020\034HÖ\001J\t\020\035\032\0020\036HÖ\001R\024\020\005\032\0020\0068VX\004¢\006\006\032\004\b\007\020\bR\026\020\t\032\004\030\0010\n8VX\004¢\006\006\032\004\b\013\020\fR\032\020\r\032\0020\0038VX\004ø\001\000ø\001\001¢\006\006\032\004\b\016\020\017R\031\020\002\032\0020\003ø\001\000ø\001\001¢\006\n\n\002\020\021\032\004\b\020\020\017\002\013\n\005\b¡\0360\001\n\002\b!¨\006\037"}, d2 = {"Landroidx/compose/ui/text/style/ColorStyle;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "value", "Landroidx/compose/ui/graphics/Color;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "alpha", "", "getAlpha", "()F", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "color", "getColor-0d7_KjU", "()J", "getValue-0d7_KjU", "J", "component1", "component1-0d7_KjU", "copy", "copy-8_81llA", "(J)Landroidx/compose/ui/text/style/ColorStyle;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-text"})
/*     */ @SourceDebugExtension({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,150:1\n696#2:151\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n*L\n95#1:151\n*E\n"})
/*     */ final class ColorStyle
/*     */   implements TextForegroundStyle
/*     */ {
/*     */   private final long value;
/*     */   
/*     */   private ColorStyle(long value) {
/*  92 */     this.value = value;
/*     */ 
/*     */     
/*  95 */     long $this$isSpecified$iv = this.value; int $i$f$isSpecified-8_81llA = 0; if (!(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 151 */       ($this$isSpecified$iv != 16L) ? 1 : 0)) {
/*     */       int $i$a$-require-ColorStyle$1 = 0;
/*     */       String str = "ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.";
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */   }
/*     */   
/*     */   public final long getValue-0d7_KjU() {
/*     */     return this.value;
/*     */   }
/*     */   
/*     */   public long getColor-0d7_KjU() {
/*     */     return this.value;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Brush getBrush() {
/*     */     return null;
/*     */   }
/*     */   
/*     */   public float getAlpha() {
/*     */     return Color.getAlpha-impl(getColor-0d7_KjU());
/*     */   }
/*     */   
/*     */   public final long component1-0d7_KjU() {
/*     */     return this.value;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ColorStyle copy-8_81llA(long value) {
/*     */     return new ColorStyle(value, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ColorStyle(value=" + Color.toString-impl(this.value) + ')';
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return Color.hashCode-impl(this.value);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ColorStyle))
/*     */       return false; 
/*     */     ColorStyle colorStyle = (ColorStyle)other;
/*     */     return !!Color.equals-impl0(this.value, colorStyle.value);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\style\ColorStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */