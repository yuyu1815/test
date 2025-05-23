/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.TerminalWidgetImpl;
/*    */ import com.jediterm.core.util.TermSize;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.Deferred;
/*    */ import kotlinx.coroutines.future.FutureKt;
/*    */ import org.jetbrains.plugins.terminal.ShellStartupOptions;
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
/*    */ @DebugMetadata(f = "JunieTerminalRunner.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.JunieTerminalRunner$launchWidget$initialSizeFuture$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\020\000\032\020\022\f\022\n \003*\004\030\0010\0020\0020\001*\0020\004H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Deferred;", "Lcom/jediterm/core/util/TermSize;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class JunieTerminalRunner$launchWidget$initialSizeFuture$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Deferred<? extends TermSize>>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   JunieTerminalRunner$launchWidget$initialSizeFuture$1(TerminalWidgetImpl $widget, ShellStartupOptions $configuredOptions, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 43 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 44 */         return FutureKt.asDeferred(this.$widget.initialize(this.$configuredOptions)); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super JunieTerminalRunner$launchWidget$initialSizeFuture$1> $completion) {
/*    */     return (Continuation<Unit>)new JunieTerminalRunner$launchWidget$initialSizeFuture$1(this.$widget, this.$configuredOptions, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((JunieTerminalRunner$launchWidget$initialSizeFuture$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\JunieTerminalRunner$launchWidget$initialSizeFuture$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */