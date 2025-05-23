/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/SupportWithReason;", "", "support", "Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;", "reason", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;Ljava/lang/String;)V", "getSupport", "()Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;", "getReason", "()Ljava/lang/String;", "ej-core"})
/*    */ public final class SupportWithReason
/*    */ {
/*    */   @NotNull
/*    */   private final ElectricJuniorSupport support;
/*    */   @NotNull
/*    */   private final String reason;
/*    */   
/*    */   public SupportWithReason(@NotNull ElectricJuniorSupport support, @NotNull String reason) {
/* 43 */     this.support = support;
/* 44 */     this.reason = reason; } @NotNull public final String getReason() { return this.reason; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final ElectricJuniorSupport getSupport() {
/*    */     return this.support;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\SupportWithReason.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */