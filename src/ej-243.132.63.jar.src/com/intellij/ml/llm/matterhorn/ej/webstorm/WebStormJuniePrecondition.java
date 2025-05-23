/*    */ package com.intellij.ml.llm.matterhorn.ej.webstorm;
/*    */ import com.intellij.lang.javascript.JavaScriptBundle;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.JuniePreconditionChecker;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\026J\022\020\t\032\004\030\0010\0062\006\020\007\032\0020\bH\002J\020\020\n\032\0020\0132\006\020\007\032\0020\bH\002¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/webstorm/WebStormJuniePrecondition;", "Lcom/intellij/ml/llm/matterhorn/ej/core/DefaultJuniePreconditionChecker;", "<init>", "()V", "canRunJunie", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;", "project", "Lcom/intellij/openapi/project/Project;", "checkNodeInterpreter", "hasNodeInterpreter", "", "ej-webstorm"})
/*    */ public final class WebStormJuniePrecondition extends DefaultJuniePreconditionChecker {
/*    */   @NotNull
/*    */   public List<JuniePreconditionChecker.JunieProblem> canRunJunie(@NotNull Project project) {
/* 16 */     Intrinsics.checkNotNullParameter(project, "project"); return CollectionsKt.plus(super.canRunJunie(project), CollectionsKt.listOfNotNull(
/* 17 */           checkNodeInterpreter(project)));
/*    */   }
/*    */   
/*    */   private final JuniePreconditionChecker.JunieProblem checkNodeInterpreter(Project project)
/*    */   {
/* 22 */     if (hasNodeInterpreter(project)) {
/* 23 */       return null;
/*    */     }
/*    */ 
/*    */     
/* 27 */     Object[] arrayOfObject2 = new Object[1]; arrayOfObject2[0] = "Junie"; Intrinsics.checkNotNullExpressionValue(JavaScriptBundle.message("node.download.editor.suggestion", arrayOfObject2), "message(...)");
/* 28 */     Object[] arrayOfObject1 = new Object[1]; arrayOfObject1[0] = "Node.js"; return new JuniePreconditionChecker.JunieProblem(JavaScriptBundle.message("node.download.editor.suggestion", arrayOfObject2), JavaScriptBundle.message("node.js.configure.interpreter", arrayOfObject1), 
/* 29 */         new WebStormJuniePrecondition$checkNodeInterpreter$1(project, null)); } @DebugMetadata(f = "WebStormJuniePrecondition.kt", l = {30}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.webstorm.WebStormJuniePrecondition$checkNodeInterpreter$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\013\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""}) static final class WebStormJuniePrecondition$checkNodeInterpreter$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> { int label; WebStormJuniePrecondition$checkNodeInterpreter$1(Project $project, Continuation $completion) { super(1, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 30 */           this.label = 1; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, null) { int label; public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 31 */                       NodeSettingsConfigurable.showSettingsDialog(this.$project);
/* 32 */                       return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } }(Continuation)this) == object) return object;  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); NodeSettingsConfigurable.showSettingsDialog(this.$project); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, $completion); }
/* 33 */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); return Boxing.boxBoolean(WebStormJuniePrecondition.this.hasNodeInterpreter(this.$project));case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Boxing.boxBoolean(WebStormJuniePrecondition.this.hasNodeInterpreter(this.$project)); }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Continuation<? super WebStormJuniePrecondition$checkNodeInterpreter$1> $completion) { return (Continuation<Unit>)new WebStormJuniePrecondition$checkNodeInterpreter$1(this.$project, $completion); }
/*    */     public final Object invoke(Continuation<?> p1) { return ((WebStormJuniePrecondition$checkNodeInterpreter$1)create(p1)).invokeSuspend(Unit.INSTANCE); } }
/*    */   private final boolean hasNodeInterpreter(Project project) {
/* 38 */     return (NodeJsInterpreterManager.getInstance(project).getInterpreterRef().resolve(project) != null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\webstorm\WebStormJuniePrecondition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */