/*    */ package ai.grazie.nlp.utils;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020$\n\002\020\016\n\002\020\b\n\002\b\f\n\002\020\013\n\002\b\n\b\b\030\000 \0332\0020\001:\001\033B-\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003\022\022\020\006\032\016\022\004\022\0020\005\022\004\022\0020\0040\003¢\006\002\020\007J\025\020\016\032\016\022\004\022\0020\004\022\004\022\0020\0050\003HÆ\003J\025\020\017\032\016\022\004\022\0020\005\022\004\022\0020\0040\003HÆ\003J5\020\020\032\0020\0002\024\b\002\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\0032\024\b\002\020\006\032\016\022\004\022\0020\005\022\004\022\0020\0040\003HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001HÖ\003J\016\020\024\032\0020\0042\006\020\025\032\0020\005J\032\020\026\032\0020\0052\006\020\027\032\0020\0042\n\b\002\020\030\032\004\030\0010\004J\t\020\031\032\0020\005HÖ\001J\t\020\032\032\0020\004HÖ\001R\035\020\006\032\016\022\004\022\0020\005\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\n\032\0020\0058F¢\006\006\032\004\b\013\020\fR\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\r\020\t¨\006\034"}, d2 = {"Lai/grazie/nlp/utils/ModelVocabulary;", "", "token2index", "", "", "", "index2token", "(Ljava/util/Map;Ljava/util/Map;)V", "getIndex2token", "()Ljava/util/Map;", "size", "getSize", "()I", "getToken2index", "component1", "component2", "copy", "equals", "", "other", "getTokenByIndex", "idx", "getTokenIndex", "token", "unkToken", "hashCode", "toString", "Companion", "nlp-common"})
/*    */ public final class ModelVocabulary {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*  8 */   public ModelVocabulary(@NotNull Map<String, Integer> token2index, @NotNull Map<Integer, String> index2token) { this.token2index = token2index;
/*  9 */     this.index2token = index2token; } @NotNull private final Map<String, Integer> token2index; @NotNull private final Map<Integer, String> index2token; @NotNull public final Map<String, Integer> getToken2index() { return this.token2index; } @NotNull public final Map<Integer, String> getIndex2token() { return this.index2token; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\002\020\b\n\002\b\002\n\002\020 \n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\003\032\0020\0042\022\020\005\032\016\022\004\022\0020\007\022\004\022\0020\b0\006J\024\020\t\032\0020\0042\f\020\n\032\b\022\004\022\0020\0070\013J\016\020\f\032\0020\0042\006\020\r\032\0020\007¨\006\016"}, d2 = {"Lai/grazie/nlp/utils/ModelVocabulary$Companion;", "", "()V", "fromDict", "Lai/grazie/nlp/utils/ModelVocabulary;", "rawVocab", "", "", "", "fromTokens", "tokens", "", "loadFromTextLines", "file", "nlp-common"})
/*    */   @SourceDebugExtension({"SMAP\nModelVocabulary.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelVocabulary.kt\nai/grazie/nlp/utils/ModelVocabulary$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n774#2:53\n865#2,2:54\n*S KotlinDebug\n*F\n+ 1 ModelVocabulary.kt\nai/grazie/nlp/utils/ModelVocabulary$Companion\n*L\n13#1:53\n13#1:54,2\n*E\n"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/*    */     public final ModelVocabulary loadFromTextLines(@NotNull String file) {
/* 13 */       Intrinsics.checkNotNullParameter(file, "file"); Iterable $this$filter$iv = StringsKt.lines(file); int $i$f$filter = 0;
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
/* 53 */       Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 54 */       for (Object element$iv$iv : iterable1) { String it = (String)element$iv$iv; int $i$a$-filter-ModelVocabulary$Companion$loadFromTextLines$tokens$1 = 0; if (!StringsKt.isBlank(it)) destination$iv$iv.add(element$iv$iv);  }
/* 55 */        List<String> tokens = (List)destination$iv$iv;
/*    */       return fromTokens(tokens);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ModelVocabulary fromDict(@NotNull Map rawVocab) {
/*    */       Intrinsics.checkNotNullParameter(rawVocab, "rawVocab");
/*    */       Map<Object, Object> token2index = new HashMap<>();
/*    */       Map<Object, Object> index2token = new HashMap<>();
/*    */       for (Map.Entry entry : rawVocab.entrySet()) {
/*    */         String token = (String)entry.getKey();
/*    */         int index = ((Number)entry.getValue()).intValue();
/*    */         Integer integer = Integer.valueOf(index);
/*    */         token2index.put(token, integer);
/*    */         integer = Integer.valueOf(index);
/*    */         index2token.put(integer, token);
/*    */       } 
/*    */       return new ModelVocabulary((Map)token2index, (Map)index2token);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ModelVocabulary fromTokens(@NotNull List tokens) {
/*    */       Intrinsics.checkNotNullParameter(tokens, "tokens");
/*    */       Map<Object, Object> token2index = new HashMap<>();
/*    */       Map<Object, Object> index2token = new HashMap<>();
/*    */       Iterator<String> iterator;
/*    */       int i;
/*    */       for (iterator = tokens.iterator(), i = 0; iterator.hasNext(); ) {
/*    */         int tokenIdx = i;
/*    */         i++;
/*    */         String token = iterator.next();
/*    */         Integer integer = Integer.valueOf(tokenIdx);
/*    */         token2index.put(token, integer);
/*    */         integer = Integer.valueOf(tokenIdx);
/*    */         index2token.put(integer, token);
/*    */       } 
/*    */       return new ModelVocabulary((Map)token2index, (Map)index2token);
/*    */     } }
/*    */ 
/*    */   
/*    */   public final int getTokenIndex(@NotNull String token, @Nullable String unkToken) {
/*    */     Intrinsics.checkNotNullParameter(token, "token");
/*    */     if (unkToken != null) {
/*    */       (Integer)this.token2index.get(token);
/*    */       Intrinsics.checkNotNull(this.token2index.get(unkToken));
/*    */       return ((Integer)this.token2index.get(token) != null) ? ((Integer)this.token2index.get(token)).intValue() : this.token2index.get(unkToken).intValue();
/*    */     } 
/*    */     Intrinsics.checkNotNull(this.token2index.get(token));
/*    */     return this.token2index.get(token).intValue();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getTokenByIndex(int idx) {
/*    */     Intrinsics.checkNotNull(this.index2token.get(Integer.valueOf(idx)));
/*    */     return this.index2token.get(Integer.valueOf(idx));
/*    */   }
/*    */   
/*    */   public final int getSize() {
/*    */     return this.token2index.size();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Map<String, Integer> component1() {
/*    */     return this.token2index;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Map<Integer, String> component2() {
/*    */     return this.index2token;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ModelVocabulary copy(@NotNull Map<String, Integer> token2index, @NotNull Map<Integer, String> index2token) {
/*    */     Intrinsics.checkNotNullParameter(token2index, "token2index");
/*    */     Intrinsics.checkNotNullParameter(index2token, "index2token");
/*    */     return new ModelVocabulary(token2index, index2token);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ModelVocabulary(token2index=" + this.token2index + ", index2token=" + this.index2token + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.token2index.hashCode();
/*    */     return result * 31 + this.index2token.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ModelVocabulary))
/*    */       return false; 
/*    */     ModelVocabulary modelVocabulary = (ModelVocabulary)other;
/*    */     return !Intrinsics.areEqual(this.token2index, modelVocabulary.token2index) ? false : (!!Intrinsics.areEqual(this.index2token, modelVocabulary.index2token));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\ModelVocabulary.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */