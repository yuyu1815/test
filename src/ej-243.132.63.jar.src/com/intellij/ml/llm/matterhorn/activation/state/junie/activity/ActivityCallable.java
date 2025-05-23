package com.intellij.ml.llm.matterhorn.activation.state.junie.activity;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\bà\001\030\000*\004\b\000\020\001*\006\b\001\020\002 \001*\006\b\002\020\003 \0012\032\022\026\022\024\022\004\022\002H\001\022\004\022\002H\002\022\004\022\002H\0030\0050\004J\033\020\006\032\024\022\004\022\0028\000\022\004\022\0028\001\022\004\022\0028\0020\005H¦\002¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityCallable;", "Ret", "Err", "Val", "Lkotlin/Function0;", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityHandle;", "invoke", "state.junie.impl"})
public interface ActivityCallable<Ret, Err, Val> extends Function0<ActivityHandle<Ret, ? extends Err, ? extends Val>> {
  @NotNull
  ActivityHandle<Ret, Err, Val> invoke();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\activity\ActivityCallable.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */