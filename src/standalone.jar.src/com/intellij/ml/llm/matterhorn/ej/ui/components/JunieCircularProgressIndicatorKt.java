/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ 
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*    */ import androidx.compose.runtime.State;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.reflect.KProperty;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.ui.icon.PathIconKey;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\b\032-\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007H\007¢\006\004\b\b\020\t¨\006\n²\006\n\020\013\032\0020\fX\002"}, d2 = {"JunieCircularProgressIndicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "tint", "Landroidx/compose/ui/graphics/Color;", "string", "", "JunieCircularProgressIndicator-3IgeMak", "(Landroidx/compose/ui/Modifier;JLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "standalone", "currentIndex", ""})
/*    */ @SourceDebugExtension({"SMAP\nJunieCircularProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieCircularProgressIndicator.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieCircularProgressIndicatorKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,40:1\n1225#2,6:41\n1225#2,6:47\n81#3:53\n107#3,2:54\n*S KotlinDebug\n*F\n+ 1 JunieCircularProgressIndicator.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieCircularProgressIndicatorKt\n*L\n23#1:41,6\n26#1:47,6\n23#1:53\n23#1:54,2\n*E\n"})
/*    */ public final class JunieCircularProgressIndicatorKt {
/* 23 */   private static final int JunieCircularProgressIndicator_3IgeMak$lambda$1(MutableState $currentIndex$delegate) { State state = (State)$currentIndex$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
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
/* 53 */       (Number)state.getValue()).intValue(); }
/*    */   @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void JunieCircularProgressIndicator-3IgeMak(@Nullable Modifier modifier, long tint, @Nullable String string, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: ldc -35329726
/*    */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   9: astore #4
/*    */     //   11: iload #5
/*    */     //   13: istore #7
/*    */     //   15: iload #6
/*    */     //   17: iconst_1
/*    */     //   18: iand
/*    */     //   19: ifeq -> 32
/*    */     //   22: iload #7
/*    */     //   24: bipush #6
/*    */     //   26: ior
/*    */     //   27: istore #7
/*    */     //   29: goto -> 61
/*    */     //   32: iload #5
/*    */     //   34: bipush #6
/*    */     //   36: iand
/*    */     //   37: ifne -> 61
/*    */     //   40: iload #7
/*    */     //   42: aload #4
/*    */     //   44: aload_0
/*    */     //   45: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   50: ifeq -> 57
/*    */     //   53: iconst_4
/*    */     //   54: goto -> 58
/*    */     //   57: iconst_2
/*    */     //   58: ior
/*    */     //   59: istore #7
/*    */     //   61: iload #6
/*    */     //   63: iconst_2
/*    */     //   64: iand
/*    */     //   65: ifeq -> 78
/*    */     //   68: iload #7
/*    */     //   70: bipush #48
/*    */     //   72: ior
/*    */     //   73: istore #7
/*    */     //   75: goto -> 109
/*    */     //   78: iload #5
/*    */     //   80: bipush #48
/*    */     //   82: iand
/*    */     //   83: ifne -> 109
/*    */     //   86: iload #7
/*    */     //   88: aload #4
/*    */     //   90: lload_1
/*    */     //   91: invokeinterface changed : (J)Z
/*    */     //   96: ifeq -> 104
/*    */     //   99: bipush #32
/*    */     //   101: goto -> 106
/*    */     //   104: bipush #16
/*    */     //   106: ior
/*    */     //   107: istore #7
/*    */     //   109: iload #6
/*    */     //   111: iconst_4
/*    */     //   112: iand
/*    */     //   113: ifeq -> 127
/*    */     //   116: iload #7
/*    */     //   118: sipush #384
/*    */     //   121: ior
/*    */     //   122: istore #7
/*    */     //   124: goto -> 161
/*    */     //   127: iload #5
/*    */     //   129: sipush #384
/*    */     //   132: iand
/*    */     //   133: ifne -> 161
/*    */     //   136: iload #7
/*    */     //   138: aload #4
/*    */     //   140: aload_3
/*    */     //   141: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   146: ifeq -> 155
/*    */     //   149: sipush #256
/*    */     //   152: goto -> 158
/*    */     //   155: sipush #128
/*    */     //   158: ior
/*    */     //   159: istore #7
/*    */     //   161: iload #7
/*    */     //   163: sipush #147
/*    */     //   166: iand
/*    */     //   167: sipush #146
/*    */     //   170: if_icmpne -> 183
/*    */     //   173: aload #4
/*    */     //   175: invokeinterface getSkipping : ()Z
/*    */     //   180: ifne -> 536
/*    */     //   183: iload #6
/*    */     //   185: iconst_1
/*    */     //   186: iand
/*    */     //   187: ifeq -> 197
/*    */     //   190: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   193: checkcast androidx/compose/ui/Modifier
/*    */     //   196: astore_0
/*    */     //   197: iload #6
/*    */     //   199: iconst_2
/*    */     //   200: iand
/*    */     //   201: ifeq -> 211
/*    */     //   204: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*    */     //   207: invokevirtual getUnspecified-0d7_KjU : ()J
/*    */     //   210: lstore_1
/*    */     //   211: iload #6
/*    */     //   213: iconst_4
/*    */     //   214: iand
/*    */     //   215: ifeq -> 221
/*    */     //   218: ldc 'Loading Icon'
/*    */     //   220: astore_3
/*    */     //   221: invokestatic isTraceInProgress : ()Z
/*    */     //   224: ifeq -> 237
/*    */     //   227: ldc -35329726
/*    */     //   229: iload #7
/*    */     //   231: iconst_m1
/*    */     //   232: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieCircularProgressIndicator (JunieCircularProgressIndicator.kt:21)'
/*    */     //   234: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   237: aload #4
/*    */     //   239: ldc -1935637563
/*    */     //   241: invokeinterface startReplaceGroup : (I)V
/*    */     //   246: aload #4
/*    */     //   248: astore #10
/*    */     //   250: iconst_0
/*    */     //   251: istore #11
/*    */     //   253: nop
/*    */     //   254: iconst_0
/*    */     //   255: istore #12
/*    */     //   257: aload #10
/*    */     //   259: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   264: astore #13
/*    */     //   266: iconst_0
/*    */     //   267: istore #14
/*    */     //   269: aload #13
/*    */     //   271: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   274: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   277: if_acmpne -> 309
/*    */     //   280: iconst_0
/*    */     //   281: istore #15
/*    */     //   283: iconst_0
/*    */     //   284: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   287: aconst_null
/*    */     //   288: iconst_2
/*    */     //   289: aconst_null
/*    */     //   290: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*    */     //   293: astore #15
/*    */     //   295: aload #10
/*    */     //   297: aload #15
/*    */     //   299: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   304: aload #15
/*    */     //   306: goto -> 311
/*    */     //   309: aload #13
/*    */     //   311: nop
/*    */     //   312: nop
/*    */     //   313: nop
/*    */     //   314: checkcast androidx/compose/runtime/MutableState
/*    */     //   317: astore #9
/*    */     //   319: aload #4
/*    */     //   321: invokeinterface endReplaceGroup : ()V
/*    */     //   326: aload #9
/*    */     //   328: astore #8
/*    */     //   330: aload #4
/*    */     //   332: iconst_0
/*    */     //   333: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*    */     //   336: invokevirtual getSpinnerIcons : ()Ljava/util/List;
/*    */     //   339: astore #9
/*    */     //   341: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   344: aload #4
/*    */     //   346: ldc -1935634213
/*    */     //   348: invokeinterface startReplaceGroup : (I)V
/*    */     //   353: aload #4
/*    */     //   355: astore #11
/*    */     //   357: aload #4
/*    */     //   359: aload #9
/*    */     //   361: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   366: istore #12
/*    */     //   368: iconst_0
/*    */     //   369: istore #13
/*    */     //   371: aload #11
/*    */     //   373: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   378: astore #14
/*    */     //   380: iconst_0
/*    */     //   381: istore #15
/*    */     //   383: iload #12
/*    */     //   385: ifne -> 399
/*    */     //   388: aload #14
/*    */     //   390: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   393: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   396: if_acmpne -> 438
/*    */     //   399: astore #18
/*    */     //   401: iconst_0
/*    */     //   402: istore #16
/*    */     //   404: new com/intellij/ml/llm/matterhorn/ej/ui/components/JunieCircularProgressIndicatorKt$JunieCircularProgressIndicator$1$1
/*    */     //   407: dup
/*    */     //   408: aload #9
/*    */     //   410: aload #8
/*    */     //   412: aconst_null
/*    */     //   413: invokespecial <init> : (Ljava/util/List;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*    */     //   416: checkcast kotlin/jvm/functions/Function2
/*    */     //   419: aload #18
/*    */     //   421: swap
/*    */     //   422: astore #17
/*    */     //   424: aload #11
/*    */     //   426: aload #17
/*    */     //   428: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   433: aload #17
/*    */     //   435: goto -> 440
/*    */     //   438: aload #14
/*    */     //   440: nop
/*    */     //   441: nop
/*    */     //   442: nop
/*    */     //   443: checkcast kotlin/jvm/functions/Function2
/*    */     //   446: astore #10
/*    */     //   448: aload #4
/*    */     //   450: invokeinterface endReplaceGroup : ()V
/*    */     //   455: aload #10
/*    */     //   457: aload #4
/*    */     //   459: bipush #6
/*    */     //   461: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*    */     //   464: aload #9
/*    */     //   466: aload #8
/*    */     //   468: invokestatic JunieCircularProgressIndicator_3IgeMak$lambda$1 : (Landroidx/compose/runtime/MutableState;)I
/*    */     //   471: invokeinterface get : (I)Ljava/lang/Object;
/*    */     //   476: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*    */     //   479: aload_3
/*    */     //   480: aload_0
/*    */     //   481: aconst_null
/*    */     //   482: lload_1
/*    */     //   483: iconst_0
/*    */     //   484: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*    */     //   487: aload #4
/*    */     //   489: getstatic org/jetbrains/jewel/ui/icon/PathIconKey.$stable : I
/*    */     //   492: bipush #112
/*    */     //   494: iload #7
/*    */     //   496: iconst_3
/*    */     //   497: ishr
/*    */     //   498: iand
/*    */     //   499: ior
/*    */     //   500: sipush #896
/*    */     //   503: iload #7
/*    */     //   505: bipush #6
/*    */     //   507: ishl
/*    */     //   508: iand
/*    */     //   509: ior
/*    */     //   510: ldc 57344
/*    */     //   512: iload #7
/*    */     //   514: bipush #9
/*    */     //   516: ishl
/*    */     //   517: iand
/*    */     //   518: ior
/*    */     //   519: bipush #8
/*    */     //   521: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*    */     //   524: invokestatic isTraceInProgress : ()Z
/*    */     //   527: ifeq -> 543
/*    */     //   530: invokestatic traceEventEnd : ()V
/*    */     //   533: goto -> 543
/*    */     //   536: aload #4
/*    */     //   538: invokeinterface skipToGroupEnd : ()V
/*    */     //   543: aload #4
/*    */     //   545: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   550: dup
/*    */     //   551: ifnull -> 574
/*    */     //   554: aload_0
/*    */     //   555: lload_1
/*    */     //   556: aload_3
/*    */     //   557: iload #5
/*    */     //   559: iload #6
/*    */     //   561: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;JLjava/lang/String;II)Lkotlin/jvm/functions/Function2;
/*    */     //   566: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   571: goto -> 575
/*    */     //   574: pop
/*    */     //   575: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 0
/*    */     //   #19	-> 190
/*    */     //   #20	-> 204
/*    */     //   #21	-> 218
/*    */     //   #22	-> 234
/*    */     //   #23	-> 253
/*    */     //   #41	-> 257
/*    */     //   #42	-> 269
/*    */     //   #43	-> 280
/*    */     //   #23	-> 283
/*    */     //   #43	-> 293
/*    */     //   #44	-> 295
/*    */     //   #45	-> 304
/*    */     //   #46	-> 309
/*    */     //   #42	-> 311
/*    */     //   #41	-> 312
/*    */     //   #41	-> 313
/*    */     //   #23	-> 314
/*    */     //   #24	-> 333
/*    */     //   #26	-> 341
/*    */     //   #47	-> 371
/*    */     //   #48	-> 383
/*    */     //   #49	-> 399
/*    */     //   #26	-> 404
/*    */     //   #49	-> 422
/*    */     //   #50	-> 424
/*    */     //   #51	-> 433
/*    */     //   #52	-> 438
/*    */     //   #48	-> 440
/*    */     //   #47	-> 441
/*    */     //   #47	-> 442
/*    */     //   #26	-> 443
/*    */     //   #34	-> 464
/*    */     //   #35	-> 479
/*    */     //   #36	-> 480
/*    */     //   #37	-> 482
/*    */     //   #33	-> 521
/*    */     //   #39	-> 536
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   283	10	15	$i$a$-cache-JunieCircularProgressIndicatorKt$JunieCircularProgressIndicator$currentIndex$2	I
/*    */     //   295	11	15	value$iv	Ljava/lang/Object;
/*    */     //   269	43	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   266	46	13	it$iv	Ljava/lang/Object;
/*    */     //   257	57	12	$i$f$cache	I
/*    */     //   254	60	10	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   254	60	11	invalid$iv	Z
/*    */     //   404	15	16	$i$a$-cache-JunieCircularProgressIndicatorKt$JunieCircularProgressIndicator$1	I
/*    */     //   424	11	17	value$iv	Ljava/lang/Object;
/*    */     //   383	58	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   380	61	14	it$iv	Ljava/lang/Object;
/*    */     //   371	72	13	$i$f$cache	I
/*    */     //   368	75	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   368	75	12	invalid$iv	Z
/*    */     //   330	203	8	currentIndex$delegate	Landroidx/compose/runtime/MutableState;
/*    */     //   341	192	9	iconList	Ljava/util/List;
/*    */     //   15	561	7	$dirty	I
/*    */     //   0	576	0	modifier	Landroidx/compose/ui/Modifier;
/*    */     //   0	576	1	tint	J
/*    */     //   0	576	3	string	Ljava/lang/String;
/*    */     //   0	576	4	$composer	Landroidx/compose/runtime/Composer;
/* 54 */     //   0	576	5	$changed	I } private static final void JunieCircularProgressIndicator_3IgeMak$lambda$2(MutableState $currentIndex$delegate, int <set-?>) { MutableState mutableState = $currentIndex$delegate; Object object1 = null, object2 = null; Object value$iv = Integer.valueOf(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); }
/*    */ 
/*    */   
/*    */   private static final Unit JunieCircularProgressIndicator_3IgeMak$lambda$4(Modifier $modifier, long $tint, String $string, int $$changed, int $$default, Composer $composer, int $force) {
/*    */     JunieCircularProgressIndicator-3IgeMak($modifier, $tint, $string, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "JunieCircularProgressIndicator.kt", l = {28}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.components.JunieCircularProgressIndicatorKt$JunieCircularProgressIndicator$1$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class JunieCircularProgressIndicatorKt$JunieCircularProgressIndicator$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     JunieCircularProgressIndicatorKt$JunieCircularProgressIndicator$1$1(List<PathIconKey> $iconList, MutableState<Integer> $currentIndex$delegate, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore_2
/*    */       //   4: aload_0
/*    */       //   5: getfield label : I
/*    */       //   8: tableswitch default -> 94, 0 -> 32, 1 -> 59
/*    */       //   32: aload_1
/*    */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   36: nop
/*    */       //   37: ldc2_w 60
/*    */       //   40: aload_0
/*    */       //   41: checkcast kotlin/coroutines/Continuation
/*    */       //   44: aload_0
/*    */       //   45: iconst_1
/*    */       //   46: putfield label : I
/*    */       //   49: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   52: dup
/*    */       //   53: aload_2
/*    */       //   54: if_acmpne -> 64
/*    */       //   57: aload_2
/*    */       //   58: areturn
/*    */       //   59: aload_1
/*    */       //   60: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   63: aload_1
/*    */       //   64: pop
/*    */       //   65: aload_0
/*    */       //   66: getfield $currentIndex$delegate : Landroidx/compose/runtime/MutableState;
/*    */       //   69: aload_0
/*    */       //   70: getfield $currentIndex$delegate : Landroidx/compose/runtime/MutableState;
/*    */       //   73: invokestatic access$JunieCircularProgressIndicator_3IgeMak$lambda$1 : (Landroidx/compose/runtime/MutableState;)I
/*    */       //   76: iconst_1
/*    */       //   77: iadd
/*    */       //   78: aload_0
/*    */       //   79: getfield $iconList : Ljava/util/List;
/*    */       //   82: invokeinterface size : ()I
/*    */       //   87: irem
/*    */       //   88: invokestatic access$JunieCircularProgressIndicator_3IgeMak$lambda$2 : (Landroidx/compose/runtime/MutableState;I)V
/*    */       //   91: goto -> 36
/*    */       //   94: new java/lang/IllegalStateException
/*    */       //   97: dup
/*    */       //   98: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   100: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   103: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #26	-> 3
/*    */       //   #27	-> 36
/*    */       //   #28	-> 37
/*    */       //   #26	-> 57
/*    */       //   #29	-> 64
/*    */       //   #26	-> 94
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	104	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/JunieCircularProgressIndicatorKt$JunieCircularProgressIndicator$1$1;
/*    */       //   36	58	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super JunieCircularProgressIndicatorKt$JunieCircularProgressIndicator$1$1> $completion) {
/*    */       return (Continuation<Unit>)new JunieCircularProgressIndicatorKt$JunieCircularProgressIndicator$1$1(this.$iconList, this.$currentIndex$delegate, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((JunieCircularProgressIndicatorKt$JunieCircularProgressIndicator$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieCircularProgressIndicatorKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */