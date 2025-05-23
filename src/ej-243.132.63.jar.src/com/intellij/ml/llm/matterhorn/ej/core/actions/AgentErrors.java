package com.intellij.ml.llm.matterhorn.ej.core.actions;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/AgentErrors;", "", "<init>", "()V", "ERROR_NO_FILE_OPEN_WITH_HINT", "", "ERROR_PSI_FILE_NOT_FOUND", "ej-core"})
public final class AgentErrors {
  @NotNull
  public static final AgentErrors INSTANCE = new AgentErrors();
  
  @NotNull
  public static final String ERROR_NO_FILE_OPEN_WITH_HINT = "ERROR: No file open. Use open command first";
  
  @NotNull
  public static final String ERROR_PSI_FILE_NOT_FOUND = "ERROR: Could not find PSI for file";
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\AgentErrors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */