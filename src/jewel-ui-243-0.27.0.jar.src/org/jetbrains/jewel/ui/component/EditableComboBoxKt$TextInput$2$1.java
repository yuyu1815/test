/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.ui.focus.FocusRequester;
/*     */ import androidx.compose.ui.input.key.Key;
/*     */ import androidx.compose.ui.input.key.KeyEvent;
/*     */ import androidx.compose.ui.input.key.KeyEventType;
/*     */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ final class EditableComboBoxKt$TextInput$2$1
/*     */   implements Function1<KeyEvent, Boolean>
/*     */ {
/*     */   public final Boolean invoke-ZmokQxo(Object it) {
/* 251 */     Intrinsics.checkNotNullParameter(it, "it"); if (!KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo(it), KeyEventType.Companion.getKeyDown-CS__XNY())) return Boolean.valueOf(false);
/*     */ 
/*     */     
/* 254 */     if (this.$popupExpanded) {
/* 255 */       this.$onArrowDownPress.invoke();
/*     */     } else {
/* 257 */       this.$onSetPopupExpanded.invoke(Boolean.valueOf(true));
/* 258 */       this.$textFieldFocusRequester.requestFocus();
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 263 */     if (this.$popupExpanded) {
/* 264 */       this.$onArrowUpPress.invoke();
/*     */     } else {
/* 266 */       this.$textFieldFocusRequester.requestFocus();
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 271 */     if (this.$popupExpanded) {
/* 272 */       this.$onSetPopupExpanded.invoke(Boolean.valueOf(false));
/*     */     }
/* 274 */     this.$onEnterPress.invoke();
/*     */ 
/*     */ 
/*     */     
/* 278 */     this.$onSetPopupExpanded.invoke(Boolean.valueOf(false));
/*     */ 
/*     */     
/* 281 */     return Boolean.valueOf(Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(it), Key.Companion.getDirectionDown-EK5gGoQ()) ? true : (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(it), Key.Companion.getDirectionUp-EK5gGoQ()) ? true : (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(it), Key.Companion.getEnter-EK5gGoQ()) ? true : ((Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(it), Key.Companion.getEscape-EK5gGoQ()) && this.$popupExpanded)))));
/*     */   }
/*     */   
/*     */   EditableComboBoxKt$TextInput$2$1(boolean $popupExpanded, Function0<Unit> $onArrowDownPress, Function1<Boolean, Unit> $onSetPopupExpanded, FocusRequester $textFieldFocusRequester, Function0<Unit> $onArrowUpPress, Function0<Unit> $onEnterPress) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\EditableComboBoxKt$TextInput$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */