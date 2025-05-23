package com.intellij.ml.llm.matterhorn;

import com.intellij.ide.CliResult;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\002\bf\030\0002\0020\001J \020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\0052\b\020\007\032\004\030\0010\006H&¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/MatterhornCliStarter;", "", "processExternalCommandLine", "Lcom/intellij/ide/CliResult;", "args", "", "", "currentDirectory", "core"})
public interface MatterhornCliStarter {
  @NotNull
  CliResult processExternalCommandLine(@NotNull List<String> paramList, @Nullable String paramString);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\MatterhornCliStarter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */