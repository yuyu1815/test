/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.runtime.State;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.reflect.KProperty;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\013\032\027\020\000\032\0020\0012\b\b\002\020\002\032\0020\003H\001¢\006\002\020\004\"\016\020\005\032\0020\006X\004¢\006\002\n\000¨\006\007²\006\n\020\b\032\0020\tX\002"}, d2 = {"jbaAuthStep", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthStep;", "jbaUserStore", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/JbaUserStore;", "(Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/JbaUserStore;Landroidx/compose/runtime/Composer;II)Lcom/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthStep;", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "state.junie.impl", "isAuthRejected", ""})
/*    */ @SourceDebugExtension({"SMAP\njbaAuthStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 jbaAuthStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/JbaAuthStepKt\n+ 2 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStoreKt\n+ 3 service.kt\ncom/intellij/openapi/components/ServiceKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 loggingCompose.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/util/LoggingComposeKt\n+ 6 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,41:1\n47#2:42\n40#3,3:43\n1225#4,6:46\n1225#4,6:52\n1225#4,6:67\n1225#4,6:82\n1225#4,6:88\n17#5:58\n42#5,2:59\n44#5:66\n17#5:73\n42#5,2:74\n44#5:81\n61#6,5:61\n61#6,5:76\n58#6:97\n36#6,2:98\n81#7:94\n107#7,2:95\n*S KotlinDebug\n*F\n+ 1 jbaAuthStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/JbaAuthStepKt\n*L\n20#1:42\n20#1:43,3\n21#1:46,6\n29#1:52,6\n31#1:67,6\n35#1:82,6\n36#1:88,6\n31#1:58\n31#1:59,2\n31#1:66\n35#1:73\n35#1:74,2\n35#1:81\n31#1:61,5\n35#1:76,5\n40#1:97\n40#1:98,2\n29#1:94\n29#1:95,2\n*E\n"})
/*    */ public final class JbaAuthStepKt {
/*    */   @NotNull
/*    */   private static final Logger LOG;
/*    */   
/*    */   private static final String jbaAuthStep$lambda$1$lambda$0() {
/* 21 */     return "JBA auth";
/*    */   }
/*    */   @Composable
/*    */   @NotNull
/*    */   public static final JbaAuthStep jbaAuthStep(@Nullable JbaUserStore jbaUserStore, @Nullable Composer $composer, int $changed, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 1543373716
/*    */     //   3: invokeinterface startReplaceGroup : (I)V
/*    */     //   8: iload_3
/*    */     //   9: iconst_1
/*    */     //   10: iand
/*    */     //   11: ifeq -> 111
/*    */     //   14: iconst_0
/*    */     //   15: istore #4
/*    */     //   17: iconst_0
/*    */     //   18: istore #5
/*    */     //   20: ldc com/intellij/ml/llm/matterhorn/activation/state/junie/data/JbaUserStore
/*    */     //   22: astore #6
/*    */     //   24: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*    */     //   27: aload #6
/*    */     //   29: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*    */     //   34: dup
/*    */     //   35: ifnonnull -> 102
/*    */     //   38: pop
/*    */     //   39: new java/lang/RuntimeException
/*    */     //   42: dup
/*    */     //   43: new java/lang/StringBuilder
/*    */     //   46: dup
/*    */     //   47: invokespecial <init> : ()V
/*    */     //   50: ldc 'Cannot find service '
/*    */     //   52: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   55: aload #6
/*    */     //   57: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   60: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   63: ldc ' (classloader='
/*    */     //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   68: aload #6
/*    */     //   70: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
/*    */     //   73: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   76: ldc ', client='
/*    */     //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   81: getstatic com/intellij/codeWithMe/ClientId.Companion : Lcom/intellij/codeWithMe/ClientId$Companion;
/*    */     //   84: invokevirtual getCurrentOrNull : ()Lcom/intellij/codeWithMe/ClientId;
/*    */     //   87: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   90: bipush #41
/*    */     //   92: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   95: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   98: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   101: athrow
/*    */     //   102: nop
/*    */     //   103: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStore
/*    */     //   106: nop
/*    */     //   107: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/data/JbaUserStore
/*    */     //   110: astore_0
/*    */     //   111: invokestatic isTraceInProgress : ()Z
/*    */     //   114: ifeq -> 126
/*    */     //   117: ldc 1543373716
/*    */     //   119: iload_2
/*    */     //   120: iconst_m1
/*    */     //   121: ldc 'com.intellij.ml.llm.matterhorn.activation.state.junie.jbaAuthStep (jbaAuthStep.kt:19)'
/*    */     //   123: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   126: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/JbaAuthStepKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   129: aload_1
/*    */     //   130: ldc -657419733
/*    */     //   132: invokeinterface startReplaceGroup : (I)V
/*    */     //   137: aload_1
/*    */     //   138: astore #5
/*    */     //   140: iconst_0
/*    */     //   141: istore #6
/*    */     //   143: iconst_0
/*    */     //   144: istore #7
/*    */     //   146: aload #5
/*    */     //   148: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   153: astore #8
/*    */     //   155: iconst_0
/*    */     //   156: istore #9
/*    */     //   158: aload #8
/*    */     //   160: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   163: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   166: if_acmpne -> 198
/*    */     //   169: astore #24
/*    */     //   171: iconst_0
/*    */     //   172: istore #10
/*    */     //   174: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*    */     //   179: aload #24
/*    */     //   181: swap
/*    */     //   182: astore #10
/*    */     //   184: aload #5
/*    */     //   186: aload #10
/*    */     //   188: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   193: aload #10
/*    */     //   195: goto -> 200
/*    */     //   198: aload #8
/*    */     //   200: nop
/*    */     //   201: nop
/*    */     //   202: nop
/*    */     //   203: checkcast kotlin/jvm/functions/Function0
/*    */     //   206: astore #4
/*    */     //   208: aload_1
/*    */     //   209: invokeinterface endReplaceGroup : ()V
/*    */     //   214: aload #4
/*    */     //   216: aload_1
/*    */     //   217: bipush #48
/*    */     //   219: invokestatic TraceComposition : (Lcom/intellij/openapi/diagnostic/Logger;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*    */     //   222: aload_0
/*    */     //   223: invokevirtual getAuthDataLazy : ()Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazy;
/*    */     //   226: aload_1
/*    */     //   227: iconst_0
/*    */     //   228: invokestatic observeValue : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazy;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
/*    */     //   231: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData
/*    */     //   234: astore #4
/*    */     //   236: aload #4
/*    */     //   238: ifnonnull -> 287
/*    */     //   241: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/JbaAuthStepKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   244: ldc 'Not authenticated in the IDE yet'
/*    */     //   246: invokevirtual info : (Ljava/lang/String;)V
/*    */     //   249: new com/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthStep
/*    */     //   252: dup
/*    */     //   253: aconst_null
/*    */     //   254: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthPending$JbaUnauthenticated.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthPending$JbaUnauthenticated;
/*    */     //   257: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked
/*    */     //   260: invokestatic activationRoadblocked : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked;)Ljava/lang/Object;
/*    */     //   263: aconst_null
/*    */     //   264: invokespecial <init> : (Lkotlin/jvm/functions/Function0;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   267: astore #5
/*    */     //   269: invokestatic isTraceInProgress : ()Z
/*    */     //   272: ifeq -> 278
/*    */     //   275: invokestatic traceEventEnd : ()V
/*    */     //   278: aload_1
/*    */     //   279: invokeinterface endReplaceGroup : ()V
/*    */     //   284: aload #5
/*    */     //   286: areturn
/*    */     //   287: aload #4
/*    */     //   289: invokevirtual getIdToken-9HrtA_0 : ()Ljava/lang/String;
/*    */     //   292: astore #6
/*    */     //   294: aload_1
/*    */     //   295: ldc -657410799
/*    */     //   297: invokeinterface startReplaceGroup : (I)V
/*    */     //   302: aload_1
/*    */     //   303: astore #8
/*    */     //   305: aload_1
/*    */     //   306: aload #6
/*    */     //   308: dup
/*    */     //   309: ifnull -> 318
/*    */     //   312: invokestatic box-impl : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaIdToken;
/*    */     //   315: goto -> 320
/*    */     //   318: pop
/*    */     //   319: aconst_null
/*    */     //   320: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   325: istore #9
/*    */     //   327: iconst_0
/*    */     //   328: istore #10
/*    */     //   330: aload #8
/*    */     //   332: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   337: astore #11
/*    */     //   339: iconst_0
/*    */     //   340: istore #12
/*    */     //   342: iload #9
/*    */     //   344: ifne -> 358
/*    */     //   347: aload #11
/*    */     //   349: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   352: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   355: if_acmpne -> 387
/*    */     //   358: iconst_0
/*    */     //   359: istore #13
/*    */     //   361: iconst_0
/*    */     //   362: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */     //   365: aconst_null
/*    */     //   366: iconst_2
/*    */     //   367: aconst_null
/*    */     //   368: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*    */     //   371: astore #13
/*    */     //   373: aload #8
/*    */     //   375: aload #13
/*    */     //   377: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   382: aload #13
/*    */     //   384: goto -> 389
/*    */     //   387: aload #11
/*    */     //   389: nop
/*    */     //   390: nop
/*    */     //   391: nop
/*    */     //   392: checkcast androidx/compose/runtime/MutableState
/*    */     //   395: astore #7
/*    */     //   397: aload_1
/*    */     //   398: invokeinterface endReplaceGroup : ()V
/*    */     //   403: aload #7
/*    */     //   405: astore #5
/*    */     //   407: aload_1
/*    */     //   408: ldc -657408885
/*    */     //   410: invokeinterface startReplaceGroup : (I)V
/*    */     //   415: aload #5
/*    */     //   417: invokestatic jbaAuthStep$lambda$3 : (Landroidx/compose/runtime/MutableState;)Z
/*    */     //   420: ifeq -> 641
/*    */     //   423: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/JbaAuthStepKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   426: astore #6
/*    */     //   428: iconst_0
/*    */     //   429: istore #7
/*    */     //   431: iconst_0
/*    */     //   432: istore #8
/*    */     //   434: aload_1
/*    */     //   435: ldc 1995314794
/*    */     //   437: invokeinterface startReplaceGroup : (I)V
/*    */     //   442: iconst_0
/*    */     //   443: istore #9
/*    */     //   445: nop
/*    */     //   446: iconst_0
/*    */     //   447: istore #10
/*    */     //   449: aload_1
/*    */     //   450: ldc 1070978846
/*    */     //   452: invokeinterface startReplaceGroup : (I)V
/*    */     //   457: nop
/*    */     //   458: nop
/*    */     //   459: aload_1
/*    */     //   460: ldc -673133301
/*    */     //   462: invokeinterface startReplaceGroup : (I)V
/*    */     //   467: aload_1
/*    */     //   468: astore #16
/*    */     //   470: iconst_0
/*    */     //   471: istore #17
/*    */     //   473: iconst_0
/*    */     //   474: istore #18
/*    */     //   476: aload #16
/*    */     //   478: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   483: astore #19
/*    */     //   485: iconst_0
/*    */     //   486: istore #20
/*    */     //   488: aload #19
/*    */     //   490: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   493: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   496: if_acmpne -> 567
/*    */     //   499: iconst_0
/*    */     //   500: istore #21
/*    */     //   502: iconst_0
/*    */     //   503: istore #11
/*    */     //   505: aload #6
/*    */     //   507: astore #12
/*    */     //   509: aconst_null
/*    */     //   510: astore #13
/*    */     //   512: iconst_0
/*    */     //   513: istore #14
/*    */     //   515: aload #12
/*    */     //   517: invokevirtual isDebugEnabled : ()Z
/*    */     //   520: ifeq -> 545
/*    */     //   523: aload #12
/*    */     //   525: astore #24
/*    */     //   527: iconst_0
/*    */     //   528: istore #15
/*    */     //   530: aload #4
/*    */     //   532: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;)Ljava/lang/String;
/*    */     //   537: aload #24
/*    */     //   539: swap
/*    */     //   540: aload #13
/*    */     //   542: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   545: nop
/*    */     //   546: nop
/*    */     //   547: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   550: nop
/*    */     //   551: astore #22
/*    */     //   553: aload #16
/*    */     //   555: aload #22
/*    */     //   557: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   562: aload #22
/*    */     //   564: goto -> 569
/*    */     //   567: aload #19
/*    */     //   569: nop
/*    */     //   570: nop
/*    */     //   571: nop
/*    */     //   572: astore #15
/*    */     //   574: aload_1
/*    */     //   575: invokeinterface endReplaceGroup : ()V
/*    */     //   580: aload #15
/*    */     //   582: astore #23
/*    */     //   584: aload_1
/*    */     //   585: invokeinterface endReplaceGroup : ()V
/*    */     //   590: aload_1
/*    */     //   591: invokeinterface endReplaceGroup : ()V
/*    */     //   596: nop
/*    */     //   597: new com/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthStep
/*    */     //   600: dup
/*    */     //   601: aconst_null
/*    */     //   602: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthPending$JbaAuthRejected.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthPending$JbaAuthRejected;
/*    */     //   605: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked
/*    */     //   608: invokestatic activationRoadblocked : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked;)Ljava/lang/Object;
/*    */     //   611: aconst_null
/*    */     //   612: invokespecial <init> : (Lkotlin/jvm/functions/Function0;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   615: astore #6
/*    */     //   617: aload_1
/*    */     //   618: invokeinterface endReplaceGroup : ()V
/*    */     //   623: invokestatic isTraceInProgress : ()Z
/*    */     //   626: ifeq -> 632
/*    */     //   629: invokestatic traceEventEnd : ()V
/*    */     //   632: aload_1
/*    */     //   633: invokeinterface endReplaceGroup : ()V
/*    */     //   638: aload #6
/*    */     //   640: areturn
/*    */     //   641: aload_1
/*    */     //   642: invokeinterface endReplaceGroup : ()V
/*    */     //   647: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/JbaAuthStepKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   650: astore #6
/*    */     //   652: iconst_0
/*    */     //   653: istore #7
/*    */     //   655: iconst_0
/*    */     //   656: istore #8
/*    */     //   658: aload_1
/*    */     //   659: ldc 1995314794
/*    */     //   661: invokeinterface startReplaceGroup : (I)V
/*    */     //   666: iconst_0
/*    */     //   667: istore #9
/*    */     //   669: nop
/*    */     //   670: iconst_0
/*    */     //   671: istore #10
/*    */     //   673: aload_1
/*    */     //   674: ldc 1070978846
/*    */     //   676: invokeinterface startReplaceGroup : (I)V
/*    */     //   681: nop
/*    */     //   682: nop
/*    */     //   683: aload_1
/*    */     //   684: ldc -673133301
/*    */     //   686: invokeinterface startReplaceGroup : (I)V
/*    */     //   691: aload_1
/*    */     //   692: astore #16
/*    */     //   694: iconst_0
/*    */     //   695: istore #17
/*    */     //   697: iconst_0
/*    */     //   698: istore #18
/*    */     //   700: aload #16
/*    */     //   702: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   707: astore #19
/*    */     //   709: iconst_0
/*    */     //   710: istore #20
/*    */     //   712: aload #19
/*    */     //   714: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   717: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   720: if_acmpne -> 791
/*    */     //   723: iconst_0
/*    */     //   724: istore #21
/*    */     //   726: iconst_0
/*    */     //   727: istore #11
/*    */     //   729: aload #6
/*    */     //   731: astore #12
/*    */     //   733: aconst_null
/*    */     //   734: astore #13
/*    */     //   736: iconst_0
/*    */     //   737: istore #14
/*    */     //   739: aload #12
/*    */     //   741: invokevirtual isDebugEnabled : ()Z
/*    */     //   744: ifeq -> 769
/*    */     //   747: aload #12
/*    */     //   749: astore #24
/*    */     //   751: iconst_0
/*    */     //   752: istore #15
/*    */     //   754: aload #4
/*    */     //   756: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;)Ljava/lang/String;
/*    */     //   761: aload #24
/*    */     //   763: swap
/*    */     //   764: aload #13
/*    */     //   766: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   769: nop
/*    */     //   770: nop
/*    */     //   771: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   774: nop
/*    */     //   775: astore #22
/*    */     //   777: aload #16
/*    */     //   779: aload #22
/*    */     //   781: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   786: aload #22
/*    */     //   788: goto -> 793
/*    */     //   791: aload #19
/*    */     //   793: nop
/*    */     //   794: nop
/*    */     //   795: nop
/*    */     //   796: astore #15
/*    */     //   798: aload_1
/*    */     //   799: invokeinterface endReplaceGroup : ()V
/*    */     //   804: aload #15
/*    */     //   806: astore #23
/*    */     //   808: aload_1
/*    */     //   809: invokeinterface endReplaceGroup : ()V
/*    */     //   814: aload_1
/*    */     //   815: invokeinterface endReplaceGroup : ()V
/*    */     //   820: nop
/*    */     //   821: aload_1
/*    */     //   822: ldc -657399690
/*    */     //   824: invokeinterface startReplaceGroup : (I)V
/*    */     //   829: aload_1
/*    */     //   830: astore #8
/*    */     //   832: aload_1
/*    */     //   833: aload #5
/*    */     //   835: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   840: istore #9
/*    */     //   842: iconst_0
/*    */     //   843: istore #10
/*    */     //   845: aload #8
/*    */     //   847: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   852: astore #11
/*    */     //   854: iconst_0
/*    */     //   855: istore #12
/*    */     //   857: iload #9
/*    */     //   859: ifne -> 873
/*    */     //   862: aload #11
/*    */     //   864: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   867: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   870: if_acmpne -> 899
/*    */     //   873: iconst_0
/*    */     //   874: istore #13
/*    */     //   876: aload #5
/*    */     //   878: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*    */     //   883: astore #14
/*    */     //   885: aload #8
/*    */     //   887: aload #14
/*    */     //   889: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   894: aload #14
/*    */     //   896: goto -> 901
/*    */     //   899: aload #11
/*    */     //   901: nop
/*    */     //   902: nop
/*    */     //   903: nop
/*    */     //   904: checkcast kotlin/jvm/functions/Function0
/*    */     //   907: astore #7
/*    */     //   909: aload_1
/*    */     //   910: invokeinterface endReplaceGroup : ()V
/*    */     //   915: aload #7
/*    */     //   917: aload #4
/*    */     //   919: invokestatic done : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   922: aconst_null
/*    */     //   923: astore #25
/*    */     //   925: astore #26
/*    */     //   927: astore #27
/*    */     //   929: new com/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthStep
/*    */     //   932: dup
/*    */     //   933: aload #27
/*    */     //   935: aload #26
/*    */     //   937: aload #25
/*    */     //   939: invokespecial <init> : (Lkotlin/jvm/functions/Function0;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   942: astore #6
/*    */     //   944: invokestatic isTraceInProgress : ()Z
/*    */     //   947: ifeq -> 953
/*    */     //   950: invokestatic traceEventEnd : ()V
/*    */     //   953: aload_1
/*    */     //   954: invokeinterface endReplaceGroup : ()V
/*    */     //   959: aload #6
/*    */     //   961: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 14
/*    */     //   #42	-> 17
/*    */     //   #43	-> 20
/*    */     //   #44	-> 24
/*    */     //   #45	-> 39
/*    */     //   #44	-> 102
/*    */     //   #42	-> 106
/*    */     //   #20	-> 123
/*    */     //   #21	-> 126
/*    */     //   #46	-> 146
/*    */     //   #47	-> 158
/*    */     //   #48	-> 169
/*    */     //   #48	-> 182
/*    */     //   #49	-> 184
/*    */     //   #50	-> 193
/*    */     //   #51	-> 198
/*    */     //   #47	-> 200
/*    */     //   #46	-> 201
/*    */     //   #46	-> 202
/*    */     //   #21	-> 203
/*    */     //   #23	-> 222
/*    */     //   #24	-> 236
/*    */     //   #25	-> 241
/*    */     //   #26	-> 249
/*    */     //   #29	-> 287
/*    */     //   #52	-> 330
/*    */     //   #53	-> 342
/*    */     //   #54	-> 358
/*    */     //   #29	-> 361
/*    */     //   #54	-> 371
/*    */     //   #55	-> 373
/*    */     //   #56	-> 382
/*    */     //   #57	-> 387
/*    */     //   #53	-> 389
/*    */     //   #52	-> 390
/*    */     //   #52	-> 391
/*    */     //   #29	-> 392
/*    */     //   #30	-> 415
/*    */     //   #31	-> 423
/*    */     //   #58	-> 445
/*    */     //   #59	-> 457
/*    */     //   #60	-> 458
/*    */     //   #66	-> 459
/*    */     //   #67	-> 476
/*    */     //   #68	-> 488
/*    */     //   #69	-> 499
/*    */     //   #66	-> 502
/*    */     //   #58	-> 505
/*    */     //   #61	-> 509
/*    */     //   #62	-> 515
/*    */     //   #63	-> 523
/*    */     //   #31	-> 530
/*    */     //   #63	-> 540
/*    */     //   #65	-> 545
/*    */     //   #58	-> 546
/*    */     //   #66	-> 550
/*    */     //   #69	-> 551
/*    */     //   #70	-> 553
/*    */     //   #71	-> 562
/*    */     //   #72	-> 567
/*    */     //   #68	-> 569
/*    */     //   #67	-> 570
/*    */     //   #67	-> 571
/*    */     //   #66	-> 572
/*    */     //   #58	-> 596
/*    */     //   #32	-> 597
/*    */     //   #35	-> 647
/*    */     //   #73	-> 669
/*    */     //   #74	-> 681
/*    */     //   #75	-> 682
/*    */     //   #81	-> 683
/*    */     //   #82	-> 700
/*    */     //   #83	-> 712
/*    */     //   #84	-> 723
/*    */     //   #81	-> 726
/*    */     //   #73	-> 729
/*    */     //   #76	-> 733
/*    */     //   #77	-> 739
/*    */     //   #78	-> 747
/*    */     //   #35	-> 754
/*    */     //   #78	-> 764
/*    */     //   #80	-> 769
/*    */     //   #73	-> 770
/*    */     //   #81	-> 774
/*    */     //   #84	-> 775
/*    */     //   #85	-> 777
/*    */     //   #86	-> 786
/*    */     //   #87	-> 791
/*    */     //   #83	-> 793
/*    */     //   #82	-> 794
/*    */     //   #82	-> 795
/*    */     //   #81	-> 796
/*    */     //   #73	-> 820
/*    */     //   #36	-> 821
/*    */     //   #88	-> 845
/*    */     //   #89	-> 857
/*    */     //   #90	-> 873
/*    */     //   #36	-> 876
/*    */     //   #90	-> 883
/*    */     //   #91	-> 885
/*    */     //   #92	-> 894
/*    */     //   #93	-> 899
/*    */     //   #89	-> 901
/*    */     //   #88	-> 902
/*    */     //   #88	-> 903
/*    */     //   #36	-> 904
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   20	83	5	$i$f$service	I
/*    */     //   24	79	6	serviceClass$iv$iv	Ljava/lang/Class;
/*    */     //   17	90	4	$i$f$rememberDataStore	I
/*    */     //   174	5	10	$i$a$-cache-JbaAuthStepKt$jbaAuthStep$1	I
/*    */     //   184	11	10	value$iv	Ljava/lang/Object;
/*    */     //   158	43	9	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   155	46	8	it$iv	Ljava/lang/Object;
/*    */     //   146	57	7	$i$f$cache	I
/*    */     //   143	60	5	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   143	60	6	invalid$iv	Z
/*    */     //   361	10	13	$i$a$-cache-JbaAuthStepKt$jbaAuthStep$isAuthRejected$2	I
/*    */     //   373	11	13	value$iv	Ljava/lang/Object;
/*    */     //   342	48	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   339	51	11	it$iv	Ljava/lang/Object;
/*    */     //   330	62	10	$i$f$cache	I
/*    */     //   327	65	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   327	65	9	invalid$iv	Z
/*    */     //   530	7	15	$i$a$-Debug-JbaAuthStepKt$jbaAuthStep$2	I
/*    */     //   515	31	14	$i$f$debug	I
/*    */     //   509	37	12	$this$debug_u24default$iv$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   512	34	13	e$iv$iv	Ljava/lang/Exception;
/*    */     //   505	42	11	$i$a$-logMaybeOnce-LoggingComposeKt$Debug$1$iv	I
/*    */     //   502	49	21	$i$a$-cache-LoggingComposeKt$logMaybeOnce$1$iv$iv	I
/*    */     //   553	11	22	value$iv$iv$iv	Ljava/lang/Object;
/*    */     //   488	82	20	$i$a$-let-ComposerKt$cache$1$iv$iv$iv	I
/*    */     //   485	85	19	it$iv$iv$iv	Ljava/lang/Object;
/*    */     //   476	96	18	$i$f$cache	I
/*    */     //   473	99	16	$this$cache$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   473	99	17	invalid$iv$iv$iv	Z
/*    */     //   449	141	10	$i$f$logMaybeOnce	I
/*    */     //   446	144	9	$changed$iv$iv	I
/*    */     //   434	163	8	$i$f$Debug	I
/*    */     //   431	166	6	$this$Debug$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   431	166	7	$changed$iv	I
/*    */     //   754	7	15	$i$a$-Debug-JbaAuthStepKt$jbaAuthStep$3	I
/*    */     //   739	31	14	$i$f$debug	I
/*    */     //   733	37	12	$this$debug_u24default$iv$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   736	34	13	e$iv$iv	Ljava/lang/Exception;
/*    */     //   729	42	11	$i$a$-logMaybeOnce-LoggingComposeKt$Debug$1$iv	I
/*    */     //   726	49	21	$i$a$-cache-LoggingComposeKt$logMaybeOnce$1$iv$iv	I
/*    */     //   777	11	22	value$iv$iv$iv	Ljava/lang/Object;
/*    */     //   712	82	20	$i$a$-let-ComposerKt$cache$1$iv$iv$iv	I
/*    */     //   709	85	19	it$iv$iv$iv	Ljava/lang/Object;
/*    */     //   700	96	18	$i$f$cache	I
/*    */     //   697	99	16	$this$cache$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   697	99	17	invalid$iv$iv$iv	Z
/*    */     //   673	141	10	$i$f$logMaybeOnce	I
/*    */     //   670	144	9	$changed$iv$iv	I
/*    */     //   658	163	8	$i$f$Debug	I
/*    */     //   655	166	6	$this$Debug$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   655	166	7	$changed$iv	I
/*    */     //   876	7	13	$i$a$-cache-JbaAuthStepKt$jbaAuthStep$4	I
/*    */     //   885	11	14	value$iv	Ljava/lang/Object;
/*    */     //   857	45	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   854	48	11	it$iv	Ljava/lang/Object;
/*    */     //   845	59	10	$i$f$cache	I
/*    */     //   842	62	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   842	62	9	invalid$iv	Z
/*    */     //   236	726	4	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;
/*    */     //   407	555	5	isAuthRejected$delegate	Landroidx/compose/runtime/MutableState;
/*    */     //   0	962	0	jbaUserStore	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/JbaUserStore;
/*    */     //   0	962	1	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	962	2	$changed	I
/*    */   }
/*    */   private static final boolean jbaAuthStep$lambda$3(MutableState $isAuthRejected$delegate) {
/* 29 */     State state = (State)$isAuthRejected$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 94 */       (Boolean)state.getValue()).booleanValue(); } private static final void jbaAuthStep$lambda$4(MutableState $isAuthRejected$delegate, boolean <set-?>) { MutableState mutableState = $isAuthRejected$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 95 */     mutableState.setValue(value$iv); } static {
/*    */     int $i$f$fileLogger = 0;
/* 97 */     int $i$f$currentClassLogger = 0;
/* 98 */     Class<?> clazz$iv$iv = MethodHandles.lookup().lookupClass();
/* 99 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(clazz$iv$iv), "getInstance(...)"); LOG = Logger.getInstance(clazz$iv$iv);
/*    */   }
/*    */   
/*    */   private static final Unit jbaAuthStep$lambda$8$lambda$7(MutableState<Boolean> $isAuthRejected$delegate) {
/*    */     jbaAuthStep$lambda$4($isAuthRejected$delegate, true);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\JbaAuthStepKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */