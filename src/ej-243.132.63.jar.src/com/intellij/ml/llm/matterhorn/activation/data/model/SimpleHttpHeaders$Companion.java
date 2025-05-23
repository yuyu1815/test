/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model;
/*    */ 
/*    */ import com.intellij.util.containers.CollectionFactory;
/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.collections.MapsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\"\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020$\n\002\b\007\n\002\030\002\n\002\b\003\n\002\020\021\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J!\020\007\032\0020\b2\022\020\t\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\004\b\013\020\fJ\r\020\r\032\0020\b¢\006\004\b\016\020\017J!\020\020\032\0020\b2\022\020\021\032\016\022\004\022\0020\006\022\004\022\0020\0060\022¢\006\004\b\023\020\024J9\020\020\032\0020\b2*\020\025\032\026\022\022\b\001\022\016\022\004\022\0020\006\022\004\022\0020\0060\0220\026\"\016\022\004\022\0020\006\022\004\022\0020\0060\022¢\006\004\b\023\020\027R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/SimpleHttpHeaders$Companion;", "", "<init>", "()V", "nonRedactedAllowlist", "", "", "fromMap", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/SimpleHttpHeaders;", "map", "", "fromMap-vDDv_S8", "(Ljava/util/Map;)Ljava/util/Map;", "empty", "empty-yd9Q308", "()Ljava/util/Map;", "of", "pair", "Lkotlin/Pair;", "of-vDDv_S8", "(Lkotlin/Pair;)Ljava/util/Map;", "pairs", "", "([Lkotlin/Pair;)Ljava/util/Map;", "data.model"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final Map<String, ? extends String> fromMap-vDDv_S8(@NotNull Map map) {
/* 53 */     Intrinsics.checkNotNullParameter(map, "map"); Intrinsics.checkNotNullExpressionValue(CollectionFactory.createCaseInsensitiveStringMap(map), "createCaseInsensitiveStringMap(...)"); return SimpleHttpHeaders.access$constructor-impl(CollectionFactory.createCaseInsensitiveStringMap(map)); } @NotNull
/* 54 */   public final Map<String, ? extends String> empty-yd9Q308() { return SimpleHttpHeaders.access$constructor-impl(MapsKt.emptyMap()); }
/*    */   @NotNull
/* 56 */   public final Map<String, ? extends String> of-vDDv_S8(@NotNull Pair pair) { Intrinsics.checkNotNullParameter(pair, "pair"); return fromMap-vDDv_S8(MapsKt.mapOf(pair)); } @NotNull
/* 57 */   public final Map<String, ? extends String> of-vDDv_S8(@NotNull Pair... pairs) { Intrinsics.checkNotNullParameter(pairs, "pairs"); return fromMap-vDDv_S8(MapsKt.mapOf(Arrays.<Pair>copyOf(pairs, pairs.length))); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\SimpleHttpHeaders$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */