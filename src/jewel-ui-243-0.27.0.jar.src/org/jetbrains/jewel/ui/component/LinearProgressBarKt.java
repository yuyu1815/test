/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.geometry.CornerRadiusKt;
/*     */ import androidx.compose.ui.geometry.OffsetKt;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.TileMode;
/*     */ import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*     */ import androidx.compose.ui.unit.DensityKt;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.HorizontalProgressBarColors;
/*     */ import org.jetbrains.jewel.ui.component.styling.HorizontalProgressBarStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\020\002\n\000\n\002\020\007\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\b\n\002\b\002\n\002\020 \n\002\030\002\032)\020\000\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007H\007¢\006\002\020\b\032!\020\t\032\0020\0012\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007H\007¢\006\002\020\n¨\006\013²\006\n\020\f\032\0020\rX\002²\006\n\020\016\032\0020\003X\002²\006\020\020\017\032\b\022\004\022\0020\0210\020X\002"}, d2 = {"HorizontalProgressBar", "", "progress", "", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarStyle;", "(FLandroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarStyle;Landroidx/compose/runtime/Composer;II)V", "IndeterminateHorizontalProgressBar", "(Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarStyle;Landroidx/compose/runtime/Composer;II)V", "ui", "cycleDurationMillis", "", "animatedProgress", "colorsList", "", "Landroidx/compose/ui/graphics/Color;"})
/*     */ @SourceDebugExtension({"SMAP\nLinearProgressBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinearProgressBar.kt\norg/jetbrains/jewel/ui/component/LinearProgressBarKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,100:1\n1225#2,6:101\n1225#2,6:107\n1225#2,6:113\n1225#2,6:119\n81#3:125\n81#3:126\n81#3:127\n*S KotlinDebug\n*F\n+ 1 LinearProgressBar.kt\norg/jetbrains/jewel/ui/component/LinearProgressBarKt\n*L\n42#1:101,6\n66#1:107,6\n80#1:113,6\n84#1:119,6\n66#1:125\n68#1:126\n80#1:127\n*E\n"})
/*     */ public final class LinearProgressBarKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void HorizontalProgressBar(float progress, @Nullable Modifier modifier, @Nullable HorizontalProgressBarStyle style, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: ldc -544596181
/*     */     //   3: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   8: astore_3
/*     */     //   9: iload #4
/*     */     //   11: istore #6
/*     */     //   13: iload #5
/*     */     //   15: iconst_1
/*     */     //   16: iand
/*     */     //   17: ifeq -> 30
/*     */     //   20: iload #6
/*     */     //   22: bipush #6
/*     */     //   24: ior
/*     */     //   25: istore #6
/*     */     //   27: goto -> 58
/*     */     //   30: iload #4
/*     */     //   32: bipush #6
/*     */     //   34: iand
/*     */     //   35: ifne -> 58
/*     */     //   38: iload #6
/*     */     //   40: aload_3
/*     */     //   41: fload_0
/*     */     //   42: invokeinterface changed : (F)Z
/*     */     //   47: ifeq -> 54
/*     */     //   50: iconst_4
/*     */     //   51: goto -> 55
/*     */     //   54: iconst_2
/*     */     //   55: ior
/*     */     //   56: istore #6
/*     */     //   58: iload #5
/*     */     //   60: iconst_2
/*     */     //   61: iand
/*     */     //   62: ifeq -> 75
/*     */     //   65: iload #6
/*     */     //   67: bipush #48
/*     */     //   69: ior
/*     */     //   70: istore #6
/*     */     //   72: goto -> 105
/*     */     //   75: iload #4
/*     */     //   77: bipush #48
/*     */     //   79: iand
/*     */     //   80: ifne -> 105
/*     */     //   83: iload #6
/*     */     //   85: aload_3
/*     */     //   86: aload_1
/*     */     //   87: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   92: ifeq -> 100
/*     */     //   95: bipush #32
/*     */     //   97: goto -> 102
/*     */     //   100: bipush #16
/*     */     //   102: ior
/*     */     //   103: istore #6
/*     */     //   105: iload #4
/*     */     //   107: sipush #384
/*     */     //   110: iand
/*     */     //   111: ifne -> 145
/*     */     //   114: iload #6
/*     */     //   116: iload #5
/*     */     //   118: iconst_4
/*     */     //   119: iand
/*     */     //   120: ifne -> 139
/*     */     //   123: aload_3
/*     */     //   124: aload_2
/*     */     //   125: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   130: ifeq -> 139
/*     */     //   133: sipush #256
/*     */     //   136: goto -> 142
/*     */     //   139: sipush #128
/*     */     //   142: ior
/*     */     //   143: istore #6
/*     */     //   145: iload #6
/*     */     //   147: sipush #147
/*     */     //   150: iand
/*     */     //   151: sipush #146
/*     */     //   154: if_icmpne -> 166
/*     */     //   157: aload_3
/*     */     //   158: invokeinterface getSkipping : ()Z
/*     */     //   163: ifne -> 495
/*     */     //   166: aload_3
/*     */     //   167: invokeinterface startDefaults : ()V
/*     */     //   172: iload #4
/*     */     //   174: iconst_1
/*     */     //   175: iand
/*     */     //   176: ifeq -> 188
/*     */     //   179: aload_3
/*     */     //   180: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   185: ifeq -> 230
/*     */     //   188: iload #5
/*     */     //   190: iconst_2
/*     */     //   191: iand
/*     */     //   192: ifeq -> 202
/*     */     //   195: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   198: checkcast androidx/compose/ui/Modifier
/*     */     //   201: astore_1
/*     */     //   202: iload #5
/*     */     //   204: iconst_4
/*     */     //   205: iand
/*     */     //   206: ifeq -> 251
/*     */     //   209: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   212: aload_3
/*     */     //   213: bipush #6
/*     */     //   215: invokestatic getHorizontalProgressBarStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarStyle;
/*     */     //   218: astore_2
/*     */     //   219: iload #6
/*     */     //   221: sipush #-897
/*     */     //   224: iand
/*     */     //   225: istore #6
/*     */     //   227: goto -> 251
/*     */     //   230: aload_3
/*     */     //   231: invokeinterface skipToGroupEnd : ()V
/*     */     //   236: iload #5
/*     */     //   238: iconst_4
/*     */     //   239: iand
/*     */     //   240: ifeq -> 251
/*     */     //   243: iload #6
/*     */     //   245: sipush #-897
/*     */     //   248: iand
/*     */     //   249: istore #6
/*     */     //   251: aload_3
/*     */     //   252: invokeinterface endDefaults : ()V
/*     */     //   257: invokestatic isTraceInProgress : ()Z
/*     */     //   260: ifeq -> 273
/*     */     //   263: ldc -544596181
/*     */     //   265: iload #6
/*     */     //   267: iconst_m1
/*     */     //   268: ldc 'org.jetbrains.jewel.ui.component.HorizontalProgressBar (LinearProgressBar.kt:36)'
/*     */     //   270: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   273: aload_2
/*     */     //   274: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarColors;
/*     */     //   277: astore #7
/*     */     //   279: aload_2
/*     */     //   280: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarMetrics;
/*     */     //   283: invokevirtual getCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   286: invokestatic RoundedCornerShape : (Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   289: astore #8
/*     */     //   291: aload_1
/*     */     //   292: fconst_0
/*     */     //   293: aload_2
/*     */     //   294: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarMetrics;
/*     */     //   297: invokevirtual getMinHeight-D9Ej5fM : ()F
/*     */     //   300: iconst_1
/*     */     //   301: aconst_null
/*     */     //   302: invokestatic defaultMinSize-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   305: aload #8
/*     */     //   307: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   310: invokestatic clip : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   313: aload_3
/*     */     //   314: ldc 109956868
/*     */     //   316: invokeinterface startReplaceGroup : (I)V
/*     */     //   321: aload_3
/*     */     //   322: astore #10
/*     */     //   324: aload_3
/*     */     //   325: aload #7
/*     */     //   327: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   332: iload #6
/*     */     //   334: bipush #14
/*     */     //   336: iand
/*     */     //   337: iconst_4
/*     */     //   338: if_icmpne -> 345
/*     */     //   341: iconst_1
/*     */     //   342: goto -> 346
/*     */     //   345: iconst_0
/*     */     //   346: ior
/*     */     //   347: iload #6
/*     */     //   349: sipush #896
/*     */     //   352: iand
/*     */     //   353: sipush #384
/*     */     //   356: ixor
/*     */     //   357: sipush #256
/*     */     //   360: if_icmple -> 373
/*     */     //   363: aload_3
/*     */     //   364: aload_2
/*     */     //   365: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   370: ifne -> 385
/*     */     //   373: iload #6
/*     */     //   375: sipush #384
/*     */     //   378: iand
/*     */     //   379: sipush #256
/*     */     //   382: if_icmpne -> 389
/*     */     //   385: iconst_1
/*     */     //   386: goto -> 390
/*     */     //   389: iconst_0
/*     */     //   390: ior
/*     */     //   391: istore #11
/*     */     //   393: iconst_0
/*     */     //   394: istore #12
/*     */     //   396: aload #10
/*     */     //   398: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   403: astore #13
/*     */     //   405: iconst_0
/*     */     //   406: istore #14
/*     */     //   408: iload #11
/*     */     //   410: ifne -> 424
/*     */     //   413: aload #13
/*     */     //   415: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   418: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   421: if_acmpne -> 457
/*     */     //   424: astore #17
/*     */     //   426: iconst_0
/*     */     //   427: istore #15
/*     */     //   429: aload #7
/*     */     //   431: fload_0
/*     */     //   432: aload_2
/*     */     //   433: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarColors;FLorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarStyle;)Lkotlin/jvm/functions/Function1;
/*     */     //   438: aload #17
/*     */     //   440: swap
/*     */     //   441: astore #16
/*     */     //   443: aload #10
/*     */     //   445: aload #16
/*     */     //   447: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   452: aload #16
/*     */     //   454: goto -> 459
/*     */     //   457: aload #13
/*     */     //   459: nop
/*     */     //   460: nop
/*     */     //   461: nop
/*     */     //   462: checkcast kotlin/jvm/functions/Function1
/*     */     //   465: astore #9
/*     */     //   467: aload_3
/*     */     //   468: invokeinterface endReplaceGroup : ()V
/*     */     //   473: aload #9
/*     */     //   475: invokestatic drawWithContent : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   478: aload_3
/*     */     //   479: iconst_0
/*     */     //   480: invokestatic Box : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   483: invokestatic isTraceInProgress : ()Z
/*     */     //   486: ifeq -> 501
/*     */     //   489: invokestatic traceEventEnd : ()V
/*     */     //   492: goto -> 501
/*     */     //   495: aload_3
/*     */     //   496: invokeinterface skipToGroupEnd : ()V
/*     */     //   501: aload_3
/*     */     //   502: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   507: dup
/*     */     //   508: ifnull -> 531
/*     */     //   511: fload_0
/*     */     //   512: aload_1
/*     */     //   513: aload_2
/*     */     //   514: iload #4
/*     */     //   516: iload #5
/*     */     //   518: <illegal opcode> invoke : (FLandroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarStyle;II)Lkotlin/jvm/functions/Function2;
/*     */     //   523: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   528: goto -> 532
/*     */     //   531: pop
/*     */     //   532: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #37	-> 0
/*     */     //   #35	-> 195
/*     */     //   #36	-> 209
/*     */     //   #37	-> 270
/*     */     //   #38	-> 273
/*     */     //   #39	-> 279
/*     */     //   #42	-> 291
/*     */     //   #101	-> 396
/*     */     //   #102	-> 408
/*     */     //   #103	-> 424
/*     */     //   #42	-> 429
/*     */     //   #103	-> 441
/*     */     //   #104	-> 443
/*     */     //   #105	-> 452
/*     */     //   #106	-> 457
/*     */     //   #102	-> 459
/*     */     //   #101	-> 460
/*     */     //   #101	-> 461
/*     */     //   #42	-> 462
/*     */     //   #41	-> 480
/*     */     //   #57	-> 495
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   429	9	15	$i$a$-cache-LinearProgressBarKt$HorizontalProgressBar$1	I
/*     */     //   443	11	16	value$iv	Ljava/lang/Object;
/*     */     //   408	52	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   405	55	13	it$iv	Ljava/lang/Object;
/*     */     //   396	66	12	$i$f$cache	I
/*     */     //   393	69	10	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   393	69	11	invalid$iv	Z
/*     */     //   279	213	7	colors	Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarColors;
/*     */     //   291	201	8	shape	Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   13	520	6	$dirty	I
/*     */     //   0	533	0	progress	F
/*     */     //   0	533	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	533	2	style	Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarStyle;
/*     */     //   0	533	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	533	4	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit HorizontalProgressBar$lambda$1$lambda$0(HorizontalProgressBarColors $colors, float $progress, HorizontalProgressBarStyle $style, ContentDrawScope $this$drawWithContent) {
/*  43 */     Intrinsics.checkNotNullParameter($this$drawWithContent, "$this$drawWithContent"); DrawScope.drawRect-n-J9OG0$default((DrawScope)$this$drawWithContent, $colors.getTrack-0d7_KjU(), 0L, 0L, 0.0F, null, null, 0, 126, null);
/*  44 */     float progressWidth = Size.getWidth-impl($this$drawWithContent.getSize-NH-jbRc()) * $progress;
/*  45 */     float progressX = ($this$drawWithContent.getLayoutDirection() == LayoutDirection.Ltr) ? 0.0F : (Size.getWidth-impl($this$drawWithContent.getSize-NH-jbRc()) - progressWidth);
/*     */     
/*  47 */     float cornerSizePx = $style.getMetrics().getCornerSize().toPx-TmRCtEA($this$drawWithContent.getSize-NH-jbRc(), DensityKt.Density($this$drawWithContent.getDensity(), $this$drawWithContent.getFontScale()));
/*  48 */     long cornerRadius = CornerRadiusKt.CornerRadius(cornerSizePx, cornerSizePx);
/*  49 */     DrawScope.drawRoundRect-u-Aw5IA$default((DrawScope)$this$drawWithContent, 
/*  50 */         $colors.getProgress-0d7_KjU(), 
/*  51 */         OffsetKt.Offset(progressX, 0.0F), 
/*  52 */         Size.copy-xjbvk4A$default($this$drawWithContent.getSize-NH-jbRc(), progressWidth, 0.0F, 2, null), 
/*  53 */         cornerRadius, null, 0.0F, null, 0, 240, null);
/*     */     
/*  55 */     return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void IndeterminateHorizontalProgressBar(@Nullable Modifier modifier, @Nullable HorizontalProgressBarStyle style, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc 743013820
/*     */     //   3: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   8: astore_2
/*     */     //   9: iload_3
/*     */     //   10: istore #5
/*     */     //   12: iload #4
/*     */     //   14: iconst_1
/*     */     //   15: iand
/*     */     //   16: ifeq -> 29
/*     */     //   19: iload #5
/*     */     //   21: bipush #6
/*     */     //   23: ior
/*     */     //   24: istore #5
/*     */     //   26: goto -> 56
/*     */     //   29: iload_3
/*     */     //   30: bipush #6
/*     */     //   32: iand
/*     */     //   33: ifne -> 56
/*     */     //   36: iload #5
/*     */     //   38: aload_2
/*     */     //   39: aload_0
/*     */     //   40: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   45: ifeq -> 52
/*     */     //   48: iconst_4
/*     */     //   49: goto -> 53
/*     */     //   52: iconst_2
/*     */     //   53: ior
/*     */     //   54: istore #5
/*     */     //   56: iload_3
/*     */     //   57: bipush #48
/*     */     //   59: iand
/*     */     //   60: ifne -> 92
/*     */     //   63: iload #5
/*     */     //   65: iload #4
/*     */     //   67: iconst_2
/*     */     //   68: iand
/*     */     //   69: ifne -> 87
/*     */     //   72: aload_2
/*     */     //   73: aload_1
/*     */     //   74: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   79: ifeq -> 87
/*     */     //   82: bipush #32
/*     */     //   84: goto -> 89
/*     */     //   87: bipush #16
/*     */     //   89: ior
/*     */     //   90: istore #5
/*     */     //   92: iload #5
/*     */     //   94: bipush #19
/*     */     //   96: iand
/*     */     //   97: bipush #18
/*     */     //   99: if_icmpne -> 111
/*     */     //   102: aload_2
/*     */     //   103: invokeinterface getSkipping : ()Z
/*     */     //   108: ifne -> 691
/*     */     //   111: aload_2
/*     */     //   112: invokeinterface startDefaults : ()V
/*     */     //   117: iload_3
/*     */     //   118: iconst_1
/*     */     //   119: iand
/*     */     //   120: ifeq -> 132
/*     */     //   123: aload_2
/*     */     //   124: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   129: ifeq -> 173
/*     */     //   132: iload #4
/*     */     //   134: iconst_1
/*     */     //   135: iand
/*     */     //   136: ifeq -> 146
/*     */     //   139: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   142: checkcast androidx/compose/ui/Modifier
/*     */     //   145: astore_0
/*     */     //   146: iload #4
/*     */     //   148: iconst_2
/*     */     //   149: iand
/*     */     //   150: ifeq -> 193
/*     */     //   153: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   156: aload_2
/*     */     //   157: bipush #6
/*     */     //   159: invokestatic getHorizontalProgressBarStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarStyle;
/*     */     //   162: astore_1
/*     */     //   163: iload #5
/*     */     //   165: bipush #-113
/*     */     //   167: iand
/*     */     //   168: istore #5
/*     */     //   170: goto -> 193
/*     */     //   173: aload_2
/*     */     //   174: invokeinterface skipToGroupEnd : ()V
/*     */     //   179: iload #4
/*     */     //   181: iconst_2
/*     */     //   182: iand
/*     */     //   183: ifeq -> 193
/*     */     //   186: iload #5
/*     */     //   188: bipush #-113
/*     */     //   190: iand
/*     */     //   191: istore #5
/*     */     //   193: aload_2
/*     */     //   194: invokeinterface endDefaults : ()V
/*     */     //   199: invokestatic isTraceInProgress : ()Z
/*     */     //   202: ifeq -> 215
/*     */     //   205: ldc 743013820
/*     */     //   207: iload #5
/*     */     //   209: iconst_m1
/*     */     //   210: ldc 'org.jetbrains.jewel.ui.component.IndeterminateHorizontalProgressBar (LinearProgressBar.kt:62)'
/*     */     //   212: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   215: aconst_null
/*     */     //   216: aload_2
/*     */     //   217: iconst_0
/*     */     //   218: iconst_1
/*     */     //   219: invokestatic rememberInfiniteTransition : (Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/InfiniteTransition;
/*     */     //   222: astore #6
/*     */     //   224: aload_2
/*     */     //   225: ldc 1175255166
/*     */     //   227: invokeinterface startReplaceGroup : (I)V
/*     */     //   232: aload_2
/*     */     //   233: astore #9
/*     */     //   235: iconst_0
/*     */     //   236: istore #10
/*     */     //   238: nop
/*     */     //   239: iconst_0
/*     */     //   240: istore #11
/*     */     //   242: aload #9
/*     */     //   244: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   249: astore #12
/*     */     //   251: iconst_0
/*     */     //   252: istore #13
/*     */     //   254: aload #12
/*     */     //   256: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   259: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   262: if_acmpne -> 301
/*     */     //   265: iconst_0
/*     */     //   266: istore #14
/*     */     //   268: aload_1
/*     */     //   269: invokevirtual getIndeterminateCycleDuration-UwyO8pc : ()J
/*     */     //   272: invokestatic getInWholeMilliseconds-impl : (J)J
/*     */     //   275: l2i
/*     */     //   276: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   279: aconst_null
/*     */     //   280: iconst_2
/*     */     //   281: aconst_null
/*     */     //   282: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   285: astore #15
/*     */     //   287: aload #9
/*     */     //   289: aload #15
/*     */     //   291: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   296: aload #15
/*     */     //   298: goto -> 303
/*     */     //   301: aload #12
/*     */     //   303: nop
/*     */     //   304: nop
/*     */     //   305: nop
/*     */     //   306: checkcast androidx/compose/runtime/MutableState
/*     */     //   309: astore #8
/*     */     //   311: aload_2
/*     */     //   312: invokeinterface endReplaceGroup : ()V
/*     */     //   317: aload #8
/*     */     //   319: astore #7
/*     */     //   321: aload #6
/*     */     //   323: fconst_0
/*     */     //   324: fconst_2
/*     */     //   325: aload #7
/*     */     //   327: invokestatic IndeterminateHorizontalProgressBar$lambda$4 : (Landroidx/compose/runtime/MutableState;)I
/*     */     //   330: iconst_0
/*     */     //   331: invokestatic getLinearEasing : ()Landroidx/compose/animation/core/Easing;
/*     */     //   334: iconst_2
/*     */     //   335: aconst_null
/*     */     //   336: invokestatic tween$default : (IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;
/*     */     //   339: checkcast androidx/compose/animation/core/DurationBasedAnimationSpec
/*     */     //   342: getstatic androidx/compose/animation/core/RepeatMode.Restart : Landroidx/compose/animation/core/RepeatMode;
/*     */     //   345: lconst_0
/*     */     //   346: iconst_4
/*     */     //   347: aconst_null
/*     */     //   348: invokestatic infiniteRepeatable-9IiC70o$default : (Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILjava/lang/Object;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;
/*     */     //   351: aconst_null
/*     */     //   352: aload_2
/*     */     //   353: sipush #432
/*     */     //   356: getstatic androidx/compose/animation/core/InfiniteTransition.$stable : I
/*     */     //   359: ior
/*     */     //   360: getstatic androidx/compose/animation/core/InfiniteRepeatableSpec.$stable : I
/*     */     //   363: bipush #9
/*     */     //   365: ishl
/*     */     //   366: ior
/*     */     //   367: bipush #8
/*     */     //   369: invokestatic animateFloat : (Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   372: astore #8
/*     */     //   374: aload_1
/*     */     //   375: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarMetrics;
/*     */     //   378: invokevirtual getIndeterminateHighlightWidth-D9Ej5fM : ()F
/*     */     //   381: fstore #9
/*     */     //   383: aload_1
/*     */     //   384: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarColors;
/*     */     //   387: astore #10
/*     */     //   389: aload_2
/*     */     //   390: ldc_w 1175273537
/*     */     //   393: invokeinterface startReplaceGroup : (I)V
/*     */     //   398: aload_2
/*     */     //   399: astore #13
/*     */     //   401: iconst_0
/*     */     //   402: istore #14
/*     */     //   404: nop
/*     */     //   405: iconst_0
/*     */     //   406: istore #15
/*     */     //   408: aload #13
/*     */     //   410: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   415: astore #16
/*     */     //   417: iconst_0
/*     */     //   418: istore #17
/*     */     //   420: aload #16
/*     */     //   422: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   425: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   428: if_acmpne -> 491
/*     */     //   431: iconst_0
/*     */     //   432: istore #18
/*     */     //   434: iconst_2
/*     */     //   435: anewarray androidx/compose/ui/graphics/Color
/*     */     //   438: astore #19
/*     */     //   440: aload #19
/*     */     //   442: iconst_0
/*     */     //   443: aload #10
/*     */     //   445: invokevirtual getIndeterminateBase-0d7_KjU : ()J
/*     */     //   448: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*     */     //   451: aastore
/*     */     //   452: aload #19
/*     */     //   454: iconst_1
/*     */     //   455: aload #10
/*     */     //   457: invokevirtual getIndeterminateHighlight-0d7_KjU : ()J
/*     */     //   460: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*     */     //   463: aastore
/*     */     //   464: aload #19
/*     */     //   466: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   469: aconst_null
/*     */     //   470: iconst_2
/*     */     //   471: aconst_null
/*     */     //   472: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   475: astore #20
/*     */     //   477: aload #13
/*     */     //   479: aload #20
/*     */     //   481: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   486: aload #20
/*     */     //   488: goto -> 493
/*     */     //   491: aload #16
/*     */     //   493: nop
/*     */     //   494: nop
/*     */     //   495: nop
/*     */     //   496: checkcast androidx/compose/runtime/MutableState
/*     */     //   499: astore #12
/*     */     //   501: aload_2
/*     */     //   502: invokeinterface endReplaceGroup : ()V
/*     */     //   507: aload #12
/*     */     //   509: astore #11
/*     */     //   511: aload_1
/*     */     //   512: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarMetrics;
/*     */     //   515: invokevirtual getCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   518: invokestatic RoundedCornerShape : (Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   521: astore #12
/*     */     //   523: aload_0
/*     */     //   524: fconst_0
/*     */     //   525: aload_1
/*     */     //   526: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarMetrics;
/*     */     //   529: invokevirtual getMinHeight-D9Ej5fM : ()F
/*     */     //   532: iconst_1
/*     */     //   533: aconst_null
/*     */     //   534: invokestatic defaultMinSize-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   537: aload #12
/*     */     //   539: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   542: invokestatic clip : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   545: aload_2
/*     */     //   546: ldc_w 1175282255
/*     */     //   549: invokeinterface startReplaceGroup : (I)V
/*     */     //   554: aload_2
/*     */     //   555: astore #14
/*     */     //   557: aload_2
/*     */     //   558: aload #10
/*     */     //   560: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   565: aload_2
/*     */     //   566: fload #9
/*     */     //   568: invokeinterface changed : (F)Z
/*     */     //   573: ior
/*     */     //   574: aload_2
/*     */     //   575: aload #8
/*     */     //   577: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   582: ior
/*     */     //   583: istore #15
/*     */     //   585: iconst_0
/*     */     //   586: istore #16
/*     */     //   588: aload #14
/*     */     //   590: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   595: astore #17
/*     */     //   597: iconst_0
/*     */     //   598: istore #18
/*     */     //   600: iload #15
/*     */     //   602: ifne -> 616
/*     */     //   605: aload #17
/*     */     //   607: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   610: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   613: if_acmpne -> 653
/*     */     //   616: astore #21
/*     */     //   618: iconst_0
/*     */     //   619: istore #19
/*     */     //   621: aload #10
/*     */     //   623: fload #9
/*     */     //   625: aload #8
/*     */     //   627: aload #11
/*     */     //   629: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarColors;FLandroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   634: aload #21
/*     */     //   636: swap
/*     */     //   637: astore #20
/*     */     //   639: aload #14
/*     */     //   641: aload #20
/*     */     //   643: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   648: aload #20
/*     */     //   650: goto -> 655
/*     */     //   653: aload #17
/*     */     //   655: nop
/*     */     //   656: nop
/*     */     //   657: nop
/*     */     //   658: checkcast kotlin/jvm/functions/Function1
/*     */     //   661: astore #13
/*     */     //   663: aload_2
/*     */     //   664: invokeinterface endReplaceGroup : ()V
/*     */     //   669: aload #13
/*     */     //   671: invokestatic drawWithContent : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   674: aload_2
/*     */     //   675: iconst_0
/*     */     //   676: invokestatic Box : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   679: invokestatic isTraceInProgress : ()Z
/*     */     //   682: ifeq -> 697
/*     */     //   685: invokestatic traceEventEnd : ()V
/*     */     //   688: goto -> 697
/*     */     //   691: aload_2
/*     */     //   692: invokeinterface skipToGroupEnd : ()V
/*     */     //   697: aload_2
/*     */     //   698: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   703: dup
/*     */     //   704: ifnull -> 725
/*     */     //   707: aload_0
/*     */     //   708: aload_1
/*     */     //   709: iload_3
/*     */     //   710: iload #4
/*     */     //   712: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarStyle;II)Lkotlin/jvm/functions/Function2;
/*     */     //   717: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   722: goto -> 726
/*     */     //   725: pop
/*     */     //   726: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #63	-> 0
/*     */     //   #61	-> 139
/*     */     //   #62	-> 153
/*     */     //   #63	-> 212
/*     */     //   #64	-> 219
/*     */     //   #66	-> 238
/*     */     //   #107	-> 242
/*     */     //   #108	-> 254
/*     */     //   #109	-> 265
/*     */     //   #66	-> 268
/*     */     //   #109	-> 285
/*     */     //   #110	-> 287
/*     */     //   #111	-> 296
/*     */     //   #112	-> 301
/*     */     //   #108	-> 303
/*     */     //   #107	-> 304
/*     */     //   #107	-> 305
/*     */     //   #66	-> 306
/*     */     //   #68	-> 321
/*     */     //   #69	-> 323
/*     */     //   #70	-> 324
/*     */     //   #73	-> 325
/*     */     //   #74	-> 342
/*     */     //   #72	-> 345
/*     */     //   #68	-> 369
/*     */     //   #67	-> 372
/*     */     //   #78	-> 374
/*     */     //   #79	-> 383
/*     */     //   #80	-> 404
/*     */     //   #113	-> 408
/*     */     //   #114	-> 420
/*     */     //   #115	-> 431
/*     */     //   #80	-> 434
/*     */     //   #115	-> 475
/*     */     //   #116	-> 477
/*     */     //   #117	-> 486
/*     */     //   #118	-> 491
/*     */     //   #114	-> 493
/*     */     //   #113	-> 494
/*     */     //   #113	-> 495
/*     */     //   #80	-> 496
/*     */     //   #81	-> 511
/*     */     //   #84	-> 523
/*     */     //   #119	-> 588
/*     */     //   #120	-> 600
/*     */     //   #121	-> 616
/*     */     //   #84	-> 621
/*     */     //   #121	-> 637
/*     */     //   #122	-> 639
/*     */     //   #123	-> 648
/*     */     //   #124	-> 653
/*     */     //   #120	-> 655
/*     */     //   #119	-> 656
/*     */     //   #119	-> 657
/*     */     //   #84	-> 658
/*     */     //   #83	-> 676
/*     */     //   #99	-> 691
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   268	17	14	$i$a$-cache-LinearProgressBarKt$IndeterminateHorizontalProgressBar$cycleDurationMillis$2	I
/*     */     //   287	11	15	value$iv	Ljava/lang/Object;
/*     */     //   254	50	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   251	53	12	it$iv	Ljava/lang/Object;
/*     */     //   242	64	11	$i$f$cache	I
/*     */     //   239	67	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   239	67	10	invalid$iv	Z
/*     */     //   434	41	18	$i$a$-cache-LinearProgressBarKt$IndeterminateHorizontalProgressBar$colorsList$2	I
/*     */     //   477	11	20	value$iv	Ljava/lang/Object;
/*     */     //   420	74	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   417	77	16	it$iv	Ljava/lang/Object;
/*     */     //   408	88	15	$i$f$cache	I
/*     */     //   405	91	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   405	91	14	invalid$iv	Z
/*     */     //   621	13	19	$i$a$-cache-LinearProgressBarKt$IndeterminateHorizontalProgressBar$1	I
/*     */     //   639	11	20	value$iv	Ljava/lang/Object;
/*     */     //   600	56	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   597	59	17	it$iv	Ljava/lang/Object;
/*     */     //   588	70	16	$i$f$cache	I
/*     */     //   585	73	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   585	73	15	invalid$iv	Z
/*     */     //   224	464	6	infiniteTransition	Landroidx/compose/animation/core/InfiniteTransition;
/*     */     //   321	367	7	cycleDurationMillis$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   374	314	8	animatedProgress$delegate	Landroidx/compose/runtime/State;
/*     */     //   383	305	9	highlightWidth	F
/*     */     //   389	299	10	colors	Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarColors;
/*     */     //   511	177	11	colorsList$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   523	165	12	shape	Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   12	715	5	$dirty	I
/*     */     //   0	727	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	727	1	style	Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarStyle;
/*     */     //   0	727	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	727	3	$changed	I
/*     */   }
/*     */   
/*     */   private static final int IndeterminateHorizontalProgressBar$lambda$4(MutableState $cycleDurationMillis$delegate) {
/*  66 */     State state = (State)$cycleDurationMillis$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 125 */       (Number)state.getValue()).intValue(); } private static final float IndeterminateHorizontalProgressBar$lambda$5(State $animatedProgress$delegate) { State state = $animatedProgress$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 126 */     return ((Number)state.getValue()).floatValue(); } private static final List<Color> IndeterminateHorizontalProgressBar$lambda$7(MutableState $colorsList$delegate) { State state = (State)$colorsList$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 127 */     return (List<Color>)state.getValue(); }
/*     */ 
/*     */   
/*     */   private static final Unit IndeterminateHorizontalProgressBar$lambda$9$lambda$8(HorizontalProgressBarColors $colors, float $highlightWidth, State<Float> $animatedProgress$delegate, MutableState<List<Color>> $colorsList$delegate, ContentDrawScope $this$drawWithContent) {
/*     */     Intrinsics.checkNotNullParameter($this$drawWithContent, "$this$drawWithContent");
/*     */     DrawScope.drawRect-n-J9OG0$default((DrawScope)$this$drawWithContent, $colors.getTrack-0d7_KjU(), 0L, 0L, 0.0F, null, null, 0, 126, null);
/*     */     float x = $highlightWidth * IndeterminateHorizontalProgressBar$lambda$5($animatedProgress$delegate);
/*     */     DrawScope.drawRect-AsUm42w$default((DrawScope)$this$drawWithContent, Brush.Companion.linearGradient-mHitzGk(IndeterminateHorizontalProgressBar$lambda$7($colorsList$delegate), OffsetKt.Offset(x, 0.0F), OffsetKt.Offset(x + $highlightWidth, 0.0F), TileMode.Companion.getMirror-3opZhB0()), 0L, 0L, 0.0F, null, null, 0, 126, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit HorizontalProgressBar$lambda$2(float $progress, Modifier $modifier, HorizontalProgressBarStyle $style, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     HorizontalProgressBar($progress, $modifier, $style, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit IndeterminateHorizontalProgressBar$lambda$10(Modifier $modifier, HorizontalProgressBarStyle $style, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     IndeterminateHorizontalProgressBar($modifier, $style, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\LinearProgressBarKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */