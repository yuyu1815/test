/*    */ package com.intellij.ml.llm.matterhorn.ej.goland;
/*    */ 
/*    */ import com.goide.project.GoModuleSettings;
/*    */ import com.intellij.openapi.application.CoroutinesKt;
/*    */ import com.intellij.openapi.module.Module;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
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
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @DebugMetadata(f = "GoJuniePreconditionChecker.kt", l = {54}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.goland.GoJuniePreconditionChecker$checkGoSupportEnabled$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\013\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
/*    */ final class GoJuniePreconditionChecker$checkGoSupportEnabled$1
/*    */   extends SuspendLambda
/*    */   implements Function1<Continuation<? super Boolean>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   GoJuniePreconditionChecker$checkGoSupportEnabled$1(List<Module> $modulesWithoutGoSupport, Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 53 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 54 */         this.label = 1; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$modulesWithoutGoSupport, null) { int label; public final Object invokeSuspend(Object $result) { Iterable<Module> $this$forEach$iv; int $i$f$forEach; Iterator<Module> iterator; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 55 */                     $this$forEach$iv = this.$modulesWithoutGoSupport; $i$f$forEach = 0;
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
/* 94 */                     iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Module it = (Module)element$iv; int $i$a$-forEach-GoJuniePreconditionChecker$checkGoSupportEnabled$1$1$1 = 0; GoModuleSettings.getInstance(it).setGoSupportEnabled(true); }  return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invokeSuspend(Object $result) { Iterable<Module> $this$forEach$iv; int $i$f$forEach; Iterator<Module> iterator; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$forEach$iv = this.$modulesWithoutGoSupport; $i$f$forEach = 0; iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Module it = (Module)element$iv; int $i$a$-forEach-GoJuniePreconditionChecker$checkGoSupportEnabled$1$1$1 = 0;
/*    */                       GoModuleSettings.getInstance(it).setGoSupportEnabled(true); }
/*    */                     
/*    */                     return Unit.INSTANCE; }
/*    */                 
/*    */                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */               
/*    */               public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */                 return (Continuation)new Function2<>(this.$modulesWithoutGoSupport, $completion);
/*    */               }
/*    */               
/*    */               public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */               } }
/*    */             (Continuation)this) == object)
/*    */           return object; 
/*    */         BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$modulesWithoutGoSupport, null) {
/*    */               int label;
/*    */               
/*    */               public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */                 return (Continuation)new Function2<>(this.$modulesWithoutGoSupport, $completion);
/*    */               }
/*    */               
/*    */               public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */               }
/*    */             }(Continuation)this);
/*    */         return Boxing.boxBoolean(true);
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         return Boxing.boxBoolean(true); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Continuation<? super GoJuniePreconditionChecker$checkGoSupportEnabled$1> $completion) {
/*    */     return (Continuation<Unit>)new GoJuniePreconditionChecker$checkGoSupportEnabled$1(this.$modulesWithoutGoSupport, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(Continuation<?> p1) {
/*    */     return ((GoJuniePreconditionChecker$checkGoSupportEnabled$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\goland\GoJuniePreconditionChecker$checkGoSupportEnabled$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */