/*     */ package ai.grazie.nlp.patterns;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\020\f\n\002\020\b\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\037\n\002\020\016\n\000\b\b\030\0002\0020\001Bu\022\"\020\002\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006\022\006\020\007\032\0020\005\022\006\020\b\032\0020\t\022\006\020\n\032\0020\005\022\006\020\013\032\0020\004\022\006\020\f\032\0020\005\022\"\020\r\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006¢\006\002\020\016J%\020\035\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006HÆ\003J\t\020\036\032\0020\005HÆ\003J\t\020\037\032\0020\tHÆ\003J\t\020 \032\0020\005HÆ\003J\t\020!\032\0020\004HÆ\003J\t\020\"\032\0020\005HÆ\003J%\020#\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006HÆ\003J\001\020$\032\0020\0002$\b\002\020\002\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\0062\b\b\002\020\007\032\0020\0052\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0052\b\b\002\020\013\032\0020\0042\b\b\002\020\f\032\0020\0052$\b\002\020\r\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006HÆ\001J\023\020%\032\0020\t2\b\020&\032\004\030\0010\001HÖ\003J\t\020'\032\0020\005HÖ\001J\t\020(\032\0020)HÖ\001R-\020\r\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006¢\006\b\n\000\032\004\b\017\020\020R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\021\020\022R\032\020\b\032\0020\tX\016¢\006\016\n\000\032\004\b\b\020\023\"\004\b\024\020\025R-\020\002\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006¢\006\b\n\000\032\004\b\026\020\020R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\027\020\030R\021\020\n\032\0020\005¢\006\b\n\000\032\004\b\031\020\022R\032\020\f\032\0020\005X\016¢\006\016\n\000\032\004\b\032\020\022\"\004\b\033\020\034¨\006*"}, d2 = {"Lai/grazie/nlp/patterns/AhoCorasickPattern$AhoCorasickBuilder$AutomataBuilderNode;", "", "next", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "depth", "isLeaf", "", "parentIdx", "parentEdgeChar", "suffixLink", "automataTransitions", "(Ljava/util/HashMap;IZICILjava/util/HashMap;)V", "getAutomataTransitions", "()Ljava/util/HashMap;", "getDepth", "()I", "()Z", "setLeaf", "(Z)V", "getNext", "getParentEdgeChar", "()C", "getParentIdx", "getSuffixLink", "setSuffixLink", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "nlp-patterns"})
/*     */ public final class AutomataBuilderNode
/*     */ {
/*     */   @NotNull
/*     */   private final HashMap<Character, Integer> next;
/*     */   private final int depth;
/*     */   private boolean isLeaf;
/*     */   private final int parentIdx;
/*     */   private final char parentEdgeChar;
/*     */   private int suffixLink;
/*     */   @NotNull
/*     */   private final HashMap<Character, Integer> automataTransitions;
/*     */   
/*     */   public AutomataBuilderNode(@NotNull HashMap<Character, Integer> next, int depth, boolean isLeaf, int parentIdx, char parentEdgeChar, int suffixLink, @NotNull HashMap<Character, Integer> automataTransitions) {
/*  98 */     this.next = next;
/*  99 */     this.depth = depth;
/* 100 */     this.isLeaf = isLeaf;
/* 101 */     this.parentIdx = parentIdx;
/* 102 */     this.parentEdgeChar = parentEdgeChar;
/* 103 */     this.suffixLink = suffixLink;
/* 104 */     this.automataTransitions = automataTransitions; } @NotNull public final HashMap<Character, Integer> getAutomataTransitions() { return this.automataTransitions; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final HashMap<Character, Integer> getNext() {
/*     */     return this.next;
/*     */   }
/*     */   
/*     */   public final int getDepth() {
/*     */     return this.depth;
/*     */   }
/*     */   
/*     */   public final boolean isLeaf() {
/*     */     return this.isLeaf;
/*     */   }
/*     */   
/*     */   public final void setLeaf(boolean <set-?>) {
/*     */     this.isLeaf = <set-?>;
/*     */   }
/*     */   
/*     */   public final int getParentIdx() {
/*     */     return this.parentIdx;
/*     */   }
/*     */   
/*     */   public final char getParentEdgeChar() {
/*     */     return this.parentEdgeChar;
/*     */   }
/*     */   
/*     */   public final int getSuffixLink() {
/*     */     return this.suffixLink;
/*     */   }
/*     */   
/*     */   public final void setSuffixLink(int <set-?>) {
/*     */     this.suffixLink = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final HashMap<Character, Integer> component1() {
/*     */     return this.next;
/*     */   }
/*     */   
/*     */   public final int component2() {
/*     */     return this.depth;
/*     */   }
/*     */   
/*     */   public final boolean component3() {
/*     */     return this.isLeaf;
/*     */   }
/*     */   
/*     */   public final int component4() {
/*     */     return this.parentIdx;
/*     */   }
/*     */   
/*     */   public final char component5() {
/*     */     return this.parentEdgeChar;
/*     */   }
/*     */   
/*     */   public final int component6() {
/*     */     return this.suffixLink;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final HashMap<Character, Integer> component7() {
/*     */     return this.automataTransitions;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final AutomataBuilderNode copy(@NotNull HashMap<Character, Integer> next, int depth, boolean isLeaf, int parentIdx, char parentEdgeChar, int suffixLink, @NotNull HashMap<Character, Integer> automataTransitions) {
/*     */     Intrinsics.checkNotNullParameter(next, "next");
/*     */     Intrinsics.checkNotNullParameter(automataTransitions, "automataTransitions");
/*     */     return new AutomataBuilderNode(next, depth, isLeaf, parentIdx, parentEdgeChar, suffixLink, automataTransitions);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "AutomataBuilderNode(next=" + this.next + ", depth=" + this.depth + ", isLeaf=" + this.isLeaf + ", parentIdx=" + this.parentIdx + ", parentEdgeChar=" + this.parentEdgeChar + ", suffixLink=" + this.suffixLink + ", automataTransitions=" + this.automataTransitions + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.next.hashCode();
/*     */     result = result * 31 + Integer.hashCode(this.depth);
/*     */     result = result * 31 + Boolean.hashCode(this.isLeaf);
/*     */     result = result * 31 + Integer.hashCode(this.parentIdx);
/*     */     result = result * 31 + Character.hashCode(this.parentEdgeChar);
/*     */     result = result * 31 + Integer.hashCode(this.suffixLink);
/*     */     return result * 31 + this.automataTransitions.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof AutomataBuilderNode))
/*     */       return false; 
/*     */     AutomataBuilderNode automataBuilderNode = (AutomataBuilderNode)other;
/*     */     return !Intrinsics.areEqual(this.next, automataBuilderNode.next) ? false : ((this.depth != automataBuilderNode.depth) ? false : ((this.isLeaf != automataBuilderNode.isLeaf) ? false : ((this.parentIdx != automataBuilderNode.parentIdx) ? false : ((this.parentEdgeChar != automataBuilderNode.parentEdgeChar) ? false : ((this.suffixLink != automataBuilderNode.suffixLink) ? false : (!!Intrinsics.areEqual(this.automataTransitions, automataBuilderNode.automataTransitions)))))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\AhoCorasickPattern$AhoCorasickBuilder$AutomataBuilderNode.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */