/*     */ package androidx.compose.ui.text.style;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\002\b\004\b\007\030\000 \0252\0020\001:\003\024\025\026B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\001H\002J\b\020\020\032\0020\021H\026J\b\020\022\032\0020\023H\026R\031\020\002\032\0020\003ø\001\000ø\001\001¢\006\n\n\002\020\t\032\004\b\007\020\bR\031\020\004\032\0020\005ø\001\000ø\001\001¢\006\n\n\002\020\f\032\004\b\n\020\013\002\013\n\005\b¡\0360\001\n\002\b!¨\006\027"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle;", "", "alignment", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "trim", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "(FILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlignment-PIaL0Z0", "()F", "F", "getTrim-EVpEnUU", "()I", "I", "equals", "", "other", "hashCode", "", "toString", "", "Alignment", "Companion", "Trim", "ui-text"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class LineHeightStyle
/*     */ {
/*     */   private LineHeightStyle(float alignment, int trim) {
/*  38 */     this.alignment = alignment;
/*  39 */     this.trim = trim; } public final float getAlignment-PIaL0Z0() { return this.alignment; } public final int getTrim-EVpEnUU() { return this.trim; }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getDefault", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "ui-text"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*  47 */     public final LineHeightStyle getDefault() { return LineHeightStyle.Default; } } @NotNull public static final Companion Companion = new Companion(null); private final float alignment; private final int trim; public static final int $stable; @NotNull private static final LineHeightStyle Default = new LineHeightStyle(
/*  48 */       Alignment.Companion.getProportional-PIaL0Z0(), 
/*  49 */       Trim.Companion.getBoth-EVpEnUU(), null);
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*  54 */     if (this == other) return true; 
/*  55 */     if (!(other instanceof LineHeightStyle)) return false;
/*     */     
/*  57 */     if (!Alignment.equals-impl0(this.alignment, ((LineHeightStyle)other).alignment)) return false; 
/*  58 */     if (!Trim.equals-impl0(this.trim, ((LineHeightStyle)other).trim)) return false;
/*     */     
/*  60 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*  64 */     int result = Alignment.hashCode-impl(this.alignment);
/*  65 */     result = 31 * result + Trim.hashCode-impl(this.trim);
/*  66 */     return result;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/*  70 */     return "LineHeightStyle(alignment=" + Alignment.toString-impl(
/*  71 */         this.alignment) + ", trim=" + Trim.toString-impl(
/*  72 */         this.trim) + ')';
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @JvmInline
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\013\n\002\020\016\n\002\b\004\b@\030\000 \0262\0020\001:\001\026B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\006\032\0020\0072\b\020\b\032\004\030\0010\001HÖ\003¢\006\004\b\t\020\nJ\020\020\013\032\0020\003HÖ\001¢\006\004\b\f\020\005J\017\020\r\032\0020\007H\000¢\006\004\b\016\020\017J\017\020\020\032\0020\007H\000¢\006\004\b\021\020\017J\017\020\022\032\0020\023H\026¢\006\004\b\024\020\025R\016\020\002\032\0020\003X\004¢\006\002\n\000\001\002\001\0020\003¨\006\027"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isTrimFirstLineTop", "isTrimFirstLineTop-impl$ui_text", "(I)Z", "isTrimLastLineBottom", "isTrimLastLineBottom-impl$ui_text", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text"})
/*     */   public static final class Trim {
/*     */     @NotNull
/*     */     public String toString()
/*     */     {
/*  84 */       return toString-impl(this.value); } @NotNull
/*  85 */     public static String toString-impl(int arg0) { int i = arg0; return 
/*  86 */         (i == FirstLineTop) ? "LineHeightStyle.Trim.FirstLineTop" : (
/*  87 */         (i == LastLineBottom) ? "LineHeightStyle.Trim.LastLineBottom" : (
/*  88 */         (i == Both) ? "LineHeightStyle.Trim.Both" : (
/*  89 */         (i == None) ? "LineHeightStyle.Trim.None" : 
/*  90 */         "Invalid"))); }
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
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\006\n\002\020\b\n\002\b\006\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006R\016\020\n\032\0020\013XT¢\006\002\n\000R\016\020\f\032\0020\013XT¢\006\002\n\000R\031\020\r\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\016\020\006R\031\020\017\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\020\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\021"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;", "", "()V", "Both", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "getBoth-EVpEnUU", "()I", "I", "FirstLineTop", "getFirstLineTop-EVpEnUU", "FlagTrimBottom", "", "FlagTrimTop", "LastLineBottom", "getLastLineBottom-EVpEnUU", "None", "getNone-EVpEnUU", "ui-text"})
/*     */     public static final class Companion
/*     */     {
/*     */       private Companion() {}
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
/*     */       public final int getFirstLineTop-EVpEnUU() {
/* 117 */         return LineHeightStyle.Trim.FirstLineTop;
/*     */       }
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
/*     */       public final int getLastLineBottom-EVpEnUU() {
/* 138 */         return LineHeightStyle.Trim.LastLineBottom;
/*     */       }
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
/*     */       public final int getBoth-EVpEnUU() {
/* 158 */         return LineHeightStyle.Trim.Both;
/*     */       }
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
/*     */       public final int getNone-EVpEnUU()
/*     */       {
/* 178 */         return LineHeightStyle.Trim.None; } } @NotNull public static final Companion Companion = new Companion(null); private final int value; private static final int FlagTrimTop = 1; private static final int FlagTrimBottom = 16; private static final int FirstLineTop = constructor-impl(1); private static final int LastLineBottom = constructor-impl(16); private static final int Both = constructor-impl(17); private static final int None = constructor-impl(0);
/*     */ 
/*     */     
/*     */     public static final boolean isTrimFirstLineTop-impl$ui_text(int arg0) {
/* 182 */       return ((arg0 & 0x1) > 0); }
/*     */     public static int hashCode-impl(int arg0) { return Integer.hashCode(arg0); }
/*     */     public int hashCode() { return hashCode-impl(this.value); }
/*     */     public static boolean equals-impl(int arg0, Object other) { if (!(other instanceof Trim))
/* 186 */         return false;  int i = ((Trim)other).unbox-impl(); return !(arg0 != i); } public static final boolean isTrimLastLineBottom-impl$ui_text(int arg0) { return ((arg0 & 0x10) > 0); }
/*     */     public boolean equals(Object other) { return equals-impl(this.value, other); }
/*     */     private static int constructor-impl(int value) { return value; } public static final boolean equals-impl0(int p1, int p2) { return (p1 == p2); }
/*     */   } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\006\n\002\020\b\n\002\b\006\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006R\016\020\n\032\0020\013XT¢\006\002\n\000R\016\020\f\032\0020\013XT¢\006\002\n\000R\031\020\r\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\016\020\006R\031\020\017\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\020\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\021"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;", "", "()V", "Both", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "getBoth-EVpEnUU", "()I", "I", "FirstLineTop", "getFirstLineTop-EVpEnUU", "FlagTrimBottom", "", "FlagTrimTop", "LastLineBottom", "getLastLineBottom-EVpEnUU", "None", "getNone-EVpEnUU", "ui-text"})
/*     */   public static final class Companion {
/*     */     private Companion() {} public final int getFirstLineTop-EVpEnUU() { return LineHeightStyle.Trim.FirstLineTop; } public final int getLastLineBottom-EVpEnUU() { return LineHeightStyle.Trim.LastLineBottom; } public final int getBoth-EVpEnUU() {
/*     */       return LineHeightStyle.Trim.Both;
/*     */     } public final int getNone-EVpEnUU() {
/*     */       return LineHeightStyle.Trim.None;
/*     */     }
/*     */   } @JvmInline
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\002\b\003\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\003\n\002\020\016\n\002\b\004\b@\030\000 \0232\0020\001:\001\023B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\006\032\0020\0072\b\020\b\032\004\030\0010\001HÖ\003¢\006\004\b\t\020\nJ\020\020\013\032\0020\fHÖ\001¢\006\004\b\r\020\016J\017\020\017\032\0020\020H\026¢\006\004\b\021\020\022R\016\020\002\032\0020\003X\004¢\006\002\n\000\001\002\001\0020\003¨\006\024"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "", "topRatio", "", "constructor-impl", "(F)F", "equals", "", "other", "equals-impl", "(FLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(F)I", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "Companion", "ui-text"})
/*     */   public static final class Alignment {
/*     */     public static float constructor-impl(float topRatio) {
/* 200 */       float f1 = topRatio, f2 = f1; if (!((((0.0F <= f2) ? ((f2 <= 1.0F)) : false) || ((f1 == -1.0F))) ? 1 : 0)) { int $i$a$-check-LineHeightStyle$Alignment$1 = 0; String str = 
/* 201 */           "topRatio should be in [0..1] range or -1";
/*     */         throw new IllegalStateException(str.toString()); }
/*     */       
/*     */       return f1; } @NotNull
/* 205 */     public String toString() { return toString-impl(this.topRatio); } @NotNull
/* 206 */     public static String toString-impl(float arg0) { float f = arg0; return 
/* 207 */         ((f == Top)) ? "LineHeightStyle.Alignment.Top" : (
/* 208 */         ((f == Center)) ? "LineHeightStyle.Alignment.Center" : (
/* 209 */         ((f == Proportional)) ? "LineHeightStyle.Alignment.Proportional" : (
/* 210 */         ((f == Bottom)) ? "LineHeightStyle.Alignment.Bottom" : (
/* 211 */         "LineHeightStyle.Alignment(topPercentage = " + arg0 + ')')))); }
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
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\n\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006R\031\020\n\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\013\020\006R\031\020\f\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\r\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\016"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;", "", "()V", "Bottom", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "getBottom-PIaL0Z0", "()F", "F", "Center", "getCenter-PIaL0Z0", "Proportional", "getProportional-PIaL0Z0", "Top", "getTop-PIaL0Z0", "ui-text"})
/*     */     public static final class Companion
/*     */     {
/*     */       private Companion() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public final float getTop-PIaL0Z0() {
/* 237 */         return LineHeightStyle.Alignment.Top;
/*     */       }
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
/*     */       public final float getCenter-PIaL0Z0() {
/* 257 */         return LineHeightStyle.Alignment.Center;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public final float getProportional-PIaL0Z0() {
/* 265 */         return LineHeightStyle.Alignment.Proportional;
/*     */       }
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
/*     */       public final float getBottom-PIaL0Z0()
/*     */       {
/* 288 */         return LineHeightStyle.Alignment.Bottom; } } @NotNull public static final Companion Companion = new Companion(null); private final float topRatio; private static final float Top = constructor-impl(0.0F); private static final float Center = constructor-impl(0.5F); private static final float Proportional = constructor-impl(-1.0F); private static final float Bottom = constructor-impl(1.0F); public static int hashCode-impl(float arg0) { return Float.hashCode(arg0); } public int hashCode() { return hashCode-impl(this.topRatio); } public static boolean equals-impl(float arg0, Object other) { if (!(other instanceof Alignment)) return false;  float f = ((Alignment)other).unbox-impl(); return !(Float.compare(arg0, f) != 0); } public boolean equals(Object other) { return equals-impl(this.topRatio, other); } public static final boolean equals-impl0(float p1, float p2) { return (Float.compare(p1, p2) == 0); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\n\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006R\031\020\n\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\013\020\006R\031\020\f\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\r\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\016"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;", "", "()V", "Bottom", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "getBottom-PIaL0Z0", "()F", "F", "Center", "getCenter-PIaL0Z0", "Proportional", "getProportional-PIaL0Z0", "Top", "getTop-PIaL0Z0", "ui-text"}) public static final class Companion { private Companion() {} public final float getTop-PIaL0Z0() { return LineHeightStyle.Alignment.Top; } public final float getCenter-PIaL0Z0() { return LineHeightStyle.Alignment.Center; } public final float getProportional-PIaL0Z0() { return LineHeightStyle.Alignment.Proportional; } public final float getBottom-PIaL0Z0() { return LineHeightStyle.Alignment.Bottom; }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\style\LineHeightStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */