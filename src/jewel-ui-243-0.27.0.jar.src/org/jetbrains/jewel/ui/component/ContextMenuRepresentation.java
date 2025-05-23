/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.foundation.ContextMenuRepresentation;
/*    */ import androidx.compose.foundation.ContextMenuState;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.ui.input.InputMode;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\002\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J)\020\004\032\0020\0052\006\020\006\032\0020\0072\022\020\b\032\016\022\n\022\b\022\004\022\0020\0130\n0\tH\027¢\006\002\020\f¨\006\r"}, d2 = {"Lorg/jetbrains/jewel/ui/component/ContextMenuRepresentation;", "Landroidx/compose/foundation/ContextMenuRepresentation;", "<init>", "()V", "Representation", "", "state", "Landroidx/compose/foundation/ContextMenuState;", "items", "Lkotlin/Function0;", "", "Landroidx/compose/foundation/ContextMenuItem;", "(Landroidx/compose/foundation/ContextMenuState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ @SourceDebugExtension({"SMAP\nContextMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.kt\norg/jetbrains/jewel/ui/component/ContextMenuRepresentation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,96:1\n1225#2,6:97\n1225#2,6:103\n*S KotlinDebug\n*F\n+ 1 ContextMenu.kt\norg/jetbrains/jewel/ui/component/ContextMenuRepresentation\n*L\n32#1:97,6\n37#1:103,6\n*E\n"})
/*    */ public final class ContextMenuRepresentation implements ContextMenuRepresentation {
/*    */   @NotNull
/*    */   public static final ContextMenuRepresentation INSTANCE = new ContextMenuRepresentation();
/*    */   public static final int $stable;
/*    */   
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public void Representation(@NotNull ContextMenuState state, @NotNull Function0 items, @Nullable Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'state'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'items'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_3
/*    */     //   13: ldc 825628387
/*    */     //   15: invokeinterface startReplaceGroup : (I)V
/*    */     //   20: invokestatic isTraceInProgress : ()Z
/*    */     //   23: ifeq -> 36
/*    */     //   26: ldc 825628387
/*    */     //   28: iload #4
/*    */     //   30: iconst_m1
/*    */     //   31: ldc 'org.jetbrains.jewel.ui.component.ContextMenuRepresentation.Representation (ContextMenu.kt:26)'
/*    */     //   33: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   36: aload_1
/*    */     //   37: invokevirtual getStatus : ()Landroidx/compose/foundation/ContextMenuState$Status;
/*    */     //   40: instanceof androidx/compose/foundation/ContextMenuState$Status$Open
/*    */     //   43: istore #5
/*    */     //   45: iload #5
/*    */     //   47: ifeq -> 338
/*    */     //   50: aload_3
/*    */     //   51: ldc 1883853516
/*    */     //   53: invokeinterface startReplaceGroup : (I)V
/*    */     //   58: aload_3
/*    */     //   59: astore #7
/*    */     //   61: iload #4
/*    */     //   63: bipush #14
/*    */     //   65: iand
/*    */     //   66: bipush #6
/*    */     //   68: ixor
/*    */     //   69: iconst_4
/*    */     //   70: if_icmple -> 83
/*    */     //   73: aload_3
/*    */     //   74: aload_1
/*    */     //   75: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   80: ifne -> 92
/*    */     //   83: iload #4
/*    */     //   85: bipush #6
/*    */     //   87: iand
/*    */     //   88: iconst_4
/*    */     //   89: if_icmpne -> 96
/*    */     //   92: iconst_1
/*    */     //   93: goto -> 97
/*    */     //   96: iconst_0
/*    */     //   97: istore #8
/*    */     //   99: nop
/*    */     //   100: iconst_0
/*    */     //   101: istore #9
/*    */     //   103: aload #7
/*    */     //   105: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   110: astore #10
/*    */     //   112: iconst_0
/*    */     //   113: istore #11
/*    */     //   115: iload #8
/*    */     //   117: ifne -> 131
/*    */     //   120: aload #10
/*    */     //   122: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   125: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   128: if_acmpne -> 156
/*    */     //   131: iconst_0
/*    */     //   132: istore #12
/*    */     //   134: aload_1
/*    */     //   135: <illegal opcode> invoke : (Landroidx/compose/foundation/ContextMenuState;)Lkotlin/jvm/functions/Function1;
/*    */     //   140: astore #13
/*    */     //   142: aload #7
/*    */     //   144: aload #13
/*    */     //   146: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   151: aload #13
/*    */     //   153: goto -> 158
/*    */     //   156: aload #10
/*    */     //   158: nop
/*    */     //   159: nop
/*    */     //   160: nop
/*    */     //   161: checkcast kotlin/jvm/functions/Function1
/*    */     //   164: astore #6
/*    */     //   166: aload_3
/*    */     //   167: invokeinterface endReplaceGroup : ()V
/*    */     //   172: aload #6
/*    */     //   174: aconst_null
/*    */     //   175: iconst_0
/*    */     //   176: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*    */     //   179: aload_3
/*    */     //   180: bipush #6
/*    */     //   182: invokestatic getMenuStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*    */     //   185: aload_3
/*    */     //   186: ldc 1883858961
/*    */     //   188: invokeinterface startReplaceGroup : (I)V
/*    */     //   193: aload_3
/*    */     //   194: astore #7
/*    */     //   196: iload #4
/*    */     //   198: bipush #112
/*    */     //   200: iand
/*    */     //   201: bipush #48
/*    */     //   203: ixor
/*    */     //   204: bipush #32
/*    */     //   206: if_icmple -> 219
/*    */     //   209: aload_3
/*    */     //   210: aload_2
/*    */     //   211: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   216: ifne -> 229
/*    */     //   219: iload #4
/*    */     //   221: bipush #48
/*    */     //   223: iand
/*    */     //   224: bipush #32
/*    */     //   226: if_icmpne -> 233
/*    */     //   229: iconst_1
/*    */     //   230: goto -> 234
/*    */     //   233: iconst_0
/*    */     //   234: istore #8
/*    */     //   236: nop
/*    */     //   237: iconst_0
/*    */     //   238: istore #9
/*    */     //   240: aload #7
/*    */     //   242: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   247: astore #10
/*    */     //   249: iconst_0
/*    */     //   250: istore #11
/*    */     //   252: iload #8
/*    */     //   254: ifne -> 268
/*    */     //   257: aload #10
/*    */     //   259: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   262: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   265: if_acmpne -> 313
/*    */     //   268: astore #17
/*    */     //   270: istore #16
/*    */     //   272: astore #15
/*    */     //   274: astore #14
/*    */     //   276: iconst_0
/*    */     //   277: istore #12
/*    */     //   279: aload_2
/*    */     //   280: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function1;
/*    */     //   285: astore #18
/*    */     //   287: aload #14
/*    */     //   289: aload #15
/*    */     //   291: iload #16
/*    */     //   293: aload #17
/*    */     //   295: aload #18
/*    */     //   297: astore #13
/*    */     //   299: aload #7
/*    */     //   301: aload #13
/*    */     //   303: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   308: aload #13
/*    */     //   310: goto -> 315
/*    */     //   313: aload #10
/*    */     //   315: nop
/*    */     //   316: nop
/*    */     //   317: nop
/*    */     //   318: checkcast kotlin/jvm/functions/Function1
/*    */     //   321: astore #6
/*    */     //   323: aload_3
/*    */     //   324: invokeinterface endReplaceGroup : ()V
/*    */     //   329: aload #6
/*    */     //   331: aload_3
/*    */     //   332: iconst_0
/*    */     //   333: bipush #6
/*    */     //   335: invokestatic ContextMenu : (Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
/*    */     //   338: invokestatic isTraceInProgress : ()Z
/*    */     //   341: ifeq -> 347
/*    */     //   344: invokestatic traceEventEnd : ()V
/*    */     //   347: aload_3
/*    */     //   348: invokeinterface endReplaceGroup : ()V
/*    */     //   353: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #27	-> 33
/*    */     //   #28	-> 36
/*    */     //   #30	-> 45
/*    */     //   #32	-> 99
/*    */     //   #97	-> 103
/*    */     //   #98	-> 115
/*    */     //   #99	-> 131
/*    */     //   #32	-> 134
/*    */     //   #99	-> 140
/*    */     //   #100	-> 142
/*    */     //   #101	-> 151
/*    */     //   #102	-> 156
/*    */     //   #98	-> 158
/*    */     //   #97	-> 159
/*    */     //   #97	-> 160
/*    */     //   #32	-> 161
/*    */     //   #36	-> 176
/*    */     //   #37	-> 236
/*    */     //   #103	-> 240
/*    */     //   #104	-> 252
/*    */     //   #105	-> 268
/*    */     //   #37	-> 279
/*    */     //   #105	-> 297
/*    */     //   #106	-> 299
/*    */     //   #107	-> 308
/*    */     //   #108	-> 313
/*    */     //   #104	-> 315
/*    */     //   #103	-> 316
/*    */     //   #103	-> 317
/*    */     //   #37	-> 318
/*    */     //   #31	-> 335
/*    */     //   #41	-> 353
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   134	6	12	$i$a$-cache-ContextMenuRepresentation$Representation$1	I
/*    */     //   142	11	13	value$iv	Ljava/lang/Object;
/*    */     //   115	44	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   112	47	10	it$iv	Ljava/lang/Object;
/*    */     //   103	58	9	$i$f$cache	I
/*    */     //   100	61	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   100	61	8	invalid$iv	Z
/*    */     //   279	6	12	$i$a$-cache-ContextMenuRepresentation$Representation$2	I
/*    */     //   299	11	13	value$iv	Ljava/lang/Object;
/*    */     //   252	64	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   249	67	10	it$iv	Ljava/lang/Object;
/*    */     //   240	78	9	$i$f$cache	I
/*    */     //   237	81	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   237	81	8	invalid$iv	Z
/*    */     //   45	309	5	isOpen	Z
/*    */     //   0	354	0	this	Lorg/jetbrains/jewel/ui/component/ContextMenuRepresentation;
/*    */     //   0	354	1	state	Landroidx/compose/foundation/ContextMenuState;
/*    */     //   0	354	2	items	Lkotlin/jvm/functions/Function0;
/*    */     //   0	354	3	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	354	4	$changed	I
/*    */   }
/*    */   
/*    */   private static final boolean Representation$lambda$1$lambda$0(ContextMenuState $state, InputMode it) {
/* 33 */     $state.setStatus((ContextMenuState.Status)ContextMenuState.Status.Closed.INSTANCE);
/* 34 */     return true;
/*    */   }
/*    */   
/*    */   private static final Unit Representation$lambda$3$lambda$2(Function0 $items, MenuScope $this$ContextMenu) {
/* 38 */     Intrinsics.checkNotNullParameter($this$ContextMenu, "$this$ContextMenu"); ContextMenuKt.access$contextItems($this$ContextMenu, $items);
/* 39 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ContextMenuRepresentation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */