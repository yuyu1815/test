/*     */ package ai.grazie.nlp.patterns;
/*     */ 
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\r\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\006\n\002\020\f\n\002\b\004\b\026\030\0002\0020\001:\003\027\030\031B\023\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J\026\020\b\032\b\022\004\022\0020\t0\0032\006\020\n\032\0020\013H\026J\032\020\f\032\004\030\0010\r2\006\020\n\032\0020\0132\006\020\016\032\0020\017H\024J \020\020\032\0020\0172\006\020\n\032\0020\0132\006\020\021\032\0020\0172\006\020\022\032\0020\017H\002J\030\020\023\032\0020\0172\006\020\024\032\0020\0172\006\020\025\032\0020\026H\002R\024\020\006\032\b\022\004\022\0020\0070\003X\004¢\006\002\n\000¨\006\032"}, d2 = {"Lai/grazie/nlp/patterns/AhoCorasickPattern;", "Lai/grazie/nlp/patterns/Pattern;", "words", "", "", "(Ljava/util/List;)V", "trie", "Lai/grazie/nlp/patterns/AhoCorasickPattern$TrieNode;", "find", "Lai/grazie/text/TextRange;", "text", "", "findWideChar", "Lai/grazie/nlp/patterns/AhoCorasickPattern$WideChar;", "offset", "", "retreat", "last", "depth", "transition", "nodeIdx", "c", "", "AhoCorasickBuilder", "TrieNode", "WideChar", "nlp-patterns"})
/*     */ public class AhoCorasickPattern implements Pattern {
/*     */   @NotNull
/*     */   private final List<TrieNode> trie;
/*     */   
/*  19 */   public AhoCorasickPattern(@NotNull List words) { AhoCorasickBuilder builder = new AhoCorasickBuilder();
/*  20 */     for (String word : CollectionsKt.distinct(CollectionsKt.sorted(words))) {
/*  21 */       builder.addWord(word);
/*     */     }
/*  23 */     this.trie = builder.build(); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020$\n\002\020\f\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\024\n\002\020\016\n\000\b\b\030\0002\0020\001B9\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003\022\006\020\006\032\0020\005\022\006\020\007\032\0020\b\022\006\020\t\032\0020\005\022\006\020\n\032\0020\005¢\006\002\020\013J\025\020\023\032\016\022\004\022\0020\004\022\004\022\0020\0050\003HÆ\003J\t\020\024\032\0020\005HÆ\003J\t\020\025\032\0020\bHÆ\003J\t\020\026\032\0020\005HÆ\003J\t\020\027\032\0020\005HÆ\003JG\020\030\032\0020\0002\024\b\002\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\0032\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\0052\b\b\002\020\n\032\0020\005HÆ\001J\023\020\031\032\0020\b2\b\020\032\032\004\030\0010\001HÖ\003J\t\020\033\032\0020\005HÖ\001J\t\020\034\032\0020\035HÖ\001R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\007\020\016R\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\017\020\020R\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\021\020\rR\021\020\n\032\0020\005¢\006\b\n\000\032\004\b\022\020\r¨\006\036"}, d2 = {"Lai/grazie/nlp/patterns/AhoCorasickPattern$TrieNode;", "", "next", "", "", "", "depth", "isLeaf", "", "suffixLink", "suffixLinkToLeaf", "(Ljava/util/Map;IZII)V", "getDepth", "()I", "()Z", "getNext", "()Ljava/util/Map;", "getSuffixLink", "getSuffixLinkToLeaf", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "nlp-patterns"}) public static final class TrieNode {
/*     */     @NotNull private final Map<Character, Integer> next; private final int depth; private final boolean isLeaf; private final int suffixLink; private final int suffixLinkToLeaf; public TrieNode(@NotNull Map<Character, Integer> next, int depth, boolean isLeaf, int suffixLink, int suffixLinkToLeaf) { this.next = next; this.depth = depth; this.isLeaf = isLeaf; this.suffixLink = suffixLink; this.suffixLinkToLeaf = suffixLinkToLeaf; } @NotNull public final Map<Character, Integer> getNext() { return this.next; } public final int getDepth() { return this.depth; } public final boolean isLeaf() { return this.isLeaf; } public final int getSuffixLink() { return this.suffixLink; } public final int getSuffixLinkToLeaf() { return this.suffixLinkToLeaf; } @NotNull public final Map<Character, Integer> component1() { return this.next; } public final int component2() { return this.depth; } public final boolean component3() { return this.isLeaf; } public final int component4() { return this.suffixLink; } public final int component5() { return this.suffixLinkToLeaf; } @NotNull public final TrieNode copy(@NotNull Map<Character, Integer> next, int depth, boolean isLeaf, int suffixLink, int suffixLinkToLeaf) { Intrinsics.checkNotNullParameter(next, "next"); return new TrieNode(next, depth, isLeaf, suffixLink, suffixLinkToLeaf); } @NotNull public String toString() { return "TrieNode(next=" + this.next + ", depth=" + this.depth + ", isLeaf=" + this.isLeaf + ", suffixLink=" + this.suffixLink + ", suffixLinkToLeaf=" + this.suffixLinkToLeaf + ")"; }
/*     */     public int hashCode() { result = this.next.hashCode(); result = result * 31 + Integer.hashCode(this.depth); result = result * 31 + Boolean.hashCode(this.isLeaf); result = result * 31 + Integer.hashCode(this.suffixLink); return result * 31 + Integer.hashCode(this.suffixLinkToLeaf); }
/*     */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof TrieNode)) return false;  TrieNode trieNode = (TrieNode)other; return !Intrinsics.areEqual(this.next, trieNode.next) ? false : ((this.depth != trieNode.depth) ? false : ((this.isLeaf != trieNode.isLeaf) ? false : ((this.suffixLink != trieNode.suffixLink) ? false : (!(this.suffixLinkToLeaf != trieNode.suffixLinkToLeaf))))); } }
/*  27 */   @NotNull public List<TextRange> find(@NotNull CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); ArrayList<TextRange> matches = new ArrayList();
/*     */     
/*  29 */     int nodeIdx = 0;
/*  30 */     int idx = 0;
/*  31 */     boolean hadWide = false;
/*  32 */     while (idx < text.length()) {
/*  33 */       WideChar wide = findWideChar(text, idx);
/*  34 */       char c = (wide != null) ? wide.getMain() : text.charAt(idx);
/*  35 */       if (wide != null) {
/*  36 */         hadWide = true;
/*     */       }
/*  38 */       nodeIdx = transition(nodeIdx, c);
/*  39 */       TrieNode node = this.trie.get(nodeIdx);
/*     */       
/*  41 */       int nextStart = (wide != null) ? wide.getEndExclusive() : (idx + 1);
/*     */ 
/*     */       
/*  44 */       if (node.isLeaf()) {
/*  45 */         int length = node.getDepth();
/*  46 */         matches.add(new TextRange(hadWide ? retreat(text, idx, length) : (idx - length + 1), nextStart));
/*     */       } 
/*     */ 
/*     */       
/*  50 */       int possibleLeafIdx = node.getSuffixLinkToLeaf();
/*  51 */       while (possibleLeafIdx != 0) {
/*  52 */         int length = ((TrieNode)this.trie.get(possibleLeafIdx)).getDepth();
/*  53 */         matches.add(new TextRange(hadWide ? retreat(text, idx, length) : (idx - length + 1), nextStart));
/*  54 */         possibleLeafIdx = ((TrieNode)this.trie.get(possibleLeafIdx)).getSuffixLinkToLeaf();
/*     */       } 
/*  56 */       idx = nextStart;
/*     */     } 
/*     */     
/*  59 */     return matches; }
/*     */   
/*     */   @Nullable
/*     */   protected WideChar findWideChar(@NotNull CharSequence text, int offset) {
/*  63 */     Intrinsics.checkNotNullParameter(text, "text"); return null;
/*     */   }
/*     */   
/*     */   private final int retreat(CharSequence text, int last, int depth) {
/*  67 */     int start = last;
/*  68 */     int i = 2; if (i <= depth)
/*  69 */       while (true) { WideChar wide = findWideChar(text, start - 1);
/*  70 */         start = (wide != null) ? wide.getStart() : (start - 1); if (i != depth) { i++; continue; }
/*     */          break; }
/*  72 */         return start;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\020\f\n\002\b\013\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\002\020\007J\t\020\r\032\0020\003HÆ\003J\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\006HÆ\003J'\020\020\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001HÖ\003J\t\020\024\032\0020\003HÖ\001J\t\020\025\032\0020\026HÖ\001R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\t¨\006\027"}, d2 = {"Lai/grazie/nlp/patterns/AhoCorasickPattern$WideChar;", "", "start", "", "endExclusive", "main", "", "(IIC)V", "getEndExclusive", "()I", "getMain", "()C", "getStart", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "nlp-patterns"})
/*     */   protected static final class WideChar
/*     */   {
/*     */     private final int start;
/*     */     private final int endExclusive;
/*     */     private final char main;
/*     */     
/*  82 */     public WideChar(int start, int endExclusive, char main) { this.start = start; this.endExclusive = endExclusive; this.main = main; } public final int getStart() { return this.start; } public final int getEndExclusive() { return this.endExclusive; } public final char getMain() { return this.main; } public final int component1() { return this.start; } public final int component2() { return this.endExclusive; } public final char component3() { return this.main; } @NotNull public final WideChar copy(int start, int endExclusive, char main) { return new WideChar(start, endExclusive, main); } @NotNull public String toString() { return "WideChar(start=" + this.start + ", endExclusive=" + this.endExclusive + ", main=" + this.main + ")"; }
/*     */     public int hashCode() { result = Integer.hashCode(this.start); result = result * 31 + Integer.hashCode(this.endExclusive); return result * 31 + Character.hashCode(this.main); }
/*     */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof WideChar)) return false;  WideChar wideChar = (WideChar)other; return (this.start != wideChar.start) ? false : ((this.endExclusive != wideChar.endExclusive) ? false : (!(this.main != wideChar.main))); } }
/*  85 */   private final int transition(int nodeIdx, char c) { Integer next = ((TrieNode)this.trie.get(nodeIdx)).getNext().get(Character.valueOf(c));
/*  86 */     if (next != null) {
/*  87 */       return next.intValue();
/*     */     }
/*  89 */     if (nodeIdx == 0) {
/*  90 */       return 0;
/*     */     }
/*     */     
/*  93 */     return transition(((TrieNode)this.trie.get(nodeIdx)).getSuffixLink(), c); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\020\f\n\002\b\002\030\0002\0020\001:\001\025B\005¢\006\002\020\002J\016\020\007\032\0020\b2\006\020\t\032\0020\nJ\f\020\013\032\b\022\004\022\0020\r0\fJ\020\020\016\032\0020\0172\006\020\020\032\0020\017H\002J\020\020\021\032\0020\0172\006\020\020\032\0020\017H\002J\030\020\022\032\0020\0172\006\020\020\032\0020\0172\006\020\023\032\0020\024H\002R\036\020\003\032\022\022\004\022\0020\0050\004j\b\022\004\022\0020\005`\006X\004¢\006\002\n\000¨\006\026"}, d2 = {"Lai/grazie/nlp/patterns/AhoCorasickPattern$AhoCorasickBuilder;", "", "()V", "automata", "Ljava/util/ArrayList;", "Lai/grazie/nlp/patterns/AhoCorasickPattern$AhoCorasickBuilder$AutomataBuilderNode;", "Lkotlin/collections/ArrayList;", "addWord", "", "word", "", "build", "", "Lai/grazie/nlp/patterns/AhoCorasickPattern$TrieNode;", "getSuffixLink", "", "nodeIdx", "getSuffixLinkToLeaf", "performTransition", "transitionChar", "", "AutomataBuilderNode", "nlp-patterns"})
/*     */   @SourceDebugExtension({"SMAP\nAhoCorasickPattern.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AhoCorasickPattern.kt\nai/grazie/nlp/patterns/AhoCorasickPattern$AhoCorasickBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,202:1\n1567#2:203\n1598#2,4:204\n*S KotlinDebug\n*F\n+ 1 AhoCorasickPattern.kt\nai/grazie/nlp/patterns/AhoCorasickPattern$AhoCorasickBuilder\n*L\n145#1:203\n145#1:204,4\n*E\n"})
/*     */   public static final class AhoCorasickBuilder
/*     */   {
/*     */     @NotNull
/*     */     private final ArrayList<AutomataBuilderNode> automata;
/*     */ 
/*     */ 
/*     */     
/*     */     public AhoCorasickBuilder() {
/* 109 */       AutomataBuilderNode[] arrayOfAutomataBuilderNode = new AutomataBuilderNode[1];
/*     */       
/* 111 */       boolean bool = false; arrayOfAutomataBuilderNode[0] = new AutomataBuilderNode(new HashMap<>(), 0, false, 0, (char)bool, 0, 
/* 112 */           new HashMap<>());
/*     */       this.automata = CollectionsKt.arrayListOf((Object[])arrayOfAutomataBuilderNode);
/*     */     }
/*     */     
/*     */     public final void addWord(@NotNull String word) {
/* 117 */       Intrinsics.checkNotNullParameter(word, "word"); int nodeIdx = 0;
/*     */       
/* 119 */       for (int charIdx = 0, i = ((CharSequence)word).length(); charIdx < i; charIdx++)
/* 120 */       { char char = word.charAt(charIdx);
/*     */         
/* 122 */         Character character = Character.valueOf(char); if (!((AutomataBuilderNode)this.automata.get(nodeIdx)).getNext().containsKey(character)) {
/* 123 */           int newNodeIdx = this.automata.size(); Character character1 = Character.valueOf(char); Integer integer = Integer.valueOf(newNodeIdx);
/* 124 */           ((AutomataBuilderNode)this.automata.get(nodeIdx)).getNext().put(character1, integer);
/* 125 */           this.automata.add(
/* 126 */               new AutomataBuilderNode(
/* 127 */                 new HashMap<>(), (
/* 128 */                 (AutomataBuilderNode)this.automata.get(nodeIdx)).getDepth() + 1, 
/* 129 */                 (charIdx == word.length() - 1), 
/* 130 */                 nodeIdx, 
/* 131 */                 char, 
/* 132 */                 -1, 
/* 133 */                 new HashMap<>()));
/*     */         } 
/*     */ 
/*     */         
/* 137 */         Intrinsics.checkNotNull(((AutomataBuilderNode)this.automata.get(nodeIdx)).getNext().get(Character.valueOf(char))); nodeIdx = ((AutomataBuilderNode)this.automata.get(nodeIdx)).getNext().get(Character.valueOf(char)).intValue();
/* 138 */         if (charIdx == word.length() - 1)
/* 139 */           ((AutomataBuilderNode)this.automata.get(nodeIdx)).setLeaf(true);  } 
/*     */     }
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\020\f\n\002\020\b\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\037\n\002\020\016\n\000\b\b\030\0002\0020\001Bu\022\"\020\002\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006\022\006\020\007\032\0020\005\022\006\020\b\032\0020\t\022\006\020\n\032\0020\005\022\006\020\013\032\0020\004\022\006\020\f\032\0020\005\022\"\020\r\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006¢\006\002\020\016J%\020\035\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006HÆ\003J\t\020\036\032\0020\005HÆ\003J\t\020\037\032\0020\tHÆ\003J\t\020 \032\0020\005HÆ\003J\t\020!\032\0020\004HÆ\003J\t\020\"\032\0020\005HÆ\003J%\020#\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006HÆ\003J\001\020$\032\0020\0002$\b\002\020\002\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\0062\b\b\002\020\007\032\0020\0052\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0052\b\b\002\020\013\032\0020\0042\b\b\002\020\f\032\0020\0052$\b\002\020\r\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006HÆ\001J\023\020%\032\0020\t2\b\020&\032\004\030\0010\001HÖ\003J\t\020'\032\0020\005HÖ\001J\t\020(\032\0020)HÖ\001R-\020\r\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006¢\006\b\n\000\032\004\b\017\020\020R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\021\020\022R\032\020\b\032\0020\tX\016¢\006\016\n\000\032\004\b\b\020\023\"\004\b\024\020\025R-\020\002\032\036\022\004\022\0020\004\022\004\022\0020\0050\003j\016\022\004\022\0020\004\022\004\022\0020\005`\006¢\006\b\n\000\032\004\b\026\020\020R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\027\020\030R\021\020\n\032\0020\005¢\006\b\n\000\032\004\b\031\020\022R\032\020\f\032\0020\005X\016¢\006\016\n\000\032\004\b\032\020\022\"\004\b\033\020\034¨\006*"}, d2 = {"Lai/grazie/nlp/patterns/AhoCorasickPattern$AhoCorasickBuilder$AutomataBuilderNode;", "", "next", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "depth", "isLeaf", "", "parentIdx", "parentEdgeChar", "suffixLink", "automataTransitions", "(Ljava/util/HashMap;IZICILjava/util/HashMap;)V", "getAutomataTransitions", "()Ljava/util/HashMap;", "getDepth", "()I", "()Z", "setLeaf", "(Z)V", "getNext", "getParentEdgeChar", "()C", "getParentIdx", "getSuffixLink", "setSuffixLink", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "nlp-patterns"}) public static final class AutomataBuilderNode {
/*     */       @NotNull private final HashMap<Character, Integer> next;
/*     */       private final int depth;
/*     */       private boolean isLeaf;
/* 145 */       private final int parentIdx; private final char parentEdgeChar; private int suffixLink; @NotNull private final HashMap<Character, Integer> automataTransitions; public AutomataBuilderNode(@NotNull HashMap<Character, Integer> next, int depth, boolean isLeaf, int parentIdx, char parentEdgeChar, int suffixLink, @NotNull HashMap<Character, Integer> automataTransitions) { this.next = next; this.depth = depth; this.isLeaf = isLeaf; this.parentIdx = parentIdx; this.parentEdgeChar = parentEdgeChar; this.suffixLink = suffixLink; this.automataTransitions = automataTransitions; } @NotNull public final HashMap<Character, Integer> getNext() { return this.next; } public final int getDepth() { return this.depth; } public final boolean isLeaf() { return this.isLeaf; } public final void setLeaf(boolean <set-?>) { this.isLeaf = <set-?>; } public final int getParentIdx() { return this.parentIdx; } public final char getParentEdgeChar() { return this.parentEdgeChar; } public final int getSuffixLink() { return this.suffixLink; } public final void setSuffixLink(int <set-?>) { this.suffixLink = <set-?>; } @NotNull public final HashMap<Character, Integer> getAutomataTransitions() { return this.automataTransitions; } @NotNull public final HashMap<Character, Integer> component1() { return this.next; } public final int component2() { return this.depth; } public final boolean component3() { return this.isLeaf; } public final int component4() { return this.parentIdx; } public final char component5() { return this.parentEdgeChar; } public final int component6() { return this.suffixLink; } @NotNull public final HashMap<Character, Integer> component7() { return this.automataTransitions; } @NotNull public final AutomataBuilderNode copy(@NotNull HashMap<Character, Integer> next, int depth, boolean isLeaf, int parentIdx, char parentEdgeChar, int suffixLink, @NotNull HashMap<Character, Integer> automataTransitions) { Intrinsics.checkNotNullParameter(next, "next"); Intrinsics.checkNotNullParameter(automataTransitions, "automataTransitions"); return new AutomataBuilderNode(next, depth, isLeaf, parentIdx, parentEdgeChar, suffixLink, automataTransitions); } @NotNull public String toString() { return "AutomataBuilderNode(next=" + this.next + ", depth=" + this.depth + ", isLeaf=" + this.isLeaf + ", parentIdx=" + this.parentIdx + ", parentEdgeChar=" + this.parentEdgeChar + ", suffixLink=" + this.suffixLink + ", automataTransitions=" + this.automataTransitions + ")"; } public int hashCode() { result = this.next.hashCode(); result = result * 31 + Integer.hashCode(this.depth); result = result * 31 + Boolean.hashCode(this.isLeaf); result = result * 31 + Integer.hashCode(this.parentIdx); result = result * 31 + Character.hashCode(this.parentEdgeChar); result = result * 31 + Integer.hashCode(this.suffixLink); return result * 31 + this.automataTransitions.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof AutomataBuilderNode)) return false;  AutomataBuilderNode automataBuilderNode = (AutomataBuilderNode)other; return !Intrinsics.areEqual(this.next, automataBuilderNode.next) ? false : ((this.depth != automataBuilderNode.depth) ? false : ((this.isLeaf != automataBuilderNode.isLeaf) ? false : ((this.parentIdx != automataBuilderNode.parentIdx) ? false : ((this.parentEdgeChar != automataBuilderNode.parentEdgeChar) ? false : ((this.suffixLink != automataBuilderNode.suffixLink) ? false : (!!Intrinsics.areEqual(this.automataTransitions, automataBuilderNode.automataTransitions))))))); } } @NotNull public final List<AhoCorasickPattern.TrieNode> build() { Iterable<AutomataBuilderNode> $this$mapIndexed$iv = this.automata; int $i$f$mapIndexed = 0;
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
/* 203 */       Iterable<AutomataBuilderNode> iterable1 = $this$mapIndexed$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$mapIndexed$iv, 10)); int $i$f$mapIndexedTo = 0;
/* 204 */       int index$iv$iv = 0;
/* 205 */       for (AutomataBuilderNode item$iv$iv : iterable1) {
/* 206 */         int i = index$iv$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  AutomataBuilderNode automataBuilderNode1 = item$iv$iv; int j = i; Collection collection = destination$iv$iv; int $i$a$-mapIndexed-AhoCorasickPattern$AhoCorasickBuilder$build$1 = 0;
/* 207 */       }  return (List<AhoCorasickPattern.TrieNode>)destination$iv$iv; }
/*     */ 
/*     */     
/*     */     private final int getSuffixLinkToLeaf(int nodeIdx) {
/*     */       int suffixIdx = getSuffixLink(nodeIdx);
/*     */       while (suffixIdx != 0) {
/*     */         if (((AutomataBuilderNode)this.automata.get(suffixIdx)).isLeaf())
/*     */           return suffixIdx; 
/*     */         suffixIdx = getSuffixLink(suffixIdx);
/*     */       } 
/*     */       return 0;
/*     */     }
/*     */     
/*     */     private final int getSuffixLink(int nodeIdx) {
/*     */       if (((AutomataBuilderNode)this.automata.get(nodeIdx)).getSuffixLink() == -1)
/*     */         if (nodeIdx == 0 || ((AutomataBuilderNode)this.automata.get(nodeIdx)).getParentIdx() == 0) {
/*     */           ((AutomataBuilderNode)this.automata.get(nodeIdx)).setSuffixLink(0);
/*     */         } else {
/*     */           ((AutomataBuilderNode)this.automata.get(nodeIdx)).setSuffixLink(performTransition(getSuffixLink(((AutomataBuilderNode)this.automata.get(nodeIdx)).getParentIdx()), ((AutomataBuilderNode)this.automata.get(nodeIdx)).getParentEdgeChar()));
/*     */         }  
/*     */       return ((AutomataBuilderNode)this.automata.get(nodeIdx)).getSuffixLink();
/*     */     }
/*     */     
/*     */     private final int performTransition(int nodeIdx, char transitionChar) {
/*     */       Character character = Character.valueOf(transitionChar);
/*     */       if (!((AutomataBuilderNode)this.automata.get(nodeIdx)).getAutomataTransitions().containsKey(character)) {
/*     */         HashMap<Character, Integer> hashMap = ((AutomataBuilderNode)this.automata.get(nodeIdx)).getAutomataTransitions();
/*     */         character = Character.valueOf(transitionChar);
/*     */         Character character1 = Character.valueOf(transitionChar);
/*     */         Intrinsics.checkNotNull(((AutomataBuilderNode)this.automata.get(nodeIdx)).getNext().get(Character.valueOf(transitionChar)));
/*     */         Intrinsics.checkNotNullExpressionValue(((AutomataBuilderNode)this.automata.get(nodeIdx)).getNext().containsKey(character1) ? ((AutomataBuilderNode)this.automata.get(nodeIdx)).getNext().get(Character.valueOf(transitionChar)) : Integer.valueOf((nodeIdx == 0) ? 0 : performTransition(getSuffixLink(nodeIdx), transitionChar)), "if (transitionChar in au…ar)\n                    }");
/*     */         Object object = ((AutomataBuilderNode)this.automata.get(nodeIdx)).getNext().containsKey(character1) ? ((AutomataBuilderNode)this.automata.get(nodeIdx)).getNext().get(Character.valueOf(transitionChar)) : Integer.valueOf((nodeIdx == 0) ? 0 : performTransition(getSuffixLink(nodeIdx), transitionChar));
/*     */         hashMap.put(character, object);
/*     */       } 
/*     */       Intrinsics.checkNotNull(((AutomataBuilderNode)this.automata.get(nodeIdx)).getAutomataTransitions().get(Character.valueOf(transitionChar)));
/*     */       return ((AutomataBuilderNode)this.automata.get(nodeIdx)).getAutomataTransitions().get(Character.valueOf(transitionChar)).intValue();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\AhoCorasickPattern.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */