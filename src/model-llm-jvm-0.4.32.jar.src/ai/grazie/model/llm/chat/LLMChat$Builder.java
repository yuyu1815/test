/*    */ package ai.grazie.model.llm.chat;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\030\0002\0020\001B\021\022\n\b\002\020\002\032\004\030\0010\003¢\006\002\020\004J\030\020\b\032\0020\0002\006\020\t\032\0020\n2\006\020\013\032\0020\003H\007J\016\020\f\032\0020\0002\006\020\013\032\0020\003J\006\020\r\032\0020\016J\026\020\017\032\0020\0002\006\020\t\032\0020\n2\006\020\013\032\0020\003J\016\020\020\032\0020\0002\006\020\013\032\0020\003J\016\020\021\032\0020\0002\006\020\013\032\0020\003R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000¨\006\022"}, d2 = {"Lai/grazie/model/llm/chat/LLMChat$Builder;", "", "instruction", "", "(Ljava/lang/String;)V", "messages", "Ljava/util/ArrayList;", "Lai/grazie/model/llm/chat/LLMChatMessage;", "add", "role", "Lai/grazie/model/llm/chat/LLMChatRole;", "text", "assistant", "build", "Lai/grazie/model/llm/chat/LLMChat;", "message", "system", "user", "model-llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMChat.kt\nai/grazie/model/llm/chat/LLMChat$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,54:1\n1#2:55\n37#3:56\n36#3,3:57\n*S KotlinDebug\n*F\n+ 1 LLMChat.kt\nai/grazie/model/llm/chat/LLMChat$Builder\n*L\n33#1:56\n33#1:57,3\n*E\n"})
/*    */ public final class Builder {
/*    */   @NotNull
/*    */   private final ArrayList<LLMChatMessage> messages;
/*    */   
/*    */   @Deprecated(message = "Use message(role, text) instead", replaceWith = @ReplaceWith(expression = "message(role, text)", imports = {}))
/*    */   @NotNull
/* 20 */   public final Builder add(@NotNull LLMChatRole role, @NotNull String text) { Intrinsics.checkNotNullParameter(role, "role"); Intrinsics.checkNotNullParameter(text, "text"); return message(role, text); }
/*    */   public Builder(@Nullable String instruction) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokespecial <init> : ()V
/*    */     //   4: aload_0
/*    */     //   5: aload_1
/*    */     //   6: dup
/*    */     //   7: ifnull -> 49
/*    */     //   10: astore_2
/*    */     //   11: astore #5
/*    */     //   13: iconst_0
/*    */     //   14: istore_3
/*    */     //   15: iconst_1
/*    */     //   16: anewarray ai/grazie/model/llm/chat/LLMChatMessage
/*    */     //   19: astore #4
/*    */     //   21: aload #4
/*    */     //   23: iconst_0
/*    */     //   24: new ai/grazie/model/llm/chat/LLMChatMessage
/*    */     //   27: dup
/*    */     //   28: getstatic ai/grazie/model/llm/chat/LLMChatRole.System : Lai/grazie/model/llm/chat/LLMChatRole;
/*    */     //   31: aload_2
/*    */     //   32: invokespecial <init> : (Lai/grazie/model/llm/chat/LLMChatRole;Ljava/lang/String;)V
/*    */     //   35: aastore
/*    */     //   36: aload #4
/*    */     //   38: invokestatic arrayListOf : ([Ljava/lang/Object;)Ljava/util/ArrayList;
/*    */     //   41: aload #5
/*    */     //   43: swap
/*    */     //   44: nop
/*    */     //   45: dup
/*    */     //   46: ifnonnull -> 57
/*    */     //   49: pop
/*    */     //   50: new java/util/ArrayList
/*    */     //   53: dup
/*    */     //   54: invokespecial <init> : ()V
/*    */     //   57: putfield messages : Ljava/util/ArrayList;
/*    */     //   60: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 0
/*    */     //   #17	-> 4
/*    */     //   #55	-> 11
/*    */     //   #17	-> 15
/*    */     //   #17	-> 44
/*    */     //   #17	-> 45
/*    */     //   #17	-> 57
/*    */     //   #16	-> 60
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   15	26	3	$i$a$-let-LLMChat$Builder$messages$1	I
/*    */     //   13	28	2	it	Ljava/lang/String;
/*    */     //   0	61	0	this	Lai/grazie/model/llm/chat/LLMChat$Builder;
/*    */     //   0	61	1	instruction	Ljava/lang/String; } @NotNull
/*    */   public final Builder message(@NotNull LLMChatRole role, @NotNull String text) {
/* 23 */     Intrinsics.checkNotNullParameter(role, "role"); Intrinsics.checkNotNullParameter(text, "text"); this.messages.add(new LLMChatMessage(role, text));
/* 24 */     return this;
/*    */   }
/*    */   @NotNull
/* 27 */   public final Builder user(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); return message(LLMChatRole.User, text); }
/*    */   @NotNull
/* 29 */   public final Builder system(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); return message(LLMChatRole.System, text); }
/*    */   @NotNull
/* 31 */   public final Builder assistant(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); return message(LLMChatRole.Assistant, text); } @NotNull
/*    */   public final LLMChat build() {
/* 33 */     Collection<LLMChatMessage> $this$toTypedArray$iv = this.messages; int $i$f$toTypedArray = 0;
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
/*    */     
/* 57 */     Collection<LLMChatMessage> thisCollection$iv = $this$toTypedArray$iv;
/*    */     
/* 59 */     return new LLMChat(thisCollection$iv.<LLMChatMessage>toArray(new LLMChatMessage[0]));
/*    */   }
/*    */   
/*    */   public Builder() {
/*    */     this(null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\LLMChat$Builder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */