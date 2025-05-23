/*     */ package org.jetbrains.jewel.foundation.lazy;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.input.key.Key;
/*     */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*     */ import androidx.compose.ui.input.pointer.PointerEvent_skikoKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b#\b\027\030\000 +2\0020\001:\001+B\007¢\006\004\b\002\020\003R\030\020\004\032\0020\005*\0020\0068VX\004¢\006\006\032\004\b\007\020\bR\030\020\004\032\0020\005*\0020\t8VX\004¢\006\006\032\004\b\n\020\013R\030\020\f\032\0020\005*\0020\0068VX\004¢\006\006\032\004\b\r\020\bR\030\020\f\032\0020\005*\0020\t8VX\004¢\006\006\032\004\b\016\020\013R\030\020\017\032\0020\005*\0020\0068VX\004¢\006\006\032\004\b\020\020\bR\030\020\021\032\0020\005*\0020\0068VX\004¢\006\006\032\004\b\022\020\bR\030\020\023\032\0020\005*\0020\0068VX\004¢\006\006\032\004\b\024\020\bR\030\020\025\032\0020\005*\0020\0068VX\004¢\006\006\032\004\b\026\020\bR\030\020\027\032\0020\005*\0020\0068VX\004¢\006\006\032\004\b\030\020\bR\030\020\031\032\0020\005*\0020\0068VX\004¢\006\006\032\004\b\032\020\bR\030\020\033\032\0020\005*\0020\0068VX\004¢\006\006\032\004\b\034\020\bR\030\020\035\032\0020\005*\0020\0068VX\004¢\006\006\032\004\b\036\020\bR\030\020\037\032\0020\005*\0020\0068VX\004¢\006\006\032\004\b \020\bR\030\020!\032\0020\005*\0020\0068VX\004¢\006\006\032\004\b\"\020\bR\030\020#\032\0020\005*\0020\0068VX\004¢\006\006\032\004\b$\020\bR\030\020%\032\0020\005*\0020\0068VX\004¢\006\006\032\004\b&\020\bR\030\020'\032\0020\005*\0020\0068VX\004¢\006\006\032\004\b(\020\bR\030\020)\032\0020\005*\0020\0068VX\004¢\006\006\032\004\b*\020\b¨\006,"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/DefaultSelectableColumnKeybindings;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;", "<init>", "()V", "isContiguousSelectionKeyPressed", "", "Landroidx/compose/ui/input/key/KeyEvent;", "isContiguousSelectionKeyPressed-ZmokQxo", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "isContiguousSelectionKeyPressed-5xRPYO0", "(I)Z", "isMultiSelectionKeyPressed", "isMultiSelectionKeyPressed-ZmokQxo", "isMultiSelectionKeyPressed-5xRPYO0", "isSelectFirstItem", "isSelectFirstItem-ZmokQxo", "isExtendSelectionToFirstItem", "isExtendSelectionToFirstItem-ZmokQxo", "isSelectLastItem", "isSelectLastItem-ZmokQxo", "isExtendSelectionToLastItem", "isExtendSelectionToLastItem-ZmokQxo", "isSelectPreviousItem", "isSelectPreviousItem-ZmokQxo", "isExtendSelectionWithPreviousItem", "isExtendSelectionWithPreviousItem-ZmokQxo", "isSelectNextItem", "isSelectNextItem-ZmokQxo", "isExtendSelectionWithNextItem", "isExtendSelectionWithNextItem-ZmokQxo", "isScrollPageUpAndSelectItem", "isScrollPageUpAndSelectItem-ZmokQxo", "isScrollPageUpAndExtendSelection", "isScrollPageUpAndExtendSelection-ZmokQxo", "isScrollPageDownAndSelectItem", "isScrollPageDownAndSelectItem-ZmokQxo", "isScrollPageDownAndExtendSelection", "isScrollPageDownAndExtendSelection-ZmokQxo", "isEdit", "isEdit-ZmokQxo", "isSelectAll", "isSelectAll-ZmokQxo", "Companion", "foundation"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public class DefaultSelectableColumnKeybindings
/*     */   implements SelectableColumnKeybindings
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   public static final int $stable;
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/DefaultSelectableColumnKeybindings$Companion;", "Lorg/jetbrains/jewel/foundation/lazy/DefaultSelectableColumnKeybindings;", "<init>", "()V", "foundation"})
/*     */   public static final class Companion
/*     */     extends DefaultSelectableColumnKeybindings
/*     */   {
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   public boolean isContiguousSelectionKeyPressed-ZmokQxo(@NotNull Object $this$isContiguousSelectionKeyPressed) {
/*  80 */     Intrinsics.checkNotNullParameter($this$isContiguousSelectionKeyPressed, "$this$isContiguousSelectionKeyPressed"); return KeyEvent_desktopKt.isShiftPressed-ZmokQxo($this$isContiguousSelectionKeyPressed);
/*     */   }
/*     */   public boolean isContiguousSelectionKeyPressed-5xRPYO0(int $this$isContiguousSelectionKeyPressed) {
/*  83 */     return PointerEvent_skikoKt.isShiftPressed-5xRPYO0($this$isContiguousSelectionKeyPressed);
/*     */   }
/*     */   public boolean isMultiSelectionKeyPressed-ZmokQxo(@NotNull Object $this$isMultiSelectionKeyPressed) {
/*  86 */     Intrinsics.checkNotNullParameter($this$isMultiSelectionKeyPressed, "$this$isMultiSelectionKeyPressed"); return KeyEvent_desktopKt.isCtrlPressed-ZmokQxo($this$isMultiSelectionKeyPressed);
/*     */   }
/*     */   public boolean isMultiSelectionKeyPressed-5xRPYO0(int $this$isMultiSelectionKeyPressed) {
/*  89 */     return PointerEvent_skikoKt.isCtrlPressed-5xRPYO0($this$isMultiSelectionKeyPressed);
/*     */   }
/*     */   public boolean isSelectFirstItem-ZmokQxo(@NotNull Object $this$isSelectFirstItem) {
/*  92 */     Intrinsics.checkNotNullParameter($this$isSelectFirstItem, "$this$isSelectFirstItem"); return (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo($this$isSelectFirstItem), Key.Companion.getHome-EK5gGoQ()) && !isContiguousSelectionKeyPressed-ZmokQxo($this$isSelectFirstItem));
/*     */   }
/*     */   public boolean isExtendSelectionToFirstItem-ZmokQxo(@NotNull Object $this$isExtendSelectionToFirstItem) {
/*  95 */     Intrinsics.checkNotNullParameter($this$isExtendSelectionToFirstItem, "$this$isExtendSelectionToFirstItem"); return (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo($this$isExtendSelectionToFirstItem), Key.Companion.getHome-EK5gGoQ()) && isContiguousSelectionKeyPressed-ZmokQxo($this$isExtendSelectionToFirstItem));
/*     */   }
/*     */   public boolean isSelectLastItem-ZmokQxo(@NotNull Object $this$isSelectLastItem) {
/*  98 */     Intrinsics.checkNotNullParameter($this$isSelectLastItem, "$this$isSelectLastItem"); return (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo($this$isSelectLastItem), Key.Companion.getMoveEnd-EK5gGoQ()) && !isContiguousSelectionKeyPressed-ZmokQxo($this$isSelectLastItem));
/*     */   }
/*     */   public boolean isExtendSelectionToLastItem-ZmokQxo(@NotNull Object $this$isExtendSelectionToLastItem) {
/* 101 */     Intrinsics.checkNotNullParameter($this$isExtendSelectionToLastItem, "$this$isExtendSelectionToLastItem"); return (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo($this$isExtendSelectionToLastItem), Key.Companion.getMoveEnd-EK5gGoQ()) && isContiguousSelectionKeyPressed-ZmokQxo($this$isExtendSelectionToLastItem));
/*     */   }
/*     */   public boolean isSelectPreviousItem-ZmokQxo(@NotNull Object $this$isSelectPreviousItem) {
/* 104 */     Intrinsics.checkNotNullParameter($this$isSelectPreviousItem, "$this$isSelectPreviousItem"); return (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo($this$isSelectPreviousItem), Key.Companion.getDirectionUp-EK5gGoQ()) && !isContiguousSelectionKeyPressed-ZmokQxo($this$isSelectPreviousItem));
/*     */   }
/*     */   public boolean isExtendSelectionWithPreviousItem-ZmokQxo(@NotNull Object $this$isExtendSelectionWithPreviousItem) {
/* 107 */     Intrinsics.checkNotNullParameter($this$isExtendSelectionWithPreviousItem, "$this$isExtendSelectionWithPreviousItem"); return (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo($this$isExtendSelectionWithPreviousItem), Key.Companion.getDirectionUp-EK5gGoQ()) && isContiguousSelectionKeyPressed-ZmokQxo($this$isExtendSelectionWithPreviousItem));
/*     */   }
/*     */   public boolean isSelectNextItem-ZmokQxo(@NotNull Object $this$isSelectNextItem) {
/* 110 */     Intrinsics.checkNotNullParameter($this$isSelectNextItem, "$this$isSelectNextItem"); return (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo($this$isSelectNextItem), Key.Companion.getDirectionDown-EK5gGoQ()) && !isContiguousSelectionKeyPressed-ZmokQxo($this$isSelectNextItem));
/*     */   }
/*     */   public boolean isExtendSelectionWithNextItem-ZmokQxo(@NotNull Object $this$isExtendSelectionWithNextItem) {
/* 113 */     Intrinsics.checkNotNullParameter($this$isExtendSelectionWithNextItem, "$this$isExtendSelectionWithNextItem"); return (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo($this$isExtendSelectionWithNextItem), Key.Companion.getDirectionDown-EK5gGoQ()) && isContiguousSelectionKeyPressed-ZmokQxo($this$isExtendSelectionWithNextItem));
/*     */   }
/*     */   public boolean isScrollPageUpAndSelectItem-ZmokQxo(@NotNull Object $this$isScrollPageUpAndSelectItem) {
/* 116 */     Intrinsics.checkNotNullParameter($this$isScrollPageUpAndSelectItem, "$this$isScrollPageUpAndSelectItem"); return (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo($this$isScrollPageUpAndSelectItem), Key.Companion.getPageUp-EK5gGoQ()) && !isContiguousSelectionKeyPressed-ZmokQxo($this$isScrollPageUpAndSelectItem));
/*     */   }
/*     */   public boolean isScrollPageUpAndExtendSelection-ZmokQxo(@NotNull Object $this$isScrollPageUpAndExtendSelection) {
/* 119 */     Intrinsics.checkNotNullParameter($this$isScrollPageUpAndExtendSelection, "$this$isScrollPageUpAndExtendSelection"); return (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo($this$isScrollPageUpAndExtendSelection), Key.Companion.getPageUp-EK5gGoQ()) && isContiguousSelectionKeyPressed-ZmokQxo($this$isScrollPageUpAndExtendSelection));
/*     */   }
/*     */   public boolean isScrollPageDownAndSelectItem-ZmokQxo(@NotNull Object $this$isScrollPageDownAndSelectItem) {
/* 122 */     Intrinsics.checkNotNullParameter($this$isScrollPageDownAndSelectItem, "$this$isScrollPageDownAndSelectItem"); return (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo($this$isScrollPageDownAndSelectItem), Key.Companion.getPageDown-EK5gGoQ()) && !isContiguousSelectionKeyPressed-ZmokQxo($this$isScrollPageDownAndSelectItem));
/*     */   }
/*     */   public boolean isScrollPageDownAndExtendSelection-ZmokQxo(@NotNull Object $this$isScrollPageDownAndExtendSelection) {
/* 125 */     Intrinsics.checkNotNullParameter($this$isScrollPageDownAndExtendSelection, "$this$isScrollPageDownAndExtendSelection"); return (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo($this$isScrollPageDownAndExtendSelection), Key.Companion.getPageDown-EK5gGoQ()) && isContiguousSelectionKeyPressed-ZmokQxo($this$isScrollPageDownAndExtendSelection));
/*     */   }
/*     */   public boolean isEdit-ZmokQxo(@NotNull Object $this$isEdit) {
/* 128 */     Intrinsics.checkNotNullParameter($this$isEdit, "$this$isEdit"); return false;
/*     */   }
/*     */   public boolean isSelectAll-ZmokQxo(@NotNull Object $this$isSelectAll) {
/* 131 */     Intrinsics.checkNotNullParameter($this$isSelectAll, "$this$isSelectAll"); return (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo($this$isSelectAll), Key.Companion.getA-EK5gGoQ()) && isMultiSelectionKeyPressed-ZmokQxo($this$isSelectAll));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\DefaultSelectableColumnKeybindings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */