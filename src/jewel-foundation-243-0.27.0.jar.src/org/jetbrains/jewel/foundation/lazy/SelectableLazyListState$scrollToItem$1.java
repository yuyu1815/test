package org.jetbrains.jewel.foundation.lazy;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SelectableLazyListState.kt", l = {49, 52}, i = {0, 0, 1, 1}, s = {"L$0", "I$0", "L$0", "I$0"}, n = {"this", "itemIndex", "this", "itemIndex"}, m = "scrollToItem", c = "org.jetbrains.jewel.foundation.lazy.SelectableLazyListState")
@Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
final class SelectableLazyListState$scrollToItem$1 extends ContinuationImpl {
  Object L$0;
  
  int I$0;
  
  int label;
  
  SelectableLazyListState$scrollToItem$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SelectableLazyListState.this.scrollToItem(0, false, 0, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\SelectableLazyListState$scrollToItem$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */