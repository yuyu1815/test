package org.jetbrains.jewel.foundation.modifier;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.Ref;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.jewel.foundation.Stroke;

@Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\norg/jetbrains/jewel/foundation/modifier/BorderKt$drawBorderWithAlignment$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,357:1\n1225#2,6:358\n1225#2,6:364\n139#3:370\n125#3:371\n149#3:372\n*S KotlinDebug\n*F\n+ 1 Border.kt\norg/jetbrains/jewel/foundation/modifier/BorderKt$drawBorderWithAlignment$2\n*L\n95#1:358,6\n97#1:364,6\n104#1:370\n104#1:371\n104#1:372\n*E\n"})
final class BorderKt$drawBorderWithAlignment$2 implements Function3<Modifier, Composer, Integer, Modifier> {
  @Composable
  public final Modifier invoke(Modifier $this$composed, Composer $composer, int $changed) {
    // Byte code:
    //   0: aload_1
    //   1: ldc '$this$composed'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_2
    //   7: ldc 539276792
    //   9: invokeinterface startReplaceGroup : (I)V
    //   14: invokestatic isTraceInProgress : ()Z
    //   17: ifeq -> 29
    //   20: ldc 539276792
    //   22: iload_3
    //   23: iconst_m1
    //   24: ldc 'org.jetbrains.jewel.foundation.modifier.drawBorderWithAlignment.<anonymous> (Border.kt:94)'
    //   26: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   29: aload_2
    //   30: ldc 1551215970
    //   32: invokeinterface startReplaceGroup : (I)V
    //   37: aload_2
    //   38: astore #6
    //   40: iconst_0
    //   41: istore #7
    //   43: iconst_0
    //   44: istore #8
    //   46: aload #6
    //   48: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   53: astore #9
    //   55: iconst_0
    //   56: istore #10
    //   58: aload #9
    //   60: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
    //   63: invokevirtual getEmpty : ()Ljava/lang/Object;
    //   66: if_acmpne -> 95
    //   69: iconst_0
    //   70: istore #11
    //   72: new androidx/compose/ui/node/Ref
    //   75: dup
    //   76: invokespecial <init> : ()V
    //   79: astore #11
    //   81: aload #6
    //   83: aload #11
    //   85: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   90: aload #11
    //   92: goto -> 97
    //   95: aload #9
    //   97: nop
    //   98: nop
    //   99: nop
    //   100: checkcast androidx/compose/ui/node/Ref
    //   103: astore #5
    //   105: aload_2
    //   106: invokeinterface endReplaceGroup : ()V
    //   111: aload #5
    //   113: astore #4
    //   115: aload_1
    //   116: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   119: checkcast androidx/compose/ui/Modifier
    //   122: aload_2
    //   123: ldc 1551219651
    //   125: invokeinterface startReplaceGroup : (I)V
    //   130: aload_2
    //   131: astore #7
    //   133: aload_2
    //   134: aload_0
    //   135: getfield $width : F
    //   138: invokeinterface changed : (F)Z
    //   143: aload_2
    //   144: aload_0
    //   145: getfield $expand : F
    //   148: invokeinterface changed : (F)Z
    //   153: ior
    //   154: aload_2
    //   155: aload_0
    //   156: getfield $shape : Landroidx/compose/ui/graphics/Shape;
    //   159: invokeinterface changed : (Ljava/lang/Object;)Z
    //   164: ior
    //   165: aload_2
    //   166: aload #4
    //   168: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   173: ior
    //   174: aload_2
    //   175: aload_0
    //   176: getfield $alignment : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
    //   179: invokeinterface changed : (Ljava/lang/Object;)Z
    //   184: ior
    //   185: aload_2
    //   186: aload_0
    //   187: getfield $brush : Landroidx/compose/ui/graphics/Brush;
    //   190: invokeinterface changed : (Ljava/lang/Object;)Z
    //   195: ior
    //   196: istore #8
    //   198: aload_0
    //   199: getfield $width : F
    //   202: fstore #9
    //   204: aload_0
    //   205: getfield $expand : F
    //   208: fstore #10
    //   210: aload_0
    //   211: getfield $shape : Landroidx/compose/ui/graphics/Shape;
    //   214: astore #11
    //   216: aload_0
    //   217: getfield $alignment : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
    //   220: astore #12
    //   222: aload_0
    //   223: getfield $brush : Landroidx/compose/ui/graphics/Brush;
    //   226: astore #13
    //   228: iconst_0
    //   229: istore #14
    //   231: aload #7
    //   233: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   238: astore #15
    //   240: iconst_0
    //   241: istore #16
    //   243: iload #8
    //   245: ifne -> 259
    //   248: aload #15
    //   250: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
    //   253: invokevirtual getEmpty : ()Ljava/lang/Object;
    //   256: if_acmpne -> 307
    //   259: astore #20
    //   261: astore #19
    //   263: iconst_0
    //   264: istore #17
    //   266: fload #9
    //   268: fload #10
    //   270: aload #11
    //   272: aload #4
    //   274: aload #12
    //   276: aload #13
    //   278: <illegal opcode> invoke : (FFLandroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/node/Ref;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;Landroidx/compose/ui/graphics/Brush;)Lkotlin/jvm/functions/Function1;
    //   283: astore #21
    //   285: aload #19
    //   287: aload #20
    //   289: aload #21
    //   291: astore #18
    //   293: aload #7
    //   295: aload #18
    //   297: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   302: aload #18
    //   304: goto -> 309
    //   307: aload #15
    //   309: nop
    //   310: nop
    //   311: nop
    //   312: checkcast kotlin/jvm/functions/Function1
    //   315: astore #6
    //   317: aload_2
    //   318: invokeinterface endReplaceGroup : ()V
    //   323: aload #6
    //   325: invokestatic drawWithCache : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
    //   328: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   333: astore #5
    //   335: invokestatic isTraceInProgress : ()Z
    //   338: ifeq -> 344
    //   341: invokestatic traceEventEnd : ()V
    //   344: aload_2
    //   345: invokeinterface endReplaceGroup : ()V
    //   350: aload #5
    //   352: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #95	-> 26
    //   #358	-> 46
    //   #359	-> 58
    //   #360	-> 69
    //   #95	-> 72
    //   #360	-> 79
    //   #361	-> 81
    //   #362	-> 90
    //   #363	-> 95
    //   #359	-> 97
    //   #358	-> 98
    //   #358	-> 99
    //   #95	-> 100
    //   #96	-> 115
    //   #97	-> 116
    //   #364	-> 231
    //   #365	-> 243
    //   #366	-> 259
    //   #97	-> 266
    //   #366	-> 291
    //   #367	-> 293
    //   #368	-> 302
    //   #369	-> 307
    //   #365	-> 309
    //   #364	-> 310
    //   #364	-> 311
    //   #97	-> 312
    //   #96	-> 328
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   72	7	11	$i$a$-cache-BorderKt$drawBorderWithAlignment$2$borderCacheRef$1	I
    //   81	11	11	value$iv	Ljava/lang/Object;
    //   58	40	10	$i$a$-let-ComposerKt$cache$1$iv	I
    //   55	43	9	it$iv	Ljava/lang/Object;
    //   46	54	8	$i$f$cache	I
    //   43	57	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
    //   43	57	7	invalid$iv	Z
    //   266	17	17	$i$a$-cache-BorderKt$drawBorderWithAlignment$2$1	I
    //   293	11	18	value$iv	Ljava/lang/Object;
    //   243	67	16	$i$a$-let-ComposerKt$cache$1$iv	I
    //   240	70	15	it$iv	Ljava/lang/Object;
    //   231	81	14	$i$f$cache	I
    //   228	84	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
    //   228	84	8	invalid$iv	Z
    //   115	238	4	borderCacheRef	Landroidx/compose/ui/node/Ref;
    //   0	353	0	this	Lorg/jetbrains/jewel/foundation/modifier/BorderKt$drawBorderWithAlignment$2;
    //   0	353	1	$this$composed	Landroidx/compose/ui/Modifier;
    //   0	353	2	$composer	Landroidx/compose/runtime/Composer;
    //   0	353	3	$changed	I
  }
  
  private static final DrawResult invoke$lambda$4$lambda$3(float $width, float $expand, Shape $shape, Ref $borderCacheRef, Stroke.Alignment $alignment, Brush $brush, CacheDrawScope $this$drawWithCache) {
    // Byte code:
    //   0: aload #6
    //   2: ldc '$this$drawWithCache'
    //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   7: aload #6
    //   9: fload_0
    //   10: fload_1
    //   11: aload_2
    //   12: aload_3
    //   13: aload #4
    //   15: aload #5
    //   17: aload #6
    //   19: <illegal opcode> invoke : (FFLandroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/node/Ref;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/draw/CacheDrawScope;)Lkotlin/jvm/functions/Function1;
    //   24: invokevirtual onDrawWithContent : (Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draw/DrawResult;
    //   27: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #98	-> 7
    //   #115	-> 27
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	28	0	$width	F
    //   0	28	1	$expand	F
    //   0	28	2	$shape	Landroidx/compose/ui/graphics/Shape;
    //   0	28	3	$borderCacheRef	Landroidx/compose/ui/node/Ref;
    //   0	28	4	$alignment	Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
    //   0	28	5	$brush	Landroidx/compose/ui/graphics/Brush;
    //   0	28	6	$this$drawWithCache	Landroidx/compose/ui/draw/CacheDrawScope;
  }
  
  private static final Unit invoke$lambda$4$lambda$3$lambda$2(float $width, float $expand, Shape $shape, Ref $borderCacheRef, Stroke.Alignment $alignment, Brush $brush, CacheDrawScope $this_drawWithCache, ContentDrawScope $this$onDrawWithContent) {
    // Byte code:
    //   0: aload #7
    //   2: ldc '$this$onDrawWithContent'
    //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   7: aload #7
    //   9: invokeinterface drawContent : ()V
    //   14: fload_0
    //   15: getstatic androidx/compose/ui/unit/Dp.Companion : Landroidx/compose/ui/unit/Dp$Companion;
    //   18: invokevirtual getHairline-D9Ej5fM : ()F
    //   21: invokestatic equals-impl0 : (FF)Z
    //   24: ifeq -> 31
    //   27: fconst_1
    //   28: goto -> 39
    //   31: aload #7
    //   33: fload_0
    //   34: invokeinterface toPx-0680j_4 : (F)F
    //   39: aload #7
    //   41: invokeinterface getSize-NH-jbRc : ()J
    //   46: invokestatic getMinDimension-impl : (J)F
    //   49: iconst_2
    //   50: i2f
    //   51: fdiv
    //   52: invokestatic min : (FF)F
    //   55: fconst_1
    //   56: invokestatic coerceAtLeast : (FF)F
    //   59: fstore #8
    //   61: aload #7
    //   63: fload_1
    //   64: fstore #10
    //   66: iconst_0
    //   67: istore #11
    //   69: fload #10
    //   71: fstore #12
    //   73: iconst_0
    //   74: istore #13
    //   76: fload #12
    //   78: invokestatic isNaN : (F)Z
    //   81: ifne -> 88
    //   84: iconst_1
    //   85: goto -> 89
    //   88: iconst_0
    //   89: nop
    //   90: ifeq -> 98
    //   93: fload #10
    //   95: goto -> 123
    //   98: astore #17
    //   100: iconst_0
    //   101: istore #14
    //   103: iconst_0
    //   104: istore #15
    //   106: iconst_0
    //   107: istore #16
    //   109: iload #15
    //   111: i2f
    //   112: invokestatic constructor-impl : (F)F
    //   115: nop
    //   116: fstore #18
    //   118: aload #17
    //   120: fload #18
    //   122: nop
    //   123: invokeinterface toPx-0680j_4 : (F)F
    //   128: fstore #9
    //   130: aload #7
    //   132: aload_2
    //   133: aload_3
    //   134: aload #4
    //   136: aload #5
    //   138: fload #8
    //   140: fload #9
    //   142: aload #6
    //   144: invokestatic access$drawBorderInner : (Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/node/Ref;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;Landroidx/compose/ui/graphics/Brush;FFLandroidx/compose/ui/draw/CacheDrawScope;)V
    //   147: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   150: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #99	-> 7
    //   #102	-> 14
    //   #102	-> 55
    //   #101	-> 59
    //   #104	-> 61
    //   #370	-> 69
    //   #371	-> 76
    //   #371	-> 89
    //   #370	-> 90
    //   #104	-> 103
    //   #372	-> 109
    //   #104	-> 115
    //   #370	-> 122
    //   #104	-> 123
    //   #106	-> 130
    //   #107	-> 132
    //   #108	-> 133
    //   #109	-> 134
    //   #110	-> 136
    //   #111	-> 138
    //   #112	-> 140
    //   #113	-> 142
    //   #106	-> 144
    //   #115	-> 147
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   109	6	16	$i$f$getDp	I
    //   106	9	15	$this$dp$iv	I
    //   103	13	14	$i$a$-takeOrElse-D5KLDUw-BorderKt$drawBorderWithAlignment$2$1$1$1$expandWidthPx$1	I
    //   76	14	13	$i$f$isSpecified-0680j_4	I
    //   73	17	12	$this$isSpecified$iv$iv	F
    //   69	54	11	$i$f$takeOrElse-D5KLDUw	I
    //   66	57	10	$this$takeOrElse_u2dD5KLDUw$iv	F
    //   61	90	8	strokeWidthPx	F
    //   130	21	9	expandWidthPx	F
    //   0	151	0	$width	F
    //   0	151	1	$expand	F
    //   0	151	2	$shape	Landroidx/compose/ui/graphics/Shape;
    //   0	151	3	$borderCacheRef	Landroidx/compose/ui/node/Ref;
    //   0	151	4	$alignment	Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
    //   0	151	5	$brush	Landroidx/compose/ui/graphics/Brush;
    //   0	151	6	$this_drawWithCache	Landroidx/compose/ui/draw/CacheDrawScope;
    //   0	151	7	$this$onDrawWithContent	Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
  }
  
  BorderKt$drawBorderWithAlignment$2(float $width, float $expand, Shape $shape, Stroke.Alignment $alignment, Brush $brush) {}
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\modifier\BorderKt$drawBorderWithAlignment$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */