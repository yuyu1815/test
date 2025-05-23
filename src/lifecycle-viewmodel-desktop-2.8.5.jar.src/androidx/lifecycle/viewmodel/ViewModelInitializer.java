/*    */ package androidx.lifecycle.viewmodel;
/*    */ 
/*    */ import androidx.lifecycle.ViewModel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\006\030\000*\b\b\000\020\001*\0020\0022\0020\003B,\022\f\020\004\032\b\022\004\022\0028\0000\005\022\027\020\006\032\023\022\004\022\0020\b\022\004\022\0028\0000\007¢\006\002\b\t¢\006\002\020\nR\032\020\004\032\b\022\004\022\0028\0000\005X\004¢\006\b\n\000\032\004\b\013\020\fR%\020\006\032\023\022\004\022\0020\b\022\004\022\0028\0000\007¢\006\002\b\tX\004¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2 = {"Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "T", "Landroidx/lifecycle/ViewModel;", "", "clazz", "Lkotlin/reflect/KClass;", "initializer", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "getClazz$lifecycle_viewmodel", "()Lkotlin/reflect/KClass;", "getInitializer$lifecycle_viewmodel", "()Lkotlin/jvm/functions/Function1;", "lifecycle-viewmodel"})
/*    */ public final class ViewModelInitializer<T extends ViewModel>
/*    */ {
/*    */   @NotNull
/*    */   private final KClass<T> clazz;
/*    */   @NotNull
/*    */   private final Function1<CreationExtras, T> initializer;
/*    */   
/*    */   public ViewModelInitializer(@NotNull KClass<T> clazz, @NotNull Function1<CreationExtras, T> initializer) {
/* 26 */     this.clazz = clazz;
/* 27 */     this.initializer = initializer; } @NotNull public final Function1<CreationExtras, T> getInitializer$lifecycle_viewmodel() { return this.initializer; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final KClass<T> getClazz$lifecycle_viewmodel() {
/*    */     return this.clazz;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\viewmodel\ViewModelInitializer.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */