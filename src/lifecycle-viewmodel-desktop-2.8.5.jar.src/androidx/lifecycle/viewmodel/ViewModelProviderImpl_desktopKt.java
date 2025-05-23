/*    */ package androidx.lifecycle.viewmodel;
/*    */ 
/*    */ import androidx.lifecycle.ViewModelProvider;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\036\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\0325\020\000\032\002H\001\"\b\b\000\020\001*\0020\0022\006\020\003\032\0020\0042\f\020\005\032\b\022\004\022\002H\0010\0062\006\020\007\032\0020\bH\000¢\006\002\020\t¨\006\n"}, d2 = {"createViewModel", "VM", "Landroidx/lifecycle/ViewModel;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "modelClass", "Lkotlin/reflect/KClass;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Landroidx/lifecycle/ViewModelProvider$Factory;Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel"})
/*    */ public final class ViewModelProviderImpl_desktopKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <VM extends androidx.lifecycle.ViewModel> VM createViewModel(@NotNull ViewModelProvider.Factory factory, @NotNull KClass modelClass, @NotNull CreationExtras extras) {
/* 27 */     Intrinsics.checkNotNullParameter(factory, "factory"); Intrinsics.checkNotNullParameter(modelClass, "modelClass"); Intrinsics.checkNotNullParameter(extras, "extras"); return (VM)factory.create(modelClass, extras);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\viewmodel\ViewModelProviderImpl_desktopKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */