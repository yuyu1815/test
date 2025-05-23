/*     */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.JbaAuthData;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AipLicenseJourney;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import java.lang.invoke.MethodHandles;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000.\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\013\0323\020\000\032\0020\0012\006\020\002\032\0020\0032\034\020\004\032\030\b\001\022\n\022\b\022\004\022\0020\0070\006\022\006\022\004\030\0010\b0\005H\001¢\006\002\020\t\"\016\020\n\032\0020\013X\004¢\006\002\n\000¨\006\f²\006\n\020\r\032\0020\016X\002"}, d2 = {"aipLicenseJourney", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseJourney;", "jbaAuthData", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;", "onAuthRejected", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseJourney;", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "state.junie.impl", "licenseAgreementAutoAccept", ""})
/*     */ @SourceDebugExtension({"SMAP\naipLicenseJourney.kt\nKotlin\n*S Kotlin\n*F\n+ 1 aipLicenseJourney.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseJourneyKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 outcome.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/util/OutcomeKt\n+ 4 Outcome.kt\ncom/intellij/ml/llm/matterhorn/activation/state/model/Outcome\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,73:1\n1225#2,6:74\n1225#2,6:80\n1225#2,6:86\n30#3:92\n21#3:93\n22#3:97\n30#3:98\n21#3:99\n22#3:103\n30#3:104\n21#3:105\n22#3:109\n30#3:110\n21#3:111\n22#3:115\n16#4,3:94\n16#4,3:100\n16#4,3:106\n16#4,3:112\n81#5:116\n107#5,2:117\n58#6:119\n36#6,2:120\n*S KotlinDebug\n*F\n+ 1 aipLicenseJourney.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseJourneyKt\n*L\n27#1:74,6\n29#1:80,6\n36#1:86,6\n40#1:92\n40#1:93\n40#1:97\n49#1:98\n49#1:99\n49#1:103\n56#1:104\n56#1:105\n56#1:109\n61#1:110\n61#1:111\n61#1:115\n40#1:94,3\n49#1:100,3\n56#1:106,3\n61#1:112,3\n29#1:116\n29#1:117,2\n72#1:119\n72#1:120,2\n*E\n"})
/*     */ public final class AipLicenseJourneyKt {
/*     */   @NotNull
/*     */   private static final Logger LOG;
/*     */   
/*  27 */   private static final String aipLicenseJourney$lambda$1$lambda$0() { return "AI Pro license"; }
/*     */   @Composable @NotNull
/*     */   public static final AipLicenseJourney aipLicenseJourney(@NotNull JbaAuthData jbaAuthData, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> onAuthRejected, @Nullable Composer $composer, int $changed) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'jbaAuthData'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'onAuthRejected'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: ldc -2045864886
/*     */     //   15: invokeinterface startReplaceGroup : (I)V
/*     */     //   20: invokestatic isTraceInProgress : ()Z
/*     */     //   23: ifeq -> 35
/*     */     //   26: ldc -2045864886
/*     */     //   28: iload_3
/*     */     //   29: iconst_m1
/*     */     //   30: ldc 'com.intellij.ml.llm.matterhorn.activation.state.junie.aipLicenseJourney (aipLicenseJourney.kt:25)'
/*     */     //   32: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   35: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseJourneyKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   38: aload_2
/*     */     //   39: ldc -2092033701
/*     */     //   41: invokeinterface startReplaceGroup : (I)V
/*     */     //   46: aload_2
/*     */     //   47: astore #5
/*     */     //   49: iconst_0
/*     */     //   50: istore #6
/*     */     //   52: iconst_0
/*     */     //   53: istore #7
/*     */     //   55: aload #5
/*     */     //   57: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   62: astore #8
/*     */     //   64: iconst_0
/*     */     //   65: istore #9
/*     */     //   67: aload #8
/*     */     //   69: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   72: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   75: if_acmpne -> 107
/*     */     //   78: astore #24
/*     */     //   80: iconst_0
/*     */     //   81: istore #10
/*     */     //   83: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*     */     //   88: aload #24
/*     */     //   90: swap
/*     */     //   91: astore #10
/*     */     //   93: aload #5
/*     */     //   95: aload #10
/*     */     //   97: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   102: aload #10
/*     */     //   104: goto -> 109
/*     */     //   107: aload #8
/*     */     //   109: nop
/*     */     //   110: nop
/*     */     //   111: nop
/*     */     //   112: checkcast kotlin/jvm/functions/Function0
/*     */     //   115: astore #4
/*     */     //   117: aload_2
/*     */     //   118: invokeinterface endReplaceGroup : ()V
/*     */     //   123: aload #4
/*     */     //   125: aload_2
/*     */     //   126: bipush #48
/*     */     //   128: invokestatic TraceComposition : (Lcom/intellij/openapi/diagnostic/Logger;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */     //   131: aload_2
/*     */     //   132: ldc -2092031812
/*     */     //   134: invokeinterface startReplaceGroup : (I)V
/*     */     //   139: aload_2
/*     */     //   140: astore #6
/*     */     //   142: aload_2
/*     */     //   143: aload_0
/*     */     //   144: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   149: istore #7
/*     */     //   151: iconst_0
/*     */     //   152: istore #8
/*     */     //   154: aload #6
/*     */     //   156: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   161: astore #9
/*     */     //   163: iconst_0
/*     */     //   164: istore #10
/*     */     //   166: iload #7
/*     */     //   168: ifne -> 182
/*     */     //   171: aload #9
/*     */     //   173: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   176: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   179: if_acmpne -> 211
/*     */     //   182: iconst_0
/*     */     //   183: istore #11
/*     */     //   185: iconst_0
/*     */     //   186: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   189: aconst_null
/*     */     //   190: iconst_2
/*     */     //   191: aconst_null
/*     */     //   192: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   195: astore #11
/*     */     //   197: aload #6
/*     */     //   199: aload #11
/*     */     //   201: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   206: aload #11
/*     */     //   208: goto -> 213
/*     */     //   211: aload #9
/*     */     //   213: nop
/*     */     //   214: nop
/*     */     //   215: nop
/*     */     //   216: checkcast androidx/compose/runtime/MutableState
/*     */     //   219: astore #5
/*     */     //   221: aload_2
/*     */     //   222: invokeinterface endReplaceGroup : ()V
/*     */     //   227: aload #5
/*     */     //   229: astore #4
/*     */     //   231: aload_0
/*     */     //   232: aload_1
/*     */     //   233: aload_2
/*     */     //   234: ldc -2092025290
/*     */     //   236: invokeinterface startReplaceGroup : (I)V
/*     */     //   241: aload_2
/*     */     //   242: astore #7
/*     */     //   244: aload_2
/*     */     //   245: aload #4
/*     */     //   247: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   252: istore #8
/*     */     //   254: nop
/*     */     //   255: iconst_0
/*     */     //   256: istore #9
/*     */     //   258: aload #7
/*     */     //   260: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   265: astore #10
/*     */     //   267: iconst_0
/*     */     //   268: istore #11
/*     */     //   270: iload #8
/*     */     //   272: ifne -> 286
/*     */     //   275: aload #10
/*     */     //   277: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   280: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   283: if_acmpne -> 324
/*     */     //   286: astore #25
/*     */     //   288: astore #24
/*     */     //   290: iconst_0
/*     */     //   291: istore #12
/*     */     //   293: aload #4
/*     */     //   295: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*     */     //   300: astore #26
/*     */     //   302: aload #24
/*     */     //   304: aload #25
/*     */     //   306: aload #26
/*     */     //   308: astore #13
/*     */     //   310: aload #7
/*     */     //   312: aload #13
/*     */     //   314: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   319: aload #13
/*     */     //   321: goto -> 326
/*     */     //   324: aload #10
/*     */     //   326: nop
/*     */     //   327: nop
/*     */     //   328: nop
/*     */     //   329: checkcast kotlin/jvm/functions/Function0
/*     */     //   332: astore #6
/*     */     //   334: aload_2
/*     */     //   335: invokeinterface endReplaceGroup : ()V
/*     */     //   340: aload #6
/*     */     //   342: aload_2
/*     */     //   343: bipush #14
/*     */     //   345: iload_3
/*     */     //   346: iand
/*     */     //   347: bipush #112
/*     */     //   349: iload_3
/*     */     //   350: iand
/*     */     //   351: ior
/*     */     //   352: invokestatic aipLicenseFetchStep : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;
/*     */     //   355: astore #5
/*     */     //   357: aload #5
/*     */     //   359: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/Journey
/*     */     //   362: astore #7
/*     */     //   364: iconst_0
/*     */     //   365: istore #8
/*     */     //   367: aload #7
/*     */     //   369: invokeinterface getOutcome-07x5Wys : ()Ljava/lang/Object;
/*     */     //   374: astore #9
/*     */     //   376: iconst_0
/*     */     //   377: istore #10
/*     */     //   379: iconst_0
/*     */     //   380: istore #11
/*     */     //   382: aload #9
/*     */     //   384: invokestatic isIncomplete-impl : (Ljava/lang/Object;)Z
/*     */     //   387: istore #12
/*     */     //   389: iload #12
/*     */     //   391: iconst_1
/*     */     //   392: if_icmpne -> 451
/*     */     //   395: aload #9
/*     */     //   397: invokestatic incompleteOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   400: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchPending
/*     */     //   403: astore #13
/*     */     //   405: iconst_0
/*     */     //   406: istore #14
/*     */     //   408: new com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseJourney
/*     */     //   411: dup
/*     */     //   412: aload #5
/*     */     //   414: aconst_null
/*     */     //   415: aconst_null
/*     */     //   416: aconst_null
/*     */     //   417: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/Outcome.Companion : Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome$Companion;
/*     */     //   420: aload #13
/*     */     //   422: invokevirtual ofIncomplete-l12Rbqo : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   425: bipush #14
/*     */     //   427: aconst_null
/*     */     //   428: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   431: astore #15
/*     */     //   433: invokestatic isTraceInProgress : ()Z
/*     */     //   436: ifeq -> 442
/*     */     //   439: invokestatic traceEventEnd : ()V
/*     */     //   442: aload_2
/*     */     //   443: invokeinterface endReplaceGroup : ()V
/*     */     //   448: aload #15
/*     */     //   450: areturn
/*     */     //   451: iload #12
/*     */     //   453: ifne -> 471
/*     */     //   456: aload #9
/*     */     //   458: invokestatic getOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   461: astore #16
/*     */     //   463: iconst_0
/*     */     //   464: istore #17
/*     */     //   466: aload #16
/*     */     //   468: goto -> 479
/*     */     //   471: new kotlin/NoWhenBranchMatchedException
/*     */     //   474: dup
/*     */     //   475: invokespecial <init> : ()V
/*     */     //   478: athrow
/*     */     //   479: nop
/*     */     //   480: nop
/*     */     //   481: checkcast java/util/List
/*     */     //   484: astore #6
/*     */     //   486: aload #6
/*     */     //   488: invokeinterface isEmpty : ()Z
/*     */     //   493: ifeq -> 540
/*     */     //   496: new com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseJourney
/*     */     //   499: dup
/*     */     //   500: aload #5
/*     */     //   502: aconst_null
/*     */     //   503: aconst_null
/*     */     //   504: aconst_null
/*     */     //   505: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/AipLicensePending$AipLicenseListEmpty.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicensePending$AipLicenseListEmpty;
/*     */     //   508: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked
/*     */     //   511: invokestatic activationRoadblocked : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked;)Ljava/lang/Object;
/*     */     //   514: bipush #14
/*     */     //   516: aconst_null
/*     */     //   517: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   520: astore #7
/*     */     //   522: invokestatic isTraceInProgress : ()Z
/*     */     //   525: ifeq -> 531
/*     */     //   528: invokestatic traceEventEnd : ()V
/*     */     //   531: aload_2
/*     */     //   532: invokeinterface endReplaceGroup : ()V
/*     */     //   537: aload #7
/*     */     //   539: areturn
/*     */     //   540: aload #6
/*     */     //   542: aload_2
/*     */     //   543: iconst_0
/*     */     //   544: invokestatic aipLicenseChoiceStep : (Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceStep;
/*     */     //   547: astore #7
/*     */     //   549: aload #7
/*     */     //   551: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/Journey
/*     */     //   554: astore #9
/*     */     //   556: iconst_0
/*     */     //   557: istore #10
/*     */     //   559: aload #9
/*     */     //   561: invokeinterface getOutcome-07x5Wys : ()Ljava/lang/Object;
/*     */     //   566: astore #11
/*     */     //   568: iconst_0
/*     */     //   569: istore #12
/*     */     //   571: iconst_0
/*     */     //   572: istore #13
/*     */     //   574: aload #11
/*     */     //   576: invokestatic isIncomplete-impl : (Ljava/lang/Object;)Z
/*     */     //   579: istore #14
/*     */     //   581: iload #14
/*     */     //   583: iconst_1
/*     */     //   584: if_icmpne -> 618
/*     */     //   587: aload #11
/*     */     //   589: invokestatic incompleteOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   592: checkcast java/lang/Void
/*     */     //   595: astore #15
/*     */     //   597: iconst_0
/*     */     //   598: istore #16
/*     */     //   600: new java/lang/IllegalStateException
/*     */     //   603: dup
/*     */     //   604: aload #7
/*     */     //   606: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceStep;)Ljava/lang/String;
/*     */     //   611: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   614: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   617: athrow
/*     */     //   618: iload #14
/*     */     //   620: ifne -> 638
/*     */     //   623: aload #11
/*     */     //   625: invokestatic getOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   628: astore #17
/*     */     //   630: iconst_0
/*     */     //   631: istore #18
/*     */     //   633: aload #17
/*     */     //   635: goto -> 646
/*     */     //   638: new kotlin/NoWhenBranchMatchedException
/*     */     //   641: dup
/*     */     //   642: invokespecial <init> : ()V
/*     */     //   645: athrow
/*     */     //   646: nop
/*     */     //   647: nop
/*     */     //   648: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceReady
/*     */     //   651: astore #8
/*     */     //   653: aload #8
/*     */     //   655: invokevirtual getActiveLicense : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;
/*     */     //   658: astore #9
/*     */     //   660: aload_2
/*     */     //   661: iconst_0
/*     */     //   662: invokestatic aipLicenseAgreementLoadStep : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadStep;
/*     */     //   665: astore #10
/*     */     //   667: aload #10
/*     */     //   669: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/Journey
/*     */     //   672: astore #12
/*     */     //   674: iconst_0
/*     */     //   675: istore #13
/*     */     //   677: aload #12
/*     */     //   679: invokeinterface getOutcome-07x5Wys : ()Ljava/lang/Object;
/*     */     //   684: astore #14
/*     */     //   686: iconst_0
/*     */     //   687: istore #15
/*     */     //   689: iconst_0
/*     */     //   690: istore #16
/*     */     //   692: aload #14
/*     */     //   694: invokestatic isIncomplete-impl : (Ljava/lang/Object;)Z
/*     */     //   697: istore #17
/*     */     //   699: iload #17
/*     */     //   701: iconst_1
/*     */     //   702: if_icmpne -> 763
/*     */     //   705: aload #14
/*     */     //   707: invokestatic incompleteOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   710: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadPending
/*     */     //   713: astore #18
/*     */     //   715: iconst_0
/*     */     //   716: istore #19
/*     */     //   718: new com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseJourney
/*     */     //   721: dup
/*     */     //   722: aload #5
/*     */     //   724: aload #7
/*     */     //   726: aload #10
/*     */     //   728: aconst_null
/*     */     //   729: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/Outcome.Companion : Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome$Companion;
/*     */     //   732: aload #18
/*     */     //   734: invokevirtual ofIncomplete-l12Rbqo : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   737: bipush #8
/*     */     //   739: aconst_null
/*     */     //   740: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   743: astore #20
/*     */     //   745: invokestatic isTraceInProgress : ()Z
/*     */     //   748: ifeq -> 754
/*     */     //   751: invokestatic traceEventEnd : ()V
/*     */     //   754: aload_2
/*     */     //   755: invokeinterface endReplaceGroup : ()V
/*     */     //   760: aload #20
/*     */     //   762: areturn
/*     */     //   763: iload #17
/*     */     //   765: ifne -> 783
/*     */     //   768: aload #14
/*     */     //   770: invokestatic getOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   773: astore #21
/*     */     //   775: iconst_0
/*     */     //   776: istore #22
/*     */     //   778: aload #21
/*     */     //   780: goto -> 791
/*     */     //   783: new kotlin/NoWhenBranchMatchedException
/*     */     //   786: dup
/*     */     //   787: invokespecial <init> : ()V
/*     */     //   790: athrow
/*     */     //   791: nop
/*     */     //   792: nop
/*     */     //   793: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement
/*     */     //   796: astore #11
/*     */     //   798: aload #11
/*     */     //   800: aload #9
/*     */     //   802: aload #4
/*     */     //   804: invokestatic aipLicenseJourney$lambda$3 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   807: aload_2
/*     */     //   808: iconst_0
/*     */     //   809: invokestatic aipLicenseAgreementAcceptStep : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;ZLandroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;
/*     */     //   812: astore #12
/*     */     //   814: aload #12
/*     */     //   816: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/Journey
/*     */     //   819: astore #13
/*     */     //   821: iconst_0
/*     */     //   822: istore #14
/*     */     //   824: aload #13
/*     */     //   826: invokeinterface getOutcome-07x5Wys : ()Ljava/lang/Object;
/*     */     //   831: astore #15
/*     */     //   833: iconst_0
/*     */     //   834: istore #16
/*     */     //   836: iconst_0
/*     */     //   837: istore #17
/*     */     //   839: aload #15
/*     */     //   841: invokestatic isIncomplete-impl : (Ljava/lang/Object;)Z
/*     */     //   844: istore #18
/*     */     //   846: iload #18
/*     */     //   848: iconst_1
/*     */     //   849: if_icmpne -> 909
/*     */     //   852: aload #15
/*     */     //   854: invokestatic incompleteOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   857: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptPending
/*     */     //   860: astore #19
/*     */     //   862: iconst_0
/*     */     //   863: istore #20
/*     */     //   865: new com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseJourney
/*     */     //   868: dup
/*     */     //   869: aload #5
/*     */     //   871: aload #7
/*     */     //   873: aload #10
/*     */     //   875: aload #12
/*     */     //   877: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/Outcome.Companion : Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome$Companion;
/*     */     //   880: aload #19
/*     */     //   882: invokevirtual ofIncomplete-l12Rbqo : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   885: aconst_null
/*     */     //   886: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   889: astore #21
/*     */     //   891: invokestatic isTraceInProgress : ()Z
/*     */     //   894: ifeq -> 900
/*     */     //   897: invokestatic traceEventEnd : ()V
/*     */     //   900: aload_2
/*     */     //   901: invokeinterface endReplaceGroup : ()V
/*     */     //   906: aload #21
/*     */     //   908: areturn
/*     */     //   909: iload #18
/*     */     //   911: ifne -> 928
/*     */     //   914: aload #15
/*     */     //   916: invokestatic getOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   919: astore #22
/*     */     //   921: iconst_0
/*     */     //   922: istore #23
/*     */     //   924: nop
/*     */     //   925: goto -> 936
/*     */     //   928: new kotlin/NoWhenBranchMatchedException
/*     */     //   931: dup
/*     */     //   932: invokespecial <init> : ()V
/*     */     //   935: athrow
/*     */     //   936: nop
/*     */     //   937: nop
/*     */     //   938: invokestatic getLog : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   941: aload #9
/*     */     //   943: invokevirtual getLicenseId-EIc-D0M : ()Ljava/lang/String;
/*     */     //   946: invokestatic toString-impl : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   949: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   954: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   957: new com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseJourney
/*     */     //   960: dup
/*     */     //   961: aload #5
/*     */     //   963: aload #7
/*     */     //   965: aload #10
/*     */     //   967: aload #12
/*     */     //   969: aload #9
/*     */     //   971: invokestatic done : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   974: aconst_null
/*     */     //   975: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   978: astore #13
/*     */     //   980: invokestatic isTraceInProgress : ()Z
/*     */     //   983: ifeq -> 989
/*     */     //   986: invokestatic traceEventEnd : ()V
/*     */     //   989: aload_2
/*     */     //   990: invokeinterface endReplaceGroup : ()V
/*     */     //   995: aload #13
/*     */     //   997: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #26	-> 32
/*     */     //   #27	-> 35
/*     */     //   #74	-> 55
/*     */     //   #75	-> 67
/*     */     //   #76	-> 78
/*     */     //   #76	-> 91
/*     */     //   #77	-> 93
/*     */     //   #78	-> 102
/*     */     //   #79	-> 107
/*     */     //   #75	-> 109
/*     */     //   #74	-> 110
/*     */     //   #74	-> 111
/*     */     //   #27	-> 112
/*     */     //   #29	-> 143
/*     */     //   #80	-> 154
/*     */     //   #81	-> 166
/*     */     //   #82	-> 182
/*     */     //   #30	-> 185
/*     */     //   #82	-> 195
/*     */     //   #83	-> 197
/*     */     //   #84	-> 206
/*     */     //   #85	-> 211
/*     */     //   #81	-> 213
/*     */     //   #80	-> 214
/*     */     //   #80	-> 215
/*     */     //   #29	-> 216
/*     */     //   #34	-> 231
/*     */     //   #35	-> 232
/*     */     //   #36	-> 254
/*     */     //   #86	-> 258
/*     */     //   #87	-> 270
/*     */     //   #88	-> 286
/*     */     //   #36	-> 293
/*     */     //   #88	-> 308
/*     */     //   #89	-> 310
/*     */     //   #90	-> 319
/*     */     //   #91	-> 324
/*     */     //   #87	-> 326
/*     */     //   #86	-> 327
/*     */     //   #86	-> 328
/*     */     //   #36	-> 329
/*     */     //   #33	-> 352
/*     */     //   #40	-> 357
/*     */     //   #92	-> 367
/*     */     //   #93	-> 379
/*     */     //   #94	-> 382
/*     */     //   #95	-> 389
/*     */     //   #41	-> 408
/*     */     //   #96	-> 451
/*     */     //   #97	-> 466
/*     */     //   #96	-> 468
/*     */     //   #94	-> 471
/*     */     //   #93	-> 479
/*     */     //   #92	-> 480
/*     */     //   #40	-> 481
/*     */     //   #44	-> 486
/*     */     //   #45	-> 496
/*     */     //   #48	-> 540
/*     */     //   #49	-> 549
/*     */     //   #98	-> 559
/*     */     //   #99	-> 571
/*     */     //   #100	-> 574
/*     */     //   #101	-> 581
/*     */     //   #50	-> 604
/*     */     //   #102	-> 618
/*     */     //   #103	-> 633
/*     */     //   #102	-> 635
/*     */     //   #100	-> 638
/*     */     //   #99	-> 646
/*     */     //   #98	-> 647
/*     */     //   #49	-> 648
/*     */     //   #53	-> 653
/*     */     //   #55	-> 662
/*     */     //   #56	-> 667
/*     */     //   #104	-> 677
/*     */     //   #105	-> 689
/*     */     //   #106	-> 692
/*     */     //   #107	-> 699
/*     */     //   #57	-> 718
/*     */     //   #108	-> 763
/*     */     //   #109	-> 778
/*     */     //   #108	-> 780
/*     */     //   #106	-> 783
/*     */     //   #105	-> 791
/*     */     //   #104	-> 792
/*     */     //   #56	-> 793
/*     */     //   #60	-> 798
/*     */     //   #61	-> 814
/*     */     //   #110	-> 824
/*     */     //   #111	-> 836
/*     */     //   #112	-> 839
/*     */     //   #113	-> 846
/*     */     //   #62	-> 865
/*     */     //   #63	-> 877
/*     */     //   #62	-> 886
/*     */     //   #114	-> 909
/*     */     //   #115	-> 924
/*     */     //   #114	-> 925
/*     */     //   #112	-> 928
/*     */     //   #111	-> 936
/*     */     //   #110	-> 937
/*     */     //   #66	-> 938
/*     */     //   #68	-> 957
/*     */     //   #69	-> 969
/*     */     //   #68	-> 975
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   83	5	10	$i$a$-cache-AipLicenseJourneyKt$aipLicenseJourney$1	I
/*     */     //   93	11	10	value$iv	Ljava/lang/Object;
/*     */     //   67	43	9	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   64	46	8	it$iv	Ljava/lang/Object;
/*     */     //   55	57	7	$i$f$cache	I
/*     */     //   52	60	5	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   52	60	6	invalid$iv	Z
/*     */     //   185	10	11	$i$a$-cache-AipLicenseJourneyKt$aipLicenseJourney$licenseAgreementAutoAccept$2	I
/*     */     //   197	11	11	value$iv	Ljava/lang/Object;
/*     */     //   166	48	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   163	51	9	it$iv	Ljava/lang/Object;
/*     */     //   154	62	8	$i$f$cache	I
/*     */     //   151	65	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   151	65	7	invalid$iv	Z
/*     */     //   293	7	12	$i$a$-cache-AipLicenseJourneyKt$aipLicenseJourney$licenseFetchStep$1	I
/*     */     //   310	11	13	value$iv	Ljava/lang/Object;
/*     */     //   270	57	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   267	60	10	it$iv	Ljava/lang/Object;
/*     */     //   258	71	9	$i$f$cache	I
/*     */     //   255	74	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   255	74	8	invalid$iv	Z
/*     */     //   408	43	14	$i$a$-completeOrElse-AipLicenseJourneyKt$aipLicenseJourney$availableLicenses$1	I
/*     */     //   405	46	13	licenseFetchPending	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchPending;
/*     */     //   466	2	17	$i$a$-fold-impl-OutcomeKt$getOrElse$1$iv$iv	I
/*     */     //   463	5	16	it$iv$iv	Ljava/lang/Object;
/*     */     //   382	97	11	$i$f$fold-impl	I
/*     */     //   379	101	10	$i$f$getOrElse-G1CwGJM	I
/*     */     //   376	104	9	$this$getOrElse_u2dG1CwGJM$iv$iv	Ljava/lang/Object;
/*     */     //   367	114	8	$i$f$completeOrElse	I
/*     */     //   364	117	7	$this$completeOrElse$iv	Lcom/intellij/ml/llm/matterhorn/activation/state/model/Journey;
/*     */     //   600	18	16	$i$a$-completeOrElse-AipLicenseJourneyKt$aipLicenseJourney$licenseChoiceReady$1	I
/*     */     //   597	21	15	it	Ljava/lang/Void;
/*     */     //   633	2	18	$i$a$-fold-impl-OutcomeKt$getOrElse$1$iv$iv	I
/*     */     //   630	5	17	it$iv$iv	Ljava/lang/Object;
/*     */     //   574	72	13	$i$f$fold-impl	I
/*     */     //   571	76	12	$i$f$getOrElse-G1CwGJM	I
/*     */     //   568	79	11	$this$getOrElse_u2dG1CwGJM$iv$iv	Ljava/lang/Object;
/*     */     //   559	89	10	$i$f$completeOrElse	I
/*     */     //   556	92	9	$this$completeOrElse$iv	Lcom/intellij/ml/llm/matterhorn/activation/state/model/Journey;
/*     */     //   718	45	19	$i$a$-completeOrElse-AipLicenseJourneyKt$aipLicenseJourney$agreement$1	I
/*     */     //   715	48	18	agreementLoadPending	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadPending;
/*     */     //   778	2	22	$i$a$-fold-impl-OutcomeKt$getOrElse$1$iv$iv	I
/*     */     //   775	5	21	it$iv$iv	Ljava/lang/Object;
/*     */     //   692	99	16	$i$f$fold-impl	I
/*     */     //   689	103	15	$i$f$getOrElse-G1CwGJM	I
/*     */     //   686	106	14	$this$getOrElse_u2dG1CwGJM$iv$iv	Ljava/lang/Object;
/*     */     //   677	116	13	$i$f$completeOrElse	I
/*     */     //   674	119	12	$this$completeOrElse$iv	Lcom/intellij/ml/llm/matterhorn/activation/state/model/Journey;
/*     */     //   865	44	20	$i$a$-completeOrElse-AipLicenseJourneyKt$aipLicenseJourney$2	I
/*     */     //   862	47	19	agreementAcceptPending	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptPending;
/*     */     //   924	1	23	$i$a$-fold-impl-OutcomeKt$getOrElse$1$iv$iv	I
/*     */     //   921	4	22	it$iv$iv	Ljava/lang/Object;
/*     */     //   839	97	17	$i$f$fold-impl	I
/*     */     //   836	101	16	$i$f$getOrElse-G1CwGJM	I
/*     */     //   833	104	15	$this$getOrElse_u2dG1CwGJM$iv$iv	Ljava/lang/Object;
/*     */     //   824	114	14	$i$f$completeOrElse	I
/*     */     //   821	117	13	$this$completeOrElse$iv	Lcom/intellij/ml/llm/matterhorn/activation/state/model/Journey;
/*     */     //   231	767	4	licenseAgreementAutoAccept$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   357	641	5	licenseFetchStep	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseFetchStep;
/*     */     //   486	512	6	availableLicenses	Ljava/util/List;
/*     */     //   549	449	7	licenseChoiceStep	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceStep;
/*     */     //   653	345	8	licenseChoiceReady	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceReady;
/*     */     //   660	338	9	activeLicense	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;
/*     */     //   667	331	10	agreementLoadStep	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementLoadStep;
/*     */     //   798	200	11	agreement	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;
/*     */     //   814	184	12	agreementAcceptStep	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseAgreementAcceptStep;
/*     */     //   0	998	0	jbaAuthData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;
/*     */     //   0	998	1	onAuthRejected	Lkotlin/jvm/functions/Function1;
/*     */     //   0	998	2	$composer	Landroidx/compose/runtime/Composer;
/*  29 */     //   0	998	3	$changed	I } private static final boolean aipLicenseJourney$lambda$3(MutableState $licenseAgreementAutoAccept$delegate) { State state = (State)$licenseAgreementAutoAccept$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
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
/* 116 */       (Boolean)state.getValue()).booleanValue(); } private static final void aipLicenseJourney$lambda$4(MutableState $licenseAgreementAutoAccept$delegate, boolean <set-?>) { MutableState mutableState = $licenseAgreementAutoAccept$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 117 */     mutableState.setValue(value$iv); } static {
/*     */     int $i$f$fileLogger = 0;
/* 119 */     int $i$f$currentClassLogger = 0;
/* 120 */     Class<?> clazz$iv$iv = MethodHandles.lookup().lookupClass();
/* 121 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(clazz$iv$iv), "getInstance(...)"); LOG = Logger.getInstance(clazz$iv$iv);
/*     */   }
/*     */   
/*     */   private static final Unit aipLicenseJourney$lambda$6$lambda$5(MutableState<Boolean> $licenseAgreementAutoAccept$delegate) {
/*     */     aipLicenseJourney$lambda$4($licenseAgreementAutoAccept$delegate, true);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AipLicenseJourneyKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */