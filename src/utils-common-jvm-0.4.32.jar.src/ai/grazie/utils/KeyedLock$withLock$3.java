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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\032\n\000\n\002\030\002\n\002\020\b\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\004\020\000\032\020\022\004\022\0020\002\022\004\022\0020\003\030\0010\001\"\004\b\000\020\004\"\b\b\001\020\005*\0020\0062\006\020\007\032\002H\0052\024\020\b\032\020\022\004\022\0020\002\022\004\022\0020\003\030\0010\001H\n¢\006\004\b\t\020\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lai/grazie/utils/SimpleMutex;", "T", "KeyT", "", "<anonymous parameter 0>", "countAndLock", "invoke", "(Ljava/lang/Object;Lkotlin/Pair;)Lkotlin/Pair;"})
/*    */ final class KeyedLock$withLock$3
/*    */   extends Lambda
/*    */   implements Function2<KeyT, Pair<? extends Integer, ? extends SimpleMutex>, Pair<? extends Integer, ? extends SimpleMutex>>
/*    */ {
/*    */   public final Pair<Integer, SimpleMutex> invoke(KeyT paramKeyT, Pair countAndLock) {
/* 32 */     Intrinsics.checkNotNullParameter(paramKeyT, "<anonymous parameter 0>"); Intrinsics.checkNotNull(countAndLock); int count = ((Number)countAndLock.component1()).intValue();
/* 33 */     return (count == 1) ? 
/* 34 */       null : 
/*    */       
/* 36 */       TuplesKt.to(Integer.valueOf(count - 1), this.$lock);
/*    */   }
/*    */   
/*    */   KeyedLock$withLock$3(SimpleMutex $lock) {
/*    */     super(2);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\KeyedLock$withLock$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */