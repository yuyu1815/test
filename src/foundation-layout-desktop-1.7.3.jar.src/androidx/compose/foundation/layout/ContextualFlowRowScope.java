package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@LayoutScopeMarker
@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\005\bg\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\003X¦\004¢\006\006\032\004\b\007\020\005R\030\020\b\032\0020\tX¦\004ø\001\000ø\001\001¢\006\006\032\004\b\n\020\013R\030\020\f\032\0020\tX¦\004ø\001\000ø\001\001¢\006\006\032\004\b\r\020\013ø\001\002\002\021\n\005\b¡\0360\001\n\002\b!\n\004\b!0\001¨\006\016À\006\001"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowRowScope;", "Landroidx/compose/foundation/layout/FlowRowScope;", "indexInLine", "", "getIndexInLine", "()I", "lineIndex", "getLineIndex", "maxHeight", "Landroidx/compose/ui/unit/Dp;", "getMaxHeight-D9Ej5fM", "()F", "maxWidthInLine", "getMaxWidthInLine-D9Ej5fM", "foundation-layout"})
@Immutable
@ExperimentalLayoutApi
public interface ContextualFlowRowScope extends FlowRowScope {
  int getLineIndex();
  
  int getIndexInLine();
  
  float getMaxWidthInLine-D9Ej5fM();
  
  float getMaxHeight-D9Ej5fM();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\ContextualFlowRowScope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */