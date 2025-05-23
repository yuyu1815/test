/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.ui.focus.FocusManager;
/*    */ import androidx.compose.ui.input.InputModeManager;
/*    */ import androidx.compose.ui.input.key.KeyEvent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nContextMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.kt\norg/jetbrains/jewel/ui/component/ContextMenuKt$ContextMenu$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
/*    */ final class ContextMenuKt$ContextMenu$3$1
/*    */   implements Function1<KeyEvent, Boolean>
/*    */ {
/*    */   public final Boolean invoke-ZmokQxo(Object it) {
/*    */     FocusManager currentFocusManager;
/*    */     InputModeManager currentInputModeManager;
/* 62 */     Intrinsics.checkNotNullParameter(it, "it"); if (ContextMenuKt.access$ContextMenu$lambda$0(this.$focusManager$delegate) == null) { ContextMenuKt.access$ContextMenu$lambda$0(this.$focusManager$delegate);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 97 */       int $i$a$-checkNotNull-ContextMenuKt$ContextMenu$3$1$currentFocusManager$1 = 0; String str = "FocusManager must not be null"; throw new IllegalStateException(str.toString()); }  if (ContextMenuKt.access$ContextMenu$lambda$2(this.$inputModeManager$delegate) == null) { ContextMenuKt.access$ContextMenu$lambda$2(this.$inputModeManager$delegate); int $i$a$-checkNotNull-ContextMenuKt$ContextMenu$3$1$currentInputModeManager$1 = 0;
/*    */       String str = "InputModeManager must not be null";
/*    */       throw new IllegalStateException(str.toString()); }
/*    */     
/*    */     return Boolean.valueOf(PopupKt.handlePopupMenuOnKeyEvent-jhbQyNo(it, currentFocusManager, currentInputModeManager, this.$menuManager));
/*    */   }
/*    */   
/*    */   ContextMenuKt$ContextMenu$3$1(MenuManager $menuManager, MutableState<FocusManager> $focusManager$delegate, MutableState<InputModeManager> $inputModeManager$delegate) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ContextMenuKt$ContextMenu$3$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */