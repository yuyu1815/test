/*    */ package androidx.compose.ui.text.style;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmInline;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @JvmInline
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\004\b@\030\000 \0212\0020\001:\001\021B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\006\032\0020\0072\b\020\b\032\004\030\0010\001HÖ\003¢\006\004\b\t\020\nJ\020\020\013\032\0020\003HÖ\001¢\006\004\b\f\020\005J\017\020\r\032\0020\016H\026¢\006\004\b\017\020\020R\016\020\002\032\0020\003X\004¢\006\002\n\000\001\002\001\0020\003¨\006\022"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text"})
/*    */ public final class TextDirection
/*    */ {
/*    */   public static final boolean equals-impl0(int p1, int p2) {
/*    */     return (p1 == p2);
/*    */   }
/*    */   
/*    */   public static int constructor-impl(int value) {
/*    */     return value;
/*    */   }
/*    */   
/*    */   public boolean equals(Object other) {
/*    */     return equals-impl(this.value, other);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/* 27 */     return toString-impl(this.value);
/* 28 */   } public static boolean equals-impl(int arg0, Object other) { if (!(other instanceof TextDirection)) return false;  int i = ((TextDirection)other).unbox-impl(); return !(arg0 != i); } public int hashCode() { return hashCode-impl(this.value); } public static int hashCode-impl(int arg0) { return Integer.hashCode(arg0); } @NotNull public static String toString-impl(int arg0) { int i = arg0; return 
/* 29 */       equals-impl0(i, Ltr) ? "Ltr" : (
/* 30 */       equals-impl0(i, Rtl) ? "Rtl" : (
/* 31 */       equals-impl0(i, Content) ? "Content" : (
/* 32 */       equals-impl0(i, ContentOrLtr) ? "ContentOrLtr" : (
/* 33 */       equals-impl0(i, ContentOrRtl) ? "ContentOrRtl" : (
/* 34 */       equals-impl0(i, Unspecified) ? "Unspecified" : 
/* 35 */       "Invalid"))))); }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\016\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006R\031\020\n\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\013\020\006R\031\020\f\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\r\020\006R\031\020\016\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\017\020\006R\031\020\020\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\021\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\022"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection$Companion;", "", "()V", "Content", "Landroidx/compose/ui/text/style/TextDirection;", "getContent-s_7X-co", "()I", "I", "ContentOrLtr", "getContentOrLtr-s_7X-co", "ContentOrRtl", "getContentOrRtl-s_7X-co", "Ltr", "getLtr-s_7X-co", "Rtl", "getRtl-s_7X-co", "Unspecified", "getUnspecified-s_7X-co", "ui-text"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     public final int getLtr-s_7X-co() {
/* 43 */       return TextDirection.Ltr;
/*    */     }
/*    */ 
/*    */     
/*    */     public final int getRtl-s_7X-co() {
/* 48 */       return TextDirection.Rtl;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public final int getContent-s_7X-co() {
/* 59 */       return TextDirection.Content;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public final int getContentOrLtr-s_7X-co() {
/* 66 */       return TextDirection.ContentOrLtr;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public final int getContentOrRtl-s_7X-co() {
/* 73 */       return TextDirection.ContentOrRtl;
/*    */     }
/*    */ 
/*    */     
/*    */     public final int getUnspecified-s_7X-co()
/*    */     {
/* 79 */       return TextDirection.Unspecified; } } @NotNull public static final Companion Companion = new Companion(null); private final int value; private static final int Ltr = constructor-impl(1); private static final int Rtl = constructor-impl(2); private static final int Content = constructor-impl(3); private static final int ContentOrLtr = constructor-impl(4); private static final int ContentOrRtl = constructor-impl(5); private static final int Unspecified = constructor-impl(-2147483648);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\style\TextDirection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */