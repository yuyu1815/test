/*    */ package ai.grazie.utils.mpp.money;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\n\032\0020\0072\006\020\013\032\0020\fH\002J\017\020\r\032\b\022\004\022\0020\0070\016HÆ\001J\020\020\017\032\0020\0072\006\020\020\032\0020\021H\002J \020\022\032\0020\007\"\016\b\000\020\023*\b\022\004\022\002H\0230\024*\b\022\004\022\002H\0230\024R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\b\020\t¨\006\025"}, d2 = {"Lai/grazie/utils/mpp/money/Credit$Companion;", "", "()V", "CREDITS_IN_DOLLAR", "", "CREDITS_IN_YUAN", "ZERO", "Lai/grazie/utils/mpp/money/Credit;", "getZERO", "()Lai/grazie/utils/mpp/money/Credit;", "dollarToCredit", "dollar", "Lai/grazie/utils/mpp/money/Dollar;", "serializer", "Lkotlinx/serialization/KSerializer;", "yuanToCredit", "yuan", "Lai/grazie/utils/mpp/money/Yuan;", "credit", "T", "Lai/grazie/utils/mpp/money/Money;", "utils-common"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<Credit> serializer() {
/* 31 */     return (KSerializer<Credit>)Credit.$serializer.INSTANCE; } @NotNull
/* 32 */   public final Credit getZERO() { return Credit.access$getZERO$cp(); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final <T extends Money<T>> Credit credit(@NotNull Money $this$credit) {
/* 43 */     Intrinsics.checkNotNullParameter($this$credit, "<this>"); Money money = $this$credit;
/*    */ 
/*    */     
/* 46 */     if (money instanceof Yuan) {  } else { throw new NoWhenBranchMatchedException(); }
/*    */     
/*    */     return (money instanceof Credit) ? (Credit)$this$credit : ((money instanceof Dollar) ? dollarToCredit((Dollar)$this$credit) : (Credit)"JD-Core does not support Kotlin");
/*    */   }
/* 50 */   private final Credit dollarToCredit(Dollar dollar) { return new Credit(dollar.getAmount().times(100000)); } private final Credit yuanToCredit(Yuan yuan) {
/* 51 */     return new Credit(yuan.getAmount().times(14000));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\money\Credit$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */