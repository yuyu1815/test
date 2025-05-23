/*    */ package ai.grazie.model.nlp.encoder;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\020\b\n\002\b\003\n\002\020\016\n\002\b\005\n\002\020\013\n\002\b\005\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0040\003H&J\020\020\006\032\0020\0042\006\020\007\032\0020\bH\026J\026\020\t\032\0020\b2\f\020\005\032\b\022\004\022\0020\0040\003H&J\026\020\n\032\0020\b2\f\020\013\032\b\022\004\022\0020\b0\003H&J/\020\f\032\b\022\004\022\0020\0040\0032\006\020\007\032\0020\b2\006\020\r\032\0020\0162\n\b\002\020\017\032\004\030\0010\004H&¢\006\002\020\020J;\020\f\032\016\022\n\022\b\022\004\022\0020\0040\0030\0032\f\020\021\032\b\022\004\022\0020\b0\0032\006\020\r\032\0020\0162\n\b\002\020\017\032\004\030\0010\004H\026¢\006\002\020\022J\026\020\023\032\b\022\004\022\0020\b0\0242\006\020\007\032\0020\bH&J\"\020\023\032\016\022\n\022\b\022\004\022\0020\b0\0030\0032\f\020\021\032\b\022\004\022\0020\b0\003H\026J\b\020\025\032\0020\004H&ø\001\000\002\006\n\004\b!0\001¨\006\026À\006\001"}, d2 = {"Lai/grazie/model/nlp/encoder/TextEncoder;", "Lai/grazie/model/nlp/encoder/TokenCounter;", "buildInputsWithSpecialTokens", "", "", "ids", "count", "text", "", "decodeFromIds", "decodeFromTokens", "tokens", "encodeAsIds", "withSpecialTokens", "", "maxLen", "(Ljava/lang/String;ZLjava/lang/Integer;)Ljava/util/List;", "texts", "(Ljava/util/List;ZLjava/lang/Integer;)Ljava/util/List;", "encodeAsTokens", "Lkotlin/sequences/Sequence;", "numSpecialTokens", "model-nlp"})
/*    */ @SourceDebugExtension({"SMAP\nTextEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextEncoder.kt\nai/grazie/model/nlp/encoder/TextEncoder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n1557#2:23\n1628#2,3:24\n1557#2:27\n1628#2,3:28\n*S KotlinDebug\n*F\n+ 1 TextEncoder.kt\nai/grazie/model/nlp/encoder/TextEncoder\n*L\n18#1:23\n18#1:24,3\n19#1:27\n19#1:28,3\n*E\n"})
/*    */ public interface TextEncoder extends TokenCounter {
/*    */   @NotNull
/*    */   Sequence<String> encodeAsTokens(@NotNull String paramString);
/*    */   
/*    */   @NotNull
/*    */   String decodeFromTokens(@NotNull List<String> paramList);
/*    */   
/* 13 */   default int count(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); return encodeAsIds$default(this, text, true, (Integer)null, 4, (Object)null).size(); } @NotNull
/*    */   List<Integer> encodeAsIds(@NotNull String paramString, boolean paramBoolean, @Nullable Integer paramInteger); @NotNull
/*    */   String decodeFromIds(@NotNull List<Integer> paramList); int numSpecialTokens(); @NotNull
/*    */   List<Integer> buildInputsWithSpecialTokens(@NotNull List<Integer> paramList); @NotNull
/*    */   default List<List<String>> encodeAsTokens(@NotNull List texts) {
/* 18 */     Intrinsics.checkNotNullParameter(texts, "texts"); Iterable $this$map$iv = texts; int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 23 */     Iterable iterable1 = $this$map$iv; Collection<List> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 24 */     for (Object item$iv$iv : iterable1) {
/* 25 */       String str = (String)item$iv$iv; Collection<List> collection = destination$iv$iv; int $i$a$-map-TextEncoder$encodeAsTokens$1 = 0; collection.add(SequencesKt.toList(encodeAsTokens(str)));
/* 26 */     }  return (List)destination$iv$iv; } @NotNull default List<List<Integer>> encodeAsIds(@NotNull List texts, boolean withSpecialTokens, @Nullable Integer maxLen) { Intrinsics.checkNotNullParameter(texts, "texts"); Iterable $this$map$iv = texts; int $i$f$map = 0;
/* 27 */     Iterable iterable1 = $this$map$iv; Collection<List<Integer>> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 28 */     for (Object item$iv$iv : iterable1) {
/* 29 */       String str = (String)item$iv$iv; Collection<List<Integer>> collection = destination$iv$iv; int $i$a$-map-TextEncoder$encodeAsIds$1 = 0; collection.add(encodeAsIds(str, withSpecialTokens, maxLen));
/* 30 */     }  return (List<List<Integer>>)destination$iv$iv; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-nlp-jvm-0.4.32.jar!\ai\grazie\model\nlp\encoder\TextEncoder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */