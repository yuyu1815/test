/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "MatterhornStarter.kt", l = {46}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"accumulator", "loggingJob"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ProjectOpener$awaitProjConfiguration$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020!\n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/ml/llm/matterhorn/ProjectProblem;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ @SourceDebugExtension({"SMAP\nMatterhornStarter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornStarter.kt\ncom/intellij/ml/llm/matterhorn/ProjectOpener$awaitProjConfiguration$2\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,86:1\n14#2:87\n*S KotlinDebug\n*F\n+ 1 MatterhornStarter.kt\ncom/intellij/ml/llm/matterhorn/ProjectOpener$awaitProjConfiguration$2\n*L\n47#1:87\n*E\n"})
/*    */ final class ProjectOpener$awaitProjConfiguration$2
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super List<ProjectProblem>>, Object>
/*    */ {
/*    */   Object L$1;
/*    */   int label;
/*    */   
/*    */   ProjectOpener$awaitProjConfiguration$2(Project $project, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore #6
/*    */     //   5: aload_0
/*    */     //   6: getfield label : I
/*    */     //   9: tableswitch default -> 175, 0 -> 32, 1 -> 106
/*    */     //   32: aload_1
/*    */     //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   36: aload_0
/*    */     //   37: getfield L$0 : Ljava/lang/Object;
/*    */     //   40: checkcast kotlinx/coroutines/CoroutineScope
/*    */     //   43: astore_2
/*    */     //   44: new java/util/ArrayList
/*    */     //   47: dup
/*    */     //   48: invokespecial <init> : ()V
/*    */     //   51: checkcast java/util/List
/*    */     //   54: astore_3
/*    */     //   55: getstatic com/intellij/ml/llm/matterhorn/ProjectOpener.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ProjectOpener;
/*    */     //   58: aload_2
/*    */     //   59: aload_3
/*    */     //   60: invokestatic access$installLogger : (Lcom/intellij/ml/llm/matterhorn/ProjectOpener;Lkotlinx/coroutines/CoroutineScope;Ljava/util/List;)Lkotlinx/coroutines/Job;
/*    */     //   63: astore #4
/*    */     //   65: aload_0
/*    */     //   66: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */     //   69: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   74: aload_0
/*    */     //   75: checkcast kotlin/coroutines/Continuation
/*    */     //   78: aload_0
/*    */     //   79: aload_3
/*    */     //   80: putfield L$0 : Ljava/lang/Object;
/*    */     //   83: aload_0
/*    */     //   84: aload #4
/*    */     //   86: putfield L$1 : Ljava/lang/Object;
/*    */     //   89: aload_0
/*    */     //   90: iconst_1
/*    */     //   91: putfield label : I
/*    */     //   94: invokestatic awaitCompleteProjectConfiguration : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   97: dup
/*    */     //   98: aload #6
/*    */     //   100: if_acmpne -> 128
/*    */     //   103: aload #6
/*    */     //   105: areturn
/*    */     //   106: aload_0
/*    */     //   107: getfield L$1 : Ljava/lang/Object;
/*    */     //   110: checkcast kotlinx/coroutines/Job
/*    */     //   113: astore #4
/*    */     //   115: aload_0
/*    */     //   116: getfield L$0 : Ljava/lang/Object;
/*    */     //   119: checkcast java/util/List
/*    */     //   122: astore_3
/*    */     //   123: aload_1
/*    */     //   124: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   127: aload_1
/*    */     //   128: checkcast com/intellij/openapi/project/configuration/ConfigurationResult
/*    */     //   131: astore #5
/*    */     //   133: aload #4
/*    */     //   135: aconst_null
/*    */     //   136: iconst_1
/*    */     //   137: aconst_null
/*    */     //   138: invokestatic cancel$default : (Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
/*    */     //   141: aload #5
/*    */     //   143: instanceof com/intellij/openapi/project/configuration/ConfigurationResult$Failure
/*    */     //   146: ifeq -> 173
/*    */     //   149: aload_3
/*    */     //   150: new com/intellij/ml/llm/matterhorn/ProjectProblem
/*    */     //   153: dup
/*    */     //   154: aload #5
/*    */     //   156: checkcast com/intellij/openapi/project/configuration/ConfigurationResult$Failure
/*    */     //   159: invokeinterface getMessage : ()Ljava/lang/String;
/*    */     //   164: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   167: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   172: pop
/*    */     //   173: aload_3
/*    */     //   174: areturn
/*    */     //   175: new java/lang/IllegalStateException
/*    */     //   178: dup
/*    */     //   179: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   181: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   184: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #42	-> 3
/*    */     //   #43	-> 44
/*    */     //   #43	-> 54
/*    */     //   #44	-> 55
/*    */     //   #46	-> 65
/*    */     //   #42	-> 103
/*    */     //   #49	-> 133
/*    */     //   #51	-> 141
/*    */     //   #52	-> 149
/*    */     //   #54	-> 173
/*    */     //   #42	-> 175
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   44	10	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*    */     //   54	11	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*    */     //   55	51	3	accumulator	Ljava/util/List;
/*    */     //   123	52	3	accumulator	Ljava/util/List;
/*    */     //   65	41	4	loggingJob	Lkotlinx/coroutines/Job;
/*    */     //   115	26	4	loggingJob	Lkotlinx/coroutines/Job;
/*    */     //   133	40	5	result	Lcom/intellij/openapi/project/configuration/ConfigurationResult;
/*    */     //   0	185	0	this	Lcom/intellij/ml/llm/matterhorn/ProjectOpener$awaitProjConfiguration$2;
/*    */     //   36	139	1	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super ProjectOpener$awaitProjConfiguration$2> $completion) {
/*    */     ProjectOpener$awaitProjConfiguration$2 projectOpener$awaitProjConfiguration$2 = new ProjectOpener$awaitProjConfiguration$2(this.$project, $completion);
/*    */     projectOpener$awaitProjConfiguration$2.L$0 = value;
/*    */     return (Continuation<Unit>)projectOpener$awaitProjConfiguration$2;
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((ProjectOpener$awaitProjConfiguration$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */   
/*    */   private static final Unit invokeSuspend$lambda$0(String it) {
/* 47 */     int $i$f$logger = 0;
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
/* 87 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(ProjectOpener.class), "getInstance(...)"); Logger.getInstance(ProjectOpener.class).info(it);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ProjectOpener$awaitProjConfiguration$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */