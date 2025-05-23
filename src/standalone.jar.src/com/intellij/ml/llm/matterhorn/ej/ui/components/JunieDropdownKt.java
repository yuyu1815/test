/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import androidx.compose.runtime.ProvidableCompositionLocal;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.GlobalColors;
/*     */ import org.jetbrains.jewel.foundation.theme.JewelTheme;
/*     */ import org.jetbrains.jewel.ui.Outline;
/*     */ import org.jetbrains.jewel.ui.component.MenuScope;
/*     */ import org.jetbrains.jewel.ui.component.styling.DropdownColors;
/*     */ import org.jetbrains.jewel.ui.component.styling.DropdownMetrics;
/*     */ import org.jetbrains.jewel.ui.component.styling.DropdownStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.MenuStyle;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000T\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\032x\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\027\020\013\032\023\022\004\022\0020\r\022\004\022\0020\0010\f¢\006\002\b\0162\036\b\002\020\017\032\030\022\004\022\0020\020\022\004\022\0020\0010\f¢\006\002\b\021¢\006\002\b\016H\007¢\006\002\020\022\032\r\020\023\032\0020\024H\007¢\006\002\020\025\032\r\020\026\032\0020\027H\007¢\006\002\020\030\"\027\020\031\032\b\022\004\022\0020\0270\032¢\006\b\n\000\032\004\b\033\020\034¨\006\035"}, d2 = {"JunieTreeDotsDropdown", "", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "menuModifier", "outline", "Lorg/jetbrains/jewel/ui/Outline;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "menuContent", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/ui/component/MenuScope;", "Lkotlin/ExtensionFunctionType;", "content", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NoOutlineFocusGlobalColor", "Lorg/jetbrains/jewel/foundation/GlobalColors;", "(Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/foundation/GlobalColors;", "JunieDropdownStyle", "Lorg/jetbrains/jewel/ui/component/styling/DropdownStyle;", "(Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/DropdownStyle;", "LocalJunieDropdownStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalJunieDropdownStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "standalone"})
/*     */ @SourceDebugExtension({"SMAP\nJunieDropdown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieDropdown.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieDropdownKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,150:1\n1225#2,6:151\n149#3:157\n149#3:158\n149#3:159\n149#3:160\n*S KotlinDebug\n*F\n+ 1 JunieDropdown.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieDropdownKt\n*L\n38#1:151,6\n89#1:157\n136#1:158\n138#1:159\n139#1:160\n*E\n"})
/*     */ public final class JunieDropdownKt {
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void JunieTreeDotsDropdown(@Nullable Modifier modifier, boolean enabled, @Nullable Modifier menuModifier, @Nullable Outline outline, @Nullable MutableInteractionSource interactionSource, @NotNull Function1 menuContent, @Nullable Function3 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: ldc 'menuContent'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #7
/*     */     //   9: ldc 2040191321
/*     */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   16: astore #7
/*     */     //   18: iload #8
/*     */     //   20: istore #10
/*     */     //   22: iload #9
/*     */     //   24: iconst_1
/*     */     //   25: iand
/*     */     //   26: ifeq -> 39
/*     */     //   29: iload #10
/*     */     //   31: bipush #6
/*     */     //   33: ior
/*     */     //   34: istore #10
/*     */     //   36: goto -> 68
/*     */     //   39: iload #8
/*     */     //   41: bipush #6
/*     */     //   43: iand
/*     */     //   44: ifne -> 68
/*     */     //   47: iload #10
/*     */     //   49: aload #7
/*     */     //   51: aload_0
/*     */     //   52: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   57: ifeq -> 64
/*     */     //   60: iconst_4
/*     */     //   61: goto -> 65
/*     */     //   64: iconst_2
/*     */     //   65: ior
/*     */     //   66: istore #10
/*     */     //   68: iload #9
/*     */     //   70: iconst_2
/*     */     //   71: iand
/*     */     //   72: ifeq -> 85
/*     */     //   75: iload #10
/*     */     //   77: bipush #48
/*     */     //   79: ior
/*     */     //   80: istore #10
/*     */     //   82: goto -> 116
/*     */     //   85: iload #8
/*     */     //   87: bipush #48
/*     */     //   89: iand
/*     */     //   90: ifne -> 116
/*     */     //   93: iload #10
/*     */     //   95: aload #7
/*     */     //   97: iload_1
/*     */     //   98: invokeinterface changed : (Z)Z
/*     */     //   103: ifeq -> 111
/*     */     //   106: bipush #32
/*     */     //   108: goto -> 113
/*     */     //   111: bipush #16
/*     */     //   113: ior
/*     */     //   114: istore #10
/*     */     //   116: iload #9
/*     */     //   118: iconst_4
/*     */     //   119: iand
/*     */     //   120: ifeq -> 134
/*     */     //   123: iload #10
/*     */     //   125: sipush #384
/*     */     //   128: ior
/*     */     //   129: istore #10
/*     */     //   131: goto -> 168
/*     */     //   134: iload #8
/*     */     //   136: sipush #384
/*     */     //   139: iand
/*     */     //   140: ifne -> 168
/*     */     //   143: iload #10
/*     */     //   145: aload #7
/*     */     //   147: aload_2
/*     */     //   148: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   153: ifeq -> 162
/*     */     //   156: sipush #256
/*     */     //   159: goto -> 165
/*     */     //   162: sipush #128
/*     */     //   165: ior
/*     */     //   166: istore #10
/*     */     //   168: iload #9
/*     */     //   170: bipush #8
/*     */     //   172: iand
/*     */     //   173: ifeq -> 187
/*     */     //   176: iload #10
/*     */     //   178: sipush #3072
/*     */     //   181: ior
/*     */     //   182: istore #10
/*     */     //   184: goto -> 221
/*     */     //   187: iload #8
/*     */     //   189: sipush #3072
/*     */     //   192: iand
/*     */     //   193: ifne -> 221
/*     */     //   196: iload #10
/*     */     //   198: aload #7
/*     */     //   200: aload_3
/*     */     //   201: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   206: ifeq -> 215
/*     */     //   209: sipush #2048
/*     */     //   212: goto -> 218
/*     */     //   215: sipush #1024
/*     */     //   218: ior
/*     */     //   219: istore #10
/*     */     //   221: iload #9
/*     */     //   223: bipush #16
/*     */     //   225: iand
/*     */     //   226: ifeq -> 240
/*     */     //   229: iload #10
/*     */     //   231: sipush #24576
/*     */     //   234: ior
/*     */     //   235: istore #10
/*     */     //   237: goto -> 275
/*     */     //   240: iload #8
/*     */     //   242: sipush #24576
/*     */     //   245: iand
/*     */     //   246: ifne -> 275
/*     */     //   249: iload #10
/*     */     //   251: aload #7
/*     */     //   253: aload #4
/*     */     //   255: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   260: ifeq -> 269
/*     */     //   263: sipush #16384
/*     */     //   266: goto -> 272
/*     */     //   269: sipush #8192
/*     */     //   272: ior
/*     */     //   273: istore #10
/*     */     //   275: iload #9
/*     */     //   277: bipush #32
/*     */     //   279: iand
/*     */     //   280: ifeq -> 293
/*     */     //   283: iload #10
/*     */     //   285: ldc 196608
/*     */     //   287: ior
/*     */     //   288: istore #10
/*     */     //   290: goto -> 325
/*     */     //   293: iload #8
/*     */     //   295: ldc 196608
/*     */     //   297: iand
/*     */     //   298: ifne -> 325
/*     */     //   301: iload #10
/*     */     //   303: aload #7
/*     */     //   305: aload #5
/*     */     //   307: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   312: ifeq -> 320
/*     */     //   315: ldc 131072
/*     */     //   317: goto -> 322
/*     */     //   320: ldc 65536
/*     */     //   322: ior
/*     */     //   323: istore #10
/*     */     //   325: iload #9
/*     */     //   327: bipush #64
/*     */     //   329: iand
/*     */     //   330: ifeq -> 343
/*     */     //   333: iload #10
/*     */     //   335: ldc 1572864
/*     */     //   337: ior
/*     */     //   338: istore #10
/*     */     //   340: goto -> 375
/*     */     //   343: iload #8
/*     */     //   345: ldc 1572864
/*     */     //   347: iand
/*     */     //   348: ifne -> 375
/*     */     //   351: iload #10
/*     */     //   353: aload #7
/*     */     //   355: aload #6
/*     */     //   357: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   362: ifeq -> 370
/*     */     //   365: ldc 1048576
/*     */     //   367: goto -> 372
/*     */     //   370: ldc 524288
/*     */     //   372: ior
/*     */     //   373: istore #10
/*     */     //   375: iload #10
/*     */     //   377: ldc 599187
/*     */     //   379: iand
/*     */     //   380: ldc 599186
/*     */     //   382: if_icmpne -> 395
/*     */     //   385: aload #7
/*     */     //   387: invokeinterface getSkipping : ()Z
/*     */     //   392: ifne -> 662
/*     */     //   395: iload #9
/*     */     //   397: iconst_1
/*     */     //   398: iand
/*     */     //   399: ifeq -> 409
/*     */     //   402: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   405: checkcast androidx/compose/ui/Modifier
/*     */     //   408: astore_0
/*     */     //   409: iload #9
/*     */     //   411: iconst_2
/*     */     //   412: iand
/*     */     //   413: ifeq -> 418
/*     */     //   416: iconst_1
/*     */     //   417: istore_1
/*     */     //   418: iload #9
/*     */     //   420: iconst_4
/*     */     //   421: iand
/*     */     //   422: ifeq -> 432
/*     */     //   425: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   428: checkcast androidx/compose/ui/Modifier
/*     */     //   431: astore_2
/*     */     //   432: iload #9
/*     */     //   434: bipush #8
/*     */     //   436: iand
/*     */     //   437: ifeq -> 444
/*     */     //   440: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   443: astore_3
/*     */     //   444: iload #9
/*     */     //   446: bipush #16
/*     */     //   448: iand
/*     */     //   449: ifeq -> 537
/*     */     //   452: aload #7
/*     */     //   454: ldc 737003228
/*     */     //   456: invokeinterface startReplaceGroup : (I)V
/*     */     //   461: aload #7
/*     */     //   463: astore #12
/*     */     //   465: iconst_0
/*     */     //   466: istore #13
/*     */     //   468: iconst_0
/*     */     //   469: istore #14
/*     */     //   471: aload #12
/*     */     //   473: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   478: astore #15
/*     */     //   480: iconst_0
/*     */     //   481: istore #16
/*     */     //   483: aload #15
/*     */     //   485: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   488: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   491: if_acmpne -> 516
/*     */     //   494: iconst_0
/*     */     //   495: istore #17
/*     */     //   497: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   500: astore #17
/*     */     //   502: aload #12
/*     */     //   504: aload #17
/*     */     //   506: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   511: aload #17
/*     */     //   513: goto -> 518
/*     */     //   516: aload #15
/*     */     //   518: nop
/*     */     //   519: nop
/*     */     //   520: nop
/*     */     //   521: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   524: astore #11
/*     */     //   526: aload #7
/*     */     //   528: invokeinterface endReplaceGroup : ()V
/*     */     //   533: aload #11
/*     */     //   535: astore #4
/*     */     //   537: iload #9
/*     */     //   539: bipush #64
/*     */     //   541: iand
/*     */     //   542: ifeq -> 553
/*     */     //   545: getstatic com/intellij/ml/llm/matterhorn/ej/ui/components/ComposableSingletons$JunieDropdownKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/components/ComposableSingletons$JunieDropdownKt;
/*     */     //   548: invokevirtual getLambda-1$standalone : ()Lkotlin/jvm/functions/Function3;
/*     */     //   551: astore #6
/*     */     //   553: invokestatic isTraceInProgress : ()Z
/*     */     //   556: ifeq -> 569
/*     */     //   559: ldc 2040191321
/*     */     //   561: iload #10
/*     */     //   563: iconst_m1
/*     */     //   564: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieTreeDotsDropdown (JunieDropdown.kt:40)'
/*     */     //   566: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   569: iconst_2
/*     */     //   570: anewarray androidx/compose/runtime/ProvidedValue
/*     */     //   573: astore #11
/*     */     //   575: aload #11
/*     */     //   577: iconst_0
/*     */     //   578: invokestatic getLocalGlobalColors : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   581: aload #7
/*     */     //   583: iconst_0
/*     */     //   584: invokestatic NoOutlineFocusGlobalColor : (Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/foundation/GlobalColors;
/*     */     //   587: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   590: aastore
/*     */     //   591: aload #11
/*     */     //   593: iconst_1
/*     */     //   594: getstatic com/intellij/ml/llm/matterhorn/ej/ui/components/JunieDropdownKt.LocalJunieDropdownStyle : Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   597: aload #7
/*     */     //   599: iconst_0
/*     */     //   600: invokestatic JunieDropdownStyle : (Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/DropdownStyle;
/*     */     //   603: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   606: aastore
/*     */     //   607: aload #11
/*     */     //   609: ldc -2015031783
/*     */     //   611: iconst_1
/*     */     //   612: new com/intellij/ml/llm/matterhorn/ej/ui/components/JunieDropdownKt$JunieTreeDotsDropdown$2
/*     */     //   615: dup
/*     */     //   616: aload_0
/*     */     //   617: iload_1
/*     */     //   618: aload_2
/*     */     //   619: aload_3
/*     */     //   620: aload #4
/*     */     //   622: aload #5
/*     */     //   624: aload #6
/*     */     //   626: invokespecial <init> : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V
/*     */     //   629: aload #7
/*     */     //   631: bipush #54
/*     */     //   633: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   636: checkcast kotlin/jvm/functions/Function2
/*     */     //   639: aload #7
/*     */     //   641: bipush #48
/*     */     //   643: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*     */     //   646: ior
/*     */     //   647: invokestatic CompositionLocalProvider : ([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   650: invokestatic isTraceInProgress : ()Z
/*     */     //   653: ifeq -> 669
/*     */     //   656: invokestatic traceEventEnd : ()V
/*     */     //   659: goto -> 669
/*     */     //   662: aload #7
/*     */     //   664: invokeinterface skipToGroupEnd : ()V
/*     */     //   669: aload #7
/*     */     //   671: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   676: dup
/*     */     //   677: ifnull -> 707
/*     */     //   680: aload_0
/*     */     //   681: iload_1
/*     */     //   682: aload_2
/*     */     //   683: aload_3
/*     */     //   684: aload #4
/*     */     //   686: aload #5
/*     */     //   688: aload #6
/*     */     //   690: iload #8
/*     */     //   692: iload #9
/*     */     //   694: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;II)Lkotlin/jvm/functions/Function2;
/*     */     //   699: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   704: goto -> 708
/*     */     //   707: pop
/*     */     //   708: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #41	-> 7
/*     */     //   #34	-> 402
/*     */     //   #35	-> 416
/*     */     //   #36	-> 425
/*     */     //   #37	-> 440
/*     */     //   #38	-> 452
/*     */     //   #151	-> 471
/*     */     //   #152	-> 483
/*     */     //   #153	-> 494
/*     */     //   #38	-> 497
/*     */     //   #153	-> 500
/*     */     //   #154	-> 502
/*     */     //   #155	-> 511
/*     */     //   #156	-> 516
/*     */     //   #152	-> 518
/*     */     //   #151	-> 519
/*     */     //   #151	-> 520
/*     */     //   #38	-> 521
/*     */     //   #41	-> 566
/*     */     //   #44	-> 569
/*     */     //   #45	-> 594
/*     */     //   #44	-> 607
/*     */     //   #46	-> 609
/*     */     //   #43	-> 647
/*     */     //   #58	-> 662
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   497	3	17	$i$a$-cache-JunieDropdownKt$JunieTreeDotsDropdown$1	I
/*     */     //   502	11	17	value$iv	Ljava/lang/Object;
/*     */     //   483	36	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   480	39	15	it$iv	Ljava/lang/Object;
/*     */     //   471	50	14	$i$f$cache	I
/*     */     //   468	53	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   468	53	13	invalid$iv	Z
/*     */     //   22	687	10	$dirty	I
/*     */     //   0	709	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	709	1	enabled	Z
/*     */     //   0	709	2	menuModifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	709	3	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	709	4	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	709	5	menuContent	Lkotlin/jvm/functions/Function1;
/*     */     //   0	709	6	content	Lkotlin/jvm/functions/Function3;
/*     */     //   0	709	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	709	8	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nJunieDropdown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieDropdown.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieDropdownKt$JunieTreeDotsDropdown$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,150:1\n77#2:151\n*S KotlinDebug\n*F\n+ 1 JunieDropdown.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieDropdownKt$JunieTreeDotsDropdown$2\n*L\n53#1:151\n*E\n"})
/*     */   static final class JunieDropdownKt$JunieTreeDotsDropdown$2 implements Function2<Composer, Integer, Unit> { JunieDropdownKt$JunieTreeDotsDropdown$2(Modifier $modifier, boolean $enabled, Modifier $menuModifier, Outline $outline, MutableInteractionSource $interactionSource, Function1<MenuScope, Unit> $menuContent, Function3<BoxScope, Composer, Integer, Unit> $content) {}
/*     */     
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*  47 */     public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-2015031783, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.JunieTreeDotsDropdown.<anonymous> (JunieDropdown.kt:46)");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  53 */         CompositionLocal compositionLocal = (CompositionLocal)JunieDropdownKt.getLocalJunieDropdownStyle(); int $changed$iv = 6, $i$f$getCurrent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 151 */         ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); DropdownKt.Dropdown(this.$modifier, this.$enabled, this.$menuModifier, this.$outline, this.$interactionSource, (DropdownStyle)object, this.$menuContent, this.$content, $composer, 0, 0); if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd();  }
/*     */       else
/*     */       { $composer.skipToGroupEnd(); }
/*     */        } } @Composable @NotNull public static final DropdownStyle JunieDropdownStyle(@Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-1637497484); if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(-1637497484, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.JunieDropdownStyle (JunieDropdown.kt:78)");  DropdownStyle style = JewelThemeKt.getDropdownStyle(JewelTheme.Companion, $composer, 6); int $this$dp$iv = 8, $i$f$getDp = 0;
/* 157 */     MenuStyle innerMenuStyle = new MenuStyle(style.getMenuStyle().isDark(), style.getMenuStyle().getColors(), new MenuMetrics(style.getMenuStyle().getMetrics().getCornerSize(), style.getMenuStyle().getMetrics().getMenuMargin(), PaddingKt.PaddingValues-0680j_4(Dp.constructor-impl($this$dp$iv)), style.getMenuStyle().getMetrics().getOffset-RKDOV3M(), style.getMenuStyle().getMetrics().getShadowSize-D9Ej5fM(), style.getMenuStyle().getMetrics().getBorderWidth-D9Ej5fM(), new MenuItemMetrics(style.getMetrics().getCornerSize(), style.getMenuStyle().getMetrics().getItemMetrics().getOuterPadding(), style.getMenuStyle().getMetrics().getItemMetrics().getContentPadding(), style.getMenuStyle().getMetrics().getItemMetrics().getSeparatorPadding(), style.getMenuStyle().getMetrics().getItemMetrics().getKeybindingsPadding(), style.getMenuStyle().getMetrics().getItemMetrics().getSeparatorThickness-D9Ej5fM(), style.getMenuStyle().getMetrics().getItemMetrics().getSeparatorHeight-D9Ej5fM(), style.getMenuStyle().getMetrics().getItemMetrics().getIconSize-D9Ej5fM(), style.getMenuStyle().getMetrics().getItemMetrics().getMinHeight-D9Ej5fM(), null), style.getMenuStyle().getMetrics().getSubmenuMetrics(), null), style.getMenuStyle().getIcons()); int i = 0, j = 0; i = 0; j = 0; i = 0; j = 0; i = 0; j = 0;
/* 158 */     DropdownStyle dropdownStyle1 = new DropdownStyle(new DropdownColors(Color.Companion.getTransparent-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), style.getColors().getContent-0d7_KjU(), style.getColors().getContentDisabled-0d7_KjU(), style.getColors().getContentFocused-0d7_KjU(), style.getColors().getContentPressed-0d7_KjU(), style.getColors().getContentHovered-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), style.getColors().getIconTint-0d7_KjU(), style.getColors().getIconTintDisabled-0d7_KjU(), style.getColors().getIconTintFocused-0d7_KjU(), style.getColors().getIconTintPressed-0d7_KjU(), style.getColors().getIconTintHovered-0d7_KjU(), null), new DropdownMetrics(style.getMetrics().getArrowMinSize-MYxV2XQ(), DpKt.DpSize-YgX7TsA(Dp.constructor-impl(i), Dp.constructor-impl(i)), style.getMetrics().getCornerSize(), PaddingKt.PaddingValues-0680j_4(
/* 159 */             Dp.constructor-impl(i)), 
/* 160 */           Dp.constructor-impl(i), null), new DropdownIcons((IconKey)MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getMoreVerticalIcon()), innerMenuStyle);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return dropdownStyle1; }
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final GlobalColors NoOutlineFocusGlobalColor(@Nullable Composer $composer, int $changed) {
/*     */     $composer.startReplaceGroup(-1008043533);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(-1008043533, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.NoOutlineFocusGlobalColor (JunieDropdown.kt:60)"); 
/*     */     GlobalColors globalColors = JewelTheme.Companion.getGlobalColors($composer, 6);
/*     */     GlobalColors globalColors1 = new GlobalColors(globalColors.getBorders(), new OutlineColors(Color.Companion.getUnspecified-0d7_KjU(), globalColors.getOutlines().getFocusedWarning-0d7_KjU(), globalColors.getOutlines().getFocusedError-0d7_KjU(), globalColors.getOutlines().getWarning-0d7_KjU(), globalColors.getOutlines().getError-0d7_KjU(), null), globalColors.getText(), globalColors.getPanelBackground-0d7_KjU(), null);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return globalColors1;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final ProvidableCompositionLocal<DropdownStyle> getLocalJunieDropdownStyle() {
/*     */     return LocalJunieDropdownStyle;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final ProvidableCompositionLocal<DropdownStyle> LocalJunieDropdownStyle = CompositionLocalKt.staticCompositionLocalOf(JunieDropdownKt::LocalJunieDropdownStyle$lambda$2);
/*     */   
/*     */   private static final Unit JunieTreeDotsDropdown$lambda$1(Modifier $modifier, boolean $enabled, Modifier $menuModifier, Outline $outline, MutableInteractionSource $interactionSource, Function1<? super MenuScope, Unit> $menuContent, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     JunieTreeDotsDropdown($modifier, $enabled, $menuModifier, $outline, $interactionSource, $menuContent, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final DropdownStyle LocalJunieDropdownStyle$lambda$2() {
/*     */     throw new IllegalStateException("No UndecoratedDropdownStyle provided. Have you forgotten the theme?".toString());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieDropdownKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */