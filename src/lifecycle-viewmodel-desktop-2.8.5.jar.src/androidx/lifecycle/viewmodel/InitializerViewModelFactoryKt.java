/*    */ package androidx.lifecycle.viewmodel;
/*    */ 
/*    */ import androidx.lifecycle.ViewModel;
/*    */ import androidx.lifecycle.ViewModelProvider;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmName;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000&\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\032%\020\000\032\0020\0012\027\020\002\032\023\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\002\b\006H\bø\001\000\0327\020\007\032\0020\005\"\n\b\000\020\b\030\001*\0020\t*\0020\0042\031\b\b\020\007\032\023\022\004\022\0020\n\022\004\022\002H\b0\003¢\006\002\b\006H\bø\001\000\002\007\n\005\b20\001¨\006\013"}, d2 = {"viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "builder", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "", "Lkotlin/ExtensionFunctionType;", "initializer", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "lifecycle-viewmodel"})
/*    */ @JvmName(name = "InitializerViewModelFactoryKt")
/*    */ public final class InitializerViewModelFactoryKt
/*    */ {
/*    */   @NotNull
/*    */   public static final ViewModelProvider.Factory viewModelFactory(@NotNull Function1 builder) {
/* 35 */     Intrinsics.checkNotNullParameter(builder, "builder"); int $i$f$viewModelFactory = 0; InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder(); builder.invoke(initializerViewModelFactoryBuilder); return initializerViewModelFactoryBuilder.build();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\viewmodel\InitializerViewModelFactoryKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */