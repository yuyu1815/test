/*    */ package androidx.compose.ui.text;
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
/*    */ @JvmInline
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\004\b@\030\000 \0232\0020\001:\001\023B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\b\032\0020\t2\b\020\n\032\004\030\0010\001HÖ\003¢\006\004\b\013\020\fJ\020\020\r\032\0020\003HÖ\001¢\006\004\b\016\020\005J\017\020\017\032\0020\020H\026¢\006\004\b\021\020\022R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007\001\002¨\006\024"}, d2 = {"Landroidx/compose/ui/text/TextDecorationLineStyle;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text"})
/*    */ @ExperimentalTextApi
/*    */ public final class TextDecorationLineStyle
/*    */ {
/*    */   public final int getValue() {
/* 28 */     return this.value;
/*    */   } @NotNull
/* 30 */   public String toString() { return toString-impl(this.value); } @NotNull
/* 31 */   public static String toString-impl(int arg0) { int i = arg0; return 
/* 32 */       equals-impl0(i, Solid) ? "Solid" : (
/* 33 */       equals-impl0(i, Double) ? "Double" : (
/* 34 */       equals-impl0(i, Dotted) ? "Dotted" : (
/* 35 */       equals-impl0(i, Dashed) ? "Dashed" : (
/* 36 */       equals-impl0(i, Wavy) ? "Wavy" : 
/* 37 */       "Invalid")))); }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\f\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006R\031\020\n\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\013\020\006R\031\020\f\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\r\020\006R\031\020\016\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\017\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\020"}, d2 = {"Landroidx/compose/ui/text/TextDecorationLineStyle$Companion;", "", "()V", "Dashed", "Landroidx/compose/ui/text/TextDecorationLineStyle;", "getDashed-671RMmY", "()I", "I", "Dotted", "getDotted-671RMmY", "Double", "getDouble-671RMmY", "Solid", "getSolid-671RMmY", "Wavy", "getWavy-671RMmY", "ui-text"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     public final int getSolid-671RMmY() {
/* 45 */       return TextDecorationLineStyle.Solid;
/*    */     }
/*    */ 
/*    */     
/*    */     public final int getDouble-671RMmY() {
/* 50 */       return TextDecorationLineStyle.Double;
/*    */     }
/*    */ 
/*    */     
/*    */     public final int getDotted-671RMmY() {
/* 55 */       return TextDecorationLineStyle.Dotted;
/*    */     }
/*    */ 
/*    */     
/*    */     public final int getDashed-671RMmY() {
/* 60 */       return TextDecorationLineStyle.Dashed;
/*    */     }
/*    */     
/*    */     public final int getWavy-671RMmY()
/*    */     {
/* 65 */       return TextDecorationLineStyle.Wavy; } } private static final int Wavy = constructor-impl(5);
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final int value;
/*    */   private static final int Solid = constructor-impl(1);
/*    */   private static final int Double = constructor-impl(2);
/*    */   private static final int Dotted = constructor-impl(3);
/*    */   private static final int Dashed = constructor-impl(4);
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
/*    */     if (!(other instanceof TextDecorationLineStyle))
/*    */       return false; 
/*    */     int i = ((TextDecorationLineStyle)other).unbox-impl();
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\TextDecorationLineStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */