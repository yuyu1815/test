package com.intellij.ml.llm.matterhorn.ej.ui.login.states;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "LicenseAgreement.kt", l = {38, 38}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.states.LicenseAgreement$loadUrlToAcceptInBrowser$2")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
@SourceDebugExtension({"SMAP\nLicenseAgreement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LicenseAgreement.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$loadUrlToAcceptInBrowser$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,71:1\n226#2,5:72\n226#2,5:77\n*S KotlinDebug\n*F\n+ 1 LicenseAgreement.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$loadUrlToAcceptInBrowser$2\n*L\n39#1:72,5\n43#1:77,5\n*E\n"})
final class LicenseAgreement$loadUrlToAcceptInBrowser$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  LicenseAgreement$loadUrlToAcceptInBrowser$2(Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #8
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 237, 0 -> 36, 1 -> 65, 2 -> 97
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: nop
    //   41: getstatic com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepository.Companion : Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepository$Companion;
    //   44: aload_0
    //   45: checkcast kotlin/coroutines/Continuation
    //   48: aload_0
    //   49: iconst_1
    //   50: putfield label : I
    //   53: invokevirtual instance : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   56: dup
    //   57: aload #8
    //   59: if_acmpne -> 71
    //   62: aload #8
    //   64: areturn
    //   65: nop
    //   66: aload_1
    //   67: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   70: aload_1
    //   71: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepository
    //   74: aload_0
    //   75: checkcast kotlin/coroutines/Continuation
    //   78: aload_0
    //   79: iconst_2
    //   80: putfield label : I
    //   83: invokeinterface getManageAccountUrl : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   88: dup
    //   89: aload #8
    //   91: if_acmpne -> 103
    //   94: aload #8
    //   96: areturn
    //   97: nop
    //   98: aload_1
    //   99: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   102: aload_1
    //   103: checkcast java/lang/String
    //   106: astore_2
    //   107: aload_0
    //   108: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement;
    //   111: invokestatic access$get_urlLoadState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   114: astore_3
    //   115: iconst_0
    //   116: istore #4
    //   118: nop
    //   119: aload_3
    //   120: invokeinterface getValue : ()Ljava/lang/Object;
    //   125: astore #5
    //   127: aload #5
    //   129: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase
    //   132: pop
    //   133: iconst_0
    //   134: istore #7
    //   136: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Completed
    //   139: dup
    //   140: aload_2
    //   141: invokespecial <init> : (Ljava/lang/String;)V
    //   144: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase
    //   147: astore #6
    //   149: aload_3
    //   150: aload #5
    //   152: aload #6
    //   154: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   159: ifeq -> 118
    //   162: nop
    //   163: goto -> 233
    //   166: astore_2
    //   167: aload_0
    //   168: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement;
    //   171: invokestatic access$get_urlLoadState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   174: astore_3
    //   175: iconst_0
    //   176: istore #4
    //   178: nop
    //   179: aload_3
    //   180: invokeinterface getValue : ()Ljava/lang/Object;
    //   185: astore #5
    //   187: aload #5
    //   189: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase
    //   192: pop
    //   193: iconst_0
    //   194: istore #7
    //   196: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Error
    //   199: dup
    //   200: aload_2
    //   201: invokevirtual getMessage : ()Ljava/lang/String;
    //   204: dup
    //   205: ifnonnull -> 211
    //   208: pop
    //   209: ldc 'Unknown error'
    //   211: invokespecial <init> : (Ljava/lang/String;)V
    //   214: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase
    //   217: astore #6
    //   219: aload_3
    //   220: aload #5
    //   222: aload #6
    //   224: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   229: ifeq -> 178
    //   232: nop
    //   233: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   236: areturn
    //   237: new java/lang/IllegalStateException
    //   240: dup
    //   241: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   243: invokespecial <init> : (Ljava/lang/String;)V
    //   246: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #36	-> 3
    //   #37	-> 40
    //   #38	-> 41
    //   #36	-> 62
    //   #38	-> 71
    //   #36	-> 94
    //   #39	-> 107
    //   #72	-> 118
    //   #73	-> 119
    //   #74	-> 127
    //   #40	-> 136
    //   #74	-> 147
    //   #75	-> 149
    //   #76	-> 162
    //   #42	-> 166
    //   #43	-> 167
    //   #77	-> 178
    //   #78	-> 179
    //   #79	-> 187
    //   #43	-> 196
    //   #79	-> 217
    //   #80	-> 219
    //   #81	-> 232
    //   #45	-> 233
    //   #36	-> 237
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   107	56	2	accountUrl	Ljava/lang/String;
    //   167	66	2	th	Ljava/lang/Throwable;
    //   115	48	3	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
    //   175	58	3	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
    //   127	36	5	prevValue$iv	Ljava/lang/Object;
    //   187	46	5	prevValue$iv	Ljava/lang/Object;
    //   149	14	6	nextValue$iv	Ljava/lang/Object;
    //   219	14	6	nextValue$iv	Ljava/lang/Object;
    //   136	11	7	$i$a$-update-LicenseAgreement$loadUrlToAcceptInBrowser$2$1	I
    //   118	45	4	$i$f$update	I
    //   196	21	7	$i$a$-update-LicenseAgreement$loadUrlToAcceptInBrowser$2$2	I
    //   178	55	4	$i$f$update	I
    //   0	247	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$loadUrlToAcceptInBrowser$2;
    //   40	197	1	$result	Ljava/lang/Object;
    // Exception table:
    //   from	to	target	type
    //   40	56	166	java/lang/Throwable
    //   65	88	166	java/lang/Throwable
    //   97	163	166	java/lang/Throwable
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super LicenseAgreement$loadUrlToAcceptInBrowser$2> $completion) {
    return (Continuation<Unit>)new LicenseAgreement$loadUrlToAcceptInBrowser$2($completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((LicenseAgreement$loadUrlToAcceptInBrowser$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\states\LicenseAgreement$loadUrlToAcceptInBrowser$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */