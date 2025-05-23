/*    */ package ai.grazie.model.llm.chat.v5;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.caching.LLMCachePoint;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\020!\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020 \n\002\b\003\030\0002\0020\001B\021\022\n\b\002\020\002\032\004\030\0010\003¢\006\002\020\004J\016\020\b\032\0020\0002\006\020\t\032\0020\003J\030\020\b\032\0020\0002\006\020\n\032\0020\0032\006\020\013\032\0020\003H\007J\006\020\f\032\0020\rJ\026\020\016\032\0020\0002\006\020\017\032\0020\0032\006\020\020\032\0020\003J\006\020\021\032\0020\022J\016\020\023\032\0020\0002\006\020\023\032\0020\007J\016\020\005\032\0020\0002\006\020\024\032\0020\rJ\026\020\005\032\0020\0002\f\020\025\032\b\022\004\022\0020\0070\026H\007J\016\020\027\032\0020\0002\006\020\t\032\0020\003J\016\020\030\032\0020\0002\006\020\t\032\0020\003R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000¨\006\031"}, d2 = {"Lai/grazie/model/llm/chat/v5/LLMChat$Builder;", "", "instruction", "", "(Ljava/lang/String;)V", "messages", "", "Lai/grazie/model/llm/chat/v5/LLMChatMessage;", "assistant", "text", "functionName", "functionContent", "build", "Lai/grazie/model/llm/chat/v5/LLMChat;", "function", "name", "result", "getCachingPoint", "Lai/grazie/model/llm/chat/caching/LLMCachePoint;", "message", "chat", "chatMessages", "", "system", "user", "model-llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMChat.kt\nai/grazie/model/llm/chat/v5/LLMChat$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,83:1\n1#2:84\n37#3:85\n36#3,3:86\n*S KotlinDebug\n*F\n+ 1 LLMChat.kt\nai/grazie/model/llm/chat/v5/LLMChat$Builder\n*L\n74#1:85\n74#1:86,3\n*E\n"})
/*    */ public final class Builder
/*    */ {
/*    */   @NotNull
/*    */   private final List<LLMChatMessage> messages;
/*    */   
/*    */   public Builder(@Nullable String instruction) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokespecial <init> : ()V
/*    */     //   4: aload_0
/*    */     //   5: aload_1
/*    */     //   6: dup
/*    */     //   7: ifnull -> 55
/*    */     //   10: astore_2
/*    */     //   11: astore #5
/*    */     //   13: iconst_0
/*    */     //   14: istore_3
/*    */     //   15: iconst_1
/*    */     //   16: anewarray ai/grazie/model/llm/chat/v5/LLMChatMessage
/*    */     //   19: astore #4
/*    */     //   21: aload #4
/*    */     //   23: iconst_0
/*    */     //   24: new ai/grazie/model/llm/chat/v5/LLMChatAssistantMessage
/*    */     //   27: dup
/*    */     //   28: aload_2
/*    */     //   29: aconst_null
/*    */     //   30: iconst_2
/*    */     //   31: aconst_null
/*    */     //   32: invokespecial <init> : (Ljava/lang/String;Lai/grazie/model/llm/chat/v5/LLMChatAssistantMessage$FunctionCallResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   35: aastore
/*    */     //   36: aload #4
/*    */     //   38: invokestatic arrayListOf : ([Ljava/lang/Object;)Ljava/util/ArrayList;
/*    */     //   41: aload #5
/*    */     //   43: swap
/*    */     //   44: nop
/*    */     //   45: dup
/*    */     //   46: ifnull -> 55
/*    */     //   49: checkcast java/util/List
/*    */     //   52: goto -> 66
/*    */     //   55: pop
/*    */     //   56: new java/util/ArrayList
/*    */     //   59: dup
/*    */     //   60: invokespecial <init> : ()V
/*    */     //   63: checkcast java/util/List
/*    */     //   66: putfield messages : Ljava/util/List;
/*    */     //   69: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 0
/*    */     //   #30	-> 4
/*    */     //   #84	-> 11
/*    */     //   #30	-> 15
/*    */     //   #30	-> 44
/*    */     //   #30	-> 45
/*    */     //   #30	-> 66
/*    */     //   #29	-> 69
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   15	26	3	$i$a$-let-LLMChat$Builder$messages$1	I
/*    */     //   13	28	2	it	Ljava/lang/String;
/*    */     //   0	70	0	this	Lai/grazie/model/llm/chat/v5/LLMChat$Builder;
/*    */     //   0	70	1	instruction	Ljava/lang/String;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Builder user(@NotNull String text) {
/* 35 */     Intrinsics.checkNotNullParameter(text, "text"); return message(new LLMChatUserMessage(text));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Builder system(@NotNull String text) {
/* 40 */     Intrinsics.checkNotNullParameter(text, "text"); return message(new LLMChatSystemMessage(text));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Builder assistant(@NotNull String text) {
/* 45 */     Intrinsics.checkNotNullParameter(text, "text"); return message(new LLMChatAssistantMessage(text, null, 2, null));
/*    */   }
/*    */   @NotNull
/*    */   public final Builder assistant(@NotNull String functionName, @NotNull String functionContent) {
/* 49 */     Intrinsics.checkNotNullParameter(functionName, "functionName"); Intrinsics.checkNotNullParameter(functionContent, "functionContent"); return message(new LLMChatAssistantMessage(null, new LLMChatAssistantMessage.FunctionCallResponse(functionName, functionContent)));
/*    */   } @NotNull
/*    */   public final Builder function(@NotNull String name, @NotNull String result) {
/* 52 */     Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(result, "result"); return message(new LLMChatFunctionMessage(name, result));
/*    */   } @NotNull
/*    */   public final Builder message(@NotNull LLMChatMessage message) {
/* 55 */     Intrinsics.checkNotNullParameter(message, "message"); this.messages.add(message);
/* 56 */     return this;
/*    */   }
/*    */   @NotNull
/*    */   public final Builder messages(@NotNull LLMChat chat) {
/* 60 */     Intrinsics.checkNotNullParameter(chat, "chat"); CollectionsKt.addAll(this.messages, (Object[])chat.getMessages());
/* 61 */     return this;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Builder messages(@NotNull List<? extends LLMChatMessage> chatMessages) {
/* 66 */     Intrinsics.checkNotNullParameter(chatMessages, "chatMessages"); this.messages.addAll(chatMessages);
/* 67 */     return this;
/*    */   }
/*    */   @NotNull
/*    */   public final LLMCachePoint getCachingPoint() {
/* 71 */     return new LLMCachePoint(this.messages.size());
/*    */   } @NotNull
/*    */   public final LLMChat build() {
/* 74 */     Collection<LLMChatMessage> $this$toTypedArray$iv = this.messages; int $i$f$toTypedArray = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 86 */     Collection<LLMChatMessage> thisCollection$iv = $this$toTypedArray$iv;
/*    */     
/* 88 */     return new LLMChat(thisCollection$iv.<LLMChatMessage>toArray(new LLMChatMessage[0]));
/*    */   }
/*    */   
/*    */   public Builder() {
/*    */     this(null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\v5\LLMChat$Builder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */