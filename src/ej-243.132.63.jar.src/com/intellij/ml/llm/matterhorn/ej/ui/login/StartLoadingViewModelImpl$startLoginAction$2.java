/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.ErrorInfo;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JuniorToolWindowViewModelKt;
/*     */ import java.util.concurrent.CancellationException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.MutableStateFlow;
/*     */ 
/*     */ @DebugMetadata(f = "StartLoadingViewModelImpl.kt", l = {87}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.StartLoadingViewModelImpl$startLoginAction$2")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class StartLoadingViewModelImpl$startLoginAction$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */   int label;
/*     */   
/*     */   StartLoadingViewModelImpl$startLoginAction$2(boolean $openBrowser, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore_2
/*     */     //   4: aload_0
/*     */     //   5: getfield label : I
/*     */     //   8: tableswitch default -> 120, 0 -> 32, 1 -> 66
/*     */     //   32: aload_1
/*     */     //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   36: aload_0
/*     */     //   37: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;
/*     */     //   40: invokestatic access$getCheckAccessJob$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;)Lkotlinx/coroutines/Job;
/*     */     //   43: dup
/*     */     //   44: ifnull -> 75
/*     */     //   47: aload_0
/*     */     //   48: checkcast kotlin/coroutines/Continuation
/*     */     //   51: aload_0
/*     */     //   52: iconst_1
/*     */     //   53: putfield label : I
/*     */     //   56: invokestatic cancelAndJoin : (Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   59: dup
/*     */     //   60: aload_2
/*     */     //   61: if_acmpne -> 71
/*     */     //   64: aload_2
/*     */     //   65: areturn
/*     */     //   66: aload_1
/*     */     //   67: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   70: aload_1
/*     */     //   71: pop
/*     */     //   72: goto -> 76
/*     */     //   75: pop
/*     */     //   76: aload_0
/*     */     //   77: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;
/*     */     //   80: aload_0
/*     */     //   81: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;
/*     */     //   84: invokevirtual getScope : ()Lkotlinx/coroutines/CoroutineScope;
/*     */     //   87: aconst_null
/*     */     //   88: aconst_null
/*     */     //   89: new com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl$startLoginAction$2$1
/*     */     //   92: dup
/*     */     //   93: aload_0
/*     */     //   94: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;
/*     */     //   97: aload_0
/*     */     //   98: getfield $openBrowser : Z
/*     */     //   101: aconst_null
/*     */     //   102: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;ZLkotlin/coroutines/Continuation;)V
/*     */     //   105: checkcast kotlin/jvm/functions/Function2
/*     */     //   108: iconst_3
/*     */     //   109: aconst_null
/*     */     //   110: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*     */     //   113: invokestatic access$setCheckAccessJob$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl;Lkotlinx/coroutines/Job;)V
/*     */     //   116: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   119: areturn
/*     */     //   120: new java/lang/IllegalStateException
/*     */     //   123: dup
/*     */     //   124: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   126: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   129: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #86	-> 3
/*     */     //   #87	-> 36
/*     */     //   #86	-> 64
/*     */     //   #87	-> 71
/*     */     //   #88	-> 76
/*     */     //   #99	-> 116
/*     */     //   #86	-> 120
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	130	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl$startLoginAction$2;
/*     */     //   36	84	1	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super StartLoadingViewModelImpl$startLoginAction$2> $completion) {
/*     */     return (Continuation<Unit>)new StartLoadingViewModelImpl$startLoginAction$2(this.$openBrowser, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((StartLoadingViewModelImpl$startLoginAction$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\StartLoadingViewModelImpl$startLoginAction$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */