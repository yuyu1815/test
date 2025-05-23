/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.statistics;
/*     */ import com.intellij.internal.statistic.eventLog.EventLogGroup;
/*     */ import com.intellij.internal.statistic.eventLog.events.BooleanEventField;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventField;
/*     */ import com.intellij.internal.statistic.eventLog.events.EventPair;
/*     */ import com.intellij.internal.statistic.eventLog.events.VarargEventId;
/*     */ import com.intellij.ml.llm.matterhorn.configuration.BuildConfigKt;
/*     */ import com.intellij.ml.llm.matterhorn.configuration.EnvExtensionsKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.statistics.AbstractEJPrivateEventLogger;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskId;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornModelPersistentStateComponent;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import java.nio.file.Path;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000j\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b*\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\n\n\002\030\002\n\000\n\002\030\002\n\002\b\020\bÇ\002\030\0002\0020\0012\0020\002B\t\b\002¢\006\004\b\003\020\004J\b\020\007\032\0020\006H\026J\b\020P\032\0020QH\026J\020\020R\032\0020Q2\006\020S\032\0020TH\026J\020\020U\032\0020Q2\006\020S\032\0020TH\026J\020\020V\032\0020Q2\006\020W\032\0020\tH\026J\020\020X\032\0020Q2\006\020Y\032\0020\tH\026J\020\020Z\032\0020Q2\006\020Y\032\0020\tH\026J\b\020[\032\0020QH\026J\020\020\\\032\0020Q2\006\020Y\032\0020\tH\026J\030\020]\032\0020Q2\006\020^\032\0020_2\006\020`\032\0020aH\026J\030\020b\032\0020Q2\006\020^\032\0020_2\006\020`\032\0020aH\026J\030\020c\032\0020Q2\006\020^\032\0020_2\006\020`\032\0020aH\026J\030\020d\032\0020Q2\006\020^\032\0020_2\006\020`\032\0020aH\026J\030\020e\032\0020Q2\006\020^\032\0020_2\006\020`\032\0020aH\026J\030\020f\032\0020Q2\006\020^\032\0020_2\006\020`\032\0020aH\026J\030\020g\032\0020Q2\006\020^\032\0020_2\006\020`\032\0020aH\026J\020\020h\032\0020Q2\006\020^\032\0020_H\026J\020\020i\032\0020Q2\006\020^\032\0020_H\026J\020\020j\032\0020Q2\006\020^\032\0020_H\026J\020\020k\032\0020Q2\006\020^\032\0020_H\026J\020\020l\032\0020Q2\006\020^\032\0020_H\026J\020\020m\032\0020Q2\006\020^\032\0020_H\026J\030\020n\032\0020Q2\006\020^\032\0020_2\006\020`\032\0020aH\026J \020o\032\0020Q2\006\020p\032\0020\t2\006\020^\032\0020_2\006\020`\032\0020aH\026R\016\020\005\032\0020\006X\004¢\006\002\n\000R\024\020\b\032\0020\t8VX\004¢\006\006\032\004\b\n\020\013R\024\020\f\032\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017R\024\020\020\032\0020\021X\004¢\006\b\n\000\032\004\b\022\020\023R\024\020\024\032\0020\021X\004¢\006\b\n\000\032\004\b\025\020\023R\024\020\026\032\0020\021X\004¢\006\b\n\000\032\004\b\027\020\023R\034\020\030\032\n\022\006\022\004\030\0010\0320\031X\004¢\006\b\n\000\032\004\b\033\020\034R\024\020\035\032\0020\036X\004¢\006\b\n\000\032\004\b\037\020 R\024\020!\032\0020\036X\004¢\006\b\n\000\032\004\b\"\020 R\024\020#\032\0020\036X\004¢\006\b\n\000\032\004\b$\020 R\"\020%\032\020\022\004\022\0020\t\022\006\022\004\030\0010\0320&X\004¢\006\b\n\000\032\004\b'\020(R\"\020)\032\020\022\004\022\0020\t\022\006\022\004\030\0010\0320&X\004¢\006\b\n\000\032\004\b*\020(R\034\020+\032\n\022\006\022\004\030\0010\0320\031X\004¢\006\b\n\000\032\004\b,\020\034R\024\020-\032\0020\036X\004¢\006\b\n\000\032\004\b.\020 R\024\020/\032\0020\036X\004¢\006\b\n\000\032\004\b0\020 R\024\0201\032\0020\036X\004¢\006\b\n\000\032\004\b2\020 R\024\0203\032\0020\036X\004¢\006\b\n\000\032\004\b4\020 R\024\0205\032\0020\036X\004¢\006\b\n\000\032\004\b6\020 R\024\0207\032\0020\036X\004¢\006\b\n\000\032\004\b8\020 R\024\0209\032\0020\036X\004¢\006\b\n\000\032\004\b:\020 R\024\020;\032\0020\036X\004¢\006\b\n\000\032\004\b<\020 R\024\020=\032\0020\036X\004¢\006\b\n\000\032\004\b>\020 R\024\020?\032\0020\036X\004¢\006\b\n\000\032\004\b@\020 R\024\020A\032\0020\036X\004¢\006\b\n\000\032\004\bB\020 R\024\020C\032\0020\036X\004¢\006\b\n\000\032\004\bD\020 R\024\020E\032\0020\036X\004¢\006\b\n\000\032\004\bF\020 R\024\020G\032\0020\036X\004¢\006\b\n\000\032\004\bH\020 R\024\020I\032\0020\036X\004¢\006\b\n\000\032\004\bJ\020 R\024\020K\032\0020\036X\004¢\006\b\n\000\032\004\bL\020 R\026\020M\032\004\030\0010\0328@X\004¢\006\006\032\004\bN\020O¨\006q"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/statistics/EJUiPrivateEventLogger;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/statistics/processors/EJUIEventsProcessor;", "Lcom/intellij/internal/statistic/service/fus/collectors/CounterUsagesCollector;", "<init>", "()V", "GROUP", "Lcom/intellij/internal/statistic/eventLog/EventLogGroup;", "getGroup", "enabled", "", "getEnabled", "()Z", "FILE_ID", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/RequestPrivateData;", "getFILE_ID$ej_ui", "()Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/RequestPrivateData;", "CHECKED", "Lcom/intellij/internal/statistic/eventLog/events/BooleanEventField;", "getCHECKED$ej_ui", "()Lcom/intellij/internal/statistic/eventLog/events/BooleanEventField;", "CONFIRM", "getCONFIRM$ej_ui", "FOLLOW_UP", "getFOLLOW_UP$ej_ui", "TASK_RECENT_FILES_BUTTON_CLICKED", "Lcom/intellij/internal/statistic/eventLog/events/EventId1;", "", "getTASK_RECENT_FILES_BUTTON_CLICKED$ej_ui", "()Lcom/intellij/internal/statistic/eventLog/events/EventId1;", "TASK_RECENT_FILE_ADDED", "Lcom/intellij/internal/statistic/eventLog/events/VarargEventId;", "getTASK_RECENT_FILE_ADDED$ej_ui", "()Lcom/intellij/internal/statistic/eventLog/events/VarargEventId;", "TASK_RECENT_FILE_REMOVED", "getTASK_RECENT_FILE_REMOVED$ej_ui", "COMMAND_AUTO_APPROVE_CHECKED", "getCOMMAND_AUTO_APPROVE_CHECKED$ej_ui", "TASK_DESCRIPTION_FOCUS", "Lcom/intellij/internal/statistic/eventLog/events/EventId2;", "getTASK_DESCRIPTION_FOCUS$ej_ui", "()Lcom/intellij/internal/statistic/eventLog/events/EventId2;", "TASK_DESCRIPTION_INPUT", "getTASK_DESCRIPTION_INPUT$ej_ui", "TASK_EXAMPLE_CLICKED", "getTASK_EXAMPLE_CLICKED$ej_ui", "SUBMIT_TASK", "getSUBMIT_TASK$ej_ui", "STOP_TASK_BUTTON_CLICKED", "getSTOP_TASK_BUTTON_CLICKED$ej_ui", "DONE_TASK_BUTTON_CLICKED", "getDONE_TASK_BUTTON_CLICKED$ej_ui", "START_AGAIN_BUTTON_CLICKED", "getSTART_AGAIN_BUTTON_CLICKED$ej_ui", "DECLINE_TASK_BUTTON_CLICKED", "getDECLINE_TASK_BUTTON_CLICKED$ej_ui", "ROLLBACK_TASK_BUTTON_CLICKED", "getROLLBACK_TASK_BUTTON_CLICKED$ej_ui", "GO_BACK_TASK_BUTTON_CLICKED", "getGO_BACK_TASK_BUTTON_CLICKED$ej_ui", "CANCEL_STEP_TASK_BUTTON_CLICKED", "getCANCEL_STEP_TASK_BUTTON_CLICKED$ej_ui", "STOP_TASK_MENU_CLICKED", "getSTOP_TASK_MENU_CLICKED$ej_ui", "START_AGAIN_MENU_CLICKED", "getSTART_AGAIN_MENU_CLICKED$ej_ui", "ROLLBACK_TASK_MENU_CLICKED", "getROLLBACK_TASK_MENU_CLICKED$ej_ui", "DELETE_TASK_MENU_CLICKED", "getDELETE_TASK_MENU_CLICKED$ej_ui", "DELETE_ALL_TASK_MENU_CLICKED", "getDELETE_ALL_TASK_MENU_CLICKED$ej_ui", "TASK_REOPEN_FROM_HISTORY", "getTASK_REOPEN_FROM_HISTORY$ej_ui", "ASK_CONFIRMATION_SHOWED", "getASK_CONFIRMATION_SHOWED$ej_ui", "ASK_CONFIRMATION_ANSWERED", "getASK_CONFIRMATION_ANSWERED$ej_ui", "pluginVersion", "getPluginVersion$ej_ui", "()Ljava/lang/String;", "logTaskRecentFilesButtonClicked", "", "logTaskRecentFileAdded", "path", "Ljava/nio/file/Path;", "logTaskRecentFileRemoved", "logCommandAutoApproveChecked", "checked", "logTaskDescriptionFocus", "followUp", "logTaskDescriptionInput", "logExampleClicked", "logSubmitTask", "logStopTaskButtonClicked", "chainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "taskId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "logDoneTaskButtonClicked", "logStartAgainButtonClicked", "logDeclineTaskButtonClicked", "logRollbackTaskButtonClicked", "logGoBackTaskButtonClicked", "logCancelStepTaskButtonClicked", "logStopTaskMenuClicked", "logStartAgainTaskMenuClicked", "logRollbackTaskMenuClicked", "logDeleteTaskMenuClicked", "logDeleteAllTaskMenuClicked", "logTaskReopenFromHistory", "logAskConfirmationShowed", "logAskConfirmationAnswered", "isConfirmed", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nEJUiPrivateEventLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EJUiPrivateEventLogger.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/statistics/EJUiPrivateEventLogger\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,335:1\n31#2,2:336\n*S KotlinDebug\n*F\n+ 1 EJUiPrivateEventLogger.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/statistics/EJUiPrivateEventLogger\n*L\n27#1:336,2\n*E\n"})
/*     */ public final class EJUiPrivateEventLogger extends CounterUsagesCollector implements EJUIEventsProcessor {
/*     */   @NotNull
/*  23 */   public static final EJUiPrivateEventLogger INSTANCE = new EJUiPrivateEventLogger(); @NotNull private static final EventLogGroup GROUP = new EventLogGroup("matterhorn.ej.ui.private.events", 1, "MTHC", "Matterhorn EJ plugin UI non anonymous events"); @NotNull
/*  24 */   public EventLogGroup getGroup() { return GROUP; }
/*     */   
/*     */   public boolean getEnabled() {
/*  27 */     ComponentManager $this$service$iv = (ComponentManager)ApplicationKt.getApplication(); int $i$f$service = 0;
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
/* 336 */     Class<MatterhornModelPersistentStateComponent> serviceClass$iv = MatterhornModelPersistentStateComponent.class;
/* 337 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  return ((MatterhornModelPersistentStateComponent)$this$service$iv.getService(serviceClass$iv)).isDataSharingEnabled();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final RequestPrivateData FILE_ID = new RequestPrivateData("file_id");
/*     */   
/*     */   @NotNull
/*     */   public final RequestPrivateData getFILE_ID$ej_ui() {
/*     */     return FILE_ID;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final BooleanEventField CHECKED = EventFields.Boolean("checked");
/*     */   
/*     */   @NotNull
/*     */   public final BooleanEventField getCHECKED$ej_ui() {
/*     */     return CHECKED;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final BooleanEventField CONFIRM = EventFields.Boolean("confirm");
/*     */   
/*     */   @NotNull
/*     */   public final BooleanEventField getCONFIRM$ej_ui() {
/*     */     return CONFIRM;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final BooleanEventField FOLLOW_UP = EventFields.Boolean("follow_up");
/*     */   
/*     */   @NotNull
/*     */   public final BooleanEventField getFOLLOW_UP$ej_ui() {
/*     */     return FOLLOW_UP;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final EventId1<String> TASK_RECENT_FILES_BUTTON_CLICKED = EventLogGroup.registerEvent$default(INSTANCE.getGroup(), "task.recent.files.button.clicked", (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION(), null, 4, null);
/*     */   @NotNull
/*     */   private static final VarargEventId TASK_RECENT_FILE_ADDED;
/*     */   @NotNull
/*     */   private static final VarargEventId TASK_RECENT_FILE_REMOVED;
/*     */   @NotNull
/*     */   private static final VarargEventId COMMAND_AUTO_APPROVE_CHECKED;
/*     */   
/*     */   @NotNull
/*     */   public final EventId1<String> getTASK_RECENT_FILES_BUTTON_CLICKED$ej_ui() {
/*     */     return TASK_RECENT_FILES_BUTTON_CLICKED;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getTASK_RECENT_FILE_ADDED$ej_ui() {
/*     */     return TASK_RECENT_FILE_ADDED;
/*     */   }
/*     */   
/*     */   static {
/*     */     EventField[] arrayOfEventField = new EventField[2];
/*     */     arrayOfEventField[0] = (EventField)FILE_ID;
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     TASK_RECENT_FILE_ADDED = INSTANCE.getGroup().registerVarargEvent("task.recent.files.selected", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[2];
/*     */     arrayOfEventField[0] = (EventField)FILE_ID;
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     TASK_RECENT_FILE_REMOVED = INSTANCE.getGroup().registerVarargEvent("task.recent.files.removed", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[2];
/*     */     arrayOfEventField[0] = (EventField)CHECKED;
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     COMMAND_AUTO_APPROVE_CHECKED = INSTANCE.getGroup().registerVarargEvent("task.command.auto.approve.checked", arrayOfEventField);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getTASK_RECENT_FILE_REMOVED$ej_ui() {
/*     */     return TASK_RECENT_FILE_REMOVED;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getCOMMAND_AUTO_APPROVE_CHECKED$ej_ui() {
/*     */     return COMMAND_AUTO_APPROVE_CHECKED;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final EventId2<Boolean, String> TASK_DESCRIPTION_FOCUS = EventLogGroup.registerEvent$default(INSTANCE.getGroup(), "task.description.focus", (EventField)FOLLOW_UP, (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION(), null, 8, null);
/*     */   
/*     */   @NotNull
/*     */   public final EventId2<Boolean, String> getTASK_DESCRIPTION_FOCUS$ej_ui() {
/*     */     return TASK_DESCRIPTION_FOCUS;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final EventId2<Boolean, String> TASK_DESCRIPTION_INPUT = EventLogGroup.registerEvent$default(INSTANCE.getGroup(), "task.description.input", (EventField)FOLLOW_UP, (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION(), null, 8, null);
/*     */   
/*     */   @NotNull
/*     */   public final EventId2<Boolean, String> getTASK_DESCRIPTION_INPUT$ej_ui() {
/*     */     return TASK_DESCRIPTION_INPUT;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final EventId1<String> TASK_EXAMPLE_CLICKED = EventLogGroup.registerEvent$default(INSTANCE.getGroup(), "task.example.clicked", (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION(), null, 4, null);
/*     */   @NotNull
/*     */   private static final VarargEventId SUBMIT_TASK;
/*     */   @NotNull
/*     */   private static final VarargEventId STOP_TASK_BUTTON_CLICKED;
/*     */   @NotNull
/*     */   private static final VarargEventId DONE_TASK_BUTTON_CLICKED;
/*     */   @NotNull
/*     */   private static final VarargEventId START_AGAIN_BUTTON_CLICKED;
/*     */   @NotNull
/*     */   private static final VarargEventId DECLINE_TASK_BUTTON_CLICKED;
/*     */   @NotNull
/*     */   private static final VarargEventId ROLLBACK_TASK_BUTTON_CLICKED;
/*     */   @NotNull
/*     */   private static final VarargEventId GO_BACK_TASK_BUTTON_CLICKED;
/*     */   @NotNull
/*     */   private static final VarargEventId CANCEL_STEP_TASK_BUTTON_CLICKED;
/*     */   @NotNull
/*     */   private static final VarargEventId STOP_TASK_MENU_CLICKED;
/*     */   @NotNull
/*     */   private static final VarargEventId START_AGAIN_MENU_CLICKED;
/*     */   @NotNull
/*     */   private static final VarargEventId ROLLBACK_TASK_MENU_CLICKED;
/*     */   @NotNull
/*     */   private static final VarargEventId DELETE_TASK_MENU_CLICKED;
/*     */   @NotNull
/*     */   private static final VarargEventId DELETE_ALL_TASK_MENU_CLICKED;
/*     */   @NotNull
/*     */   private static final VarargEventId TASK_REOPEN_FROM_HISTORY;
/*     */   @NotNull
/*     */   private static final VarargEventId ASK_CONFIRMATION_SHOWED;
/*     */   @NotNull
/*     */   private static final VarargEventId ASK_CONFIRMATION_ANSWERED;
/*     */   
/*     */   @NotNull
/*     */   public final EventId1<String> getTASK_EXAMPLE_CLICKED$ej_ui() {
/*     */     return TASK_EXAMPLE_CLICKED;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getSUBMIT_TASK$ej_ui() {
/*     */     return SUBMIT_TASK;
/*     */   }
/*     */   
/*     */   static {
/*     */     arrayOfEventField = new EventField[2];
/*     */     arrayOfEventField[0] = (EventField)FOLLOW_UP;
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     SUBMIT_TASK = INSTANCE.getGroup().registerVarargEvent("task.submit", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[3];
/*     */     arrayOfEventField[0] = (EventField)AbstractEJPrivateEventLogger.Companion.getCHAIN_ID();
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getISSUE_ID();
/*     */     arrayOfEventField[2] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     STOP_TASK_BUTTON_CLICKED = INSTANCE.getGroup().registerVarargEvent("task.stop.button.clicked", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[3];
/*     */     arrayOfEventField[0] = (EventField)AbstractEJPrivateEventLogger.Companion.getCHAIN_ID();
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getISSUE_ID();
/*     */     arrayOfEventField[2] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     DONE_TASK_BUTTON_CLICKED = INSTANCE.getGroup().registerVarargEvent("task.done.button.clicked", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[3];
/*     */     arrayOfEventField[0] = (EventField)AbstractEJPrivateEventLogger.Companion.getCHAIN_ID();
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getISSUE_ID();
/*     */     arrayOfEventField[2] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     START_AGAIN_BUTTON_CLICKED = INSTANCE.getGroup().registerVarargEvent("task.start.again.button.clicked", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[3];
/*     */     arrayOfEventField[0] = (EventField)AbstractEJPrivateEventLogger.Companion.getCHAIN_ID();
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getISSUE_ID();
/*     */     arrayOfEventField[2] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     DECLINE_TASK_BUTTON_CLICKED = INSTANCE.getGroup().registerVarargEvent("task.decline.button.clicked", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[3];
/*     */     arrayOfEventField[0] = (EventField)AbstractEJPrivateEventLogger.Companion.getCHAIN_ID();
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getISSUE_ID();
/*     */     arrayOfEventField[2] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     ROLLBACK_TASK_BUTTON_CLICKED = INSTANCE.getGroup().registerVarargEvent("task.rollback.button.clicked", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[3];
/*     */     arrayOfEventField[0] = (EventField)AbstractEJPrivateEventLogger.Companion.getCHAIN_ID();
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getISSUE_ID();
/*     */     arrayOfEventField[2] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     GO_BACK_TASK_BUTTON_CLICKED = INSTANCE.getGroup().registerVarargEvent("task.go.back.button.clicked", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[3];
/*     */     arrayOfEventField[0] = (EventField)AbstractEJPrivateEventLogger.Companion.getCHAIN_ID();
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getISSUE_ID();
/*     */     arrayOfEventField[2] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     CANCEL_STEP_TASK_BUTTON_CLICKED = INSTANCE.getGroup().registerVarargEvent("task.cancel.step.button.clicked", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[2];
/*     */     arrayOfEventField[0] = (EventField)AbstractEJPrivateEventLogger.Companion.getCHAIN_ID();
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     STOP_TASK_MENU_CLICKED = INSTANCE.getGroup().registerVarargEvent("task.stop.menu.clicked", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[2];
/*     */     arrayOfEventField[0] = (EventField)AbstractEJPrivateEventLogger.Companion.getCHAIN_ID();
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     START_AGAIN_MENU_CLICKED = INSTANCE.getGroup().registerVarargEvent("task.start.again.menu.clicked", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[2];
/*     */     arrayOfEventField[0] = (EventField)AbstractEJPrivateEventLogger.Companion.getCHAIN_ID();
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     ROLLBACK_TASK_MENU_CLICKED = INSTANCE.getGroup().registerVarargEvent("task.rollback.menu.clicked", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[2];
/*     */     arrayOfEventField[0] = (EventField)AbstractEJPrivateEventLogger.Companion.getCHAIN_ID();
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     DELETE_TASK_MENU_CLICKED = INSTANCE.getGroup().registerVarargEvent("task.delete.menu.clicked", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[2];
/*     */     arrayOfEventField[0] = (EventField)AbstractEJPrivateEventLogger.Companion.getCHAIN_ID();
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     DELETE_ALL_TASK_MENU_CLICKED = INSTANCE.getGroup().registerVarargEvent("task.delete.all.menu.clicked", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[2];
/*     */     arrayOfEventField[0] = (EventField)AbstractEJPrivateEventLogger.Companion.getCHAIN_ID();
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     TASK_REOPEN_FROM_HISTORY = INSTANCE.getGroup().registerVarargEvent("task.reopen.from.history", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[3];
/*     */     arrayOfEventField[0] = (EventField)AbstractEJPrivateEventLogger.Companion.getCHAIN_ID();
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getISSUE_ID();
/*     */     arrayOfEventField[2] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     ASK_CONFIRMATION_SHOWED = INSTANCE.getGroup().registerVarargEvent("task.ask.confirmation.showed", arrayOfEventField);
/*     */     arrayOfEventField = new EventField[4];
/*     */     arrayOfEventField[0] = (EventField)CONFIRM;
/*     */     arrayOfEventField[1] = (EventField)AbstractEJPrivateEventLogger.Companion.getCHAIN_ID();
/*     */     arrayOfEventField[2] = (EventField)AbstractEJPrivateEventLogger.Companion.getISSUE_ID();
/*     */     arrayOfEventField[3] = (EventField)AbstractEJPrivateEventLogger.Companion.getEJ_VERSION();
/*     */     ASK_CONFIRMATION_ANSWERED = INSTANCE.getGroup().registerVarargEvent("task.ask.confirmation.answered", arrayOfEventField);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getSTOP_TASK_BUTTON_CLICKED$ej_ui() {
/*     */     return STOP_TASK_BUTTON_CLICKED;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getDONE_TASK_BUTTON_CLICKED$ej_ui() {
/*     */     return DONE_TASK_BUTTON_CLICKED;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getSTART_AGAIN_BUTTON_CLICKED$ej_ui() {
/*     */     return START_AGAIN_BUTTON_CLICKED;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getDECLINE_TASK_BUTTON_CLICKED$ej_ui() {
/*     */     return DECLINE_TASK_BUTTON_CLICKED;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getROLLBACK_TASK_BUTTON_CLICKED$ej_ui() {
/*     */     return ROLLBACK_TASK_BUTTON_CLICKED;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getGO_BACK_TASK_BUTTON_CLICKED$ej_ui() {
/*     */     return GO_BACK_TASK_BUTTON_CLICKED;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getCANCEL_STEP_TASK_BUTTON_CLICKED$ej_ui() {
/*     */     return CANCEL_STEP_TASK_BUTTON_CLICKED;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getSTOP_TASK_MENU_CLICKED$ej_ui() {
/*     */     return STOP_TASK_MENU_CLICKED;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getSTART_AGAIN_MENU_CLICKED$ej_ui() {
/*     */     return START_AGAIN_MENU_CLICKED;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getROLLBACK_TASK_MENU_CLICKED$ej_ui() {
/*     */     return ROLLBACK_TASK_MENU_CLICKED;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getDELETE_TASK_MENU_CLICKED$ej_ui() {
/*     */     return DELETE_TASK_MENU_CLICKED;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getDELETE_ALL_TASK_MENU_CLICKED$ej_ui() {
/*     */     return DELETE_ALL_TASK_MENU_CLICKED;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getTASK_REOPEN_FROM_HISTORY$ej_ui() {
/*     */     return TASK_REOPEN_FROM_HISTORY;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getASK_CONFIRMATION_SHOWED$ej_ui() {
/*     */     return ASK_CONFIRMATION_SHOWED;
/*     */   }
/*     */   
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @NotNull
/*     */   public final VarargEventId getASK_CONFIRMATION_ANSWERED$ej_ui() {
/*     */     return ASK_CONFIRMATION_ANSWERED;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String getPluginVersion$ej_ui() {
/*     */     PluginUtilsKt.getJunieVersion();
/*     */     return (PluginUtilsKt.getJunieVersion() != null) ? StatsUtilsKt.normalizeVersion(PluginUtilsKt.getJunieVersion()) : null;
/*     */   }
/*     */   
/*     */   public void logTaskRecentFilesButtonClicked() {
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     TASK_RECENT_FILES_BUTTON_CLICKED.log(getPluginVersion$ej_ui());
/*     */   }
/*     */   
/*     */   public void logTaskRecentFileAdded(@NotNull Path path) {
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[2];
/*     */     arrayOfEventPair[0] = FILE_ID.with(path.toString());
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     TASK_RECENT_FILE_ADDED.log(arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logTaskRecentFileRemoved(@NotNull Path path) {
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[2];
/*     */     arrayOfEventPair[0] = FILE_ID.with(path.toString());
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     TASK_RECENT_FILE_REMOVED.log(arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logCommandAutoApproveChecked(boolean checked) {
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[2];
/*     */     arrayOfEventPair[0] = CHECKED.with(Boolean.valueOf(checked));
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     COMMAND_AUTO_APPROVE_CHECKED.log(arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logTaskDescriptionFocus(boolean followUp) {
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     TASK_DESCRIPTION_FOCUS.log(Boolean.valueOf(followUp), getPluginVersion$ej_ui());
/*     */   }
/*     */   
/*     */   public void logTaskDescriptionInput(boolean followUp) {
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     TASK_DESCRIPTION_INPUT.log(Boolean.valueOf(followUp), getPluginVersion$ej_ui());
/*     */   }
/*     */   
/*     */   public void logExampleClicked() {
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     TASK_EXAMPLE_CLICKED.log(getPluginVersion$ej_ui());
/*     */   }
/*     */   
/*     */   public void logSubmitTask(boolean followUp) {
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[2];
/*     */     arrayOfEventPair[0] = FOLLOW_UP.with(Boolean.valueOf(followUp));
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     SUBMIT_TASK.log(arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logStopTaskButtonClicked(@NotNull TaskChainId chainId, @NotNull TaskId taskId) {
/*     */     Intrinsics.checkNotNullParameter(chainId, "chainId");
/*     */     Intrinsics.checkNotNullParameter(taskId, "taskId");
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[3];
/*     */     arrayOfEventPair[0] = AbstractEJPrivateEventLogger.Companion.getCHAIN_ID().with(chainId.toString());
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getISSUE_ID().with(taskId.toString());
/*     */     arrayOfEventPair[2] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     STOP_TASK_BUTTON_CLICKED.log(arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logDoneTaskButtonClicked(@NotNull TaskChainId chainId, @NotNull TaskId taskId) {
/*     */     Intrinsics.checkNotNullParameter(chainId, "chainId");
/*     */     Intrinsics.checkNotNullParameter(taskId, "taskId");
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[3];
/*     */     arrayOfEventPair[0] = AbstractEJPrivateEventLogger.Companion.getCHAIN_ID().with(chainId.toString());
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getISSUE_ID().with(taskId.toString());
/*     */     arrayOfEventPair[2] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     DONE_TASK_BUTTON_CLICKED.log(arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logStartAgainButtonClicked(@NotNull TaskChainId chainId, @NotNull TaskId taskId) {
/*     */     Intrinsics.checkNotNullParameter(chainId, "chainId");
/*     */     Intrinsics.checkNotNullParameter(taskId, "taskId");
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[3];
/*     */     arrayOfEventPair[0] = AbstractEJPrivateEventLogger.Companion.getCHAIN_ID().with(chainId.toString());
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getISSUE_ID().with(taskId.toString());
/*     */     arrayOfEventPair[2] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     START_AGAIN_BUTTON_CLICKED.log(arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logDeclineTaskButtonClicked(@NotNull TaskChainId chainId, @NotNull TaskId taskId) {
/*     */     Intrinsics.checkNotNullParameter(chainId, "chainId");
/*     */     Intrinsics.checkNotNullParameter(taskId, "taskId");
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[3];
/*     */     arrayOfEventPair[0] = AbstractEJPrivateEventLogger.Companion.getCHAIN_ID().with(chainId.toString());
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getISSUE_ID().with(taskId.toString());
/*     */     arrayOfEventPair[2] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     DECLINE_TASK_BUTTON_CLICKED.log(arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logRollbackTaskButtonClicked(@NotNull TaskChainId chainId, @NotNull TaskId taskId) {
/*     */     Intrinsics.checkNotNullParameter(chainId, "chainId");
/*     */     Intrinsics.checkNotNullParameter(taskId, "taskId");
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[3];
/*     */     arrayOfEventPair[0] = AbstractEJPrivateEventLogger.Companion.getCHAIN_ID().with(chainId.toString());
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getISSUE_ID().with(taskId.toString());
/*     */     arrayOfEventPair[2] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     ROLLBACK_TASK_BUTTON_CLICKED.log(arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logGoBackTaskButtonClicked(@NotNull TaskChainId chainId, @NotNull TaskId taskId) {
/*     */     Intrinsics.checkNotNullParameter(chainId, "chainId");
/*     */     Intrinsics.checkNotNullParameter(taskId, "taskId");
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[3];
/*     */     arrayOfEventPair[0] = AbstractEJPrivateEventLogger.Companion.getCHAIN_ID().with(chainId.toString());
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getISSUE_ID().with(taskId.toString());
/*     */     arrayOfEventPair[2] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     GO_BACK_TASK_BUTTON_CLICKED.log(arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logCancelStepTaskButtonClicked(@NotNull TaskChainId chainId, @NotNull TaskId taskId) {
/*     */     Intrinsics.checkNotNullParameter(chainId, "chainId");
/*     */     Intrinsics.checkNotNullParameter(taskId, "taskId");
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[3];
/*     */     arrayOfEventPair[0] = AbstractEJPrivateEventLogger.Companion.getCHAIN_ID().with(chainId.toString());
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getISSUE_ID().with(taskId.toString());
/*     */     arrayOfEventPair[2] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     CANCEL_STEP_TASK_BUTTON_CLICKED.log(arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logStopTaskMenuClicked(@NotNull TaskChainId chainId) {
/*     */     Intrinsics.checkNotNullParameter(chainId, "chainId");
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[2];
/*     */     arrayOfEventPair[0] = AbstractEJPrivateEventLogger.Companion.getCHAIN_ID().with(chainId.toString());
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     STOP_TASK_MENU_CLICKED.log(arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logStartAgainTaskMenuClicked(@NotNull TaskChainId chainId) {
/*     */     Intrinsics.checkNotNullParameter(chainId, "chainId");
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[2];
/*     */     arrayOfEventPair[0] = AbstractEJPrivateEventLogger.Companion.getCHAIN_ID().with(chainId.toString());
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     START_AGAIN_MENU_CLICKED.log(arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logRollbackTaskMenuClicked(@NotNull TaskChainId chainId) {
/*     */     Intrinsics.checkNotNullParameter(chainId, "chainId");
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[2];
/*     */     arrayOfEventPair[0] = AbstractEJPrivateEventLogger.Companion.getCHAIN_ID().with(chainId.toString());
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     ROLLBACK_TASK_MENU_CLICKED.log(arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logDeleteTaskMenuClicked(@NotNull TaskChainId chainId) {
/*     */     Intrinsics.checkNotNullParameter(chainId, "chainId");
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[2];
/*     */     arrayOfEventPair[0] = AbstractEJPrivateEventLogger.Companion.getCHAIN_ID().with(chainId.toString());
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     DELETE_TASK_MENU_CLICKED.log(arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logDeleteAllTaskMenuClicked(@NotNull TaskChainId chainId) {
/*     */     Intrinsics.checkNotNullParameter(chainId, "chainId");
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[2];
/*     */     arrayOfEventPair[0] = AbstractEJPrivateEventLogger.Companion.getCHAIN_ID().with(chainId.toString());
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     DELETE_ALL_TASK_MENU_CLICKED.log(arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logTaskReopenFromHistory(@NotNull TaskChainId chainId) {
/*     */     Intrinsics.checkNotNullParameter(chainId, "chainId");
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[2];
/*     */     arrayOfEventPair[0] = AbstractEJPrivateEventLogger.Companion.getCHAIN_ID().with(chainId.toString());
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     TASK_REOPEN_FROM_HISTORY.log(arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logAskConfirmationShowed(@NotNull TaskChainId chainId, @NotNull TaskId taskId) {
/*     */     Intrinsics.checkNotNullParameter(chainId, "chainId");
/*     */     Intrinsics.checkNotNullParameter(taskId, "taskId");
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[3];
/*     */     arrayOfEventPair[0] = AbstractEJPrivateEventLogger.Companion.getCHAIN_ID().with(chainId.toString());
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getISSUE_ID().with(taskId.toString());
/*     */     arrayOfEventPair[2] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     ASK_CONFIRMATION_SHOWED.log(arrayOfEventPair);
/*     */   }
/*     */   
/*     */   public void logAskConfirmationAnswered(boolean isConfirmed, @NotNull TaskChainId chainId, @NotNull TaskId taskId) {
/*     */     Intrinsics.checkNotNullParameter(chainId, "chainId");
/*     */     Intrinsics.checkNotNullParameter(taskId, "taskId");
/*     */     EnvExtensionsKt.assertCanSendNonAnonymizedStats(BuildConfigKt.getConfig());
/*     */     EventPair[] arrayOfEventPair = new EventPair[4];
/*     */     arrayOfEventPair[0] = CONFIRM.with(Boolean.valueOf(isConfirmed));
/*     */     arrayOfEventPair[1] = AbstractEJPrivateEventLogger.Companion.getCHAIN_ID().with(chainId.toString());
/*     */     arrayOfEventPair[2] = AbstractEJPrivateEventLogger.Companion.getISSUE_ID().with(taskId.toString());
/*     */     arrayOfEventPair[3] = AbstractEJPrivateEventLogger.Companion.getEJ_VERSION().with(getPluginVersion$ej_ui());
/*     */     ASK_CONFIRMATION_ANSWERED.log(arrayOfEventPair);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\statistics\EJUiPrivateEventLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */