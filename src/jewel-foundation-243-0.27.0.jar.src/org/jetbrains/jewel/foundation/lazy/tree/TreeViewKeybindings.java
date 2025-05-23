package org.jetbrains.jewel.foundation.lazy.tree;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jewel.foundation.lazy.SelectableColumnKeybindings;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\030\002\n\002\b\r\bf\030\0002\0020\001R\026\020\002\032\0020\003*\0020\004X¦\004¢\006\006\032\004\b\005\020\006R\026\020\007\032\0020\003*\0020\004X¦\004¢\006\006\032\004\b\b\020\006R\026\020\t\032\0020\003*\0020\004X¦\004¢\006\006\032\004\b\n\020\006R\026\020\013\032\0020\003*\0020\004X¦\004¢\006\006\032\004\b\f\020\006R\026\020\r\032\0020\003*\0020\004X¦\004¢\006\006\032\004\b\016\020\006R\026\020\017\032\0020\003*\0020\004X¦\004¢\006\006\032\004\b\020\020\006¨\006\021"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/TreeViewKeybindings;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;", "isSelectParent", "", "Landroidx/compose/ui/input/key/KeyEvent;", "isSelectParent-ZmokQxo", "(Ljava/lang/Object;)Z", "isExtendSelectionToParent", "isExtendSelectionToParent-ZmokQxo", "isSelectChild", "isSelectChild-ZmokQxo", "isExtendSelectionToChild", "isExtendSelectionToChild-ZmokQxo", "isSelectNextSibling", "isSelectNextSibling-ZmokQxo", "isSelectPreviousSibling", "isSelectPreviousSibling-ZmokQxo", "foundation"})
public interface TreeViewKeybindings extends SelectableColumnKeybindings {
  boolean isSelectParent-ZmokQxo(@NotNull Object paramObject);
  
  boolean isExtendSelectionToParent-ZmokQxo(@NotNull Object paramObject);
  
  boolean isSelectChild-ZmokQxo(@NotNull Object paramObject);
  
  boolean isExtendSelectionToChild-ZmokQxo(@NotNull Object paramObject);
  
  boolean isSelectNextSibling-ZmokQxo(@NotNull Object paramObject);
  
  boolean isSelectPreviousSibling-ZmokQxo(@NotNull Object paramObject);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\TreeViewKeybindings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */