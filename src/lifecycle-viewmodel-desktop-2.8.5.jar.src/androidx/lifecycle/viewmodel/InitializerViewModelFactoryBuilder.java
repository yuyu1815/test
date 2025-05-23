/*    */ package androidx.lifecycle.viewmodel;
/*    */ 
/*    */ import androidx.lifecycle.ViewModelProvider;
/*    */ import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
/*    */ import androidx.lifecycle.viewmodel.internal.ViewModelProviders_jvmKt;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
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
/*    */ @ViewModelFactoryDsl
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020%\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\b\007\030\0002\0020\001B\005¢\006\002\020\002J7\020\007\032\0020\b\"\b\b\000\020\t*\0020\n2\f\020\013\032\b\022\004\022\002H\t0\0052\027\020\f\032\023\022\004\022\0020\016\022\004\022\002H\t0\r¢\006\002\b\017J\006\020\020\032\0020\021R\"\020\003\032\026\022\b\022\006\022\002\b\0030\005\022\b\022\006\022\002\b\0030\0060\004X\004¢\006\002\n\000¨\006\022"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "", "()V", "initializers", "", "Lkotlin/reflect/KClass;", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "addInitializer", "", "T", "Landroidx/lifecycle/ViewModel;", "clazz", "initializer", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Lkotlin/ExtensionFunctionType;", "build", "Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel"})
/*    */ public final class InitializerViewModelFactoryBuilder
/*    */ {
/*    */   @NotNull
/* 44 */   private final Map<KClass<?>, ViewModelInitializer<?>> initializers = new LinkedHashMap<>();
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
/*    */   public final <T extends androidx.lifecycle.ViewModel> void addInitializer(@NotNull KClass<?> clazz, @NotNull Function1<? super CreationExtras, ?> initializer) {
/* 57 */     Intrinsics.checkNotNullParameter(clazz, "clazz"); Intrinsics.checkNotNullParameter(initializer, "initializer"); if (!(!this.initializers.containsKey(clazz) ? 1 : 0)) { int $i$a$-require-InitializerViewModelFactoryBuilder$addInitializer$1 = 0; String str = "A `initializer` with the same `clazz` has already been added: " + 
/* 58 */         ViewModelProviders_jvmKt.getCanonicalName(clazz) + "."; throw new IllegalArgumentException(str.toString()); }
/*    */     
/* 60 */     this.initializers.put(clazz, new ViewModelInitializer(clazz, initializer));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final ViewModelProvider.Factory build() {
/* 68 */     return ViewModelProviders.INSTANCE.createInitializerFactory$lifecycle_viewmodel(this.initializers.values());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\viewmodel\InitializerViewModelFactoryBuilder.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */