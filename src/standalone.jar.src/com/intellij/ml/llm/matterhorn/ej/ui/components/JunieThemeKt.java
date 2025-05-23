package com.intellij.ml.llm.matterhorn.ej.ui.components;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\032 \020\000\032\0020\0012\021\020\002\032\r\022\004\022\0020\0010\003¢\006\002\b\004H\007¢\006\002\020\005¨\006\006"}, d2 = {"JunieTheme", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "standalone"})
public final class JunieThemeKt {
  @Composable
  @ComposableInferredTarget(scheme = "[0[0]]")
  public static final void JunieTheme(@NotNull Function2 content, @Nullable Composer $composer, int $changed) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'content'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 1705395678
    //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   14: astore_1
    //   15: iload_2
    //   16: istore_3
    //   17: iload_2
    //   18: bipush #6
    //   20: iand
    //   21: ifne -> 42
    //   24: iload_3
    //   25: aload_1
    //   26: aload_0
    //   27: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   32: ifeq -> 39
    //   35: iconst_4
    //   36: goto -> 40
    //   39: iconst_2
    //   40: ior
    //   41: istore_3
    //   42: iload_3
    //   43: iconst_3
    //   44: iand
    //   45: iconst_2
    //   46: if_icmpne -> 58
    //   49: aload_1
    //   50: invokeinterface getSkipping : ()Z
    //   55: ifne -> 161
    //   58: invokestatic isTraceInProgress : ()Z
    //   61: ifeq -> 73
    //   64: ldc 1705395678
    //   66: iload_3
    //   67: iconst_m1
    //   68: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieTheme (JunieTheme.kt:11)'
    //   70: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   73: iconst_2
    //   74: anewarray androidx/compose/runtime/ProvidedValue
    //   77: astore #4
    //   79: aload #4
    //   81: iconst_0
    //   82: invokestatic getMatterhornThemeProvider : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
    //   85: new com/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData
    //   88: dup
    //   89: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
    //   92: aload_1
    //   93: bipush #6
    //   95: invokevirtual isDark : (Landroidx/compose/runtime/Composer;I)Z
    //   98: invokespecial <init> : (Z)V
    //   101: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
    //   104: aastore
    //   105: aload #4
    //   107: iconst_1
    //   108: invokestatic getJunieExamplePromptChipStyleProvider : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
    //   111: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
    //   114: aload_1
    //   115: bipush #6
    //   117: invokevirtual isDark : (Landroidx/compose/runtime/Composer;I)Z
    //   120: aconst_null
    //   121: aconst_null
    //   122: bipush #6
    //   124: aconst_null
    //   125: invokestatic ExamplePromptChipStyle$default : (ZLcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipMetrics;Lorg/jetbrains/jewel/ui/icon/IconKey;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;
    //   128: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
    //   131: aastore
    //   132: aload #4
    //   134: aload_0
    //   135: aload_1
    //   136: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
    //   139: bipush #112
    //   141: iload_3
    //   142: iconst_3
    //   143: ishl
    //   144: iand
    //   145: ior
    //   146: invokestatic CompositionLocalProvider : ([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    //   149: invokestatic isTraceInProgress : ()Z
    //   152: ifeq -> 167
    //   155: invokestatic traceEventEnd : ()V
    //   158: goto -> 167
    //   161: aload_1
    //   162: invokeinterface skipToGroupEnd : ()V
    //   167: aload_1
    //   168: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   173: dup
    //   174: ifnull -> 192
    //   177: aload_0
    //   178: iload_2
    //   179: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;I)Lkotlin/jvm/functions/Function2;
    //   184: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   189: goto -> 193
    //   192: pop
    //   193: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #12	-> 6
    //   #14	-> 73
    //   #15	-> 108
    //   #14	-> 132
    //   #16	-> 134
    //   #13	-> 146
    //   #18	-> 161
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   17	177	3	$dirty	I
    //   0	194	0	content	Lkotlin/jvm/functions/Function2;
    //   0	194	1	$composer	Landroidx/compose/runtime/Composer;
    //   0	194	2	$changed	I
  }
  
  private static final Unit JunieTheme$lambda$0(Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, Composer $composer, int $force) {
    JunieTheme($content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieThemeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */