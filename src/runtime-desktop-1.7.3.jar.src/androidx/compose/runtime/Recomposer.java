/*      */ package androidx.compose.runtime;
/*      */ 
/*      */ import androidx.collection.MutableScatterSet;
/*      */ import androidx.collection.ScatterSet;
/*      */ import androidx.compose.runtime.collection.MutableVector;
/*      */ import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
/*      */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
/*      */ import androidx.compose.runtime.internal.StabilityInferred;
/*      */ import androidx.compose.runtime.snapshots.MutableSnapshot;
/*      */ import androidx.compose.runtime.snapshots.Snapshot;
/*      */ import androidx.compose.runtime.snapshots.SnapshotApplyResult;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Collection;
/*      */ import java.util.HashMap;
/*      */ import java.util.Iterator;
/*      */ import java.util.LinkedHashMap;
/*      */ import java.util.LinkedHashSet;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Set;
/*      */ import java.util.concurrent.CancellationException;
/*      */ import kotlin.Deprecated;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.Pair;
/*      */ import kotlin.ReplaceWith;
/*      */ import kotlin.Result;
/*      */ import kotlin.ResultKt;
/*      */ import kotlin.TuplesKt;
/*      */ import kotlin.Unit;
/*      */ import kotlin.collections.ArraysKt;
/*      */ import kotlin.collections.CollectionsKt;
/*      */ import kotlin.coroutines.Continuation;
/*      */ import kotlin.coroutines.CoroutineContext;
/*      */ import kotlin.coroutines.EmptyCoroutineContext;
/*      */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*      */ import kotlin.coroutines.jvm.internal.Boxing;
/*      */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*      */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*      */ import kotlin.coroutines.jvm.internal.DebugProbesKt;
/*      */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*      */ import kotlin.enums.EnumEntries;
/*      */ import kotlin.enums.EnumEntriesKt;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.functions.Function3;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.InlineMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Lambda;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlinx.coroutines.BuildersKt;
/*      */ import kotlinx.coroutines.CancellableContinuation;
/*      */ import kotlinx.coroutines.CancellableContinuationImpl;
/*      */ import kotlinx.coroutines.CompletableJob;
/*      */ import kotlinx.coroutines.CoroutineScope;
/*      */ import kotlinx.coroutines.ExceptionsKt;
/*      */ import kotlinx.coroutines.Job;
/*      */ import kotlinx.coroutines.JobKt;
/*      */ import kotlinx.coroutines.flow.Flow;
/*      */ import kotlinx.coroutines.flow.FlowKt;
/*      */ import kotlinx.coroutines.flow.MutableStateFlow;
/*      */ import kotlinx.coroutines.flow.StateFlow;
/*      */ import kotlinx.coroutines.flow.StateFlowKt;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020!\n\002\030\002\n\000\n\002\020 \n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\t\n\002\b\004\n\002\020\003\n\000\n\002\020\013\n\002\b\007\n\002\030\002\n\000\n\002\020%\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020#\n\000\n\002\020\b\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\025\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\030\002\n\002\b\022\n\002\030\002\n\002\b\016\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\r\n\002\030\002\n\002\b\r\b\007\030\000 ¾\0012\0020\001:\n¾\001¿\001À\001Á\001Â\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020a\032\0020`2\006\020b\032\0020\007H\002J\020\020c\032\0020`2\006\020d\032\0020eH\002J\006\020f\032\0020gJ\016\020h\032\0020`H@¢\006\002\020iJ\016\020j\032\0020`H@¢\006\002\020iJ\006\020k\032\0020`J\b\020l\032\0020`H\002J\006\020m\032\0020`J*\020n\032\0020`2\006\020b\032\0020\0072\021\020o\032\r\022\004\022\0020`0p¢\006\002\bqH\020¢\006\004\br\020sJ:\020t\032\002Hu\"\004\b\000\020u2\006\020b\032\0020\0072\016\020v\032\n\022\004\022\0020'\030\0010U2\f\020w\032\b\022\004\022\002Hu0pH\b¢\006\002\020xJ\025\020y\032\0020`2\006\020z\032\0020\"H\020¢\006\002\b{J\020\020|\032\n\022\004\022\0020`\030\0010_H\002J\b\020}\032\0020`H\002J\025\020~\032\0020`2\006\020z\032\0020\"H\020¢\006\002\bJ\027\020\001\032\0020`2\006\020b\032\0020\007H\020¢\006\003\b\001J\031\020\001\032\0020`2\b\020\001\032\0030\001H\020¢\006\003\b\001J\017\020\001\032\0020`H@¢\006\002\020iJ \020\001\032\0020`2\006\020z\032\0020\"2\007\020\001\032\0020#H\020¢\006\003\b\001J\031\020\001\032\004\030\0010#2\006\020z\032\0020\"H\020¢\006\003\b\001J\007\020\001\032\0020`J\021\020\001\032\0020`2\006\020b\032\0020\007H\002J.\020\001\032\b\022\004\022\0020\0070\t2\r\020\001\032\b\022\004\022\0020\"0\t2\016\020v\032\n\022\004\022\0020'\030\0010UH\002J#\020\001\032\004\030\0010\0072\006\020b\032\0020\0072\016\020v\032\n\022\004\022\0020'\030\0010UH\002J0\020\001\032\0020`2\r\020\001\032\b0\001j\003`\0012\013\b\002\020\001\032\004\030\0010\0072\t\b\002\020\001\032\0020\027H\002J\036\020\001\032\017\022\004\022\0020'\022\004\022\0020`0\0012\006\020b\032\0020\007H\002JV\020\001\032\0020`2D\020w\032@\b\001\022\005\022\0030\001\022\027\022\0250\001¢\006\017\b\001\022\n\b\001\022\005\b\b(\001\022\013\022\t\022\004\022\0020`0 \001\022\006\022\004\030\0010'0\001¢\006\003\b¡\001H@¢\006\003\020¢\001J\t\020£\001\032\0020\027H\002J \020£\001\032\0020`2\024\020¤\001\032\017\022\004\022\0020\007\022\004\022\0020`0\001H\bJ\021\020¥\001\032\0020`2\006\020b\032\0020\007H\002J\037\020¦\001\032\0020`2\016\020§\001\032\t\022\005\022\0030¨\0010*H\020¢\006\003\b©\001J\027\020ª\001\032\0020`2\006\020b\032\0020\007H\020¢\006\003\b«\001J\022\020¬\001\032\0020`2\007\020­\001\032\0020QH\002J\021\020®\001\032\0020`2\006\020b\032\0020\007H\002J\027\020¯\001\032\0020`2\006\020b\032\0020\007H\020¢\006\003\b°\001J\013\020±\001\032\004\030\00109H\002J\007\020²\001\032\0020`J\t\020³\001\032\0020`H\002J$\020´\001\032\0020`2\b\020\001\032\0030\0012\b\020µ\001\032\0030¶\001H@¢\006\003\020·\001J\017\020¸\001\032\0020`H@¢\006\002\020iJ\030\020¹\001\032\0020`2\006\020L\032\0020\003H@¢\006\003\020º\001J\027\020»\001\032\0020`2\006\020b\032\0020\007H\020¢\006\003\b¼\001J.\020½\001\032\017\022\004\022\0020'\022\004\022\0020`0\0012\006\020b\032\0020\0072\016\020v\032\n\022\004\022\0020'\030\0010UH\002R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000R\026\020\b\032\n\022\004\022\0020\007\030\0010\tX\016¢\006\002\n\000R\024\020\n\032\b\022\004\022\0020\f0\013X\004¢\006\002\n\000R\016\020\r\032\0020\016X\004¢\006\002\n\000R\036\020\021\032\0020\0202\006\020\017\032\0020\020@BX\016¢\006\b\n\000\032\004\b\022\020\023R\020\020\024\032\004\030\0010\025X\016¢\006\002\n\000R\024\020\026\032\0020\0278PX\004¢\006\006\032\004\b\030\020\031R\024\020\032\032\0020\0278PX\004¢\006\006\032\004\b\033\020\031R\024\020\034\032\0020\0278PX\004¢\006\006\032\004\b\035\020\031R\024\020\036\032\b\022\004\022\0020\0070\037X\004¢\006\002\n\000R\032\020 \032\016\022\004\022\0020\"\022\004\022\0020#0!X\004¢\006\002\n\000R\024\020$\032\b\022\004\022\0020\"0\006X\004¢\006\002\n\000R(\020%\032\034\022\f\022\n\022\006\022\004\030\0010'0&\022\n\022\b\022\004\022\0020\"0\0060!X\004¢\006\002\n\000R\024\020(\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000R\026\020)\032\n\022\004\022\0020\007\030\0010*X\016¢\006\002\n\000R\024\020+\032\0020,8PX\004¢\006\006\032\004\b-\020.R\016\020/\032\0020,X\016¢\006\002\n\000R\027\0200\032\b\022\004\022\0020\f018F¢\006\006\032\004\b2\0203R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b4\0205R\016\0206\032\00207X\004¢\006\002\n\000R\020\0208\032\004\030\00109X\016¢\006\002\n\000R\026\020:\032\n\022\004\022\0020\007\030\0010\006X\016¢\006\002\n\000R\016\020;\032\0020\027X\016¢\006\002\n\000R\024\020<\032\0020\0278BX\004¢\006\006\032\004\b=\020\031R\024\020>\032\0020\0278BX\004¢\006\006\032\004\b?\020\031R\024\020@\032\0020\0278BX\004¢\006\006\032\004\bA\020\031R\024\020B\032\0020\0278BX\004¢\006\006\032\004\bC\020\031R\021\020D\032\0020\0278F¢\006\006\032\004\bE\020\031R\024\020F\032\0020\0278BX\004¢\006\006\032\004\bG\020\031R\016\020H\032\0020\027X\016¢\006\002\n\000R\032\020I\032\b\022\004\022\0020\0070\t8BX\004¢\006\006\032\004\bJ\020KR\024\020L\032\0020\0038PX\004¢\006\006\032\004\bM\0205R\022\020N\032\0060OR\0020\000X\004¢\006\002\n\000R\020\020P\032\004\030\0010QX\016¢\006\002\n\000R\024\020R\032\0020\0278BX\004¢\006\006\032\004\bS\020\031R\024\020T\032\b\022\004\022\0020'0UX\016¢\006\002\n\000R \020V\032\b\022\004\022\0020\f0W8FX\004¢\006\f\022\004\bX\020Y\032\004\bZ\020[R\016\020\\\032\0020]X\004¢\006\002\n\000R\026\020^\032\n\022\004\022\0020`\030\0010_X\016¢\006\002\n\000¨\006Ã\001"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "_knownCompositions", "", "Landroidx/compose/runtime/ControlledComposition;", "_knownCompositionsCache", "", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/Recomposer$State;", "broadcastFrameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "<set-?>", "", "changeCount", "getChangeCount", "()J", "closeCause", "", "collectingCallByInformation", "", "getCollectingCallByInformation$runtime", "()Z", "collectingParameterInformation", "getCollectingParameterInformation$runtime", "collectingSourceInformation", "getCollectingSourceInformation$runtime", "compositionInvalidations", "Landroidx/compose/runtime/collection/MutableVector;", "compositionValueStatesAvailable", "", "Landroidx/compose/runtime/MovableContentStateReference;", "Landroidx/compose/runtime/MovableContentState;", "compositionValuesAwaitingInsert", "compositionValuesRemoved", "Landroidx/compose/runtime/MovableContent;", "", "compositionsAwaitingApply", "compositionsRemoved", "", "compoundHashKey", "", "getCompoundHashKey$runtime", "()I", "concurrentCompositionsOutstanding", "currentState", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentState", "()Lkotlinx/coroutines/flow/StateFlow;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "effectJob", "Lkotlinx/coroutines/CompletableJob;", "errorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "failedCompositions", "frameClockPaused", "hasBroadcastFrameClockAwaiters", "getHasBroadcastFrameClockAwaiters", "hasBroadcastFrameClockAwaitersLocked", "getHasBroadcastFrameClockAwaitersLocked", "hasConcurrentFrameWorkLocked", "getHasConcurrentFrameWorkLocked", "hasFrameWorkLocked", "getHasFrameWorkLocked", "hasPendingWork", "getHasPendingWork", "hasSchedulingWork", "getHasSchedulingWork", "isClosed", "knownCompositions", "getKnownCompositions", "()Ljava/util/List;", "recomposeCoroutineContext", "getRecomposeCoroutineContext$runtime", "recomposerInfo", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "runnerJob", "Lkotlinx/coroutines/Job;", "shouldKeepRecomposing", "getShouldKeepRecomposing", "snapshotInvalidations", "Landroidx/collection/MutableScatterSet;", "state", "Lkotlinx/coroutines/flow/Flow;", "getState$annotations", "()V", "getState", "()Lkotlinx/coroutines/flow/Flow;", "stateLock", "Landroidx/compose/runtime/SynchronizedObject;", "workContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "addKnownCompositionLocked", "composition", "applyAndCheck", "snapshot", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "asRecomposerInfo", "Landroidx/compose/runtime/RecomposerInfo;", "awaitIdle", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitWorkAvailable", "cancel", "clearKnownCompositionsLocked", "close", "composeInitial", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composing", "T", "modifiedValues", "block", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "deletedMovableContent", "reference", "deletedMovableContent$runtime", "deriveStateLocked", "discardUnusedValues", "insertMovableContent", "insertMovableContent$runtime", "invalidate", "invalidate$runtime", "invalidateScope", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateScope$runtime", "join", "movableContentStateReleased", "data", "movableContentStateReleased$runtime", "movableContentStateResolve", "movableContentStateResolve$runtime", "pauseCompositionFrameClock", "performInitialMovableContentInserts", "performInsertValues", "references", "performRecompose", "processCompositionError", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "failedInitialComposition", "recoverable", "readObserverOf", "Lkotlin/Function1;", "recompositionRunner", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/ParameterName;", "name", "parentFrameClock", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordComposerModifications", "onEachInvalidComposition", "recordFailedCompositionLocked", "recordInspectionTable", "table", "Landroidx/compose/runtime/tooling/CompositionData;", "recordInspectionTable$runtime", "registerComposition", "registerComposition$runtime", "registerRunnerJob", "callingJob", "removeKnownCompositionLocked", "reportRemovedComposition", "reportRemovedComposition$runtime", "resetErrorState", "resumeCompositionFrameClock", "retryFailedCompositions", "runFrameLoop", "frameSignal", "Landroidx/compose/runtime/ProduceFrameSignal;", "(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runRecomposeAndApplyChanges", "runRecomposeConcurrentlyAndApplyChanges", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unregisterComposition", "unregisterComposition$runtime", "writeObserverOf", "Companion", "HotReloadable", "RecomposerErrorState", "RecomposerInfoImpl", "State", "runtime"})
/*      */ @StabilityInferred(parameters = 0)
/*      */ @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 9 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 10 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1646:1\n1299#1,5:1712\n1305#1:1722\n1299#1,5:1735\n1305#1:1745\n1299#1,5:1766\n1305#1:1829\n1208#2:1647\n1187#2,2:1648\n26#3:1650\n26#3:1651\n26#3:1654\n26#3:1656\n26#3:1663\n26#3:1664\n26#3:1665\n26#3:1666\n26#3:1684\n26#3:1685\n26#3:1686\n26#3:1687\n26#3:1688\n26#3:1689\n26#3:1690\n26#3:1697\n26#3:1707\n26#3:1710\n26#3:1711\n26#3:1723\n26#3:1724\n26#3:1774\n26#3:1816\n26#3:1830\n26#3:1853\n26#3:1854\n26#3:1855\n26#3:1856\n26#3:1859\n26#3:1862\n26#3:1863\n26#3:1864\n26#3:1865\n26#3:1866\n26#3:1867\n26#3:1868\n1247#4,2:1652\n1#5:1655\n1#5:1812\n33#6,6:1657\n33#6,6:1667\n33#6,6:1691\n93#6,2:1725\n33#6,4:1727\n95#6,2:1731\n38#6:1733\n97#6:1734\n120#6,3:1746\n33#6,4:1749\n123#6,2:1753\n125#6,2:1762\n38#6:1764\n127#6:1765\n82#6,3:1775\n33#6,4:1778\n85#6,2:1782\n38#6:1784\n87#6:1785\n110#6,2:1786\n33#6,6:1788\n112#6:1794\n110#6,2:1795\n33#6,6:1797\n112#6:1803\n211#6,3:1804\n33#6,4:1807\n214#6:1811\n215#6:1813\n38#6:1814\n216#6:1815\n231#6,3:1817\n64#6,4:1820\n234#6,2:1824\n69#6:1826\n236#6:1827\n82#6,3:1831\n33#6,4:1834\n85#6,2:1838\n38#6:1840\n87#6:1841\n33#6,6:1842\n460#7,11:1673\n735#7,2:1857\n728#7,2:1860\n310#8,9:1698\n319#8,2:1708\n139#9,5:1717\n139#9,5:1740\n139#9,3:1771\n143#9:1828\n139#9,5:1848\n372#10,7:1755\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n1121#1:1712,5\n1121#1:1722\n1198#1:1735,5\n1198#1:1745\n1218#1:1766,5\n1218#1:1829\n218#1:1647\n218#1:1648,2\n297#1:1650\n347#1:1651\n441#1:1654\n446#1:1656\n460#1:1663\n469#1:1664\n474#1:1665\n485#1:1666\n497#1:1684\n505#1:1685\n751#1:1686\n781#1:1687\n812#1:1688\n824#1:1689\n841#1:1690\n989#1:1697\n1001#1:1707\n1086#1:1710\n1102#1:1711\n1134#1:1723\n1165#1:1724\n1221#1:1774\n1239#1:1816\n1262#1:1830\n1329#1:1853\n1366#1:1854\n1381#1:1855\n1413#1:1856\n1421#1:1859\n1430#1:1862\n1437#1:1863\n1444#1:1864\n1453#1:1865\n1459#1:1866\n1471#1:1867\n1171#1:1868\n348#1:1652,2\n1236#1:1812\n452#1:1657,6\n491#1:1667,6\n842#1:1691,6\n1166#1:1725,2\n1166#1:1727,4\n1166#1:1731,2\n1166#1:1733\n1166#1:1734\n1215#1:1746,3\n1215#1:1749,4\n1215#1:1753,2\n1215#1:1762,2\n1215#1:1764\n1215#1:1765\n1222#1:1775,3\n1222#1:1778,4\n1222#1:1782,2\n1222#1:1784\n1222#1:1785\n1231#1:1786,2\n1231#1:1788,6\n1231#1:1794\n1231#1:1795,2\n1231#1:1797,6\n1231#1:1803\n1236#1:1804,3\n1236#1:1807,4\n1236#1:1811\n1236#1:1813\n1236#1:1814\n1236#1:1815\n1244#1:1817,3\n1244#1:1820,4\n1244#1:1824,2\n1244#1:1826\n1244#1:1827\n1266#1:1831,3\n1266#1:1834,4\n1266#1:1838,2\n1266#1:1840\n1266#1:1841\n1273#1:1842,6\n495#1:1673,11\n1415#1:1857,2\n1423#1:1860,2\n1000#1:1698,9\n1000#1:1708,2\n1121#1:1717,5\n1198#1:1740,5\n1218#1:1771,3\n1218#1:1828\n1303#1:1848,5\n1215#1:1755,7\n*E\n"})
/*      */ public final class Recomposer
/*      */   extends CompositionContext
/*      */ {
/*      */   public final long getChangeCount() {
/*  142 */     return this.changeCount;
/*      */   }
/*      */   @NotNull
/*  145 */   private final BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Recomposer$broadcastFrameClock$1()); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$broadcastFrameClock$1\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n*L\n1#1,1646:1\n26#2:1647\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$broadcastFrameClock$1\n*L\n146#1:1647\n*E\n"})
/*  146 */   static final class Recomposer$broadcastFrameClock$1 extends Lambda implements Function0<Unit> { public final void invoke() { SynchronizedObject synchronizedObject = Recomposer.this.stateLock; Recomposer recomposer = Recomposer.this; int $i$f$synchronized = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1647 */       synchronized (synchronizedObject) { int $i$a$-synchronized-Recomposer$broadcastFrameClock$1$1 = 0; CancellableContinuation cancellableContinuation2 = recomposer.deriveStateLocked(), it = cancellableContinuation2; int $i$a$-also-Recomposer$broadcastFrameClock$1$1$1 = 0; if (((Recomposer.State)recomposer._state.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) throw ExceptionsKt.CancellationException("Recomposer shutdown; frame clock awaiter will never resume", recomposer.closeCause);  CancellableContinuation cancellableContinuation1 = cancellableContinuation2; }  CancellableContinuation cancellableContinuation = cancellableContinuation1; if (cancellableContinuation != null) { ((Continuation)cancellableContinuation).resumeWith(Result.constructor-impl(Unit.INSTANCE)); } else {  }  } Recomposer$broadcastFrameClock$1() { super(0); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\b\b\002\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\b¨\006\t"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime"}) public enum State { ShutDown, ShuttingDown, Inactive, InactivePendingWork, Idle, PendingWork; @NotNull public static EnumEntries<State> getEntries() { return $ENTRIES; } } @NotNull private final SynchronizedObject stateLock = new SynchronizedObject(); @NotNull private final List<ControlledComposition> _knownCompositions = new ArrayList<>(); private final List<ControlledComposition> getKnownCompositions() { if (this._knownCompositionsCache == null) { Recomposer $this$_get_knownCompositions__u24lambda_u240 = this; int $i$a$-run-Recomposer$knownCompositions$1 = 0; List<ControlledComposition> compositions = $this$_get_knownCompositions__u24lambda_u240._knownCompositions; List<? extends ControlledComposition> newCache = compositions.isEmpty() ? CollectionsKt.emptyList() : new ArrayList<>(compositions); $this$_get_knownCompositions__u24lambda_u240._knownCompositionsCache = newCache; }  return (List)newCache; } @NotNull private MutableScatterSet<Object> snapshotInvalidations = new MutableScatterSet(0, 1, null);
/* 1648 */   public Recomposer(@NotNull CoroutineContext effectCoroutineContext) { int $i$f$mutableVectorOf = 0; int capacity$iv$iv = 16, $i$f$MutableVector = 0;
/* 1649 */     this.compositionInvalidations = new MutableVector((Object[])new ControlledComposition[capacity$iv$iv], 0); this.compositionsAwaitingApply = new ArrayList<>(); this.compositionValuesAwaitingInsert = new ArrayList<>(); this.compositionValuesRemoved = new LinkedHashMap<>(); this.compositionValueStatesAvailable = new LinkedHashMap<>(); this._state = StateFlowKt.MutableStateFlow(State.Inactive); CompletableJob completableJob1 = JobKt.Job((Job)effectCoroutineContext.get((CoroutineContext.Key)Job.Key)), completableJob2 = completableJob1; Recomposer recomposer = this; int $i$a$-apply-Recomposer$effectJob$1 = 0; completableJob2.invokeOnCompletion(new Recomposer$effectJob$1$1()); recomposer.effectJob = completableJob1; this.effectCoroutineContext = effectCoroutineContext.plus((CoroutineContext)this.broadcastFrameClock).plus((CoroutineContext)this.effectJob); this.recomposerInfo = new RecomposerInfoImpl(); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\003\n\000\020\000\032\0020\0012\b\020\002\032\004\030\0010\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "throwable", "", "invoke"}) @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n*L\n1#1,1646:1\n26#2:1647\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n*L\n251#1:1647\n*E\n"}) static final class Recomposer$effectJob$1$1 extends Lambda implements Function1<Throwable, Unit> {
/* 1650 */     public final void invoke(@Nullable Throwable throwable) { CancellationException cancellation = ExceptionsKt.CancellationException("Recomposer effect job completed", throwable); Object continuationToResume = null; SynchronizedObject synchronizedObject = Recomposer.this.stateLock; Recomposer recomposer = Recomposer.this; int $i$f$synchronized = 0; synchronized (synchronizedObject) { int $i$a$-synchronized-Recomposer$effectJob$1$1$1 = 0; Job runnerJob = recomposer.runnerJob; recomposer._state.setValue(Recomposer.State.ShuttingDown); if (!recomposer.isClosed) { runnerJob.cancel(cancellation); } else if (recomposer.workContinuation != null) { continuationToResume = recomposer.workContinuation; }  recomposer.workContinuation = null; recomposer.closeCause = cancellation; recomposer._state.setValue(Recomposer.State.ShutDown); Object object = (runnerJob != null) ? runnerJob.invokeOnCompletion(new Recomposer$effectJob$1$1$1$1(throwable)) : Unit.INSTANCE; }  if (continuationToResume != null) { ((Continuation)continuationToResume).resumeWith(Result.constructor-impl(Unit.INSTANCE)); } else {  }  } Recomposer$effectJob$1$1() { super(1); } } @NotNull public CoroutineContext getEffectCoroutineContext() { return this.effectCoroutineContext; } @NotNull public CoroutineContext getRecomposeCoroutineContext$runtime() { return (CoroutineContext)EmptyCoroutineContext.INSTANCE; } private final boolean getHasBroadcastFrameClockAwaitersLocked() { return (!this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters()); } private final boolean getHasBroadcastFrameClockAwaiters() { SynchronizedObject lock$iv = this.stateLock; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-Recomposer$hasBroadcastFrameClockAwaiters$1 = 0; boolean bool = getHasBroadcastFrameClockAwaitersLocked(); }  return bool; } private final CancellableContinuation<Unit> deriveStateLocked() { if (((State)this._state.getValue()).compareTo(State.ShuttingDown) <= 0) { clearKnownCompositionsLocked(); this.snapshotInvalidations = new MutableScatterSet(0, 1, null); this.compositionInvalidations.clear(); this.compositionsAwaitingApply.clear(); this.compositionValuesAwaitingInsert.clear(); this.failedCompositions = null; if (this.workContinuation != null) { CancellableContinuation.DefaultImpls.cancel$default(this.workContinuation, null, 1, null); } else {  }  this.workContinuation = null; this.errorState = null; return null; }  this.snapshotInvalidations = new MutableScatterSet(0, 1, null); this.compositionInvalidations.clear(); State newState = (this.errorState != null) ? State.Inactive : ((this.runnerJob == null) ? (getHasBroadcastFrameClockAwaitersLocked() ? State.InactivePendingWork : State.Inactive) : ((this.compositionInvalidations.isNotEmpty() || this.snapshotInvalidations.isNotEmpty() || (!this.compositionsAwaitingApply.isEmpty()) || (!this.compositionValuesAwaitingInsert.isEmpty()) || this.concurrentCompositionsOutstanding > 0 || getHasBroadcastFrameClockAwaitersLocked()) ? State.PendingWork : State.Idle)); this._state.setValue(newState); CancellableContinuation<? super Unit> cancellableContinuation1 = this.workContinuation, it = cancellableContinuation1; int $i$a$-also-Recomposer$deriveStateLocked$1 = 0; this.workContinuation = null; return (newState == State.PendingWork) ? (CancellableContinuation)cancellableContinuation1 : null; } private final boolean getShouldKeepRecomposing() { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield stateLock : Landroidx/compose/runtime/SynchronizedObject;
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
/*      */     //   16: getfield isClosed : Z
/*      */     //   19: ifne -> 26
/*      */     //   22: iconst_1
/*      */     //   23: goto -> 27
/*      */     //   26: iconst_0
/*      */     //   27: istore #4
/*      */     //   29: aload_3
/*      */     //   30: monitorexit
/*      */     //   31: iload #4
/*      */     //   33: goto -> 43
/*      */     //   36: astore #4
/*      */     //   38: aload_3
/*      */     //   39: monitorexit
/*      */     //   40: aload #4
/*      */     //   42: athrow
/*      */     //   43: nop
/*      */     //   44: ifne -> 111
/*      */     //   47: aload_0
/*      */     //   48: getfield effectJob : Lkotlinx/coroutines/CompletableJob;
/*      */     //   51: invokeinterface getChildren : ()Lkotlin/sequences/Sequence;
/*      */     //   56: astore_1
/*      */     //   57: iconst_0
/*      */     //   58: istore_2
/*      */     //   59: aload_1
/*      */     //   60: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */     //   65: astore_3
/*      */     //   66: aload_3
/*      */     //   67: invokeinterface hasNext : ()Z
/*      */     //   72: ifeq -> 107
/*      */     //   75: aload_3
/*      */     //   76: invokeinterface next : ()Ljava/lang/Object;
/*      */     //   81: astore #4
/*      */     //   83: aload #4
/*      */     //   85: checkcast kotlinx/coroutines/Job
/*      */     //   88: astore #5
/*      */     //   90: iconst_0
/*      */     //   91: istore #6
/*      */     //   93: aload #5
/*      */     //   95: invokeinterface isActive : ()Z
/*      */     //   100: ifeq -> 66
/*      */     //   103: iconst_1
/*      */     //   104: goto -> 108
/*      */     //   107: iconst_0
/*      */     //   108: ifeq -> 115
/*      */     //   111: iconst_1
/*      */     //   112: goto -> 116
/*      */     //   115: iconst_0
/*      */     //   116: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #347	-> 0
/*      */     //   #1651	-> 7
/*      */     //   #347	-> 15
/*      */     //   #1651	-> 27
/*      */     //   #1651	-> 43
/*      */     //   #348	-> 47
/*      */     //   #1652	-> 59
/*      */     //   #348	-> 93
/*      */     //   #1652	-> 100
/*      */     //   #1653	-> 107
/*      */     //   #348	-> 116
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   15	12	4	$i$a$-synchronized-Recomposer$shouldKeepRecomposing$1	I
/*      */     //   7	37	2	$i$f$synchronized	I
/*      */     //   5	39	1	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   93	7	6	$i$a$-any-Recomposer$shouldKeepRecomposing$2	I
/*      */     //   90	10	5	it	Lkotlinx/coroutines/Job;
/*      */     //   83	24	4	element$iv	Ljava/lang/Object;
/*      */     //   59	49	2	$i$f$any	I
/*      */     //   57	51	1	$this$any$iv	Lkotlin/sequences/Sequence;
/*      */     //   0	117	0	this	Landroidx/compose/runtime/Recomposer;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   11	29	36	finally
/* 1650 */     //   36	38	36	finally } @NotNull public final Flow<State> getState() { return (Flow<State>)getCurrentState(); } @NotNull public final StateFlow<State> getCurrentState() { return (StateFlow<State>)this._state; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\t\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\b\004\030\0002\0020\001B\005¢\006\002\020\002J\016\020\024\032\0020\0252\006\020\026\032\0020\027J\b\020\030\032\004\030\0010\031J\006\020\032\032\0020\025J\f\020\033\032\b\022\004\022\0020\0350\034R\024\020\003\032\0020\0048VX\004¢\006\006\032\004\b\005\020\006R\023\020\007\032\004\030\0010\b8F¢\006\006\032\004\b\t\020\nR\024\020\013\032\0020\f8VX\004¢\006\006\032\004\b\r\020\016R\032\020\017\032\b\022\004\022\0020\0210\0208VX\004¢\006\006\032\004\b\022\020\023¨\006\036"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/RecomposerInfo;", "(Landroidx/compose/runtime/Recomposer;)V", "changeCount", "", "getChangeCount", "()J", "currentError", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentError", "()Landroidx/compose/runtime/RecomposerErrorInfo;", "hasPendingWork", "", "getHasPendingWork", "()Z", "state", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/runtime/Recomposer$State;", "getState", "()Lkotlinx/coroutines/flow/Flow;", "invalidateGroupsWithKey", "", "key", "", "resetErrorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "retryFailedCompositions", "saveStateAndDisposeForHotReload", "", "Landroidx/compose/runtime/Recomposer$HotReloadable;", "runtime"}) @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1646:1\n26#2:1647\n26#2:1648\n26#2:1667\n211#3,3:1649\n33#3,4:1652\n214#3:1656\n215#3:1658\n38#3:1659\n216#3:1660\n33#3,6:1661\n211#3,3:1668\n33#3,4:1671\n214#3:1675\n215#3:1677\n38#3:1678\n216#3:1679\n82#3,3:1680\n33#3,4:1683\n85#3:1687\n86#3:1689\n38#3:1690\n87#3:1691\n1#4:1657\n1#4:1676\n1#4:1688\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n*L\n373#1:1647\n378#1:1648\n386#1:1667\n382#1:1649,3\n382#1:1652,4\n382#1:1656\n382#1:1658\n382#1:1659\n382#1:1660\n383#1:1661,6\n390#1:1668,3\n390#1:1671,4\n390#1:1675\n390#1:1677\n390#1:1678\n390#1:1679\n391#1:1680,3\n391#1:1683,4\n391#1:1687\n391#1:1689\n391#1:1690\n391#1:1691\n382#1:1657\n390#1:1676\n*E\n"}) private final class RecomposerInfoImpl implements RecomposerInfo { @NotNull public Flow<Recomposer.State> getState() { return (Flow<Recomposer.State>)Recomposer.this.getCurrentState(); } public boolean getHasPendingWork() { return Recomposer.this.getHasPendingWork(); } public long getChangeCount() { return Recomposer.this.getChangeCount(); } @Nullable public final RecomposerErrorInfo getCurrentError() { SynchronizedObject synchronizedObject = Recomposer.this.stateLock; Recomposer recomposer = Recomposer.this; int $i$f$synchronized = 0; synchronized (synchronizedObject) { int $i$a$-synchronized-Recomposer$RecomposerInfoImpl$currentError$1 = 0; Recomposer.RecomposerErrorState recomposerErrorState = recomposer.errorState; }  return recomposerErrorState; } public final void invalidateGroupsWithKey(int key) { SynchronizedObject synchronizedObject = Recomposer.this.stateLock; Recomposer recomposer = Recomposer.this; int $i$f$synchronized = 0; synchronized (synchronizedObject) { int $i$a$-synchronized-Recomposer$RecomposerInfoImpl$invalidateGroupsWithKey$compositions$1 = 0; List list = recomposer.getKnownCompositions(); }  List compositions = list; List list1 = compositions; int $i$f$fastMapNotNull = 0; ArrayList target$iv = new ArrayList(list1.size());
/* 1651 */       List $this$fastForEach$iv$iv = list1; int j = 0;
/*      */       
/* 1653 */       int index$iv$iv = 0, k = $this$fastForEach$iv$iv.size(); if (index$iv$iv < k) {
/* 1654 */         Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/* 1655 */         Object e$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastMapNotNull$2$iv = 0;
/* 1656 */         ControlledComposition it = (ControlledComposition)e$iv; int $i$a$-fastMapNotNull-Recomposer$RecomposerInfoImpl$invalidateGroupsWithKey$1 = 0;
/*      */       } 
/*      */ 
/*      */       
/* 1660 */       List $this$fastMapNotNull$iv = target$iv;
/*      */       int $i$f$fastForEach = 0;
/* 1662 */       int index$iv = 0, i = $this$fastMapNotNull$iv.size(); if (index$iv < i) {
/* 1663 */         Object item$iv = $this$fastMapNotNull$iv.get(index$iv);
/* 1664 */         CompositionImpl it = (CompositionImpl)item$iv; int $i$a$-fastForEach-Recomposer$RecomposerInfoImpl$invalidateGroupsWithKey$2 = 0; it.invalidateGroupsWithKey(key);
/*      */       }  }
/*      */     @Nullable public final Recomposer.RecomposerErrorState resetErrorState() { return Recomposer.this.resetErrorState(); } @NotNull public final List<Recomposer.HotReloadable> saveStateAndDisposeForHotReload() { SynchronizedObject synchronizedObject = Recomposer.this.stateLock; Recomposer recomposer = Recomposer.this; int $i$f$synchronized = 0;
/* 1667 */       synchronized (synchronizedObject) { int $i$a$-synchronized-Recomposer$RecomposerInfoImpl$saveStateAndDisposeForHotReload$compositions$1 = 0; List<Recomposer.HotReloadable> list = (List)recomposer.getKnownCompositions(); }  List<Recomposer.HotReloadable> compositions = list; List<Recomposer.HotReloadable> list1 = compositions;
/*      */       int $i$f$fastMapNotNull = 0;
/* 1669 */       ArrayList<Recomposer.HotReloadable> target$iv = new ArrayList(list1.size());
/* 1670 */       List<Recomposer.HotReloadable> $this$fastForEach$iv$iv = list1; int $i$f$fastForEach = 0;
/*      */       
/* 1672 */       int index$iv$iv = 0, i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i) {
/* 1673 */         Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/* 1674 */         Object e$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastMapNotNull$2$iv = 0;
/* 1675 */         ControlledComposition it = (ControlledComposition)e$iv; int $i$a$-fastMapNotNull-Recomposer$RecomposerInfoImpl$saveStateAndDisposeForHotReload$1 = 0;
/*      */       } 
/*      */ 
/*      */       
/* 1679 */       List<Recomposer.HotReloadable> $this$fastMapNotNull$iv = target$iv;
/*      */       int $i$f$fastMap = 0;
/* 1681 */       target$iv = new ArrayList($this$fastMapNotNull$iv.size());
/* 1682 */       $this$fastForEach$iv$iv = $this$fastMapNotNull$iv; $i$f$fastForEach = 0;
/*      */       
/* 1684 */       index$iv$iv = 0; i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i) {
/* 1685 */         Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/* 1686 */         Object it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0;
/* 1687 */         CompositionImpl compositionImpl = (CompositionImpl)it$iv; ArrayList<Recomposer.HotReloadable> arrayList = target$iv; int $i$a$-fastMap-Recomposer$RecomposerInfoImpl$saveStateAndDisposeForHotReload$2 = 0; Object object1 = new Recomposer.HotReloadable(compositionImpl), object2 = object1;
/* 1688 */         int $i$a$-apply-Recomposer$RecomposerInfoImpl$saveStateAndDisposeForHotReload$2$1 = 0;
/*      */       } 
/*      */       
/* 1691 */       return target$iv; } public final void retryFailedCompositions() { Recomposer.this.retryFailedCompositions(); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\005\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\006\020\n\032\0020\007J\006\020\013\032\0020\007J\006\020\f\032\0020\007R\033\020\005\032\r\022\004\022\0020\0070\006¢\006\002\b\bX\016¢\006\004\n\002\020\tR\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\r"}, d2 = {"Landroidx/compose/runtime/Recomposer$HotReloadable;", "", "composition", "Landroidx/compose/runtime/CompositionImpl;", "(Landroidx/compose/runtime/CompositionImpl;)V", "composable", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/jvm/functions/Function2;", "clearContent", "recompose", "resetContent", "runtime"}) private static final class HotReloadable { @NotNull private final CompositionImpl composition; @NotNull private Function2<? super Composer, ? super Integer, Unit> composable; public HotReloadable(@NotNull CompositionImpl composition) { this.composition = composition; this.composable = this.composition.getComposable(); } public final void clearContent() { if (this.composition.isRoot()) this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.getLambda-1$runtime());  } public final void resetContent() { this.composition.setComposable(this.composable); } public final void recompose() { if (this.composition.isRoot()) this.composition.setContent(this.composable);  } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\b\006\b\002\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\n\020\004\032\0060\005j\002`\006¢\006\002\020\007R\030\020\004\032\0060\005j\002`\006X\004¢\006\b\n\000\032\004\b\b\020\tR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "Landroidx/compose/runtime/RecomposerErrorInfo;", "recoverable", "", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(ZLjava/lang/Exception;)V", "getCause", "()Ljava/lang/Exception;", "getRecoverable", "()Z", "runtime"}) private static final class RecomposerErrorState implements RecomposerErrorInfo { private final boolean recoverable; @NotNull private final Exception cause; public RecomposerErrorState(boolean recoverable, @NotNull Exception cause) { this.recoverable = recoverable; this.cause = cause; } public boolean getRecoverable() { return this.recoverable; } @NotNull public Exception getCause() { return this.cause; } } @NotNull public final RecomposerInfo asRecomposerInfo() { return this.recomposerInfo; } private final boolean recordComposerModifications() { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield stateLock : Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   4: astore_2
/*      */     //   5: iconst_0
/*      */     //   6: istore_3
/*      */     //   7: aload_2
/*      */     //   8: astore #4
/*      */     //   10: aload #4
/*      */     //   12: monitorenter
/*      */     //   13: nop
/*      */     //   14: iconst_0
/*      */     //   15: istore #5
/*      */     //   17: aload_0
/*      */     //   18: getfield snapshotInvalidations : Landroidx/collection/MutableScatterSet;
/*      */     //   21: invokevirtual isEmpty : ()Z
/*      */     //   24: ifeq -> 39
/*      */     //   27: aload_0
/*      */     //   28: invokespecial getHasFrameWorkLocked : ()Z
/*      */     //   31: istore #9
/*      */     //   33: aload #4
/*      */     //   35: monitorexit
/*      */     //   36: iload #9
/*      */     //   38: ireturn
/*      */     //   39: aload_0
/*      */     //   40: getfield snapshotInvalidations : Landroidx/collection/MutableScatterSet;
/*      */     //   43: checkcast androidx/collection/ScatterSet
/*      */     //   46: invokestatic wrapIntoSet : (Landroidx/collection/ScatterSet;)Ljava/util/Set;
/*      */     //   49: astore #6
/*      */     //   51: aload #6
/*      */     //   53: astore #7
/*      */     //   55: iconst_0
/*      */     //   56: istore #8
/*      */     //   58: aload_0
/*      */     //   59: new androidx/collection/MutableScatterSet
/*      */     //   62: dup
/*      */     //   63: iconst_0
/*      */     //   64: iconst_1
/*      */     //   65: aconst_null
/*      */     //   66: invokespecial <init> : (IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*      */     //   69: putfield snapshotInvalidations : Landroidx/collection/MutableScatterSet;
/*      */     //   72: aload #6
/*      */     //   74: nop
/*      */     //   75: astore #5
/*      */     //   77: aload #4
/*      */     //   79: monitorexit
/*      */     //   80: aload #5
/*      */     //   82: goto -> 93
/*      */     //   85: astore #5
/*      */     //   87: aload #4
/*      */     //   89: monitorexit
/*      */     //   90: aload #5
/*      */     //   92: athrow
/*      */     //   93: nop
/*      */     //   94: astore_1
/*      */     //   95: aload_0
/*      */     //   96: getfield stateLock : Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   99: astore_3
/*      */     //   100: iconst_0
/*      */     //   101: istore #4
/*      */     //   103: aload_3
/*      */     //   104: astore #5
/*      */     //   106: aload #5
/*      */     //   108: monitorenter
/*      */     //   109: nop
/*      */     //   110: iconst_0
/*      */     //   111: istore #6
/*      */     //   113: aload_0
/*      */     //   114: invokespecial getKnownCompositions : ()Ljava/util/List;
/*      */     //   117: astore #6
/*      */     //   119: aload #5
/*      */     //   121: monitorexit
/*      */     //   122: aload #6
/*      */     //   124: goto -> 135
/*      */     //   127: astore #6
/*      */     //   129: aload #5
/*      */     //   131: monitorexit
/*      */     //   132: aload #6
/*      */     //   134: athrow
/*      */     //   135: nop
/*      */     //   136: astore_2
/*      */     //   137: iconst_0
/*      */     //   138: istore_3
/*      */     //   139: nop
/*      */     //   140: aload_0
/*      */     //   141: checkcast androidx/compose/runtime/Recomposer
/*      */     //   144: astore #5
/*      */     //   146: iconst_0
/*      */     //   147: istore #6
/*      */     //   149: aload_2
/*      */     //   150: astore #7
/*      */     //   152: iconst_0
/*      */     //   153: istore #8
/*      */     //   155: nop
/*      */     //   156: iconst_0
/*      */     //   157: istore #9
/*      */     //   159: aload #7
/*      */     //   161: invokeinterface size : ()I
/*      */     //   166: istore #10
/*      */     //   168: iload #9
/*      */     //   170: iload #10
/*      */     //   172: if_icmpge -> 237
/*      */     //   175: aload #7
/*      */     //   177: iload #9
/*      */     //   179: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   184: astore #11
/*      */     //   186: aload #11
/*      */     //   188: checkcast androidx/compose/runtime/ControlledComposition
/*      */     //   191: astore #12
/*      */     //   193: iconst_0
/*      */     //   194: istore #13
/*      */     //   196: aload #12
/*      */     //   198: aload_1
/*      */     //   199: invokeinterface recordModificationsOf : (Ljava/util/Set;)V
/*      */     //   204: aload #5
/*      */     //   206: getfield _state : Lkotlinx/coroutines/flow/MutableStateFlow;
/*      */     //   209: invokeinterface getValue : ()Ljava/lang/Object;
/*      */     //   214: checkcast androidx/compose/runtime/Recomposer$State
/*      */     //   217: getstatic androidx/compose/runtime/Recomposer$State.ShuttingDown : Landroidx/compose/runtime/Recomposer$State;
/*      */     //   220: checkcast java/lang/Enum
/*      */     //   223: invokevirtual compareTo : (Ljava/lang/Enum;)I
/*      */     //   226: ifle -> 239
/*      */     //   229: nop
/*      */     //   230: nop
/*      */     //   231: iinc #9, 1
/*      */     //   234: goto -> 168
/*      */     //   237: nop
/*      */     //   238: nop
/*      */     //   239: nop
/*      */     //   240: aload_0
/*      */     //   241: getfield stateLock : Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   244: astore #4
/*      */     //   246: iconst_0
/*      */     //   247: istore #5
/*      */     //   249: aload #4
/*      */     //   251: astore #6
/*      */     //   253: aload #6
/*      */     //   255: monitorenter
/*      */     //   256: nop
/*      */     //   257: iconst_0
/*      */     //   258: istore #7
/*      */     //   260: aload_0
/*      */     //   261: new androidx/collection/MutableScatterSet
/*      */     //   264: dup
/*      */     //   265: iconst_0
/*      */     //   266: iconst_1
/*      */     //   267: aconst_null
/*      */     //   268: invokespecial <init> : (IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*      */     //   271: putfield snapshotInvalidations : Landroidx/collection/MutableScatterSet;
/*      */     //   274: nop
/*      */     //   275: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   278: astore #7
/*      */     //   280: aload #6
/*      */     //   282: monitorexit
/*      */     //   283: goto -> 294
/*      */     //   286: astore #7
/*      */     //   288: aload #6
/*      */     //   290: monitorexit
/*      */     //   291: aload #7
/*      */     //   293: athrow
/*      */     //   294: nop
/*      */     //   295: iconst_1
/*      */     //   296: istore_3
/*      */     //   297: nop
/*      */     //   298: goto -> 354
/*      */     //   301: astore #4
/*      */     //   303: aload_0
/*      */     //   304: getfield stateLock : Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   307: astore #5
/*      */     //   309: iconst_0
/*      */     //   310: istore #6
/*      */     //   312: aload #5
/*      */     //   314: astore #7
/*      */     //   316: aload #7
/*      */     //   318: monitorenter
/*      */     //   319: nop
/*      */     //   320: iconst_0
/*      */     //   321: istore #8
/*      */     //   323: aload_0
/*      */     //   324: getfield snapshotInvalidations : Landroidx/collection/MutableScatterSet;
/*      */     //   327: aload_1
/*      */     //   328: checkcast java/lang/Iterable
/*      */     //   331: invokevirtual addAll : (Ljava/lang/Iterable;)Z
/*      */     //   334: istore #9
/*      */     //   336: aload #7
/*      */     //   338: monitorexit
/*      */     //   339: goto -> 350
/*      */     //   342: astore #9
/*      */     //   344: aload #7
/*      */     //   346: monitorexit
/*      */     //   347: aload #9
/*      */     //   349: athrow
/*      */     //   350: nop
/*      */     //   351: aload #4
/*      */     //   353: athrow
/*      */     //   354: aload_0
/*      */     //   355: getfield stateLock : Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   358: astore #4
/*      */     //   360: iconst_0
/*      */     //   361: istore #5
/*      */     //   363: aload #4
/*      */     //   365: astore #6
/*      */     //   367: aload #6
/*      */     //   369: monitorenter
/*      */     //   370: nop
/*      */     //   371: iconst_0
/*      */     //   372: istore #7
/*      */     //   374: aload_0
/*      */     //   375: invokespecial deriveStateLocked : ()Lkotlinx/coroutines/CancellableContinuation;
/*      */     //   378: ifnull -> 395
/*      */     //   381: new java/lang/IllegalStateException
/*      */     //   384: dup
/*      */     //   385: ldc_w 'called outside of runRecomposeAndApplyChanges'
/*      */     //   388: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   391: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   394: athrow
/*      */     //   395: aload_0
/*      */     //   396: invokespecial getHasFrameWorkLocked : ()Z
/*      */     //   399: istore #7
/*      */     //   401: aload #6
/*      */     //   403: monitorexit
/*      */     //   404: iload #7
/*      */     //   406: goto -> 417
/*      */     //   409: astore #7
/*      */     //   411: aload #6
/*      */     //   413: monitorexit
/*      */     //   414: aload #7
/*      */     //   416: athrow
/*      */     //   417: nop
/*      */     //   418: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #441	-> 0
/*      */     //   #1654	-> 7
/*      */     //   #442	-> 17
/*      */     //   #443	-> 39
/*      */     //   #444	-> 51
/*      */     //   #1655	-> 55
/*      */     //   #444	-> 58
/*      */     //   #444	-> 72
/*      */     //   #444	-> 74
/*      */     //   #1654	-> 75
/*      */     //   #1654	-> 93
/*      */     //   #441	-> 94
/*      */     //   #446	-> 95
/*      */     //   #1656	-> 103
/*      */     //   #447	-> 113
/*      */     //   #1656	-> 117
/*      */     //   #1656	-> 135
/*      */     //   #446	-> 136
/*      */     //   #449	-> 137
/*      */     //   #450	-> 139
/*      */     //   #451	-> 140
/*      */     //   #452	-> 149
/*      */     //   #1657	-> 155
/*      */     //   #1658	-> 156
/*      */     //   #1659	-> 175
/*      */     //   #1660	-> 186
/*      */     //   #453	-> 196
/*      */     //   #457	-> 204
/*      */     //   #458	-> 229
/*      */     //   #1660	-> 230
/*      */     //   #1658	-> 231
/*      */     //   #1662	-> 237
/*      */     //   #459	-> 238
/*      */     //   #451	-> 239
/*      */     //   #460	-> 240
/*      */     //   #1663	-> 249
/*      */     //   #461	-> 260
/*      */     //   #462	-> 274
/*      */     //   #1663	-> 278
/*      */     //   #1663	-> 294
/*      */     //   #463	-> 295
/*      */     //   #465	-> 297
/*      */     //   #473	-> 298
/*      */     //   #465	-> 301
/*      */     //   #469	-> 303
/*      */     //   #1664	-> 312
/*      */     //   #470	-> 323
/*      */     //   #1664	-> 334
/*      */     //   #1664	-> 350
/*      */     //   #474	-> 354
/*      */     //   #1665	-> 363
/*      */     //   #475	-> 374
/*      */     //   #476	-> 385
/*      */     //   #478	-> 395
/*      */     //   #1665	-> 399
/*      */     //   #1665	-> 417
/*      */     //   #474	-> 418
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   58	14	8	$i$a$-also-Recomposer$recordComposerModifications$changes$1$1	I
/*      */     //   55	17	7	it	Ljava/util/Set;
/*      */     //   17	14	5	$i$a$-synchronized-Recomposer$recordComposerModifications$changes$1	I
/*      */     //   7	24	3	$i$f$synchronized	I
/*      */     //   5	26	2	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   39	55	3	$i$f$synchronized	I
/*      */     //   39	55	2	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   39	36	5	$i$a$-synchronized-Recomposer$recordComposerModifications$changes$1	I
/*      */     //   113	4	6	$i$a$-synchronized-Recomposer$recordComposerModifications$compositions$1	I
/*      */     //   103	33	4	$i$f$synchronized	I
/*      */     //   100	36	3	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   196	34	13	$i$a$-fastForEach-Recomposer$recordComposerModifications$1$1	I
/*      */     //   193	37	12	composition	Landroidx/compose/runtime/ControlledComposition;
/*      */     //   186	45	11	item$iv	Ljava/lang/Object;
/*      */     //   159	78	9	index$iv	I
/*      */     //   155	83	8	$i$f$fastForEach	I
/*      */     //   152	86	7	$this$fastForEach$iv	Ljava/util/List;
/*      */     //   149	90	6	$i$a$-run-Recomposer$recordComposerModifications$1	I
/*      */     //   146	93	5	$this$recordComposerModifications_u24lambda_u2410	Landroidx/compose/runtime/Recomposer;
/*      */     //   260	15	7	$i$a$-synchronized-Recomposer$recordComposerModifications$2	I
/*      */     //   249	46	5	$i$f$synchronized	I
/*      */     //   246	49	4	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   323	11	8	$i$a$-synchronized-Recomposer$recordComposerModifications$3	I
/*      */     //   312	39	6	$i$f$synchronized	I
/*      */     //   309	42	5	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   374	25	7	$i$a$-synchronized-Recomposer$recordComposerModifications$4	I
/*      */     //   363	55	5	$i$f$synchronized	I
/*      */     //   360	58	4	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   95	324	1	changes	Ljava/util/Set;
/*      */     //   137	282	2	compositions	Ljava/util/List;
/*      */     //   139	280	3	complete	Z
/*      */     //   0	419	0	this	Landroidx/compose/runtime/Recomposer;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   13	33	85	finally
/*      */     //   39	77	85	finally
/*      */     //   85	87	85	finally
/*      */     //   109	119	127	finally
/*      */     //   127	129	127	finally
/*      */     //   139	297	301	finally
/*      */     //   256	280	286	finally
/*      */     //   286	288	286	finally
/*      */     //   301	303	301	finally
/*      */     //   319	336	342	finally
/*      */     //   342	344	342	finally
/*      */     //   370	401	409	finally
/*      */     //   409	411	409	finally } private final void recordComposerModifications(Function1 onEachInvalidComposition) { // Byte code:
/*      */     //   0: iconst_0
/*      */     //   1: istore_2
/*      */     //   2: aload_0
/*      */     //   3: invokestatic access$getStateLock$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   6: astore #4
/*      */     //   8: iconst_0
/*      */     //   9: istore #5
/*      */     //   11: aload #4
/*      */     //   13: astore #6
/*      */     //   15: aload #6
/*      */     //   17: monitorenter
/*      */     //   18: nop
/*      */     //   19: iconst_0
/*      */     //   20: istore #7
/*      */     //   22: aload_0
/*      */     //   23: invokestatic access$getSnapshotInvalidations$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/collection/MutableScatterSet;
/*      */     //   26: astore #8
/*      */     //   28: aload #8
/*      */     //   30: astore #9
/*      */     //   32: iconst_0
/*      */     //   33: istore #10
/*      */     //   35: aload #9
/*      */     //   37: invokevirtual isNotEmpty : ()Z
/*      */     //   40: ifeq -> 57
/*      */     //   43: aload_0
/*      */     //   44: new androidx/collection/MutableScatterSet
/*      */     //   47: dup
/*      */     //   48: iconst_0
/*      */     //   49: iconst_1
/*      */     //   50: aconst_null
/*      */     //   51: invokespecial <init> : (IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*      */     //   54: invokestatic access$setSnapshotInvalidations$p : (Landroidx/compose/runtime/Recomposer;Landroidx/collection/MutableScatterSet;)V
/*      */     //   57: nop
/*      */     //   58: aload #8
/*      */     //   60: nop
/*      */     //   61: astore #7
/*      */     //   63: iconst_1
/*      */     //   64: invokestatic finallyStart : (I)V
/*      */     //   67: aload #6
/*      */     //   69: monitorexit
/*      */     //   70: iconst_1
/*      */     //   71: invokestatic finallyEnd : (I)V
/*      */     //   74: aload #7
/*      */     //   76: goto -> 95
/*      */     //   79: astore #7
/*      */     //   81: iconst_1
/*      */     //   82: invokestatic finallyStart : (I)V
/*      */     //   85: aload #6
/*      */     //   87: monitorexit
/*      */     //   88: iconst_1
/*      */     //   89: invokestatic finallyEnd : (I)V
/*      */     //   92: aload #7
/*      */     //   94: athrow
/*      */     //   95: nop
/*      */     //   96: checkcast androidx/collection/ScatterSet
/*      */     //   99: invokestatic wrapIntoSet : (Landroidx/collection/ScatterSet;)Ljava/util/Set;
/*      */     //   102: astore_3
/*      */     //   103: aload_3
/*      */     //   104: checkcast java/util/Collection
/*      */     //   107: invokeinterface isEmpty : ()Z
/*      */     //   112: ifne -> 119
/*      */     //   115: iconst_1
/*      */     //   116: goto -> 120
/*      */     //   119: iconst_0
/*      */     //   120: ifeq -> 190
/*      */     //   123: aload_0
/*      */     //   124: invokestatic access$getKnownCompositions : (Landroidx/compose/runtime/Recomposer;)Ljava/util/List;
/*      */     //   127: astore #4
/*      */     //   129: iconst_0
/*      */     //   130: istore #5
/*      */     //   132: nop
/*      */     //   133: iconst_0
/*      */     //   134: istore #6
/*      */     //   136: aload #4
/*      */     //   138: invokeinterface size : ()I
/*      */     //   143: istore #7
/*      */     //   145: iload #6
/*      */     //   147: iload #7
/*      */     //   149: if_icmpge -> 189
/*      */     //   152: aload #4
/*      */     //   154: iload #6
/*      */     //   156: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   161: astore #8
/*      */     //   163: aload #8
/*      */     //   165: checkcast androidx/compose/runtime/ControlledComposition
/*      */     //   168: astore #9
/*      */     //   170: iconst_0
/*      */     //   171: istore #10
/*      */     //   173: aload #9
/*      */     //   175: aload_3
/*      */     //   176: invokeinterface recordModificationsOf : (Ljava/util/Set;)V
/*      */     //   181: nop
/*      */     //   182: nop
/*      */     //   183: iinc #6, 1
/*      */     //   186: goto -> 145
/*      */     //   189: nop
/*      */     //   190: aload_0
/*      */     //   191: invokestatic access$getCompositionInvalidations$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/collection/MutableVector;
/*      */     //   194: astore #4
/*      */     //   196: iconst_0
/*      */     //   197: istore #5
/*      */     //   199: nop
/*      */     //   200: aload #4
/*      */     //   202: invokevirtual getSize : ()I
/*      */     //   205: istore #6
/*      */     //   207: iload #6
/*      */     //   209: ifle -> 244
/*      */     //   212: iconst_0
/*      */     //   213: istore #7
/*      */     //   215: aload #4
/*      */     //   217: invokevirtual getContent : ()[Ljava/lang/Object;
/*      */     //   220: astore #8
/*      */     //   222: aload_1
/*      */     //   223: aload #8
/*      */     //   225: iload #7
/*      */     //   227: aaload
/*      */     //   228: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   233: pop
/*      */     //   234: iinc #7, 1
/*      */     //   237: iload #7
/*      */     //   239: iload #6
/*      */     //   241: if_icmplt -> 222
/*      */     //   244: nop
/*      */     //   245: aload_0
/*      */     //   246: invokestatic access$getCompositionInvalidations$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/collection/MutableVector;
/*      */     //   249: invokevirtual clear : ()V
/*      */     //   252: aload_0
/*      */     //   253: invokestatic access$getStateLock$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   256: astore #4
/*      */     //   258: iconst_0
/*      */     //   259: istore #5
/*      */     //   261: aload #4
/*      */     //   263: astore #6
/*      */     //   265: aload #6
/*      */     //   267: monitorenter
/*      */     //   268: nop
/*      */     //   269: iconst_0
/*      */     //   270: istore #7
/*      */     //   272: aload_0
/*      */     //   273: invokestatic access$deriveStateLocked : (Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/CancellableContinuation;
/*      */     //   276: ifnull -> 293
/*      */     //   279: new java/lang/IllegalStateException
/*      */     //   282: dup
/*      */     //   283: ldc_w 'called outside of runRecomposeAndApplyChanges'
/*      */     //   286: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   289: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   292: athrow
/*      */     //   293: nop
/*      */     //   294: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   297: astore #7
/*      */     //   299: iconst_1
/*      */     //   300: invokestatic finallyStart : (I)V
/*      */     //   303: aload #6
/*      */     //   305: monitorexit
/*      */     //   306: iconst_1
/*      */     //   307: invokestatic finallyEnd : (I)V
/*      */     //   310: goto -> 329
/*      */     //   313: astore #7
/*      */     //   315: iconst_1
/*      */     //   316: invokestatic finallyStart : (I)V
/*      */     //   319: aload #6
/*      */     //   321: monitorexit
/*      */     //   322: iconst_1
/*      */     //   323: invokestatic finallyEnd : (I)V
/*      */     //   326: aload #7
/*      */     //   328: athrow
/*      */     //   329: nop
/*      */     //   330: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #485	-> 2
/*      */     //   #1666	-> 11
/*      */     //   #486	-> 22
/*      */     //   #487	-> 35
/*      */     //   #488	-> 57
/*      */     //   #486	-> 58
/*      */     //   #486	-> 60
/*      */     //   #1666	-> 61
/*      */     //   #1666	-> 95
/*      */     //   #489	-> 99
/*      */     //   #485	-> 102
/*      */     //   #490	-> 103
/*      */     //   #490	-> 120
/*      */     //   #491	-> 123
/*      */     //   #1667	-> 132
/*      */     //   #1668	-> 133
/*      */     //   #1669	-> 152
/*      */     //   #1670	-> 163
/*      */     //   #492	-> 173
/*      */     //   #493	-> 181
/*      */     //   #1670	-> 182
/*      */     //   #1668	-> 183
/*      */     //   #1672	-> 189
/*      */     //   #495	-> 190
/*      */     //   #1673	-> 199
/*      */     //   #1674	-> 200
/*      */     //   #1675	-> 207
/*      */     //   #1676	-> 212
/*      */     //   #1677	-> 215
/*      */     //   #1679	-> 222
/*      */     //   #1680	-> 234
/*      */     //   #1681	-> 237
/*      */     //   #1683	-> 244
/*      */     //   #496	-> 245
/*      */     //   #497	-> 252
/*      */     //   #1684	-> 261
/*      */     //   #498	-> 272
/*      */     //   #499	-> 283
/*      */     //   #501	-> 293
/*      */     //   #1684	-> 297
/*      */     //   #1684	-> 329
/*      */     //   #502	-> 330
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   35	23	10	$i$a$-also-Recomposer$recordComposerModifications$changes$2$1	I
/*      */     //   32	26	9	it	Landroidx/collection/MutableScatterSet;
/*      */     //   22	39	7	$i$a$-synchronized-Recomposer$recordComposerModifications$changes$2	I
/*      */     //   11	85	5	$i$f$synchronized	I
/*      */     //   8	88	4	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   173	9	10	$i$a$-fastForEach-Recomposer$recordComposerModifications$5	I
/*      */     //   170	12	9	composition	Landroidx/compose/runtime/ControlledComposition;
/*      */     //   163	20	8	item$iv	Ljava/lang/Object;
/*      */     //   136	53	6	index$iv	I
/*      */     //   132	58	5	$i$f$fastForEach	I
/*      */     //   129	61	4	$this$fastForEach$iv	Ljava/util/List;
/*      */     //   215	29	7	i$iv	I
/*      */     //   222	22	8	content$iv	[Ljava/lang/Object;
/*      */     //   199	46	5	$i$f$forEach	I
/*      */     //   207	38	6	size$iv	I
/*      */     //   196	49	4	this_$iv	Landroidx/compose/runtime/collection/MutableVector;
/*      */     //   272	22	7	$i$a$-synchronized-Recomposer$recordComposerModifications$6	I
/*      */     //   261	69	5	$i$f$synchronized	I
/*      */     //   258	72	4	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   2	329	2	$i$f$recordComposerModifications	I
/*      */     //   103	228	3	changes	Ljava/util/Set;
/*      */     //   0	331	0	this	Landroidx/compose/runtime/Recomposer;
/*      */     //   0	331	1	onEachInvalidComposition	Lkotlin/jvm/functions/Function1;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   18	63	79	finally
/*      */     //   79	81	79	finally
/*      */     //   268	299	313	finally
/*      */     //   313	315	313	finally } private final void registerRunnerJob(Job callingJob) { SynchronizedObject lock$iv = this.stateLock; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-Recomposer$registerRunnerJob$1 = 0; if (this.closeCause != null) { Throwable it = this.closeCause; int $i$a$-let-Recomposer$registerRunnerJob$1$1 = 0; throw it; }  if (((State)this._state.getValue()).compareTo(State.ShuttingDown) <= 0) throw new IllegalStateException("Recomposer shut down".toString());  if (this.runnerJob != null) throw new IllegalStateException("Recomposer already running".toString());  this.runnerJob = callingJob; CancellableContinuation<Unit> cancellableContinuation = deriveStateLocked(); }  } @Nullable public final Object runRecomposeAndApplyChanges(@NotNull Continuation<? super Unit> $completion) { if (recompositionRunner(new Recomposer$runRecomposeAndApplyChanges$2(null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return recompositionRunner(new Recomposer$runRecomposeAndApplyChanges$2(null), $completion);  recompositionRunner(new Recomposer$runRecomposeAndApplyChanges$2(null), $completion); return Unit.INSTANCE; } @DebugMetadata(f = "Recomposer.kt", l = {574, 585}, i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"}, n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed"}, m = "invokeSuspend", c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2") @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}) @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1646:1\n26#2:1647\n26#2:1735\n33#3,6:1648\n33#3,6:1736\n267#4,4:1654\n237#4,7:1658\n248#4,3:1666\n251#4,2:1670\n272#4,2:1672\n254#4,6:1674\n274#4:1680\n267#4,4:1681\n237#4,7:1685\n248#4,3:1693\n251#4,2:1697\n272#4,2:1699\n254#4,6:1701\n274#4:1707\n267#4,4:1708\n237#4,7:1712\n248#4,3:1720\n251#4,2:1724\n272#4,2:1726\n254#4,6:1728\n274#4:1734\n1810#5:1665\n1672#5:1669\n1810#5:1692\n1672#5:1696\n1810#5:1719\n1672#5:1723\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n*L\n536#1:1647\n567#1:1735\n540#1:1648,6\n568#1:1736,6\n546#1:1654,4\n546#1:1658,7\n546#1:1666,3\n546#1:1670,2\n546#1:1672,2\n546#1:1674,6\n546#1:1680\n552#1:1681,4\n552#1:1685,7\n552#1:1693,3\n552#1:1697,2\n552#1:1699,2\n552#1:1701,6\n552#1:1707\n557#1:1708,4\n557#1:1712,7\n557#1:1720,3\n557#1:1724,2\n557#1:1726,2\n557#1:1728,6\n557#1:1734\n546#1:1665\n546#1:1669\n552#1:1692\n552#1:1696\n557#1:1719\n557#1:1723\n*E\n"}) static final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> { Object L$1; Object L$2; Object L$3; Object L$4; Object L$5; Object L$6; Object L$7; Object L$8; int label; Recomposer$runRecomposeAndApplyChanges$2(Continuation $completion) { super(3, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*      */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */       //   3: astore #11
/*      */       //   5: aload_0
/*      */       //   6: getfield label : I
/*      */       //   9: tableswitch default -> 506, 0 -> 36, 1 -> 207, 2 -> 407
/*      */       //   36: aload_1
/*      */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */       //   40: aload_0
/*      */       //   41: getfield L$0 : Ljava/lang/Object;
/*      */       //   44: checkcast androidx/compose/runtime/MonotonicFrameClock
/*      */       //   47: astore_2
/*      */       //   48: new java/util/ArrayList
/*      */       //   51: dup
/*      */       //   52: invokespecial <init> : ()V
/*      */       //   55: checkcast java/util/List
/*      */       //   58: astore_3
/*      */       //   59: new java/util/ArrayList
/*      */       //   62: dup
/*      */       //   63: invokespecial <init> : ()V
/*      */       //   66: checkcast java/util/List
/*      */       //   69: astore #4
/*      */       //   71: new java/util/ArrayList
/*      */       //   74: dup
/*      */       //   75: invokespecial <init> : ()V
/*      */       //   78: checkcast java/util/List
/*      */       //   81: astore #5
/*      */       //   83: invokestatic mutableScatterSetOf : ()Landroidx/collection/MutableScatterSet;
/*      */       //   86: astore #6
/*      */       //   88: invokestatic mutableScatterSetOf : ()Landroidx/collection/MutableScatterSet;
/*      */       //   91: astore #7
/*      */       //   93: new androidx/collection/MutableScatterSet
/*      */       //   96: dup
/*      */       //   97: iconst_0
/*      */       //   98: iconst_1
/*      */       //   99: aconst_null
/*      */       //   100: invokespecial <init> : (IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*      */       //   103: astore #8
/*      */       //   105: aload #8
/*      */       //   107: checkcast androidx/collection/ScatterSet
/*      */       //   110: invokestatic wrapIntoSet : (Landroidx/collection/ScatterSet;)Ljava/util/Set;
/*      */       //   113: astore #9
/*      */       //   115: invokestatic mutableScatterSetOf : ()Landroidx/collection/MutableScatterSet;
/*      */       //   118: astore #10
/*      */       //   120: aload_0
/*      */       //   121: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   124: invokestatic access$getShouldKeepRecomposing : (Landroidx/compose/runtime/Recomposer;)Z
/*      */       //   127: ifeq -> 502
/*      */       //   130: aload_0
/*      */       //   131: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   134: aload_0
/*      */       //   135: checkcast kotlin/coroutines/Continuation
/*      */       //   138: aload_0
/*      */       //   139: aload_2
/*      */       //   140: putfield L$0 : Ljava/lang/Object;
/*      */       //   143: aload_0
/*      */       //   144: aload_3
/*      */       //   145: putfield L$1 : Ljava/lang/Object;
/*      */       //   148: aload_0
/*      */       //   149: aload #4
/*      */       //   151: putfield L$2 : Ljava/lang/Object;
/*      */       //   154: aload_0
/*      */       //   155: aload #5
/*      */       //   157: putfield L$3 : Ljava/lang/Object;
/*      */       //   160: aload_0
/*      */       //   161: aload #6
/*      */       //   163: putfield L$4 : Ljava/lang/Object;
/*      */       //   166: aload_0
/*      */       //   167: aload #7
/*      */       //   169: putfield L$5 : Ljava/lang/Object;
/*      */       //   172: aload_0
/*      */       //   173: aload #8
/*      */       //   175: putfield L$6 : Ljava/lang/Object;
/*      */       //   178: aload_0
/*      */       //   179: aload #9
/*      */       //   181: putfield L$7 : Ljava/lang/Object;
/*      */       //   184: aload_0
/*      */       //   185: aload #10
/*      */       //   187: putfield L$8 : Ljava/lang/Object;
/*      */       //   190: aload_0
/*      */       //   191: iconst_1
/*      */       //   192: putfield label : I
/*      */       //   195: invokestatic access$awaitWorkAvailable : (Landroidx/compose/runtime/Recomposer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */       //   198: dup
/*      */       //   199: aload #11
/*      */       //   201: if_acmpne -> 291
/*      */       //   204: aload #11
/*      */       //   206: areturn
/*      */       //   207: aload_0
/*      */       //   208: getfield L$8 : Ljava/lang/Object;
/*      */       //   211: checkcast androidx/collection/MutableScatterSet
/*      */       //   214: astore #10
/*      */       //   216: aload_0
/*      */       //   217: getfield L$7 : Ljava/lang/Object;
/*      */       //   220: checkcast java/util/Set
/*      */       //   223: astore #9
/*      */       //   225: aload_0
/*      */       //   226: getfield L$6 : Ljava/lang/Object;
/*      */       //   229: checkcast androidx/collection/MutableScatterSet
/*      */       //   232: astore #8
/*      */       //   234: aload_0
/*      */       //   235: getfield L$5 : Ljava/lang/Object;
/*      */       //   238: checkcast androidx/collection/MutableScatterSet
/*      */       //   241: astore #7
/*      */       //   243: aload_0
/*      */       //   244: getfield L$4 : Ljava/lang/Object;
/*      */       //   247: checkcast androidx/collection/MutableScatterSet
/*      */       //   250: astore #6
/*      */       //   252: aload_0
/*      */       //   253: getfield L$3 : Ljava/lang/Object;
/*      */       //   256: checkcast java/util/List
/*      */       //   259: astore #5
/*      */       //   261: aload_0
/*      */       //   262: getfield L$2 : Ljava/lang/Object;
/*      */       //   265: checkcast java/util/List
/*      */       //   268: astore #4
/*      */       //   270: aload_0
/*      */       //   271: getfield L$1 : Ljava/lang/Object;
/*      */       //   274: checkcast java/util/List
/*      */       //   277: astore_3
/*      */       //   278: aload_0
/*      */       //   279: getfield L$0 : Ljava/lang/Object;
/*      */       //   282: checkcast androidx/compose/runtime/MonotonicFrameClock
/*      */       //   285: astore_2
/*      */       //   286: aload_1
/*      */       //   287: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */       //   290: aload_1
/*      */       //   291: pop
/*      */       //   292: aload_0
/*      */       //   293: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   296: invokestatic access$recordComposerModifications : (Landroidx/compose/runtime/Recomposer;)Z
/*      */       //   299: ifeq -> 120
/*      */       //   302: aload_2
/*      */       //   303: new androidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1
/*      */       //   306: dup
/*      */       //   307: aload_0
/*      */       //   308: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   311: aload #8
/*      */       //   313: aload #10
/*      */       //   315: aload_3
/*      */       //   316: aload #4
/*      */       //   318: aload #6
/*      */       //   320: aload #5
/*      */       //   322: aload #7
/*      */       //   324: aload #9
/*      */       //   326: invokespecial <init> : (Landroidx/compose/runtime/Recomposer;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Ljava/util/List;Ljava/util/List;Landroidx/collection/MutableScatterSet;Ljava/util/List;Landroidx/collection/MutableScatterSet;Ljava/util/Set;)V
/*      */       //   329: checkcast kotlin/jvm/functions/Function1
/*      */       //   332: aload_0
/*      */       //   333: checkcast kotlin/coroutines/Continuation
/*      */       //   336: aload_0
/*      */       //   337: aload_2
/*      */       //   338: putfield L$0 : Ljava/lang/Object;
/*      */       //   341: aload_0
/*      */       //   342: aload_3
/*      */       //   343: putfield L$1 : Ljava/lang/Object;
/*      */       //   346: aload_0
/*      */       //   347: aload #4
/*      */       //   349: putfield L$2 : Ljava/lang/Object;
/*      */       //   352: aload_0
/*      */       //   353: aload #5
/*      */       //   355: putfield L$3 : Ljava/lang/Object;
/*      */       //   358: aload_0
/*      */       //   359: aload #6
/*      */       //   361: putfield L$4 : Ljava/lang/Object;
/*      */       //   364: aload_0
/*      */       //   365: aload #7
/*      */       //   367: putfield L$5 : Ljava/lang/Object;
/*      */       //   370: aload_0
/*      */       //   371: aload #8
/*      */       //   373: putfield L$6 : Ljava/lang/Object;
/*      */       //   376: aload_0
/*      */       //   377: aload #9
/*      */       //   379: putfield L$7 : Ljava/lang/Object;
/*      */       //   382: aload_0
/*      */       //   383: aload #10
/*      */       //   385: putfield L$8 : Ljava/lang/Object;
/*      */       //   388: aload_0
/*      */       //   389: iconst_2
/*      */       //   390: putfield label : I
/*      */       //   393: invokeinterface withFrameNanos : (Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */       //   398: dup
/*      */       //   399: aload #11
/*      */       //   401: if_acmpne -> 491
/*      */       //   404: aload #11
/*      */       //   406: areturn
/*      */       //   407: aload_0
/*      */       //   408: getfield L$8 : Ljava/lang/Object;
/*      */       //   411: checkcast androidx/collection/MutableScatterSet
/*      */       //   414: astore #10
/*      */       //   416: aload_0
/*      */       //   417: getfield L$7 : Ljava/lang/Object;
/*      */       //   420: checkcast java/util/Set
/*      */       //   423: astore #9
/*      */       //   425: aload_0
/*      */       //   426: getfield L$6 : Ljava/lang/Object;
/*      */       //   429: checkcast androidx/collection/MutableScatterSet
/*      */       //   432: astore #8
/*      */       //   434: aload_0
/*      */       //   435: getfield L$5 : Ljava/lang/Object;
/*      */       //   438: checkcast androidx/collection/MutableScatterSet
/*      */       //   441: astore #7
/*      */       //   443: aload_0
/*      */       //   444: getfield L$4 : Ljava/lang/Object;
/*      */       //   447: checkcast androidx/collection/MutableScatterSet
/*      */       //   450: astore #6
/*      */       //   452: aload_0
/*      */       //   453: getfield L$3 : Ljava/lang/Object;
/*      */       //   456: checkcast java/util/List
/*      */       //   459: astore #5
/*      */       //   461: aload_0
/*      */       //   462: getfield L$2 : Ljava/lang/Object;
/*      */       //   465: checkcast java/util/List
/*      */       //   468: astore #4
/*      */       //   470: aload_0
/*      */       //   471: getfield L$1 : Ljava/lang/Object;
/*      */       //   474: checkcast java/util/List
/*      */       //   477: astore_3
/*      */       //   478: aload_0
/*      */       //   479: getfield L$0 : Ljava/lang/Object;
/*      */       //   482: checkcast androidx/compose/runtime/MonotonicFrameClock
/*      */       //   485: astore_2
/*      */       //   486: aload_1
/*      */       //   487: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */       //   490: aload_1
/*      */       //   491: pop
/*      */       //   492: aload_0
/*      */       //   493: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   496: invokestatic access$discardUnusedValues : (Landroidx/compose/runtime/Recomposer;)V
/*      */       //   499: goto -> 120
/*      */       //   502: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */       //   505: areturn
/*      */       //   506: new java/lang/IllegalStateException
/*      */       //   509: dup
/*      */       //   510: ldc 'call to 'resume' before 'invoke' with coroutine'
/*      */       //   512: invokespecial <init> : (Ljava/lang/String;)V
/*      */       //   515: athrow
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #525	-> 3
/*      */       //   #526	-> 48
/*      */       //   #526	-> 58
/*      */       //   #527	-> 59
/*      */       //   #527	-> 69
/*      */       //   #528	-> 71
/*      */       //   #528	-> 81
/*      */       //   #529	-> 83
/*      */       //   #530	-> 88
/*      */       //   #531	-> 93
/*      */       //   #532	-> 105
/*      */       //   #533	-> 115
/*      */       //   #573	-> 120
/*      */       //   #574	-> 130
/*      */       //   #525	-> 204
/*      */       //   #577	-> 291
/*      */       //   #585	-> 302
/*      */       //   #525	-> 404
/*      */       //   #741	-> 491
/*      */       //   #743	-> 502
/*      */       //   #525	-> 506
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   48	10	2	parentFrameClock	Landroidx/compose/runtime/MonotonicFrameClock;
/*      */       //   58	11	2	parentFrameClock	Landroidx/compose/runtime/MonotonicFrameClock;
/*      */       //   69	12	2	parentFrameClock	Landroidx/compose/runtime/MonotonicFrameClock;
/*      */       //   81	126	2	parentFrameClock	Landroidx/compose/runtime/MonotonicFrameClock;
/*      */       //   286	121	2	parentFrameClock	Landroidx/compose/runtime/MonotonicFrameClock;
/*      */       //   486	20	2	parentFrameClock	Landroidx/compose/runtime/MonotonicFrameClock;
/*      */       //   59	10	3	toRecompose	Ljava/util/List;
/*      */       //   69	12	3	toRecompose	Ljava/util/List;
/*      */       //   81	126	3	toRecompose	Ljava/util/List;
/*      */       //   278	129	3	toRecompose	Ljava/util/List;
/*      */       //   478	28	3	toRecompose	Ljava/util/List;
/*      */       //   71	10	4	toInsert	Ljava/util/List;
/*      */       //   81	126	4	toInsert	Ljava/util/List;
/*      */       //   270	137	4	toInsert	Ljava/util/List;
/*      */       //   470	36	4	toInsert	Ljava/util/List;
/*      */       //   83	124	5	toApply	Ljava/util/List;
/*      */       //   261	146	5	toApply	Ljava/util/List;
/*      */       //   461	45	5	toApply	Ljava/util/List;
/*      */       //   88	119	6	toLateApply	Landroidx/collection/MutableScatterSet;
/*      */       //   252	155	6	toLateApply	Landroidx/collection/MutableScatterSet;
/*      */       //   452	54	6	toLateApply	Landroidx/collection/MutableScatterSet;
/*      */       //   93	114	7	toComplete	Landroidx/collection/MutableScatterSet;
/*      */       //   243	164	7	toComplete	Landroidx/collection/MutableScatterSet;
/*      */       //   443	63	7	toComplete	Landroidx/collection/MutableScatterSet;
/*      */       //   105	102	8	modifiedValues	Landroidx/collection/MutableScatterSet;
/*      */       //   234	173	8	modifiedValues	Landroidx/collection/MutableScatterSet;
/*      */       //   434	72	8	modifiedValues	Landroidx/collection/MutableScatterSet;
/*      */       //   115	92	9	modifiedValuesSet	Ljava/util/Set;
/*      */       //   225	182	9	modifiedValuesSet	Ljava/util/Set;
/*      */       //   425	81	9	modifiedValuesSet	Ljava/util/Set;
/*      */       //   120	87	10	alreadyComposed	Landroidx/collection/MutableScatterSet;
/*      */       //   216	191	10	alreadyComposed	Landroidx/collection/MutableScatterSet;
/*      */       //   416	90	10	alreadyComposed	Landroidx/collection/MutableScatterSet;
/*      */       //   40	466	0	this	Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;
/* 1691 */       //   40	466	1	$result	Ljava/lang/Object; } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @NotNull MonotonicFrameClock p2, @Nullable Continuation<? super Recomposer$runRecomposeAndApplyChanges$2> p3) { Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(p3); recomposer$runRecomposeAndApplyChanges$2.L$0 = p2; return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(Unit.INSTANCE); } private static final void invokeSuspend$clearRecompositionState(Recomposer this$0, List toRecompose, List toInsert, List toApply, MutableScatterSet toLateApply, MutableScatterSet toComplete, MutableScatterSet modifiedValues, MutableScatterSet alreadyComposed) { SynchronizedObject lock$iv = Recomposer.this.stateLock; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-Recomposer$runRecomposeAndApplyChanges$2$clearRecompositionState$1 = 0; toRecompose.clear(); toInsert.clear(); List $this$fastForEach$iv = toApply; int $i$f$fastForEach = 0; int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) { Object item$iv = $this$fastForEach$iv.get(index$iv); ControlledComposition it = (ControlledComposition)item$iv; int $i$a$-fastForEach-Recomposer$runRecomposeAndApplyChanges$2$clearRecompositionState$1$1 = 0; it.abandonChanges(); Recomposer.this.recordFailedCompositionLocked(it); }  toApply.clear(); ScatterSet this_$iv = (ScatterSet)toLateApply; int $i$f$forEach = 0; Object[] k$iv = this_$iv.elements; ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0; long[] m$iv$iv = this_$iv$iv.metadata; int lastIndex$iv$iv = m$iv$iv.length - 2; int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) { long slot$iv$iv = m$iv$iv[i$iv$iv]; long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0; if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31); for (int j$iv$iv = 0;; j$iv$iv++); if (bitCount$iv$iv == 8) continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 326 }  } else {  }  toLateApply.clear(); this_$iv = (ScatterSet)toComplete; $i$f$forEach = 0; k$iv = this_$iv.elements; this_$iv$iv = this_$iv; $i$f$forEachIndex = 0; m$iv$iv = this_$iv$iv.metadata; lastIndex$iv$iv = m$iv$iv.length - 2; i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) { long slot$iv$iv = m$iv$iv[i$iv$iv]; long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1692 */             if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1693 */               int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1694 */               for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 1703 */               if (bitCount$iv$iv == 8)
/*      */                 continue;  break;
/*      */             }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */              // Byte code: goto -> 545 }
/*      */            }
/*      */         else {  }
/* 1709 */          toComplete.clear(); modifiedValues.clear(); this_$iv = (ScatterSet)alreadyComposed; $i$f$forEach = 0; k$iv = this_$iv.elements;
/*      */         
/* 1711 */         this_$iv$iv = this_$iv; $i$f$forEachIndex = 0;
/*      */         
/* 1713 */         m$iv$iv = this_$iv$iv.metadata;
/* 1714 */         lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */         
/* 1716 */         i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1717 */             long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1718 */             long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1719 */             if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1720 */             { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1721 */               for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 1730 */               if (bitCount$iv$iv == 8)
/*      */                 continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 776
/*      */           }  }
/*      */         else {  }
/*      */          alreadyComposed.clear(); Unit unit = Unit.INSTANCE; }
/* 1735 */        } private static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> toInsert, Recomposer this$0) { toInsert.clear(); SynchronizedObject lock$iv = Recomposer.this.stateLock; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-Recomposer$runRecomposeAndApplyChanges$2$fillToInsert$1 = 0; List $this$fastForEach$iv = Recomposer.this.compositionValuesAwaitingInsert;
/*      */         int $i$f$fastForEach = 0;
/* 1737 */         int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 1738 */           Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 1739 */           MovableContentStateReference it = (MovableContentStateReference)item$iv; int $i$a$-fastForEach-Recomposer$runRecomposeAndApplyChanges$2$fillToInsert$1$1 = 0; toInsert.add(it);
/*      */         }  Recomposer.this.compositionValuesAwaitingInsert.clear(); Unit unit = Unit.INSTANCE; }
/*      */        } }
/*      */    private final void processCompositionError(Exception e, ControlledComposition failedInitialComposition, boolean recoverable) { if (((Boolean)_hotReloadEnabled.get()).booleanValue() && !(e instanceof ComposeRuntimeError)) {
/*      */       SynchronizedObject lock$iv = this.stateLock; int $i$f$synchronized = 0; synchronized (lock$iv) {
/*      */         int $i$a$-synchronized-Recomposer$processCompositionError$1 = 0; ActualDesktop_desktopKt.logError("Error was captured in composition while live edit was enabled.", e); this.compositionsAwaitingApply.clear(); this.compositionInvalidations.clear(); this.snapshotInvalidations = new MutableScatterSet(0, 1, null); this.compositionValuesAwaitingInsert.clear(); this.compositionValuesRemoved.clear();
/*      */         this.compositionValueStatesAvailable.clear();
/*      */         this.errorState = new RecomposerErrorState(recoverable, e);
/*      */         if (failedInitialComposition != null)
/*      */           recordFailedCompositionLocked(failedInitialComposition); 
/*      */         CancellableContinuation<Unit> cancellableContinuation = deriveStateLocked();
/*      */       } 
/*      */     } else {
/*      */       SynchronizedObject lock$iv = this.stateLock;
/*      */       int $i$f$synchronized = 0;
/*      */       synchronized (lock$iv) {
/*      */         int $i$a$-synchronized-Recomposer$processCompositionError$2 = 0;
/*      */         RecomposerErrorState errorState = this.errorState;
/*      */         if (errorState == null) {
/*      */           this.errorState = new RecomposerErrorState(false, e);
/*      */         } else {
/*      */           throw errorState.getCause();
/*      */         } 
/*      */         Unit unit = Unit.INSTANCE;
/*      */       } 
/*      */       throw e;
/*      */     }  } private final void clearKnownCompositionsLocked() { this._knownCompositions.clear();
/*      */     this._knownCompositionsCache = CollectionsKt.emptyList(); }
/*      */   private final void removeKnownCompositionLocked(ControlledComposition composition) { this._knownCompositions.remove(composition);
/*      */     this._knownCompositionsCache = null; }
/*      */   private final void addKnownCompositionLocked(ControlledComposition composition) { this._knownCompositions.add(composition);
/*      */     this._knownCompositionsCache = null; }
/*      */   private final RecomposerErrorState resetErrorState() { SynchronizedObject lock$iv = this.stateLock;
/*      */     int $i$f$synchronized = 0;
/*      */     synchronized (lock$iv) {
/*      */       int $i$a$-synchronized-Recomposer$resetErrorState$errorState$1 = 0;
/*      */       RecomposerErrorState error = this.errorState;
/*      */       if (error != null) {
/*      */         this.errorState = null;
/*      */         deriveStateLocked();
/*      */       } 
/*      */       RecomposerErrorState recomposerErrorState1 = error;
/*      */     } 
/*      */     RecomposerErrorState errorState = recomposerErrorState1;
/*      */     return errorState; }
/*      */   private final void retryFailedCompositions() { List<ControlledComposition> compositionsToRetry;
/*      */     SynchronizedObject lock$iv = this.stateLock;
/*      */     int $i$f$synchronized = 0;
/*      */     synchronized (lock$iv) {
/*      */       int $i$a$-synchronized-Recomposer$retryFailedCompositions$compositionsToRetry$1 = 0;
/*      */       List<ControlledComposition> list2 = this.failedCompositions, it = list2;
/*      */       int $i$a$-also-Recomposer$retryFailedCompositions$compositionsToRetry$1$1 = 0;
/*      */       this.failedCompositions = null;
/*      */       List<ControlledComposition> list1 = list2;
/*      */     } 
/*      */     if (list1 == null)
/*      */       return; 
/*      */     try {
/*      */       while (!compositionsToRetry.isEmpty()) {
/*      */         ControlledComposition composition = (ControlledComposition)CollectionsKt.removeLast(compositionsToRetry);
/*      */         if (composition instanceof CompositionImpl) {
/*      */           composition.invalidateAll();
/*      */           composition.setContent(((CompositionImpl)composition).getComposable());
/*      */           if (this.errorState != null)
/*      */             break; 
/*      */         } 
/*      */       } 
/*      */     } finally {
/*      */       if (!compositionsToRetry.isEmpty()) {
/*      */         lock$iv = this.stateLock;
/*      */         $i$f$synchronized = 0;
/*      */         synchronized (lock$iv) {
/*      */           int $i$a$-synchronized-Recomposer$retryFailedCompositions$1 = 0;
/*      */           List<ControlledComposition> $this$fastForEach$iv = compositionsToRetry;
/*      */           int $i$f$fastForEach = 0;
/*      */           int index$iv = 0, i = $this$fastForEach$iv.size();
/*      */           if (index$iv < i) {
/*      */             Object item$iv = $this$fastForEach$iv.get(index$iv);
/*      */             ControlledComposition it = (ControlledComposition)item$iv;
/*      */             int $i$a$-fastForEach-Recomposer$retryFailedCompositions$1$1 = 0;
/*      */             recordFailedCompositionLocked(it);
/*      */           } 
/*      */           Unit unit = Unit.INSTANCE;
/*      */         } 
/*      */       } 
/*      */     }  }
/*      */   private final void recordFailedCompositionLocked(ControlledComposition composition) { if (this.failedCompositions == null) {
/*      */       ArrayList<ControlledComposition> arrayList = new ArrayList();
/*      */       List<ControlledComposition> it = arrayList;
/*      */       int $i$a$-also-Recomposer$recordFailedCompositionLocked$failedCompositions$1 = 0;
/*      */       this.failedCompositions = it;
/*      */     } 
/*      */     List<ControlledComposition> failedCompositions = arrayList;
/*      */     if (!failedCompositions.contains(composition))
/*      */       failedCompositions.add(composition); 
/*      */     removeKnownCompositionLocked(composition); }
/*      */   @ExperimentalComposeApi @Nullable public final Object runRecomposeConcurrentlyAndApplyChanges(@NotNull CoroutineContext recomposeCoroutineContext, @NotNull Continuation<? super Unit> $completion) { if (recompositionRunner(new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*      */       return recompositionRunner(new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this, null), $completion); 
/*      */     recompositionRunner(new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this, null), $completion);
/*      */     return Unit.INSTANCE; }
/*      */   @DebugMetadata(f = "Recomposer.kt", l = {890, 910, 911}, i = {0, 0, 0, 1}, s = {"L$0", "L$1", "L$2", "L$0"}, n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, m = "invokeSuspend", c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2") @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}) @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 4 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1646:1\n33#2,7:1647\n485#3:1654\n486#3,6:1656\n492#3,2:1666\n495#3:1669\n496#3,7:1682\n26#4:1655\n26#4:1677\n26#4:1689\n33#5,4:1662\n38#5:1668\n460#6,7:1670\n467#6,4:1678\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n*L\n880#1:1647,7\n893#1:1654\n893#1:1656,6\n893#1:1666,2\n893#1:1669\n893#1:1682,7\n893#1:1655\n894#1:1677\n906#1:1689\n893#1:1662,4\n893#1:1668\n893#1:1670,7\n893#1:1678,4\n*E\n"}) static final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> { Object L$2; int label;
/*      */     Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(Recomposer $receiver, Continuation $completion) { super(3, $completion); }
/*      */     @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*      */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */       //   3: astore #25
/*      */       //   5: aload_0
/*      */       //   6: getfield label : I
/*      */       //   9: tableswitch default -> 905, 0 -> 40, 1 -> 268, 2 -> 852, 3 -> 895
/*      */       //   40: aload_1
/*      */       //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */       //   44: aload_0
/*      */       //   45: getfield L$0 : Ljava/lang/Object;
/*      */       //   48: checkcast kotlinx/coroutines/CoroutineScope
/*      */       //   51: astore_2
/*      */       //   52: aload_0
/*      */       //   53: getfield L$1 : Ljava/lang/Object;
/*      */       //   56: checkcast androidx/compose/runtime/MonotonicFrameClock
/*      */       //   59: astore_3
/*      */       //   60: aload_0
/*      */       //   61: getfield $recomposeCoroutineContext : Lkotlin/coroutines/CoroutineContext;
/*      */       //   64: getstatic kotlinx/coroutines/Job.Key : Lkotlinx/coroutines/Job$Key;
/*      */       //   67: checkcast kotlin/coroutines/CoroutineContext$Key
/*      */       //   70: invokeinterface get : (Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;
/*      */       //   75: ifnonnull -> 82
/*      */       //   78: iconst_1
/*      */       //   79: goto -> 83
/*      */       //   82: iconst_0
/*      */       //   83: istore #4
/*      */       //   85: aload_0
/*      */       //   86: getfield $recomposeCoroutineContext : Lkotlin/coroutines/CoroutineContext;
/*      */       //   89: astore #5
/*      */       //   91: iconst_0
/*      */       //   92: istore #6
/*      */       //   94: nop
/*      */       //   95: iload #4
/*      */       //   97: ifne -> 137
/*      */       //   100: iconst_0
/*      */       //   101: istore #7
/*      */       //   103: new java/lang/StringBuilder
/*      */       //   106: dup
/*      */       //   107: invokespecial <init> : ()V
/*      */       //   110: ldc 'recomposeCoroutineContext may not contain a Job; found '
/*      */       //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */       //   115: aload #5
/*      */       //   117: getstatic kotlinx/coroutines/Job.Key : Lkotlinx/coroutines/Job$Key;
/*      */       //   120: checkcast kotlin/coroutines/CoroutineContext$Key
/*      */       //   123: invokeinterface get : (Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;
/*      */       //   128: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*      */       //   131: invokevirtual toString : ()Ljava/lang/String;
/*      */       //   134: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*      */       //   137: nop
/*      */       //   138: aload_2
/*      */       //   139: invokeinterface getCoroutineContext : ()Lkotlin/coroutines/CoroutineContext;
/*      */       //   144: aload_0
/*      */       //   145: getfield $recomposeCoroutineContext : Lkotlin/coroutines/CoroutineContext;
/*      */       //   148: invokeinterface plus : (Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;
/*      */       //   153: aload_2
/*      */       //   154: invokeinterface getCoroutineContext : ()Lkotlin/coroutines/CoroutineContext;
/*      */       //   159: invokestatic getJob : (Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Job;
/*      */       //   162: invokestatic Job : (Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/CompletableJob;
/*      */       //   165: checkcast kotlin/coroutines/CoroutineContext
/*      */       //   168: invokeinterface plus : (Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;
/*      */       //   173: invokestatic CoroutineScope : (Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;
/*      */       //   176: astore #4
/*      */       //   178: new androidx/compose/runtime/ProduceFrameSignal
/*      */       //   181: dup
/*      */       //   182: invokespecial <init> : ()V
/*      */       //   185: astore #5
/*      */       //   187: aload_2
/*      */       //   188: aconst_null
/*      */       //   189: aconst_null
/*      */       //   190: new androidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1
/*      */       //   193: dup
/*      */       //   194: aload_0
/*      */       //   195: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   198: aload_3
/*      */       //   199: aload #5
/*      */       //   201: aconst_null
/*      */       //   202: invokespecial <init> : (Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)V
/*      */       //   205: checkcast kotlin/jvm/functions/Function2
/*      */       //   208: iconst_3
/*      */       //   209: aconst_null
/*      */       //   210: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*      */       //   213: astore #6
/*      */       //   215: aload_0
/*      */       //   216: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   219: invokestatic access$getShouldKeepRecomposing : (Landroidx/compose/runtime/Recomposer;)Z
/*      */       //   222: ifeq -> 805
/*      */       //   225: aload_0
/*      */       //   226: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   229: aload_0
/*      */       //   230: checkcast kotlin/coroutines/Continuation
/*      */       //   233: aload_0
/*      */       //   234: aload #4
/*      */       //   236: putfield L$0 : Ljava/lang/Object;
/*      */       //   239: aload_0
/*      */       //   240: aload #5
/*      */       //   242: putfield L$1 : Ljava/lang/Object;
/*      */       //   245: aload_0
/*      */       //   246: aload #6
/*      */       //   248: putfield L$2 : Ljava/lang/Object;
/*      */       //   251: aload_0
/*      */       //   252: iconst_1
/*      */       //   253: putfield label : I
/*      */       //   256: invokestatic access$awaitWorkAvailable : (Landroidx/compose/runtime/Recomposer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */       //   259: dup
/*      */       //   260: aload #25
/*      */       //   262: if_acmpne -> 300
/*      */       //   265: aload #25
/*      */       //   267: areturn
/*      */       //   268: aload_0
/*      */       //   269: getfield L$2 : Ljava/lang/Object;
/*      */       //   272: checkcast kotlinx/coroutines/Job
/*      */       //   275: astore #6
/*      */       //   277: aload_0
/*      */       //   278: getfield L$1 : Ljava/lang/Object;
/*      */       //   281: checkcast androidx/compose/runtime/ProduceFrameSignal
/*      */       //   284: astore #5
/*      */       //   286: aload_0
/*      */       //   287: getfield L$0 : Ljava/lang/Object;
/*      */       //   290: checkcast kotlinx/coroutines/CoroutineScope
/*      */       //   293: astore #4
/*      */       //   295: aload_1
/*      */       //   296: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */       //   299: aload_1
/*      */       //   300: pop
/*      */       //   301: aload_0
/*      */       //   302: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   305: astore #7
/*      */       //   307: aload_0
/*      */       //   308: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   311: astore #8
/*      */       //   313: iconst_0
/*      */       //   314: istore #9
/*      */       //   316: aload #7
/*      */       //   318: invokestatic access$getStateLock$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/SynchronizedObject;
/*      */       //   321: astore #10
/*      */       //   323: iconst_0
/*      */       //   324: istore #11
/*      */       //   326: aload #10
/*      */       //   328: astore #12
/*      */       //   330: aload #12
/*      */       //   332: monitorenter
/*      */       //   333: nop
/*      */       //   334: iconst_0
/*      */       //   335: istore #13
/*      */       //   337: aload #7
/*      */       //   339: invokestatic access$getSnapshotInvalidations$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/collection/MutableScatterSet;
/*      */       //   342: astore #14
/*      */       //   344: aload #14
/*      */       //   346: astore #15
/*      */       //   348: iconst_0
/*      */       //   349: istore #16
/*      */       //   351: aload #15
/*      */       //   353: invokevirtual isNotEmpty : ()Z
/*      */       //   356: ifeq -> 374
/*      */       //   359: aload #7
/*      */       //   361: new androidx/collection/MutableScatterSet
/*      */       //   364: dup
/*      */       //   365: iconst_0
/*      */       //   366: iconst_1
/*      */       //   367: aconst_null
/*      */       //   368: invokespecial <init> : (IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*      */       //   371: invokestatic access$setSnapshotInvalidations$p : (Landroidx/compose/runtime/Recomposer;Landroidx/collection/MutableScatterSet;)V
/*      */       //   374: nop
/*      */       //   375: aload #14
/*      */       //   377: nop
/*      */       //   378: astore #13
/*      */       //   380: aload #12
/*      */       //   382: monitorexit
/*      */       //   383: aload #13
/*      */       //   385: goto -> 396
/*      */       //   388: astore #13
/*      */       //   390: aload #12
/*      */       //   392: monitorexit
/*      */       //   393: aload #13
/*      */       //   395: athrow
/*      */       //   396: nop
/*      */       //   397: checkcast androidx/collection/ScatterSet
/*      */       //   400: invokestatic wrapIntoSet : (Landroidx/collection/ScatterSet;)Ljava/util/Set;
/*      */       //   403: astore #17
/*      */       //   405: aload #17
/*      */       //   407: checkcast java/util/Collection
/*      */       //   410: invokeinterface isEmpty : ()Z
/*      */       //   415: ifne -> 422
/*      */       //   418: iconst_1
/*      */       //   419: goto -> 423
/*      */       //   422: iconst_0
/*      */       //   423: ifeq -> 494
/*      */       //   426: aload #7
/*      */       //   428: invokestatic access$getKnownCompositions : (Landroidx/compose/runtime/Recomposer;)Ljava/util/List;
/*      */       //   431: astore #10
/*      */       //   433: iconst_0
/*      */       //   434: istore #11
/*      */       //   436: nop
/*      */       //   437: iconst_0
/*      */       //   438: istore #12
/*      */       //   440: aload #10
/*      */       //   442: invokeinterface size : ()I
/*      */       //   447: istore #13
/*      */       //   449: iload #12
/*      */       //   451: iload #13
/*      */       //   453: if_icmpge -> 493
/*      */       //   456: aload #10
/*      */       //   458: iload #12
/*      */       //   460: invokeinterface get : (I)Ljava/lang/Object;
/*      */       //   465: astore #14
/*      */       //   467: aload #14
/*      */       //   469: checkcast androidx/compose/runtime/ControlledComposition
/*      */       //   472: astore #15
/*      */       //   474: iconst_0
/*      */       //   475: istore #16
/*      */       //   477: aload #15
/*      */       //   479: aload #17
/*      */       //   481: invokeinterface recordModificationsOf : (Ljava/util/Set;)V
/*      */       //   486: nop
/*      */       //   487: iinc #12, 1
/*      */       //   490: goto -> 449
/*      */       //   493: nop
/*      */       //   494: aload #7
/*      */       //   496: invokestatic access$getCompositionInvalidations$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/collection/MutableVector;
/*      */       //   499: astore #10
/*      */       //   501: iconst_0
/*      */       //   502: istore #11
/*      */       //   504: nop
/*      */       //   505: aload #10
/*      */       //   507: invokevirtual getSize : ()I
/*      */       //   510: istore #12
/*      */       //   512: iload #12
/*      */       //   514: ifle -> 636
/*      */       //   517: iconst_0
/*      */       //   518: istore #13
/*      */       //   520: aload #10
/*      */       //   522: invokevirtual getContent : ()[Ljava/lang/Object;
/*      */       //   525: astore #14
/*      */       //   527: aload #14
/*      */       //   529: iload #13
/*      */       //   531: aaload
/*      */       //   532: checkcast androidx/compose/runtime/ControlledComposition
/*      */       //   535: astore #18
/*      */       //   537: iconst_0
/*      */       //   538: istore #19
/*      */       //   540: aload #8
/*      */       //   542: invokestatic access$getStateLock$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/SynchronizedObject;
/*      */       //   545: astore #20
/*      */       //   547: iconst_0
/*      */       //   548: istore #21
/*      */       //   550: aload #20
/*      */       //   552: astore #22
/*      */       //   554: aload #22
/*      */       //   556: monitorenter
/*      */       //   557: nop
/*      */       //   558: iconst_0
/*      */       //   559: istore #23
/*      */       //   561: aload #8
/*      */       //   563: invokestatic access$getConcurrentCompositionsOutstanding$p : (Landroidx/compose/runtime/Recomposer;)I
/*      */       //   566: istore #24
/*      */       //   568: aload #8
/*      */       //   570: iload #24
/*      */       //   572: iconst_1
/*      */       //   573: iadd
/*      */       //   574: invokestatic access$setConcurrentCompositionsOutstanding$p : (Landroidx/compose/runtime/Recomposer;I)V
/*      */       //   577: iload #24
/*      */       //   579: istore #23
/*      */       //   581: aload #22
/*      */       //   583: monitorexit
/*      */       //   584: goto -> 595
/*      */       //   587: astore #23
/*      */       //   589: aload #22
/*      */       //   591: monitorexit
/*      */       //   592: aload #23
/*      */       //   594: athrow
/*      */       //   595: nop
/*      */       //   596: aload #4
/*      */       //   598: aload #18
/*      */       //   600: invokestatic getRecomposeCoroutineContext : (Landroidx/compose/runtime/ControlledComposition;)Lkotlin/coroutines/CoroutineContext;
/*      */       //   603: aconst_null
/*      */       //   604: new androidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2
/*      */       //   607: dup
/*      */       //   608: aload #8
/*      */       //   610: aload #18
/*      */       //   612: aconst_null
/*      */       //   613: invokespecial <init> : (Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/ControlledComposition;Lkotlin/coroutines/Continuation;)V
/*      */       //   616: checkcast kotlin/jvm/functions/Function2
/*      */       //   619: iconst_2
/*      */       //   620: aconst_null
/*      */       //   621: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*      */       //   624: pop
/*      */       //   625: nop
/*      */       //   626: iinc #13, 1
/*      */       //   629: iload #13
/*      */       //   631: iload #12
/*      */       //   633: if_icmplt -> 527
/*      */       //   636: nop
/*      */       //   637: aload #7
/*      */       //   639: invokestatic access$getCompositionInvalidations$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/collection/MutableVector;
/*      */       //   642: invokevirtual clear : ()V
/*      */       //   645: aload #7
/*      */       //   647: invokestatic access$getStateLock$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/SynchronizedObject;
/*      */       //   650: astore #10
/*      */       //   652: iconst_0
/*      */       //   653: istore #11
/*      */       //   655: aload #10
/*      */       //   657: astore #12
/*      */       //   659: aload #12
/*      */       //   661: monitorenter
/*      */       //   662: nop
/*      */       //   663: iconst_0
/*      */       //   664: istore #13
/*      */       //   666: aload #7
/*      */       //   668: invokestatic access$deriveStateLocked : (Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/CancellableContinuation;
/*      */       //   671: ifnull -> 688
/*      */       //   674: new java/lang/IllegalStateException
/*      */       //   677: dup
/*      */       //   678: ldc_w 'called outside of runRecomposeAndApplyChanges'
/*      */       //   681: invokevirtual toString : ()Ljava/lang/String;
/*      */       //   684: invokespecial <init> : (Ljava/lang/String;)V
/*      */       //   687: athrow
/*      */       //   688: nop
/*      */       //   689: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */       //   692: astore #13
/*      */       //   694: aload #12
/*      */       //   696: monitorexit
/*      */       //   697: goto -> 708
/*      */       //   700: astore #13
/*      */       //   702: aload #12
/*      */       //   704: monitorexit
/*      */       //   705: aload #13
/*      */       //   707: athrow
/*      */       //   708: nop
/*      */       //   709: nop
/*      */       //   710: aload_0
/*      */       //   711: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   714: invokestatic access$getStateLock$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/SynchronizedObject;
/*      */       //   717: astore #8
/*      */       //   719: aload_0
/*      */       //   720: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   723: astore #9
/*      */       //   725: iconst_0
/*      */       //   726: istore #10
/*      */       //   728: aload #8
/*      */       //   730: astore #11
/*      */       //   732: aload #11
/*      */       //   734: monitorenter
/*      */       //   735: nop
/*      */       //   736: iconst_0
/*      */       //   737: istore #12
/*      */       //   739: aload #9
/*      */       //   741: invokestatic access$getHasConcurrentFrameWorkLocked : (Landroidx/compose/runtime/Recomposer;)Z
/*      */       //   744: ifeq -> 755
/*      */       //   747: aload #5
/*      */       //   749: invokevirtual requestFrameLocked : ()Lkotlin/coroutines/Continuation;
/*      */       //   752: goto -> 756
/*      */       //   755: aconst_null
/*      */       //   756: astore #13
/*      */       //   758: aload #11
/*      */       //   760: monitorexit
/*      */       //   761: aload #13
/*      */       //   763: goto -> 774
/*      */       //   766: astore #13
/*      */       //   768: aload #11
/*      */       //   770: monitorexit
/*      */       //   771: aload #13
/*      */       //   773: athrow
/*      */       //   774: nop
/*      */       //   775: astore #7
/*      */       //   777: aload #7
/*      */       //   779: ifnull -> 802
/*      */       //   782: aload #7
/*      */       //   784: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*      */       //   787: pop
/*      */       //   788: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */       //   791: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   794: invokeinterface resumeWith : (Ljava/lang/Object;)V
/*      */       //   799: goto -> 215
/*      */       //   802: goto -> 215
/*      */       //   805: aload #4
/*      */       //   807: invokeinterface getCoroutineContext : ()Lkotlin/coroutines/CoroutineContext;
/*      */       //   812: invokestatic getJob : (Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Job;
/*      */       //   815: aload_0
/*      */       //   816: checkcast kotlin/coroutines/Continuation
/*      */       //   819: aload_0
/*      */       //   820: aload #6
/*      */       //   822: putfield L$0 : Ljava/lang/Object;
/*      */       //   825: aload_0
/*      */       //   826: aconst_null
/*      */       //   827: putfield L$1 : Ljava/lang/Object;
/*      */       //   830: aload_0
/*      */       //   831: aconst_null
/*      */       //   832: putfield L$2 : Ljava/lang/Object;
/*      */       //   835: aload_0
/*      */       //   836: iconst_2
/*      */       //   837: putfield label : I
/*      */       //   840: invokestatic cancelAndJoin : (Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */       //   843: dup
/*      */       //   844: aload #25
/*      */       //   846: if_acmpne -> 866
/*      */       //   849: aload #25
/*      */       //   851: areturn
/*      */       //   852: aload_0
/*      */       //   853: getfield L$0 : Ljava/lang/Object;
/*      */       //   856: checkcast kotlinx/coroutines/Job
/*      */       //   859: astore #6
/*      */       //   861: aload_1
/*      */       //   862: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */       //   865: aload_1
/*      */       //   866: pop
/*      */       //   867: aload #6
/*      */       //   869: aload_0
/*      */       //   870: checkcast kotlin/coroutines/Continuation
/*      */       //   873: aload_0
/*      */       //   874: aconst_null
/*      */       //   875: putfield L$0 : Ljava/lang/Object;
/*      */       //   878: aload_0
/*      */       //   879: iconst_3
/*      */       //   880: putfield label : I
/*      */       //   883: invokestatic cancelAndJoin : (Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */       //   886: dup
/*      */       //   887: aload #25
/*      */       //   889: if_acmpne -> 900
/*      */       //   892: aload #25
/*      */       //   894: areturn
/*      */       //   895: aload_1
/*      */       //   896: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */       //   899: aload_1
/*      */       //   900: pop
/*      */       //   901: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */       //   904: areturn
/*      */       //   905: new java/lang/IllegalStateException
/*      */       //   908: dup
/*      */       //   909: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*      */       //   912: invokespecial <init> : (Ljava/lang/String;)V
/*      */       //   915: athrow
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #879	-> 3
/*      */       //   #880	-> 60
/*      */       //   #1647	-> 94
/*      */       //   #1650	-> 95
/*      */       //   #1651	-> 100
/*      */       //   #881	-> 103
/*      */       //   #882	-> 115
/*      */       //   #881	-> 128
/*      */       //   #1651	-> 134
/*      */       //   #1653	-> 137
/*      */       //   #885	-> 138
/*      */       //   #884	-> 173
/*      */       //   #887	-> 178
/*      */       //   #888	-> 187
/*      */       //   #889	-> 215
/*      */       //   #890	-> 225
/*      */       //   #879	-> 265
/*      */       //   #893	-> 300
/*      */       //   #1654	-> 316
/*      */       //   #1655	-> 326
/*      */       //   #1656	-> 337
/*      */       //   #1657	-> 351
/*      */       //   #1658	-> 374
/*      */       //   #1656	-> 375
/*      */       //   #1656	-> 377
/*      */       //   #1655	-> 378
/*      */       //   #1655	-> 396
/*      */       //   #1659	-> 400
/*      */       //   #1654	-> 403
/*      */       //   #1660	-> 405
/*      */       //   #1660	-> 423
/*      */       //   #1661	-> 426
/*      */       //   #1662	-> 436
/*      */       //   #1663	-> 437
/*      */       //   #1664	-> 456
/*      */       //   #1665	-> 467
/*      */       //   #1666	-> 477
/*      */       //   #1667	-> 486
/*      */       //   #1665	-> 487
/*      */       //   #1663	-> 487
/*      */       //   #1668	-> 493
/*      */       //   #1669	-> 494
/*      */       //   #1670	-> 504
/*      */       //   #1671	-> 505
/*      */       //   #1672	-> 512
/*      */       //   #1673	-> 517
/*      */       //   #1674	-> 520
/*      */       //   #1676	-> 527
/*      */       //   #894	-> 540
/*      */       //   #1677	-> 550
/*      */       //   #895	-> 561
/*      */       //   #1677	-> 579
/*      */       //   #1677	-> 595
/*      */       //   #897	-> 596
/*      */       //   #905	-> 625
/*      */       //   #1676	-> 626
/*      */       //   #1678	-> 626
/*      */       //   #1679	-> 629
/*      */       //   #1681	-> 636
/*      */       //   #1682	-> 637
/*      */       //   #1683	-> 645
/*      */       //   #1655	-> 655
/*      */       //   #1684	-> 666
/*      */       //   #1685	-> 678
/*      */       //   #1687	-> 688
/*      */       //   #1655	-> 692
/*      */       //   #1655	-> 708
/*      */       //   #1688	-> 709
/*      */       //   #908	-> 710
/*      */       //   #906	-> 710
/*      */       //   #1689	-> 728
/*      */       //   #907	-> 739
/*      */       //   #1689	-> 756
/*      */       //   #1689	-> 774
/*      */       //   #906	-> 775
/*      */       //   #908	-> 777
/*      */       //   #906	-> 782
/*      */       //   #908	-> 788
/*      */       //   #908	-> 802
/*      */       //   #910	-> 805
/*      */       //   #879	-> 849
/*      */       //   #911	-> 866
/*      */       //   #879	-> 892
/*      */       //   #912	-> 900
/*      */       //   #879	-> 905
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   52	82	2	$this$recompositionRunner	Lkotlinx/coroutines/CoroutineScope;
/*      */       //   134	4	2	$this$recompositionRunner	Lkotlinx/coroutines/CoroutineScope;
/*      */       //   138	77	2	$this$recompositionRunner	Lkotlinx/coroutines/CoroutineScope;
/*      */       //   60	74	3	parentFrameClock	Landroidx/compose/runtime/MonotonicFrameClock;
/*      */       //   134	4	3	parentFrameClock	Landroidx/compose/runtime/MonotonicFrameClock;
/*      */       //   138	77	3	parentFrameClock	Landroidx/compose/runtime/MonotonicFrameClock;
/*      */       //   91	9	4	value$iv	Z
/*      */       //   178	90	4	recomposeCoroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*      */       //   295	93	4	recomposeCoroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*      */       //   396	191	4	recomposeCoroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*      */       //   595	31	4	recomposeCoroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*      */       //   626	52	4	recomposeCoroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*      */       //   688	12	4	recomposeCoroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*      */       //   708	2	4	recomposeCoroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*      */       //   710	46	4	recomposeCoroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*      */       //   756	10	4	recomposeCoroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*      */       //   774	1	4	recomposeCoroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*      */       //   775	24	4	recomposeCoroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*      */       //   799	44	4	recomposeCoroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*      */       //   187	81	5	frameSignal	Landroidx/compose/runtime/ProduceFrameSignal;
/*      */       //   286	102	5	frameSignal	Landroidx/compose/runtime/ProduceFrameSignal;
/*      */       //   396	191	5	frameSignal	Landroidx/compose/runtime/ProduceFrameSignal;
/*      */       //   595	31	5	frameSignal	Landroidx/compose/runtime/ProduceFrameSignal;
/*      */       //   626	52	5	frameSignal	Landroidx/compose/runtime/ProduceFrameSignal;
/*      */       //   688	12	5	frameSignal	Landroidx/compose/runtime/ProduceFrameSignal;
/*      */       //   708	2	5	frameSignal	Landroidx/compose/runtime/ProduceFrameSignal;
/*      */       //   710	46	5	frameSignal	Landroidx/compose/runtime/ProduceFrameSignal;
/*      */       //   756	10	5	frameSignal	Landroidx/compose/runtime/ProduceFrameSignal;
/*      */       //   774	1	5	frameSignal	Landroidx/compose/runtime/ProduceFrameSignal;
/*      */       //   775	24	5	frameSignal	Landroidx/compose/runtime/ProduceFrameSignal;
/*      */       //   799	6	5	frameSignal	Landroidx/compose/runtime/ProduceFrameSignal;
/*      */       //   215	53	6	frameLoop	Lkotlinx/coroutines/Job;
/*      */       //   277	111	6	frameLoop	Lkotlinx/coroutines/Job;
/*      */       //   396	191	6	frameLoop	Lkotlinx/coroutines/Job;
/*      */       //   595	31	6	frameLoop	Lkotlinx/coroutines/Job;
/*      */       //   626	52	6	frameLoop	Lkotlinx/coroutines/Job;
/*      */       //   688	12	6	frameLoop	Lkotlinx/coroutines/Job;
/*      */       //   708	2	6	frameLoop	Lkotlinx/coroutines/Job;
/*      */       //   710	46	6	frameLoop	Lkotlinx/coroutines/Job;
/*      */       //   756	10	6	frameLoop	Lkotlinx/coroutines/Job;
/*      */       //   774	1	6	frameLoop	Lkotlinx/coroutines/Job;
/*      */       //   775	24	6	frameLoop	Lkotlinx/coroutines/Job;
/*      */       //   799	53	6	frameLoop	Lkotlinx/coroutines/Job;
/*      */       //   861	25	6	frameLoop	Lkotlinx/coroutines/Job;
/*      */       //   313	75	7	this_$iv	Landroidx/compose/runtime/Recomposer;
/*      */       //   396	191	7	this_$iv	Landroidx/compose/runtime/Recomposer;
/*      */       //   595	31	7	this_$iv	Landroidx/compose/runtime/Recomposer;
/*      */       //   626	52	7	this_$iv	Landroidx/compose/runtime/Recomposer;
/*      */       //   725	10	8	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */       //   323	10	10	lock$iv$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */       //   433	61	10	$this$fastForEach$iv$iv	Ljava/util/List;
/*      */       //   501	26	10	this_$iv$iv	Landroidx/compose/runtime/collection/MutableVector;
/*      */       //   652	10	10	lock$iv$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */       //   440	53	12	index$iv$iv	I
/*      */       //   512	75	12	size$iv$iv	I
/*      */       //   595	31	12	size$iv$iv	I
/*      */       //   626	10	12	size$iv$iv	I
/*      */       //   520	67	13	i$iv$iv	I
/*      */       //   595	41	13	i$iv$iv	I
/*      */       //   467	20	14	item$iv$iv	Ljava/lang/Object;
/*      */       //   527	60	14	content$iv$iv	[Ljava/lang/Object;
/*      */       //   595	41	14	content$iv$iv	[Ljava/lang/Object;
/*      */       //   348	26	15	it$iv	Landroidx/collection/MutableScatterSet;
/*      */       //   474	13	15	composition$iv	Landroidx/compose/runtime/ControlledComposition;
/*      */       //   405	51	17	changes$iv	Ljava/util/Set;
/*      */       //   456	37	17	changes$iv	Ljava/util/Set;
/*      */       //   537	50	18	composition	Landroidx/compose/runtime/ControlledComposition;
/*      */       //   595	31	18	composition	Landroidx/compose/runtime/ControlledComposition;
/*      */       //   547	10	20	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */       //   103	31	7	$i$a$-requirePrecondition-Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$1	I
/*      */       //   94	44	6	$i$f$requirePrecondition	I
/*      */       //   561	18	23	$i$a$-synchronized-Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1	I
/*      */       //   550	46	21	$i$f$synchronized	I
/*      */       //   540	86	19	$i$a$-recordComposerModifications-Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2	I
/*      */       //   351	24	16	$i$a$-also-Recomposer$recordComposerModifications$changes$2$1$iv	I
/*      */       //   337	41	13	$i$a$-synchronized-Recomposer$recordComposerModifications$changes$2$iv	I
/*      */       //   326	71	11	$i$f$synchronized	I
/*      */       //   477	10	16	$i$a$-fastForEach-Recomposer$recordComposerModifications$5$iv	I
/*      */       //   436	58	11	$i$f$fastForEach	I
/*      */       //   504	133	11	$i$f$forEach	I
/*      */       //   666	23	13	$i$a$-synchronized-Recomposer$recordComposerModifications$6$iv	I
/*      */       //   655	54	11	$i$f$synchronized	I
/*      */       //   316	394	9	$i$f$recordComposerModifications	I
/*      */       //   739	17	12	$i$a$-synchronized-Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$3	I
/*      */       //   728	47	10	$i$f$synchronized	I
/*      */       //   44	861	0	this	Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;
/*      */       //   44	861	1	$result	Ljava/lang/Object;
/*      */       // Exception table:
/*      */       //   from	to	target	type
/*      */       //   333	380	388	finally
/*      */       //   388	390	388	finally
/*      */       //   557	581	587	finally
/*      */       //   587	589	587	finally
/*      */       //   662	694	700	finally
/*      */       //   700	702	700	finally
/*      */       //   735	758	766	finally
/*      */       //   766	768	766	finally }
/*      */     @Nullable public final Object invoke(@NotNull CoroutineScope p1, @NotNull MonotonicFrameClock p2, @Nullable Continuation<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2> p3) { Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(Recomposer.this, p3);
/*      */       recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$0 = p1;
/*      */       recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$1 = p2;
/*      */       return recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(Unit.INSTANCE); }
/*      */     @DebugMetadata(f = "Recomposer.kt", l = {888}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1") @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label;
/*      */       Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(MonotonicFrameClock $parentFrameClock, ProduceFrameSignal $frameSignal, Continuation $completion) { super(2, $completion); }
/*      */       @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */         switch (this.label) {
/*      */           case 0:
/*      */             ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */             this.label = 1;
/*      */             if (Recomposer.this.runFrameLoop(this.$parentFrameClock, this.$frameSignal, (Continuation)this) == object)
/*      */               return object; 
/*      */             Recomposer.this.runFrameLoop(this.$parentFrameClock, this.$frameSignal, (Continuation)this);
/*      */             return Unit.INSTANCE;
/*      */           case 1:
/*      */             ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */             return Unit.INSTANCE;
/*      */         } 
/*      */         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*      */       @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1> $completion) { return (Continuation<Unit>)new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(this.$parentFrameClock, this.$frameSignal, $completion); }
/*      */       @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } }
/*      */   private final Object runFrameLoop(MonotonicFrameClock parentFrameClock, ProduceFrameSignal frameSignal, Continuation<? super Unit> paramContinuation) { // Byte code:
/*      */     //   0: aload_3
/*      */     //   1: instanceof androidx/compose/runtime/Recomposer$runFrameLoop$1
/*      */     //   4: ifeq -> 41
/*      */     //   7: aload_3
/*      */     //   8: checkcast androidx/compose/runtime/Recomposer$runFrameLoop$1
/*      */     //   11: astore #7
/*      */     //   13: aload #7
/*      */     //   15: getfield label : I
/*      */     //   18: ldc_w -2147483648
/*      */     //   21: iand
/*      */     //   22: ifeq -> 41
/*      */     //   25: aload #7
/*      */     //   27: dup
/*      */     //   28: getfield label : I
/*      */     //   31: ldc_w -2147483648
/*      */     //   34: isub
/*      */     //   35: putfield label : I
/*      */     //   38: goto -> 52
/*      */     //   41: new androidx/compose/runtime/Recomposer$runFrameLoop$1
/*      */     //   44: dup
/*      */     //   45: aload_0
/*      */     //   46: aload_3
/*      */     //   47: invokespecial <init> : (Landroidx/compose/runtime/Recomposer;Lkotlin/coroutines/Continuation;)V
/*      */     //   50: astore #7
/*      */     //   52: aload #7
/*      */     //   54: getfield result : Ljava/lang/Object;
/*      */     //   57: astore #6
/*      */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */     //   62: astore #8
/*      */     //   64: aload #7
/*      */     //   66: getfield label : I
/*      */     //   69: tableswitch default -> 367, 0 -> 96, 1 -> 183, 2 -> 309
/*      */     //   96: aload #6
/*      */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */     //   101: new java/util/ArrayList
/*      */     //   104: dup
/*      */     //   105: invokespecial <init> : ()V
/*      */     //   108: checkcast java/util/List
/*      */     //   111: astore #4
/*      */     //   113: new java/util/ArrayList
/*      */     //   116: dup
/*      */     //   117: invokespecial <init> : ()V
/*      */     //   120: checkcast java/util/List
/*      */     //   123: astore #5
/*      */     //   125: nop
/*      */     //   126: aload_2
/*      */     //   127: aload_0
/*      */     //   128: getfield stateLock : Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   131: aload #7
/*      */     //   133: aload #7
/*      */     //   135: aload_0
/*      */     //   136: putfield L$0 : Ljava/lang/Object;
/*      */     //   139: aload #7
/*      */     //   141: aload_1
/*      */     //   142: putfield L$1 : Ljava/lang/Object;
/*      */     //   145: aload #7
/*      */     //   147: aload_2
/*      */     //   148: putfield L$2 : Ljava/lang/Object;
/*      */     //   151: aload #7
/*      */     //   153: aload #4
/*      */     //   155: putfield L$3 : Ljava/lang/Object;
/*      */     //   158: aload #7
/*      */     //   160: aload #5
/*      */     //   162: putfield L$4 : Ljava/lang/Object;
/*      */     //   165: aload #7
/*      */     //   167: iconst_1
/*      */     //   168: putfield label : I
/*      */     //   171: invokevirtual awaitFrameRequest : (Landroidx/compose/runtime/SynchronizedObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */     //   174: dup
/*      */     //   175: aload #8
/*      */     //   177: if_acmpne -> 237
/*      */     //   180: aload #8
/*      */     //   182: areturn
/*      */     //   183: aload #7
/*      */     //   185: getfield L$4 : Ljava/lang/Object;
/*      */     //   188: checkcast java/util/List
/*      */     //   191: astore #5
/*      */     //   193: aload #7
/*      */     //   195: getfield L$3 : Ljava/lang/Object;
/*      */     //   198: checkcast java/util/List
/*      */     //   201: astore #4
/*      */     //   203: aload #7
/*      */     //   205: getfield L$2 : Ljava/lang/Object;
/*      */     //   208: checkcast androidx/compose/runtime/ProduceFrameSignal
/*      */     //   211: astore_2
/*      */     //   212: aload #7
/*      */     //   214: getfield L$1 : Ljava/lang/Object;
/*      */     //   217: checkcast androidx/compose/runtime/MonotonicFrameClock
/*      */     //   220: astore_1
/*      */     //   221: aload #7
/*      */     //   223: getfield L$0 : Ljava/lang/Object;
/*      */     //   226: checkcast androidx/compose/runtime/Recomposer
/*      */     //   229: astore_0
/*      */     //   230: aload #6
/*      */     //   232: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */     //   235: aload #6
/*      */     //   237: pop
/*      */     //   238: aload_1
/*      */     //   239: new androidx/compose/runtime/Recomposer$runFrameLoop$2
/*      */     //   242: dup
/*      */     //   243: aload_0
/*      */     //   244: aload #4
/*      */     //   246: aload #5
/*      */     //   248: aload_2
/*      */     //   249: invokespecial <init> : (Landroidx/compose/runtime/Recomposer;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/ProduceFrameSignal;)V
/*      */     //   252: checkcast kotlin/jvm/functions/Function1
/*      */     //   255: aload #7
/*      */     //   257: aload #7
/*      */     //   259: aload_0
/*      */     //   260: putfield L$0 : Ljava/lang/Object;
/*      */     //   263: aload #7
/*      */     //   265: aload_1
/*      */     //   266: putfield L$1 : Ljava/lang/Object;
/*      */     //   269: aload #7
/*      */     //   271: aload_2
/*      */     //   272: putfield L$2 : Ljava/lang/Object;
/*      */     //   275: aload #7
/*      */     //   277: aload #4
/*      */     //   279: putfield L$3 : Ljava/lang/Object;
/*      */     //   282: aload #7
/*      */     //   284: aload #5
/*      */     //   286: putfield L$4 : Ljava/lang/Object;
/*      */     //   289: aload #7
/*      */     //   291: iconst_2
/*      */     //   292: putfield label : I
/*      */     //   295: invokeinterface withFrameNanos : (Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */     //   300: dup
/*      */     //   301: aload #8
/*      */     //   303: if_acmpne -> 363
/*      */     //   306: aload #8
/*      */     //   308: areturn
/*      */     //   309: aload #7
/*      */     //   311: getfield L$4 : Ljava/lang/Object;
/*      */     //   314: checkcast java/util/List
/*      */     //   317: astore #5
/*      */     //   319: aload #7
/*      */     //   321: getfield L$3 : Ljava/lang/Object;
/*      */     //   324: checkcast java/util/List
/*      */     //   327: astore #4
/*      */     //   329: aload #7
/*      */     //   331: getfield L$2 : Ljava/lang/Object;
/*      */     //   334: checkcast androidx/compose/runtime/ProduceFrameSignal
/*      */     //   337: astore_2
/*      */     //   338: aload #7
/*      */     //   340: getfield L$1 : Ljava/lang/Object;
/*      */     //   343: checkcast androidx/compose/runtime/MonotonicFrameClock
/*      */     //   346: astore_1
/*      */     //   347: aload #7
/*      */     //   349: getfield L$0 : Ljava/lang/Object;
/*      */     //   352: checkcast androidx/compose/runtime/Recomposer
/*      */     //   355: astore_0
/*      */     //   356: aload #6
/*      */     //   358: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */     //   361: aload #6
/*      */     //   363: pop
/*      */     //   364: goto -> 125
/*      */     //   367: new java/lang/IllegalStateException
/*      */     //   370: dup
/*      */     //   371: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*      */     //   374: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   377: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #914	-> 62
/*      */     //   #918	-> 101
/*      */     //   #918	-> 111
/*      */     //   #919	-> 113
/*      */     //   #919	-> 123
/*      */     //   #920	-> 125
/*      */     //   #921	-> 126
/*      */     //   #914	-> 180
/*      */     //   #928	-> 237
/*      */     //   #914	-> 306
/*      */     //   #928	-> 363
/*      */     //   #914	-> 367
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   101	10	0	this	Landroidx/compose/runtime/Recomposer;
/*      */     //   111	12	0	this	Landroidx/compose/runtime/Recomposer;
/*      */     //   123	60	0	this	Landroidx/compose/runtime/Recomposer;
/*      */     //   230	79	0	this	Landroidx/compose/runtime/Recomposer;
/*      */     //   356	11	0	this	Landroidx/compose/runtime/Recomposer;
/*      */     //   101	10	1	parentFrameClock	Landroidx/compose/runtime/MonotonicFrameClock;
/*      */     //   111	12	1	parentFrameClock	Landroidx/compose/runtime/MonotonicFrameClock;
/*      */     //   123	60	1	parentFrameClock	Landroidx/compose/runtime/MonotonicFrameClock;
/*      */     //   221	88	1	parentFrameClock	Landroidx/compose/runtime/MonotonicFrameClock;
/*      */     //   347	20	1	parentFrameClock	Landroidx/compose/runtime/MonotonicFrameClock;
/*      */     //   101	10	2	frameSignal	Landroidx/compose/runtime/ProduceFrameSignal;
/*      */     //   111	12	2	frameSignal	Landroidx/compose/runtime/ProduceFrameSignal;
/*      */     //   123	60	2	frameSignal	Landroidx/compose/runtime/ProduceFrameSignal;
/*      */     //   212	97	2	frameSignal	Landroidx/compose/runtime/ProduceFrameSignal;
/*      */     //   338	29	2	frameSignal	Landroidx/compose/runtime/ProduceFrameSignal;
/*      */     //   113	10	4	toRecompose	Ljava/util/List;
/*      */     //   123	60	4	toRecompose	Ljava/util/List;
/*      */     //   203	106	4	toRecompose	Ljava/util/List;
/*      */     //   329	38	4	toRecompose	Ljava/util/List;
/*      */     //   125	58	5	toApply	Ljava/util/List;
/*      */     //   193	116	5	toApply	Ljava/util/List;
/*      */     //   319	48	5	toApply	Ljava/util/List;
/*      */     //   52	315	7	$continuation	Lkotlin/coroutines/Continuation;
/*      */     //   59	308	6	$result	Ljava/lang/Object; }
/*      */   private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> toInsert, Recomposer this$0, ControlledComposition $composition) { toInsert.clear();
/*      */     SynchronizedObject lock$iv = this$0.stateLock;
/*      */     int $i$f$synchronized = 0;
/* 1868 */     synchronized (lock$iv) { int $i$a$-synchronized-Recomposer$performInitialMovableContentInserts$fillToInsert$1 = 0; Iterator<MovableContentStateReference> iterator = this$0.compositionValuesAwaitingInsert.iterator(); while (iterator.hasNext()) { MovableContentStateReference value = iterator.next(); if (Intrinsics.areEqual(value.getComposition$runtime(), $composition)) { toInsert.add(value); iterator.remove(); }  }  Unit unit = Unit.INSTANCE; }
/*      */      }
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\020\002\n\000\n\002\020\t\n\000\020\000\032\n\022\004\022\0020\002\030\0010\0012\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/CancellableContinuation;", "", "frameTime", "", "invoke"})
/*      */   @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1646:1\n46#2,5:1647\n46#2,3:1652\n50#2:1686\n26#3:1655\n26#3:1685\n33#4,6:1656\n33#4,6:1673\n33#4,6:1679\n460#5,11:1662\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n*L\n932#1:1647,5\n942#1:1652,3\n942#1:1686\n947#1:1655\n980#1:1685\n948#1:1656,6\n958#1:1673,6\n973#1:1679,6\n950#1:1662,11\n*E\n"})
/*      */   static final class Recomposer$runFrameLoop$2 extends Lambda implements Function1<Long, CancellableContinuation<? super Unit>> {
/*      */     @Nullable
/*      */     public final CancellableContinuation<Unit> invoke(long frameTime) {
/*      */       if (Recomposer.this.getHasBroadcastFrameClockAwaiters()) {
/*      */         String str = "Recomposer:animation";
/*      */         Recomposer recomposer1 = Recomposer.this;
/*      */         int i = 0;
/*      */         Object object = Trace.INSTANCE.beginSection(str);
/*      */       } 
/*      */       String sectionName$iv = "Recomposer:recompose";
/*      */       Recomposer recomposer = Recomposer.this;
/*      */       List<ControlledComposition> list1 = this.$toRecompose, list2 = this.$toApply;
/*      */       ProduceFrameSignal produceFrameSignal = this.$frameSignal;
/*      */       int $i$f$trace = 0;
/*      */       Object token$iv = Trace.INSTANCE.beginSection(sectionName$iv);
/*      */       try {
/*      */         int $i$a$-trace-Recomposer$runFrameLoop$2$2 = 0;
/*      */         recomposer.recordComposerModifications();
/*      */         SynchronizedObject lock$iv = recomposer.stateLock;
/*      */         int $i$f$synchronized = 0;
/*      */         synchronized (lock$iv) {
/*      */           int $i$a$-synchronized-Recomposer$runFrameLoop$2$2$1 = 0;
/*      */           List $this$fastForEach$iv = recomposer.compositionsAwaitingApply;
/*      */           int $i$f$fastForEach = 0;
/*      */           int index$iv = 0, j = $this$fastForEach$iv.size();
/*      */           if (index$iv < j) {
/*      */             Object item$iv = $this$fastForEach$iv.get(index$iv);
/*      */             ControlledComposition it = (ControlledComposition)item$iv;
/*      */             int $i$a$-fastForEach-Recomposer$runFrameLoop$2$2$1$1 = 0;
/*      */             list2.add(it);
/*      */           } 
/*      */           recomposer.compositionsAwaitingApply.clear();
/*      */           MutableVector this_$iv = recomposer.compositionInvalidations;
/*      */           int $i$f$forEach = 0;
/*      */           int size$iv = this_$iv.getSize();
/*      */           if (size$iv > 0) {
/*      */             int i$iv = 0;
/*      */             Object[] content$iv = this_$iv.getContent();
/*      */             do {
/*      */               ControlledComposition it = (ControlledComposition)content$iv[i$iv];
/*      */               int $i$a$-forEach-Recomposer$runFrameLoop$2$2$1$2 = 0;
/*      */               list1.add(it);
/*      */               ++i$iv;
/*      */             } while (i$iv < size$iv);
/*      */           } 
/*      */           recomposer.compositionInvalidations.clear();
/*      */           produceFrameSignal.takeFrameRequestLocked();
/*      */           Unit unit = Unit.INSTANCE;
/*      */         } 
/*      */         MutableScatterSet modifiedValues = new MutableScatterSet(0, 1, null);
/*      */         try {
/*      */           List<ControlledComposition> $this$fastForEach$iv = list1;
/*      */           int $i$f$fastForEach = 0;
/*      */           int index$iv = 0, j = $this$fastForEach$iv.size();
/*      */           if (index$iv < j) {
/*      */             Object item$iv = $this$fastForEach$iv.get(index$iv);
/*      */             ControlledComposition composer = (ControlledComposition)item$iv;
/*      */             int $i$a$-fastForEach-Recomposer$runFrameLoop$2$2$2 = 0;
/*      */             ControlledComposition it = recomposer.performRecompose(composer, modifiedValues);
/*      */             int $i$a$-let-Recomposer$runFrameLoop$2$2$2$1 = 0;
/*      */             list2.add(it);
/*      */             recomposer.performRecompose(composer, modifiedValues);
/*      */           } 
/*      */         } finally {
/*      */           list1.clear();
/*      */         } 
/*      */         if (!list2.isEmpty()) {
/*      */           long l = recomposer.getChangeCount();
/*      */           recomposer.changeCount = l + 1L;
/*      */         } 
/*      */         try {
/*      */           List<ControlledComposition> $this$fastForEach$iv = list2;
/*      */           int $i$f$fastForEach = 0;
/*      */           int index$iv = 0, j = $this$fastForEach$iv.size();
/*      */           if (index$iv < j) {
/*      */             Object item$iv = $this$fastForEach$iv.get(index$iv);
/*      */             ControlledComposition composition = (ControlledComposition)item$iv;
/*      */             int $i$a$-fastForEach-Recomposer$runFrameLoop$2$2$3 = 0;
/*      */             composition.applyChanges();
/*      */           } 
/*      */         } finally {
/*      */           list2.clear();
/*      */         } 
/*      */         SynchronizedObject synchronizedObject1 = recomposer.stateLock;
/*      */         int i = 0;
/*      */         synchronized (synchronizedObject1) {
/*      */           int $i$a$-synchronized-Recomposer$runFrameLoop$2$2$4 = 0;
/*      */           CancellableContinuation<Unit> cancellableContinuation1 = recomposer.deriveStateLocked();
/*      */         } 
/*      */         CancellableContinuation<Unit> cancellableContinuation = cancellableContinuation1;
/*      */       } finally {
/*      */         Trace.INSTANCE.endSection(token$iv);
/*      */       } 
/*      */       return cancellableContinuation;
/*      */     }
/*      */     
/*      */     Recomposer$runFrameLoop$2(List<ControlledComposition> $toRecompose, List<ControlledComposition> $toApply, ProduceFrameSignal $frameSignal) {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   private final boolean getHasSchedulingWork() {
/*      */     SynchronizedObject lock$iv = this.stateLock;
/*      */     int $i$f$synchronized = 0;
/*      */     synchronized (lock$iv) {
/*      */       int $i$a$-synchronized-Recomposer$hasSchedulingWork$1 = 0;
/*      */       $i$a$-synchronized-Recomposer$hasSchedulingWork$1 = (this.snapshotInvalidations.isNotEmpty() || this.compositionInvalidations.isNotEmpty() || getHasBroadcastFrameClockAwaitersLocked()) ? 1 : 0;
/*      */     } 
/*      */     return $i$a$-synchronized-Recomposer$hasSchedulingWork$1;
/*      */   }
/*      */   
/*      */   private final Object awaitWorkAvailable(Continuation $completion) {
/*      */     if (!getHasSchedulingWork()) {
/*      */       int $i$f$suspendCancellableCoroutine = 0;
/*      */       Continuation uCont$iv = $completion;
/*      */       int $i$a$-suspendCoroutineUninterceptedOrReturn-CancellableContinuationKt$suspendCancellableCoroutine$2$iv = 0;
/*      */       CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(uCont$iv), 1);
/*      */       cancellable$iv.initCancellability();
/*      */       CancellableContinuation co = (CancellableContinuation)cancellable$iv;
/*      */       int $i$a$-suspendCancellableCoroutine-Recomposer$awaitWorkAvailable$2 = 0;
/*      */       SynchronizedObject lock$iv = this.stateLock;
/*      */       int $i$f$synchronized = 0;
/*      */       synchronized (lock$iv) {
/*      */         int $i$a$-synchronized-Recomposer$awaitWorkAvailable$2$1 = 0;
/*      */         this.workContinuation = co;
/*      */         CancellableContinuation cancellableContinuation = getHasSchedulingWork() ? co : null;
/*      */       } 
/*      */       CancellableContinuation cancellableContinuation1 = cancellableContinuation;
/*      */       if (cancellableContinuation1 != null) {
/*      */         ((Continuation)cancellableContinuation1).resumeWith(Result.constructor-impl(Unit.INSTANCE));
/*      */       } else {
/*      */       
/*      */       } 
/*      */       if (cancellable$iv.getResult() == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*      */         DebugProbesKt.probeCoroutineSuspended($completion); 
/*      */       if (cancellable$iv.getResult() == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*      */         return cancellable$iv.getResult(); 
/*      */       cancellable$iv.getResult();
/*      */       return Unit.INSTANCE;
/*      */     } 
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private final Object recompositionRunner(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> block, Continuation $completion) {
/*      */     MonotonicFrameClock parentFrameClock = MonotonicFrameClockKt.getMonotonicFrameClock($completion.getContext());
/*      */     if (BuildersKt.withContext((CoroutineContext)this.broadcastFrameClock, new Recomposer$recompositionRunner$2(block, parentFrameClock, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*      */       return BuildersKt.withContext((CoroutineContext)this.broadcastFrameClock, new Recomposer$recompositionRunner$2(block, parentFrameClock, null), $completion); 
/*      */     BuildersKt.withContext((CoroutineContext)this.broadcastFrameClock, new Recomposer$recompositionRunner$2(block, parentFrameClock, null), $completion);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "Recomposer.kt", l = {1054}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"callingJob", "unregisterApplyObserver"}, m = "invokeSuspend", c = "androidx.compose.runtime.Recomposer$recompositionRunner$2")
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*      */   @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1646:1\n26#2:1647\n26#2:1654\n33#3,6:1648\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n*L\n1050#1:1647\n1059#1:1654\n1052#1:1648,6\n*E\n"})
/*      */   static final class Recomposer$recompositionRunner$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*      */     Object L$1;
/*      */     int label;
/*      */     
/*      */     Recomposer$recompositionRunner$2(Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> $block, MonotonicFrameClock $parentFrameClock, Continuation $completion) {
/*      */       super(2, $completion);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invokeSuspend(@NotNull Object $result) {
/*      */       // Byte code:
/*      */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */       //   3: astore #12
/*      */       //   5: aload_0
/*      */       //   6: getfield label : I
/*      */       //   9: tableswitch default -> 470, 0 -> 32, 1 -> 262
/*      */       //   32: aload_1
/*      */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */       //   36: aload_0
/*      */       //   37: getfield L$0 : Ljava/lang/Object;
/*      */       //   40: checkcast kotlinx/coroutines/CoroutineScope
/*      */       //   43: astore_2
/*      */       //   44: aload_2
/*      */       //   45: invokeinterface getCoroutineContext : ()Lkotlin/coroutines/CoroutineContext;
/*      */       //   50: invokestatic getJob : (Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Job;
/*      */       //   53: astore_3
/*      */       //   54: aload_0
/*      */       //   55: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   58: aload_3
/*      */       //   59: invokestatic access$registerRunnerJob : (Landroidx/compose/runtime/Recomposer;Lkotlinx/coroutines/Job;)V
/*      */       //   62: getstatic androidx/compose/runtime/snapshots/Snapshot.Companion : Landroidx/compose/runtime/snapshots/Snapshot$Companion;
/*      */       //   65: new androidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1
/*      */       //   68: dup
/*      */       //   69: aload_0
/*      */       //   70: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   73: invokespecial <init> : (Landroidx/compose/runtime/Recomposer;)V
/*      */       //   76: checkcast kotlin/jvm/functions/Function2
/*      */       //   79: invokevirtual registerApplyObserver : (Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/snapshots/ObserverHandle;
/*      */       //   82: astore #4
/*      */       //   84: getstatic androidx/compose/runtime/Recomposer.Companion : Landroidx/compose/runtime/Recomposer$Companion;
/*      */       //   87: aload_0
/*      */       //   88: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   91: invokestatic access$getRecomposerInfo$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;
/*      */       //   94: invokestatic access$addRunning : (Landroidx/compose/runtime/Recomposer$Companion;Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;)V
/*      */       //   97: nop
/*      */       //   98: aload_0
/*      */       //   99: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   102: invokestatic access$getStateLock$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/SynchronizedObject;
/*      */       //   105: astore #5
/*      */       //   107: aload_0
/*      */       //   108: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   111: astore #6
/*      */       //   113: iconst_0
/*      */       //   114: istore #7
/*      */       //   116: aload #5
/*      */       //   118: astore #8
/*      */       //   120: aload #8
/*      */       //   122: monitorenter
/*      */       //   123: nop
/*      */       //   124: iconst_0
/*      */       //   125: istore #9
/*      */       //   127: aload #6
/*      */       //   129: invokestatic access$getKnownCompositions : (Landroidx/compose/runtime/Recomposer;)Ljava/util/List;
/*      */       //   132: astore #9
/*      */       //   134: aload #8
/*      */       //   136: monitorexit
/*      */       //   137: aload #9
/*      */       //   139: goto -> 150
/*      */       //   142: astore #9
/*      */       //   144: aload #8
/*      */       //   146: monitorexit
/*      */       //   147: aload #9
/*      */       //   149: athrow
/*      */       //   150: nop
/*      */       //   151: astore #5
/*      */       //   153: iconst_0
/*      */       //   154: istore #6
/*      */       //   156: nop
/*      */       //   157: iconst_0
/*      */       //   158: istore #7
/*      */       //   160: aload #5
/*      */       //   162: invokeinterface size : ()I
/*      */       //   167: istore #8
/*      */       //   169: iload #7
/*      */       //   171: iload #8
/*      */       //   173: if_icmpge -> 210
/*      */       //   176: aload #5
/*      */       //   178: iload #7
/*      */       //   180: invokeinterface get : (I)Ljava/lang/Object;
/*      */       //   185: astore #9
/*      */       //   187: aload #9
/*      */       //   189: checkcast androidx/compose/runtime/ControlledComposition
/*      */       //   192: astore #10
/*      */       //   194: iconst_0
/*      */       //   195: istore #11
/*      */       //   197: aload #10
/*      */       //   199: invokeinterface invalidateAll : ()V
/*      */       //   204: iinc #7, 1
/*      */       //   207: goto -> 169
/*      */       //   210: nop
/*      */       //   211: new androidx/compose/runtime/Recomposer$recompositionRunner$2$3
/*      */       //   214: dup
/*      */       //   215: aload_0
/*      */       //   216: getfield $block : Lkotlin/jvm/functions/Function3;
/*      */       //   219: aload_0
/*      */       //   220: getfield $parentFrameClock : Landroidx/compose/runtime/MonotonicFrameClock;
/*      */       //   223: aconst_null
/*      */       //   224: invokespecial <init> : (Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/MonotonicFrameClock;Lkotlin/coroutines/Continuation;)V
/*      */       //   227: checkcast kotlin/jvm/functions/Function2
/*      */       //   230: aload_0
/*      */       //   231: checkcast kotlin/coroutines/Continuation
/*      */       //   234: aload_0
/*      */       //   235: aload_3
/*      */       //   236: putfield L$0 : Ljava/lang/Object;
/*      */       //   239: aload_0
/*      */       //   240: aload #4
/*      */       //   242: putfield L$1 : Ljava/lang/Object;
/*      */       //   245: aload_0
/*      */       //   246: iconst_1
/*      */       //   247: putfield label : I
/*      */       //   250: invokestatic coroutineScope : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */       //   253: dup
/*      */       //   254: aload #12
/*      */       //   256: if_acmpne -> 285
/*      */       //   259: aload #12
/*      */       //   261: areturn
/*      */       //   262: aload_0
/*      */       //   263: getfield L$1 : Ljava/lang/Object;
/*      */       //   266: checkcast androidx/compose/runtime/snapshots/ObserverHandle
/*      */       //   269: astore #4
/*      */       //   271: aload_0
/*      */       //   272: getfield L$0 : Ljava/lang/Object;
/*      */       //   275: checkcast kotlinx/coroutines/Job
/*      */       //   278: astore_3
/*      */       //   279: nop
/*      */       //   280: aload_1
/*      */       //   281: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */       //   284: aload_1
/*      */       //   285: pop
/*      */       //   286: aload #4
/*      */       //   288: invokeinterface dispose : ()V
/*      */       //   293: aload_0
/*      */       //   294: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   297: invokestatic access$getStateLock$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/SynchronizedObject;
/*      */       //   300: astore #5
/*      */       //   302: aload_0
/*      */       //   303: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   306: astore #6
/*      */       //   308: iconst_0
/*      */       //   309: istore #7
/*      */       //   311: aload #5
/*      */       //   313: astore #8
/*      */       //   315: aload #8
/*      */       //   317: monitorenter
/*      */       //   318: nop
/*      */       //   319: iconst_0
/*      */       //   320: istore #9
/*      */       //   322: aload #6
/*      */       //   324: invokestatic access$getRunnerJob$p : (Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/Job;
/*      */       //   327: aload_3
/*      */       //   328: if_acmpne -> 337
/*      */       //   331: aload #6
/*      */       //   333: aconst_null
/*      */       //   334: invokestatic access$setRunnerJob$p : (Landroidx/compose/runtime/Recomposer;Lkotlinx/coroutines/Job;)V
/*      */       //   337: aload #6
/*      */       //   339: invokestatic access$deriveStateLocked : (Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/CancellableContinuation;
/*      */       //   342: astore #10
/*      */       //   344: aload #8
/*      */       //   346: monitorexit
/*      */       //   347: goto -> 358
/*      */       //   350: astore #10
/*      */       //   352: aload #8
/*      */       //   354: monitorexit
/*      */       //   355: aload #10
/*      */       //   357: athrow
/*      */       //   358: nop
/*      */       //   359: getstatic androidx/compose/runtime/Recomposer.Companion : Landroidx/compose/runtime/Recomposer$Companion;
/*      */       //   362: aload_0
/*      */       //   363: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   366: invokestatic access$getRecomposerInfo$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;
/*      */       //   369: invokestatic access$removeRunning : (Landroidx/compose/runtime/Recomposer$Companion;Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;)V
/*      */       //   372: goto -> 466
/*      */       //   375: astore #5
/*      */       //   377: aload #4
/*      */       //   379: invokeinterface dispose : ()V
/*      */       //   384: aload_0
/*      */       //   385: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   388: invokestatic access$getStateLock$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/SynchronizedObject;
/*      */       //   391: astore #6
/*      */       //   393: aload_0
/*      */       //   394: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   397: astore #7
/*      */       //   399: iconst_0
/*      */       //   400: istore #8
/*      */       //   402: aload #6
/*      */       //   404: astore #9
/*      */       //   406: aload #9
/*      */       //   408: monitorenter
/*      */       //   409: nop
/*      */       //   410: iconst_0
/*      */       //   411: istore #10
/*      */       //   413: aload #7
/*      */       //   415: invokestatic access$getRunnerJob$p : (Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/Job;
/*      */       //   418: aload_3
/*      */       //   419: if_acmpne -> 428
/*      */       //   422: aload #7
/*      */       //   424: aconst_null
/*      */       //   425: invokestatic access$setRunnerJob$p : (Landroidx/compose/runtime/Recomposer;Lkotlinx/coroutines/Job;)V
/*      */       //   428: aload #7
/*      */       //   430: invokestatic access$deriveStateLocked : (Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/CancellableContinuation;
/*      */       //   433: astore #11
/*      */       //   435: aload #9
/*      */       //   437: monitorexit
/*      */       //   438: goto -> 449
/*      */       //   441: astore #11
/*      */       //   443: aload #9
/*      */       //   445: monitorexit
/*      */       //   446: aload #11
/*      */       //   448: athrow
/*      */       //   449: nop
/*      */       //   450: getstatic androidx/compose/runtime/Recomposer.Companion : Landroidx/compose/runtime/Recomposer$Companion;
/*      */       //   453: aload_0
/*      */       //   454: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */       //   457: invokestatic access$getRecomposerInfo$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;
/*      */       //   460: invokestatic access$removeRunning : (Landroidx/compose/runtime/Recomposer$Companion;Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;)V
/*      */       //   463: aload #5
/*      */       //   465: athrow
/*      */       //   466: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */       //   469: areturn
/*      */       //   470: new java/lang/IllegalStateException
/*      */       //   473: dup
/*      */       //   474: ldc 'call to 'resume' before 'invoke' with coroutine'
/*      */       //   476: invokespecial <init> : (Ljava/lang/String;)V
/*      */       //   479: athrow
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #1018	-> 3
/*      */       //   #1020	-> 44
/*      */       //   #1021	-> 54
/*      */       //   #1026	-> 62
/*      */       //   #1045	-> 84
/*      */       //   #1047	-> 97
/*      */       //   #1050	-> 98
/*      */       //   #1647	-> 116
/*      */       //   #1051	-> 127
/*      */       //   #1647	-> 132
/*      */       //   #1647	-> 150
/*      */       //   #1052	-> 153
/*      */       //   #1648	-> 156
/*      */       //   #1649	-> 157
/*      */       //   #1650	-> 176
/*      */       //   #1651	-> 187
/*      */       //   #1052	-> 197
/*      */       //   #1651	-> 204
/*      */       //   #1649	-> 204
/*      */       //   #1653	-> 210
/*      */       //   #1054	-> 211
/*      */       //   #1018	-> 259
/*      */       //   #1058	-> 285
/*      */       //   #1059	-> 293
/*      */       //   #1654	-> 311
/*      */       //   #1060	-> 322
/*      */       //   #1061	-> 331
/*      */       //   #1063	-> 337
/*      */       //   #1654	-> 342
/*      */       //   #1654	-> 358
/*      */       //   #1065	-> 359
/*      */       //   #1066	-> 372
/*      */       //   #1058	-> 375
/*      */       //   #1059	-> 384
/*      */       //   #1654	-> 402
/*      */       //   #1060	-> 413
/*      */       //   #1061	-> 422
/*      */       //   #1063	-> 428
/*      */       //   #1654	-> 433
/*      */       //   #1654	-> 449
/*      */       //   #1065	-> 450
/*      */       //   #1067	-> 466
/*      */       //   #1018	-> 470
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   44	10	2	$this$withContext	Lkotlinx/coroutines/CoroutineScope;
/*      */       //   54	78	3	callingJob	Lkotlinx/coroutines/Job;
/*      */       //   132	19	3	callingJob	Lkotlinx/coroutines/Job;
/*      */       //   151	111	3	callingJob	Lkotlinx/coroutines/Job;
/*      */       //   279	52	3	callingJob	Lkotlinx/coroutines/Job;
/*      */       //   375	47	3	callingJob	Lkotlinx/coroutines/Job;
/*      */       //   84	48	4	unregisterApplyObserver	Landroidx/compose/runtime/snapshots/ObserverHandle;
/*      */       //   132	19	4	unregisterApplyObserver	Landroidx/compose/runtime/snapshots/ObserverHandle;
/*      */       //   151	111	4	unregisterApplyObserver	Landroidx/compose/runtime/snapshots/ObserverHandle;
/*      */       //   271	22	4	unregisterApplyObserver	Landroidx/compose/runtime/snapshots/ObserverHandle;
/*      */       //   375	9	4	unregisterApplyObserver	Landroidx/compose/runtime/snapshots/ObserverHandle;
/*      */       //   113	10	5	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */       //   153	58	5	$this$fastForEach$iv	Ljava/util/List;
/*      */       //   308	10	5	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */       //   399	10	6	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */       //   160	50	7	index$iv	I
/*      */       //   187	17	9	item$iv	Ljava/lang/Object;
/*      */       //   194	10	10	it	Landroidx/compose/runtime/ControlledComposition;
/*      */       //   127	5	9	$i$a$-synchronized-Recomposer$recompositionRunner$2$1	I
/*      */       //   116	35	7	$i$f$synchronized	I
/*      */       //   197	7	11	$i$a$-fastForEach-Recomposer$recompositionRunner$2$2	I
/*      */       //   156	55	6	$i$f$fastForEach	I
/*      */       //   322	20	9	$i$a$-synchronized-Recomposer$recompositionRunner$2$4	I
/*      */       //   311	48	7	$i$f$synchronized	I
/*      */       //   413	20	10	$i$a$-synchronized-Recomposer$recompositionRunner$2$4	I
/*      */       //   402	48	8	$i$f$synchronized	I
/*      */       //   36	434	0	this	Landroidx/compose/runtime/Recomposer$recompositionRunner$2;
/*      */       //   36	434	1	$result	Ljava/lang/Object;
/*      */       // Exception table:
/*      */       //   from	to	target	type
/*      */       //   97	253	375	finally
/*      */       //   123	134	142	finally
/*      */       //   142	144	142	finally
/*      */       //   279	286	375	finally
/*      */       //   318	344	350	finally
/*      */       //   350	352	350	finally
/*      */       //   375	377	375	finally
/*      */       //   409	435	441	finally
/*      */       //   441	443	441	finally
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super Recomposer$recompositionRunner$2> $completion) {
/*      */       Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.$block, this.$parentFrameClock, $completion);
/*      */       recomposer$recompositionRunner$2.L$0 = value;
/*      */       return (Continuation<Unit>)recomposer$recompositionRunner$2;
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*      */       return ((Recomposer$recompositionRunner$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */     
/*      */     @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\030\n\000\n\002\020\002\n\000\n\002\020\"\n\002\020\000\n\000\n\002\030\002\n\000\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\n¢\006\002\b\007"}, d2 = {"<anonymous>", "", "changed", "", "", "<anonymous parameter 1>", "Landroidx/compose/runtime/snapshots/Snapshot;", "invoke"})
/*      */     @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 3 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1646:1\n26#2:1647\n48#3,3:1648\n53#3:1679\n55#3:1682\n267#4,4:1651\n237#4,7:1655\n248#4,3:1663\n251#4,2:1667\n272#4:1669\n273#4:1671\n254#4,6:1672\n274#4:1678\n1810#5:1662\n1672#5:1666\n51#6:1670\n1855#7,2:1680\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n*L\n1027#1:1647\n1030#1:1648,3\n1030#1:1679\n1030#1:1682\n1030#1:1651,4\n1030#1:1655,7\n1030#1:1663,3\n1030#1:1667,2\n1030#1:1669\n1030#1:1671\n1030#1:1672,6\n1030#1:1678\n1030#1:1662\n1030#1:1666\n1033#1:1670\n1030#1:1680,2\n*E\n"})
/*      */     static final class Recomposer$recompositionRunner$2$unregisterApplyObserver$1 extends Lambda implements Function2<Set<? extends Object>, Snapshot, Unit> {
/*      */       public final void invoke(@NotNull Set changed, @NotNull Snapshot param1Snapshot) {
/*      */         // Byte code:
/*      */         //   0: aload_1
/*      */         //   1: ldc 'changed'
/*      */         //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */         //   6: aload_2
/*      */         //   7: ldc '<anonymous parameter 1>'
/*      */         //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */         //   12: aload_0
/*      */         //   13: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */         //   16: invokestatic access$getStateLock$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/SynchronizedObject;
/*      */         //   19: astore #4
/*      */         //   21: aload_0
/*      */         //   22: getfield this$0 : Landroidx/compose/runtime/Recomposer;
/*      */         //   25: astore #5
/*      */         //   27: iconst_0
/*      */         //   28: istore #6
/*      */         //   30: aload #4
/*      */         //   32: astore #7
/*      */         //   34: aload #7
/*      */         //   36: monitorenter
/*      */         //   37: nop
/*      */         //   38: iconst_0
/*      */         //   39: istore #8
/*      */         //   41: aload #5
/*      */         //   43: invokestatic access$get_state$p : (Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*      */         //   46: invokeinterface getValue : ()Ljava/lang/Object;
/*      */         //   51: checkcast androidx/compose/runtime/Recomposer$State
/*      */         //   54: getstatic androidx/compose/runtime/Recomposer$State.Idle : Landroidx/compose/runtime/Recomposer$State;
/*      */         //   57: checkcast java/lang/Enum
/*      */         //   60: invokevirtual compareTo : (Ljava/lang/Enum;)I
/*      */         //   63: iflt -> 442
/*      */         //   66: aload #5
/*      */         //   68: invokestatic access$getSnapshotInvalidations$p : (Landroidx/compose/runtime/Recomposer;)Landroidx/collection/MutableScatterSet;
/*      */         //   71: astore #9
/*      */         //   73: aload_1
/*      */         //   74: astore #10
/*      */         //   76: iconst_0
/*      */         //   77: istore #11
/*      */         //   79: aload #10
/*      */         //   81: instanceof androidx/compose/runtime/collection/ScatterSetWrapper
/*      */         //   84: ifeq -> 340
/*      */         //   87: aload #10
/*      */         //   89: checkcast androidx/compose/runtime/collection/ScatterSetWrapper
/*      */         //   92: invokevirtual getSet$runtime : ()Landroidx/collection/ScatterSet;
/*      */         //   95: astore #12
/*      */         //   97: iconst_0
/*      */         //   98: istore #13
/*      */         //   100: nop
/*      */         //   101: aload #12
/*      */         //   103: getfield elements : [Ljava/lang/Object;
/*      */         //   106: astore #14
/*      */         //   108: aload #12
/*      */         //   110: astore #15
/*      */         //   112: iconst_0
/*      */         //   113: istore #16
/*      */         //   115: nop
/*      */         //   116: aload #15
/*      */         //   118: getfield metadata : [J
/*      */         //   121: astore #17
/*      */         //   123: aload #17
/*      */         //   125: arraylength
/*      */         //   126: iconst_2
/*      */         //   127: isub
/*      */         //   128: istore #18
/*      */         //   130: iconst_0
/*      */         //   131: istore #19
/*      */         //   133: iload #19
/*      */         //   135: iload #18
/*      */         //   137: if_icmpgt -> 335
/*      */         //   140: aload #17
/*      */         //   142: iload #19
/*      */         //   144: laload
/*      */         //   145: lstore #20
/*      */         //   147: lload #20
/*      */         //   149: lstore #22
/*      */         //   151: iconst_0
/*      */         //   152: istore #24
/*      */         //   154: lload #22
/*      */         //   156: lload #22
/*      */         //   158: ldc2_w -1
/*      */         //   161: lxor
/*      */         //   162: bipush #7
/*      */         //   164: lshl
/*      */         //   165: land
/*      */         //   166: ldc2_w -9187201950435737472
/*      */         //   169: land
/*      */         //   170: ldc2_w -9187201950435737472
/*      */         //   173: lcmp
/*      */         //   174: ifeq -> 322
/*      */         //   177: bipush #8
/*      */         //   179: iload #19
/*      */         //   181: iload #18
/*      */         //   183: isub
/*      */         //   184: iconst_m1
/*      */         //   185: ixor
/*      */         //   186: bipush #31
/*      */         //   188: iushr
/*      */         //   189: isub
/*      */         //   190: istore #25
/*      */         //   192: iconst_0
/*      */         //   193: istore #26
/*      */         //   195: iload #26
/*      */         //   197: iload #25
/*      */         //   199: if_icmpge -> 315
/*      */         //   202: lload #20
/*      */         //   204: ldc2_w 255
/*      */         //   207: land
/*      */         //   208: lstore #27
/*      */         //   210: iconst_0
/*      */         //   211: istore #29
/*      */         //   213: lload #27
/*      */         //   215: ldc2_w 128
/*      */         //   218: lcmp
/*      */         //   219: ifge -> 226
/*      */         //   222: iconst_1
/*      */         //   223: goto -> 227
/*      */         //   226: iconst_0
/*      */         //   227: ifeq -> 302
/*      */         //   230: iload #19
/*      */         //   232: iconst_3
/*      */         //   233: ishl
/*      */         //   234: iload #26
/*      */         //   236: iadd
/*      */         //   237: istore #24
/*      */         //   239: iload #24
/*      */         //   241: istore #30
/*      */         //   243: iconst_0
/*      */         //   244: istore #31
/*      */         //   246: aload #14
/*      */         //   248: iload #30
/*      */         //   250: aaload
/*      */         //   251: astore #32
/*      */         //   253: iconst_0
/*      */         //   254: istore #33
/*      */         //   256: aload #32
/*      */         //   258: instanceof androidx/compose/runtime/snapshots/StateObjectImpl
/*      */         //   261: ifeq -> 290
/*      */         //   264: aload #32
/*      */         //   266: checkcast androidx/compose/runtime/snapshots/StateObjectImpl
/*      */         //   269: getstatic androidx/compose/runtime/snapshots/ReaderKind.Companion : Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
/*      */         //   272: astore #34
/*      */         //   274: iconst_0
/*      */         //   275: istore #35
/*      */         //   277: iconst_1
/*      */         //   278: invokestatic constructor-impl : (I)I
/*      */         //   281: invokevirtual isReadIn-h_f27i8$runtime : (I)Z
/*      */         //   284: ifne -> 290
/*      */         //   287: goto -> 299
/*      */         //   290: aload #9
/*      */         //   292: aload #32
/*      */         //   294: invokevirtual add : (Ljava/lang/Object;)Z
/*      */         //   297: pop
/*      */         //   298: nop
/*      */         //   299: nop
/*      */         //   300: nop
/*      */         //   301: nop
/*      */         //   302: lload #20
/*      */         //   304: bipush #8
/*      */         //   306: lshr
/*      */         //   307: lstore #20
/*      */         //   309: iinc #26, 1
/*      */         //   312: goto -> 195
/*      */         //   315: iload #25
/*      */         //   317: bipush #8
/*      */         //   319: if_icmpne -> 336
/*      */         //   322: iload #19
/*      */         //   324: iload #18
/*      */         //   326: if_icmpeq -> 335
/*      */         //   329: iinc #19, 1
/*      */         //   332: goto -> 140
/*      */         //   335: nop
/*      */         //   336: nop
/*      */         //   337: goto -> 433
/*      */         //   340: aload #10
/*      */         //   342: checkcast java/lang/Iterable
/*      */         //   345: astore #12
/*      */         //   347: iconst_0
/*      */         //   348: istore #13
/*      */         //   350: aload #12
/*      */         //   352: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */         //   357: astore #14
/*      */         //   359: aload #14
/*      */         //   361: invokeinterface hasNext : ()Z
/*      */         //   366: ifeq -> 432
/*      */         //   369: aload #14
/*      */         //   371: invokeinterface next : ()Ljava/lang/Object;
/*      */         //   376: astore #15
/*      */         //   378: aload #15
/*      */         //   380: astore #32
/*      */         //   382: iconst_0
/*      */         //   383: istore #33
/*      */         //   385: aload #32
/*      */         //   387: instanceof androidx/compose/runtime/snapshots/StateObjectImpl
/*      */         //   390: ifeq -> 419
/*      */         //   393: aload #32
/*      */         //   395: checkcast androidx/compose/runtime/snapshots/StateObjectImpl
/*      */         //   398: getstatic androidx/compose/runtime/snapshots/ReaderKind.Companion : Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
/*      */         //   401: astore #34
/*      */         //   403: iconst_0
/*      */         //   404: istore #35
/*      */         //   406: iconst_1
/*      */         //   407: invokestatic constructor-impl : (I)I
/*      */         //   410: invokevirtual isReadIn-h_f27i8$runtime : (I)Z
/*      */         //   413: ifne -> 419
/*      */         //   416: goto -> 428
/*      */         //   419: aload #9
/*      */         //   421: aload #32
/*      */         //   423: invokevirtual add : (Ljava/lang/Object;)Z
/*      */         //   426: pop
/*      */         //   427: nop
/*      */         //   428: nop
/*      */         //   429: goto -> 359
/*      */         //   432: nop
/*      */         //   433: nop
/*      */         //   434: aload #5
/*      */         //   436: invokestatic access$deriveStateLocked : (Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/CancellableContinuation;
/*      */         //   439: goto -> 443
/*      */         //   442: aconst_null
/*      */         //   443: nop
/*      */         //   444: astore #36
/*      */         //   446: aload #7
/*      */         //   448: monitorexit
/*      */         //   449: aload #36
/*      */         //   451: goto -> 462
/*      */         //   454: astore #36
/*      */         //   456: aload #7
/*      */         //   458: monitorexit
/*      */         //   459: aload #36
/*      */         //   461: athrow
/*      */         //   462: nop
/*      */         //   463: astore_3
/*      */         //   464: aload_3
/*      */         //   465: ifnull -> 490
/*      */         //   468: aload_3
/*      */         //   469: checkcast kotlin/coroutines/Continuation
/*      */         //   472: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*      */         //   475: pop
/*      */         //   476: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */         //   479: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */         //   482: invokeinterface resumeWith : (Ljava/lang/Object;)V
/*      */         //   487: goto -> 491
/*      */         //   490: nop
/*      */         //   491: return
/*      */         // Line number table:
/*      */         //   Java source line number -> byte code offset
/*      */         //   #1042	-> 12
/*      */         //   #1027	-> 12
/*      */         //   #1647	-> 30
/*      */         //   #1028	-> 41
/*      */         //   #1029	-> 66
/*      */         //   #1030	-> 73
/*      */         //   #1648	-> 79
/*      */         //   #1649	-> 81
/*      */         //   #1650	-> 87
/*      */         //   #1651	-> 100
/*      */         //   #1652	-> 101
/*      */         //   #1654	-> 108
/*      */         //   #1655	-> 115
/*      */         //   #1656	-> 116
/*      */         //   #1657	-> 123
/*      */         //   #1659	-> 130
/*      */         //   #1660	-> 140
/*      */         //   #1661	-> 147
/*      */         //   #1662	-> 154
/*      */         //   #1661	-> 170
/*      */         //   #1663	-> 177
/*      */         //   #1664	-> 192
/*      */         //   #1665	-> 202
/*      */         //   #1666	-> 213
/*      */         //   #1665	-> 227
/*      */         //   #1667	-> 230
/*      */         //   #1668	-> 239
/*      */         //   #1669	-> 246
/*      */         //   #1031	-> 256
/*      */         //   #1032	-> 256
/*      */         //   #1033	-> 264
/*      */         //   #1670	-> 277
/*      */         //   #1033	-> 281
/*      */         //   #1036	-> 287
/*      */         //   #1038	-> 290
/*      */         //   #1039	-> 298
/*      */         //   #1669	-> 299
/*      */         //   #1671	-> 300
/*      */         //   #1668	-> 301
/*      */         //   #1672	-> 302
/*      */         //   #1664	-> 309
/*      */         //   #1674	-> 315
/*      */         //   #1659	-> 322
/*      */         //   #1677	-> 335
/*      */         //   #1678	-> 336
/*      */         //   #1679	-> 340
/*      */         //   #1680	-> 350
/*      */         //   #1031	-> 385
/*      */         //   #1032	-> 385
/*      */         //   #1033	-> 393
/*      */         //   #1670	-> 406
/*      */         //   #1033	-> 410
/*      */         //   #1036	-> 416
/*      */         //   #1038	-> 419
/*      */         //   #1039	-> 427
/*      */         //   #1680	-> 428
/*      */         //   #1681	-> 432
/*      */         //   #1682	-> 433
/*      */         //   #1040	-> 434
/*      */         //   #1041	-> 442
/*      */         //   #1028	-> 443
/*      */         //   #1647	-> 444
/*      */         //   #1647	-> 462
/*      */         //   #1027	-> 463
/*      */         //   #1042	-> 464
/*      */         //   #1027	-> 468
/*      */         //   #1042	-> 476
/*      */         //   #1042	-> 490
/*      */         //   #1043	-> 491
/*      */         // Local variable table:
/*      */         //   start	length	slot	name	descriptor
/*      */         //   277	4	35	$i$f$getComposition-6f8NoZ8	I
/*      */         //   274	7	34	this_$iv	Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
/*      */         //   256	43	33	$i$a$-fastForEach-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1$1	I
/*      */         //   253	46	32	it	Ljava/lang/Object;
/*      */         //   406	4	35	$i$f$getComposition-6f8NoZ8	I
/*      */         //   403	7	34	this_$iv	Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
/*      */         //   385	43	33	$i$a$-fastForEach-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1$1	I
/*      */         //   382	46	32	it	Ljava/lang/Object;
/*      */         //   246	55	31	$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv	I
/*      */         //   243	58	30	index$iv$iv	I
/*      */         //   154	16	24	$i$f$maskEmptyOrDeleted	I
/*      */         //   151	19	22	$this$maskEmptyOrDeleted$iv$iv$iv$iv	J
/*      */         //   213	14	29	$i$f$isFull	I
/*      */         //   210	17	27	value$iv$iv$iv$iv	J
/*      */         //   239	63	24	index$iv$iv$iv	I
/*      */         //   195	120	26	j$iv$iv$iv	I
/*      */         //   192	130	25	bitCount$iv$iv$iv	I
/*      */         //   147	175	20	slot$iv$iv$iv	J
/*      */         //   133	202	19	i$iv$iv$iv	I
/*      */         //   115	221	16	$i$f$forEachIndex	I
/*      */         //   123	213	17	m$iv$iv$iv	[J
/*      */         //   130	206	18	lastIndex$iv$iv$iv	I
/*      */         //   112	224	15	this_$iv$iv$iv	Landroidx/collection/ScatterSet;
/*      */         //   100	237	13	$i$f$forEach	I
/*      */         //   108	229	14	k$iv$iv	[Ljava/lang/Object;
/*      */         //   97	240	12	this_$iv$iv	Landroidx/collection/ScatterSet;
/*      */         //   378	51	15	element$iv$iv	Ljava/lang/Object;
/*      */         //   350	83	13	$i$f$forEach	I
/*      */         //   347	86	12	$this$forEach$iv$iv	Ljava/lang/Iterable;
/*      */         //   79	355	11	$i$f$fastForEach	I
/*      */         //   76	358	10	$this$fastForEach$iv	Ljava/util/Set;
/*      */         //   73	366	9	snapshotInvalidations	Landroidx/collection/MutableScatterSet;
/*      */         //   41	403	8	$i$a$-synchronized-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1	I
/*      */         //   30	433	6	$i$f$synchronized	I
/*      */         //   27	436	4	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */         //   0	492	0	this	Landroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1;
/*      */         //   0	492	1	changed	Ljava/util/Set;
/*      */         // Exception table:
/*      */         //   from	to	target	type
/*      */         //   37	446	454	finally
/*      */         //   454	456	454	finally
/*      */       }
/*      */       
/*      */       Recomposer$recompositionRunner$2$unregisterApplyObserver$1() {
/*      */         super(2);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public final void cancel() {
/*      */     SynchronizedObject lock$iv = this.stateLock;
/*      */     int $i$f$synchronized = 0;
/*      */     synchronized (lock$iv) {
/*      */       int $i$a$-synchronized-Recomposer$cancel$1 = 0;
/*      */       if (((State)this._state.getValue()).compareTo(State.Idle) >= 0)
/*      */         this._state.setValue(State.ShuttingDown); 
/*      */       Unit unit = Unit.INSTANCE;
/*      */     } 
/*      */     Job.DefaultImpls.cancel$default((Job)this.effectJob, null, 1, null);
/*      */   }
/*      */   
/*      */   public final void close() {
/*      */     if (this.effectJob.complete()) {
/*      */       SynchronizedObject lock$iv = this.stateLock;
/*      */       int $i$f$synchronized = 0;
/*      */       synchronized (lock$iv) {
/*      */         int $i$a$-synchronized-Recomposer$close$1 = 0;
/*      */         this.isClosed = true;
/*      */         Unit unit = Unit.INSTANCE;
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Object join(@NotNull Continuation $completion) {
/*      */     if (FlowKt.first((Flow)getCurrentState(), new Recomposer$join$2(null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*      */       return FlowKt.first((Flow)getCurrentState(), new Recomposer$join$2(null), $completion); 
/*      */     FlowKt.first((Flow)getCurrentState(), new Recomposer$join$2(null), $completion);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "Recomposer.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.compose.runtime.Recomposer$join$2")
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"})
/*      */   static final class Recomposer$join$2 extends SuspendLambda implements Function2<State, Continuation<? super Boolean>, Object> {
/*      */     int label;
/*      */     
/*      */     Recomposer$join$2(Continuation $completion) {
/*      */       super(2, $completion);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invokeSuspend(@NotNull Object $result) {
/*      */       Recomposer.State it;
/*      */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */       switch (this.label) {
/*      */         case 0:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           it = (Recomposer.State)this.L$0;
/*      */           return Boxing.boxBoolean((it == Recomposer.State.ShutDown));
/*      */       } 
/*      */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super Recomposer$join$2> $completion) {
/*      */       Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2($completion);
/*      */       recomposer$join$2.L$0 = value;
/*      */       return (Continuation<Unit>)recomposer$join$2;
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invoke(@NotNull Recomposer.State p1, @Nullable Continuation<?> p2) {
/*      */       return ((Recomposer$join$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */   }
/*      */   
/*      */   @ComposableInferredTarget(scheme = "[0[0]]")
/*      */   public void composeInitial$runtime(@NotNull ControlledComposition composition, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
/*      */     Intrinsics.checkNotNullParameter(composition, "composition");
/*      */     Intrinsics.checkNotNullParameter(content, "content");
/*      */     boolean composerWasComposing = composition.isComposing();
/*      */     try {
/*      */       Recomposer recomposer = this;
/*      */       MutableScatterSet<Object> modifiedValues$iv = null;
/*      */       int $i$f$composing = 0;
/*      */       MutableSnapshot snapshot$iv = Snapshot.Companion.takeMutableSnapshot(recomposer.readObserverOf(composition), recomposer.writeObserverOf(composition, modifiedValues$iv));
/*      */     } catch (Exception e) {
/*      */       Recomposer this_$iv;
/*      */       processCompositionError((Exception)this_$iv, composition, true);
/*      */       return;
/*      */     } 
/*      */     if (!composerWasComposing)
/*      */       Snapshot.Companion.notifyObjectsInitialized(); 
/*      */     SynchronizedObject lock$iv = this.stateLock;
/*      */     int $i$f$synchronized = 0;
/*      */     synchronized (lock$iv) {
/*      */       int $i$a$-synchronized-Recomposer$composeInitial$2 = 0;
/*      */       if (((State)this._state.getValue()).compareTo(State.ShuttingDown) > 0 && !getKnownCompositions().contains(composition))
/*      */         addKnownCompositionLocked(composition); 
/*      */       Unit unit = Unit.INSTANCE;
/*      */     } 
/*      */     try {
/*      */       performInitialMovableContentInserts(composition);
/*      */     } catch (Exception e) {
/*      */       processCompositionError(e, composition, true);
/*      */       return;
/*      */     } 
/*      */     try {
/*      */       composition.applyChanges();
/*      */       composition.applyLateChanges();
/*      */     } catch (Exception e) {
/*      */       processCompositionError$default(this, e, null, false, 6, null);
/*      */       return;
/*      */     } 
/*      */     if (!composerWasComposing)
/*      */       Snapshot.Companion.notifyObjectsInitialized(); 
/*      */   }
/*      */   
/*      */   private final void performInitialMovableContentInserts(ControlledComposition composition) {
/*      */     SynchronizedObject lock$iv = this.stateLock;
/*      */     int $i$f$synchronized = 0;
/*      */     synchronized (lock$iv) {
/*      */       int $i$a$-synchronized-Recomposer$performInitialMovableContentInserts$1 = 0;
/*      */       List<MovableContentStateReference> $this$fastAny$iv = this.compositionValuesAwaitingInsert;
/*      */       int $i$f$fastAny = 0;
/*      */       List<MovableContentStateReference> $this$fastForEach$iv$iv = $this$fastAny$iv;
/*      */       int $i$f$fastForEach = 0;
/*      */       int index$iv$iv = 0, i = $this$fastForEach$iv$iv.size();
/*      */       if (index$iv$iv < i);
/*      */       if (!false)
/*      */         return; 
/*      */       Unit unit = Unit.INSTANCE;
/*      */     } 
/*      */     List<MovableContentStateReference> toInsert = new ArrayList();
/*      */     performInitialMovableContentInserts$fillToInsert(toInsert, this, composition);
/*      */     while (!toInsert.isEmpty()) {
/*      */       performInsertValues(toInsert, null);
/*      */       performInitialMovableContentInserts$fillToInsert(toInsert, this, composition);
/*      */     } 
/*      */   }
/*      */   
/*      */   private final ControlledComposition performRecompose(ControlledComposition composition, MutableScatterSet<Object> modifiedValues) {
/*      */     if (!composition.isComposing() && !composition.isDisposed())
/*      */       if (!((this.compositionsRemoved != null) ? ((this.compositionsRemoved.contains(composition) == true) ? 1 : 0) : 0)) {
/*      */         Recomposer this_$iv = this;
/*      */         int $i$f$composing = 0;
/*      */         MutableSnapshot snapshot$iv = Snapshot.Companion.takeMutableSnapshot(this_$iv.readObserverOf(composition), this_$iv.writeObserverOf(composition, modifiedValues));
/*      */         try {
/*      */           Snapshot this_$iv$iv = (Snapshot)snapshot$iv;
/*      */           int $i$f$enter = 0;
/*      */           Snapshot previous$iv$iv = this_$iv$iv.makeCurrent();
/*      */           try {
/*      */             int $i$a$-composing-Recomposer$performRecompose$1 = 0;
/*      */             if ((modifiedValues != null) ? ((modifiedValues.isNotEmpty() == true)) : false)
/*      */               composition.prepareCompose(new Recomposer$performRecompose$1$1(modifiedValues, composition)); 
/*      */             boolean bool1 = composition.recompose();
/*      */           } finally {
/*      */             this_$iv$iv.restoreCurrent(previous$iv$iv);
/*      */           } 
/*      */           boolean bool = bool1;
/*      */           this_$iv.applyAndCheck(snapshot$iv);
/*      */         } finally {
/*      */           this_$iv.applyAndCheck(snapshot$iv);
/*      */         } 
/*      */       }  
/*      */     return null;
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*      */   @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$performRecompose$1$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1646:1\n267#2,4:1647\n237#2,7:1651\n248#2,3:1659\n251#2,2:1663\n272#2,2:1665\n254#2,6:1667\n274#2:1673\n1810#3:1658\n1672#3:1662\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$performRecompose$1$1\n*L\n1203#1:1647,4\n1203#1:1651,7\n1203#1:1659,3\n1203#1:1663,2\n1203#1:1665,2\n1203#1:1667,6\n1203#1:1673\n1203#1:1658\n1203#1:1662\n*E\n"})
/*      */   static final class Recomposer$performRecompose$1$1 extends Lambda implements Function0<Unit> {
/*      */     public final void invoke() {
/*      */       ScatterSet scatterSet1 = (ScatterSet)this.$modifiedValues;
/*      */       ControlledComposition controlledComposition = this.$composition;
/*      */       int $i$f$forEach = 0;
/*      */       Object[] k$iv = scatterSet1.elements;
/*      */       ScatterSet this_$iv$iv = scatterSet1;
/*      */       int $i$f$forEachIndex = 0;
/*      */       long[] m$iv$iv = this_$iv$iv.metadata;
/*      */       int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */       int i$iv$iv = 0;
/*      */       if (i$iv$iv <= lastIndex$iv$iv) {
/*      */         while (true) {
/*      */           long slot$iv$iv = m$iv$iv[i$iv$iv];
/*      */           long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
/*      */           int $i$f$maskEmptyOrDeleted = 0;
/*      */           if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/*      */             int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/*      */             for (int j$iv$iv = 0;; j$iv$iv++);
/*      */             if (bitCount$iv$iv == 8)
/*      */               continue; 
/*      */             break;
/*      */           } 
/*      */           continue;
/*      */           if (i$iv$iv != lastIndex$iv$iv) {
/*      */             i$iv$iv++;
/*      */             continue;
/*      */           } 
/*      */           // Byte code: goto -> 213
/*      */         } 
/*      */       } else {
/*      */       
/*      */       } 
/*      */     }
/*      */     
/*      */     Recomposer$performRecompose$1$1(MutableScatterSet<Object> $modifiedValues, ControlledComposition $composition) {
/*      */       super(0);
/*      */     }
/*      */   }
/*      */   
/*      */   private final List<ControlledComposition> performInsertValues(List references, MutableScatterSet<Object> modifiedValues) {
/*      */     List $this$fastGroupBy$iv = references;
/*      */     int $i$f$fastGroupBy = 0;
/*      */     HashMap<Object, Object> destination$iv = new HashMap<>($this$fastGroupBy$iv.size());
/*      */     List $this$fastForEach$iv$iv = $this$fastGroupBy$iv;
/*      */     int $i$f$fastForEach = 0;
/*      */     int index$iv$iv = 0, i = $this$fastForEach$iv$iv.size();
/*      */     if (index$iv$iv < i) {
/*      */       Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/*      */       Object it$iv = item$iv$iv;
/*      */       int $i$a$-fastForEach-ListUtilsKt$fastGroupBy$2$iv = 0;
/*      */       MovableContentStateReference it = (MovableContentStateReference)it$iv;
/*      */       int $i$a$-fastGroupBy-Recomposer$performInsertValues$tasks$1 = 0;
/*      */       Object key$iv = it.getComposition$runtime();
/*      */       Map<Object, Object> $this$getOrPut$iv$iv = destination$iv;
/*      */       int $i$f$getOrPut = 0;
/*      */       Object value$iv$iv = $this$getOrPut$iv$iv.get(key$iv);
/*      */     } 
/*      */     Map<Object, Object> tasks = destination$iv;
/*      */     for (Map.Entry<Object, Object> entry : tasks.entrySet()) {
/*      */       ControlledComposition composition = (ControlledComposition)entry.getKey();
/*      */       List refs = (List)entry.getValue();
/*      */       ComposerKt.runtimeCheck(!composition.isComposing());
/*      */       Recomposer this_$iv = this;
/*      */       int $i$f$composing = 0;
/*      */       MutableSnapshot snapshot$iv = Snapshot.Companion.takeMutableSnapshot(this_$iv.readObserverOf(composition), this_$iv.writeObserverOf(composition, modifiedValues));
/*      */       try {
/*      */         Snapshot this_$iv$iv = (Snapshot)snapshot$iv;
/*      */         int $i$f$enter = 0;
/*      */         Snapshot previous$iv$iv = this_$iv$iv.makeCurrent();
/*      */       } finally {
/*      */         this_$iv.applyAndCheck(snapshot$iv);
/*      */       } 
/*      */       continue;
/*      */       lock$iv = this.stateLock;
/*      */       $i$f$synchronized = 0;
/*      */       synchronizedObject1 = lock$iv;
/*      */       /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */
/*      */     } 
/*      */     return CollectionsKt.toList(tasks.keySet());
/*      */   }
/*      */   
/*      */   private final void discardUnusedValues() {
/*      */     SynchronizedObject lock$iv = this.stateLock;
/*      */     int $i$f$synchronized = 0;
/*      */     synchronized (lock$iv) {
/*      */       ArrayList<Pair> target$iv;
/*      */       List $this$fastForEach$iv$iv;
/*      */       int index$iv$iv, i, $i$a$-synchronized-Recomposer$discardUnusedValues$unusedValues$1 = 0;
/*      */       if (!this.compositionValuesRemoved.isEmpty()) {
/*      */         List references = CollectionsKt.flatten(this.compositionValuesRemoved.values());
/*      */         this.compositionValuesRemoved.clear();
/*      */         List $this$fastMap$iv = references;
/*      */         int $i$f$fastMap = 0;
/*      */         target$iv = new ArrayList($this$fastMap$iv.size());
/*      */         $this$fastForEach$iv$iv = $this$fastMap$iv;
/*      */         int $i$f$fastForEach = 0;
/*      */         index$iv$iv = 0;
/*      */         i = $this$fastForEach$iv$iv.size();
/*      */       } else {
/*      */         List list = CollectionsKt.emptyList();
/*      */       } 
/*      */       if (index$iv$iv < i) {
/*      */         Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/*      */         Object it$iv = item$iv$iv;
/*      */         int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0;
/*      */         MovableContentStateReference movableContentStateReference = (MovableContentStateReference)it$iv;
/*      */         ArrayList<Pair> arrayList = target$iv;
/*      */         int $i$a$-fastMap-Recomposer$discardUnusedValues$unusedValues$1$unusedValues$1 = 0;
/*      */         arrayList.add(TuplesKt.to(movableContentStateReference, this.compositionValueStatesAvailable.get(movableContentStateReference)));
/*      */       } 
/*      */       List<Pair> unusedValues = target$iv;
/*      */       this.compositionValueStatesAvailable.clear();
/*      */     } 
/*      */   }
/*      */   
/*      */   private final Function1<Object, Unit> readObserverOf(ControlledComposition composition) {
/*      */     return new Recomposer$readObserverOf$1(composition);
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\000\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "value", "", "invoke"})
/*      */   static final class Recomposer$readObserverOf$1 extends Lambda implements Function1<Object, Unit> {
/*      */     Recomposer$readObserverOf$1(ControlledComposition $composition) {
/*      */       super(1);
/*      */     }
/*      */     
/*      */     public final void invoke(@NotNull Object value) {
/*      */       Intrinsics.checkNotNullParameter(value, "value");
/*      */       this.$composition.recordReadOf(value);
/*      */     }
/*      */   }
/*      */   
/*      */   private final Function1<Object, Unit> writeObserverOf(ControlledComposition composition, MutableScatterSet<Object> modifiedValues) {
/*      */     return new Recomposer$writeObserverOf$1(composition, modifiedValues);
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\000\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "value", "", "invoke"})
/*      */   static final class Recomposer$writeObserverOf$1 extends Lambda implements Function1<Object, Unit> {
/*      */     public final void invoke(@NotNull Object value) {
/*      */       Intrinsics.checkNotNullParameter(value, "value");
/*      */       this.$composition.recordWriteOf(value);
/*      */       if (this.$modifiedValues != null) {
/*      */         this.$modifiedValues.add(value);
/*      */       } else {
/*      */       
/*      */       } 
/*      */     }
/*      */     
/*      */     Recomposer$writeObserverOf$1(ControlledComposition $composition, MutableScatterSet<Object> $modifiedValues) {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   private final <T> T composing(ControlledComposition composition, MutableScatterSet<Object> modifiedValues, Function0 block) {
/*      */     int $i$f$composing = 0;
/*      */     MutableSnapshot snapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, modifiedValues));
/*      */     try {
/*      */       Snapshot this_$iv = (Snapshot)snapshot;
/*      */       int $i$f$enter = 0;
/*      */       Snapshot previous$iv = this_$iv.makeCurrent();
/*      */       try {
/*      */         Object object = block.invoke();
/*      */       } finally {
/*      */         InlineMarker.finallyStart(1);
/*      */         this_$iv.restoreCurrent(previous$iv);
/*      */         InlineMarker.finallyEnd(1);
/*      */       } 
/*      */       return (T)object;
/*      */     } finally {
/*      */       InlineMarker.finallyStart(1);
/*      */       applyAndCheck(snapshot);
/*      */       InlineMarker.finallyEnd(1);
/*      */     } 
/*      */   }
/*      */   
/*      */   private final void applyAndCheck(MutableSnapshot snapshot) {
/*      */     try {
/*      */       SnapshotApplyResult applyResult = snapshot.apply();
/*      */       if (applyResult instanceof SnapshotApplyResult.Failure)
/*      */         throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString()); 
/*      */     } finally {
/*      */       snapshot.dispose();
/*      */     } 
/*      */   }
/*      */   
/*      */   public final boolean getHasPendingWork() {
/*      */     SynchronizedObject lock$iv = this.stateLock;
/*      */     int $i$f$synchronized = 0;
/*      */     synchronized (lock$iv) {
/*      */       int $i$a$-synchronized-Recomposer$hasPendingWork$1 = 0;
/*      */       $i$a$-synchronized-Recomposer$hasPendingWork$1 = (this.snapshotInvalidations.isNotEmpty() || this.compositionInvalidations.isNotEmpty() || this.concurrentCompositionsOutstanding > 0 || (!this.compositionsAwaitingApply.isEmpty()) || getHasBroadcastFrameClockAwaitersLocked()) ? 1 : 0;
/*      */     } 
/*      */     return $i$a$-synchronized-Recomposer$hasPendingWork$1;
/*      */   }
/*      */   
/*      */   private final boolean getHasFrameWorkLocked() {
/*      */     return (this.compositionInvalidations.isNotEmpty() || getHasBroadcastFrameClockAwaitersLocked());
/*      */   }
/*      */   
/*      */   private final boolean getHasConcurrentFrameWorkLocked() {
/*      */     return ((!this.compositionsAwaitingApply.isEmpty()) || getHasBroadcastFrameClockAwaitersLocked());
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Object awaitIdle(@NotNull Continuation $completion) {
/*      */     if (FlowKt.collect(FlowKt.takeWhile((Flow)getCurrentState(), new Recomposer$awaitIdle$2(null)), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*      */       return FlowKt.collect(FlowKt.takeWhile((Flow)getCurrentState(), new Recomposer$awaitIdle$2(null)), $completion); 
/*      */     FlowKt.collect(FlowKt.takeWhile((Flow)getCurrentState(), new Recomposer$awaitIdle$2(null)), $completion);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "Recomposer.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.compose.runtime.Recomposer$awaitIdle$2")
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"})
/*      */   static final class Recomposer$awaitIdle$2 extends SuspendLambda implements Function2<State, Continuation<? super Boolean>, Object> {
/*      */     int label;
/*      */     
/*      */     Recomposer$awaitIdle$2(Continuation $completion) {
/*      */       super(2, $completion);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invokeSuspend(@NotNull Object $result) {
/*      */       Recomposer.State it;
/*      */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */       switch (this.label) {
/*      */         case 0:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           it = (Recomposer.State)this.L$0;
/*      */           return Boxing.boxBoolean((it.compareTo(Recomposer.State.Idle) > 0));
/*      */       } 
/*      */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super Recomposer$awaitIdle$2> $completion) {
/*      */       Recomposer$awaitIdle$2 recomposer$awaitIdle$2 = new Recomposer$awaitIdle$2($completion);
/*      */       recomposer$awaitIdle$2.L$0 = value;
/*      */       return (Continuation<Unit>)recomposer$awaitIdle$2;
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invoke(@NotNull Recomposer.State p1, @Nullable Continuation<?> p2) {
/*      */       return ((Recomposer$awaitIdle$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */   }
/*      */   
/*      */   public final void pauseCompositionFrameClock() {
/*      */     SynchronizedObject lock$iv = this.stateLock;
/*      */     int $i$f$synchronized = 0;
/*      */     synchronized (lock$iv) {
/*      */       int $i$a$-synchronized-Recomposer$pauseCompositionFrameClock$1 = 0;
/*      */       this.frameClockPaused = true;
/*      */       Unit unit = Unit.INSTANCE;
/*      */     } 
/*      */   }
/*      */   
/*      */   public final void resumeCompositionFrameClock() {
/*      */     SynchronizedObject lock$iv = this.stateLock;
/*      */     int $i$f$synchronized = 0;
/*      */     synchronized (lock$iv) {
/*      */       int $i$a$-synchronized-Recomposer$resumeCompositionFrameClock$1 = 0;
/*      */       this.frameClockPaused = false;
/*      */       CancellableContinuation<Unit> cancellableContinuation1 = this.frameClockPaused ? deriveStateLocked() : null;
/*      */     } 
/*      */     CancellableContinuation<Unit> cancellableContinuation = cancellableContinuation1;
/*      */     if (cancellableContinuation != null) {
/*      */       ((Continuation)cancellableContinuation).resumeWith(Result.constructor-impl(Unit.INSTANCE));
/*      */     } else {
/*      */     
/*      */     } 
/*      */   }
/*      */   
/*      */   public int getCompoundHashKey$runtime() {
/*      */     return 1000;
/*      */   }
/*      */   
/*      */   public boolean getCollectingCallByInformation$runtime() {
/*      */     return ((Boolean)_hotReloadEnabled.get()).booleanValue();
/*      */   }
/*      */   
/*      */   public boolean getCollectingParameterInformation$runtime() {
/*      */     return false;
/*      */   }
/*      */   
/*      */   public boolean getCollectingSourceInformation$runtime() {
/*      */     return false;
/*      */   }
/*      */   
/*      */   public void recordInspectionTable$runtime(@NotNull Set table) {
/*      */     Intrinsics.checkNotNullParameter(table, "table");
/*      */   }
/*      */   
/*      */   public void registerComposition$runtime(@NotNull ControlledComposition composition) {
/*      */     Intrinsics.checkNotNullParameter(composition, "composition");
/*      */   }
/*      */   
/*      */   public void unregisterComposition$runtime(@NotNull ControlledComposition composition) {
/*      */     Intrinsics.checkNotNullParameter(composition, "composition");
/*      */     SynchronizedObject lock$iv = this.stateLock;
/*      */     int $i$f$synchronized = 0;
/*      */     synchronized (lock$iv) {
/*      */       int $i$a$-synchronized-Recomposer$unregisterComposition$1 = 0;
/*      */       removeKnownCompositionLocked(composition);
/*      */       MutableVector<ControlledComposition> this_$iv = this.compositionInvalidations;
/*      */       int $i$f$minusAssign = 0;
/*      */       this_$iv.remove(composition);
/*      */       this.compositionsAwaitingApply.remove(composition);
/*      */       Unit unit = Unit.INSTANCE;
/*      */     } 
/*      */   }
/*      */   
/*      */   public void invalidate$runtime(@NotNull ControlledComposition composition) {
/*      */     Intrinsics.checkNotNullParameter(composition, "composition");
/*      */     SynchronizedObject lock$iv = this.stateLock;
/*      */     int $i$f$synchronized = 0;
/*      */     synchronized (lock$iv) {
/*      */       int $i$a$-synchronized-Recomposer$invalidate$1 = 0;
/*      */       MutableVector<ControlledComposition> this_$iv = this.compositionInvalidations;
/*      */       int $i$f$plusAssign = 0;
/*      */       this_$iv.add(composition);
/*      */       CancellableContinuation<Unit> cancellableContinuation1 = !this.compositionInvalidations.contains(composition) ? deriveStateLocked() : null;
/*      */     } 
/*      */     CancellableContinuation<Unit> cancellableContinuation = cancellableContinuation1;
/*      */     if (cancellableContinuation != null) {
/*      */       ((Continuation)cancellableContinuation).resumeWith(Result.constructor-impl(Unit.INSTANCE));
/*      */     } else {
/*      */     
/*      */     } 
/*      */   }
/*      */   
/*      */   public void invalidateScope$runtime(@NotNull RecomposeScopeImpl scope) {
/*      */     Intrinsics.checkNotNullParameter(scope, "scope");
/*      */     SynchronizedObject lock$iv = this.stateLock;
/*      */     int $i$f$synchronized = 0;
/*      */     synchronized (lock$iv) {
/*      */       int $i$a$-synchronized-Recomposer$invalidateScope$1 = 0;
/*      */       this.snapshotInvalidations.add(scope);
/*      */       CancellableContinuation<Unit> cancellableContinuation1 = deriveStateLocked();
/*      */     } 
/*      */     CancellableContinuation<Unit> cancellableContinuation = cancellableContinuation1;
/*      */     if (cancellableContinuation != null) {
/*      */       ((Continuation)cancellableContinuation).resumeWith(Result.constructor-impl(Unit.INSTANCE));
/*      */     } else {
/*      */     
/*      */     } 
/*      */   }
/*      */   
/*      */   public void insertMovableContent$runtime(@NotNull MovableContentStateReference reference) {
/*      */     Intrinsics.checkNotNullParameter(reference, "reference");
/*      */     SynchronizedObject lock$iv = this.stateLock;
/*      */     int $i$f$synchronized = 0;
/*      */     synchronized (lock$iv) {
/*      */       int $i$a$-synchronized-Recomposer$insertMovableContent$1 = 0;
/*      */       this.compositionValuesAwaitingInsert.add(reference);
/*      */       CancellableContinuation<Unit> cancellableContinuation1 = deriveStateLocked();
/*      */     } 
/*      */     CancellableContinuation<Unit> cancellableContinuation = cancellableContinuation1;
/*      */     if (cancellableContinuation != null) {
/*      */       ((Continuation)cancellableContinuation).resumeWith(Result.constructor-impl(Unit.INSTANCE));
/*      */     } else {
/*      */     
/*      */     } 
/*      */   }
/*      */   
/*      */   public void deletedMovableContent$runtime(@NotNull MovableContentStateReference reference) {
/*      */     Intrinsics.checkNotNullParameter(reference, "reference");
/*      */     SynchronizedObject lock$iv = this.stateLock;
/*      */     int $i$f$synchronized = 0;
/*      */     synchronized (lock$iv) {
/*      */       int $i$a$-synchronized-Recomposer$deletedMovableContent$1 = 0;
/*      */       boolean bool = RecomposerKt.addMultiValue(this.compositionValuesRemoved, reference.getContent$runtime(), reference);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void movableContentStateReleased$runtime(@NotNull MovableContentStateReference reference, @NotNull MovableContentState data) {
/*      */     Intrinsics.checkNotNullParameter(reference, "reference");
/*      */     Intrinsics.checkNotNullParameter(data, "data");
/*      */     SynchronizedObject lock$iv = this.stateLock;
/*      */     int $i$f$synchronized = 0;
/*      */     synchronized (lock$iv) {
/*      */       int $i$a$-synchronized-Recomposer$movableContentStateReleased$1 = 0;
/*      */       this.compositionValueStatesAvailable.put(reference, data);
/*      */       Unit unit = Unit.INSTANCE;
/*      */     } 
/*      */   }
/*      */   
/*      */   public void reportRemovedComposition$runtime(@NotNull ControlledComposition composition) {
/*      */     Intrinsics.checkNotNullParameter(composition, "composition");
/*      */     SynchronizedObject lock$iv = this.stateLock;
/*      */     int $i$f$synchronized = 0;
/*      */     synchronized (lock$iv) {
/*      */       int $i$a$-synchronized-Recomposer$reportRemovedComposition$1 = 0;
/*      */       if (this.compositionsRemoved == null) {
/*      */         LinkedHashSet<ControlledComposition> linkedHashSet = new LinkedHashSet();
/*      */         Set<ControlledComposition> it = linkedHashSet;
/*      */         int $i$a$-also-Recomposer$reportRemovedComposition$1$compositionsRemoved$1 = 0;
/*      */         this.compositionsRemoved = it;
/*      */       } 
/*      */       Set<ControlledComposition> compositionsRemoved = linkedHashSet;
/*      */       boolean bool = compositionsRemoved.add(composition);
/*      */     } 
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public MovableContentState movableContentStateResolve$runtime(@NotNull MovableContentStateReference reference) {
/*      */     Intrinsics.checkNotNullParameter(reference, "reference");
/*      */     SynchronizedObject lock$iv = this.stateLock;
/*      */     int $i$f$synchronized = 0;
/*      */     synchronized (lock$iv) {
/*      */       int $i$a$-synchronized-Recomposer$movableContentStateResolve$1 = 0;
/*      */       MovableContentState movableContentState = this.compositionValueStatesAvailable.remove(reference);
/*      */     } 
/*      */     return movableContentState;
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\"\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\004\n\002\020 \n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\013\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\024\020\021\032\0020\0222\n\020\023\032\0060\tR\0020\nH\002J\r\020\024\032\0020\022H\000¢\006\002\b\025J\023\020\026\032\b\022\004\022\0020\0300\027H\000¢\006\002\b\031J\025\020\032\032\0020\0222\006\020\033\032\0020\034H\000¢\006\002\b\035J\025\020\036\032\0020\0222\006\020\037\032\0020\001H\000¢\006\002\b J\024\020!\032\0020\0222\n\020\023\032\0060\tR\0020\nH\002J\r\020\"\032\0020\001H\000¢\006\002\b#J\025\020$\032\0020\0222\006\020%\032\0020\005H\000¢\006\002\b&R\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000R\036\020\006\032\022\022\016\022\f\022\b\022\0060\tR\0020\n0\b0\007X\004¢\006\002\n\000R\035\020\013\032\016\022\n\022\b\022\004\022\0020\0160\r0\f8F¢\006\006\032\004\b\017\020\020¨\006'"}, d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "()V", "_hotReloadEnabled", "Landroidx/compose/runtime/AtomicReference;", "", "_runningRecomposers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", "runningRecomposers", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/compose/runtime/RecomposerInfo;", "getRunningRecomposers", "()Lkotlinx/coroutines/flow/StateFlow;", "addRunning", "", "info", "clearErrors", "clearErrors$runtime", "getCurrentErrors", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors$runtime", "invalidateGroupsWithKey", "key", "", "invalidateGroupsWithKey$runtime", "loadStateAndComposeForHotReload", "token", "loadStateAndComposeForHotReload$runtime", "removeRunning", "saveStateAndDisposeForHotReload", "saveStateAndDisposeForHotReload$runtime", "setHotReloadEnabled", "value", "setHotReloadEnabled$runtime", "runtime"})
/*      */   @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1646:1\n1360#2:1647\n1446#2,5:1648\n1855#2,2:1653\n1855#2,2:1667\n1855#2,2:1669\n1603#2,9:1671\n1855#2:1680\n1856#2:1682\n1612#2:1683\n1603#2,9:1684\n1855#2:1693\n1856#2:1695\n1612#2:1696\n33#3,6:1655\n33#3,6:1661\n1#4:1681\n1#4:1694\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n*L\n1522#1:1647\n1522#1:1648,5\n1530#1:1653,2\n1539#1:1667,2\n1546#1:1669,2\n1560#1:1671,9\n1560#1:1680\n1560#1:1682\n1560#1:1683\n1565#1:1684,9\n1565#1:1693\n1565#1:1695\n1565#1:1696\n1536#1:1655,6\n1537#1:1661,6\n1560#1:1681\n1565#1:1694\n*E\n"})
/*      */   public static final class Companion {
/*      */     private Companion() {}
/*      */     
/*      */     @NotNull
/*      */     public final StateFlow<Set<RecomposerInfo>> getRunningRecomposers() {
/*      */       return (StateFlow<Set<RecomposerInfo>>)Recomposer._runningRecomposers;
/*      */     }
/*      */     
/*      */     public final void setHotReloadEnabled$runtime(boolean value) {
/*      */       Recomposer._hotReloadEnabled.set(Boolean.valueOf(value));
/*      */     }
/*      */     
/*      */     private final void addRunning(Recomposer.RecomposerInfoImpl info) {
/*      */       PersistentSet old;
/*      */       PersistentSet new;
/*      */       do {
/*      */         old = (PersistentSet)Recomposer._runningRecomposers.getValue();
/*      */         new = old.add(info);
/*      */       } while (old != new && !Recomposer._runningRecomposers.compareAndSet(old, new));
/*      */     }
/*      */     
/*      */     private final void removeRunning(Recomposer.RecomposerInfoImpl info) {
/*      */       PersistentSet old;
/*      */       PersistentSet new;
/*      */       do {
/*      */         old = (PersistentSet)Recomposer._runningRecomposers.getValue();
/*      */         new = old.remove(info);
/*      */       } while (old != new && !Recomposer._runningRecomposers.compareAndSet(old, new));
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final Object saveStateAndDisposeForHotReload$runtime() {
/*      */       Recomposer._hotReloadEnabled.set(Boolean.valueOf(true));
/*      */       Iterable $this$flatMap$iv = (Iterable)Recomposer._runningRecomposers.getValue();
/*      */       int $i$f$flatMap = 0;
/*      */       Iterable iterable1 = $this$flatMap$iv;
/*      */       Collection destination$iv$iv = new ArrayList();
/*      */       int $i$f$flatMapTo = 0;
/*      */       for (Object element$iv$iv : iterable1) {
/*      */         Recomposer.RecomposerInfoImpl it = (Recomposer.RecomposerInfoImpl)element$iv$iv;
/*      */         int $i$a$-flatMap-Recomposer$Companion$saveStateAndDisposeForHotReload$1 = 0;
/*      */         Iterable<Recomposer.HotReloadable> list$iv$iv = it.saveStateAndDisposeForHotReload();
/*      */         CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*      */       } 
/*      */       return destination$iv$iv;
/*      */     }
/*      */     
/*      */     public final void loadStateAndComposeForHotReload$runtime(@NotNull Object token) {
/*      */       Intrinsics.checkNotNullParameter(token, "token");
/*      */       Recomposer._hotReloadEnabled.set(Boolean.valueOf(true));
/*      */       Iterable $this$forEach$iv = (Iterable)Recomposer._runningRecomposers.getValue();
/*      */       int $i$f$forEach = 0;
/*      */       Iterator iterator1 = $this$forEach$iv.iterator();
/*      */       if (iterator1.hasNext()) {
/*      */         Object element$iv = iterator1.next();
/*      */         Recomposer.RecomposerInfoImpl it = (Recomposer.RecomposerInfoImpl)element$iv;
/*      */         int $i$a$-forEach-Recomposer$Companion$loadStateAndComposeForHotReload$1 = 0;
/*      */         it.resetErrorState();
/*      */       } 
/*      */       List holders = (List)token;
/*      */       List $this$fastForEach$iv = holders;
/*      */       int $i$f$fastForEach = 0;
/*      */       int index$iv = 0, j = $this$fastForEach$iv.size();
/*      */       if (index$iv < j) {
/*      */         Object item$iv = $this$fastForEach$iv.get(index$iv);
/*      */         Recomposer.HotReloadable it = (Recomposer.HotReloadable)item$iv;
/*      */         int $i$a$-fastForEach-Recomposer$Companion$loadStateAndComposeForHotReload$2 = 0;
/*      */         it.resetContent();
/*      */       } 
/*      */       $this$fastForEach$iv = holders;
/*      */       $i$f$fastForEach = 0;
/*      */       index$iv = 0;
/*      */       j = $this$fastForEach$iv.size();
/*      */       if (index$iv < j) {
/*      */         Object item$iv = $this$fastForEach$iv.get(index$iv);
/*      */         Recomposer.HotReloadable it = (Recomposer.HotReloadable)item$iv;
/*      */         int $i$a$-fastForEach-Recomposer$Companion$loadStateAndComposeForHotReload$3 = 0;
/*      */         it.recompose();
/*      */       } 
/*      */       Iterable iterable1 = (Iterable)Recomposer._runningRecomposers.getValue();
/*      */       int i = 0;
/*      */       Iterator iterator2 = iterable1.iterator();
/*      */       if (iterator2.hasNext()) {
/*      */         Object element$iv = iterator2.next();
/*      */         Recomposer.RecomposerInfoImpl it = (Recomposer.RecomposerInfoImpl)element$iv;
/*      */         int $i$a$-forEach-Recomposer$Companion$loadStateAndComposeForHotReload$4 = 0;
/*      */         it.retryFailedCompositions();
/*      */       } 
/*      */     }
/*      */     
/*      */     public final void invalidateGroupsWithKey$runtime(int key) {
/*      */       Recomposer._hotReloadEnabled.set(Boolean.valueOf(true));
/*      */       Iterable $this$forEach$iv = (Iterable)Recomposer._runningRecomposers.getValue();
/*      */       int $i$f$forEach = 0;
/*      */       Iterator iterator = $this$forEach$iv.iterator();
/*      */       if (iterator.hasNext()) {
/*      */         Object element$iv = iterator.next();
/*      */         Recomposer.RecomposerInfoImpl it = (Recomposer.RecomposerInfoImpl)element$iv;
/*      */         int $i$a$-forEach-Recomposer$Companion$invalidateGroupsWithKey$1 = 0;
/*      */         it.getCurrentError();
/*      */       } 
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final List<RecomposerErrorInfo> getCurrentErrors$runtime() {
/*      */       Iterable $this$mapNotNull$iv = (Iterable)Recomposer._runningRecomposers.getValue();
/*      */       int $i$f$mapNotNull = 0;
/*      */       Iterable iterable1 = $this$mapNotNull$iv;
/*      */       Collection destination$iv$iv = new ArrayList();
/*      */       int $i$f$mapNotNullTo = 0;
/*      */       Iterable $this$forEach$iv$iv$iv = iterable1;
/*      */       int $i$f$forEach = 0;
/*      */       Iterator iterator = $this$forEach$iv$iv$iv.iterator();
/*      */       if (iterator.hasNext()) {
/*      */         Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv;
/*      */         int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0;
/*      */         Recomposer.RecomposerInfoImpl it = (Recomposer.RecomposerInfoImpl)element$iv$iv;
/*      */         int $i$a$-mapNotNull-Recomposer$Companion$getCurrentErrors$1 = 0;
/*      */       } 
/*      */       return (List<RecomposerErrorInfo>)destination$iv$iv;
/*      */     }
/*      */     
/*      */     public final void clearErrors$runtime() {
/*      */       Iterable $this$mapNotNull$iv = (Iterable)Recomposer._runningRecomposers.getValue();
/*      */       int $i$f$mapNotNull = 0;
/*      */       Iterable iterable1 = $this$mapNotNull$iv;
/*      */       Collection destination$iv$iv = new ArrayList();
/*      */       int $i$f$mapNotNullTo = 0;
/*      */       Iterable $this$forEach$iv$iv$iv = iterable1;
/*      */       int $i$f$forEach = 0;
/*      */       Iterator iterator = $this$forEach$iv$iv$iv.iterator();
/*      */       if (iterator.hasNext()) {
/*      */         Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv;
/*      */         int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0;
/*      */         Recomposer.RecomposerInfoImpl it = (Recomposer.RecomposerInfoImpl)element$iv$iv;
/*      */         int $i$a$-mapNotNull-Recomposer$Companion$clearErrors$1 = 0;
/*      */       } 
/*      */       (List)destination$iv$iv;
/*      */     }
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public static final Companion Companion = new Companion(null);
/*      */   public static final int $stable = 8;
/*      */   @NotNull
/*      */   private static final MutableStateFlow<PersistentSet<RecomposerInfoImpl>> _runningRecomposers = StateFlowKt.MutableStateFlow(ExtensionsKt.persistentSetOf());
/*      */   @NotNull
/*      */   private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(Boolean.valueOf(false));
/*      */   private long changeCount;
/*      */   @Nullable
/*      */   private Job runnerJob;
/*      */   @Nullable
/*      */   private Throwable closeCause;
/*      */   @Nullable
/*      */   private List<? extends ControlledComposition> _knownCompositionsCache;
/*      */   @NotNull
/*      */   private final MutableVector<ControlledComposition> compositionInvalidations;
/*      */   @NotNull
/*      */   private final List<ControlledComposition> compositionsAwaitingApply;
/*      */   @NotNull
/*      */   private final List<MovableContentStateReference> compositionValuesAwaitingInsert;
/*      */   @NotNull
/*      */   private final Map<MovableContent<Object>, List<MovableContentStateReference>> compositionValuesRemoved;
/*      */   @NotNull
/*      */   private final Map<MovableContentStateReference, MovableContentState> compositionValueStatesAvailable;
/*      */   @Nullable
/*      */   private List<ControlledComposition> failedCompositions;
/*      */   @Nullable
/*      */   private Set<ControlledComposition> compositionsRemoved;
/*      */   @Nullable
/*      */   private CancellableContinuation<? super Unit> workContinuation;
/*      */   private int concurrentCompositionsOutstanding;
/*      */   private boolean isClosed;
/*      */   @Nullable
/*      */   private RecomposerErrorState errorState;
/*      */   private boolean frameClockPaused;
/*      */   @NotNull
/*      */   private final MutableStateFlow<State> _state;
/*      */   @NotNull
/*      */   private final CompletableJob effectJob;
/*      */   @NotNull
/*      */   private final CoroutineContext effectCoroutineContext;
/*      */   @NotNull
/*      */   private final RecomposerInfoImpl recomposerInfo;
/*      */   
/*      */   @DebugMetadata(f = "Recomposer.kt", l = {921, 928}, i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"}, n = {"this", "parentFrameClock", "frameSignal", "toRecompose", "toApply", "this", "parentFrameClock", "frameSignal", "toRecompose", "toApply"}, m = "runFrameLoop", c = "androidx.compose.runtime.Recomposer")
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*      */   static final class Recomposer$runFrameLoop$1 extends ContinuationImpl {
/*      */     Object L$0;
/*      */     Object L$1;
/*      */     Object L$2;
/*      */     Object L$3;
/*      */     Object L$4;
/*      */     int label;
/*      */     
/*      */     Recomposer$runFrameLoop$1(Continuation $completion) {
/*      */       super($completion);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invokeSuspend(@NotNull Object $result) {
/*      */       this.result = $result;
/*      */       this.label |= Integer.MIN_VALUE;
/*      */       return Recomposer.this.runFrameLoop(null, null, (Continuation)this);
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\Recomposer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */