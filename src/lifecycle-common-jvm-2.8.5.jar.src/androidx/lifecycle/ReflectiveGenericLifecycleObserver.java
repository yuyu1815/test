/*    */ package androidx.lifecycle;
/*    */ 
/*    */ import androidx.annotation.NonNull;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ class ReflectiveGenericLifecycleObserver
/*    */   implements LifecycleEventObserver
/*    */ {
/*    */   private final Object mWrapped;
/*    */   private final ClassesInfoCache.CallbackInfo mInfo;
/*    */   
/*    */   ReflectiveGenericLifecycleObserver(Object wrapped) {
/* 34 */     this.mWrapped = wrapped;
/* 35 */     this.mInfo = ClassesInfoCache.sInstance.getInfo(this.mWrapped.getClass());
/*    */   }
/*    */ 
/*    */   
/*    */   public void onStateChanged(@NonNull LifecycleOwner source, @NonNull Lifecycle.Event event) {
/* 40 */     this.mInfo.invokeCallbacks(source, event, this.mWrapped);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-common-jvm-2.8.5.jar!\androidx\lifecycle\ReflectiveGenericLifecycleObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */