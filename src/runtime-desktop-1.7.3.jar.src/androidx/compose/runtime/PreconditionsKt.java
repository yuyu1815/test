/*    */ package androidx.compose.runtime;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\020\016\n\002\b\005\032\034\020\000\032\0020\0012\006\020\002\032\0020\003H\b\002\b\n\006\b\000\032\002\020\001\032-\020\000\032\0020\0012\006\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\005H\bø\001\000\002\b\n\006\b\000\032\002\020\001\032-\020\007\032\0020\0012\006\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\005H\bø\001\000\002\b\n\006\b\000\032\002\020\001\032\020\020\b\032\0020\0012\006\020\t\032\0020\006H\000\032\020\020\n\032\0020\0012\006\020\t\032\0020\006H\000\002\007\n\005\b20\001¨\006\013"}, d2 = {"checkPrecondition", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "requirePrecondition", "throwIllegalArgumentException", "message", "throwIllegalStateException", "runtime"})
/*    */ public final class PreconditionsKt
/*    */ {
/*    */   public static final void throwIllegalArgumentException(@NotNull String message) {
/* 26 */     Intrinsics.checkNotNullParameter(message, "message"); throw new IllegalArgumentException(message);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final void requirePrecondition(boolean value, @NotNull Function0 lazyMessage) {
/* 33 */     Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage"); int $i$f$requirePrecondition = 0;
/*    */ 
/*    */     
/* 36 */     if (!value) {
/* 37 */       throwIllegalArgumentException((String)lazyMessage.invoke());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public static final void throwIllegalStateException(@NotNull String message) {
/* 43 */     Intrinsics.checkNotNullParameter(message, "message"); throw new IllegalStateException(message);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final void checkPrecondition(boolean value, @NotNull Function0 lazyMessage) {
/* 50 */     Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage"); int $i$f$checkPrecondition = 0;
/*    */ 
/*    */     
/* 53 */     if (!value) {
/* 54 */       throwIllegalStateException((String)lazyMessage.invoke());
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static final void checkPrecondition(boolean value) {
/* 61 */     int $i$f$checkPrecondition = 0;
/*    */ 
/*    */     
/* 64 */     if (!value)
/* 65 */       throwIllegalStateException("Check failed."); 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\PreconditionsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */