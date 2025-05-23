/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\031\n\000\n\002\020\002\n\002\b\002\bÀ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\004\032\0020\005J\016\020\006\032\0020\0072\006\020\b\032\0020\005¨\006\t"}, d2 = {"Lkotlinx/serialization/json/internal/CharArrayPool;", "Lkotlinx/serialization/json/internal/CharArrayPoolBase;", "<init>", "()V", "take", "", "release", "", "array", "kotlinx-serialization-json"})
/*    */ public final class CharArrayPool
/*    */   extends CharArrayPoolBase
/*    */ {
/*    */   @NotNull
/*    */   public static final CharArrayPool INSTANCE = new CharArrayPool();
/*    */   
/*    */   @NotNull
/*    */   public final char[] take() {
/* 37 */     return take(128);
/*    */   }
/*    */   public final void release(@NotNull char[] array) {
/* 40 */     Intrinsics.checkNotNullParameter(array, "array"); releaseImpl(array);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\CharArrayPool.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */