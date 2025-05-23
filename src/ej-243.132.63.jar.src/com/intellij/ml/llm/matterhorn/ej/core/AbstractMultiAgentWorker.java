/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactId;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactType;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskResult;
/*     */ import com.intellij.openapi.diff.impl.patch.ApplyPatchStatus;
/*     */ import com.intellij.openapi.diff.impl.patch.formove.PatchApplier;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b&\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\007¢\006\004\b\004\020\005J*\020\006\032\016\022\004\022\0020\002\022\004\022\0020\0030\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0022\006\020\013\032\0020\fJ\016\020\r\032\b\022\004\022\0020\0030\016H&J$\020\017\032\b\022\004\022\0020\0030\0202\006\020\n\032\0020\0022\006\020\013\032\0020\fH@¢\006\002\020\021¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractMultiAgentWorker;", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "<init>", "()V", "getSingleAgentRequest", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "taskName", "", "input", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "getSingleAgentArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAbstractMultiAgentWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMultiAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AbstractMultiAgentWorker\n+ 2 ArtifactRequestExecutorService.kt\ncom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorServiceKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n117#2:215\n117#2:216\n1#3:217\n*S KotlinDebug\n*F\n+ 1 AbstractMultiAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AbstractMultiAgentWorker\n*L\n168#1:215\n186#1:216\n*E\n"})
/*     */ public abstract class AbstractMultiAgentWorker
/*     */   implements ArtifactRequestExecutor<AgentIssue, TaskResult>
/*     */ {
/*     */   @NotNull
/*     */   public final ArtifactRequest<AgentIssue, TaskResult> getSingleAgentRequest(@NotNull String taskName, @NotNull AgentIssue input, @NotNull ExecutionContext context) {
/* 168 */     Intrinsics.checkNotNullParameter(taskName, "taskName"); Intrinsics.checkNotNullParameter(input, "input"); Intrinsics.checkNotNullParameter(context, "context"); ArtifactId artifact$iv = context.getArtifact().childOfType(taskName, getSingleAgentArtifactType()); int $i$f$artifactRequest = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 215 */       new ArtifactRequest(artifact$iv, input, AgentIssue.Companion.serializer());
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public abstract ArtifactType<TaskResult> getSingleAgentArtifactType();
/*     */   
/*     */   @Nullable
/*     */   public Object produceArtifact(@NotNull AgentIssue input, @NotNull ExecutionContext context, @NotNull Continuation<? super ArtifactResponse<TaskResult>> $completion) {
/*     */     return produceArtifact$suspendImpl(this, input, context, $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractMultiAgentWorker.kt", l = {176, 187, 207}, i = {0, 0, 0, 1, 1, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1"}, n = {"input", "context", "reports", "context", "reports", "reports", "best"}, m = "produceArtifact$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractMultiAgentWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractMultiAgentWorker$produceArtifact$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     AbstractMultiAgentWorker$produceArtifact$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractMultiAgentWorker.produceArtifact$suspendImpl(AbstractMultiAgentWorker.this, null, null, (Continuation<? super ArtifactResponse<TaskResult>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractMultiAgentWorker.kt", l = {178}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractMultiAgentWorker$produceArtifact$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\020\016\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", ""})
/*     */   static final class AbstractMultiAgentWorker$produceArtifact$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     AbstractMultiAgentWorker$produceArtifact$2(AgentIssue $input, ExecutionContext $context, List<TaskResult> $reports, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #5
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 137, 0 -> 32, 1 -> 91
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield L$0 : Ljava/lang/Object;
/*     */       //   40: checkcast java/lang/String
/*     */       //   43: astore_2
/*     */       //   44: aload_0
/*     */       //   45: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractMultiAgentWorker;
/*     */       //   48: aload_2
/*     */       //   49: aload_0
/*     */       //   50: getfield $input : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */       //   53: aload_0
/*     */       //   54: getfield $context : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */       //   57: invokevirtual getSingleAgentRequest : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */       //   60: astore_3
/*     */       //   61: getstatic com/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor;
/*     */       //   64: aload_2
/*     */       //   65: aload_3
/*     */       //   66: aload_0
/*     */       //   67: getfield $context : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */       //   70: aload_0
/*     */       //   71: checkcast kotlin/coroutines/Continuation
/*     */       //   74: aload_0
/*     */       //   75: iconst_1
/*     */       //   76: putfield label : I
/*     */       //   79: invokevirtual executeInForkedEnvironment : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   82: dup
/*     */       //   83: aload #5
/*     */       //   85: if_acmpne -> 96
/*     */       //   88: aload #5
/*     */       //   90: areturn
/*     */       //   91: aload_1
/*     */       //   92: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   95: aload_1
/*     */       //   96: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */       //   99: dup
/*     */       //   100: ifnull -> 112
/*     */       //   103: invokevirtual getContent : ()Ljava/lang/Object;
/*     */       //   106: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult
/*     */       //   109: goto -> 114
/*     */       //   112: pop
/*     */       //   113: aconst_null
/*     */       //   114: astore #4
/*     */       //   116: aload #4
/*     */       //   118: ifnull -> 133
/*     */       //   121: aload_0
/*     */       //   122: getfield $reports : Ljava/util/List;
/*     */       //   125: aload #4
/*     */       //   127: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   132: pop
/*     */       //   133: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   136: areturn
/*     */       //   137: new java/lang/IllegalStateException
/*     */       //   140: dup
/*     */       //   141: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   143: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   146: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #176	-> 3
/*     */       //   #177	-> 44
/*     */       //   #178	-> 61
/*     */       //   #176	-> 88
/*     */       //   #178	-> 96
/*     */       //   #179	-> 116
/*     */       //   #180	-> 121
/*     */       //   #182	-> 133
/*     */       //   #176	-> 137
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   44	38	2	it	Ljava/lang/String;
/*     */       //   61	21	3	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */       //   116	17	4	attempt	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;
/*     */       //   0	147	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractMultiAgentWorker$produceArtifact$2;
/*     */       //   36	101	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AbstractMultiAgentWorker$produceArtifact$2> $completion) {
/*     */       AbstractMultiAgentWorker$produceArtifact$2 abstractMultiAgentWorker$produceArtifact$2 = new AbstractMultiAgentWorker$produceArtifact$2(this.$input, this.$context, this.$reports, $completion);
/*     */       abstractMultiAgentWorker$produceArtifact$2.L$0 = value;
/*     */       return (Continuation<Unit>)abstractMultiAgentWorker$produceArtifact$2;
/*     */     }
/*     */     
/*     */     public final Object invoke(String p1, Continuation<?> p2) {
/*     */       return ((AbstractMultiAgentWorker$produceArtifact$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractMultiAgentWorker.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractMultiAgentWorker$produceArtifact$3")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\n \002*\004\030\0010\0010\001*\0020\003H\n"}, d2 = {"<anonymous>", "Lcom/intellij/openapi/diff/impl/patch/ApplyPatchStatus;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class AbstractMultiAgentWorker$produceArtifact$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApplyPatchStatus>, Object> {
/*     */     int label;
/*     */     
/*     */     AbstractMultiAgentWorker$produceArtifact$3(PatchApplier $patchApplier, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return this.$patchApplier.execute(false, true);
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AbstractMultiAgentWorker$produceArtifact$3> $completion) {
/*     */       return (Continuation<Unit>)new AbstractMultiAgentWorker$produceArtifact$3(this.$patchApplier, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((AbstractMultiAgentWorker$produceArtifact$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AbstractMultiAgentWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */