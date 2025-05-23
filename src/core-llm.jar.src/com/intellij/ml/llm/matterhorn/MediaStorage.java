package com.intellij.ml.llm.matterhorn;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\022\n\002\b\004\bf\030\0002\0020\001J\034\020\002\032\0020\0032\006\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\003H&J\022\020\007\032\004\030\0010\0052\006\020\b\032\0020\003H&¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/MediaStorage;", "", "store", "", "content", "", "originalFilePath", "get", "mediaContentId", "core"})
public interface MediaStorage {
  @NotNull
  String store(@NotNull byte[] paramArrayOfbyte, @Nullable String paramString);
  
  @Nullable
  byte[] get(@NotNull String paramString);
  
  @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
  public static final class DefaultImpls {}
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\MediaStorage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */