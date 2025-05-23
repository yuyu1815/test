/*    */ package androidx.lifecycle;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.Dispatchers;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\007\032\0020\004J\b\020\b\032\0020\tH\002R\016\020\003\032\0020\004X\016¢\006\002\n\000R\020\020\005\032\004\030\0010\006X\016¢\006\002\n\000¨\006\n"}, d2 = {"Landroidx/lifecycle/MainDispatcherChecker;", "", "()V", "isMainDispatcherAvailable", "", "mainDispatcherThread", "Ljava/lang/Thread;", "isMainDispatcherThread", "updateMainDispatcherThread", "", "lifecycle-runtime"})
/*    */ public final class MainDispatcherChecker
/*    */ {
/*    */   @NotNull
/* 22 */   public static final MainDispatcherChecker INSTANCE = new MainDispatcherChecker();
/*    */   
/*    */   private static boolean isMainDispatcherAvailable = true;
/*    */   
/*    */   private final void updateMainDispatcherThread() {
/*    */     try {
/* 28 */       BuildersKt.runBlocking((CoroutineContext)Dispatchers.getMain().getImmediate(), new MainDispatcherChecker$updateMainDispatcherThread$1(null));
/*    */     
/*    */     }
/* 31 */     catch (IllegalStateException _) {
/*    */       
/* 33 */       isMainDispatcherAvailable = false;
/*    */     } 
/*    */   } @Nullable
/*    */   private static volatile Thread mainDispatcherThread;
/*    */   public final boolean isMainDispatcherThread() {
/* 38 */     if (!isMainDispatcherAvailable)
/*    */     {
/* 40 */       return true;
/*    */     }
/*    */     
/* 43 */     Thread currentThread = Thread.currentThread();
/*    */ 
/*    */     
/* 46 */     if (currentThread == mainDispatcherThread) {
/* 47 */       return true;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 56 */     updateMainDispatcherThread();
/*    */     
/* 58 */     return (!isMainDispatcherAvailable || currentThread == mainDispatcherThread);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "MainDispatcherChecker.desktop.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.lifecycle.MainDispatcherChecker$updateMainDispatcherThread$1")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class MainDispatcherChecker$updateMainDispatcherThread$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     MainDispatcherChecker$updateMainDispatcherThread$1(Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           MainDispatcherChecker.mainDispatcherThread = Thread.currentThread();
/*    */           return Unit.INSTANCE;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super MainDispatcherChecker$updateMainDispatcherThread$1> $completion) {
/*    */       return (Continuation<Unit>)new MainDispatcherChecker$updateMainDispatcherThread$1($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((MainDispatcherChecker$updateMainDispatcherThread$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-runtime-desktop-2.8.5.jar!\androidx\lifecycle\MainDispatcherChecker.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */