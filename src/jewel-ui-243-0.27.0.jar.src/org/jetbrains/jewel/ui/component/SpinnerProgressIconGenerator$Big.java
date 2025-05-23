package org.jetbrains.jewel.ui.component;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020 \n\002\020\016\n\002\b\002\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\006¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator$Big;", "", "<init>", "()V", "generateSvgFrames", "", "", "colorHex", "ui"})
@StabilityInferred(parameters = 1)
public final class Big {
  @NotNull
  public static final Big INSTANCE = new Big();
  
  public static final int $stable;
  
  @NotNull
  public final List<String> generateSvgFrames(@NotNull String colorHex) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'colorHex'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: invokestatic createListBuilder : ()Ljava/util/List;
    //   9: astore_2
    //   10: aload_2
    //   11: astore_3
    //   12: iconst_0
    //   13: istore #4
    //   15: invokestatic access$getOpacityList$p : ()Ljava/util/List;
    //   18: checkcast java/util/Collection
    //   21: invokestatic toMutableList : (Ljava/util/Collection;)Ljava/util/List;
    //   24: astore #5
    //   26: invokestatic access$getOpacityList$p : ()Ljava/util/List;
    //   29: checkcast java/util/Collection
    //   32: invokeinterface size : ()I
    //   37: istore #6
    //   39: iconst_0
    //   40: istore #7
    //   42: iload #7
    //   44: iload #6
    //   46: if_icmpge -> 89
    //   49: iload #7
    //   51: istore #8
    //   53: iconst_0
    //   54: istore #9
    //   56: aload_3
    //   57: getstatic org/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator.INSTANCE : Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator;
    //   60: bipush #32
    //   62: aload #5
    //   64: aload_1
    //   65: invokestatic access$generateSvgIcon : (Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator;ILjava/util/List;Ljava/lang/String;)Ljava/lang/String;
    //   68: invokeinterface add : (Ljava/lang/Object;)Z
    //   73: pop
    //   74: getstatic org/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator.INSTANCE : Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator;
    //   77: aload #5
    //   79: invokestatic access$shtr : (Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator;Ljava/util/List;)V
    //   82: nop
    //   83: iinc #7, 1
    //   86: goto -> 42
    //   89: nop
    //   90: aload_2
    //   91: invokestatic build : (Ljava/util/List;)Ljava/util/List;
    //   94: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #168	-> 6
    //   #169	-> 15
    //   #170	-> 26
    //   #170	-> 39
    //   #171	-> 56
    //   #172	-> 74
    //   #173	-> 82
    //   #170	-> 83
    //   #174	-> 89
    //   #168	-> 90
    //   #174	-> 94
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   56	27	9	$i$a$-repeat-SpinnerProgressIconGenerator$Big$generateSvgFrames$1$1	I
    //   53	30	8	it	I
    //   15	75	4	$i$a$-buildList-SpinnerProgressIconGenerator$Big$generateSvgFrames$1	I
    //   26	64	5	opacityListShifted	Ljava/util/List;
    //   12	78	3	$this$generateSvgFrames_u24lambda_u241	Ljava/util/List;
    //   0	95	0	this	Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator$Big;
    //   0	95	1	colorHex	Ljava/lang/String;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SpinnerProgressIconGenerator$Big.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */