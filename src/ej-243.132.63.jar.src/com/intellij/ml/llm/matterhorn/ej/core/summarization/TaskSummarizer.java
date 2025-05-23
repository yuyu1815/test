package com.intellij.ml.llm.matterhorn.ej.core.summarization;

import com.intellij.ml.llm.matterhorn.ExecutionContext;
import com.intellij.ml.llm.matterhorn.ej.core.AgentIssue;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\036\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH@¢\006\002\020\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/summarization/TaskSummarizer;", "", "<init>", "()V", "summarizeTask", "", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "input", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
public final class TaskSummarizer {
  @NotNull
  public static final TaskSummarizer INSTANCE = new TaskSummarizer();
  
  @Nullable
  public final Object summarizeTask(@NotNull ExecutionContext context, @NotNull AgentIssue input, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_3
    //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/summarization/TaskSummarizer$summarizeTask$1
    //   4: ifeq -> 39
    //   7: aload_3
    //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/summarization/TaskSummarizer$summarizeTask$1
    //   11: astore #8
    //   13: aload #8
    //   15: getfield label : I
    //   18: ldc -2147483648
    //   20: iand
    //   21: ifeq -> 39
    //   24: aload #8
    //   26: dup
    //   27: getfield label : I
    //   30: ldc -2147483648
    //   32: isub
    //   33: putfield label : I
    //   36: goto -> 50
    //   39: new com/intellij/ml/llm/matterhorn/ej/core/summarization/TaskSummarizer$summarizeTask$1
    //   42: dup
    //   43: aload_0
    //   44: aload_3
    //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/summarization/TaskSummarizer;Lkotlin/coroutines/Continuation;)V
    //   48: astore #8
    //   50: aload #8
    //   52: getfield result : Ljava/lang/Object;
    //   55: astore #7
    //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   60: astore #9
    //   62: aload #8
    //   64: getfield label : I
    //   67: tableswitch default -> 238, 0 -> 88, 1 -> 223
    //   88: aload #7
    //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   93: new com/intellij/ml/llm/matterhorn/llm/ModelParameters
    //   96: dup
    //   97: getstatic com/intellij/ml/llm/matterhorn/llm/LLM.Companion : Lcom/intellij/ml/llm/matterhorn/llm/LLM$Companion;
    //   100: invokevirtual getGPT_4_O_MINI_2024_07_18 : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
    //   103: iconst_0
    //   104: aconst_null
    //   105: aconst_null
    //   106: aconst_null
    //   107: aconst_null
    //   108: aconst_null
    //   109: aconst_null
    //   110: aconst_null
    //   111: aconst_null
    //   112: aconst_null
    //   113: aconst_null
    //   114: aconst_null
    //   115: iconst_0
    //   116: aconst_null
    //   117: sipush #32766
    //   120: aconst_null
    //   121: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/LLM;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   124: astore #4
    //   126: aload_1
    //   127: new com/intellij/ml/llm/matterhorn/requests/SimpleRequest
    //   130: dup
    //   131: ldc 'You are a programming task description summarizer'
    //   133: iconst_2
    //   134: anewarray com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
    //   137: astore #6
    //   139: aload #6
    //   141: iconst_0
    //   142: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
    //   145: dup
    //   146: ldc 'Provide short helpful name out of 5-10 words. Reply with nothing but the summary of the text. Here is the text:'
    //   148: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
    //   151: aconst_null
    //   152: aconst_null
    //   153: bipush #12
    //   155: aconst_null
    //   156: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   159: aastore
    //   160: aload #6
    //   162: iconst_1
    //   163: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
    //   166: dup
    //   167: aload_2
    //   168: invokevirtual getDescription : ()Ljava/lang/String;
    //   171: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
    //   174: aconst_null
    //   175: aconst_null
    //   176: bipush #12
    //   178: aconst_null
    //   179: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   182: aastore
    //   183: aload #6
    //   185: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
    //   188: aload #4
    //   190: aconst_null
    //   191: bipush #8
    //   193: aconst_null
    //   194: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   197: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
    //   200: iconst_0
    //   201: aload #8
    //   203: iconst_2
    //   204: aconst_null
    //   205: aload #8
    //   207: iconst_1
    //   208: putfield label : I
    //   211: invokestatic sendToGrazie$default : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    //   214: dup
    //   215: aload #9
    //   217: if_acmpne -> 230
    //   220: aload #9
    //   222: areturn
    //   223: aload #7
    //   225: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   228: aload #7
    //   230: checkcast java/lang/String
    //   233: astore #5
    //   235: aload #5
    //   237: areturn
    //   238: new java/lang/IllegalStateException
    //   241: dup
    //   242: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   244: invokespecial <init> : (Ljava/lang/String;)V
    //   247: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #12	-> 60
    //   #16	-> 93
    //   #18	-> 126
    //   #19	-> 127
    //   #20	-> 131
    //   #22	-> 133
    //   #23	-> 146
    //   #24	-> 148
    //   #22	-> 151
    //   #26	-> 163
    //   #27	-> 167
    //   #28	-> 171
    //   #26	-> 174
    //   #22	-> 183
    //   #21	-> 185
    //   #31	-> 188
    //   #19	-> 190
    //   #18	-> 200
    //   #12	-> 220
    //   #34	-> 235
    //   #12	-> 238
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   93	34	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   93	78	2	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
    //   126	64	4	defaultModel	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
    //   235	3	5	summary	Ljava/lang/String;
    //   0	248	3	$completion	Lkotlin/coroutines/Continuation;
    //   50	188	8	$continuation	Lkotlin/coroutines/Continuation;
    //   57	181	7	$result	Ljava/lang/Object;
  }
  
  @DebugMetadata(f = "TaskSummarizer.kt", l = {18}, i = {}, s = {}, n = {}, m = "summarizeTask", c = "com.intellij.ml.llm.matterhorn.ej.core.summarization.TaskSummarizer")
  @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
  static final class TaskSummarizer$summarizeTask$1 extends ContinuationImpl {
    int label;
    
    TaskSummarizer$summarizeTask$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return TaskSummarizer.this.summarizeTask(null, null, (Continuation<? super String>)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\summarization\TaskSummarizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */