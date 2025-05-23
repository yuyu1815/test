/*     */ package androidx.lifecycle;
/*     */ 
/*     */ import androidx.arch.core.internal.FastSafeIterableMap;
/*     */ import java.lang.ref.WeakReference;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000l\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\007\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\005\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\n\b\026\030\000 :2\0020\001:\002:;B\017\b\026\022\006\020\002\032\0020\003¢\006\002\020\004B\027\b\002\022\006\020\002\032\0020\003\022\006\020\005\032\0020\006¢\006\002\020\007J\020\020'\032\0020(2\006\020)\032\0020\"H\026J\020\020*\032\0020(2\006\020\032\032\0020\003H\002J\020\020+\032\0020\n2\006\020)\032\0020\"H\002J\020\020,\032\0020(2\006\020-\032\0020.H\002J\020\020/\032\0020(2\006\020\032\032\0020\003H\002J\020\0200\032\0020(2\006\0201\032\00202H\026J\020\0203\032\0020(2\006\020\r\032\0020\nH\027J\020\0204\032\0020(2\006\0205\032\0020\nH\002J\b\0206\032\0020(H\002J\020\0207\032\0020(2\006\020\r\032\0020\nH\002J\020\0208\032\0020(2\006\020)\032\0020\"H\026J\b\0209\032\0020(H\002R\024\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\002\n\000R\016\020\013\032\0020\fX\016¢\006\002\n\000R$\020\016\032\0020\n2\006\020\r\032\0020\n8V@VX\016¢\006\f\032\004\b\017\020\020\"\004\b\021\020\022R\032\020\023\032\b\022\004\022\0020\n0\0248VX\004¢\006\006\032\004\b\025\020\026R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\027\032\0020\006X\016¢\006\002\n\000R\024\020\030\032\0020\0068BX\004¢\006\006\032\004\b\030\020\031R\024\020\032\032\b\022\004\022\0020\0030\033X\004¢\006\002\n\000R\016\020\034\032\0020\006X\016¢\006\002\n\000R\024\020\035\032\0020\f8VX\004¢\006\006\032\004\b\036\020\037R\032\020 \032\016\022\004\022\0020\"\022\004\022\0020#0!X\016¢\006\002\n\000R\036\020$\032\022\022\004\022\0020\n0%j\b\022\004\022\0020\n`&X\016¢\006\002\n\000R\016\020\r\032\0020\nX\016¢\006\002\n\000¨\006<"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle;", "provider", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;)V", "enforceMainThread", "", "(Landroidx/lifecycle/LifecycleOwner;Z)V", "_currentStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/lifecycle/Lifecycle$State;", "addingObserverCounter", "", "state", "currentState", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "setCurrentState", "(Landroidx/lifecycle/Lifecycle$State;)V", "currentStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "handlingEvent", "isSynced", "()Z", "lifecycleOwner", "Ljava/lang/ref/WeakReference;", "newEventOccurred", "observerCount", "getObserverCount", "()I", "observerMap", "Landroidx/arch/core/internal/FastSafeIterableMap;", "Landroidx/lifecycle/LifecycleObserver;", "Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "parentStates", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "addObserver", "", "observer", "backwardPass", "calculateTargetState", "enforceMainThreadIfNeeded", "methodName", "", "forwardPass", "handleLifecycleEvent", "event", "Landroidx/lifecycle/Lifecycle$Event;", "markState", "moveToState", "next", "popParentState", "pushParentState", "removeObserver", "sync", "Companion", "ObserverWithState", "lifecycle-runtime"})
/*     */ public class LifecycleRegistry extends Lifecycle {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final boolean enforceMainThread;
/*     */   @NotNull
/*     */   private FastSafeIterableMap<LifecycleObserver, ObserverWithState> observerMap;
/*     */   @NotNull
/*     */   private Lifecycle.State state;
/*     */   @NotNull
/*     */   private final WeakReference<LifecycleOwner> lifecycleOwner;
/*     */   private int addingObserverCounter;
/*     */   private boolean handlingEvent;
/*     */   private boolean newEventOccurred;
/*     */   @NotNull
/*     */   private ArrayList<Lifecycle.State> parentStates;
/*     */   @NotNull
/*     */   private final MutableStateFlow<Lifecycle.State> _currentStateFlow;
/*     */   
/*  34 */   private LifecycleRegistry(LifecycleOwner provider, boolean enforceMainThread) { this.enforceMainThread = enforceMainThread;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  43 */     this.observerMap = new FastSafeIterableMap();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  48 */     this.state = Lifecycle.State.INITIALIZED;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  70 */     this.parentStates = new ArrayList<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  83 */     this.lifecycleOwner = new WeakReference<>(provider);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 110 */     this._currentStateFlow = StateFlowKt.MutableStateFlow(Lifecycle.State.INITIALIZED); } public LifecycleRegistry(@NotNull LifecycleOwner provider) { this(provider, true); }
/*     */   @Deprecated(message = "Override [currentState].") @MainThread public void markState(@NotNull Lifecycle.State state) { Intrinsics.checkNotNullParameter(state, "state"); enforceMainThreadIfNeeded("markState"); setCurrentState(state); }
/* 112 */   @NotNull public StateFlow<Lifecycle.State> getCurrentStateFlow() { return FlowKt.asStateFlow(this._currentStateFlow); }
/*     */    @NotNull
/*     */   public Lifecycle.State getCurrentState() {
/*     */     return this.state;
/*     */   }
/*     */   public void setCurrentState(@NotNull Lifecycle.State state) {
/*     */     Intrinsics.checkNotNullParameter(state, "state");
/*     */     enforceMainThreadIfNeeded("setCurrentState");
/*     */     moveToState(state);
/*     */   }
/*     */   public void handleLifecycleEvent(@NotNull Lifecycle.Event event) {
/* 123 */     Intrinsics.checkNotNullParameter(event, "event"); enforceMainThreadIfNeeded("handleLifecycleEvent");
/* 124 */     moveToState(event.getTargetState());
/*     */   }
/*     */   
/*     */   private final void moveToState(Lifecycle.State next) {
/* 128 */     if (this.state == next) {
/*     */       return;
/*     */     }
/* 131 */     if (!((this.state != Lifecycle.State.INITIALIZED || next != Lifecycle.State.DESTROYED) ? 1 : 0)) { int $i$a$-check-LifecycleRegistry$moveToState$1 = 0; String str = "State must be at least CREATED to move to " + 
/* 132 */         next + ", but was " + this.state + " in component " + 
/* 133 */         this.lifecycleOwner.get(); throw new IllegalStateException(str.toString()); }
/*     */     
/* 135 */     this.state = next;
/* 136 */     if (this.handlingEvent || this.addingObserverCounter != 0) {
/* 137 */       this.newEventOccurred = true;
/*     */       
/*     */       return;
/*     */     } 
/* 141 */     this.handlingEvent = true;
/* 142 */     sync();
/* 143 */     this.handlingEvent = false;
/* 144 */     if (this.state == Lifecycle.State.DESTROYED) {
/* 145 */       this.observerMap = new FastSafeIterableMap();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private final boolean isSynced() {
/* 151 */     if (this.observerMap.size() == 0) {
/* 152 */       return true;
/*     */     }
/* 154 */     Intrinsics.checkNotNull(this.observerMap.eldest()); Lifecycle.State eldestObserverState = ((ObserverWithState)this.observerMap.eldest().getValue()).getState();
/* 155 */     Intrinsics.checkNotNull(this.observerMap.newest()); Lifecycle.State newestObserverState = ((ObserverWithState)this.observerMap.newest().getValue()).getState();
/* 156 */     return (eldestObserverState == newestObserverState && this.state == newestObserverState);
/*     */   }
/*     */   
/*     */   private final Lifecycle.State calculateTargetState(LifecycleObserver observer) {
/* 160 */     Map.Entry map = this.observerMap.ceil(observer);
/* 161 */     (ObserverWithState)map.getValue(); Lifecycle.State siblingState = (map != null && (ObserverWithState)map.getValue() != null) ? ((ObserverWithState)map.getValue()).getState() : null;
/* 162 */     Lifecycle.State parentState = 
/* 163 */       (!this.parentStates.isEmpty()) ? this.parentStates.get(this.parentStates.size() - 1) : null;
/* 164 */     return Companion.min$lifecycle_runtime(Companion.min$lifecycle_runtime(this.state, siblingState), parentState);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addObserver(@NotNull LifecycleObserver observer) {
/*     */     LifecycleOwner lifecycleOwner;
/* 180 */     Intrinsics.checkNotNullParameter(observer, "observer"); enforceMainThreadIfNeeded("addObserver");
/* 181 */     Lifecycle.State initialState = (this.state == Lifecycle.State.DESTROYED) ? Lifecycle.State.DESTROYED : Lifecycle.State.INITIALIZED;
/* 182 */     ObserverWithState statefulObserver = new ObserverWithState(observer, initialState);
/* 183 */     ObserverWithState previous = (ObserverWithState)this.observerMap.putIfAbsent(observer, statefulObserver);
/* 184 */     if (previous != null) {
/*     */       return;
/*     */     }
/* 187 */     if ((LifecycleOwner)this.lifecycleOwner.get() == null) { (LifecycleOwner)this.lifecycleOwner.get();
/*     */       return; }
/*     */     
/* 190 */     boolean isReentrance = (this.addingObserverCounter != 0 || this.handlingEvent);
/* 191 */     Lifecycle.State targetState = calculateTargetState(observer);
/* 192 */     int i = this.addingObserverCounter; this.addingObserverCounter = i + 1;
/* 193 */     while (statefulObserver.getState().compareTo((Enum)targetState) < 0 && this.observerMap.contains(observer)) {
/*     */       Lifecycle.Event event;
/* 195 */       pushParentState(statefulObserver.getState());
/* 196 */       if (Lifecycle.Event.Companion.upFrom(statefulObserver.getState()) == null) { Lifecycle.Event.Companion.upFrom(statefulObserver.getState());
/* 197 */         throw new IllegalStateException("no event up from " + statefulObserver.getState()); }
/* 198 */        statefulObserver.dispatchEvent(lifecycleOwner, event);
/* 199 */       popParentState();
/*     */       
/* 201 */       targetState = calculateTargetState(observer);
/*     */     } 
/* 203 */     if (!isReentrance)
/*     */     {
/* 205 */       sync();
/*     */     }
/* 207 */     i = this.addingObserverCounter; this.addingObserverCounter = i + -1;
/*     */   }
/*     */   
/*     */   private final void popParentState() {
/* 211 */     this.parentStates.remove(this.parentStates.size() - 1);
/*     */   }
/*     */   
/*     */   private final void pushParentState(Lifecycle.State state) {
/* 215 */     this.parentStates.add(state);
/*     */   }
/*     */   
/*     */   public void removeObserver(@NotNull LifecycleObserver observer) {
/* 219 */     Intrinsics.checkNotNullParameter(observer, "observer"); enforceMainThreadIfNeeded("removeObserver");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 232 */     this.observerMap.remove(observer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getObserverCount() {
/* 242 */     enforceMainThreadIfNeeded("getObserverCount");
/* 243 */     return this.observerMap.size();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final void forwardPass(LifecycleOwner lifecycleOwner) {
/* 249 */     Intrinsics.checkNotNullExpressionValue(this.observerMap.iteratorWithAdditions(), "observerMap.iteratorWithAdditions()"); Iterator<Map.Entry> ascendingIterator = (Iterator)this.observerMap.iteratorWithAdditions();
/* 250 */     while (ascendingIterator.hasNext() && !this.newEventOccurred) {
/* 251 */       Map.Entry entry = ascendingIterator.next(); LifecycleObserver key = (LifecycleObserver)entry.getKey(); ObserverWithState observer = (ObserverWithState)entry.getValue();
/* 252 */       while (observer.getState().compareTo((Enum)this.state) < 0 && !this.newEventOccurred && this.observerMap.contains(key)) {
/*     */         Lifecycle.Event event;
/* 254 */         pushParentState(observer.getState());
/* 255 */         if (Lifecycle.Event.Companion.upFrom(observer.getState()) == null) { Lifecycle.Event.Companion.upFrom(observer.getState());
/* 256 */           throw new IllegalStateException("no event up from " + observer.getState()); }
/* 257 */          observer.dispatchEvent(lifecycleOwner, event);
/* 258 */         popParentState();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void backwardPass(LifecycleOwner lifecycleOwner) {
/* 264 */     Intrinsics.checkNotNullExpressionValue(this.observerMap.descendingIterator(), "observerMap.descendingIterator()"); Iterator<Map.Entry> descendingIterator = this.observerMap.descendingIterator();
/* 265 */     while (descendingIterator.hasNext() && !this.newEventOccurred) {
/* 266 */       Map.Entry entry = descendingIterator.next(); Intrinsics.checkNotNullExpressionValue(entry, "next()"); LifecycleObserver key = (LifecycleObserver)entry.getKey(); ObserverWithState observer = (ObserverWithState)entry.getValue();
/* 267 */       while (observer.getState().compareTo((Enum)this.state) > 0 && !this.newEventOccurred && this.observerMap.contains(key)) {
/*     */         Lifecycle.Event event;
/* 269 */         if (Lifecycle.Event.Companion.downFrom(observer.getState()) == null) { Lifecycle.Event.Companion.downFrom(observer.getState());
/* 270 */           throw new IllegalStateException("no event down from " + observer.getState()); }
/* 271 */          pushParentState(event.getTargetState());
/* 272 */         observer.dispatchEvent(lifecycleOwner, event);
/* 273 */         popParentState();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private final void sync() {
/*     */     LifecycleOwner lifecycleOwner;
/* 281 */     if ((LifecycleOwner)this.lifecycleOwner.get() == null) { (LifecycleOwner)this.lifecycleOwner.get();
/* 282 */       throw new IllegalStateException(
/* 283 */           "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."); }
/*     */ 
/*     */     
/* 286 */     while (!isSynced()) {
/* 287 */       this.newEventOccurred = false;
/* 288 */       Intrinsics.checkNotNull(this.observerMap.eldest()); if (this.state.compareTo((Enum)((ObserverWithState)this.observerMap.eldest().getValue()).getState()) < 0) {
/* 289 */         backwardPass(lifecycleOwner);
/*     */       }
/* 291 */       Map.Entry newest = this.observerMap.newest();
/* 292 */       if (!this.newEventOccurred && newest != null && this.state.compareTo((Enum)((ObserverWithState)newest.getValue()).getState()) > 0) {
/* 293 */         forwardPass(lifecycleOwner);
/*     */       }
/*     */     } 
/* 296 */     this.newEventOccurred = false;
/* 297 */     this._currentStateFlow.setValue(getCurrentState()); }
/*     */   @JvmStatic
/*     */   @VisibleForTesting
/*     */   @NotNull
/* 301 */   public static final LifecycleRegistry createUnsafe(@NotNull LifecycleOwner owner) { return Companion.createUnsafe(owner); } private final void enforceMainThreadIfNeeded(String methodName) { if (this.enforceMainThread && 
/* 302 */       !LifecycleRegistry_desktopKt.isMainThread()) { int $i$a$-check-LifecycleRegistry$enforceMainThreadIfNeeded$1 = 0; String str = "Method " + 
/* 303 */         methodName + " must be called on the main thread";
/*     */       throw new IllegalStateException(str.toString()); }
/*     */      } @JvmStatic
/*     */   @NotNull
/*     */   public static final Lifecycle.State min$lifecycle_runtime(@NotNull Lifecycle.State state1, @Nullable Lifecycle.State state2) {
/*     */     return Companion.min$lifecycle_runtime(state1, state2);
/*     */   } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\n\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\027\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005¢\006\002\020\006J\030\020\022\032\0020\0232\b\020\024\032\004\030\0010\0252\006\020\026\032\0020\027R\032\020\007\032\0020\bX\016¢\006\016\n\000\032\004\b\t\020\n\"\004\b\013\020\fR\032\020\r\032\0020\005X\016¢\006\016\n\000\032\004\b\016\020\017\"\004\b\020\020\021¨\006\030"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "", "observer", "Landroidx/lifecycle/LifecycleObserver;", "initialState", "Landroidx/lifecycle/Lifecycle$State;", "(Landroidx/lifecycle/LifecycleObserver;Landroidx/lifecycle/Lifecycle$State;)V", "lifecycleObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "getLifecycleObserver", "()Landroidx/lifecycle/LifecycleEventObserver;", "setLifecycleObserver", "(Landroidx/lifecycle/LifecycleEventObserver;)V", "state", "getState", "()Landroidx/lifecycle/Lifecycle$State;", "setState", "(Landroidx/lifecycle/Lifecycle$State;)V", "dispatchEvent", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycle-runtime"})
/*     */   public static final class ObserverWithState { @NotNull
/*     */     private Lifecycle.State state; @NotNull
/*     */     private LifecycleEventObserver lifecycleObserver; public ObserverWithState(@Nullable LifecycleObserver observer, @NotNull Lifecycle.State initialState) {
/* 313 */       Intrinsics.checkNotNull(observer); this.lifecycleObserver = Lifecycling.lifecycleEventObserver(observer);
/* 314 */       this.state = initialState; } @NotNull
/*     */     public final Lifecycle.State getState() { return this.state; }
/*     */     public final void setState(@NotNull Lifecycle.State <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */       this.state = <set-?>; }
/* 318 */     public final void dispatchEvent(@Nullable LifecycleOwner owner, @NotNull Lifecycle.Event event) { Intrinsics.checkNotNullParameter(event, "event"); Lifecycle.State newState = event.getTargetState();
/* 319 */       this.state = LifecycleRegistry.Companion.min$lifecycle_runtime(this.state, newState);
/* 320 */       Intrinsics.checkNotNull(owner); this.lifecycleObserver.onStateChanged(owner, event);
/* 321 */       this.state = newState; }
/*     */     
/*     */     @NotNull
/*     */     public final LifecycleEventObserver getLifecycleObserver() {
/*     */       return this.lifecycleObserver;
/*     */     }
/*     */     public final void setLifecycleObserver(@NotNull LifecycleEventObserver <set-?>) {
/*     */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */       this.lifecycleObserver = <set-?>;
/*     */     } }
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\007J\037\020\007\032\0020\b2\006\020\t\032\0020\b2\b\020\n\032\004\030\0010\bH\001¢\006\002\b\013¨\006\f"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$Companion;", "", "()V", "createUnsafe", "Landroidx/lifecycle/LifecycleRegistry;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "min", "Landroidx/lifecycle/Lifecycle$State;", "state1", "state2", "min$lifecycle_runtime", "lifecycle-runtime"})
/*     */   public static final class Companion { private Companion() {}
/*     */     @JvmStatic
/*     */     @VisibleForTesting
/*     */     @NotNull
/*     */     public final LifecycleRegistry createUnsafe(@NotNull LifecycleOwner owner) {
/* 337 */       Intrinsics.checkNotNullParameter(owner, "owner"); return new LifecycleRegistry(owner, false, null);
/*     */     }
/*     */     @JvmStatic
/*     */     @NotNull
/*     */     public final Lifecycle.State min$lifecycle_runtime(@NotNull Lifecycle.State state1, @Nullable Lifecycle.State state2) {
/* 342 */       Intrinsics.checkNotNullParameter(state1, "state1"); return (state2 != null && state2.compareTo((Enum)state1) < 0) ? state2 : state1;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-runtime-desktop-2.8.5.jar!\androidx\lifecycle\LifecycleRegistry.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */