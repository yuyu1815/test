/*     */ package org.jetbrains.jewel.foundation.lazy.tree;
/*     */ 
/*     */ import androidx.compose.ui.input.key.KeyEvent;
/*     */ import androidx.compose.ui.input.key.KeyEventType;
/*     */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */ final class DefaultTreeViewKeyActions$handleOnKeyEvent$1
/*     */   implements Function1<KeyEvent, Boolean>
/*     */ {
/*     */   public final Boolean invoke-ZmokQxo(Object $this$lambda) {
/* 226 */     Intrinsics.checkNotNullParameter($this$lambda, "$this$lambda"); if (KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo($this$lambda), KeyEventType.Companion.getKeyUp-CS__XNY())) return Boolean.valueOf(false); 
/* 227 */     Object keyEvent = $this$lambda;
/* 228 */     TreeViewKeybindings treeViewKeybindings1 = DefaultTreeViewKeyActions.this.getKeybindings(); DefaultTreeViewKeyActions defaultTreeViewKeyActions = DefaultTreeViewKeyActions.this; SelectionMode selectionMode = this.$selectionMode; List<SelectableLazyListKey> list = this.$keys; SelectableLazyListState selectableLazyListState = this.$state; Object object1 = this.$event; TreeViewKeybindings $this$invoke_ZmokQxo_u24lambda_u241 = treeViewKeybindings1; int $i$a$-with-DefaultTreeViewKeyActions$handleOnKeyEvent$1$1 = 0;
/* 229 */     DefaultTreeViewOnKeyEvent $this$invoke_ZmokQxo_u24lambda_u241_u24lambda_u240 = defaultTreeViewKeyActions.getActions(); int $i$a$-with-DefaultTreeViewKeyActions$handleOnKeyEvent$1$1$1 = 0;
/* 230 */     if (selectionMode == SelectionMode.None) return Boolean.valueOf(false);
/*     */     
/* 232 */     if ($this$invoke_ZmokQxo_u24lambda_u241.isSelectParent-ZmokQxo($this$lambda)) { $this$invoke_ZmokQxo_u24lambda_u241_u24lambda_u240.onSelectParent(list, selectableLazyListState); }
/* 233 */     else if ($this$invoke_ZmokQxo_u24lambda_u241.isSelectChild-ZmokQxo($this$lambda)) { $this$invoke_ZmokQxo_u24lambda_u241_u24lambda_u240.onSelectChild(list, selectableLazyListState); }
/* 234 */     else { if (((Boolean)DefaultTreeViewKeyActions.access$handleOnKeyEvent-jhbQyNo$s-263489249(defaultTreeViewKeyActions, object1, list, selectableLazyListState, selectionMode).invoke(KeyEvent.box-impl(keyEvent))).booleanValue()) return Boolean.valueOf(true);
/*     */       
/* 236 */       return Boolean.valueOf(false); }
/*     */ 
/*     */ 
/*     */     
/* 240 */     return Boolean.valueOf(true);
/*     */   }
/*     */   
/*     */   DefaultTreeViewKeyActions$handleOnKeyEvent$1(SelectionMode $selectionMode, List<SelectableLazyListKey> $keys, SelectableLazyListState $state, Object $event) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\DefaultTreeViewKeyActions$handleOnKeyEvent$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */