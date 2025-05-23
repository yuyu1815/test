/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.CustomContext;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContextUserDataKey;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionEnvironment;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionMode;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.components.ServicesKt;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.vcs.changes.Change;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\005\n\002\020!\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\000 '2\0020\001:\001'B\031\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\024\020\037\032\0020 2\f\020\034\032\b\022\004\022\0020\0250\024J\f\020!\032\b\022\004\022\0020\0250\024J\016\020\"\032\0020#2\006\020$\032\0020%J\006\020&\032\0020\001R\020\020\002\032\004\030\0010\003X\016¢\006\002\n\000R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\b\020\t\"\004\b\n\020\013R\034\020\f\032\004\030\0010\rX\016¢\006\016\n\000\032\004\b\016\020\017\"\004\b\020\020\021R\032\020\022\032\016\022\n\022\b\022\004\022\0020\0250\0240\023X\016¢\006\002\n\000R\032\020\026\032\0020\027X\016¢\006\016\n\000\032\004\b\030\020\031\"\004\b\032\020\033R\035\020\034\032\016\022\n\022\b\022\004\022\0020\0250\0240\024¢\006\b\n\000\032\004\b\035\020\036¨\006("}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentContext;", "Lcom/intellij/ml/llm/matterhorn/CustomContext;", "currentIssue", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "currentDir", "Lcom/intellij/openapi/vfs/VirtualFile;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Lcom/intellij/openapi/vfs/VirtualFile;)V", "getCurrentDir", "()Lcom/intellij/openapi/vfs/VirtualFile;", "setCurrentDir", "(Lcom/intellij/openapi/vfs/VirtualFile;)V", "currentScreenPosition", "Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;", "getCurrentScreenPosition", "()Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;", "setCurrentScreenPosition", "(Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;)V", "editsHistory", "", "", "Lcom/intellij/openapi/vcs/changes/Change;", "sessionHistory", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;", "getSessionHistory", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;", "setSessionHistory", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;)V", "changes", "getChanges", "()Ljava/util/List;", "pushChange", "", "popChange", "getExecutionEnvironment", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionEnvironment;", "root", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "copy", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAgentContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentContext\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,332:1\n31#2,2:333\n14#3:335\n*S KotlinDebug\n*F\n+ 1 AgentContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentContext\n*L\n136#1:333,2\n120#1:335\n*E\n"})
/*     */ public final class AgentContext
/*     */   implements CustomContext
/*     */ {
/*     */   public AgentContext(@Nullable AgentIssue currentIssue, @NotNull VirtualFile currentDir) {
/* 114 */     this.currentIssue = currentIssue; this.currentDir = currentDir;
/*     */     
/* 116 */     this.editsHistory = new ArrayList<>();
/* 117 */     this.sessionHistory = AgentSessionHistory.Companion.initialHistoryContext();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 124 */     this.changes = this.editsHistory;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final VirtualFile getCurrentDir() {
/*     */     return this.currentDir;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void setCurrentDir(@NotNull VirtualFile <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.currentDir = <set-?>;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final FileWithLine getCurrentScreenPosition() {
/*     */     return this.currentScreenPosition;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void setCurrentScreenPosition(@Nullable FileWithLine <set-?>) {
/*     */     this.currentScreenPosition = <set-?>;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final AgentSessionHistory getSessionHistory() {
/*     */     return this.sessionHistory;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void setSessionHistory(@NotNull AgentSessionHistory <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.sessionHistory = <set-?>;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentContext$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "KEY", "Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentContext;", "getKEY", "()Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;", "ej-core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final ExecutionContextUserDataKey<AgentContext> getKEY() {
/*     */       return AgentContext.KEY;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static
/*     */   {
/*     */     int $i$f$logger = 0;
/* 335 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(AgentContext.class), "getInstance(...)"); } @NotNull private static final Logger logger = Logger.getInstance(AgentContext.class);
/*     */   @NotNull
/*     */   private static final ExecutionContextUserDataKey<AgentContext> KEY = new ExecutionContextUserDataKey("AgentContextKey");
/*     */   
/*     */   @NotNull
/*     */   public final List<List<Change>> getChanges() {
/*     */     return this.changes;
/*     */   }
/*     */   
/*     */   public final void pushChange(@NotNull List<Change> changes) {
/*     */     Intrinsics.checkNotNullParameter(changes, "changes");
/*     */     this.editsHistory.add(changes);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<Change> popChange() {
/*     */     Intrinsics.checkNotNullExpressionValue(this.editsHistory.removeLast(), "removeLast(...)");
/*     */     return this.editsHistory.isEmpty() ? CollectionsKt.emptyList() : this.editsHistory.removeLast();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ExecutionEnvironment getExecutionEnvironment(@NotNull RootExecutionContext root) {
/*     */     Intrinsics.checkNotNullParameter(root, "root");
/*     */     Project project = root.getService().getProject();
/*     */     ComponentManager $this$service$iv = (ComponentManager)project;
/*     */     int $i$f$service = 0;
/*     */     Class<MatterhornPersistentStateComponent> serviceClass$iv = MatterhornPersistentStateComponent.class;
/*     */     if ($this$service$iv.getService(serviceClass$iv) == null) {
/*     */       $this$service$iv.getService(serviceClass$iv);
/*     */       throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv);
/*     */     } 
/*     */     MatterhornPersistentStateComponent settings = (MatterhornPersistentStateComponent)$this$service$iv.getService(serviceClass$iv);
/*     */     ExecutionMode executionMode = settings.getEffectiveExecutionMode();
/*     */     logger.info("Execution mode from settings: " + settings.getEffectiveExecutionMode() + ", effective execution mode: " + executionMode);
/*     */     return executionMode.createExecutionEnvironment(root);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final CustomContext copy() {
/*     */     AgentContext result = new AgentContext(this.currentIssue, this.currentDir);
/*     */     result.currentScreenPosition = this.currentScreenPosition;
/*     */     return result;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private AgentIssue currentIssue;
/*     */   @NotNull
/*     */   private VirtualFile currentDir;
/*     */   @Nullable
/*     */   private FileWithLine currentScreenPosition;
/*     */   @NotNull
/*     */   private List<List<Change>> editsHistory;
/*     */   @NotNull
/*     */   private AgentSessionHistory sessionHistory;
/*     */   @NotNull
/*     */   private final List<List<Change>> changes;
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */