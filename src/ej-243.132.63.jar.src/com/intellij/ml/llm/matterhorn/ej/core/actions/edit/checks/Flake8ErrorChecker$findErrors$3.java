/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.Result;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ResultKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.AbstractEditAction;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionResult;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionSession;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.nio.file.Path;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.time.Duration;
/*     */ import kotlin.time.DurationUnit;
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
/*     */ @DebugMetadata(f = "SyntaxChecker.kt", l = {114}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.Flake8ErrorChecker$findErrors$3")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/LineColumnError;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class Flake8ErrorChecker$findErrors$3
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super List<? extends LineColumnError>>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   Flake8ErrorChecker$findErrors$3(ExecutionSession $executor, Flake8ErrorChecker $receiver, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     Path workDir;
/*     */     ExecutionResult res;
/*     */     String str1, strippedOutput;
/*     */     long l;
/* 110 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         
/* 112 */         Intrinsics.checkNotNullExpressionValue(this.$originalFile.toNioPath(), "toNioPath(...)"); workDir = this.$originalFile.toNioPath();
/*     */ 
/*     */         
/* 115 */         str1 = "flake8 --isolated --select=F821,F822,F831,E111,E112,E113,E999,E902 " + workDir;
/*     */         
/* 117 */         l = Duration.toLong-impl(AbstractEditAction.Companion.getSYNTAX_CHECKING_TIMEOUT-UwyO8pc(), DurationUnit.MILLISECONDS); this.label = 1; if (this.$executor.execute(str1, Boxing.boxLong(l), workDir, (Continuation)this) == object)
/* 118 */           return object;  res = (ExecutionResult)ResultKt.unwrap$default((Result)this.$executor.execute(str1, Boxing.boxLong(l), workDir, (Continuation)this), null, 1, null);
/*     */         
/* 120 */         strippedOutput = Flake8ErrorChecker.access$stripAnsiCodes(Flake8ErrorChecker.this, res.getOutput());
/*     */         
/* 122 */         return Flake8ErrorChecker.Companion.parseLintErrors(strippedOutput);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); res = (ExecutionResult)ResultKt.unwrap$default((Result)SYNTHETIC_LOCAL_VARIABLE_1, null, 1, null); strippedOutput = Flake8ErrorChecker.access$stripAnsiCodes(Flake8ErrorChecker.this, res.getOutput()); return Flake8ErrorChecker.Companion.parseLintErrors(strippedOutput); }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super Flake8ErrorChecker$findErrors$3> $completion) {
/*     */     return (Continuation<Unit>)new Flake8ErrorChecker$findErrors$3(this.$executor, Flake8ErrorChecker.this, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((Flake8ErrorChecker$findErrors$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\checks\Flake8ErrorChecker$findErrors$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */