/*     */ package org.jetbrains.jewel.foundation.lazy;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\027\030\000 \b2\0020\001:\001\bB\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\t"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/DefaultSelectableOnKeyEvent;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnOnKeyEvent;", "keybindings", "Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;", "<init>", "(Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;)V", "getKeybindings", "()Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;", "Companion", "foundation"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public class DefaultSelectableOnKeyEvent
/*     */   implements SelectableColumnOnKeyEvent
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final SelectableColumnKeybindings keybindings;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public DefaultSelectableOnKeyEvent(@NotNull SelectableColumnKeybindings keybindings) {
/* 175 */     this.keybindings = keybindings; } @NotNull public SelectableColumnKeybindings getKeybindings() { return this.keybindings; } public void onSelectFirstItem(@NotNull List<? extends SelectableLazyListKey> allKeys, @NotNull SelectableLazyListState state) { SelectableColumnOnKeyEvent.DefaultImpls.onSelectFirstItem(this, allKeys, state); } public void onExtendSelectionToFirst(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { SelectableColumnOnKeyEvent.DefaultImpls.onExtendSelectionToFirst(this, keys, state); } public void onSelectLastItem(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { SelectableColumnOnKeyEvent.DefaultImpls.onSelectLastItem(this, keys, state); } public void onExtendSelectionToLastItem(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { SelectableColumnOnKeyEvent.DefaultImpls.onExtendSelectionToLastItem(this, keys, state); } public void onSelectPreviousItem(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { SelectableColumnOnKeyEvent.DefaultImpls.onSelectPreviousItem(this, keys, state); } public void onExtendSelectionWithPreviousItem(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { SelectableColumnOnKeyEvent.DefaultImpls.onExtendSelectionWithPreviousItem(this, keys, state); } public void onSelectNextItem(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { SelectableColumnOnKeyEvent.DefaultImpls.onSelectNextItem(this, keys, state); } public void onExtendSelectionWithNextItem(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { SelectableColumnOnKeyEvent.DefaultImpls.onExtendSelectionWithNextItem(this, keys, state); } public void onScrollPageUpAndSelectItem(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { SelectableColumnOnKeyEvent.DefaultImpls.onScrollPageUpAndSelectItem(this, keys, state); } public void onScrollPageUpAndExtendSelection(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { SelectableColumnOnKeyEvent.DefaultImpls.onScrollPageUpAndExtendSelection(this, keys, state); } public void onScrollPageDownAndSelectItem(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { SelectableColumnOnKeyEvent.DefaultImpls.onScrollPageDownAndSelectItem(this, keys, state); } public void onScrollPageDownAndExtendSelection(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { SelectableColumnOnKeyEvent.DefaultImpls.onScrollPageDownAndExtendSelection(this, keys, state); } public void onEdit() { SelectableColumnOnKeyEvent.DefaultImpls.onEdit(this); } public void onSelectAll(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { SelectableColumnOnKeyEvent.DefaultImpls.onSelectAll(this, keys, state); } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/DefaultSelectableOnKeyEvent$Companion;", "Lorg/jetbrains/jewel/foundation/lazy/DefaultSelectableOnKeyEvent;", "<init>", "()V", "foundation"})
/*     */   public static final class Companion extends DefaultSelectableOnKeyEvent { private Companion() {
/* 177 */       super(DefaultSelectableColumnKeybindings.Companion);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\DefaultSelectableOnKeyEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */