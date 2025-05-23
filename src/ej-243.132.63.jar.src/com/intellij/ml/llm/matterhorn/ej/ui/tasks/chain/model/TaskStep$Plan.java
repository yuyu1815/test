/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.StepType;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.PlanItem;
/*    */ import java.awt.Toolkit;
/*    */ import java.awt.datatransfer.Clipboard;
/*    */ import java.awt.datatransfer.StringSelection;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\005\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\f\020\005\032\b\022\004\022\0020\0070\006¢\006\004\b\b\020\tJ\006\020\023\032\0020\024J\t\020\025\032\0020\003HÆ\003J\t\020\026\032\0020\003HÆ\003J\017\020\027\032\b\022\004\022\0020\0070\006HÆ\003J-\020\030\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\016\b\002\020\005\032\b\022\004\022\0020\0070\006HÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\034HÖ\003J\t\020\035\032\0020\036HÖ\001J\t\020\037\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\n\020\013R\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\f\020\013R\027\020\005\032\b\022\004\022\0020\0070\006¢\006\b\n\000\032\004\b\r\020\016R\024\020\017\032\0020\020X\004¢\006\b\n\000\032\004\b\021\020\022¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Plan;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;", "name", "", "description", "plan", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/PlanItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getDescription", "getPlan", "()Ljava/util/List;", "stepType", "Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "getStepType", "()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "onCopyPlanToClipboard", "", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class Plan
/*    */   extends TaskStep
/*    */ {
/*    */   @NotNull
/*    */   private final String name;
/*    */   @NotNull
/*    */   private final String description;
/*    */   @NotNull
/*    */   private final List<PlanItem> plan;
/*    */   @NotNull
/*    */   private final StepType stepType;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   @NotNull
/*    */   public String getName() {
/* 49 */     return this.name; } @NotNull
/* 50 */   public String getDescription() { return this.description; } @NotNull
/* 51 */   public final List<PlanItem> getPlan() { return this.plan; }
/* 52 */   public Plan(@NotNull String name, @NotNull String description, @NotNull List<PlanItem> plan) { super(null); this.name = name; this.description = description; this.plan = plan;
/* 53 */     this.stepType = StepType.Info; } @NotNull public StepType getStepType() { return this.stepType; }
/*    */   
/*    */   public final void onCopyPlanToClipboard() {
/* 56 */     if (!this.plan.isEmpty()) {
/* 57 */       String textPlan = CollectionsKt.joinToString$default(this.plan, "\n", null, null, 0, null, Plan::onCopyPlanToClipboard$lambda$0, 30, null);
/* 58 */       Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
/* 59 */       StringSelection selection = new StringSelection(textPlan);
/* 60 */       clipboard.setContents(selection, null);
/*    */     } 
/*    */   }
/*    */   
/*    */   private static final CharSequence onCopyPlanToClipboard$lambda$0(PlanItem it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     return it.getDescription();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.description;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<PlanItem> component3() {
/*    */     return this.plan;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Plan copy(@NotNull String name, @NotNull String description, @NotNull List<PlanItem> plan) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     Intrinsics.checkNotNullParameter(description, "description");
/*    */     Intrinsics.checkNotNullParameter(plan, "plan");
/*    */     return new Plan(name, description, plan);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Plan(name=" + this.name + ", description=" + this.description + ", plan=" + this.plan + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.name.hashCode();
/*    */     result = result * 31 + this.description.hashCode();
/*    */     return result * 31 + this.plan.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Plan))
/*    */       return false; 
/*    */     Plan plan = (Plan)other;
/*    */     return !Intrinsics.areEqual(this.name, plan.name) ? false : (!Intrinsics.areEqual(this.description, plan.description) ? false : (!!Intrinsics.areEqual(this.plan, plan.plan)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\model\TaskStep$Plan.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */