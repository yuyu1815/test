package com.intellij.ml.llm.matterhorn.ej.ui.login.states;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "MissingAIPLicense.kt", l = {71}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.states.MissingAIPLicense$refreshLicenseList$2")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
@SourceDebugExtension({"SMAP\nMissingAIPLicense.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MissingAIPLicense.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$refreshLicenseList$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,225:1\n226#2,5:226\n226#2,5:231\n226#2,5:236\n*S KotlinDebug\n*F\n+ 1 MissingAIPLicense.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$refreshLicenseList$2\n*L\n73#1:226,5\n75#1:231,5\n78#1:236,5\n*E\n"})
final class MissingAIPLicense$refreshLicenseList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  MissingAIPLicense$refreshLicenseList$2(Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #8
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 286, 0 -> 32, 1 -> 79
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: nop
    //   37: aload_0
    //   38: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
    //   41: invokestatic access$getRefreshLicenses$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlin/jvm/functions/Function0;
    //   44: invokeinterface invoke : ()Ljava/lang/Object;
    //   49: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpHandle
    //   52: dup
    //   53: ifnull -> 91
    //   56: aload_0
    //   57: checkcast kotlin/coroutines/Continuation
    //   60: aload_0
    //   61: iconst_1
    //   62: putfield label : I
    //   65: invokeinterface awaitOpResult : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   70: dup
    //   71: aload #8
    //   73: if_acmpne -> 85
    //   76: aload #8
    //   78: areturn
    //   79: nop
    //   80: aload_1
    //   81: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   84: aload_1
    //   85: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult
    //   88: goto -> 93
    //   91: pop
    //   92: aconst_null
    //   93: astore_2
    //   94: aload_2
    //   95: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpSucceeded
    //   98: ifeq -> 155
    //   101: aload_0
    //   102: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
    //   105: invokestatic access$get_refreshState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   108: astore_3
    //   109: iconst_0
    //   110: istore #4
    //   112: nop
    //   113: aload_3
    //   114: invokeinterface getValue : ()Ljava/lang/Object;
    //   119: astore #5
    //   121: aload #5
    //   123: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState
    //   126: pop
    //   127: iconst_0
    //   128: istore #7
    //   130: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Done.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Done;
    //   133: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState
    //   136: astore #6
    //   138: aload_3
    //   139: aload #5
    //   141: aload #6
    //   143: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   148: ifeq -> 112
    //   151: nop
    //   152: goto -> 282
    //   155: aload_0
    //   156: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
    //   159: invokestatic access$get_refreshState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   162: astore_3
    //   163: iconst_0
    //   164: istore #4
    //   166: nop
    //   167: aload_3
    //   168: invokeinterface getValue : ()Ljava/lang/Object;
    //   173: astore #5
    //   175: aload #5
    //   177: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState
    //   180: pop
    //   181: iconst_0
    //   182: istore #7
    //   184: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Error
    //   187: dup
    //   188: ldc 'Refresh failed'
    //   190: invokespecial <init> : (Ljava/lang/String;)V
    //   193: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState
    //   196: astore #6
    //   198: aload_3
    //   199: aload #5
    //   201: aload #6
    //   203: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   208: ifeq -> 166
    //   211: nop
    //   212: goto -> 282
    //   215: astore_2
    //   216: aload_0
    //   217: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
    //   220: invokestatic access$get_refreshState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   223: astore_3
    //   224: iconst_0
    //   225: istore #4
    //   227: nop
    //   228: aload_3
    //   229: invokeinterface getValue : ()Ljava/lang/Object;
    //   234: astore #5
    //   236: aload #5
    //   238: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState
    //   241: pop
    //   242: iconst_0
    //   243: istore #7
    //   245: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Error
    //   248: dup
    //   249: aload_2
    //   250: invokevirtual getMessage : ()Ljava/lang/String;
    //   253: dup
    //   254: ifnonnull -> 260
    //   257: pop
    //   258: ldc 'Unknown error'
    //   260: invokespecial <init> : (Ljava/lang/String;)V
    //   263: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState
    //   266: astore #6
    //   268: aload_3
    //   269: aload #5
    //   271: aload #6
    //   273: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   278: ifeq -> 227
    //   281: nop
    //   282: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   285: areturn
    //   286: new java/lang/IllegalStateException
    //   289: dup
    //   290: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   292: invokespecial <init> : (Ljava/lang/String;)V
    //   295: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #69	-> 3
    //   #70	-> 36
    //   #71	-> 37
    //   #69	-> 76
    //   #71	-> 85
    //   #72	-> 94
    //   #73	-> 101
    //   #226	-> 112
    //   #227	-> 113
    //   #228	-> 121
    //   #73	-> 130
    //   #228	-> 136
    //   #229	-> 138
    //   #230	-> 151
    //   #75	-> 155
    //   #231	-> 166
    //   #232	-> 167
    //   #233	-> 175
    //   #75	-> 184
    //   #233	-> 196
    //   #234	-> 198
    //   #235	-> 211
    //   #77	-> 215
    //   #78	-> 216
    //   #236	-> 227
    //   #237	-> 228
    //   #238	-> 236
    //   #78	-> 245
    //   #238	-> 266
    //   #239	-> 268
    //   #240	-> 281
    //   #80	-> 282
    //   #69	-> 286
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   94	7	2	result	Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
    //   216	66	2	th	Ljava/lang/Throwable;
    //   109	43	3	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
    //   163	49	3	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
    //   224	58	3	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
    //   121	31	5	prevValue$iv	Ljava/lang/Object;
    //   175	37	5	prevValue$iv	Ljava/lang/Object;
    //   236	46	5	prevValue$iv	Ljava/lang/Object;
    //   138	14	6	nextValue$iv	Ljava/lang/Object;
    //   198	14	6	nextValue$iv	Ljava/lang/Object;
    //   268	14	6	nextValue$iv	Ljava/lang/Object;
    //   130	6	7	$i$a$-update-MissingAIPLicense$refreshLicenseList$2$1	I
    //   112	40	4	$i$f$update	I
    //   184	12	7	$i$a$-update-MissingAIPLicense$refreshLicenseList$2$2	I
    //   166	46	4	$i$f$update	I
    //   245	21	7	$i$a$-update-MissingAIPLicense$refreshLicenseList$2$3	I
    //   227	55	4	$i$f$update	I
    //   0	296	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$refreshLicenseList$2;
    //   36	250	1	$result	Ljava/lang/Object;
    // Exception table:
    //   from	to	target	type
    //   36	70	215	java/lang/Throwable
    //   79	212	215	java/lang/Throwable
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super MissingAIPLicense$refreshLicenseList$2> $completion) {
    return (Continuation<Unit>)new MissingAIPLicense$refreshLicenseList$2($completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((MissingAIPLicense$refreshLicenseList$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\states\MissingAIPLicense$refreshLicenseList$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */