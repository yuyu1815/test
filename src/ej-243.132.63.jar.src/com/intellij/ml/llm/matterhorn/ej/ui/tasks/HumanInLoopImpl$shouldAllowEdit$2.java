/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.HumanInLoopResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskChainState;
/*     */ import java.nio.file.Path;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.CompletableDeferred;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "HumanInLoopImpl.kt", l = {113, 114}, i = {0, 1}, s = {"L$0", "L$0"}, n = {"response", "response"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.HumanInLoopImpl$shouldAllowEdit$2")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "response", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;"})
/*     */ final class HumanInLoopImpl$shouldAllowEdit$2
/*     */   extends SuspendLambda
/*     */   implements Function2<HumanInLoopResponse, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   HumanInLoopImpl$shouldAllowEdit$2(Path $path, CompletableDeferred<HumanInLoopResponse> $deferredResponse, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     HumanInLoopResponse response;
/* 112 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); response = (HumanInLoopResponse)this.L$0;
/* 113 */         this.L$0 = response; this.label = 1; if (HumanInLoopImpl.access$getUpdater$p(HumanInLoopImpl.this).updateHumanInLoopRequest(null, (Continuation<? super Unit>)this) == object) return object;  HumanInLoopImpl.access$getUpdater$p(HumanInLoopImpl.this).updateHumanInLoopRequest(null, (Continuation<? super Unit>)this);
/* 114 */         this.L$0 = response; this.label = 2; if (HumanInLoopImpl.access$getUpdater$p(HumanInLoopImpl.this).updateState(TaskChainState.Running, (Continuation<? super Unit>)this) == object) return object;  HumanInLoopImpl.access$getUpdater$p(HumanInLoopImpl.this).updateState(TaskChainState.Running, (Continuation<? super Unit>)this);
/* 115 */         HumanInLoopImpl.access$getLogger$cp().info("User responded with " + response + " for edit in file: " + this.$path);
/* 116 */         this.$deferredResponse.complete(response);
/* 117 */         return Unit.INSTANCE;case 1: response = (HumanInLoopResponse)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.L$0 = response; this.label = 2; if (HumanInLoopImpl.access$getUpdater$p(HumanInLoopImpl.this).updateState(TaskChainState.Running, (Continuation<? super Unit>)this) == object) return object;  HumanInLoopImpl.access$getUpdater$p(HumanInLoopImpl.this).updateState(TaskChainState.Running, (Continuation<? super Unit>)this); HumanInLoopImpl.access$getLogger$cp().info("User responded with " + response + " for edit in file: " + this.$path); this.$deferredResponse.complete(response); return Unit.INSTANCE;case 2: response = (HumanInLoopResponse)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); HumanInLoopImpl.access$getLogger$cp().info("User responded with " + response + " for edit in file: " + this.$path); this.$deferredResponse.complete(response); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super HumanInLoopImpl$shouldAllowEdit$2> $completion) {
/*     */     HumanInLoopImpl$shouldAllowEdit$2 humanInLoopImpl$shouldAllowEdit$2 = new HumanInLoopImpl$shouldAllowEdit$2(this.$path, this.$deferredResponse, $completion);
/*     */     humanInLoopImpl$shouldAllowEdit$2.L$0 = value;
/*     */     return (Continuation<Unit>)humanInLoopImpl$shouldAllowEdit$2;
/*     */   }
/*     */   
/*     */   public final Object invoke(HumanInLoopResponse p1, Continuation<?> p2) {
/*     */     return ((HumanInLoopImpl$shouldAllowEdit$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\HumanInLoopImpl$shouldAllowEdit$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */