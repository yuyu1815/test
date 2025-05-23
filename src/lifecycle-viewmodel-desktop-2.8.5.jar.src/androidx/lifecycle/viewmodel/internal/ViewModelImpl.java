/*     */ package androidx.lifecycle.viewmodel.internal;
/*     */ 
/*     */ import androidx.annotation.MainThread;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\002\n\002\020#\n\000\n\002\020\013\n\000\n\002\020%\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\b\b\000\030\0002\0020\001B\007\b\026¢\006\002\020\002B\017\b\026\022\006\020\003\032\0020\004¢\006\002\020\005B\033\b\026\022\022\020\006\032\n\022\006\b\001\022\0020\b0\007\"\0020\b¢\006\002\020\tB#\b\026\022\006\020\003\032\0020\004\022\022\020\006\032\n\022\006\b\001\022\0020\b0\007\"\0020\b¢\006\002\020\nJ\016\020\023\032\0020\0242\006\020\025\032\0020\bJ\026\020\023\032\0020\0242\006\020\026\032\0020\0202\006\020\025\032\0020\bJ\b\020\027\032\0020\024H\007J\022\020\030\032\0020\0242\b\020\025\032\004\030\0010\bH\002J\037\020\031\032\004\030\001H\032\"\b\b\000\020\032*\0020\b2\006\020\026\032\0020\020¢\006\002\020\033R\024\020\006\032\b\022\004\022\0020\b0\013X\004¢\006\002\n\000R\016\020\f\032\0020\rX\016¢\006\002\n\000R\032\020\016\032\016\022\004\022\0020\020\022\004\022\0020\b0\017X\004¢\006\002\n\000R\016\020\021\032\0020\022X\004¢\006\002\n\000¨\006\034"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "", "()V", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "closeables", "", "Ljava/lang/AutoCloseable;", "([Ljava/lang/AutoCloseable;)V", "(Lkotlinx/coroutines/CoroutineScope;[Ljava/lang/AutoCloseable;)V", "", "isCleared", "", "keyToCloseables", "", "", "lock", "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "addCloseable", "", "closeable", "key", "clear", "closeWithRuntimeException", "getCloseable", "T", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "lifecycle-viewmodel"})
/*     */ @SourceDebugExtension({"SMAP\nViewModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelImpl.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelImpl\n+ 2 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n*L\n1#1,136:1\n36#2,2:137\n36#2,2:140\n36#2,2:143\n36#2,2:146\n23#3:139\n23#3:142\n23#3:145\n23#3:148\n*S KotlinDebug\n*F\n+ 1 ViewModelImpl.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelImpl\n*L\n83#1:137,2\n106#1:140,2\n120#1:143,2\n126#1:146,2\n83#1:139\n106#1:142\n120#1:145\n126#1:148\n*E\n"})
/*     */ public final class ViewModelImpl
/*     */ {
/*     */   @NotNull
/*  36 */   private final SynchronizedObject lock = new SynchronizedObject();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  52 */   private final Map<String, AutoCloseable> keyToCloseables = new LinkedHashMap<>();
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  57 */   private final Set<AutoCloseable> closeables = new LinkedHashSet<>();
/*     */ 
/*     */   
/*     */   private volatile boolean isCleared;
/*     */ 
/*     */ 
/*     */   
/*     */   public ViewModelImpl(@NotNull CoroutineScope viewModelScope) {
/*  65 */     addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", CloseableCoroutineScopeKt.asCloseable(viewModelScope));
/*     */   }
/*     */   
/*     */   public ViewModelImpl(@NotNull AutoCloseable... closeables) {
/*  69 */     CollectionsKt.addAll(this.closeables, (Object[])closeables);
/*     */   }
/*     */   
/*     */   public ViewModelImpl(@NotNull CoroutineScope viewModelScope, @NotNull AutoCloseable... closeables) {
/*  73 */     addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", CloseableCoroutineScopeKt.asCloseable(viewModelScope));
/*  74 */     CollectionsKt.addAll(this.closeables, (Object[])closeables);
/*     */   }
/*     */ 
/*     */   
/*     */   @MainThread
/*     */   public final void clear() {
/*  80 */     if (this.isCleared)
/*     */       return; 
/*  82 */     this.isCleared = true;
/*  83 */     SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 138 */     int $i$f$synchronizedImpl = 0;
/* 139 */     synchronized (lock$iv) { int $i$a$-synchronized-ViewModelImpl$clear$1 = 0; for (AutoCloseable closeable : access$getKeyToCloseables$p(this).values()) access$closeWithRuntimeException(this, closeable);  for (AutoCloseable closeable : access$getCloseables$p(this)) access$closeWithRuntimeException(this, closeable);  access$getCloseables$p(this).clear(); Unit unit = Unit.INSTANCE; }
/*     */      } public final void addCloseable(@NotNull String key, @NotNull AutoCloseable closeable) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(closeable, "closeable"); if (this.isCleared) { closeWithRuntimeException(closeable); return; }
/* 141 */      SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0; int $i$f$synchronizedImpl = 0;
/* 142 */     synchronized (lock$iv) { int $i$a$-synchronized-ViewModelImpl$addCloseable$oldCloseable$1 = 0; AutoCloseable autoCloseable = access$getKeyToCloseables$p(this).put(key, closeable); }  AutoCloseable oldCloseable = autoCloseable; closeWithRuntimeException(oldCloseable); } public final void addCloseable(@NotNull AutoCloseable closeable) { Intrinsics.checkNotNullParameter(closeable, "closeable"); if (this.isCleared) {
/*     */       closeWithRuntimeException(closeable); return;
/* 144 */     }  SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0; int $i$f$synchronizedImpl = 0;
/* 145 */     synchronized (lock$iv) { int $i$a$-synchronized-ViewModelImpl$addCloseable$1 = 0; access$getCloseables$p(this).add(closeable); Unit unit = Unit.INSTANCE; }
/*     */      } @Nullable public final <T extends AutoCloseable> T getCloseable(@NotNull String key) { Intrinsics.checkNotNullParameter(key, "key"); SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0;
/* 147 */     int $i$f$synchronizedImpl = 0;
/* 148 */     synchronized (lock$iv) { int $i$a$-synchronized-ViewModelImpl$getCloseable$1 = 0; AutoCloseable autoCloseable = (AutoCloseable)access$getKeyToCloseables$p(this).get(key); }  return (T)autoCloseable; }
/*     */ 
/*     */   
/*     */   private final void closeWithRuntimeException(AutoCloseable closeable) {
/*     */     try {
/*     */       if (closeable != null) {
/*     */         closeable.close();
/*     */       } else {
/*     */       
/*     */       } 
/*     */     } catch (Exception e) {
/*     */       throw new RuntimeException((Throwable)e);
/*     */     } 
/*     */   }
/*     */   
/*     */   public ViewModelImpl() {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\viewmodel\internal\ViewModelImpl.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */