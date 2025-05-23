/*    */ package ai.grazie.api.gateway.client.api.llm;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.multimodal.LLMMultiModalChat;
/*    */ import ai.grazie.model.llm.profile.LLMProfileID;
/*    */ import ai.grazie.model.llm.prompt.LLMPromptID;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\020\006\n\002\b\006\n\002\030\002\n\002\020\002\n\000\n\002\020\016\n\002\030\002\n\002\030\002\n\002\030\002\n\000\030\0002\0020\001B\005¢\006\002\020\002J\006\020\034\032\0020\035J+\020\003\032\0020\0362\n\b\002\020\037\032\004\030\0010 2\027\020\003\032\023\022\004\022\0020\"\022\004\022\0020\0360!¢\006\002\b#R\034\020\003\032\004\030\0010\004X\016¢\006\016\n\000\032\004\b\005\020\006\"\004\b\007\020\bR\034\020\t\032\004\030\0010\nX\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016R\034\020\017\032\004\030\0010\020X\016¢\006\016\n\000\032\004\b\021\020\022\"\004\b\023\020\024R\036\020\025\032\004\030\0010\026X\016¢\006\020\n\002\020\033\032\004\b\027\020\030\"\004\b\031\020\032¨\006$"}, d2 = {"Lai/grazie/api/gateway/client/api/llm/MultiModalChatRequestBuilder;", "", "()V", "messages", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;", "getMessages", "()Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;", "setMessages", "(Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;)V", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "getProfile", "()Lai/grazie/model/llm/profile/LLMProfileID;", "setProfile", "(Lai/grazie/model/llm/profile/LLMProfileID;)V", "prompt", "Lai/grazie/model/llm/prompt/LLMPromptID;", "getPrompt", "()Lai/grazie/model/llm/prompt/LLMPromptID;", "setPrompt", "(Lai/grazie/model/llm/prompt/LLMPromptID;)V", "temperature", "", "getTemperature", "()Ljava/lang/Double;", "setTemperature", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "build", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$Request;", "", "instruction", "", "Lkotlin/Function1;", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat$Builder;", "Lkotlin/ExtensionFunctionType;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nMultiModalChatRequestBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiModalChatRequestBuilder.kt\nai/grazie/api/gateway/client/api/llm/MultiModalChatRequestBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ControlFlow.kt\nai/grazie/utils/ControlFlowKt\n*L\n1#1,51:1\n1#2:52\n12#3,4:53\n*S KotlinDebug\n*F\n+ 1 MultiModalChatRequestBuilder.kt\nai/grazie/api/gateway/client/api/llm/MultiModalChatRequestBuilder\n*L\n47#1:53,4\n*E\n"})
/*    */ public final class MultiModalChatRequestBuilder {
/*    */   @Nullable
/*    */   private LLMPromptID prompt;
/*    */   @Nullable
/*    */   private LLMMultiModalChat messages;
/*    */   
/*    */   @Nullable
/* 20 */   public final LLMPromptID getPrompt() { return this.prompt; } @Nullable private LLMProfileID profile; @Nullable private Double temperature; public final void setPrompt(@Nullable LLMPromptID <set-?>) { this.prompt = <set-?>; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final LLMMultiModalChat getMessages() {
/* 25 */     return this.messages; } public final void setMessages(@Nullable LLMMultiModalChat <set-?>) { this.messages = <set-?>; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final LLMProfileID getProfile() {
/* 30 */     return this.profile; } public final void setProfile(@Nullable LLMProfileID <set-?>) { this.profile = <set-?>; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final Double getTemperature() {
/* 35 */     return this.temperature; } public final void setTemperature(@Nullable Double <set-?>) { this.temperature = <set-?>; }
/*    */   
/*    */   public final void messages(@Nullable String instruction, @NotNull Function1 messages) {
/* 38 */     Intrinsics.checkNotNullParameter(messages, "messages"); LLMMultiModalChat.Builder builder = new LLMMultiModalChat.Builder(instruction); messages.invoke(builder); this.messages = builder.build();
/*    */   }
/*    */   @NotNull
/*    */   public final LlmAPI.MultiModalChat.V1.Request build() {
/*    */     LLMProfileID lLMProfileID;
/* 43 */     if (this.prompt == null)
/*    */     
/*    */     { 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 52 */       int $i$a$-requireNotNull-MultiModalChatRequestBuilder$build$1 = 0; String str = "prompt is required"; throw new IllegalArgumentException(str.toString()); }  if (this.profile == null) { LLMProfileID lLMProfileID1 = this.profile; int $i$a$-requireNotNull-MultiModalChatRequestBuilder$build$2 = 0; String str = "profile is required"; throw new IllegalArgumentException(str.toString()); }  if (this.messages == null) { LLMProfileID lLMProfileID1; LLMMultiModalChat lLMMultiModalChat = this.messages; int $i$a$-requireNotNull-MultiModalChatRequestBuilder$build$3 = 0; String str2 = "messages is required", str1 = str2; throw new IllegalArgumentException(str1.toString()); }
/* 53 */      Attributes attributes1 = new Attributes(); Object value$iv = this.temperature; int $i$f$chainIfNotNull = 0; if (value$iv != null) {
/* 54 */       LLMProfileID lLMProfileID1; double d = ((Number)value$iv).doubleValue(); Attributes attributes3 = attributes1; LLMMultiModalChat lLMMultiModalChat4 = this.messages, lLMMultiModalChat3 = lLMMultiModalChat4; int $i$a$-chainIfNotNull-MultiModalChatRequestBuilder$build$4 = 0; Attributes attributes4 = attributes3.put((Attributes.Key)LLMParameters.INSTANCE.getTemperature(), (Attributes.Value)new Attributes.Value.Double(d, null, 2, null));
/*    */     } 
/* 56 */     Attributes attributes2 = attributes1;
/*    */     LLMMultiModalChat lLMMultiModalChat1 = this.messages, lLMMultiModalChat2 = lLMMultiModalChat1;
/*    */     return new LlmAPI.MultiModalChat.V1.Request((LLMPromptID)lLMProfileID, (LLMProfileID)lLMMultiModalChat2, lLMMultiModalChat1, attributes2);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\llm\MultiModalChatRequestBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */