/*    */ package androidx.lifecycle.viewmodel.internal;
/*    */ 
/*    */ import androidx.lifecycle.ViewModelProvider;
/*    */ import androidx.lifecycle.viewmodel.CreationExtras;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmClassMappingKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.reflect.KClass;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J-\020\003\032\002H\004\"\b\b\000\020\004*\0020\0052\f\020\006\032\b\022\004\022\002H\0040\0072\006\020\b\032\0020\tH\026¢\006\002\020\n¨\006\013"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/DefaultViewModelProviderFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Lkotlin/reflect/KClass;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel"})
/*    */ public final class DefaultViewModelProviderFactory
/*    */   implements ViewModelProvider.Factory
/*    */ {
/*    */   @NotNull
/*    */   public static final DefaultViewModelProviderFactory INSTANCE = new DefaultViewModelProviderFactory();
/*    */   
/*    */   @NotNull
/*    */   public <T extends androidx.lifecycle.ViewModel> T create(@NotNull KClass modelClass, @NotNull CreationExtras extras) {
/* 26 */     Intrinsics.checkNotNullParameter(modelClass, "modelClass"); Intrinsics.checkNotNullParameter(extras, "extras"); return JvmViewModelProviders.INSTANCE.createViewModel(JvmClassMappingKt.getJavaClass(modelClass));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\viewmodel\internal\DefaultViewModelProviderFactory.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */