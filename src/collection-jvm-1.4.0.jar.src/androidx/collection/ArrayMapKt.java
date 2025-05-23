/*    */ package androidx.collection;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\002\032!\020\000\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003H\b\032O\020\000\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\0032*\020\004\032\026\022\022\b\001\022\016\022\004\022\002H\002\022\004\022\002H\0030\0060\005\"\016\022\004\022\002H\002\022\004\022\002H\0030\006¢\006\002\020\007¨\006\b"}, d2 = {"arrayMapOf", "Landroidx/collection/ArrayMap;", "K", "V", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Landroidx/collection/ArrayMap;", "collection"})
/*    */ public final class ArrayMapKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <K, V> ArrayMap<K, V> arrayMapOf() {
/* 26 */     int $i$f$arrayMapOf = 0; return new ArrayMap<>();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final <K, V> ArrayMap<K, V> arrayMapOf(@NotNull Pair... pairs) {
/* 39 */     Intrinsics.checkNotNullParameter(pairs, "pairs"); ArrayMap<Object, Object> map = new ArrayMap<>(pairs.length); byte b; int i;
/* 40 */     for (b = 0, i = pairs.length; b < i; ) { Pair pair = pairs[b];
/* 41 */       map.put(pair.getFirst(), pair.getSecond()); b++; }
/*    */     
/* 43 */     return (ArrayMap)map;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\ArrayMapKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */