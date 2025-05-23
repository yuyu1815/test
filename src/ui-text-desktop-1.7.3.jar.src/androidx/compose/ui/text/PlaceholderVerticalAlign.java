/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @JvmInline
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\004\b@\030\000 \0212\0020\001:\001\021B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\006\032\0020\0072\b\020\b\032\004\030\0010\001HÖ\003¢\006\004\b\t\020\nJ\020\020\013\032\0020\003HÖ\001¢\006\004\b\f\020\005J\017\020\r\032\0020\016H\026¢\006\004\b\017\020\020R\016\020\002\032\0020\003X\004¢\006\002\n\000\001\002\001\0020\003¨\006\022"}, d2 = {"Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text"})
/*     */ public final class PlaceholderVerticalAlign
/*     */ {
/*     */   public static final boolean equals-impl0(int p1, int p2) {
/*     */     return (p1 == p2);
/*     */   }
/*     */   
/*     */   public static int constructor-impl(int value) {
/*     */     return value;
/*     */   }
/*     */   
/*     */   public boolean equals(Object other) {
/*     */     return equals-impl(this.value, other);
/*     */   }
/*     */   
/*     */   public static boolean equals-impl(int arg0, Object other) {
/*     */     if (!(other instanceof PlaceholderVerticalAlign))
/*     */       return false; 
/*     */     int i = ((PlaceholderVerticalAlign)other).unbox-impl();
/*     */     return !(arg0 != i);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return hashCode-impl(this.value);
/*     */   }
/*     */   
/*     */   public static int hashCode-impl(int arg0) {
/*     */     return Integer.hashCode(arg0);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*  92 */     return toString-impl(this.value); } @NotNull
/*  93 */   public static String toString-impl(int arg0) { int i = arg0; return 
/*  94 */       equals-impl0(i, AboveBaseline) ? "AboveBaseline" : (
/*  95 */       equals-impl0(i, Top) ? "Top" : (
/*  96 */       equals-impl0(i, Bottom) ? "Bottom" : (
/*  97 */       equals-impl0(i, Center) ? "Center" : (
/*  98 */       equals-impl0(i, TextTop) ? "TextTop" : (
/*  99 */       equals-impl0(i, TextBottom) ? "TextBottom" : (
/* 100 */       equals-impl0(i, TextCenter) ? "TextCenter" : 
/* 101 */       "Invalid")))))); }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\020\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006R\031\020\n\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\013\020\006R\031\020\f\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\r\020\006R\031\020\016\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\017\020\006R\031\020\020\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\021\020\006R\031\020\022\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\023\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\024"}, d2 = {"Landroidx/compose/ui/text/PlaceholderVerticalAlign$Companion;", "", "()V", "AboveBaseline", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "getAboveBaseline-J6kI3mc", "()I", "I", "Bottom", "getBottom-J6kI3mc", "Center", "getCenter-J6kI3mc", "TextBottom", "getTextBottom-J6kI3mc", "TextCenter", "getTextCenter-J6kI3mc", "TextTop", "getTextTop-J6kI3mc", "Top", "getTop-J6kI3mc", "ui-text"})
/*     */   public static final class Companion { private Companion() {}
/*     */     
/*     */     public final int getAboveBaseline-J6kI3mc() {
/* 107 */       return PlaceholderVerticalAlign.AboveBaseline;
/*     */     } public final int getTop-J6kI3mc() {
/* 109 */       return PlaceholderVerticalAlign.Top;
/*     */     } public final int getBottom-J6kI3mc() {
/* 111 */       return PlaceholderVerticalAlign.Bottom;
/*     */     } public final int getCenter-J6kI3mc() {
/* 113 */       return PlaceholderVerticalAlign.Center;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getTextTop-J6kI3mc() {
/* 120 */       return PlaceholderVerticalAlign.TextTop;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getTextBottom-J6kI3mc() {
/* 127 */       return PlaceholderVerticalAlign.TextBottom;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getTextCenter-J6kI3mc()
/*     */     {
/* 134 */       return PlaceholderVerticalAlign.TextCenter; } } private static final int TextCenter = constructor-impl(7);
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final int value;
/*     */   private static final int AboveBaseline = constructor-impl(1);
/*     */   private static final int Top = constructor-impl(2);
/*     */   private static final int Bottom = constructor-impl(3);
/*     */   private static final int Center = constructor-impl(4);
/*     */   private static final int TextTop = constructor-impl(5);
/*     */   private static final int TextBottom = constructor-impl(6);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\PlaceholderVerticalAlign.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */