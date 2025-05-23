/*      */ package androidx.compose.runtime.snapshots;
/*      */ 
/*      */ import androidx.collection.MutableObjectIntMap;
/*      */ import androidx.collection.MutableScatterMap;
/*      */ import androidx.collection.ObjectIntMap;
/*      */ import androidx.collection.ScatterSet;
/*      */ import androidx.compose.runtime.DerivedState;
/*      */ import androidx.compose.runtime.SynchronizedObject;
/*      */ import androidx.compose.runtime.collection.MutableVector;
/*      */ import androidx.compose.runtime.collection.ScopeMap;
/*      */ import java.util.List;
/*      */ import java.util.Set;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.Unit;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000`\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\020\"\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\t\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\027\n\002\020\001\n\002\b\006\b\007\030\0002\0020\001:\0018B.\022'\020\002\032#\022\031\022\027\022\004\022\0020\0050\004¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\0050\003¢\006\002\020\tJ\026\020\036\032\0020\0052\f\020\037\032\b\022\004\022\0020\0010\fH\002J\006\020 \032\0020\005J\016\020 \032\0020\0052\006\020!\032\0020\001J)\020\"\032\0020\0052!\020#\032\035\022\023\022\0210\001¢\006\f\b\006\022\b\b\007\022\004\b\b(!\022\004\022\0020\0250\003J\b\020$\032\0020\025H\002J&\020%\032\0020\021\"\b\b\000\020&*\0020\0012\022\020'\032\016\022\004\022\002H&\022\004\022\0020\0050\003H\002J\035\020(\032\0020\0052\022\020)\032\016\022\004\022\0020\021\022\004\022\0020\0050\003H\bJ\036\020*\032\0020\0052\f\020+\032\b\022\004\022\0020\0010\f2\006\020,\032\0020\rH\007J?\020-\032\0020\005\"\b\b\000\020&*\0020\0012\006\020!\032\002H&2\022\020.\032\016\022\004\022\002H&\022\004\022\0020\0050\0032\f\020)\032\b\022\004\022\0020\0050\004¢\006\002\020/J\020\0200\032\n\022\004\022\0020\001\030\0010\fH\002J\035\0201\032\0020\0052\022\020)\032\016\022\004\022\0020\021\022\004\022\0020\0250\003H\bJ\b\0202\032\00203H\002J\b\0204\032\0020\005H\002J\006\0205\032\0020\005J\006\0206\032\0020\005J\026\0207\032\0020\0052\f\020)\032\b\022\004\022\0020\0050\004H\007R&\020\n\032\032\022\n\022\b\022\004\022\0020\0010\f\022\004\022\0020\r\022\004\022\0020\0050\013X\004¢\006\002\n\000R\020\020\016\032\004\030\0010\017X\016¢\006\002\n\000R\020\020\020\032\004\030\0010\021X\016¢\006\002\n\000R\016\020\022\032\0020\023X\016¢\006\002\n\000R\016\020\024\032\0020\025X\016¢\006\002\n\000R\024\020\026\032\b\022\004\022\0020\0210\027X\004¢\006\002\n\000R\016\020\030\032\0020\031X\004¢\006\002\n\000R/\020\002\032#\022\031\022\027\022\004\022\0020\0050\004¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\0050\003X\004¢\006\002\n\000R\026\020\032\032\n\022\006\022\004\030\0010\0010\033X\004¢\006\002\n\000R\032\020\034\032\016\022\004\022\0020\001\022\004\022\0020\0050\003X\004¢\006\002\n\000R\016\020\035\032\0020\025X\016¢\006\002\n\000¨\0069"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "onChangedExecutor", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "(Lkotlin/jvm/functions/Function1;)V", "applyObserver", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "currentMap", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "currentMapThreadId", "", "isPaused", "", "observedScopeMaps", "Landroidx/compose/runtime/collection/MutableVector;", "observedScopeMapsLock", "Landroidx/compose/runtime/SynchronizedObject;", "pendingChanges", "Landroidx/compose/runtime/AtomicReference;", "readObserver", "sendingNotifications", "addChanges", "set", "clear", "scope", "clearIf", "predicate", "drainChanges", "ensureMap", "T", "onChanged", "forEachScopeMap", "block", "notifyChanges", "changes", "snapshot", "observeReads", "onValueChangedForScope", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "removeChanges", "removeScopeMapIf", "report", "", "sendNotifications", "start", "stop", "withNoObservations", "ObservedScopeMap", "runtime"})
/*      */ @StabilityInferred(parameters = 0)
/*      */ @SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,657:1\n187#1:662\n188#1:664\n189#1,2:676\n193#1:714\n194#1:716\n195#1,2:732\n193#1:734\n194#1:736\n195#1,2:752\n187#1:754\n188#1:756\n189#1,2:768\n1208#2:658\n1187#2,2:659\n26#3:661\n26#3:663\n26#3:678\n26#3:690\n26#3:706\n26#3:715\n26#3:735\n26#3:755\n460#4,11:665\n460#4,11:679\n838#4,15:691\n838#4,15:717\n838#4,15:737\n460#4,11:757\n366#4,12:770\n728#4,2:782\n33#5,7:707\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n*L\n71#1:662\n71#1:664\n71#1:676,2\n295#1:714\n295#1:716\n295#1:732,2\n306#1:734\n306#1:736\n306#1:752,2\n339#1:754\n339#1:756\n339#1:768,2\n179#1:658\n179#1:659,2\n65#1:661\n71#1:663\n187#1:678\n193#1:690\n237#1:706\n295#1:715\n306#1:735\n339#1:755\n71#1:665,11\n188#1:679,11\n194#1:691,15\n295#1:717,15\n306#1:737,15\n339#1:757,11\n352#1:770,12\n355#1:782,2\n246#1:707,7\n*E\n"})
/*      */ public final class SnapshotStateObserver {
/*      */   @NotNull
/*      */   private final Function1<Function0<Unit>, Unit> onChangedExecutor;
/*      */   @NotNull
/*      */   private final AtomicReference<Object> pendingChanges;
/*      */   private boolean sendingNotifications;
/*      */   @NotNull
/*      */   private final Function2<Set<? extends Object>, Snapshot, Unit> applyObserver;
/*      */   @NotNull
/*      */   private final Function1<Object, Unit> readObserver;
/*      */   @NotNull
/*      */   private final MutableVector<ObservedScopeMap> observedScopeMaps;
/*      */   @NotNull
/*      */   private final SynchronizedObject observedScopeMapsLock;
/*      */   @Nullable
/*      */   private ObserverHandle applyUnsubscribe;
/*      */   private boolean isPaused;
/*      */   @Nullable
/*      */   private ObservedScopeMap currentMap;
/*      */   private long currentMapThreadId;
/*      */   public static final int $stable = 8;
/*      */   
/*   45 */   public SnapshotStateObserver(@NotNull Function1<Function0<Unit>, Unit> onChangedExecutor) { this.onChangedExecutor = onChangedExecutor;
/*   46 */     this.pendingChanges = new AtomicReference(null);
/*      */ 
/*      */     
/*   49 */     this.applyObserver = new SnapshotStateObserver$applyObserver$1();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  166 */     this.readObserver = new SnapshotStateObserver$readObserver$1();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  179 */     int $i$f$mutableVectorOf = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  659 */     int capacity$iv$iv = 16, $i$f$MutableVector = 0;
/*  660 */     this.observedScopeMaps = new MutableVector((Object[])new ObservedScopeMap[capacity$iv$iv], 0); this.observedScopeMapsLock = new SynchronizedObject(); this.currentMapThreadId = -1L; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\030\n\000\n\002\020\002\n\000\n\002\020\"\n\002\020\000\n\000\n\002\030\002\n\000\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\n¢\006\002\b\007"}, d2 = {"<anonymous>", "", "applied", "", "", "<anonymous parameter 1>", "Landroidx/compose/runtime/snapshots/Snapshot;", "invoke"}) static final class SnapshotStateObserver$applyObserver$1 extends Lambda implements Function2<Set<? extends Object>, Snapshot, Unit> {
/*  661 */     public final void invoke(@NotNull Set applied, @NotNull Snapshot param1Snapshot) { Intrinsics.checkNotNullParameter(applied, "applied"); Intrinsics.checkNotNullParameter(param1Snapshot, "<anonymous parameter 1>"); SnapshotStateObserver.this.addChanges(applied); if (SnapshotStateObserver.this.drainChanges()) SnapshotStateObserver.this.sendNotifications();  } SnapshotStateObserver$applyObserver$1() { super(2); } } private final boolean drainChanges() { Set<Object> notifications; SynchronizedObject lock$iv = this.observedScopeMapsLock; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-SnapshotStateObserver$drainChanges$1 = 0; boolean bool = this.sendingNotifications; }  if (bool)
/*  662 */       return false;  boolean hasValues = false; if (removeChanges() == null) { removeChanges(); return hasValues; }  SnapshotStateObserver this_$iv = this; int $i$f$forEachScopeMap = 0; SynchronizedObject lock$iv$iv = this_$iv.observedScopeMapsLock; int i = 0;
/*  663 */     synchronized (lock$iv$iv) { int $i$a$-synchronized-SnapshotStateObserver$forEachScopeMap$1$iv = 0;
/*  664 */       MutableVector<ObservedScopeMap> this_$iv$iv = this_$iv.observedScopeMaps; int $i$f$forEach = 0;
/*      */       
/*  666 */       int size$iv$iv = this_$iv$iv.getSize();
/*  667 */       if (size$iv$iv > 0) {
/*  668 */         int i$iv$iv = 0;
/*  669 */         Object[] content$iv$iv = this_$iv$iv.getContent();
/*      */         do {
/*  671 */           ObservedScopeMap scopeMap = (ObservedScopeMap)content$iv$iv[i$iv$iv]; int $i$a$-forEachScopeMap-SnapshotStateObserver$drainChanges$2 = 0; hasValues = (scopeMap.recordInvalidation(notifications) || hasValues);
/*  672 */           ++i$iv$iv;
/*  673 */         } while (i$iv$iv < size$iv$iv);
/*      */       } 
/*      */       
/*  676 */       Unit unit = Unit.INSTANCE; }  }
/*      */   private final void sendNotifications() { this.onChangedExecutor.invoke(new SnapshotStateObserver$sendNotifications$1()); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) @SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,657:1\n26#2:658\n460#3,11:659\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n*L\n86#1:658\n90#1:659,11\n*E\n"}) static final class SnapshotStateObserver$sendNotifications$1 extends Lambda implements Function0<Unit> {
/*  678 */     public final void invoke() { do { SynchronizedObject synchronizedObject = SnapshotStateObserver.this.observedScopeMapsLock; SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this; int $i$f$synchronized = 0; synchronized (synchronizedObject) { int $i$a$-synchronized-SnapshotStateObserver$sendNotifications$1$1 = 0; if (!snapshotStateObserver.sendingNotifications) { snapshotStateObserver.sendingNotifications = true; try { MutableVector this_$iv = snapshotStateObserver.observedScopeMaps; int $i$f$forEach = 0; int size$iv = this_$iv.getSize(); if (size$iv > 0) { int i$iv = 0; Object[] content$iv = this_$iv.getContent(); do { SnapshotStateObserver.ObservedScopeMap scopeMap = (SnapshotStateObserver.ObservedScopeMap)content$iv[i$iv]; int $i$a$-forEach-SnapshotStateObserver$sendNotifications$1$1$1 = 0; scopeMap.notifyInvalidatedScopes(); ++i$iv; } while (i$iv < size$iv); }  } finally { snapshotStateObserver.sendingNotifications = false; }  }  Unit unit = Unit.INSTANCE; }  } while (SnapshotStateObserver.this.drainChanges()); } SnapshotStateObserver$sendNotifications$1() { super(0); } } private final void addChanges(Set set) { Object old; Collection new; do { old = this.pendingChanges.get(); Object object = old; Set[] arrayOfSet = new Set[2]; arrayOfSet[0] = (Set)old; arrayOfSet[1] = set; if (object instanceof List) {  } else { report(); throw new KotlinNothingValueException(); }  new = (object == null) ? set : ((object instanceof Set) ? CollectionsKt.listOf((Object[])arrayOfSet) : (Collection)"JD-Core does not support Kotlin"); } while (!this.pendingChanges.compareAndSet(old, new)); } private final void forEachScopeMap(Function1 block) { int $i$f$forEachScopeMap = 0; SynchronizedObject lock$iv = this.observedScopeMapsLock; int $i$f$synchronized = 0; SynchronizedObject synchronizedObject1 = lock$iv; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ try { int $i$a$-synchronized-SnapshotStateObserver$forEachScopeMap$1 = 0; MutableVector<ObservedScopeMap> this_$iv = this.observedScopeMaps;
/*      */       int $i$f$forEach = 0;
/*  680 */       int size$iv = this_$iv.getSize();
/*  681 */       if (size$iv > 0)
/*  682 */       { int i$iv = 0;
/*  683 */         Object[] content$iv = this_$iv.getContent();
/*      */         do {
/*  685 */           block.invoke(content$iv[i$iv]);
/*  686 */           ++i$iv;
/*  687 */         } while (i$iv < size$iv); }  Unit unit = Unit.INSTANCE; } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }  }
/*      */   private final Set<Object> removeChanges() { while (true) { Object old = this.pendingChanges.get(); Set<Object> result = null; Object new = null; Object object1 = old; if (object1 == null) return null;  if (object1 instanceof Set) { result = (Set)old; new = null; } else if (object1 instanceof List) { result = ((List<Set>)old).get(0); new = (((List)old).size() == 2) ? ((List)old).get(1) : ((((List)old).size() > 2) ? ((List)old).subList(1, ((List)old).size()) : null); } else { report(); throw new KotlinNothingValueException(); }  if (this.pendingChanges.compareAndSet(old, new)) return result;  }  }
/*      */   private final Void report() { ComposerKt.composeRuntimeError("Unexpected notification"); throw new KotlinNothingValueException(); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\000\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "state", "", "invoke"}) @SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$readObserver$1\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n*L\n1#1,657:1\n26#2:658\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$readObserver$1\n*L\n168#1:658\n*E\n"}) static final class SnapshotStateObserver$readObserver$1 extends Lambda implements Function1<Object, Unit> {
/*  690 */     public final void invoke(@NotNull Object state) { Intrinsics.checkNotNullParameter(state, "state"); if (!SnapshotStateObserver.this.isPaused) { SynchronizedObject synchronizedObject = SnapshotStateObserver.this.observedScopeMapsLock; SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this; int $i$f$synchronized = 0; synchronized (synchronizedObject) { int $i$a$-synchronized-SnapshotStateObserver$readObserver$1$1 = 0; Intrinsics.checkNotNull(snapshotStateObserver.currentMap); snapshotStateObserver.currentMap.recordRead(state); Unit unit = Unit.INSTANCE; }  }  } SnapshotStateObserver$readObserver$1() { super(1); } } private final void removeScopeMapIf(Function1 block) { int $i$f$removeScopeMapIf = 0; SynchronizedObject lock$iv = this.observedScopeMapsLock; int $i$f$synchronized = 0; SynchronizedObject synchronizedObject1 = lock$iv; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ try { int $i$a$-synchronized-SnapshotStateObserver$removeScopeMapIf$1 = 0; MutableVector<ObservedScopeMap> this_$iv = this.observedScopeMaps; int $i$f$removeIf = 0;
/*  691 */       int gap$iv = 0;
/*  692 */       int size$iv = this_$iv.getSize();
/*  693 */       for (int i$iv = 0; i$iv < size$iv; i$iv++) {
/*  694 */         if (((Boolean)block.invoke(this_$iv.getContent()[i$iv])).booleanValue()) {
/*  695 */           gap$iv++;
/*      */ 
/*      */         
/*      */         }
/*  699 */         else if (gap$iv > 0) {
/*  700 */           this_$iv.getContent()[i$iv - gap$iv] = this_$iv.getContent()[i$iv];
/*      */         } 
/*      */       } 
/*  703 */       ArraysKt.fill(this_$iv.getContent(), null, size$iv - gap$iv, size$iv);
/*  704 */       this_$iv.setSize(size$iv - gap$iv); Unit unit = Unit.INSTANCE; }
/*      */     finally
/*      */     { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }
/*      */      } public final <T> void observeReads(@NotNull Object scope, @NotNull Function1 onValueChangedForScope, @NotNull Function0 block) { // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: ldc 'scope'
/*      */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   6: aload_2
/*      */     //   7: ldc 'onValueChangedForScope'
/*      */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   12: aload_3
/*      */     //   13: ldc 'block'
/*      */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   18: aload_0
/*      */     //   19: getfield observedScopeMapsLock : Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   22: astore #5
/*      */     //   24: iconst_0
/*      */     //   25: istore #6
/*      */     //   27: aload #5
/*      */     //   29: astore #7
/*      */     //   31: aload #7
/*      */     //   33: monitorenter
/*      */     //   34: nop
/*      */     //   35: iconst_0
/*      */     //   36: istore #8
/*      */     //   38: aload_0
/*      */     //   39: aload_2
/*      */     //   40: invokespecial ensureMap : (Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;
/*      */     //   43: astore #9
/*      */     //   45: aload #7
/*      */     //   47: monitorexit
/*      */     //   48: aload #9
/*      */     //   50: goto -> 61
/*      */     //   53: astore #9
/*      */     //   55: aload #7
/*      */     //   57: monitorexit
/*      */     //   58: aload #9
/*      */     //   60: athrow
/*      */     //   61: nop
/*      */     //   62: astore #4
/*      */     //   64: aload_0
/*      */     //   65: getfield isPaused : Z
/*      */     //   68: istore #5
/*      */     //   70: aload_0
/*      */     //   71: getfield currentMap : Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;
/*      */     //   74: astore #6
/*      */     //   76: aload_0
/*      */     //   77: getfield currentMapThreadId : J
/*      */     //   80: lstore #7
/*      */     //   82: lload #7
/*      */     //   84: ldc2_w -1
/*      */     //   87: lcmp
/*      */     //   88: ifeq -> 174
/*      */     //   91: lload #7
/*      */     //   93: invokestatic currentThreadId : ()J
/*      */     //   96: lcmp
/*      */     //   97: ifne -> 104
/*      */     //   100: iconst_1
/*      */     //   101: goto -> 105
/*      */     //   104: iconst_0
/*      */     //   105: istore #9
/*      */     //   107: iconst_0
/*      */     //   108: istore #10
/*      */     //   110: nop
/*      */     //   111: iload #9
/*      */     //   113: ifne -> 173
/*      */     //   116: iconst_0
/*      */     //   117: istore #11
/*      */     //   119: new java/lang/StringBuilder
/*      */     //   122: dup
/*      */     //   123: invokespecial <init> : ()V
/*      */     //   126: ldc_w 'Detected multithreaded access to SnapshotStateObserver: previousThreadId='
/*      */     //   129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   132: lload #7
/*      */     //   134: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*      */     //   137: ldc_w '), currentThread={id='
/*      */     //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   143: invokestatic currentThreadId : ()J
/*      */     //   146: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*      */     //   149: ldc_w ', name='
/*      */     //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   155: invokestatic currentThreadName : ()Ljava/lang/String;
/*      */     //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   161: ldc_w '}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.'
/*      */     //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   167: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   170: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*      */     //   173: nop
/*      */     //   174: nop
/*      */     //   175: aload_0
/*      */     //   176: iconst_0
/*      */     //   177: putfield isPaused : Z
/*      */     //   180: aload_0
/*      */     //   181: aload #4
/*      */     //   183: putfield currentMap : Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;
/*      */     //   186: aload_0
/*      */     //   187: invokestatic currentThreadId : ()J
/*      */     //   190: putfield currentMapThreadId : J
/*      */     //   193: aload #4
/*      */     //   195: aload_1
/*      */     //   196: aload_0
/*      */     //   197: getfield readObserver : Lkotlin/jvm/functions/Function1;
/*      */     //   200: aload_3
/*      */     //   201: invokevirtual observe : (Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
/*      */     //   204: aload_0
/*      */     //   205: aload #6
/*      */     //   207: putfield currentMap : Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;
/*      */     //   210: aload_0
/*      */     //   211: iload #5
/*      */     //   213: putfield isPaused : Z
/*      */     //   216: aload_0
/*      */     //   217: lload #7
/*      */     //   219: putfield currentMapThreadId : J
/*      */     //   222: goto -> 248
/*      */     //   225: astore #9
/*      */     //   227: aload_0
/*      */     //   228: aload #6
/*      */     //   230: putfield currentMap : Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;
/*      */     //   233: aload_0
/*      */     //   234: iload #5
/*      */     //   236: putfield isPaused : Z
/*      */     //   239: aload_0
/*      */     //   240: lload #7
/*      */     //   242: putfield currentMapThreadId : J
/*      */     //   245: aload #9
/*      */     //   247: athrow
/*      */     //   248: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #237	-> 18
/*      */     //   #706	-> 27
/*      */     //   #238	-> 38
/*      */     //   #706	-> 43
/*      */     //   #706	-> 61
/*      */     //   #237	-> 62
/*      */     //   #241	-> 64
/*      */     //   #242	-> 70
/*      */     //   #243	-> 76
/*      */     //   #245	-> 82
/*      */     //   #246	-> 91
/*      */     //   #707	-> 110
/*      */     //   #710	-> 111
/*      */     //   #711	-> 116
/*      */     //   #247	-> 119
/*      */     //   #248	-> 132
/*      */     //   #247	-> 134
/*      */     //   #248	-> 137
/*      */     //   #247	-> 140
/*      */     //   #249	-> 143
/*      */     //   #247	-> 146
/*      */     //   #249	-> 149
/*      */     //   #247	-> 152
/*      */     //   #249	-> 155
/*      */     //   #247	-> 158
/*      */     //   #249	-> 161
/*      */     //   #247	-> 164
/*      */     //   #711	-> 170
/*      */     //   #713	-> 173
/*      */     //   #256	-> 174
/*      */     //   #257	-> 175
/*      */     //   #258	-> 180
/*      */     //   #259	-> 186
/*      */     //   #261	-> 193
/*      */     //   #263	-> 204
/*      */     //   #264	-> 210
/*      */     //   #265	-> 216
/*      */     //   #266	-> 222
/*      */     //   #263	-> 225
/*      */     //   #264	-> 233
/*      */     //   #265	-> 239
/*      */     //   #267	-> 248
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   38	5	8	$i$a$-synchronized-SnapshotStateObserver$observeReads$scopeMap$1	I
/*      */     //   27	35	6	$i$f$synchronized	I
/*      */     //   24	38	5	lock$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   119	51	11	$i$a$-requirePrecondition-SnapshotStateObserver$observeReads$1	I
/*      */     //   110	64	10	$i$f$requirePrecondition	I
/*      */     //   107	67	9	value$iv	Z
/*      */     //   64	185	4	scopeMap	Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;
/*      */     //   70	179	5	oldPaused	Z
/*      */     //   76	173	6	oldMap	Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;
/*      */     //   82	167	7	oldThreadId	J
/*      */     //   0	249	0	this	Landroidx/compose/runtime/snapshots/SnapshotStateObserver;
/*      */     //   0	249	1	scope	Ljava/lang/Object;
/*      */     //   0	249	2	onValueChangedForScope	Lkotlin/jvm/functions/Function1;
/*      */     //   0	249	3	block	Lkotlin/jvm/functions/Function0;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   34	45	53	finally
/*      */     //   53	55	53	finally
/*      */     //   174	204	225	finally
/*      */     //   225	227	225	finally }
/*      */   @Deprecated(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @ReplaceWith(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"})) public final void withNoObservations(@NotNull Function0 block) { Intrinsics.checkNotNullParameter(block, "block"); boolean oldPaused = this.isPaused; this.isPaused = true; try {
/*      */       block.invoke();
/*      */     } finally {
/*      */       this.isPaused = oldPaused;
/*      */     }  }
/*      */   public final void clear(@NotNull Object scope) { Intrinsics.checkNotNullParameter(scope, "scope"); SnapshotStateObserver this_$iv = this; int $i$f$removeScopeMapIf = 0;
/*  714 */     SynchronizedObject lock$iv$iv = this_$iv.observedScopeMapsLock; int $i$f$synchronized = 0;
/*  715 */     synchronized (lock$iv$iv) { int $i$a$-synchronized-SnapshotStateObserver$removeScopeMapIf$1$iv = 0;
/*  716 */       MutableVector<ObservedScopeMap> this_$iv$iv = this_$iv.observedScopeMaps; int $i$f$removeIf = 0;
/*  717 */       int gap$iv$iv = 0;
/*  718 */       int size$iv$iv = this_$iv$iv.getSize();
/*  719 */       for (int i$iv$iv = 0; i$iv$iv < size$iv$iv; it.clearScopeObservations(scope)) {
/*  720 */         ObservedScopeMap it = (ObservedScopeMap)this_$iv$iv.getContent()[i$iv$iv]; int $i$a$-removeScopeMapIf-SnapshotStateObserver$clear$1 = 0;
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  729 */       ArraysKt.fill(this_$iv$iv.getContent(), null, size$iv$iv - gap$iv$iv, size$iv$iv);
/*  730 */       this_$iv$iv.setSize(size$iv$iv - gap$iv$iv);
/*      */       
/*  732 */       Unit unit = Unit.INSTANCE; }
/*      */      } public final void clearIf(@NotNull Function1<Object, Boolean> predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); SnapshotStateObserver this_$iv = this; int $i$f$removeScopeMapIf = 0;
/*  734 */     SynchronizedObject lock$iv$iv = this_$iv.observedScopeMapsLock; int $i$f$synchronized = 0;
/*  735 */     synchronized (lock$iv$iv) { int $i$a$-synchronized-SnapshotStateObserver$removeScopeMapIf$1$iv = 0;
/*  736 */       MutableVector<ObservedScopeMap> this_$iv$iv = this_$iv.observedScopeMaps; int $i$f$removeIf = 0;
/*  737 */       int gap$iv$iv = 0;
/*  738 */       int size$iv$iv = this_$iv$iv.getSize();
/*  739 */       for (int i$iv$iv = 0; i$iv$iv < size$iv$iv; scopeMap.removeScopeIf(predicate)) {
/*  740 */         ObservedScopeMap scopeMap = (ObservedScopeMap)this_$iv$iv.getContent()[i$iv$iv]; int $i$a$-removeScopeMapIf-SnapshotStateObserver$clearIf$1 = 0;
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  749 */       ArraysKt.fill(this_$iv$iv.getContent(), null, size$iv$iv - gap$iv$iv, size$iv$iv);
/*  750 */       this_$iv$iv.setSize(size$iv$iv - gap$iv$iv);
/*      */       
/*  752 */       Unit unit = Unit.INSTANCE; }  } public final void start() { this.applyUnsubscribe = Snapshot.Companion.registerApplyObserver(this.applyObserver); } public final void stop() { if (this.applyUnsubscribe != null) { this.applyUnsubscribe.dispose(); } else {  }  }
/*      */   @TestOnly public final void notifyChanges(@NotNull Set changes, @NotNull Snapshot snapshot) { Intrinsics.checkNotNullParameter(changes, "changes"); Intrinsics.checkNotNullParameter(snapshot, "snapshot"); this.applyObserver.invoke(changes, snapshot); }
/*  754 */   public final void clear() { SnapshotStateObserver this_$iv = this; int $i$f$forEachScopeMap = 0; SynchronizedObject lock$iv$iv = this_$iv.observedScopeMapsLock; int $i$f$synchronized = 0;
/*  755 */     synchronized (lock$iv$iv) { int $i$a$-synchronized-SnapshotStateObserver$forEachScopeMap$1$iv = 0;
/*  756 */       MutableVector<ObservedScopeMap> this_$iv$iv = this_$iv.observedScopeMaps; int $i$f$forEach = 0;
/*      */       
/*  758 */       int size$iv$iv = this_$iv$iv.getSize();
/*  759 */       if (size$iv$iv > 0) {
/*  760 */         int i$iv$iv = 0;
/*  761 */         Object[] content$iv$iv = this_$iv$iv.getContent();
/*      */         do {
/*  763 */           ObservedScopeMap scopeMap = (ObservedScopeMap)content$iv$iv[i$iv$iv]; int $i$a$-forEachScopeMap-SnapshotStateObserver$clear$2 = 0; scopeMap.clear();
/*  764 */           ++i$iv$iv;
/*  765 */         } while (i$iv$iv < size$iv$iv);
/*      */       } 
/*      */       
/*  768 */       Unit unit = Unit.INSTANCE; }
/*      */      } private final <T> ObservedScopeMap ensureMap(Function1<Object, Unit> onChanged) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield observedScopeMaps : Landroidx/compose/runtime/collection/MutableVector;
/*      */     //   4: astore_3
/*      */     //   5: iconst_0
/*      */     //   6: istore #4
/*      */     //   8: nop
/*      */     //   9: aload_3
/*      */     //   10: invokevirtual getSize : ()I
/*      */     //   13: istore #5
/*      */     //   15: iload #5
/*      */     //   17: ifle -> 78
/*      */     //   20: iconst_0
/*      */     //   21: istore #6
/*      */     //   23: aload_3
/*      */     //   24: invokevirtual getContent : ()[Ljava/lang/Object;
/*      */     //   27: astore #7
/*      */     //   29: aload #7
/*      */     //   31: iload #6
/*      */     //   33: aaload
/*      */     //   34: astore #8
/*      */     //   36: aload #8
/*      */     //   38: checkcast androidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap
/*      */     //   41: astore #9
/*      */     //   43: iconst_0
/*      */     //   44: istore #10
/*      */     //   46: aload #9
/*      */     //   48: invokevirtual getOnChanged : ()Lkotlin/jvm/functions/Function1;
/*      */     //   51: aload_1
/*      */     //   52: if_acmpne -> 59
/*      */     //   55: iconst_1
/*      */     //   56: goto -> 60
/*      */     //   59: iconst_0
/*      */     //   60: ifeq -> 68
/*      */     //   63: aload #8
/*      */     //   65: goto -> 79
/*      */     //   68: iinc #6, 1
/*      */     //   71: iload #6
/*      */     //   73: iload #5
/*      */     //   75: if_icmplt -> 29
/*      */     //   78: aconst_null
/*      */     //   79: checkcast androidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap
/*      */     //   82: astore_2
/*      */     //   83: aload_2
/*      */     //   84: ifnonnull -> 129
/*      */     //   87: new androidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap
/*      */     //   90: dup
/*      */     //   91: aload_1
/*      */     //   92: ldc_w 'null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>'
/*      */     //   95: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   98: aload_1
/*      */     //   99: iconst_1
/*      */     //   100: invokestatic beforeCheckcastToFunctionOfArity : (Ljava/lang/Object;I)Ljava/lang/Object;
/*      */     //   103: checkcast kotlin/jvm/functions/Function1
/*      */     //   106: invokespecial <init> : (Lkotlin/jvm/functions/Function1;)V
/*      */     //   109: astore_3
/*      */     //   110: aload_0
/*      */     //   111: getfield observedScopeMaps : Landroidx/compose/runtime/collection/MutableVector;
/*      */     //   114: astore #4
/*      */     //   116: iconst_0
/*      */     //   117: istore #5
/*      */     //   119: aload #4
/*      */     //   121: aload_3
/*      */     //   122: invokevirtual add : (Ljava/lang/Object;)Z
/*      */     //   125: pop
/*      */     //   126: nop
/*      */     //   127: aload_3
/*      */     //   128: areturn
/*      */     //   129: aload_2
/*      */     //   130: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #352	-> 0
/*      */     //   #770	-> 8
/*      */     //   #771	-> 9
/*      */     //   #772	-> 15
/*      */     //   #773	-> 20
/*      */     //   #774	-> 23
/*      */     //   #776	-> 29
/*      */     //   #777	-> 36
/*      */     //   #352	-> 46
/*      */     //   #777	-> 60
/*      */     //   #778	-> 68
/*      */     //   #779	-> 71
/*      */     //   #781	-> 78
/*      */     //   #352	-> 79
/*      */     //   #353	-> 83
/*      */     //   #354	-> 87
/*      */     //   #355	-> 110
/*      */     //   #782	-> 119
/*      */     //   #783	-> 126
/*      */     //   #356	-> 127
/*      */     //   #358	-> 129
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   46	14	10	$i$a$-firstOrNull-SnapshotStateObserver$ensureMap$scopeMap$1	I
/*      */     //   43	17	9	it	Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;
/*      */     //   36	35	8	item$iv	Ljava/lang/Object;
/*      */     //   23	55	6	i$iv	I
/*      */     //   29	49	7	content$iv	[Ljava/lang/Object;
/*      */     //   8	71	4	$i$f$firstOrNull	I
/*      */     //   15	64	5	size$iv	I
/*      */     //   5	74	3	this_$iv	Landroidx/compose/runtime/collection/MutableVector;
/*      */     //   119	8	5	$i$f$plusAssign	I
/*      */     //   116	11	4	this_$iv	Landroidx/compose/runtime/collection/MutableVector;
/*      */     //   110	19	3	map	Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;
/*      */     //   83	48	2	scopeMap	Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;
/*      */     //   0	131	0	this	Landroidx/compose/runtime/snapshots/SnapshotStateObserver;
/*      */     //   0	131	1	onChanged	Lkotlin/jvm/functions/Function1; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000v\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\"\n\002\b\006\n\002\030\002\n\002\b\004\b\002\030\0002\0020\001B\031\022\022\020\002\032\016\022\004\022\0020\001\022\004\022\0020\0040\003¢\006\002\020\005J\006\020\037\032\0020\004J\020\020 \032\0020\0042\006\020!\032\0020\001H\002J\016\020\"\032\0020\0042\006\020!\032\0020\001J\006\020#\032\0020$J\006\020%\032\0020\004J0\020&\032\0020\0042\006\020!\032\0020\0012\022\020'\032\016\022\004\022\0020\001\022\004\022\0020\0040\0032\f\020(\032\b\022\004\022\0020\0040)J\024\020*\032\0020$2\f\020+\032\b\022\004\022\0020\0010,J\016\020-\032\0020\0042\006\020.\032\0020\001J.\020-\032\0020\0042\006\020.\032\0020\0012\006\020\t\032\0020\n2\006\020\006\032\0020\0012\f\020/\032\b\022\004\022\0020\0010\bH\002J\030\0200\032\0020\0042\006\020!\032\0020\0012\006\020.\032\0020\001H\002J)\0201\032\0020\0042!\0202\032\035\022\023\022\0210\001¢\006\f\b3\022\b\b4\022\004\b\b(!\022\004\022\0020$0\003J\022\0205\032\0020\0042\n\0206\032\006\022\002\b\0030\rR\020\020\006\032\004\030\0010\001X\016¢\006\002\n\000R\026\020\007\032\n\022\004\022\0020\001\030\0010\bX\016¢\006\002\n\000R\016\020\t\032\0020\nX\016¢\006\002\n\000R\036\020\013\032\022\022\004\022\0020\001\022\b\022\006\022\002\b\0030\r0\fX\004¢\006\002\n\000R\016\020\016\032\0020\nX\016¢\006\002\n\000R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b\021\020\022R\024\020\023\032\b\022\004\022\0020\0010\024X\004¢\006\002\n\000R\035\020\002\032\016\022\004\022\0020\001\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\025\020\026R6\020\027\032*\022\b\022\006\022\002\b\0030\r\022\006\022\004\030\0010\0010\030j\024\022\b\022\006\022\002\b\0030\r\022\006\022\004\030\0010\001`\031X\004¢\006\002\n\000R \020\032\032\024\022\004\022\0020\001\022\n\022\b\022\004\022\0020\0010\b0\033X\004¢\006\002\n\000R\030\020\034\032\f\022\b\022\006\022\002\b\0030\r0\035X\004¢\006\002\n\000R\032\020\036\032\016\022\004\022\0020\001\022\004\022\0020\0010\fX\004¢\006\002\n\000¨\0067"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "onChanged", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "currentScope", "currentScopeReads", "Landroidx/collection/MutableObjectIntMap;", "currentToken", "", "dependencyToDerivedStates", "Landroidx/compose/runtime/collection/ScopeMap;", "Landroidx/compose/runtime/DerivedState;", "deriveStateScopeCount", "derivedStateObserver", "Landroidx/compose/runtime/DerivedStateObserver;", "getDerivedStateObserver", "()Landroidx/compose/runtime/DerivedStateObserver;", "invalidated", "Landroidx/collection/MutableScatterSet;", "getOnChanged", "()Lkotlin/jvm/functions/Function1;", "recordedDerivedStateValues", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "scopeToValues", "Landroidx/collection/MutableScatterMap;", "statesToReread", "Landroidx/compose/runtime/collection/MutableVector;", "valueToScopes", "clear", "clearObsoleteStateReads", "scope", "clearScopeObservations", "hasScopeObservations", "", "notifyInvalidatedScopes", "observe", "readObserver", "block", "Lkotlin/Function0;", "recordInvalidation", "changes", "", "recordRead", "value", "recordedValues", "removeObservation", "removeScopeIf", "predicate", "Lkotlin/ParameterName;", "name", "rereadDerivedState", "derivedState", "runtime"}) @SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 6 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 9 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 10 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 11 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 12 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 13 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 14 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,657:1\n1208#2:658\n1187#2,2:659\n415#3,3:661\n373#3,6:664\n383#3,3:671\n386#3,2:675\n419#3:677\n420#3:679\n389#3,6:680\n421#3:686\n373#3,6:698\n383#3,3:705\n386#3,2:709\n389#3,6:715\n401#3,4:722\n373#3,6:726\n383#3,3:733\n386#3,2:737\n406#3,2:739\n389#3,6:741\n408#3:747\n401#3,4:763\n373#3,6:767\n383#3,3:774\n386#3,2:778\n406#3,2:780\n389#3,6:782\n408#3:788\n1810#4:670\n1672#4:674\n1810#4:704\n1672#4:708\n1810#4:732\n1672#4:736\n1810#4:755\n1672#4:759\n1810#4:773\n1672#4:777\n1810#4:813\n1672#4:817\n1810#4:838\n1672#4:842\n1810#4:862\n1672#4:866\n1810#4:907\n1672#4:911\n1810#4:944\n1672#4:948\n1810#4:985\n1672#4:989\n1810#4:1009\n1672#4:1013\n1810#4:1054\n1672#4:1058\n1810#4:1091\n1672#4:1095\n1810#4:1140\n1672#4:1144\n1810#4:1171\n1672#4:1175\n52#5:678\n52#5:687\n52#5:821\n393#6,6:688\n399#6,2:695\n48#7:694\n460#7,11:1113\n843#8:697\n845#8,4:711\n849#8:721\n1047#9:748\n1049#9:762\n1050#9,3:789\n1053#9:798\n363#10,6:749\n373#10,3:756\n376#10,2:760\n379#10,6:792\n48#11,3:799\n53#11:972\n55#11:1112\n267#12,4:802\n237#12,7:806\n248#12,3:814\n251#12,2:818\n272#12:820\n267#12,4:827\n237#12,7:831\n248#12,3:839\n251#12,2:843\n272#12:845\n267#12,4:851\n237#12,7:855\n248#12,3:863\n251#12,2:867\n272#12,2:869\n254#12,6:871\n274#12:877\n273#12:882\n254#12,6:883\n274#12:889\n267#12,4:896\n237#12,7:900\n248#12,3:908\n251#12,2:912\n272#12,2:914\n254#12,6:916\n274#12:922\n267#12,4:933\n237#12,7:937\n248#12,3:945\n251#12,2:949\n272#12,2:951\n254#12,6:953\n274#12:959\n273#12:964\n254#12,6:965\n274#12:971\n267#12,4:974\n237#12,7:978\n248#12,3:986\n251#12,2:990\n272#12:992\n267#12,4:998\n237#12,7:1002\n248#12,3:1010\n251#12,2:1014\n272#12,2:1016\n254#12,6:1018\n274#12:1024\n273#12:1029\n254#12,6:1030\n274#12:1036\n267#12,4:1043\n237#12,7:1047\n248#12,3:1055\n251#12,2:1059\n272#12,2:1061\n254#12,6:1063\n274#12:1069\n267#12,4:1080\n237#12,7:1084\n248#12,3:1092\n251#12,2:1096\n272#12,2:1098\n254#12,6:1100\n274#12:1106\n267#12,4:1129\n237#12,7:1133\n248#12,3:1141\n251#12,2:1145\n272#12,2:1147\n254#12,6:1149\n274#12:1155\n267#12,4:1160\n237#12,7:1164\n248#12,3:1172\n251#12,2:1176\n272#12,2:1178\n254#12,6:1180\n274#12:1186\n77#13,5:822\n77#13,5:846\n85#13,4:878\n85#13:890\n77#13,5:891\n85#13,4:923\n88#13:927\n77#13,5:928\n85#13,4:960\n77#13,5:993\n85#13,4:1025\n85#13:1037\n77#13,5:1038\n85#13,4:1070\n88#13:1074\n77#13,5:1075\n85#13,4:1107\n77#13,5:1124\n85#13,4:1156\n1855#14:973\n1856#14:1111\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n402#1:658\n402#1:659,2\n474#1:661,3\n474#1:664,6\n474#1:671,3\n474#1:675,2\n474#1:677\n474#1:679\n474#1:680,6\n474#1:686\n517#1:698,6\n517#1:705,3\n517#1:709,2\n517#1:715,6\n531#1:722,4\n531#1:726,6\n531#1:733,3\n531#1:737,2\n531#1:739,2\n531#1:741,6\n531#1:747\n543#1:763,4\n543#1:767,6\n543#1:774,3\n543#1:778,2\n543#1:780,2\n543#1:782,6\n543#1:788\n474#1:670\n474#1:674\n517#1:704\n517#1:708\n531#1:732\n531#1:736\n540#1:755\n540#1:759\n543#1:773\n543#1:777\n584#1:813\n584#1:817\n593#1:838\n593#1:842\n604#1:862\n604#1:866\n604#1:907\n604#1:911\n615#1:944\n615#1:948\n593#1:985\n593#1:989\n604#1:1009\n604#1:1013\n604#1:1054\n604#1:1058\n615#1:1091\n615#1:1095\n635#1:1140\n635#1:1144\n652#1:1171\n652#1:1175\n476#1:678\n484#1:687\n586#1:821\n504#1:688,6\n504#1:695,2\n504#1:694\n622#1:1113,11\n517#1:697\n517#1:711,4\n517#1:721\n540#1:748\n540#1:762\n540#1:789,3\n540#1:798\n540#1:749,6\n540#1:756,3\n540#1:760,2\n540#1:792,6\n584#1:799,3\n584#1:972\n584#1:1112\n584#1:802,4\n584#1:806,7\n584#1:814,3\n584#1:818,2\n584#1:820\n593#1:827,4\n593#1:831,7\n593#1:839,3\n593#1:843,2\n593#1:845\n604#1:851,4\n604#1:855,7\n604#1:863,3\n604#1:867,2\n604#1:869,2\n604#1:871,6\n604#1:877\n593#1:882\n593#1:883,6\n593#1:889\n604#1:896,4\n604#1:900,7\n604#1:908,3\n604#1:912,2\n604#1:914,2\n604#1:916,6\n604#1:922\n615#1:933,4\n615#1:937,7\n615#1:945,3\n615#1:949,2\n615#1:951,2\n615#1:953,6\n615#1:959\n584#1:964\n584#1:965,6\n584#1:971\n593#1:974,4\n593#1:978,7\n593#1:986,3\n593#1:990,2\n593#1:992\n604#1:998,4\n604#1:1002,7\n604#1:1010,3\n604#1:1014,2\n604#1:1016,2\n604#1:1018,6\n604#1:1024\n593#1:1029\n593#1:1030,6\n593#1:1036\n604#1:1043,4\n604#1:1047,7\n604#1:1055,3\n604#1:1059,2\n604#1:1061,2\n604#1:1063,6\n604#1:1069\n615#1:1080,4\n615#1:1084,7\n615#1:1092,3\n615#1:1096,2\n615#1:1098,2\n615#1:1100,6\n615#1:1106\n635#1:1129,4\n635#1:1133,7\n635#1:1141,3\n635#1:1145,2\n635#1:1147,2\n635#1:1149,6\n635#1:1155\n652#1:1160,4\n652#1:1164,7\n652#1:1172,3\n652#1:1176,2\n652#1:1178,2\n652#1:1180,6\n652#1:1186\n593#1:822,5\n604#1:846,5\n604#1:878,4\n593#1:890\n604#1:891,5\n604#1:923,4\n593#1:927\n615#1:928,5\n615#1:960,4\n604#1:993,5\n604#1:1025,4\n593#1:1037\n604#1:1038,5\n604#1:1070,4\n593#1:1074\n615#1:1075,5\n615#1:1107,4\n635#1:1124,5\n635#1:1156,4\n584#1:973\n584#1:1111\n*E\n"}) private static final class ObservedScopeMap { @NotNull
/*      */     private final Function1<Object, Unit> onChanged; @Nullable
/*      */     private Object currentScope; @Nullable
/*      */     private MutableObjectIntMap<Object> currentScopeReads; private int currentToken; @NotNull
/*      */     private final ScopeMap<Object, Object> valueToScopes; @NotNull
/*      */     private final MutableScatterMap<Object, MutableObjectIntMap<Object>> scopeToValues; @NotNull
/*      */     private final MutableScatterSet<Object> invalidated; @NotNull
/*      */     private final MutableVector<DerivedState<?>> statesToReread; @NotNull
/*      */     private final DerivedStateObserver derivedStateObserver; private int deriveStateScopeCount;
/*      */     public final void removeScopeIf(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate");
/*      */       MutableScatterMap<Object, MutableObjectIntMap<Object>> this_$iv = this.scopeToValues;
/*      */       int $i$f$removeIf = 0;
/*      */       ScatterMap this_$iv$iv = (ScatterMap)this_$iv;
/*      */       int $i$f$forEachIndexed = 0;
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
/*  794 */             if (bitCount$iv$iv == 8) {
/*      */               continue;
/*      */             }
/*      */             break;
/*      */           } 
/*      */           continue;
/*      */           if (i$iv$iv != lastIndex$iv$iv) {
/*      */             i$iv$iv++;
/*      */             continue;
/*      */           } 
/*      */           // Byte code: goto -> 484
/*      */         } 
/*      */       } else {
/*      */       
/*      */       }  }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @NotNull
/*      */     private final ScopeMap<Object, DerivedState<?>> dependencyToDerivedStates;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @NotNull
/*      */     private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ObservedScopeMap(@NotNull Function1<Object, Unit> onChanged) {
/*      */       this.onChanged = onChanged;
/*      */       this.currentToken = -1;
/*      */       this.valueToScopes = new ScopeMap();
/*      */       this.scopeToValues = new MutableScatterMap(0, 1, null);
/*      */       this.invalidated = new MutableScatterSet(0, 1, null);
/*      */       int $i$f$mutableVectorOf = 0;
/*      */       int capacity$iv$iv = 16, $i$f$MutableVector = 0;
/*      */       this.statesToReread = new MutableVector((Object[])new DerivedState[capacity$iv$iv], 0);
/*      */       this.derivedStateObserver = new SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1();
/*      */       this.dependencyToDerivedStates = new ScopeMap();
/*      */       this.recordedDerivedStateValues = new HashMap<>();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @NotNull
/*      */     public final Function1<Object, Unit> getOnChanged() {
/*      */       return this.onChanged;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @NotNull
/*      */     public final DerivedStateObserver getDerivedStateObserver() {
/*      */       return this.derivedStateObserver;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\024\020\002\032\0020\0032\n\020\004\032\006\022\002\b\0030\005H\026J\024\020\006\032\0020\0032\n\020\004\032\006\022\002\b\0030\005H\026¨\006\007"}, d2 = {"androidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1", "Landroidx/compose/runtime/DerivedStateObserver;", "done", "", "derivedState", "Landroidx/compose/runtime/DerivedState;", "start", "runtime"})
/*      */     public static final class SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
/*      */       implements DerivedStateObserver
/*      */     {
/*      */       public void start(@NotNull DerivedState derivedState) {
/*      */         Intrinsics.checkNotNullParameter(derivedState, "derivedState");
/*      */         SnapshotStateObserver.ObservedScopeMap observedScopeMap = SnapshotStateObserver.ObservedScopeMap.this;
/*      */         int i = observedScopeMap.deriveStateScopeCount;
/*      */         observedScopeMap.deriveStateScopeCount = i + 1;
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public void done(@NotNull DerivedState derivedState) {
/*      */         Intrinsics.checkNotNullParameter(derivedState, "derivedState");
/*      */         SnapshotStateObserver.ObservedScopeMap observedScopeMap = SnapshotStateObserver.ObservedScopeMap.this;
/*      */         int i = observedScopeMap.deriveStateScopeCount;
/*      */         observedScopeMap.deriveStateScopeCount = i + -1;
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public final void recordRead(@NotNull Object value) {
/*      */       Intrinsics.checkNotNullParameter(value, "value");
/*      */       Intrinsics.checkNotNull(this.currentScope);
/*      */       Object scope = this.currentScope;
/*      */       if (this.currentScopeReads == null) {
/*      */         MutableObjectIntMap<Object> mutableObjectIntMap1 = new MutableObjectIntMap(0, 1, null), mutableObjectIntMap2 = mutableObjectIntMap1, mutableObjectIntMap3 = this.currentScopeReads;
/*      */         Object object2 = scope;
/*      */         int i = this.currentToken;
/*      */         Object object1 = value;
/*      */         int $i$a$-also-SnapshotStateObserver$ObservedScopeMap$recordRead$1 = 0;
/*      */         this.currentScopeReads = mutableObjectIntMap2;
/*      */         this.scopeToValues.set(scope, mutableObjectIntMap2);
/*      */         Unit unit = Unit.INSTANCE;
/*      */       } 
/*      */       object1.recordRead(i, object2, mutableObjectIntMap3, mutableObjectIntMap1);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private final void recordRead(Object value, int currentToken, Object currentScope, MutableObjectIntMap recordedValues) {
/*      */       if (this.deriveStateScopeCount > 0) {
/*      */         return;
/*      */       }
/*      */       int previousToken = recordedValues.put(value, currentToken, -1);
/*      */       if (value instanceof DerivedState && previousToken != currentToken) {
/*      */         DerivedState.Record record = ((DerivedState)value).getCurrentRecord();
/*      */         this.recordedDerivedStateValues.put(value, record.getCurrentValue());
/*      */         ObjectIntMap dependencies = record.getDependencies();
/*      */         ScopeMap<Object, DerivedState<?>> dependencyToDerivedStates = this.dependencyToDerivedStates;
/*      */         dependencyToDerivedStates.removeScope(value);
/*      */         ObjectIntMap this_$iv = dependencies;
/*      */         int $i$f$forEachKey = 0;
/*      */         Object[] k$iv = this_$iv.keys;
/*      */         ObjectIntMap this_$iv$iv = this_$iv;
/*      */         int $i$f$forEachIndexed = 0;
/*      */         long[] m$iv$iv = this_$iv$iv.metadata;
/*      */         int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */         int i$iv$iv = 0;
/*      */         if (i$iv$iv <= lastIndex$iv$iv) {
/*      */           while (true) {
/*      */             long slot$iv$iv = m$iv$iv[i$iv$iv];
/*      */             long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
/*      */             int $i$f$maskEmptyOrDeleted = 0;
/*      */             if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/*      */               int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/*      */               for (int j$iv$iv = 0;; j$iv$iv++);
/*      */               if (bitCount$iv$iv == 8) {
/*      */                 continue;
/*      */               }
/*      */               break;
/*      */             } 
/*      */             continue;
/*      */             if (i$iv$iv != lastIndex$iv$iv) {
/*      */               i$iv$iv++;
/*      */               continue;
/*      */             } 
/*      */             // Byte code: goto -> 321
/*      */           } 
/*      */         } else {
/*      */         
/*      */         } 
/*      */       } 
/*      */       if (previousToken == -1) {
/*      */         if (value instanceof StateObjectImpl) {
/*      */           ReaderKind.Companion this_$iv = ReaderKind.Companion;
/*      */           int $i$f$getSnapshotStateObserver-6f8NoZ8 = 0;
/*      */           ((StateObjectImpl)value).recordReadIn-h_f27i8$runtime(ReaderKind.constructor-impl(2));
/*      */         } 
/*      */         this.valueToScopes.add(value, currentScope);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public final void observe(@NotNull Object scope, @NotNull Function1<Object, Unit> readObserver, @NotNull Function0<?> block) {
/*      */       Intrinsics.checkNotNullParameter(scope, "scope");
/*      */       Intrinsics.checkNotNullParameter(readObserver, "readObserver");
/*      */       Intrinsics.checkNotNullParameter(block, "block");
/*      */       Object previousScope = this.currentScope;
/*      */       MutableObjectIntMap<Object> previousReads = this.currentScopeReads;
/*      */       int previousToken = this.currentToken;
/*      */       this.currentScope = scope;
/*      */       this.currentScopeReads = (MutableObjectIntMap<Object>)this.scopeToValues.get(scope);
/*      */       if (this.currentToken == -1) {
/*      */         this.currentToken = SnapshotKt.currentSnapshot().getId();
/*      */       }
/*      */       DerivedStateObserver observer$iv = this.derivedStateObserver;
/*      */       int $i$f$observeDerivedStateRecalculations = 0;
/*      */       MutableVector observers$iv = SnapshotStateKt.derivedStateObservers();
/*      */       try {
/*      */         observers$iv.add(observer$iv);
/*      */         int $i$a$-observeDerivedStateRecalculations-SnapshotStateObserver$ObservedScopeMap$observe$1 = 0;
/*      */         Snapshot.Companion.observe(readObserver, null, block);
/*      */       } finally {
/*      */         MutableVector this_$iv$iv = observers$iv;
/*      */         int $i$f$getLastIndex = 0;
/*      */         observers$iv.removeAt(this_$iv$iv.getSize() - 1);
/*      */       } 
/*      */       Intrinsics.checkNotNull(this.currentScope);
/*      */       clearObsoleteStateReads(this.currentScope);
/*      */       this.currentScope = previousScope;
/*      */       this.currentScopeReads = previousReads;
/*      */       this.currentToken = previousToken;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private final void clearObsoleteStateReads(Object scope) {
/*      */       int currentToken = this.currentToken;
/*      */       MutableObjectIntMap<Object> this_$iv = this.currentScopeReads;
/*      */       int $i$f$removeIf = 0;
/*      */       ObjectIntMap this_$iv$iv = (ObjectIntMap)this_$iv;
/*      */       int $i$f$forEachIndexed = 0;
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
/*      */             if (bitCount$iv$iv == 8) {
/*      */               continue;
/*      */             }
/*      */             break;
/*      */           } 
/*      */           continue;
/*      */           if (i$iv$iv != lastIndex$iv$iv) {
/*      */             i$iv$iv++;
/*      */             continue;
/*      */           } 
/*      */           // Byte code: goto -> 257
/*      */         } 
/*      */       } else {
/*      */       
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public final void clearScopeObservations(@NotNull Object scope) {
/*      */       MutableObjectIntMap recordedValues;
/*      */       Intrinsics.checkNotNullParameter(scope, "scope");
/*      */       if ((MutableObjectIntMap)this.scopeToValues.remove(scope) == null) {
/*      */         (MutableObjectIntMap)this.scopeToValues.remove(scope);
/*      */         return;
/*      */       } 
/*      */       ObjectIntMap this_$iv = (ObjectIntMap)recordedValues;
/*      */       int $i$f$forEach = 0;
/*      */       Object[] k$iv = this_$iv.keys;
/*      */       int[] v$iv = this_$iv.values;
/*      */       ObjectIntMap this_$iv$iv = this_$iv;
/*      */       int $i$f$forEachIndexed = 0;
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
/*      */             if (bitCount$iv$iv == 8) {
/*      */               continue;
/*      */             }
/*      */             break;
/*      */           } 
/*      */           continue;
/*      */           if (i$iv$iv != lastIndex$iv$iv) {
/*      */             i$iv$iv++;
/*      */             continue;
/*      */           } 
/*      */           // Byte code: goto -> 240
/*      */         } 
/*      */       } else {
/*      */       
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public final boolean hasScopeObservations() {
/*      */       return this.scopeToValues.isNotEmpty();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private final void removeObservation(Object scope, Object value) {
/*      */       this.valueToScopes.remove(value, scope);
/*      */       if (value instanceof DerivedState && !this.valueToScopes.contains(value)) {
/*      */         this.dependencyToDerivedStates.removeScope(value);
/*      */         this.recordedDerivedStateValues.remove(value);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public final void clear() {
/*      */       this.valueToScopes.clear();
/*      */       this.scopeToValues.clear();
/*      */       this.dependencyToDerivedStates.clear();
/*      */       this.recordedDerivedStateValues.clear();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public final boolean recordInvalidation(@NotNull Set changes) {
/*      */       // Byte code:
/*      */       //   0: aload_1
/*      */       //   1: ldc_w 'changes'
/*      */       //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */       //   7: iconst_0
/*      */       //   8: istore_2
/*      */       //   9: aload_0
/*      */       //   10: getfield dependencyToDerivedStates : Landroidx/compose/runtime/collection/ScopeMap;
/*      */       //   13: astore_3
/*      */       //   14: aload_0
/*      */       //   15: getfield recordedDerivedStateValues : Ljava/util/HashMap;
/*      */       //   18: astore #4
/*      */       //   20: aload_0
/*      */       //   21: getfield valueToScopes : Landroidx/compose/runtime/collection/ScopeMap;
/*      */       //   24: astore #5
/*      */       //   26: aload_0
/*      */       //   27: getfield invalidated : Landroidx/collection/MutableScatterSet;
/*      */       //   30: astore #6
/*      */       //   32: aload_1
/*      */       //   33: astore #7
/*      */       //   35: iconst_0
/*      */       //   36: istore #8
/*      */       //   38: aload #7
/*      */       //   40: instanceof androidx/compose/runtime/collection/ScatterSetWrapper
/*      */       //   43: ifeq -> 1512
/*      */       //   46: aload #7
/*      */       //   48: checkcast androidx/compose/runtime/collection/ScatterSetWrapper
/*      */       //   51: invokevirtual getSet$runtime : ()Landroidx/collection/ScatterSet;
/*      */       //   54: astore #9
/*      */       //   56: iconst_0
/*      */       //   57: istore #10
/*      */       //   59: nop
/*      */       //   60: aload #9
/*      */       //   62: getfield elements : [Ljava/lang/Object;
/*      */       //   65: astore #11
/*      */       //   67: aload #9
/*      */       //   69: astore #12
/*      */       //   71: iconst_0
/*      */       //   72: istore #13
/*      */       //   74: nop
/*      */       //   75: aload #12
/*      */       //   77: getfield metadata : [J
/*      */       //   80: astore #14
/*      */       //   82: aload #14
/*      */       //   84: arraylength
/*      */       //   85: iconst_2
/*      */       //   86: isub
/*      */       //   87: istore #15
/*      */       //   89: iconst_0
/*      */       //   90: istore #16
/*      */       //   92: iload #16
/*      */       //   94: iload #15
/*      */       //   96: if_icmpgt -> 1507
/*      */       //   99: aload #14
/*      */       //   101: iload #16
/*      */       //   103: laload
/*      */       //   104: lstore #17
/*      */       //   106: lload #17
/*      */       //   108: lstore #19
/*      */       //   110: iconst_0
/*      */       //   111: istore #21
/*      */       //   113: lload #19
/*      */       //   115: lload #19
/*      */       //   117: ldc2_w -1
/*      */       //   120: lxor
/*      */       //   121: bipush #7
/*      */       //   123: lshl
/*      */       //   124: land
/*      */       //   125: ldc2_w -9187201950435737472
/*      */       //   128: land
/*      */       //   129: ldc2_w -9187201950435737472
/*      */       //   132: lcmp
/*      */       //   133: ifeq -> 1494
/*      */       //   136: bipush #8
/*      */       //   138: iload #16
/*      */       //   140: iload #15
/*      */       //   142: isub
/*      */       //   143: iconst_m1
/*      */       //   144: ixor
/*      */       //   145: bipush #31
/*      */       //   147: iushr
/*      */       //   148: isub
/*      */       //   149: istore #22
/*      */       //   151: iconst_0
/*      */       //   152: istore #23
/*      */       //   154: iload #23
/*      */       //   156: iload #22
/*      */       //   158: if_icmpge -> 1487
/*      */       //   161: lload #17
/*      */       //   163: ldc2_w 255
/*      */       //   166: land
/*      */       //   167: lstore #24
/*      */       //   169: iconst_0
/*      */       //   170: istore #26
/*      */       //   172: lload #24
/*      */       //   174: ldc2_w 128
/*      */       //   177: lcmp
/*      */       //   178: ifge -> 185
/*      */       //   181: iconst_1
/*      */       //   182: goto -> 186
/*      */       //   185: iconst_0
/*      */       //   186: ifeq -> 1474
/*      */       //   189: iload #16
/*      */       //   191: iconst_3
/*      */       //   192: ishl
/*      */       //   193: iload #23
/*      */       //   195: iadd
/*      */       //   196: istore #21
/*      */       //   198: iload #21
/*      */       //   200: istore #27
/*      */       //   202: iconst_0
/*      */       //   203: istore #28
/*      */       //   205: aload #11
/*      */       //   207: iload #27
/*      */       //   209: aaload
/*      */       //   210: astore #29
/*      */       //   212: iconst_0
/*      */       //   213: istore #30
/*      */       //   215: aload #29
/*      */       //   217: instanceof androidx/compose/runtime/snapshots/StateObjectImpl
/*      */       //   220: ifeq -> 249
/*      */       //   223: aload #29
/*      */       //   225: checkcast androidx/compose/runtime/snapshots/StateObjectImpl
/*      */       //   228: getstatic androidx/compose/runtime/snapshots/ReaderKind.Companion : Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
/*      */       //   231: astore #31
/*      */       //   233: iconst_0
/*      */       //   234: istore #32
/*      */       //   236: iconst_2
/*      */       //   237: invokestatic constructor-impl : (I)I
/*      */       //   240: invokevirtual isReadIn-h_f27i8$runtime : (I)Z
/*      */       //   243: ifne -> 249
/*      */       //   246: goto -> 1471
/*      */       //   249: aload_3
/*      */       //   250: aload #29
/*      */       //   252: invokevirtual contains : (Ljava/lang/Object;)Z
/*      */       //   255: ifeq -> 1197
/*      */       //   258: aload_3
/*      */       //   259: astore #31
/*      */       //   261: iconst_0
/*      */       //   262: istore #32
/*      */       //   264: aload #31
/*      */       //   266: invokevirtual getMap : ()Landroidx/collection/MutableScatterMap;
/*      */       //   269: aload #29
/*      */       //   271: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   274: astore #33
/*      */       //   276: aload #33
/*      */       //   278: ifnull -> 1196
/*      */       //   281: aload #33
/*      */       //   283: instanceof androidx/collection/MutableScatterSet
/*      */       //   286: ifeq -> 847
/*      */       //   289: aload #33
/*      */       //   291: checkcast androidx/collection/MutableScatterSet
/*      */       //   294: checkcast androidx/collection/ScatterSet
/*      */       //   297: astore #34
/*      */       //   299: iconst_0
/*      */       //   300: istore #35
/*      */       //   302: nop
/*      */       //   303: aload #34
/*      */       //   305: getfield elements : [Ljava/lang/Object;
/*      */       //   308: astore #36
/*      */       //   310: aload #34
/*      */       //   312: astore #37
/*      */       //   314: iconst_0
/*      */       //   315: istore #38
/*      */       //   317: nop
/*      */       //   318: aload #37
/*      */       //   320: getfield metadata : [J
/*      */       //   323: astore #39
/*      */       //   325: aload #39
/*      */       //   327: arraylength
/*      */       //   328: iconst_2
/*      */       //   329: isub
/*      */       //   330: istore #40
/*      */       //   332: iconst_0
/*      */       //   333: istore #41
/*      */       //   335: iload #41
/*      */       //   337: iload #40
/*      */       //   339: if_icmpgt -> 842
/*      */       //   342: aload #39
/*      */       //   344: iload #41
/*      */       //   346: laload
/*      */       //   347: lstore #42
/*      */       //   349: lload #42
/*      */       //   351: lstore #44
/*      */       //   353: iconst_0
/*      */       //   354: istore #46
/*      */       //   356: lload #44
/*      */       //   358: lload #44
/*      */       //   360: ldc2_w -1
/*      */       //   363: lxor
/*      */       //   364: bipush #7
/*      */       //   366: lshl
/*      */       //   367: land
/*      */       //   368: ldc2_w -9187201950435737472
/*      */       //   371: land
/*      */       //   372: ldc2_w -9187201950435737472
/*      */       //   375: lcmp
/*      */       //   376: ifeq -> 829
/*      */       //   379: bipush #8
/*      */       //   381: iload #41
/*      */       //   383: iload #40
/*      */       //   385: isub
/*      */       //   386: iconst_m1
/*      */       //   387: ixor
/*      */       //   388: bipush #31
/*      */       //   390: iushr
/*      */       //   391: isub
/*      */       //   392: istore #47
/*      */       //   394: iconst_0
/*      */       //   395: istore #48
/*      */       //   397: iload #48
/*      */       //   399: iload #47
/*      */       //   401: if_icmpge -> 822
/*      */       //   404: lload #42
/*      */       //   406: ldc2_w 255
/*      */       //   409: land
/*      */       //   410: lstore #49
/*      */       //   412: iconst_0
/*      */       //   413: istore #51
/*      */       //   415: lload #49
/*      */       //   417: ldc2_w 128
/*      */       //   420: lcmp
/*      */       //   421: ifge -> 428
/*      */       //   424: iconst_1
/*      */       //   425: goto -> 429
/*      */       //   428: iconst_0
/*      */       //   429: ifeq -> 809
/*      */       //   432: iload #41
/*      */       //   434: iconst_3
/*      */       //   435: ishl
/*      */       //   436: iload #48
/*      */       //   438: iadd
/*      */       //   439: istore #46
/*      */       //   441: iload #46
/*      */       //   443: istore #52
/*      */       //   445: iconst_0
/*      */       //   446: istore #53
/*      */       //   448: aload #36
/*      */       //   450: iload #52
/*      */       //   452: aaload
/*      */       //   453: checkcast androidx/compose/runtime/DerivedState
/*      */       //   456: astore #54
/*      */       //   458: iconst_0
/*      */       //   459: istore #55
/*      */       //   461: aload #54
/*      */       //   463: ldc_w 'null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>'
/*      */       //   466: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */       //   469: aload #4
/*      */       //   471: aload #54
/*      */       //   473: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   476: astore #56
/*      */       //   478: aload #54
/*      */       //   480: invokeinterface getPolicy : ()Landroidx/compose/runtime/SnapshotMutationPolicy;
/*      */       //   485: dup
/*      */       //   486: ifnonnull -> 493
/*      */       //   489: pop
/*      */       //   490: invokestatic structuralEqualityPolicy : ()Landroidx/compose/runtime/SnapshotMutationPolicy;
/*      */       //   493: astore #57
/*      */       //   495: aload #57
/*      */       //   497: aload #54
/*      */       //   499: invokeinterface getCurrentRecord : ()Landroidx/compose/runtime/DerivedState$Record;
/*      */       //   504: invokeinterface getCurrentValue : ()Ljava/lang/Object;
/*      */       //   509: aload #56
/*      */       //   511: invokeinterface equivalent : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */       //   516: ifne -> 795
/*      */       //   519: aload #5
/*      */       //   521: astore #58
/*      */       //   523: iconst_0
/*      */       //   524: istore #59
/*      */       //   526: aload #58
/*      */       //   528: invokevirtual getMap : ()Landroidx/collection/MutableScatterMap;
/*      */       //   531: aload #54
/*      */       //   533: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   536: astore #60
/*      */       //   538: aload #60
/*      */       //   540: ifnull -> 791
/*      */       //   543: aload #60
/*      */       //   545: instanceof androidx/collection/MutableScatterSet
/*      */       //   548: ifeq -> 772
/*      */       //   551: aload #60
/*      */       //   553: checkcast androidx/collection/MutableScatterSet
/*      */       //   556: checkcast androidx/collection/ScatterSet
/*      */       //   559: astore #61
/*      */       //   561: iconst_0
/*      */       //   562: istore #62
/*      */       //   564: nop
/*      */       //   565: aload #61
/*      */       //   567: getfield elements : [Ljava/lang/Object;
/*      */       //   570: astore #63
/*      */       //   572: aload #61
/*      */       //   574: astore #64
/*      */       //   576: iconst_0
/*      */       //   577: istore #65
/*      */       //   579: nop
/*      */       //   580: aload #64
/*      */       //   582: getfield metadata : [J
/*      */       //   585: astore #66
/*      */       //   587: aload #66
/*      */       //   589: arraylength
/*      */       //   590: iconst_2
/*      */       //   591: isub
/*      */       //   592: istore #67
/*      */       //   594: iconst_0
/*      */       //   595: istore #68
/*      */       //   597: iload #68
/*      */       //   599: iload #67
/*      */       //   601: if_icmpgt -> 767
/*      */       //   604: aload #66
/*      */       //   606: iload #68
/*      */       //   608: laload
/*      */       //   609: lstore #69
/*      */       //   611: lload #69
/*      */       //   613: lstore #71
/*      */       //   615: iconst_0
/*      */       //   616: istore #73
/*      */       //   618: lload #71
/*      */       //   620: lload #71
/*      */       //   622: ldc2_w -1
/*      */       //   625: lxor
/*      */       //   626: bipush #7
/*      */       //   628: lshl
/*      */       //   629: land
/*      */       //   630: ldc2_w -9187201950435737472
/*      */       //   633: land
/*      */       //   634: ldc2_w -9187201950435737472
/*      */       //   637: lcmp
/*      */       //   638: ifeq -> 754
/*      */       //   641: bipush #8
/*      */       //   643: iload #68
/*      */       //   645: iload #67
/*      */       //   647: isub
/*      */       //   648: iconst_m1
/*      */       //   649: ixor
/*      */       //   650: bipush #31
/*      */       //   652: iushr
/*      */       //   653: isub
/*      */       //   654: istore #74
/*      */       //   656: iconst_0
/*      */       //   657: istore #75
/*      */       //   659: iload #75
/*      */       //   661: iload #74
/*      */       //   663: if_icmpge -> 747
/*      */       //   666: lload #69
/*      */       //   668: ldc2_w 255
/*      */       //   671: land
/*      */       //   672: lstore #76
/*      */       //   674: iconst_0
/*      */       //   675: istore #78
/*      */       //   677: lload #76
/*      */       //   679: ldc2_w 128
/*      */       //   682: lcmp
/*      */       //   683: ifge -> 690
/*      */       //   686: iconst_1
/*      */       //   687: goto -> 691
/*      */       //   690: iconst_0
/*      */       //   691: ifeq -> 734
/*      */       //   694: iload #68
/*      */       //   696: iconst_3
/*      */       //   697: ishl
/*      */       //   698: iload #75
/*      */       //   700: iadd
/*      */       //   701: istore #73
/*      */       //   703: iload #73
/*      */       //   705: istore #79
/*      */       //   707: iconst_0
/*      */       //   708: istore #80
/*      */       //   710: aload #63
/*      */       //   712: iload #79
/*      */       //   714: aaload
/*      */       //   715: astore #81
/*      */       //   717: iconst_0
/*      */       //   718: istore #82
/*      */       //   720: aload #6
/*      */       //   722: aload #81
/*      */       //   724: invokevirtual add : (Ljava/lang/Object;)Z
/*      */       //   727: pop
/*      */       //   728: iconst_1
/*      */       //   729: istore_2
/*      */       //   730: nop
/*      */       //   731: nop
/*      */       //   732: nop
/*      */       //   733: nop
/*      */       //   734: lload #69
/*      */       //   736: bipush #8
/*      */       //   738: lshr
/*      */       //   739: lstore #69
/*      */       //   741: iinc #75, 1
/*      */       //   744: goto -> 659
/*      */       //   747: iload #74
/*      */       //   749: bipush #8
/*      */       //   751: if_icmpne -> 768
/*      */       //   754: iload #68
/*      */       //   756: iload #67
/*      */       //   758: if_icmpeq -> 767
/*      */       //   761: iinc #68, 1
/*      */       //   764: goto -> 604
/*      */       //   767: nop
/*      */       //   768: nop
/*      */       //   769: goto -> 791
/*      */       //   772: aload #60
/*      */       //   774: astore #81
/*      */       //   776: iconst_0
/*      */       //   777: istore #82
/*      */       //   779: aload #6
/*      */       //   781: aload #81
/*      */       //   783: invokevirtual add : (Ljava/lang/Object;)Z
/*      */       //   786: pop
/*      */       //   787: iconst_1
/*      */       //   788: istore_2
/*      */       //   789: nop
/*      */       //   790: nop
/*      */       //   791: nop
/*      */       //   792: goto -> 805
/*      */       //   795: aload_0
/*      */       //   796: getfield statesToReread : Landroidx/compose/runtime/collection/MutableVector;
/*      */       //   799: aload #54
/*      */       //   801: invokevirtual add : (Ljava/lang/Object;)Z
/*      */       //   804: pop
/*      */       //   805: nop
/*      */       //   806: nop
/*      */       //   807: nop
/*      */       //   808: nop
/*      */       //   809: lload #42
/*      */       //   811: bipush #8
/*      */       //   813: lshr
/*      */       //   814: lstore #42
/*      */       //   816: iinc #48, 1
/*      */       //   819: goto -> 397
/*      */       //   822: iload #47
/*      */       //   824: bipush #8
/*      */       //   826: if_icmpne -> 843
/*      */       //   829: iload #41
/*      */       //   831: iload #40
/*      */       //   833: if_icmpeq -> 842
/*      */       //   836: iinc #41, 1
/*      */       //   839: goto -> 342
/*      */       //   842: nop
/*      */       //   843: nop
/*      */       //   844: goto -> 1196
/*      */       //   847: aload #33
/*      */       //   849: checkcast androidx/compose/runtime/DerivedState
/*      */       //   852: astore #54
/*      */       //   854: iconst_0
/*      */       //   855: istore #55
/*      */       //   857: nop
/*      */       //   858: aload #4
/*      */       //   860: aload #54
/*      */       //   862: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   865: astore #56
/*      */       //   867: aload #54
/*      */       //   869: invokeinterface getPolicy : ()Landroidx/compose/runtime/SnapshotMutationPolicy;
/*      */       //   874: dup
/*      */       //   875: ifnonnull -> 882
/*      */       //   878: pop
/*      */       //   879: invokestatic structuralEqualityPolicy : ()Landroidx/compose/runtime/SnapshotMutationPolicy;
/*      */       //   882: astore #57
/*      */       //   884: aload #57
/*      */       //   886: aload #54
/*      */       //   888: invokeinterface getCurrentRecord : ()Landroidx/compose/runtime/DerivedState$Record;
/*      */       //   893: invokeinterface getCurrentValue : ()Ljava/lang/Object;
/*      */       //   898: aload #56
/*      */       //   900: invokeinterface equivalent : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */       //   905: ifne -> 1184
/*      */       //   908: aload #5
/*      */       //   910: astore #58
/*      */       //   912: iconst_0
/*      */       //   913: istore #59
/*      */       //   915: aload #58
/*      */       //   917: invokevirtual getMap : ()Landroidx/collection/MutableScatterMap;
/*      */       //   920: aload #54
/*      */       //   922: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   925: astore #60
/*      */       //   927: aload #60
/*      */       //   929: ifnull -> 1180
/*      */       //   932: aload #60
/*      */       //   934: instanceof androidx/collection/MutableScatterSet
/*      */       //   937: ifeq -> 1161
/*      */       //   940: aload #60
/*      */       //   942: checkcast androidx/collection/MutableScatterSet
/*      */       //   945: checkcast androidx/collection/ScatterSet
/*      */       //   948: astore #61
/*      */       //   950: iconst_0
/*      */       //   951: istore #62
/*      */       //   953: nop
/*      */       //   954: aload #61
/*      */       //   956: getfield elements : [Ljava/lang/Object;
/*      */       //   959: astore #63
/*      */       //   961: aload #61
/*      */       //   963: astore #64
/*      */       //   965: iconst_0
/*      */       //   966: istore #65
/*      */       //   968: nop
/*      */       //   969: aload #64
/*      */       //   971: getfield metadata : [J
/*      */       //   974: astore #66
/*      */       //   976: aload #66
/*      */       //   978: arraylength
/*      */       //   979: iconst_2
/*      */       //   980: isub
/*      */       //   981: istore #67
/*      */       //   983: iconst_0
/*      */       //   984: istore #68
/*      */       //   986: iload #68
/*      */       //   988: iload #67
/*      */       //   990: if_icmpgt -> 1156
/*      */       //   993: aload #66
/*      */       //   995: iload #68
/*      */       //   997: laload
/*      */       //   998: lstore #69
/*      */       //   1000: lload #69
/*      */       //   1002: lstore #71
/*      */       //   1004: iconst_0
/*      */       //   1005: istore #73
/*      */       //   1007: lload #71
/*      */       //   1009: lload #71
/*      */       //   1011: ldc2_w -1
/*      */       //   1014: lxor
/*      */       //   1015: bipush #7
/*      */       //   1017: lshl
/*      */       //   1018: land
/*      */       //   1019: ldc2_w -9187201950435737472
/*      */       //   1022: land
/*      */       //   1023: ldc2_w -9187201950435737472
/*      */       //   1026: lcmp
/*      */       //   1027: ifeq -> 1143
/*      */       //   1030: bipush #8
/*      */       //   1032: iload #68
/*      */       //   1034: iload #67
/*      */       //   1036: isub
/*      */       //   1037: iconst_m1
/*      */       //   1038: ixor
/*      */       //   1039: bipush #31
/*      */       //   1041: iushr
/*      */       //   1042: isub
/*      */       //   1043: istore #74
/*      */       //   1045: iconst_0
/*      */       //   1046: istore #75
/*      */       //   1048: iload #75
/*      */       //   1050: iload #74
/*      */       //   1052: if_icmpge -> 1136
/*      */       //   1055: lload #69
/*      */       //   1057: ldc2_w 255
/*      */       //   1060: land
/*      */       //   1061: lstore #76
/*      */       //   1063: iconst_0
/*      */       //   1064: istore #78
/*      */       //   1066: lload #76
/*      */       //   1068: ldc2_w 128
/*      */       //   1071: lcmp
/*      */       //   1072: ifge -> 1079
/*      */       //   1075: iconst_1
/*      */       //   1076: goto -> 1080
/*      */       //   1079: iconst_0
/*      */       //   1080: ifeq -> 1123
/*      */       //   1083: iload #68
/*      */       //   1085: iconst_3
/*      */       //   1086: ishl
/*      */       //   1087: iload #75
/*      */       //   1089: iadd
/*      */       //   1090: istore #73
/*      */       //   1092: iload #73
/*      */       //   1094: istore #79
/*      */       //   1096: iconst_0
/*      */       //   1097: istore #80
/*      */       //   1099: aload #63
/*      */       //   1101: iload #79
/*      */       //   1103: aaload
/*      */       //   1104: astore #81
/*      */       //   1106: iconst_0
/*      */       //   1107: istore #82
/*      */       //   1109: aload #6
/*      */       //   1111: aload #81
/*      */       //   1113: invokevirtual add : (Ljava/lang/Object;)Z
/*      */       //   1116: pop
/*      */       //   1117: iconst_1
/*      */       //   1118: istore_2
/*      */       //   1119: nop
/*      */       //   1120: nop
/*      */       //   1121: nop
/*      */       //   1122: nop
/*      */       //   1123: lload #69
/*      */       //   1125: bipush #8
/*      */       //   1127: lshr
/*      */       //   1128: lstore #69
/*      */       //   1130: iinc #75, 1
/*      */       //   1133: goto -> 1048
/*      */       //   1136: iload #74
/*      */       //   1138: bipush #8
/*      */       //   1140: if_icmpne -> 1157
/*      */       //   1143: iload #68
/*      */       //   1145: iload #67
/*      */       //   1147: if_icmpeq -> 1156
/*      */       //   1150: iinc #68, 1
/*      */       //   1153: goto -> 993
/*      */       //   1156: nop
/*      */       //   1157: nop
/*      */       //   1158: goto -> 1180
/*      */       //   1161: aload #60
/*      */       //   1163: astore #81
/*      */       //   1165: iconst_0
/*      */       //   1166: istore #82
/*      */       //   1168: aload #6
/*      */       //   1170: aload #81
/*      */       //   1172: invokevirtual add : (Ljava/lang/Object;)Z
/*      */       //   1175: pop
/*      */       //   1176: iconst_1
/*      */       //   1177: istore_2
/*      */       //   1178: nop
/*      */       //   1179: nop
/*      */       //   1180: nop
/*      */       //   1181: goto -> 1194
/*      */       //   1184: aload_0
/*      */       //   1185: getfield statesToReread : Landroidx/compose/runtime/collection/MutableVector;
/*      */       //   1188: aload #54
/*      */       //   1190: invokevirtual add : (Ljava/lang/Object;)Z
/*      */       //   1193: pop
/*      */       //   1194: nop
/*      */       //   1195: nop
/*      */       //   1196: nop
/*      */       //   1197: aload #5
/*      */       //   1199: astore #31
/*      */       //   1201: iconst_0
/*      */       //   1202: istore #32
/*      */       //   1204: aload #31
/*      */       //   1206: invokevirtual getMap : ()Landroidx/collection/MutableScatterMap;
/*      */       //   1209: aload #29
/*      */       //   1211: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   1214: astore #33
/*      */       //   1216: aload #33
/*      */       //   1218: ifnull -> 1469
/*      */       //   1221: aload #33
/*      */       //   1223: instanceof androidx/collection/MutableScatterSet
/*      */       //   1226: ifeq -> 1450
/*      */       //   1229: aload #33
/*      */       //   1231: checkcast androidx/collection/MutableScatterSet
/*      */       //   1234: checkcast androidx/collection/ScatterSet
/*      */       //   1237: astore #34
/*      */       //   1239: iconst_0
/*      */       //   1240: istore #35
/*      */       //   1242: nop
/*      */       //   1243: aload #34
/*      */       //   1245: getfield elements : [Ljava/lang/Object;
/*      */       //   1248: astore #36
/*      */       //   1250: aload #34
/*      */       //   1252: astore #37
/*      */       //   1254: iconst_0
/*      */       //   1255: istore #38
/*      */       //   1257: nop
/*      */       //   1258: aload #37
/*      */       //   1260: getfield metadata : [J
/*      */       //   1263: astore #39
/*      */       //   1265: aload #39
/*      */       //   1267: arraylength
/*      */       //   1268: iconst_2
/*      */       //   1269: isub
/*      */       //   1270: istore #40
/*      */       //   1272: iconst_0
/*      */       //   1273: istore #41
/*      */       //   1275: iload #41
/*      */       //   1277: iload #40
/*      */       //   1279: if_icmpgt -> 1445
/*      */       //   1282: aload #39
/*      */       //   1284: iload #41
/*      */       //   1286: laload
/*      */       //   1287: lstore #42
/*      */       //   1289: lload #42
/*      */       //   1291: lstore #44
/*      */       //   1293: iconst_0
/*      */       //   1294: istore #46
/*      */       //   1296: lload #44
/*      */       //   1298: lload #44
/*      */       //   1300: ldc2_w -1
/*      */       //   1303: lxor
/*      */       //   1304: bipush #7
/*      */       //   1306: lshl
/*      */       //   1307: land
/*      */       //   1308: ldc2_w -9187201950435737472
/*      */       //   1311: land
/*      */       //   1312: ldc2_w -9187201950435737472
/*      */       //   1315: lcmp
/*      */       //   1316: ifeq -> 1432
/*      */       //   1319: bipush #8
/*      */       //   1321: iload #41
/*      */       //   1323: iload #40
/*      */       //   1325: isub
/*      */       //   1326: iconst_m1
/*      */       //   1327: ixor
/*      */       //   1328: bipush #31
/*      */       //   1330: iushr
/*      */       //   1331: isub
/*      */       //   1332: istore #47
/*      */       //   1334: iconst_0
/*      */       //   1335: istore #48
/*      */       //   1337: iload #48
/*      */       //   1339: iload #47
/*      */       //   1341: if_icmpge -> 1425
/*      */       //   1344: lload #42
/*      */       //   1346: ldc2_w 255
/*      */       //   1349: land
/*      */       //   1350: lstore #49
/*      */       //   1352: iconst_0
/*      */       //   1353: istore #51
/*      */       //   1355: lload #49
/*      */       //   1357: ldc2_w 128
/*      */       //   1360: lcmp
/*      */       //   1361: ifge -> 1368
/*      */       //   1364: iconst_1
/*      */       //   1365: goto -> 1369
/*      */       //   1368: iconst_0
/*      */       //   1369: ifeq -> 1412
/*      */       //   1372: iload #41
/*      */       //   1374: iconst_3
/*      */       //   1375: ishl
/*      */       //   1376: iload #48
/*      */       //   1378: iadd
/*      */       //   1379: istore #46
/*      */       //   1381: iload #46
/*      */       //   1383: istore #52
/*      */       //   1385: iconst_0
/*      */       //   1386: istore #53
/*      */       //   1388: aload #36
/*      */       //   1390: iload #52
/*      */       //   1392: aaload
/*      */       //   1393: astore #54
/*      */       //   1395: iconst_0
/*      */       //   1396: istore #55
/*      */       //   1398: aload #6
/*      */       //   1400: aload #54
/*      */       //   1402: invokevirtual add : (Ljava/lang/Object;)Z
/*      */       //   1405: pop
/*      */       //   1406: iconst_1
/*      */       //   1407: istore_2
/*      */       //   1408: nop
/*      */       //   1409: nop
/*      */       //   1410: nop
/*      */       //   1411: nop
/*      */       //   1412: lload #42
/*      */       //   1414: bipush #8
/*      */       //   1416: lshr
/*      */       //   1417: lstore #42
/*      */       //   1419: iinc #48, 1
/*      */       //   1422: goto -> 1337
/*      */       //   1425: iload #47
/*      */       //   1427: bipush #8
/*      */       //   1429: if_icmpne -> 1446
/*      */       //   1432: iload #41
/*      */       //   1434: iload #40
/*      */       //   1436: if_icmpeq -> 1445
/*      */       //   1439: iinc #41, 1
/*      */       //   1442: goto -> 1282
/*      */       //   1445: nop
/*      */       //   1446: nop
/*      */       //   1447: goto -> 1469
/*      */       //   1450: aload #33
/*      */       //   1452: astore #54
/*      */       //   1454: iconst_0
/*      */       //   1455: istore #55
/*      */       //   1457: aload #6
/*      */       //   1459: aload #54
/*      */       //   1461: invokevirtual add : (Ljava/lang/Object;)Z
/*      */       //   1464: pop
/*      */       //   1465: iconst_1
/*      */       //   1466: istore_2
/*      */       //   1467: nop
/*      */       //   1468: nop
/*      */       //   1469: nop
/*      */       //   1470: nop
/*      */       //   1471: nop
/*      */       //   1472: nop
/*      */       //   1473: nop
/*      */       //   1474: lload #17
/*      */       //   1476: bipush #8
/*      */       //   1478: lshr
/*      */       //   1479: lstore #17
/*      */       //   1481: iinc #23, 1
/*      */       //   1484: goto -> 154
/*      */       //   1487: iload #22
/*      */       //   1489: bipush #8
/*      */       //   1491: if_icmpne -> 1508
/*      */       //   1494: iload #16
/*      */       //   1496: iload #15
/*      */       //   1498: if_icmpeq -> 1507
/*      */       //   1501: iinc #16, 1
/*      */       //   1504: goto -> 99
/*      */       //   1507: nop
/*      */       //   1508: nop
/*      */       //   1509: goto -> 2818
/*      */       //   1512: aload #7
/*      */       //   1514: checkcast java/lang/Iterable
/*      */       //   1517: astore #9
/*      */       //   1519: iconst_0
/*      */       //   1520: istore #10
/*      */       //   1522: aload #9
/*      */       //   1524: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */       //   1529: astore #11
/*      */       //   1531: aload #11
/*      */       //   1533: invokeinterface hasNext : ()Z
/*      */       //   1538: ifeq -> 2817
/*      */       //   1541: aload #11
/*      */       //   1543: invokeinterface next : ()Ljava/lang/Object;
/*      */       //   1548: astore #12
/*      */       //   1550: aload #12
/*      */       //   1552: astore #29
/*      */       //   1554: iconst_0
/*      */       //   1555: istore #30
/*      */       //   1557: aload #29
/*      */       //   1559: instanceof androidx/compose/runtime/snapshots/StateObjectImpl
/*      */       //   1562: ifeq -> 1591
/*      */       //   1565: aload #29
/*      */       //   1567: checkcast androidx/compose/runtime/snapshots/StateObjectImpl
/*      */       //   1570: getstatic androidx/compose/runtime/snapshots/ReaderKind.Companion : Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
/*      */       //   1573: astore #31
/*      */       //   1575: iconst_0
/*      */       //   1576: istore #32
/*      */       //   1578: iconst_2
/*      */       //   1579: invokestatic constructor-impl : (I)I
/*      */       //   1582: invokevirtual isReadIn-h_f27i8$runtime : (I)Z
/*      */       //   1585: ifne -> 1591
/*      */       //   1588: goto -> 2813
/*      */       //   1591: aload_3
/*      */       //   1592: aload #29
/*      */       //   1594: invokevirtual contains : (Ljava/lang/Object;)Z
/*      */       //   1597: ifeq -> 2539
/*      */       //   1600: aload_3
/*      */       //   1601: astore #31
/*      */       //   1603: iconst_0
/*      */       //   1604: istore #32
/*      */       //   1606: aload #31
/*      */       //   1608: invokevirtual getMap : ()Landroidx/collection/MutableScatterMap;
/*      */       //   1611: aload #29
/*      */       //   1613: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   1616: astore #33
/*      */       //   1618: aload #33
/*      */       //   1620: ifnull -> 2538
/*      */       //   1623: aload #33
/*      */       //   1625: instanceof androidx/collection/MutableScatterSet
/*      */       //   1628: ifeq -> 2189
/*      */       //   1631: aload #33
/*      */       //   1633: checkcast androidx/collection/MutableScatterSet
/*      */       //   1636: checkcast androidx/collection/ScatterSet
/*      */       //   1639: astore #34
/*      */       //   1641: iconst_0
/*      */       //   1642: istore #35
/*      */       //   1644: nop
/*      */       //   1645: aload #34
/*      */       //   1647: getfield elements : [Ljava/lang/Object;
/*      */       //   1650: astore #36
/*      */       //   1652: aload #34
/*      */       //   1654: astore #37
/*      */       //   1656: iconst_0
/*      */       //   1657: istore #38
/*      */       //   1659: nop
/*      */       //   1660: aload #37
/*      */       //   1662: getfield metadata : [J
/*      */       //   1665: astore #39
/*      */       //   1667: aload #39
/*      */       //   1669: arraylength
/*      */       //   1670: iconst_2
/*      */       //   1671: isub
/*      */       //   1672: istore #40
/*      */       //   1674: iconst_0
/*      */       //   1675: istore #41
/*      */       //   1677: iload #41
/*      */       //   1679: iload #40
/*      */       //   1681: if_icmpgt -> 2184
/*      */       //   1684: aload #39
/*      */       //   1686: iload #41
/*      */       //   1688: laload
/*      */       //   1689: lstore #42
/*      */       //   1691: lload #42
/*      */       //   1693: lstore #44
/*      */       //   1695: iconst_0
/*      */       //   1696: istore #46
/*      */       //   1698: lload #44
/*      */       //   1700: lload #44
/*      */       //   1702: ldc2_w -1
/*      */       //   1705: lxor
/*      */       //   1706: bipush #7
/*      */       //   1708: lshl
/*      */       //   1709: land
/*      */       //   1710: ldc2_w -9187201950435737472
/*      */       //   1713: land
/*      */       //   1714: ldc2_w -9187201950435737472
/*      */       //   1717: lcmp
/*      */       //   1718: ifeq -> 2171
/*      */       //   1721: bipush #8
/*      */       //   1723: iload #41
/*      */       //   1725: iload #40
/*      */       //   1727: isub
/*      */       //   1728: iconst_m1
/*      */       //   1729: ixor
/*      */       //   1730: bipush #31
/*      */       //   1732: iushr
/*      */       //   1733: isub
/*      */       //   1734: istore #47
/*      */       //   1736: iconst_0
/*      */       //   1737: istore #48
/*      */       //   1739: iload #48
/*      */       //   1741: iload #47
/*      */       //   1743: if_icmpge -> 2164
/*      */       //   1746: lload #42
/*      */       //   1748: ldc2_w 255
/*      */       //   1751: land
/*      */       //   1752: lstore #49
/*      */       //   1754: iconst_0
/*      */       //   1755: istore #51
/*      */       //   1757: lload #49
/*      */       //   1759: ldc2_w 128
/*      */       //   1762: lcmp
/*      */       //   1763: ifge -> 1770
/*      */       //   1766: iconst_1
/*      */       //   1767: goto -> 1771
/*      */       //   1770: iconst_0
/*      */       //   1771: ifeq -> 2151
/*      */       //   1774: iload #41
/*      */       //   1776: iconst_3
/*      */       //   1777: ishl
/*      */       //   1778: iload #48
/*      */       //   1780: iadd
/*      */       //   1781: istore #46
/*      */       //   1783: iload #46
/*      */       //   1785: istore #52
/*      */       //   1787: iconst_0
/*      */       //   1788: istore #53
/*      */       //   1790: aload #36
/*      */       //   1792: iload #52
/*      */       //   1794: aaload
/*      */       //   1795: checkcast androidx/compose/runtime/DerivedState
/*      */       //   1798: astore #54
/*      */       //   1800: iconst_0
/*      */       //   1801: istore #55
/*      */       //   1803: aload #54
/*      */       //   1805: ldc_w 'null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>'
/*      */       //   1808: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */       //   1811: aload #4
/*      */       //   1813: aload #54
/*      */       //   1815: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   1818: astore #56
/*      */       //   1820: aload #54
/*      */       //   1822: invokeinterface getPolicy : ()Landroidx/compose/runtime/SnapshotMutationPolicy;
/*      */       //   1827: dup
/*      */       //   1828: ifnonnull -> 1835
/*      */       //   1831: pop
/*      */       //   1832: invokestatic structuralEqualityPolicy : ()Landroidx/compose/runtime/SnapshotMutationPolicy;
/*      */       //   1835: astore #57
/*      */       //   1837: aload #57
/*      */       //   1839: aload #54
/*      */       //   1841: invokeinterface getCurrentRecord : ()Landroidx/compose/runtime/DerivedState$Record;
/*      */       //   1846: invokeinterface getCurrentValue : ()Ljava/lang/Object;
/*      */       //   1851: aload #56
/*      */       //   1853: invokeinterface equivalent : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */       //   1858: ifne -> 2137
/*      */       //   1861: aload #5
/*      */       //   1863: astore #58
/*      */       //   1865: iconst_0
/*      */       //   1866: istore #59
/*      */       //   1868: aload #58
/*      */       //   1870: invokevirtual getMap : ()Landroidx/collection/MutableScatterMap;
/*      */       //   1873: aload #54
/*      */       //   1875: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   1878: astore #60
/*      */       //   1880: aload #60
/*      */       //   1882: ifnull -> 2133
/*      */       //   1885: aload #60
/*      */       //   1887: instanceof androidx/collection/MutableScatterSet
/*      */       //   1890: ifeq -> 2114
/*      */       //   1893: aload #60
/*      */       //   1895: checkcast androidx/collection/MutableScatterSet
/*      */       //   1898: checkcast androidx/collection/ScatterSet
/*      */       //   1901: astore #61
/*      */       //   1903: iconst_0
/*      */       //   1904: istore #62
/*      */       //   1906: nop
/*      */       //   1907: aload #61
/*      */       //   1909: getfield elements : [Ljava/lang/Object;
/*      */       //   1912: astore #63
/*      */       //   1914: aload #61
/*      */       //   1916: astore #64
/*      */       //   1918: iconst_0
/*      */       //   1919: istore #65
/*      */       //   1921: nop
/*      */       //   1922: aload #64
/*      */       //   1924: getfield metadata : [J
/*      */       //   1927: astore #66
/*      */       //   1929: aload #66
/*      */       //   1931: arraylength
/*      */       //   1932: iconst_2
/*      */       //   1933: isub
/*      */       //   1934: istore #67
/*      */       //   1936: iconst_0
/*      */       //   1937: istore #68
/*      */       //   1939: iload #68
/*      */       //   1941: iload #67
/*      */       //   1943: if_icmpgt -> 2109
/*      */       //   1946: aload #66
/*      */       //   1948: iload #68
/*      */       //   1950: laload
/*      */       //   1951: lstore #69
/*      */       //   1953: lload #69
/*      */       //   1955: lstore #71
/*      */       //   1957: iconst_0
/*      */       //   1958: istore #73
/*      */       //   1960: lload #71
/*      */       //   1962: lload #71
/*      */       //   1964: ldc2_w -1
/*      */       //   1967: lxor
/*      */       //   1968: bipush #7
/*      */       //   1970: lshl
/*      */       //   1971: land
/*      */       //   1972: ldc2_w -9187201950435737472
/*      */       //   1975: land
/*      */       //   1976: ldc2_w -9187201950435737472
/*      */       //   1979: lcmp
/*      */       //   1980: ifeq -> 2096
/*      */       //   1983: bipush #8
/*      */       //   1985: iload #68
/*      */       //   1987: iload #67
/*      */       //   1989: isub
/*      */       //   1990: iconst_m1
/*      */       //   1991: ixor
/*      */       //   1992: bipush #31
/*      */       //   1994: iushr
/*      */       //   1995: isub
/*      */       //   1996: istore #74
/*      */       //   1998: iconst_0
/*      */       //   1999: istore #75
/*      */       //   2001: iload #75
/*      */       //   2003: iload #74
/*      */       //   2005: if_icmpge -> 2089
/*      */       //   2008: lload #69
/*      */       //   2010: ldc2_w 255
/*      */       //   2013: land
/*      */       //   2014: lstore #76
/*      */       //   2016: iconst_0
/*      */       //   2017: istore #78
/*      */       //   2019: lload #76
/*      */       //   2021: ldc2_w 128
/*      */       //   2024: lcmp
/*      */       //   2025: ifge -> 2032
/*      */       //   2028: iconst_1
/*      */       //   2029: goto -> 2033
/*      */       //   2032: iconst_0
/*      */       //   2033: ifeq -> 2076
/*      */       //   2036: iload #68
/*      */       //   2038: iconst_3
/*      */       //   2039: ishl
/*      */       //   2040: iload #75
/*      */       //   2042: iadd
/*      */       //   2043: istore #73
/*      */       //   2045: iload #73
/*      */       //   2047: istore #79
/*      */       //   2049: iconst_0
/*      */       //   2050: istore #80
/*      */       //   2052: aload #63
/*      */       //   2054: iload #79
/*      */       //   2056: aaload
/*      */       //   2057: astore #81
/*      */       //   2059: iconst_0
/*      */       //   2060: istore #82
/*      */       //   2062: aload #6
/*      */       //   2064: aload #81
/*      */       //   2066: invokevirtual add : (Ljava/lang/Object;)Z
/*      */       //   2069: pop
/*      */       //   2070: iconst_1
/*      */       //   2071: istore_2
/*      */       //   2072: nop
/*      */       //   2073: nop
/*      */       //   2074: nop
/*      */       //   2075: nop
/*      */       //   2076: lload #69
/*      */       //   2078: bipush #8
/*      */       //   2080: lshr
/*      */       //   2081: lstore #69
/*      */       //   2083: iinc #75, 1
/*      */       //   2086: goto -> 2001
/*      */       //   2089: iload #74
/*      */       //   2091: bipush #8
/*      */       //   2093: if_icmpne -> 2110
/*      */       //   2096: iload #68
/*      */       //   2098: iload #67
/*      */       //   2100: if_icmpeq -> 2109
/*      */       //   2103: iinc #68, 1
/*      */       //   2106: goto -> 1946
/*      */       //   2109: nop
/*      */       //   2110: nop
/*      */       //   2111: goto -> 2133
/*      */       //   2114: aload #60
/*      */       //   2116: astore #81
/*      */       //   2118: iconst_0
/*      */       //   2119: istore #82
/*      */       //   2121: aload #6
/*      */       //   2123: aload #81
/*      */       //   2125: invokevirtual add : (Ljava/lang/Object;)Z
/*      */       //   2128: pop
/*      */       //   2129: iconst_1
/*      */       //   2130: istore_2
/*      */       //   2131: nop
/*      */       //   2132: nop
/*      */       //   2133: nop
/*      */       //   2134: goto -> 2147
/*      */       //   2137: aload_0
/*      */       //   2138: getfield statesToReread : Landroidx/compose/runtime/collection/MutableVector;
/*      */       //   2141: aload #54
/*      */       //   2143: invokevirtual add : (Ljava/lang/Object;)Z
/*      */       //   2146: pop
/*      */       //   2147: nop
/*      */       //   2148: nop
/*      */       //   2149: nop
/*      */       //   2150: nop
/*      */       //   2151: lload #42
/*      */       //   2153: bipush #8
/*      */       //   2155: lshr
/*      */       //   2156: lstore #42
/*      */       //   2158: iinc #48, 1
/*      */       //   2161: goto -> 1739
/*      */       //   2164: iload #47
/*      */       //   2166: bipush #8
/*      */       //   2168: if_icmpne -> 2185
/*      */       //   2171: iload #41
/*      */       //   2173: iload #40
/*      */       //   2175: if_icmpeq -> 2184
/*      */       //   2178: iinc #41, 1
/*      */       //   2181: goto -> 1684
/*      */       //   2184: nop
/*      */       //   2185: nop
/*      */       //   2186: goto -> 2538
/*      */       //   2189: aload #33
/*      */       //   2191: checkcast androidx/compose/runtime/DerivedState
/*      */       //   2194: astore #54
/*      */       //   2196: iconst_0
/*      */       //   2197: istore #55
/*      */       //   2199: nop
/*      */       //   2200: aload #4
/*      */       //   2202: aload #54
/*      */       //   2204: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   2207: astore #56
/*      */       //   2209: aload #54
/*      */       //   2211: invokeinterface getPolicy : ()Landroidx/compose/runtime/SnapshotMutationPolicy;
/*      */       //   2216: dup
/*      */       //   2217: ifnonnull -> 2224
/*      */       //   2220: pop
/*      */       //   2221: invokestatic structuralEqualityPolicy : ()Landroidx/compose/runtime/SnapshotMutationPolicy;
/*      */       //   2224: astore #57
/*      */       //   2226: aload #57
/*      */       //   2228: aload #54
/*      */       //   2230: invokeinterface getCurrentRecord : ()Landroidx/compose/runtime/DerivedState$Record;
/*      */       //   2235: invokeinterface getCurrentValue : ()Ljava/lang/Object;
/*      */       //   2240: aload #56
/*      */       //   2242: invokeinterface equivalent : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */       //   2247: ifne -> 2526
/*      */       //   2250: aload #5
/*      */       //   2252: astore #58
/*      */       //   2254: iconst_0
/*      */       //   2255: istore #59
/*      */       //   2257: aload #58
/*      */       //   2259: invokevirtual getMap : ()Landroidx/collection/MutableScatterMap;
/*      */       //   2262: aload #54
/*      */       //   2264: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   2267: astore #60
/*      */       //   2269: aload #60
/*      */       //   2271: ifnull -> 2522
/*      */       //   2274: aload #60
/*      */       //   2276: instanceof androidx/collection/MutableScatterSet
/*      */       //   2279: ifeq -> 2503
/*      */       //   2282: aload #60
/*      */       //   2284: checkcast androidx/collection/MutableScatterSet
/*      */       //   2287: checkcast androidx/collection/ScatterSet
/*      */       //   2290: astore #61
/*      */       //   2292: iconst_0
/*      */       //   2293: istore #62
/*      */       //   2295: nop
/*      */       //   2296: aload #61
/*      */       //   2298: getfield elements : [Ljava/lang/Object;
/*      */       //   2301: astore #63
/*      */       //   2303: aload #61
/*      */       //   2305: astore #64
/*      */       //   2307: iconst_0
/*      */       //   2308: istore #65
/*      */       //   2310: nop
/*      */       //   2311: aload #64
/*      */       //   2313: getfield metadata : [J
/*      */       //   2316: astore #66
/*      */       //   2318: aload #66
/*      */       //   2320: arraylength
/*      */       //   2321: iconst_2
/*      */       //   2322: isub
/*      */       //   2323: istore #67
/*      */       //   2325: iconst_0
/*      */       //   2326: istore #68
/*      */       //   2328: iload #68
/*      */       //   2330: iload #67
/*      */       //   2332: if_icmpgt -> 2498
/*      */       //   2335: aload #66
/*      */       //   2337: iload #68
/*      */       //   2339: laload
/*      */       //   2340: lstore #69
/*      */       //   2342: lload #69
/*      */       //   2344: lstore #71
/*      */       //   2346: iconst_0
/*      */       //   2347: istore #73
/*      */       //   2349: lload #71
/*      */       //   2351: lload #71
/*      */       //   2353: ldc2_w -1
/*      */       //   2356: lxor
/*      */       //   2357: bipush #7
/*      */       //   2359: lshl
/*      */       //   2360: land
/*      */       //   2361: ldc2_w -9187201950435737472
/*      */       //   2364: land
/*      */       //   2365: ldc2_w -9187201950435737472
/*      */       //   2368: lcmp
/*      */       //   2369: ifeq -> 2485
/*      */       //   2372: bipush #8
/*      */       //   2374: iload #68
/*      */       //   2376: iload #67
/*      */       //   2378: isub
/*      */       //   2379: iconst_m1
/*      */       //   2380: ixor
/*      */       //   2381: bipush #31
/*      */       //   2383: iushr
/*      */       //   2384: isub
/*      */       //   2385: istore #74
/*      */       //   2387: iconst_0
/*      */       //   2388: istore #75
/*      */       //   2390: iload #75
/*      */       //   2392: iload #74
/*      */       //   2394: if_icmpge -> 2478
/*      */       //   2397: lload #69
/*      */       //   2399: ldc2_w 255
/*      */       //   2402: land
/*      */       //   2403: lstore #76
/*      */       //   2405: iconst_0
/*      */       //   2406: istore #78
/*      */       //   2408: lload #76
/*      */       //   2410: ldc2_w 128
/*      */       //   2413: lcmp
/*      */       //   2414: ifge -> 2421
/*      */       //   2417: iconst_1
/*      */       //   2418: goto -> 2422
/*      */       //   2421: iconst_0
/*      */       //   2422: ifeq -> 2465
/*      */       //   2425: iload #68
/*      */       //   2427: iconst_3
/*      */       //   2428: ishl
/*      */       //   2429: iload #75
/*      */       //   2431: iadd
/*      */       //   2432: istore #73
/*      */       //   2434: iload #73
/*      */       //   2436: istore #79
/*      */       //   2438: iconst_0
/*      */       //   2439: istore #80
/*      */       //   2441: aload #63
/*      */       //   2443: iload #79
/*      */       //   2445: aaload
/*      */       //   2446: astore #81
/*      */       //   2448: iconst_0
/*      */       //   2449: istore #82
/*      */       //   2451: aload #6
/*      */       //   2453: aload #81
/*      */       //   2455: invokevirtual add : (Ljava/lang/Object;)Z
/*      */       //   2458: pop
/*      */       //   2459: iconst_1
/*      */       //   2460: istore_2
/*      */       //   2461: nop
/*      */       //   2462: nop
/*      */       //   2463: nop
/*      */       //   2464: nop
/*      */       //   2465: lload #69
/*      */       //   2467: bipush #8
/*      */       //   2469: lshr
/*      */       //   2470: lstore #69
/*      */       //   2472: iinc #75, 1
/*      */       //   2475: goto -> 2390
/*      */       //   2478: iload #74
/*      */       //   2480: bipush #8
/*      */       //   2482: if_icmpne -> 2499
/*      */       //   2485: iload #68
/*      */       //   2487: iload #67
/*      */       //   2489: if_icmpeq -> 2498
/*      */       //   2492: iinc #68, 1
/*      */       //   2495: goto -> 2335
/*      */       //   2498: nop
/*      */       //   2499: nop
/*      */       //   2500: goto -> 2522
/*      */       //   2503: aload #60
/*      */       //   2505: astore #81
/*      */       //   2507: iconst_0
/*      */       //   2508: istore #82
/*      */       //   2510: aload #6
/*      */       //   2512: aload #81
/*      */       //   2514: invokevirtual add : (Ljava/lang/Object;)Z
/*      */       //   2517: pop
/*      */       //   2518: iconst_1
/*      */       //   2519: istore_2
/*      */       //   2520: nop
/*      */       //   2521: nop
/*      */       //   2522: nop
/*      */       //   2523: goto -> 2536
/*      */       //   2526: aload_0
/*      */       //   2527: getfield statesToReread : Landroidx/compose/runtime/collection/MutableVector;
/*      */       //   2530: aload #54
/*      */       //   2532: invokevirtual add : (Ljava/lang/Object;)Z
/*      */       //   2535: pop
/*      */       //   2536: nop
/*      */       //   2537: nop
/*      */       //   2538: nop
/*      */       //   2539: aload #5
/*      */       //   2541: astore #31
/*      */       //   2543: iconst_0
/*      */       //   2544: istore #32
/*      */       //   2546: aload #31
/*      */       //   2548: invokevirtual getMap : ()Landroidx/collection/MutableScatterMap;
/*      */       //   2551: aload #29
/*      */       //   2553: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   2556: astore #33
/*      */       //   2558: aload #33
/*      */       //   2560: ifnull -> 2811
/*      */       //   2563: aload #33
/*      */       //   2565: instanceof androidx/collection/MutableScatterSet
/*      */       //   2568: ifeq -> 2792
/*      */       //   2571: aload #33
/*      */       //   2573: checkcast androidx/collection/MutableScatterSet
/*      */       //   2576: checkcast androidx/collection/ScatterSet
/*      */       //   2579: astore #34
/*      */       //   2581: iconst_0
/*      */       //   2582: istore #35
/*      */       //   2584: nop
/*      */       //   2585: aload #34
/*      */       //   2587: getfield elements : [Ljava/lang/Object;
/*      */       //   2590: astore #36
/*      */       //   2592: aload #34
/*      */       //   2594: astore #37
/*      */       //   2596: iconst_0
/*      */       //   2597: istore #38
/*      */       //   2599: nop
/*      */       //   2600: aload #37
/*      */       //   2602: getfield metadata : [J
/*      */       //   2605: astore #39
/*      */       //   2607: aload #39
/*      */       //   2609: arraylength
/*      */       //   2610: iconst_2
/*      */       //   2611: isub
/*      */       //   2612: istore #40
/*      */       //   2614: iconst_0
/*      */       //   2615: istore #41
/*      */       //   2617: iload #41
/*      */       //   2619: iload #40
/*      */       //   2621: if_icmpgt -> 2787
/*      */       //   2624: aload #39
/*      */       //   2626: iload #41
/*      */       //   2628: laload
/*      */       //   2629: lstore #42
/*      */       //   2631: lload #42
/*      */       //   2633: lstore #44
/*      */       //   2635: iconst_0
/*      */       //   2636: istore #46
/*      */       //   2638: lload #44
/*      */       //   2640: lload #44
/*      */       //   2642: ldc2_w -1
/*      */       //   2645: lxor
/*      */       //   2646: bipush #7
/*      */       //   2648: lshl
/*      */       //   2649: land
/*      */       //   2650: ldc2_w -9187201950435737472
/*      */       //   2653: land
/*      */       //   2654: ldc2_w -9187201950435737472
/*      */       //   2657: lcmp
/*      */       //   2658: ifeq -> 2774
/*      */       //   2661: bipush #8
/*      */       //   2663: iload #41
/*      */       //   2665: iload #40
/*      */       //   2667: isub
/*      */       //   2668: iconst_m1
/*      */       //   2669: ixor
/*      */       //   2670: bipush #31
/*      */       //   2672: iushr
/*      */       //   2673: isub
/*      */       //   2674: istore #47
/*      */       //   2676: iconst_0
/*      */       //   2677: istore #48
/*      */       //   2679: iload #48
/*      */       //   2681: iload #47
/*      */       //   2683: if_icmpge -> 2767
/*      */       //   2686: lload #42
/*      */       //   2688: ldc2_w 255
/*      */       //   2691: land
/*      */       //   2692: lstore #49
/*      */       //   2694: iconst_0
/*      */       //   2695: istore #51
/*      */       //   2697: lload #49
/*      */       //   2699: ldc2_w 128
/*      */       //   2702: lcmp
/*      */       //   2703: ifge -> 2710
/*      */       //   2706: iconst_1
/*      */       //   2707: goto -> 2711
/*      */       //   2710: iconst_0
/*      */       //   2711: ifeq -> 2754
/*      */       //   2714: iload #41
/*      */       //   2716: iconst_3
/*      */       //   2717: ishl
/*      */       //   2718: iload #48
/*      */       //   2720: iadd
/*      */       //   2721: istore #46
/*      */       //   2723: iload #46
/*      */       //   2725: istore #52
/*      */       //   2727: iconst_0
/*      */       //   2728: istore #53
/*      */       //   2730: aload #36
/*      */       //   2732: iload #52
/*      */       //   2734: aaload
/*      */       //   2735: astore #54
/*      */       //   2737: iconst_0
/*      */       //   2738: istore #55
/*      */       //   2740: aload #6
/*      */       //   2742: aload #54
/*      */       //   2744: invokevirtual add : (Ljava/lang/Object;)Z
/*      */       //   2747: pop
/*      */       //   2748: iconst_1
/*      */       //   2749: istore_2
/*      */       //   2750: nop
/*      */       //   2751: nop
/*      */       //   2752: nop
/*      */       //   2753: nop
/*      */       //   2754: lload #42
/*      */       //   2756: bipush #8
/*      */       //   2758: lshr
/*      */       //   2759: lstore #42
/*      */       //   2761: iinc #48, 1
/*      */       //   2764: goto -> 2679
/*      */       //   2767: iload #47
/*      */       //   2769: bipush #8
/*      */       //   2771: if_icmpne -> 2788
/*      */       //   2774: iload #41
/*      */       //   2776: iload #40
/*      */       //   2778: if_icmpeq -> 2787
/*      */       //   2781: iinc #41, 1
/*      */       //   2784: goto -> 2624
/*      */       //   2787: nop
/*      */       //   2788: nop
/*      */       //   2789: goto -> 2811
/*      */       //   2792: aload #33
/*      */       //   2794: astore #54
/*      */       //   2796: iconst_0
/*      */       //   2797: istore #55
/*      */       //   2799: aload #6
/*      */       //   2801: aload #54
/*      */       //   2803: invokevirtual add : (Ljava/lang/Object;)Z
/*      */       //   2806: pop
/*      */       //   2807: iconst_1
/*      */       //   2808: istore_2
/*      */       //   2809: nop
/*      */       //   2810: nop
/*      */       //   2811: nop
/*      */       //   2812: nop
/*      */       //   2813: nop
/*      */       //   2814: goto -> 1531
/*      */       //   2817: nop
/*      */       //   2818: nop
/*      */       //   2819: aload_0
/*      */       //   2820: getfield statesToReread : Landroidx/compose/runtime/collection/MutableVector;
/*      */       //   2823: invokevirtual isNotEmpty : ()Z
/*      */       //   2826: ifeq -> 2903
/*      */       //   2829: aload_0
/*      */       //   2830: getfield statesToReread : Landroidx/compose/runtime/collection/MutableVector;
/*      */       //   2833: astore #7
/*      */       //   2835: iconst_0
/*      */       //   2836: istore #8
/*      */       //   2838: nop
/*      */       //   2839: aload #7
/*      */       //   2841: invokevirtual getSize : ()I
/*      */       //   2844: istore #9
/*      */       //   2846: iload #9
/*      */       //   2848: ifle -> 2895
/*      */       //   2851: iconst_0
/*      */       //   2852: istore #10
/*      */       //   2854: aload #7
/*      */       //   2856: invokevirtual getContent : ()[Ljava/lang/Object;
/*      */       //   2859: astore #11
/*      */       //   2861: aload #11
/*      */       //   2863: iload #10
/*      */       //   2865: aaload
/*      */       //   2866: checkcast androidx/compose/runtime/DerivedState
/*      */       //   2869: astore #12
/*      */       //   2871: iconst_0
/*      */       //   2872: istore #13
/*      */       //   2874: aload_0
/*      */       //   2875: aload #12
/*      */       //   2877: invokevirtual rereadDerivedState : (Landroidx/compose/runtime/DerivedState;)V
/*      */       //   2880: nop
/*      */       //   2881: nop
/*      */       //   2882: iload #10
/*      */       //   2884: iinc #10, 1
/*      */       //   2887: pop
/*      */       //   2888: iload #10
/*      */       //   2890: iload #9
/*      */       //   2892: if_icmplt -> 2861
/*      */       //   2895: nop
/*      */       //   2896: aload_0
/*      */       //   2897: getfield statesToReread : Landroidx/compose/runtime/collection/MutableVector;
/*      */       //   2900: invokevirtual clear : ()V
/*      */       //   2903: iload_2
/*      */       //   2904: ireturn
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #577	-> 7
/*      */       //   #579	-> 9
/*      */       //   #580	-> 14
/*      */       //   #581	-> 20
/*      */       //   #582	-> 26
/*      */       //   #584	-> 32
/*      */       //   #799	-> 38
/*      */       //   #800	-> 40
/*      */       //   #801	-> 46
/*      */       //   #802	-> 59
/*      */       //   #803	-> 60
/*      */       //   #805	-> 67
/*      */       //   #806	-> 74
/*      */       //   #807	-> 75
/*      */       //   #808	-> 82
/*      */       //   #810	-> 89
/*      */       //   #811	-> 99
/*      */       //   #812	-> 106
/*      */       //   #813	-> 113
/*      */       //   #812	-> 129
/*      */       //   #814	-> 136
/*      */       //   #815	-> 151
/*      */       //   #816	-> 161
/*      */       //   #817	-> 172
/*      */       //   #816	-> 186
/*      */       //   #818	-> 189
/*      */       //   #819	-> 198
/*      */       //   #820	-> 205
/*      */       //   #585	-> 215
/*      */       //   #586	-> 223
/*      */       //   #821	-> 236
/*      */       //   #586	-> 240
/*      */       //   #588	-> 246
/*      */       //   #591	-> 249
/*      */       //   #593	-> 258
/*      */       //   #822	-> 264
/*      */       //   #823	-> 276
/*      */       //   #824	-> 281
/*      */       //   #826	-> 289
/*      */       //   #827	-> 302
/*      */       //   #828	-> 303
/*      */       //   #830	-> 310
/*      */       //   #831	-> 317
/*      */       //   #832	-> 318
/*      */       //   #833	-> 325
/*      */       //   #835	-> 332
/*      */       //   #836	-> 342
/*      */       //   #837	-> 349
/*      */       //   #838	-> 356
/*      */       //   #837	-> 372
/*      */       //   #839	-> 379
/*      */       //   #840	-> 394
/*      */       //   #841	-> 404
/*      */       //   #842	-> 415
/*      */       //   #841	-> 429
/*      */       //   #843	-> 432
/*      */       //   #844	-> 441
/*      */       //   #845	-> 448
/*      */       //   #594	-> 461
/*      */       //   #595	-> 469
/*      */       //   #596	-> 478
/*      */       //   #599	-> 495
/*      */       //   #600	-> 497
/*      */       //   #601	-> 509
/*      */       //   #599	-> 511
/*      */       //   #604	-> 519
/*      */       //   #846	-> 526
/*      */       //   #847	-> 538
/*      */       //   #848	-> 543
/*      */       //   #850	-> 551
/*      */       //   #851	-> 564
/*      */       //   #852	-> 565
/*      */       //   #854	-> 572
/*      */       //   #855	-> 579
/*      */       //   #856	-> 580
/*      */       //   #857	-> 587
/*      */       //   #859	-> 594
/*      */       //   #860	-> 604
/*      */       //   #861	-> 611
/*      */       //   #862	-> 618
/*      */       //   #861	-> 634
/*      */       //   #863	-> 641
/*      */       //   #864	-> 656
/*      */       //   #865	-> 666
/*      */       //   #866	-> 677
/*      */       //   #865	-> 691
/*      */       //   #867	-> 694
/*      */       //   #868	-> 703
/*      */       //   #869	-> 710
/*      */       //   #605	-> 720
/*      */       //   #606	-> 728
/*      */       //   #607	-> 730
/*      */       //   #869	-> 731
/*      */       //   #870	-> 732
/*      */       //   #868	-> 733
/*      */       //   #871	-> 734
/*      */       //   #864	-> 741
/*      */       //   #873	-> 747
/*      */       //   #859	-> 754
/*      */       //   #876	-> 767
/*      */       //   #877	-> 768
/*      */       //   #878	-> 772
/*      */       //   #605	-> 779
/*      */       //   #606	-> 787
/*      */       //   #607	-> 789
/*      */       //   #878	-> 790
/*      */       //   #881	-> 791
/*      */       //   #610	-> 795
/*      */       //   #612	-> 805
/*      */       //   #845	-> 806
/*      */       //   #882	-> 807
/*      */       //   #844	-> 808
/*      */       //   #883	-> 809
/*      */       //   #840	-> 816
/*      */       //   #885	-> 822
/*      */       //   #835	-> 829
/*      */       //   #888	-> 842
/*      */       //   #889	-> 843
/*      */       //   #890	-> 847
/*      */       //   #594	-> 857
/*      */       //   #595	-> 858
/*      */       //   #596	-> 867
/*      */       //   #599	-> 884
/*      */       //   #600	-> 886
/*      */       //   #601	-> 898
/*      */       //   #599	-> 900
/*      */       //   #604	-> 908
/*      */       //   #891	-> 915
/*      */       //   #892	-> 927
/*      */       //   #893	-> 932
/*      */       //   #895	-> 940
/*      */       //   #896	-> 953
/*      */       //   #897	-> 954
/*      */       //   #899	-> 961
/*      */       //   #900	-> 968
/*      */       //   #901	-> 969
/*      */       //   #902	-> 976
/*      */       //   #904	-> 983
/*      */       //   #905	-> 993
/*      */       //   #906	-> 1000
/*      */       //   #907	-> 1007
/*      */       //   #906	-> 1023
/*      */       //   #908	-> 1030
/*      */       //   #909	-> 1045
/*      */       //   #910	-> 1055
/*      */       //   #911	-> 1066
/*      */       //   #910	-> 1080
/*      */       //   #912	-> 1083
/*      */       //   #913	-> 1092
/*      */       //   #914	-> 1099
/*      */       //   #605	-> 1109
/*      */       //   #606	-> 1117
/*      */       //   #607	-> 1119
/*      */       //   #914	-> 1120
/*      */       //   #915	-> 1121
/*      */       //   #913	-> 1122
/*      */       //   #916	-> 1123
/*      */       //   #909	-> 1130
/*      */       //   #918	-> 1136
/*      */       //   #904	-> 1143
/*      */       //   #921	-> 1156
/*      */       //   #922	-> 1157
/*      */       //   #923	-> 1161
/*      */       //   #605	-> 1168
/*      */       //   #606	-> 1176
/*      */       //   #607	-> 1178
/*      */       //   #923	-> 1179
/*      */       //   #926	-> 1180
/*      */       //   #610	-> 1184
/*      */       //   #612	-> 1194
/*      */       //   #890	-> 1195
/*      */       //   #927	-> 1196
/*      */       //   #615	-> 1197
/*      */       //   #928	-> 1204
/*      */       //   #929	-> 1216
/*      */       //   #930	-> 1221
/*      */       //   #932	-> 1229
/*      */       //   #933	-> 1242
/*      */       //   #934	-> 1243
/*      */       //   #936	-> 1250
/*      */       //   #937	-> 1257
/*      */       //   #938	-> 1258
/*      */       //   #939	-> 1265
/*      */       //   #941	-> 1272
/*      */       //   #942	-> 1282
/*      */       //   #943	-> 1289
/*      */       //   #944	-> 1296
/*      */       //   #943	-> 1312
/*      */       //   #945	-> 1319
/*      */       //   #946	-> 1334
/*      */       //   #947	-> 1344
/*      */       //   #948	-> 1355
/*      */       //   #947	-> 1369
/*      */       //   #949	-> 1372
/*      */       //   #950	-> 1381
/*      */       //   #951	-> 1388
/*      */       //   #616	-> 1398
/*      */       //   #617	-> 1406
/*      */       //   #618	-> 1408
/*      */       //   #951	-> 1409
/*      */       //   #952	-> 1410
/*      */       //   #950	-> 1411
/*      */       //   #953	-> 1412
/*      */       //   #946	-> 1419
/*      */       //   #955	-> 1425
/*      */       //   #941	-> 1432
/*      */       //   #958	-> 1445
/*      */       //   #959	-> 1446
/*      */       //   #960	-> 1450
/*      */       //   #616	-> 1457
/*      */       //   #617	-> 1465
/*      */       //   #618	-> 1467
/*      */       //   #960	-> 1468
/*      */       //   #963	-> 1469
/*      */       //   #619	-> 1470
/*      */       //   #820	-> 1471
/*      */       //   #964	-> 1472
/*      */       //   #819	-> 1473
/*      */       //   #965	-> 1474
/*      */       //   #815	-> 1481
/*      */       //   #967	-> 1487
/*      */       //   #810	-> 1494
/*      */       //   #970	-> 1507
/*      */       //   #971	-> 1508
/*      */       //   #972	-> 1512
/*      */       //   #973	-> 1522
/*      */       //   #585	-> 1557
/*      */       //   #586	-> 1565
/*      */       //   #821	-> 1578
/*      */       //   #586	-> 1582
/*      */       //   #588	-> 1588
/*      */       //   #591	-> 1591
/*      */       //   #593	-> 1600
/*      */       //   #822	-> 1606
/*      */       //   #823	-> 1618
/*      */       //   #824	-> 1623
/*      */       //   #826	-> 1631
/*      */       //   #974	-> 1644
/*      */       //   #975	-> 1645
/*      */       //   #977	-> 1652
/*      */       //   #978	-> 1659
/*      */       //   #979	-> 1660
/*      */       //   #980	-> 1667
/*      */       //   #982	-> 1674
/*      */       //   #983	-> 1684
/*      */       //   #984	-> 1691
/*      */       //   #985	-> 1698
/*      */       //   #984	-> 1714
/*      */       //   #986	-> 1721
/*      */       //   #987	-> 1736
/*      */       //   #988	-> 1746
/*      */       //   #989	-> 1757
/*      */       //   #988	-> 1771
/*      */       //   #990	-> 1774
/*      */       //   #991	-> 1783
/*      */       //   #992	-> 1790
/*      */       //   #594	-> 1803
/*      */       //   #595	-> 1811
/*      */       //   #596	-> 1820
/*      */       //   #599	-> 1837
/*      */       //   #600	-> 1839
/*      */       //   #601	-> 1851
/*      */       //   #599	-> 1853
/*      */       //   #604	-> 1861
/*      */       //   #993	-> 1868
/*      */       //   #994	-> 1880
/*      */       //   #995	-> 1885
/*      */       //   #997	-> 1893
/*      */       //   #998	-> 1906
/*      */       //   #999	-> 1907
/*      */       //   #1001	-> 1914
/*      */       //   #1002	-> 1921
/*      */       //   #1003	-> 1922
/*      */       //   #1004	-> 1929
/*      */       //   #1006	-> 1936
/*      */       //   #1007	-> 1946
/*      */       //   #1008	-> 1953
/*      */       //   #1009	-> 1960
/*      */       //   #1008	-> 1976
/*      */       //   #1010	-> 1983
/*      */       //   #1011	-> 1998
/*      */       //   #1012	-> 2008
/*      */       //   #1013	-> 2019
/*      */       //   #1012	-> 2033
/*      */       //   #1014	-> 2036
/*      */       //   #1015	-> 2045
/*      */       //   #1016	-> 2052
/*      */       //   #605	-> 2062
/*      */       //   #606	-> 2070
/*      */       //   #607	-> 2072
/*      */       //   #1016	-> 2073
/*      */       //   #1017	-> 2074
/*      */       //   #1015	-> 2075
/*      */       //   #1018	-> 2076
/*      */       //   #1011	-> 2083
/*      */       //   #1020	-> 2089
/*      */       //   #1006	-> 2096
/*      */       //   #1023	-> 2109
/*      */       //   #1024	-> 2110
/*      */       //   #1025	-> 2114
/*      */       //   #605	-> 2121
/*      */       //   #606	-> 2129
/*      */       //   #607	-> 2131
/*      */       //   #1025	-> 2132
/*      */       //   #1028	-> 2133
/*      */       //   #610	-> 2137
/*      */       //   #612	-> 2147
/*      */       //   #992	-> 2148
/*      */       //   #1029	-> 2149
/*      */       //   #991	-> 2150
/*      */       //   #1030	-> 2151
/*      */       //   #987	-> 2158
/*      */       //   #1032	-> 2164
/*      */       //   #982	-> 2171
/*      */       //   #1035	-> 2184
/*      */       //   #1036	-> 2185
/*      */       //   #1037	-> 2189
/*      */       //   #594	-> 2199
/*      */       //   #595	-> 2200
/*      */       //   #596	-> 2209
/*      */       //   #599	-> 2226
/*      */       //   #600	-> 2228
/*      */       //   #601	-> 2240
/*      */       //   #599	-> 2242
/*      */       //   #604	-> 2250
/*      */       //   #1038	-> 2257
/*      */       //   #1039	-> 2269
/*      */       //   #1040	-> 2274
/*      */       //   #1042	-> 2282
/*      */       //   #1043	-> 2295
/*      */       //   #1044	-> 2296
/*      */       //   #1046	-> 2303
/*      */       //   #1047	-> 2310
/*      */       //   #1048	-> 2311
/*      */       //   #1049	-> 2318
/*      */       //   #1051	-> 2325
/*      */       //   #1052	-> 2335
/*      */       //   #1053	-> 2342
/*      */       //   #1054	-> 2349
/*      */       //   #1053	-> 2365
/*      */       //   #1055	-> 2372
/*      */       //   #1056	-> 2387
/*      */       //   #1057	-> 2397
/*      */       //   #1058	-> 2408
/*      */       //   #1057	-> 2422
/*      */       //   #1059	-> 2425
/*      */       //   #1060	-> 2434
/*      */       //   #1061	-> 2441
/*      */       //   #605	-> 2451
/*      */       //   #606	-> 2459
/*      */       //   #607	-> 2461
/*      */       //   #1061	-> 2462
/*      */       //   #1062	-> 2463
/*      */       //   #1060	-> 2464
/*      */       //   #1063	-> 2465
/*      */       //   #1056	-> 2472
/*      */       //   #1065	-> 2478
/*      */       //   #1051	-> 2485
/*      */       //   #1068	-> 2498
/*      */       //   #1069	-> 2499
/*      */       //   #1070	-> 2503
/*      */       //   #605	-> 2510
/*      */       //   #606	-> 2518
/*      */       //   #607	-> 2520
/*      */       //   #1070	-> 2521
/*      */       //   #1073	-> 2522
/*      */       //   #610	-> 2526
/*      */       //   #612	-> 2536
/*      */       //   #1037	-> 2537
/*      */       //   #1074	-> 2538
/*      */       //   #615	-> 2539
/*      */       //   #1075	-> 2546
/*      */       //   #1076	-> 2558
/*      */       //   #1077	-> 2563
/*      */       //   #1079	-> 2571
/*      */       //   #1080	-> 2584
/*      */       //   #1081	-> 2585
/*      */       //   #1083	-> 2592
/*      */       //   #1084	-> 2599
/*      */       //   #1085	-> 2600
/*      */       //   #1086	-> 2607
/*      */       //   #1088	-> 2614
/*      */       //   #1089	-> 2624
/*      */       //   #1090	-> 2631
/*      */       //   #1091	-> 2638
/*      */       //   #1090	-> 2654
/*      */       //   #1092	-> 2661
/*      */       //   #1093	-> 2676
/*      */       //   #1094	-> 2686
/*      */       //   #1095	-> 2697
/*      */       //   #1094	-> 2711
/*      */       //   #1096	-> 2714
/*      */       //   #1097	-> 2723
/*      */       //   #1098	-> 2730
/*      */       //   #616	-> 2740
/*      */       //   #617	-> 2748
/*      */       //   #618	-> 2750
/*      */       //   #1098	-> 2751
/*      */       //   #1099	-> 2752
/*      */       //   #1097	-> 2753
/*      */       //   #1100	-> 2754
/*      */       //   #1093	-> 2761
/*      */       //   #1102	-> 2767
/*      */       //   #1088	-> 2774
/*      */       //   #1105	-> 2787
/*      */       //   #1106	-> 2788
/*      */       //   #1107	-> 2792
/*      */       //   #616	-> 2799
/*      */       //   #617	-> 2807
/*      */       //   #618	-> 2809
/*      */       //   #1107	-> 2810
/*      */       //   #1110	-> 2811
/*      */       //   #619	-> 2812
/*      */       //   #973	-> 2813
/*      */       //   #1111	-> 2817
/*      */       //   #1112	-> 2818
/*      */       //   #621	-> 2819
/*      */       //   #622	-> 2829
/*      */       //   #1113	-> 2838
/*      */       //   #1114	-> 2839
/*      */       //   #1115	-> 2846
/*      */       //   #1116	-> 2851
/*      */       //   #1117	-> 2854
/*      */       //   #1119	-> 2861
/*      */       //   #623	-> 2874
/*      */       //   #624	-> 2880
/*      */       //   #1119	-> 2881
/*      */       //   #1120	-> 2882
/*      */       //   #1121	-> 2888
/*      */       //   #1123	-> 2895
/*      */       //   #625	-> 2896
/*      */       //   #628	-> 2903
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   236	4	32	$i$f$getSnapshotStateObserver-6f8NoZ8	I
/*      */       //   233	7	31	this_$iv	Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
/*      */       //   720	11	82	$i$a$-forEachScopeOf-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$1$1$1	I
/*      */       //   717	14	81	scope	Ljava/lang/Object;
/*      */       //   779	11	82	$i$a$-forEachScopeOf-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$1$1$1	I
/*      */       //   776	14	81	scope	Ljava/lang/Object;
/*      */       //   710	23	80	$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv	I
/*      */       //   707	26	79	index$iv$iv	I
/*      */       //   618	16	73	$i$f$maskEmptyOrDeleted	I
/*      */       //   615	19	71	$this$maskEmptyOrDeleted$iv$iv$iv$iv	J
/*      */       //   677	14	78	$i$f$isFull	I
/*      */       //   674	17	76	value$iv$iv$iv$iv	J
/*      */       //   703	31	73	index$iv$iv$iv	I
/*      */       //   659	88	75	j$iv$iv$iv	I
/*      */       //   656	98	74	bitCount$iv$iv$iv	I
/*      */       //   611	143	69	slot$iv$iv$iv	J
/*      */       //   597	170	68	i$iv$iv$iv	I
/*      */       //   579	189	65	$i$f$forEachIndex	I
/*      */       //   587	181	66	m$iv$iv$iv	[J
/*      */       //   594	174	67	lastIndex$iv$iv$iv	I
/*      */       //   576	192	64	this_$iv$iv$iv	Landroidx/collection/ScatterSet;
/*      */       //   564	205	62	$i$f$forEach	I
/*      */       //   572	197	63	k$iv$iv	[Ljava/lang/Object;
/*      */       //   561	208	61	this_$iv$iv	Landroidx/collection/ScatterSet;
/*      */       //   538	253	60	value$iv	Ljava/lang/Object;
/*      */       //   526	266	59	$i$f$forEachScopeOf	I
/*      */       //   523	269	58	this_$iv	Landroidx/compose/runtime/collection/ScopeMap;
/*      */       //   461	345	55	$i$a$-forEachScopeOf-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$1$1	I
/*      */       //   478	328	56	previousValue	Ljava/lang/Object;
/*      */       //   495	311	57	policy	Landroidx/compose/runtime/SnapshotMutationPolicy;
/*      */       //   458	348	54	derivedState	Landroidx/compose/runtime/DerivedState;
/*      */       //   1109	11	82	$i$a$-forEachScopeOf-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$1$1$1	I
/*      */       //   1106	14	81	scope	Ljava/lang/Object;
/*      */       //   1168	11	82	$i$a$-forEachScopeOf-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$1$1$1	I
/*      */       //   1165	14	81	scope	Ljava/lang/Object;
/*      */       //   1099	23	80	$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv	I
/*      */       //   1096	26	79	index$iv$iv	I
/*      */       //   1007	16	73	$i$f$maskEmptyOrDeleted	I
/*      */       //   1004	19	71	$this$maskEmptyOrDeleted$iv$iv$iv$iv	J
/*      */       //   1066	14	78	$i$f$isFull	I
/*      */       //   1063	17	76	value$iv$iv$iv$iv	J
/*      */       //   1092	31	73	index$iv$iv$iv	I
/*      */       //   1048	88	75	j$iv$iv$iv	I
/*      */       //   1045	98	74	bitCount$iv$iv$iv	I
/*      */       //   1000	143	69	slot$iv$iv$iv	J
/*      */       //   986	170	68	i$iv$iv$iv	I
/*      */       //   968	189	65	$i$f$forEachIndex	I
/*      */       //   976	181	66	m$iv$iv$iv	[J
/*      */       //   983	174	67	lastIndex$iv$iv$iv	I
/*      */       //   965	192	64	this_$iv$iv$iv	Landroidx/collection/ScatterSet;
/*      */       //   953	205	62	$i$f$forEach	I
/*      */       //   961	197	63	k$iv$iv	[Ljava/lang/Object;
/*      */       //   950	208	61	this_$iv$iv	Landroidx/collection/ScatterSet;
/*      */       //   927	253	60	value$iv	Ljava/lang/Object;
/*      */       //   915	266	59	$i$f$forEachScopeOf	I
/*      */       //   912	269	58	this_$iv	Landroidx/compose/runtime/collection/ScopeMap;
/*      */       //   857	338	55	$i$a$-forEachScopeOf-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$1$1	I
/*      */       //   867	328	56	previousValue	Ljava/lang/Object;
/*      */       //   884	311	57	policy	Landroidx/compose/runtime/SnapshotMutationPolicy;
/*      */       //   854	341	54	derivedState	Landroidx/compose/runtime/DerivedState;
/*      */       //   448	360	53	$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv	I
/*      */       //   445	363	52	index$iv$iv	I
/*      */       //   356	16	46	$i$f$maskEmptyOrDeleted	I
/*      */       //   353	19	44	$this$maskEmptyOrDeleted$iv$iv$iv$iv	J
/*      */       //   415	14	51	$i$f$isFull	I
/*      */       //   412	17	49	value$iv$iv$iv$iv	J
/*      */       //   441	368	46	index$iv$iv$iv	I
/*      */       //   397	425	48	j$iv$iv$iv	I
/*      */       //   394	435	47	bitCount$iv$iv$iv	I
/*      */       //   349	480	42	slot$iv$iv$iv	J
/*      */       //   335	507	41	i$iv$iv$iv	I
/*      */       //   317	526	38	$i$f$forEachIndex	I
/*      */       //   325	518	39	m$iv$iv$iv	[J
/*      */       //   332	511	40	lastIndex$iv$iv$iv	I
/*      */       //   314	529	37	this_$iv$iv$iv	Landroidx/collection/ScatterSet;
/*      */       //   302	542	35	$i$f$forEach	I
/*      */       //   310	534	36	k$iv$iv	[Ljava/lang/Object;
/*      */       //   299	545	34	this_$iv$iv	Landroidx/collection/ScatterSet;
/*      */       //   276	920	33	value$iv	Ljava/lang/Object;
/*      */       //   264	933	32	$i$f$forEachScopeOf	I
/*      */       //   261	936	31	this_$iv	Landroidx/compose/runtime/collection/ScopeMap;
/*      */       //   1398	11	55	$i$a$-forEachScopeOf-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$1$2	I
/*      */       //   1395	14	54	scope	Ljava/lang/Object;
/*      */       //   1457	11	55	$i$a$-forEachScopeOf-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$1$2	I
/*      */       //   1454	14	54	scope	Ljava/lang/Object;
/*      */       //   1388	23	53	$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv	I
/*      */       //   1385	26	52	index$iv$iv	I
/*      */       //   1296	16	46	$i$f$maskEmptyOrDeleted	I
/*      */       //   1293	19	44	$this$maskEmptyOrDeleted$iv$iv$iv$iv	J
/*      */       //   1355	14	51	$i$f$isFull	I
/*      */       //   1352	17	49	value$iv$iv$iv$iv	J
/*      */       //   1381	31	46	index$iv$iv$iv	I
/*      */       //   1337	88	48	j$iv$iv$iv	I
/*      */       //   1334	98	47	bitCount$iv$iv$iv	I
/*      */       //   1289	143	42	slot$iv$iv$iv	J
/*      */       //   1275	170	41	i$iv$iv$iv	I
/*      */       //   1257	189	38	$i$f$forEachIndex	I
/*      */       //   1265	181	39	m$iv$iv$iv	[J
/*      */       //   1272	174	40	lastIndex$iv$iv$iv	I
/*      */       //   1254	192	37	this_$iv$iv$iv	Landroidx/collection/ScatterSet;
/*      */       //   1242	205	35	$i$f$forEach	I
/*      */       //   1250	197	36	k$iv$iv	[Ljava/lang/Object;
/*      */       //   1239	208	34	this_$iv$iv	Landroidx/collection/ScatterSet;
/*      */       //   1216	253	33	value$iv	Ljava/lang/Object;
/*      */       //   1204	266	32	$i$f$forEachScopeOf	I
/*      */       //   1201	269	31	this_$iv	Landroidx/compose/runtime/collection/ScopeMap;
/*      */       //   215	1256	30	$i$a$-fastForEach-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$1	I
/*      */       //   212	1259	29	value	Ljava/lang/Object;
/*      */       //   1578	4	32	$i$f$getSnapshotStateObserver-6f8NoZ8	I
/*      */       //   1575	7	31	this_$iv	Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
/*      */       //   2062	11	82	$i$a$-forEachScopeOf-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$1$1$1	I
/*      */       //   2059	14	81	scope	Ljava/lang/Object;
/*      */       //   2121	11	82	$i$a$-forEachScopeOf-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$1$1$1	I
/*      */       //   2118	14	81	scope	Ljava/lang/Object;
/*      */       //   2052	23	80	$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv	I
/*      */       //   2049	26	79	index$iv$iv	I
/*      */       //   1960	16	73	$i$f$maskEmptyOrDeleted	I
/*      */       //   1957	19	71	$this$maskEmptyOrDeleted$iv$iv$iv$iv	J
/*      */       //   2019	14	78	$i$f$isFull	I
/*      */       //   2016	17	76	value$iv$iv$iv$iv	J
/*      */       //   2045	31	73	index$iv$iv$iv	I
/*      */       //   2001	88	75	j$iv$iv$iv	I
/*      */       //   1998	98	74	bitCount$iv$iv$iv	I
/*      */       //   1953	143	69	slot$iv$iv$iv	J
/*      */       //   1939	170	68	i$iv$iv$iv	I
/*      */       //   1921	189	65	$i$f$forEachIndex	I
/*      */       //   1929	181	66	m$iv$iv$iv	[J
/*      */       //   1936	174	67	lastIndex$iv$iv$iv	I
/*      */       //   1918	192	64	this_$iv$iv$iv	Landroidx/collection/ScatterSet;
/*      */       //   1906	205	62	$i$f$forEach	I
/*      */       //   1914	197	63	k$iv$iv	[Ljava/lang/Object;
/*      */       //   1903	208	61	this_$iv$iv	Landroidx/collection/ScatterSet;
/*      */       //   1880	253	60	value$iv	Ljava/lang/Object;
/*      */       //   1868	266	59	$i$f$forEachScopeOf	I
/*      */       //   1865	269	58	this_$iv	Landroidx/compose/runtime/collection/ScopeMap;
/*      */       //   1803	345	55	$i$a$-forEachScopeOf-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$1$1	I
/*      */       //   1820	328	56	previousValue	Ljava/lang/Object;
/*      */       //   1837	311	57	policy	Landroidx/compose/runtime/SnapshotMutationPolicy;
/*      */       //   1800	348	54	derivedState	Landroidx/compose/runtime/DerivedState;
/*      */       //   2451	11	82	$i$a$-forEachScopeOf-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$1$1$1	I
/*      */       //   2448	14	81	scope	Ljava/lang/Object;
/*      */       //   2510	11	82	$i$a$-forEachScopeOf-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$1$1$1	I
/*      */       //   2507	14	81	scope	Ljava/lang/Object;
/*      */       //   2441	23	80	$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv	I
/*      */       //   2438	26	79	index$iv$iv	I
/*      */       //   2349	16	73	$i$f$maskEmptyOrDeleted	I
/*      */       //   2346	19	71	$this$maskEmptyOrDeleted$iv$iv$iv$iv	J
/*      */       //   2408	14	78	$i$f$isFull	I
/*      */       //   2405	17	76	value$iv$iv$iv$iv	J
/*      */       //   2434	31	73	index$iv$iv$iv	I
/*      */       //   2390	88	75	j$iv$iv$iv	I
/*      */       //   2387	98	74	bitCount$iv$iv$iv	I
/*      */       //   2342	143	69	slot$iv$iv$iv	J
/*      */       //   2328	170	68	i$iv$iv$iv	I
/*      */       //   2310	189	65	$i$f$forEachIndex	I
/*      */       //   2318	181	66	m$iv$iv$iv	[J
/*      */       //   2325	174	67	lastIndex$iv$iv$iv	I
/*      */       //   2307	192	64	this_$iv$iv$iv	Landroidx/collection/ScatterSet;
/*      */       //   2295	205	62	$i$f$forEach	I
/*      */       //   2303	197	63	k$iv$iv	[Ljava/lang/Object;
/*      */       //   2292	208	61	this_$iv$iv	Landroidx/collection/ScatterSet;
/*      */       //   2269	253	60	value$iv	Ljava/lang/Object;
/*      */       //   2257	266	59	$i$f$forEachScopeOf	I
/*      */       //   2254	269	58	this_$iv	Landroidx/compose/runtime/collection/ScopeMap;
/*      */       //   2199	338	55	$i$a$-forEachScopeOf-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$1$1	I
/*      */       //   2209	328	56	previousValue	Ljava/lang/Object;
/*      */       //   2226	311	57	policy	Landroidx/compose/runtime/SnapshotMutationPolicy;
/*      */       //   2196	341	54	derivedState	Landroidx/compose/runtime/DerivedState;
/*      */       //   1790	360	53	$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv	I
/*      */       //   1787	363	52	index$iv$iv	I
/*      */       //   1698	16	46	$i$f$maskEmptyOrDeleted	I
/*      */       //   1695	19	44	$this$maskEmptyOrDeleted$iv$iv$iv$iv	J
/*      */       //   1757	14	51	$i$f$isFull	I
/*      */       //   1754	17	49	value$iv$iv$iv$iv	J
/*      */       //   1783	368	46	index$iv$iv$iv	I
/*      */       //   1739	425	48	j$iv$iv$iv	I
/*      */       //   1736	435	47	bitCount$iv$iv$iv	I
/*      */       //   1691	480	42	slot$iv$iv$iv	J
/*      */       //   1677	507	41	i$iv$iv$iv	I
/*      */       //   1659	526	38	$i$f$forEachIndex	I
/*      */       //   1667	518	39	m$iv$iv$iv	[J
/*      */       //   1674	511	40	lastIndex$iv$iv$iv	I
/*      */       //   1656	529	37	this_$iv$iv$iv	Landroidx/collection/ScatterSet;
/*      */       //   1644	542	35	$i$f$forEach	I
/*      */       //   1652	534	36	k$iv$iv	[Ljava/lang/Object;
/*      */       //   1641	545	34	this_$iv$iv	Landroidx/collection/ScatterSet;
/*      */       //   1618	920	33	value$iv	Ljava/lang/Object;
/*      */       //   1606	933	32	$i$f$forEachScopeOf	I
/*      */       //   1603	936	31	this_$iv	Landroidx/compose/runtime/collection/ScopeMap;
/*      */       //   2740	11	55	$i$a$-forEachScopeOf-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$1$2	I
/*      */       //   2737	14	54	scope	Ljava/lang/Object;
/*      */       //   2799	11	55	$i$a$-forEachScopeOf-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$1$2	I
/*      */       //   2796	14	54	scope	Ljava/lang/Object;
/*      */       //   2730	23	53	$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv	I
/*      */       //   2727	26	52	index$iv$iv	I
/*      */       //   2638	16	46	$i$f$maskEmptyOrDeleted	I
/*      */       //   2635	19	44	$this$maskEmptyOrDeleted$iv$iv$iv$iv	J
/*      */       //   2697	14	51	$i$f$isFull	I
/*      */       //   2694	17	49	value$iv$iv$iv$iv	J
/*      */       //   2723	31	46	index$iv$iv$iv	I
/*      */       //   2679	88	48	j$iv$iv$iv	I
/*      */       //   2676	98	47	bitCount$iv$iv$iv	I
/*      */       //   2631	143	42	slot$iv$iv$iv	J
/*      */       //   2617	170	41	i$iv$iv$iv	I
/*      */       //   2599	189	38	$i$f$forEachIndex	I
/*      */       //   2607	181	39	m$iv$iv$iv	[J
/*      */       //   2614	174	40	lastIndex$iv$iv$iv	I
/*      */       //   2596	192	37	this_$iv$iv$iv	Landroidx/collection/ScatterSet;
/*      */       //   2584	205	35	$i$f$forEach	I
/*      */       //   2592	197	36	k$iv$iv	[Ljava/lang/Object;
/*      */       //   2581	208	34	this_$iv$iv	Landroidx/collection/ScatterSet;
/*      */       //   2558	253	33	value$iv	Ljava/lang/Object;
/*      */       //   2546	266	32	$i$f$forEachScopeOf	I
/*      */       //   2543	269	31	this_$iv	Landroidx/compose/runtime/collection/ScopeMap;
/*      */       //   1557	1256	30	$i$a$-fastForEach-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$1	I
/*      */       //   1554	1259	29	value	Ljava/lang/Object;
/*      */       //   205	1268	28	$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv	I
/*      */       //   202	1271	27	index$iv$iv	I
/*      */       //   113	16	21	$i$f$maskEmptyOrDeleted	I
/*      */       //   110	19	19	$this$maskEmptyOrDeleted$iv$iv$iv$iv	J
/*      */       //   172	14	26	$i$f$isFull	I
/*      */       //   169	17	24	value$iv$iv$iv$iv	J
/*      */       //   198	1276	21	index$iv$iv$iv	I
/*      */       //   154	1333	23	j$iv$iv$iv	I
/*      */       //   151	1343	22	bitCount$iv$iv$iv	I
/*      */       //   106	1388	17	slot$iv$iv$iv	J
/*      */       //   92	1415	16	i$iv$iv$iv	I
/*      */       //   74	1434	13	$i$f$forEachIndex	I
/*      */       //   82	1426	14	m$iv$iv$iv	[J
/*      */       //   89	1419	15	lastIndex$iv$iv$iv	I
/*      */       //   71	1437	12	this_$iv$iv$iv	Landroidx/collection/ScatterSet;
/*      */       //   59	1450	10	$i$f$forEach	I
/*      */       //   67	1442	11	k$iv$iv	[Ljava/lang/Object;
/*      */       //   56	1453	9	this_$iv$iv	Landroidx/collection/ScatterSet;
/*      */       //   1550	1264	12	element$iv$iv	Ljava/lang/Object;
/*      */       //   1522	1296	10	$i$f$forEach	I
/*      */       //   1519	1299	9	$this$forEach$iv$iv	Ljava/lang/Iterable;
/*      */       //   38	2781	8	$i$f$fastForEach	I
/*      */       //   35	2784	7	$this$fastForEach$iv	Ljava/util/Set;
/*      */       //   2874	7	13	$i$a$-forEach-SnapshotStateObserver$ObservedScopeMap$recordInvalidation$2	I
/*      */       //   2871	10	12	it	Landroidx/compose/runtime/DerivedState;
/*      */       //   2854	41	10	i$iv	I
/*      */       //   2861	34	11	content$iv	[Ljava/lang/Object;
/*      */       //   2838	58	8	$i$f$forEach	I
/*      */       //   2846	50	9	size$iv	I
/*      */       //   2835	61	7	this_$iv	Landroidx/compose/runtime/collection/MutableVector;
/*      */       //   9	2896	2	hasValues	Z
/*      */       //   14	2891	3	dependencyToDerivedStates	Landroidx/compose/runtime/collection/ScopeMap;
/*      */       //   20	2885	4	recordedDerivedStateValues	Ljava/util/HashMap;
/*      */       //   26	2879	5	valueToScopes	Landroidx/compose/runtime/collection/ScopeMap;
/*      */       //   32	2873	6	invalidated	Landroidx/collection/MutableScatterSet;
/*      */       //   0	2905	0	this	Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;
/*      */       //   0	2905	1	changes	Ljava/util/Set;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public final void rereadDerivedState(@NotNull DerivedState derivedState) {
/*      */       Intrinsics.checkNotNullParameter(derivedState, "derivedState");
/*      */       MutableScatterMap<Object, MutableObjectIntMap<Object>> scopeToValues = this.scopeToValues;
/*      */       int token = SnapshotKt.currentSnapshot().getId();
/*      */       ScopeMap<Object, Object> this_$iv = this.valueToScopes;
/*      */       int $i$f$forEachScopeOf = 0;
/* 1124 */       Object value$iv = this_$iv.getMap().get(derivedState);
/* 1125 */       if (value$iv != null)
/* 1126 */         if (value$iv instanceof MutableScatterSet)
/*      */         
/* 1128 */         { ScatterSet this_$iv$iv = (ScatterSet)value$iv; int $i$f$forEach = 0;
/*      */           
/* 1130 */           Object[] k$iv$iv = this_$iv$iv.elements;
/*      */           
/* 1132 */           ScatterSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
/*      */           
/* 1134 */           long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 1135 */           int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*      */           
/* 1137 */           int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 1138 */               long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 1139 */               long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1140 */               if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1141 */               { int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1142 */                 for (int j$iv$iv$iv = 0;; j$iv$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/* 1151 */                 if (bitCount$iv$iv$iv == 8)
/*      */                   continue;  break; }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }  // Byte code: goto -> 331
/*      */             }  }
/*      */           else {  }
/*      */            }
/* 1156 */         else { Object scope = value$iv; int $i$a$-forEachScopeOf-SnapshotStateObserver$ObservedScopeMap$rereadDerivedState$1 = 0; if ((MutableObjectIntMap)scopeToValues.get(scope) == null) {
/*      */             (MutableObjectIntMap)scopeToValues.get(scope); MutableObjectIntMap mutableObjectIntMap1 = new MutableObjectIntMap(0, 1, null), it = mutableObjectIntMap1, mutableObjectIntMap2 = (MutableObjectIntMap)scopeToValues.get(scope); Object object = scope; int i = token; DerivedState derivedState1 = derivedState; int $i$a$-also-SnapshotStateObserver$ObservedScopeMap$rereadDerivedState$1$1 = 0; scopeToValues.set(scope, it); Unit unit = Unit.INSTANCE;
/*      */           }  }
/*      */           } public final void notifyInvalidatedScopes() { MutableScatterSet<Object> invalidated = this.invalidated; ScatterSet scatterSet1 = (ScatterSet)invalidated; Function1<Object, Unit> block$iv = this.onChanged;
/*      */       int $i$f$forEach = 0;
/* 1161 */       Object[] k$iv = scatterSet1.elements;
/*      */       
/* 1163 */       ScatterSet this_$iv$iv = scatterSet1; int $i$f$forEachIndex = 0;
/*      */       
/* 1165 */       long[] m$iv$iv = this_$iv$iv.metadata;
/* 1166 */       int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */       
/* 1168 */       int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1169 */           long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1170 */           long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1171 */           if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1172 */             int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1173 */             for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
/* 1174 */               long value$iv$iv$iv = slot$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 1175 */               if ((value$iv$iv$iv < 128L)) {
/* 1176 */                 int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
/* 1177 */                 int index$iv = index$iv$iv, $i$a$-forEachIndex-ScatterSet$forEach$2$iv = 0;
/* 1178 */                 block$iv.invoke(k$iv[index$iv]);
/*      */               } 
/* 1180 */               slot$iv$iv >>= 8L;
/*      */             } 
/* 1182 */             if (bitCount$iv$iv == 8)
/*      */               continue; 
/*      */             break;
/*      */           } 
/*      */           continue;
/*      */           if (i$iv$iv != lastIndex$iv$iv) {
/*      */             i$iv$iv++;
/*      */             continue;
/*      */           } 
/*      */           // Byte code: goto -> 209
/*      */         }  }
/*      */       else
/*      */       {  }
/*      */       
/*      */       invalidated.clear(); }
/*      */      }
/*      */ 
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\SnapshotStateObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */