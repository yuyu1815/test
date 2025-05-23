/*    */ package androidx.lifecycle.viewmodel.internal;
/*    */ 
/*    */ import androidx.lifecycle.ViewModel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J#\020\003\032\002H\004\"\b\b\000\020\004*\0020\0052\f\020\006\032\b\022\004\022\002H\0040\007¢\006\002\020\b¨\006\t"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/JvmViewModelProviders;", "", "()V", "createViewModel", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel"})
/*    */ public final class JvmViewModelProviders
/*    */ {
/*    */   @NotNull
/*    */   public static final JvmViewModelProviders INSTANCE = new JvmViewModelProviders();
/*    */   
/*    */   @NotNull
/*    */   public final <T extends ViewModel> T createViewModel(@NotNull Class modelClass) {
/*    */     ViewModel viewModel;
/* 37 */     Intrinsics.checkNotNullParameter(modelClass, "modelClass"); try { Intrinsics.checkNotNullExpressionValue(
/* 38 */           modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), "{\n            modelClass…).newInstance()\n        }"); viewModel = (ViewModel)modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]); }
/* 39 */     catch (NoSuchMethodException e)
/* 40 */     { throw new RuntimeException("Cannot create an instance of " + modelClass, (Throwable)e); }
/* 41 */     catch (InstantiationException e)
/* 42 */     { throw new RuntimeException("Cannot create an instance of " + modelClass, (Throwable)e); }
/* 43 */     catch (IllegalAccessException e)
/* 44 */     { throw new RuntimeException("Cannot create an instance of " + modelClass, (Throwable)e); }  return (T)viewModel;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\viewmodel\internal\JvmViewModelProviders.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */