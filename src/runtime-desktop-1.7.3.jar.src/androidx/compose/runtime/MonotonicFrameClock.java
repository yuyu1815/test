/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.jvm.functions.Function1;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\020\t\n\002\030\002\n\002\b\005\bf\030\000 \0172\0020\001:\001\017J7\020\006\032\002H\007\"\004\b\000\020\0072!\020\b\032\035\022\023\022\0210\n¢\006\f\b\013\022\b\b\f\022\004\b\b(\r\022\004\022\002H\0070\tH¦@¢\006\002\020\016R\030\020\002\032\006\022\002\b\0030\0038VX\004¢\006\006\032\004\b\004\020\005ø\001\000\002\006\n\004\b!0\001¨\006\020À\006\003"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Key", "runtime"})
/*    */ public interface MonotonicFrameClock
/*    */   extends CoroutineContext.Element
/*    */ {
/*    */   @NotNull
/*    */   public static final Key Key = Key.$$INSTANCE;
/*    */   
/*    */   @Nullable
/*    */   <R> Object withFrameNanos(@NotNull Function1<? super Long, ? extends R> paramFunction1, @NotNull Continuation<? super R> paramContinuation);
/*    */   
/*    */   @NotNull
/*    */   default CoroutineContext.Key<?> getKey() {
/* 45 */     return Key; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48) public static final class DefaultImpls { @Deprecated @NotNull public static CoroutineContext.Key<?> getKey(@NotNull MonotonicFrameClock $this) { return $this.getKey(); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public static CoroutineContext plus(@NotNull MonotonicFrameClock $this, @NotNull CoroutineContext context) {
/*    */       Intrinsics.checkNotNullParameter(context, "context");
/*    */       return CoroutineContext.Element.DefaultImpls.plus($this, context);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public static CoroutineContext minusKey(@NotNull MonotonicFrameClock $this, @NotNull CoroutineContext.Key key) {
/*    */       Intrinsics.checkNotNullParameter(key, "key");
/*    */       return CoroutineContext.Element.DefaultImpls.minusKey($this, key);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public static <E extends CoroutineContext.Element> E get(@NotNull MonotonicFrameClock $this, @NotNull CoroutineContext.Key key) {
/*    */       Intrinsics.checkNotNullParameter(key, "key");
/*    */       return (E)CoroutineContext.Element.DefaultImpls.get($this, key);
/*    */     }
/*    */     
/*    */     public static <R> R fold(@NotNull MonotonicFrameClock $this, Object initial, @NotNull Function2 operation) {
/*    */       Intrinsics.checkNotNullParameter(operation, "operation");
/*    */       return (R)CoroutineContext.Element.DefaultImpls.fold($this, initial, operation);
/*    */     } }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/runtime/MonotonicFrameClock;", "()V", "runtime"})
/*    */   public static final class Key implements CoroutineContext.Key<MonotonicFrameClock> {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\MonotonicFrameClock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */