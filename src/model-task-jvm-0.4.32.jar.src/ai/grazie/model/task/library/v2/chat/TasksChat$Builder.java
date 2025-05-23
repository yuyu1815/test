/*     */ package ai.grazie.model.task.library.v2.chat;
/*     */ 
/*     */ import ai.grazie.model.task.TaskCallData;
/*     */ import ai.grazie.model.task.exec.TaskCall;
/*     */ import ai.grazie.model.task.exec.TaskParameters;
/*     */ import ai.grazie.model.task.exec.TaskParametersKt;
/*     */ import ai.grazie.model.task.id.TaskID;
/*     */ import ai.grazie.model.task.id.TaskName;
/*     */ import ai.grazie.model.task.id.TaskTag;
/*     */ import ai.grazie.utils.data.DataHolder;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020!\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\b\n\002\020 \n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\030\0002\0020\001B\005¢\006\002\020\002J\016\020\006\032\0020\0002\006\020\007\032\0020\bJ\006\020\t\032\0020\nJ\026\020\013\032\0020\0002\006\020\f\032\0020\b2\006\020\r\032\0020\bJ\026\020\016\032\0020\0002\006\020\f\032\0020\b2\006\020\017\032\0020\bJ\016\020\020\032\0020\0002\006\020\020\032\0020\005J\016\020\003\032\0020\0002\006\020\021\032\0020\nJ\026\020\003\032\0020\0002\f\020\022\032\b\022\004\022\0020\0050\023H\007J\032\020\024\032\0020\0002\006\020\025\032\0020\0262\b\b\002\020\027\032\0020\030H\007J\020\020\024\032\0020\0002\006\020\024\032\0020\031H\007J\030\020\024\032\0020\0002\006\020\032\032\0020\0332\006\020\034\032\0020\035H\007J\"\020\024\032\0020\0002\006\020\036\032\0020\0372\006\020\034\032\0020 2\b\b\002\020\027\032\0020\030H\007J\016\020!\032\0020\0002\006\020\007\032\0020\bR\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000¨\006\""}, d2 = {"Lai/grazie/model/task/library/v2/chat/TasksChat$Builder;", "", "()V", "messages", "", "Lai/grazie/model/task/library/v2/chat/TasksChatMessage;", "assistant", "text", "", "build", "Lai/grazie/model/task/library/v2/chat/TasksChat;", "functionCall", "name", "content", "functionResponse", "result", "message", "chat", "messagesList", "", "task", "data", "Lai/grazie/model/task/TaskCallData;", "taskTag", "Lai/grazie/model/task/id/TaskTag;", "Lai/grazie/model/task/exec/TaskCall;", "id", "Lai/grazie/model/task/id/TaskID;", "parameters", "Lai/grazie/model/task/exec/TaskParameters;", "taskName", "Lai/grazie/model/task/id/TaskName;", "Lai/grazie/utils/data/DataHolder;", "user", "model-task"})
/*     */ @SourceDebugExtension({"SMAP\nTasksChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TasksChat.kt\nai/grazie/model/task/library/v2/chat/TasksChat$Builder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,96:1\n37#2:97\n36#2,3:98\n*S KotlinDebug\n*F\n+ 1 TasksChat.kt\nai/grazie/model/task/library/v2/chat/TasksChat$Builder\n*L\n87#1:97\n87#1:98,3\n*E\n"})
/*     */ public final class Builder
/*     */ {
/*     */   @NotNull
/*  44 */   private final List<TasksChatMessage> messages = new ArrayList<>();
/*     */   @NotNull
/*  46 */   public final Builder user(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); return message(new TasksChatUserMessage(text)); }
/*     */   @NotNull
/*  48 */   public final Builder assistant(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); return message(new TasksChatAssistantMessage(text)); }
/*     */   @NotNull
/*  50 */   public final Builder functionCall(@NotNull String name, @NotNull String content) { Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(content, "content"); return message(new TasksChatFunctionCallMessage(name, content)); } @NotNull
/*     */   public final Builder functionResponse(@NotNull String name, @NotNull String result) {
/*  52 */     Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(result, "result"); return message(new TasksChatFunctionResponseMessage(name, result));
/*     */   } @Deprecated(message = "JBAI-8430 in favour of `taskV2`")
/*     */   @NotNull
/*     */   public final Builder task(@NotNull TaskID id, @NotNull TaskParameters parameters) {
/*  56 */     Intrinsics.checkNotNullParameter(id, "id"); Intrinsics.checkNotNullParameter(parameters, "parameters"); return message(new TasksChatTaskCallMessage(TaskParametersKt.toDataHolder(parameters), id.getName(), id.getTag()));
/*     */   }
/*     */   @Deprecated(message = "JBAI-8430 in favour of `taskCallData`")
/*     */   @NotNull
/*     */   public final Builder task(@NotNull TaskCall task) {
/*  61 */     Intrinsics.checkNotNullParameter(task, "task"); return message(new TasksChatTaskCallMessage(TaskParametersKt.toDataHolder(task.getParameters()), task.getId().getName(), task.getId().getTag()));
/*     */   }
/*     */   @NotNull
/*     */   public final Builder task(@NotNull TaskName taskName, @NotNull DataHolder parameters, @NotNull TaskTag taskTag) {
/*  65 */     Intrinsics.checkNotNullParameter(taskName, "taskName"); Intrinsics.checkNotNullParameter(parameters, "parameters"); Intrinsics.checkNotNullParameter(taskTag, "taskTag"); return message(new TasksChatTaskCallMessage(parameters, taskName, taskTag));
/*     */   }
/*     */   @NotNull
/*     */   public final Builder task(@NotNull TaskCallData data, @NotNull TaskTag taskTag) {
/*  69 */     Intrinsics.checkNotNullParameter(data, "data"); Intrinsics.checkNotNullParameter(taskTag, "taskTag"); return message(new TasksChatTaskCallMessage(data.getParameters(), data.getTaskName(), taskTag));
/*     */   } @NotNull
/*     */   public final Builder message(@NotNull TasksChatMessage message) {
/*  72 */     Intrinsics.checkNotNullParameter(message, "message"); this.messages.add(message);
/*  73 */     return this;
/*     */   }
/*     */   @NotNull
/*     */   public final Builder messages(@NotNull TasksChat chat) {
/*  77 */     Intrinsics.checkNotNullParameter(chat, "chat"); CollectionsKt.addAll(this.messages, (Object[])chat.getMessages());
/*  78 */     return this;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Builder messages(@NotNull List<? extends TasksChatMessage> messagesList) {
/*  83 */     Intrinsics.checkNotNullParameter(messagesList, "messagesList"); this.messages.addAll(messagesList);
/*  84 */     return this;
/*     */   } @NotNull
/*     */   public final TasksChat build() {
/*  87 */     Collection<TasksChatMessage> $this$toTypedArray$iv = this.messages; int $i$f$toTypedArray = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  98 */     Collection<TasksChatMessage> thisCollection$iv = $this$toTypedArray$iv;
/*     */     
/* 100 */     return new TasksChat(thisCollection$iv.<TasksChatMessage>toArray(new TasksChatMessage[0]));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\chat\TasksChat$Builder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */