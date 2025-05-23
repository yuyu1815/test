/*      */ package androidx.compose.runtime.changelist;
/*      */ 
/*      */ import androidx.compose.runtime.Anchor;
/*      */ import androidx.compose.runtime.Applier;
/*      */ import androidx.compose.runtime.ComposerKt;
/*      */ import androidx.compose.runtime.CompositionContext;
/*      */ import androidx.compose.runtime.ControlledComposition;
/*      */ import androidx.compose.runtime.InvalidationResult;
/*      */ import androidx.compose.runtime.MovableContentState;
/*      */ import androidx.compose.runtime.MovableContentStateReference;
/*      */ import androidx.compose.runtime.RecomposeScopeImpl;
/*      */ import androidx.compose.runtime.RecomposeScopeOwner;
/*      */ import androidx.compose.runtime.SlotTable;
/*      */ import androidx.compose.runtime.SlotWriter;
/*      */ import java.util.List;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.TuplesKt;
/*      */ import kotlin.collections.CollectionsKt;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000:\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\002\032(\020\004\032\0020\0012\006\020\002\032\0020\0032\006\020\005\032\0020\0062\016\020\007\032\n\022\006\022\004\030\0010\t0\bH\002\032(\020\n\032\0020\0132\006\020\002\032\0020\0032\016\020\007\032\n\022\006\022\004\030\0010\t0\b2\006\020\f\032\0020\001H\002\032(\020\r\032\0020\0132\006\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\0232\006\020\002\032\0020\003H\002¨\006\024"}, d2 = {"currentNodeIndex", "", "slots", "Landroidx/compose/runtime/SlotWriter;", "positionToInsert", "anchor", "Landroidx/compose/runtime/Anchor;", "applier", "Landroidx/compose/runtime/Applier;", "", "positionToParentOf", "", "index", "releaseMovableGroupAtCurrent", "composition", "Landroidx/compose/runtime/ControlledComposition;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "reference", "Landroidx/compose/runtime/MovableContentStateReference;", "runtime"})
/*      */ @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,993:1\n177#2,5:994\n183#2,3:1000\n177#2,5:1003\n183#2,3:1009\n1#3:999\n1#3:1008\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n*L\n925#1:994,5\n925#1:1000,3\n983#1:1003,5\n983#1:1009,3\n925#1:999\n983#1:1008\n*E\n"})
/*      */ public final class OperationKt
/*      */ {
/*      */   private static final void positionToParentOf(SlotWriter slots, Applier applier, int index) {
/*  845 */     while (!slots.indexInParent(index)) {
/*  846 */       slots.skipToGroupEnd();
/*  847 */       if (slots.isNode(slots.getParent())) applier.up(); 
/*  848 */       slots.endGroup();
/*      */     } 
/*      */   }
/*      */   
/*      */   private static final int currentNodeIndex(SlotWriter slots) {
/*  853 */     int original = slots.getCurrentGroup();
/*      */ 
/*      */     
/*  856 */     int current = slots.getParent();
/*  857 */     while (current >= 0 && !slots.isNode(current)) {
/*  858 */       current = slots.parent(current);
/*      */     }
/*      */     
/*  861 */     int index = 0;
/*  862 */     current++;
/*  863 */     while (current < original) {
/*  864 */       if (slots.indexInGroup(original, current)) {
/*  865 */         if (slots.isNode(current)) index = 0; 
/*  866 */         current++; continue;
/*      */       } 
/*  868 */       index += slots.isNode(current) ? 1 : slots.nodeCount(current);
/*  869 */       current += slots.groupSize(current);
/*      */     } 
/*      */     
/*  872 */     return index;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final int positionToInsert(SlotWriter slots, Anchor anchor, Applier<Object> applier) {
/*  880 */     int destination = slots.anchorIndex(anchor);
/*  881 */     ComposerKt.runtimeCheck((slots.getCurrentGroup() < destination));
/*  882 */     positionToParentOf(slots, applier, destination);
/*  883 */     int nodeIndex = currentNodeIndex(slots);
/*  884 */     while (slots.getCurrentGroup() < destination) {
/*      */       
/*  886 */       if (slots.indexInCurrentGroup(destination)) {
/*  887 */         if (slots.isNode()) {
/*  888 */           applier.down(slots.node(slots.getCurrentGroup()));
/*  889 */           nodeIndex = 0;
/*      */         } 
/*  891 */         slots.startGroup(); continue;
/*      */       } 
/*  893 */       nodeIndex += slots.skipGroup();
/*      */     } 
/*      */ 
/*      */     
/*  897 */     ComposerKt.runtimeCheck((slots.getCurrentGroup() == destination));
/*  898 */     return nodeIndex;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final void releaseMovableGroupAtCurrent(ControlledComposition composition, CompositionContext parentContext, MovableContentStateReference reference, SlotWriter slots) {
/*      */     List list1;
/*  912 */     SlotTable slotTable = new SlotTable();
/*  913 */     if (slots.getCollectingSourceInformation()) {
/*  914 */       slotTable.collectSourceInformation();
/*      */     }
/*  916 */     if (slots.getCollectingCalledInformation()) {
/*  917 */       slotTable.collectCalledByInformation();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  925 */     SlotTable this_$iv = slotTable; int $i$f$write = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  995 */     SlotWriter writer$iv = this_$iv.openWriter(); int $i$a$-let-SlotTable$write$1$iv = 0;
/*  996 */     boolean normalClose$iv = false;
/*      */     
/*  998 */     try { SlotWriter writer = writer$iv; int $i$a$-write-OperationKt$releaseMovableGroupAtCurrent$anchors$1 = 0; writer.beginInsert(); writer.startGroup(126665345, reference.getContent$runtime()); SlotWriter.markGroup$default(writer, 0, 1, null); writer.update(reference.getParameter$runtime()); List list = slots.moveTo(reference.getAnchor$runtime(), 1, writer); writer.skipGroup(); writer.endGroup(); writer.endInsert(); Object it$iv = list1 = list;
/*  999 */       int $i$a$-also-SlotTable$write$1$1$iv = 0; normalClose$iv = true; list1 = list1; }
/* 1000 */     finally { writer$iv.close(normalClose$iv); }  List anchors = list1; MovableContentState state = new MovableContentState(slotTable); if (RecomposeScopeImpl.Companion.hasAnchoredRecomposeScopes$runtime(slotTable, anchors)) {
/*      */       OperationKt$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$1 movableContentRecomposeScopeOwner = new OperationKt$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$1(composition, reference);
/*      */       SlotTable slotTable1 = slotTable;
/*      */       int i = 0;
/* 1004 */       SlotWriter slotWriter = slotTable1.openWriter(); int j = 0;
/* 1005 */       boolean bool = false;
/*      */     } 
/*      */     parentContext.movableContentStateReleased$runtime(reference, state);
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000%\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\002\n\002\b\003*\001\000\b\n\030\0002\0020\001J\032\020\002\032\0020\0032\006\020\004\032\0020\0052\b\020\006\032\004\030\0010\007H\026J\020\020\b\032\0020\t2\006\020\004\032\0020\005H\026J\020\020\n\032\0020\t2\006\020\013\032\0020\007H\026¨\006\f"}, d2 = {"androidx/compose/runtime/changelist/OperationKt$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$1", "Landroidx/compose/runtime/RecomposeScopeOwner;", "invalidate", "Landroidx/compose/runtime/InvalidationResult;", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "instance", "", "recomposeScopeReleased", "", "recordReadOf", "value", "runtime"})
/*      */   public static final class OperationKt$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$1 implements RecomposeScopeOwner {
/*      */     OperationKt$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$1(ControlledComposition $composition, MovableContentStateReference $reference) {}
/*      */     
/*      */     @NotNull
/*      */     public InvalidationResult invalidate(@NotNull RecomposeScopeImpl scope, @Nullable Object instance) {
/*      */       Intrinsics.checkNotNullParameter(scope, "scope");
/*      */       ControlledComposition controlledComposition = this.$composition;
/*      */       if (((controlledComposition instanceof RecomposeScopeOwner) ? controlledComposition : null) == null || ((controlledComposition instanceof RecomposeScopeOwner) ? controlledComposition : null).invalidate(scope, instance) == null)
/*      */         ((controlledComposition instanceof RecomposeScopeOwner) ? controlledComposition : null).invalidate(scope, instance); 
/*      */       InvalidationResult result = InvalidationResult.IGNORED;
/*      */       if (result == InvalidationResult.IGNORED) {
/*      */         MovableContentStateReference movableContentStateReference = this.$reference;
/*      */         movableContentStateReference.setInvalidations$runtime(CollectionsKt.plus(movableContentStateReference.getInvalidations$runtime(), TuplesKt.to(scope, instance)));
/*      */         return InvalidationResult.SCHEDULED;
/*      */       } 
/*      */       return result;
/*      */     }
/*      */     
/*      */     public void recomposeScopeReleased(@NotNull RecomposeScopeImpl scope) {
/*      */       Intrinsics.checkNotNullParameter(scope, "scope");
/*      */     }
/*      */     
/*      */     public void recordReadOf(@NotNull Object value) {
/*      */       Intrinsics.checkNotNullParameter(value, "value");
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\changelist\OperationKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */