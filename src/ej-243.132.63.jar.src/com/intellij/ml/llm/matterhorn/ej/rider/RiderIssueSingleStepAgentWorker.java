/*    */ package com.intellij.ml.llm.matterhorn.ej.rider;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\034\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH@¢\006\002\020\tJ\034\020\n\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH@¢\006\002\020\tJ\016\020\013\032\0020\fH@¢\006\002\020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/rider/RiderIssueSingleStepAgentWorker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;", "<init>", "()V", "getAvailableActions", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHiddenActions", "getDemonstration", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-rider"})
/*    */ public final class RiderIssueSingleStepAgentWorker extends AbstractIssueSingleStepAgentWorker {
/*    */   @Nullable
/*    */   public Object getAvailableActions(@NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/rider/RiderIssueSingleStepAgentWorker$getAvailableActions$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/rider/RiderIssueSingleStepAgentWorker$getAvailableActions$1
/*    */     //   11: astore #7
/*    */     //   13: aload #7
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #7
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/rider/RiderIssueSingleStepAgentWorker$getAvailableActions$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/rider/RiderIssueSingleStepAgentWorker;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 191, 0 -> 88, 1 -> 151
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic com/intellij/ml/llm/matterhorn/ej/core/DefaultSingleStepAgent.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/DefaultSingleStepAgent;
/*    */     //   96: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker$Companion;
/*    */     //   99: invokevirtual getErrorCheckers : ()Ljava/util/List;
/*    */     //   102: astore #4
/*    */     //   104: astore_3
/*    */     //   105: aload_0
/*    */     //   106: aload_1
/*    */     //   107: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   112: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*    */     //   115: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   118: aload #7
/*    */     //   120: aload #7
/*    */     //   122: aload_3
/*    */     //   123: putfield L$0 : Ljava/lang/Object;
/*    */     //   126: aload #7
/*    */     //   128: aload #4
/*    */     //   130: putfield L$1 : Ljava/lang/Object;
/*    */     //   133: aload #7
/*    */     //   135: iconst_1
/*    */     //   136: putfield label : I
/*    */     //   139: invokevirtual getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   142: dup
/*    */     //   143: aload #8
/*    */     //   145: if_acmpne -> 177
/*    */     //   148: aload #8
/*    */     //   150: areturn
/*    */     //   151: aload #7
/*    */     //   153: getfield L$1 : Ljava/lang/Object;
/*    */     //   156: checkcast java/util/List
/*    */     //   159: astore #4
/*    */     //   161: aload #7
/*    */     //   163: getfield L$0 : Ljava/lang/Object;
/*    */     //   166: checkcast com/intellij/ml/llm/matterhorn/ej/core/DefaultSingleStepAgent
/*    */     //   169: astore_3
/*    */     //   170: aload #6
/*    */     //   172: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   175: aload #6
/*    */     //   177: astore #5
/*    */     //   179: aload_3
/*    */     //   180: aload #4
/*    */     //   182: aload #5
/*    */     //   184: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*    */     //   187: invokevirtual getAvailableActions : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;)Ljava/util/List;
/*    */     //   190: areturn
/*    */     //   191: new java/lang/IllegalStateException
/*    */     //   194: dup
/*    */     //   195: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   197: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   200: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 60
/*    */     //   #13	-> 93
/*    */     //   #14	-> 96
/*    */     //   #15	-> 105
/*    */     //   #12	-> 148
/*    */     //   #13	-> 187
/*    */     //   #12	-> 191
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	49	0	this	Lcom/intellij/ml/llm/matterhorn/ej/rider/RiderIssueSingleStepAgentWorker;
/*    */     //   93	49	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   0	201	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	141	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	134	6	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object getHiddenActions(@NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/rider/RiderIssueSingleStepAgentWorker$getHiddenActions$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/rider/RiderIssueSingleStepAgentWorker$getHiddenActions$1
/*    */     //   11: astore #7
/*    */     //   13: aload #7
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #7
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/rider/RiderIssueSingleStepAgentWorker$getHiddenActions$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/rider/RiderIssueSingleStepAgentWorker;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 191, 0 -> 88, 1 -> 151
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic com/intellij/ml/llm/matterhorn/ej/core/DefaultSingleStepAgent.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/DefaultSingleStepAgent;
/*    */     //   96: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxChecker.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxChecker$Companion;
/*    */     //   99: invokevirtual getSyntaxCheckers : ()Ljava/util/List;
/*    */     //   102: astore #4
/*    */     //   104: astore_3
/*    */     //   105: aload_0
/*    */     //   106: aload_1
/*    */     //   107: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   112: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*    */     //   115: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   118: aload #7
/*    */     //   120: aload #7
/*    */     //   122: aload_3
/*    */     //   123: putfield L$0 : Ljava/lang/Object;
/*    */     //   126: aload #7
/*    */     //   128: aload #4
/*    */     //   130: putfield L$1 : Ljava/lang/Object;
/*    */     //   133: aload #7
/*    */     //   135: iconst_1
/*    */     //   136: putfield label : I
/*    */     //   139: invokevirtual getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   142: dup
/*    */     //   143: aload #8
/*    */     //   145: if_acmpne -> 177
/*    */     //   148: aload #8
/*    */     //   150: areturn
/*    */     //   151: aload #7
/*    */     //   153: getfield L$1 : Ljava/lang/Object;
/*    */     //   156: checkcast java/util/List
/*    */     //   159: astore #4
/*    */     //   161: aload #7
/*    */     //   163: getfield L$0 : Ljava/lang/Object;
/*    */     //   166: checkcast com/intellij/ml/llm/matterhorn/ej/core/DefaultSingleStepAgent
/*    */     //   169: astore_3
/*    */     //   170: aload #6
/*    */     //   172: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   175: aload #6
/*    */     //   177: astore #5
/*    */     //   179: aload_3
/*    */     //   180: aload #4
/*    */     //   182: aload #5
/*    */     //   184: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*    */     //   187: invokevirtual getHiddenActions : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;)Ljava/util/List;
/*    */     //   190: areturn
/*    */     //   191: new java/lang/IllegalStateException
/*    */     //   194: dup
/*    */     //   195: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   197: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   200: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 60
/*    */     //   #20	-> 93
/*    */     //   #21	-> 96
/*    */     //   #22	-> 105
/*    */     //   #19	-> 148
/*    */     //   #20	-> 187
/*    */     //   #19	-> 191
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	49	0	this	Lcom/intellij/ml/llm/matterhorn/ej/rider/RiderIssueSingleStepAgentWorker;
/*    */     //   93	49	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   0	201	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	141	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	134	6	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object getDemonstration(@NotNull Continuation $completion) {
/* 28 */     return "";
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "RiderIssueSingleStepAgentWorker.kt", l = {15}, i = {}, s = {}, n = {}, m = "getAvailableActions", c = "com.intellij.ml.llm.matterhorn.ej.rider.RiderIssueSingleStepAgentWorker")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class RiderIssueSingleStepAgentWorker$getAvailableActions$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     RiderIssueSingleStepAgentWorker$getAvailableActions$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return RiderIssueSingleStepAgentWorker.this.getAvailableActions(null, (Continuation<? super List<? extends AgentAction>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "RiderIssueSingleStepAgentWorker.kt", l = {22}, i = {}, s = {}, n = {}, m = "getHiddenActions", c = "com.intellij.ml.llm.matterhorn.ej.rider.RiderIssueSingleStepAgentWorker")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class RiderIssueSingleStepAgentWorker$getHiddenActions$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     RiderIssueSingleStepAgentWorker$getHiddenActions$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return RiderIssueSingleStepAgentWorker.this.getHiddenActions(null, (Continuation<? super List<? extends AgentAction>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\rider\RiderIssueSingleStepAgentWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */