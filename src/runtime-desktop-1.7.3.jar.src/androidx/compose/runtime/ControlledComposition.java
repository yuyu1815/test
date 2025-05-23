package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\b\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\"\n\002\020\000\n\002\b\007\n\002\030\002\n\000\bv\030\0002\0020\001J\b\020\007\032\0020\bH&J\b\020\t\032\0020\bH&J\b\020\n\032\0020\bH&J\b\020\013\032\0020\bH&J \020\f\032\0020\b2\021\020\r\032\r\022\004\022\0020\b0\016¢\006\002\b\017H&¢\006\002\020\020J3\020\021\032\002H\022\"\004\b\000\020\0222\b\020\023\032\004\030\0010\0002\006\020\024\032\0020\0252\f\020\026\032\b\022\004\022\002H\0220\016H&¢\006\002\020\027J\020\020\030\032\0020\b2\006\020\031\032\0020\032H'J$\020\033\032\0020\b2\032\020\034\032\026\022\022\022\020\022\004\022\0020\037\022\006\022\004\030\0010\0370\0360\035H'J\b\020 \032\0020\bH&J\026\020!\032\0020\0032\f\020\"\032\b\022\004\022\0020$0#H&J\026\020%\032\0020\b2\f\020\026\032\b\022\004\022\0020\b0\016H&J\b\020&\032\0020\003H&J\026\020'\032\0020\b2\f\020\"\032\b\022\004\022\0020$0#H&J\020\020(\032\0020\b2\006\020)\032\0020$H&J\020\020*\032\0020\b2\006\020)\032\0020$H&J\b\020+\032\0020\bH'R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\003X¦\004¢\006\006\032\004\b\006\020\005\001\001,ø\001\000\002\006\n\004\b!0\001¨\006-À\006\001"}, d2 = {"Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/Composition;", "hasPendingChanges", "", "getHasPendingChanges", "()Z", "isComposing", "abandonChanges", "", "applyChanges", "applyLateChanges", "changesApplied", "composeContent", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;)V", "delegateInvalidations", "R", "to", "groupIndex", "", "block", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "disposeUnusedMovableContent", "state", "Landroidx/compose/runtime/MovableContentState;", "insertMovableContent", "references", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "invalidateAll", "observesAnyOf", "values", "", "", "prepareCompose", "recompose", "recordModificationsOf", "recordReadOf", "value", "recordWriteOf", "verifyConsistent", "Landroidx/compose/runtime/CompositionImpl;", "runtime"})
public interface ControlledComposition extends Composition {
  boolean isComposing();
  
  boolean getHasPendingChanges();
  
  void composeContent(@NotNull Function2<? super Composer, ? super Integer, Unit> paramFunction2);
  
  void recordModificationsOf(@NotNull Set<? extends Object> paramSet);
  
  boolean observesAnyOf(@NotNull Set<? extends Object> paramSet);
  
  void prepareCompose(@NotNull Function0<Unit> paramFunction0);
  
  void recordReadOf(@NotNull Object paramObject);
  
  void recordWriteOf(@NotNull Object paramObject);
  
  boolean recompose();
  
  @InternalComposeApi
  void insertMovableContent(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> paramList);
  
  @InternalComposeApi
  void disposeUnusedMovableContent(@NotNull MovableContentState paramMovableContentState);
  
  void applyChanges();
  
  void applyLateChanges();
  
  void changesApplied();
  
  void abandonChanges();
  
  void invalidateAll();
  
  @InternalComposeApi
  void verifyConsistent();
  
  <R> R delegateInvalidations(@Nullable ControlledComposition paramControlledComposition, int paramInt, @NotNull Function0<? extends R> paramFunction0);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\ControlledComposition.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */