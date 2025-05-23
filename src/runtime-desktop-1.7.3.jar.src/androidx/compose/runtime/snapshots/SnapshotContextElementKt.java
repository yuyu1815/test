/*    */ package androidx.compose.runtime.snapshots;
/*    */ 
/*    */ import androidx.compose.runtime.ExperimentalComposeApi;
/*    */ import androidx.compose.runtime.SnapshotContextElementImpl;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\032\f\020\000\032\0020\001*\0020\002H\007¨\006\003"}, d2 = {"asContextElement", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Landroidx/compose/runtime/snapshots/Snapshot;", "runtime"})
/*    */ public final class SnapshotContextElementKt
/*    */ {
/*    */   @ExperimentalComposeApi
/*    */   @NotNull
/*    */   public static final SnapshotContextElement asContextElement(@NotNull Snapshot $this$asContextElement) {
/* 32 */     Intrinsics.checkNotNullParameter($this$asContextElement, "<this>"); return (SnapshotContextElement)new SnapshotContextElementImpl($this$asContextElement);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\SnapshotContextElementKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */