/*     */ package org.jetbrains.jewel.foundation.lazy.tree;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.input.key.KeyEvent;
/*     */ import androidx.compose.ui.input.key.KeyEventType;
/*     */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableColumnKeybindings;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableColumnOnKeyEvent;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListKey;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListState;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectionMode;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\030\002\n\002\020\013\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007JF\020\f\032\023\022\004\022\0020\016\022\004\022\0020\0170\r¢\006\002\b\0202\006\020\021\032\0020\0162\f\020\022\032\b\022\004\022\0020\0240\0232\006\020\025\032\0020\0262\006\020\027\032\0020\030H\026¢\006\004\b\031\020\032R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\b\020\tR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\n\020\013¨\006\033"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewKeyActions;", "Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultSelectableLazyColumnKeyActions;", "keybindings", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeViewKeybindings;", "actions", "Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewOnKeyEvent;", "<init>", "(Lorg/jetbrains/jewel/foundation/lazy/tree/TreeViewKeybindings;Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewOnKeyEvent;)V", "getKeybindings", "()Lorg/jetbrains/jewel/foundation/lazy/tree/TreeViewKeybindings;", "getActions", "()Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewOnKeyEvent;", "handleOnKeyEvent", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "Lkotlin/ExtensionFunctionType;", "event", "keys", "", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;", "state", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;", "selectionMode", "Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;", "handleOnKeyEvent-jhbQyNo", "(Ljava/lang/Object;Ljava/util/List;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;)Lkotlin/jvm/functions/Function1;", "foundation"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class DefaultTreeViewKeyActions
/*     */   extends DefaultSelectableLazyColumnKeyActions
/*     */ {
/*     */   @NotNull
/*     */   private final TreeViewKeybindings keybindings;
/*     */   @NotNull
/*     */   private final DefaultTreeViewOnKeyEvent actions;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @NotNull
/*     */   public TreeViewKeybindings getKeybindings() {
/* 217 */     return this.keybindings; } @NotNull
/* 218 */   public DefaultTreeViewOnKeyEvent getActions() { return this.actions; } public DefaultTreeViewKeyActions(@NotNull TreeViewKeybindings keybindings, @NotNull DefaultTreeViewOnKeyEvent actions) {
/* 219 */     super(keybindings, actions);
/*     */     this.keybindings = keybindings;
/*     */     this.actions = actions;
/*     */   }
/*     */   
/*     */   @NotNull
/* 225 */   public Function1<KeyEvent, Boolean> handleOnKeyEvent-jhbQyNo(@NotNull Object event, @NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state, @NotNull SelectionMode selectionMode) { Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullParameter(keys, "keys"); Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(selectionMode, "selectionMode"); return new DefaultTreeViewKeyActions$handleOnKeyEvent$1(selectionMode, keys, state, event); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/* 226 */   static final class DefaultTreeViewKeyActions$handleOnKeyEvent$1 implements Function1<KeyEvent, Boolean> { public final Boolean invoke-ZmokQxo(Object $this$lambda) { Intrinsics.checkNotNullParameter($this$lambda, "$this$lambda"); if (KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo($this$lambda), KeyEventType.Companion.getKeyUp-CS__XNY())) return Boolean.valueOf(false); 
/* 227 */       Object keyEvent = $this$lambda;
/* 228 */       TreeViewKeybindings treeViewKeybindings1 = DefaultTreeViewKeyActions.this.getKeybindings(); DefaultTreeViewKeyActions defaultTreeViewKeyActions = DefaultTreeViewKeyActions.this; SelectionMode selectionMode = this.$selectionMode; List<SelectableLazyListKey> list = this.$keys; SelectableLazyListState selectableLazyListState = this.$state; Object object1 = this.$event; TreeViewKeybindings $this$invoke_ZmokQxo_u24lambda_u241 = treeViewKeybindings1; int $i$a$-with-DefaultTreeViewKeyActions$handleOnKeyEvent$1$1 = 0;
/* 229 */       DefaultTreeViewOnKeyEvent $this$invoke_ZmokQxo_u24lambda_u241_u24lambda_u240 = defaultTreeViewKeyActions.getActions(); int $i$a$-with-DefaultTreeViewKeyActions$handleOnKeyEvent$1$1$1 = 0;
/* 230 */       if (selectionMode == SelectionMode.None) return Boolean.valueOf(false);
/*     */       
/* 232 */       if ($this$invoke_ZmokQxo_u24lambda_u241.isSelectParent-ZmokQxo($this$lambda)) { $this$invoke_ZmokQxo_u24lambda_u241_u24lambda_u240.onSelectParent(list, selectableLazyListState); }
/* 233 */       else if ($this$invoke_ZmokQxo_u24lambda_u241.isSelectChild-ZmokQxo($this$lambda)) { $this$invoke_ZmokQxo_u24lambda_u241_u24lambda_u240.onSelectChild(list, selectableLazyListState); }
/* 234 */       else { if (((Boolean)defaultTreeViewKeyActions.handleOnKeyEvent-jhbQyNo(object1, list, selectableLazyListState, selectionMode).invoke(KeyEvent.box-impl(keyEvent))).booleanValue()) return Boolean.valueOf(true);
/*     */         
/* 236 */         return Boolean.valueOf(false); }
/*     */ 
/*     */ 
/*     */       
/* 240 */       return Boolean.valueOf(true); }
/*     */ 
/*     */     
/*     */     DefaultTreeViewKeyActions$handleOnKeyEvent$1(SelectionMode $selectionMode, List<SelectableLazyListKey> $keys, SelectableLazyListState $state, Object $event) {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\DefaultTreeViewKeyActions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */