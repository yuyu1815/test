/*    */ package androidx.lifecycle.viewmodel;
/*    */ 
/*    */ import androidx.lifecycle.ViewModel;
/*    */ import androidx.lifecycle.ViewModelProvider;
/*    */ import androidx.lifecycle.ViewModelStore;
/*    */ import androidx.lifecycle.ViewModelStoreOwner;
/*    */ import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.reflect.KClass;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\b\000\030\0002\0020\001B\037\b\026\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\bB\035\022\006\020\t\032\0020\n\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\013J1\020\f\032\002H\r\"\b\b\000\020\r*\0020\0162\f\020\017\032\b\022\004\022\002H\r0\0202\b\b\002\020\021\032\0020\022H\000¢\006\004\b\023\020\024R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\t\032\0020\nX\004¢\006\002\n\000¨\006\025"}, d2 = {"Landroidx/lifecycle/viewmodel/ViewModelProviderImpl;", "", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "store", "Landroidx/lifecycle/ViewModelStore;", "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "getViewModel", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Lkotlin/reflect/KClass;", "key", "", "getViewModel$lifecycle_viewmodel", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel"})
/*    */ @SourceDebugExtension({"SMAP\nViewModelProviderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProviderImpl.kt\nandroidx/lifecycle/viewmodel/ViewModelProviderImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
/*    */ public final class ViewModelProviderImpl
/*    */ {
/*    */   @NotNull
/*    */   private final ViewModelStore store;
/*    */   @NotNull
/*    */   private final ViewModelProvider.Factory factory;
/*    */   @NotNull
/*    */   private final CreationExtras extras;
/*    */   
/*    */   public ViewModelProviderImpl(@NotNull ViewModelStore store, @NotNull ViewModelProvider.Factory factory, @NotNull CreationExtras extras) {
/* 35 */     this.store = store;
/* 36 */     this.factory = factory;
/* 37 */     this.extras = extras;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ViewModelProviderImpl(@NotNull ViewModelStoreOwner owner, @NotNull ViewModelProvider.Factory factory, @NotNull CreationExtras extras) {
/* 44 */     this(owner.getViewModelStore(), factory, extras);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final <T extends ViewModel> T getViewModel$lifecycle_viewmodel(@NotNull KClass<Object> modelClass, @NotNull String key) {
/* 51 */     Intrinsics.checkNotNullParameter(modelClass, "modelClass"); Intrinsics.checkNotNullParameter(key, "key"); ViewModel viewModel = this.store.get(key);
/* 52 */     if (modelClass.isInstance(viewModel)) {
/* 53 */       if (this.factory instanceof ViewModelProvider.OnRequeryFactory) {
/* 54 */         Intrinsics.checkNotNull(viewModel); ((ViewModelProvider.OnRequeryFactory)this.factory).onRequery(viewModel);
/*    */       } 
/* 56 */       Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel"); return (T)viewModel;
/*    */     } 
/* 58 */     if (viewModel != null);
/*    */ 
/*    */ 
/*    */     
/* 62 */     MutableCreationExtras extras = new MutableCreationExtras(this.extras);
/* 63 */     extras.set((CreationExtras.Key<String>)ViewModelProviders.ViewModelKey.INSTANCE, key);
/*    */     
/* 65 */     ViewModel viewModel1 = (ViewModel)ViewModelProviderImpl_desktopKt.createViewModel(this.factory, modelClass, extras), vm = viewModel1;
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
/* 88 */     int $i$a$-also-ViewModelProviderImpl$getViewModel$1 = 0;
/*    */     this.store.put(key, vm);
/*    */     return (T)viewModel1;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\viewmodel\ViewModelProviderImpl.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */