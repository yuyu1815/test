/*    */ package ai.grazie.model.llm.chat.v5;
/*    */ 
/*    */ import ai.grazie.model.llm.profile.LLMProfileID;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\017\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\002\b\003\b\b\030\000  2\0020\001:\002\037 B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\b\002\020\b\032\0020\t¢\006\002\020\nJ\t\020\023\032\0020\003HÆ\003J\t\020\024\032\0020\005HÆ\003J\t\020\025\032\0020\007HÆ\003J\t\020\026\032\0020\tHÆ\003J1\020\027\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHÆ\001J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\001HÖ\003J\t\020\033\032\0020\034HÖ\001J\t\020\035\032\0020\036HÖ\001R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\013\020\fR\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\r\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\021\020\022¨\006!"}, d2 = {"Lai/grazie/model/llm/chat/v5/LLMChatRequest;", "", "prompt", "Lai/grazie/model/llm/prompt/LLMPromptID;", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "chat", "Lai/grazie/model/llm/chat/v5/LLMChat;", "parameters", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/model/llm/chat/v5/LLMChat;Lai/grazie/utils/attributes/Attributes;)V", "getChat", "()Lai/grazie/model/llm/chat/v5/LLMChat;", "getParameters", "()Lai/grazie/utils/attributes/Attributes;", "getProfile", "()Lai/grazie/model/llm/profile/LLMProfileID;", "getPrompt", "()Lai/grazie/model/llm/prompt/LLMPromptID;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Builder", "Companion", "model-llm"})
/*    */ public final class LLMChatRequest {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final LLMPromptID prompt;
/*    */   @NotNull
/*    */   private final LLMProfileID profile;
/*    */   @NotNull
/*    */   private final LLMChat chat;
/*    */   @NotNull
/*    */   private final Attributes parameters;
/*    */   
/* 21 */   public LLMChatRequest(@NotNull LLMPromptID prompt, @NotNull LLMProfileID profile, @NotNull LLMChat chat, @NotNull Attributes parameters) { this.prompt = prompt;
/* 22 */     this.profile = profile;
/* 23 */     this.chat = chat;
/* 24 */     this.parameters = parameters; } @NotNull public final LLMPromptID getPrompt() { return this.prompt; } @NotNull public final LLMProfileID getProfile() { return this.profile; } @NotNull public final LLMChat getChat() { return this.chat; } @NotNull public final Attributes getParameters() { return this.parameters; }
/*    */   @NotNull public final LLMPromptID component1() { return this.prompt; } @NotNull public final LLMProfileID component2() { return this.profile; } @NotNull public final LLMChat component3() { return this.chat; } @NotNull public final Attributes component4() { return this.parameters; } @NotNull public final LLMChatRequest copy(@NotNull LLMPromptID prompt, @NotNull LLMProfileID profile, @NotNull LLMChat chat, @NotNull Attributes parameters) { Intrinsics.checkNotNullParameter(prompt, "prompt"); Intrinsics.checkNotNullParameter(profile, "profile"); Intrinsics.checkNotNullParameter(chat, "chat"); Intrinsics.checkNotNullParameter(parameters, "parameters"); return new LLMChatRequest(prompt, profile, chat, parameters); } @NotNull public String toString() { return "LLMChatRequest(prompt=" + this.prompt + ", profile=" + this.profile + ", chat=" + this.chat + ", parameters=" + this.parameters + ")"; } public int hashCode() { result = this.prompt.hashCode(); result = result * 31 + this.profile.hashCode(); result = result * 31 + this.chat.hashCode(); return result * 31 + this.parameters.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof LLMChatRequest)) return false;  LLMChatRequest lLMChatRequest = (LLMChatRequest)other; return !Intrinsics.areEqual(this.prompt, lLMChatRequest.prompt) ? false : (!Intrinsics.areEqual(this.profile, lLMChatRequest.profile) ? false : (!Intrinsics.areEqual(this.chat, lLMChatRequest.chat) ? false : (!!Intrinsics.areEqual(this.parameters, lLMChatRequest.parameters)))); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\037\020\003\032\0020\0042\027\020\005\032\023\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\t¨\006\n"}, d2 = {"Lai/grazie/model/llm/chat/v5/LLMChatRequest$Companion;", "", "()V", "build", "Lai/grazie/model/llm/chat/v5/LLMChatRequest;", "body", "Lkotlin/Function1;", "Lai/grazie/model/llm/chat/v5/LLMChatRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "model-llm"}) public static final class Companion
/*    */   {
/* 27 */     @NotNull public final LLMChatRequest build(@NotNull Function1 body) { Intrinsics.checkNotNullParameter(body, "body"); LLMChatRequest.Builder builder = new LLMChatRequest.Builder(); body.invoke(builder); return builder.build(); } private Companion() {} } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000`\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020 \n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\020\006\n\002\b\006\n\002\030\002\n\002\020\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\000\030\0002\0020\001B\005¢\006\002\020\002J\006\020)\032\0020*J\037\020\t\032\0020+2\027\020\t\032\023\022\004\022\0020-\022\004\022\0020+0,¢\006\002\b.J+\020\020\032\0020+2\n\b\002\020/\032\004\030\001002\027\020\020\032\023\022\004\022\00201\022\004\022\0020+0,¢\006\002\b.R\034\020\003\032\004\030\0010\004X\016¢\006\016\n\000\032\004\b\005\020\006\"\004\b\007\020\bR\"\020\t\032\n\022\004\022\0020\013\030\0010\nX\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017R\034\020\020\032\004\030\0010\021X\016¢\006\016\n\000\032\004\b\022\020\023\"\004\b\024\020\025R\034\020\026\032\004\030\0010\027X\016¢\006\016\n\000\032\004\b\030\020\031\"\004\b\032\020\033R\034\020\034\032\004\030\0010\035X\016¢\006\016\n\000\032\004\b\036\020\037\"\004\b \020!R\036\020\"\032\004\030\0010#X\016¢\006\020\n\002\020(\032\004\b$\020%\"\004\b&\020'¨\0062"}, d2 = {"Lai/grazie/model/llm/chat/v5/LLMChatRequest$Builder;", "", "()V", "functionCall", "Lai/grazie/model/llm/chat/function/LLMFunctionCall;", "getFunctionCall", "()Lai/grazie/model/llm/chat/function/LLMFunctionCall;", "setFunctionCall", "(Lai/grazie/model/llm/chat/function/LLMFunctionCall;)V", "functions", "", "Lai/grazie/model/llm/chat/function/LLMFunction;", "getFunctions", "()Ljava/util/List;", "setFunctions", "(Ljava/util/List;)V", "messages", "Lai/grazie/model/llm/chat/v5/LLMChat;", "getMessages", "()Lai/grazie/model/llm/chat/v5/LLMChat;", "setMessages", "(Lai/grazie/model/llm/chat/v5/LLMChat;)V", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "getProfile", "()Lai/grazie/model/llm/profile/LLMProfileID;", "setProfile", "(Lai/grazie/model/llm/profile/LLMProfileID;)V", "prompt", "Lai/grazie/model/llm/prompt/LLMPromptID;", "getPrompt", "()Lai/grazie/model/llm/prompt/LLMPromptID;", "setPrompt", "(Lai/grazie/model/llm/prompt/LLMPromptID;)V", "temperature", "", "getTemperature", "()Ljava/lang/Double;", "setTemperature", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "build", "Lai/grazie/model/llm/chat/v5/LLMChatRequest;", "", "Lkotlin/Function1;", "Lai/grazie/model/llm/chat/function/LLMFunctionsBuilder;", "Lkotlin/ExtensionFunctionType;", "instruction", "", "Lai/grazie/model/llm/chat/v5/LLMChat$Builder;", "model-llm"}) @SourceDebugExtension({"SMAP\nLLMChatRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMChatRequest.kt\nai/grazie/model/llm/chat/v5/LLMChatRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ControlFlow.kt\nai/grazie/utils/ControlFlowKt\n+ 4 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,83:1\n1#2:84\n12#3,4:85\n12#3,2:89\n15#3:92\n12#3,2:93\n15#3:96\n28#4:91\n28#4:95\n*S KotlinDebug\n*F\n+ 1 LLMChatRequest.kt\nai/grazie/model/llm/chat/v5/LLMChatRequest$Builder\n*L\n77#1:85,4\n78#1:89,2\n78#1:92\n79#1:93,2\n79#1:96\n78#1:91\n79#1:95\n*E\n"}) public static final class Builder { @Nullable
/*    */     private LLMPromptID prompt; @Nullable
/*    */     private LLMChat messages; @Nullable
/*    */     private LLMProfileID profile; @Nullable
/*    */     private Double temperature; @Nullable
/*    */     private List<LLMFunction> functions; @Nullable
/*    */     private LLMFunctionCall functionCall; @Nullable
/* 34 */     public final LLMPromptID getPrompt() { return this.prompt; } public final void setPrompt(@Nullable LLMPromptID <set-?>) { this.prompt = <set-?>; }
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public final LLMChat getMessages() {
/* 39 */       return this.messages; } public final void setMessages(@Nullable LLMChat <set-?>) { this.messages = <set-?>; }
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public final LLMProfileID getProfile() {
/* 44 */       return this.profile; } public final void setProfile(@Nullable LLMProfileID <set-?>) { this.profile = <set-?>; }
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public final Double getTemperature() {
/* 49 */       return this.temperature; } public final void setTemperature(@Nullable Double <set-?>) { this.temperature = <set-?>; }
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public final List<LLMFunction> getFunctions()
/*    */     {
/* 55 */       return this.functions; } public final void setFunctions(@Nullable List<LLMFunction> <set-?>) { this.functions = <set-?>; }
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public final LLMFunctionCall getFunctionCall()
/*    */     {
/* 61 */       return this.functionCall; } public final void setFunctionCall(@Nullable LLMFunctionCall <set-?>) { this.functionCall = <set-?>; }
/*    */     
/*    */     public final void messages(@Nullable String instruction, @NotNull Function1 messages) {
/* 64 */       Intrinsics.checkNotNullParameter(messages, "messages"); LLMChat.Builder builder = new LLMChat.Builder(instruction); messages.invoke(builder); this.messages = builder.build();
/*    */     }
/*    */     
/*    */     public final void functions(@NotNull Function1 functions) {
/* 68 */       Intrinsics.checkNotNullParameter(functions, "functions"); LLMFunctionsBuilder lLMFunctionsBuilder = new LLMFunctionsBuilder(); functions.invoke(lLMFunctionsBuilder); this.functions = lLMFunctionsBuilder.build();
/*    */     }
/*    */     @NotNull
/*    */     public final LLMChatRequest build() {
/*    */       LLMProfileID lLMProfileID;
/* 73 */       if (this.prompt == null)
/*    */       
/*    */       { 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 84 */         int $i$a$-requireNotNull-LLMChatRequest$Builder$build$1 = 0; String str = "prompt is required"; throw new IllegalArgumentException(str.toString()); }  if (this.profile == null) { LLMProfileID lLMProfileID1 = this.profile; int $i$a$-requireNotNull-LLMChatRequest$Builder$build$2 = 0; String str = "profile is required"; throw new IllegalArgumentException(str.toString()); }  if (this.messages == null) { LLMProfileID lLMProfileID1; LLMChat lLMChat = this.messages; int $i$a$-requireNotNull-LLMChatRequest$Builder$build$3 = 0; String str2 = "messages is required", str1 = str2; throw new IllegalArgumentException(str1.toString()); }
/* 85 */        Attributes attributes = new Attributes(); Object<LLMFunction> object = (Object<LLMFunction>)this.temperature; int $i$f$chainIfNotNull = 0; if (object != null) {
/* 86 */         LLMProfileID lLMProfileID1; double d = ((Number)object).doubleValue(); Attributes attributes1 = attributes; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-LLMChatRequest$Builder$build$4 = 0; Attributes attributes2 = attributes1.put((Attributes.Key)LLMParameters.INSTANCE.getTemperature(), (Attributes.Value)new Attributes.Value.Double(d, null, 2, null));
/*    */       } 
/* 88 */       Object $this$chainIfNotNull$iv = attributes; object = (Object<LLMFunction>)this.functions; $i$f$chainIfNotNull = 0;
/* 89 */       if (object != null) {
/* 90 */         LLMProfileID lLMProfileID1; Object<LLMFunction> object2 = object; Object object3 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-LLMChatRequest$Builder$build$5 = 0; JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/*    */       } 
/* 92 */       $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; Object value$iv = this.functionCall; $i$f$chainIfNotNull = 0;
/* 93 */       if (value$iv != null) {
/* 94 */         LLMProfileID lLMProfileID1; Object object2 = value$iv, object3 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-LLMChatRequest$Builder$build$6 = 0; JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/*    */       } 
/* 96 */       Object object1 = $this$chainIfNotNull$iv;
/*    */       LLMChat lLMChat1 = this.messages, lLMChat2 = lLMChat1;
/*    */       return new LLMChatRequest((LLMPromptID)lLMProfileID, (LLMProfileID)lLMChat2, lLMChat1, (Attributes)object1);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\v5\LLMChatRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */