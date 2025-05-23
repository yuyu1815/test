/*     */ package ai.grazie.nlp.tokenizer;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\026\020\007\032\b\022\004\022\0020\t0\b2\006\020\n\032\0020\013H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\f"}, d2 = {"Lai/grazie/nlp/tokenizer/JsExportableTokenizerWrapper;", "Lai/grazie/nlp/tokenizer/Tokenizer;", "tokenizer", "Lai/grazie/nlp/tokenizer/JsExportableTokenizer;", "(Lai/grazie/nlp/tokenizer/JsExportableTokenizer;)V", "getTokenizer", "()Lai/grazie/nlp/tokenizer/JsExportableTokenizer;", "tokenize", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "text", "", "nlp-tokenizer"})
/*     */ @SourceDebugExtension({"SMAP\nJsExportableTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsExportableTokenizer.kt\nai/grazie/nlp/tokenizer/JsExportableTokenizerWrapper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,115:1\n11158#2:116\n11493#2,3:117\n*S KotlinDebug\n*F\n+ 1 JsExportableTokenizer.kt\nai/grazie/nlp/tokenizer/JsExportableTokenizerWrapper\n*L\n93#1:116\n93#1:117,3\n*E\n"})
/*     */ final class JsExportableTokenizerWrapper
/*     */   implements Tokenizer
/*     */ {
/*     */   @NotNull
/*     */   private final JsExportableTokenizer tokenizer;
/*     */   
/*     */   public JsExportableTokenizerWrapper(@NotNull JsExportableTokenizer tokenizer) {
/*  91 */     this.tokenizer = tokenizer; } @NotNull public final JsExportableTokenizer getTokenizer() { return this.tokenizer; } @NotNull
/*     */   public List<Tokenizer.Token> tokenize(@NotNull String text) {
/*  93 */     Intrinsics.checkNotNullParameter(text, "text"); JsTokenizerToken[] arrayOfJsTokenizerToken1 = this.tokenizer.tokenize(text); int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     JsTokenizerToken[] arrayOfJsTokenizerToken2 = arrayOfJsTokenizerToken1; Collection<Tokenizer.Token> destination$iv$iv = new ArrayList(arrayOfJsTokenizerToken1.length); int $i$f$mapTo = 0; byte b; int i;
/* 117 */     for (b = 0, i = arrayOfJsTokenizerToken2.length; b < i; ) { Object item$iv$iv = arrayOfJsTokenizerToken2[b];
/* 118 */       Object object1 = item$iv$iv; Collection<Tokenizer.Token> collection = destination$iv$iv; int $i$a$-map-JsExportableTokenizerWrapper$tokenize$1 = 0; collection.add(new Tokenizer.Token(object1.getText(), object1.getInterval())); }
/* 119 */      return (List<Tokenizer.Token>)destination$iv$iv;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\JsExportableTokenizerWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */