/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.StepType;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TestRun;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\020\t\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\020\n\002\030\002\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001BY\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\f\020\006\032\b\022\004\022\0020\b0\007\022\n\b\002\020\t\032\004\030\0010\n\022\022\020\013\032\016\022\n\022\b\022\004\022\0020\r0\0070\f\022\n\b\002\020\016\032\004\030\0010\017¢\006\004\b\020\020\021J\t\020#\032\0020\003HÆ\003J\t\020$\032\0020\003HÆ\003J\t\020%\032\0020\003HÆ\003J\017\020&\032\b\022\004\022\0020\b0\007HÆ\003J\020\020'\032\004\030\0010\nHÆ\003¢\006\002\020\031J\025\020(\032\016\022\n\022\b\022\004\022\0020\r0\0070\fHÆ\003J\013\020)\032\004\030\0010\017HÆ\003Jj\020*\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\n\b\002\020\t\032\004\030\0010\n2\024\b\002\020\013\032\016\022\n\022\b\022\004\022\0020\r0\0070\f2\n\b\002\020\016\032\004\030\0010\017HÆ\001¢\006\002\020+J\023\020,\032\0020-2\b\020.\032\004\030\0010/HÖ\003J\t\0200\032\00201HÖ\001J\t\0202\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\022\020\023R\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\024\020\023R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\025\020\023R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\026\020\027R\025\020\t\032\004\030\0010\n¢\006\n\n\002\020\032\032\004\b\030\020\031R \020\013\032\016\022\n\022\b\022\004\022\0020\r0\0070\fX\004¢\006\b\n\000\032\004\b\033\020\034R\026\020\016\032\004\030\0010\017X\004¢\006\b\n\000\032\004\b\035\020\036R\024\020\037\032\0020 X\004¢\006\b\n\000\032\004\b!\020\"¨\0063"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Test;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$HumanInLoopStep;", "name", "", "description", "command", "tests", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TestRun;", "msDuration", "", "retrieveAdditionalActions", "Lkotlin/Function0;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "actionApprovalRequestData", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;)V", "getName", "()Ljava/lang/String;", "getDescription", "getCommand", "getTests", "()Ljava/util/List;", "getMsDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRetrieveAdditionalActions", "()Lkotlin/jvm/functions/Function0;", "getActionApprovalRequestData", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;", "stepType", "Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "getStepType", "()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;)Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Test;", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class Test
/*     */   extends TaskStep.HumanInLoopStep
/*     */ {
/*     */   @NotNull
/*     */   private final String name;
/*     */   @NotNull
/*     */   private final String description;
/*     */   @NotNull
/*     */   private final String command;
/*     */   @NotNull
/*     */   private final List<TestRun> tests;
/*     */   @Nullable
/*     */   private final Long msDuration;
/*     */   @NotNull
/*     */   private final Function0<List<Action>> retrieveAdditionalActions;
/*     */   @Nullable
/*     */   private final ActionApprovalRequestData actionApprovalRequestData;
/*     */   @NotNull
/*     */   private final StepType stepType;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @NotNull
/*     */   public String getName() {
/*  98 */     return this.name; } @NotNull
/*  99 */   public String getDescription() { return this.description; } @NotNull
/* 100 */   public final String getCommand() { return this.command; } @NotNull
/* 101 */   public final List<TestRun> getTests() { return this.tests; } @Nullable
/* 102 */   public final Long getMsDuration() { return this.msDuration; } @NotNull
/* 103 */   public Function0<List<Action>> getRetrieveAdditionalActions() { return this.retrieveAdditionalActions; } @Nullable
/* 104 */   public ActionApprovalRequestData getActionApprovalRequestData() { return this.actionApprovalRequestData; }
/* 105 */   public Test(@NotNull String name, @NotNull String description, @NotNull String command, @NotNull List<TestRun> tests, @Nullable Long msDuration, @NotNull Function0<List<Action>> retrieveAdditionalActions, @Nullable ActionApprovalRequestData actionApprovalRequestData) { super(null); this.name = name; this.description = description; this.command = command; this.tests = tests; this.msDuration = msDuration; this.retrieveAdditionalActions = retrieveAdditionalActions; this.actionApprovalRequestData = actionApprovalRequestData;
/* 106 */     this.stepType = StepType.Tests; } @NotNull public StepType getStepType() { return this.stepType; }
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
/*     */   @NotNull
/*     */   public final List<TestRun> component4() {
/*     */     return this.tests;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Long component5() {
/*     */     return this.msDuration;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Function0<List<Action>> component6() {
/*     */     return this.retrieveAdditionalActions;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final ActionApprovalRequestData component7() {
/*     */     return this.actionApprovalRequestData;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Test copy(@NotNull String name, @NotNull String description, @NotNull String command, @NotNull List<TestRun> tests, @Nullable Long msDuration, @NotNull Function0<? extends List<Action>> retrieveAdditionalActions, @Nullable ActionApprovalRequestData actionApprovalRequestData) {
/*     */     Intrinsics.checkNotNullParameter(name, "name");
/*     */     Intrinsics.checkNotNullParameter(description, "description");
/*     */     Intrinsics.checkNotNullParameter(command, "command");
/*     */     Intrinsics.checkNotNullParameter(tests, "tests");
/*     */     Intrinsics.checkNotNullParameter(retrieveAdditionalActions, "retrieveAdditionalActions");
/*     */     return new Test(name, description, command, tests, msDuration, retrieveAdditionalActions, actionApprovalRequestData);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Test(name=" + this.name + ", description=" + this.description + ", command=" + this.command + ", tests=" + this.tests + ", msDuration=" + this.msDuration + ", retrieveAdditionalActions=" + this.retrieveAdditionalActions + ", actionApprovalRequestData=" + this.actionApprovalRequestData + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.name.hashCode();
/*     */     result = result * 31 + this.description.hashCode();
/*     */     result = result * 31 + this.command.hashCode();
/*     */     result = result * 31 + this.tests.hashCode();
/*     */     result = result * 31 + ((this.msDuration == null) ? 0 : this.msDuration.hashCode());
/*     */     result = result * 31 + this.retrieveAdditionalActions.hashCode();
/*     */     return result * 31 + ((this.actionApprovalRequestData == null) ? 0 : this.actionApprovalRequestData.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof Test))
/*     */       return false; 
/*     */     Test test = (Test)other;
/*     */     return !Intrinsics.areEqual(this.name, test.name) ? false : (!Intrinsics.areEqual(this.description, test.description) ? false : (!Intrinsics.areEqual(this.command, test.command) ? false : (!Intrinsics.areEqual(this.tests, test.tests) ? false : (!Intrinsics.areEqual(this.msDuration, test.msDuration) ? false : (!Intrinsics.areEqual(this.retrieveAdditionalActions, test.retrieveAdditionalActions) ? false : (!!Intrinsics.areEqual(this.actionApprovalRequestData, test.actionApprovalRequestData)))))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\model\TaskStep$Test.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */