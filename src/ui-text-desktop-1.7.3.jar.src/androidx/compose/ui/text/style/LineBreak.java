/*    */ package androidx.compose.ui.text.style;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmInline;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @JvmInline
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\004\b@\030\000 \0212\0020\001:\001\021B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\006\032\0020\0072\b\020\b\032\004\030\0010\001HÖ\003¢\006\004\b\t\020\nJ\020\020\013\032\0020\003HÖ\001¢\006\004\b\f\020\005J\020\020\r\032\0020\016HÖ\001¢\006\004\b\017\020\020R\016\020\002\032\0020\003X\004¢\006\002\n\000\001\002\001\0020\003¨\006\022"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak;", "", "mask", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text"})
/*    */ @Immutable
/*    */ public final class LineBreak
/*    */ {
/*    */   public static final boolean equals-impl0(int p1, int p2) {
/*    */     return (p1 == p2);
/*    */   }
/*    */   
/*    */   private static int constructor-impl(int mask) {
/*    */     return mask;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\n\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006R\031\020\n\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\013\020\006R\031\020\f\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\r\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\016"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Companion;", "", "()V", "Heading", "Landroidx/compose/ui/text/style/LineBreak;", "getHeading-rAG3T2k", "()I", "I", "Paragraph", "getParagraph-rAG3T2k", "Simple", "getSimple-rAG3T2k", "Unspecified", "getUnspecified-rAG3T2k", "ui-text"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     public final int getSimple-rAG3T2k() {
/* 29 */       return LineBreak.Simple;
/*    */     } public final int getHeading-rAG3T2k() {
/* 31 */       return LineBreak.Heading;
/*    */     } public final int getParagraph-rAG3T2k() {
/* 33 */       return LineBreak.Paragraph;
/*    */     }
/* 35 */     public final int getUnspecified-rAG3T2k() { return LineBreak.Unspecified; } } private static final int Unspecified = constructor-impl(4);
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final int mask;
/*    */   private static final int Simple = constructor-impl(1);
/*    */   private static final int Heading = constructor-impl(2);
/*    */   private static final int Paragraph = constructor-impl(3);
/*    */   
/*    */   public boolean equals(Object other) {
/*    */     return equals-impl(this.mask, other);
/*    */   }
/*    */   
/*    */   public static boolean equals-impl(int arg0, Object other) {
/*    */     if (!(other instanceof LineBreak))
/*    */       return false; 
/*    */     int i = ((LineBreak)other).unbox-impl();
/*    */     return !(arg0 != i);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return hashCode-impl(this.mask);
/*    */   }
/*    */   
/*    */   public static int hashCode-impl(int arg0) {
/*    */     return Integer.hashCode(arg0);
/*    */   }
/*    */   
/*    */   public String toString() {
/*    */     return toString-impl(this.mask);
/*    */   }
/*    */   
/*    */   public static String toString-impl(int arg0) {
/*    */     return "LineBreak(mask=" + arg0 + ')';
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\style\LineBreak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */