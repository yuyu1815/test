/*    */ package com.intellij.ml.llm.matterhorn.ej.core.statistics;
/*    */ 
/*    */ import com.intellij.internal.statistic.StructuredIdeActivity;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.statistics.processors.EJActivityProcessor;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\025HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/CompositeActivity$CustomActivity;", "", "activity", "Lcom/intellij/internal/statistic/StructuredIdeActivity;", "activityProcessor", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/processors/EJActivityProcessor;", "<init>", "(Lcom/intellij/internal/statistic/StructuredIdeActivity;Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/processors/EJActivityProcessor;)V", "getActivity", "()Lcom/intellij/internal/statistic/StructuredIdeActivity;", "getActivityProcessor", "()Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/processors/EJActivityProcessor;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ej-core"})
/*    */ public final class CustomActivity {
/*    */   @NotNull
/*    */   private final StructuredIdeActivity activity;
/*    */   @NotNull
/*    */   private final EJActivityProcessor activityProcessor;
/*    */   
/* 15 */   public CustomActivity(@NotNull StructuredIdeActivity activity, @NotNull EJActivityProcessor activityProcessor) { this.activity = activity; this.activityProcessor = activityProcessor; } @NotNull public final StructuredIdeActivity getActivity() { return this.activity; } @NotNull public final EJActivityProcessor getActivityProcessor() { return this.activityProcessor; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final StructuredIdeActivity component1() {
/*    */     return this.activity;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final EJActivityProcessor component2() {
/*    */     return this.activityProcessor;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CustomActivity copy(@NotNull StructuredIdeActivity activity, @NotNull EJActivityProcessor activityProcessor) {
/*    */     Intrinsics.checkNotNullParameter(activity, "activity");
/*    */     Intrinsics.checkNotNullParameter(activityProcessor, "activityProcessor");
/*    */     return new CustomActivity(activity, activityProcessor);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CustomActivity(activity=" + this.activity + ", activityProcessor=" + this.activityProcessor + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.activity.hashCode();
/*    */     return result * 31 + this.activityProcessor.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CustomActivity))
/*    */       return false; 
/*    */     CustomActivity customActivity = (CustomActivity)other;
/*    */     return !Intrinsics.areEqual(this.activity, customActivity.activity) ? false : (!!Intrinsics.areEqual(this.activityProcessor, customActivity.activityProcessor));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\statistics\CompositeActivity$CustomActivity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */