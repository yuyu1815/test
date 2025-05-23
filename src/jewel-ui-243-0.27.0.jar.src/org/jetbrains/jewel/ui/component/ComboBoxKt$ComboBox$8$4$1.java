/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.MutableState;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */ final class ComboBoxKt$ComboBox$8$4$1
/*     */   implements Function1<KeyEvent, Boolean>
/*     */ {
/*     */   public final Boolean invoke-ZmokQxo(Object it) {
/* 132 */     Intrinsics.checkNotNullParameter(it, "it"); if (KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo(it), KeyEventType.Companion.getKeyDown-CS__XNY()) && Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(it), Key.Companion.getSpacebar-EK5gGoQ())) {
/* 133 */       ComboBoxKt.access$ComboBox_xYaah8o$setPopupExpanded(this.$onPopupStateChange, this.$popupExpanded$delegate, !ComboBoxKt.access$ComboBox_xYaah8o$lambda$8(this.$popupExpanded$delegate));
/*     */     }
/* 135 */     if (KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo(it), KeyEventType.Companion.getKeyDown-CS__XNY()) && Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(it), Key.Companion.getDirectionDown-EK5gGoQ())) {
/* 136 */       if (ComboBoxKt.access$ComboBox_xYaah8o$lambda$8(this.$popupExpanded$delegate)) {
/* 137 */         this.$onArrowDownPress.invoke();
/*     */       } else {
/* 139 */         ComboBoxKt.access$ComboBox_xYaah8o$setPopupExpanded(this.$onPopupStateChange, this.$popupExpanded$delegate, true);
/*     */       } 
/*     */     }
/* 142 */     if (KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo(it), KeyEventType.Companion.getKeyDown-CS__XNY()) && Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(it), Key.Companion.getDirectionUp-EK5gGoQ()) && ComboBoxKt.access$ComboBox_xYaah8o$lambda$8(this.$popupExpanded$delegate)) {
/* 143 */       this.$onArrowUpPress.invoke();
/*     */     }
/* 145 */     if (KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo(it), KeyEventType.Companion.getKeyDown-CS__XNY()) && Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(it), Key.Companion.getEscape-EK5gGoQ()) && ComboBoxKt.access$ComboBox_xYaah8o$lambda$8(this.$popupExpanded$delegate)) {
/* 146 */       ComboBoxKt.access$ComboBox_xYaah8o$setPopupExpanded(this.$onPopupStateChange, this.$popupExpanded$delegate, false);
/*     */     }
/* 148 */     return Boolean.valueOf(false);
/*     */   }
/*     */   
/*     */   ComboBoxKt$ComboBox$8$4$1(Function0<Unit> $onArrowDownPress, Function0<Unit> $onArrowUpPress, MutableState<Boolean> $popupExpanded$delegate, Function1<Boolean, Unit> $onPopupStateChange) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ComboBoxKt$ComboBox$8$4$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */