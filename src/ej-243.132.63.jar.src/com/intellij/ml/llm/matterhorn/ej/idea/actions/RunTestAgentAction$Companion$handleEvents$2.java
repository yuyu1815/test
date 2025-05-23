package com.intellij.ml.llm.matterhorn.ej.idea.actions;

import com.intellij.ml.llm.matterhorn.ej.idea.run.RunEvent;
import com.intellij.ml.llm.matterhorn.ej.idea.run.TestResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class RunTestAgentAction$Companion$handleEvents$2<T> implements FlowCollector {
  public final Object emit(RunEvent it, Continuation $completion) {
    // Byte code:
    //   0: aload_1
    //   1: astore_3
    //   2: aload_3
    //   3: instanceof com/intellij/ml/llm/matterhorn/ej/idea/run/BuildErrorEvent
    //   6: ifeq -> 46
    //   9: aload_0
    //   10: getfield $buildMessages : Ljava/util/List;
    //   13: new com/intellij/ml/llm/matterhorn/ej/idea/actions/BuildMessage
    //   16: dup
    //   17: aload_1
    //   18: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/BuildErrorEvent
    //   21: invokevirtual getPosition : ()Lcom/intellij/build/FilePosition;
    //   24: aload_1
    //   25: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/BuildErrorEvent
    //   28: invokevirtual getMessage : ()Ljava/lang/String;
    //   31: invokespecial <init> : (Lcom/intellij/build/FilePosition;Ljava/lang/String;)V
    //   34: invokeinterface add : (Ljava/lang/Object;)Z
    //   39: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
    //   42: pop
    //   43: goto -> 228
    //   46: aload_3
    //   47: instanceof com/intellij/ml/llm/matterhorn/ej/idea/run/BuildStartEvent
    //   50: ifne -> 228
    //   53: aload_3
    //   54: instanceof com/intellij/ml/llm/matterhorn/ej/idea/run/BuildStartedEvent
    //   57: ifne -> 228
    //   60: aload_3
    //   61: instanceof com/intellij/ml/llm/matterhorn/ej/idea/run/OutputEvent
    //   64: ifne -> 228
    //   67: aload_3
    //   68: instanceof com/intellij/ml/llm/matterhorn/ej/idea/run/RunFinishedEvent
    //   71: ifne -> 228
    //   74: aload_3
    //   75: instanceof com/intellij/ml/llm/matterhorn/ej/idea/run/RunStartedEvent
    //   78: ifne -> 228
    //   81: aload_3
    //   82: instanceof com/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent
    //   85: ifeq -> 220
    //   88: aload_1
    //   89: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent
    //   92: invokevirtual getTestResult : ()Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestResult;
    //   95: getstatic com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$Companion$handleEvents$2$WhenMappings.$EnumSwitchMapping$0 : [I
    //   98: swap
    //   99: invokevirtual ordinal : ()I
    //   102: iaload
    //   103: tableswitch default -> 205, 1 -> 124, 2 -> 154
    //   124: aload_0
    //   125: getfield $passedTestNames : Ljava/util/List;
    //   128: new com/intellij/ml/llm/matterhorn/ej/idea/actions/PassedTest
    //   131: dup
    //   132: aload_0
    //   133: getfield $classFQName : Ljava/lang/String;
    //   136: aload_1
    //   137: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent
    //   140: invokevirtual getName : ()Ljava/lang/String;
    //   143: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   146: invokeinterface add : (Ljava/lang/Object;)Z
    //   151: goto -> 213
    //   154: aload_0
    //   155: getfield $failedTests : Ljava/util/List;
    //   158: new com/intellij/ml/llm/matterhorn/ej/idea/actions/FailedTest
    //   161: dup
    //   162: aload_0
    //   163: getfield $classFQName : Ljava/lang/String;
    //   166: aload_1
    //   167: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent
    //   170: invokevirtual getName : ()Ljava/lang/String;
    //   173: aload_1
    //   174: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent
    //   177: invokevirtual getText : ()Ljava/lang/String;
    //   180: aload_1
    //   181: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent
    //   184: invokevirtual getStackTrace : ()Ljava/lang/String;
    //   187: aload_1
    //   188: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent
    //   191: invokevirtual getErrorMessage : ()Ljava/lang/String;
    //   194: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   197: invokeinterface add : (Ljava/lang/Object;)Z
    //   202: goto -> 213
    //   205: new kotlin/NoWhenBranchMatchedException
    //   208: dup
    //   209: invokespecial <init> : ()V
    //   212: athrow
    //   213: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
    //   216: pop
    //   217: goto -> 228
    //   220: new kotlin/NoWhenBranchMatchedException
    //   223: dup
    //   224: invokespecial <init> : ()V
    //   227: athrow
    //   228: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   231: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #211	-> 0
    //   #212	-> 2
    //   #213	-> 46
    //   #214	-> 53
    //   #215	-> 60
    //   #216	-> 67
    //   #217	-> 74
    //   #218	-> 81
    //   #219	-> 88
    //   #220	-> 124
    //   #221	-> 154
    //   #222	-> 158
    //   #223	-> 162
    //   #224	-> 166
    //   #225	-> 173
    //   #226	-> 180
    //   #227	-> 187
    //   #222	-> 194
    //   #221	-> 197
    //   #219	-> 205
    //   #211	-> 220
    //   #233	-> 228
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	232	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$Companion$handleEvents$2;
    //   0	232	1	it	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunEvent;
    //   0	232	2	$completion	Lkotlin/coroutines/Continuation;
  }
  
  RunTestAgentAction$Companion$handleEvents$2(List<BuildMessage> $buildMessages, List<PassedTest> $passedTestNames, String $classFQName, List<FailedTest> $failedTests) {}
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\RunTestAgentAction$Companion$handleEvents$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */