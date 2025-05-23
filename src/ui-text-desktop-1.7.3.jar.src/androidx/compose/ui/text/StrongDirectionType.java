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
/*    */ @JvmInline
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\004\b@\030\000 \0232\0020\001:\001\023B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\b\032\0020\t2\b\020\n\032\004\030\0010\001HÖ\003¢\006\004\b\013\020\fJ\020\020\r\032\0020\003HÖ\001¢\006\004\b\016\020\005J\020\020\017\032\0020\020HÖ\001¢\006\004\b\021\020\022R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007\001\002¨\006\024"}, d2 = {"Landroidx/compose/ui/text/StrongDirectionType;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text"})
/*    */ public final class StrongDirectionType
/*    */ {
/*    */   public static final boolean equals-impl0(int p1, int p2) {
/*    */     return (p1 == p2);
/*    */   }
/*    */   
/*    */   private static int constructor-impl(int value) {
/*    */     return value;
/*    */   }
/*    */   
/*    */   public boolean equals(Object other) {
/*    */     return equals-impl(this.value, other);
/*    */   }
/*    */   
/*    */   public static boolean equals-impl(int arg0, Object other) {
/*    */     if (!(other instanceof StrongDirectionType))
/*    */       return false; 
/*    */     int i = ((StrongDirectionType)other).unbox-impl();
/*    */     return !(arg0 != i);
/*    */   }
/*    */   
/*    */   public final int getValue() {
/* 38 */     return this.value;
/*    */   } public int hashCode() { return hashCode-impl(this.value); } public static int hashCode-impl(int arg0) { return Integer.hashCode(arg0); } public String toString() { return toString-impl(this.value); } public static String toString-impl(int arg0) { return "StrongDirectionType(value=" + arg0 + ')'; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\b\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006R\031\020\n\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\013\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\f"}, d2 = {"Landroidx/compose/ui/text/StrongDirectionType$Companion;", "", "()V", "Ltr", "Landroidx/compose/ui/text/StrongDirectionType;", "getLtr-JKYp3V4", "()I", "I", "None", "getNone-JKYp3V4", "Rtl", "getRtl-JKYp3V4", "ui-text"}) public static final class Companion {
/* 40 */     private Companion() {} public final int getNone-JKYp3V4() { return StrongDirectionType.None; }
/* 41 */     public final int getLtr-JKYp3V4() { return StrongDirectionType.Ltr; }
/* 42 */     public final int getRtl-JKYp3V4() { return StrongDirectionType.Rtl; } } @NotNull public static final Companion Companion = new Companion(null); private final int value; private static final int None = constructor-impl(0); private static final int Ltr = constructor-impl(1); private static final int Rtl = constructor-impl(2);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\StrongDirectionType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */