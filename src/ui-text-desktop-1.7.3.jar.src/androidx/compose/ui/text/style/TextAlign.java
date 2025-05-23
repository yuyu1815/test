/*    */ package androidx.compose.ui.text.style;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.JvmInline;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @JvmInline
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\004\b@\030\000 \0212\0020\001:\001\021B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\006\032\0020\0072\b\020\b\032\004\030\0010\001HÖ\003¢\006\004\b\t\020\nJ\020\020\013\032\0020\003HÖ\001¢\006\004\b\f\020\005J\017\020\r\032\0020\016H\026¢\006\004\b\017\020\020R\016\020\002\032\0020\003X\004¢\006\002\n\000\001\002\001\0020\003¨\006\022"}, d2 = {"Landroidx/compose/ui/text/style/TextAlign;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text"})
/*    */ public final class TextAlign {
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
/* 25 */   public String toString() { return toString-impl(this.value); }
/* 26 */   public static boolean equals-impl(int arg0, Object other) { if (!(other instanceof TextAlign)) return false;  int i = ((TextAlign)other).unbox-impl(); return !(arg0 != i); } public int hashCode() { return hashCode-impl(this.value); } public static int hashCode-impl(int arg0) { return Integer.hashCode(arg0); } @NotNull public static String toString-impl(int arg0) { int i = arg0; return 
/* 27 */       equals-impl0(i, Left) ? "Left" : (
/* 28 */       equals-impl0(i, Right) ? "Right" : (
/* 29 */       equals-impl0(i, Center) ? "Center" : (
/* 30 */       equals-impl0(i, Justify) ? "Justify" : (
/* 31 */       equals-impl0(i, Start) ? "Start" : (
/* 32 */       equals-impl0(i, End) ? "End" : (
/* 33 */       equals-impl0(i, Unspecified) ? "Unspecified" : 
/* 34 */       "Invalid")))))); }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\020\n\002\020 \n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\f\020\024\032\b\022\004\022\0020\0040\025R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006R\031\020\n\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\013\020\006R\031\020\f\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\r\020\006R\031\020\016\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\017\020\006R\031\020\020\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\021\020\006R\031\020\022\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\023\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\026"}, d2 = {"Landroidx/compose/ui/text/style/TextAlign$Companion;", "", "()V", "Center", "Landroidx/compose/ui/text/style/TextAlign;", "getCenter-e0LSkKk", "()I", "I", "End", "getEnd-e0LSkKk", "Justify", "getJustify-e0LSkKk", "Left", "getLeft-e0LSkKk", "Right", "getRight-e0LSkKk", "Start", "getStart-e0LSkKk", "Unspecified", "getUnspecified-e0LSkKk", "values", "", "ui-text"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/*    */     public final int getLeft-e0LSkKk() {
/* 40 */       return TextAlign.Left;
/*    */     }
/*    */     public final int getRight-e0LSkKk() {
/* 43 */       return TextAlign.Right;
/*    */     }
/*    */     public final int getCenter-e0LSkKk() {
/* 46 */       return TextAlign.Center;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public final int getJustify-e0LSkKk() {
/* 54 */       return TextAlign.Justify;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public final int getStart-e0LSkKk() {
/* 63 */       return TextAlign.Start;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public final int getEnd-e0LSkKk() {
/* 72 */       return TextAlign.End;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<TextAlign> values() {
/* 77 */       TextAlign[] arrayOfTextAlign = new TextAlign[6]; arrayOfTextAlign[0] = TextAlign.box-impl(getLeft-e0LSkKk()); arrayOfTextAlign[1] = TextAlign.box-impl(getRight-e0LSkKk()); arrayOfTextAlign[2] = TextAlign.box-impl(getCenter-e0LSkKk()); arrayOfTextAlign[3] = TextAlign.box-impl(getJustify-e0LSkKk()); arrayOfTextAlign[4] = TextAlign.box-impl(getStart-e0LSkKk()); arrayOfTextAlign[5] = TextAlign.box-impl(getEnd-e0LSkKk()); return CollectionsKt.listOf((Object[])arrayOfTextAlign);
/*    */     }
/*    */ 
/*    */     
/*    */     public final int getUnspecified-e0LSkKk()
/*    */     {
/* 83 */       return TextAlign.Unspecified; } } @NotNull public static final Companion Companion = new Companion(null); private final int value; private static final int Left = constructor-impl(1); private static final int Right = constructor-impl(2); private static final int Center = constructor-impl(3); private static final int Justify = constructor-impl(4); private static final int Start = constructor-impl(5); private static final int End = constructor-impl(6); private static final int Unspecified = constructor-impl(-2147483648);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\style\TextAlign.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */