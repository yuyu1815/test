package com.intellij.ml.llm.matterhorn.settings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\030\020\002\032\004\030\0010\0032\006\020\004\032\0020\005H¦@¢\006\002\020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "", "getProperty", "", "property", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;", "(Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
public interface MatterhornPropertyProvider {
  @Nullable
  Object getProperty(@NotNull MatterhornProperty paramMatterhornProperty, @NotNull Continuation<? super String> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\settings\MatterhornPropertyProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */