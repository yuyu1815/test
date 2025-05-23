/*     */ package ai.grazie.nlp.tokenizer;
/*     */ 
/*     */ import ai.grazie.text.Text;
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\021\n\002\030\002\n\000\n\002\020\016\n\002\b\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\033\020\007\032\b\022\004\022\0020\t0\b2\006\020\n\032\0020\013H\026¢\006\002\020\fR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\r"}, d2 = {"Lai/grazie/nlp/tokenizer/TokenizerJsExportableWrapper;", "Lai/grazie/nlp/tokenizer/JsExportableTokenizer;", "tokenizer", "Lai/grazie/nlp/tokenizer/Tokenizer;", "(Lai/grazie/nlp/tokenizer/Tokenizer;)V", "getTokenizer", "()Lai/grazie/nlp/tokenizer/Tokenizer;", "tokenize", "", "Lai/grazie/nlp/tokenizer/JsTokenizerToken;", "text", "", "(Ljava/lang/String;)[Lai/grazie/nlp/tokenizer/JsTokenizerToken;", "nlp-tokenizer"})
/*     */ @SourceDebugExtension({"SMAP\nJsExportableTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsExportableTokenizer.kt\nai/grazie/nlp/tokenizer/TokenizerJsExportableWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n1557#2:116\n1628#2,3:117\n37#3:120\n36#3,3:121\n*S KotlinDebug\n*F\n+ 1 JsExportableTokenizer.kt\nai/grazie/nlp/tokenizer/TokenizerJsExportableWrapper\n*L\n85#1:116\n85#1:117,3\n87#1:120\n87#1:121,3\n*E\n"})
/*     */ final class TokenizerJsExportableWrapper
/*     */   implements JsExportableTokenizer
/*     */ {
/*     */   @NotNull
/*     */   private final Tokenizer tokenizer;
/*     */   
/*     */   public TokenizerJsExportableWrapper(@NotNull Tokenizer tokenizer) {
/*  83 */     this.tokenizer = tokenizer; } @NotNull public final Tokenizer getTokenizer() { return this.tokenizer; } @NotNull
/*     */   public JsTokenizerToken[] tokenize(@NotNull String text) {
/*  85 */     Intrinsics.checkNotNullParameter(text, "text"); Iterable<Tokenizer.Token> $this$map$iv = this.tokenizer.tokenize(text); int $i$f$map = 0;
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
/* 116 */     Iterable<Tokenizer.Token> iterable2 = $this$map$iv; Collection<JsTokenizerToken> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 117 */     for (Tokenizer.Token item$iv$iv : iterable2) {
/* 118 */       Tokenizer.Token token1 = item$iv$iv; Collection<JsTokenizerToken> collection = destination$iv$iv; int $i$a$-map-TokenizerJsExportableWrapper$tokenize$1 = 0; collection.add(new JsTokenizerToken(new Text(token1.getToken()), TextRange.Companion.invoke(token1.getRange())));
/* 119 */     }  $this$map$iv = (List)destination$iv$iv;
/*     */     int $i$f$toTypedArray = 0;
/* 121 */     Iterable<Tokenizer.Token> iterable1 = $this$map$iv;
/*     */     
/* 123 */     return iterable1.<JsTokenizerToken>toArray(new JsTokenizerToken[0]);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\TokenizerJsExportableWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */