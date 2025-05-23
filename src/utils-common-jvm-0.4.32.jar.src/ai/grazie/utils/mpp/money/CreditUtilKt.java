/*    */ package ai.grazie.utils.mpp.money;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\000\n\002\020\034\n\000\n\002\030\002\n\000\0320\020\000\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\022\020\004\032\016\022\004\022\002H\002\022\004\022\0020\0010\005H\bø\001\000\002\007\n\005\b20\001¨\006\006"}, d2 = {"sumOf", "Lai/grazie/utils/mpp/money/Credit;", "T", "", "selector", "Lkotlin/Function1;", "utils-common"})
/*    */ public final class CreditUtilKt {
/*    */   @NotNull
/*    */   public static final <T> Credit sumOf(@NotNull Iterable $this$sumOf, @NotNull Function1 selector) {
/*  7 */     Intrinsics.checkNotNullParameter($this$sumOf, "<this>"); Intrinsics.checkNotNullParameter(selector, "selector"); int $i$f$sumOf = 0; Credit sum = Credit.Companion.getZERO();
/*  8 */     for (Object element : $this$sumOf) {
/*  9 */       sum = sum.plus((Credit)selector.invoke(element));
/*    */     }
/* 11 */     return sum;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\money\CreditUtilKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */