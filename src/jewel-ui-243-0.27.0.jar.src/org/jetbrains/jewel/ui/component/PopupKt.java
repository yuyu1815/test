/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.ui.focus.FocusDirection;
/*     */ import androidx.compose.ui.focus.FocusManager;
/*     */ import androidx.compose.ui.input.InputMode;
/*     */ import androidx.compose.ui.input.InputModeManager;
/*     */ import androidx.compose.ui.input.key.Key;
/*     */ import androidx.compose.ui.input.key.KeyEventType;
/*     */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*     */ import androidx.compose.ui.unit.IntRect;
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000*\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\032/\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH\000¢\006\004\b\n\020\013\032\024\020\f\032\0020\r*\0020\r2\006\020\016\032\0020\rH\000¨\006\017"}, d2 = {"handlePopupMenuOnKeyEvent", "", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "inputModeManager", "Landroidx/compose/ui/input/InputModeManager;", "menuManager", "Lorg/jetbrains/jewel/ui/component/MenuManager;", "handlePopupMenuOnKeyEvent-jhbQyNo", "(Ljava/lang/Object;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/input/InputModeManager;Lorg/jetbrains/jewel/ui/component/MenuManager;)Z", "constrainedIn", "Landroidx/compose/ui/unit/IntRect;", "rect", "ui"})
/*     */ public final class PopupKt
/*     */ {
/*     */   public static final boolean handlePopupMenuOnKeyEvent-jhbQyNo(@NotNull Object keyEvent, @NotNull FocusManager focusManager, @NotNull InputModeManager inputModeManager, @NotNull MenuManager menuManager) {
/*  29 */     Intrinsics.checkNotNullParameter(keyEvent, "keyEvent"); Intrinsics.checkNotNullParameter(focusManager, "focusManager"); Intrinsics.checkNotNullParameter(inputModeManager, "inputModeManager"); Intrinsics.checkNotNullParameter(menuManager, "menuManager"); if (!KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo(keyEvent), KeyEventType.Companion.getKeyDown-CS__XNY())) return false;
/*     */     
/*  31 */     long l = KeyEvent_desktopKt.getKey-ZmokQxo(keyEvent);
/*     */     
/*  33 */     inputModeManager.requestInputMode-iuPiT84(InputMode.Companion.getKeyboard-aOaMEAU());
/*  34 */     focusManager.moveFocus-3ESFkO8(FocusDirection.Companion.getNext-dhqQ-8s());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  39 */     inputModeManager.requestInputMode-iuPiT84(InputMode.Companion.getKeyboard-aOaMEAU());
/*  40 */     focusManager.moveFocus-3ESFkO8(FocusDirection.Companion.getPrevious-dhqQ-8s());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  45 */     inputModeManager.requestInputMode-iuPiT84(InputMode.Companion.getKeyboard-aOaMEAU());
/*  46 */     menuManager.closeAll-HMVJIwE(InputMode.Companion.getKeyboard-aOaMEAU(), true);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  52 */     inputModeManager.requestInputMode-iuPiT84(InputMode.Companion.getKeyboard-aOaMEAU());
/*  53 */     menuManager.close-iuPiT84(InputMode.Companion.getKeyboard-aOaMEAU());
/*     */     return Key.equals-impl0(l, Key.Companion.getDirectionDown-EK5gGoQ()) ? true : (Key.equals-impl0(l, Key.Companion.getDirectionUp-EK5gGoQ()) ? true : (Key.equals-impl0(l, Key.Companion.getEscape-EK5gGoQ()) ? true : (Key.equals-impl0(l, Key.Companion.getDirectionLeft-EK5gGoQ()) ? (menuManager.isSubmenu()) : false)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final IntRect constrainedIn(@NotNull IntRect $this$constrainedIn, @NotNull IntRect rect) {
/* 175 */     Intrinsics.checkNotNullParameter($this$constrainedIn, "<this>"); Intrinsics.checkNotNullParameter(rect, "rect"); int x = $this$constrainedIn.getLeft();
/* 176 */     if ($this$constrainedIn.getRight() > rect.getRight()) {
/* 177 */       x = rect.getRight() - $this$constrainedIn.getWidth();
/*     */     }
/* 179 */     if (x < rect.getLeft()) {
/* 180 */       x = rect.getLeft();
/*     */     }
/*     */     
/* 183 */     int y = $this$constrainedIn.getTop();
/* 184 */     if ($this$constrainedIn.getBottom() > rect.getBottom()) {
/* 185 */       y = rect.getBottom() - $this$constrainedIn.getHeight();
/*     */     }
/* 187 */     if (y < rect.getTop()) {
/* 188 */       y = rect.getTop();
/*     */     }
/*     */     
/* 191 */     return new IntRect(x, y, x + $this$constrainedIn.getWidth(), y + $this$constrainedIn.getHeight());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\PopupKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */