/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal;
/*    */ 
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
/*    */ @DebugMetadata(f = "JunieTerminalRunner.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.JunieTerminalRunner$launchWidget$configuredOptions$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\020\000\032\f0\001¢\006\002\b\002¢\006\002\b\003*\0020\004H\n"}, d2 = {"<anonymous>", "Lorg/jetbrains/plugins/terminal/ShellStartupOptions;", "Lorg/jetbrains/annotations/NotNull;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class JunieTerminalRunner$launchWidget$configuredOptions$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super ShellStartupOptions>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   JunieTerminalRunner$launchWidget$configuredOptions$1(ShellStartupOptions $startupOptions, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 40 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 41 */         return JunieTerminalRunner.this.configureStartupOptions(this.$startupOptions); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super JunieTerminalRunner$launchWidget$configuredOptions$1> $completion) {
/*    */     return (Continuation<Unit>)new JunieTerminalRunner$launchWidget$configuredOptions$1(this.$startupOptions, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((JunieTerminalRunner$launchWidget$configuredOptions$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\JunieTerminalRunner$launchWidget$configuredOptions$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */