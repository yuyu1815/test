/*    */ package com.intellij.ml.llm.matterhorn.ej.clion;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.jetbrains.cidr.radler.inspections.RadInspection;
/*    */ import com.jetbrains.cidr.radler.util.RadDiagnosticUtilKt;
/*    */ import com.jetbrains.rd.util.lifetime.LifetimeDefinition;
/*    */ import com.jetbrains.rider.model.Issue;
/*    */ import com.jetbrains.rider.model.IssueGroup;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.time.DurationKt;
/*    */ import kotlin.time.DurationUnit;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ @DebugMetadata(f = "RadErrorChecker.kt", l = {32}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.clion.RadErrorChecker$findErrors$errors$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\n"}, d2 = {"<anonymous>", "", "Lcom/jetbrains/rider/model/Issue;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class RadErrorChecker$findErrors$errors$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Issue>>, Object> {
/*    */   int label;
/*    */   
/*    */   RadErrorChecker$findErrors$errors$1(PsiFile $file, LifetimeDefinition $def, Project $project, int $id, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 31 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 32 */         this.label = 1; if (RadDiagnosticUtilKt.withBackendThreadDumps-rnQQ1Ag(DurationKt.toDuration(5, DurationUnit.MINUTES), "runBackendSession(" + this.$file.getName() + ")", new Function1<Continuation<? super List<? extends Issue>>, Object>(this.$def, this.$project, this.$id, null) { int label; public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 33 */                     this.label = 1; if (RadInspection.Companion.runBackendSession(this.$def.getLifetime(), this.$project, this.$id, IssueGroup.All, (Continuation)this) == object) return object;  return RadInspection.Companion.runBackendSession(this.$def.getLifetime(), this.$project, this.$id, IssueGroup.All, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (RadInspection.Companion.runBackendSession(this.$def.getLifetime(), this.$project, this.$id, IssueGroup.All, (Continuation)this) == object) return object;  return RadInspection.Companion.runBackendSession(this.$def.getLifetime(), this.$project, this.$id, IssueGroup.All, (Continuation)this);
/*    */                   case 1:
/*    */                     ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                     return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */                 
/*    */                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */               
/*    */               public final Continuation<Unit> create(Continuation<? super null> $completion) {
/*    */                 return (Continuation)new Function1<>(this.$def, this.$project, this.$id, $completion);
/*    */               }
/*    */               
/*    */               public final Object invoke(Continuation<?> p1) {
/*    */                 return ((null)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */               } }
/*    */             (Continuation)this) == object)
/*    */           return object; 
/*    */         return RadDiagnosticUtilKt.withBackendThreadDumps-rnQQ1Ag(DurationKt.toDuration(5, DurationUnit.MINUTES), "runBackendSession(" + this.$file.getName() + ")", new Function1<Continuation<? super List<? extends Issue>>, Object>(this.$def, this.$project, this.$id, null) {
/*    */               int label;
/*    */               
/*    */               public final Continuation<Unit> create(Continuation<? super null> $completion) {
/*    */                 return (Continuation)new Function1<>(this.$def, this.$project, this.$id, $completion);
/*    */               }
/*    */               
/*    */               public final Object invoke(Continuation<?> p1) {
/*    */                 return ((null)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */               }
/*    */             }(Continuation)this);
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super RadErrorChecker$findErrors$errors$1> $completion) {
/*    */     return (Continuation<Unit>)new RadErrorChecker$findErrors$errors$1(this.$file, this.$def, this.$project, this.$id, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((RadErrorChecker$findErrors$errors$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\clion\RadErrorChecker$findErrors$errors$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */