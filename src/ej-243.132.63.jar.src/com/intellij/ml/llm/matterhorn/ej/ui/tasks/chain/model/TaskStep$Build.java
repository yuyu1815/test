/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.StepType;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.Action;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\t\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\016\n\002\030\002\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001BK\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\n\b\002\020\006\032\004\030\0010\007\022\n\b\002\020\b\032\004\030\0010\t\022\022\020\n\032\016\022\n\022\b\022\004\022\0020\r0\f0\013¢\006\004\b\016\020\017J\t\020\037\032\0020\003HÆ\003J\t\020 \032\0020\003HÆ\003J\t\020!\032\0020\003HÆ\003J\020\020\"\032\004\030\0010\007HÆ\003¢\006\002\020\025J\013\020#\032\004\030\0010\tHÆ\003J\025\020$\032\016\022\n\022\b\022\004\022\0020\r0\f0\013HÆ\003JZ\020%\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\n\b\002\020\006\032\004\030\0010\0072\n\b\002\020\b\032\004\030\0010\t2\024\b\002\020\n\032\016\022\n\022\b\022\004\022\0020\r0\f0\013HÆ\001¢\006\002\020&J\023\020'\032\0020(2\b\020)\032\004\030\0010*HÖ\003J\t\020+\032\0020,HÖ\001J\t\020-\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\020\020\021R\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\022\020\021R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\023\020\021R\025\020\006\032\004\030\0010\007¢\006\n\n\002\020\026\032\004\b\024\020\025R\026\020\b\032\004\030\0010\tX\004¢\006\b\n\000\032\004\b\027\020\030R \020\n\032\016\022\n\022\b\022\004\022\0020\r0\f0\013X\004¢\006\b\n\000\032\004\b\031\020\032R\024\020\033\032\0020\034X\004¢\006\b\n\000\032\004\b\035\020\036¨\006."}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Build;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$HumanInLoopStep;", "name", "", "description", "command", "msDuration", "", "actionApprovalRequestData", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;", "retrieveAdditionalActions", "Lkotlin/Function0;", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;Lkotlin/jvm/functions/Function0;)V", "getName", "()Ljava/lang/String;", "getDescription", "getCommand", "getMsDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getActionApprovalRequestData", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;", "getRetrieveAdditionalActions", "()Lkotlin/jvm/functions/Function0;", "stepType", "Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "getStepType", "()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;Lkotlin/jvm/functions/Function0;)Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Build;", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class Build
/*     */   extends TaskStep.HumanInLoopStep
/*     */ {
/*     */   @NotNull
/*     */   private final String name;
/*     */   @NotNull
/*     */   private final String description;
/*     */   @NotNull
/*     */   private final String command;
/*     */   @Nullable
/*     */   private final Long msDuration;
/*     */   @Nullable
/*     */   private final ActionApprovalRequestData actionApprovalRequestData;
/*     */   @NotNull
/*     */   private final Function0<List<Action>> retrieveAdditionalActions;
/*     */   @NotNull
/*     */   private final StepType stepType;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @NotNull
/*     */   public String getName() {
/* 110 */     return this.name; } @NotNull
/* 111 */   public String getDescription() { return this.description; } @NotNull
/* 112 */   public final String getCommand() { return this.command; } @Nullable
/* 113 */   public final Long getMsDuration() { return this.msDuration; } @Nullable
/* 114 */   public ActionApprovalRequestData getActionApprovalRequestData() { return this.actionApprovalRequestData; } @NotNull
/* 115 */   public Function0<List<Action>> getRetrieveAdditionalActions() { return this.retrieveAdditionalActions; }
/* 116 */   public Build(@NotNull String name, @NotNull String description, @NotNull String command, @Nullable Long msDuration, @Nullable ActionApprovalRequestData actionApprovalRequestData, @NotNull Function0<List<Action>> retrieveAdditionalActions) { super(null); this.name = name; this.description = description; this.command = command; this.msDuration = msDuration; this.actionApprovalRequestData = actionApprovalRequestData; this.retrieveAdditionalActions = retrieveAdditionalActions;
/* 117 */     this.stepType = StepType.Build; } @NotNull public StepType getStepType() { return this.stepType; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.description;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component3() {
/*     */     return this.command;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Long component4() {
/*     */     return this.msDuration;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final ActionApprovalRequestData component5() {
/*     */     return this.actionApprovalRequestData;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Function0<List<Action>> component6() {
/*     */     return this.retrieveAdditionalActions;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Build copy(@NotNull String name, @NotNull String description, @NotNull String command, @Nullable Long msDuration, @Nullable ActionApprovalRequestData actionApprovalRequestData, @NotNull Function0<? extends List<Action>> retrieveAdditionalActions) {
/*     */     Intrinsics.checkNotNullParameter(name, "name");
/*     */     Intrinsics.checkNotNullParameter(description, "description");
/*     */     Intrinsics.checkNotNullParameter(command, "command");
/*     */     Intrinsics.checkNotNullParameter(retrieveAdditionalActions, "retrieveAdditionalActions");
/*     */     return new Build(name, description, command, msDuration, actionApprovalRequestData, retrieveAdditionalActions);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Build(name=" + this.name + ", description=" + this.description + ", command=" + this.command + ", msDuration=" + this.msDuration + ", actionApprovalRequestData=" + this.actionApprovalRequestData + ", retrieveAdditionalActions=" + this.retrieveAdditionalActions + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.name.hashCode();
/*     */     result = result * 31 + this.description.hashCode();
/*     */     result = result * 31 + this.command.hashCode();
/*     */     result = result * 31 + ((this.msDuration == null) ? 0 : this.msDuration.hashCode());
/*     */     result = result * 31 + ((this.actionApprovalRequestData == null) ? 0 : this.actionApprovalRequestData.hashCode());
/*     */     return result * 31 + this.retrieveAdditionalActions.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof Build))
/*     */       return false; 
/*     */     Build build = (Build)other;
/*     */     return !Intrinsics.areEqual(this.name, build.name) ? false : (!Intrinsics.areEqual(this.description, build.description) ? false : (!Intrinsics.areEqual(this.command, build.command) ? false : (!Intrinsics.areEqual(this.msDuration, build.msDuration) ? false : (!Intrinsics.areEqual(this.actionApprovalRequestData, build.actionApprovalRequestData) ? false : (!!Intrinsics.areEqual(this.retrieveAdditionalActions, build.retrieveAdditionalActions))))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\model\TaskStep$Build.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */