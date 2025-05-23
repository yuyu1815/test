/*    */ package org.jetbrains.jewel.bridge.actionSystem;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableInferredTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.DisposableEffectResult;
/*    */ import androidx.compose.runtime.DisposableEffectScope;
/*    */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.bridge.JewelComposePanel;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\0322\020\000\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\021\020\006\032\r\022\004\022\0020\0010\007¢\006\002\b\bH\001¢\006\002\020\t¨\006\n"}, d2 = {"ComponentDataProviderBridge", "", "component", "Lorg/jetbrains/jewel/bridge/JewelComposePanel;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lorg/jetbrains/jewel/bridge/JewelComposePanel;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ide-laf-bridge"})
/*    */ @SourceDebugExtension({"SMAP\nComponentDataProviderBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentDataProviderBridge.kt\norg/jetbrains/jewel/bridge/actionSystem/ComponentDataProviderBridgeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,31:1\n1225#2,6:32\n1225#2,6:78\n71#3:38\n68#3,6:39\n74#3:73\n78#3:77\n79#4,6:45\n86#4,4:60\n90#4,2:70\n94#4:76\n368#5,9:51\n377#5:72\n378#5,2:74\n4034#6,6:64\n63#7,5:84\n*S KotlinDebug\n*F\n+ 1 ComponentDataProviderBridge.kt\norg/jetbrains/jewel/bridge/actionSystem/ComponentDataProviderBridgeKt\n*L\n17#1:32,6\n21#1:78,6\n19#1:38\n19#1:39,6\n19#1:73\n19#1:77\n19#1:45,6\n19#1:60,4\n19#1:70,2\n19#1:76\n19#1:51,9\n19#1:72\n19#1:74,2\n19#1:64,6\n24#1:84,5\n*E\n"})
/*    */ public final class ComponentDataProviderBridgeKt {
/*    */   private static final DisposableEffectResult ComponentDataProviderBridge$lambda$4$lambda$3(JewelComposePanel $component, RootDataProviderModifier $rootDataProviderModifier, DisposableEffectScope $this$DisposableEffect) {
/* 22 */     Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect"); $component.setTargetProvider$ide_laf_bridge($rootDataProviderModifier);
/*    */     
/* 24 */     DisposableEffectScope this_$iv = $this$DisposableEffect; int $i$f$onDispose = 0;
/*    */ 
/*    */ 
/*    */     
/* 28 */     return 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 84 */       new ComponentDataProviderBridgeKt$ComponentDataProviderBridge$lambda$4$lambda$3$$inlined$onDispose$1($component, $rootDataProviderModifier);
/*    */   }
/*    */   
/*    */   @Composable
/*    */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*    */   public static final void ComponentDataProviderBridge(@NotNull JewelComposePanel component, @Nullable Modifier modifier, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'component'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'content'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_3
/*    */     //   13: ldc 1486674320
/*    */     //   15: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   20: astore_3
/*    */     //   21: iload #4
/*    */     //   23: istore #6
/*    */     //   25: iload #5
/*    */     //   27: iconst_1
/*    */     //   28: iand
/*    */     //   29: ifeq -> 42
/*    */     //   32: iload #6
/*    */     //   34: bipush #6
/*    */     //   36: ior
/*    */     //   37: istore #6
/*    */     //   39: goto -> 70
/*    */     //   42: iload #4
/*    */     //   44: bipush #6
/*    */     //   46: iand
/*    */     //   47: ifne -> 70
/*    */     //   50: iload #6
/*    */     //   52: aload_3
/*    */     //   53: aload_0
/*    */     //   54: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   59: ifeq -> 66
/*    */     //   62: iconst_4
/*    */     //   63: goto -> 67
/*    */     //   66: iconst_2
/*    */     //   67: ior
/*    */     //   68: istore #6
/*    */     //   70: iload #5
/*    */     //   72: iconst_2
/*    */     //   73: iand
/*    */     //   74: ifeq -> 87
/*    */     //   77: iload #6
/*    */     //   79: bipush #48
/*    */     //   81: ior
/*    */     //   82: istore #6
/*    */     //   84: goto -> 117
/*    */     //   87: iload #4
/*    */     //   89: bipush #48
/*    */     //   91: iand
/*    */     //   92: ifne -> 117
/*    */     //   95: iload #6
/*    */     //   97: aload_3
/*    */     //   98: aload_1
/*    */     //   99: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   104: ifeq -> 112
/*    */     //   107: bipush #32
/*    */     //   109: goto -> 114
/*    */     //   112: bipush #16
/*    */     //   114: ior
/*    */     //   115: istore #6
/*    */     //   117: iload #5
/*    */     //   119: iconst_4
/*    */     //   120: iand
/*    */     //   121: ifeq -> 135
/*    */     //   124: iload #6
/*    */     //   126: sipush #384
/*    */     //   129: ior
/*    */     //   130: istore #6
/*    */     //   132: goto -> 168
/*    */     //   135: iload #4
/*    */     //   137: sipush #384
/*    */     //   140: iand
/*    */     //   141: ifne -> 168
/*    */     //   144: iload #6
/*    */     //   146: aload_3
/*    */     //   147: aload_2
/*    */     //   148: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   153: ifeq -> 162
/*    */     //   156: sipush #256
/*    */     //   159: goto -> 165
/*    */     //   162: sipush #128
/*    */     //   165: ior
/*    */     //   166: istore #6
/*    */     //   168: iload #6
/*    */     //   170: sipush #147
/*    */     //   173: iand
/*    */     //   174: sipush #146
/*    */     //   177: if_icmpne -> 189
/*    */     //   180: aload_3
/*    */     //   181: invokeinterface getSkipping : ()Z
/*    */     //   186: ifne -> 831
/*    */     //   189: iload #5
/*    */     //   191: iconst_2
/*    */     //   192: iand
/*    */     //   193: ifeq -> 203
/*    */     //   196: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   199: checkcast androidx/compose/ui/Modifier
/*    */     //   202: astore_1
/*    */     //   203: invokestatic isTraceInProgress : ()Z
/*    */     //   206: ifeq -> 219
/*    */     //   209: ldc 1486674320
/*    */     //   211: iload #6
/*    */     //   213: iconst_m1
/*    */     //   214: ldc 'org.jetbrains.jewel.bridge.actionSystem.ComponentDataProviderBridge (ComponentDataProviderBridge.kt:15)'
/*    */     //   216: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   219: aload_3
/*    */     //   220: ldc -1271355753
/*    */     //   222: invokeinterface startReplaceGroup : (I)V
/*    */     //   227: aload_3
/*    */     //   228: astore #9
/*    */     //   230: iconst_0
/*    */     //   231: istore #10
/*    */     //   233: nop
/*    */     //   234: iconst_0
/*    */     //   235: istore #11
/*    */     //   237: aload #9
/*    */     //   239: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   244: astore #12
/*    */     //   246: iconst_0
/*    */     //   247: istore #13
/*    */     //   249: aload #12
/*    */     //   251: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   254: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   257: if_acmpne -> 286
/*    */     //   260: iconst_0
/*    */     //   261: istore #14
/*    */     //   263: new org/jetbrains/jewel/bridge/actionSystem/RootDataProviderModifier
/*    */     //   266: dup
/*    */     //   267: invokespecial <init> : ()V
/*    */     //   270: astore #14
/*    */     //   272: aload #9
/*    */     //   274: aload #14
/*    */     //   276: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   281: aload #14
/*    */     //   283: goto -> 288
/*    */     //   286: aload #12
/*    */     //   288: nop
/*    */     //   289: nop
/*    */     //   290: nop
/*    */     //   291: checkcast org/jetbrains/jewel/bridge/actionSystem/RootDataProviderModifier
/*    */     //   294: astore #8
/*    */     //   296: aload_3
/*    */     //   297: invokeinterface endReplaceGroup : ()V
/*    */     //   302: aload #8
/*    */     //   304: astore #7
/*    */     //   306: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   309: aload #7
/*    */     //   311: checkcast androidx/compose/ui/Modifier
/*    */     //   314: invokevirtual then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   317: aload_1
/*    */     //   318: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   323: astore #8
/*    */     //   325: iconst_0
/*    */     //   326: istore #11
/*    */     //   328: iconst_0
/*    */     //   329: istore #12
/*    */     //   331: aload_3
/*    */     //   332: ldc 733328855
/*    */     //   334: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*    */     //   336: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   339: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   342: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*    */     //   345: astore #9
/*    */     //   347: iconst_0
/*    */     //   348: istore #10
/*    */     //   350: aload #9
/*    */     //   352: iload #10
/*    */     //   354: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   357: astore #13
/*    */     //   359: bipush #112
/*    */     //   361: iload #11
/*    */     //   363: iconst_3
/*    */     //   364: ishl
/*    */     //   365: iand
/*    */     //   366: istore #14
/*    */     //   368: nop
/*    */     //   369: iconst_0
/*    */     //   370: istore #15
/*    */     //   372: aload_3
/*    */     //   373: ldc -1323940314
/*    */     //   375: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   377: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   380: aload_3
/*    */     //   381: iconst_0
/*    */     //   382: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   385: istore #16
/*    */     //   387: aload_3
/*    */     //   388: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   393: astore #17
/*    */     //   395: aload_3
/*    */     //   396: aload #8
/*    */     //   398: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   401: astore #18
/*    */     //   403: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   406: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   409: astore #19
/*    */     //   411: bipush #6
/*    */     //   413: sipush #896
/*    */     //   416: iload #14
/*    */     //   418: bipush #6
/*    */     //   420: ishl
/*    */     //   421: iand
/*    */     //   422: ior
/*    */     //   423: istore #20
/*    */     //   425: nop
/*    */     //   426: iconst_0
/*    */     //   427: istore #21
/*    */     //   429: aload_3
/*    */     //   430: ldc -692256719
/*    */     //   432: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   434: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   437: aload_3
/*    */     //   438: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   443: instanceof androidx/compose/runtime/Applier
/*    */     //   446: ifne -> 452
/*    */     //   449: invokestatic invalidApplier : ()V
/*    */     //   452: aload_3
/*    */     //   453: invokeinterface startReusableNode : ()V
/*    */     //   458: aload_3
/*    */     //   459: invokeinterface getInserting : ()Z
/*    */     //   464: ifeq -> 478
/*    */     //   467: aload_3
/*    */     //   468: aload #19
/*    */     //   470: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   475: goto -> 484
/*    */     //   478: aload_3
/*    */     //   479: invokeinterface useNode : ()V
/*    */     //   484: aload_3
/*    */     //   485: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   488: astore #22
/*    */     //   490: iconst_0
/*    */     //   491: istore #23
/*    */     //   493: aload #22
/*    */     //   495: aload #13
/*    */     //   497: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   500: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   503: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   506: aload #22
/*    */     //   508: aload #17
/*    */     //   510: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   513: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   516: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   519: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   522: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   525: astore #24
/*    */     //   527: iconst_0
/*    */     //   528: istore #25
/*    */     //   530: aload #22
/*    */     //   532: astore #26
/*    */     //   534: iconst_0
/*    */     //   535: istore #27
/*    */     //   537: aload #26
/*    */     //   539: invokeinterface getInserting : ()Z
/*    */     //   544: ifne -> 565
/*    */     //   547: aload #26
/*    */     //   549: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   554: iload #16
/*    */     //   556: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   559: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   562: ifne -> 591
/*    */     //   565: aload #26
/*    */     //   567: iload #16
/*    */     //   569: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   572: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   577: aload #22
/*    */     //   579: iload #16
/*    */     //   581: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   584: aload #24
/*    */     //   586: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   591: nop
/*    */     //   592: nop
/*    */     //   593: nop
/*    */     //   594: aload #22
/*    */     //   596: aload #18
/*    */     //   598: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   601: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   604: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   607: nop
/*    */     //   608: nop
/*    */     //   609: aload_3
/*    */     //   610: bipush #14
/*    */     //   612: iload #20
/*    */     //   614: bipush #6
/*    */     //   616: ishr
/*    */     //   617: iand
/*    */     //   618: istore #28
/*    */     //   620: astore #29
/*    */     //   622: iconst_0
/*    */     //   623: istore #30
/*    */     //   625: aload #29
/*    */     //   627: ldc -2146769399
/*    */     //   629: ldc 'C73@3429L9:Box.kt#2w3rfo'
/*    */     //   631: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   634: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*    */     //   637: aload #29
/*    */     //   639: bipush #6
/*    */     //   641: bipush #112
/*    */     //   643: iload #11
/*    */     //   645: bipush #6
/*    */     //   647: ishr
/*    */     //   648: iand
/*    */     //   649: ior
/*    */     //   650: istore #31
/*    */     //   652: astore #32
/*    */     //   654: checkcast androidx/compose/foundation/layout/BoxScope
/*    */     //   657: astore #33
/*    */     //   659: iconst_0
/*    */     //   660: istore #34
/*    */     //   662: aload_2
/*    */     //   663: aload #32
/*    */     //   665: bipush #14
/*    */     //   667: iload #6
/*    */     //   669: bipush #6
/*    */     //   671: ishr
/*    */     //   672: iand
/*    */     //   673: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   676: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   681: pop
/*    */     //   682: aload #29
/*    */     //   684: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   687: aload_3
/*    */     //   688: invokeinterface endNode : ()V
/*    */     //   693: aload_3
/*    */     //   694: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   697: nop
/*    */     //   698: aload_3
/*    */     //   699: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   702: nop
/*    */     //   703: aload_3
/*    */     //   704: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   707: nop
/*    */     //   708: aload_0
/*    */     //   709: aload_3
/*    */     //   710: ldc -1271350344
/*    */     //   712: invokeinterface startReplaceGroup : (I)V
/*    */     //   717: aload_3
/*    */     //   718: astore #9
/*    */     //   720: aload_3
/*    */     //   721: aload_0
/*    */     //   722: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   727: istore #10
/*    */     //   729: iconst_0
/*    */     //   730: istore #11
/*    */     //   732: aload #9
/*    */     //   734: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   739: astore #12
/*    */     //   741: iconst_0
/*    */     //   742: istore #13
/*    */     //   744: iload #10
/*    */     //   746: ifne -> 760
/*    */     //   749: aload #12
/*    */     //   751: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   754: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   757: if_acmpne -> 792
/*    */     //   760: astore #35
/*    */     //   762: iconst_0
/*    */     //   763: istore #14
/*    */     //   765: aload_0
/*    */     //   766: aload #7
/*    */     //   768: <illegal opcode> invoke : (Lorg/jetbrains/jewel/bridge/JewelComposePanel;Lorg/jetbrains/jewel/bridge/actionSystem/RootDataProviderModifier;)Lkotlin/jvm/functions/Function1;
/*    */     //   773: aload #35
/*    */     //   775: swap
/*    */     //   776: astore #15
/*    */     //   778: aload #9
/*    */     //   780: aload #15
/*    */     //   782: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   787: aload #15
/*    */     //   789: goto -> 794
/*    */     //   792: aload #12
/*    */     //   794: nop
/*    */     //   795: nop
/*    */     //   796: nop
/*    */     //   797: checkcast kotlin/jvm/functions/Function1
/*    */     //   800: astore #8
/*    */     //   802: aload_3
/*    */     //   803: invokeinterface endReplaceGroup : ()V
/*    */     //   808: aload #8
/*    */     //   810: aload_3
/*    */     //   811: bipush #14
/*    */     //   813: iload #6
/*    */     //   815: iand
/*    */     //   816: invokestatic DisposableEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*    */     //   819: invokestatic isTraceInProgress : ()Z
/*    */     //   822: ifeq -> 837
/*    */     //   825: invokestatic traceEventEnd : ()V
/*    */     //   828: goto -> 837
/*    */     //   831: aload_3
/*    */     //   832: invokeinterface skipToGroupEnd : ()V
/*    */     //   837: aload_3
/*    */     //   838: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   843: dup
/*    */     //   844: ifnull -> 867
/*    */     //   847: aload_0
/*    */     //   848: aload_1
/*    */     //   849: aload_2
/*    */     //   850: iload #4
/*    */     //   852: iload #5
/*    */     //   854: <illegal opcode> invoke : (Lorg/jetbrains/jewel/bridge/JewelComposePanel;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*    */     //   859: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   864: goto -> 868
/*    */     //   867: pop
/*    */     //   868: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 12
/*    */     //   #14	-> 196
/*    */     //   #16	-> 216
/*    */     //   #17	-> 233
/*    */     //   #32	-> 237
/*    */     //   #33	-> 249
/*    */     //   #34	-> 260
/*    */     //   #17	-> 263
/*    */     //   #34	-> 270
/*    */     //   #35	-> 272
/*    */     //   #36	-> 281
/*    */     //   #37	-> 286
/*    */     //   #33	-> 288
/*    */     //   #32	-> 289
/*    */     //   #32	-> 290
/*    */     //   #17	-> 291
/*    */     //   #19	-> 306
/*    */     //   #38	-> 336
/*    */     //   #39	-> 339
/*    */     //   #40	-> 347
/*    */     //   #43	-> 350
/*    */     //   #44	-> 368
/*    */     //   #45	-> 377
/*    */     //   #46	-> 382
/*    */     //   #47	-> 388
/*    */     //   #48	-> 396
/*    */     //   #50	-> 403
/*    */     //   #49	-> 425
/*    */     //   #51	-> 434
/*    */     //   #52	-> 437
/*    */     //   #53	-> 453
/*    */     //   #54	-> 458
/*    */     //   #55	-> 468
/*    */     //   #57	-> 479
/*    */     //   #59	-> 484
/*    */     //   #60	-> 493
/*    */     //   #61	-> 506
/*    */     //   #63	-> 519
/*    */     //   #64	-> 530
/*    */     //   #65	-> 537
/*    */     //   #66	-> 565
/*    */     //   #67	-> 577
/*    */     //   #69	-> 591
/*    */     //   #64	-> 592
/*    */     //   #69	-> 593
/*    */     //   #70	-> 594
/*    */     //   #71	-> 607
/*    */     //   #59	-> 608
/*    */     //   #72	-> 609
/*    */     //   #73	-> 631
/*    */     //   #19	-> 662
/*    */     //   #73	-> 682
/*    */     //   #72	-> 687
/*    */     //   #74	-> 688
/*    */     //   #51	-> 694
/*    */     //   #75	-> 697
/*    */     //   #45	-> 699
/*    */     //   #76	-> 702
/*    */     //   #38	-> 704
/*    */     //   #77	-> 707
/*    */     //   #21	-> 708
/*    */     //   #78	-> 732
/*    */     //   #79	-> 744
/*    */     //   #80	-> 760
/*    */     //   #21	-> 765
/*    */     //   #80	-> 776
/*    */     //   #81	-> 778
/*    */     //   #82	-> 787
/*    */     //   #83	-> 792
/*    */     //   #79	-> 794
/*    */     //   #78	-> 795
/*    */     //   #78	-> 796
/*    */     //   #21	-> 797
/*    */     //   #30	-> 831
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   263	7	14	$i$a$-cache-ComponentDataProviderBridgeKt$ComponentDataProviderBridge$rootDataProviderModifier$1	I
/*    */     //   272	11	14	value$iv	Ljava/lang/Object;
/*    */     //   249	40	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   246	43	12	it$iv	Ljava/lang/Object;
/*    */     //   237	54	11	$i$f$cache	I
/*    */     //   234	57	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   234	57	10	invalid$iv	Z
/*    */     //   662	20	34	$i$a$-Box-ComponentDataProviderBridgeKt$ComponentDataProviderBridge$1	I
/*    */     //   659	23	33	$this$ComponentDataProviderBridge_u24lambda_u241	Landroidx/compose/foundation/layout/BoxScope;
/*    */     //   659	23	32	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   659	23	31	$changed	I
/*    */     //   625	62	30	$i$a$-Layout-BoxKt$Box$1$iv	I
/*    */     //   622	65	29	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   622	65	28	$changed$iv	I
/*    */     //   537	55	27	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   534	58	26	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   530	64	25	$i$f$set-impl	I
/*    */     //   527	67	24	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   493	115	23	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   490	118	22	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   429	269	21	$i$f$ReusableComposeNode	I
/*    */     //   426	272	19	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   426	272	20	$changed$iv$iv$iv	I
/*    */     //   372	331	15	$i$f$Layout	I
/*    */     //   387	316	16	compositeKeyHash$iv$iv	I
/*    */     //   395	308	17	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   403	300	18	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   369	334	14	$changed$iv$iv	I
/*    */     //   331	377	12	$i$f$Box	I
/*    */     //   359	349	13	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   328	380	8	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   347	361	9	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*    */     //   350	358	10	propagateMinConstraints$iv	Z
/*    */     //   328	380	11	$changed$iv	I
/*    */     //   765	8	14	$i$a$-cache-ComponentDataProviderBridgeKt$ComponentDataProviderBridge$2	I
/*    */     //   778	11	15	value$iv	Ljava/lang/Object;
/*    */     //   744	51	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   741	54	12	it$iv	Ljava/lang/Object;
/*    */     //   732	65	11	$i$f$cache	I
/*    */     //   729	68	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   729	68	10	invalid$iv	Z
/*    */     //   306	522	7	rootDataProviderModifier	Lorg/jetbrains/jewel/bridge/actionSystem/RootDataProviderModifier;
/*    */     //   25	844	6	$dirty	I
/*    */     //   0	869	0	component	Lorg/jetbrains/jewel/bridge/JewelComposePanel;
/*    */     //   0	869	1	modifier	Landroidx/compose/ui/Modifier;
/*    */     //   0	869	2	content	Lkotlin/jvm/functions/Function2;
/*    */     //   0	869	3	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	869	4	$changed	I
/*    */   }
/*    */   
/*    */   private static final Unit ComponentDataProviderBridge$lambda$5(JewelComposePanel $component, Modifier $modifier, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*    */     ComponentDataProviderBridge($component, $modifier, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\actionSystem\ComponentDataProviderBridgeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */