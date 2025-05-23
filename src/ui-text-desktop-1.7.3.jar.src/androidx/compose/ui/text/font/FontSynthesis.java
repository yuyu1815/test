/*    */ package androidx.compose.ui.text.font;
/*    */ 
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\013\n\002\020\016\n\002\b\004\b@\030\000 \0262\0020\001:\001\026B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\f\032\0020\0072\b\020\r\032\004\030\0010\001HÖ\003¢\006\004\b\016\020\017J\020\020\020\032\0020\003HÖ\001¢\006\004\b\021\020\005J\017\020\022\032\0020\023H\026¢\006\004\b\024\020\025R\024\020\006\032\0020\0078@X\004¢\006\006\032\004\b\b\020\tR\024\020\n\032\0020\0078@X\004¢\006\006\032\004\b\013\020\tR\016\020\002\032\0020\003X\004¢\006\002\n\000\001\002\001\0020\003¨\006\027"}, d2 = {"Landroidx/compose/ui/text/font/FontSynthesis;", "", "value", "", "constructor-impl", "(I)I", "isStyleOn", "", "isStyleOn-impl$ui_text", "(I)Z", "isWeightOn", "isWeightOn-impl$ui_text", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text"})
/*    */ public final class FontSynthesis
/*    */ {
/*    */   @NotNull
/*    */   public String toString() {
/* 39 */     return toString-impl(this.value); } @NotNull
/* 40 */   public static String toString-impl(int arg0) { int i = arg0; return 
/* 41 */       equals-impl0(i, None) ? "None" : (
/* 42 */       equals-impl0(i, All) ? "All" : (
/* 43 */       equals-impl0(i, Weight) ? "Weight" : (
/* 44 */       equals-impl0(i, Style) ? "Style" : 
/* 45 */       "Invalid"))); }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\n\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006R\031\020\n\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\013\020\006R\031\020\f\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\r\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\016"}, d2 = {"Landroidx/compose/ui/text/font/FontSynthesis$Companion;", "", "()V", "All", "Landroidx/compose/ui/text/font/FontSynthesis;", "getAll-GVVA2EU", "()I", "I", "None", "getNone-GVVA2EU", "Style", "getStyle-GVVA2EU", "Weight", "getWeight-GVVA2EU", "ui-text"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     public final int getNone-GVVA2EU() {
/* 54 */       return FontSynthesis.None;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public final int getAll-GVVA2EU() {
/* 60 */       return FontSynthesis.All;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public final int getWeight-GVVA2EU() {
/* 66 */       return FontSynthesis.Weight;
/*    */     }
/*    */ 
/*    */     
/*    */     public final int getStyle-GVVA2EU()
/*    */     {
/* 72 */       return FontSynthesis.Style; } } @NotNull public static final Companion Companion = new Companion(null); private static final int Style = constructor-impl(3); private final int value; private static final int None = constructor-impl(0); private static final int All = constructor-impl(1);
/*    */   private static final int Weight = constructor-impl(2);
/*    */   
/*    */   public static final boolean isWeightOn-impl$ui_text(int arg0) {
/* 76 */     return (equals-impl0(arg0, All) || equals-impl0(arg0, Weight));
/*    */   }
/*    */   public static final boolean isStyleOn-impl$ui_text(int arg0) {
/* 79 */     return (equals-impl0(arg0, All) || equals-impl0(arg0, Style));
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
/*    */     if (!(other instanceof FontSynthesis))
/*    */       return false; 
/*    */     int i = ((FontSynthesis)other).unbox-impl();
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\FontSynthesis.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */