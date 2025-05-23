/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.toolwindow;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.ErrorInfo;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ 
/*     */ @DebugMetadata(f = "JuniorToolWindowViewModel.kt", l = {94}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JuniorToolWindowViewModel$refreshJunieProblems$2")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nJuniorToolWindowViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JuniorToolWindowViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel$refreshJunieProblems$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,213:1\n226#2,5:214\n*S KotlinDebug\n*F\n+ 1 JuniorToolWindowViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel$refreshJunieProblems$2\n*L\n95#1:214,5\n*E\n"})
/*     */ final class JuniorToolWindowViewModel$refreshJunieProblems$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */   int label;
/*     */   
/*     */   JuniorToolWindowViewModel$refreshJunieProblems$2(Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore #10
/*     */     //   5: aload_0
/*     */     //   6: getfield label : I
/*     */     //   9: tableswitch default -> 159, 0 -> 32, 1 -> 57
/*     */     //   32: aload_1
/*     */     //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   36: aload_0
/*     */     //   37: checkcast kotlin/coroutines/Continuation
/*     */     //   40: aload_0
/*     */     //   41: iconst_1
/*     */     //   42: putfield label : I
/*     */     //   45: invokestatic checkAgreements : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   48: dup
/*     */     //   49: aload #10
/*     */     //   51: if_acmpne -> 62
/*     */     //   54: aload #10
/*     */     //   56: areturn
/*     */     //   57: aload_1
/*     */     //   58: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   61: aload_1
/*     */     //   62: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo
/*     */     //   65: dup
/*     */     //   66: ifnull -> 153
/*     */     //   69: astore_2
/*     */     //   70: aload_0
/*     */     //   71: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*     */     //   74: astore_3
/*     */     //   75: iconst_0
/*     */     //   76: istore #4
/*     */     //   78: aload_3
/*     */     //   79: invokestatic access$get_junieProblems$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   82: astore #5
/*     */     //   84: iconst_0
/*     */     //   85: istore #6
/*     */     //   87: nop
/*     */     //   88: aload #5
/*     */     //   90: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   95: astore #7
/*     */     //   97: aload #7
/*     */     //   99: checkcast java/util/List
/*     */     //   102: pop
/*     */     //   103: iconst_0
/*     */     //   104: istore #9
/*     */     //   106: new com/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem
/*     */     //   109: dup
/*     */     //   110: ldc 'Read and accept our User Licence Agreement'
/*     */     //   112: ldc 'Accept'
/*     */     //   114: new com/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel$refreshJunieProblems$2$1$1$1
/*     */     //   117: dup
/*     */     //   118: aconst_null
/*     */     //   119: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   122: checkcast kotlin/jvm/functions/Function1
/*     */     //   125: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
/*     */     //   128: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   131: nop
/*     */     //   132: astore #8
/*     */     //   134: aload #5
/*     */     //   136: aload #7
/*     */     //   138: aload #8
/*     */     //   140: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   145: ifeq -> 87
/*     */     //   148: nop
/*     */     //   149: nop
/*     */     //   150: goto -> 155
/*     */     //   153: pop
/*     */     //   154: nop
/*     */     //   155: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   158: areturn
/*     */     //   159: new java/lang/IllegalStateException
/*     */     //   162: dup
/*     */     //   163: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   165: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   168: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #93	-> 3
/*     */     //   #94	-> 36
/*     */     //   #93	-> 54
/*     */     //   #94	-> 62
/*     */     //   #95	-> 78
/*     */     //   #214	-> 87
/*     */     //   #215	-> 88
/*     */     //   #216	-> 97
/*     */     //   #97	-> 106
/*     */     //   #98	-> 110
/*     */     //   #99	-> 112
/*     */     //   #96	-> 114
/*     */     //   #97	-> 125
/*     */     //   #96	-> 128
/*     */     //   #102	-> 131
/*     */     //   #216	-> 132
/*     */     //   #217	-> 134
/*     */     //   #218	-> 148
/*     */     //   #104	-> 149
/*     */     //   #94	-> 150
/*     */     //   #94	-> 153
/*     */     //   #105	-> 155
/*     */     //   #93	-> 159
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   84	65	5	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   97	52	7	prevValue$iv	Ljava/lang/Object;
/*     */     //   134	15	8	nextValue$iv	Ljava/lang/Object;
/*     */     //   106	26	9	$i$a$-update-JuniorToolWindowViewModel$refreshJunieProblems$2$1$1	I
/*     */     //   87	62	6	$i$f$update	I
/*     */     //   78	72	4	$i$a$-let-JuniorToolWindowViewModel$refreshJunieProblems$2$1	I
/*     */     //   0	169	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel$refreshJunieProblems$2;
/*     */     //   36	123	1	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super JuniorToolWindowViewModel$refreshJunieProblems$2> $completion) {
/*     */     return (Continuation<Unit>)new JuniorToolWindowViewModel$refreshJunieProblems$2($completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((JuniorToolWindowViewModel$refreshJunieProblems$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\toolwindow\JuniorToolWindowViewModel$refreshJunieProblems$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */