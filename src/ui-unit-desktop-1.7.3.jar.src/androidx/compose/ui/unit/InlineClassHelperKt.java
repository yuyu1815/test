/*    */ package androidx.compose.ui.unit;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\020\t\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\020\016\n\002\b\005\032-\020\002\032\0020\0032\006\020\004\032\0020\0052\f\020\006\032\b\022\004\022\0020\b0\007H\bø\001\000\002\b\n\006\b\000\032\002\020\001\032-\020\t\032\0020\0032\006\020\004\032\0020\0052\f\020\006\032\b\022\004\022\0020\b0\007H\bø\001\000\002\b\n\006\b\000\032\002\020\001\032\020\020\n\032\0020\0032\006\020\013\032\0020\bH\000\032\020\020\f\032\0020\0032\006\020\013\032\0020\bH\000\"\016\020\000\032\0020\001XT¢\006\002\n\000\002\007\n\005\b20\001¨\006\r"}, d2 = {"DualFloatSignBit", "", "checkPrecondition", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "requirePrecondition", "throwIllegalArgumentException", "message", "throwIllegalStateException", "ui-unit"})
/*    */ public final class InlineClassHelperKt
/*    */ {
/*    */   public static final long DualFloatSignBit = -9223372034707292160L;
/*    */   
/*    */   public static final void throwIllegalArgumentException(@NotNull String message) {
/* 30 */     Intrinsics.checkNotNullParameter(message, "message"); throw new IllegalArgumentException(message);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final void requirePrecondition(boolean value, @NotNull Function0 lazyMessage) {
/* 37 */     Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage"); int $i$f$requirePrecondition = 0;
/*    */ 
/*    */     
/* 40 */     if (!value) {
/* 41 */       throwIllegalArgumentException((String)lazyMessage.invoke());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public static final void throwIllegalStateException(@NotNull String message) {
/* 47 */     Intrinsics.checkNotNullParameter(message, "message"); throw new IllegalStateException(message);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final void checkPrecondition(boolean value, @NotNull Function0 lazyMessage) {
/* 54 */     Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage"); int $i$f$checkPrecondition = 0;
/*    */ 
/*    */     
/* 57 */     if (!value)
/* 58 */       throwIllegalStateException((String)lazyMessage.invoke()); 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\InlineClassHelperKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */