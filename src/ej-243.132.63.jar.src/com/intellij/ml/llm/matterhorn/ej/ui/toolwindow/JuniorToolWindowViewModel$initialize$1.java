/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.toolwindow;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.login.GrazieActivationVm;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.login.states.GrazieActivationState;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.vm.ViewModel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ @DebugMetadata(f = "JuniorToolWindowViewModel.kt", l = {75, 77, 85}, i = {0}, s = {"L$0"}, n = {"activationVm"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JuniorToolWindowViewModel$initialize$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class JuniorToolWindowViewModel$initialize$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */   Object L$0;
/*    */   int label;
/*    */   
/*    */   JuniorToolWindowViewModel$initialize$1(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore #4
/*    */     //   5: aload_0
/*    */     //   6: getfield label : I
/*    */     //   9: tableswitch default -> 260, 0 -> 40, 1 -> 122, 2 -> 185, 3 -> 250
/*    */     //   40: aload_1
/*    */     //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   44: aload_0
/*    */     //   45: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*    */     //   48: invokevirtual getLlmProxy : ()Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*    */     //   51: instanceof com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieLLMProxy
/*    */     //   54: ifeq -> 194
/*    */     //   57: new com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm
/*    */     //   60: dup
/*    */     //   61: aload_0
/*    */     //   62: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*    */     //   65: invokevirtual getScope : ()Lkotlinx/coroutines/CoroutineScope;
/*    */     //   68: aload_0
/*    */     //   69: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*    */     //   72: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   75: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/openapi/project/Project;)V
/*    */     //   78: astore_2
/*    */     //   79: aload_0
/*    */     //   80: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*    */     //   83: aload_2
/*    */     //   84: invokestatic access$createGrazieActivationPageVm : (Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;)Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationPageVm;
/*    */     //   87: astore_3
/*    */     //   88: aload_0
/*    */     //   89: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*    */     //   92: aload_3
/*    */     //   93: checkcast com/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel
/*    */     //   96: aload_0
/*    */     //   97: checkcast kotlin/coroutines/Continuation
/*    */     //   100: aload_0
/*    */     //   101: aload_2
/*    */     //   102: putfield L$0 : Ljava/lang/Object;
/*    */     //   105: aload_0
/*    */     //   106: iconst_1
/*    */     //   107: putfield label : I
/*    */     //   110: invokevirtual switchToPage$ej_ui : (Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   113: dup
/*    */     //   114: aload #4
/*    */     //   116: if_acmpne -> 135
/*    */     //   119: aload #4
/*    */     //   121: areturn
/*    */     //   122: aload_0
/*    */     //   123: getfield L$0 : Ljava/lang/Object;
/*    */     //   126: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm
/*    */     //   129: astore_2
/*    */     //   130: aload_1
/*    */     //   131: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   134: aload_1
/*    */     //   135: pop
/*    */     //   136: aload_2
/*    */     //   137: invokevirtual getState : ()Lkotlinx/coroutines/flow/StateFlow;
/*    */     //   140: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   143: new com/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel$initialize$1$1
/*    */     //   146: dup
/*    */     //   147: aload_0
/*    */     //   148: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*    */     //   151: aload_2
/*    */     //   152: aconst_null
/*    */     //   153: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;Lkotlin/coroutines/Continuation;)V
/*    */     //   156: checkcast kotlin/jvm/functions/Function2
/*    */     //   159: aload_0
/*    */     //   160: checkcast kotlin/coroutines/Continuation
/*    */     //   163: aload_0
/*    */     //   164: aconst_null
/*    */     //   165: putfield L$0 : Ljava/lang/Object;
/*    */     //   168: aload_0
/*    */     //   169: iconst_2
/*    */     //   170: putfield label : I
/*    */     //   173: invokestatic collectLatest : (Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   176: dup
/*    */     //   177: aload #4
/*    */     //   179: if_acmpne -> 190
/*    */     //   182: aload #4
/*    */     //   184: areturn
/*    */     //   185: aload_1
/*    */     //   186: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   189: aload_1
/*    */     //   190: pop
/*    */     //   191: goto -> 256
/*    */     //   194: aload_0
/*    */     //   195: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*    */     //   198: new com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl
/*    */     //   201: dup
/*    */     //   202: aload_0
/*    */     //   203: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*    */     //   206: invokevirtual getScope : ()Lkotlinx/coroutines/CoroutineScope;
/*    */     //   209: aload_0
/*    */     //   210: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*    */     //   213: invokestatic access$getPropertyProvider$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;)Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   216: aload_0
/*    */     //   217: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*    */     //   220: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   223: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lcom/intellij/openapi/project/Project;)V
/*    */     //   226: checkcast com/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel
/*    */     //   229: aload_0
/*    */     //   230: checkcast kotlin/coroutines/Continuation
/*    */     //   233: aload_0
/*    */     //   234: iconst_3
/*    */     //   235: putfield label : I
/*    */     //   238: invokevirtual switchToPage$ej_ui : (Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   241: dup
/*    */     //   242: aload #4
/*    */     //   244: if_acmpne -> 255
/*    */     //   247: aload #4
/*    */     //   249: areturn
/*    */     //   250: aload_1
/*    */     //   251: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   254: aload_1
/*    */     //   255: pop
/*    */     //   256: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   259: areturn
/*    */     //   260: new java/lang/IllegalStateException
/*    */     //   263: dup
/*    */     //   264: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   266: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   269: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #71	-> 3
/*    */     //   #72	-> 44
/*    */     //   #73	-> 57
/*    */     //   #74	-> 79
/*    */     //   #75	-> 88
/*    */     //   #71	-> 119
/*    */     //   #77	-> 135
/*    */     //   #71	-> 182
/*    */     //   #77	-> 190
/*    */     //   #85	-> 194
/*    */     //   #71	-> 247
/*    */     //   #87	-> 255
/*    */     //   #71	-> 260
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   79	43	2	activationVm	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;
/*    */     //   130	46	2	activationVm	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;
/*    */     //   88	25	3	activationPage	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationPageVm;
/*    */     //   0	270	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel$initialize$1;
/*    */     //   44	216	1	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super JuniorToolWindowViewModel$initialize$1> $completion) {
/*    */     return (Continuation<Unit>)new JuniorToolWindowViewModel$initialize$1($completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((JuniorToolWindowViewModel$initialize$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\toolwindow\JuniorToolWindowViewModel$initialize$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */