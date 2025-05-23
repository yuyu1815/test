/*     */ package org.jetbrains.jewel.ui.component;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.shape.RoundedCornerShape;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.Shape;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.PopupContainerColors;
/*     */ import org.jetbrains.jewel.ui.component.styling.PopupContainerStyle;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000.\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032T\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0010\0032\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\021\020\f\032\r\022\004\022\0020\0010\003¢\006\002\b\rH\007¢\006\002\020\016¨\006\017"}, d2 = {"PopupContainer", "", "onDismissRequest", "Lkotlin/Function0;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Lorg/jetbrains/jewel/ui/component/styling/PopupContainerStyle;", "popupProperties", "Landroidx/compose/ui/window/PopupProperties;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/PopupContainerStyle;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ui"})
/*     */ @SourceDebugExtension({"SMAP\nPopupContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PopupContainer.kt\norg/jetbrains/jewel/ui/component/PopupContainerKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,62:1\n77#2:63\n*S KotlinDebug\n*F\n+ 1 PopupContainer.kt\norg/jetbrains/jewel/ui/component/PopupContainerKt\n*L\n34#1:63\n*E\n"})
/*     */ public final class PopupContainerKt {
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void PopupContainer(@NotNull Function0 onDismissRequest, @NotNull Alignment.Horizontal horizontalAlignment, @Nullable Modifier modifier, @Nullable PopupContainerStyle style, @Nullable PopupProperties popupProperties, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'onDismissRequest'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'horizontalAlignment'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #5
/*     */     //   14: ldc 'content'
/*     */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   19: aload #6
/*     */     //   21: ldc 1397635557
/*     */     //   23: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   28: astore #6
/*     */     //   30: iload #7
/*     */     //   32: istore #9
/*     */     //   34: iload #8
/*     */     //   36: iconst_1
/*     */     //   37: iand
/*     */     //   38: ifeq -> 51
/*     */     //   41: iload #9
/*     */     //   43: bipush #6
/*     */     //   45: ior
/*     */     //   46: istore #9
/*     */     //   48: goto -> 80
/*     */     //   51: iload #7
/*     */     //   53: bipush #6
/*     */     //   55: iand
/*     */     //   56: ifne -> 80
/*     */     //   59: iload #9
/*     */     //   61: aload #6
/*     */     //   63: aload_0
/*     */     //   64: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   69: ifeq -> 76
/*     */     //   72: iconst_4
/*     */     //   73: goto -> 77
/*     */     //   76: iconst_2
/*     */     //   77: ior
/*     */     //   78: istore #9
/*     */     //   80: iload #8
/*     */     //   82: iconst_2
/*     */     //   83: iand
/*     */     //   84: ifeq -> 97
/*     */     //   87: iload #9
/*     */     //   89: bipush #48
/*     */     //   91: ior
/*     */     //   92: istore #9
/*     */     //   94: goto -> 128
/*     */     //   97: iload #7
/*     */     //   99: bipush #48
/*     */     //   101: iand
/*     */     //   102: ifne -> 128
/*     */     //   105: iload #9
/*     */     //   107: aload #6
/*     */     //   109: aload_1
/*     */     //   110: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   115: ifeq -> 123
/*     */     //   118: bipush #32
/*     */     //   120: goto -> 125
/*     */     //   123: bipush #16
/*     */     //   125: ior
/*     */     //   126: istore #9
/*     */     //   128: iload #8
/*     */     //   130: iconst_4
/*     */     //   131: iand
/*     */     //   132: ifeq -> 146
/*     */     //   135: iload #9
/*     */     //   137: sipush #384
/*     */     //   140: ior
/*     */     //   141: istore #9
/*     */     //   143: goto -> 180
/*     */     //   146: iload #7
/*     */     //   148: sipush #384
/*     */     //   151: iand
/*     */     //   152: ifne -> 180
/*     */     //   155: iload #9
/*     */     //   157: aload #6
/*     */     //   159: aload_2
/*     */     //   160: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   165: ifeq -> 174
/*     */     //   168: sipush #256
/*     */     //   171: goto -> 177
/*     */     //   174: sipush #128
/*     */     //   177: ior
/*     */     //   178: istore #9
/*     */     //   180: iload #7
/*     */     //   182: sipush #3072
/*     */     //   185: iand
/*     */     //   186: ifne -> 222
/*     */     //   189: iload #9
/*     */     //   191: iload #8
/*     */     //   193: bipush #8
/*     */     //   195: iand
/*     */     //   196: ifne -> 216
/*     */     //   199: aload #6
/*     */     //   201: aload_3
/*     */     //   202: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   207: ifeq -> 216
/*     */     //   210: sipush #2048
/*     */     //   213: goto -> 219
/*     */     //   216: sipush #1024
/*     */     //   219: ior
/*     */     //   220: istore #9
/*     */     //   222: iload #8
/*     */     //   224: bipush #16
/*     */     //   226: iand
/*     */     //   227: ifeq -> 241
/*     */     //   230: iload #9
/*     */     //   232: sipush #24576
/*     */     //   235: ior
/*     */     //   236: istore #9
/*     */     //   238: goto -> 276
/*     */     //   241: iload #7
/*     */     //   243: sipush #24576
/*     */     //   246: iand
/*     */     //   247: ifne -> 276
/*     */     //   250: iload #9
/*     */     //   252: aload #6
/*     */     //   254: aload #4
/*     */     //   256: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   261: ifeq -> 270
/*     */     //   264: sipush #16384
/*     */     //   267: goto -> 273
/*     */     //   270: sipush #8192
/*     */     //   273: ior
/*     */     //   274: istore #9
/*     */     //   276: iload #8
/*     */     //   278: bipush #32
/*     */     //   280: iand
/*     */     //   281: ifeq -> 294
/*     */     //   284: iload #9
/*     */     //   286: ldc 196608
/*     */     //   288: ior
/*     */     //   289: istore #9
/*     */     //   291: goto -> 326
/*     */     //   294: iload #7
/*     */     //   296: ldc 196608
/*     */     //   298: iand
/*     */     //   299: ifne -> 326
/*     */     //   302: iload #9
/*     */     //   304: aload #6
/*     */     //   306: aload #5
/*     */     //   308: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   313: ifeq -> 321
/*     */     //   316: ldc 131072
/*     */     //   318: goto -> 323
/*     */     //   321: ldc 65536
/*     */     //   323: ior
/*     */     //   324: istore #9
/*     */     //   326: iload #9
/*     */     //   328: ldc 74899
/*     */     //   330: iand
/*     */     //   331: ldc 74898
/*     */     //   333: if_icmpne -> 346
/*     */     //   336: aload #6
/*     */     //   338: invokeinterface getSkipping : ()Z
/*     */     //   343: ifne -> 624
/*     */     //   346: aload #6
/*     */     //   348: invokeinterface startDefaults : ()V
/*     */     //   353: iload #7
/*     */     //   355: iconst_1
/*     */     //   356: iand
/*     */     //   357: ifeq -> 370
/*     */     //   360: aload #6
/*     */     //   362: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   367: ifeq -> 438
/*     */     //   370: iload #8
/*     */     //   372: iconst_4
/*     */     //   373: iand
/*     */     //   374: ifeq -> 384
/*     */     //   377: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   380: checkcast androidx/compose/ui/Modifier
/*     */     //   383: astore_2
/*     */     //   384: iload #8
/*     */     //   386: bipush #8
/*     */     //   388: iand
/*     */     //   389: ifeq -> 411
/*     */     //   392: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   395: aload #6
/*     */     //   397: bipush #6
/*     */     //   399: invokestatic getPopupContainerStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/PopupContainerStyle;
/*     */     //   402: astore_3
/*     */     //   403: iload #9
/*     */     //   405: sipush #-7169
/*     */     //   408: iand
/*     */     //   409: istore #9
/*     */     //   411: iload #8
/*     */     //   413: bipush #16
/*     */     //   415: iand
/*     */     //   416: ifeq -> 461
/*     */     //   419: new androidx/compose/ui/window/PopupProperties
/*     */     //   422: dup
/*     */     //   423: iconst_1
/*     */     //   424: iconst_0
/*     */     //   425: iconst_0
/*     */     //   426: iconst_0
/*     */     //   427: bipush #14
/*     */     //   429: aconst_null
/*     */     //   430: invokespecial <init> : (ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   433: astore #4
/*     */     //   435: goto -> 461
/*     */     //   438: aload #6
/*     */     //   440: invokeinterface skipToGroupEnd : ()V
/*     */     //   445: iload #8
/*     */     //   447: bipush #8
/*     */     //   449: iand
/*     */     //   450: ifeq -> 461
/*     */     //   453: iload #9
/*     */     //   455: sipush #-7169
/*     */     //   458: iand
/*     */     //   459: istore #9
/*     */     //   461: aload #6
/*     */     //   463: invokeinterface endDefaults : ()V
/*     */     //   468: invokestatic isTraceInProgress : ()Z
/*     */     //   471: ifeq -> 484
/*     */     //   474: ldc 1397635557
/*     */     //   476: iload #9
/*     */     //   478: iconst_m1
/*     */     //   479: ldc 'org.jetbrains.jewel.ui.component.PopupContainer (PopupContainer.kt:27)'
/*     */     //   481: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   484: new org/jetbrains/jewel/ui/component/AnchorVerticalMenuPositionProvider
/*     */     //   487: dup
/*     */     //   488: aload_3
/*     */     //   489: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/PopupContainerMetrics;
/*     */     //   492: invokevirtual getOffset-RKDOV3M : ()J
/*     */     //   495: aload_3
/*     */     //   496: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/PopupContainerMetrics;
/*     */     //   499: invokevirtual getMenuMargin : ()Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   502: aload_1
/*     */     //   503: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   506: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   509: astore #11
/*     */     //   511: iconst_0
/*     */     //   512: istore #12
/*     */     //   514: iconst_0
/*     */     //   515: istore #13
/*     */     //   517: aload #6
/*     */     //   519: ldc 2023513938
/*     */     //   521: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   523: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   526: aload #6
/*     */     //   528: aload #11
/*     */     //   530: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   535: astore #14
/*     */     //   537: aload #6
/*     */     //   539: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   542: aload #14
/*     */     //   544: checkcast androidx/compose/ui/unit/Density
/*     */     //   547: aconst_null
/*     */     //   548: invokespecial <init> : (JLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   551: astore #10
/*     */     //   553: aload #10
/*     */     //   555: checkcast androidx/compose/ui/window/PopupPositionProvider
/*     */     //   558: aload_0
/*     */     //   559: aload #4
/*     */     //   561: ldc -1612162301
/*     */     //   563: iconst_1
/*     */     //   564: new org/jetbrains/jewel/ui/component/PopupContainerKt$PopupContainer$1
/*     */     //   567: dup
/*     */     //   568: aload_3
/*     */     //   569: aload_2
/*     */     //   570: aload #5
/*     */     //   572: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/PopupContainerStyle;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)V
/*     */     //   575: aload #6
/*     */     //   577: bipush #54
/*     */     //   579: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   582: checkcast kotlin/jvm/functions/Function2
/*     */     //   585: aload #6
/*     */     //   587: sipush #3072
/*     */     //   590: bipush #112
/*     */     //   592: iload #9
/*     */     //   594: iconst_3
/*     */     //   595: ishl
/*     */     //   596: iand
/*     */     //   597: ior
/*     */     //   598: sipush #896
/*     */     //   601: iload #9
/*     */     //   603: bipush #6
/*     */     //   605: ishr
/*     */     //   606: iand
/*     */     //   607: ior
/*     */     //   608: iconst_0
/*     */     //   609: invokestatic Popup : (Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   612: invokestatic isTraceInProgress : ()Z
/*     */     //   615: ifeq -> 631
/*     */     //   618: invokestatic traceEventEnd : ()V
/*     */     //   621: goto -> 631
/*     */     //   624: aload #6
/*     */     //   626: invokeinterface skipToGroupEnd : ()V
/*     */     //   631: aload #6
/*     */     //   633: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   638: dup
/*     */     //   639: ifnull -> 667
/*     */     //   642: aload_0
/*     */     //   643: aload_1
/*     */     //   644: aload_2
/*     */     //   645: aload_3
/*     */     //   646: aload #4
/*     */     //   648: aload #5
/*     */     //   650: iload #7
/*     */     //   652: iload #8
/*     */     //   654: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/PopupContainerStyle;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*     */     //   659: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   664: goto -> 668
/*     */     //   667: pop
/*     */     //   668: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #28	-> 19
/*     */     //   #24	-> 377
/*     */     //   #25	-> 392
/*     */     //   #26	-> 419
/*     */     //   #28	-> 481
/*     */     //   #30	-> 484
/*     */     //   #31	-> 488
/*     */     //   #32	-> 495
/*     */     //   #33	-> 502
/*     */     //   #34	-> 503
/*     */     //   #63	-> 523
/*     */     //   #30	-> 548
/*     */     //   #29	-> 551
/*     */     //   #37	-> 553
/*     */     //   #38	-> 558
/*     */     //   #39	-> 559
/*     */     //   #40	-> 561
/*     */     //   #36	-> 609
/*     */     //   #61	-> 624
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   517	27	13	$i$f$getCurrent	I
/*     */     //   514	30	11	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   514	30	12	$changed$iv	I
/*     */     //   553	68	10	popupPositionProvider	Lorg/jetbrains/jewel/ui/component/AnchorVerticalMenuPositionProvider;
/*     */     //   34	635	9	$dirty	I
/*     */     //   0	669	0	onDismissRequest	Lkotlin/jvm/functions/Function0;
/*     */     //   0	669	1	horizontalAlignment	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   0	669	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	669	3	style	Lorg/jetbrains/jewel/ui/component/styling/PopupContainerStyle;
/*     */     //   0	669	4	popupProperties	Landroidx/compose/ui/window/PopupProperties;
/*     */     //   0	669	5	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	669	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	669	7	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit PopupContainer$lambda$0(Function0<Unit> $onDismissRequest, Alignment.Horizontal $horizontalAlignment, Modifier $modifier, PopupContainerStyle $style, PopupProperties $popupProperties, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     PopupContainer($onDismissRequest, $horizontalAlignment, $modifier, $style, $popupProperties, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class PopupContainerKt$PopupContainer$1 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*  41 */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1612162301, $changed, -1, "org.jetbrains.jewel.ui.component.PopupContainer.<anonymous> (PopupContainer.kt:40)");  JewelThemeKt.OverrideDarkMode(this.$style.isDark(), (Function2)ComposableLambdaKt.rememberComposableLambda(850389104, true, new Function2<Composer, Integer, Unit>(this.$style, this.$modifier, this.$content) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*  42 */                 public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(850389104, $changed, -1, "org.jetbrains.jewel.ui.component.PopupContainer.<anonymous>.<anonymous> (PopupContainer.kt:41)");  PopupContainerColors colors = this.$style.getColors();
/*  43 */                     RoundedCornerShape popupShape = RoundedCornerShapeKt.RoundedCornerShape(this.$style.getMetrics().getCornerSize());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     
/*  55 */                     Modifier modifier1 = BackgroundKt.background-bw27NRU(BorderKt.border-QWjY48E$default(ShadowKt.shadow-s4CzXII$default(this.$modifier, this.$style.getMetrics().getShadowSize-D9Ej5fM(), (Shape)popupShape, false, colors.getShadow-0d7_KjU(), colors.getShadow-0d7_KjU(), 4, null), Stroke.Alignment.Inside, this.$style.getMetrics().getBorderWidth-D9Ej5fM(), colors.getBorder-0d7_KjU(), (Shape)popupShape, 0.0F, 16, null), colors.getBackground-0d7_KjU(), (Shape)popupShape);
/*     */ 
/*     */                     
/*     */                     Function2<Composer, Integer, Unit> function2 = this.$content;
/*     */ 
/*     */                     
/*     */                     int $changed$iv = 0, $i$f$Box = 0;
/*     */                     
/*  63 */                     ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/*  64 */                     Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/*  65 */                     boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */                     
/*  68 */                     MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*  69 */                     int $i$f$Layout = 0;
/*  70 */                     ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*  71 */                     int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*  72 */                     CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*  73 */                     Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */                     
/*  75 */                     Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/*  76 */                     ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*  77 */                     if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/*  78 */                       .startReusableNode();
/*  79 */                     if ($composer.getInserting()) { $composer
/*  80 */                         .createNode(function0); } else { $composer
/*     */                         
/*  82 */                         .useNode(); }
/*     */                     
/*  84 */                     Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/*  85 */                     Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/*  86 */                     Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */                     
/*  88 */                     Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/*  89 */                     Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/*  90 */                     if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/*  91 */                       $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/*  92 */                       $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */                     } 
/*     */                     
/*  95 */                     Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */                     
/*  97 */                     int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/*  98 */                     ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-PopupContainerKt$PopupContainer$1$1$1 = 0; function2.invoke(composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/*  99 */                     $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 100 */                     ComposerKt.sourceInformationMarkerEnd($composer);
/* 101 */                     ComposerKt.sourceInformationMarkerEnd($composer);
/* 102 */                     if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */                   else
/*     */                   { $composer.skipToGroupEnd(); }
/*     */                    }
/*     */                  }
/*     */               $composer, 54), $composer, 48);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd();  }
/*     */       else
/*     */       { $composer.skipToGroupEnd(); }
/*     */     
/*     */     }
/*     */     
/*     */     PopupContainerKt$PopupContainer$1(PopupContainerStyle $style, Modifier $modifier, Function2<Composer, Integer, Unit> $content) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\PopupContainerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */