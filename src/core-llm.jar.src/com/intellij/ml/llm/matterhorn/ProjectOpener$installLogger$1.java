/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
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
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
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
/*    */ @DebugMetadata(f = "MatterhornStarter.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ProjectOpener$installLogger$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class ProjectOpener$installLogger$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   ProjectOpener$installLogger$1(List<ProjectProblem> $accumulator, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     CoroutineScope $this$launch;
/* 59 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$launch = (CoroutineScope)this.L$0;
/* 60 */         BuildersKt.launch$default($this$launch, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$accumulator, null) { int label; public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 61 */                     this.label = 1; if (HeadlessLogging.INSTANCE.loggingFlow().collect(new FlowCollector(this.$accumulator) { public final Object emit(HeadlessLogging.LogEntry param2LogEntry, Continuation $completion) { // Byte code:
/*    */                             //   0: aload_1
/*    */                             //   1: invokevirtual component1 : ()Lcom/intellij/openapi/project/configuration/HeadlessLogging$SeverityKind;
/*    */                             //   4: astore_3
/*    */                             //   5: aload_1
/*    */                             //   6: invokevirtual component2 : ()Lcom/intellij/openapi/project/configuration/HeadlessLogging$Message;
/*    */                             //   9: astore #4
/*    */                             //   11: aload_3
/*    */                             //   12: getstatic com/intellij/ml/llm/matterhorn/ProjectOpener$installLogger$1$1$1$WhenMappings.$EnumSwitchMapping$0 : [I
/*    */                             //   15: swap
/*    */                             //   16: invokevirtual ordinal : ()I
/*    */                             //   19: iaload
/*    */                             //   20: tableswitch default -> 148, 1 -> 48, 2 -> 51, 3 -> 54
/*    */                             //   48: goto -> 156
/*    */                             //   51: goto -> 156
/*    */                             //   54: aload #4
/*    */                             //   56: astore #6
/*    */                             //   58: aload #6
/*    */                             //   60: instanceof com/intellij/openapi/project/configuration/HeadlessLogging$Message$Exception
/*    */                             //   63: ifeq -> 94
/*    */                             //   66: new com/intellij/ml/llm/matterhorn/ProjectProblem
/*    */                             //   69: dup
/*    */                             //   70: aload #4
/*    */                             //   72: checkcast com/intellij/openapi/project/configuration/HeadlessLogging$Message$Exception
/*    */                             //   75: invokevirtual unbox-impl : ()Ljava/lang/Throwable;
/*    */                             //   78: invokevirtual getMessage : ()Ljava/lang/String;
/*    */                             //   81: dup
/*    */                             //   82: ifnonnull -> 88
/*    */                             //   85: pop
/*    */                             //   86: ldc '<UNKNOWN>'
/*    */                             //   88: invokespecial <init> : (Ljava/lang/String;)V
/*    */                             //   91: goto -> 128
/*    */                             //   94: aload #6
/*    */                             //   96: instanceof com/intellij/openapi/project/configuration/HeadlessLogging$Message$Plain
/*    */                             //   99: ifeq -> 120
/*    */                             //   102: new com/intellij/ml/llm/matterhorn/ProjectProblem
/*    */                             //   105: dup
/*    */                             //   106: aload #4
/*    */                             //   108: checkcast com/intellij/openapi/project/configuration/HeadlessLogging$Message$Plain
/*    */                             //   111: invokevirtual unbox-impl : ()Ljava/lang/String;
/*    */                             //   114: invokespecial <init> : (Ljava/lang/String;)V
/*    */                             //   117: goto -> 128
/*    */                             //   120: new kotlin/NoWhenBranchMatchedException
/*    */                             //   123: dup
/*    */                             //   124: invokespecial <init> : ()V
/*    */                             //   127: athrow
/*    */                             //   128: astore #5
/*    */                             //   130: aload_0
/*    */                             //   131: getfield $accumulator : Ljava/util/List;
/*    */                             //   134: aload #5
/*    */                             //   136: invokeinterface add : (Ljava/lang/Object;)Z
/*    */                             //   141: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */                             //   144: pop
/*    */                             //   145: goto -> 156
/*    */                             //   148: new kotlin/NoWhenBranchMatchedException
/*    */                             //   151: dup
/*    */                             //   152: invokespecial <init> : ()V
/*    */                             //   155: athrow
/*    */                             //   156: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */                             //   159: areturn
/*    */                             // Line number table:
/*    */                             //   Java source line number -> byte code offset
/*    */                             //   #61	-> 0
/*    */                             //   #62	-> 11
/*    */                             //   #66	-> 54
/*    */                             //   #67	-> 58
/*    */                             //   #68	-> 94
/*    */                             //   #66	-> 120
/*    */                             //   #70	-> 130
/*    */                             //   #62	-> 148
/*    */                             //   #73	-> 156
/*    */                             // Local variable table:
/*    */                             //   start	length	slot	name	descriptor
/*    */                             //   130	11	5	problem	Lcom/intellij/ml/llm/matterhorn/ProjectProblem;
/*    */                             //   5	155	3	severity	Lcom/intellij/openapi/project/configuration/HeadlessLogging$SeverityKind;
/*    */                             //   11	149	4	message	Lcom/intellij/openapi/project/configuration/HeadlessLogging$Message;
/*    */                             //   0	160	0	this	Lcom/intellij/ml/llm/matterhorn/ProjectOpener$installLogger$1$1$1;
/* 61 */                             //   0	160	2	$completion	Lkotlin/coroutines/Continuation; } }, (Continuation)this) == object) return object;  HeadlessLogging.INSTANCE.loggingFlow().collect(new FlowCollector(this.$accumulator) { public final Object emit(HeadlessLogging.LogEntry param2LogEntry, Continuation $completion) { // Byte code:
/*    */                             //   0: aload_1
/*    */                             //   1: invokevirtual component1 : ()Lcom/intellij/openapi/project/configuration/HeadlessLogging$SeverityKind;
/*    */                             //   4: astore_3
/*    */                             //   5: aload_1
/*    */                             //   6: invokevirtual component2 : ()Lcom/intellij/openapi/project/configuration/HeadlessLogging$Message;
/*    */                             //   9: astore #4
/*    */                             //   11: aload_3
/*    */                             //   12: getstatic com/intellij/ml/llm/matterhorn/ProjectOpener$installLogger$1$1$1$WhenMappings.$EnumSwitchMapping$0 : [I
/*    */                             //   15: swap
/*    */                             //   16: invokevirtual ordinal : ()I
/*    */                             //   19: iaload
/*    */                             //   20: tableswitch default -> 148, 1 -> 48, 2 -> 51, 3 -> 54
/*    */                             //   48: goto -> 156
/*    */                             //   51: goto -> 156
/*    */                             //   54: aload #4
/*    */                             //   56: astore #6
/*    */                             //   58: aload #6
/*    */                             //   60: instanceof com/intellij/openapi/project/configuration/HeadlessLogging$Message$Exception
/*    */                             //   63: ifeq -> 94
/*    */                             //   66: new com/intellij/ml/llm/matterhorn/ProjectProblem
/*    */                             //   69: dup
/*    */                             //   70: aload #4
/*    */                             //   72: checkcast com/intellij/openapi/project/configuration/HeadlessLogging$Message$Exception
/*    */                             //   75: invokevirtual unbox-impl : ()Ljava/lang/Throwable;
/*    */                             //   78: invokevirtual getMessage : ()Ljava/lang/String;
/*    */                             //   81: dup
/*    */                             //   82: ifnonnull -> 88
/*    */                             //   85: pop
/*    */                             //   86: ldc '<UNKNOWN>'
/*    */                             //   88: invokespecial <init> : (Ljava/lang/String;)V
/*    */                             //   91: goto -> 128
/*    */                             //   94: aload #6
/*    */                             //   96: instanceof com/intellij/openapi/project/configuration/HeadlessLogging$Message$Plain
/*    */                             //   99: ifeq -> 120
/*    */                             //   102: new com/intellij/ml/llm/matterhorn/ProjectProblem
/*    */                             //   105: dup
/*    */                             //   106: aload #4
/*    */                             //   108: checkcast com/intellij/openapi/project/configuration/HeadlessLogging$Message$Plain
/*    */                             //   111: invokevirtual unbox-impl : ()Ljava/lang/String;
/*    */                             //   114: invokespecial <init> : (Ljava/lang/String;)V
/*    */                             //   117: goto -> 128
/*    */                             //   120: new kotlin/NoWhenBranchMatchedException
/*    */                             //   123: dup
/*    */                             //   124: invokespecial <init> : ()V
/*    */                             //   127: athrow
/*    */                             //   128: astore #5
/*    */                             //   130: aload_0
/*    */                             //   131: getfield $accumulator : Ljava/util/List;
/*    */                             //   134: aload #5
/*    */                             //   136: invokeinterface add : (Ljava/lang/Object;)Z
/*    */                             //   141: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */                             //   144: pop
/*    */                             //   145: goto -> 156
/*    */                             //   148: new kotlin/NoWhenBranchMatchedException
/*    */                             //   151: dup
/*    */                             //   152: invokespecial <init> : ()V
/*    */                             //   155: athrow
/*    */                             //   156: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */                             //   159: areturn
/*    */                             // Line number table:
/*    */                             //   Java source line number -> byte code offset
/*    */                             //   #61	-> 0
/*    */                             //   #62	-> 11
/*    */                             //   #66	-> 54
/*    */                             //   #67	-> 58
/*    */                             //   #68	-> 94
/*    */                             //   #66	-> 120
/*    */                             //   #70	-> 130
/*    */                             //   #62	-> 148
/*    */                             //   #73	-> 156
/*    */                             // Local variable table:
/*    */                             //   start	length	slot	name	descriptor
/*    */                             //   130	11	5	problem	Lcom/intellij/ml/llm/matterhorn/ProjectProblem;
/*    */                             //   5	155	3	severity	Lcom/intellij/openapi/project/configuration/HeadlessLogging$SeverityKind;
/*    */                             //   11	149	4	message	Lcom/intellij/openapi/project/configuration/HeadlessLogging$Message;
/*    */                             //   0	160	0	this	Lcom/intellij/ml/llm/matterhorn/ProjectOpener$installLogger$1$1$1;
/* 61 */                             //   0	160	2	$completion	Lkotlin/coroutines/Continuation; } }, (Continuation)this); throw new KotlinNothingValueException();case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); throw new KotlinNothingValueException(); }
/*    */                 
/*    */                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */ 
/*    */               
/*    */               public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */                 return (Continuation)new Function2<>(this.$accumulator, $completion);
/*    */               }
/*    */               
/*    */               public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */               } }
/*    */             3, null);
/* 75 */         BuildersKt.launch$default($this$launch, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*    */                 //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */                 //   3: astore #6
/*    */                 //   5: aload_0
/*    */                 //   6: getfield label : I
/*    */                 //   9: tableswitch default -> 175, 0 -> 32, 1 -> 70
/*    */                 //   32: aload_1
/*    */                 //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   36: nop
/*    */                 //   37: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*    */                 //   40: pop
/*    */                 //   41: bipush #30
/*    */                 //   43: getstatic kotlin/time/DurationUnit.SECONDS : Lkotlin/time/DurationUnit;
/*    */                 //   46: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*    */                 //   49: aload_0
/*    */                 //   50: checkcast kotlin/coroutines/Continuation
/*    */                 //   53: aload_0
/*    */                 //   54: iconst_1
/*    */                 //   55: putfield label : I
/*    */                 //   58: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */                 //   61: dup
/*    */                 //   62: aload #6
/*    */                 //   64: if_acmpne -> 75
/*    */                 //   67: aload #6
/*    */                 //   69: areturn
/*    */                 //   70: aload_1
/*    */                 //   71: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   74: aload_1
/*    */                 //   75: pop
/*    */                 //   76: iconst_0
/*    */                 //   77: istore_2
/*    */                 //   78: ldc com/intellij/ml/llm/matterhorn/ProjectOpener
/*    */                 //   80: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*    */                 //   83: dup
/*    */                 //   84: ldc 'getInstance(...)'
/*    */                 //   86: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */                 //   89: new java/lang/StringBuilder
/*    */                 //   92: dup
/*    */                 //   93: invokespecial <init> : ()V
/*    */                 //   96: astore_2
/*    */                 //   97: aload_2
/*    */                 //   98: astore_3
/*    */                 //   99: astore #5
/*    */                 //   101: iconst_0
/*    */                 //   102: istore #4
/*    */                 //   104: aload_3
/*    */                 //   105: ldc 'Awaited configuration activities:'
/*    */                 //   107: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */                 //   110: dup
/*    */                 //   111: ldc 'append(...)'
/*    */                 //   113: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */                 //   116: bipush #10
/*    */                 //   118: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */                 //   121: dup
/*    */                 //   122: ldc 'append(...)'
/*    */                 //   124: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */                 //   127: pop
/*    */                 //   128: aload_3
/*    */                 //   129: getstatic com/intellij/platform/backend/observation/Observation.INSTANCE : Lcom/intellij/platform/backend/observation/Observation;
/*    */                 //   132: invokevirtual dumpAwaitedActivitiesToString : ()Ljava/lang/String;
/*    */                 //   135: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */                 //   138: dup
/*    */                 //   139: ldc 'append(...)'
/*    */                 //   141: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */                 //   144: bipush #10
/*    */                 //   146: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */                 //   149: dup
/*    */                 //   150: ldc 'append(...)'
/*    */                 //   152: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */                 //   155: pop
/*    */                 //   156: nop
/*    */                 //   157: aload #5
/*    */                 //   159: aload_2
/*    */                 //   160: invokevirtual toString : ()Ljava/lang/String;
/*    */                 //   163: dup
/*    */                 //   164: ldc 'toString(...)'
/*    */                 //   166: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */                 //   169: invokevirtual info : (Ljava/lang/String;)V
/*    */                 //   172: goto -> 36
/*    */                 //   175: new java/lang/IllegalStateException
/*    */                 //   178: dup
/*    */                 //   179: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */                 //   181: invokespecial <init> : (Ljava/lang/String;)V
/*    */                 //   184: athrow
/*    */                 // Line number table:
/*    */                 //   Java source line number -> byte code offset
/*    */                 //   #75	-> 3
/*    */                 //   #76	-> 36
/*    */                 //   #77	-> 37
/*    */                 //   #77	-> 53
/*    */                 //   #75	-> 67
/*    */                 //   #78	-> 75
/*    */                 //   #87	-> 78
/*    */                 //   #78	-> 89
/*    */                 //   #79	-> 104
/*    */                 //   #80	-> 128
/*    */                 //   #81	-> 156
/*    */                 //   #78	-> 159
/*    */                 //   #78	-> 169
/*    */                 //   #75	-> 175
/*    */                 // Local variable table:
/*    */                 //   start	length	slot	name	descriptor
/*    */                 //   101	56	3	$this$invokeSuspend_u24lambda_u240	Ljava/lang/StringBuilder;
/*    */                 //   78	11	2	$i$f$logger	I
/*    */                 //   104	53	4	$i$a$-buildString-ProjectOpener$installLogger$1$2$1	I
/*    */                 //   0	185	0	this	Lcom/intellij/ml/llm/matterhorn/ProjectOpener$installLogger$1$2;
/* 75 */                 //   36	139	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>($completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 84 */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super ProjectOpener$installLogger$1> $completion) {
/*    */     ProjectOpener$installLogger$1 projectOpener$installLogger$1 = new ProjectOpener$installLogger$1(this.$accumulator, $completion);
/*    */     projectOpener$installLogger$1.L$0 = value;
/*    */     return (Continuation<Unit>)projectOpener$installLogger$1;
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((ProjectOpener$installLogger$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ProjectOpener$installLogger$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */