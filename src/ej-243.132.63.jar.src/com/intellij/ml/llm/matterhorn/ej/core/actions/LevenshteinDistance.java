/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.math.MathKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\020\016\n\002\b\006\n\002\020\006\n\002\b\005\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001:\001\034B\t\b\002¢\006\004\b\002\020\003J\026\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\013J1\020\r\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\0132\b\b\002\020\016\032\0020\0052\n\b\002\020\017\032\004\030\0010\t¢\006\002\020\020J \020\021\032\0020\0222\006\020\n\032\0020\0132\006\020\f\032\0020\0132\b\b\002\020\016\032\0020\005J'\020\023\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\0132\b\020\017\032\004\030\0010\tH\002¢\006\002\020\024J/\020\025\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\0132\006\020\016\032\0020\0052\b\020\017\032\004\030\0010\tH\002¢\006\002\020\020J \020\026\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\0132\006\020\016\032\0020\005H\002J$\020\027\032\016\022\004\022\0020\t\022\004\022\0020\t0\0302\006\020\n\032\0020\0132\006\020\f\032\0020\013H\002J4\020\031\032\016\022\004\022\0020\013\022\004\022\0020\0130\0302\006\020\n\032\0020\0132\006\020\f\032\0020\0132\006\020\032\032\0020\t2\006\020\033\032\0020\tH\002R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LevenshteinDistance;", "", "<init>", "()V", "DEFAULT_WEIGHTS", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LevenshteinDistance$Weights;", "getDEFAULT_WEIGHTS", "()Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LevenshteinDistance$Weights;", "ratio", "", "s1", "", "s2", "distance", "weights", "scoreCutoff", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LevenshteinDistance$Weights;Ljava/lang/Integer;)I", "normalizedDistance", "", "uniformDistance", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)I", "genericDistance", "maxDistance", "findCommonAffix", "Lkotlin/Pair;", "getTrimmedStrings", "prefixLen", "suffixLen", "Weights", "ej-core"})
/*     */ public final class LevenshteinDistance {
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\r\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B%\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\005\032\0020\003¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\003HÆ\003J\t\020\016\032\0020\003HÆ\003J'\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\003HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\003HÖ\001J\t\020\024\032\0020\025HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\n\020\tR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\013\020\t¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LevenshteinDistance$Weights;", "", "insertCost", "", "deleteCost", "substituteCost", "<init>", "(III)V", "getInsertCost", "()I", "getDeleteCost", "getSubstituteCost", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ej-core"})
/*     */   public static final class Weights {
/*     */     private final int insertCost;
/*     */     private final int deleteCost;
/*     */     private final int substituteCost;
/*     */     
/*  17 */     public Weights(int insertCost, int deleteCost, int substituteCost) { this.insertCost = insertCost;
/*  18 */       this.deleteCost = deleteCost;
/*  19 */       this.substituteCost = substituteCost; } public final int getInsertCost() { return this.insertCost; } public final int getDeleteCost() { return this.deleteCost; } public final int component1() { return this.insertCost; } public final int component2() { return this.deleteCost; } public final int component3() { return this.substituteCost; } @NotNull public final Weights copy(int insertCost, int deleteCost, int substituteCost) { return new Weights(insertCost, deleteCost, substituteCost); } public final int getSubstituteCost() { return this.substituteCost; }
/*     */     @NotNull public String toString() { return "Weights(insertCost=" + this.insertCost + ", deleteCost=" + this.deleteCost + ", substituteCost=" + this.substituteCost + ")"; }
/*     */     public int hashCode() { result = Integer.hashCode(this.insertCost); result = result * 31 + Integer.hashCode(this.deleteCost); return result * 31 + Integer.hashCode(this.substituteCost); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Weights)) return false;  Weights weights = (Weights)other; return (this.insertCost != weights.insertCost) ? false : ((this.deleteCost != weights.deleteCost) ? false : (!(this.substituteCost != weights.substituteCost))); } public Weights() { this(0, 0, 0, 7, null); }
/*  22 */   } @NotNull public static final LevenshteinDistance INSTANCE = new LevenshteinDistance(); @NotNull private static final Weights DEFAULT_WEIGHTS = new Weights(0, 0, 0, 7, null); @NotNull public final Weights getDEFAULT_WEIGHTS() { return DEFAULT_WEIGHTS; }
/*     */   
/*     */   public final int ratio(@NotNull String s1, @NotNull String s2) {
/*  25 */     Intrinsics.checkNotNullParameter(s1, "s1"); Intrinsics.checkNotNullParameter(s2, "s2"); int lengthMax = Math.max(s1.length(), s2.length());
/*  26 */     int distance = distance$default(this, s1, s2, null, null, 12, null);
/*  27 */     return MathKt.roundToInt(((lengthMax - distance) + 0.0D) / lengthMax * 100);
/*     */   }
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
/*     */   public final int distance(@NotNull String s1, @NotNull String s2, @NotNull Weights weights, @Nullable Integer scoreCutoff) {
/*  42 */     Intrinsics.checkNotNullParameter(s1, "s1"); Intrinsics.checkNotNullParameter(s2, "s2"); Intrinsics.checkNotNullParameter(weights, "weights"); if ((s1.length() == 0)) return s2.length() * weights.getInsertCost(); 
/*  43 */     if ((s2.length() == 0)) return s1.length() * weights.getDeleteCost();
/*     */     
/*  45 */     Pair<Integer, Integer> pair = findCommonAffix(s1, s2); int prefixLen = ((Number)pair.component1()).intValue(), suffixLen = ((Number)pair.component2()).intValue();
/*  46 */     Pair<String, String> pair1 = getTrimmedStrings(s1, s2, prefixLen, suffixLen); String trimmed1 = (String)pair1.component1(), trimmed2 = (String)pair1.component2();
/*     */     
/*  48 */     if ((trimmed1.length() == 0)) return trimmed2.length() * weights.getInsertCost(); 
/*  49 */     if ((trimmed2.length() == 0)) return trimmed1.length() * weights.getDeleteCost();
/*     */ 
/*     */     
/*  52 */     return 
/*  53 */       Intrinsics.areEqual(weights, DEFAULT_WEIGHTS) ? uniformDistance(trimmed1, trimmed2, scoreCutoff) : 
/*  54 */       genericDistance(trimmed1, trimmed2, weights, scoreCutoff);
/*     */   }
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
/*     */   public final double normalizedDistance(@NotNull String s1, @NotNull String s2, @NotNull Weights weights) {
/*  70 */     Intrinsics.checkNotNullParameter(s1, "s1"); Intrinsics.checkNotNullParameter(s2, "s2"); Intrinsics.checkNotNullParameter(weights, "weights"); int dist = distance$default(this, s1, s2, weights, null, 8, null);
/*  71 */     int maxDistance = maxDistance(s1, s2, weights);
/*  72 */     return dist / maxDistance;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int uniformDistance(String s1, String s2, Integer scoreCutoff) {
/*  79 */     int len1 = s1.length();
/*  80 */     int len2 = s2.length();
/*     */     byte b;
/*     */     int i, arrayOfInt1[];
/*  83 */     for (b = 0, i = len1 + 1, arrayOfInt1 = new int[i]; b < i; ) { byte b1 = b; arrayOfInt1[b1] = b1; b++; }  int[] cache = arrayOfInt1;
/*     */ 
/*     */     
/*  86 */     int j = 1; if (j <= len2)
/*  87 */       while (true) { int prevDiag = cache[0];
/*  88 */         cache[0] = j;
/*     */         
/*  90 */         int k = 1; if (k <= len1)
/*  91 */           while (true) { int temp = cache[k];
/*  92 */             cache[k] = (s1.charAt(k - 1) == s2.charAt(j - 1)) ? 
/*  93 */               prevDiag : 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  98 */               Math.min(prevDiag + 1, Math.min(cache[k - 1] + 1, cache[k] + 1));
/*     */ 
/*     */             
/* 101 */             prevDiag = temp; if (k != len1) {
/*     */               k++; continue;
/*     */             }  break; }
/*     */            
/* 105 */         if (scoreCutoff != null && cache[len1] > scoreCutoff.intValue())
/* 106 */           return scoreCutoff.intValue() + 1;  if (j != len2) {
/*     */           j++; continue;
/*     */         }  break; }
/*     */        
/* 110 */     return cache[len1];
/*     */   }
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
/*     */   private final int genericDistance(String s1, String s2, Weights weights, Integer scoreCutoff) {
/* 123 */     int len1 = s1.length(); int i, arrayOfInt1[];
/* 124 */     for (byte b = 0; b < i; ) { byte b1 = b; arrayOfInt1[b1] = b1 * weights.getDeleteCost(); b++; }  int[] cache = arrayOfInt1;
/*     */     
/* 126 */     int j = 1; i = s2.length(); if (j <= i)
/* 127 */       while (true) { int prevDiag = cache[0];
/* 128 */         cache[0] = j * weights.getInsertCost();
/*     */         
/* 130 */         int k = 1; if (k <= len1)
/* 131 */           while (true) { int temp = cache[k];
/* 132 */             cache[k] = (s1.charAt(k - 1) == s2.charAt(j - 1)) ? 
/* 133 */               prevDiag : 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 138 */               Math.min(prevDiag + weights.getSubstituteCost(), Math.min(cache[k - 1] + weights.getInsertCost(), cache[k] + weights.getDeleteCost()));
/*     */ 
/*     */             
/* 141 */             prevDiag = temp; if (k != len1) {
/*     */               k++; continue;
/*     */             }  break; }
/* 144 */             if (scoreCutoff != null && cache[len1] > scoreCutoff.intValue())
/* 145 */           return scoreCutoff.intValue() + 1;  if (j != i) {
/*     */           j++; continue;
/*     */         }  break; }
/*     */        
/* 149 */     return cache[len1];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int maxDistance(String s1, String s2, Weights weights) {
/* 156 */     int len1 = s1.length();
/* 157 */     int len2 = s2.length();
/*     */     
/* 159 */     int maxDist = len1 * weights.getDeleteCost() + len2 * weights.getInsertCost();
/*     */     
/* 161 */     if (len1 >= len2) {
/* 162 */       maxDist = 
/*     */         
/* 164 */         Math.min(maxDist, len2 * weights.getSubstituteCost() + (len1 - len2) * weights.getDeleteCost());
/*     */     } else {
/*     */       
/* 167 */       maxDist = 
/*     */         
/* 169 */         Math.min(maxDist, len1 * weights.getSubstituteCost() + (len2 - len1) * weights.getInsertCost());
/*     */     } 
/*     */ 
/*     */     
/* 173 */     return maxDist;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Pair<Integer, Integer> findCommonAffix(String s1, String s2) {
/* 180 */     int prefixLen = 0;
/* 181 */     int suffixLen = 0;
/*     */ 
/*     */     
/* 184 */     int minLen = Math.min(s1.length(), s2.length());
/* 185 */     while (prefixLen < minLen && s1.charAt(prefixLen) == s2.charAt(prefixLen)) {
/* 186 */       prefixLen++;
/*     */     }
/*     */ 
/*     */     
/* 190 */     while (suffixLen < minLen - prefixLen && 
/* 191 */       s1.charAt(s1.length() - 1 - suffixLen) == s2.charAt(s2.length() - 1 - suffixLen))
/*     */     {
/* 193 */       suffixLen++;
/*     */     }
/*     */     
/* 196 */     return new Pair(Integer.valueOf(prefixLen), Integer.valueOf(suffixLen));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Pair<String, String> getTrimmedStrings(String s1, String s2, int prefixLen, int suffixLen) {
/* 208 */     Intrinsics.checkNotNullExpressionValue(s1.substring(prefixLen, s1.length() - suffixLen), "substring(...)"); String trimmed1 = s1.substring(prefixLen, s1.length() - suffixLen);
/* 209 */     Intrinsics.checkNotNullExpressionValue(s2.substring(prefixLen, s2.length() - suffixLen), "substring(...)"); String trimmed2 = s2.substring(prefixLen, s2.length() - suffixLen);
/* 210 */     return new Pair(trimmed1, trimmed2);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\LevenshteinDistance.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */