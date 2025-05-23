/*    */ package com.intellij.ml.llm.matterhorn.ej.pycharm;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.jetbrains.python.inspections.PyInterpreterInspection;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.Boxing;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.Dispatchers;
/*    */ 
/*    */ @DebugMetadata(f = "PycharmJuniePrecondition.kt", l = {25}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.pycharm.PycharmJuniePrecondition$checkPythonInterpreter$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\013\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
/*    */ final class PycharmJuniePrecondition$checkPythonInterpreter$2 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
/*    */   int label;
/*    */   
/*    */   PycharmJuniePrecondition$checkPythonInterpreter$2(Project $project, Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 24 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 25 */         this.label = 1; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, null) { int label; public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 26 */                     PyInterpreterInspection.InterpreterSettingsQuickFix.showPythonInterpreterSettings(this.$project, null);
/* 27 */                     return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } }(Continuation)this) == object) return object;  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); PyInterpreterInspection.InterpreterSettingsQuickFix.showPythonInterpreterSettings(this.$project, null); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, $completion); }
/* 28 */               public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); return Boxing.boxBoolean(true);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Boxing.boxBoolean(true); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Continuation<? super PycharmJuniePrecondition$checkPythonInterpreter$2> $completion) {
/*    */     return (Continuation<Unit>)new PycharmJuniePrecondition$checkPythonInterpreter$2(this.$project, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(Continuation<?> p1) {
/*    */     return ((PycharmJuniePrecondition$checkPythonInterpreter$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\pycharm\PycharmJuniePrecondition$checkPythonInterpreter$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */