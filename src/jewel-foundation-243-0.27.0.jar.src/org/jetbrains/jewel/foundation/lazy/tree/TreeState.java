/*    */ package org.jetbrains.jewel.foundation.lazy.tree;
/*    */ 
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.runtime.State;
/*    */ import java.util.Set;
/*    */ import kotlin.collections.SetsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListState;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000j\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\020\000\n\002\020\b\n\002\b\003\n\002\020\"\n\002\b\b\n\002\020\002\n\002\b\002\n\002\020 \n\000\n\002\020\007\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\r\b\007\030\0002\0020\0012\0020\002B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006J\016\020\031\032\0020\0322\006\020\033\032\0020\fJ\024\020\022\032\0020\0322\f\020\034\032\b\022\004\022\0020\f0\035J\021\020\036\032\0020\0372\006\020 \032\0020\037H\001J?\020!\032\0020\0322\006\020\"\032\0020#2'\020$\032#\b\001\022\004\022\0020&\022\n\022\b\022\004\022\0020\0320'\022\006\022\004\030\0010\f0%¢\006\002\b(HA¢\006\002\020)R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\007\020\bR&\020\t\032\024\022\020\022\016\022\004\022\0020\f\022\004\022\0020\r0\0130\nX\004¢\006\b\n\000\032\004\b\016\020\017R7\020\022\032\b\022\004\022\0020\f0\0212\f\020\020\032\b\022\004\022\0020\f0\0218F@FX\002¢\006\022\n\004\b\027\020\030\032\004\b\023\020\024\"\004\b\025\020\026R\024\020*\032\0020+8VX\005¢\006\006\032\004\b,\020-R\024\020.\032\0020+8VX\005¢\006\006\032\004\b/\020-R\022\0200\032\0020+X\005¢\006\006\032\004\b0\020-R\024\0201\032\0020+8VX\005¢\006\006\032\004\b2\020-R\024\0203\032\0020+8VX\005¢\006\006\032\004\b4\020-R\036\0205\032\b\022\004\022\0020\f0\021X\017¢\006\f\032\004\b6\020\024\"\004\b7\020\026¨\0068"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableScope;", "Landroidx/compose/foundation/gestures/ScrollableState;", "delegate", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;", "<init>", "(Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;)V", "getDelegate$foundation", "()Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;", "allNodes", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lkotlin/Pair;", "", "", "getAllNodes$foundation", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "<set-?>", "", "openNodes", "getOpenNodes", "()Ljava/util/Set;", "setOpenNodes", "(Ljava/util/Set;)V", "openNodes$delegate", "Landroidx/compose/runtime/MutableState;", "toggleNode", "", "nodeId", "nodes", "", "dispatchRawDelta", "", "delta", "scroll", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canScrollBackward", "", "getCanScrollBackward", "()Z", "canScrollForward", "getCanScrollForward", "isScrollInProgress", "lastScrolledBackward", "getLastScrolledBackward", "lastScrolledForward", "getLastScrolledForward", "selectedKeys", "getSelectedKeys", "setSelectedKeys", "foundation"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nTreeState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeState.kt\norg/jetbrains/jewel/foundation/lazy/tree/TreeState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,38:1\n81#2:39\n107#2,2:40\n*S KotlinDebug\n*F\n+ 1 TreeState.kt\norg/jetbrains/jewel/foundation/lazy/tree/TreeState\n*L\n24#1:39\n24#1:40,2\n*E\n"})
/*    */ public final class TreeState implements SelectableScope, ScrollableState {
/*    */   @NotNull
/*    */   private final SelectableLazyListState delegate;
/*    */   @NotNull
/*    */   private final SnapshotStateList<Pair<Object, Integer>> allNodes;
/*    */   
/* 20 */   public TreeState(@NotNull SelectableLazyListState delegate) { this.delegate = delegate;
/*    */     
/* 22 */     this.allNodes = SnapshotStateKt.mutableStateListOf();
/*    */     
/* 24 */     this.openNodes$delegate = SnapshotStateKt.mutableStateOf$default(SetsKt.emptySet(), null, 2, null); } @NotNull private final MutableState openNodes$delegate; public static final int $stable = 8; @NotNull public final SelectableLazyListState getDelegate$foundation() { return this.delegate; } @NotNull public final SnapshotStateList<Pair<Object, Integer>> getAllNodes$foundation() { return this.allNodes; } @NotNull public final Set<Object> getOpenNodes() { State state = (State)this.openNodes$delegate; KProperty property$iv = null; int $i$f$getValue = 0; return 
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
/* 39 */       (Set<Object>)state.getValue(); } public final void setOpenNodes(@NotNull Set <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); MutableState mutableState = this.openNodes$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 40 */     mutableState.setValue(<set-?>); }
/*    */ 
/*    */   
/*    */   public final void toggleNode(@NotNull Object nodeId) {
/*    */     Intrinsics.checkNotNullParameter(nodeId, "nodeId");
/*    */     if (getOpenNodes().contains(nodeId)) {
/*    */       setOpenNodes(SetsKt.minus(getOpenNodes(), nodeId));
/*    */     } else {
/*    */       setOpenNodes(SetsKt.plus(getOpenNodes(), nodeId));
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void openNodes(@NotNull List nodes) {
/*    */     Intrinsics.checkNotNullParameter(nodes, "nodes");
/*    */     setOpenNodes(SetsKt.plus(getOpenNodes(), nodes));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Set<Object> getSelectedKeys() {
/*    */     return this.delegate.getSelectedKeys();
/*    */   }
/*    */   
/*    */   public void setSelectedKeys(@NotNull Set <set-?>) {
/*    */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */     this.delegate.setSelectedKeys(<set-?>);
/*    */   }
/*    */   
/*    */   public float dispatchRawDelta(float delta) {
/*    */     return this.delegate.dispatchRawDelta(delta);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object scroll(@NotNull MutatePriority scrollPriority, @NotNull Function2 block, @NotNull Continuation $completion) {
/*    */     return this.delegate.scroll(scrollPriority, block, $completion);
/*    */   }
/*    */   
/*    */   public boolean getCanScrollBackward() {
/*    */     return this.delegate.getCanScrollBackward();
/*    */   }
/*    */   
/*    */   public boolean getCanScrollForward() {
/*    */     return this.delegate.getCanScrollForward();
/*    */   }
/*    */   
/*    */   public boolean isScrollInProgress() {
/*    */     return this.delegate.isScrollInProgress();
/*    */   }
/*    */   
/*    */   public boolean getLastScrolledBackward() {
/*    */     return this.delegate.getLastScrolledBackward();
/*    */   }
/*    */   
/*    */   public boolean getLastScrolledForward() {
/*    */     return this.delegate.getLastScrolledForward();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\TreeState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */