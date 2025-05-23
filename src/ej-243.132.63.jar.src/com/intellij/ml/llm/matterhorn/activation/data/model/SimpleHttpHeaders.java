/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model;
/*    */ 
/*    */ import com.intellij.util.containers.CollectionFactory;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collections;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.collections.MapsKt;
/*    */ import kotlin.collections.SetsKt;
/*    */ import kotlin.jvm.JvmInline;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @JvmInline
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020$\n\002\020\016\n\002\b\f\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\004\b@\030\000 \0312\0020\001:\001\031B\035\b\002\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0040\003¢\006\004\b\005\020\006J\017\020\007\032\0020\004H\026¢\006\004\b\b\020\tJ\032\020\n\032\004\030\0010\0042\006\020\013\032\0020\004H\002¢\006\004\b\f\020\rJ\031\020\016\032\016\022\004\022\0020\004\022\004\022\0020\0040\003¢\006\004\b\017\020\006J\032\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003¢\006\004\b\023\020\024J\020\020\025\032\0020\026HÖ\001¢\006\004\b\027\020\030R\032\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0040\003X\004¢\006\002\n\000\001\002\001\016\022\004\022\0020\004\022\004\022\0020\0040\003¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/SimpleHttpHeaders;", "", "map", "", "", "constructor-impl", "(Ljava/util/Map;)Ljava/util/Map;", "toString", "toString-impl", "(Ljava/util/Map;)Ljava/lang/String;", "get", "key", "get-impl", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "asMap", "asMap-impl", "equals", "", "other", "equals-impl", "(Ljava/util/Map;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/Map;)I", "Companion", "data.model"})
/*    */ @SourceDebugExtension({"SMAP\nSimpleHttpHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleHttpHeaders.kt\ncom/intellij/ml/llm/matterhorn/activation/data/model/SimpleHttpHeaders\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n462#2:61\n412#2:62\n1246#3,4:63\n*S KotlinDebug\n*F\n+ 1 SimpleHttpHeaders.kt\ncom/intellij/ml/llm/matterhorn/activation/data/model/SimpleHttpHeaders\n*L\n26#1:61\n26#1:62\n26#1:63,4\n*E\n"})
/*    */ public final class SimpleHttpHeaders {
/*    */   @NotNull
/* 25 */   public String toString() { return toString-impl(this.map); } @NotNull
/* 26 */   public static String toString-impl(Map arg0) { Map $this$mapValues$iv = arg0; int $i$f$mapValues = 0;
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
/* 61 */     Map map1 = $this$mapValues$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(MapsKt.mapCapacity($this$mapValues$iv.size())); int $i$f$mapValuesTo = 0;
/* 62 */     Iterable $this$associateByTo$iv$iv$iv = map1.entrySet(); int $i$f$associateByTo = 0;
/* 63 */     for (Object element$iv$iv$iv : $this$associateByTo$iv$iv$iv) {
/* 64 */       Map.Entry entry1 = (Map.Entry)element$iv$iv$iv; Map<Object, Object> map2 = destination$iv$iv; int $i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv = 0; Map.Entry entry2 = (Map.Entry)element$iv$iv$iv; Object object1 = entry1.getKey(); Map<Object, Object> map3 = map2; int $i$a$-mapValues-SimpleHttpHeaders$toString$1 = 0;
/*    */     } 
/* 66 */     return destination$iv$iv.toString(); }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public static final String get-impl(Map arg0, @NotNull String key) {
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     return (String)arg0.get(key);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Map<String, String> asMap-impl(Map<?, ?> arg0) {
/*    */     Intrinsics.checkNotNullExpressionValue(Collections.unmodifiableMap(arg0), "unmodifiableMap(...)");
/*    */     return (Map)Collections.unmodifiableMap(arg0);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\"\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020$\n\002\b\007\n\002\030\002\n\002\b\003\n\002\020\021\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J!\020\007\032\0020\b2\022\020\t\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\004\b\013\020\fJ\r\020\r\032\0020\b¢\006\004\b\016\020\017J!\020\020\032\0020\b2\022\020\021\032\016\022\004\022\0020\006\022\004\022\0020\0060\022¢\006\004\b\023\020\024J9\020\020\032\0020\b2*\020\025\032\026\022\022\b\001\022\016\022\004\022\0020\006\022\004\022\0020\0060\0220\026\"\016\022\004\022\0020\006\022\004\022\0020\0060\022¢\006\004\b\023\020\027R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/SimpleHttpHeaders$Companion;", "", "<init>", "()V", "nonRedactedAllowlist", "", "", "fromMap", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/SimpleHttpHeaders;", "map", "", "fromMap-vDDv_S8", "(Ljava/util/Map;)Ljava/util/Map;", "empty", "empty-yd9Q308", "()Ljava/util/Map;", "of", "pair", "Lkotlin/Pair;", "of-vDDv_S8", "(Lkotlin/Pair;)Ljava/util/Map;", "pairs", "", "([Lkotlin/Pair;)Ljava/util/Map;", "data.model"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final Map<String, ? extends String> fromMap-vDDv_S8(@NotNull Map map) {
/*    */       Intrinsics.checkNotNullParameter(map, "map");
/*    */       Intrinsics.checkNotNullExpressionValue(CollectionFactory.createCaseInsensitiveStringMap(map), "createCaseInsensitiveStringMap(...)");
/*    */       return SimpleHttpHeaders.constructor-impl(CollectionFactory.createCaseInsensitiveStringMap(map));
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Map<String, ? extends String> empty-yd9Q308() {
/*    */       return SimpleHttpHeaders.constructor-impl(MapsKt.emptyMap());
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Map<String, ? extends String> of-vDDv_S8(@NotNull Pair pair) {
/*    */       Intrinsics.checkNotNullParameter(pair, "pair");
/*    */       return fromMap-vDDv_S8(MapsKt.mapOf(pair));
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Map<String, ? extends String> of-vDDv_S8(@NotNull Pair... pairs) {
/*    */       Intrinsics.checkNotNullParameter(pairs, "pairs");
/*    */       return fromMap-vDDv_S8(MapsKt.mapOf(Arrays.<Pair>copyOf(pairs, pairs.length)));
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Map<String, String> map;
/*    */   @NotNull
/*    */   private static final Set<String> nonRedactedAllowlist;
/*    */   
/*    */   static {
/*    */     String[] arrayOfString = new String[8];
/*    */     arrayOfString[0] = "Content-Type";
/*    */     arrayOfString[1] = "Content-Length";
/*    */     arrayOfString[2] = "Grazie-Agent";
/*    */     arrayOfString[3] = "Grazie-Deprecated-Info";
/*    */     arrayOfString[4] = "Grazie-Trace-Id";
/*    */     arrayOfString[5] = "Grazie-Task-Tag";
/*    */     arrayOfString[6] = "Retry-After";
/*    */     arrayOfString[7] = "Retry-After-Ms";
/*    */     nonRedactedAllowlist = SetsKt.setOf((Object[])arrayOfString);
/*    */   }
/*    */   
/*    */   public static int hashCode-impl(Map arg0) {
/*    */     return arg0.hashCode();
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return hashCode-impl(this.map);
/*    */   }
/*    */   
/*    */   public static boolean equals-impl(Map arg0, Object other) {
/*    */     return !(other instanceof SimpleHttpHeaders) ? false : (!!Intrinsics.areEqual(arg0, ((SimpleHttpHeaders)other).unbox-impl()));
/*    */   }
/*    */   
/*    */   public boolean equals(Object other) {
/*    */     return equals-impl(this.map, other);
/*    */   }
/*    */   
/*    */   private static Map<String, ? extends String> constructor-impl(Map<String, ? extends String> map) {
/*    */     return map;
/*    */   }
/*    */   
/*    */   public static final boolean equals-impl0(Map p1, Map p2) {
/*    */     return Intrinsics.areEqual(p1, p2);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\SimpleHttpHeaders.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */