package com.intellij.ml.llm.matterhorn.ej.ui.components;

import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.jewel.ui.icon.PathIconKey;

@DebugMetadata(f = "JunieCircularProgressIndicator.kt", l = {28}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.components.JunieCircularProgressIndicatorKt$JunieCircularProgressIndicator$1$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class JunieCircularProgressIndicatorKt$JunieCircularProgressIndicator$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  JunieCircularProgressIndicatorKt$JunieCircularProgressIndicator$1$1(List<PathIconKey> $iconList, MutableState<Integer> $currentIndex$delegate, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 94, 0 -> 32, 1 -> 59
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: nop
    //   37: ldc2_w 60
    //   40: aload_0
    //   41: checkcast kotlin/coroutines/Continuation
    //   44: aload_0
    //   45: iconst_1
    //   46: putfield label : I
    //   49: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   52: dup
    //   53: aload_2
    //   54: if_acmpne -> 64
    //   57: aload_2
    //   58: areturn
    //   59: aload_1
    //   60: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   63: aload_1
    //   64: pop
    //   65: aload_0
    //   66: getfield $currentIndex$delegate : Landroidx/compose/runtime/MutableState;
    //   69: aload_0
    //   70: getfield $currentIndex$delegate : Landroidx/compose/runtime/MutableState;
    //   73: invokestatic access$JunieCircularProgressIndicator_3IgeMak$lambda$1 : (Landroidx/compose/runtime/MutableState;)I
    //   76: iconst_1
    //   77: iadd
    //   78: aload_0
    //   79: getfield $iconList : Ljava/util/List;
    //   82: invokeinterface size : ()I
    //   87: irem
    //   88: invokestatic access$JunieCircularProgressIndicator_3IgeMak$lambda$2 : (Landroidx/compose/runtime/MutableState;I)V
    //   91: goto -> 36
    //   94: new java/lang/IllegalStateException
    //   97: dup
    //   98: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   100: invokespecial <init> : (Ljava/lang/String;)V
    //   103: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #26	-> 3
    //   #27	-> 36
    //   #28	-> 37
    //   #26	-> 57
    //   #29	-> 64
    //   #26	-> 94
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	104	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/JunieCircularProgressIndicatorKt$JunieCircularProgressIndicator$1$1;
    //   36	58	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super JunieCircularProgressIndicatorKt$JunieCircularProgressIndicator$1$1> $completion) {
    return (Continuation<Unit>)new JunieCircularProgressIndicatorKt$JunieCircularProgressIndicator$1$1(this.$iconList, this.$currentIndex$delegate, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((JunieCircularProgressIndicatorKt$JunieCircularProgressIndicator$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieCircularProgressIndicatorKt$JunieCircularProgressIndicator$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */