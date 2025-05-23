/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ final class null<T>
/*     */   implements FlowCollector
/*     */ {
/*     */   public final Object emit(Interaction interaction, Continuation $completion) {
/* 128 */     Interaction interaction1 = interaction;
/* 129 */     if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { TabsKt.access$TabImpl$lambda$9(this.$tabState$delegate, TabState.copy-59c8LF8$default(TabsKt.access$TabImpl$lambda$8(this.$tabState$delegate), false, false, true, false, false, 27, null)); }
/* 130 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/* 131 */       interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { TabsKt.access$TabImpl$lambda$9(this.$tabState$delegate, TabState.copy-59c8LF8$default(TabsKt.access$TabImpl$lambda$8(this.$tabState$delegate), false, false, false, false, false, 27, null)); }
/* 132 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { TabsKt.access$TabImpl$lambda$9(this.$tabState$delegate, TabState.copy-59c8LF8$default(TabsKt.access$TabImpl$lambda$8(this.$tabState$delegate), false, false, false, true, false, 23, null)); }
/* 133 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { TabsKt.access$TabImpl$lambda$9(this.$tabState$delegate, TabState.copy-59c8LF8$default(TabsKt.access$TabImpl$lambda$8(this.$tabState$delegate), false, false, false, false, false, 23, null)); }
/*     */     
/* 135 */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   null(MutableState<TabState> $tabState$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TabsKt$TabImpl$3$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */