/*    */ package androidx.lifecycle.viewmodel;
/*    */ 
/*    */ import androidx.lifecycle.ViewModelProvider;
/*    */ import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
/*    */ import java.util.Arrays;
/*    */ import kotlin.Metadata;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B!\022\032\020\002\032\016\022\n\b\001\022\006\022\002\b\0030\0040\003\"\006\022\002\b\0030\004¢\006\002\020\005J-\020\007\032\002H\b\"\b\b\000\020\b*\0020\t2\f\020\n\032\b\022\004\022\002H\b0\0132\006\020\f\032\0020\rH\026¢\006\002\020\016R\034\020\002\032\016\022\n\b\001\022\006\022\002\b\0030\0040\003X\004¢\006\004\n\002\020\006¨\006\017"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initializers", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)V", "[Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Lkotlin/reflect/KClass;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel"})
/*    */ public final class InitializerViewModelFactory
/*    */   implements ViewModelProvider.Factory
/*    */ {
/*    */   @NotNull
/*    */   private final ViewModelInitializer<?>[] initializers;
/*    */   
/*    */   public InitializerViewModelFactory(@NotNull ViewModelInitializer... initializers) {
/* 32 */     this.initializers = (ViewModelInitializer<?>[])initializers;
/*    */   }
/*    */   @NotNull
/*    */   public <T extends androidx.lifecycle.ViewModel> T create(@NotNull KClass modelClass, @NotNull CreationExtras extras) {
/* 36 */     Intrinsics.checkNotNullParameter(modelClass, "modelClass"); Intrinsics.checkNotNullParameter(extras, "extras"); ViewModelInitializer<?>[] arrayOfViewModelInitializer = this.initializers; return (T)ViewModelProviders.INSTANCE.createViewModelFromInitializers$lifecycle_viewmodel(modelClass, extras, Arrays.<ViewModelInitializer>copyOf((ViewModelInitializer[])arrayOfViewModelInitializer, arrayOfViewModelInitializer.length));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\viewmodel\InitializerViewModelFactory.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */