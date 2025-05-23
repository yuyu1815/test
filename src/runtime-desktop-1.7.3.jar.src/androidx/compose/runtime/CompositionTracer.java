package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\020\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\016\n\000\bg\030\0002\0020\001J\b\020\002\032\0020\003H&J\b\020\004\032\0020\005H&J(\020\006\032\0020\0052\006\020\007\032\0020\b2\006\020\t\032\0020\b2\006\020\n\032\0020\b2\006\020\013\032\0020\fH&ø\001\000\002\006\n\004\b!0\001¨\006\rÀ\006\001"}, d2 = {"Landroidx/compose/runtime/CompositionTracer;", "", "isTraceInProgress", "", "traceEventEnd", "", "traceEventStart", "key", "", "dirty1", "dirty2", "info", "", "runtime"})
@InternalComposeTracingApi
public interface CompositionTracer {
  void traceEventStart(int paramInt1, int paramInt2, int paramInt3, @NotNull String paramString);
  
  void traceEventEnd();
  
  boolean isTraceInProgress();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\CompositionTracer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */