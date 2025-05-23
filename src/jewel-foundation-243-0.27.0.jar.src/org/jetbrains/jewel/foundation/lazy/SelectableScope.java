package org.jetbrains.jewel.foundation.lazy;

import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\020\"\n\002\b\005\bf\030\0002\0020\001R\036\020\002\032\b\022\004\022\0020\0010\003X¦\016¢\006\f\032\004\b\004\020\005\"\004\b\006\020\007¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/SelectableScope;", "", "selectedKeys", "", "getSelectedKeys", "()Ljava/util/Set;", "setSelectedKeys", "(Ljava/util/Set;)V", "foundation"})
public interface SelectableScope {
  @NotNull
  Set<Object> getSelectedKeys();
  
  void setSelectedKeys(@NotNull Set<? extends Object> paramSet);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\SelectableScope.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */