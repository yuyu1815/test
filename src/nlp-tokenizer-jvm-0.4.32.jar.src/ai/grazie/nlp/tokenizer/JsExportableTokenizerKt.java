/*     */ package ai.grazie.nlp.tokenizer;
/*     */ 
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\b\002\032\n\020\000\032\0020\001*\0020\002\032\n\020\003\032\0020\002*\0020\001¨\006\004"}, d2 = {"fromExportable", "Lai/grazie/nlp/tokenizer/Tokenizer;", "Lai/grazie/nlp/tokenizer/JsExportableTokenizer;", "toExportable", "nlp-tokenizer"})
/*     */ public final class JsExportableTokenizerKt
/*     */ {
/*     */   @NotNull
/*     */   public static final JsExportableTokenizer toExportable(@NotNull Tokenizer $this$toExportable) {
/* 101 */     Intrinsics.checkNotNullParameter($this$toExportable, "<this>"); return ($this$toExportable instanceof JsExportableTokenizerWrapper) ? (
/* 102 */       (JsExportableTokenizerWrapper)$this$toExportable).getTokenizer() : 
/*     */       
/* 104 */       new TokenizerJsExportableWrapper($this$toExportable);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Tokenizer fromExportable(@NotNull JsExportableTokenizer $this$fromExportable) {
/* 109 */     Intrinsics.checkNotNullParameter($this$fromExportable, "<this>"); return ($this$fromExportable instanceof TokenizerJsExportableWrapper) ? (
/* 110 */       (TokenizerJsExportableWrapper)$this$fromExportable).getTokenizer() : 
/*     */       
/* 112 */       new JsExportableTokenizerWrapper($this$fromExportable);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\JsExportableTokenizerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */