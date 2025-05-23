/*    */ package androidx.lifecycle;
/*    */ 
/*    */ import androidx.lifecycle.viewmodel.CreationExtras;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bf\030\0002\0020\001R\024\020\002\032\0020\0038VX\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tø\001\000\002\006\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "", "defaultViewModelCreationExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelProviderFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel"})
/*    */ public interface HasDefaultViewModelProviderFactory
/*    */ {
/*    */   @NotNull
/*    */   ViewModelProvider.Factory getDefaultViewModelProviderFactory();
/*    */   
/*    */   @NotNull
/*    */   default CreationExtras getDefaultViewModelCreationExtras() {
/* 38 */     return (CreationExtras)CreationExtras.Empty.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\HasDefaultViewModelProviderFactory.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */