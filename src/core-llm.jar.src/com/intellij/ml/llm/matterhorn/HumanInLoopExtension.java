package com.intellij.ml.llm.matterhorn;

import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\020\000\n\002\b\002\bf\030\0002\0020\001R.\020\002\032\036\b\001\022\004\022\0020\004\022\n\022\b\022\004\022\0020\0060\005\022\006\022\004\030\0010\0070\003X¦\004¢\006\006\032\004\b\002\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/HumanInLoopExtension;", "Lcom/intellij/ml/llm/matterhorn/HumanInLoop;", "isInProject", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lkotlin/coroutines/Continuation;", "", "", "()Lkotlin/jvm/functions/Function2;", "core"})
public interface HumanInLoopExtension extends HumanInLoop {
  @NotNull
  Function2<Path, Continuation<? super Boolean>, Object> isInProject();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\HumanInLoopExtension.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */