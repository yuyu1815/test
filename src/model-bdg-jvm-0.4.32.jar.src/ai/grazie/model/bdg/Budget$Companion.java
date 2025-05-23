/*    */ package ai.grazie.model.bdg;
/*    */ 
/*    */ import ai.grazie.utils.mpp.money.Credit;
/*    */ import ai.grazie.utils.mpp.money.Dollar;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\f\020\003\032\b\022\004\022\0020\0050\004J\f\020\006\032\b\022\004\022\0020\0070\004¨\006\b"}, d2 = {"Lai/grazie/model/bdg/Budget$Companion;", "", "()V", "zeroCredits", "Lai/grazie/model/bdg/Budget;", "Lai/grazie/utils/mpp/money/Credit;", "zeroDollars", "Lai/grazie/utils/mpp/money/Dollar;", "model-bdg"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final Budget<Dollar> zeroDollars() {
/* 18 */     return new Budget(Dollar.Companion.getZERO()); } @NotNull
/* 19 */   public final Budget<Credit> zeroCredits() { return new Budget(Credit.Companion.getZERO()); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-bdg-jvm-0.4.32.jar!\ai\grazie\model\bdg\Budget$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */