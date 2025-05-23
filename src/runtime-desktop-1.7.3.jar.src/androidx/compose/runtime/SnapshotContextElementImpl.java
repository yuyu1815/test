/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.runtime.snapshots.Snapshot;
/*    */ import androidx.compose.runtime.snapshots.SnapshotContextElement;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.ThreadContextElement;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\003\b\001\030\0002\0020\0012\n\022\006\022\004\030\0010\0030\002B\r\022\006\020\004\032\0020\003¢\006\002\020\005J\032\020\n\032\0020\0132\006\020\f\032\0020\r2\b\020\016\032\004\030\0010\003H\026J\022\020\017\032\004\030\0010\0032\006\020\f\032\0020\rH\026R\030\020\006\032\006\022\002\b\0030\0078VX\004¢\006\006\032\004\b\b\020\tR\016\020\004\032\0020\003X\004¢\006\002\n\000¨\006\020"}, d2 = {"Landroidx/compose/runtime/SnapshotContextElementImpl;", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Lkotlinx/coroutines/ThreadContextElement;", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "updateThreadContext", "runtime"})
/*    */ @ExperimentalComposeApi
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class SnapshotContextElementImpl
/*    */   implements SnapshotContextElement, ThreadContextElement<Snapshot>
/*    */ {
/*    */   @NotNull
/*    */   private final Snapshot snapshot;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public <R> R fold(Object initial, @NotNull Function2 operation) {
/*    */     return (R)SnapshotContextElement.DefaultImpls.fold(this, initial, operation);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key key) {
/*    */     return (E)SnapshotContextElement.DefaultImpls.get(this, key);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public CoroutineContext minusKey(@NotNull CoroutineContext.Key key) {
/*    */     return SnapshotContextElement.DefaultImpls.minusKey(this, key);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public CoroutineContext plus(@NotNull CoroutineContext context) {
/*    */     return SnapshotContextElement.DefaultImpls.plus(this, context);
/*    */   }
/*    */   
/*    */   public SnapshotContextElementImpl(@NotNull Snapshot snapshot) {
/* 59 */     this.snapshot = snapshot;
/*    */   } @NotNull
/*    */   public CoroutineContext.Key<?> getKey() {
/* 62 */     return (CoroutineContext.Key)SnapshotContextElement.Key;
/*    */   } @Nullable
/*    */   public Snapshot updateThreadContext(@NotNull CoroutineContext context) {
/* 65 */     Intrinsics.checkNotNullParameter(context, "context"); return this.snapshot.unsafeEnter();
/*    */   }
/*    */   public void restoreThreadContext(@NotNull CoroutineContext context, @Nullable Snapshot oldState) {
/* 68 */     Intrinsics.checkNotNullParameter(context, "context"); this.snapshot.unsafeLeave(oldState);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\SnapshotContextElementImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */