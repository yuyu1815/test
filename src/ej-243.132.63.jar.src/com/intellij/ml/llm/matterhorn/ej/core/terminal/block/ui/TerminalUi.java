/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui;
/*    */ 
/*    */ import com.intellij.openapi.Disposable;
/*    */ import com.intellij.openapi.application.ApplicationManager;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.colors.ColorKey;
/*    */ import com.intellij.openapi.editor.colors.EditorColorsManager;
/*    */ import com.intellij.openapi.editor.colors.EditorColorsScheme;
/*    */ import com.intellij.openapi.editor.ex.EditorEx;
/*    */ import com.intellij.terminal.BlockTerminalColors;
/*    */ import com.intellij.ui.JBColor;
/*    */ import com.intellij.util.ui.JBUI;
/*    */ import java.awt.Color;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\026\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\022\020\033\032\0020\0342\n\b\002\020\035\032\004\030\0010\036J\022\020\037\032\0020\0342\n\b\002\020\035\032\004\030\0010\036J0\020 \032\0020\0342\006\020!\032\0020\"2\n\b\002\020\035\032\004\030\0010\0362\022\020#\032\016\022\004\022\0020%\022\004\022\0020&0$H\002J\022\020'\032\0020(*\0020)2\006\020*\032\0020+J\016\020,\032\0020&2\006\020\035\032\0020\036R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000R\016\020\b\032\0020\005XT¢\006\002\n\000R\016\020\t\032\0020\005XT¢\006\002\n\000R\016\020\n\032\0020\005XT¢\006\002\n\000R\016\020\013\032\0020\005XT¢\006\002\n\000R\016\020\f\032\0020\005XT¢\006\002\n\000R\016\020\r\032\0020\005XT¢\006\002\n\000R\016\020\016\032\0020\005XT¢\006\002\n\000R\016\020\017\032\0020\005XT¢\006\002\n\000R\016\020\020\032\0020\005XT¢\006\002\n\000R\016\020\021\032\0020\005XT¢\006\002\n\000R\016\020\022\032\0020\005XT¢\006\002\n\000R\016\020\023\032\0020\005XT¢\006\002\n\000R\016\020\024\032\0020\005XT¢\006\002\n\000R\016\020\025\032\0020\005XT¢\006\002\n\000R\016\020\026\032\0020\005XT¢\006\002\n\000R\016\020\027\032\0020\005XT¢\006\002\n\000R\016\020\030\032\0020\005XT¢\006\002\n\000R\016\020\031\032\0020\005XT¢\006\002\n\000R\016\020\032\032\0020\005XT¢\006\002\n\000¨\006-"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUi;", "", "<init>", "()V", "blockTopInset", "", "blockBottomInset", "blockLeftInset", "blockRightInset", "cornerToBlockInset", "cornerToBlockOffset", "commandToOutputInset", "blockArc", "blocksGap", "blockSeparatorRightOffset", "blockSelectionSeparatorGap", "errorLineYOffset", "errorLineRightOffset", "errorLineWidth", "errorLineArc", "exitCodeRightInset", "exitCodeTextIconGap", "promptTopInset", "promptBottomInset", "promptToCommandInset", "alternateBufferLeftInset", "searchComponentWidth", "defaultBackground", "Lcom/intellij/ui/JBColor;", "editor", "Lcom/intellij/openapi/editor/Editor;", "defaultForeground", "createColorBoundToColorKey", "colorKey", "Lcom/intellij/openapi/editor/colors/ColorKey;", "default", "Lkotlin/Function1;", "Lcom/intellij/openapi/editor/colors/EditorColorsScheme;", "Ljava/awt/Color;", "useTerminalDefaultBackground", "", "Lcom/intellij/openapi/editor/ex/EditorEx;", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "promptSeparatorColor", "ej-core"})
/*    */ public final class TerminalUi {
/*    */   @NotNull
/*    */   public static final TerminalUi INSTANCE = new TerminalUi();
/*    */   public static final int blockTopInset = 6;
/*    */   public static final int blockBottomInset = 6;
/*    */   public static final int blockLeftInset = 9;
/*    */   public static final int blockRightInset = 12;
/*    */   public static final int cornerToBlockInset = 10;
/*    */   public static final int cornerToBlockOffset = 7;
/*    */   public static final int commandToOutputInset = 2;
/*    */   public static final int blockArc = 8;
/*    */   public static final int blocksGap = 0;
/*    */   public static final int blockSeparatorRightOffset = 19;
/*    */   public static final int blockSelectionSeparatorGap = 1;
/*    */   public static final int errorLineYOffset = 2;
/*    */   public static final int errorLineRightOffset = 9;
/*    */   public static final int errorLineWidth = 3;
/*    */   public static final int errorLineArc = 4;
/*    */   public static final int exitCodeRightInset = 8;
/*    */   public static final int exitCodeTextIconGap = 4;
/*    */   public static final int promptTopInset = 6;
/*    */   public static final int promptBottomInset = 12;
/*    */   public static final int promptToCommandInset = 2;
/*    */   public static final int alternateBufferLeftInset = 4;
/*    */   public static final int searchComponentWidth = 500;
/*    */   
/*    */   @NotNull
/* 48 */   public final JBColor defaultBackground(@Nullable Editor editor) { Intrinsics.checkNotNullExpressionValue(JBColor.lazy(editor::defaultBackground$lambda$0), "lazy(...)"); return JBColor.lazy(editor::defaultBackground$lambda$0); } private static final Color defaultBackground$lambda$0(Editor $editor) {
/* 49 */     if ($editor == null || $editor.getColorsScheme() == null) { $editor.getColorsScheme(); Intrinsics.checkNotNullExpressionValue(EditorColorsManager.getInstance().getGlobalScheme(), "getGlobalScheme(...)"); }  EditorColorsScheme colorsScheme = EditorColorsManager.getInstance().getGlobalScheme();
/* 50 */     return colorsScheme.getDefaultBackground();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final JBColor defaultForeground(@Nullable Editor editor) {
/* 55 */     return createColorBoundToColorKey(BlockTerminalColors.DEFAULT_FOREGROUND, editor, TerminalUi::defaultForeground$lambda$1); } private static final Color defaultForeground$lambda$1(EditorColorsScheme it) {
/* 56 */     Intrinsics.checkNotNullParameter(it, "it"); Intrinsics.checkNotNullExpressionValue(it.getDefaultForeground(), "getDefaultForeground(...)"); return it.getDefaultForeground();
/*    */   }
/*    */   private final JBColor createColorBoundToColorKey(ColorKey colorKey, Editor editor, Function1 default) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: aload_1
/*    */     //   2: aload_3
/*    */     //   3: <illegal opcode> get : (Lcom/intellij/openapi/editor/Editor;Lcom/intellij/openapi/editor/colors/ColorKey;Lkotlin/jvm/functions/Function1;)Ljava/util/function/Supplier;
/*    */     //   8: invokestatic lazy : (Ljava/util/function/Supplier;)Lcom/intellij/ui/JBColor;
/*    */     //   11: dup
/*    */     //   12: ldc 'lazy(...)'
/*    */     //   14: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   17: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #61	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	18	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUi;
/*    */     //   0	18	1	colorKey	Lcom/intellij/openapi/editor/colors/ColorKey;
/*    */     //   0	18	2	editor	Lcom/intellij/openapi/editor/Editor;
/*    */     //   0	18	3	default	Lkotlin/jvm/functions/Function1;
/*    */   }
/*    */   private static final Color createColorBoundToColorKey$lambda$2(Editor $editor, ColorKey $colorKey, Function1 $default) {
/* 62 */     if ($editor == null || $editor.getColorsScheme() == null) { $editor.getColorsScheme(); Intrinsics.checkNotNullExpressionValue(EditorColorsManager.getInstance().getGlobalScheme(), "getGlobalScheme(...)"); }  EditorColorsScheme colorsScheme = EditorColorsManager.getInstance().getGlobalScheme();
/* 63 */     if (colorsScheme.getColor($colorKey) == null) colorsScheme.getColor($colorKey);  return (Color)$default.invoke(colorsScheme);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final void useTerminalDefaultBackground(@NotNull EditorEx $this$useTerminalDefaultBackground, @NotNull Disposable parentDisposable) {
/* 73 */     Intrinsics.checkNotNullParameter($this$useTerminalDefaultBackground, "<this>"); Intrinsics.checkNotNullParameter(parentDisposable, "parentDisposable"); $this$useTerminalDefaultBackground.setBackgroundColor((Color)defaultBackground((Editor)$this$useTerminalDefaultBackground));
/* 74 */     Intrinsics.checkNotNullExpressionValue(EditorColorsManager.TOPIC, "TOPIC"); ApplicationManager.getApplication().getMessageBus().connect(parentDisposable).subscribe(EditorColorsManager.TOPIC, $this$useTerminalDefaultBackground::useTerminalDefaultBackground$lambda$3); } private static final void useTerminalDefaultBackground$lambda$3(EditorEx $this_useTerminalDefaultBackground, EditorColorsScheme it) {
/* 75 */     $this_useTerminalDefaultBackground.setBackgroundColor((Color)INSTANCE.defaultBackground((Editor)$this_useTerminalDefaultBackground));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Color promptSeparatorColor(@NotNull Editor editor) {
/* 80 */     Intrinsics.checkNotNullParameter(editor, "editor"); return (Color)createColorBoundToColorKey(BlockTerminalColors.PROMPT_SEPARATOR_COLOR, editor, TerminalUi::promptSeparatorColor$lambda$4); } private static final Color promptSeparatorColor$lambda$4(EditorColorsScheme it) {
/* 81 */     Intrinsics.checkNotNullParameter(it, "it"); Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.CustomFrameDecorations.separatorForeground(), "separatorForeground(...)"); return JBUI.CurrentTheme.CustomFrameDecorations.separatorForeground();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\bloc\\ui\TerminalUi.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */