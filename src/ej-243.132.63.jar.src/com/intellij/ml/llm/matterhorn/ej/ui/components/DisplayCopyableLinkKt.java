/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ 
/*    */ import androidx.compose.foundation.layout.Arrangement;
/*    */ import androidx.compose.foundation.layout.BoxScope;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.runtime.State;
/*    */ import androidx.compose.runtime.Updater;
/*    */ import androidx.compose.ui.Alignment;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.layout.MeasurePolicy;
/*    */ import androidx.compose.ui.node.ComposeUiNode;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*    */ import kotlin.Unit;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\020\002\n\000\n\002\020\016\n\002\b\003\n\002\020\013\032\025\020\000\032\0020\0012\006\020\002\032\0020\003H\001¢\006\002\020\004¨\006\005²\006\n\020\006\032\0020\007X\002"}, d2 = {"DisplayCopyableLink", "", "link", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ej-ui", "copiedToClipboard", ""})
/*    */ @SourceDebugExtension({"SMAP\nDisplayCopyableLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisplayCopyableLink.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/DisplayCopyableLinkKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,54:1\n1225#2,6:55\n1225#2,6:61\n81#3:67\n107#3,2:68\n*S KotlinDebug\n*F\n+ 1 DisplayCopyableLink.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/DisplayCopyableLinkKt\n*L\n26#1:55,6\n29#1:61,6\n26#1:67\n26#1:68,2\n*E\n"})
/*    */ public final class DisplayCopyableLinkKt {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void DisplayCopyableLink(@NotNull String link, @Nullable Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'link'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc -1640147078
/*    */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   14: astore_1
/*    */     //   15: iload_2
/*    */     //   16: istore_3
/*    */     //   17: iload_2
/*    */     //   18: bipush #6
/*    */     //   20: iand
/*    */     //   21: ifne -> 42
/*    */     //   24: iload_3
/*    */     //   25: aload_1
/*    */     //   26: aload_0
/*    */     //   27: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   32: ifeq -> 39
/*    */     //   35: iconst_4
/*    */     //   36: goto -> 40
/*    */     //   39: iconst_2
/*    */     //   40: ior
/*    */     //   41: istore_3
/*    */     //   42: iload_3
/*    */     //   43: iconst_3
/*    */     //   44: iand
/*    */     //   45: iconst_2
/*    */     //   46: if_icmpne -> 58
/*    */     //   49: aload_1
/*    */     //   50: invokeinterface getSkipping : ()Z
/*    */     //   55: ifne -> 311
/*    */     //   58: invokestatic isTraceInProgress : ()Z
/*    */     //   61: ifeq -> 73
/*    */     //   64: ldc -1640147078
/*    */     //   66: iload_3
/*    */     //   67: iconst_m1
/*    */     //   68: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.DisplayCopyableLink (DisplayCopyableLink.kt:24)'
/*    */     //   70: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   73: aload_1
/*    */     //   74: ldc 168996234
/*    */     //   76: invokeinterface startReplaceGroup : (I)V
/*    */     //   81: aload_1
/*    */     //   82: astore #6
/*    */     //   84: iconst_0
/*    */     //   85: istore #7
/*    */     //   87: nop
/*    */     //   88: iconst_0
/*    */     //   89: istore #8
/*    */     //   91: aload #6
/*    */     //   93: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   98: astore #9
/*    */     //   100: iconst_0
/*    */     //   101: istore #10
/*    */     //   103: aload #9
/*    */     //   105: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   108: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   111: if_acmpne -> 143
/*    */     //   114: iconst_0
/*    */     //   115: istore #11
/*    */     //   117: iconst_0
/*    */     //   118: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */     //   121: aconst_null
/*    */     //   122: iconst_2
/*    */     //   123: aconst_null
/*    */     //   124: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*    */     //   127: astore #11
/*    */     //   129: aload #6
/*    */     //   131: aload #11
/*    */     //   133: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   138: aload #11
/*    */     //   140: goto -> 145
/*    */     //   143: aload #9
/*    */     //   145: nop
/*    */     //   146: nop
/*    */     //   147: nop
/*    */     //   148: checkcast androidx/compose/runtime/MutableState
/*    */     //   151: astore #5
/*    */     //   153: aload_1
/*    */     //   154: invokeinterface endReplaceGroup : ()V
/*    */     //   159: aload #5
/*    */     //   161: astore #4
/*    */     //   163: aload_1
/*    */     //   164: ldc 168998608
/*    */     //   166: invokeinterface startReplaceGroup : (I)V
/*    */     //   171: aload_1
/*    */     //   172: astore #6
/*    */     //   174: iload_3
/*    */     //   175: bipush #14
/*    */     //   177: iand
/*    */     //   178: iconst_4
/*    */     //   179: if_icmpne -> 186
/*    */     //   182: iconst_1
/*    */     //   183: goto -> 187
/*    */     //   186: iconst_0
/*    */     //   187: istore #7
/*    */     //   189: nop
/*    */     //   190: iconst_0
/*    */     //   191: istore #8
/*    */     //   193: aload #6
/*    */     //   195: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   200: astore #9
/*    */     //   202: iconst_0
/*    */     //   203: istore #10
/*    */     //   205: iload #7
/*    */     //   207: ifne -> 221
/*    */     //   210: aload #9
/*    */     //   212: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   215: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   218: if_acmpne -> 248
/*    */     //   221: iconst_0
/*    */     //   222: istore #11
/*    */     //   224: aload_0
/*    */     //   225: aload #4
/*    */     //   227: <illegal opcode> invoke : (Ljava/lang/String;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*    */     //   232: astore #12
/*    */     //   234: aload #6
/*    */     //   236: aload #12
/*    */     //   238: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   243: aload #12
/*    */     //   245: goto -> 250
/*    */     //   248: aload #9
/*    */     //   250: nop
/*    */     //   251: nop
/*    */     //   252: nop
/*    */     //   253: checkcast kotlin/jvm/functions/Function0
/*    */     //   256: astore #5
/*    */     //   258: aload_1
/*    */     //   259: invokeinterface endReplaceGroup : ()V
/*    */     //   264: aload #5
/*    */     //   266: lconst_0
/*    */     //   267: lconst_0
/*    */     //   268: ldc 255288772
/*    */     //   270: iconst_1
/*    */     //   271: new com/intellij/ml/llm/matterhorn/ej/ui/components/DisplayCopyableLinkKt$DisplayCopyableLink$2
/*    */     //   274: dup
/*    */     //   275: aload_0
/*    */     //   276: aload #4
/*    */     //   278: invokespecial <init> : (Ljava/lang/String;Landroidx/compose/runtime/MutableState;)V
/*    */     //   281: aload_1
/*    */     //   282: bipush #54
/*    */     //   284: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   287: checkcast kotlin/jvm/functions/Function3
/*    */     //   290: aload_1
/*    */     //   291: sipush #3072
/*    */     //   294: bipush #6
/*    */     //   296: invokestatic JunieHoverableChip-eopBjH0 : (Lkotlin/jvm/functions/Function0;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*    */     //   299: invokestatic isTraceInProgress : ()Z
/*    */     //   302: ifeq -> 317
/*    */     //   305: invokestatic traceEventEnd : ()V
/*    */     //   308: goto -> 317
/*    */     //   311: aload_1
/*    */     //   312: invokeinterface skipToGroupEnd : ()V
/*    */     //   317: aload_1
/*    */     //   318: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   323: dup
/*    */     //   324: ifnull -> 342
/*    */     //   327: aload_0
/*    */     //   328: iload_2
/*    */     //   329: <illegal opcode> invoke : (Ljava/lang/String;I)Lkotlin/jvm/functions/Function2;
/*    */     //   334: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   339: goto -> 343
/*    */     //   342: pop
/*    */     //   343: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #25	-> 6
/*    */     //   #26	-> 87
/*    */     //   #55	-> 91
/*    */     //   #56	-> 103
/*    */     //   #57	-> 114
/*    */     //   #26	-> 117
/*    */     //   #57	-> 127
/*    */     //   #58	-> 129
/*    */     //   #59	-> 138
/*    */     //   #60	-> 143
/*    */     //   #56	-> 145
/*    */     //   #55	-> 146
/*    */     //   #55	-> 147
/*    */     //   #26	-> 148
/*    */     //   #29	-> 189
/*    */     //   #61	-> 193
/*    */     //   #62	-> 205
/*    */     //   #63	-> 221
/*    */     //   #29	-> 224
/*    */     //   #63	-> 232
/*    */     //   #64	-> 234
/*    */     //   #65	-> 243
/*    */     //   #66	-> 248
/*    */     //   #62	-> 250
/*    */     //   #61	-> 251
/*    */     //   #61	-> 252
/*    */     //   #29	-> 253
/*    */     //   #34	-> 268
/*    */     //   #28	-> 296
/*    */     //   #53	-> 311
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   117	10	11	$i$a$-cache-DisplayCopyableLinkKt$DisplayCopyableLink$copiedToClipboard$2	I
/*    */     //   129	11	11	value$iv	Ljava/lang/Object;
/*    */     //   103	43	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   100	46	9	it$iv	Ljava/lang/Object;
/*    */     //   91	57	8	$i$f$cache	I
/*    */     //   88	60	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   88	60	7	invalid$iv	Z
/*    */     //   224	8	11	$i$a$-cache-DisplayCopyableLinkKt$DisplayCopyableLink$1	I
/*    */     //   234	11	12	value$iv	Ljava/lang/Object;
/*    */     //   205	46	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   202	49	9	it$iv	Ljava/lang/Object;
/*    */     //   193	60	8	$i$f$cache	I
/*    */     //   190	63	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   190	63	7	invalid$iv	Z
/*    */     //   163	145	4	copiedToClipboard$delegate	Landroidx/compose/runtime/MutableState;
/*    */     //   17	327	3	$dirty	I
/*    */     //   0	344	0	link	Ljava/lang/String;
/*    */     //   0	344	1	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	344	2	$changed	I
/*    */   }
/*    */   
/* 26 */   private static final boolean DisplayCopyableLink$lambda$1(MutableState $copiedToClipboard$delegate) { State state = (State)$copiedToClipboard$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
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
/* 67 */       (Boolean)state.getValue()).booleanValue(); }
/* 68 */   private static final Unit DisplayCopyableLink$lambda$4$lambda$3(String $link, MutableState<Boolean> $copiedToClipboard$delegate) { DisplayCopyableLink$lambda$2($copiedToClipboard$delegate, false); UtilsKt.copyStringToClipboard($link); DisplayCopyableLink$lambda$2($copiedToClipboard$delegate, true); return Unit.INSTANCE; } private static final void DisplayCopyableLink$lambda$2(MutableState $copiedToClipboard$delegate, boolean <set-?>) { MutableState mutableState = $copiedToClipboard$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); } private static final Unit DisplayCopyableLink$lambda$5(String $link, int $$changed, Composer $composer, int $force) { DisplayCopyableLink($link, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1)); return Unit.INSTANCE; } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nDisplayCopyableLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisplayCopyableLink.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/DisplayCopyableLinkKt$DisplayCopyableLink$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,54:1\n149#2:55\n149#2:93\n99#3:56\n95#3,7:57\n102#3:92\n106#3:97\n79#4,6:64\n86#4,4:79\n90#4,2:89\n94#4:96\n368#5,9:70\n377#5:91\n378#5,2:94\n4034#6,6:83\n*S KotlinDebug\n*F\n+ 1 DisplayCopyableLink.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/DisplayCopyableLinkKt$DisplayCopyableLink$2\n*L\n37#1:55\n45#1:93\n35#1:56\n35#1:57,7\n35#1:92\n35#1:97\n35#1:64,6\n35#1:79,4\n35#1:89,2\n35#1:96\n35#1:70,9\n35#1:91\n35#1:94,2\n35#1:83,6\n*E\n"}) static final class DisplayCopyableLinkKt$DisplayCopyableLink$2 implements Function3<BoxScope, Composer, Integer, Unit> {
/* 69 */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(BoxScope $this$JunieHoverableChip, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$JunieHoverableChip, "$this$JunieHoverableChip"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(255288772, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.DisplayCopyableLink.<anonymous> (DisplayCopyableLink.kt:34)");  Alignment.Vertical vertical = Alignment.Companion.getCenterVertically(); int $this$dp$iv = 4, $i$f$getDp = 0; Arrangement.HorizontalOrVertical horizontalOrVertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl($this$dp$iv)); String str = this.$link; MutableState<Boolean> mutableState = this.$copiedToClipboard$delegate; int $changed$iv = 432, $i$f$Row = 0; ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo"); Modifier modifier$iv = (Modifier)Modifier.Companion; MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy((Arrangement.Horizontal)horizontalOrVertical, vertical, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3; int $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0); CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap(); Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv); Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 70 */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 71 */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 72 */           .startReusableNode();
/* 73 */         if ($composer.getInserting()) { $composer
/* 74 */             .createNode(function0); } else { $composer
/*    */             
/* 76 */             .useNode(); }
/*    */         
/* 78 */         Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 79 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 80 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*    */         
/* 82 */         Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 83 */         Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 84 */         if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 85 */           $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 86 */           $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*    */         } 
/*    */         
/* 89 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*    */         
/* 91 */         int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-RowKt$Row$1$iv = 0;
/* 92 */         ComposerKt.sourceInformationMarkerStart($composer$iv, -407840262, "C101@5126L9:Row.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; RowScope $this$invoke_u24lambda_u240 = (RowScope)RowScopeInstance.INSTANCE; int $i$a$-Row-DisplayCopyableLinkKt$DisplayCopyableLink$2$1 = 0; composer1.startReplaceGroup(-1668208809); long l1 = DisplayCopyableLinkKt.DisplayCopyableLink$lambda$1(mutableState) ? MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getOnboardingDotsColor-0d7_KjU() : Color.Companion.getUnspecified-0d7_KjU(); composer1.endReplaceGroup(); IconKt.Icon-FHprtrg((IconKey)AllIconsKeys.Actions.INSTANCE.getCopy(), "copy to clipboard", null, null, l1, new org.jetbrains.jewel.ui.painter.PainterHint[0], composer1, 0x30 | IntelliJIconKey.$stable, 12); int k = 4, m = 0;
/* 93 */         Modifier modifier1 = PaddingKt.padding-VpY3zN4$default((Modifier)Modifier.Companion, 0.0F, Dp.constructor-impl(k), 1, null); long l2 = MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getBlockTextColor-0d7_KjU(); int n = TextOverflow.Companion.getEllipsis-gIe3tQ8(); TextKt.Text-bAzTDeA(str, modifier1, l2, 0L, null, null, null, 0L, null, 0, 0L, n, false, 1, null, null, composer1, 48, 3120, 55288); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 94 */         $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 95 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 96 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 97 */         if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*    */       else
/*    */       { $composer.skipToGroupEnd(); }
/*    */        }
/*    */ 
/*    */     
/*    */     DisplayCopyableLinkKt$DisplayCopyableLink$2(String $link, MutableState<Boolean> $copiedToClipboard$delegate) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\DisplayCopyableLinkKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */