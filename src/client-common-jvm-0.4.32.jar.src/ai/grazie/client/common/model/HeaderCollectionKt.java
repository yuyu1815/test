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
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000(\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\020\016\n\002\020 \n\002\b\002\n\002\020$\n\002\b\002\032G\020\000\032\0020\001*\0020\00226\020\003\032\034\022\030\b\001\022\024\022\004\022\0020\006\022\n\022\b\022\004\022\0020\0060\0070\0050\004\"\024\022\004\022\0020\006\022\n\022\b\022\004\022\0020\0060\0070\005¢\006\002\020\b\032$\020\000\032\0020\001*\0020\0022\030\020\t\032\024\022\004\022\0020\006\022\n\022\b\022\004\022\0020\0060\0070\n\032\026\020\013\032\016\022\004\022\0020\006\022\004\022\0020\0060\n*\0020\001¨\006\f"}, d2 = {"of", "Lai/grazie/client/common/model/HeaderCollection;", "Lai/grazie/client/common/model/HeaderCollection$Companion;", "values", "", "Lkotlin/Pair;", "", "", "(Lai/grazie/client/common/model/HeaderCollection$Companion;[Lkotlin/Pair;)Lai/grazie/client/common/model/HeaderCollection;", "map", "", "toMap", "client-common"})
/*    */ @SourceDebugExtension({"SMAP\nHeaderCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderCollection.kt\nai/grazie/client/common/model/HeaderCollectionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,73:1\n1863#2:74\n1864#2:79\n37#3:75\n36#3,3:76\n37#3:80\n36#3,3:81\n9319#4,2:84\n9469#4,4:86\n*S KotlinDebug\n*F\n+ 1 HeaderCollection.kt\nai/grazie/client/common/model/HeaderCollectionKt\n*L\n58#1:74\n58#1:79\n59#1:75\n59#1:76,3\n67#1:80\n67#1:81,3\n72#1:84,2\n72#1:86,4\n*E\n"})
/*    */ public final class HeaderCollectionKt
/*    */ {
/*    */   @NotNull
/*    */   public static final HeaderCollection of(@NotNull HeaderCollection.Companion $this$of, @NotNull Map map) {
/* 57 */     Intrinsics.checkNotNullParameter($this$of, "<this>"); Intrinsics.checkNotNullParameter(map, "map"); HeaderCollection headers = new HeaderCollection();
/* 58 */     Iterable $this$forEach$iv = map.entrySet(); int $i$f$forEach = 0;
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
/* 74 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Map.Entry it = (Map.Entry)element$iv; int $i$a$-forEach-HeaderCollectionKt$of$1 = 0; Collection $this$toTypedArray$iv = (Collection)it.getValue();
/*    */       int $i$f$toTypedArray = 0;
/* 76 */       Collection thisCollection$iv = $this$toTypedArray$iv; }
/*    */      return headers; } @NotNull public static final HeaderCollection of(@NotNull HeaderCollection.Companion $this$of, @NotNull Pair... values) { Intrinsics.checkNotNullParameter($this$of, "<this>"); Intrinsics.checkNotNullParameter(values, "values"); HeaderCollection headers = new HeaderCollection(); byte b; int i; for (b = 0, i = values.length; b < i; ) {
/*    */       Pair value = values[b];
/*    */       Collection $this$toTypedArray$iv = (Collection)value.getSecond();
/*    */       int $i$f$toTypedArray = 0;
/* 81 */       Collection thisCollection$iv = $this$toTypedArray$iv;
/*    */       
/* 83 */       headers.set((String)value.getFirst(), (String[])thisCollection$iv.toArray((Object[])new String[0])); b++;
/* 84 */     }  return headers; } @NotNull public static final Map<String, String> toMap(@NotNull HeaderCollection $this$toMap) { Intrinsics.checkNotNullParameter($this$toMap, "<this>"); String[] arrayOfString1 = $this$toMap.getKeys(); int $i$f$associateWith = 0; LinkedHashMap<Object, Object> result$iv = new LinkedHashMap<>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(arrayOfString1.length), 16));
/* 85 */     String[] arrayOfString2 = arrayOfString1; int $i$f$associateWithTo = 0; byte b; int i;
/* 86 */     for (b = 0, i = arrayOfString2.length; b < i; ) { Object element$iv$iv = arrayOfString2[b];
/* 87 */       Object object1 = element$iv$iv, object2 = element$iv$iv; LinkedHashMap<Object, Object> linkedHashMap = result$iv; int $i$a$-associateWith-HeaderCollectionKt$toMap$1 = 0; Intrinsics.checkNotNull($this$toMap.get((String)object1)); String str = ArraysKt.joinToString$default((Object[])$this$toMap.get((String)object1), ",", null, null, 0, null, null, 62, null); linkedHashMap.put(object2, str); }
/*    */     
/* 89 */     return (Map)result$iv; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\model\HeaderCollectionKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */