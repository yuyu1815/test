package ai.grazie.tree.suspendable;

import ai.grazie.tree.model.SentenceWithTreeDependencies;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableTreeDependencyService.kt", l = {17}, i = {}, s = {}, n = {}, m = "parse$suspendImpl", c = "ai.grazie.tree.suspendable.SuspendableTreeDependencyService")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableTreeDependencyService$parse$1 extends ContinuationImpl {
  int label;
  
  SuspendableTreeDependencyService$parse$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableTreeDependencyService.parse$suspendImpl(SuspendableTreeDependencyService.this, null, (Continuation<? super SentenceWithTreeDependencies>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-tree-jvm-0.4.32.jar!\ai\grazie\tree\suspendable\SuspendableTreeDependencyService$parse$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */