/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.debug;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContextFileLoggingListener;
/*     */ import java.util.List;
/*     */ import kotlin.coroutines.Continuation;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\r\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\006\n\002\030\002\n\002\b\002\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\032\020$\032\0020%2\020\020&\032\f\022\b\022\0060\"j\002`#0!H\002J\016\020'\032\0020%2\006\020(\032\0020\013J\006\020)\032\0020%J\016\020*\032\0020%2\006\020+\032\0020,J\006\020-\032\0020%R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\032\020\b\032\016\022\n\022\b\022\004\022\0020\0130\n0\tX\004¢\006\002\n\000R\035\020\f\032\016\022\n\022\b\022\004\022\0020\0130\n0\t8F¢\006\006\032\004\b\r\020\016R\026\020\017\032\n\022\006\022\004\030\0010\0130\tX\004¢\006\002\n\000R\031\020\020\032\n\022\006\022\004\030\0010\0130\t8F¢\006\006\032\004\b\021\020\016R \020\022\032\b\022\004\022\0020\0230\tX\016¢\006\016\n\000\032\004\b\024\020\016\"\004\b\025\020\026R \020\027\032\b\022\004\022\0020\0230\tX\016¢\006\016\n\000\032\004\b\030\020\016\"\004\b\031\020\026R \020\032\032\b\022\004\022\0020\0230\tX\016¢\006\016\n\000\032\004\b\033\020\016\"\004\b\034\020\026R \020\035\032\b\022\004\022\0020\0230\tX\016¢\006\016\n\000\032\004\b\036\020\016\"\004\b\037\020\026R\030\020 \032\f\022\b\022\0060\"j\002`#0!X\016¢\006\002\n\000¨\006."}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogViewModel;", "", "eventLogService", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogService;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogService;Lkotlinx/coroutines/CoroutineScope;)V", "_eventTree", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;", "eventTree", "getEventTree", "()Landroidx/compose/runtime/MutableState;", "_selectedNode", "selectedNode", "getSelectedNode", "filterLLMEvents", "", "getFilterLLMEvents", "setFilterLLMEvents", "(Landroidx/compose/runtime/MutableState;)V", "filterArtifactEvents", "getFilterArtifactEvents", "setFilterArtifactEvents", "filterStepEvents", "getFilterStepEvents", "setFilterStepEvents", "filterOtherEvents", "getFilterOtherEvents", "setFilterOtherEvents", "allEntries", "", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$LogEntry;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/LogEntry;", "updateEventTree", "", "entries", "selectNode", "node", "clearLog", "load", "path", "Ljava/nio/file/Path;", "refreshEventTree", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nEventLogViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLogViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n774#2:112\n865#2,2:113\n1557#2:115\n1628#2,3:116\n*S KotlinDebug\n*F\n+ 1 EventLogViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogViewModel\n*L\n60#1:112\n60#1:113,2\n85#1:115\n85#1:116,3\n*E\n"})
/*     */ public final class EventLogViewModel {
/*     */   @NotNull
/*     */   private final EventLogService eventLogService;
/*     */   @NotNull
/*     */   private final CoroutineScope scope;
/*     */   @NotNull
/*     */   private final MutableState<SnapshotStateList<EventNode>> _eventTree;
/*     */   @NotNull
/*     */   private final MutableState<EventNode> _selectedNode;
/*     */   @NotNull
/*     */   private MutableState<Boolean> filterLLMEvents;
/*     */   @NotNull
/*     */   private MutableState<Boolean> filterArtifactEvents;
/*     */   @NotNull
/*     */   private MutableState<Boolean> filterStepEvents;
/*     */   @NotNull
/*     */   private MutableState<Boolean> filterOtherEvents;
/*     */   @NotNull
/*     */   private List<RootExecutionContextFileLoggingListener.LogEntry> allEntries;
/*     */   public static final int $stable = 8;
/*     */   
/*  31 */   public EventLogViewModel(@NotNull EventLogService eventLogService, @NotNull CoroutineScope scope) { this.eventLogService = eventLogService;
/*  32 */     this.scope = scope;
/*     */     
/*  34 */     this._eventTree = SnapshotStateKt.mutableStateOf$default(new SnapshotStateList(), null, 2, null);
/*     */ 
/*     */     
/*  37 */     this._selectedNode = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
/*     */ 
/*     */ 
/*     */     
/*  41 */     this.filterLLMEvents = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(true), null, 2, null);
/*  42 */     this.filterArtifactEvents = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(true), null, 2, null);
/*  43 */     this.filterStepEvents = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(true), null, 2, null);
/*  44 */     this.filterOtherEvents = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(true), null, 2, null);
/*     */ 
/*     */ 
/*     */     
/*  48 */     BuildersKt.launch$default(this.scope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                 
/*  50 */                 this.label = 1; if (EventLogViewModel.this.eventLogService.getLogEntries().collect(new FlowCollector() {
/*  51 */                       public final Object emit(List entries, Continuation $completion) { EventLogViewModel.this.updateEventTree(entries);
/*  52 */                         return Unit.INSTANCE; } }, (Continuation)this) == object) return object;  EventLogViewModel.this.eventLogService.getLogEntries().collect(new FlowCollector() { public final Object emit(List entries, Continuation $completion) { EventLogViewModel.this.updateEventTree(entries); return Unit.INSTANCE; } }, (Continuation)this); throw new KotlinNothingValueException();
/*     */               case 1:
/*     */                 ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); throw new KotlinNothingValueException(); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */           public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(EventLogViewModel.this, $completion); }
/*  56 */           public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null); this.allEntries = CollectionsKt.emptyList(); }
/*     */   @NotNull public final MutableState<SnapshotStateList<EventNode>> getEventTree() { return this._eventTree; }
/*     */   @NotNull public final MutableState<EventNode> getSelectedNode() { return this._selectedNode; }
/*  59 */   @NotNull public final MutableState<Boolean> getFilterLLMEvents() { return this.filterLLMEvents; } public final void setFilterLLMEvents(@NotNull MutableState<Boolean> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.filterLLMEvents = <set-?>; } @NotNull public final MutableState<Boolean> getFilterArtifactEvents() { return this.filterArtifactEvents; } private final void updateEventTree(List<RootExecutionContextFileLoggingListener.LogEntry> entries) { this.allEntries = entries;
/*  60 */     Iterable<RootExecutionContextFileLoggingListener.LogEntry> $this$filter$iv = entries; int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 112 */     Iterable<RootExecutionContextFileLoggingListener.LogEntry> iterable1 = $this$filter$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 113 */     for (RootExecutionContextFileLoggingListener.LogEntry element$iv$iv : iterable1) { CustomArtifactEvent event; RootExecutionContextFileLoggingListener.LogEntry entry = element$iv$iv; int $i$a$-filter-EventLogViewModel$updateEventTree$filteredEntries$1 = 0; entry.getEventOrCastSerializedOrNull(); switch (WhenMappings.$EnumSwitchMapping$0[EventLogViewModelKt.getEventCategory(event).ordinal()]) { case 1: case 2: case 3: case 4: 
/* 114 */         default: throw new NoWhenBranchMatchedException(); }  }  List<RootExecutionContextFileLoggingListener.LogEntry> filteredEntries = (List)destination$iv$iv; this._eventTree.setValue(DebugEventsKt.buildEventTree(filteredEntries)); }
/* 115 */   public final void setFilterArtifactEvents(@NotNull MutableState<Boolean> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.filterArtifactEvents = <set-?>; } @NotNull public final MutableState<Boolean> getFilterStepEvents() { return this.filterStepEvents; } public final void setFilterStepEvents(@NotNull MutableState<Boolean> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.filterStepEvents = <set-?>; } @NotNull public final MutableState<Boolean> getFilterOtherEvents() { return this.filterOtherEvents; } public final void setFilterOtherEvents(@NotNull MutableState<Boolean> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.filterOtherEvents = <set-?>; } public final void selectNode(@NotNull EventNode node) { Intrinsics.checkNotNullParameter(node, "node"); this._selectedNode.setValue(node); } public final void clearLog() { ((SnapshotStateList)this._eventTree.getValue()).clear(); this._selectedNode.setValue(null); this.allEntries = CollectionsKt.emptyList(); } public final void load(@NotNull Path path) { Intrinsics.checkNotNullParameter(path, "path"); clearLog(); List eventsWithMetadata = SerializableEventJsonLogger.Companion.deserialize(path); List list1 = eventsWithMetadata; EventLogViewModel eventLogViewModel = this; int $i$f$map = 0; List list2 = list1; Collection<RootExecutionContextFileLoggingListener.LogEntry> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 116 */     for (Object item$iv$iv : list2) {
/* 117 */       SerializableEventWithMetadata serializableEventWithMetadata = (SerializableEventWithMetadata)item$iv$iv; Collection<RootExecutionContextFileLoggingListener.LogEntry> collection = destination$iv$iv; int $i$a$-map-EventLogViewModel$load$1 = 0; collection.add(new RootExecutionContextFileLoggingListener.LogEntry(null, serializableEventWithMetadata.getEvent(), serializableEventWithMetadata.getTimestampMs()));
/* 118 */     }  eventLogViewModel.updateEventTree((List<RootExecutionContextFileLoggingListener.LogEntry>)destination$iv$iv); }
/*     */ 
/*     */   
/*     */   public final void refreshEventTree() {
/*     */     updateEventTree(this.allEntries);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\debug\EventLogViewModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */