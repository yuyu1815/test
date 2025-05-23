/*    */ package androidx.compose.ui.text.style;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.runtime.Stable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\002\b\007\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\007\030\000 \0212\0020\001:\001\021B\031\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003¢\006\002\020\005J\032\020\t\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\001H\002J\b\020\r\032\0020\016H\026J\b\020\017\032\0020\020H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\b\020\007¨\006\022"}, d2 = {"Landroidx/compose/ui/text/style/TextGeometricTransform;", "", "scaleX", "", "skewX", "(FF)V", "getScaleX", "()F", "getSkewX", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ui-text"})
/*    */ @Immutable
/*    */ public final class TextGeometricTransform
/*    */ {
/*    */   public final float getScaleX() {
/*    */     return this.scaleX;
/*    */   }
/*    */   
/*    */   public TextGeometricTransform(float scaleX, float skewX) {
/* 34 */     this.scaleX = scaleX;
/* 35 */     this.skewX = skewX; } public final float getSkewX() { return this.skewX; }
/*    */    @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\000X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007¨\006\b"}, d2 = {"Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "", "()V", "None", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "getNone$ui_text$annotations", "getNone$ui_text", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "ui-text"})
/*    */   public static final class Companion {
/*    */     @NotNull
/* 39 */     public final TextGeometricTransform getNone$ui_text() { return TextGeometricTransform.None; } private Companion() {} } @NotNull public static final Companion Companion = new Companion(null); private final float scaleX; private final float skewX; public static final int $stable; @NotNull private static final TextGeometricTransform None = new TextGeometricTransform(1.0F, 0.0F);
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TextGeometricTransform copy(float scaleX, float skewX) {
/* 46 */     return new TextGeometricTransform(scaleX, skewX);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/* 50 */     if (this == other) return true; 
/* 51 */     if (!(other instanceof TextGeometricTransform)) return false; 
/* 52 */     if (!((this.scaleX == ((TextGeometricTransform)other).scaleX) ? 1 : 0)) return false; 
/* 53 */     if (!((this.skewX == ((TextGeometricTransform)other).skewX) ? 1 : 0)) return false; 
/* 54 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 58 */     int result = Float.hashCode(this.scaleX);
/* 59 */     result = 31 * result + Float.hashCode(this.skewX);
/* 60 */     return result;
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/* 64 */     return "TextGeometricTransform(scaleX=" + this.scaleX + ", skewX=" + this.skewX + ')';
/*    */   }
/*    */   
/*    */   public TextGeometricTransform() {
/*    */     this(0.0F, 0.0F, 3, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\style\TextGeometricTransform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */