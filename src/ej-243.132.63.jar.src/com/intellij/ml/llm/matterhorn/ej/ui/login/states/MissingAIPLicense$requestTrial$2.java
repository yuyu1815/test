package com.intellij.ml.llm.matterhorn.ej.ui.login.states;

import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseDeniedReason;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "MissingAIPLicense.kt", l = {93}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.states.MissingAIPLicense$requestTrial$2")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
@SourceDebugExtension({"SMAP\nMissingAIPLicense.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MissingAIPLicense.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$requestTrial$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,225:1\n226#2,5:226\n226#2,5:231\n226#2,5:236\n226#2,5:241\n226#2,5:246\n226#2,5:251\n226#2,5:256\n226#2,5:261\n226#2,5:266\n226#2,5:271\n226#2,5:276\n*S KotlinDebug\n*F\n+ 1 MissingAIPLicense.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$requestTrial$2\n*L\n101#1:226,5\n108#1:231,5\n117#1:236,5\n124#1:241,5\n131#1:246,5\n138#1:251,5\n145#1:256,5\n152#1:261,5\n162#1:266,5\n176#1:271,5\n184#1:276,5\n*E\n"})
final class MissingAIPLicense$requestTrial$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  MissingAIPLicense$requestTrial$2(Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #13
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 1163, 0 -> 32, 1 -> 75
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: nop
    //   37: aload_0
    //   38: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
    //   41: invokestatic access$getOnRequestTrial$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlin/jvm/functions/Function0;
    //   44: invokeinterface invoke : ()Ljava/lang/Object;
    //   49: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpHandle
    //   52: aload_0
    //   53: checkcast kotlin/coroutines/Continuation
    //   56: aload_0
    //   57: iconst_1
    //   58: putfield label : I
    //   61: invokeinterface awaitOpResult : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   66: dup
    //   67: aload #13
    //   69: if_acmpne -> 81
    //   72: aload #13
    //   74: areturn
    //   75: nop
    //   76: aload_1
    //   77: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   80: aload_1
    //   81: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult
    //   84: astore_2
    //   85: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   88: aload_2
    //   89: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;)Ljava/lang/String;
    //   94: invokevirtual info : (Ljava/lang/String;)V
    //   97: aload_2
    //   98: astore_3
    //   99: aload_3
    //   100: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpFailed
    //   103: ifeq -> 842
    //   106: aload_2
    //   107: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpFailed
    //   110: invokevirtual getFailure : ()Ljava/lang/Object;
    //   113: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure
    //   116: astore #4
    //   118: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   121: aload #4
    //   123: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;)Ljava/lang/String;
    //   128: invokevirtual info : (Ljava/lang/String;)V
    //   131: aload #4
    //   133: astore #5
    //   135: aload #5
    //   137: getstatic com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$AuthRequired.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$AuthRequired;
    //   140: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   143: ifeq -> 234
    //   146: aload_0
    //   147: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
    //   150: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   153: astore #6
    //   155: aload_0
    //   156: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
    //   159: astore #7
    //   161: iconst_0
    //   162: istore #8
    //   164: nop
    //   165: aload #6
    //   167: invokeinterface getValue : ()Ljava/lang/Object;
    //   172: astore #9
    //   174: aload #9
    //   176: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   179: pop
    //   180: iconst_0
    //   181: istore #11
    //   183: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   186: ldc 'Auth required, check JBA'
    //   188: invokevirtual info : (Ljava/lang/String;)V
    //   191: aload #7
    //   193: invokestatic access$getCheckJba$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlin/jvm/functions/Function0;
    //   196: invokeinterface invoke : ()Ljava/lang/Object;
    //   201: pop
    //   202: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$RequestFailedAndCanTryAgain
    //   205: dup
    //   206: ldc 'Authentication failed'
    //   208: invokespecial <init> : (Ljava/lang/String;)V
    //   211: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   214: astore #10
    //   216: aload #6
    //   218: aload #9
    //   220: aload #10
    //   222: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   227: ifeq -> 164
    //   230: nop
    //   231: goto -> 1159
    //   234: aload #5
    //   236: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$ErrorResponse
    //   239: ifeq -> 330
    //   242: aload_0
    //   243: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
    //   246: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   249: astore #6
    //   251: iconst_0
    //   252: istore #7
    //   254: nop
    //   255: aload #6
    //   257: invokeinterface getValue : ()Ljava/lang/Object;
    //   262: astore #8
    //   264: aload #8
    //   266: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   269: pop
    //   270: iconst_0
    //   271: istore #10
    //   273: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   276: aload #4
    //   278: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$ErrorResponse
    //   281: invokevirtual getErrorMessage : ()Ljava/lang/String;
    //   284: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   289: invokevirtual info : (Ljava/lang/String;)V
    //   292: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$RequestFailedAndCanTryAgain
    //   295: dup
    //   296: aload #4
    //   298: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$ErrorResponse
    //   301: invokevirtual getErrorMessage : ()Ljava/lang/String;
    //   304: invokespecial <init> : (Ljava/lang/String;)V
    //   307: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   310: astore #9
    //   312: aload #6
    //   314: aload #8
    //   316: aload #9
    //   318: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   323: ifeq -> 254
    //   326: nop
    //   327: goto -> 1159
    //   330: aload #5
    //   332: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$LicenseDenied
    //   335: ifeq -> 834
    //   338: aload #4
    //   340: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$LicenseDenied
    //   343: invokevirtual getReason : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseDeniedReason;
    //   346: dup
    //   347: ifnonnull -> 355
    //   350: pop
    //   351: iconst_m1
    //   352: goto -> 363
    //   355: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$requestTrial$2$WhenMappings.$EnumSwitchMapping$0 : [I
    //   358: swap
    //   359: invokevirtual ordinal : ()I
    //   362: iaload
    //   363: tableswitch default -> 746, 1 -> 396, 2 -> 486, 3 -> 551, 4 -> 616, 5 -> 681
    //   396: aload_0
    //   397: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
    //   400: invokestatic access$getCheckPersonalTos$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlin/jvm/functions/Function0;
    //   403: invokeinterface invoke : ()Ljava/lang/Object;
    //   408: pop
    //   409: aload_0
    //   410: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
    //   413: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   416: astore #8
    //   418: iconst_0
    //   419: istore #9
    //   421: nop
    //   422: aload #8
    //   424: invokeinterface getValue : ()Ljava/lang/Object;
    //   429: astore #10
    //   431: aload #10
    //   433: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   436: pop
    //   437: iconst_0
    //   438: istore #12
    //   440: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   443: ldc 'Request trial state: TrialDenied'
    //   445: invokevirtual info : (Ljava/lang/String;)V
    //   448: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialDenied
    //   451: dup
    //   452: aload #4
    //   454: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$LicenseDenied
    //   457: invokevirtual getMessage : ()Ljava/lang/String;
    //   460: invokespecial <init> : (Ljava/lang/String;)V
    //   463: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   466: astore #11
    //   468: aload #8
    //   470: aload #10
    //   472: aload #11
    //   474: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   479: ifeq -> 421
    //   482: nop
    //   483: goto -> 1159
    //   486: aload_0
    //   487: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
    //   490: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   493: astore #8
    //   495: iconst_0
    //   496: istore #9
    //   498: nop
    //   499: aload #8
    //   501: invokeinterface getValue : ()Ljava/lang/Object;
    //   506: astore #10
    //   508: aload #10
    //   510: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   513: pop
    //   514: iconst_0
    //   515: istore #12
    //   517: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   520: ldc 'Request trial state: TrialMaxCountExceeded'
    //   522: invokevirtual info : (Ljava/lang/String;)V
    //   525: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialMaxCountExceeded.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialMaxCountExceeded;
    //   528: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   531: astore #11
    //   533: aload #8
    //   535: aload #10
    //   537: aload #11
    //   539: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   544: ifeq -> 498
    //   547: nop
    //   548: goto -> 1159
    //   551: aload_0
    //   552: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
    //   555: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   558: astore #8
    //   560: iconst_0
    //   561: istore #9
    //   563: nop
    //   564: aload #8
    //   566: invokeinterface getValue : ()Ljava/lang/Object;
    //   571: astore #10
    //   573: aload #10
    //   575: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   578: pop
    //   579: iconst_0
    //   580: istore #12
    //   582: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   585: ldc 'Request trial state: TrialNoLinkedPaymentMethod'
    //   587: invokevirtual info : (Ljava/lang/String;)V
    //   590: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialNoLinkedPaymentMethod.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialNoLinkedPaymentMethod;
    //   593: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   596: astore #11
    //   598: aload #8
    //   600: aload #10
    //   602: aload #11
    //   604: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   609: ifeq -> 563
    //   612: nop
    //   613: goto -> 1159
    //   616: aload_0
    //   617: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
    //   620: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   623: astore #8
    //   625: iconst_0
    //   626: istore #9
    //   628: nop
    //   629: aload #8
    //   631: invokeinterface getValue : ()Ljava/lang/Object;
    //   636: astore #10
    //   638: aload #10
    //   640: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   643: pop
    //   644: iconst_0
    //   645: istore #12
    //   647: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   650: ldc 'Request trial state: CountryUnknown'
    //   652: invokevirtual info : (Ljava/lang/String;)V
    //   655: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$CountryUnknown.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$CountryUnknown;
    //   658: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   661: astore #11
    //   663: aload #8
    //   665: aload #10
    //   667: aload #11
    //   669: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   674: ifeq -> 628
    //   677: nop
    //   678: goto -> 1159
    //   681: aload_0
    //   682: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
    //   685: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   688: astore #8
    //   690: iconst_0
    //   691: istore #9
    //   693: nop
    //   694: aload #8
    //   696: invokeinterface getValue : ()Ljava/lang/Object;
    //   701: astore #10
    //   703: aload #10
    //   705: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   708: pop
    //   709: iconst_0
    //   710: istore #12
    //   712: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   715: ldc 'Request trial state: CountryRestricted'
    //   717: invokevirtual info : (Ljava/lang/String;)V
    //   720: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$CountryRestricted.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$CountryRestricted;
    //   723: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   726: astore #11
    //   728: aload #8
    //   730: aload #10
    //   732: aload #11
    //   734: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   739: ifeq -> 693
    //   742: nop
    //   743: goto -> 1159
    //   746: aload_0
    //   747: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
    //   750: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   753: astore #8
    //   755: iconst_0
    //   756: istore #9
    //   758: nop
    //   759: aload #8
    //   761: invokeinterface getValue : ()Ljava/lang/Object;
    //   766: astore #10
    //   768: aload #10
    //   770: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   773: pop
    //   774: iconst_0
    //   775: istore #12
    //   777: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   780: aload #4
    //   782: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$LicenseDenied
    //   785: invokevirtual getMessage : ()Ljava/lang/String;
    //   788: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   793: invokevirtual info : (Ljava/lang/String;)V
    //   796: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialDenied
    //   799: dup
    //   800: aload #4
    //   802: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$LicenseDenied
    //   805: invokevirtual getMessage : ()Ljava/lang/String;
    //   808: invokespecial <init> : (Ljava/lang/String;)V
    //   811: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   814: astore #11
    //   816: aload #8
    //   818: aload #10
    //   820: aload #11
    //   822: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   827: ifeq -> 758
    //   830: nop
    //   831: goto -> 1159
    //   834: new kotlin/NoWhenBranchMatchedException
    //   837: dup
    //   838: invokespecial <init> : ()V
    //   841: athrow
    //   842: aload_3
    //   843: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpSucceeded
    //   846: ifeq -> 914
    //   849: aload_0
    //   850: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
    //   853: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   856: astore #4
    //   858: iconst_0
    //   859: istore #5
    //   861: nop
    //   862: aload #4
    //   864: invokeinterface getValue : ()Ljava/lang/Object;
    //   869: astore #6
    //   871: aload #6
    //   873: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   876: pop
    //   877: iconst_0
    //   878: istore #8
    //   880: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   883: ldc 'Request trial state, succeeded, progress'
    //   885: invokevirtual info : (Ljava/lang/String;)V
    //   888: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$Progress.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$Progress;
    //   891: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   894: astore #7
    //   896: aload #4
    //   898: aload #6
    //   900: aload #7
    //   902: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   907: ifeq -> 861
    //   910: nop
    //   911: goto -> 1159
    //   914: aload_3
    //   915: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated
    //   918: ifeq -> 1065
    //   921: aload_2
    //   922: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated
    //   925: astore #5
    //   927: aload #5
    //   929: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpCancellation
    //   932: ifeq -> 940
    //   935: ldc 'Request cancelled'
    //   937: goto -> 987
    //   940: aload #5
    //   942: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpNetworkFailure
    //   945: ifeq -> 953
    //   948: ldc 'Request failed'
    //   950: goto -> 987
    //   953: aload #5
    //   955: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpTimeout
    //   958: ifeq -> 966
    //   961: ldc 'Request timed out'
    //   963: goto -> 987
    //   966: aload #5
    //   968: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpUnhandledException
    //   971: ifeq -> 979
    //   974: ldc 'Request failed'
    //   976: goto -> 987
    //   979: new kotlin/NoWhenBranchMatchedException
    //   982: dup
    //   983: invokespecial <init> : ()V
    //   986: athrow
    //   987: astore #4
    //   989: aload_0
    //   990: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
    //   993: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   996: astore #5
    //   998: iconst_0
    //   999: istore #6
    //   1001: nop
    //   1002: aload #5
    //   1004: invokeinterface getValue : ()Ljava/lang/Object;
    //   1009: astore #7
    //   1011: aload #7
    //   1013: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   1016: pop
    //   1017: iconst_0
    //   1018: istore #9
    //   1020: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   1023: aload #4
    //   1025: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   1030: invokevirtual info : (Ljava/lang/String;)V
    //   1033: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$RequestFailedAndCanTryAgain
    //   1036: dup
    //   1037: aload #4
    //   1039: invokespecial <init> : (Ljava/lang/String;)V
    //   1042: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   1045: astore #8
    //   1047: aload #5
    //   1049: aload #7
    //   1051: aload #8
    //   1053: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1058: ifeq -> 1001
    //   1061: nop
    //   1062: goto -> 1159
    //   1065: new kotlin/NoWhenBranchMatchedException
    //   1068: dup
    //   1069: invokespecial <init> : ()V
    //   1072: athrow
    //   1073: astore_3
    //   1074: aload_0
    //   1075: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
    //   1078: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   1081: astore #4
    //   1083: iconst_0
    //   1084: istore #5
    //   1086: nop
    //   1087: aload #4
    //   1089: invokeinterface getValue : ()Ljava/lang/Object;
    //   1094: astore #6
    //   1096: aload #6
    //   1098: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   1101: pop
    //   1102: iconst_0
    //   1103: istore #8
    //   1105: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   1108: aload_3
    //   1109: invokevirtual getMessage : ()Ljava/lang/String;
    //   1112: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   1117: invokevirtual warn : (Ljava/lang/String;)V
    //   1120: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$Error
    //   1123: dup
    //   1124: aload_3
    //   1125: invokevirtual getMessage : ()Ljava/lang/String;
    //   1128: dup
    //   1129: ifnonnull -> 1136
    //   1132: pop
    //   1133: ldc_w 'Unknown error'
    //   1136: invokespecial <init> : (Ljava/lang/String;)V
    //   1139: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
    //   1142: astore #7
    //   1144: aload #4
    //   1146: aload #6
    //   1148: aload #7
    //   1150: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1155: ifeq -> 1086
    //   1158: nop
    //   1159: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   1162: areturn
    //   1163: new java/lang/IllegalStateException
    //   1166: dup
    //   1167: ldc_w 'call to 'resume' before 'invoke' with coroutine'
    //   1170: invokespecial <init> : (Ljava/lang/String;)V
    //   1173: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #91	-> 3
    //   #92	-> 36
    //   #93	-> 37
    //   #91	-> 72
    //   #94	-> 85
    //   #95	-> 97
    //   #96	-> 99
    //   #97	-> 106
    //   #98	-> 118
    //   #99	-> 131
    //   #100	-> 135
    //   #101	-> 146
    //   #226	-> 164
    //   #227	-> 165
    //   #228	-> 174
    //   #102	-> 183
    //   #103	-> 191
    //   #104	-> 202
    //   #228	-> 214
    //   #229	-> 216
    //   #230	-> 230
    //   #107	-> 234
    //   #108	-> 242
    //   #231	-> 254
    //   #232	-> 255
    //   #233	-> 264
    //   #109	-> 273
    //   #110	-> 292
    //   #233	-> 310
    //   #234	-> 312
    //   #235	-> 326
    //   #113	-> 330
    //   #114	-> 338
    //   #116	-> 396
    //   #117	-> 409
    //   #236	-> 421
    //   #237	-> 422
    //   #238	-> 431
    //   #118	-> 440
    //   #119	-> 448
    //   #238	-> 466
    //   #239	-> 468
    //   #240	-> 482
    //   #124	-> 486
    //   #241	-> 498
    //   #242	-> 499
    //   #243	-> 508
    //   #125	-> 517
    //   #126	-> 525
    //   #243	-> 531
    //   #244	-> 533
    //   #245	-> 547
    //   #131	-> 551
    //   #246	-> 563
    //   #247	-> 564
    //   #248	-> 573
    //   #132	-> 582
    //   #133	-> 590
    //   #248	-> 596
    //   #249	-> 598
    //   #250	-> 612
    //   #138	-> 616
    //   #251	-> 628
    //   #252	-> 629
    //   #253	-> 638
    //   #139	-> 647
    //   #140	-> 655
    //   #253	-> 661
    //   #254	-> 663
    //   #255	-> 677
    //   #145	-> 681
    //   #256	-> 693
    //   #257	-> 694
    //   #258	-> 703
    //   #146	-> 712
    //   #147	-> 720
    //   #258	-> 726
    //   #259	-> 728
    //   #260	-> 742
    //   #152	-> 746
    //   #261	-> 758
    //   #262	-> 759
    //   #263	-> 768
    //   #153	-> 777
    //   #154	-> 796
    //   #263	-> 814
    //   #264	-> 816
    //   #265	-> 830
    //   #99	-> 834
    //   #161	-> 842
    //   #162	-> 849
    //   #266	-> 861
    //   #267	-> 862
    //   #268	-> 871
    //   #163	-> 880
    //   #164	-> 888
    //   #268	-> 894
    //   #269	-> 896
    //   #270	-> 910
    //   #166	-> 911
    //   #169	-> 914
    //   #170	-> 921
    //   #171	-> 927
    //   #172	-> 940
    //   #173	-> 953
    //   #174	-> 966
    //   #170	-> 979
    //   #176	-> 989
    //   #271	-> 1001
    //   #272	-> 1002
    //   #273	-> 1011
    //   #177	-> 1020
    //   #178	-> 1033
    //   #273	-> 1045
    //   #274	-> 1047
    //   #275	-> 1061
    //   #95	-> 1065
    //   #183	-> 1073
    //   #184	-> 1074
    //   #276	-> 1086
    //   #277	-> 1087
    //   #278	-> 1096
    //   #185	-> 1105
    //   #186	-> 1120
    //   #278	-> 1142
    //   #279	-> 1144
    //   #280	-> 1158
    //   #189	-> 1159
    //   #91	-> 1163
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   85	33	2	result	Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
    //   842	7	2	result	Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
    //   914	13	2	result	Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
    //   1074	85	3	th	Ljava/lang/Throwable;
    //   118	28	4	failure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;
    //   234	76	4	failure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;
    //   310	16	4	failure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;
    //   330	136	4	failure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;
    //   466	16	4	failure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;
    //   746	68	4	failure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;
    //   814	16	4	failure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;
    //   858	53	4	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
    //   989	73	4	status	Ljava/lang/String;
    //   1083	76	4	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
    //   998	64	5	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
    //   161	70	6	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
    //   251	76	6	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
    //   871	40	6	prevValue$iv	Ljava/lang/Object;
    //   1096	63	6	prevValue$iv	Ljava/lang/Object;
    //   896	15	7	nextValue$iv	Ljava/lang/Object;
    //   1011	51	7	prevValue$iv	Ljava/lang/Object;
    //   1144	15	7	nextValue$iv	Ljava/lang/Object;
    //   264	63	8	prevValue$iv	Ljava/lang/Object;
    //   418	65	8	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
    //   495	53	8	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
    //   560	53	8	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
    //   625	53	8	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
    //   690	53	8	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
    //   755	76	8	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
    //   1047	15	8	nextValue$iv	Ljava/lang/Object;
    //   174	57	9	prevValue$iv	Ljava/lang/Object;
    //   312	15	9	nextValue$iv	Ljava/lang/Object;
    //   216	15	10	nextValue$iv	Ljava/lang/Object;
    //   431	52	10	prevValue$iv	Ljava/lang/Object;
    //   508	40	10	prevValue$iv	Ljava/lang/Object;
    //   573	40	10	prevValue$iv	Ljava/lang/Object;
    //   638	40	10	prevValue$iv	Ljava/lang/Object;
    //   703	40	10	prevValue$iv	Ljava/lang/Object;
    //   768	63	10	prevValue$iv	Ljava/lang/Object;
    //   468	15	11	nextValue$iv	Ljava/lang/Object;
    //   533	15	11	nextValue$iv	Ljava/lang/Object;
    //   598	15	11	nextValue$iv	Ljava/lang/Object;
    //   663	15	11	nextValue$iv	Ljava/lang/Object;
    //   728	15	11	nextValue$iv	Ljava/lang/Object;
    //   816	15	11	nextValue$iv	Ljava/lang/Object;
    //   183	31	11	$i$a$-update-MissingAIPLicense$requestTrial$2$1	I
    //   164	67	8	$i$f$update	I
    //   273	37	10	$i$a$-update-MissingAIPLicense$requestTrial$2$2	I
    //   254	73	7	$i$f$update	I
    //   440	26	12	$i$a$-update-MissingAIPLicense$requestTrial$2$3	I
    //   421	62	9	$i$f$update	I
    //   517	14	12	$i$a$-update-MissingAIPLicense$requestTrial$2$4	I
    //   498	50	9	$i$f$update	I
    //   582	14	12	$i$a$-update-MissingAIPLicense$requestTrial$2$5	I
    //   563	50	9	$i$f$update	I
    //   647	14	12	$i$a$-update-MissingAIPLicense$requestTrial$2$6	I
    //   628	50	9	$i$f$update	I
    //   712	14	12	$i$a$-update-MissingAIPLicense$requestTrial$2$7	I
    //   693	50	9	$i$f$update	I
    //   777	37	12	$i$a$-update-MissingAIPLicense$requestTrial$2$8	I
    //   758	73	9	$i$f$update	I
    //   880	14	8	$i$a$-update-MissingAIPLicense$requestTrial$2$9	I
    //   861	50	5	$i$f$update	I
    //   1020	25	9	$i$a$-update-MissingAIPLicense$requestTrial$2$10	I
    //   1001	61	6	$i$f$update	I
    //   1105	37	8	$i$a$-update-MissingAIPLicense$requestTrial$2$11	I
    //   1086	73	5	$i$f$update	I
    //   0	1174	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$requestTrial$2;
    //   36	1127	1	$result	Ljava/lang/Object;
    // Exception table:
    //   from	to	target	type
    //   36	66	1073	java/lang/Throwable
    //   75	1073	1073	java/lang/Throwable
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super MissingAIPLicense$requestTrial$2> $completion) {
    return (Continuation<Unit>)new MissingAIPLicense$requestTrial$2($completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((MissingAIPLicense$requestTrial$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\states\MissingAIPLicense$requestTrial$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */