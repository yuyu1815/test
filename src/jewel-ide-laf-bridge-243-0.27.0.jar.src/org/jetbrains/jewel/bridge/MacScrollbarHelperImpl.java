/*     */ package org.jetbrains.jewel.bridge;
/*     */ 
/*     */ import com.intellij.openapi.util.SystemInfoRt;
/*     */ import com.intellij.ui.mac.foundation.Foundation;
/*     */ import com.intellij.ui.mac.foundation.ID;
/*     */ import com.sun.jna.Callback;
/*     */ import com.sun.jna.Pointer;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.flow.MutableStateFlow;
/*     */ import kotlinx.coroutines.flow.StateFlow;
/*     */ import kotlinx.coroutines.flow.StateFlowKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.bridge.theme.ScrollbarBridgeKt;
/*     */ import org.jetbrains.jewel.foundation.util.JewelLogger;
/*     */ import org.jetbrains.jewel.ui.component.styling.ScrollbarVisibility;
/*     */ import org.jetbrains.jewel.ui.component.styling.TrackClickBehavior;
/*     */ import org.jetbrains.skiko.OS;
/*     */ import org.jetbrains.skiko.OsArch_jvmKt;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\002\b\002\030\0002\0020\0012\0020\002B\007¢\006\004\b\003\020\004J\b\020\022\032\0020\023H\002J\b\020\024\032\0020\023H\002J$\020\025\032\0020\0232\b\020\026\032\004\030\0010\0272\b\020\030\032\004\030\0010\0312\b\020\032\032\004\030\0010\027J\b\020\033\032\0020\023H\002J\b\020\034\032\0020\023H\002J)\020\035\032\004\030\001H\036\"\b\b\000\020\036*\0020\0372\016\020 \032\n\022\006\022\004\030\001H\0360!H\002¢\006\002\020\"J \020#\032\0020\0272\006\020$\032\0020%2\006\020&\032\0020\0312\006\020\025\032\0020\001H\002R\016\020\005\032\0020\006X\004¢\006\002\n\000R\024\020\007\032\b\022\004\022\0020\t0\bX\004¢\006\002\n\000R\032\020\n\032\b\022\004\022\0020\t0\013X\004¢\006\b\n\000\032\004\b\f\020\rR\024\020\016\032\b\022\004\022\0020\0170\bX\004¢\006\002\n\000R\032\020\020\032\b\022\004\022\0020\0170\013X\004¢\006\b\n\000\032\004\b\021\020\r¨\006'"}, d2 = {"Lorg/jetbrains/jewel/bridge/MacScrollbarHelperImpl;", "Lcom/sun/jna/Callback;", "Lorg/jetbrains/jewel/bridge/ScrollbarHelper;", "<init>", "()V", "logger", "Lorg/jetbrains/jewel/foundation/util/JewelLogger;", "_scrollbarVisibilityStyleFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;", "scrollbarVisibilityStyleFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getScrollbarVisibilityStyleFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "_trackClickBehaviorFlow", "Lorg/jetbrains/jewel/ui/component/styling/TrackClickBehavior;", "trackClickBehaviorFlow", "getTrackClickBehaviorFlow", "listenToTrackClickBehaviorChange", "", "listenToScrollbarVisibilityChange", "callback", "self", "Lcom/intellij/ui/mac/foundation/ID;", "selector", "Lcom/sun/jna/Pointer;", "event", "readTrackClickBehavior", "readScrollbarVisibility", "callMac", "T", "", "producer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "createDelegate", "name", "", "pointer", "ide-laf-bridge"})
/*     */ @SourceDebugExtension({"SMAP\nScrollbarHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollbarHelper.kt\norg/jetbrains/jewel/bridge/MacScrollbarHelperImpl\n+ 2 JewelLogger.kt\norg/jetbrains/jewel/foundation/util/JewelLoggerKt\n*L\n1#1,183:1\n9#2:184\n*S KotlinDebug\n*F\n+ 1 ScrollbarHelper.kt\norg/jetbrains/jewel/bridge/MacScrollbarHelperImpl\n*L\n31#1:184\n*E\n"})
/*     */ final class MacScrollbarHelperImpl
/*     */   implements Callback, ScrollbarHelper
/*     */ {
/*     */   public MacScrollbarHelperImpl() {
/*  31 */     Object $this$myLogger$iv = this; int $i$f$myLogger = 0; this.logger = 
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
/* 184 */       JewelLogger.Companion.getInstance(MacScrollbarHelperImpl.class);
/*     */     this._scrollbarVisibilityStyleFlow = StateFlowKt.MutableStateFlow(ScrollbarBridgeKt.default(ScrollbarVisibility.AlwaysVisible.Companion));
/*     */     this.scrollbarVisibilityStyleFlow = (StateFlow<ScrollbarVisibility>)this._scrollbarVisibilityStyleFlow;
/*     */     this._trackClickBehaviorFlow = StateFlowKt.MutableStateFlow(TrackClickBehavior.JumpToSpot);
/*     */     this.trackClickBehaviorFlow = (StateFlow<TrackClickBehavior>)this._trackClickBehaviorFlow;
/*     */     if (OsArch_jvmKt.getHostOs() != OS.MacOS) {
/*     */       this.logger.error(getClass().getSimpleName() + " should only be initialized on macOS.");
/*     */     } else {
/*     */       callback(null, null, null);
/*     */       listenToTrackClickBehaviorChange();
/*     */       listenToScrollbarVisibilityChange();
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private final JewelLogger logger;
/*     */   @NotNull
/*     */   private final MutableStateFlow<ScrollbarVisibility> _scrollbarVisibilityStyleFlow;
/*     */   @NotNull
/*     */   private final StateFlow<ScrollbarVisibility> scrollbarVisibilityStyleFlow;
/*     */   @NotNull
/*     */   private final MutableStateFlow<TrackClickBehavior> _trackClickBehaviorFlow;
/*     */   @NotNull
/*     */   private final StateFlow<TrackClickBehavior> trackClickBehaviorFlow;
/*     */   
/*     */   @NotNull
/*     */   public StateFlow<ScrollbarVisibility> getScrollbarVisibilityStyleFlow() {
/*     */     return this.scrollbarVisibilityStyleFlow;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public StateFlow<TrackClickBehavior> getTrackClickBehaviorFlow() {
/*     */     return this.trackClickBehaviorFlow;
/*     */   }
/*     */   
/*     */   private final void listenToTrackClickBehaviorChange() {
/*     */     callMac(this::listenToTrackClickBehaviorChange$lambda$0);
/*     */   }
/*     */   
/*     */   private static final ID listenToTrackClickBehaviorChange$lambda$0(MacScrollbarHelperImpl this$0) {
/*     */     Object[] arrayOfObject = new Object[5];
/*     */     Intrinsics.checkNotNullExpressionValue(Foundation.createSelector("handleBehaviorChanged:"), "createSelector(...)");
/*     */     arrayOfObject[0] = this$0.createDelegate("JewelScrollbarTrackClickBehaviorObserver", Foundation.createSelector("handleBehaviorChanged:"), this$0);
/*     */     arrayOfObject[1] = Foundation.createSelector("handleBehaviorChanged:");
/*     */     arrayOfObject[2] = Foundation.nsString("AppleNoRedisplayAppearancePreferenceChanged");
/*     */     arrayOfObject[3] = ID.NIL;
/*     */     arrayOfObject[4] = Integer.valueOf(2);
/*     */     return Foundation.invoke(Foundation.invoke("NSDistributedNotificationCenter", "defaultCenter", new Object[0]), "addObserver:selector:name:object:", arrayOfObject);
/*     */   }
/*     */   
/*     */   private final void listenToScrollbarVisibilityChange() {
/*     */     callMac(this::listenToScrollbarVisibilityChange$lambda$1);
/*     */   }
/*     */   
/*     */   private static final ID listenToScrollbarVisibilityChange$lambda$1(MacScrollbarHelperImpl this$0) {
/*     */     Object[] arrayOfObject = new Object[4];
/*     */     Intrinsics.checkNotNullExpressionValue(Foundation.createSelector("handleScrollerStyleChanged:"), "createSelector(...)");
/*     */     arrayOfObject[0] = this$0.createDelegate("JewelScrollbarVisibilityObserver", Foundation.createSelector("handleScrollerStyleChanged:"), this$0);
/*     */     arrayOfObject[1] = Foundation.createSelector("handleScrollerStyleChanged:");
/*     */     arrayOfObject[2] = Foundation.nsString("NSPreferredScrollerStyleDidChangeNotification");
/*     */     arrayOfObject[3] = ID.NIL;
/*     */     return Foundation.invoke(Foundation.invoke("NSNotificationCenter", "defaultCenter", new Object[0]), "addObserver:selector:name:object:", arrayOfObject);
/*     */   }
/*     */   
/*     */   public final void callback(@Nullable ID self, @Nullable Pointer selector, @Nullable ID event) {
/*     */     readTrackClickBehavior();
/*     */     readScrollbarVisibility();
/*     */   }
/*     */   
/*     */   private final void readTrackClickBehavior() {
/*     */     callMac(this::readTrackClickBehavior$lambda$2);
/*     */   }
/*     */   
/*     */   private static final Unit readTrackClickBehavior$lambda$2(MacScrollbarHelperImpl this$0) {
/*     */     ID userDefaults = Foundation.invoke("NSUserDefaults", "standardUserDefaults", new Object[0]);
/*     */     Foundation.invoke(userDefaults, "synchronize", new Object[0]);
/*     */     Object[] arrayOfObject = new Object[1];
/*     */     arrayOfObject[0] = Foundation.nsString("AppleScrollerPagingBehavior");
/*     */     boolean isJumpToPage = Foundation.invoke(userDefaults, "boolForKey:", arrayOfObject).booleanValue();
/*     */     TrackClickBehavior behavior = isJumpToPage ? TrackClickBehavior.JumpToSpot : TrackClickBehavior.NextPage;
/*     */     this$0.logger.debug("Scrollbar track click behavior: " + behavior);
/*     */     this$0._trackClickBehaviorFlow.setValue(behavior);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final void readScrollbarVisibility() {
/*     */     callMac(this::readScrollbarVisibility$lambda$3);
/*     */   }
/*     */   
/*     */   private static final Unit readScrollbarVisibility$lambda$3(MacScrollbarHelperImpl this$0) {
/*     */     boolean isOverlayStyle = Foundation.invoke(Foundation.getObjcClass("NSScroller"), "preferredScrollerStyle", new Object[0]).booleanValue();
/*     */     ScrollbarVisibility visibility = isOverlayStyle ? (ScrollbarVisibility)ScrollbarBridgeKt.macOs-TZvXluI$default(ScrollbarVisibility.WhenScrolling.Companion, 0.0F, 0.0F, null, null, 0L, 0L, 0L, 0L, 255, null) : (ScrollbarVisibility)ScrollbarBridgeKt.macOs-fYp4AQw$default(ScrollbarVisibility.AlwaysVisible.Companion, 0.0F, null, 0L, 0L, 0L, 31, null);
/*     */     this$0.logger.debug("Scrollbar visibility style: " + visibility);
/*     */     this$0._scrollbarVisibilityStyleFlow.setValue(visibility);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final <T> T callMac(Function0 producer) {
/*     */     if (!SystemInfoRt.isMac)
/*     */       return null; 
/*     */     Foundation.NSAutoreleasePool pool = new Foundation.NSAutoreleasePool();
/*     */     try {
/*     */       return (T)producer.invoke();
/*     */     } catch (Throwable e) {
/*     */       this.logger.warn(e);
/*     */     } finally {
/*     */       pool.drain();
/*     */     } 
/*     */     return null;
/*     */   }
/*     */   
/*     */   private final ID createDelegate(String name, Pointer pointer, Callback callback) {
/*     */     ID delegateClass = Foundation.allocateObjcClassPair(Foundation.getObjcClass("NSObject"), name);
/*     */     if (!Intrinsics.areEqual(ID.NIL, delegateClass)) {
/*     */       if (!Foundation.addMethod(delegateClass, pointer, callback, "v@"))
/*     */         throw new RuntimeException("Cannot add observer method"); 
/*     */       Foundation.registerObjcClassPair(delegateClass);
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(Foundation.invoke(name, "new", new Object[0]), "invoke(...)");
/*     */     return Foundation.invoke(name, "new", new Object[0]);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\MacScrollbarHelperImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */