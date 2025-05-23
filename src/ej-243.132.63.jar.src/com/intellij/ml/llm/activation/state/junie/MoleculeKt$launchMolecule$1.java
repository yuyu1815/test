/*    */ package com.intellij.ml.llm.activation.state.junie;
/*    */ 
/*    */ import androidx.compose.runtime.Composition;
/*    */ import androidx.compose.runtime.Recomposer;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
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
/*    */ @DebugMetadata(f = "Molecule.kt", l = {33}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.activation.state.junie.MoleculeKt$launchMolecule$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class MoleculeKt$launchMolecule$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   MoleculeKt$launchMolecule$1(Recomposer $recomposer, Composition $composition, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 31 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         try {
/* 33 */           this.label = 1; if (this.$recomposer.runRecomposeAndApplyChanges((Continuation)this) == object) return object;  this.$recomposer.runRecomposeAndApplyChanges((Continuation)this);
/*    */         } finally {
/* 35 */           this.$composition.dispose();
/*    */         } 
/* 37 */         return Unit.INSTANCE;
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         this.$composition.dispose(); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super MoleculeKt$launchMolecule$1> $completion) {
/*    */     return (Continuation<Unit>)new MoleculeKt$launchMolecule$1(this.$recomposer, this.$composition, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((MoleculeKt$launchMolecule$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\activation\state\junie\MoleculeKt$launchMolecule$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */