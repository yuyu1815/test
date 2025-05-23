/*     */ package androidx.compose.ui.text.input;
/*     */ 
/*     */ import androidx.compose.runtime.Stable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @JvmInline
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\004\b@\030\000 \0212\0020\001:\001\021B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\006\032\0020\0072\b\020\b\032\004\030\0010\001HÖ\003¢\006\004\b\t\020\nJ\020\020\013\032\0020\003HÖ\001¢\006\004\b\f\020\005J\017\020\r\032\0020\016H\026¢\006\004\b\017\020\020R\016\020\002\032\0020\003X\004¢\006\002\n\000\001\002\001\0020\003¨\006\022"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardType;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text"})
/*     */ public final class KeyboardType
/*     */ {
/*     */   public static final boolean equals-impl0(int p1, int p2) {
/*     */     return (p1 == p2);
/*     */   }
/*     */   
/*     */   private static int constructor-impl(int value) {
/*     */     return value;
/*     */   }
/*     */   
/*     */   public boolean equals(Object other) {
/*     */     return equals-impl(this.value, other);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*  27 */     return toString-impl(this.value); }
/*  28 */   public static boolean equals-impl(int arg0, Object other) { if (!(other instanceof KeyboardType)) return false;  int i = ((KeyboardType)other).unbox-impl(); return !(arg0 != i); } public int hashCode() { return hashCode-impl(this.value); } public static int hashCode-impl(int arg0) { return Integer.hashCode(arg0); } @NotNull public static String toString-impl(int arg0) { int i = arg0; return 
/*  29 */       equals-impl0(i, Unspecified) ? "Unspecified" : (
/*  30 */       equals-impl0(i, Text) ? "Text" : (
/*  31 */       equals-impl0(i, Ascii) ? "Ascii" : (
/*  32 */       equals-impl0(i, Number) ? "Number" : (
/*  33 */       equals-impl0(i, Phone) ? "Phone" : (
/*  34 */       equals-impl0(i, Uri) ? "Uri" : (
/*  35 */       equals-impl0(i, Email) ? "Email" : (
/*  36 */       equals-impl0(i, Password) ? "Password" : (
/*  37 */       equals-impl0(i, NumberPassword) ? "NumberPassword" : (
/*  38 */       equals-impl0(i, Decimal) ? "Decimal" : 
/*  39 */       "Invalid"))))))))); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b \b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R$\020\003\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\005\020\002\032\004\b\006\020\007R$\020\t\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\n\020\002\032\004\b\013\020\007R$\020\f\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\r\020\002\032\004\b\016\020\007R$\020\017\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\020\020\002\032\004\b\021\020\007R$\020\022\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\023\020\002\032\004\b\024\020\007R$\020\025\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\026\020\002\032\004\b\027\020\007R$\020\030\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\031\020\002\032\004\b\032\020\007R$\020\033\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\034\020\002\032\004\b\035\020\007R$\020\036\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\037\020\002\032\004\b \020\007R$\020!\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\"\020\002\032\004\b#\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006$"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardType$Companion;", "", "()V", "Ascii", "Landroidx/compose/ui/text/input/KeyboardType;", "getAscii-PjHm6EE$annotations", "getAscii-PjHm6EE", "()I", "I", "Decimal", "getDecimal-PjHm6EE$annotations", "getDecimal-PjHm6EE", "Email", "getEmail-PjHm6EE$annotations", "getEmail-PjHm6EE", "Number", "getNumber-PjHm6EE$annotations", "getNumber-PjHm6EE", "NumberPassword", "getNumberPassword-PjHm6EE$annotations", "getNumberPassword-PjHm6EE", "Password", "getPassword-PjHm6EE$annotations", "getPassword-PjHm6EE", "Phone", "getPhone-PjHm6EE$annotations", "getPhone-PjHm6EE", "Text", "getText-PjHm6EE$annotations", "getText-PjHm6EE", "Unspecified", "getUnspecified-PjHm6EE$annotations", "getUnspecified-PjHm6EE", "Uri", "getUri-PjHm6EE$annotations", "getUri-PjHm6EE", "ui-text"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     public final int getUnspecified-PjHm6EE() {
/*  48 */       return KeyboardType.Unspecified;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getText-PjHm6EE() {
/*  54 */       return KeyboardType.Text;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getAscii-PjHm6EE() {
/*  60 */       return KeyboardType.Ascii;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getNumber-PjHm6EE() {
/*  69 */       return KeyboardType.Number;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getPhone-PjHm6EE() {
/*  75 */       return KeyboardType.Phone;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getUri-PjHm6EE() {
/*  81 */       return KeyboardType.Uri;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getEmail-PjHm6EE() {
/*  87 */       return KeyboardType.Email;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getPassword-PjHm6EE() {
/*  93 */       return KeyboardType.Password;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getNumberPassword-PjHm6EE() {
/*  99 */       return KeyboardType.NumberPassword;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getDecimal-PjHm6EE()
/*     */     {
/* 107 */       return KeyboardType.Decimal; } } @NotNull public static final Companion Companion = new Companion(null); private final int value; private static final int Unspecified = constructor-impl(0); private static final int Text = constructor-impl(1); private static final int Ascii = constructor-impl(2); private static final int Decimal = constructor-impl(9);
/*     */   private static final int Number = constructor-impl(3);
/*     */   private static final int Phone = constructor-impl(4);
/*     */   private static final int Uri = constructor-impl(5);
/*     */   private static final int Email = constructor-impl(6);
/*     */   private static final int Password = constructor-impl(7);
/*     */   private static final int NumberPassword = constructor-impl(8);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\KeyboardType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */