/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.StepType;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.Action;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.flow.Flow;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\t\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020 \n\002\b\023\n\002\030\002\n\002\b\016\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001Bo\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\f\020\006\032\b\022\004\022\0020\0030\007\022\n\b\002\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\t\022\n\b\002\020\013\032\004\030\0010\f\022\n\b\002\020\r\032\004\030\0010\016\022\022\020\017\032\016\022\n\022\b\022\004\022\0020\t0\0210\020¢\006\004\b\022\020\023J\t\020(\032\0020\003HÆ\003J\t\020)\032\0020\003HÆ\003J\t\020*\032\0020\003HÆ\003J\017\020+\032\b\022\004\022\0020\0030\007HÆ\003J\013\020,\032\004\030\0010\tHÆ\003J\013\020-\032\004\030\0010\tHÆ\003J\020\020.\032\004\030\0010\fHÆ\003¢\006\002\020\036J\013\020/\032\004\030\0010\016HÆ\003J\025\0200\032\016\022\n\022\b\022\004\022\0020\t0\0210\020HÆ\003J\001\0201\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\016\b\002\020\006\032\b\022\004\022\0020\0030\0072\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\t2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\0162\024\b\002\020\017\032\016\022\n\022\b\022\004\022\0020\t0\0210\020HÆ\001¢\006\002\0202J\023\0203\032\002042\b\0205\032\004\030\00106HÖ\003J\t\0207\032\00208HÖ\001J\t\0209\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\024\020\025R\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\026\020\025R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\027\020\025R\027\020\006\032\b\022\004\022\0020\0030\007¢\006\b\n\000\032\004\b\030\020\031R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b\032\020\033R\023\020\n\032\004\030\0010\t¢\006\b\n\000\032\004\b\034\020\033R\025\020\013\032\004\030\0010\f¢\006\n\n\002\020\037\032\004\b\035\020\036R\026\020\r\032\004\030\0010\016X\004¢\006\b\n\000\032\004\b \020!R \020\017\032\016\022\n\022\b\022\004\022\0020\t0\0210\020X\004¢\006\b\n\000\032\004\b\"\020#R\024\020$\032\0020%X\004¢\006\b\n\000\032\004\b&\020'¨\006:"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Terminal;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$HumanInLoopStep;", "name", "", "description", "command", "output", "Lkotlinx/coroutines/flow/Flow;", "onStop", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "onOpen", "msDuration", "", "actionApprovalRequestData", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;", "retrieveAdditionalActions", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/coroutines/flow/Flow;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Ljava/lang/Long;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;Lkotlin/jvm/functions/Function0;)V", "getName", "()Ljava/lang/String;", "getDescription", "getCommand", "getOutput", "()Lkotlinx/coroutines/flow/Flow;", "getOnStop", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "getOnOpen", "getMsDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getActionApprovalRequestData", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;", "getRetrieveAdditionalActions", "()Lkotlin/jvm/functions/Function0;", "stepType", "Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "getStepType", "()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/coroutines/flow/Flow;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Ljava/lang/Long;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;Lkotlin/jvm/functions/Function0;)Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Terminal;", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class Terminal
/*    */   extends TaskStep.HumanInLoopStep
/*    */ {
/*    */   @NotNull
/*    */   private final String name;
/*    */   @NotNull
/*    */   private final String description;
/*    */   @NotNull
/*    */   private final String command;
/*    */   @NotNull
/*    */   private final Flow<String> output;
/*    */   @Nullable
/*    */   private final Action onStop;
/*    */   @Nullable
/*    */   private final Action onOpen;
/*    */   @Nullable
/*    */   private final Long msDuration;
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
/* 84 */     return this.name; } @NotNull
/* 85 */   public String getDescription() { return this.description; } @NotNull
/* 86 */   public final String getCommand() { return this.command; } @NotNull
/* 87 */   public final Flow<String> getOutput() { return this.output; } @Nullable
/* 88 */   public final Action getOnStop() { return this.onStop; } @Nullable
/* 89 */   public final Action getOnOpen() { return this.onOpen; } @Nullable
/* 90 */   public final Long getMsDuration() { return this.msDuration; } @Nullable
/* 91 */   public ActionApprovalRequestData getActionApprovalRequestData() { return this.actionApprovalRequestData; } @NotNull
/* 92 */   public Function0<List<Action>> getRetrieveAdditionalActions() { return this.retrieveAdditionalActions; }
/* 93 */   public Terminal(@NotNull String name, @NotNull String description, @NotNull String command, @NotNull Flow<String> output, @Nullable Action onStop, @Nullable Action onOpen, @Nullable Long msDuration, @Nullable ActionApprovalRequestData actionApprovalRequestData, @NotNull Function0<List<Action>> retrieveAdditionalActions) { super(null); this.name = name; this.description = description; this.command = command; this.output = output; this.onStop = onStop; this.onOpen = onOpen; this.msDuration = msDuration; this.actionApprovalRequestData = actionApprovalRequestData; this.retrieveAdditionalActions = retrieveAdditionalActions;
/* 94 */     this.stepType = StepType.Terminal; } @NotNull public StepType getStepType() { return this.stepType; }
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
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.command;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Flow<String> component4() {
/*    */     return this.output;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Action component5() {
/*    */     return this.onStop;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Action component6() {
/*    */     return this.onOpen;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Long component7() {
/*    */     return this.msDuration;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final ActionApprovalRequestData component8() {
/*    */     return this.actionApprovalRequestData;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function0<List<Action>> component9() {
/*    */     return this.retrieveAdditionalActions;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Terminal copy(@NotNull String name, @NotNull String description, @NotNull String command, @NotNull Flow<String> output, @Nullable Action onStop, @Nullable Action onOpen, @Nullable Long msDuration, @Nullable ActionApprovalRequestData actionApprovalRequestData, @NotNull Function0<? extends List<Action>> retrieveAdditionalActions) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     Intrinsics.checkNotNullParameter(description, "description");
/*    */     Intrinsics.checkNotNullParameter(command, "command");
/*    */     Intrinsics.checkNotNullParameter(output, "output");
/*    */     Intrinsics.checkNotNullParameter(retrieveAdditionalActions, "retrieveAdditionalActions");
/*    */     return new Terminal(name, description, command, output, onStop, onOpen, msDuration, actionApprovalRequestData, retrieveAdditionalActions);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Terminal(name=" + this.name + ", description=" + this.description + ", command=" + this.command + ", output=" + this.output + ", onStop=" + this.onStop + ", onOpen=" + this.onOpen + ", msDuration=" + this.msDuration + ", actionApprovalRequestData=" + this.actionApprovalRequestData + ", retrieveAdditionalActions=" + this.retrieveAdditionalActions + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.name.hashCode();
/*    */     result = result * 31 + this.description.hashCode();
/*    */     result = result * 31 + this.command.hashCode();
/*    */     result = result * 31 + this.output.hashCode();
/*    */     result = result * 31 + ((this.onStop == null) ? 0 : this.onStop.hashCode());
/*    */     result = result * 31 + ((this.onOpen == null) ? 0 : this.onOpen.hashCode());
/*    */     result = result * 31 + ((this.msDuration == null) ? 0 : this.msDuration.hashCode());
/*    */     result = result * 31 + ((this.actionApprovalRequestData == null) ? 0 : this.actionApprovalRequestData.hashCode());
/*    */     return result * 31 + this.retrieveAdditionalActions.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Terminal))
/*    */       return false; 
/*    */     Terminal terminal = (Terminal)other;
/*    */     return !Intrinsics.areEqual(this.name, terminal.name) ? false : (!Intrinsics.areEqual(this.description, terminal.description) ? false : (!Intrinsics.areEqual(this.command, terminal.command) ? false : (!Intrinsics.areEqual(this.output, terminal.output) ? false : (!Intrinsics.areEqual(this.onStop, terminal.onStop) ? false : (!Intrinsics.areEqual(this.onOpen, terminal.onOpen) ? false : (!Intrinsics.areEqual(this.msDuration, terminal.msDuration) ? false : (!Intrinsics.areEqual(this.actionApprovalRequestData, terminal.actionApprovalRequestData) ? false : (!!Intrinsics.areEqual(this.retrieveAdditionalActions, terminal.retrieveAdditionalActions)))))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\model\TaskStep$Terminal.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */