package com.intellij.ml.llm.matterhorn.ej.core;

import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\002\030\002\n\000\032\f\020\000\032\0020\001*\0020\002H\002¨\006\003"}, d2 = {"isErrorResult", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "ej-core"})
@SourceDebugExtension({"SMAP\nAbstractIssueAgentWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractIssueAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorkerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,366:1\n1755#2,3:367\n*S KotlinDebug\n*F\n+ 1 AbstractIssueAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorkerKt\n*L\n299#1:367,3\n*E\n"})
public final class AbstractIssueAgentWorkerKt {
  private static final boolean isErrorResult(MatterhornChatElement $this$isErrorResult) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface getContent : ()Ljava/lang/String;
    //   6: ldc 'ERROR:'
    //   8: iconst_0
    //   9: iconst_2
    //   10: aconst_null
    //   11: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   14: ifeq -> 19
    //   17: iconst_1
    //   18: ireturn
    //   19: aload_0
    //   20: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornUserChatMessageWithToolResults
    //   23: ifeq -> 110
    //   26: aload_0
    //   27: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornUserChatMessageWithToolResults
    //   30: invokevirtual getToolResults : ()Ljava/util/List;
    //   33: checkcast java/lang/Iterable
    //   36: astore_1
    //   37: iconst_0
    //   38: istore_2
    //   39: aload_1
    //   40: instanceof java/util/Collection
    //   43: ifeq -> 62
    //   46: aload_1
    //   47: checkcast java/util/Collection
    //   50: invokeinterface isEmpty : ()Z
    //   55: ifeq -> 62
    //   58: iconst_0
    //   59: goto -> 109
    //   62: aload_1
    //   63: invokeinterface iterator : ()Ljava/util/Iterator;
    //   68: astore_3
    //   69: aload_3
    //   70: invokeinterface hasNext : ()Z
    //   75: ifeq -> 108
    //   78: aload_3
    //   79: invokeinterface next : ()Ljava/lang/Object;
    //   84: astore #4
    //   86: aload #4
    //   88: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornToolResult
    //   91: astore #5
    //   93: iconst_0
    //   94: istore #6
    //   96: aload #5
    //   98: invokevirtual isError : ()Z
    //   101: ifeq -> 69
    //   104: iconst_1
    //   105: goto -> 109
    //   108: iconst_0
    //   109: ireturn
    //   110: iconst_0
    //   111: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #296	-> 0
    //   #298	-> 19
    //   #299	-> 26
    //   #367	-> 39
    //   #368	-> 62
    //   #299	-> 96
    //   #368	-> 101
    //   #369	-> 108
    //   #299	-> 109
    //   #301	-> 110
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   96	5	6	$i$a$-any-AbstractIssueAgentWorkerKt$isErrorResult$1	I
    //   93	8	5	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolResult;
    //   86	22	4	element$iv	Ljava/lang/Object;
    //   39	70	2	$i$f$any	I
    //   37	72	1	$this$any$iv	Ljava/lang/Iterable;
    //   0	112	0	$this$isErrorResult	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AbstractIssueAgentWorkerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */