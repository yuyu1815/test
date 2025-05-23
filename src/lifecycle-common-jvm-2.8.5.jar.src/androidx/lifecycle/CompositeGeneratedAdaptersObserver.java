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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\023\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J\030\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\fH\026R\026\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\004\n\002\020\006¨\006\r"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "generatedAdapters", "", "Landroidx/lifecycle/GeneratedAdapter;", "([Landroidx/lifecycle/GeneratedAdapter;)V", "[Landroidx/lifecycle/GeneratedAdapter;", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycle-common"})
/*    */ public final class CompositeGeneratedAdaptersObserver
/*    */   implements LifecycleEventObserver
/*    */ {
/*    */   @NotNull
/*    */   private final GeneratedAdapter[] generatedAdapters;
/*    */   
/*    */   public CompositeGeneratedAdaptersObserver(@NotNull GeneratedAdapter[] generatedAdapters) {
/* 19 */     this.generatedAdapters = generatedAdapters;
/*    */   }
/*    */   
/*    */   public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
/* 23 */     Intrinsics.checkNotNullParameter(source, "source"); Intrinsics.checkNotNullParameter(event, "event"); MethodCallsLogger logger = new MethodCallsLogger(); GeneratedAdapter[] arrayOfGeneratedAdapter; byte b; int i;
/* 24 */     for (arrayOfGeneratedAdapter = this.generatedAdapters, b = 0, i = arrayOfGeneratedAdapter.length; b < i; ) { GeneratedAdapter adapter = arrayOfGeneratedAdapter[b];
/* 25 */       adapter.callMethods(source, event, false, logger); b++; }
/*    */     
/* 27 */     for (arrayOfGeneratedAdapter = this.generatedAdapters, b = 0, i = arrayOfGeneratedAdapter.length; b < i; ) { GeneratedAdapter adapter = arrayOfGeneratedAdapter[b];
/* 28 */       adapter.callMethods(source, event, true, logger);
/*    */       b++; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-common-jvm-2.8.5.jar!\androidx\lifecycle\CompositeGeneratedAdaptersObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */