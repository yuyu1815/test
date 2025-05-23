/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService;
/*     */ import com.intellij.ml.llm.matterhorn.HumanInLoop;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.ShellExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.aiignore.AiIgnoreUtilKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.BlockTerminalShellExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.BlockTerminalShellExecutorKt;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.project.Project;
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
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ 
/*     */ @DebugMetadata(f = "MatterhornStarterBase.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.MatterhornStarterBase$createRootContext$2")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornStarterBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornStarterBase.kt\ncom/intellij/ml/llm/matterhorn/ej/core/MatterhornStarterBase$createRootContext$2\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,108:1\n24#2:109\n*S KotlinDebug\n*F\n+ 1 MatterhornStarterBase.kt\ncom/intellij/ml/llm/matterhorn/ej/core/MatterhornStarterBase$createRootContext$2\n*L\n38#1:109\n*E\n"})
/*     */ final class MatterhornStarterBase$createRootContext$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RootExecutionContext>, Object> {
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     CoroutineScope $this$withContext;
/*     */     BlockTerminalShellExecutor executor;
/*     */     Function1<? super Path, Boolean> checker;
/*     */     int $i$f$thisLogger;
/*  36 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$withContext = (CoroutineScope)this.L$0;
/*  37 */         executor = BlockTerminalShellExecutorKt.launchBlockTerminalShellExecutor$default(this.$scope, this.$project, null, null, 12, null);
/*  38 */         $i$f$thisLogger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 109 */         Intrinsics.checkNotNullExpressionValue(Logger.getInstance(CoroutineScope.class), "getInstance(...)"); Logger.getInstance(CoroutineScope.class).info("Using executor: " + executor);
/*     */         checker = AiIgnoreUtilKt.obtainAIIgnoreChecker(this.$project);
/*     */         return new RootExecutionContext(this.$service, this.$llmProxy, this.$name, executor::invokeSuspend$lambda$0, false, this.$propertyProvider, HumanInLoop.Companion.getALLOW_ALL(), new Function2<Path, Continuation<? super Boolean>, Object>(checker, null) {
/*     */               int label;
/*     */               
/*     */               public final Object invokeSuspend(Object $result) {
/*     */                 Path it;
/*     */                 IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                 switch (this.label) {
/*     */                   case 0:
/*     */                     ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                     it = (Path)this.L$0;
/*     */                     return this.$checker.invoke(it);
/*     */                 } 
/*     */                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */               }
/*     */               
/*     */               public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                 Function2<Path, Continuation<? super Boolean>, Object> function2 = new Function2<>(this.$checker, $completion);
/*     */                 function2.L$0 = value;
/*     */                 return (Continuation)function2;
/*     */               }
/*     */               
/*     */               public final Object invoke(Path p1, Continuation<?> p2) {
/*     */                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */               }
/*     */             }16, null); }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   int label;
/*     */   
/*     */   MatterhornStarterBase$createRootContext$2(CoroutineScope $scope, Project $project, ArtifactRequestExecutorService $service, LLMProxy $llmProxy, String $name, MatterhornPropertyProvider $propertyProvider, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super MatterhornStarterBase$createRootContext$2> $completion) {
/*     */     MatterhornStarterBase$createRootContext$2 matterhornStarterBase$createRootContext$2 = new MatterhornStarterBase$createRootContext$2(this.$scope, this.$project, this.$service, this.$llmProxy, this.$name, this.$propertyProvider, $completion);
/*     */     matterhornStarterBase$createRootContext$2.L$0 = value;
/*     */     return (Continuation<Unit>)matterhornStarterBase$createRootContext$2;
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((MatterhornStarterBase$createRootContext$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   private static final ShellExecutor invokeSuspend$lambda$0(BlockTerminalShellExecutor $executor) {
/*     */     return (ShellExecutor)$executor;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\MatterhornStarterBase$createRootContext$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */