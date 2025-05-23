/*    */ package org.jetbrains.jewel.bridge.code.highlighting;
/*    */ 
/*    */ import androidx.compose.ui.text.AnnotatedString;
/*    */ import com.intellij.openapi.editor.colors.EditorColorsScheme;
/*    */ import com.intellij.openapi.fileTypes.SyntaxHighlighter;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ final class null<T>
/*    */   implements FlowCollector
/*    */ {
/*    */   null(FlowCollector<AnnotatedString> $$this$flow, SyntaxHighlighter $highlighter, String $code, EditorColorsScheme $colorScheme) {}
/*    */   
/*    */   public final Object emit(Unit it, Continuation $completion) {
/* 48 */     if (LexerBasedCodeHighlighter.access$highlightAndEmit(LexerBasedCodeHighlighter.this, this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return LexerBasedCodeHighlighter.access$highlightAndEmit(LexerBasedCodeHighlighter.this, this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion);  LexerBasedCodeHighlighter.access$highlightAndEmit(LexerBasedCodeHighlighter.this, this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion); return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\code\highlighting\LexerBasedCodeHighlighter$highlight$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */