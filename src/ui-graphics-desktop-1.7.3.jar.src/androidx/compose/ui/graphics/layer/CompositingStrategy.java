/*    */ package androidx.compose.ui.graphics.layer;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmInline;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ @JvmInline
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\004\b@\030\000 \0212\0020\001:\001\021B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\006\032\0020\0072\b\020\b\032\004\030\0010\001HÖ\003¢\006\004\b\t\020\nJ\020\020\013\032\0020\003HÖ\001¢\006\004\b\f\020\005J\020\020\r\032\0020\016HÖ\001¢\006\004\b\017\020\020R\016\020\002\032\0020\003X\004¢\006\002\n\000\001\002\001\0020\003¨\006\022"}, d2 = {"Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-graphics"})
/*    */ @Immutable
/*    */ public final class CompositingStrategy
/*    */ {
/*    */   public static final boolean equals-impl0(int p1, int p2) {
/*    */     return (p1 == p2);
/*    */   }
/*    */   
/*    */   public static int constructor-impl(int value) {
/*    */     return value;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\b\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006R\031\020\n\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\013\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\f"}, d2 = {"Landroidx/compose/ui/graphics/layer/CompositingStrategy$Companion;", "", "()V", "Auto", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "getAuto-ke2Ky5w", "()I", "I", "ModulateAlpha", "getModulateAlpha-ke2Ky5w", "Offscreen", "getOffscreen-ke2Ky5w", "ui-graphics"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     public final int getAuto-ke2Ky5w() {
/* 44 */       return CompositingStrategy.Auto;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public final int getOffscreen-ke2Ky5w() {
/* 53 */       return CompositingStrategy.Offscreen;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public final int getModulateAlpha-ke2Ky5w()
/*    */     {
/* 64 */       return CompositingStrategy.ModulateAlpha; } } private static final int ModulateAlpha = constructor-impl(2);
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final int value;
/*    */   private static final int Auto = constructor-impl(0);
/*    */   private static final int Offscreen = constructor-impl(1);
/*    */   
/*    */   public boolean equals(Object other) {
/*    */     return equals-impl(this.value, other);
/*    */   }
/*    */   
/*    */   public static boolean equals-impl(int arg0, Object other) {
/*    */     if (!(other instanceof CompositingStrategy))
/*    */       return false; 
/*    */     int i = ((CompositingStrategy)other).unbox-impl();
/*    */     return !(arg0 != i);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return hashCode-impl(this.value);
/*    */   }
/*    */   
/*    */   public static int hashCode-impl(int arg0) {
/*    */     return Integer.hashCode(arg0);
/*    */   }
/*    */   
/*    */   public String toString() {
/*    */     return toString-impl(this.value);
/*    */   }
/*    */   
/*    */   public static String toString-impl(int arg0) {
/*    */     return "CompositingStrategy(value=" + arg0 + ')';
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\layer\CompositingStrategy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */