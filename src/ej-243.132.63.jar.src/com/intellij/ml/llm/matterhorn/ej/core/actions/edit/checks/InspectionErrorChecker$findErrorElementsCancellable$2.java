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
/*    */ @DebugMetadata(f = "InspectionErrorChecker.kt", l = {67, 76}, i = {0, 1}, s = {"L$0", "L$0"}, n = {"$this$coroutineScope", "progressIndicator"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.InspectionErrorChecker$findErrorElementsCancellable$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker$SemanticError;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class InspectionErrorChecker$findErrorElementsCancellable$2
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super List<? extends InspectionErrorChecker.SemanticError>>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   InspectionErrorChecker$findErrorElementsCancellable$2(Project $project, PsiFile $file, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore #7
/*    */     //   5: aload_0
/*    */     //   6: getfield label : I
/*    */     //   9: tableswitch default -> 197, 0 -> 36, 1 -> 78, 2 -> 165
/*    */     //   36: aload_1
/*    */     //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   40: aload_0
/*    */     //   41: getfield L$0 : Ljava/lang/Object;
/*    */     //   44: checkcast kotlinx/coroutines/CoroutineScope
/*    */     //   47: astore_2
/*    */     //   48: aload_0
/*    */     //   49: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker;
/*    */     //   52: aload_0
/*    */     //   53: checkcast kotlin/coroutines/Continuation
/*    */     //   56: aload_0
/*    */     //   57: aload_2
/*    */     //   58: putfield L$0 : Ljava/lang/Object;
/*    */     //   61: aload_0
/*    */     //   62: iconst_1
/*    */     //   63: putfield label : I
/*    */     //   66: invokevirtual createIndicator : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   69: dup
/*    */     //   70: aload #7
/*    */     //   72: if_acmpne -> 91
/*    */     //   75: aload #7
/*    */     //   77: areturn
/*    */     //   78: aload_0
/*    */     //   79: getfield L$0 : Ljava/lang/Object;
/*    */     //   82: checkcast kotlinx/coroutines/CoroutineScope
/*    */     //   85: astore_2
/*    */     //   86: aload_1
/*    */     //   87: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   90: aload_1
/*    */     //   91: checkcast com/intellij/openapi/progress/util/ProgressIndicatorBase
/*    */     //   94: astore_3
/*    */     //   95: aload_2
/*    */     //   96: invokestatic getDefault : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*    */     //   99: checkcast kotlin/coroutines/CoroutineContext
/*    */     //   102: aconst_null
/*    */     //   103: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker$findErrorElementsCancellable$2$errors$1
/*    */     //   106: dup
/*    */     //   107: aload_0
/*    */     //   108: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker;
/*    */     //   111: aload_0
/*    */     //   112: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */     //   115: aload_0
/*    */     //   116: getfield $file : Lcom/intellij/psi/PsiFile;
/*    */     //   119: aload_3
/*    */     //   120: aconst_null
/*    */     //   121: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lcom/intellij/openapi/progress/util/ProgressIndicatorBase;Lkotlin/coroutines/Continuation;)V
/*    */     //   124: checkcast kotlin/jvm/functions/Function2
/*    */     //   127: iconst_2
/*    */     //   128: aconst_null
/*    */     //   129: invokestatic async$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
/*    */     //   132: astore #4
/*    */     //   134: nop
/*    */     //   135: aload #4
/*    */     //   137: aload_0
/*    */     //   138: checkcast kotlin/coroutines/Continuation
/*    */     //   141: aload_0
/*    */     //   142: aload_3
/*    */     //   143: putfield L$0 : Ljava/lang/Object;
/*    */     //   146: aload_0
/*    */     //   147: iconst_2
/*    */     //   148: putfield label : I
/*    */     //   151: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   156: dup
/*    */     //   157: aload #7
/*    */     //   159: if_acmpne -> 179
/*    */     //   162: aload #7
/*    */     //   164: areturn
/*    */     //   165: aload_0
/*    */     //   166: getfield L$0 : Ljava/lang/Object;
/*    */     //   169: checkcast com/intellij/openapi/progress/util/ProgressIndicatorBase
/*    */     //   172: astore_3
/*    */     //   173: nop
/*    */     //   174: aload_1
/*    */     //   175: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   178: aload_1
/*    */     //   179: astore #5
/*    */     //   181: aload_3
/*    */     //   182: invokevirtual cancel : ()V
/*    */     //   185: aload #5
/*    */     //   187: areturn
/*    */     //   188: astore #6
/*    */     //   190: aload_3
/*    */     //   191: invokevirtual cancel : ()V
/*    */     //   194: aload #6
/*    */     //   196: athrow
/*    */     //   197: new java/lang/IllegalStateException
/*    */     //   200: dup
/*    */     //   201: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   203: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   206: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #66	-> 3
/*    */     //   #67	-> 48
/*    */     //   #66	-> 75
/*    */     //   #69	-> 95
/*    */     //   #75	-> 134
/*    */     //   #76	-> 135
/*    */     //   #66	-> 162
/*    */     //   #78	-> 181
/*    */     //   #76	-> 187
/*    */     //   #78	-> 188
/*    */     //   #66	-> 197
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   48	30	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*    */     //   86	48	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*    */     //   95	70	3	progressIndicator	Lcom/intellij/openapi/progress/util/ProgressIndicatorBase;
/*    */     //   173	12	3	progressIndicator	Lcom/intellij/openapi/progress/util/ProgressIndicatorBase;
/*    */     //   188	9	3	progressIndicator	Lcom/intellij/openapi/progress/util/ProgressIndicatorBase;
/*    */     //   134	22	4	errors	Lkotlinx/coroutines/Deferred;
/*    */     //   0	207	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker$findErrorElementsCancellable$2;
/*    */     //   40	157	1	$result	Ljava/lang/Object;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   134	156	188	finally
/*    */     //   173	181	188	finally
/*    */     //   188	190	188	finally
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super InspectionErrorChecker$findErrorElementsCancellable$2> $completion) {
/*    */     InspectionErrorChecker$findErrorElementsCancellable$2 inspectionErrorChecker$findErrorElementsCancellable$2 = new InspectionErrorChecker$findErrorElementsCancellable$2(this.$project, this.$file, $completion);
/*    */     inspectionErrorChecker$findErrorElementsCancellable$2.L$0 = value;
/*    */     return (Continuation<Unit>)inspectionErrorChecker$findErrorElementsCancellable$2;
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((InspectionErrorChecker$findErrorElementsCancellable$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "InspectionErrorChecker.kt", l = {70}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.InspectionErrorChecker$findErrorElementsCancellable$2$errors$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker$SemanticError;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class InspectionErrorChecker$findErrorElementsCancellable$2$errors$1
/*    */     extends SuspendLambda
/*    */     implements Function2<CoroutineScope, Continuation<? super List<? extends InspectionErrorChecker.SemanticError>>, Object>
/*    */   {
/*    */     int label;
/*    */     
/*    */     InspectionErrorChecker$findErrorElementsCancellable$2$errors$1(Project $project, PsiFile $file, ProgressIndicatorBase $progressIndicator, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore_2
/*    */       //   4: aload_0
/*    */       //   5: getfield label : I
/*    */       //   8: tableswitch default -> 82, 0 -> 32, 1 -> 76
/*    */       //   32: aload_1
/*    */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   36: aload_0
/*    */       //   37: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker;
/*    */       //   40: aload_0
/*    */       //   41: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */       //   44: aload_0
/*    */       //   45: getfield $file : Lcom/intellij/psi/PsiFile;
/*    */       //   48: aload_0
/*    */       //   49: getfield $progressIndicator : Lcom/intellij/openapi/progress/util/ProgressIndicatorBase;
/*    */       //   52: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lcom/intellij/openapi/progress/util/ProgressIndicatorBase;)Lkotlin/jvm/functions/Function0;
/*    */       //   57: aload_0
/*    */       //   58: checkcast kotlin/coroutines/Continuation
/*    */       //   61: aload_0
/*    */       //   62: iconst_1
/*    */       //   63: putfield label : I
/*    */       //   66: invokestatic blockingContext : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
/*    */       //   #69	-> 3
/*    */       //   #70	-> 36
/*    */       //   #69	-> 74
/*    */       //   #72	-> 81
/*    */       //   #69	-> 82
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	92	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker$findErrorElementsCancellable$2$errors$1;
/*    */       //   36	46	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super InspectionErrorChecker$findErrorElementsCancellable$2$errors$1> $completion) {
/*    */       return (Continuation<Unit>)new InspectionErrorChecker$findErrorElementsCancellable$2$errors$1(this.$project, this.$file, this.$progressIndicator, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((InspectionErrorChecker$findErrorElementsCancellable$2$errors$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */     
/*    */     private static final List invokeSuspend$lambda$0(InspectionErrorChecker this$0, Project $project, PsiFile $file, ProgressIndicatorBase $progressIndicator) {
/* 71 */       return InspectionErrorChecker.access$findErrorElements(InspectionErrorChecker.this, $project, $file, (ProgressIndicatorEx)$progressIndicator);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\checks\InspectionErrorChecker$findErrorElementsCancellable$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */