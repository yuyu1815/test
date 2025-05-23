/*    */ package org.jetbrains.jewel.bridge;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlinx.coroutines.flow.StateFlow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skiko.OS;
/*    */ import org.jetbrains.skiko.OsArch_jvmKt;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\b`\030\000 \n2\0020\001:\001\nR\030\020\002\032\b\022\004\022\0020\0040\003X¦\004¢\006\006\032\004\b\005\020\006R\030\020\007\032\b\022\004\022\0020\b0\003X¦\004¢\006\006\032\004\b\t\020\006¨\006\013"}, d2 = {"Lorg/jetbrains/jewel/bridge/ScrollbarHelper;", "", "scrollbarVisibilityStyleFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;", "getScrollbarVisibilityStyleFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "trackClickBehaviorFlow", "Lorg/jetbrains/jewel/ui/component/styling/TrackClickBehavior;", "getTrackClickBehaviorFlow", "Companion", "ide-laf-bridge"})
/*    */ public interface ScrollbarHelper {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @NotNull
/*    */   StateFlow<ScrollbarVisibility> getScrollbarVisibilityStyleFlow();
/*    */   
/*    */   @NotNull
/*    */   StateFlow<TrackClickBehavior> getTrackClickBehaviorFlow();
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\b\020\004\032\0020\005H\007¨\006\006"}, d2 = {"Lorg/jetbrains/jewel/bridge/ScrollbarHelper$Companion;", "", "<init>", "()V", "getInstance", "Lorg/jetbrains/jewel/bridge/ScrollbarHelper;", "ide-laf-bridge"})
/*    */   public static final class Companion { @JvmStatic
/*    */     @NotNull
/* 24 */     public final ScrollbarHelper getInstance() { return (OsArch_jvmKt.getHostOs() == OS.MacOS) ? ScrollbarHelperKt.access$getScrollbarService() : DummyScrollbarHelper.INSTANCE; } } @JvmStatic @NotNull static ScrollbarHelper getInstance() { return Companion.getInstance(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\ScrollbarHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */