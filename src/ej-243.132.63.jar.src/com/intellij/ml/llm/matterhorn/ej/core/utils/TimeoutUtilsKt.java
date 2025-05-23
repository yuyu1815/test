/*    */ package com.intellij.ml.llm.matterhorn.ej.core.utils;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\"\n\002\b\003\n\002\020\t\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\002\b\002\032E\020\000\032\002H\001\"\004\b\000\020\0012\006\020\002\032\0020\0032'\020\004\032#\b\001\022\004\022\0020\006\022\n\022\b\022\004\022\002H\0010\007\022\006\022\004\030\0010\b0\005¢\006\002\b\tH@¢\006\002\020\n¨\006\013"}, d2 = {"withOptionalTimeout", "T", "timeMillis", "", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"}) public final class TimeoutUtilsKt { @DebugMetadata(f = "TimeoutUtils.kt", l = {18}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.utils.TimeoutUtilsKt$withOptionalTimeout$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}) static final class TimeoutUtilsKt$withOptionalTimeout$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> { int label; TimeoutUtilsKt$withOptionalTimeout$2(Function2<CoroutineScope, Continuation<? super T>, Object> $block, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { CoroutineScope $this$coroutineScope; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           $this$coroutineScope = (CoroutineScope)this.L$0;
/*    */           this.label = 1;
/*    */           return (this.$block.invoke($this$coroutineScope, this) == object) ? object : this.$block.invoke($this$coroutineScope, this);
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super TimeoutUtilsKt$withOptionalTimeout$2> $completion) { TimeoutUtilsKt$withOptionalTimeout$2 timeoutUtilsKt$withOptionalTimeout$2 = new TimeoutUtilsKt$withOptionalTimeout$2(this.$block, $completion);
/*    */       timeoutUtilsKt$withOptionalTimeout$2.L$0 = value;
/* 18 */       return (Continuation<Unit>)timeoutUtilsKt$withOptionalTimeout$2; } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((TimeoutUtilsKt$withOptionalTimeout$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } @Nullable public static final <T> Object withOptionalTimeout(long timeMillis, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block, @NotNull Continuation $completion) { if (timeMillis <= 0L) return CoroutineScopeKt.coroutineScope(new TimeoutUtilsKt$withOptionalTimeout$2(block, null), $completion); 
/* 19 */     return TimeoutKt.withTimeout(timeMillis, new TimeoutUtilsKt$withOptionalTimeout$3(block, null), $completion); } @DebugMetadata(f = "TimeoutUtils.kt", l = {19}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.utils.TimeoutUtilsKt$withOptionalTimeout$3") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}) static final class TimeoutUtilsKt$withOptionalTimeout$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> { public final Object invokeSuspend(Object $result) { CoroutineScope $this$withTimeout; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$withTimeout = (CoroutineScope)this.L$0; this.label = 1; return (this.$block.invoke($this$withTimeout, this) == object) ? object : this.$block.invoke($this$withTimeout, this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     int label;
/*    */     
/*    */     TimeoutUtilsKt$withOptionalTimeout$3(Function2<CoroutineScope, Continuation<? super T>, Object> $block, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super TimeoutUtilsKt$withOptionalTimeout$3> $completion) {
/*    */       TimeoutUtilsKt$withOptionalTimeout$3 timeoutUtilsKt$withOptionalTimeout$3 = new TimeoutUtilsKt$withOptionalTimeout$3(this.$block, $completion);
/*    */       timeoutUtilsKt$withOptionalTimeout$3.L$0 = value;
/*    */       return (Continuation<Unit>)timeoutUtilsKt$withOptionalTimeout$3;
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((TimeoutUtilsKt$withOptionalTimeout$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\cor\\utils\TimeoutUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */