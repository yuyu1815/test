/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt;
/*     */ 
/*     */ import androidx.compose.foundation.text.input.TextFieldBuffer;
/*     */ import androidx.compose.foundation.text.input.TextFieldState;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.ui.input.key.Key;
/*     */ import androidx.compose.ui.input.key.KeyEvent;
/*     */ import androidx.compose.ui.input.key.KeyEventType;
/*     */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*     */ import androidx.compose.ui.text.TextRange;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.statistics.CompositeUiAction;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.ClosedRange;
/*     */ import kotlin.ranges.IntRange;
/*     */ import kotlin.ranges.RangesKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nPromptArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromptArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptArea$3$3$1\n+ 2 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,472:1\n175#2,8:473\n*S KotlinDebug\n*F\n+ 1 PromptArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptArea$3$3$1\n*L\n112#1:473,8\n*E\n"})
/*     */ final class PromptAreaKt$PromptArea$3$3$1
/*     */   implements Function1<KeyEvent, Boolean>
/*     */ {
/*     */   public final Boolean invoke-ZmokQxo(Object keyEvent) {
/* 103 */     Intrinsics.checkNotNullParameter(keyEvent, "keyEvent"); if (KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo(keyEvent), KeyEventType.Companion.getKeyDown-CS__XNY()) && !PromptAreaKt.access$PromptArea$lambda$18$lambda$11(this.$hasInputEventSent$delegate)) {
/* 104 */       CompositeUiAction.INSTANCE.logTaskDescriptionInput(this.$model instanceof com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.followup.FollowupViewModel);
/* 105 */       PromptAreaKt.access$PromptArea$lambda$18$lambda$12(this.$hasInputEventSent$delegate, true);
/*     */     } 
/* 107 */     if (!this.$enabled) return Boolean.valueOf(false);
/*     */     
/* 109 */     if (KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo(keyEvent), KeyEventType.Companion.getKeyDown-CS__XNY())) {
/* 110 */       if (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(keyEvent), Key.Companion.getEnter-EK5gGoQ()) && KeyEvent_desktopKt.isShiftPressed-ZmokQxo(keyEvent)) {
/*     */         
/* 112 */         TextFieldState textFieldState1 = this.$textAreaState, textFieldState2 = this.$textAreaState; int $i$f$edit = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 473 */         TextFieldBuffer mutableValue$iv = textFieldState1.startEdit();
/*     */         try {
/* 475 */           TextFieldBuffer $this$invoke_ZmokQxo_u24lambda_u240 = mutableValue$iv; int $i$a$-edit-PromptAreaKt$PromptArea$3$3$1$1 = 0; int start = TextRange.getStart-impl($this$invoke_ZmokQxo_u24lambda_u240.getSelection-d9O1mEE()); int end = TextRange.getEnd-impl($this$invoke_ZmokQxo_u24lambda_u240.getSelection-d9O1mEE()); $this$invoke_ZmokQxo_u24lambda_u240.replace(start, end, "\n"); $this$invoke_ZmokQxo_u24lambda_u240.placeCursorAfterCharAt(RangesKt.coerceIn(start, (ClosedRange)new IntRange(0, textFieldState2.getText().length())));
/* 476 */           textFieldState1.commitEdit(mutableValue$iv);
/*     */         } finally {
/* 478 */           textFieldState1.finishEditing();
/*     */         } 
/*     */         return Boolean.valueOf(true);
/*     */       } 
/*     */       if (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(keyEvent), Key.Companion.getEnter-EK5gGoQ())) {
/*     */         this.$model.submitTask(this.$currentPromptMode);
/*     */         return Boolean.valueOf(true);
/*     */       } 
/*     */     } 
/*     */     return Boolean.valueOf(false);
/*     */   }
/*     */   
/*     */   PromptAreaKt$PromptArea$3$3$1(PromptOwnerViewModel $model, boolean $enabled, TextFieldState $textAreaState, PromptMode $currentPromptMode, MutableState<Boolean> $hasInputEventSent$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\prompt\PromptAreaKt$PromptArea$3$3$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */