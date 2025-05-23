/*    */ package org.jetbrains.jewel.bridge.code.highlighting;
/*    */ 
/*    */ import androidx.compose.ui.text.AnnotatedString;
/*    */ import com.intellij.openapi.editor.colors.EditorColorsScheme;
/*    */ import com.intellij.openapi.fileTypes.SyntaxHighlighter;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
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
/*    */ @DebugMetadata(f = "LexerBasedCodeHighlighter.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.bridge.code.highlighting.LexerBasedCodeHighlighter$highlightAndEmit$2")
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/AnnotatedString;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class LexerBasedCodeHighlighter$highlightAndEmit$2
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super AnnotatedString>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   LexerBasedCodeHighlighter$highlightAndEmit$2(SyntaxHighlighter $highlighter, String $code, EditorColorsScheme $colorScheme, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 57 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return LexerBasedCodeHighlighter.access$doHighlight(LexerBasedCodeHighlighter.this, this.$highlighter, this.$code, this.$colorScheme); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super LexerBasedCodeHighlighter$highlightAndEmit$2> $completion) {
/*    */     return (Continuation<Unit>)new LexerBasedCodeHighlighter$highlightAndEmit$2(this.$highlighter, this.$code, this.$colorScheme, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((LexerBasedCodeHighlighter$highlightAndEmit$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\code\highlighting\LexerBasedCodeHighlighter$highlightAndEmit$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */