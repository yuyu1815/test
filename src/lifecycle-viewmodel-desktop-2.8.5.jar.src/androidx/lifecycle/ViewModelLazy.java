/*    */ package androidx.lifecycle;
/*    */ 
/*    */ import androidx.lifecycle.viewmodel.CreationExtras;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmOverloads;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.reflect.KClass;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\030\000*\b\b\000\020\001*\0020\0022\b\022\004\022\002H\0010\003BA\b\007\022\f\020\004\032\b\022\004\022\0028\0000\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\f\020\t\032\b\022\004\022\0020\n0\007\022\016\b\002\020\013\032\b\022\004\022\0020\f0\007¢\006\002\020\rJ\b\020\023\032\0020\024H\026R\022\020\016\032\004\030\0018\000X\016¢\006\004\n\002\020\017R\024\020\013\032\b\022\004\022\0020\f0\007X\004¢\006\002\n\000R\024\020\t\032\b\022\004\022\0020\n0\007X\004¢\006\002\n\000R\024\020\006\032\b\022\004\022\0020\b0\007X\004¢\006\002\n\000R\024\020\020\032\0028\0008VX\004¢\006\006\032\004\b\021\020\022R\024\020\004\032\b\022\004\022\0028\0000\005X\004¢\006\002\n\000¨\006\025"}, d2 = {"Landroidx/lifecycle/ViewModelLazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Lkotlin/Lazy;", "viewModelClass", "Lkotlin/reflect/KClass;", "storeProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "factoryProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "cached", "Landroidx/lifecycle/ViewModel;", "value", "getValue", "()Landroidx/lifecycle/ViewModel;", "isInitialized", "", "lifecycle-viewmodel"})
/*    */ @SourceDebugExtension({"SMAP\nViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelLazy.kt\nandroidx/lifecycle/ViewModelLazy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
/*    */ public final class ViewModelLazy<VM extends ViewModel>
/*    */   implements Lazy<VM>
/*    */ {
/*    */   @NotNull
/*    */   private final KClass<VM> viewModelClass;
/*    */   @NotNull
/*    */   private final Function0<ViewModelStore> storeProducer;
/*    */   @NotNull
/*    */   private final Function0<ViewModelProvider.Factory> factoryProducer;
/*    */   @NotNull
/*    */   private final Function0<CreationExtras> extrasProducer;
/*    */   @Nullable
/*    */   private VM cached;
/*    */   
/*    */   @JvmOverloads
/*    */   public ViewModelLazy(@NotNull KClass<VM> viewModelClass, @NotNull Function0<ViewModelStore> storeProducer, @NotNull Function0<ViewModelProvider.Factory> factoryProducer, @NotNull Function0<CreationExtras> extrasProducer) {
/* 36 */     this.viewModelClass = viewModelClass;
/* 37 */     this.storeProducer = storeProducer;
/* 38 */     this.factoryProducer = factoryProducer;
/* 39 */     this.extrasProducer = extrasProducer;
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public VM getValue() {
/* 45 */     VM vM = this.cached;
/*    */     
/* 47 */     ViewModelStore store = (ViewModelStore)this.storeProducer.invoke();
/* 48 */     ViewModelProvider.Factory factory = (ViewModelProvider.Factory)this.factoryProducer.invoke();
/* 49 */     CreationExtras extras = (CreationExtras)this.extrasProducer.invoke();
/*    */     
/* 51 */     ViewModel viewModel1 = (ViewModel)ViewModelProvider.Companion.create(store, factory, extras).get((KClass)this.viewModelClass);
/* 52 */     ViewModel it = viewModel1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 61 */     int $i$a$-also-ViewModelLazy$value$1 = 0;
/*    */     this.cached = (VM)it;
/*    */     return (vM == null) ? (VM)viewModel1 : vM;
/*    */   }
/*    */   
/*    */   public boolean isInitialized() {
/*    */     return (this.cached != null);
/*    */   }
/*    */   
/*    */   @JvmOverloads
/*    */   public ViewModelLazy(@NotNull KClass viewModelClass, @NotNull Function0 storeProducer, @NotNull Function0 factoryProducer) {
/*    */     this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\ViewModelLazy.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */