package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@LayoutScopeMarker
@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\b\bg\030\0002\0020\001R\032\020\002\032\0020\0038&X§\004¢\006\f\022\004\b\004\020\005\032\004\b\006\020\007R\032\020\b\032\0020\0038&X§\004¢\006\f\022\004\b\t\020\005\032\004\b\n\020\007ø\001\000\002\006\n\004\b!0\001¨\006\013À\006\001"}, d2 = {"Landroidx/compose/foundation/layout/FlowColumnOverflowScope;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "shownItemCount", "", "getShownItemCount$annotations", "()V", "getShownItemCount", "()I", "totalItemCount", "getTotalItemCount$annotations", "getTotalItemCount", "foundation-layout"})
@Immutable
@ExperimentalLayoutApi
public interface FlowColumnOverflowScope extends FlowColumnScope {
  int getTotalItemCount();
  
  int getShownItemCount();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\FlowColumnOverflowScope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */