/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.Artifact;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.ProjectFileStructure;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*     */ import java.util.concurrent.CancellationException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ @DebugMetadata(f = "ResolveIssueAgentAction.kt", l = {151}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.ExecuteArtifactRequestUserMessage$executeMessage$3")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\0020\003H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "O", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class ExecuteArtifactRequestUserMessage$executeMessage$3
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Artifact<O>>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   ExecuteArtifactRequestUserMessage$executeMessage$3(ArtifactRequest<I, O> $request, ExecuteArtifactRequestUserMessage<I, O> $receiver, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/* 146 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         try {
/* 148 */           ProjectFileStructure source = new ProjectFileStructure();
/* 149 */           ExecutionContext executionContext = new ExecutionContext(this.$context, null, this.$request, source, null, 16, null);
/* 150 */           ExecuteArtifactRequestUserMessage.this.getConfigureContext().invoke(executionContext);
/* 151 */           this.label = 1; if (executionContext.getOrCreateArtifact(this.$request, source, (Continuation)this) == object) return object;  return executionContext.getOrCreateArtifact(this.$request, source, (Continuation)this);
/* 152 */         } catch (CancellationException e) {
/* 153 */           this.$context.getListener().onCancellation(e);
/* 154 */           throw e;
/* 155 */         } catch (Exception e) {
/* 156 */           this.$context.getListener().onException(e, this.$request.getArtifact());
/* 157 */           throw e;
/*     */         } 
/*     */       case 1:
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super ExecuteArtifactRequestUserMessage$executeMessage$3> $completion) {
/*     */     return (Continuation<Unit>)new ExecuteArtifactRequestUserMessage$executeMessage$3(this.$request, ExecuteArtifactRequestUserMessage.this, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((ExecuteArtifactRequestUserMessage$executeMessage$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ExecuteArtifactRequestUserMessage$executeMessage$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */