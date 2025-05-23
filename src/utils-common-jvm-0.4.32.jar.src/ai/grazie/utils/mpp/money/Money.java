/*    */ package ai.grazie.utils.mpp.money;
/*    */ 
/*    */ import ai.grazie.utils.mpp.MPPComparable;
/*    */ import ai.grazie.utils.mpp.number.FixedPrecisionFloat;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\b\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\000*\016\b\000\020\001*\b\022\004\022\002H\0010\0002\b\022\004\022\002H\0010\002B\007\b\004¢\006\002\020\003J\026\020\013\032\0020\f2\006\020\r\032\0028\000H\002¢\006\002\020\016J\025\020\017\032\0028\0002\006\020\004\032\0020\005H$¢\006\002\020\020J\006\020\021\032\0020\022J\026\020\023\032\0028\0002\006\020\r\032\0028\000H\002¢\006\002\020\024J\026\020\025\032\0028\0002\006\020\r\032\0028\000H\002¢\006\002\020\024J\026\020\026\032\0028\0002\006\020\027\032\0020\fH\004¢\006\002\020\030J\026\020\031\032\0028\0002\006\020\r\032\0020\fH\002¢\006\002\020\030J\006\020\032\032\0020\033J\006\020\034\032\0020\033R\022\020\004\032\0020\005X¦\004¢\006\006\032\004\b\006\020\007R\022\020\b\032\0028\000X¦\004¢\006\006\032\004\b\t\020\n\001\003\035\036\037¨\006 "}, d2 = {"Lai/grazie/utils/mpp/money/Money;", "T", "Lai/grazie/utils/mpp/MPPComparable;", "()V", "amount", "Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "getAmount", "()Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "zero", "getZero", "()Lai/grazie/utils/mpp/money/Money;", "compareTo", "", "other", "(Lai/grazie/utils/mpp/money/Money;)I", "instantiate", "(Lai/grazie/utils/mpp/number/FixedPrecisionFloat;)Lai/grazie/utils/mpp/money/Money;", "isZero", "", "minus", "(Lai/grazie/utils/mpp/money/Money;)Lai/grazie/utils/mpp/money/Money;", "plus", "shr", "count", "(I)Lai/grazie/utils/mpp/money/Money;", "times", "toStringFraction", "", "toStringInteger", "Lai/grazie/utils/mpp/money/Credit;", "Lai/grazie/utils/mpp/money/Dollar;", "Lai/grazie/utils/mpp/money/Yuan;", "utils-common"})
/*    */ public abstract class Money<T extends Money<T>> implements MPPComparable<T> {
/*    */   private Money() {}
/*    */   
/*    */   @NotNull
/*    */   public final T plus(@NotNull Money other) {
/* 16 */     Intrinsics.checkNotNullParameter(other, "other"); return instantiate(getAmount().plus(other.getAmount()));
/*    */   } @NotNull
/* 18 */   public final T minus(@NotNull Money other) { Intrinsics.checkNotNullParameter(other, "other"); return instantiate(getAmount().minus(other.getAmount())); } @NotNull
/*    */   public final T times(int other) {
/* 20 */     return instantiate(getAmount().times(other));
/*    */   }
/* 22 */   public int compareTo(@NotNull Money other) { Intrinsics.checkNotNullParameter(other, "other"); return getAmount().compareTo(other.getAmount()); } @NotNull
/*    */   public final T shr(int count) {
/* 24 */     return instantiate(getAmount().shr(count));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String toStringInteger() {
/* 29 */     return getAmount().toStringInteger();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String toStringFraction() {
/* 34 */     return getAmount().toStringFraction();
/*    */   }
/*    */   public final boolean isZero() {
/* 37 */     return getAmount().isZero();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected abstract T instantiate(@NotNull FixedPrecisionFloat paramFixedPrecisionFloat);
/*    */   
/*    */   @NotNull
/*    */   public abstract FixedPrecisionFloat getAmount();
/*    */   
/*    */   @NotNull
/*    */   public abstract T getZero();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\money\Money.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */