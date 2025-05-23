package com.intellij.ml.llm.matterhorn.ej.core.actions;

import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\002\bf\030\000 \r2\0020\001:\001\rJ \020\002\032\0020\0032\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\007H¦@¢\006\002\020\bJ\b\020\t\032\0020\nH&J\b\020\013\032\0020\fH&¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider;", "", "getAction", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "executionAgentContext", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "doReview", "", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActionString", "", "getObservation", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "Companion", "ej-core"})
public interface ActionProvider {
  @NotNull
  public static final Companion Companion = Companion.$$INSTANCE;
  
  @Nullable
  Object getAction(@NotNull ExecutionAgentContext paramExecutionAgentContext, boolean paramBoolean, @NotNull Continuation<? super ActionRequest> paramContinuation);
  
  @NotNull
  String getActionString();
  
  @NotNull
  MatterhornChatElement getObservation();
  
  @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J(\020\004\032\0020\005*\0020\0062\006\020\007\032\0020\b2\f\020\t\032\b\022\004\022\0020\0130\nH@¢\006\002\020\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider$Companion;", "", "<init>", "()V", "reviewRequest", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "executionAgentContext", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "availableActions", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
  public static final class Companion {
    @Nullable
    public final Object reviewRequest(@NotNull ActionRequest $this$reviewRequest, @NotNull ExecutionAgentContext executionAgentContext, @NotNull List availableActions, @NotNull Continuation $completion) {
      // Byte code:
      //   0: aload #4
      //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider$Companion$reviewRequest$1
      //   5: ifeq -> 41
      //   8: aload #4
      //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider$Companion$reviewRequest$1
      //   13: astore #7
      //   15: aload #7
      //   17: getfield label : I
      //   20: ldc -2147483648
      //   22: iand
      //   23: ifeq -> 41
      //   26: aload #7
      //   28: dup
      //   29: getfield label : I
      //   32: ldc -2147483648
      //   34: isub
      //   35: putfield label : I
      //   38: goto -> 53
      //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider$Companion$reviewRequest$1
      //   44: dup
      //   45: aload_0
      //   46: aload #4
      //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider$Companion;Lkotlin/coroutines/Continuation;)V
      //   51: astore #7
      //   53: aload #7
      //   55: getfield result : Ljava/lang/Object;
      //   58: astore #6
      //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
      //   63: astore #8
      //   65: aload #7
      //   67: getfield label : I
      //   70: tableswitch default -> 158, 0 -> 92, 1 -> 127
      //   92: aload #6
      //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
      //   97: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentAction.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion;
      //   100: aload_1
      //   101: aload_2
      //   102: aload_3
      //   103: iconst_0
      //   104: aload #7
      //   106: bipush #8
      //   108: aconst_null
      //   109: aload #7
      //   111: iconst_1
      //   112: putfield label : I
      //   115: invokestatic reviewActionRequest$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/util/List;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
      //   118: dup
      //   119: aload #8
      //   121: if_acmpne -> 134
      //   124: aload #8
      //   126: areturn
      //   127: aload #6
      //   129: invokestatic throwOnFailure : (Ljava/lang/Object;)V
      //   132: aload #6
      //   134: checkcast java/lang/String
      //   137: astore #5
      //   139: aload #5
      //   141: ifnull -> 154
      //   144: new java/lang/Exception
      //   147: dup
      //   148: aload #5
      //   150: invokespecial <init> : (Ljava/lang/String;)V
      //   153: athrow
      //   154: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
      //   157: areturn
      //   158: new java/lang/IllegalStateException
      //   161: dup
      //   162: ldc 'call to 'resume' before 'invoke' with coroutine'
      //   164: invokespecial <init> : (Ljava/lang/String;)V
      //   167: athrow
      // Line number table:
      //   Java source line number -> byte code offset
      //   #16	-> 63
      //   #17	-> 97
      //   #18	-> 100
      //   #19	-> 101
      //   #20	-> 102
      //   #17	-> 103
      //   #16	-> 124
      //   #22	-> 139
      //   #23	-> 144
      //   #25	-> 154
      //   #16	-> 158
      // Local variable table:
      //   start	length	slot	name	descriptor
      //   97	4	1	$this$reviewRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
      //   97	5	2	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
      //   97	6	3	availableActions	Ljava/util/List;
      //   139	19	5	review	Ljava/lang/String;
      //   0	168	4	$completion	Lkotlin/coroutines/Continuation;
      //   53	105	7	$continuation	Lkotlin/coroutines/Continuation;
      //   60	98	6	$result	Ljava/lang/Object;
    }
    
    @DebugMetadata(f = "ActionProvider.kt", l = {17}, i = {}, s = {}, n = {}, m = "reviewRequest", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.ActionProvider$Companion")
    @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
    static final class ActionProvider$Companion$reviewRequest$1 extends ContinuationImpl {
      int label;
      
      ActionProvider$Companion$reviewRequest$1(Continuation $completion) {
        super($completion);
      }
      
      @Nullable
      public final Object invokeSuspend(@NotNull Object $result) {
        this.result = $result;
        this.label |= Integer.MIN_VALUE;
        return ActionProvider.Companion.this.reviewRequest(null, null, null, (Continuation<? super Unit>)this);
      }
    }
  }
  
  @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
  public static final class DefaultImpls {}
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\ActionProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */