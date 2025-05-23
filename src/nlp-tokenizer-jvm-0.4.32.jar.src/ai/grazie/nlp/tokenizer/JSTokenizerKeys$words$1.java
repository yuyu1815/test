/*     */ package ai.grazie.nlp.tokenizer;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\030\n\000\n\002\020\021\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\020\000\032\b\022\004\022\0020\0020\0012\f\020\003\032\b\022\004\022\0020\0050\004H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "", "Lai/grazie/nlp/tokenizer/JsTokenizerToken;", "it", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "invoke", "(Ljava/util/List;)[Lai/grazie/nlp/tokenizer/JsTokenizerToken;"})
/*     */ @SourceDebugExtension({"SMAP\nJsExportableTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsExportableTokenizer.kt\nai/grazie/nlp/tokenizer/JSTokenizerKeys$words$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n1557#2:116\n1628#2,3:117\n37#3:120\n36#3,3:121\n*S KotlinDebug\n*F\n+ 1 JsExportableTokenizer.kt\nai/grazie/nlp/tokenizer/JSTokenizerKeys$words$1\n*L\n77#1:116\n77#1:117,3\n77#1:120\n77#1:121,3\n*E\n"})
/*     */ final class JSTokenizerKeys$words$1
/*     */   extends Lambda
/*     */   implements Function1<List<? extends Tokenizer.Token>, JsTokenizerToken[]>
/*     */ {
/*     */   public static final JSTokenizerKeys$words$1 INSTANCE = new JSTokenizerKeys$words$1();
/*     */   
/*     */   JSTokenizerKeys$words$1() {
/*     */     super(1);
/*     */   }
/*     */   
/*     */   public final JsTokenizerToken[] invoke(List it) {
/*  77 */     Intrinsics.checkNotNullParameter(it, "it"); Iterable $this$map$iv = it; int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     Iterable iterable2 = $this$map$iv; Collection<JsTokenizerToken> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 117 */     for (Object item$iv$iv : iterable2) {
/* 118 */       Tokenizer.Token token = (Tokenizer.Token)item$iv$iv; Collection<JsTokenizerToken> collection = destination$iv$iv; int $i$a$-map-JSTokenizerKeys$words$1$1 = 0; collection.add(new JsTokenizerToken(token.getText(), token.getInterval()));
/* 119 */     }  $this$map$iv = destination$iv$iv;
/*     */     int $i$f$toTypedArray = 0;
/* 121 */     Iterable iterable1 = $this$map$iv;
/*     */     
/* 123 */     return (JsTokenizerToken[])iterable1.toArray((Object[])new JsTokenizerToken[0]);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\JSTokenizerKeys$words$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */