/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import java.util.ArrayList;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.CoroutineScopeKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "LegacyShellExecutor.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.LegacyShellExecutor$getCommandResult$job$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class LegacyShellExecutor$getCommandResult$job$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   LegacyShellExecutor$getCommandResult$job$1(Logger $logger, Ref.ObjectRef<Integer> $exitCode, Ref.BooleanRef $lineLimitExceeded, ArrayList<String> $output, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     CoroutineScope $this$async;
/*     */     String line;
/* 110 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$async = (CoroutineScope)this.L$0;
/* 111 */         if (LegacyShellExecutor.access$getReader$p(LegacyShellExecutor.this) == null) { LegacyShellExecutor.access$getReader$p(LegacyShellExecutor.this); Intrinsics.throwUninitializedPropertyAccessException("reader"); }  line = null.readLine();
/*     */ 
/*     */         
/* 114 */         while (line != null && !StringsKt.startsWith$default(line, "JB_MATTERHORN___START_SIGNAL___", false, 2, null) && CoroutineScopeKt.isActive($this$async)) {
/* 115 */           if (LegacyShellExecutor.access$getReader$p(LegacyShellExecutor.this) == null) { LegacyShellExecutor.access$getReader$p(LegacyShellExecutor.this); Intrinsics.throwUninitializedPropertyAccessException("reader"); }  line = null.readLine();
/* 116 */           this.$logger.debug("SKIPPED LINE: " + line);
/*     */         } 
/*     */         
/* 119 */         if (LegacyShellExecutor.access$getReader$p(LegacyShellExecutor.this) == null) { LegacyShellExecutor.access$getReader$p(LegacyShellExecutor.this); Intrinsics.throwUninitializedPropertyAccessException("reader"); }  line = null.readLine();
/*     */         
/* 121 */         while (line != null && !StringsKt.startsWith$default(line, "JB_MATTERHORN___END_SIGNAL___", false, 2, null) && CoroutineScopeKt.isActive($this$async)) {
/* 122 */           this.$logger.debug("LINE: " + line);
/* 123 */           if (StringsKt.startsWith$default(line, "JB_MATTERHORN___EXIT_CODE___", false, 2, null)) {
/* 124 */             this.$exitCode.element = StringsKt.toIntOrNull(StringsKt.substringAfter$default(line, "JB_MATTERHORN___EXIT_CODE___", null, 2, null));
/*     */           }
/* 126 */           else if (!this.$lineLimitExceeded.element) {
/* 127 */             this.$output.add(line);
/* 128 */             if (this.$output.size() >= LegacyShellExecutor.this.getCancellationPolicy().getOutputLinesLimit()) {
/* 129 */               this.$lineLimitExceeded.element = true;
/*     */               
/* 131 */               throw new ShellExecutor.Companion.LineLimitExceededException();
/*     */             } 
/*     */           } 
/*     */           
/* 135 */           if (LegacyShellExecutor.access$getReader$p(LegacyShellExecutor.this) == null) { LegacyShellExecutor.access$getReader$p(LegacyShellExecutor.this); Intrinsics.throwUninitializedPropertyAccessException("reader"); }  line = null.readLine();
/*     */         } 
/* 137 */         return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super LegacyShellExecutor$getCommandResult$job$1> $completion) {
/*     */     LegacyShellExecutor$getCommandResult$job$1 legacyShellExecutor$getCommandResult$job$1 = new LegacyShellExecutor$getCommandResult$job$1(this.$logger, this.$exitCode, this.$lineLimitExceeded, this.$output, $completion);
/*     */     legacyShellExecutor$getCommandResult$job$1.L$0 = value;
/*     */     return (Continuation<Unit>)legacyShellExecutor$getCommandResult$job$1;
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((LegacyShellExecutor$getCommandResult$job$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\LegacyShellExecutor$getCommandResult$job$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */