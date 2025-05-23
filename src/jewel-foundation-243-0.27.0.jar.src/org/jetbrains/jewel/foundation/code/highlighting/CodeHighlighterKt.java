/*    */ package org.jetbrains.jewel.foundation.code.highlighting;
/*    */ 
/*    */ import androidx.compose.runtime.CompositionLocalKt;
/*    */ import androidx.compose.runtime.ProvidableCompositionLocal;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\b\003\"\027\020\000\032\b\022\004\022\0020\0020\001¢\006\b\n\000\032\004\b\003\020\004¨\006\005"}, d2 = {"LocalCodeHighlighter", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lorg/jetbrains/jewel/foundation/code/highlighting/CodeHighlighter;", "getLocalCodeHighlighter", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "foundation"})
/*    */ public final class CodeHighlighterKt
/*    */ {
/*    */   @NotNull
/* 30 */   private static final ProvidableCompositionLocal<CodeHighlighter> LocalCodeHighlighter = CompositionLocalKt.staticCompositionLocalOf(CodeHighlighterKt::LocalCodeHighlighter$lambda$0); @NotNull public static final ProvidableCompositionLocal<CodeHighlighter> getLocalCodeHighlighter() { return LocalCodeHighlighter; } private static final CodeHighlighter LocalCodeHighlighter$lambda$0() {
/* 31 */     return NoOpCodeHighlighter.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\code\highlighting\CodeHighlighterKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */