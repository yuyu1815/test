/*    */ package androidx.compose.runtime.tooling;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\034\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\004\bf\030\0002\0020\001J\022\020\n\032\004\030\0010\0042\006\020\013\032\0020\001H\026R\030\020\002\032\b\022\004\022\0020\0040\003X¦\004¢\006\006\032\004\b\005\020\006R\022\020\007\032\0020\bX¦\004¢\006\006\032\004\b\007\020\tø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Landroidx/compose/runtime/tooling/CompositionData;", "", "compositionGroups", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "getCompositionGroups", "()Ljava/lang/Iterable;", "isEmpty", "", "()Z", "find", "identityToFind", "runtime"})
/*    */ public interface CompositionData
/*    */ {
/*    */   @NotNull
/*    */   Iterable<CompositionGroup> getCompositionGroups();
/*    */   
/*    */   boolean isEmpty();
/*    */   
/*    */   @Nullable
/*    */   default CompositionGroup find(@NotNull Object identityToFind) {
/* 49 */     Intrinsics.checkNotNullParameter(identityToFind, "identityToFind"); return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\tooling\CompositionData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */