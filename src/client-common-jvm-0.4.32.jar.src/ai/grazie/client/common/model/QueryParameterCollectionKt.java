/*    */ package ai.grazie.client.common.model;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.collections.ArraysKt;
/*    */ import kotlin.collections.MapsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.ranges.RangesKt;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000(\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\020\016\n\002\020 \n\002\b\002\n\002\020$\n\002\b\002\032G\020\000\032\0020\001*\0020\00226\020\003\032\034\022\030\b\001\022\024\022\004\022\0020\006\022\n\022\b\022\004\022\0020\0060\0070\0050\004\"\024\022\004\022\0020\006\022\n\022\b\022\004\022\0020\0060\0070\005¢\006\002\020\b\032$\020\000\032\0020\001*\0020\0022\030\020\t\032\024\022\004\022\0020\006\022\n\022\b\022\004\022\0020\0060\0070\n\032\026\020\013\032\016\022\004\022\0020\006\022\004\022\0020\0060\n*\0020\001¨\006\f"}, d2 = {"of", "Lai/grazie/client/common/model/QueryParameterCollection;", "Lai/grazie/client/common/model/QueryParameterCollection$Companion;", "values", "", "Lkotlin/Pair;", "", "", "(Lai/grazie/client/common/model/QueryParameterCollection$Companion;[Lkotlin/Pair;)Lai/grazie/client/common/model/QueryParameterCollection;", "map", "", "toMap", "client-common"})
/*    */ @SourceDebugExtension({"SMAP\nQueryParameterCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryParameterCollection.kt\nai/grazie/client/common/model/QueryParameterCollectionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,55:1\n1863#2:56\n1864#2:61\n37#3:57\n36#3,3:58\n37#3:62\n36#3,3:63\n9319#4,2:66\n9469#4,4:68\n*S KotlinDebug\n*F\n+ 1 QueryParameterCollection.kt\nai/grazie/client/common/model/QueryParameterCollectionKt\n*L\n40#1:56\n40#1:61\n41#1:57\n41#1:58,3\n49#1:62\n49#1:63,3\n54#1:66,2\n54#1:68,4\n*E\n"})
/*    */ public final class QueryParameterCollectionKt
/*    */ {
/*    */   @NotNull
/*    */   public static final QueryParameterCollection of(@NotNull QueryParameterCollection.Companion $this$of, @NotNull Map map) {
/* 39 */     Intrinsics.checkNotNullParameter($this$of, "<this>"); Intrinsics.checkNotNullParameter(map, "map"); QueryParameterCollection parameters = new QueryParameterCollection();
/* 40 */     Iterable $this$forEach$iv = map.entrySet(); int $i$f$forEach = 0;
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
/* 56 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Map.Entry it = (Map.Entry)element$iv; int $i$a$-forEach-QueryParameterCollectionKt$of$1 = 0; Collection $this$toTypedArray$iv = (Collection)it.getValue();
/*    */       int $i$f$toTypedArray = 0;
/* 58 */       Collection thisCollection$iv = $this$toTypedArray$iv; }
/*    */      return parameters; } @NotNull public static final QueryParameterCollection of(@NotNull QueryParameterCollection.Companion $this$of, @NotNull Pair... values) { Intrinsics.checkNotNullParameter($this$of, "<this>"); Intrinsics.checkNotNullParameter(values, "values"); QueryParameterCollection parameters = new QueryParameterCollection(); byte b; int i; for (b = 0, i = values.length; b < i; ) {
/*    */       Pair value = values[b];
/*    */       Collection $this$toTypedArray$iv = (Collection)value.getSecond();
/*    */       int $i$f$toTypedArray = 0;
/* 63 */       Collection thisCollection$iv = $this$toTypedArray$iv;
/*    */       
/* 65 */       parameters.set((String)value.getFirst(), (String[])thisCollection$iv.toArray((Object[])new String[0])); b++;
/* 66 */     }  return parameters; } @NotNull public static final Map<String, String> toMap(@NotNull QueryParameterCollection $this$toMap) { Intrinsics.checkNotNullParameter($this$toMap, "<this>"); String[] arrayOfString1 = $this$toMap.getKeys(); int $i$f$associateWith = 0; LinkedHashMap<Object, Object> result$iv = new LinkedHashMap<>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(arrayOfString1.length), 16));
/* 67 */     String[] arrayOfString2 = arrayOfString1; int $i$f$associateWithTo = 0; byte b; int i;
/* 68 */     for (b = 0, i = arrayOfString2.length; b < i; ) { Object element$iv$iv = arrayOfString2[b];
/* 69 */       Object object1 = element$iv$iv, object2 = element$iv$iv; LinkedHashMap<Object, Object> linkedHashMap = result$iv; int $i$a$-associateWith-QueryParameterCollectionKt$toMap$1 = 0; Intrinsics.checkNotNull(QueryParameterCollection.get$default($this$toMap, (String)object1, false, 2, null)); String str = ArraysKt.joinToString$default((Object[])QueryParameterCollection.get$default($this$toMap, (String)object1, false, 2, null), ",", null, null, 0, null, null, 62, null); linkedHashMap.put(object2, str); }
/*    */     
/* 71 */     return (Map)result$iv; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\model\QueryParameterCollectionKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */