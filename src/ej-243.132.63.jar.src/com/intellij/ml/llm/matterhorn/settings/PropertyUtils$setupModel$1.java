package com.intellij.ml.llm.matterhorn.settings;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "MatterhornProperties.kt", l = {47, 48}, i = {0, 0, 0, 0, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"}, n = {"modelProviderProperty", "propertyProvider", "action", "name", "action", "name"}, m = "setupModel", c = "com.intellij.ml.llm.matterhorn.settings.PropertyUtils")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class PropertyUtils$setupModel$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  int label;
  
  PropertyUtils$setupModel$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return PropertyUtils.this.setupModel(null, null, null, null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\settings\PropertyUtils$setupModel$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */