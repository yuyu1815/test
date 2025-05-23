/*    */ package androidx.compose.ui.geometry;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\020\t\n\002\b\b\n\002\020\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\020\016\n\002\b\003\032-\020\t\032\0020\n2\006\020\013\032\0020\f2\f\020\r\032\b\022\004\022\0020\0170\016H\bø\001\000\002\b\n\006\b\000\032\002\020\001\032\020\020\020\032\0020\n2\006\020\021\032\0020\017H\000\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000\"\016\020\004\032\0020\001XT¢\006\002\n\000\"\016\020\005\032\0020\001XT¢\006\002\n\000\"\016\020\006\032\0020\001XT¢\006\002\n\000\"\016\020\007\032\0020\001XT¢\006\002\n\000\"\016\020\b\032\0020\001XT¢\006\002\n\000\002\007\n\005\b20\001¨\006\022"}, d2 = {"DualFirstNaN", "", "DualFloatInfinityBase", "DualFloatSignBit", "DualUnsignedFloatMask", "FloatInfinityBase", "Uint64High32", "Uint64Low32", "UnspecifiedPackedFloats", "checkPrecondition", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "throwIllegalStateException", "message", "ui-geometry"})
/*    */ public final class InlineClassHelperKt
/*    */ {
/*    */   public static final long DualUnsignedFloatMask = 9223372034707292159L;
/*    */   public static final long FloatInfinityBase = 2139095040L;
/*    */   public static final long DualFloatInfinityBase = 9187343241974906880L;
/*    */   public static final long UnspecifiedPackedFloats = 9205357640488583168L;
/*    */   public static final long DualFloatSignBit = -9223372034707292160L;
/*    */   public static final long Uint64High32 = -9223372034707292160L;
/*    */   public static final long Uint64Low32 = 4294967297L;
/*    */   public static final long DualFirstNaN = 9187343246269874177L;
/*    */   
/*    */   public static final void throwIllegalStateException(@NotNull String message) {
/* 46 */     Intrinsics.checkNotNullParameter(message, "message"); throw new IllegalStateException(message);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static final void checkPrecondition(boolean value, @NotNull Function0 lazyMessage) {
/* 52 */     Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage"); int $i$f$checkPrecondition = 0;
/*    */ 
/*    */     
/* 55 */     if (!value)
/* 56 */       throwIllegalStateException((String)lazyMessage.invoke()); 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-geometry-desktop-1.7.3.jar!\androidx\compos\\ui\geometry\InlineClassHelperKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */