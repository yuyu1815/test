/*    */ package androidx.lifecycle;
/*    */ 
/*    */ import androidx.annotation.MainThread;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.Job;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\002\b\002\b\001\030\0002\0020\001B%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\nJ\b\020\r\032\0020\016H\007J\021\020\017\032\0020\0162\006\020\b\032\0020\tH\bR\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\013\032\0020\fX\004¢\006\002\n\000¨\006\020"}, d2 = {"Landroidx/lifecycle/LifecycleController;", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "minState", "Landroidx/lifecycle/Lifecycle$State;", "dispatchQueue", "Landroidx/lifecycle/DispatchQueue;", "parentJob", "Lkotlinx/coroutines/Job;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/DispatchQueue;Lkotlinx/coroutines/Job;)V", "observer", "Landroidx/lifecycle/LifecycleEventObserver;", "finish", "", "handleDestroy", "lifecycle-common"})
/*    */ @MainThread
/*    */ @SourceDebugExtension({"SMAP\nLifecycleController.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.jvm.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,71:1\n57#1,3:72\n57#1,3:75\n*S KotlinDebug\n*F\n+ 1 LifecycleController.jvm.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:72,3\n36#1:75,3\n*E\n"})
/*    */ public final class LifecycleController
/*    */ {
/*    */   @NotNull
/*    */   private final Lifecycle lifecycle;
/*    */   @NotNull
/*    */   private final Lifecycle.State minState;
/*    */   @NotNull
/*    */   private final DispatchQueue dispatchQueue;
/*    */   @NotNull
/*    */   private final LifecycleEventObserver observer;
/*    */   
/*    */   public LifecycleController(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State minState, @NotNull DispatchQueue dispatchQueue, @NotNull Job parentJob) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'lifecycle'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'minState'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_3
/*    */     //   13: ldc 'dispatchQueue'
/*    */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   18: aload #4
/*    */     //   20: ldc 'parentJob'
/*    */     //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   25: aload_0
/*    */     //   26: invokespecial <init> : ()V
/*    */     //   29: aload_0
/*    */     //   30: aload_1
/*    */     //   31: putfield lifecycle : Landroidx/lifecycle/Lifecycle;
/*    */     //   34: aload_0
/*    */     //   35: aload_2
/*    */     //   36: putfield minState : Landroidx/lifecycle/Lifecycle$State;
/*    */     //   39: aload_0
/*    */     //   40: aload_3
/*    */     //   41: putfield dispatchQueue : Landroidx/lifecycle/DispatchQueue;
/*    */     //   44: aload_0
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: <illegal opcode> onStateChanged : (Landroidx/lifecycle/LifecycleController;Lkotlinx/coroutines/Job;)Landroidx/lifecycle/LifecycleEventObserver;
/*    */     //   53: putfield observer : Landroidx/lifecycle/LifecycleEventObserver;
/*    */     //   56: nop
/*    */     //   57: aload_0
/*    */     //   58: getfield lifecycle : Landroidx/lifecycle/Lifecycle;
/*    */     //   61: invokevirtual getCurrentState : ()Landroidx/lifecycle/Lifecycle$State;
/*    */     //   64: getstatic androidx/lifecycle/Lifecycle$State.DESTROYED : Landroidx/lifecycle/Lifecycle$State;
/*    */     //   67: if_acmpne -> 93
/*    */     //   70: aload_0
/*    */     //   71: astore #5
/*    */     //   73: iconst_0
/*    */     //   74: istore #6
/*    */     //   76: aload #4
/*    */     //   78: aconst_null
/*    */     //   79: iconst_1
/*    */     //   80: aconst_null
/*    */     //   81: invokestatic cancel$default : (Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
/*    */     //   84: aload #5
/*    */     //   86: invokevirtual finish : ()V
/*    */     //   89: nop
/*    */     //   90: goto -> 107
/*    */     //   93: aload_0
/*    */     //   94: getfield lifecycle : Landroidx/lifecycle/Lifecycle;
/*    */     //   97: aload_0
/*    */     //   98: getfield observer : Landroidx/lifecycle/LifecycleEventObserver;
/*    */     //   101: checkcast androidx/lifecycle/LifecycleObserver
/*    */     //   104: invokevirtual addObserver : (Landroidx/lifecycle/LifecycleObserver;)V
/*    */     //   107: nop
/*    */     //   108: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #25	-> 25
/*    */     //   #27	-> 29
/*    */     //   #28	-> 34
/*    */     //   #29	-> 39
/*    */     //   #32	-> 44
/*    */     //   #44	-> 56
/*    */     //   #48	-> 57
/*    */     //   #49	-> 70
/*    */     //   #72	-> 76
/*    */     //   #73	-> 84
/*    */     //   #74	-> 89
/*    */     //   #51	-> 93
/*    */     //   #53	-> 107
/*    */     //   #26	-> 108
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   76	14	6	$i$f$handleDestroy	I
/*    */     //   73	17	5	this_$iv	Landroidx/lifecycle/LifecycleController;
/*    */     //   0	109	0	this	Landroidx/lifecycle/LifecycleController;
/*    */     //   0	109	1	lifecycle	Landroidx/lifecycle/Lifecycle;
/*    */     //   0	109	2	minState	Landroidx/lifecycle/Lifecycle$State;
/*    */     //   0	109	3	dispatchQueue	Landroidx/lifecycle/DispatchQueue;
/*    */     //   0	109	4	parentJob	Lkotlinx/coroutines/Job;
/*    */   }
/*    */   
/*    */   private static final void observer$lambda$0(LifecycleController this$0, Job $parentJob, LifecycleOwner source, Lifecycle.Event paramEvent) {
/* 33 */     Intrinsics.checkNotNullParameter(this$0, "this$0"); Intrinsics.checkNotNullParameter($parentJob, "$parentJob"); Intrinsics.checkNotNullParameter(source, "source"); Intrinsics.checkNotNullParameter(paramEvent, "<anonymous parameter 1>");
/*    */ 
/*    */     
/* 36 */     LifecycleController this_$iv = this$0; int $i$f$handleDestroy = 0;
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
/* 75 */     Job.DefaultImpls.cancel$default($parentJob, null, 1, null);
/* 76 */     this_$iv.finish();
/*    */     if (source.getLifecycle().getCurrentState().compareTo(this$0.minState) < 0) {
/*    */       this$0.dispatchQueue.pause();
/*    */     } else {
/*    */       this$0.dispatchQueue.resume();
/*    */     } 
/*    */   }
/*    */   
/*    */   private final void handleDestroy(Job parentJob) {
/*    */     int $i$f$handleDestroy = 0;
/*    */     Job.DefaultImpls.cancel$default(parentJob, null, 1, null);
/*    */     finish();
/*    */   }
/*    */   
/*    */   @MainThread
/*    */   public final void finish() {
/*    */     this.lifecycle.removeObserver(this.observer);
/*    */     this.dispatchQueue.finish();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-common-jvm-2.8.5.jar!\androidx\lifecycle\LifecycleController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */