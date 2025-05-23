/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
/*     */ import androidx.compose.ui.node.DrawModifierNode;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\b\n\002\030\002\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\b\002\030\0002\0020\0012\0020\002B\027\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\016\020\023\032\0020\0242\006\020\005\032\0020\006J\f\020\025\032\0020\024*\0020\026H\026R\034\020\003\032\0020\004X\016¢\006\020\n\002\020\r\032\004\b\t\020\n\"\004\b\013\020\fRN\020\016\032B\022\004\022\0020\006\022\026\022\024\022\020\022\016\022\004\022\0020\006\022\004\022\0020\0060\0210\0200\017j \022\004\022\0020\006\022\026\022\024\022\020\022\016\022\004\022\0020\006\022\004\022\0020\0060\0210\020`\022X\016¢\006\002\n\000¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/components/JunieBackgroundNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "color", "Landroidx/compose/ui/graphics/Color;", "maxCapacity", "", "<init>", "(JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "setColor-8_81llA", "(J)V", "J", "cache", "Ljava/util/LinkedHashMap;", "", "Lkotlin/Pair;", "Lkotlin/collections/LinkedHashMap;", "updateCacheSize", "", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "standalone"})
/*     */ @SourceDebugExtension({"SMAP\nJunieSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieSurface.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieBackgroundNode\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n381#2,7:159\n1863#3,2:166\n*S KotlinDebug\n*F\n+ 1 JunieSurface.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieBackgroundNode\n*L\n83#1:159,7\n84#1:166,2\n*E\n"})
/*     */ final class JunieBackgroundNode
/*     */   extends Modifier.Node
/*     */   implements DrawModifierNode
/*     */ {
/*     */   private long color;
/*     */   @NotNull
/*     */   private LinkedHashMap<Integer, List<Pair<Integer, Integer>>> cache;
/*     */   
/*     */   private JunieBackgroundNode(long color, int maxCapacity) {
/*  74 */     this.color = color;
/*  75 */     this.cache = JunieSurfaceKt.LRUHashMap$default(maxCapacity, 0, 0.0F, false, 14, null); } public final long getColor-0d7_KjU() {
/*     */     return this.color;
/*     */   } public final void updateCacheSize(int maxCapacity) {
/*  78 */     this.cache = JunieSurfaceKt.access$LRUHashMap(this.cache, maxCapacity);
/*     */   } public final void setColor-8_81llA(long <set-?>) {
/*     */     this.color = <set-?>;
/*     */   } public void draw(@NotNull ContentDrawScope $this$draw) {
/*  82 */     Intrinsics.checkNotNullParameter($this$draw, "<this>"); int n = (int)Math.max(Size.getWidth-impl($this$draw.getSize-NH-jbRc()), Size.getHeight-impl($this$draw.getSize-NH-jbRc())) / 25;
/*  83 */     LinkedHashMap<Integer, List<Pair<Integer, Integer>>> linkedHashMap = this.cache; Object key$iv = Integer.valueOf(n); int $i$f$getOrPut = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 159 */     Object<Pair<Integer, Integer>> value$iv = (Object<Pair<Integer, Integer>>)linkedHashMap.get(key$iv);
/* 160 */     if (value$iv == null) {
/* 161 */       int $i$a$-getOrPut-JunieBackgroundNode$draw$pattern$1 = 0; Object answer$iv = JunieSurfaceKt.access$generateDotPattern(n);
/* 162 */       linkedHashMap.put(key$iv, answer$iv);
/*     */     } 
/*     */     
/* 165 */     List pattern = (List)value$iv; Iterable $this$forEach$iv = pattern; int $i$f$forEach = 0;
/* 166 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Pair pair = (Pair)element$iv; int $i$a$-forEach-JunieBackgroundNode$draw$1 = 0;
/*     */       int x = ((Number)pair.component1()).intValue(), y = ((Number)pair.component2()).intValue(); }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieBackgroundNode.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */