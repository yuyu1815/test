/*     */ package androidx.lifecycle;
/*     */ 
/*     */ import androidx.annotation.MainThread;
/*     */ import androidx.annotation.RestrictTo;
/*     */ import java.util.concurrent.atomic.AtomicReference;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.flow.FlowKt;
/*     */ import kotlinx.coroutines.flow.MutableStateFlow;
/*     */ import kotlinx.coroutines.flow.StateFlow;
/*     */ import kotlinx.coroutines.flow.StateFlowKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\006\n\002\020\002\n\000\n\002\030\002\n\002\b\004\b&\030\0002\0020\001:\002\030\031B\005¢\006\002\020\002J\020\020\023\032\0020\0242\006\020\025\032\0020\026H'J\020\020\027\032\0020\0242\006\020\025\032\0020\026H'R\024\020\003\032\0020\0048gX¦\004¢\006\006\032\004\b\005\020\006R\032\020\007\032\b\022\004\022\0020\0040\b8VX\004¢\006\006\032\004\b\t\020\nRN\020\016\032\026\022\006\022\004\030\0010\0010\fj\n\022\006\022\004\030\0010\001`\r2\032\020\013\032\026\022\006\022\004\030\0010\0010\fj\n\022\006\022\004\030\0010\001`\r8G@GX\016¢\006\016\n\000\032\004\b\017\020\020\"\004\b\021\020\022¨\006\032"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "", "()V", "currentState", "Landroidx/lifecycle/Lifecycle$State;", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "currentStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "<set-?>", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/lifecycle/AtomicReference;", "internalScopeRef", "getInternalScopeRef", "()Ljava/util/concurrent/atomic/AtomicReference;", "setInternalScopeRef", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "addObserver", "", "observer", "Landroidx/lifecycle/LifecycleObserver;", "removeObserver", "Event", "State", "lifecycle-common"})
/*     */ @SourceDebugExtension({"SMAP\nLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lifecycle.kt\nandroidx/lifecycle/Lifecycle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n1#2:391\n*E\n"})
/*     */ public abstract class Lifecycle
/*     */ {
/*     */   @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/*     */   @NotNull
/*  62 */   private AtomicReference<Object> internalScopeRef = new AtomicReference(null); @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP}) @NotNull public final AtomicReference<Object> getInternalScopeRef() { return this.internalScopeRef; } @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP}) public final void setInternalScopeRef(@NotNull AtomicReference<Object> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.internalScopeRef = <set-?>; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @MainThread
/*     */   public abstract void addObserver(@NotNull LifecycleObserver paramLifecycleObserver);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @MainThread
/*     */   public abstract void removeObserver(@NotNull LifecycleObserver paramLifecycleObserver);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @MainThread
/*     */   @NotNull
/*     */   public abstract State getCurrentState();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public StateFlow<State> getCurrentStateFlow() {
/* 110 */     MutableStateFlow mutableStateFlow = StateFlowKt.MutableStateFlow(getCurrentState());
/*     */ 
/*     */     
/* 113 */     LifecycleEventObserver lifecycleEventObserver1 = mutableStateFlow::_get_currentStateFlow_$lambda$0, it = lifecycleEventObserver1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 391 */     int $i$a$-also-Lifecycle$currentStateFlow$2 = 0;
/*     */     addObserver(it);
/*     */     return FlowKt.asStateFlow(mutableStateFlow);
/*     */   }
/*     */   
/*     */   private static final void _get_currentStateFlow_$lambda$0(MutableStateFlow $mutableStateFlow, LifecycleOwner paramLifecycleOwner, Event event) {
/*     */     Intrinsics.checkNotNullParameter($mutableStateFlow, "$mutableStateFlow");
/*     */     Intrinsics.checkNotNullParameter(paramLifecycleOwner, "<anonymous parameter 0>");
/*     */     Intrinsics.checkNotNullParameter(event, "event");
/*     */     $mutableStateFlow.setValue(event.getTargetState());
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\020\n\002\b\002\n\002\030\002\n\002\b\013\b\001\030\000 \0162\b\022\004\022\0020\0000\001:\001\016B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\0048F¢\006\006\032\004\b\005\020\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\r¨\006\017"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "", "(Ljava/lang/String;I)V", "targetState", "Landroidx/lifecycle/Lifecycle$State;", "getTargetState", "()Landroidx/lifecycle/Lifecycle$State;", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "Companion", "lifecycle-common"})
/*     */   public enum Event {
/*     */     ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY;
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     
/*     */     static {
/*     */     
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Lifecycle.State getTargetState() {
/*     */       switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
/*     */         case 1:
/*     */         case 2:
/*     */           return Lifecycle.State.CREATED;
/*     */         case 3:
/*     */         case 4:
/*     */           return Lifecycle.State.STARTED;
/*     */         case 5:
/*     */           return Lifecycle.State.RESUMED;
/*     */         case 6:
/*     */           return Lifecycle.State.DESTROYED;
/*     */       } 
/*     */       throw new IllegalArgumentException(this + " has no target state");
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     @Nullable
/*     */     public static final Event downFrom(@NotNull Lifecycle.State state) {
/*     */       return Companion.downFrom(state);
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     @Nullable
/*     */     public static final Event downTo(@NotNull Lifecycle.State state) {
/*     */       return Companion.downTo(state);
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     @Nullable
/*     */     public static final Event upFrom(@NotNull Lifecycle.State state) {
/*     */       return Companion.upFrom(state);
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     @Nullable
/*     */     public static final Event upTo(@NotNull Lifecycle.State state) {
/*     */       return Companion.upTo(state);
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\022\020\003\032\004\030\0010\0042\006\020\005\032\0020\006H\007J\022\020\007\032\004\030\0010\0042\006\020\005\032\0020\006H\007J\022\020\b\032\004\030\0010\0042\006\020\005\032\0020\006H\007J\022\020\t\032\004\030\0010\0042\006\020\005\032\0020\006H\007¨\006\n"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event$Companion;", "", "()V", "downFrom", "Landroidx/lifecycle/Lifecycle$Event;", "state", "Landroidx/lifecycle/Lifecycle$State;", "downTo", "upFrom", "upTo", "lifecycle-common"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @JvmStatic
/*     */       @Nullable
/*     */       public final Lifecycle.Event downFrom(@NotNull Lifecycle.State state) {
/*     */         Intrinsics.checkNotNullParameter(state, "state");
/*     */         switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
/*     */           case 1:
/*     */           
/*     */           case 2:
/*     */           
/*     */           case 3:
/*     */           
/*     */         } 
/*     */         return null;
/*     */       }
/*     */       
/*     */       @JvmStatic
/*     */       @Nullable
/*     */       public final Lifecycle.Event downTo(@NotNull Lifecycle.State state) {
/*     */         Intrinsics.checkNotNullParameter(state, "state");
/*     */         switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
/*     */           case 4:
/*     */           
/*     */           case 1:
/*     */           
/*     */           case 2:
/*     */           
/*     */         } 
/*     */         return null;
/*     */       }
/*     */       
/*     */       @JvmStatic
/*     */       @Nullable
/*     */       public final Lifecycle.Event upFrom(@NotNull Lifecycle.State state) {
/*     */         Intrinsics.checkNotNullParameter(state, "state");
/*     */         switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
/*     */           case 5:
/*     */           
/*     */           case 1:
/*     */           
/*     */           case 2:
/*     */           
/*     */         } 
/*     */         return null;
/*     */       }
/*     */       
/*     */       @JvmStatic
/*     */       @Nullable
/*     */       public final Lifecycle.Event upTo(@NotNull Lifecycle.State state) {
/*     */         Intrinsics.checkNotNullParameter(state, "state");
/*     */         switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
/*     */           case 1:
/*     */           
/*     */           case 2:
/*     */           
/*     */           case 3:
/*     */           
/*     */         } 
/*     */         return null;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\020\n\002\b\002\n\002\020\013\n\002\b\007\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\000j\002\b\006j\002\b\007j\002\b\bj\002\b\tj\002\b\n¨\006\013"}, d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "(Ljava/lang/String;I)V", "isAtLeast", "", "state", "DESTROYED", "INITIALIZED", "CREATED", "STARTED", "RESUMED", "lifecycle-common"})
/*     */   public enum State {
/*     */     DESTROYED, INITIALIZED, CREATED, STARTED, RESUMED;
/*     */     
/*     */     public final boolean isAtLeast(@NotNull State state) {
/*     */       Intrinsics.checkNotNullParameter(state, "state");
/*     */       return (compareTo(state) >= 0);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-common-jvm-2.8.5.jar!\androidx\lifecycle\Lifecycle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */