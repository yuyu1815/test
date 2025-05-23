/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\r\n\002\020\016\n\002\b\006\b@\030\000 \0322\0020\001:\001\032B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\006\032\0020\0072\b\020\b\032\004\030\0010\001HÖ\003¢\006\004\b\t\020\nJ\032\020\013\032\0020\0072\006\020\f\032\0020\000H\000ø\001\000¢\006\004\b\r\020\016J\020\020\017\032\0020\003HÖ\001¢\006\004\b\020\020\005J\033\020\021\032\0020\0002\006\020\f\032\0020\000H\002ø\001\000¢\006\004\b\022\020\023J\017\020\024\032\0020\025H\026¢\006\004\b\026\020\027J\017\020\030\032\0020\025H\002¢\006\004\b\031\020\027R\016\020\002\032\0020\003X\004¢\006\002\n\000\001\002\001\0020\003\002\007\n\005\b¡\0360\001¨\006\033"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hasAny", "sides", "hasAny-bkgdKaI$foundation_layout", "(II)Z", "hashCode", "hashCode-impl", "plus", "plus-gK_yJZ4", "(II)I", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "valueToString", "valueToString-impl", "Companion", "foundation-layout"})
/*     */ public final class WindowInsetsSides
/*     */ {
/*     */   public static final int plus-gK_yJZ4(int arg0, int sides) {
/* 107 */     return constructor-impl(arg0 | sides);
/*     */   }
/*     */   
/* 110 */   public static final boolean hasAny-bkgdKaI$foundation_layout(int arg0, int sides) { return ((arg0 & sides) != 0); }
/*     */   @NotNull
/* 112 */   public static String toString-impl(int arg0) { return "WindowInsetsSides(" + valueToString-impl(arg0) + ')'; } @NotNull public String toString() { return toString-impl(this.value); }
/*     */    private static final String valueToString-impl(int arg0) {
/* 114 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$valueToString_impl_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-WindowInsetsSides$valueToString$1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 120 */     if ((arg0 & Start) == Start) valueToString_impl$lambda$0$appendPlus($this$valueToString_impl_u24lambda_u240, "Start"); 
/* 121 */     if ((arg0 & Left) == Left) valueToString_impl$lambda$0$appendPlus($this$valueToString_impl_u24lambda_u240, "Left"); 
/* 122 */     if ((arg0 & Top) == Top) valueToString_impl$lambda$0$appendPlus($this$valueToString_impl_u24lambda_u240, "Top"); 
/* 123 */     if ((arg0 & End) == End) valueToString_impl$lambda$0$appendPlus($this$valueToString_impl_u24lambda_u240, "End"); 
/* 124 */     if ((arg0 & Right) == Right) valueToString_impl$lambda$0$appendPlus($this$valueToString_impl_u24lambda_u240, "Right"); 
/* 125 */     if ((arg0 & Bottom) == Bottom) valueToString_impl$lambda$0$appendPlus($this$valueToString_impl_u24lambda_u240, "Bottom");
/*     */     
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   private static final void valueToString_impl$lambda$0$appendPlus(StringBuilder $this_buildString, String text) {
/*     */     if (($this_buildString.length() > 0)) {
/*     */       $this_buildString.append('+');
/*     */     }
/*     */     $this_buildString.append(text);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\032\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\004X\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\034\020\b\032\0020\004X\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006R\034\020\n\032\0020\004X\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\013\020\006R\034\020\f\032\0020\004X\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\r\020\006R\031\020\016\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\017\020\006R\031\020\020\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\021\020\006R\031\020\022\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\023\020\006R\031\020\024\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\025\020\006R\031\020\026\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\027\020\006R\031\020\030\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\031\020\006R\031\020\032\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\033\020\006R\031\020\034\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\035\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\036"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides$Companion;", "", "()V", "AllowLeftInLtr", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "getAllowLeftInLtr-JoeWqyM$foundation_layout", "()I", "I", "AllowLeftInRtl", "getAllowLeftInRtl-JoeWqyM$foundation_layout", "AllowRightInLtr", "getAllowRightInLtr-JoeWqyM$foundation_layout", "AllowRightInRtl", "getAllowRightInRtl-JoeWqyM$foundation_layout", "Bottom", "getBottom-JoeWqyM", "End", "getEnd-JoeWqyM", "Horizontal", "getHorizontal-JoeWqyM", "Left", "getLeft-JoeWqyM", "Right", "getRight-JoeWqyM", "Start", "getStart-JoeWqyM", "Top", "getTop-JoeWqyM", "Vertical", "getVertical-JoeWqyM", "foundation-layout"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     public final int getAllowLeftInLtr-JoeWqyM$foundation_layout() {
/* 145 */       return WindowInsetsSides.AllowLeftInLtr;
/* 146 */     } public final int getAllowRightInLtr-JoeWqyM$foundation_layout() { return WindowInsetsSides.AllowRightInLtr; }
/* 147 */     public final int getAllowLeftInRtl-JoeWqyM$foundation_layout() { return WindowInsetsSides.AllowLeftInRtl; } public final int getAllowRightInRtl-JoeWqyM$foundation_layout() {
/* 148 */       return WindowInsetsSides.AllowRightInRtl;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getStart-JoeWqyM() {
/* 157 */       return WindowInsetsSides.Start;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getEnd-JoeWqyM() {
/* 166 */       return WindowInsetsSides.End;
/*     */     }
/*     */ 
/*     */     
/*     */     public final int getTop-JoeWqyM() {
/* 171 */       return WindowInsetsSides.Top;
/*     */     }
/*     */ 
/*     */     
/*     */     public final int getBottom-JoeWqyM() {
/* 176 */       return WindowInsetsSides.Bottom;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getLeft-JoeWqyM() {
/* 182 */       return WindowInsetsSides.Left;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getRight-JoeWqyM() {
/* 188 */       return WindowInsetsSides.Right;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getHorizontal-JoeWqyM() {
/* 194 */       return WindowInsetsSides.Horizontal;
/*     */     }
/*     */     
/*     */     public final int getVertical-JoeWqyM()
/*     */     {
/* 199 */       return WindowInsetsSides.Vertical; } } private static final int Vertical = plus-gK_yJZ4(Top, Bottom);
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final int value;
/*     */   private static final int AllowLeftInLtr = constructor-impl(8);
/*     */   private static final int AllowRightInLtr = constructor-impl(4);
/*     */   private static final int AllowLeftInRtl = constructor-impl(2);
/*     */   private static final int AllowRightInRtl = constructor-impl(1);
/*     */   private static final int Start = plus-gK_yJZ4(AllowLeftInLtr, AllowRightInRtl);
/*     */   private static final int End = plus-gK_yJZ4(AllowRightInLtr, AllowLeftInRtl);
/*     */   private static final int Top = constructor-impl(16);
/*     */   private static final int Bottom = constructor-impl(32);
/*     */   private static final int Left = plus-gK_yJZ4(AllowLeftInLtr, AllowLeftInRtl);
/*     */   private static final int Right = plus-gK_yJZ4(AllowRightInLtr, AllowRightInRtl);
/*     */   private static final int Horizontal = plus-gK_yJZ4(Left, Right);
/*     */   
/*     */   public static int hashCode-impl(int arg0) {
/*     */     return Integer.hashCode(arg0);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return hashCode-impl(this.value);
/*     */   }
/*     */   
/*     */   public static boolean equals-impl(int arg0, Object other) {
/*     */     if (!(other instanceof WindowInsetsSides))
/*     */       return false; 
/*     */     int i = ((WindowInsetsSides)other).unbox-impl();
/*     */     return !(arg0 != i);
/*     */   }
/*     */   
/*     */   public boolean equals(Object other) {
/*     */     return equals-impl(this.value, other);
/*     */   }
/*     */   
/*     */   private static int constructor-impl(int value) {
/*     */     return value;
/*     */   }
/*     */   
/*     */   public static final boolean equals-impl0(int p1, int p2) {
/*     */     return (p1 == p2);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\WindowInsetsSides.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */