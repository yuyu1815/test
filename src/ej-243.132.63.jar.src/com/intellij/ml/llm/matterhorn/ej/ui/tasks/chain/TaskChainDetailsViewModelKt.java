/*      */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain;
/*      */ 
/*      */ import androidx.compose.runtime.Composable;
/*      */ import androidx.compose.runtime.Composer;
/*      */ import androidx.compose.runtime.ComposerKt;
/*      */ import com.intellij.ml.llm.matterhorn.ActionType;
/*      */ import com.intellij.ml.llm.matterhorn.HumanInLoopResponse;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.ActionApprovalRequest;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.EditApprovalRequest;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.HumanInLoopRequest;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.StepType;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.FileChange;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskChain;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskSnapshot;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.ProgressEntity;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskChainState;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TerminalState;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.StepEntity;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainEntity;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskId;
/*      */ import com.intellij.ml.llm.matterhorn.ej.ui.settings.JunieAllowlistSettingsConfigurable;
/*      */ import com.intellij.ml.llm.matterhorn.ej.ui.statistics.CompositeUiAction;
/*      */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.Action;
/*      */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.ActionApprovalRequestData;
/*      */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.EditApprovalRequestData;
/*      */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskRecapModel;
/*      */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*      */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*      */ import com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.OnShowDiff;
/*      */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*      */ import com.intellij.ml.llm.matterhorn.settings.ActionRule;
/*      */ import com.intellij.ml.llm.matterhorn.settings.MatterhornModelPersistentStateComponent;
/*      */ import com.intellij.openapi.options.ShowSettingsUtil;
/*      */ import com.intellij.openapi.project.Project;
/*      */ import java.nio.file.Path;
/*      */ import java.util.ArrayList;
/*      */ import java.util.HashMap;
/*      */ import java.util.Iterator;
/*      */ import java.util.LinkedHashMap;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.NoWhenBranchMatchedException;
/*      */ import kotlin.ResultKt;
/*      */ import kotlin.Unit;
/*      */ import kotlin.collections.CollectionsKt;
/*      */ import kotlin.coroutines.Continuation;
/*      */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*      */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*      */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.functions.Function6;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlinx.collections.immutable.PersistentList;
/*      */ import kotlinx.coroutines.BuildersKt;
/*      */ import kotlinx.coroutines.CoroutineScope;
/*      */ import kotlinx.coroutines.Job;
/*      */ import kotlinx.coroutines.flow.Flow;
/*      */ import kotlinx.coroutines.flow.FlowKt;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ import org.jetbrains.jewel.ui.icon.IconKey;
/*      */ import org.jetbrains.jewel.ui.icon.PathIconKey;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000Ø\001\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020$\n\002\020\b\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\032\003\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\0042\f\020\005\032\b\022\004\022\0020\0070\0062\006\020\b\032\0020\t2\006\020\n\032\0020\0132\016\020\f\032\n\022\004\022\0020\016\030\0010\r2\024\020\017\032\020\022\004\022\0020\021\022\004\022\0020\016\030\0010\0202\006\020\022\032\0020\0232\006\020\024\032\0020\0252\n\b\002\020\026\032\004\030\0010\0272\016\020\030\032\n\022\004\022\0020\016\030\0010\r2\b\020\031\032\004\030\0010\0322\006\020\033\032\0020\0342\"\020\035\032\036\b\001\022\004\022\0020\037\022\n\022\b\022\004\022\0020\0160 \022\006\022\004\030\0010!0\0362\"\020\"\032\036\b\001\022\004\022\0020\037\022\n\022\b\022\004\022\0020\0160 \022\006\022\004\030\0010!0\0362\"\020#\032\036\b\001\022\004\022\0020\037\022\n\022\b\022\004\022\0020\0160 \022\006\022\004\030\0010!0\03626\020$\0322\022\023\022\0210%¢\006\f\b&\022\b\b'\022\004\b\b((\022\023\022\0210%¢\006\f\b&\022\b\b'\022\004\b\b()\022\004\022\0020\0160\0362\"\020*\032\036\b\001\022\004\022\0020\037\022\n\022\b\022\004\022\0020\0160 \022\006\022\004\030\0010!0\0362\"\020+\032\036\b\001\022\004\022\0020\037\022\n\022\b\022\004\022\0020\0250 \022\006\022\004\030\0010!0\036¢\006\002\020,\032\003\020-\032\0020\0022\006\020.\032\0020/2\006\0200\032\0020\0072\006\0201\032\002022\006\020\n\032\0020\0132\006\020\003\032\0020\0042\016\020\f\032\n\022\004\022\0020\016\030\0010\r2\024\020\017\032\020\022\004\022\0020\021\022\004\022\0020\016\030\0010\0202\006\020\022\032\0020\0232\006\0203\032\0020\0252\006\020\024\032\0020\0252\b\0204\032\004\030\001052\b\0206\032\004\030\001072\016\020\030\032\n\022\004\022\0020\016\030\0010\r2\006\020\033\032\0020\0342\"\020\035\032\036\b\001\022\004\022\0020\037\022\n\022\b\022\004\022\0020\0160 \022\006\022\004\030\0010!0\0362\"\020\"\032\036\b\001\022\004\022\0020\037\022\n\022\b\022\004\022\0020\0160 \022\006\022\004\030\0010!0\0362\"\020#\032\036\b\001\022\004\022\0020\037\022\n\022\b\022\004\022\0020\0160 \022\006\022\004\030\0010!0\0362\"\020*\032\036\b\001\022\004\022\0020\037\022\n\022\b\022\004\022\0020\0160 \022\006\022\004\030\0010!0\0362\"\020+\032\036\b\001\022\004\022\0020\037\022\n\022\b\022\004\022\0020\0250 \022\006\022\004\030\0010!0\0362\016\0208\032\n\022\004\022\0020\016\030\0010\r26\020$\0322\022\023\022\0210%¢\006\f\b&\022\b\b'\022\004\b\b((\022\023\022\0210%¢\006\f\b&\022\b\b'\022\004\b\b()\022\004\022\0020\0160\036¢\006\002\0209\032\032\020:\032\b\022\004\022\0020\0370\0012\f\020;\032\b\022\004\022\0020/0\006\032\025\020<\032\0020=2\006\0201\032\00202H\007¢\006\002\020>\032\025\020?\032\0020=2\006\0201\032\00202H\007¢\006\002\020>\032\020\020@\032\004\030\0010%2\006\0201\032\0020A\032\022\020B\032\b\022\004\022\0020D0C*\0020EH\002\032\034\020F\032\016\022\004\022\0020H\022\004\022\0020I0G*\b\022\004\022\0020\0020\001\032\024\020J\032\n\022\004\022\0020\016\030\0010\r*\0020KH\002\0326\020L\032\b\022\004\022\0020M0\0012\006\020\n\032\0020\0132\006\020N\032\0020O2\006\020P\032\0020%2\016\020Q\032\n\022\004\022\0020\016\030\0010\rH\000¨\006R"}, d2 = {"produceStepVMs", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;", "llmProxy", "Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "tasks", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;", "chain", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;", "project", "Lcom/intellij/openapi/project/Project;", "doneAction", "Lkotlin/Function0;", "", "declineAction", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "hasChanges", "", "humanInLoopRequest", "Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;", "stopTerminalCommandAction", "progress", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;", "onShowDiff", "Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff;", "onDelete", "Lkotlin/Function2;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "Lkotlin/coroutines/Continuation;", "", "onLocate", "onRollback", "openMarkdownInEditor", "", "Lkotlin/ParameterName;", "name", "fileName", "rawMarkdown", "onSetVCS", "onVCS", "(Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;Lkotlinx/collections/immutable/PersistentList;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;ZLcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;Lkotlin/jvm/functions/Function0;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "convertStepToVm", "stepEntity", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;", "task", "state", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;", "taskIsLastInChain", "actionApprovalRequestData", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;", "editApprovalRequestData", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/EditApprovalRequestData;", "onOpenTerminal", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;ZZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/EditApprovalRequestData;Lkotlin/jvm/functions/Function0;Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;", "collectFileChanges", "steps", "getStateSmallIcon", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/icon/IconKey;", "getStateIcon", "getStepTypeText", "Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "getChainData", "Lkotlinx/coroutines/flow/Flow;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/LiveTaskChainData;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;", "collectRecap", "", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskRecapModel;", "openTerminalAction", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState;", "getWhiteListContextActions", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "actionType", "Lcom/intellij/ml/llm/matterhorn/ActionType;", "action", "runAction", "ej-ui"})
/*      */ @SourceDebugExtension({"SMAP\nTaskChainDetailsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskChainDetailsViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,1064:1\n774#2:1065\n865#2,2:1066\n1557#2:1069\n1628#2,3:1070\n1863#2,2:1073\n461#2,6:1077\n1863#2,2:1083\n1863#2,2:1085\n1#3:1068\n31#4,2:1075\n*S KotlinDebug\n*F\n+ 1 TaskChainDetailsViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModelKt\n*L\n472#1:1065\n472#1:1066,2\n658#1:1069\n658#1:1070,3\n949#1:1073,2\n845#1:1077,6\n1023#1:1083,2\n1042#1:1085,2\n1015#1:1075,2\n*E\n"})
/*      */ public final class TaskChainDetailsViewModelKt
/*      */ {
/*      */   @NotNull
/*      */   public static final List<TaskStep> produceStepVMs(@NotNull LLMProxy llmProxy, @NotNull PersistentList tasks, @NotNull TaskChainEntity chain, @NotNull Project project, @Nullable Function0 doneAction, @Nullable Function1 declineAction, @NotNull CoroutineScope scope, boolean hasChanges, @Nullable HumanInLoopRequest humanInLoopRequest, @Nullable Function0 stopTerminalCommandAction, @Nullable ProgressEntity progress, @NotNull OnShowDiff onShowDiff, @NotNull Function2 onDelete, @NotNull Function2 onLocate, @NotNull Function2 onRollback, @NotNull Function2 openMarkdownInEditor, @NotNull Function2 onSetVCS, @NotNull Function2 onVCS) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc 'llmProxy'
/*      */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   6: aload_1
/*      */     //   7: ldc 'tasks'
/*      */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   12: aload_2
/*      */     //   13: ldc 'chain'
/*      */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   18: aload_3
/*      */     //   19: ldc 'project'
/*      */     //   21: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   24: aload #6
/*      */     //   26: ldc 'scope'
/*      */     //   28: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   31: aload #11
/*      */     //   33: ldc 'onShowDiff'
/*      */     //   35: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   38: aload #12
/*      */     //   40: ldc 'onDelete'
/*      */     //   42: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   45: aload #13
/*      */     //   47: ldc 'onLocate'
/*      */     //   49: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   52: aload #14
/*      */     //   54: ldc 'onRollback'
/*      */     //   56: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   59: aload #15
/*      */     //   61: ldc 'openMarkdownInEditor'
/*      */     //   63: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   66: aload #16
/*      */     //   68: ldc 'onSetVCS'
/*      */     //   70: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   73: aload #17
/*      */     //   75: ldc 'onVCS'
/*      */     //   77: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   80: invokestatic createListBuilder : ()Ljava/util/List;
/*      */     //   83: astore #19
/*      */     //   85: aload #19
/*      */     //   87: astore #20
/*      */     //   89: iconst_0
/*      */     //   90: istore #21
/*      */     //   92: aload_1
/*      */     //   93: checkcast java/lang/Iterable
/*      */     //   96: astore #22
/*      */     //   98: iconst_0
/*      */     //   99: istore #23
/*      */     //   101: aload #22
/*      */     //   103: astore #24
/*      */     //   105: new java/util/ArrayList
/*      */     //   108: dup
/*      */     //   109: invokespecial <init> : ()V
/*      */     //   112: checkcast java/util/Collection
/*      */     //   115: astore #25
/*      */     //   117: iconst_0
/*      */     //   118: istore #26
/*      */     //   120: aload #24
/*      */     //   122: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */     //   127: astore #27
/*      */     //   129: aload #27
/*      */     //   131: invokeinterface hasNext : ()Z
/*      */     //   136: ifeq -> 187
/*      */     //   139: aload #27
/*      */     //   141: invokeinterface next : ()Ljava/lang/Object;
/*      */     //   146: astore #28
/*      */     //   148: aload #28
/*      */     //   150: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*      */     //   153: astore #29
/*      */     //   155: iconst_0
/*      */     //   156: istore #30
/*      */     //   158: aload #29
/*      */     //   160: invokevirtual isDeclined : ()Z
/*      */     //   163: ifne -> 170
/*      */     //   166: iconst_1
/*      */     //   167: goto -> 171
/*      */     //   170: iconst_0
/*      */     //   171: ifeq -> 129
/*      */     //   174: aload #25
/*      */     //   176: aload #28
/*      */     //   178: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   183: pop
/*      */     //   184: goto -> 129
/*      */     //   187: aload #25
/*      */     //   189: checkcast java/util/List
/*      */     //   192: nop
/*      */     //   193: checkcast java/lang/Iterable
/*      */     //   196: invokestatic toPersistentList : (Ljava/lang/Iterable;)Lkotlinx/collections/immutable/PersistentList;
/*      */     //   199: astore #31
/*      */     //   201: aload #31
/*      */     //   203: checkcast java/lang/Iterable
/*      */     //   206: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */     //   211: astore #22
/*      */     //   213: iconst_0
/*      */     //   214: istore #23
/*      */     //   216: aload #22
/*      */     //   218: invokeinterface hasNext : ()Z
/*      */     //   223: ifeq -> 481
/*      */     //   226: iload #23
/*      */     //   228: istore #24
/*      */     //   230: iload #23
/*      */     //   232: iconst_1
/*      */     //   233: iadd
/*      */     //   234: istore #23
/*      */     //   236: aload #22
/*      */     //   238: invokeinterface next : ()Ljava/lang/Object;
/*      */     //   243: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*      */     //   246: astore #25
/*      */     //   248: aload #25
/*      */     //   250: invokevirtual getTask : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*      */     //   253: invokevirtual getPlan : ()Ljava/util/List;
/*      */     //   256: astore #26
/*      */     //   258: aload #25
/*      */     //   260: invokevirtual getSteps : ()Lkotlinx/collections/immutable/PersistentList;
/*      */     //   263: astore #27
/*      */     //   265: aload #27
/*      */     //   267: checkcast java/util/List
/*      */     //   270: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*      */     //   273: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity
/*      */     //   276: astore #28
/*      */     //   278: aload #25
/*      */     //   280: invokevirtual getTerminalState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState;
/*      */     //   283: invokestatic openTerminalAction : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState;)Lkotlin/jvm/functions/Function0;
/*      */     //   286: astore #29
/*      */     //   288: aload_2
/*      */     //   289: iload #24
/*      */     //   291: aload #31
/*      */     //   293: aload #8
/*      */     //   295: aload #9
/*      */     //   297: aload #25
/*      */     //   299: aload_3
/*      */     //   300: aload_0
/*      */     //   301: aload #4
/*      */     //   303: aload #5
/*      */     //   305: aload #6
/*      */     //   307: iload #7
/*      */     //   309: aload #11
/*      */     //   311: aload #12
/*      */     //   313: aload #13
/*      */     //   315: aload #14
/*      */     //   317: aload #16
/*      */     //   319: aload #17
/*      */     //   321: aload #29
/*      */     //   323: aload #15
/*      */     //   325: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;ILkotlinx/collections/immutable/PersistentList;Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;Lkotlin/jvm/functions/Function0;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;ZLcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;
/*      */     //   330: astore #30
/*      */     //   332: aload #28
/*      */     //   334: ifnull -> 358
/*      */     //   337: aload #20
/*      */     //   339: aload #30
/*      */     //   341: aload #28
/*      */     //   343: iconst_0
/*      */     //   344: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   347: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   352: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   357: pop
/*      */     //   358: aload #26
/*      */     //   360: ifnull -> 384
/*      */     //   363: aload #20
/*      */     //   365: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Plan
/*      */     //   368: dup
/*      */     //   369: ldc 'Plan'
/*      */     //   371: ldc ''
/*      */     //   373: aload #26
/*      */     //   375: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
/*      */     //   378: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   383: pop
/*      */     //   384: aload #27
/*      */     //   386: checkcast java/lang/Iterable
/*      */     //   389: invokestatic asSequence : (Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
/*      */     //   392: iconst_1
/*      */     //   393: invokestatic drop : (Lkotlin/sequences/Sequence;I)Lkotlin/sequences/Sequence;
/*      */     //   396: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */     //   401: astore #32
/*      */     //   403: iconst_0
/*      */     //   404: istore #33
/*      */     //   406: aload #32
/*      */     //   408: invokeinterface hasNext : ()Z
/*      */     //   413: ifeq -> 216
/*      */     //   416: iload #33
/*      */     //   418: istore #34
/*      */     //   420: iload #33
/*      */     //   422: iconst_1
/*      */     //   423: iadd
/*      */     //   424: istore #33
/*      */     //   426: aload #32
/*      */     //   428: invokeinterface next : ()Ljava/lang/Object;
/*      */     //   433: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity
/*      */     //   436: astore #35
/*      */     //   438: aload #20
/*      */     //   440: aload #30
/*      */     //   442: aload #35
/*      */     //   444: iload #34
/*      */     //   446: aload #27
/*      */     //   448: checkcast java/util/List
/*      */     //   451: invokestatic getLastIndex : (Ljava/util/List;)I
/*      */     //   454: iconst_1
/*      */     //   455: isub
/*      */     //   456: if_icmpne -> 463
/*      */     //   459: iconst_1
/*      */     //   460: goto -> 464
/*      */     //   463: iconst_0
/*      */     //   464: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   467: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   472: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   477: pop
/*      */     //   478: goto -> 406
/*      */     //   481: aload_2
/*      */     //   482: invokevirtual getState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*      */     //   485: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Running : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*      */     //   488: if_acmpne -> 688
/*      */     //   491: aload #20
/*      */     //   493: invokeinterface isEmpty : ()Z
/*      */     //   498: ifeq -> 511
/*      */     //   501: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainStepMappingException
/*      */     //   504: dup
/*      */     //   505: ldc 'There should not be 0 steps (prompt at least should be present)'
/*      */     //   507: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   510: athrow
/*      */     //   511: aload #10
/*      */     //   513: ifnull -> 593
/*      */     //   516: aload #20
/*      */     //   518: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*      */     //   521: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep
/*      */     //   524: astore #22
/*      */     //   526: aload #22
/*      */     //   528: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Progress
/*      */     //   531: ifne -> 688
/*      */     //   534: aload #22
/*      */     //   536: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Terminal
/*      */     //   539: ifeq -> 550
/*      */     //   542: aload #22
/*      */     //   544: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Terminal
/*      */     //   547: goto -> 551
/*      */     //   550: aconst_null
/*      */     //   551: dup
/*      */     //   552: ifnull -> 561
/*      */     //   555: invokevirtual getOnStop : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*      */     //   558: goto -> 563
/*      */     //   561: pop
/*      */     //   562: aconst_null
/*      */     //   563: ifnonnull -> 688
/*      */     //   566: aload #20
/*      */     //   568: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Progress
/*      */     //   571: dup
/*      */     //   572: aconst_null
/*      */     //   573: aload #10
/*      */     //   575: invokevirtual getText : ()Ljava/lang/String;
/*      */     //   578: aconst_null
/*      */     //   579: iconst_5
/*      */     //   580: aconst_null
/*      */     //   581: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*      */     //   584: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   589: pop
/*      */     //   590: goto -> 688
/*      */     //   593: aload #20
/*      */     //   595: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*      */     //   598: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep
/*      */     //   601: astore #22
/*      */     //   603: aload_1
/*      */     //   604: checkcast java/util/List
/*      */     //   607: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*      */     //   610: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*      */     //   613: invokevirtual getSteps : ()Lkotlinx/collections/immutable/PersistentList;
/*      */     //   616: astore #23
/*      */     //   618: aload #23
/*      */     //   620: checkcast java/util/List
/*      */     //   623: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*      */     //   626: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity
/*      */     //   629: invokevirtual isCompleted : ()Z
/*      */     //   632: ifeq -> 688
/*      */     //   635: aload #22
/*      */     //   637: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Terminal
/*      */     //   640: ifeq -> 651
/*      */     //   643: aload #22
/*      */     //   645: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Terminal
/*      */     //   648: goto -> 652
/*      */     //   651: aconst_null
/*      */     //   652: dup
/*      */     //   653: ifnull -> 662
/*      */     //   656: invokevirtual getOnStop : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*      */     //   659: goto -> 664
/*      */     //   662: pop
/*      */     //   663: aconst_null
/*      */     //   664: ifnonnull -> 688
/*      */     //   667: aload #20
/*      */     //   669: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Progress
/*      */     //   672: dup
/*      */     //   673: aconst_null
/*      */     //   674: ldc 'Working'
/*      */     //   676: aconst_null
/*      */     //   677: iconst_5
/*      */     //   678: aconst_null
/*      */     //   679: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*      */     //   682: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   687: pop
/*      */     //   688: aload_2
/*      */     //   689: invokevirtual getState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*      */     //   692: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Stopped : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*      */     //   695: if_acmpne -> 772
/*      */     //   698: aload #20
/*      */     //   700: ldc 'Stopped'
/*      */     //   702: ldc 'Task has been stopped'
/*      */     //   704: aload #4
/*      */     //   706: dup
/*      */     //   707: ifnull -> 745
/*      */     //   710: astore #23
/*      */     //   712: astore #36
/*      */     //   714: astore #37
/*      */     //   716: astore #38
/*      */     //   718: iconst_0
/*      */     //   719: istore #24
/*      */     //   721: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*      */     //   724: dup
/*      */     //   725: ldc 'Start new task'
/*      */     //   727: aload #23
/*      */     //   729: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*      */     //   732: astore #39
/*      */     //   734: aload #38
/*      */     //   736: aload #37
/*      */     //   738: aload #36
/*      */     //   740: aload #39
/*      */     //   742: goto -> 747
/*      */     //   745: pop
/*      */     //   746: aconst_null
/*      */     //   747: astore #40
/*      */     //   749: astore #41
/*      */     //   751: astore #42
/*      */     //   753: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Stop
/*      */     //   756: dup
/*      */     //   757: aload #42
/*      */     //   759: aload #41
/*      */     //   761: aload #40
/*      */     //   763: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;)V
/*      */     //   766: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   771: pop
/*      */     //   772: nop
/*      */     //   773: aload #19
/*      */     //   775: invokestatic build : (Ljava/util/List;)Ljava/util/List;
/*      */     //   778: astore #18
/*      */     //   780: aload #18
/*      */     //   782: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #471	-> 80
/*      */     //   #472	-> 92
/*      */     //   #1065	-> 101
/*      */     //   #1066	-> 120
/*      */     //   #472	-> 158
/*      */     //   #1066	-> 171
/*      */     //   #1067	-> 187
/*      */     //   #1065	-> 192
/*      */     //   #472	-> 196
/*      */     //   #473	-> 201
/*      */     //   #474	-> 248
/*      */     //   #475	-> 258
/*      */     //   #476	-> 265
/*      */     //   #477	-> 278
/*      */     //   #478	-> 288
/*      */     //   #535	-> 332
/*      */     //   #536	-> 337
/*      */     //   #538	-> 358
/*      */     //   #539	-> 363
/*      */     //   #541	-> 384
/*      */     //   #542	-> 438
/*      */     //   #547	-> 481
/*      */     //   #548	-> 491
/*      */     //   #550	-> 511
/*      */     //   #551	-> 516
/*      */     //   #552	-> 526
/*      */     //   #553	-> 534
/*      */     //   #555	-> 566
/*      */     //   #558	-> 593
/*      */     //   #559	-> 603
/*      */     //   #560	-> 618
/*      */     //   #561	-> 635
/*      */     //   #563	-> 667
/*      */     //   #567	-> 688
/*      */     //   #568	-> 698
/*      */     //   #569	-> 700
/*      */     //   #570	-> 700
/*      */     //   #571	-> 702
/*      */     //   #572	-> 704
/*      */     //   #1068	-> 712
/*      */     //   #572	-> 721
/*      */     //   #572	-> 742
/*      */     //   #572	-> 745
/*      */     //   #569	-> 747
/*      */     //   #568	-> 766
/*      */     //   #576	-> 772
/*      */     //   #471	-> 773
/*      */     //   #471	-> 778
/*      */     //   #577	-> 780
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   158	13	30	$i$a$-filter-TaskChainDetailsViewModelKt$produceStepVMs$steps$1$liveTasks$1	I
/*      */     //   155	16	29	it	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*      */     //   148	36	28	element$iv$iv	Ljava/lang/Object;
/*      */     //   120	69	26	$i$f$filterTo	I
/*      */     //   117	72	24	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*      */     //   117	72	25	destination$iv$iv	Ljava/util/Collection;
/*      */     //   101	92	23	$i$f$filter	I
/*      */     //   98	95	22	$this$filter$iv	Ljava/lang/Iterable;
/*      */     //   420	61	34	i	I
/*      */     //   438	43	35	step	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;
/*      */     //   258	223	26	plan	Ljava/util/List;
/*      */     //   265	216	27	steps	Lkotlinx/collections/immutable/PersistentList;
/*      */     //   278	203	28	prompt	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;
/*      */     //   288	193	29	openTerminal	Lkotlin/jvm/functions/Function0;
/*      */     //   332	149	30	convert	Lkotlin/jvm/functions/Function2;
/*      */     //   230	251	24	taskIndex	I
/*      */     //   248	233	25	task	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*      */     //   526	64	22	lastStep	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;
/*      */     //   603	85	22	lastStep	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;
/*      */     //   618	70	23	steps	Lkotlinx/collections/immutable/PersistentList;
/*      */     //   721	11	24	$i$a$-let-TaskChainDetailsViewModelKt$produceStepVMs$steps$1$1	I
/*      */     //   718	14	23	it	Lkotlin/jvm/functions/Function0;
/*      */     //   92	681	21	$i$a$-buildList-TaskChainDetailsViewModelKt$produceStepVMs$steps$1	I
/*      */     //   201	572	31	liveTasks	Lkotlinx/collections/immutable/PersistentList;
/*      */     //   89	684	20	$this$produceStepVMs_u24lambda_u247	Ljava/util/List;
/*      */     //   780	3	18	steps	Ljava/util/List;
/*      */     //   0	783	0	llmProxy	Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*      */     //   0	783	1	tasks	Lkotlinx/collections/immutable/PersistentList;
/*      */     //   0	783	2	chain	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*      */     //   0	783	3	project	Lcom/intellij/openapi/project/Project;
/*      */     //   0	783	4	doneAction	Lkotlin/jvm/functions/Function0;
/*      */     //   0	783	5	declineAction	Lkotlin/jvm/functions/Function1;
/*      */     //   0	783	6	scope	Lkotlinx/coroutines/CoroutineScope;
/*      */     //   0	783	7	hasChanges	Z
/*      */     //   0	783	8	humanInLoopRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;
/*      */     //   0	783	9	stopTerminalCommandAction	Lkotlin/jvm/functions/Function0;
/*      */     //   0	783	10	progress	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;
/*      */     //   0	783	11	onShowDiff	Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff;
/*      */     //   0	783	12	onDelete	Lkotlin/jvm/functions/Function2;
/*      */     //   0	783	13	onLocate	Lkotlin/jvm/functions/Function2;
/*      */     //   0	783	14	onRollback	Lkotlin/jvm/functions/Function2;
/*      */     //   0	783	15	openMarkdownInEditor	Lkotlin/jvm/functions/Function2;
/*      */     //   0	783	16	onSetVCS	Lkotlin/jvm/functions/Function2;
/*      */     //   0	783	17	onVCS	Lkotlin/jvm/functions/Function2;
/*      */   }
/*      */   
/*      */   private static final TaskStep produceStepVMs$lambda$7$lambda$5(TaskChainEntity $chain, int $taskIndex, PersistentList $liveTasks, HumanInLoopRequest $humanInLoopRequest, Function0 $stopTerminalCommandAction, LiveTaskSnapshot $task, Project $project, LLMProxy $llmProxy, Function0 $doneAction, Function1 $declineAction, CoroutineScope $scope, boolean $hasChanges, OnShowDiff $onShowDiff, Function2 $onDelete, Function2 $onLocate, Function2 $onRollback, Function2 $onSetVCS, Function2 $onVCS, Function0 $openTerminal, Function2 $openMarkdownInEditor, StepEntity step, boolean isLast) {
/*      */     // Byte code:
/*      */     //   0: aload #20
/*      */     //   2: ldc_w 'step'
/*      */     //   5: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   8: aload_0
/*      */     //   9: invokevirtual getState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*      */     //   12: astore #22
/*      */     //   14: iload_1
/*      */     //   15: aload_2
/*      */     //   16: checkcast java/util/List
/*      */     //   19: invokestatic getLastIndex : (Ljava/util/List;)I
/*      */     //   22: if_icmpne -> 29
/*      */     //   25: iconst_1
/*      */     //   26: goto -> 30
/*      */     //   29: iconst_0
/*      */     //   30: istore #23
/*      */     //   32: iload #21
/*      */     //   34: ifeq -> 89
/*      */     //   37: aload_3
/*      */     //   38: ifnull -> 89
/*      */     //   41: iload_1
/*      */     //   42: aload_2
/*      */     //   43: checkcast java/util/List
/*      */     //   46: invokestatic getLastIndex : (Ljava/util/List;)I
/*      */     //   49: if_icmpne -> 89
/*      */     //   52: aload_3
/*      */     //   53: instanceof com/intellij/ml/llm/matterhorn/ej/core/ActionApprovalRequest
/*      */     //   56: ifeq -> 89
/*      */     //   59: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData
/*      */     //   62: dup
/*      */     //   63: aload_3
/*      */     //   64: checkcast com/intellij/ml/llm/matterhorn/ej/core/ActionApprovalRequest
/*      */     //   67: aload #10
/*      */     //   69: aload_3
/*      */     //   70: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;)Lkotlin/jvm/functions/Function0;
/*      */     //   75: aload #10
/*      */     //   77: aload_3
/*      */     //   78: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;)Lkotlin/jvm/functions/Function0;
/*      */     //   83: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/ActionApprovalRequest;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
/*      */     //   86: goto -> 90
/*      */     //   89: aconst_null
/*      */     //   90: astore #24
/*      */     //   92: iload #21
/*      */     //   94: ifeq -> 177
/*      */     //   97: aload_3
/*      */     //   98: ifnull -> 177
/*      */     //   101: iload_1
/*      */     //   102: aload_2
/*      */     //   103: checkcast java/util/List
/*      */     //   106: invokestatic getLastIndex : (Ljava/util/List;)I
/*      */     //   109: if_icmpne -> 177
/*      */     //   112: aload_3
/*      */     //   113: instanceof com/intellij/ml/llm/matterhorn/ej/core/EditApprovalRequest
/*      */     //   116: ifeq -> 177
/*      */     //   119: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange
/*      */     //   122: dup
/*      */     //   123: aload_3
/*      */     //   124: checkcast com/intellij/ml/llm/matterhorn/ej/core/EditApprovalRequest
/*      */     //   127: invokevirtual getPath : ()Ljava/nio/file/Path;
/*      */     //   130: aload_3
/*      */     //   131: checkcast com/intellij/ml/llm/matterhorn/ej/core/EditApprovalRequest
/*      */     //   134: invokevirtual getBefore : ()Ljava/lang/String;
/*      */     //   137: aload_3
/*      */     //   138: checkcast com/intellij/ml/llm/matterhorn/ej/core/EditApprovalRequest
/*      */     //   141: invokevirtual getAfter : ()Ljava/lang/String;
/*      */     //   144: invokespecial <init> : (Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;)V
/*      */     //   147: astore #26
/*      */     //   149: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/EditApprovalRequestData
/*      */     //   152: dup
/*      */     //   153: aload #26
/*      */     //   155: aload #10
/*      */     //   157: aload_3
/*      */     //   158: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;)Lkotlin/jvm/functions/Function0;
/*      */     //   163: aload #10
/*      */     //   165: aload_3
/*      */     //   166: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;)Lkotlin/jvm/functions/Function0;
/*      */     //   171: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
/*      */     //   174: goto -> 178
/*      */     //   177: aconst_null
/*      */     //   178: astore #25
/*      */     //   180: iload #21
/*      */     //   182: ifeq -> 190
/*      */     //   185: aload #4
/*      */     //   187: goto -> 191
/*      */     //   190: aconst_null
/*      */     //   191: astore #26
/*      */     //   193: aload #20
/*      */     //   195: aload #5
/*      */     //   197: aload #22
/*      */     //   199: aload #6
/*      */     //   201: aload #7
/*      */     //   203: aload #8
/*      */     //   205: aload #9
/*      */     //   207: aload #10
/*      */     //   209: iload #23
/*      */     //   211: iload #11
/*      */     //   213: aload #24
/*      */     //   215: aload #25
/*      */     //   217: aload #26
/*      */     //   219: aload #12
/*      */     //   221: aload #13
/*      */     //   223: aload #14
/*      */     //   225: aload #15
/*      */     //   227: aload #16
/*      */     //   229: aload #17
/*      */     //   231: aload #18
/*      */     //   233: aload #19
/*      */     //   235: invokestatic convertStepToVm : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;ZZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/EditApprovalRequestData;Lkotlin/jvm/functions/Function0;Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;
/*      */     //   238: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #482	-> 8
/*      */     //   #489	-> 14
/*      */     //   #492	-> 32
/*      */     //   #493	-> 32
/*      */     //   #494	-> 41
/*      */     //   #496	-> 59
/*      */     //   #492	-> 67
/*      */     //   #496	-> 83
/*      */     //   #505	-> 89
/*      */     //   #492	-> 90
/*      */     //   #506	-> 92
/*      */     //   #507	-> 92
/*      */     //   #508	-> 101
/*      */     //   #510	-> 119
/*      */     //   #511	-> 149
/*      */     //   #522	-> 153
/*      */     //   #506	-> 155
/*      */     //   #511	-> 171
/*      */     //   #524	-> 177
/*      */     //   #506	-> 178
/*      */     //   #525	-> 180
/*      */     //   #480	-> 193
/*      */     //   #481	-> 195
/*      */     //   #482	-> 197
/*      */     //   #483	-> 199
/*      */     //   #484	-> 201
/*      */     //   #485	-> 203
/*      */     //   #486	-> 205
/*      */     //   #487	-> 207
/*      */     //   #489	-> 209
/*      */     //   #490	-> 211
/*      */     //   #492	-> 213
/*      */     //   #506	-> 215
/*      */     //   #525	-> 217
/*      */     //   #488	-> 219
/*      */     //   #526	-> 221
/*      */     //   #527	-> 223
/*      */     //   #528	-> 225
/*      */     //   #529	-> 227
/*      */     //   #530	-> 229
/*      */     //   #531	-> 231
/*      */     //   #532	-> 233
/*      */     //   #479	-> 235
/*      */     //   #533	-> 238
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   149	25	26	fileChange	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;
/*      */     //   0	239	0	$chain	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*      */     //   0	239	1	$taskIndex	I
/*      */     //   0	239	2	$liveTasks	Lkotlinx/collections/immutable/PersistentList;
/*      */     //   0	239	3	$humanInLoopRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;
/*      */     //   0	239	4	$stopTerminalCommandAction	Lkotlin/jvm/functions/Function0;
/*      */     //   0	239	5	$task	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*      */     //   0	239	6	$project	Lcom/intellij/openapi/project/Project;
/*      */     //   0	239	7	$llmProxy	Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*      */     //   0	239	8	$doneAction	Lkotlin/jvm/functions/Function0;
/*      */     //   0	239	9	$declineAction	Lkotlin/jvm/functions/Function1;
/*      */     //   0	239	10	$scope	Lkotlinx/coroutines/CoroutineScope;
/*      */     //   0	239	11	$hasChanges	Z
/*      */     //   0	239	12	$onShowDiff	Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff;
/*      */     //   0	239	13	$onDelete	Lkotlin/jvm/functions/Function2;
/*      */     //   0	239	14	$onLocate	Lkotlin/jvm/functions/Function2;
/*      */     //   0	239	15	$onRollback	Lkotlin/jvm/functions/Function2;
/*      */     //   0	239	16	$onSetVCS	Lkotlin/jvm/functions/Function2;
/*      */     //   0	239	17	$onVCS	Lkotlin/jvm/functions/Function2;
/*      */     //   0	239	18	$openTerminal	Lkotlin/jvm/functions/Function0;
/*      */     //   0	239	19	$openMarkdownInEditor	Lkotlin/jvm/functions/Function2;
/*      */     //   0	239	20	step	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;
/*      */     //   0	239	21	isLast	Z
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {498}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$1$1")
/*      */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*      */   static final class TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$1$1
/*      */     extends SuspendLambda
/*      */     implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*      */   {
/*      */     int label;
/*      */     
/*      */     TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$1$1(HumanInLoopRequest $humanInLoopRequest, Continuation $completion) {
/*      */       super(2, $completion);
/*      */     }
/*      */     
/*      */     public final Object invokeSuspend(Object $result) {
/*      */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */       switch (this.label) {
/*      */         case 0:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           this.label = 1;
/*      */           if (((ActionApprovalRequest)this.$humanInLoopRequest).getReaction().invoke(HumanInLoopResponse.Agree.INSTANCE, this) == object)
/*      */             return object; 
/*      */           ((ActionApprovalRequest)this.$humanInLoopRequest).getReaction().invoke(HumanInLoopResponse.Agree.INSTANCE, this);
/*      */           return Unit.INSTANCE;
/*      */         case 1:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           return Unit.INSTANCE;
/*      */       } 
/*      */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */     }
/*      */     
/*      */     public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$1$1> $completion) {
/*      */       return (Continuation<Unit>)new TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$1$1(this.$humanInLoopRequest, $completion);
/*      */     }
/*      */     
/*      */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*      */       return ((TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */   }
/*      */   
/*      */   private static final Unit produceStepVMs$lambda$7$lambda$5$lambda$1(CoroutineScope $scope, HumanInLoopRequest $humanInLoopRequest) {
/*  497 */     BuildersKt.launch$default($scope, null, null, new TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$1$1($humanInLoopRequest, null), 3, null);
/*      */ 
/*      */     
/*  500 */     return Unit.INSTANCE; } private static final Unit produceStepVMs$lambda$7$lambda$5$lambda$2(CoroutineScope $scope, HumanInLoopRequest $humanInLoopRequest) {
/*  501 */     BuildersKt.launch$default($scope, null, null, new TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$2$1($humanInLoopRequest, null), 3, null);
/*      */ 
/*      */     
/*  504 */     return Unit.INSTANCE;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final Unit produceStepVMs$lambda$7$lambda$5$lambda$3(CoroutineScope $scope, HumanInLoopRequest $humanInLoopRequest) {
/*  513 */     BuildersKt.launch$default($scope, null, null, new TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$3$1($humanInLoopRequest, null), 3, null);
/*      */ 
/*      */     
/*  516 */     return Unit.INSTANCE;
/*      */   } @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {502}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$2$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*  518 */     int label; TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$2$1(HumanInLoopRequest $humanInLoopRequest, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (((ActionApprovalRequest)this.$humanInLoopRequest).getReaction().invoke(HumanInLoopResponse.Disagree.INSTANCE, this) == object) return object;  ((ActionApprovalRequest)this.$humanInLoopRequest).getReaction().invoke(HumanInLoopResponse.Disagree.INSTANCE, this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$2$1> $completion) { return (Continuation<Unit>)new TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$2$1(this.$humanInLoopRequest, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final Unit produceStepVMs$lambda$7$lambda$5$lambda$4(CoroutineScope $scope, HumanInLoopRequest $humanInLoopRequest) { BuildersKt.launch$default($scope, null, null, new TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$4$1($humanInLoopRequest, null), 3, null);
/*      */ 
/*      */     
/*  521 */     return Unit.INSTANCE; }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {514}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$3$1")
/*      */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*      */   static final class TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$3$1
/*      */     extends SuspendLambda
/*      */     implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*      */   {
/*      */     int label;
/*      */ 
/*      */ 
/*      */     
/*      */     TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$3$1(HumanInLoopRequest $humanInLoopRequest, Continuation $completion) {
/*      */       super(2, $completion);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public final Object invokeSuspend(Object $result) {
/*      */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */       switch (this.label) {
/*      */         case 0:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           this.label = 1;
/*      */           if (((EditApprovalRequest)this.$humanInLoopRequest).getReaction().invoke(HumanInLoopResponse.Agree.INSTANCE, this) == object) {
/*      */             return object;
/*      */           }
/*      */           ((EditApprovalRequest)this.$humanInLoopRequest).getReaction().invoke(HumanInLoopResponse.Agree.INSTANCE, this);
/*      */           return Unit.INSTANCE;
/*      */         case 1:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           return Unit.INSTANCE;
/*      */       } 
/*      */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */     }
/*      */ 
/*      */     
/*      */     public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$3$1> $completion) {
/*      */       return (Continuation<Unit>)new TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$3$1(this.$humanInLoopRequest, $completion);
/*      */     }
/*      */ 
/*      */     
/*      */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*      */       return ((TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {519}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$4$1")
/*      */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*      */   static final class TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$4$1
/*      */     extends SuspendLambda
/*      */     implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*      */   {
/*      */     int label;
/*      */ 
/*      */     
/*      */     TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$4$1(HumanInLoopRequest $humanInLoopRequest, Continuation $completion) {
/*      */       super(2, $completion);
/*      */     }
/*      */ 
/*      */     
/*      */     public final Object invokeSuspend(Object $result) {
/*      */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */       switch (this.label) {
/*      */         case 0:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           this.label = 1;
/*      */           if (((EditApprovalRequest)this.$humanInLoopRequest).getReaction().invoke(HumanInLoopResponse.Disagree.INSTANCE, this) == object) {
/*      */             return object;
/*      */           }
/*      */           ((EditApprovalRequest)this.$humanInLoopRequest).getReaction().invoke(HumanInLoopResponse.Disagree.INSTANCE, this);
/*      */           return Unit.INSTANCE;
/*      */         case 1:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           return Unit.INSTANCE;
/*      */       } 
/*      */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */     }
/*      */ 
/*      */     
/*      */     public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$4$1> $completion) {
/*      */       return (Continuation<Unit>)new TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$4$1(this.$humanInLoopRequest, $completion);
/*      */     }
/*      */ 
/*      */     
/*      */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*      */       return ((TaskChainDetailsViewModelKt$produceStepVMs$steps$1$convert$1$4$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public static final TaskStep convertStepToVm(@NotNull StepEntity stepEntity, @NotNull LiveTaskSnapshot task, @NotNull TaskChainState state, @NotNull Project project, @NotNull LLMProxy llmProxy, @Nullable Function0 doneAction, @Nullable Function1 declineAction, @NotNull CoroutineScope scope, boolean taskIsLastInChain, boolean hasChanges, @Nullable ActionApprovalRequestData actionApprovalRequestData, @Nullable EditApprovalRequestData editApprovalRequestData, @Nullable Function0 stopTerminalCommandAction, @NotNull OnShowDiff onShowDiff, @NotNull Function2 onDelete, @NotNull Function2 onLocate, @NotNull Function2 onRollback, @NotNull Function2 onSetVCS, @NotNull Function2 onVCS, @Nullable Function0 onOpenTerminal, @NotNull Function2 openMarkdownInEditor) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc_w 'stepEntity'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload_1
/*      */     //   8: ldc_w 'task'
/*      */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   14: aload_2
/*      */     //   15: ldc_w 'state'
/*      */     //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   21: aload_3
/*      */     //   22: ldc 'project'
/*      */     //   24: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   27: aload #4
/*      */     //   29: ldc 'llmProxy'
/*      */     //   31: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   34: aload #7
/*      */     //   36: ldc 'scope'
/*      */     //   38: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   41: aload #13
/*      */     //   43: ldc 'onShowDiff'
/*      */     //   45: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   48: aload #14
/*      */     //   50: ldc 'onDelete'
/*      */     //   52: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   55: aload #15
/*      */     //   57: ldc 'onLocate'
/*      */     //   59: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   62: aload #16
/*      */     //   64: ldc 'onRollback'
/*      */     //   66: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   69: aload #17
/*      */     //   71: ldc 'onSetVCS'
/*      */     //   73: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   76: aload #18
/*      */     //   78: ldc 'onVCS'
/*      */     //   80: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   83: aload #20
/*      */     //   85: ldc 'openMarkdownInEditor'
/*      */     //   87: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   90: aload_0
/*      */     //   91: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*      */     //   94: pop
/*      */     //   95: aload_0
/*      */     //   96: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*      */     //   99: dup
/*      */     //   100: ifnonnull -> 107
/*      */     //   103: pop
/*      */     //   104: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Info : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*      */     //   107: invokestatic getStepTypeText : (Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;)Ljava/lang/String;
/*      */     //   110: astore #21
/*      */     //   112: aload_0
/*      */     //   113: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*      */     //   116: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Prompt : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*      */     //   119: if_acmpne -> 169
/*      */     //   122: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel
/*      */     //   125: dup
/*      */     //   126: aload_3
/*      */     //   127: aload #7
/*      */     //   129: aload_3
/*      */     //   130: invokeinterface getBasePath : ()Ljava/lang/String;
/*      */     //   135: dup
/*      */     //   136: ifnonnull -> 142
/*      */     //   139: pop
/*      */     //   140: ldc ''
/*      */     //   142: aload_1
/*      */     //   143: invokevirtual getTask : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*      */     //   146: invokevirtual getExplicitlySelectedContextFiles : ()Ljava/util/List;
/*      */     //   149: checkcast java/lang/Iterable
/*      */     //   152: invokestatic toPersistentList : (Ljava/lang/Iterable;)Lkotlinx/collections/immutable/PersistentList;
/*      */     //   155: aload #4
/*      */     //   157: invokeinterface getImagesSupported : ()Z
/*      */     //   162: iconst_0
/*      */     //   163: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Lkotlinx/collections/immutable/PersistentList;ZZ)V
/*      */     //   166: goto -> 170
/*      */     //   169: aconst_null
/*      */     //   170: astore #22
/*      */     //   172: aload_0
/*      */     //   173: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*      */     //   176: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Report : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*      */     //   179: if_acmpne -> 212
/*      */     //   182: aload_2
/*      */     //   183: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Finished : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*      */     //   186: if_acmpeq -> 203
/*      */     //   189: aload_2
/*      */     //   190: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Stopped : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*      */     //   193: if_acmpeq -> 203
/*      */     //   196: aload_2
/*      */     //   197: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Failed : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*      */     //   200: if_acmpne -> 212
/*      */     //   203: iload #8
/*      */     //   205: ifeq -> 212
/*      */     //   208: iconst_1
/*      */     //   209: goto -> 213
/*      */     //   212: iconst_0
/*      */     //   213: istore #23
/*      */     //   215: iload #23
/*      */     //   217: ifeq -> 245
/*      */     //   220: aload #5
/*      */     //   222: ifnull -> 245
/*      */     //   225: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*      */     //   228: dup
/*      */     //   229: ldc 'Start new task'
/*      */     //   231: aload #5
/*      */     //   233: aload_1
/*      */     //   234: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;)Lkotlin/jvm/functions/Function0;
/*      */     //   239: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*      */     //   242: goto -> 246
/*      */     //   245: aconst_null
/*      */     //   246: astore #24
/*      */     //   248: iload #23
/*      */     //   250: ifeq -> 294
/*      */     //   253: aload #6
/*      */     //   255: ifnull -> 294
/*      */     //   258: iload #9
/*      */     //   260: ifeq -> 269
/*      */     //   263: ldc_w 'Rollback'
/*      */     //   266: goto -> 272
/*      */     //   269: ldc_w 'Not okay'
/*      */     //   272: astore #26
/*      */     //   274: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*      */     //   277: dup
/*      */     //   278: aload #26
/*      */     //   280: aload #6
/*      */     //   282: aload_1
/*      */     //   283: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;)Lkotlin/jvm/functions/Function0;
/*      */     //   288: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*      */     //   291: goto -> 295
/*      */     //   294: aconst_null
/*      */     //   295: astore #25
/*      */     //   297: aload_0
/*      */     //   298: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*      */     //   301: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Edit : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*      */     //   304: if_acmpne -> 379
/*      */     //   307: aload_0
/*      */     //   308: invokevirtual getChanges : ()Ljava/util/List;
/*      */     //   311: invokeinterface size : ()I
/*      */     //   316: iconst_1
/*      */     //   317: if_icmpne -> 379
/*      */     //   320: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView
/*      */     //   323: dup
/*      */     //   324: aload_0
/*      */     //   325: invokevirtual getChanges : ()Ljava/util/List;
/*      */     //   328: iconst_0
/*      */     //   329: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   334: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange
/*      */     //   337: aload #13
/*      */     //   339: aload_0
/*      */     //   340: invokevirtual getChanges : ()Ljava/util/List;
/*      */     //   343: iconst_0
/*      */     //   344: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   349: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange
/*      */     //   352: astore #27
/*      */     //   354: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions
/*      */     //   357: dup
/*      */     //   358: aload #27
/*      */     //   360: aload #14
/*      */     //   362: aload #15
/*      */     //   364: aload #16
/*      */     //   366: aload #17
/*      */     //   368: aload #18
/*      */     //   370: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V
/*      */     //   373: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;)V
/*      */     //   376: goto -> 380
/*      */     //   379: aconst_null
/*      */     //   380: astore #26
/*      */     //   382: aload_0
/*      */     //   383: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*      */     //   386: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Report : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*      */     //   389: if_acmpne -> 406
/*      */     //   392: aload_1
/*      */     //   393: invokevirtual getSteps : ()Lkotlinx/collections/immutable/PersistentList;
/*      */     //   396: invokestatic collectFileChanges : (Lkotlinx/collections/immutable/PersistentList;)Ljava/util/List;
/*      */     //   399: astore #28
/*      */     //   401: aload #28
/*      */     //   403: goto -> 410
/*      */     //   406: aload_0
/*      */     //   407: invokevirtual getChanges : ()Ljava/util/List;
/*      */     //   410: checkcast java/lang/Iterable
/*      */     //   413: astore #28
/*      */     //   415: nop
/*      */     //   416: iconst_0
/*      */     //   417: istore #29
/*      */     //   419: aload #28
/*      */     //   421: astore #30
/*      */     //   423: new java/util/ArrayList
/*      */     //   426: dup
/*      */     //   427: aload #28
/*      */     //   429: bipush #10
/*      */     //   431: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*      */     //   434: invokespecial <init> : (I)V
/*      */     //   437: checkcast java/util/Collection
/*      */     //   440: astore #31
/*      */     //   442: iconst_0
/*      */     //   443: istore #32
/*      */     //   445: aload #30
/*      */     //   447: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */     //   452: astore #33
/*      */     //   454: aload #33
/*      */     //   456: invokeinterface hasNext : ()Z
/*      */     //   461: ifeq -> 530
/*      */     //   464: aload #33
/*      */     //   466: invokeinterface next : ()Ljava/lang/Object;
/*      */     //   471: astore #34
/*      */     //   473: aload #31
/*      */     //   475: aload #34
/*      */     //   477: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange
/*      */     //   480: astore #35
/*      */     //   482: astore #44
/*      */     //   484: iconst_0
/*      */     //   485: istore #36
/*      */     //   487: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView
/*      */     //   490: dup
/*      */     //   491: aload #35
/*      */     //   493: aload #13
/*      */     //   495: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions
/*      */     //   498: dup
/*      */     //   499: aload #35
/*      */     //   501: aload #14
/*      */     //   503: aload #15
/*      */     //   505: aload #16
/*      */     //   507: aload #17
/*      */     //   509: aload #18
/*      */     //   511: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V
/*      */     //   514: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;)V
/*      */     //   517: nop
/*      */     //   518: aload #44
/*      */     //   520: swap
/*      */     //   521: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   526: pop
/*      */     //   527: goto -> 454
/*      */     //   530: aload #31
/*      */     //   532: checkcast java/util/List
/*      */     //   535: nop
/*      */     //   536: astore #27
/*      */     //   538: aload_0
/*      */     //   539: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*      */     //   542: dup
/*      */     //   543: ifnonnull -> 550
/*      */     //   546: pop
/*      */     //   547: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Progress : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*      */     //   550: astore #28
/*      */     //   552: aload #12
/*      */     //   554: ifnull -> 572
/*      */     //   557: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*      */     //   560: dup
/*      */     //   561: ldc_w 'Cancel Step'
/*      */     //   564: aload #12
/*      */     //   566: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*      */     //   569: goto -> 573
/*      */     //   572: aconst_null
/*      */     //   573: astore #29
/*      */     //   575: aload #19
/*      */     //   577: dup
/*      */     //   578: ifnull -> 601
/*      */     //   581: astore #32
/*      */     //   583: iconst_0
/*      */     //   584: istore #33
/*      */     //   586: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*      */     //   589: dup
/*      */     //   590: ldc_w 'Open'
/*      */     //   593: aload #32
/*      */     //   595: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*      */     //   598: goto -> 603
/*      */     //   601: pop
/*      */     //   602: aconst_null
/*      */     //   603: astore #30
/*      */     //   605: aload #28
/*      */     //   607: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModelKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*      */     //   610: swap
/*      */     //   611: invokevirtual ordinal : ()I
/*      */     //   614: iaload
/*      */     //   615: tableswitch default -> 1595, 1 -> 664, 2 -> 718, 3 -> 860, 4 -> 1013, 5 -> 1158, 6 -> 1274, 7 -> 1313, 8 -> 1423, 9 -> 1517
/*      */     //   664: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Prompt
/*      */     //   667: dup
/*      */     //   668: aload #21
/*      */     //   670: dup
/*      */     //   671: ifnonnull -> 677
/*      */     //   674: pop
/*      */     //   675: ldc ''
/*      */     //   677: aload_0
/*      */     //   678: invokevirtual getDescription : ()Ljava/lang/String;
/*      */     //   681: dup
/*      */     //   682: ifnonnull -> 688
/*      */     //   685: pop
/*      */     //   686: ldc ''
/*      */     //   688: aload #22
/*      */     //   690: dup
/*      */     //   691: ifnonnull -> 709
/*      */     //   694: pop
/*      */     //   695: new java/lang/IllegalStateException
/*      */     //   698: dup
/*      */     //   699: ldc_w 'AttachedFilesVm must not be null for Prompt step'
/*      */     //   702: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   705: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   708: athrow
/*      */     //   709: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;)V
/*      */     //   712: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep
/*      */     //   715: goto -> 1603
/*      */     //   718: aload #11
/*      */     //   720: ifnull -> 744
/*      */     //   723: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView
/*      */     //   726: dup
/*      */     //   727: aload #11
/*      */     //   729: invokevirtual getChange : ()Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;
/*      */     //   732: aload #13
/*      */     //   734: aconst_null
/*      */     //   735: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;)V
/*      */     //   738: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*      */     //   741: goto -> 746
/*      */     //   744: aload #27
/*      */     //   746: astore #33
/*      */     //   748: aload #11
/*      */     //   750: ifnull -> 759
/*      */     //   753: ldc_w 'Attempting to change a potentially sensitive file or a file outside of the current project. Please, review the changes and approve or decline the request.'
/*      */     //   756: goto -> 770
/*      */     //   759: aload_0
/*      */     //   760: invokevirtual getDescription : ()Ljava/lang/String;
/*      */     //   763: dup
/*      */     //   764: ifnonnull -> 770
/*      */     //   767: pop
/*      */     //   768: ldc ''
/*      */     //   770: astore #34
/*      */     //   772: aload #21
/*      */     //   774: dup
/*      */     //   775: ifnonnull -> 781
/*      */     //   778: pop
/*      */     //   779: ldc ''
/*      */     //   781: aload #34
/*      */     //   783: aload #33
/*      */     //   785: aload #26
/*      */     //   787: dup
/*      */     //   788: ifnull -> 823
/*      */     //   791: astore #36
/*      */     //   793: astore #47
/*      */     //   795: astore #46
/*      */     //   797: astore #45
/*      */     //   799: iconst_0
/*      */     //   800: istore #37
/*      */     //   802: aload #13
/*      */     //   804: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff;)Lkotlin/jvm/functions/Function1;
/*      */     //   809: nop
/*      */     //   810: astore #48
/*      */     //   812: aload #45
/*      */     //   814: aload #46
/*      */     //   816: aload #47
/*      */     //   818: aload #48
/*      */     //   820: goto -> 825
/*      */     //   823: pop
/*      */     //   824: aconst_null
/*      */     //   825: aload #11
/*      */     //   827: astore #49
/*      */     //   829: astore #50
/*      */     //   831: astore #51
/*      */     //   833: astore #52
/*      */     //   835: astore #53
/*      */     //   837: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Edit
/*      */     //   840: dup
/*      */     //   841: aload #53
/*      */     //   843: aload #52
/*      */     //   845: aload #51
/*      */     //   847: aload #50
/*      */     //   849: aload #49
/*      */     //   851: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/EditApprovalRequestData;)V
/*      */     //   854: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep
/*      */     //   857: goto -> 1603
/*      */     //   860: aload_0
/*      */     //   861: invokevirtual getCommand : ()Ljava/lang/String;
/*      */     //   864: astore #33
/*      */     //   866: aload #33
/*      */     //   868: dup
/*      */     //   869: ifnull -> 884
/*      */     //   872: aload_3
/*      */     //   873: swap
/*      */     //   874: aload #10
/*      */     //   876: <illegal opcode> invoke : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;)Lkotlin/jvm/functions/Function0;
/*      */     //   881: goto -> 890
/*      */     //   884: pop
/*      */     //   885: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*      */     //   890: astore #34
/*      */     //   892: aload #21
/*      */     //   894: dup
/*      */     //   895: ifnonnull -> 901
/*      */     //   898: pop
/*      */     //   899: ldc ''
/*      */     //   901: astore #35
/*      */     //   903: aload_0
/*      */     //   904: invokevirtual getDescription : ()Ljava/lang/String;
/*      */     //   907: dup
/*      */     //   908: ifnonnull -> 914
/*      */     //   911: pop
/*      */     //   912: ldc ''
/*      */     //   914: astore #36
/*      */     //   916: aload_0
/*      */     //   917: invokevirtual getTestRuns : ()Ljava/util/List;
/*      */     //   920: astore #37
/*      */     //   922: aload_0
/*      */     //   923: invokevirtual getMsDuration : ()Ljava/lang/Long;
/*      */     //   926: dup
/*      */     //   927: ifnull -> 969
/*      */     //   930: astore #40
/*      */     //   932: aload #40
/*      */     //   934: checkcast java/lang/Number
/*      */     //   937: invokevirtual longValue : ()J
/*      */     //   940: lstore #41
/*      */     //   942: iconst_0
/*      */     //   943: istore #43
/*      */     //   945: lload #41
/*      */     //   947: lconst_0
/*      */     //   948: lcmp
/*      */     //   949: ifle -> 956
/*      */     //   952: iconst_1
/*      */     //   953: goto -> 957
/*      */     //   956: iconst_0
/*      */     //   957: ifeq -> 965
/*      */     //   960: aload #40
/*      */     //   962: goto -> 971
/*      */     //   965: aconst_null
/*      */     //   966: goto -> 971
/*      */     //   969: pop
/*      */     //   970: aconst_null
/*      */     //   971: astore #38
/*      */     //   973: aload_0
/*      */     //   974: invokevirtual getCommand : ()Ljava/lang/String;
/*      */     //   977: dup
/*      */     //   978: ifnonnull -> 984
/*      */     //   981: pop
/*      */     //   982: ldc ''
/*      */     //   984: astore #39
/*      */     //   986: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Test
/*      */     //   989: dup
/*      */     //   990: aload #35
/*      */     //   992: aload #36
/*      */     //   994: aload #39
/*      */     //   996: aload #37
/*      */     //   998: aload #38
/*      */     //   1000: aload #34
/*      */     //   1002: aload #10
/*      */     //   1004: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;)V
/*      */     //   1007: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep
/*      */     //   1010: goto -> 1603
/*      */     //   1013: aload_0
/*      */     //   1014: invokevirtual getCommand : ()Ljava/lang/String;
/*      */     //   1017: astore #33
/*      */     //   1019: aload #33
/*      */     //   1021: dup
/*      */     //   1022: ifnull -> 1037
/*      */     //   1025: aload_3
/*      */     //   1026: swap
/*      */     //   1027: aload #10
/*      */     //   1029: <illegal opcode> invoke : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;)Lkotlin/jvm/functions/Function0;
/*      */     //   1034: goto -> 1043
/*      */     //   1037: pop
/*      */     //   1038: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*      */     //   1043: astore #34
/*      */     //   1045: aload #21
/*      */     //   1047: dup
/*      */     //   1048: ifnonnull -> 1054
/*      */     //   1051: pop
/*      */     //   1052: ldc ''
/*      */     //   1054: astore #35
/*      */     //   1056: aload_0
/*      */     //   1057: invokevirtual getDescription : ()Ljava/lang/String;
/*      */     //   1060: dup
/*      */     //   1061: ifnonnull -> 1067
/*      */     //   1064: pop
/*      */     //   1065: ldc ''
/*      */     //   1067: astore #36
/*      */     //   1069: aload_0
/*      */     //   1070: invokevirtual getMsDuration : ()Ljava/lang/Long;
/*      */     //   1073: dup
/*      */     //   1074: ifnull -> 1116
/*      */     //   1077: astore #39
/*      */     //   1079: aload #39
/*      */     //   1081: checkcast java/lang/Number
/*      */     //   1084: invokevirtual longValue : ()J
/*      */     //   1087: lstore #40
/*      */     //   1089: iconst_0
/*      */     //   1090: istore #42
/*      */     //   1092: lload #40
/*      */     //   1094: lconst_0
/*      */     //   1095: lcmp
/*      */     //   1096: ifle -> 1103
/*      */     //   1099: iconst_1
/*      */     //   1100: goto -> 1104
/*      */     //   1103: iconst_0
/*      */     //   1104: ifeq -> 1112
/*      */     //   1107: aload #39
/*      */     //   1109: goto -> 1118
/*      */     //   1112: aconst_null
/*      */     //   1113: goto -> 1118
/*      */     //   1116: pop
/*      */     //   1117: aconst_null
/*      */     //   1118: astore #37
/*      */     //   1120: aload_0
/*      */     //   1121: invokevirtual getCommand : ()Ljava/lang/String;
/*      */     //   1124: dup
/*      */     //   1125: ifnonnull -> 1131
/*      */     //   1128: pop
/*      */     //   1129: ldc ''
/*      */     //   1131: astore #38
/*      */     //   1133: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Build
/*      */     //   1136: dup
/*      */     //   1137: aload #35
/*      */     //   1139: aload #36
/*      */     //   1141: aload #38
/*      */     //   1143: aload #37
/*      */     //   1145: aload #10
/*      */     //   1147: aload #34
/*      */     //   1149: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;Lkotlin/jvm/functions/Function0;)V
/*      */     //   1152: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep
/*      */     //   1155: goto -> 1603
/*      */     //   1158: aload_0
/*      */     //   1159: invokevirtual getCommand : ()Ljava/lang/String;
/*      */     //   1162: dup
/*      */     //   1163: ifnull -> 1187
/*      */     //   1166: astore #37
/*      */     //   1168: iconst_0
/*      */     //   1169: istore #38
/*      */     //   1171: aload_3
/*      */     //   1172: aload #37
/*      */     //   1174: aload #10
/*      */     //   1176: <illegal opcode> invoke : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;)Lkotlin/jvm/functions/Function0;
/*      */     //   1181: nop
/*      */     //   1182: nop
/*      */     //   1183: dup
/*      */     //   1184: ifnonnull -> 1193
/*      */     //   1187: pop
/*      */     //   1188: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*      */     //   1193: astore #33
/*      */     //   1195: aload #21
/*      */     //   1197: dup
/*      */     //   1198: ifnonnull -> 1204
/*      */     //   1201: pop
/*      */     //   1202: ldc ''
/*      */     //   1204: astore #34
/*      */     //   1206: aload_0
/*      */     //   1207: invokevirtual getDescription : ()Ljava/lang/String;
/*      */     //   1210: dup
/*      */     //   1211: ifnonnull -> 1217
/*      */     //   1214: pop
/*      */     //   1215: ldc ''
/*      */     //   1217: astore #35
/*      */     //   1219: aload_0
/*      */     //   1220: invokevirtual getCommand : ()Ljava/lang/String;
/*      */     //   1223: dup
/*      */     //   1224: ifnonnull -> 1230
/*      */     //   1227: pop
/*      */     //   1228: ldc ''
/*      */     //   1230: astore #36
/*      */     //   1232: invokestatic emptyFlow : ()Lkotlinx/coroutines/flow/Flow;
/*      */     //   1235: astore #37
/*      */     //   1237: aload_0
/*      */     //   1238: invokevirtual getMsDuration : ()Ljava/lang/Long;
/*      */     //   1241: astore #38
/*      */     //   1243: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Terminal
/*      */     //   1246: dup
/*      */     //   1247: aload #34
/*      */     //   1249: aload #35
/*      */     //   1251: aload #36
/*      */     //   1253: aload #37
/*      */     //   1255: aload #29
/*      */     //   1257: aload #30
/*      */     //   1259: aload #38
/*      */     //   1261: aload #10
/*      */     //   1263: aload #33
/*      */     //   1265: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/coroutines/flow/Flow;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Ljava/lang/Long;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;Lkotlin/jvm/functions/Function0;)V
/*      */     //   1268: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep
/*      */     //   1271: goto -> 1603
/*      */     //   1274: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report
/*      */     //   1277: dup
/*      */     //   1278: aload #21
/*      */     //   1280: dup
/*      */     //   1281: ifnonnull -> 1287
/*      */     //   1284: pop
/*      */     //   1285: ldc ''
/*      */     //   1287: aload_0
/*      */     //   1288: invokevirtual getDescription : ()Ljava/lang/String;
/*      */     //   1291: dup
/*      */     //   1292: ifnonnull -> 1298
/*      */     //   1295: pop
/*      */     //   1296: ldc ''
/*      */     //   1298: aload #27
/*      */     //   1300: aload #24
/*      */     //   1302: aload #25
/*      */     //   1304: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;)V
/*      */     //   1307: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep
/*      */     //   1310: goto -> 1603
/*      */     //   1313: aload_0
/*      */     //   1314: invokevirtual getDescription : ()Ljava/lang/String;
/*      */     //   1317: astore #33
/*      */     //   1319: aload #10
/*      */     //   1321: ifnull -> 1372
/*      */     //   1324: aload #10
/*      */     //   1326: invokevirtual getAction : ()Lcom/intellij/ml/llm/matterhorn/ej/core/ActionApprovalRequest;
/*      */     //   1329: invokevirtual getAction : ()Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;
/*      */     //   1332: instanceof com/intellij/ml/llm/matterhorn/HumanInLoopAction$ActionTouchingFile
/*      */     //   1335: ifeq -> 1372
/*      */     //   1338: aload #33
/*      */     //   1340: ifnonnull -> 1372
/*      */     //   1343: aload #10
/*      */     //   1345: invokevirtual getAction : ()Lcom/intellij/ml/llm/matterhorn/ej/core/ActionApprovalRequest;
/*      */     //   1348: invokevirtual getAction : ()Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;
/*      */     //   1351: dup
/*      */     //   1352: ldc_w 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.HumanInLoopAction.ActionTouchingFile'
/*      */     //   1355: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   1358: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopAction$ActionTouchingFile
/*      */     //   1361: invokevirtual getPath : ()Ljava/nio/file/Path;
/*      */     //   1364: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;)Ljava/lang/String;
/*      */     //   1369: goto -> 1381
/*      */     //   1372: aload #33
/*      */     //   1374: dup
/*      */     //   1375: ifnonnull -> 1381
/*      */     //   1378: pop
/*      */     //   1379: ldc ''
/*      */     //   1381: astore #34
/*      */     //   1383: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Info
/*      */     //   1386: dup
/*      */     //   1387: aload #21
/*      */     //   1389: dup
/*      */     //   1390: ifnonnull -> 1405
/*      */     //   1393: pop
/*      */     //   1394: aload_0
/*      */     //   1395: invokevirtual getCommand : ()Ljava/lang/String;
/*      */     //   1398: dup
/*      */     //   1399: ifnonnull -> 1405
/*      */     //   1402: pop
/*      */     //   1403: ldc ''
/*      */     //   1405: aload #34
/*      */     //   1407: aload #10
/*      */     //   1409: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*      */     //   1414: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;Lkotlin/jvm/functions/Function0;)V
/*      */     //   1417: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep
/*      */     //   1420: goto -> 1603
/*      */     //   1423: aload #21
/*      */     //   1425: dup
/*      */     //   1426: ifnonnull -> 1441
/*      */     //   1429: pop
/*      */     //   1430: aload_0
/*      */     //   1431: invokevirtual getCommand : ()Ljava/lang/String;
/*      */     //   1434: dup
/*      */     //   1435: ifnonnull -> 1441
/*      */     //   1438: pop
/*      */     //   1439: ldc ''
/*      */     //   1441: aload_0
/*      */     //   1442: invokevirtual getDescription : ()Ljava/lang/String;
/*      */     //   1445: dup
/*      */     //   1446: ifnonnull -> 1452
/*      */     //   1449: pop
/*      */     //   1450: ldc ''
/*      */     //   1452: aload #12
/*      */     //   1454: dup
/*      */     //   1455: ifnull -> 1490
/*      */     //   1458: astore #34
/*      */     //   1460: astore #46
/*      */     //   1462: astore #45
/*      */     //   1464: iconst_0
/*      */     //   1465: istore #35
/*      */     //   1467: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*      */     //   1470: dup
/*      */     //   1471: ldc_w 'Stop Step'
/*      */     //   1474: aload #12
/*      */     //   1476: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*      */     //   1479: astore #47
/*      */     //   1481: aload #45
/*      */     //   1483: aload #46
/*      */     //   1485: aload #47
/*      */     //   1487: goto -> 1492
/*      */     //   1490: pop
/*      */     //   1491: aconst_null
/*      */     //   1492: astore #54
/*      */     //   1494: astore #55
/*      */     //   1496: astore #56
/*      */     //   1498: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Progress
/*      */     //   1501: dup
/*      */     //   1502: aload #56
/*      */     //   1504: aload #55
/*      */     //   1506: aload #54
/*      */     //   1508: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;)V
/*      */     //   1511: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep
/*      */     //   1514: goto -> 1603
/*      */     //   1517: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$ChatResponse
/*      */     //   1520: dup
/*      */     //   1521: aload #21
/*      */     //   1523: dup
/*      */     //   1524: ifnonnull -> 1539
/*      */     //   1527: pop
/*      */     //   1528: aload_0
/*      */     //   1529: invokevirtual getCommand : ()Ljava/lang/String;
/*      */     //   1532: dup
/*      */     //   1533: ifnonnull -> 1539
/*      */     //   1536: pop
/*      */     //   1537: ldc ''
/*      */     //   1539: aload_0
/*      */     //   1540: invokevirtual getDescription : ()Ljava/lang/String;
/*      */     //   1543: dup
/*      */     //   1544: ifnonnull -> 1550
/*      */     //   1547: pop
/*      */     //   1548: ldc ''
/*      */     //   1550: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*      */     //   1553: dup
/*      */     //   1554: ldc 'Start new task'
/*      */     //   1556: aload #5
/*      */     //   1558: aload_1
/*      */     //   1559: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;)Lkotlin/jvm/functions/Function0;
/*      */     //   1564: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*      */     //   1567: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*      */     //   1570: dup
/*      */     //   1571: ldc_w 'View in editor tab'
/*      */     //   1574: aload #20
/*      */     //   1576: aload_1
/*      */     //   1577: aload_0
/*      */     //   1578: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;)Lkotlin/jvm/functions/Function0;
/*      */     //   1583: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*      */     //   1586: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;)V
/*      */     //   1589: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep
/*      */     //   1592: goto -> 1603
/*      */     //   1595: new kotlin/NoWhenBranchMatchedException
/*      */     //   1598: dup
/*      */     //   1599: invokespecial <init> : ()V
/*      */     //   1602: athrow
/*      */     //   1603: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #603	-> 90
/*      */     //   #606	-> 95
/*      */     //   #607	-> 112
/*      */     //   #608	-> 122
/*      */     //   #609	-> 126
/*      */     //   #610	-> 127
/*      */     //   #611	-> 129
/*      */     //   #612	-> 142
/*      */     //   #613	-> 155
/*      */     //   #614	-> 162
/*      */     //   #608	-> 163
/*      */     //   #616	-> 169
/*      */     //   #607	-> 170
/*      */     //   #618	-> 172
/*      */     //   #619	-> 182
/*      */     //   #620	-> 203
/*      */     //   #618	-> 213
/*      */     //   #621	-> 215
/*      */     //   #622	-> 225
/*      */     //   #621	-> 231
/*      */     //   #622	-> 239
/*      */     //   #626	-> 245
/*      */     //   #621	-> 246
/*      */     //   #627	-> 248
/*      */     //   #628	-> 258
/*      */     //   #629	-> 274
/*      */     //   #627	-> 280
/*      */     //   #629	-> 288
/*      */     //   #633	-> 294
/*      */     //   #627	-> 295
/*      */     //   #636	-> 297
/*      */     //   #637	-> 320
/*      */     //   #638	-> 324
/*      */     //   #639	-> 337
/*      */     //   #646	-> 339
/*      */     //   #640	-> 354
/*      */     //   #646	-> 358
/*      */     //   #641	-> 360
/*      */     //   #642	-> 362
/*      */     //   #643	-> 364
/*      */     //   #644	-> 366
/*      */     //   #645	-> 368
/*      */     //   #640	-> 370
/*      */     //   #637	-> 373
/*      */     //   #650	-> 379
/*      */     //   #636	-> 380
/*      */     //   #635	-> 380
/*      */     //   #653	-> 382
/*      */     //   #654	-> 392
/*      */     //   #655	-> 401
/*      */     //   #657	-> 406
/*      */     //   #658	-> 415
/*      */     //   #1069	-> 419
/*      */     //   #1070	-> 445
/*      */     //   #1071	-> 473
/*      */     //   #659	-> 487
/*      */     //   #660	-> 491
/*      */     //   #661	-> 493
/*      */     //   #662	-> 495
/*      */     //   #668	-> 499
/*      */     //   #663	-> 501
/*      */     //   #664	-> 503
/*      */     //   #665	-> 505
/*      */     //   #666	-> 507
/*      */     //   #667	-> 509
/*      */     //   #662	-> 511
/*      */     //   #659	-> 514
/*      */     //   #670	-> 517
/*      */     //   #1071	-> 521
/*      */     //   #1072	-> 530
/*      */     //   #1069	-> 535
/*      */     //   #658	-> 536
/*      */     //   #653	-> 536
/*      */     //   #674	-> 538
/*      */     //   #676	-> 552
/*      */     //   #677	-> 557
/*      */     //   #679	-> 572
/*      */     //   #676	-> 573
/*      */     //   #682	-> 575
/*      */     //   #1068	-> 583
/*      */     //   #682	-> 586
/*      */     //   #682	-> 598
/*      */     //   #682	-> 601
/*      */     //   #684	-> 605
/*      */     //   #685	-> 664
/*      */     //   #686	-> 668
/*      */     //   #687	-> 677
/*      */     //   #688	-> 688
/*      */     //   #685	-> 709
/*      */     //   #692	-> 718
/*      */     //   #694	-> 723
/*      */     //   #695	-> 727
/*      */     //   #696	-> 732
/*      */     //   #697	-> 734
/*      */     //   #694	-> 735
/*      */     //   #693	-> 738
/*      */     //   #701	-> 744
/*      */     //   #692	-> 746
/*      */     //   #703	-> 748
/*      */     //   #704	-> 753
/*      */     //   #707	-> 759
/*      */     //   #703	-> 770
/*      */     //   #709	-> 772
/*      */     //   #710	-> 772
/*      */     //   #711	-> 781
/*      */     //   #712	-> 783
/*      */     //   #713	-> 785
/*      */     //   #714	-> 802
/*      */     //   #719	-> 809
/*      */     //   #713	-> 820
/*      */     //   #713	-> 823
/*      */     //   #721	-> 825
/*      */     //   #709	-> 827
/*      */     //   #727	-> 860
/*      */     //   #728	-> 866
/*      */     //   #741	-> 892
/*      */     //   #742	-> 903
/*      */     //   #743	-> 916
/*      */     //   #744	-> 922
/*      */     //   #1068	-> 942
/*      */     //   #744	-> 945
/*      */     //   #744	-> 957
/*      */     //   #744	-> 969
/*      */     //   #746	-> 973
/*      */     //   #740	-> 986
/*      */     //   #741	-> 990
/*      */     //   #742	-> 992
/*      */     //   #746	-> 994
/*      */     //   #743	-> 996
/*      */     //   #744	-> 998
/*      */     //   #747	-> 1000
/*      */     //   #745	-> 1002
/*      */     //   #740	-> 1004
/*      */     //   #752	-> 1013
/*      */     //   #753	-> 1019
/*      */     //   #766	-> 1045
/*      */     //   #767	-> 1056
/*      */     //   #768	-> 1069
/*      */     //   #1068	-> 1089
/*      */     //   #768	-> 1092
/*      */     //   #768	-> 1104
/*      */     //   #768	-> 1116
/*      */     //   #770	-> 1120
/*      */     //   #765	-> 1133
/*      */     //   #766	-> 1137
/*      */     //   #767	-> 1139
/*      */     //   #770	-> 1141
/*      */     //   #768	-> 1143
/*      */     //   #769	-> 1145
/*      */     //   #771	-> 1147
/*      */     //   #765	-> 1149
/*      */     //   #777	-> 1158
/*      */     //   #778	-> 1171
/*      */     //   #785	-> 1181
/*      */     //   #777	-> 1182
/*      */     //   #777	-> 1183
/*      */     //   #776	-> 1193
/*      */     //   #788	-> 1195
/*      */     //   #789	-> 1206
/*      */     //   #790	-> 1219
/*      */     //   #794	-> 1232
/*      */     //   #795	-> 1237
/*      */     //   #787	-> 1243
/*      */     //   #788	-> 1247
/*      */     //   #789	-> 1249
/*      */     //   #790	-> 1251
/*      */     //   #794	-> 1253
/*      */     //   #791	-> 1255
/*      */     //   #792	-> 1257
/*      */     //   #795	-> 1259
/*      */     //   #793	-> 1261
/*      */     //   #796	-> 1263
/*      */     //   #787	-> 1265
/*      */     //   #800	-> 1274
/*      */     //   #801	-> 1278
/*      */     //   #802	-> 1287
/*      */     //   #803	-> 1298
/*      */     //   #804	-> 1300
/*      */     //   #805	-> 1302
/*      */     //   #800	-> 1304
/*      */     //   #809	-> 1313
/*      */     //   #810	-> 1319
/*      */     //   #811	-> 1324
/*      */     //   #813	-> 1343
/*      */     //   #816	-> 1372
/*      */     //   #810	-> 1381
/*      */     //   #818	-> 1383
/*      */     //   #819	-> 1387
/*      */     //   #820	-> 1405
/*      */     //   #821	-> 1407
/*      */     //   #818	-> 1414
/*      */     //   #826	-> 1423
/*      */     //   #827	-> 1423
/*      */     //   #828	-> 1441
/*      */     //   #829	-> 1452
/*      */     //   #830	-> 1467
/*      */     //   #829	-> 1487
/*      */     //   #829	-> 1490
/*      */     //   #826	-> 1492
/*      */     //   #834	-> 1517
/*      */     //   #835	-> 1521
/*      */     //   #836	-> 1539
/*      */     //   #838	-> 1550
/*      */     //   #843	-> 1567
/*      */     //   #834	-> 1586
/*      */     //   #684	-> 1595
/*      */     //   #603	-> 1603
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   274	17	26	name	Ljava/lang/String;
/*      */     //   401	2	28	taskChanges	Ljava/util/List;
/*      */     //   487	31	36	$i$a$-map-TaskChainDetailsViewModelKt$convertStepToVm$changes$1	I
/*      */     //   484	34	35	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;
/*      */     //   473	54	34	item$iv$iv	Ljava/lang/Object;
/*      */     //   445	87	32	$i$f$mapTo	I
/*      */     //   442	90	30	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*      */     //   442	90	31	destination$iv$iv	Ljava/util/Collection;
/*      */     //   419	117	29	$i$f$map	I
/*      */     //   416	120	28	$this$map$iv	Ljava/lang/Iterable;
/*      */     //   586	12	33	$i$a$-let-TaskChainDetailsViewModelKt$convertStepToVm$openTerminalAction$1	I
/*      */     //   583	15	32	it	Lkotlin/jvm/functions/Function0;
/*      */     //   802	8	37	$i$a$-let-TaskChainDetailsViewModelKt$convertStepToVm$1	I
/*      */     //   799	11	36	view	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*      */     //   748	106	33	editChanges	Ljava/util/List;
/*      */     //   772	82	34	description	Ljava/lang/String;
/*      */     //   945	12	43	$i$a$-takeIf-TaskChainDetailsViewModelKt$convertStepToVm$2	I
/*      */     //   942	15	41	it	J
/*      */     //   866	141	33	command	Ljava/lang/String;
/*      */     //   892	115	34	contextMenuActions	Lkotlin/jvm/functions/Function0;
/*      */     //   1092	12	42	$i$a$-takeIf-TaskChainDetailsViewModelKt$convertStepToVm$3	I
/*      */     //   1089	15	40	it	J
/*      */     //   1019	133	33	command	Ljava/lang/String;
/*      */     //   1045	107	34	contextMenuActions	Lkotlin/jvm/functions/Function0;
/*      */     //   1171	11	38	$i$a$-let-TaskChainDetailsViewModelKt$convertStepToVm$contextMenuActions$5	I
/*      */     //   1168	14	37	command	Ljava/lang/String;
/*      */     //   1195	73	33	contextMenuActions	Lkotlin/jvm/functions/Function0;
/*      */     //   1319	98	33	description	Ljava/lang/String;
/*      */     //   1383	34	34	descr	Ljava/lang/String;
/*      */     //   1467	12	35	$i$a$-let-TaskChainDetailsViewModelKt$convertStepToVm$5	I
/*      */     //   1464	15	34	it	Lkotlin/jvm/functions/Function0;
/*      */     //   112	1491	21	name	Ljava/lang/String;
/*      */     //   172	1431	22	attachedFilesVm	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;
/*      */     //   215	1388	23	lastDoneState	Z
/*      */     //   248	1355	24	startNewTaskAction	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*      */     //   297	1306	25	rollbackAction	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*      */     //   382	1221	26	changeToCommand	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*      */     //   538	1065	27	changes	Ljava/util/List;
/*      */     //   552	1051	28	patchedType	Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*      */     //   575	1028	29	stopAction	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*      */     //   605	998	30	openTerminalAction	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*      */     //   0	1604	0	stepEntity	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;
/*      */     //   0	1604	1	task	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*      */     //   0	1604	2	state	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*      */     //   0	1604	3	project	Lcom/intellij/openapi/project/Project;
/*      */     //   0	1604	4	llmProxy	Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*      */     //   0	1604	5	doneAction	Lkotlin/jvm/functions/Function0;
/*      */     //   0	1604	6	declineAction	Lkotlin/jvm/functions/Function1;
/*      */     //   0	1604	7	scope	Lkotlinx/coroutines/CoroutineScope;
/*      */     //   0	1604	8	taskIsLastInChain	Z
/*      */     //   0	1604	9	hasChanges	Z
/*      */     //   0	1604	10	actionApprovalRequestData	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;
/*      */     //   0	1604	11	editApprovalRequestData	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/EditApprovalRequestData;
/*      */     //   0	1604	12	stopTerminalCommandAction	Lkotlin/jvm/functions/Function0;
/*      */     //   0	1604	13	onShowDiff	Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff;
/*      */     //   0	1604	14	onDelete	Lkotlin/jvm/functions/Function2;
/*      */     //   0	1604	15	onLocate	Lkotlin/jvm/functions/Function2;
/*      */     //   0	1604	16	onRollback	Lkotlin/jvm/functions/Function2;
/*      */     //   0	1604	17	onSetVCS	Lkotlin/jvm/functions/Function2;
/*      */     //   0	1604	18	onVCS	Lkotlin/jvm/functions/Function2;
/*      */     //   0	1604	19	onOpenTerminal	Lkotlin/jvm/functions/Function0;
/*      */     //   0	1604	20	openMarkdownInEditor	Lkotlin/jvm/functions/Function2;
/*      */   }
/*      */ 
/*      */   
/*      */   private static final Unit convertStepToVm$lambda$8(Function0 $doneAction, LiveTaskSnapshot $task) {
/*  623 */     $doneAction.invoke();
/*  624 */     CompositeUiAction.INSTANCE.logDoneTaskButtonClicked($task.getTaskChainId(), $task.getTask().getId());
/*  625 */     return Unit.INSTANCE;
/*      */   }
/*      */ 
/*      */   
/*      */   private static final Unit convertStepToVm$lambda$9(Function1 $declineAction, LiveTaskSnapshot $task) {
/*  630 */     $declineAction.invoke($task.getTask().getId());
/*  631 */     CompositeUiAction.INSTANCE.logRollbackTaskButtonClicked($task.getTaskChainId(), $task.getTask().getId());
/*  632 */     return Unit.INSTANCE;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final Unit convertStepToVm$lambda$13$lambda$12(OnShowDiff $onShowDiff, FileChange fileChange) {
/*  715 */     Intrinsics.checkNotNullParameter(fileChange, "fileChange"); $onShowDiff.showDiff(
/*  716 */         fileChange, 
/*  717 */         false);
/*      */     
/*  719 */     return Unit.INSTANCE;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final List convertStepToVm$lambda$14(Project $project, String $command, ActionApprovalRequestData $actionApprovalRequestData) {
/*  730 */     return getWhiteListContextActions(
/*  731 */         $project, 
/*  732 */         ActionType.RunTests, 
/*  733 */         $command, 
/*  734 */         ($actionApprovalRequestData != null) ? $actionApprovalRequestData.getRunAction() : null);
/*      */   }
/*      */   
/*      */   private static final List convertStepToVm$lambda$15() {
/*  738 */     return CollectionsKt.emptyList();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final List convertStepToVm$lambda$17(Project $project, String $command, ActionApprovalRequestData $actionApprovalRequestData) {
/*  755 */     return getWhiteListContextActions(
/*  756 */         $project, 
/*  757 */         ActionType.Build, 
/*  758 */         $command, 
/*  759 */         ($actionApprovalRequestData != null) ? $actionApprovalRequestData.getRunAction() : null);
/*      */   }
/*      */   
/*      */   private static final List convertStepToVm$lambda$18() {
/*  763 */     return CollectionsKt.emptyList();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final List convertStepToVm$lambda$21$lambda$20(Project $project, String $command, ActionApprovalRequestData $actionApprovalRequestData) {
/*  779 */     return getWhiteListContextActions(
/*  780 */         $project, 
/*  781 */         ActionType.Terminal, 
/*  782 */         $command, 
/*  783 */         ($actionApprovalRequestData != null) ? $actionApprovalRequestData.getRunAction() : null);
/*      */   }
/*      */   private static final List convertStepToVm$lambda$22() {
/*  786 */     return CollectionsKt.emptyList();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final List convertStepToVm$lambda$23() {
/*  822 */     return CollectionsKt.emptyList();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final Unit convertStepToVm$lambda$25(Function0 $doneAction, LiveTaskSnapshot $task) {
/*  839 */     if ($doneAction != null) { $doneAction.invoke(); } else {  }
/*  840 */      CompositeUiAction.INSTANCE.logDoneTaskButtonClicked($task.getTaskChainId(), $task.getTask().getId());
/*  841 */     return Unit.INSTANCE;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final Unit convertStepToVm$lambda$27(Function2 $openMarkdownInEditor, LiveTaskSnapshot $task, StepEntity $stepEntity) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: aload_1
/*      */     //   2: invokevirtual getSteps : ()Lkotlinx/collections/immutable/PersistentList;
/*      */     //   5: checkcast java/util/List
/*      */     //   8: astore_3
/*      */     //   9: astore #9
/*      */     //   11: iconst_0
/*      */     //   12: istore #4
/*      */     //   14: aload_3
/*      */     //   15: aload_3
/*      */     //   16: invokeinterface size : ()I
/*      */     //   21: invokeinterface listIterator : (I)Ljava/util/ListIterator;
/*      */     //   26: astore #5
/*      */     //   28: aload #5
/*      */     //   30: invokeinterface hasPrevious : ()Z
/*      */     //   35: ifeq -> 81
/*      */     //   38: aload #5
/*      */     //   40: invokeinterface previous : ()Ljava/lang/Object;
/*      */     //   45: astore #6
/*      */     //   47: aload #6
/*      */     //   49: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity
/*      */     //   52: astore #7
/*      */     //   54: iconst_0
/*      */     //   55: istore #8
/*      */     //   57: aload #7
/*      */     //   59: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*      */     //   62: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Prompt : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*      */     //   65: if_acmpne -> 72
/*      */     //   68: iconst_1
/*      */     //   69: goto -> 73
/*      */     //   72: iconst_0
/*      */     //   73: ifeq -> 28
/*      */     //   76: aload #6
/*      */     //   78: goto -> 92
/*      */     //   81: new java/util/NoSuchElementException
/*      */     //   84: dup
/*      */     //   85: ldc_w 'List contains no element matching the predicate.'
/*      */     //   88: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   91: athrow
/*      */     //   92: aload #9
/*      */     //   94: swap
/*      */     //   95: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity
/*      */     //   98: invokevirtual getDescription : ()Ljava/lang/String;
/*      */     //   101: dup
/*      */     //   102: ifnull -> 114
/*      */     //   105: bipush #40
/*      */     //   107: invokestatic take : (Ljava/lang/String;I)Ljava/lang/String;
/*      */     //   110: dup
/*      */     //   111: ifnonnull -> 118
/*      */     //   114: pop
/*      */     //   115: ldc_w 'Chat Response'
/*      */     //   118: aload_2
/*      */     //   119: invokevirtual getDescription : ()Ljava/lang/String;
/*      */     //   122: dup
/*      */     //   123: ifnonnull -> 130
/*      */     //   126: pop
/*      */     //   127: ldc_w 'No Response provided'
/*      */     //   130: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   135: pop
/*      */     //   136: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   139: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #844	-> 0
/*      */     //   #845	-> 1
/*      */     //   #1077	-> 14
/*      */     //   #1078	-> 28
/*      */     //   #1079	-> 38
/*      */     //   #1080	-> 47
/*      */     //   #845	-> 57
/*      */     //   #1080	-> 73
/*      */     //   #1082	-> 81
/*      */     //   #845	-> 95
/*      */     //   #846	-> 118
/*      */     //   #844	-> 130
/*      */     //   #848	-> 136
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   57	16	8	$i$a$-last-TaskChainDetailsViewModelKt$convertStepToVm$7$1	I
/*      */     //   54	19	7	it	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;
/*      */     //   47	34	6	element$iv	Ljava/lang/Object;
/*      */     //   14	78	4	$i$f$last	I
/*      */     //   28	64	5	iterator$iv	Ljava/util/ListIterator;
/*      */     //   11	81	3	$this$last$iv	Ljava/util/List;
/*      */     //   0	140	0	$openMarkdownInEditor	Lkotlin/jvm/functions/Function2;
/*      */     //   0	140	1	$task	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*      */     //   0	140	2	$stepEntity	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public static final List<FileChange> collectFileChanges(@NotNull PersistentList steps)
/*      */   {
/*  857 */     Intrinsics.checkNotNullParameter(steps, "steps"); HashMap<Object, Object> pathToInitial = new HashMap<>();
/*  858 */     HashMap<Object, Object> pathToFinal = new HashMap<>();
/*  859 */     for (StepEntity entity : steps) {
/*  860 */       for (FileChange change : entity.getChanges()) {
/*  861 */         Path path = change.getPath();
/*  862 */         if (pathToInitial.containsKey(path)) {
/*  863 */           pathToFinal.put(path, change.getNewContent()); continue;
/*      */         } 
/*  865 */         pathToInitial.put(path, change.getInitialContent());
/*  866 */         pathToFinal.put(path, change.getNewContent());
/*      */       } 
/*      */     } 
/*      */     
/*  870 */     List<FileChange> list1 = CollectionsKt.createListBuilder(), $this$collectFileChanges_u24lambda_u2428 = list1; int $i$a$-buildList-TaskChainDetailsViewModelKt$collectFileChanges$taskChanges$1 = 0;
/*  871 */     for (Map.Entry<Object, Object> entry : pathToInitial.entrySet()) { Path path = (Path)entry.getKey(); String initial = (String)entry.getValue();
/*  872 */       String final = (String)pathToFinal.get(path);
/*  873 */       if (!Intrinsics.areEqual(initial, final)) {
/*  874 */         $this$collectFileChanges_u24lambda_u2428.add(new FileChange(path, initial, final));
/*      */       } }
/*      */     
/*      */     List<FileChange> taskChanges = CollectionsKt.build(list1);
/*  878 */     return taskChanges; } @Composable
/*      */   @NotNull
/*      */   public static final IconKey getStateSmallIcon(@NotNull TaskChainState state, @Nullable Composer $composer, int $changed) { PathIconKey pathIconKey;
/*      */     IconKey iconKey2;
/*  882 */     Intrinsics.checkNotNullParameter(state, "state"); $composer.startReplaceGroup(-2052101484); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-2052101484, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.getStateSmallIcon (TaskChainDetailsViewModel.kt:881)"); 
/*  883 */     switch (WhenMappings.$EnumSwitchMapping$1[state.ordinal()]) { case 1: case 2:
/*  884 */         $composer.startReplaceGroup(-1786893679); pathIconKey = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getDoneStatusIcon(); $composer.endReplaceGroup();
/*  885 */       case 3: $composer.startReplaceGroup(-1786891757); pathIconKey = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getErrorOutlineIcon(); $composer.endReplaceGroup();
/*  886 */       case 4: $composer.startReplaceGroup(-1786889740); pathIconKey = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getStoppedStatusIcon(); $composer.endReplaceGroup();
/*  887 */       case 5: $composer.startReplaceGroup(-1786887406); pathIconKey = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getPauseStatusIcon(); $composer.endReplaceGroup();
/*      */       default:
/*  889 */         $composer.startReplaceGroup(-1786886474); iconKey2 = getStateIcon(state, $composer, 0xE & $changed); $composer.endReplaceGroup(); break; }  IconKey iconKey1 = iconKey2;
/*      */     if (ComposerKt.isTraceInProgress()) {
/*      */       ComposerKt.traceEventEnd();
/*      */     }
/*      */     $composer.endReplaceGroup();
/*      */     return iconKey1; }
/*      */ 
/*      */ 
/*      */   
/*      */   @Composable
/*      */   @NotNull
/*      */   public static final IconKey getStateIcon(@NotNull TaskChainState state, @Nullable Composer $composer, int $changed) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc_w 'state'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload_1
/*      */     //   8: ldc_w -620582369
/*      */     //   11: invokeinterface startReplaceGroup : (I)V
/*      */     //   16: invokestatic isTraceInProgress : ()Z
/*      */     //   19: ifeq -> 33
/*      */     //   22: ldc_w -620582369
/*      */     //   25: iload_2
/*      */     //   26: iconst_m1
/*      */     //   27: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.getStateIcon (TaskChainDetailsViewModel.kt:893)'
/*      */     //   30: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   33: aload_0
/*      */     //   34: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModelKt$WhenMappings.$EnumSwitchMapping$1 : [I
/*      */     //   37: swap
/*      */     //   38: invokevirtual ordinal : ()I
/*      */     //   41: iaload
/*      */     //   42: tableswitch default -> 245, 1 -> 80, 2 -> 80, 3 -> 113, 4 -> 179, 5 -> 212, 6 -> 146
/*      */     //   80: aload_1
/*      */     //   81: ldc_w -1985094045
/*      */     //   84: invokeinterface startReplaceGroup : (I)V
/*      */     //   89: aload_1
/*      */     //   90: iconst_0
/*      */     //   91: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*      */     //   94: invokevirtual getDoneStateIcon : ()Lorg/jetbrains/jewel/ui/icon/PathIconKey;
/*      */     //   97: astore #4
/*      */     //   99: aload_1
/*      */     //   100: invokeinterface endReplaceGroup : ()V
/*      */     //   105: aload #4
/*      */     //   107: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*      */     //   110: goto -> 297
/*      */     //   113: aload_1
/*      */     //   114: ldc_w -1985092156
/*      */     //   117: invokeinterface startReplaceGroup : (I)V
/*      */     //   122: aload_1
/*      */     //   123: iconst_0
/*      */     //   124: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*      */     //   127: invokevirtual getErrorStateIcon : ()Lorg/jetbrains/jewel/ui/icon/PathIconKey;
/*      */     //   130: astore #4
/*      */     //   132: aload_1
/*      */     //   133: invokeinterface endReplaceGroup : ()V
/*      */     //   138: aload #4
/*      */     //   140: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*      */     //   143: goto -> 297
/*      */     //   146: aload_1
/*      */     //   147: ldc_w -1985090173
/*      */     //   150: invokeinterface startReplaceGroup : (I)V
/*      */     //   155: aload_1
/*      */     //   156: iconst_0
/*      */     //   157: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*      */     //   160: invokevirtual getResetTaskIcon : ()Lorg/jetbrains/jewel/ui/icon/PathIconKey;
/*      */     //   163: astore #4
/*      */     //   165: aload_1
/*      */     //   166: invokeinterface endReplaceGroup : ()V
/*      */     //   171: aload #4
/*      */     //   173: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*      */     //   176: goto -> 297
/*      */     //   179: aload_1
/*      */     //   180: ldc_w -1985088250
/*      */     //   183: invokeinterface startReplaceGroup : (I)V
/*      */     //   188: aload_1
/*      */     //   189: iconst_0
/*      */     //   190: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*      */     //   193: invokevirtual getStoppedStateIcon : ()Lorg/jetbrains/jewel/ui/icon/PathIconKey;
/*      */     //   196: astore #4
/*      */     //   198: aload_1
/*      */     //   199: invokeinterface endReplaceGroup : ()V
/*      */     //   204: aload #4
/*      */     //   206: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*      */     //   209: goto -> 297
/*      */     //   212: aload_1
/*      */     //   213: ldc_w -1985085948
/*      */     //   216: invokeinterface startReplaceGroup : (I)V
/*      */     //   221: aload_1
/*      */     //   222: iconst_0
/*      */     //   223: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*      */     //   226: invokevirtual getPauseStateIcon : ()Lorg/jetbrains/jewel/ui/icon/PathIconKey;
/*      */     //   229: astore #4
/*      */     //   231: aload_1
/*      */     //   232: invokeinterface endReplaceGroup : ()V
/*      */     //   237: aload #4
/*      */     //   239: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*      */     //   242: goto -> 297
/*      */     //   245: aload_1
/*      */     //   246: ldc_w -1985085033
/*      */     //   249: invokeinterface startReplaceGroup : (I)V
/*      */     //   254: aload_1
/*      */     //   255: invokeinterface endReplaceGroup : ()V
/*      */     //   260: aload_0
/*      */     //   261: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;)Ljava/lang/String;
/*      */     //   266: astore #4
/*      */     //   268: new kotlin/NotImplementedError
/*      */     //   271: dup
/*      */     //   272: new java/lang/StringBuilder
/*      */     //   275: dup
/*      */     //   276: invokespecial <init> : ()V
/*      */     //   279: ldc_w 'An operation is not implemented: '
/*      */     //   282: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   285: aload #4
/*      */     //   287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   290: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   293: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   296: athrow
/*      */     //   297: astore_3
/*      */     //   298: invokestatic isTraceInProgress : ()Z
/*      */     //   301: ifeq -> 307
/*      */     //   304: invokestatic traceEventEnd : ()V
/*      */     //   307: aload_1
/*      */     //   308: invokeinterface endReplaceGroup : ()V
/*      */     //   313: aload_3
/*      */     //   314: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #894	-> 30
/*      */     //   #895	-> 33
/*      */     //   #896	-> 80
/*      */     //   #897	-> 113
/*      */     //   #898	-> 146
/*      */     //   #899	-> 179
/*      */     //   #900	-> 212
/*      */     //   #902	-> 245
/*      */     //   #895	-> 297
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	315	0	state	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*      */     //   0	315	1	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   0	315	2	$changed	I
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public static final String getStepTypeText(@NotNull StepType state) {
/*  907 */     Intrinsics.checkNotNullParameter(state, "state"); switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) { case 2: case 3: case 4: case 5: case 6: case 7:  }  return 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  914 */       null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final Flow<LiveTaskChainData> getChainData(LiveTaskChain $this$getChainData) {
/*  930 */     return FlowKt.combine(
/*  931 */         (Flow)$this$getChainData.getChain(), 
/*  932 */         (Flow)$this$getChainData.getTasks(), 
/*  933 */         (Flow)$this$getChainData.getCurrentJob(), 
/*  934 */         (Flow)$this$getChainData.getHumanInLoopRequest(), 
/*  935 */         (Flow)$this$getChainData.getProgress(), new TaskChainDetailsViewModelKt$getChainData$1(null));
/*  936 */   } @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModelKt$getChainData$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000(\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\0052\b\020\007\032\004\030\0010\b2\b\020\t\032\004\030\0010\n2\b\020\013\032\004\030\0010\fH\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/LiveTaskChainData;", "chain", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;", "tasks", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;", "currentJob", "Lkotlinx/coroutines/Job;", "humanInLoopRequest", "Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;", "progress", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;"}) static final class TaskChainDetailsViewModelKt$getChainData$1 extends SuspendLambda implements Function6<TaskChainEntity, PersistentList<? extends LiveTaskSnapshot>, Job, HumanInLoopRequest, ProgressEntity, Continuation<? super LiveTaskChainData>, Object> { int label; TaskChainDetailsViewModelKt$getChainData$1(Continuation $completion) { super(6, $completion); } public final Object invokeSuspend(Object $result) { TaskChainEntity chain; PersistentList<LiveTaskSnapshot> tasks; Job currentJob; HumanInLoopRequest humanInLoopRequest; ProgressEntity progress; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); chain = (TaskChainEntity)this.L$0; tasks = (PersistentList)this.L$1; currentJob = (Job)this.L$2; humanInLoopRequest = (HumanInLoopRequest)this.L$3; progress = (ProgressEntity)this.L$4;
/*  937 */           return new LiveTaskChainData(chain, currentJob, humanInLoopRequest, tasks, progress); }
/*      */        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invoke(TaskChainEntity p1, PersistentList p2, Job p3, HumanInLoopRequest p4, ProgressEntity p5, Continuation<? super TaskChainDetailsViewModelKt$getChainData$1> p6) { TaskChainDetailsViewModelKt$getChainData$1 taskChainDetailsViewModelKt$getChainData$1 = new TaskChainDetailsViewModelKt$getChainData$1(p6); taskChainDetailsViewModelKt$getChainData$1.L$0 = p1; taskChainDetailsViewModelKt$getChainData$1.L$1 = p2; taskChainDetailsViewModelKt$getChainData$1.L$2 = p3;
/*      */       taskChainDetailsViewModelKt$getChainData$1.L$3 = p4;
/*      */       taskChainDetailsViewModelKt$getChainData$1.L$4 = p5;
/*      */       return taskChainDetailsViewModelKt$getChainData$1.invokeSuspend(Unit.INSTANCE); } }
/*  942 */   @NotNull public static final Map<Integer, TaskRecapModel> collectRecap(@NotNull List $this$collectRecap) { Intrinsics.checkNotNullParameter($this$collectRecap, "<this>"); Map<Object, Object> recapMap = new LinkedHashMap<>();
/*  943 */     int index = 0; index = -1;
/*  944 */     Object prompt = null;
/*  945 */     Object plan = null;
/*  946 */     Object report = null;
/*  947 */     List steps = new ArrayList();
/*      */     
/*  949 */     Iterable $this$forEach$iv = $this$collectRecap; int $i$f$forEach = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1073 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); TaskStep step = (TaskStep)element$iv; int $i$a$-forEach-TaskChainDetailsViewModelKt$collectRecap$1 = 0; TaskStep taskStep1 = step; }
/*      */      return (Map)recapMap; } private static final Function0<Unit> openTerminalAction(TerminalState $this$openTerminalAction) { TerminalState terminalState = $this$openTerminalAction; if (terminalState instanceof TerminalState.TerminalAvailable) {
/*      */     
/*      */     } else {
/*      */       throw new NoWhenBranchMatchedException();
/*      */     } 
/*      */     return (terminalState instanceof TerminalState.NotAvailable) ? null : ((terminalState instanceof TerminalState.SessionLogAvailable) ? null : (Function0<Unit>)"JD-Core does not support Kotlin"); }
/*      */   @NotNull public static final List<Action> getWhiteListContextActions(@NotNull Project project, @NotNull ActionType actionType, @NotNull String action, @Nullable Function0 runAction) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc 'project'
/*      */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   6: aload_1
/*      */     //   7: ldc_w 'actionType'
/*      */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   13: aload_2
/*      */     //   14: ldc_w 'action'
/*      */     //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   20: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*      */     //   23: checkcast com/intellij/openapi/components/ComponentManager
/*      */     //   26: astore #5
/*      */     //   28: iconst_0
/*      */     //   29: istore #6
/*      */     //   31: ldc_w com/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent
/*      */     //   34: astore #7
/*      */     //   36: aload #5
/*      */     //   38: aload #7
/*      */     //   40: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*      */     //   45: dup
/*      */     //   46: ifnonnull -> 58
/*      */     //   49: pop
/*      */     //   50: aload #5
/*      */     //   52: aload #7
/*      */     //   54: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*      */     //   57: athrow
/*      */     //   58: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent
/*      */     //   61: astore #4
/*      */     //   63: aload #4
/*      */     //   65: invokevirtual getBraveMode : ()Z
/*      */     //   68: ifne -> 88
/*      */     //   71: aload_1
/*      */     //   72: getstatic com/intellij/ml/llm/matterhorn/ActionType.Terminal : Lcom/intellij/ml/llm/matterhorn/ActionType;
/*      */     //   75: if_acmpne -> 92
/*      */     //   78: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentAction.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion;
/*      */     //   81: aload_2
/*      */     //   82: invokevirtual isReadonlyBashCommand : (Ljava/lang/String;)Z
/*      */     //   85: ifeq -> 92
/*      */     //   88: invokestatic emptyList : ()Ljava/util/List;
/*      */     //   91: areturn
/*      */     //   92: new java/util/ArrayList
/*      */     //   95: dup
/*      */     //   96: invokespecial <init> : ()V
/*      */     //   99: checkcast java/util/List
/*      */     //   102: astore #5
/*      */     //   104: getstatic com/intellij/ml/llm/matterhorn/settings/ActionRule.Companion : Lcom/intellij/ml/llm/matterhorn/settings/ActionRule$Companion;
/*      */     //   107: aload #4
/*      */     //   109: invokevirtual getActionWhiteList : ()Ljava/util/List;
/*      */     //   112: aload_1
/*      */     //   113: aload_2
/*      */     //   114: invokevirtual findExactRules : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ActionType;Ljava/lang/String;)Ljava/util/List;
/*      */     //   117: astore #6
/*      */     //   119: aload_1
/*      */     //   120: getstatic com/intellij/ml/llm/matterhorn/ActionType.Terminal : Lcom/intellij/ml/llm/matterhorn/ActionType;
/*      */     //   123: if_acmpne -> 218
/*      */     //   126: aload #6
/*      */     //   128: checkcast java/util/Collection
/*      */     //   131: invokeinterface isEmpty : ()Z
/*      */     //   136: ifne -> 143
/*      */     //   139: iconst_1
/*      */     //   140: goto -> 144
/*      */     //   143: iconst_0
/*      */     //   144: ifeq -> 183
/*      */     //   147: aload #5
/*      */     //   149: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*      */     //   152: dup
/*      */     //   153: ldc_w 'junie.configurable.whitelist.remove.command'
/*      */     //   156: iconst_0
/*      */     //   157: anewarray java/lang/Object
/*      */     //   160: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*      */     //   163: aload #6
/*      */     //   165: aload #4
/*      */     //   167: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;)Lkotlin/jvm/functions/Function0;
/*      */     //   172: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*      */     //   175: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   180: goto -> 217
/*      */     //   183: aload #5
/*      */     //   185: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*      */     //   188: dup
/*      */     //   189: ldc_w 'junie.configurable.whitelist.add.command'
/*      */     //   192: iconst_0
/*      */     //   193: anewarray java/lang/Object
/*      */     //   196: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*      */     //   199: aload_1
/*      */     //   200: aload_2
/*      */     //   201: aload #4
/*      */     //   203: aload_3
/*      */     //   204: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ActionType;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
/*      */     //   209: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*      */     //   212: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   217: pop
/*      */     //   218: getstatic com/intellij/ml/llm/matterhorn/settings/ActionRule.Companion : Lcom/intellij/ml/llm/matterhorn/settings/ActionRule$Companion;
/*      */     //   221: aload #4
/*      */     //   223: invokevirtual getActionWhiteList : ()Ljava/util/List;
/*      */     //   226: aload_1
/*      */     //   227: aload_2
/*      */     //   228: aload #6
/*      */     //   230: checkcast java/lang/Iterable
/*      */     //   233: invokestatic toSet : (Ljava/lang/Iterable;)Ljava/util/Set;
/*      */     //   236: invokevirtual findSimilarRules : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ActionType;Ljava/lang/String;Ljava/util/Set;)Ljava/util/List;
/*      */     //   239: astore #7
/*      */     //   241: aload #7
/*      */     //   243: checkcast java/util/Collection
/*      */     //   246: invokeinterface isEmpty : ()Z
/*      */     //   251: ifne -> 258
/*      */     //   254: iconst_1
/*      */     //   255: goto -> 259
/*      */     //   258: iconst_0
/*      */     //   259: ifeq -> 299
/*      */     //   262: aload #5
/*      */     //   264: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*      */     //   267: dup
/*      */     //   268: ldc_w 'junie.configurable.whitelist.remove.similar.commands'
/*      */     //   271: iconst_0
/*      */     //   272: anewarray java/lang/Object
/*      */     //   275: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*      */     //   278: aload #7
/*      */     //   280: aload #4
/*      */     //   282: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;)Lkotlin/jvm/functions/Function0;
/*      */     //   287: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*      */     //   290: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   295: pop
/*      */     //   296: goto -> 349
/*      */     //   299: getstatic com/intellij/ml/llm/matterhorn/settings/ActionRule.Companion : Lcom/intellij/ml/llm/matterhorn/settings/ActionRule$Companion;
/*      */     //   302: aload_1
/*      */     //   303: aload_2
/*      */     //   304: invokevirtual getSimilarRule : (Lcom/intellij/ml/llm/matterhorn/ActionType;Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/settings/ActionRule;
/*      */     //   307: astore #8
/*      */     //   309: aload #8
/*      */     //   311: ifnull -> 349
/*      */     //   314: aload #5
/*      */     //   316: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*      */     //   319: dup
/*      */     //   320: ldc_w 'junie.configurable.whitelist.add.similar.commands'
/*      */     //   323: iconst_0
/*      */     //   324: anewarray java/lang/Object
/*      */     //   327: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*      */     //   330: aload #8
/*      */     //   332: aload #4
/*      */     //   334: aload_3
/*      */     //   335: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/settings/ActionRule;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
/*      */     //   340: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*      */     //   343: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   348: pop
/*      */     //   349: aload #5
/*      */     //   351: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*      */     //   354: dup
/*      */     //   355: ldc_w 'junie.configurable.whitelist.link'
/*      */     //   358: iconst_0
/*      */     //   359: anewarray java/lang/Object
/*      */     //   362: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*      */     //   365: aload_0
/*      */     //   366: <illegal opcode> invoke : (Lcom/intellij/openapi/project/Project;)Lkotlin/jvm/functions/Function0;
/*      */     //   371: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*      */     //   374: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   379: pop
/*      */     //   380: aload #5
/*      */     //   382: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1015	-> 20
/*      */     //   #1075	-> 31
/*      */     //   #1076	-> 36
/*      */     //   #1015	-> 58
/*      */     //   #1016	-> 63
/*      */     //   #1018	-> 92
/*      */     //   #1018	-> 102
/*      */     //   #1019	-> 104
/*      */     //   #1020	-> 119
/*      */     //   #1021	-> 126
/*      */     //   #1021	-> 144
/*      */     //   #1022	-> 147
/*      */     //   #1026	-> 183
/*      */     //   #1034	-> 218
/*      */     //   #1035	-> 221
/*      */     //   #1036	-> 226
/*      */     //   #1037	-> 227
/*      */     //   #1038	-> 228
/*      */     //   #1034	-> 236
/*      */     //   #1040	-> 241
/*      */     //   #1040	-> 259
/*      */     //   #1041	-> 262
/*      */     //   #1045	-> 299
/*      */     //   #1046	-> 309
/*      */     //   #1047	-> 314
/*      */     //   #1056	-> 349
/*      */     //   #1060	-> 380
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   31	27	6	$i$f$service	I
/*      */     //   36	22	7	serviceClass$iv	Ljava/lang/Class;
/*      */     //   28	30	5	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*      */     //   309	40	8	similarRule	Lcom/intellij/ml/llm/matterhorn/settings/ActionRule;
/*      */     //   63	320	4	settings	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;
/*      */     //   104	279	5	actions	Ljava/util/List;
/*      */     //   119	264	6	exactCommands	Ljava/util/List;
/*      */     //   241	142	7	similarRules	Ljava/util/List;
/*      */     //   0	383	0	project	Lcom/intellij/openapi/project/Project;
/*      */     //   0	383	1	actionType	Lcom/intellij/ml/llm/matterhorn/ActionType;
/*      */     //   0	383	2	action	Ljava/lang/String;
/*      */     //   0	383	3	runAction	Lkotlin/jvm/functions/Function0; }
/*      */   private static final Unit getWhiteListContextActions$lambda$31(List $exactCommands, MatterhornModelPersistentStateComponent $settings) { Iterable $this$forEach$iv = $exactCommands;
/*      */     int $i$f$forEach = 0;
/* 1083 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); ActionRule it = (ActionRule)element$iv; int $i$a$-forEach-TaskChainDetailsViewModelKt$getWhiteListContextActions$1$1 = 0; $settings.removeActionFromWhiteList(it); }  return Unit.INSTANCE; } private static final Unit getWhiteListContextActions$lambda$32(ActionType $actionType, String $action, MatterhornModelPersistentStateComponent $settings, Function0 $runAction) { ActionRule exactRule = ActionRule.Companion.getExactRule($actionType, $action); $settings.addActionToWhiteList(exactRule); if ($runAction != null) { $runAction.invoke(); } else {  }
/*      */      return Unit.INSTANCE; }
/* 1085 */   private static final Unit getWhiteListContextActions$lambda$34(List $similarRules, MatterhornModelPersistentStateComponent $settings) { Iterable $this$forEach$iv = $similarRules; int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); ActionRule it = (ActionRule)element$iv; int $i$a$-forEach-TaskChainDetailsViewModelKt$getWhiteListContextActions$3$1 = 0;
/*      */       $settings.removeActionFromWhiteList(it); }
/*      */     
/*      */     return Unit.INSTANCE; }
/*      */ 
/*      */   
/*      */   private static final Unit getWhiteListContextActions$lambda$36(ActionRule $similarRule, MatterhornModelPersistentStateComponent $settings, Function0 $runAction) {
/*      */     ActionRule it = $similarRule;
/*      */     int $i$a$-let-TaskChainDetailsViewModelKt$getWhiteListContextActions$4$1 = 0;
/*      */     $settings.addActionToWhiteList(it);
/*      */     if ($runAction != null) {
/*      */       $runAction.invoke();
/*      */     } else {
/*      */     
/*      */     } 
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit getWhiteListContextActions$lambda$37(Project $project) {
/*      */     ShowSettingsUtil showSettingsUtil = ShowSettingsUtil.getInstance();
/*      */     showSettingsUtil.showSettingsDialog($project, JunieAllowlistSettingsConfigurable.class);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\TaskChainDetailsViewModelKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */