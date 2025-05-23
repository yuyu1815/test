/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.TerminalWidgetImpl;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.plugins.terminal.ShellStartupOptions;
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "JunieTerminalRunner.kt", l = {31}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.JunieTerminalRunner$launchJunieTerminalWidget$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class JunieTerminalRunner$launchJunieTerminalWidget$2
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super TerminalWidgetImpl>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   JunieTerminalRunner$launchJunieTerminalWidget$2(TerminalWidgetImpl $widget, ShellStartupOptions $startupOptions, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 30 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 31 */         this.label = 1; if (JunieTerminalRunner.access$launchWidget(JunieTerminalRunner.this, this.$widget, this.$startupOptions, (Continuation)this) == object) return object;  JunieTerminalRunner.access$launchWidget(JunieTerminalRunner.this, this.$widget, this.$startupOptions, (Continuation)this);
/* 32 */         return this.$widget;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return this.$widget; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super JunieTerminalRunner$launchJunieTerminalWidget$2> $completion) {
/*    */     return (Continuation<Unit>)new JunieTerminalRunner$launchJunieTerminalWidget$2(this.$widget, this.$startupOptions, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((JunieTerminalRunner$launchJunieTerminalWidget$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\JunieTerminalRunner$launchJunieTerminalWidget$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */