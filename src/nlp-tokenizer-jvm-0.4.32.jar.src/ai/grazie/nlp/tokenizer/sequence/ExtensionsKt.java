/*    */ package ai.grazie.nlp.tokenizer.sequence;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\032\n\020\000\032\0020\001*\0020\002\032\n\020\000\032\0020\003*\0020\004\032\n\020\005\032\0020\006*\0020\002\032\n\020\005\032\0020\007*\0020\004\032\n\020\005\032\0020\007*\0020\003\032\n\020\005\032\0020\006*\0020\001¨\006\b"}, d2 = {"toInefficientCharSequenceTokenizer", "Lai/grazie/nlp/tokenizer/sequence/NonDestructiveCharSequenceTokenizer;", "Lai/grazie/nlp/tokenizer/NonDestructiveTokenizer;", "Lai/grazie/nlp/tokenizer/sequence/CharSequenceTokenizer;", "Lai/grazie/nlp/tokenizer/Tokenizer;", "toInefficientSequenceTokenizer", "Lai/grazie/nlp/tokenizer/sequence/NonDestructiveSequenceTokenizer;", "Lai/grazie/nlp/tokenizer/sequence/SequenceTokenizer;", "nlp-tokenizer"})
/*    */ public final class ExtensionsKt {
/*    */   @NotNull
/*  7 */   public static final SequenceTokenizer toInefficientSequenceTokenizer(@NotNull CharSequenceTokenizer $this$toInefficientSequenceTokenizer) { Intrinsics.checkNotNullParameter($this$toInefficientSequenceTokenizer, "<this>"); if ($this$toInefficientSequenceTokenizer instanceof SequenceTokenizer) {
/*  8 */       return (SequenceTokenizer)$this$toInefficientSequenceTokenizer;
/*    */     }
/*    */     
/* 11 */     CharSequenceTokenizer self = $this$toInefficientSequenceTokenizer;
/* 12 */     return new ExtensionsKt$toInefficientSequenceTokenizer$1(self); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\f\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sequence/ExtensionsKt$toInefficientSequenceTokenizer$1", "Lai/grazie/nlp/tokenizer/sequence/SequenceTokenizer;", "tokenizeAsSequence", "Lkotlin/sequences/Sequence;", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "text", "", "nlp-tokenizer"}) public static final class ExtensionsKt$toInefficientSequenceTokenizer$1 implements SequenceTokenizer {
/*    */     ExtensionsKt$toInefficientSequenceTokenizer$1(CharSequenceTokenizer $self) {} @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\f\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}) static final class ExtensionsKt$toInefficientSequenceTokenizer$1$tokenizeAsSequence$string$1 extends Lambda implements Function1<Character, CharSequence> {
/* 14 */       public static final ExtensionsKt$toInefficientSequenceTokenizer$1$tokenizeAsSequence$string$1 INSTANCE = new ExtensionsKt$toInefficientSequenceTokenizer$1$tokenizeAsSequence$string$1(); ExtensionsKt$toInefficientSequenceTokenizer$1$tokenizeAsSequence$string$1() { super(1); } public final CharSequence invoke(char it) { return String.valueOf(it); } } public Sequence<Tokenizer.Token> tokenizeAsSequence(Sequence text) { Intrinsics.checkNotNullParameter(text, "text"); String string = SequencesKt.joinToString$default(text, "", null, null, 0, null, ExtensionsKt$toInefficientSequenceTokenizer$1$tokenizeAsSequence$string$1.INSTANCE, 30, null);
/* 15 */       return this.$self.tokenizeAsSequence(string); }
/*    */   
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final NonDestructiveSequenceTokenizer toInefficientSequenceTokenizer(@NotNull NonDestructiveCharSequenceTokenizer $this$toInefficientSequenceTokenizer) {
/* 21 */     Intrinsics.checkNotNullParameter($this$toInefficientSequenceTokenizer, "<this>"); if ($this$toInefficientSequenceTokenizer instanceof NonDestructiveSequenceTokenizer) {
/* 22 */       return (NonDestructiveSequenceTokenizer)$this$toInefficientSequenceTokenizer;
/*    */     }
/*    */     
/* 25 */     NonDestructiveCharSequenceTokenizer self = $this$toInefficientSequenceTokenizer;
/* 26 */     return new ExtensionsKt$toInefficientSequenceTokenizer$2(self); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\f\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sequence/ExtensionsKt$toInefficientSequenceTokenizer$2", "Lai/grazie/nlp/tokenizer/sequence/NonDestructiveSequenceTokenizer;", "tokenizeAsSequence", "Lkotlin/sequences/Sequence;", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "text", "", "nlp-tokenizer"})
/*    */   public static final class ExtensionsKt$toInefficientSequenceTokenizer$2 implements NonDestructiveSequenceTokenizer { ExtensionsKt$toInefficientSequenceTokenizer$2(NonDestructiveCharSequenceTokenizer $self) {}
/* 28 */     public Sequence<Tokenizer.Token> tokenizeAsSequence(Sequence text) { Intrinsics.checkNotNullParameter(text, "text"); String string = SequencesKt.joinToString$default(text, "", null, null, 0, null, ExtensionsKt$toInefficientSequenceTokenizer$2$tokenizeAsSequence$string$1.INSTANCE, 30, null);
/* 29 */       return this.$self.tokenizeAsSequence(string); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\f\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"})
/*    */     static final class ExtensionsKt$toInefficientSequenceTokenizer$2$tokenizeAsSequence$string$1 extends Lambda implements Function1<Character, CharSequence> {
/*    */       public static final ExtensionsKt$toInefficientSequenceTokenizer$2$tokenizeAsSequence$string$1 INSTANCE = new ExtensionsKt$toInefficientSequenceTokenizer$2$tokenizeAsSequence$string$1(); ExtensionsKt$toInefficientSequenceTokenizer$2$tokenizeAsSequence$string$1() { super(1); }
/*    */       public final CharSequence invoke(char it) {
/*    */         return String.valueOf(it);
/*    */       } } }
/*    */   @NotNull
/* 36 */   public static final CharSequenceTokenizer toInefficientCharSequenceTokenizer(@NotNull Tokenizer $this$toInefficientCharSequenceTokenizer) { Intrinsics.checkNotNullParameter($this$toInefficientCharSequenceTokenizer, "<this>"); if ($this$toInefficientCharSequenceTokenizer instanceof CharSequenceTokenizer) {
/* 37 */       return (CharSequenceTokenizer)$this$toInefficientCharSequenceTokenizer;
/*    */     }
/*    */     
/* 40 */     Tokenizer self = $this$toInefficientCharSequenceTokenizer;
/* 41 */     return new ExtensionsKt$toInefficientCharSequenceTokenizer$1(self); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sequence/ExtensionsKt$toInefficientCharSequenceTokenizer$1", "Lai/grazie/nlp/tokenizer/sequence/CharSequenceTokenizer;", "tokenizeAsSequence", "Lkotlin/sequences/Sequence;", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "text", "", "nlp-tokenizer"})
/*    */   public static final class ExtensionsKt$toInefficientCharSequenceTokenizer$1 implements CharSequenceTokenizer { ExtensionsKt$toInefficientCharSequenceTokenizer$1(Tokenizer $self) {} public Sequence<Tokenizer.Token> tokenizeAsSequence(CharSequence text) {
/* 43 */       Intrinsics.checkNotNullParameter(text, "text"); return CollectionsKt.asSequence(this.$self.tokenize(text.toString()));
/*    */     } }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final NonDestructiveCharSequenceTokenizer toInefficientCharSequenceTokenizer(@NotNull NonDestructiveTokenizer $this$toInefficientCharSequenceTokenizer) {
/* 49 */     Intrinsics.checkNotNullParameter($this$toInefficientCharSequenceTokenizer, "<this>"); if ($this$toInefficientCharSequenceTokenizer instanceof NonDestructiveCharSequenceTokenizer) {
/* 50 */       return (NonDestructiveCharSequenceTokenizer)$this$toInefficientCharSequenceTokenizer;
/*    */     }
/*    */     
/* 53 */     NonDestructiveTokenizer self = $this$toInefficientCharSequenceTokenizer;
/* 54 */     return new ExtensionsKt$toInefficientCharSequenceTokenizer$2(self); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sequence/ExtensionsKt$toInefficientCharSequenceTokenizer$2", "Lai/grazie/nlp/tokenizer/sequence/NonDestructiveCharSequenceTokenizer;", "tokenizeAsSequence", "Lkotlin/sequences/Sequence;", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "text", "", "nlp-tokenizer"})
/*    */   public static final class ExtensionsKt$toInefficientCharSequenceTokenizer$2 implements NonDestructiveCharSequenceTokenizer { ExtensionsKt$toInefficientCharSequenceTokenizer$2(NonDestructiveTokenizer $self) {} public Sequence<Tokenizer.Token> tokenizeAsSequence(CharSequence text) {
/* 56 */       Intrinsics.checkNotNullParameter(text, "text"); return CollectionsKt.asSequence(this.$self.tokenize(text.toString()));
/*    */     } }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final SequenceTokenizer toInefficientSequenceTokenizer(@NotNull Tokenizer $this$toInefficientSequenceTokenizer) {
/* 63 */     Intrinsics.checkNotNullParameter($this$toInefficientSequenceTokenizer, "<this>"); return toInefficientSequenceTokenizer(toInefficientCharSequenceTokenizer($this$toInefficientSequenceTokenizer));
/*    */   }
/*    */   @NotNull
/*    */   public static final NonDestructiveSequenceTokenizer toInefficientSequenceTokenizer(@NotNull NonDestructiveTokenizer $this$toInefficientSequenceTokenizer) {
/* 67 */     Intrinsics.checkNotNullParameter($this$toInefficientSequenceTokenizer, "<this>"); return toInefficientSequenceTokenizer(toInefficientCharSequenceTokenizer($this$toInefficientSequenceTokenizer));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\sequence\ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */