package org.jetbrains.jewel.foundation.lazy.tree;

import androidx.compose.ui.input.pointer.PointerEvent;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jewel.foundation.lazy.SelectableColumnKeybindings;
import org.jetbrains.jewel.foundation.lazy.SelectableLazyListKey;
import org.jetbrains.jewel.foundation.lazy.SelectableLazyListState;
import org.jetbrains.jewel.foundation.lazy.SelectionMode;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\005\bf\030\0002\0020\001J>\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\f\020\f\032\b\022\004\022\0020\0160\r2\006\020\017\032\0020\001H&J.\020\020\032\0020\0032\006\020\017\032\0020\0012\f\020\f\032\b\022\004\022\0020\0160\r2\006\020\b\032\0020\t2\006\020\n\032\0020\013H&J.\020\021\032\0020\0032\006\020\017\032\0020\0012\f\020\f\032\b\022\004\022\0020\0160\r2\006\020\022\032\0020\t2\006\020\n\032\0020\013H&¨\006\023"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;", "", "handlePointerEventPress", "", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "keybindings", "Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;", "selectableLazyListState", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;", "selectionMode", "Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;", "allKeys", "", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;", "key", "toggleKeySelection", "onExtendSelectionToKey", "state", "foundation"})
public interface PointerEventActions {
  void handlePointerEventPress(@NotNull PointerEvent paramPointerEvent, @NotNull SelectableColumnKeybindings paramSelectableColumnKeybindings, @NotNull SelectableLazyListState paramSelectableLazyListState, @NotNull SelectionMode paramSelectionMode, @NotNull List<? extends SelectableLazyListKey> paramList, @NotNull Object paramObject);
  
  void toggleKeySelection(@NotNull Object paramObject, @NotNull List<? extends SelectableLazyListKey> paramList, @NotNull SelectableLazyListState paramSelectableLazyListState, @NotNull SelectionMode paramSelectionMode);
  
  void onExtendSelectionToKey(@NotNull Object paramObject, @NotNull List<? extends SelectableLazyListKey> paramList, @NotNull SelectableLazyListState paramSelectableLazyListState, @NotNull SelectionMode paramSelectionMode);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\PointerEventActions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */