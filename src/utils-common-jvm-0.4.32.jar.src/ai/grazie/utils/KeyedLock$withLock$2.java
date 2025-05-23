/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.TuplesKt;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\032\n\000\n\002\030\002\n\002\020\b\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\004\020\000\032\020\022\004\022\0020\002\022\004\022\0020\003\030\0010\001\"\004\b\000\020\004\"\b\b\001\020\005*\0020\0062\006\020\007\032\002H\0052\024\020\b\032\020\022\004\022\0020\002\022\004\022\0020\003\030\0010\001H\n¢\006\004\b\t\020\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lai/grazie/utils/SimpleMutex;", "T", "KeyT", "", "<anonymous parameter 0>", "countAndLock", "invoke", "(Ljava/lang/Object;Lkotlin/Pair;)Lkotlin/Pair;"})
/*    */ final class KeyedLock$withLock$2
/*    */   extends Lambda
/*    */   implements Function2<KeyT, Pair<? extends Integer, ? extends SimpleMutex>, Pair<? extends Integer, ? extends SimpleMutex>>
/*    */ {
/*    */   public final Pair<Integer, SimpleMutex> invoke(KeyT paramKeyT, Pair countAndLock) {
/* 24 */     Intrinsics.checkNotNullParameter(paramKeyT, "<anonymous parameter 0>"); if (countAndLock != null) { Pair it = countAndLock; int $i$a$-let-KeyedLock$withLock$2$1 = 0;
/* 25 */       if (TuplesKt.to(Integer.valueOf(((Number)it.getFirst()).intValue() + 1), it.getSecond()) == null) { TuplesKt.to(Integer.valueOf(((Number)it.getFirst()).intValue() + 1), it.getSecond());
/* 26 */         return TuplesKt.to(Integer.valueOf(1), KeyedLock.access$getLockFactory$p(KeyedLock.this).invoke(this.$key)); }  return TuplesKt.to(Integer.valueOf(((Number)it.getFirst()).intValue() + 1), it.getSecond()); }  TuplesKt.to(Integer.valueOf(((Number)it.getFirst()).intValue() + 1), it.getSecond()); return TuplesKt.to(Integer.valueOf(1), KeyedLock.access$getLockFactory$p(KeyedLock.this).invoke(this.$key));
/*    */   }
/*    */   
/*    */   KeyedLock$withLock$2(Object $key) {
/*    */     super(2);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\KeyedLock$withLock$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */