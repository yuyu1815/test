/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseProductType;
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
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\007\b\002\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/junie/OrderItem;", "", "type", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;", "trial", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;Z)V", "getType", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;", "getTrial", "()Z", "state.junie.impl"})
/*    */ final class OrderItem
/*    */ {
/*    */   @NotNull
/*    */   private final AipLicenseProductType type;
/*    */   private final boolean trial;
/*    */   
/*    */   public OrderItem(@NotNull AipLicenseProductType type, boolean trial) {
/* 73 */     this.type = type; this.trial = trial; } @NotNull public final AipLicenseProductType getType() { return this.type; } public final boolean getTrial() { return this.trial; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\OrderItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */