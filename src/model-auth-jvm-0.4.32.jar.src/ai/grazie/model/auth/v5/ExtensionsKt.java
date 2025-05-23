/*    */ package ai.grazie.model.auth.v5;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\"\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\002\b\002\032E\020\000\032\002H\001\"\004\b\000\020\0012\006\020\002\032\0020\0032'\020\004\032#\b\001\022\004\022\0020\006\022\n\022\b\022\004\022\002H\0010\007\022\006\022\004\030\0010\b0\005¢\006\002\b\tH@¢\006\002\020\n¨\006\013"}, d2 = {"withServiceToken", "T", "token", "", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-auth"})
/*    */ public final class ExtensionsKt {
/*    */   @Nullable
/* 15 */   public static final <T> Object withServiceToken(@NotNull String token, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block, @NotNull Continuation $completion) { return BuildersKt.withContext((CoroutineContext)new AuthServiceToken(token), new ExtensionsKt$withServiceToken$2(block, null), $completion); } @DebugMetadata(f = "Extensions.kt", l = {16}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.model.auth.v5.ExtensionsKt$withServiceToken$2") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}) static final class ExtensionsKt$withServiceToken$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> { public final Object invokeSuspend(Object $result) { CoroutineScope $this$withContext; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$withContext = (CoroutineScope)this.L$0;
/* 16 */           this.label = 1; if (this.$block.invoke($this$withContext, this) == object) return object;  return this.$block.invoke($this$withContext, this);
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     int label;
/*    */     
/*    */     ExtensionsKt$withServiceToken$2(Function2<CoroutineScope, Continuation<? super T>, Object> $block, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super ExtensionsKt$withServiceToken$2> $completion) {
/*    */       ExtensionsKt$withServiceToken$2 extensionsKt$withServiceToken$2 = new ExtensionsKt$withServiceToken$2(this.$block, $completion);
/*    */       extensionsKt$withServiceToken$2.L$0 = value;
/*    */       return (Continuation<Unit>)extensionsKt$withServiceToken$2;
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((ExtensionsKt$withServiceToken$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-auth-jvm-0.4.32.jar!\ai\grazie\model\auth\v5\ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */