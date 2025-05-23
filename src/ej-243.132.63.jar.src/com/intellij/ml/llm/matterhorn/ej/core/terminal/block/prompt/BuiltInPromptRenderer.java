/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.EmptyTextAttributesProvider;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TextAttributesProvider;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TextWithAttributes;
/*    */ import java.util.List;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\000\b\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\026\020\f\032\b\022\004\022\0020\0160\r2\006\020\n\032\0020\013H\002J\020\020\017\032\0020\0202\006\020\021\032\0020\020H\002J\020\020\022\032\0020\0232\006\020\024\032\0020\025H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/BuiltInPromptRenderer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderer;", "colorPalette", "Lcom/intellij/terminal/TerminalColorPalette;", "isSingleLine", "", "<init>", "(Lcom/intellij/terminal/TerminalColorPalette;Z)V", "calculateRenderingInfo", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;", "state", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptState;", "getPromptComponents", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithAttributes;", "calculateDirectoryText", "", "directory", "plainAttributes", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;", "colorIndex", "", "ej-core"})
/*    */ public final class BuiltInPromptRenderer implements TerminalPromptRenderer {
/*    */   @NotNull
/*    */   private final TerminalColorPalette colorPalette;
/*    */   
/*    */   public BuiltInPromptRenderer(@NotNull TerminalColorPalette colorPalette, boolean isSingleLine) {
/* 13 */     this.colorPalette = colorPalette;
/* 14 */     this.isSingleLine = isSingleLine;
/*    */   } private final boolean isSingleLine; @NotNull
/*    */   public TerminalPromptRenderingInfo calculateRenderingInfo(@NotNull TerminalPromptState state) {
/* 17 */     Intrinsics.checkNotNullParameter(state, "state"); TextWithHighlightings content = TerminalTextHighlighterKt.toTextWithHighlightings(getPromptComponents(state));
/* 18 */     return new TerminalPromptRenderingInfo(content.getText(), content.getHighlightings(), null, null, 12, null);
/*    */   }
/*    */   
/*    */   private final List<TextWithAttributes> getPromptComponents(TerminalPromptState state) {
/* 22 */     List<TextWithAttributes> result = new ArrayList();
/* 23 */     TextAttributesProvider greenAttributes = plainAttributes(2);
/* 24 */     TextAttributesProvider yellowAttributes = plainAttributes(3);
/* 25 */     EmptyTextAttributesProvider defaultAttributes = EmptyTextAttributesProvider.INSTANCE;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 31 */     CharSequence charSequence = state.getVirtualEnv(); if (!((charSequence == null || StringsKt.isBlank(charSequence)) ? 1 : 0)) {
/* 32 */       Intrinsics.checkNotNullExpressionValue(PathUtil.getFileName(state.getVirtualEnv()), "getFileName(...)"); String venvName = PathUtil.getFileName(state.getVirtualEnv());
/* 33 */       getPromptComponents$addComponent(result, "(" + venvName + ")", greenAttributes);
/*    */     } 
/* 35 */     charSequence = state.getCondaEnv(); if (!((charSequence == null || StringsKt.isBlank(charSequence)) ? 1 : 0)) {
/* 36 */       getPromptComponents$addComponent(result, "(" + state.getCondaEnv() + ")", greenAttributes);
/*    */     }
/* 38 */     if (!result.isEmpty()) {
/* 39 */       getPromptComponents$addComponent(result, " ", (TextAttributesProvider)defaultAttributes);
/*    */     }
/* 41 */     getPromptComponents$addComponent(result, calculateDirectoryText(state.getCurrentDirectory()), (TextAttributesProvider)defaultAttributes);
/* 42 */     charSequence = state.getGitBranch(); if (!((charSequence == null || StringsKt.isBlank(charSequence)) ? 1 : 0)) {
/* 43 */       getPromptComponents$addComponent(result, " ", (TextAttributesProvider)defaultAttributes);
/* 44 */       getPromptComponents$addComponent(result, "git:", yellowAttributes);
/* 45 */       getPromptComponents$addComponent(result, "[" + state.getGitBranch() + "]", greenAttributes);
/*    */     } 
/* 47 */     String promptInputSeparator = this.isSingleLine ? " " : "\n";
/* 48 */     getPromptComponents$addComponent(result, promptInputSeparator, (TextAttributesProvider)defaultAttributes);
/* 49 */     return result;
/*    */   } private static final void getPromptComponents$addComponent(List<TextWithAttributes> result, String text, TextAttributesProvider attributesProvider) {
/*    */     result.add(new TextWithAttributes(text, attributesProvider));
/*    */   } private final String calculateDirectoryText(String directory) {
/* 53 */     String str = 
/* 54 */       FileUtil.getLocationRelativeToUserHome(directory, false);
/*    */     Intrinsics.checkNotNull(str);
/* 56 */     return !Intrinsics.areEqual(directory, SystemProperties.getUserHome()) ? str : "~";
/*    */   }
/*    */   
/*    */   private final TextAttributesProvider plainAttributes(int colorIndex) {
/* 60 */     return TerminalUiUtils.INSTANCE.plainAttributesProvider(colorIndex, this.colorPalette);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\BuiltInPromptRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */