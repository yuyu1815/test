/*    */ package com.intellij.ml.llm.matterhorn.ej.phpstorm;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.utils.AwaitUtils;
/*    */ import com.intellij.openapi.application.CoroutinesKt;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.jetbrains.php.composer.actions.ComposerInstallAction;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.Boxing;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.Dispatchers;
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
/*    */ @DebugMetadata(f = "PhpStormJuniePrecondition.kt", l = {63, 66}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.phpstorm.PhpStormJuniePrecondition$checkVendorDirectory$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\013\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
/*    */ final class PhpStormJuniePrecondition$checkVendorDirectory$1
/*    */   extends SuspendLambda
/*    */   implements Function1<Continuation<? super Boolean>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   PhpStormJuniePrecondition$checkVendorDirectory$1(Project $project, VirtualFile $composerConfig, Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 62 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 63 */         this.label = 1; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, this.$composerConfig, null) { int label; public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, this.$composerConfig, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 64 */                     (new ComposerInstallAction()).act(this.$project, this.$composerConfig, "Junie");
/* 65 */                     return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } }(Continuation)this) == object) return object;  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, this.$composerConfig, null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); (new ComposerInstallAction()).act(this.$project, this.$composerConfig, "Junie"); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, this.$composerConfig, $completion); }
/* 66 */               public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); this.label = 2; if (AwaitUtils.INSTANCE.awaitProjectUpdate(this.$project, (Continuation)this) == object) return object;  AwaitUtils.INSTANCE.awaitProjectUpdate(this.$project, (Continuation)this);
/* 67 */         return Boxing.boxBoolean(true);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 2; if (AwaitUtils.INSTANCE.awaitProjectUpdate(this.$project, (Continuation)this) == object) return object;  AwaitUtils.INSTANCE.awaitProjectUpdate(this.$project, (Continuation)this); return Boxing.boxBoolean(true);case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Boxing.boxBoolean(true); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Continuation<? super PhpStormJuniePrecondition$checkVendorDirectory$1> $completion) {
/*    */     return (Continuation<Unit>)new PhpStormJuniePrecondition$checkVendorDirectory$1(this.$project, this.$composerConfig, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(Continuation<?> p1) {
/*    */     return ((PhpStormJuniePrecondition$checkVendorDirectory$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\phpstorm\PhpStormJuniePrecondition$checkVendorDirectory$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */