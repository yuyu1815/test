/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.focus.FocusProperties;
/*     */ import androidx.compose.ui.geometry.OffsetKt;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.SolidColor;
/*     */ import androidx.compose.ui.graphics.StrokeCap;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*     */ import androidx.compose.ui.graphics.painter.Painter;
/*     */ import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
/*     */ import androidx.compose.ui.input.pointer.PointerButton_skikoKt;
/*     */ import androidx.compose.ui.input.pointer.PointerEvent;
/*     */ import java.util.Arrays;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.TabStyle;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ import org.jetbrains.jewel.ui.painter.PainterHint;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000d\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\0329\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0042\006\020\005\032\0020\0062\b\b\002\020\007\032\0020\b2\n\b\002\020\t\032\004\030\0010\nH\007¢\006\004\b\013\020\f\032M\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0042\006\020\005\032\0020\0062\b\b\002\020\007\032\0020\b2\n\b\002\020\r\032\004\030\0010\0162\022\020\017\032\n\022\006\b\001\022\0020\0210\020\"\0020\021H\007¢\006\004\b\022\020\023\032O\020\000\032\0020\001*\0020\0022\006\020\005\032\0020\0062\b\b\002\020\007\032\0020\b2\025\b\002\020\t\032\017\022\004\022\0020\001\030\0010\024¢\006\002\b\0252\021\020\003\032\r\022\004\022\0020\0010\024¢\006\002\b\025H\007¢\006\004\b\026\020\027\0321\020\030\032\0020\0012\b\b\002\020\007\032\0020\b2\006\020\031\032\0020\0322\006\020\033\032\0020\0342\b\b\002\020\035\032\0020\036H\001¢\006\002\020\037¨\006 ²\006\n\020!\032\0020\006X\002²\006\n\020\"\032\0020#X\002²\006\n\020$\032\0020%X\002²\006\n\020&\032\0020%X\002"}, d2 = {"SimpleTabContent", "", "Lorg/jetbrains/jewel/ui/component/TabContentScope;", "label", "", "state", "Lorg/jetbrains/jewel/ui/component/TabState;", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Landroidx/compose/ui/graphics/painter/Painter;", "SimpleTabContent-A5h6_LM", "(Lorg/jetbrains/jewel/ui/component/TabContentScope;Ljava/lang/String;JLandroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/runtime/Composer;II)V", "iconKey", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "painterHints", "", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "SimpleTabContent-OOOwjN0", "(Lorg/jetbrains/jewel/ui/component/TabContentScope;Ljava/lang/String;JLandroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/icon/IconKey;[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "SimpleTabContent-iMiKU5w", "(Lorg/jetbrains/jewel/ui/component/TabContentScope;JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabImpl", "isActive", "", "tabData", "Lorg/jetbrains/jewel/ui/component/TabData;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/TabData;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "ui", "tabState", "closeButtonState", "Lorg/jetbrains/jewel/ui/component/ButtonState;", "lineColor", "Landroidx/compose/ui/graphics/Color;", "backgroundColor"})
/*     */ @SourceDebugExtension({"SMAP\nTabs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tabs.kt\norg/jetbrains/jewel/ui/component/TabsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,269:1\n1#2:270\n99#3,3:271\n102#3:302\n106#3:306\n79#4,6:274\n86#4,4:289\n90#4,2:299\n94#4:305\n368#5,9:280\n377#5:301\n378#5,2:303\n4034#6,6:293\n1225#7,6:307\n1225#7,6:313\n1225#7,6:319\n1225#7,6:325\n1225#7,6:331\n708#8:337\n696#8:338\n77#9:339\n81#10:340\n107#10,2:341\n81#10:343\n107#10,2:344\n81#10:346\n81#10:347\n*S KotlinDebug\n*F\n+ 1 Tabs.kt\norg/jetbrains/jewel/ui/component/TabsKt\n*L\n98#1:271,3\n98#1:302\n98#1:306\n98#1:274,6\n98#1:289,4\n98#1:299,2\n98#1:305\n98#1:280,9\n98#1:301\n98#1:303,2\n98#1:293,6\n115#1:307,6\n123#1:313,6\n124#1:319,6\n126#1:325,6\n137#1:331,6\n142#1:337\n142#1:338\n142#1:339\n123#1:340\n123#1:341,2\n137#1:343\n137#1:344,2\n138#1:346\n140#1:347\n*E\n"})
/*     */ public final class TabsKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void SimpleTabContent-A5h6_LM(@NotNull TabContentScope $this$SimpleTabContent_u2dA5h6_LM, @NotNull String label, long state, @Nullable Modifier modifier, @Nullable Painter icon, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '$this$SimpleTabContent'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'label'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #6
/*     */     //   14: ldc 405379283
/*     */     //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   21: astore #6
/*     */     //   23: iload #7
/*     */     //   25: istore #9
/*     */     //   27: iload #8
/*     */     //   29: ldc -2147483648
/*     */     //   31: iand
/*     */     //   32: ifeq -> 45
/*     */     //   35: iload #9
/*     */     //   37: bipush #6
/*     */     //   39: ior
/*     */     //   40: istore #9
/*     */     //   42: goto -> 93
/*     */     //   45: iload #7
/*     */     //   47: bipush #6
/*     */     //   49: iand
/*     */     //   50: ifne -> 93
/*     */     //   53: iload #9
/*     */     //   55: iload #7
/*     */     //   57: bipush #8
/*     */     //   59: iand
/*     */     //   60: ifne -> 74
/*     */     //   63: aload #6
/*     */     //   65: aload_0
/*     */     //   66: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   71: goto -> 82
/*     */     //   74: aload #6
/*     */     //   76: aload_0
/*     */     //   77: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   82: ifeq -> 89
/*     */     //   85: iconst_4
/*     */     //   86: goto -> 90
/*     */     //   89: iconst_2
/*     */     //   90: ior
/*     */     //   91: istore #9
/*     */     //   93: iload #8
/*     */     //   95: iconst_1
/*     */     //   96: iand
/*     */     //   97: ifeq -> 110
/*     */     //   100: iload #9
/*     */     //   102: bipush #48
/*     */     //   104: ior
/*     */     //   105: istore #9
/*     */     //   107: goto -> 141
/*     */     //   110: iload #7
/*     */     //   112: bipush #48
/*     */     //   114: iand
/*     */     //   115: ifne -> 141
/*     */     //   118: iload #9
/*     */     //   120: aload #6
/*     */     //   122: aload_1
/*     */     //   123: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   128: ifeq -> 136
/*     */     //   131: bipush #32
/*     */     //   133: goto -> 138
/*     */     //   136: bipush #16
/*     */     //   138: ior
/*     */     //   139: istore #9
/*     */     //   141: iload #8
/*     */     //   143: iconst_2
/*     */     //   144: iand
/*     */     //   145: ifeq -> 159
/*     */     //   148: iload #9
/*     */     //   150: sipush #384
/*     */     //   153: ior
/*     */     //   154: istore #9
/*     */     //   156: goto -> 193
/*     */     //   159: iload #7
/*     */     //   161: sipush #384
/*     */     //   164: iand
/*     */     //   165: ifne -> 193
/*     */     //   168: iload #9
/*     */     //   170: aload #6
/*     */     //   172: lload_2
/*     */     //   173: invokeinterface changed : (J)Z
/*     */     //   178: ifeq -> 187
/*     */     //   181: sipush #256
/*     */     //   184: goto -> 190
/*     */     //   187: sipush #128
/*     */     //   190: ior
/*     */     //   191: istore #9
/*     */     //   193: iload #8
/*     */     //   195: iconst_4
/*     */     //   196: iand
/*     */     //   197: ifeq -> 211
/*     */     //   200: iload #9
/*     */     //   202: sipush #3072
/*     */     //   205: ior
/*     */     //   206: istore #9
/*     */     //   208: goto -> 246
/*     */     //   211: iload #7
/*     */     //   213: sipush #3072
/*     */     //   216: iand
/*     */     //   217: ifne -> 246
/*     */     //   220: iload #9
/*     */     //   222: aload #6
/*     */     //   224: aload #4
/*     */     //   226: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   231: ifeq -> 240
/*     */     //   234: sipush #2048
/*     */     //   237: goto -> 243
/*     */     //   240: sipush #1024
/*     */     //   243: ior
/*     */     //   244: istore #9
/*     */     //   246: iload #8
/*     */     //   248: bipush #8
/*     */     //   250: iand
/*     */     //   251: ifeq -> 265
/*     */     //   254: iload #9
/*     */     //   256: sipush #24576
/*     */     //   259: ior
/*     */     //   260: istore #9
/*     */     //   262: goto -> 300
/*     */     //   265: iload #7
/*     */     //   267: sipush #24576
/*     */     //   270: iand
/*     */     //   271: ifne -> 300
/*     */     //   274: iload #9
/*     */     //   276: aload #6
/*     */     //   278: aload #5
/*     */     //   280: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   285: ifeq -> 294
/*     */     //   288: sipush #16384
/*     */     //   291: goto -> 297
/*     */     //   294: sipush #8192
/*     */     //   297: ior
/*     */     //   298: istore #9
/*     */     //   300: iload #9
/*     */     //   302: sipush #9363
/*     */     //   305: iand
/*     */     //   306: sipush #9362
/*     */     //   309: if_icmpne -> 322
/*     */     //   312: aload #6
/*     */     //   314: invokeinterface getSkipping : ()Z
/*     */     //   319: ifne -> 512
/*     */     //   322: iload #8
/*     */     //   324: iconst_4
/*     */     //   325: iand
/*     */     //   326: ifeq -> 337
/*     */     //   329: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   332: checkcast androidx/compose/ui/Modifier
/*     */     //   335: astore #4
/*     */     //   337: iload #8
/*     */     //   339: bipush #8
/*     */     //   341: iand
/*     */     //   342: ifeq -> 348
/*     */     //   345: aconst_null
/*     */     //   346: astore #5
/*     */     //   348: invokestatic isTraceInProgress : ()Z
/*     */     //   351: ifeq -> 364
/*     */     //   354: ldc 405379283
/*     */     //   356: iload #9
/*     */     //   358: iconst_m1
/*     */     //   359: ldc 'org.jetbrains.jewel.ui.component.SimpleTabContent (Tabs.kt:65)'
/*     */     //   361: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   364: aload_0
/*     */     //   365: lload_2
/*     */     //   366: aload #4
/*     */     //   368: aload #5
/*     */     //   370: astore #10
/*     */     //   372: aload #6
/*     */     //   374: ldc -1431591537
/*     */     //   376: invokeinterface startReplaceGroup : (I)V
/*     */     //   381: aload #10
/*     */     //   383: dup
/*     */     //   384: ifnonnull -> 392
/*     */     //   387: pop
/*     */     //   388: aconst_null
/*     */     //   389: goto -> 436
/*     */     //   392: astore #12
/*     */     //   394: astore #17
/*     */     //   396: lstore #15
/*     */     //   398: astore #14
/*     */     //   400: iconst_0
/*     */     //   401: istore #13
/*     */     //   403: ldc -1798504093
/*     */     //   405: iconst_1
/*     */     //   406: new org/jetbrains/jewel/ui/component/TabsKt$SimpleTabContent$1$1
/*     */     //   409: dup
/*     */     //   410: aload #5
/*     */     //   412: invokespecial <init> : (Landroidx/compose/ui/graphics/painter/Painter;)V
/*     */     //   415: aload #6
/*     */     //   417: bipush #54
/*     */     //   419: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   422: checkcast kotlin/jvm/functions/Function2
/*     */     //   425: astore #18
/*     */     //   427: aload #14
/*     */     //   429: lload #15
/*     */     //   431: aload #17
/*     */     //   433: aload #18
/*     */     //   435: nop
/*     */     //   436: astore #11
/*     */     //   438: aload #6
/*     */     //   440: invokeinterface endReplaceGroup : ()V
/*     */     //   445: aload #11
/*     */     //   447: ldc -2017496883
/*     */     //   449: iconst_1
/*     */     //   450: new org/jetbrains/jewel/ui/component/TabsKt$SimpleTabContent$2
/*     */     //   453: dup
/*     */     //   454: aload_1
/*     */     //   455: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   458: aload #6
/*     */     //   460: bipush #54
/*     */     //   462: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   465: checkcast kotlin/jvm/functions/Function2
/*     */     //   468: aload #6
/*     */     //   470: sipush #24576
/*     */     //   473: bipush #14
/*     */     //   475: iload #9
/*     */     //   477: iand
/*     */     //   478: ior
/*     */     //   479: bipush #112
/*     */     //   481: iload #9
/*     */     //   483: iconst_3
/*     */     //   484: ishr
/*     */     //   485: iand
/*     */     //   486: ior
/*     */     //   487: sipush #896
/*     */     //   490: iload #9
/*     */     //   492: iconst_3
/*     */     //   493: ishr
/*     */     //   494: iand
/*     */     //   495: ior
/*     */     //   496: iconst_0
/*     */     //   497: invokestatic SimpleTabContent-iMiKU5w : (Lorg/jetbrains/jewel/ui/component/TabContentScope;JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   500: invokestatic isTraceInProgress : ()Z
/*     */     //   503: ifeq -> 519
/*     */     //   506: invokestatic traceEventEnd : ()V
/*     */     //   509: goto -> 519
/*     */     //   512: aload #6
/*     */     //   514: invokeinterface skipToGroupEnd : ()V
/*     */     //   519: aload #6
/*     */     //   521: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   526: dup
/*     */     //   527: ifnull -> 554
/*     */     //   530: aload_0
/*     */     //   531: aload_1
/*     */     //   532: lload_2
/*     */     //   533: aload #4
/*     */     //   535: aload #5
/*     */     //   537: iload #7
/*     */     //   539: iload #8
/*     */     //   541: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/component/TabContentScope;Ljava/lang/String;JLandroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;II)Lkotlin/jvm/functions/Function2;
/*     */     //   546: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   551: goto -> 555
/*     */     //   554: pop
/*     */     //   555: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #66	-> 12
/*     */     //   #64	-> 329
/*     */     //   #65	-> 345
/*     */     //   #66	-> 361
/*     */     //   #67	-> 364
/*     */     //   #68	-> 365
/*     */     //   #69	-> 366
/*     */     //   #70	-> 368
/*     */     //   #270	-> 394
/*     */     //   #70	-> 403
/*     */     //   #70	-> 435
/*     */     //   #70	-> 436
/*     */     //   #71	-> 447
/*     */     //   #67	-> 497
/*     */     //   #73	-> 512
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   403	22	13	$i$a$-let-TabsKt$SimpleTabContent$1	I
/*     */     //   400	25	12	it	Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   27	529	9	$dirty	I
/*     */     //   0	556	0	$this$SimpleTabContent_u2dA5h6_LM	Lorg/jetbrains/jewel/ui/component/TabContentScope;
/*     */     //   0	556	1	label	Ljava/lang/String;
/*     */     //   0	556	2	state	J
/*     */     //   0	556	4	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	556	5	icon	Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   0	556	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	556	7	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class TabsKt$SimpleTabContent$1$1
/*     */     implements Function2<Composer, Integer, Unit>
/*     */   {
/*     */     TabsKt$SimpleTabContent$1$1(Painter $icon) {}
/*     */     
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*  70 */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1798504093, $changed, -1, "org.jetbrains.jewel.ui.component.SimpleTabContent.<anonymous>.<anonymous> (Tabs.kt:69)");  IconKt.Icon-ww6aTOc(this.$icon, (String)null, (Modifier)null, 0L, $composer, 48, 12); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*  71 */        } } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class TabsKt$SimpleTabContent$2 implements Function2<Composer, Integer, Unit> { TabsKt$SimpleTabContent$2(String $label) {} @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-2017496883, $changed, -1, "org.jetbrains.jewel.ui.component.SimpleTabContent.<anonymous> (Tabs.kt:70)");  TextKt.Text-bAzTDeA(this.$label, null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65534); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */        }
/*     */      }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void SimpleTabContent-OOOwjN0(@NotNull TabContentScope $this$SimpleTabContent_u2dOOOwjN0, @NotNull String label, long state, @Nullable Modifier modifier, @Nullable IconKey iconKey, @NotNull PainterHint[] painterHints, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '$this$SimpleTabContent'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'label'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #6
/*     */     //   14: ldc 'painterHints'
/*     */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   19: aload #7
/*     */     //   21: ldc 506329515
/*     */     //   23: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   28: astore #7
/*     */     //   30: iload #8
/*     */     //   32: istore #10
/*     */     //   34: iload #9
/*     */     //   36: ldc -2147483648
/*     */     //   38: iand
/*     */     //   39: ifeq -> 52
/*     */     //   42: iload #10
/*     */     //   44: bipush #6
/*     */     //   46: ior
/*     */     //   47: istore #10
/*     */     //   49: goto -> 100
/*     */     //   52: iload #8
/*     */     //   54: bipush #6
/*     */     //   56: iand
/*     */     //   57: ifne -> 100
/*     */     //   60: iload #10
/*     */     //   62: iload #8
/*     */     //   64: bipush #8
/*     */     //   66: iand
/*     */     //   67: ifne -> 81
/*     */     //   70: aload #7
/*     */     //   72: aload_0
/*     */     //   73: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   78: goto -> 89
/*     */     //   81: aload #7
/*     */     //   83: aload_0
/*     */     //   84: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   89: ifeq -> 96
/*     */     //   92: iconst_4
/*     */     //   93: goto -> 97
/*     */     //   96: iconst_2
/*     */     //   97: ior
/*     */     //   98: istore #10
/*     */     //   100: iload #9
/*     */     //   102: iconst_1
/*     */     //   103: iand
/*     */     //   104: ifeq -> 117
/*     */     //   107: iload #10
/*     */     //   109: bipush #48
/*     */     //   111: ior
/*     */     //   112: istore #10
/*     */     //   114: goto -> 148
/*     */     //   117: iload #8
/*     */     //   119: bipush #48
/*     */     //   121: iand
/*     */     //   122: ifne -> 148
/*     */     //   125: iload #10
/*     */     //   127: aload #7
/*     */     //   129: aload_1
/*     */     //   130: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   135: ifeq -> 143
/*     */     //   138: bipush #32
/*     */     //   140: goto -> 145
/*     */     //   143: bipush #16
/*     */     //   145: ior
/*     */     //   146: istore #10
/*     */     //   148: iload #9
/*     */     //   150: iconst_2
/*     */     //   151: iand
/*     */     //   152: ifeq -> 166
/*     */     //   155: iload #10
/*     */     //   157: sipush #384
/*     */     //   160: ior
/*     */     //   161: istore #10
/*     */     //   163: goto -> 200
/*     */     //   166: iload #8
/*     */     //   168: sipush #384
/*     */     //   171: iand
/*     */     //   172: ifne -> 200
/*     */     //   175: iload #10
/*     */     //   177: aload #7
/*     */     //   179: lload_2
/*     */     //   180: invokeinterface changed : (J)Z
/*     */     //   185: ifeq -> 194
/*     */     //   188: sipush #256
/*     */     //   191: goto -> 197
/*     */     //   194: sipush #128
/*     */     //   197: ior
/*     */     //   198: istore #10
/*     */     //   200: iload #9
/*     */     //   202: iconst_4
/*     */     //   203: iand
/*     */     //   204: ifeq -> 218
/*     */     //   207: iload #10
/*     */     //   209: sipush #3072
/*     */     //   212: ior
/*     */     //   213: istore #10
/*     */     //   215: goto -> 253
/*     */     //   218: iload #8
/*     */     //   220: sipush #3072
/*     */     //   223: iand
/*     */     //   224: ifne -> 253
/*     */     //   227: iload #10
/*     */     //   229: aload #7
/*     */     //   231: aload #4
/*     */     //   233: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   238: ifeq -> 247
/*     */     //   241: sipush #2048
/*     */     //   244: goto -> 250
/*     */     //   247: sipush #1024
/*     */     //   250: ior
/*     */     //   251: istore #10
/*     */     //   253: iload #9
/*     */     //   255: bipush #8
/*     */     //   257: iand
/*     */     //   258: ifeq -> 272
/*     */     //   261: iload #10
/*     */     //   263: sipush #24576
/*     */     //   266: ior
/*     */     //   267: istore #10
/*     */     //   269: goto -> 327
/*     */     //   272: iload #8
/*     */     //   274: sipush #24576
/*     */     //   277: iand
/*     */     //   278: ifne -> 327
/*     */     //   281: iload #10
/*     */     //   283: iload #8
/*     */     //   285: ldc 32768
/*     */     //   287: iand
/*     */     //   288: ifne -> 303
/*     */     //   291: aload #7
/*     */     //   293: aload #5
/*     */     //   295: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   300: goto -> 312
/*     */     //   303: aload #7
/*     */     //   305: aload #5
/*     */     //   307: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   312: ifeq -> 321
/*     */     //   315: sipush #16384
/*     */     //   318: goto -> 324
/*     */     //   321: sipush #8192
/*     */     //   324: ior
/*     */     //   325: istore #10
/*     */     //   327: aload #7
/*     */     //   329: ldc -1431582956
/*     */     //   331: aload #6
/*     */     //   333: arraylength
/*     */     //   334: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   337: invokeinterface startMovableGroup : (ILjava/lang/Object;)V
/*     */     //   342: iconst_0
/*     */     //   343: istore #11
/*     */     //   345: aload #6
/*     */     //   347: arraylength
/*     */     //   348: istore #12
/*     */     //   350: iload #11
/*     */     //   352: iload #12
/*     */     //   354: if_icmpge -> 393
/*     */     //   357: aload #6
/*     */     //   359: iload #11
/*     */     //   361: aaload
/*     */     //   362: astore #13
/*     */     //   364: iload #10
/*     */     //   366: aload #7
/*     */     //   368: aload #13
/*     */     //   370: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   375: ifeq -> 383
/*     */     //   378: ldc 131072
/*     */     //   380: goto -> 384
/*     */     //   383: iconst_0
/*     */     //   384: ior
/*     */     //   385: istore #10
/*     */     //   387: iinc #11, 1
/*     */     //   390: goto -> 350
/*     */     //   393: aload #7
/*     */     //   395: invokeinterface endMovableGroup : ()V
/*     */     //   400: iload #10
/*     */     //   402: ldc 458752
/*     */     //   404: iand
/*     */     //   405: ifne -> 415
/*     */     //   408: iload #10
/*     */     //   410: ldc 65536
/*     */     //   412: ior
/*     */     //   413: istore #10
/*     */     //   415: iload #10
/*     */     //   417: ldc 74899
/*     */     //   419: iand
/*     */     //   420: ldc 74898
/*     */     //   422: if_icmpne -> 435
/*     */     //   425: aload #7
/*     */     //   427: invokeinterface getSkipping : ()Z
/*     */     //   432: ifne -> 627
/*     */     //   435: iload #9
/*     */     //   437: iconst_4
/*     */     //   438: iand
/*     */     //   439: ifeq -> 450
/*     */     //   442: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   445: checkcast androidx/compose/ui/Modifier
/*     */     //   448: astore #4
/*     */     //   450: iload #9
/*     */     //   452: bipush #8
/*     */     //   454: iand
/*     */     //   455: ifeq -> 461
/*     */     //   458: aconst_null
/*     */     //   459: astore #5
/*     */     //   461: invokestatic isTraceInProgress : ()Z
/*     */     //   464: ifeq -> 477
/*     */     //   467: ldc 506329515
/*     */     //   469: iload #10
/*     */     //   471: iconst_m1
/*     */     //   472: ldc 'org.jetbrains.jewel.ui.component.SimpleTabContent (Tabs.kt:81)'
/*     */     //   474: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   477: aload_0
/*     */     //   478: lload_2
/*     */     //   479: aload #4
/*     */     //   481: aload #5
/*     */     //   483: astore #11
/*     */     //   485: aload #7
/*     */     //   487: ldc -1431578556
/*     */     //   489: invokeinterface startReplaceGroup : (I)V
/*     */     //   494: aload #11
/*     */     //   496: dup
/*     */     //   497: ifnonnull -> 505
/*     */     //   500: pop
/*     */     //   501: aconst_null
/*     */     //   502: goto -> 551
/*     */     //   505: astore #14
/*     */     //   507: astore #19
/*     */     //   509: lstore #17
/*     */     //   511: astore #16
/*     */     //   513: iconst_0
/*     */     //   514: istore #15
/*     */     //   516: ldc 543761238
/*     */     //   518: iconst_1
/*     */     //   519: new org/jetbrains/jewel/ui/component/TabsKt$SimpleTabContent$4$1
/*     */     //   522: dup
/*     */     //   523: aload #5
/*     */     //   525: aload #6
/*     */     //   527: invokespecial <init> : (Lorg/jetbrains/jewel/ui/icon/IconKey;[Lorg/jetbrains/jewel/ui/painter/PainterHint;)V
/*     */     //   530: aload #7
/*     */     //   532: bipush #54
/*     */     //   534: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   537: checkcast kotlin/jvm/functions/Function2
/*     */     //   540: astore #20
/*     */     //   542: aload #16
/*     */     //   544: lload #17
/*     */     //   546: aload #19
/*     */     //   548: aload #20
/*     */     //   550: nop
/*     */     //   551: astore #12
/*     */     //   553: aload #7
/*     */     //   555: invokeinterface endReplaceGroup : ()V
/*     */     //   560: aload #12
/*     */     //   562: ldc -828608987
/*     */     //   564: iconst_1
/*     */     //   565: new org/jetbrains/jewel/ui/component/TabsKt$SimpleTabContent$5
/*     */     //   568: dup
/*     */     //   569: aload_1
/*     */     //   570: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   573: aload #7
/*     */     //   575: bipush #54
/*     */     //   577: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   580: checkcast kotlin/jvm/functions/Function2
/*     */     //   583: aload #7
/*     */     //   585: sipush #24576
/*     */     //   588: bipush #14
/*     */     //   590: iload #10
/*     */     //   592: iand
/*     */     //   593: ior
/*     */     //   594: bipush #112
/*     */     //   596: iload #10
/*     */     //   598: iconst_3
/*     */     //   599: ishr
/*     */     //   600: iand
/*     */     //   601: ior
/*     */     //   602: sipush #896
/*     */     //   605: iload #10
/*     */     //   607: iconst_3
/*     */     //   608: ishr
/*     */     //   609: iand
/*     */     //   610: ior
/*     */     //   611: iconst_0
/*     */     //   612: invokestatic SimpleTabContent-iMiKU5w : (Lorg/jetbrains/jewel/ui/component/TabContentScope;JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   615: invokestatic isTraceInProgress : ()Z
/*     */     //   618: ifeq -> 634
/*     */     //   621: invokestatic traceEventEnd : ()V
/*     */     //   624: goto -> 634
/*     */     //   627: aload #7
/*     */     //   629: invokeinterface skipToGroupEnd : ()V
/*     */     //   634: aload #7
/*     */     //   636: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   641: dup
/*     */     //   642: ifnull -> 671
/*     */     //   645: aload_0
/*     */     //   646: aload_1
/*     */     //   647: lload_2
/*     */     //   648: aload #4
/*     */     //   650: aload #5
/*     */     //   652: aload #6
/*     */     //   654: iload #8
/*     */     //   656: iload #9
/*     */     //   658: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/component/TabContentScope;Ljava/lang/String;JLandroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/icon/IconKey;[Lorg/jetbrains/jewel/ui/painter/PainterHint;II)Lkotlin/jvm/functions/Function2;
/*     */     //   663: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   668: goto -> 672
/*     */     //   671: pop
/*     */     //   672: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #82	-> 19
/*     */     //   #81	-> 337
/*     */     //   #82	-> 415
/*     */     //   #79	-> 442
/*     */     //   #80	-> 458
/*     */     //   #82	-> 474
/*     */     //   #83	-> 477
/*     */     //   #84	-> 478
/*     */     //   #85	-> 479
/*     */     //   #86	-> 481
/*     */     //   #270	-> 507
/*     */     //   #86	-> 516
/*     */     //   #86	-> 550
/*     */     //   #86	-> 551
/*     */     //   #87	-> 562
/*     */     //   #83	-> 612
/*     */     //   #89	-> 627
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   364	23	13	value	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   516	24	15	$i$a$-let-TabsKt$SimpleTabContent$4	I
/*     */     //   513	27	14	it	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   34	639	10	$dirty	I
/*     */     //   0	673	0	$this$SimpleTabContent_u2dOOOwjN0	Lorg/jetbrains/jewel/ui/component/TabContentScope;
/*     */     //   0	673	1	label	Ljava/lang/String;
/*     */     //   0	673	2	state	J
/*     */     //   0	673	4	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	673	5	iconKey	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	673	6	painterHints	[Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	673	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	673	8	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class TabsKt$SimpleTabContent$4$1 implements Function2<Composer, Integer, Unit> { TabsKt$SimpleTabContent$4$1(IconKey $iconKey, PainterHint[] $painterHints) {}
/*     */     
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*  86 */     public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(543761238, $changed, -1, "org.jetbrains.jewel.ui.component.SimpleTabContent.<anonymous>.<anonymous> (Tabs.kt:85)");  IconKt.Icon-FHprtrg(this.$iconKey, (String)null, (Modifier)null, (Class<?>)null, 0L, Arrays.<PainterHint>copyOf(this.$painterHints, this.$painterHints.length), $composer, 48, 28); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*  87 */        } } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class TabsKt$SimpleTabContent$5 implements Function2<Composer, Integer, Unit> { TabsKt$SimpleTabContent$5(String $label) {} @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-828608987, $changed, -1, "org.jetbrains.jewel.ui.component.SimpleTabContent.<anonymous> (Tabs.kt:86)");  TextKt.Text-bAzTDeA(this.$label, null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65534); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */        }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*     */   public static final void SimpleTabContent-iMiKU5w(@NotNull TabContentScope $this$SimpleTabContent_u2diMiKU5w, long state, @Nullable Modifier modifier, @Nullable Function2 icon, @NotNull Function2 label, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '$this$SimpleTabContent'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #5
/*     */     //   8: ldc 'label'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #6
/*     */     //   15: ldc 1589155045
/*     */     //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   22: astore #6
/*     */     //   24: iload #7
/*     */     //   26: istore #9
/*     */     //   28: iload #8
/*     */     //   30: ldc -2147483648
/*     */     //   32: iand
/*     */     //   33: ifeq -> 46
/*     */     //   36: iload #9
/*     */     //   38: bipush #6
/*     */     //   40: ior
/*     */     //   41: istore #9
/*     */     //   43: goto -> 94
/*     */     //   46: iload #7
/*     */     //   48: bipush #6
/*     */     //   50: iand
/*     */     //   51: ifne -> 94
/*     */     //   54: iload #9
/*     */     //   56: iload #7
/*     */     //   58: bipush #8
/*     */     //   60: iand
/*     */     //   61: ifne -> 75
/*     */     //   64: aload #6
/*     */     //   66: aload_0
/*     */     //   67: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   72: goto -> 83
/*     */     //   75: aload #6
/*     */     //   77: aload_0
/*     */     //   78: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   83: ifeq -> 90
/*     */     //   86: iconst_4
/*     */     //   87: goto -> 91
/*     */     //   90: iconst_2
/*     */     //   91: ior
/*     */     //   92: istore #9
/*     */     //   94: iload #8
/*     */     //   96: iconst_1
/*     */     //   97: iand
/*     */     //   98: ifeq -> 111
/*     */     //   101: iload #9
/*     */     //   103: bipush #48
/*     */     //   105: ior
/*     */     //   106: istore #9
/*     */     //   108: goto -> 142
/*     */     //   111: iload #7
/*     */     //   113: bipush #48
/*     */     //   115: iand
/*     */     //   116: ifne -> 142
/*     */     //   119: iload #9
/*     */     //   121: aload #6
/*     */     //   123: lload_1
/*     */     //   124: invokeinterface changed : (J)Z
/*     */     //   129: ifeq -> 137
/*     */     //   132: bipush #32
/*     */     //   134: goto -> 139
/*     */     //   137: bipush #16
/*     */     //   139: ior
/*     */     //   140: istore #9
/*     */     //   142: iload #8
/*     */     //   144: iconst_2
/*     */     //   145: iand
/*     */     //   146: ifeq -> 160
/*     */     //   149: iload #9
/*     */     //   151: sipush #384
/*     */     //   154: ior
/*     */     //   155: istore #9
/*     */     //   157: goto -> 194
/*     */     //   160: iload #7
/*     */     //   162: sipush #384
/*     */     //   165: iand
/*     */     //   166: ifne -> 194
/*     */     //   169: iload #9
/*     */     //   171: aload #6
/*     */     //   173: aload_3
/*     */     //   174: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   179: ifeq -> 188
/*     */     //   182: sipush #256
/*     */     //   185: goto -> 191
/*     */     //   188: sipush #128
/*     */     //   191: ior
/*     */     //   192: istore #9
/*     */     //   194: iload #8
/*     */     //   196: iconst_4
/*     */     //   197: iand
/*     */     //   198: ifeq -> 212
/*     */     //   201: iload #9
/*     */     //   203: sipush #3072
/*     */     //   206: ior
/*     */     //   207: istore #9
/*     */     //   209: goto -> 247
/*     */     //   212: iload #7
/*     */     //   214: sipush #3072
/*     */     //   217: iand
/*     */     //   218: ifne -> 247
/*     */     //   221: iload #9
/*     */     //   223: aload #6
/*     */     //   225: aload #4
/*     */     //   227: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   232: ifeq -> 241
/*     */     //   235: sipush #2048
/*     */     //   238: goto -> 244
/*     */     //   241: sipush #1024
/*     */     //   244: ior
/*     */     //   245: istore #9
/*     */     //   247: iload #8
/*     */     //   249: bipush #8
/*     */     //   251: iand
/*     */     //   252: ifeq -> 266
/*     */     //   255: iload #9
/*     */     //   257: sipush #24576
/*     */     //   260: ior
/*     */     //   261: istore #9
/*     */     //   263: goto -> 301
/*     */     //   266: iload #7
/*     */     //   268: sipush #24576
/*     */     //   271: iand
/*     */     //   272: ifne -> 301
/*     */     //   275: iload #9
/*     */     //   277: aload #6
/*     */     //   279: aload #5
/*     */     //   281: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   286: ifeq -> 295
/*     */     //   289: sipush #16384
/*     */     //   292: goto -> 298
/*     */     //   295: sipush #8192
/*     */     //   298: ior
/*     */     //   299: istore #9
/*     */     //   301: iload #9
/*     */     //   303: sipush #9363
/*     */     //   306: iand
/*     */     //   307: sipush #9362
/*     */     //   310: if_icmpne -> 323
/*     */     //   313: aload #6
/*     */     //   315: invokeinterface getSkipping : ()Z
/*     */     //   320: ifne -> 908
/*     */     //   323: iload #8
/*     */     //   325: iconst_2
/*     */     //   326: iand
/*     */     //   327: ifeq -> 337
/*     */     //   330: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   333: checkcast androidx/compose/ui/Modifier
/*     */     //   336: astore_3
/*     */     //   337: iload #8
/*     */     //   339: iconst_4
/*     */     //   340: iand
/*     */     //   341: ifeq -> 347
/*     */     //   344: aconst_null
/*     */     //   345: astore #4
/*     */     //   347: invokestatic isTraceInProgress : ()Z
/*     */     //   350: ifeq -> 363
/*     */     //   353: ldc 1589155045
/*     */     //   355: iload #9
/*     */     //   357: iconst_m1
/*     */     //   358: ldc 'org.jetbrains.jewel.ui.component.SimpleTabContent (Tabs.kt:96)'
/*     */     //   360: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   363: aload_0
/*     */     //   364: aload_3
/*     */     //   365: lload_1
/*     */     //   366: aload #6
/*     */     //   368: bipush #14
/*     */     //   370: iload #9
/*     */     //   372: bipush #6
/*     */     //   374: ishr
/*     */     //   375: iand
/*     */     //   376: bipush #112
/*     */     //   378: iload #9
/*     */     //   380: iand
/*     */     //   381: ior
/*     */     //   382: sipush #896
/*     */     //   385: iload #9
/*     */     //   387: bipush #6
/*     */     //   389: ishl
/*     */     //   390: iand
/*     */     //   391: ior
/*     */     //   392: invokeinterface tabContentAlpha-A_ZS63w : (Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
/*     */     //   397: astore #10
/*     */     //   399: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   402: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   405: astore #11
/*     */     //   407: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   410: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   413: aload #6
/*     */     //   415: bipush #6
/*     */     //   417: invokestatic getDefaultTabStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TabStyle;
/*     */     //   420: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/TabMetrics;
/*     */     //   423: invokevirtual getTabContentSpacing-D9Ej5fM : ()F
/*     */     //   426: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   429: astore #12
/*     */     //   431: sipush #384
/*     */     //   434: istore #13
/*     */     //   436: nop
/*     */     //   437: iconst_0
/*     */     //   438: istore #14
/*     */     //   440: aload #6
/*     */     //   442: ldc_w 693286680
/*     */     //   445: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   448: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   451: aload #12
/*     */     //   453: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */     //   456: aload #11
/*     */     //   458: aload #6
/*     */     //   460: bipush #14
/*     */     //   462: iload #13
/*     */     //   464: iconst_3
/*     */     //   465: ishr
/*     */     //   466: iand
/*     */     //   467: bipush #112
/*     */     //   469: iload #13
/*     */     //   471: iconst_3
/*     */     //   472: ishr
/*     */     //   473: iand
/*     */     //   474: ior
/*     */     //   475: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   478: astore #15
/*     */     //   480: bipush #112
/*     */     //   482: iload #13
/*     */     //   484: iconst_3
/*     */     //   485: ishl
/*     */     //   486: iand
/*     */     //   487: istore #16
/*     */     //   489: nop
/*     */     //   490: iconst_0
/*     */     //   491: istore #17
/*     */     //   493: aload #6
/*     */     //   495: ldc_w -1323940314
/*     */     //   498: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   501: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   504: aload #6
/*     */     //   506: iconst_0
/*     */     //   507: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   510: istore #18
/*     */     //   512: aload #6
/*     */     //   514: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   519: astore #19
/*     */     //   521: aload #6
/*     */     //   523: aload #10
/*     */     //   525: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   528: astore #20
/*     */     //   530: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   533: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   536: astore #21
/*     */     //   538: bipush #6
/*     */     //   540: sipush #896
/*     */     //   543: iload #16
/*     */     //   545: bipush #6
/*     */     //   547: ishl
/*     */     //   548: iand
/*     */     //   549: ior
/*     */     //   550: istore #22
/*     */     //   552: nop
/*     */     //   553: iconst_0
/*     */     //   554: istore #23
/*     */     //   556: aload #6
/*     */     //   558: ldc_w -692256719
/*     */     //   561: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   564: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   567: aload #6
/*     */     //   569: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   574: instanceof androidx/compose/runtime/Applier
/*     */     //   577: ifne -> 583
/*     */     //   580: invokestatic invalidApplier : ()V
/*     */     //   583: aload #6
/*     */     //   585: invokeinterface startReusableNode : ()V
/*     */     //   590: aload #6
/*     */     //   592: invokeinterface getInserting : ()Z
/*     */     //   597: ifeq -> 612
/*     */     //   600: aload #6
/*     */     //   602: aload #21
/*     */     //   604: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   609: goto -> 619
/*     */     //   612: aload #6
/*     */     //   614: invokeinterface useNode : ()V
/*     */     //   619: aload #6
/*     */     //   621: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   624: astore #24
/*     */     //   626: iconst_0
/*     */     //   627: istore #25
/*     */     //   629: aload #24
/*     */     //   631: aload #15
/*     */     //   633: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   636: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   639: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   642: aload #24
/*     */     //   644: aload #19
/*     */     //   646: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   649: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   652: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   655: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   658: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   661: astore #26
/*     */     //   663: iconst_0
/*     */     //   664: istore #27
/*     */     //   666: aload #24
/*     */     //   668: astore #28
/*     */     //   670: iconst_0
/*     */     //   671: istore #29
/*     */     //   673: aload #28
/*     */     //   675: invokeinterface getInserting : ()Z
/*     */     //   680: ifne -> 701
/*     */     //   683: aload #28
/*     */     //   685: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   690: iload #18
/*     */     //   692: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   695: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   698: ifne -> 727
/*     */     //   701: aload #28
/*     */     //   703: iload #18
/*     */     //   705: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   708: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   713: aload #24
/*     */     //   715: iload #18
/*     */     //   717: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   720: aload #26
/*     */     //   722: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   727: nop
/*     */     //   728: nop
/*     */     //   729: nop
/*     */     //   730: aload #24
/*     */     //   732: aload #20
/*     */     //   734: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   737: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   740: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   743: nop
/*     */     //   744: nop
/*     */     //   745: aload #6
/*     */     //   747: bipush #14
/*     */     //   749: iload #22
/*     */     //   751: bipush #6
/*     */     //   753: ishr
/*     */     //   754: iand
/*     */     //   755: istore #30
/*     */     //   757: astore #31
/*     */     //   759: iconst_0
/*     */     //   760: istore #32
/*     */     //   762: aload #31
/*     */     //   764: ldc_w -407840262
/*     */     //   767: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   770: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   773: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   776: aload #31
/*     */     //   778: bipush #6
/*     */     //   780: bipush #112
/*     */     //   782: iload #13
/*     */     //   784: bipush #6
/*     */     //   786: ishr
/*     */     //   787: iand
/*     */     //   788: ior
/*     */     //   789: istore #33
/*     */     //   791: astore #34
/*     */     //   793: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   796: astore #35
/*     */     //   798: iconst_0
/*     */     //   799: istore #36
/*     */     //   801: aload #34
/*     */     //   803: ldc_w 1396945379
/*     */     //   806: invokeinterface startReplaceGroup : (I)V
/*     */     //   811: aload #4
/*     */     //   813: ifnull -> 837
/*     */     //   816: aload #4
/*     */     //   818: aload #34
/*     */     //   820: bipush #14
/*     */     //   822: iload #9
/*     */     //   824: bipush #9
/*     */     //   826: ishr
/*     */     //   827: iand
/*     */     //   828: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   831: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   836: pop
/*     */     //   837: aload #34
/*     */     //   839: invokeinterface endReplaceGroup : ()V
/*     */     //   844: aload #5
/*     */     //   846: aload #34
/*     */     //   848: bipush #14
/*     */     //   850: iload #9
/*     */     //   852: bipush #12
/*     */     //   854: ishr
/*     */     //   855: iand
/*     */     //   856: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   859: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   864: pop
/*     */     //   865: nop
/*     */     //   866: aload #31
/*     */     //   868: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   871: aload #6
/*     */     //   873: invokeinterface endNode : ()V
/*     */     //   878: aload #6
/*     */     //   880: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   883: nop
/*     */     //   884: aload #6
/*     */     //   886: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   889: nop
/*     */     //   890: aload #6
/*     */     //   892: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   895: nop
/*     */     //   896: invokestatic isTraceInProgress : ()Z
/*     */     //   899: ifeq -> 915
/*     */     //   902: invokestatic traceEventEnd : ()V
/*     */     //   905: goto -> 915
/*     */     //   908: aload #6
/*     */     //   910: invokeinterface skipToGroupEnd : ()V
/*     */     //   915: aload #6
/*     */     //   917: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   922: dup
/*     */     //   923: ifnull -> 950
/*     */     //   926: aload_0
/*     */     //   927: lload_1
/*     */     //   928: aload_3
/*     */     //   929: aload #4
/*     */     //   931: aload #5
/*     */     //   933: iload #7
/*     */     //   935: iload #8
/*     */     //   937: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/component/TabContentScope;JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*     */     //   942: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   947: goto -> 951
/*     */     //   950: pop
/*     */     //   951: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #97	-> 13
/*     */     //   #94	-> 330
/*     */     //   #95	-> 344
/*     */     //   #97	-> 360
/*     */     //   #99	-> 363
/*     */     //   #100	-> 399
/*     */     //   #101	-> 407
/*     */     //   #98	-> 436
/*     */     //   #271	-> 448
/*     */     //   #272	-> 451
/*     */     //   #273	-> 489
/*     */     //   #274	-> 501
/*     */     //   #275	-> 507
/*     */     //   #276	-> 514
/*     */     //   #277	-> 523
/*     */     //   #279	-> 530
/*     */     //   #278	-> 552
/*     */     //   #280	-> 564
/*     */     //   #281	-> 567
/*     */     //   #282	-> 585
/*     */     //   #283	-> 590
/*     */     //   #284	-> 602
/*     */     //   #286	-> 614
/*     */     //   #288	-> 619
/*     */     //   #289	-> 629
/*     */     //   #290	-> 642
/*     */     //   #292	-> 655
/*     */     //   #293	-> 666
/*     */     //   #294	-> 673
/*     */     //   #295	-> 701
/*     */     //   #296	-> 713
/*     */     //   #298	-> 727
/*     */     //   #293	-> 728
/*     */     //   #298	-> 729
/*     */     //   #299	-> 730
/*     */     //   #300	-> 743
/*     */     //   #288	-> 744
/*     */     //   #301	-> 745
/*     */     //   #302	-> 770
/*     */     //   #103	-> 811
/*     */     //   #104	-> 816
/*     */     //   #106	-> 844
/*     */     //   #107	-> 865
/*     */     //   #302	-> 866
/*     */     //   #301	-> 871
/*     */     //   #303	-> 873
/*     */     //   #280	-> 880
/*     */     //   #304	-> 883
/*     */     //   #274	-> 886
/*     */     //   #305	-> 889
/*     */     //   #271	-> 892
/*     */     //   #306	-> 895
/*     */     //   #108	-> 908
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   801	65	36	$i$a$-Row-TabsKt$SimpleTabContent$7	I
/*     */     //   798	68	35	$this$SimpleTabContent_iMiKU5w_u24lambda_u244	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   798	68	34	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   798	68	33	$changed	I
/*     */     //   762	109	32	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   759	112	31	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   759	112	30	$changed$iv	I
/*     */     //   673	55	29	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   670	58	28	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   666	64	27	$i$f$set-impl	I
/*     */     //   663	67	26	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   629	115	25	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   626	118	24	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   556	328	23	$i$f$ReusableComposeNode	I
/*     */     //   553	331	21	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   553	331	22	$changed$iv$iv$iv	I
/*     */     //   493	397	17	$i$f$Layout	I
/*     */     //   512	378	18	compositeKeyHash$iv$iv	I
/*     */     //   521	369	19	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   530	360	20	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   490	400	16	$changed$iv$iv	I
/*     */     //   440	456	14	$i$f$Row	I
/*     */     //   480	416	15	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   437	459	13	$changed$iv	I
/*     */     //   28	924	9	$dirty	I
/*     */     //   0	952	0	$this$SimpleTabContent_u2diMiKU5w	Lorg/jetbrains/jewel/ui/component/TabContentScope;
/*     */     //   0	952	1	state	J
/*     */     //   0	952	3	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	952	4	icon	Lkotlin/jvm/functions/Function2;
/*     */     //   0	952	5	label	Lkotlin/jvm/functions/Function2;
/*     */     //   0	952	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	952	7	$changed	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void TabImpl(@Nullable Modifier modifier, boolean isActive, @NotNull TabData tabData, @Nullable MutableInteractionSource interactionSource, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc_w 'tabData'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #4
/*     */     //   9: ldc_w 1729334168
/*     */     //   12: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   17: astore #4
/*     */     //   19: iload #5
/*     */     //   21: istore #7
/*     */     //   23: iload #6
/*     */     //   25: iconst_1
/*     */     //   26: iand
/*     */     //   27: ifeq -> 40
/*     */     //   30: iload #7
/*     */     //   32: bipush #6
/*     */     //   34: ior
/*     */     //   35: istore #7
/*     */     //   37: goto -> 69
/*     */     //   40: iload #5
/*     */     //   42: bipush #6
/*     */     //   44: iand
/*     */     //   45: ifne -> 69
/*     */     //   48: iload #7
/*     */     //   50: aload #4
/*     */     //   52: aload_0
/*     */     //   53: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   58: ifeq -> 65
/*     */     //   61: iconst_4
/*     */     //   62: goto -> 66
/*     */     //   65: iconst_2
/*     */     //   66: ior
/*     */     //   67: istore #7
/*     */     //   69: iload #6
/*     */     //   71: iconst_2
/*     */     //   72: iand
/*     */     //   73: ifeq -> 86
/*     */     //   76: iload #7
/*     */     //   78: bipush #48
/*     */     //   80: ior
/*     */     //   81: istore #7
/*     */     //   83: goto -> 117
/*     */     //   86: iload #5
/*     */     //   88: bipush #48
/*     */     //   90: iand
/*     */     //   91: ifne -> 117
/*     */     //   94: iload #7
/*     */     //   96: aload #4
/*     */     //   98: iload_1
/*     */     //   99: invokeinterface changed : (Z)Z
/*     */     //   104: ifeq -> 112
/*     */     //   107: bipush #32
/*     */     //   109: goto -> 114
/*     */     //   112: bipush #16
/*     */     //   114: ior
/*     */     //   115: istore #7
/*     */     //   117: iload #6
/*     */     //   119: iconst_4
/*     */     //   120: iand
/*     */     //   121: ifeq -> 135
/*     */     //   124: iload #7
/*     */     //   126: sipush #384
/*     */     //   129: ior
/*     */     //   130: istore #7
/*     */     //   132: goto -> 169
/*     */     //   135: iload #5
/*     */     //   137: sipush #384
/*     */     //   140: iand
/*     */     //   141: ifne -> 169
/*     */     //   144: iload #7
/*     */     //   146: aload #4
/*     */     //   148: aload_2
/*     */     //   149: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   154: ifeq -> 163
/*     */     //   157: sipush #256
/*     */     //   160: goto -> 166
/*     */     //   163: sipush #128
/*     */     //   166: ior
/*     */     //   167: istore #7
/*     */     //   169: iload #6
/*     */     //   171: bipush #8
/*     */     //   173: iand
/*     */     //   174: ifeq -> 188
/*     */     //   177: iload #7
/*     */     //   179: sipush #3072
/*     */     //   182: ior
/*     */     //   183: istore #7
/*     */     //   185: goto -> 222
/*     */     //   188: iload #5
/*     */     //   190: sipush #3072
/*     */     //   193: iand
/*     */     //   194: ifne -> 222
/*     */     //   197: iload #7
/*     */     //   199: aload #4
/*     */     //   201: aload_3
/*     */     //   202: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   207: ifeq -> 216
/*     */     //   210: sipush #2048
/*     */     //   213: goto -> 219
/*     */     //   216: sipush #1024
/*     */     //   219: ior
/*     */     //   220: istore #7
/*     */     //   222: iload #7
/*     */     //   224: sipush #1171
/*     */     //   227: iand
/*     */     //   228: sipush #1170
/*     */     //   231: if_icmpne -> 244
/*     */     //   234: aload #4
/*     */     //   236: invokeinterface getSkipping : ()Z
/*     */     //   241: ifne -> 1241
/*     */     //   244: iload #6
/*     */     //   246: iconst_1
/*     */     //   247: iand
/*     */     //   248: ifeq -> 258
/*     */     //   251: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   254: checkcast androidx/compose/ui/Modifier
/*     */     //   257: astore_0
/*     */     //   258: iload #6
/*     */     //   260: bipush #8
/*     */     //   262: iand
/*     */     //   263: ifeq -> 351
/*     */     //   266: aload #4
/*     */     //   268: ldc_w 746211454
/*     */     //   271: invokeinterface startReplaceGroup : (I)V
/*     */     //   276: aload #4
/*     */     //   278: astore #9
/*     */     //   280: iconst_0
/*     */     //   281: istore #10
/*     */     //   283: iconst_0
/*     */     //   284: istore #11
/*     */     //   286: aload #9
/*     */     //   288: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   293: astore #12
/*     */     //   295: iconst_0
/*     */     //   296: istore #13
/*     */     //   298: aload #12
/*     */     //   300: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   303: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   306: if_acmpne -> 331
/*     */     //   309: iconst_0
/*     */     //   310: istore #14
/*     */     //   312: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   315: astore #14
/*     */     //   317: aload #9
/*     */     //   319: aload #14
/*     */     //   321: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   326: aload #14
/*     */     //   328: goto -> 333
/*     */     //   331: aload #12
/*     */     //   333: nop
/*     */     //   334: nop
/*     */     //   335: nop
/*     */     //   336: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   339: astore #8
/*     */     //   341: aload #4
/*     */     //   343: invokeinterface endReplaceGroup : ()V
/*     */     //   348: aload #8
/*     */     //   350: astore_3
/*     */     //   351: invokestatic isTraceInProgress : ()Z
/*     */     //   354: ifeq -> 369
/*     */     //   357: ldc_w 1729334168
/*     */     //   360: iload #7
/*     */     //   362: iconst_m1
/*     */     //   363: ldc_w 'org.jetbrains.jewel.ui.component.TabImpl (Tabs.kt:115)'
/*     */     //   366: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   369: aload_2
/*     */     //   370: astore #9
/*     */     //   372: aload #9
/*     */     //   374: instanceof org/jetbrains/jewel/ui/component/TabData$Default
/*     */     //   377: ifeq -> 414
/*     */     //   380: aload #4
/*     */     //   382: ldc_w 746215718
/*     */     //   385: invokeinterface startReplaceGroup : (I)V
/*     */     //   390: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   393: aload #4
/*     */     //   395: bipush #6
/*     */     //   397: invokestatic getDefaultTabStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TabStyle;
/*     */     //   400: astore #10
/*     */     //   402: aload #4
/*     */     //   404: invokeinterface endReplaceGroup : ()V
/*     */     //   409: aload #10
/*     */     //   411: goto -> 481
/*     */     //   414: aload #9
/*     */     //   416: instanceof org/jetbrains/jewel/ui/component/TabData$Editor
/*     */     //   419: ifeq -> 456
/*     */     //   422: aload #4
/*     */     //   424: ldc_w 746217637
/*     */     //   427: invokeinterface startReplaceGroup : (I)V
/*     */     //   432: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   435: aload #4
/*     */     //   437: bipush #6
/*     */     //   439: invokestatic getEditorTabStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TabStyle;
/*     */     //   442: astore #10
/*     */     //   444: aload #4
/*     */     //   446: invokeinterface endReplaceGroup : ()V
/*     */     //   451: aload #10
/*     */     //   453: goto -> 481
/*     */     //   456: aload #4
/*     */     //   458: ldc_w 746213865
/*     */     //   461: invokeinterface startReplaceGroup : (I)V
/*     */     //   466: aload #4
/*     */     //   468: invokeinterface endReplaceGroup : ()V
/*     */     //   473: new kotlin/NoWhenBranchMatchedException
/*     */     //   476: dup
/*     */     //   477: invokespecial <init> : ()V
/*     */     //   480: athrow
/*     */     //   481: astore #8
/*     */     //   483: aload #4
/*     */     //   485: ldc_w 746219183
/*     */     //   488: invokeinterface startReplaceGroup : (I)V
/*     */     //   493: aload #4
/*     */     //   495: astore #11
/*     */     //   497: iconst_0
/*     */     //   498: istore #12
/*     */     //   500: nop
/*     */     //   501: iconst_0
/*     */     //   502: istore #13
/*     */     //   504: aload #11
/*     */     //   506: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   511: astore #14
/*     */     //   513: iconst_0
/*     */     //   514: istore #15
/*     */     //   516: aload #14
/*     */     //   518: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   521: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   524: if_acmpne -> 572
/*     */     //   527: iconst_0
/*     */     //   528: istore #16
/*     */     //   530: getstatic org/jetbrains/jewel/ui/component/TabState.Companion : Lorg/jetbrains/jewel/ui/component/TabState$Companion;
/*     */     //   533: aload_2
/*     */     //   534: invokevirtual getSelected : ()Z
/*     */     //   537: iconst_0
/*     */     //   538: iconst_0
/*     */     //   539: iconst_0
/*     */     //   540: iload_1
/*     */     //   541: bipush #14
/*     */     //   543: aconst_null
/*     */     //   544: invokestatic of-59c8LF8$default : (Lorg/jetbrains/jewel/ui/component/TabState$Companion;ZZZZZILjava/lang/Object;)J
/*     */     //   547: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/TabState;
/*     */     //   550: aconst_null
/*     */     //   551: iconst_2
/*     */     //   552: aconst_null
/*     */     //   553: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   556: astore #17
/*     */     //   558: aload #11
/*     */     //   560: aload #17
/*     */     //   562: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   567: aload #17
/*     */     //   569: goto -> 574
/*     */     //   572: aload #14
/*     */     //   574: nop
/*     */     //   575: nop
/*     */     //   576: nop
/*     */     //   577: checkcast androidx/compose/runtime/MutableState
/*     */     //   580: astore #10
/*     */     //   582: aload #4
/*     */     //   584: invokeinterface endReplaceGroup : ()V
/*     */     //   589: aload #10
/*     */     //   591: astore #9
/*     */     //   593: aload_2
/*     */     //   594: invokevirtual getSelected : ()Z
/*     */     //   597: istore #10
/*     */     //   599: aload #4
/*     */     //   601: ldc_w 746222184
/*     */     //   604: invokeinterface startReplaceGroup : (I)V
/*     */     //   609: aload #4
/*     */     //   611: astore #11
/*     */     //   613: aload #4
/*     */     //   615: iload #10
/*     */     //   617: invokeinterface changed : (Z)Z
/*     */     //   622: iload #7
/*     */     //   624: bipush #112
/*     */     //   626: iand
/*     */     //   627: bipush #32
/*     */     //   629: if_icmpne -> 636
/*     */     //   632: iconst_1
/*     */     //   633: goto -> 637
/*     */     //   636: iconst_0
/*     */     //   637: ior
/*     */     //   638: istore #12
/*     */     //   640: iconst_0
/*     */     //   641: istore #13
/*     */     //   643: aload #11
/*     */     //   645: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   650: astore #14
/*     */     //   652: iconst_0
/*     */     //   653: istore #15
/*     */     //   655: iload #12
/*     */     //   657: ifne -> 671
/*     */     //   660: aload #14
/*     */     //   662: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   665: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   668: if_acmpne -> 716
/*     */     //   671: iconst_0
/*     */     //   672: istore #16
/*     */     //   674: aload #9
/*     */     //   676: aload #9
/*     */     //   678: invokestatic TabImpl$lambda$8 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   681: aload_2
/*     */     //   682: invokevirtual getSelected : ()Z
/*     */     //   685: iconst_0
/*     */     //   686: iconst_0
/*     */     //   687: iconst_0
/*     */     //   688: iload_1
/*     */     //   689: bipush #14
/*     */     //   691: aconst_null
/*     */     //   692: invokestatic copy-59c8LF8$default : (JZZZZZILjava/lang/Object;)J
/*     */     //   695: invokestatic TabImpl$lambda$9 : (Landroidx/compose/runtime/MutableState;J)V
/*     */     //   698: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   701: astore #17
/*     */     //   703: aload #11
/*     */     //   705: aload #17
/*     */     //   707: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   712: nop
/*     */     //   713: goto -> 717
/*     */     //   716: nop
/*     */     //   717: nop
/*     */     //   718: nop
/*     */     //   719: nop
/*     */     //   720: aload #4
/*     */     //   722: invokeinterface endReplaceGroup : ()V
/*     */     //   727: aload_3
/*     */     //   728: aload #4
/*     */     //   730: ldc_w 746227486
/*     */     //   733: invokeinterface startReplaceGroup : (I)V
/*     */     //   738: aload #4
/*     */     //   740: astore #11
/*     */     //   742: iload #7
/*     */     //   744: sipush #7168
/*     */     //   747: iand
/*     */     //   748: sipush #2048
/*     */     //   751: if_icmpne -> 758
/*     */     //   754: iconst_1
/*     */     //   755: goto -> 759
/*     */     //   758: iconst_0
/*     */     //   759: istore #12
/*     */     //   761: iconst_0
/*     */     //   762: istore #13
/*     */     //   764: aload #11
/*     */     //   766: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   771: astore #14
/*     */     //   773: iconst_0
/*     */     //   774: istore #15
/*     */     //   776: iload #12
/*     */     //   778: ifne -> 792
/*     */     //   781: aload #14
/*     */     //   783: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   786: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   789: if_acmpne -> 830
/*     */     //   792: astore #29
/*     */     //   794: iconst_0
/*     */     //   795: istore #16
/*     */     //   797: new org/jetbrains/jewel/ui/component/TabsKt$TabImpl$3$1
/*     */     //   800: dup
/*     */     //   801: aload_3
/*     */     //   802: aload #9
/*     */     //   804: aconst_null
/*     */     //   805: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   808: checkcast kotlin/jvm/functions/Function2
/*     */     //   811: aload #29
/*     */     //   813: swap
/*     */     //   814: astore #17
/*     */     //   816: aload #11
/*     */     //   818: aload #17
/*     */     //   820: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   825: aload #17
/*     */     //   827: goto -> 832
/*     */     //   830: aload #14
/*     */     //   832: nop
/*     */     //   833: nop
/*     */     //   834: nop
/*     */     //   835: checkcast kotlin/jvm/functions/Function2
/*     */     //   838: astore #10
/*     */     //   840: aload #4
/*     */     //   842: invokeinterface endReplaceGroup : ()V
/*     */     //   847: aload #10
/*     */     //   849: aload #4
/*     */     //   851: bipush #14
/*     */     //   853: iload #7
/*     */     //   855: bipush #9
/*     */     //   857: ishr
/*     */     //   858: iand
/*     */     //   859: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   862: aload #4
/*     */     //   864: ldc_w 746244575
/*     */     //   867: invokeinterface startReplaceGroup : (I)V
/*     */     //   872: aload #4
/*     */     //   874: astore #12
/*     */     //   876: iload #7
/*     */     //   878: bipush #112
/*     */     //   880: iand
/*     */     //   881: bipush #32
/*     */     //   883: if_icmpne -> 890
/*     */     //   886: iconst_1
/*     */     //   887: goto -> 891
/*     */     //   890: iconst_0
/*     */     //   891: istore #13
/*     */     //   893: nop
/*     */     //   894: iconst_0
/*     */     //   895: istore #14
/*     */     //   897: aload #12
/*     */     //   899: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   904: astore #15
/*     */     //   906: iconst_0
/*     */     //   907: istore #16
/*     */     //   909: iload #13
/*     */     //   911: ifne -> 925
/*     */     //   914: aload #15
/*     */     //   916: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   919: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   922: if_acmpne -> 967
/*     */     //   925: iconst_0
/*     */     //   926: istore #17
/*     */     //   928: getstatic org/jetbrains/jewel/ui/component/ButtonState.Companion : Lorg/jetbrains/jewel/ui/component/ButtonState$Companion;
/*     */     //   931: iconst_0
/*     */     //   932: iconst_0
/*     */     //   933: iconst_0
/*     */     //   934: iconst_0
/*     */     //   935: iload_1
/*     */     //   936: bipush #15
/*     */     //   938: aconst_null
/*     */     //   939: invokestatic of-oDpth28$default : (Lorg/jetbrains/jewel/ui/component/ButtonState$Companion;ZZZZZILjava/lang/Object;)J
/*     */     //   942: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/ButtonState;
/*     */     //   945: aconst_null
/*     */     //   946: iconst_2
/*     */     //   947: aconst_null
/*     */     //   948: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   951: astore #18
/*     */     //   953: aload #12
/*     */     //   955: aload #18
/*     */     //   957: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   962: aload #18
/*     */     //   964: goto -> 969
/*     */     //   967: aload #15
/*     */     //   969: nop
/*     */     //   970: nop
/*     */     //   971: nop
/*     */     //   972: checkcast androidx/compose/runtime/MutableState
/*     */     //   975: astore #11
/*     */     //   977: aload #4
/*     */     //   979: invokeinterface endReplaceGroup : ()V
/*     */     //   984: aload #11
/*     */     //   986: astore #10
/*     */     //   988: aload #8
/*     */     //   990: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/TabColors;
/*     */     //   993: aload #9
/*     */     //   995: invokestatic TabImpl$lambda$8 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   998: aload #4
/*     */     //   1000: iconst_0
/*     */     //   1001: invokevirtual underlineFor-UXw_FYk : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1004: astore #11
/*     */     //   1006: aload #8
/*     */     //   1008: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/TabMetrics;
/*     */     //   1011: invokevirtual getUnderlineThickness-D9Ej5fM : ()F
/*     */     //   1014: fstore #12
/*     */     //   1016: aload #8
/*     */     //   1018: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/TabColors;
/*     */     //   1021: aload #9
/*     */     //   1023: invokestatic TabImpl$lambda$8 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1026: aload #4
/*     */     //   1028: iconst_0
/*     */     //   1029: invokevirtual backgroundFor-UXw_FYk : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1032: astore #13
/*     */     //   1034: aload #4
/*     */     //   1036: ldc_w 746255519
/*     */     //   1039: invokeinterface startReplaceGroup : (I)V
/*     */     //   1044: aload #8
/*     */     //   1046: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/TabColors;
/*     */     //   1049: aload #9
/*     */     //   1051: invokestatic TabImpl$lambda$8 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1054: aload #4
/*     */     //   1056: iconst_0
/*     */     //   1057: invokevirtual contentFor-UXw_FYk : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1060: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   1065: checkcast androidx/compose/ui/graphics/Color
/*     */     //   1068: invokevirtual unbox-impl : ()J
/*     */     //   1071: lstore #18
/*     */     //   1073: iconst_0
/*     */     //   1074: istore #20
/*     */     //   1076: lload #18
/*     */     //   1078: lstore #21
/*     */     //   1080: iconst_0
/*     */     //   1081: istore #23
/*     */     //   1083: lload #21
/*     */     //   1085: ldc2_w 16
/*     */     //   1088: lcmp
/*     */     //   1089: ifeq -> 1096
/*     */     //   1092: iconst_1
/*     */     //   1093: goto -> 1097
/*     */     //   1096: iconst_0
/*     */     //   1097: ifeq -> 1105
/*     */     //   1100: lload #18
/*     */     //   1102: goto -> 1158
/*     */     //   1105: iconst_0
/*     */     //   1106: istore #24
/*     */     //   1108: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1111: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   1114: astore #25
/*     */     //   1116: iconst_0
/*     */     //   1117: istore #26
/*     */     //   1119: iconst_0
/*     */     //   1120: istore #27
/*     */     //   1122: aload #4
/*     */     //   1124: ldc_w 2023513938
/*     */     //   1127: ldc_w 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   1130: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1133: aload #4
/*     */     //   1135: aload #25
/*     */     //   1137: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   1142: astore #28
/*     */     //   1144: aload #4
/*     */     //   1146: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1149: aload #28
/*     */     //   1151: checkcast androidx/compose/ui/graphics/Color
/*     */     //   1154: invokevirtual unbox-impl : ()J
/*     */     //   1157: nop
/*     */     //   1158: lstore #16
/*     */     //   1160: aload #4
/*     */     //   1162: invokeinterface endReplaceGroup : ()V
/*     */     //   1167: lload #16
/*     */     //   1169: lstore #14
/*     */     //   1171: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1174: lload #14
/*     */     //   1176: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*     */     //   1179: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   1182: ldc_w 248291032
/*     */     //   1185: iconst_1
/*     */     //   1186: new org/jetbrains/jewel/ui/component/TabsKt$TabImpl$4
/*     */     //   1189: dup
/*     */     //   1190: aload_0
/*     */     //   1191: aload #8
/*     */     //   1193: aload_2
/*     */     //   1194: aload_3
/*     */     //   1195: fload #12
/*     */     //   1197: aload #11
/*     */     //   1199: aload #13
/*     */     //   1201: aload #10
/*     */     //   1203: aload #9
/*     */     //   1205: invokespecial <init> : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/TabStyle;Lorg/jetbrains/jewel/ui/component/TabData;Landroidx/compose/foundation/interaction/MutableInteractionSource;FLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
/*     */     //   1208: aload #4
/*     */     //   1210: bipush #54
/*     */     //   1212: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1215: checkcast kotlin/jvm/functions/Function2
/*     */     //   1218: aload #4
/*     */     //   1220: bipush #48
/*     */     //   1222: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*     */     //   1225: ior
/*     */     //   1226: invokestatic CompositionLocalProvider : (Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1229: invokestatic isTraceInProgress : ()Z
/*     */     //   1232: ifeq -> 1248
/*     */     //   1235: invokestatic traceEventEnd : ()V
/*     */     //   1238: goto -> 1248
/*     */     //   1241: aload #4
/*     */     //   1243: invokeinterface skipToGroupEnd : ()V
/*     */     //   1248: aload #4
/*     */     //   1250: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1255: dup
/*     */     //   1256: ifnull -> 1280
/*     */     //   1259: aload_0
/*     */     //   1260: iload_1
/*     */     //   1261: aload_2
/*     */     //   1262: aload_3
/*     */     //   1263: iload #5
/*     */     //   1265: iload #6
/*     */     //   1267: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/TabData;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)Lkotlin/jvm/functions/Function2;
/*     */     //   1272: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1277: goto -> 1281
/*     */     //   1280: pop
/*     */     //   1281: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #116	-> 7
/*     */     //   #112	-> 251
/*     */     //   #115	-> 266
/*     */     //   #307	-> 286
/*     */     //   #308	-> 298
/*     */     //   #309	-> 309
/*     */     //   #115	-> 312
/*     */     //   #309	-> 315
/*     */     //   #310	-> 317
/*     */     //   #311	-> 326
/*     */     //   #312	-> 331
/*     */     //   #308	-> 333
/*     */     //   #307	-> 334
/*     */     //   #307	-> 335
/*     */     //   #115	-> 336
/*     */     //   #116	-> 366
/*     */     //   #118	-> 369
/*     */     //   #119	-> 372
/*     */     //   #120	-> 414
/*     */     //   #118	-> 456
/*     */     //   #117	-> 481
/*     */     //   #123	-> 500
/*     */     //   #313	-> 504
/*     */     //   #314	-> 516
/*     */     //   #315	-> 527
/*     */     //   #123	-> 530
/*     */     //   #315	-> 556
/*     */     //   #316	-> 558
/*     */     //   #317	-> 567
/*     */     //   #318	-> 572
/*     */     //   #314	-> 574
/*     */     //   #313	-> 575
/*     */     //   #313	-> 576
/*     */     //   #123	-> 577
/*     */     //   #124	-> 593
/*     */     //   #319	-> 643
/*     */     //   #320	-> 655
/*     */     //   #321	-> 671
/*     */     //   #124	-> 674
/*     */     //   #321	-> 701
/*     */     //   #322	-> 703
/*     */     //   #323	-> 712
/*     */     //   #324	-> 716
/*     */     //   #320	-> 717
/*     */     //   #319	-> 718
/*     */     //   #319	-> 719
/*     */     //   #126	-> 727
/*     */     //   #325	-> 764
/*     */     //   #326	-> 776
/*     */     //   #327	-> 792
/*     */     //   #126	-> 797
/*     */     //   #327	-> 814
/*     */     //   #328	-> 816
/*     */     //   #329	-> 825
/*     */     //   #330	-> 830
/*     */     //   #326	-> 832
/*     */     //   #325	-> 833
/*     */     //   #325	-> 834
/*     */     //   #126	-> 835
/*     */     //   #137	-> 893
/*     */     //   #331	-> 897
/*     */     //   #332	-> 909
/*     */     //   #333	-> 925
/*     */     //   #137	-> 928
/*     */     //   #333	-> 951
/*     */     //   #334	-> 953
/*     */     //   #335	-> 962
/*     */     //   #336	-> 967
/*     */     //   #332	-> 969
/*     */     //   #331	-> 970
/*     */     //   #331	-> 971
/*     */     //   #137	-> 972
/*     */     //   #138	-> 988
/*     */     //   #139	-> 1006
/*     */     //   #140	-> 1016
/*     */     //   #142	-> 1044
/*     */     //   #337	-> 1076
/*     */     //   #338	-> 1083
/*     */     //   #337	-> 1097
/*     */     //   #142	-> 1108
/*     */     //   #339	-> 1130
/*     */     //   #142	-> 1151
/*     */     //   #337	-> 1157
/*     */     //   #142	-> 1158
/*     */     //   #144	-> 1171
/*     */     //   #220	-> 1241
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   312	3	14	$i$a$-cache-TabsKt$TabImpl$1	I
/*     */     //   317	11	14	value$iv	Ljava/lang/Object;
/*     */     //   298	36	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   295	39	12	it$iv	Ljava/lang/Object;
/*     */     //   286	50	11	$i$f$cache	I
/*     */     //   283	53	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   283	53	10	invalid$iv	Z
/*     */     //   530	26	16	$i$a$-cache-TabsKt$TabImpl$tabState$2	I
/*     */     //   558	11	17	value$iv	Ljava/lang/Object;
/*     */     //   516	59	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   513	62	14	it$iv	Ljava/lang/Object;
/*     */     //   504	73	13	$i$f$cache	I
/*     */     //   501	76	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   501	76	12	invalid$iv	Z
/*     */     //   674	24	16	$i$a$-cache-TabsKt$TabImpl$2	I
/*     */     //   703	10	17	value$iv	Ljava/lang/Object;
/*     */     //   655	63	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   652	66	14	it$iv	Ljava/lang/Object;
/*     */     //   643	77	13	$i$f$cache	I
/*     */     //   640	80	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   640	80	12	invalid$iv	Z
/*     */     //   797	14	16	$i$a$-cache-TabsKt$TabImpl$3	I
/*     */     //   816	11	17	value$iv	Ljava/lang/Object;
/*     */     //   776	57	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   773	60	14	it$iv	Ljava/lang/Object;
/*     */     //   764	71	13	$i$f$cache	I
/*     */     //   761	74	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   761	74	12	invalid$iv	Z
/*     */     //   928	23	17	$i$a$-cache-TabsKt$TabImpl$closeButtonState$2	I
/*     */     //   953	11	18	value$iv	Ljava/lang/Object;
/*     */     //   909	61	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   906	64	15	it$iv	Ljava/lang/Object;
/*     */     //   897	75	14	$i$f$cache	I
/*     */     //   894	78	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   894	78	13	invalid$iv	Z
/*     */     //   1122	29	27	$i$f$getCurrent	I
/*     */     //   1119	32	25	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   1119	32	26	$changed$iv	I
/*     */     //   1108	49	24	$i$a$-takeOrElse-DxMtmZc-TabsKt$TabImpl$resolvedContentColor$1	I
/*     */     //   1083	14	23	$i$f$isSpecified-8_81llA	I
/*     */     //   1080	17	21	$this$isSpecified$iv$iv	J
/*     */     //   1076	82	20	$i$f$takeOrElse-DxMtmZc	I
/*     */     //   1073	85	18	$this$takeOrElse_u2dDxMtmZc$iv	J
/*     */     //   483	755	8	tabStyle	Lorg/jetbrains/jewel/ui/component/styling/TabStyle;
/*     */     //   593	645	9	tabState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   988	250	10	closeButtonState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1006	232	11	lineColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   1016	222	12	lineThickness	F
/*     */     //   1034	204	13	backgroundColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   1171	67	14	resolvedContentColor	J
/*     */     //   23	1259	7	$dirty	I
/*     */     //   0	1282	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1282	1	isActive	Z
/*     */     //   0	1282	2	tabData	Lorg/jetbrains/jewel/ui/component/TabData;
/*     */     //   0	1282	3	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1282	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1282	5	$changed	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final long TabImpl$lambda$8(MutableState $tabState$delegate)
/*     */   {
/* 123 */     State state = (State)$tabState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 340 */       (TabState)state.getValue()).unbox-impl(); } private static final void TabImpl$lambda$9(MutableState $tabState$delegate, long <set-?>) { MutableState mutableState = $tabState$delegate; Object object1 = null, object2 = null; Object value$iv = TabState.box-impl(<set-?>); int $i$f$setValue = 0;
/* 341 */     mutableState.setValue(value$iv); } private static final long TabImpl$lambda$13(MutableState $closeButtonState$delegate) { State state = (State)$closeButtonState$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 343 */     return ((ButtonState)state.getValue()).unbox-impl(); } @DebugMetadata(f = "Tabs.kt", l = {127}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.TabsKt$TabImpl$3$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class TabsKt$TabImpl$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/* 344 */     int label; TabsKt$TabImpl$3$1(MutableInteractionSource $interactionSource, MutableState<TabState> $tabState$delegate, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$tabState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { TabsKt.TabImpl$lambda$9(this.$tabState$delegate, TabState.copy-59c8LF8$default(TabsKt.TabImpl$lambda$8(this.$tabState$delegate), false, false, true, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { TabsKt.TabImpl$lambda$9(this.$tabState$delegate, TabState.copy-59c8LF8$default(TabsKt.TabImpl$lambda$8(this.$tabState$delegate), false, false, false, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { TabsKt.TabImpl$lambda$9(this.$tabState$delegate, TabState.copy-59c8LF8$default(TabsKt.TabImpl$lambda$8(this.$tabState$delegate), false, false, false, true, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { TabsKt.TabImpl$lambda$9(this.$tabState$delegate, TabState.copy-59c8LF8$default(TabsKt.TabImpl$lambda$8(this.$tabState$delegate), false, false, false, false, false, 23, null)); }  return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$tabState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { TabsKt.TabImpl$lambda$9(this.$tabState$delegate, TabState.copy-59c8LF8$default(TabsKt.TabImpl$lambda$8(this.$tabState$delegate), false, false, true, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { TabsKt.TabImpl$lambda$9(this.$tabState$delegate, TabState.copy-59c8LF8$default(TabsKt.TabImpl$lambda$8(this.$tabState$delegate), false, false, false, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { TabsKt.TabImpl$lambda$9(this.$tabState$delegate, TabState.copy-59c8LF8$default(TabsKt.TabImpl$lambda$8(this.$tabState$delegate), false, false, false, true, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { TabsKt.TabImpl$lambda$9(this.$tabState$delegate, TabState.copy-59c8LF8$default(TabsKt.TabImpl$lambda$8(this.$tabState$delegate), false, false, false, false, false, 23, null)); }  return Unit.INSTANCE; } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super TabsKt$TabImpl$3$1> $completion) { return (Continuation<Unit>)new TabsKt$TabImpl$3$1(this.$interactionSource, this.$tabState$delegate, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((TabsKt$TabImpl$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final void TabImpl$lambda$14(MutableState $closeButtonState$delegate, long <set-?>) { MutableState mutableState = $closeButtonState$delegate; Object object1 = null, object2 = null; Object value$iv = ButtonState.box-impl(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); } private static final long TabImpl$lambda$15(State $lineColor$delegate) { State state = $lineColor$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 346 */     return ((Color)state.getValue()).unbox-impl(); } private static final long TabImpl$lambda$16(State $backgroundColor$delegate) { State state = $backgroundColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 347 */     return ((Color)state.getValue()).unbox-impl(); }
/*     */ 
/*     */   
/*     */   private static final Unit SimpleTabContent_A5h6_LM$lambda$1(TabContentScope $this_SimpleTabContent, String $label, long $state, Modifier $modifier, Painter $icon, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     SimpleTabContent-A5h6_LM($this_SimpleTabContent, $label, $state, $modifier, $icon, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit SimpleTabContent_OOOwjN0$lambda$3(TabContentScope $this_SimpleTabContent, String $label, long $state, Modifier $modifier, IconKey $iconKey, PainterHint[] $painterHints, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     SimpleTabContent-OOOwjN0($this_SimpleTabContent, $label, $state, $modifier, $iconKey, Arrays.<PainterHint>copyOf($painterHints, $painterHints.length), $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit SimpleTabContent_iMiKU5w$lambda$5(TabContentScope $this_SimpleTabContent, long $state, Modifier $modifier, Function2<? super Composer, ? super Integer, Unit> $icon, Function2<? super Composer, ? super Integer, Unit> $label, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     SimpleTabContent-iMiKU5w($this_SimpleTabContent, $state, $modifier, $icon, $label, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TabImpl$lambda$18(Modifier $modifier, boolean $isActive, TabData $tabData, MutableInteractionSource $interactionSource, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     TabImpl($modifier, $isActive, $tabData, $interactionSource, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nTabs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tabs.kt\norg/jetbrains/jewel/ui/component/TabsKt$TabImpl$4\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,269:1\n1225#2,6:270\n1225#2,6:276\n1225#2,6:282\n1225#2,6:320\n1225#2,6:326\n99#3,3:288\n102#3:319\n106#3:337\n79#4,6:291\n86#4,4:306\n90#4,2:316\n94#4:336\n368#5,9:297\n377#5:318\n378#5,2:334\n4034#6,6:310\n149#7:332\n149#7:333\n*S KotlinDebug\n*F\n+ 1 Tabs.kt\norg/jetbrains/jewel/ui/component/TabsKt$TabImpl$4\n*L\n149#1:270,6\n157#1:276,6\n172#1:282,6\n185#1:320,6\n186#1:326,6\n145#1:288,3\n145#1:319\n145#1:337\n145#1:291,6\n145#1:306,4\n145#1:316,2\n145#1:336\n145#1:297,9\n145#1:318\n145#1:334,2\n145#1:310,6\n211#1:332\n216#1:333\n*E\n"})
/*     */   static final class TabsKt$TabImpl$4 implements Function2<Composer, Integer, Unit> {
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
/*     */       //   13: ifne -> 1444
/*     */       //   16: invokestatic isTraceInProgress : ()Z
/*     */       //   19: ifeq -> 31
/*     */       //   22: ldc 248291032
/*     */       //   24: iload_2
/*     */       //   25: iconst_m1
/*     */       //   26: ldc 'org.jetbrains.jewel.ui.component.TabImpl.<anonymous> (Tabs.kt:144)'
/*     */       //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   31: aload_0
/*     */       //   32: getfield $modifier : Landroidx/compose/ui/Modifier;
/*     */       //   35: aload_0
/*     */       //   36: getfield $tabStyle : Lorg/jetbrains/jewel/ui/component/styling/TabStyle;
/*     */       //   39: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/TabMetrics;
/*     */       //   42: invokevirtual getTabHeight-D9Ej5fM : ()F
/*     */       //   45: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */       //   48: aload_0
/*     */       //   49: getfield $backgroundColor$delegate : Landroidx/compose/runtime/State;
/*     */       //   52: invokestatic access$TabImpl$lambda$16 : (Landroidx/compose/runtime/State;)J
/*     */       //   55: aconst_null
/*     */       //   56: iconst_2
/*     */       //   57: aconst_null
/*     */       //   58: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   61: aload_1
/*     */       //   62: ldc 848261066
/*     */       //   64: invokeinterface startReplaceGroup : (I)V
/*     */       //   69: aload_1
/*     */       //   70: astore #5
/*     */       //   72: iconst_0
/*     */       //   73: istore #6
/*     */       //   75: nop
/*     */       //   76: iconst_0
/*     */       //   77: istore #7
/*     */       //   79: aload #5
/*     */       //   81: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   86: astore #8
/*     */       //   88: iconst_0
/*     */       //   89: istore #9
/*     */       //   91: aload #8
/*     */       //   93: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   96: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   99: if_acmpne -> 131
/*     */       //   102: astore #45
/*     */       //   104: iconst_0
/*     */       //   105: istore #10
/*     */       //   107: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */       //   112: aload #45
/*     */       //   114: swap
/*     */       //   115: astore #10
/*     */       //   117: aload #5
/*     */       //   119: aload #10
/*     */       //   121: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   126: aload #10
/*     */       //   128: goto -> 133
/*     */       //   131: aload #8
/*     */       //   133: nop
/*     */       //   134: nop
/*     */       //   135: nop
/*     */       //   136: checkcast kotlin/jvm/functions/Function1
/*     */       //   139: astore #4
/*     */       //   141: aload_1
/*     */       //   142: invokeinterface endReplaceGroup : ()V
/*     */       //   147: aload #4
/*     */       //   149: invokestatic focusProperties : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */       //   152: astore_3
/*     */       //   153: aload_0
/*     */       //   154: getfield $tabData : Lorg/jetbrains/jewel/ui/component/TabData;
/*     */       //   157: invokevirtual getOnClick : ()Lkotlin/jvm/functions/Function0;
/*     */       //   160: astore #4
/*     */       //   162: aload_0
/*     */       //   163: getfield $tabData : Lorg/jetbrains/jewel/ui/component/TabData;
/*     */       //   166: invokevirtual getSelected : ()Z
/*     */       //   169: istore #5
/*     */       //   171: getstatic androidx/compose/ui/semantics/Role.Companion : Landroidx/compose/ui/semantics/Role$Companion;
/*     */       //   174: invokevirtual getTab-o7Vup1c : ()I
/*     */       //   177: istore #6
/*     */       //   179: aload_3
/*     */       //   180: iload #5
/*     */       //   182: aload_0
/*     */       //   183: getfield $interactionSource : Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */       //   186: aconst_null
/*     */       //   187: iconst_0
/*     */       //   188: iload #6
/*     */       //   190: invokestatic box-impl : (I)Landroidx/compose/ui/semantics/Role;
/*     */       //   193: aload #4
/*     */       //   195: bipush #8
/*     */       //   197: aconst_null
/*     */       //   198: invokestatic selectable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   201: aload_1
/*     */       //   202: ldc 848272095
/*     */       //   204: invokeinterface startReplaceGroup : (I)V
/*     */       //   209: aload_1
/*     */       //   210: astore #4
/*     */       //   212: aload_1
/*     */       //   213: aload_0
/*     */       //   214: getfield $lineThickness : F
/*     */       //   217: invokeinterface changed : (F)Z
/*     */       //   222: aload_1
/*     */       //   223: aload_0
/*     */       //   224: getfield $lineColor$delegate : Landroidx/compose/runtime/State;
/*     */       //   227: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   232: ior
/*     */       //   233: istore #5
/*     */       //   235: aload_0
/*     */       //   236: getfield $lineThickness : F
/*     */       //   239: fstore #6
/*     */       //   241: aload_0
/*     */       //   242: getfield $lineColor$delegate : Landroidx/compose/runtime/State;
/*     */       //   245: astore #7
/*     */       //   247: iconst_0
/*     */       //   248: istore #8
/*     */       //   250: aload #4
/*     */       //   252: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   257: astore #9
/*     */       //   259: iconst_0
/*     */       //   260: istore #10
/*     */       //   262: iload #5
/*     */       //   264: ifne -> 278
/*     */       //   267: aload #9
/*     */       //   269: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   272: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   275: if_acmpne -> 311
/*     */       //   278: astore #45
/*     */       //   280: iconst_0
/*     */       //   281: istore #11
/*     */       //   283: fload #6
/*     */       //   285: aload #7
/*     */       //   287: <illegal opcode> invoke : (FLandroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;
/*     */       //   292: aload #45
/*     */       //   294: swap
/*     */       //   295: astore #12
/*     */       //   297: aload #4
/*     */       //   299: aload #12
/*     */       //   301: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   306: aload #12
/*     */       //   308: goto -> 313
/*     */       //   311: aload #9
/*     */       //   313: nop
/*     */       //   314: nop
/*     */       //   315: nop
/*     */       //   316: checkcast kotlin/jvm/functions/Function1
/*     */       //   319: astore_3
/*     */       //   320: aload_1
/*     */       //   321: invokeinterface endReplaceGroup : ()V
/*     */       //   326: aload_3
/*     */       //   327: invokestatic drawBehind : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */       //   330: aload_0
/*     */       //   331: getfield $tabStyle : Lorg/jetbrains/jewel/ui/component/styling/TabStyle;
/*     */       //   334: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/TabMetrics;
/*     */       //   337: invokevirtual getTabPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*     */       //   340: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*     */       //   343: getstatic androidx/compose/ui/input/pointer/PointerEventType.Companion : Landroidx/compose/ui/input/pointer/PointerEventType$Companion;
/*     */       //   346: invokevirtual getRelease-7fucELk : ()I
/*     */       //   349: aconst_null
/*     */       //   350: aload_1
/*     */       //   351: ldc 848293893
/*     */       //   353: invokeinterface startReplaceGroup : (I)V
/*     */       //   358: aload_1
/*     */       //   359: astore #4
/*     */       //   361: aload_1
/*     */       //   362: aload_0
/*     */       //   363: getfield $tabData : Lorg/jetbrains/jewel/ui/component/TabData;
/*     */       //   366: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   371: istore #5
/*     */       //   373: aload_0
/*     */       //   374: getfield $tabData : Lorg/jetbrains/jewel/ui/component/TabData;
/*     */       //   377: astore #6
/*     */       //   379: iconst_0
/*     */       //   380: istore #7
/*     */       //   382: aload #4
/*     */       //   384: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   389: astore #8
/*     */       //   391: iconst_0
/*     */       //   392: istore #9
/*     */       //   394: iload #5
/*     */       //   396: ifne -> 410
/*     */       //   399: aload #8
/*     */       //   401: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   404: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   407: if_acmpne -> 452
/*     */       //   410: astore #47
/*     */       //   412: istore #46
/*     */       //   414: astore #45
/*     */       //   416: iconst_0
/*     */       //   417: istore #10
/*     */       //   419: aload #6
/*     */       //   421: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/component/TabData;)Lkotlin/jvm/functions/Function2;
/*     */       //   426: astore #48
/*     */       //   428: aload #45
/*     */       //   430: iload #46
/*     */       //   432: aload #47
/*     */       //   434: aload #48
/*     */       //   436: astore #11
/*     */       //   438: aload #4
/*     */       //   440: aload #11
/*     */       //   442: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   447: aload #11
/*     */       //   449: goto -> 454
/*     */       //   452: aload #8
/*     */       //   454: nop
/*     */       //   455: nop
/*     */       //   456: nop
/*     */       //   457: checkcast kotlin/jvm/functions/Function2
/*     */       //   460: astore_3
/*     */       //   461: aload_1
/*     */       //   462: invokeinterface endReplaceGroup : ()V
/*     */       //   467: aload_3
/*     */       //   468: iconst_2
/*     */       //   469: aconst_null
/*     */       //   470: invokestatic onPointerEvent-88W8MhQ$default : (Landroidx/compose/ui/Modifier;ILandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   473: astore_3
/*     */       //   474: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */       //   477: aload_0
/*     */       //   478: getfield $tabStyle : Lorg/jetbrains/jewel/ui/component/styling/TabStyle;
/*     */       //   481: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/TabMetrics;
/*     */       //   484: invokevirtual getCloseContentGap-D9Ej5fM : ()F
/*     */       //   487: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */       //   490: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */       //   493: astore #4
/*     */       //   495: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   498: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */       //   501: astore #5
/*     */       //   503: aload_0
/*     */       //   504: getfield $tabData : Lorg/jetbrains/jewel/ui/component/TabData;
/*     */       //   507: astore #6
/*     */       //   509: aload_0
/*     */       //   510: getfield $closeButtonState$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   513: astore #7
/*     */       //   515: aload_0
/*     */       //   516: getfield $tabStyle : Lorg/jetbrains/jewel/ui/component/styling/TabStyle;
/*     */       //   519: astore #8
/*     */       //   521: aload_0
/*     */       //   522: getfield $tabState$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   525: astore #9
/*     */       //   527: sipush #384
/*     */       //   530: istore #10
/*     */       //   532: iconst_0
/*     */       //   533: istore #11
/*     */       //   535: aload_1
/*     */       //   536: ldc_w 693286680
/*     */       //   539: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */       //   542: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   545: aload #4
/*     */       //   547: aload #5
/*     */       //   549: aload_1
/*     */       //   550: bipush #14
/*     */       //   552: iload #10
/*     */       //   554: iconst_3
/*     */       //   555: ishr
/*     */       //   556: iand
/*     */       //   557: bipush #112
/*     */       //   559: iload #10
/*     */       //   561: iconst_3
/*     */       //   562: ishr
/*     */       //   563: iand
/*     */       //   564: ior
/*     */       //   565: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   568: astore #12
/*     */       //   570: bipush #112
/*     */       //   572: iload #10
/*     */       //   574: iconst_3
/*     */       //   575: ishl
/*     */       //   576: iand
/*     */       //   577: istore #13
/*     */       //   579: nop
/*     */       //   580: iconst_0
/*     */       //   581: istore #14
/*     */       //   583: aload_1
/*     */       //   584: ldc_w -1323940314
/*     */       //   587: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   590: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   593: aload_1
/*     */       //   594: iconst_0
/*     */       //   595: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   598: istore #15
/*     */       //   600: aload_1
/*     */       //   601: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   606: astore #16
/*     */       //   608: aload_1
/*     */       //   609: aload_3
/*     */       //   610: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   613: astore #17
/*     */       //   615: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   618: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   621: astore #18
/*     */       //   623: bipush #6
/*     */       //   625: sipush #896
/*     */       //   628: iload #13
/*     */       //   630: bipush #6
/*     */       //   632: ishl
/*     */       //   633: iand
/*     */       //   634: ior
/*     */       //   635: istore #19
/*     */       //   637: nop
/*     */       //   638: iconst_0
/*     */       //   639: istore #20
/*     */       //   641: aload_1
/*     */       //   642: ldc_w -692256719
/*     */       //   645: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   648: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   651: aload_1
/*     */       //   652: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   657: instanceof androidx/compose/runtime/Applier
/*     */       //   660: ifne -> 666
/*     */       //   663: invokestatic invalidApplier : ()V
/*     */       //   666: aload_1
/*     */       //   667: invokeinterface startReusableNode : ()V
/*     */       //   672: aload_1
/*     */       //   673: invokeinterface getInserting : ()Z
/*     */       //   678: ifeq -> 692
/*     */       //   681: aload_1
/*     */       //   682: aload #18
/*     */       //   684: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   689: goto -> 698
/*     */       //   692: aload_1
/*     */       //   693: invokeinterface useNode : ()V
/*     */       //   698: aload_1
/*     */       //   699: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   702: astore #21
/*     */       //   704: iconst_0
/*     */       //   705: istore #22
/*     */       //   707: aload #21
/*     */       //   709: aload #12
/*     */       //   711: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   714: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   717: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   720: aload #21
/*     */       //   722: aload #16
/*     */       //   724: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   727: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   730: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   733: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   736: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   739: astore #23
/*     */       //   741: iconst_0
/*     */       //   742: istore #24
/*     */       //   744: aload #21
/*     */       //   746: astore #25
/*     */       //   748: iconst_0
/*     */       //   749: istore #26
/*     */       //   751: aload #25
/*     */       //   753: invokeinterface getInserting : ()Z
/*     */       //   758: ifne -> 779
/*     */       //   761: aload #25
/*     */       //   763: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   768: iload #15
/*     */       //   770: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   773: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   776: ifne -> 805
/*     */       //   779: aload #25
/*     */       //   781: iload #15
/*     */       //   783: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   786: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   791: aload #21
/*     */       //   793: iload #15
/*     */       //   795: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   798: aload #23
/*     */       //   800: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   805: nop
/*     */       //   806: nop
/*     */       //   807: nop
/*     */       //   808: aload #21
/*     */       //   810: aload #17
/*     */       //   812: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   815: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   818: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   821: nop
/*     */       //   822: nop
/*     */       //   823: aload_1
/*     */       //   824: bipush #14
/*     */       //   826: iload #19
/*     */       //   828: bipush #6
/*     */       //   830: ishr
/*     */       //   831: iand
/*     */       //   832: istore #27
/*     */       //   834: astore #28
/*     */       //   836: iconst_0
/*     */       //   837: istore #29
/*     */       //   839: aload #28
/*     */       //   841: ldc_w -407840262
/*     */       //   844: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */       //   847: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   850: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */       //   853: aload #28
/*     */       //   855: bipush #6
/*     */       //   857: bipush #112
/*     */       //   859: iload #10
/*     */       //   861: bipush #6
/*     */       //   863: ishr
/*     */       //   864: iand
/*     */       //   865: ior
/*     */       //   866: istore #30
/*     */       //   868: astore #31
/*     */       //   870: checkcast androidx/compose/foundation/layout/RowScope
/*     */       //   873: astore #32
/*     */       //   875: iconst_0
/*     */       //   876: istore #33
/*     */       //   878: aload #6
/*     */       //   880: invokevirtual getContent : ()Lkotlin/jvm/functions/Function4;
/*     */       //   883: new org/jetbrains/jewel/ui/component/TabContentScopeContainer
/*     */       //   886: dup
/*     */       //   887: invokespecial <init> : ()V
/*     */       //   890: aload #9
/*     */       //   892: invokestatic access$TabImpl$lambda$8 : (Landroidx/compose/runtime/MutableState;)J
/*     */       //   895: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/TabState;
/*     */       //   898: aload #31
/*     */       //   900: iconst_0
/*     */       //   901: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   904: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   909: pop
/*     */       //   910: aload #6
/*     */       //   912: astore #34
/*     */       //   914: aload #34
/*     */       //   916: instanceof org/jetbrains/jewel/ui/component/TabData$Default
/*     */       //   919: ifeq -> 933
/*     */       //   922: aload #6
/*     */       //   924: checkcast org/jetbrains/jewel/ui/component/TabData$Default
/*     */       //   927: invokevirtual getClosable : ()Z
/*     */       //   930: goto -> 990
/*     */       //   933: aload #34
/*     */       //   935: instanceof org/jetbrains/jewel/ui/component/TabData$Editor
/*     */       //   938: ifeq -> 982
/*     */       //   941: aload #6
/*     */       //   943: checkcast org/jetbrains/jewel/ui/component/TabData$Editor
/*     */       //   946: invokevirtual getClosable : ()Z
/*     */       //   949: ifeq -> 978
/*     */       //   952: aload #9
/*     */       //   954: invokestatic access$TabImpl$lambda$8 : (Landroidx/compose/runtime/MutableState;)J
/*     */       //   957: invokestatic isHovered-impl : (J)Z
/*     */       //   960: ifne -> 974
/*     */       //   963: aload #9
/*     */       //   965: invokestatic access$TabImpl$lambda$8 : (Landroidx/compose/runtime/MutableState;)J
/*     */       //   968: invokestatic isSelected-impl : (J)Z
/*     */       //   971: ifeq -> 978
/*     */       //   974: iconst_1
/*     */       //   975: goto -> 990
/*     */       //   978: iconst_0
/*     */       //   979: goto -> 990
/*     */       //   982: new kotlin/NoWhenBranchMatchedException
/*     */       //   985: dup
/*     */       //   986: invokespecial <init> : ()V
/*     */       //   989: athrow
/*     */       //   990: istore #35
/*     */       //   992: iload #35
/*     */       //   994: ifeq -> 1331
/*     */       //   997: aload #31
/*     */       //   999: ldc_w 107956748
/*     */       //   1002: invokeinterface startReplaceGroup : (I)V
/*     */       //   1007: aload #31
/*     */       //   1009: ldc_w -1797632644
/*     */       //   1012: invokeinterface startReplaceGroup : (I)V
/*     */       //   1017: aload #31
/*     */       //   1019: astore #36
/*     */       //   1021: iconst_0
/*     */       //   1022: istore #37
/*     */       //   1024: nop
/*     */       //   1025: iconst_0
/*     */       //   1026: istore #38
/*     */       //   1028: aload #36
/*     */       //   1030: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   1035: astore #39
/*     */       //   1037: iconst_0
/*     */       //   1038: istore #40
/*     */       //   1040: aload #39
/*     */       //   1042: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   1045: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   1048: if_acmpne -> 1073
/*     */       //   1051: iconst_0
/*     */       //   1052: istore #41
/*     */       //   1054: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */       //   1057: astore #41
/*     */       //   1059: aload #36
/*     */       //   1061: aload #41
/*     */       //   1063: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   1068: aload #41
/*     */       //   1070: goto -> 1075
/*     */       //   1073: aload #39
/*     */       //   1075: nop
/*     */       //   1076: nop
/*     */       //   1077: nop
/*     */       //   1078: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */       //   1081: astore #42
/*     */       //   1083: aload #31
/*     */       //   1085: invokeinterface endReplaceGroup : ()V
/*     */       //   1090: aload #42
/*     */       //   1092: astore #34
/*     */       //   1094: aload #34
/*     */       //   1096: aload #31
/*     */       //   1098: ldc_w -1797628671
/*     */       //   1101: invokeinterface startReplaceGroup : (I)V
/*     */       //   1106: aload #31
/*     */       //   1108: astore #36
/*     */       //   1110: aload #31
/*     */       //   1112: aload #7
/*     */       //   1114: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   1119: istore #37
/*     */       //   1121: iconst_0
/*     */       //   1122: istore #38
/*     */       //   1124: aload #36
/*     */       //   1126: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   1131: astore #39
/*     */       //   1133: iconst_0
/*     */       //   1134: istore #40
/*     */       //   1136: iload #37
/*     */       //   1138: ifne -> 1152
/*     */       //   1141: aload #39
/*     */       //   1143: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   1146: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   1149: if_acmpne -> 1191
/*     */       //   1152: astore #43
/*     */       //   1154: iconst_0
/*     */       //   1155: istore #41
/*     */       //   1157: new org/jetbrains/jewel/ui/component/TabsKt$TabImpl$4$4$1$1
/*     */       //   1160: dup
/*     */       //   1161: aload #34
/*     */       //   1163: aload #7
/*     */       //   1165: aconst_null
/*     */       //   1166: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */       //   1169: checkcast kotlin/jvm/functions/Function2
/*     */       //   1172: aload #43
/*     */       //   1174: swap
/*     */       //   1175: astore #44
/*     */       //   1177: aload #36
/*     */       //   1179: aload #44
/*     */       //   1181: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   1186: aload #44
/*     */       //   1188: goto -> 1193
/*     */       //   1191: aload #39
/*     */       //   1193: nop
/*     */       //   1194: nop
/*     */       //   1195: nop
/*     */       //   1196: checkcast kotlin/jvm/functions/Function2
/*     */       //   1199: astore #42
/*     */       //   1201: aload #31
/*     */       //   1203: invokeinterface endReplaceGroup : ()V
/*     */       //   1208: aload #42
/*     */       //   1210: aload #31
/*     */       //   1212: bipush #6
/*     */       //   1214: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */       //   1217: aload #8
/*     */       //   1219: invokevirtual getIcons : ()Lorg/jetbrains/jewel/ui/component/styling/TabIcons;
/*     */       //   1222: invokevirtual getClose : ()Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */       //   1225: astore #42
/*     */       //   1227: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   1230: astore #37
/*     */       //   1232: aload #6
/*     */       //   1234: invokevirtual getOnClose : ()Lkotlin/jvm/functions/Function0;
/*     */       //   1237: astore #38
/*     */       //   1239: getstatic androidx/compose/ui/semantics/Role.Companion : Landroidx/compose/ui/semantics/Role$Companion;
/*     */       //   1242: invokevirtual getButton-o7Vup1c : ()I
/*     */       //   1245: istore #39
/*     */       //   1247: aload #37
/*     */       //   1249: checkcast androidx/compose/ui/Modifier
/*     */       //   1252: aload #34
/*     */       //   1254: aconst_null
/*     */       //   1255: iconst_0
/*     */       //   1256: aconst_null
/*     */       //   1257: iload #39
/*     */       //   1259: invokestatic box-impl : (I)Landroidx/compose/ui/semantics/Role;
/*     */       //   1262: aload #38
/*     */       //   1264: bipush #12
/*     */       //   1266: aconst_null
/*     */       //   1267: invokestatic clickable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   1270: bipush #16
/*     */       //   1272: istore #37
/*     */       //   1274: iconst_0
/*     */       //   1275: istore #38
/*     */       //   1277: iload #37
/*     */       //   1279: i2f
/*     */       //   1280: invokestatic constructor-impl : (F)F
/*     */       //   1283: invokestatic size-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */       //   1286: astore #36
/*     */       //   1288: aload #7
/*     */       //   1290: invokestatic access$TabImpl$lambda$13 : (Landroidx/compose/runtime/MutableState;)J
/*     */       //   1293: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/ButtonState;
/*     */       //   1296: invokestatic Stateful : (Lorg/jetbrains/jewel/foundation/state/InteractiveComponentState;)Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */       //   1299: astore #37
/*     */       //   1301: aload #42
/*     */       //   1303: ldc_w 'Close tab'
/*     */       //   1306: aload #36
/*     */       //   1308: aconst_null
/*     */       //   1309: lconst_0
/*     */       //   1310: aload #37
/*     */       //   1312: aload #31
/*     */       //   1314: bipush #48
/*     */       //   1316: bipush #24
/*     */       //   1318: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;JLorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*     */       //   1321: aload #31
/*     */       //   1323: invokeinterface endReplaceGroup : ()V
/*     */       //   1328: goto -> 1405
/*     */       //   1331: aload #6
/*     */       //   1333: invokevirtual getClosable : ()Z
/*     */       //   1336: ifeq -> 1388
/*     */       //   1339: aload #31
/*     */       //   1341: ldc_w 109463441
/*     */       //   1344: invokeinterface startReplaceGroup : (I)V
/*     */       //   1349: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   1352: checkcast androidx/compose/ui/Modifier
/*     */       //   1355: bipush #16
/*     */       //   1357: istore #34
/*     */       //   1359: iconst_0
/*     */       //   1360: istore #42
/*     */       //   1362: iload #34
/*     */       //   1364: i2f
/*     */       //   1365: invokestatic constructor-impl : (F)F
/*     */       //   1368: invokestatic size-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */       //   1371: aload #31
/*     */       //   1373: bipush #6
/*     */       //   1375: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */       //   1378: aload #31
/*     */       //   1380: invokeinterface endReplaceGroup : ()V
/*     */       //   1385: goto -> 1405
/*     */       //   1388: aload #31
/*     */       //   1390: ldc_w 109521101
/*     */       //   1393: invokeinterface startReplaceGroup : (I)V
/*     */       //   1398: aload #31
/*     */       //   1400: invokeinterface endReplaceGroup : ()V
/*     */       //   1405: nop
/*     */       //   1406: aload #28
/*     */       //   1408: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1411: aload_1
/*     */       //   1412: invokeinterface endNode : ()V
/*     */       //   1417: aload_1
/*     */       //   1418: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1421: nop
/*     */       //   1422: aload_1
/*     */       //   1423: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1426: nop
/*     */       //   1427: aload_1
/*     */       //   1428: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1431: nop
/*     */       //   1432: invokestatic isTraceInProgress : ()Z
/*     */       //   1435: ifeq -> 1450
/*     */       //   1438: invokestatic traceEventEnd : ()V
/*     */       //   1441: goto -> 1450
/*     */       //   1444: aload_1
/*     */       //   1445: invokeinterface skipToGroupEnd : ()V
/*     */       //   1450: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #145	-> 0
/*     */       //   #146	-> 31
/*     */       //   #147	-> 35
/*     */       //   #148	-> 48
/*     */       //   #149	-> 75
/*     */       //   #270	-> 79
/*     */       //   #271	-> 91
/*     */       //   #272	-> 102
/*     */       //   #272	-> 115
/*     */       //   #273	-> 117
/*     */       //   #274	-> 126
/*     */       //   #275	-> 131
/*     */       //   #271	-> 133
/*     */       //   #270	-> 134
/*     */       //   #270	-> 135
/*     */       //   #149	-> 136
/*     */       //   #151	-> 153
/*     */       //   #152	-> 162
/*     */       //   #155	-> 171
/*     */       //   #149	-> 179
/*     */       //   #152	-> 180
/*     */       //   #153	-> 182
/*     */       //   #154	-> 186
/*     */       //   #150	-> 187
/*     */       //   #155	-> 188
/*     */       //   #151	-> 193
/*     */       //   #150	-> 195
/*     */       //   #157	-> 235
/*     */       //   #276	-> 250
/*     */       //   #277	-> 262
/*     */       //   #278	-> 278
/*     */       //   #157	-> 283
/*     */       //   #278	-> 295
/*     */       //   #279	-> 297
/*     */       //   #280	-> 306
/*     */       //   #281	-> 311
/*     */       //   #277	-> 313
/*     */       //   #276	-> 314
/*     */       //   #276	-> 315
/*     */       //   #157	-> 316
/*     */       //   #171	-> 330
/*     */       //   #172	-> 343
/*     */       //   #282	-> 382
/*     */       //   #283	-> 394
/*     */       //   #284	-> 410
/*     */       //   #172	-> 419
/*     */       //   #284	-> 436
/*     */       //   #285	-> 438
/*     */       //   #286	-> 447
/*     */       //   #287	-> 452
/*     */       //   #283	-> 454
/*     */       //   #282	-> 455
/*     */       //   #282	-> 456
/*     */       //   #172	-> 457
/*     */       //   #173	-> 474
/*     */       //   #174	-> 495
/*     */       //   #145	-> 503
/*     */       //   #288	-> 542
/*     */       //   #289	-> 545
/*     */       //   #290	-> 579
/*     */       //   #291	-> 590
/*     */       //   #292	-> 595
/*     */       //   #293	-> 601
/*     */       //   #294	-> 609
/*     */       //   #296	-> 615
/*     */       //   #295	-> 637
/*     */       //   #297	-> 648
/*     */       //   #298	-> 651
/*     */       //   #299	-> 667
/*     */       //   #300	-> 672
/*     */       //   #301	-> 682
/*     */       //   #303	-> 693
/*     */       //   #305	-> 698
/*     */       //   #306	-> 707
/*     */       //   #307	-> 720
/*     */       //   #309	-> 733
/*     */       //   #310	-> 744
/*     */       //   #311	-> 751
/*     */       //   #312	-> 779
/*     */       //   #313	-> 791
/*     */       //   #315	-> 805
/*     */       //   #310	-> 806
/*     */       //   #315	-> 807
/*     */       //   #316	-> 808
/*     */       //   #317	-> 821
/*     */       //   #305	-> 822
/*     */       //   #318	-> 823
/*     */       //   #319	-> 847
/*     */       //   #176	-> 878
/*     */       //   #179	-> 910
/*     */       //   #180	-> 914
/*     */       //   #181	-> 933
/*     */       //   #179	-> 982
/*     */       //   #178	-> 990
/*     */       //   #184	-> 992
/*     */       //   #185	-> 1024
/*     */       //   #320	-> 1028
/*     */       //   #321	-> 1040
/*     */       //   #322	-> 1051
/*     */       //   #185	-> 1054
/*     */       //   #322	-> 1057
/*     */       //   #323	-> 1059
/*     */       //   #324	-> 1068
/*     */       //   #325	-> 1073
/*     */       //   #321	-> 1075
/*     */       //   #320	-> 1076
/*     */       //   #320	-> 1077
/*     */       //   #185	-> 1078
/*     */       //   #186	-> 1094
/*     */       //   #326	-> 1124
/*     */       //   #327	-> 1136
/*     */       //   #328	-> 1152
/*     */       //   #186	-> 1157
/*     */       //   #328	-> 1175
/*     */       //   #329	-> 1177
/*     */       //   #330	-> 1186
/*     */       //   #331	-> 1191
/*     */       //   #327	-> 1193
/*     */       //   #326	-> 1194
/*     */       //   #326	-> 1195
/*     */       //   #186	-> 1196
/*     */       //   #203	-> 1217
/*     */       //   #205	-> 1227
/*     */       //   #208	-> 1232
/*     */       //   #209	-> 1239
/*     */       //   #205	-> 1247
/*     */       //   #206	-> 1252
/*     */       //   #207	-> 1254
/*     */       //   #205	-> 1255
/*     */       //   #209	-> 1257
/*     */       //   #208	-> 1262
/*     */       //   #205	-> 1264
/*     */       //   #211	-> 1270
/*     */       //   #332	-> 1277
/*     */       //   #211	-> 1283
/*     */       //   #213	-> 1288
/*     */       //   #203	-> 1301
/*     */       //   #212	-> 1303
/*     */       //   #211	-> 1306
/*     */       //   #213	-> 1310
/*     */       //   #202	-> 1318
/*     */       //   #184	-> 1321
/*     */       //   #215	-> 1331
/*     */       //   #216	-> 1349
/*     */       //   #333	-> 1362
/*     */       //   #216	-> 1368
/*     */       //   #215	-> 1378
/*     */       //   #217	-> 1388
/*     */       //   #218	-> 1405
/*     */       //   #319	-> 1406
/*     */       //   #318	-> 1411
/*     */       //   #334	-> 1412
/*     */       //   #297	-> 1418
/*     */       //   #335	-> 1421
/*     */       //   #291	-> 1423
/*     */       //   #336	-> 1426
/*     */       //   #288	-> 1428
/*     */       //   #337	-> 1431
/*     */       //   #218	-> 1444
/*     */       //   #219	-> 1450
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   107	5	10	$i$a$-cache-TabsKt$TabImpl$4$1	I
/*     */       //   117	11	10	value$iv	Ljava/lang/Object;
/*     */       //   91	43	9	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   88	46	8	it$iv	Ljava/lang/Object;
/*     */       //   79	57	7	$i$f$cache	I
/*     */       //   76	60	5	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   76	60	6	invalid$iv	Z
/*     */       //   283	9	11	$i$a$-cache-TabsKt$TabImpl$4$2	I
/*     */       //   297	11	12	value$iv	Ljava/lang/Object;
/*     */       //   262	52	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   259	55	9	it$iv	Ljava/lang/Object;
/*     */       //   250	66	8	$i$f$cache	I
/*     */       //   247	69	4	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   247	69	5	invalid$iv	Z
/*     */       //   419	7	10	$i$a$-cache-TabsKt$TabImpl$4$3	I
/*     */       //   438	11	11	value$iv	Ljava/lang/Object;
/*     */       //   394	61	9	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   391	64	8	it$iv	Ljava/lang/Object;
/*     */       //   382	75	7	$i$f$cache	I
/*     */       //   379	78	4	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   379	78	5	invalid$iv	Z
/*     */       //   1054	3	41	$i$a$-cache-TabsKt$TabImpl$4$4$closeActionInteractionSource$1	I
/*     */       //   1059	11	41	value$iv	Ljava/lang/Object;
/*     */       //   1040	36	40	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   1037	39	39	it$iv	Ljava/lang/Object;
/*     */       //   1028	50	38	$i$f$cache	I
/*     */       //   1025	53	36	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1025	53	37	invalid$iv	Z
/*     */       //   1157	15	41	$i$a$-cache-TabsKt$TabImpl$4$4$1	I
/*     */       //   1177	11	44	value$iv	Ljava/lang/Object;
/*     */       //   1136	58	40	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   1133	61	39	it$iv	Ljava/lang/Object;
/*     */       //   1124	72	38	$i$f$cache	I
/*     */       //   1121	75	36	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1121	75	37	invalid$iv	Z
/*     */       //   1277	6	38	$i$f$getDp	I
/*     */       //   1274	9	37	$this$dp$iv	I
/*     */       //   1094	227	34	closeActionInteractionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */       //   1362	6	42	$i$f$getDp	I
/*     */       //   1359	9	34	$this$dp$iv	I
/*     */       //   878	528	33	$i$a$-Row-TabsKt$TabImpl$4$4	I
/*     */       //   992	414	35	showCloseIcon	Z
/*     */       //   875	531	32	$this$invoke_u24lambda_u248	Landroidx/compose/foundation/layout/RowScope;
/*     */       //   875	531	31	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   875	531	30	$changed	I
/*     */       //   839	572	29	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */       //   836	575	28	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   836	575	27	$changed$iv	I
/*     */       //   751	55	26	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   748	58	25	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   744	64	24	$i$f$set-impl	I
/*     */       //   741	67	23	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   707	115	22	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   704	118	21	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   641	781	20	$i$f$ReusableComposeNode	I
/*     */       //   638	784	18	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   638	784	19	$changed$iv$iv$iv	I
/*     */       //   583	844	14	$i$f$Layout	I
/*     */       //   600	827	15	compositeKeyHash$iv$iv	I
/*     */       //   608	819	16	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   615	812	17	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   580	847	13	$changed$iv$iv	I
/*     */       //   535	897	11	$i$f$Row	I
/*     */       //   570	862	12	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   532	900	3	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */       //   532	900	4	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */       //   532	900	5	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */       //   532	900	10	$changed$iv	I
/*     */       //   0	1451	0	this	Lorg/jetbrains/jewel/ui/component/TabsKt$TabImpl$4;
/*     */       //   0	1451	1	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	1451	2	$changed	I
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$1$lambda$0(FocusProperties $this$focusProperties) {
/*     */       Intrinsics.checkNotNullParameter($this$focusProperties, "$this$focusProperties");
/*     */       $this$focusProperties.setCanFocus(false);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$3$lambda$2(float $lineThickness, State $lineColor$delegate, DrawScope $this$drawBehind) {
/*     */       Intrinsics.checkNotNullParameter($this$drawBehind, "$this$drawBehind");
/*     */       float strokeThickness = $this$drawBehind.toPx-0680j_4($lineThickness);
/*     */       float startY = Size.getHeight-impl($this$drawBehind.getSize-NH-jbRc()) - strokeThickness / 2.0F;
/*     */       float endX = Size.getWidth-impl($this$drawBehind.getSize-NH-jbRc());
/*     */       float capDxFix = strokeThickness / 2.0F;
/*     */       DrawScope.drawLine-1RTmtNc$default($this$drawBehind, (Brush)new SolidColor(TabsKt.TabImpl$lambda$15($lineColor$delegate), null), OffsetKt.Offset(false + capDxFix, startY), OffsetKt.Offset(endX - capDxFix, startY), strokeThickness, StrokeCap.Companion.getRound-KaPHkGw(), null, 0.0F, null, 0, 480, null);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$5$lambda$4(TabData $tabData, AwaitPointerEventScope $this$onPointerEvent, PointerEvent it) {
/*     */       Intrinsics.checkNotNullParameter($this$onPointerEvent, "$this$onPointerEvent");
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       if (PointerButton_skikoKt.isTertiary-_2OYLqQ(it.getButton-RaE_XpY()))
/*     */         $tabData.getOnClose().invoke(); 
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     TabsKt$TabImpl$4(Modifier $modifier, TabStyle $tabStyle, TabData $tabData, MutableInteractionSource $interactionSource, float $lineThickness, State<Color> $lineColor$delegate, State<Color> $backgroundColor$delegate, MutableState<ButtonState> $closeButtonState$delegate, MutableState<TabState> $tabState$delegate) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TabsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */