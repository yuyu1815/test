/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.Artifact;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactRequest;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentIssue;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentResponse;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ElectricJuniorSupport;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.activation.JuniePluginLLMProxyProvider;
/*    */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
/*    */ @DebugMetadata(f = "ResolveIssueAgentAction.kt", l = {97}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.ResolveIssueAgentAction$actionPerformed$1$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class null
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   null(ElectricJuniorSupport $ejSupport, Project $project, ArtifactRequest<AgentIssue, AgentResponse> $request, VirtualFile $file, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     List list;
/*    */     String str;
/*    */     LLMProxy lLMProxy;
/* 87 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */ 
/*    */ 
/*    */         
/* 91 */         list = CollectionsKt.emptyList();
/*    */         
/* 93 */         str = this.$ejSupport.getActionName();
/*    */         
/* 95 */         lLMProxy = JuniePluginLLMProxyProvider.INSTANCE.createLLMProxy(this.$project);
/*    */         
/* 97 */         this.label = 1; if ((new ExecuteArtifactRequestUserMessage<>(this.$project, this.$request, list, this.$file, str, true, null, false, lLMProxy, null, 576, null)).executeMessage((Continuation<? super Artifact<?>>)this) == object) return object;  (new ExecuteArtifactRequestUserMessage<>(this.$project, this.$request, list, this.$file, str, true, null, false, lLMProxy, null, 576, null)).executeMessage((Continuation<? super Artifact<?>>)this);
/* 98 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */     return (Continuation<Unit>)new Object(this.$ejSupport, this.$project, this.$request, this.$file, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ResolveIssueAgentAction$actionPerformed$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */