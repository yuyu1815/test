/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.runtime.internal.ThreadMap;
/*    */ import androidx.compose.runtime.internal.ThreadMap_jvmKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\b\000\030\000*\004\b\000\020\0012\0020\002B\005¢\006\002\020\003J\r\020\t\032\004\030\0018\000¢\006\002\020\nJ\025\020\013\032\0020\f2\b\020\r\032\004\030\0018\000¢\006\002\020\016R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000R\016\020\007\032\0020\bX\004¢\006\002\n\000¨\006\017"}, d2 = {"Landroidx/compose/runtime/SnapshotThreadLocal;", "T", "", "()V", "map", "Landroidx/compose/runtime/AtomicReference;", "Landroidx/compose/runtime/internal/ThreadMap;", "writeMutex", "Landroidx/compose/runtime/SynchronizedObject;", "get", "()Ljava/lang/Object;", "set", "", "value", "(Ljava/lang/Object;)V", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nSnapshotThreadLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n*L\n1#1,44:1\n26#2:45\n*S KotlinDebug\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n*L\n37#1:45\n*E\n"})
/*    */ public final class SnapshotThreadLocal<T>
/*    */ {
/*    */   @NotNull
/* 29 */   private final AtomicReference<ThreadMap> map = new AtomicReference<>(ThreadMap_jvmKt.getEmptyThreadMap()); @NotNull
/* 30 */   private final SynchronizedObject writeMutex = new SynchronizedObject(); public static final int $stable = 8;
/*    */   @Nullable
/*    */   public final T get() {
/* 33 */     return (T)((ThreadMap)this.map.get()).get(ActualJvm_jvmKt.currentThreadId());
/*    */   }
/*    */   public final void set(@Nullable Object value) {
/* 36 */     long key = ActualJvm_jvmKt.currentThreadId();
/* 37 */     SynchronizedObject lock$iv = this.writeMutex; int $i$f$synchronized = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 45 */     synchronized (lock$iv) { int $i$a$-synchronized-SnapshotThreadLocal$set$1 = 0; ThreadMap current = this.map.get(); if (current.trySet(key, value)) return;  this.map.set(current.newWith(key, value)); Unit unit = Unit.INSTANCE; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\SnapshotThreadLocal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */