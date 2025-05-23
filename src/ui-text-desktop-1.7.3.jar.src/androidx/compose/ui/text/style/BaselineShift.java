/*    */ package androidx.compose.ui.text.style;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.runtime.Stable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmInline;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @JvmInline
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\002\b\005\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\003\n\002\020\016\n\002\b\004\b@\030\000 \0252\0020\001:\001\025B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\b\032\0020\t2\b\020\n\032\004\030\0010\001HÖ\003¢\006\004\b\013\020\fJ\020\020\r\032\0020\016HÖ\001¢\006\004\b\017\020\020J\020\020\021\032\0020\022HÖ\001¢\006\004\b\023\020\024R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007\001\002¨\006\026"}, d2 = {"Landroidx/compose/ui/text/style/BaselineShift;", "", "multiplier", "", "constructor-impl", "(F)F", "getMultiplier", "()F", "equals", "", "other", "equals-impl", "(FLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(F)I", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "Companion", "ui-text"})
/*    */ @Immutable
/*    */ public final class BaselineShift {
/*    */   public static final boolean equals-impl0(float p1, float p2) {
/*    */     return (Float.compare(p1, p2) == 0);
/*    */   }
/*    */   
/*    */   public static float constructor-impl(float multiplier) {
/*    */     return multiplier;
/*    */   }
/*    */   
/*    */   public boolean equals(Object other) {
/*    */     return equals-impl(this.multiplier, other);
/*    */   }
/*    */   
/*    */   public static boolean equals-impl(float arg0, Object other) {
/*    */     if (!(other instanceof BaselineShift))
/*    */       return false; 
/*    */     float f = ((BaselineShift)other).unbox-impl();
/*    */     return !(Float.compare(arg0, f) != 0);
/*    */   }
/*    */   
/* 33 */   public final float getMultiplier() { return this.multiplier; }
/*    */   public int hashCode() { return hashCode-impl(this.multiplier); }
/*    */   public static int hashCode-impl(float arg0) { return Float.hashCode(arg0); } public String toString() { return toString-impl(this.multiplier); } public static String toString-impl(float arg0) { return "BaselineShift(multiplier=" + arg0 + ')'; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\013\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R$\020\003\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\005\020\002\032\004\b\006\020\007R$\020\t\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\n\020\002\032\004\b\013\020\007R$\020\f\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\r\020\002\032\004\b\016\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\017"}, d2 = {"Landroidx/compose/ui/text/style/BaselineShift$Companion;", "", "()V", "None", "Landroidx/compose/ui/text/style/BaselineShift;", "getNone-y9eOQZs$annotations", "getNone-y9eOQZs", "()F", "F", "Subscript", "getSubscript-y9eOQZs$annotations", "getSubscript-y9eOQZs", "Superscript", "getSuperscript-y9eOQZs$annotations", "getSuperscript-y9eOQZs", "ui-text"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {} public final float getSuperscript-y9eOQZs() {
/* 39 */       return BaselineShift.Superscript;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public final float getSubscript-y9eOQZs() {
/* 45 */       return BaselineShift.Subscript;
/*    */     }
/*    */ 
/*    */     
/*    */     public final float getNone-y9eOQZs()
/*    */     {
/* 51 */       return BaselineShift.None; } } @NotNull public static final Companion Companion = new Companion(null); private final float multiplier; private static final float Superscript = constructor-impl(0.5F); private static final float Subscript = constructor-impl(-0.5F); private static final float None = constructor-impl(0.0F);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\style\BaselineShift.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */