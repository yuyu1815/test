/*     */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*     */ 
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicense;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseProductType;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseRequestFailure;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseResult;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseRepository;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.junie.activity.ActivityCallable;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.junie.activity.ActivityLauncher;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AipLicenseFetchStep;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.OpResult;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000V\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\032A\020\000\032\0020\0012\006\020\002\032\0020\0032\034\020\004\032\030\b\001\022\n\022\b\022\004\022\0020\0070\006\022\006\022\004\030\0010\b0\0052\f\020\t\032\b\022\004\022\0020\0070\nH\001¢\006\002\020\013\032;\020\000\032\0020\0012\006\020\f\032\0020\r2\006\020\002\032\0020\0032\034\020\004\032\030\b\001\022\n\022\b\022\004\022\0020\0070\006\022\006\022\004\030\0010\b0\005H\003¢\006\002\020\016\0327\020\017\032\0020\0202'\020\021\032#\b\001\022\004\022\0020\023\022\n\022\b\022\004\022\0020\0200\006\022\006\022\004\030\0010\b0\022¢\006\002\b\024H@¢\006\002\020\025\"\016\020\026\032\0020\027X\004¢\006\002\n\000¨\006\030²\006\020\020\031\032\b\022\004\022\0020\0330\032X\002"}, d2 = {"aipLicenseFetchStep", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;", "jbaAuthData", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;", "onAuthRejected", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "licenseAgreementAutoAccepted", "Lkotlin/Function0;", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;", "productType", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;", "performLicenseRequestWithTimeout", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;", "block", "Lkotlin/Function2;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepository;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "state.junie.impl", "latestTrialLicensesToAppendToResultList", "", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;"})
/*     */ @SourceDebugExtension({"SMAP\naipLicenseFetchStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 aipLicenseFetchStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseFetchStepKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 util.kt\ncom/intellij/util/containers/UtilKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 outcome.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/util/OutcomeKt\n+ 6 Outcome.kt\ncom/intellij/ml/llm/matterhorn/activation/state/model/Outcome\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,147:1\n1225#2,6:148\n1225#2,6:160\n1225#2,6:166\n1225#2,6:172\n1225#2,6:178\n1225#2,6:184\n1225#2,6:190\n258#3,2:154\n260#3:159\n1872#4,3:156\n1368#4:196\n1454#4,2:197\n1456#4,3:205\n30#5:199\n21#5:200\n22#5:204\n16#6,3:201\n81#7:208\n107#7,2:209\n58#8:211\n36#8,2:212\n*S KotlinDebug\n*F\n+ 1 aipLicenseFetchStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseFetchStepKt\n*L\n38#1:148,6\n74#1:160,6\n88#1:166,6\n94#1:172,6\n96#1:178,6\n104#1:184,6\n111#1:190,6\n73#1:154,2\n73#1:159\n73#1:156,3\n68#1:196\n68#1:197,2\n68#1:205,3\n68#1:199\n68#1:200\n68#1:204\n68#1:201,3\n94#1:208\n94#1:209,2\n146#1:211\n146#1:212,2\n*E\n"})
/*     */ public final class AipLicenseFetchStepKt {
/*     */   @NotNull
/*     */   private static final Logger LOG;
/*     */   
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final AipLicenseFetchStep aipLicenseFetchStep(@NotNull JbaAuthData jbaAuthData, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> onAuthRejected, @NotNull Function0 licenseAgreementAutoAccepted, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'jbaAuthData'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'onAuthRejected'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: ldc 'licenseAgreementAutoAccepted'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload_3
/*     */     //   19: ldc 1437894512
/*     */     //   21: invokeinterface startReplaceGroup : (I)V
/*     */     //   26: invokestatic isTraceInProgress : ()Z
/*     */     //   29: ifeq -> 42
/*     */     //   32: ldc 1437894512
/*     */     //   34: iload #4
/*     */     //   36: iconst_m1
/*     */     //   37: ldc 'com.intellij.ml.llm.matterhorn.activation.state.junie.aipLicenseFetchStep (aipLicenseFetchStep.kt:36)'
/*     */     //   39: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   42: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseFetchStepKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   45: aload_3
/*     */     //   46: ldc 12128007
/*     */     //   48: invokeinterface startReplaceGroup : (I)V
/*     */     //   53: aload_3
/*     */     //   54: astore #6
/*     */     //   56: iconst_0
/*     */     //   57: istore #7
/*     */     //   59: iconst_0
/*     */     //   60: istore #8
/*     */     //   62: aload #6
/*     */     //   64: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   69: astore #9
/*     */     //   71: iconst_0
/*     */     //   72: istore #10
/*     */     //   74: aload #9
/*     */     //   76: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   79: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   82: if_acmpne -> 114
/*     */     //   85: astore #27
/*     */     //   87: iconst_0
/*     */     //   88: istore #11
/*     */     //   90: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*     */     //   95: aload #27
/*     */     //   97: swap
/*     */     //   98: astore #11
/*     */     //   100: aload #6
/*     */     //   102: aload #11
/*     */     //   104: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   109: aload #11
/*     */     //   111: goto -> 116
/*     */     //   114: aload #9
/*     */     //   116: nop
/*     */     //   117: nop
/*     */     //   118: nop
/*     */     //   119: checkcast kotlin/jvm/functions/Function0
/*     */     //   122: astore #5
/*     */     //   124: aload_3
/*     */     //   125: invokeinterface endReplaceGroup : ()V
/*     */     //   130: aload #5
/*     */     //   132: aload_3
/*     */     //   133: bipush #48
/*     */     //   135: invokestatic TraceComposition : (Lcom/intellij/openapi/diagnostic/Logger;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */     //   138: new java/util/ArrayList
/*     */     //   141: dup
/*     */     //   142: invokespecial <init> : ()V
/*     */     //   145: checkcast java/util/List
/*     */     //   148: astore #5
/*     */     //   150: getstatic com/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType.AIPU : Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */     //   153: aload_0
/*     */     //   154: aload_1
/*     */     //   155: aload_3
/*     */     //   156: bipush #6
/*     */     //   158: bipush #112
/*     */     //   160: iload #4
/*     */     //   162: iconst_3
/*     */     //   163: ishl
/*     */     //   164: iand
/*     */     //   165: ior
/*     */     //   166: sipush #896
/*     */     //   169: iload #4
/*     */     //   171: iconst_3
/*     */     //   172: ishl
/*     */     //   173: iand
/*     */     //   174: ior
/*     */     //   175: invokestatic aipLicenseFetchStep : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;
/*     */     //   178: astore #6
/*     */     //   180: aload #5
/*     */     //   182: aload #6
/*     */     //   184: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   189: pop
/*     */     //   190: getstatic com/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType.AIP : Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */     //   193: aload_0
/*     */     //   194: aload_1
/*     */     //   195: aload_3
/*     */     //   196: bipush #6
/*     */     //   198: bipush #112
/*     */     //   200: iload #4
/*     */     //   202: iconst_3
/*     */     //   203: ishl
/*     */     //   204: iand
/*     */     //   205: ior
/*     */     //   206: sipush #896
/*     */     //   209: iload #4
/*     */     //   211: iconst_3
/*     */     //   212: ishl
/*     */     //   213: iand
/*     */     //   214: ior
/*     */     //   215: invokestatic aipLicenseFetchStep : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;
/*     */     //   218: astore #7
/*     */     //   220: aload #5
/*     */     //   222: aload #7
/*     */     //   224: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   229: pop
/*     */     //   230: getstatic com/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType.AIF : Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */     //   233: aload_0
/*     */     //   234: aload_1
/*     */     //   235: aload_3
/*     */     //   236: bipush #6
/*     */     //   238: bipush #112
/*     */     //   240: iload #4
/*     */     //   242: iconst_3
/*     */     //   243: ishl
/*     */     //   244: iand
/*     */     //   245: ior
/*     */     //   246: sipush #896
/*     */     //   249: iload #4
/*     */     //   251: iconst_3
/*     */     //   252: ishl
/*     */     //   253: iand
/*     */     //   254: ior
/*     */     //   255: invokestatic aipLicenseFetchStep : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;
/*     */     //   258: astore #8
/*     */     //   260: aload #5
/*     */     //   262: aload #8
/*     */     //   264: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   269: pop
/*     */     //   270: aload #5
/*     */     //   272: invokeinterface size : ()I
/*     */     //   277: iconst_1
/*     */     //   278: if_icmpne -> 312
/*     */     //   281: aload #5
/*     */     //   283: iconst_0
/*     */     //   284: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   289: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep
/*     */     //   292: astore #9
/*     */     //   294: invokestatic isTraceInProgress : ()Z
/*     */     //   297: ifeq -> 303
/*     */     //   300: invokestatic traceEventEnd : ()V
/*     */     //   303: aload_3
/*     */     //   304: invokeinterface endReplaceGroup : ()V
/*     */     //   309: aload #9
/*     */     //   311: areturn
/*     */     //   312: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle.Companion : Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle$Companion;
/*     */     //   315: aload #5
/*     */     //   317: checkcast java/util/Collection
/*     */     //   320: astore #11
/*     */     //   322: astore #28
/*     */     //   324: iconst_0
/*     */     //   325: istore #12
/*     */     //   327: aload #11
/*     */     //   329: invokeinterface size : ()I
/*     */     //   334: anewarray kotlin/jvm/functions/Function0
/*     */     //   337: astore #13
/*     */     //   339: aload #13
/*     */     //   341: checkcast [Ljava/lang/Object;
/*     */     //   344: astore #14
/*     */     //   346: iconst_0
/*     */     //   347: istore #15
/*     */     //   349: aload #11
/*     */     //   351: checkcast java/lang/Iterable
/*     */     //   354: astore #16
/*     */     //   356: iconst_0
/*     */     //   357: istore #17
/*     */     //   359: iconst_0
/*     */     //   360: istore #18
/*     */     //   362: aload #16
/*     */     //   364: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   369: astore #19
/*     */     //   371: aload #19
/*     */     //   373: invokeinterface hasNext : ()Z
/*     */     //   378: ifeq -> 452
/*     */     //   381: aload #19
/*     */     //   383: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   388: astore #20
/*     */     //   390: iload #18
/*     */     //   392: iinc #18, 1
/*     */     //   395: istore #21
/*     */     //   397: iload #21
/*     */     //   399: ifge -> 405
/*     */     //   402: invokestatic throwIndexOverflow : ()V
/*     */     //   405: iload #21
/*     */     //   407: aload #20
/*     */     //   409: astore #22
/*     */     //   411: istore #23
/*     */     //   413: iconst_0
/*     */     //   414: istore #24
/*     */     //   416: aload #14
/*     */     //   418: iload #23
/*     */     //   420: aload #22
/*     */     //   422: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep
/*     */     //   425: astore #25
/*     */     //   427: istore #30
/*     */     //   429: astore #29
/*     */     //   431: iconst_0
/*     */     //   432: istore #26
/*     */     //   434: aload #25
/*     */     //   436: invokevirtual getOnFetchRequested : ()Lkotlin/jvm/functions/Function0;
/*     */     //   439: astore #31
/*     */     //   441: aload #29
/*     */     //   443: iload #30
/*     */     //   445: aload #31
/*     */     //   447: aastore
/*     */     //   448: nop
/*     */     //   449: goto -> 371
/*     */     //   452: nop
/*     */     //   453: nop
/*     */     //   454: aload #13
/*     */     //   456: checkcast [Ljava/lang/Object;
/*     */     //   459: nop
/*     */     //   460: aload #28
/*     */     //   462: swap
/*     */     //   463: checkcast [Lkotlin/jvm/functions/Function0;
/*     */     //   466: astore #10
/*     */     //   468: aload #10
/*     */     //   470: aload #10
/*     */     //   472: arraylength
/*     */     //   473: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*     */     //   476: checkcast [Lkotlin/jvm/functions/Function0;
/*     */     //   479: invokevirtual callableOf : ([Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
/*     */     //   482: aload_3
/*     */     //   483: ldc 12159774
/*     */     //   485: invokeinterface startReplaceGroup : (I)V
/*     */     //   490: aload_3
/*     */     //   491: astore #11
/*     */     //   493: iload #4
/*     */     //   495: sipush #896
/*     */     //   498: iand
/*     */     //   499: sipush #384
/*     */     //   502: ixor
/*     */     //   503: sipush #256
/*     */     //   506: if_icmple -> 519
/*     */     //   509: aload_3
/*     */     //   510: aload_2
/*     */     //   511: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   516: ifne -> 531
/*     */     //   519: iload #4
/*     */     //   521: sipush #384
/*     */     //   524: iand
/*     */     //   525: sipush #256
/*     */     //   528: if_icmpne -> 535
/*     */     //   531: iconst_1
/*     */     //   532: goto -> 536
/*     */     //   535: iconst_0
/*     */     //   536: aload_3
/*     */     //   537: aload #7
/*     */     //   539: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   544: ior
/*     */     //   545: istore #12
/*     */     //   547: nop
/*     */     //   548: iconst_0
/*     */     //   549: istore #13
/*     */     //   551: aload #11
/*     */     //   553: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   558: astore #14
/*     */     //   560: iconst_0
/*     */     //   561: istore #15
/*     */     //   563: iload #12
/*     */     //   565: ifne -> 579
/*     */     //   568: aload #14
/*     */     //   570: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   573: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   576: if_acmpne -> 611
/*     */     //   579: astore #28
/*     */     //   581: iconst_0
/*     */     //   582: istore #16
/*     */     //   584: aload_2
/*     */     //   585: aload #7
/*     */     //   587: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;)Lkotlin/jvm/functions/Function0;
/*     */     //   592: aload #28
/*     */     //   594: swap
/*     */     //   595: astore #17
/*     */     //   597: aload #11
/*     */     //   599: aload #17
/*     */     //   601: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   606: aload #17
/*     */     //   608: goto -> 613
/*     */     //   611: aload #14
/*     */     //   613: nop
/*     */     //   614: nop
/*     */     //   615: nop
/*     */     //   616: checkcast kotlin/jvm/functions/Function0
/*     */     //   619: astore #10
/*     */     //   621: aload_3
/*     */     //   622: invokeinterface endReplaceGroup : ()V
/*     */     //   627: aload #10
/*     */     //   629: aload #5
/*     */     //   631: invokestatic aipLicenseFetchStep$combinedOutcome : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   634: aconst_null
/*     */     //   635: astore #32
/*     */     //   637: astore #33
/*     */     //   639: astore #34
/*     */     //   641: astore #35
/*     */     //   643: new com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep
/*     */     //   646: dup
/*     */     //   647: aload #35
/*     */     //   649: aload #34
/*     */     //   651: aload #33
/*     */     //   653: aload #32
/*     */     //   655: invokespecial <init> : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   658: astore #9
/*     */     //   660: invokestatic isTraceInProgress : ()Z
/*     */     //   663: ifeq -> 669
/*     */     //   666: invokestatic traceEventEnd : ()V
/*     */     //   669: aload_3
/*     */     //   670: invokeinterface endReplaceGroup : ()V
/*     */     //   675: aload #9
/*     */     //   677: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #37	-> 39
/*     */     //   #38	-> 42
/*     */     //   #148	-> 62
/*     */     //   #149	-> 74
/*     */     //   #150	-> 85
/*     */     //   #150	-> 98
/*     */     //   #151	-> 100
/*     */     //   #152	-> 109
/*     */     //   #153	-> 114
/*     */     //   #149	-> 116
/*     */     //   #148	-> 117
/*     */     //   #148	-> 118
/*     */     //   #38	-> 119
/*     */     //   #40	-> 138
/*     */     //   #40	-> 148
/*     */     //   #43	-> 150
/*     */     //   #44	-> 153
/*     */     //   #45	-> 154
/*     */     //   #42	-> 175
/*     */     //   #47	-> 180
/*     */     //   #50	-> 190
/*     */     //   #51	-> 193
/*     */     //   #52	-> 194
/*     */     //   #49	-> 215
/*     */     //   #54	-> 220
/*     */     //   #57	-> 230
/*     */     //   #58	-> 233
/*     */     //   #59	-> 234
/*     */     //   #56	-> 255
/*     */     //   #61	-> 260
/*     */     //   #63	-> 270
/*     */     //   #64	-> 281
/*     */     //   #72	-> 312
/*     */     //   #73	-> 312
/*     */     //   #154	-> 327
/*     */     //   #155	-> 349
/*     */     //   #156	-> 359
/*     */     //   #157	-> 362
/*     */     //   #157	-> 407
/*     */     //   #155	-> 416
/*     */     //   #73	-> 434
/*     */     //   #155	-> 447
/*     */     //   #157	-> 448
/*     */     //   #158	-> 452
/*     */     //   #159	-> 453
/*     */     //   #154	-> 454
/*     */     //   #154	-> 459
/*     */     //   #73	-> 463
/*     */     //   #74	-> 547
/*     */     //   #160	-> 551
/*     */     //   #161	-> 563
/*     */     //   #162	-> 579
/*     */     //   #74	-> 584
/*     */     //   #162	-> 595
/*     */     //   #163	-> 597
/*     */     //   #164	-> 606
/*     */     //   #165	-> 611
/*     */     //   #161	-> 613
/*     */     //   #160	-> 614
/*     */     //   #160	-> 615
/*     */     //   #74	-> 616
/*     */     //   #78	-> 629
/*     */     //   #72	-> 635
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   90	5	11	$i$a$-cache-AipLicenseFetchStepKt$aipLicenseFetchStep$1	I
/*     */     //   100	11	11	value$iv	Ljava/lang/Object;
/*     */     //   74	43	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   71	46	9	it$iv	Ljava/lang/Object;
/*     */     //   62	57	8	$i$f$cache	I
/*     */     //   59	60	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   59	60	7	invalid$iv	Z
/*     */     //   434	5	26	$i$a$-map2Array-AipLicenseFetchStepKt$aipLicenseFetchStep$2	I
/*     */     //   431	8	25	it	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;
/*     */     //   416	32	24	$i$a$-forEachIndexed-UtilKt$map2Array$2$1$iv	I
/*     */     //   413	35	23	index$iv	I
/*     */     //   413	35	22	t$iv	Ljava/lang/Object;
/*     */     //   390	59	20	item$iv$iv	Ljava/lang/Object;
/*     */     //   359	94	17	$i$f$forEachIndexed	I
/*     */     //   362	91	18	index$iv$iv	I
/*     */     //   356	97	16	$this$forEachIndexed$iv$iv	Ljava/lang/Iterable;
/*     */     //   349	105	15	$i$a$-also-UtilKt$map2Array$2$iv	I
/*     */     //   346	108	14	array$iv	[Ljava/lang/Object;
/*     */     //   327	133	12	$i$f$map2Array	I
/*     */     //   324	136	11	$this$map2Array$iv	Ljava/util/Collection;
/*     */     //   584	8	16	$i$a$-cache-AipLicenseFetchStepKt$aipLicenseFetchStep$3	I
/*     */     //   597	11	17	value$iv	Ljava/lang/Object;
/*     */     //   563	51	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   560	54	14	it$iv	Ljava/lang/Object;
/*     */     //   551	65	13	$i$f$cache	I
/*     */     //   548	68	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   548	68	12	invalid$iv	Z
/*     */     //   150	528	5	steps	Ljava/util/List;
/*     */     //   180	498	6	aipuListStep	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;
/*     */     //   220	458	7	aipListStep	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;
/*     */     //   260	418	8	aifListStep	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;
/*     */     //   0	678	0	jbaAuthData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;
/*     */     //   0	678	1	onAuthRejected	Lkotlin/jvm/functions/Function1;
/*     */     //   0	678	2	licenseAgreementAutoAccepted	Lkotlin/jvm/functions/Function0;
/*     */     //   0	678	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	678	4	$changed	I
/*     */   }
/*     */   
/*  38 */   private static final String aipLicenseFetchStep$lambda$1$lambda$0() { return "AI Pro license fetch"; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final OpHandle aipLicenseFetchStep$lambda$6$lambda$5(Function0 $licenseAgreementAutoAccepted, AipLicenseFetchStep $aipListStep) {
/*     */     $licenseAgreementAutoAccepted.invoke();
/*     */     return (OpHandle)$aipListStep.getOnTrialRequested().invoke();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Object aipLicenseFetchStep$combinedOutcome(List steps) {
/*  68 */     Iterable $this$flatMap$iv = steps; int $i$f$flatMap = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 196 */     Iterable iterable1 = $this$flatMap$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 197 */     for (Object element$iv$iv : iterable1) {
/* 198 */       AipLicenseFetchStep step = (AipLicenseFetchStep)element$iv$iv; int $i$a$-flatMap-AipLicenseFetchStepKt$aipLicenseFetchStep$combinedOutcome$availableLicenses$1 = 0; Journey $this$completeOrElse$iv = (Journey)step; int $i$f$completeOrElse = 0;
/* 199 */       Object $this$getOrElse_u2dG1CwGJM$iv$iv = $this$completeOrElse$iv.getOutcome-07x5Wys(); int $i$f$getOrElse-G1CwGJM = 0;
/* 200 */       int $i$f$fold-impl = 0;
/* 201 */       boolean bool = Outcome.isIncomplete-impl($this$getOrElse_u2dG1CwGJM$iv$iv);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 207 */     List availableLicenses = (List)destination$iv$iv; return OutcomeKt.done(availableLicenses);
/* 208 */   } @Composable private static final AipLicenseFetchStep aipLicenseFetchStep(AipLicenseProductType productType, JbaAuthData jbaAuthData, Function1<? super Continuation<? super Unit>, ? extends Object> onAuthRejected, Composer $composer, int $changed) { $composer.startReplaceGroup(168111296); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(168111296, $changed, -1, "com.intellij.ml.llm.matterhorn.activation.state.junie.aipLicenseFetchStep (aipLicenseFetchStep.kt:86)");  $composer.startReplaceGroup(12169976); Composer composer1 = $composer; boolean invalid$iv = ((($changed & 0xE ^ 0x6) > 4 && $composer.changed(productType)) || ($changed & 0x6) == 4); int $i$f$cache = 0; Object it$iv = composer1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0; if (invalid$iv || it$iv == Composer.Companion.getEmpty()) { Logger logger = LOG; int $i$a$-cache-AipLicenseFetchStepKt$aipLicenseFetchStep$4 = 0; Object value$iv = productType::aipLicenseFetchStep$lambda$8$lambda$7; composer1.updateRememberedValue(value$iv); }  Function0 function0 = (Function0)it$iv; $composer.endReplaceGroup(); LoggingComposeKt.TraceComposition(logger, function0, $composer, 0); $composer.startReplaceGroup(12183585); Composer composer2 = $composer; boolean bool1 = false; int j = 0; Object object1 = composer2.rememberedValue(); int n = 0; if (object1 == Composer.Companion.getEmpty()) { int $i$a$-cache-AipLicenseFetchStepKt$aipLicenseFetchStep$latestTrialLicensesToAppendToResultList$2 = 0; Object value$iv = SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null); composer2.updateRememberedValue(value$iv); }  MutableState<List<AipLicense>> mutableState1 = (MutableState)object1; $composer.endReplaceGroup(); MutableState<List<AipLicense>> latestTrialLicensesToAppendToResultList$delegate = mutableState1; $composer.startReplaceGroup(12187907); Composer composer3 = $composer; int i = (((($changed & 0xE ^ 0x6) > 4 && $composer.changed(productType)) || ($changed & 0x6) == 4) ? 1 : 0) | $composer.changedInstance(onAuthRejected), k = 0; Object object2 = composer3.rememberedValue(); int i2 = 0; if (i != 0 || object2 == Composer.Companion.getEmpty()) { ActivityLauncher activityLauncher = ActivityLauncherKt.rememberActivityLauncher(AipLicenseResultMapper.INSTANCE, $composer, 6); int $i$a$-cache-AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1 = 0; Object value$iv = new AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1(productType, onAuthRejected, latestTrialLicensesToAppendToResultList$delegate, null); composer3.updateRememberedValue(value$iv); }  Function1 function11 = (Function1)object2; $composer.endReplaceGroup(); ActivityCallable trialCallable = ActivityCallableKt.bind(activityLauncher, function11); ActivityLauncher fetchActivity = ActivityLauncherKt.rememberActivityLauncher(AipLicenseResultMapper.INSTANCE, $composer, 6); $composer.startReplaceGroup(12198362); Composer composer4 = $composer; int m = (((($changed & 0xE ^ 0x6) > 4 && $composer.changed(productType)) || ($changed & 0x6) == 4) ? 1 : 0) | $composer.changedInstance(onAuthRejected), i1 = 0; Object object3 = composer4.rememberedValue(); int i3 = 0; if (m != 0 || object3 == Composer.Companion.getEmpty()) { ActivityLauncher activityLauncher = fetchActivity; int $i$a$-cache-AipLicenseFetchStepKt$aipLicenseFetchStep$fetchCallable$1 = 0; Object value$iv = new AipLicenseFetchStepKt$aipLicenseFetchStep$fetchCallable$1$1(productType, onAuthRejected, latestTrialLicensesToAppendToResultList$delegate, null); composer4.updateRememberedValue(value$iv); }  Function1 function12 = (Function1)object3; $composer.endReplaceGroup(); ActivityCallable<AipLicenseResult, ? extends AipLicenseRequestFailure, ? extends List<AipLicense>> fetchCallable = ActivityCallableKt.bind(activityLauncher, function12); $composer.startReplaceGroup(12206317); Composer $this$cache$iv = $composer; boolean bool2 = $composer.changedInstance(fetchCallable); i1 = 0; object3 = $this$cache$iv.rememberedValue(); i3 = 0; if (bool2 || object3 == Composer.Companion.getEmpty()) { JbaUserId jbaUserId = JbaUserId.box-impl(jbaAuthData.getUser().getUserId-cfj0yrU()); int $i$a$-cache-AipLicenseFetchStepKt$aipLicenseFetchStep$5 = 0; Object value$iv = new AipLicenseFetchStepKt$aipLicenseFetchStep$5$1(fetchCallable, null); $this$cache$iv.updateRememberedValue(value$iv); }  Function2 function2 = (Function2)object3; $composer.endReplaceGroup(); EffectsKt.LaunchedEffect(jbaUserId, function2, $composer, 0); OpResult result = fetchActivity.getLatestOpResult(); Object outcome = (result == null) ? OutcomeKt.activationProgressing((AiaActivationProgressing)AipLicenseFetchPending.AipLicenseFetchInProgress.INSTANCE) : (!(result instanceof OpResult.OpCompleted.OpSucceeded) ? OutcomeKt.activationStalled((AiaActivationStalled)AipLicenseFetchPending.AipLicenseFetchFailure.INSTANCE) : OutcomeKt.done(CollectionsKt.plus((Collection)((OpResult.OpCompleted.OpSucceeded)result).getValue(), aipLicenseFetchStep$lambda$10(latestTrialLicensesToAppendToResultList$delegate)))); AipLicenseFetchStep aipLicenseFetchStep = new AipLicenseFetchStep((Function0)fetchCallable, (Function0)trialCallable, outcome, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return aipLicenseFetchStep; } private static final String aipLicenseFetchStep$lambda$8$lambda$7(AipLicenseProductType $productType) { return "AI Pro license fetch for " + $productType; } private static final List<AipLicense> aipLicenseFetchStep$lambda$10(MutableState $latestTrialLicensesToAppendToResultList$delegate) { State state = (State)$latestTrialLicensesToAppendToResultList$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (List<AipLicense>)state.getValue(); } private static final void aipLicenseFetchStep$lambda$11(MutableState $latestTrialLicensesToAppendToResultList$delegate, List <set-?>) { MutableState mutableState = $latestTrialLicensesToAppendToResultList$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 209 */     mutableState.setValue(<set-?>); } @DebugMetadata(f = "aipLicenseFetchStep.kt", l = {97, 100}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\030\002\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;"}) @SourceDebugExtension({"SMAP\naipLicenseFetchStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 aipLicenseFetchStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1\n+ 2 AipLicenseResultMapper.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseResultMapperKt\n*L\n1#1,147:1\n23#2,3:148\n27#2,3:151\n*S KotlinDebug\n*F\n+ 1 aipLicenseFetchStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1\n*L\n100#1:148,3\n101#1:151,3\n*E\n"}) static final class AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1 extends SuspendLambda implements Function1<Continuation<? super AipLicenseResult>, Object> {
/*     */     Object L$0; int label; AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1(AipLicenseProductType $productType, Function1<Continuation<? super Unit>, Object> $onAuthRejected, MutableState<List<AipLicense>> $latestTrialLicensesToAppendToResultList$delegate, Continuation $completion) { super(1, $completion); } public final Object invokeSuspend(Object $result) { // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #10
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 220, 0 -> 36, 1 -> 76, 2 -> 141
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: new com/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1$1
/*     */       //   43: dup
/*     */       //   44: aload_0
/*     */       //   45: getfield $productType : Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */       //   48: aconst_null
/*     */       //   49: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;Lkotlin/coroutines/Continuation;)V
/*     */       //   52: checkcast kotlin/jvm/functions/Function2
/*     */       //   55: aload_0
/*     */       //   56: checkcast kotlin/coroutines/Continuation
/*     */       //   59: aload_0
/*     */       //   60: iconst_1
/*     */       //   61: putfield label : I
/*     */       //   64: invokestatic access$performLicenseRequestWithTimeout : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   67: dup
/*     */       //   68: aload #10
/*     */       //   70: if_acmpne -> 81
/*     */       //   73: aload #10
/*     */       //   75: areturn
/*     */       //   76: aload_1
/*     */       //   77: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   80: aload_1
/*     */       //   81: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult
/*     */       //   84: astore_2
/*     */       //   85: aload_0
/*     */       //   86: getfield $onAuthRejected : Lkotlin/jvm/functions/Function1;
/*     */       //   89: astore_3
/*     */       //   90: iconst_0
/*     */       //   91: istore #4
/*     */       //   93: aload_2
/*     */       //   94: astore #5
/*     */       //   96: aload #5
/*     */       //   98: astore #6
/*     */       //   100: iconst_0
/*     */       //   101: istore #7
/*     */       //   103: aload #6
/*     */       //   105: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$AuthRequired
/*     */       //   108: ifeq -> 165
/*     */       //   111: iconst_0
/*     */       //   112: istore #8
/*     */       //   114: aload_3
/*     */       //   115: aload_0
/*     */       //   116: aload_0
/*     */       //   117: aload #5
/*     */       //   119: putfield L$0 : Ljava/lang/Object;
/*     */       //   122: aload_0
/*     */       //   123: iconst_2
/*     */       //   124: putfield label : I
/*     */       //   127: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   132: dup
/*     */       //   133: aload #10
/*     */       //   135: if_acmpne -> 164
/*     */       //   138: aload #10
/*     */       //   140: areturn
/*     */       //   141: iconst_0
/*     */       //   142: istore #4
/*     */       //   144: iconst_0
/*     */       //   145: istore #7
/*     */       //   147: iconst_0
/*     */       //   148: istore #8
/*     */       //   150: aload_0
/*     */       //   151: getfield L$0 : Ljava/lang/Object;
/*     */       //   154: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult
/*     */       //   157: astore #5
/*     */       //   159: aload_1
/*     */       //   160: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   163: aload_1
/*     */       //   164: pop
/*     */       //   165: nop
/*     */       //   166: aload #5
/*     */       //   168: nop
/*     */       //   169: astore_2
/*     */       //   170: aload_0
/*     */       //   171: getfield $latestTrialLicensesToAppendToResultList$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   174: astore_3
/*     */       //   175: iconst_0
/*     */       //   176: istore #4
/*     */       //   178: aload_2
/*     */       //   179: astore #5
/*     */       //   181: aload #5
/*     */       //   183: astore #6
/*     */       //   185: iconst_0
/*     */       //   186: istore #7
/*     */       //   188: aload #6
/*     */       //   190: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult$Success
/*     */       //   193: ifeq -> 215
/*     */       //   196: aload #6
/*     */       //   198: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult$Success
/*     */       //   201: invokevirtual getLicenses : ()Ljava/util/List;
/*     */       //   204: astore #8
/*     */       //   206: iconst_0
/*     */       //   207: istore #9
/*     */       //   209: aload_3
/*     */       //   210: aload #8
/*     */       //   212: invokestatic access$aipLicenseFetchStep$lambda$11 : (Landroidx/compose/runtime/MutableState;Ljava/util/List;)V
/*     */       //   215: nop
/*     */       //   216: aload #5
/*     */       //   218: nop
/*     */       //   219: areturn
/*     */       //   220: new java/lang/IllegalStateException
/*     */       //   223: dup
/*     */       //   224: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   226: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   229: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #96	-> 3
/*     */       //   #97	-> 40
/*     */       //   #96	-> 73
/*     */       //   #100	-> 85
/*     */       //   #148	-> 93
/*     */       //   #149	-> 103
/*     */       //   #100	-> 114
/*     */       //   #96	-> 138
/*     */       //   #100	-> 164
/*     */       //   #149	-> 165
/*     */       //   #150	-> 165
/*     */       //   #148	-> 166
/*     */       //   #150	-> 168
/*     */       //   #101	-> 170
/*     */       //   #151	-> 178
/*     */       //   #152	-> 188
/*     */       //   #101	-> 209
/*     */       //   #152	-> 215
/*     */       //   #153	-> 215
/*     */       //   #151	-> 216
/*     */       //   #153	-> 218
/*     */       //   #101	-> 219
/*     */       //   #96	-> 220
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   85	15	2	$this$onAuthRequired$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;
/*     */       //   170	15	2	$this$onSuccess$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;
/*     */       //   100	11	6	$this$onAuthRequired_u24lambda_u240$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;
/*     */       //   185	21	6	$this$onSuccess_u24lambda_u241$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;
/*     */       //   206	9	8	licenses	Ljava/util/List;
/*     */       //   114	27	8	$i$a$-onAuthRequired-AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1$2	I
/*     */       //   103	38	7	$i$a$-apply-AipLicenseResultMapperKt$onAuthRequired$1$iv	I
/*     */       //   93	48	4	$i$f$onAuthRequired	I
/*     */       //   209	6	9	$i$a$-onSuccess-AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1$3	I
/*     */       //   188	28	7	$i$a$-apply-AipLicenseResultMapperKt$onSuccess$1$iv	I
/*     */       //   178	41	4	$i$f$onSuccess	I
/*     */       //   0	230	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1;
/*     */       //   40	180	1	$result	Ljava/lang/Object;
/*     */       //   150	15	8	$i$a$-onAuthRequired-AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1$2	I
/*     */       //   147	19	7	$i$a$-apply-AipLicenseResultMapperKt$onAuthRequired$1$iv	I
/*     */       //   144	25	4	$i$f$onAuthRequired	I } public final Continuation<Unit> create(Continuation<? super AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1> $completion) { return (Continuation<Unit>)new AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1(this.$productType, this.$onAuthRejected, this.$latestTrialLicensesToAppendToResultList$delegate, $completion); } public final Object invoke(Continuation<?> p1) { return ((AipLicenseFetchStepKt$aipLicenseFetchStep$trialCallable$1$1)create(p1)).invokeSuspend(Unit.INSTANCE); } } @DebugMetadata(f = "aipLicenseFetchStep.kt", l = {105, 108}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseFetchStepKt$aipLicenseFetchStep$fetchCallable$1$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\030\002\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;"}) @SourceDebugExtension({"SMAP\naipLicenseFetchStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 aipLicenseFetchStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseFetchStepKt$aipLicenseFetchStep$fetchCallable$1$1\n+ 2 AipLicenseResultMapper.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseResultMapperKt\n*L\n1#1,147:1\n23#2,3:148\n27#2,3:151\n*S KotlinDebug\n*F\n+ 1 aipLicenseFetchStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseFetchStepKt$aipLicenseFetchStep$fetchCallable$1$1\n*L\n108#1:148,3\n109#1:151,3\n*E\n"}) static final class AipLicenseFetchStepKt$aipLicenseFetchStep$fetchCallable$1$1 extends SuspendLambda implements Function1<Continuation<? super AipLicenseResult>, Object> {
/*     */     Object L$0; int label; AipLicenseFetchStepKt$aipLicenseFetchStep$fetchCallable$1$1(AipLicenseProductType $productType, Function1<Continuation<? super Unit>, Object> $onAuthRejected, MutableState<List<AipLicense>> $latestTrialLicensesToAppendToResultList$delegate, Continuation $completion) { super(1, $completion); } public final Object invokeSuspend(Object $result) { // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #10
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 220, 0 -> 36, 1 -> 76, 2 -> 141
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: new com/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseFetchStepKt$aipLicenseFetchStep$fetchCallable$1$1$1
/*     */       //   43: dup
/*     */       //   44: aload_0
/*     */       //   45: getfield $productType : Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */       //   48: aconst_null
/*     */       //   49: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;Lkotlin/coroutines/Continuation;)V
/*     */       //   52: checkcast kotlin/jvm/functions/Function2
/*     */       //   55: aload_0
/*     */       //   56: checkcast kotlin/coroutines/Continuation
/*     */       //   59: aload_0
/*     */       //   60: iconst_1
/*     */       //   61: putfield label : I
/*     */       //   64: invokestatic access$performLicenseRequestWithTimeout : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   67: dup
/*     */       //   68: aload #10
/*     */       //   70: if_acmpne -> 81
/*     */       //   73: aload #10
/*     */       //   75: areturn
/*     */       //   76: aload_1
/*     */       //   77: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   80: aload_1
/*     */       //   81: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult
/*     */       //   84: astore_2
/*     */       //   85: aload_0
/*     */       //   86: getfield $onAuthRejected : Lkotlin/jvm/functions/Function1;
/*     */       //   89: astore_3
/*     */       //   90: iconst_0
/*     */       //   91: istore #4
/*     */       //   93: aload_2
/*     */       //   94: astore #5
/*     */       //   96: aload #5
/*     */       //   98: astore #6
/*     */       //   100: iconst_0
/*     */       //   101: istore #7
/*     */       //   103: aload #6
/*     */       //   105: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$AuthRequired
/*     */       //   108: ifeq -> 165
/*     */       //   111: iconst_0
/*     */       //   112: istore #8
/*     */       //   114: aload_3
/*     */       //   115: aload_0
/*     */       //   116: aload_0
/*     */       //   117: aload #5
/*     */       //   119: putfield L$0 : Ljava/lang/Object;
/*     */       //   122: aload_0
/*     */       //   123: iconst_2
/*     */       //   124: putfield label : I
/*     */       //   127: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   132: dup
/*     */       //   133: aload #10
/*     */       //   135: if_acmpne -> 164
/*     */       //   138: aload #10
/*     */       //   140: areturn
/*     */       //   141: iconst_0
/*     */       //   142: istore #4
/*     */       //   144: iconst_0
/*     */       //   145: istore #7
/*     */       //   147: iconst_0
/*     */       //   148: istore #8
/*     */       //   150: aload_0
/*     */       //   151: getfield L$0 : Ljava/lang/Object;
/*     */       //   154: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult
/*     */       //   157: astore #5
/*     */       //   159: aload_1
/*     */       //   160: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   163: aload_1
/*     */       //   164: pop
/*     */       //   165: nop
/*     */       //   166: aload #5
/*     */       //   168: nop
/*     */       //   169: astore_2
/*     */       //   170: aload_0
/*     */       //   171: getfield $latestTrialLicensesToAppendToResultList$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   174: astore_3
/*     */       //   175: iconst_0
/*     */       //   176: istore #4
/*     */       //   178: aload_2
/*     */       //   179: astore #5
/*     */       //   181: aload #5
/*     */       //   183: astore #6
/*     */       //   185: iconst_0
/*     */       //   186: istore #7
/*     */       //   188: aload #6
/*     */       //   190: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult$Success
/*     */       //   193: ifeq -> 215
/*     */       //   196: aload #6
/*     */       //   198: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult$Success
/*     */       //   201: invokevirtual getLicenses : ()Ljava/util/List;
/*     */       //   204: pop
/*     */       //   205: iconst_0
/*     */       //   206: istore #9
/*     */       //   208: aload_3
/*     */       //   209: invokestatic emptyList : ()Ljava/util/List;
/*     */       //   212: invokestatic access$aipLicenseFetchStep$lambda$11 : (Landroidx/compose/runtime/MutableState;Ljava/util/List;)V
/*     */       //   215: nop
/*     */       //   216: aload #5
/*     */       //   218: nop
/*     */       //   219: areturn
/*     */       //   220: new java/lang/IllegalStateException
/*     */       //   223: dup
/*     */       //   224: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   226: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   229: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #104	-> 3
/*     */       //   #105	-> 40
/*     */       //   #104	-> 73
/*     */       //   #108	-> 85
/*     */       //   #148	-> 93
/*     */       //   #149	-> 103
/*     */       //   #108	-> 114
/*     */       //   #104	-> 138
/*     */       //   #108	-> 164
/*     */       //   #149	-> 165
/*     */       //   #150	-> 165
/*     */       //   #148	-> 166
/*     */       //   #150	-> 168
/*     */       //   #109	-> 170
/*     */       //   #151	-> 178
/*     */       //   #152	-> 188
/*     */       //   #109	-> 208
/*     */       //   #152	-> 215
/*     */       //   #153	-> 215
/*     */       //   #151	-> 216
/*     */       //   #153	-> 218
/*     */       //   #109	-> 219
/*     */       //   #104	-> 220
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   85	15	2	$this$onAuthRequired$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;
/*     */       //   170	15	2	$this$onSuccess$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;
/*     */       //   100	11	6	$this$onAuthRequired_u24lambda_u240$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;
/*     */       //   185	20	6	$this$onSuccess_u24lambda_u241$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;
/*     */       //   114	27	8	$i$a$-onAuthRequired-AipLicenseFetchStepKt$aipLicenseFetchStep$fetchCallable$1$1$2	I
/*     */       //   103	38	7	$i$a$-apply-AipLicenseResultMapperKt$onAuthRequired$1$iv	I
/*     */       //   93	48	4	$i$f$onAuthRequired	I
/*     */       //   208	7	9	$i$a$-onSuccess-AipLicenseFetchStepKt$aipLicenseFetchStep$fetchCallable$1$1$3	I
/*     */       //   188	28	7	$i$a$-apply-AipLicenseResultMapperKt$onSuccess$1$iv	I
/*     */       //   178	41	4	$i$f$onSuccess	I
/*     */       //   0	230	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseFetchStepKt$aipLicenseFetchStep$fetchCallable$1$1;
/*     */       //   40	180	1	$result	Ljava/lang/Object;
/*     */       //   150	15	8	$i$a$-onAuthRequired-AipLicenseFetchStepKt$aipLicenseFetchStep$fetchCallable$1$1$2	I
/*     */       //   147	19	7	$i$a$-apply-AipLicenseResultMapperKt$onAuthRequired$1$iv	I
/* 211 */       //   144	25	4	$i$f$onAuthRequired	I } public final Continuation<Unit> create(Continuation<? super AipLicenseFetchStepKt$aipLicenseFetchStep$fetchCallable$1$1> $completion) { return (Continuation<Unit>)new AipLicenseFetchStepKt$aipLicenseFetchStep$fetchCallable$1$1(this.$productType, this.$onAuthRejected, this.$latestTrialLicensesToAppendToResultList$delegate, $completion); } public final Object invoke(Continuation<?> p1) { return ((AipLicenseFetchStepKt$aipLicenseFetchStep$fetchCallable$1$1)create(p1)).invokeSuspend(Unit.INSTANCE); } } static { int $i$f$fileLogger = 0; int $i$f$currentClassLogger = 0;
/* 212 */     Class<?> clazz$iv$iv = MethodHandles.lookup().lookupClass();
/* 213 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(clazz$iv$iv), "getInstance(...)"); LOG = Logger.getInstance(clazz$iv$iv); }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "aipLicenseFetchStep.kt", l = {113, 119}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseFetchStepKt$aipLicenseFetchStep$5$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class AipLicenseFetchStepKt$aipLicenseFetchStep$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     AipLicenseFetchStepKt$aipLicenseFetchStep$5$1(ActivityCallable<AipLicenseResult, AipLicenseRequestFailure, List<AipLicense>> $fetchCallable, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #5
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 144, 0 -> 36, 1 -> 71, 2 -> 135
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: nop
/*     */       //   41: aload_0
/*     */       //   42: getfield $fetchCallable : Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityCallable;
/*     */       //   45: invokeinterface invoke : ()Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle;
/*     */       //   50: aload_0
/*     */       //   51: checkcast kotlin/coroutines/Continuation
/*     */       //   54: aload_0
/*     */       //   55: iconst_1
/*     */       //   56: putfield label : I
/*     */       //   59: invokevirtual awaitOpResult : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   62: dup
/*     */       //   63: aload #5
/*     */       //   65: if_acmpne -> 76
/*     */       //   68: aload #5
/*     */       //   70: areturn
/*     */       //   71: aload_1
/*     */       //   72: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   75: aload_1
/*     */       //   76: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult
/*     */       //   79: astore_2
/*     */       //   80: aload_2
/*     */       //   81: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpSucceeded
/*     */       //   84: ifeq -> 101
/*     */       //   87: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*     */       //   90: pop
/*     */       //   91: iconst_1
/*     */       //   92: getstatic kotlin/time/DurationUnit.DAYS : Lkotlin/time/DurationUnit;
/*     */       //   95: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*     */       //   98: goto -> 112
/*     */       //   101: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*     */       //   104: pop
/*     */       //   105: iconst_2
/*     */       //   106: getstatic kotlin/time/DurationUnit.MINUTES : Lkotlin/time/DurationUnit;
/*     */       //   109: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*     */       //   112: lstore_3
/*     */       //   113: lload_3
/*     */       //   114: aload_0
/*     */       //   115: checkcast kotlin/coroutines/Continuation
/*     */       //   118: aload_0
/*     */       //   119: iconst_2
/*     */       //   120: putfield label : I
/*     */       //   123: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   126: dup
/*     */       //   127: aload #5
/*     */       //   129: if_acmpne -> 140
/*     */       //   132: aload #5
/*     */       //   134: areturn
/*     */       //   135: aload_1
/*     */       //   136: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   139: aload_1
/*     */       //   140: pop
/*     */       //   141: goto -> 40
/*     */       //   144: new java/lang/IllegalStateException
/*     */       //   147: dup
/*     */       //   148: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   150: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   153: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #111	-> 3
/*     */       //   #112	-> 40
/*     */       //   #113	-> 41
/*     */       //   #111	-> 68
/*     */       //   #115	-> 80
/*     */       //   #116	-> 81
/*     */       //   #117	-> 101
/*     */       //   #115	-> 112
/*     */       //   #119	-> 113
/*     */       //   #111	-> 132
/*     */       //   #119	-> 140
/*     */       //   #111	-> 144
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   80	1	2	result	Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
/*     */       //   113	13	3	delayUntilUpdate	J
/*     */       //   0	154	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseFetchStepKt$aipLicenseFetchStep$5$1;
/*     */       //   40	104	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AipLicenseFetchStepKt$aipLicenseFetchStep$5$1> $completion) {
/*     */       return (Continuation<Unit>)new AipLicenseFetchStepKt$aipLicenseFetchStep$5$1(this.$fetchCallable, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((AipLicenseFetchStepKt$aipLicenseFetchStep$5$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Object performLicenseRequestWithTimeout(Function2<? super JunieAipLicenseRepository, ? super Continuation<? super AipLicenseResult>, ? extends Object> block, Continuation $completion) {
/*     */     return TimeoutKt.withTimeout-KLykuaI(DurationKt.toDuration(20, DurationUnit.SECONDS), new AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2(block, null), $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "aipLicenseFetchStep.kt", l = {140, 141}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AipLicenseResult>, Object> {
/*     */     int label;
/*     */     
/*     */     AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2(Function2<JunieAipLicenseRepository, Continuation<? super AipLicenseResult>, Object> $block, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object1;
/*     */       Function2<JunieAipLicenseRepository, Continuation<? super AipLicenseResult>, Object> function2;
/*     */       JunieAipLicenseRepository $this$invokeSuspend_u24lambda_u240;
/*     */       int $i$a$-with-AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2$1;
/*     */       Object object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (JunieAipLicenseRepository.Companion.instance((Continuation)this) == object2)
/*     */             return object2; 
/*     */           object1 = JunieAipLicenseRepository.Companion.instance((Continuation)this);
/*     */           function2 = this.$block;
/*     */           $this$invokeSuspend_u24lambda_u240 = (JunieAipLicenseRepository)object1;
/*     */           $i$a$-with-AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2$1 = 0;
/*     */           this.label = 2;
/*     */           if (function2.invoke($this$invokeSuspend_u24lambda_u240, this) == object2)
/*     */             return object2; 
/*     */           return function2.invoke($this$invokeSuspend_u24lambda_u240, this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           object1 = SYNTHETIC_LOCAL_VARIABLE_1;
/*     */           function2 = this.$block;
/*     */           $this$invokeSuspend_u24lambda_u240 = (JunieAipLicenseRepository)object1;
/*     */           $i$a$-with-AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2$1 = 0;
/*     */           this.label = 2;
/*     */           if (function2.invoke($this$invokeSuspend_u24lambda_u240, this) == object2)
/*     */             return object2; 
/*     */           return function2.invoke($this$invokeSuspend_u24lambda_u240, this);
/*     */         case 2:
/*     */           $i$a$-with-AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2$1 = 0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2> $completion) {
/*     */       return (Continuation<Unit>)new AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2(this.$block, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AipLicenseFetchStepKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */