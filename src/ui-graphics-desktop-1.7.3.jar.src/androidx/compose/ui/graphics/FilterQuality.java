/*    */ package androidx.compose.ui.graphics;
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
/*    */ @JvmInline
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\004\b@\030\000 \0232\0020\001:\001\023B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\b\032\0020\t2\b\020\n\032\004\030\0010\001HÖ\003¢\006\004\b\013\020\fJ\020\020\r\032\0020\003HÖ\001¢\006\004\b\016\020\005J\017\020\017\032\0020\020H\026¢\006\004\b\021\020\022R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007\001\002¨\006\024"}, d2 = {"Landroidx/compose/ui/graphics/FilterQuality;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-graphics"})
/*    */ @Immutable
/*    */ public final class FilterQuality
/*    */ {
/*    */   public final int getValue() {
/* 27 */     return this.value;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\n\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006R\031\020\n\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\013\020\006R\031\020\f\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\r\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\016"}, d2 = {"Landroidx/compose/ui/graphics/FilterQuality$Companion;", "", "()V", "High", "Landroidx/compose/ui/graphics/FilterQuality;", "getHigh-f-v9h1I", "()I", "I", "Low", "getLow-f-v9h1I", "Medium", "getMedium-f-v9h1I", "None", "getNone-f-v9h1I", "ui-graphics"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/*    */     public final int getNone-f-v9h1I() {
/* 34 */       return FilterQuality.None;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public final int getLow-f-v9h1I() {
/* 40 */       return FilterQuality.Low;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public final int getMedium-f-v9h1I() {
/* 48 */       return FilterQuality.Medium;
/*    */     }
/*    */ 
/*    */     
/*    */     public final int getHigh-f-v9h1I()
/*    */     {
/* 54 */       return FilterQuality.High; } } @NotNull public static final Companion Companion = new Companion(null); private final int value; private static final int High = constructor-impl(3); private static final int None = constructor-impl(0); private static final int Low = constructor-impl(1); private static final int Medium = constructor-impl(2);
/*    */   @NotNull
/*    */   public static String toString-impl(int arg0) {
/* 57 */     int i = arg0;
/* 58 */     return equals-impl0(i, None) ? "None" : (
/* 59 */       equals-impl0(i, Low) ? "Low" : (
/* 60 */       equals-impl0(i, Medium) ? "Medium" : (
/* 61 */       equals-impl0(i, High) ? "High" : 
/* 62 */       "Unknown")));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return toString-impl(this.value);
/*    */   }
/*    */   
/*    */   public static int hashCode-impl(int arg0) {
/*    */     return Integer.hashCode(arg0);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return hashCode-impl(this.value);
/*    */   }
/*    */   
/*    */   public static boolean equals-impl(int arg0, Object other) {
/*    */     if (!(other instanceof FilterQuality))
/*    */       return false; 
/*    */     int i = ((FilterQuality)other).unbox-impl();
/*    */     return !(arg0 != i);
/*    */   }
/*    */   
/*    */   public boolean equals(Object other) {
/*    */     return equals-impl(this.value, other);
/*    */   }
/*    */   
/*    */   public static int constructor-impl(int value) {
/*    */     return value;
/*    */   }
/*    */   
/*    */   public static final boolean equals-impl0(int p1, int p2) {
/*    */     return (p1 == p2);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\FilterQuality.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */