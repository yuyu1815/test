/*    */ package com.intellij.ml.llm.matterhorn.ej.android.connectedTest;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class null<T>
/*    */   implements FlowCollector
/*    */ {
/*    */   null(Function1<AndroidTestResultListenerEvent, Unit> $onEvent) {}
/*    */   
/*    */   public final Object emit(AndroidTestResultListenerEvent it, Continuation $completion) {
/* 39 */     this.$onEvent.invoke(it); return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\android\connectedTest\AndroidTestResultListenerEventBus$consume$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */