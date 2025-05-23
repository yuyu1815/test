/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.project.configuration.HeadlessLogging;
/*    */ import java.util.List;
/*    */ import kotlin.KotlinNothingValueException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.CoroutineScopeKt;
/*    */ import kotlinx.coroutines.Job;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020!\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\034\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH@¢\006\002\020\tJ\032\020\n\032\0020\013*\0020\f2\f\020\r\032\b\022\004\022\0020\0060\016H\002¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectOpener;", "", "<init>", "()V", "awaitProjConfiguration", "", "Lcom/intellij/ml/llm/matterhorn/ProjectProblem;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installLogger", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;", "accumulator", "", "core"})
/*    */ public final class ProjectOpener
/*    */ {
/*    */   @NotNull
/*    */   public static final ProjectOpener INSTANCE = new ProjectOpener();
/*    */   
/*    */   @Nullable
/*    */   public final Object awaitProjConfiguration(@NotNull Project project, @NotNull Continuation $completion) {
/* 42 */     return CoroutineScopeKt.coroutineScope(new ProjectOpener$awaitProjConfiguration$2(project, null), $completion);
/*    */   } @DebugMetadata(f = "MatterhornStarter.kt", l = {46}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"accumulator", "loggingJob"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ProjectOpener$awaitProjConfiguration$2")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020!\n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/ml/llm/matterhorn/ProjectProblem;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   @SourceDebugExtension({"SMAP\nMatterhornStarter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornStarter.kt\ncom/intellij/ml/llm/matterhorn/ProjectOpener$awaitProjConfiguration$2\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,86:1\n14#2:87\n*S KotlinDebug\n*F\n+ 1 MatterhornStarter.kt\ncom/intellij/ml/llm/matterhorn/ProjectOpener$awaitProjConfiguration$2\n*L\n47#1:87\n*E\n"})
/*    */   static final class ProjectOpener$awaitProjConfiguration$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<ProjectProblem>>, Object> { private static final Unit invokeSuspend$lambda$0(String it) {
/* 47 */       int $i$f$logger = 0;
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
/* 87 */       Intrinsics.checkNotNullExpressionValue(Logger.getInstance(ProjectOpener.class), "getInstance(...)"); Logger.getInstance(ProjectOpener.class).info(it);
/*    */       return Unit.INSTANCE;
/*    */     }
/*    */     
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     ProjectOpener$awaitProjConfiguration$2(Project $project, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore #6
/*    */       //   5: aload_0
/*    */       //   6: getfield label : I
/*    */       //   9: tableswitch default -> 175, 0 -> 32, 1 -> 106
/*    */       //   32: aload_1
/*    */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   36: aload_0
/*    */       //   37: getfield L$0 : Ljava/lang/Object;
/*    */       //   40: checkcast kotlinx/coroutines/CoroutineScope
/*    */       //   43: astore_2
/*    */       //   44: new java/util/ArrayList
/*    */       //   47: dup
/*    */       //   48: invokespecial <init> : ()V
/*    */       //   51: checkcast java/util/List
/*    */       //   54: astore_3
/*    */       //   55: getstatic com/intellij/ml/llm/matterhorn/ProjectOpener.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ProjectOpener;
/*    */       //   58: aload_2
/*    */       //   59: aload_3
/*    */       //   60: invokestatic access$installLogger : (Lcom/intellij/ml/llm/matterhorn/ProjectOpener;Lkotlinx/coroutines/CoroutineScope;Ljava/util/List;)Lkotlinx/coroutines/Job;
/*    */       //   63: astore #4
/*    */       //   65: aload_0
/*    */       //   66: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */       //   69: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */       //   74: aload_0
/*    */       //   75: checkcast kotlin/coroutines/Continuation
/*    */       //   78: aload_0
/*    */       //   79: aload_3
/*    */       //   80: putfield L$0 : Ljava/lang/Object;
/*    */       //   83: aload_0
/*    */       //   84: aload #4
/*    */       //   86: putfield L$1 : Ljava/lang/Object;
/*    */       //   89: aload_0
/*    */       //   90: iconst_1
/*    */       //   91: putfield label : I
/*    */       //   94: invokestatic awaitCompleteProjectConfiguration : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   97: dup
/*    */       //   98: aload #6
/*    */       //   100: if_acmpne -> 128
/*    */       //   103: aload #6
/*    */       //   105: areturn
/*    */       //   106: aload_0
/*    */       //   107: getfield L$1 : Ljava/lang/Object;
/*    */       //   110: checkcast kotlinx/coroutines/Job
/*    */       //   113: astore #4
/*    */       //   115: aload_0
/*    */       //   116: getfield L$0 : Ljava/lang/Object;
/*    */       //   119: checkcast java/util/List
/*    */       //   122: astore_3
/*    */       //   123: aload_1
/*    */       //   124: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   127: aload_1
/*    */       //   128: checkcast com/intellij/openapi/project/configuration/ConfigurationResult
/*    */       //   131: astore #5
/*    */       //   133: aload #4
/*    */       //   135: aconst_null
/*    */       //   136: iconst_1
/*    */       //   137: aconst_null
/*    */       //   138: invokestatic cancel$default : (Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
/*    */       //   141: aload #5
/*    */       //   143: instanceof com/intellij/openapi/project/configuration/ConfigurationResult$Failure
/*    */       //   146: ifeq -> 173
/*    */       //   149: aload_3
/*    */       //   150: new com/intellij/ml/llm/matterhorn/ProjectProblem
/*    */       //   153: dup
/*    */       //   154: aload #5
/*    */       //   156: checkcast com/intellij/openapi/project/configuration/ConfigurationResult$Failure
/*    */       //   159: invokeinterface getMessage : ()Ljava/lang/String;
/*    */       //   164: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   167: invokeinterface add : (Ljava/lang/Object;)Z
/*    */       //   172: pop
/*    */       //   173: aload_3
/*    */       //   174: areturn
/*    */       //   175: new java/lang/IllegalStateException
/*    */       //   178: dup
/*    */       //   179: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   181: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   184: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #42	-> 3
/*    */       //   #43	-> 44
/*    */       //   #43	-> 54
/*    */       //   #44	-> 55
/*    */       //   #46	-> 65
/*    */       //   #42	-> 103
/*    */       //   #49	-> 133
/*    */       //   #51	-> 141
/*    */       //   #52	-> 149
/*    */       //   #54	-> 173
/*    */       //   #42	-> 175
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   44	10	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*    */       //   54	11	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*    */       //   55	51	3	accumulator	Ljava/util/List;
/*    */       //   123	52	3	accumulator	Ljava/util/List;
/*    */       //   65	41	4	loggingJob	Lkotlinx/coroutines/Job;
/*    */       //   115	26	4	loggingJob	Lkotlinx/coroutines/Job;
/*    */       //   133	40	5	result	Lcom/intellij/openapi/project/configuration/ConfigurationResult;
/*    */       //   0	185	0	this	Lcom/intellij/ml/llm/matterhorn/ProjectOpener$awaitProjConfiguration$2;
/*    */       //   36	139	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super ProjectOpener$awaitProjConfiguration$2> $completion) {
/*    */       ProjectOpener$awaitProjConfiguration$2 projectOpener$awaitProjConfiguration$2 = new ProjectOpener$awaitProjConfiguration$2(this.$project, $completion);
/*    */       projectOpener$awaitProjConfiguration$2.L$0 = value;
/*    */       return (Continuation<Unit>)projectOpener$awaitProjConfiguration$2;
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((ProjectOpener$awaitProjConfiguration$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */   
/*    */   private final Job installLogger(CoroutineScope $this$installLogger, List<ProjectProblem> accumulator) {
/*    */     return BuildersKt.launch$default($this$installLogger, null, null, new ProjectOpener$installLogger$1(accumulator, null), 3, null);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "MatterhornStarter.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ProjectOpener$installLogger$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class ProjectOpener$installLogger$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     ProjectOpener$installLogger$1(List<ProjectProblem> $accumulator, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       CoroutineScope $this$launch;
/*    */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           $this$launch = (CoroutineScope)this.L$0;
/*    */           BuildersKt.launch$default($this$launch, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$accumulator, null) {
/*    */                 int label;
/*    */                 
/*    */                 public final Object invokeSuspend(Object $result) {
/*    */                   Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */                   switch (this.label) {
/*    */                     case 0:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       this.label = 1;
/*    */                       if (HeadlessLogging.INSTANCE.loggingFlow().collect(new FlowCollector(this.$accumulator) {
/*    */                             public final Object emit(HeadlessLogging.LogEntry param2LogEntry, Continuation $completion) {
/*    */                               // Byte code:
/*    */                               //   0: aload_1
/*    */                               //   1: invokevirtual component1 : ()Lcom/intellij/openapi/project/configuration/HeadlessLogging$SeverityKind;
/*    */                               //   4: astore_3
/*    */                               //   5: aload_1
/*    */                               //   6: invokevirtual component2 : ()Lcom/intellij/openapi/project/configuration/HeadlessLogging$Message;
/*    */                               //   9: astore #4
/*    */                               //   11: aload_3
/*    */                               //   12: getstatic com/intellij/ml/llm/matterhorn/ProjectOpener$installLogger$1$1$1$WhenMappings.$EnumSwitchMapping$0 : [I
/*    */                               //   15: swap
/*    */                               //   16: invokevirtual ordinal : ()I
/*    */                               //   19: iaload
/*    */                               //   20: tableswitch default -> 148, 1 -> 48, 2 -> 51, 3 -> 54
/*    */                               //   48: goto -> 156
/*    */                               //   51: goto -> 156
/*    */                               //   54: aload #4
/*    */                               //   56: astore #6
/*    */                               //   58: aload #6
/*    */                               //   60: instanceof com/intellij/openapi/project/configuration/HeadlessLogging$Message$Exception
/*    */                               //   63: ifeq -> 94
/*    */                               //   66: new com/intellij/ml/llm/matterhorn/ProjectProblem
/*    */                               //   69: dup
/*    */                               //   70: aload #4
/*    */                               //   72: checkcast com/intellij/openapi/project/configuration/HeadlessLogging$Message$Exception
/*    */                               //   75: invokevirtual unbox-impl : ()Ljava/lang/Throwable;
/*    */                               //   78: invokevirtual getMessage : ()Ljava/lang/String;
/*    */                               //   81: dup
/*    */                               //   82: ifnonnull -> 88
/*    */                               //   85: pop
/*    */                               //   86: ldc '<UNKNOWN>'
/*    */                               //   88: invokespecial <init> : (Ljava/lang/String;)V
/*    */                               //   91: goto -> 128
/*    */                               //   94: aload #6
/*    */                               //   96: instanceof com/intellij/openapi/project/configuration/HeadlessLogging$Message$Plain
/*    */                               //   99: ifeq -> 120
/*    */                               //   102: new com/intellij/ml/llm/matterhorn/ProjectProblem
/*    */                               //   105: dup
/*    */                               //   106: aload #4
/*    */                               //   108: checkcast com/intellij/openapi/project/configuration/HeadlessLogging$Message$Plain
/*    */                               //   111: invokevirtual unbox-impl : ()Ljava/lang/String;
/*    */                               //   114: invokespecial <init> : (Ljava/lang/String;)V
/*    */                               //   117: goto -> 128
/*    */                               //   120: new kotlin/NoWhenBranchMatchedException
/*    */                               //   123: dup
/*    */                               //   124: invokespecial <init> : ()V
/*    */                               //   127: athrow
/*    */                               //   128: astore #5
/*    */                               //   130: aload_0
/*    */                               //   131: getfield $accumulator : Ljava/util/List;
/*    */                               //   134: aload #5
/*    */                               //   136: invokeinterface add : (Ljava/lang/Object;)Z
/*    */                               //   141: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */                               //   144: pop
/*    */                               //   145: goto -> 156
/*    */                               //   148: new kotlin/NoWhenBranchMatchedException
/*    */                               //   151: dup
/*    */                               //   152: invokespecial <init> : ()V
/*    */                               //   155: athrow
/*    */                               //   156: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */                               //   159: areturn
/*    */                               // Line number table:
/*    */                               //   Java source line number -> byte code offset
/*    */                               //   #61	-> 0
/*    */                               //   #62	-> 11
/*    */                               //   #66	-> 54
/*    */                               //   #67	-> 58
/*    */                               //   #68	-> 94
/*    */                               //   #66	-> 120
/*    */                               //   #70	-> 130
/*    */                               //   #62	-> 148
/*    */                               //   #73	-> 156
/*    */                               // Local variable table:
/*    */                               //   start	length	slot	name	descriptor
/*    */                               //   130	11	5	problem	Lcom/intellij/ml/llm/matterhorn/ProjectProblem;
/*    */                               //   5	155	3	severity	Lcom/intellij/openapi/project/configuration/HeadlessLogging$SeverityKind;
/*    */                               //   11	149	4	message	Lcom/intellij/openapi/project/configuration/HeadlessLogging$Message;
/*    */                               //   0	160	0	this	Lcom/intellij/ml/llm/matterhorn/ProjectOpener$installLogger$1$1$1;
/*    */                               //   0	160	2	$completion	Lkotlin/coroutines/Continuation;
/*    */                             }
/*    */                           },  (Continuation)this) == object)
/*    */                         return object; 
/*    */                       HeadlessLogging.INSTANCE.loggingFlow().collect(new FlowCollector(this.$accumulator) {
/*    */                             public final Object emit(HeadlessLogging.LogEntry param2LogEntry, Continuation $completion) {
/*    */                               // Byte code:
/*    */                               //   0: aload_1
/*    */                               //   1: invokevirtual component1 : ()Lcom/intellij/openapi/project/configuration/HeadlessLogging$SeverityKind;
/*    */                               //   4: astore_3
/*    */                               //   5: aload_1
/*    */                               //   6: invokevirtual component2 : ()Lcom/intellij/openapi/project/configuration/HeadlessLogging$Message;
/*    */                               //   9: astore #4
/*    */                               //   11: aload_3
/*    */                               //   12: getstatic com/intellij/ml/llm/matterhorn/ProjectOpener$installLogger$1$1$1$WhenMappings.$EnumSwitchMapping$0 : [I
/*    */                               //   15: swap
/*    */                               //   16: invokevirtual ordinal : ()I
/*    */                               //   19: iaload
/*    */                               //   20: tableswitch default -> 148, 1 -> 48, 2 -> 51, 3 -> 54
/*    */                               //   48: goto -> 156
/*    */                               //   51: goto -> 156
/*    */                               //   54: aload #4
/*    */                               //   56: astore #6
/*    */                               //   58: aload #6
/*    */                               //   60: instanceof com/intellij/openapi/project/configuration/HeadlessLogging$Message$Exception
/*    */                               //   63: ifeq -> 94
/*    */                               //   66: new com/intellij/ml/llm/matterhorn/ProjectProblem
/*    */                               //   69: dup
/*    */                               //   70: aload #4
/*    */                               //   72: checkcast com/intellij/openapi/project/configuration/HeadlessLogging$Message$Exception
/*    */                               //   75: invokevirtual unbox-impl : ()Ljava/lang/Throwable;
/*    */                               //   78: invokevirtual getMessage : ()Ljava/lang/String;
/*    */                               //   81: dup
/*    */                               //   82: ifnonnull -> 88
/*    */                               //   85: pop
/*    */                               //   86: ldc '<UNKNOWN>'
/*    */                               //   88: invokespecial <init> : (Ljava/lang/String;)V
/*    */                               //   91: goto -> 128
/*    */                               //   94: aload #6
/*    */                               //   96: instanceof com/intellij/openapi/project/configuration/HeadlessLogging$Message$Plain
/*    */                               //   99: ifeq -> 120
/*    */                               //   102: new com/intellij/ml/llm/matterhorn/ProjectProblem
/*    */                               //   105: dup
/*    */                               //   106: aload #4
/*    */                               //   108: checkcast com/intellij/openapi/project/configuration/HeadlessLogging$Message$Plain
/*    */                               //   111: invokevirtual unbox-impl : ()Ljava/lang/String;
/*    */                               //   114: invokespecial <init> : (Ljava/lang/String;)V
/*    */                               //   117: goto -> 128
/*    */                               //   120: new kotlin/NoWhenBranchMatchedException
/*    */                               //   123: dup
/*    */                               //   124: invokespecial <init> : ()V
/*    */                               //   127: athrow
/*    */                               //   128: astore #5
/*    */                               //   130: aload_0
/*    */                               //   131: getfield $accumulator : Ljava/util/List;
/*    */                               //   134: aload #5
/*    */                               //   136: invokeinterface add : (Ljava/lang/Object;)Z
/*    */                               //   141: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */                               //   144: pop
/*    */                               //   145: goto -> 156
/*    */                               //   148: new kotlin/NoWhenBranchMatchedException
/*    */                               //   151: dup
/*    */                               //   152: invokespecial <init> : ()V
/*    */                               //   155: athrow
/*    */                               //   156: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */                               //   159: areturn
/*    */                               // Line number table:
/*    */                               //   Java source line number -> byte code offset
/*    */                               //   #61	-> 0
/*    */                               //   #62	-> 11
/*    */                               //   #66	-> 54
/*    */                               //   #67	-> 58
/*    */                               //   #68	-> 94
/*    */                               //   #66	-> 120
/*    */                               //   #70	-> 130
/*    */                               //   #62	-> 148
/*    */                               //   #73	-> 156
/*    */                               // Local variable table:
/*    */                               //   start	length	slot	name	descriptor
/*    */                               //   130	11	5	problem	Lcom/intellij/ml/llm/matterhorn/ProjectProblem;
/*    */                               //   5	155	3	severity	Lcom/intellij/openapi/project/configuration/HeadlessLogging$SeverityKind;
/*    */                               //   11	149	4	message	Lcom/intellij/openapi/project/configuration/HeadlessLogging$Message;
/*    */                               //   0	160	0	this	Lcom/intellij/ml/llm/matterhorn/ProjectOpener$installLogger$1$1$1;
/*    */                               //   0	160	2	$completion	Lkotlin/coroutines/Continuation;
/*    */                             }
/*    */                           },  (Continuation)this);
/*    */                       throw new KotlinNothingValueException();
/*    */                     case 1:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       throw new KotlinNothingValueException();
/*    */                   } 
/*    */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */                 }
/*    */                 
/*    */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */                   return (Continuation)new Function2<>(this.$accumulator, $completion);
/*    */                 }
/*    */                 
/*    */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */                 }
/*    */               }3, null);
/*    */           BuildersKt.launch$default($this$launch, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) {
/*    */                 int label;
/*    */                 
/*    */                 public final Object invokeSuspend(Object $result) {
/*    */                   // Byte code:
/*    */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */                   //   3: astore #6
/*    */                   //   5: aload_0
/*    */                   //   6: getfield label : I
/*    */                   //   9: tableswitch default -> 175, 0 -> 32, 1 -> 70
/*    */                   //   32: aload_1
/*    */                   //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                   //   36: nop
/*    */                   //   37: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*    */                   //   40: pop
/*    */                   //   41: bipush #30
/*    */                   //   43: getstatic kotlin/time/DurationUnit.SECONDS : Lkotlin/time/DurationUnit;
/*    */                   //   46: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*    */                   //   49: aload_0
/*    */                   //   50: checkcast kotlin/coroutines/Continuation
/*    */                   //   53: aload_0
/*    */                   //   54: iconst_1
/*    */                   //   55: putfield label : I
/*    */                   //   58: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */                   //   61: dup
/*    */                   //   62: aload #6
/*    */                   //   64: if_acmpne -> 75
/*    */                   //   67: aload #6
/*    */                   //   69: areturn
/*    */                   //   70: aload_1
/*    */                   //   71: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                   //   74: aload_1
/*    */                   //   75: pop
/*    */                   //   76: iconst_0
/*    */                   //   77: istore_2
/*    */                   //   78: ldc com/intellij/ml/llm/matterhorn/ProjectOpener
/*    */                   //   80: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*    */                   //   83: dup
/*    */                   //   84: ldc 'getInstance(...)'
/*    */                   //   86: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */                   //   89: new java/lang/StringBuilder
/*    */                   //   92: dup
/*    */                   //   93: invokespecial <init> : ()V
/*    */                   //   96: astore_2
/*    */                   //   97: aload_2
/*    */                   //   98: astore_3
/*    */                   //   99: astore #5
/*    */                   //   101: iconst_0
/*    */                   //   102: istore #4
/*    */                   //   104: aload_3
/*    */                   //   105: ldc 'Awaited configuration activities:'
/*    */                   //   107: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */                   //   110: dup
/*    */                   //   111: ldc 'append(...)'
/*    */                   //   113: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */                   //   116: bipush #10
/*    */                   //   118: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */                   //   121: dup
/*    */                   //   122: ldc 'append(...)'
/*    */                   //   124: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */                   //   127: pop
/*    */                   //   128: aload_3
/*    */                   //   129: getstatic com/intellij/platform/backend/observation/Observation.INSTANCE : Lcom/intellij/platform/backend/observation/Observation;
/*    */                   //   132: invokevirtual dumpAwaitedActivitiesToString : ()Ljava/lang/String;
/*    */                   //   135: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */                   //   138: dup
/*    */                   //   139: ldc 'append(...)'
/*    */                   //   141: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */                   //   144: bipush #10
/*    */                   //   146: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */                   //   149: dup
/*    */                   //   150: ldc 'append(...)'
/*    */                   //   152: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */                   //   155: pop
/*    */                   //   156: nop
/*    */                   //   157: aload #5
/*    */                   //   159: aload_2
/*    */                   //   160: invokevirtual toString : ()Ljava/lang/String;
/*    */                   //   163: dup
/*    */                   //   164: ldc 'toString(...)'
/*    */                   //   166: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */                   //   169: invokevirtual info : (Ljava/lang/String;)V
/*    */                   //   172: goto -> 36
/*    */                   //   175: new java/lang/IllegalStateException
/*    */                   //   178: dup
/*    */                   //   179: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */                   //   181: invokespecial <init> : (Ljava/lang/String;)V
/*    */                   //   184: athrow
/*    */                   // Line number table:
/*    */                   //   Java source line number -> byte code offset
/*    */                   //   #75	-> 3
/*    */                   //   #76	-> 36
/*    */                   //   #77	-> 37
/*    */                   //   #77	-> 53
/*    */                   //   #75	-> 67
/*    */                   //   #78	-> 75
/*    */                   //   #87	-> 78
/*    */                   //   #78	-> 89
/*    */                   //   #79	-> 104
/*    */                   //   #80	-> 128
/*    */                   //   #81	-> 156
/*    */                   //   #78	-> 159
/*    */                   //   #78	-> 169
/*    */                   //   #75	-> 175
/*    */                   // Local variable table:
/*    */                   //   start	length	slot	name	descriptor
/*    */                   //   101	56	3	$this$invokeSuspend_u24lambda_u240	Ljava/lang/StringBuilder;
/*    */                   //   78	11	2	$i$f$logger	I
/*    */                   //   104	53	4	$i$a$-buildString-ProjectOpener$installLogger$1$2$1	I
/*    */                   //   0	185	0	this	Lcom/intellij/ml/llm/matterhorn/ProjectOpener$installLogger$1$2;
/*    */                   //   36	139	1	$result	Ljava/lang/Object;
/*    */                 }
/*    */                 
/*    */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */                   return (Continuation)new Function2<>($completion);
/*    */                 }
/*    */                 
/*    */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */                 }
/*    */               }3, null);
/*    */           return Unit.INSTANCE;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super ProjectOpener$installLogger$1> $completion) {
/*    */       ProjectOpener$installLogger$1 projectOpener$installLogger$1 = new ProjectOpener$installLogger$1(this.$accumulator, $completion);
/*    */       projectOpener$installLogger$1.L$0 = value;
/*    */       return (Continuation<Unit>)projectOpener$installLogger$1;
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((ProjectOpener$installLogger$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ProjectOpener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */