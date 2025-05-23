package org.jetbrains.jewel.foundation.lazy.tree;

import androidx.compose.ui.input.key.KeyEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jewel.foundation.lazy.SelectableColumnKeybindings;
import org.jetbrains.jewel.foundation.lazy.SelectableColumnOnKeyEvent;
import org.jetbrains.jewel.foundation.lazy.SelectableLazyListKey;
import org.jetbrains.jewel.foundation.lazy.SelectableLazyListState;
import org.jetbrains.jewel.foundation.lazy.SelectionMode;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\013\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bf\030\0002\0020\001JF\020\n\032\023\022\004\022\0020\f\022\004\022\0020\r0\013¢\006\002\b\0162\006\020\017\032\0020\f2\f\020\020\032\b\022\004\022\0020\0220\0212\006\020\023\032\0020\0242\006\020\025\032\0020\026H&¢\006\004\b\027\020\030R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\t¨\006\031"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;", "", "keybindings", "Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;", "getKeybindings", "()Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;", "actions", "Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnOnKeyEvent;", "getActions", "()Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnOnKeyEvent;", "handleOnKeyEvent", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "Lkotlin/ExtensionFunctionType;", "event", "keys", "", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;", "state", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;", "selectionMode", "Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;", "handleOnKeyEvent-jhbQyNo", "(Ljava/lang/Object;Ljava/util/List;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;)Lkotlin/jvm/functions/Function1;", "foundation"})
public interface KeyActions {
  @NotNull
  SelectableColumnKeybindings getKeybindings();
  
  @NotNull
  SelectableColumnOnKeyEvent getActions();
  
  @NotNull
  Function1<KeyEvent, Boolean> handleOnKeyEvent-jhbQyNo(@NotNull Object paramObject, @NotNull List<? extends SelectableLazyListKey> paramList, @NotNull SelectableLazyListState paramSelectableLazyListState, @NotNull SelectionMode paramSelectionMode);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\KeyActions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */