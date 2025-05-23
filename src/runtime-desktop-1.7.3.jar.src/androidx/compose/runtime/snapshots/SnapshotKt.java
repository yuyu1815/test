/*      */ package androidx.compose.runtime.snapshots;
/*      */ 
/*      */ import androidx.collection.MutableScatterSet;
/*      */ import androidx.collection.ScatterSet;
/*      */ import androidx.compose.runtime.AtomicInt;
/*      */ import androidx.compose.runtime.AtomicReference;
/*      */ import androidx.compose.runtime.SnapshotThreadLocal;
/*      */ import androidx.compose.runtime.SynchronizedObject;
/*      */ import androidx.compose.runtime.WeakReference;
/*      */ import androidx.compose.runtime.collection.ScatterSetWrapperKt;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Set;
/*      */ import kotlin.KotlinNothingValueException;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.PublishedApi;
/*      */ import kotlin.Unit;
/*      */ import kotlin.collections.CollectionsKt;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.internal.InlineMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Lambda;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\001\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\002\020\"\n\002\020\000\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\030\002\n\002\b\r\n\002\020$\n\002\030\002\n\002\b\005\n\002\020\001\n\002\b\007\n\002\030\002\n\002\b\031\n\002\030\002\n\002\b\n\032\b\020(\032\0020\bH\002\0326\020(\032\002H)\"\004\b\000\020)2!\020*\032\035\022\023\022\0210\016¢\006\f\b\017\022\b\b\020\022\004\b\b(\021\022\004\022\002H)0\rH\002¢\006\002\020+\032\b\020,\032\0020\bH\002\0324\020-\032\0020\0072\b\020.\032\004\030\0010\0072\026\b\002\020/\032\020\022\004\022\0020\006\022\004\022\0020\b\030\0010\r2\b\b\002\0200\032\00201H\002\032\037\0202\032\002H)\"\b\b\000\020)*\002032\006\0204\032\002H)H\001¢\006\002\0205\032'\0202\032\002H)\"\b\b\000\020)*\002032\006\0204\032\002H)2\006\0206\032\0020\007H\001¢\006\002\0207\032\b\0208\032\0020\007H\000\032L\0209\032\020\022\004\022\0020\006\022\004\022\0020\b\030\0010\r2\024\020/\032\020\022\004\022\0020\006\022\004\022\0020\b\030\0010\r2\024\020:\032\020\022\004\022\0020\006\022\004\022\0020\b\030\0010\r2\b\b\002\020;\032\00201H\002\032B\020<\032\020\022\004\022\0020\006\022\004\022\0020\b\030\0010\r2\024\020=\032\020\022\004\022\0020\006\022\004\022\0020\b\030\0010\r2\024\020:\032\020\022\004\022\0020\006\022\004\022\0020\b\030\0010\rH\002\032\030\020>\032\0020\b2\006\0206\032\0020\0072\006\020?\032\0020\024H\001\032.\020@\032\020\022\004\022\00203\022\004\022\00203\030\0010A2\006\0208\032\0020B2\006\020C\032\0020B2\006\020D\032\0020\016H\002\032\020\020E\032\002012\006\020?\032\0020\024H\002\032\020\020F\032\0020\b2\006\020?\032\0020\024H\002\032\b\020G\032\0020HH\002\0321\020I\032\004\030\001H)\"\b\b\000\020)*\002032\006\0204\032\002H)2\006\020J\032\0020\0012\006\020\021\032\0020\016H\002¢\006\002\020K\032\020\020L\032\0020\b2\006\020M\032\0020\001H\000\032\b\020N\032\0020HH\002\032%\020O\032\002H)\"\004\b\000\020)2\f\020*\032\b\022\004\022\002H)0PH\bø\001\000¢\006\002\020Q\032>\020R\032\002H)\"\004\b\000\020)2\006\020S\032\0020\0072!\020*\032\035\022\023\022\0210\016¢\006\f\b\017\022\b\b\020\022\004\b\b(\021\022\004\022\002H)0\rH\002¢\006\002\020T\032:\020U\032\002H)\"\b\b\000\020)*\0020\0072!\020*\032\035\022\023\022\0210\016¢\006\f\b\017\022\b\b\020\022\004\b\b(\021\022\004\022\002H)0\rH\002¢\006\002\020V\032\030\020W\032\0020\0012\006\020J\032\0020\0012\006\020\021\032\0020\016H\000\032\022\020X\032\004\030\001032\006\020?\032\0020\024H\002\032 \020Y\032\002012\006\020Z\032\002032\006\0206\032\0020\0012\006\020\021\032\0020\016H\002\032 \020Y\032\002012\006\0208\032\0020\0012\006\020[\032\0020\0012\006\020\021\032\0020\016H\002\032\020\020\\\032\0020\b2\006\0206\032\0020\007H\002\032\034\020]\032\0020\016*\0020\0162\006\020^\032\0020\0012\006\020_\032\0020\001H\000\032!\020`\032\00203*\002032\022\020a\032\016\022\004\022\00203\022\004\022\002010\rH\b\032#\020b\032\002H)\"\b\b\000\020)*\00203*\002H)2\006\020?\032\0020\024H\000¢\006\002\020c\032+\020d\032\002H)\"\b\b\000\020)*\00203*\002H)2\006\020?\032\0020\0242\006\0206\032\0020\007H\000¢\006\002\020e\032+\020f\032\002H)\"\b\b\000\020)*\00203*\002H)2\006\020?\032\0020\0242\006\0206\032\0020\007H\002¢\006\002\020e\032N\020g\032\002Hh\"\b\b\000\020)*\00203\"\004\b\001\020h*\002H)2\006\020?\032\0020\0242\006\020i\032\002H)2\027\020*\032\023\022\004\022\002H)\022\004\022\002Hh0\r¢\006\002\bjH\bø\001\000¢\006\002\020k\0323\020l\032\002H)\"\b\b\000\020)*\00203*\002H)2\006\020?\032\0020\0242\006\0206\032\0020\0072\006\020i\032\002H)H\000¢\006\002\020m\032!\020I\032\002H)\"\b\b\000\020)*\00203*\002H)2\006\020?\032\0020\024¢\006\002\020c\032)\020I\032\002H)\"\b\b\000\020)*\00203*\002H)2\006\020?\032\0020\0242\006\0206\032\0020\007¢\006\002\020e\032H\020n\032\002Hh\"\b\b\000\020)*\00203\"\004\b\001\020h*\002H)2!\020*\032\035\022\023\022\021H)¢\006\f\b\017\022\b\b\020\022\004\b\b(4\022\004\022\002Hh0\rH\bø\001\000¢\006\002\020o\032F\020p\032\002Hh\"\b\b\000\020)*\00203\"\004\b\001\020h*\002H)2\006\020?\032\0020\0242\027\020*\032\023\022\004\022\002H)\022\004\022\002Hh0\r¢\006\002\bjH\bø\001\000¢\006\002\020q\032N\020p\032\002Hh\"\b\b\000\020)*\00203\"\004\b\001\020h*\002H)2\006\020?\032\0020\0242\006\0206\032\0020\0072\027\020*\032\023\022\004\022\002H)\022\004\022\002Hh0\r¢\006\002\bjH\bø\001\000¢\006\002\020r\032+\020s\032\002H)\"\b\b\000\020)*\00203*\002H)2\006\020?\032\0020\0242\006\0206\032\0020\007H\001¢\006\002\020e\"\016\020\000\032\0020\001XT¢\006\002\n\000\",\020\002\032 \022\034\022\032\022\n\022\b\022\004\022\0020\0060\005\022\004\022\0020\007\022\004\022\0020\b0\0040\003X\016¢\006\002\n\000\"\024\020\t\032\b\022\004\022\0020\0130\nX\004¢\006\002\n\000\")\020\f\032\035\022\023\022\0210\016¢\006\f\b\017\022\b\b\020\022\004\b\b(\021\022\004\022\0020\b0\rX\004¢\006\002\n\000\"\024\020\022\032\b\022\004\022\0020\0240\023X\004¢\006\002\n\000\" \020\025\032\024\022\020\022\016\022\004\022\0020\006\022\004\022\0020\b0\r0\003X\016¢\006\002\n\000\"\034\020\026\032\0020\0278\000X\004¢\006\016\n\000\022\004\b\030\020\031\032\004\b\032\020\033\"\016\020\034\032\0020\001X\016¢\006\002\n\000\"\016\020\035\032\0020\016X\016¢\006\002\n\000\"\016\020\036\032\0020\037X\016¢\006\002\n\000\"\016\020 \032\0020!X\004¢\006\002\n\000\"\034\020\"\032\0020\0078\000X\004¢\006\016\n\000\022\004\b#\020\031\032\004\b$\020%\"\024\020&\032\b\022\004\022\0020\0070'X\004¢\006\002\n\000\002\007\n\005\b20\001¨\006t"}, d2 = {"INVALID_SNAPSHOT", "", "applyObservers", "", "Lkotlin/Function2;", "", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "currentGlobalSnapshot", "Landroidx/compose/runtime/AtomicReference;", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "emptyLambda", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "Lkotlin/ParameterName;", "name", "invalid", "extraStateObjects", "Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "globalWriteObservers", "lock", "Landroidx/compose/runtime/SynchronizedObject;", "getLock$annotations", "()V", "getLock", "()Landroidx/compose/runtime/SynchronizedObject;", "nextSnapshotId", "openSnapshots", "pendingApplyObserverCount", "Landroidx/compose/runtime/AtomicInt;", "pinningTable", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "snapshotInitializer", "getSnapshotInitializer$annotations", "getSnapshotInitializer", "()Landroidx/compose/runtime/snapshots/Snapshot;", "threadSnapshot", "Landroidx/compose/runtime/SnapshotThreadLocal;", "advanceGlobalSnapshot", "T", "block", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "checkAndOverwriteUnusedRecordsLocked", "createTransparentSnapshotWithNoParentReadObserver", "previousSnapshot", "readObserver", "ownsPreviousSnapshot", "", "current", "Landroidx/compose/runtime/snapshots/StateRecord;", "r", "(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "snapshot", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "currentSnapshot", "mergedReadObserver", "parentObserver", "mergeReadObserver", "mergedWriteObserver", "writeObserver", "notifyWrite", "state", "optimisticMerges", "", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "applyingSnapshot", "invalidSnapshots", "overwriteUnusedRecordsLocked", "processForUnusedRecordsLocked", "readError", "", "readable", "id", "(Landroidx/compose/runtime/snapshots/StateRecord;ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/StateRecord;", "releasePinningLocked", "handle", "reportReadonlySnapshotWrite", "sync", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "takeNewGlobalSnapshot", "previousGlobalSnapshot", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "takeNewSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "trackPinning", "usedLocked", "valid", "data", "candidateSnapshot", "validateOpen", "addRange", "from", "until", "findYoungestOr", "predicate", "newOverwritableRecordLocked", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecordLocked", "overwritable", "R", "candidate", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "overwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "withCurrent", "(Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writableRecord", "runtime"})
/*      */ @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2432:1\n1844#1:2433\n1844#1:2436\n1844#1:2438\n1844#1:2446\n1844#1:2475\n1844#1:2477\n2164#1,9:2479\n1844#1:2516\n1844#1:2518\n1844#1:2520\n1844#1:2522\n1844#1:2525\n1844#1:2527\n1844#1:2556\n26#2:2434\n26#2:2435\n26#2:2437\n26#2:2439\n26#2:2447\n26#2:2476\n26#2:2478\n26#2:2517\n26#2:2519\n26#2:2521\n26#2:2523\n26#2:2526\n26#2:2528\n26#2:2557\n33#3,6:2440\n267#4,4:2448\n237#4,7:2452\n248#4,3:2460\n251#4,2:2464\n272#4,2:2466\n254#4,6:2468\n274#4:2474\n267#4,4:2529\n237#4,7:2533\n248#4,3:2541\n251#4,2:2545\n272#4,2:2547\n254#4,6:2549\n274#4:2555\n1810#5:2459\n1672#5:2463\n1810#5:2540\n1672#5:2544\n127#6,28:2488\n1#7:2524\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n721#1:2433\n1905#1:2436\n1931#1:2438\n1953#1:2446\n1983#1:2475\n2036#1:2477\n2146#1:2479,9\n2200#1:2516\n2226#1:2518\n2235#1:2520\n2303#1:2522\n2315#1:2525\n2343#1:2527\n2408#1:2556\n721#1:2434\n1844#1:2435\n1905#1:2437\n1931#1:2439\n1953#1:2447\n1983#1:2476\n2036#1:2478\n2200#1:2517\n2226#1:2519\n2235#1:2521\n2303#1:2523\n2315#1:2526\n2343#1:2528\n2408#1:2557\n1945#1:2440,6\n1955#1:2448,4\n1955#1:2452,7\n1955#1:2460,3\n1955#1:2464,2\n1955#1:2466,2\n1955#1:2468,6\n1955#1:2474\n2366#1:2529,4\n2366#1:2533,7\n2366#1:2541,3\n2366#1:2545,2\n2366#1:2547,2\n2366#1:2549,6\n2366#1:2555\n1955#1:2459\n1955#1:2463\n2366#1:2540\n2366#1:2544\n2176#1:2488,28\n*E\n"})
/*      */ public final class SnapshotKt
/*      */ {
/*      */   public static final void releasePinningLocked(int handle) {
/*      */     pinningTable.remove(handle);
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public static final Snapshot currentSnapshot() {
/*      */     if ((Snapshot)threadSnapshot.get() == null)
/*      */       (Snapshot)threadSnapshot.get(); 
/*      */     return (Snapshot)currentGlobalSnapshot.get();
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   private static final Function1<SnapshotIdSet, Unit> emptyLambda = SnapshotKt$emptyLambda$1.INSTANCE;
/*      */   private static final int INVALID_SNAPSHOT = 0;
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invoke"})
/*      */   static final class SnapshotKt$emptyLambda$1
/*      */     extends Lambda
/*      */     implements Function1<SnapshotIdSet, Unit>
/*      */   {
/*      */     public static final SnapshotKt$emptyLambda$1 INSTANCE = new SnapshotKt$emptyLambda$1();
/*      */     
/*      */     SnapshotKt$emptyLambda$1() {
/*      */       super(1);
/*      */     }
/*      */     
/*      */     public final void invoke(@NotNull SnapshotIdSet it) {
/*      */       Intrinsics.checkNotNullParameter(it, "it");
/*      */     }
/*      */   }
/*      */   
/*      */   private static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot previousSnapshot, Function1<Object, Unit> readObserver, boolean ownsPreviousSnapshot) {
/*      */     return (previousSnapshot instanceof MutableSnapshot || previousSnapshot == null) ? new TransparentObserverMutableSnapshot((previousSnapshot instanceof MutableSnapshot) ? (MutableSnapshot)previousSnapshot : null, readObserver, null, false, ownsPreviousSnapshot) : new TransparentObserverSnapshot(previousSnapshot, readObserver, false, ownsPreviousSnapshot);
/*      */   }
/*      */   
/*      */   private static final Function1<Object, Unit> mergedReadObserver(Function1<Object, Unit> readObserver, Function1 parentObserver, boolean mergeReadObserver) {
/*      */     Function1<Object, Unit> function1 = mergeReadObserver ? parentObserver : null;
/*      */     if (readObserver == null);
/*      */     return (readObserver != null && function1 != null && readObserver != function1) ? new SnapshotKt$mergedReadObserver$1(readObserver, function1) : function1;
/*      */   }
/*      */   
/*      */   public static final int trackPinning(int id, @NotNull SnapshotIdSet invalid) {
/*  720 */     Intrinsics.checkNotNullParameter(invalid, "invalid"); int pinned = invalid.lowest(id);
/*  721 */     int $i$f$sync = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2433 */     SynchronizedObject lock$iv$iv = getLock(); int $i$f$synchronized = 0;
/* 2434 */     synchronized (lock$iv$iv) { int $i$a$-sync-SnapshotKt$trackPinning$1 = 0; $i$a$-sync-SnapshotKt$trackPinning$1 = pinningTable.add(pinned); }  return $i$a$-sync-SnapshotKt$trackPinning$1;
/* 2435 */   } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\000\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "state", "", "invoke"}) static final class SnapshotKt$mergedReadObserver$1 extends Lambda implements Function1<Object, Unit> { public final void invoke(@NotNull Object state) { Intrinsics.checkNotNullParameter(state, "state"); this.$readObserver.invoke(state); this.$parentObserver.invoke(state); } SnapshotKt$mergedReadObserver$1(Function1<Object, Unit> $readObserver, Function1<Object, Unit> $parentObserver) { super(1); } } private static final Function1<Object, Unit> mergedWriteObserver(Function1<Object, Unit> writeObserver, Function1<Object, Unit> parentObserver) { if (writeObserver == null); return (writeObserver != null && parentObserver != null && writeObserver != parentObserver) ? new SnapshotKt$mergedWriteObserver$1(writeObserver, parentObserver) : parentObserver; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\000\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "state", "", "invoke"}) static final class SnapshotKt$mergedWriteObserver$1 extends Lambda implements Function1<Object, Unit> { public final void invoke(@NotNull Object state) { Intrinsics.checkNotNullParameter(state, "state"); this.$writeObserver.invoke(state); this.$parentObserver.invoke(state); } SnapshotKt$mergedWriteObserver$1(Function1<Object, Unit> $writeObserver, Function1<Object, Unit> $parentObserver) { super(1); } } @NotNull private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal(); @NotNull private static final SynchronizedObject lock = new SynchronizedObject(); @NotNull public static final SynchronizedObject getLock() { return lock; } @PublishedApi public static final <T> T sync(@NotNull Function0 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$sync = 0; SynchronizedObject lock$iv = getLock(); int $i$f$synchronized = 0; SynchronizedObject synchronizedObject1 = lock$iv; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ try { Object object = block.invoke(); } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }  return (T)object; } @NotNull private static SnapshotIdSet openSnapshots = SnapshotIdSet.Companion.getEMPTY(); private static int nextSnapshotId = 2; @NotNull private static final SnapshotDoubleIndexHeap pinningTable = new SnapshotDoubleIndexHeap(); @NotNull private static final SnapshotWeakSet<StateObject> extraStateObjects = new SnapshotWeakSet<>(); @NotNull private static List<? extends Function2<? super Set<? extends Object>, ? super Snapshot, Unit>> applyObservers = CollectionsKt.emptyList(); @NotNull private static List<? extends Function1<Object, Unit>> globalWriteObservers = CollectionsKt.emptyList(); @NotNull private static final AtomicReference<GlobalSnapshot> currentGlobalSnapshot; @NotNull private static final Snapshot snapshotInitializer; @NotNull private static AtomicInt pendingApplyObserverCount; static { int i = nextSnapshotId; nextSnapshotId = i + 1; GlobalSnapshot globalSnapshot1 = new GlobalSnapshot(i, SnapshotIdSet.Companion.getEMPTY()); GlobalSnapshot it = globalSnapshot1; int $i$a$-also-SnapshotKt$currentGlobalSnapshot$1 = 0; openSnapshots = openSnapshots.set(it.getId()); GlobalSnapshot globalSnapshot2 = globalSnapshot1; currentGlobalSnapshot = new AtomicReference(globalSnapshot2); snapshotInitializer = (Snapshot)currentGlobalSnapshot.get(); pendingApplyObserverCount = new AtomicInt(0); } @NotNull public static final Snapshot getSnapshotInitializer() { return snapshotInitializer; }
/* 2436 */   private static final <T> T takeNewGlobalSnapshot(Snapshot previousGlobalSnapshot, Function1 block) { Object result = block.invoke(openSnapshots.clear(previousGlobalSnapshot.getId())); int $i$f$sync = 0; SynchronizedObject lock$iv$iv = getLock(); int $i$f$synchronized = 0;
/* 2437 */     synchronized (lock$iv$iv) { int $i$a$-sync-SnapshotKt$takeNewGlobalSnapshot$1 = 0; int i = nextSnapshotId; nextSnapshotId = i + 1; int globalId = i; openSnapshots = openSnapshots.clear(previousGlobalSnapshot.getId()); currentGlobalSnapshot.set(new GlobalSnapshot(globalId, openSnapshots)); previousGlobalSnapshot.dispose(); openSnapshots = openSnapshots.set(globalId); Unit unit = Unit.INSTANCE; }
/* 2438 */      return (T)result; } private static final <T> T advanceGlobalSnapshot(Function1<? super SnapshotIdSet, ? extends Object> block) { Object previousGlobalSnapshot = null; Intrinsics.checkNotNull(snapshotInitializer, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot"); previousGlobalSnapshot = snapshotInitializer; Object<StateObject> modified = null; int $i$f$sync = 0; SynchronizedObject lock$iv$iv = getLock(); int i = 0;
/* 2439 */     synchronized (lock$iv$iv) { int $i$a$-sync-SnapshotKt$advanceGlobalSnapshot$result$1 = 0; previousGlobalSnapshot = currentGlobalSnapshot.get(); modified = (Object<StateObject>)((GlobalSnapshot)previousGlobalSnapshot).getModified$runtime(); if (modified != null) pendingApplyObserverCount.add(1);  Object object = takeNewGlobalSnapshot((Snapshot)previousGlobalSnapshot, block); }  Object result = object; Object<StateObject> object1 = modified; int $i$a$-let-SnapshotKt$advanceGlobalSnapshot$1 = 0; 
/*      */     try { List<? extends Function2<? super Set<? extends Object>, ? super Snapshot, Unit>> observers = applyObservers; List<? extends Function2<? super Set<? extends Object>, ? super Snapshot, Unit>> $this$fastForEach$iv = observers; int $i$f$fastForEach = 0;
/* 2441 */       int index$iv = 0, j = $this$fastForEach$iv.size(); if (index$iv < j) {
/* 2442 */         Object<? super Set<? extends Object>, ? super Snapshot, Unit> item$iv = (Object<? super Set<? extends Object>, ? super Snapshot, Unit>)$this$fastForEach$iv.get(index$iv);
/* 2443 */         Function2 observer = (Function2)item$iv; int $i$a$-fastForEach-SnapshotKt$advanceGlobalSnapshot$1$1 = 0; observer.invoke(ScatterSetWrapperKt.wrapIntoSet((ScatterSet)object1), previousGlobalSnapshot);
/*      */       }  }
/*      */     finally { pendingApplyObserverCount.add(-1); }
/* 2446 */      $i$f$sync = 0; lock$iv$iv = getLock(); int $i$f$synchronized = 0;
/* 2447 */     synchronized (lock$iv$iv) { int $i$a$-sync-SnapshotKt$advanceGlobalSnapshot$2 = 0; checkAndOverwriteUnusedRecordsLocked(); ScatterSet this_$iv = (ScatterSet)modified;
/*      */       int $i$f$forEach = 0;
/* 2449 */       Object[] k$iv = this_$iv.elements;
/*      */       
/* 2451 */       ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */       
/* 2453 */       long[] m$iv$iv = this_$iv$iv.metadata;
/* 2454 */       int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */       
/* 2456 */       int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 2457 */           long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 2458 */           long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 2459 */           if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 2460 */           { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 2461 */             for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 2470 */             if (bitCount$iv$iv == 8)
/*      */               continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 453
/*      */         }  }
/*      */       else {  }
/* 2474 */        Unit unit = (modified != null) ? Unit.INSTANCE : null; }  return (T)result; } private static final void advanceGlobalSnapshot() { advanceGlobalSnapshot(SnapshotKt$advanceGlobalSnapshot$3.INSTANCE); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invoke"}) static final class SnapshotKt$advanceGlobalSnapshot$3 extends Lambda implements Function1<SnapshotIdSet, Unit> {
/* 2475 */     public static final SnapshotKt$advanceGlobalSnapshot$3 INSTANCE = new SnapshotKt$advanceGlobalSnapshot$3(); SnapshotKt$advanceGlobalSnapshot$3() { super(1); } public final void invoke(@NotNull SnapshotIdSet it) { Intrinsics.checkNotNullParameter(it, "it"); } } private static final <T extends Snapshot> T takeNewSnapshot(Function1<? super SnapshotIdSet, ? extends T> block) { return (T)advanceGlobalSnapshot(new SnapshotKt$takeNewSnapshot$1(block)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\002H\001\"\b\b\000\020\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "T", "Landroidx/compose/runtime/snapshots/Snapshot;", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invoke", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/Snapshot;"}) @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt$takeNewSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n*L\n1#1,2432:1\n1844#2:2433\n26#3:2434\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt$takeNewSnapshot$1\n*L\n1966#1:2433\n1966#1:2434\n*E\n"}) static final class SnapshotKt$takeNewSnapshot$1 extends Lambda implements Function1<SnapshotIdSet, T> { @NotNull public final T invoke(@NotNull SnapshotIdSet invalid) { Intrinsics.checkNotNullParameter(invalid, "invalid"); Snapshot result = (Snapshot)this.$block.invoke(invalid); int $i$f$sync = 0; SynchronizedObject lock$iv$iv = SnapshotKt.getLock(); int $i$f$synchronized = 0; synchronized (lock$iv$iv) { int $i$a$-sync-SnapshotKt$takeNewSnapshot$1$1 = 0; SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(result.getId()); Unit unit = Unit.INSTANCE; }  return (T)result; } SnapshotKt$takeNewSnapshot$1(Function1<SnapshotIdSet, T> $block) { super(1); } } private static final void validateOpen(Snapshot snapshot) { SnapshotIdSet openSnapshots = SnapshotKt.openSnapshots; if (!openSnapshots.get(snapshot.getId())) { (snapshot instanceof MutableSnapshot) ? snapshot : null; StringBuilder stringBuilder = (new StringBuilder()).append("Snapshot is not open: id=").append(snapshot.getId()).append(", disposed=").append(snapshot.getDisposed$runtime()).append(", applied=").append((((snapshot instanceof MutableSnapshot) ? snapshot : null) != null) ? Boolean.valueOf(((snapshot instanceof MutableSnapshot) ? snapshot : null).getApplied$runtime()) : "read-only").append(", lowestPin="); int $i$f$sync = 0; SynchronizedObject lock$iv$iv = getLock(); int $i$f$synchronized = 0;
/* 2476 */       synchronized (lock$iv$iv) { int $i$a$-sync-SnapshotKt$validateOpen$1 = 0; $i$a$-sync-SnapshotKt$validateOpen$1 = pinningTable.lowestOrDefault(-1); }  int i = $i$a$-sync-SnapshotKt$validateOpen$1; String str = stringBuilder.append(i).toString(); throw new IllegalStateException(str.toString()); }  } private static final boolean valid(int currentSnapshot, int candidateSnapshot, SnapshotIdSet invalid) { return (candidateSnapshot != 0 && candidateSnapshot <= currentSnapshot && !invalid.get(candidateSnapshot)); } private static final boolean valid(StateRecord data, int snapshot, SnapshotIdSet invalid) { return valid(snapshot, data.getSnapshotId$runtime(), invalid); } private static final <T extends StateRecord> T readable(StateRecord r, int id, SnapshotIdSet invalid) { StateRecord current = r; StateRecord candidate = null; while (current != null) { if (valid(current, id, invalid)) candidate = (candidate == null) ? current : ((candidate.getSnapshotId$runtime() < current.getSnapshotId$runtime()) ? current : candidate);  current = current.getNext$runtime(); }  if (candidate != null) return (T)candidate;  return null; }
/* 2477 */   @NotNull public static final <T extends StateRecord> T readable(@NotNull StateRecord $this$readable, @NotNull StateObject state) { Intrinsics.checkNotNullParameter($this$readable, "<this>"); Intrinsics.checkNotNullParameter(state, "state"); Snapshot snapshot = Snapshot.Companion.getCurrent(); if (snapshot.getReadObserver() != null) { snapshot.getReadObserver().invoke(state); } else { snapshot.getReadObserver(); }  if (readable($this$readable, snapshot.getId(), snapshot.getInvalid$runtime()) == null) { readable($this$readable, snapshot.getId(), snapshot.getInvalid$runtime()); int $i$f$sync = 0; SynchronizedObject lock$iv$iv = getLock(); int $i$f$synchronized = 0;
/* 2478 */       synchronized (lock$iv$iv) { StateRecord stateRecord; int $i$a$-sync-SnapshotKt$readable$1 = 0; Snapshot syncSnapshot = Snapshot.Companion.getCurrent(); Intrinsics.checkNotNull(state.getFirstStateRecord(), "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9"); if (readable(state.getFirstStateRecord(), syncSnapshot.getId(), syncSnapshot.getInvalid$runtime()) == null) { readable(state.getFirstStateRecord(), syncSnapshot.getId(), syncSnapshot.getInvalid$runtime()); readError(); throw new KotlinNothingValueException(); }
/*      */          }
/*      */        }
/*      */      return (T)readable($this$readable, snapshot.getId(), snapshot.getInvalid$runtime()); }
/*      */   @NotNull public static final <T extends StateRecord> T readable(@NotNull StateRecord $this$readable, @NotNull StateObject state, @NotNull Snapshot snapshot) { Intrinsics.checkNotNullParameter($this$readable, "<this>"); Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(snapshot, "snapshot"); if (snapshot.getReadObserver() != null) { snapshot.getReadObserver().invoke(state); }
/*      */     else
/*      */     { snapshot.getReadObserver(); }
/*      */      if (readable($this$readable, snapshot.getId(), snapshot.getInvalid$runtime()) == null) {
/*      */       readable($this$readable, snapshot.getId(), snapshot.getInvalid$runtime()); readError(); throw new KotlinNothingValueException();
/*      */     }  return (T)readable($this$readable, snapshot.getId(), snapshot.getInvalid$runtime()); }
/* 2488 */   private static final Void readError() { throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString()); } private static final void checkAndOverwriteUnusedRecordsLocked() { SnapshotWeakSet<StateObject> this_$iv = extraStateObjects; int $i$f$removeIf = 0; int size$iv = this_$iv.getSize$runtime();
/* 2489 */     int currentUsed$iv = 0;
/*      */     
/*      */     int i$iv;
/* 2492 */     for (i$iv = 0; i$iv < size$iv; i$iv++) {
/* 2493 */       WeakReference<T> entry$iv = this_$iv.getValues$runtime()[i$iv];
/* 2494 */       Object value$iv = (entry$iv != null) ? entry$iv.get() : null;
/* 2495 */       if (value$iv != null) { StateObject it = (StateObject)value$iv; int $i$a$-removeIf-SnapshotKt$checkAndOverwriteUnusedRecordsLocked$1 = 0; if (!(!overwriteUnusedRecordsLocked(it) ? 1 : 0)) {
/*      */           
/* 2497 */           if (currentUsed$iv != i$iv) {
/* 2498 */             this_$iv.getValues$runtime()[currentUsed$iv] = entry$iv;
/* 2499 */             this_$iv.getHashes$runtime()[currentUsed$iv] = this_$iv.getHashes$runtime()[i$iv];
/*      */           } 
/* 2501 */           currentUsed$iv++;
/*      */         }  }
/*      */     
/*      */     } 
/*      */     
/* 2506 */     for (i$iv = currentUsed$iv; i$iv < size$iv; i$iv++) {
/* 2507 */       this_$iv.getValues$runtime()[i$iv] = null;
/* 2508 */       this_$iv.getHashes$runtime()[i$iv] = 0;
/*      */     } 
/*      */ 
/*      */     
/* 2512 */     if (currentUsed$iv != size$iv)
/* 2513 */       this_$iv.setSize$runtime(currentUsed$iv);  }
/*      */   private static final StateRecord usedLocked(StateObject state) { StateRecord current = state.getFirstStateRecord(); StateRecord validRecord = null; int reuseLimit = pinningTable.lowestOrDefault(nextSnapshotId) - 1; SnapshotIdSet invalid = SnapshotIdSet.Companion.getEMPTY(); while (current != null) { int currentId = current.getSnapshotId$runtime(); if (currentId == 0) return current;  if (valid(current, reuseLimit, invalid)) if (validRecord == null) { validRecord = current; } else { return (current.getSnapshotId$runtime() < validRecord.getSnapshotId$runtime()) ? current : validRecord; }   current = current.getNext$runtime(); }  return null; }
/*      */   private static final boolean overwriteUnusedRecordsLocked(StateObject state) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: invokeinterface getFirstStateRecord : ()Landroidx/compose/runtime/snapshots/StateRecord;
/*      */     //   6: astore_1
/*      */     //   7: aconst_null
/*      */     //   8: astore_2
/*      */     //   9: aconst_null
/*      */     //   10: astore_3
/*      */     //   11: getstatic androidx/compose/runtime/snapshots/SnapshotKt.pinningTable : Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;
/*      */     //   14: getstatic androidx/compose/runtime/snapshots/SnapshotKt.nextSnapshotId : I
/*      */     //   17: invokevirtual lowestOrDefault : (I)I
/*      */     //   20: istore #4
/*      */     //   22: iconst_0
/*      */     //   23: istore #5
/*      */     //   25: aload_1
/*      */     //   26: ifnull -> 197
/*      */     //   29: aload_1
/*      */     //   30: invokevirtual getSnapshotId$runtime : ()I
/*      */     //   33: istore #6
/*      */     //   35: iload #6
/*      */     //   37: ifeq -> 189
/*      */     //   40: iload #6
/*      */     //   42: iload #4
/*      */     //   44: if_icmpge -> 186
/*      */     //   47: aload_3
/*      */     //   48: ifnonnull -> 59
/*      */     //   51: aload_1
/*      */     //   52: astore_3
/*      */     //   53: iinc #5, 1
/*      */     //   56: goto -> 189
/*      */     //   59: aload_1
/*      */     //   60: invokevirtual getSnapshotId$runtime : ()I
/*      */     //   63: aload_3
/*      */     //   64: invokevirtual getSnapshotId$runtime : ()I
/*      */     //   67: if_icmpge -> 74
/*      */     //   70: aload_1
/*      */     //   71: goto -> 81
/*      */     //   74: aload_3
/*      */     //   75: astore #8
/*      */     //   77: aload_1
/*      */     //   78: astore_3
/*      */     //   79: aload #8
/*      */     //   81: astore #7
/*      */     //   83: aload_2
/*      */     //   84: ifnonnull -> 171
/*      */     //   87: aload_0
/*      */     //   88: invokeinterface getFirstStateRecord : ()Landroidx/compose/runtime/snapshots/StateRecord;
/*      */     //   93: astore #8
/*      */     //   95: iconst_0
/*      */     //   96: istore #9
/*      */     //   98: aload #8
/*      */     //   100: astore #10
/*      */     //   102: aload #8
/*      */     //   104: astore #11
/*      */     //   106: aload #10
/*      */     //   108: ifnull -> 168
/*      */     //   111: aload #10
/*      */     //   113: astore #12
/*      */     //   115: iconst_0
/*      */     //   116: istore #13
/*      */     //   118: aload #12
/*      */     //   120: invokevirtual getSnapshotId$runtime : ()I
/*      */     //   123: iload #4
/*      */     //   125: if_icmplt -> 132
/*      */     //   128: iconst_1
/*      */     //   129: goto -> 133
/*      */     //   132: iconst_0
/*      */     //   133: ifeq -> 141
/*      */     //   136: aload #10
/*      */     //   138: goto -> 170
/*      */     //   141: aload #11
/*      */     //   143: invokevirtual getSnapshotId$runtime : ()I
/*      */     //   146: aload #10
/*      */     //   148: invokevirtual getSnapshotId$runtime : ()I
/*      */     //   151: if_icmpge -> 158
/*      */     //   154: aload #10
/*      */     //   156: astore #11
/*      */     //   158: aload #10
/*      */     //   160: invokevirtual getNext$runtime : ()Landroidx/compose/runtime/snapshots/StateRecord;
/*      */     //   163: astore #10
/*      */     //   165: goto -> 106
/*      */     //   168: aload #11
/*      */     //   170: astore_2
/*      */     //   171: aload #7
/*      */     //   173: iconst_0
/*      */     //   174: invokevirtual setSnapshotId$runtime : (I)V
/*      */     //   177: aload #7
/*      */     //   179: aload_2
/*      */     //   180: invokevirtual assign : (Landroidx/compose/runtime/snapshots/StateRecord;)V
/*      */     //   183: goto -> 189
/*      */     //   186: iinc #5, 1
/*      */     //   189: aload_1
/*      */     //   190: invokevirtual getNext$runtime : ()Landroidx/compose/runtime/snapshots/StateRecord;
/*      */     //   193: astore_1
/*      */     //   194: goto -> 25
/*      */     //   197: iload #5
/*      */     //   199: iconst_1
/*      */     //   200: if_icmple -> 207
/*      */     //   203: iconst_1
/*      */     //   204: goto -> 208
/*      */     //   207: iconst_0
/*      */     //   208: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #2118	-> 0
/*      */     //   #2119	-> 7
/*      */     //   #2120	-> 9
/*      */     //   #2121	-> 11
/*      */     //   #2122	-> 22
/*      */     //   #2124	-> 25
/*      */     //   #2125	-> 29
/*      */     //   #2126	-> 35
/*      */     //   #2127	-> 40
/*      */     //   #2128	-> 47
/*      */     //   #2131	-> 51
/*      */     //   #2132	-> 53
/*      */     //   #2135	-> 59
/*      */     //   #2136	-> 70
/*      */     //   #2140	-> 74
/*      */     //   #2141	-> 77
/*      */     //   #2142	-> 79
/*      */     //   #2135	-> 81
/*      */     //   #2144	-> 83
/*      */     //   #2146	-> 87
/*      */     //   #2479	-> 98
/*      */     //   #2480	-> 102
/*      */     //   #2481	-> 106
/*      */     //   #2482	-> 111
/*      */     //   #2147	-> 118
/*      */     //   #2482	-> 133
/*      */     //   #2483	-> 141
/*      */     //   #2484	-> 154
/*      */     //   #2485	-> 158
/*      */     //   #2487	-> 168
/*      */     //   #2146	-> 170
/*      */     //   #2150	-> 171
/*      */     //   #2151	-> 177
/*      */     //   #2154	-> 186
/*      */     //   #2157	-> 189
/*      */     //   #2160	-> 197
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   77	4	8	result	Landroidx/compose/runtime/snapshots/StateRecord;
/*      */     //   118	15	13	$i$a$-findYoungestOr-SnapshotKt$overwriteUnusedRecordsLocked$1	I
/*      */     //   115	18	12	it	Landroidx/compose/runtime/snapshots/StateRecord;
/*      */     //   98	72	9	$i$f$findYoungestOr	I
/*      */     //   102	68	10	current$iv	Landroidx/compose/runtime/snapshots/StateRecord;
/*      */     //   106	64	11	youngest$iv	Landroidx/compose/runtime/snapshots/StateRecord;
/*      */     //   95	75	8	$this$findYoungestOr$iv	Landroidx/compose/runtime/snapshots/StateRecord;
/*      */     //   83	100	7	recordToOverwrite	Landroidx/compose/runtime/snapshots/StateRecord;
/*      */     //   35	159	6	currentId	I
/*      */     //   7	202	1	current	Landroidx/compose/runtime/snapshots/StateRecord;
/*      */     //   9	200	2	overwriteRecord	Landroidx/compose/runtime/snapshots/StateRecord;
/*      */     //   11	198	3	validRecord	Landroidx/compose/runtime/snapshots/StateRecord;
/*      */     //   22	187	4	reuseLimit	I
/*      */     //   25	184	5	retainedRecords	I
/*      */     //   0	209	0	state	Landroidx/compose/runtime/snapshots/StateObject; }
/* 2516 */   private static final StateRecord findYoungestOr(StateRecord $this$findYoungestOr, Function1 predicate) { int $i$f$findYoungestOr = 0; StateRecord current = $this$findYoungestOr; StateRecord youngest = $this$findYoungestOr; while (current != null) { if (((Boolean)predicate.invoke(current)).booleanValue()) return current;  if (youngest.getSnapshotId$runtime() < current.getSnapshotId$runtime()) youngest = current;  current = current.getNext$runtime(); }  return youngest; } private static final void processForUnusedRecordsLocked(StateObject state) { if (overwriteUnusedRecordsLocked(state)) extraStateObjects.add(state);  } @PublishedApi @NotNull public static final <T extends StateRecord> T writableRecord(@NotNull StateRecord $this$writableRecord, @NotNull StateObject state, @NotNull Snapshot snapshot) { StateRecord readData; Intrinsics.checkNotNullParameter($this$writableRecord, "<this>"); Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(snapshot, "snapshot"); if (snapshot.getReadOnly()) snapshot.recordModified$runtime(state);  int id = snapshot.getId(); if (readable($this$writableRecord, id, snapshot.getInvalid$runtime()) == null) { readable($this$writableRecord, id, snapshot.getInvalid$runtime()); readError(); throw new KotlinNothingValueException(); }  if (readData.getSnapshotId$runtime() == snapshot.getId()) return (T)readData;  int $i$f$sync = 0; SynchronizedObject lock$iv$iv = getLock(); int $i$f$synchronized = 0;
/* 2517 */     synchronized (lock$iv$iv) { StateRecord newReadData; int $i$a$-sync-SnapshotKt$writableRecord$newData$1 = 0; if (readable(state.getFirstStateRecord(), id, snapshot.getInvalid$runtime()) == null) { readable(state.getFirstStateRecord(), id, snapshot.getInvalid$runtime()); readError(); throw new KotlinNothingValueException(); }  StateRecord stateRecord1 = (StateRecord)((newReadData.getSnapshotId$runtime() == id) ? newReadData : newWritableRecordLocked(newReadData, state, snapshot)); }  Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord"); StateRecord newData = stateRecord1; if (readData.getSnapshotId$runtime() != 1) snapshot.recordModified$runtime(state);  return (T)newData; } @NotNull public static final <T extends StateRecord> T overwritableRecord(@NotNull StateRecord $this$overwritableRecord, @NotNull StateObject state, @NotNull Snapshot snapshot, @NotNull StateRecord candidate) { Intrinsics.checkNotNullParameter($this$overwritableRecord, "<this>"); Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(snapshot, "snapshot"); Intrinsics.checkNotNullParameter(candidate, "candidate"); if (snapshot.getReadOnly()) snapshot.recordModified$runtime(state);  int id = snapshot.getId(); if (candidate.getSnapshotId$runtime() == id)
/* 2518 */       return (T)candidate;  int $i$f$sync = 0; SynchronizedObject lock$iv$iv = getLock(); int $i$f$synchronized = 0;
/* 2519 */     synchronized (lock$iv$iv) { int $i$a$-sync-SnapshotKt$overwritableRecord$newData$1 = 0; StateRecord stateRecord = (StateRecord)newOverwritableRecordLocked($this$overwritableRecord, state); }  StateRecord newData = stateRecord; newData.setSnapshotId$runtime(id); if (candidate.getSnapshotId$runtime() != 1)
/* 2520 */       snapshot.recordModified$runtime(state);  return (T)newData; } @NotNull public static final <T extends StateRecord> T newWritableRecord(@NotNull StateRecord $this$newWritableRecord, @NotNull StateObject state, @NotNull Snapshot snapshot) { Intrinsics.checkNotNullParameter($this$newWritableRecord, "<this>"); Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(snapshot, "snapshot"); int $i$f$sync = 0; SynchronizedObject lock$iv$iv = getLock(); int $i$f$synchronized = 0;
/* 2521 */     synchronized (lock$iv$iv) { int $i$a$-sync-SnapshotKt$newWritableRecord$1 = 0; T t = (T)newWritableRecordLocked($this$newWritableRecord, state, snapshot); }  return t; } private static final <T extends StateRecord> T newWritableRecordLocked(StateRecord $this$newWritableRecordLocked, StateObject state, Snapshot snapshot) { StateRecord newData = newOverwritableRecordLocked($this$newWritableRecordLocked, state); newData.assign($this$newWritableRecordLocked); newData.setSnapshotId$runtime(snapshot.getId()); return (T)newData; } @NotNull public static final <T extends StateRecord> T newOverwritableRecordLocked(@NotNull StateRecord $this$newOverwritableRecordLocked, @NotNull StateObject state) { Intrinsics.checkNotNullParameter($this$newOverwritableRecordLocked, "<this>"); Intrinsics.checkNotNullParameter(state, "state"); StateRecord stateRecord1 = usedLocked(state), $this$newOverwritableRecordLocked_u24lambda_u2415 = stateRecord1; int $i$a$-apply-SnapshotKt$newOverwritableRecordLocked$1 = 0; $this$newOverwritableRecordLocked_u24lambda_u2415.setSnapshotId$runtime(2147483647); usedLocked(state); StateRecord $this$newOverwritableRecordLocked_u24lambda_u2416 = $this$newOverwritableRecordLocked_u24lambda_u2415 = $this$newOverwritableRecordLocked.create(); int $i$a$-apply-SnapshotKt$newOverwritableRecordLocked$2 = 0; $this$newOverwritableRecordLocked_u24lambda_u2416.setSnapshotId$runtime(2147483647); $this$newOverwritableRecordLocked_u24lambda_u2416.setNext$runtime(state.getFirstStateRecord()); Intrinsics.checkNotNull($this$newOverwritableRecordLocked_u24lambda_u2416, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$16"); state.prependStateRecord($this$newOverwritableRecordLocked_u24lambda_u2416); Intrinsics.checkNotNull($this$newOverwritableRecordLocked_u24lambda_u2415, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked"); return (usedLocked(state) != null) ? (T)stateRecord1 : (T)$this$newOverwritableRecordLocked_u24lambda_u2415; } @PublishedApi public static final void notifyWrite(@NotNull Snapshot snapshot, @NotNull StateObject state) { Intrinsics.checkNotNullParameter(snapshot, "snapshot"); Intrinsics.checkNotNullParameter(state, "state"); snapshot.setWriteCount$runtime(snapshot.getWriteCount$runtime() + 1); if (snapshot.getWriteObserver$runtime() != null) { snapshot.getWriteObserver$runtime().invoke(state); } else { snapshot.getWriteObserver$runtime(); }  }
/* 2522 */   public static final <T extends StateRecord, R> R writable(@NotNull StateRecord $this$writable, @NotNull StateObject state, @NotNull Snapshot snapshot, @NotNull Function1 block) { Intrinsics.checkNotNullParameter($this$writable, "<this>"); Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(snapshot, "snapshot"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$writable = 0, $i$f$sync = 0; SynchronizedObject lock$iv$iv = getLock(); int $i$f$synchronized = 0;
/* 2523 */     SynchronizedObject synchronizedObject1 = lock$iv$iv; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ try { int $i$a$-sync-SnapshotKt$writable$1 = 0; Object object = block.invoke(writableRecord($this$writable, state, snapshot)); } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }  Object object1 = object; Object it = object1;
/* 2524 */     int $i$a$-also-SnapshotKt$writable$2 = 0; notifyWrite(snapshot, state); return (R)object1; } public static final <T extends StateRecord, R> R writable(@NotNull StateRecord $this$writable, @NotNull StateObject state, @NotNull Function1 block) { Intrinsics.checkNotNullParameter($this$writable, "<this>"); Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$writable = 0; Object snapshot = null; snapshot = getSnapshotInitializer(); int $i$f$sync = 0;
/* 2525 */     SynchronizedObject lock$iv$iv = getLock(); int $i$f$synchronized = 0;
/* 2526 */     SynchronizedObject synchronizedObject1 = lock$iv$iv; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ try { int $i$a$-sync-SnapshotKt$writable$3 = 0; snapshot = Snapshot.Companion.getCurrent(); Object object = block.invoke(writableRecord($this$writable, state, (Snapshot)snapshot)); } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }  Object object1 = object; Object it = object1; int $i$a$-also-SnapshotKt$writable$4 = 0; notifyWrite((Snapshot)snapshot, state); return (R)object1; } public static final <T extends StateRecord, R> R overwritable(@NotNull StateRecord $this$overwritable, @NotNull StateObject state, @NotNull StateRecord candidate, @NotNull Function1 block) { Intrinsics.checkNotNullParameter($this$overwritable, "<this>"); Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(candidate, "candidate"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$overwritable = 0; Object snapshot = null; snapshot = getSnapshotInitializer(); int $i$f$sync = 0;
/* 2527 */     SynchronizedObject lock$iv$iv = getLock(); int $i$f$synchronized = 0;
/* 2528 */     SynchronizedObject synchronizedObject1 = lock$iv$iv; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ try { int $i$a$-sync-SnapshotKt$overwritable$1 = 0; snapshot = Snapshot.Companion.getCurrent(); Object object = block.invoke(overwritableRecord($this$overwritable, state, (Snapshot)snapshot, candidate)); } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }  Object object1 = object; Object it = object1; int $i$a$-also-SnapshotKt$overwritable$2 = 0; notifyWrite((Snapshot)snapshot, state); return (R)object1; } private static final Map<StateRecord, StateRecord> optimisticMerges(MutableSnapshot currentSnapshot, MutableSnapshot applyingSnapshot, SnapshotIdSet invalidSnapshots) { MutableScatterSet<StateObject> modified = applyingSnapshot.getModified$runtime(); int id = currentSnapshot.getId(); if (modified == null)
/*      */       return null;  SnapshotIdSet start = applyingSnapshot.getInvalid$runtime().set(applyingSnapshot.getId()).or(applyingSnapshot.getPreviousIds$runtime()); Object result = null; ScatterSet this_$iv = (ScatterSet)modified; int $i$f$forEach = 0;
/* 2530 */     Object[] k$iv = this_$iv.elements;
/*      */     
/* 2532 */     ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 2534 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 2535 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 2537 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true)
/* 2538 */       { long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 2539 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 2540 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 2541 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 2542 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 2551 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 404 }  } else {  }
/*      */      return (Map<StateRecord, StateRecord>)result; } private static final Void reportReadonlySnapshotWrite() { throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString()); }
/*      */   @PublishedApi @NotNull public static final <T extends StateRecord> T current(@NotNull StateRecord r, @NotNull Snapshot snapshot) { Intrinsics.checkNotNullParameter(r, "r"); Intrinsics.checkNotNullParameter(snapshot, "snapshot"); if (readable(r, snapshot.getId(), snapshot.getInvalid$runtime()) == null) { readable(r, snapshot.getId(), snapshot.getInvalid$runtime()); readError(); throw new KotlinNothingValueException(); }
/*      */      return (T)readable(r, snapshot.getId(), snapshot.getInvalid$runtime()); }
/* 2556 */   @PublishedApi @NotNull public static final <T extends StateRecord> T current(@NotNull StateRecord r) { Intrinsics.checkNotNullParameter(r, "r"); Snapshot snapshot = Snapshot.Companion.getCurrent(); int $i$a$-let-SnapshotKt$current$1 = 0; if (readable(r, snapshot.getId(), snapshot.getInvalid$runtime()) == null) { readable(r, snapshot.getId(), snapshot.getInvalid$runtime()); int $i$f$sync = 0; SynchronizedObject lock$iv$iv = getLock(); int $i$f$synchronized = 0;
/* 2557 */       synchronized (lock$iv$iv) { int $i$a$-sync-SnapshotKt$current$1$1 = 0; Snapshot syncSnapshot = Snapshot.Companion.getCurrent(); int $i$a$-let-SnapshotKt$current$1$1$1 = 0; $i$a$-sync-SnapshotKt$current$1$1 = readable(r, syncSnapshot.getId(), syncSnapshot.getInvalid$runtime()); }  if ($i$a$-sync-SnapshotKt$current$1$1 == null) {
/*      */         readError();
/*      */         throw new KotlinNothingValueException();
/*      */       }  }
/*      */     
/*      */     return (T)readable(r, snapshot.getId(), snapshot.getInvalid$runtime()); }
/*      */ 
/*      */   
/*      */   public static final <T extends StateRecord, R> R withCurrent(@NotNull StateRecord $this$withCurrent, @NotNull Function1 block) {
/*      */     Intrinsics.checkNotNullParameter($this$withCurrent, "<this>");
/*      */     Intrinsics.checkNotNullParameter(block, "block");
/*      */     int $i$f$withCurrent = 0;
/*      */     return (R)block.invoke(current($this$withCurrent));
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public static final SnapshotIdSet addRange(@NotNull SnapshotIdSet $this$addRange, int from, int until) {
/*      */     Intrinsics.checkNotNullParameter($this$addRange, "<this>");
/*      */     SnapshotIdSet result = $this$addRange;
/*      */     for (int invalidId = from; invalidId < until; invalidId++)
/*      */       result = result.set(invalidId); 
/*      */     return result;
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\SnapshotKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */