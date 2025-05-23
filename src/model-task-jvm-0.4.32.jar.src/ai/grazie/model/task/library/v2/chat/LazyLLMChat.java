/*   */ package ai.grazie.model.task.library.v2.chat;
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\005\030\0002\0020\001B\023\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000R!\020\006\032\b\022\004\022\0020\b0\0078FX\002¢\006\f\n\004\b\013\020\f\032\004\b\t\020\n¨\006\r"}, d2 = {"Lai/grazie/model/task/library/v2/chat/LazyLLMChat;", "", "chat", "Lkotlin/Function0;", "Lai/grazie/model/llm/chat/v5/LLMChat;", "(Lkotlin/jvm/functions/Function0;)V", "messages", "", "Lai/grazie/model/llm/chat/v5/LLMChatMessage;", "getMessages", "()[Lai/grazie/model/llm/chat/v5/LLMChatMessage;", "messages$delegate", "Lkotlin/Lazy;", "model-task"})
/*   */ public final class LazyLLMChat { @NotNull
/*   */   private final Function0<LLMChat> chat;
/* 5 */   public LazyLLMChat(@NotNull Function0<LLMChat> chat) { this.chat = chat;
/* 6 */     this.messages$delegate = LazyKt.lazy(new LazyLLMChat$messages$2()); } @NotNull private final Lazy messages$delegate; @NotNull public final LLMChatMessage[] getMessages() { Lazy lazy = this.messages$delegate; return (LLMChatMessage[])lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\021\n\002\030\002\n\002\b\002\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "Lai/grazie/model/llm/chat/v5/LLMChatMessage;", "invoke", "()[Lai/grazie/model/llm/chat/v5/LLMChatMessage;"}) static final class LazyLLMChat$messages$2 extends Lambda implements Function0<LLMChatMessage[]> { LazyLLMChat$messages$2() { super(0); } public final LLMChatMessage[] invoke() { return ((LLMChat)LazyLLMChat.this.chat.invoke()).getMessages(); }
/*   */      }
/*   */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\chat\LazyLLMChat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */