/*     */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicense;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseProductType;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AipLicenseChoiceStep;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000<\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\001\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\"\n\002\020\016\032\033\020\004\032\0020\0052\f\020\006\032\b\022\004\022\0020\b0\007H\001¢\006\002\020\t\032'\020\n\032\016\022\004\022\0020\f\022\004\022\0020\r0\0132\f\020\006\032\b\022\004\022\0020\b0\007H\003¢\006\002\020\016\"\024\020\000\032\0020\001X\004¢\006\b\n\000\032\004\b\002\020\003\"\024\020\017\032\b\022\004\022\0020\0200\007X\004¢\006\002\n\000\"\016\020\021\032\0020\001X\004¢\006\002\n\000¨\006\022²\006\020\020\023\032\b\022\004\022\0020\0250\024X\002"}, d2 = {"log", "Lcom/intellij/openapi/diagnostic/Logger;", "getLog", "()Lcom/intellij/openapi/diagnostic/Logger;", "aipLicenseChoiceStep", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceStep;", "availableLicenses", "", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceStep;", "aipLicenseChoiceOutcome", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome;", "", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceReady;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "licenseSelectionOrder", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/OrderItem;", "LOG", "state.junie.impl", "quotaExceededLicenseIds", "", ""})
/*     */ @SourceDebugExtension({"SMAP\naipLicenseChoiceStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 aipLicenseChoiceStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseChoiceStepKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,77:1\n1225#2,6:78\n1225#2,6:99\n1225#2,6:105\n1225#2,6:125\n31#3,2:84\n1557#4:86\n1628#4,2:87\n774#4:89\n865#4,2:90\n1630#4:92\n1368#4:93\n1454#4,5:94\n1368#4:111\n1454#4,5:112\n295#4,2:117\n1368#4:119\n1454#4,5:120\n81#5:131\n14#6:132\n58#6:133\n36#6,2:134\n*S KotlinDebug\n*F\n+ 1 aipLicenseChoiceStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseChoiceStepKt\n*L\n28#1:78,6\n48#1:99,6\n49#1:105,6\n54#1:125,6\n40#1:84,2\n42#1:86\n42#1:87,2\n43#1:89\n43#1:90,2\n42#1:92\n48#1:93\n48#1:94,5\n51#1:111\n51#1:112,5\n51#1:117,2\n52#1:119\n52#1:120,5\n40#1:131\n22#1:132\n76#1:133\n76#1:134,2\n*E\n"})
/*     */ public final class AipLicenseChoiceStepKt {
/*     */   @NotNull
/*  22 */   public static final Logger getLog() { return log; } static { int $i$f$logger = 0;
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
/* 132 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(OrderItem.class), "getInstance(...)"); } static { OrderItem[] arrayOfOrderItem = new OrderItem[6]; arrayOfOrderItem[0] = new OrderItem(AipLicenseProductType.AIPU, false); arrayOfOrderItem[1] = new OrderItem(AipLicenseProductType.AIP, false); arrayOfOrderItem[2] = new OrderItem(AipLicenseProductType.AIPU, true); arrayOfOrderItem[3] = new OrderItem(AipLicenseProductType.AIP, true); arrayOfOrderItem[4] = new OrderItem(AipLicenseProductType.AIF, false); arrayOfOrderItem[5] = new OrderItem(AipLicenseProductType.AIF, true); licenseSelectionOrder = CollectionsKt.listOf((Object[])arrayOfOrderItem); int $i$f$fileLogger = 0;
/* 133 */     int $i$f$currentClassLogger = 0;
/* 134 */     Class<?> clazz$iv$iv = MethodHandles.lookup().lookupClass();
/* 135 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(clazz$iv$iv), "getInstance(...)"); LOG = Logger.getInstance(clazz$iv$iv); }
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final AipLicenseChoiceStep aipLicenseChoiceStep(@NotNull List<AipLicense> availableLicenses, @Nullable Composer $composer, int $changed) {
/*     */     Intrinsics.checkNotNullParameter(availableLicenses, "availableLicenses");
/*     */     $composer.startReplaceGroup(-585643788);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(-585643788, $changed, -1, "com.intellij.ml.llm.matterhorn.activation.state.junie.aipLicenseChoiceStep (aipLicenseChoiceStep.kt:26)"); 
/*     */     $composer.startReplaceGroup(-346467903);
/*     */     Composer composer = $composer;
/*     */     boolean invalid$iv = false;
/*     */     int $i$f$cache = 0;
/*     */     Object it$iv = composer.rememberedValue();
/*     */     int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */     Logger logger = LOG;
/*     */     int $i$a$-cache-AipLicenseChoiceStepKt$aipLicenseChoiceStep$1 = 0;
/*     */     Object value$iv = AipLicenseChoiceStepKt::aipLicenseChoiceStep$lambda$1$lambda$0;
/*     */     composer.updateRememberedValue(value$iv);
/*     */     Function0 function0 = (it$iv == Composer.Companion.getEmpty()) ? (Function0)value$iv : (Function0)it$iv;
/*     */     $composer.endReplaceGroup();
/*     */     LoggingComposeKt.TraceComposition(logger, function0, $composer, 48);
/*     */     AipLicenseChoiceStep aipLicenseChoiceStep = new AipLicenseChoiceStep(aipLicenseChoiceOutcome(availableLicenses, $composer, 0xE & $changed), null);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return aipLicenseChoiceStep;
/*     */   }
/*     */   
/*     */   private static final String aipLicenseChoiceStep$lambda$1$lambda$0() {
/*     */     return "AI Pro license choice";
/*     */   }
/*     */   
/*     */   @Composable
/*     */   private static final Object aipLicenseChoiceOutcome(List availableLicenses, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 2068627820
/*     */     //   3: invokeinterface startReplaceGroup : (I)V
/*     */     //   8: invokestatic isTraceInProgress : ()Z
/*     */     //   11: ifeq -> 23
/*     */     //   14: ldc 2068627820
/*     */     //   16: iload_2
/*     */     //   17: iconst_m1
/*     */     //   18: ldc 'com.intellij.ml.llm.matterhorn.activation.state.junie.aipLicenseChoiceOutcome (aipLicenseChoiceStep.kt:37)'
/*     */     //   20: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   23: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   26: checkcast com/intellij/openapi/components/ComponentManager
/*     */     //   29: astore #4
/*     */     //   31: iconst_0
/*     */     //   32: istore #5
/*     */     //   34: ldc com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceService
/*     */     //   36: astore #6
/*     */     //   38: aload #4
/*     */     //   40: aload #6
/*     */     //   42: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   47: dup
/*     */     //   48: ifnonnull -> 60
/*     */     //   51: pop
/*     */     //   52: aload #4
/*     */     //   54: aload #6
/*     */     //   56: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*     */     //   59: athrow
/*     */     //   60: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceService
/*     */     //   63: invokevirtual getQuotaExceededLicenseIds : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   66: aconst_null
/*     */     //   67: aload_1
/*     */     //   68: iconst_0
/*     */     //   69: iconst_1
/*     */     //   70: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   73: astore_3
/*     */     //   74: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseChoiceStepKt.licenseSelectionOrder : Ljava/util/List;
/*     */     //   77: checkcast java/lang/Iterable
/*     */     //   80: astore #5
/*     */     //   82: iconst_0
/*     */     //   83: istore #6
/*     */     //   85: aload #5
/*     */     //   87: astore #7
/*     */     //   89: new java/util/ArrayList
/*     */     //   92: dup
/*     */     //   93: aload #5
/*     */     //   95: bipush #10
/*     */     //   97: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   100: invokespecial <init> : (I)V
/*     */     //   103: checkcast java/util/Collection
/*     */     //   106: astore #8
/*     */     //   108: iconst_0
/*     */     //   109: istore #9
/*     */     //   111: aload #7
/*     */     //   113: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   118: astore #10
/*     */     //   120: aload #10
/*     */     //   122: invokeinterface hasNext : ()Z
/*     */     //   127: ifeq -> 295
/*     */     //   130: aload #10
/*     */     //   132: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   137: astore #11
/*     */     //   139: aload #8
/*     */     //   141: aload #11
/*     */     //   143: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/OrderItem
/*     */     //   146: astore #12
/*     */     //   148: astore #24
/*     */     //   150: iconst_0
/*     */     //   151: istore #13
/*     */     //   153: aload #12
/*     */     //   155: aload_0
/*     */     //   156: checkcast java/lang/Iterable
/*     */     //   159: astore #14
/*     */     //   161: astore #15
/*     */     //   163: iconst_0
/*     */     //   164: istore #16
/*     */     //   166: aload #14
/*     */     //   168: astore #17
/*     */     //   170: new java/util/ArrayList
/*     */     //   173: dup
/*     */     //   174: invokespecial <init> : ()V
/*     */     //   177: checkcast java/util/Collection
/*     */     //   180: astore #18
/*     */     //   182: iconst_0
/*     */     //   183: istore #19
/*     */     //   185: aload #17
/*     */     //   187: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   192: astore #20
/*     */     //   194: aload #20
/*     */     //   196: invokeinterface hasNext : ()Z
/*     */     //   201: ifeq -> 270
/*     */     //   204: aload #20
/*     */     //   206: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   211: astore #21
/*     */     //   213: aload #21
/*     */     //   215: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AipLicense
/*     */     //   218: astore #22
/*     */     //   220: iconst_0
/*     */     //   221: istore #23
/*     */     //   223: aload #22
/*     */     //   225: invokevirtual getProductType : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */     //   228: aload #12
/*     */     //   230: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */     //   233: if_acmpne -> 253
/*     */     //   236: aload #22
/*     */     //   238: invokevirtual isTrial : ()Z
/*     */     //   241: aload #12
/*     */     //   243: invokevirtual getTrial : ()Z
/*     */     //   246: if_icmpne -> 253
/*     */     //   249: iconst_1
/*     */     //   250: goto -> 254
/*     */     //   253: iconst_0
/*     */     //   254: ifeq -> 194
/*     */     //   257: aload #18
/*     */     //   259: aload #21
/*     */     //   261: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   266: pop
/*     */     //   267: goto -> 194
/*     */     //   270: aload #18
/*     */     //   272: checkcast java/util/List
/*     */     //   275: nop
/*     */     //   276: aload #15
/*     */     //   278: swap
/*     */     //   279: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   282: nop
/*     */     //   283: aload #24
/*     */     //   285: swap
/*     */     //   286: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   291: pop
/*     */     //   292: goto -> 120
/*     */     //   295: aload #8
/*     */     //   297: checkcast java/util/List
/*     */     //   300: nop
/*     */     //   301: astore #4
/*     */     //   303: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseChoiceStepKt.log : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   306: aload #4
/*     */     //   308: checkcast java/lang/Iterable
/*     */     //   311: astore #5
/*     */     //   313: astore #24
/*     */     //   315: iconst_0
/*     */     //   316: istore #6
/*     */     //   318: aload #5
/*     */     //   320: astore #7
/*     */     //   322: new java/util/ArrayList
/*     */     //   325: dup
/*     */     //   326: invokespecial <init> : ()V
/*     */     //   329: checkcast java/util/Collection
/*     */     //   332: astore #8
/*     */     //   334: iconst_0
/*     */     //   335: istore #9
/*     */     //   337: aload #7
/*     */     //   339: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   344: astore #10
/*     */     //   346: aload #10
/*     */     //   348: invokeinterface hasNext : ()Z
/*     */     //   353: ifeq -> 399
/*     */     //   356: aload #10
/*     */     //   358: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   363: astore #11
/*     */     //   365: aload #11
/*     */     //   367: checkcast kotlin/Pair
/*     */     //   370: astore #12
/*     */     //   372: iconst_0
/*     */     //   373: istore #13
/*     */     //   375: aload #12
/*     */     //   377: invokevirtual getSecond : ()Ljava/lang/Object;
/*     */     //   380: checkcast java/util/List
/*     */     //   383: checkcast java/lang/Iterable
/*     */     //   386: astore #12
/*     */     //   388: aload #8
/*     */     //   390: aload #12
/*     */     //   392: invokestatic addAll : (Ljava/util/Collection;Ljava/lang/Iterable;)Z
/*     */     //   395: pop
/*     */     //   396: goto -> 346
/*     */     //   399: aload #8
/*     */     //   401: checkcast java/util/List
/*     */     //   404: nop
/*     */     //   405: aload #24
/*     */     //   407: swap
/*     */     //   408: checkcast java/lang/Iterable
/*     */     //   411: aconst_null
/*     */     //   412: aconst_null
/*     */     //   413: aconst_null
/*     */     //   414: iconst_0
/*     */     //   415: aconst_null
/*     */     //   416: aload_1
/*     */     //   417: ldc -1491078194
/*     */     //   419: invokeinterface startReplaceGroup : (I)V
/*     */     //   424: aload_1
/*     */     //   425: astore #6
/*     */     //   427: iconst_0
/*     */     //   428: istore #7
/*     */     //   430: iconst_0
/*     */     //   431: istore #8
/*     */     //   433: aload #6
/*     */     //   435: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   440: astore #9
/*     */     //   442: iconst_0
/*     */     //   443: istore #10
/*     */     //   445: aload #9
/*     */     //   447: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   450: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   453: if_acmpne -> 512
/*     */     //   456: astore #30
/*     */     //   458: istore #29
/*     */     //   460: astore #28
/*     */     //   462: astore #27
/*     */     //   464: astore #26
/*     */     //   466: astore #25
/*     */     //   468: astore #24
/*     */     //   470: iconst_0
/*     */     //   471: istore #11
/*     */     //   473: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   478: astore #31
/*     */     //   480: aload #24
/*     */     //   482: aload #25
/*     */     //   484: aload #26
/*     */     //   486: aload #27
/*     */     //   488: aload #28
/*     */     //   490: iload #29
/*     */     //   492: aload #30
/*     */     //   494: aload #31
/*     */     //   496: astore #11
/*     */     //   498: aload #6
/*     */     //   500: aload #11
/*     */     //   502: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   507: aload #11
/*     */     //   509: goto -> 514
/*     */     //   512: aload #9
/*     */     //   514: nop
/*     */     //   515: nop
/*     */     //   516: nop
/*     */     //   517: checkcast kotlin/jvm/functions/Function1
/*     */     //   520: astore #5
/*     */     //   522: aload_1
/*     */     //   523: invokeinterface endReplaceGroup : ()V
/*     */     //   528: aload #5
/*     */     //   530: bipush #31
/*     */     //   532: aconst_null
/*     */     //   533: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   536: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   541: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   544: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseChoiceStepKt.log : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   547: aload_3
/*     */     //   548: invokestatic aipLicenseChoiceOutcome$lambda$2 : (Landroidx/compose/runtime/State;)Ljava/util/Set;
/*     */     //   551: checkcast java/lang/Iterable
/*     */     //   554: aconst_null
/*     */     //   555: aconst_null
/*     */     //   556: aconst_null
/*     */     //   557: iconst_0
/*     */     //   558: aconst_null
/*     */     //   559: aload_1
/*     */     //   560: ldc_w -1491074210
/*     */     //   563: invokeinterface startReplaceGroup : (I)V
/*     */     //   568: aload_1
/*     */     //   569: astore #6
/*     */     //   571: iconst_0
/*     */     //   572: istore #7
/*     */     //   574: iconst_0
/*     */     //   575: istore #8
/*     */     //   577: aload #6
/*     */     //   579: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   584: astore #9
/*     */     //   586: iconst_0
/*     */     //   587: istore #10
/*     */     //   589: aload #9
/*     */     //   591: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   594: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   597: if_acmpne -> 656
/*     */     //   600: astore #30
/*     */     //   602: istore #29
/*     */     //   604: astore #28
/*     */     //   606: astore #27
/*     */     //   608: astore #26
/*     */     //   610: astore #25
/*     */     //   612: astore #24
/*     */     //   614: iconst_0
/*     */     //   615: istore #11
/*     */     //   617: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   622: astore #31
/*     */     //   624: aload #24
/*     */     //   626: aload #25
/*     */     //   628: aload #26
/*     */     //   630: aload #27
/*     */     //   632: aload #28
/*     */     //   634: iload #29
/*     */     //   636: aload #30
/*     */     //   638: aload #31
/*     */     //   640: astore #11
/*     */     //   642: aload #6
/*     */     //   644: aload #11
/*     */     //   646: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   651: aload #11
/*     */     //   653: goto -> 658
/*     */     //   656: aload #9
/*     */     //   658: nop
/*     */     //   659: nop
/*     */     //   660: nop
/*     */     //   661: checkcast kotlin/jvm/functions/Function1
/*     */     //   664: astore #5
/*     */     //   666: aload_1
/*     */     //   667: invokeinterface endReplaceGroup : ()V
/*     */     //   672: aload #5
/*     */     //   674: bipush #31
/*     */     //   676: aconst_null
/*     */     //   677: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   680: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   685: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   688: aload #4
/*     */     //   690: checkcast java/lang/Iterable
/*     */     //   693: astore #6
/*     */     //   695: iconst_0
/*     */     //   696: istore #7
/*     */     //   698: aload #6
/*     */     //   700: astore #8
/*     */     //   702: new java/util/ArrayList
/*     */     //   705: dup
/*     */     //   706: invokespecial <init> : ()V
/*     */     //   709: checkcast java/util/Collection
/*     */     //   712: astore #9
/*     */     //   714: iconst_0
/*     */     //   715: istore #10
/*     */     //   717: aload #8
/*     */     //   719: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   724: astore #11
/*     */     //   726: aload #11
/*     */     //   728: invokeinterface hasNext : ()Z
/*     */     //   733: ifeq -> 779
/*     */     //   736: aload #11
/*     */     //   738: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   743: astore #12
/*     */     //   745: aload #12
/*     */     //   747: checkcast kotlin/Pair
/*     */     //   750: astore #13
/*     */     //   752: iconst_0
/*     */     //   753: istore #14
/*     */     //   755: aload #13
/*     */     //   757: invokevirtual getSecond : ()Ljava/lang/Object;
/*     */     //   760: checkcast java/util/List
/*     */     //   763: checkcast java/lang/Iterable
/*     */     //   766: astore #13
/*     */     //   768: aload #9
/*     */     //   770: aload #13
/*     */     //   772: invokestatic addAll : (Ljava/util/Collection;Ljava/lang/Iterable;)Z
/*     */     //   775: pop
/*     */     //   776: goto -> 726
/*     */     //   779: aload #9
/*     */     //   781: checkcast java/util/List
/*     */     //   784: nop
/*     */     //   785: checkcast java/lang/Iterable
/*     */     //   788: astore #6
/*     */     //   790: nop
/*     */     //   791: iconst_0
/*     */     //   792: istore #7
/*     */     //   794: aload #6
/*     */     //   796: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   801: astore #8
/*     */     //   803: aload #8
/*     */     //   805: invokeinterface hasNext : ()Z
/*     */     //   810: ifeq -> 862
/*     */     //   813: aload #8
/*     */     //   815: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   820: astore #9
/*     */     //   822: aload #9
/*     */     //   824: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AipLicense
/*     */     //   827: astore #10
/*     */     //   829: iconst_0
/*     */     //   830: istore #11
/*     */     //   832: aload_3
/*     */     //   833: invokestatic aipLicenseChoiceOutcome$lambda$2 : (Landroidx/compose/runtime/State;)Ljava/util/Set;
/*     */     //   836: aload #10
/*     */     //   838: invokevirtual getLicenseId-EIc-D0M : ()Ljava/lang/String;
/*     */     //   841: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   846: ifne -> 853
/*     */     //   849: iconst_1
/*     */     //   850: goto -> 854
/*     */     //   853: iconst_0
/*     */     //   854: ifeq -> 803
/*     */     //   857: aload #9
/*     */     //   859: goto -> 863
/*     */     //   862: aconst_null
/*     */     //   863: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AipLicense
/*     */     //   866: astore #5
/*     */     //   868: aload #4
/*     */     //   870: checkcast java/lang/Iterable
/*     */     //   873: astore #7
/*     */     //   875: iconst_0
/*     */     //   876: istore #8
/*     */     //   878: aload #7
/*     */     //   880: astore #9
/*     */     //   882: new java/util/ArrayList
/*     */     //   885: dup
/*     */     //   886: invokespecial <init> : ()V
/*     */     //   889: checkcast java/util/Collection
/*     */     //   892: astore #10
/*     */     //   894: iconst_0
/*     */     //   895: istore #11
/*     */     //   897: aload #9
/*     */     //   899: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   904: astore #12
/*     */     //   906: aload #12
/*     */     //   908: invokeinterface hasNext : ()Z
/*     */     //   913: ifeq -> 959
/*     */     //   916: aload #12
/*     */     //   918: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   923: astore #13
/*     */     //   925: aload #13
/*     */     //   927: checkcast kotlin/Pair
/*     */     //   930: astore #14
/*     */     //   932: iconst_0
/*     */     //   933: istore #15
/*     */     //   935: aload #14
/*     */     //   937: invokevirtual getSecond : ()Ljava/lang/Object;
/*     */     //   940: checkcast java/util/List
/*     */     //   943: checkcast java/lang/Iterable
/*     */     //   946: astore #14
/*     */     //   948: aload #10
/*     */     //   950: aload #14
/*     */     //   952: invokestatic addAll : (Ljava/util/Collection;Ljava/lang/Iterable;)Z
/*     */     //   955: pop
/*     */     //   956: goto -> 906
/*     */     //   959: aload #10
/*     */     //   961: checkcast java/util/List
/*     */     //   964: nop
/*     */     //   965: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   968: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AipLicense
/*     */     //   971: astore #6
/*     */     //   973: aload #5
/*     */     //   975: dup
/*     */     //   976: ifnonnull -> 982
/*     */     //   979: pop
/*     */     //   980: aload #6
/*     */     //   982: dup
/*     */     //   983: ifnonnull -> 1133
/*     */     //   986: pop
/*     */     //   987: aload_0
/*     */     //   988: checkcast java/lang/Iterable
/*     */     //   991: aconst_null
/*     */     //   992: aconst_null
/*     */     //   993: aconst_null
/*     */     //   994: iconst_0
/*     */     //   995: aconst_null
/*     */     //   996: aload_1
/*     */     //   997: ldc_w -1491063927
/*     */     //   1000: invokeinterface startReplaceGroup : (I)V
/*     */     //   1005: aload_1
/*     */     //   1006: astore #11
/*     */     //   1008: iconst_0
/*     */     //   1009: istore #12
/*     */     //   1011: iconst_0
/*     */     //   1012: istore #13
/*     */     //   1014: aload #11
/*     */     //   1016: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1021: astore #14
/*     */     //   1023: iconst_0
/*     */     //   1024: istore #15
/*     */     //   1026: aload #14
/*     */     //   1028: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1031: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1034: if_acmpne -> 1089
/*     */     //   1037: astore #29
/*     */     //   1039: istore #28
/*     */     //   1041: astore #27
/*     */     //   1043: astore #26
/*     */     //   1045: astore #25
/*     */     //   1047: astore #24
/*     */     //   1049: iconst_0
/*     */     //   1050: istore #16
/*     */     //   1052: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1057: astore #30
/*     */     //   1059: aload #24
/*     */     //   1061: aload #25
/*     */     //   1063: aload #26
/*     */     //   1065: aload #27
/*     */     //   1067: iload #28
/*     */     //   1069: aload #29
/*     */     //   1071: aload #30
/*     */     //   1073: astore #16
/*     */     //   1075: aload #11
/*     */     //   1077: aload #16
/*     */     //   1079: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1084: aload #16
/*     */     //   1086: goto -> 1091
/*     */     //   1089: aload #14
/*     */     //   1091: nop
/*     */     //   1092: nop
/*     */     //   1093: nop
/*     */     //   1094: checkcast kotlin/jvm/functions/Function1
/*     */     //   1097: astore #10
/*     */     //   1099: aload_1
/*     */     //   1100: invokeinterface endReplaceGroup : ()V
/*     */     //   1105: aload #10
/*     */     //   1107: bipush #31
/*     */     //   1109: aconst_null
/*     */     //   1110: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   1113: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1118: astore #10
/*     */     //   1120: new java/lang/IllegalStateException
/*     */     //   1123: dup
/*     */     //   1124: aload #10
/*     */     //   1126: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1129: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1132: athrow
/*     */     //   1133: astore #7
/*     */     //   1135: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseChoiceStepKt.log : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   1138: aload #7
/*     */     //   1140: invokevirtual getLicenseId-EIc-D0M : ()Ljava/lang/String;
/*     */     //   1143: invokestatic toString-impl : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1146: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1151: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   1154: new com/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceReady
/*     */     //   1157: dup
/*     */     //   1158: aload #7
/*     */     //   1160: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;)V
/*     */     //   1163: invokestatic done : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1166: astore #8
/*     */     //   1168: invokestatic isTraceInProgress : ()Z
/*     */     //   1171: ifeq -> 1177
/*     */     //   1174: invokestatic traceEventEnd : ()V
/*     */     //   1177: aload_1
/*     */     //   1178: invokeinterface endReplaceGroup : ()V
/*     */     //   1183: aload #8
/*     */     //   1185: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #38	-> 20
/*     */     //   #40	-> 23
/*     */     //   #84	-> 34
/*     */     //   #85	-> 38
/*     */     //   #40	-> 63
/*     */     //   #42	-> 74
/*     */     //   #86	-> 85
/*     */     //   #87	-> 111
/*     */     //   #88	-> 139
/*     */     //   #43	-> 153
/*     */     //   #89	-> 166
/*     */     //   #90	-> 185
/*     */     //   #44	-> 223
/*     */     //   #90	-> 254
/*     */     //   #91	-> 270
/*     */     //   #89	-> 275
/*     */     //   #43	-> 279
/*     */     //   #45	-> 282
/*     */     //   #88	-> 286
/*     */     //   #92	-> 295
/*     */     //   #86	-> 300
/*     */     //   #42	-> 301
/*     */     //   #48	-> 303
/*     */     //   #93	-> 318
/*     */     //   #94	-> 337
/*     */     //   #95	-> 365
/*     */     //   #48	-> 375
/*     */     //   #95	-> 386
/*     */     //   #96	-> 388
/*     */     //   #98	-> 399
/*     */     //   #93	-> 404
/*     */     //   #48	-> 411
/*     */     //   #99	-> 433
/*     */     //   #100	-> 445
/*     */     //   #101	-> 456
/*     */     //   #101	-> 496
/*     */     //   #102	-> 498
/*     */     //   #103	-> 507
/*     */     //   #104	-> 512
/*     */     //   #100	-> 514
/*     */     //   #99	-> 515
/*     */     //   #99	-> 516
/*     */     //   #48	-> 517
/*     */     //   #49	-> 544
/*     */     //   #105	-> 577
/*     */     //   #106	-> 589
/*     */     //   #107	-> 600
/*     */     //   #107	-> 640
/*     */     //   #108	-> 642
/*     */     //   #109	-> 651
/*     */     //   #110	-> 656
/*     */     //   #106	-> 658
/*     */     //   #105	-> 659
/*     */     //   #105	-> 660
/*     */     //   #49	-> 661
/*     */     //   #51	-> 688
/*     */     //   #111	-> 698
/*     */     //   #112	-> 717
/*     */     //   #113	-> 745
/*     */     //   #51	-> 755
/*     */     //   #113	-> 766
/*     */     //   #114	-> 768
/*     */     //   #116	-> 779
/*     */     //   #111	-> 784
/*     */     //   #51	-> 790
/*     */     //   #117	-> 794
/*     */     //   #51	-> 832
/*     */     //   #117	-> 854
/*     */     //   #118	-> 862
/*     */     //   #51	-> 863
/*     */     //   #52	-> 868
/*     */     //   #119	-> 878
/*     */     //   #120	-> 897
/*     */     //   #121	-> 925
/*     */     //   #52	-> 935
/*     */     //   #121	-> 946
/*     */     //   #122	-> 948
/*     */     //   #124	-> 959
/*     */     //   #119	-> 964
/*     */     //   #52	-> 965
/*     */     //   #54	-> 973
/*     */     //   #125	-> 1014
/*     */     //   #126	-> 1026
/*     */     //   #127	-> 1037
/*     */     //   #127	-> 1073
/*     */     //   #128	-> 1075
/*     */     //   #129	-> 1084
/*     */     //   #130	-> 1089
/*     */     //   #126	-> 1091
/*     */     //   #125	-> 1092
/*     */     //   #125	-> 1093
/*     */     //   #54	-> 1094
/*     */     //   #56	-> 1135
/*     */     //   #58	-> 1154
/*     */     //   #59	-> 1158
/*     */     //   #58	-> 1160
/*     */     //   #60	-> 1163
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   34	26	5	$i$f$service	I
/*     */     //   38	22	6	serviceClass$iv	Ljava/lang/Class;
/*     */     //   31	29	4	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */     //   223	31	23	$i$a$-filter-AipLicenseChoiceStepKt$aipLicenseChoiceOutcome$orderedLicenses$1$1	I
/*     */     //   220	34	22	it	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;
/*     */     //   213	54	21	element$iv$iv	Ljava/lang/Object;
/*     */     //   185	87	19	$i$f$filterTo	I
/*     */     //   182	90	17	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   182	90	18	destination$iv$iv	Ljava/util/Collection;
/*     */     //   166	110	16	$i$f$filter	I
/*     */     //   163	113	14	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   153	130	13	$i$a$-map-AipLicenseChoiceStepKt$aipLicenseChoiceOutcome$orderedLicenses$1	I
/*     */     //   150	133	12	order	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/OrderItem;
/*     */     //   139	153	11	item$iv$iv	Ljava/lang/Object;
/*     */     //   111	186	9	$i$f$mapTo	I
/*     */     //   108	189	7	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   108	189	8	destination$iv$iv	Ljava/util/Collection;
/*     */     //   85	216	6	$i$f$map	I
/*     */     //   82	219	5	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   375	11	13	$i$a$-flatMap-AipLicenseChoiceStepKt$aipLicenseChoiceOutcome$1	I
/*     */     //   372	14	12	it	Lkotlin/Pair;
/*     */     //   388	8	12	list$iv$iv	Ljava/lang/Iterable;
/*     */     //   365	31	11	element$iv$iv	Ljava/lang/Object;
/*     */     //   337	64	9	$i$f$flatMapTo	I
/*     */     //   334	67	7	$this$flatMapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   334	67	8	destination$iv$iv	Ljava/util/Collection;
/*     */     //   318	87	6	$i$f$flatMap	I
/*     */     //   315	90	5	$this$flatMap$iv	Ljava/lang/Iterable;
/*     */     //   473	5	11	$i$a$-cache-AipLicenseChoiceStepKt$aipLicenseChoiceOutcome$2	I
/*     */     //   498	11	11	value$iv	Ljava/lang/Object;
/*     */     //   445	70	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   442	73	9	it$iv	Ljava/lang/Object;
/*     */     //   433	84	8	$i$f$cache	I
/*     */     //   430	87	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   430	87	7	invalid$iv	Z
/*     */     //   617	5	11	$i$a$-cache-AipLicenseChoiceStepKt$aipLicenseChoiceOutcome$3	I
/*     */     //   642	11	11	value$iv	Ljava/lang/Object;
/*     */     //   589	70	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   586	73	9	it$iv	Ljava/lang/Object;
/*     */     //   577	84	8	$i$f$cache	I
/*     */     //   574	87	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   574	87	7	invalid$iv	Z
/*     */     //   755	11	14	$i$a$-flatMap-AipLicenseChoiceStepKt$aipLicenseChoiceOutcome$activeNotBanned$1	I
/*     */     //   752	14	13	it	Lkotlin/Pair;
/*     */     //   768	8	13	list$iv$iv	Ljava/lang/Iterable;
/*     */     //   745	31	12	element$iv$iv	Ljava/lang/Object;
/*     */     //   717	64	10	$i$f$flatMapTo	I
/*     */     //   714	67	8	$this$flatMapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   714	67	9	destination$iv$iv	Ljava/util/Collection;
/*     */     //   698	87	7	$i$f$flatMap	I
/*     */     //   695	90	6	$this$flatMap$iv	Ljava/lang/Iterable;
/*     */     //   832	22	11	$i$a$-firstOrNull-AipLicenseChoiceStepKt$aipLicenseChoiceOutcome$activeNotBanned$2	I
/*     */     //   829	25	10	it	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;
/*     */     //   822	40	9	element$iv	Ljava/lang/Object;
/*     */     //   794	69	7	$i$f$firstOrNull	I
/*     */     //   791	72	6	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*     */     //   935	11	15	$i$a$-flatMap-AipLicenseChoiceStepKt$aipLicenseChoiceOutcome$active$1	I
/*     */     //   932	14	14	it	Lkotlin/Pair;
/*     */     //   948	8	14	list$iv$iv	Ljava/lang/Iterable;
/*     */     //   925	31	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   897	64	11	$i$f$flatMapTo	I
/*     */     //   894	67	9	$this$flatMapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   894	67	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   878	87	8	$i$f$flatMap	I
/*     */     //   875	90	7	$this$flatMap$iv	Ljava/lang/Iterable;
/*     */     //   1052	5	16	$i$a$-cache-AipLicenseChoiceStepKt$aipLicenseChoiceOutcome$license$1	I
/*     */     //   1075	11	16	value$iv	Ljava/lang/Object;
/*     */     //   1026	66	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1023	69	14	it$iv	Ljava/lang/Object;
/*     */     //   1014	80	13	$i$f$cache	I
/*     */     //   1011	83	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1011	83	12	invalid$iv	Z
/*     */     //   74	1112	3	quotaExceededLicenseIds$delegate	Landroidx/compose/runtime/State;
/*     */     //   303	883	4	orderedLicenses	Ljava/util/List;
/*     */     //   868	318	5	activeNotBanned	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;
/*     */     //   973	213	6	active	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;
/*     */     //   1135	51	7	license	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;
/*     */     //   0	1186	0	availableLicenses	Ljava/util/List;
/*     */     //   0	1186	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1186	2	$changed	I
/*     */   }
/*     */   
/*     */   private static final Set<String> aipLicenseChoiceOutcome$lambda$2(State $quotaExceededLicenseIds$delegate) {
/*     */     State state = $quotaExceededLicenseIds$delegate;
/*     */     Object object = null;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/*     */     return (Set<String>)state.getValue();
/*     */   }
/*     */   
/*     */   private static final CharSequence aipLicenseChoiceOutcome$lambda$7$lambda$6(AipLicense it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it.getLicenseId-EIc-D0M();
/*     */   }
/*     */   
/*     */   private static final CharSequence aipLicenseChoiceOutcome$lambda$9$lambda$8(String it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it;
/*     */   }
/*     */   
/*     */   private static final CharSequence aipLicenseChoiceOutcome$lambda$14$lambda$13(AipLicense it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it.toString();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Logger log = Logger.getInstance(OrderItem.class);
/*     */   @NotNull
/*     */   private static final List<OrderItem> licenseSelectionOrder;
/*     */   @NotNull
/*     */   private static final Logger LOG;
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AipLicenseChoiceStepKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */