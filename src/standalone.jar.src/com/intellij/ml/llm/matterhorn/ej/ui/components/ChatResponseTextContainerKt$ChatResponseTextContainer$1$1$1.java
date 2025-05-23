/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.MutableState;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nChatResponseTextContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatResponseTextContainer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/ChatResponseTextContainerKt$ChatResponseTextContainer$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,61:1\n1225#2,6:62\n*S KotlinDebug\n*F\n+ 1 ChatResponseTextContainer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/ChatResponseTextContainerKt$ChatResponseTextContainer$1$1$1\n*L\n45#1:62,6\n*E\n"})
/*    */ final class ChatResponseTextContainerKt$ChatResponseTextContainer$1$1$1
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
/*    */     //   13: ifne -> 275
/*    */     //   16: invokestatic isTraceInProgress : ()Z
/*    */     //   19: ifeq -> 31
/*    */     //   22: ldc -1424715766
/*    */     //   24: iload_2
/*    */     //   25: iconst_m1
/*    */     //   26: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.ChatResponseTextContainer.<anonymous>.<anonymous>.<anonymous> (ChatResponseTextContainer.kt:40)'
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
/*    */     //   61: getfield $displayText : Ljava/lang/String;
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
/*    */     //   78: bipush #8
/*    */     //   80: aload_1
/*    */     //   81: ldc -1603815877
/*    */     //   83: invokeinterface startReplaceGroup : (I)V
/*    */     //   88: aload_1
/*    */     //   89: astore #8
/*    */     //   91: aload_1
/*    */     //   92: aload_0
/*    */     //   93: getfield $isLongText : Z
/*    */     //   96: invokeinterface changed : (Z)Z
/*    */     //   101: istore #9
/*    */     //   103: aload_0
/*    */     //   104: getfield $isLongText : Z
/*    */     //   107: istore #10
/*    */     //   109: aload_0
/*    */     //   110: getfield $isOverflowing$delegate : Landroidx/compose/runtime/MutableState;
/*    */     //   113: astore #11
/*    */     //   115: iconst_0
/*    */     //   116: istore #12
/*    */     //   118: aload #8
/*    */     //   120: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   125: astore #13
/*    */     //   127: iconst_0
/*    */     //   128: istore #14
/*    */     //   130: iload #9
/*    */     //   132: ifne -> 146
/*    */     //   135: aload #13
/*    */     //   137: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   140: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   143: if_acmpne -> 234
/*    */     //   146: istore #34
/*    */     //   148: istore #33
/*    */     //   150: istore #32
/*    */     //   152: lstore #30
/*    */     //   154: istore #29
/*    */     //   156: astore #28
/*    */     //   158: lstore #26
/*    */     //   160: astore #25
/*    */     //   162: astore #24
/*    */     //   164: astore #23
/*    */     //   166: lstore #21
/*    */     //   168: lstore #19
/*    */     //   170: astore #18
/*    */     //   172: astore #17
/*    */     //   174: iconst_0
/*    */     //   175: istore #15
/*    */     //   177: iload #10
/*    */     //   179: aload #11
/*    */     //   181: <illegal opcode> invoke : (ZLandroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*    */     //   186: astore #35
/*    */     //   188: aload #17
/*    */     //   190: aload #18
/*    */     //   192: lload #19
/*    */     //   194: lload #21
/*    */     //   196: aload #23
/*    */     //   198: aload #24
/*    */     //   200: aload #25
/*    */     //   202: lload #26
/*    */     //   204: aload #28
/*    */     //   206: iload #29
/*    */     //   208: lload #30
/*    */     //   210: iload #32
/*    */     //   212: iload #33
/*    */     //   214: iload #34
/*    */     //   216: aload #35
/*    */     //   218: astore #16
/*    */     //   220: aload #8
/*    */     //   222: aload #16
/*    */     //   224: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   229: aload #16
/*    */     //   231: goto -> 236
/*    */     //   234: aload #13
/*    */     //   236: nop
/*    */     //   237: nop
/*    */     //   238: nop
/*    */     //   239: checkcast kotlin/jvm/functions/Function1
/*    */     //   242: astore #7
/*    */     //   244: aload_1
/*    */     //   245: invokeinterface endReplaceGroup : ()V
/*    */     //   250: aload #7
/*    */     //   252: aconst_null
/*    */     //   253: aload_1
/*    */     //   254: iconst_0
/*    */     //   255: sipush #3120
/*    */     //   258: ldc 38842
/*    */     //   260: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*    */     //   263: invokestatic isTraceInProgress : ()Z
/*    */     //   266: ifeq -> 281
/*    */     //   269: invokestatic traceEventEnd : ()V
/*    */     //   272: goto -> 281
/*    */     //   275: aload_1
/*    */     //   276: invokeinterface skipToGroupEnd : ()V
/*    */     //   281: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #41	-> 0
/*    */     //   #43	-> 33
/*    */     //   #44	-> 44
/*    */     //   #48	-> 52
/*    */     //   #42	-> 60
/*    */     //   #44	-> 65
/*    */     //   #43	-> 70
/*    */     //   #48	-> 75
/*    */     //   #49	-> 78
/*    */     //   #45	-> 103
/*    */     //   #62	-> 118
/*    */     //   #63	-> 130
/*    */     //   #64	-> 146
/*    */     //   #45	-> 177
/*    */     //   #64	-> 218
/*    */     //   #65	-> 220
/*    */     //   #66	-> 229
/*    */     //   #67	-> 234
/*    */     //   #63	-> 236
/*    */     //   #62	-> 237
/*    */     //   #62	-> 238
/*    */     //   #45	-> 239
/*    */     //   #41	-> 260
/*    */     //   #50	-> 275
/*    */     //   #51	-> 281
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   177	9	15	$i$a$-cache-ChatResponseTextContainerKt$ChatResponseTextContainer$1$1$1$1	I
/*    */     //   220	11	16	value$iv	Ljava/lang/Object;
/*    */     //   130	107	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   127	110	13	it$iv	Ljava/lang/Object;
/*    */     //   118	121	12	$i$f$cache	I
/*    */     //   115	124	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   115	124	9	invalid$iv	Z
/*    */     //   0	282	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/ChatResponseTextContainerKt$ChatResponseTextContainer$1$1$1;
/*    */     //   0	282	1	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	282	2	$changed	I
/*    */   }
/*    */   
/*    */   private static final Unit invoke$lambda$1$lambda$0(boolean $isLongText, MutableState $isOverflowing$delegate, TextLayoutResult layoutResult) {
/* 46 */     Intrinsics.checkNotNullParameter(layoutResult, "layoutResult"); ChatResponseTextContainerKt.access$ChatResponseTextContainer$lambda$2($isOverflowing$delegate, (layoutResult.getHasVisualOverflow() || $isLongText));
/* 47 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   ChatResponseTextContainerKt$ChatResponseTextContainer$1$1$1(String $displayText, boolean $isLongText, MutableState<Boolean> $isOverflowing$delegate) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\ChatResponseTextContainerKt$ChatResponseTextContainer$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */