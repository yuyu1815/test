/*    */ package com.intellij.ml.llm.matterhorn.ej.core.statistics;
/*    */ import com.intellij.internal.statistic.eventLog.events.EventField;
/*    */ import com.intellij.internal.statistic.eventLog.events.EventFields;
/*    */ import com.intellij.internal.statistic.eventLog.events.EventPair;
/*    */ import com.intellij.internal.statistic.eventLog.events.IntEventField;
/*    */ import com.intellij.internal.statistic.eventLog.events.PrimitiveEventField;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.project.ProjectUtil;
/*    */ import com.intellij.openapi.vcs.changes.ChangeListManager;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.vcs.log.data.VcsLogData;
/*    */ import java.util.Collection;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b&\030\000 \0212\0020\001:\002\021\022B\007¢\006\004\b\002\020\003J\b\020\006\032\0020\005H\026J\026\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\016J\022\020\017\032\004\030\0010\0202\006\020\013\032\0020\fH\002R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\007\032\0020\bX\004¢\006\002\n\000¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJVcsStateLogger;", "Lcom/intellij/internal/statistic/service/fus/collectors/CounterUsagesCollector;", "<init>", "()V", "GROUP", "Lcom/intellij/internal/statistic/eventLog/EventLogGroup;", "getGroup", "VCS_LOG", "Lcom/intellij/internal/statistic/eventLog/events/VarargEventId;", "logVcsState", "", "project", "Lcom/intellij/openapi/project/Project;", "vcsStateId", "Ljava/util/UUID;", "getVcsData", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJVcsStateLogger$VcsState;", "Companion", "VcsState", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nAbstractEJVcsStateLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractEJVcsStateLogger.kt\ncom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJVcsStateLogger\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n1557#2:75\n1628#2,3:76\n*S KotlinDebug\n*F\n+ 1 AbstractEJVcsStateLogger.kt\ncom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJVcsStateLogger\n*L\n57#1:75\n57#1:76,3\n*E\n"})
/*    */ public abstract class AbstractEJVcsStateLogger extends CounterUsagesCollector {
/*    */   @NotNull
/* 20 */   private final EventLogGroup GROUP = new EventLogGroup("matterhorn.ej.vcs", 2, "FUS", "Matterhorn EJ plugin vcs state events"); @NotNull
/* 21 */   public EventLogGroup getGroup() { return this.GROUP; }
/*    */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\034\020\004\032\n\022\006\022\004\030\0010\0060\005X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nX\004¢\006\b\n\000\032\004\b\013\020\fR\034\020\r\032\n\022\006\022\004\030\0010\0060\016X\004¢\006\b\n\000\032\004\b\017\020\020R\024\020\021\032\0020\022X\004¢\006\b\n\000\032\004\b\023\020\024R\024\020\025\032\0020\022X\004¢\006\b\n\000\032\004\b\026\020\024¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJVcsStateLogger$Companion;", "", "<init>", "()V", "VCS_STATE_ID", "Lcom/intellij/internal/statistic/eventLog/events/PrimitiveEventField;", "", "getVCS_STATE_ID$ej_core", "()Lcom/intellij/internal/statistic/eventLog/events/PrimitiveEventField;", "TIMESTAMP_MS", "Lcom/intellij/internal/statistic/eventLog/events/LongEventField;", "getTIMESTAMP_MS$ej_core", "()Lcom/intellij/internal/statistic/eventLog/events/LongEventField;", "ORIGIN_URL", "Lcom/intellij/internal/statistic/eventLog/events/EventField;", "getORIGIN_URL$ej_core", "()Lcom/intellij/internal/statistic/eventLog/events/EventField;", "USERS_COUNT", "Lcom/intellij/internal/statistic/eventLog/events/IntEventField;", "getUSERS_COUNT$ej_core", "()Lcom/intellij/internal/statistic/eventLog/events/IntEventField;", "LOCAL_CHANGED_FILES_COUNT", "getLOCAL_CHANGED_FILES_COUNT$ej_core", "ej-core"})
/*    */   public static final class Companion { private Companion() {}
/*    */     @NotNull
/* 25 */     public final PrimitiveEventField<String> getVCS_STATE_ID$ej_core() { return AbstractEJVcsStateLogger.VCS_STATE_ID; } @NotNull
/* 26 */     public final LongEventField getTIMESTAMP_MS$ej_core() { return AbstractEJVcsStateLogger.TIMESTAMP_MS; } @NotNull
/* 27 */     public final EventField<String> getORIGIN_URL$ej_core() { return AbstractEJVcsStateLogger.ORIGIN_URL; } @NotNull
/* 28 */     public final IntEventField getUSERS_COUNT$ej_core() { return AbstractEJVcsStateLogger.USERS_COUNT; } @NotNull
/* 29 */     public final IntEventField getLOCAL_CHANGED_FILES_COUNT$ej_core() { return AbstractEJVcsStateLogger.LOCAL_CHANGED_FILES_COUNT; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private static final PrimitiveEventField<String> VCS_STATE_ID = EventFields.AnonymizedId; @NotNull private static final LongEventField TIMESTAMP_MS = EventFields.Long$default("timestamp_ms", null, 2, null); @NotNull private static final EventField<String> ORIGIN_URL = EventFields.AnonymizedField$default("origin_url", null, 2, null); @NotNull private static final IntEventField USERS_COUNT = EventFields.Int("users_count"); @NotNull private static final IntEventField LOCAL_CHANGED_FILES_COUNT = EventFields.Int("local_changed_files_count");
/*    */   
/*    */   @NotNull
/*    */   private final VarargEventId VCS_LOG;
/*    */   
/*    */   public AbstractEJVcsStateLogger() {
/* 35 */     EventField[] arrayOfEventField = new EventField[5]; arrayOfEventField[0] = (EventField)VCS_STATE_ID; arrayOfEventField[1] = (EventField)TIMESTAMP_MS; arrayOfEventField[2] = ORIGIN_URL; arrayOfEventField[3] = (EventField)USERS_COUNT; arrayOfEventField[4] = (EventField)LOCAL_CHANGED_FILES_COUNT; this.VCS_LOG = this.GROUP.registerVarargEvent("state.log", "Log vcs state data for Matterhorn EJ plugin", arrayOfEventField);
/*    */   }
/*    */   
/*    */   public final void logVcsState(@NotNull Project project, @NotNull UUID vcsStateId) {
/* 39 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(vcsStateId, "vcsStateId"); VcsState vcsData = getVcsData(project);
/*    */ 
/*    */ 
/*    */     
/* 43 */     EventPair[] arrayOfEventPair = new EventPair[5]; arrayOfEventPair[0] = VCS_STATE_ID.with(vcsStateId.toString()); arrayOfEventPair[1] = 
/* 44 */       TIMESTAMP_MS.with(Long.valueOf(System.currentTimeMillis()));
/* 45 */     if (vcsData == null || vcsData.getOriginUrl() == null || StringUtilKt.nullIfEmpty(vcsData.getOriginUrl()) == null) StringUtilKt.nullIfEmpty(vcsData.getOriginUrl());  2[ORIGIN_URL] = StringUtilKt.nullIfEmpty(vcsData.getOriginUrl()).with("unknown");
/* 46 */     arrayOfEventPair[3] = USERS_COUNT.with(Integer.valueOf(StatisticsUtil.roundToPowerOfTwo((vcsData != null) ? vcsData.getUsersCount() : 0)));
/* 47 */     arrayOfEventPair[4] = LOCAL_CHANGED_FILES_COUNT.with(Integer.valueOf(StatisticsUtil.roundToPowerOfTwo((vcsData != null) ? vcsData.getLocalChangedFiles() : 0)));
/*    */     project.log((Project)arrayOfEventPair, arrayOfEventPair);
/*    */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\r\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001B!\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\005¢\006\004\b\007\020\bJ\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\005HÆ\003J\t\020\020\032\0020\005HÆ\003J'\020\021\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\005HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\001HÖ\003J\t\020\025\032\0020\005HÖ\001J\t\020\026\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\fR\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\r\020\f¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJVcsStateLogger$VcsState;", "", "originUrl", "", "usersCount", "", "localChangedFiles", "<init>", "(Ljava/lang/String;II)V", "getOriginUrl", "()Ljava/lang/String;", "getUsersCount", "()I", "getLocalChangedFiles", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ej-core"})
/*    */   public static final class VcsState { @NotNull
/* 51 */     private final String originUrl; private final int usersCount; private final int localChangedFiles; public VcsState(@NotNull String originUrl, int usersCount, int localChangedFiles) { this.originUrl = originUrl; this.usersCount = usersCount; this.localChangedFiles = localChangedFiles; } @NotNull public final String getOriginUrl() { return this.originUrl; } @NotNull public final String component1() { return this.originUrl; } public final int component2() { return this.usersCount; } public final int getUsersCount() { return this.usersCount; } public final int component3() { return this.localChangedFiles; } @NotNull public final VcsState copy(@NotNull String originUrl, int usersCount, int localChangedFiles) { Intrinsics.checkNotNullParameter(originUrl, "originUrl"); return new VcsState(originUrl, usersCount, localChangedFiles); } public final int getLocalChangedFiles() { return this.localChangedFiles; } @NotNull public String toString() { return "VcsState(originUrl=" + this.originUrl + ", usersCount=" + this.usersCount + ", localChangedFiles=" + this.localChangedFiles + ")"; }
/*    */     public int hashCode() { result = this.originUrl.hashCode(); result = result * 31 + Integer.hashCode(this.usersCount); return result * 31 + Integer.hashCode(this.localChangedFiles); }
/*    */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof VcsState)) return false;  VcsState vcsState = (VcsState)other; return !Intrinsics.areEqual(this.originUrl, vcsState.originUrl) ? false : ((this.usersCount != vcsState.usersCount) ? false : (!(this.localChangedFiles != vcsState.localChangedFiles))); } }
/* 54 */   private final VcsState getVcsData(Project project) { if (!TrustedProjects.isTrusted(project)) return null;
/*    */     
/* 56 */     Intrinsics.checkNotNullExpressionValue(ChangeListManager.getInstance(project), "getInstance(...)"); ChangeListManager manager = ChangeListManager.getInstance(project);
/* 57 */     Intrinsics.checkNotNullExpressionValue(manager.getAllChanges(), "getAllChanges(...)"); Iterable $this$map$iv = manager.getAllChanges(); int $i$f$map = 0;
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
/* 75 */     Iterable iterable1 = $this$map$iv; Collection<VirtualFile> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 76 */     for (Object item$iv$iv : iterable1) {
/* 77 */       Change change = (Change)item$iv$iv; Collection<VirtualFile> collection = destination$iv$iv; int $i$a$-map-AbstractEJVcsStateLogger$getVcsData$localChangedFiles$1 = 0; collection.add(change.getVirtualFile());
/* 78 */     }  int localChangedFiles = CollectionsKt.distinct(destination$iv$iv).size();
/*    */     VcsProjectLog projectLog = VcsProjectLog.Companion.getInstance(project);
/*    */     VcsLogData logData = projectLog.getDataManager();
/*    */     int i = 0;
/*    */     if (logData != null) {
/*    */       Intrinsics.checkNotNullExpressionValue(logData.getDataPack(), "getDataPack(...)");
/*    */       DataPack dataPack = logData.getDataPack();
/*    */       if (dataPack.isFull())
/*    */         i = logData.getAllUsers().size(); 
/*    */     } 
/*    */     ProjectUtil.guessProjectDir(project);
/*    */     if (ProjectOriginKt.getProjectOriginUrl((ProjectUtil.guessProjectDir(project) != null) ? ProjectUtil.guessProjectDir(project).toNioPath() : null) == null)
/*    */       ProjectOriginKt.getProjectOriginUrl((ProjectUtil.guessProjectDir(project) != null) ? ProjectUtil.guessProjectDir(project).toNioPath() : null); 
/*    */     String originUrl = "";
/*    */     return new VcsState(originUrl, i, localChangedFiles); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\statistics\AbstractEJVcsStateLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */