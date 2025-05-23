/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.openapi.editor.EditorCustomElementRenderer;
/*     */ import com.intellij.openapi.editor.Inlay;
/*     */ import com.intellij.util.ui.JBUI;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\b\n\002\b\006\n\002\030\002\n\002\b\002\b\002\030\0002\0020\001B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006B\021\b\026\022\006\020\007\032\0020\004¢\006\004\b\005\020\bJ\024\020\t\032\0020\0042\n\020\n\032\006\022\002\b\0030\013H\026J\024\020\f\032\0020\0042\n\020\n\032\006\022\002\b\0030\013H\026R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator$EmptyWidthInlayRenderer;", "Lcom/intellij/openapi/editor/EditorCustomElementRenderer;", "heightSupplier", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "height", "(I)V", "calcWidthInPixels", "inlay", "Lcom/intellij/openapi/editor/Inlay;", "calcHeightInPixels", "ej-core"})
/*     */ final class EmptyWidthInlayRenderer
/*     */   implements EditorCustomElementRenderer
/*     */ {
/*     */   @NotNull
/*     */   private final Function0<Integer> heightSupplier;
/*     */   
/*     */   public EmptyWidthInlayRenderer(@NotNull Function0<Integer> heightSupplier) {
/* 277 */     this.heightSupplier = heightSupplier;
/* 278 */   } public EmptyWidthInlayRenderer(int height) { this(height::_init_$lambda$0); } private static final int _init_$lambda$0(int $height) { return $height; }
/*     */    public int calcWidthInPixels(@NotNull Inlay inlay) {
/* 280 */     Intrinsics.checkNotNullParameter(inlay, "inlay"); return 0;
/*     */   } public int calcHeightInPixels(@NotNull Inlay inlay) {
/* 282 */     Intrinsics.checkNotNullParameter(inlay, "inlay"); return JBUI.scale(((Number)this.heightSupplier.invoke()).intValue());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalBlocksDecorator$EmptyWidthInlayRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */