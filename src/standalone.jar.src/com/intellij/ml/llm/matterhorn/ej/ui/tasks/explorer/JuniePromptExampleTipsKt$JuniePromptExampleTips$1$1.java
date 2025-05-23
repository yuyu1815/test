package com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "JuniePromptExampleTips.kt", l = {53}, i = {0, 0}, s = {"L$2", "I$0"}, n = {"tip", "index$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
@SourceDebugExtension({"SMAP\nJuniePromptExampleTips.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JuniePromptExampleTips.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n1872#2,3:124\n*S KotlinDebug\n*F\n+ 1 JuniePromptExampleTips.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1\n*L\n52#1:124,3\n*E\n"})
final class JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  long J$0;
  
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int I$0;
  
  int label;
  
  JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1(List<Tip> $tips, long $animationDuration, SnapshotStateMap<String, Boolean> $visibilityMap, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #14
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 249, 0 -> 32, 1 -> 170
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield $tips : Ljava/util/List;
    //   40: checkcast java/lang/Iterable
    //   43: astore_2
    //   44: aload_0
    //   45: getfield $animationDuration : J
    //   48: lstore_3
    //   49: aload_0
    //   50: getfield $visibilityMap : Landroidx/compose/runtime/snapshots/SnapshotStateMap;
    //   53: astore #5
    //   55: iconst_0
    //   56: istore #6
    //   58: iconst_0
    //   59: istore #7
    //   61: aload_2
    //   62: invokeinterface iterator : ()Ljava/util/Iterator;
    //   67: astore #8
    //   69: aload #8
    //   71: invokeinterface hasNext : ()Z
    //   76: ifeq -> 244
    //   79: aload #8
    //   81: invokeinterface next : ()Ljava/lang/Object;
    //   86: astore #9
    //   88: iload #7
    //   90: iinc #7, 1
    //   93: istore #10
    //   95: iload #10
    //   97: ifge -> 103
    //   100: invokestatic throwIndexOverflow : ()V
    //   103: iload #10
    //   105: aload #9
    //   107: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip
    //   110: astore #11
    //   112: istore #12
    //   114: iconst_0
    //   115: istore #13
    //   117: iload #12
    //   119: ifeq -> 220
    //   122: lload_3
    //   123: aload_0
    //   124: aload_0
    //   125: aload #5
    //   127: putfield L$0 : Ljava/lang/Object;
    //   130: aload_0
    //   131: aload #8
    //   133: putfield L$1 : Ljava/lang/Object;
    //   136: aload_0
    //   137: aload #11
    //   139: putfield L$2 : Ljava/lang/Object;
    //   142: aload_0
    //   143: lload_3
    //   144: putfield J$0 : J
    //   147: aload_0
    //   148: iload #7
    //   150: putfield I$0 : I
    //   153: aload_0
    //   154: iconst_1
    //   155: putfield label : I
    //   158: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   161: dup
    //   162: aload #14
    //   164: if_acmpne -> 219
    //   167: aload #14
    //   169: areturn
    //   170: iconst_0
    //   171: istore #6
    //   173: iconst_0
    //   174: istore #13
    //   176: aload_0
    //   177: getfield I$0 : I
    //   180: istore #7
    //   182: aload_0
    //   183: getfield J$0 : J
    //   186: lstore_3
    //   187: aload_0
    //   188: getfield L$2 : Ljava/lang/Object;
    //   191: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip
    //   194: astore #11
    //   196: aload_0
    //   197: getfield L$1 : Ljava/lang/Object;
    //   200: checkcast java/util/Iterator
    //   203: astore #8
    //   205: aload_0
    //   206: getfield L$0 : Ljava/lang/Object;
    //   209: checkcast androidx/compose/runtime/snapshots/SnapshotStateMap
    //   212: astore #5
    //   214: aload_1
    //   215: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   218: aload_1
    //   219: pop
    //   220: aload #5
    //   222: checkcast java/util/Map
    //   225: aload #11
    //   227: invokevirtual getPrompt : ()Ljava/lang/String;
    //   230: iconst_1
    //   231: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
    //   234: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   239: pop
    //   240: nop
    //   241: goto -> 69
    //   244: nop
    //   245: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   248: areturn
    //   249: new java/lang/IllegalStateException
    //   252: dup
    //   253: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   255: invokespecial <init> : (Ljava/lang/String;)V
    //   258: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #51	-> 3
    //   #52	-> 36
    //   #124	-> 58
    //   #125	-> 61
    //   #125	-> 105
    //   #53	-> 117
    //   #51	-> 167
    //   #54	-> 219
    //   #55	-> 240
    //   #125	-> 241
    //   #126	-> 244
    //   #56	-> 245
    //   #51	-> 249
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   55	14	2	$this$forEachIndexed$iv	Ljava/lang/Iterable;
    //   61	42	7	index$iv	I
    //   103	67	7	index$iv	I
    //   182	63	7	index$iv	I
    //   88	15	9	item$iv	Ljava/lang/Object;
    //   103	11	9	item$iv	Ljava/lang/Object;
    //   114	56	11	tip	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;
    //   196	45	11	tip	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;
    //   114	47	12	index	I
    //   117	53	13	$i$a$-forEachIndexed-JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1$1	I
    //   58	112	6	$i$f$forEachIndexed	I
    //   0	259	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1;
    //   36	213	1	$result	Ljava/lang/Object;
    //   176	65	13	$i$a$-forEachIndexed-JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1$1	I
    //   173	72	6	$i$f$forEachIndexed	I
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1> $completion) {
    return (Continuation<Unit>)new JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1(this.$tips, this.$animationDuration, this.$visibilityMap, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\explorer\JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */