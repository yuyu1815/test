/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.ColorFilter;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.SpreadBuilder;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.jewel.ui.component.styling.IconButtonStyle;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ import org.jetbrains.jewel.ui.painter.PainterHint;
/*     */ import org.jetbrains.jewel.ui.painter.hints.DarkAndStrokeKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nToggleableIconActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToggleableIconActionButton.kt\norg/jetbrains/jewel/ui/component/ToggleableIconActionButtonKt$CoreToggleableIconActionButton$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,258:1\n81#2:259\n*S KotlinDebug\n*F\n+ 1 ToggleableIconActionButton.kt\norg/jetbrains/jewel/ui/component/ToggleableIconActionButtonKt$CoreToggleableIconActionButton$1\n*L\n221#1:259\n*E\n"})
/*     */ final class ToggleableIconActionButtonKt$CoreToggleableIconActionButton$1
/*     */   implements Function4<BoxScope, ToggleableIconButtonState, Composer, Integer, Unit>
/*     */ {
/*     */   private static final long invoke__imWzXE$lambda$0(State $strokeColor$delegate) {
/* 221 */     State state = $strokeColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 259 */       (Color)state.getValue()).unbox-impl();
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke--imWzXE(BoxScope $this$ToggleableIconButton, long it, Composer $composer, int $changed) {
/*     */     Intrinsics.checkNotNullParameter($this$ToggleableIconButton, "$this$ToggleableIconButton");
/*     */     int $dirty = $changed;
/*     */     if (($changed & 0x30) == 0)
/*     */       $dirty |= $composer.changed(it) ? 32 : 16; 
/*     */     if (($dirty & 0x91) != 144 || !$composer.getSkipping()) {
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventStart(1119523017, $dirty, -1, "org.jetbrains.jewel.ui.component.CoreToggleableIconActionButton.<anonymous> (ToggleableIconActionButton.kt:220)"); 
/*     */       State<Color> strokeColor$delegate = this.$style.getColors().toggleableForegroundFor-hDcPvVY(it, $composer, 0xE & $dirty >> 3);
/*     */       SpreadBuilder spreadBuilder = new SpreadBuilder(2);
/*     */       spreadBuilder.add(DarkAndStrokeKt.Stroke-8_81llA(invoke__imWzXE$lambda$0(strokeColor$delegate)));
/*     */       spreadBuilder.addSpread(this.$extraHints);
/*     */       PainterHint[] arrayOfPainterHint = (PainterHint[])spreadBuilder.toArray((Object[])new PainterHint[spreadBuilder.size()]);
/*     */       IconKt.Icon(this.$key, this.$contentDescription, (Modifier)null, this.$iconClass, this.$colorFilter, arrayOfPainterHint, $composer, 0, 4);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd(); 
/*     */     } else {
/*     */       $composer.skipToGroupEnd();
/*     */     } 
/*     */   }
/*     */   
/*     */   ToggleableIconActionButtonKt$CoreToggleableIconActionButton$1(IconButtonStyle $style, PainterHint[] $extraHints, IconKey $key, String $contentDescription, Class<?> $iconClass, ColorFilter $colorFilter) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ToggleableIconActionButtonKt$CoreToggleableIconActionButton$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */