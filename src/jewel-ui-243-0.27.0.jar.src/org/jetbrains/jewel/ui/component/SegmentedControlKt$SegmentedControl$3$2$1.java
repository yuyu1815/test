/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.ui.input.key.Key;
/*    */ import androidx.compose.ui.input.key.KeyEvent;
/*    */ import androidx.compose.ui.input.key.KeyEventType;
/*    */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ final class SegmentedControlKt$SegmentedControl$3$2$1
/*    */   implements Function1<KeyEvent, Boolean>
/*    */ {
/*    */   public final Boolean invoke-ZmokQxo(Object it) {
/* 72 */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     
/* 74 */     if (this.$selectedButtonIndex < this.$buttons.size() - 1) {
/* 75 */       ((SegmentedControlButtonData)this.$buttons.get(this.$selectedButtonIndex + 1)).getOnSelect().invoke();
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 81 */     if (this.$selectedButtonIndex > 0) {
/* 82 */       ((SegmentedControlButtonData)this.$buttons.get(this.$selectedButtonIndex - 1)).getOnSelect().invoke();
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 87 */     return Boolean.valueOf((KeyEventType.equals-impl0(KeyEventType.Companion.getKeyUp-CS__XNY(), KeyEvent_desktopKt.getType-ZmokQxo(it)) && Key.equals-impl0(Key.Companion.getDirectionRight-EK5gGoQ(), KeyEvent_desktopKt.getKey-ZmokQxo(it))) ? true : ((KeyEventType.equals-impl0(KeyEventType.Companion.getKeyUp-CS__XNY(), KeyEvent_desktopKt.getType-ZmokQxo(it)) && Key.equals-impl0(Key.Companion.getDirectionLeft-EK5gGoQ(), KeyEvent_desktopKt.getKey-ZmokQxo(it)))));
/*    */   }
/*    */   
/*    */   SegmentedControlKt$SegmentedControl$3$2$1(int $selectedButtonIndex, List<SegmentedControlButtonData> $buttons) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SegmentedControlKt$SegmentedControl$3$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */