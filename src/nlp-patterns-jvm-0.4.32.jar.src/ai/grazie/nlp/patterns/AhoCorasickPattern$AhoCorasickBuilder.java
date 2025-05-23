/*     */ package ai.grazie.nlp.patterns;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\020\f\n\002\b\002\030\0002\0020\001:\001\025B\005¢\006\002\020\002J\016\020\007\032\0020\b2\006\020\t\032\0020\nJ\f\020\013\032\b\022\004\022\0020\r0\fJ\020\020\016\032\0020\0172\006\020\020\032\0020\017H\002J\020\020\021\032\0020\0172\006\020\020\032\0020\017H\002J\030\020\022\032\0020\0172\006\020\020\032\0020\0172\006\020\023\032\0020\024H\002R\036\020\003\032\022\022\004\022\0020\0050\004j\b\022\004\022\0020\005`\006X\004¢\006\002\n\000¨\006\026"}, d2 = {"Lai/grazie/nlp/patterns/AhoCorasickPattern$AhoCorasickBuilder;", "", "()V", "automata", "Ljava/util/ArrayList;", "Lai/grazie/nlp/patterns/AhoCorasickPattern$AhoCorasickBuilder$AutomataBuilderNode;", "Lkotlin/collections/ArrayList;", "addWord", "", "word", "", "build", "", "Lai/grazie/nlp/patterns/AhoCorasickPattern$TrieNode;", "getSuffixLink", "", "nodeIdx", "getSuffixLinkToLeaf", "performTransition", "transitionChar", "", "AutomataBuilderNode", "nlp-patterns"})
/*     */ @SourceDebugExtension({"SMAP\nAhoCorasickPattern.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AhoCorasickPattern.kt\nai/grazie/nlp/patterns/AhoCorasickPattern$AhoCorasickBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,202:1\n1567#2:203\n1598#2,4:204\n*S KotlinDebug\n*F\n+ 1 AhoCorasickPattern.kt\nai/grazie/nlp/patterns/AhoCorasickPattern$AhoCorasickBuilder\n*L\n145#1:203\n145#1:204,4\n*E\n"})
/*     */ public final class AhoCorasickBuilder
/*     */ {
/*     */   @NotNull
/*     */   private final ArrayList<AutomataBuilderNode> automata;
/*     */   
/*     */   public AhoCorasickBuilder() {
/* 109 */     AutomataBuilderNode[] arrayOfAutomataBuilderNode = new AutomataBuilderNode[1];
/*     */     
/* 111 */     boolean bool = false; arrayOfAutomataBuilderNode[0] = new AutomataBuilderNode(new HashMap<>(), 0, false, 0, (char)bool, 0, 
/* 112 */         new HashMap<>());
/*     */     this.automata = CollectionsKt.arrayListOf((Object[])arrayOfAutomataBuilderNode);
/*     */   }
/*     */   
/*     */   public final void addWord(@NotNull String word) {
/* 117 */     Intrinsics.checkNotNullParameter(word, "word"); int nodeIdx = 0;
/*     */     
/* 119 */     for (int charIdx = 0, i = ((CharSequence)word).length(); charIdx < i; charIdx++)
/* 120 */     { char char = word.charAt(charIdx);
/*     */       
/* 122 */       Character character = Character.valueOf(char); if (!((AutomataBuilderNode)this.automata.get(nodeIdx)).getNext().containsKey(character)) {
/* 123 */         int newNodeIdx = this.automata.size(); Character character1 = Character.valueOf(char); Integer integer = Integer.valueOf(newNodeIdx);
/* 124 */         ((AutomataBuilderNode)this.automata.get(nodeIdx)).getNext().put(character1, integer);
/* 125 */         this.automata.add(
/* 126 */             new AutomataBuilderNode(
/* 127 */               new HashMap<>(), (
/* 128 */               (AutomataBuilderNode)this.automata.get(nodeIdx)).getDepth() + 1, 
/* 129 */               (charIdx == word.length() - 1), 
/* 130 */               nodeIdx, 
/* 131 */               char, 
/* 132 */               -1, 
/* 133 */               new HashMap<>()));
/*     */       } 
/*     */ 
/*     */       
/* 137 */       Intrinsics.checkNotNull(((AutomataBuilderNode)this.automata.get(nodeIdx)).getNext().get(Character.valueOf(char))); nodeIdx = ((AutomataBuilderNode)this.automata.get(nodeIdx)).getNext().get(Character.valueOf(char)).intValue();
/* 138 */       if (charIdx == word.length() - 1)
/* 139 */         ((AutomataBuilderNode)this.automata.get(nodeIdx)).setLeaf(true);  } 
/*     */   }
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\020\f\n\002\020\b\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\037\n\002\020\016\n\000\b\b\030\0002\0020\001Bu\022\"\020\002\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006\022\006\020\007\032\0020\005\022\006\020\b\032\0020\t\022\006\020\n\032\0020\005\022\006\020\013\032\0020\004\022\006\020\f\032\0020\005\022\"\020\r\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006¢\006\002\020\016J%\020\035\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006HÆ\003J\t\020\036\032\0020\005HÆ\003J\t\020\037\032\0020\tHÆ\003J\t\020 \032\0020\005HÆ\003J\t\020!\032\0020\004HÆ\003J\t\020\"\032\0020\005HÆ\003J%\020#\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006HÆ\003J\001\020$\032\0020\0002$\b\002\020\002\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\0062\b\b\002\020\007\032\0020\0052\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0052\b\b\002\020\013\032\0020\0042\b\b\002\020\f\032\0020\0052$\b\002\020\r\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006HÆ\001J\023\020%\032\0020\t2\b\020&\032\004\030\0010\001HÖ\003J\t\020'\032\0020\005HÖ\001J\t\020(\032\0020)HÖ\001R-\020\r\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006¢\006\b\n\000\032\004\b\017\020\020R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\021\020\022R\032\020\b\032\0020\tX\016¢\006\016\n\000\032\004\b\b\020\023\"\004\b\024\020\025R-\020\002\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006¢\006\b\n\000\032\004\b\026\020\020R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\027\020\030R\021\020\n\032\0020\005¢\006\b\n\000\032\004\b\031\020\022R\032\020\f\032\0020\005X\016¢\006\016\n\000\032\004\b\032\020\022\"\004\b\033\020\034¨\006*"}, d2 = {"Lai/grazie/nlp/patterns/AhoCorasickPattern$AhoCorasickBuilder$AutomataBuilderNode;", "", "next", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "depth", "isLeaf", "", "parentIdx", "parentEdgeChar", "suffixLink", "automataTransitions", "(Ljava/util/HashMap;IZICILjava/util/HashMap;)V", "getAutomataTransitions", "()Ljava/util/HashMap;", "getDepth", "()I", "()Z", "setLeaf", "(Z)V", "getNext", "getParentEdgeChar", "()C", "getParentIdx", "getSuffixLink", "setSuffixLink", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "nlp-patterns"}) public static final class AutomataBuilderNode {
/*     */     @NotNull private final HashMap<Character, Integer> next;
/*     */     private final int depth;
/*     */     private boolean isLeaf;
/* 145 */     private final int parentIdx; private final char parentEdgeChar; private int suffixLink; @NotNull private final HashMap<Character, Integer> automataTransitions; public AutomataBuilderNode(@NotNull HashMap<Character, Integer> next, int depth, boolean isLeaf, int parentIdx, char parentEdgeChar, int suffixLink, @NotNull HashMap<Character, Integer> automataTransitions) { this.next = next; this.depth = depth; this.isLeaf = isLeaf; this.parentIdx = parentIdx; this.parentEdgeChar = parentEdgeChar; this.suffixLink = suffixLink; this.automataTransitions = automataTransitions; } @NotNull public final HashMap<Character, Integer> getNext() { return this.next; } public final int getDepth() { return this.depth; } public final boolean isLeaf() { return this.isLeaf; } public final void setLeaf(boolean <set-?>) { this.isLeaf = <set-?>; } public final int getParentIdx() { return this.parentIdx; } public final char getParentEdgeChar() { return this.parentEdgeChar; } public final int getSuffixLink() { return this.suffixLink; } public final void setSuffixLink(int <set-?>) { this.suffixLink = <set-?>; } @NotNull public final HashMap<Character, Integer> getAutomataTransitions() { return this.automataTransitions; } @NotNull public final HashMap<Character, Integer> component1() { return this.next; } public final int component2() { return this.depth; } public final boolean component3() { return this.isLeaf; } public final int component4() { return this.parentIdx; } public final char component5() { return this.parentEdgeChar; } public final int component6() { return this.suffixLink; } @NotNull public final HashMap<Character, Integer> component7() { return this.automataTransitions; } @NotNull public final AutomataBuilderNode copy(@NotNull HashMap<Character, Integer> next, int depth, boolean isLeaf, int parentIdx, char parentEdgeChar, int suffixLink, @NotNull HashMap<Character, Integer> automataTransitions) { Intrinsics.checkNotNullParameter(next, "next"); Intrinsics.checkNotNullParameter(automataTransitions, "automataTransitions"); return new AutomataBuilderNode(next, depth, isLeaf, parentIdx, parentEdgeChar, suffixLink, automataTransitions); } @NotNull public String toString() { return "AutomataBuilderNode(next=" + this.next + ", depth=" + this.depth + ", isLeaf=" + this.isLeaf + ", parentIdx=" + this.parentIdx + ", parentEdgeChar=" + this.parentEdgeChar + ", suffixLink=" + this.suffixLink + ", automataTransitions=" + this.automataTransitions + ")"; } public int hashCode() { result = this.next.hashCode(); result = result * 31 + Integer.hashCode(this.depth); result = result * 31 + Boolean.hashCode(this.isLeaf); result = result * 31 + Integer.hashCode(this.parentIdx); result = result * 31 + Character.hashCode(this.parentEdgeChar); result = result * 31 + Integer.hashCode(this.suffixLink); return result * 31 + this.automataTransitions.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof AutomataBuilderNode)) return false;  AutomataBuilderNode automataBuilderNode = (AutomataBuilderNode)other; return !Intrinsics.areEqual(this.next, automataBuilderNode.next) ? false : ((this.depth != automataBuilderNode.depth) ? false : ((this.isLeaf != automataBuilderNode.isLeaf) ? false : ((this.parentIdx != automataBuilderNode.parentIdx) ? false : ((this.parentEdgeChar != automataBuilderNode.parentEdgeChar) ? false : ((this.suffixLink != automataBuilderNode.suffixLink) ? false : (!!Intrinsics.areEqual(this.automataTransitions, automataBuilderNode.automataTransitions))))))); } } @NotNull public final List<AhoCorasickPattern.TrieNode> build() { Iterable<AutomataBuilderNode> $this$mapIndexed$iv = this.automata; int $i$f$mapIndexed = 0;
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
/* 203 */     Iterable<AutomataBuilderNode> iterable1 = $this$mapIndexed$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$mapIndexed$iv, 10)); int $i$f$mapIndexedTo = 0;
/* 204 */     int index$iv$iv = 0;
/* 205 */     for (AutomataBuilderNode item$iv$iv : iterable1) {
/* 206 */       int i = index$iv$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  AutomataBuilderNode automataBuilderNode1 = item$iv$iv; int j = i; Collection collection = destination$iv$iv; int $i$a$-mapIndexed-AhoCorasickPattern$AhoCorasickBuilder$build$1 = 0;
/* 207 */     }  return (List<AhoCorasickPattern.TrieNode>)destination$iv$iv; }
/*     */ 
/*     */   
/*     */   private final int getSuffixLinkToLeaf(int nodeIdx) {
/*     */     int suffixIdx = getSuffixLink(nodeIdx);
/*     */     while (suffixIdx != 0) {
/*     */       if (((AutomataBuilderNode)this.automata.get(suffixIdx)).isLeaf())
/*     */         return suffixIdx; 
/*     */       suffixIdx = getSuffixLink(suffixIdx);
/*     */     } 
/*     */     return 0;
/*     */   }
/*     */   
/*     */   private final int getSuffixLink(int nodeIdx) {
/*     */     if (((AutomataBuilderNode)this.automata.get(nodeIdx)).getSuffixLink() == -1)
/*     */       if (nodeIdx == 0 || ((AutomataBuilderNode)this.automata.get(nodeIdx)).getParentIdx() == 0) {
/*     */         ((AutomataBuilderNode)this.automata.get(nodeIdx)).setSuffixLink(0);
/*     */       } else {
/*     */         ((AutomataBuilderNode)this.automata.get(nodeIdx)).setSuffixLink(performTransition(getSuffixLink(((AutomataBuilderNode)this.automata.get(nodeIdx)).getParentIdx()), ((AutomataBuilderNode)this.automata.get(nodeIdx)).getParentEdgeChar()));
/*     */       }  
/*     */     return ((AutomataBuilderNode)this.automata.get(nodeIdx)).getSuffixLink();
/*     */   }
/*     */   
/*     */   private final int performTransition(int nodeIdx, char transitionChar) {
/*     */     Character character = Character.valueOf(transitionChar);
/*     */     if (!((AutomataBuilderNode)this.automata.get(nodeIdx)).getAutomataTransitions().containsKey(character)) {
/*     */       HashMap<Character, Integer> hashMap = ((AutomataBuilderNode)this.automata.get(nodeIdx)).getAutomataTransitions();
/*     */       character = Character.valueOf(transitionChar);
/*     */       Character character1 = Character.valueOf(transitionChar);
/*     */       Intrinsics.checkNotNull(((AutomataBuilderNode)this.automata.get(nodeIdx)).getNext().get(Character.valueOf(transitionChar)));
/*     */       Intrinsics.checkNotNullExpressionValue(((AutomataBuilderNode)this.automata.get(nodeIdx)).getNext().containsKey(character1) ? ((AutomataBuilderNode)this.automata.get(nodeIdx)).getNext().get(Character.valueOf(transitionChar)) : Integer.valueOf((nodeIdx == 0) ? 0 : performTransition(getSuffixLink(nodeIdx), transitionChar)), "if (transitionChar in au…ar)\n                    }");
/*     */       Object object = ((AutomataBuilderNode)this.automata.get(nodeIdx)).getNext().containsKey(character1) ? ((AutomataBuilderNode)this.automata.get(nodeIdx)).getNext().get(Character.valueOf(transitionChar)) : Integer.valueOf((nodeIdx == 0) ? 0 : performTransition(getSuffixLink(nodeIdx), transitionChar));
/*     */       hashMap.put(character, object);
/*     */     } 
/*     */     Intrinsics.checkNotNull(((AutomataBuilderNode)this.automata.get(nodeIdx)).getAutomataTransitions().get(Character.valueOf(transitionChar)));
/*     */     return ((AutomataBuilderNode)this.automata.get(nodeIdx)).getAutomataTransitions().get(Character.valueOf(transitionChar)).intValue();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\AhoCorasickPattern$AhoCorasickBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */