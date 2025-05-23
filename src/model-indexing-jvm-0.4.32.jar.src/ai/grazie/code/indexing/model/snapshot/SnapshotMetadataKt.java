/*    */ package ai.grazie.code.indexing.model.snapshot;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\032\n\020\000\032\0020\001*\0020\002¨\006\003"}, d2 = {"toJS", "Lai/grazie/code/indexing/model/snapshot/JSSnapshotMetadata;", "Lai/grazie/code/indexing/model/snapshot/SnapshotMetadata;", "model-indexing"})
/*    */ public final class SnapshotMetadataKt
/*    */ {
/*    */   @NotNull
/*    */   public static final JSSnapshotMetadata toJS(@NotNull SnapshotMetadata $this$toJS) {
/* 26 */     Intrinsics.checkNotNullParameter($this$toJS, "<this>"); return new JSSnapshotMetadata($this$toJS.getSnapshot(), $this$toJS.getCreatedAt(), (int)$this$toJS.getClusters(), $this$toJS.getCompleted(), $this$toJS.getCompletionPercent-pVg5ArA());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\snapshot\SnapshotMetadataKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */