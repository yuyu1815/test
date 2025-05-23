/*    */ package androidx.lifecycle;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\030\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\013"}, d2 = {"Landroidx/lifecycle/SingleGeneratedAdapterObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "generatedAdapter", "Landroidx/lifecycle/GeneratedAdapter;", "(Landroidx/lifecycle/GeneratedAdapter;)V", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycle-common"})
/*    */ public final class SingleGeneratedAdapterObserver
/*    */   implements LifecycleEventObserver
/*    */ {
/*    */   @NotNull
/*    */   private final GeneratedAdapter generatedAdapter;
/*    */   
/*    */   public SingleGeneratedAdapterObserver(@NotNull GeneratedAdapter generatedAdapter) {
/* 19 */     this.generatedAdapter = generatedAdapter;
/*    */   }
/*    */   public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
/* 22 */     Intrinsics.checkNotNullParameter(source, "source"); Intrinsics.checkNotNullParameter(event, "event"); this.generatedAdapter.callMethods(source, event, false, null);
/* 23 */     this.generatedAdapter.callMethods(source, event, true, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-common-jvm-2.8.5.jar!\androidx\lifecycle\SingleGeneratedAdapterObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */