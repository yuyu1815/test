/*    */ package androidx.compose.ui.unit;
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
/*    */ @JvmInline
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\003\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\003\n\002\020\016\n\002\b\004\b@\030\000 \0232\0020\001:\001\023B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\006\032\0020\0072\b\020\b\032\004\030\0010\001HÖ\003¢\006\004\b\t\020\nJ\020\020\013\032\0020\fHÖ\001¢\006\004\b\r\020\016J\017\020\017\032\0020\020H\026¢\006\004\b\021\020\022R\016\020\002\032\0020\003X\004¢\006\002\n\000\001\002\001\0020\003¨\006\024"}, d2 = {"Landroidx/compose/ui/unit/TextUnitType;", "", "type", "", "constructor-impl", "(J)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit"})
/*    */ public final class TextUnitType
/*    */ {
/*    */   public static final boolean equals-impl0(long p1, long p2) {
/*    */     return (p1 == p2);
/*    */   }
/*    */   
/*    */   public static long constructor-impl(long type) {
/*    */     return type;
/*    */   }
/*    */   
/*    */   public boolean equals(Object other) {
/*    */     return equals-impl(this.type, other);
/*    */   }
/*    */   
/*    */   public static boolean equals-impl(long arg0, Object other) {
/*    */     if (!(other instanceof TextUnitType))
/*    */       return false; 
/*    */     long l = ((TextUnitType)other).unbox-impl();
/*    */     return !(arg0 != l);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return hashCode-impl(this.type);
/*    */   }
/*    */   
/*    */   public static int hashCode-impl(long arg0) {
/*    */     return Long.hashCode(arg0);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/* 48 */     return toString-impl(this.type); } @NotNull
/* 49 */   public static String toString-impl(long arg0) { long l = arg0; return 
/* 50 */       equals-impl0(l, Unspecified) ? "Unspecified" : (
/* 51 */       equals-impl0(l, Sp) ? "Sp" : (
/* 52 */       equals-impl0(l, Em) ? "Em" : 
/* 53 */       "Invalid")); }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\b\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006R\031\020\n\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\013\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\f"}, d2 = {"Landroidx/compose/ui/unit/TextUnitType$Companion;", "", "()V", "Em", "Landroidx/compose/ui/unit/TextUnitType;", "getEm-UIouoOA", "()J", "J", "Sp", "getSp-UIouoOA", "Unspecified", "getUnspecified-UIouoOA", "ui-unit"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/* 58 */     public final long getUnspecified-UIouoOA() { return TextUnitType.Unspecified; }
/* 59 */     public final long getSp-UIouoOA() { return TextUnitType.Sp; }
/* 60 */     public final long getEm-UIouoOA() { return TextUnitType.Em; } } private static final long Em = constructor-impl(8589934592L);
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long type;
/*    */   private static final long Unspecified = constructor-impl(0L);
/*    */   private static final long Sp = constructor-impl(4294967296L);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\TextUnitType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */