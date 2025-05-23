/*    */ package org.jetbrains.jewel.foundation.lazy.tree;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.ui.input.key.Key;
/*    */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.foundation.lazy.DefaultSelectableColumnKeybindings;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\030\002\n\002\b\020\b\027\030\000 \0262\0020\0012\0020\002:\001\026B\007¢\006\004\b\003\020\004R\030\020\005\032\0020\006*\0020\0078VX\004¢\006\006\032\004\b\b\020\tR\030\020\n\032\0020\006*\0020\0078VX\004¢\006\006\032\004\b\013\020\tR\030\020\f\032\0020\006*\0020\0078VX\004¢\006\006\032\004\b\r\020\tR\030\020\016\032\0020\006*\0020\0078VX\004¢\006\006\032\004\b\017\020\tR\030\020\020\032\0020\006*\0020\0078VX\004¢\006\006\032\004\b\021\020\tR\030\020\022\032\0020\006*\0020\0078VX\004¢\006\006\032\004\b\023\020\tR\030\020\024\032\0020\006*\0020\0078VX\004¢\006\006\032\004\b\025\020\t¨\006\027"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewKeybindings;", "Lorg/jetbrains/jewel/foundation/lazy/DefaultSelectableColumnKeybindings;", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeViewKeybindings;", "<init>", "()V", "isSelectParent", "", "Landroidx/compose/ui/input/key/KeyEvent;", "isSelectParent-ZmokQxo", "(Ljava/lang/Object;)Z", "isExtendSelectionToParent", "isExtendSelectionToParent-ZmokQxo", "isSelectChild", "isSelectChild-ZmokQxo", "isExtendSelectionToChild", "isExtendSelectionToChild-ZmokQxo", "isSelectNextSibling", "isSelectNextSibling-ZmokQxo", "isSelectPreviousSibling", "isSelectPreviousSibling-ZmokQxo", "isEdit", "isEdit-ZmokQxo", "Companion", "foundation"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public class DefaultTreeViewKeybindings extends DefaultSelectableColumnKeybindings implements TreeViewKeybindings {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/* 18 */   public boolean isSelectParent-ZmokQxo(@NotNull Object $this$isSelectParent) { Intrinsics.checkNotNullParameter($this$isSelectParent, "$this$isSelectParent"); return (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo($this$isSelectParent), Key.Companion.getDirectionLeft-EK5gGoQ()) && !isContiguousSelectionKeyPressed-ZmokQxo($this$isSelectParent)); } public static final int $stable; @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewKeybindings$Companion;", "Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewKeybindings;", "<init>", "()V", "foundation"})
/*    */   public static final class Companion extends DefaultTreeViewKeybindings {
/*    */     private Companion() {} } public boolean isExtendSelectionToParent-ZmokQxo(@NotNull Object $this$isExtendSelectionToParent) {
/* 21 */     Intrinsics.checkNotNullParameter($this$isExtendSelectionToParent, "$this$isExtendSelectionToParent"); return (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo($this$isExtendSelectionToParent), Key.Companion.getDirectionLeft-EK5gGoQ()) && isContiguousSelectionKeyPressed-ZmokQxo($this$isExtendSelectionToParent));
/*    */   }
/*    */   public boolean isSelectChild-ZmokQxo(@NotNull Object $this$isSelectChild) {
/* 24 */     Intrinsics.checkNotNullParameter($this$isSelectChild, "$this$isSelectChild"); return (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo($this$isSelectChild), Key.Companion.getDirectionRight-EK5gGoQ()) && !isContiguousSelectionKeyPressed-ZmokQxo($this$isSelectChild));
/*    */   }
/*    */   public boolean isExtendSelectionToChild-ZmokQxo(@NotNull Object $this$isExtendSelectionToChild) {
/* 27 */     Intrinsics.checkNotNullParameter($this$isExtendSelectionToChild, "$this$isExtendSelectionToChild"); return (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo($this$isExtendSelectionToChild), Key.Companion.getDirectionRight-EK5gGoQ()) && isContiguousSelectionKeyPressed-ZmokQxo($this$isExtendSelectionToChild));
/*    */   }
/*    */   public boolean isSelectNextSibling-ZmokQxo(@NotNull Object $this$isSelectNextSibling) {
/* 30 */     Intrinsics.checkNotNullParameter($this$isSelectNextSibling, "$this$isSelectNextSibling"); return false;
/*    */   }
/*    */   public boolean isSelectPreviousSibling-ZmokQxo(@NotNull Object $this$isSelectPreviousSibling) {
/* 33 */     Intrinsics.checkNotNullParameter($this$isSelectPreviousSibling, "$this$isSelectPreviousSibling"); return false;
/*    */   }
/*    */   public boolean isEdit-ZmokQxo(@NotNull Object $this$isEdit) {
/* 36 */     Intrinsics.checkNotNullParameter($this$isEdit, "$this$isEdit"); return (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo($this$isEdit), Key.Companion.getF2-EK5gGoQ()) && !isContiguousSelectionKeyPressed-ZmokQxo($this$isEdit));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\DefaultTreeViewKeybindings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */