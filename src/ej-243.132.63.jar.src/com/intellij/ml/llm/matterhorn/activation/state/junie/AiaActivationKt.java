/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.junie.data.AieProvisionStore;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\032\027\020\000\032\0020\0012\b\b\002\020\002\032\0020\003H\007¢\006\002\020\004\"\016\020\005\032\0020\006X\004¢\006\002\n\000¨\006\007"}, d2 = {"aiaActivation", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;", "aieProvisionStore", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/AieProvisionStore;", "(Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/AieProvisionStore;Landroidx/compose/runtime/Composer;II)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "state.junie.impl"})
/*    */ @SourceDebugExtension({"SMAP\naiaActivation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 aiaActivation.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AiaActivationKt\n+ 2 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStoreKt\n+ 3 service.kt\ncom/intellij/openapi/components/ServiceKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,43:1\n47#2:44\n40#3,3:45\n1225#4,6:48\n1225#4,3:59\n1228#4,3:65\n481#5:54\n480#5,4:55\n484#5,2:62\n488#5:68\n480#6:64\n58#7:69\n36#7,2:70\n*S KotlinDebug\n*F\n+ 1 aiaActivation.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AiaActivationKt\n*L\n27#1:44\n27#1:45,3\n29#1:48,6\n33#1:59,3\n33#1:65,3\n33#1:54\n33#1:55,4\n33#1:62,2\n33#1:68\n33#1:64\n42#1:69\n42#1:70,2\n*E\n"})
/*    */ public final class AiaActivationKt
/*    */ {
/*    */   @NotNull
/*    */   private static final Logger LOG;
/*    */   
/*    */   @Composable
/*    */   @NotNull
/*    */   public static final AiaActivation aiaActivation(@Nullable AieProvisionStore aieProvisionStore, @Nullable Composer $composer, int $changed, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 835708752
/*    */     //   3: invokeinterface startReplaceGroup : (I)V
/*    */     //   8: iload_3
/*    */     //   9: iconst_1
/*    */     //   10: iand
/*    */     //   11: ifeq -> 111
/*    */     //   14: iconst_0
/*    */     //   15: istore #4
/*    */     //   17: iconst_0
/*    */     //   18: istore #5
/*    */     //   20: ldc com/intellij/ml/llm/matterhorn/activation/state/junie/data/AieProvisionStore
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
/*    */     //   107: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/data/AieProvisionStore
/*    */     //   110: astore_0
/*    */     //   111: invokestatic isTraceInProgress : ()Z
/*    */     //   114: ifeq -> 126
/*    */     //   117: ldc 835708752
/*    */     //   119: iload_2
/*    */     //   120: iconst_m1
/*    */     //   121: ldc 'com.intellij.ml.llm.matterhorn.activation.state.junie.aiaActivation (aiaActivation.kt:27)'
/*    */     //   123: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   126: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/AiaActivationKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   129: aload_1
/*    */     //   130: ldc 1701730508
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
/*    */     //   169: astore #19
/*    */     //   171: iconst_0
/*    */     //   172: istore #10
/*    */     //   174: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*    */     //   179: aload #19
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
/*    */     //   223: invokevirtual getProvisionStatusLazy : ()Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazy;
/*    */     //   226: aload_1
/*    */     //   227: iconst_0
/*    */     //   228: invokestatic observeValue : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazy;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
/*    */     //   231: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus
/*    */     //   234: astore #4
/*    */     //   236: iconst_0
/*    */     //   237: istore #7
/*    */     //   239: nop
/*    */     //   240: iconst_0
/*    */     //   241: istore #8
/*    */     //   243: aload_1
/*    */     //   244: ldc 773894976
/*    */     //   246: ldc 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*    */     //   248: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   251: aload_1
/*    */     //   252: astore #9
/*    */     //   254: aload_1
/*    */     //   255: ldc -954370320
/*    */     //   257: ldc 'CC(remember):Effects.kt#9igjgp'
/*    */     //   259: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   262: aload_1
/*    */     //   263: astore #10
/*    */     //   265: iconst_0
/*    */     //   266: istore #11
/*    */     //   268: iconst_0
/*    */     //   269: istore #12
/*    */     //   271: aload #10
/*    */     //   273: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   278: astore #13
/*    */     //   280: iconst_0
/*    */     //   281: istore #14
/*    */     //   283: aload #13
/*    */     //   285: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   288: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   291: if_acmpne -> 338
/*    */     //   294: iconst_0
/*    */     //   295: istore #15
/*    */     //   297: iconst_0
/*    */     //   298: istore #16
/*    */     //   300: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*    */     //   303: checkcast kotlin/coroutines/CoroutineContext
/*    */     //   306: aload #9
/*    */     //   308: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*    */     //   311: astore #20
/*    */     //   313: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*    */     //   316: dup
/*    */     //   317: aload #20
/*    */     //   319: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*    */     //   322: astore #16
/*    */     //   324: aload #10
/*    */     //   326: aload #16
/*    */     //   328: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   333: aload #16
/*    */     //   335: goto -> 340
/*    */     //   338: aload #13
/*    */     //   340: nop
/*    */     //   341: nop
/*    */     //   342: nop
/*    */     //   343: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*    */     //   346: astore #17
/*    */     //   348: aload_1
/*    */     //   349: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   352: aload #17
/*    */     //   354: astore #18
/*    */     //   356: aload #18
/*    */     //   358: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*    */     //   361: astore #17
/*    */     //   363: aload_1
/*    */     //   364: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   367: aload #17
/*    */     //   369: nop
/*    */     //   370: astore #5
/*    */     //   372: aload #4
/*    */     //   374: astore #7
/*    */     //   376: aload #7
/*    */     //   378: getstatic com/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieInitializing.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieInitializing;
/*    */     //   381: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   384: ifeq -> 424
/*    */     //   387: aload_1
/*    */     //   388: ldc 1701737765
/*    */     //   390: invokeinterface startReplaceGroup : (I)V
/*    */     //   395: aload_1
/*    */     //   396: invokeinterface endReplaceGroup : ()V
/*    */     //   401: new com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation$AiaActivationTrackUnknown
/*    */     //   404: dup
/*    */     //   405: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/AiEnterprisePending$AieProvisionStatusUnknown.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiEnterprisePending$AieProvisionStatusUnknown;
/*    */     //   408: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationProgressing
/*    */     //   411: invokestatic activationProgressing : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationProgressing;)Ljava/lang/Object;
/*    */     //   414: aconst_null
/*    */     //   415: invokespecial <init> : (Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   418: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation
/*    */     //   421: goto -> 524
/*    */     //   424: aload #7
/*    */     //   426: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieFallback
/*    */     //   429: ifeq -> 458
/*    */     //   432: aload_1
/*    */     //   433: ldc 1701741795
/*    */     //   435: invokeinterface startReplaceGroup : (I)V
/*    */     //   440: aload_1
/*    */     //   441: iconst_0
/*    */     //   442: invokestatic aiProJbaActivation : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
/*    */     //   445: astore #8
/*    */     //   447: aload_1
/*    */     //   448: invokeinterface endReplaceGroup : ()V
/*    */     //   453: aload #8
/*    */     //   455: goto -> 524
/*    */     //   458: aload #7
/*    */     //   460: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieProvisioned
/*    */     //   463: ifeq -> 502
/*    */     //   466: aload_1
/*    */     //   467: ldc 1701743914
/*    */     //   469: invokeinterface startReplaceGroup : (I)V
/*    */     //   474: aconst_null
/*    */     //   475: aload #4
/*    */     //   477: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieProvisioned
/*    */     //   480: aload_1
/*    */     //   481: iconst_0
/*    */     //   482: iconst_1
/*    */     //   483: invokestatic aiEnterpriseActivation : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/AieProvisionStore;Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieProvisioned;Landroidx/compose/runtime/Composer;II)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiEnterpriseActivation;
/*    */     //   486: astore #8
/*    */     //   488: aload_1
/*    */     //   489: invokeinterface endReplaceGroup : ()V
/*    */     //   494: aload #8
/*    */     //   496: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation
/*    */     //   499: goto -> 524
/*    */     //   502: aload_1
/*    */     //   503: ldc 1701735858
/*    */     //   505: invokeinterface startReplaceGroup : (I)V
/*    */     //   510: aload_1
/*    */     //   511: invokeinterface endReplaceGroup : ()V
/*    */     //   516: new kotlin/NoWhenBranchMatchedException
/*    */     //   519: dup
/*    */     //   520: invokespecial <init> : ()V
/*    */     //   523: athrow
/*    */     //   524: astore #6
/*    */     //   526: invokestatic isTraceInProgress : ()Z
/*    */     //   529: ifeq -> 535
/*    */     //   532: invokestatic traceEventEnd : ()V
/*    */     //   535: aload_1
/*    */     //   536: invokeinterface endReplaceGroup : ()V
/*    */     //   541: aload #6
/*    */     //   543: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #27	-> 14
/*    */     //   #44	-> 17
/*    */     //   #45	-> 20
/*    */     //   #46	-> 24
/*    */     //   #47	-> 39
/*    */     //   #46	-> 102
/*    */     //   #44	-> 106
/*    */     //   #28	-> 123
/*    */     //   #29	-> 126
/*    */     //   #48	-> 146
/*    */     //   #49	-> 158
/*    */     //   #50	-> 169
/*    */     //   #50	-> 182
/*    */     //   #51	-> 184
/*    */     //   #52	-> 193
/*    */     //   #53	-> 198
/*    */     //   #49	-> 200
/*    */     //   #48	-> 201
/*    */     //   #48	-> 202
/*    */     //   #29	-> 203
/*    */     //   #31	-> 222
/*    */     //   #33	-> 239
/*    */     //   #54	-> 248
/*    */     //   #55	-> 251
/*    */     //   #57	-> 252
/*    */     //   #58	-> 259
/*    */     //   #59	-> 271
/*    */     //   #60	-> 283
/*    */     //   #61	-> 294
/*    */     //   #62	-> 297
/*    */     //   #63	-> 297
/*    */     //   #64	-> 300
/*    */     //   #63	-> 303
/*    */     //   #62	-> 311
/*    */     //   #61	-> 322
/*    */     //   #65	-> 324
/*    */     //   #66	-> 333
/*    */     //   #67	-> 338
/*    */     //   #60	-> 340
/*    */     //   #59	-> 341
/*    */     //   #59	-> 342
/*    */     //   #58	-> 343
/*    */     //   #68	-> 356
/*    */     //   #54	-> 364
/*    */     //   #68	-> 369
/*    */     //   #33	-> 370
/*    */     //   #35	-> 372
/*    */     //   #36	-> 376
/*    */     //   #37	-> 424
/*    */     //   #38	-> 458
/*    */     //   #35	-> 502
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   20	83	5	$i$f$service	I
/*    */     //   24	79	6	serviceClass$iv$iv	Ljava/lang/Class;
/*    */     //   17	90	4	$i$f$rememberDataStore	I
/*    */     //   174	5	10	$i$a$-cache-AiaActivationKt$aiaActivation$1	I
/*    */     //   184	11	10	value$iv	Ljava/lang/Object;
/*    */     //   158	43	9	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   155	46	8	it$iv	Ljava/lang/Object;
/*    */     //   146	57	7	$i$f$cache	I
/*    */     //   143	60	5	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   143	60	6	invalid$iv	Z
/*    */     //   300	3	16	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*    */     //   297	25	15	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*    */     //   324	11	16	value$iv$iv	Ljava/lang/Object;
/*    */     //   283	58	14	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*    */     //   280	61	13	it$iv$iv	Ljava/lang/Object;
/*    */     //   271	72	12	$i$f$cache	I
/*    */     //   268	75	10	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   268	75	11	invalid$iv$iv	Z
/*    */     //   243	127	8	$i$f$rememberCoroutineScope	I
/*    */     //   254	116	9	composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   356	14	18	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*    */     //   240	130	7	$changed$iv	I
/*    */     //   236	308	4	provisionStatus	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus;
/*    */     //   372	172	5	scope	Lkotlinx/coroutines/CoroutineScope;
/*    */     //   0	544	0	aieProvisionStore	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/AieProvisionStore;
/*    */     //   0	544	1	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	544	2	$changed	I
/*    */   }
/*    */   
/*    */   private static final String aiaActivation$lambda$1$lambda$0() {
/* 29 */     return "AI Assistant activation";
/*    */   }
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
/*    */   static {
/* 42 */     int $i$f$fileLogger = 0;
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
/* 69 */     int $i$f$currentClassLogger = 0;
/* 70 */     Class<?> clazz$iv$iv = MethodHandles.lookup().lookupClass();
/* 71 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(clazz$iv$iv), "getInstance(...)"); LOG = Logger.getInstance(clazz$iv$iv);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AiaActivationKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */