/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.IntState;
/*     */ import androidx.compose.runtime.MutableIntState;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.draw.AlphaKt;
/*     */ import androidx.compose.ui.focus.FocusProperties;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.ColorFilter;
/*     */ import androidx.compose.ui.input.InputMode;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.state.InteractiveComponentState;
/*     */ import org.jetbrains.jewel.ui.DisabledColorFilterKt;
/*     */ import org.jetbrains.jewel.ui.Outline;
/*     */ import org.jetbrains.jewel.ui.component.styling.DropdownStyle;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ import org.jetbrains.jewel.ui.painter.PainterHint;
/*     */ import org.jetbrains.jewel.ui.painter.hints.StatefulKt;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000R\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\032\001\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\027\020\r\032\023\022\004\022\0020\017\022\004\022\0020\0010\016¢\006\002\b\0202\034\020\021\032\030\022\004\022\0020\022\022\004\022\0020\0010\016¢\006\002\b\020¢\006\002\b\023H\007¢\006\002\020\024¨\006\025²\006\n\020\026\032\0020\005X\002²\006\n\020\027\032\0020\005X\002²\006\n\020\030\032\0020\031X\002²\006\n\020\032\032\0020\033X\002²\006\n\020\034\032\0020\035X\002"}, d2 = {"Dropdown", "", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "menuModifier", "outline", "Lorg/jetbrains/jewel/ui/Outline;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "style", "Lorg/jetbrains/jewel/ui/component/styling/DropdownStyle;", "menuContent", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/ui/component/MenuScope;", "Lkotlin/ExtensionFunctionType;", "content", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/DropdownStyle;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ui", "expanded", "skipNextClick", "dropdownState", "Lorg/jetbrains/jewel/ui/component/DropdownState;", "borderColor", "Landroidx/compose/ui/graphics/Color;", "componentWidth", ""})
/*     */ @SourceDebugExtension({"SMAP\nDropdown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dropdown.kt\norg/jetbrains/jewel/ui/component/DropdownKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 ModifierExtensions.kt\norg/jetbrains/jewel/ui/util/ModifierExtensionsKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,218:1\n1225#2,6:219\n1225#2,6:225\n1225#2,6:231\n1225#2,6:237\n1225#2,6:243\n1225#2,6:249\n1225#2,6:255\n1225#2,6:261\n1225#2,6:269\n1225#2,6:312\n1225#2,6:319\n10#3:267\n10#3:268\n71#4:275\n69#4,5:276\n74#4:309\n78#4:328\n79#5,6:281\n86#5,4:296\n90#5,2:306\n94#5:327\n368#6,9:287\n377#6:308\n378#6,2:325\n4034#7,6:300\n77#8:310\n77#8:311\n1#9:318\n81#10:329\n107#10,2:330\n81#10:332\n107#10,2:333\n81#10:335\n107#10,2:336\n81#10:338\n78#11:339\n111#11,2:340\n*S KotlinDebug\n*F\n+ 1 Dropdown.kt\norg/jetbrains/jewel/ui/component/DropdownKt\n*L\n62#1:219,6\n67#1:225,6\n68#1:231,6\n70#1:237,6\n72#1:243,6\n74#1:249,6\n96#1:255,6\n101#1:261,6\n119#1:269,6\n161#1:312,6\n152#1:319,6\n114#1:267\n115#1:268\n97#1:275\n97#1:276,5\n97#1:309\n97#1:328\n97#1:281,6\n97#1:296,4\n97#1:306,2\n97#1:327\n97#1:287,9\n97#1:308\n97#1:325,2\n97#1:300,6\n124#1:310\n150#1:311\n67#1:329\n67#1:330,2\n68#1:332\n68#1:333,2\n70#1:335\n70#1:336,2\n93#1:338\n96#1:339\n96#1:340,2\n*E\n"})
/*     */ public final class DropdownKt {
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void Dropdown(@Nullable Modifier modifier, boolean enabled, @Nullable Modifier menuModifier, @Nullable Outline outline, @Nullable MutableInteractionSource interactionSource, @Nullable DropdownStyle style, @NotNull Function1 menuContent, @NotNull Function3 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: ldc 'menuContent'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #7
/*     */     //   9: ldc 'content'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload #8
/*     */     //   16: ldc -1079564902
/*     */     //   18: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   23: astore #8
/*     */     //   25: iload #9
/*     */     //   27: istore #11
/*     */     //   29: iload #10
/*     */     //   31: iconst_1
/*     */     //   32: iand
/*     */     //   33: ifeq -> 46
/*     */     //   36: iload #11
/*     */     //   38: bipush #6
/*     */     //   40: ior
/*     */     //   41: istore #11
/*     */     //   43: goto -> 75
/*     */     //   46: iload #9
/*     */     //   48: bipush #6
/*     */     //   50: iand
/*     */     //   51: ifne -> 75
/*     */     //   54: iload #11
/*     */     //   56: aload #8
/*     */     //   58: aload_0
/*     */     //   59: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   64: ifeq -> 71
/*     */     //   67: iconst_4
/*     */     //   68: goto -> 72
/*     */     //   71: iconst_2
/*     */     //   72: ior
/*     */     //   73: istore #11
/*     */     //   75: iload #10
/*     */     //   77: iconst_2
/*     */     //   78: iand
/*     */     //   79: ifeq -> 92
/*     */     //   82: iload #11
/*     */     //   84: bipush #48
/*     */     //   86: ior
/*     */     //   87: istore #11
/*     */     //   89: goto -> 123
/*     */     //   92: iload #9
/*     */     //   94: bipush #48
/*     */     //   96: iand
/*     */     //   97: ifne -> 123
/*     */     //   100: iload #11
/*     */     //   102: aload #8
/*     */     //   104: iload_1
/*     */     //   105: invokeinterface changed : (Z)Z
/*     */     //   110: ifeq -> 118
/*     */     //   113: bipush #32
/*     */     //   115: goto -> 120
/*     */     //   118: bipush #16
/*     */     //   120: ior
/*     */     //   121: istore #11
/*     */     //   123: iload #10
/*     */     //   125: iconst_4
/*     */     //   126: iand
/*     */     //   127: ifeq -> 141
/*     */     //   130: iload #11
/*     */     //   132: sipush #384
/*     */     //   135: ior
/*     */     //   136: istore #11
/*     */     //   138: goto -> 175
/*     */     //   141: iload #9
/*     */     //   143: sipush #384
/*     */     //   146: iand
/*     */     //   147: ifne -> 175
/*     */     //   150: iload #11
/*     */     //   152: aload #8
/*     */     //   154: aload_2
/*     */     //   155: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   160: ifeq -> 169
/*     */     //   163: sipush #256
/*     */     //   166: goto -> 172
/*     */     //   169: sipush #128
/*     */     //   172: ior
/*     */     //   173: istore #11
/*     */     //   175: iload #10
/*     */     //   177: bipush #8
/*     */     //   179: iand
/*     */     //   180: ifeq -> 194
/*     */     //   183: iload #11
/*     */     //   185: sipush #3072
/*     */     //   188: ior
/*     */     //   189: istore #11
/*     */     //   191: goto -> 228
/*     */     //   194: iload #9
/*     */     //   196: sipush #3072
/*     */     //   199: iand
/*     */     //   200: ifne -> 228
/*     */     //   203: iload #11
/*     */     //   205: aload #8
/*     */     //   207: aload_3
/*     */     //   208: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   213: ifeq -> 222
/*     */     //   216: sipush #2048
/*     */     //   219: goto -> 225
/*     */     //   222: sipush #1024
/*     */     //   225: ior
/*     */     //   226: istore #11
/*     */     //   228: iload #10
/*     */     //   230: bipush #16
/*     */     //   232: iand
/*     */     //   233: ifeq -> 247
/*     */     //   236: iload #11
/*     */     //   238: sipush #24576
/*     */     //   241: ior
/*     */     //   242: istore #11
/*     */     //   244: goto -> 282
/*     */     //   247: iload #9
/*     */     //   249: sipush #24576
/*     */     //   252: iand
/*     */     //   253: ifne -> 282
/*     */     //   256: iload #11
/*     */     //   258: aload #8
/*     */     //   260: aload #4
/*     */     //   262: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   267: ifeq -> 276
/*     */     //   270: sipush #16384
/*     */     //   273: goto -> 279
/*     */     //   276: sipush #8192
/*     */     //   279: ior
/*     */     //   280: istore #11
/*     */     //   282: iload #9
/*     */     //   284: ldc 196608
/*     */     //   286: iand
/*     */     //   287: ifne -> 322
/*     */     //   290: iload #11
/*     */     //   292: iload #10
/*     */     //   294: bipush #32
/*     */     //   296: iand
/*     */     //   297: ifne -> 317
/*     */     //   300: aload #8
/*     */     //   302: aload #5
/*     */     //   304: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   309: ifeq -> 317
/*     */     //   312: ldc 131072
/*     */     //   314: goto -> 319
/*     */     //   317: ldc 65536
/*     */     //   319: ior
/*     */     //   320: istore #11
/*     */     //   322: iload #10
/*     */     //   324: bipush #64
/*     */     //   326: iand
/*     */     //   327: ifeq -> 340
/*     */     //   330: iload #11
/*     */     //   332: ldc 1572864
/*     */     //   334: ior
/*     */     //   335: istore #11
/*     */     //   337: goto -> 372
/*     */     //   340: iload #9
/*     */     //   342: ldc 1572864
/*     */     //   344: iand
/*     */     //   345: ifne -> 372
/*     */     //   348: iload #11
/*     */     //   350: aload #8
/*     */     //   352: aload #6
/*     */     //   354: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   359: ifeq -> 367
/*     */     //   362: ldc 1048576
/*     */     //   364: goto -> 369
/*     */     //   367: ldc 524288
/*     */     //   369: ior
/*     */     //   370: istore #11
/*     */     //   372: iload #10
/*     */     //   374: sipush #128
/*     */     //   377: iand
/*     */     //   378: ifeq -> 391
/*     */     //   381: iload #11
/*     */     //   383: ldc 12582912
/*     */     //   385: ior
/*     */     //   386: istore #11
/*     */     //   388: goto -> 423
/*     */     //   391: iload #9
/*     */     //   393: ldc 12582912
/*     */     //   395: iand
/*     */     //   396: ifne -> 423
/*     */     //   399: iload #11
/*     */     //   401: aload #8
/*     */     //   403: aload #7
/*     */     //   405: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   410: ifeq -> 418
/*     */     //   413: ldc 8388608
/*     */     //   415: goto -> 420
/*     */     //   418: ldc 4194304
/*     */     //   420: ior
/*     */     //   421: istore #11
/*     */     //   423: iload #11
/*     */     //   425: ldc 4793491
/*     */     //   427: iand
/*     */     //   428: ldc 4793490
/*     */     //   430: if_icmpne -> 443
/*     */     //   433: aload #8
/*     */     //   435: invokeinterface getSkipping : ()Z
/*     */     //   440: ifne -> 2845
/*     */     //   443: aload #8
/*     */     //   445: invokeinterface startDefaults : ()V
/*     */     //   450: iload #9
/*     */     //   452: iconst_1
/*     */     //   453: iand
/*     */     //   454: ifeq -> 467
/*     */     //   457: aload #8
/*     */     //   459: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   464: ifeq -> 639
/*     */     //   467: iload #10
/*     */     //   469: iconst_1
/*     */     //   470: iand
/*     */     //   471: ifeq -> 481
/*     */     //   474: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   477: checkcast androidx/compose/ui/Modifier
/*     */     //   480: astore_0
/*     */     //   481: iload #10
/*     */     //   483: iconst_2
/*     */     //   484: iand
/*     */     //   485: ifeq -> 490
/*     */     //   488: iconst_1
/*     */     //   489: istore_1
/*     */     //   490: iload #10
/*     */     //   492: iconst_4
/*     */     //   493: iand
/*     */     //   494: ifeq -> 504
/*     */     //   497: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   500: checkcast androidx/compose/ui/Modifier
/*     */     //   503: astore_2
/*     */     //   504: iload #10
/*     */     //   506: bipush #8
/*     */     //   508: iand
/*     */     //   509: ifeq -> 516
/*     */     //   512: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   515: astore_3
/*     */     //   516: iload #10
/*     */     //   518: bipush #16
/*     */     //   520: iand
/*     */     //   521: ifeq -> 609
/*     */     //   524: aload #8
/*     */     //   526: ldc 1017356342
/*     */     //   528: invokeinterface startReplaceGroup : (I)V
/*     */     //   533: aload #8
/*     */     //   535: astore #13
/*     */     //   537: iconst_0
/*     */     //   538: istore #14
/*     */     //   540: iconst_0
/*     */     //   541: istore #15
/*     */     //   543: aload #13
/*     */     //   545: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   550: astore #16
/*     */     //   552: iconst_0
/*     */     //   553: istore #17
/*     */     //   555: aload #16
/*     */     //   557: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   560: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   563: if_acmpne -> 588
/*     */     //   566: iconst_0
/*     */     //   567: istore #18
/*     */     //   569: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   572: astore #18
/*     */     //   574: aload #13
/*     */     //   576: aload #18
/*     */     //   578: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   583: aload #18
/*     */     //   585: goto -> 590
/*     */     //   588: aload #16
/*     */     //   590: nop
/*     */     //   591: nop
/*     */     //   592: nop
/*     */     //   593: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   596: astore #12
/*     */     //   598: aload #8
/*     */     //   600: invokeinterface endReplaceGroup : ()V
/*     */     //   605: aload #12
/*     */     //   607: astore #4
/*     */     //   609: iload #10
/*     */     //   611: bipush #32
/*     */     //   613: iand
/*     */     //   614: ifeq -> 661
/*     */     //   617: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   620: aload #8
/*     */     //   622: bipush #6
/*     */     //   624: invokestatic getDropdownStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/DropdownStyle;
/*     */     //   627: astore #5
/*     */     //   629: iload #11
/*     */     //   631: ldc -458753
/*     */     //   633: iand
/*     */     //   634: istore #11
/*     */     //   636: goto -> 661
/*     */     //   639: aload #8
/*     */     //   641: invokeinterface skipToGroupEnd : ()V
/*     */     //   646: iload #10
/*     */     //   648: bipush #32
/*     */     //   650: iand
/*     */     //   651: ifeq -> 661
/*     */     //   654: iload #11
/*     */     //   656: ldc -458753
/*     */     //   658: iand
/*     */     //   659: istore #11
/*     */     //   661: aload #8
/*     */     //   663: invokeinterface endDefaults : ()V
/*     */     //   668: invokestatic isTraceInProgress : ()Z
/*     */     //   671: ifeq -> 684
/*     */     //   674: ldc -1079564902
/*     */     //   676: iload #11
/*     */     //   678: iconst_m1
/*     */     //   679: ldc 'org.jetbrains.jewel.ui.component.Dropdown (Dropdown.kt:65)'
/*     */     //   681: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   684: aload #8
/*     */     //   686: ldc 1017362833
/*     */     //   688: invokeinterface startReplaceGroup : (I)V
/*     */     //   693: aload #8
/*     */     //   695: astore #14
/*     */     //   697: iconst_0
/*     */     //   698: istore #15
/*     */     //   700: nop
/*     */     //   701: iconst_0
/*     */     //   702: istore #16
/*     */     //   704: aload #14
/*     */     //   706: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   711: astore #17
/*     */     //   713: iconst_0
/*     */     //   714: istore #18
/*     */     //   716: aload #17
/*     */     //   718: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   721: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   724: if_acmpne -> 756
/*     */     //   727: iconst_0
/*     */     //   728: istore #19
/*     */     //   730: iconst_0
/*     */     //   731: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   734: aconst_null
/*     */     //   735: iconst_2
/*     */     //   736: aconst_null
/*     */     //   737: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   740: astore #19
/*     */     //   742: aload #14
/*     */     //   744: aload #19
/*     */     //   746: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   751: aload #19
/*     */     //   753: goto -> 758
/*     */     //   756: aload #17
/*     */     //   758: nop
/*     */     //   759: nop
/*     */     //   760: nop
/*     */     //   761: checkcast androidx/compose/runtime/MutableState
/*     */     //   764: astore #13
/*     */     //   766: aload #8
/*     */     //   768: invokeinterface endReplaceGroup : ()V
/*     */     //   773: aload #13
/*     */     //   775: astore #12
/*     */     //   777: aload #8
/*     */     //   779: ldc 1017364753
/*     */     //   781: invokeinterface startReplaceGroup : (I)V
/*     */     //   786: aload #8
/*     */     //   788: astore #15
/*     */     //   790: iconst_0
/*     */     //   791: istore #16
/*     */     //   793: nop
/*     */     //   794: iconst_0
/*     */     //   795: istore #17
/*     */     //   797: aload #15
/*     */     //   799: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   804: astore #18
/*     */     //   806: iconst_0
/*     */     //   807: istore #19
/*     */     //   809: aload #18
/*     */     //   811: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   814: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   817: if_acmpne -> 849
/*     */     //   820: iconst_0
/*     */     //   821: istore #20
/*     */     //   823: iconst_0
/*     */     //   824: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   827: aconst_null
/*     */     //   828: iconst_2
/*     */     //   829: aconst_null
/*     */     //   830: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   833: astore #20
/*     */     //   835: aload #15
/*     */     //   837: aload #20
/*     */     //   839: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   844: aload #20
/*     */     //   846: goto -> 851
/*     */     //   849: aload #18
/*     */     //   851: nop
/*     */     //   852: nop
/*     */     //   853: nop
/*     */     //   854: checkcast androidx/compose/runtime/MutableState
/*     */     //   857: astore #14
/*     */     //   859: aload #8
/*     */     //   861: invokeinterface endReplaceGroup : ()V
/*     */     //   866: aload #14
/*     */     //   868: astore #13
/*     */     //   870: aload #8
/*     */     //   872: ldc 1017366754
/*     */     //   874: invokeinterface startReplaceGroup : (I)V
/*     */     //   879: aload #8
/*     */     //   881: astore #16
/*     */     //   883: iload #11
/*     */     //   885: ldc 57344
/*     */     //   887: iand
/*     */     //   888: sipush #16384
/*     */     //   891: if_icmpne -> 898
/*     */     //   894: iconst_1
/*     */     //   895: goto -> 899
/*     */     //   898: iconst_0
/*     */     //   899: istore #17
/*     */     //   901: nop
/*     */     //   902: iconst_0
/*     */     //   903: istore #18
/*     */     //   905: aload #16
/*     */     //   907: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   912: astore #19
/*     */     //   914: iconst_0
/*     */     //   915: istore #20
/*     */     //   917: iload #17
/*     */     //   919: ifne -> 933
/*     */     //   922: aload #19
/*     */     //   924: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   927: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   930: if_acmpne -> 975
/*     */     //   933: iconst_0
/*     */     //   934: istore #21
/*     */     //   936: getstatic org/jetbrains/jewel/ui/component/DropdownState.Companion : Lorg/jetbrains/jewel/ui/component/DropdownState$Companion;
/*     */     //   939: iload_1
/*     */     //   940: iconst_0
/*     */     //   941: iconst_0
/*     */     //   942: iconst_0
/*     */     //   943: iconst_0
/*     */     //   944: bipush #30
/*     */     //   946: aconst_null
/*     */     //   947: invokestatic of-17HSnUM$default : (Lorg/jetbrains/jewel/ui/component/DropdownState$Companion;ZZZZZILjava/lang/Object;)J
/*     */     //   950: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/DropdownState;
/*     */     //   953: aconst_null
/*     */     //   954: iconst_2
/*     */     //   955: aconst_null
/*     */     //   956: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   959: astore #22
/*     */     //   961: aload #16
/*     */     //   963: aload #22
/*     */     //   965: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   970: aload #22
/*     */     //   972: goto -> 977
/*     */     //   975: aload #19
/*     */     //   977: nop
/*     */     //   978: nop
/*     */     //   979: nop
/*     */     //   980: checkcast androidx/compose/runtime/MutableState
/*     */     //   983: astore #15
/*     */     //   985: aload #8
/*     */     //   987: invokeinterface endReplaceGroup : ()V
/*     */     //   992: aload #15
/*     */     //   994: astore #14
/*     */     //   996: aload #8
/*     */     //   998: ldc 1017369594
/*     */     //   1000: invokeinterface startReplaceGroup : (I)V
/*     */     //   1005: aload #8
/*     */     //   1007: astore #15
/*     */     //   1009: iload #11
/*     */     //   1011: bipush #112
/*     */     //   1013: iand
/*     */     //   1014: bipush #32
/*     */     //   1016: if_icmpne -> 1023
/*     */     //   1019: iconst_1
/*     */     //   1020: goto -> 1024
/*     */     //   1023: iconst_0
/*     */     //   1024: istore #16
/*     */     //   1026: nop
/*     */     //   1027: iconst_0
/*     */     //   1028: istore #17
/*     */     //   1030: aload #15
/*     */     //   1032: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1037: astore #18
/*     */     //   1039: iconst_0
/*     */     //   1040: istore #19
/*     */     //   1042: iload #16
/*     */     //   1044: ifne -> 1058
/*     */     //   1047: aload #18
/*     */     //   1049: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1052: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1055: if_acmpne -> 1101
/*     */     //   1058: iconst_0
/*     */     //   1059: istore #20
/*     */     //   1061: aload #14
/*     */     //   1063: aload #14
/*     */     //   1065: invokestatic Dropdown$lambda$8 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1068: iload_1
/*     */     //   1069: iconst_0
/*     */     //   1070: iconst_0
/*     */     //   1071: iconst_0
/*     */     //   1072: iconst_0
/*     */     //   1073: bipush #30
/*     */     //   1075: aconst_null
/*     */     //   1076: invokestatic copy-17HSnUM$default : (JZZZZZILjava/lang/Object;)J
/*     */     //   1079: invokestatic Dropdown$lambda$9 : (Landroidx/compose/runtime/MutableState;J)V
/*     */     //   1082: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1085: astore #21
/*     */     //   1087: aload #15
/*     */     //   1089: aload #21
/*     */     //   1091: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1096: aload #21
/*     */     //   1098: goto -> 1103
/*     */     //   1101: aload #18
/*     */     //   1103: nop
/*     */     //   1104: nop
/*     */     //   1105: nop
/*     */     //   1106: pop
/*     */     //   1107: aload #8
/*     */     //   1109: invokeinterface endReplaceGroup : ()V
/*     */     //   1114: aload #4
/*     */     //   1116: aload #8
/*     */     //   1118: ldc 1017373953
/*     */     //   1120: invokeinterface startReplaceGroup : (I)V
/*     */     //   1125: aload #8
/*     */     //   1127: astore #16
/*     */     //   1129: iload #11
/*     */     //   1131: ldc 57344
/*     */     //   1133: iand
/*     */     //   1134: sipush #16384
/*     */     //   1137: if_icmpne -> 1144
/*     */     //   1140: iconst_1
/*     */     //   1141: goto -> 1145
/*     */     //   1144: iconst_0
/*     */     //   1145: aload #8
/*     */     //   1147: aload #14
/*     */     //   1149: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1154: ior
/*     */     //   1155: istore #17
/*     */     //   1157: iconst_0
/*     */     //   1158: istore #18
/*     */     //   1160: aload #16
/*     */     //   1162: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1167: astore #19
/*     */     //   1169: iconst_0
/*     */     //   1170: istore #20
/*     */     //   1172: iload #17
/*     */     //   1174: ifne -> 1188
/*     */     //   1177: aload #19
/*     */     //   1179: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1182: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1185: if_acmpne -> 1227
/*     */     //   1188: astore #65
/*     */     //   1190: iconst_0
/*     */     //   1191: istore #21
/*     */     //   1193: new org/jetbrains/jewel/ui/component/DropdownKt$Dropdown$3$1
/*     */     //   1196: dup
/*     */     //   1197: aload #4
/*     */     //   1199: aload #14
/*     */     //   1201: aconst_null
/*     */     //   1202: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   1205: checkcast kotlin/jvm/functions/Function2
/*     */     //   1208: aload #65
/*     */     //   1210: swap
/*     */     //   1211: astore #22
/*     */     //   1213: aload #16
/*     */     //   1215: aload #22
/*     */     //   1217: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1222: aload #22
/*     */     //   1224: goto -> 1229
/*     */     //   1227: aload #19
/*     */     //   1229: nop
/*     */     //   1230: nop
/*     */     //   1231: nop
/*     */     //   1232: checkcast kotlin/jvm/functions/Function2
/*     */     //   1235: astore #15
/*     */     //   1237: aload #8
/*     */     //   1239: invokeinterface endReplaceGroup : ()V
/*     */     //   1244: aload #15
/*     */     //   1246: aload #8
/*     */     //   1248: bipush #14
/*     */     //   1250: iload #11
/*     */     //   1252: bipush #12
/*     */     //   1254: ishr
/*     */     //   1255: iand
/*     */     //   1256: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1259: aload #5
/*     */     //   1261: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/DropdownColors;
/*     */     //   1264: astore #15
/*     */     //   1266: aload #5
/*     */     //   1268: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/DropdownMetrics;
/*     */     //   1271: astore #16
/*     */     //   1273: aload #5
/*     */     //   1275: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/DropdownMetrics;
/*     */     //   1278: invokevirtual getCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   1281: invokestatic RoundedCornerShape : (Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1284: astore #17
/*     */     //   1286: aload #16
/*     */     //   1288: invokevirtual getMinSize-MYxV2XQ : ()J
/*     */     //   1291: lstore #18
/*     */     //   1293: aload #5
/*     */     //   1295: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/DropdownMetrics;
/*     */     //   1298: invokevirtual getArrowMinSize-MYxV2XQ : ()J
/*     */     //   1301: lstore #20
/*     */     //   1303: aload #15
/*     */     //   1305: aload #14
/*     */     //   1307: invokestatic Dropdown$lambda$8 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1310: aload #8
/*     */     //   1312: iconst_0
/*     */     //   1313: invokevirtual borderFor-6nTENxs : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1316: astore #22
/*     */     //   1318: aload_3
/*     */     //   1319: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   1322: if_acmpne -> 1329
/*     */     //   1325: iconst_1
/*     */     //   1326: goto -> 1330
/*     */     //   1329: iconst_0
/*     */     //   1330: istore #23
/*     */     //   1332: aload #8
/*     */     //   1334: ldc 1017408177
/*     */     //   1336: invokeinterface startReplaceGroup : (I)V
/*     */     //   1341: aload #8
/*     */     //   1343: astore #26
/*     */     //   1345: iconst_0
/*     */     //   1346: istore #27
/*     */     //   1348: nop
/*     */     //   1349: iconst_0
/*     */     //   1350: istore #28
/*     */     //   1352: aload #26
/*     */     //   1354: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1359: astore #29
/*     */     //   1361: iconst_0
/*     */     //   1362: istore #30
/*     */     //   1364: aload #29
/*     */     //   1366: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1369: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1372: if_acmpne -> 1398
/*     */     //   1375: iconst_0
/*     */     //   1376: istore #31
/*     */     //   1378: iconst_m1
/*     */     //   1379: invokestatic mutableIntStateOf : (I)Landroidx/compose/runtime/MutableIntState;
/*     */     //   1382: astore #31
/*     */     //   1384: aload #26
/*     */     //   1386: aload #31
/*     */     //   1388: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1393: aload #31
/*     */     //   1395: goto -> 1400
/*     */     //   1398: aload #29
/*     */     //   1400: nop
/*     */     //   1401: nop
/*     */     //   1402: nop
/*     */     //   1403: checkcast androidx/compose/runtime/MutableIntState
/*     */     //   1406: astore #25
/*     */     //   1408: aload #8
/*     */     //   1410: invokeinterface endReplaceGroup : ()V
/*     */     //   1415: aload #25
/*     */     //   1417: astore #24
/*     */     //   1419: aload #8
/*     */     //   1421: ldc 1017435029
/*     */     //   1423: invokeinterface startReplaceGroup : (I)V
/*     */     //   1428: getstatic androidx/compose/ui/semantics/Role.Companion : Landroidx/compose/ui/semantics/Role$Companion;
/*     */     //   1431: invokevirtual getButton-o7Vup1c : ()I
/*     */     //   1434: istore #26
/*     */     //   1436: aload_0
/*     */     //   1437: aload #4
/*     */     //   1439: aconst_null
/*     */     //   1440: iload_1
/*     */     //   1441: aconst_null
/*     */     //   1442: iload #26
/*     */     //   1444: invokestatic box-impl : (I)Landroidx/compose/ui/semantics/Role;
/*     */     //   1447: aload #8
/*     */     //   1449: ldc_w 1017412970
/*     */     //   1452: invokeinterface startReplaceGroup : (I)V
/*     */     //   1457: aload #8
/*     */     //   1459: astore #28
/*     */     //   1461: iconst_0
/*     */     //   1462: istore #29
/*     */     //   1464: nop
/*     */     //   1465: iconst_0
/*     */     //   1466: istore #30
/*     */     //   1468: aload #28
/*     */     //   1470: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1475: astore #31
/*     */     //   1477: iconst_0
/*     */     //   1478: istore #32
/*     */     //   1480: aload #31
/*     */     //   1482: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1485: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1488: if_acmpne -> 1547
/*     */     //   1491: astore #70
/*     */     //   1493: astore #69
/*     */     //   1495: istore #68
/*     */     //   1497: astore #67
/*     */     //   1499: astore #66
/*     */     //   1501: astore #65
/*     */     //   1503: iconst_0
/*     */     //   1504: istore #33
/*     */     //   1506: aload #13
/*     */     //   1508: aload #12
/*     */     //   1510: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*     */     //   1515: astore #71
/*     */     //   1517: aload #65
/*     */     //   1519: aload #66
/*     */     //   1521: aload #67
/*     */     //   1523: iload #68
/*     */     //   1525: aload #69
/*     */     //   1527: aload #70
/*     */     //   1529: aload #71
/*     */     //   1531: astore #34
/*     */     //   1533: aload #28
/*     */     //   1535: aload #34
/*     */     //   1537: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1542: aload #34
/*     */     //   1544: goto -> 1549
/*     */     //   1547: aload #31
/*     */     //   1549: nop
/*     */     //   1550: nop
/*     */     //   1551: nop
/*     */     //   1552: checkcast kotlin/jvm/functions/Function0
/*     */     //   1555: astore #27
/*     */     //   1557: aload #8
/*     */     //   1559: invokeinterface endReplaceGroup : ()V
/*     */     //   1564: aload #27
/*     */     //   1566: bipush #8
/*     */     //   1568: aconst_null
/*     */     //   1569: invokestatic clickable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1572: aload #15
/*     */     //   1574: aload #14
/*     */     //   1576: invokestatic Dropdown$lambda$8 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1579: aload #8
/*     */     //   1581: iconst_0
/*     */     //   1582: invokevirtual backgroundFor-6nTENxs : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1585: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   1590: checkcast androidx/compose/ui/graphics/Color
/*     */     //   1593: invokevirtual unbox-impl : ()J
/*     */     //   1596: aload #17
/*     */     //   1598: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1601: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   1604: astore #26
/*     */     //   1606: nop
/*     */     //   1607: iconst_0
/*     */     //   1608: istore #27
/*     */     //   1610: iload #23
/*     */     //   1612: ifeq -> 1655
/*     */     //   1615: aload #26
/*     */     //   1617: astore #28
/*     */     //   1619: iconst_0
/*     */     //   1620: istore #29
/*     */     //   1622: aload #28
/*     */     //   1624: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Center : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   1627: aload #5
/*     */     //   1629: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/DropdownMetrics;
/*     */     //   1632: invokevirtual getBorderWidth-D9Ej5fM : ()F
/*     */     //   1635: aload #22
/*     */     //   1637: invokestatic Dropdown$lambda$12 : (Landroidx/compose/runtime/State;)J
/*     */     //   1640: aload #17
/*     */     //   1642: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1645: fconst_0
/*     */     //   1646: bipush #16
/*     */     //   1648: aconst_null
/*     */     //   1649: invokestatic border-QWjY48E$default : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FJLandroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1652: goto -> 1657
/*     */     //   1655: aload #26
/*     */     //   1657: astore #26
/*     */     //   1659: aload_3
/*     */     //   1660: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   1663: if_acmpne -> 1670
/*     */     //   1666: iconst_1
/*     */     //   1667: goto -> 1671
/*     */     //   1670: iconst_0
/*     */     //   1671: istore #27
/*     */     //   1673: iconst_0
/*     */     //   1674: istore #28
/*     */     //   1676: iload #27
/*     */     //   1678: ifeq -> 1717
/*     */     //   1681: aload #26
/*     */     //   1683: astore #29
/*     */     //   1685: iconst_0
/*     */     //   1686: istore #30
/*     */     //   1688: aload #29
/*     */     //   1690: aload #14
/*     */     //   1692: invokestatic Dropdown$lambda$8 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1695: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/DropdownState;
/*     */     //   1698: aload #17
/*     */     //   1700: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1703: aconst_null
/*     */     //   1704: fconst_0
/*     */     //   1705: fconst_0
/*     */     //   1706: aload #8
/*     */     //   1708: iconst_0
/*     */     //   1709: bipush #28
/*     */     //   1711: invokestatic focusOutline-AGcomas : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;Landroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
/*     */     //   1714: goto -> 1719
/*     */     //   1717: aload #26
/*     */     //   1719: astore #25
/*     */     //   1721: aload #8
/*     */     //   1723: invokeinterface endReplaceGroup : ()V
/*     */     //   1728: aload #25
/*     */     //   1730: aload #14
/*     */     //   1732: invokestatic Dropdown$lambda$8 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1735: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/DropdownState;
/*     */     //   1738: aload_3
/*     */     //   1739: aload #17
/*     */     //   1741: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1744: aconst_null
/*     */     //   1745: fconst_0
/*     */     //   1746: aload #8
/*     */     //   1748: sipush #896
/*     */     //   1751: iload #11
/*     */     //   1753: iconst_3
/*     */     //   1754: ishr
/*     */     //   1755: iand
/*     */     //   1756: bipush #24
/*     */     //   1758: invokestatic outline-HYR8e34 : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
/*     */     //   1761: getstatic androidx/compose/foundation/layout/IntrinsicSize.Max : Landroidx/compose/foundation/layout/IntrinsicSize;
/*     */     //   1764: invokestatic width : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/IntrinsicSize;)Landroidx/compose/ui/Modifier;
/*     */     //   1767: lload #18
/*     */     //   1769: invokestatic getWidth-D9Ej5fM : (J)F
/*     */     //   1772: lload #18
/*     */     //   1774: invokestatic getHeight-D9Ej5fM : (J)F
/*     */     //   1777: invokestatic box-impl : (F)Landroidx/compose/ui/unit/Dp;
/*     */     //   1780: lload #20
/*     */     //   1782: invokestatic getHeight-D9Ej5fM : (J)F
/*     */     //   1785: invokestatic box-impl : (F)Landroidx/compose/ui/unit/Dp;
/*     */     //   1788: invokestatic coerceAtLeast : (Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;
/*     */     //   1791: checkcast androidx/compose/ui/unit/Dp
/*     */     //   1794: invokevirtual unbox-impl : ()F
/*     */     //   1797: invokestatic defaultMinSize-VpY3zN4 : (Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
/*     */     //   1800: aload #8
/*     */     //   1802: ldc_w 1017444524
/*     */     //   1805: invokeinterface startReplaceGroup : (I)V
/*     */     //   1810: aload #8
/*     */     //   1812: astore #26
/*     */     //   1814: iconst_0
/*     */     //   1815: istore #27
/*     */     //   1817: nop
/*     */     //   1818: iconst_0
/*     */     //   1819: istore #28
/*     */     //   1821: aload #26
/*     */     //   1823: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1828: astore #29
/*     */     //   1830: iconst_0
/*     */     //   1831: istore #30
/*     */     //   1833: aload #29
/*     */     //   1835: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1838: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1841: if_acmpne -> 1875
/*     */     //   1844: astore #65
/*     */     //   1846: iconst_0
/*     */     //   1847: istore #31
/*     */     //   1849: aload #24
/*     */     //   1851: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableIntState;)Lkotlin/jvm/functions/Function1;
/*     */     //   1856: aload #65
/*     */     //   1858: swap
/*     */     //   1859: astore #32
/*     */     //   1861: aload #26
/*     */     //   1863: aload #32
/*     */     //   1865: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1870: aload #32
/*     */     //   1872: goto -> 1877
/*     */     //   1875: aload #29
/*     */     //   1877: nop
/*     */     //   1878: nop
/*     */     //   1879: nop
/*     */     //   1880: checkcast kotlin/jvm/functions/Function1
/*     */     //   1883: astore #25
/*     */     //   1885: aload #8
/*     */     //   1887: invokeinterface endReplaceGroup : ()V
/*     */     //   1892: aload #25
/*     */     //   1894: invokestatic onSizeChanged : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   1897: astore #25
/*     */     //   1899: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1902: invokevirtual getCenterStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   1905: astore #26
/*     */     //   1907: bipush #48
/*     */     //   1909: istore #28
/*     */     //   1911: nop
/*     */     //   1912: iconst_0
/*     */     //   1913: istore #29
/*     */     //   1915: aload #8
/*     */     //   1917: ldc_w 733328855
/*     */     //   1920: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   1923: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1926: iconst_0
/*     */     //   1927: istore #27
/*     */     //   1929: aload #26
/*     */     //   1931: iload #27
/*     */     //   1933: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1936: astore #30
/*     */     //   1938: bipush #112
/*     */     //   1940: iload #28
/*     */     //   1942: iconst_3
/*     */     //   1943: ishl
/*     */     //   1944: iand
/*     */     //   1945: istore #31
/*     */     //   1947: nop
/*     */     //   1948: iconst_0
/*     */     //   1949: istore #32
/*     */     //   1951: aload #8
/*     */     //   1953: ldc_w -1323940314
/*     */     //   1956: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1959: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1962: aload #8
/*     */     //   1964: iconst_0
/*     */     //   1965: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1968: istore #33
/*     */     //   1970: aload #8
/*     */     //   1972: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1977: astore #34
/*     */     //   1979: aload #8
/*     */     //   1981: aload #25
/*     */     //   1983: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1986: astore #35
/*     */     //   1988: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1991: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1994: astore #36
/*     */     //   1996: bipush #6
/*     */     //   1998: sipush #896
/*     */     //   2001: iload #31
/*     */     //   2003: bipush #6
/*     */     //   2005: ishl
/*     */     //   2006: iand
/*     */     //   2007: ior
/*     */     //   2008: istore #37
/*     */     //   2010: nop
/*     */     //   2011: iconst_0
/*     */     //   2012: istore #38
/*     */     //   2014: aload #8
/*     */     //   2016: ldc_w -692256719
/*     */     //   2019: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   2022: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2025: aload #8
/*     */     //   2027: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   2032: instanceof androidx/compose/runtime/Applier
/*     */     //   2035: ifne -> 2041
/*     */     //   2038: invokestatic invalidApplier : ()V
/*     */     //   2041: aload #8
/*     */     //   2043: invokeinterface startReusableNode : ()V
/*     */     //   2048: aload #8
/*     */     //   2050: invokeinterface getInserting : ()Z
/*     */     //   2055: ifeq -> 2070
/*     */     //   2058: aload #8
/*     */     //   2060: aload #36
/*     */     //   2062: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   2067: goto -> 2077
/*     */     //   2070: aload #8
/*     */     //   2072: invokeinterface useNode : ()V
/*     */     //   2077: aload #8
/*     */     //   2079: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   2082: astore #39
/*     */     //   2084: iconst_0
/*     */     //   2085: istore #40
/*     */     //   2087: aload #39
/*     */     //   2089: aload #30
/*     */     //   2091: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2094: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2097: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2100: aload #39
/*     */     //   2102: aload #34
/*     */     //   2104: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2107: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2110: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2113: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2116: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2119: astore #41
/*     */     //   2121: iconst_0
/*     */     //   2122: istore #42
/*     */     //   2124: aload #39
/*     */     //   2126: astore #43
/*     */     //   2128: iconst_0
/*     */     //   2129: istore #44
/*     */     //   2131: aload #43
/*     */     //   2133: invokeinterface getInserting : ()Z
/*     */     //   2138: ifne -> 2159
/*     */     //   2141: aload #43
/*     */     //   2143: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2148: iload #33
/*     */     //   2150: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2153: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2156: ifne -> 2185
/*     */     //   2159: aload #43
/*     */     //   2161: iload #33
/*     */     //   2163: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2166: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2171: aload #39
/*     */     //   2173: iload #33
/*     */     //   2175: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2178: aload #41
/*     */     //   2180: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2185: nop
/*     */     //   2186: nop
/*     */     //   2187: nop
/*     */     //   2188: aload #39
/*     */     //   2190: aload #35
/*     */     //   2192: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2195: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2198: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2201: nop
/*     */     //   2202: nop
/*     */     //   2203: aload #8
/*     */     //   2205: bipush #14
/*     */     //   2207: iload #37
/*     */     //   2209: bipush #6
/*     */     //   2211: ishr
/*     */     //   2212: iand
/*     */     //   2213: istore #45
/*     */     //   2215: astore #46
/*     */     //   2217: iconst_0
/*     */     //   2218: istore #47
/*     */     //   2220: aload #46
/*     */     //   2222: ldc_w -2146769399
/*     */     //   2225: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   2228: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2231: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   2234: aload #46
/*     */     //   2236: bipush #6
/*     */     //   2238: bipush #112
/*     */     //   2240: iload #28
/*     */     //   2242: bipush #6
/*     */     //   2244: ishr
/*     */     //   2245: iand
/*     */     //   2246: ior
/*     */     //   2247: istore #48
/*     */     //   2249: astore #49
/*     */     //   2251: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   2254: astore #50
/*     */     //   2256: iconst_0
/*     */     //   2257: istore #51
/*     */     //   2259: iconst_2
/*     */     //   2260: anewarray androidx/compose/runtime/ProvidedValue
/*     */     //   2263: astore #52
/*     */     //   2265: aload #52
/*     */     //   2267: iconst_0
/*     */     //   2268: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   2271: aload #15
/*     */     //   2273: aload #14
/*     */     //   2275: invokestatic Dropdown$lambda$8 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   2278: aload #49
/*     */     //   2280: iconst_0
/*     */     //   2281: invokevirtual contentFor-6nTENxs : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   2284: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   2289: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   2292: aastore
/*     */     //   2293: aload #52
/*     */     //   2295: iconst_1
/*     */     //   2296: invokestatic getLocalTextStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   2299: invokestatic getLocalTextStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   2302: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   2305: astore #53
/*     */     //   2307: iconst_0
/*     */     //   2308: istore #54
/*     */     //   2310: iconst_0
/*     */     //   2311: istore #55
/*     */     //   2313: aload #49
/*     */     //   2315: ldc_w 2023513938
/*     */     //   2318: ldc_w 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   2321: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2324: aload #49
/*     */     //   2326: aload #53
/*     */     //   2328: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   2333: astore #56
/*     */     //   2335: aload #49
/*     */     //   2337: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2340: aload #56
/*     */     //   2342: checkcast androidx/compose/ui/text/TextStyle
/*     */     //   2345: aload #15
/*     */     //   2347: aload #14
/*     */     //   2349: invokestatic Dropdown$lambda$8 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   2352: aload #49
/*     */     //   2354: iconst_0
/*     */     //   2355: invokevirtual contentFor-6nTENxs : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   2358: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   2363: checkcast androidx/compose/ui/graphics/Color
/*     */     //   2366: invokevirtual unbox-impl : ()J
/*     */     //   2369: lconst_0
/*     */     //   2370: aconst_null
/*     */     //   2371: aconst_null
/*     */     //   2372: aconst_null
/*     */     //   2373: aconst_null
/*     */     //   2374: aconst_null
/*     */     //   2375: lconst_0
/*     */     //   2376: aconst_null
/*     */     //   2377: aconst_null
/*     */     //   2378: aconst_null
/*     */     //   2379: lconst_0
/*     */     //   2380: aconst_null
/*     */     //   2381: aconst_null
/*     */     //   2382: aconst_null
/*     */     //   2383: iconst_0
/*     */     //   2384: iconst_0
/*     */     //   2385: lconst_0
/*     */     //   2386: aconst_null
/*     */     //   2387: aconst_null
/*     */     //   2388: aconst_null
/*     */     //   2389: iconst_0
/*     */     //   2390: iconst_0
/*     */     //   2391: aconst_null
/*     */     //   2392: ldc_w 16777214
/*     */     //   2395: aconst_null
/*     */     //   2396: invokestatic copy-p1EtxEg$default : (Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;
/*     */     //   2399: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   2402: aastore
/*     */     //   2403: aload #52
/*     */     //   2405: ldc_w 1762864020
/*     */     //   2408: iconst_1
/*     */     //   2409: new org/jetbrains/jewel/ui/component/DropdownKt$Dropdown$8$1
/*     */     //   2412: dup
/*     */     //   2413: aload #5
/*     */     //   2415: lload #20
/*     */     //   2417: aload #7
/*     */     //   2419: aload #50
/*     */     //   2421: aload #14
/*     */     //   2423: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/DropdownStyle;JLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/MutableState;)V
/*     */     //   2426: aload #49
/*     */     //   2428: bipush #54
/*     */     //   2430: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   2433: checkcast kotlin/jvm/functions/Function2
/*     */     //   2436: aload #49
/*     */     //   2438: bipush #48
/*     */     //   2440: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*     */     //   2443: ior
/*     */     //   2444: invokestatic CompositionLocalProvider : ([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   2447: aload #49
/*     */     //   2449: ldc_w -949109379
/*     */     //   2452: invokeinterface startReplaceGroup : (I)V
/*     */     //   2457: aload #12
/*     */     //   2459: invokestatic Dropdown$lambda$2 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   2462: ifeq -> 2795
/*     */     //   2465: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   2468: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   2471: astore #53
/*     */     //   2473: iconst_0
/*     */     //   2474: istore #54
/*     */     //   2476: iconst_0
/*     */     //   2477: istore #55
/*     */     //   2479: aload #49
/*     */     //   2481: ldc_w 2023513938
/*     */     //   2484: ldc_w 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   2487: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2490: aload #49
/*     */     //   2492: aload #53
/*     */     //   2494: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   2499: astore #56
/*     */     //   2501: aload #49
/*     */     //   2503: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2506: aload #56
/*     */     //   2508: checkcast androidx/compose/ui/unit/Density
/*     */     //   2511: astore #52
/*     */     //   2513: aload_2
/*     */     //   2514: aload #49
/*     */     //   2516: ldc_w -949095743
/*     */     //   2519: invokeinterface startReplaceGroup : (I)V
/*     */     //   2524: aload #49
/*     */     //   2526: astore #55
/*     */     //   2528: iconst_0
/*     */     //   2529: istore #56
/*     */     //   2531: nop
/*     */     //   2532: iconst_0
/*     */     //   2533: istore #57
/*     */     //   2535: aload #55
/*     */     //   2537: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2542: astore #58
/*     */     //   2544: iconst_0
/*     */     //   2545: istore #59
/*     */     //   2547: aload #58
/*     */     //   2549: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2552: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2555: if_acmpne -> 2587
/*     */     //   2558: astore #60
/*     */     //   2560: iconst_0
/*     */     //   2561: istore #61
/*     */     //   2563: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   2568: aload #60
/*     */     //   2570: swap
/*     */     //   2571: astore #61
/*     */     //   2573: aload #55
/*     */     //   2575: aload #61
/*     */     //   2577: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2582: aload #61
/*     */     //   2584: goto -> 2589
/*     */     //   2587: aload #58
/*     */     //   2589: nop
/*     */     //   2590: nop
/*     */     //   2591: nop
/*     */     //   2592: checkcast kotlin/jvm/functions/Function1
/*     */     //   2595: astore #54
/*     */     //   2597: aload #49
/*     */     //   2599: invokeinterface endReplaceGroup : ()V
/*     */     //   2604: aload #54
/*     */     //   2606: invokestatic focusProperties : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   2609: aload #52
/*     */     //   2611: astore #54
/*     */     //   2613: astore #60
/*     */     //   2615: iconst_0
/*     */     //   2616: istore #55
/*     */     //   2618: aload #54
/*     */     //   2620: aload #24
/*     */     //   2622: invokestatic Dropdown$lambda$14 : (Landroidx/compose/runtime/MutableIntState;)I
/*     */     //   2625: invokeinterface toDp-u2uoSUM : (I)F
/*     */     //   2630: invokestatic box-impl : (F)Landroidx/compose/ui/unit/Dp;
/*     */     //   2633: aload #60
/*     */     //   2635: swap
/*     */     //   2636: invokevirtual unbox-impl : ()F
/*     */     //   2639: fconst_0
/*     */     //   2640: iconst_2
/*     */     //   2641: aconst_null
/*     */     //   2642: invokestatic defaultMinSize-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2645: astore #53
/*     */     //   2647: aload #5
/*     */     //   2649: invokevirtual getMenuStyle : ()Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*     */     //   2652: astore #54
/*     */     //   2654: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   2657: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   2660: astore #55
/*     */     //   2662: aload #49
/*     */     //   2664: ldc_w -949106002
/*     */     //   2667: invokeinterface startReplaceGroup : (I)V
/*     */     //   2672: aload #49
/*     */     //   2674: astore #57
/*     */     //   2676: aload #49
/*     */     //   2678: aload #14
/*     */     //   2680: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   2685: istore #58
/*     */     //   2687: nop
/*     */     //   2688: iconst_0
/*     */     //   2689: istore #59
/*     */     //   2691: aload #57
/*     */     //   2693: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2698: astore #61
/*     */     //   2700: iconst_0
/*     */     //   2701: istore #62
/*     */     //   2703: iload #58
/*     */     //   2705: ifne -> 2719
/*     */     //   2708: aload #61
/*     */     //   2710: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2713: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2716: if_acmpne -> 2749
/*     */     //   2719: iconst_0
/*     */     //   2720: istore #63
/*     */     //   2722: aload #12
/*     */     //   2724: aload #14
/*     */     //   2726: aload #13
/*     */     //   2728: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   2733: astore #64
/*     */     //   2735: aload #57
/*     */     //   2737: aload #64
/*     */     //   2739: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2744: aload #64
/*     */     //   2746: goto -> 2751
/*     */     //   2749: aload #61
/*     */     //   2751: nop
/*     */     //   2752: nop
/*     */     //   2753: nop
/*     */     //   2754: checkcast kotlin/jvm/functions/Function1
/*     */     //   2757: astore #56
/*     */     //   2759: aload #49
/*     */     //   2761: invokeinterface endReplaceGroup : ()V
/*     */     //   2766: aload #56
/*     */     //   2768: aload #55
/*     */     //   2770: aload #53
/*     */     //   2772: aload #54
/*     */     //   2774: aconst_null
/*     */     //   2775: aload #6
/*     */     //   2777: aload #49
/*     */     //   2779: bipush #48
/*     */     //   2781: ldc_w 458752
/*     */     //   2784: iload #11
/*     */     //   2786: iconst_3
/*     */     //   2787: ishr
/*     */     //   2788: iand
/*     */     //   2789: ior
/*     */     //   2790: bipush #16
/*     */     //   2792: invokestatic PopupMenu : (Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
/*     */     //   2795: aload #49
/*     */     //   2797: invokeinterface endReplaceGroup : ()V
/*     */     //   2802: nop
/*     */     //   2803: aload #46
/*     */     //   2805: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2808: aload #8
/*     */     //   2810: invokeinterface endNode : ()V
/*     */     //   2815: aload #8
/*     */     //   2817: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2820: nop
/*     */     //   2821: aload #8
/*     */     //   2823: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2826: nop
/*     */     //   2827: aload #8
/*     */     //   2829: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2832: nop
/*     */     //   2833: invokestatic isTraceInProgress : ()Z
/*     */     //   2836: ifeq -> 2852
/*     */     //   2839: invokestatic traceEventEnd : ()V
/*     */     //   2842: goto -> 2852
/*     */     //   2845: aload #8
/*     */     //   2847: invokeinterface skipToGroupEnd : ()V
/*     */     //   2852: aload #8
/*     */     //   2854: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   2859: dup
/*     */     //   2860: ifnull -> 2892
/*     */     //   2863: aload_0
/*     */     //   2864: iload_1
/*     */     //   2865: aload_2
/*     */     //   2866: aload_3
/*     */     //   2867: aload #4
/*     */     //   2869: aload #5
/*     */     //   2871: aload #6
/*     */     //   2873: aload #7
/*     */     //   2875: iload #9
/*     */     //   2877: iload #10
/*     */     //   2879: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/DropdownStyle;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;II)Lkotlin/jvm/functions/Function2;
/*     */     //   2884: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   2889: goto -> 2893
/*     */     //   2892: pop
/*     */     //   2893: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #66	-> 14
/*     */     //   #58	-> 474
/*     */     //   #59	-> 488
/*     */     //   #60	-> 497
/*     */     //   #61	-> 512
/*     */     //   #62	-> 524
/*     */     //   #219	-> 543
/*     */     //   #220	-> 555
/*     */     //   #221	-> 566
/*     */     //   #62	-> 569
/*     */     //   #221	-> 572
/*     */     //   #222	-> 574
/*     */     //   #223	-> 583
/*     */     //   #224	-> 588
/*     */     //   #220	-> 590
/*     */     //   #219	-> 591
/*     */     //   #219	-> 592
/*     */     //   #62	-> 593
/*     */     //   #63	-> 617
/*     */     //   #66	-> 681
/*     */     //   #67	-> 700
/*     */     //   #225	-> 704
/*     */     //   #226	-> 716
/*     */     //   #227	-> 727
/*     */     //   #67	-> 730
/*     */     //   #227	-> 740
/*     */     //   #228	-> 742
/*     */     //   #229	-> 751
/*     */     //   #230	-> 756
/*     */     //   #226	-> 758
/*     */     //   #225	-> 759
/*     */     //   #225	-> 760
/*     */     //   #67	-> 761
/*     */     //   #68	-> 793
/*     */     //   #231	-> 797
/*     */     //   #232	-> 809
/*     */     //   #233	-> 820
/*     */     //   #68	-> 823
/*     */     //   #233	-> 833
/*     */     //   #234	-> 835
/*     */     //   #235	-> 844
/*     */     //   #236	-> 849
/*     */     //   #232	-> 851
/*     */     //   #231	-> 852
/*     */     //   #231	-> 853
/*     */     //   #68	-> 854
/*     */     //   #70	-> 901
/*     */     //   #237	-> 905
/*     */     //   #238	-> 917
/*     */     //   #239	-> 933
/*     */     //   #70	-> 936
/*     */     //   #239	-> 959
/*     */     //   #240	-> 961
/*     */     //   #241	-> 970
/*     */     //   #242	-> 975
/*     */     //   #238	-> 977
/*     */     //   #237	-> 978
/*     */     //   #237	-> 979
/*     */     //   #70	-> 980
/*     */     //   #72	-> 1026
/*     */     //   #243	-> 1030
/*     */     //   #244	-> 1042
/*     */     //   #245	-> 1058
/*     */     //   #72	-> 1061
/*     */     //   #245	-> 1085
/*     */     //   #246	-> 1087
/*     */     //   #247	-> 1096
/*     */     //   #248	-> 1101
/*     */     //   #244	-> 1103
/*     */     //   #243	-> 1104
/*     */     //   #243	-> 1105
/*     */     //   #74	-> 1114
/*     */     //   #249	-> 1160
/*     */     //   #250	-> 1172
/*     */     //   #251	-> 1188
/*     */     //   #74	-> 1193
/*     */     //   #251	-> 1211
/*     */     //   #252	-> 1213
/*     */     //   #253	-> 1222
/*     */     //   #254	-> 1227
/*     */     //   #250	-> 1229
/*     */     //   #249	-> 1230
/*     */     //   #249	-> 1231
/*     */     //   #74	-> 1232
/*     */     //   #88	-> 1259
/*     */     //   #89	-> 1266
/*     */     //   #90	-> 1273
/*     */     //   #91	-> 1286
/*     */     //   #92	-> 1293
/*     */     //   #93	-> 1303
/*     */     //   #94	-> 1318
/*     */     //   #96	-> 1348
/*     */     //   #255	-> 1352
/*     */     //   #256	-> 1364
/*     */     //   #257	-> 1375
/*     */     //   #96	-> 1378
/*     */     //   #257	-> 1382
/*     */     //   #258	-> 1384
/*     */     //   #259	-> 1393
/*     */     //   #260	-> 1398
/*     */     //   #256	-> 1400
/*     */     //   #255	-> 1401
/*     */     //   #255	-> 1402
/*     */     //   #96	-> 1403
/*     */     //   #109	-> 1428
/*     */     //   #99	-> 1436
/*     */     //   #110	-> 1437
/*     */     //   #111	-> 1439
/*     */     //   #108	-> 1440
/*     */     //   #100	-> 1441
/*     */     //   #109	-> 1442
/*     */     //   #101	-> 1464
/*     */     //   #261	-> 1468
/*     */     //   #262	-> 1480
/*     */     //   #263	-> 1491
/*     */     //   #101	-> 1506
/*     */     //   #263	-> 1531
/*     */     //   #264	-> 1533
/*     */     //   #265	-> 1542
/*     */     //   #266	-> 1547
/*     */     //   #262	-> 1549
/*     */     //   #261	-> 1550
/*     */     //   #261	-> 1551
/*     */     //   #101	-> 1552
/*     */     //   #100	-> 1566
/*     */     //   #113	-> 1572
/*     */     //   #114	-> 1606
/*     */     //   #267	-> 1610
/*     */     //   #114	-> 1622
/*     */     //   #267	-> 1652
/*     */     //   #115	-> 1659
/*     */     //   #268	-> 1676
/*     */     //   #115	-> 1688
/*     */     //   #268	-> 1714
/*     */     //   #115	-> 1719
/*     */     //   #116	-> 1730
/*     */     //   #117	-> 1761
/*     */     //   #118	-> 1767
/*     */     //   #119	-> 1817
/*     */     //   #269	-> 1821
/*     */     //   #270	-> 1833
/*     */     //   #271	-> 1844
/*     */     //   #119	-> 1849
/*     */     //   #271	-> 1859
/*     */     //   #272	-> 1861
/*     */     //   #273	-> 1870
/*     */     //   #274	-> 1875
/*     */     //   #270	-> 1877
/*     */     //   #269	-> 1878
/*     */     //   #269	-> 1879
/*     */     //   #119	-> 1880
/*     */     //   #120	-> 1899
/*     */     //   #97	-> 1911
/*     */     //   #275	-> 1923
/*     */     //   #276	-> 1926
/*     */     //   #279	-> 1929
/*     */     //   #280	-> 1947
/*     */     //   #281	-> 1959
/*     */     //   #282	-> 1965
/*     */     //   #283	-> 1972
/*     */     //   #284	-> 1981
/*     */     //   #286	-> 1988
/*     */     //   #285	-> 2010
/*     */     //   #287	-> 2022
/*     */     //   #288	-> 2025
/*     */     //   #289	-> 2043
/*     */     //   #290	-> 2048
/*     */     //   #291	-> 2060
/*     */     //   #293	-> 2072
/*     */     //   #295	-> 2077
/*     */     //   #296	-> 2087
/*     */     //   #297	-> 2100
/*     */     //   #299	-> 2113
/*     */     //   #300	-> 2124
/*     */     //   #301	-> 2131
/*     */     //   #302	-> 2159
/*     */     //   #303	-> 2171
/*     */     //   #305	-> 2185
/*     */     //   #300	-> 2186
/*     */     //   #305	-> 2187
/*     */     //   #306	-> 2188
/*     */     //   #307	-> 2201
/*     */     //   #295	-> 2202
/*     */     //   #308	-> 2203
/*     */     //   #309	-> 2228
/*     */     //   #123	-> 2259
/*     */     //   #124	-> 2296
/*     */     //   #310	-> 2321
/*     */     //   #124	-> 2345
/*     */     //   #123	-> 2403
/*     */     //   #125	-> 2405
/*     */     //   #122	-> 2444
/*     */     //   #149	-> 2457
/*     */     //   #150	-> 2465
/*     */     //   #311	-> 2487
/*     */     //   #150	-> 2508
/*     */     //   #160	-> 2513
/*     */     //   #161	-> 2531
/*     */     //   #312	-> 2535
/*     */     //   #313	-> 2547
/*     */     //   #314	-> 2558
/*     */     //   #314	-> 2571
/*     */     //   #315	-> 2573
/*     */     //   #316	-> 2582
/*     */     //   #317	-> 2587
/*     */     //   #313	-> 2589
/*     */     //   #312	-> 2590
/*     */     //   #312	-> 2591
/*     */     //   #161	-> 2592
/*     */     //   #162	-> 2609
/*     */     //   #318	-> 2613
/*     */     //   #162	-> 2618
/*     */     //   #162	-> 2636
/*     */     //   #162	-> 2639
/*     */     //   #163	-> 2647
/*     */     //   #164	-> 2654
/*     */     //   #152	-> 2687
/*     */     //   #319	-> 2691
/*     */     //   #320	-> 2703
/*     */     //   #321	-> 2719
/*     */     //   #152	-> 2722
/*     */     //   #321	-> 2733
/*     */     //   #322	-> 2735
/*     */     //   #323	-> 2744
/*     */     //   #324	-> 2749
/*     */     //   #320	-> 2751
/*     */     //   #319	-> 2752
/*     */     //   #319	-> 2753
/*     */     //   #152	-> 2754
/*     */     //   #164	-> 2768
/*     */     //   #162	-> 2770
/*     */     //   #163	-> 2772
/*     */     //   #165	-> 2775
/*     */     //   #151	-> 2792
/*     */     //   #168	-> 2802
/*     */     //   #309	-> 2803
/*     */     //   #308	-> 2808
/*     */     //   #325	-> 2810
/*     */     //   #287	-> 2817
/*     */     //   #326	-> 2820
/*     */     //   #281	-> 2823
/*     */     //   #327	-> 2826
/*     */     //   #275	-> 2829
/*     */     //   #328	-> 2832
/*     */     //   #169	-> 2845
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   569	3	18	$i$a$-cache-DropdownKt$Dropdown$1	I
/*     */     //   574	11	18	value$iv	Ljava/lang/Object;
/*     */     //   555	36	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   552	39	16	it$iv	Ljava/lang/Object;
/*     */     //   543	50	15	$i$f$cache	I
/*     */     //   540	53	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   540	53	14	invalid$iv	Z
/*     */     //   730	10	19	$i$a$-cache-DropdownKt$Dropdown$expanded$2	I
/*     */     //   742	11	19	value$iv	Ljava/lang/Object;
/*     */     //   716	43	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   713	46	17	it$iv	Ljava/lang/Object;
/*     */     //   704	57	16	$i$f$cache	I
/*     */     //   701	60	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   701	60	15	invalid$iv	Z
/*     */     //   823	10	20	$i$a$-cache-DropdownKt$Dropdown$skipNextClick$2	I
/*     */     //   835	11	20	value$iv	Ljava/lang/Object;
/*     */     //   809	43	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   806	46	18	it$iv	Ljava/lang/Object;
/*     */     //   797	57	17	$i$f$cache	I
/*     */     //   794	60	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   794	60	16	invalid$iv	Z
/*     */     //   936	23	21	$i$a$-cache-DropdownKt$Dropdown$dropdownState$2	I
/*     */     //   961	11	22	value$iv	Ljava/lang/Object;
/*     */     //   917	61	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   914	64	19	it$iv	Ljava/lang/Object;
/*     */     //   905	75	18	$i$f$cache	I
/*     */     //   902	78	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   902	78	17	invalid$iv	Z
/*     */     //   1061	21	20	$i$a$-cache-DropdownKt$Dropdown$2	I
/*     */     //   1087	11	21	value$iv	Ljava/lang/Object;
/*     */     //   1042	62	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1039	65	18	it$iv	Ljava/lang/Object;
/*     */     //   1030	76	17	$i$f$cache	I
/*     */     //   1027	79	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1027	79	16	invalid$iv	Z
/*     */     //   1193	15	21	$i$a$-cache-DropdownKt$Dropdown$3	I
/*     */     //   1213	11	22	value$iv	Ljava/lang/Object;
/*     */     //   1172	58	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1169	61	19	it$iv	Ljava/lang/Object;
/*     */     //   1160	72	18	$i$f$cache	I
/*     */     //   1157	75	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1157	75	17	invalid$iv	Z
/*     */     //   1378	4	31	$i$a$-cache-DropdownKt$Dropdown$componentWidth$2	I
/*     */     //   1384	11	31	value$iv	Ljava/lang/Object;
/*     */     //   1364	37	30	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1361	40	29	it$iv	Ljava/lang/Object;
/*     */     //   1352	51	28	$i$f$cache	I
/*     */     //   1349	54	26	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1349	54	27	invalid$iv	Z
/*     */     //   1506	9	33	$i$a$-cache-DropdownKt$Dropdown$4	I
/*     */     //   1533	11	34	value$iv	Ljava/lang/Object;
/*     */     //   1480	70	32	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1477	73	31	it$iv	Ljava/lang/Object;
/*     */     //   1468	84	30	$i$f$cache	I
/*     */     //   1465	87	28	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1465	87	29	invalid$iv	Z
/*     */     //   1622	30	29	$i$a$-thenIf-DropdownKt$Dropdown$5	I
/*     */     //   1619	33	28	$this$Dropdown_u24lambda_u2418	Landroidx/compose/ui/Modifier;
/*     */     //   1610	47	27	$i$f$thenIf	I
/*     */     //   1607	50	26	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1688	26	30	$i$a$-thenIf-DropdownKt$Dropdown$6	I
/*     */     //   1685	29	29	$this$Dropdown_u24lambda_u2419	Landroidx/compose/ui/Modifier;
/*     */     //   1676	43	28	$i$f$thenIf	I
/*     */     //   1673	46	26	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1673	46	27	precondition$iv	Z
/*     */     //   1849	7	31	$i$a$-cache-DropdownKt$Dropdown$7	I
/*     */     //   1861	11	32	value$iv	Ljava/lang/Object;
/*     */     //   1833	45	30	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1830	48	29	it$iv	Ljava/lang/Object;
/*     */     //   1821	59	28	$i$f$cache	I
/*     */     //   1818	62	26	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1818	62	27	invalid$iv	Z
/*     */     //   2313	29	55	$i$f$getCurrent	I
/*     */     //   2310	32	53	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   2310	32	54	$changed$iv	I
/*     */     //   2479	29	55	$i$f$getCurrent	I
/*     */     //   2476	32	53	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   2476	32	54	$changed$iv	I
/*     */     //   2563	5	61	$i$a$-cache-DropdownKt$Dropdown$8$2	I
/*     */     //   2573	11	61	value$iv	Ljava/lang/Object;
/*     */     //   2547	43	59	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2544	46	58	it$iv	Ljava/lang/Object;
/*     */     //   2535	57	57	$i$f$cache	I
/*     */     //   2532	60	55	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2532	60	56	invalid$iv	Z
/*     */     //   2618	12	55	$i$a$-with-DropdownKt$Dropdown$8$3	I
/*     */     //   2615	15	54	$this$Dropdown_u24lambda_u2427_u24lambda_u2424	Landroidx/compose/ui/unit/Density;
/*     */     //   2722	11	63	$i$a$-cache-DropdownKt$Dropdown$8$4	I
/*     */     //   2735	11	64	value$iv	Ljava/lang/Object;
/*     */     //   2703	49	62	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2700	52	61	it$iv	Ljava/lang/Object;
/*     */     //   2691	63	59	$i$f$cache	I
/*     */     //   2688	66	57	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2688	66	58	invalid$iv	Z
/*     */     //   2513	282	52	density	Landroidx/compose/ui/unit/Density;
/*     */     //   2259	544	51	$i$a$-Box-DropdownKt$Dropdown$8	I
/*     */     //   2256	547	50	$this$Dropdown_u24lambda_u2427	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   2256	547	49	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   2256	547	48	$changed	I
/*     */     //   2220	588	47	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   2217	591	46	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2217	591	45	$changed$iv	I
/*     */     //   2131	55	44	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   2128	58	43	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2124	64	42	$i$f$set-impl	I
/*     */     //   2121	67	41	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   2087	115	40	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   2084	118	39	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2014	807	38	$i$f$ReusableComposeNode	I
/*     */     //   2011	810	36	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   2011	810	37	$changed$iv$iv$iv	I
/*     */     //   1951	876	32	$i$f$Layout	I
/*     */     //   1970	857	33	compositeKeyHash$iv$iv	I
/*     */     //   1979	848	34	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1988	839	35	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1948	879	31	$changed$iv$iv	I
/*     */     //   1915	918	29	$i$f$Box	I
/*     */     //   1938	895	30	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1912	921	25	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1912	921	26	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   1929	904	27	propagateMinConstraints$iv	Z
/*     */     //   1912	921	28	$changed$iv	I
/*     */     //   777	2065	12	expanded$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   870	1972	13	skipNextClick$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   996	1846	14	dropdownState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1266	1576	15	colors	Lorg/jetbrains/jewel/ui/component/styling/DropdownColors;
/*     */     //   1273	1569	16	metrics	Lorg/jetbrains/jewel/ui/component/styling/DropdownMetrics;
/*     */     //   1286	1556	17	shape	Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1293	1549	18	minSize	J
/*     */     //   1303	1539	20	arrowMinSize	J
/*     */     //   1318	1524	22	borderColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   1332	1510	23	hasNoOutline	Z
/*     */     //   1419	1423	24	componentWidth$delegate	Landroidx/compose/runtime/MutableIntState;
/*     */     //   29	2865	11	$dirty	I
/*     */     //   0	2894	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	2894	1	enabled	Z
/*     */     //   0	2894	2	menuModifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	2894	3	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	2894	4	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	2894	5	style	Lorg/jetbrains/jewel/ui/component/styling/DropdownStyle;
/*     */     //   0	2894	6	menuContent	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2894	7	content	Lkotlin/jvm/functions/Function3;
/*     */     //   0	2894	8	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	2894	9	$changed	I
/*     */   }
/*     */   
/*  67 */   private static final boolean Dropdown$lambda$2(MutableState $expanded$delegate) { State state = (State)$expanded$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 329 */       (Boolean)state.getValue()).booleanValue(); } private static final void Dropdown$lambda$3(MutableState $expanded$delegate, boolean <set-?>) { MutableState mutableState = $expanded$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 330 */     mutableState.setValue(value$iv); } private static final boolean Dropdown$lambda$5(MutableState $skipNextClick$delegate) { State state = (State)$skipNextClick$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 332 */     return ((Boolean)state.getValue()).booleanValue(); } private static final void Dropdown$lambda$6(MutableState $skipNextClick$delegate, boolean <set-?>) { MutableState mutableState = $skipNextClick$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 333 */     mutableState.setValue(value$iv); } private static final long Dropdown$lambda$8(MutableState $dropdownState$delegate) { State state = (State)$dropdownState$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 335 */     return ((DropdownState)state.getValue()).unbox-impl(); } private static final void Dropdown$lambda$9(MutableState $dropdownState$delegate, long <set-?>) { MutableState mutableState = $dropdownState$delegate; Object object1 = null, object2 = null; Object value$iv = DropdownState.box-impl(<set-?>); int $i$f$setValue = 0;
/* 336 */     mutableState.setValue(value$iv); } private static final long Dropdown$lambda$12(State $borderColor$delegate) { State state = $borderColor$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 338 */     return ((Color)state.getValue()).unbox-impl(); } @DebugMetadata(f = "Dropdown.kt", l = {75}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.DropdownKt$Dropdown$3$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class DropdownKt$Dropdown$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/* 339 */     int label; DropdownKt$Dropdown$3$1(MutableInteractionSource $interactionSource, MutableState<DropdownState> $dropdownState$delegate, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$dropdownState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { DropdownKt.Dropdown$lambda$9(this.$dropdownState$delegate, DropdownState.copy-17HSnUM$default(DropdownKt.Dropdown$lambda$8(this.$dropdownState$delegate), false, false, true, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { DropdownKt.Dropdown$lambda$9(this.$dropdownState$delegate, DropdownState.copy-17HSnUM$default(DropdownKt.Dropdown$lambda$8(this.$dropdownState$delegate), false, false, false, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { DropdownKt.Dropdown$lambda$9(this.$dropdownState$delegate, DropdownState.copy-17HSnUM$default(DropdownKt.Dropdown$lambda$8(this.$dropdownState$delegate), false, false, false, true, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { DropdownKt.Dropdown$lambda$9(this.$dropdownState$delegate, DropdownState.copy-17HSnUM$default(DropdownKt.Dropdown$lambda$8(this.$dropdownState$delegate), false, false, false, false, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { DropdownKt.Dropdown$lambda$9(this.$dropdownState$delegate, DropdownState.copy-17HSnUM$default(DropdownKt.Dropdown$lambda$8(this.$dropdownState$delegate), false, true, false, false, false, 29, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { DropdownKt.Dropdown$lambda$9(this.$dropdownState$delegate, DropdownState.copy-17HSnUM$default(DropdownKt.Dropdown$lambda$8(this.$dropdownState$delegate), false, false, false, false, false, 29, null)); }  return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$dropdownState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { DropdownKt.Dropdown$lambda$9(this.$dropdownState$delegate, DropdownState.copy-17HSnUM$default(DropdownKt.Dropdown$lambda$8(this.$dropdownState$delegate), false, false, true, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { DropdownKt.Dropdown$lambda$9(this.$dropdownState$delegate, DropdownState.copy-17HSnUM$default(DropdownKt.Dropdown$lambda$8(this.$dropdownState$delegate), false, false, false, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { DropdownKt.Dropdown$lambda$9(this.$dropdownState$delegate, DropdownState.copy-17HSnUM$default(DropdownKt.Dropdown$lambda$8(this.$dropdownState$delegate), false, false, false, true, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { DropdownKt.Dropdown$lambda$9(this.$dropdownState$delegate, DropdownState.copy-17HSnUM$default(DropdownKt.Dropdown$lambda$8(this.$dropdownState$delegate), false, false, false, false, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { DropdownKt.Dropdown$lambda$9(this.$dropdownState$delegate, DropdownState.copy-17HSnUM$default(DropdownKt.Dropdown$lambda$8(this.$dropdownState$delegate), false, true, false, false, false, 29, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { DropdownKt.Dropdown$lambda$9(this.$dropdownState$delegate, DropdownState.copy-17HSnUM$default(DropdownKt.Dropdown$lambda$8(this.$dropdownState$delegate), false, false, false, false, false, 29, null)); }  return Unit.INSTANCE; } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super DropdownKt$Dropdown$3$1> $completion) { return (Continuation<Unit>)new DropdownKt$Dropdown$3$1(this.$interactionSource, this.$dropdownState$delegate, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((DropdownKt$Dropdown$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final int Dropdown$lambda$14(MutableIntState $componentWidth$delegate) { IntState intState = (IntState)$componentWidth$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return intState.getIntValue(); } private static final void Dropdown$lambda$15(MutableIntState $componentWidth$delegate, int <set-?>) { MutableIntState mutableIntState = $componentWidth$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 340 */     mutableIntState.setIntValue(<set-?>); }
/*     */ 
/*     */   
/*     */   private static final Unit Dropdown$lambda$17$lambda$16(MutableState<Boolean> $skipNextClick$delegate, MutableState<Boolean> $expanded$delegate) {
/*     */     if (!Dropdown$lambda$5($skipNextClick$delegate))
/*     */       Dropdown$lambda$3($expanded$delegate, !Dropdown$lambda$2($expanded$delegate)); 
/*     */     Dropdown$lambda$6($skipNextClick$delegate, false);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Dropdown$lambda$21$lambda$20(MutableIntState $componentWidth$delegate, IntSize it) {
/*     */     Dropdown$lambda$15($componentWidth$delegate, IntSize.getWidth-impl(it.unbox-impl()));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nDropdown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dropdown.kt\norg/jetbrains/jewel/ui/component/DropdownKt$Dropdown$8$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,218:1\n71#2:219\n69#2,5:220\n74#2:253\n78#2:257\n71#2:258\n69#2,5:259\n74#2:292\n78#2:296\n79#3,6:225\n86#3,4:240\n90#3,2:250\n94#3:256\n79#3,6:264\n86#3,4:279\n90#3,2:289\n94#3:295\n368#4,9:231\n377#4:252\n378#4,2:254\n368#4,9:270\n377#4:291\n378#4,2:293\n4034#5,6:244\n4034#5,6:283\n*S KotlinDebug\n*F\n+ 1 Dropdown.kt\norg/jetbrains/jewel/ui/component/DropdownKt$Dropdown$8$1\n*L\n126#1:219\n126#1:220,5\n126#1:253\n126#1:257\n133#1:258\n133#1:259,5\n133#1:292\n133#1:296\n126#1:225,6\n126#1:240,4\n126#1:250,2\n126#1:256\n133#1:264,6\n133#1:279,4\n133#1:289,2\n133#1:295\n126#1:231,9\n126#1:252\n126#1:254,2\n133#1:270,9\n133#1:291\n133#1:293,2\n126#1:244,6\n133#1:283,6\n*E\n"})
/*     */   static final class DropdownKt$Dropdown$8$1 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(1762864020, $changed, -1, "org.jetbrains.jewel.ui.component.Dropdown.<anonymous>.<anonymous> (Dropdown.kt:125)"); 
/*     */         Modifier modifier1 = PaddingKt.padding-qDBjuR0$default(PaddingKt.padding(SizeKt.fillMaxWidth$default((Modifier)Modifier.Companion, 0.0F, 1, null), this.$style.getMetrics().getContentPadding()), 0.0F, 0.0F, DpSize.getWidth-D9Ej5fM(this.$arrowMinSize), 0.0F, 11, null);
/*     */         Alignment alignment1 = Alignment.Companion.getCenterStart();
/*     */         Function3<BoxScope, Composer, Integer, Unit> function3 = this.$content;
/*     */         int $changed$iv = 48;
/*     */         int $i$f$Box = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/*     */         boolean propagateMinConstraints$iv = false;
/*     */         MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(alignment1, propagateMinConstraints$iv);
/*     */         int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*     */         int $i$f$Layout = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*     */         int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*     */         CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*     */         Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */         Function0 function01 = ComposeUiNode.Companion.getConstructor();
/*     */         int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6;
/*     */         int $i$f$ReusableComposeNode = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*     */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier))
/*     */           ComposablesKt.invalidApplier(); 
/*     */         $composer.startReusableNode();
/*     */         if ($composer.getInserting()) {
/*     */           $composer.createNode(function01);
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
/*     */         int i6 = 0xE & $changed$iv$iv$iv >> 6;
/*     */         Composer $composer$iv = $composer;
/*     */         int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
/*     */         function3.invoke(BoxScopeInstance.INSTANCE, $composer$iv, Integer.valueOf(0x6 | 0x70 & $changed$iv >> 6));
/*     */         ComposerKt.sourceInformationMarkerEnd($composer$iv);
/*     */         $composer.endNode();
/*     */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         Modifier modifier$iv = this.$this_Box.align(SizeKt.size-6HolHcs((Modifier)Modifier.Companion, this.$arrowMinSize), Alignment.Companion.getCenterEnd());
/*     */         Alignment contentAlignment$iv = Alignment.Companion.getCenter();
/*     */         DropdownStyle dropdownStyle = this.$style;
/*     */         MutableState<DropdownState> mutableState = this.$dropdownState$delegate;
/*     */         int i = 48, j = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/*     */         propagateMinConstraints$iv = false;
/*     */         MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv);
/*     */         int k = 0x70 & i << 3;
/*     */         int m = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*     */         int n = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*     */         CompositionLocalMap compositionLocalMap1 = $composer.getCurrentCompositionLocalMap();
/*     */         Modifier modifier2 = ComposedModifierKt.materializeModifier($composer, modifier$iv);
/*     */         Function0 function02 = ComposeUiNode.Companion.getConstructor();
/*     */         int i1 = 0x6 | 0x380 & k << 6;
/*     */         int i2 = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*     */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier))
/*     */           ComposablesKt.invalidApplier(); 
/*     */         $composer.startReusableNode();
/*     */         if ($composer.getInserting()) {
/*     */           $composer.createNode(function02);
/*     */         } else {
/*     */           $composer.useNode();
/*     */         } 
/*     */         Composer composer1 = Updater.constructor-impl($composer);
/*     */         int i3 = 0;
/*     */         Updater.set-impl(composer1, measurePolicy1, ComposeUiNode.Companion.getSetMeasurePolicy());
/*     */         Updater.set-impl(composer1, compositionLocalMap1, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         Function2 function21 = ComposeUiNode.Companion.getSetCompositeKeyHash();
/*     */         int i4 = 0;
/*     */         Composer composer2 = composer1;
/*     */         int i5 = 0;
/*     */         if (composer2.getInserting() || !Intrinsics.areEqual(composer2.rememberedValue(), Integer.valueOf(n))) {
/*     */           composer2.updateRememberedValue(Integer.valueOf(n));
/*     */           composer1.apply(Integer.valueOf(n), function21);
/*     */         } 
/*     */         Updater.set-impl(composer1, modifier2, ComposeUiNode.Companion.getSetModifier());
/*     */         int i7 = 0xE & i1 >> 6;
/*     */         Composer composer3 = $composer;
/*     */         int i8 = 0;
/*     */         ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
/*     */         int i9 = 0x6 | 0x70 & i >> 6;
/*     */         Composer composer4 = composer3;
/*     */         BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE;
/*     */         int $i$a$-Box-DropdownKt$Dropdown$8$1$1 = 0;
/*     */         float alpha = DropdownState.isEnabled-impl(DropdownKt.Dropdown$lambda$8(mutableState)) ? 1.0F : 0.5F;
/*     */         ColorFilter colorFilter = DropdownState.isEnabled-impl(DropdownKt.Dropdown$lambda$8(mutableState)) ? null : DisabledColorFilterKt.disabled(ColorFilter.Companion);
/*     */         Modifier modifier3 = AlphaKt.alpha((Modifier)Modifier.Companion, alpha);
/*     */         IconKey iconKey = dropdownStyle.getIcons().getChevronDown();
/*     */         PainterHint painterHint = StatefulKt.Stateful((InteractiveComponentState)DropdownState.box-impl(DropdownKt.Dropdown$lambda$8(mutableState)));
/*     */         IconKt.Icon(iconKey, "Dropdown Chevron", modifier3, (Class<?>)null, colorFilter, painterHint, composer4, 48, 8);
/*     */         ComposerKt.sourceInformationMarkerEnd(composer3);
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
/*     */     DropdownKt$Dropdown$8$1(DropdownStyle $style, long $arrowMinSize, Function3<BoxScope, Composer, Integer, Unit> $content, BoxScope $receiver, MutableState<DropdownState> $dropdownState$delegate) {}
/*     */   }
/*     */   
/*     */   private static final boolean Dropdown$lambda$27$lambda$26$lambda$25(MutableState<Boolean> $expanded$delegate, MutableState<DropdownState> $dropdownState$delegate, MutableState<Boolean> $skipNextClick$delegate, InputMode it) {
/*     */     Dropdown$lambda$3($expanded$delegate, false);
/*     */     int i = InputMode.Companion.getTouch-aOaMEAU();
/*     */     if (((it == null) ? false : InputMode.equals-impl0(it.unbox-impl(), i)) && DropdownState.isHovered-impl(Dropdown$lambda$8($dropdownState$delegate)))
/*     */       Dropdown$lambda$6($skipNextClick$delegate, true); 
/*     */     return true;
/*     */   }
/*     */   
/*     */   private static final Unit Dropdown$lambda$27$lambda$23$lambda$22(FocusProperties $this$focusProperties) {
/*     */     Intrinsics.checkNotNullParameter($this$focusProperties, "$this$focusProperties");
/*     */     $this$focusProperties.setCanFocus(true);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Dropdown$lambda$28(Modifier $modifier, boolean $enabled, Modifier $menuModifier, Outline $outline, MutableInteractionSource $interactionSource, DropdownStyle $style, Function1<? super MenuScope, Unit> $menuContent, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Dropdown($modifier, $enabled, $menuModifier, $outline, $interactionSource, $style, $menuContent, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\DropdownKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */