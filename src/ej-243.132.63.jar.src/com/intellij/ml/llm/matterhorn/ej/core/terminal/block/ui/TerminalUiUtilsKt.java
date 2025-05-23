/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui;
/*     */ 
/*     */ import com.intellij.ide.ui.AntialiasingType;
/*     */ import com.intellij.ide.ui.UISettings;
/*     */ import com.intellij.openapi.application.ApplicationManager;
/*     */ import com.intellij.openapi.application.ModalityState;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.colors.EditorFontType;
/*     */ import com.intellij.openapi.editor.impl.FontInfo;
/*     */ import com.intellij.openapi.editor.impl.view.FontLayoutService;
/*     */ import com.intellij.util.DocumentUtil;
/*     */ import com.jediterm.terminal.model.CharBuffer;
/*     */ import java.awt.FontMetrics;
/*     */ import java.awt.font.FontRenderContext;
/*     */ import java.awt.geom.Dimension2D;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000<\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\016\n\002\030\002\n\000\032\f\020\000\032\0020\001*\0020\002H\000\032,\020\003\032\0020\0042\020\b\002\020\005\032\n\022\004\022\0020\007\030\0010\0062\b\b\002\020\b\032\0020\t2\006\020\n\032\0020\013H\000\032,\020\f\032\0020\0042\020\b\002\020\005\032\n\022\004\022\0020\007\030\0010\0062\b\b\002\020\b\032\0020\t2\006\020\n\032\0020\013H\000\032\022\020\r\032\b\022\004\022\0020\0070\006*\0020\002H\000\032-\020\016\032\002H\017\"\006\b\000\020\017\030\001*\0020\0202\016\b\004\020\021\032\b\022\004\022\002H\0170\006H\bø\001\000¢\006\002\020\022\032\f\020\023\032\0020\024*\0020\025H\000\002\007\n\005\b20\001¨\006\026"}, d2 = {"getCharSize", "Ljava/awt/geom/Dimension2D;", "Lcom/intellij/openapi/editor/Editor;", "invokeLater", "", "expired", "Lkotlin/Function0;", "", "modalityState", "Lcom/intellij/openapi/application/ModalityState;", "runnable", "Ljava/lang/Runnable;", "invokeLaterIfNeeded", "getDisposed", "executeInBulk", "T", "Lcom/intellij/openapi/editor/Document;", "block", "(Lcom/intellij/openapi/editor/Document;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "normalize", "", "Lcom/jediterm/terminal/model/CharBuffer;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalUiUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUiUtilsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,323:1\n507#2,5:324\n*S KotlinDebug\n*F\n+ 1 TerminalUiUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUiUtilsKt\n*L\n321#1:324,5\n*E\n"})
/*     */ public final class TerminalUiUtilsKt
/*     */ {
/*     */   @NotNull
/*     */   public static final Dimension2D getCharSize(@NotNull Editor $this$getCharSize) {
/* 262 */     Intrinsics.checkNotNullParameter($this$getCharSize, "<this>"); FontRenderContext baseContext = FontInfo.getFontRenderContext($this$getCharSize.getContentComponent());
/* 263 */     FontRenderContext context = new FontRenderContext(baseContext.getTransform(), 
/* 264 */         AntialiasingType.getKeyForCurrentScope(true), 
/* 265 */         UISettings.Companion.getEditorFractionalMetricsHint());
/* 266 */     Intrinsics.checkNotNullExpressionValue(FontInfo.getFontMetrics($this$getCharSize.getColorsScheme().getFont(EditorFontType.PLAIN), context), "getFontMetrics(...)"); FontMetrics fontMetrics = FontInfo.getFontMetrics($this$getCharSize.getColorsScheme().getFont(EditorFontType.PLAIN), context);
/* 267 */     float width = FontLayoutService.Companion.getInstance().charWidth2D(fontMetrics, 32);
/* 268 */     return new Dimension2DDouble(width, $this$getCharSize.getLineHeight());
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
/*     */   public static final void invokeLater(@Nullable Function0 expired, @NotNull ModalityState modalityState, @NotNull Runnable runnable) {
/* 286 */     Intrinsics.checkNotNullParameter(modalityState, "modalityState"); Intrinsics.checkNotNullParameter(runnable, "runnable"); if (expired != null) {
/* 287 */       ApplicationManager.getApplication().invokeLater(runnable, modalityState, expired::invokeLater$lambda$0);
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 292 */       ApplicationManager.getApplication().invokeLater(runnable, modalityState);
/*     */     } 
/*     */   }
/*     */   private static final boolean invokeLater$lambda$0(Function0 $expired, Object it) {
/*     */     return ((Boolean)$expired.invoke()).booleanValue();
/*     */   }
/*     */   
/*     */   public static final void invokeLaterIfNeeded(@Nullable Function0<Boolean> expired, @NotNull ModalityState modalityState, @NotNull Runnable runnable) {
/* 300 */     Intrinsics.checkNotNullParameter(modalityState, "modalityState"); Intrinsics.checkNotNullParameter(runnable, "runnable"); if (ApplicationManager.getApplication().isDispatchThread()) {
/* 301 */       runnable.run();
/*     */     } else {
/*     */       
/* 304 */       invokeLater(expired, modalityState, runnable);
/*     */     } 
/*     */   }
/*     */   @NotNull
/* 308 */   public static final Function0<Boolean> getDisposed(@NotNull Editor $this$getDisposed) { Intrinsics.checkNotNullParameter($this$getDisposed, "<this>"); return $this$getDisposed::getDisposed$lambda$1; } private static final boolean getDisposed$lambda$1(Editor $this_getDisposed) { return $this_getDisposed.isDisposed(); }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 176)
/*     */   public static final class TerminalUiUtilsKt$executeInBulk$1 implements Runnable { public TerminalUiUtilsKt$executeInBulk$1(Ref.ObjectRef<T> $result, Function0<T> $block) {}
/*     */     public final void run() {
/* 313 */       this.$result.element = this.$block.invoke();
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final String normalize(@NotNull CharBuffer $this$normalize) {
/* 320 */     Intrinsics.checkNotNullParameter($this$normalize, "<this>"); Intrinsics.checkNotNullExpressionValue($this$normalize.toString(), "toString(...)"); String s = $this$normalize.toString();
/* 321 */     if (StringsKt.contains$default(s, '', false, 2, null)) { CharSequence charSequence = s; Appendable destination$iv = new StringBuilder(s.length() - 1); int $i$f$filterTo = 0;
/*     */ 
/*     */       
/* 324 */       for (int index$iv = 0, i = charSequence.length(); index$iv < i; index$iv++) {
/* 325 */         char element$iv = charSequence.charAt(index$iv);
/* 326 */         char it = element$iv; int $i$a$-filterTo-TerminalUiUtilsKt$normalize$1 = 0; if ((it != '')) destination$iv.append(element$iv); 
/*     */       } 
/* 328 */       Intrinsics.checkNotNullExpressionValue(((StringBuilder)destination$iv).toString(), "toString(...)"); }
/*     */     else
/*     */     {  }
/*     */     
/*     */     return s;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\bloc\\ui\TerminalUiUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */