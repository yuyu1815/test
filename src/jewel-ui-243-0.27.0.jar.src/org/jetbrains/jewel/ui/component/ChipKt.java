/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.ChipStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000B\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\032b\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\0010\f2\021\020\r\032\r\022\004\022\0020\0010\f¢\006\002\b\016H\007¢\006\002\020\017\032d\020\020\032\0020\0012\006\020\021\032\0020\0072\022\020\013\032\016\022\004\022\0020\007\022\004\022\0020\0010\0222\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\t\032\0020\n2\021\020\r\032\r\022\004\022\0020\0010\f¢\006\002\b\016H\007¢\006\002\020\023\032^\020\024\032\0020\0012\006\020\b\032\0020\0072\f\020\013\032\b\022\004\022\0020\0010\f2\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\t\032\0020\n2\021\020\r\032\r\022\004\022\0020\0010\f¢\006\002\b\016H\007¢\006\002\020\025\032H\020\026\032\0020\0012\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\n2\006\020\002\032\0020\0032\021\020\r\032\r\022\004\022\0020\0010\f¢\006\002\b\016H\003¢\006\002\020\027¨\006\030²\006\n\020\031\032\0020\032X\002²\006\n\020\033\032\0020\034X\002"}, d2 = {"Chip", "", "modifier", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "selected", "style", "Lorg/jetbrains/jewel/ui/component/styling/ChipStyle;", "onClick", "Lkotlin/Function0;", "content", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZZLorg/jetbrains/jewel/ui/component/styling/ChipStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ToggleableChip", "checked", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLorg/jetbrains/jewel/ui/component/styling/ChipStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "RadioButtonChip", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLorg/jetbrains/jewel/ui/component/styling/ChipStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ChipImpl", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;ZZLorg/jetbrains/jewel/ui/component/styling/ChipStyle;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ui", "chipState", "Lorg/jetbrains/jewel/ui/component/ChipState;", "borderColor", "Landroidx/compose/ui/graphics/Color;"})
/*     */ @SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\norg/jetbrains/jewel/ui/component/ChipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 ModifierExtensions.kt\norg/jetbrains/jewel/ui/util/ModifierExtensionsKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,249:1\n1225#2,6:250\n1225#2,6:256\n1225#2,6:262\n1225#2,6:268\n1225#2,6:274\n1225#2,6:280\n1225#2,6:286\n10#3:292\n99#4,3:293\n102#4:324\n106#4:332\n79#5,6:296\n86#5,4:311\n90#5,2:321\n94#5:331\n368#6,9:302\n377#6:323\n378#6,2:329\n4034#7,6:315\n708#8:325\n696#8:326\n77#9:327\n77#9:328\n81#10:333\n107#10,2:334\n81#10:336\n*S KotlinDebug\n*F\n+ 1 Chip.kt\norg/jetbrains/jewel/ui/component/ChipKt\n*L\n48#1:250,6\n52#1:256,6\n77#1:262,6\n105#1:268,6\n138#1:274,6\n140#1:280,6\n142#1:286,6\n171#1:292\n167#1:293,3\n167#1:324\n167#1:332\n167#1:296,6\n167#1:311,4\n167#1:321,2\n167#1:331\n167#1:302,9\n167#1:323\n167#1:329,2\n167#1:315,6\n177#1:325\n177#1:326\n177#1:327\n181#1:328\n138#1:333\n138#1:334,2\n158#1:336\n*E\n"})
/*     */ public final class ChipKt
/*     */ {
/*     */   private static final Unit Chip$lambda$2$lambda$1() {
/*  52 */     return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void Chip(@Nullable Modifier modifier, @Nullable MutableInteractionSource interactionSource, boolean enabled, boolean selected, @Nullable ChipStyle style, @Nullable Function0 onClick, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: ldc 'content'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #7
/*     */     //   9: ldc -683367700
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
/*     */     //   97: aload_1
/*     */     //   98: invokeinterface changed : (Ljava/lang/Object;)Z
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
/*     */     //   147: iload_2
/*     */     //   148: invokeinterface changed : (Z)Z
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
/*     */     //   200: iload_3
/*     */     //   201: invokeinterface changed : (Z)Z
/*     */     //   206: ifeq -> 215
/*     */     //   209: sipush #2048
/*     */     //   212: goto -> 218
/*     */     //   215: sipush #1024
/*     */     //   218: ior
/*     */     //   219: istore #10
/*     */     //   221: iload #8
/*     */     //   223: sipush #24576
/*     */     //   226: iand
/*     */     //   227: ifne -> 264
/*     */     //   230: iload #10
/*     */     //   232: iload #9
/*     */     //   234: bipush #16
/*     */     //   236: iand
/*     */     //   237: ifne -> 258
/*     */     //   240: aload #7
/*     */     //   242: aload #4
/*     */     //   244: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   249: ifeq -> 258
/*     */     //   252: sipush #16384
/*     */     //   255: goto -> 261
/*     */     //   258: sipush #8192
/*     */     //   261: ior
/*     */     //   262: istore #10
/*     */     //   264: iload #9
/*     */     //   266: bipush #32
/*     */     //   268: iand
/*     */     //   269: ifeq -> 282
/*     */     //   272: iload #10
/*     */     //   274: ldc 196608
/*     */     //   276: ior
/*     */     //   277: istore #10
/*     */     //   279: goto -> 314
/*     */     //   282: iload #8
/*     */     //   284: ldc 196608
/*     */     //   286: iand
/*     */     //   287: ifne -> 314
/*     */     //   290: iload #10
/*     */     //   292: aload #7
/*     */     //   294: aload #5
/*     */     //   296: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   301: ifeq -> 309
/*     */     //   304: ldc 131072
/*     */     //   306: goto -> 311
/*     */     //   309: ldc 65536
/*     */     //   311: ior
/*     */     //   312: istore #10
/*     */     //   314: iload #9
/*     */     //   316: bipush #64
/*     */     //   318: iand
/*     */     //   319: ifeq -> 332
/*     */     //   322: iload #10
/*     */     //   324: ldc 1572864
/*     */     //   326: ior
/*     */     //   327: istore #10
/*     */     //   329: goto -> 364
/*     */     //   332: iload #8
/*     */     //   334: ldc 1572864
/*     */     //   336: iand
/*     */     //   337: ifne -> 364
/*     */     //   340: iload #10
/*     */     //   342: aload #7
/*     */     //   344: aload #6
/*     */     //   346: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   351: ifeq -> 359
/*     */     //   354: ldc 1048576
/*     */     //   356: goto -> 361
/*     */     //   359: ldc 524288
/*     */     //   361: ior
/*     */     //   362: istore #10
/*     */     //   364: iload #10
/*     */     //   366: ldc 599187
/*     */     //   368: iand
/*     */     //   369: ldc 599186
/*     */     //   371: if_icmpne -> 384
/*     */     //   374: aload #7
/*     */     //   376: invokeinterface getSkipping : ()Z
/*     */     //   381: ifne -> 793
/*     */     //   384: aload #7
/*     */     //   386: invokeinterface startDefaults : ()V
/*     */     //   391: iload #8
/*     */     //   393: iconst_1
/*     */     //   394: iand
/*     */     //   395: ifeq -> 408
/*     */     //   398: aload #7
/*     */     //   400: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   405: ifeq -> 657
/*     */     //   408: iload #9
/*     */     //   410: iconst_1
/*     */     //   411: iand
/*     */     //   412: ifeq -> 422
/*     */     //   415: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   418: checkcast androidx/compose/ui/Modifier
/*     */     //   421: astore_0
/*     */     //   422: iload #9
/*     */     //   424: iconst_2
/*     */     //   425: iand
/*     */     //   426: ifeq -> 513
/*     */     //   429: aload #7
/*     */     //   431: ldc 614651249
/*     */     //   433: invokeinterface startReplaceGroup : (I)V
/*     */     //   438: aload #7
/*     */     //   440: astore #12
/*     */     //   442: iconst_0
/*     */     //   443: istore #13
/*     */     //   445: iconst_0
/*     */     //   446: istore #14
/*     */     //   448: aload #12
/*     */     //   450: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   455: astore #15
/*     */     //   457: iconst_0
/*     */     //   458: istore #16
/*     */     //   460: aload #15
/*     */     //   462: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   465: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   468: if_acmpne -> 493
/*     */     //   471: iconst_0
/*     */     //   472: istore #17
/*     */     //   474: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   477: astore #17
/*     */     //   479: aload #12
/*     */     //   481: aload #17
/*     */     //   483: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   488: aload #17
/*     */     //   490: goto -> 495
/*     */     //   493: aload #15
/*     */     //   495: nop
/*     */     //   496: nop
/*     */     //   497: nop
/*     */     //   498: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   501: astore #11
/*     */     //   503: aload #7
/*     */     //   505: invokeinterface endReplaceGroup : ()V
/*     */     //   510: aload #11
/*     */     //   512: astore_1
/*     */     //   513: iload #9
/*     */     //   515: iconst_4
/*     */     //   516: iand
/*     */     //   517: ifeq -> 522
/*     */     //   520: iconst_1
/*     */     //   521: istore_2
/*     */     //   522: iload #9
/*     */     //   524: bipush #8
/*     */     //   526: iand
/*     */     //   527: ifeq -> 532
/*     */     //   530: iconst_0
/*     */     //   531: istore_3
/*     */     //   532: iload #9
/*     */     //   534: bipush #16
/*     */     //   536: iand
/*     */     //   537: ifeq -> 559
/*     */     //   540: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   543: aload #7
/*     */     //   545: bipush #6
/*     */     //   547: invokestatic getChipStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ChipStyle;
/*     */     //   550: astore #4
/*     */     //   552: iload #10
/*     */     //   554: ldc -57345
/*     */     //   556: iand
/*     */     //   557: istore #10
/*     */     //   559: iload #9
/*     */     //   561: bipush #32
/*     */     //   563: iand
/*     */     //   564: ifeq -> 679
/*     */     //   567: aload #7
/*     */     //   569: ldc 614656716
/*     */     //   571: invokeinterface startReplaceGroup : (I)V
/*     */     //   576: aload #7
/*     */     //   578: astore #12
/*     */     //   580: iconst_0
/*     */     //   581: istore #13
/*     */     //   583: iconst_0
/*     */     //   584: istore #14
/*     */     //   586: aload #12
/*     */     //   588: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   593: astore #15
/*     */     //   595: iconst_0
/*     */     //   596: istore #16
/*     */     //   598: aload #15
/*     */     //   600: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   603: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   606: if_acmpne -> 633
/*     */     //   609: iconst_0
/*     */     //   610: istore #17
/*     */     //   612: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*     */     //   617: astore #17
/*     */     //   619: aload #12
/*     */     //   621: aload #17
/*     */     //   623: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   628: aload #17
/*     */     //   630: goto -> 635
/*     */     //   633: aload #15
/*     */     //   635: nop
/*     */     //   636: nop
/*     */     //   637: nop
/*     */     //   638: checkcast kotlin/jvm/functions/Function0
/*     */     //   641: astore #11
/*     */     //   643: aload #7
/*     */     //   645: invokeinterface endReplaceGroup : ()V
/*     */     //   650: aload #11
/*     */     //   652: astore #5
/*     */     //   654: goto -> 679
/*     */     //   657: aload #7
/*     */     //   659: invokeinterface skipToGroupEnd : ()V
/*     */     //   664: iload #9
/*     */     //   666: bipush #16
/*     */     //   668: iand
/*     */     //   669: ifeq -> 679
/*     */     //   672: iload #10
/*     */     //   674: ldc -57345
/*     */     //   676: iand
/*     */     //   677: istore #10
/*     */     //   679: aload #7
/*     */     //   681: invokeinterface endDefaults : ()V
/*     */     //   686: invokestatic isTraceInProgress : ()Z
/*     */     //   689: ifeq -> 702
/*     */     //   692: ldc -683367700
/*     */     //   694: iload #10
/*     */     //   696: iconst_m1
/*     */     //   697: ldc 'org.jetbrains.jewel.ui.component.Chip (Chip.kt:53)'
/*     */     //   699: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   702: aload_1
/*     */     //   703: iload_2
/*     */     //   704: iload_3
/*     */     //   705: aload #4
/*     */     //   707: getstatic androidx/compose/ui/semantics/Role.Companion : Landroidx/compose/ui/semantics/Role$Companion;
/*     */     //   710: invokevirtual getButton-o7Vup1c : ()I
/*     */     //   713: istore #11
/*     */     //   715: aload_0
/*     */     //   716: aload_1
/*     */     //   717: aconst_null
/*     */     //   718: iload_2
/*     */     //   719: aconst_null
/*     */     //   720: iload #11
/*     */     //   722: invokestatic box-impl : (I)Landroidx/compose/ui/semantics/Role;
/*     */     //   725: aload #5
/*     */     //   727: bipush #8
/*     */     //   729: aconst_null
/*     */     //   730: invokestatic clickable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   733: aload #6
/*     */     //   735: aload #7
/*     */     //   737: bipush #14
/*     */     //   739: iload #10
/*     */     //   741: iconst_3
/*     */     //   742: ishr
/*     */     //   743: iand
/*     */     //   744: bipush #112
/*     */     //   746: iload #10
/*     */     //   748: iconst_3
/*     */     //   749: ishr
/*     */     //   750: iand
/*     */     //   751: ior
/*     */     //   752: sipush #896
/*     */     //   755: iload #10
/*     */     //   757: iconst_3
/*     */     //   758: ishr
/*     */     //   759: iand
/*     */     //   760: ior
/*     */     //   761: sipush #7168
/*     */     //   764: iload #10
/*     */     //   766: iconst_3
/*     */     //   767: ishr
/*     */     //   768: iand
/*     */     //   769: ior
/*     */     //   770: ldc 458752
/*     */     //   772: iload #10
/*     */     //   774: iconst_3
/*     */     //   775: ishr
/*     */     //   776: iand
/*     */     //   777: ior
/*     */     //   778: invokestatic ChipImpl : (Landroidx/compose/foundation/interaction/MutableInteractionSource;ZZLorg/jetbrains/jewel/ui/component/styling/ChipStyle;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   781: invokestatic isTraceInProgress : ()Z
/*     */     //   784: ifeq -> 800
/*     */     //   787: invokestatic traceEventEnd : ()V
/*     */     //   790: goto -> 800
/*     */     //   793: aload #7
/*     */     //   795: invokeinterface skipToGroupEnd : ()V
/*     */     //   800: aload #7
/*     */     //   802: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   807: dup
/*     */     //   808: ifnull -> 838
/*     */     //   811: aload_0
/*     */     //   812: aload_1
/*     */     //   813: iload_2
/*     */     //   814: iload_3
/*     */     //   815: aload #4
/*     */     //   817: aload #5
/*     */     //   819: aload #6
/*     */     //   821: iload #8
/*     */     //   823: iload #9
/*     */     //   825: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZZLorg/jetbrains/jewel/ui/component/styling/ChipStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*     */     //   830: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   835: goto -> 839
/*     */     //   838: pop
/*     */     //   839: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #54	-> 7
/*     */     //   #47	-> 415
/*     */     //   #48	-> 429
/*     */     //   #250	-> 448
/*     */     //   #251	-> 460
/*     */     //   #252	-> 471
/*     */     //   #48	-> 474
/*     */     //   #252	-> 477
/*     */     //   #253	-> 479
/*     */     //   #254	-> 488
/*     */     //   #255	-> 493
/*     */     //   #251	-> 495
/*     */     //   #250	-> 496
/*     */     //   #250	-> 497
/*     */     //   #48	-> 498
/*     */     //   #49	-> 520
/*     */     //   #50	-> 530
/*     */     //   #51	-> 540
/*     */     //   #52	-> 567
/*     */     //   #256	-> 586
/*     */     //   #257	-> 598
/*     */     //   #258	-> 609
/*     */     //   #258	-> 617
/*     */     //   #259	-> 619
/*     */     //   #260	-> 628
/*     */     //   #261	-> 633
/*     */     //   #257	-> 635
/*     */     //   #256	-> 636
/*     */     //   #256	-> 637
/*     */     //   #52	-> 638
/*     */     //   #54	-> 699
/*     */     //   #56	-> 702
/*     */     //   #57	-> 703
/*     */     //   #58	-> 704
/*     */     //   #59	-> 705
/*     */     //   #64	-> 707
/*     */     //   #61	-> 715
/*     */     //   #65	-> 716
/*     */     //   #66	-> 717
/*     */     //   #63	-> 718
/*     */     //   #61	-> 719
/*     */     //   #64	-> 720
/*     */     //   #62	-> 725
/*     */     //   #61	-> 727
/*     */     //   #68	-> 733
/*     */     //   #55	-> 778
/*     */     //   #70	-> 793
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   474	3	17	$i$a$-cache-ChipKt$Chip$1	I
/*     */     //   479	11	17	value$iv	Ljava/lang/Object;
/*     */     //   460	36	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   457	39	15	it$iv	Ljava/lang/Object;
/*     */     //   448	50	14	$i$f$cache	I
/*     */     //   445	53	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   445	53	13	invalid$iv	Z
/*     */     //   612	5	17	$i$a$-cache-ChipKt$Chip$2	I
/*     */     //   619	11	17	value$iv	Ljava/lang/Object;
/*     */     //   598	38	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   595	41	15	it$iv	Ljava/lang/Object;
/*     */     //   586	52	14	$i$f$cache	I
/*     */     //   583	55	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   583	55	13	invalid$iv	Z
/*     */     //   22	818	10	$dirty	I
/*     */     //   0	840	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	840	1	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	840	2	enabled	Z
/*     */     //   0	840	3	selected	Z
/*     */     //   0	840	4	style	Lorg/jetbrains/jewel/ui/component/styling/ChipStyle;
/*     */     //   0	840	5	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	840	6	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	840	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	840	8	$changed	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void ToggleableChip(boolean checked, @NotNull Function1 onClick, @Nullable Modifier modifier, @Nullable MutableInteractionSource interactionSource, boolean enabled, @Nullable ChipStyle style, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'onClick'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #6
/*     */     //   8: ldc 'content'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #7
/*     */     //   15: ldc -1516223235
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
/*     */     //   57: iload_0
/*     */     //   58: invokeinterface changed : (Z)Z
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
/*     */     //   104: invokeinterface changedInstance : (Ljava/lang/Object;)Z
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
/*     */     //   153: aload_2
/*     */     //   154: invokeinterface changed : (Ljava/lang/Object;)Z
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
/*     */     //   227: iload #9
/*     */     //   229: bipush #16
/*     */     //   231: iand
/*     */     //   232: ifeq -> 246
/*     */     //   235: iload #10
/*     */     //   237: sipush #24576
/*     */     //   240: ior
/*     */     //   241: istore #10
/*     */     //   243: goto -> 281
/*     */     //   246: iload #8
/*     */     //   248: sipush #24576
/*     */     //   251: iand
/*     */     //   252: ifne -> 281
/*     */     //   255: iload #10
/*     */     //   257: aload #7
/*     */     //   259: iload #4
/*     */     //   261: invokeinterface changed : (Z)Z
/*     */     //   266: ifeq -> 275
/*     */     //   269: sipush #16384
/*     */     //   272: goto -> 278
/*     */     //   275: sipush #8192
/*     */     //   278: ior
/*     */     //   279: istore #10
/*     */     //   281: iload #8
/*     */     //   283: ldc 196608
/*     */     //   285: iand
/*     */     //   286: ifne -> 321
/*     */     //   289: iload #10
/*     */     //   291: iload #9
/*     */     //   293: bipush #32
/*     */     //   295: iand
/*     */     //   296: ifne -> 316
/*     */     //   299: aload #7
/*     */     //   301: aload #5
/*     */     //   303: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   308: ifeq -> 316
/*     */     //   311: ldc 131072
/*     */     //   313: goto -> 318
/*     */     //   316: ldc 65536
/*     */     //   318: ior
/*     */     //   319: istore #10
/*     */     //   321: iload #9
/*     */     //   323: bipush #64
/*     */     //   325: iand
/*     */     //   326: ifeq -> 339
/*     */     //   329: iload #10
/*     */     //   331: ldc 1572864
/*     */     //   333: ior
/*     */     //   334: istore #10
/*     */     //   336: goto -> 371
/*     */     //   339: iload #8
/*     */     //   341: ldc 1572864
/*     */     //   343: iand
/*     */     //   344: ifne -> 371
/*     */     //   347: iload #10
/*     */     //   349: aload #7
/*     */     //   351: aload #6
/*     */     //   353: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   358: ifeq -> 366
/*     */     //   361: ldc 1048576
/*     */     //   363: goto -> 368
/*     */     //   366: ldc 524288
/*     */     //   368: ior
/*     */     //   369: istore #10
/*     */     //   371: iload #10
/*     */     //   373: ldc 599187
/*     */     //   375: iand
/*     */     //   376: ldc 599186
/*     */     //   378: if_icmpne -> 391
/*     */     //   381: aload #7
/*     */     //   383: invokeinterface getSkipping : ()Z
/*     */     //   388: ifne -> 700
/*     */     //   391: aload #7
/*     */     //   393: invokeinterface startDefaults : ()V
/*     */     //   398: iload #8
/*     */     //   400: iconst_1
/*     */     //   401: iand
/*     */     //   402: ifeq -> 415
/*     */     //   405: aload #7
/*     */     //   407: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   412: ifeq -> 562
/*     */     //   415: iload #9
/*     */     //   417: iconst_4
/*     */     //   418: iand
/*     */     //   419: ifeq -> 429
/*     */     //   422: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   425: checkcast androidx/compose/ui/Modifier
/*     */     //   428: astore_2
/*     */     //   429: iload #9
/*     */     //   431: bipush #8
/*     */     //   433: iand
/*     */     //   434: ifeq -> 521
/*     */     //   437: aload #7
/*     */     //   439: ldc 1488011359
/*     */     //   441: invokeinterface startReplaceGroup : (I)V
/*     */     //   446: aload #7
/*     */     //   448: astore #12
/*     */     //   450: iconst_0
/*     */     //   451: istore #13
/*     */     //   453: iconst_0
/*     */     //   454: istore #14
/*     */     //   456: aload #12
/*     */     //   458: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   463: astore #15
/*     */     //   465: iconst_0
/*     */     //   466: istore #16
/*     */     //   468: aload #15
/*     */     //   470: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   473: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   476: if_acmpne -> 501
/*     */     //   479: iconst_0
/*     */     //   480: istore #17
/*     */     //   482: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   485: astore #17
/*     */     //   487: aload #12
/*     */     //   489: aload #17
/*     */     //   491: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   496: aload #17
/*     */     //   498: goto -> 503
/*     */     //   501: aload #15
/*     */     //   503: nop
/*     */     //   504: nop
/*     */     //   505: nop
/*     */     //   506: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   509: astore #11
/*     */     //   511: aload #7
/*     */     //   513: invokeinterface endReplaceGroup : ()V
/*     */     //   518: aload #11
/*     */     //   520: astore_3
/*     */     //   521: iload #9
/*     */     //   523: bipush #16
/*     */     //   525: iand
/*     */     //   526: ifeq -> 532
/*     */     //   529: iconst_1
/*     */     //   530: istore #4
/*     */     //   532: iload #9
/*     */     //   534: bipush #32
/*     */     //   536: iand
/*     */     //   537: ifeq -> 584
/*     */     //   540: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   543: aload #7
/*     */     //   545: bipush #6
/*     */     //   547: invokestatic getChipStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ChipStyle;
/*     */     //   550: astore #5
/*     */     //   552: iload #10
/*     */     //   554: ldc -458753
/*     */     //   556: iand
/*     */     //   557: istore #10
/*     */     //   559: goto -> 584
/*     */     //   562: aload #7
/*     */     //   564: invokeinterface skipToGroupEnd : ()V
/*     */     //   569: iload #9
/*     */     //   571: bipush #32
/*     */     //   573: iand
/*     */     //   574: ifeq -> 584
/*     */     //   577: iload #10
/*     */     //   579: ldc -458753
/*     */     //   581: iand
/*     */     //   582: istore #10
/*     */     //   584: aload #7
/*     */     //   586: invokeinterface endDefaults : ()V
/*     */     //   591: invokestatic isTraceInProgress : ()Z
/*     */     //   594: ifeq -> 607
/*     */     //   597: ldc -1516223235
/*     */     //   599: iload #10
/*     */     //   601: iconst_m1
/*     */     //   602: ldc 'org.jetbrains.jewel.ui.component.ToggleableChip (Chip.kt:80)'
/*     */     //   604: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   607: aload_3
/*     */     //   608: iload #4
/*     */     //   610: iload_0
/*     */     //   611: aload #5
/*     */     //   613: getstatic androidx/compose/ui/semantics/Role.Companion : Landroidx/compose/ui/semantics/Role$Companion;
/*     */     //   616: invokevirtual getCheckbox-o7Vup1c : ()I
/*     */     //   619: istore #11
/*     */     //   621: aload_2
/*     */     //   622: iload_0
/*     */     //   623: aload_3
/*     */     //   624: aconst_null
/*     */     //   625: iload #4
/*     */     //   627: iload #11
/*     */     //   629: invokestatic box-impl : (I)Landroidx/compose/ui/semantics/Role;
/*     */     //   632: aload_1
/*     */     //   633: invokestatic toggleable-O2vRcR0 : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   636: aload #6
/*     */     //   638: aload #7
/*     */     //   640: bipush #14
/*     */     //   642: iload #10
/*     */     //   644: bipush #9
/*     */     //   646: ishr
/*     */     //   647: iand
/*     */     //   648: bipush #112
/*     */     //   650: iload #10
/*     */     //   652: bipush #9
/*     */     //   654: ishr
/*     */     //   655: iand
/*     */     //   656: ior
/*     */     //   657: sipush #896
/*     */     //   660: iload #10
/*     */     //   662: bipush #6
/*     */     //   664: ishl
/*     */     //   665: iand
/*     */     //   666: ior
/*     */     //   667: sipush #7168
/*     */     //   670: iload #10
/*     */     //   672: bipush #6
/*     */     //   674: ishr
/*     */     //   675: iand
/*     */     //   676: ior
/*     */     //   677: ldc 458752
/*     */     //   679: iload #10
/*     */     //   681: iconst_3
/*     */     //   682: ishr
/*     */     //   683: iand
/*     */     //   684: ior
/*     */     //   685: invokestatic ChipImpl : (Landroidx/compose/foundation/interaction/MutableInteractionSource;ZZLorg/jetbrains/jewel/ui/component/styling/ChipStyle;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   688: invokestatic isTraceInProgress : ()Z
/*     */     //   691: ifeq -> 707
/*     */     //   694: invokestatic traceEventEnd : ()V
/*     */     //   697: goto -> 707
/*     */     //   700: aload #7
/*     */     //   702: invokeinterface skipToGroupEnd : ()V
/*     */     //   707: aload #7
/*     */     //   709: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   714: dup
/*     */     //   715: ifnull -> 745
/*     */     //   718: iload_0
/*     */     //   719: aload_1
/*     */     //   720: aload_2
/*     */     //   721: aload_3
/*     */     //   722: iload #4
/*     */     //   724: aload #5
/*     */     //   726: aload #6
/*     */     //   728: iload #8
/*     */     //   730: iload #9
/*     */     //   732: <illegal opcode> invoke : (ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLorg/jetbrains/jewel/ui/component/styling/ChipStyle;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*     */     //   737: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   742: goto -> 746
/*     */     //   745: pop
/*     */     //   746: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #81	-> 13
/*     */     //   #76	-> 422
/*     */     //   #77	-> 437
/*     */     //   #262	-> 456
/*     */     //   #263	-> 468
/*     */     //   #264	-> 479
/*     */     //   #77	-> 482
/*     */     //   #264	-> 485
/*     */     //   #265	-> 487
/*     */     //   #266	-> 496
/*     */     //   #267	-> 501
/*     */     //   #263	-> 503
/*     */     //   #262	-> 504
/*     */     //   #262	-> 505
/*     */     //   #77	-> 506
/*     */     //   #78	-> 529
/*     */     //   #79	-> 540
/*     */     //   #81	-> 604
/*     */     //   #83	-> 607
/*     */     //   #84	-> 608
/*     */     //   #85	-> 610
/*     */     //   #86	-> 611
/*     */     //   #91	-> 613
/*     */     //   #88	-> 621
/*     */     //   #94	-> 622
/*     */     //   #92	-> 623
/*     */     //   #93	-> 624
/*     */     //   #90	-> 625
/*     */     //   #91	-> 627
/*     */     //   #89	-> 632
/*     */     //   #88	-> 633
/*     */     //   #96	-> 636
/*     */     //   #82	-> 685
/*     */     //   #98	-> 700
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   482	3	17	$i$a$-cache-ChipKt$ToggleableChip$1	I
/*     */     //   487	11	17	value$iv	Ljava/lang/Object;
/*     */     //   468	36	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   465	39	15	it$iv	Ljava/lang/Object;
/*     */     //   456	50	14	$i$f$cache	I
/*     */     //   453	53	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   453	53	13	invalid$iv	Z
/*     */     //   28	719	10	$dirty	I
/*     */     //   0	747	0	checked	Z
/*     */     //   0	747	1	onClick	Lkotlin/jvm/functions/Function1;
/*     */     //   0	747	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	747	3	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	747	4	enabled	Z
/*     */     //   0	747	5	style	Lorg/jetbrains/jewel/ui/component/styling/ChipStyle;
/*     */     //   0	747	6	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	747	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	747	8	$changed	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void RadioButtonChip(boolean selected, @NotNull Function0 onClick, @Nullable Modifier modifier, @Nullable MutableInteractionSource interactionSource, boolean enabled, @Nullable ChipStyle style, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'onClick'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #6
/*     */     //   8: ldc 'content'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #7
/*     */     //   15: ldc_w -596107973
/*     */     //   18: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   23: astore #7
/*     */     //   25: iload #8
/*     */     //   27: istore #10
/*     */     //   29: iload #9
/*     */     //   31: iconst_1
/*     */     //   32: iand
/*     */     //   33: ifeq -> 46
/*     */     //   36: iload #10
/*     */     //   38: bipush #6
/*     */     //   40: ior
/*     */     //   41: istore #10
/*     */     //   43: goto -> 75
/*     */     //   46: iload #8
/*     */     //   48: bipush #6
/*     */     //   50: iand
/*     */     //   51: ifne -> 75
/*     */     //   54: iload #10
/*     */     //   56: aload #7
/*     */     //   58: iload_0
/*     */     //   59: invokeinterface changed : (Z)Z
/*     */     //   64: ifeq -> 71
/*     */     //   67: iconst_4
/*     */     //   68: goto -> 72
/*     */     //   71: iconst_2
/*     */     //   72: ior
/*     */     //   73: istore #10
/*     */     //   75: iload #9
/*     */     //   77: iconst_2
/*     */     //   78: iand
/*     */     //   79: ifeq -> 92
/*     */     //   82: iload #10
/*     */     //   84: bipush #48
/*     */     //   86: ior
/*     */     //   87: istore #10
/*     */     //   89: goto -> 123
/*     */     //   92: iload #8
/*     */     //   94: bipush #48
/*     */     //   96: iand
/*     */     //   97: ifne -> 123
/*     */     //   100: iload #10
/*     */     //   102: aload #7
/*     */     //   104: aload_1
/*     */     //   105: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   110: ifeq -> 118
/*     */     //   113: bipush #32
/*     */     //   115: goto -> 120
/*     */     //   118: bipush #16
/*     */     //   120: ior
/*     */     //   121: istore #10
/*     */     //   123: iload #9
/*     */     //   125: iconst_4
/*     */     //   126: iand
/*     */     //   127: ifeq -> 141
/*     */     //   130: iload #10
/*     */     //   132: sipush #384
/*     */     //   135: ior
/*     */     //   136: istore #10
/*     */     //   138: goto -> 175
/*     */     //   141: iload #8
/*     */     //   143: sipush #384
/*     */     //   146: iand
/*     */     //   147: ifne -> 175
/*     */     //   150: iload #10
/*     */     //   152: aload #7
/*     */     //   154: aload_2
/*     */     //   155: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   160: ifeq -> 169
/*     */     //   163: sipush #256
/*     */     //   166: goto -> 172
/*     */     //   169: sipush #128
/*     */     //   172: ior
/*     */     //   173: istore #10
/*     */     //   175: iload #9
/*     */     //   177: bipush #8
/*     */     //   179: iand
/*     */     //   180: ifeq -> 194
/*     */     //   183: iload #10
/*     */     //   185: sipush #3072
/*     */     //   188: ior
/*     */     //   189: istore #10
/*     */     //   191: goto -> 228
/*     */     //   194: iload #8
/*     */     //   196: sipush #3072
/*     */     //   199: iand
/*     */     //   200: ifne -> 228
/*     */     //   203: iload #10
/*     */     //   205: aload #7
/*     */     //   207: aload_3
/*     */     //   208: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   213: ifeq -> 222
/*     */     //   216: sipush #2048
/*     */     //   219: goto -> 225
/*     */     //   222: sipush #1024
/*     */     //   225: ior
/*     */     //   226: istore #10
/*     */     //   228: iload #9
/*     */     //   230: bipush #16
/*     */     //   232: iand
/*     */     //   233: ifeq -> 247
/*     */     //   236: iload #10
/*     */     //   238: sipush #24576
/*     */     //   241: ior
/*     */     //   242: istore #10
/*     */     //   244: goto -> 282
/*     */     //   247: iload #8
/*     */     //   249: sipush #24576
/*     */     //   252: iand
/*     */     //   253: ifne -> 282
/*     */     //   256: iload #10
/*     */     //   258: aload #7
/*     */     //   260: iload #4
/*     */     //   262: invokeinterface changed : (Z)Z
/*     */     //   267: ifeq -> 276
/*     */     //   270: sipush #16384
/*     */     //   273: goto -> 279
/*     */     //   276: sipush #8192
/*     */     //   279: ior
/*     */     //   280: istore #10
/*     */     //   282: iload #8
/*     */     //   284: ldc 196608
/*     */     //   286: iand
/*     */     //   287: ifne -> 322
/*     */     //   290: iload #10
/*     */     //   292: iload #9
/*     */     //   294: bipush #32
/*     */     //   296: iand
/*     */     //   297: ifne -> 317
/*     */     //   300: aload #7
/*     */     //   302: aload #5
/*     */     //   304: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   309: ifeq -> 317
/*     */     //   312: ldc 131072
/*     */     //   314: goto -> 319
/*     */     //   317: ldc 65536
/*     */     //   319: ior
/*     */     //   320: istore #10
/*     */     //   322: iload #9
/*     */     //   324: bipush #64
/*     */     //   326: iand
/*     */     //   327: ifeq -> 340
/*     */     //   330: iload #10
/*     */     //   332: ldc 1572864
/*     */     //   334: ior
/*     */     //   335: istore #10
/*     */     //   337: goto -> 372
/*     */     //   340: iload #8
/*     */     //   342: ldc 1572864
/*     */     //   344: iand
/*     */     //   345: ifne -> 372
/*     */     //   348: iload #10
/*     */     //   350: aload #7
/*     */     //   352: aload #6
/*     */     //   354: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   359: ifeq -> 367
/*     */     //   362: ldc 1048576
/*     */     //   364: goto -> 369
/*     */     //   367: ldc 524288
/*     */     //   369: ior
/*     */     //   370: istore #10
/*     */     //   372: iload #10
/*     */     //   374: ldc 599187
/*     */     //   376: iand
/*     */     //   377: ldc 599186
/*     */     //   379: if_icmpne -> 392
/*     */     //   382: aload #7
/*     */     //   384: invokeinterface getSkipping : ()Z
/*     */     //   389: ifne -> 704
/*     */     //   392: aload #7
/*     */     //   394: invokeinterface startDefaults : ()V
/*     */     //   399: iload #8
/*     */     //   401: iconst_1
/*     */     //   402: iand
/*     */     //   403: ifeq -> 416
/*     */     //   406: aload #7
/*     */     //   408: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   413: ifeq -> 564
/*     */     //   416: iload #9
/*     */     //   418: iconst_4
/*     */     //   419: iand
/*     */     //   420: ifeq -> 430
/*     */     //   423: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   426: checkcast androidx/compose/ui/Modifier
/*     */     //   429: astore_2
/*     */     //   430: iload #9
/*     */     //   432: bipush #8
/*     */     //   434: iand
/*     */     //   435: ifeq -> 523
/*     */     //   438: aload #7
/*     */     //   440: ldc_w 1574119618
/*     */     //   443: invokeinterface startReplaceGroup : (I)V
/*     */     //   448: aload #7
/*     */     //   450: astore #12
/*     */     //   452: iconst_0
/*     */     //   453: istore #13
/*     */     //   455: iconst_0
/*     */     //   456: istore #14
/*     */     //   458: aload #12
/*     */     //   460: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   465: astore #15
/*     */     //   467: iconst_0
/*     */     //   468: istore #16
/*     */     //   470: aload #15
/*     */     //   472: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   475: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   478: if_acmpne -> 503
/*     */     //   481: iconst_0
/*     */     //   482: istore #17
/*     */     //   484: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   487: astore #17
/*     */     //   489: aload #12
/*     */     //   491: aload #17
/*     */     //   493: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   498: aload #17
/*     */     //   500: goto -> 505
/*     */     //   503: aload #15
/*     */     //   505: nop
/*     */     //   506: nop
/*     */     //   507: nop
/*     */     //   508: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   511: astore #11
/*     */     //   513: aload #7
/*     */     //   515: invokeinterface endReplaceGroup : ()V
/*     */     //   520: aload #11
/*     */     //   522: astore_3
/*     */     //   523: iload #9
/*     */     //   525: bipush #16
/*     */     //   527: iand
/*     */     //   528: ifeq -> 534
/*     */     //   531: iconst_1
/*     */     //   532: istore #4
/*     */     //   534: iload #9
/*     */     //   536: bipush #32
/*     */     //   538: iand
/*     */     //   539: ifeq -> 586
/*     */     //   542: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   545: aload #7
/*     */     //   547: bipush #6
/*     */     //   549: invokestatic getChipStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ChipStyle;
/*     */     //   552: astore #5
/*     */     //   554: iload #10
/*     */     //   556: ldc -458753
/*     */     //   558: iand
/*     */     //   559: istore #10
/*     */     //   561: goto -> 586
/*     */     //   564: aload #7
/*     */     //   566: invokeinterface skipToGroupEnd : ()V
/*     */     //   571: iload #9
/*     */     //   573: bipush #32
/*     */     //   575: iand
/*     */     //   576: ifeq -> 586
/*     */     //   579: iload #10
/*     */     //   581: ldc -458753
/*     */     //   583: iand
/*     */     //   584: istore #10
/*     */     //   586: aload #7
/*     */     //   588: invokeinterface endDefaults : ()V
/*     */     //   593: invokestatic isTraceInProgress : ()Z
/*     */     //   596: ifeq -> 611
/*     */     //   599: ldc_w -596107973
/*     */     //   602: iload #10
/*     */     //   604: iconst_m1
/*     */     //   605: ldc_w 'org.jetbrains.jewel.ui.component.RadioButtonChip (Chip.kt:108)'
/*     */     //   608: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   611: aload_3
/*     */     //   612: iload #4
/*     */     //   614: iload_0
/*     */     //   615: aload #5
/*     */     //   617: getstatic androidx/compose/ui/semantics/Role.Companion : Landroidx/compose/ui/semantics/Role$Companion;
/*     */     //   620: invokevirtual getRadioButton-o7Vup1c : ()I
/*     */     //   623: istore #11
/*     */     //   625: aload_2
/*     */     //   626: iload_0
/*     */     //   627: aload_3
/*     */     //   628: aconst_null
/*     */     //   629: iload #4
/*     */     //   631: iload #11
/*     */     //   633: invokestatic box-impl : (I)Landroidx/compose/ui/semantics/Role;
/*     */     //   636: aload_1
/*     */     //   637: invokestatic selectable-O2vRcR0 : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;
/*     */     //   640: aload #6
/*     */     //   642: aload #7
/*     */     //   644: bipush #14
/*     */     //   646: iload #10
/*     */     //   648: bipush #9
/*     */     //   650: ishr
/*     */     //   651: iand
/*     */     //   652: bipush #112
/*     */     //   654: iload #10
/*     */     //   656: bipush #9
/*     */     //   658: ishr
/*     */     //   659: iand
/*     */     //   660: ior
/*     */     //   661: sipush #896
/*     */     //   664: iload #10
/*     */     //   666: bipush #6
/*     */     //   668: ishl
/*     */     //   669: iand
/*     */     //   670: ior
/*     */     //   671: sipush #7168
/*     */     //   674: iload #10
/*     */     //   676: bipush #6
/*     */     //   678: ishr
/*     */     //   679: iand
/*     */     //   680: ior
/*     */     //   681: ldc 458752
/*     */     //   683: iload #10
/*     */     //   685: iconst_3
/*     */     //   686: ishr
/*     */     //   687: iand
/*     */     //   688: ior
/*     */     //   689: invokestatic ChipImpl : (Landroidx/compose/foundation/interaction/MutableInteractionSource;ZZLorg/jetbrains/jewel/ui/component/styling/ChipStyle;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   692: invokestatic isTraceInProgress : ()Z
/*     */     //   695: ifeq -> 711
/*     */     //   698: invokestatic traceEventEnd : ()V
/*     */     //   701: goto -> 711
/*     */     //   704: aload #7
/*     */     //   706: invokeinterface skipToGroupEnd : ()V
/*     */     //   711: aload #7
/*     */     //   713: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   718: dup
/*     */     //   719: ifnull -> 749
/*     */     //   722: iload_0
/*     */     //   723: aload_1
/*     */     //   724: aload_2
/*     */     //   725: aload_3
/*     */     //   726: iload #4
/*     */     //   728: aload #5
/*     */     //   730: aload #6
/*     */     //   732: iload #8
/*     */     //   734: iload #9
/*     */     //   736: <illegal opcode> invoke : (ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLorg/jetbrains/jewel/ui/component/styling/ChipStyle;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*     */     //   741: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   746: goto -> 750
/*     */     //   749: pop
/*     */     //   750: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #109	-> 13
/*     */     //   #104	-> 423
/*     */     //   #105	-> 438
/*     */     //   #268	-> 458
/*     */     //   #269	-> 470
/*     */     //   #270	-> 481
/*     */     //   #105	-> 484
/*     */     //   #270	-> 487
/*     */     //   #271	-> 489
/*     */     //   #272	-> 498
/*     */     //   #273	-> 503
/*     */     //   #269	-> 505
/*     */     //   #268	-> 506
/*     */     //   #268	-> 507
/*     */     //   #105	-> 508
/*     */     //   #106	-> 531
/*     */     //   #107	-> 542
/*     */     //   #109	-> 608
/*     */     //   #111	-> 611
/*     */     //   #112	-> 612
/*     */     //   #113	-> 614
/*     */     //   #114	-> 615
/*     */     //   #119	-> 617
/*     */     //   #116	-> 625
/*     */     //   #122	-> 626
/*     */     //   #120	-> 627
/*     */     //   #121	-> 628
/*     */     //   #118	-> 629
/*     */     //   #119	-> 631
/*     */     //   #117	-> 636
/*     */     //   #116	-> 637
/*     */     //   #124	-> 640
/*     */     //   #110	-> 689
/*     */     //   #126	-> 704
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   484	3	17	$i$a$-cache-ChipKt$RadioButtonChip$1	I
/*     */     //   489	11	17	value$iv	Ljava/lang/Object;
/*     */     //   470	36	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   467	39	15	it$iv	Ljava/lang/Object;
/*     */     //   458	50	14	$i$f$cache	I
/*     */     //   455	53	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   455	53	13	invalid$iv	Z
/*     */     //   29	722	10	$dirty	I
/*     */     //   0	751	0	selected	Z
/*     */     //   0	751	1	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	751	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	751	3	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	751	4	enabled	Z
/*     */     //   0	751	5	style	Lorg/jetbrains/jewel/ui/component/styling/ChipStyle;
/*     */     //   0	751	6	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	751	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	751	8	$changed	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   private static final void ChipImpl(MutableInteractionSource interactionSource, boolean enabled, boolean selected, ChipStyle style, Modifier modifier, Function2 content, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: ldc_w 731251610
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #6
/*     */     //   12: iload #7
/*     */     //   14: istore #8
/*     */     //   16: iload #7
/*     */     //   18: bipush #6
/*     */     //   20: iand
/*     */     //   21: ifne -> 45
/*     */     //   24: iload #8
/*     */     //   26: aload #6
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore #8
/*     */     //   45: iload #7
/*     */     //   47: bipush #48
/*     */     //   49: iand
/*     */     //   50: ifne -> 76
/*     */     //   53: iload #8
/*     */     //   55: aload #6
/*     */     //   57: iload_1
/*     */     //   58: invokeinterface changed : (Z)Z
/*     */     //   63: ifeq -> 71
/*     */     //   66: bipush #32
/*     */     //   68: goto -> 73
/*     */     //   71: bipush #16
/*     */     //   73: ior
/*     */     //   74: istore #8
/*     */     //   76: iload #7
/*     */     //   78: sipush #384
/*     */     //   81: iand
/*     */     //   82: ifne -> 110
/*     */     //   85: iload #8
/*     */     //   87: aload #6
/*     */     //   89: iload_2
/*     */     //   90: invokeinterface changed : (Z)Z
/*     */     //   95: ifeq -> 104
/*     */     //   98: sipush #256
/*     */     //   101: goto -> 107
/*     */     //   104: sipush #128
/*     */     //   107: ior
/*     */     //   108: istore #8
/*     */     //   110: iload #7
/*     */     //   112: sipush #3072
/*     */     //   115: iand
/*     */     //   116: ifne -> 144
/*     */     //   119: iload #8
/*     */     //   121: aload #6
/*     */     //   123: aload_3
/*     */     //   124: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   129: ifeq -> 138
/*     */     //   132: sipush #2048
/*     */     //   135: goto -> 141
/*     */     //   138: sipush #1024
/*     */     //   141: ior
/*     */     //   142: istore #8
/*     */     //   144: iload #7
/*     */     //   146: sipush #24576
/*     */     //   149: iand
/*     */     //   150: ifne -> 179
/*     */     //   153: iload #8
/*     */     //   155: aload #6
/*     */     //   157: aload #4
/*     */     //   159: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   164: ifeq -> 173
/*     */     //   167: sipush #16384
/*     */     //   170: goto -> 176
/*     */     //   173: sipush #8192
/*     */     //   176: ior
/*     */     //   177: istore #8
/*     */     //   179: iload #7
/*     */     //   181: ldc 196608
/*     */     //   183: iand
/*     */     //   184: ifne -> 211
/*     */     //   187: iload #8
/*     */     //   189: aload #6
/*     */     //   191: aload #5
/*     */     //   193: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   198: ifeq -> 206
/*     */     //   201: ldc 131072
/*     */     //   203: goto -> 208
/*     */     //   206: ldc 65536
/*     */     //   208: ior
/*     */     //   209: istore #8
/*     */     //   211: iload #8
/*     */     //   213: ldc_w 74899
/*     */     //   216: iand
/*     */     //   217: ldc_w 74898
/*     */     //   220: if_icmpne -> 233
/*     */     //   223: aload #6
/*     */     //   225: invokeinterface getSkipping : ()Z
/*     */     //   230: ifne -> 1581
/*     */     //   233: invokestatic isTraceInProgress : ()Z
/*     */     //   236: ifeq -> 251
/*     */     //   239: ldc_w 731251610
/*     */     //   242: iload #8
/*     */     //   244: iconst_m1
/*     */     //   245: ldc_w 'org.jetbrains.jewel.ui.component.ChipImpl (Chip.kt:135)'
/*     */     //   248: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   251: aload #6
/*     */     //   253: ldc_w -533366066
/*     */     //   256: invokeinterface startReplaceGroup : (I)V
/*     */     //   261: aload #6
/*     */     //   263: astore #11
/*     */     //   265: iload #8
/*     */     //   267: bipush #14
/*     */     //   269: iand
/*     */     //   270: iconst_4
/*     */     //   271: if_icmpne -> 278
/*     */     //   274: iconst_1
/*     */     //   275: goto -> 279
/*     */     //   278: iconst_0
/*     */     //   279: istore #12
/*     */     //   281: nop
/*     */     //   282: iconst_0
/*     */     //   283: istore #13
/*     */     //   285: aload #11
/*     */     //   287: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   292: astore #14
/*     */     //   294: iconst_0
/*     */     //   295: istore #15
/*     */     //   297: iload #12
/*     */     //   299: ifne -> 313
/*     */     //   302: aload #14
/*     */     //   304: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   307: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   310: if_acmpne -> 356
/*     */     //   313: iconst_0
/*     */     //   314: istore #16
/*     */     //   316: getstatic org/jetbrains/jewel/ui/component/ChipState.Companion : Lorg/jetbrains/jewel/ui/component/ChipState$Companion;
/*     */     //   319: iload_1
/*     */     //   320: iconst_0
/*     */     //   321: iload_2
/*     */     //   322: iconst_0
/*     */     //   323: iconst_0
/*     */     //   324: iconst_0
/*     */     //   325: bipush #58
/*     */     //   327: aconst_null
/*     */     //   328: invokestatic of-JT_Lw10$default : (Lorg/jetbrains/jewel/ui/component/ChipState$Companion;ZZZZZZILjava/lang/Object;)J
/*     */     //   331: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/ChipState;
/*     */     //   334: aconst_null
/*     */     //   335: iconst_2
/*     */     //   336: aconst_null
/*     */     //   337: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   340: astore #17
/*     */     //   342: aload #11
/*     */     //   344: aload #17
/*     */     //   346: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   351: aload #17
/*     */     //   353: goto -> 358
/*     */     //   356: aload #14
/*     */     //   358: nop
/*     */     //   359: nop
/*     */     //   360: nop
/*     */     //   361: checkcast androidx/compose/runtime/MutableState
/*     */     //   364: astore #10
/*     */     //   366: aload #6
/*     */     //   368: invokeinterface endReplaceGroup : ()V
/*     */     //   373: aload #10
/*     */     //   375: astore #9
/*     */     //   377: aload #6
/*     */     //   379: ldc_w -533362676
/*     */     //   382: invokeinterface startReplaceGroup : (I)V
/*     */     //   387: aload #6
/*     */     //   389: astore #10
/*     */     //   391: iload #8
/*     */     //   393: bipush #112
/*     */     //   395: iand
/*     */     //   396: bipush #32
/*     */     //   398: if_icmpne -> 405
/*     */     //   401: iconst_1
/*     */     //   402: goto -> 406
/*     */     //   405: iconst_0
/*     */     //   406: iload #8
/*     */     //   408: sipush #896
/*     */     //   411: iand
/*     */     //   412: sipush #256
/*     */     //   415: if_icmpne -> 422
/*     */     //   418: iconst_1
/*     */     //   419: goto -> 423
/*     */     //   422: iconst_0
/*     */     //   423: ior
/*     */     //   424: istore #11
/*     */     //   426: nop
/*     */     //   427: iconst_0
/*     */     //   428: istore #12
/*     */     //   430: aload #10
/*     */     //   432: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   437: astore #13
/*     */     //   439: iconst_0
/*     */     //   440: istore #14
/*     */     //   442: iload #11
/*     */     //   444: ifne -> 458
/*     */     //   447: aload #13
/*     */     //   449: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   452: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   455: if_acmpne -> 502
/*     */     //   458: iconst_0
/*     */     //   459: istore #15
/*     */     //   461: aload #9
/*     */     //   463: aload #9
/*     */     //   465: invokestatic ChipImpl$lambda$9 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   468: iload_1
/*     */     //   469: iconst_0
/*     */     //   470: iload_2
/*     */     //   471: iconst_0
/*     */     //   472: iconst_0
/*     */     //   473: iconst_0
/*     */     //   474: bipush #58
/*     */     //   476: aconst_null
/*     */     //   477: invokestatic copy-JT_Lw10$default : (JZZZZZZILjava/lang/Object;)J
/*     */     //   480: invokestatic ChipImpl$lambda$10 : (Landroidx/compose/runtime/MutableState;J)V
/*     */     //   483: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   486: astore #16
/*     */     //   488: aload #10
/*     */     //   490: aload #16
/*     */     //   492: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   497: aload #16
/*     */     //   499: goto -> 504
/*     */     //   502: aload #13
/*     */     //   504: nop
/*     */     //   505: nop
/*     */     //   506: nop
/*     */     //   507: pop
/*     */     //   508: aload #6
/*     */     //   510: invokeinterface endReplaceGroup : ()V
/*     */     //   515: aload_0
/*     */     //   516: aload #6
/*     */     //   518: ldc_w -533357652
/*     */     //   521: invokeinterface startReplaceGroup : (I)V
/*     */     //   526: aload #6
/*     */     //   528: astore #11
/*     */     //   530: iload #8
/*     */     //   532: bipush #14
/*     */     //   534: iand
/*     */     //   535: iconst_4
/*     */     //   536: if_icmpne -> 543
/*     */     //   539: iconst_1
/*     */     //   540: goto -> 544
/*     */     //   543: iconst_0
/*     */     //   544: aload #6
/*     */     //   546: aload #9
/*     */     //   548: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   553: ior
/*     */     //   554: istore #12
/*     */     //   556: iconst_0
/*     */     //   557: istore #13
/*     */     //   559: aload #11
/*     */     //   561: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   566: astore #14
/*     */     //   568: iconst_0
/*     */     //   569: istore #15
/*     */     //   571: iload #12
/*     */     //   573: ifne -> 587
/*     */     //   576: aload #14
/*     */     //   578: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   581: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   584: if_acmpne -> 625
/*     */     //   587: astore #60
/*     */     //   589: iconst_0
/*     */     //   590: istore #16
/*     */     //   592: new org/jetbrains/jewel/ui/component/ChipKt$ChipImpl$2$1
/*     */     //   595: dup
/*     */     //   596: aload_0
/*     */     //   597: aload #9
/*     */     //   599: aconst_null
/*     */     //   600: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   603: checkcast kotlin/jvm/functions/Function2
/*     */     //   606: aload #60
/*     */     //   608: swap
/*     */     //   609: astore #17
/*     */     //   611: aload #11
/*     */     //   613: aload #17
/*     */     //   615: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   620: aload #17
/*     */     //   622: goto -> 627
/*     */     //   625: aload #14
/*     */     //   627: nop
/*     */     //   628: nop
/*     */     //   629: nop
/*     */     //   630: checkcast kotlin/jvm/functions/Function2
/*     */     //   633: astore #10
/*     */     //   635: aload #6
/*     */     //   637: invokeinterface endReplaceGroup : ()V
/*     */     //   642: aload #10
/*     */     //   644: aload #6
/*     */     //   646: bipush #14
/*     */     //   648: iload #8
/*     */     //   650: iand
/*     */     //   651: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   654: aload_3
/*     */     //   655: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ChipMetrics;
/*     */     //   658: invokevirtual getCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   661: invokestatic RoundedCornerShape : (Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   664: astore #10
/*     */     //   666: aload_3
/*     */     //   667: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/ChipColors;
/*     */     //   670: astore #11
/*     */     //   672: aload #11
/*     */     //   674: aload #9
/*     */     //   676: invokestatic ChipImpl$lambda$9 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   679: aload #6
/*     */     //   681: iconst_0
/*     */     //   682: invokevirtual borderFor-EPQOS-w : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   685: astore #12
/*     */     //   687: aload #9
/*     */     //   689: invokestatic ChipImpl$lambda$9 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   692: invokestatic isSelected-impl : (J)Z
/*     */     //   695: ifeq -> 708
/*     */     //   698: aload_3
/*     */     //   699: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ChipMetrics;
/*     */     //   702: invokevirtual getBorderWidthSelected-D9Ej5fM : ()F
/*     */     //   705: goto -> 715
/*     */     //   708: aload_3
/*     */     //   709: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ChipMetrics;
/*     */     //   712: invokevirtual getBorderWidth-D9Ej5fM : ()F
/*     */     //   715: fstore #13
/*     */     //   717: aload #4
/*     */     //   719: aload #11
/*     */     //   721: aload #9
/*     */     //   723: invokestatic ChipImpl$lambda$9 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   726: aload #6
/*     */     //   728: iconst_0
/*     */     //   729: invokevirtual backgroundFor-EPQOS-w : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   732: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   737: checkcast androidx/compose/ui/graphics/Brush
/*     */     //   740: aload #10
/*     */     //   742: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   745: fconst_0
/*     */     //   746: iconst_4
/*     */     //   747: aconst_null
/*     */     //   748: invokestatic background$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   751: astore #15
/*     */     //   753: aload #9
/*     */     //   755: invokestatic ChipImpl$lambda$9 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   758: invokestatic isFocused-impl : (J)Z
/*     */     //   761: ifne -> 768
/*     */     //   764: iconst_1
/*     */     //   765: goto -> 769
/*     */     //   768: iconst_0
/*     */     //   769: istore #16
/*     */     //   771: iconst_0
/*     */     //   772: istore #17
/*     */     //   774: iload #16
/*     */     //   776: ifeq -> 813
/*     */     //   779: aload #15
/*     */     //   781: astore #18
/*     */     //   783: iconst_0
/*     */     //   784: istore #19
/*     */     //   786: aload #18
/*     */     //   788: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Center : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   791: fload #13
/*     */     //   793: aload #12
/*     */     //   795: invokestatic ChipImpl$lambda$13 : (Landroidx/compose/runtime/State;)J
/*     */     //   798: aload #10
/*     */     //   800: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   803: fconst_0
/*     */     //   804: bipush #16
/*     */     //   806: aconst_null
/*     */     //   807: invokestatic border-QWjY48E$default : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FJLandroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   810: goto -> 815
/*     */     //   813: aload #15
/*     */     //   815: aload #9
/*     */     //   817: invokestatic ChipImpl$lambda$9 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   820: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/ChipState;
/*     */     //   823: aload #10
/*     */     //   825: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   828: aconst_null
/*     */     //   829: fconst_0
/*     */     //   830: fconst_0
/*     */     //   831: aload #6
/*     */     //   833: iconst_0
/*     */     //   834: bipush #28
/*     */     //   836: invokestatic focusOutline-AGcomas : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;Landroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
/*     */     //   839: aload_3
/*     */     //   840: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ChipMetrics;
/*     */     //   843: invokevirtual getPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   846: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*     */     //   849: astore #14
/*     */     //   851: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   854: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   857: astore #15
/*     */     //   859: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   862: invokevirtual getCenter : ()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   865: astore #16
/*     */     //   867: sipush #432
/*     */     //   870: istore #17
/*     */     //   872: nop
/*     */     //   873: iconst_0
/*     */     //   874: istore #18
/*     */     //   876: aload #6
/*     */     //   878: ldc_w 693286680
/*     */     //   881: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   884: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   887: aload #16
/*     */     //   889: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */     //   892: aload #15
/*     */     //   894: aload #6
/*     */     //   896: bipush #14
/*     */     //   898: iload #17
/*     */     //   900: iconst_3
/*     */     //   901: ishr
/*     */     //   902: iand
/*     */     //   903: bipush #112
/*     */     //   905: iload #17
/*     */     //   907: iconst_3
/*     */     //   908: ishr
/*     */     //   909: iand
/*     */     //   910: ior
/*     */     //   911: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   914: astore #19
/*     */     //   916: bipush #112
/*     */     //   918: iload #17
/*     */     //   920: iconst_3
/*     */     //   921: ishl
/*     */     //   922: iand
/*     */     //   923: istore #20
/*     */     //   925: nop
/*     */     //   926: iconst_0
/*     */     //   927: istore #21
/*     */     //   929: aload #6
/*     */     //   931: ldc_w -1323940314
/*     */     //   934: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   937: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   940: aload #6
/*     */     //   942: iconst_0
/*     */     //   943: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   946: istore #22
/*     */     //   948: aload #6
/*     */     //   950: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   955: astore #23
/*     */     //   957: aload #6
/*     */     //   959: aload #14
/*     */     //   961: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   964: astore #24
/*     */     //   966: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   969: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   972: astore #25
/*     */     //   974: bipush #6
/*     */     //   976: sipush #896
/*     */     //   979: iload #20
/*     */     //   981: bipush #6
/*     */     //   983: ishl
/*     */     //   984: iand
/*     */     //   985: ior
/*     */     //   986: istore #26
/*     */     //   988: nop
/*     */     //   989: iconst_0
/*     */     //   990: istore #27
/*     */     //   992: aload #6
/*     */     //   994: ldc_w -692256719
/*     */     //   997: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1000: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1003: aload #6
/*     */     //   1005: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1010: instanceof androidx/compose/runtime/Applier
/*     */     //   1013: ifne -> 1019
/*     */     //   1016: invokestatic invalidApplier : ()V
/*     */     //   1019: aload #6
/*     */     //   1021: invokeinterface startReusableNode : ()V
/*     */     //   1026: aload #6
/*     */     //   1028: invokeinterface getInserting : ()Z
/*     */     //   1033: ifeq -> 1048
/*     */     //   1036: aload #6
/*     */     //   1038: aload #25
/*     */     //   1040: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1045: goto -> 1055
/*     */     //   1048: aload #6
/*     */     //   1050: invokeinterface useNode : ()V
/*     */     //   1055: aload #6
/*     */     //   1057: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1060: astore #28
/*     */     //   1062: iconst_0
/*     */     //   1063: istore #29
/*     */     //   1065: aload #28
/*     */     //   1067: aload #19
/*     */     //   1069: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1072: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1075: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1078: aload #28
/*     */     //   1080: aload #23
/*     */     //   1082: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1085: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1088: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1091: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1094: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1097: astore #30
/*     */     //   1099: iconst_0
/*     */     //   1100: istore #31
/*     */     //   1102: aload #28
/*     */     //   1104: astore #32
/*     */     //   1106: iconst_0
/*     */     //   1107: istore #33
/*     */     //   1109: aload #32
/*     */     //   1111: invokeinterface getInserting : ()Z
/*     */     //   1116: ifne -> 1137
/*     */     //   1119: aload #32
/*     */     //   1121: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1126: iload #22
/*     */     //   1128: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1131: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1134: ifne -> 1163
/*     */     //   1137: aload #32
/*     */     //   1139: iload #22
/*     */     //   1141: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1144: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1149: aload #28
/*     */     //   1151: iload #22
/*     */     //   1153: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1156: aload #30
/*     */     //   1158: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1163: nop
/*     */     //   1164: nop
/*     */     //   1165: nop
/*     */     //   1166: aload #28
/*     */     //   1168: aload #24
/*     */     //   1170: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1173: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1176: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1179: nop
/*     */     //   1180: nop
/*     */     //   1181: aload #6
/*     */     //   1183: bipush #14
/*     */     //   1185: iload #26
/*     */     //   1187: bipush #6
/*     */     //   1189: ishr
/*     */     //   1190: iand
/*     */     //   1191: istore #34
/*     */     //   1193: astore #35
/*     */     //   1195: iconst_0
/*     */     //   1196: istore #36
/*     */     //   1198: aload #35
/*     */     //   1200: ldc_w -407840262
/*     */     //   1203: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   1206: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1209: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   1212: aload #35
/*     */     //   1214: bipush #6
/*     */     //   1216: bipush #112
/*     */     //   1218: iload #17
/*     */     //   1220: bipush #6
/*     */     //   1222: ishr
/*     */     //   1223: iand
/*     */     //   1224: ior
/*     */     //   1225: istore #37
/*     */     //   1227: astore #38
/*     */     //   1229: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   1232: astore #39
/*     */     //   1234: iconst_0
/*     */     //   1235: istore #40
/*     */     //   1237: aload #38
/*     */     //   1239: ldc_w 431537617
/*     */     //   1242: invokeinterface startReplaceGroup : (I)V
/*     */     //   1247: aload #11
/*     */     //   1249: aload #9
/*     */     //   1251: invokestatic ChipImpl$lambda$9 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1254: aload #38
/*     */     //   1256: iconst_0
/*     */     //   1257: invokevirtual contentFor-EPQOS-w : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1260: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   1265: checkcast androidx/compose/ui/graphics/Color
/*     */     //   1268: invokevirtual unbox-impl : ()J
/*     */     //   1271: lstore #41
/*     */     //   1273: iconst_0
/*     */     //   1274: istore #43
/*     */     //   1276: lload #41
/*     */     //   1278: lstore #44
/*     */     //   1280: iconst_0
/*     */     //   1281: istore #46
/*     */     //   1283: lload #44
/*     */     //   1285: ldc2_w 16
/*     */     //   1288: lcmp
/*     */     //   1289: ifeq -> 1296
/*     */     //   1292: iconst_1
/*     */     //   1293: goto -> 1297
/*     */     //   1296: iconst_0
/*     */     //   1297: ifeq -> 1305
/*     */     //   1300: lload #41
/*     */     //   1302: goto -> 1358
/*     */     //   1305: iconst_0
/*     */     //   1306: istore #47
/*     */     //   1308: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1311: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   1314: astore #48
/*     */     //   1316: iconst_0
/*     */     //   1317: istore #49
/*     */     //   1319: iconst_0
/*     */     //   1320: istore #50
/*     */     //   1322: aload #38
/*     */     //   1324: ldc_w 2023513938
/*     */     //   1327: ldc_w 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   1330: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1333: aload #38
/*     */     //   1335: aload #48
/*     */     //   1337: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   1342: astore #51
/*     */     //   1344: aload #38
/*     */     //   1346: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1349: aload #51
/*     */     //   1351: checkcast androidx/compose/ui/graphics/Color
/*     */     //   1354: invokevirtual unbox-impl : ()J
/*     */     //   1357: nop
/*     */     //   1358: lstore #52
/*     */     //   1360: aload #38
/*     */     //   1362: invokeinterface endReplaceGroup : ()V
/*     */     //   1367: lload #52
/*     */     //   1369: lstore #54
/*     */     //   1371: iconst_2
/*     */     //   1372: anewarray androidx/compose/runtime/ProvidedValue
/*     */     //   1375: astore #56
/*     */     //   1377: aload #56
/*     */     //   1379: iconst_0
/*     */     //   1380: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1383: lload #54
/*     */     //   1385: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*     */     //   1388: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   1391: aastore
/*     */     //   1392: aload #56
/*     */     //   1394: iconst_1
/*     */     //   1395: invokestatic getLocalTextStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1398: invokestatic getLocalTextStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1401: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   1404: astore #57
/*     */     //   1406: iconst_0
/*     */     //   1407: istore #58
/*     */     //   1409: iconst_0
/*     */     //   1410: istore #59
/*     */     //   1412: aload #38
/*     */     //   1414: ldc_w 2023513938
/*     */     //   1417: ldc_w 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   1420: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1423: aload #38
/*     */     //   1425: aload #57
/*     */     //   1427: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   1432: astore #43
/*     */     //   1434: aload #38
/*     */     //   1436: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1439: aload #43
/*     */     //   1441: checkcast androidx/compose/ui/text/TextStyle
/*     */     //   1444: aload #11
/*     */     //   1446: aload #9
/*     */     //   1448: invokestatic ChipImpl$lambda$9 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1451: aload #38
/*     */     //   1453: iconst_0
/*     */     //   1454: invokevirtual contentFor-EPQOS-w : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1457: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   1462: checkcast androidx/compose/ui/graphics/Color
/*     */     //   1465: invokevirtual unbox-impl : ()J
/*     */     //   1468: lconst_0
/*     */     //   1469: aconst_null
/*     */     //   1470: aconst_null
/*     */     //   1471: aconst_null
/*     */     //   1472: aconst_null
/*     */     //   1473: aconst_null
/*     */     //   1474: lconst_0
/*     */     //   1475: aconst_null
/*     */     //   1476: aconst_null
/*     */     //   1477: aconst_null
/*     */     //   1478: lconst_0
/*     */     //   1479: aconst_null
/*     */     //   1480: aconst_null
/*     */     //   1481: aconst_null
/*     */     //   1482: iconst_0
/*     */     //   1483: iconst_0
/*     */     //   1484: lconst_0
/*     */     //   1485: aconst_null
/*     */     //   1486: aconst_null
/*     */     //   1487: aconst_null
/*     */     //   1488: iconst_0
/*     */     //   1489: iconst_0
/*     */     //   1490: aconst_null
/*     */     //   1491: ldc_w 16777214
/*     */     //   1494: aconst_null
/*     */     //   1495: invokestatic copy-p1EtxEg$default : (Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;
/*     */     //   1498: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   1501: aastore
/*     */     //   1502: aload #56
/*     */     //   1504: ldc_w 707017662
/*     */     //   1507: iconst_1
/*     */     //   1508: new org/jetbrains/jewel/ui/component/ChipKt$ChipImpl$4$1
/*     */     //   1511: dup
/*     */     //   1512: aload #5
/*     */     //   1514: invokespecial <init> : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1517: aload #38
/*     */     //   1519: bipush #54
/*     */     //   1521: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1524: checkcast kotlin/jvm/functions/Function2
/*     */     //   1527: aload #38
/*     */     //   1529: bipush #48
/*     */     //   1531: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*     */     //   1534: ior
/*     */     //   1535: invokestatic CompositionLocalProvider : ([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1538: nop
/*     */     //   1539: aload #35
/*     */     //   1541: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1544: aload #6
/*     */     //   1546: invokeinterface endNode : ()V
/*     */     //   1551: aload #6
/*     */     //   1553: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1556: nop
/*     */     //   1557: aload #6
/*     */     //   1559: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1562: nop
/*     */     //   1563: aload #6
/*     */     //   1565: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1568: nop
/*     */     //   1569: invokestatic isTraceInProgress : ()Z
/*     */     //   1572: ifeq -> 1588
/*     */     //   1575: invokestatic traceEventEnd : ()V
/*     */     //   1578: goto -> 1588
/*     */     //   1581: aload #6
/*     */     //   1583: invokeinterface skipToGroupEnd : ()V
/*     */     //   1588: aload #6
/*     */     //   1590: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1595: dup
/*     */     //   1596: ifnull -> 1622
/*     */     //   1599: aload_0
/*     */     //   1600: iload_1
/*     */     //   1601: iload_2
/*     */     //   1602: aload_3
/*     */     //   1603: aload #4
/*     */     //   1605: aload #5
/*     */     //   1607: iload #7
/*     */     //   1609: <illegal opcode> invoke : (Landroidx/compose/foundation/interaction/MutableInteractionSource;ZZLorg/jetbrains/jewel/ui/component/styling/ChipStyle;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;I)Lkotlin/jvm/functions/Function2;
/*     */     //   1614: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1619: goto -> 1623
/*     */     //   1622: pop
/*     */     //   1623: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #136	-> 0
/*     */     //   #138	-> 281
/*     */     //   #274	-> 285
/*     */     //   #275	-> 297
/*     */     //   #276	-> 313
/*     */     //   #138	-> 316
/*     */     //   #276	-> 340
/*     */     //   #277	-> 342
/*     */     //   #278	-> 351
/*     */     //   #279	-> 356
/*     */     //   #275	-> 358
/*     */     //   #274	-> 359
/*     */     //   #274	-> 360
/*     */     //   #138	-> 361
/*     */     //   #137	-> 375
/*     */     //   #140	-> 426
/*     */     //   #280	-> 430
/*     */     //   #281	-> 442
/*     */     //   #282	-> 458
/*     */     //   #140	-> 461
/*     */     //   #282	-> 486
/*     */     //   #283	-> 488
/*     */     //   #284	-> 497
/*     */     //   #285	-> 502
/*     */     //   #281	-> 504
/*     */     //   #280	-> 505
/*     */     //   #280	-> 506
/*     */     //   #142	-> 515
/*     */     //   #286	-> 559
/*     */     //   #287	-> 571
/*     */     //   #288	-> 587
/*     */     //   #142	-> 592
/*     */     //   #288	-> 609
/*     */     //   #289	-> 611
/*     */     //   #290	-> 620
/*     */     //   #291	-> 625
/*     */     //   #287	-> 627
/*     */     //   #286	-> 628
/*     */     //   #286	-> 629
/*     */     //   #142	-> 630
/*     */     //   #156	-> 654
/*     */     //   #157	-> 666
/*     */     //   #158	-> 672
/*     */     //   #161	-> 687
/*     */     //   #162	-> 698
/*     */     //   #164	-> 708
/*     */     //   #161	-> 715
/*     */     //   #160	-> 715
/*     */     //   #169	-> 717
/*     */     //   #170	-> 719
/*     */     //   #171	-> 753
/*     */     //   #292	-> 774
/*     */     //   #171	-> 786
/*     */     //   #292	-> 810
/*     */     //   #172	-> 815
/*     */     //   #173	-> 839
/*     */     //   #174	-> 851
/*     */     //   #175	-> 859
/*     */     //   #167	-> 872
/*     */     //   #293	-> 884
/*     */     //   #294	-> 887
/*     */     //   #295	-> 925
/*     */     //   #296	-> 937
/*     */     //   #297	-> 943
/*     */     //   #298	-> 950
/*     */     //   #299	-> 959
/*     */     //   #301	-> 966
/*     */     //   #300	-> 988
/*     */     //   #302	-> 1000
/*     */     //   #303	-> 1003
/*     */     //   #304	-> 1021
/*     */     //   #305	-> 1026
/*     */     //   #306	-> 1038
/*     */     //   #308	-> 1050
/*     */     //   #310	-> 1055
/*     */     //   #311	-> 1065
/*     */     //   #312	-> 1078
/*     */     //   #314	-> 1091
/*     */     //   #315	-> 1102
/*     */     //   #316	-> 1109
/*     */     //   #317	-> 1137
/*     */     //   #318	-> 1149
/*     */     //   #320	-> 1163
/*     */     //   #315	-> 1164
/*     */     //   #320	-> 1165
/*     */     //   #321	-> 1166
/*     */     //   #322	-> 1179
/*     */     //   #310	-> 1180
/*     */     //   #323	-> 1181
/*     */     //   #324	-> 1206
/*     */     //   #177	-> 1247
/*     */     //   #325	-> 1276
/*     */     //   #326	-> 1283
/*     */     //   #325	-> 1297
/*     */     //   #177	-> 1308
/*     */     //   #327	-> 1330
/*     */     //   #177	-> 1351
/*     */     //   #325	-> 1357
/*     */     //   #177	-> 1358
/*     */     //   #180	-> 1371
/*     */     //   #181	-> 1395
/*     */     //   #328	-> 1420
/*     */     //   #181	-> 1444
/*     */     //   #180	-> 1502
/*     */     //   #182	-> 1504
/*     */     //   #179	-> 1535
/*     */     //   #185	-> 1538
/*     */     //   #324	-> 1539
/*     */     //   #323	-> 1544
/*     */     //   #329	-> 1546
/*     */     //   #302	-> 1553
/*     */     //   #330	-> 1556
/*     */     //   #296	-> 1559
/*     */     //   #331	-> 1562
/*     */     //   #293	-> 1565
/*     */     //   #332	-> 1568
/*     */     //   #186	-> 1581
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   316	24	16	$i$a$-cache-ChipKt$ChipImpl$chipState$2	I
/*     */     //   342	11	17	value$iv	Ljava/lang/Object;
/*     */     //   297	62	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   294	65	14	it$iv	Ljava/lang/Object;
/*     */     //   285	76	13	$i$f$cache	I
/*     */     //   282	79	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   282	79	12	invalid$iv	Z
/*     */     //   461	22	15	$i$a$-cache-ChipKt$ChipImpl$1	I
/*     */     //   488	11	16	value$iv	Ljava/lang/Object;
/*     */     //   442	63	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   439	66	13	it$iv	Ljava/lang/Object;
/*     */     //   430	77	12	$i$f$cache	I
/*     */     //   427	80	10	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   427	80	11	invalid$iv	Z
/*     */     //   592	14	16	$i$a$-cache-ChipKt$ChipImpl$2	I
/*     */     //   611	11	17	value$iv	Ljava/lang/Object;
/*     */     //   571	57	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   568	60	14	it$iv	Ljava/lang/Object;
/*     */     //   559	71	13	$i$f$cache	I
/*     */     //   556	74	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   556	74	12	invalid$iv	Z
/*     */     //   786	24	19	$i$a$-thenIf-ChipKt$ChipImpl$3	I
/*     */     //   783	27	18	$this$ChipImpl_u24lambda_u2414	Landroidx/compose/ui/Modifier;
/*     */     //   774	41	17	$i$f$thenIf	I
/*     */     //   771	44	15	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   771	44	16	precondition$iv	Z
/*     */     //   1322	29	50	$i$f$getCurrent	I
/*     */     //   1319	32	48	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   1319	32	49	$changed$iv	I
/*     */     //   1308	49	47	$i$a$-takeOrElse-DxMtmZc-ChipKt$ChipImpl$4$resolvedContentColor$1	I
/*     */     //   1283	14	46	$i$f$isSpecified-8_81llA	I
/*     */     //   1280	17	44	$this$isSpecified$iv$iv	J
/*     */     //   1276	82	43	$i$f$takeOrElse-DxMtmZc	I
/*     */     //   1273	85	41	$this$takeOrElse_u2dDxMtmZc$iv	J
/*     */     //   1412	29	59	$i$f$getCurrent	I
/*     */     //   1409	32	57	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   1409	32	58	$changed$iv	I
/*     */     //   1237	302	40	$i$a$-Row-ChipKt$ChipImpl$4	I
/*     */     //   1371	168	54	resolvedContentColor	J
/*     */     //   1234	305	39	$this$ChipImpl_u24lambda_u2416	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   1234	305	38	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1234	305	37	$changed	I
/*     */     //   1198	346	36	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   1195	349	35	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1195	349	34	$changed$iv	I
/*     */     //   1109	55	33	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1106	58	32	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1102	64	31	$i$f$set-impl	I
/*     */     //   1099	67	30	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1065	115	29	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1062	118	28	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   992	565	27	$i$f$ReusableComposeNode	I
/*     */     //   989	568	25	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   989	568	26	$changed$iv$iv$iv	I
/*     */     //   929	634	21	$i$f$Layout	I
/*     */     //   948	615	22	compositeKeyHash$iv$iv	I
/*     */     //   957	606	23	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   966	597	24	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   926	637	20	$changed$iv$iv	I
/*     */     //   876	693	18	$i$f$Row	I
/*     */     //   916	653	19	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   873	696	17	$changed$iv	I
/*     */     //   377	1201	9	chipState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   666	912	10	shape	Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   672	906	11	colors	Lorg/jetbrains/jewel/ui/component/styling/ChipColors;
/*     */     //   687	891	12	borderColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   717	861	13	borderWidth	F
/*     */     //   16	1608	8	$dirty	I
/*     */     //   0	1624	0	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1624	1	enabled	Z
/*     */     //   0	1624	2	selected	Z
/*     */     //   0	1624	3	style	Lorg/jetbrains/jewel/ui/component/styling/ChipStyle;
/*     */     //   0	1624	4	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1624	5	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1624	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1624	7	$changed	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final long ChipImpl$lambda$9(MutableState $chipState$delegate)
/*     */   {
/* 138 */     State state = (State)$chipState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 333 */       (ChipState)state.getValue()).unbox-impl(); } private static final void ChipImpl$lambda$10(MutableState $chipState$delegate, long <set-?>) { MutableState mutableState = $chipState$delegate; Object object1 = null, object2 = null; Object value$iv = ChipState.box-impl(<set-?>); int $i$f$setValue = 0;
/* 334 */     mutableState.setValue(value$iv); } private static final long ChipImpl$lambda$13(State $borderColor$delegate) { State state = $borderColor$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 336 */     return ((Color)state.getValue()).unbox-impl(); }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "Chip.kt", l = {143}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.ChipKt$ChipImpl$2$1")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class ChipKt$ChipImpl$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     ChipKt$ChipImpl$2$1(MutableInteractionSource $interactionSource, MutableState<ChipState> $chipState$delegate, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$chipState$delegate) {
/*     */                 public final Object emit(Interaction interaction, Continuation $completion) {
/*     */                   Interaction interaction1 = interaction;
/*     */                   if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
/*     */                     ChipKt.ChipImpl$lambda$10(this.$chipState$delegate, ChipState.copy-JT_Lw10$default(ChipKt.ChipImpl$lambda$9(this.$chipState$delegate), false, false, false, true, false, false, 55, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) {
/*     */                     ChipKt.ChipImpl$lambda$10(this.$chipState$delegate, ChipState.copy-JT_Lw10$default(ChipKt.ChipImpl$lambda$9(this.$chipState$delegate), false, false, false, false, false, false, 55, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
/*     */                     ChipKt.ChipImpl$lambda$10(this.$chipState$delegate, ChipState.copy-JT_Lw10$default(ChipKt.ChipImpl$lambda$9(this.$chipState$delegate), false, false, false, false, true, false, 47, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) {
/*     */                     ChipKt.ChipImpl$lambda$10(this.$chipState$delegate, ChipState.copy-JT_Lw10$default(ChipKt.ChipImpl$lambda$9(this.$chipState$delegate), false, false, false, false, false, false, 47, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) {
/*     */                     ChipKt.ChipImpl$lambda$10(this.$chipState$delegate, ChipState.copy-JT_Lw10$default(ChipKt.ChipImpl$lambda$9(this.$chipState$delegate), false, true, false, false, false, false, 61, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) {
/*     */                     ChipKt.ChipImpl$lambda$10(this.$chipState$delegate, ChipState.copy-JT_Lw10$default(ChipKt.ChipImpl$lambda$9(this.$chipState$delegate), false, false, false, false, false, false, 61, null));
/*     */                   } 
/*     */                   return Unit.INSTANCE;
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           this.$interactionSource.getInteractions().collect(new FlowCollector(this.$chipState$delegate) {
/*     */                 public final Object emit(Interaction interaction, Continuation $completion) {
/*     */                   Interaction interaction1 = interaction;
/*     */                   if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
/*     */                     ChipKt.ChipImpl$lambda$10(this.$chipState$delegate, ChipState.copy-JT_Lw10$default(ChipKt.ChipImpl$lambda$9(this.$chipState$delegate), false, false, false, true, false, false, 55, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) {
/*     */                     ChipKt.ChipImpl$lambda$10(this.$chipState$delegate, ChipState.copy-JT_Lw10$default(ChipKt.ChipImpl$lambda$9(this.$chipState$delegate), false, false, false, false, false, false, 55, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
/*     */                     ChipKt.ChipImpl$lambda$10(this.$chipState$delegate, ChipState.copy-JT_Lw10$default(ChipKt.ChipImpl$lambda$9(this.$chipState$delegate), false, false, false, false, true, false, 47, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) {
/*     */                     ChipKt.ChipImpl$lambda$10(this.$chipState$delegate, ChipState.copy-JT_Lw10$default(ChipKt.ChipImpl$lambda$9(this.$chipState$delegate), false, false, false, false, false, false, 47, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) {
/*     */                     ChipKt.ChipImpl$lambda$10(this.$chipState$delegate, ChipState.copy-JT_Lw10$default(ChipKt.ChipImpl$lambda$9(this.$chipState$delegate), false, true, false, false, false, false, 61, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) {
/*     */                     ChipKt.ChipImpl$lambda$10(this.$chipState$delegate, ChipState.copy-JT_Lw10$default(ChipKt.ChipImpl$lambda$9(this.$chipState$delegate), false, false, false, false, false, false, 61, null));
/*     */                   } 
/*     */                   return Unit.INSTANCE;
/*     */                 }
/*     */               }(Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ChipKt$ChipImpl$2$1> $completion) {
/*     */       return (Continuation<Unit>)new ChipKt$ChipImpl$2$1(this.$interactionSource, this.$chipState$delegate, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ChipKt$ChipImpl$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit Chip$lambda$3(Modifier $modifier, MutableInteractionSource $interactionSource, boolean $enabled, boolean $selected, ChipStyle $style, Function0<Unit> $onClick, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Chip($modifier, $interactionSource, $enabled, $selected, $style, $onClick, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit ToggleableChip$lambda$5(boolean $checked, Function1<? super Boolean, Unit> $onClick, Modifier $modifier, MutableInteractionSource $interactionSource, boolean $enabled, ChipStyle $style, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     ToggleableChip($checked, $onClick, $modifier, $interactionSource, $enabled, $style, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit RadioButtonChip$lambda$7(boolean $selected, Function0<Unit> $onClick, Modifier $modifier, MutableInteractionSource $interactionSource, boolean $enabled, ChipStyle $style, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     RadioButtonChip($selected, $onClick, $modifier, $interactionSource, $enabled, $style, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit ChipImpl$lambda$17(MutableInteractionSource $interactionSource, boolean $enabled, boolean $selected, ChipStyle $style, Modifier $modifier, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, Composer $composer, int $force) {
/*     */     ChipImpl($interactionSource, $enabled, $selected, $style, $modifier, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class ChipKt$ChipImpl$4$1 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(707017662, $changed, -1, "org.jetbrains.jewel.ui.component.ChipImpl.<anonymous>.<anonymous> (Chip.kt:182)"); 
/*     */         this.$content.invoke($composer, Integer.valueOf(0));
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     ChipKt$ChipImpl$4$1(Function2<Composer, Integer, Unit> $content) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ChipKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */