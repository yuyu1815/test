/*    */ package ai.grazie.nlp.tokenizer.spacy;
/*    */ 
/*    */ import java.util.Map;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\020$\n\002\020\016\n\002\020 \n\002\030\002\n\002\b\005\n\002\020%\n\002\b\013\n\002\020\013\n\000\030\0002\0020\001B9\022\030\020\002\032\024\022\004\022\0020\004\022\n\022\b\022\004\022\0020\0060\0050\003\022\030\020\007\032\024\022\004\022\0020\004\022\n\022\b\022\004\022\0020\0060\0050\003¢\006\002\020\bJD\020\021\032\024\022\004\022\0020\004\022\n\022\b\022\004\022\0020\0060\0050\f2\030\020\022\032\024\022\004\022\0020\004\022\n\022\b\022\004\022\0020\0060\0050\f2\006\020\023\032\0020\0042\006\020\024\032\0020\004H\002J\026\020\025\032\n\022\004\022\0020\006\030\0010\0052\006\020\026\032\0020\004J\016\020\027\032\0020\0302\006\020\026\032\0020\004R#\020\002\032\024\022\004\022\0020\004\022\n\022\b\022\004\022\0020\0060\0050\003¢\006\b\n\000\032\004\b\t\020\nR-\020\013\032\024\022\004\022\0020\004\022\n\022\b\022\004\022\0020\0060\0050\f8FX\002¢\006\f\n\004\b\016\020\017\032\004\b\r\020\nR#\020\007\032\024\022\004\022\0020\004\022\n\022\b\022\004\022\0020\0060\0050\003¢\006\b\n\000\032\004\b\020\020\n¨\006\031"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerSpecialCases;", "", "baseExceptions", "", "", "", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenInfo;", "tokenizerExceptions", "(Ljava/util/Map;Ljava/util/Map;)V", "getBaseExceptions", "()Ljava/util/Map;", "specialCases", "", "getSpecialCases", "specialCases$delegate", "Lkotlin/Lazy;", "getTokenizerExceptions", "expandExceptions", "exceptions", "search", "replace", "get", "token", "urlMatch", "", "nlp-tokenizer"})
/*    */ @SourceDebugExtension({"SMAP\nSpacyTokenizerSpecialCases.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacyTokenizerSpecialCases.kt\nai/grazie/nlp/tokenizer/spacy/SpacyTokenizerSpecialCases\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1557#2:60\n1628#2,3:61\n*S KotlinDebug\n*F\n+ 1 SpacyTokenizerSpecialCases.kt\nai/grazie/nlp/tokenizer/spacy/SpacyTokenizerSpecialCases\n*L\n50#1:60\n50#1:61,3\n*E\n"})
/*    */ public final class SpacyTokenizerSpecialCases {
/*    */   @NotNull
/*    */   private final Map<String, List<SpacyTokenInfo>> baseExceptions;
/*    */   
/* 11 */   public SpacyTokenizerSpecialCases(@NotNull Map<String, List<SpacyTokenInfo>> baseExceptions, @NotNull Map<String, List<SpacyTokenInfo>> tokenizerExceptions) { this.baseExceptions = baseExceptions;
/* 12 */     this.tokenizerExceptions = tokenizerExceptions;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 19 */     this.specialCases$delegate = LazyKt.lazy(new SpacyTokenizerSpecialCases$specialCases$2()); } @NotNull private final Map<String, List<SpacyTokenInfo>> tokenizerExceptions; @NotNull private final Lazy specialCases$delegate; @NotNull public final Map<String, List<SpacyTokenInfo>> getBaseExceptions() { return this.baseExceptions; } @NotNull public final Map<String, List<SpacyTokenInfo>> getTokenizerExceptions() { return this.tokenizerExceptions; } @NotNull public final Map<String, List<SpacyTokenInfo>> getSpecialCases() { Lazy lazy = this.specialCases$delegate; return (Map<String, List<SpacyTokenInfo>>)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020%\n\002\020\016\n\002\020 \n\002\030\002\n\000\020\000\032\024\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0040\0030\001H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "", "", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenInfo;", "invoke"})
/* 20 */   static final class SpacyTokenizerSpecialCases$specialCases$2 extends Lambda implements Function0<Map<String, List<? extends SpacyTokenInfo>>> { public final Map<String, List<SpacyTokenInfo>> invoke() { Map cases = MapsKt.toMutableMap(MapsKt.plus(SpacyTokenizerSpecialCases.this.getTokenizerExceptions(), SpacyTokenizerSpecialCases.this.getBaseExceptions()));
/* 21 */       return SpacyTokenizerSpecialCases.this.expandExceptions(cases, "'", "’"); } SpacyTokenizerSpecialCases$specialCases$2() {
/*    */       super(0);
/*    */     } } @Nullable
/*    */   public final List<SpacyTokenInfo> get(@NotNull String token) {
/* 25 */     Intrinsics.checkNotNullParameter(token, "token"); return getSpecialCases().containsKey(token) ? 
/* 26 */       getSpecialCases().get(token) : 
/*    */       
/* 28 */       null;
/*    */   }
/*    */ 
/*    */   
/*    */   public final boolean urlMatch(@NotNull String token) {
/* 33 */     Intrinsics.checkNotNullParameter(token, "token"); return SpacyDefaults.INSTANCE.getUrlMatch().matches(token);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final SpacyTokenInfo expandExceptions$fixToken(SpacyTokenInfo token, String search, String replace) {
/* 43 */     String str1 = StringsKt.replace$default(token.getOrth(), search, replace, false, 4, null), str2 = token.getNorm(), str3 = token.getTag(), str4 = token.getLemma(); return new SpacyTokenInfo(str1, str4, str3, str2);
/*    */   }
/*    */   private final Map<String, List<SpacyTokenInfo>> expandExceptions(Map<Object, Object> exceptions, String search, String replace) {
/* 46 */     HashMap<Object, Object> newItems = new HashMap<>();
/* 47 */     for (Map.Entry entry : exceptions.entrySet()) { String tokenString = (String)entry.getKey(); List tokens = (List)entry.getValue();
/* 48 */       if (StringsKt.contains$default(tokenString, search, false, 2, null)) {
/* 49 */         String newKey = StringsKt.replace$default(tokenString, search, replace, false, 4, null);
/* 50 */         Iterable $this$map$iv = tokens; int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 60 */         Iterable iterable1 = $this$map$iv; Collection<SpacyTokenInfo> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 61 */         for (Object item$iv$iv : iterable1) {
/* 62 */           SpacyTokenInfo spacyTokenInfo = (SpacyTokenInfo)item$iv$iv; Collection<SpacyTokenInfo> collection = destination$iv$iv; int $i$a$-map-SpacyTokenizerSpecialCases$expandExceptions$newValue$1 = 0; collection.add(expandExceptions$fixToken(spacyTokenInfo, search, replace));
/* 63 */         }  List newValue = (List)destination$iv$iv;
/*    */         newItems.put(newKey, newValue);
/*    */       }  }
/*    */     
/*    */     exceptions.putAll(newItems);
/*    */     return (Map)exceptions;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\spacy\SpacyTokenizerSpecialCases.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */