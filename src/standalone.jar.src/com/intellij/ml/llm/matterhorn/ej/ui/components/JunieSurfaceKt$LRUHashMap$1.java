/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020'\n\000*\001\000\b\n\030\0002\036\022\004\022\0028\000\022\004\022\0028\0010\001j\016\022\004\022\0028\000\022\004\022\0028\001`\002J\036\020\003\032\0020\0042\024\020\005\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\006H\024¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/components/JunieSurfaceKt$LRUHashMap$1", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "removeEldestEntry", "", "eldest", "", "standalone"})
/*     */ public final class JunieSurfaceKt$LRUHashMap$1
/*     */   extends LinkedHashMap<K, V>
/*     */ {
/*     */   JunieSurfaceKt$LRUHashMap$1(int $initialCapacity, float $loadFactor, boolean $accessOrder, int $maxCapacity) {
/* 120 */     super($initialCapacity, $loadFactor, $accessOrder); } protected boolean removeEldestEntry(Map.Entry eldest) {
/* 121 */     return (size() > this.$maxCapacity);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieSurfaceKt$LRUHashMap$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */