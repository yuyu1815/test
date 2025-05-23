/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\013\n\002\b\t\bf\030\000*\004\b\000\020\0012\0020\002J\035\020\003\032\0020\0042\006\020\005\032\0028\0002\006\020\006\032\0028\000H&¢\006\002\020\007J'\020\b\032\004\030\0018\0002\006\020\t\032\0028\0002\006\020\n\032\0028\0002\006\020\013\032\0028\000H\026¢\006\002\020\fø\001\000\002\006\n\004\b!0\001¨\006\rÀ\006\003"}, d2 = {"Landroidx/compose/runtime/SnapshotMutationPolicy;", "T", "", "equivalent", "", "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "merge", "previous", "current", "applied", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "runtime"})
/*    */ public interface SnapshotMutationPolicy<T>
/*    */ {
/*    */   boolean equivalent(T paramT1, T paramT2);
/*    */   
/*    */   @Nullable
/*    */   default T merge(Object previous, Object current, Object applied) {
/* 57 */     return null; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48) public static final class DefaultImpls { @Deprecated @Nullable public static <T> T merge(@NotNull SnapshotMutationPolicy $this, Object previous, Object current, Object applied) { return $this.merge((T)previous, (T)current, (T)applied); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\SnapshotMutationPolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */