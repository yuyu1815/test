package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;

import com.intellij.openapi.editor.markup.CustomHighlighterRenderer;
import com.intellij.openapi.editor.markup.LineMarkerRenderer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\b`\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\003X¦\004¢\006\006\032\004\b\007\020\005R\022\020\b\032\0020\tX¦\004¢\006\006\032\004\b\n\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockDecorationState;", "", "backgroundRenderer", "Lcom/intellij/openapi/editor/markup/CustomHighlighterRenderer;", "getBackgroundRenderer", "()Lcom/intellij/openapi/editor/markup/CustomHighlighterRenderer;", "cornersRenderer", "getCornersRenderer", "leftAreaRenderer", "Lcom/intellij/openapi/editor/markup/LineMarkerRenderer;", "getLeftAreaRenderer", "()Lcom/intellij/openapi/editor/markup/LineMarkerRenderer;", "ej-core"})
public interface BlockDecorationState {
  @NotNull
  CustomHighlighterRenderer getBackgroundRenderer();
  
  @NotNull
  CustomHighlighterRenderer getCornersRenderer();
  
  @NotNull
  LineMarkerRenderer getLeftAreaRenderer();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\BlockDecorationState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */