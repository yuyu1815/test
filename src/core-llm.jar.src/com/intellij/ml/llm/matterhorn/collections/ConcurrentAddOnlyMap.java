/*    */ package com.intellij.ml.llm.matterhorn.collections;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\004\b\007\030\000 \017*\004\b\000\020\001*\b\b\001\020\002*\0020\0032\0020\003:\001\017B\007¢\006\004\b\004\020\005J6\020\b\032\0028\0012\006\020\t\032\0028\0002!\020\n\032\035\022\023\022\0218\000¢\006\f\b\f\022\b\b\r\022\004\b\b(\t\022\004\022\0028\0010\013¢\006\002\020\016R\032\020\006\032\016\022\004\022\0028\000\022\004\022\0020\0030\007X\004¢\006\002\n\000¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/collections/ConcurrentAddOnlyMap;", "K", "V", "", "<init>", "()V", "map", "Ljava/util/concurrent/ConcurrentHashMap;", "getOrPut", "key", "valueGenerator", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Companion", "core"})
/*    */ @Experimental
/*    */ public final class ConcurrentAddOnlyMap<K, V> {
/*    */   @NotNull
/*  9 */   public static final Companion Companion = new Companion(null); @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\004\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\001X\004¢\006\002\n\000¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/collections/ConcurrentAddOnlyMap$Companion;", "", "<init>", "()V", "ADDING", "core"}) public static final class Companion { private Companion() {} } @NotNull private static final Object ADDING = new Object();
/*    */   
/*    */   @NotNull
/* 12 */   private final ConcurrentHashMap<K, Object> map = new ConcurrentHashMap<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final V getOrPut(Object key, @NotNull Function1 valueGenerator) {
/* 20 */     Intrinsics.checkNotNullParameter(valueGenerator, "valueGenerator"); Object value = this.map.putIfAbsent((K)key, ADDING);
/* 21 */     if (value == null) {
/*    */       Object object; 
/* 23 */       try { object = valueGenerator.invoke(key); }
/* 24 */       catch (Throwable e)
/* 25 */       { object = e; }  value = object;
/*    */       
/* 27 */       this.map.put((K)key, value);
/*    */     } else {
/* 29 */       while (value == ADDING) {
/* 30 */         value = this.map.get(key);
/*    */       }
/*    */     } 
/* 33 */     if (value instanceof Throwable) {
/* 34 */       throw (Throwable)value;
/*    */     }
/* 36 */     Intrinsics.checkNotNull(value, "null cannot be cast to non-null type V of com.intellij.ml.llm.matterhorn.collections.ConcurrentAddOnlyMap"); return (V)value;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\collections\ConcurrentAddOnlyMap.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */