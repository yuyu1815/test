package com.intellij.ml.llm.matterhorn.core.llm;

import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J \020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH&¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/LlmClient;", "", "createRequest", "Lcom/intellij/ml/llm/matterhorn/core/llm/LlmRequest;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "core-llm"})
public interface LlmClient {
  @NotNull
  LlmRequest createRequest(@NotNull MatterhornChat paramMatterhornChat, @NotNull ModelParameters paramModelParameters, @NotNull MatterhornPropertyProvider paramMatterhornPropertyProvider);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\LlmClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */