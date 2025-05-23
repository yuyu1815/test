package org.jetbrains.jewel.ui.component;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ListComboBox.kt", l = {220, 221, 223, 228, 233}, i = {3, 3, 3}, s = {"L$0", "I$0", "I$1"}, n = {"$this$scrollToIndex", "itemIndex", "lastItemInfoSize"}, m = "scrollToIndex", c = "org.jetbrains.jewel.ui.component.ListComboBoxKt")
@Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
final class ListComboBoxKt$scrollToIndex$1 extends ContinuationImpl {
  Object L$0;
  
  int I$0;
  
  int I$1;
  
  int label;
  
  ListComboBoxKt$scrollToIndex$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ListComboBoxKt.access$scrollToIndex(null, 0, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ListComboBoxKt$scrollToIndex$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */