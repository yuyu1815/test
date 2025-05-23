package ai.grazie.model.task.engine;

import ai.grazie.model.llm.chat.v5.LLMChatService;
import ai.grazie.model.llm.completion.LLMCompletionService;
import ai.grazie.model.llm.profile.LLMProfile;
import ai.grazie.model.llm.profile.LLMProfileID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\032\032\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H@¢\006\002\020\005\032\032\020\006\032\0020\007*\0020\0022\006\020\003\032\0020\004H@¢\006\002\020\005\032\032\020\b\032\0020\t*\0020\0022\006\020\003\032\0020\004H@¢\006\002\020\005¨\006\n"}, d2 = {"getChatServiceOrFail", "Lai/grazie/model/llm/chat/v5/LLMChatService;", "Lai/grazie/model/task/engine/TasksLLMServiceProvider;", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "(Lai/grazie/model/task/engine/TasksLLMServiceProvider;Lai/grazie/model/llm/profile/LLMProfileID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompletionServiceOrFail", "Lai/grazie/model/llm/completion/LLMCompletionService;", "getProfileOrFail", "Lai/grazie/model/llm/profile/LLMProfile;", "model-task"})
public final class TasksLLMServiceProviderKt {
  @Nullable
  public static final Object getChatServiceOrFail(@NotNull TasksLLMServiceProvider $this$getChatServiceOrFail, @NotNull LLMProfileID profile, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof ai/grazie/model/task/engine/TasksLLMServiceProviderKt$getChatServiceOrFail$1
    //   4: ifeq -> 39
    //   7: aload_2
    //   8: checkcast ai/grazie/model/task/engine/TasksLLMServiceProviderKt$getChatServiceOrFail$1
    //   11: astore #4
    //   13: aload #4
    //   15: getfield label : I
    //   18: ldc -2147483648
    //   20: iand
    //   21: ifeq -> 39
    //   24: aload #4
    //   26: dup
    //   27: getfield label : I
    //   30: ldc -2147483648
    //   32: isub
    //   33: putfield label : I
    //   36: goto -> 49
    //   39: new ai/grazie/model/task/engine/TasksLLMServiceProviderKt$getChatServiceOrFail$1
    //   42: dup
    //   43: aload_2
    //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
    //   47: astore #4
    //   49: aload #4
    //   51: getfield result : Ljava/lang/Object;
    //   54: astore_3
    //   55: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   58: astore #5
    //   60: aload #4
    //   62: getfield label : I
    //   65: tableswitch default -> 162, 0 -> 88, 1 -> 122
    //   88: aload_3
    //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   92: aload_0
    //   93: aload_1
    //   94: aload #4
    //   96: aload #4
    //   98: aload_1
    //   99: putfield L$0 : Ljava/lang/Object;
    //   102: aload #4
    //   104: iconst_1
    //   105: putfield label : I
    //   108: invokeinterface getChatService : (Lai/grazie/model/llm/profile/LLMProfileID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   113: dup
    //   114: aload #5
    //   116: if_acmpne -> 136
    //   119: aload #5
    //   121: areturn
    //   122: aload #4
    //   124: getfield L$0 : Ljava/lang/Object;
    //   127: checkcast ai/grazie/model/llm/profile/LLMProfileID
    //   130: astore_1
    //   131: aload_3
    //   132: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   135: aload_3
    //   136: checkcast ai/grazie/model/llm/chat/v5/LLMChatService
    //   139: dup
    //   140: ifnonnull -> 161
    //   143: pop
    //   144: new java/lang/IllegalStateException
    //   147: dup
    //   148: aload_1
    //   149: <illegal opcode> makeConcatWithConstants : (Lai/grazie/model/llm/profile/LLMProfileID;)Ljava/lang/String;
    //   154: invokevirtual toString : ()Ljava/lang/String;
    //   157: invokespecial <init> : (Ljava/lang/String;)V
    //   160: athrow
    //   161: areturn
    //   162: new java/lang/IllegalStateException
    //   165: dup
    //   166: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   168: invokespecial <init> : (Ljava/lang/String;)V
    //   171: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #18	-> 58
    //   #19	-> 92
    //   #18	-> 119
    //   #19	-> 136
    //   #18	-> 162
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   92	21	0	$this$getChatServiceOrFail	Lai/grazie/model/task/engine/TasksLLMServiceProvider;
    //   92	30	1	profile	Lai/grazie/model/llm/profile/LLMProfileID;
    //   131	31	1	profile	Lai/grazie/model/llm/profile/LLMProfileID;
    //   0	172	2	$completion	Lkotlin/coroutines/Continuation;
    //   49	113	4	$continuation	Lkotlin/coroutines/Continuation;
    //   55	107	3	$result	Ljava/lang/Object;
  }
  
  @Nullable
  public static final Object getCompletionServiceOrFail(@NotNull TasksLLMServiceProvider $this$getCompletionServiceOrFail, @NotNull LLMProfileID profile, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof ai/grazie/model/task/engine/TasksLLMServiceProviderKt$getCompletionServiceOrFail$1
    //   4: ifeq -> 39
    //   7: aload_2
    //   8: checkcast ai/grazie/model/task/engine/TasksLLMServiceProviderKt$getCompletionServiceOrFail$1
    //   11: astore #4
    //   13: aload #4
    //   15: getfield label : I
    //   18: ldc -2147483648
    //   20: iand
    //   21: ifeq -> 39
    //   24: aload #4
    //   26: dup
    //   27: getfield label : I
    //   30: ldc -2147483648
    //   32: isub
    //   33: putfield label : I
    //   36: goto -> 49
    //   39: new ai/grazie/model/task/engine/TasksLLMServiceProviderKt$getCompletionServiceOrFail$1
    //   42: dup
    //   43: aload_2
    //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
    //   47: astore #4
    //   49: aload #4
    //   51: getfield result : Ljava/lang/Object;
    //   54: astore_3
    //   55: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   58: astore #5
    //   60: aload #4
    //   62: getfield label : I
    //   65: tableswitch default -> 162, 0 -> 88, 1 -> 122
    //   88: aload_3
    //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   92: aload_0
    //   93: aload_1
    //   94: aload #4
    //   96: aload #4
    //   98: aload_1
    //   99: putfield L$0 : Ljava/lang/Object;
    //   102: aload #4
    //   104: iconst_1
    //   105: putfield label : I
    //   108: invokeinterface getCompletionService : (Lai/grazie/model/llm/profile/LLMProfileID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   113: dup
    //   114: aload #5
    //   116: if_acmpne -> 136
    //   119: aload #5
    //   121: areturn
    //   122: aload #4
    //   124: getfield L$0 : Ljava/lang/Object;
    //   127: checkcast ai/grazie/model/llm/profile/LLMProfileID
    //   130: astore_1
    //   131: aload_3
    //   132: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   135: aload_3
    //   136: checkcast ai/grazie/model/llm/completion/LLMCompletionService
    //   139: dup
    //   140: ifnonnull -> 161
    //   143: pop
    //   144: new java/lang/IllegalStateException
    //   147: dup
    //   148: aload_1
    //   149: <illegal opcode> makeConcatWithConstants : (Lai/grazie/model/llm/profile/LLMProfileID;)Ljava/lang/String;
    //   154: invokevirtual toString : ()Ljava/lang/String;
    //   157: invokespecial <init> : (Ljava/lang/String;)V
    //   160: athrow
    //   161: areturn
    //   162: new java/lang/IllegalStateException
    //   165: dup
    //   166: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   168: invokespecial <init> : (Ljava/lang/String;)V
    //   171: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #22	-> 58
    //   #23	-> 92
    //   #22	-> 119
    //   #23	-> 136
    //   #22	-> 162
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   92	21	0	$this$getCompletionServiceOrFail	Lai/grazie/model/task/engine/TasksLLMServiceProvider;
    //   92	30	1	profile	Lai/grazie/model/llm/profile/LLMProfileID;
    //   131	31	1	profile	Lai/grazie/model/llm/profile/LLMProfileID;
    //   0	172	2	$completion	Lkotlin/coroutines/Continuation;
    //   49	113	4	$continuation	Lkotlin/coroutines/Continuation;
    //   55	107	3	$result	Ljava/lang/Object;
  }
  
  @Nullable
  public static final Object getProfileOrFail(@NotNull TasksLLMServiceProvider $this$getProfileOrFail, @NotNull LLMProfileID profile, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof ai/grazie/model/task/engine/TasksLLMServiceProviderKt$getProfileOrFail$1
    //   4: ifeq -> 39
    //   7: aload_2
    //   8: checkcast ai/grazie/model/task/engine/TasksLLMServiceProviderKt$getProfileOrFail$1
    //   11: astore #4
    //   13: aload #4
    //   15: getfield label : I
    //   18: ldc -2147483648
    //   20: iand
    //   21: ifeq -> 39
    //   24: aload #4
    //   26: dup
    //   27: getfield label : I
    //   30: ldc -2147483648
    //   32: isub
    //   33: putfield label : I
    //   36: goto -> 49
    //   39: new ai/grazie/model/task/engine/TasksLLMServiceProviderKt$getProfileOrFail$1
    //   42: dup
    //   43: aload_2
    //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
    //   47: astore #4
    //   49: aload #4
    //   51: getfield result : Ljava/lang/Object;
    //   54: astore_3
    //   55: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   58: astore #5
    //   60: aload #4
    //   62: getfield label : I
    //   65: tableswitch default -> 162, 0 -> 88, 1 -> 122
    //   88: aload_3
    //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   92: aload_0
    //   93: aload_1
    //   94: aload #4
    //   96: aload #4
    //   98: aload_1
    //   99: putfield L$0 : Ljava/lang/Object;
    //   102: aload #4
    //   104: iconst_1
    //   105: putfield label : I
    //   108: invokeinterface getProfile : (Lai/grazie/model/llm/profile/LLMProfileID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   113: dup
    //   114: aload #5
    //   116: if_acmpne -> 136
    //   119: aload #5
    //   121: areturn
    //   122: aload #4
    //   124: getfield L$0 : Ljava/lang/Object;
    //   127: checkcast ai/grazie/model/llm/profile/LLMProfileID
    //   130: astore_1
    //   131: aload_3
    //   132: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   135: aload_3
    //   136: checkcast ai/grazie/model/llm/profile/LLMProfile
    //   139: dup
    //   140: ifnonnull -> 161
    //   143: pop
    //   144: new java/lang/IllegalStateException
    //   147: dup
    //   148: aload_1
    //   149: <illegal opcode> makeConcatWithConstants : (Lai/grazie/model/llm/profile/LLMProfileID;)Ljava/lang/String;
    //   154: invokevirtual toString : ()Ljava/lang/String;
    //   157: invokespecial <init> : (Ljava/lang/String;)V
    //   160: athrow
    //   161: areturn
    //   162: new java/lang/IllegalStateException
    //   165: dup
    //   166: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   168: invokespecial <init> : (Ljava/lang/String;)V
    //   171: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #26	-> 58
    //   #27	-> 92
    //   #26	-> 119
    //   #27	-> 136
    //   #26	-> 162
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   92	21	0	$this$getProfileOrFail	Lai/grazie/model/task/engine/TasksLLMServiceProvider;
    //   92	30	1	profile	Lai/grazie/model/llm/profile/LLMProfileID;
    //   131	31	1	profile	Lai/grazie/model/llm/profile/LLMProfileID;
    //   0	172	2	$completion	Lkotlin/coroutines/Continuation;
    //   49	113	4	$continuation	Lkotlin/coroutines/Continuation;
    //   55	107	3	$result	Ljava/lang/Object;
  }
  
  @DebugMetadata(f = "TasksLLMServiceProvider.kt", l = {19}, i = {0}, s = {"L$0"}, n = {"profile"}, m = "getChatServiceOrFail", c = "ai.grazie.model.task.engine.TasksLLMServiceProviderKt")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class TasksLLMServiceProviderKt$getChatServiceOrFail$1 extends ContinuationImpl {
    Object L$0;
    
    int label;
    
    TasksLLMServiceProviderKt$getChatServiceOrFail$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return TasksLLMServiceProviderKt.getChatServiceOrFail(null, null, (Continuation<? super LLMChatService>)this);
    }
  }
  
  @DebugMetadata(f = "TasksLLMServiceProvider.kt", l = {23}, i = {0}, s = {"L$0"}, n = {"profile"}, m = "getCompletionServiceOrFail", c = "ai.grazie.model.task.engine.TasksLLMServiceProviderKt")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class TasksLLMServiceProviderKt$getCompletionServiceOrFail$1 extends ContinuationImpl {
    Object L$0;
    
    int label;
    
    TasksLLMServiceProviderKt$getCompletionServiceOrFail$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return TasksLLMServiceProviderKt.getCompletionServiceOrFail(null, null, (Continuation<? super LLMCompletionService>)this);
    }
  }
  
  @DebugMetadata(f = "TasksLLMServiceProvider.kt", l = {27}, i = {0}, s = {"L$0"}, n = {"profile"}, m = "getProfileOrFail", c = "ai.grazie.model.task.engine.TasksLLMServiceProviderKt")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class TasksLLMServiceProviderKt$getProfileOrFail$1 extends ContinuationImpl {
    Object L$0;
    
    int label;
    
    TasksLLMServiceProviderKt$getProfileOrFail$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return TasksLLMServiceProviderKt.getProfileOrFail(null, null, (Continuation<? super LLMProfile>)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\engine\TasksLLMServiceProviderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */