/*    */ package androidx.compose.animation.core;
/*    */ 
/*    */ import kotlin.KotlinNothingValueException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000(\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\020\016\n\002\b\002\n\002\020\000\n\002\b\006\n\002\020\001\n\000\032-\020\000\032\0020\0012\006\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\005H\bø\001\000\002\b\n\006\b\000\032\002\020\001\032@\020\007\032\002H\b\"\b\b\000\020\b*\0020\t2\b\020\002\032\004\030\001H\b2\f\020\004\032\b\022\004\022\0020\0060\005H\bø\001\000\002\n\n\b\b\000\032\004\b\003\020\001¢\006\002\020\n\032-\020\013\032\0020\0012\006\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\005H\bø\001\000\002\b\n\006\b\000\032\002\020\001\032\020\020\f\032\0020\0012\006\020\r\032\0020\006H\000\032\020\020\016\032\0020\0012\006\020\r\032\0020\006H\000\032\020\020\017\032\0020\0202\006\020\r\032\0020\006H\000\002\007\n\005\b20\001¨\006\021"}, d2 = {"checkPrecondition", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "checkPreconditionNotNull", "T", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "requirePrecondition", "throwIllegalArgumentException", "message", "throwIllegalStateException", "throwIllegalStateExceptionForNullCheck", "", "animation-core"})
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
/*    */   @NotNull
/*    */   public static final Void throwIllegalStateExceptionForNullCheck(@NotNull String message) {
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
/* 57 */     if (!value) {
/* 58 */       throwIllegalStateException((String)lazyMessage.invoke());
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final <T> T checkPreconditionNotNull(@Nullable Object value, @NotNull Function0 lazyMessage) {
/* 66 */     Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage"); int $i$f$checkPreconditionNotNull = 0;
/*    */ 
/*    */ 
/*    */     
/* 70 */     if (value == null) {
/* 71 */       throwIllegalStateExceptionForNullCheck((String)lazyMessage.invoke()); throw new KotlinNothingValueException();
/*    */     } 
/* 73 */     return (T)value;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\PreconditionsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */