/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\031\n\000\n\002\020\002\n\002\b\002\bÀ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\004\032\0020\005J\016\020\006\032\0020\0072\006\020\b\032\0020\005¨\006\t"}, d2 = {"Lkotlinx/serialization/json/internal/CharArrayPoolBatchSize;", "Lkotlinx/serialization/json/internal/CharArrayPoolBase;", "<init>", "()V", "take", "", "release", "", "array", "kotlinx-serialization-json"})
/*    */ @SourceDebugExtension({"SMAP\nArrayPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayPools.kt\nkotlinx/serialization/json/internal/CharArrayPoolBatchSize\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/*    */ public final class CharArrayPoolBatchSize
/*    */   extends CharArrayPoolBase
/*    */ {
/*    */   @NotNull
/*    */   public static final CharArrayPoolBatchSize INSTANCE = new CharArrayPoolBatchSize();
/*    */   
/*    */   @NotNull
/*    */   public final char[] take() {
/* 46 */     return take(16384);
/*    */   }
/*    */   public final void release(@NotNull char[] array) {
/* 49 */     Intrinsics.checkNotNullParameter(array, "array"); if (!((array.length == 16384) ? 1 : 0)) {
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
/* 91 */       int $i$a$-require-CharArrayPoolBatchSize$release$1 = 0;
/*    */       String str = "Inconsistent internal invariant: unexpected array size " + array.length;
/*    */       throw new IllegalArgumentException(str.toString());
/*    */     } 
/*    */     releaseImpl(array);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\CharArrayPoolBatchSize.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */