/*    */ package ai.grazie.nlp.tokenizer.spacy;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\021\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B1\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\003\022\n\b\002\020\005\032\004\030\0010\003\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007J\t\020\017\032\0020\003HÆ\003J\013\020\020\032\004\030\0010\003HÆ\003J\013\020\021\032\004\030\0010\003HÆ\003J\013\020\022\032\004\030\0010\003HÆ\003J7\020\023\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0032\n\b\002\020\005\032\004\030\0010\0032\n\b\002\020\006\032\004\030\0010\003HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\030HÖ\001J\t\020\031\032\0020\003HÖ\001R\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\b\020\tR\023\020\006\032\004\030\0010\003¢\006\b\n\000\032\004\b\n\020\tR\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\013\020\t\"\004\b\f\020\rR\023\020\005\032\004\030\0010\003¢\006\b\n\000\032\004\b\016\020\t¨\006\032"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/SpacyTokenInfo;", "", "orth", "", "lemma", "tag", "norm", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLemma", "()Ljava/lang/String;", "getNorm", "getOrth", "setOrth", "(Ljava/lang/String;)V", "getTag", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "nlp-tokenizer"})
/*    */ public final class SpacyTokenInfo {
/*    */   @NotNull
/*    */   private String orth;
/*    */   @Nullable
/*    */   private final String lemma;
/*    */   
/* 10 */   public SpacyTokenInfo(@NotNull String orth, @Nullable String lemma, @Nullable String tag, @Nullable String norm) { this.orth = orth; this.lemma = lemma; this.tag = tag; this.norm = norm; } @Nullable private final String tag; @Nullable private final String norm; @NotNull public final String getOrth() { return this.orth; } public final void setOrth(@NotNull String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.orth = <set-?>; } @Nullable public final String getLemma() { return this.lemma; } @Nullable public final String getTag() { return this.tag; } @Nullable public final String getNorm() { return this.norm; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.orth;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.lemma;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.tag;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component4() {
/*    */     return this.norm;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SpacyTokenInfo copy(@NotNull String orth, @Nullable String lemma, @Nullable String tag, @Nullable String norm) {
/*    */     Intrinsics.checkNotNullParameter(orth, "orth");
/*    */     return new SpacyTokenInfo(orth, lemma, tag, norm);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SpacyTokenInfo(orth=" + this.orth + ", lemma=" + this.lemma + ", tag=" + this.tag + ", norm=" + this.norm + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.orth.hashCode();
/*    */     result = result * 31 + ((this.lemma == null) ? 0 : this.lemma.hashCode());
/*    */     result = result * 31 + ((this.tag == null) ? 0 : this.tag.hashCode());
/*    */     return result * 31 + ((this.norm == null) ? 0 : this.norm.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SpacyTokenInfo))
/*    */       return false; 
/*    */     SpacyTokenInfo spacyTokenInfo = (SpacyTokenInfo)other;
/*    */     return !Intrinsics.areEqual(this.orth, spacyTokenInfo.orth) ? false : (!Intrinsics.areEqual(this.lemma, spacyTokenInfo.lemma) ? false : (!Intrinsics.areEqual(this.tag, spacyTokenInfo.tag) ? false : (!!Intrinsics.areEqual(this.norm, spacyTokenInfo.norm))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\spacy\SpacyTokenInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */