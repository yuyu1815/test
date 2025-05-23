package com.intellij.ml.llm.matterhorn.activation.state.junie.data;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\002\b\002\bf\030\000*\004\b\000\020\0012\0020\002J\023\020\003\032\b\022\004\022\0028\0000\004H'¢\006\002\020\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazy;", "T", "", "observeState", "Landroidx/compose/runtime/State;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "state.junie.impl"})
public interface StateLazy<T> {
  @Composable
  @NotNull
  State<T> observeState(@Nullable Composer paramComposer, int paramInt);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\data\StateLazy.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */