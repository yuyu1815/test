/*     */ package org.jetbrains.jewel.bridge;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlinx.coroutines.flow.StateFlow;
/*     */ import kotlinx.coroutines.flow.StateFlowKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.bridge.theme.ScrollbarBridgeKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.ScrollbarVisibility;
/*     */ import org.jetbrains.jewel.ui.component.styling.TrackClickBehavior;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\bÂ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\032\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\b\n\000\032\004\b\007\020\bR\032\020\t\032\b\022\004\022\0020\n0\005X\004¢\006\b\n\000\032\004\b\013\020\b¨\006\f"}, d2 = {"Lorg/jetbrains/jewel/bridge/DummyScrollbarHelper;", "Lorg/jetbrains/jewel/bridge/ScrollbarHelper;", "<init>", "()V", "scrollbarVisibilityStyleFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;", "getScrollbarVisibilityStyleFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "trackClickBehaviorFlow", "Lorg/jetbrains/jewel/ui/component/styling/TrackClickBehavior;", "getTrackClickBehaviorFlow", "ide-laf-bridge"})
/*     */ final class DummyScrollbarHelper
/*     */   implements ScrollbarHelper
/*     */ {
/*     */   @NotNull
/*     */   public StateFlow<ScrollbarVisibility> getScrollbarVisibilityStyleFlow() {
/* 179 */     return scrollbarVisibilityStyleFlow; } @NotNull
/* 180 */   public static final DummyScrollbarHelper INSTANCE = new DummyScrollbarHelper(); @NotNull private static final StateFlow<ScrollbarVisibility> scrollbarVisibilityStyleFlow = (StateFlow<ScrollbarVisibility>)StateFlowKt.MutableStateFlow(ScrollbarBridgeKt.default(ScrollbarVisibility.AlwaysVisible.Companion)); @NotNull
/* 181 */   private static final StateFlow<TrackClickBehavior> trackClickBehaviorFlow = (StateFlow<TrackClickBehavior>)StateFlowKt.MutableStateFlow(TrackClickBehavior.JumpToSpot); @NotNull public StateFlow<TrackClickBehavior> getTrackClickBehaviorFlow() { return trackClickBehaviorFlow; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\DummyScrollbarHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */