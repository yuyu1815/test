/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000x\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\013\n\002\b\007\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020#\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\f\b'\030\0002\0020\001B\007\b\000¢\006\002\020\002J*\020\031\032\0020\0322\006\020\033\032\0020\0342\021\020\035\032\r\022\004\022\0020\0320\036¢\006\002\b\037H ¢\006\004\b \020!J\025\020\"\032\0020\0322\006\020#\032\0020$H ¢\006\002\b%J\r\020&\032\0020\032H\020¢\006\002\b'J\r\020(\032\0020)H\020¢\006\002\b*J\025\020+\032\0020\0322\006\020#\032\0020$H ¢\006\002\b,J\025\020-\032\0020\0322\006\020\033\032\0020\034H ¢\006\002\b.J\025\020/\032\0020\0322\006\0200\032\00201H ¢\006\002\b2J\035\0203\032\0020\0322\006\020#\032\0020$2\006\0204\032\00205H ¢\006\002\b6J\027\0207\032\004\030\001052\006\020#\032\0020$H\020¢\006\002\b8J\033\0209\032\0020\0322\f\020:\032\b\022\004\022\0020<0;H\020¢\006\002\b=J\025\020>\032\0020\0322\006\020?\032\0020@H\020¢\006\002\bAJ\025\020B\032\0020\0322\006\020\033\032\0020\034H ¢\006\002\bCJ\025\020D\032\0020\0322\006\020\033\032\0020\034H ¢\006\002\bEJ\r\020F\032\0020\032H\020¢\006\002\bGJ\025\020H\032\0020\0322\006\020?\032\0020@H\020¢\006\002\bIJ\025\020J\032\0020\0322\006\020\033\032\0020\034H ¢\006\002\bKR\022\020\003\032\0020\004X \004¢\006\006\032\004\b\005\020\006R\022\020\007\032\0020\004X \004¢\006\006\032\004\b\b\020\006R\022\020\t\032\0020\004X \004¢\006\006\032\004\b\n\020\006R\022\020\013\032\0020\fX \004¢\006\006\032\004\b\r\020\016R\022\020\017\032\0020\020X¦\004¢\006\006\032\004\b\021\020\022R\026\020\023\032\004\030\0010\0248PX\004¢\006\006\032\004\b\025\020\026R\022\020\027\032\0020\020X \004¢\006\006\032\004\b\030\020\022¨\006L"}, d2 = {"Landroidx/compose/runtime/CompositionContext;", "", "()V", "collectingCallByInformation", "", "getCollectingCallByInformation$runtime", "()Z", "collectingParameterInformation", "getCollectingParameterInformation$runtime", "collectingSourceInformation", "getCollectingSourceInformation$runtime", "compoundHashKey", "", "getCompoundHashKey$runtime", "()I", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime", "()Landroidx/compose/runtime/CompositionObserverHolder;", "recomposeCoroutineContext", "getRecomposeCoroutineContext$runtime", "composeInitial", "", "composition", "Landroidx/compose/runtime/ControlledComposition;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "deletedMovableContent", "reference", "Landroidx/compose/runtime/MovableContentStateReference;", "deletedMovableContent$runtime", "doneComposing", "doneComposing$runtime", "getCompositionLocalScope", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope$runtime", "insertMovableContent", "insertMovableContent$runtime", "invalidate", "invalidate$runtime", "invalidateScope", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateScope$runtime", "movableContentStateReleased", "data", "Landroidx/compose/runtime/MovableContentState;", "movableContentStateReleased$runtime", "movableContentStateResolve", "movableContentStateResolve$runtime", "recordInspectionTable", "table", "", "Landroidx/compose/runtime/tooling/CompositionData;", "recordInspectionTable$runtime", "registerComposer", "composer", "Landroidx/compose/runtime/Composer;", "registerComposer$runtime", "registerComposition", "registerComposition$runtime", "reportRemovedComposition", "reportRemovedComposition$runtime", "startComposing", "startComposing$runtime", "unregisterComposer", "unregisterComposer$runtime", "unregisterComposition", "unregisterComposition$runtime", "runtime"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public abstract class CompositionContext
/*    */ {
/*    */   public static final int $stable;
/*    */   
/*    */   public abstract int getCompoundHashKey$runtime();
/*    */   
/*    */   public abstract boolean getCollectingParameterInformation$runtime();
/*    */   
/*    */   public abstract boolean getCollectingSourceInformation$runtime();
/*    */   
/*    */   public abstract boolean getCollectingCallByInformation$runtime();
/*    */   
/*    */   @Nullable
/*    */   public CompositionObserverHolder getObserverHolder$runtime() {
/* 43 */     return null;
/*    */   }
/*    */   @NotNull
/*    */   public abstract CoroutineContext getEffectCoroutineContext();
/*    */   
/*    */   @NotNull
/*    */   public abstract CoroutineContext getRecomposeCoroutineContext$runtime();
/*    */   
/*    */   public abstract void composeInitial$runtime(@NotNull ControlledComposition paramControlledComposition, @NotNull Function2<? super Composer, ? super Integer, Unit> paramFunction2);
/*    */   
/*    */   public abstract void invalidate$runtime(@NotNull ControlledComposition paramControlledComposition);
/*    */   
/*    */   public abstract void invalidateScope$runtime(@NotNull RecomposeScopeImpl paramRecomposeScopeImpl);
/*    */   
/* 57 */   public void recordInspectionTable$runtime(@NotNull Set table) { Intrinsics.checkNotNullParameter(table, "table"); }
/* 58 */   public void registerComposer$runtime(@NotNull Composer composer) { Intrinsics.checkNotNullParameter(composer, "composer"); } public void unregisterComposer$runtime(@NotNull Composer composer) {
/* 59 */     Intrinsics.checkNotNullParameter(composer, "composer");
/*    */   }
/*    */   public abstract void registerComposition$runtime(@NotNull ControlledComposition paramControlledComposition);
/*    */   @NotNull
/*    */   public PersistentCompositionLocalMap getCompositionLocalScope$runtime() {
/* 64 */     return CompositionContextKt.access$getEmptyPersistentCompositionLocalMap$p();
/*    */   }
/*    */   public abstract void unregisterComposition$runtime(@NotNull ControlledComposition paramControlledComposition);
/*    */   public void startComposing$runtime() {}
/*    */   public void doneComposing$runtime() {}
/*    */   
/*    */   public abstract void insertMovableContent$runtime(@NotNull MovableContentStateReference paramMovableContentStateReference);
/*    */   
/*    */   public abstract void deletedMovableContent$runtime(@NotNull MovableContentStateReference paramMovableContentStateReference);
/*    */   
/*    */   public abstract void movableContentStateReleased$runtime(@NotNull MovableContentStateReference paramMovableContentStateReference, @NotNull MovableContentState paramMovableContentState);
/*    */   
/*    */   @Nullable
/*    */   public MovableContentState movableContentStateResolve$runtime(@NotNull MovableContentStateReference reference) {
/* 78 */     Intrinsics.checkNotNullParameter(reference, "reference"); return null;
/*    */   }
/*    */   
/*    */   public abstract void reportRemovedComposition$runtime(@NotNull ControlledComposition paramControlledComposition);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\CompositionContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */