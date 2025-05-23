package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\020\002\n\000\bg\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002J\016\020\b\032\0028\000H¦\002¢\006\002\020\005J\025\020\t\032\016\022\004\022\0028\000\022\004\022\0020\0130\nH¦\002R\030\020\003\032\0028\000X¦\016¢\006\f\032\004\b\004\020\005\"\004\b\006\020\007ø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Landroidx/compose/runtime/MutableState;", "T", "Landroidx/compose/runtime/State;", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "component1", "component2", "Lkotlin/Function1;", "", "runtime"})
@Stable
public interface MutableState<T> extends State<T> {
  T getValue();
  
  void setValue(T paramT);
  
  T component1();
  
  @NotNull
  Function1<T, Unit> component2();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\MutableState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */