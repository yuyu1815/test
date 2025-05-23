/*      */ package androidx.compose.runtime;
/*      */ 
/*      */ import androidx.collection.MutableIntList;
/*      */ import androidx.collection.MutableScatterMap;
/*      */ import androidx.collection.MutableScatterSet;
/*      */ import androidx.collection.ObjectIntMap;
/*      */ import androidx.collection.ScatterMap;
/*      */ import androidx.collection.ScatterSet;
/*      */ import androidx.collection.ScatterSetKt;
/*      */ import androidx.compose.runtime.changelist.ChangeList;
/*      */ import androidx.compose.runtime.collection.ScatterSetWrapper;
/*      */ import androidx.compose.runtime.collection.ScopeMap;
/*      */ import androidx.compose.runtime.internal.StabilityInferred;
/*      */ import androidx.compose.runtime.snapshots.ReaderKind;
/*      */ import androidx.compose.runtime.snapshots.StateObject;
/*      */ import androidx.compose.runtime.snapshots.StateObjectImpl;
/*      */ import androidx.compose.runtime.tooling.CompositionObserver;
/*      */ import androidx.compose.runtime.tooling.CompositionObserverHandle;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Set;
/*      */ import kotlin.KotlinNothingValueException;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.Pair;
/*      */ import kotlin.Unit;
/*      */ import kotlin.collections.CollectionsKt;
/*      */ import kotlin.coroutines.CoroutineContext;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.InlineMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ import org.jetbrains.annotations.TestOnly;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000ð\001\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020#\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\"\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\b\n\002\020\b\n\002\b\006\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\034\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\025\b\000\030\0002\0020\0012\0020\0022\0020\0032\0020\004:\002¥\001B%\022\006\020\005\032\0020\006\022\n\020\007\032\006\022\002\b\0030\b\022\n\b\002\020\t\032\004\030\0010\n¢\006\002\020\013J\b\020X\032\0020\032H\026J\030\020Y\032\0020\0322\006\020Z\032\0020,2\006\020[\032\0020\023H\002J\036\020Y\032\0020\0322\f\020\\\032\b\022\004\022\0020,0+2\006\020[\032\0020\023H\002J\b\020]\032\0020\032H\026J\020\020^\032\0020\0322\006\020\026\032\0020\027H\002J\b\020_\032\0020\032H\026J\b\020`\032\0020\032H\026J\b\020a\032\0020\032H\002J \020b\032\0020\0322\021\020c\032\r\022\004\022\0020\0320\031¢\006\002\b\033H\026¢\006\002\020\037J \020d\032\0020\0322\021\020c\032\r\022\004\022\0020\0320\031¢\006\002\b\033H\002¢\006\002\020\037J\r\020e\032\0020:H\000¢\006\002\bfJ\b\020g\032\0020\032H\026J3\020h\032\002Hi\"\004\b\000\020i2\b\020j\032\004\030\0010\0012\006\020k\032\0020:2\f\020l\032\b\022\004\022\002Hi0\031H\026¢\006\002\020mJ\b\020n\032\0020\032H\026J\020\020o\032\0020\0322\006\020p\032\0020qH\026J\b\020r\032\0020\032H\002J\b\020s\032\0020\032H\002J#\020t\032\004\030\001Hu\"\004\b\000\020u2\f\020v\032\b\022\004\022\002Hu0wH\026¢\006\002\020xJ\"\020y\032\002Hu\"\004\b\000\020u2\f\020l\032\b\022\004\022\002Hu0\031H\b¢\006\002\020zJC\020{\032\002Hu\"\004\b\000\020u2-\020l\032)\022\037\022\035\022\004\022\0020%\022\004\022\0020,00¢\006\f\b}\022\b\b~\022\004\b\b(\026\022\004\022\002Hu0|H\b¢\006\002\020J)\020\001\032\0020\0322\036\020\001\032\031\022\025\022\023\022\005\022\0030\001\022\007\022\005\030\0010\0010\0010$H\026J\036\020\001\032\0030\0012\007\020\001\032\0020%2\t\020\001\032\004\030\0010,H\026J\t\020\001\032\0020\032H\026J(\020\001\032\0030\0012\007\020\001\032\0020%2\b\020\001\032\0030\0012\t\020\001\032\004\030\0010,H\002J\017\020\001\032\0020\0322\006\020v\032\0020:J\021\020\001\032\0020\0322\006\020Z\032\0020,H\002J\032\020\001\032\0030\0012\b\020\001\032\0030\001H\000¢\006\003\b\001J\f\020\001\032\005\030\0010\001H\002J\027\020\001\032\0020\0232\f\020\\\032\b\022\004\022\0020,0+H\026J\027\020\001\032\0020\0322\f\020l\032\b\022\004\022\0020\0320\031H\026J\t\020\001\032\0020\023H\026J\022\020\001\032\0020\0322\007\020\001\032\0020%H\026J\027\020\001\032\0020\0322\f\020\\\032\b\022\004\022\0020,0+H\026J\021\020\001\032\0020\0322\006\020Z\032\0020,H\026J\021\020\001\032\0020\0322\006\020Z\032\0020,H\026J\033\020\001\032\0020\0322\n\020p\032\006\022\002\b\00301H\000¢\006\003\b\001J!\020\001\032\0020\0322\007\020\001\032\0020,2\007\020\001\032\0020%H\000¢\006\003\b\001J!\020\001\032\0020\0322\021\020c\032\r\022\004\022\0020\0320\031¢\006\002\b\033H\026¢\006\002\020\037J!\020\001\032\0020\0322\021\020c\032\r\022\004\022\0020\0320\031¢\006\002\b\033H\026¢\006\002\020\037J\025\020 \001\032\016\022\004\022\0020%\022\004\022\0020,00H\002J#\020¡\001\032\002Hu\"\004\b\000\020u2\f\020l\032\b\022\004\022\002Hu0\031H\b¢\006\002\020zJ\035\020¢\001\032\0020\0232\007\020\001\032\0020%2\t\020\001\032\004\030\0010,H\002J\021\020£\001\032\0020\0322\006\020S\032\0020TH\002J\t\020¤\001\032\0020\032H\026R\020\020\f\032\004\030\0010\nX\004¢\006\002\n\000R\032\020\r\032\b\022\004\022\0020\0170\016X\004¢\006\b\n\000\022\004\b\020\020\021R\022\020\007\032\006\022\002\b\0030\bX\004¢\006\002\n\000R\024\020\022\032\0020\0238BX\004¢\006\006\032\004\b\024\020\025R\016\020\026\032\0020\027X\004¢\006\002\n\000R'\020\030\032\r\022\004\022\0020\0320\031¢\006\002\b\033X\016¢\006\020\n\002\020 \032\004\b\034\020\035\"\004\b\036\020\037R\016\020!\032\0020\"X\004¢\006\002\n\000R\032\020#\032\b\022\004\022\0020%0$8AX\004¢\006\006\032\004\b&\020'R\024\020(\032\b\022\004\022\0020%0)X\004¢\006\002\n\000R\032\020*\032\b\022\004\022\0020,0+8AX\004¢\006\006\032\004\b-\020.R\036\020/\032\022\022\004\022\0020,\022\b\022\006\022\002\b\0030100X\004¢\006\002\n\000R\016\0202\032\0020\023X\016¢\006\002\n\000R\024\0203\032\0020\0238VX\004¢\006\006\032\004\b4\020\025R\024\0205\032\0020\0238VX\004¢\006\006\032\004\b6\020\025R\024\0207\032\b\022\004\022\0020%0)X\004¢\006\002\n\000R\020\0208\032\004\030\0010\000X\016¢\006\002\n\000R\016\0209\032\0020:X\016¢\006\002\n\000R\032\020;\032\016\022\004\022\0020%\022\004\022\0020,00X\016¢\006\002\n\000R\024\020<\032\0020\0238VX\004¢\006\006\032\004\b<\020\025R\024\020=\032\0020\0238VX\004¢\006\006\032\004\b=\020\025R\021\020>\032\0020\023¢\006\b\n\000\032\004\b>\020\025R\016\020?\032\0020\027X\004¢\006\002\n\000R\016\020@\032\0020AX\004¢\006\002\n\000R\032\020B\032\016\022\004\022\0020,\022\004\022\0020%00X\004¢\006\002\n\000R\032\020C\032\016\022\004\022\0020,\022\004\022\0020%00X\004¢\006\002\n\000R\032\020D\032\b\022\004\022\0020,0+8AX\004¢\006\006\032\004\bE\020.R\024\020F\032\0020GX\004¢\006\b\n\000\032\004\bH\020IR\016\020\005\032\0020\006X\004¢\006\002\n\000R \020J\032\0020\023X\016¢\006\024\n\000\022\004\bK\020\021\032\004\bL\020\025\"\004\bM\020NR\026\020O\032\n\022\006\022\004\030\0010,0PX\004¢\006\002\n\000R\021\020\t\032\0020\n8F¢\006\006\032\004\bQ\020RR\032\020S\032\0020TX\004¢\006\016\n\000\022\004\bU\020\021\032\004\bV\020W¨\006¦\001"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/CompositionServices;", "parent", "Landroidx/compose/runtime/CompositionContext;", "applier", "Landroidx/compose/runtime/Applier;", "recomposeContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "_recomposeContext", "abandonSet", "", "Landroidx/compose/runtime/RememberObserver;", "getAbandonSet$annotations", "()V", "areChildrenComposing", "", "getAreChildrenComposing", "()Z", "changes", "Landroidx/compose/runtime/changelist/ChangeList;", "composable", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "conditionalScopes", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getConditionalScopes$runtime", "()Ljava/util/List;", "conditionallyInvalidatedScopes", "Landroidx/collection/MutableScatterSet;", "derivedStateDependencies", "", "", "getDerivedStateDependencies$runtime", "()Ljava/util/Set;", "derivedStates", "Landroidx/compose/runtime/collection/ScopeMap;", "Landroidx/compose/runtime/DerivedState;", "disposed", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges", "invalidatedScopes", "invalidationDelegate", "invalidationDelegateGroup", "", "invalidations", "isComposing", "isDisposed", "isRoot", "lateChanges", "lock", "Landroidx/compose/runtime/SynchronizedObject;", "observations", "observationsProcessed", "observedObjects", "getObservedObjects$runtime", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime", "()Landroidx/compose/runtime/CompositionObserverHolder;", "pendingInvalidScopes", "getPendingInvalidScopes$runtime$annotations", "getPendingInvalidScopes$runtime", "setPendingInvalidScopes$runtime", "(Z)V", "pendingModifications", "Landroidx/compose/runtime/AtomicReference;", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime$annotations", "getSlotTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "abandonChanges", "addPendingInvalidationsLocked", "value", "forgetConditionalScopes", "values", "applyChanges", "applyChangesInLocked", "applyLateChanges", "changesApplied", "cleanUpDerivedStateObservations", "composeContent", "content", "composeInitial", "composerStacksSizes", "composerStacksSizes$runtime", "deactivate", "delegateInvalidations", "R", "to", "groupIndex", "block", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "dispose", "disposeUnusedMovableContent", "state", "Landroidx/compose/runtime/MovableContentState;", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "getCompositionService", "T", "key", "Landroidx/compose/runtime/CompositionServiceKey;", "(Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "guardChanges", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "guardInvalidationsLocked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "insertMovableContent", "references", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "invalidate", "Landroidx/compose/runtime/InvalidationResult;", "scope", "instance", "invalidateAll", "invalidateChecked", "anchor", "Landroidx/compose/runtime/Anchor;", "invalidateGroupsWithKey", "invalidateScopeOfLocked", "observe", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserver;", "observe$runtime", "observesAnyOf", "prepareCompose", "recompose", "recomposeScopeReleased", "recordModificationsOf", "recordReadOf", "recordWriteOf", "removeDerivedStateObservation", "removeDerivedStateObservation$runtime", "removeObservation", "removeObservation$runtime", "setContent", "setContentWithReuse", "takeInvalidations", "trackAbandonedValues", "tryImminentInvalidation", "validateRecomposeScopeAnchors", "verifyConsistent", "RememberEventDispatcher", "runtime"})
/*      */ @StabilityInferred(parameters = 0)
/*      */ @SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 12 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 13 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 14 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 15 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 16 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 17 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 18 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1504:1\n1055#1,2:1525\n1225#1,3:1527\n1045#1,6:1531\n1228#1,7:1537\n1057#1,4:1544\n1055#1,2:2056\n1225#1,3:2058\n1045#1,6:2061\n1228#1,7:2067\n1057#1,4:2074\n1055#1,2:2087\n1225#1,10:2089\n1057#1,4:2099\n1055#1,2:2196\n1225#1,10:2198\n1057#1,4:2208\n1055#1,2:2213\n1225#1,10:2215\n1057#1,4:2225\n1055#1,2:2230\n1225#1,10:2232\n1057#1,4:2242\n1225#1,10:2246\n26#2:1505\n26#2:1513\n26#2:1514\n26#2:1530\n26#2:1548\n26#2:1565\n26#2:1566\n26#2:2018\n26#2:2055\n26#2:2195\n26#2:2212\n26#2:2229\n26#2:2256\n26#2:2259\n26#2:2260\n26#2:2261\n26#2:2332\n50#3,7:1506\n50#3,7:1549\n50#3,7:2324\n93#4,2:1515\n33#4,4:1517\n95#4,2:1521\n38#4:1523\n97#4:1524\n110#4,2:2078\n33#4,6:2080\n112#4:2086\n33#4,4:2320\n38#4:2331\n177#5,5:1556\n183#5,3:1562\n177#5,5:2103\n183#5,3:2109\n177#5,5:2115\n183#5,3:2121\n177#5,5:2336\n183#5,3:2342\n1#6:1561\n1#6:2108\n1#6:2120\n1#6:2317\n1#6:2341\n48#7,3:1567\n53#7:1597\n55#7:1600\n48#7,3:1637\n53#7:1703\n55#7:1733\n267#8,4:1570\n237#8,7:1574\n248#8,3:1582\n251#8,2:1586\n272#8,2:1588\n254#8,6:1590\n274#8:1596\n267#8,4:1606\n237#8,7:1610\n248#8,3:1618\n251#8,2:1622\n272#8,2:1624\n254#8,6:1626\n274#8:1632\n267#8,4:1640\n237#8,7:1644\n248#8,3:1652\n251#8,2:1656\n272#8:1658\n267#8,4:1664\n237#8,7:1668\n248#8,3:1676\n251#8,2:1680\n272#8,2:1682\n254#8,6:1684\n274#8:1690\n273#8:1695\n254#8,6:1696\n274#8:1702\n267#8,4:1705\n237#8,7:1709\n248#8,3:1717\n251#8,2:1721\n272#8,2:1723\n254#8,6:1725\n274#8:1731\n237#8,7:1757\n248#8,3:1765\n251#8,2:1769\n254#8,6:1775\n237#8,7:1821\n248#8,3:1829\n251#8,2:1833\n254#8,6:1839\n237#8,16:1885\n254#8,6:1905\n237#8,7:1930\n248#8,3:1938\n251#8,2:1942\n254#8,6:1948\n267#8,4:1987\n237#8,7:1991\n248#8,3:1999\n251#8,2:2003\n272#8,2:2005\n254#8,6:2007\n274#8:2013\n267#8,4:2024\n237#8,7:2028\n248#8,3:2036\n251#8,2:2040\n272#8,2:2042\n254#8,6:2044\n274#8:2050\n237#8,16:2151\n254#8,6:2171\n267#8,4:2268\n237#8,7:2272\n248#8,3:2280\n251#8,2:2284\n272#8:2286\n273#8:2289\n254#8,6:2290\n274#8:2296\n1810#9:1581\n1672#9:1585\n1810#9:1617\n1672#9:1621\n1810#9:1651\n1672#9:1655\n1810#9:1675\n1672#9:1679\n1810#9:1716\n1672#9:1720\n1810#9:1742\n1672#9:1746\n1810#9:1764\n1672#9:1768\n1810#9:1806\n1672#9:1810\n1810#9:1828\n1672#9:1832\n1810#9:1870\n1672#9:1874\n1810#9:1937\n1672#9:1941\n1810#9:1965\n1672#9:1969\n1810#9:1998\n1672#9:2002\n1810#9:2035\n1672#9:2039\n1810#9:2136\n1672#9:2140\n1810#9:2279\n1672#9:2283\n1855#10,2:1598\n1855#10:1704\n1856#10:1732\n77#11,5:1601\n85#11,4:1633\n77#11,5:1659\n85#11,4:1691\n138#11:1734\n139#11,5:1750\n144#11,5:1782\n152#11:1797\n138#11:1798\n139#11,5:1814\n144#11,5:1846\n152#11:1861\n138#11:1862\n139#11,5:1878\n144#11,5:1912\n152#11:1927\n77#11,5:1982\n85#11,4:2014\n77#11,5:2019\n85#11,4:2051\n138#11:2128\n139#11,5:2144\n144#11,5:2178\n152#11:2193\n91#11:2262\n77#11,5:2263\n92#11,2:2287\n85#11,10:2297\n1047#12:1735\n1049#12:1749\n1050#12,3:1787\n1053#12:1796\n1047#12:1799\n1049#12:1813\n1050#12,3:1851\n1053#12:1860\n1047#12:1863\n1049#12:1877\n1050#12,3:1917\n1053#12:1926\n1047#12:2129\n1049#12:2143\n1050#12,3:2183\n1053#12:2192\n363#13,6:1736\n373#13,3:1743\n376#13,2:1747\n379#13,6:1790\n363#13,6:1800\n373#13,3:1807\n376#13,2:1811\n379#13,6:1854\n363#13,6:1864\n373#13,3:1871\n376#13,2:1875\n379#13,6:1920\n363#13,6:2130\n373#13,3:2137\n376#13,2:2141\n379#13,6:2186\n842#14,2:1755\n845#14,4:1771\n849#14:1781\n842#14,2:1819\n845#14,4:1835\n849#14:1845\n842#14,2:1883\n845#14,4:1901\n849#14:1911\n842#14,2:1928\n845#14,4:1944\n849#14:1954\n842#14,2:2149\n845#14,4:2167\n849#14:2177\n51#15:1955\n51#15:1973\n415#16,3:1956\n373#16,6:1959\n383#16,3:1966\n386#16,2:1970\n419#16:1972\n420#16:1974\n389#16,6:1975\n421#16:1981\n46#17,3:2112\n50#17:2124\n46#17,3:2125\n50#17:2194\n46#17,3:2333\n50#17:2345\n13309#18,2:2257\n11383#18,9:2307\n13309#18:2316\n13310#18:2318\n11392#18:2319\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n731#1:1525,2\n731#1:1527,3\n734#1:1531,6\n731#1:1537,7\n731#1:1544,4\n940#1:2056,2\n940#1:2058,3\n941#1:2061,6\n940#1:2067,7\n940#1:2074,4\n961#1:2087,2\n961#1:2089,10\n961#1:2099,4\n1012#1:2196,2\n1012#1:2198,10\n1012#1:2208,4\n1021#1:2213,2\n1021#1:2215,10\n1021#1:2225,4\n1031#1:2230,2\n1031#1:2232,10\n1031#1:2242,4\n1056#1:2246,10\n632#1:1505\n654#1:1513\n671#1:1514\n732#1:1530\n751#1:1548\n797#1:1565\n818#1:1566\n928#1:2018\n938#1:2055\n1011#1:2195\n1020#1:2212\n1030#1:2229\n1073#1:2256\n1079#1:2259\n1114#1:2260\n1141#1:2261\n1253#1:2332\n647#1:1506,7\n752#1:1549,7\n1215#1:2324,7\n678#1:1515,2\n678#1:1517,4\n678#1:1521,2\n678#1:1523\n678#1:1524\n960#1:2078,2\n960#1:2080,6\n960#1:2086\n1213#1:2320,4\n1213#1:2331\n782#1:1556,5\n782#1:1562,3\n969#1:2103,5\n969#1:2109,3\n983#1:2115,5\n983#1:2121,3\n1260#1:2336,5\n1260#1:2342,3\n782#1:1561\n969#1:2108\n983#1:2120\n1212#1:2317\n1260#1:2341\n828#1:1567,3\n828#1:1597\n828#1:1600\n855#1:1637,3\n855#1:1703\n855#1:1733\n828#1:1570,4\n828#1:1574,7\n828#1:1582,3\n828#1:1586,2\n828#1:1588,2\n828#1:1590,6\n828#1:1596\n840#1:1606,4\n840#1:1610,7\n840#1:1618,3\n840#1:1622,2\n840#1:1624,2\n840#1:1626,6\n840#1:1632\n855#1:1640,4\n855#1:1644,7\n855#1:1652,3\n855#1:1656,2\n855#1:1658\n860#1:1664,4\n860#1:1668,7\n860#1:1676,3\n860#1:1680,2\n860#1:1682,2\n860#1:1684,6\n860#1:1690\n855#1:1695\n855#1:1696,6\n855#1:1702\n860#1:1705,4\n860#1:1709,7\n860#1:1717,3\n860#1:1721,2\n860#1:1723,2\n860#1:1725,6\n860#1:1731\n869#1:1757,7\n869#1:1765,3\n869#1:1769,2\n869#1:1775,6\n875#1:1821,7\n875#1:1829,3\n875#1:1833,2\n875#1:1839,6\n882#1:1885,16\n882#1:1905,6\n884#1:1930,7\n884#1:1938,3\n884#1:1942,2\n884#1:1948,6\n920#1:1987,4\n920#1:1991,7\n920#1:1999,3\n920#1:2003,2\n920#1:2005,2\n920#1:2007,6\n920#1:2013\n933#1:2024,4\n933#1:2028,7\n933#1:2036,3\n933#1:2040,2\n933#1:2042,2\n933#1:2044,6\n933#1:2050\n998#1:2151,16\n998#1:2171,6\n1170#1:2268,4\n1170#1:2272,7\n1170#1:2280,3\n1170#1:2284,2\n1170#1:2286\n1170#1:2289\n1170#1:2290,6\n1170#1:2296\n828#1:1581\n828#1:1585\n840#1:1617\n840#1:1621\n855#1:1651\n855#1:1655\n860#1:1675\n860#1:1679\n860#1:1716\n860#1:1720\n869#1:1742\n869#1:1746\n869#1:1764\n869#1:1768\n875#1:1806\n875#1:1810\n875#1:1828\n875#1:1832\n882#1:1870\n882#1:1874\n884#1:1937\n884#1:1941\n905#1:1965\n905#1:1969\n920#1:1998\n920#1:2002\n933#1:2035\n933#1:2039\n998#1:2136\n998#1:2140\n1170#1:2279\n1170#1:2283\n828#1:1598,2\n855#1:1704\n855#1:1732\n840#1:1601,5\n840#1:1633,4\n860#1:1659,5\n860#1:1691,4\n869#1:1734\n869#1:1750,5\n869#1:1782,5\n869#1:1797\n875#1:1798\n875#1:1814,5\n875#1:1846,5\n875#1:1861\n882#1:1862\n882#1:1878,5\n882#1:1912,5\n882#1:1927\n920#1:1982,5\n920#1:2014,4\n933#1:2019,5\n933#1:2051,4\n998#1:2128\n998#1:2144,5\n998#1:2178,5\n998#1:2193\n1170#1:2262\n1170#1:2263,5\n1170#1:2287,2\n1170#1:2297,10\n869#1:1735\n869#1:1749\n869#1:1787,3\n869#1:1796\n875#1:1799\n875#1:1813\n875#1:1851,3\n875#1:1860\n882#1:1863\n882#1:1877\n882#1:1917,3\n882#1:1926\n998#1:2129\n998#1:2143\n998#1:2183,3\n998#1:2192\n869#1:1736,6\n869#1:1743,3\n869#1:1747,2\n869#1:1790,6\n875#1:1800,6\n875#1:1807,3\n875#1:1811,2\n875#1:1854,6\n882#1:1864,6\n882#1:1871,3\n882#1:1875,2\n882#1:1920,6\n998#1:2130,6\n998#1:2137,3\n998#1:2141,2\n998#1:2186,6\n869#1:1755,2\n869#1:1771,4\n869#1:1781\n875#1:1819,2\n875#1:1835,4\n875#1:1845\n882#1:1883,2\n882#1:1901,4\n882#1:1911\n884#1:1928,2\n884#1:1944,4\n884#1:1954\n998#1:2149,2\n998#1:2167,4\n998#1:2177\n896#1:1955\n907#1:1973\n905#1:1956,3\n905#1:1959,6\n905#1:1966,3\n905#1:1970,2\n905#1:1972\n905#1:1974\n905#1:1975,6\n905#1:1981\n979#1:2112,3\n979#1:2124\n996#1:2125,3\n996#1:2194\n1256#1:2333,3\n1256#1:2345\n1074#1:2257,2\n1212#1:2307,9\n1212#1:2316\n1212#1:2318\n1212#1:2319\n*E\n"})
/*      */ public final class CompositionImpl
/*      */   implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices
/*      */ {
/*      */   @NotNull
/*      */   private final CompositionContext parent;
/*      */   @NotNull
/*      */   private final Applier<?> applier;
/*      */   @NotNull
/*      */   private final AtomicReference<Object> pendingModifications;
/*      */   @NotNull
/*      */   private final SynchronizedObject lock;
/*      */   @NotNull
/*      */   private final Set<RememberObserver> abandonSet;
/*      */   @NotNull
/*      */   private final SlotTable slotTable;
/*      */   @NotNull
/*      */   private final ScopeMap<Object, RecomposeScopeImpl> observations;
/*      */   @NotNull
/*      */   private final MutableScatterSet<RecomposeScopeImpl> invalidatedScopes;
/*      */   @NotNull
/*      */   private final MutableScatterSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;
/*      */   @NotNull
/*      */   private final ScopeMap<Object, DerivedState<?>> derivedStates;
/*      */   @NotNull
/*      */   private final ChangeList changes;
/*      */   @NotNull
/*      */   private final ChangeList lateChanges;
/*      */   @NotNull
/*      */   private final ScopeMap<Object, RecomposeScopeImpl> observationsProcessed;
/*      */   @NotNull
/*      */   private ScopeMap<RecomposeScopeImpl, Object> invalidations;
/*      */   private boolean pendingInvalidScopes;
/*      */   @Nullable
/*      */   private CompositionImpl invalidationDelegate;
/*      */   private int invalidationDelegateGroup;
/*      */   @NotNull
/*      */   private final CompositionObserverHolder observerHolder;
/*      */   @NotNull
/*      */   private final ComposerImpl composer;
/*      */   @Nullable
/*      */   private final CoroutineContext _recomposeContext;
/*      */   private final boolean isRoot;
/*      */   private boolean disposed;
/*      */   @NotNull
/*      */   private Function2<? super Composer, ? super Integer, Unit> composable;
/*      */   public static final int $stable = 8;
/*      */   
/*      */   public CompositionImpl(@NotNull CompositionContext parent, @NotNull Applier<?> applier, @Nullable CoroutineContext recomposeContext) {
/*  444 */     this.parent = parent;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  449 */     this.applier = applier;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  460 */     this.pendingModifications = new AtomicReference(null);
/*      */ 
/*      */     
/*  463 */     this.lock = new SynchronizedObject();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  473 */     this.abandonSet = (new MutableScatterSet(0, 1, null)).asMutableSet();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  479 */     SlotTable slotTable1 = new SlotTable(), slotTable2 = slotTable1; CompositionImpl compositionImpl = this; int $i$a$-also-CompositionImpl$slotTable$1 = 0;
/*  480 */     if (this.parent.getCollectingCallByInformation$runtime()) slotTable2.collectCalledByInformation(); 
/*  481 */     if (this.parent.getCollectingSourceInformation$runtime()) slotTable2.collectSourceInformation(); 
/*  482 */     compositionImpl.slotTable = slotTable1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  488 */     this.observations = new ScopeMap();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  500 */     this.invalidatedScopes = new MutableScatterSet(0, 1, null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  508 */     this.conditionallyInvalidatedScopes = new MutableScatterSet(0, 1, null);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  513 */     this.derivedStates = new ScopeMap();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  533 */     this.changes = new ChangeList();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  543 */     this.lateChanges = new ChangeList();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  552 */     this.observationsProcessed = new ScopeMap();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  561 */     this.invalidations = new ScopeMap();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  576 */     this.observerHolder = new CompositionObserverHolder(null, false, 3, null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  582 */     ComposerImpl composerImpl1 = new ComposerImpl(
/*  583 */         this.applier, 
/*  584 */         this.parent, 
/*  585 */         this.slotTable, 
/*  586 */         this.abandonSet, 
/*  587 */         this.changes, 
/*  588 */         this.lateChanges, 
/*  589 */         this);
/*  590 */     ComposerImpl composerImpl2 = composerImpl1; compositionImpl = this; int $i$a$-also-CompositionImpl$composer$1 = 0;
/*  591 */     this.parent.registerComposer$runtime(composerImpl2);
/*  592 */     compositionImpl.composer = composerImpl1;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  597 */     this._recomposeContext = recomposeContext;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  608 */     this.isRoot = this.parent instanceof Recomposer; this.composable = ComposableSingletons$CompositionKt.INSTANCE.getLambda-1$runtime(); } @NotNull public final SlotTable getSlotTable$runtime() { return this.slotTable; } @TestOnly @NotNull public final Set<Object> getObservedObjects$runtime() { return this.observations.getMap().asMap().keySet(); } @TestOnly @NotNull public final Set<Object> getDerivedStateDependencies$runtime() { return this.derivedStates.getMap().asMap().keySet(); } @TestOnly @NotNull public final List<RecomposeScopeImpl> getConditionalScopes$runtime() { return CollectionsKt.toList(this.conditionallyInvalidatedScopes.asSet()); } public final boolean isRoot() { return this.isRoot; } public final boolean getPendingInvalidScopes$runtime() { return this.pendingInvalidScopes; } public final void setPendingInvalidScopes$runtime(boolean <set-?>) { this.pendingInvalidScopes = <set-?>; } @NotNull
/*      */   public final CompositionObserverHolder getObserverHolder$runtime() {
/*      */     return this.observerHolder;
/*      */   }
/*      */   @NotNull
/*      */   public final CoroutineContext getRecomposeContext() {
/*      */     if (this._recomposeContext == null);
/*      */     return this.parent.getRecomposeCoroutineContext$runtime();
/*      */   }
/*      */   private final boolean getAreChildrenComposing() {
/*  618 */     return this.composer.getAreChildrenComposing$runtime();
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final Function2<Composer, Integer, Unit> getComposable()
/*      */   {
/*  624 */     return (Function2)this.composable; } public final void setComposable(@NotNull Function2<? super Composer, ? super Integer, Unit> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.composable = <set-?>; }
/*      */   
/*      */   public boolean isComposing() {
/*  627 */     return this.composer.isComposing$runtime();
/*      */   } public boolean isDisposed() {
/*  629 */     return this.disposed;
/*      */   }
/*      */   
/*  632 */   public boolean getHasPendingChanges() { SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1505 */     synchronized (lock$iv) { int $i$a$-synchronized-CompositionImpl$hasPendingChanges$1 = 0; boolean bool = this.composer.getHasPendingChanges$runtime(); }  return bool; } public void setContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) { Intrinsics.checkNotNullParameter(content, "content"); composeInitial(content); }
/*      */   public void setContentWithReuse(@NotNull Function2<? super Composer, ? super Integer, Unit> content) { Intrinsics.checkNotNullParameter(content, "content"); this.composer.startReuseFromRoot();
/*      */     composeInitial(content);
/*      */     this.composer.endReuseFromRoot(); }
/*      */   private final void composeInitial(Function2 content) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield disposed : Z
/*      */     //   4: ifne -> 11
/*      */     //   7: iconst_1
/*      */     //   8: goto -> 12
/*      */     //   11: iconst_0
/*      */     //   12: istore_2
/*      */     //   13: iconst_0
/*      */     //   14: istore_3
/*      */     //   15: nop
/*      */     //   16: iload_2
/*      */     //   17: ifne -> 29
/*      */     //   20: iconst_0
/*      */     //   21: istore #4
/*      */     //   23: ldc_w 'The composition is disposed'
/*      */     //   26: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*      */     //   29: nop
/*      */     //   30: aload_0
/*      */     //   31: aload_1
/*      */     //   32: putfield composable : Lkotlin/jvm/functions/Function2;
/*      */     //   35: aload_0
/*      */     //   36: getfield parent : Landroidx/compose/runtime/CompositionContext;
/*      */     //   39: aload_0
/*      */     //   40: checkcast androidx/compose/runtime/ControlledComposition
/*      */     //   43: aload_0
/*      */     //   44: getfield composable : Lkotlin/jvm/functions/Function2;
/*      */     //   47: invokevirtual composeInitial$runtime : (Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V
/*      */     //   50: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #647	-> 0
/*      */     //   #1506	-> 15
/*      */     //   #1509	-> 16
/*      */     //   #1510	-> 20
/*      */     //   #647	-> 23
/*      */     //   #1510	-> 26
/*      */     //   #1512	-> 29
/*      */     //   #648	-> 30
/*      */     //   #649	-> 35
/*      */     //   #650	-> 50
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   23	3	4	$i$a$-checkPrecondition-CompositionImpl$composeInitial$1	I
/*      */     //   15	15	3	$i$f$checkPrecondition	I
/*      */     //   13	17	2	value$iv	Z
/*      */     //   0	51	0	this	Landroidx/compose/runtime/CompositionImpl;
/*      */     //   0	51	1	content	Lkotlin/jvm/functions/Function2; }
/*      */   @NotNull public final CompositionObserverHandle observe$runtime(@NotNull CompositionObserver observer) { Intrinsics.checkNotNullParameter(observer, "observer");
/*      */     SynchronizedObject lock$iv = this.lock;
/*      */     int $i$f$synchronized = 0;
/* 1513 */     synchronized (lock$iv) { int $i$a$-synchronized-CompositionImpl$observe$1 = 0; this.observerHolder.setObserver(observer); this.observerHolder.setRoot(true); Unit unit = Unit.INSTANCE; }
/*      */      return new CompositionImpl$observe$2(observer); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"androidx/compose/runtime/CompositionImpl$observe$2", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "dispose", "", "runtime"}) @SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$observe$2\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n*L\n1#1,1504:1\n26#2:1505\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$observe$2\n*L\n660#1:1505\n*E\n"}) public static final class CompositionImpl$observe$2 implements CompositionObserverHandle {
/*      */     CompositionImpl$observe$2(CompositionObserver $observer) {} public void dispose() { SynchronizedObject synchronizedObject = CompositionImpl.this.lock; CompositionImpl compositionImpl = CompositionImpl.this; CompositionObserver compositionObserver = this.$observer; int $i$f$synchronized = 0; synchronized (synchronizedObject) {
/*      */         int $i$a$-synchronized-CompositionImpl$observe$2$dispose$1 = 0; if (Intrinsics.areEqual(compositionImpl.getObserverHolder$runtime().getObserver(), compositionObserver)) {
/*      */           compositionImpl.getObserverHolder$runtime().setObserver(null); compositionImpl.getObserverHolder$runtime().setRoot(false);
/*      */         }  Unit unit = Unit.INSTANCE;
/*      */       }  } }
/*      */   public final void invalidateGroupsWithKey(int key) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield lock : Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   4: astore_3
/*      */     //   5: iconst_0
/*      */     //   6: istore #4
/*      */     //   8: aload_3
/*      */     //   9: astore #5
/*      */     //   11: aload #5
/*      */     //   13: monitorenter
/*      */     //   14: nop
/*      */     //   15: iconst_0
/*      */     //   16: istore #6
/*      */     //   18: aload_0
/*      */     //   19: getfield slotTable : Landroidx/compose/runtime/SlotTable;
/*      */     //   22: iload_1
/*      */     //   23: invokevirtual invalidateGroupsWithKey$runtime : (I)Ljava/util/List;
/*      */     //   26: astore #7
/*      */     //   28: aload #5
/*      */     //   30: monitorexit
/*      */     //   31: aload #7
/*      */     //   33: goto -> 44
/*      */     //   36: astore #7
/*      */     //   38: aload #5
/*      */     //   40: monitorexit
/*      */     //   41: aload #7
/*      */     //   43: athrow
/*      */     //   44: nop
/*      */     //   45: astore_2
/*      */     //   46: aload_2
/*      */     //   47: ifnull -> 149
/*      */     //   50: aload_2
/*      */     //   51: astore #4
/*      */     //   53: iconst_0
/*      */     //   54: istore #5
/*      */     //   56: nop
/*      */     //   57: aload #4
/*      */     //   59: astore #6
/*      */     //   61: iconst_0
/*      */     //   62: istore #7
/*      */     //   64: nop
/*      */     //   65: iconst_0
/*      */     //   66: istore #8
/*      */     //   68: aload #6
/*      */     //   70: invokeinterface size : ()I
/*      */     //   75: istore #9
/*      */     //   77: iload #8
/*      */     //   79: iload #9
/*      */     //   81: if_icmpge -> 144
/*      */     //   84: aload #6
/*      */     //   86: iload #8
/*      */     //   88: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   93: astore #10
/*      */     //   95: aload #10
/*      */     //   97: astore #11
/*      */     //   99: iconst_0
/*      */     //   100: istore #12
/*      */     //   102: aload #11
/*      */     //   104: checkcast androidx/compose/runtime/RecomposeScopeImpl
/*      */     //   107: astore #13
/*      */     //   109: iconst_0
/*      */     //   110: istore #14
/*      */     //   112: aload #13
/*      */     //   114: aconst_null
/*      */     //   115: invokevirtual invalidateForResult : (Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;
/*      */     //   118: getstatic androidx/compose/runtime/InvalidationResult.IGNORED : Landroidx/compose/runtime/InvalidationResult;
/*      */     //   121: if_acmpne -> 128
/*      */     //   124: iconst_1
/*      */     //   125: goto -> 129
/*      */     //   128: iconst_0
/*      */     //   129: ifeq -> 136
/*      */     //   132: iconst_1
/*      */     //   133: goto -> 146
/*      */     //   136: nop
/*      */     //   137: nop
/*      */     //   138: iinc #8, 1
/*      */     //   141: goto -> 77
/*      */     //   144: nop
/*      */     //   145: iconst_0
/*      */     //   146: ifeq -> 153
/*      */     //   149: iconst_1
/*      */     //   150: goto -> 154
/*      */     //   153: iconst_0
/*      */     //   154: istore_3
/*      */     //   155: iload_3
/*      */     //   156: ifeq -> 180
/*      */     //   159: aload_0
/*      */     //   160: getfield composer : Landroidx/compose/runtime/ComposerImpl;
/*      */     //   163: invokevirtual forceRecomposeScopes$runtime : ()Z
/*      */     //   166: ifeq -> 180
/*      */     //   169: aload_0
/*      */     //   170: getfield parent : Landroidx/compose/runtime/CompositionContext;
/*      */     //   173: aload_0
/*      */     //   174: checkcast androidx/compose/runtime/ControlledComposition
/*      */     //   177: invokevirtual invalidate$runtime : (Landroidx/compose/runtime/ControlledComposition;)V
/*      */     //   180: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #671	-> 0
/*      */     //   #1514	-> 8
/*      */     //   #672	-> 18
/*      */     //   #1514	-> 26
/*      */     //   #1514	-> 44
/*      */     //   #671	-> 45
/*      */     //   #678	-> 46
/*      */     //   #1515	-> 56
/*      */     //   #1516	-> 57
/*      */     //   #1517	-> 64
/*      */     //   #1518	-> 65
/*      */     //   #1519	-> 84
/*      */     //   #1520	-> 95
/*      */     //   #1521	-> 102
/*      */     //   #679	-> 112
/*      */     //   #1521	-> 129
/*      */     //   #1522	-> 136
/*      */     //   #1520	-> 137
/*      */     //   #1518	-> 138
/*      */     //   #1523	-> 144
/*      */     //   #1524	-> 145
/*      */     //   #678	-> 154
/*      */     //   #681	-> 155
/*      */     //   #682	-> 169
/*      */     //   #684	-> 180
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   18	8	6	$i$a$-synchronized-CompositionImpl$invalidateGroupsWithKey$scopesToInvalidate$1	I
/*      */     //   8	37	4	$i$f$synchronized	I
/*      */     //   5	40	3	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   112	17	14	$i$a$-fastAny-CompositionImpl$invalidateGroupsWithKey$forceComposition$1	I
/*      */     //   109	20	13	it	Landroidx/compose/runtime/RecomposeScopeImpl;
/*      */     //   102	35	12	$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv	I
/*      */     //   99	38	11	it$iv	Ljava/lang/Object;
/*      */     //   95	43	10	item$iv$iv	Ljava/lang/Object;
/*      */     //   68	76	8	index$iv$iv	I
/*      */     //   64	81	7	$i$f$fastForEach	I
/*      */     //   61	84	6	$this$fastForEach$iv$iv	Ljava/util/List;
/*      */     //   56	90	5	$i$f$fastAny	I
/*      */     //   53	93	4	$this$fastAny$iv	Ljava/util/List;
/*      */     //   46	135	2	scopesToInvalidate	Ljava/util/List;
/*      */     //   155	26	3	forceComposition	Z
/*      */     //   0	181	0	this	Landroidx/compose/runtime/CompositionImpl;
/*      */     //   0	181	1	key	I
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   14	28	36	finally
/*      */     //   36	38	36	finally }
/*      */   public void composeContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) { Intrinsics.checkNotNullParameter(content, "content");
/*      */     CompositionImpl this_$iv = this;
/*      */     int $i$f$guardChanges = 0;
/*      */     try {
/*      */       Unit unit1, unit2;
/* 1526 */       CompositionImpl this_$iv$iv = this_$iv; int $i$f$trackAbandonedValues = 0;
/* 1527 */       boolean success$iv$iv = false;
/*      */       try {
/* 1529 */         int $i$a$-guardChanges-CompositionImpl$composeContent$1 = 0; SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0;
/* 1530 */         synchronized (lock$iv) { Unit unit3; int $i$a$-synchronized-CompositionImpl$composeContent$1$1 = 0; drainPendingModificationsForCompositionLocked(); CompositionImpl compositionImpl = this; int $i$f$guardInvalidationsLocked = 0;
/* 1531 */           ScopeMap<RecomposeScopeImpl, Object> invalidations$iv = compositionImpl.takeInvalidations();
/*      */           
/* 1533 */           try { ScopeMap<RecomposeScopeImpl, Object> invalidations = invalidations$iv; int $i$a$-guardInvalidationsLocked-CompositionImpl$composeContent$1$1$1 = 0; CompositionObserver observer = observer(); if (observer != null) { Intrinsics.checkNotNull(invalidations.asMap(), "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>"); observer.onBeginComposition(this, invalidations.asMap()); }  this.composer.composeContent$runtime(invalidations, content); observer.onEndComposition(this); unit3 = (observer != null) ? Unit.INSTANCE : null; }
/* 1534 */           catch (Exception e$iv)
/* 1535 */           { compositionImpl.invalidations = invalidations$iv;
/* 1536 */             throw e$iv; }  Unit unit4 = unit3; }
/* 1537 */          Object it$iv$iv = unit2 = unit4; int $i$a$-also-CompositionImpl$trackAbandonedValues$1$iv$iv = 0; success$iv$iv = true;
/*      */         unit2 = unit2;
/*      */       } finally {
/* 1540 */         if (!success$iv$iv && (!this_$iv$iv.abandonSet.isEmpty())) {
/* 1541 */           (new RememberEventDispatcher(this_$iv$iv.abandonSet)).dispatchAbandons();
/*      */         }
/*      */       } 
/* 1544 */     } catch (Exception e$iv) {
/* 1545 */       this_$iv.abandonChanges();
/* 1546 */       throw e$iv;
/*      */     }  }
/*      */   private final void drainPendingModificationsForCompositionLocked() { Object toRecord = this.pendingModifications.getAndSet(CompositionKt.access$getPendingApplyNoModifications$p()); if (toRecord != null) {
/*      */       if (Intrinsics.areEqual(toRecord, CompositionKt.access$getPendingApplyNoModifications$p())) {
/*      */         ComposerKt.composeRuntimeError("pending composition has not been applied"); throw new KotlinNothingValueException();
/*      */       }  if (toRecord instanceof Set) {
/*      */         addPendingInvalidationsLocked((Set<? extends Object>)toRecord, true);
/*      */       } else if (toRecord instanceof Object[]) {
/*      */         Set[] arrayOfSet; byte b; int i; for (arrayOfSet = (Set[])toRecord, b = 0, i = arrayOfSet.length; b < i; ) {
/*      */           Set<? extends Object> changed = arrayOfSet[b];
/*      */           addPendingInvalidationsLocked(changed, true);
/*      */           b++;
/*      */         } 
/*      */       } else {
/*      */         ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
/*      */         throw new KotlinNothingValueException();
/*      */       } 
/*      */     }  } public boolean getHasInvalidations() { SynchronizedObject lock$iv = this.lock;
/*      */     int $i$f$synchronized = 0;
/* 1565 */     synchronized (lock$iv) { int $i$a$-synchronized-CompositionImpl$hasInvalidations$1 = 0; $i$a$-synchronized-CompositionImpl$hasInvalidations$1 = (this.invalidations.getSize() > 0) ? 1 : 0; }  return $i$a$-synchronized-CompositionImpl$hasInvalidations$1; }
/*      */   private final void drainPendingModificationsLocked() { Object toRecord = this.pendingModifications.getAndSet(null); if (!Intrinsics.areEqual(toRecord, CompositionKt.access$getPendingApplyNoModifications$p())) if (toRecord instanceof Set) { addPendingInvalidationsLocked((Set<? extends Object>)toRecord, false); } else if (toRecord instanceof Object[]) { Set[] arrayOfSet; byte b; int i; for (arrayOfSet = (Set[])toRecord, b = 0, i = arrayOfSet.length; b < i; ) { Set<? extends Object> changed = arrayOfSet[b]; addPendingInvalidationsLocked(changed, false); b++; }  } else { if (toRecord == null) { ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported"); throw new KotlinNothingValueException(); }  ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications); throw new KotlinNothingValueException(); }   }
/*      */   public void dispose() { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield lock : Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   4: astore_1
/*      */     //   5: iconst_0
/*      */     //   6: istore_2
/*      */     //   7: aload_1
/*      */     //   8: astore_3
/*      */     //   9: aload_3
/*      */     //   10: monitorenter
/*      */     //   11: nop
/*      */     //   12: iconst_0
/*      */     //   13: istore #4
/*      */     //   15: aload_0
/*      */     //   16: getfield composer : Landroidx/compose/runtime/ComposerImpl;
/*      */     //   19: invokevirtual isComposing$runtime : ()Z
/*      */     //   22: ifne -> 29
/*      */     //   25: iconst_1
/*      */     //   26: goto -> 30
/*      */     //   29: iconst_0
/*      */     //   30: istore #5
/*      */     //   32: iconst_0
/*      */     //   33: istore #6
/*      */     //   35: nop
/*      */     //   36: iload #5
/*      */     //   38: ifne -> 50
/*      */     //   41: iconst_0
/*      */     //   42: istore #7
/*      */     //   44: ldc_w 'Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.'
/*      */     //   47: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*      */     //   50: nop
/*      */     //   51: aload_0
/*      */     //   52: getfield disposed : Z
/*      */     //   55: ifne -> 285
/*      */     //   58: aload_0
/*      */     //   59: iconst_1
/*      */     //   60: putfield disposed : Z
/*      */     //   63: aload_0
/*      */     //   64: getstatic androidx/compose/runtime/ComposableSingletons$CompositionKt.INSTANCE : Landroidx/compose/runtime/ComposableSingletons$CompositionKt;
/*      */     //   67: invokevirtual getLambda-2$runtime : ()Lkotlin/jvm/functions/Function2;
/*      */     //   70: putfield composable : Lkotlin/jvm/functions/Function2;
/*      */     //   73: aload_0
/*      */     //   74: getfield composer : Landroidx/compose/runtime/ComposerImpl;
/*      */     //   77: invokevirtual getDeferredChanges$runtime : ()Landroidx/compose/runtime/changelist/ChangeList;
/*      */     //   80: astore #5
/*      */     //   82: aload #5
/*      */     //   84: ifnull -> 93
/*      */     //   87: aload_0
/*      */     //   88: aload #5
/*      */     //   90: invokespecial applyChangesInLocked : (Landroidx/compose/runtime/changelist/ChangeList;)V
/*      */     //   93: aload_0
/*      */     //   94: getfield slotTable : Landroidx/compose/runtime/SlotTable;
/*      */     //   97: invokevirtual getGroupsSize : ()I
/*      */     //   100: ifle -> 107
/*      */     //   103: iconst_1
/*      */     //   104: goto -> 108
/*      */     //   107: iconst_0
/*      */     //   108: istore #6
/*      */     //   110: iload #6
/*      */     //   112: ifne -> 138
/*      */     //   115: aload_0
/*      */     //   116: getfield abandonSet : Ljava/util/Set;
/*      */     //   119: checkcast java/util/Collection
/*      */     //   122: invokeinterface isEmpty : ()Z
/*      */     //   127: ifne -> 134
/*      */     //   130: iconst_1
/*      */     //   131: goto -> 135
/*      */     //   134: iconst_0
/*      */     //   135: ifeq -> 278
/*      */     //   138: new androidx/compose/runtime/CompositionImpl$RememberEventDispatcher
/*      */     //   141: dup
/*      */     //   142: aload_0
/*      */     //   143: getfield abandonSet : Ljava/util/Set;
/*      */     //   146: invokespecial <init> : (Ljava/util/Set;)V
/*      */     //   149: astore #7
/*      */     //   151: iload #6
/*      */     //   153: ifeq -> 273
/*      */     //   156: aload_0
/*      */     //   157: getfield applier : Landroidx/compose/runtime/Applier;
/*      */     //   160: invokeinterface onBeginChanges : ()V
/*      */     //   165: aload_0
/*      */     //   166: getfield slotTable : Landroidx/compose/runtime/SlotTable;
/*      */     //   169: astore #8
/*      */     //   171: iconst_0
/*      */     //   172: istore #9
/*      */     //   174: aload #8
/*      */     //   176: invokevirtual openWriter : ()Landroidx/compose/runtime/SlotWriter;
/*      */     //   179: astore #10
/*      */     //   181: iconst_0
/*      */     //   182: istore #11
/*      */     //   184: iconst_0
/*      */     //   185: istore #12
/*      */     //   187: nop
/*      */     //   188: aload #10
/*      */     //   190: astore #13
/*      */     //   192: iconst_0
/*      */     //   193: istore #14
/*      */     //   195: aload #13
/*      */     //   197: aload #7
/*      */     //   199: checkcast androidx/compose/runtime/RememberManager
/*      */     //   202: invokestatic removeCurrentGroup : (Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V
/*      */     //   205: nop
/*      */     //   206: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   209: astore #15
/*      */     //   211: aload #15
/*      */     //   213: astore #16
/*      */     //   215: iconst_0
/*      */     //   216: istore #17
/*      */     //   218: iconst_1
/*      */     //   219: istore #12
/*      */     //   221: aload #15
/*      */     //   223: astore #15
/*      */     //   225: aload #10
/*      */     //   227: iload #12
/*      */     //   229: invokevirtual close : (Z)V
/*      */     //   232: goto -> 247
/*      */     //   235: astore #16
/*      */     //   237: aload #10
/*      */     //   239: iload #12
/*      */     //   241: invokevirtual close : (Z)V
/*      */     //   244: aload #16
/*      */     //   246: athrow
/*      */     //   247: nop
/*      */     //   248: nop
/*      */     //   249: nop
/*      */     //   250: aload_0
/*      */     //   251: getfield applier : Landroidx/compose/runtime/Applier;
/*      */     //   254: invokeinterface clear : ()V
/*      */     //   259: aload_0
/*      */     //   260: getfield applier : Landroidx/compose/runtime/Applier;
/*      */     //   263: invokeinterface onEndChanges : ()V
/*      */     //   268: aload #7
/*      */     //   270: invokevirtual dispatchRememberObservers : ()V
/*      */     //   273: aload #7
/*      */     //   275: invokevirtual dispatchAbandons : ()V
/*      */     //   278: aload_0
/*      */     //   279: getfield composer : Landroidx/compose/runtime/ComposerImpl;
/*      */     //   282: invokevirtual dispose$runtime : ()V
/*      */     //   285: nop
/*      */     //   286: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   289: astore #4
/*      */     //   291: aload_3
/*      */     //   292: monitorexit
/*      */     //   293: goto -> 303
/*      */     //   296: astore #4
/*      */     //   298: aload_3
/*      */     //   299: monitorexit
/*      */     //   300: aload #4
/*      */     //   302: athrow
/*      */     //   303: nop
/*      */     //   304: aload_0
/*      */     //   305: getfield parent : Landroidx/compose/runtime/CompositionContext;
/*      */     //   308: aload_0
/*      */     //   309: checkcast androidx/compose/runtime/ControlledComposition
/*      */     //   312: invokevirtual unregisterComposition$runtime : (Landroidx/compose/runtime/ControlledComposition;)V
/*      */     //   315: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #751	-> 0
/*      */     //   #1548	-> 7
/*      */     //   #752	-> 15
/*      */     //   #1549	-> 35
/*      */     //   #1552	-> 36
/*      */     //   #1553	-> 41
/*      */     //   #753	-> 44
/*      */     //   #1553	-> 47
/*      */     //   #1555	-> 50
/*      */     //   #756	-> 51
/*      */     //   #757	-> 58
/*      */     //   #758	-> 63
/*      */     //   #767	-> 73
/*      */     //   #768	-> 82
/*      */     //   #769	-> 87
/*      */     //   #777	-> 93
/*      */     //   #778	-> 110
/*      */     //   #778	-> 135
/*      */     //   #779	-> 138
/*      */     //   #780	-> 151
/*      */     //   #781	-> 156
/*      */     //   #782	-> 165
/*      */     //   #1556	-> 174
/*      */     //   #1557	-> 179
/*      */     //   #1558	-> 184
/*      */     //   #1559	-> 187
/*      */     //   #1560	-> 188
/*      */     //   #783	-> 195
/*      */     //   #784	-> 205
/*      */     //   #1560	-> 209
/*      */     //   #1561	-> 215
/*      */     //   #1560	-> 218
/*      */     //   #1560	-> 221
/*      */     //   #1562	-> 225
/*      */     //   #1563	-> 232
/*      */     //   #1562	-> 235
/*      */     //   #1559	-> 247
/*      */     //   #1557	-> 248
/*      */     //   #1564	-> 249
/*      */     //   #785	-> 250
/*      */     //   #786	-> 259
/*      */     //   #787	-> 268
/*      */     //   #789	-> 273
/*      */     //   #791	-> 278
/*      */     //   #793	-> 285
/*      */     //   #1548	-> 289
/*      */     //   #1548	-> 303
/*      */     //   #794	-> 304
/*      */     //   #795	-> 315
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   44	3	7	$i$a$-checkPrecondition-CompositionImpl$dispose$1$1	I
/*      */     //   35	16	6	$i$f$checkPrecondition	I
/*      */     //   32	19	5	value$iv	Z
/*      */     //   195	11	14	$i$a$-write-CompositionImpl$dispose$1$2	I
/*      */     //   192	14	13	writer	Landroidx/compose/runtime/SlotWriter;
/*      */     //   218	3	17	$i$a$-also-SlotTable$write$1$1$iv	I
/*      */     //   215	6	16	it$iv	Ljava/lang/Object;
/*      */     //   184	64	11	$i$a$-let-SlotTable$write$1$iv	I
/*      */     //   187	61	12	normalClose$iv	Z
/*      */     //   181	67	10	writer$iv	Landroidx/compose/runtime/SlotWriter;
/*      */     //   174	76	9	$i$f$write	I
/*      */     //   171	79	8	this_$iv	Landroidx/compose/runtime/SlotTable;
/*      */     //   151	127	7	manager	Landroidx/compose/runtime/CompositionImpl$RememberEventDispatcher;
/*      */     //   82	203	5	deferredChanges	Landroidx/compose/runtime/changelist/ChangeList;
/*      */     //   110	175	6	nonEmptySlotTable	Z
/*      */     //   15	271	4	$i$a$-synchronized-CompositionImpl$dispose$1	I
/*      */     //   7	297	2	$i$f$synchronized	I
/*      */     //   5	299	1	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   0	316	0	this	Landroidx/compose/runtime/CompositionImpl;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   11	291	296	finally
/*      */     //   187	225	235	finally
/*      */     //   235	237	235	finally
/*      */     //   296	298	296	finally } public void recordModificationsOf(@NotNull Set values) { // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: ldc_w 'values'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: nop
/*      */     //   8: aload_0
/*      */     //   9: getfield pendingModifications : Landroidx/compose/runtime/AtomicReference;
/*      */     //   12: invokevirtual get : ()Ljava/lang/Object;
/*      */     //   15: astore_2
/*      */     //   16: aload_2
/*      */     //   17: astore #4
/*      */     //   19: aload #4
/*      */     //   21: dup
/*      */     //   22: ifnonnull -> 30
/*      */     //   25: pop
/*      */     //   26: iconst_1
/*      */     //   27: goto -> 36
/*      */     //   30: invokestatic access$getPendingApplyNoModifications$p : ()Ljava/lang/Object;
/*      */     //   33: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   36: ifeq -> 43
/*      */     //   39: aload_1
/*      */     //   40: goto -> 132
/*      */     //   43: aload #4
/*      */     //   45: instanceof java/util/Set
/*      */     //   48: ifeq -> 72
/*      */     //   51: iconst_2
/*      */     //   52: anewarray java/util/Set
/*      */     //   55: astore #5
/*      */     //   57: aload #5
/*      */     //   59: iconst_0
/*      */     //   60: aload_2
/*      */     //   61: aastore
/*      */     //   62: aload #5
/*      */     //   64: iconst_1
/*      */     //   65: aload_1
/*      */     //   66: aastore
/*      */     //   67: aload #5
/*      */     //   69: goto -> 132
/*      */     //   72: aload #4
/*      */     //   74: instanceof [Ljava/lang/Object;
/*      */     //   77: ifeq -> 98
/*      */     //   80: aload_2
/*      */     //   81: ldc_w 'null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>'
/*      */     //   84: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   87: aload_2
/*      */     //   88: checkcast [Ljava/util/Set;
/*      */     //   91: aload_1
/*      */     //   92: invokestatic plus : ([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
/*      */     //   95: goto -> 132
/*      */     //   98: new java/lang/IllegalStateException
/*      */     //   101: dup
/*      */     //   102: new java/lang/StringBuilder
/*      */     //   105: dup
/*      */     //   106: invokespecial <init> : ()V
/*      */     //   109: ldc_w 'corrupt pendingModifications: '
/*      */     //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   115: aload_0
/*      */     //   116: getfield pendingModifications : Landroidx/compose/runtime/AtomicReference;
/*      */     //   119: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*      */     //   122: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   125: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   128: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   131: athrow
/*      */     //   132: astore_3
/*      */     //   133: aload_0
/*      */     //   134: getfield pendingModifications : Landroidx/compose/runtime/AtomicReference;
/*      */     //   137: aload_2
/*      */     //   138: aload_3
/*      */     //   139: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   142: ifeq -> 7
/*      */     //   145: aload_2
/*      */     //   146: ifnonnull -> 194
/*      */     //   149: aload_0
/*      */     //   150: getfield lock : Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   153: astore #4
/*      */     //   155: iconst_0
/*      */     //   156: istore #5
/*      */     //   158: aload #4
/*      */     //   160: astore #6
/*      */     //   162: aload #6
/*      */     //   164: monitorenter
/*      */     //   165: nop
/*      */     //   166: iconst_0
/*      */     //   167: istore #7
/*      */     //   169: aload_0
/*      */     //   170: invokespecial drainPendingModificationsLocked : ()V
/*      */     //   173: nop
/*      */     //   174: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   177: astore #7
/*      */     //   179: aload #6
/*      */     //   181: monitorexit
/*      */     //   182: goto -> 193
/*      */     //   185: astore #7
/*      */     //   187: aload #6
/*      */     //   189: monitorexit
/*      */     //   190: aload #7
/*      */     //   192: athrow
/*      */     //   193: nop
/*      */     //   194: goto -> 197
/*      */     //   197: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #808	-> 7
/*      */     //   #809	-> 8
/*      */     //   #810	-> 16
/*      */     //   #811	-> 19
/*      */     //   #812	-> 43
/*      */     //   #813	-> 72
/*      */     //   #814	-> 102
/*      */     //   #810	-> 132
/*      */     //   #816	-> 133
/*      */     //   #817	-> 145
/*      */     //   #818	-> 149
/*      */     //   #1566	-> 158
/*      */     //   #819	-> 169
/*      */     //   #820	-> 173
/*      */     //   #1566	-> 177
/*      */     //   #1566	-> 193
/*      */     //   #822	-> 194
/*      */     //   #825	-> 197
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   169	5	7	$i$a$-synchronized-CompositionImpl$recordModificationsOf$1	I
/*      */     //   158	36	5	$i$f$synchronized	I
/*      */     //   155	39	4	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   16	181	2	old	Ljava/lang/Object;
/*      */     //   133	64	3	new	Ljava/lang/Object;
/*      */     //   0	198	0	this	Landroidx/compose/runtime/CompositionImpl;
/*      */     //   0	198	1	values	Ljava/util/Set;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   165	179	185	finally
/* 1567 */     //   185	187	185	finally } public boolean observesAnyOf(@NotNull Set values) { Intrinsics.checkNotNullParameter(values, "values"); Set $this$fastForEach$iv = values; int $i$f$fastForEach = 0; if ($this$fastForEach$iv instanceof ScatterSetWrapper)
/*      */     
/* 1569 */     { ScatterSet this_$iv$iv = ((ScatterSetWrapper)$this$fastForEach$iv).getSet$runtime(); int $i$f$forEach = 0;
/*      */       
/* 1571 */       Object[] k$iv$iv = this_$iv$iv.elements;
/*      */       
/* 1573 */       ScatterSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
/*      */       
/* 1575 */       long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1576 */       int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */       
/* 1578 */       int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1579 */           long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1580 */           long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1581 */           if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1582 */           { int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1583 */             for (int j$iv$iv$iv = 0;; j$iv$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1592 */             if (bitCount$iv$iv$iv == 8)
/*      */               continue;  break; }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }  // Byte code: goto -> 249
/*      */         }  }
/*      */       else {  }
/*      */        }
/* 1597 */     else { Iterable $this$forEach$iv$iv = $this$fastForEach$iv; int $i$f$forEach = 0;
/* 1598 */       Iterator iterator = $this$forEach$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv = iterator.next(), value = element$iv$iv; int $i$a$-fastForEach-CompositionImpl$observesAnyOf$1 = 0; if (this.observations.contains(value) || this.derivedStates.contains(value))
/*      */           return true;  }  }
/*      */      return false; } public void prepareCompose(@NotNull Function0<Unit> block) { Intrinsics.checkNotNullParameter(block, "block"); this.composer.prepareCompose$runtime(block); }
/* 1601 */   private final void addPendingInvalidationsLocked(Object value, boolean forgetConditionalScopes) { ScopeMap<Object, RecomposeScopeImpl> this_$iv = this.observations; int $i$f$forEachScopeOf = 0; Object value$iv = this_$iv.getMap().get(value);
/* 1602 */     if (value$iv != null)
/* 1603 */       if (value$iv instanceof MutableScatterSet)
/*      */       
/* 1605 */       { ScatterSet this_$iv$iv = (ScatterSet)value$iv; int $i$f$forEach = 0;
/*      */         
/* 1607 */         Object[] k$iv$iv = this_$iv$iv.elements;
/*      */         
/* 1609 */         ScatterSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
/*      */         
/* 1611 */         long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1612 */         int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */         
/* 1614 */         int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1615 */             long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1616 */             long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1617 */             if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1618 */             { int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1619 */               for (int j$iv$iv$iv = 0;; j$iv$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 1628 */               if (bitCount$iv$iv$iv == 8)
/*      */                 continue;  break; }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }  // Byte code: goto -> 300
/*      */           }  }
/*      */         else {  }
/*      */          }
/* 1633 */       else { RecomposeScopeImpl scope = (RecomposeScopeImpl)value$iv; int $i$a$-forEachScopeOf-CompositionImpl$addPendingInvalidationsLocked$1 = 0; if (!this.observationsProcessed.remove(value, scope) && scope.invalidateForResult(value) != InvalidationResult.IGNORED)
/*      */           if (scope.isConditional() && !forgetConditionalScopes) { this.conditionallyInvalidatedScopes.add(scope); }
/*      */           else { this.invalidatedScopes.add(scope); }
/*      */             }
/* 1637 */         } private final void addPendingInvalidationsLocked(Set values, boolean forgetConditionalScopes) { Set $this$fastForEach$iv = values; int $i$f$fastForEach = 0; if ($this$fastForEach$iv instanceof ScatterSetWrapper)
/*      */     
/* 1639 */     { ScatterSet this_$iv$iv = ((ScatterSetWrapper)$this$fastForEach$iv).getSet$runtime(); int $i$f$forEach = 0;
/*      */       
/* 1641 */       Object[] k$iv$iv = this_$iv$iv.elements;
/*      */       
/* 1643 */       ScatterSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
/*      */       
/* 1645 */       long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1646 */       int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */       
/* 1648 */       int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1649 */           long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1650 */           long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1651 */           if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1652 */           { int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1653 */             for (int j$iv$iv$iv = 0;; j$iv$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1698 */             if (bitCount$iv$iv$iv == 8)
/*      */               continue;  break; }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }  // Byte code: goto -> 520
/*      */         }  }
/*      */       else {  }
/*      */        }
/* 1703 */     else { Iterable $this$forEach$iv$iv = $this$fastForEach$iv; int $i$f$forEach = 0;
/* 1704 */       Iterator iterator = $this$forEach$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv = iterator.next(), value = element$iv$iv; int $i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2 = 0; if (value instanceof RecomposeScopeImpl) { ((RecomposeScopeImpl)value).invalidateForResult(null); }
/*      */         else { addPendingInvalidationsLocked(value, forgetConditionalScopes); ScopeMap<Object, DerivedState<?>> this_$iv = this.derivedStates; int $i$f$forEachScopeOf = 0; Object value$iv = this_$iv.getMap().get(value); if (value$iv != null)
/* 1706 */             if (value$iv instanceof MutableScatterSet) { ScatterSet this_$iv$iv = (ScatterSet)value$iv; int i = 0; Object[] k$iv$iv = this_$iv$iv.elements;
/*      */               
/* 1708 */               ScatterSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
/*      */               
/* 1710 */               long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1711 */               int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */               
/* 1713 */               int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true)
/* 1714 */                 { long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1715 */                   long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1716 */                   if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1717 */                   { int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1718 */                     for (int j$iv$iv$iv = 0;; j$iv$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     
/* 1727 */                     if (bitCount$iv$iv$iv == 8)
/*      */                       continue;  break; }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }  // Byte code: goto -> 847 }  } else {  }
/*      */                }
/*      */             else { DerivedState it = (DerivedState)value$iv; int $i$a$-forEachScopeOf-CompositionImpl$addPendingInvalidationsLocked$2$1 = 0; addPendingInvalidationsLocked(it, forgetConditionalScopes); }
/*      */               }
/*      */          }
/*      */        }
/* 1734 */      MutableScatterSet<RecomposeScopeImpl> conditionallyInvalidatedScopes = this.conditionallyInvalidatedScopes; MutableScatterSet<RecomposeScopeImpl> invalidatedScopes = this.invalidatedScopes; if (forgetConditionalScopes && conditionallyInvalidatedScopes.isNotEmpty()) { ScopeMap<Object, RecomposeScopeImpl> this_$iv = this.observations; int $i$f$removeScopeIf = 0; MutableScatterMap this_$iv$iv = this_$iv.getMap(); int $i$f$removeIf = 0;
/* 1735 */       ScatterMap this_$iv$iv$iv = (ScatterMap)this_$iv$iv; int $i$f$forEachIndexed = 0;
/* 1736 */       long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1737 */       int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */       
/* 1739 */       int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1740 */           long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1741 */           long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1742 */           if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1743 */           { int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31); int j$iv$iv$iv;
/* 1744 */             label245: for (j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
/* 1745 */               long value$iv$iv$iv$iv = slot$iv$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1746 */               if ((value$iv$iv$iv$iv < 128L)) {
/* 1747 */                 int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
/* 1748 */                 int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv$iv = 0;
/* 1749 */                 Object object = this_$iv$iv.values[index$iv$iv]; this_$iv$iv.keys[index$iv$iv]; int $i$a$-removeIf-ScopeMap$removeScopeIf$1$iv = 0;
/* 1750 */                 if (object instanceof MutableScatterSet)
/*      */                 
/*      */                 { 
/* 1753 */                   Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>"); MutableScatterSet set$iv = (MutableScatterSet)object;
/* 1754 */                   MutableScatterSet mutableScatterSet1 = set$iv; int i = 0;
/* 1755 */                   Object[] elements$iv$iv = mutableScatterSet1.elements;
/* 1756 */                   ScatterSet scatterSet = (ScatterSet)mutableScatterSet1; int $i$f$forEachIndex = 0;
/*      */                   
/* 1758 */                   long[] arrayOfLong = scatterSet.metadata;
/* 1759 */                   int j = arrayOfLong.length - 2;
/*      */                   
/* 1761 */                   int k = 0; if (k <= j) { while (true) {
/* 1762 */                       long l1 = arrayOfLong[k];
/* 1763 */                       long l2 = l1; int m = 0;
/* 1764 */                       if ((l2 & (l2 ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1765 */                         int n = 8 - ((k - j ^ 0xFFFFFFFF) >>> 31);
/* 1766 */                         for (int i1 = 0; i1 < n; i1++) {
/* 1767 */                           long l4 = l1 & 0xFFL; int i2 = 0;
/* 1768 */                           if ((l4 < 128L)) {
/* 1769 */                             int i3 = (k << 3) + i1;
/* 1770 */                             int i4 = i3, $i$a$-forEachIndex-MutableScatterSet$removeIf$1$iv$iv = 0;
/* 1771 */                             RecomposeScopeImpl scope = (RecomposeScopeImpl)elements$iv$iv[i4]; int $i$a$-removeScopeIf-CompositionImpl$addPendingInvalidationsLocked$3 = 0; if ((conditionallyInvalidatedScopes.contains(scope) || invalidatedScopes.contains(scope))) {
/* 1772 */                               mutableScatterSet1.removeElementAt(i4);
/*      */                             }
/*      */                           } 
/* 1775 */                           long l3 = l1 >> 8L;
/*      */                         } 
/* 1777 */                         if (n == 8)
/*      */                           continue;  break;
/*      */                       }  continue; if (k != j) { k++; continue; }
/*      */                        continue label245;
/*      */                     }  }
/*      */                   else
/*      */                   {  }
/*      */                    }
/*      */                 else
/* 1786 */                 { Intrinsics.checkNotNull(object, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2"); RecomposeScopeImpl scope = (RecomposeScopeImpl)object; int $i$a$-removeScopeIf-CompositionImpl$addPendingInvalidationsLocked$3 = 0; }  if ((conditionallyInvalidatedScopes.contains(scope) || invalidatedScopes.contains(scope))) {
/* 1787 */                   this_$iv$iv.removeValueAt(index$iv$iv);
/*      */                 }
/*      */               } 
/* 1790 */               slot$iv$iv$iv >>= 8L;
/*      */             } 
/* 1792 */             if (bitCount$iv$iv$iv == 8)
/*      */               continue;  break; }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*      */            // Byte code: goto -> 1441
/*      */         }  }
/*      */       else {  }
/*      */        conditionallyInvalidatedScopes.clear(); cleanUpDerivedStateObservations(); }
/* 1798 */     else if (invalidatedScopes.isNotEmpty()) { ScopeMap<Object, RecomposeScopeImpl> this_$iv = this.observations; int $i$f$removeScopeIf = 0; MutableScatterMap this_$iv$iv = this_$iv.getMap(); int $i$f$removeIf = 0;
/* 1799 */       ScatterMap this_$iv$iv$iv = (ScatterMap)this_$iv$iv; int $i$f$forEachIndexed = 0;
/* 1800 */       long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1801 */       int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */       
/* 1803 */       int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1804 */           long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1805 */           long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1806 */           if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1807 */           { int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31); int j$iv$iv$iv;
/* 1808 */             label240: for (j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
/* 1809 */               long value$iv$iv$iv$iv = slot$iv$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1810 */               if ((value$iv$iv$iv$iv < 128L)) {
/* 1811 */                 int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
/* 1812 */                 int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv$iv = 0;
/* 1813 */                 Object value$iv = this_$iv$iv.values[index$iv$iv]; this_$iv$iv.keys[index$iv$iv]; int $i$a$-removeIf-ScopeMap$removeScopeIf$1$iv = 0;
/* 1814 */                 if (value$iv instanceof MutableScatterSet)
/*      */                 
/*      */                 { 
/* 1817 */                   Intrinsics.checkNotNull(value$iv, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>"); MutableScatterSet set$iv = (MutableScatterSet)value$iv;
/* 1818 */                   MutableScatterSet mutableScatterSet1 = set$iv; int i = 0;
/* 1819 */                   Object[] elements$iv$iv = mutableScatterSet1.elements;
/* 1820 */                   ScatterSet scatterSet = (ScatterSet)mutableScatterSet1; int $i$f$forEachIndex = 0;
/*      */                   
/* 1822 */                   long[] arrayOfLong = scatterSet.metadata;
/* 1823 */                   int j = arrayOfLong.length - 2;
/*      */                   
/* 1825 */                   int k = 0; if (k <= j) { while (true) {
/* 1826 */                       long l1 = arrayOfLong[k];
/* 1827 */                       long l2 = l1; int m = 0;
/* 1828 */                       if ((l2 & (l2 ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1829 */                         int n = 8 - ((k - j ^ 0xFFFFFFFF) >>> 31);
/* 1830 */                         for (int i1 = 0;; i1++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                         
/* 1841 */                         if (n == 8)
/*      */                           continue;  break;
/*      */                       }  continue; if (k != j) { k++; continue; }
/*      */                        continue label240;
/*      */                     }  }
/*      */                   else
/*      */                   {  }
/*      */                    }
/*      */                 else
/* 1850 */                 { Intrinsics.checkNotNull(value$iv, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2"); RecomposeScopeImpl scope = (RecomposeScopeImpl)value$iv; int $i$a$-removeScopeIf-CompositionImpl$addPendingInvalidationsLocked$4 = 0; }  if (invalidatedScopes.contains(scope)) {
/* 1851 */                   this_$iv$iv.removeValueAt(index$iv$iv);
/*      */                 }
/*      */               } 
/* 1854 */               slot$iv$iv$iv >>= 8L;
/*      */             } 
/* 1856 */             if (bitCount$iv$iv$iv == 8)
/*      */               continue;  break; }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*      */            // Byte code: goto -> 1969
/*      */         }  }
/*      */       else {  }
/*      */        cleanUpDerivedStateObservations(); invalidatedScopes.clear(); }
/* 1862 */      } private final void cleanUpDerivedStateObservations() { ScopeMap<Object, DerivedState<?>> this_$iv = this.derivedStates; int $i$f$removeScopeIf = 0; MutableScatterMap this_$iv$iv = this_$iv.getMap(); int $i$f$removeIf = 0;
/* 1863 */     ScatterMap this_$iv$iv$iv = (ScatterMap)this_$iv$iv; int $i$f$forEachIndexed = 0;
/* 1864 */     long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1865 */     int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */     
/* 1867 */     int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1868 */         long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1869 */         long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1870 */         if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1871 */           int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1872 */           for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
/* 1873 */             long value$iv$iv$iv$iv = slot$iv$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1874 */             if ((value$iv$iv$iv$iv < 128L)) {
/* 1875 */               int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
/* 1876 */               int index$iv$iv = index$iv$iv$iv, $i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv$iv = 0;
/* 1877 */               Object object = this_$iv$iv.values[index$iv$iv]; this_$iv$iv.keys[index$iv$iv]; int $i$a$-removeIf-ScopeMap$removeScopeIf$1$iv = 0;
/* 1878 */               if (object instanceof MutableScatterSet)
/*      */               
/*      */               { 
/* 1881 */                 Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>"); MutableScatterSet set$iv = (MutableScatterSet)object;
/* 1882 */                 MutableScatterSet mutableScatterSet1 = set$iv; int i = 0;
/* 1883 */                 Object[] elements$iv$iv = mutableScatterSet1.elements;
/* 1884 */                 ScatterSet scatterSet = (ScatterSet)mutableScatterSet1; int $i$f$forEachIndex = 0;
/*      */                 
/* 1886 */                 long[] arrayOfLong = scatterSet.metadata;
/* 1887 */                 int j = arrayOfLong.length - 2;
/*      */                 
/* 1889 */                 int k = 0; if (k <= j) { while (true) {
/* 1890 */                     long l1 = arrayOfLong[k];
/* 1891 */                     long l2 = l1; int m = 0;
/*      */ 
/*      */ 
/*      */                   
/*      */                   }
/*      */ 
/*      */                   
/*      */                    }
/*      */                 
/*      */                 else
/*      */                 
/*      */                 { 
/*      */ 
/*      */ 
/*      */                   
/*      */                    }
/*      */ 
/*      */ 
/*      */                 
/*      */                  }
/*      */               
/*      */               else
/*      */               
/*      */               { 
/*      */                 
/* 1916 */                 Intrinsics.checkNotNull(object, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2"); DerivedState derivedState = (DerivedState)object; int $i$a$-removeScopeIf-CompositionImpl$cleanUpDerivedStateObservations$1 = 0; }  if (!this.observations.contains(derivedState)) {
/* 1917 */                 this_$iv$iv.removeValueAt(index$iv$iv);
/*      */               }
/*      */             } 
/* 1920 */             slot$iv$iv$iv >>= 8L;
/*      */           } 
/* 1922 */           if (bitCount$iv$iv$iv == 8)
/*      */             continue;  break;
/*      */         }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }
/*      */          // Byte code: goto -> 518
/*      */       }  }
/*      */     else {  }
/* 1928 */      if (this.conditionallyInvalidatedScopes.isNotEmpty()) { MutableScatterSet<RecomposeScopeImpl> mutableScatterSet = this.conditionallyInvalidatedScopes; int i = 0; Object[] elements$iv = mutableScatterSet.elements;
/* 1929 */       ScatterSet scatterSet = (ScatterSet)mutableScatterSet; int $i$f$forEachIndex = 0;
/*      */       
/* 1931 */       long[] m$iv$iv = scatterSet.metadata;
/* 1932 */       int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */       
/* 1934 */       int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1935 */           long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1936 */           long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1937 */           if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1938 */           { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1939 */             for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
/* 1940 */               long value$iv$iv$iv = slot$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1941 */               if ((value$iv$iv$iv < 128L)) {
/* 1942 */                 int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
/* 1943 */                 int index$iv = index$iv$iv, $i$a$-forEachIndex-MutableScatterSet$removeIf$1$iv = 0;
/* 1944 */                 RecomposeScopeImpl scope = (RecomposeScopeImpl)elements$iv[index$iv]; int $i$a$-removeIf-CompositionImpl$cleanUpDerivedStateObservations$2 = 0; if (!scope.isConditional()) {
/* 1945 */                   mutableScatterSet.removeElementAt(index$iv);
/*      */                 }
/*      */               } 
/* 1948 */               slot$iv$iv >>= 8L;
/*      */             } 
/* 1950 */             if (bitCount$iv$iv == 8)
/*      */               continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 752
/*      */         }  }
/*      */       else {  }
/*      */        }
/* 1955 */      } public void recordReadOf(@NotNull Object value) { Intrinsics.checkNotNullParameter(value, "value"); if (!getAreChildrenComposing()) { RecomposeScopeImpl it = this.composer.getCurrentRecomposeScope$runtime(); int $i$a$-let-CompositionImpl$recordReadOf$1 = 0; it.setUsed(true); boolean alreadyRead = it.recordRead(value); if (!alreadyRead) { if (value instanceof StateObjectImpl) { ReaderKind.Companion this_$iv = ReaderKind.Companion; int $i$f$getComposition-6f8NoZ8 = 0; ((StateObjectImpl)value).recordReadIn-h_f27i8$runtime(ReaderKind.constructor-impl(1)); }
/* 1956 */          this.observations.add(value, it); if (value instanceof DerivedState) { DerivedState.Record record = ((DerivedState)value).getCurrentRecord(); this.derivedStates.removeScope(value); ObjectIntMap<StateObject> this_$iv = record.getDependencies(); int $i$f$forEachKey = 0; Object[] k$iv = this_$iv.keys;
/*      */           
/* 1958 */           ObjectIntMap<StateObject> this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1959 */           long[] m$iv$iv = this_$iv$iv.metadata;
/* 1960 */           int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */           
/* 1962 */           int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true)
/* 1963 */             { long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1964 */               long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1965 */               if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1966 */               { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1967 */                 for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/* 1977 */                 if (bitCount$iv$iv == 8)
/*      */                   continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 350 }  } else {  }
/*      */            it.recordDerivedStateValue((DerivedState)value, record.getCurrentValue()); }
/*      */          }
/*      */        this.composer.getCurrentRecomposeScope$runtime(); }
/* 1982 */      } private final void invalidateScopeOfLocked(Object value) { ScopeMap<Object, RecomposeScopeImpl> this_$iv = this.observations; int $i$f$forEachScopeOf = 0; Object value$iv = this_$iv.getMap().get(value);
/* 1983 */     if (value$iv != null)
/* 1984 */       if (value$iv instanceof MutableScatterSet)
/*      */       
/* 1986 */       { ScatterSet this_$iv$iv = (ScatterSet)value$iv; int $i$f$forEach = 0;
/*      */         
/* 1988 */         Object[] k$iv$iv = this_$iv$iv.elements;
/*      */         
/* 1990 */         ScatterSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
/*      */         
/* 1992 */         long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1993 */         int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */         
/* 1995 */         int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1996 */             long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1997 */             long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1998 */             if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1999 */             { int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 2000 */               for (int j$iv$iv$iv = 0;; j$iv$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 2009 */               if (bitCount$iv$iv$iv == 8)
/*      */                 continue;  break; }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }  // Byte code: goto -> 261
/*      */           }  }
/*      */         else {  }
/*      */          }
/* 2014 */       else { RecomposeScopeImpl scope = (RecomposeScopeImpl)value$iv; int $i$a$-forEachScopeOf-CompositionImpl$invalidateScopeOfLocked$1 = 0; if (scope.invalidateForResult(value) == InvalidationResult.IMMINENT)
/*      */           this.observationsProcessed.add(value, scope);  }
/*      */         } public void recordWriteOf(@NotNull Object value) { Intrinsics.checkNotNullParameter(value, "value"); SynchronizedObject lock$iv = this.lock;
/*      */     int $i$f$synchronized = 0;
/* 2018 */     synchronized (lock$iv) { int $i$a$-synchronized-CompositionImpl$recordWriteOf$1 = 0; invalidateScopeOfLocked(value); ScopeMap<Object, DerivedState<?>> this_$iv = this.derivedStates; int $i$f$forEachScopeOf = 0;
/* 2019 */       Object value$iv = this_$iv.getMap().get(value);
/* 2020 */       if (value$iv != null)
/* 2021 */         if (value$iv instanceof MutableScatterSet)
/*      */         
/* 2023 */         { ScatterSet this_$iv$iv = (ScatterSet)value$iv; int $i$f$forEach = 0;
/*      */           
/* 2025 */           Object[] k$iv$iv = this_$iv$iv.elements;
/*      */           
/* 2027 */           ScatterSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
/*      */           
/* 2029 */           long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 2030 */           int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */           
/* 2032 */           int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 2033 */               long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 2034 */               long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 2035 */               if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 2036 */               { int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 2037 */                 for (int j$iv$iv$iv = 0;; j$iv$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/* 2046 */                 if (bitCount$iv$iv$iv == 8)
/*      */                   continue;  break; }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }  // Byte code: goto -> 277
/*      */             }  }
/*      */           else {  }
/*      */            }
/* 2051 */         else { DerivedState it = (DerivedState)value$iv; int $i$a$-forEachScopeOf-CompositionImpl$recordWriteOf$1$1 = 0; invalidateScopeOfLocked(it); }
/*      */           Unit unit = Unit.INSTANCE; }
/*      */      } public boolean recompose() { SynchronizedObject lock$iv = this.lock;
/*      */     int $i$f$synchronized = 0;
/* 2055 */     synchronized (lock$iv) { boolean bool2; int $i$a$-synchronized-CompositionImpl$recompose$1 = 0; drainPendingModificationsForCompositionLocked(); CompositionImpl this_$iv = this; int $i$f$guardChanges = 0; 
/*      */       try { boolean bool3;
/* 2057 */         CompositionImpl this_$iv$iv = this_$iv; int $i$f$trackAbandonedValues = 0;
/* 2058 */         boolean success$iv$iv = false; try {
/*      */           boolean bool4;
/* 2060 */           int $i$a$-guardChanges-CompositionImpl$recompose$1$1 = 0; CompositionImpl compositionImpl = this; int $i$f$guardInvalidationsLocked = 0;
/* 2061 */           ScopeMap<RecomposeScopeImpl, Object> invalidations$iv = compositionImpl.takeInvalidations();
/*      */           
/* 2063 */           try { ScopeMap<RecomposeScopeImpl, Object> invalidations = invalidations$iv; int $i$a$-guardInvalidationsLocked-CompositionImpl$recompose$1$1$1 = 0; CompositionObserver observer = observer(); if (observer != null) { Intrinsics.checkNotNull(invalidations.asMap(), "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>"); observer.onBeginComposition(this, invalidations.asMap()); } else {  }  boolean bool5 = this.composer.recompose$runtime(invalidations), shouldDrain = bool5; int $i$a$-also-CompositionImpl$recompose$1$1$1$1 = 0; if (!shouldDrain) drainPendingModificationsLocked();  if (observer != null) { observer.onEndComposition(this); } else {  }  bool4 = bool5; }
/* 2064 */           catch (Exception e$iv)
/* 2065 */           { compositionImpl.invalidations = invalidations$iv;
/* 2066 */             throw e$iv; }  boolean it$iv$iv = bool3 = bool4; int $i$a$-also-CompositionImpl$trackAbandonedValues$1$iv$iv = 0;
/* 2067 */           success$iv$iv = true;
/*      */           bool3 = bool3;
/*      */         } finally {
/* 2070 */           if (!success$iv$iv && (!this_$iv$iv.abandonSet.isEmpty())) {
/* 2071 */             (new RememberEventDispatcher(this_$iv$iv.abandonSet)).dispatchAbandons();
/*      */           }
/*      */         }  }
/* 2074 */       catch (Exception e$iv)
/* 2075 */       { this_$iv.abandonChanges();
/* 2076 */         throw e$iv; }  boolean bool1 = bool2; }
/*      */      return bool1; } public void insertMovableContent(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> references) { Intrinsics.checkNotNullParameter(references, "references"); List<Pair<MovableContentStateReference, MovableContentStateReference>> $this$fastAll$iv = references;
/*      */     int $i$f$fastAll = 0;
/* 2079 */     List<Pair<MovableContentStateReference, MovableContentStateReference>> $this$fastForEach$iv$iv = $this$fastAll$iv; int $i$f$fastForEach = 0;
/*      */     
/* 2081 */     int index$iv$iv = 0, i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2086 */     ComposerKt.runtimeCheck(true); CompositionImpl this_$iv = this; int $i$f$guardChanges = 0; try {
/*      */       Object object1, item$iv$iv;
/* 2088 */       CompositionImpl this_$iv$iv = this_$iv; int $i$f$trackAbandonedValues = 0;
/* 2089 */       boolean success$iv$iv = false;
/*      */       try {
/* 2091 */         int $i$a$-guardChanges-CompositionImpl$insertMovableContent$2 = 0; this.composer.insertMovableContentReferences(references); Object it$iv$iv = item$iv$iv = Unit.INSTANCE; int $i$a$-also-CompositionImpl$trackAbandonedValues$1$iv$iv = 0;
/* 2092 */         success$iv$iv = true;
/*      */         item$iv$iv = item$iv$iv;
/*      */       } finally {
/* 2095 */         if (!success$iv$iv && (!this_$iv$iv.abandonSet.isEmpty())) {
/* 2096 */           (new RememberEventDispatcher(this_$iv$iv.abandonSet)).dispatchAbandons();
/*      */         }
/*      */       } 
/* 2099 */     } catch (Exception e$iv) {
/* 2100 */       this_$iv.abandonChanges();
/* 2101 */       throw e$iv;
/*      */     }  } public void disposeUnusedMovableContent(@NotNull MovableContentState state) { Intrinsics.checkNotNullParameter(state, "state"); RememberEventDispatcher manager = new RememberEventDispatcher(this.abandonSet); SlotTable slotTable = state.getSlotTable$runtime(); SlotTable this_$iv = slotTable;
/*      */     int $i$f$write = 0;
/* 2104 */     SlotWriter writer$iv = this_$iv.openWriter(); int $i$a$-let-SlotTable$write$1$iv = 0;
/* 2105 */     boolean normalClose$iv = false;
/*      */     
/* 2107 */     try { SlotWriter writer = writer$iv; int $i$a$-write-CompositionImpl$disposeUnusedMovableContent$1 = 0; ComposerKt.removeCurrentGroup(writer, manager); Unit unit = Unit.INSTANCE; Object it$iv = unit;
/* 2108 */       int $i$a$-also-SlotTable$write$1$1$iv = 0; normalClose$iv = true; unit = unit;
/* 2109 */       writer$iv.close(normalClose$iv); } finally { writer$iv.close(normalClose$iv); }
/*      */      } private final void applyChangesInLocked(ChangeList changes) { RememberEventDispatcher manager = new RememberEventDispatcher(this.abandonSet); try {
/*      */       if (changes.isEmpty())
/* 2112 */         return;  String sectionName$iv = "Compose:applyChanges"; int $i$f$trace = 0; Object token$iv = Trace.INSTANCE.beginSection(sectionName$iv);
/*      */       
/* 2114 */       try { int $i$a$-trace-CompositionImpl$applyChangesInLocked$1 = 0; this.applier.onBeginChanges(); SlotTable this_$iv = this.slotTable;
/*      */         int $i$f$write = 0;
/* 2116 */         SlotWriter writer$iv = this_$iv.openWriter(); int $i$a$-let-SlotTable$write$1$iv = 0;
/* 2117 */         boolean normalClose$iv = false;
/*      */         
/* 2119 */         try { SlotWriter slots = writer$iv; int $i$a$-write-CompositionImpl$applyChangesInLocked$1$1 = 0; changes.executeAndFlushAllPendingChanges(this.applier, slots, manager); Unit unit1 = Unit.INSTANCE; Object it$iv = unit1;
/* 2120 */           int $i$a$-also-SlotTable$write$1$1$iv = 0; normalClose$iv = true; unit1 = unit1;
/* 2121 */           writer$iv.close(normalClose$iv); } finally { writer$iv.close(normalClose$iv); }
/*      */         
/*      */         Unit unit = Unit.INSTANCE;
/* 2124 */         Trace.INSTANCE.endSection(token$iv); } finally { Trace.INSTANCE.endSection(token$iv); }
/* 2125 */        manager.dispatchSideEffects(); if (this.pendingInvalidScopes) { sectionName$iv = "Compose:unobserve"; $i$f$trace = 0; token$iv = Trace.INSTANCE.beginSection(sectionName$iv); }
/*      */     
/*      */     } finally {
/*      */       if (this.lateChanges.isEmpty()) {
/*      */         manager.dispatchAbandons();
/*      */       }
/*      */     }  }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void applyChanges()
/*      */   {
/*      */     SynchronizedObject lock$iv = this.lock;
/*      */     int $i$f$synchronized = 0;
/* 2195 */     synchronized (lock$iv) { int $i$a$-synchronized-CompositionImpl$applyChanges$1 = 0; CompositionImpl this_$iv = this; int $i$f$guardChanges = 0; try {
/*      */         Unit unit1, unit2;
/* 2197 */         CompositionImpl this_$iv$iv = this_$iv; int $i$f$trackAbandonedValues = 0;
/* 2198 */         boolean success$iv$iv = false;
/*      */         try {
/* 2200 */           int $i$a$-guardChanges-CompositionImpl$applyChanges$1$1 = 0; applyChangesInLocked(this.changes); drainPendingModificationsLocked(); Object it$iv$iv = unit2 = Unit.INSTANCE; int $i$a$-also-CompositionImpl$trackAbandonedValues$1$iv$iv = 0;
/* 2201 */           success$iv$iv = true;
/*      */           unit2 = unit2;
/*      */         } finally {
/* 2204 */           if (!success$iv$iv && (!this_$iv$iv.abandonSet.isEmpty())) {
/* 2205 */             (new RememberEventDispatcher(this_$iv$iv.abandonSet)).dispatchAbandons();
/*      */           }
/*      */         } 
/* 2208 */       } catch (Exception e$iv) {
/* 2209 */         this_$iv.abandonChanges();
/* 2210 */         throw e$iv;
/*      */       }  Unit unit = Unit.INSTANCE; }
/* 2212 */      } public void applyLateChanges() { SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-CompositionImpl$applyLateChanges$1 = 0; CompositionImpl this_$iv = this; int $i$f$guardChanges = 0; try {
/*      */         Unit unit1, unit2;
/* 2214 */         CompositionImpl this_$iv$iv = this_$iv; int $i$f$trackAbandonedValues = 0;
/* 2215 */         boolean success$iv$iv = false;
/*      */         try {
/* 2217 */           int $i$a$-guardChanges-CompositionImpl$applyLateChanges$1$1 = 0; if (this.lateChanges.isNotEmpty()) applyChangesInLocked(this.lateChanges);  Object it$iv$iv = unit2 = Unit.INSTANCE; int $i$a$-also-CompositionImpl$trackAbandonedValues$1$iv$iv = 0;
/* 2218 */           success$iv$iv = true;
/*      */           unit2 = unit2;
/*      */         } finally {
/* 2221 */           if (!success$iv$iv && (!this_$iv$iv.abandonSet.isEmpty())) {
/* 2222 */             (new RememberEventDispatcher(this_$iv$iv.abandonSet)).dispatchAbandons();
/*      */           }
/*      */         } 
/* 2225 */       } catch (Exception e$iv) {
/* 2226 */         this_$iv.abandonChanges();
/* 2227 */         throw e$iv;
/*      */       }  Unit unit = Unit.INSTANCE; }
/* 2229 */      } public void changesApplied() { SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-CompositionImpl$changesApplied$1 = 0; CompositionImpl this_$iv = this; int $i$f$guardChanges = 0; 
/*      */       try { Unit unit1, unit2;
/* 2231 */         CompositionImpl this_$iv$iv = this_$iv; int $i$f$trackAbandonedValues = 0;
/* 2232 */         boolean success$iv$iv = false;
/*      */         try {
/* 2234 */           int $i$a$-guardChanges-CompositionImpl$changesApplied$1$1 = 0; this.composer.changesApplied$runtime(); if (!this.abandonSet.isEmpty()) (new RememberEventDispatcher(this.abandonSet)).dispatchAbandons();  Object it$iv$iv = unit2 = Unit.INSTANCE; int $i$a$-also-CompositionImpl$trackAbandonedValues$1$iv$iv = 0;
/* 2235 */           success$iv$iv = true;
/*      */           unit2 = unit2;
/*      */         } finally {
/* 2238 */           if (!success$iv$iv && (!this_$iv$iv.abandonSet.isEmpty())) {
/* 2239 */             (new RememberEventDispatcher(this_$iv$iv.abandonSet)).dispatchAbandons();
/*      */           }
/*      */         }  }
/* 2242 */       catch (Exception e$iv)
/* 2243 */       { this_$iv.abandonChanges();
/* 2244 */         throw e$iv; }  Unit unit = Unit.INSTANCE; }  } private final <T> T guardInvalidationsLocked(Function1 block) { Object object; int $i$f$guardInvalidationsLocked = 0; ScopeMap<RecomposeScopeImpl, Object> invalidations = takeInvalidations(); try { object = block.invoke(invalidations); } catch (Exception e) { this.invalidations = invalidations; throw e; }
/*      */      return (T)object; }
/* 2246 */   private final <T> T guardChanges(Function0 block) { Object object; int $i$f$guardChanges = 0; try { Object object1; CompositionImpl this_$iv = this; int $i$f$trackAbandonedValues = 0; boolean success$iv = false;
/*      */       
/* 2248 */       try { Object it$iv = object1 = block.invoke(); int $i$a$-also-CompositionImpl$trackAbandonedValues$1$iv = 0;
/* 2249 */         success$iv = true; }
/*      */       finally
/*      */       
/* 2252 */       { InlineMarker.finallyStart(1); if (!success$iv && (!this_$iv.abandonSet.isEmpty()))
/* 2253 */           (new RememberEventDispatcher(this_$iv.abandonSet)).dispatchAbandons();  InlineMarker.finallyEnd(1); }  object = object1; } catch (Exception e) { abandonChanges(); throw e; }
/*      */      return (T)object; } public void abandonChanges() { this.pendingModifications.set(null); this.changes.clear(); this.lateChanges.clear(); if (!this.abandonSet.isEmpty())
/*      */       (new RememberEventDispatcher(this.abandonSet)).dispatchAbandons();  }
/* 2256 */   public void invalidateAll() { SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-CompositionImpl$invalidateAll$1 = 0; Object[] $this$forEach$iv = this.slotTable.getSlots(); int $i$f$forEach = 0;
/* 2257 */       byte b = 0; int i = $this$forEach$iv.length; if (b < i) { Object element$iv = $this$forEach$iv[b], it = element$iv; int $i$a$-forEach-CompositionImpl$invalidateAll$1$1 = 0; }
/*      */        Unit unit = Unit.INSTANCE; }
/* 2259 */      } public void verifyConsistent() { SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-CompositionImpl$verifyConsistent$1 = 0; if (!isComposing()) { this.composer.verifyConsistent$runtime(); this.slotTable.verifyWellFormed(); validateRecomposeScopeAnchors(this.slotTable); }  Unit unit = Unit.INSTANCE; }  } public <R> R delegateInvalidations(@Nullable ControlledComposition to, int groupIndex, @NotNull Function0 block) { Object object; Intrinsics.checkNotNullParameter(block, "block"); this.invalidationDelegate = (CompositionImpl)to; this.invalidationDelegateGroup = groupIndex; try { object = block.invoke(); } finally { this.invalidationDelegate = null; this.invalidationDelegateGroup = 0; }  return (to != null && !Intrinsics.areEqual(to, this) && groupIndex >= 0) ? (R)object : (R)block.invoke(); }
/* 2260 */   @NotNull public InvalidationResult invalidate(@NotNull RecomposeScopeImpl scope, @Nullable Object instance) { Intrinsics.checkNotNullParameter(scope, "scope"); if (scope.getDefaultsInScope()) scope.setDefaultsInvalid(true);  Anchor anchor = scope.getAnchor(); if (anchor == null || !anchor.getValid()) return InvalidationResult.IGNORED;  if (!this.slotTable.ownsAnchor(anchor)) { SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-CompositionImpl$invalidate$delegate$1 = 0; CompositionImpl compositionImpl = this.invalidationDelegate; }  CompositionImpl delegate = compositionImpl;
/*      */       if ((delegate != null) ? ((delegate.tryImminentInvalidation(scope, instance) == true)) : false)
/*      */         return InvalidationResult.IMMINENT; 
/*      */       return InvalidationResult.IGNORED; }
/*      */     
/*      */     if (!scope.getCanRecompose())
/*      */       return InvalidationResult.IGNORED; 
/*      */     return invalidateChecked(scope, anchor, instance); }
/*      */   
/*      */   public void recomposeScopeReleased(@NotNull RecomposeScopeImpl scope) {
/*      */     Intrinsics.checkNotNullParameter(scope, "scope");
/*      */     this.pendingInvalidScopes = true;
/*      */   }
/*      */   @Nullable
/*      */   public <T> T getCompositionService(@NotNull CompositionServiceKey key) {
/*      */     Intrinsics.checkNotNullParameter(key, "key");
/*      */     return Intrinsics.areEqual(key, CompositionKt.getCompositionImplServiceKey()) ? (T)this : null;
/*      */   }
/*      */   private final boolean tryImminentInvalidation(RecomposeScopeImpl scope, Object instance) {
/*      */     return (isComposing() && this.composer.tryImminentInvalidation$runtime(scope, instance));
/*      */   }
/*      */   private final InvalidationResult invalidateChecked(RecomposeScopeImpl scope, Anchor anchor, Object instance) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield lock : Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   4: astore #5
/*      */     //   6: iconst_0
/*      */     //   7: istore #6
/*      */     //   9: aload #5
/*      */     //   11: astore #7
/*      */     //   13: aload #7
/*      */     //   15: monitorenter
/*      */     //   16: nop
/*      */     //   17: iconst_0
/*      */     //   18: istore #8
/*      */     //   20: aload_0
/*      */     //   21: getfield invalidationDelegate : Landroidx/compose/runtime/CompositionImpl;
/*      */     //   24: dup
/*      */     //   25: ifnull -> 58
/*      */     //   28: astore #9
/*      */     //   30: iconst_0
/*      */     //   31: istore #10
/*      */     //   33: aload_0
/*      */     //   34: getfield slotTable : Landroidx/compose/runtime/SlotTable;
/*      */     //   37: aload_0
/*      */     //   38: getfield invalidationDelegateGroup : I
/*      */     //   41: aload_2
/*      */     //   42: invokevirtual groupContainsAnchor : (ILandroidx/compose/runtime/Anchor;)Z
/*      */     //   45: ifeq -> 53
/*      */     //   48: aload #9
/*      */     //   50: goto -> 54
/*      */     //   53: aconst_null
/*      */     //   54: nop
/*      */     //   55: goto -> 60
/*      */     //   58: pop
/*      */     //   59: aconst_null
/*      */     //   60: astore #11
/*      */     //   62: aload #11
/*      */     //   64: ifnonnull -> 465
/*      */     //   67: aload_0
/*      */     //   68: aload_1
/*      */     //   69: aload_3
/*      */     //   70: invokespecial tryImminentInvalidation : (Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z
/*      */     //   73: ifeq -> 87
/*      */     //   76: getstatic androidx/compose/runtime/InvalidationResult.IMMINENT : Landroidx/compose/runtime/InvalidationResult;
/*      */     //   79: astore #41
/*      */     //   81: aload #7
/*      */     //   83: monitorexit
/*      */     //   84: aload #41
/*      */     //   86: areturn
/*      */     //   87: aload_0
/*      */     //   88: invokespecial observer : ()Landroidx/compose/runtime/tooling/CompositionObserver;
/*      */     //   91: astore #12
/*      */     //   93: aload_3
/*      */     //   94: ifnonnull -> 111
/*      */     //   97: aload_0
/*      */     //   98: getfield invalidations : Landroidx/compose/runtime/collection/ScopeMap;
/*      */     //   101: aload_1
/*      */     //   102: getstatic androidx/compose/runtime/ScopeInvalidated.INSTANCE : Landroidx/compose/runtime/ScopeInvalidated;
/*      */     //   105: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
/*      */     //   108: goto -> 465
/*      */     //   111: aload #12
/*      */     //   113: ifnonnull -> 137
/*      */     //   116: aload_3
/*      */     //   117: instanceof androidx/compose/runtime/DerivedState
/*      */     //   120: ifne -> 137
/*      */     //   123: aload_0
/*      */     //   124: getfield invalidations : Landroidx/compose/runtime/collection/ScopeMap;
/*      */     //   127: aload_1
/*      */     //   128: getstatic androidx/compose/runtime/ScopeInvalidated.INSTANCE : Landroidx/compose/runtime/ScopeInvalidated;
/*      */     //   131: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
/*      */     //   134: goto -> 465
/*      */     //   137: aload_0
/*      */     //   138: getfield invalidations : Landroidx/compose/runtime/collection/ScopeMap;
/*      */     //   141: astore #13
/*      */     //   143: iconst_0
/*      */     //   144: istore #9
/*      */     //   146: aload #13
/*      */     //   148: astore #10
/*      */     //   150: iconst_0
/*      */     //   151: istore #14
/*      */     //   153: aload #10
/*      */     //   155: invokevirtual getMap : ()Landroidx/collection/MutableScatterMap;
/*      */     //   158: aload_1
/*      */     //   159: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   162: astore #15
/*      */     //   164: aload #15
/*      */     //   166: ifnull -> 451
/*      */     //   169: aload #15
/*      */     //   171: instanceof androidx/collection/MutableScatterSet
/*      */     //   174: ifeq -> 415
/*      */     //   177: aload #15
/*      */     //   179: checkcast androidx/collection/MutableScatterSet
/*      */     //   182: checkcast androidx/collection/ScatterSet
/*      */     //   185: astore #16
/*      */     //   187: iconst_0
/*      */     //   188: istore #17
/*      */     //   190: nop
/*      */     //   191: aload #16
/*      */     //   193: getfield elements : [Ljava/lang/Object;
/*      */     //   196: astore #18
/*      */     //   198: aload #16
/*      */     //   200: astore #19
/*      */     //   202: iconst_0
/*      */     //   203: istore #20
/*      */     //   205: nop
/*      */     //   206: aload #19
/*      */     //   208: getfield metadata : [J
/*      */     //   211: astore #21
/*      */     //   213: aload #21
/*      */     //   215: arraylength
/*      */     //   216: iconst_2
/*      */     //   217: isub
/*      */     //   218: istore #22
/*      */     //   220: iconst_0
/*      */     //   221: istore #23
/*      */     //   223: iload #23
/*      */     //   225: iload #22
/*      */     //   227: if_icmpgt -> 410
/*      */     //   230: aload #21
/*      */     //   232: iload #23
/*      */     //   234: laload
/*      */     //   235: lstore #24
/*      */     //   237: lload #24
/*      */     //   239: lstore #26
/*      */     //   241: iconst_0
/*      */     //   242: istore #28
/*      */     //   244: lload #26
/*      */     //   246: lload #26
/*      */     //   248: ldc2_w -1
/*      */     //   251: lxor
/*      */     //   252: bipush #7
/*      */     //   254: lshl
/*      */     //   255: land
/*      */     //   256: ldc2_w -9187201950435737472
/*      */     //   259: land
/*      */     //   260: ldc2_w -9187201950435737472
/*      */     //   263: lcmp
/*      */     //   264: ifeq -> 397
/*      */     //   267: bipush #8
/*      */     //   269: iload #23
/*      */     //   271: iload #22
/*      */     //   273: isub
/*      */     //   274: iconst_m1
/*      */     //   275: ixor
/*      */     //   276: bipush #31
/*      */     //   278: iushr
/*      */     //   279: isub
/*      */     //   280: istore #29
/*      */     //   282: iconst_0
/*      */     //   283: istore #30
/*      */     //   285: iload #30
/*      */     //   287: iload #29
/*      */     //   289: if_icmpge -> 390
/*      */     //   292: lload #24
/*      */     //   294: ldc2_w 255
/*      */     //   297: land
/*      */     //   298: lstore #31
/*      */     //   300: iconst_0
/*      */     //   301: istore #33
/*      */     //   303: lload #31
/*      */     //   305: ldc2_w 128
/*      */     //   308: lcmp
/*      */     //   309: ifge -> 316
/*      */     //   312: iconst_1
/*      */     //   313: goto -> 317
/*      */     //   316: iconst_0
/*      */     //   317: ifeq -> 377
/*      */     //   320: iload #23
/*      */     //   322: iconst_3
/*      */     //   323: ishl
/*      */     //   324: iload #30
/*      */     //   326: iadd
/*      */     //   327: istore #28
/*      */     //   329: iload #28
/*      */     //   331: istore #34
/*      */     //   333: iconst_0
/*      */     //   334: istore #35
/*      */     //   336: aload #18
/*      */     //   338: iload #34
/*      */     //   340: aaload
/*      */     //   341: astore #36
/*      */     //   343: iconst_0
/*      */     //   344: istore #37
/*      */     //   346: aload #36
/*      */     //   348: astore #38
/*      */     //   350: iconst_0
/*      */     //   351: istore #39
/*      */     //   353: aload #38
/*      */     //   355: getstatic androidx/compose/runtime/ScopeInvalidated.INSTANCE : Landroidx/compose/runtime/ScopeInvalidated;
/*      */     //   358: if_acmpne -> 365
/*      */     //   361: iconst_1
/*      */     //   362: goto -> 366
/*      */     //   365: iconst_0
/*      */     //   366: ifeq -> 373
/*      */     //   369: iconst_1
/*      */     //   370: goto -> 453
/*      */     //   373: nop
/*      */     //   374: nop
/*      */     //   375: nop
/*      */     //   376: nop
/*      */     //   377: lload #24
/*      */     //   379: bipush #8
/*      */     //   381: lshr
/*      */     //   382: lstore #24
/*      */     //   384: iinc #30, 1
/*      */     //   387: goto -> 285
/*      */     //   390: iload #29
/*      */     //   392: bipush #8
/*      */     //   394: if_icmpne -> 411
/*      */     //   397: iload #23
/*      */     //   399: iload #22
/*      */     //   401: if_icmpeq -> 410
/*      */     //   404: iinc #23, 1
/*      */     //   407: goto -> 230
/*      */     //   410: nop
/*      */     //   411: nop
/*      */     //   412: goto -> 451
/*      */     //   415: aload #15
/*      */     //   417: astore #36
/*      */     //   419: iconst_0
/*      */     //   420: istore #37
/*      */     //   422: aload #36
/*      */     //   424: astore #38
/*      */     //   426: iconst_0
/*      */     //   427: istore #39
/*      */     //   429: aload #38
/*      */     //   431: getstatic androidx/compose/runtime/ScopeInvalidated.INSTANCE : Landroidx/compose/runtime/ScopeInvalidated;
/*      */     //   434: if_acmpne -> 441
/*      */     //   437: iconst_1
/*      */     //   438: goto -> 442
/*      */     //   441: iconst_0
/*      */     //   442: ifeq -> 449
/*      */     //   445: iconst_1
/*      */     //   446: goto -> 453
/*      */     //   449: nop
/*      */     //   450: nop
/*      */     //   451: nop
/*      */     //   452: iconst_0
/*      */     //   453: ifne -> 465
/*      */     //   456: aload_0
/*      */     //   457: getfield invalidations : Landroidx/compose/runtime/collection/ScopeMap;
/*      */     //   460: aload_1
/*      */     //   461: aload_3
/*      */     //   462: invokevirtual add : (Ljava/lang/Object;Ljava/lang/Object;)V
/*      */     //   465: aload #11
/*      */     //   467: astore #40
/*      */     //   469: aload #7
/*      */     //   471: monitorexit
/*      */     //   472: aload #40
/*      */     //   474: goto -> 485
/*      */     //   477: astore #40
/*      */     //   479: aload #7
/*      */     //   481: monitorexit
/*      */     //   482: aload #40
/*      */     //   484: athrow
/*      */     //   485: nop
/*      */     //   486: astore #4
/*      */     //   488: aload #4
/*      */     //   490: ifnull -> 502
/*      */     //   493: aload #4
/*      */     //   495: aload_1
/*      */     //   496: aload_2
/*      */     //   497: aload_3
/*      */     //   498: invokespecial invalidateChecked : (Landroidx/compose/runtime/RecomposeScopeImpl;Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;
/*      */     //   501: areturn
/*      */     //   502: aload_0
/*      */     //   503: getfield parent : Landroidx/compose/runtime/CompositionContext;
/*      */     //   506: aload_0
/*      */     //   507: checkcast androidx/compose/runtime/ControlledComposition
/*      */     //   510: invokevirtual invalidate$runtime : (Landroidx/compose/runtime/ControlledComposition;)V
/*      */     //   513: aload_0
/*      */     //   514: invokevirtual isComposing : ()Z
/*      */     //   517: ifeq -> 526
/*      */     //   520: getstatic androidx/compose/runtime/InvalidationResult.DEFERRED : Landroidx/compose/runtime/InvalidationResult;
/*      */     //   523: goto -> 529
/*      */     //   526: getstatic androidx/compose/runtime/InvalidationResult.SCHEDULED : Landroidx/compose/runtime/InvalidationResult;
/*      */     //   529: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1141	-> 0
/*      */     //   #2261	-> 9
/*      */     //   #1142	-> 20
/*      */     //   #1148	-> 33
/*      */     //   #1149	-> 48
/*      */     //   #1150	-> 53
/*      */     //   #1148	-> 54
/*      */     //   #1142	-> 55
/*      */     //   #1142	-> 58
/*      */     //   #1152	-> 62
/*      */     //   #1153	-> 67
/*      */     //   #1155	-> 76
/*      */     //   #1160	-> 87
/*      */     //   #1161	-> 93
/*      */     //   #1164	-> 97
/*      */     //   #1165	-> 111
/*      */     //   #1168	-> 123
/*      */     //   #1170	-> 137
/*      */     //   #2262	-> 146
/*      */     //   #2263	-> 153
/*      */     //   #2264	-> 164
/*      */     //   #2265	-> 169
/*      */     //   #2267	-> 177
/*      */     //   #2268	-> 190
/*      */     //   #2269	-> 191
/*      */     //   #2271	-> 198
/*      */     //   #2272	-> 205
/*      */     //   #2273	-> 206
/*      */     //   #2274	-> 213
/*      */     //   #2276	-> 220
/*      */     //   #2277	-> 230
/*      */     //   #2278	-> 237
/*      */     //   #2279	-> 244
/*      */     //   #2278	-> 260
/*      */     //   #2280	-> 267
/*      */     //   #2281	-> 282
/*      */     //   #2282	-> 292
/*      */     //   #2283	-> 303
/*      */     //   #2282	-> 317
/*      */     //   #2284	-> 320
/*      */     //   #2285	-> 329
/*      */     //   #2286	-> 336
/*      */     //   #2287	-> 346
/*      */     //   #1170	-> 353
/*      */     //   #2287	-> 366
/*      */     //   #2288	-> 373
/*      */     //   #2286	-> 374
/*      */     //   #2289	-> 375
/*      */     //   #2285	-> 376
/*      */     //   #2290	-> 377
/*      */     //   #2281	-> 384
/*      */     //   #2292	-> 390
/*      */     //   #2276	-> 397
/*      */     //   #2295	-> 410
/*      */     //   #2296	-> 411
/*      */     //   #2297	-> 415
/*      */     //   #2287	-> 422
/*      */     //   #1170	-> 429
/*      */     //   #2287	-> 442
/*      */     //   #2288	-> 449
/*      */     //   #2297	-> 450
/*      */     //   #2300	-> 451
/*      */     //   #2306	-> 452
/*      */     //   #1170	-> 453
/*      */     //   #1171	-> 456
/*      */     //   #1175	-> 465
/*      */     //   #2261	-> 467
/*      */     //   #2261	-> 485
/*      */     //   #1141	-> 486
/*      */     //   #1179	-> 488
/*      */     //   #1180	-> 493
/*      */     //   #1182	-> 502
/*      */     //   #1183	-> 513
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   33	22	10	$i$a$-let-CompositionImpl$invalidateChecked$delegate$1$delegate$1	I
/*      */     //   30	25	9	changeDelegate	Landroidx/compose/runtime/CompositionImpl;
/*      */     //   353	13	39	$i$a$-anyScopeOf-CompositionImpl$invalidateChecked$delegate$1$1	I
/*      */     //   350	16	38	it	Ljava/lang/Object;
/*      */     //   429	13	39	$i$a$-anyScopeOf-CompositionImpl$invalidateChecked$delegate$1$1	I
/*      */     //   426	16	38	it	Ljava/lang/Object;
/*      */     //   346	28	37	$i$a$-forEachScopeOf-ScopeMap$anyScopeOf$1$iv	I
/*      */     //   343	31	36	it$iv	Ljava/lang/Object;
/*      */     //   422	28	37	$i$a$-forEachScopeOf-ScopeMap$anyScopeOf$1$iv	I
/*      */     //   419	31	36	it$iv	Ljava/lang/Object;
/*      */     //   336	40	35	$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv$iv	I
/*      */     //   333	43	34	index$iv$iv$iv	I
/*      */     //   244	16	28	$i$f$maskEmptyOrDeleted	I
/*      */     //   241	19	26	$this$maskEmptyOrDeleted$iv$iv$iv$iv$iv	J
/*      */     //   303	14	33	$i$f$isFull	I
/*      */     //   300	17	31	value$iv$iv$iv$iv$iv	J
/*      */     //   329	48	28	index$iv$iv$iv$iv	I
/*      */     //   285	105	30	j$iv$iv$iv$iv	I
/*      */     //   282	115	29	bitCount$iv$iv$iv$iv	I
/*      */     //   237	160	24	slot$iv$iv$iv$iv	J
/*      */     //   223	187	23	i$iv$iv$iv$iv	I
/*      */     //   205	206	20	$i$f$forEachIndex	I
/*      */     //   213	198	21	m$iv$iv$iv$iv	[J
/*      */     //   220	191	22	lastIndex$iv$iv$iv$iv	I
/*      */     //   202	209	19	this_$iv$iv$iv$iv	Landroidx/collection/ScatterSet;
/*      */     //   190	222	17	$i$f$forEach	I
/*      */     //   198	214	18	k$iv$iv$iv	[Ljava/lang/Object;
/*      */     //   187	225	16	this_$iv$iv$iv	Landroidx/collection/ScatterSet;
/*      */     //   164	287	15	value$iv$iv	Ljava/lang/Object;
/*      */     //   153	299	14	$i$f$forEachScopeOf	I
/*      */     //   150	302	10	this_$iv$iv	Landroidx/compose/runtime/collection/ScopeMap;
/*      */     //   146	307	9	$i$f$anyScopeOf	I
/*      */     //   143	310	13	this_$iv	Landroidx/compose/runtime/collection/ScopeMap;
/*      */     //   93	372	12	observer	Landroidx/compose/runtime/tooling/CompositionObserver;
/*      */     //   20	59	8	$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1	I
/*      */     //   62	17	11	delegate	Landroidx/compose/runtime/CompositionImpl;
/*      */     //   9	70	6	$i$f$synchronized	I
/*      */     //   6	73	5	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   87	399	6	$i$f$synchronized	I
/*      */     //   87	399	5	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   87	380	8	$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1	I
/*      */     //   87	380	11	delegate	Landroidx/compose/runtime/CompositionImpl;
/*      */     //   488	42	4	delegate	Landroidx/compose/runtime/CompositionImpl;
/*      */     //   0	530	0	this	Landroidx/compose/runtime/CompositionImpl;
/*      */     //   0	530	1	scope	Landroidx/compose/runtime/RecomposeScopeImpl;
/*      */     //   0	530	2	anchor	Landroidx/compose/runtime/Anchor;
/*      */     //   0	530	3	instance	Ljava/lang/Object;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   16	81	477	finally
/*      */     //   87	469	477	finally
/*      */     //   477	479	477	finally
/*      */   }
/*      */   public final void removeObservation$runtime(@NotNull Object instance, @NotNull RecomposeScopeImpl scope) {
/*      */     Intrinsics.checkNotNullParameter(instance, "instance");
/*      */     Intrinsics.checkNotNullParameter(scope, "scope");
/*      */     this.observations.remove(instance, scope);
/*      */   }
/*      */   public final void removeDerivedStateObservation$runtime(@NotNull DerivedState state) {
/*      */     Intrinsics.checkNotNullParameter(state, "state");
/*      */     if (!this.observations.contains(state))
/*      */       this.derivedStates.removeScope(state); 
/*      */   }
/*      */   private final ScopeMap<RecomposeScopeImpl, Object> takeInvalidations() {
/*      */     ScopeMap<RecomposeScopeImpl, Object> invalidations = this.invalidations;
/*      */     this.invalidations = new ScopeMap();
/*      */     return invalidations;
/*      */   }
/*      */   private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
/*      */     // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: invokevirtual getSlots : ()[Ljava/lang/Object;
/*      */     //   4: astore_3
/*      */     //   5: iconst_0
/*      */     //   6: istore #4
/*      */     //   8: aload_3
/*      */     //   9: astore #5
/*      */     //   11: new java/util/ArrayList
/*      */     //   14: dup
/*      */     //   15: invokespecial <init> : ()V
/*      */     //   18: checkcast java/util/Collection
/*      */     //   21: astore #6
/*      */     //   23: iconst_0
/*      */     //   24: istore #7
/*      */     //   26: aload #5
/*      */     //   28: astore #8
/*      */     //   30: iconst_0
/*      */     //   31: istore #9
/*      */     //   33: iconst_0
/*      */     //   34: istore #10
/*      */     //   36: aload #8
/*      */     //   38: arraylength
/*      */     //   39: istore #11
/*      */     //   41: iload #10
/*      */     //   43: iload #11
/*      */     //   45: if_icmpge -> 116
/*      */     //   48: aload #8
/*      */     //   50: iload #10
/*      */     //   52: aaload
/*      */     //   53: astore #12
/*      */     //   55: aload #12
/*      */     //   57: astore #13
/*      */     //   59: iconst_0
/*      */     //   60: istore #14
/*      */     //   62: aload #13
/*      */     //   64: astore #15
/*      */     //   66: iconst_0
/*      */     //   67: istore #16
/*      */     //   69: aload #15
/*      */     //   71: instanceof androidx/compose/runtime/RecomposeScopeImpl
/*      */     //   74: ifeq -> 85
/*      */     //   77: aload #15
/*      */     //   79: checkcast androidx/compose/runtime/RecomposeScopeImpl
/*      */     //   82: goto -> 86
/*      */     //   85: aconst_null
/*      */     //   86: dup
/*      */     //   87: ifnull -> 108
/*      */     //   90: astore #17
/*      */     //   92: iconst_0
/*      */     //   93: istore #18
/*      */     //   95: aload #6
/*      */     //   97: aload #17
/*      */     //   99: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   104: pop
/*      */     //   105: goto -> 109
/*      */     //   108: pop
/*      */     //   109: nop
/*      */     //   110: iinc #10, 1
/*      */     //   113: goto -> 41
/*      */     //   116: nop
/*      */     //   117: aload #6
/*      */     //   119: checkcast java/util/List
/*      */     //   122: nop
/*      */     //   123: astore_2
/*      */     //   124: aload_2
/*      */     //   125: astore_3
/*      */     //   126: iconst_0
/*      */     //   127: istore #4
/*      */     //   129: nop
/*      */     //   130: iconst_0
/*      */     //   131: istore #5
/*      */     //   133: aload_3
/*      */     //   134: invokeinterface size : ()I
/*      */     //   139: istore #6
/*      */     //   141: iload #5
/*      */     //   143: iload #6
/*      */     //   145: if_icmpge -> 285
/*      */     //   148: aload_3
/*      */     //   149: iload #5
/*      */     //   151: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   156: astore #7
/*      */     //   158: aload #7
/*      */     //   160: checkcast androidx/compose/runtime/RecomposeScopeImpl
/*      */     //   163: astore #8
/*      */     //   165: iconst_0
/*      */     //   166: istore #9
/*      */     //   168: aload #8
/*      */     //   170: invokevirtual getAnchor : ()Landroidx/compose/runtime/Anchor;
/*      */     //   173: dup
/*      */     //   174: ifnull -> 275
/*      */     //   177: astore #10
/*      */     //   179: iconst_0
/*      */     //   180: istore #11
/*      */     //   182: aload_1
/*      */     //   183: aload #10
/*      */     //   185: aload_1
/*      */     //   186: invokevirtual toIndexFor : (Landroidx/compose/runtime/SlotTable;)I
/*      */     //   189: invokevirtual slotsOf$runtime : (I)Ljava/util/List;
/*      */     //   192: aload #8
/*      */     //   194: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   199: istore #12
/*      */     //   201: iconst_0
/*      */     //   202: istore #13
/*      */     //   204: nop
/*      */     //   205: iload #12
/*      */     //   207: ifne -> 270
/*      */     //   210: iconst_0
/*      */     //   211: istore #14
/*      */     //   213: aload_1
/*      */     //   214: invokevirtual getSlots : ()[Ljava/lang/Object;
/*      */     //   217: aload #8
/*      */     //   219: invokestatic indexOf : ([Ljava/lang/Object;Ljava/lang/Object;)I
/*      */     //   222: istore #15
/*      */     //   224: new java/lang/StringBuilder
/*      */     //   227: dup
/*      */     //   228: invokespecial <init> : ()V
/*      */     //   231: ldc_w 'Misaligned anchor '
/*      */     //   234: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   237: aload #10
/*      */     //   239: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*      */     //   242: ldc_w ' in scope '
/*      */     //   245: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   248: aload #8
/*      */     //   250: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*      */     //   253: ldc_w ' encountered, scope found at '
/*      */     //   256: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   259: iload #15
/*      */     //   261: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   264: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   267: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*      */     //   270: nop
/*      */     //   271: nop
/*      */     //   272: goto -> 277
/*      */     //   275: pop
/*      */     //   276: nop
/*      */     //   277: nop
/*      */     //   278: nop
/*      */     //   279: iinc #5, 1
/*      */     //   282: goto -> 141
/*      */     //   285: nop
/*      */     //   286: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1212	-> 0
/*      */     //   #2307	-> 8
/*      */     //   #2315	-> 26
/*      */     //   #2316	-> 33
/*      */     //   #2315	-> 62
/*      */     //   #1212	-> 69
/*      */     //   #2315	-> 86
/*      */     //   #2317	-> 92
/*      */     //   #2315	-> 95
/*      */     //   #2315	-> 105
/*      */     //   #2315	-> 108
/*      */     //   #2316	-> 109
/*      */     //   #2318	-> 116
/*      */     //   #2319	-> 117
/*      */     //   #2307	-> 122
/*      */     //   #1212	-> 123
/*      */     //   #1213	-> 124
/*      */     //   #2320	-> 129
/*      */     //   #2321	-> 130
/*      */     //   #2322	-> 148
/*      */     //   #2323	-> 158
/*      */     //   #1214	-> 168
/*      */     //   #1215	-> 182
/*      */     //   #2324	-> 204
/*      */     //   #2327	-> 205
/*      */     //   #2328	-> 210
/*      */     //   #1216	-> 213
/*      */     //   #1217	-> 224
/*      */     //   #1218	-> 259
/*      */     //   #1217	-> 261
/*      */     //   #2328	-> 267
/*      */     //   #2330	-> 270
/*      */     //   #1220	-> 271
/*      */     //   #1214	-> 272
/*      */     //   #1214	-> 275
/*      */     //   #1221	-> 277
/*      */     //   #2323	-> 278
/*      */     //   #2321	-> 279
/*      */     //   #2331	-> 285
/*      */     //   #1222	-> 286
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   69	17	16	$i$a$-mapNotNull-CompositionImpl$validateRecomposeScopeAnchors$scopes$1	I
/*      */     //   66	20	15	it	Ljava/lang/Object;
/*      */     //   95	10	18	$i$a$-let-ArraysKt___ArraysKt$mapNotNullTo$1$1$iv$iv	I
/*      */     //   92	13	17	it$iv$iv	Ljava/lang/Object;
/*      */     //   62	47	14	$i$a$-forEach-ArraysKt___ArraysKt$mapNotNullTo$1$iv$iv	I
/*      */     //   59	50	13	element$iv$iv	Ljava/lang/Object;
/*      */     //   55	55	12	element$iv$iv$iv	Ljava/lang/Object;
/*      */     //   33	84	9	$i$f$forEach	I
/*      */     //   30	87	8	$this$forEach$iv$iv$iv	[Ljava/lang/Object;
/*      */     //   26	93	7	$i$f$mapNotNullTo	I
/*      */     //   23	96	5	$this$mapNotNullTo$iv$iv	[Ljava/lang/Object;
/*      */     //   23	96	6	destination$iv$iv	Ljava/util/Collection;
/*      */     //   8	115	4	$i$f$mapNotNull	I
/*      */     //   5	118	3	$this$mapNotNull$iv	[Ljava/lang/Object;
/*      */     //   213	54	14	$i$a$-checkPrecondition-CompositionImpl$validateRecomposeScopeAnchors$1$1$1	I
/*      */     //   224	43	15	dataIndex	I
/*      */     //   204	67	13	$i$f$checkPrecondition	I
/*      */     //   201	70	12	value$iv	Z
/*      */     //   182	90	11	$i$a$-let-CompositionImpl$validateRecomposeScopeAnchors$1$1	I
/*      */     //   179	93	10	anchor	Landroidx/compose/runtime/Anchor;
/*      */     //   168	110	9	$i$a$-fastForEach-CompositionImpl$validateRecomposeScopeAnchors$1	I
/*      */     //   165	113	8	scope	Landroidx/compose/runtime/RecomposeScopeImpl;
/*      */     //   158	121	7	item$iv	Ljava/lang/Object;
/*      */     //   133	152	5	index$iv	I
/*      */     //   129	157	4	$i$f$fastForEach	I
/*      */     //   126	160	3	$this$fastForEach$iv	Ljava/util/List;
/*      */     //   124	163	2	scopes	Ljava/util/List;
/*      */     //   0	287	0	this	Landroidx/compose/runtime/CompositionImpl;
/*      */     //   0	287	1	slotTable	Landroidx/compose/runtime/SlotTable;
/*      */   }
/*      */   
/*      */   private final <T> T trackAbandonedValues(Function0 block) {
/*      */     Object object;
/*      */     int $i$f$trackAbandonedValues = 0;
/*      */     boolean success = false;
/*      */     try {
/*      */       Object it = object = block.invoke();
/*      */       int $i$a$-also-CompositionImpl$trackAbandonedValues$1 = 0;
/*      */       success = true;
/*      */     } finally {
/*      */       InlineMarker.finallyStart(1);
/*      */       if (!success && (!this.abandonSet.isEmpty()))
/*      */         (new RememberEventDispatcher(this.abandonSet)).dispatchAbandons(); 
/*      */       InlineMarker.finallyEnd(1);
/*      */     } 
/*      */     return (T)object;
/*      */   }
/*      */   
/*      */   private final CompositionObserver observer() {
/*      */     CompositionObserverHolder holder = this.observerHolder;
/*      */     CompositionObserverHolder parentHolder = this.parent.getObserverHolder$runtime();
/*      */     CompositionObserver parentObserver = (parentHolder != null) ? parentHolder.getObserver() : null;
/*      */     if (!Intrinsics.areEqual(parentObserver, holder.getObserver()))
/*      */       holder.setObserver(parentObserver); 
/*      */     return holder.getRoot() ? holder.getObserver() : parentObserver;
/*      */   }
/*      */   
/*      */   public void deactivate() {
/*      */     SynchronizedObject lock$iv = this.lock;
/*      */     int $i$f$synchronized = 0;
/* 2332 */     synchronized (lock$iv) { int $i$a$-synchronized-CompositionImpl$deactivate$1 = 0; boolean nonEmptySlotTable = (this.slotTable.getGroupsSize() > 0); if (nonEmptySlotTable || (!this.abandonSet.isEmpty())) {
/* 2333 */         String sectionName$iv = "Compose:deactivate"; int $i$f$trace = 0; Object token$iv = Trace.INSTANCE.beginSection(sectionName$iv);
/*      */       } 
/*      */       this.observations.clear();
/*      */       this.derivedStates.clear();
/*      */       this.invalidations.clear();
/*      */       this.changes.clear();
/*      */       this.lateChanges.clear();
/*      */       this.composer.deactivate$runtime();
/*      */       Unit unit = Unit.INSTANCE; }
/*      */   
/*      */   }
/*      */   
/*      */   public final int composerStacksSizes$runtime() {
/*      */     return this.composer.stacksSize$runtime();
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\000\n\002\020#\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020!\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\002\n\002\b\003\n\002\020\b\n\002\b\013\b\002\030\0002\0020\001B\023\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J(\020\024\032\0020\0232\006\020\025\032\0020\0172\006\020\026\032\0020\0272\006\020\030\032\0020\0272\006\020\031\032\0020\027H\026J\006\020\032\032\0020\023J\006\020\033\032\0020\023J\006\020\034\032\0020\023J(\020\035\032\0020\0232\006\020\025\032\0020\0042\006\020\026\032\0020\0272\006\020\030\032\0020\0272\006\020\031\032\0020\027H\026J\020\020\036\032\0020\0232\006\020\026\032\0020\027H\002J(\020\037\032\0020\0232\006\020\025\032\0020\n2\006\020\026\032\0020\0272\006\020\030\032\0020\0272\006\020\031\032\0020\027H\002J(\020\r\032\0020\0232\006\020\025\032\0020\0172\006\020\026\032\0020\0272\006\020\030\032\0020\0272\006\020\031\032\0020\027H\026J\020\020\020\032\0020\0232\006\020\025\032\0020\004H\026J\026\020 \032\0020\0232\f\020!\032\b\022\004\022\0020\0230\022H\026R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\024\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\002\n\000R\024\020\013\032\b\022\004\022\0020\n0\tX\004¢\006\002\n\000R\016\020\f\032\0020\007X\004¢\006\002\n\000R\026\020\r\032\n\022\004\022\0020\017\030\0010\016X\016¢\006\002\n\000R\024\020\020\032\b\022\004\022\0020\0040\tX\004¢\006\002\n\000R\032\020\021\032\016\022\n\022\b\022\004\022\0020\0230\0220\tX\004¢\006\002\n\000¨\006\""}, d2 = {"Landroidx/compose/runtime/CompositionImpl$RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "abandoning", "", "Landroidx/compose/runtime/RememberObserver;", "(Ljava/util/Set;)V", "afters", "Landroidx/collection/MutableIntList;", "leaving", "", "", "pending", "priorities", "releasing", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "remembering", "sideEffects", "Lkotlin/Function0;", "", "deactivating", "instance", "endRelativeOrder", "", "priority", "endRelativeAfter", "dispatchAbandons", "dispatchRememberObservers", "dispatchSideEffects", "forgetting", "processPendingLeaving", "recordLeaving", "sideEffect", "effect", "runtime"})
/*      */   @SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1504:1\n1#2:1505\n46#3,5:1506\n46#3,3:1511\n50#3:1520\n46#3,3:1521\n50#3:1530\n46#3,5:1531\n33#4,6:1514\n33#4,6:1524\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n*L\n1339#1:1506,5\n1361#1:1511,3\n1361#1:1520\n1372#1:1521,3\n1372#1:1530\n1383#1:1531,5\n1362#1:1514,6\n1373#1:1524,6\n*E\n"})
/*      */   private static final class RememberEventDispatcher implements RememberManager {
/*      */     @NotNull
/*      */     private final Set<RememberObserver> abandoning;
/*      */     @NotNull
/*      */     private final List<RememberObserver> remembering;
/*      */     @NotNull
/*      */     private final List<Object> leaving;
/*      */     @NotNull
/*      */     private final List<Function0<Unit>> sideEffects;
/*      */     @Nullable
/*      */     private MutableScatterSet<ComposeNodeLifecycleCallback> releasing;
/*      */     @NotNull
/*      */     private final List<Object> pending;
/*      */     @NotNull
/*      */     private final MutableIntList priorities;
/*      */     @NotNull
/*      */     private final MutableIntList afters;
/*      */     
/*      */     public RememberEventDispatcher(@NotNull Set<RememberObserver> abandoning) {
/*      */       this.abandoning = abandoning;
/*      */       this.remembering = new ArrayList<>();
/*      */       this.leaving = new ArrayList();
/*      */       this.sideEffects = new ArrayList<>();
/*      */       this.pending = new ArrayList();
/*      */       this.priorities = new MutableIntList(0, 1, null);
/*      */       this.afters = new MutableIntList(0, 1, null);
/*      */     }
/*      */     
/*      */     public void remembering(@NotNull RememberObserver instance) {
/*      */       Intrinsics.checkNotNullParameter(instance, "instance");
/*      */       this.remembering.add(instance);
/*      */     }
/*      */     
/*      */     public void forgetting(@NotNull RememberObserver instance, int endRelativeOrder, int priority, int endRelativeAfter) {
/*      */       Intrinsics.checkNotNullParameter(instance, "instance");
/*      */       recordLeaving(instance, endRelativeOrder, priority, endRelativeAfter);
/*      */     }
/*      */     
/*      */     public void sideEffect(@NotNull Function0<Unit> effect) {
/*      */       Intrinsics.checkNotNullParameter(effect, "effect");
/*      */       this.sideEffects.add(effect);
/*      */     }
/*      */     
/*      */     public void deactivating(@NotNull ComposeNodeLifecycleCallback instance, int endRelativeOrder, int priority, int endRelativeAfter) {
/*      */       Intrinsics.checkNotNullParameter(instance, "instance");
/*      */       recordLeaving(instance, endRelativeOrder, priority, endRelativeAfter);
/*      */     }
/*      */     
/*      */     public void releasing(@NotNull ComposeNodeLifecycleCallback instance, int endRelativeOrder, int priority, int endRelativeAfter) {
/*      */       Intrinsics.checkNotNullParameter(instance, "instance");
/*      */       if (this.releasing == null) {
/*      */         MutableScatterSet<ComposeNodeLifecycleCallback> mutableScatterSet1 = ScatterSetKt.mutableScatterSetOf(), it = mutableScatterSet1;
/*      */         int $i$a$-also-CompositionImpl$RememberEventDispatcher$releasing$releasing$1 = 0;
/*      */         this.releasing = it;
/*      */       } 
/*      */       MutableScatterSet<ComposeNodeLifecycleCallback> releasing = mutableScatterSet1;
/*      */       releasing.plusAssign(instance);
/*      */       recordLeaving(instance, endRelativeOrder, priority, endRelativeAfter);
/*      */     }
/*      */     
/*      */     public final void dispatchRememberObservers() {
/*      */       processPendingLeaving(-2147483648);
/*      */       if (!this.leaving.isEmpty()) {
/*      */         String sectionName$iv = "Compose:onForgotten";
/*      */         int $i$f$trace = 0;
/*      */         Object token$iv = Trace.INSTANCE.beginSection(sectionName$iv);
/*      */       } 
/*      */       if (!this.remembering.isEmpty()) {
/*      */         String sectionName$iv = "Compose:onRemembered";
/*      */         int $i$f$trace = 0;
/*      */         Object token$iv = Trace.INSTANCE.beginSection(sectionName$iv);
/*      */         try {
/*      */           int $i$a$-trace-CompositionImpl$RememberEventDispatcher$dispatchRememberObservers$2 = 0;
/*      */           List<RememberObserver> $this$fastForEach$iv = this.remembering;
/*      */           int $i$f$fastForEach = 0;
/*      */           int index$iv = 0, i = $this$fastForEach$iv.size();
/*      */           if (index$iv < i) {
/*      */             Object item$iv = $this$fastForEach$iv.get(index$iv);
/*      */             RememberObserver instance = (RememberObserver)item$iv;
/*      */             int $i$a$-fastForEach-CompositionImpl$RememberEventDispatcher$dispatchRememberObservers$2$1 = 0;
/*      */             this.abandoning.remove(instance);
/*      */             instance.onRemembered();
/*      */           } 
/*      */           Unit unit = Unit.INSTANCE;
/*      */         } finally {
/*      */           Trace.INSTANCE.endSection(token$iv);
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/*      */     public final void dispatchSideEffects() {
/*      */       if (!this.sideEffects.isEmpty()) {
/*      */         String sectionName$iv = "Compose:sideeffects";
/*      */         int $i$f$trace = 0;
/*      */         Object token$iv = Trace.INSTANCE.beginSection(sectionName$iv);
/*      */         try {
/*      */           int $i$a$-trace-CompositionImpl$RememberEventDispatcher$dispatchSideEffects$1 = 0;
/*      */           List<Function0<Unit>> $this$fastForEach$iv = this.sideEffects;
/*      */           int $i$f$fastForEach = 0;
/*      */           int index$iv = 0, i = $this$fastForEach$iv.size();
/*      */           if (index$iv < i) {
/*      */             Object<Unit> item$iv = (Object<Unit>)$this$fastForEach$iv.get(index$iv);
/*      */             Function0 sideEffect = (Function0)item$iv;
/*      */             int $i$a$-fastForEach-CompositionImpl$RememberEventDispatcher$dispatchSideEffects$1$1 = 0;
/*      */             sideEffect.invoke();
/*      */           } 
/*      */           this.sideEffects.clear();
/*      */           Unit unit = Unit.INSTANCE;
/*      */         } finally {
/*      */           Trace.INSTANCE.endSection(token$iv);
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/*      */     public final void dispatchAbandons() {
/*      */       if (!this.abandoning.isEmpty()) {
/*      */         String sectionName$iv = "Compose:abandons";
/*      */         int $i$f$trace = 0;
/*      */         Object token$iv = Trace.INSTANCE.beginSection(sectionName$iv);
/*      */         try {
/*      */           int $i$a$-trace-CompositionImpl$RememberEventDispatcher$dispatchAbandons$1 = 0;
/*      */           Iterator<RememberObserver> iterator = this.abandoning.iterator();
/*      */           while (iterator.hasNext()) {
/*      */             RememberObserver instance = iterator.next();
/*      */             iterator.remove();
/*      */             instance.onAbandoned();
/*      */           } 
/*      */           Unit unit = Unit.INSTANCE;
/*      */         } finally {
/*      */           Trace.INSTANCE.endSection(token$iv);
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/*      */     private final void recordLeaving(Object instance, int endRelativeOrder, int priority, int endRelativeAfter) {
/*      */       processPendingLeaving(endRelativeOrder);
/*      */       if ((0 <= endRelativeAfter) ? ((endRelativeAfter < endRelativeOrder)) : false) {
/*      */         this.pending.add(instance);
/*      */         this.priorities.add(priority);
/*      */         this.afters.add(endRelativeAfter);
/*      */       } else {
/*      */         this.leaving.add(instance);
/*      */       } 
/*      */     }
/*      */     
/*      */     private final void processPendingLeaving(int endRelativeOrder) {
/*      */       if (!this.pending.isEmpty()) {
/*      */         int index = 0;
/*      */         List<Object> toAdd = null;
/*      */         MutableIntList toAddAfter = null;
/*      */         MutableIntList toAddPriority = null;
/*      */         while (index < this.afters.getSize()) {
/*      */           if (endRelativeOrder <= this.afters.get(index)) {
/*      */             Object instance = this.pending.remove(index);
/*      */             int endRelativeAfter = this.afters.removeAt(index);
/*      */             int priority = this.priorities.removeAt(index);
/*      */             if (toAdd == null) {
/*      */               Object[] arrayOfObject = new Object[1];
/*      */               arrayOfObject[0] = instance;
/*      */               toAdd = CollectionsKt.mutableListOf(arrayOfObject);
/*      */               MutableIntList mutableIntList1 = new MutableIntList(0, 1, null), it = mutableIntList1;
/*      */               int $i$a$-also-CompositionImpl$RememberEventDispatcher$processPendingLeaving$1 = 0;
/*      */               it.add(endRelativeAfter);
/*      */               toAddAfter = mutableIntList1;
/*      */               it = mutableIntList1 = new MutableIntList(0, 1, null);
/*      */               int $i$a$-also-CompositionImpl$RememberEventDispatcher$processPendingLeaving$2 = 0;
/*      */               it.add(priority);
/*      */               toAddPriority = mutableIntList1;
/*      */               continue;
/*      */             } 
/*      */             Intrinsics.checkNotNull(toAddPriority, "null cannot be cast to non-null type androidx.collection.MutableIntList");
/*      */             Intrinsics.checkNotNull(toAddAfter, "null cannot be cast to non-null type androidx.collection.MutableIntList");
/*      */             toAdd.add(instance);
/*      */             toAddAfter.add(endRelativeAfter);
/*      */             toAddPriority.add(priority);
/*      */             continue;
/*      */           } 
/*      */           index++;
/*      */         } 
/*      */         if (toAdd != null) {
/*      */           Intrinsics.checkNotNull(toAddPriority, "null cannot be cast to non-null type androidx.collection.MutableIntList");
/*      */           Intrinsics.checkNotNull(toAddAfter, "null cannot be cast to non-null type androidx.collection.MutableIntList");
/*      */           for (int i = 0, j = toAdd.size() - 1; i < j; i++) {
/*      */             for (int k = i + 1, m = toAdd.size(); k < m; k++) {
/*      */               int iAfter = toAddAfter.get(i);
/*      */               int jAfter = toAddAfter.get(k);
/*      */               if (iAfter < jAfter || (jAfter == iAfter && toAddPriority.get(i) < toAddPriority.get(k))) {
/*      */                 CompositionKt.access$swap(toAdd, i, k);
/*      */                 CompositionKt.access$swap(toAddPriority, i, k);
/*      */                 CompositionKt.access$swap(toAddAfter, i, k);
/*      */               } 
/*      */             } 
/*      */           } 
/*      */           this.leaving.addAll(toAdd);
/*      */         } 
/*      */       } 
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\CompositionImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */