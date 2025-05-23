package com.intellij.ml.llm.matterhorn.activation.state.junie.activity;

import androidx.compose.runtime.Stable;
import com.intellij.ml.llm.matterhorn.activation.state.model.OpResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\b\003\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\ba\030\000*\004\b\000\020\001*\006\b\001\020\002 \001*\006\b\002\020\003 \0012\0020\004J=\020\t\032\024\022\004\022\0028\000\022\004\022\0028\001\022\004\022\0028\0020\n2\034\020\013\032\030\b\001\022\n\022\b\022\004\022\0028\0000\r\022\006\022\004\030\0010\0040\fH&¢\006\002\020\016R \020\005\032\020\022\004\022\0028\001\022\004\022\0028\002\030\0010\006X¦\004¢\006\006\032\004\b\007\020\b¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncher;", "Ret", "Err", "Val", "", "latestOpResult", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;", "getLatestOpResult", "()Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;", "launchActivity", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;)Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle;", "state.junie.impl"})
@Stable
public interface ActivityLauncher<Ret, Err, Val> {
  @Nullable
  OpResult<Err, Val> getLatestOpResult();
  
  @NotNull
  ActivityHandle<Ret, Err, Val> launchActivity(@NotNull Function1<? super Continuation<? super Ret>, ? extends Object> paramFunction1);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\activity\ActivityLauncher.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */