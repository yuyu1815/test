package com.intellij.ml.llm.matterhorn.core.llm;

import com.intellij.ml.llm.matterhorn.llm.LLM;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\bf\030\0002\0020\001J\b\020\002\032\0020\003H&J\016\020\004\032\b\022\004\022\0020\0060\005H&¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornLlmClientProvider;", "", "getClient", "Lcom/intellij/ml/llm/matterhorn/core/llm/LlmClient;", "getLLMs", "", "Lcom/intellij/ml/llm/matterhorn/llm/LLM;", "core-llm"})
public interface MatterhornLlmClientProvider {
  @NotNull
  LlmClient getClient();
  
  @NotNull
  List<LLM> getLLMs();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\MatterhornLlmClientProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */