/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;
/*    */ 
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\020\b\n\002\b\007\n\002\030\002\n\002\b\002\n\002\020\021\n\002\020\000\n\002\b\005\032\030\020\005\032\0020\0012\006\020\006\032\0020\0012\006\020\007\032\0020\001H\000\032\024\020\b\032\b\022\004\022\002H\n0\t\"\004\b\000\020\nH\000\032\037\020\013\032\n\022\006\022\004\030\0010\r0\f2\b\020\016\032\004\030\0010\rH\000¢\006\002\020\017\032\020\020\020\032\0020\0012\006\020\021\032\0020\001H\000\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000\"\016\020\004\032\0020\001XT¢\006\002\n\000¨\006\022"}, d2 = {"LOG_MAX_BUFFER_SIZE", "", "MAX_BUFFER_SIZE", "MAX_BUFFER_SIZE_MINUS_ONE", "MUTABLE_BUFFER_SIZE", "indexSegment", "index", "shift", "persistentVectorOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "E", "presizedBufferWith", "", "", "element", "(Ljava/lang/Object;)[Ljava/lang/Object;", "rootSize", "vectorSize", "runtime"})
/*    */ public final class UtilsKt
/*    */ {
/*    */   public static final int MAX_BUFFER_SIZE = 32;
/*    */   public static final int LOG_MAX_BUFFER_SIZE = 5;
/*    */   public static final int MAX_BUFFER_SIZE_MINUS_ONE = 31;
/*    */   public static final int MUTABLE_BUFFER_SIZE = 33;
/*    */   
/*    */   @NotNull
/*    */   public static final <E> PersistentList<E> persistentVectorOf() {
/* 18 */     return SmallPersistentVector.Companion.getEMPTY();
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Object[] presizedBufferWith(@Nullable Object element) {
/* 24 */     Object[] buffer = new Object[32];
/* 25 */     buffer[0] = element;
/* 26 */     return buffer;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final int indexSegment(int index, int shift) {
/* 36 */     return index >> shift & 0x1F;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static final int rootSize(int vectorSize) {
/* 42 */     return vectorSize - 1 & 0xFFFFFFE0;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableList\UtilsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */