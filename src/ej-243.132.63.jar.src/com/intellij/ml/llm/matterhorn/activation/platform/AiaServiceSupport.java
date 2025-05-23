package com.intellij.ml.llm.matterhorn.activation.platform;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\002\bf\030\000 \r*\n\b\000\020\001 \001*\0020\0022\0020\002:\001\rJ\r\020\007\032\0028\000H&¢\006\002\020\bJ\016\020\t\032\0028\000H¦@¢\006\002\020\nJ\016\020\013\032\b\022\004\022\0028\0000\fH&R\032\020\003\032\n\022\006\b\001\022\0028\0000\004X¦\004¢\006\006\032\004\b\005\020\006¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;", "T", "", "keyClass", "Lkotlin/reflect/KClass;", "getKeyClass", "()Lkotlin/reflect/KClass;", "syncInstance", "()Ljava/lang/Object;", "instance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instanceFlow", "Lkotlinx/coroutines/flow/Flow;", "Companion", "platform"})
public interface AiaServiceSupport<T> {
  @NotNull
  public static final Companion Companion = Companion.$$INSTANCE;
  
  @NotNull
  KClass<? extends T> getKeyClass();
  
  @NotNull
  T syncInstance();
  
  @Nullable
  Object instance(@NotNull Continuation<? super T> paramContinuation);
  
  @NotNull
  Flow<T> instanceFlow();
  
  @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\033\020\004\032\b\022\004\022\002H\0060\005\"\n\b\001\020\006\030\001*\0020\001H\n¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport$Companion;", "", "<init>", "()V", "invoke", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;", "T", "platform"})
  public static final class Companion {}
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\platform\AiaServiceSupport.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */