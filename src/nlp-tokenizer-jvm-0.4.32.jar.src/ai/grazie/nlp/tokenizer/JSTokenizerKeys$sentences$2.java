/*     */ package ai.grazie.nlp.tokenizer;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\030\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\002\020\000\032\b\022\004\022\0020\0020\0012\f\020\003\032\b\022\004\022\0020\0050\004H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "it", "", "Lai/grazie/nlp/tokenizer/JsTokenizerToken;", "invoke", "([Lai/grazie/nlp/tokenizer/JsTokenizerToken;)Ljava/util/List;"})
/*     */ @SourceDebugExtension({"SMAP\nJsExportableTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsExportableTokenizer.kt\nai/grazie/nlp/tokenizer/JSTokenizerKeys$sentences$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,115:1\n11158#2:116\n11493#2,3:117\n*S KotlinDebug\n*F\n+ 1 JsExportableTokenizer.kt\nai/grazie/nlp/tokenizer/JSTokenizerKeys$sentences$2\n*L\n72#1:116\n72#1:117,3\n*E\n"})
/*     */ final class JSTokenizerKeys$sentences$2
/*     */   extends Lambda
/*     */   implements Function1<JsTokenizerToken[], List<? extends Tokenizer.Token>>
/*     */ {
/*     */   public static final JSTokenizerKeys$sentences$2 INSTANCE = new JSTokenizerKeys$sentences$2();
/*     */   
/*     */   JSTokenizerKeys$sentences$2() {
/*     */     super(1);
/*     */   }
/*     */   
/*     */   public final List<Tokenizer.Token> invoke(JsTokenizerToken[] it) {
/*  72 */     Intrinsics.checkNotNullParameter(it, "it"); JsTokenizerToken[] arrayOfJsTokenizerToken1 = it; int $i$f$map = 0;
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
/* 116 */     JsTokenizerToken[] arrayOfJsTokenizerToken2 = arrayOfJsTokenizerToken1; Collection<Tokenizer.Token> destination$iv$iv = new ArrayList(arrayOfJsTokenizerToken1.length); int $i$f$mapTo = 0; byte b; int i;
/* 117 */     for (b = 0, i = arrayOfJsTokenizerToken2.length; b < i; ) { Object item$iv$iv = arrayOfJsTokenizerToken2[b];
/* 118 */       Object object1 = item$iv$iv; Collection<Tokenizer.Token> collection = destination$iv$iv; int $i$a$-map-JSTokenizerKeys$sentences$2$1 = 0; collection.add(new Tokenizer.Token(object1.getText(), object1.getInterval())); }
/* 119 */      return (List<Tokenizer.Token>)destination$iv$iv;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\JSTokenizerKeys$sentences$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */