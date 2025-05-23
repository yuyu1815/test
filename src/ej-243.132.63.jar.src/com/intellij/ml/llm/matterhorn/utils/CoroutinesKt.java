/*    */ package com.intellij.ml.llm.matterhorn.utils;
/*    */ 
/*    */ import com.intellij.history.ActivityId;
/*    */ import com.intellij.history.LocalHistoryAction;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.Dispatchers;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000 \n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\032\"\020\000\032\002H\001\"\004\b\000\020\0012\f\020\002\032\b\022\004\022\002H\0010\003H@¢\006\002\020\004\032:\020\005\032\002H\001\"\004\b\000\020\0012\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\f\020\002\032\b\022\004\022\002H\0010\003H@¢\006\002\020\f¨\006\r"}, d2 = {"edtWriteAction", "T", "action", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeCommandAndLocalHistoryAction", "project", "Lcom/intellij/openapi/project/Project;", "commandName", "", "localHistoryActivityId", "Lcom/intellij/history/ActivityId;", "(Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lcom/intellij/history/ActivityId;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
/*    */ public final class CoroutinesKt {
/*    */   @Nullable
/* 23 */   public static final <T> Object edtWriteAction(@NotNull Function0<? extends T> action, @NotNull Continuation $completion) { return BuildersKt.withContext(com.intellij.openapi.application.CoroutinesKt.getEDT(Dispatchers.INSTANCE), new CoroutinesKt$edtWriteAction$2(action, null), $completion); } @DebugMetadata(f = "Coroutines.kt", l = {24}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.utils.CoroutinesKt$edtWriteAction$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\003\n\002\030\002\020\000\032\f\b\002 \002*\004\030\001H\001H\001\"\004\b\000\020\001*\0020\003H\n"}, d2 = {"<anonymous>", "T", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}) static final class CoroutinesKt$edtWriteAction$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> { int label; CoroutinesKt$edtWriteAction$2(Function0<T> $action, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 24 */           this.label = 1; if (com.intellij.openapi.progress.CoroutinesKt.blockingContext(this.$action::invokeSuspend$lambda$1, (Continuation)this) == object) return object;  return com.intellij.openapi.progress.CoroutinesKt.blockingContext(this.$action::invokeSuspend$lambda$1, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/* 25 */     public final Continuation<Unit> create(Object value, Continuation<? super CoroutinesKt$edtWriteAction$2> $completion) { return (Continuation<Unit>)new CoroutinesKt$edtWriteAction$2(this.$action, $completion); } private static final Object invokeSuspend$lambda$1$lambda$0(Function0 $tmp0) { return $tmp0.invoke(); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((CoroutinesKt$edtWriteAction$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } private static final Object invokeSuspend$lambda$1(Function0 $action) { return ApplicationManager.getApplication().runWriteAction($action::invokeSuspend$lambda$1$lambda$0); }
/*    */      }
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
/*    */   @Nullable
/*    */   public static final <T> Object writeCommandAndLocalHistoryAction(@NotNull Project project, @NotNull String commandName, @NotNull ActivityId localHistoryActivityId, @NotNull Function0<? extends T> action, @NotNull Continuation $completion) {
/* 40 */     return BuildersKt.withContext(com.intellij.openapi.application.CoroutinesKt.getEDT(Dispatchers.INSTANCE), new CoroutinesKt$writeCommandAndLocalHistoryAction$2(commandName, localHistoryActivityId, project, action, null), $completion);
/*    */   } @DebugMetadata(f = "Coroutines.kt", l = {41}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.utils.CoroutinesKt$writeCommandAndLocalHistoryAction$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\003\n\002\030\002\020\000\032\n \002*\004\030\001H\001H\001\"\004\b\000\020\001*\0020\003H\n"}, d2 = {"<anonymous>", "T", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}) static final class CoroutinesKt$writeCommandAndLocalHistoryAction$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> { int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore_2
/*    */       //   4: aload_0
/*    */       //   5: getfield label : I
/*    */       //   8: tableswitch default -> 82, 0 -> 32, 1 -> 76
/*    */       //   32: aload_1
/*    */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   36: aload_0
/*    */       //   37: getfield $commandName : Ljava/lang/String;
/*    */       //   40: aload_0
/*    */       //   41: getfield $localHistoryActivityId : Lcom/intellij/history/ActivityId;
/*    */       //   44: aload_0
/*    */       //   45: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */       //   48: aload_0
/*    */       //   49: getfield $action : Lkotlin/jvm/functions/Function0;
/*    */       //   52: <illegal opcode> invoke : (Ljava/lang/String;Lcom/intellij/history/ActivityId;Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
/*    */       //   57: aload_0
/*    */       //   58: checkcast kotlin/coroutines/Continuation
/*    */       //   61: aload_0
/*    */       //   62: iconst_1
/*    */       //   63: putfield label : I
/*    */       //   66: invokestatic writeIntentReadAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   69: dup
/*    */       //   70: aload_2
/*    */       //   71: if_acmpne -> 81
/*    */       //   74: aload_2
/*    */       //   75: areturn
/*    */       //   76: aload_1
/*    */       //   77: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   80: aload_1
/*    */       //   81: areturn
/*    */       //   82: new java/lang/IllegalStateException
/*    */       //   85: dup
/*    */       //   86: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   88: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   91: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #40	-> 3
/*    */       //   #41	-> 36
/*    */       //   #40	-> 74
/*    */       //   #50	-> 81
/*    */       //   #40	-> 82
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	92	0	this	Lcom/intellij/ml/llm/matterhorn/utils/CoroutinesKt$writeCommandAndLocalHistoryAction$2;
/*    */       //   36	46	1	$result	Ljava/lang/Object; } private static final Object invokeSuspend$lambda$1(String $commandName, ActivityId $localHistoryActivityId, Project $project, Function0 $action) { Object object;
/* 42 */       LocalHistoryAction localHistoryAction = LocalHistory.Companion.getInstance().startAction($commandName, $localHistoryActivityId);
/*    */ 
/*    */ 
/*    */       
/* 46 */       try { object = WriteCommandAction.writeCommandAction($project).withName($commandName).compute($action::invokeSuspend$lambda$1$lambda$0); }
/*    */       finally
/* 48 */       { localHistoryAction.finish(); }  return object; }
/*    */ 
/*    */     
/*    */     private static final Object invokeSuspend$lambda$1$lambda$0(Function0 $tmp0) {
/*    */       return $tmp0.invoke();
/*    */     }
/*    */     
/*    */     CoroutinesKt$writeCommandAndLocalHistoryAction$2(String $commandName, ActivityId $localHistoryActivityId, Project $project, Function0<T> $action, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super CoroutinesKt$writeCommandAndLocalHistoryAction$2> $completion) {
/*    */       return (Continuation<Unit>)new CoroutinesKt$writeCommandAndLocalHistoryAction$2(this.$commandName, this.$localHistoryActivityId, this.$project, this.$action, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((CoroutinesKt$writeCommandAndLocalHistoryAction$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhor\\utils\CoroutinesKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */