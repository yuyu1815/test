package com.intellij.ml.llm.matterhorn.ej.ui.login;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\007\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\002H\002H@¢\006\004\b\005\020\006¨\006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 GrazieActivationVm.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm\n*L\n1#1,218:1\n50#2:219\n51#3,170:220\n*E\n"})
public final class null<T> implements FlowCollector {
  public null(GrazieActivationVm paramGrazieActivationVm) {}
  
  @Nullable
  public final Object emit(Object value, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2$1
    //   4: ifeq -> 36
    //   7: aload_2
    //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2$1
    //   11: astore_3
    //   12: aload_3
    //   13: getfield label : I
    //   16: ldc -2147483648
    //   18: iand
    //   19: ifeq -> 36
    //   22: aload_3
    //   23: dup
    //   24: getfield label : I
    //   27: ldc -2147483648
    //   29: isub
    //   30: putfield label : I
    //   33: goto -> 46
    //   36: new com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2$1
    //   39: dup
    //   40: aload_0
    //   41: aload_2
    //   42: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V
    //   45: astore_3
    //   46: aload_3
    //   47: getfield result : Ljava/lang/Object;
    //   50: astore #4
    //   52: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   55: astore #5
    //   57: aload_3
    //   58: getfield label : I
    //   61: tableswitch default -> 1354, 0 -> 84, 1 -> 1339
    //   84: aload #4
    //   86: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   89: aload_0
    //   90: getfield $this_unsafeFlow : Lkotlinx/coroutines/flow/FlowCollector;
    //   93: aload_1
    //   94: astore #6
    //   96: astore #7
    //   98: iconst_0
    //   99: istore #8
    //   101: aload #7
    //   103: astore #9
    //   105: aload #6
    //   107: aload_3
    //   108: checkcast kotlin/coroutines/Continuation
    //   111: pop
    //   112: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$2$1
    //   115: astore #10
    //   117: iconst_0
    //   118: istore #11
    //   120: aload #10
    //   122: invokevirtual getActivation : ()Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   125: astore #12
    //   127: aload #10
    //   129: invokevirtual getOptimisticState : ()Z
    //   132: istore #13
    //   134: aload #10
    //   136: invokevirtual getMock : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;
    //   139: astore #14
    //   141: aload #14
    //   143: ifnull -> 151
    //   146: aload #14
    //   148: goto -> 1316
    //   151: aload_0
    //   152: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;
    //   155: invokestatic access$get_currentStateScope$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;)Lkotlinx/coroutines/CoroutineScope;
    //   158: dup
    //   159: ifnull -> 171
    //   162: aconst_null
    //   163: iconst_1
    //   164: aconst_null
    //   165: invokestatic cancel$default : (Lkotlinx/coroutines/CoroutineScope;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    //   168: goto -> 172
    //   171: pop
    //   172: aload_0
    //   173: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;
    //   176: invokevirtual getScope : ()Lkotlinx/coroutines/CoroutineScope;
    //   179: ldc 'GrazieActivationStateScope'
    //   181: aconst_null
    //   182: iconst_0
    //   183: bipush #6
    //   185: aconst_null
    //   186: invokestatic childScope$default : (Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;ZILjava/lang/Object;)Lkotlinx/coroutines/CoroutineScope;
    //   189: astore #15
    //   191: aload_0
    //   192: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;
    //   195: aload #15
    //   197: invokestatic access$set_currentStateScope$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;Lkotlinx/coroutines/CoroutineScope;)V
    //   200: aload #12
    //   202: invokeinterface getOutcome-07x5Wys : ()Ljava/lang/Object;
    //   207: invokestatic incompleteOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
    //   210: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationPending
    //   213: astore #16
    //   215: aload #16
    //   217: ifnull -> 1259
    //   220: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   223: aload #16
    //   225: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationPending;)Ljava/lang/String;
    //   230: invokevirtual info : (Ljava/lang/String;)V
    //   233: aload #16
    //   235: astore #17
    //   237: aload #17
    //   239: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationProgressing
    //   242: ifeq -> 268
    //   245: iload #13
    //   247: ifeq -> 259
    //   250: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState$Ready.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState$Ready;
    //   253: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState
    //   256: goto -> 1315
    //   259: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState$Progressing.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState$Progressing;
    //   262: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState
    //   265: goto -> 1315
    //   268: aload #17
    //   270: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationStalled
    //   273: ifeq -> 542
    //   276: aload #16
    //   278: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationStalled
    //   281: astore #18
    //   283: aload #18
    //   285: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadPending$AipLicenseAgreementLoadFailure.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadPending$AipLicenseAgreementLoadFailure;
    //   288: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   291: ifeq -> 322
    //   294: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail
    //   297: dup
    //   298: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$FailedToLoadAgreement.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$FailedToLoadAgreement;
    //   301: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason
    //   304: new com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$3$1
    //   307: dup
    //   308: aload #12
    //   310: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;)V
    //   313: checkcast kotlin/jvm/functions/Function0
    //   316: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason;Lkotlin/jvm/functions/Function0;)V
    //   319: goto -> 536
    //   322: aload #18
    //   324: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchPending$AipLicenseFetchFailure.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchPending$AipLicenseFetchFailure;
    //   327: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   330: ifeq -> 361
    //   333: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail
    //   336: dup
    //   337: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$FailedToFetchLicense.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$FailedToFetchLicense;
    //   340: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason
    //   343: new com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$3$2
    //   346: dup
    //   347: aload #12
    //   349: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;)V
    //   352: checkcast kotlin/jvm/functions/Function0
    //   355: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason;Lkotlin/jvm/functions/Function0;)V
    //   358: goto -> 536
    //   361: aload #18
    //   363: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/GrazieCloudUrlPending$GrazieUrlResolveFailure.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieCloudUrlPending$GrazieUrlResolveFailure;
    //   366: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   369: ifeq -> 400
    //   372: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail
    //   375: dup
    //   376: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$FailedToResolveCloudURL.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$FailedToResolveCloudURL;
    //   379: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason
    //   382: new com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$3$3
    //   385: dup
    //   386: aload #12
    //   388: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;)V
    //   391: checkcast kotlin/jvm/functions/Function0
    //   394: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason;Lkotlin/jvm/functions/Function0;)V
    //   397: goto -> 536
    //   400: aload #18
    //   402: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/GrazieJbaAuthPending$GrazieJbaAuthFailure.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieJbaAuthPending$GrazieJbaAuthFailure;
    //   405: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   408: ifeq -> 439
    //   411: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail
    //   414: dup
    //   415: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$AuthFailed.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$AuthFailed;
    //   418: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason
    //   421: new com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$3$4
    //   424: dup
    //   425: aload #12
    //   427: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;)V
    //   430: checkcast kotlin/jvm/functions/Function0
    //   433: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason;Lkotlin/jvm/functions/Function0;)V
    //   436: goto -> 536
    //   439: aload #18
    //   441: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/AieRestricted$AieFailure
    //   444: ifeq -> 489
    //   447: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail
    //   450: dup
    //   451: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$GenericError
    //   454: dup
    //   455: aload #16
    //   457: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AieRestricted$AieFailure
    //   460: invokevirtual getErrorMessage : ()Ljava/lang/String;
    //   463: invokespecial <init> : (Ljava/lang/String;)V
    //   466: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason
    //   469: new com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$3$5
    //   472: dup
    //   473: aload_0
    //   474: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;
    //   477: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;)V
    //   480: checkcast kotlin/jvm/functions/Function0
    //   483: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason;Lkotlin/jvm/functions/Function0;)V
    //   486: goto -> 536
    //   489: aload #18
    //   491: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesPending$AieFetchCapabilitiesFailure.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesPending$AieFetchCapabilitiesFailure;
    //   494: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   497: ifeq -> 528
    //   500: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail
    //   503: dup
    //   504: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$FailedToFetchModelProfiles.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason$FailedToFetchModelProfiles;
    //   507: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason
    //   510: new com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$3$6
    //   513: dup
    //   514: aload #12
    //   516: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;)V
    //   519: checkcast kotlin/jvm/functions/Function0
    //   522: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail$Reason;Lkotlin/jvm/functions/Function0;)V
    //   525: goto -> 536
    //   528: new kotlin/NoWhenBranchMatchedException
    //   531: dup
    //   532: invokespecial <init> : ()V
    //   535: athrow
    //   536: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState
    //   539: goto -> 1315
    //   542: aload #17
    //   544: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked
    //   547: ifeq -> 1251
    //   550: aload #16
    //   552: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked
    //   555: astore #18
    //   557: aload #18
    //   559: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/JunieRegionCheckProhibited.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/JunieRegionCheckProhibited;
    //   562: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   565: ifeq -> 590
    //   568: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/AIPBlocked
    //   571: dup
    //   572: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/AIPBlocked$Reason.RegionalSettings : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIPBlocked$Reason;
    //   575: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$3$7.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$3$7;
    //   578: checkcast kotlin/jvm/functions/Function0
    //   581: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIPBlocked$Reason;Lkotlin/jvm/functions/Function0;)V
    //   584: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState
    //   587: goto -> 1315
    //   590: aload #18
    //   592: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep$AieProhibited.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep$AieProhibited;
    //   595: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   598: ifeq -> 617
    //   601: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/AIEBlocked
    //   604: dup
    //   605: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/AIEBlocked$Reason.DisabledByCompanyPolicy : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIEBlocked$Reason;
    //   608: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIEBlocked$Reason;)V
    //   611: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState
    //   614: goto -> 1315
    //   617: aload #18
    //   619: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/AieRestricted$AieAuthRequired.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieRestricted$AieAuthRequired;
    //   622: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   625: ifeq -> 644
    //   628: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/AIEBlocked
    //   631: dup
    //   632: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/AIEBlocked$Reason.NotAuthenticated : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIEBlocked$Reason;
    //   635: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIEBlocked$Reason;)V
    //   638: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState
    //   641: goto -> 1315
    //   644: aload #18
    //   646: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesPending$AieIncompatibleModels
    //   649: ifeq -> 668
    //   652: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/AIEBlocked
    //   655: dup
    //   656: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/AIEBlocked$Reason.IncompatibleSetOfModels : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIEBlocked$Reason;
    //   659: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIEBlocked$Reason;)V
    //   662: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState
    //   665: goto -> 1315
    //   668: aload #18
    //   670: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptPending$AipLicenseAgreementAcceptRequired$AipLicenseEndUserHasToAcceptCustomerAgreementInBrowser.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptPending$AipLicenseAgreementAcceptRequired$AipLicenseEndUserHasToAcceptCustomerAgreementInBrowser;
    //   673: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   676: ifeq -> 766
    //   679: aload #12
    //   681: ldc_w 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation'
    //   684: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   687: aload #12
    //   689: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiProJbaActivation
    //   692: invokevirtual getLicenseJourney : ()Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseJourney;
    //   695: dup
    //   696: ifnull -> 745
    //   699: invokevirtual getAgreementAcceptStep : ()Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;
    //   702: dup
    //   703: ifnull -> 745
    //   706: astore #19
    //   708: iconst_0
    //   709: istore #20
    //   711: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement
    //   714: dup
    //   715: aload #15
    //   717: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreementKind.AcceptInBrowser : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreementKind;
    //   720: aload #19
    //   722: invokevirtual getAgreement : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;
    //   725: new com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$3$8$1
    //   728: dup
    //   729: aload #19
    //   731: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;)V
    //   734: checkcast kotlin/jvm/functions/Function0
    //   737: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreementKind;Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;Lkotlin/jvm/functions/Function0;)V
    //   740: nop
    //   741: nop
    //   742: goto -> 760
    //   745: pop
    //   746: new java/lang/IllegalStateException
    //   749: dup
    //   750: ldc_w 'License agreement accept step is null'
    //   753: invokevirtual toString : ()Ljava/lang/String;
    //   756: invokespecial <init> : (Ljava/lang/String;)V
    //   759: athrow
    //   760: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState
    //   763: goto -> 1315
    //   766: aload #18
    //   768: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptPending$AipLicenseAgreementAcceptRequired$AipLicenseEndUserHasToAskAdminToAcceptAgreement.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptPending$AipLicenseAgreementAcceptRequired$AipLicenseEndUserHasToAskAdminToAcceptAgreement;
    //   771: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   774: ifeq -> 864
    //   777: aload #12
    //   779: ldc_w 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation'
    //   782: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   785: aload #12
    //   787: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiProJbaActivation
    //   790: invokevirtual getLicenseJourney : ()Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseJourney;
    //   793: dup
    //   794: ifnull -> 843
    //   797: invokevirtual getAgreementAcceptStep : ()Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;
    //   800: dup
    //   801: ifnull -> 843
    //   804: astore #19
    //   806: iconst_0
    //   807: istore #20
    //   809: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement
    //   812: dup
    //   813: aload #15
    //   815: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreementKind.AcceptInBrowser : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreementKind;
    //   818: aload #19
    //   820: invokevirtual getAgreement : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;
    //   823: new com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$3$9$1
    //   826: dup
    //   827: aload #19
    //   829: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;)V
    //   832: checkcast kotlin/jvm/functions/Function0
    //   835: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreementKind;Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;Lkotlin/jvm/functions/Function0;)V
    //   838: nop
    //   839: nop
    //   840: goto -> 858
    //   843: pop
    //   844: new java/lang/IllegalStateException
    //   847: dup
    //   848: ldc_w 'License agreement accept step is null'
    //   851: invokevirtual toString : ()Ljava/lang/String;
    //   854: invokespecial <init> : (Ljava/lang/String;)V
    //   857: athrow
    //   858: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState
    //   861: goto -> 1315
    //   864: aload #18
    //   866: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptPending$AipLicenseAgreementAcceptRequired$AipLicenseEndUserMayAcceptAgreementFirstTime.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptPending$AipLicenseAgreementAcceptRequired$AipLicenseEndUserMayAcceptAgreementFirstTime;
    //   869: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   872: ifeq -> 962
    //   875: aload #12
    //   877: ldc_w 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation'
    //   880: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   883: aload #12
    //   885: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiProJbaActivation
    //   888: invokevirtual getLicenseJourney : ()Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseJourney;
    //   891: dup
    //   892: ifnull -> 941
    //   895: invokevirtual getAgreementAcceptStep : ()Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;
    //   898: dup
    //   899: ifnull -> 941
    //   902: astore #19
    //   904: iconst_0
    //   905: istore #20
    //   907: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement
    //   910: dup
    //   911: aload #15
    //   913: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreementKind.AcceptFirstTime : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreementKind;
    //   916: aload #19
    //   918: invokevirtual getAgreement : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;
    //   921: new com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$3$10$1
    //   924: dup
    //   925: aload #19
    //   927: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;)V
    //   930: checkcast kotlin/jvm/functions/Function0
    //   933: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreementKind;Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;Lkotlin/jvm/functions/Function0;)V
    //   936: nop
    //   937: nop
    //   938: goto -> 956
    //   941: pop
    //   942: new java/lang/IllegalStateException
    //   945: dup
    //   946: ldc_w 'License agreement accept step is null'
    //   949: invokevirtual toString : ()Ljava/lang/String;
    //   952: invokespecial <init> : (Ljava/lang/String;)V
    //   955: athrow
    //   956: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState
    //   959: goto -> 1315
    //   962: aload #18
    //   964: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptPending$AipLicenseAgreementAcceptRequired$AipLicenseEndUserMayAcceptAgreementUpdatedVersion.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptPending$AipLicenseAgreementAcceptRequired$AipLicenseEndUserMayAcceptAgreementUpdatedVersion;
    //   967: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   970: ifeq -> 1060
    //   973: aload #12
    //   975: ldc_w 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation'
    //   978: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   981: aload #12
    //   983: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiProJbaActivation
    //   986: invokevirtual getLicenseJourney : ()Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseJourney;
    //   989: dup
    //   990: ifnull -> 1039
    //   993: invokevirtual getAgreementAcceptStep : ()Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;
    //   996: dup
    //   997: ifnull -> 1039
    //   1000: astore #19
    //   1002: iconst_0
    //   1003: istore #20
    //   1005: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement
    //   1008: dup
    //   1009: aload #15
    //   1011: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreementKind.AcceptUpdate : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreementKind;
    //   1014: aload #19
    //   1016: invokevirtual getAgreement : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;
    //   1019: new com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$3$11$1
    //   1022: dup
    //   1023: aload #19
    //   1025: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;)V
    //   1028: checkcast kotlin/jvm/functions/Function0
    //   1031: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreementKind;Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;Lkotlin/jvm/functions/Function0;)V
    //   1034: nop
    //   1035: nop
    //   1036: goto -> 1054
    //   1039: pop
    //   1040: new java/lang/IllegalStateException
    //   1043: dup
    //   1044: ldc_w 'License agreement accept step is null'
    //   1047: invokevirtual toString : ()Ljava/lang/String;
    //   1050: invokespecial <init> : (Ljava/lang/String;)V
    //   1053: athrow
    //   1054: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState
    //   1057: goto -> 1315
    //   1060: aload #18
    //   1062: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/AipLicensePending$AipLicenseListEmpty.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicensePending$AipLicenseListEmpty;
    //   1065: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1068: ifeq -> 1134
    //   1071: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense
    //   1074: dup
    //   1075: aload #15
    //   1077: new com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$3$12
    //   1080: dup
    //   1081: aload #12
    //   1083: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;)V
    //   1086: checkcast kotlin/jvm/functions/Function0
    //   1089: new com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$3$13
    //   1092: dup
    //   1093: aload #12
    //   1095: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;)V
    //   1098: checkcast kotlin/jvm/functions/Function0
    //   1101: new com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$3$14
    //   1104: dup
    //   1105: aload #12
    //   1107: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;)V
    //   1110: checkcast kotlin/jvm/functions/Function0
    //   1113: new com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$3$15
    //   1116: dup
    //   1117: aload #12
    //   1119: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;)V
    //   1122: checkcast kotlin/jvm/functions/Function0
    //   1125: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    //   1128: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState
    //   1131: goto -> 1315
    //   1134: aload #18
    //   1136: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/IdeLicenseAiAllowancePending$IdeLicenseAiProhibited.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/IdeLicenseAiAllowancePending$IdeLicenseAiProhibited;
    //   1139: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1142: ifeq -> 1173
    //   1145: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/AIPBlocked
    //   1148: dup
    //   1149: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/AIPBlocked$Reason.ProhibitedInOrganization : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIPBlocked$Reason;
    //   1152: new com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$3$16
    //   1155: dup
    //   1156: aload #12
    //   1158: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;)V
    //   1161: checkcast kotlin/jvm/functions/Function0
    //   1164: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIPBlocked$Reason;Lkotlin/jvm/functions/Function0;)V
    //   1167: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState
    //   1170: goto -> 1315
    //   1173: aload #18
    //   1175: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthPending$JbaAuthRejected.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthPending$JbaAuthRejected;
    //   1178: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1181: ifeq -> 1207
    //   1184: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated
    //   1187: dup
    //   1188: aload #15
    //   1190: aload_0
    //   1191: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;
    //   1194: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
    //   1197: iconst_1
    //   1198: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/openapi/project/Project;Z)V
    //   1201: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState
    //   1204: goto -> 1315
    //   1207: aload #18
    //   1209: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthPending$JbaUnauthenticated.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthPending$JbaUnauthenticated;
    //   1212: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1215: ifeq -> 1243
    //   1218: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated
    //   1221: dup
    //   1222: aload #15
    //   1224: aload_0
    //   1225: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;
    //   1228: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
    //   1231: iconst_0
    //   1232: iconst_4
    //   1233: aconst_null
    //   1234: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/openapi/project/Project;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   1237: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState
    //   1240: goto -> 1315
    //   1243: new kotlin/NoWhenBranchMatchedException
    //   1246: dup
    //   1247: invokespecial <init> : ()V
    //   1250: athrow
    //   1251: new kotlin/NoWhenBranchMatchedException
    //   1254: dup
    //   1255: invokespecial <init> : ()V
    //   1258: athrow
    //   1259: aload #12
    //   1261: invokeinterface getOutcome-07x5Wys : ()Ljava/lang/Object;
    //   1266: invokestatic getOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1269: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/GrazieAuthContext
    //   1272: astore #17
    //   1274: aload #17
    //   1276: ifnull -> 1294
    //   1279: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   1282: ldc_w 'Activation ready'
    //   1285: invokevirtual info : (Ljava/lang/String;)V
    //   1288: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState$Ready.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState$Ready;
    //   1291: goto -> 1312
    //   1294: new java/lang/IllegalStateException
    //   1297: dup
    //   1298: aload #12
    //   1300: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;)Ljava/lang/String;
    //   1305: invokevirtual toString : ()Ljava/lang/String;
    //   1308: invokespecial <init> : (Ljava/lang/String;)V
    //   1311: athrow
    //   1312: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState
    //   1315: nop
    //   1316: aload #9
    //   1318: swap
    //   1319: aload_3
    //   1320: aload_3
    //   1321: iconst_1
    //   1322: putfield label : I
    //   1325: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   1330: dup
    //   1331: aload #5
    //   1333: if_acmpne -> 1349
    //   1336: aload #5
    //   1338: areturn
    //   1339: iconst_0
    //   1340: istore #8
    //   1342: aload #4
    //   1344: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   1347: aload #4
    //   1349: pop
    //   1350: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   1353: areturn
    //   1354: new java/lang/IllegalStateException
    //   1357: dup
    //   1358: ldc_w 'call to 'resume' before 'invoke' with coroutine'
    //   1361: invokespecial <init> : (Ljava/lang/String;)V
    //   1364: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #0	-> 55
    //   #49	-> 89
    //   #219	-> 101
    //   #220	-> 120
    //   #221	-> 127
    //   #222	-> 134
    //   #223	-> 141
    //   #224	-> 146
    //   #226	-> 151
    //   #227	-> 172
    //   #228	-> 191
    //   #230	-> 200
    //   #231	-> 215
    //   #232	-> 220
    //   #233	-> 233
    //   #234	-> 237
    //   #235	-> 245
    //   #236	-> 250
    //   #238	-> 259
    //   #242	-> 268
    //   #243	-> 283
    //   #244	-> 294
    //   #249	-> 322
    //   #250	-> 333
    //   #255	-> 361
    //   #256	-> 372
    //   #261	-> 400
    //   #262	-> 411
    //   #267	-> 439
    //   #268	-> 447
    //   #273	-> 489
    //   #274	-> 500
    //   #242	-> 528
    //   #280	-> 542
    //   #281	-> 550
    //   #282	-> 557
    //   #283	-> 568
    //   #284	-> 572
    //   #285	-> 575
    //   #283	-> 581
    //   #291	-> 590
    //   #292	-> 601
    //   #295	-> 617
    //   #296	-> 628
    //   #299	-> 644
    //   #300	-> 652
    //   #303	-> 668
    //   #304	-> 679
    //   #305	-> 711
    //   #306	-> 715
    //   #307	-> 717
    //   #308	-> 720
    //   #309	-> 725
    //   #305	-> 737
    //   #310	-> 740
    //   #304	-> 741
    //   #304	-> 742
    //   #311	-> 750
    //   #314	-> 766
    //   #315	-> 777
    //   #316	-> 809
    //   #317	-> 813
    //   #318	-> 815
    //   #319	-> 818
    //   #320	-> 823
    //   #316	-> 835
    //   #321	-> 838
    //   #315	-> 839
    //   #315	-> 840
    //   #322	-> 848
    //   #325	-> 864
    //   #326	-> 875
    //   #327	-> 907
    //   #328	-> 911
    //   #329	-> 913
    //   #330	-> 916
    //   #331	-> 921
    //   #327	-> 933
    //   #332	-> 936
    //   #326	-> 937
    //   #326	-> 938
    //   #333	-> 946
    //   #336	-> 962
    //   #337	-> 973
    //   #338	-> 1005
    //   #339	-> 1009
    //   #340	-> 1011
    //   #341	-> 1014
    //   #342	-> 1019
    //   #338	-> 1031
    //   #343	-> 1034
    //   #337	-> 1035
    //   #337	-> 1036
    //   #344	-> 1044
    //   #347	-> 1060
    //   #348	-> 1071
    //   #349	-> 1075
    //   #353	-> 1077
    //   #357	-> 1089
    //   #361	-> 1101
    //   #350	-> 1113
    //   #348	-> 1125
    //   #367	-> 1134
    //   #368	-> 1145
    //   #369	-> 1149
    //   #370	-> 1152
    //   #368	-> 1164
    //   #375	-> 1173
    //   #376	-> 1207
    //   #281	-> 1243
    //   #233	-> 1251
    //   #381	-> 1259
    //   #382	-> 1274
    //   #383	-> 1279
    //   #384	-> 1288
    //   #387	-> 1298
    //   #389	-> 1315
    //   #219	-> 1316
    //   #0	-> 1336
    //   #49	-> 1349
    //   #0	-> 1354
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   89	57	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   151	94	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   268	26	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   322	11	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   361	11	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   400	11	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   439	50	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   542	26	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   590	11	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   617	11	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   644	8	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   668	11	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   766	11	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   864	11	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   962	11	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   1060	11	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   1134	11	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   1173	34	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   1207	36	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$special$$inlined$map$1$2;
    //   89	9	1	value	Ljava/lang/Object;
    //   98	19	6	value	Ljava/lang/Object;
    //   98	19	7	$this$map_u24lambda_u245	Lkotlinx/coroutines/flow/FlowCollector;
    //   117	24	10	it	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$2$1;
    //   127	19	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   151	94	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   268	54	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   322	39	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   361	39	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   400	39	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   439	8	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   489	39	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   542	26	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   590	11	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   617	11	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   644	8	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   668	40	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   766	40	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   864	40	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   962	40	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   1060	65	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   1134	30	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   1259	20	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   1294	18	12	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   134	12	13	optimisticState	Z
    //   151	99	13	optimisticState	Z
    //   141	10	14	mock	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;
    //   191	54	15	childScope	Lkotlinx/coroutines/CoroutineScope;
    //   268	15	15	childScope	Lkotlinx/coroutines/CoroutineScope;
    //   542	26	15	childScope	Lkotlinx/coroutines/CoroutineScope;
    //   590	11	15	childScope	Lkotlinx/coroutines/CoroutineScope;
    //   617	11	15	childScope	Lkotlinx/coroutines/CoroutineScope;
    //   644	8	15	childScope	Lkotlinx/coroutines/CoroutineScope;
    //   668	49	15	childScope	Lkotlinx/coroutines/CoroutineScope;
    //   766	49	15	childScope	Lkotlinx/coroutines/CoroutineScope;
    //   864	49	15	childScope	Lkotlinx/coroutines/CoroutineScope;
    //   962	49	15	childScope	Lkotlinx/coroutines/CoroutineScope;
    //   1060	17	15	childScope	Lkotlinx/coroutines/CoroutineScope;
    //   1134	11	15	childScope	Lkotlinx/coroutines/CoroutineScope;
    //   1173	34	15	childScope	Lkotlinx/coroutines/CoroutineScope;
    //   1207	36	15	childScope	Lkotlinx/coroutines/CoroutineScope;
    //   215	30	16	activationPending	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationPending;
    //   268	26	16	activationPending	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationPending;
    //   322	11	16	activationPending	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationPending;
    //   361	11	16	activationPending	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationPending;
    //   400	11	16	activationPending	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationPending;
    //   439	50	16	activationPending	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationPending;
    //   542	15	16	activationPending	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationPending;
    //   1274	38	17	activationPending	Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieAuthContext;
    //   708	33	19	agreementAcceptStep	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;
    //   806	33	19	agreementAcceptStep	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;
    //   904	33	19	agreementAcceptStep	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;
    //   1002	33	19	agreementAcceptStep	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;
    //   711	30	20	$i$a$-let-GrazieActivationVm$state$3$8	I
    //   809	30	20	$i$a$-let-GrazieActivationVm$state$3$9	I
    //   907	30	20	$i$a$-let-GrazieActivationVm$state$3$10	I
    //   1005	30	20	$i$a$-let-GrazieActivationVm$state$3$11	I
    //   120	1196	11	$i$a$-map-GrazieActivationVm$state$3	I
    //   0	1365	2	$completion	Lkotlin/coroutines/Continuation;
    //   101	1238	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
    //   46	1308	3	$continuation	Lkotlin/coroutines/Continuation;
    //   52	1302	4	$result	Ljava/lang/Object;
    //   1342	8	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\GrazieActivationVm$special$$inlined$map$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */