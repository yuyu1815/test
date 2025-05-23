/*     */ package org.jetbrains.jewel.foundation.lazy.tree;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.input.key.KeyEvent;
/*     */ import androidx.compose.ui.input.key.KeyEventType;
/*     */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.foundation.lazy.DefaultMacOsSelectableColumnKeybindings;
/*     */ import org.jetbrains.jewel.foundation.lazy.DefaultSelectableColumnKeybindings;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableColumnKeybindings;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableColumnOnKeyEvent;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListKey;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListState;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectionMode;
/*     */ import org.jetbrains.skiko.OsArch_jvmKt;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\030\002\n\002\020\013\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\f\b\027\030\000 #2\0020\001:\001#B\031\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\004\b\006\020\007JF\020\f\032\023\022\004\022\0020\016\022\004\022\0020\0170\r¢\006\002\b\0202\006\020\021\032\0020\0162\f\020\022\032\b\022\004\022\0020\0240\0232\006\020\025\032\0020\0262\006\020\027\032\0020\030H\026¢\006\004\b\031\020\032J9\020\033\032\0020\017*\0020\0162\f\020\022\032\b\022\004\022\0020\0240\0232\006\020\025\032\0020\0262\006\020\027\032\0020\030H\002R\0020\003R\0020\005¢\006\004\b\034\020\035J1\020\036\032\0020\017*\0020\0162\f\020\022\032\b\022\004\022\0020\0240\0232\006\020\025\032\0020\026H\002R\0020\003R\0020\005¢\006\004\b\037\020 J1\020!\032\0020\017*\0020\0162\f\020\022\032\b\022\004\022\0020\0240\0232\006\020\025\032\0020\026H\002R\0020\003R\0020\005¢\006\004\b\"\020 R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\b\020\tR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\n\020\013¨\006$"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultSelectableLazyColumnKeyActions;", "Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;", "keybindings", "Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;", "actions", "Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnOnKeyEvent;", "<init>", "(Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnOnKeyEvent;)V", "getKeybindings", "()Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;", "getActions", "()Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnOnKeyEvent;", "handleOnKeyEvent", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "Lkotlin/ExtensionFunctionType;", "event", "keys", "", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;", "state", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;", "selectionMode", "Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;", "handleOnKeyEvent-jhbQyNo", "(Ljava/lang/Object;Ljava/util/List;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;)Lkotlin/jvm/functions/Function1;", "execute", "execute-yfklwqc", "(Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnOnKeyEvent;Ljava/lang/Object;Ljava/util/List;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;)Z", "handleSingleSelectionEvents", "handleSingleSelectionEvents-MyFupTE", "(Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnOnKeyEvent;Ljava/lang/Object;Ljava/util/List;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;)Z", "handleMultipleSelectionEvents", "handleMultipleSelectionEvents-MyFupTE", "Companion", "foundation"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public class DefaultSelectableLazyColumnKeyActions
/*     */   implements KeyActions
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final SelectableColumnKeybindings keybindings;
/*     */   @NotNull
/*     */   private final SelectableColumnOnKeyEvent actions;
/*     */   public static final int $stable;
/*     */   
/*     */   @NotNull
/*     */   public SelectableColumnKeybindings getKeybindings() {
/*     */     return this.keybindings;
/*     */   }
/*     */   
/*     */   public DefaultSelectableLazyColumnKeyActions(@NotNull SelectableColumnKeybindings keybindings, @NotNull SelectableColumnOnKeyEvent actions) {
/* 245 */     this.keybindings = keybindings;
/* 246 */     this.actions = actions; } @NotNull public SelectableColumnOnKeyEvent getActions() { return this.actions; }
/*     */    @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultSelectableLazyColumnKeyActions$Companion;", "Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultSelectableLazyColumnKeyActions;", "<init>", "()V", "foundation"})
/*     */   public static final class Companion extends DefaultSelectableLazyColumnKeyActions { private Companion() {
/* 249 */       super(
/*     */           
/* 251 */           OsArch_jvmKt.getHostOs().isMacOS() ? (SelectableColumnKeybindings)DefaultMacOsSelectableColumnKeybindings.Companion : 
/* 252 */           (SelectableColumnKeybindings)DefaultSelectableColumnKeybindings.Companion, null, 2, null);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public Function1<KeyEvent, Boolean> handleOnKeyEvent-jhbQyNo(@NotNull Object event, @NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state, @NotNull SelectionMode selectionMode)
/*     */   {
/* 261 */     Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullParameter(keys, "keys"); Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(selectionMode, "selectionMode"); return new DefaultSelectableLazyColumnKeyActions$handleOnKeyEvent$1(this, keys, state); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nKeyActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyActions.kt\norg/jetbrains/jewel/foundation/lazy/tree/DefaultSelectableLazyColumnKeyActions$handleOnKeyEvent$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1#2:322\n*E\n"})
/* 262 */   static final class DefaultSelectableLazyColumnKeyActions$handleOnKeyEvent$1 implements Function1<KeyEvent, Boolean> { public final Boolean invoke-ZmokQxo(Object $this$lambda) { Intrinsics.checkNotNullParameter($this$lambda, "$this$lambda"); if (KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo($this$lambda), KeyEventType.Companion.getKeyUp-CS__XNY()) || this.$selectionMode == SelectionMode.None) return Boolean.valueOf(false); 
/* 263 */       SelectableColumnKeybindings selectableColumnKeybindings1 = DefaultSelectableLazyColumnKeyActions.this.getKeybindings(); DefaultSelectableLazyColumnKeyActions defaultSelectableLazyColumnKeyActions = DefaultSelectableLazyColumnKeyActions.this; List<SelectableLazyListKey> list = this.$keys; SelectableLazyListState selectableLazyListState = this.$state; SelectionMode selectionMode = this.$selectionMode; SelectableColumnKeybindings $this$invoke_ZmokQxo_u24lambda_u241 = selectableColumnKeybindings1;
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
/* 322 */       int $i$a$-with-DefaultSelectableLazyColumnKeyActions$handleOnKeyEvent$1$1 = 0; SelectableColumnOnKeyEvent $this$invoke_ZmokQxo_u24lambda_u241_u24lambda_u240 = defaultSelectableLazyColumnKeyActions.getActions(); int $i$a$-with-DefaultSelectableLazyColumnKeyActions$handleOnKeyEvent$1$1$1 = 0;
/*     */       return Boolean.valueOf(DefaultSelectableLazyColumnKeyActions.access$execute-yfklwqc(defaultSelectableLazyColumnKeyActions, $this$lambda, $this$invoke_ZmokQxo_u24lambda_u241, $this$invoke_ZmokQxo_u24lambda_u241_u24lambda_u240, list, selectableLazyListState, selectionMode)); }
/*     */ 
/*     */     
/*     */     DefaultSelectableLazyColumnKeyActions$handleOnKeyEvent$1(DefaultSelectableLazyColumnKeyActions $receiver, List<SelectableLazyListKey> $keys, SelectableLazyListState $state) {} }
/*     */ 
/*     */   
/*     */   private final boolean execute-yfklwqc(SelectableColumnKeybindings $context_receiver_0, SelectableColumnOnKeyEvent $context_receiver_1, Object $this$execute_u2dyfklwqc, List<? extends SelectableLazyListKey> keys, SelectableLazyListState state, SelectionMode selectionMode) {
/*     */     boolean singleSelectionEventHandled = handleSingleSelectionEvents-MyFupTE($context_receiver_0, $context_receiver_1, $this$execute_u2dyfklwqc, keys, state);
/*     */     if (singleSelectionEventHandled)
/*     */       return true; 
/*     */     if (selectionMode == SelectionMode.Multiple) {
/*     */       boolean multipleSelectionEventHandled = handleMultipleSelectionEvents-MyFupTE($context_receiver_0, $context_receiver_1, $this$execute_u2dyfklwqc, keys, state);
/*     */       if (multipleSelectionEventHandled)
/*     */         return true; 
/*     */     } 
/*     */     return false;
/*     */   }
/*     */   
/*     */   private final boolean handleSingleSelectionEvents-MyFupTE(SelectableColumnKeybindings $context_receiver_0, SelectableColumnOnKeyEvent $context_receiver_1, Object $this$handleSingleSelectionEvents_u2dMyFupTE, List keys, SelectableLazyListState state) {
/*     */     if ($context_receiver_0.isSelectNextItem-ZmokQxo($this$handleSingleSelectionEvents_u2dMyFupTE)) {
/*     */       $context_receiver_1.onSelectNextItem(keys, state);
/*     */     } else if ($context_receiver_0.isSelectPreviousItem-ZmokQxo($this$handleSingleSelectionEvents_u2dMyFupTE)) {
/*     */       $context_receiver_1.onSelectPreviousItem(keys, state);
/*     */     } else if ($context_receiver_0.isSelectFirstItem-ZmokQxo($this$handleSingleSelectionEvents_u2dMyFupTE)) {
/*     */       $context_receiver_1.onSelectFirstItem(keys, state);
/*     */     } else if ($context_receiver_0.isSelectLastItem-ZmokQxo($this$handleSingleSelectionEvents_u2dMyFupTE)) {
/*     */       $context_receiver_1.onSelectLastItem(keys, state);
/*     */     } else if ($context_receiver_0.isEdit-ZmokQxo($this$handleSingleSelectionEvents_u2dMyFupTE)) {
/*     */       $context_receiver_1.onEdit();
/*     */     } else {
/*     */       return false;
/*     */     } 
/*     */     return true;
/*     */   }
/*     */   
/*     */   private final boolean handleMultipleSelectionEvents-MyFupTE(SelectableColumnKeybindings $context_receiver_0, SelectableColumnOnKeyEvent $context_receiver_1, Object $this$handleMultipleSelectionEvents_u2dMyFupTE, List keys, SelectableLazyListState state) {
/*     */     if ($context_receiver_0.isExtendSelectionToFirstItem-ZmokQxo($this$handleMultipleSelectionEvents_u2dMyFupTE)) {
/*     */       $context_receiver_1.onExtendSelectionToFirst(keys, state);
/*     */     } else if ($context_receiver_0.isExtendSelectionToLastItem-ZmokQxo($this$handleMultipleSelectionEvents_u2dMyFupTE)) {
/*     */       $context_receiver_1.onExtendSelectionToLastItem(keys, state);
/*     */     } else if ($context_receiver_0.isExtendSelectionWithNextItem-ZmokQxo($this$handleMultipleSelectionEvents_u2dMyFupTE)) {
/*     */       $context_receiver_1.onExtendSelectionWithNextItem(keys, state);
/*     */     } else if ($context_receiver_0.isExtendSelectionWithPreviousItem-ZmokQxo($this$handleMultipleSelectionEvents_u2dMyFupTE)) {
/*     */       $context_receiver_1.onExtendSelectionWithPreviousItem(keys, state);
/*     */     } else if ($context_receiver_0.isScrollPageDownAndExtendSelection-ZmokQxo($this$handleMultipleSelectionEvents_u2dMyFupTE)) {
/*     */       $context_receiver_1.onScrollPageDownAndExtendSelection(keys, state);
/*     */     } else if ($context_receiver_0.isScrollPageDownAndSelectItem-ZmokQxo($this$handleMultipleSelectionEvents_u2dMyFupTE)) {
/*     */       $context_receiver_1.onScrollPageDownAndSelectItem(keys, state);
/*     */     } else if ($context_receiver_0.isScrollPageUpAndExtendSelection-ZmokQxo($this$handleMultipleSelectionEvents_u2dMyFupTE)) {
/*     */       $context_receiver_1.onScrollPageUpAndExtendSelection(keys, state);
/*     */     } else if ($context_receiver_0.isScrollPageUpAndSelectItem-ZmokQxo($this$handleMultipleSelectionEvents_u2dMyFupTE)) {
/*     */       $context_receiver_1.onScrollPageUpAndSelectItem(keys, state);
/*     */     } else if ($context_receiver_0.isSelectAll-ZmokQxo($this$handleMultipleSelectionEvents_u2dMyFupTE)) {
/*     */       $context_receiver_1.onSelectAll(keys, state);
/*     */     } else {
/*     */       return false;
/*     */     } 
/*     */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\DefaultSelectableLazyColumnKeyActions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */