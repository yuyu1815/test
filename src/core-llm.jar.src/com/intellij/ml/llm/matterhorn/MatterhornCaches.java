package com.intellij.ml.llm.matterhorn;

import com.intellij.util.io.Compressor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\013\n\002\b\002\n\002\020\034\n\002\b\002\n\002\020\022\n\002\b\007\n\002\030\002\n\000\bf\030\0002\0020\001J \020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\007H&J\030\020\t\032\0020\n2\006\020\004\032\0020\0052\006\020\006\032\0020\007H&J\032\020\013\032\004\030\0010\0072\006\020\004\032\0020\0052\006\020\006\032\0020\007H&J\026\020\f\032\b\022\004\022\0020\0070\r2\006\020\004\032\0020\005H&J\020\020\016\032\0020\n2\006\020\004\032\0020\005H&J \020\017\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\020H&J\032\020\021\032\004\030\0010\0202\006\020\004\032\0020\0052\006\020\006\032\0020\007H&J\030\020\022\032\0020\0032\006\020\004\032\0020\0052\006\020\b\032\0020\007H&J\022\020\023\032\004\030\0010\0072\006\020\004\032\0020\005H&J\030\020\024\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H&J\b\020\025\032\0020\003H&J\020\020\026\032\0020\0032\006\020\027\032\0020\030H&¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;", "", "save", "", "type", "Lcom/intellij/ml/llm/matterhorn/CacheType;", "path", "", "content", "contains", "", "load", "loadAllPaths", "", "hasAnyOfType", "saveBinary", "", "loadBinary", "saveSingle", "loadSingle", "remove", "clear", "dumpToZip", "zip", "Lcom/intellij/util/io/Compressor$Zip;", "core"})
public interface MatterhornCaches {
  void save(@NotNull CacheType paramCacheType, @NotNull String paramString1, @NotNull String paramString2);
  
  boolean contains(@NotNull CacheType paramCacheType, @NotNull String paramString);
  
  @Nullable
  String load(@NotNull CacheType paramCacheType, @NotNull String paramString);
  
  @NotNull
  Iterable<String> loadAllPaths(@NotNull CacheType paramCacheType);
  
  boolean hasAnyOfType(@NotNull CacheType paramCacheType);
  
  void saveBinary(@NotNull CacheType paramCacheType, @NotNull String paramString, @NotNull byte[] paramArrayOfbyte);
  
  @Nullable
  byte[] loadBinary(@NotNull CacheType paramCacheType, @NotNull String paramString);
  
  void saveSingle(@NotNull CacheType paramCacheType, @NotNull String paramString);
  
  @Nullable
  String loadSingle(@NotNull CacheType paramCacheType);
  
  void remove(@NotNull CacheType paramCacheType, @NotNull String paramString);
  
  void clear();
  
  void dumpToZip(@NotNull Compressor.Zip paramZip);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\MatterhornCaches.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */