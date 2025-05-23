/*    */ package ai.grazie.model.llm.chat.multimodal;
/*    */ 
/*    */ import ai.grazie.model.llm.annotation.MultiModal;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @MultiModal
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\003\b\007\030\0002\0020\001B\021\022\n\b\002\020\002\032\004\030\0010\003¢\006\002\020\004J\020\020\b\032\0020\0002\006\020\t\032\0020\003H\007J\006\020\n\032\0020\013J'\020\f\032\0020\0002\006\020\r\032\0020\0162\027\020\017\032\023\022\004\022\0020\021\022\004\022\0020\0220\020¢\006\002\b\023J\030\020\f\032\0020\0002\006\020\r\032\0020\0162\006\020\t\032\0020\003H\002J\020\020\024\032\0020\0002\006\020\t\032\0020\003H\007J\037\020\025\032\0020\0002\027\020\017\032\023\022\004\022\0020\021\022\004\022\0020\0220\020¢\006\002\b\023J\020\020\025\032\0020\0002\006\020\t\032\0020\003H\007R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000¨\006\026"}, d2 = {"Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat$Builder;", "", "instruction", "", "(Ljava/lang/String;)V", "messages", "Ljava/util/ArrayList;", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage;", "assistant", "text", "build", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;", "message", "role", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatRole;", "content", "Lkotlin/Function1;", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat$ContentBuilder;", "", "Lkotlin/ExtensionFunctionType;", "system", "user", "model-llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMMultiModalChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMMultiModalChat.kt\nai/grazie/model/llm/chat/multimodal/LLMMultiModalChat$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
/*    */ public final class Builder {
/*    */   @NotNull
/*    */   private final ArrayList<LLMMultiModalChatMessage> messages;
/*    */   
/*    */   @NotNull
/* 21 */   public final Builder system(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); return message(LLMMultiModalChatRole.System, text); }
/*    */   public Builder(@Nullable String instruction) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokespecial <init> : ()V
/*    */     //   4: aload_0
/*    */     //   5: aload_1
/*    */     //   6: dup
/*    */     //   7: ifnull -> 59
/*    */     //   10: astore_2
/*    */     //   11: astore #5
/*    */     //   13: iconst_0
/*    */     //   14: istore_3
/*    */     //   15: iconst_1
/*    */     //   16: anewarray ai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage
/*    */     //   19: astore #4
/*    */     //   21: aload #4
/*    */     //   23: iconst_0
/*    */     //   24: new ai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage
/*    */     //   27: dup
/*    */     //   28: getstatic ai/grazie/model/llm/chat/multimodal/LLMMultiModalChatRole.Assistant : Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatRole;
/*    */     //   31: new ai/grazie/model/llm/chat/multimodal/TextElement
/*    */     //   34: dup
/*    */     //   35: aload_2
/*    */     //   36: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   39: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   42: invokespecial <init> : (Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatRole;Ljava/util/List;)V
/*    */     //   45: aastore
/*    */     //   46: aload #4
/*    */     //   48: invokestatic arrayListOf : ([Ljava/lang/Object;)Ljava/util/ArrayList;
/*    */     //   51: aload #5
/*    */     //   53: swap
/*    */     //   54: nop
/*    */     //   55: dup
/*    */     //   56: ifnonnull -> 67
/*    */     //   59: pop
/*    */     //   60: new java/util/ArrayList
/*    */     //   63: dup
/*    */     //   64: invokespecial <init> : ()V
/*    */     //   67: putfield messages : Ljava/util/ArrayList;
/*    */     //   70: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 0
/*    */     //   #18	-> 4
/*    */     //   #98	-> 11
/*    */     //   #18	-> 15
/*    */     //   #18	-> 54
/*    */     //   #18	-> 55
/*    */     //   #18	-> 67
/*    */     //   #16	-> 70
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   15	36	3	$i$a$-let-LLMMultiModalChat$Builder$messages$1	I
/*    */     //   13	38	2	it	Ljava/lang/String;
/*    */     //   0	71	0	this	Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat$Builder;
/*    */     //   0	71	1	instruction	Ljava/lang/String; } @NotNull
/*    */   public final Builder assistant(@NotNull String text) {
/* 24 */     Intrinsics.checkNotNullParameter(text, "text"); return message(LLMMultiModalChatRole.Assistant, text);
/*    */   }
/*    */   @NotNull
/* 27 */   public final Builder user(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); return message(LLMMultiModalChatRole.User, text); } @NotNull
/*    */   public final Builder user(@NotNull Function1<? super LLMMultiModalChat.ContentBuilder, Unit> content) {
/* 29 */     Intrinsics.checkNotNullParameter(content, "content"); return message(LLMMultiModalChatRole.User, content);
/*    */   }
/*    */   @NotNull
/*    */   public final Builder message(@NotNull LLMMultiModalChatRole role, @NotNull Function1 content) {
/* 33 */     Intrinsics.checkNotNullParameter(role, "role"); Intrinsics.checkNotNullParameter(content, "content"); LLMMultiModalChat.ContentBuilder contentBuilder = new LLMMultiModalChat.ContentBuilder(); content.invoke(contentBuilder); this.messages.add(new LLMMultiModalChatMessage(role, contentBuilder.build()));
/* 34 */     return this;
/*    */   }
/*    */   
/*    */   private final Builder message(LLMMultiModalChatRole role, String text) {
/* 38 */     this.messages.add(new LLMMultiModalChatMessage(role, CollectionsKt.listOf(new TextElement(text))));
/* 39 */     return this;
/*    */   } @NotNull
/*    */   public final LLMMultiModalChat build() {
/* 42 */     return new LLMMultiModalChat(this.messages);
/*    */   }
/*    */   
/*    */   public Builder() {
/*    */     this(null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\multimodal\LLMMultiModalChat$Builder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */