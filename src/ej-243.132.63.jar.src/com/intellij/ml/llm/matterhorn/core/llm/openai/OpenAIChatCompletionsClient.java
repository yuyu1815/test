/*    */ package com.intellij.ml.llm.matterhorn.core.llm.openai;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*    */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*    */ import com.intellij.ml.llm.matterhorn.llm.StopSequenceType;
/*    */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026J1\020\f\032\0020\r2\006\020\006\032\0020\0072\006\020\b\032\0020\t2\022\020\016\032\016\022\004\022\0020\020\022\004\022\0020\0210\017H\000¢\006\002\b\022¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatCompletionsClient;", "Lcom/intellij/ml/llm/matterhorn/core/llm/LlmClient;", "<init>", "()V", "createRequest", "Lcom/intellij/ml/llm/matterhorn/core/llm/LlmRequest;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "createOpenAIRequestBody", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiChatRequestBody;", "stopReasons", "", "", "Lcom/intellij/ml/llm/matterhorn/llm/StopSequenceType;", "createOpenAIRequestBody$core_llm", "core-llm"})
/*    */ @SourceDebugExtension({"SMAP\nOpenAIChatCompletionsClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenAIChatCompletionsClient.kt\ncom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatCompletionsClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
/*    */ public final class OpenAIChatCompletionsClient implements LlmClient {
/*    */   @NotNull
/* 17 */   public static final OpenAIChatCompletionsClient INSTANCE = new OpenAIChatCompletionsClient(); static {
/* 18 */     EnvExtensionsKt.assertHasMatterhornProxy(BuildConfigKt.getConfig());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public LlmRequest createRequest(@NotNull MatterhornChat chat, @NotNull ModelParameters modelParameters, @NotNull MatterhornPropertyProvider propertyProvider) {
/* 26 */     Intrinsics.checkNotNullParameter(chat, "chat"); Intrinsics.checkNotNullParameter(modelParameters, "modelParameters"); Intrinsics.checkNotNullParameter(propertyProvider, "propertyProvider"); MatterhornChat safe = chat.checkChatForOpenAI();
/* 27 */     if (modelParameters.getStop() == null) modelParameters.getStop();  Map<String, ? extends StopSequenceType> stopReasons = MapsKt.emptyMap();
/* 28 */     OpenAiChatRequestBody body = createOpenAIRequestBody$core_llm(safe, modelParameters, stopReasons);
/*    */     
/* 30 */     return new OpenAIChatRequest(
/* 31 */         body, 
/* 32 */         stopReasons, 
/* 33 */         modelParameters.getModel(), 
/* 34 */         modelParameters.getModel().getProvider(), 
/* 35 */         propertyProvider);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final OpenAiChatRequestBody createOpenAIRequestBody$core_llm(@NotNull MatterhornChat chat, @NotNull ModelParameters modelParameters, @NotNull Map stopReasons) {
/* 44 */     Intrinsics.checkNotNullParameter(chat, "chat"); Intrinsics.checkNotNullParameter(modelParameters, "modelParameters"); Intrinsics.checkNotNullParameter(stopReasons, "stopReasons"); String systemRole = ModelParameters.Companion.isO(modelParameters) ? "assistant" : "system";
/* 45 */     OpenAIChatMessage[] arrayOfOpenAIChatMessage = new OpenAIChatMessage[1]; arrayOfOpenAIChatMessage[0] = new OpenAIChatMessage(systemRole, chat.getSystem()); List<OpenAIChatMessage> messages = CollectionsKt.mutableListOf((Object[])arrayOfOpenAIChatMessage);
/*    */     
/* 47 */     for (MatterhornChatElement matterhornMessage : chat.getMessages()) {
/* 48 */       if (!(matterhornMessage instanceof MatterhornChatMessage))
/*    */       {
/* 50 */         throw new InternalError("Only MatterhornChatMessage are supported");
/*    */       }
/*    */       
/* 53 */       String role = 
/* 54 */         (WhenMappings.$EnumSwitchMapping$0[((MatterhornChatMessage)matterhornMessage).getKind().ordinal()] == 1) ? "user" : 
/* 55 */         "assistant";
/*    */       
/* 57 */       messages.add(new OpenAIChatMessage(role, ((MatterhornChatMessage)matterhornMessage).getContent()));
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 63 */     List list1 = CollectionsKt.toList(stopReasons.keySet());
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 68 */     int $i$a$-ifEmpty-OpenAIChatCompletionsClient$createOpenAIRequestBody$body$1 = 0;
/*    */     List<String> list = list1.isEmpty() ? null : list1;
/*    */     OpenAiChatRequestBody body = new OpenAiChatRequestBody(modelParameters, messages, list);
/*    */     return body;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAIChatCompletionsClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */