package org.jetbrains.jewel.ui.component;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@DebugMetadata(f = "EditableComboBox.kt", l = {388, 391}, i = {0}, s = {"L$0"}, n = {"$this$awaitEachGesture"}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.EditableComboBoxKt$detectPressAndCancel$2$1")
@Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"})
@SourceDebugExtension({"SMAP\nEditableComboBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditableComboBox.kt\norg/jetbrains/jewel/ui/component/EditableComboBoxKt$detectPressAndCancel$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,400:1\n1#2:401\n*E\n"})
final class null extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
  int label;
  
  null(Function0<Unit> $onPress, Function0<Unit> $onCancel, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #6
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 182, 0 -> 36, 1 -> 79, 2 -> 148
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield L$0 : Ljava/lang/Object;
    //   44: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
    //   47: astore_2
    //   48: aload_2
    //   49: iconst_0
    //   50: aconst_null
    //   51: aload_0
    //   52: checkcast kotlin/coroutines/Continuation
    //   55: iconst_3
    //   56: aconst_null
    //   57: aload_0
    //   58: aload_2
    //   59: putfield L$0 : Ljava/lang/Object;
    //   62: aload_0
    //   63: iconst_1
    //   64: putfield label : I
    //   67: invokestatic awaitFirstDown$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    //   70: dup
    //   71: aload #6
    //   73: if_acmpne -> 92
    //   76: aload #6
    //   78: areturn
    //   79: aload_0
    //   80: getfield L$0 : Ljava/lang/Object;
    //   83: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
    //   86: astore_2
    //   87: aload_1
    //   88: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   91: aload_1
    //   92: astore_3
    //   93: aload_3
    //   94: checkcast androidx/compose/ui/input/pointer/PointerInputChange
    //   97: astore #4
    //   99: iconst_0
    //   100: istore #5
    //   102: aload #4
    //   104: invokevirtual consume : ()V
    //   107: nop
    //   108: aload_0
    //   109: getfield $onPress : Lkotlin/jvm/functions/Function0;
    //   112: invokeinterface invoke : ()Ljava/lang/Object;
    //   117: pop
    //   118: aload_2
    //   119: aconst_null
    //   120: aload_0
    //   121: checkcast kotlin/coroutines/Continuation
    //   124: iconst_1
    //   125: aconst_null
    //   126: aload_0
    //   127: aconst_null
    //   128: putfield L$0 : Ljava/lang/Object;
    //   131: aload_0
    //   132: iconst_2
    //   133: putfield label : I
    //   136: invokestatic waitForUpOrCancellation$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    //   139: dup
    //   140: aload #6
    //   142: if_acmpne -> 153
    //   145: aload #6
    //   147: areturn
    //   148: aload_1
    //   149: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   152: aload_1
    //   153: checkcast androidx/compose/ui/input/pointer/PointerInputChange
    //   156: astore_3
    //   157: aload_3
    //   158: ifnonnull -> 174
    //   161: aload_0
    //   162: getfield $onCancel : Lkotlin/jvm/functions/Function0;
    //   165: invokeinterface invoke : ()Ljava/lang/Object;
    //   170: pop
    //   171: goto -> 178
    //   174: aload_3
    //   175: invokevirtual consume : ()V
    //   178: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   181: areturn
    //   182: new java/lang/IllegalStateException
    //   185: dup
    //   186: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   188: invokespecial <init> : (Ljava/lang/String;)V
    //   191: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #387	-> 3
    //   #388	-> 48
    //   #387	-> 76
    //   #401	-> 99
    //   #388	-> 102
    //   #388	-> 107
    //   #389	-> 108
    //   #391	-> 118
    //   #387	-> 145
    //   #392	-> 157
    //   #393	-> 161
    //   #395	-> 174
    //   #397	-> 178
    //   #387	-> 182
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   48	31	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    //   87	20	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    //   107	1	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    //   108	31	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    //   157	4	3	up	Landroidx/compose/ui/input/pointer/PointerInputChange;
    //   174	4	3	up	Landroidx/compose/ui/input/pointer/PointerInputChange;
    //   99	8	4	it	Landroidx/compose/ui/input/pointer/PointerInputChange;
    //   102	5	5	$i$a$-also-EditableComboBoxKt$detectPressAndCancel$2$1$1	I
    //   0	192	0	this	Lorg/jetbrains/jewel/ui/component/EditableComboBoxKt$detectPressAndCancel$2$1;
    //   40	142	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
    Object object = new Object(this.$onPress, this.$onCancel, $completion);
    object.L$0 = value;
    return (Continuation<Unit>)object;
  }
  
  public final Object invoke(AwaitPointerEventScope p1, Continuation<?> p2) {
    return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\EditableComboBoxKt$detectPressAndCancel$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */