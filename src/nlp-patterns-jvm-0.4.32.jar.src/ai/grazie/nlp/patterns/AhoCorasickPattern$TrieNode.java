/*    */ package ai.grazie.nlp.patterns;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020$\n\002\020\f\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\024\n\002\020\016\n\000\b\b\030\0002\0020\001B9\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003\022\006\020\006\032\0020\005\022\006\020\007\032\0020\b\022\006\020\t\032\0020\005\022\006\020\n\032\0020\005¢\006\002\020\013J\025\020\023\032\016\022\004\022\0020\004\022\004\022\0020\0050\003HÆ\003J\t\020\024\032\0020\005HÆ\003J\t\020\025\032\0020\bHÆ\003J\t\020\026\032\0020\005HÆ\003J\t\020\027\032\0020\005HÆ\003JG\020\030\032\0020\0002\024\b\002\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\0032\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\0052\b\b\002\020\n\032\0020\005HÆ\001J\023\020\031\032\0020\b2\b\020\032\032\004\030\0010\001HÖ\003J\t\020\033\032\0020\005HÖ\001J\t\020\034\032\0020\035HÖ\001R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\007\020\016R\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\017\020\020R\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\021\020\rR\021\020\n\032\0020\005¢\006\b\n\000\032\004\b\022\020\r¨\006\036"}, d2 = {"Lai/grazie/nlp/patterns/AhoCorasickPattern$TrieNode;", "", "next", "", "", "", "depth", "isLeaf", "", "suffixLink", "suffixLinkToLeaf", "(Ljava/util/Map;IZII)V", "getDepth", "()I", "()Z", "getNext", "()Ljava/util/Map;", "getSuffixLink", "getSuffixLinkToLeaf", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "nlp-patterns"})
/*    */ public final class TrieNode {
/*    */   @NotNull
/*    */   private final Map<Character, Integer> next;
/*    */   private final int depth;
/*    */   
/*  9 */   public TrieNode(@NotNull Map<Character, Integer> next, int depth, boolean isLeaf, int suffixLink, int suffixLinkToLeaf) { this.next = next;
/* 10 */     this.depth = depth;
/* 11 */     this.isLeaf = isLeaf;
/* 12 */     this.suffixLink = suffixLink;
/* 13 */     this.suffixLinkToLeaf = suffixLinkToLeaf; } private final boolean isLeaf; private final int suffixLink; private final int suffixLinkToLeaf; @NotNull public final Map<Character, Integer> getNext() { return this.next; } public final int getSuffixLinkToLeaf() { return this.suffixLinkToLeaf; }
/*    */ 
/*    */   
/*    */   public final int getDepth() {
/*    */     return this.depth;
/*    */   }
/*    */   
/*    */   public final boolean isLeaf() {
/*    */     return this.isLeaf;
/*    */   }
/*    */   
/*    */   public final int getSuffixLink() {
/*    */     return this.suffixLink;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Map<Character, Integer> component1() {
/*    */     return this.next;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.depth;
/*    */   }
/*    */   
/*    */   public final boolean component3() {
/*    */     return this.isLeaf;
/*    */   }
/*    */   
/*    */   public final int component4() {
/*    */     return this.suffixLink;
/*    */   }
/*    */   
/*    */   public final int component5() {
/*    */     return this.suffixLinkToLeaf;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TrieNode copy(@NotNull Map<Character, Integer> next, int depth, boolean isLeaf, int suffixLink, int suffixLinkToLeaf) {
/*    */     Intrinsics.checkNotNullParameter(next, "next");
/*    */     return new TrieNode(next, depth, isLeaf, suffixLink, suffixLinkToLeaf);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TrieNode(next=" + this.next + ", depth=" + this.depth + ", isLeaf=" + this.isLeaf + ", suffixLink=" + this.suffixLink + ", suffixLinkToLeaf=" + this.suffixLinkToLeaf + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.next.hashCode();
/*    */     result = result * 31 + Integer.hashCode(this.depth);
/*    */     result = result * 31 + Boolean.hashCode(this.isLeaf);
/*    */     result = result * 31 + Integer.hashCode(this.suffixLink);
/*    */     return result * 31 + Integer.hashCode(this.suffixLinkToLeaf);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TrieNode))
/*    */       return false; 
/*    */     TrieNode trieNode = (TrieNode)other;
/*    */     return !Intrinsics.areEqual(this.next, trieNode.next) ? false : ((this.depth != trieNode.depth) ? false : ((this.isLeaf != trieNode.isLeaf) ? false : ((this.suffixLink != trieNode.suffixLink) ? false : (!(this.suffixLinkToLeaf != trieNode.suffixLinkToLeaf)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\AhoCorasickPattern$TrieNode.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */