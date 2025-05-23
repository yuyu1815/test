/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.ui.text.style.TextOverflow;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.jewel.ui.component.TextKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ final class ButtonKt$Button$3
/*     */   implements Function3<RowScope, Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(RowScope $this$DefaultButton, Composer $composer, int $changed) {
/* 178 */     Intrinsics.checkNotNullParameter($this$DefaultButton, "$this$DefaultButton"); int $dirty = $changed; if (($changed & 0x6) == 0) $dirty |= $composer.changed($this$DefaultButton) ? 4 : 2;  if (($dirty & 0x13) != 18 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1313103155, $dirty, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.Button.<anonymous> (Button.kt:177)");  $composer.startReplaceGroup(433197952); if (this.$content != null)
/* 179 */         this.$content.invoke($this$DefaultButton, $composer, Integer.valueOf(0xE & $dirty));  $composer.endReplaceGroup();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 185 */       int i = TextOverflow.Companion.getEllipsis-gIe3tQ8();
/* 186 */       long l = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getButtonTextColor-vNxB06k(this.$primary); TextKt.Text-bAzTDeA(this.$text, null, l, 0L, null, null, null, 0L, null, 0, 0L, i, false, 1, null, null, $composer, 0, 3120, 55290); if (ComposerKt.isTraceInProgress())
/* 187 */         ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   ButtonKt$Button$3(Function3<RowScope, Composer, Integer, Unit> $content, boolean $primary, String $text) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\ButtonKt$Button$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */