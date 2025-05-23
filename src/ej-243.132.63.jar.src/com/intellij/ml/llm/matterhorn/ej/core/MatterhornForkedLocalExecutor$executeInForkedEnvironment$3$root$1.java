/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService;
/*     */ import com.intellij.ml.llm.matterhorn.HumanInLoop;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.ShellExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import java.nio.file.Path;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
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
/*     */ @DebugMetadata(f = "AbstractMultiAgentWorker.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super RootExecutionContext>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1(ArtifactRequestExecutorService $service, LLMProxy $lLMProxy, String $name, MatterhornPropertyProvider $propertyProvider, ShellExecutor $shellExecutor, Function1<Path, Boolean> $checker, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*  94 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  95 */         return new RootExecutionContext(
/*  96 */             this.$service, 
/*  97 */             this.$lLMProxy, 
/*  98 */             this.$name, 
/*  99 */             this.$shellExecutor::invokeSuspend$lambda$0, 
/* 100 */             false, 
/* 101 */             this.$propertyProvider, 
/* 102 */             HumanInLoop.Companion.getALLOW_ALL(), 
/* 103 */             new Function2<Path, Continuation<? super Boolean>, Object>(this.$checker, null) { public final Object invokeSuspend(Object $result) { Path it; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (Path)this.L$0; return this.$checker.invoke(it); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */               
/*     */               int label;
/*     */               
/*     */               public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                 Function2<Path, Continuation<? super Boolean>, Object> function2 = new Function2<>(this.$checker, $completion);
/*     */                 function2.L$0 = value;
/*     */                 return (Continuation)function2;
/*     */               }
/*     */               
/*     */               public final Object invoke(Path p1, Continuation<?> p2) {
/*     */                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */               } }
/*     */           ); }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1> $completion) {
/*     */     return (Continuation<Unit>)new MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1(this.$service, this.$lLMProxy, this.$name, this.$propertyProvider, this.$shellExecutor, this.$checker, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   private static final ShellExecutor invokeSuspend$lambda$0(ShellExecutor $shellExecutor) {
/*     */     return $shellExecutor;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */