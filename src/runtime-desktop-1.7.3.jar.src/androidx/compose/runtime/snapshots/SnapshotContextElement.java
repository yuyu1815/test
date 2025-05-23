/*    */ package androidx.compose.runtime.snapshots;
/*    */ 
/*    */ import androidx.compose.runtime.ExperimentalComposeApi;
/*    */ import kotlin.Metadata;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\002\bg\030\000 \0022\0020\001:\001\002ø\001\000\002\006\n\004\b!0\001¨\006\003À\006\001"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "Key", "runtime"})
/*    */ @ExperimentalComposeApi
/*    */ public interface SnapshotContextElement
/*    */   extends CoroutineContext.Element
/*    */ {
/*    */   @NotNull
/*    */   public static final Key Key = Key.$$INSTANCE;
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls
/*    */   {
/*    */     public static <R> R fold(@NotNull SnapshotContextElement $this, Object initial, @NotNull Function2 operation) {
/* 39 */       Intrinsics.checkNotNullParameter(operation, "operation"); return (R)CoroutineContext.Element.DefaultImpls.fold($this, initial, operation); } @Nullable public static <E extends CoroutineContext.Element> E get(@NotNull SnapshotContextElement $this, @NotNull CoroutineContext.Key key) { Intrinsics.checkNotNullParameter(key, "key"); return (E)CoroutineContext.Element.DefaultImpls.get($this, key); } @NotNull public static CoroutineContext minusKey(@NotNull SnapshotContextElement $this, @NotNull CoroutineContext.Key key) { Intrinsics.checkNotNullParameter(key, "key"); return CoroutineContext.Element.DefaultImpls.minusKey($this, key); } @NotNull public static CoroutineContext plus(@NotNull SnapshotContextElement $this, @NotNull CoroutineContext context) { Intrinsics.checkNotNullParameter(context, "context"); return CoroutineContext.Element.DefaultImpls.plus($this, context); }
/*    */   
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElement$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "()V", "runtime"})
/*    */   public static final class Key implements CoroutineContext.Key<SnapshotContextElement> {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\SnapshotContextElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */