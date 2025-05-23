/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.ColumnKt;
/*     */ import androidx.compose.foundation.layout.ColumnScope;
/*     */ import androidx.compose.foundation.layout.ColumnScopeInstance;
/*     */ import androidx.compose.foundation.layout.RowKt;
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.foundation.layout.RowScopeInstance;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.TextUnitKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.math.MathKt;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.LinearProgressBarKt;
/*     */ import org.jetbrains.jewel.ui.component.TextKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\007\032A\020\000\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\0010\0072\020\b\002\020\b\032\n\022\004\022\0020\001\030\0010\007H\007¢\006\002\020\t¨\006\n²\006\n\020\013\032\0020\fX\002"}, d2 = {"LicenseDialog", "", "info", "Lcom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseData;", "modifier", "Landroidx/compose/ui/Modifier;", "onDismiss", "Lkotlin/Function0;", "onUpgradeClicked", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "standalone", "animatedProgress", ""})
/*     */ @SourceDebugExtension({"SMAP\nLicenseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LicenseDialog.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseDialogKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,220:1\n1225#2,6:221\n1225#2,6:227\n149#3:233\n149#3:234\n149#3:270\n149#3:308\n149#3:344\n149#3:395\n86#4:235\n84#4,5:236\n89#4:269\n86#4:271\n82#4,7:272\n89#4:307\n93#4:394\n93#4:439\n79#5,6:241\n86#5,4:256\n90#5,2:266\n79#5,6:279\n86#5,4:294\n90#5,2:304\n79#5,6:315\n86#5,4:330\n90#5,2:340\n79#5,6:353\n86#5,4:368\n90#5,2:378\n94#5:384\n94#5:389\n94#5:393\n79#5,6:403\n86#5,4:418\n90#5,2:428\n94#5:434\n94#5:438\n368#6,9:247\n377#6:268\n368#6,9:285\n377#6:306\n368#6,9:321\n377#6:342\n368#6,9:359\n377#6:380\n378#6,2:382\n378#6,2:387\n378#6,2:391\n368#6,9:409\n377#6:430\n378#6,2:432\n378#6,2:436\n4034#7,6:260\n4034#7,6:298\n4034#7,6:334\n4034#7,6:372\n4034#7,6:422\n99#8:309\n97#8,5:310\n102#8:343\n99#8:345\n95#8,7:346\n102#8:381\n106#8:385\n106#8:390\n1#9:386\n71#10:396\n68#10,6:397\n74#10:431\n78#10:435\n81#11:440\n*S KotlinDebug\n*F\n+ 1 LicenseDialog.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseDialogKt\n*L\n74#1:221,6\n78#1:227,6\n93#1:233\n94#1:234\n103#1:270\n106#1:308\n110#1:344\n203#1:395\n92#1:235\n92#1:236,5\n92#1:269\n102#1:271\n102#1:272,7\n102#1:307\n102#1:394\n92#1:439\n92#1:241,6\n92#1:256,4\n92#1:266,2\n102#1:279,6\n102#1:294,4\n102#1:304,2\n105#1:315,6\n105#1:330,4\n105#1:340,2\n109#1:353,6\n109#1:368,4\n109#1:378,2\n109#1:384\n105#1:389\n102#1:393\n199#1:403,6\n199#1:418,4\n199#1:428,2\n199#1:434\n92#1:438\n92#1:247,9\n92#1:268\n102#1:285,9\n102#1:306\n105#1:321,9\n105#1:342\n109#1:359,9\n109#1:380\n109#1:382,2\n105#1:387,2\n102#1:391,2\n199#1:409,9\n199#1:430\n199#1:432,2\n92#1:436,2\n92#1:260,6\n102#1:298,6\n105#1:334,6\n109#1:372,6\n199#1:422,6\n105#1:309\n105#1:310,5\n105#1:343\n109#1:345\n109#1:346,7\n109#1:381\n109#1:385\n105#1:390\n199#1:396\n199#1:397,6\n199#1:431\n199#1:435\n87#1:440\n*E\n"})
/*     */ public final class LicenseDialogKt
/*     */ {
/*     */   private static final Unit LicenseDialog$lambda$1$lambda$0() {
/*  74 */     return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void LicenseDialog(@NotNull LicenseData info, @Nullable Modifier modifier, @Nullable Function0 onDismiss, @Nullable Function0 onUpgradeClicked, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'info'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #4
/*     */     //   8: ldc -698857573
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore #4
/*     */     //   17: iload #5
/*     */     //   19: istore #7
/*     */     //   21: iload #6
/*     */     //   23: iconst_1
/*     */     //   24: iand
/*     */     //   25: ifeq -> 38
/*     */     //   28: iload #7
/*     */     //   30: bipush #6
/*     */     //   32: ior
/*     */     //   33: istore #7
/*     */     //   35: goto -> 67
/*     */     //   38: iload #5
/*     */     //   40: bipush #6
/*     */     //   42: iand
/*     */     //   43: ifne -> 67
/*     */     //   46: iload #7
/*     */     //   48: aload #4
/*     */     //   50: aload_0
/*     */     //   51: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   56: ifeq -> 63
/*     */     //   59: iconst_4
/*     */     //   60: goto -> 64
/*     */     //   63: iconst_2
/*     */     //   64: ior
/*     */     //   65: istore #7
/*     */     //   67: iload #6
/*     */     //   69: iconst_2
/*     */     //   70: iand
/*     */     //   71: ifeq -> 84
/*     */     //   74: iload #7
/*     */     //   76: bipush #48
/*     */     //   78: ior
/*     */     //   79: istore #7
/*     */     //   81: goto -> 115
/*     */     //   84: iload #5
/*     */     //   86: bipush #48
/*     */     //   88: iand
/*     */     //   89: ifne -> 115
/*     */     //   92: iload #7
/*     */     //   94: aload #4
/*     */     //   96: aload_1
/*     */     //   97: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   102: ifeq -> 110
/*     */     //   105: bipush #32
/*     */     //   107: goto -> 112
/*     */     //   110: bipush #16
/*     */     //   112: ior
/*     */     //   113: istore #7
/*     */     //   115: iload #6
/*     */     //   117: iconst_4
/*     */     //   118: iand
/*     */     //   119: ifeq -> 133
/*     */     //   122: iload #7
/*     */     //   124: sipush #384
/*     */     //   127: ior
/*     */     //   128: istore #7
/*     */     //   130: goto -> 167
/*     */     //   133: iload #5
/*     */     //   135: sipush #384
/*     */     //   138: iand
/*     */     //   139: ifne -> 167
/*     */     //   142: iload #7
/*     */     //   144: aload #4
/*     */     //   146: aload_2
/*     */     //   147: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   152: ifeq -> 161
/*     */     //   155: sipush #256
/*     */     //   158: goto -> 164
/*     */     //   161: sipush #128
/*     */     //   164: ior
/*     */     //   165: istore #7
/*     */     //   167: iload #6
/*     */     //   169: bipush #8
/*     */     //   171: iand
/*     */     //   172: ifeq -> 186
/*     */     //   175: iload #7
/*     */     //   177: sipush #3072
/*     */     //   180: ior
/*     */     //   181: istore #7
/*     */     //   183: goto -> 220
/*     */     //   186: iload #5
/*     */     //   188: sipush #3072
/*     */     //   191: iand
/*     */     //   192: ifne -> 220
/*     */     //   195: iload #7
/*     */     //   197: aload #4
/*     */     //   199: aload_3
/*     */     //   200: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   205: ifeq -> 214
/*     */     //   208: sipush #2048
/*     */     //   211: goto -> 217
/*     */     //   214: sipush #1024
/*     */     //   217: ior
/*     */     //   218: istore #7
/*     */     //   220: iload #7
/*     */     //   222: sipush #1171
/*     */     //   225: iand
/*     */     //   226: sipush #1170
/*     */     //   229: if_icmpne -> 242
/*     */     //   232: aload #4
/*     */     //   234: invokeinterface getSkipping : ()Z
/*     */     //   239: ifne -> 3383
/*     */     //   242: iload #6
/*     */     //   244: iconst_2
/*     */     //   245: iand
/*     */     //   246: ifeq -> 256
/*     */     //   249: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   252: checkcast androidx/compose/ui/Modifier
/*     */     //   255: astore_1
/*     */     //   256: iload #6
/*     */     //   258: iconst_4
/*     */     //   259: iand
/*     */     //   260: ifeq -> 349
/*     */     //   263: aload #4
/*     */     //   265: ldc -991371287
/*     */     //   267: invokeinterface startReplaceGroup : (I)V
/*     */     //   272: aload #4
/*     */     //   274: astore #9
/*     */     //   276: iconst_0
/*     */     //   277: istore #10
/*     */     //   279: iconst_0
/*     */     //   280: istore #11
/*     */     //   282: aload #9
/*     */     //   284: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   289: astore #12
/*     */     //   291: iconst_0
/*     */     //   292: istore #13
/*     */     //   294: aload #12
/*     */     //   296: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   299: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   302: if_acmpne -> 329
/*     */     //   305: iconst_0
/*     */     //   306: istore #14
/*     */     //   308: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*     */     //   313: astore #14
/*     */     //   315: aload #9
/*     */     //   317: aload #14
/*     */     //   319: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   324: aload #14
/*     */     //   326: goto -> 331
/*     */     //   329: aload #12
/*     */     //   331: nop
/*     */     //   332: nop
/*     */     //   333: nop
/*     */     //   334: checkcast kotlin/jvm/functions/Function0
/*     */     //   337: astore #8
/*     */     //   339: aload #4
/*     */     //   341: invokeinterface endReplaceGroup : ()V
/*     */     //   346: aload #8
/*     */     //   348: astore_2
/*     */     //   349: iload #6
/*     */     //   351: bipush #8
/*     */     //   353: iand
/*     */     //   354: ifeq -> 359
/*     */     //   357: aconst_null
/*     */     //   358: astore_3
/*     */     //   359: invokestatic isTraceInProgress : ()Z
/*     */     //   362: ifeq -> 375
/*     */     //   365: ldc -698857573
/*     */     //   367: iload #7
/*     */     //   369: iconst_m1
/*     */     //   370: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.LicenseDialog (LicenseDialog.kt:75)'
/*     */     //   372: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   375: aload_0
/*     */     //   376: invokevirtual getMaxCredits : ()I
/*     */     //   379: istore #9
/*     */     //   381: aload_0
/*     */     //   382: invokevirtual getUsedCredits : ()I
/*     */     //   385: istore #10
/*     */     //   387: aload #4
/*     */     //   389: ldc -991368598
/*     */     //   391: invokeinterface startReplaceGroup : (I)V
/*     */     //   396: aload #4
/*     */     //   398: astore #12
/*     */     //   400: aload #4
/*     */     //   402: iload #9
/*     */     //   404: invokeinterface changed : (I)Z
/*     */     //   409: aload #4
/*     */     //   411: iload #10
/*     */     //   413: invokeinterface changed : (I)Z
/*     */     //   418: ior
/*     */     //   419: istore #13
/*     */     //   421: iconst_0
/*     */     //   422: istore #14
/*     */     //   424: aload #12
/*     */     //   426: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   431: astore #15
/*     */     //   433: iconst_0
/*     */     //   434: istore #16
/*     */     //   436: iload #13
/*     */     //   438: ifne -> 452
/*     */     //   441: aload #15
/*     */     //   443: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   446: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   449: if_acmpne -> 500
/*     */     //   452: iconst_0
/*     */     //   453: istore #17
/*     */     //   455: fconst_1
/*     */     //   456: nop
/*     */     //   457: aload_0
/*     */     //   458: invokevirtual getMaxCredits : ()I
/*     */     //   461: ifle -> 478
/*     */     //   464: aload_0
/*     */     //   465: invokevirtual getUsedCredits : ()I
/*     */     //   468: i2f
/*     */     //   469: aload_0
/*     */     //   470: invokevirtual getMaxCredits : ()I
/*     */     //   473: i2f
/*     */     //   474: fdiv
/*     */     //   475: goto -> 479
/*     */     //   478: fconst_0
/*     */     //   479: fsub
/*     */     //   480: nop
/*     */     //   481: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */     //   484: astore #18
/*     */     //   486: aload #12
/*     */     //   488: aload #18
/*     */     //   490: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   495: aload #18
/*     */     //   497: goto -> 502
/*     */     //   500: aload #15
/*     */     //   502: nop
/*     */     //   503: nop
/*     */     //   504: nop
/*     */     //   505: checkcast java/lang/Number
/*     */     //   508: invokevirtual floatValue : ()F
/*     */     //   511: fstore #11
/*     */     //   513: aload #4
/*     */     //   515: invokeinterface endReplaceGroup : ()V
/*     */     //   520: fload #11
/*     */     //   522: fstore #8
/*     */     //   524: fload #8
/*     */     //   526: sipush #1500
/*     */     //   529: iconst_0
/*     */     //   530: aconst_null
/*     */     //   531: bipush #6
/*     */     //   533: aconst_null
/*     */     //   534: invokestatic tween$default : (IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;
/*     */     //   537: checkcast androidx/compose/animation/core/AnimationSpec
/*     */     //   540: fconst_0
/*     */     //   541: aconst_null
/*     */     //   542: aconst_null
/*     */     //   543: aload #4
/*     */     //   545: bipush #48
/*     */     //   547: bipush #28
/*     */     //   549: invokestatic animateFloatAsState : (FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   552: astore #9
/*     */     //   554: aload_1
/*     */     //   555: bipush #20
/*     */     //   557: istore #10
/*     */     //   559: iconst_0
/*     */     //   560: istore #11
/*     */     //   562: iload #10
/*     */     //   564: i2f
/*     */     //   565: invokestatic constructor-impl : (F)F
/*     */     //   568: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   571: astore #10
/*     */     //   573: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   576: bipush #8
/*     */     //   578: istore #11
/*     */     //   580: iconst_0
/*     */     //   581: istore #12
/*     */     //   583: iload #11
/*     */     //   585: i2f
/*     */     //   586: invokestatic constructor-impl : (F)F
/*     */     //   589: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   592: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*     */     //   595: astore #11
/*     */     //   597: bipush #48
/*     */     //   599: istore #13
/*     */     //   601: nop
/*     */     //   602: iconst_0
/*     */     //   603: istore #14
/*     */     //   605: aload #4
/*     */     //   607: ldc -483455358
/*     */     //   609: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   611: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   614: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   617: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   620: astore #12
/*     */     //   622: aload #11
/*     */     //   624: aload #12
/*     */     //   626: aload #4
/*     */     //   628: bipush #14
/*     */     //   630: iload #13
/*     */     //   632: iconst_3
/*     */     //   633: ishr
/*     */     //   634: iand
/*     */     //   635: bipush #112
/*     */     //   637: iload #13
/*     */     //   639: iconst_3
/*     */     //   640: ishr
/*     */     //   641: iand
/*     */     //   642: ior
/*     */     //   643: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   646: astore #15
/*     */     //   648: bipush #112
/*     */     //   650: iload #13
/*     */     //   652: iconst_3
/*     */     //   653: ishl
/*     */     //   654: iand
/*     */     //   655: istore #16
/*     */     //   657: nop
/*     */     //   658: iconst_0
/*     */     //   659: istore #17
/*     */     //   661: aload #4
/*     */     //   663: ldc -1323940314
/*     */     //   665: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   667: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   670: aload #4
/*     */     //   672: iconst_0
/*     */     //   673: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   676: istore #18
/*     */     //   678: aload #4
/*     */     //   680: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   685: astore #19
/*     */     //   687: aload #4
/*     */     //   689: aload #10
/*     */     //   691: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   694: astore #20
/*     */     //   696: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   699: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   702: astore #21
/*     */     //   704: bipush #6
/*     */     //   706: sipush #896
/*     */     //   709: iload #16
/*     */     //   711: bipush #6
/*     */     //   713: ishl
/*     */     //   714: iand
/*     */     //   715: ior
/*     */     //   716: istore #22
/*     */     //   718: nop
/*     */     //   719: iconst_0
/*     */     //   720: istore #23
/*     */     //   722: aload #4
/*     */     //   724: ldc -692256719
/*     */     //   726: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   728: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   731: aload #4
/*     */     //   733: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   738: instanceof androidx/compose/runtime/Applier
/*     */     //   741: ifne -> 747
/*     */     //   744: invokestatic invalidApplier : ()V
/*     */     //   747: aload #4
/*     */     //   749: invokeinterface startReusableNode : ()V
/*     */     //   754: aload #4
/*     */     //   756: invokeinterface getInserting : ()Z
/*     */     //   761: ifeq -> 776
/*     */     //   764: aload #4
/*     */     //   766: aload #21
/*     */     //   768: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   773: goto -> 783
/*     */     //   776: aload #4
/*     */     //   778: invokeinterface useNode : ()V
/*     */     //   783: aload #4
/*     */     //   785: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   788: astore #24
/*     */     //   790: iconst_0
/*     */     //   791: istore #25
/*     */     //   793: aload #24
/*     */     //   795: aload #15
/*     */     //   797: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   800: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   803: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   806: aload #24
/*     */     //   808: aload #19
/*     */     //   810: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   813: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   816: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   819: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   822: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   825: astore #26
/*     */     //   827: iconst_0
/*     */     //   828: istore #27
/*     */     //   830: aload #24
/*     */     //   832: astore #28
/*     */     //   834: iconst_0
/*     */     //   835: istore #29
/*     */     //   837: aload #28
/*     */     //   839: invokeinterface getInserting : ()Z
/*     */     //   844: ifne -> 865
/*     */     //   847: aload #28
/*     */     //   849: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   854: iload #18
/*     */     //   856: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   859: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   862: ifne -> 891
/*     */     //   865: aload #28
/*     */     //   867: iload #18
/*     */     //   869: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   872: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   877: aload #24
/*     */     //   879: iload #18
/*     */     //   881: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   884: aload #26
/*     */     //   886: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   891: nop
/*     */     //   892: nop
/*     */     //   893: nop
/*     */     //   894: aload #24
/*     */     //   896: aload #20
/*     */     //   898: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   901: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   904: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   907: nop
/*     */     //   908: nop
/*     */     //   909: aload #4
/*     */     //   911: bipush #14
/*     */     //   913: iload #22
/*     */     //   915: bipush #6
/*     */     //   917: ishr
/*     */     //   918: iand
/*     */     //   919: istore #30
/*     */     //   921: astore #31
/*     */     //   923: iconst_0
/*     */     //   924: istore #32
/*     */     //   926: aload #31
/*     */     //   928: ldc_w -384784025
/*     */     //   931: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   934: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   937: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   940: aload #31
/*     */     //   942: bipush #6
/*     */     //   944: bipush #112
/*     */     //   946: iload #13
/*     */     //   948: bipush #6
/*     */     //   950: ishr
/*     */     //   951: iand
/*     */     //   952: ior
/*     */     //   953: istore #33
/*     */     //   955: astore #34
/*     */     //   957: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   960: astore #35
/*     */     //   962: iconst_0
/*     */     //   963: istore #36
/*     */     //   965: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   968: invokevirtual getW600 : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   971: astore #37
/*     */     //   973: bipush #20
/*     */     //   975: invokestatic getSp : (I)J
/*     */     //   978: lstore #38
/*     */     //   980: bipush #16
/*     */     //   982: invokestatic getSp : (I)J
/*     */     //   985: lstore #40
/*     */     //   987: ldc_w 'License Management'
/*     */     //   990: aconst_null
/*     */     //   991: lconst_0
/*     */     //   992: lload #40
/*     */     //   994: aconst_null
/*     */     //   995: aload #37
/*     */     //   997: aconst_null
/*     */     //   998: lconst_0
/*     */     //   999: aconst_null
/*     */     //   1000: iconst_0
/*     */     //   1001: lload #38
/*     */     //   1003: iconst_0
/*     */     //   1004: iconst_0
/*     */     //   1005: iconst_0
/*     */     //   1006: aconst_null
/*     */     //   1007: aconst_null
/*     */     //   1008: aload #34
/*     */     //   1010: ldc_w 199686
/*     */     //   1013: bipush #6
/*     */     //   1015: ldc_w 64470
/*     */     //   1018: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1021: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   1024: iconst_4
/*     */     //   1025: istore #42
/*     */     //   1027: iconst_0
/*     */     //   1028: istore #43
/*     */     //   1030: iload #42
/*     */     //   1032: i2f
/*     */     //   1033: invokestatic constructor-impl : (F)F
/*     */     //   1036: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   1039: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*     */     //   1042: astore #42
/*     */     //   1044: bipush #48
/*     */     //   1046: istore #44
/*     */     //   1048: nop
/*     */     //   1049: iconst_0
/*     */     //   1050: istore #45
/*     */     //   1052: aload #34
/*     */     //   1054: ldc -483455358
/*     */     //   1056: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   1058: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1061: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1064: checkcast androidx/compose/ui/Modifier
/*     */     //   1067: astore #37
/*     */     //   1069: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1072: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   1075: astore #43
/*     */     //   1077: aload #42
/*     */     //   1079: aload #43
/*     */     //   1081: aload #34
/*     */     //   1083: bipush #14
/*     */     //   1085: iload #44
/*     */     //   1087: iconst_3
/*     */     //   1088: ishr
/*     */     //   1089: iand
/*     */     //   1090: bipush #112
/*     */     //   1092: iload #44
/*     */     //   1094: iconst_3
/*     */     //   1095: ishr
/*     */     //   1096: iand
/*     */     //   1097: ior
/*     */     //   1098: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1101: astore #46
/*     */     //   1103: bipush #112
/*     */     //   1105: iload #44
/*     */     //   1107: iconst_3
/*     */     //   1108: ishl
/*     */     //   1109: iand
/*     */     //   1110: istore #47
/*     */     //   1112: nop
/*     */     //   1113: iconst_0
/*     */     //   1114: istore #48
/*     */     //   1116: aload #34
/*     */     //   1118: ldc -1323940314
/*     */     //   1120: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1122: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1125: aload #34
/*     */     //   1127: iconst_0
/*     */     //   1128: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1131: istore #49
/*     */     //   1133: aload #34
/*     */     //   1135: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1140: astore #50
/*     */     //   1142: aload #34
/*     */     //   1144: aload #37
/*     */     //   1146: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1149: astore #51
/*     */     //   1151: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1154: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1157: astore #52
/*     */     //   1159: bipush #6
/*     */     //   1161: sipush #896
/*     */     //   1164: iload #47
/*     */     //   1166: bipush #6
/*     */     //   1168: ishl
/*     */     //   1169: iand
/*     */     //   1170: ior
/*     */     //   1171: istore #53
/*     */     //   1173: nop
/*     */     //   1174: iconst_0
/*     */     //   1175: istore #54
/*     */     //   1177: aload #34
/*     */     //   1179: ldc -692256719
/*     */     //   1181: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1183: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1186: aload #34
/*     */     //   1188: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1193: instanceof androidx/compose/runtime/Applier
/*     */     //   1196: ifne -> 1202
/*     */     //   1199: invokestatic invalidApplier : ()V
/*     */     //   1202: aload #34
/*     */     //   1204: invokeinterface startReusableNode : ()V
/*     */     //   1209: aload #34
/*     */     //   1211: invokeinterface getInserting : ()Z
/*     */     //   1216: ifeq -> 1231
/*     */     //   1219: aload #34
/*     */     //   1221: aload #52
/*     */     //   1223: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1228: goto -> 1238
/*     */     //   1231: aload #34
/*     */     //   1233: invokeinterface useNode : ()V
/*     */     //   1238: aload #34
/*     */     //   1240: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1243: astore #55
/*     */     //   1245: iconst_0
/*     */     //   1246: istore #56
/*     */     //   1248: aload #55
/*     */     //   1250: aload #46
/*     */     //   1252: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1255: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1258: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1261: aload #55
/*     */     //   1263: aload #50
/*     */     //   1265: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1268: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1271: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1274: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1277: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1280: astore #57
/*     */     //   1282: iconst_0
/*     */     //   1283: istore #58
/*     */     //   1285: aload #55
/*     */     //   1287: astore #59
/*     */     //   1289: iconst_0
/*     */     //   1290: istore #60
/*     */     //   1292: aload #59
/*     */     //   1294: invokeinterface getInserting : ()Z
/*     */     //   1299: ifne -> 1320
/*     */     //   1302: aload #59
/*     */     //   1304: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1309: iload #49
/*     */     //   1311: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1314: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1317: ifne -> 1346
/*     */     //   1320: aload #59
/*     */     //   1322: iload #49
/*     */     //   1324: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1327: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1332: aload #55
/*     */     //   1334: iload #49
/*     */     //   1336: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1339: aload #57
/*     */     //   1341: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1346: nop
/*     */     //   1347: nop
/*     */     //   1348: nop
/*     */     //   1349: aload #55
/*     */     //   1351: aload #51
/*     */     //   1353: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1356: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1359: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1362: nop
/*     */     //   1363: nop
/*     */     //   1364: aload #34
/*     */     //   1366: bipush #14
/*     */     //   1368: iload #53
/*     */     //   1370: bipush #6
/*     */     //   1372: ishr
/*     */     //   1373: iand
/*     */     //   1374: istore #61
/*     */     //   1376: astore #62
/*     */     //   1378: iconst_0
/*     */     //   1379: istore #63
/*     */     //   1381: aload #62
/*     */     //   1383: ldc_w -384784025
/*     */     //   1386: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   1389: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1392: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   1395: aload #62
/*     */     //   1397: bipush #6
/*     */     //   1399: bipush #112
/*     */     //   1401: iload #44
/*     */     //   1403: bipush #6
/*     */     //   1405: ishr
/*     */     //   1406: iand
/*     */     //   1407: ior
/*     */     //   1408: istore #64
/*     */     //   1410: astore #65
/*     */     //   1412: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   1415: astore #66
/*     */     //   1417: iconst_0
/*     */     //   1418: istore #67
/*     */     //   1420: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1423: checkcast androidx/compose/ui/Modifier
/*     */     //   1426: fconst_0
/*     */     //   1427: iconst_1
/*     */     //   1428: aconst_null
/*     */     //   1429: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1432: bipush #16
/*     */     //   1434: istore #68
/*     */     //   1436: iconst_0
/*     */     //   1437: istore #69
/*     */     //   1439: iload #68
/*     */     //   1441: i2f
/*     */     //   1442: invokestatic constructor-impl : (F)F
/*     */     //   1445: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   1448: astore #68
/*     */     //   1450: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   1453: invokevirtual getSpaceBetween : ()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   1456: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */     //   1459: astore #69
/*     */     //   1461: bipush #54
/*     */     //   1463: istore #70
/*     */     //   1465: nop
/*     */     //   1466: iconst_0
/*     */     //   1467: istore #71
/*     */     //   1469: aload #65
/*     */     //   1471: ldc_w 693286680
/*     */     //   1474: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   1477: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1480: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1483: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1486: astore #72
/*     */     //   1488: aload #69
/*     */     //   1490: aload #72
/*     */     //   1492: aload #65
/*     */     //   1494: bipush #14
/*     */     //   1496: iload #70
/*     */     //   1498: iconst_3
/*     */     //   1499: ishr
/*     */     //   1500: iand
/*     */     //   1501: bipush #112
/*     */     //   1503: iload #70
/*     */     //   1505: iconst_3
/*     */     //   1506: ishr
/*     */     //   1507: iand
/*     */     //   1508: ior
/*     */     //   1509: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1512: astore #73
/*     */     //   1514: bipush #112
/*     */     //   1516: iload #70
/*     */     //   1518: iconst_3
/*     */     //   1519: ishl
/*     */     //   1520: iand
/*     */     //   1521: istore #74
/*     */     //   1523: nop
/*     */     //   1524: iconst_0
/*     */     //   1525: istore #75
/*     */     //   1527: aload #65
/*     */     //   1529: ldc -1323940314
/*     */     //   1531: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1533: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1536: aload #65
/*     */     //   1538: iconst_0
/*     */     //   1539: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1542: istore #76
/*     */     //   1544: aload #65
/*     */     //   1546: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1551: astore #77
/*     */     //   1553: aload #65
/*     */     //   1555: aload #68
/*     */     //   1557: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1560: astore #78
/*     */     //   1562: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1565: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1568: astore #79
/*     */     //   1570: bipush #6
/*     */     //   1572: sipush #896
/*     */     //   1575: iload #74
/*     */     //   1577: bipush #6
/*     */     //   1579: ishl
/*     */     //   1580: iand
/*     */     //   1581: ior
/*     */     //   1582: istore #80
/*     */     //   1584: nop
/*     */     //   1585: iconst_0
/*     */     //   1586: istore #81
/*     */     //   1588: aload #65
/*     */     //   1590: ldc -692256719
/*     */     //   1592: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1594: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1597: aload #65
/*     */     //   1599: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1604: instanceof androidx/compose/runtime/Applier
/*     */     //   1607: ifne -> 1613
/*     */     //   1610: invokestatic invalidApplier : ()V
/*     */     //   1613: aload #65
/*     */     //   1615: invokeinterface startReusableNode : ()V
/*     */     //   1620: aload #65
/*     */     //   1622: invokeinterface getInserting : ()Z
/*     */     //   1627: ifeq -> 1642
/*     */     //   1630: aload #65
/*     */     //   1632: aload #79
/*     */     //   1634: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1639: goto -> 1649
/*     */     //   1642: aload #65
/*     */     //   1644: invokeinterface useNode : ()V
/*     */     //   1649: aload #65
/*     */     //   1651: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1654: astore #82
/*     */     //   1656: iconst_0
/*     */     //   1657: istore #83
/*     */     //   1659: aload #82
/*     */     //   1661: aload #73
/*     */     //   1663: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1666: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1669: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1672: aload #82
/*     */     //   1674: aload #77
/*     */     //   1676: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1679: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1682: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1685: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1688: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1691: astore #84
/*     */     //   1693: iconst_0
/*     */     //   1694: istore #85
/*     */     //   1696: aload #82
/*     */     //   1698: astore #86
/*     */     //   1700: iconst_0
/*     */     //   1701: istore #87
/*     */     //   1703: aload #86
/*     */     //   1705: invokeinterface getInserting : ()Z
/*     */     //   1710: ifne -> 1731
/*     */     //   1713: aload #86
/*     */     //   1715: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1720: iload #76
/*     */     //   1722: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1725: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1728: ifne -> 1757
/*     */     //   1731: aload #86
/*     */     //   1733: iload #76
/*     */     //   1735: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1738: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1743: aload #82
/*     */     //   1745: iload #76
/*     */     //   1747: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1750: aload #84
/*     */     //   1752: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1757: nop
/*     */     //   1758: nop
/*     */     //   1759: nop
/*     */     //   1760: aload #82
/*     */     //   1762: aload #78
/*     */     //   1764: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1767: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1770: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1773: nop
/*     */     //   1774: nop
/*     */     //   1775: aload #65
/*     */     //   1777: bipush #14
/*     */     //   1779: iload #80
/*     */     //   1781: bipush #6
/*     */     //   1783: ishr
/*     */     //   1784: iand
/*     */     //   1785: istore #88
/*     */     //   1787: astore #89
/*     */     //   1789: iconst_0
/*     */     //   1790: istore #90
/*     */     //   1792: aload #89
/*     */     //   1794: ldc_w -407840262
/*     */     //   1797: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   1800: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1803: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   1806: aload #89
/*     */     //   1808: bipush #6
/*     */     //   1810: bipush #112
/*     */     //   1812: iload #70
/*     */     //   1814: bipush #6
/*     */     //   1816: ishr
/*     */     //   1817: iand
/*     */     //   1818: ior
/*     */     //   1819: istore #91
/*     */     //   1821: astore #92
/*     */     //   1823: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   1826: astore #93
/*     */     //   1828: iconst_0
/*     */     //   1829: istore #94
/*     */     //   1831: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   1834: iconst_4
/*     */     //   1835: istore #95
/*     */     //   1837: iconst_0
/*     */     //   1838: istore #96
/*     */     //   1840: iload #95
/*     */     //   1842: i2f
/*     */     //   1843: invokestatic constructor-impl : (F)F
/*     */     //   1846: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   1849: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */     //   1852: astore #95
/*     */     //   1854: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1857: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1860: astore #96
/*     */     //   1862: sipush #432
/*     */     //   1865: istore #97
/*     */     //   1867: nop
/*     */     //   1868: iconst_0
/*     */     //   1869: istore #98
/*     */     //   1871: aload #92
/*     */     //   1873: ldc_w 693286680
/*     */     //   1876: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   1879: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1882: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1885: checkcast androidx/compose/ui/Modifier
/*     */     //   1888: astore #99
/*     */     //   1890: aload #95
/*     */     //   1892: aload #96
/*     */     //   1894: aload #92
/*     */     //   1896: bipush #14
/*     */     //   1898: iload #97
/*     */     //   1900: iconst_3
/*     */     //   1901: ishr
/*     */     //   1902: iand
/*     */     //   1903: bipush #112
/*     */     //   1905: iload #97
/*     */     //   1907: iconst_3
/*     */     //   1908: ishr
/*     */     //   1909: iand
/*     */     //   1910: ior
/*     */     //   1911: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1914: astore #100
/*     */     //   1916: bipush #112
/*     */     //   1918: iload #97
/*     */     //   1920: iconst_3
/*     */     //   1921: ishl
/*     */     //   1922: iand
/*     */     //   1923: istore #101
/*     */     //   1925: nop
/*     */     //   1926: iconst_0
/*     */     //   1927: istore #102
/*     */     //   1929: aload #92
/*     */     //   1931: ldc -1323940314
/*     */     //   1933: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1935: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1938: aload #92
/*     */     //   1940: iconst_0
/*     */     //   1941: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1944: istore #103
/*     */     //   1946: aload #92
/*     */     //   1948: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1953: astore #104
/*     */     //   1955: aload #92
/*     */     //   1957: aload #99
/*     */     //   1959: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1962: astore #105
/*     */     //   1964: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1967: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1970: astore #106
/*     */     //   1972: bipush #6
/*     */     //   1974: sipush #896
/*     */     //   1977: iload #101
/*     */     //   1979: bipush #6
/*     */     //   1981: ishl
/*     */     //   1982: iand
/*     */     //   1983: ior
/*     */     //   1984: istore #107
/*     */     //   1986: nop
/*     */     //   1987: iconst_0
/*     */     //   1988: istore #108
/*     */     //   1990: aload #92
/*     */     //   1992: ldc -692256719
/*     */     //   1994: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1996: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1999: aload #92
/*     */     //   2001: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   2006: instanceof androidx/compose/runtime/Applier
/*     */     //   2009: ifne -> 2015
/*     */     //   2012: invokestatic invalidApplier : ()V
/*     */     //   2015: aload #92
/*     */     //   2017: invokeinterface startReusableNode : ()V
/*     */     //   2022: aload #92
/*     */     //   2024: invokeinterface getInserting : ()Z
/*     */     //   2029: ifeq -> 2044
/*     */     //   2032: aload #92
/*     */     //   2034: aload #106
/*     */     //   2036: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   2041: goto -> 2051
/*     */     //   2044: aload #92
/*     */     //   2046: invokeinterface useNode : ()V
/*     */     //   2051: aload #92
/*     */     //   2053: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   2056: astore #109
/*     */     //   2058: iconst_0
/*     */     //   2059: istore #110
/*     */     //   2061: aload #109
/*     */     //   2063: aload #100
/*     */     //   2065: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2068: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2071: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2074: aload #109
/*     */     //   2076: aload #104
/*     */     //   2078: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2081: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2084: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2087: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2090: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2093: astore #111
/*     */     //   2095: iconst_0
/*     */     //   2096: istore #112
/*     */     //   2098: aload #109
/*     */     //   2100: astore #113
/*     */     //   2102: iconst_0
/*     */     //   2103: istore #114
/*     */     //   2105: aload #113
/*     */     //   2107: invokeinterface getInserting : ()Z
/*     */     //   2112: ifne -> 2133
/*     */     //   2115: aload #113
/*     */     //   2117: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2122: iload #103
/*     */     //   2124: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2127: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2130: ifne -> 2159
/*     */     //   2133: aload #113
/*     */     //   2135: iload #103
/*     */     //   2137: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2140: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2145: aload #109
/*     */     //   2147: iload #103
/*     */     //   2149: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2152: aload #111
/*     */     //   2154: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2159: nop
/*     */     //   2160: nop
/*     */     //   2161: nop
/*     */     //   2162: aload #109
/*     */     //   2164: aload #105
/*     */     //   2166: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2169: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2172: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2175: nop
/*     */     //   2176: nop
/*     */     //   2177: aload #92
/*     */     //   2179: bipush #14
/*     */     //   2181: iload #107
/*     */     //   2183: bipush #6
/*     */     //   2185: ishr
/*     */     //   2186: iand
/*     */     //   2187: istore #115
/*     */     //   2189: astore #116
/*     */     //   2191: iconst_0
/*     */     //   2192: istore #117
/*     */     //   2194: aload #116
/*     */     //   2196: ldc_w -407840262
/*     */     //   2199: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   2202: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2205: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   2208: aload #116
/*     */     //   2210: bipush #6
/*     */     //   2212: bipush #112
/*     */     //   2214: iload #97
/*     */     //   2216: bipush #6
/*     */     //   2218: ishr
/*     */     //   2219: iand
/*     */     //   2220: ior
/*     */     //   2221: istore #118
/*     */     //   2223: astore #119
/*     */     //   2225: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   2228: astore #120
/*     */     //   2230: iconst_0
/*     */     //   2231: istore #121
/*     */     //   2233: aload_0
/*     */     //   2234: invokevirtual getLicenseTypeShortName : ()Ljava/lang/String;
/*     */     //   2237: astore #122
/*     */     //   2239: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   2242: invokevirtual getW500 : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   2245: astore #123
/*     */     //   2247: bipush #16
/*     */     //   2249: invokestatic getSp : (I)J
/*     */     //   2252: lstore #124
/*     */     //   2254: bipush #13
/*     */     //   2256: invokestatic getSp : (I)J
/*     */     //   2259: lstore #126
/*     */     //   2261: aload #119
/*     */     //   2263: iconst_0
/*     */     //   2264: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   2267: aload #119
/*     */     //   2269: iconst_0
/*     */     //   2270: invokevirtual getInactiveTextColor : (Landroidx/compose/runtime/Composer;I)J
/*     */     //   2273: lstore #128
/*     */     //   2275: aload #122
/*     */     //   2277: aconst_null
/*     */     //   2278: lload #128
/*     */     //   2280: lload #126
/*     */     //   2282: aconst_null
/*     */     //   2283: aload #123
/*     */     //   2285: aconst_null
/*     */     //   2286: lconst_0
/*     */     //   2287: aconst_null
/*     */     //   2288: iconst_0
/*     */     //   2289: lload #124
/*     */     //   2291: iconst_0
/*     */     //   2292: iconst_0
/*     */     //   2293: iconst_0
/*     */     //   2294: aconst_null
/*     */     //   2295: aconst_null
/*     */     //   2296: aload #119
/*     */     //   2298: ldc_w 199680
/*     */     //   2301: bipush #6
/*     */     //   2303: ldc_w 64466
/*     */     //   2306: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   2309: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   2312: invokevirtual getW500 : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   2315: astore #122
/*     */     //   2317: bipush #16
/*     */     //   2319: invokestatic getSp : (I)J
/*     */     //   2322: lstore #130
/*     */     //   2324: bipush #13
/*     */     //   2326: invokestatic getSp : (I)J
/*     */     //   2329: lstore #132
/*     */     //   2331: ldc_w 'Data Volume'
/*     */     //   2334: aconst_null
/*     */     //   2335: lconst_0
/*     */     //   2336: lload #132
/*     */     //   2338: aconst_null
/*     */     //   2339: aload #122
/*     */     //   2341: aconst_null
/*     */     //   2342: lconst_0
/*     */     //   2343: aconst_null
/*     */     //   2344: iconst_0
/*     */     //   2345: lload #130
/*     */     //   2347: iconst_0
/*     */     //   2348: iconst_0
/*     */     //   2349: iconst_0
/*     */     //   2350: aconst_null
/*     */     //   2351: aconst_null
/*     */     //   2352: aload #119
/*     */     //   2354: ldc_w 199686
/*     */     //   2357: bipush #6
/*     */     //   2359: ldc_w 64470
/*     */     //   2362: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   2365: nop
/*     */     //   2366: aload #116
/*     */     //   2368: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2371: aload #92
/*     */     //   2373: invokeinterface endNode : ()V
/*     */     //   2378: aload #92
/*     */     //   2380: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2383: nop
/*     */     //   2384: aload #92
/*     */     //   2386: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2389: nop
/*     */     //   2390: aload #92
/*     */     //   2392: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2395: nop
/*     */     //   2396: aload_0
/*     */     //   2397: invokevirtual getNextRefillDate : ()Lkotlinx/datetime/Instant;
/*     */     //   2400: astore #95
/*     */     //   2402: aload #95
/*     */     //   2404: ifnull -> 2436
/*     */     //   2407: aload #95
/*     */     //   2409: astore #100
/*     */     //   2411: iconst_0
/*     */     //   2412: istore #101
/*     */     //   2414: aload #100
/*     */     //   2416: getstatic kotlinx/datetime/Clock$System.INSTANCE : Lkotlinx/datetime/Clock$System;
/*     */     //   2419: invokevirtual now : ()Lkotlinx/datetime/Instant;
/*     */     //   2422: invokevirtual minus-5sfh64U : (Lkotlinx/datetime/Instant;)J
/*     */     //   2425: nop
/*     */     //   2426: nop
/*     */     //   2427: invokestatic getInWholeDays-impl : (J)J
/*     */     //   2430: invokestatic valueOf : (J)Ljava/lang/Long;
/*     */     //   2433: goto -> 2437
/*     */     //   2436: aconst_null
/*     */     //   2437: astore #99
/*     */     //   2439: aload #92
/*     */     //   2441: ldc_w -1186366788
/*     */     //   2444: invokeinterface startReplaceGroup : (I)V
/*     */     //   2449: aload #99
/*     */     //   2451: ifnull -> 2514
/*     */     //   2454: ldc_w 254327031
/*     */     //   2457: iconst_1
/*     */     //   2458: new com/intellij/ml/llm/matterhorn/ej/ui/components/LicenseDialogKt$LicenseDialog$2$1$1$2
/*     */     //   2461: dup
/*     */     //   2462: aload #99
/*     */     //   2464: invokespecial <init> : (Ljava/lang/Long;)V
/*     */     //   2467: aload #92
/*     */     //   2469: bipush #54
/*     */     //   2471: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   2474: checkcast kotlin/jvm/functions/Function2
/*     */     //   2477: aconst_null
/*     */     //   2478: iconst_0
/*     */     //   2479: aconst_null
/*     */     //   2480: aconst_null
/*     */     //   2481: ldc_w -1264960644
/*     */     //   2484: iconst_1
/*     */     //   2485: new com/intellij/ml/llm/matterhorn/ej/ui/components/LicenseDialogKt$LicenseDialog$2$1$1$3
/*     */     //   2488: dup
/*     */     //   2489: aload #99
/*     */     //   2491: invokespecial <init> : (Ljava/lang/Long;)V
/*     */     //   2494: aload #92
/*     */     //   2496: bipush #54
/*     */     //   2498: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   2501: checkcast kotlin/jvm/functions/Function2
/*     */     //   2504: aload #92
/*     */     //   2506: ldc_w 196614
/*     */     //   2509: bipush #30
/*     */     //   2511: invokestatic JunieTooltip : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   2514: aload #92
/*     */     //   2516: invokeinterface endReplaceGroup : ()V
/*     */     //   2521: nop
/*     */     //   2522: aload #89
/*     */     //   2524: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2527: aload #65
/*     */     //   2529: invokeinterface endNode : ()V
/*     */     //   2534: aload #65
/*     */     //   2536: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2539: nop
/*     */     //   2540: aload #65
/*     */     //   2542: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2545: nop
/*     */     //   2546: aload #65
/*     */     //   2548: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2551: nop
/*     */     //   2552: ldc_w 1253020920
/*     */     //   2555: iconst_1
/*     */     //   2556: new com/intellij/ml/llm/matterhorn/ej/ui/components/LicenseDialogKt$LicenseDialog$2$1$2
/*     */     //   2559: dup
/*     */     //   2560: fload #8
/*     */     //   2562: invokespecial <init> : (F)V
/*     */     //   2565: aload #65
/*     */     //   2567: bipush #54
/*     */     //   2569: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   2572: checkcast kotlin/jvm/functions/Function2
/*     */     //   2575: aconst_null
/*     */     //   2576: iconst_0
/*     */     //   2577: aconst_null
/*     */     //   2578: aconst_null
/*     */     //   2579: ldc_w -608474499
/*     */     //   2582: iconst_1
/*     */     //   2583: new com/intellij/ml/llm/matterhorn/ej/ui/components/LicenseDialogKt$LicenseDialog$2$1$3
/*     */     //   2586: dup
/*     */     //   2587: aload #9
/*     */     //   2589: invokespecial <init> : (Landroidx/compose/runtime/State;)V
/*     */     //   2592: aload #65
/*     */     //   2594: bipush #54
/*     */     //   2596: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   2599: checkcast kotlin/jvm/functions/Function2
/*     */     //   2602: aload #65
/*     */     //   2604: ldc_w 196614
/*     */     //   2607: bipush #30
/*     */     //   2609: invokestatic JunieTooltip : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   2612: nop
/*     */     //   2613: aload #62
/*     */     //   2615: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2618: aload #34
/*     */     //   2620: invokeinterface endNode : ()V
/*     */     //   2625: aload #34
/*     */     //   2627: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2630: nop
/*     */     //   2631: aload #34
/*     */     //   2633: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2636: nop
/*     */     //   2637: aload #34
/*     */     //   2639: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2642: nop
/*     */     //   2643: new java/lang/StringBuilder
/*     */     //   2646: dup
/*     */     //   2647: invokespecial <init> : ()V
/*     */     //   2650: astore #42
/*     */     //   2652: aload #42
/*     */     //   2654: astore #43
/*     */     //   2656: iconst_0
/*     */     //   2657: istore #44
/*     */     //   2659: aload #43
/*     */     //   2661: aload_0
/*     */     //   2662: invokevirtual getLicenseTypeFullName : ()Ljava/lang/String;
/*     */     //   2665: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   2670: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   2673: pop
/*     */     //   2674: aload_0
/*     */     //   2675: invokevirtual getLicensedTo : ()Ljava/lang/String;
/*     */     //   2678: ifnull -> 2696
/*     */     //   2681: aload #43
/*     */     //   2683: aload_0
/*     */     //   2684: invokevirtual getLicensedTo : ()Ljava/lang/String;
/*     */     //   2687: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   2692: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   2695: pop
/*     */     //   2696: aload #43
/*     */     //   2698: aload_0
/*     */     //   2699: invokevirtual getLicenseId : ()Ljava/lang/String;
/*     */     //   2702: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   2707: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   2710: pop
/*     */     //   2711: aload_0
/*     */     //   2712: invokevirtual getBillingDate : ()Lkotlinx/datetime/Instant;
/*     */     //   2715: ifnull -> 2761
/*     */     //   2718: iconst_3
/*     */     //   2719: invokestatic getDefault : ()Ljava/util/Locale;
/*     */     //   2722: invokestatic getDateInstance : (ILjava/util/Locale;)Ljava/text/DateFormat;
/*     */     //   2725: astore #45
/*     */     //   2727: aload #45
/*     */     //   2729: new java/util/Date
/*     */     //   2732: dup
/*     */     //   2733: aload_0
/*     */     //   2734: invokevirtual getBillingDate : ()Lkotlinx/datetime/Instant;
/*     */     //   2737: invokevirtual toEpochMilliseconds : ()J
/*     */     //   2740: invokespecial <init> : (J)V
/*     */     //   2743: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
/*     */     //   2746: astore #46
/*     */     //   2748: aload #43
/*     */     //   2750: aload #46
/*     */     //   2752: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   2757: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   2760: pop
/*     */     //   2761: nop
/*     */     //   2762: aload #42
/*     */     //   2764: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   2767: astore #37
/*     */     //   2769: aconst_null
/*     */     //   2770: ldc_w -1325658188
/*     */     //   2773: iconst_1
/*     */     //   2774: new com/intellij/ml/llm/matterhorn/ej/ui/components/LicenseDialogKt$LicenseDialog$2$2
/*     */     //   2777: dup
/*     */     //   2778: aload_0
/*     */     //   2779: aload #37
/*     */     //   2781: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseData;Ljava/lang/String;)V
/*     */     //   2784: aload #34
/*     */     //   2786: bipush #54
/*     */     //   2788: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   2791: checkcast kotlin/jvm/functions/Function2
/*     */     //   2794: aload #34
/*     */     //   2796: bipush #48
/*     */     //   2798: iconst_1
/*     */     //   2799: invokestatic SelectionContainer : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   2802: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2805: checkcast androidx/compose/ui/Modifier
/*     */     //   2808: fconst_0
/*     */     //   2809: iconst_1
/*     */     //   2810: aconst_null
/*     */     //   2811: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2814: fconst_0
/*     */     //   2815: bipush #12
/*     */     //   2817: istore #42
/*     */     //   2819: iconst_0
/*     */     //   2820: istore #43
/*     */     //   2822: iload #42
/*     */     //   2824: i2f
/*     */     //   2825: invokestatic constructor-impl : (F)F
/*     */     //   2828: fconst_0
/*     */     //   2829: fconst_0
/*     */     //   2830: bipush #13
/*     */     //   2832: aconst_null
/*     */     //   2833: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2836: astore #42
/*     */     //   2838: bipush #6
/*     */     //   2840: istore #45
/*     */     //   2842: nop
/*     */     //   2843: iconst_0
/*     */     //   2844: istore #46
/*     */     //   2846: aload #34
/*     */     //   2848: ldc_w 733328855
/*     */     //   2851: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   2854: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2857: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   2860: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   2863: astore #43
/*     */     //   2865: iconst_0
/*     */     //   2866: istore #44
/*     */     //   2868: aload #43
/*     */     //   2870: iload #44
/*     */     //   2872: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2875: astore #47
/*     */     //   2877: bipush #112
/*     */     //   2879: iload #45
/*     */     //   2881: iconst_3
/*     */     //   2882: ishl
/*     */     //   2883: iand
/*     */     //   2884: istore #48
/*     */     //   2886: nop
/*     */     //   2887: iconst_0
/*     */     //   2888: istore #49
/*     */     //   2890: aload #34
/*     */     //   2892: ldc -1323940314
/*     */     //   2894: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   2896: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2899: aload #34
/*     */     //   2901: iconst_0
/*     */     //   2902: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   2905: istore #50
/*     */     //   2907: aload #34
/*     */     //   2909: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2914: astore #51
/*     */     //   2916: aload #34
/*     */     //   2918: aload #42
/*     */     //   2920: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   2923: astore #52
/*     */     //   2925: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2928: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   2931: astore #53
/*     */     //   2933: bipush #6
/*     */     //   2935: sipush #896
/*     */     //   2938: iload #48
/*     */     //   2940: bipush #6
/*     */     //   2942: ishl
/*     */     //   2943: iand
/*     */     //   2944: ior
/*     */     //   2945: istore #54
/*     */     //   2947: nop
/*     */     //   2948: iconst_0
/*     */     //   2949: istore #55
/*     */     //   2951: aload #34
/*     */     //   2953: ldc -692256719
/*     */     //   2955: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   2957: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2960: aload #34
/*     */     //   2962: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   2967: instanceof androidx/compose/runtime/Applier
/*     */     //   2970: ifne -> 2976
/*     */     //   2973: invokestatic invalidApplier : ()V
/*     */     //   2976: aload #34
/*     */     //   2978: invokeinterface startReusableNode : ()V
/*     */     //   2983: aload #34
/*     */     //   2985: invokeinterface getInserting : ()Z
/*     */     //   2990: ifeq -> 3005
/*     */     //   2993: aload #34
/*     */     //   2995: aload #53
/*     */     //   2997: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   3002: goto -> 3012
/*     */     //   3005: aload #34
/*     */     //   3007: invokeinterface useNode : ()V
/*     */     //   3012: aload #34
/*     */     //   3014: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   3017: astore #56
/*     */     //   3019: iconst_0
/*     */     //   3020: istore #57
/*     */     //   3022: aload #56
/*     */     //   3024: aload #47
/*     */     //   3026: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3029: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3032: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3035: aload #56
/*     */     //   3037: aload #51
/*     */     //   3039: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3042: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3045: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3048: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3051: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3054: astore #58
/*     */     //   3056: iconst_0
/*     */     //   3057: istore #59
/*     */     //   3059: aload #56
/*     */     //   3061: astore #60
/*     */     //   3063: iconst_0
/*     */     //   3064: istore #61
/*     */     //   3066: aload #60
/*     */     //   3068: invokeinterface getInserting : ()Z
/*     */     //   3073: ifne -> 3094
/*     */     //   3076: aload #60
/*     */     //   3078: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3083: iload #50
/*     */     //   3085: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3088: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   3091: ifne -> 3120
/*     */     //   3094: aload #60
/*     */     //   3096: iload #50
/*     */     //   3098: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3101: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3106: aload #56
/*     */     //   3108: iload #50
/*     */     //   3110: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3113: aload #58
/*     */     //   3115: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3120: nop
/*     */     //   3121: nop
/*     */     //   3122: nop
/*     */     //   3123: aload #56
/*     */     //   3125: aload #52
/*     */     //   3127: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3130: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3133: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3136: nop
/*     */     //   3137: nop
/*     */     //   3138: aload #34
/*     */     //   3140: bipush #14
/*     */     //   3142: iload #54
/*     */     //   3144: bipush #6
/*     */     //   3146: ishr
/*     */     //   3147: iand
/*     */     //   3148: istore #62
/*     */     //   3150: astore #63
/*     */     //   3152: iconst_0
/*     */     //   3153: istore #64
/*     */     //   3155: aload #63
/*     */     //   3157: ldc_w -2146769399
/*     */     //   3160: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   3163: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3166: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   3169: aload #63
/*     */     //   3171: bipush #6
/*     */     //   3173: bipush #112
/*     */     //   3175: iload #45
/*     */     //   3177: bipush #6
/*     */     //   3179: ishr
/*     */     //   3180: iand
/*     */     //   3181: ior
/*     */     //   3182: istore #65
/*     */     //   3184: astore #66
/*     */     //   3186: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   3189: astore #67
/*     */     //   3191: iconst_0
/*     */     //   3192: istore #68
/*     */     //   3194: aload #66
/*     */     //   3196: ldc_w 1791971778
/*     */     //   3199: invokeinterface startReplaceGroup : (I)V
/*     */     //   3204: aload_3
/*     */     //   3205: ifnull -> 3257
/*     */     //   3208: aload_3
/*     */     //   3209: aload #67
/*     */     //   3211: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   3214: checkcast androidx/compose/ui/Modifier
/*     */     //   3217: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   3220: invokevirtual getCenterStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   3223: invokeinterface align : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;
/*     */     //   3228: iconst_0
/*     */     //   3229: aconst_null
/*     */     //   3230: aconst_null
/*     */     //   3231: aconst_null
/*     */     //   3232: getstatic com/intellij/ml/llm/matterhorn/ej/ui/components/ComposableSingletons$LicenseDialogKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/components/ComposableSingletons$LicenseDialogKt;
/*     */     //   3235: invokevirtual getLambda-1$standalone : ()Lkotlin/jvm/functions/Function3;
/*     */     //   3238: aload #66
/*     */     //   3240: ldc_w 1572864
/*     */     //   3243: bipush #14
/*     */     //   3245: iload #7
/*     */     //   3247: bipush #9
/*     */     //   3249: ishr
/*     */     //   3250: iand
/*     */     //   3251: ior
/*     */     //   3252: bipush #60
/*     */     //   3254: invokestatic OutlinedButton : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   3257: aload #66
/*     */     //   3259: invokeinterface endReplaceGroup : ()V
/*     */     //   3264: aload #67
/*     */     //   3266: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   3269: checkcast androidx/compose/ui/Modifier
/*     */     //   3272: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   3275: invokevirtual getCenterEnd : ()Landroidx/compose/ui/Alignment;
/*     */     //   3278: invokeinterface align : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;
/*     */     //   3283: astore #69
/*     */     //   3285: ldc_w 'OK'
/*     */     //   3288: aload #69
/*     */     //   3290: iconst_0
/*     */     //   3291: aload_2
/*     */     //   3292: aload #66
/*     */     //   3294: bipush #6
/*     */     //   3296: sipush #7168
/*     */     //   3299: iload #7
/*     */     //   3301: iconst_3
/*     */     //   3302: ishl
/*     */     //   3303: iand
/*     */     //   3304: ior
/*     */     //   3305: iconst_4
/*     */     //   3306: invokestatic DialogButton : (Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*     */     //   3309: nop
/*     */     //   3310: aload #63
/*     */     //   3312: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3315: aload #34
/*     */     //   3317: invokeinterface endNode : ()V
/*     */     //   3322: aload #34
/*     */     //   3324: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3327: nop
/*     */     //   3328: aload #34
/*     */     //   3330: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3333: nop
/*     */     //   3334: aload #34
/*     */     //   3336: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3339: nop
/*     */     //   3340: nop
/*     */     //   3341: aload #31
/*     */     //   3343: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3346: aload #4
/*     */     //   3348: invokeinterface endNode : ()V
/*     */     //   3353: aload #4
/*     */     //   3355: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3358: nop
/*     */     //   3359: aload #4
/*     */     //   3361: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3364: nop
/*     */     //   3365: aload #4
/*     */     //   3367: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3370: nop
/*     */     //   3371: invokestatic isTraceInProgress : ()Z
/*     */     //   3374: ifeq -> 3390
/*     */     //   3377: invokestatic traceEventEnd : ()V
/*     */     //   3380: goto -> 3390
/*     */     //   3383: aload #4
/*     */     //   3385: invokeinterface skipToGroupEnd : ()V
/*     */     //   3390: aload #4
/*     */     //   3392: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   3397: dup
/*     */     //   3398: ifnull -> 3422
/*     */     //   3401: aload_0
/*     */     //   3402: aload_1
/*     */     //   3403: aload_2
/*     */     //   3404: aload_3
/*     */     //   3405: iload #5
/*     */     //   3407: iload #6
/*     */     //   3409: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   3414: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   3419: goto -> 3423
/*     */     //   3422: pop
/*     */     //   3423: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #76	-> 6
/*     */     //   #73	-> 249
/*     */     //   #74	-> 263
/*     */     //   #221	-> 282
/*     */     //   #222	-> 294
/*     */     //   #223	-> 305
/*     */     //   #223	-> 313
/*     */     //   #224	-> 315
/*     */     //   #225	-> 324
/*     */     //   #226	-> 329
/*     */     //   #222	-> 331
/*     */     //   #221	-> 332
/*     */     //   #221	-> 333
/*     */     //   #74	-> 334
/*     */     //   #75	-> 357
/*     */     //   #76	-> 372
/*     */     //   #78	-> 375
/*     */     //   #227	-> 424
/*     */     //   #228	-> 436
/*     */     //   #229	-> 452
/*     */     //   #79	-> 455
/*     */     //   #80	-> 456
/*     */     //   #81	-> 457
/*     */     //   #82	-> 478
/*     */     //   #79	-> 479
/*     */     //   #83	-> 480
/*     */     //   #229	-> 484
/*     */     //   #230	-> 486
/*     */     //   #231	-> 495
/*     */     //   #232	-> 500
/*     */     //   #228	-> 502
/*     */     //   #227	-> 503
/*     */     //   #227	-> 504
/*     */     //   #78	-> 505
/*     */     //   #77	-> 522
/*     */     //   #88	-> 524
/*     */     //   #89	-> 526
/*     */     //   #87	-> 549
/*     */     //   #93	-> 554
/*     */     //   #233	-> 562
/*     */     //   #93	-> 568
/*     */     //   #94	-> 573
/*     */     //   #234	-> 583
/*     */     //   #94	-> 589
/*     */     //   #92	-> 601
/*     */     //   #235	-> 611
/*     */     //   #236	-> 614
/*     */     //   #239	-> 622
/*     */     //   #240	-> 657
/*     */     //   #241	-> 667
/*     */     //   #242	-> 673
/*     */     //   #243	-> 680
/*     */     //   #244	-> 689
/*     */     //   #246	-> 696
/*     */     //   #245	-> 718
/*     */     //   #247	-> 728
/*     */     //   #248	-> 731
/*     */     //   #249	-> 749
/*     */     //   #250	-> 754
/*     */     //   #251	-> 766
/*     */     //   #253	-> 778
/*     */     //   #255	-> 783
/*     */     //   #256	-> 793
/*     */     //   #257	-> 806
/*     */     //   #259	-> 819
/*     */     //   #260	-> 830
/*     */     //   #261	-> 837
/*     */     //   #262	-> 865
/*     */     //   #263	-> 877
/*     */     //   #265	-> 891
/*     */     //   #260	-> 892
/*     */     //   #265	-> 893
/*     */     //   #266	-> 894
/*     */     //   #267	-> 907
/*     */     //   #255	-> 908
/*     */     //   #268	-> 909
/*     */     //   #269	-> 934
/*     */     //   #98	-> 965
/*     */     //   #99	-> 973
/*     */     //   #100	-> 980
/*     */     //   #97	-> 987
/*     */     //   #100	-> 992
/*     */     //   #98	-> 995
/*     */     //   #99	-> 1001
/*     */     //   #96	-> 1018
/*     */     //   #103	-> 1021
/*     */     //   #270	-> 1030
/*     */     //   #103	-> 1036
/*     */     //   #102	-> 1048
/*     */     //   #271	-> 1058
/*     */     //   #272	-> 1061
/*     */     //   #274	-> 1069
/*     */     //   #277	-> 1077
/*     */     //   #278	-> 1112
/*     */     //   #279	-> 1122
/*     */     //   #280	-> 1128
/*     */     //   #281	-> 1135
/*     */     //   #282	-> 1144
/*     */     //   #284	-> 1151
/*     */     //   #283	-> 1173
/*     */     //   #285	-> 1183
/*     */     //   #286	-> 1186
/*     */     //   #287	-> 1204
/*     */     //   #288	-> 1209
/*     */     //   #289	-> 1221
/*     */     //   #291	-> 1233
/*     */     //   #293	-> 1238
/*     */     //   #294	-> 1248
/*     */     //   #295	-> 1261
/*     */     //   #297	-> 1274
/*     */     //   #298	-> 1285
/*     */     //   #299	-> 1292
/*     */     //   #300	-> 1320
/*     */     //   #301	-> 1332
/*     */     //   #303	-> 1346
/*     */     //   #298	-> 1347
/*     */     //   #303	-> 1348
/*     */     //   #304	-> 1349
/*     */     //   #305	-> 1362
/*     */     //   #293	-> 1363
/*     */     //   #306	-> 1364
/*     */     //   #307	-> 1389
/*     */     //   #106	-> 1420
/*     */     //   #308	-> 1439
/*     */     //   #106	-> 1445
/*     */     //   #107	-> 1450
/*     */     //   #105	-> 1465
/*     */     //   #309	-> 1477
/*     */     //   #310	-> 1480
/*     */     //   #313	-> 1488
/*     */     //   #314	-> 1523
/*     */     //   #315	-> 1533
/*     */     //   #316	-> 1539
/*     */     //   #317	-> 1546
/*     */     //   #318	-> 1555
/*     */     //   #320	-> 1562
/*     */     //   #319	-> 1584
/*     */     //   #321	-> 1594
/*     */     //   #322	-> 1597
/*     */     //   #323	-> 1615
/*     */     //   #324	-> 1620
/*     */     //   #325	-> 1632
/*     */     //   #327	-> 1644
/*     */     //   #329	-> 1649
/*     */     //   #330	-> 1659
/*     */     //   #331	-> 1672
/*     */     //   #333	-> 1685
/*     */     //   #334	-> 1696
/*     */     //   #335	-> 1703
/*     */     //   #336	-> 1731
/*     */     //   #337	-> 1743
/*     */     //   #339	-> 1757
/*     */     //   #334	-> 1758
/*     */     //   #339	-> 1759
/*     */     //   #340	-> 1760
/*     */     //   #341	-> 1773
/*     */     //   #329	-> 1774
/*     */     //   #342	-> 1775
/*     */     //   #343	-> 1800
/*     */     //   #110	-> 1831
/*     */     //   #344	-> 1840
/*     */     //   #110	-> 1846
/*     */     //   #111	-> 1854
/*     */     //   #109	-> 1867
/*     */     //   #345	-> 1879
/*     */     //   #346	-> 1882
/*     */     //   #351	-> 1890
/*     */     //   #352	-> 1925
/*     */     //   #353	-> 1935
/*     */     //   #354	-> 1941
/*     */     //   #355	-> 1948
/*     */     //   #356	-> 1957
/*     */     //   #358	-> 1964
/*     */     //   #357	-> 1986
/*     */     //   #359	-> 1996
/*     */     //   #360	-> 1999
/*     */     //   #361	-> 2017
/*     */     //   #362	-> 2022
/*     */     //   #363	-> 2034
/*     */     //   #365	-> 2046
/*     */     //   #367	-> 2051
/*     */     //   #368	-> 2061
/*     */     //   #369	-> 2074
/*     */     //   #371	-> 2087
/*     */     //   #372	-> 2098
/*     */     //   #373	-> 2105
/*     */     //   #374	-> 2133
/*     */     //   #375	-> 2145
/*     */     //   #377	-> 2159
/*     */     //   #372	-> 2160
/*     */     //   #377	-> 2161
/*     */     //   #378	-> 2162
/*     */     //   #379	-> 2175
/*     */     //   #367	-> 2176
/*     */     //   #380	-> 2177
/*     */     //   #381	-> 2202
/*     */     //   #114	-> 2233
/*     */     //   #115	-> 2239
/*     */     //   #116	-> 2247
/*     */     //   #117	-> 2254
/*     */     //   #118	-> 2264
/*     */     //   #114	-> 2275
/*     */     //   #118	-> 2278
/*     */     //   #117	-> 2280
/*     */     //   #115	-> 2283
/*     */     //   #116	-> 2289
/*     */     //   #113	-> 2306
/*     */     //   #122	-> 2309
/*     */     //   #123	-> 2317
/*     */     //   #124	-> 2324
/*     */     //   #121	-> 2331
/*     */     //   #124	-> 2336
/*     */     //   #122	-> 2339
/*     */     //   #123	-> 2345
/*     */     //   #120	-> 2362
/*     */     //   #126	-> 2365
/*     */     //   #381	-> 2366
/*     */     //   #380	-> 2371
/*     */     //   #382	-> 2373
/*     */     //   #359	-> 2380
/*     */     //   #383	-> 2383
/*     */     //   #353	-> 2386
/*     */     //   #384	-> 2389
/*     */     //   #345	-> 2392
/*     */     //   #385	-> 2395
/*     */     //   #130	-> 2396
/*     */     //   #131	-> 2396
/*     */     //   #128	-> 2396
/*     */     //   #129	-> 2397
/*     */     //   #130	-> 2402
/*     */     //   #128	-> 2407
/*     */     //   #130	-> 2409
/*     */     //   #386	-> 2411
/*     */     //   #130	-> 2414
/*     */     //   #130	-> 2425
/*     */     //   #130	-> 2426
/*     */     //   #131	-> 2426
/*     */     //   #128	-> 2427
/*     */     //   #131	-> 2427
/*     */     //   #130	-> 2436
/*     */     //   #127	-> 2437
/*     */     //   #132	-> 2449
/*     */     //   #134	-> 2454
/*     */     //   #148	-> 2481
/*     */     //   #133	-> 2511
/*     */     //   #159	-> 2521
/*     */     //   #343	-> 2522
/*     */     //   #342	-> 2527
/*     */     //   #387	-> 2529
/*     */     //   #321	-> 2536
/*     */     //   #388	-> 2539
/*     */     //   #315	-> 2542
/*     */     //   #389	-> 2545
/*     */     //   #309	-> 2548
/*     */     //   #390	-> 2551
/*     */     //   #161	-> 2552
/*     */     //   #164	-> 2579
/*     */     //   #160	-> 2609
/*     */     //   #175	-> 2612
/*     */     //   #307	-> 2613
/*     */     //   #306	-> 2618
/*     */     //   #391	-> 2620
/*     */     //   #285	-> 2627
/*     */     //   #392	-> 2630
/*     */     //   #279	-> 2633
/*     */     //   #393	-> 2636
/*     */     //   #271	-> 2639
/*     */     //   #394	-> 2642
/*     */     //   #177	-> 2643
/*     */     //   #178	-> 2659
/*     */     //   #179	-> 2674
/*     */     //   #180	-> 2681
/*     */     //   #182	-> 2696
/*     */     //   #183	-> 2711
/*     */     //   #184	-> 2718
/*     */     //   #185	-> 2727
/*     */     //   #186	-> 2748
/*     */     //   #188	-> 2761
/*     */     //   #177	-> 2762
/*     */     //   #177	-> 2767
/*     */     //   #176	-> 2767
/*     */     //   #190	-> 2770
/*     */     //   #201	-> 2802
/*     */     //   #202	-> 2808
/*     */     //   #203	-> 2814
/*     */     //   #395	-> 2822
/*     */     //   #203	-> 2828
/*     */     //   #199	-> 2842
/*     */     //   #396	-> 2854
/*     */     //   #397	-> 2857
/*     */     //   #398	-> 2865
/*     */     //   #401	-> 2868
/*     */     //   #402	-> 2886
/*     */     //   #403	-> 2896
/*     */     //   #404	-> 2902
/*     */     //   #405	-> 2909
/*     */     //   #406	-> 2918
/*     */     //   #408	-> 2925
/*     */     //   #407	-> 2947
/*     */     //   #409	-> 2957
/*     */     //   #410	-> 2960
/*     */     //   #411	-> 2978
/*     */     //   #412	-> 2983
/*     */     //   #413	-> 2995
/*     */     //   #415	-> 3007
/*     */     //   #417	-> 3012
/*     */     //   #418	-> 3022
/*     */     //   #419	-> 3035
/*     */     //   #421	-> 3048
/*     */     //   #422	-> 3059
/*     */     //   #423	-> 3066
/*     */     //   #424	-> 3094
/*     */     //   #425	-> 3106
/*     */     //   #427	-> 3120
/*     */     //   #422	-> 3121
/*     */     //   #427	-> 3122
/*     */     //   #428	-> 3123
/*     */     //   #429	-> 3136
/*     */     //   #417	-> 3137
/*     */     //   #430	-> 3138
/*     */     //   #431	-> 3163
/*     */     //   #205	-> 3204
/*     */     //   #207	-> 3208
/*     */     //   #208	-> 3209
/*     */     //   #206	-> 3254
/*     */     //   #215	-> 3264
/*     */     //   #213	-> 3285
/*     */     //   #215	-> 3288
/*     */     //   #214	-> 3291
/*     */     //   #212	-> 3306
/*     */     //   #217	-> 3309
/*     */     //   #431	-> 3310
/*     */     //   #430	-> 3315
/*     */     //   #432	-> 3317
/*     */     //   #409	-> 3324
/*     */     //   #433	-> 3327
/*     */     //   #403	-> 3330
/*     */     //   #434	-> 3333
/*     */     //   #396	-> 3336
/*     */     //   #435	-> 3339
/*     */     //   #218	-> 3340
/*     */     //   #269	-> 3341
/*     */     //   #268	-> 3346
/*     */     //   #436	-> 3348
/*     */     //   #247	-> 3355
/*     */     //   #437	-> 3358
/*     */     //   #241	-> 3361
/*     */     //   #438	-> 3364
/*     */     //   #235	-> 3367
/*     */     //   #439	-> 3370
/*     */     //   #219	-> 3383
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   308	5	14	$i$a$-cache-LicenseDialogKt$LicenseDialog$1	I
/*     */     //   315	11	14	value$iv	Ljava/lang/Object;
/*     */     //   294	38	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   291	41	12	it$iv	Ljava/lang/Object;
/*     */     //   282	52	11	$i$f$cache	I
/*     */     //   279	55	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   279	55	10	invalid$iv	Z
/*     */     //   455	26	17	$i$a$-cache-LicenseDialogKt$LicenseDialog$targetProgress$1	I
/*     */     //   486	11	18	value$iv	Ljava/lang/Object;
/*     */     //   436	67	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   433	70	15	it$iv	Ljava/lang/Object;
/*     */     //   424	81	14	$i$f$cache	I
/*     */     //   421	84	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   421	84	13	invalid$iv	Z
/*     */     //   562	6	11	$i$f$getDp	I
/*     */     //   559	9	10	$this$dp$iv	I
/*     */     //   583	6	12	$i$f$getDp	I
/*     */     //   580	9	11	$this$dp$iv	I
/*     */     //   1030	6	43	$i$f$getDp	I
/*     */     //   1027	9	42	$this$dp$iv	I
/*     */     //   1439	6	69	$i$f$getDp	I
/*     */     //   1436	9	68	$this$dp$iv	I
/*     */     //   1840	6	96	$i$f$getDp	I
/*     */     //   1837	9	95	$this$dp$iv	I
/*     */     //   2233	133	121	$i$a$-Row-LicenseDialogKt$LicenseDialog$2$1$1$1	I
/*     */     //   2230	136	120	$this$LicenseDialog_u24lambda_u2410_u24lambda_u247_u24lambda_u246_u24lambda_u244	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   2230	136	119	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   2230	136	118	$changed	I
/*     */     //   2194	177	117	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   2191	180	116	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2191	180	115	$changed$iv	I
/*     */     //   2105	55	114	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   2102	58	113	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2098	64	112	$i$f$set-impl	I
/*     */     //   2095	67	111	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   2061	115	110	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   2058	118	109	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1990	394	108	$i$f$ReusableComposeNode	I
/*     */     //   1987	397	106	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1987	397	107	$changed$iv$iv$iv	I
/*     */     //   1929	461	102	$i$f$Layout	I
/*     */     //   1946	444	103	compositeKeyHash$iv$iv	I
/*     */     //   1955	435	104	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1964	426	105	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1926	464	101	$changed$iv$iv	I
/*     */     //   1871	525	98	$i$f$Row	I
/*     */     //   1916	480	100	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1890	506	99	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1868	528	95	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1868	528	96	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1868	528	97	$changed$iv	I
/*     */     //   2414	11	101	$i$a$-let-LicenseDialogKt$LicenseDialog$2$1$1$days$1	I
/*     */     //   2411	14	100	refillDate	Lkotlinx/datetime/Instant;
/*     */     //   1831	691	94	$i$a$-Row-LicenseDialogKt$LicenseDialog$2$1$1	I
/*     */     //   2439	83	99	days	Ljava/lang/Long;
/*     */     //   1828	694	93	$this$LicenseDialog_u24lambda_u2410_u24lambda_u247_u24lambda_u246	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   1828	694	92	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1828	694	91	$changed	I
/*     */     //   1792	735	90	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   1789	738	89	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1789	738	88	$changed$iv	I
/*     */     //   1703	55	87	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1700	58	86	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1696	64	85	$i$f$set-impl	I
/*     */     //   1693	67	84	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1659	115	83	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1656	118	82	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1588	952	81	$i$f$ReusableComposeNode	I
/*     */     //   1585	955	79	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1585	955	80	$changed$iv$iv$iv	I
/*     */     //   1527	1019	75	$i$f$Layout	I
/*     */     //   1544	1002	76	compositeKeyHash$iv$iv	I
/*     */     //   1553	993	77	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1562	984	78	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1524	1022	74	$changed$iv$iv	I
/*     */     //   1469	1083	71	$i$f$Row	I
/*     */     //   1514	1038	73	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1466	1086	68	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1466	1086	69	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1488	1064	72	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1466	1086	70	$changed$iv	I
/*     */     //   1420	1193	67	$i$a$-Column-LicenseDialogKt$LicenseDialog$2$1	I
/*     */     //   1417	1196	66	$this$LicenseDialog_u24lambda_u2410_u24lambda_u247	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   1417	1196	65	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1417	1196	64	$changed	I
/*     */     //   1381	1237	63	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   1378	1240	62	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1378	1240	61	$changed$iv	I
/*     */     //   1292	55	60	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1289	58	59	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1285	64	58	$i$f$set-impl	I
/*     */     //   1282	67	57	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1248	115	56	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1245	118	55	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1177	1454	54	$i$f$ReusableComposeNode	I
/*     */     //   1174	1457	52	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1174	1457	53	$changed$iv$iv$iv	I
/*     */     //   1116	1521	48	$i$f$Layout	I
/*     */     //   1133	1504	49	compositeKeyHash$iv$iv	I
/*     */     //   1142	1495	50	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1151	1486	51	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1113	1524	47	$changed$iv$iv	I
/*     */     //   1052	1591	45	$i$f$Column	I
/*     */     //   1103	1540	46	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1069	1574	37	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1049	1594	42	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   1077	1566	43	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   1049	1594	44	$changed$iv	I
/*     */     //   2727	33	45	dateFormat	Ljava/text/DateFormat;
/*     */     //   2748	12	46	shortDate	Ljava/lang/String;
/*     */     //   2659	103	44	$i$a$-buildString-LicenseDialogKt$LicenseDialog$2$textString$1	I
/*     */     //   2656	106	43	$this$LicenseDialog_u24lambda_u2410_u24lambda_u248	Ljava/lang/StringBuilder;
/*     */     //   2822	6	43	$i$f$getDp	I
/*     */     //   2819	9	42	$this$dp$iv	I
/*     */     //   3194	116	68	$i$a$-Box-LicenseDialogKt$LicenseDialog$2$3	I
/*     */     //   3191	119	67	$this$LicenseDialog_u24lambda_u2410_u24lambda_u249	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   3191	119	66	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   3191	119	65	$changed	I
/*     */     //   3155	160	64	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   3152	163	63	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3152	163	62	$changed$iv	I
/*     */     //   3066	55	61	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   3063	58	60	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3059	64	59	$i$f$set-impl	I
/*     */     //   3056	67	58	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   3022	115	57	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   3019	118	56	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2951	377	55	$i$f$ReusableComposeNode	I
/*     */     //   2948	380	53	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   2948	380	54	$changed$iv$iv$iv	I
/*     */     //   2890	444	49	$i$f$Layout	I
/*     */     //   2907	427	50	compositeKeyHash$iv$iv	I
/*     */     //   2916	418	51	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2925	409	52	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2887	447	48	$changed$iv$iv	I
/*     */     //   2846	494	46	$i$f$Box	I
/*     */     //   2877	463	47	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2843	497	42	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2865	475	43	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   2868	472	44	propagateMinConstraints$iv	Z
/*     */     //   2843	497	45	$changed$iv	I
/*     */     //   965	2376	36	$i$a$-Column-LicenseDialogKt$LicenseDialog$2	I
/*     */     //   2769	572	37	textString	Ljava/lang/String;
/*     */     //   962	2379	35	$this$LicenseDialog_u24lambda_u2410	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   962	2379	34	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   962	2379	33	$changed	I
/*     */     //   926	2420	32	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   923	2423	31	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   923	2423	30	$changed$iv	I
/*     */     //   837	55	29	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   834	58	28	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   830	64	27	$i$f$set-impl	I
/*     */     //   827	67	26	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   793	115	25	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   790	118	24	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   722	2637	23	$i$f$ReusableComposeNode	I
/*     */     //   719	2640	21	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   719	2640	22	$changed$iv$iv$iv	I
/*     */     //   661	2704	17	$i$f$Layout	I
/*     */     //   678	2687	18	compositeKeyHash$iv$iv	I
/*     */     //   687	2678	19	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   696	2669	20	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   658	2707	16	$changed$iv$iv	I
/*     */     //   605	2766	14	$i$f$Column	I
/*     */     //   648	2723	15	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   602	2769	10	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   602	2769	11	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   622	2749	12	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   602	2769	13	$changed$iv	I
/*     */     //   524	2856	8	targetProgress	F
/*     */     //   554	2826	9	animatedProgress$delegate	Landroidx/compose/runtime/State;
/*     */     //   21	3403	7	$dirty	I
/*     */     //   0	3424	0	info	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseData;
/*     */     //   0	3424	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	3424	2	onDismiss	Lkotlin/jvm/functions/Function0;
/*     */     //   0	3424	3	onUpgradeClicked	Lkotlin/jvm/functions/Function0;
/*     */     //   0	3424	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	3424	5	$changed	I
/*     */   }
/*     */ 
/*     */   
/*     */   private static final float LicenseDialog$lambda$3(State $animatedProgress$delegate) {
/*  87 */     State state = $animatedProgress$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 440 */       (Number)state.getValue()).floatValue();
/*     */   }
/*     */   
/*     */   private static final Unit LicenseDialog$lambda$11(LicenseData $info, Modifier $modifier, Function0<Unit> $onDismiss, Function0<Unit> $onUpgradeClicked, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     LicenseDialog($info, $modifier, $onDismiss, $onUpgradeClicked, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nLicenseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LicenseDialog.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseDialogKt$LicenseDialog$2$1$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,220:1\n149#2:221\n86#3:222\n82#3,7:223\n89#3:258\n93#3:262\n79#4,6:230\n86#4,4:245\n90#4,2:255\n94#4:261\n368#5,9:236\n377#5:257\n378#5,2:259\n4034#6,6:249\n*S KotlinDebug\n*F\n+ 1 LicenseDialog.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseDialogKt$LicenseDialog$2$1$1$2\n*L\n136#1:221\n135#1:222\n135#1:223,7\n135#1:258\n135#1:262\n135#1:230,6\n135#1:245,4\n135#1:255,2\n135#1:261\n135#1:236,9\n135#1:257\n135#1:259,2\n135#1:249,6\n*E\n"})
/*     */   static final class LicenseDialogKt$LicenseDialog$2$1$1$2 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(254327031, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.LicenseDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LicenseDialog.kt:134)"); 
/*     */         int $this$dp$iv = 4, $i$f$getDp = 0;
/*     */         Arrangement.Vertical vertical = (Arrangement.Vertical)Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl($this$dp$iv));
/*     */         Long long_ = this.$days;
/*     */         int $changed$iv = 48, $i$f$Column = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/*     */         Modifier modifier$iv = (Modifier)Modifier.Companion;
/*     */         Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
/*     */         MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(vertical, horizontalAlignment$iv, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3);
/*     */         int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*     */         int $i$f$Layout = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*     */         int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*     */         CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*     */         Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
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
/*     */         int $i$a$-Layout-ColumnKt$Column$1$iv = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer$iv, -384784025, "C88@4444L9:Column.kt#2w3rfo");
/*     */         int j = 0x6 | 0x70 & $changed$iv >> 6;
/*     */         Composer composer1 = $composer$iv;
/*     */         ColumnScope $this$invoke_u24lambda_u240 = (ColumnScope)ColumnScopeInstance.INSTANCE;
/*     */         int $i$a$-Column-LicenseDialogKt$LicenseDialog$2$1$1$2$1 = 0;
/*     */         TextKt.Text-bAzTDeA("Quota", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534);
/*     */         String str = "Quota renews in " + long_ + " days";
/*     */         FontWeight fontWeight = FontWeight.Companion.getW500();
/*     */         long l1 = TextUnitKt.getSp(16);
/*     */         long l2 = TextUnitKt.getSp(13);
/*     */         long l3 = MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getInactiveTextColor(composer1, 0);
/*     */         TextKt.Text-bAzTDeA(str, null, l3, l2, null, fontWeight, null, 0L, null, 0, l1, 0, false, 0, null, null, composer1, 199680, 6, 64466);
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
/*     */     LicenseDialogKt$LicenseDialog$2$1$1$2(Long $days) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class LicenseDialogKt$LicenseDialog$2$1$1$3 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(-1264960644, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.LicenseDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LicenseDialog.kt:148)"); 
/*     */         String str = "for " + this.$days + " days";
/*     */         FontWeight fontWeight = FontWeight.Companion.getW500();
/*     */         long l1 = TextUnitKt.getSp(16);
/*     */         long l2 = TextUnitKt.getSp(13);
/*     */         long l3 = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getInactiveTextColor($composer, 0);
/*     */         TextKt.Text-bAzTDeA(str, null, l3, l2, null, fontWeight, null, 0L, null, 0, l1, 0, false, 0, null, null, $composer, 199680, 6, 64466);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     LicenseDialogKt$LicenseDialog$2$1$1$3(Long $days) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class LicenseDialogKt$LicenseDialog$2$1$2 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(1253020920, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.LicenseDialog.<anonymous>.<anonymous>.<anonymous> (LicenseDialog.kt:161)"); 
/*     */         TextKt.Text-bAzTDeA("Available quota: " + Math.max(MathKt.roundToInt(100 * this.$targetProgress), 0) + "%", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65534);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     LicenseDialogKt$LicenseDialog$2$1$2(float $targetProgress) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nLicenseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LicenseDialog.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseDialogKt$LicenseDialog$2$1$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,220:1\n149#2:221\n99#3:222\n96#3,6:223\n102#3:257\n106#3:261\n79#4,6:229\n86#4,4:244\n90#4,2:254\n94#4:260\n368#5,9:235\n377#5:256\n378#5,2:258\n4034#6,6:248\n*S KotlinDebug\n*F\n+ 1 LicenseDialog.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseDialogKt$LicenseDialog$2$1$3\n*L\n166#1:221\n165#1:222\n165#1:223,6\n165#1:257\n165#1:261\n165#1:229,6\n165#1:244,4\n165#1:254,2\n165#1:260\n165#1:235,9\n165#1:256\n165#1:258,2\n165#1:248,6\n*E\n"})
/*     */   static final class LicenseDialogKt$LicenseDialog$2$1$3 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(-608474499, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.LicenseDialog.<anonymous>.<anonymous>.<anonymous> (LicenseDialog.kt:164)"); 
/*     */         int $this$dp$iv = 8, $i$f$getDp = 0;
/*     */         Modifier modifier1 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default((Modifier)Modifier.Companion, 0.0F, 1, null), Dp.constructor-impl($this$dp$iv));
/*     */         State<Float> state = this.$animatedProgress$delegate;
/*     */         int $changed$iv = 6, $i$f$Row = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
/*     */         Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
/*     */         Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getTop();
/*     */         MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3);
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
/*     */         int j = 0x6 | 0x70 & $changed$iv >> 6;
/*     */         Composer composer1 = $composer$iv;
/*     */         RowScope $this$invoke_u24lambda_u240 = (RowScope)RowScopeInstance.INSTANCE;
/*     */         int $i$a$-Row-LicenseDialogKt$LicenseDialog$2$1$3$1 = 0;
/*     */         Modifier modifier2 = SizeKt.fillMaxWidth$default((Modifier)Modifier.Companion, 0.0F, 1, null);
/*     */         LinearProgressBarKt.HorizontalProgressBar(LicenseDialogKt.LicenseDialog$lambda$3(state), modifier2, null, composer1, 48, 4);
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
/*     */     LicenseDialogKt$LicenseDialog$2$1$3(State<Float> $animatedProgress$delegate) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nLicenseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LicenseDialog.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseDialogKt$LicenseDialog$2$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n149#2:221\n86#3:222\n82#3,7:223\n89#3:258\n93#3:263\n79#4,6:230\n86#4,4:245\n90#4,2:255\n94#4:262\n368#5,9:236\n377#5:257\n378#5,2:260\n4034#6,6:249\n1#7:259\n*S KotlinDebug\n*F\n+ 1 LicenseDialog.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseDialogKt$LicenseDialog$2$2\n*L\n192#1:221\n191#1:222\n191#1:223,7\n191#1:258\n191#1:263\n191#1:230,6\n191#1:245,4\n191#1:255,2\n191#1:262\n191#1:236,9\n191#1:257\n191#1:260,2\n191#1:249,6\n*E\n"})
/*     */   static final class LicenseDialogKt$LicenseDialog$2$2 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(-1325658188, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.LicenseDialog.<anonymous>.<anonymous> (LicenseDialog.kt:190)"); 
/*     */         int $this$dp$iv = 4, $i$f$getDp = 0;
/*     */         Arrangement.Vertical vertical = (Arrangement.Vertical)Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl($this$dp$iv));
/*     */         LicenseData licenseData = this.$info;
/*     */         String str1 = this.$textString;
/*     */         int $changed$iv = 48, $i$f$Column = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/*     */         Modifier modifier$iv = (Modifier)Modifier.Companion;
/*     */         Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
/*     */         MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(vertical, horizontalAlignment$iv, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3);
/*     */         int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*     */         int $i$f$Layout = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*     */         int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*     */         CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*     */         Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
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
/*     */         int $i$a$-Layout-ColumnKt$Column$1$iv = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer$iv, -384784025, "C88@4444L9:Column.kt#2w3rfo");
/*     */         int j = 0x6 | 0x70 & $changed$iv >> 6;
/*     */         Composer composer1 = $composer$iv;
/*     */         ColumnScope $this$invoke_u24lambda_u242 = (ColumnScope)ColumnScopeInstance.INSTANCE;
/*     */         int $i$a$-Column-LicenseDialogKt$LicenseDialog$2$2$1 = 0;
/*     */         String str2 = licenseData.getLicensedTo();
/*     */         composer1.startReplaceGroup(-1186306253);
/*     */         if (str2 == null) {
/*     */         
/*     */         } else {
/*     */           String it;
/*     */           int $i$a$-let-LicenseDialogKt$LicenseDialog$2$2$1$1 = 0;
/*     */           TextKt.Text-bAzTDeA(it, null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534);
/*     */         } 
/*     */         composer1.endReplaceGroup();
/*     */         str2 = licenseData.getAccountEmail();
/*     */         composer1.startReplaceGroup(-1186304802);
/*     */         if (str2 == null) {
/*     */         
/*     */         } else {
/*     */           String it;
/*     */           int $i$a$-let-LicenseDialogKt$LicenseDialog$2$2$1$2 = 0;
/*     */           TextKt.Text-bAzTDeA(it, null, MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getInactiveTextColor(composer1, 0), 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65530);
/*     */         } 
/*     */         composer1.endReplaceGroup();
/*     */         TextKt.Text-bAzTDeA(str1, null, MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getInactiveTextColor(composer1, 0), 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65530);
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
/*     */     LicenseDialogKt$LicenseDialog$2$2(LicenseData $info, String $textString) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\LicenseDialogKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */