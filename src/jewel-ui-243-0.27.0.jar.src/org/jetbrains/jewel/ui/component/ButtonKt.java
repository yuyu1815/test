/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.RowKt;
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.foundation.layout.RowScopeInstance;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import androidx.compose.ui.unit.DpSize;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.ButtonStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000P\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\032k\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0010\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\r2\034\020\016\032\030\022\004\022\0020\020\022\004\022\0020\0010\017¢\006\002\b\021¢\006\002\b\022H\007¢\006\002\020\023\032k\020\024\032\0020\0012\f\020\002\032\b\022\004\022\0020\0010\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\r2\034\020\016\032\030\022\004\022\0020\020\022\004\022\0020\0010\017¢\006\002\b\021¢\006\002\b\022H\007¢\006\002\020\023\032a\020\025\032\0020\0012\f\020\002\032\b\022\004\022\0020\0010\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\034\020\016\032\030\022\004\022\0020\020\022\004\022\0020\0010\017¢\006\002\b\021¢\006\002\b\022H\003¢\006\002\020\026¨\006\027²\006\n\020\030\032\0020\031X\002²\006\n\020\032\032\0020\033X\002²\006\n\020\034\032\0020\035X\002"}, d2 = {"DefaultButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "style", "Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedButton", "ButtonImpl", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "ui", "buttonState", "Lorg/jetbrains/jewel/ui/component/ButtonState;", "borderColor", "Landroidx/compose/ui/graphics/Brush;", "contentColor", "Landroidx/compose/ui/graphics/Color;"})
/*     */ @SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\norg/jetbrains/jewel/ui/component/ButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,204:1\n1225#2,6:205\n1225#2,6:211\n1225#2,6:217\n1225#2,6:223\n1225#2,6:229\n71#3:235\n68#3,6:236\n74#3:270\n78#3:278\n79#4,6:242\n86#4,4:257\n90#4,2:267\n94#4:277\n368#5,9:248\n377#5:269\n378#5,2:275\n4034#6,6:261\n708#7:271\n696#7:272\n708#7:273\n696#7:274\n81#8:279\n107#8,2:280\n81#8:282\n81#8:283\n*S KotlinDebug\n*F\n+ 1 Button.kt\norg/jetbrains/jewel/ui/component/ButtonKt\n*L\n50#1:205,6\n71#1:211,6\n97#1:217,6\n99#1:223,6\n101#1:229,6\n120#1:235\n120#1:236,6\n120#1:270\n120#1:278\n120#1:242,6\n120#1:257,4\n120#1:267,2\n120#1:277\n120#1:248,9\n120#1:269\n120#1:275,2\n120#1:261,6\n143#1:271\n143#1:272\n144#1:273\n144#1:274\n97#1:279\n97#1:280,2\n118#1:282\n140#1:283\n*E\n"})
/*     */ public final class ButtonKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void DefaultButton(@NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, @Nullable MutableInteractionSource interactionSource, @Nullable ButtonStyle style, @Nullable TextStyle textStyle, @NotNull Function3 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'onClick'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #6
/*     */     //   8: ldc 'content'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #7
/*     */     //   15: ldc 502826524
/*     */     //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   22: astore #7
/*     */     //   24: iload #8
/*     */     //   26: istore #10
/*     */     //   28: iload #9
/*     */     //   30: iconst_1
/*     */     //   31: iand
/*     */     //   32: ifeq -> 45
/*     */     //   35: iload #10
/*     */     //   37: bipush #6
/*     */     //   39: ior
/*     */     //   40: istore #10
/*     */     //   42: goto -> 74
/*     */     //   45: iload #8
/*     */     //   47: bipush #6
/*     */     //   49: iand
/*     */     //   50: ifne -> 74
/*     */     //   53: iload #10
/*     */     //   55: aload #7
/*     */     //   57: aload_0
/*     */     //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 70
/*     */     //   66: iconst_4
/*     */     //   67: goto -> 71
/*     */     //   70: iconst_2
/*     */     //   71: ior
/*     */     //   72: istore #10
/*     */     //   74: iload #9
/*     */     //   76: iconst_2
/*     */     //   77: iand
/*     */     //   78: ifeq -> 91
/*     */     //   81: iload #10
/*     */     //   83: bipush #48
/*     */     //   85: ior
/*     */     //   86: istore #10
/*     */     //   88: goto -> 122
/*     */     //   91: iload #8
/*     */     //   93: bipush #48
/*     */     //   95: iand
/*     */     //   96: ifne -> 122
/*     */     //   99: iload #10
/*     */     //   101: aload #7
/*     */     //   103: aload_1
/*     */     //   104: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   109: ifeq -> 117
/*     */     //   112: bipush #32
/*     */     //   114: goto -> 119
/*     */     //   117: bipush #16
/*     */     //   119: ior
/*     */     //   120: istore #10
/*     */     //   122: iload #9
/*     */     //   124: iconst_4
/*     */     //   125: iand
/*     */     //   126: ifeq -> 140
/*     */     //   129: iload #10
/*     */     //   131: sipush #384
/*     */     //   134: ior
/*     */     //   135: istore #10
/*     */     //   137: goto -> 174
/*     */     //   140: iload #8
/*     */     //   142: sipush #384
/*     */     //   145: iand
/*     */     //   146: ifne -> 174
/*     */     //   149: iload #10
/*     */     //   151: aload #7
/*     */     //   153: iload_2
/*     */     //   154: invokeinterface changed : (Z)Z
/*     */     //   159: ifeq -> 168
/*     */     //   162: sipush #256
/*     */     //   165: goto -> 171
/*     */     //   168: sipush #128
/*     */     //   171: ior
/*     */     //   172: istore #10
/*     */     //   174: iload #9
/*     */     //   176: bipush #8
/*     */     //   178: iand
/*     */     //   179: ifeq -> 193
/*     */     //   182: iload #10
/*     */     //   184: sipush #3072
/*     */     //   187: ior
/*     */     //   188: istore #10
/*     */     //   190: goto -> 227
/*     */     //   193: iload #8
/*     */     //   195: sipush #3072
/*     */     //   198: iand
/*     */     //   199: ifne -> 227
/*     */     //   202: iload #10
/*     */     //   204: aload #7
/*     */     //   206: aload_3
/*     */     //   207: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   212: ifeq -> 221
/*     */     //   215: sipush #2048
/*     */     //   218: goto -> 224
/*     */     //   221: sipush #1024
/*     */     //   224: ior
/*     */     //   225: istore #10
/*     */     //   227: iload #8
/*     */     //   229: sipush #24576
/*     */     //   232: iand
/*     */     //   233: ifne -> 270
/*     */     //   236: iload #10
/*     */     //   238: iload #9
/*     */     //   240: bipush #16
/*     */     //   242: iand
/*     */     //   243: ifne -> 264
/*     */     //   246: aload #7
/*     */     //   248: aload #4
/*     */     //   250: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   255: ifeq -> 264
/*     */     //   258: sipush #16384
/*     */     //   261: goto -> 267
/*     */     //   264: sipush #8192
/*     */     //   267: ior
/*     */     //   268: istore #10
/*     */     //   270: iload #8
/*     */     //   272: ldc 196608
/*     */     //   274: iand
/*     */     //   275: ifne -> 310
/*     */     //   278: iload #10
/*     */     //   280: iload #9
/*     */     //   282: bipush #32
/*     */     //   284: iand
/*     */     //   285: ifne -> 305
/*     */     //   288: aload #7
/*     */     //   290: aload #5
/*     */     //   292: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   297: ifeq -> 305
/*     */     //   300: ldc 131072
/*     */     //   302: goto -> 307
/*     */     //   305: ldc 65536
/*     */     //   307: ior
/*     */     //   308: istore #10
/*     */     //   310: iload #9
/*     */     //   312: bipush #64
/*     */     //   314: iand
/*     */     //   315: ifeq -> 328
/*     */     //   318: iload #10
/*     */     //   320: ldc 1572864
/*     */     //   322: ior
/*     */     //   323: istore #10
/*     */     //   325: goto -> 360
/*     */     //   328: iload #8
/*     */     //   330: ldc 1572864
/*     */     //   332: iand
/*     */     //   333: ifne -> 360
/*     */     //   336: iload #10
/*     */     //   338: aload #7
/*     */     //   340: aload #6
/*     */     //   342: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   347: ifeq -> 355
/*     */     //   350: ldc 1048576
/*     */     //   352: goto -> 357
/*     */     //   355: ldc 524288
/*     */     //   357: ior
/*     */     //   358: istore #10
/*     */     //   360: iload #10
/*     */     //   362: ldc 599187
/*     */     //   364: iand
/*     */     //   365: ldc 599186
/*     */     //   367: if_icmpne -> 380
/*     */     //   370: aload #7
/*     */     //   372: invokeinterface getSkipping : ()Z
/*     */     //   377: ifne -> 706
/*     */     //   380: aload #7
/*     */     //   382: invokeinterface startDefaults : ()V
/*     */     //   387: iload #8
/*     */     //   389: iconst_1
/*     */     //   390: iand
/*     */     //   391: ifeq -> 404
/*     */     //   394: aload #7
/*     */     //   396: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   401: ifeq -> 576
/*     */     //   404: iload #9
/*     */     //   406: iconst_2
/*     */     //   407: iand
/*     */     //   408: ifeq -> 418
/*     */     //   411: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   414: checkcast androidx/compose/ui/Modifier
/*     */     //   417: astore_1
/*     */     //   418: iload #9
/*     */     //   420: iconst_4
/*     */     //   421: iand
/*     */     //   422: ifeq -> 427
/*     */     //   425: iconst_1
/*     */     //   426: istore_2
/*     */     //   427: iload #9
/*     */     //   429: bipush #8
/*     */     //   431: iand
/*     */     //   432: ifeq -> 519
/*     */     //   435: aload #7
/*     */     //   437: ldc -1068866212
/*     */     //   439: invokeinterface startReplaceGroup : (I)V
/*     */     //   444: aload #7
/*     */     //   446: astore #12
/*     */     //   448: iconst_0
/*     */     //   449: istore #13
/*     */     //   451: iconst_0
/*     */     //   452: istore #14
/*     */     //   454: aload #12
/*     */     //   456: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   461: astore #15
/*     */     //   463: iconst_0
/*     */     //   464: istore #16
/*     */     //   466: aload #15
/*     */     //   468: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   471: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   474: if_acmpne -> 499
/*     */     //   477: iconst_0
/*     */     //   478: istore #17
/*     */     //   480: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   483: astore #17
/*     */     //   485: aload #12
/*     */     //   487: aload #17
/*     */     //   489: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   494: aload #17
/*     */     //   496: goto -> 501
/*     */     //   499: aload #15
/*     */     //   501: nop
/*     */     //   502: nop
/*     */     //   503: nop
/*     */     //   504: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   507: astore #11
/*     */     //   509: aload #7
/*     */     //   511: invokeinterface endReplaceGroup : ()V
/*     */     //   516: aload #11
/*     */     //   518: astore_3
/*     */     //   519: iload #9
/*     */     //   521: bipush #16
/*     */     //   523: iand
/*     */     //   524: ifeq -> 546
/*     */     //   527: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   530: aload #7
/*     */     //   532: bipush #6
/*     */     //   534: invokestatic getDefaultButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;
/*     */     //   537: astore #4
/*     */     //   539: iload #10
/*     */     //   541: ldc -57345
/*     */     //   543: iand
/*     */     //   544: istore #10
/*     */     //   546: iload #9
/*     */     //   548: bipush #32
/*     */     //   550: iand
/*     */     //   551: ifeq -> 613
/*     */     //   554: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   557: aload #7
/*     */     //   559: bipush #6
/*     */     //   561: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*     */     //   564: astore #5
/*     */     //   566: iload #10
/*     */     //   568: ldc -458753
/*     */     //   570: iand
/*     */     //   571: istore #10
/*     */     //   573: goto -> 613
/*     */     //   576: aload #7
/*     */     //   578: invokeinterface skipToGroupEnd : ()V
/*     */     //   583: iload #9
/*     */     //   585: bipush #16
/*     */     //   587: iand
/*     */     //   588: ifeq -> 598
/*     */     //   591: iload #10
/*     */     //   593: ldc -57345
/*     */     //   595: iand
/*     */     //   596: istore #10
/*     */     //   598: iload #9
/*     */     //   600: bipush #32
/*     */     //   602: iand
/*     */     //   603: ifeq -> 613
/*     */     //   606: iload #10
/*     */     //   608: ldc -458753
/*     */     //   610: iand
/*     */     //   611: istore #10
/*     */     //   613: aload #7
/*     */     //   615: invokeinterface endDefaults : ()V
/*     */     //   620: invokestatic isTraceInProgress : ()Z
/*     */     //   623: ifeq -> 636
/*     */     //   626: ldc 502826524
/*     */     //   628: iload #10
/*     */     //   630: iconst_m1
/*     */     //   631: ldc 'org.jetbrains.jewel.ui.component.DefaultButton (Button.kt:53)'
/*     */     //   633: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   636: aload_0
/*     */     //   637: aload_1
/*     */     //   638: iload_2
/*     */     //   639: aload_3
/*     */     //   640: aload #4
/*     */     //   642: aload #5
/*     */     //   644: aload #6
/*     */     //   646: aload #7
/*     */     //   648: bipush #14
/*     */     //   650: iload #10
/*     */     //   652: iand
/*     */     //   653: bipush #112
/*     */     //   655: iload #10
/*     */     //   657: iand
/*     */     //   658: ior
/*     */     //   659: sipush #896
/*     */     //   662: iload #10
/*     */     //   664: iand
/*     */     //   665: ior
/*     */     //   666: sipush #7168
/*     */     //   669: iload #10
/*     */     //   671: iand
/*     */     //   672: ior
/*     */     //   673: ldc 57344
/*     */     //   675: iload #10
/*     */     //   677: iand
/*     */     //   678: ior
/*     */     //   679: ldc 458752
/*     */     //   681: iload #10
/*     */     //   683: iand
/*     */     //   684: ior
/*     */     //   685: ldc 3670016
/*     */     //   687: iload #10
/*     */     //   689: iand
/*     */     //   690: ior
/*     */     //   691: invokestatic ButtonImpl : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
/*     */     //   694: invokestatic isTraceInProgress : ()Z
/*     */     //   697: ifeq -> 713
/*     */     //   700: invokestatic traceEventEnd : ()V
/*     */     //   703: goto -> 713
/*     */     //   706: aload #7
/*     */     //   708: invokeinterface skipToGroupEnd : ()V
/*     */     //   713: aload #7
/*     */     //   715: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   720: dup
/*     */     //   721: ifnull -> 751
/*     */     //   724: aload_0
/*     */     //   725: aload_1
/*     */     //   726: iload_2
/*     */     //   727: aload_3
/*     */     //   728: aload #4
/*     */     //   730: aload #5
/*     */     //   732: aload #6
/*     */     //   734: iload #8
/*     */     //   736: iload #9
/*     */     //   738: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function3;II)Lkotlin/jvm/functions/Function2;
/*     */     //   743: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   748: goto -> 752
/*     */     //   751: pop
/*     */     //   752: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #54	-> 13
/*     */     //   #48	-> 411
/*     */     //   #49	-> 425
/*     */     //   #50	-> 435
/*     */     //   #205	-> 454
/*     */     //   #206	-> 466
/*     */     //   #207	-> 477
/*     */     //   #50	-> 480
/*     */     //   #207	-> 483
/*     */     //   #208	-> 485
/*     */     //   #209	-> 494
/*     */     //   #210	-> 499
/*     */     //   #206	-> 501
/*     */     //   #205	-> 502
/*     */     //   #205	-> 503
/*     */     //   #50	-> 504
/*     */     //   #51	-> 527
/*     */     //   #52	-> 554
/*     */     //   #54	-> 633
/*     */     //   #56	-> 636
/*     */     //   #57	-> 637
/*     */     //   #58	-> 638
/*     */     //   #59	-> 639
/*     */     //   #60	-> 640
/*     */     //   #61	-> 642
/*     */     //   #62	-> 644
/*     */     //   #55	-> 691
/*     */     //   #64	-> 706
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   480	3	17	$i$a$-cache-ButtonKt$DefaultButton$1	I
/*     */     //   485	11	17	value$iv	Ljava/lang/Object;
/*     */     //   466	36	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   463	39	15	it$iv	Ljava/lang/Object;
/*     */     //   454	50	14	$i$f$cache	I
/*     */     //   451	53	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   451	53	13	invalid$iv	Z
/*     */     //   28	725	10	$dirty	I
/*     */     //   0	753	0	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	753	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	753	2	enabled	Z
/*     */     //   0	753	3	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	753	4	style	Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;
/*     */     //   0	753	5	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	753	6	content	Lkotlin/jvm/functions/Function3;
/*     */     //   0	753	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	753	8	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void OutlinedButton(@NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, @Nullable MutableInteractionSource interactionSource, @Nullable ButtonStyle style, @Nullable TextStyle textStyle, @NotNull Function3 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'onClick'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #6
/*     */     //   8: ldc 'content'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #7
/*     */     //   15: ldc 390246911
/*     */     //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   22: astore #7
/*     */     //   24: iload #8
/*     */     //   26: istore #10
/*     */     //   28: iload #9
/*     */     //   30: iconst_1
/*     */     //   31: iand
/*     */     //   32: ifeq -> 45
/*     */     //   35: iload #10
/*     */     //   37: bipush #6
/*     */     //   39: ior
/*     */     //   40: istore #10
/*     */     //   42: goto -> 74
/*     */     //   45: iload #8
/*     */     //   47: bipush #6
/*     */     //   49: iand
/*     */     //   50: ifne -> 74
/*     */     //   53: iload #10
/*     */     //   55: aload #7
/*     */     //   57: aload_0
/*     */     //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 70
/*     */     //   66: iconst_4
/*     */     //   67: goto -> 71
/*     */     //   70: iconst_2
/*     */     //   71: ior
/*     */     //   72: istore #10
/*     */     //   74: iload #9
/*     */     //   76: iconst_2
/*     */     //   77: iand
/*     */     //   78: ifeq -> 91
/*     */     //   81: iload #10
/*     */     //   83: bipush #48
/*     */     //   85: ior
/*     */     //   86: istore #10
/*     */     //   88: goto -> 122
/*     */     //   91: iload #8
/*     */     //   93: bipush #48
/*     */     //   95: iand
/*     */     //   96: ifne -> 122
/*     */     //   99: iload #10
/*     */     //   101: aload #7
/*     */     //   103: aload_1
/*     */     //   104: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   109: ifeq -> 117
/*     */     //   112: bipush #32
/*     */     //   114: goto -> 119
/*     */     //   117: bipush #16
/*     */     //   119: ior
/*     */     //   120: istore #10
/*     */     //   122: iload #9
/*     */     //   124: iconst_4
/*     */     //   125: iand
/*     */     //   126: ifeq -> 140
/*     */     //   129: iload #10
/*     */     //   131: sipush #384
/*     */     //   134: ior
/*     */     //   135: istore #10
/*     */     //   137: goto -> 174
/*     */     //   140: iload #8
/*     */     //   142: sipush #384
/*     */     //   145: iand
/*     */     //   146: ifne -> 174
/*     */     //   149: iload #10
/*     */     //   151: aload #7
/*     */     //   153: iload_2
/*     */     //   154: invokeinterface changed : (Z)Z
/*     */     //   159: ifeq -> 168
/*     */     //   162: sipush #256
/*     */     //   165: goto -> 171
/*     */     //   168: sipush #128
/*     */     //   171: ior
/*     */     //   172: istore #10
/*     */     //   174: iload #9
/*     */     //   176: bipush #8
/*     */     //   178: iand
/*     */     //   179: ifeq -> 193
/*     */     //   182: iload #10
/*     */     //   184: sipush #3072
/*     */     //   187: ior
/*     */     //   188: istore #10
/*     */     //   190: goto -> 227
/*     */     //   193: iload #8
/*     */     //   195: sipush #3072
/*     */     //   198: iand
/*     */     //   199: ifne -> 227
/*     */     //   202: iload #10
/*     */     //   204: aload #7
/*     */     //   206: aload_3
/*     */     //   207: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   212: ifeq -> 221
/*     */     //   215: sipush #2048
/*     */     //   218: goto -> 224
/*     */     //   221: sipush #1024
/*     */     //   224: ior
/*     */     //   225: istore #10
/*     */     //   227: iload #8
/*     */     //   229: sipush #24576
/*     */     //   232: iand
/*     */     //   233: ifne -> 270
/*     */     //   236: iload #10
/*     */     //   238: iload #9
/*     */     //   240: bipush #16
/*     */     //   242: iand
/*     */     //   243: ifne -> 264
/*     */     //   246: aload #7
/*     */     //   248: aload #4
/*     */     //   250: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   255: ifeq -> 264
/*     */     //   258: sipush #16384
/*     */     //   261: goto -> 267
/*     */     //   264: sipush #8192
/*     */     //   267: ior
/*     */     //   268: istore #10
/*     */     //   270: iload #8
/*     */     //   272: ldc 196608
/*     */     //   274: iand
/*     */     //   275: ifne -> 310
/*     */     //   278: iload #10
/*     */     //   280: iload #9
/*     */     //   282: bipush #32
/*     */     //   284: iand
/*     */     //   285: ifne -> 305
/*     */     //   288: aload #7
/*     */     //   290: aload #5
/*     */     //   292: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   297: ifeq -> 305
/*     */     //   300: ldc 131072
/*     */     //   302: goto -> 307
/*     */     //   305: ldc 65536
/*     */     //   307: ior
/*     */     //   308: istore #10
/*     */     //   310: iload #9
/*     */     //   312: bipush #64
/*     */     //   314: iand
/*     */     //   315: ifeq -> 328
/*     */     //   318: iload #10
/*     */     //   320: ldc 1572864
/*     */     //   322: ior
/*     */     //   323: istore #10
/*     */     //   325: goto -> 360
/*     */     //   328: iload #8
/*     */     //   330: ldc 1572864
/*     */     //   332: iand
/*     */     //   333: ifne -> 360
/*     */     //   336: iload #10
/*     */     //   338: aload #7
/*     */     //   340: aload #6
/*     */     //   342: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   347: ifeq -> 355
/*     */     //   350: ldc 1048576
/*     */     //   352: goto -> 357
/*     */     //   355: ldc 524288
/*     */     //   357: ior
/*     */     //   358: istore #10
/*     */     //   360: iload #10
/*     */     //   362: ldc 599187
/*     */     //   364: iand
/*     */     //   365: ldc 599186
/*     */     //   367: if_icmpne -> 380
/*     */     //   370: aload #7
/*     */     //   372: invokeinterface getSkipping : ()Z
/*     */     //   377: ifne -> 706
/*     */     //   380: aload #7
/*     */     //   382: invokeinterface startDefaults : ()V
/*     */     //   387: iload #8
/*     */     //   389: iconst_1
/*     */     //   390: iand
/*     */     //   391: ifeq -> 404
/*     */     //   394: aload #7
/*     */     //   396: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   401: ifeq -> 576
/*     */     //   404: iload #9
/*     */     //   406: iconst_2
/*     */     //   407: iand
/*     */     //   408: ifeq -> 418
/*     */     //   411: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   414: checkcast androidx/compose/ui/Modifier
/*     */     //   417: astore_1
/*     */     //   418: iload #9
/*     */     //   420: iconst_4
/*     */     //   421: iand
/*     */     //   422: ifeq -> 427
/*     */     //   425: iconst_1
/*     */     //   426: istore_2
/*     */     //   427: iload #9
/*     */     //   429: bipush #8
/*     */     //   431: iand
/*     */     //   432: ifeq -> 519
/*     */     //   435: aload #7
/*     */     //   437: ldc -483506983
/*     */     //   439: invokeinterface startReplaceGroup : (I)V
/*     */     //   444: aload #7
/*     */     //   446: astore #12
/*     */     //   448: iconst_0
/*     */     //   449: istore #13
/*     */     //   451: iconst_0
/*     */     //   452: istore #14
/*     */     //   454: aload #12
/*     */     //   456: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   461: astore #15
/*     */     //   463: iconst_0
/*     */     //   464: istore #16
/*     */     //   466: aload #15
/*     */     //   468: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   471: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   474: if_acmpne -> 499
/*     */     //   477: iconst_0
/*     */     //   478: istore #17
/*     */     //   480: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   483: astore #17
/*     */     //   485: aload #12
/*     */     //   487: aload #17
/*     */     //   489: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   494: aload #17
/*     */     //   496: goto -> 501
/*     */     //   499: aload #15
/*     */     //   501: nop
/*     */     //   502: nop
/*     */     //   503: nop
/*     */     //   504: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   507: astore #11
/*     */     //   509: aload #7
/*     */     //   511: invokeinterface endReplaceGroup : ()V
/*     */     //   516: aload #11
/*     */     //   518: astore_3
/*     */     //   519: iload #9
/*     */     //   521: bipush #16
/*     */     //   523: iand
/*     */     //   524: ifeq -> 546
/*     */     //   527: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   530: aload #7
/*     */     //   532: bipush #6
/*     */     //   534: invokestatic getOutlinedButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;
/*     */     //   537: astore #4
/*     */     //   539: iload #10
/*     */     //   541: ldc -57345
/*     */     //   543: iand
/*     */     //   544: istore #10
/*     */     //   546: iload #9
/*     */     //   548: bipush #32
/*     */     //   550: iand
/*     */     //   551: ifeq -> 613
/*     */     //   554: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   557: aload #7
/*     */     //   559: bipush #6
/*     */     //   561: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*     */     //   564: astore #5
/*     */     //   566: iload #10
/*     */     //   568: ldc -458753
/*     */     //   570: iand
/*     */     //   571: istore #10
/*     */     //   573: goto -> 613
/*     */     //   576: aload #7
/*     */     //   578: invokeinterface skipToGroupEnd : ()V
/*     */     //   583: iload #9
/*     */     //   585: bipush #16
/*     */     //   587: iand
/*     */     //   588: ifeq -> 598
/*     */     //   591: iload #10
/*     */     //   593: ldc -57345
/*     */     //   595: iand
/*     */     //   596: istore #10
/*     */     //   598: iload #9
/*     */     //   600: bipush #32
/*     */     //   602: iand
/*     */     //   603: ifeq -> 613
/*     */     //   606: iload #10
/*     */     //   608: ldc -458753
/*     */     //   610: iand
/*     */     //   611: istore #10
/*     */     //   613: aload #7
/*     */     //   615: invokeinterface endDefaults : ()V
/*     */     //   620: invokestatic isTraceInProgress : ()Z
/*     */     //   623: ifeq -> 636
/*     */     //   626: ldc 390246911
/*     */     //   628: iload #10
/*     */     //   630: iconst_m1
/*     */     //   631: ldc 'org.jetbrains.jewel.ui.component.OutlinedButton (Button.kt:74)'
/*     */     //   633: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   636: aload_0
/*     */     //   637: aload_1
/*     */     //   638: iload_2
/*     */     //   639: aload_3
/*     */     //   640: aload #4
/*     */     //   642: aload #5
/*     */     //   644: aload #6
/*     */     //   646: aload #7
/*     */     //   648: bipush #14
/*     */     //   650: iload #10
/*     */     //   652: iand
/*     */     //   653: bipush #112
/*     */     //   655: iload #10
/*     */     //   657: iand
/*     */     //   658: ior
/*     */     //   659: sipush #896
/*     */     //   662: iload #10
/*     */     //   664: iand
/*     */     //   665: ior
/*     */     //   666: sipush #7168
/*     */     //   669: iload #10
/*     */     //   671: iand
/*     */     //   672: ior
/*     */     //   673: ldc 57344
/*     */     //   675: iload #10
/*     */     //   677: iand
/*     */     //   678: ior
/*     */     //   679: ldc 458752
/*     */     //   681: iload #10
/*     */     //   683: iand
/*     */     //   684: ior
/*     */     //   685: ldc 3670016
/*     */     //   687: iload #10
/*     */     //   689: iand
/*     */     //   690: ior
/*     */     //   691: invokestatic ButtonImpl : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
/*     */     //   694: invokestatic isTraceInProgress : ()Z
/*     */     //   697: ifeq -> 713
/*     */     //   700: invokestatic traceEventEnd : ()V
/*     */     //   703: goto -> 713
/*     */     //   706: aload #7
/*     */     //   708: invokeinterface skipToGroupEnd : ()V
/*     */     //   713: aload #7
/*     */     //   715: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   720: dup
/*     */     //   721: ifnull -> 751
/*     */     //   724: aload_0
/*     */     //   725: aload_1
/*     */     //   726: iload_2
/*     */     //   727: aload_3
/*     */     //   728: aload #4
/*     */     //   730: aload #5
/*     */     //   732: aload #6
/*     */     //   734: iload #8
/*     */     //   736: iload #9
/*     */     //   738: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function3;II)Lkotlin/jvm/functions/Function2;
/*     */     //   743: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   748: goto -> 752
/*     */     //   751: pop
/*     */     //   752: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #75	-> 13
/*     */     //   #69	-> 411
/*     */     //   #70	-> 425
/*     */     //   #71	-> 435
/*     */     //   #211	-> 454
/*     */     //   #212	-> 466
/*     */     //   #213	-> 477
/*     */     //   #71	-> 480
/*     */     //   #213	-> 483
/*     */     //   #214	-> 485
/*     */     //   #215	-> 494
/*     */     //   #216	-> 499
/*     */     //   #212	-> 501
/*     */     //   #211	-> 502
/*     */     //   #211	-> 503
/*     */     //   #71	-> 504
/*     */     //   #72	-> 527
/*     */     //   #73	-> 554
/*     */     //   #75	-> 633
/*     */     //   #77	-> 636
/*     */     //   #78	-> 637
/*     */     //   #79	-> 638
/*     */     //   #80	-> 639
/*     */     //   #81	-> 640
/*     */     //   #82	-> 642
/*     */     //   #83	-> 644
/*     */     //   #76	-> 691
/*     */     //   #85	-> 706
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   480	3	17	$i$a$-cache-ButtonKt$OutlinedButton$1	I
/*     */     //   485	11	17	value$iv	Ljava/lang/Object;
/*     */     //   466	36	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   463	39	15	it$iv	Ljava/lang/Object;
/*     */     //   454	50	14	$i$f$cache	I
/*     */     //   451	53	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   451	53	13	invalid$iv	Z
/*     */     //   28	725	10	$dirty	I
/*     */     //   0	753	0	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	753	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	753	2	enabled	Z
/*     */     //   0	753	3	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	753	4	style	Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;
/*     */     //   0	753	5	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	753	6	content	Lkotlin/jvm/functions/Function3;
/*     */     //   0	753	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	753	8	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   private static final void ButtonImpl(Function0 onClick, Modifier modifier, boolean enabled, MutableInteractionSource interactionSource, ButtonStyle style, TextStyle textStyle, Function3 content, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload #7
/*     */     //   2: ldc -347901183
/*     */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   9: astore #7
/*     */     //   11: iload #8
/*     */     //   13: istore #9
/*     */     //   15: iload #8
/*     */     //   17: bipush #6
/*     */     //   19: iand
/*     */     //   20: ifne -> 44
/*     */     //   23: iload #9
/*     */     //   25: aload #7
/*     */     //   27: aload_0
/*     */     //   28: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   33: ifeq -> 40
/*     */     //   36: iconst_4
/*     */     //   37: goto -> 41
/*     */     //   40: iconst_2
/*     */     //   41: ior
/*     */     //   42: istore #9
/*     */     //   44: iload #8
/*     */     //   46: bipush #48
/*     */     //   48: iand
/*     */     //   49: ifne -> 75
/*     */     //   52: iload #9
/*     */     //   54: aload #7
/*     */     //   56: aload_1
/*     */     //   57: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   62: ifeq -> 70
/*     */     //   65: bipush #32
/*     */     //   67: goto -> 72
/*     */     //   70: bipush #16
/*     */     //   72: ior
/*     */     //   73: istore #9
/*     */     //   75: iload #8
/*     */     //   77: sipush #384
/*     */     //   80: iand
/*     */     //   81: ifne -> 109
/*     */     //   84: iload #9
/*     */     //   86: aload #7
/*     */     //   88: iload_2
/*     */     //   89: invokeinterface changed : (Z)Z
/*     */     //   94: ifeq -> 103
/*     */     //   97: sipush #256
/*     */     //   100: goto -> 106
/*     */     //   103: sipush #128
/*     */     //   106: ior
/*     */     //   107: istore #9
/*     */     //   109: iload #8
/*     */     //   111: sipush #3072
/*     */     //   114: iand
/*     */     //   115: ifne -> 143
/*     */     //   118: iload #9
/*     */     //   120: aload #7
/*     */     //   122: aload_3
/*     */     //   123: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   128: ifeq -> 137
/*     */     //   131: sipush #2048
/*     */     //   134: goto -> 140
/*     */     //   137: sipush #1024
/*     */     //   140: ior
/*     */     //   141: istore #9
/*     */     //   143: iload #8
/*     */     //   145: sipush #24576
/*     */     //   148: iand
/*     */     //   149: ifne -> 178
/*     */     //   152: iload #9
/*     */     //   154: aload #7
/*     */     //   156: aload #4
/*     */     //   158: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   163: ifeq -> 172
/*     */     //   166: sipush #16384
/*     */     //   169: goto -> 175
/*     */     //   172: sipush #8192
/*     */     //   175: ior
/*     */     //   176: istore #9
/*     */     //   178: iload #8
/*     */     //   180: ldc 196608
/*     */     //   182: iand
/*     */     //   183: ifne -> 210
/*     */     //   186: iload #9
/*     */     //   188: aload #7
/*     */     //   190: aload #5
/*     */     //   192: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   197: ifeq -> 205
/*     */     //   200: ldc 131072
/*     */     //   202: goto -> 207
/*     */     //   205: ldc 65536
/*     */     //   207: ior
/*     */     //   208: istore #9
/*     */     //   210: iload #8
/*     */     //   212: ldc 1572864
/*     */     //   214: iand
/*     */     //   215: ifne -> 242
/*     */     //   218: iload #9
/*     */     //   220: aload #7
/*     */     //   222: aload #6
/*     */     //   224: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   229: ifeq -> 237
/*     */     //   232: ldc 1048576
/*     */     //   234: goto -> 239
/*     */     //   237: ldc 524288
/*     */     //   239: ior
/*     */     //   240: istore #9
/*     */     //   242: iload #9
/*     */     //   244: ldc 599187
/*     */     //   246: iand
/*     */     //   247: ldc 599186
/*     */     //   249: if_icmpne -> 262
/*     */     //   252: aload #7
/*     */     //   254: invokeinterface getSkipping : ()Z
/*     */     //   259: ifne -> 1474
/*     */     //   262: invokestatic isTraceInProgress : ()Z
/*     */     //   265: ifeq -> 278
/*     */     //   268: ldc -347901183
/*     */     //   270: iload #9
/*     */     //   272: iconst_m1
/*     */     //   273: ldc 'org.jetbrains.jewel.ui.component.ButtonImpl (Button.kt:95)'
/*     */     //   275: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   278: aload #7
/*     */     //   280: ldc 1443784929
/*     */     //   282: invokeinterface startReplaceGroup : (I)V
/*     */     //   287: aload #7
/*     */     //   289: astore #12
/*     */     //   291: iload #9
/*     */     //   293: sipush #7168
/*     */     //   296: iand
/*     */     //   297: sipush #2048
/*     */     //   300: if_icmpne -> 307
/*     */     //   303: iconst_1
/*     */     //   304: goto -> 308
/*     */     //   307: iconst_0
/*     */     //   308: istore #13
/*     */     //   310: nop
/*     */     //   311: iconst_0
/*     */     //   312: istore #14
/*     */     //   314: aload #12
/*     */     //   316: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   321: astore #15
/*     */     //   323: iconst_0
/*     */     //   324: istore #16
/*     */     //   326: iload #13
/*     */     //   328: ifne -> 342
/*     */     //   331: aload #15
/*     */     //   333: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   336: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   339: if_acmpne -> 384
/*     */     //   342: iconst_0
/*     */     //   343: istore #17
/*     */     //   345: getstatic org/jetbrains/jewel/ui/component/ButtonState.Companion : Lorg/jetbrains/jewel/ui/component/ButtonState$Companion;
/*     */     //   348: iload_2
/*     */     //   349: iconst_0
/*     */     //   350: iconst_0
/*     */     //   351: iconst_0
/*     */     //   352: iconst_0
/*     */     //   353: bipush #30
/*     */     //   355: aconst_null
/*     */     //   356: invokestatic of-oDpth28$default : (Lorg/jetbrains/jewel/ui/component/ButtonState$Companion;ZZZZZILjava/lang/Object;)J
/*     */     //   359: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/ButtonState;
/*     */     //   362: aconst_null
/*     */     //   363: iconst_2
/*     */     //   364: aconst_null
/*     */     //   365: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   368: astore #18
/*     */     //   370: aload #12
/*     */     //   372: aload #18
/*     */     //   374: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   379: aload #18
/*     */     //   381: goto -> 386
/*     */     //   384: aload #15
/*     */     //   386: nop
/*     */     //   387: nop
/*     */     //   388: nop
/*     */     //   389: checkcast androidx/compose/runtime/MutableState
/*     */     //   392: astore #11
/*     */     //   394: aload #7
/*     */     //   396: invokeinterface endReplaceGroup : ()V
/*     */     //   401: aload #11
/*     */     //   403: astore #10
/*     */     //   405: aload #7
/*     */     //   407: ldc 1443787703
/*     */     //   409: invokeinterface startReplaceGroup : (I)V
/*     */     //   414: aload #7
/*     */     //   416: astore #11
/*     */     //   418: iload #9
/*     */     //   420: sipush #896
/*     */     //   423: iand
/*     */     //   424: sipush #256
/*     */     //   427: if_icmpne -> 434
/*     */     //   430: iconst_1
/*     */     //   431: goto -> 435
/*     */     //   434: iconst_0
/*     */     //   435: istore #12
/*     */     //   437: nop
/*     */     //   438: iconst_0
/*     */     //   439: istore #13
/*     */     //   441: aload #11
/*     */     //   443: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   448: astore #14
/*     */     //   450: iconst_0
/*     */     //   451: istore #15
/*     */     //   453: iload #12
/*     */     //   455: ifne -> 469
/*     */     //   458: aload #14
/*     */     //   460: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   463: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   466: if_acmpne -> 511
/*     */     //   469: iconst_0
/*     */     //   470: istore #16
/*     */     //   472: aload #10
/*     */     //   474: aload #10
/*     */     //   476: invokestatic ButtonImpl$lambda$5 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   479: iload_2
/*     */     //   480: iconst_0
/*     */     //   481: iconst_0
/*     */     //   482: iconst_0
/*     */     //   483: iconst_0
/*     */     //   484: bipush #30
/*     */     //   486: aconst_null
/*     */     //   487: invokestatic copy-oDpth28$default : (JZZZZZILjava/lang/Object;)J
/*     */     //   490: invokestatic ButtonImpl$lambda$6 : (Landroidx/compose/runtime/MutableState;J)V
/*     */     //   493: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   496: astore #17
/*     */     //   498: aload #11
/*     */     //   500: aload #17
/*     */     //   502: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   507: nop
/*     */     //   508: goto -> 512
/*     */     //   511: nop
/*     */     //   512: nop
/*     */     //   513: nop
/*     */     //   514: nop
/*     */     //   515: aload #7
/*     */     //   517: invokeinterface endReplaceGroup : ()V
/*     */     //   522: aload_3
/*     */     //   523: aload #7
/*     */     //   525: ldc_w 1443791915
/*     */     //   528: invokeinterface startReplaceGroup : (I)V
/*     */     //   533: aload #7
/*     */     //   535: astore #12
/*     */     //   537: iload #9
/*     */     //   539: sipush #7168
/*     */     //   542: iand
/*     */     //   543: sipush #2048
/*     */     //   546: if_icmpne -> 553
/*     */     //   549: iconst_1
/*     */     //   550: goto -> 554
/*     */     //   553: iconst_0
/*     */     //   554: aload #7
/*     */     //   556: aload #10
/*     */     //   558: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   563: ior
/*     */     //   564: istore #13
/*     */     //   566: iconst_0
/*     */     //   567: istore #14
/*     */     //   569: aload #12
/*     */     //   571: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   576: astore #15
/*     */     //   578: iconst_0
/*     */     //   579: istore #16
/*     */     //   581: iload #13
/*     */     //   583: ifne -> 597
/*     */     //   586: aload #15
/*     */     //   588: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   591: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   594: if_acmpne -> 635
/*     */     //   597: astore #57
/*     */     //   599: iconst_0
/*     */     //   600: istore #17
/*     */     //   602: new org/jetbrains/jewel/ui/component/ButtonKt$ButtonImpl$2$1
/*     */     //   605: dup
/*     */     //   606: aload_3
/*     */     //   607: aload #10
/*     */     //   609: aconst_null
/*     */     //   610: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   613: checkcast kotlin/jvm/functions/Function2
/*     */     //   616: aload #57
/*     */     //   618: swap
/*     */     //   619: astore #18
/*     */     //   621: aload #12
/*     */     //   623: aload #18
/*     */     //   625: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   630: aload #18
/*     */     //   632: goto -> 637
/*     */     //   635: aload #15
/*     */     //   637: nop
/*     */     //   638: nop
/*     */     //   639: nop
/*     */     //   640: checkcast kotlin/jvm/functions/Function2
/*     */     //   643: astore #11
/*     */     //   645: aload #7
/*     */     //   647: invokeinterface endReplaceGroup : ()V
/*     */     //   652: aload #11
/*     */     //   654: aload #7
/*     */     //   656: bipush #14
/*     */     //   658: iload #9
/*     */     //   660: bipush #9
/*     */     //   662: ishr
/*     */     //   663: iand
/*     */     //   664: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   667: aload #4
/*     */     //   669: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ButtonMetrics;
/*     */     //   672: invokevirtual getCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   675: invokestatic RoundedCornerShape : (Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   678: astore #11
/*     */     //   680: aload #4
/*     */     //   682: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/ButtonColors;
/*     */     //   685: astore #12
/*     */     //   687: aload #12
/*     */     //   689: aload #10
/*     */     //   691: invokestatic ButtonImpl$lambda$5 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   694: aload #7
/*     */     //   696: iconst_0
/*     */     //   697: invokevirtual borderFor-Wlap9Qs : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   700: astore #13
/*     */     //   702: getstatic androidx/compose/ui/semantics/Role.Companion : Landroidx/compose/ui/semantics/Role$Companion;
/*     */     //   705: invokevirtual getButton-o7Vup1c : ()I
/*     */     //   708: istore #14
/*     */     //   710: aload_1
/*     */     //   711: aload_3
/*     */     //   712: aconst_null
/*     */     //   713: iload_2
/*     */     //   714: aconst_null
/*     */     //   715: iload #14
/*     */     //   717: invokestatic box-impl : (I)Landroidx/compose/ui/semantics/Role;
/*     */     //   720: aload_0
/*     */     //   721: bipush #8
/*     */     //   723: aconst_null
/*     */     //   724: invokestatic clickable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   727: aload #12
/*     */     //   729: aload #10
/*     */     //   731: invokestatic ButtonImpl$lambda$5 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   734: aload #7
/*     */     //   736: iconst_0
/*     */     //   737: invokevirtual backgroundFor-Wlap9Qs : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   740: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   745: checkcast androidx/compose/ui/graphics/Brush
/*     */     //   748: aload #11
/*     */     //   750: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   753: fconst_0
/*     */     //   754: iconst_4
/*     */     //   755: aconst_null
/*     */     //   756: invokestatic background$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   759: aload #10
/*     */     //   761: invokestatic ButtonImpl$lambda$5 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   764: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/ButtonState;
/*     */     //   767: aload #11
/*     */     //   769: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   772: aload #4
/*     */     //   774: invokevirtual getFocusOutlineAlignment : ()Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   777: fconst_0
/*     */     //   778: aload #4
/*     */     //   780: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ButtonMetrics;
/*     */     //   783: invokevirtual getFocusOutlineExpand-D9Ej5fM : ()F
/*     */     //   786: aload #7
/*     */     //   788: iconst_0
/*     */     //   789: bipush #8
/*     */     //   791: invokestatic focusOutline-AGcomas : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;Landroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
/*     */     //   794: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Inside : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   797: aload #4
/*     */     //   799: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ButtonMetrics;
/*     */     //   802: invokevirtual getBorderWidth-D9Ej5fM : ()F
/*     */     //   805: aload #13
/*     */     //   807: invokestatic ButtonImpl$lambda$9 : (Landroidx/compose/runtime/State;)Landroidx/compose/ui/graphics/Brush;
/*     */     //   810: aload #11
/*     */     //   812: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   815: fconst_0
/*     */     //   816: bipush #16
/*     */     //   818: aconst_null
/*     */     //   819: invokestatic border-AkepmR4$default : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   822: astore #14
/*     */     //   824: iconst_1
/*     */     //   825: istore #16
/*     */     //   827: sipush #384
/*     */     //   830: istore #17
/*     */     //   832: nop
/*     */     //   833: iconst_0
/*     */     //   834: istore #18
/*     */     //   836: aload #7
/*     */     //   838: ldc_w 733328855
/*     */     //   841: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   844: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   847: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   850: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   853: astore #15
/*     */     //   855: aload #15
/*     */     //   857: iload #16
/*     */     //   859: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   862: astore #19
/*     */     //   864: bipush #112
/*     */     //   866: iload #17
/*     */     //   868: iconst_3
/*     */     //   869: ishl
/*     */     //   870: iand
/*     */     //   871: istore #20
/*     */     //   873: nop
/*     */     //   874: iconst_0
/*     */     //   875: istore #21
/*     */     //   877: aload #7
/*     */     //   879: ldc_w -1323940314
/*     */     //   882: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   885: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   888: aload #7
/*     */     //   890: iconst_0
/*     */     //   891: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   894: istore #22
/*     */     //   896: aload #7
/*     */     //   898: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   903: astore #23
/*     */     //   905: aload #7
/*     */     //   907: aload #14
/*     */     //   909: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   912: astore #24
/*     */     //   914: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   917: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   920: astore #25
/*     */     //   922: bipush #6
/*     */     //   924: sipush #896
/*     */     //   927: iload #20
/*     */     //   929: bipush #6
/*     */     //   931: ishl
/*     */     //   932: iand
/*     */     //   933: ior
/*     */     //   934: istore #26
/*     */     //   936: nop
/*     */     //   937: iconst_0
/*     */     //   938: istore #27
/*     */     //   940: aload #7
/*     */     //   942: ldc_w -692256719
/*     */     //   945: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   948: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   951: aload #7
/*     */     //   953: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   958: instanceof androidx/compose/runtime/Applier
/*     */     //   961: ifne -> 967
/*     */     //   964: invokestatic invalidApplier : ()V
/*     */     //   967: aload #7
/*     */     //   969: invokeinterface startReusableNode : ()V
/*     */     //   974: aload #7
/*     */     //   976: invokeinterface getInserting : ()Z
/*     */     //   981: ifeq -> 996
/*     */     //   984: aload #7
/*     */     //   986: aload #25
/*     */     //   988: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   993: goto -> 1003
/*     */     //   996: aload #7
/*     */     //   998: invokeinterface useNode : ()V
/*     */     //   1003: aload #7
/*     */     //   1005: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1008: astore #28
/*     */     //   1010: iconst_0
/*     */     //   1011: istore #29
/*     */     //   1013: aload #28
/*     */     //   1015: aload #19
/*     */     //   1017: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1020: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1023: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1026: aload #28
/*     */     //   1028: aload #23
/*     */     //   1030: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1033: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1036: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1039: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1042: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1045: astore #30
/*     */     //   1047: iconst_0
/*     */     //   1048: istore #31
/*     */     //   1050: aload #28
/*     */     //   1052: astore #32
/*     */     //   1054: iconst_0
/*     */     //   1055: istore #33
/*     */     //   1057: aload #32
/*     */     //   1059: invokeinterface getInserting : ()Z
/*     */     //   1064: ifne -> 1085
/*     */     //   1067: aload #32
/*     */     //   1069: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1074: iload #22
/*     */     //   1076: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1079: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1082: ifne -> 1111
/*     */     //   1085: aload #32
/*     */     //   1087: iload #22
/*     */     //   1089: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1092: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1097: aload #28
/*     */     //   1099: iload #22
/*     */     //   1101: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1104: aload #30
/*     */     //   1106: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1111: nop
/*     */     //   1112: nop
/*     */     //   1113: nop
/*     */     //   1114: aload #28
/*     */     //   1116: aload #24
/*     */     //   1118: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1121: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1124: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1127: nop
/*     */     //   1128: nop
/*     */     //   1129: aload #7
/*     */     //   1131: bipush #14
/*     */     //   1133: iload #26
/*     */     //   1135: bipush #6
/*     */     //   1137: ishr
/*     */     //   1138: iand
/*     */     //   1139: istore #34
/*     */     //   1141: astore #35
/*     */     //   1143: iconst_0
/*     */     //   1144: istore #36
/*     */     //   1146: aload #35
/*     */     //   1148: ldc_w -2146769399
/*     */     //   1151: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1154: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1157: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1160: aload #35
/*     */     //   1162: bipush #6
/*     */     //   1164: bipush #112
/*     */     //   1166: iload #17
/*     */     //   1168: bipush #6
/*     */     //   1170: ishr
/*     */     //   1171: iand
/*     */     //   1172: ior
/*     */     //   1173: istore #37
/*     */     //   1175: astore #38
/*     */     //   1177: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1180: astore #39
/*     */     //   1182: iconst_0
/*     */     //   1183: istore #40
/*     */     //   1185: aload #12
/*     */     //   1187: aload #10
/*     */     //   1189: invokestatic ButtonImpl$lambda$5 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1192: aload #38
/*     */     //   1194: iconst_0
/*     */     //   1195: invokevirtual contentFor-Wlap9Qs : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1198: astore #41
/*     */     //   1200: iconst_2
/*     */     //   1201: anewarray androidx/compose/runtime/ProvidedValue
/*     */     //   1204: astore #42
/*     */     //   1206: aload #42
/*     */     //   1208: iconst_0
/*     */     //   1209: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1212: aload #41
/*     */     //   1214: invokestatic ButtonImpl$lambda$13$lambda$10 : (Landroidx/compose/runtime/State;)J
/*     */     //   1217: lstore #43
/*     */     //   1219: iconst_0
/*     */     //   1220: istore #45
/*     */     //   1222: lload #43
/*     */     //   1224: lstore #46
/*     */     //   1226: iconst_0
/*     */     //   1227: istore #48
/*     */     //   1229: lload #46
/*     */     //   1231: ldc2_w 16
/*     */     //   1234: lcmp
/*     */     //   1235: ifeq -> 1242
/*     */     //   1238: iconst_1
/*     */     //   1239: goto -> 1243
/*     */     //   1242: iconst_0
/*     */     //   1243: ifeq -> 1251
/*     */     //   1246: lload #43
/*     */     //   1248: goto -> 1276
/*     */     //   1251: astore #49
/*     */     //   1253: istore #50
/*     */     //   1255: astore #51
/*     */     //   1257: iconst_0
/*     */     //   1258: istore #52
/*     */     //   1260: aload #5
/*     */     //   1262: invokevirtual getColor-0d7_KjU : ()J
/*     */     //   1265: lstore #53
/*     */     //   1267: aload #51
/*     */     //   1269: iload #50
/*     */     //   1271: aload #49
/*     */     //   1273: lload #53
/*     */     //   1275: nop
/*     */     //   1276: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*     */     //   1279: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   1282: aastore
/*     */     //   1283: aload #42
/*     */     //   1285: iconst_1
/*     */     //   1286: invokestatic getLocalTextStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1289: aload #5
/*     */     //   1291: aload #41
/*     */     //   1293: invokestatic ButtonImpl$lambda$13$lambda$10 : (Landroidx/compose/runtime/State;)J
/*     */     //   1296: lstore #43
/*     */     //   1298: iconst_0
/*     */     //   1299: istore #45
/*     */     //   1301: lload #43
/*     */     //   1303: lstore #46
/*     */     //   1305: iconst_0
/*     */     //   1306: istore #48
/*     */     //   1308: lload #46
/*     */     //   1310: ldc2_w 16
/*     */     //   1313: lcmp
/*     */     //   1314: ifeq -> 1321
/*     */     //   1317: iconst_1
/*     */     //   1318: goto -> 1322
/*     */     //   1321: iconst_0
/*     */     //   1322: ifeq -> 1330
/*     */     //   1325: lload #43
/*     */     //   1327: goto -> 1359
/*     */     //   1330: astore #53
/*     */     //   1332: astore #49
/*     */     //   1334: istore #50
/*     */     //   1336: astore #51
/*     */     //   1338: iconst_0
/*     */     //   1339: istore #52
/*     */     //   1341: aload #5
/*     */     //   1343: invokevirtual getColor-0d7_KjU : ()J
/*     */     //   1346: lstore #55
/*     */     //   1348: aload #51
/*     */     //   1350: iload #50
/*     */     //   1352: aload #49
/*     */     //   1354: aload #53
/*     */     //   1356: lload #55
/*     */     //   1358: nop
/*     */     //   1359: lconst_0
/*     */     //   1360: aconst_null
/*     */     //   1361: aconst_null
/*     */     //   1362: aconst_null
/*     */     //   1363: aconst_null
/*     */     //   1364: aconst_null
/*     */     //   1365: lconst_0
/*     */     //   1366: aconst_null
/*     */     //   1367: aconst_null
/*     */     //   1368: aconst_null
/*     */     //   1369: lconst_0
/*     */     //   1370: aconst_null
/*     */     //   1371: aconst_null
/*     */     //   1372: aconst_null
/*     */     //   1373: iconst_0
/*     */     //   1374: iconst_0
/*     */     //   1375: lconst_0
/*     */     //   1376: aconst_null
/*     */     //   1377: aconst_null
/*     */     //   1378: aconst_null
/*     */     //   1379: iconst_0
/*     */     //   1380: iconst_0
/*     */     //   1381: aconst_null
/*     */     //   1382: ldc_w 16777214
/*     */     //   1385: aconst_null
/*     */     //   1386: invokestatic copy-p1EtxEg$default : (Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;
/*     */     //   1389: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   1392: aastore
/*     */     //   1393: aload #42
/*     */     //   1395: ldc_w -1263801401
/*     */     //   1398: iconst_1
/*     */     //   1399: new org/jetbrains/jewel/ui/component/ButtonKt$ButtonImpl$3$3
/*     */     //   1402: dup
/*     */     //   1403: aload #4
/*     */     //   1405: aload #6
/*     */     //   1407: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;Lkotlin/jvm/functions/Function3;)V
/*     */     //   1410: aload #38
/*     */     //   1412: bipush #54
/*     */     //   1414: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1417: checkcast kotlin/jvm/functions/Function2
/*     */     //   1420: aload #38
/*     */     //   1422: bipush #48
/*     */     //   1424: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*     */     //   1427: ior
/*     */     //   1428: invokestatic CompositionLocalProvider : ([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1431: nop
/*     */     //   1432: aload #35
/*     */     //   1434: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1437: aload #7
/*     */     //   1439: invokeinterface endNode : ()V
/*     */     //   1444: aload #7
/*     */     //   1446: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1449: nop
/*     */     //   1450: aload #7
/*     */     //   1452: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1455: nop
/*     */     //   1456: aload #7
/*     */     //   1458: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1461: nop
/*     */     //   1462: invokestatic isTraceInProgress : ()Z
/*     */     //   1465: ifeq -> 1481
/*     */     //   1468: invokestatic traceEventEnd : ()V
/*     */     //   1471: goto -> 1481
/*     */     //   1474: aload #7
/*     */     //   1476: invokeinterface skipToGroupEnd : ()V
/*     */     //   1481: aload #7
/*     */     //   1483: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1488: dup
/*     */     //   1489: ifnull -> 1517
/*     */     //   1492: aload_0
/*     */     //   1493: aload_1
/*     */     //   1494: iload_2
/*     */     //   1495: aload_3
/*     */     //   1496: aload #4
/*     */     //   1498: aload #5
/*     */     //   1500: aload #6
/*     */     //   1502: iload #8
/*     */     //   1504: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function3;I)Lkotlin/jvm/functions/Function2;
/*     */     //   1509: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1514: goto -> 1518
/*     */     //   1517: pop
/*     */     //   1518: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #96	-> 0
/*     */     //   #97	-> 310
/*     */     //   #217	-> 314
/*     */     //   #218	-> 326
/*     */     //   #219	-> 342
/*     */     //   #97	-> 345
/*     */     //   #219	-> 368
/*     */     //   #220	-> 370
/*     */     //   #221	-> 379
/*     */     //   #222	-> 384
/*     */     //   #218	-> 386
/*     */     //   #217	-> 387
/*     */     //   #217	-> 388
/*     */     //   #97	-> 389
/*     */     //   #99	-> 437
/*     */     //   #223	-> 441
/*     */     //   #224	-> 453
/*     */     //   #225	-> 469
/*     */     //   #99	-> 472
/*     */     //   #225	-> 496
/*     */     //   #226	-> 498
/*     */     //   #227	-> 507
/*     */     //   #228	-> 511
/*     */     //   #224	-> 512
/*     */     //   #223	-> 513
/*     */     //   #223	-> 514
/*     */     //   #101	-> 522
/*     */     //   #229	-> 569
/*     */     //   #230	-> 581
/*     */     //   #231	-> 597
/*     */     //   #101	-> 602
/*     */     //   #231	-> 619
/*     */     //   #232	-> 621
/*     */     //   #233	-> 630
/*     */     //   #234	-> 635
/*     */     //   #230	-> 637
/*     */     //   #229	-> 638
/*     */     //   #229	-> 639
/*     */     //   #101	-> 640
/*     */     //   #116	-> 667
/*     */     //   #117	-> 680
/*     */     //   #118	-> 687
/*     */     //   #126	-> 702
/*     */     //   #122	-> 710
/*     */     //   #127	-> 711
/*     */     //   #128	-> 712
/*     */     //   #125	-> 713
/*     */     //   #123	-> 714
/*     */     //   #126	-> 715
/*     */     //   #124	-> 720
/*     */     //   #123	-> 721
/*     */     //   #130	-> 727
/*     */     //   #132	-> 759
/*     */     //   #133	-> 767
/*     */     //   #134	-> 772
/*     */     //   #135	-> 778
/*     */     //   #131	-> 791
/*     */     //   #137	-> 794
/*     */     //   #138	-> 824
/*     */     //   #120	-> 832
/*     */     //   #235	-> 844
/*     */     //   #236	-> 847
/*     */     //   #240	-> 855
/*     */     //   #241	-> 873
/*     */     //   #242	-> 885
/*     */     //   #243	-> 891
/*     */     //   #244	-> 898
/*     */     //   #245	-> 907
/*     */     //   #247	-> 914
/*     */     //   #246	-> 936
/*     */     //   #248	-> 948
/*     */     //   #249	-> 951
/*     */     //   #250	-> 969
/*     */     //   #251	-> 974
/*     */     //   #252	-> 986
/*     */     //   #254	-> 998
/*     */     //   #256	-> 1003
/*     */     //   #257	-> 1013
/*     */     //   #258	-> 1026
/*     */     //   #260	-> 1039
/*     */     //   #261	-> 1050
/*     */     //   #262	-> 1057
/*     */     //   #263	-> 1085
/*     */     //   #264	-> 1097
/*     */     //   #266	-> 1111
/*     */     //   #261	-> 1112
/*     */     //   #266	-> 1113
/*     */     //   #267	-> 1114
/*     */     //   #268	-> 1127
/*     */     //   #256	-> 1128
/*     */     //   #269	-> 1129
/*     */     //   #270	-> 1154
/*     */     //   #140	-> 1185
/*     */     //   #143	-> 1200
/*     */     //   #271	-> 1222
/*     */     //   #272	-> 1229
/*     */     //   #271	-> 1243
/*     */     //   #143	-> 1260
/*     */     //   #271	-> 1275
/*     */     //   #143	-> 1279
/*     */     //   #144	-> 1286
/*     */     //   #273	-> 1301
/*     */     //   #274	-> 1308
/*     */     //   #273	-> 1322
/*     */     //   #144	-> 1341
/*     */     //   #273	-> 1358
/*     */     //   #144	-> 1359
/*     */     //   #143	-> 1393
/*     */     //   #145	-> 1395
/*     */     //   #142	-> 1428
/*     */     //   #154	-> 1431
/*     */     //   #270	-> 1432
/*     */     //   #269	-> 1437
/*     */     //   #275	-> 1439
/*     */     //   #248	-> 1446
/*     */     //   #276	-> 1449
/*     */     //   #242	-> 1452
/*     */     //   #277	-> 1455
/*     */     //   #235	-> 1458
/*     */     //   #278	-> 1461
/*     */     //   #155	-> 1474
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   345	23	17	$i$a$-cache-ButtonKt$ButtonImpl$buttonState$2	I
/*     */     //   370	11	18	value$iv	Ljava/lang/Object;
/*     */     //   326	61	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   323	64	15	it$iv	Ljava/lang/Object;
/*     */     //   314	75	14	$i$f$cache	I
/*     */     //   311	78	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   311	78	13	invalid$iv	Z
/*     */     //   472	21	16	$i$a$-cache-ButtonKt$ButtonImpl$1	I
/*     */     //   498	10	17	value$iv	Ljava/lang/Object;
/*     */     //   453	60	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   450	63	14	it$iv	Ljava/lang/Object;
/*     */     //   441	74	13	$i$f$cache	I
/*     */     //   438	77	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   438	77	12	invalid$iv	Z
/*     */     //   602	14	17	$i$a$-cache-ButtonKt$ButtonImpl$2	I
/*     */     //   621	11	18	value$iv	Ljava/lang/Object;
/*     */     //   581	57	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   578	60	15	it$iv	Ljava/lang/Object;
/*     */     //   569	71	14	$i$f$cache	I
/*     */     //   566	74	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   566	74	13	invalid$iv	Z
/*     */     //   1260	5	52	$i$a$-takeOrElse-DxMtmZc-ButtonKt$ButtonImpl$3$1	I
/*     */     //   1229	14	48	$i$f$isSpecified-8_81llA	I
/*     */     //   1226	17	46	$this$isSpecified$iv$iv	J
/*     */     //   1222	54	45	$i$f$takeOrElse-DxMtmZc	I
/*     */     //   1219	57	43	$this$takeOrElse_u2dDxMtmZc$iv	J
/*     */     //   1341	5	52	$i$a$-takeOrElse-DxMtmZc-ButtonKt$ButtonImpl$3$2	I
/*     */     //   1308	14	48	$i$f$isSpecified-8_81llA	I
/*     */     //   1305	17	46	$this$isSpecified$iv$iv	J
/*     */     //   1301	58	45	$i$f$takeOrElse-DxMtmZc	I
/*     */     //   1298	61	43	$this$takeOrElse_u2dDxMtmZc$iv	J
/*     */     //   1185	247	40	$i$a$-Box-ButtonKt$ButtonImpl$3	I
/*     */     //   1200	232	41	contentColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   1182	250	39	$this$ButtonImpl_u24lambda_u2413	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1182	250	38	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1182	250	37	$changed	I
/*     */     //   1146	291	36	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1143	294	35	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1143	294	34	$changed$iv	I
/*     */     //   1057	55	33	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1054	58	32	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1050	64	31	$i$f$set-impl	I
/*     */     //   1047	67	30	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1013	115	29	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1010	118	28	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   940	510	27	$i$f$ReusableComposeNode	I
/*     */     //   937	513	25	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   937	513	26	$changed$iv$iv$iv	I
/*     */     //   877	579	21	$i$f$Layout	I
/*     */     //   896	560	22	compositeKeyHash$iv$iv	I
/*     */     //   905	551	23	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   914	542	24	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   874	582	20	$changed$iv$iv	I
/*     */     //   836	626	18	$i$f$Box	I
/*     */     //   864	598	19	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   833	629	14	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   855	607	15	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   833	629	16	propagateMinConstraints$iv	Z
/*     */     //   833	629	17	$changed$iv	I
/*     */     //   405	1066	10	buttonState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   680	791	11	shape	Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   687	784	12	colors	Lorg/jetbrains/jewel/ui/component/styling/ButtonColors;
/*     */     //   702	769	13	borderColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   15	1504	9	$dirty	I
/*     */     //   0	1519	0	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1519	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1519	2	enabled	Z
/*     */     //   0	1519	3	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1519	4	style	Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;
/*     */     //   0	1519	5	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	1519	6	content	Lkotlin/jvm/functions/Function3;
/*     */     //   0	1519	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1519	8	$changed	I
/*     */   }
/*     */   
/*     */   private static final long ButtonImpl$lambda$5(MutableState $buttonState$delegate) {
/*  97 */     State state = (State)$buttonState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 279 */       (ButtonState)state.getValue()).unbox-impl(); } private static final void ButtonImpl$lambda$6(MutableState $buttonState$delegate, long <set-?>) { MutableState mutableState = $buttonState$delegate; Object object1 = null, object2 = null; Object value$iv = ButtonState.box-impl(<set-?>); int $i$f$setValue = 0;
/* 280 */     mutableState.setValue(value$iv); } private static final Brush ButtonImpl$lambda$9(State $borderColor$delegate) { State state = $borderColor$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 282 */     return (Brush)state.getValue(); } @DebugMetadata(f = "Button.kt", l = {102}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.ButtonKt$ButtonImpl$2$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class ButtonKt$ButtonImpl$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/* 283 */     int label; ButtonKt$ButtonImpl$2$1(MutableInteractionSource $interactionSource, MutableState<ButtonState> $buttonState$delegate, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$buttonState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { ButtonKt.ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, true, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { ButtonKt.ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { ButtonKt.ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, true, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { ButtonKt.ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, false, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { ButtonKt.ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.ButtonImpl$lambda$5(this.$buttonState$delegate), false, true, false, false, false, 29, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { ButtonKt.ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, false, false, 29, null)); }  return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$buttonState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { ButtonKt.ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, true, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { ButtonKt.ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { ButtonKt.ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, true, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { ButtonKt.ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, false, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { ButtonKt.ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.ButtonImpl$lambda$5(this.$buttonState$delegate), false, true, false, false, false, 29, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { ButtonKt.ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, false, false, 29, null)); }  return Unit.INSTANCE; } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super ButtonKt$ButtonImpl$2$1> $completion) { return (Continuation<Unit>)new ButtonKt$ButtonImpl$2$1(this.$interactionSource, this.$buttonState$delegate, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((ButtonKt$ButtonImpl$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final long ButtonImpl$lambda$13$lambda$10(State $contentColor$delegate) { State state = $contentColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Color)state.getValue()).unbox-impl(); }
/*     */ 
/*     */   
/*     */   private static final Unit DefaultButton$lambda$1(Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, MutableInteractionSource $interactionSource, ButtonStyle $style, TextStyle $textStyle, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     DefaultButton($onClick, $modifier, $enabled, $interactionSource, $style, $textStyle, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit OutlinedButton$lambda$3(Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, MutableInteractionSource $interactionSource, ButtonStyle $style, TextStyle $textStyle, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     OutlinedButton($onClick, $modifier, $enabled, $interactionSource, $style, $textStyle, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit ButtonImpl$lambda$14(Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, MutableInteractionSource $interactionSource, ButtonStyle $style, TextStyle $textStyle, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> $content, int $$changed, Composer $composer, int $force) {
/*     */     ButtonImpl($onClick, $modifier, $enabled, $interactionSource, $style, $textStyle, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\norg/jetbrains/jewel/ui/component/ButtonKt$ButtonImpl$3$3\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,204:1\n99#2,3:205\n102#2:236\n106#2:240\n79#3,6:208\n86#3,4:223\n90#3,2:233\n94#3:239\n368#4,9:214\n377#4:235\n378#4,2:237\n4034#5,6:227\n*S KotlinDebug\n*F\n+ 1 Button.kt\norg/jetbrains/jewel/ui/component/ButtonKt$ButtonImpl$3$3\n*L\n146#1:205,3\n146#1:236\n146#1:240\n146#1:208,6\n146#1:223,4\n146#1:233,2\n146#1:239\n146#1:214,9\n146#1:235\n146#1:237,2\n146#1:227,6\n*E\n"})
/*     */   static final class ButtonKt$ButtonImpl$3$3 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(-1263801401, $changed, -1, "org.jetbrains.jewel.ui.component.ButtonImpl.<anonymous>.<anonymous> (Button.kt:145)"); 
/*     */         Modifier modifier1 = PaddingKt.padding(SizeKt.defaultMinSize-VpY3zN4((Modifier)Modifier.Companion, DpSize.getWidth-D9Ej5fM(this.$style.getMetrics().getMinSize-MYxV2XQ()), DpSize.getHeight-D9Ej5fM(this.$style.getMetrics().getMinSize-MYxV2XQ())), this.$style.getMetrics().getPadding());
/*     */         Arrangement.Horizontal horizontal = (Arrangement.Horizontal)Arrangement.INSTANCE.getCenter();
/*     */         Alignment.Vertical vertical = Alignment.Companion.getCenterVertically();
/*     */         Function3<RowScope, Composer, Integer, Unit> function3 = this.$content;
/*     */         int $changed$iv = 432;
/*     */         int $i$f$Row = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
/*     */         MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontal, vertical, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3);
/*     */         int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*     */         int $i$f$Layout = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*     */         int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*     */         CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*     */         Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */         Function0 function0 = ComposeUiNode.Companion.getConstructor();
/*     */         int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6;
/*     */         int $i$f$ReusableComposeNode = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*     */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier))
/*     */           ComposablesKt.invalidApplier(); 
/*     */         $composer.startReusableNode();
/*     */         if ($composer.getInserting()) {
/*     */           $composer.createNode(function0);
/*     */         } else {
/*     */           $composer.useNode();
/*     */         } 
/*     */         Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer);
/*     */         int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/*     */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/*     */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash();
/*     */         int $i$f$set-impl = 0;
/*     */         Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv;
/*     */         int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/*     */         if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/*     */           $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/*     */           $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */         } 
/*     */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */         int i = 0xE & $changed$iv$iv$iv >> 6;
/*     */         Composer $composer$iv = $composer;
/*     */         int $i$a$-Layout-RowKt$Row$1$iv = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer$iv, -407840262, "C101@5126L9:Row.kt#2w3rfo");
/*     */         function3.invoke(RowScopeInstance.INSTANCE, $composer$iv, Integer.valueOf(0x6 | 0x70 & $changed$iv >> 6));
/*     */         ComposerKt.sourceInformationMarkerEnd($composer$iv);
/*     */         $composer.endNode();
/*     */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     ButtonKt$ButtonImpl$3$3(ButtonStyle $style, Function3<RowScope, Composer, Integer, Unit> $content) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ButtonKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */