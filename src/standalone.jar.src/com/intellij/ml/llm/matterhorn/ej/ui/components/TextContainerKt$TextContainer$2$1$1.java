/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.ui.text.AnnotatedString;
/*    */ import androidx.compose.ui.text.TextLayoutResult;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nTextContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextContainer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/TextContainerKt$TextContainer$2$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,60:1\n1225#2,6:61\n*S KotlinDebug\n*F\n+ 1 TextContainer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/TextContainerKt$TextContainer$2$1$1\n*L\n39#1:61,6\n*E\n"})
/*    */ final class TextContainerKt$TextContainer$2$1$1
/*    */   implements Function2<Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: iconst_3
/*    */     //   2: iand
/*    */     //   3: iconst_2
/*    */     //   4: if_icmpne -> 16
/*    */     //   7: aload_1
/*    */     //   8: invokeinterface getSkipping : ()Z
/*    */     //   13: ifne -> 259
/*    */     //   16: invokestatic isTraceInProgress : ()Z
/*    */     //   19: ifeq -> 31
/*    */     //   22: ldc -1097460697
/*    */     //   24: iload_2
/*    */     //   25: iconst_m1
/*    */     //   26: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.TextContainer.<anonymous>.<anonymous>.<anonymous> (TextContainer.kt:34)'
/*    */     //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   31: aload_1
/*    */     //   32: iconst_0
/*    */     //   33: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*    */     //   36: aload_1
/*    */     //   37: iconst_0
/*    */     //   38: invokevirtual getMessageFont : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/FontFamily;
/*    */     //   41: astore_3
/*    */     //   42: aload_1
/*    */     //   43: iconst_0
/*    */     //   44: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*    */     //   47: invokevirtual getBlockTextColor-0d7_KjU : ()J
/*    */     //   50: lstore #4
/*    */     //   52: getstatic androidx/compose/ui/text/style/TextOverflow.Companion : Landroidx/compose/ui/text/style/TextOverflow$Companion;
/*    */     //   55: invokevirtual getEllipsis-gIe3tQ8 : ()I
/*    */     //   58: istore #6
/*    */     //   60: aload_0
/*    */     //   61: getfield $text : Landroidx/compose/ui/text/AnnotatedString;
/*    */     //   64: aconst_null
/*    */     //   65: lload #4
/*    */     //   67: lconst_0
/*    */     //   68: aconst_null
/*    */     //   69: aconst_null
/*    */     //   70: aload_3
/*    */     //   71: lconst_0
/*    */     //   72: aconst_null
/*    */     //   73: iconst_0
/*    */     //   74: lconst_0
/*    */     //   75: iload #6
/*    */     //   77: iconst_0
/*    */     //   78: aload_0
/*    */     //   79: getfield $maxLines : I
/*    */     //   82: aconst_null
/*    */     //   83: aload_1
/*    */     //   84: ldc 687420552
/*    */     //   86: invokeinterface startReplaceGroup : (I)V
/*    */     //   91: aload_1
/*    */     //   92: astore #8
/*    */     //   94: iconst_0
/*    */     //   95: istore #9
/*    */     //   97: aload_0
/*    */     //   98: getfield $tooLong$delegate : Landroidx/compose/runtime/MutableState;
/*    */     //   101: astore #10
/*    */     //   103: iconst_0
/*    */     //   104: istore #11
/*    */     //   106: aload #8
/*    */     //   108: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   113: astore #12
/*    */     //   115: iconst_0
/*    */     //   116: istore #13
/*    */     //   118: aload #12
/*    */     //   120: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   123: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   126: if_acmpne -> 219
/*    */     //   129: astore #34
/*    */     //   131: istore #33
/*    */     //   133: istore #32
/*    */     //   135: istore #31
/*    */     //   137: lstore #29
/*    */     //   139: istore #28
/*    */     //   141: astore #27
/*    */     //   143: lstore #25
/*    */     //   145: astore #24
/*    */     //   147: astore #23
/*    */     //   149: astore #22
/*    */     //   151: lstore #20
/*    */     //   153: lstore #18
/*    */     //   155: astore #17
/*    */     //   157: astore #16
/*    */     //   159: iconst_0
/*    */     //   160: istore #14
/*    */     //   162: aload #10
/*    */     //   164: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*    */     //   169: astore #35
/*    */     //   171: aload #16
/*    */     //   173: aload #17
/*    */     //   175: lload #18
/*    */     //   177: lload #20
/*    */     //   179: aload #22
/*    */     //   181: aload #23
/*    */     //   183: aload #24
/*    */     //   185: lload #25
/*    */     //   187: aload #27
/*    */     //   189: iload #28
/*    */     //   191: lload #29
/*    */     //   193: iload #31
/*    */     //   195: iload #32
/*    */     //   197: iload #33
/*    */     //   199: aload #34
/*    */     //   201: aload #35
/*    */     //   203: astore #15
/*    */     //   205: aload #8
/*    */     //   207: aload #15
/*    */     //   209: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   214: aload #15
/*    */     //   216: goto -> 221
/*    */     //   219: aload #12
/*    */     //   221: nop
/*    */     //   222: nop
/*    */     //   223: nop
/*    */     //   224: checkcast kotlin/jvm/functions/Function1
/*    */     //   227: astore #7
/*    */     //   229: aload_1
/*    */     //   230: invokeinterface endReplaceGroup : ()V
/*    */     //   235: aload #7
/*    */     //   237: aconst_null
/*    */     //   238: aload_1
/*    */     //   239: iconst_0
/*    */     //   240: ldc 196656
/*    */     //   242: ldc 87994
/*    */     //   244: invokestatic Text-F-Jr8PA : (Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*    */     //   247: invokestatic isTraceInProgress : ()Z
/*    */     //   250: ifeq -> 265
/*    */     //   253: invokestatic traceEventEnd : ()V
/*    */     //   256: goto -> 265
/*    */     //   259: aload_1
/*    */     //   260: invokeinterface skipToGroupEnd : ()V
/*    */     //   265: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #35	-> 0
/*    */     //   #37	-> 33
/*    */     //   #38	-> 44
/*    */     //   #42	-> 52
/*    */     //   #36	-> 60
/*    */     //   #38	-> 65
/*    */     //   #37	-> 70
/*    */     //   #42	-> 75
/*    */     //   #43	-> 78
/*    */     //   #39	-> 97
/*    */     //   #61	-> 106
/*    */     //   #62	-> 118
/*    */     //   #63	-> 129
/*    */     //   #39	-> 162
/*    */     //   #63	-> 203
/*    */     //   #64	-> 205
/*    */     //   #65	-> 214
/*    */     //   #66	-> 219
/*    */     //   #62	-> 221
/*    */     //   #61	-> 222
/*    */     //   #61	-> 223
/*    */     //   #39	-> 224
/*    */     //   #35	-> 244
/*    */     //   #44	-> 259
/*    */     //   #45	-> 265
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   162	7	14	$i$a$-cache-TextContainerKt$TextContainer$2$1$1$1	I
/*    */     //   205	11	15	value$iv	Ljava/lang/Object;
/*    */     //   118	104	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   115	107	12	it$iv	Ljava/lang/Object;
/*    */     //   106	118	11	$i$f$cache	I
/*    */     //   103	121	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   103	121	9	invalid$iv	Z
/*    */     //   0	266	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/TextContainerKt$TextContainer$2$1$1;
/*    */     //   0	266	1	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	266	2	$changed	I
/*    */   }
/*    */   
/*    */   private static final Unit invoke$lambda$1$lambda$0(MutableState $tooLong$delegate, TextLayoutResult textLayoutResult) {
/* 40 */     Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult"); TextContainerKt.access$TextContainer$lambda$8$lambda$3($tooLong$delegate, textLayoutResult.getHasVisualOverflow());
/* 41 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   TextContainerKt$TextContainer$2$1$1(AnnotatedString $text, int $maxLines, MutableState<Boolean> $tooLong$delegate) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\TextContainerKt$TextContainer$2$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */