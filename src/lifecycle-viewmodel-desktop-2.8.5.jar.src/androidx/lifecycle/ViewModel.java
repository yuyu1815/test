/*    */ package androidx.lifecycle;
/*    */ 
/*    */ import androidx.annotation.MainThread;
/*    */ import androidx.lifecycle.viewmodel.internal.ViewModelImpl;
/*    */ import java.io.Closeable;
/*    */ import java.util.Arrays;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\007\b&\030\0002\0020\001B\007\b\026¢\006\002\020\002B\017\b\026\022\006\020\003\032\0020\004¢\006\002\020\005B\033\b\026\022\022\020\006\032\n\022\006\b\001\022\0020\b0\007\"\0020\b¢\006\002\020\tB#\b\026\022\006\020\003\032\0020\004\022\022\020\006\032\n\022\006\b\001\022\0020\b0\007\"\0020\b¢\006\002\020\nB\033\b\027\022\022\020\006\032\n\022\006\b\001\022\0020\0130\007\"\0020\013¢\006\002\020\fJ\020\020\017\032\0020\0202\006\020\021\032\0020\013H\027J\020\020\017\032\0020\0202\006\020\021\032\0020\bH\026J\026\020\017\032\0020\0202\006\020\022\032\0020\0232\006\020\021\032\0020\bJ\r\020\024\032\0020\020H\001¢\006\002\b\025J\037\020\026\032\004\030\001H\027\"\b\b\000\020\027*\0020\b2\006\020\022\032\0020\023¢\006\002\020\030J\b\020\031\032\0020\020H\024R\020\020\r\032\004\030\0010\016X\004¢\006\002\n\000¨\006\032"}, d2 = {"Landroidx/lifecycle/ViewModel;", "", "()V", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "closeables", "", "Ljava/lang/AutoCloseable;", "([Ljava/lang/AutoCloseable;)V", "(Lkotlinx/coroutines/CoroutineScope;[Ljava/lang/AutoCloseable;)V", "Ljava/io/Closeable;", "([Ljava/io/Closeable;)V", "impl", "Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "addCloseable", "", "closeable", "key", "", "clear", "clear$lifecycle_viewmodel", "getCloseable", "T", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "onCleared", "lifecycle-viewmodel"})
/*    */ public abstract class ViewModel
/*    */ {
/*    */   @Nullable
/*    */   private final ViewModelImpl impl;
/*    */   
/*    */   public ViewModel() {
/* 37 */     this.impl = new ViewModelImpl();
/*    */   }
/*    */   
/*    */   public ViewModel(@NotNull CoroutineScope viewModelScope) {
/* 41 */     this.impl = new ViewModelImpl(viewModelScope);
/*    */   }
/*    */   
/*    */   public ViewModel(@NotNull AutoCloseable... closeables) {
/* 45 */     this.impl = new ViewModelImpl(Arrays.<AutoCloseable>copyOf(closeables, closeables.length));
/*    */   }
/*    */   
/*    */   public ViewModel(@NotNull CoroutineScope viewModelScope, @NotNull AutoCloseable... closeables) {
/* 49 */     this.impl = new ViewModelImpl(viewModelScope, Arrays.<AutoCloseable>copyOf(closeables, closeables.length));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void onCleared() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @MainThread
/*    */   public final void clear$lifecycle_viewmodel() {
/* 68 */     if (this.impl != null) { this.impl.clear(); } else {  }
/* 69 */      onCleared();
/*    */   }
/*    */   
/*    */   public final void addCloseable(@NotNull String key, @NotNull AutoCloseable closeable) {
/* 73 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(closeable, "closeable"); if (this.impl != null) { this.impl.addCloseable(key, closeable); }
/*    */     else
/*    */     {  }
/*    */      } public void addCloseable(@NotNull AutoCloseable closeable) {
/* 77 */     Intrinsics.checkNotNullParameter(closeable, "closeable"); if (this.impl != null) { this.impl.addCloseable(closeable); }
/*    */     else
/*    */     {  }
/*    */   
/*    */   }
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
/*    */   @Nullable
/*    */   public final <T extends AutoCloseable> T getCloseable(@NotNull String key) {
/* 95 */     Intrinsics.checkNotNullParameter(key, "key"); return (this.impl != null) ? (T)this.impl.getCloseable(key) : null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\ViewModel.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */