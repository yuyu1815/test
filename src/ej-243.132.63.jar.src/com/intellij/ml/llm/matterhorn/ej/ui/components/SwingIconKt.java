package com.intellij.ml.llm.matterhorn.ej.ui.components;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import javax.swing.Icon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\032\035\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\007¢\006\002\020\006¨\006\007"}, d2 = {"SwingIcon", "", "icon", "Ljavax/swing/Icon;", "contentDescription", "", "(Ljavax/swing/Icon;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ej-ui"})
@SourceDebugExtension({"SMAP\nSwingIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwingIcon.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/SwingIconKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,32:1\n77#2:33\n1225#3,6:34\n*S KotlinDebug\n*F\n+ 1 SwingIcon.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/SwingIconKt\n*L\n25#1:33\n25#1:34,6\n*E\n"})
public final class SwingIconKt {
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public static final void SwingIcon(@NotNull Icon icon, @NotNull String contentDescription, @Nullable Composer $composer, int $changed) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'icon'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 'contentDescription'
    //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_2
    //   13: ldc 1085132485
    //   15: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   20: astore_2
    //   21: iload_3
    //   22: istore #4
    //   24: iload_3
    //   25: bipush #6
    //   27: iand
    //   28: ifne -> 51
    //   31: iload #4
    //   33: aload_2
    //   34: aload_0
    //   35: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   40: ifeq -> 47
    //   43: iconst_4
    //   44: goto -> 48
    //   47: iconst_2
    //   48: ior
    //   49: istore #4
    //   51: iload_3
    //   52: bipush #48
    //   54: iand
    //   55: ifne -> 80
    //   58: iload #4
    //   60: aload_2
    //   61: aload_1
    //   62: invokeinterface changed : (Ljava/lang/Object;)Z
    //   67: ifeq -> 75
    //   70: bipush #32
    //   72: goto -> 77
    //   75: bipush #16
    //   77: ior
    //   78: istore #4
    //   80: iload #4
    //   82: bipush #19
    //   84: iand
    //   85: bipush #18
    //   87: if_icmpne -> 99
    //   90: aload_2
    //   91: invokeinterface getSkipping : ()Z
    //   96: ifne -> 330
    //   99: invokestatic isTraceInProgress : ()Z
    //   102: ifeq -> 115
    //   105: ldc 1085132485
    //   107: iload #4
    //   109: iconst_m1
    //   110: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.SwingIcon (SwingIcon.kt:22)'
    //   112: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   115: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
    //   118: aload_2
    //   119: bipush #6
    //   121: invokevirtual getName : (Landroidx/compose/runtime/Composer;I)Ljava/lang/String;
    //   124: astore #6
    //   126: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
    //   129: checkcast androidx/compose/runtime/CompositionLocal
    //   132: astore #8
    //   134: iconst_0
    //   135: istore #9
    //   137: iconst_0
    //   138: istore #10
    //   140: aload_2
    //   141: ldc 2023513938
    //   143: ldc 'CC:CompositionLocal.kt#9igjgp'
    //   145: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   148: aload_2
    //   149: aload #8
    //   151: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
    //   156: astore #11
    //   158: aload_2
    //   159: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   162: aload #11
    //   164: checkcast androidx/compose/ui/unit/Density
    //   167: astore #7
    //   169: aload_2
    //   170: ldc -1420335351
    //   172: invokeinterface startReplaceGroup : (I)V
    //   177: aload_2
    //   178: astore #9
    //   180: aload_2
    //   181: aload #6
    //   183: invokeinterface changed : (Ljava/lang/Object;)Z
    //   188: aload_2
    //   189: aload #7
    //   191: invokeinterface changed : (Ljava/lang/Object;)Z
    //   196: ior
    //   197: aload_2
    //   198: aload_0
    //   199: invokeinterface changed : (Ljava/lang/Object;)Z
    //   204: ior
    //   205: istore #10
    //   207: iconst_0
    //   208: istore #11
    //   210: aload #9
    //   212: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   217: astore #12
    //   219: iconst_0
    //   220: istore #13
    //   222: iload #10
    //   224: ifne -> 238
    //   227: aload #12
    //   229: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
    //   232: invokevirtual getEmpty : ()Ljava/lang/Object;
    //   235: if_acmpne -> 267
    //   238: iconst_0
    //   239: istore #14
    //   241: aload_0
    //   242: iconst_0
    //   243: iconst_2
    //   244: aconst_null
    //   245: invokestatic toBufferedImage$default : (Ljavax/swing/Icon;ZILjava/lang/Object;)Ljava/awt/image/BufferedImage;
    //   248: invokestatic toComposeImageBitmap : (Ljava/awt/image/BufferedImage;)Landroidx/compose/ui/graphics/ImageBitmap;
    //   251: astore #15
    //   253: aload #9
    //   255: aload #15
    //   257: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   262: aload #15
    //   264: goto -> 269
    //   267: aload #12
    //   269: nop
    //   270: nop
    //   271: nop
    //   272: checkcast androidx/compose/ui/graphics/ImageBitmap
    //   275: astore #8
    //   277: aload_2
    //   278: invokeinterface endReplaceGroup : ()V
    //   283: aload #8
    //   285: astore #5
    //   287: new androidx/compose/ui/graphics/painter/BitmapPainter
    //   290: dup
    //   291: aload #5
    //   293: lconst_0
    //   294: lconst_0
    //   295: bipush #6
    //   297: aconst_null
    //   298: invokespecial <init> : (Landroidx/compose/ui/graphics/ImageBitmap;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   301: checkcast androidx/compose/ui/graphics/painter/Painter
    //   304: aload_1
    //   305: aconst_null
    //   306: lconst_0
    //   307: aload_2
    //   308: bipush #112
    //   310: iload #4
    //   312: iand
    //   313: bipush #12
    //   315: invokestatic Icon-ww6aTOc : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V
    //   318: invokestatic isTraceInProgress : ()Z
    //   321: ifeq -> 336
    //   324: invokestatic traceEventEnd : ()V
    //   327: goto -> 336
    //   330: aload_2
    //   331: invokeinterface skipToGroupEnd : ()V
    //   336: aload_2
    //   337: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   342: dup
    //   343: ifnull -> 362
    //   346: aload_0
    //   347: aload_1
    //   348: iload_3
    //   349: <illegal opcode> invoke : (Ljavax/swing/Icon;Ljava/lang/String;I)Lkotlin/jvm/functions/Function2;
    //   354: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   359: goto -> 363
    //   362: pop
    //   363: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #23	-> 12
    //   #25	-> 115
    //   #33	-> 145
    //   #25	-> 164
    //   #34	-> 210
    //   #35	-> 222
    //   #36	-> 238
    //   #26	-> 241
    //   #36	-> 251
    //   #37	-> 253
    //   #38	-> 262
    //   #39	-> 267
    //   #35	-> 269
    //   #34	-> 270
    //   #34	-> 271
    //   #25	-> 272
    //   #29	-> 287
    //   #30	-> 330
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   140	24	10	$i$f$getCurrent	I
    //   137	27	8	this_$iv	Landroidx/compose/runtime/CompositionLocal;
    //   137	27	9	$changed$iv	I
    //   241	10	14	$i$a$-cache-SwingIconKt$SwingIcon$image$1	I
    //   253	11	15	value$iv	Ljava/lang/Object;
    //   222	48	13	$i$a$-let-ComposerKt$cache$1$iv	I
    //   219	51	12	it$iv	Ljava/lang/Object;
    //   210	62	11	$i$f$cache	I
    //   207	65	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
    //   207	65	10	invalid$iv	Z
    //   287	40	5	image	Landroidx/compose/ui/graphics/ImageBitmap;
    //   24	340	4	$dirty	I
    //   0	364	0	icon	Ljavax/swing/Icon;
    //   0	364	1	contentDescription	Ljava/lang/String;
    //   0	364	2	$composer	Landroidx/compose/runtime/Composer;
    //   0	364	3	$changed	I
  }
  
  private static final Unit SwingIcon$lambda$1(Icon $icon, String $contentDescription, int $$changed, Composer $composer, int $force) {
    SwingIcon($icon, $contentDescription, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\SwingIconKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */