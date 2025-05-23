package com.intellij.ml.llm.matterhorn.activation.platform.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/platform/util/GrazieAuthUtils;", "", "<init>", "()V", "GRAZIE_AUTH_HEADER", "", "AGENT", "platform"})
public final class GrazieAuthUtils {
  @NotNull
  public static final GrazieAuthUtils INSTANCE = new GrazieAuthUtils();
  
  @NotNull
  public static final String GRAZIE_AUTH_HEADER = "Grazie-Authenticate-JWT";
  
  @NotNull
  public static final String AGENT = "Grazie-Agent";
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\platfor\\util\GrazieAuthUtils.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */