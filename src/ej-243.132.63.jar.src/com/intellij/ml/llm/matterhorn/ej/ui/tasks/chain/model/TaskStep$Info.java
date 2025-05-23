/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.StepType;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.Action;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B5\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\b\020\005\032\004\030\0010\006\022\022\020\007\032\016\022\n\022\b\022\004\022\0020\n0\t0\b¢\006\004\b\013\020\fJ\t\020\030\032\0020\003HÆ\003J\t\020\031\032\0020\003HÆ\003J\013\020\032\032\004\030\0010\006HÆ\003J\025\020\033\032\016\022\n\022\b\022\004\022\0020\n0\t0\bHÆ\003J?\020\034\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\n\b\002\020\005\032\004\030\0010\0062\024\b\002\020\007\032\016\022\n\022\b\022\004\022\0020\n0\t0\bHÆ\001J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010 HÖ\003J\t\020!\032\0020\"HÖ\001J\t\020#\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\r\020\016R\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\017\020\016R\026\020\005\032\004\030\0010\006X\004¢\006\b\n\000\032\004\b\020\020\021R \020\007\032\016\022\n\022\b\022\004\022\0020\n0\t0\bX\004¢\006\b\n\000\032\004\b\022\020\023R\024\020\024\032\0020\025X\004¢\006\b\n\000\032\004\b\026\020\027¨\006$"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Info;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$HumanInLoopStep;", "name", "", "description", "actionApprovalRequestData", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;", "retrieveAdditionalActions", "Lkotlin/Function0;", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;Lkotlin/jvm/functions/Function0;)V", "getName", "()Ljava/lang/String;", "getDescription", "getActionApprovalRequestData", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;", "getRetrieveAdditionalActions", "()Lkotlin/jvm/functions/Function0;", "stepType", "Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "getStepType", "()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class Info
/*    */   extends TaskStep.HumanInLoopStep
/*    */ {
/*    */   @NotNull
/*    */   private final String name;
/*    */   @NotNull
/*    */   private final String description;
/*    */   @Nullable
/*    */   private final ActionApprovalRequestData actionApprovalRequestData;
/*    */   @NotNull
/*    */   private final Function0<List<Action>> retrieveAdditionalActions;
/*    */   @NotNull
/*    */   private final StepType stepType;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   @NotNull
/*    */   public String getName() {
/* 40 */     return this.name; } @NotNull
/* 41 */   public String getDescription() { return this.description; } @Nullable
/* 42 */   public ActionApprovalRequestData getActionApprovalRequestData() { return this.actionApprovalRequestData; } @NotNull
/* 43 */   public Function0<List<Action>> getRetrieveAdditionalActions() { return this.retrieveAdditionalActions; }
/* 44 */   public Info(@NotNull String name, @NotNull String description, @Nullable ActionApprovalRequestData actionApprovalRequestData, @NotNull Function0<List<Action>> retrieveAdditionalActions) { super(null); this.name = name; this.description = description; this.actionApprovalRequestData = actionApprovalRequestData; this.retrieveAdditionalActions = retrieveAdditionalActions;
/* 45 */     this.stepType = StepType.Info; } @NotNull public StepType getStepType() { return this.stepType; }
/*    */ 
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
/*    */   @Nullable
/*    */   public final ActionApprovalRequestData component3() {
/*    */     return this.actionApprovalRequestData;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function0<List<Action>> component4() {
/*    */     return this.retrieveAdditionalActions;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Info copy(@NotNull String name, @NotNull String description, @Nullable ActionApprovalRequestData actionApprovalRequestData, @NotNull Function0<? extends List<Action>> retrieveAdditionalActions) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     Intrinsics.checkNotNullParameter(description, "description");
/*    */     Intrinsics.checkNotNullParameter(retrieveAdditionalActions, "retrieveAdditionalActions");
/*    */     return new Info(name, description, actionApprovalRequestData, retrieveAdditionalActions);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Info(name=" + this.name + ", description=" + this.description + ", actionApprovalRequestData=" + this.actionApprovalRequestData + ", retrieveAdditionalActions=" + this.retrieveAdditionalActions + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.name.hashCode();
/*    */     result = result * 31 + this.description.hashCode();
/*    */     result = result * 31 + ((this.actionApprovalRequestData == null) ? 0 : this.actionApprovalRequestData.hashCode());
/*    */     return result * 31 + this.retrieveAdditionalActions.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Info))
/*    */       return false; 
/*    */     Info info = (Info)other;
/*    */     return !Intrinsics.areEqual(this.name, info.name) ? false : (!Intrinsics.areEqual(this.description, info.description) ? false : (!Intrinsics.areEqual(this.actionApprovalRequestData, info.actionApprovalRequestData) ? false : (!!Intrinsics.areEqual(this.retrieveAdditionalActions, info.retrieveAdditionalActions))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\model\TaskStep$Info.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */