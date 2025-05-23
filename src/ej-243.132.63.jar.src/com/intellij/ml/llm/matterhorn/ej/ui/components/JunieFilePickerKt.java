/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.lazy.LazyItemScope;
/*     */ import androidx.compose.foundation.lazy.LazyListScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.ProduceStateScope;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.LayoutCoordinates;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.AttachedFile;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.GuidelinesEntry;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000X\n\000\n\002\020\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\020\013\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\003\032±\001\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\0032\b\020\005\032\004\030\0010\0062\022\020\007\032\016\022\004\022\0020\t\022\004\022\0020\0010\b2\f\020\n\032\b\022\004\022\0020\0010\0132\f\020\f\032\b\022\004\022\0020\0010\0132\022\020\r\032\016\022\004\022\0020\006\022\004\022\0020\0010\b2\f\020\016\032\b\022\004\022\0020\0010\0132\f\020\017\032\b\022\004\022\0020\0010\0132\f\020\020\032\b\022\004\022\0020\0010\0132\034\020\021\032\030\b\001\022\n\022\b\022\004\022\0020\0230\022\022\006\022\004\030\0010\0240\bH\007¢\006\002\020\025\032?\020\026\032\0020\0012\006\020\027\032\0020\0302&\020\031\032\"\022\023\022\0210\023¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\004\022\0020\0010\b¢\006\002\b\035H\003¢\006\004\b\036\020\037¨\006 ²\006\n\020!\032\0020\"X\002²\006\n\020#\032\0020\023X\002²\006\n\020$\032\0020\023X\002²\006\n\020%\032\0020\023X\002"}, d2 = {"JunieFilePickerDialog", "", "recentFiles", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/components/FileListEntry;", "guidelines", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/GuidelinesEntry;", "onFileChosen", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFile;", "onSelectFileFromProject", "Lkotlin/Function0;", "onCreateNewGuidelines", "onSelectGuidelines", "onCloseRequest", "onCreateAiIgnoreFile", "onOpenAiIgnoreFile", "hasAIIgnoreFile", "Lkotlin/coroutines/Continuation;", "", "", "(Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/GuidelinesEntry;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "HoverHighlightRow", "hoverColor", "Landroidx/compose/ui/graphics/Color;", "content", "Lkotlin/ParameterName;", "name", "hovered", "Landroidx/compose/runtime/Composable;", "HoverHighlightRow-Iv8Zu3U", "(JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "ej-ui", "dialogWidthPx", "", "hasIgnoreFile", "itemHovered", "isHovered"})
/*     */ @SourceDebugExtension({"SMAP\nJunieFilePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,234:1\n1225#2,6:235\n1225#2,6:246\n1225#2,6:288\n1225#2,6:336\n1225#2,6:343\n149#3:241\n149#3:242\n149#3:243\n149#3:244\n149#3:245\n149#3:294\n149#3:295\n149#3:342\n86#4:252\n83#4,6:253\n89#4:287\n93#4:335\n79#5,6:259\n86#5,4:274\n90#5,2:284\n79#5,6:299\n86#5,4:314\n90#5,2:324\n94#5:330\n94#5:334\n79#5,6:356\n86#5,4:371\n90#5,2:381\n94#5:387\n368#6,9:265\n377#6:286\n368#6,9:305\n377#6:326\n378#6,2:328\n378#6,2:332\n368#6,9:362\n377#6:383\n378#6,2:385\n4034#7,6:278\n4034#7,6:318\n4034#7,6:375\n99#8,3:296\n102#8:327\n106#8:331\n99#8:349\n96#8,6:350\n102#8:384\n106#8:388\n81#9:389\n107#9,2:390\n81#9:392\n81#9:393\n107#9,2:394\n*S KotlinDebug\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt\n*L\n46#1:235,6\n55#1:246,6\n107#1:288,6\n214#1:336,6\n222#1:343,6\n50#1:241\n51#1:242\n52#1:243\n53#1:244\n54#1:245\n142#1:294\n149#1:295\n220#1:342\n48#1:252\n48#1:253,6\n48#1:287\n48#1:335\n48#1:259,6\n48#1:274,4\n48#1:284,2\n148#1:299,6\n148#1:314,4\n148#1:324,2\n148#1:330\n48#1:334\n216#1:356,6\n216#1:371,4\n216#1:381,2\n216#1:387\n48#1:265,9\n48#1:286\n148#1:305,9\n148#1:326\n148#1:328,2\n48#1:332,2\n216#1:362,9\n216#1:383\n216#1:385,2\n48#1:278,6\n148#1:318,6\n216#1:375,6\n148#1:296,3\n148#1:327\n148#1:331\n216#1:349\n216#1:350,6\n216#1:384\n216#1:388\n46#1:389\n46#1:390,2\n107#1:392\n214#1:393\n214#1:394,2\n*E\n"})
/*     */ public final class JunieFilePickerKt {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void JunieFilePickerDialog(@NotNull List recentFiles, @Nullable GuidelinesEntry guidelines, @NotNull Function1 onFileChosen, @NotNull Function0 onSelectFileFromProject, @NotNull Function0 onCreateNewGuidelines, @NotNull Function1 onSelectGuidelines, @NotNull Function0 onCloseRequest, @NotNull Function0 onCreateAiIgnoreFile, @NotNull Function0 onOpenAiIgnoreFile, @NotNull Function1 hasAIIgnoreFile, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'recentFiles'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'onFileChosen'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc 'onSelectFileFromProject'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload #4
/*     */     //   20: ldc 'onCreateNewGuidelines'
/*     */     //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   25: aload #5
/*     */     //   27: ldc 'onSelectGuidelines'
/*     */     //   29: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   32: aload #6
/*     */     //   34: ldc 'onCloseRequest'
/*     */     //   36: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   39: aload #7
/*     */     //   41: ldc 'onCreateAiIgnoreFile'
/*     */     //   43: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   46: aload #8
/*     */     //   48: ldc 'onOpenAiIgnoreFile'
/*     */     //   50: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   53: aload #9
/*     */     //   55: ldc 'hasAIIgnoreFile'
/*     */     //   57: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   60: aload #10
/*     */     //   62: ldc 268683212
/*     */     //   64: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   69: astore #10
/*     */     //   71: iload #11
/*     */     //   73: istore #12
/*     */     //   75: iload #11
/*     */     //   77: bipush #6
/*     */     //   79: iand
/*     */     //   80: ifne -> 104
/*     */     //   83: iload #12
/*     */     //   85: aload #10
/*     */     //   87: aload_0
/*     */     //   88: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   93: ifeq -> 100
/*     */     //   96: iconst_4
/*     */     //   97: goto -> 101
/*     */     //   100: iconst_2
/*     */     //   101: ior
/*     */     //   102: istore #12
/*     */     //   104: iload #11
/*     */     //   106: bipush #48
/*     */     //   108: iand
/*     */     //   109: ifne -> 135
/*     */     //   112: iload #12
/*     */     //   114: aload #10
/*     */     //   116: aload_1
/*     */     //   117: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   122: ifeq -> 130
/*     */     //   125: bipush #32
/*     */     //   127: goto -> 132
/*     */     //   130: bipush #16
/*     */     //   132: ior
/*     */     //   133: istore #12
/*     */     //   135: iload #11
/*     */     //   137: sipush #384
/*     */     //   140: iand
/*     */     //   141: ifne -> 169
/*     */     //   144: iload #12
/*     */     //   146: aload #10
/*     */     //   148: aload_2
/*     */     //   149: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   154: ifeq -> 163
/*     */     //   157: sipush #256
/*     */     //   160: goto -> 166
/*     */     //   163: sipush #128
/*     */     //   166: ior
/*     */     //   167: istore #12
/*     */     //   169: iload #11
/*     */     //   171: sipush #3072
/*     */     //   174: iand
/*     */     //   175: ifne -> 203
/*     */     //   178: iload #12
/*     */     //   180: aload #10
/*     */     //   182: aload_3
/*     */     //   183: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   188: ifeq -> 197
/*     */     //   191: sipush #2048
/*     */     //   194: goto -> 200
/*     */     //   197: sipush #1024
/*     */     //   200: ior
/*     */     //   201: istore #12
/*     */     //   203: iload #11
/*     */     //   205: sipush #24576
/*     */     //   208: iand
/*     */     //   209: ifne -> 238
/*     */     //   212: iload #12
/*     */     //   214: aload #10
/*     */     //   216: aload #4
/*     */     //   218: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   223: ifeq -> 232
/*     */     //   226: sipush #16384
/*     */     //   229: goto -> 235
/*     */     //   232: sipush #8192
/*     */     //   235: ior
/*     */     //   236: istore #12
/*     */     //   238: iload #11
/*     */     //   240: ldc 196608
/*     */     //   242: iand
/*     */     //   243: ifne -> 270
/*     */     //   246: iload #12
/*     */     //   248: aload #10
/*     */     //   250: aload #5
/*     */     //   252: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   257: ifeq -> 265
/*     */     //   260: ldc 131072
/*     */     //   262: goto -> 267
/*     */     //   265: ldc 65536
/*     */     //   267: ior
/*     */     //   268: istore #12
/*     */     //   270: iload #11
/*     */     //   272: ldc 1572864
/*     */     //   274: iand
/*     */     //   275: ifne -> 302
/*     */     //   278: iload #12
/*     */     //   280: aload #10
/*     */     //   282: aload #6
/*     */     //   284: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   289: ifeq -> 297
/*     */     //   292: ldc 1048576
/*     */     //   294: goto -> 299
/*     */     //   297: ldc 524288
/*     */     //   299: ior
/*     */     //   300: istore #12
/*     */     //   302: iload #11
/*     */     //   304: ldc 12582912
/*     */     //   306: iand
/*     */     //   307: ifne -> 334
/*     */     //   310: iload #12
/*     */     //   312: aload #10
/*     */     //   314: aload #7
/*     */     //   316: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   321: ifeq -> 329
/*     */     //   324: ldc 8388608
/*     */     //   326: goto -> 331
/*     */     //   329: ldc 4194304
/*     */     //   331: ior
/*     */     //   332: istore #12
/*     */     //   334: iload #11
/*     */     //   336: ldc 100663296
/*     */     //   338: iand
/*     */     //   339: ifne -> 366
/*     */     //   342: iload #12
/*     */     //   344: aload #10
/*     */     //   346: aload #8
/*     */     //   348: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   353: ifeq -> 361
/*     */     //   356: ldc 67108864
/*     */     //   358: goto -> 363
/*     */     //   361: ldc 33554432
/*     */     //   363: ior
/*     */     //   364: istore #12
/*     */     //   366: iload #11
/*     */     //   368: ldc 805306368
/*     */     //   370: iand
/*     */     //   371: ifne -> 398
/*     */     //   374: iload #12
/*     */     //   376: aload #10
/*     */     //   378: aload #9
/*     */     //   380: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   385: ifeq -> 393
/*     */     //   388: ldc 536870912
/*     */     //   390: goto -> 395
/*     */     //   393: ldc 268435456
/*     */     //   395: ior
/*     */     //   396: istore #12
/*     */     //   398: iload #12
/*     */     //   400: ldc 306783379
/*     */     //   402: iand
/*     */     //   403: ldc 306783378
/*     */     //   405: if_icmpne -> 418
/*     */     //   408: aload #10
/*     */     //   410: invokeinterface getSkipping : ()Z
/*     */     //   415: ifne -> 2236
/*     */     //   418: invokestatic isTraceInProgress : ()Z
/*     */     //   421: ifeq -> 434
/*     */     //   424: ldc 268683212
/*     */     //   426: iload #12
/*     */     //   428: iconst_m1
/*     */     //   429: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieFilePickerDialog (JunieFilePicker.kt:44)'
/*     */     //   431: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   434: aload #10
/*     */     //   436: ldc 694572428
/*     */     //   438: invokeinterface startReplaceGroup : (I)V
/*     */     //   443: aload #10
/*     */     //   445: astore #15
/*     */     //   447: iconst_0
/*     */     //   448: istore #16
/*     */     //   450: nop
/*     */     //   451: iconst_0
/*     */     //   452: istore #17
/*     */     //   454: aload #15
/*     */     //   456: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   461: astore #18
/*     */     //   463: iconst_0
/*     */     //   464: istore #19
/*     */     //   466: aload #18
/*     */     //   468: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   471: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   474: if_acmpne -> 506
/*     */     //   477: iconst_0
/*     */     //   478: istore #20
/*     */     //   480: iconst_0
/*     */     //   481: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   484: aconst_null
/*     */     //   485: iconst_2
/*     */     //   486: aconst_null
/*     */     //   487: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   490: astore #20
/*     */     //   492: aload #15
/*     */     //   494: aload #20
/*     */     //   496: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   501: aload #20
/*     */     //   503: goto -> 508
/*     */     //   506: aload #18
/*     */     //   508: nop
/*     */     //   509: nop
/*     */     //   510: nop
/*     */     //   511: checkcast androidx/compose/runtime/MutableState
/*     */     //   514: astore #14
/*     */     //   516: aload #10
/*     */     //   518: invokeinterface endReplaceGroup : ()V
/*     */     //   523: aload #14
/*     */     //   525: astore #13
/*     */     //   527: aload #13
/*     */     //   529: invokestatic JunieFilePickerDialog$lambda$1 : (Landroidx/compose/runtime/MutableState;)I
/*     */     //   532: aload #10
/*     */     //   534: iconst_0
/*     */     //   535: invokestatic pxToDp : (ILandroidx/compose/runtime/Composer;I)F
/*     */     //   538: fstore #14
/*     */     //   540: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   543: checkcast androidx/compose/ui/Modifier
/*     */     //   546: aload #10
/*     */     //   548: iconst_0
/*     */     //   549: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   552: invokevirtual getChipBackground-0d7_KjU : ()J
/*     */     //   555: bipush #6
/*     */     //   557: istore #15
/*     */     //   559: iconst_0
/*     */     //   560: istore #16
/*     */     //   562: iload #15
/*     */     //   564: i2f
/*     */     //   565: invokestatic constructor-impl : (F)F
/*     */     //   568: invokestatic RoundedCornerShape-0680j_4 : (F)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   571: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   574: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   577: iconst_1
/*     */     //   578: istore #15
/*     */     //   580: iconst_0
/*     */     //   581: istore #16
/*     */     //   583: iload #15
/*     */     //   585: i2f
/*     */     //   586: invokestatic constructor-impl : (F)F
/*     */     //   589: aload #10
/*     */     //   591: iconst_0
/*     */     //   592: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   595: invokevirtual getSeparatorColor-0d7_KjU : ()J
/*     */     //   598: bipush #6
/*     */     //   600: istore #15
/*     */     //   602: iconst_0
/*     */     //   603: istore #16
/*     */     //   605: iload #15
/*     */     //   607: i2f
/*     */     //   608: invokestatic constructor-impl : (F)F
/*     */     //   611: invokestatic RoundedCornerShape-0680j_4 : (F)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   614: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   617: invokestatic border-xT4_qwU : (Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   620: bipush #16
/*     */     //   622: istore #15
/*     */     //   624: iconst_0
/*     */     //   625: istore #16
/*     */     //   627: iload #15
/*     */     //   629: i2f
/*     */     //   630: invokestatic constructor-impl : (F)F
/*     */     //   633: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   636: sipush #200
/*     */     //   639: istore #15
/*     */     //   641: iconst_0
/*     */     //   642: istore #16
/*     */     //   644: iload #15
/*     */     //   646: i2f
/*     */     //   647: invokestatic constructor-impl : (F)F
/*     */     //   650: sipush #300
/*     */     //   653: istore #15
/*     */     //   655: iconst_0
/*     */     //   656: istore #16
/*     */     //   658: iload #15
/*     */     //   660: i2f
/*     */     //   661: invokestatic constructor-impl : (F)F
/*     */     //   664: invokestatic widthIn-VpY3zN4 : (Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
/*     */     //   667: bipush #100
/*     */     //   669: istore #15
/*     */     //   671: iconst_0
/*     */     //   672: istore #16
/*     */     //   674: iload #15
/*     */     //   676: i2f
/*     */     //   677: invokestatic constructor-impl : (F)F
/*     */     //   680: sipush #200
/*     */     //   683: istore #15
/*     */     //   685: iconst_0
/*     */     //   686: istore #16
/*     */     //   688: iload #15
/*     */     //   690: i2f
/*     */     //   691: invokestatic constructor-impl : (F)F
/*     */     //   694: invokestatic heightIn-VpY3zN4 : (Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
/*     */     //   697: aload #10
/*     */     //   699: ldc 694586767
/*     */     //   701: invokeinterface startReplaceGroup : (I)V
/*     */     //   706: aload #10
/*     */     //   708: astore #16
/*     */     //   710: iconst_0
/*     */     //   711: istore #17
/*     */     //   713: nop
/*     */     //   714: iconst_0
/*     */     //   715: istore #18
/*     */     //   717: aload #16
/*     */     //   719: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   724: astore #19
/*     */     //   726: iconst_0
/*     */     //   727: istore #20
/*     */     //   729: aload #19
/*     */     //   731: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   734: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   737: if_acmpne -> 771
/*     */     //   740: astore #76
/*     */     //   742: iconst_0
/*     */     //   743: istore #21
/*     */     //   745: aload #13
/*     */     //   747: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   752: aload #76
/*     */     //   754: swap
/*     */     //   755: astore #22
/*     */     //   757: aload #16
/*     */     //   759: aload #22
/*     */     //   761: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   766: aload #22
/*     */     //   768: goto -> 773
/*     */     //   771: aload #19
/*     */     //   773: nop
/*     */     //   774: nop
/*     */     //   775: nop
/*     */     //   776: checkcast kotlin/jvm/functions/Function1
/*     */     //   779: astore #15
/*     */     //   781: aload #10
/*     */     //   783: invokeinterface endReplaceGroup : ()V
/*     */     //   788: aload #15
/*     */     //   790: invokestatic onGloballyPositioned : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   793: astore #15
/*     */     //   795: iconst_0
/*     */     //   796: istore #18
/*     */     //   798: nop
/*     */     //   799: iconst_0
/*     */     //   800: istore #19
/*     */     //   802: aload #10
/*     */     //   804: ldc -483455358
/*     */     //   806: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   808: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   811: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   814: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   817: astore #16
/*     */     //   819: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   822: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   825: astore #17
/*     */     //   827: aload #16
/*     */     //   829: aload #17
/*     */     //   831: aload #10
/*     */     //   833: bipush #14
/*     */     //   835: iload #18
/*     */     //   837: iconst_3
/*     */     //   838: ishr
/*     */     //   839: iand
/*     */     //   840: bipush #112
/*     */     //   842: iload #18
/*     */     //   844: iconst_3
/*     */     //   845: ishr
/*     */     //   846: iand
/*     */     //   847: ior
/*     */     //   848: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   851: astore #20
/*     */     //   853: bipush #112
/*     */     //   855: iload #18
/*     */     //   857: iconst_3
/*     */     //   858: ishl
/*     */     //   859: iand
/*     */     //   860: istore #21
/*     */     //   862: nop
/*     */     //   863: iconst_0
/*     */     //   864: istore #22
/*     */     //   866: aload #10
/*     */     //   868: ldc -1323940314
/*     */     //   870: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   873: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   876: aload #10
/*     */     //   878: iconst_0
/*     */     //   879: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   882: istore #23
/*     */     //   884: aload #10
/*     */     //   886: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   891: astore #24
/*     */     //   893: aload #10
/*     */     //   895: aload #15
/*     */     //   897: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   900: astore #25
/*     */     //   902: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   905: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   908: astore #26
/*     */     //   910: bipush #6
/*     */     //   912: sipush #896
/*     */     //   915: iload #21
/*     */     //   917: bipush #6
/*     */     //   919: ishl
/*     */     //   920: iand
/*     */     //   921: ior
/*     */     //   922: istore #27
/*     */     //   924: nop
/*     */     //   925: iconst_0
/*     */     //   926: istore #28
/*     */     //   928: aload #10
/*     */     //   930: ldc_w -692256719
/*     */     //   933: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   936: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   939: aload #10
/*     */     //   941: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   946: instanceof androidx/compose/runtime/Applier
/*     */     //   949: ifne -> 955
/*     */     //   952: invokestatic invalidApplier : ()V
/*     */     //   955: aload #10
/*     */     //   957: invokeinterface startReusableNode : ()V
/*     */     //   962: aload #10
/*     */     //   964: invokeinterface getInserting : ()Z
/*     */     //   969: ifeq -> 984
/*     */     //   972: aload #10
/*     */     //   974: aload #26
/*     */     //   976: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   981: goto -> 991
/*     */     //   984: aload #10
/*     */     //   986: invokeinterface useNode : ()V
/*     */     //   991: aload #10
/*     */     //   993: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   996: astore #29
/*     */     //   998: iconst_0
/*     */     //   999: istore #30
/*     */     //   1001: aload #29
/*     */     //   1003: aload #20
/*     */     //   1005: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1008: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1011: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1014: aload #29
/*     */     //   1016: aload #24
/*     */     //   1018: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1021: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1024: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1027: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1030: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1033: astore #31
/*     */     //   1035: iconst_0
/*     */     //   1036: istore #32
/*     */     //   1038: aload #29
/*     */     //   1040: astore #33
/*     */     //   1042: iconst_0
/*     */     //   1043: istore #34
/*     */     //   1045: aload #33
/*     */     //   1047: invokeinterface getInserting : ()Z
/*     */     //   1052: ifne -> 1073
/*     */     //   1055: aload #33
/*     */     //   1057: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1062: iload #23
/*     */     //   1064: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1067: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1070: ifne -> 1099
/*     */     //   1073: aload #33
/*     */     //   1075: iload #23
/*     */     //   1077: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1080: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1085: aload #29
/*     */     //   1087: iload #23
/*     */     //   1089: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1092: aload #31
/*     */     //   1094: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1099: nop
/*     */     //   1100: nop
/*     */     //   1101: nop
/*     */     //   1102: aload #29
/*     */     //   1104: aload #25
/*     */     //   1106: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1109: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1112: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1115: nop
/*     */     //   1116: nop
/*     */     //   1117: aload #10
/*     */     //   1119: bipush #14
/*     */     //   1121: iload #27
/*     */     //   1123: bipush #6
/*     */     //   1125: ishr
/*     */     //   1126: iand
/*     */     //   1127: istore #35
/*     */     //   1129: astore #36
/*     */     //   1131: iconst_0
/*     */     //   1132: istore #37
/*     */     //   1134: aload #36
/*     */     //   1136: ldc_w -384784025
/*     */     //   1139: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   1142: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1145: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   1148: aload #36
/*     */     //   1150: bipush #6
/*     */     //   1152: bipush #112
/*     */     //   1154: iload #18
/*     */     //   1156: bipush #6
/*     */     //   1158: ishr
/*     */     //   1159: iand
/*     */     //   1160: ior
/*     */     //   1161: istore #38
/*     */     //   1163: astore #39
/*     */     //   1165: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   1168: astore #40
/*     */     //   1170: iconst_0
/*     */     //   1171: istore #41
/*     */     //   1173: aload #39
/*     */     //   1175: iconst_0
/*     */     //   1176: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   1179: invokevirtual getListSelectionHoverBorder-0d7_KjU : ()J
/*     */     //   1182: lstore #42
/*     */     //   1184: lload #42
/*     */     //   1186: ldc_w -1879400306
/*     */     //   1189: iconst_1
/*     */     //   1190: new com/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$1
/*     */     //   1193: dup
/*     */     //   1194: fload #14
/*     */     //   1196: aload_3
/*     */     //   1197: aload #6
/*     */     //   1199: invokespecial <init> : (FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
/*     */     //   1202: aload #39
/*     */     //   1204: bipush #54
/*     */     //   1206: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1209: checkcast kotlin/jvm/functions/Function3
/*     */     //   1212: aload #39
/*     */     //   1214: bipush #48
/*     */     //   1216: invokestatic HoverHighlightRow-Iv8Zu3U : (JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1219: aload_1
/*     */     //   1220: ifnull -> 1280
/*     */     //   1223: aload #39
/*     */     //   1225: ldc_w 1596265848
/*     */     //   1228: invokeinterface startReplaceGroup : (I)V
/*     */     //   1233: lload #42
/*     */     //   1235: ldc_w 2051297555
/*     */     //   1238: iconst_1
/*     */     //   1239: new com/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$2
/*     */     //   1242: dup
/*     */     //   1243: fload #14
/*     */     //   1245: aload #5
/*     */     //   1247: aload_1
/*     */     //   1248: aload #6
/*     */     //   1250: invokespecial <init> : (FLkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/GuidelinesEntry;Lkotlin/jvm/functions/Function0;)V
/*     */     //   1253: aload #39
/*     */     //   1255: bipush #54
/*     */     //   1257: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1260: checkcast kotlin/jvm/functions/Function3
/*     */     //   1263: aload #39
/*     */     //   1265: bipush #48
/*     */     //   1267: invokestatic HoverHighlightRow-Iv8Zu3U : (JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1270: aload #39
/*     */     //   1272: invokeinterface endReplaceGroup : ()V
/*     */     //   1277: goto -> 1333
/*     */     //   1280: aload #39
/*     */     //   1282: ldc_w 1596836031
/*     */     //   1285: invokeinterface startReplaceGroup : (I)V
/*     */     //   1290: lload #42
/*     */     //   1292: ldc_w -1809382806
/*     */     //   1295: iconst_1
/*     */     //   1296: new com/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$3
/*     */     //   1299: dup
/*     */     //   1300: fload #14
/*     */     //   1302: aload #4
/*     */     //   1304: aload #6
/*     */     //   1306: invokespecial <init> : (FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
/*     */     //   1309: aload #39
/*     */     //   1311: bipush #54
/*     */     //   1313: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1316: checkcast kotlin/jvm/functions/Function3
/*     */     //   1319: aload #39
/*     */     //   1321: bipush #48
/*     */     //   1323: invokestatic HoverHighlightRow-Iv8Zu3U : (JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1326: aload #39
/*     */     //   1328: invokeinterface endReplaceGroup : ()V
/*     */     //   1333: iconst_1
/*     */     //   1334: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   1337: aload #39
/*     */     //   1339: ldc_w -641210252
/*     */     //   1342: invokeinterface startReplaceGroup : (I)V
/*     */     //   1347: aload #39
/*     */     //   1349: astore #44
/*     */     //   1351: aload #10
/*     */     //   1353: aload #9
/*     */     //   1355: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1360: istore #45
/*     */     //   1362: iconst_0
/*     */     //   1363: istore #46
/*     */     //   1365: aload #44
/*     */     //   1367: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1372: astore #47
/*     */     //   1374: iconst_0
/*     */     //   1375: istore #48
/*     */     //   1377: iload #45
/*     */     //   1379: ifne -> 1393
/*     */     //   1382: aload #47
/*     */     //   1384: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1387: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1390: if_acmpne -> 1430
/*     */     //   1393: astore #49
/*     */     //   1395: iconst_0
/*     */     //   1396: istore #50
/*     */     //   1398: new com/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1
/*     */     //   1401: dup
/*     */     //   1402: aload #9
/*     */     //   1404: aconst_null
/*     */     //   1405: invokespecial <init> : (Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*     */     //   1408: checkcast kotlin/jvm/functions/Function2
/*     */     //   1411: aload #49
/*     */     //   1413: swap
/*     */     //   1414: astore #51
/*     */     //   1416: aload #44
/*     */     //   1418: aload #51
/*     */     //   1420: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1425: aload #51
/*     */     //   1427: goto -> 1432
/*     */     //   1430: aload #47
/*     */     //   1432: nop
/*     */     //   1433: nop
/*     */     //   1434: nop
/*     */     //   1435: checkcast kotlin/jvm/functions/Function2
/*     */     //   1438: astore #52
/*     */     //   1440: aload #39
/*     */     //   1442: invokeinterface endReplaceGroup : ()V
/*     */     //   1447: aload #52
/*     */     //   1449: aload #39
/*     */     //   1451: bipush #6
/*     */     //   1453: invokestatic produceState : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1456: astore #53
/*     */     //   1458: aload #53
/*     */     //   1460: invokestatic JunieFilePickerDialog$lambda$8$lambda$6 : (Landroidx/compose/runtime/State;)Z
/*     */     //   1463: ifeq -> 1522
/*     */     //   1466: aload #39
/*     */     //   1468: ldc_w 1597392636
/*     */     //   1471: invokeinterface startReplaceGroup : (I)V
/*     */     //   1476: lload #42
/*     */     //   1478: ldc_w -1846270468
/*     */     //   1481: iconst_1
/*     */     //   1482: new com/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$4
/*     */     //   1485: dup
/*     */     //   1486: fload #14
/*     */     //   1488: aload #8
/*     */     //   1490: aload #6
/*     */     //   1492: invokespecial <init> : (FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
/*     */     //   1495: aload #39
/*     */     //   1497: bipush #54
/*     */     //   1499: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1502: checkcast kotlin/jvm/functions/Function3
/*     */     //   1505: aload #39
/*     */     //   1507: bipush #48
/*     */     //   1509: invokestatic HoverHighlightRow-Iv8Zu3U : (JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1512: aload #39
/*     */     //   1514: invokeinterface endReplaceGroup : ()V
/*     */     //   1519: goto -> 1575
/*     */     //   1522: aload #39
/*     */     //   1524: ldc_w 1597772696
/*     */     //   1527: invokeinterface startReplaceGroup : (I)V
/*     */     //   1532: lload #42
/*     */     //   1534: ldc_w -1108353645
/*     */     //   1537: iconst_1
/*     */     //   1538: new com/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$5
/*     */     //   1541: dup
/*     */     //   1542: fload #14
/*     */     //   1544: aload #7
/*     */     //   1546: aload #6
/*     */     //   1548: invokespecial <init> : (FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
/*     */     //   1551: aload #39
/*     */     //   1553: bipush #54
/*     */     //   1555: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1558: checkcast kotlin/jvm/functions/Function3
/*     */     //   1561: aload #39
/*     */     //   1563: bipush #48
/*     */     //   1565: invokestatic HoverHighlightRow-Iv8Zu3U : (JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1568: aload #39
/*     */     //   1570: invokeinterface endReplaceGroup : ()V
/*     */     //   1575: iconst_1
/*     */     //   1576: istore #44
/*     */     //   1578: iconst_0
/*     */     //   1579: istore #45
/*     */     //   1581: iload #44
/*     */     //   1583: i2f
/*     */     //   1584: invokestatic constructor-impl : (F)F
/*     */     //   1587: fstore #52
/*     */     //   1589: getstatic org/jetbrains/jewel/ui/Orientation.Horizontal : Lorg/jetbrains/jewel/ui/Orientation;
/*     */     //   1592: astore #44
/*     */     //   1594: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1597: checkcast androidx/compose/ui/Modifier
/*     */     //   1600: fload #14
/*     */     //   1602: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   1605: astore #45
/*     */     //   1607: aload #39
/*     */     //   1609: iconst_0
/*     */     //   1610: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   1613: invokevirtual getSeparatorColor-0d7_KjU : ()J
/*     */     //   1616: lstore #54
/*     */     //   1618: aload #44
/*     */     //   1620: aload #45
/*     */     //   1622: lload #54
/*     */     //   1624: fload #52
/*     */     //   1626: fconst_0
/*     */     //   1627: aconst_null
/*     */     //   1628: aload #39
/*     */     //   1630: sipush #3078
/*     */     //   1633: bipush #48
/*     */     //   1635: invokestatic Divider-RLL6an4 : (Lorg/jetbrains/jewel/ui/Orientation;Landroidx/compose/ui/Modifier;JFFLorg/jetbrains/jewel/ui/component/styling/DividerStyle;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1638: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1641: checkcast androidx/compose/ui/Modifier
/*     */     //   1644: iconst_4
/*     */     //   1645: istore #44
/*     */     //   1647: iconst_0
/*     */     //   1648: istore #45
/*     */     //   1650: iload #44
/*     */     //   1652: i2f
/*     */     //   1653: invokestatic constructor-impl : (F)F
/*     */     //   1656: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   1659: astore #52
/*     */     //   1661: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1664: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1667: astore #44
/*     */     //   1669: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   1672: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1675: astore #45
/*     */     //   1677: sipush #438
/*     */     //   1680: istore #46
/*     */     //   1682: nop
/*     */     //   1683: iconst_0
/*     */     //   1684: istore #47
/*     */     //   1686: aload #39
/*     */     //   1688: ldc_w 693286680
/*     */     //   1691: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   1694: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1697: aload #45
/*     */     //   1699: aload #44
/*     */     //   1701: aload #39
/*     */     //   1703: bipush #14
/*     */     //   1705: iload #46
/*     */     //   1707: iconst_3
/*     */     //   1708: ishr
/*     */     //   1709: iand
/*     */     //   1710: bipush #112
/*     */     //   1712: iload #46
/*     */     //   1714: iconst_3
/*     */     //   1715: ishr
/*     */     //   1716: iand
/*     */     //   1717: ior
/*     */     //   1718: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1721: astore #48
/*     */     //   1723: bipush #112
/*     */     //   1725: iload #46
/*     */     //   1727: iconst_3
/*     */     //   1728: ishl
/*     */     //   1729: iand
/*     */     //   1730: istore #50
/*     */     //   1732: nop
/*     */     //   1733: iconst_0
/*     */     //   1734: istore #51
/*     */     //   1736: aload #39
/*     */     //   1738: ldc -1323940314
/*     */     //   1740: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1743: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1746: aload #39
/*     */     //   1748: iconst_0
/*     */     //   1749: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1752: istore #56
/*     */     //   1754: aload #39
/*     */     //   1756: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1761: astore #57
/*     */     //   1763: aload #39
/*     */     //   1765: aload #52
/*     */     //   1767: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1770: astore #58
/*     */     //   1772: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1775: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1778: astore #59
/*     */     //   1780: bipush #6
/*     */     //   1782: sipush #896
/*     */     //   1785: iload #50
/*     */     //   1787: bipush #6
/*     */     //   1789: ishl
/*     */     //   1790: iand
/*     */     //   1791: ior
/*     */     //   1792: istore #60
/*     */     //   1794: nop
/*     */     //   1795: iconst_0
/*     */     //   1796: istore #61
/*     */     //   1798: aload #39
/*     */     //   1800: ldc_w -692256719
/*     */     //   1803: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1806: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1809: aload #39
/*     */     //   1811: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1816: instanceof androidx/compose/runtime/Applier
/*     */     //   1819: ifne -> 1825
/*     */     //   1822: invokestatic invalidApplier : ()V
/*     */     //   1825: aload #39
/*     */     //   1827: invokeinterface startReusableNode : ()V
/*     */     //   1832: aload #39
/*     */     //   1834: invokeinterface getInserting : ()Z
/*     */     //   1839: ifeq -> 1854
/*     */     //   1842: aload #39
/*     */     //   1844: aload #59
/*     */     //   1846: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1851: goto -> 1861
/*     */     //   1854: aload #39
/*     */     //   1856: invokeinterface useNode : ()V
/*     */     //   1861: aload #39
/*     */     //   1863: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1866: astore #62
/*     */     //   1868: iconst_0
/*     */     //   1869: istore #63
/*     */     //   1871: aload #62
/*     */     //   1873: aload #48
/*     */     //   1875: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1878: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1881: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1884: aload #62
/*     */     //   1886: aload #57
/*     */     //   1888: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1891: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1894: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1897: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1900: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1903: astore #64
/*     */     //   1905: iconst_0
/*     */     //   1906: istore #65
/*     */     //   1908: aload #62
/*     */     //   1910: astore #66
/*     */     //   1912: iconst_0
/*     */     //   1913: istore #67
/*     */     //   1915: aload #66
/*     */     //   1917: invokeinterface getInserting : ()Z
/*     */     //   1922: ifne -> 1943
/*     */     //   1925: aload #66
/*     */     //   1927: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1932: iload #56
/*     */     //   1934: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1937: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1940: ifne -> 1969
/*     */     //   1943: aload #66
/*     */     //   1945: iload #56
/*     */     //   1947: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1950: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1955: aload #62
/*     */     //   1957: iload #56
/*     */     //   1959: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1962: aload #64
/*     */     //   1964: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1969: nop
/*     */     //   1970: nop
/*     */     //   1971: nop
/*     */     //   1972: aload #62
/*     */     //   1974: aload #58
/*     */     //   1976: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1979: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1982: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1985: nop
/*     */     //   1986: nop
/*     */     //   1987: aload #39
/*     */     //   1989: bipush #14
/*     */     //   1991: iload #60
/*     */     //   1993: bipush #6
/*     */     //   1995: ishr
/*     */     //   1996: iand
/*     */     //   1997: istore #68
/*     */     //   1999: astore #69
/*     */     //   2001: iconst_0
/*     */     //   2002: istore #70
/*     */     //   2004: aload #69
/*     */     //   2006: ldc_w -407840262
/*     */     //   2009: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   2012: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2015: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   2018: aload #69
/*     */     //   2020: bipush #6
/*     */     //   2022: bipush #112
/*     */     //   2024: iload #46
/*     */     //   2026: bipush #6
/*     */     //   2028: ishr
/*     */     //   2029: iand
/*     */     //   2030: ior
/*     */     //   2031: istore #71
/*     */     //   2033: astore #72
/*     */     //   2035: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   2038: astore #73
/*     */     //   2040: iconst_0
/*     */     //   2041: istore #74
/*     */     //   2043: aload_0
/*     */     //   2044: invokeinterface isEmpty : ()Z
/*     */     //   2049: ifeq -> 2058
/*     */     //   2052: ldc_w 'No recent files & Contexts'
/*     */     //   2055: goto -> 2061
/*     */     //   2058: ldc_w 'Recent files & Contexts'
/*     */     //   2061: astore #75
/*     */     //   2063: aload #75
/*     */     //   2065: aconst_null
/*     */     //   2066: aload #72
/*     */     //   2068: iconst_0
/*     */     //   2069: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   2072: aload #72
/*     */     //   2074: getstatic com/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData.$stable : I
/*     */     //   2077: invokevirtual getInactiveTextColor : (Landroidx/compose/runtime/Composer;I)J
/*     */     //   2080: lconst_0
/*     */     //   2081: aconst_null
/*     */     //   2082: aconst_null
/*     */     //   2083: aconst_null
/*     */     //   2084: lconst_0
/*     */     //   2085: aconst_null
/*     */     //   2086: iconst_0
/*     */     //   2087: lconst_0
/*     */     //   2088: iconst_0
/*     */     //   2089: iconst_0
/*     */     //   2090: iconst_0
/*     */     //   2091: aconst_null
/*     */     //   2092: aconst_null
/*     */     //   2093: aload #72
/*     */     //   2095: iconst_0
/*     */     //   2096: iconst_0
/*     */     //   2097: ldc_w 65530
/*     */     //   2100: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   2103: nop
/*     */     //   2104: aload #69
/*     */     //   2106: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2109: aload #39
/*     */     //   2111: invokeinterface endNode : ()V
/*     */     //   2116: aload #39
/*     */     //   2118: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2121: nop
/*     */     //   2122: aload #39
/*     */     //   2124: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2127: nop
/*     */     //   2128: aload #39
/*     */     //   2130: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2133: nop
/*     */     //   2134: iconst_0
/*     */     //   2135: iconst_0
/*     */     //   2136: aload #39
/*     */     //   2138: iconst_0
/*     */     //   2139: iconst_3
/*     */     //   2140: invokestatic rememberLazyListState : (IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   2143: astore #52
/*     */     //   2145: aload #52
/*     */     //   2147: aconst_null
/*     */     //   2148: aconst_null
/*     */     //   2149: aconst_null
/*     */     //   2150: iconst_0
/*     */     //   2151: iconst_0
/*     */     //   2152: aconst_null
/*     */     //   2153: ldc_w 324612721
/*     */     //   2156: iconst_1
/*     */     //   2157: new com/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$7
/*     */     //   2160: dup
/*     */     //   2161: aload #52
/*     */     //   2163: aload_0
/*     */     //   2164: fload #14
/*     */     //   2166: lload #42
/*     */     //   2168: aload_2
/*     */     //   2169: aload #6
/*     */     //   2171: invokespecial <init> : (Landroidx/compose/foundation/lazy/LazyListState;Ljava/util/List;FJLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
/*     */     //   2174: aload #39
/*     */     //   2176: bipush #54
/*     */     //   2178: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   2181: checkcast kotlin/jvm/functions/Function2
/*     */     //   2184: aload #39
/*     */     //   2186: ldc 12582912
/*     */     //   2188: bipush #126
/*     */     //   2190: invokestatic VerticallyScrollableContainer : (Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   2193: nop
/*     */     //   2194: aload #36
/*     */     //   2196: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2199: aload #10
/*     */     //   2201: invokeinterface endNode : ()V
/*     */     //   2206: aload #10
/*     */     //   2208: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2211: nop
/*     */     //   2212: aload #10
/*     */     //   2214: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2217: nop
/*     */     //   2218: aload #10
/*     */     //   2220: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2223: nop
/*     */     //   2224: invokestatic isTraceInProgress : ()Z
/*     */     //   2227: ifeq -> 2243
/*     */     //   2230: invokestatic traceEventEnd : ()V
/*     */     //   2233: goto -> 2243
/*     */     //   2236: aload #10
/*     */     //   2238: invokeinterface skipToGroupEnd : ()V
/*     */     //   2243: aload #10
/*     */     //   2245: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   2250: dup
/*     */     //   2251: ifnull -> 2285
/*     */     //   2254: aload_0
/*     */     //   2255: aload_1
/*     */     //   2256: aload_2
/*     */     //   2257: aload_3
/*     */     //   2258: aload #4
/*     */     //   2260: aload #5
/*     */     //   2262: aload #6
/*     */     //   2264: aload #7
/*     */     //   2266: aload #8
/*     */     //   2268: aload #9
/*     */     //   2270: iload #11
/*     */     //   2272: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/GuidelinesEntry;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)Lkotlin/jvm/functions/Function2;
/*     */     //   2277: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   2282: goto -> 2286
/*     */     //   2285: pop
/*     */     //   2286: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #45	-> 60
/*     */     //   #46	-> 450
/*     */     //   #235	-> 454
/*     */     //   #236	-> 466
/*     */     //   #237	-> 477
/*     */     //   #46	-> 480
/*     */     //   #237	-> 490
/*     */     //   #238	-> 492
/*     */     //   #239	-> 501
/*     */     //   #240	-> 506
/*     */     //   #236	-> 508
/*     */     //   #235	-> 509
/*     */     //   #235	-> 510
/*     */     //   #46	-> 511
/*     */     //   #47	-> 527
/*     */     //   #49	-> 540
/*     */     //   #50	-> 549
/*     */     //   #241	-> 562
/*     */     //   #50	-> 568
/*     */     //   #51	-> 577
/*     */     //   #242	-> 583
/*     */     //   #51	-> 592
/*     */     //   #242	-> 605
/*     */     //   #51	-> 611
/*     */     //   #52	-> 620
/*     */     //   #243	-> 627
/*     */     //   #52	-> 633
/*     */     //   #53	-> 636
/*     */     //   #244	-> 644
/*     */     //   #53	-> 650
/*     */     //   #244	-> 658
/*     */     //   #53	-> 664
/*     */     //   #54	-> 667
/*     */     //   #245	-> 674
/*     */     //   #54	-> 680
/*     */     //   #245	-> 688
/*     */     //   #54	-> 694
/*     */     //   #55	-> 713
/*     */     //   #246	-> 717
/*     */     //   #247	-> 729
/*     */     //   #248	-> 740
/*     */     //   #55	-> 745
/*     */     //   #248	-> 755
/*     */     //   #249	-> 757
/*     */     //   #250	-> 766
/*     */     //   #251	-> 771
/*     */     //   #247	-> 773
/*     */     //   #246	-> 774
/*     */     //   #246	-> 775
/*     */     //   #55	-> 776
/*     */     //   #48	-> 798
/*     */     //   #252	-> 808
/*     */     //   #253	-> 811
/*     */     //   #254	-> 819
/*     */     //   #257	-> 827
/*     */     //   #258	-> 862
/*     */     //   #259	-> 873
/*     */     //   #260	-> 879
/*     */     //   #261	-> 886
/*     */     //   #262	-> 895
/*     */     //   #264	-> 902
/*     */     //   #263	-> 924
/*     */     //   #265	-> 936
/*     */     //   #266	-> 939
/*     */     //   #267	-> 957
/*     */     //   #268	-> 962
/*     */     //   #269	-> 974
/*     */     //   #271	-> 986
/*     */     //   #273	-> 991
/*     */     //   #274	-> 1001
/*     */     //   #275	-> 1014
/*     */     //   #277	-> 1027
/*     */     //   #278	-> 1038
/*     */     //   #279	-> 1045
/*     */     //   #280	-> 1073
/*     */     //   #281	-> 1085
/*     */     //   #283	-> 1099
/*     */     //   #278	-> 1100
/*     */     //   #283	-> 1101
/*     */     //   #284	-> 1102
/*     */     //   #285	-> 1115
/*     */     //   #273	-> 1116
/*     */     //   #286	-> 1117
/*     */     //   #287	-> 1142
/*     */     //   #57	-> 1176
/*     */     //   #59	-> 1184
/*     */     //   #74	-> 1219
/*     */     //   #75	-> 1233
/*     */     //   #74	-> 1270
/*     */     //   #90	-> 1280
/*     */     //   #91	-> 1290
/*     */     //   #90	-> 1326
/*     */     //   #107	-> 1333
/*     */     //   #288	-> 1365
/*     */     //   #289	-> 1377
/*     */     //   #290	-> 1393
/*     */     //   #107	-> 1398
/*     */     //   #290	-> 1414
/*     */     //   #291	-> 1416
/*     */     //   #292	-> 1425
/*     */     //   #293	-> 1430
/*     */     //   #289	-> 1432
/*     */     //   #288	-> 1433
/*     */     //   #288	-> 1434
/*     */     //   #107	-> 1435
/*     */     //   #111	-> 1458
/*     */     //   #112	-> 1476
/*     */     //   #111	-> 1512
/*     */     //   #125	-> 1522
/*     */     //   #126	-> 1532
/*     */     //   #125	-> 1568
/*     */     //   #142	-> 1575
/*     */     //   #294	-> 1581
/*     */     //   #142	-> 1587
/*     */     //   #143	-> 1589
/*     */     //   #144	-> 1594
/*     */     //   #145	-> 1610
/*     */     //   #143	-> 1618
/*     */     //   #144	-> 1620
/*     */     //   #145	-> 1622
/*     */     //   #142	-> 1624
/*     */     //   #141	-> 1635
/*     */     //   #149	-> 1638
/*     */     //   #295	-> 1650
/*     */     //   #149	-> 1656
/*     */     //   #150	-> 1661
/*     */     //   #151	-> 1669
/*     */     //   #148	-> 1682
/*     */     //   #296	-> 1694
/*     */     //   #297	-> 1697
/*     */     //   #298	-> 1732
/*     */     //   #299	-> 1743
/*     */     //   #300	-> 1749
/*     */     //   #301	-> 1756
/*     */     //   #302	-> 1765
/*     */     //   #304	-> 1772
/*     */     //   #303	-> 1794
/*     */     //   #305	-> 1806
/*     */     //   #306	-> 1809
/*     */     //   #307	-> 1827
/*     */     //   #308	-> 1832
/*     */     //   #309	-> 1844
/*     */     //   #311	-> 1856
/*     */     //   #313	-> 1861
/*     */     //   #314	-> 1871
/*     */     //   #315	-> 1884
/*     */     //   #317	-> 1897
/*     */     //   #318	-> 1908
/*     */     //   #319	-> 1915
/*     */     //   #320	-> 1943
/*     */     //   #321	-> 1955
/*     */     //   #323	-> 1969
/*     */     //   #318	-> 1970
/*     */     //   #323	-> 1971
/*     */     //   #324	-> 1972
/*     */     //   #325	-> 1985
/*     */     //   #313	-> 1986
/*     */     //   #326	-> 1987
/*     */     //   #327	-> 2012
/*     */     //   #154	-> 2043
/*     */     //   #155	-> 2058
/*     */     //   #154	-> 2061
/*     */     //   #153	-> 2061
/*     */     //   #157	-> 2063
/*     */     //   #158	-> 2103
/*     */     //   #327	-> 2104
/*     */     //   #326	-> 2109
/*     */     //   #328	-> 2111
/*     */     //   #305	-> 2118
/*     */     //   #329	-> 2121
/*     */     //   #299	-> 2124
/*     */     //   #330	-> 2127
/*     */     //   #296	-> 2130
/*     */     //   #331	-> 2133
/*     */     //   #160	-> 2140
/*     */     //   #162	-> 2145
/*     */     //   #163	-> 2153
/*     */     //   #161	-> 2190
/*     */     //   #206	-> 2193
/*     */     //   #287	-> 2194
/*     */     //   #286	-> 2199
/*     */     //   #332	-> 2201
/*     */     //   #265	-> 2208
/*     */     //   #333	-> 2211
/*     */     //   #259	-> 2214
/*     */     //   #334	-> 2217
/*     */     //   #252	-> 2220
/*     */     //   #335	-> 2223
/*     */     //   #207	-> 2236
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   480	10	20	$i$a$-cache-JunieFilePickerKt$JunieFilePickerDialog$dialogWidthPx$2	I
/*     */     //   492	11	20	value$iv	Ljava/lang/Object;
/*     */     //   466	43	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   463	46	18	it$iv	Ljava/lang/Object;
/*     */     //   454	57	17	$i$f$cache	I
/*     */     //   451	60	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   451	60	16	invalid$iv	Z
/*     */     //   562	6	16	$i$f$getDp	I
/*     */     //   559	9	15	$this$dp$iv	I
/*     */     //   583	6	16	$i$f$getDp	I
/*     */     //   580	9	15	$this$dp$iv	I
/*     */     //   605	6	16	$i$f$getDp	I
/*     */     //   602	9	15	$this$dp$iv	I
/*     */     //   627	6	16	$i$f$getDp	I
/*     */     //   624	9	15	$this$dp$iv	I
/*     */     //   644	6	16	$i$f$getDp	I
/*     */     //   641	9	15	$this$dp$iv	I
/*     */     //   658	6	16	$i$f$getDp	I
/*     */     //   655	9	15	$this$dp$iv	I
/*     */     //   674	6	16	$i$f$getDp	I
/*     */     //   671	9	15	$this$dp$iv	I
/*     */     //   688	6	16	$i$f$getDp	I
/*     */     //   685	9	15	$this$dp$iv	I
/*     */     //   745	7	21	$i$a$-cache-JunieFilePickerKt$JunieFilePickerDialog$1	I
/*     */     //   757	11	22	value$iv	Ljava/lang/Object;
/*     */     //   729	45	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   726	48	19	it$iv	Ljava/lang/Object;
/*     */     //   717	59	18	$i$f$cache	I
/*     */     //   714	62	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   714	62	17	invalid$iv	Z
/*     */     //   1398	13	50	$i$a$-cache-JunieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2	I
/*     */     //   1416	11	51	value$iv	Ljava/lang/Object;
/*     */     //   1377	56	48	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1374	59	47	it$iv	Ljava/lang/Object;
/*     */     //   1365	70	46	$i$f$cache	I
/*     */     //   1362	73	44	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1362	73	45	invalid$iv	Z
/*     */     //   1581	6	45	$i$f$getDp	I
/*     */     //   1578	9	44	$this$dp$iv	I
/*     */     //   1650	6	45	$i$f$getDp	I
/*     */     //   1647	9	44	$this$dp$iv	I
/*     */     //   2043	61	74	$i$a$-Row-JunieFilePickerKt$JunieFilePickerDialog$2$6	I
/*     */     //   2063	41	75	text	Ljava/lang/String;
/*     */     //   2040	64	73	$this$JunieFilePickerDialog_u24lambda_u248_u24lambda_u247	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   2040	64	72	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   2040	64	71	$changed	I
/*     */     //   2004	105	70	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   2001	108	69	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2001	108	68	$changed$iv	I
/*     */     //   1915	55	67	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1912	58	66	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1908	64	65	$i$f$set-impl	I
/*     */     //   1905	67	64	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1871	115	63	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1868	118	62	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1798	324	61	$i$f$ReusableComposeNode	I
/*     */     //   1795	327	59	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1795	327	60	$changed$iv$iv$iv	I
/*     */     //   1736	392	51	$i$f$Layout	I
/*     */     //   1754	374	56	compositeKeyHash$iv$iv	I
/*     */     //   1763	365	57	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1772	356	58	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1733	395	50	$changed$iv$iv	I
/*     */     //   1686	448	47	$i$f$Row	I
/*     */     //   1723	411	48	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1683	451	46	$changed$iv	I
/*     */     //   1173	1021	41	$i$a$-Column-JunieFilePickerKt$JunieFilePickerDialog$2	I
/*     */     //   1184	1010	42	hoveredItemBackground	J
/*     */     //   1458	736	53	hasIgnoreFile$delegate	Landroidx/compose/runtime/State;
/*     */     //   2145	49	52	lazyListState	Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   1170	1024	40	$this$JunieFilePickerDialog_u24lambda_u248	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   1170	1024	39	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1170	1024	38	$changed	I
/*     */     //   1134	1065	37	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   1131	1068	36	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1131	1068	35	$changed$iv	I
/*     */     //   1045	55	34	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1042	58	33	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1038	64	32	$i$f$set-impl	I
/*     */     //   1035	67	31	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1001	115	30	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   998	118	29	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   928	1284	28	$i$f$ReusableComposeNode	I
/*     */     //   925	1287	26	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   925	1287	27	$changed$iv$iv$iv	I
/*     */     //   866	1352	22	$i$f$Layout	I
/*     */     //   884	1334	23	compositeKeyHash$iv$iv	I
/*     */     //   893	1325	24	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   902	1316	25	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   863	1355	21	$changed$iv$iv	I
/*     */     //   802	1422	19	$i$f$Column	I
/*     */     //   853	1371	20	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   799	1425	15	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   819	1405	16	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   827	1397	17	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   799	1425	18	$changed$iv	I
/*     */     //   527	1706	13	dialogWidthPx$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   540	1693	14	dialogWidthDp	F
/*     */     //   75	2212	12	$dirty	I
/*     */     //   0	2287	0	recentFiles	Ljava/util/List;
/*     */     //   0	2287	1	guidelines	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/GuidelinesEntry;
/*     */     //   0	2287	2	onFileChosen	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2287	3	onSelectFileFromProject	Lkotlin/jvm/functions/Function0;
/*     */     //   0	2287	4	onCreateNewGuidelines	Lkotlin/jvm/functions/Function0;
/*     */     //   0	2287	5	onSelectGuidelines	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2287	6	onCloseRequest	Lkotlin/jvm/functions/Function0;
/*     */     //   0	2287	7	onCreateAiIgnoreFile	Lkotlin/jvm/functions/Function0;
/*     */     //   0	2287	8	onOpenAiIgnoreFile	Lkotlin/jvm/functions/Function0;
/*     */     //   0	2287	9	hasAIIgnoreFile	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2287	10	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	2287	11	$changed	I
/*     */   }
/*     */   
/*  46 */   private static final int JunieFilePickerDialog$lambda$1(MutableState $dialogWidthPx$delegate) { State state = (State)$dialogWidthPx$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 389 */       (Number)state.getValue()).intValue(); } private static final void JunieFilePickerDialog$lambda$2(MutableState $dialogWidthPx$delegate, int <set-?>) { MutableState mutableState = $dialogWidthPx$delegate; Object object1 = null, object2 = null; Object value$iv = Integer.valueOf(<set-?>); int $i$f$setValue = 0;
/* 390 */     mutableState.setValue(value$iv); } private static final Unit JunieFilePickerDialog$lambda$4$lambda$3(MutableState<Integer> $dialogWidthPx$delegate, LayoutCoordinates it) { Intrinsics.checkNotNullParameter(it, "it"); JunieFilePickerDialog$lambda$2($dialogWidthPx$delegate, IntSize.getWidth-impl(it.getSize-YbymL2g())); return Unit.INSTANCE; } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nJunieFilePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,234:1\n1225#2,6:235\n149#3:241\n99#4,3:242\n102#4:273\n106#4:277\n79#5,6:245\n86#5,4:260\n90#5,2:270\n94#5:276\n368#6,9:251\n377#6:272\n378#6,2:274\n4034#7,6:264\n*S KotlinDebug\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$1\n*L\n62#1:235,6\n66#1:241\n60#1:242,3\n60#1:273\n60#1:277\n60#1:245,6\n60#1:260,4\n60#1:270,2\n60#1:276\n60#1:251,9\n60#1:272\n60#1:274,2\n60#1:264,6\n*E\n"}) static final class JunieFilePickerKt$JunieFilePickerDialog$2$1 implements Function3<Boolean, Composer, Integer, Unit> {
/*     */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(boolean param1Boolean, Composer $composer, int $changed) { // Byte code:
/*     */       //   0: iload_3
/*     */       //   1: bipush #17
/*     */       //   3: iand
/*     */       //   4: bipush #16
/*     */       //   6: if_icmpne -> 18
/*     */       //   9: aload_2
/*     */       //   10: invokeinterface getSkipping : ()Z
/*     */       //   15: ifne -> 659
/*     */       //   18: invokestatic isTraceInProgress : ()Z
/*     */       //   21: ifeq -> 33
/*     */       //   24: ldc -1879400306
/*     */       //   26: iload_3
/*     */       //   27: iconst_m1
/*     */       //   28: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieFilePickerDialog.<anonymous>.<anonymous> (JunieFilePicker.kt:59)'
/*     */       //   30: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   33: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   36: checkcast androidx/compose/ui/Modifier
/*     */       //   39: aload_0
/*     */       //   40: getfield $dialogWidthDp : F
/*     */       //   43: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */       //   46: iconst_0
/*     */       //   47: aconst_null
/*     */       //   48: aconst_null
/*     */       //   49: aconst_null
/*     */       //   50: aconst_null
/*     */       //   51: aload_2
/*     */       //   52: ldc 909722524
/*     */       //   54: invokeinterface startReplaceGroup : (I)V
/*     */       //   59: aload_2
/*     */       //   60: astore #6
/*     */       //   62: aload_2
/*     */       //   63: aload_0
/*     */       //   64: getfield $onSelectFileFromProject : Lkotlin/jvm/functions/Function0;
/*     */       //   67: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   72: aload_2
/*     */       //   73: aload_0
/*     */       //   74: getfield $onCloseRequest : Lkotlin/jvm/functions/Function0;
/*     */       //   77: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   82: ior
/*     */       //   83: istore #7
/*     */       //   85: aload_0
/*     */       //   86: getfield $onSelectFileFromProject : Lkotlin/jvm/functions/Function0;
/*     */       //   89: astore #8
/*     */       //   91: aload_0
/*     */       //   92: getfield $onCloseRequest : Lkotlin/jvm/functions/Function0;
/*     */       //   95: astore #9
/*     */       //   97: iconst_0
/*     */       //   98: istore #10
/*     */       //   100: aload #6
/*     */       //   102: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   107: astore #11
/*     */       //   109: iconst_0
/*     */       //   110: istore #12
/*     */       //   112: iload #7
/*     */       //   114: ifne -> 128
/*     */       //   117: aload #11
/*     */       //   119: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   122: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   125: if_acmpne -> 184
/*     */       //   128: astore #36
/*     */       //   130: astore #35
/*     */       //   132: astore #34
/*     */       //   134: astore #33
/*     */       //   136: istore #32
/*     */       //   138: astore #31
/*     */       //   140: iconst_0
/*     */       //   141: istore #13
/*     */       //   143: aload #8
/*     */       //   145: aload #9
/*     */       //   147: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
/*     */       //   152: astore #37
/*     */       //   154: aload #31
/*     */       //   156: iload #32
/*     */       //   158: aload #33
/*     */       //   160: aload #34
/*     */       //   162: aload #35
/*     */       //   164: aload #36
/*     */       //   166: aload #37
/*     */       //   168: astore #14
/*     */       //   170: aload #6
/*     */       //   172: aload #14
/*     */       //   174: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   179: aload #14
/*     */       //   181: goto -> 186
/*     */       //   184: aload #11
/*     */       //   186: nop
/*     */       //   187: nop
/*     */       //   188: nop
/*     */       //   189: checkcast kotlin/jvm/functions/Function0
/*     */       //   192: astore #5
/*     */       //   194: aload_2
/*     */       //   195: invokeinterface endReplaceGroup : ()V
/*     */       //   200: aload #5
/*     */       //   202: bipush #31
/*     */       //   204: aconst_null
/*     */       //   205: invokestatic onClick$default : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/PointerMatcher;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   208: iconst_4
/*     */       //   209: istore #5
/*     */       //   211: iconst_0
/*     */       //   212: istore #6
/*     */       //   214: iload #5
/*     */       //   216: i2f
/*     */       //   217: invokestatic constructor-impl : (F)F
/*     */       //   220: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */       //   223: astore #4
/*     */       //   225: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   228: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */       //   231: astore #5
/*     */       //   233: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */       //   236: invokevirtual getSpaceBetween : ()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */       //   239: astore #6
/*     */       //   241: sipush #432
/*     */       //   244: istore #7
/*     */       //   246: nop
/*     */       //   247: iconst_0
/*     */       //   248: istore #8
/*     */       //   250: aload_2
/*     */       //   251: ldc 693286680
/*     */       //   253: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */       //   255: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   258: aload #6
/*     */       //   260: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */       //   263: aload #5
/*     */       //   265: aload_2
/*     */       //   266: bipush #14
/*     */       //   268: iload #7
/*     */       //   270: iconst_3
/*     */       //   271: ishr
/*     */       //   272: iand
/*     */       //   273: bipush #112
/*     */       //   275: iload #7
/*     */       //   277: iconst_3
/*     */       //   278: ishr
/*     */       //   279: iand
/*     */       //   280: ior
/*     */       //   281: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   284: astore #9
/*     */       //   286: bipush #112
/*     */       //   288: iload #7
/*     */       //   290: iconst_3
/*     */       //   291: ishl
/*     */       //   292: iand
/*     */       //   293: istore #10
/*     */       //   295: nop
/*     */       //   296: iconst_0
/*     */       //   297: istore #11
/*     */       //   299: aload_2
/*     */       //   300: ldc -1323940314
/*     */       //   302: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   304: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   307: aload_2
/*     */       //   308: iconst_0
/*     */       //   309: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   312: istore #12
/*     */       //   314: aload_2
/*     */       //   315: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   320: astore #13
/*     */       //   322: aload_2
/*     */       //   323: aload #4
/*     */       //   325: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   328: astore #14
/*     */       //   330: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   333: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   336: astore #15
/*     */       //   338: bipush #6
/*     */       //   340: sipush #896
/*     */       //   343: iload #10
/*     */       //   345: bipush #6
/*     */       //   347: ishl
/*     */       //   348: iand
/*     */       //   349: ior
/*     */       //   350: istore #16
/*     */       //   352: nop
/*     */       //   353: iconst_0
/*     */       //   354: istore #17
/*     */       //   356: aload_2
/*     */       //   357: ldc -692256719
/*     */       //   359: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   361: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   364: aload_2
/*     */       //   365: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   370: instanceof androidx/compose/runtime/Applier
/*     */       //   373: ifne -> 379
/*     */       //   376: invokestatic invalidApplier : ()V
/*     */       //   379: aload_2
/*     */       //   380: invokeinterface startReusableNode : ()V
/*     */       //   385: aload_2
/*     */       //   386: invokeinterface getInserting : ()Z
/*     */       //   391: ifeq -> 405
/*     */       //   394: aload_2
/*     */       //   395: aload #15
/*     */       //   397: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   402: goto -> 411
/*     */       //   405: aload_2
/*     */       //   406: invokeinterface useNode : ()V
/*     */       //   411: aload_2
/*     */       //   412: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   415: astore #18
/*     */       //   417: iconst_0
/*     */       //   418: istore #19
/*     */       //   420: aload #18
/*     */       //   422: aload #9
/*     */       //   424: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   427: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   430: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   433: aload #18
/*     */       //   435: aload #13
/*     */       //   437: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   440: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   443: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   446: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   449: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   452: astore #20
/*     */       //   454: iconst_0
/*     */       //   455: istore #21
/*     */       //   457: aload #18
/*     */       //   459: astore #22
/*     */       //   461: iconst_0
/*     */       //   462: istore #23
/*     */       //   464: aload #22
/*     */       //   466: invokeinterface getInserting : ()Z
/*     */       //   471: ifne -> 492
/*     */       //   474: aload #22
/*     */       //   476: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   481: iload #12
/*     */       //   483: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   486: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   489: ifne -> 518
/*     */       //   492: aload #22
/*     */       //   494: iload #12
/*     */       //   496: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   499: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   504: aload #18
/*     */       //   506: iload #12
/*     */       //   508: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   511: aload #20
/*     */       //   513: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   518: nop
/*     */       //   519: nop
/*     */       //   520: nop
/*     */       //   521: aload #18
/*     */       //   523: aload #14
/*     */       //   525: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   528: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   531: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   534: nop
/*     */       //   535: nop
/*     */       //   536: aload_2
/*     */       //   537: bipush #14
/*     */       //   539: iload #16
/*     */       //   541: bipush #6
/*     */       //   543: ishr
/*     */       //   544: iand
/*     */       //   545: istore #24
/*     */       //   547: astore #25
/*     */       //   549: iconst_0
/*     */       //   550: istore #26
/*     */       //   552: aload #25
/*     */       //   554: ldc_w -407840262
/*     */       //   557: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */       //   560: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   563: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */       //   566: aload #25
/*     */       //   568: bipush #6
/*     */       //   570: bipush #112
/*     */       //   572: iload #7
/*     */       //   574: bipush #6
/*     */       //   576: ishr
/*     */       //   577: iand
/*     */       //   578: ior
/*     */       //   579: istore #27
/*     */       //   581: astore #28
/*     */       //   583: checkcast androidx/compose/foundation/layout/RowScope
/*     */       //   586: astore #29
/*     */       //   588: iconst_0
/*     */       //   589: istore #30
/*     */       //   591: ldc_w 'Project File...'
/*     */       //   594: aconst_null
/*     */       //   595: lconst_0
/*     */       //   596: lconst_0
/*     */       //   597: aconst_null
/*     */       //   598: aconst_null
/*     */       //   599: aconst_null
/*     */       //   600: lconst_0
/*     */       //   601: aconst_null
/*     */       //   602: iconst_0
/*     */       //   603: lconst_0
/*     */       //   604: iconst_0
/*     */       //   605: iconst_0
/*     */       //   606: iconst_0
/*     */       //   607: aconst_null
/*     */       //   608: aconst_null
/*     */       //   609: aload #28
/*     */       //   611: bipush #6
/*     */       //   613: iconst_0
/*     */       //   614: ldc_w 65534
/*     */       //   617: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */       //   620: nop
/*     */       //   621: aload #25
/*     */       //   623: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   626: aload_2
/*     */       //   627: invokeinterface endNode : ()V
/*     */       //   632: aload_2
/*     */       //   633: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   636: nop
/*     */       //   637: aload_2
/*     */       //   638: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   641: nop
/*     */       //   642: aload_2
/*     */       //   643: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   646: nop
/*     */       //   647: invokestatic isTraceInProgress : ()Z
/*     */       //   650: ifeq -> 665
/*     */       //   653: invokestatic traceEventEnd : ()V
/*     */       //   656: goto -> 665
/*     */       //   659: aload_2
/*     */       //   660: invokeinterface skipToGroupEnd : ()V
/*     */       //   665: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #60	-> 0
/*     */       //   #61	-> 33
/*     */       //   #62	-> 46
/*     */       //   #235	-> 100
/*     */       //   #236	-> 112
/*     */       //   #237	-> 128
/*     */       //   #62	-> 143
/*     */       //   #237	-> 168
/*     */       //   #238	-> 170
/*     */       //   #239	-> 179
/*     */       //   #240	-> 184
/*     */       //   #236	-> 186
/*     */       //   #235	-> 187
/*     */       //   #235	-> 188
/*     */       //   #62	-> 189
/*     */       //   #66	-> 208
/*     */       //   #241	-> 214
/*     */       //   #66	-> 220
/*     */       //   #67	-> 225
/*     */       //   #68	-> 233
/*     */       //   #60	-> 246
/*     */       //   #242	-> 255
/*     */       //   #243	-> 258
/*     */       //   #244	-> 295
/*     */       //   #245	-> 304
/*     */       //   #246	-> 309
/*     */       //   #247	-> 315
/*     */       //   #248	-> 323
/*     */       //   #250	-> 330
/*     */       //   #249	-> 352
/*     */       //   #251	-> 361
/*     */       //   #252	-> 364
/*     */       //   #253	-> 380
/*     */       //   #254	-> 385
/*     */       //   #255	-> 395
/*     */       //   #257	-> 406
/*     */       //   #259	-> 411
/*     */       //   #260	-> 420
/*     */       //   #261	-> 433
/*     */       //   #263	-> 446
/*     */       //   #264	-> 457
/*     */       //   #265	-> 464
/*     */       //   #266	-> 492
/*     */       //   #267	-> 504
/*     */       //   #269	-> 518
/*     */       //   #264	-> 519
/*     */       //   #269	-> 520
/*     */       //   #270	-> 521
/*     */       //   #271	-> 534
/*     */       //   #259	-> 535
/*     */       //   #272	-> 536
/*     */       //   #273	-> 560
/*     */       //   #70	-> 591
/*     */       //   #71	-> 620
/*     */       //   #273	-> 621
/*     */       //   #272	-> 626
/*     */       //   #274	-> 627
/*     */       //   #251	-> 633
/*     */       //   #275	-> 636
/*     */       //   #245	-> 638
/*     */       //   #276	-> 641
/*     */       //   #242	-> 643
/*     */       //   #277	-> 646
/*     */       //   #71	-> 659
/*     */       //   #72	-> 665
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   143	9	13	$i$a$-cache-JunieFilePickerKt$JunieFilePickerDialog$2$1$1	I
/*     */       //   170	11	14	value$iv	Ljava/lang/Object;
/*     */       //   112	75	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   109	78	11	it$iv	Ljava/lang/Object;
/*     */       //   100	89	10	$i$f$cache	I
/*     */       //   97	92	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   97	92	7	invalid$iv	Z
/*     */       //   214	6	6	$i$f$getDp	I
/*     */       //   211	9	5	$this$dp$iv	I
/*     */       //   591	30	30	$i$a$-Row-JunieFilePickerKt$JunieFilePickerDialog$2$1$2	I
/*     */       //   588	33	29	$this$invoke_u24lambda_u242	Landroidx/compose/foundation/layout/RowScope;
/*     */       //   588	33	28	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   588	33	27	$changed	I
/*     */       //   552	74	26	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */       //   549	77	25	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   549	77	24	$changed$iv	I
/*     */       //   464	55	23	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   461	58	22	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   457	64	21	$i$f$set-impl	I
/*     */       //   454	67	20	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   420	115	19	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   417	118	18	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   356	281	17	$i$f$ReusableComposeNode	I
/*     */       //   353	284	15	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   353	284	16	$changed$iv$iv$iv	I
/*     */       //   299	343	11	$i$f$Layout	I
/*     */       //   314	328	12	compositeKeyHash$iv$iv	I
/*     */       //   322	320	13	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   330	312	14	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   296	346	10	$changed$iv$iv	I
/*     */       //   250	397	8	$i$f$Row	I
/*     */       //   286	361	9	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   247	400	7	$changed$iv	I
/*     */       //   0	666	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$1;
/*     */       //   0	666	2	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	666	3	$changed	I } private static final Unit invoke$lambda$1$lambda$0(Function0 $onSelectFileFromProject, Function0 $onCloseRequest) { $onSelectFileFromProject.invoke(); $onCloseRequest.invoke(); return Unit.INSTANCE; } JunieFilePickerKt$JunieFilePickerDialog$2$1(float $dialogWidthDp, Function0<Unit> $onSelectFileFromProject, Function0<Unit> $onCloseRequest) {} } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nJunieFilePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,234:1\n1225#2,6:235\n149#3:241\n99#4,3:242\n102#4:273\n106#4:277\n79#5,6:245\n86#5,4:260\n90#5,2:270\n94#5:276\n368#6,9:251\n377#6:272\n378#6,2:274\n4034#7,6:264\n*S KotlinDebug\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$2\n*L\n78#1:235,6\n82#1:241\n76#1:242,3\n76#1:273\n76#1:277\n76#1:245,6\n76#1:260,4\n76#1:270,2\n76#1:276\n76#1:251,9\n76#1:272\n76#1:274,2\n76#1:264,6\n*E\n"}) static final class JunieFilePickerKt$JunieFilePickerDialog$2$2 implements Function3<Boolean, Composer, Integer, Unit> {
/*     */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(boolean isHovered, Composer $composer, int $changed) { // Byte code:
/*     */       //   0: iload_3
/*     */       //   1: istore #4
/*     */       //   3: iload_3
/*     */       //   4: bipush #6
/*     */       //   6: iand
/*     */       //   7: ifne -> 30
/*     */       //   10: iload #4
/*     */       //   12: aload_2
/*     */       //   13: iload_1
/*     */       //   14: invokeinterface changed : (Z)Z
/*     */       //   19: ifeq -> 26
/*     */       //   22: iconst_4
/*     */       //   23: goto -> 27
/*     */       //   26: iconst_2
/*     */       //   27: ior
/*     */       //   28: istore #4
/*     */       //   30: iload #4
/*     */       //   32: bipush #19
/*     */       //   34: iand
/*     */       //   35: bipush #18
/*     */       //   37: if_icmpne -> 49
/*     */       //   40: aload_2
/*     */       //   41: invokeinterface getSkipping : ()Z
/*     */       //   46: ifne -> 789
/*     */       //   49: invokestatic isTraceInProgress : ()Z
/*     */       //   52: ifeq -> 65
/*     */       //   55: ldc 2051297555
/*     */       //   57: iload #4
/*     */       //   59: iconst_m1
/*     */       //   60: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieFilePickerDialog.<anonymous>.<anonymous> (JunieFilePicker.kt:75)'
/*     */       //   62: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   65: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   68: checkcast androidx/compose/ui/Modifier
/*     */       //   71: aload_0
/*     */       //   72: getfield $dialogWidthDp : F
/*     */       //   75: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */       //   78: iconst_0
/*     */       //   79: aconst_null
/*     */       //   80: aconst_null
/*     */       //   81: aconst_null
/*     */       //   82: aconst_null
/*     */       //   83: aload_2
/*     */       //   84: ldc 909736711
/*     */       //   86: invokeinterface startReplaceGroup : (I)V
/*     */       //   91: aload_2
/*     */       //   92: astore #7
/*     */       //   94: aload_2
/*     */       //   95: aload_0
/*     */       //   96: getfield $onSelectGuidelines : Lkotlin/jvm/functions/Function1;
/*     */       //   99: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   104: aload_2
/*     */       //   105: aload_0
/*     */       //   106: getfield $guidelines : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/GuidelinesEntry;
/*     */       //   109: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   114: ior
/*     */       //   115: aload_2
/*     */       //   116: aload_0
/*     */       //   117: getfield $onCloseRequest : Lkotlin/jvm/functions/Function0;
/*     */       //   120: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   125: ior
/*     */       //   126: istore #8
/*     */       //   128: aload_0
/*     */       //   129: getfield $onSelectGuidelines : Lkotlin/jvm/functions/Function1;
/*     */       //   132: astore #9
/*     */       //   134: aload_0
/*     */       //   135: getfield $guidelines : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/GuidelinesEntry;
/*     */       //   138: astore #10
/*     */       //   140: aload_0
/*     */       //   141: getfield $onCloseRequest : Lkotlin/jvm/functions/Function0;
/*     */       //   144: astore #11
/*     */       //   146: iconst_0
/*     */       //   147: istore #12
/*     */       //   149: aload #7
/*     */       //   151: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   156: astore #13
/*     */       //   158: iconst_0
/*     */       //   159: istore #14
/*     */       //   161: iload #8
/*     */       //   163: ifne -> 177
/*     */       //   166: aload #13
/*     */       //   168: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   171: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   174: if_acmpne -> 235
/*     */       //   177: astore #40
/*     */       //   179: astore #39
/*     */       //   181: astore #38
/*     */       //   183: astore #37
/*     */       //   185: istore #36
/*     */       //   187: astore #35
/*     */       //   189: iconst_0
/*     */       //   190: istore #15
/*     */       //   192: aload #9
/*     */       //   194: aload #10
/*     */       //   196: aload #11
/*     */       //   198: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/GuidelinesEntry;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
/*     */       //   203: astore #41
/*     */       //   205: aload #35
/*     */       //   207: iload #36
/*     */       //   209: aload #37
/*     */       //   211: aload #38
/*     */       //   213: aload #39
/*     */       //   215: aload #40
/*     */       //   217: aload #41
/*     */       //   219: astore #16
/*     */       //   221: aload #7
/*     */       //   223: aload #16
/*     */       //   225: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   230: aload #16
/*     */       //   232: goto -> 237
/*     */       //   235: aload #13
/*     */       //   237: nop
/*     */       //   238: nop
/*     */       //   239: nop
/*     */       //   240: checkcast kotlin/jvm/functions/Function0
/*     */       //   243: astore #6
/*     */       //   245: aload_2
/*     */       //   246: invokeinterface endReplaceGroup : ()V
/*     */       //   251: aload #6
/*     */       //   253: bipush #31
/*     */       //   255: aconst_null
/*     */       //   256: invokestatic onClick$default : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/PointerMatcher;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   259: iconst_4
/*     */       //   260: istore #6
/*     */       //   262: iconst_0
/*     */       //   263: istore #7
/*     */       //   265: iload #6
/*     */       //   267: i2f
/*     */       //   268: invokestatic constructor-impl : (F)F
/*     */       //   271: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */       //   274: astore #5
/*     */       //   276: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   279: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */       //   282: astore #6
/*     */       //   284: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */       //   287: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */       //   290: astore #7
/*     */       //   292: aload_0
/*     */       //   293: getfield $guidelines : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/GuidelinesEntry;
/*     */       //   296: astore #8
/*     */       //   298: sipush #432
/*     */       //   301: istore #9
/*     */       //   303: iconst_0
/*     */       //   304: istore #10
/*     */       //   306: aload_2
/*     */       //   307: ldc 693286680
/*     */       //   309: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */       //   311: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   314: aload #7
/*     */       //   316: aload #6
/*     */       //   318: aload_2
/*     */       //   319: bipush #14
/*     */       //   321: iload #9
/*     */       //   323: iconst_3
/*     */       //   324: ishr
/*     */       //   325: iand
/*     */       //   326: bipush #112
/*     */       //   328: iload #9
/*     */       //   330: iconst_3
/*     */       //   331: ishr
/*     */       //   332: iand
/*     */       //   333: ior
/*     */       //   334: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   337: astore #11
/*     */       //   339: bipush #112
/*     */       //   341: iload #9
/*     */       //   343: iconst_3
/*     */       //   344: ishl
/*     */       //   345: iand
/*     */       //   346: istore #12
/*     */       //   348: nop
/*     */       //   349: iconst_0
/*     */       //   350: istore #13
/*     */       //   352: aload_2
/*     */       //   353: ldc -1323940314
/*     */       //   355: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   357: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   360: aload_2
/*     */       //   361: iconst_0
/*     */       //   362: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   365: istore #14
/*     */       //   367: aload_2
/*     */       //   368: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   373: astore #15
/*     */       //   375: aload_2
/*     */       //   376: aload #5
/*     */       //   378: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   381: astore #16
/*     */       //   383: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   386: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   389: astore #17
/*     */       //   391: bipush #6
/*     */       //   393: sipush #896
/*     */       //   396: iload #12
/*     */       //   398: bipush #6
/*     */       //   400: ishl
/*     */       //   401: iand
/*     */       //   402: ior
/*     */       //   403: istore #18
/*     */       //   405: nop
/*     */       //   406: iconst_0
/*     */       //   407: istore #19
/*     */       //   409: aload_2
/*     */       //   410: ldc -692256719
/*     */       //   412: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   414: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   417: aload_2
/*     */       //   418: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   423: instanceof androidx/compose/runtime/Applier
/*     */       //   426: ifne -> 432
/*     */       //   429: invokestatic invalidApplier : ()V
/*     */       //   432: aload_2
/*     */       //   433: invokeinterface startReusableNode : ()V
/*     */       //   438: aload_2
/*     */       //   439: invokeinterface getInserting : ()Z
/*     */       //   444: ifeq -> 458
/*     */       //   447: aload_2
/*     */       //   448: aload #17
/*     */       //   450: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   455: goto -> 464
/*     */       //   458: aload_2
/*     */       //   459: invokeinterface useNode : ()V
/*     */       //   464: aload_2
/*     */       //   465: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   468: astore #20
/*     */       //   470: iconst_0
/*     */       //   471: istore #21
/*     */       //   473: aload #20
/*     */       //   475: aload #11
/*     */       //   477: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   480: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   483: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   486: aload #20
/*     */       //   488: aload #15
/*     */       //   490: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   493: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   496: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   499: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   502: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   505: astore #22
/*     */       //   507: iconst_0
/*     */       //   508: istore #23
/*     */       //   510: aload #20
/*     */       //   512: astore #24
/*     */       //   514: iconst_0
/*     */       //   515: istore #25
/*     */       //   517: aload #24
/*     */       //   519: invokeinterface getInserting : ()Z
/*     */       //   524: ifne -> 545
/*     */       //   527: aload #24
/*     */       //   529: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   534: iload #14
/*     */       //   536: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   539: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   542: ifne -> 571
/*     */       //   545: aload #24
/*     */       //   547: iload #14
/*     */       //   549: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   552: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   557: aload #20
/*     */       //   559: iload #14
/*     */       //   561: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   564: aload #22
/*     */       //   566: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   571: nop
/*     */       //   572: nop
/*     */       //   573: nop
/*     */       //   574: aload #20
/*     */       //   576: aload #16
/*     */       //   578: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   581: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   584: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   587: nop
/*     */       //   588: nop
/*     */       //   589: aload_2
/*     */       //   590: bipush #14
/*     */       //   592: iload #18
/*     */       //   594: bipush #6
/*     */       //   596: ishr
/*     */       //   597: iand
/*     */       //   598: istore #26
/*     */       //   600: astore #27
/*     */       //   602: iconst_0
/*     */       //   603: istore #28
/*     */       //   605: aload #27
/*     */       //   607: ldc_w -407840262
/*     */       //   610: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */       //   613: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   616: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */       //   619: aload #27
/*     */       //   621: bipush #6
/*     */       //   623: bipush #112
/*     */       //   625: iload #9
/*     */       //   627: bipush #6
/*     */       //   629: ishr
/*     */       //   630: iand
/*     */       //   631: ior
/*     */       //   632: istore #29
/*     */       //   634: astore #30
/*     */       //   636: checkcast androidx/compose/foundation/layout/RowScope
/*     */       //   639: astore #31
/*     */       //   641: iconst_0
/*     */       //   642: istore #32
/*     */       //   644: ldc_w 'Project guidelines '
/*     */       //   647: aconst_null
/*     */       //   648: lconst_0
/*     */       //   649: lconst_0
/*     */       //   650: aconst_null
/*     */       //   651: aconst_null
/*     */       //   652: aconst_null
/*     */       //   653: lconst_0
/*     */       //   654: aconst_null
/*     */       //   655: iconst_0
/*     */       //   656: lconst_0
/*     */       //   657: iconst_0
/*     */       //   658: iconst_0
/*     */       //   659: iconst_0
/*     */       //   660: aconst_null
/*     */       //   661: aconst_null
/*     */       //   662: aload #30
/*     */       //   664: bipush #6
/*     */       //   666: iconst_0
/*     */       //   667: ldc_w 65534
/*     */       //   670: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */       //   673: aload #8
/*     */       //   675: invokevirtual getDescription : ()Ljava/lang/String;
/*     */       //   678: aconst_null
/*     */       //   679: aload #30
/*     */       //   681: ldc_w -590158862
/*     */       //   684: invokeinterface startReplaceGroup : (I)V
/*     */       //   689: iload_1
/*     */       //   690: ifeq -> 702
/*     */       //   693: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */       //   696: invokevirtual getUnspecified-0d7_KjU : ()J
/*     */       //   699: goto -> 716
/*     */       //   702: aload #30
/*     */       //   704: iconst_0
/*     */       //   705: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */       //   708: aload #30
/*     */       //   710: getstatic com/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData.$stable : I
/*     */       //   713: invokevirtual getInactiveTextColor : (Landroidx/compose/runtime/Composer;I)J
/*     */       //   716: lstore #33
/*     */       //   718: aload #30
/*     */       //   720: invokeinterface endReplaceGroup : ()V
/*     */       //   725: lload #33
/*     */       //   727: lconst_0
/*     */       //   728: aconst_null
/*     */       //   729: aconst_null
/*     */       //   730: aconst_null
/*     */       //   731: lconst_0
/*     */       //   732: aconst_null
/*     */       //   733: iconst_0
/*     */       //   734: lconst_0
/*     */       //   735: iconst_0
/*     */       //   736: iconst_0
/*     */       //   737: iconst_0
/*     */       //   738: aconst_null
/*     */       //   739: aconst_null
/*     */       //   740: aload #30
/*     */       //   742: iconst_0
/*     */       //   743: iconst_0
/*     */       //   744: ldc_w 65530
/*     */       //   747: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */       //   750: nop
/*     */       //   751: aload #27
/*     */       //   753: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   756: aload_2
/*     */       //   757: invokeinterface endNode : ()V
/*     */       //   762: aload_2
/*     */       //   763: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   766: nop
/*     */       //   767: aload_2
/*     */       //   768: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   771: nop
/*     */       //   772: aload_2
/*     */       //   773: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   776: nop
/*     */       //   777: invokestatic isTraceInProgress : ()Z
/*     */       //   780: ifeq -> 795
/*     */       //   783: invokestatic traceEventEnd : ()V
/*     */       //   786: goto -> 795
/*     */       //   789: aload_2
/*     */       //   790: invokeinterface skipToGroupEnd : ()V
/*     */       //   795: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #76	-> 30
/*     */       //   #77	-> 65
/*     */       //   #78	-> 78
/*     */       //   #235	-> 149
/*     */       //   #236	-> 161
/*     */       //   #237	-> 177
/*     */       //   #78	-> 192
/*     */       //   #237	-> 219
/*     */       //   #238	-> 221
/*     */       //   #239	-> 230
/*     */       //   #240	-> 235
/*     */       //   #236	-> 237
/*     */       //   #235	-> 238
/*     */       //   #235	-> 239
/*     */       //   #78	-> 240
/*     */       //   #82	-> 259
/*     */       //   #241	-> 265
/*     */       //   #82	-> 271
/*     */       //   #83	-> 276
/*     */       //   #84	-> 284
/*     */       //   #76	-> 292
/*     */       //   #242	-> 311
/*     */       //   #243	-> 314
/*     */       //   #244	-> 348
/*     */       //   #245	-> 357
/*     */       //   #246	-> 362
/*     */       //   #247	-> 368
/*     */       //   #248	-> 376
/*     */       //   #250	-> 383
/*     */       //   #249	-> 405
/*     */       //   #251	-> 414
/*     */       //   #252	-> 417
/*     */       //   #253	-> 433
/*     */       //   #254	-> 438
/*     */       //   #255	-> 448
/*     */       //   #257	-> 459
/*     */       //   #259	-> 464
/*     */       //   #260	-> 473
/*     */       //   #261	-> 486
/*     */       //   #263	-> 499
/*     */       //   #264	-> 510
/*     */       //   #265	-> 517
/*     */       //   #266	-> 545
/*     */       //   #267	-> 557
/*     */       //   #269	-> 571
/*     */       //   #264	-> 572
/*     */       //   #269	-> 573
/*     */       //   #270	-> 574
/*     */       //   #271	-> 587
/*     */       //   #259	-> 588
/*     */       //   #272	-> 589
/*     */       //   #273	-> 613
/*     */       //   #86	-> 644
/*     */       //   #87	-> 673
/*     */       //   #88	-> 750
/*     */       //   #273	-> 751
/*     */       //   #272	-> 756
/*     */       //   #274	-> 757
/*     */       //   #251	-> 763
/*     */       //   #275	-> 766
/*     */       //   #245	-> 768
/*     */       //   #276	-> 771
/*     */       //   #242	-> 773
/*     */       //   #277	-> 776
/*     */       //   #88	-> 789
/*     */       //   #89	-> 795
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   192	11	15	$i$a$-cache-JunieFilePickerKt$JunieFilePickerDialog$2$2$1	I
/*     */       //   221	11	16	value$iv	Ljava/lang/Object;
/*     */       //   161	77	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   158	80	13	it$iv	Ljava/lang/Object;
/*     */       //   149	91	12	$i$f$cache	I
/*     */       //   146	94	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   146	94	8	invalid$iv	Z
/*     */       //   265	6	7	$i$f$getDp	I
/*     */       //   262	9	6	$this$dp$iv	I
/*     */       //   644	107	32	$i$a$-Row-JunieFilePickerKt$JunieFilePickerDialog$2$2$2	I
/*     */       //   641	110	31	$this$invoke_u24lambda_u242	Landroidx/compose/foundation/layout/RowScope;
/*     */       //   641	110	30	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   641	110	29	$changed	I
/*     */       //   605	151	28	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */       //   602	154	27	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   602	154	26	$changed$iv	I
/*     */       //   517	55	25	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   514	58	24	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   510	64	23	$i$f$set-impl	I
/*     */       //   507	67	22	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   473	115	21	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   470	118	20	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   409	358	19	$i$f$ReusableComposeNode	I
/*     */       //   406	361	17	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   406	361	18	$changed$iv$iv$iv	I
/*     */       //   352	420	13	$i$f$Layout	I
/*     */       //   367	405	14	compositeKeyHash$iv$iv	I
/*     */       //   375	397	15	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   383	389	16	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   349	423	12	$changed$iv$iv	I
/*     */       //   306	471	10	$i$f$Row	I
/*     */       //   339	438	11	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   303	474	9	$changed$iv	I
/*     */       //   3	793	4	$dirty	I
/*     */       //   0	796	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$2;
/*     */       //   0	796	1	isHovered	Z
/*     */       //   0	796	2	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	796	3	$changed	I } private static final Unit invoke$lambda$1$lambda$0(Function1 $onSelectGuidelines, GuidelinesEntry $guidelines, Function0 $onCloseRequest) { $onSelectGuidelines.invoke($guidelines); $onCloseRequest.invoke(); return Unit.INSTANCE; } JunieFilePickerKt$JunieFilePickerDialog$2$2(float $dialogWidthDp, Function1<GuidelinesEntry, Unit> $onSelectGuidelines, GuidelinesEntry $guidelines, Function0<Unit> $onCloseRequest) {} } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nJunieFilePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$3\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,234:1\n1225#2,6:235\n149#3:241\n99#4,3:242\n102#4:273\n106#4:277\n79#5,6:245\n86#5,4:260\n90#5,2:270\n94#5:276\n368#6,9:251\n377#6:272\n378#6,2:274\n4034#7,6:264\n*S KotlinDebug\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$3\n*L\n94#1:235,6\n98#1:241\n92#1:242,3\n92#1:273\n92#1:277\n92#1:245,6\n92#1:260,4\n92#1:270,2\n92#1:276\n92#1:251,9\n92#1:272\n92#1:274,2\n92#1:264,6\n*E\n"}) static final class JunieFilePickerKt$JunieFilePickerDialog$2$3 implements Function3<Boolean, Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(boolean it, Composer $composer, int $changed) { // Byte code:
/*     */       //   0: iload_3
/*     */       //   1: bipush #17
/*     */       //   3: iand
/*     */       //   4: bipush #16
/*     */       //   6: if_icmpne -> 18
/*     */       //   9: aload_2
/*     */       //   10: invokeinterface getSkipping : ()Z
/*     */       //   15: ifne -> 655
/*     */       //   18: invokestatic isTraceInProgress : ()Z
/*     */       //   21: ifeq -> 33
/*     */       //   24: ldc -1809382806
/*     */       //   26: iload_3
/*     */       //   27: iconst_m1
/*     */       //   28: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieFilePickerDialog.<anonymous>.<anonymous> (JunieFilePicker.kt:91)'
/*     */       //   30: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   33: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   36: checkcast androidx/compose/ui/Modifier
/*     */       //   39: aload_0
/*     */       //   40: getfield $dialogWidthDp : F
/*     */       //   43: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */       //   46: iconst_0
/*     */       //   47: aconst_null
/*     */       //   48: aconst_null
/*     */       //   49: aconst_null
/*     */       //   50: aconst_null
/*     */       //   51: aload_2
/*     */       //   52: ldc 909754816
/*     */       //   54: invokeinterface startReplaceGroup : (I)V
/*     */       //   59: aload_2
/*     */       //   60: astore #6
/*     */       //   62: aload_2
/*     */       //   63: aload_0
/*     */       //   64: getfield $onCreateNewGuidelines : Lkotlin/jvm/functions/Function0;
/*     */       //   67: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   72: aload_2
/*     */       //   73: aload_0
/*     */       //   74: getfield $onCloseRequest : Lkotlin/jvm/functions/Function0;
/*     */       //   77: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   82: ior
/*     */       //   83: istore #7
/*     */       //   85: aload_0
/*     */       //   86: getfield $onCreateNewGuidelines : Lkotlin/jvm/functions/Function0;
/*     */       //   89: astore #8
/*     */       //   91: aload_0
/*     */       //   92: getfield $onCloseRequest : Lkotlin/jvm/functions/Function0;
/*     */       //   95: astore #9
/*     */       //   97: iconst_0
/*     */       //   98: istore #10
/*     */       //   100: aload #6
/*     */       //   102: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   107: astore #11
/*     */       //   109: iconst_0
/*     */       //   110: istore #12
/*     */       //   112: iload #7
/*     */       //   114: ifne -> 128
/*     */       //   117: aload #11
/*     */       //   119: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   122: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   125: if_acmpne -> 184
/*     */       //   128: astore #36
/*     */       //   130: astore #35
/*     */       //   132: astore #34
/*     */       //   134: astore #33
/*     */       //   136: istore #32
/*     */       //   138: astore #31
/*     */       //   140: iconst_0
/*     */       //   141: istore #13
/*     */       //   143: aload #8
/*     */       //   145: aload #9
/*     */       //   147: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
/*     */       //   152: astore #37
/*     */       //   154: aload #31
/*     */       //   156: iload #32
/*     */       //   158: aload #33
/*     */       //   160: aload #34
/*     */       //   162: aload #35
/*     */       //   164: aload #36
/*     */       //   166: aload #37
/*     */       //   168: astore #14
/*     */       //   170: aload #6
/*     */       //   172: aload #14
/*     */       //   174: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   179: aload #14
/*     */       //   181: goto -> 186
/*     */       //   184: aload #11
/*     */       //   186: nop
/*     */       //   187: nop
/*     */       //   188: nop
/*     */       //   189: checkcast kotlin/jvm/functions/Function0
/*     */       //   192: astore #5
/*     */       //   194: aload_2
/*     */       //   195: invokeinterface endReplaceGroup : ()V
/*     */       //   200: aload #5
/*     */       //   202: bipush #31
/*     */       //   204: aconst_null
/*     */       //   205: invokestatic onClick$default : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/PointerMatcher;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   208: iconst_4
/*     */       //   209: istore #5
/*     */       //   211: iconst_0
/*     */       //   212: istore #6
/*     */       //   214: iload #5
/*     */       //   216: i2f
/*     */       //   217: invokestatic constructor-impl : (F)F
/*     */       //   220: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */       //   223: astore #4
/*     */       //   225: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   228: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */       //   231: astore #5
/*     */       //   233: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */       //   236: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */       //   239: astore #6
/*     */       //   241: sipush #432
/*     */       //   244: istore #7
/*     */       //   246: nop
/*     */       //   247: iconst_0
/*     */       //   248: istore #8
/*     */       //   250: aload_2
/*     */       //   251: ldc 693286680
/*     */       //   253: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */       //   255: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   258: aload #6
/*     */       //   260: aload #5
/*     */       //   262: aload_2
/*     */       //   263: bipush #14
/*     */       //   265: iload #7
/*     */       //   267: iconst_3
/*     */       //   268: ishr
/*     */       //   269: iand
/*     */       //   270: bipush #112
/*     */       //   272: iload #7
/*     */       //   274: iconst_3
/*     */       //   275: ishr
/*     */       //   276: iand
/*     */       //   277: ior
/*     */       //   278: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   281: astore #9
/*     */       //   283: bipush #112
/*     */       //   285: iload #7
/*     */       //   287: iconst_3
/*     */       //   288: ishl
/*     */       //   289: iand
/*     */       //   290: istore #10
/*     */       //   292: nop
/*     */       //   293: iconst_0
/*     */       //   294: istore #11
/*     */       //   296: aload_2
/*     */       //   297: ldc -1323940314
/*     */       //   299: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   301: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   304: aload_2
/*     */       //   305: iconst_0
/*     */       //   306: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   309: istore #12
/*     */       //   311: aload_2
/*     */       //   312: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   317: astore #13
/*     */       //   319: aload_2
/*     */       //   320: aload #4
/*     */       //   322: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   325: astore #14
/*     */       //   327: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   330: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   333: astore #15
/*     */       //   335: bipush #6
/*     */       //   337: sipush #896
/*     */       //   340: iload #10
/*     */       //   342: bipush #6
/*     */       //   344: ishl
/*     */       //   345: iand
/*     */       //   346: ior
/*     */       //   347: istore #16
/*     */       //   349: nop
/*     */       //   350: iconst_0
/*     */       //   351: istore #17
/*     */       //   353: aload_2
/*     */       //   354: ldc -692256719
/*     */       //   356: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   358: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   361: aload_2
/*     */       //   362: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   367: instanceof androidx/compose/runtime/Applier
/*     */       //   370: ifne -> 376
/*     */       //   373: invokestatic invalidApplier : ()V
/*     */       //   376: aload_2
/*     */       //   377: invokeinterface startReusableNode : ()V
/*     */       //   382: aload_2
/*     */       //   383: invokeinterface getInserting : ()Z
/*     */       //   388: ifeq -> 402
/*     */       //   391: aload_2
/*     */       //   392: aload #15
/*     */       //   394: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   399: goto -> 408
/*     */       //   402: aload_2
/*     */       //   403: invokeinterface useNode : ()V
/*     */       //   408: aload_2
/*     */       //   409: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   412: astore #18
/*     */       //   414: iconst_0
/*     */       //   415: istore #19
/*     */       //   417: aload #18
/*     */       //   419: aload #9
/*     */       //   421: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   424: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   427: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   430: aload #18
/*     */       //   432: aload #13
/*     */       //   434: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   437: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   440: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   443: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   446: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   449: astore #20
/*     */       //   451: iconst_0
/*     */       //   452: istore #21
/*     */       //   454: aload #18
/*     */       //   456: astore #22
/*     */       //   458: iconst_0
/*     */       //   459: istore #23
/*     */       //   461: aload #22
/*     */       //   463: invokeinterface getInserting : ()Z
/*     */       //   468: ifne -> 489
/*     */       //   471: aload #22
/*     */       //   473: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   478: iload #12
/*     */       //   480: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   483: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   486: ifne -> 515
/*     */       //   489: aload #22
/*     */       //   491: iload #12
/*     */       //   493: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   496: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   501: aload #18
/*     */       //   503: iload #12
/*     */       //   505: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   508: aload #20
/*     */       //   510: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   515: nop
/*     */       //   516: nop
/*     */       //   517: nop
/*     */       //   518: aload #18
/*     */       //   520: aload #14
/*     */       //   522: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   525: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   528: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   531: nop
/*     */       //   532: nop
/*     */       //   533: aload_2
/*     */       //   534: bipush #14
/*     */       //   536: iload #16
/*     */       //   538: bipush #6
/*     */       //   540: ishr
/*     */       //   541: iand
/*     */       //   542: istore #24
/*     */       //   544: astore #25
/*     */       //   546: iconst_0
/*     */       //   547: istore #26
/*     */       //   549: aload #25
/*     */       //   551: ldc -407840262
/*     */       //   553: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */       //   556: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   559: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */       //   562: aload #25
/*     */       //   564: bipush #6
/*     */       //   566: bipush #112
/*     */       //   568: iload #7
/*     */       //   570: bipush #6
/*     */       //   572: ishr
/*     */       //   573: iand
/*     */       //   574: ior
/*     */       //   575: istore #27
/*     */       //   577: astore #28
/*     */       //   579: checkcast androidx/compose/foundation/layout/RowScope
/*     */       //   582: astore #29
/*     */       //   584: iconst_0
/*     */       //   585: istore #30
/*     */       //   587: ldc_w 'Create project guidelines'
/*     */       //   590: aconst_null
/*     */       //   591: lconst_0
/*     */       //   592: lconst_0
/*     */       //   593: aconst_null
/*     */       //   594: aconst_null
/*     */       //   595: aconst_null
/*     */       //   596: lconst_0
/*     */       //   597: aconst_null
/*     */       //   598: iconst_0
/*     */       //   599: lconst_0
/*     */       //   600: iconst_0
/*     */       //   601: iconst_0
/*     */       //   602: iconst_0
/*     */       //   603: aconst_null
/*     */       //   604: aconst_null
/*     */       //   605: aload #28
/*     */       //   607: bipush #6
/*     */       //   609: iconst_0
/*     */       //   610: ldc_w 65534
/*     */       //   613: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */       //   616: nop
/*     */       //   617: aload #25
/*     */       //   619: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   622: aload_2
/*     */       //   623: invokeinterface endNode : ()V
/*     */       //   628: aload_2
/*     */       //   629: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   632: nop
/*     */       //   633: aload_2
/*     */       //   634: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   637: nop
/*     */       //   638: aload_2
/*     */       //   639: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   642: nop
/*     */       //   643: invokestatic isTraceInProgress : ()Z
/*     */       //   646: ifeq -> 661
/*     */       //   649: invokestatic traceEventEnd : ()V
/*     */       //   652: goto -> 661
/*     */       //   655: aload_2
/*     */       //   656: invokeinterface skipToGroupEnd : ()V
/*     */       //   661: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #92	-> 0
/*     */       //   #93	-> 33
/*     */       //   #94	-> 46
/*     */       //   #235	-> 100
/*     */       //   #236	-> 112
/*     */       //   #237	-> 128
/*     */       //   #94	-> 143
/*     */       //   #237	-> 168
/*     */       //   #238	-> 170
/*     */       //   #239	-> 179
/*     */       //   #240	-> 184
/*     */       //   #236	-> 186
/*     */       //   #235	-> 187
/*     */       //   #235	-> 188
/*     */       //   #94	-> 189
/*     */       //   #98	-> 208
/*     */       //   #241	-> 214
/*     */       //   #98	-> 220
/*     */       //   #99	-> 225
/*     */       //   #100	-> 233
/*     */       //   #92	-> 246
/*     */       //   #242	-> 255
/*     */       //   #243	-> 258
/*     */       //   #244	-> 292
/*     */       //   #245	-> 301
/*     */       //   #246	-> 306
/*     */       //   #247	-> 312
/*     */       //   #248	-> 320
/*     */       //   #250	-> 327
/*     */       //   #249	-> 349
/*     */       //   #251	-> 358
/*     */       //   #252	-> 361
/*     */       //   #253	-> 377
/*     */       //   #254	-> 382
/*     */       //   #255	-> 392
/*     */       //   #257	-> 403
/*     */       //   #259	-> 408
/*     */       //   #260	-> 417
/*     */       //   #261	-> 430
/*     */       //   #263	-> 443
/*     */       //   #264	-> 454
/*     */       //   #265	-> 461
/*     */       //   #266	-> 489
/*     */       //   #267	-> 501
/*     */       //   #269	-> 515
/*     */       //   #264	-> 516
/*     */       //   #269	-> 517
/*     */       //   #270	-> 518
/*     */       //   #271	-> 531
/*     */       //   #259	-> 532
/*     */       //   #272	-> 533
/*     */       //   #273	-> 556
/*     */       //   #102	-> 587
/*     */       //   #103	-> 616
/*     */       //   #273	-> 617
/*     */       //   #272	-> 622
/*     */       //   #274	-> 623
/*     */       //   #251	-> 629
/*     */       //   #275	-> 632
/*     */       //   #245	-> 634
/*     */       //   #276	-> 637
/*     */       //   #242	-> 639
/*     */       //   #277	-> 642
/*     */       //   #103	-> 655
/*     */       //   #104	-> 661
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   143	9	13	$i$a$-cache-JunieFilePickerKt$JunieFilePickerDialog$2$3$1	I
/*     */       //   170	11	14	value$iv	Ljava/lang/Object;
/*     */       //   112	75	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   109	78	11	it$iv	Ljava/lang/Object;
/*     */       //   100	89	10	$i$f$cache	I
/*     */       //   97	92	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   97	92	7	invalid$iv	Z
/*     */       //   214	6	6	$i$f$getDp	I
/*     */       //   211	9	5	$this$dp$iv	I
/*     */       //   587	30	30	$i$a$-Row-JunieFilePickerKt$JunieFilePickerDialog$2$3$2	I
/*     */       //   584	33	29	$this$invoke_u24lambda_u242	Landroidx/compose/foundation/layout/RowScope;
/*     */       //   584	33	28	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   584	33	27	$changed	I
/*     */       //   549	73	26	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */       //   546	76	25	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   546	76	24	$changed$iv	I
/*     */       //   461	55	23	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   458	58	22	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   454	64	21	$i$f$set-impl	I
/*     */       //   451	67	20	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   417	115	19	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   414	118	18	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   353	280	17	$i$f$ReusableComposeNode	I
/*     */       //   350	283	15	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   350	283	16	$changed$iv$iv$iv	I
/*     */       //   296	342	11	$i$f$Layout	I
/*     */       //   311	327	12	compositeKeyHash$iv$iv	I
/*     */       //   319	319	13	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   327	311	14	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   293	345	10	$changed$iv$iv	I
/*     */       //   250	393	8	$i$f$Row	I
/*     */       //   283	360	9	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   247	396	7	$changed$iv	I
/*     */       //   0	662	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$3;
/*     */       //   0	662	1	it	Z
/*     */       //   0	662	2	$composer	Landroidx/compose/runtime/Composer;
/* 392 */       //   0	662	3	$changed	I } private static final Unit invoke$lambda$1$lambda$0(Function0 $onCreateNewGuidelines, Function0 $onCloseRequest) { $onCreateNewGuidelines.invoke(); $onCloseRequest.invoke(); return Unit.INSTANCE; } JunieFilePickerKt$JunieFilePickerDialog$2$3(float $dialogWidthDp, Function0<Unit> $onCreateNewGuidelines, Function0<Unit> $onCloseRequest) {} } private static final boolean JunieFilePickerDialog$lambda$8$lambda$6(State $hasIgnoreFile$delegate) { State state = $hasIgnoreFile$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } @DebugMetadata(f = "JunieFilePicker.kt", l = {108}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.components.JunieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\020\013\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", ""}) static final class JunieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1 extends SuspendLambda implements Function2<ProduceStateScope<Boolean>, Continuation<? super Unit>, Object> {
/* 393 */     int label; JunieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1(Function1<Continuation<? super Boolean>, Object> $hasAIIgnoreFile, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { ProduceStateScope $this$produceState, produceStateScope1; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$produceState = (ProduceStateScope)this.L$0; this.L$0 = produceStateScope1 = $this$produceState; this.label = 1; if (this.$hasAIIgnoreFile.invoke(this) == object) return object;  produceStateScope1.setValue(this.$hasAIIgnoreFile.invoke(this)); return Unit.INSTANCE;case 1: produceStateScope1 = (ProduceStateScope)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); produceStateScope1.setValue(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super JunieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1> $completion) { JunieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1 junieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1 = new JunieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1(this.$hasAIIgnoreFile, $completion); junieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1.L$0 = value; return (Continuation<Unit>)junieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1; } public final Object invoke(ProduceStateScope p1, Continuation<?> p2) { return ((JunieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final boolean HoverHighlightRow_Iv8Zu3U$lambda$11(MutableState $isHovered$delegate) { State state = (State)$isHovered$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nJunieFilePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$4\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,234:1\n1225#2,6:235\n149#3:241\n99#4:242\n96#4,6:243\n102#4:277\n106#4:281\n79#5,6:249\n86#5,4:264\n90#5,2:274\n94#5:280\n368#6,9:255\n377#6:276\n378#6,2:278\n4034#7,6:268\n*S KotlinDebug\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$4\n*L\n115#1:235,6\n119#1:241\n113#1:242\n113#1:243,6\n113#1:277\n113#1:281\n113#1:249,6\n113#1:264,4\n113#1:274,2\n113#1:280\n113#1:255,9\n113#1:276\n113#1:278,2\n113#1:268,6\n*E\n"}) static final class JunieFilePickerKt$JunieFilePickerDialog$2$4 implements Function3<Boolean, Composer, Integer, Unit> {
/*     */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(boolean it, Composer $composer, int $changed) { // Byte code:
/*     */       //   0: iload_3
/*     */       //   1: bipush #17
/*     */       //   3: iand
/*     */       //   4: bipush #16
/*     */       //   6: if_icmpne -> 18
/*     */       //   9: aload_2
/*     */       //   10: invokeinterface getSkipping : ()Z
/*     */       //   15: ifne -> 655
/*     */       //   18: invokestatic isTraceInProgress : ()Z
/*     */       //   21: ifeq -> 33
/*     */       //   24: ldc -1846270468
/*     */       //   26: iload_3
/*     */       //   27: iconst_m1
/*     */       //   28: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieFilePickerDialog.<anonymous>.<anonymous> (JunieFilePicker.kt:112)'
/*     */       //   30: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   33: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   36: checkcast androidx/compose/ui/Modifier
/*     */       //   39: aload_0
/*     */       //   40: getfield $dialogWidthDp : F
/*     */       //   43: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */       //   46: iconst_0
/*     */       //   47: aconst_null
/*     */       //   48: aconst_null
/*     */       //   49: aconst_null
/*     */       //   50: aconst_null
/*     */       //   51: aload_2
/*     */       //   52: ldc 909772829
/*     */       //   54: invokeinterface startReplaceGroup : (I)V
/*     */       //   59: aload_2
/*     */       //   60: astore #5
/*     */       //   62: aload_2
/*     */       //   63: aload_0
/*     */       //   64: getfield $onOpenAiIgnoreFile : Lkotlin/jvm/functions/Function0;
/*     */       //   67: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   72: aload_2
/*     */       //   73: aload_0
/*     */       //   74: getfield $onCloseRequest : Lkotlin/jvm/functions/Function0;
/*     */       //   77: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   82: ior
/*     */       //   83: istore #6
/*     */       //   85: aload_0
/*     */       //   86: getfield $onOpenAiIgnoreFile : Lkotlin/jvm/functions/Function0;
/*     */       //   89: astore #7
/*     */       //   91: aload_0
/*     */       //   92: getfield $onCloseRequest : Lkotlin/jvm/functions/Function0;
/*     */       //   95: astore #8
/*     */       //   97: iconst_0
/*     */       //   98: istore #9
/*     */       //   100: aload #5
/*     */       //   102: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   107: astore #10
/*     */       //   109: iconst_0
/*     */       //   110: istore #11
/*     */       //   112: iload #6
/*     */       //   114: ifne -> 128
/*     */       //   117: aload #10
/*     */       //   119: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   122: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   125: if_acmpne -> 184
/*     */       //   128: astore #36
/*     */       //   130: astore #35
/*     */       //   132: astore #34
/*     */       //   134: astore #33
/*     */       //   136: istore #32
/*     */       //   138: astore #31
/*     */       //   140: iconst_0
/*     */       //   141: istore #12
/*     */       //   143: aload #7
/*     */       //   145: aload #8
/*     */       //   147: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
/*     */       //   152: astore #37
/*     */       //   154: aload #31
/*     */       //   156: iload #32
/*     */       //   158: aload #33
/*     */       //   160: aload #34
/*     */       //   162: aload #35
/*     */       //   164: aload #36
/*     */       //   166: aload #37
/*     */       //   168: astore #13
/*     */       //   170: aload #5
/*     */       //   172: aload #13
/*     */       //   174: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   179: aload #13
/*     */       //   181: goto -> 186
/*     */       //   184: aload #10
/*     */       //   186: nop
/*     */       //   187: nop
/*     */       //   188: nop
/*     */       //   189: checkcast kotlin/jvm/functions/Function0
/*     */       //   192: astore #4
/*     */       //   194: aload_2
/*     */       //   195: invokeinterface endReplaceGroup : ()V
/*     */       //   200: aload #4
/*     */       //   202: bipush #31
/*     */       //   204: aconst_null
/*     */       //   205: invokestatic onClick$default : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/PointerMatcher;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   208: iconst_4
/*     */       //   209: istore #4
/*     */       //   211: iconst_0
/*     */       //   212: istore #5
/*     */       //   214: iload #4
/*     */       //   216: i2f
/*     */       //   217: invokestatic constructor-impl : (F)F
/*     */       //   220: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */       //   223: astore #4
/*     */       //   225: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   228: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */       //   231: astore #6
/*     */       //   233: sipush #384
/*     */       //   236: istore #7
/*     */       //   238: nop
/*     */       //   239: iconst_0
/*     */       //   240: istore #8
/*     */       //   242: aload_2
/*     */       //   243: ldc 693286680
/*     */       //   245: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */       //   247: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   250: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */       //   253: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */       //   256: astore #5
/*     */       //   258: aload #5
/*     */       //   260: aload #6
/*     */       //   262: aload_2
/*     */       //   263: bipush #14
/*     */       //   265: iload #7
/*     */       //   267: iconst_3
/*     */       //   268: ishr
/*     */       //   269: iand
/*     */       //   270: bipush #112
/*     */       //   272: iload #7
/*     */       //   274: iconst_3
/*     */       //   275: ishr
/*     */       //   276: iand
/*     */       //   277: ior
/*     */       //   278: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   281: astore #9
/*     */       //   283: bipush #112
/*     */       //   285: iload #7
/*     */       //   287: iconst_3
/*     */       //   288: ishl
/*     */       //   289: iand
/*     */       //   290: istore #10
/*     */       //   292: nop
/*     */       //   293: iconst_0
/*     */       //   294: istore #11
/*     */       //   296: aload_2
/*     */       //   297: ldc -1323940314
/*     */       //   299: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   301: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   304: aload_2
/*     */       //   305: iconst_0
/*     */       //   306: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   309: istore #12
/*     */       //   311: aload_2
/*     */       //   312: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   317: astore #13
/*     */       //   319: aload_2
/*     */       //   320: aload #4
/*     */       //   322: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   325: astore #14
/*     */       //   327: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   330: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   333: astore #15
/*     */       //   335: bipush #6
/*     */       //   337: sipush #896
/*     */       //   340: iload #10
/*     */       //   342: bipush #6
/*     */       //   344: ishl
/*     */       //   345: iand
/*     */       //   346: ior
/*     */       //   347: istore #16
/*     */       //   349: nop
/*     */       //   350: iconst_0
/*     */       //   351: istore #17
/*     */       //   353: aload_2
/*     */       //   354: ldc -692256719
/*     */       //   356: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   358: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   361: aload_2
/*     */       //   362: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   367: instanceof androidx/compose/runtime/Applier
/*     */       //   370: ifne -> 376
/*     */       //   373: invokestatic invalidApplier : ()V
/*     */       //   376: aload_2
/*     */       //   377: invokeinterface startReusableNode : ()V
/*     */       //   382: aload_2
/*     */       //   383: invokeinterface getInserting : ()Z
/*     */       //   388: ifeq -> 402
/*     */       //   391: aload_2
/*     */       //   392: aload #15
/*     */       //   394: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   399: goto -> 408
/*     */       //   402: aload_2
/*     */       //   403: invokeinterface useNode : ()V
/*     */       //   408: aload_2
/*     */       //   409: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   412: astore #18
/*     */       //   414: iconst_0
/*     */       //   415: istore #19
/*     */       //   417: aload #18
/*     */       //   419: aload #9
/*     */       //   421: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   424: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   427: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   430: aload #18
/*     */       //   432: aload #13
/*     */       //   434: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   437: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   440: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   443: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   446: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   449: astore #20
/*     */       //   451: iconst_0
/*     */       //   452: istore #21
/*     */       //   454: aload #18
/*     */       //   456: astore #22
/*     */       //   458: iconst_0
/*     */       //   459: istore #23
/*     */       //   461: aload #22
/*     */       //   463: invokeinterface getInserting : ()Z
/*     */       //   468: ifne -> 489
/*     */       //   471: aload #22
/*     */       //   473: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   478: iload #12
/*     */       //   480: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   483: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   486: ifne -> 515
/*     */       //   489: aload #22
/*     */       //   491: iload #12
/*     */       //   493: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   496: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   501: aload #18
/*     */       //   503: iload #12
/*     */       //   505: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   508: aload #20
/*     */       //   510: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   515: nop
/*     */       //   516: nop
/*     */       //   517: nop
/*     */       //   518: aload #18
/*     */       //   520: aload #14
/*     */       //   522: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   525: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   528: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   531: nop
/*     */       //   532: nop
/*     */       //   533: aload_2
/*     */       //   534: bipush #14
/*     */       //   536: iload #16
/*     */       //   538: bipush #6
/*     */       //   540: ishr
/*     */       //   541: iand
/*     */       //   542: istore #24
/*     */       //   544: astore #25
/*     */       //   546: iconst_0
/*     */       //   547: istore #26
/*     */       //   549: aload #25
/*     */       //   551: ldc -407840262
/*     */       //   553: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */       //   556: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   559: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */       //   562: aload #25
/*     */       //   564: bipush #6
/*     */       //   566: bipush #112
/*     */       //   568: iload #7
/*     */       //   570: bipush #6
/*     */       //   572: ishr
/*     */       //   573: iand
/*     */       //   574: ior
/*     */       //   575: istore #27
/*     */       //   577: astore #28
/*     */       //   579: checkcast androidx/compose/foundation/layout/RowScope
/*     */       //   582: astore #29
/*     */       //   584: iconst_0
/*     */       //   585: istore #30
/*     */       //   587: ldc_w 'Open AI ignore file'
/*     */       //   590: aconst_null
/*     */       //   591: lconst_0
/*     */       //   592: lconst_0
/*     */       //   593: aconst_null
/*     */       //   594: aconst_null
/*     */       //   595: aconst_null
/*     */       //   596: lconst_0
/*     */       //   597: aconst_null
/*     */       //   598: iconst_0
/*     */       //   599: lconst_0
/*     */       //   600: iconst_0
/*     */       //   601: iconst_0
/*     */       //   602: iconst_0
/*     */       //   603: aconst_null
/*     */       //   604: aconst_null
/*     */       //   605: aload #28
/*     */       //   607: bipush #6
/*     */       //   609: iconst_0
/*     */       //   610: ldc_w 65534
/*     */       //   613: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */       //   616: nop
/*     */       //   617: aload #25
/*     */       //   619: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   622: aload_2
/*     */       //   623: invokeinterface endNode : ()V
/*     */       //   628: aload_2
/*     */       //   629: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   632: nop
/*     */       //   633: aload_2
/*     */       //   634: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   637: nop
/*     */       //   638: aload_2
/*     */       //   639: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   642: nop
/*     */       //   643: invokestatic isTraceInProgress : ()Z
/*     */       //   646: ifeq -> 661
/*     */       //   649: invokestatic traceEventEnd : ()V
/*     */       //   652: goto -> 661
/*     */       //   655: aload_2
/*     */       //   656: invokeinterface skipToGroupEnd : ()V
/*     */       //   661: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #113	-> 0
/*     */       //   #114	-> 33
/*     */       //   #115	-> 46
/*     */       //   #235	-> 100
/*     */       //   #236	-> 112
/*     */       //   #237	-> 128
/*     */       //   #115	-> 143
/*     */       //   #237	-> 168
/*     */       //   #238	-> 170
/*     */       //   #239	-> 179
/*     */       //   #240	-> 184
/*     */       //   #236	-> 186
/*     */       //   #235	-> 187
/*     */       //   #235	-> 188
/*     */       //   #115	-> 189
/*     */       //   #119	-> 208
/*     */       //   #241	-> 214
/*     */       //   #119	-> 220
/*     */       //   #120	-> 225
/*     */       //   #113	-> 238
/*     */       //   #242	-> 247
/*     */       //   #243	-> 250
/*     */       //   #247	-> 258
/*     */       //   #248	-> 292
/*     */       //   #249	-> 301
/*     */       //   #250	-> 306
/*     */       //   #251	-> 312
/*     */       //   #252	-> 320
/*     */       //   #254	-> 327
/*     */       //   #253	-> 349
/*     */       //   #255	-> 358
/*     */       //   #256	-> 361
/*     */       //   #257	-> 377
/*     */       //   #258	-> 382
/*     */       //   #259	-> 392
/*     */       //   #261	-> 403
/*     */       //   #263	-> 408
/*     */       //   #264	-> 417
/*     */       //   #265	-> 430
/*     */       //   #267	-> 443
/*     */       //   #268	-> 454
/*     */       //   #269	-> 461
/*     */       //   #270	-> 489
/*     */       //   #271	-> 501
/*     */       //   #273	-> 515
/*     */       //   #268	-> 516
/*     */       //   #273	-> 517
/*     */       //   #274	-> 518
/*     */       //   #275	-> 531
/*     */       //   #263	-> 532
/*     */       //   #276	-> 533
/*     */       //   #277	-> 556
/*     */       //   #122	-> 587
/*     */       //   #123	-> 616
/*     */       //   #277	-> 617
/*     */       //   #276	-> 622
/*     */       //   #278	-> 623
/*     */       //   #255	-> 629
/*     */       //   #279	-> 632
/*     */       //   #249	-> 634
/*     */       //   #280	-> 637
/*     */       //   #242	-> 639
/*     */       //   #281	-> 642
/*     */       //   #123	-> 655
/*     */       //   #124	-> 661
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   143	9	12	$i$a$-cache-JunieFilePickerKt$JunieFilePickerDialog$2$4$1	I
/*     */       //   170	11	13	value$iv	Ljava/lang/Object;
/*     */       //   112	75	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   109	78	10	it$iv	Ljava/lang/Object;
/*     */       //   100	89	9	$i$f$cache	I
/*     */       //   97	92	5	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   97	92	6	invalid$iv	Z
/*     */       //   214	6	5	$i$f$getDp	I
/*     */       //   211	9	4	$this$dp$iv	I
/*     */       //   587	30	30	$i$a$-Row-JunieFilePickerKt$JunieFilePickerDialog$2$4$2	I
/*     */       //   584	33	29	$this$invoke_u24lambda_u242	Landroidx/compose/foundation/layout/RowScope;
/*     */       //   584	33	28	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   584	33	27	$changed	I
/*     */       //   549	73	26	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */       //   546	76	25	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   546	76	24	$changed$iv	I
/*     */       //   461	55	23	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   458	58	22	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   454	64	21	$i$f$set-impl	I
/*     */       //   451	67	20	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   417	115	19	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   414	118	18	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   353	280	17	$i$f$ReusableComposeNode	I
/*     */       //   350	283	15	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   350	283	16	$changed$iv$iv$iv	I
/*     */       //   296	342	11	$i$f$Layout	I
/*     */       //   311	327	12	compositeKeyHash$iv$iv	I
/*     */       //   319	319	13	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   327	311	14	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   293	345	10	$changed$iv$iv	I
/*     */       //   242	401	8	$i$f$Row	I
/*     */       //   283	360	9	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   239	404	4	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */       //   258	385	5	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */       //   239	404	6	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */       //   239	404	7	$changed$iv	I
/*     */       //   0	662	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$4;
/*     */       //   0	662	1	it	Z
/*     */       //   0	662	2	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	662	3	$changed	I } private static final Unit invoke$lambda$1$lambda$0(Function0 $onOpenAiIgnoreFile, Function0 $onCloseRequest) { $onOpenAiIgnoreFile.invoke(); $onCloseRequest.invoke(); return Unit.INSTANCE; } JunieFilePickerKt$JunieFilePickerDialog$2$4(float $dialogWidthDp, Function0<Unit> $onOpenAiIgnoreFile, Function0<Unit> $onCloseRequest) {} } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nJunieFilePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$5\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,234:1\n1225#2,6:235\n149#3:241\n99#4:242\n96#4,6:243\n102#4:277\n106#4:281\n79#5,6:249\n86#5,4:264\n90#5,2:274\n94#5:280\n368#6,9:255\n377#6:276\n378#6,2:278\n4034#7,6:268\n*S KotlinDebug\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$5\n*L\n129#1:235,6\n133#1:241\n127#1:242\n127#1:243,6\n127#1:277\n127#1:281\n127#1:249,6\n127#1:264,4\n127#1:274,2\n127#1:280\n127#1:255,9\n127#1:276\n127#1:278,2\n127#1:268,6\n*E\n"}) static final class JunieFilePickerKt$JunieFilePickerDialog$2$5 implements Function3<Boolean, Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(boolean it, Composer $composer, int $changed) { // Byte code:
/*     */       //   0: iload_3
/*     */       //   1: bipush #17
/*     */       //   3: iand
/*     */       //   4: bipush #16
/*     */       //   6: if_icmpne -> 18
/*     */       //   9: aload_2
/*     */       //   10: invokeinterface getSkipping : ()Z
/*     */       //   15: ifne -> 655
/*     */       //   18: invokestatic isTraceInProgress : ()Z
/*     */       //   21: ifeq -> 33
/*     */       //   24: ldc -1108353645
/*     */       //   26: iload_3
/*     */       //   27: iconst_m1
/*     */       //   28: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieFilePickerDialog.<anonymous>.<anonymous> (JunieFilePicker.kt:126)'
/*     */       //   30: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   33: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   36: checkcast androidx/compose/ui/Modifier
/*     */       //   39: aload_0
/*     */       //   40: getfield $dialogWidthDp : F
/*     */       //   43: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */       //   46: iconst_0
/*     */       //   47: aconst_null
/*     */       //   48: aconst_null
/*     */       //   49: aconst_null
/*     */       //   50: aconst_null
/*     */       //   51: aload_2
/*     */       //   52: ldc 909785087
/*     */       //   54: invokeinterface startReplaceGroup : (I)V
/*     */       //   59: aload_2
/*     */       //   60: astore #5
/*     */       //   62: aload_2
/*     */       //   63: aload_0
/*     */       //   64: getfield $onCreateAiIgnoreFile : Lkotlin/jvm/functions/Function0;
/*     */       //   67: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   72: aload_2
/*     */       //   73: aload_0
/*     */       //   74: getfield $onCloseRequest : Lkotlin/jvm/functions/Function0;
/*     */       //   77: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   82: ior
/*     */       //   83: istore #6
/*     */       //   85: aload_0
/*     */       //   86: getfield $onCreateAiIgnoreFile : Lkotlin/jvm/functions/Function0;
/*     */       //   89: astore #7
/*     */       //   91: aload_0
/*     */       //   92: getfield $onCloseRequest : Lkotlin/jvm/functions/Function0;
/*     */       //   95: astore #8
/*     */       //   97: iconst_0
/*     */       //   98: istore #9
/*     */       //   100: aload #5
/*     */       //   102: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   107: astore #10
/*     */       //   109: iconst_0
/*     */       //   110: istore #11
/*     */       //   112: iload #6
/*     */       //   114: ifne -> 128
/*     */       //   117: aload #10
/*     */       //   119: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   122: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   125: if_acmpne -> 184
/*     */       //   128: astore #36
/*     */       //   130: astore #35
/*     */       //   132: astore #34
/*     */       //   134: astore #33
/*     */       //   136: istore #32
/*     */       //   138: astore #31
/*     */       //   140: iconst_0
/*     */       //   141: istore #12
/*     */       //   143: aload #7
/*     */       //   145: aload #8
/*     */       //   147: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
/*     */       //   152: astore #37
/*     */       //   154: aload #31
/*     */       //   156: iload #32
/*     */       //   158: aload #33
/*     */       //   160: aload #34
/*     */       //   162: aload #35
/*     */       //   164: aload #36
/*     */       //   166: aload #37
/*     */       //   168: astore #13
/*     */       //   170: aload #5
/*     */       //   172: aload #13
/*     */       //   174: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   179: aload #13
/*     */       //   181: goto -> 186
/*     */       //   184: aload #10
/*     */       //   186: nop
/*     */       //   187: nop
/*     */       //   188: nop
/*     */       //   189: checkcast kotlin/jvm/functions/Function0
/*     */       //   192: astore #4
/*     */       //   194: aload_2
/*     */       //   195: invokeinterface endReplaceGroup : ()V
/*     */       //   200: aload #4
/*     */       //   202: bipush #31
/*     */       //   204: aconst_null
/*     */       //   205: invokestatic onClick$default : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/PointerMatcher;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   208: iconst_4
/*     */       //   209: istore #4
/*     */       //   211: iconst_0
/*     */       //   212: istore #5
/*     */       //   214: iload #4
/*     */       //   216: i2f
/*     */       //   217: invokestatic constructor-impl : (F)F
/*     */       //   220: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */       //   223: astore #4
/*     */       //   225: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   228: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */       //   231: astore #6
/*     */       //   233: sipush #384
/*     */       //   236: istore #7
/*     */       //   238: nop
/*     */       //   239: iconst_0
/*     */       //   240: istore #8
/*     */       //   242: aload_2
/*     */       //   243: ldc 693286680
/*     */       //   245: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */       //   247: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   250: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */       //   253: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */       //   256: astore #5
/*     */       //   258: aload #5
/*     */       //   260: aload #6
/*     */       //   262: aload_2
/*     */       //   263: bipush #14
/*     */       //   265: iload #7
/*     */       //   267: iconst_3
/*     */       //   268: ishr
/*     */       //   269: iand
/*     */       //   270: bipush #112
/*     */       //   272: iload #7
/*     */       //   274: iconst_3
/*     */       //   275: ishr
/*     */       //   276: iand
/*     */       //   277: ior
/*     */       //   278: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   281: astore #9
/*     */       //   283: bipush #112
/*     */       //   285: iload #7
/*     */       //   287: iconst_3
/*     */       //   288: ishl
/*     */       //   289: iand
/*     */       //   290: istore #10
/*     */       //   292: nop
/*     */       //   293: iconst_0
/*     */       //   294: istore #11
/*     */       //   296: aload_2
/*     */       //   297: ldc -1323940314
/*     */       //   299: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   301: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   304: aload_2
/*     */       //   305: iconst_0
/*     */       //   306: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   309: istore #12
/*     */       //   311: aload_2
/*     */       //   312: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   317: astore #13
/*     */       //   319: aload_2
/*     */       //   320: aload #4
/*     */       //   322: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   325: astore #14
/*     */       //   327: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   330: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   333: astore #15
/*     */       //   335: bipush #6
/*     */       //   337: sipush #896
/*     */       //   340: iload #10
/*     */       //   342: bipush #6
/*     */       //   344: ishl
/*     */       //   345: iand
/*     */       //   346: ior
/*     */       //   347: istore #16
/*     */       //   349: nop
/*     */       //   350: iconst_0
/*     */       //   351: istore #17
/*     */       //   353: aload_2
/*     */       //   354: ldc -692256719
/*     */       //   356: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   358: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   361: aload_2
/*     */       //   362: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   367: instanceof androidx/compose/runtime/Applier
/*     */       //   370: ifne -> 376
/*     */       //   373: invokestatic invalidApplier : ()V
/*     */       //   376: aload_2
/*     */       //   377: invokeinterface startReusableNode : ()V
/*     */       //   382: aload_2
/*     */       //   383: invokeinterface getInserting : ()Z
/*     */       //   388: ifeq -> 402
/*     */       //   391: aload_2
/*     */       //   392: aload #15
/*     */       //   394: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   399: goto -> 408
/*     */       //   402: aload_2
/*     */       //   403: invokeinterface useNode : ()V
/*     */       //   408: aload_2
/*     */       //   409: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   412: astore #18
/*     */       //   414: iconst_0
/*     */       //   415: istore #19
/*     */       //   417: aload #18
/*     */       //   419: aload #9
/*     */       //   421: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   424: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   427: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   430: aload #18
/*     */       //   432: aload #13
/*     */       //   434: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   437: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   440: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   443: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   446: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   449: astore #20
/*     */       //   451: iconst_0
/*     */       //   452: istore #21
/*     */       //   454: aload #18
/*     */       //   456: astore #22
/*     */       //   458: iconst_0
/*     */       //   459: istore #23
/*     */       //   461: aload #22
/*     */       //   463: invokeinterface getInserting : ()Z
/*     */       //   468: ifne -> 489
/*     */       //   471: aload #22
/*     */       //   473: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   478: iload #12
/*     */       //   480: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   483: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   486: ifne -> 515
/*     */       //   489: aload #22
/*     */       //   491: iload #12
/*     */       //   493: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   496: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   501: aload #18
/*     */       //   503: iload #12
/*     */       //   505: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   508: aload #20
/*     */       //   510: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   515: nop
/*     */       //   516: nop
/*     */       //   517: nop
/*     */       //   518: aload #18
/*     */       //   520: aload #14
/*     */       //   522: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   525: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   528: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   531: nop
/*     */       //   532: nop
/*     */       //   533: aload_2
/*     */       //   534: bipush #14
/*     */       //   536: iload #16
/*     */       //   538: bipush #6
/*     */       //   540: ishr
/*     */       //   541: iand
/*     */       //   542: istore #24
/*     */       //   544: astore #25
/*     */       //   546: iconst_0
/*     */       //   547: istore #26
/*     */       //   549: aload #25
/*     */       //   551: ldc -407840262
/*     */       //   553: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */       //   556: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   559: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */       //   562: aload #25
/*     */       //   564: bipush #6
/*     */       //   566: bipush #112
/*     */       //   568: iload #7
/*     */       //   570: bipush #6
/*     */       //   572: ishr
/*     */       //   573: iand
/*     */       //   574: ior
/*     */       //   575: istore #27
/*     */       //   577: astore #28
/*     */       //   579: checkcast androidx/compose/foundation/layout/RowScope
/*     */       //   582: astore #29
/*     */       //   584: iconst_0
/*     */       //   585: istore #30
/*     */       //   587: ldc_w 'Create AI ignore file'
/*     */       //   590: aconst_null
/*     */       //   591: lconst_0
/*     */       //   592: lconst_0
/*     */       //   593: aconst_null
/*     */       //   594: aconst_null
/*     */       //   595: aconst_null
/*     */       //   596: lconst_0
/*     */       //   597: aconst_null
/*     */       //   598: iconst_0
/*     */       //   599: lconst_0
/*     */       //   600: iconst_0
/*     */       //   601: iconst_0
/*     */       //   602: iconst_0
/*     */       //   603: aconst_null
/*     */       //   604: aconst_null
/*     */       //   605: aload #28
/*     */       //   607: bipush #6
/*     */       //   609: iconst_0
/*     */       //   610: ldc_w 65534
/*     */       //   613: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */       //   616: nop
/*     */       //   617: aload #25
/*     */       //   619: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   622: aload_2
/*     */       //   623: invokeinterface endNode : ()V
/*     */       //   628: aload_2
/*     */       //   629: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   632: nop
/*     */       //   633: aload_2
/*     */       //   634: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   637: nop
/*     */       //   638: aload_2
/*     */       //   639: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   642: nop
/*     */       //   643: invokestatic isTraceInProgress : ()Z
/*     */       //   646: ifeq -> 661
/*     */       //   649: invokestatic traceEventEnd : ()V
/*     */       //   652: goto -> 661
/*     */       //   655: aload_2
/*     */       //   656: invokeinterface skipToGroupEnd : ()V
/*     */       //   661: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #127	-> 0
/*     */       //   #128	-> 33
/*     */       //   #129	-> 46
/*     */       //   #235	-> 100
/*     */       //   #236	-> 112
/*     */       //   #237	-> 128
/*     */       //   #129	-> 143
/*     */       //   #237	-> 168
/*     */       //   #238	-> 170
/*     */       //   #239	-> 179
/*     */       //   #240	-> 184
/*     */       //   #236	-> 186
/*     */       //   #235	-> 187
/*     */       //   #235	-> 188
/*     */       //   #129	-> 189
/*     */       //   #133	-> 208
/*     */       //   #241	-> 214
/*     */       //   #133	-> 220
/*     */       //   #134	-> 225
/*     */       //   #127	-> 238
/*     */       //   #242	-> 247
/*     */       //   #243	-> 250
/*     */       //   #247	-> 258
/*     */       //   #248	-> 292
/*     */       //   #249	-> 301
/*     */       //   #250	-> 306
/*     */       //   #251	-> 312
/*     */       //   #252	-> 320
/*     */       //   #254	-> 327
/*     */       //   #253	-> 349
/*     */       //   #255	-> 358
/*     */       //   #256	-> 361
/*     */       //   #257	-> 377
/*     */       //   #258	-> 382
/*     */       //   #259	-> 392
/*     */       //   #261	-> 403
/*     */       //   #263	-> 408
/*     */       //   #264	-> 417
/*     */       //   #265	-> 430
/*     */       //   #267	-> 443
/*     */       //   #268	-> 454
/*     */       //   #269	-> 461
/*     */       //   #270	-> 489
/*     */       //   #271	-> 501
/*     */       //   #273	-> 515
/*     */       //   #268	-> 516
/*     */       //   #273	-> 517
/*     */       //   #274	-> 518
/*     */       //   #275	-> 531
/*     */       //   #263	-> 532
/*     */       //   #276	-> 533
/*     */       //   #277	-> 556
/*     */       //   #136	-> 587
/*     */       //   #137	-> 616
/*     */       //   #277	-> 617
/*     */       //   #276	-> 622
/*     */       //   #278	-> 623
/*     */       //   #255	-> 629
/*     */       //   #279	-> 632
/*     */       //   #249	-> 634
/*     */       //   #280	-> 637
/*     */       //   #242	-> 639
/*     */       //   #281	-> 642
/*     */       //   #137	-> 655
/*     */       //   #138	-> 661
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   143	9	12	$i$a$-cache-JunieFilePickerKt$JunieFilePickerDialog$2$5$1	I
/*     */       //   170	11	13	value$iv	Ljava/lang/Object;
/*     */       //   112	75	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   109	78	10	it$iv	Ljava/lang/Object;
/*     */       //   100	89	9	$i$f$cache	I
/*     */       //   97	92	5	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   97	92	6	invalid$iv	Z
/*     */       //   214	6	5	$i$f$getDp	I
/*     */       //   211	9	4	$this$dp$iv	I
/*     */       //   587	30	30	$i$a$-Row-JunieFilePickerKt$JunieFilePickerDialog$2$5$2	I
/*     */       //   584	33	29	$this$invoke_u24lambda_u242	Landroidx/compose/foundation/layout/RowScope;
/*     */       //   584	33	28	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   584	33	27	$changed	I
/*     */       //   549	73	26	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */       //   546	76	25	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   546	76	24	$changed$iv	I
/*     */       //   461	55	23	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   458	58	22	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   454	64	21	$i$f$set-impl	I
/*     */       //   451	67	20	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   417	115	19	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   414	118	18	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   353	280	17	$i$f$ReusableComposeNode	I
/*     */       //   350	283	15	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   350	283	16	$changed$iv$iv$iv	I
/*     */       //   296	342	11	$i$f$Layout	I
/*     */       //   311	327	12	compositeKeyHash$iv$iv	I
/*     */       //   319	319	13	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   327	311	14	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   293	345	10	$changed$iv$iv	I
/*     */       //   242	401	8	$i$f$Row	I
/*     */       //   283	360	9	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   239	404	4	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */       //   258	385	5	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */       //   239	404	6	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */       //   239	404	7	$changed$iv	I
/*     */       //   0	662	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$5;
/*     */       //   0	662	1	it	Z
/*     */       //   0	662	2	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	662	3	$changed	I } private static final Unit invoke$lambda$1$lambda$0(Function0 $onCreateAiIgnoreFile, Function0 $onCloseRequest) { $onCreateAiIgnoreFile.invoke(); $onCloseRequest.invoke(); return Unit.INSTANCE; } JunieFilePickerKt$JunieFilePickerDialog$2$5(float $dialogWidthDp, Function0<Unit> $onCreateAiIgnoreFile, Function0<Unit> $onCloseRequest) {} } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nJunieFilePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$7\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,234:1\n1225#2,6:235\n1863#3,2:241\n*S KotlinDebug\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$7\n*L\n166#1:235,6\n167#1:241,2\n*E\n"}) static final class JunieFilePickerKt$JunieFilePickerDialog$2$7 implements Function2<Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { // Byte code:
/*     */       //   0: iload_2
/*     */       //   1: iconst_3
/*     */       //   2: iand
/*     */       //   3: iconst_2
/*     */       //   4: if_icmpne -> 16
/*     */       //   7: aload_1
/*     */       //   8: invokeinterface getSkipping : ()Z
/*     */       //   13: ifne -> 276
/*     */       //   16: invokestatic isTraceInProgress : ()Z
/*     */       //   19: ifeq -> 31
/*     */       //   22: ldc 324612721
/*     */       //   24: iload_2
/*     */       //   25: iconst_m1
/*     */       //   26: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieFilePickerDialog.<anonymous>.<anonymous> (JunieFilePicker.kt:163)'
/*     */       //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   31: aconst_null
/*     */       //   32: aload_0
/*     */       //   33: getfield $lazyListState : Landroidx/compose/foundation/lazy/LazyListState;
/*     */       //   36: aconst_null
/*     */       //   37: iconst_0
/*     */       //   38: aconst_null
/*     */       //   39: aconst_null
/*     */       //   40: aconst_null
/*     */       //   41: iconst_0
/*     */       //   42: aload_1
/*     */       //   43: ldc 909817141
/*     */       //   45: invokeinterface startReplaceGroup : (I)V
/*     */       //   50: aload_1
/*     */       //   51: astore #4
/*     */       //   53: aload_1
/*     */       //   54: aload_0
/*     */       //   55: getfield $recentFiles : Ljava/util/List;
/*     */       //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   63: aload_1
/*     */       //   64: aload_0
/*     */       //   65: getfield $dialogWidthDp : F
/*     */       //   68: invokeinterface changed : (F)Z
/*     */       //   73: ior
/*     */       //   74: aload_1
/*     */       //   75: aload_0
/*     */       //   76: getfield $hoveredItemBackground : J
/*     */       //   79: invokeinterface changed : (J)Z
/*     */       //   84: ior
/*     */       //   85: aload_1
/*     */       //   86: aload_0
/*     */       //   87: getfield $onFileChosen : Lkotlin/jvm/functions/Function1;
/*     */       //   90: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   95: ior
/*     */       //   96: aload_1
/*     */       //   97: aload_0
/*     */       //   98: getfield $onCloseRequest : Lkotlin/jvm/functions/Function0;
/*     */       //   101: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   106: ior
/*     */       //   107: istore #5
/*     */       //   109: aload_0
/*     */       //   110: getfield $recentFiles : Ljava/util/List;
/*     */       //   113: astore #6
/*     */       //   115: aload_0
/*     */       //   116: getfield $dialogWidthDp : F
/*     */       //   119: fstore #7
/*     */       //   121: aload_0
/*     */       //   122: getfield $hoveredItemBackground : J
/*     */       //   125: lstore #8
/*     */       //   127: aload_0
/*     */       //   128: getfield $onFileChosen : Lkotlin/jvm/functions/Function1;
/*     */       //   131: astore #10
/*     */       //   133: aload_0
/*     */       //   134: getfield $onCloseRequest : Lkotlin/jvm/functions/Function0;
/*     */       //   137: astore #11
/*     */       //   139: iconst_0
/*     */       //   140: istore #12
/*     */       //   142: aload #4
/*     */       //   144: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   149: astore #13
/*     */       //   151: iconst_0
/*     */       //   152: istore #14
/*     */       //   154: iload #5
/*     */       //   156: ifne -> 170
/*     */       //   159: aload #13
/*     */       //   161: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   164: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   167: if_acmpne -> 240
/*     */       //   170: istore #24
/*     */       //   172: astore #23
/*     */       //   174: astore #22
/*     */       //   176: astore #21
/*     */       //   178: istore #20
/*     */       //   180: astore #19
/*     */       //   182: astore #18
/*     */       //   184: astore #17
/*     */       //   186: iconst_0
/*     */       //   187: istore #15
/*     */       //   189: aload #6
/*     */       //   191: fload #7
/*     */       //   193: lload #8
/*     */       //   195: aload #10
/*     */       //   197: aload #11
/*     */       //   199: <illegal opcode> invoke : (Ljava/util/List;FJLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function1;
/*     */       //   204: astore #25
/*     */       //   206: aload #17
/*     */       //   208: aload #18
/*     */       //   210: aload #19
/*     */       //   212: iload #20
/*     */       //   214: aload #21
/*     */       //   216: aload #22
/*     */       //   218: aload #23
/*     */       //   220: iload #24
/*     */       //   222: aload #25
/*     */       //   224: astore #16
/*     */       //   226: aload #4
/*     */       //   228: aload #16
/*     */       //   230: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   235: aload #16
/*     */       //   237: goto -> 242
/*     */       //   240: aload #13
/*     */       //   242: nop
/*     */       //   243: nop
/*     */       //   244: nop
/*     */       //   245: checkcast kotlin/jvm/functions/Function1
/*     */       //   248: astore_3
/*     */       //   249: aload_1
/*     */       //   250: invokeinterface endReplaceGroup : ()V
/*     */       //   255: aload_3
/*     */       //   256: aload_1
/*     */       //   257: iconst_0
/*     */       //   258: sipush #253
/*     */       //   261: invokestatic LazyColumn : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
/*     */       //   264: invokestatic isTraceInProgress : ()Z
/*     */       //   267: ifeq -> 282
/*     */       //   270: invokestatic traceEventEnd : ()V
/*     */       //   273: goto -> 282
/*     */       //   276: aload_1
/*     */       //   277: invokeinterface skipToGroupEnd : ()V
/*     */       //   282: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #164	-> 0
/*     */       //   #165	-> 32
/*     */       //   #166	-> 109
/*     */       //   #235	-> 142
/*     */       //   #236	-> 154
/*     */       //   #237	-> 170
/*     */       //   #166	-> 189
/*     */       //   #237	-> 224
/*     */       //   #238	-> 226
/*     */       //   #239	-> 235
/*     */       //   #240	-> 240
/*     */       //   #236	-> 242
/*     */       //   #235	-> 243
/*     */       //   #235	-> 244
/*     */       //   #166	-> 245
/*     */       //   #164	-> 261
/*     */       //   #204	-> 276
/*     */       //   #205	-> 282
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   189	15	15	$i$a$-cache-JunieFilePickerKt$JunieFilePickerDialog$2$7$1	I
/*     */       //   226	11	16	value$iv	Ljava/lang/Object;
/*     */       //   154	89	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   151	92	13	it$iv	Ljava/lang/Object;
/*     */       //   142	103	12	$i$f$cache	I
/*     */       //   139	106	4	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   139	106	5	invalid$iv	Z
/*     */       //   0	283	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$7;
/*     */       //   0	283	1	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	283	2	$changed	I } private static final Unit invoke$lambda$2$lambda$1(List $recentFiles, float $dialogWidthDp, long $hoveredItemBackground, Function1<? super AttachedFile, Unit> $onFileChosen, Function0<Unit> $onCloseRequest, LazyListScope $this$LazyColumn) { Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn"); Iterable $this$forEach$iv = $recentFiles; int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); FileListEntry fileListEntry = (FileListEntry)element$iv; int $i$a$-forEach-JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1 = 0; LazyListScope.item$default($this$LazyColumn, null, null, (Function3)ComposableLambdaKt.composableLambdaInstance(-1476751354, true, new JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1($dialogWidthDp, $hoveredItemBackground, $onFileChosen, fileListEntry, $onCloseRequest)), 3, null); }  return Unit.INSTANCE; } JunieFilePickerKt$JunieFilePickerDialog$2$7(LazyListState $lazyListState, List<FileListEntry> $recentFiles, float $dialogWidthDp, long $hoveredItemBackground, Function1<AttachedFile, Unit> $onFileChosen, Function0<Unit> $onCloseRequest) {} } @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") private static final void HoverHighlightRow-Iv8Zu3U(long hoverColor, Function3 content, Composer $composer, int $changed) { // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: ldc_w 806369353
/*     */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   9: astore_3
/*     */     //   10: iload #4
/*     */     //   12: istore #5
/*     */     //   14: iload #4
/*     */     //   16: bipush #6
/*     */     //   18: iand
/*     */     //   19: ifne -> 42
/*     */     //   22: iload #5
/*     */     //   24: aload_3
/*     */     //   25: lload_0
/*     */     //   26: invokeinterface changed : (J)Z
/*     */     //   31: ifeq -> 38
/*     */     //   34: iconst_4
/*     */     //   35: goto -> 39
/*     */     //   38: iconst_2
/*     */     //   39: ior
/*     */     //   40: istore #5
/*     */     //   42: iload #4
/*     */     //   44: bipush #48
/*     */     //   46: iand
/*     */     //   47: ifne -> 72
/*     */     //   50: iload #5
/*     */     //   52: aload_3
/*     */     //   53: aload_2
/*     */     //   54: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   59: ifeq -> 67
/*     */     //   62: bipush #32
/*     */     //   64: goto -> 69
/*     */     //   67: bipush #16
/*     */     //   69: ior
/*     */     //   70: istore #5
/*     */     //   72: iload #5
/*     */     //   74: bipush #19
/*     */     //   76: iand
/*     */     //   77: bipush #18
/*     */     //   79: if_icmpne -> 91
/*     */     //   82: aload_3
/*     */     //   83: invokeinterface getSkipping : ()Z
/*     */     //   88: ifne -> 772
/*     */     //   91: invokestatic isTraceInProgress : ()Z
/*     */     //   94: ifeq -> 109
/*     */     //   97: ldc_w 806369353
/*     */     //   100: iload #5
/*     */     //   102: iconst_m1
/*     */     //   103: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.components.HoverHighlightRow (JunieFilePicker.kt:212)'
/*     */     //   106: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   109: aload_3
/*     */     //   110: ldc_w -2000012223
/*     */     //   113: invokeinterface startReplaceGroup : (I)V
/*     */     //   118: aload_3
/*     */     //   119: astore #8
/*     */     //   121: iconst_0
/*     */     //   122: istore #9
/*     */     //   124: nop
/*     */     //   125: iconst_0
/*     */     //   126: istore #10
/*     */     //   128: aload #8
/*     */     //   130: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   135: astore #11
/*     */     //   137: iconst_0
/*     */     //   138: istore #12
/*     */     //   140: aload #11
/*     */     //   142: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   145: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   148: if_acmpne -> 180
/*     */     //   151: iconst_0
/*     */     //   152: istore #13
/*     */     //   154: iconst_0
/*     */     //   155: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   158: aconst_null
/*     */     //   159: iconst_2
/*     */     //   160: aconst_null
/*     */     //   161: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   164: astore #13
/*     */     //   166: aload #8
/*     */     //   168: aload #13
/*     */     //   170: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   175: aload #13
/*     */     //   177: goto -> 182
/*     */     //   180: aload #11
/*     */     //   182: nop
/*     */     //   183: nop
/*     */     //   184: nop
/*     */     //   185: checkcast androidx/compose/runtime/MutableState
/*     */     //   188: astore #7
/*     */     //   190: aload_3
/*     */     //   191: invokeinterface endReplaceGroup : ()V
/*     */     //   196: aload #7
/*     */     //   198: astore #6
/*     */     //   200: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   203: checkcast androidx/compose/ui/Modifier
/*     */     //   206: aload #6
/*     */     //   208: invokestatic HoverHighlightRow_Iv8Zu3U$lambda$11 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   211: ifeq -> 218
/*     */     //   214: lload_0
/*     */     //   215: goto -> 224
/*     */     //   218: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   221: invokevirtual getUnspecified-0d7_KjU : ()J
/*     */     //   224: bipush #6
/*     */     //   226: istore #7
/*     */     //   228: iconst_0
/*     */     //   229: istore #8
/*     */     //   231: iload #7
/*     */     //   233: i2f
/*     */     //   234: invokestatic constructor-impl : (F)F
/*     */     //   237: invokestatic RoundedCornerShape-0680j_4 : (F)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   240: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   243: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   246: aload_3
/*     */     //   247: ldc_w -2000005295
/*     */     //   250: invokeinterface startReplaceGroup : (I)V
/*     */     //   255: aload_3
/*     */     //   256: astore #8
/*     */     //   258: iconst_0
/*     */     //   259: istore #9
/*     */     //   261: nop
/*     */     //   262: iconst_0
/*     */     //   263: istore #10
/*     */     //   265: aload #8
/*     */     //   267: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   272: astore #11
/*     */     //   274: iconst_0
/*     */     //   275: istore #12
/*     */     //   277: aload #11
/*     */     //   279: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   282: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   285: if_acmpne -> 319
/*     */     //   288: astore #34
/*     */     //   290: iconst_0
/*     */     //   291: istore #13
/*     */     //   293: aload #6
/*     */     //   295: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   300: aload #34
/*     */     //   302: swap
/*     */     //   303: astore #14
/*     */     //   305: aload #8
/*     */     //   307: aload #14
/*     */     //   309: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   314: aload #14
/*     */     //   316: goto -> 321
/*     */     //   319: aload #11
/*     */     //   321: nop
/*     */     //   322: nop
/*     */     //   323: nop
/*     */     //   324: checkcast kotlin/jvm/functions/Function1
/*     */     //   327: astore #7
/*     */     //   329: aload_3
/*     */     //   330: invokeinterface endReplaceGroup : ()V
/*     */     //   335: aload #7
/*     */     //   337: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   340: astore #7
/*     */     //   342: iconst_0
/*     */     //   343: istore #10
/*     */     //   345: nop
/*     */     //   346: iconst_0
/*     */     //   347: istore #11
/*     */     //   349: aload_3
/*     */     //   350: ldc_w 693286680
/*     */     //   353: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   356: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   359: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   362: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   365: astore #8
/*     */     //   367: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   370: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   373: astore #9
/*     */     //   375: aload #8
/*     */     //   377: aload #9
/*     */     //   379: aload_3
/*     */     //   380: bipush #14
/*     */     //   382: iload #10
/*     */     //   384: iconst_3
/*     */     //   385: ishr
/*     */     //   386: iand
/*     */     //   387: bipush #112
/*     */     //   389: iload #10
/*     */     //   391: iconst_3
/*     */     //   392: ishr
/*     */     //   393: iand
/*     */     //   394: ior
/*     */     //   395: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   398: astore #12
/*     */     //   400: bipush #112
/*     */     //   402: iload #10
/*     */     //   404: iconst_3
/*     */     //   405: ishl
/*     */     //   406: iand
/*     */     //   407: istore #13
/*     */     //   409: nop
/*     */     //   410: iconst_0
/*     */     //   411: istore #14
/*     */     //   413: aload_3
/*     */     //   414: ldc -1323940314
/*     */     //   416: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   419: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   422: aload_3
/*     */     //   423: iconst_0
/*     */     //   424: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   427: istore #15
/*     */     //   429: aload_3
/*     */     //   430: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   435: astore #16
/*     */     //   437: aload_3
/*     */     //   438: aload #7
/*     */     //   440: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   443: astore #17
/*     */     //   445: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   448: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   451: astore #18
/*     */     //   453: bipush #6
/*     */     //   455: sipush #896
/*     */     //   458: iload #13
/*     */     //   460: bipush #6
/*     */     //   462: ishl
/*     */     //   463: iand
/*     */     //   464: ior
/*     */     //   465: istore #19
/*     */     //   467: nop
/*     */     //   468: iconst_0
/*     */     //   469: istore #20
/*     */     //   471: aload_3
/*     */     //   472: ldc_w -692256719
/*     */     //   475: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   478: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   481: aload_3
/*     */     //   482: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   487: instanceof androidx/compose/runtime/Applier
/*     */     //   490: ifne -> 496
/*     */     //   493: invokestatic invalidApplier : ()V
/*     */     //   496: aload_3
/*     */     //   497: invokeinterface startReusableNode : ()V
/*     */     //   502: aload_3
/*     */     //   503: invokeinterface getInserting : ()Z
/*     */     //   508: ifeq -> 522
/*     */     //   511: aload_3
/*     */     //   512: aload #18
/*     */     //   514: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   519: goto -> 528
/*     */     //   522: aload_3
/*     */     //   523: invokeinterface useNode : ()V
/*     */     //   528: aload_3
/*     */     //   529: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   532: astore #21
/*     */     //   534: iconst_0
/*     */     //   535: istore #22
/*     */     //   537: aload #21
/*     */     //   539: aload #12
/*     */     //   541: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   544: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   547: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   550: aload #21
/*     */     //   552: aload #16
/*     */     //   554: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   557: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   560: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   563: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   566: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   569: astore #23
/*     */     //   571: iconst_0
/*     */     //   572: istore #24
/*     */     //   574: aload #21
/*     */     //   576: astore #25
/*     */     //   578: iconst_0
/*     */     //   579: istore #26
/*     */     //   581: aload #25
/*     */     //   583: invokeinterface getInserting : ()Z
/*     */     //   588: ifne -> 609
/*     */     //   591: aload #25
/*     */     //   593: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   598: iload #15
/*     */     //   600: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   603: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   606: ifne -> 635
/*     */     //   609: aload #25
/*     */     //   611: iload #15
/*     */     //   613: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   616: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   621: aload #21
/*     */     //   623: iload #15
/*     */     //   625: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   628: aload #23
/*     */     //   630: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   635: nop
/*     */     //   636: nop
/*     */     //   637: nop
/*     */     //   638: aload #21
/*     */     //   640: aload #17
/*     */     //   642: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   645: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   648: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   651: nop
/*     */     //   652: nop
/*     */     //   653: aload_3
/*     */     //   654: bipush #14
/*     */     //   656: iload #19
/*     */     //   658: bipush #6
/*     */     //   660: ishr
/*     */     //   661: iand
/*     */     //   662: istore #27
/*     */     //   664: astore #28
/*     */     //   666: iconst_0
/*     */     //   667: istore #29
/*     */     //   669: aload #28
/*     */     //   671: ldc_w -407840262
/*     */     //   674: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   677: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   680: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   683: aload #28
/*     */     //   685: bipush #6
/*     */     //   687: bipush #112
/*     */     //   689: iload #10
/*     */     //   691: bipush #6
/*     */     //   693: ishr
/*     */     //   694: iand
/*     */     //   695: ior
/*     */     //   696: istore #30
/*     */     //   698: astore #31
/*     */     //   700: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   703: astore #32
/*     */     //   705: iconst_0
/*     */     //   706: istore #33
/*     */     //   708: aload_2
/*     */     //   709: aload #6
/*     */     //   711: invokestatic HoverHighlightRow_Iv8Zu3U$lambda$11 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   714: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   717: aload #31
/*     */     //   719: bipush #112
/*     */     //   721: iload #5
/*     */     //   723: iand
/*     */     //   724: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   727: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   732: pop
/*     */     //   733: nop
/*     */     //   734: aload #28
/*     */     //   736: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   739: aload_3
/*     */     //   740: invokeinterface endNode : ()V
/*     */     //   745: aload_3
/*     */     //   746: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   749: nop
/*     */     //   750: aload_3
/*     */     //   751: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   754: nop
/*     */     //   755: aload_3
/*     */     //   756: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   759: nop
/*     */     //   760: invokestatic isTraceInProgress : ()Z
/*     */     //   763: ifeq -> 778
/*     */     //   766: invokestatic traceEventEnd : ()V
/*     */     //   769: goto -> 778
/*     */     //   772: aload_3
/*     */     //   773: invokeinterface skipToGroupEnd : ()V
/*     */     //   778: aload_3
/*     */     //   779: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   784: dup
/*     */     //   785: ifnull -> 805
/*     */     //   788: lload_0
/*     */     //   789: aload_2
/*     */     //   790: iload #4
/*     */     //   792: <illegal opcode> invoke : (JLkotlin/jvm/functions/Function3;I)Lkotlin/jvm/functions/Function2;
/*     */     //   797: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   802: goto -> 806
/*     */     //   805: pop
/*     */     //   806: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #213	-> 0
/*     */     //   #214	-> 124
/*     */     //   #336	-> 128
/*     */     //   #337	-> 140
/*     */     //   #338	-> 151
/*     */     //   #214	-> 154
/*     */     //   #338	-> 164
/*     */     //   #339	-> 166
/*     */     //   #340	-> 175
/*     */     //   #341	-> 180
/*     */     //   #337	-> 182
/*     */     //   #336	-> 183
/*     */     //   #336	-> 184
/*     */     //   #214	-> 185
/*     */     //   #217	-> 200
/*     */     //   #219	-> 206
/*     */     //   #220	-> 224
/*     */     //   #342	-> 231
/*     */     //   #220	-> 237
/*     */     //   #218	-> 243
/*     */     //   #222	-> 261
/*     */     //   #343	-> 265
/*     */     //   #344	-> 277
/*     */     //   #345	-> 288
/*     */     //   #222	-> 293
/*     */     //   #345	-> 303
/*     */     //   #346	-> 305
/*     */     //   #347	-> 314
/*     */     //   #348	-> 319
/*     */     //   #344	-> 321
/*     */     //   #343	-> 322
/*     */     //   #343	-> 323
/*     */     //   #222	-> 324
/*     */     //   #216	-> 345
/*     */     //   #349	-> 356
/*     */     //   #350	-> 359
/*     */     //   #351	-> 367
/*     */     //   #354	-> 375
/*     */     //   #355	-> 409
/*     */     //   #356	-> 419
/*     */     //   #357	-> 424
/*     */     //   #358	-> 430
/*     */     //   #359	-> 438
/*     */     //   #361	-> 445
/*     */     //   #360	-> 467
/*     */     //   #362	-> 478
/*     */     //   #363	-> 481
/*     */     //   #364	-> 497
/*     */     //   #365	-> 502
/*     */     //   #366	-> 512
/*     */     //   #368	-> 523
/*     */     //   #370	-> 528
/*     */     //   #371	-> 537
/*     */     //   #372	-> 550
/*     */     //   #374	-> 563
/*     */     //   #375	-> 574
/*     */     //   #376	-> 581
/*     */     //   #377	-> 609
/*     */     //   #378	-> 621
/*     */     //   #380	-> 635
/*     */     //   #375	-> 636
/*     */     //   #380	-> 637
/*     */     //   #381	-> 638
/*     */     //   #382	-> 651
/*     */     //   #370	-> 652
/*     */     //   #383	-> 653
/*     */     //   #384	-> 677
/*     */     //   #224	-> 708
/*     */     //   #225	-> 733
/*     */     //   #384	-> 734
/*     */     //   #383	-> 739
/*     */     //   #385	-> 740
/*     */     //   #362	-> 746
/*     */     //   #386	-> 749
/*     */     //   #356	-> 751
/*     */     //   #387	-> 754
/*     */     //   #349	-> 756
/*     */     //   #388	-> 759
/*     */     //   #226	-> 772
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   154	10	13	$i$a$-cache-JunieFilePickerKt$HoverHighlightRow$isHovered$2	I
/*     */     //   166	11	13	value$iv	Ljava/lang/Object;
/*     */     //   140	43	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   137	46	11	it$iv	Ljava/lang/Object;
/*     */     //   128	57	10	$i$f$cache	I
/*     */     //   125	60	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   125	60	9	invalid$iv	Z
/*     */     //   231	6	8	$i$f$getDp	I
/*     */     //   228	9	7	$this$dp$iv	I
/*     */     //   293	7	13	$i$a$-cache-JunieFilePickerKt$HoverHighlightRow$1	I
/*     */     //   305	11	14	value$iv	Ljava/lang/Object;
/*     */     //   277	45	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   274	48	11	it$iv	Ljava/lang/Object;
/*     */     //   265	59	10	$i$f$cache	I
/*     */     //   262	62	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   262	62	9	invalid$iv	Z
/*     */     //   708	26	33	$i$a$-Row-JunieFilePickerKt$HoverHighlightRow$2	I
/*     */     //   705	29	32	$this$HoverHighlightRow_Iv8Zu3U_u24lambda_u2415	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   705	29	31	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   705	29	30	$changed	I
/*     */     //   669	70	29	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   666	73	28	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   666	73	27	$changed$iv	I
/*     */     //   581	55	26	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   578	58	25	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   574	64	24	$i$f$set-impl	I
/*     */     //   571	67	23	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   537	115	22	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   534	118	21	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   471	279	20	$i$f$ReusableComposeNode	I
/*     */     //   468	282	18	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   468	282	19	$changed$iv$iv$iv	I
/*     */     //   413	342	14	$i$f$Layout	I
/*     */     //   429	326	15	compositeKeyHash$iv$iv	I
/*     */     //   437	318	16	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   445	310	17	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   410	345	13	$changed$iv$iv	I
/*     */     //   349	411	11	$i$f$Row	I
/*     */     //   400	360	12	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   346	414	7	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   367	393	8	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   375	385	9	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   346	414	10	$changed$iv	I
/*     */     //   200	569	6	isHovered$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   14	793	5	$dirty	I
/*     */     //   0	807	0	hoverColor	J
/*     */     //   0	807	2	content	Lkotlin/jvm/functions/Function3;
/*     */     //   0	807	3	$composer	Landroidx/compose/runtime/Composer;
/* 394 */     //   0	807	4	$changed	I } private static final void HoverHighlightRow_Iv8Zu3U$lambda$12(MutableState $isHovered$delegate, boolean <set-?>) { MutableState mutableState = $isHovered$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); }
/*     */ 
/*     */   
/*     */   private static final Unit HoverHighlightRow_Iv8Zu3U$lambda$14$lambda$13(MutableState<Boolean> $isHovered$delegate, boolean it) {
/*     */     HoverHighlightRow_Iv8Zu3U$lambda$12($isHovered$delegate, it);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit JunieFilePickerDialog$lambda$9(List<FileListEntry> $recentFiles, GuidelinesEntry $guidelines, Function1<? super AttachedFile, Unit> $onFileChosen, Function0<Unit> $onSelectFileFromProject, Function0<Unit> $onCreateNewGuidelines, Function1<? super GuidelinesEntry, Unit> $onSelectGuidelines, Function0<Unit> $onCloseRequest, Function0<Unit> $onCreateAiIgnoreFile, Function0<Unit> $onOpenAiIgnoreFile, Function1<? super Continuation<? super Boolean>, ? extends Object> $hasAIIgnoreFile, int $$changed, Composer $composer, int $force) {
/*     */     JunieFilePickerDialog($recentFiles, $guidelines, $onFileChosen, $onSelectFileFromProject, $onCreateNewGuidelines, $onSelectGuidelines, $onCloseRequest, $onCreateAiIgnoreFile, $onOpenAiIgnoreFile, $hasAIIgnoreFile, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit HoverHighlightRow_Iv8Zu3U$lambda$16(long $hoverColor, Function3<? super Boolean, ? super Composer, ? super Integer, Unit> $content, int $$changed, Composer $composer, int $force) {
/*     */     HoverHighlightRow-Iv8Zu3U($hoverColor, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieFilePickerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */