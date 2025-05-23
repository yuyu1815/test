/*    */ package ai.grazie.model.llm.tokens;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000d\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\021\n\002\b\002\n\002\020\016\n\002\020 \n\002\b\006\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\004\b&\030\0002\0020\001:\00201B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\bJ\026\020\017\032\0020\0202\006\020\021\032\0020\022H@¢\006\002\020\023J\026\020\017\032\0020\0202\006\020\024\032\0020\025H@¢\006\002\020\026J\026\020\017\032\0020\0202\006\020\021\032\0020\027H@¢\006\002\020\030J\026\020\017\032\0020\0202\006\020\024\032\0020\031H¦@¢\006\002\020\032J\034\020\017\032\0020\0202\f\020\033\032\b\022\004\022\0020\0310\034H@¢\006\002\020\035J\020\020\017\032\0020\0202\b\020\036\032\004\030\0010\037J\034\020\017\032\0020\0202\f\020\033\032\b\022\004\022\0020\0250 H@¢\006\002\020!J\024\020\017\032\0020\0202\f\020\"\032\b\022\004\022\0020\0370 J(\020#\032\0020\0202\006\020$\032\0020\0372\006\020%\032\0020\0372\b\020&\032\004\030\0010'H¦@¢\006\002\020(J\036\020)\032\0020\0202\006\020\021\032\0020\0222\006\020&\032\0020'H@¢\006\002\020*J\036\020)\032\0020\0202\006\020\021\032\0020\0272\006\020&\032\0020'H¦@¢\006\002\020+J\026\020,\032\0020\0202\006\020-\032\0020.H¦@¢\006\002\020/R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\nR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\013\020\fR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\r\020\016¨\0062"}, d2 = {"Lai/grazie/model/llm/tokens/LLMTokenCounter;", "", "counter", "Lai/grazie/model/nlp/encoder/TokenCounter;", "adjuster", "Lai/grazie/model/llm/tokens/LLMTokenCounter$Adjuster;", "adjusterMultiModal", "Lai/grazie/model/llm/tokens/LLMTokenCounter$AdjusterMultiModal;", "(Lai/grazie/model/nlp/encoder/TokenCounter;Lai/grazie/model/llm/tokens/LLMTokenCounter$Adjuster;Lai/grazie/model/llm/tokens/LLMTokenCounter$AdjusterMultiModal;)V", "getAdjuster", "()Lai/grazie/model/llm/tokens/LLMTokenCounter$Adjuster;", "getAdjusterMultiModal", "()Lai/grazie/model/llm/tokens/LLMTokenCounter$AdjusterMultiModal;", "getCounter", "()Lai/grazie/model/nlp/encoder/TokenCounter;", "count", "", "chat", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;", "(Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "message", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage;", "(Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/model/llm/chat/v5/LLMChat;", "(Lai/grazie/model/llm/chat/v5/LLMChat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/model/llm/chat/v5/LLMChatMessage;", "(Lai/grazie/model/llm/chat/v5/LLMChatMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "messages", "", "([Lai/grazie/model/llm/chat/v5/LLMChatMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "text", "", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "texts", "countCompletionContextTokens", "prefix", "suffix", "parameters", "Lai/grazie/utils/attributes/Attributes;", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countContextTokens", "(Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lai/grazie/model/llm/chat/v5/LLMChat;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countGenerationTokens", "data", "Lai/grazie/model/llm/data/stream/LLMStreamData;", "(Lai/grazie/model/llm/data/stream/LLMStreamData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Adjuster", "AdjusterMultiModal", "model-llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMTokenCounter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMTokenCounter.kt\nai/grazie/model/llm/tokens/LLMTokenCounter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
/*    */ public abstract class LLMTokenCounter { @NotNull
/*    */   private final TokenCounter counter;
/*    */   @NotNull
/*    */   private final Adjuster adjuster;
/*    */   @NotNull
/*    */   private final AdjusterMultiModal adjusterMultiModal;
/*    */   
/* 11 */   public LLMTokenCounter(@NotNull TokenCounter counter, @NotNull Adjuster adjuster, @NotNull AdjusterMultiModal adjusterMultiModal) { this.counter = counter; this.adjuster = adjuster; this.adjusterMultiModal = adjusterMultiModal; } @NotNull protected final TokenCounter getCounter() { return this.counter; } @NotNull public final Adjuster getAdjuster() { return this.adjuster; } @NotNull public final AdjusterMultiModal getAdjusterMultiModal() { return this.adjusterMultiModal; } @Nullable
/*    */   public abstract Object countContextTokens(@NotNull LLMChat paramLLMChat, @NotNull Attributes paramAttributes, @NotNull Continuation<? super Integer> paramContinuation); @Nullable
/*    */   public Object countContextTokens(@NotNull LLMMultiModalChat chat, @NotNull Attributes parameters, @NotNull Continuation<? super Integer> $completion) { return countContextTokens$suspendImpl(this, chat, parameters, $completion); }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\002\b\b\n\002\020\013\n\002\b\003\n\002\020\016\n\002\b\002\b\b\030\000 \0252\0020\001:\001\025B-\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003\022\022\020\006\032\016\022\004\022\0020\007\022\004\022\0020\0050\003¢\006\002\020\bJ\025\020\f\032\016\022\004\022\0020\004\022\004\022\0020\0050\003HÆ\003J\025\020\r\032\016\022\004\022\0020\007\022\004\022\0020\0050\003HÆ\003J5\020\016\032\0020\0002\024\b\002\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\0032\024\b\002\020\006\032\016\022\004\022\0020\007\022\004\022\0020\0050\003HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\005HÖ\001J\t\020\023\032\0020\024HÖ\001R\035\020\006\032\016\022\004\022\0020\007\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\t\020\nR\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\013\020\n¨\006\026"}, d2 = {"Lai/grazie/model/llm/tokens/LLMTokenCounter$Adjuster;", "", "message", "Lkotlin/Function1;", "Lai/grazie/model/llm/chat/v5/LLMChatMessage;", "", "chat", "Lai/grazie/model/llm/chat/v5/LLMChat;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getChat", "()Lkotlin/jvm/functions/Function1;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "model-llm"})
/* 15 */   public static final class Adjuster { public Adjuster(@NotNull Function1<LLMChatMessage, Integer> message, @NotNull Function1<LLMChat, Integer> chat) { this.message = message; this.chat = chat; } @NotNull public final Function1<LLMChatMessage, Integer> getMessage() { return this.message; } @NotNull public final Function1<LLMChat, Integer> getChat() { return this.chat; } @NotNull public final Function1<LLMChatMessage, Integer> component1() { return this.message; } @NotNull public final Function1<LLMChat, Integer> component2() { return this.chat; } @NotNull public final Adjuster copy(@NotNull Function1<? super LLMChatMessage, Integer> message, @NotNull Function1<? super LLMChat, Integer> chat) { Intrinsics.checkNotNullParameter(message, "message"); Intrinsics.checkNotNullParameter(chat, "chat"); return new Adjuster(message, chat); } @NotNull public String toString() { return "Adjuster(message=" + this.message + ", chat=" + this.chat + ")"; } public int hashCode() { result = this.message.hashCode(); return result * 31 + this.chat.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Adjuster)) return false;  Adjuster adjuster = (Adjuster)other; return !Intrinsics.areEqual(this.message, adjuster.message) ? false : (!!Intrinsics.areEqual(this.chat, adjuster.chat)); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/llm/tokens/LLMTokenCounter$Adjuster$Companion;", "", "()V", "None", "Lai/grazie/model/llm/tokens/LLMTokenCounter$Adjuster;", "getNone", "()Lai/grazie/model/llm/tokens/LLMTokenCounter$Adjuster;", "model-llm"}) public static final class Companion
/*    */     {
/* 17 */       @NotNull public final LLMTokenCounter.Adjuster getNone() { return LLMTokenCounter.Adjuster.None; } private Companion() {} } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final Function1<LLMChatMessage, Integer> message; @NotNull private final Function1<LLMChat, Integer> chat; @NotNull private static final Adjuster None = new Adjuster(LLMTokenCounter$Adjuster$Companion$None$1.INSTANCE, LLMTokenCounter$Adjuster$Companion$None$2.INSTANCE); @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Lai/grazie/model/llm/chat/v5/LLMChat;", "invoke", "(Lai/grazie/model/llm/chat/v5/LLMChat;)Ljava/lang/Integer;"}) static final class LLMTokenCounter$Adjuster$Companion$None$2 extends Lambda implements Function1<LLMChat, Integer> { public static final LLMTokenCounter$Adjuster$Companion$None$2 INSTANCE = new LLMTokenCounter$Adjuster$Companion$None$2(); LLMTokenCounter$Adjuster$Companion$None$2() { super(1); } public final Integer invoke(LLMChat it) { Intrinsics.checkNotNullParameter(it, "it"); return Integer.valueOf(0); } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Lai/grazie/model/llm/chat/v5/LLMChatMessage;", "invoke", "(Lai/grazie/model/llm/chat/v5/LLMChatMessage;)Ljava/lang/Integer;"}) static final class LLMTokenCounter$Adjuster$Companion$None$1 extends Lambda implements Function1<LLMChatMessage, Integer> { public static final LLMTokenCounter$Adjuster$Companion$None$1 INSTANCE = new LLMTokenCounter$Adjuster$Companion$None$1(); LLMTokenCounter$Adjuster$Companion$None$1() { super(1); } public final Integer invoke(LLMChatMessage it) { Intrinsics.checkNotNullParameter(it, "it"); return Integer.valueOf(0); }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\002\b\b\n\002\020\013\n\002\b\003\n\002\020\016\n\002\b\002\b\b\030\000 \0252\0020\001:\001\025B-\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003\022\022\020\006\032\016\022\004\022\0020\007\022\004\022\0020\0050\003¢\006\002\020\bJ\025\020\f\032\016\022\004\022\0020\004\022\004\022\0020\0050\003HÆ\003J\025\020\r\032\016\022\004\022\0020\007\022\004\022\0020\0050\003HÆ\003J5\020\016\032\0020\0002\024\b\002\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\0032\024\b\002\020\006\032\016\022\004\022\0020\007\022\004\022\0020\0050\003HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\005HÖ\001J\t\020\023\032\0020\024HÖ\001R\035\020\006\032\016\022\004\022\0020\007\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\t\020\nR\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\013\020\n¨\006\026"}, d2 = {"Lai/grazie/model/llm/tokens/LLMTokenCounter$AdjusterMultiModal;", "", "message", "Lkotlin/Function1;", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage;", "", "chat", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getChat", "()Lkotlin/jvm/functions/Function1;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "model-llm"})
/*    */   public static final class AdjusterMultiModal {
/* 24 */     public AdjusterMultiModal(@NotNull Function1<LLMMultiModalChatMessage, Integer> message, @NotNull Function1<LLMMultiModalChat, Integer> chat) { this.message = message; this.chat = chat; } @NotNull public final Function1<LLMMultiModalChatMessage, Integer> getMessage() { return this.message; } @NotNull public final Function1<LLMMultiModalChat, Integer> getChat() { return this.chat; } @NotNull public final Function1<LLMMultiModalChatMessage, Integer> component1() { return this.message; } @NotNull public final Function1<LLMMultiModalChat, Integer> component2() { return this.chat; } @NotNull public final AdjusterMultiModal copy(@NotNull Function1<? super LLMMultiModalChatMessage, Integer> message, @NotNull Function1<? super LLMMultiModalChat, Integer> chat) { Intrinsics.checkNotNullParameter(message, "message"); Intrinsics.checkNotNullParameter(chat, "chat"); return new AdjusterMultiModal(message, chat); } @NotNull public String toString() { return "AdjusterMultiModal(message=" + this.message + ", chat=" + this.chat + ")"; } public int hashCode() { result = this.message.hashCode(); return result * 31 + this.chat.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof AdjusterMultiModal)) return false;  AdjusterMultiModal adjusterMultiModal = (AdjusterMultiModal)other; return !Intrinsics.areEqual(this.message, adjusterMultiModal.message) ? false : (!!Intrinsics.areEqual(this.chat, adjusterMultiModal.chat)); }
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/llm/tokens/LLMTokenCounter$AdjusterMultiModal$Companion;", "", "()V", "None", "Lai/grazie/model/llm/tokens/LLMTokenCounter$AdjusterMultiModal;", "getNone", "()Lai/grazie/model/llm/tokens/LLMTokenCounter$AdjusterMultiModal;", "model-llm"}) public static final class Companion { private Companion() {}
/* 26 */       @NotNull public final LLMTokenCounter.AdjusterMultiModal getNone() { return LLMTokenCounter.AdjusterMultiModal.None; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final Function1<LLMMultiModalChatMessage, Integer> message; @NotNull private final Function1<LLMMultiModalChat, Integer> chat; @NotNull private static final AdjusterMultiModal None = new AdjusterMultiModal(LLMTokenCounter$AdjusterMultiModal$Companion$None$1.INSTANCE, LLMTokenCounter$AdjusterMultiModal$Companion$None$2.INSTANCE); @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;", "invoke", "(Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;)Ljava/lang/Integer;"}) static final class LLMTokenCounter$AdjusterMultiModal$Companion$None$2 extends Lambda implements Function1<LLMMultiModalChat, Integer> { public static final LLMTokenCounter$AdjusterMultiModal$Companion$None$2 INSTANCE = new LLMTokenCounter$AdjusterMultiModal$Companion$None$2(); LLMTokenCounter$AdjusterMultiModal$Companion$None$2() { super(1); } public final Integer invoke(LLMMultiModalChat it) { Intrinsics.checkNotNullParameter(it, "it"); return Integer.valueOf(0); } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage;", "invoke", "(Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage;)Ljava/lang/Integer;"}) static final class LLMTokenCounter$AdjusterMultiModal$Companion$None$1 extends Lambda implements Function1<LLMMultiModalChatMessage, Integer> { public static final LLMTokenCounter$AdjusterMultiModal$Companion$None$1 INSTANCE = new LLMTokenCounter$AdjusterMultiModal$Companion$None$1(); LLMTokenCounter$AdjusterMultiModal$Companion$None$1() { super(1); } public final Integer invoke(LLMMultiModalChatMessage it) { Intrinsics.checkNotNullParameter(it, "it"); return Integer.valueOf(0); } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/llm/tokens/LLMTokenCounter$AdjusterMultiModal$Companion;", "", "()V", "None", "Lai/grazie/model/llm/tokens/LLMTokenCounter$AdjusterMultiModal;", "getNone", "()Lai/grazie/model/llm/tokens/LLMTokenCounter$AdjusterMultiModal;", "model-llm"}) public static final class Companion { private Companion() {} @NotNull public final LLMTokenCounter.AdjusterMultiModal getNone() { return LLMTokenCounter.AdjusterMultiModal.None; }
/*    */      }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public abstract Object countGenerationTokens(@NotNull LLMStreamData paramLLMStreamData, @NotNull Continuation<? super Integer> paramContinuation);
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public abstract Object countCompletionContextTokens(@NotNull String paramString1, @NotNull String paramString2, @Nullable Attributes paramAttributes, @NotNull Continuation<? super Integer> paramContinuation);
/*    */   
/*    */   public final int count(@Nullable String text)
/*    */   {
/* 40 */     String it = text;
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
/* 53 */     int $i$a$-let-LLMTokenCounter$count$1 = 0; return (text != null) ? this.counter.count(it) : 0; } public final int count(@NotNull List texts) { Intrinsics.checkNotNullParameter(texts, "texts"); List list = texts; int i = 0; for (String str1 : list) { String str2 = str1; int j = i, $i$a$-sumOfInt-LLMTokenCounter$count$2 = 0;
/*    */       int k = this.counter.count(str2);
/*    */       i = j + k; }
/*    */     
/*    */     return i; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public abstract Object count(@NotNull LLMChatMessage paramLLMChatMessage, @NotNull Continuation<? super Integer> paramContinuation);
/*    */   
/*    */   @Nullable
/*    */   public Object count(@NotNull LLMMultiModalChatMessage message, @NotNull Continuation<? super Integer> $completion) {
/*    */     return count$suspendImpl(this, message, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   protected final Object count(@NotNull LLMChat chat, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/model/llm/tokens/LLMTokenCounter$count$4
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter$count$4
/*    */     //   11: astore #4
/*    */     //   13: aload #4
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #4
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/model/llm/tokens/LLMTokenCounter$count$4
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/model/llm/tokens/LLMTokenCounter;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #4
/*    */     //   50: aload #4
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore_3
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #5
/*    */     //   61: aload #4
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 182, 0 -> 88, 1 -> 129
/*    */     //   88: aload_3
/*    */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   92: aload_0
/*    */     //   93: aload_1
/*    */     //   94: invokevirtual getMessages : ()[Lai/grazie/model/llm/chat/v5/LLMChatMessage;
/*    */     //   97: aload #4
/*    */     //   99: aload #4
/*    */     //   101: aload_0
/*    */     //   102: putfield L$0 : Ljava/lang/Object;
/*    */     //   105: aload #4
/*    */     //   107: aload_1
/*    */     //   108: putfield L$1 : Ljava/lang/Object;
/*    */     //   111: aload #4
/*    */     //   113: iconst_1
/*    */     //   114: putfield label : I
/*    */     //   117: invokevirtual count : ([Lai/grazie/model/llm/chat/v5/LLMChatMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   120: dup
/*    */     //   121: aload #5
/*    */     //   123: if_acmpne -> 152
/*    */     //   126: aload #5
/*    */     //   128: areturn
/*    */     //   129: aload #4
/*    */     //   131: getfield L$1 : Ljava/lang/Object;
/*    */     //   134: checkcast ai/grazie/model/llm/chat/v5/LLMChat
/*    */     //   137: astore_1
/*    */     //   138: aload #4
/*    */     //   140: getfield L$0 : Ljava/lang/Object;
/*    */     //   143: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter
/*    */     //   146: astore_0
/*    */     //   147: aload_3
/*    */     //   148: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   151: aload_3
/*    */     //   152: checkcast java/lang/Number
/*    */     //   155: invokevirtual intValue : ()I
/*    */     //   158: aload_0
/*    */     //   159: getfield adjuster : Lai/grazie/model/llm/tokens/LLMTokenCounter$Adjuster;
/*    */     //   162: invokevirtual getChat : ()Lkotlin/jvm/functions/Function1;
/*    */     //   165: aload_1
/*    */     //   166: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   171: checkcast java/lang/Number
/*    */     //   174: invokevirtual intValue : ()I
/*    */     //   177: iadd
/*    */     //   178: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */     //   181: areturn
/*    */     //   182: new java/lang/IllegalStateException
/*    */     //   185: dup
/*    */     //   186: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   188: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   191: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #47	-> 59
/*    */     //   #47	-> 92
/*    */     //   #47	-> 126
/*    */     //   #47	-> 152
/*    */     //   #47	-> 182
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   92	37	0	this	Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   147	35	0	this	Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   92	37	1	chat	Lai/grazie/model/llm/chat/v5/LLMChat;
/*    */     //   138	44	1	chat	Lai/grazie/model/llm/chat/v5/LLMChat;
/*    */     //   0	192	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	132	4	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	126	3	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   protected final Object count(@NotNull LLMMultiModalChat chat, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/model/llm/tokens/LLMTokenCounter$count$5
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter$count$5
/*    */     //   11: astore #4
/*    */     //   13: aload #4
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #4
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/model/llm/tokens/LLMTokenCounter$count$5
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/model/llm/tokens/LLMTokenCounter;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #4
/*    */     //   50: aload #4
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore_3
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #5
/*    */     //   61: aload #4
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 182, 0 -> 88, 1 -> 129
/*    */     //   88: aload_3
/*    */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   92: aload_0
/*    */     //   93: aload_1
/*    */     //   94: invokevirtual getMessages : ()Ljava/util/List;
/*    */     //   97: aload #4
/*    */     //   99: aload #4
/*    */     //   101: aload_0
/*    */     //   102: putfield L$0 : Ljava/lang/Object;
/*    */     //   105: aload #4
/*    */     //   107: aload_1
/*    */     //   108: putfield L$1 : Ljava/lang/Object;
/*    */     //   111: aload #4
/*    */     //   113: iconst_1
/*    */     //   114: putfield label : I
/*    */     //   117: invokevirtual count : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   120: dup
/*    */     //   121: aload #5
/*    */     //   123: if_acmpne -> 152
/*    */     //   126: aload #5
/*    */     //   128: areturn
/*    */     //   129: aload #4
/*    */     //   131: getfield L$1 : Ljava/lang/Object;
/*    */     //   134: checkcast ai/grazie/model/llm/chat/multimodal/LLMMultiModalChat
/*    */     //   137: astore_1
/*    */     //   138: aload #4
/*    */     //   140: getfield L$0 : Ljava/lang/Object;
/*    */     //   143: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter
/*    */     //   146: astore_0
/*    */     //   147: aload_3
/*    */     //   148: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   151: aload_3
/*    */     //   152: checkcast java/lang/Number
/*    */     //   155: invokevirtual intValue : ()I
/*    */     //   158: aload_0
/*    */     //   159: getfield adjusterMultiModal : Lai/grazie/model/llm/tokens/LLMTokenCounter$AdjusterMultiModal;
/*    */     //   162: invokevirtual getChat : ()Lkotlin/jvm/functions/Function1;
/*    */     //   165: aload_1
/*    */     //   166: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   171: checkcast java/lang/Number
/*    */     //   174: invokevirtual intValue : ()I
/*    */     //   177: iadd
/*    */     //   178: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */     //   181: areturn
/*    */     //   182: new java/lang/IllegalStateException
/*    */     //   185: dup
/*    */     //   186: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   188: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   191: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #48	-> 59
/*    */     //   #48	-> 92
/*    */     //   #48	-> 126
/*    */     //   #48	-> 152
/*    */     //   #48	-> 182
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   92	37	0	this	Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   147	35	0	this	Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   92	37	1	chat	Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;
/*    */     //   138	44	1	chat	Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;
/*    */     //   0	192	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	132	4	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	126	3	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   protected final Object count(@NotNull LLMChatMessage[] messages, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/model/llm/tokens/LLMTokenCounter$count$6
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter$count$6
/*    */     //   11: astore #13
/*    */     //   13: aload #13
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #13
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/model/llm/tokens/LLMTokenCounter$count$6
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/model/llm/tokens/LLMTokenCounter;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #13
/*    */     //   50: aload #13
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #12
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #14
/*    */     //   62: aload #13
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 299, 0 -> 88, 1 -> 192
/*    */     //   88: aload #12
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_1
/*    */     //   94: astore_3
/*    */     //   95: iconst_0
/*    */     //   96: istore #4
/*    */     //   98: iconst_0
/*    */     //   99: istore #5
/*    */     //   101: aload_3
/*    */     //   102: arraylength
/*    */     //   103: istore #6
/*    */     //   105: iload #5
/*    */     //   107: iload #6
/*    */     //   109: if_icmpge -> 293
/*    */     //   112: aload_3
/*    */     //   113: iload #5
/*    */     //   115: aaload
/*    */     //   116: astore #7
/*    */     //   118: iload #4
/*    */     //   120: aload #7
/*    */     //   122: astore #8
/*    */     //   124: istore #10
/*    */     //   126: iconst_0
/*    */     //   127: istore #9
/*    */     //   129: aload_0
/*    */     //   130: aload #8
/*    */     //   132: aload #13
/*    */     //   134: aload #13
/*    */     //   136: aload_0
/*    */     //   137: putfield L$0 : Ljava/lang/Object;
/*    */     //   140: aload #13
/*    */     //   142: aload_3
/*    */     //   143: putfield L$1 : Ljava/lang/Object;
/*    */     //   146: aload #13
/*    */     //   148: aload #8
/*    */     //   150: putfield L$2 : Ljava/lang/Object;
/*    */     //   153: aload #13
/*    */     //   155: iload #5
/*    */     //   157: putfield I$0 : I
/*    */     //   160: aload #13
/*    */     //   162: iload #6
/*    */     //   164: putfield I$1 : I
/*    */     //   167: aload #13
/*    */     //   169: iload #10
/*    */     //   171: putfield I$2 : I
/*    */     //   174: aload #13
/*    */     //   176: iconst_1
/*    */     //   177: putfield label : I
/*    */     //   180: invokevirtual count : (Lai/grazie/model/llm/chat/v5/LLMChatMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   183: dup
/*    */     //   184: aload #14
/*    */     //   186: if_acmpne -> 251
/*    */     //   189: aload #14
/*    */     //   191: areturn
/*    */     //   192: iconst_0
/*    */     //   193: istore #9
/*    */     //   195: aload #13
/*    */     //   197: getfield I$2 : I
/*    */     //   200: istore #10
/*    */     //   202: aload #13
/*    */     //   204: getfield I$1 : I
/*    */     //   207: istore #6
/*    */     //   209: aload #13
/*    */     //   211: getfield I$0 : I
/*    */     //   214: istore #5
/*    */     //   216: aload #13
/*    */     //   218: getfield L$2 : Ljava/lang/Object;
/*    */     //   221: checkcast ai/grazie/model/llm/chat/v5/LLMChatMessage
/*    */     //   224: astore #8
/*    */     //   226: aload #13
/*    */     //   228: getfield L$1 : Ljava/lang/Object;
/*    */     //   231: checkcast [Lai/grazie/model/llm/chat/v5/LLMChatMessage;
/*    */     //   234: astore_3
/*    */     //   235: aload #13
/*    */     //   237: getfield L$0 : Ljava/lang/Object;
/*    */     //   240: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter
/*    */     //   243: astore_0
/*    */     //   244: aload #12
/*    */     //   246: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   249: aload #12
/*    */     //   251: checkcast java/lang/Number
/*    */     //   254: invokevirtual intValue : ()I
/*    */     //   257: aload_0
/*    */     //   258: getfield adjuster : Lai/grazie/model/llm/tokens/LLMTokenCounter$Adjuster;
/*    */     //   261: invokevirtual getMessage : ()Lkotlin/jvm/functions/Function1;
/*    */     //   264: aload #8
/*    */     //   266: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   271: checkcast java/lang/Number
/*    */     //   274: invokevirtual intValue : ()I
/*    */     //   277: iadd
/*    */     //   278: istore #11
/*    */     //   280: iload #10
/*    */     //   282: iload #11
/*    */     //   284: iadd
/*    */     //   285: istore #4
/*    */     //   287: iinc #5, 1
/*    */     //   290: goto -> 105
/*    */     //   293: iload #4
/*    */     //   295: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */     //   298: areturn
/*    */     //   299: new java/lang/IllegalStateException
/*    */     //   302: dup
/*    */     //   303: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   305: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   308: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #49	-> 60
/*    */     //   #49	-> 93
/*    */     //   #53	-> 124
/*    */     //   #49	-> 129
/*    */     //   #49	-> 189
/*    */     //   #49	-> 251
/*    */     //   #49	-> 284
/*    */     //   #49	-> 298
/*    */     //   #49	-> 299
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	99	0	this	Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   244	55	0	this	Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   93	2	1	messages	[Lai/grazie/model/llm/chat/v5/LLMChatMessage;
/*    */     //   124	68	8	it	Lai/grazie/model/llm/chat/v5/LLMChatMessage;
/*    */     //   226	52	8	it	Lai/grazie/model/llm/chat/v5/LLMChatMessage;
/*    */     //   129	63	9	$i$a$-sumOfInt-LLMTokenCounter$count$7	I
/*    */     //   0	309	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	249	13	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	242	12	$result	Ljava/lang/Object;
/*    */     //   195	83	9	$i$a$-sumOfInt-LLMTokenCounter$count$7	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   protected final Object count(@NotNull List messages, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/model/llm/tokens/LLMTokenCounter$count$8
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter$count$8
/*    */     //   11: astore #12
/*    */     //   13: aload #12
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #12
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/model/llm/tokens/LLMTokenCounter$count$8
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/model/llm/tokens/LLMTokenCounter;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #12
/*    */     //   50: aload #12
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #11
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #13
/*    */     //   62: aload #12
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 283, 0 -> 88, 1 -> 192
/*    */     //   88: aload #11
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_1
/*    */     //   94: checkcast java/lang/Iterable
/*    */     //   97: astore_3
/*    */     //   98: iconst_0
/*    */     //   99: istore #4
/*    */     //   101: aload_3
/*    */     //   102: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   107: astore #5
/*    */     //   109: aload #5
/*    */     //   111: invokeinterface hasNext : ()Z
/*    */     //   116: ifeq -> 277
/*    */     //   119: aload #5
/*    */     //   121: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   126: astore #6
/*    */     //   128: iload #4
/*    */     //   130: aload #6
/*    */     //   132: checkcast ai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage
/*    */     //   135: astore #7
/*    */     //   137: istore #9
/*    */     //   139: iconst_0
/*    */     //   140: istore #8
/*    */     //   142: aload_0
/*    */     //   143: aload #7
/*    */     //   145: aload #12
/*    */     //   147: aload #12
/*    */     //   149: aload_0
/*    */     //   150: putfield L$0 : Ljava/lang/Object;
/*    */     //   153: aload #12
/*    */     //   155: aload #5
/*    */     //   157: putfield L$1 : Ljava/lang/Object;
/*    */     //   160: aload #12
/*    */     //   162: aload #7
/*    */     //   164: putfield L$2 : Ljava/lang/Object;
/*    */     //   167: aload #12
/*    */     //   169: iload #9
/*    */     //   171: putfield I$0 : I
/*    */     //   174: aload #12
/*    */     //   176: iconst_1
/*    */     //   177: putfield label : I
/*    */     //   180: invokevirtual count : (Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   183: dup
/*    */     //   184: aload #13
/*    */     //   186: if_acmpne -> 238
/*    */     //   189: aload #13
/*    */     //   191: areturn
/*    */     //   192: iconst_0
/*    */     //   193: istore #8
/*    */     //   195: aload #12
/*    */     //   197: getfield I$0 : I
/*    */     //   200: istore #9
/*    */     //   202: aload #12
/*    */     //   204: getfield L$2 : Ljava/lang/Object;
/*    */     //   207: checkcast ai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage
/*    */     //   210: astore #7
/*    */     //   212: aload #12
/*    */     //   214: getfield L$1 : Ljava/lang/Object;
/*    */     //   217: checkcast java/util/Iterator
/*    */     //   220: astore #5
/*    */     //   222: aload #12
/*    */     //   224: getfield L$0 : Ljava/lang/Object;
/*    */     //   227: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter
/*    */     //   230: astore_0
/*    */     //   231: aload #11
/*    */     //   233: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   236: aload #11
/*    */     //   238: checkcast java/lang/Number
/*    */     //   241: invokevirtual intValue : ()I
/*    */     //   244: aload_0
/*    */     //   245: getfield adjusterMultiModal : Lai/grazie/model/llm/tokens/LLMTokenCounter$AdjusterMultiModal;
/*    */     //   248: invokevirtual getMessage : ()Lkotlin/jvm/functions/Function1;
/*    */     //   251: aload #7
/*    */     //   253: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   258: checkcast java/lang/Number
/*    */     //   261: invokevirtual intValue : ()I
/*    */     //   264: iadd
/*    */     //   265: istore #10
/*    */     //   267: iload #9
/*    */     //   269: iload #10
/*    */     //   271: iadd
/*    */     //   272: istore #4
/*    */     //   274: goto -> 109
/*    */     //   277: iload #4
/*    */     //   279: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */     //   282: areturn
/*    */     //   283: new java/lang/IllegalStateException
/*    */     //   286: dup
/*    */     //   287: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   289: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   292: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #50	-> 60
/*    */     //   #50	-> 93
/*    */     //   #53	-> 137
/*    */     //   #50	-> 142
/*    */     //   #50	-> 189
/*    */     //   #50	-> 238
/*    */     //   #50	-> 271
/*    */     //   #50	-> 282
/*    */     //   #50	-> 283
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	99	0	this	Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   231	52	0	this	Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   93	5	1	messages	Ljava/util/List;
/*    */     //   137	55	7	it	Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage;
/*    */     //   212	53	7	it	Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage;
/*    */     //   142	50	8	$i$a$-sumOfInt-LLMTokenCounter$count$9	I
/*    */     //   0	293	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	233	12	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	226	11	$result	Ljava/lang/Object;
/*    */     //   195	70	8	$i$a$-sumOfInt-LLMTokenCounter$count$9	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LLMTokenCounter.kt", l = {47}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "chat"}, m = "count", c = "ai.grazie.model.llm.tokens.LLMTokenCounter")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LLMTokenCounter$count$4 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     LLMTokenCounter$count$4(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LLMTokenCounter.this.count((LLMChat)null, (Continuation<? super Integer>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LLMTokenCounter.kt", l = {48}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "chat"}, m = "count", c = "ai.grazie.model.llm.tokens.LLMTokenCounter")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LLMTokenCounter$count$5 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     LLMTokenCounter$count$5(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LLMTokenCounter.this.count((LLMMultiModalChat)null, (Continuation<? super Integer>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LLMTokenCounter.kt", l = {49}, i = {0, 0}, s = {"L$0", "L$2"}, n = {"this", "it"}, m = "count", c = "ai.grazie.model.llm.tokens.LLMTokenCounter")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LLMTokenCounter$count$6 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int I$0;
/*    */     int I$1;
/*    */     int I$2;
/*    */     int label;
/*    */     
/*    */     LLMTokenCounter$count$6(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LLMTokenCounter.this.count((LLMChatMessage[])null, (Continuation<? super Integer>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LLMTokenCounter.kt", l = {50}, i = {0, 0}, s = {"L$0", "L$2"}, n = {"this", "it"}, m = "count", c = "ai.grazie.model.llm.tokens.LLMTokenCounter")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LLMTokenCounter$count$8 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int I$0;
/*    */     int label;
/*    */     
/*    */     LLMTokenCounter$count$8(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LLMTokenCounter.this.count((List<LLMMultiModalChatMessage>)null, (Continuation<? super Integer>)this);
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\tokens\LLMTokenCounter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */