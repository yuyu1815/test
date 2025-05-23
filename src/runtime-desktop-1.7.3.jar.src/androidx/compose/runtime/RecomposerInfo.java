package androidx.compose.runtime;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\003\n\002\020\013\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\bf\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\030\020\n\032\b\022\004\022\0020\f0\013X¦\004¢\006\006\032\004\b\r\020\016ø\001\000\002\006\n\004\b!0\001¨\006\017À\006\001"}, d2 = {"Landroidx/compose/runtime/RecomposerInfo;", "", "changeCount", "", "getChangeCount", "()J", "hasPendingWork", "", "getHasPendingWork", "()Z", "state", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/runtime/Recomposer$State;", "getState", "()Lkotlinx/coroutines/flow/Flow;", "runtime"})
public interface RecomposerInfo {
  @NotNull
  Flow<Recomposer.State> getState();
  
  boolean getHasPendingWork();
  
  long getChangeCount();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\RecomposerInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */