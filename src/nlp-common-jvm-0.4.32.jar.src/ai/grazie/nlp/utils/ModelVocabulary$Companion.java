/*    */ package ai.grazie.nlp.utils;
/*    */ import java.util.HashMap;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\002\020\b\n\002\b\002\n\002\020 \n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\003\032\0020\0042\022\020\005\032\016\022\004\022\0020\007\022\004\022\0020\b0\006J\024\020\t\032\0020\0042\f\020\n\032\b\022\004\022\0020\0070\013J\016\020\f\032\0020\0042\006\020\r\032\0020\007¨\006\016"}, d2 = {"Lai/grazie/nlp/utils/ModelVocabulary$Companion;", "", "()V", "fromDict", "Lai/grazie/nlp/utils/ModelVocabulary;", "rawVocab", "", "", "", "fromTokens", "tokens", "", "loadFromTextLines", "file", "nlp-common"})
/*    */ @SourceDebugExtension({"SMAP\nModelVocabulary.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelVocabulary.kt\nai/grazie/nlp/utils/ModelVocabulary$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n774#2:53\n865#2,2:54\n*S KotlinDebug\n*F\n+ 1 ModelVocabulary.kt\nai/grazie/nlp/utils/ModelVocabulary$Companion\n*L\n13#1:53\n13#1:54,2\n*E\n"})
/*    */ public final class Companion {
/*    */   @NotNull
/*    */   public final ModelVocabulary loadFromTextLines(@NotNull String file) {
/* 13 */     Intrinsics.checkNotNullParameter(file, "file"); Iterable $this$filter$iv = StringsKt.lines(file); int $i$f$filter = 0;
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
/* 53 */     Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 54 */     for (Object element$iv$iv : iterable1) { String it = (String)element$iv$iv; int $i$a$-filter-ModelVocabulary$Companion$loadFromTextLines$tokens$1 = 0; if (!StringsKt.isBlank(it)) destination$iv$iv.add(element$iv$iv);  }
/* 55 */      List<String> tokens = (List)destination$iv$iv;
/*    */     return fromTokens(tokens);
/*    */   }
/*    */   
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final ModelVocabulary fromDict(@NotNull Map rawVocab) {
/*    */     Intrinsics.checkNotNullParameter(rawVocab, "rawVocab");
/*    */     Map<Object, Object> token2index = new HashMap<>();
/*    */     Map<Object, Object> index2token = new HashMap<>();
/*    */     for (Map.Entry entry : rawVocab.entrySet()) {
/*    */       String token = (String)entry.getKey();
/*    */       int index = ((Number)entry.getValue()).intValue();
/*    */       Integer integer = Integer.valueOf(index);
/*    */       token2index.put(token, integer);
/*    */       integer = Integer.valueOf(index);
/*    */       index2token.put(integer, token);
/*    */     } 
/*    */     return new ModelVocabulary((Map)token2index, (Map)index2token);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ModelVocabulary fromTokens(@NotNull List tokens) {
/*    */     Intrinsics.checkNotNullParameter(tokens, "tokens");
/*    */     Map<Object, Object> token2index = new HashMap<>();
/*    */     Map<Object, Object> index2token = new HashMap<>();
/*    */     Iterator<String> iterator;
/*    */     int i;
/*    */     for (iterator = tokens.iterator(), i = 0; iterator.hasNext(); ) {
/*    */       int tokenIdx = i;
/*    */       i++;
/*    */       String token = iterator.next();
/*    */       Integer integer = Integer.valueOf(tokenIdx);
/*    */       token2index.put(token, integer);
/*    */       integer = Integer.valueOf(tokenIdx);
/*    */       index2token.put(integer, token);
/*    */     } 
/*    */     return new ModelVocabulary((Map)token2index, (Map)index2token);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\ModelVocabulary$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */