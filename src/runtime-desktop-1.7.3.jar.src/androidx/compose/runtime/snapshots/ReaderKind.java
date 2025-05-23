/*    */ package androidx.compose.runtime.snapshots;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\n\n\002\020\016\n\002\b\007\b@\030\000 \0322\0020\001:\001\032B\021\022\b\b\002\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\b\032\0020\t2\b\020\n\032\004\030\0010\001HÖ\003¢\006\004\b\013\020\fJ\020\020\r\032\0020\003HÖ\001¢\006\004\b\016\020\005J\033\020\017\032\0020\t2\006\020\020\032\0020\000H\bø\001\000¢\006\004\b\021\020\022J\020\020\023\032\0020\024HÖ\001¢\006\004\b\025\020\026J\033\020\027\032\0020\0002\006\020\020\032\0020\000H\bø\001\000¢\006\004\b\030\020\031R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007\001\002\002\007\n\005\b¡\0360\001¨\006\033"}, d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind;", "", "mask", "", "constructor-impl", "(I)I", "getMask", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isReadIn", "reader", "isReadIn-h_f27i8", "(II)Z", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "withReadIn", "withReadIn-3QSx2Dw", "(II)I", "Companion", "runtime"})
/*    */ public final class ReaderKind
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final int mask;
/*    */   
/*    */   public final int getMask() {
/* 44 */     return this.mask;
/*    */   }
/* 46 */   public static final int withReadIn-3QSx2Dw(int arg0, int reader) { int $i$f$withReadIn-3QSx2Dw = 0; return constructor-impl(arg0 | reader); }
/*    */   public static String toString-impl(int arg0) { return "ReaderKind(mask=" + arg0 + ')'; }
/* 48 */   public String toString() { return toString-impl(this.mask); } public static int hashCode-impl(int arg0) { return Integer.hashCode(arg0); } public int hashCode() { return hashCode-impl(this.mask); } public static final boolean isReadIn-h_f27i8(int arg0, int reader) { int $i$f$isReadIn-h_f27i8 = 0; return ((arg0 & reader) != 0); }
/*    */   public static boolean equals-impl(int arg0, Object other) { if (!(other instanceof ReaderKind)) return false;  int i = ((ReaderKind)other).unbox-impl(); return !(arg0 != i); } public boolean equals(Object other) { return equals-impl(this.mask, other); } public static int constructor-impl(int mask) { return mask; } public static final boolean equals-impl0(int p1, int p2) { return (p1 == p2); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\007\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\030\020\003\032\0020\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\005\020\006R\030\020\007\032\0020\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\b\020\006R\030\020\t\032\0020\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\n\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\013"}, d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind$Companion;", "", "()V", "Composition", "Landroidx/compose/runtime/snapshots/ReaderKind;", "getComposition-6f8NoZ8", "()I", "SnapshotFlow", "getSnapshotFlow-6f8NoZ8", "SnapshotStateObserver", "getSnapshotStateObserver-6f8NoZ8", "runtime"}) public static final class Companion
/*    */   {
/* 51 */     private Companion() {} public final int getComposition-6f8NoZ8() { int $i$f$getComposition-6f8NoZ8 = 0; return ReaderKind.constructor-impl(1); }
/* 52 */     public final int getSnapshotStateObserver-6f8NoZ8() { int $i$f$getSnapshotStateObserver-6f8NoZ8 = 0; return ReaderKind.constructor-impl(2); } public final int getSnapshotFlow-6f8NoZ8() {
/* 53 */       int $i$f$getSnapshotFlow-6f8NoZ8 = 0; return ReaderKind.constructor-impl(4);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\ReaderKind.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */