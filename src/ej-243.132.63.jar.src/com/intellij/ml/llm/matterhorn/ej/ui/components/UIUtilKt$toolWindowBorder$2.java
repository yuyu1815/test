/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.geometry.OffsetKt;
/*    */ import androidx.compose.ui.geometry.Size;
/*    */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*    */ import com.intellij.openapi.wm.ToolWindowAnchor;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nUIUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIUtil.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/UIUtilKt$toolWindowBorder$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,179:1\n77#2:180\n1#3:181\n149#4:182\n1225#5,6:183\n*S KotlinDebug\n*F\n+ 1 UIUtil.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/UIUtilKt$toolWindowBorder$2\n*L\n77#1:180\n77#1:182\n78#1:183,6\n*E\n"})
/*    */ final class UIUtilKt$toolWindowBorder$2
/*    */   implements Function3<Modifier, Composer, Integer, Modifier>
/*    */ {
/*    */   @Composable
/*    */   public final Modifier invoke(Modifier $this$composed, Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc '$this$composed'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc -267914385
/*    */     //   9: invokeinterface startReplaceGroup : (I)V
/*    */     //   14: invokestatic isTraceInProgress : ()Z
/*    */     //   17: ifeq -> 29
/*    */     //   20: ldc -267914385
/*    */     //   22: iload_3
/*    */     //   23: iconst_m1
/*    */     //   24: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.toolWindowBorder.<anonymous> (UIUtil.kt:76)'
/*    */     //   26: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   29: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*    */     //   32: checkcast androidx/compose/runtime/CompositionLocal
/*    */     //   35: astore #5
/*    */     //   37: iconst_0
/*    */     //   38: istore #6
/*    */     //   40: iconst_0
/*    */     //   41: istore #7
/*    */     //   43: aload_2
/*    */     //   44: ldc 2023513938
/*    */     //   46: ldc 'CC:CompositionLocal.kt#9igjgp'
/*    */     //   48: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   51: aload_2
/*    */     //   52: aload #5
/*    */     //   54: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*    */     //   59: astore #8
/*    */     //   61: aload_2
/*    */     //   62: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   65: aload #8
/*    */     //   67: checkcast androidx/compose/ui/unit/Density
/*    */     //   70: astore #6
/*    */     //   72: iconst_0
/*    */     //   73: istore #7
/*    */     //   75: aload #6
/*    */     //   77: iconst_1
/*    */     //   78: istore #8
/*    */     //   80: iconst_0
/*    */     //   81: istore #9
/*    */     //   83: iload #8
/*    */     //   85: i2f
/*    */     //   86: invokestatic constructor-impl : (F)F
/*    */     //   89: invokeinterface toPx-0680j_4 : (F)F
/*    */     //   94: nop
/*    */     //   95: fstore #4
/*    */     //   97: aload_1
/*    */     //   98: aload_2
/*    */     //   99: ldc 1332290085
/*    */     //   101: invokeinterface startReplaceGroup : (I)V
/*    */     //   106: aload_2
/*    */     //   107: astore #7
/*    */     //   109: aload_2
/*    */     //   110: aload_0
/*    */     //   111: getfield $anchor : Lcom/intellij/openapi/wm/ToolWindowAnchor;
/*    */     //   114: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   119: aload_2
/*    */     //   120: aload_0
/*    */     //   121: getfield $color : J
/*    */     //   124: invokeinterface changed : (J)Z
/*    */     //   129: ior
/*    */     //   130: aload_2
/*    */     //   131: fload #4
/*    */     //   133: invokeinterface changed : (F)Z
/*    */     //   138: ior
/*    */     //   139: istore #8
/*    */     //   141: aload_0
/*    */     //   142: getfield $anchor : Lcom/intellij/openapi/wm/ToolWindowAnchor;
/*    */     //   145: astore #9
/*    */     //   147: aload_0
/*    */     //   148: getfield $color : J
/*    */     //   151: lstore #10
/*    */     //   153: iconst_0
/*    */     //   154: istore #12
/*    */     //   156: aload #7
/*    */     //   158: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   163: astore #13
/*    */     //   165: iconst_0
/*    */     //   166: istore #14
/*    */     //   168: iload #8
/*    */     //   170: ifne -> 184
/*    */     //   173: aload #13
/*    */     //   175: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   178: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   181: if_acmpne -> 219
/*    */     //   184: astore #17
/*    */     //   186: iconst_0
/*    */     //   187: istore #15
/*    */     //   189: aload #9
/*    */     //   191: lload #10
/*    */     //   193: fload #4
/*    */     //   195: <illegal opcode> invoke : (Lcom/intellij/openapi/wm/ToolWindowAnchor;JF)Lkotlin/jvm/functions/Function1;
/*    */     //   200: aload #17
/*    */     //   202: swap
/*    */     //   203: astore #16
/*    */     //   205: aload #7
/*    */     //   207: aload #16
/*    */     //   209: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   214: aload #16
/*    */     //   216: goto -> 221
/*    */     //   219: aload #13
/*    */     //   221: nop
/*    */     //   222: nop
/*    */     //   223: nop
/*    */     //   224: checkcast kotlin/jvm/functions/Function1
/*    */     //   227: astore #6
/*    */     //   229: aload_2
/*    */     //   230: invokeinterface endReplaceGroup : ()V
/*    */     //   235: aload #6
/*    */     //   237: invokestatic drawBehind : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*    */     //   240: astore #5
/*    */     //   242: invokestatic isTraceInProgress : ()Z
/*    */     //   245: ifeq -> 251
/*    */     //   248: invokestatic traceEventEnd : ()V
/*    */     //   251: aload_2
/*    */     //   252: invokeinterface endReplaceGroup : ()V
/*    */     //   257: aload #5
/*    */     //   259: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #77	-> 26
/*    */     //   #180	-> 48
/*    */     //   #77	-> 67
/*    */     //   #181	-> 72
/*    */     //   #77	-> 75
/*    */     //   #182	-> 83
/*    */     //   #77	-> 89
/*    */     //   #77	-> 94
/*    */     //   #77	-> 95
/*    */     //   #78	-> 97
/*    */     //   #183	-> 156
/*    */     //   #184	-> 168
/*    */     //   #185	-> 184
/*    */     //   #78	-> 189
/*    */     //   #185	-> 203
/*    */     //   #186	-> 205
/*    */     //   #187	-> 214
/*    */     //   #188	-> 219
/*    */     //   #184	-> 221
/*    */     //   #183	-> 222
/*    */     //   #183	-> 223
/*    */     //   #78	-> 224
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   43	24	7	$i$f$getCurrent	I
/*    */     //   40	27	5	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*    */     //   40	27	6	$changed$iv	I
/*    */     //   83	6	9	$i$f$getDp	I
/*    */     //   80	9	8	$this$dp$iv	I
/*    */     //   75	19	7	$i$a$-run-UIUtilKt$toolWindowBorder$2$strokeWidth$1	I
/*    */     //   72	22	6	$this$invoke_u24lambda_u240	Landroidx/compose/ui/unit/Density;
/*    */     //   189	11	15	$i$a$-cache-UIUtilKt$toolWindowBorder$2$1	I
/*    */     //   205	11	16	value$iv	Ljava/lang/Object;
/*    */     //   168	54	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   165	57	13	it$iv	Ljava/lang/Object;
/*    */     //   156	68	12	$i$f$cache	I
/*    */     //   153	71	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   153	71	8	invalid$iv	Z
/*    */     //   97	163	4	strokeWidth	F
/*    */     //   0	260	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/UIUtilKt$toolWindowBorder$2;
/*    */     //   0	260	1	$this$composed	Landroidx/compose/ui/Modifier;
/*    */     //   0	260	2	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	260	3	$changed	I
/*    */   }
/*    */   
/*    */   private static final Unit invoke$lambda$2$lambda$1(ToolWindowAnchor $anchor, long $color, float $strokeWidth, DrawScope $this$drawBehind) {
/* 79 */     Intrinsics.checkNotNullParameter($this$drawBehind, "$this$drawBehind"); if (Intrinsics.areEqual($anchor, ToolWindowAnchor.LEFT)) {
/* 80 */       DrawScope.drawLine-NGM6Ib0$default($this$drawBehind, $color, OffsetKt.Offset(0.0F, 0.0F), OffsetKt.Offset(Size.getWidth-impl($this$drawBehind.getSize-NH-jbRc()), 0.0F), $strokeWidth, 0, null, 0.0F, null, 0, 496, null);
/*    */     } else {
/* 82 */       DrawScope.drawLine-NGM6Ib0$default($this$drawBehind, $color, OffsetKt.Offset(0.0F, Size.getHeight-impl($this$drawBehind.getSize-NH-jbRc())), OffsetKt.Offset(Size.getWidth-impl($this$drawBehind.getSize-NH-jbRc()), Size.getHeight-impl($this$drawBehind.getSize-NH-jbRc())), $strokeWidth, 0, null, 0.0F, null, 0, 496, null);
/*    */     } 
/* 84 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   UIUtilKt$toolWindowBorder$2(ToolWindowAnchor $anchor, long $color) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\UIUtilKt$toolWindowBorder$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */