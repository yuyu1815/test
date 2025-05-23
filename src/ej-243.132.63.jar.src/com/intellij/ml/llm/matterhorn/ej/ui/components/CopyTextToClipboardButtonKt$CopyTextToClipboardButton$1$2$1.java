/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ 
/*    */ import androidx.compose.foundation.layout.SizeKt;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.State;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.jewel.ui.component.IconKt;
/*    */ import org.jetbrains.jewel.ui.icon.IconKey;
/*    */ import org.jetbrains.jewel.ui.icon.IntelliJIconKey;
/*    */ import org.jetbrains.jewel.ui.icons.AllIconsKeys;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nCopyTextToClipboardButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTextToClipboardButton.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,86:1\n149#2:87\n*S KotlinDebug\n*F\n+ 1 CopyTextToClipboardButton.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1$2$1\n*L\n77#1:87\n*E\n"})
/*    */ final class CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1$2$1
/*    */   implements Function2<Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(Composer $composer, int $changed) {
/* 76 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(298552850, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.CopyTextToClipboardButton.<anonymous>.<anonymous>.<anonymous> (CopyTextToClipboardButton.kt:75)"); 
/* 77 */       int $this$dp$iv = 20, $i$f$getDp = 0; Modifier modifier = SizeKt.size-3ABfNKs((Modifier)Modifier.Companion, 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 87 */           Dp.constructor-impl($this$dp$iv));
/*    */       IntelliJIconKey intelliJIconKey = AllIconsKeys.Actions.INSTANCE.getCopy();
/*    */       long l = CopyTextToClipboardButtonKt.access$CopyTextToClipboardButton_SBKQj6I$lambda$6(this.$iconColor$delegate);
/*    */       IconKt.Icon-FHprtrg((IconKey)intelliJIconKey, "copy plan to clipboard", modifier, null, l, new org.jetbrains.jewel.ui.painter.PainterHint[0], $composer, 0x1B0 | IntelliJIconKey.$stable, 8);
/*    */       if (ComposerKt.isTraceInProgress())
/*    */         ComposerKt.traceEventEnd();  }
/*    */     else
/*    */     { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1$2$1(State<Color> $iconColor$delegate) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */