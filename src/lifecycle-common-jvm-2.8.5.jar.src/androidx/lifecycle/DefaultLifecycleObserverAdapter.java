/*    */ package androidx.lifecycle;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\001¢\006\002\020\005J\030\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\020\020\004\032\004\030\0010\001X\004¢\006\002\n\000¨\006\f"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/LifecycleEventObserver;", "defaultLifecycleObserver", "Landroidx/lifecycle/DefaultLifecycleObserver;", "lifecycleEventObserver", "(Landroidx/lifecycle/DefaultLifecycleObserver;Landroidx/lifecycle/LifecycleEventObserver;)V", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycle-common"})
/*    */ public final class DefaultLifecycleObserverAdapter
/*    */   implements LifecycleEventObserver
/*    */ {
/*    */   @NotNull
/*    */   private final DefaultLifecycleObserver defaultLifecycleObserver;
/*    */   @Nullable
/*    */   private final LifecycleEventObserver lifecycleEventObserver;
/*    */   
/*    */   public DefaultLifecycleObserverAdapter(@NotNull DefaultLifecycleObserver defaultLifecycleObserver, @Nullable LifecycleEventObserver lifecycleEventObserver) {
/* 19 */     this.defaultLifecycleObserver = defaultLifecycleObserver;
/* 20 */     this.lifecycleEventObserver = lifecycleEventObserver;
/*    */   }
/*    */   public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
/* 23 */     Intrinsics.checkNotNullParameter(source, "source"); Intrinsics.checkNotNullParameter(event, "event"); switch (WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) { case 1:
/* 24 */         this.defaultLifecycleObserver.onCreate(source); break;
/* 25 */       case 2: this.defaultLifecycleObserver.onStart(source); break;
/* 26 */       case 3: this.defaultLifecycleObserver.onResume(source); break;
/* 27 */       case 4: this.defaultLifecycleObserver.onPause(source); break;
/* 28 */       case 5: this.defaultLifecycleObserver.onStop(source); break;
/* 29 */       case 6: this.defaultLifecycleObserver.onDestroy(source); break;
/*    */       case 7:
/* 31 */         throw new IllegalArgumentException("ON_ANY must not been send by anybody"); }
/*    */     
/* 33 */     if (this.lifecycleEventObserver != null) { this.lifecycleEventObserver.onStateChanged(source, event); }
/*    */     else
/*    */     {  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-common-jvm-2.8.5.jar!\androidx\lifecycle\DefaultLifecycleObserverAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */