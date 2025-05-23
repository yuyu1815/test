/*    */ package androidx.lifecycle;
/*    */ 
/*    */ import androidx.annotation.RestrictTo;
/*    */ import java.util.HashSet;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020%\n\002\020\016\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\020\"\n\002\b\003\b\026\030\0002\0020\001B\005¢\006\002\020\002J\006\020\007\032\0020\bJ\023\020\t\032\004\030\0010\0062\006\020\n\032\0020\005H\002J\016\020\013\032\b\022\004\022\0020\0050\fH\007J\030\020\r\032\0020\b2\006\020\n\032\0020\0052\006\020\016\032\0020\006H\007R\032\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\004X\004¢\006\002\n\000¨\006\017"}, d2 = {"Landroidx/lifecycle/ViewModelStore;", "", "()V", "map", "", "", "Landroidx/lifecycle/ViewModel;", "clear", "", "get", "key", "keys", "", "put", "viewModel", "lifecycle-viewmodel"})
/*    */ public class ViewModelStore
/*    */ {
/*    */   @NotNull
/* 37 */   private final Map<String, ViewModel> map = new LinkedHashMap<>();
/*    */ 
/*    */ 
/*    */   
/*    */   @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/*    */   public final void put(@NotNull String key, @NotNull ViewModel viewModel) {
/* 43 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(viewModel, "viewModel"); ViewModel oldViewModel = this.map.put(key, viewModel);
/* 44 */     if (oldViewModel != null) { oldViewModel.clear$lifecycle_viewmodel(); }
/*    */     else
/*    */     {  }
/*    */   
/*    */   }
/*    */ 
/*    */   
/*    */   @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/*    */   @Nullable
/*    */   public final ViewModel get(@NotNull String key) {
/* 54 */     Intrinsics.checkNotNullParameter(key, "key"); return this.map.get(key);
/*    */   }
/*    */ 
/*    */   
/*    */   @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/*    */   @NotNull
/*    */   public final Set<String> keys() {
/* 61 */     return new HashSet<>(this.map.keySet());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final void clear() {
/* 68 */     for (ViewModel vm : this.map.values()) {
/* 69 */       vm.clear$lifecycle_viewmodel();
/*    */     }
/* 71 */     this.map.clear();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\ViewModelStore.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */