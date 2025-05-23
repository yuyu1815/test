package org.jetbrains.jewel.ui.component;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import org.jetbrains.annotations.ApiStatus.ScheduledForRemoval;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jewel.ui.icon.IntelliJIconKey;
import org.jetbrains.jewel.ui.painter.PainterHint;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\021\n\002\b\002\032=\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\006\020\n\032\0020\013H\007¢\006\004\b\f\020\r\032I\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\022\020\016\032\n\022\006\b\001\022\0020\0130\017\"\0020\013H\007¢\006\004\b\f\020\020¨\006\021"}, d2 = {"PlatformIcon", "", "key", "Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "tint", "Landroidx/compose/ui/graphics/Color;", "hint", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "PlatformIcon-uDo3WH8", "(Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V", "hints", "", "(Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V", "ui"})
public final class PlatformIconKt {
  @Deprecated(message = "Use Icon directly, this doesn't have any advantage over it anymore.", replaceWith = @ReplaceWith(expression = "Icon(key, contentDescription, modifier, tint, hint)", imports = {"com.jewel.ui.component.Icon"}))
  @ScheduledForRemoval(inVersion = "Before 1.0")
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public static final void PlatformIcon-uDo3WH8(@NotNull IntelliJIconKey key, @Nullable String contentDescription, @Nullable Modifier modifier, long tint, @NotNull PainterHint hint, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'key'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload #5
    //   8: ldc 'hint'
    //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   13: aload #6
    //   15: ldc 246960338
    //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   22: astore #6
    //   24: iload #7
    //   26: istore #9
    //   28: iload #8
    //   30: iconst_1
    //   31: iand
    //   32: ifeq -> 45
    //   35: iload #9
    //   37: bipush #6
    //   39: ior
    //   40: istore #9
    //   42: goto -> 74
    //   45: iload #7
    //   47: bipush #6
    //   49: iand
    //   50: ifne -> 74
    //   53: iload #9
    //   55: aload #6
    //   57: aload_0
    //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   63: ifeq -> 70
    //   66: iconst_4
    //   67: goto -> 71
    //   70: iconst_2
    //   71: ior
    //   72: istore #9
    //   74: iload #8
    //   76: iconst_2
    //   77: iand
    //   78: ifeq -> 91
    //   81: iload #9
    //   83: bipush #48
    //   85: ior
    //   86: istore #9
    //   88: goto -> 122
    //   91: iload #7
    //   93: bipush #48
    //   95: iand
    //   96: ifne -> 122
    //   99: iload #9
    //   101: aload #6
    //   103: aload_1
    //   104: invokeinterface changed : (Ljava/lang/Object;)Z
    //   109: ifeq -> 117
    //   112: bipush #32
    //   114: goto -> 119
    //   117: bipush #16
    //   119: ior
    //   120: istore #9
    //   122: iload #8
    //   124: iconst_4
    //   125: iand
    //   126: ifeq -> 140
    //   129: iload #9
    //   131: sipush #384
    //   134: ior
    //   135: istore #9
    //   137: goto -> 174
    //   140: iload #7
    //   142: sipush #384
    //   145: iand
    //   146: ifne -> 174
    //   149: iload #9
    //   151: aload #6
    //   153: aload_2
    //   154: invokeinterface changed : (Ljava/lang/Object;)Z
    //   159: ifeq -> 168
    //   162: sipush #256
    //   165: goto -> 171
    //   168: sipush #128
    //   171: ior
    //   172: istore #9
    //   174: iload #8
    //   176: bipush #8
    //   178: iand
    //   179: ifeq -> 193
    //   182: iload #9
    //   184: sipush #3072
    //   187: ior
    //   188: istore #9
    //   190: goto -> 227
    //   193: iload #7
    //   195: sipush #3072
    //   198: iand
    //   199: ifne -> 227
    //   202: iload #9
    //   204: aload #6
    //   206: lload_3
    //   207: invokeinterface changed : (J)Z
    //   212: ifeq -> 221
    //   215: sipush #2048
    //   218: goto -> 224
    //   221: sipush #1024
    //   224: ior
    //   225: istore #9
    //   227: iload #8
    //   229: bipush #16
    //   231: iand
    //   232: ifeq -> 246
    //   235: iload #9
    //   237: sipush #24576
    //   240: ior
    //   241: istore #9
    //   243: goto -> 281
    //   246: iload #7
    //   248: sipush #24576
    //   251: iand
    //   252: ifne -> 281
    //   255: iload #9
    //   257: aload #6
    //   259: aload #5
    //   261: invokeinterface changed : (Ljava/lang/Object;)Z
    //   266: ifeq -> 275
    //   269: sipush #16384
    //   272: goto -> 278
    //   275: sipush #8192
    //   278: ior
    //   279: istore #9
    //   281: iload #9
    //   283: sipush #9363
    //   286: iand
    //   287: sipush #9362
    //   290: if_icmpne -> 303
    //   293: aload #6
    //   295: invokeinterface getSkipping : ()Z
    //   300: ifne -> 409
    //   303: iload #8
    //   305: iconst_4
    //   306: iand
    //   307: ifeq -> 317
    //   310: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   313: checkcast androidx/compose/ui/Modifier
    //   316: astore_2
    //   317: iload #8
    //   319: bipush #8
    //   321: iand
    //   322: ifeq -> 332
    //   325: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   328: invokevirtual getUnspecified-0d7_KjU : ()J
    //   331: lstore_3
    //   332: invokestatic isTraceInProgress : ()Z
    //   335: ifeq -> 348
    //   338: ldc 246960338
    //   340: iload #9
    //   342: iconst_m1
    //   343: ldc 'org.jetbrains.jewel.ui.component.PlatformIcon (PlatformIcon.kt:21)'
    //   345: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   348: aload_0
    //   349: aload_1
    //   350: aload_2
    //   351: lload_3
    //   352: iconst_1
    //   353: anewarray org/jetbrains/jewel/ui/painter/PainterHint
    //   356: astore #10
    //   358: aload #10
    //   360: iconst_0
    //   361: aload #5
    //   363: aastore
    //   364: aload #10
    //   366: aload #6
    //   368: bipush #14
    //   370: iload #9
    //   372: iand
    //   373: bipush #112
    //   375: iload #9
    //   377: iand
    //   378: ior
    //   379: sipush #896
    //   382: iload #9
    //   384: iand
    //   385: ior
    //   386: sipush #7168
    //   389: iload #9
    //   391: iand
    //   392: ior
    //   393: iconst_0
    //   394: invokestatic PlatformIcon-uDo3WH8 : (Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
    //   397: invokestatic isTraceInProgress : ()Z
    //   400: ifeq -> 416
    //   403: invokestatic traceEventEnd : ()V
    //   406: goto -> 416
    //   409: aload #6
    //   411: invokeinterface skipToGroupEnd : ()V
    //   416: aload #6
    //   418: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   423: dup
    //   424: ifnull -> 450
    //   427: aload_0
    //   428: aload_1
    //   429: aload_2
    //   430: lload_3
    //   431: aload #5
    //   433: iload #7
    //   435: iload #8
    //   437: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLorg/jetbrains/jewel/ui/painter/PainterHint;II)Lkotlin/jvm/functions/Function2;
    //   442: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   447: goto -> 451
    //   450: pop
    //   451: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #22	-> 13
    //   #19	-> 310
    //   #20	-> 325
    //   #22	-> 345
    //   #24	-> 348
    //   #25	-> 409
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   28	424	9	$dirty	I
    //   0	452	0	key	Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
    //   0	452	1	contentDescription	Ljava/lang/String;
    //   0	452	2	modifier	Landroidx/compose/ui/Modifier;
    //   0	452	3	tint	J
    //   0	452	5	hint	Lorg/jetbrains/jewel/ui/painter/PainterHint;
    //   0	452	6	$composer	Landroidx/compose/runtime/Composer;
    //   0	452	7	$changed	I
  }
  
  @Deprecated(message = "Use Icon directly, this doesn't have any advantage over it anymore.", replaceWith = @ReplaceWith(expression = "Icon(key, contentDescription, modifier, tint, hints)", imports = {"com.jewel.ui.component.Icon"}))
  @ScheduledForRemoval(inVersion = "Before 1.0")
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public static final void PlatformIcon-uDo3WH8(@NotNull IntelliJIconKey key, @Nullable String contentDescription, @Nullable Modifier modifier, long tint, @NotNull PainterHint[] hints, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'key'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload #5
    //   8: ldc 'hints'
    //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   13: aload #6
    //   15: ldc 896615115
    //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   22: astore #6
    //   24: iload #7
    //   26: istore #9
    //   28: iload #8
    //   30: iconst_1
    //   31: iand
    //   32: ifeq -> 45
    //   35: iload #9
    //   37: bipush #6
    //   39: ior
    //   40: istore #9
    //   42: goto -> 74
    //   45: iload #7
    //   47: bipush #6
    //   49: iand
    //   50: ifne -> 74
    //   53: iload #9
    //   55: aload #6
    //   57: aload_0
    //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   63: ifeq -> 70
    //   66: iconst_4
    //   67: goto -> 71
    //   70: iconst_2
    //   71: ior
    //   72: istore #9
    //   74: iload #8
    //   76: iconst_2
    //   77: iand
    //   78: ifeq -> 91
    //   81: iload #9
    //   83: bipush #48
    //   85: ior
    //   86: istore #9
    //   88: goto -> 122
    //   91: iload #7
    //   93: bipush #48
    //   95: iand
    //   96: ifne -> 122
    //   99: iload #9
    //   101: aload #6
    //   103: aload_1
    //   104: invokeinterface changed : (Ljava/lang/Object;)Z
    //   109: ifeq -> 117
    //   112: bipush #32
    //   114: goto -> 119
    //   117: bipush #16
    //   119: ior
    //   120: istore #9
    //   122: iload #8
    //   124: iconst_4
    //   125: iand
    //   126: ifeq -> 140
    //   129: iload #9
    //   131: sipush #384
    //   134: ior
    //   135: istore #9
    //   137: goto -> 174
    //   140: iload #7
    //   142: sipush #384
    //   145: iand
    //   146: ifne -> 174
    //   149: iload #9
    //   151: aload #6
    //   153: aload_2
    //   154: invokeinterface changed : (Ljava/lang/Object;)Z
    //   159: ifeq -> 168
    //   162: sipush #256
    //   165: goto -> 171
    //   168: sipush #128
    //   171: ior
    //   172: istore #9
    //   174: iload #8
    //   176: bipush #8
    //   178: iand
    //   179: ifeq -> 193
    //   182: iload #9
    //   184: sipush #3072
    //   187: ior
    //   188: istore #9
    //   190: goto -> 227
    //   193: iload #7
    //   195: sipush #3072
    //   198: iand
    //   199: ifne -> 227
    //   202: iload #9
    //   204: aload #6
    //   206: lload_3
    //   207: invokeinterface changed : (J)Z
    //   212: ifeq -> 221
    //   215: sipush #2048
    //   218: goto -> 224
    //   221: sipush #1024
    //   224: ior
    //   225: istore #9
    //   227: aload #6
    //   229: ldc -931826141
    //   231: aload #5
    //   233: arraylength
    //   234: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   237: invokeinterface startMovableGroup : (ILjava/lang/Object;)V
    //   242: iconst_0
    //   243: istore #10
    //   245: aload #5
    //   247: arraylength
    //   248: istore #11
    //   250: iload #10
    //   252: iload #11
    //   254: if_icmpge -> 294
    //   257: aload #5
    //   259: iload #10
    //   261: aaload
    //   262: astore #12
    //   264: iload #9
    //   266: aload #6
    //   268: aload #12
    //   270: invokeinterface changed : (Ljava/lang/Object;)Z
    //   275: ifeq -> 284
    //   278: sipush #16384
    //   281: goto -> 285
    //   284: iconst_0
    //   285: ior
    //   286: istore #9
    //   288: iinc #10, 1
    //   291: goto -> 250
    //   294: aload #6
    //   296: invokeinterface endMovableGroup : ()V
    //   301: iload #9
    //   303: ldc 57344
    //   305: iand
    //   306: ifne -> 317
    //   309: iload #9
    //   311: sipush #8192
    //   314: ior
    //   315: istore #9
    //   317: iload #9
    //   319: sipush #9363
    //   322: iand
    //   323: sipush #9362
    //   326: if_icmpne -> 339
    //   329: aload #6
    //   331: invokeinterface getSkipping : ()Z
    //   336: ifne -> 450
    //   339: iload #8
    //   341: iconst_4
    //   342: iand
    //   343: ifeq -> 353
    //   346: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   349: checkcast androidx/compose/ui/Modifier
    //   352: astore_2
    //   353: iload #8
    //   355: bipush #8
    //   357: iand
    //   358: ifeq -> 368
    //   361: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   364: invokevirtual getUnspecified-0d7_KjU : ()J
    //   367: lstore_3
    //   368: invokestatic isTraceInProgress : ()Z
    //   371: ifeq -> 384
    //   374: ldc 896615115
    //   376: iload #9
    //   378: iconst_m1
    //   379: ldc 'org.jetbrains.jewel.ui.component.PlatformIcon (PlatformIcon.kt:38)'
    //   381: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   384: aload_0
    //   385: checkcast org/jetbrains/jewel/ui/icon/IconKey
    //   388: aload_1
    //   389: aload_2
    //   390: aload_0
    //   391: invokevirtual getClass : ()Ljava/lang/Class;
    //   394: lload_3
    //   395: aload #5
    //   397: aload #5
    //   399: arraylength
    //   400: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   403: checkcast [Lorg/jetbrains/jewel/ui/painter/PainterHint;
    //   406: aload #6
    //   408: bipush #14
    //   410: iload #9
    //   412: iand
    //   413: bipush #112
    //   415: iload #9
    //   417: iand
    //   418: ior
    //   419: sipush #896
    //   422: iload #9
    //   424: iand
    //   425: ior
    //   426: ldc 57344
    //   428: iload #9
    //   430: iconst_3
    //   431: ishl
    //   432: iand
    //   433: ior
    //   434: iconst_0
    //   435: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
    //   438: invokestatic isTraceInProgress : ()Z
    //   441: ifeq -> 457
    //   444: invokestatic traceEventEnd : ()V
    //   447: goto -> 457
    //   450: aload #6
    //   452: invokeinterface skipToGroupEnd : ()V
    //   457: aload #6
    //   459: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   464: dup
    //   465: ifnull -> 491
    //   468: aload_0
    //   469: aload_1
    //   470: aload_2
    //   471: lload_3
    //   472: aload #5
    //   474: iload #7
    //   476: iload #8
    //   478: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;II)Lkotlin/jvm/functions/Function2;
    //   483: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   488: goto -> 492
    //   491: pop
    //   492: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #39	-> 13
    //   #38	-> 237
    //   #39	-> 317
    //   #36	-> 346
    //   #37	-> 361
    //   #39	-> 381
    //   #40	-> 384
    //   #41	-> 450
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   264	24	12	value	Lorg/jetbrains/jewel/ui/painter/PainterHint;
    //   28	465	9	$dirty	I
    //   0	493	0	key	Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
    //   0	493	1	contentDescription	Ljava/lang/String;
    //   0	493	2	modifier	Landroidx/compose/ui/Modifier;
    //   0	493	3	tint	J
    //   0	493	5	hints	[Lorg/jetbrains/jewel/ui/painter/PainterHint;
    //   0	493	6	$composer	Landroidx/compose/runtime/Composer;
    //   0	493	7	$changed	I
  }
  
  private static final Unit PlatformIcon_uDo3WH8$lambda$0(IntelliJIconKey $key, String $contentDescription, Modifier $modifier, long $tint, PainterHint $hint, int $$changed, int $$default, Composer $composer, int $force) {
    PlatformIcon-uDo3WH8($key, $contentDescription, $modifier, $tint, $hint, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
  
  private static final Unit PlatformIcon_uDo3WH8$lambda$1(IntelliJIconKey $key, String $contentDescription, Modifier $modifier, long $tint, PainterHint[] $hints, int $$changed, int $$default, Composer $composer, int $force) {
    PlatformIcon-uDo3WH8($key, $contentDescription, $modifier, $tint, Arrays.<PainterHint>copyOf($hints, $hints.length), $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\PlatformIconKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */