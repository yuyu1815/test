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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\013\n\002\b\003\n\002\020\016\n\000\bÂ\002\030\0002\n\022\006\022\004\030\0010\0020\001B\007\b\002¢\006\002\020\003J\034\020\004\032\0020\0052\b\020\006\032\004\030\0010\0022\b\020\007\032\004\030\0010\002H\026J\b\020\b\032\0020\tH\026¨\006\n"}, d2 = {"Landroidx/compose/runtime/ReferentialEqualityPolicy;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "", "()V", "equivalent", "", "a", "b", "toString", "", "runtime"})
/*    */ final class ReferentialEqualityPolicy
/*    */   implements SnapshotMutationPolicy<Object>
/*    */ {
/*    */   @NotNull
/*    */   public static final ReferentialEqualityPolicy INSTANCE = new ReferentialEqualityPolicy();
/*    */   
/*    */   public boolean equivalent(@Nullable Object a, @Nullable Object b) {
/* 72 */     return (a == b); } @NotNull
/*    */   public String toString() {
/* 74 */     return "ReferentialEqualityPolicy";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\ReferentialEqualityPolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */