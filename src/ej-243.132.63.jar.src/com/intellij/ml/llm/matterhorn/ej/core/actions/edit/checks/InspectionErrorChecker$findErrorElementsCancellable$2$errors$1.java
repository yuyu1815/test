/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks;
/*    */ 
/*    */ import com.intellij.openapi.progress.util.ProgressIndicatorBase;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.wm.ex.ProgressIndicatorEx;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
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
/*    */ @DebugMetadata(f = "InspectionErrorChecker.kt", l = {70}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.InspectionErrorChecker$findErrorElementsCancellable$2$errors$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker$SemanticError;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class InspectionErrorChecker$findErrorElementsCancellable$2$errors$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super List<? extends InspectionErrorChecker.SemanticError>>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   InspectionErrorChecker$findErrorElementsCancellable$2$errors$1(Project $project, PsiFile $file, ProgressIndicatorBase $progressIndicator, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
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
/*    */     //   37: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker;
/*    */     //   40: aload_0
/*    */     //   41: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */     //   44: aload_0
/*    */     //   45: getfield $file : Lcom/intellij/psi/PsiFile;
/*    */     //   48: aload_0
/*    */     //   49: getfield $progressIndicator : Lcom/intellij/openapi/progress/util/ProgressIndicatorBase;
/*    */     //   52: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lcom/intellij/openapi/progress/util/ProgressIndicatorBase;)Lkotlin/jvm/functions/Function0;
/*    */     //   57: aload_0
/*    */     //   58: checkcast kotlin/coroutines/Continuation
/*    */     //   61: aload_0
/*    */     //   62: iconst_1
/*    */     //   63: putfield label : I
/*    */     //   66: invokestatic blockingContext : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
/*    */     //   #69	-> 3
/*    */     //   #70	-> 36
/*    */     //   #69	-> 74
/*    */     //   #72	-> 81
/*    */     //   #69	-> 82
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	92	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker$findErrorElementsCancellable$2$errors$1;
/*    */     //   36	46	1	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super InspectionErrorChecker$findErrorElementsCancellable$2$errors$1> $completion) {
/*    */     return (Continuation<Unit>)new InspectionErrorChecker$findErrorElementsCancellable$2$errors$1(this.$project, this.$file, this.$progressIndicator, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((InspectionErrorChecker$findErrorElementsCancellable$2$errors$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */   
/*    */   private static final List invokeSuspend$lambda$0(InspectionErrorChecker this$0, Project $project, PsiFile $file, ProgressIndicatorBase $progressIndicator) {
/* 71 */     return InspectionErrorChecker.access$findErrorElements(InspectionErrorChecker.this, $project, $file, (ProgressIndicatorEx)$progressIndicator);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\checks\InspectionErrorChecker$findErrorElementsCancellable$2$errors$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */