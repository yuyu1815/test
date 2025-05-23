/*     */ package androidx.lifecycle;
/*     */ 
/*     */ import androidx.annotation.MainThread;
/*     */ import androidx.annotation.RestrictTo;
/*     */ import androidx.lifecycle.viewmodel.CreationExtras;
/*     */ import androidx.lifecycle.viewmodel.ViewModelProviderImpl;
/*     */ import androidx.lifecycle.viewmodel.internal.DefaultViewModelProviderFactory;
/*     */ import androidx.lifecycle.viewmodel.internal.JvmViewModelProviders;
/*     */ import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmClassMappingKt;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.reflect.KClass;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\030\000 \0162\0020\001:\004\016\017\020\021B\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004J.\020\005\032\002H\006\"\b\b\000\020\006*\0020\0072\006\020\b\032\0020\t2\f\020\n\032\b\022\004\022\002H\0060\013H\002¢\006\002\020\fJ&\020\005\032\002H\006\"\b\b\000\020\006*\0020\0072\f\020\n\032\b\022\004\022\002H\0060\013H\002¢\006\002\020\rR\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\022"}, d2 = {"Landroidx/lifecycle/ViewModelProvider;", "", "impl", "Landroidx/lifecycle/viewmodel/ViewModelProviderImpl;", "(Landroidx/lifecycle/viewmodel/ViewModelProviderImpl;)V", "get", "T", "Landroidx/lifecycle/ViewModel;", "key", "", "modelClass", "Lkotlin/reflect/KClass;", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Landroidx/lifecycle/ViewModel;", "(Lkotlin/reflect/KClass;)Landroidx/lifecycle/ViewModel;", "Companion", "Factory", "NewInstanceFactory", "OnRequeryFactory", "lifecycle-viewmodel"})
/*     */ public final class ViewModelProvider
/*     */ {
/*     */   private ViewModelProvider(ViewModelProviderImpl impl) {
/*  29 */     this.impl = impl;
/*     */   }
/*     */   @MainThread
/*     */   @NotNull
/*     */   public final <T extends ViewModel> T get(@NotNull KClass modelClass) {
/*  34 */     Intrinsics.checkNotNullParameter(modelClass, "modelClass"); return (T)ViewModelProviderImpl.getViewModel$lifecycle_viewmodel$default(this.impl, modelClass, null, 2, null);
/*     */   }
/*     */   
/*     */   @MainThread
/*     */   @NotNull
/*     */   public final <T extends ViewModel> T get(@NotNull String key, @NotNull KClass modelClass) {
/*  40 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(modelClass, "modelClass"); return (T)this.impl.getViewModel$lifecycle_viewmodel(modelClass, key);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J-\020\002\032\002H\003\"\b\b\000\020\003*\0020\0042\f\020\005\032\b\022\004\022\002H\0030\0062\006\020\007\032\0020\bH\026¢\006\002\020\tø\001\000\002\006\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Lkotlin/reflect/KClass;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel"})
/*     */   public static interface Factory { @NotNull
/*     */     default <T extends ViewModel> T create(@NotNull KClass modelClass, @NotNull CreationExtras extras) {
/*  46 */       Intrinsics.checkNotNullParameter(modelClass, "modelClass"); Intrinsics.checkNotNullParameter(extras, "extras"); return (T)ViewModelProviders.INSTANCE.unsupportedCreateViewModel$lifecycle_viewmodel();
/*     */     } }
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\b\027\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "", "()V", "onRequery", "", "viewModel", "Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel"})
/*     */   @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/*     */   public static class OnRequeryFactory { public void onRequery(@NotNull ViewModel viewModel) {
/*  51 */       Intrinsics.checkNotNullParameter(viewModel, "viewModel");
/*     */     } }
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\026\030\000 \0132\0020\001:\001\013B\005¢\006\002\020\002J-\020\003\032\002H\004\"\b\b\000\020\004*\0020\0052\f\020\006\032\b\022\004\022\002H\0040\0072\006\020\b\032\0020\tH\026¢\006\002\020\n¨\006\f"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Lkotlin/reflect/KClass;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel"})
/*     */   public static class NewInstanceFactory implements Factory { @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     @Nullable
/*     */     private static NewInstanceFactory _instance;
/*     */     
/*     */     @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/*     */     @NotNull
/*     */     public static final NewInstanceFactory getInstance() {
/*     */       return Companion.getInstance();
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public <T extends ViewModel> T create(@NotNull KClass modelClass, @NotNull CreationExtras extras) {
/*  67 */       Intrinsics.checkNotNullParameter(modelClass, "modelClass"); Intrinsics.checkNotNullParameter(extras, "extras"); return (T)JvmViewModelProviders.INSTANCE.createViewModel(JvmClassMappingKt.getJavaClass(modelClass));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\020\020\003\032\004\030\0010\004X\016¢\006\002\n\000R\032\020\005\032\0020\0048GX\004¢\006\f\022\004\b\006\020\002\032\004\b\007\020\b¨\006\t"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion;", "", "()V", "_instance", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "instance", "getInstance$annotations", "getInstance", "()Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "lifecycle-viewmodel"})
/*     */     public static final class Companion
/*     */     {
/*     */       private Companion() {}
/*     */ 
/*     */       
/*     */       @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/*     */       @NotNull
/*     */       public final ViewModelProvider.NewInstanceFactory getInstance() {
/*  81 */         if (ViewModelProvider.NewInstanceFactory._instance == null) {
/*  82 */           ViewModelProvider.NewInstanceFactory._instance = new ViewModelProvider.NewInstanceFactory();
/*     */         }
/*  84 */         Intrinsics.checkNotNull(ViewModelProvider.NewInstanceFactory._instance); return ViewModelProvider.NewInstanceFactory._instance;
/*     */       }
/*     */     } }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J$\020\006\032\0020\0072\006\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\rH\007J$\020\006\032\0020\0072\006\020\016\032\0020\0172\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\rH\007R\026\020\003\032\b\022\004\022\0020\0050\0048\006X\004¢\006\002\n\000¨\006\020"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Companion;", "", "()V", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "create", "Landroidx/lifecycle/ViewModelProvider;", "store", "Landroidx/lifecycle/ViewModelStore;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "lifecycle-viewmodel"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @JvmStatic
/*     */     @NotNull
/*     */     public final ViewModelProvider create(@NotNull ViewModelStoreOwner owner, @NotNull ViewModelProvider.Factory factory, @NotNull CreationExtras extras) {
/*  96 */       Intrinsics.checkNotNullParameter(owner, "owner"); Intrinsics.checkNotNullParameter(factory, "factory"); Intrinsics.checkNotNullParameter(extras, "extras"); return new ViewModelProvider(new ViewModelProviderImpl(owner.getViewModelStore(), factory, extras), null);
/*     */     }
/*     */ 
/*     */     
/*     */     @JvmStatic
/*     */     @NotNull
/*     */     public final ViewModelProvider create(@NotNull ViewModelStore store, @NotNull ViewModelProvider.Factory factory, @NotNull CreationExtras extras) {
/* 103 */       Intrinsics.checkNotNullParameter(store, "store"); Intrinsics.checkNotNullParameter(factory, "factory"); Intrinsics.checkNotNullParameter(extras, "extras"); return new ViewModelProvider(new ViewModelProviderImpl(store, factory, extras), null);
/*     */     } }
/*     */   
/*     */   @NotNull
/* 107 */   public static final Companion Companion = new Companion(null); @JvmField @NotNull public static final CreationExtras.Key<String> VIEW_MODEL_KEY = (CreationExtras.Key<String>)ViewModelProviders.ViewModelKey.INSTANCE;
/*     */   @NotNull
/*     */   private final ViewModelProviderImpl impl;
/*     */   
/*     */   @JvmStatic
/*     */   @NotNull
/*     */   public static final ViewModelProvider create(@NotNull ViewModelStoreOwner owner, @NotNull Factory factory, @NotNull CreationExtras extras) {
/*     */     return Companion.create(owner, factory, extras);
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   @NotNull
/*     */   public static final ViewModelProvider create(@NotNull ViewModelStore store, @NotNull Factory factory, @NotNull CreationExtras extras) {
/*     */     return Companion.create(store, factory, extras);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\ViewModelProvider.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */