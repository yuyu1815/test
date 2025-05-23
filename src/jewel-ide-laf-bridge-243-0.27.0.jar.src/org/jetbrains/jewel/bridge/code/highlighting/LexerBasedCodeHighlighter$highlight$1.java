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
/*    */ @DebugMetadata(f = "LexerBasedCodeHighlighter.kt", l = {47, 48}, i = {0}, s = {"L$0"}, n = {"$this$flow"}, m = "invokeSuspend", c = "org.jetbrains.jewel.bridge.code.highlighting.LexerBasedCodeHighlighter$highlight$1")
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/compose/ui/text/AnnotatedString;"})
/*    */ final class LexerBasedCodeHighlighter$highlight$1
/*    */   extends SuspendLambda
/*    */   implements Function2<FlowCollector<? super AnnotatedString>, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   LexerBasedCodeHighlighter$highlight$1(SyntaxHighlighter $highlighter, String $code, EditorColorsScheme $colorScheme, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     FlowCollector<? super AnnotatedString> flowCollector1, $this$flow;
/* 46 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); flowCollector1 = (FlowCollector)this.L$0;
/* 47 */         this.L$0 = flowCollector1; this.label = 1; if (LexerBasedCodeHighlighter.access$highlightAndEmit(LexerBasedCodeHighlighter.this, flowCollector1, this.$highlighter, this.$code, this.$colorScheme, (Continuation)this) == object) return object;  LexerBasedCodeHighlighter.access$highlightAndEmit(LexerBasedCodeHighlighter.this, flowCollector1, this.$highlighter, this.$code, this.$colorScheme, (Continuation)this);
/* 48 */         this.L$0 = null; this.label = 2; if (LexerBasedCodeHighlighter.access$getReHighlightingRequests$p(LexerBasedCodeHighlighter.this).collect(new FlowCollector(flowCollector1, this.$highlighter, this.$code, this.$colorScheme) { public final Object emit(Unit it, Continuation $completion) { if (LexerBasedCodeHighlighter.access$highlightAndEmit(LexerBasedCodeHighlighter.this, this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return LexerBasedCodeHighlighter.access$highlightAndEmit(LexerBasedCodeHighlighter.this, this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion);  LexerBasedCodeHighlighter.access$highlightAndEmit(LexerBasedCodeHighlighter.this, this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion); return Unit.INSTANCE; } }(Continuation)this) == object) return object;  LexerBasedCodeHighlighter.access$getReHighlightingRequests$p(LexerBasedCodeHighlighter.this).collect(new FlowCollector(flowCollector1, this.$highlighter, this.$code, this.$colorScheme) { public final Object emit(Unit it, Continuation $completion) { if (LexerBasedCodeHighlighter.access$highlightAndEmit(LexerBasedCodeHighlighter.this, this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return LexerBasedCodeHighlighter.access$highlightAndEmit(LexerBasedCodeHighlighter.this, this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion);  LexerBasedCodeHighlighter.access$highlightAndEmit(LexerBasedCodeHighlighter.this, this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion); return Unit.INSTANCE; } }(Continuation)this);
/* 49 */         return Unit.INSTANCE;case 1: $this$flow = (FlowCollector)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.L$0 = null; this.label = 2; if (LexerBasedCodeHighlighter.access$getReHighlightingRequests$p(LexerBasedCodeHighlighter.this).collect(new FlowCollector($this$flow, this.$highlighter, this.$code, this.$colorScheme) { public final Object emit(Unit it, Continuation $completion) { if (LexerBasedCodeHighlighter.access$highlightAndEmit(LexerBasedCodeHighlighter.this, this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return LexerBasedCodeHighlighter.access$highlightAndEmit(LexerBasedCodeHighlighter.this, this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion);  LexerBasedCodeHighlighter.access$highlightAndEmit(LexerBasedCodeHighlighter.this, this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion); return Unit.INSTANCE; } }(Continuation)this) == object) return object;  LexerBasedCodeHighlighter.access$getReHighlightingRequests$p(LexerBasedCodeHighlighter.this).collect(new FlowCollector($this$flow, this.$highlighter, this.$code, this.$colorScheme) { public final Object emit(Unit it, Continuation $completion) { if (LexerBasedCodeHighlighter.access$highlightAndEmit(LexerBasedCodeHighlighter.this, this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return LexerBasedCodeHighlighter.access$highlightAndEmit(LexerBasedCodeHighlighter.this, this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion);  LexerBasedCodeHighlighter.access$highlightAndEmit(LexerBasedCodeHighlighter.this, this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion); return Unit.INSTANCE; } }(Continuation)this); return Unit.INSTANCE;case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super LexerBasedCodeHighlighter$highlight$1> $completion) {
/*    */     LexerBasedCodeHighlighter$highlight$1 lexerBasedCodeHighlighter$highlight$1 = new LexerBasedCodeHighlighter$highlight$1(this.$highlighter, this.$code, this.$colorScheme, $completion);
/*    */     lexerBasedCodeHighlighter$highlight$1.L$0 = value;
/*    */     return (Continuation<Unit>)lexerBasedCodeHighlighter$highlight$1;
/*    */   }
/*    */   
/*    */   public final Object invoke(FlowCollector p1, Continuation<?> p2) {
/*    */     return ((LexerBasedCodeHighlighter$highlight$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\code\highlighting\LexerBasedCodeHighlighter$highlight$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */