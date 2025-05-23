/*    */ package com.intellij.ml.llm.matterhorn.utils;
/*    */ 
/*    */ import com.intellij.history.ActivityId;
/*    */ import com.intellij.history.LocalHistory;
/*    */ import com.intellij.history.LocalHistoryAction;
/*    */ import com.intellij.openapi.command.WriteCommandAction;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function0;
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
/*    */ @DebugMetadata(f = "Coroutines.kt", l = {41}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.utils.CoroutinesKt$writeCommandAndLocalHistoryAction$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\003\n\002\030\002\020\000\032\n \002*\004\030\001H\001H\001\"\004\b\000\020\001*\0020\003H\n"}, d2 = {"<anonymous>", "T", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class CoroutinesKt$writeCommandAndLocalHistoryAction$2
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super T>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore_2
/*    */     //   4: aload_0
/*    */     //   5: getfield label : I
/*    */     //   8: tableswitch default -> 82, 0 -> 32, 1 -> 76
/*    */     //   32: aload_1
/*    */     //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   36: aload_0
/*    */     //   37: getfield $commandName : Ljava/lang/String;
/*    */     //   40: aload_0
/*    */     //   41: getfield $localHistoryActivityId : Lcom/intellij/history/ActivityId;
/*    */     //   44: aload_0
/*    */     //   45: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */     //   48: aload_0
/*    */     //   49: getfield $action : Lkotlin/jvm/functions/Function0;
/*    */     //   52: <illegal opcode> invoke : (Ljava/lang/String;Lcom/intellij/history/ActivityId;Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
/*    */     //   57: aload_0
/*    */     //   58: checkcast kotlin/coroutines/Continuation
/*    */     //   61: aload_0
/*    */     //   62: iconst_1
/*    */     //   63: putfield label : I
/*    */     //   66: invokestatic writeIntentReadAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   69: dup
/*    */     //   70: aload_2
/*    */     //   71: if_acmpne -> 81
/*    */     //   74: aload_2
/*    */     //   75: areturn
/*    */     //   76: aload_1
/*    */     //   77: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   80: aload_1
/*    */     //   81: areturn
/*    */     //   82: new java/lang/IllegalStateException
/*    */     //   85: dup
/*    */     //   86: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   88: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   91: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #40	-> 3
/*    */     //   #41	-> 36
/*    */     //   #40	-> 74
/*    */     //   #50	-> 81
/*    */     //   #40	-> 82
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	92	0	this	Lcom/intellij/ml/llm/matterhorn/utils/CoroutinesKt$writeCommandAndLocalHistoryAction$2;
/*    */     //   36	46	1	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   private static final Object invokeSuspend$lambda$1(String $commandName, ActivityId $localHistoryActivityId, Project $project, Function0 $action) {
/*    */     Object object;
/* 42 */     LocalHistoryAction localHistoryAction = LocalHistory.Companion.getInstance().startAction($commandName, $localHistoryActivityId);
/*    */ 
/*    */ 
/*    */     
/* 46 */     try { object = WriteCommandAction.writeCommandAction($project).withName($commandName).compute($action::invokeSuspend$lambda$1$lambda$0); }
/*    */     finally
/* 48 */     { localHistoryAction.finish(); }  return object;
/*    */   }
/*    */   
/*    */   private static final Object invokeSuspend$lambda$1$lambda$0(Function0 $tmp0) {
/*    */     return $tmp0.invoke();
/*    */   }
/*    */   
/*    */   CoroutinesKt$writeCommandAndLocalHistoryAction$2(String $commandName, ActivityId $localHistoryActivityId, Project $project, Function0<T> $action, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super CoroutinesKt$writeCommandAndLocalHistoryAction$2> $completion) {
/*    */     return (Continuation<Unit>)new CoroutinesKt$writeCommandAndLocalHistoryAction$2(this.$commandName, this.$localHistoryActivityId, this.$project, this.$action, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((CoroutinesKt$writeCommandAndLocalHistoryAction$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhor\\utils\CoroutinesKt$writeCommandAndLocalHistoryAction$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */