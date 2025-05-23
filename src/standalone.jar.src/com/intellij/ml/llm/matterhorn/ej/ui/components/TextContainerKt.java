/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.animation.AnimatedVisibilityScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.text.AnnotatedString;
/*     */ import androidx.compose.ui.text.TextLayoutResult;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\000\032\025\020\000\032\0020\0012\006\020\002\032\0020\003H\007¢\006\002\020\004\032\025\020\000\032\0020\0012\006\020\002\032\0020\005H\007¢\006\002\020\006¨\006\007²\006\n\020\b\032\0020\tX\002²\006\n\020\n\032\0020\tX\002"}, d2 = {"TextContainer", "", "text", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/runtime/Composer;I)V", "standalone", "tooLong", "", "expanded"})
/*     */ @SourceDebugExtension({"SMAP\nTextContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextContainer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/TextContainerKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,60:1\n86#2:61\n82#2,7:62\n89#2:97\n93#2:153\n79#3,6:69\n86#3,4:84\n90#3,2:94\n79#3,6:117\n86#3,4:132\n90#3,2:142\n94#3:148\n94#3:152\n368#4,9:75\n377#4:96\n368#4,9:123\n377#4:144\n378#4,2:146\n378#4,2:150\n4034#5,6:88\n4034#5,6:136\n1225#6,6:98\n1225#6,6:104\n71#7:110\n68#7,6:111\n74#7:145\n78#7:149\n81#8:154\n107#8,2:155\n81#8:157\n107#8,2:158\n*S KotlinDebug\n*F\n+ 1 TextContainer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/TextContainerKt\n*L\n28#1:61\n28#1:62,7\n28#1:97\n28#1:153\n28#1:69,6\n28#1:84,4\n28#1:94,2\n33#1:117,6\n33#1:132,4\n33#1:142,2\n33#1:148\n28#1:152\n28#1:75,9\n28#1:96\n33#1:123,9\n33#1:144\n33#1:146,2\n28#1:150,2\n28#1:88,6\n33#1:136,6\n29#1:98,6\n30#1:104,6\n33#1:110\n33#1:111,6\n33#1:145\n33#1:149\n29#1:154\n29#1:155,2\n30#1:157\n30#1:158,2\n*E\n"})
/*     */ public final class TextContainerKt {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void TextContainer(@NotNull String text, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'text'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 1076003354
/*     */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   14: astore_1
/*     */     //   15: iload_2
/*     */     //   16: istore_3
/*     */     //   17: iload_2
/*     */     //   18: bipush #6
/*     */     //   20: iand
/*     */     //   21: ifne -> 42
/*     */     //   24: iload_3
/*     */     //   25: aload_1
/*     */     //   26: aload_0
/*     */     //   27: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   32: ifeq -> 39
/*     */     //   35: iconst_4
/*     */     //   36: goto -> 40
/*     */     //   39: iconst_2
/*     */     //   40: ior
/*     */     //   41: istore_3
/*     */     //   42: iload_3
/*     */     //   43: iconst_3
/*     */     //   44: iand
/*     */     //   45: iconst_2
/*     */     //   46: if_icmpne -> 58
/*     */     //   49: aload_1
/*     */     //   50: invokeinterface getSkipping : ()Z
/*     */     //   55: ifne -> 103
/*     */     //   58: invokestatic isTraceInProgress : ()Z
/*     */     //   61: ifeq -> 73
/*     */     //   64: ldc 1076003354
/*     */     //   66: iload_3
/*     */     //   67: iconst_m1
/*     */     //   68: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.TextContainer (TextContainer.kt:23)'
/*     */     //   70: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   73: new androidx/compose/ui/text/AnnotatedString
/*     */     //   76: dup
/*     */     //   77: aload_0
/*     */     //   78: aconst_null
/*     */     //   79: aconst_null
/*     */     //   80: bipush #6
/*     */     //   82: aconst_null
/*     */     //   83: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   86: aload_1
/*     */     //   87: iconst_0
/*     */     //   88: invokestatic TextContainer : (Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/runtime/Composer;I)V
/*     */     //   91: invokestatic isTraceInProgress : ()Z
/*     */     //   94: ifeq -> 109
/*     */     //   97: invokestatic traceEventEnd : ()V
/*     */     //   100: goto -> 109
/*     */     //   103: aload_1
/*     */     //   104: invokeinterface skipToGroupEnd : ()V
/*     */     //   109: aload_1
/*     */     //   110: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   115: dup
/*     */     //   116: ifnull -> 134
/*     */     //   119: aload_0
/*     */     //   120: iload_2
/*     */     //   121: <illegal opcode> invoke : (Ljava/lang/String;I)Lkotlin/jvm/functions/Function2;
/*     */     //   126: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   131: goto -> 135
/*     */     //   134: pop
/*     */     //   135: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #24	-> 6
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   17	119	3	$dirty	I
/*     */     //   0	136	0	text	Ljava/lang/String;
/*     */     //   0	136	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	136	2	$changed	I
/*     */   }
/*     */   
/*  29 */   private static final boolean TextContainer$lambda$8$lambda$2(MutableState $tooLong$delegate) { State state = (State)$tooLong$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 154 */       (Boolean)state.getValue()).booleanValue(); }
/*     */   @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void TextContainer(@NotNull AnnotatedString text, @Nullable Composer $composer, int $changed) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'text'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 1872600550
/*     */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   14: astore_1
/*     */     //   15: iload_2
/*     */     //   16: istore_3
/*     */     //   17: iload_2
/*     */     //   18: bipush #6
/*     */     //   20: iand
/*     */     //   21: ifne -> 42
/*     */     //   24: iload_3
/*     */     //   25: aload_1
/*     */     //   26: aload_0
/*     */     //   27: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   32: ifeq -> 39
/*     */     //   35: iconst_4
/*     */     //   36: goto -> 40
/*     */     //   39: iconst_2
/*     */     //   40: ior
/*     */     //   41: istore_3
/*     */     //   42: iload_3
/*     */     //   43: iconst_3
/*     */     //   44: iand
/*     */     //   45: iconst_2
/*     */     //   46: if_icmpne -> 58
/*     */     //   49: aload_1
/*     */     //   50: invokeinterface getSkipping : ()Z
/*     */     //   55: ifne -> 1185
/*     */     //   58: invokestatic isTraceInProgress : ()Z
/*     */     //   61: ifeq -> 73
/*     */     //   64: ldc 1872600550
/*     */     //   66: iload_3
/*     */     //   67: iconst_m1
/*     */     //   68: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.TextContainer (TextContainer.kt:26)'
/*     */     //   70: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   73: iconst_0
/*     */     //   74: istore #7
/*     */     //   76: nop
/*     */     //   77: iconst_0
/*     */     //   78: istore #8
/*     */     //   80: aload_1
/*     */     //   81: ldc -483455358
/*     */     //   83: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   85: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   88: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   91: checkcast androidx/compose/ui/Modifier
/*     */     //   94: astore #4
/*     */     //   96: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   99: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   102: astore #5
/*     */     //   104: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   107: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   110: astore #6
/*     */     //   112: aload #5
/*     */     //   114: aload #6
/*     */     //   116: aload_1
/*     */     //   117: bipush #14
/*     */     //   119: iload #7
/*     */     //   121: iconst_3
/*     */     //   122: ishr
/*     */     //   123: iand
/*     */     //   124: bipush #112
/*     */     //   126: iload #7
/*     */     //   128: iconst_3
/*     */     //   129: ishr
/*     */     //   130: iand
/*     */     //   131: ior
/*     */     //   132: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   135: astore #9
/*     */     //   137: bipush #112
/*     */     //   139: iload #7
/*     */     //   141: iconst_3
/*     */     //   142: ishl
/*     */     //   143: iand
/*     */     //   144: istore #10
/*     */     //   146: nop
/*     */     //   147: iconst_0
/*     */     //   148: istore #11
/*     */     //   150: aload_1
/*     */     //   151: ldc -1323940314
/*     */     //   153: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   155: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   158: aload_1
/*     */     //   159: iconst_0
/*     */     //   160: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   163: istore #12
/*     */     //   165: aload_1
/*     */     //   166: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   171: astore #13
/*     */     //   173: aload_1
/*     */     //   174: aload #4
/*     */     //   176: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   179: astore #14
/*     */     //   181: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   184: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   187: astore #15
/*     */     //   189: bipush #6
/*     */     //   191: sipush #896
/*     */     //   194: iload #10
/*     */     //   196: bipush #6
/*     */     //   198: ishl
/*     */     //   199: iand
/*     */     //   200: ior
/*     */     //   201: istore #16
/*     */     //   203: nop
/*     */     //   204: iconst_0
/*     */     //   205: istore #17
/*     */     //   207: aload_1
/*     */     //   208: ldc -692256719
/*     */     //   210: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   212: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   215: aload_1
/*     */     //   216: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   221: instanceof androidx/compose/runtime/Applier
/*     */     //   224: ifne -> 230
/*     */     //   227: invokestatic invalidApplier : ()V
/*     */     //   230: aload_1
/*     */     //   231: invokeinterface startReusableNode : ()V
/*     */     //   236: aload_1
/*     */     //   237: invokeinterface getInserting : ()Z
/*     */     //   242: ifeq -> 256
/*     */     //   245: aload_1
/*     */     //   246: aload #15
/*     */     //   248: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   253: goto -> 262
/*     */     //   256: aload_1
/*     */     //   257: invokeinterface useNode : ()V
/*     */     //   262: aload_1
/*     */     //   263: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   266: astore #18
/*     */     //   268: iconst_0
/*     */     //   269: istore #19
/*     */     //   271: aload #18
/*     */     //   273: aload #9
/*     */     //   275: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   278: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   281: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   284: aload #18
/*     */     //   286: aload #13
/*     */     //   288: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   291: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   294: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   297: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   300: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   303: astore #20
/*     */     //   305: iconst_0
/*     */     //   306: istore #21
/*     */     //   308: aload #18
/*     */     //   310: astore #22
/*     */     //   312: iconst_0
/*     */     //   313: istore #23
/*     */     //   315: aload #22
/*     */     //   317: invokeinterface getInserting : ()Z
/*     */     //   322: ifne -> 343
/*     */     //   325: aload #22
/*     */     //   327: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   332: iload #12
/*     */     //   334: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   337: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   340: ifne -> 369
/*     */     //   343: aload #22
/*     */     //   345: iload #12
/*     */     //   347: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   350: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   355: aload #18
/*     */     //   357: iload #12
/*     */     //   359: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   362: aload #20
/*     */     //   364: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   369: nop
/*     */     //   370: nop
/*     */     //   371: nop
/*     */     //   372: aload #18
/*     */     //   374: aload #14
/*     */     //   376: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   379: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   382: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   385: nop
/*     */     //   386: nop
/*     */     //   387: aload_1
/*     */     //   388: bipush #14
/*     */     //   390: iload #16
/*     */     //   392: bipush #6
/*     */     //   394: ishr
/*     */     //   395: iand
/*     */     //   396: istore #24
/*     */     //   398: astore #25
/*     */     //   400: iconst_0
/*     */     //   401: istore #26
/*     */     //   403: aload #25
/*     */     //   405: ldc -384784025
/*     */     //   407: ldc 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   409: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   412: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   415: aload #25
/*     */     //   417: bipush #6
/*     */     //   419: bipush #112
/*     */     //   421: iload #7
/*     */     //   423: bipush #6
/*     */     //   425: ishr
/*     */     //   426: iand
/*     */     //   427: ior
/*     */     //   428: istore #27
/*     */     //   430: astore #28
/*     */     //   432: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   435: astore #29
/*     */     //   437: iconst_0
/*     */     //   438: istore #30
/*     */     //   440: aload #28
/*     */     //   442: ldc 1411863026
/*     */     //   444: invokeinterface startReplaceGroup : (I)V
/*     */     //   449: aload #28
/*     */     //   451: astore #31
/*     */     //   453: iconst_0
/*     */     //   454: istore #32
/*     */     //   456: nop
/*     */     //   457: iconst_0
/*     */     //   458: istore #33
/*     */     //   460: aload #31
/*     */     //   462: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   467: astore #34
/*     */     //   469: iconst_0
/*     */     //   470: istore #35
/*     */     //   472: aload #34
/*     */     //   474: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   477: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   480: if_acmpne -> 512
/*     */     //   483: iconst_0
/*     */     //   484: istore #36
/*     */     //   486: iconst_0
/*     */     //   487: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   490: aconst_null
/*     */     //   491: iconst_2
/*     */     //   492: aconst_null
/*     */     //   493: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   496: astore #36
/*     */     //   498: aload #31
/*     */     //   500: aload #36
/*     */     //   502: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   507: aload #36
/*     */     //   509: goto -> 514
/*     */     //   512: aload #34
/*     */     //   514: nop
/*     */     //   515: nop
/*     */     //   516: nop
/*     */     //   517: checkcast androidx/compose/runtime/MutableState
/*     */     //   520: astore #37
/*     */     //   522: aload #28
/*     */     //   524: invokeinterface endReplaceGroup : ()V
/*     */     //   529: aload #37
/*     */     //   531: astore #38
/*     */     //   533: aload #28
/*     */     //   535: ldc_w 1411864786
/*     */     //   538: invokeinterface startReplaceGroup : (I)V
/*     */     //   543: aload #28
/*     */     //   545: astore #32
/*     */     //   547: iconst_0
/*     */     //   548: istore #33
/*     */     //   550: nop
/*     */     //   551: iconst_0
/*     */     //   552: istore #34
/*     */     //   554: aload #32
/*     */     //   556: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   561: astore #35
/*     */     //   563: iconst_0
/*     */     //   564: istore #36
/*     */     //   566: aload #35
/*     */     //   568: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   571: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   574: if_acmpne -> 606
/*     */     //   577: iconst_0
/*     */     //   578: istore #39
/*     */     //   580: iconst_0
/*     */     //   581: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   584: aconst_null
/*     */     //   585: iconst_2
/*     */     //   586: aconst_null
/*     */     //   587: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   590: astore #39
/*     */     //   592: aload #32
/*     */     //   594: aload #39
/*     */     //   596: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   601: aload #39
/*     */     //   603: goto -> 608
/*     */     //   606: aload #35
/*     */     //   608: nop
/*     */     //   609: nop
/*     */     //   610: nop
/*     */     //   611: checkcast androidx/compose/runtime/MutableState
/*     */     //   614: astore #31
/*     */     //   616: aload #28
/*     */     //   618: invokeinterface endReplaceGroup : ()V
/*     */     //   623: aload #31
/*     */     //   625: astore #37
/*     */     //   627: aload #37
/*     */     //   629: invokestatic TextContainer$lambda$8$lambda$5 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   632: ifeq -> 641
/*     */     //   635: ldc_w 2147483647
/*     */     //   638: goto -> 643
/*     */     //   641: bipush #12
/*     */     //   643: istore #31
/*     */     //   645: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   648: checkcast androidx/compose/ui/Modifier
/*     */     //   651: aconst_null
/*     */     //   652: aconst_null
/*     */     //   653: iconst_3
/*     */     //   654: aconst_null
/*     */     //   655: invokestatic animateContentSize$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   658: astore #32
/*     */     //   660: iconst_0
/*     */     //   661: istore #35
/*     */     //   663: iconst_0
/*     */     //   664: istore #36
/*     */     //   666: aload #28
/*     */     //   668: ldc_w 733328855
/*     */     //   671: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   674: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   677: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   680: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   683: astore #33
/*     */     //   685: iconst_0
/*     */     //   686: istore #34
/*     */     //   688: aload #33
/*     */     //   690: iload #34
/*     */     //   692: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   695: astore #39
/*     */     //   697: bipush #112
/*     */     //   699: iload #35
/*     */     //   701: iconst_3
/*     */     //   702: ishl
/*     */     //   703: iand
/*     */     //   704: istore #40
/*     */     //   706: nop
/*     */     //   707: iconst_0
/*     */     //   708: istore #41
/*     */     //   710: aload #28
/*     */     //   712: ldc -1323940314
/*     */     //   714: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   716: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   719: aload #28
/*     */     //   721: iconst_0
/*     */     //   722: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   725: istore #42
/*     */     //   727: aload #28
/*     */     //   729: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   734: astore #43
/*     */     //   736: aload #28
/*     */     //   738: aload #32
/*     */     //   740: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   743: astore #44
/*     */     //   745: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   748: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   751: astore #45
/*     */     //   753: bipush #6
/*     */     //   755: sipush #896
/*     */     //   758: iload #40
/*     */     //   760: bipush #6
/*     */     //   762: ishl
/*     */     //   763: iand
/*     */     //   764: ior
/*     */     //   765: istore #46
/*     */     //   767: nop
/*     */     //   768: iconst_0
/*     */     //   769: istore #47
/*     */     //   771: aload #28
/*     */     //   773: ldc -692256719
/*     */     //   775: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   777: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   780: aload #28
/*     */     //   782: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   787: instanceof androidx/compose/runtime/Applier
/*     */     //   790: ifne -> 796
/*     */     //   793: invokestatic invalidApplier : ()V
/*     */     //   796: aload #28
/*     */     //   798: invokeinterface startReusableNode : ()V
/*     */     //   803: aload #28
/*     */     //   805: invokeinterface getInserting : ()Z
/*     */     //   810: ifeq -> 825
/*     */     //   813: aload #28
/*     */     //   815: aload #45
/*     */     //   817: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   822: goto -> 832
/*     */     //   825: aload #28
/*     */     //   827: invokeinterface useNode : ()V
/*     */     //   832: aload #28
/*     */     //   834: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   837: astore #48
/*     */     //   839: iconst_0
/*     */     //   840: istore #49
/*     */     //   842: aload #48
/*     */     //   844: aload #39
/*     */     //   846: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   849: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   852: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   855: aload #48
/*     */     //   857: aload #43
/*     */     //   859: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   862: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   865: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   868: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   871: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   874: astore #50
/*     */     //   876: iconst_0
/*     */     //   877: istore #51
/*     */     //   879: aload #48
/*     */     //   881: astore #52
/*     */     //   883: iconst_0
/*     */     //   884: istore #53
/*     */     //   886: aload #52
/*     */     //   888: invokeinterface getInserting : ()Z
/*     */     //   893: ifne -> 914
/*     */     //   896: aload #52
/*     */     //   898: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   903: iload #42
/*     */     //   905: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   908: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   911: ifne -> 940
/*     */     //   914: aload #52
/*     */     //   916: iload #42
/*     */     //   918: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   921: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   926: aload #48
/*     */     //   928: iload #42
/*     */     //   930: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   933: aload #50
/*     */     //   935: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   940: nop
/*     */     //   941: nop
/*     */     //   942: nop
/*     */     //   943: aload #48
/*     */     //   945: aload #44
/*     */     //   947: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   950: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   953: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   956: nop
/*     */     //   957: nop
/*     */     //   958: aload #28
/*     */     //   960: bipush #14
/*     */     //   962: iload #46
/*     */     //   964: bipush #6
/*     */     //   966: ishr
/*     */     //   967: iand
/*     */     //   968: istore #54
/*     */     //   970: astore #55
/*     */     //   972: iconst_0
/*     */     //   973: istore #56
/*     */     //   975: aload #55
/*     */     //   977: ldc_w -2146769399
/*     */     //   980: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   983: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   986: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   989: aload #55
/*     */     //   991: bipush #6
/*     */     //   993: bipush #112
/*     */     //   995: iload #35
/*     */     //   997: bipush #6
/*     */     //   999: ishr
/*     */     //   1000: iand
/*     */     //   1001: ior
/*     */     //   1002: istore #57
/*     */     //   1004: astore #58
/*     */     //   1006: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1009: astore #59
/*     */     //   1011: iconst_0
/*     */     //   1012: istore #60
/*     */     //   1014: aconst_null
/*     */     //   1015: ldc_w -1097460697
/*     */     //   1018: iconst_1
/*     */     //   1019: new com/intellij/ml/llm/matterhorn/ej/ui/components/TextContainerKt$TextContainer$2$1$1
/*     */     //   1022: dup
/*     */     //   1023: aload_0
/*     */     //   1024: iload #31
/*     */     //   1026: aload #38
/*     */     //   1028: invokespecial <init> : (Landroidx/compose/ui/text/AnnotatedString;ILandroidx/compose/runtime/MutableState;)V
/*     */     //   1031: aload #58
/*     */     //   1033: bipush #54
/*     */     //   1035: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1038: checkcast kotlin/jvm/functions/Function2
/*     */     //   1041: aload #58
/*     */     //   1043: bipush #48
/*     */     //   1045: iconst_1
/*     */     //   1046: invokestatic SelectionContainer : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1049: nop
/*     */     //   1050: aload #55
/*     */     //   1052: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1055: aload #28
/*     */     //   1057: invokeinterface endNode : ()V
/*     */     //   1062: aload #28
/*     */     //   1064: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1067: nop
/*     */     //   1068: aload #28
/*     */     //   1070: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1073: nop
/*     */     //   1074: aload #28
/*     */     //   1076: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1079: nop
/*     */     //   1080: aload #29
/*     */     //   1082: aload #38
/*     */     //   1084: invokestatic TextContainer$lambda$8$lambda$2 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   1087: ifne -> 1098
/*     */     //   1090: aload #37
/*     */     //   1092: invokestatic TextContainer$lambda$8$lambda$5 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   1095: ifeq -> 1102
/*     */     //   1098: iconst_1
/*     */     //   1099: goto -> 1103
/*     */     //   1102: iconst_0
/*     */     //   1103: aconst_null
/*     */     //   1104: aconst_null
/*     */     //   1105: aconst_null
/*     */     //   1106: aconst_null
/*     */     //   1107: ldc_w -538592296
/*     */     //   1110: iconst_1
/*     */     //   1111: new com/intellij/ml/llm/matterhorn/ej/ui/components/TextContainerKt$TextContainer$2$2
/*     */     //   1114: dup
/*     */     //   1115: aload #37
/*     */     //   1117: invokespecial <init> : (Landroidx/compose/runtime/MutableState;)V
/*     */     //   1120: aload #28
/*     */     //   1122: bipush #54
/*     */     //   1124: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1127: checkcast kotlin/jvm/functions/Function3
/*     */     //   1130: aload #28
/*     */     //   1132: ldc_w 1572864
/*     */     //   1135: bipush #14
/*     */     //   1137: iload #27
/*     */     //   1139: iand
/*     */     //   1140: ior
/*     */     //   1141: bipush #30
/*     */     //   1143: invokestatic AnimatedVisibility : (Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1146: nop
/*     */     //   1147: aload #25
/*     */     //   1149: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1152: aload_1
/*     */     //   1153: invokeinterface endNode : ()V
/*     */     //   1158: aload_1
/*     */     //   1159: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1162: nop
/*     */     //   1163: aload_1
/*     */     //   1164: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1167: nop
/*     */     //   1168: aload_1
/*     */     //   1169: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1172: nop
/*     */     //   1173: invokestatic isTraceInProgress : ()Z
/*     */     //   1176: ifeq -> 1191
/*     */     //   1179: invokestatic traceEventEnd : ()V
/*     */     //   1182: goto -> 1191
/*     */     //   1185: aload_1
/*     */     //   1186: invokeinterface skipToGroupEnd : ()V
/*     */     //   1191: aload_1
/*     */     //   1192: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1197: dup
/*     */     //   1198: ifnull -> 1216
/*     */     //   1201: aload_0
/*     */     //   1202: iload_2
/*     */     //   1203: <illegal opcode> invoke : (Landroidx/compose/ui/text/AnnotatedString;I)Lkotlin/jvm/functions/Function2;
/*     */     //   1208: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1213: goto -> 1217
/*     */     //   1216: pop
/*     */     //   1217: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #27	-> 6
/*     */     //   #28	-> 76
/*     */     //   #61	-> 85
/*     */     //   #62	-> 88
/*     */     //   #63	-> 96
/*     */     //   #64	-> 104
/*     */     //   #67	-> 112
/*     */     //   #68	-> 146
/*     */     //   #69	-> 155
/*     */     //   #70	-> 160
/*     */     //   #71	-> 166
/*     */     //   #72	-> 174
/*     */     //   #74	-> 181
/*     */     //   #73	-> 203
/*     */     //   #75	-> 212
/*     */     //   #76	-> 215
/*     */     //   #77	-> 231
/*     */     //   #78	-> 236
/*     */     //   #79	-> 246
/*     */     //   #81	-> 257
/*     */     //   #83	-> 262
/*     */     //   #84	-> 271
/*     */     //   #85	-> 284
/*     */     //   #87	-> 297
/*     */     //   #88	-> 308
/*     */     //   #89	-> 315
/*     */     //   #90	-> 343
/*     */     //   #91	-> 355
/*     */     //   #93	-> 369
/*     */     //   #88	-> 370
/*     */     //   #93	-> 371
/*     */     //   #94	-> 372
/*     */     //   #95	-> 385
/*     */     //   #83	-> 386
/*     */     //   #96	-> 387
/*     */     //   #97	-> 409
/*     */     //   #29	-> 456
/*     */     //   #98	-> 460
/*     */     //   #99	-> 472
/*     */     //   #100	-> 483
/*     */     //   #29	-> 486
/*     */     //   #100	-> 496
/*     */     //   #101	-> 498
/*     */     //   #102	-> 507
/*     */     //   #103	-> 512
/*     */     //   #99	-> 514
/*     */     //   #98	-> 515
/*     */     //   #98	-> 516
/*     */     //   #29	-> 517
/*     */     //   #30	-> 550
/*     */     //   #104	-> 554
/*     */     //   #105	-> 566
/*     */     //   #106	-> 577
/*     */     //   #30	-> 580
/*     */     //   #106	-> 590
/*     */     //   #107	-> 592
/*     */     //   #108	-> 601
/*     */     //   #109	-> 606
/*     */     //   #105	-> 608
/*     */     //   #104	-> 609
/*     */     //   #104	-> 610
/*     */     //   #30	-> 611
/*     */     //   #32	-> 627
/*     */     //   #33	-> 645
/*     */     //   #110	-> 674
/*     */     //   #111	-> 677
/*     */     //   #112	-> 685
/*     */     //   #115	-> 688
/*     */     //   #116	-> 706
/*     */     //   #117	-> 716
/*     */     //   #118	-> 722
/*     */     //   #119	-> 729
/*     */     //   #120	-> 738
/*     */     //   #122	-> 745
/*     */     //   #121	-> 767
/*     */     //   #123	-> 777
/*     */     //   #124	-> 780
/*     */     //   #125	-> 798
/*     */     //   #126	-> 803
/*     */     //   #127	-> 815
/*     */     //   #129	-> 827
/*     */     //   #131	-> 832
/*     */     //   #132	-> 842
/*     */     //   #133	-> 855
/*     */     //   #135	-> 868
/*     */     //   #136	-> 879
/*     */     //   #137	-> 886
/*     */     //   #138	-> 914
/*     */     //   #139	-> 926
/*     */     //   #141	-> 940
/*     */     //   #136	-> 941
/*     */     //   #141	-> 942
/*     */     //   #142	-> 943
/*     */     //   #143	-> 956
/*     */     //   #131	-> 957
/*     */     //   #144	-> 958
/*     */     //   #145	-> 983
/*     */     //   #34	-> 1015
/*     */     //   #46	-> 1049
/*     */     //   #145	-> 1050
/*     */     //   #144	-> 1055
/*     */     //   #146	-> 1057
/*     */     //   #123	-> 1064
/*     */     //   #147	-> 1067
/*     */     //   #117	-> 1070
/*     */     //   #148	-> 1073
/*     */     //   #110	-> 1076
/*     */     //   #149	-> 1079
/*     */     //   #47	-> 1080
/*     */     //   #58	-> 1146
/*     */     //   #97	-> 1147
/*     */     //   #96	-> 1152
/*     */     //   #150	-> 1153
/*     */     //   #75	-> 1159
/*     */     //   #151	-> 1162
/*     */     //   #69	-> 1164
/*     */     //   #152	-> 1167
/*     */     //   #61	-> 1169
/*     */     //   #153	-> 1172
/*     */     //   #59	-> 1185
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   486	10	36	$i$a$-cache-TextContainerKt$TextContainer$2$tooLong$2	I
/*     */     //   498	11	36	value$iv	Ljava/lang/Object;
/*     */     //   472	43	35	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   469	46	34	it$iv	Ljava/lang/Object;
/*     */     //   460	57	33	$i$f$cache	I
/*     */     //   457	60	31	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   457	60	32	invalid$iv	Z
/*     */     //   580	10	39	$i$a$-cache-TextContainerKt$TextContainer$2$expanded$2	I
/*     */     //   592	11	39	value$iv	Ljava/lang/Object;
/*     */     //   566	43	36	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   563	46	35	it$iv	Ljava/lang/Object;
/*     */     //   554	57	34	$i$f$cache	I
/*     */     //   551	60	32	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   551	60	33	invalid$iv	Z
/*     */     //   1014	36	60	$i$a$-Box-TextContainerKt$TextContainer$2$1	I
/*     */     //   1011	39	59	$this$TextContainer_u24lambda_u248_u24lambda_u247	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1011	39	58	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1011	39	57	$changed	I
/*     */     //   975	80	56	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   972	83	55	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   972	83	54	$changed$iv	I
/*     */     //   886	55	53	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   883	58	52	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   879	64	51	$i$f$set-impl	I
/*     */     //   876	67	50	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   842	115	49	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   839	118	48	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   771	297	47	$i$f$ReusableComposeNode	I
/*     */     //   768	300	45	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   768	300	46	$changed$iv$iv$iv	I
/*     */     //   710	364	41	$i$f$Layout	I
/*     */     //   727	347	42	compositeKeyHash$iv$iv	I
/*     */     //   736	338	43	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   745	329	44	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   707	367	40	$changed$iv$iv	I
/*     */     //   666	414	36	$i$f$Box	I
/*     */     //   697	383	39	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   663	417	32	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   685	395	33	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   688	392	34	propagateMinConstraints$iv	Z
/*     */     //   663	417	35	$changed$iv	I
/*     */     //   440	707	30	$i$a$-Column-TextContainerKt$TextContainer$2	I
/*     */     //   533	614	38	tooLong$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   627	520	37	expanded$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   645	502	31	maxLines	I
/*     */     //   437	710	29	$this$TextContainer_u24lambda_u248	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   437	710	28	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   437	710	27	$changed	I
/*     */     //   403	749	26	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   400	752	25	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   400	752	24	$changed$iv	I
/*     */     //   315	55	23	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   312	58	22	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   308	64	21	$i$f$set-impl	I
/*     */     //   305	67	20	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   271	115	19	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   268	118	18	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   207	956	17	$i$f$ReusableComposeNode	I
/*     */     //   204	959	15	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   204	959	16	$changed$iv$iv$iv	I
/*     */     //   150	1018	11	$i$f$Layout	I
/*     */     //   165	1003	12	compositeKeyHash$iv$iv	I
/*     */     //   173	995	13	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   181	987	14	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   147	1021	10	$changed$iv$iv	I
/*     */     //   80	1093	8	$i$f$Column	I
/*     */     //   137	1036	9	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   96	1077	4	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   104	1069	5	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   112	1061	6	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   77	1096	7	$changed$iv	I
/*     */     //   17	1201	3	$dirty	I
/*     */     //   0	1218	0	text	Landroidx/compose/ui/text/AnnotatedString;
/*     */     //   0	1218	1	$composer	Landroidx/compose/runtime/Composer;
/* 155 */     //   0	1218	2	$changed	I } private static final void TextContainer$lambda$8$lambda$3(MutableState $tooLong$delegate, boolean <set-?>) { MutableState mutableState = $tooLong$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); } private static final boolean TextContainer$lambda$8$lambda$5(MutableState $expanded$delegate) { State state = (State)$expanded$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 157 */     return ((Boolean)state.getValue()).booleanValue(); } private static final void TextContainer$lambda$8$lambda$6(MutableState $expanded$delegate, boolean <set-?>) { MutableState mutableState = $expanded$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 158 */     mutableState.setValue(value$iv); }
/*     */ 
/*     */   
/*     */   private static final Unit TextContainer$lambda$0(String $text, int $$changed, Composer $composer, int $force) {
/*     */     TextContainer($text, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TextContainer$lambda$9(AnnotatedString $text, int $$changed, Composer $composer, int $force) {
/*     */     TextContainer($text, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nTextContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextContainer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/TextContainerKt$TextContainer$2$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,60:1\n1225#2,6:61\n*S KotlinDebug\n*F\n+ 1 TextContainer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/TextContainerKt$TextContainer$2$1$1\n*L\n39#1:61,6\n*E\n"})
/*     */   static final class TextContainerKt$TextContainer$2$1$1 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       // Byte code:
/*     */       //   0: iload_2
/*     */       //   1: iconst_3
/*     */       //   2: iand
/*     */       //   3: iconst_2
/*     */       //   4: if_icmpne -> 16
/*     */       //   7: aload_1
/*     */       //   8: invokeinterface getSkipping : ()Z
/*     */       //   13: ifne -> 259
/*     */       //   16: invokestatic isTraceInProgress : ()Z
/*     */       //   19: ifeq -> 31
/*     */       //   22: ldc -1097460697
/*     */       //   24: iload_2
/*     */       //   25: iconst_m1
/*     */       //   26: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.TextContainer.<anonymous>.<anonymous>.<anonymous> (TextContainer.kt:34)'
/*     */       //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   31: aload_1
/*     */       //   32: iconst_0
/*     */       //   33: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */       //   36: aload_1
/*     */       //   37: iconst_0
/*     */       //   38: invokevirtual getMessageFont : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/FontFamily;
/*     */       //   41: astore_3
/*     */       //   42: aload_1
/*     */       //   43: iconst_0
/*     */       //   44: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */       //   47: invokevirtual getBlockTextColor-0d7_KjU : ()J
/*     */       //   50: lstore #4
/*     */       //   52: getstatic androidx/compose/ui/text/style/TextOverflow.Companion : Landroidx/compose/ui/text/style/TextOverflow$Companion;
/*     */       //   55: invokevirtual getEllipsis-gIe3tQ8 : ()I
/*     */       //   58: istore #6
/*     */       //   60: aload_0
/*     */       //   61: getfield $text : Landroidx/compose/ui/text/AnnotatedString;
/*     */       //   64: aconst_null
/*     */       //   65: lload #4
/*     */       //   67: lconst_0
/*     */       //   68: aconst_null
/*     */       //   69: aconst_null
/*     */       //   70: aload_3
/*     */       //   71: lconst_0
/*     */       //   72: aconst_null
/*     */       //   73: iconst_0
/*     */       //   74: lconst_0
/*     */       //   75: iload #6
/*     */       //   77: iconst_0
/*     */       //   78: aload_0
/*     */       //   79: getfield $maxLines : I
/*     */       //   82: aconst_null
/*     */       //   83: aload_1
/*     */       //   84: ldc 687420552
/*     */       //   86: invokeinterface startReplaceGroup : (I)V
/*     */       //   91: aload_1
/*     */       //   92: astore #8
/*     */       //   94: iconst_0
/*     */       //   95: istore #9
/*     */       //   97: aload_0
/*     */       //   98: getfield $tooLong$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   101: astore #10
/*     */       //   103: iconst_0
/*     */       //   104: istore #11
/*     */       //   106: aload #8
/*     */       //   108: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   113: astore #12
/*     */       //   115: iconst_0
/*     */       //   116: istore #13
/*     */       //   118: aload #12
/*     */       //   120: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   123: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   126: if_acmpne -> 219
/*     */       //   129: astore #34
/*     */       //   131: istore #33
/*     */       //   133: istore #32
/*     */       //   135: istore #31
/*     */       //   137: lstore #29
/*     */       //   139: istore #28
/*     */       //   141: astore #27
/*     */       //   143: lstore #25
/*     */       //   145: astore #24
/*     */       //   147: astore #23
/*     */       //   149: astore #22
/*     */       //   151: lstore #20
/*     */       //   153: lstore #18
/*     */       //   155: astore #17
/*     */       //   157: astore #16
/*     */       //   159: iconst_0
/*     */       //   160: istore #14
/*     */       //   162: aload #10
/*     */       //   164: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */       //   169: astore #35
/*     */       //   171: aload #16
/*     */       //   173: aload #17
/*     */       //   175: lload #18
/*     */       //   177: lload #20
/*     */       //   179: aload #22
/*     */       //   181: aload #23
/*     */       //   183: aload #24
/*     */       //   185: lload #25
/*     */       //   187: aload #27
/*     */       //   189: iload #28
/*     */       //   191: lload #29
/*     */       //   193: iload #31
/*     */       //   195: iload #32
/*     */       //   197: iload #33
/*     */       //   199: aload #34
/*     */       //   201: aload #35
/*     */       //   203: astore #15
/*     */       //   205: aload #8
/*     */       //   207: aload #15
/*     */       //   209: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   214: aload #15
/*     */       //   216: goto -> 221
/*     */       //   219: aload #12
/*     */       //   221: nop
/*     */       //   222: nop
/*     */       //   223: nop
/*     */       //   224: checkcast kotlin/jvm/functions/Function1
/*     */       //   227: astore #7
/*     */       //   229: aload_1
/*     */       //   230: invokeinterface endReplaceGroup : ()V
/*     */       //   235: aload #7
/*     */       //   237: aconst_null
/*     */       //   238: aload_1
/*     */       //   239: iconst_0
/*     */       //   240: ldc 196656
/*     */       //   242: ldc 87994
/*     */       //   244: invokestatic Text-F-Jr8PA : (Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */       //   247: invokestatic isTraceInProgress : ()Z
/*     */       //   250: ifeq -> 265
/*     */       //   253: invokestatic traceEventEnd : ()V
/*     */       //   256: goto -> 265
/*     */       //   259: aload_1
/*     */       //   260: invokeinterface skipToGroupEnd : ()V
/*     */       //   265: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #35	-> 0
/*     */       //   #37	-> 33
/*     */       //   #38	-> 44
/*     */       //   #42	-> 52
/*     */       //   #36	-> 60
/*     */       //   #38	-> 65
/*     */       //   #37	-> 70
/*     */       //   #42	-> 75
/*     */       //   #43	-> 78
/*     */       //   #39	-> 97
/*     */       //   #61	-> 106
/*     */       //   #62	-> 118
/*     */       //   #63	-> 129
/*     */       //   #39	-> 162
/*     */       //   #63	-> 203
/*     */       //   #64	-> 205
/*     */       //   #65	-> 214
/*     */       //   #66	-> 219
/*     */       //   #62	-> 221
/*     */       //   #61	-> 222
/*     */       //   #61	-> 223
/*     */       //   #39	-> 224
/*     */       //   #35	-> 244
/*     */       //   #44	-> 259
/*     */       //   #45	-> 265
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   162	7	14	$i$a$-cache-TextContainerKt$TextContainer$2$1$1$1	I
/*     */       //   205	11	15	value$iv	Ljava/lang/Object;
/*     */       //   118	104	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   115	107	12	it$iv	Ljava/lang/Object;
/*     */       //   106	118	11	$i$f$cache	I
/*     */       //   103	121	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   103	121	9	invalid$iv	Z
/*     */       //   0	266	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/TextContainerKt$TextContainer$2$1$1;
/*     */       //   0	266	1	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	266	2	$changed	I
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$1$lambda$0(MutableState $tooLong$delegate, TextLayoutResult textLayoutResult) {
/*     */       Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
/*     */       TextContainerKt.TextContainer$lambda$8$lambda$3($tooLong$delegate, textLayoutResult.getHasVisualOverflow());
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     TextContainerKt$TextContainer$2$1$1(AnnotatedString $text, int $maxLines, MutableState<Boolean> $tooLong$delegate) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nTextContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextContainer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/TextContainerKt$TextContainer$2$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,60:1\n77#2:61\n149#3:62\n1225#4,6:63\n*S KotlinDebug\n*F\n+ 1 TextContainer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/TextContainerKt$TextContainer$2$2\n*L\n51#1:61\n54#1:62\n55#1:63,6\n*E\n"})
/*     */   static final class TextContainerKt$TextContainer$2$2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "$this$AnimatedVisibility");
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventStart(-538592296, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.TextContainer.<anonymous>.<anonymous> (TextContainer.kt:47)"); 
/*     */       String str1 = TextContainerKt.TextContainer$lambda$8$lambda$5(this.$expanded$delegate) ? "Click to collapse" : "Click to expand";
/*     */       FontFamily fontFamily = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getMessageFont($composer, 0);
/*     */       CompositionLocal compositionLocal = (CompositionLocal)LinkStylingKt.getLocalLinkStyle();
/*     */       int $changed$iv = 0, $i$f$getCurrent = 0;
/*     */       ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
/*     */       Object object1 = $composer.consume(compositionLocal);
/*     */       ComposerKt.sourceInformationMarkerEnd($composer);
/*     */       long l = ((LinkStyle)object1).getColors().getContent-0d7_KjU();
/*     */       int $this$dp$iv = 6, $i$f$getDp = 0;
/*     */       $composer.startReplaceGroup(332243911);
/*     */       Composer composer = $composer;
/*     */       boolean bool1 = false;
/*     */       MutableState<Boolean> mutableState = this.$expanded$delegate;
/*     */       int $i$f$cache = 0;
/*     */       Object it$iv = composer.rememberedValue();
/*     */       int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */       Role role = null;
/*     */       String str2 = null;
/*     */       boolean bool2 = false;
/*     */       Modifier modifier2 = PaddingKt.padding-VpY3zN4$default((Modifier)Modifier.Companion, 0.0F, Dp.constructor-impl($this$dp$iv), 1, null);
/*     */       int $i$a$-cache-TextContainerKt$TextContainer$2$2$1 = 0;
/*     */       Function0 function02 = mutableState::invoke$lambda$1$lambda$0;
/*     */       Object value$iv = function02;
/*     */       composer.updateRememberedValue(value$iv);
/*     */       Function0 function01 = (it$iv == Composer.Companion.getEmpty()) ? (Function0)value$iv : (Function0)it$iv;
/*     */       $composer.endReplaceGroup();
/*     */       Modifier modifier1 = ClickableKt.clickable-XHw0xAI$default(modifier2, bool2, str2, role, function01, 7, null);
/*     */       TextKt.Text-bAzTDeA(str1, modifier1, l, 0L, null, null, fontFamily, 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65464);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd(); 
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$1$lambda$0(MutableState $expanded$delegate) {
/*     */       TextContainerKt.TextContainer$lambda$8$lambda$6($expanded$delegate, !TextContainerKt.TextContainer$lambda$8$lambda$5($expanded$delegate));
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     TextContainerKt$TextContainer$2$2(MutableState<Boolean> $expanded$delegate) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\TextContainerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */