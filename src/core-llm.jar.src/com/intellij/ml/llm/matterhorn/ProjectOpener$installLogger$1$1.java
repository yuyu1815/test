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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "MatterhornStarter.kt", l = {61}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ProjectOpener$installLogger$1$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class null
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   null(List<ProjectProblem> $accumulator, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 60 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 61 */         this.label = 1; if (HeadlessLogging.INSTANCE.loggingFlow().collect(new FlowCollector(this.$accumulator) { public final Object emit(HeadlessLogging.LogEntry param2LogEntry, Continuation $completion) { // Byte code:
/*    */                 //   0: aload_1
/*    */                 //   1: invokevirtual component1 : ()Lcom/intellij/openapi/project/configuration/HeadlessLogging$SeverityKind;
/*    */                 //   4: astore_3
/*    */                 //   5: aload_1
/*    */                 //   6: invokevirtual component2 : ()Lcom/intellij/openapi/project/configuration/HeadlessLogging$Message;
/*    */                 //   9: astore #4
/*    */                 //   11: aload_3
/*    */                 //   12: getstatic com/intellij/ml/llm/matterhorn/ProjectOpener$installLogger$1$1$1$WhenMappings.$EnumSwitchMapping$0 : [I
/*    */                 //   15: swap
/*    */                 //   16: invokevirtual ordinal : ()I
/*    */                 //   19: iaload
/*    */                 //   20: tableswitch default -> 148, 1 -> 48, 2 -> 51, 3 -> 54
/*    */                 //   48: goto -> 156
/*    */                 //   51: goto -> 156
/*    */                 //   54: aload #4
/*    */                 //   56: astore #6
/*    */                 //   58: aload #6
/*    */                 //   60: instanceof com/intellij/openapi/project/configuration/HeadlessLogging$Message$Exception
/*    */                 //   63: ifeq -> 94
/*    */                 //   66: new com/intellij/ml/llm/matterhorn/ProjectProblem
/*    */                 //   69: dup
/*    */                 //   70: aload #4
/*    */                 //   72: checkcast com/intellij/openapi/project/configuration/HeadlessLogging$Message$Exception
/*    */                 //   75: invokevirtual unbox-impl : ()Ljava/lang/Throwable;
/*    */                 //   78: invokevirtual getMessage : ()Ljava/lang/String;
/*    */                 //   81: dup
/*    */                 //   82: ifnonnull -> 88
/*    */                 //   85: pop
/*    */                 //   86: ldc '<UNKNOWN>'
/*    */                 //   88: invokespecial <init> : (Ljava/lang/String;)V
/*    */                 //   91: goto -> 128
/*    */                 //   94: aload #6
/*    */                 //   96: instanceof com/intellij/openapi/project/configuration/HeadlessLogging$Message$Plain
/*    */                 //   99: ifeq -> 120
/*    */                 //   102: new com/intellij/ml/llm/matterhorn/ProjectProblem
/*    */                 //   105: dup
/*    */                 //   106: aload #4
/*    */                 //   108: checkcast com/intellij/openapi/project/configuration/HeadlessLogging$Message$Plain
/*    */                 //   111: invokevirtual unbox-impl : ()Ljava/lang/String;
/*    */                 //   114: invokespecial <init> : (Ljava/lang/String;)V
/*    */                 //   117: goto -> 128
/*    */                 //   120: new kotlin/NoWhenBranchMatchedException
/*    */                 //   123: dup
/*    */                 //   124: invokespecial <init> : ()V
/*    */                 //   127: athrow
/*    */                 //   128: astore #5
/*    */                 //   130: aload_0
/*    */                 //   131: getfield $accumulator : Ljava/util/List;
/*    */                 //   134: aload #5
/*    */                 //   136: invokeinterface add : (Ljava/lang/Object;)Z
/*    */                 //   141: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */                 //   144: pop
/*    */                 //   145: goto -> 156
/*    */                 //   148: new kotlin/NoWhenBranchMatchedException
/*    */                 //   151: dup
/*    */                 //   152: invokespecial <init> : ()V
/*    */                 //   155: athrow
/*    */                 //   156: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */                 //   159: areturn
/*    */                 // Line number table:
/*    */                 //   Java source line number -> byte code offset
/*    */                 //   #61	-> 0
/*    */                 //   #62	-> 11
/*    */                 //   #66	-> 54
/*    */                 //   #67	-> 58
/*    */                 //   #68	-> 94
/*    */                 //   #66	-> 120
/*    */                 //   #70	-> 130
/*    */                 //   #62	-> 148
/*    */                 //   #73	-> 156
/*    */                 // Local variable table:
/*    */                 //   start	length	slot	name	descriptor
/*    */                 //   130	11	5	problem	Lcom/intellij/ml/llm/matterhorn/ProjectProblem;
/*    */                 //   5	155	3	severity	Lcom/intellij/openapi/project/configuration/HeadlessLogging$SeverityKind;
/*    */                 //   11	149	4	message	Lcom/intellij/openapi/project/configuration/HeadlessLogging$Message;
/*    */                 //   0	160	0	this	Lcom/intellij/ml/llm/matterhorn/ProjectOpener$installLogger$1$1$1;
/* 61 */                 //   0	160	2	$completion	Lkotlin/coroutines/Continuation; } }, (Continuation)this) == object) return object;  HeadlessLogging.INSTANCE.loggingFlow().collect(new FlowCollector(this.$accumulator) { public final Object emit(HeadlessLogging.LogEntry param2LogEntry, Continuation $completion) { // Byte code:
/*    */                 //   0: aload_1
/*    */                 //   1: invokevirtual component1 : ()Lcom/intellij/openapi/project/configuration/HeadlessLogging$SeverityKind;
/*    */                 //   4: astore_3
/*    */                 //   5: aload_1
/*    */                 //   6: invokevirtual component2 : ()Lcom/intellij/openapi/project/configuration/HeadlessLogging$Message;
/*    */                 //   9: astore #4
/*    */                 //   11: aload_3
/*    */                 //   12: getstatic com/intellij/ml/llm/matterhorn/ProjectOpener$installLogger$1$1$1$WhenMappings.$EnumSwitchMapping$0 : [I
/*    */                 //   15: swap
/*    */                 //   16: invokevirtual ordinal : ()I
/*    */                 //   19: iaload
/*    */                 //   20: tableswitch default -> 148, 1 -> 48, 2 -> 51, 3 -> 54
/*    */                 //   48: goto -> 156
/*    */                 //   51: goto -> 156
/*    */                 //   54: aload #4
/*    */                 //   56: astore #6
/*    */                 //   58: aload #6
/*    */                 //   60: instanceof com/intellij/openapi/project/configuration/HeadlessLogging$Message$Exception
/*    */                 //   63: ifeq -> 94
/*    */                 //   66: new com/intellij/ml/llm/matterhorn/ProjectProblem
/*    */                 //   69: dup
/*    */                 //   70: aload #4
/*    */                 //   72: checkcast com/intellij/openapi/project/configuration/HeadlessLogging$Message$Exception
/*    */                 //   75: invokevirtual unbox-impl : ()Ljava/lang/Throwable;
/*    */                 //   78: invokevirtual getMessage : ()Ljava/lang/String;
/*    */                 //   81: dup
/*    */                 //   82: ifnonnull -> 88
/*    */                 //   85: pop
/*    */                 //   86: ldc '<UNKNOWN>'
/*    */                 //   88: invokespecial <init> : (Ljava/lang/String;)V
/*    */                 //   91: goto -> 128
/*    */                 //   94: aload #6
/*    */                 //   96: instanceof com/intellij/openapi/project/configuration/HeadlessLogging$Message$Plain
/*    */                 //   99: ifeq -> 120
/*    */                 //   102: new com/intellij/ml/llm/matterhorn/ProjectProblem
/*    */                 //   105: dup
/*    */                 //   106: aload #4
/*    */                 //   108: checkcast com/intellij/openapi/project/configuration/HeadlessLogging$Message$Plain
/*    */                 //   111: invokevirtual unbox-impl : ()Ljava/lang/String;
/*    */                 //   114: invokespecial <init> : (Ljava/lang/String;)V
/*    */                 //   117: goto -> 128
/*    */                 //   120: new kotlin/NoWhenBranchMatchedException
/*    */                 //   123: dup
/*    */                 //   124: invokespecial <init> : ()V
/*    */                 //   127: athrow
/*    */                 //   128: astore #5
/*    */                 //   130: aload_0
/*    */                 //   131: getfield $accumulator : Ljava/util/List;
/*    */                 //   134: aload #5
/*    */                 //   136: invokeinterface add : (Ljava/lang/Object;)Z
/*    */                 //   141: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */                 //   144: pop
/*    */                 //   145: goto -> 156
/*    */                 //   148: new kotlin/NoWhenBranchMatchedException
/*    */                 //   151: dup
/*    */                 //   152: invokespecial <init> : ()V
/*    */                 //   155: athrow
/*    */                 //   156: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */                 //   159: areturn
/*    */                 // Line number table:
/*    */                 //   Java source line number -> byte code offset
/*    */                 //   #61	-> 0
/*    */                 //   #62	-> 11
/*    */                 //   #66	-> 54
/*    */                 //   #67	-> 58
/*    */                 //   #68	-> 94
/*    */                 //   #66	-> 120
/*    */                 //   #70	-> 130
/*    */                 //   #62	-> 148
/*    */                 //   #73	-> 156
/*    */                 // Local variable table:
/*    */                 //   start	length	slot	name	descriptor
/*    */                 //   130	11	5	problem	Lcom/intellij/ml/llm/matterhorn/ProjectProblem;
/*    */                 //   5	155	3	severity	Lcom/intellij/openapi/project/configuration/HeadlessLogging$SeverityKind;
/*    */                 //   11	149	4	message	Lcom/intellij/openapi/project/configuration/HeadlessLogging$Message;
/*    */                 //   0	160	0	this	Lcom/intellij/ml/llm/matterhorn/ProjectOpener$installLogger$1$1$1;
/* 61 */                 //   0	160	2	$completion	Lkotlin/coroutines/Continuation; } }, (Continuation)this); throw new KotlinNothingValueException();case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); throw new KotlinNothingValueException(); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */     return (Continuation<Unit>)new Object(this.$accumulator, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ProjectOpener$installLogger$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */