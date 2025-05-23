/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
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
/*    */ @DebugMetadata(f = "LegacyShellExecutor.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.LegacyShellExecutor$executeCommand$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class LegacyShellExecutor$executeCommand$2
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   LegacyShellExecutor$executeCommand$2(String $command, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 66 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 67 */         if (LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this) == null) { LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this); Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("PS1=''\nPS2=''\nPS3=''\nPS4=''\n");
/*    */         
/* 69 */         if (LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this) == null) { LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this); Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("stty -echo\n");
/*    */ 
/*    */         
/* 72 */         if (LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this) == null) { LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this); Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("echo \"JB_MATTERHORN___START_SIGNAL___\"\n");
/* 73 */         if (StringsKt.contains$default(this.$command, '\n', false, 2, null)) {
/*    */           
/* 75 */           if (LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this) == null) { LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this); Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("{ " + this.$command + " } 2>&1");
/*    */         } else {
/* 77 */           if (LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this) == null) { LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this); Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("{ " + this.$command + "; JB_MATTERHORN___EXIT_STATUS_ENV_VAR___=$?; } 2>&1");
/*    */         } 
/* 79 */         if (LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this) == null) { LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this); Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("\n");
/* 80 */         if (LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this) == null) { LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this); Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("PS1=''\nPS2=''\nPS3=''\nPS4=''\n");
/* 81 */         if (LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this) == null) { LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this); Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("echo \n");
/* 82 */         if (LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this) == null) { LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this); Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("echo \"JB_MATTERHORN___EXIT_CODE___$JB_MATTERHORN___EXIT_STATUS_ENV_VAR___\"\n");
/* 83 */         if (LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this) == null) { LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this); Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("echo \"JB_MATTERHORN___END_SIGNAL___\"\n");
/* 84 */         if (LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this) == null) { LegacyShellExecutor.access$getWriter$p(LegacyShellExecutor.this); Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.flush();
/* 85 */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super LegacyShellExecutor$executeCommand$2> $completion) {
/*    */     return (Continuation<Unit>)new LegacyShellExecutor$executeCommand$2(this.$command, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((LegacyShellExecutor$executeCommand$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\LegacyShellExecutor$executeCommand$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */