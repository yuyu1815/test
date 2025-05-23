/*    */ package androidx.lifecycle;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\006\bf\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\007\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\b\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\t\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\n\032\0020\0032\006\020\004\032\0020\005H\026ø\001\000\002\006\n\004\b!0\001¨\006\013À\006\001"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "onCreate", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDestroy", "onPause", "onResume", "onStart", "onStop", "lifecycle-common"})
/*    */ public interface DefaultLifecycleObserver
/*    */   extends LifecycleObserver
/*    */ {
/*    */   default void onCreate(@NotNull LifecycleOwner owner) {
/* 38 */     Intrinsics.checkNotNullParameter(owner, "owner");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   default void onStart(@NotNull LifecycleOwner owner) {
/* 48 */     Intrinsics.checkNotNullParameter(owner, "owner");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   default void onResume(@NotNull LifecycleOwner owner) {
/* 59 */     Intrinsics.checkNotNullParameter(owner, "owner");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   default void onPause(@NotNull LifecycleOwner owner) {
/* 70 */     Intrinsics.checkNotNullParameter(owner, "owner");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   default void onStop(@NotNull LifecycleOwner owner) {
/* 81 */     Intrinsics.checkNotNullParameter(owner, "owner");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   default void onDestroy(@NotNull LifecycleOwner owner) {
/* 92 */     Intrinsics.checkNotNullParameter(owner, "owner");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-common-jvm-2.8.5.jar!\androidx\lifecycle\DefaultLifecycleObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */