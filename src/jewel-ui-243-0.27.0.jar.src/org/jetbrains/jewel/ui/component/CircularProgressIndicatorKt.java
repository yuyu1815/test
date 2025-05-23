/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ProduceStateScope;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.painter.Painter;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.Charsets;
/*     */ import kotlinx.coroutines.CoroutineDispatcher;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.compose.resources.ImageDecoders_skikoKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.CircularProgressStyle;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000B\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020 \n\002\020\016\n\002\b\004\n\002\030\002\n\000\n\002\020\b\032+\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007H\007¢\006\002\020\b\032+\020\t\032\0020\0012\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007H\007¢\006\002\020\b\032K\020\n\032\0020\0012\b\b\002\020\002\032\0020\0032\006\020\013\032\0020\f2\006\020\004\032\0020\0052\006\020\r\032\0020\0072\030\020\016\032\024\022\004\022\0020\020\022\n\022\b\022\004\022\0020\0220\0210\017H\003¢\006\004\b\023\020\024¨\006\025²\006\020\020\026\032\b\022\004\022\0020\0270\021X\002²\006\n\020\030\032\0020\031X\002"}, d2 = {"CircularProgressIndicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Lorg/jetbrains/jewel/ui/component/styling/CircularProgressStyle;", "loadingDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/CircularProgressStyle;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/compose/runtime/Composer;II)V", "CircularProgressIndicatorBig", "CircularProgressIndicatorImpl", "iconSize", "Landroidx/compose/ui/unit/DpSize;", "dispatcher", "frameRetriever", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Color;", "", "", "CircularProgressIndicatorImpl-coD9juw", "(Landroidx/compose/ui/Modifier;JLorg/jetbrains/jewel/ui/component/styling/CircularProgressStyle;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ui", "frames", "Landroidx/compose/ui/graphics/painter/Painter;", "currentIndex", ""})
/*     */ @SourceDebugExtension({"SMAP\nCircularProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularProgressIndicator.kt\norg/jetbrains/jewel/ui/component/CircularProgressIndicatorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,182:1\n149#2:183\n149#2:190\n1225#3,6:184\n1225#3,6:191\n1225#3,6:198\n77#4:197\n81#5:204\n81#5:205\n*S KotlinDebug\n*F\n+ 1 CircularProgressIndicator.kt\norg/jetbrains/jewel/ui/component/CircularProgressIndicatorKt\n*L\n39#1:183\n54#1:190\n42#1:184,6\n57#1:191,6\n74#1:198,6\n72#1:197\n74#1:204\n89#1:205\n*E\n"})
/*     */ public final class CircularProgressIndicatorKt {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void CircularProgressIndicator(@Nullable Modifier modifier, @Nullable CircularProgressStyle style, @Nullable CoroutineDispatcher loadingDispatcher, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: ldc -488959809
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
/*     */     //   41: aload_0
/*     */     //   42: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   47: ifeq -> 54
/*     */     //   50: iconst_4
/*     */     //   51: goto -> 55
/*     */     //   54: iconst_2
/*     */     //   55: ior
/*     */     //   56: istore #6
/*     */     //   58: iload #4
/*     */     //   60: bipush #48
/*     */     //   62: iand
/*     */     //   63: ifne -> 95
/*     */     //   66: iload #6
/*     */     //   68: iload #5
/*     */     //   70: iconst_2
/*     */     //   71: iand
/*     */     //   72: ifne -> 90
/*     */     //   75: aload_3
/*     */     //   76: aload_1
/*     */     //   77: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   82: ifeq -> 90
/*     */     //   85: bipush #32
/*     */     //   87: goto -> 92
/*     */     //   90: bipush #16
/*     */     //   92: ior
/*     */     //   93: istore #6
/*     */     //   95: iload #4
/*     */     //   97: sipush #384
/*     */     //   100: iand
/*     */     //   101: ifne -> 135
/*     */     //   104: iload #6
/*     */     //   106: iload #5
/*     */     //   108: iconst_4
/*     */     //   109: iand
/*     */     //   110: ifne -> 129
/*     */     //   113: aload_3
/*     */     //   114: aload_2
/*     */     //   115: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   120: ifeq -> 129
/*     */     //   123: sipush #256
/*     */     //   126: goto -> 132
/*     */     //   129: sipush #128
/*     */     //   132: ior
/*     */     //   133: istore #6
/*     */     //   135: iload #6
/*     */     //   137: sipush #147
/*     */     //   140: iand
/*     */     //   141: sipush #146
/*     */     //   144: if_icmpne -> 156
/*     */     //   147: aload_3
/*     */     //   148: invokeinterface getSkipping : ()Z
/*     */     //   153: ifne -> 475
/*     */     //   156: aload_3
/*     */     //   157: invokeinterface startDefaults : ()V
/*     */     //   162: iload #4
/*     */     //   164: iconst_1
/*     */     //   165: iand
/*     */     //   166: ifeq -> 178
/*     */     //   169: aload_3
/*     */     //   170: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   175: ifeq -> 238
/*     */     //   178: iload #5
/*     */     //   180: iconst_1
/*     */     //   181: iand
/*     */     //   182: ifeq -> 192
/*     */     //   185: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   188: checkcast androidx/compose/ui/Modifier
/*     */     //   191: astore_0
/*     */     //   192: iload #5
/*     */     //   194: iconst_2
/*     */     //   195: iand
/*     */     //   196: ifeq -> 216
/*     */     //   199: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   202: aload_3
/*     */     //   203: bipush #6
/*     */     //   205: invokestatic getCircularProgressStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/CircularProgressStyle;
/*     */     //   208: astore_1
/*     */     //   209: iload #6
/*     */     //   211: bipush #-113
/*     */     //   213: iand
/*     */     //   214: istore #6
/*     */     //   216: iload #5
/*     */     //   218: iconst_4
/*     */     //   219: iand
/*     */     //   220: ifeq -> 273
/*     */     //   223: invokestatic getDefault : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   226: astore_2
/*     */     //   227: iload #6
/*     */     //   229: sipush #-897
/*     */     //   232: iand
/*     */     //   233: istore #6
/*     */     //   235: goto -> 273
/*     */     //   238: aload_3
/*     */     //   239: invokeinterface skipToGroupEnd : ()V
/*     */     //   244: iload #5
/*     */     //   246: iconst_2
/*     */     //   247: iand
/*     */     //   248: ifeq -> 258
/*     */     //   251: iload #6
/*     */     //   253: bipush #-113
/*     */     //   255: iand
/*     */     //   256: istore #6
/*     */     //   258: iload #5
/*     */     //   260: iconst_4
/*     */     //   261: iand
/*     */     //   262: ifeq -> 273
/*     */     //   265: iload #6
/*     */     //   267: sipush #-897
/*     */     //   270: iand
/*     */     //   271: istore #6
/*     */     //   273: aload_3
/*     */     //   274: invokeinterface endDefaults : ()V
/*     */     //   279: invokestatic isTraceInProgress : ()Z
/*     */     //   282: ifeq -> 295
/*     */     //   285: ldc -488959809
/*     */     //   287: iload #6
/*     */     //   289: iconst_m1
/*     */     //   290: ldc 'org.jetbrains.jewel.ui.component.CircularProgressIndicator (CircularProgressIndicator.kt:35)'
/*     */     //   292: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   295: aload_0
/*     */     //   296: bipush #16
/*     */     //   298: istore #7
/*     */     //   300: iconst_0
/*     */     //   301: istore #8
/*     */     //   303: iload #7
/*     */     //   305: i2f
/*     */     //   306: invokestatic constructor-impl : (F)F
/*     */     //   309: bipush #16
/*     */     //   311: istore #7
/*     */     //   313: iconst_0
/*     */     //   314: istore #8
/*     */     //   316: iload #7
/*     */     //   318: i2f
/*     */     //   319: invokestatic constructor-impl : (F)F
/*     */     //   322: invokestatic DpSize-YgX7TsA : (FF)J
/*     */     //   325: aload_1
/*     */     //   326: aload_2
/*     */     //   327: aload_3
/*     */     //   328: ldc 1505799487
/*     */     //   330: invokeinterface startReplaceGroup : (I)V
/*     */     //   335: aload_3
/*     */     //   336: astore #8
/*     */     //   338: iconst_0
/*     */     //   339: istore #9
/*     */     //   341: nop
/*     */     //   342: iconst_0
/*     */     //   343: istore #10
/*     */     //   345: aload #8
/*     */     //   347: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   352: astore #11
/*     */     //   354: iconst_0
/*     */     //   355: istore #12
/*     */     //   357: aload #11
/*     */     //   359: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   362: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   365: if_acmpne -> 413
/*     */     //   368: astore #18
/*     */     //   370: astore #17
/*     */     //   372: lstore #15
/*     */     //   374: astore #14
/*     */     //   376: iconst_0
/*     */     //   377: istore #13
/*     */     //   379: getstatic org/jetbrains/jewel/ui/component/CircularProgressIndicatorKt$CircularProgressIndicator$1$1.INSTANCE : Lorg/jetbrains/jewel/ui/component/CircularProgressIndicatorKt$CircularProgressIndicator$1$1;
/*     */     //   382: checkcast kotlin/jvm/functions/Function1
/*     */     //   385: astore #19
/*     */     //   387: aload #14
/*     */     //   389: lload #15
/*     */     //   391: aload #17
/*     */     //   393: aload #18
/*     */     //   395: aload #19
/*     */     //   397: astore #13
/*     */     //   399: aload #8
/*     */     //   401: aload #13
/*     */     //   403: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   408: aload #13
/*     */     //   410: goto -> 415
/*     */     //   413: aload #11
/*     */     //   415: nop
/*     */     //   416: nop
/*     */     //   417: nop
/*     */     //   418: checkcast kotlin/jvm/functions/Function1
/*     */     //   421: astore #7
/*     */     //   423: aload_3
/*     */     //   424: invokeinterface endReplaceGroup : ()V
/*     */     //   429: aload #7
/*     */     //   431: aload_3
/*     */     //   432: sipush #24624
/*     */     //   435: bipush #14
/*     */     //   437: iload #6
/*     */     //   439: iand
/*     */     //   440: ior
/*     */     //   441: sipush #896
/*     */     //   444: iload #6
/*     */     //   446: iconst_3
/*     */     //   447: ishl
/*     */     //   448: iand
/*     */     //   449: ior
/*     */     //   450: sipush #7168
/*     */     //   453: iload #6
/*     */     //   455: iconst_3
/*     */     //   456: ishl
/*     */     //   457: iand
/*     */     //   458: ior
/*     */     //   459: iconst_0
/*     */     //   460: invokestatic CircularProgressIndicatorImpl-coD9juw : (Landroidx/compose/ui/Modifier;JLorg/jetbrains/jewel/ui/component/styling/CircularProgressStyle;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
/*     */     //   463: invokestatic isTraceInProgress : ()Z
/*     */     //   466: ifeq -> 481
/*     */     //   469: invokestatic traceEventEnd : ()V
/*     */     //   472: goto -> 481
/*     */     //   475: aload_3
/*     */     //   476: invokeinterface skipToGroupEnd : ()V
/*     */     //   481: aload_3
/*     */     //   482: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   487: dup
/*     */     //   488: ifnull -> 511
/*     */     //   491: aload_0
/*     */     //   492: aload_1
/*     */     //   493: aload_2
/*     */     //   494: iload #4
/*     */     //   496: iload #5
/*     */     //   498: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/CircularProgressStyle;Lkotlinx/coroutines/CoroutineDispatcher;II)Lkotlin/jvm/functions/Function2;
/*     */     //   503: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   508: goto -> 512
/*     */     //   511: pop
/*     */     //   512: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #36	-> 0
/*     */     //   #33	-> 185
/*     */     //   #34	-> 199
/*     */     //   #35	-> 223
/*     */     //   #36	-> 292
/*     */     //   #38	-> 295
/*     */     //   #39	-> 296
/*     */     //   #183	-> 303
/*     */     //   #39	-> 309
/*     */     //   #183	-> 316
/*     */     //   #39	-> 322
/*     */     //   #40	-> 325
/*     */     //   #41	-> 326
/*     */     //   #42	-> 341
/*     */     //   #184	-> 345
/*     */     //   #185	-> 357
/*     */     //   #186	-> 368
/*     */     //   #42	-> 379
/*     */     //   #186	-> 397
/*     */     //   #187	-> 399
/*     */     //   #188	-> 408
/*     */     //   #189	-> 413
/*     */     //   #185	-> 415
/*     */     //   #184	-> 416
/*     */     //   #184	-> 417
/*     */     //   #42	-> 418
/*     */     //   #37	-> 460
/*     */     //   #44	-> 475
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   303	6	8	$i$f$getDp	I
/*     */     //   300	9	7	$this$dp$iv	I
/*     */     //   316	6	8	$i$f$getDp	I
/*     */     //   313	9	7	$this$dp$iv	I
/*     */     //   379	6	13	$i$a$-cache-CircularProgressIndicatorKt$CircularProgressIndicator$1	I
/*     */     //   399	11	13	value$iv	Ljava/lang/Object;
/*     */     //   357	59	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   354	62	11	it$iv	Ljava/lang/Object;
/*     */     //   345	73	10	$i$f$cache	I
/*     */     //   342	76	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   342	76	9	invalid$iv	Z
/*     */     //   13	500	6	$dirty	I
/*     */     //   0	513	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	513	1	style	Lorg/jetbrains/jewel/ui/component/styling/CircularProgressStyle;
/*     */     //   0	513	2	loadingDispatcher	Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   0	513	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	513	4	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class CircularProgressIndicatorKt$CircularProgressIndicator$1$1 implements Function1<Color, List<? extends String>> { public final List<String> invoke-8_81llA(long color) {
/*  42 */       return SpinnerProgressIconGenerator.Small.INSTANCE.generateSvgFrames(ColorExtensionsKt.toRgbaHexString-8_81llA(color));
/*     */     }
/*     */     
/*     */     public static final CircularProgressIndicatorKt$CircularProgressIndicator$1$1 INSTANCE = new CircularProgressIndicatorKt$CircularProgressIndicator$1$1(); }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void CircularProgressIndicatorBig(@Nullable Modifier modifier, @Nullable CircularProgressStyle style, @Nullable CoroutineDispatcher loadingDispatcher, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: ldc 1075882601
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
/*     */     //   41: aload_0
/*     */     //   42: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   47: ifeq -> 54
/*     */     //   50: iconst_4
/*     */     //   51: goto -> 55
/*     */     //   54: iconst_2
/*     */     //   55: ior
/*     */     //   56: istore #6
/*     */     //   58: iload #4
/*     */     //   60: bipush #48
/*     */     //   62: iand
/*     */     //   63: ifne -> 95
/*     */     //   66: iload #6
/*     */     //   68: iload #5
/*     */     //   70: iconst_2
/*     */     //   71: iand
/*     */     //   72: ifne -> 90
/*     */     //   75: aload_3
/*     */     //   76: aload_1
/*     */     //   77: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   82: ifeq -> 90
/*     */     //   85: bipush #32
/*     */     //   87: goto -> 92
/*     */     //   90: bipush #16
/*     */     //   92: ior
/*     */     //   93: istore #6
/*     */     //   95: iload #4
/*     */     //   97: sipush #384
/*     */     //   100: iand
/*     */     //   101: ifne -> 135
/*     */     //   104: iload #6
/*     */     //   106: iload #5
/*     */     //   108: iconst_4
/*     */     //   109: iand
/*     */     //   110: ifne -> 129
/*     */     //   113: aload_3
/*     */     //   114: aload_2
/*     */     //   115: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   120: ifeq -> 129
/*     */     //   123: sipush #256
/*     */     //   126: goto -> 132
/*     */     //   129: sipush #128
/*     */     //   132: ior
/*     */     //   133: istore #6
/*     */     //   135: iload #6
/*     */     //   137: sipush #147
/*     */     //   140: iand
/*     */     //   141: sipush #146
/*     */     //   144: if_icmpne -> 156
/*     */     //   147: aload_3
/*     */     //   148: invokeinterface getSkipping : ()Z
/*     */     //   153: ifne -> 475
/*     */     //   156: aload_3
/*     */     //   157: invokeinterface startDefaults : ()V
/*     */     //   162: iload #4
/*     */     //   164: iconst_1
/*     */     //   165: iand
/*     */     //   166: ifeq -> 178
/*     */     //   169: aload_3
/*     */     //   170: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   175: ifeq -> 238
/*     */     //   178: iload #5
/*     */     //   180: iconst_1
/*     */     //   181: iand
/*     */     //   182: ifeq -> 192
/*     */     //   185: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   188: checkcast androidx/compose/ui/Modifier
/*     */     //   191: astore_0
/*     */     //   192: iload #5
/*     */     //   194: iconst_2
/*     */     //   195: iand
/*     */     //   196: ifeq -> 216
/*     */     //   199: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   202: aload_3
/*     */     //   203: bipush #6
/*     */     //   205: invokestatic getCircularProgressStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/CircularProgressStyle;
/*     */     //   208: astore_1
/*     */     //   209: iload #6
/*     */     //   211: bipush #-113
/*     */     //   213: iand
/*     */     //   214: istore #6
/*     */     //   216: iload #5
/*     */     //   218: iconst_4
/*     */     //   219: iand
/*     */     //   220: ifeq -> 273
/*     */     //   223: invokestatic getDefault : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   226: astore_2
/*     */     //   227: iload #6
/*     */     //   229: sipush #-897
/*     */     //   232: iand
/*     */     //   233: istore #6
/*     */     //   235: goto -> 273
/*     */     //   238: aload_3
/*     */     //   239: invokeinterface skipToGroupEnd : ()V
/*     */     //   244: iload #5
/*     */     //   246: iconst_2
/*     */     //   247: iand
/*     */     //   248: ifeq -> 258
/*     */     //   251: iload #6
/*     */     //   253: bipush #-113
/*     */     //   255: iand
/*     */     //   256: istore #6
/*     */     //   258: iload #5
/*     */     //   260: iconst_4
/*     */     //   261: iand
/*     */     //   262: ifeq -> 273
/*     */     //   265: iload #6
/*     */     //   267: sipush #-897
/*     */     //   270: iand
/*     */     //   271: istore #6
/*     */     //   273: aload_3
/*     */     //   274: invokeinterface endDefaults : ()V
/*     */     //   279: invokestatic isTraceInProgress : ()Z
/*     */     //   282: ifeq -> 295
/*     */     //   285: ldc 1075882601
/*     */     //   287: iload #6
/*     */     //   289: iconst_m1
/*     */     //   290: ldc 'org.jetbrains.jewel.ui.component.CircularProgressIndicatorBig (CircularProgressIndicator.kt:50)'
/*     */     //   292: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   295: aload_0
/*     */     //   296: bipush #32
/*     */     //   298: istore #7
/*     */     //   300: iconst_0
/*     */     //   301: istore #8
/*     */     //   303: iload #7
/*     */     //   305: i2f
/*     */     //   306: invokestatic constructor-impl : (F)F
/*     */     //   309: bipush #32
/*     */     //   311: istore #7
/*     */     //   313: iconst_0
/*     */     //   314: istore #8
/*     */     //   316: iload #7
/*     */     //   318: i2f
/*     */     //   319: invokestatic constructor-impl : (F)F
/*     */     //   322: invokestatic DpSize-YgX7TsA : (FF)J
/*     */     //   325: aload_1
/*     */     //   326: aload_2
/*     */     //   327: aload_3
/*     */     //   328: ldc 990174867
/*     */     //   330: invokeinterface startReplaceGroup : (I)V
/*     */     //   335: aload_3
/*     */     //   336: astore #8
/*     */     //   338: iconst_0
/*     */     //   339: istore #9
/*     */     //   341: nop
/*     */     //   342: iconst_0
/*     */     //   343: istore #10
/*     */     //   345: aload #8
/*     */     //   347: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   352: astore #11
/*     */     //   354: iconst_0
/*     */     //   355: istore #12
/*     */     //   357: aload #11
/*     */     //   359: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   362: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   365: if_acmpne -> 413
/*     */     //   368: astore #18
/*     */     //   370: astore #17
/*     */     //   372: lstore #15
/*     */     //   374: astore #14
/*     */     //   376: iconst_0
/*     */     //   377: istore #13
/*     */     //   379: getstatic org/jetbrains/jewel/ui/component/CircularProgressIndicatorKt$CircularProgressIndicatorBig$1$1.INSTANCE : Lorg/jetbrains/jewel/ui/component/CircularProgressIndicatorKt$CircularProgressIndicatorBig$1$1;
/*     */     //   382: checkcast kotlin/jvm/functions/Function1
/*     */     //   385: astore #19
/*     */     //   387: aload #14
/*     */     //   389: lload #15
/*     */     //   391: aload #17
/*     */     //   393: aload #18
/*     */     //   395: aload #19
/*     */     //   397: astore #13
/*     */     //   399: aload #8
/*     */     //   401: aload #13
/*     */     //   403: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   408: aload #13
/*     */     //   410: goto -> 415
/*     */     //   413: aload #11
/*     */     //   415: nop
/*     */     //   416: nop
/*     */     //   417: nop
/*     */     //   418: checkcast kotlin/jvm/functions/Function1
/*     */     //   421: astore #7
/*     */     //   423: aload_3
/*     */     //   424: invokeinterface endReplaceGroup : ()V
/*     */     //   429: aload #7
/*     */     //   431: aload_3
/*     */     //   432: sipush #24624
/*     */     //   435: bipush #14
/*     */     //   437: iload #6
/*     */     //   439: iand
/*     */     //   440: ior
/*     */     //   441: sipush #896
/*     */     //   444: iload #6
/*     */     //   446: iconst_3
/*     */     //   447: ishl
/*     */     //   448: iand
/*     */     //   449: ior
/*     */     //   450: sipush #7168
/*     */     //   453: iload #6
/*     */     //   455: iconst_3
/*     */     //   456: ishl
/*     */     //   457: iand
/*     */     //   458: ior
/*     */     //   459: iconst_0
/*     */     //   460: invokestatic CircularProgressIndicatorImpl-coD9juw : (Landroidx/compose/ui/Modifier;JLorg/jetbrains/jewel/ui/component/styling/CircularProgressStyle;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
/*     */     //   463: invokestatic isTraceInProgress : ()Z
/*     */     //   466: ifeq -> 481
/*     */     //   469: invokestatic traceEventEnd : ()V
/*     */     //   472: goto -> 481
/*     */     //   475: aload_3
/*     */     //   476: invokeinterface skipToGroupEnd : ()V
/*     */     //   481: aload_3
/*     */     //   482: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   487: dup
/*     */     //   488: ifnull -> 511
/*     */     //   491: aload_0
/*     */     //   492: aload_1
/*     */     //   493: aload_2
/*     */     //   494: iload #4
/*     */     //   496: iload #5
/*     */     //   498: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/CircularProgressStyle;Lkotlinx/coroutines/CoroutineDispatcher;II)Lkotlin/jvm/functions/Function2;
/*     */     //   503: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   508: goto -> 512
/*     */     //   511: pop
/*     */     //   512: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #51	-> 0
/*     */     //   #48	-> 185
/*     */     //   #49	-> 199
/*     */     //   #50	-> 223
/*     */     //   #51	-> 292
/*     */     //   #53	-> 295
/*     */     //   #54	-> 296
/*     */     //   #190	-> 303
/*     */     //   #54	-> 309
/*     */     //   #190	-> 316
/*     */     //   #54	-> 322
/*     */     //   #55	-> 325
/*     */     //   #56	-> 326
/*     */     //   #57	-> 341
/*     */     //   #191	-> 345
/*     */     //   #192	-> 357
/*     */     //   #193	-> 368
/*     */     //   #57	-> 379
/*     */     //   #193	-> 397
/*     */     //   #194	-> 399
/*     */     //   #195	-> 408
/*     */     //   #196	-> 413
/*     */     //   #192	-> 415
/*     */     //   #191	-> 416
/*     */     //   #191	-> 417
/*     */     //   #57	-> 418
/*     */     //   #52	-> 460
/*     */     //   #59	-> 475
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   303	6	8	$i$f$getDp	I
/*     */     //   300	9	7	$this$dp$iv	I
/*     */     //   316	6	8	$i$f$getDp	I
/*     */     //   313	9	7	$this$dp$iv	I
/*     */     //   379	6	13	$i$a$-cache-CircularProgressIndicatorKt$CircularProgressIndicatorBig$1	I
/*     */     //   399	11	13	value$iv	Ljava/lang/Object;
/*     */     //   357	59	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   354	62	11	it$iv	Ljava/lang/Object;
/*     */     //   345	73	10	$i$f$cache	I
/*     */     //   342	76	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   342	76	9	invalid$iv	Z
/*     */     //   13	500	6	$dirty	I
/*     */     //   0	513	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	513	1	style	Lorg/jetbrains/jewel/ui/component/styling/CircularProgressStyle;
/*     */     //   0	513	2	loadingDispatcher	Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   0	513	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	513	4	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class CircularProgressIndicatorKt$CircularProgressIndicatorBig$1$1 implements Function1<Color, List<? extends String>> { public static final CircularProgressIndicatorKt$CircularProgressIndicatorBig$1$1 INSTANCE = new CircularProgressIndicatorKt$CircularProgressIndicatorBig$1$1();
/*     */     
/*     */     public final List<String> invoke-8_81llA(long color) {
/*  57 */       return SpinnerProgressIconGenerator.Big.INSTANCE.generateSvgFrames(ColorExtensionsKt.toRgbaHexString-8_81llA(color));
/*     */     } }
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void CircularProgressIndicatorImpl-coD9juw(Modifier modifier, long iconSize, CircularProgressStyle style, CoroutineDispatcher dispatcher, Function1 frameRetriever, Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: ldc -1885298575
/*     */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   9: astore #6
/*     */     //   11: iload #7
/*     */     //   13: istore #9
/*     */     //   15: iload #8
/*     */     //   17: iconst_1
/*     */     //   18: iand
/*     */     //   19: ifeq -> 32
/*     */     //   22: iload #9
/*     */     //   24: bipush #6
/*     */     //   26: ior
/*     */     //   27: istore #9
/*     */     //   29: goto -> 61
/*     */     //   32: iload #7
/*     */     //   34: bipush #6
/*     */     //   36: iand
/*     */     //   37: ifne -> 61
/*     */     //   40: iload #9
/*     */     //   42: aload #6
/*     */     //   44: aload_0
/*     */     //   45: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   50: ifeq -> 57
/*     */     //   53: iconst_4
/*     */     //   54: goto -> 58
/*     */     //   57: iconst_2
/*     */     //   58: ior
/*     */     //   59: istore #9
/*     */     //   61: iload #8
/*     */     //   63: iconst_2
/*     */     //   64: iand
/*     */     //   65: ifeq -> 78
/*     */     //   68: iload #9
/*     */     //   70: bipush #48
/*     */     //   72: ior
/*     */     //   73: istore #9
/*     */     //   75: goto -> 109
/*     */     //   78: iload #7
/*     */     //   80: bipush #48
/*     */     //   82: iand
/*     */     //   83: ifne -> 109
/*     */     //   86: iload #9
/*     */     //   88: aload #6
/*     */     //   90: lload_1
/*     */     //   91: invokeinterface changed : (J)Z
/*     */     //   96: ifeq -> 104
/*     */     //   99: bipush #32
/*     */     //   101: goto -> 106
/*     */     //   104: bipush #16
/*     */     //   106: ior
/*     */     //   107: istore #9
/*     */     //   109: iload #8
/*     */     //   111: iconst_4
/*     */     //   112: iand
/*     */     //   113: ifeq -> 127
/*     */     //   116: iload #9
/*     */     //   118: sipush #384
/*     */     //   121: ior
/*     */     //   122: istore #9
/*     */     //   124: goto -> 161
/*     */     //   127: iload #7
/*     */     //   129: sipush #384
/*     */     //   132: iand
/*     */     //   133: ifne -> 161
/*     */     //   136: iload #9
/*     */     //   138: aload #6
/*     */     //   140: aload_3
/*     */     //   141: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   146: ifeq -> 155
/*     */     //   149: sipush #256
/*     */     //   152: goto -> 158
/*     */     //   155: sipush #128
/*     */     //   158: ior
/*     */     //   159: istore #9
/*     */     //   161: iload #8
/*     */     //   163: bipush #8
/*     */     //   165: iand
/*     */     //   166: ifeq -> 180
/*     */     //   169: iload #9
/*     */     //   171: sipush #3072
/*     */     //   174: ior
/*     */     //   175: istore #9
/*     */     //   177: goto -> 215
/*     */     //   180: iload #7
/*     */     //   182: sipush #3072
/*     */     //   185: iand
/*     */     //   186: ifne -> 215
/*     */     //   189: iload #9
/*     */     //   191: aload #6
/*     */     //   193: aload #4
/*     */     //   195: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   200: ifeq -> 209
/*     */     //   203: sipush #2048
/*     */     //   206: goto -> 212
/*     */     //   209: sipush #1024
/*     */     //   212: ior
/*     */     //   213: istore #9
/*     */     //   215: iload #8
/*     */     //   217: bipush #16
/*     */     //   219: iand
/*     */     //   220: ifeq -> 234
/*     */     //   223: iload #9
/*     */     //   225: sipush #24576
/*     */     //   228: ior
/*     */     //   229: istore #9
/*     */     //   231: goto -> 269
/*     */     //   234: iload #7
/*     */     //   236: sipush #24576
/*     */     //   239: iand
/*     */     //   240: ifne -> 269
/*     */     //   243: iload #9
/*     */     //   245: aload #6
/*     */     //   247: aload #5
/*     */     //   249: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   254: ifeq -> 263
/*     */     //   257: sipush #16384
/*     */     //   260: goto -> 266
/*     */     //   263: sipush #8192
/*     */     //   266: ior
/*     */     //   267: istore #9
/*     */     //   269: iload #9
/*     */     //   271: sipush #9363
/*     */     //   274: iand
/*     */     //   275: sipush #9362
/*     */     //   278: if_icmpne -> 291
/*     */     //   281: aload #6
/*     */     //   283: invokeinterface getSkipping : ()Z
/*     */     //   288: ifne -> 852
/*     */     //   291: iload #8
/*     */     //   293: iconst_1
/*     */     //   294: iand
/*     */     //   295: ifeq -> 305
/*     */     //   298: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   301: checkcast androidx/compose/ui/Modifier
/*     */     //   304: astore_0
/*     */     //   305: invokestatic isTraceInProgress : ()Z
/*     */     //   308: ifeq -> 321
/*     */     //   311: ldc -1885298575
/*     */     //   313: iload #9
/*     */     //   315: iconst_m1
/*     */     //   316: ldc 'org.jetbrains.jewel.ui.component.CircularProgressIndicatorImpl (CircularProgressIndicator.kt:68)'
/*     */     //   318: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   321: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   324: aload #6
/*     */     //   326: bipush #6
/*     */     //   328: invokevirtual isDark : (Landroidx/compose/runtime/Composer;I)Z
/*     */     //   331: ifeq -> 343
/*     */     //   334: ldc2_w 4285494138
/*     */     //   337: invokestatic Color : (J)J
/*     */     //   340: goto -> 349
/*     */     //   343: ldc2_w 4289244605
/*     */     //   346: invokestatic Color : (J)J
/*     */     //   349: lstore #10
/*     */     //   351: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   354: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   357: astore #13
/*     */     //   359: iconst_0
/*     */     //   360: istore #14
/*     */     //   362: iconst_0
/*     */     //   363: istore #15
/*     */     //   365: aload #6
/*     */     //   367: ldc 2023513938
/*     */     //   369: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   371: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   374: aload #6
/*     */     //   376: aload #13
/*     */     //   378: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   383: astore #16
/*     */     //   385: aload #6
/*     */     //   387: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   390: aload #16
/*     */     //   392: checkcast androidx/compose/ui/unit/Density
/*     */     //   395: astore #12
/*     */     //   397: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   400: iconst_4
/*     */     //   401: anewarray java/lang/Object
/*     */     //   404: astore #14
/*     */     //   406: aload #14
/*     */     //   408: iconst_0
/*     */     //   409: aload #12
/*     */     //   411: aastore
/*     */     //   412: aload #14
/*     */     //   414: iconst_1
/*     */     //   415: aload_3
/*     */     //   416: invokevirtual getColor-0d7_KjU : ()J
/*     */     //   419: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*     */     //   422: aastore
/*     */     //   423: aload #14
/*     */     //   425: iconst_2
/*     */     //   426: lload #10
/*     */     //   428: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*     */     //   431: aastore
/*     */     //   432: aload #14
/*     */     //   434: iconst_3
/*     */     //   435: aload #4
/*     */     //   437: aastore
/*     */     //   438: aload #14
/*     */     //   440: aload #6
/*     */     //   442: ldc_w 832918893
/*     */     //   445: invokeinterface startReplaceGroup : (I)V
/*     */     //   450: aload #6
/*     */     //   452: astore #15
/*     */     //   454: aload #6
/*     */     //   456: aload #4
/*     */     //   458: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   463: iload #9
/*     */     //   465: ldc_w 57344
/*     */     //   468: iand
/*     */     //   469: sipush #16384
/*     */     //   472: if_icmpne -> 479
/*     */     //   475: iconst_1
/*     */     //   476: goto -> 480
/*     */     //   479: iconst_0
/*     */     //   480: ior
/*     */     //   481: iload #9
/*     */     //   483: sipush #896
/*     */     //   486: iand
/*     */     //   487: sipush #256
/*     */     //   490: if_icmpne -> 497
/*     */     //   493: iconst_1
/*     */     //   494: goto -> 498
/*     */     //   497: iconst_0
/*     */     //   498: ior
/*     */     //   499: aload #6
/*     */     //   501: lload #10
/*     */     //   503: invokeinterface changed : (J)Z
/*     */     //   508: ior
/*     */     //   509: aload #6
/*     */     //   511: aload #12
/*     */     //   513: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   518: ior
/*     */     //   519: istore #16
/*     */     //   521: iconst_0
/*     */     //   522: istore #17
/*     */     //   524: aload #15
/*     */     //   526: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   531: astore #18
/*     */     //   533: iconst_0
/*     */     //   534: istore #19
/*     */     //   536: iload #16
/*     */     //   538: ifne -> 552
/*     */     //   541: aload #18
/*     */     //   543: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   546: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   549: if_acmpne -> 603
/*     */     //   552: astore #23
/*     */     //   554: astore #22
/*     */     //   556: iconst_0
/*     */     //   557: istore #20
/*     */     //   559: new org/jetbrains/jewel/ui/component/CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1
/*     */     //   562: dup
/*     */     //   563: aload #4
/*     */     //   565: aload #5
/*     */     //   567: aload_3
/*     */     //   568: lload #10
/*     */     //   570: aload #12
/*     */     //   572: aconst_null
/*     */     //   573: invokespecial <init> : (Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/ui/component/styling/CircularProgressStyle;JLandroidx/compose/ui/unit/Density;Lkotlin/coroutines/Continuation;)V
/*     */     //   576: checkcast kotlin/jvm/functions/Function2
/*     */     //   579: astore #24
/*     */     //   581: aload #22
/*     */     //   583: aload #23
/*     */     //   585: aload #24
/*     */     //   587: astore #21
/*     */     //   589: aload #15
/*     */     //   591: aload #21
/*     */     //   593: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   598: aload #21
/*     */     //   600: goto -> 605
/*     */     //   603: aload #18
/*     */     //   605: nop
/*     */     //   606: nop
/*     */     //   607: nop
/*     */     //   608: checkcast kotlin/jvm/functions/Function2
/*     */     //   611: astore #14
/*     */     //   613: aload #6
/*     */     //   615: invokeinterface endReplaceGroup : ()V
/*     */     //   620: aload #14
/*     */     //   622: aload #6
/*     */     //   624: bipush #6
/*     */     //   626: invokestatic produceState : (Ljava/lang/Object;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   629: astore #13
/*     */     //   631: aload #13
/*     */     //   633: invokestatic CircularProgressIndicatorImpl_coD9juw$lambda$5 : (Landroidx/compose/runtime/State;)Ljava/util/List;
/*     */     //   636: invokeinterface isEmpty : ()Z
/*     */     //   641: ifeq -> 675
/*     */     //   644: aload #6
/*     */     //   646: ldc_w 50964753
/*     */     //   649: invokeinterface startReplaceGroup : (I)V
/*     */     //   654: aload_0
/*     */     //   655: lload_1
/*     */     //   656: invokestatic size-6HolHcs : (Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;
/*     */     //   659: aload #6
/*     */     //   661: iconst_0
/*     */     //   662: invokestatic Box : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   665: aload #6
/*     */     //   667: invokeinterface endReplaceGroup : ()V
/*     */     //   672: goto -> 840
/*     */     //   675: aload #6
/*     */     //   677: ldc_w 51039618
/*     */     //   680: invokeinterface startReplaceGroup : (I)V
/*     */     //   685: aload #13
/*     */     //   687: invokestatic CircularProgressIndicatorImpl_coD9juw$lambda$5 : (Landroidx/compose/runtime/State;)Ljava/util/List;
/*     */     //   690: invokeinterface size : ()I
/*     */     //   695: istore #14
/*     */     //   697: ldc_w 'CircularProgressIndicator'
/*     */     //   700: aload #6
/*     */     //   702: bipush #6
/*     */     //   704: iconst_0
/*     */     //   705: invokestatic rememberInfiniteTransition : (Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/InfiniteTransition;
/*     */     //   708: astore #15
/*     */     //   710: aload #15
/*     */     //   712: iconst_0
/*     */     //   713: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   716: iload #14
/*     */     //   718: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   721: getstatic kotlin/jvm/internal/IntCompanionObject.INSTANCE : Lkotlin/jvm/internal/IntCompanionObject;
/*     */     //   724: invokestatic getVectorConverter : (Lkotlin/jvm/internal/IntCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;
/*     */     //   727: new androidx/compose/animation/core/InfiniteRepeatableSpec
/*     */     //   730: dup
/*     */     //   731: invokestatic getLinearEasing : ()Landroidx/compose/animation/core/Easing;
/*     */     //   734: astore #17
/*     */     //   736: aload_3
/*     */     //   737: invokevirtual getFrameTime-UwyO8pc : ()J
/*     */     //   740: invokestatic getInWholeMilliseconds-impl : (J)J
/*     */     //   743: iload #14
/*     */     //   745: i2l
/*     */     //   746: lmul
/*     */     //   747: l2i
/*     */     //   748: iconst_0
/*     */     //   749: aload #17
/*     */     //   751: iconst_2
/*     */     //   752: aconst_null
/*     */     //   753: invokestatic tween$default : (IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;
/*     */     //   756: checkcast androidx/compose/animation/core/DurationBasedAnimationSpec
/*     */     //   759: getstatic androidx/compose/animation/core/RepeatMode.Restart : Landroidx/compose/animation/core/RepeatMode;
/*     */     //   762: lconst_0
/*     */     //   763: iconst_4
/*     */     //   764: aconst_null
/*     */     //   765: invokespecial <init> : (Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   768: aconst_null
/*     */     //   769: aload #6
/*     */     //   771: bipush #48
/*     */     //   773: getstatic androidx/compose/animation/core/InfiniteTransition.$stable : I
/*     */     //   776: ior
/*     */     //   777: getstatic androidx/compose/animation/core/InfiniteRepeatableSpec.$stable : I
/*     */     //   780: bipush #12
/*     */     //   782: ishl
/*     */     //   783: ior
/*     */     //   784: bipush #16
/*     */     //   786: invokestatic animateValue : (Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   789: astore #16
/*     */     //   791: aload #13
/*     */     //   793: invokestatic CircularProgressIndicatorImpl_coD9juw$lambda$5 : (Landroidx/compose/runtime/State;)Ljava/util/List;
/*     */     //   796: aload #16
/*     */     //   798: invokestatic CircularProgressIndicatorImpl_coD9juw$lambda$6 : (Landroidx/compose/runtime/State;)I
/*     */     //   801: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   806: checkcast androidx/compose/ui/graphics/painter/Painter
/*     */     //   809: astore #17
/*     */     //   811: aload_0
/*     */     //   812: lload_1
/*     */     //   813: invokestatic size-6HolHcs : (Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;
/*     */     //   816: astore #18
/*     */     //   818: aload #17
/*     */     //   820: aconst_null
/*     */     //   821: aload #18
/*     */     //   823: lconst_0
/*     */     //   824: aload #6
/*     */     //   826: bipush #48
/*     */     //   828: bipush #8
/*     */     //   830: invokestatic Icon-ww6aTOc : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V
/*     */     //   833: aload #6
/*     */     //   835: invokeinterface endReplaceGroup : ()V
/*     */     //   840: invokestatic isTraceInProgress : ()Z
/*     */     //   843: ifeq -> 859
/*     */     //   846: invokestatic traceEventEnd : ()V
/*     */     //   849: goto -> 859
/*     */     //   852: aload #6
/*     */     //   854: invokeinterface skipToGroupEnd : ()V
/*     */     //   859: aload #6
/*     */     //   861: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   866: dup
/*     */     //   867: ifnull -> 894
/*     */     //   870: aload_0
/*     */     //   871: lload_1
/*     */     //   872: aload_3
/*     */     //   873: aload #4
/*     */     //   875: aload #5
/*     */     //   877: iload #7
/*     */     //   879: iload #8
/*     */     //   881: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;JLorg/jetbrains/jewel/ui/component/styling/CircularProgressStyle;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;II)Lkotlin/jvm/functions/Function2;
/*     */     //   886: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   891: goto -> 895
/*     */     //   894: pop
/*     */     //   895: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #69	-> 0
/*     */     //   #64	-> 298
/*     */     //   #69	-> 318
/*     */     //   #70	-> 321
/*     */     //   #72	-> 351
/*     */     //   #197	-> 371
/*     */     //   #72	-> 392
/*     */     //   #74	-> 397
/*     */     //   #198	-> 524
/*     */     //   #199	-> 536
/*     */     //   #200	-> 552
/*     */     //   #74	-> 559
/*     */     //   #200	-> 587
/*     */     //   #201	-> 589
/*     */     //   #202	-> 598
/*     */     //   #203	-> 603
/*     */     //   #199	-> 605
/*     */     //   #198	-> 606
/*     */     //   #198	-> 607
/*     */     //   #74	-> 608
/*     */     //   #73	-> 629
/*     */     //   #83	-> 631
/*     */     //   #84	-> 654
/*     */     //   #83	-> 665
/*     */     //   #85	-> 675
/*     */     //   #86	-> 685
/*     */     //   #87	-> 697
/*     */     //   #89	-> 710
/*     */     //   #90	-> 712
/*     */     //   #91	-> 716
/*     */     //   #92	-> 721
/*     */     //   #94	-> 727
/*     */     //   #96	-> 731
/*     */     //   #97	-> 736
/*     */     //   #95	-> 748
/*     */     //   #96	-> 749
/*     */     //   #95	-> 751
/*     */     //   #99	-> 759
/*     */     //   #94	-> 762
/*     */     //   #89	-> 786
/*     */     //   #88	-> 789
/*     */     //   #103	-> 791
/*     */     //   #104	-> 811
/*     */     //   #85	-> 833
/*     */     //   #106	-> 852
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   365	27	15	$i$f$getCurrent	I
/*     */     //   362	30	13	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   362	30	14	$changed$iv	I
/*     */     //   559	20	20	$i$a$-cache-CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2	I
/*     */     //   589	11	21	value$iv	Ljava/lang/Object;
/*     */     //   536	70	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   533	73	18	it$iv	Ljava/lang/Object;
/*     */     //   524	84	17	$i$f$cache	I
/*     */     //   521	87	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   521	87	16	invalid$iv	Z
/*     */     //   697	136	14	framesCount	I
/*     */     //   710	123	15	transition	Landroidx/compose/animation/core/InfiniteTransition;
/*     */     //   791	42	16	currentIndex$delegate	Landroidx/compose/runtime/State;
/*     */     //   811	22	17	currentPainter	Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   351	498	10	defaultColor	J
/*     */     //   397	452	12	density	Landroidx/compose/ui/unit/Density;
/*     */     //   631	218	13	frames$delegate	Landroidx/compose/runtime/State;
/*     */     //   15	881	9	$dirty	I
/*     */     //   0	896	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	896	1	iconSize	J
/*     */     //   0	896	3	style	Lorg/jetbrains/jewel/ui/component/styling/CircularProgressStyle;
/*     */     //   0	896	4	dispatcher	Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   0	896	5	frameRetriever	Lkotlin/jvm/functions/Function1;
/*     */     //   0	896	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	896	7	$changed	I
/*     */   }
/*     */   private static final Unit CircularProgressIndicator$lambda$1(Modifier $modifier, CircularProgressStyle $style, CoroutineDispatcher $loadingDispatcher, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     CircularProgressIndicator($modifier, $style, $loadingDispatcher, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit CircularProgressIndicatorBig$lambda$3(Modifier $modifier, CircularProgressStyle $style, CoroutineDispatcher $loadingDispatcher, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     CircularProgressIndicatorBig($modifier, $style, $loadingDispatcher, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*  74 */   private static final List<Painter> CircularProgressIndicatorImpl_coD9juw$lambda$5(State $frames$delegate) { State state = $frames$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 204 */       (List<Painter>)state.getValue(); } private static final int CircularProgressIndicatorImpl_coD9juw$lambda$6(State $currentIndex$delegate) { State state = $currentIndex$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 205 */     return ((Number)state.getValue()).intValue(); }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "CircularProgressIndicator.kt", l = {76}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\002\n\002\030\002\n\002\020 \n\002\030\002\020\000\032\0020\001*\016\022\n\022\b\022\004\022\0020\0040\0030\002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", "", "Landroidx/compose/ui/graphics/painter/Painter;"})
/*     */   static final class CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1 extends SuspendLambda implements Function2<ProduceStateScope<List<? extends Painter>>, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1(CoroutineDispatcher $dispatcher, Function1<Color, List<String>> $frameRetriever, CircularProgressStyle $style, long $defaultColor, Density $density, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       ProduceStateScope $this$produceState, produceStateScope1;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           $this$produceState = (ProduceStateScope)this.L$0;
/*     */           produceStateScope1 = $this$produceState;
/*     */           this.L$0 = produceStateScope1;
/*     */           this.label = 1;
/*     */           if (BuildersKt.withContext((CoroutineContext)this.$dispatcher, new Function2<CoroutineScope, Continuation<? super List<? extends Painter>>, Object>(this.$frameRetriever, this.$style, this.$defaultColor, this.$density, null) {
/*     */                 int label;
/*     */                 
/*     */                 public final Object invokeSuspend(Object $result) {
/*     */                   long l1;
/*     */                   Iterable iterable1;
/*     */                   Density density;
/*     */                   long l2;
/*     */                   int $i$f$map;
/*     */                   Iterable iterable2;
/*     */                   int $i$f$takeOrElse-DxMtmZc;
/*     */                   Collection<Painter> destination$iv$iv;
/*     */                   long $this$isSpecified$iv$iv;
/*     */                   int $i$f$mapTo, $i$f$isSpecified-8_81llA;
/*     */                   IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                   switch (this.label) {
/*     */                     case 0:
/*     */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                       l1 = this.$style.getColor-0d7_KjU();
/*     */                       l2 = this.$defaultColor;
/*     */                       $i$f$takeOrElse-DxMtmZc = 0;
/*     */                       $this$isSpecified$iv$iv = l1;
/*     */                       $i$f$isSpecified-8_81llA = 0;
/*     */                       if (($this$isSpecified$iv$iv != 16L)) {
/*     */                       
/*     */                       } else {
/*     */                         Function1<Color, List<String>> function1 = this.$frameRetriever;
/*     */                         int $i$a$-takeOrElse-DxMtmZc-CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1$1$1 = 0;
/*     */                         long l = l2;
/*     */                       } 
/*     */                       iterable1 = (Iterable)function1.invoke(Color.box-impl(l));
/*     */                       density = this.$density;
/*     */                       $i$f$map = 0;
/*     */                       iterable2 = iterable1;
/*     */                       destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10));
/*     */                       $i$f$mapTo = 0;
/*     */                       for (Object item$iv$iv : iterable2) {
/*     */                         String str = (String)item$iv$iv;
/*     */                         Collection<Painter> collection = destination$iv$iv;
/*     */                         int $i$a$-map-CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1$1$2 = 0;
/*     */                         Intrinsics.checkNotNullExpressionValue(str.getBytes(Charsets.UTF_8), "getBytes(...)");
/*     */                         collection.add(ImageDecoders_skikoKt.decodeToSvgPainter(str.getBytes(Charsets.UTF_8), density));
/*     */                       } 
/*     */                       return destination$iv$iv;
/*     */                   } 
/*     */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                 }
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   return (Continuation)new Function2<>(this.$frameRetriever, this.$style, this.$defaultColor, this.$density, $completion);
/*     */                 }
/*     */                 
/*     */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           produceStateScope1.setValue(BuildersKt.withContext((CoroutineContext)this.$dispatcher, new Function2<CoroutineScope, Continuation<? super List<? extends Painter>>, Object>(this.$frameRetriever, this.$style, this.$defaultColor, this.$density, null) {
/*     */                   int label;
/*     */                   
/*     */                   public final Object invokeSuspend(Object $result) {
/*     */                     long l1;
/*     */                     Iterable iterable1;
/*     */                     Density density;
/*     */                     long l2;
/*     */                     int $i$f$map;
/*     */                     Iterable iterable2;
/*     */                     int $i$f$takeOrElse-DxMtmZc;
/*     */                     Collection<Painter> destination$iv$iv;
/*     */                     long $this$isSpecified$iv$iv;
/*     */                     int $i$f$mapTo, $i$f$isSpecified-8_81llA;
/*     */                     IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                     switch (this.label) {
/*     */                       case 0:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         l1 = this.$style.getColor-0d7_KjU();
/*     */                         l2 = this.$defaultColor;
/*     */                         $i$f$takeOrElse-DxMtmZc = 0;
/*     */                         $this$isSpecified$iv$iv = l1;
/*     */                         $i$f$isSpecified-8_81llA = 0;
/*     */                         if (($this$isSpecified$iv$iv != 16L)) {
/*     */                         
/*     */                         } else {
/*     */                           Function1<Color, List<String>> function1 = this.$frameRetriever;
/*     */                           int $i$a$-takeOrElse-DxMtmZc-CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1$1$1 = 0;
/*     */                           long l = l2;
/*     */                         } 
/*     */                         iterable1 = (Iterable)function1.invoke(Color.box-impl(l));
/*     */                         density = this.$density;
/*     */                         $i$f$map = 0;
/*     */                         iterable2 = iterable1;
/*     */                         destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10));
/*     */                         $i$f$mapTo = 0;
/*     */                         for (Object item$iv$iv : iterable2) {
/*     */                           String str = (String)item$iv$iv;
/*     */                           Collection<Painter> collection = destination$iv$iv;
/*     */                           int $i$a$-map-CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1$1$2 = 0;
/*     */                           Intrinsics.checkNotNullExpressionValue(str.getBytes(Charsets.UTF_8), "getBytes(...)");
/*     */                           collection.add(ImageDecoders_skikoKt.decodeToSvgPainter(str.getBytes(Charsets.UTF_8), density));
/*     */                         } 
/*     */                         return destination$iv$iv;
/*     */                     } 
/*     */                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                   }
/*     */                   
/*     */                   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                     return (Continuation)new Function2<>(this.$frameRetriever, this.$style, this.$defaultColor, this.$density, $completion);
/*     */                   }
/*     */                   
/*     */                   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */                     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                   }
/*     */                 }(Continuation)this));
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           produceStateScope1 = (ProduceStateScope)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           produceStateScope1.setValue(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1> $completion) {
/*     */       CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1 circularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1 = new CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1(this.$dispatcher, this.$frameRetriever, this.$style, this.$defaultColor, this.$density, $completion);
/*     */       circularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1.L$0 = value;
/*     */       return (Continuation<Unit>)circularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1;
/*     */     }
/*     */     
/*     */     public final Object invoke(ProduceStateScope p1, Continuation<?> p2) {
/*     */       return ((CircularProgressIndicatorKt$CircularProgressIndicatorImpl$frames$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit CircularProgressIndicatorImpl_coD9juw$lambda$7(Modifier $modifier, long $iconSize, CircularProgressStyle $style, CoroutineDispatcher $dispatcher, Function1<? super Color, ? extends List<String>> $frameRetriever, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     CircularProgressIndicatorImpl-coD9juw($modifier, $iconSize, $style, $dispatcher, $frameRetriever, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\CircularProgressIndicatorKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */