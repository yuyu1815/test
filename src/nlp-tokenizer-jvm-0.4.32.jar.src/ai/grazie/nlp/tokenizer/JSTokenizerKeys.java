/*     */ package ai.grazie.nlp.tokenizer;
/*     */ 
/*     */ import ai.grazie.DataHolder;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020 \n\002\030\002\n\002\020\021\n\002\030\002\n\002\b\005\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R)\020\003\032\032\022\n\022\b\022\004\022\0020\0060\005\022\n\022\b\022\004\022\0020\b0\0070\004¢\006\b\n\000\032\004\b\t\020\nR)\020\013\032\032\022\n\022\b\022\004\022\0020\0060\005\022\n\022\b\022\004\022\0020\b0\0070\004¢\006\b\n\000\032\004\b\f\020\n¨\006\r"}, d2 = {"Lai/grazie/nlp/tokenizer/JSTokenizerKeys;", "", "()V", "sentences", "Lai/grazie/DataHolder$TransformingKey;", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "", "Lai/grazie/nlp/tokenizer/JsTokenizerToken;", "getSentences", "()Lai/grazie/DataHolder$TransformingKey;", "words", "getWords", "nlp-tokenizer"})
/*     */ public final class JSTokenizerKeys
/*     */ {
/*     */   @NotNull
/*  69 */   public static final JSTokenizerKeys INSTANCE = new JSTokenizerKeys(); @NotNull private static final DataHolder.TransformingKey<List<Tokenizer.Token>, JsTokenizerToken[]> sentences = new DataHolder.TransformingKey(
/*  70 */       Tokenizer.Keys.getSentences(), 
/*  71 */       JSTokenizerKeys$sentences$1.INSTANCE, 
/*  72 */       JSTokenizerKeys$sentences$2.INSTANCE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final DataHolder.TransformingKey<List<Tokenizer.Token>, JsTokenizerToken[]> getSentences() {
/*     */     return sentences;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\030\n\000\n\002\020\021\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\020\000\032\b\022\004\022\0020\0020\0012\f\020\003\032\b\022\004\022\0020\0050\004H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "", "Lai/grazie/nlp/tokenizer/JsTokenizerToken;", "it", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "invoke", "(Ljava/util/List;)[Lai/grazie/nlp/tokenizer/JsTokenizerToken;"})
/*     */   @SourceDebugExtension({"SMAP\nJsExportableTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsExportableTokenizer.kt\nai/grazie/nlp/tokenizer/JSTokenizerKeys$sentences$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n1557#2:116\n1628#2,3:117\n37#3:120\n36#3,3:121\n*S KotlinDebug\n*F\n+ 1 JsExportableTokenizer.kt\nai/grazie/nlp/tokenizer/JSTokenizerKeys$sentences$1\n*L\n71#1:116\n71#1:117,3\n71#1:120\n71#1:121,3\n*E\n"})
/*     */   static final class JSTokenizerKeys$sentences$1
/*     */     extends Lambda
/*     */     implements Function1<List<? extends Tokenizer.Token>, JsTokenizerToken[]>
/*     */   {
/*     */     public static final JSTokenizerKeys$sentences$1 INSTANCE = new JSTokenizerKeys$sentences$1();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     JSTokenizerKeys$sentences$1() {
/*     */       super(1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final JsTokenizerToken[] invoke(List it)
/*     */     {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       Iterable $this$map$iv = it;
/*     */       int $i$f$map = 0;
/* 116 */       Iterable iterable2 = $this$map$iv; Collection<JsTokenizerToken> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 117 */       for (Object item$iv$iv : iterable2) {
/* 118 */         Tokenizer.Token token = (Tokenizer.Token)item$iv$iv; Collection<JsTokenizerToken> collection = destination$iv$iv; int $i$a$-map-JSTokenizerKeys$sentences$1$1 = 0; collection.add(new JsTokenizerToken(token.getText(), token.getInterval()));
/* 119 */       }  $this$map$iv = destination$iv$iv;
/*     */       int $i$f$toTypedArray = 0;
/* 121 */       Iterable iterable1 = $this$map$iv;
/*     */       
/* 123 */       return (JsTokenizerToken[])iterable1.toArray((Object[])new JsTokenizerToken[0]); } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\030\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\002\020\000\032\b\022\004\022\0020\0020\0012\f\020\003\032\b\022\004\022\0020\0050\004H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "it", "", "Lai/grazie/nlp/tokenizer/JsTokenizerToken;", "invoke", "([Lai/grazie/nlp/tokenizer/JsTokenizerToken;)Ljava/util/List;"}) @SourceDebugExtension({"SMAP\nJsExportableTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsExportableTokenizer.kt\nai/grazie/nlp/tokenizer/JSTokenizerKeys$sentences$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,115:1\n11158#2:116\n11493#2,3:117\n*S KotlinDebug\n*F\n+ 1 JsExportableTokenizer.kt\nai/grazie/nlp/tokenizer/JSTokenizerKeys$sentences$2\n*L\n72#1:116\n72#1:117,3\n*E\n"}) static final class JSTokenizerKeys$sentences$2 extends Lambda implements Function1<JsTokenizerToken[], List<? extends Tokenizer.Token>> { public static final JSTokenizerKeys$sentences$2 INSTANCE = new JSTokenizerKeys$sentences$2(); JSTokenizerKeys$sentences$2() { super(1); } public final List<Tokenizer.Token> invoke(JsTokenizerToken[] it) { Intrinsics.checkNotNullParameter(it, "it"); JsTokenizerToken[] arrayOfJsTokenizerToken1 = it; int $i$f$map = 0; JsTokenizerToken[] arrayOfJsTokenizerToken2 = arrayOfJsTokenizerToken1; Collection<Tokenizer.Token> destination$iv$iv = new ArrayList(arrayOfJsTokenizerToken1.length); int $i$f$mapTo = 0; byte b; int i; for (b = 0, i = arrayOfJsTokenizerToken2.length; b < i; ) { Object item$iv$iv = arrayOfJsTokenizerToken2[b]; Object object1 = item$iv$iv; Collection<Tokenizer.Token> collection = destination$iv$iv; int $i$a$-map-JSTokenizerKeys$sentences$2$1 = 0; collection.add(new Tokenizer.Token(object1.getText(), object1.getInterval())); }  return (List<Tokenizer.Token>)destination$iv$iv; } } @NotNull private static final DataHolder.TransformingKey<List<Tokenizer.Token>, JsTokenizerToken[]> words = new DataHolder.TransformingKey(Tokenizer.Keys.getWords(), JSTokenizerKeys$words$1.INSTANCE, JSTokenizerKeys$words$2.INSTANCE); @NotNull public final DataHolder.TransformingKey<List<Tokenizer.Token>, JsTokenizerToken[]> getWords() { return words; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\030\n\000\n\002\020\021\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\020\000\032\b\022\004\022\0020\0020\0012\f\020\003\032\b\022\004\022\0020\0050\004H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "", "Lai/grazie/nlp/tokenizer/JsTokenizerToken;", "it", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "invoke", "(Ljava/util/List;)[Lai/grazie/nlp/tokenizer/JsTokenizerToken;"}) @SourceDebugExtension({"SMAP\nJsExportableTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsExportableTokenizer.kt\nai/grazie/nlp/tokenizer/JSTokenizerKeys$words$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n1557#2:116\n1628#2,3:117\n37#3:120\n36#3,3:121\n*S KotlinDebug\n*F\n+ 1 JsExportableTokenizer.kt\nai/grazie/nlp/tokenizer/JSTokenizerKeys$words$1\n*L\n77#1:116\n77#1:117,3\n77#1:120\n77#1:121,3\n*E\n"}) static final class JSTokenizerKeys$words$1 extends Lambda implements Function1<List<? extends Tokenizer.Token>, JsTokenizerToken[]> { public final JsTokenizerToken[] invoke(List it) { Intrinsics.checkNotNullParameter(it, "it"); Iterable $this$map$iv = it; int $i$f$map = 0; Iterable iterable2 = $this$map$iv; Collection<JsTokenizerToken> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0; for (Object item$iv$iv : iterable2) { Tokenizer.Token token = (Tokenizer.Token)item$iv$iv; Collection<JsTokenizerToken> collection = destination$iv$iv; int $i$a$-map-JSTokenizerKeys$words$1$1 = 0; collection.add(new JsTokenizerToken(token.getText(), token.getInterval())); }  $this$map$iv = destination$iv$iv; int $i$f$toTypedArray = 0; Iterable iterable1 = $this$map$iv; return (JsTokenizerToken[])iterable1.toArray((Object[])new JsTokenizerToken[0]); }
/*     */ 
/*     */     
/*     */     public static final JSTokenizerKeys$words$1 INSTANCE = new JSTokenizerKeys$words$1();
/*     */     
/*     */     JSTokenizerKeys$words$1() {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\030\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\002\020\000\032\b\022\004\022\0020\0020\0012\f\020\003\032\b\022\004\022\0020\0050\004H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "it", "", "Lai/grazie/nlp/tokenizer/JsTokenizerToken;", "invoke", "([Lai/grazie/nlp/tokenizer/JsTokenizerToken;)Ljava/util/List;"})
/*     */   @SourceDebugExtension({"SMAP\nJsExportableTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsExportableTokenizer.kt\nai/grazie/nlp/tokenizer/JSTokenizerKeys$words$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,115:1\n11158#2:116\n11493#2,3:117\n*S KotlinDebug\n*F\n+ 1 JsExportableTokenizer.kt\nai/grazie/nlp/tokenizer/JSTokenizerKeys$words$2\n*L\n78#1:116\n78#1:117,3\n*E\n"})
/*     */   static final class JSTokenizerKeys$words$2 extends Lambda implements Function1<JsTokenizerToken[], List<? extends Tokenizer.Token>> {
/*     */     public static final JSTokenizerKeys$words$2 INSTANCE = new JSTokenizerKeys$words$2();
/*     */     
/*     */     JSTokenizerKeys$words$2() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     public final List<Tokenizer.Token> invoke(JsTokenizerToken[] it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       JsTokenizerToken[] arrayOfJsTokenizerToken1 = it;
/*     */       int $i$f$map = 0;
/*     */       JsTokenizerToken[] arrayOfJsTokenizerToken2 = arrayOfJsTokenizerToken1;
/*     */       Collection<Tokenizer.Token> destination$iv$iv = new ArrayList(arrayOfJsTokenizerToken1.length);
/*     */       int $i$f$mapTo = 0;
/*     */       byte b;
/*     */       int i;
/*     */       for (b = 0, i = arrayOfJsTokenizerToken2.length; b < i; ) {
/*     */         Object item$iv$iv = arrayOfJsTokenizerToken2[b];
/*     */         Object object1 = item$iv$iv;
/*     */         Collection<Tokenizer.Token> collection = destination$iv$iv;
/*     */         int $i$a$-map-JSTokenizerKeys$words$2$1 = 0;
/*     */         collection.add(new Tokenizer.Token(object1.getText(), object1.getInterval()));
/*     */       } 
/*     */       return (List<Tokenizer.Token>)destination$iv$iv;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\JSTokenizerKeys.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */