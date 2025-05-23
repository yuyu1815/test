/*    */ package com.intellij.ml.llm.activation.state.junie;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.Composition;
/*    */ import androidx.compose.runtime.Recomposer;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Ref;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.MutableStateFlow;
/*    */ import kotlinx.coroutines.flow.StateFlow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\032.\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\0020\0032\021\020\004\032\r\022\004\022\002H\0020\005¢\006\002\b\006¢\006\002\020\007¨\006\b"}, d2 = {"launchMolecule", "Lkotlinx/coroutines/flow/StateFlow;", "T", "Lkotlinx/coroutines/CoroutineScope;", "body", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;", "state.junie.impl"})
/*    */ public final class MoleculeKt {
/*    */   @ComposableInferredTarget(scheme = "[0[0]]")
/*    */   @NotNull
/*    */   public static final <T> StateFlow<T> launchMolecule(@NotNull CoroutineScope $this$launchMolecule, @NotNull Function2<? super Composer, ? super Integer, ? extends T> body) {
/* 23 */     Intrinsics.checkNotNullParameter($this$launchMolecule, "<this>"); Intrinsics.checkNotNullParameter(body, "body"); Ref.ObjectRef<MutableStateFlow<T>> flow = new Ref.ObjectRef();
/*    */     
/* 25 */     CoroutineContext context = $this$launchMolecule.getCoroutineContext().plus((CoroutineContext)new GatedFrameClock($this$launchMolecule));
/*    */     
/* 27 */     Recomposer recomposer = new Recomposer(context);
/*    */     
/* 29 */     Composition composition = CompositionKt.Composition((Applier)NopApplier.INSTANCE, (CompositionContext)recomposer);
/*    */     
/* 31 */     BuildersKt.launch($this$launchMolecule, context, CoroutineStart.UNDISPATCHED, new MoleculeKt$launchMolecule$1(recomposer, composition, null));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 39 */     composition.setContent((Function2)ComposableLambdaKt.composableLambdaInstance(-1440870263, true, new MoleculeKt$launchMolecule$2(body, flow)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 49 */     Intrinsics.checkNotNull(flow.element); return (StateFlow<T>)flow.element;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "Molecule.kt", l = {33}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.activation.state.junie.MoleculeKt$launchMolecule$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class MoleculeKt$launchMolecule$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     MoleculeKt$launchMolecule$1(Recomposer $recomposer, Composition $composition, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           try {
/*    */             this.label = 1;
/*    */             if (this.$recomposer.runRecomposeAndApplyChanges((Continuation)this) == object)
/*    */               return object; 
/*    */             this.$recomposer.runRecomposeAndApplyChanges((Continuation)this);
/*    */           } finally {
/*    */             this.$composition.dispose();
/*    */           } 
/*    */           return Unit.INSTANCE;
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           this.$composition.dispose();
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super MoleculeKt$launchMolecule$1> $completion) {
/*    */       return (Continuation<Unit>)new MoleculeKt$launchMolecule$1(this.$recomposer, this.$composition, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((MoleculeKt$launchMolecule$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class MoleculeKt$launchMolecule$2 implements Function2<Composer, Integer, Unit> {
/*    */     @Composable
/*    */     public final void invoke(Composer $composer, int $changed) {
/*    */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*    */         if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventStart(-1440870263, $changed, -1, "com.intellij.ml.llm.activation.state.junie.launchMolecule.<anonymous> (Molecule.kt:39)"); 
/*    */         Object value = this.$body.invoke($composer, Integer.valueOf(0));
/*    */         MutableStateFlow outputFlow = (MutableStateFlow)this.$flow.element;
/*    */         if (outputFlow != null) {
/*    */           outputFlow.setValue(value);
/*    */         } else {
/*    */           this.$flow.element = StateFlowKt.MutableStateFlow(value);
/*    */         } 
/*    */         if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventEnd(); 
/*    */       } else {
/*    */         $composer.skipToGroupEnd();
/*    */       } 
/*    */     }
/*    */     
/*    */     MoleculeKt$launchMolecule$2(Function2<Composer, Integer, T> $body, Ref.ObjectRef<MutableStateFlow<T>> $flow) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\activation\state\junie\MoleculeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */