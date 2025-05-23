/*    */ package com.intellij.ml.llm.matterhorn;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\006\n\002\b\007\n\002\020\002\n\002\b\003\030\000 \0172\0020\001:\001\017B\031\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\004\b\006\020\007J\016\020\f\032\0020\r2\006\020\016\032\0020\005R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R \020\t\032\0020\0052\006\020\b\032\0020\0058F@BX\016¢\006\b\n\000\032\004\b\n\020\013¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/CostContext;", "Lcom/intellij/ml/llm/matterhorn/CustomContext;", "name", "", "costLimit", "", "<init>", "(Ljava/lang/String;D)V", "value", "totalCost", "getTotalCost", "()D", "updateTotalCostAndCheckLimit", "", "cost", "Companion", "core"})
/*    */ @SourceDebugExtension({"SMAP\nCostContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CostContext.kt\ncom/intellij/ml/llm/matterhorn/CostContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
/*  3 */ public final class CostContext implements CustomContext { public CostContext(@NotNull String name, double costLimit) { this.name = name; this.costLimit = costLimit; }
/*    */    public final double getTotalCost() {
/*  5 */     synchronized (this) {
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
/* 20 */       int $i$a$-synchronized-CostContext$totalCost$1 = 0;
/*    */       double d = this.totalCost;
/*    */     } 
/*    */     return d;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/CostContext$Companion;", "", "<init>", "()V", "COST_CONTEXT_KEY", "Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;", "Lcom/intellij/ml/llm/matterhorn/CostContext;", "getCOST_CONTEXT_KEY", "()Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;", "core"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final ExecutionContextUserDataKey<CostContext> getCOST_CONTEXT_KEY() {
/*    */       return CostContext.COST_CONTEXT_KEY;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String name;
/*    */   private final double costLimit;
/*    */   private double totalCost;
/*    */   @NotNull
/*    */   private static final ExecutionContextUserDataKey<CostContext> COST_CONTEXT_KEY = new ExecutionContextUserDataKey<>("CostContextKey");
/*    */   
/*    */   public final synchronized void updateTotalCostAndCheckLimit(double cost) {
/*    */     this.totalCost = getTotalCost() + cost;
/*    */     if (this.costLimit > 0.0D && getTotalCost() > this.costLimit)
/*    */       throw new CostLimitExceededException(this.name + " cost limit exceeded. Current cost: " + this.name + ", limit: " + getTotalCost()); 
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\CostContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */