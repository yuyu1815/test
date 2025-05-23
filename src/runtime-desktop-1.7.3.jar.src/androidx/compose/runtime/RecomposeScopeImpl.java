/*     */ package androidx.compose.runtime;
/*     */ 
/*     */ import androidx.collection.MutableObjectIntMap;
/*     */ import androidx.collection.MutableScatterMap;
/*     */ import androidx.collection.ObjectIntMap;
/*     */ import androidx.collection.ScatterSet;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.runtime.tooling.CompositionObserverHandle;
/*     */ import androidx.compose.runtime.tooling.RecomposeScopeObserver;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000r\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\020\b\n\002\020\002\n\000\n\002\020\013\n\002\b\021\n\002\030\002\n\002\b\f\n\002\030\002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\t\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\r\b\000\030\000 T2\0020\0012\0020\002:\001TB\017\022\b\020\003\032\004\030\0010\004¢\006\002\020\005J\016\020;\032\0020\0202\006\020\003\032\0020\004J\016\020<\032\0020\0202\006\020=\032\0020\016J\034\020>\032\020\022\004\022\0020@\022\004\022\0020\020\030\0010?2\006\020A\032\0020\017J\b\020B\032\0020\020H\026J\020\020C\032\0020D2\b\020\026\032\004\030\00103J\020\020E\032\0020\0222\b\020F\032\004\030\00103J\025\020G\032\0020H2\006\020#\032\0020$H\001¢\006\002\bIJ\034\020J\032\0020\0202\n\020K\032\006\022\002\b\003022\b\020\026\032\004\030\00103J\016\020L\032\0020\0222\006\020K\032\00203J\006\020M\032\0020\020J\006\020N\032\0020\020J\006\020O\032\0020\020J\016\020P\032\0020\0202\006\020A\032\0020\017J\"\020Q\032\0020\0202\030\020\f\032\024\022\004\022\0020\016\022\004\022\0020\017\022\004\022\0020\0200\rH\026J*\020R\032\0020\022*\006\022\002\b\003022\030\020S\032\024\022\b\022\006\022\002\b\00302\022\006\022\004\030\0010301H\002R\034\020\006\032\004\030\0010\007X\016¢\006\016\n\000\032\004\b\b\020\t\"\004\b\n\020\013R\"\020\f\032\026\022\004\022\0020\016\022\004\022\0020\017\022\004\022\0020\020\030\0010\rX\016¢\006\002\n\000R\021\020\021\032\0020\0228F¢\006\006\032\004\b\023\020\024R\016\020\025\032\0020\017X\016¢\006\002\n\000R$\020\027\032\0020\0222\006\020\026\032\0020\0228F@FX\016¢\006\f\032\004\b\030\020\024\"\004\b\031\020\032R$\020\033\032\0020\0222\006\020\026\032\0020\0228F@FX\016¢\006\f\032\004\b\034\020\024\"\004\b\035\020\032R\016\020\036\032\0020\017X\016¢\006\002\n\000R$\020\037\032\0020\0222\006\020\026\032\0020\0228F@FX\016¢\006\f\032\004\b \020\024\"\004\b!\020\032R\021\020\"\032\0020\0228F¢\006\006\032\004\b\"\020\024R\032\020#\032\004\030\0010$8\002@\002X\016¢\006\b\n\000\022\004\b%\020&R\020\020\003\032\004\030\0010\004X\016¢\006\002\n\000R$\020'\032\0020\0222\006\020\026\032\0020\0228F@FX\016¢\006\f\032\004\b(\020\024\"\004\b)\020\032R$\020*\032\0020\0222\006\020\026\032\0020\0228B@BX\016¢\006\f\032\004\b+\020\024\"\004\b,\020\032R$\020-\032\0020\0222\006\020\026\032\0020\0228@@BX\016¢\006\f\032\004\b.\020\024\"\004\b/\020\032R\"\0200\032\026\022\b\022\006\022\002\b\00302\022\006\022\004\030\00103\030\00101X\016¢\006\002\n\000R\026\0204\032\n\022\004\022\00203\030\00105X\016¢\006\002\n\000R$\0206\032\0020\0222\006\020\026\032\0020\0228F@FX\016¢\006\f\032\004\b7\020\024\"\004\b8\020\032R\021\0209\032\0020\0228F¢\006\006\032\004\b:\020\024¨\006U"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "owner", "Landroidx/compose/runtime/RecomposeScopeOwner;", "(Landroidx/compose/runtime/RecomposeScopeOwner;)V", "anchor", "Landroidx/compose/runtime/Anchor;", "getAnchor", "()Landroidx/compose/runtime/Anchor;", "setAnchor", "(Landroidx/compose/runtime/Anchor;)V", "block", "Lkotlin/Function2;", "Landroidx/compose/runtime/Composer;", "", "", "canRecompose", "", "getCanRecompose", "()Z", "currentToken", "value", "defaultsInScope", "getDefaultsInScope", "setDefaultsInScope", "(Z)V", "defaultsInvalid", "getDefaultsInvalid", "setDefaultsInvalid", "flags", "forcedRecompose", "getForcedRecompose", "setForcedRecompose", "isConditional", "observer", "Landroidx/compose/runtime/tooling/RecomposeScopeObserver;", "getObserver$annotations", "()V", "requiresRecompose", "getRequiresRecompose", "setRequiresRecompose", "rereading", "getRereading", "setRereading", "skipped", "getSkipped$runtime", "setSkipped", "trackedDependencies", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/DerivedState;", "", "trackedInstances", "Landroidx/collection/MutableObjectIntMap;", "used", "getUsed", "setUsed", "valid", "getValid", "adoptedBy", "compose", "composer", "end", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "token", "invalidate", "invalidateForResult", "Landroidx/compose/runtime/InvalidationResult;", "isInvalidFor", "instances", "observe", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe$runtime", "recordDerivedStateValue", "instance", "recordRead", "release", "rereadTrackedInstances", "scopeSkipped", "start", "updateScope", "checkDerivedStateChanged", "dependencies", "Companion", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n1#1,449:1\n26#2:450\n1#3:451\n296#4,2:452\n267#4,4:454\n237#4,7:458\n248#4,3:466\n251#4,2:470\n272#4:472\n298#4,2:473\n273#4:475\n254#4,6:476\n274#4:482\n300#4:483\n1810#5:465\n1672#5:469\n1810#5:494\n1672#5:498\n1810#5:521\n1672#5:525\n401#6,4:484\n373#6,6:488\n383#6,3:495\n386#6,2:499\n406#6,2:501\n389#6,6:503\n408#6:509\n449#6:510\n401#6,4:511\n373#6,6:515\n383#6,3:522\n386#6,2:526\n406#6:528\n450#6,2:529\n407#6:531\n389#6,6:532\n408#6:538\n452#6:539\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n*L\n197#1:450\n359#1:452,2\n359#1:454,4\n359#1:458,7\n359#1:466,3\n359#1:470,2\n359#1:472\n359#1:473,2\n359#1:475\n359#1:476,6\n359#1:482\n359#1:483\n359#1:465\n359#1:469\n381#1:494\n381#1:498\n404#1:521\n404#1:525\n381#1:484,4\n381#1:488,6\n381#1:495,3\n381#1:499,2\n381#1:501,2\n381#1:503,6\n381#1:509\n404#1:510\n404#1:511,4\n404#1:515,6\n404#1:522,3\n404#1:526,2\n404#1:528\n404#1:529,2\n404#1:531\n404#1:532,6\n404#1:538\n404#1:539\n*E\n"})
/*     */ public final class RecomposeScopeImpl
/*     */   implements ScopeUpdateScope, RecomposeScope
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private int flags;
/*     */   @Nullable
/*     */   private RecomposeScopeOwner owner;
/*     */   @Nullable
/*     */   private Anchor anchor;
/*     */   @Nullable
/*     */   private Function2<? super Composer, ? super Integer, Unit> block;
/*     */   @Nullable
/*     */   private RecomposeScopeObserver observer;
/*     */   private int currentToken;
/*     */   @Nullable
/*     */   private MutableObjectIntMap<Object> trackedInstances;
/*     */   @Nullable
/*     */   private MutableScatterMap<DerivedState<?>, Object> trackedDependencies;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public RecomposeScopeImpl(@Nullable RecomposeScopeOwner owner) {
/*  85 */     this.owner = owner;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Anchor getAnchor()
/*     */   {
/*  91 */     return this.anchor; } public final void setAnchor(@Nullable Anchor <set-?>) { this.anchor = <set-?>; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean getValid() {
/*  98 */     if (this.owner != null) if ((this.anchor != null) ? this.anchor.getValid() : false);  return false;
/*     */   } public final boolean getCanRecompose() {
/* 100 */     return (this.block != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean getUsed() {
/* 108 */     return ((this.flags & 0x1) != 0);
/*     */   } public final void setUsed(boolean value) {
/* 110 */     if (value) {
/* 111 */       this.flags |= 0x1;
/*     */     } else {
/* 113 */       this.flags &= 0xFFFFFFFE;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean getDefaultsInScope() {
/* 124 */     return ((this.flags & 0x2) != 0);
/*     */   } public final void setDefaultsInScope(boolean value) {
/* 126 */     if (value) {
/* 127 */       this.flags |= 0x2;
/*     */     } else {
/* 129 */       this.flags &= 0xFFFFFFFD;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean getDefaultsInvalid() {
/* 138 */     return ((this.flags & 0x4) != 0);
/*     */   } public final void setDefaultsInvalid(boolean value) {
/* 140 */     if (value) {
/* 141 */       this.flags |= 0x4;
/*     */     } else {
/* 143 */       this.flags &= 0xFFFFFFFB;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean getRequiresRecompose() {
/* 153 */     return ((this.flags & 0x8) != 0);
/*     */   } public final void setRequiresRecompose(boolean value) {
/* 155 */     if (value) {
/* 156 */       this.flags |= 0x8;
/*     */     } else {
/* 158 */       this.flags &= 0xFFFFFFF7;
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
/*     */ 
/*     */   
/*     */   public final void compose(@NotNull Composer composer) {
/* 181 */     Intrinsics.checkNotNullParameter(composer, "composer"); Function2<? super Composer, ? super Integer, Unit> block = this.block;
/* 182 */     RecomposeScopeObserver observer = this.observer;
/* 183 */     if (observer != null && block != null) {
/* 184 */       observer.onBeginScopeComposition(this);
/*     */       try {
/* 186 */         block.invoke(composer, Integer.valueOf(1));
/*     */       } finally {
/* 188 */         observer.onEndScopeComposition(this);
/*     */       } 
/*     */       return;
/*     */     } 
/* 192 */     block.invoke(composer, Integer.valueOf(1)); if (((block != null) ? Unit.INSTANCE : null) == null) throw new IllegalStateException("Invalid restart scope".toString()); 
/*     */   }
/*     */   
/*     */   @ExperimentalComposeRuntimeApi
/*     */   @NotNull
/* 197 */   public final CompositionObserverHandle observe$runtime(@NotNull RecomposeScopeObserver observer) { Intrinsics.checkNotNullParameter(observer, "observer"); SynchronizedObject lock$iv = RecomposeScopeImplKt.access$getCallbackLock$p(); int $i$f$synchronized = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 450 */     synchronized (lock$iv) { int $i$a$-synchronized-RecomposeScopeImpl$observe$1 = 0; this.observer = observer; Unit unit = Unit.INSTANCE; }  return new RecomposeScopeImpl$observe$2(observer); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"androidx/compose/runtime/RecomposeScopeImpl$observe$2", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "dispose", "", "runtime"}) @SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$observe$2\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n*L\n1#1,449:1\n26#2:450\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$observe$2\n*L\n202#1:450\n*E\n"}) public static final class RecomposeScopeImpl$observe$2 implements CompositionObserverHandle { RecomposeScopeImpl$observe$2(RecomposeScopeObserver $observer) {} public void dispose() { SynchronizedObject synchronizedObject = RecomposeScopeImplKt.access$getCallbackLock$p(); RecomposeScopeImpl recomposeScopeImpl = RecomposeScopeImpl.this; RecomposeScopeObserver recomposeScopeObserver = this.$observer; int $i$f$synchronized = 0; synchronized (synchronizedObject) { int $i$a$-synchronized-RecomposeScopeImpl$observe$2$dispose$1 = 0; if (Intrinsics.areEqual(recomposeScopeImpl.observer, recomposeScopeObserver)) recomposeScopeImpl.observer = null;  Unit unit = Unit.INSTANCE; }  } }
/* 451 */    @NotNull public final InvalidationResult invalidateForResult(@Nullable Object value) { if (this.owner == null || this.owner.invalidate(this, value) == null) this.owner.invalidate(this, value);  return InvalidationResult.IGNORED; } public final void release() { if (this.owner != null) { this.owner.recomposeScopeReleased(this); } else {  }  this.owner = null; this.trackedInstances = null; this.trackedDependencies = null; if (this.observer != null) { this.observer.onScopeDisposed(this); } else {  }  } public final void adoptedBy(@NotNull RecomposeScopeOwner owner) { Intrinsics.checkNotNullParameter(owner, "owner"); this.owner = owner; } public void invalidate() { if (this.owner != null) { this.owner.invalidate(this, null); } else {  }  } public void updateScope(@NotNull Function2<? super Composer, ? super Integer, Unit> block) { Intrinsics.checkNotNullParameter(block, "block"); this.block = block; } private final boolean getRereading() { return ((this.flags & 0x20) != 0); } public final boolean recordRead(@NotNull Object instance) { Intrinsics.checkNotNullParameter(instance, "instance"); if (getRereading()) return false;  if (this.trackedInstances == null) { MutableObjectIntMap<Object> mutableObjectIntMap1 = new MutableObjectIntMap(0, 1, null), it = mutableObjectIntMap1; int $i$a$-also-RecomposeScopeImpl$recordRead$trackedInstances$1 = 0; this.trackedInstances = it; }  MutableObjectIntMap<Object> trackedInstances = mutableObjectIntMap1; int token = trackedInstances.put(instance, this.currentToken, -1); if (token == this.currentToken) return true;  return false; } private final void setRereading(boolean value) { if (value) { this.flags |= 0x20; } else { this.flags &= 0xFFFFFFDF; }  } public final boolean getForcedRecompose() { return ((this.flags & 0x40) != 0); } public final void setForcedRecompose(boolean value) { if (value) { this.flags |= 0x40; } else { this.flags &= 0xFFFFFFBF; }  } public final boolean getSkipped$runtime() { return ((this.flags & 0x10) != 0); } private final void setSkipped(boolean value) { if (value) { this.flags |= 0x10; } else { this.flags &= 0xFFFFFFEF; }  } public final void start(int token) { this.currentToken = token; setSkipped(false); } public final void scopeSkipped() { setSkipped(true); } public final void recordDerivedStateValue(@NotNull DerivedState instance, @Nullable Object value) { Intrinsics.checkNotNullParameter(instance, "instance"); if (this.trackedDependencies == null) { MutableScatterMap<DerivedState<?>, Object> mutableScatterMap1 = new MutableScatterMap(0, 1, null), it = mutableScatterMap1; int $i$a$-also-RecomposeScopeImpl$recordDerivedStateValue$trackedDependencies$1 = 0; this.trackedDependencies = it; }  MutableScatterMap<DerivedState<?>, Object> trackedDependencies = mutableScatterMap1; trackedDependencies.set(instance, value); } public final boolean isConditional() { return (this.trackedDependencies != null); }
/*     */   public final boolean isInvalidFor(@Nullable Object instances) { MutableScatterMap<DerivedState<?>, Object> trackedDependencies; if (instances == null) return true;  if (this.trackedDependencies == null)
/* 453 */       return true;  Object object = instances; if (((ScatterSet)instances).isNotEmpty()) { ScatterSet this_$iv = (ScatterSet)instances; int $i$f$any = 0; ScatterSet this_$iv$iv = this_$iv; int $i$f$forEach = 0;
/*     */       
/* 455 */       Object[] k$iv$iv = this_$iv$iv.elements;
/*     */       
/* 457 */       ScatterSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
/*     */       
/* 459 */       long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 460 */       int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*     */       
/* 462 */       int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true)
/* 463 */         { long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 464 */           long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 465 */           if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 466 */           { int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 467 */             for (int j$iv$iv$iv = 0;; j$iv$iv$iv++);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 478 */             if (bitCount$iv$iv$iv == 8)
/*     */               continue;  } else { continue; }  if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }  continue; }  }
/*     */       else {  }
/*     */        }
/*     */      return (object instanceof DerivedState) ? checkDerivedStateChanged((DerivedState)instances, trackedDependencies) : (!(object instanceof ScatterSet)); } private final boolean checkDerivedStateChanged(DerivedState $this$checkDerivedStateChanged, MutableScatterMap dependencies) { Intrinsics.checkNotNull($this$checkDerivedStateChanged, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>"); if ($this$checkDerivedStateChanged.getPolicy() == null)
/*     */       $this$checkDerivedStateChanged.getPolicy();  SnapshotMutationPolicy<?> policy = SnapshotStateKt.structuralEqualityPolicy(); return !policy.equivalent($this$checkDerivedStateChanged.getCurrentRecord().getCurrentValue(), dependencies.get($this$checkDerivedStateChanged)); }
/* 484 */   public final void rereadTrackedInstances() { RecomposeScopeOwner owner = this.owner; int $i$a$-let-RecomposeScopeImpl$rereadTrackedInstances$1 = 0; MutableObjectIntMap<Object> trackedInstances = this.trackedInstances; int $i$a$-let-RecomposeScopeImpl$rereadTrackedInstances$1$1 = 0; setRereading(true); try { ObjectIntMap this_$iv = (ObjectIntMap)trackedInstances; int $i$f$forEach = 0; Object[] k$iv = this_$iv.keys;
/* 485 */       int[] v$iv = this_$iv.values;
/*     */       
/* 487 */       ObjectIntMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 488 */       long[] m$iv$iv = this_$iv$iv.metadata;
/* 489 */       int lastIndex$iv$iv = m$iv$iv.length - 2;
/*     */       
/* 491 */       int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true)
/* 492 */         { long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 493 */           long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 494 */           if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 495 */           { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 496 */             for (int j$iv$iv = 0;; j$iv$iv++);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 505 */             if (bitCount$iv$iv == 8)
/*     */               continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 250 }  }
/*     */       else {  }
/*     */        }
/*     */     finally { setRereading(false); }
/* 510 */      } @Nullable public final Function1<Composition, Unit> end(int token) { if (this.trackedInstances != null) { MutableObjectIntMap<Object> instances = this.trackedInstances; int $i$a$-let-RecomposeScopeImpl$end$1 = 0; if (!getSkipped$runtime()) { ObjectIntMap this_$iv = (ObjectIntMap)instances; int $i$f$any = 0; ObjectIntMap this_$iv$iv = this_$iv; int $i$f$forEach = 0;
/* 511 */         Object[] k$iv$iv = this_$iv$iv.keys;
/* 512 */         int[] v$iv$iv = this_$iv$iv.values;
/*     */         
/* 514 */         ObjectIntMap this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndexed = 0;
/* 515 */         long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 516 */         int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*     */         
/* 518 */         int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 519 */             long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 520 */             long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 521 */             if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 522 */               int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 523 */               for (int j$iv$iv$iv = 0;; j$iv$iv$iv++);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 534 */               if (bitCount$iv$iv$iv == 8)
/*     */                 continue; 
/*     */               continue;
/*     */             } 
/*     */             continue;
/*     */             if (i$iv$iv$iv != lastIndex$iv$iv$iv) {
/*     */               i$iv$iv$iv++;
/*     */               continue;
/*     */             } 
/*     */             continue;
/*     */           }  }
/*     */         else if (false)
/*     */         {  }
/*     */         else
/*     */         { // Byte code: goto -> 286 }
/*     */          }
/*     */        }
/*     */     else
/*     */     { null;
/*     */       return null; }
/*     */      }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "composition", "Landroidx/compose/runtime/Composition;", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n+ 2 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,449:1\n843#2:450\n845#2,4:464\n849#2:474\n373#3,6:451\n383#3,3:458\n386#3,2:462\n389#3,6:468\n1810#4:457\n1672#4:461\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n*L\n411#1:450\n411#1:464,4\n411#1:474\n411#1:451,6\n411#1:458,3\n411#1:462,2\n411#1:468,6\n411#1:457\n411#1:461\n*E\n"})
/*     */   static final class RecomposeScopeImpl$end$1$2 extends Lambda implements Function1<Composition, Unit> {
/*     */     public final void invoke(@NotNull Composition composition) {
/*     */       Intrinsics.checkNotNullParameter(composition, "composition");
/*     */       if (RecomposeScopeImpl.this.currentToken == this.$token && Intrinsics.areEqual(this.$instances, RecomposeScopeImpl.this.trackedInstances) && composition instanceof CompositionImpl) {
/*     */         MutableObjectIntMap<Object> mutableObjectIntMap = this.$instances;
/*     */         int i = this.$token;
/*     */         RecomposeScopeImpl recomposeScopeImpl = RecomposeScopeImpl.this;
/*     */         int $i$f$removeIf = 0;
/*     */         ObjectIntMap this_$iv$iv = (ObjectIntMap)mutableObjectIntMap;
/*     */         int $i$f$forEachIndexed = 0;
/*     */         long[] m$iv$iv = this_$iv$iv.metadata;
/*     */         int lastIndex$iv$iv = m$iv$iv.length - 2;
/*     */         int i$iv$iv = 0;
/*     */         if (i$iv$iv <= lastIndex$iv$iv) {
/*     */           while (true) {
/*     */             long slot$iv$iv = m$iv$iv[i$iv$iv];
/*     */             long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
/*     */             int $i$f$maskEmptyOrDeleted = 0;
/*     */             if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/*     */               int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/*     */               for (int j$iv$iv = 0;; j$iv$iv++);
/*     */               if (bitCount$iv$iv == 8)
/*     */                 continue; 
/*     */               break;
/*     */             } 
/*     */             continue;
/*     */             if (i$iv$iv != lastIndex$iv$iv) {
/*     */               i$iv$iv++;
/*     */               continue;
/*     */             } 
/*     */             // Byte code: goto -> 337
/*     */           } 
/*     */         } else {
/*     */         
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     RecomposeScopeImpl$end$1$2(int $token, MutableObjectIntMap<Object> $instances) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J+\020\003\032\0020\0042\006\020\005\032\0020\0062\f\020\007\032\b\022\004\022\0020\t0\b2\006\020\n\032\0020\013H\000¢\006\002\b\fJ#\020\r\032\0020\0162\006\020\005\032\0020\0172\f\020\007\032\b\022\004\022\0020\t0\bH\000¢\006\002\b\020¨\006\021"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl$Companion;", "", "()V", "adoptAnchoredScopes", "", "slots", "Landroidx/compose/runtime/SlotWriter;", "anchors", "", "Landroidx/compose/runtime/Anchor;", "newOwner", "Landroidx/compose/runtime/RecomposeScopeOwner;", "adoptAnchoredScopes$runtime", "hasAnchoredRecomposeScopes", "", "Landroidx/compose/runtime/SlotTable;", "hasAnchoredRecomposeScopes$runtime", "runtime"})
/*     */   @SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,449:1\n33#2,6:450\n93#2,2:456\n33#2,4:458\n95#2,2:462\n38#2:464\n97#2:465\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n*L\n434#1:450,6\n444#1:456,2\n444#1:458,4\n444#1:462,2\n444#1:464\n444#1:465\n*E\n"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final void adoptAnchoredScopes$runtime(@NotNull SlotWriter slots, @NotNull List anchors, @NotNull RecomposeScopeOwner newOwner) {
/*     */       List $this$fastForEach$iv;
/*     */       int index$iv, i;
/*     */       Intrinsics.checkNotNullParameter(slots, "slots");
/*     */       Intrinsics.checkNotNullParameter(anchors, "anchors");
/*     */       Intrinsics.checkNotNullParameter(newOwner, "newOwner");
/*     */       if (!anchors.isEmpty()) {
/*     */         $this$fastForEach$iv = anchors;
/*     */         int $i$f$fastForEach = 0;
/*     */         index$iv = 0;
/*     */         i = $this$fastForEach$iv.size();
/*     */       } else {
/*     */         return;
/*     */       } 
/*     */       if (index$iv < i) {
/*     */         Object item$iv = $this$fastForEach$iv.get(index$iv);
/*     */         Anchor anchor = (Anchor)item$iv;
/*     */         int $i$a$-fastForEach-RecomposeScopeImpl$Companion$adoptAnchoredScopes$1 = 0;
/*     */         Object object1 = slots.slot(anchor, 0);
/*     */       } 
/*     */     }
/*     */     
/*     */     public final boolean hasAnchoredRecomposeScopes$runtime(@NotNull SlotTable slots, @NotNull List anchors) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'slots'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'anchors'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: aload_2
/*     */       //   13: checkcast java/util/Collection
/*     */       //   16: invokeinterface isEmpty : ()Z
/*     */       //   21: ifne -> 28
/*     */       //   24: iconst_1
/*     */       //   25: goto -> 29
/*     */       //   28: iconst_0
/*     */       //   29: ifeq -> 147
/*     */       //   32: aload_2
/*     */       //   33: astore_3
/*     */       //   34: iconst_0
/*     */       //   35: istore #4
/*     */       //   37: nop
/*     */       //   38: aload_3
/*     */       //   39: astore #5
/*     */       //   41: iconst_0
/*     */       //   42: istore #6
/*     */       //   44: nop
/*     */       //   45: iconst_0
/*     */       //   46: istore #7
/*     */       //   48: aload #5
/*     */       //   50: invokeinterface size : ()I
/*     */       //   55: istore #8
/*     */       //   57: iload #7
/*     */       //   59: iload #8
/*     */       //   61: if_icmpge -> 138
/*     */       //   64: aload #5
/*     */       //   66: iload #7
/*     */       //   68: invokeinterface get : (I)Ljava/lang/Object;
/*     */       //   73: astore #9
/*     */       //   75: aload #9
/*     */       //   77: astore #10
/*     */       //   79: iconst_0
/*     */       //   80: istore #11
/*     */       //   82: aload #10
/*     */       //   84: checkcast androidx/compose/runtime/Anchor
/*     */       //   87: astore #12
/*     */       //   89: iconst_0
/*     */       //   90: istore #13
/*     */       //   92: aload_1
/*     */       //   93: aload #12
/*     */       //   95: invokevirtual ownsAnchor : (Landroidx/compose/runtime/Anchor;)Z
/*     */       //   98: ifeq -> 122
/*     */       //   101: aload_1
/*     */       //   102: aload_1
/*     */       //   103: aload #12
/*     */       //   105: invokevirtual anchorIndex : (Landroidx/compose/runtime/Anchor;)I
/*     */       //   108: iconst_0
/*     */       //   109: invokevirtual slot$runtime : (II)Ljava/lang/Object;
/*     */       //   112: instanceof androidx/compose/runtime/RecomposeScopeImpl
/*     */       //   115: ifeq -> 122
/*     */       //   118: iconst_1
/*     */       //   119: goto -> 123
/*     */       //   122: iconst_0
/*     */       //   123: ifeq -> 130
/*     */       //   126: iconst_1
/*     */       //   127: goto -> 140
/*     */       //   130: nop
/*     */       //   131: nop
/*     */       //   132: iinc #7, 1
/*     */       //   135: goto -> 57
/*     */       //   138: nop
/*     */       //   139: iconst_0
/*     */       //   140: ifeq -> 147
/*     */       //   143: iconst_1
/*     */       //   144: goto -> 148
/*     */       //   147: iconst_0
/*     */       //   148: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #444	-> 12
/*     */       //   #444	-> 32
/*     */       //   #456	-> 37
/*     */       //   #457	-> 38
/*     */       //   #458	-> 44
/*     */       //   #459	-> 45
/*     */       //   #460	-> 64
/*     */       //   #461	-> 75
/*     */       //   #462	-> 82
/*     */       //   #445	-> 92
/*     */       //   #462	-> 123
/*     */       //   #463	-> 130
/*     */       //   #461	-> 131
/*     */       //   #459	-> 132
/*     */       //   #464	-> 138
/*     */       //   #465	-> 139
/*     */       //   #446	-> 148
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   92	31	13	$i$a$-fastAny-RecomposeScopeImpl$Companion$hasAnchoredRecomposeScopes$1	I
/*     */       //   89	34	12	it	Landroidx/compose/runtime/Anchor;
/*     */       //   82	49	11	$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv	I
/*     */       //   79	52	10	it$iv	Ljava/lang/Object;
/*     */       //   75	57	9	item$iv$iv	Ljava/lang/Object;
/*     */       //   48	90	7	index$iv$iv	I
/*     */       //   44	95	6	$i$f$fastForEach	I
/*     */       //   41	98	5	$this$fastForEach$iv$iv	Ljava/util/List;
/*     */       //   37	103	4	$i$f$fastAny	I
/*     */       //   34	106	3	$this$fastAny$iv	Ljava/util/List;
/*     */       //   0	149	0	this	Landroidx/compose/runtime/RecomposeScopeImpl$Companion;
/*     */       //   0	149	1	slots	Landroidx/compose/runtime/SlotTable;
/*     */       //   0	149	2	anchors	Ljava/util/List;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\RecomposeScopeImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */