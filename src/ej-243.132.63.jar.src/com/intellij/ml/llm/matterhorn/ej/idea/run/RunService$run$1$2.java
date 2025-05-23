/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.run;
/*    */ 
/*    */ import com.intellij.concurrency.ThreadContext;
/*    */ import com.intellij.ml.llm.matterhorn.ej.idea.run.tests.TestConfigurationPopupInterceptor;
/*    */ import com.intellij.openapi.actionSystem.AnAction;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.application.AccessToken;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jdk7.AutoCloseableKt;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "RunService.kt", l = {75}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.idea.run.RunService$run$1$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class RunService$run$1$2
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore_2
/*    */     //   4: aload_0
/*    */     //   5: getfield label : I
/*    */     //   8: tableswitch default -> 78, 0 -> 32, 1 -> 68
/*    */     //   32: aload_1
/*    */     //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   36: aload_0
/*    */     //   37: getfield $action : Lcom/intellij/openapi/actionSystem/AnAction;
/*    */     //   40: aload_0
/*    */     //   41: getfield $event : Lcom/intellij/openapi/actionSystem/AnActionEvent;
/*    */     //   44: <illegal opcode> invoke : (Lcom/intellij/openapi/actionSystem/AnAction;Lcom/intellij/openapi/actionSystem/AnActionEvent;)Lkotlin/jvm/functions/Function0;
/*    */     //   49: aload_0
/*    */     //   50: checkcast kotlin/coroutines/Continuation
/*    */     //   53: aload_0
/*    */     //   54: iconst_1
/*    */     //   55: putfield label : I
/*    */     //   58: invokestatic writeIntentReadAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   61: dup
/*    */     //   62: aload_2
/*    */     //   63: if_acmpne -> 73
/*    */     //   66: aload_2
/*    */     //   67: areturn
/*    */     //   68: aload_1
/*    */     //   69: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   72: aload_1
/*    */     //   73: pop
/*    */     //   74: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   77: areturn
/*    */     //   78: new java/lang/IllegalStateException
/*    */     //   81: dup
/*    */     //   82: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   84: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   87: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #74	-> 3
/*    */     //   #75	-> 36
/*    */     //   #74	-> 66
/*    */     //   #82	-> 73
/*    */     //   #74	-> 78
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	88	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService$run$1$2;
/*    */     //   36	42	1	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   private static final Unit invokeSuspend$lambda$2(AnAction $action, AnActionEvent $event) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: aload_0
/*    */     //   3: aload_1
/*    */     //   4: <illegal opcode> run : (Lcom/intellij/openapi/actionSystem/AnAction;Lcom/intellij/openapi/actionSystem/AnActionEvent;)Ljava/lang/Runnable;
/*    */     //   9: invokestatic performDumbAwareWithCallbacks : (Lcom/intellij/openapi/actionSystem/AnAction;Lcom/intellij/openapi/actionSystem/AnActionEvent;Ljava/lang/Runnable;)V
/*    */     //   12: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   15: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #76	-> 0
/*    */     //   #81	-> 12
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	16	0	$action	Lcom/intellij/openapi/actionSystem/AnAction;
/*    */     //   0	16	1	$event	Lcom/intellij/openapi/actionSystem/AnActionEvent;
/*    */   }
/*    */   
/*    */   private static final void invokeSuspend$lambda$2$lambda$1(AnAction $action, AnActionEvent $event) {
/* 77 */     AutoCloseable autoCloseable = (AutoCloseable)ThreadContext.installThreadContext(ThreadContext.currentThreadContext().plus((CoroutineContext)TestConfigurationPopupInterceptor.Marker.INSTANCE), true); Throwable throwable = null; try { AccessToken it = (AccessToken)autoCloseable; int $i$a$-use-RunService$run$1$2$1$1$1 = 0;
/* 78 */       $action.actionPerformed($event);
/* 79 */       Unit unit = Unit.INSTANCE; }
/*    */     catch (Throwable throwable1)
/*    */     { throwable = throwable1 = null;
/*    */       throw throwable1; }
/*    */     finally
/*    */     { AutoCloseableKt.closeFinally(autoCloseable, throwable); }
/*    */   
/*    */   }
/*    */   
/*    */   RunService$run$1$2(AnAction $action, AnActionEvent $event, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super RunService$run$1$2> $completion) {
/*    */     return (Continuation<Unit>)new RunService$run$1$2(this.$action, this.$event, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((RunService$run$1$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\RunService$run$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */