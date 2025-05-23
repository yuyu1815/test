/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.reporting;
/*    */ 
/*    */ import com.intellij.diagnostic.AbstractMessage;
/*    */ import com.intellij.diagnostic.ITNReporter;
/*    */ import com.intellij.ide.plugins.IdeaPluginDescriptor;
/*    */ import com.intellij.platform.util.coroutines.flow.FlowKt;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Triple;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.time.DurationKt;
/*    */ import kotlin.time.DurationUnit;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "AbstractEJMessagePoolAutoReporter.kt", l = {43}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.reporting.AbstractEJMessagePoolAutoReporter$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class null
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   null(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 42 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 43 */         this.label = 1; if (FlowKt.debounceBatch-HG0u8IE((Flow)AbstractEJMessagePoolAutoReporter.this.getMessages(), DurationKt.toDuration(60, DurationUnit.SECONDS)).collect(new FlowCollector() {
/* 44 */               public final Object emit(List<? extends Triple<? extends AbstractMessage, ? extends ITNReporter, ? extends IdeaPluginDescriptor>> it, Continuation<? super Unit> $completion) { if (AbstractEJMessagePoolAutoReporter.this.sendMessages(it, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return AbstractEJMessagePoolAutoReporter.this.sendMessages(it, $completion);  AbstractEJMessagePoolAutoReporter.this.sendMessages(it, $completion); return Unit.INSTANCE; } }(Continuation)this) == object) return object;  FlowKt.debounceBatch-HG0u8IE((Flow)AbstractEJMessagePoolAutoReporter.this.getMessages(), DurationKt.toDuration(60, DurationUnit.SECONDS)).collect(new FlowCollector() { public final Object emit(List<? extends Triple<? extends AbstractMessage, ? extends ITNReporter, ? extends IdeaPluginDescriptor>> it, Continuation<? super Unit> $completion) { if (AbstractEJMessagePoolAutoReporter.this.sendMessages(it, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return AbstractEJMessagePoolAutoReporter.this.sendMessages(it, $completion);  AbstractEJMessagePoolAutoReporter.this.sendMessages(it, $completion); return Unit.INSTANCE; } }
/*    */             (Continuation)this);
/* 46 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */     return (Continuation<Unit>)new Object(AbstractEJMessagePoolAutoReporter.this, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\reporting\AbstractEJMessagePoolAutoReporter$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */