/*    */ package org.jetbrains.jewel.bridge;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
/*    */ 
/*    */ @DebugMetadata(f = "Bridge.kt", l = {27}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.bridge.BridgeKt$lookAndFeelChangedFlow$1")
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0010\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;"})
/*    */ final class BridgeKt$lookAndFeelChangedFlow$1
/*    */   extends SuspendLambda
/*    */   implements Function2<FlowCollector<? super Unit>, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   BridgeKt$lookAndFeelChangedFlow$1(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     FlowCollector $this$onStart;
/* 27 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$onStart = (FlowCollector)this.L$0; this.label = 1; if ($this$onStart.emit(Unit.INSTANCE, (Continuation)this) == object) return object;  $this$onStart.emit(Unit.INSTANCE, (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super BridgeKt$lookAndFeelChangedFlow$1> $completion) {
/*    */     BridgeKt$lookAndFeelChangedFlow$1 bridgeKt$lookAndFeelChangedFlow$1 = new BridgeKt$lookAndFeelChangedFlow$1($completion);
/*    */     bridgeKt$lookAndFeelChangedFlow$1.L$0 = value;
/*    */     return (Continuation<Unit>)bridgeKt$lookAndFeelChangedFlow$1;
/*    */   }
/*    */   
/*    */   public final Object invoke(FlowCollector p1, Continuation<?> p2) {
/*    */     return ((BridgeKt$lookAndFeelChangedFlow$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\BridgeKt$lookAndFeelChangedFlow$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */