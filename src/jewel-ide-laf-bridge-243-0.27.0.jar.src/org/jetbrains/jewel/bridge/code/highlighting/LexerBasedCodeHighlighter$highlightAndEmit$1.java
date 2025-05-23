package org.jetbrains.jewel.bridge.code.highlighting;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "LexerBasedCodeHighlighter.kt", l = {57, 57}, i = {}, s = {}, n = {}, m = "highlightAndEmit", c = "org.jetbrains.jewel.bridge.code.highlighting.LexerBasedCodeHighlighter")
@Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
final class LexerBasedCodeHighlighter$highlightAndEmit$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  LexerBasedCodeHighlighter$highlightAndEmit$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LexerBasedCodeHighlighter.access$highlightAndEmit(LexerBasedCodeHighlighter.this, null, null, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\code\highlighting\LexerBasedCodeHighlighter$highlightAndEmit$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */