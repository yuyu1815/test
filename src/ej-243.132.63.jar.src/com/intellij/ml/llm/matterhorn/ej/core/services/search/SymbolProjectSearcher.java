/*    */ package com.intellij.ml.llm.matterhorn.ej.core.services.search;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\006\030\0002\0020\001:\001\021B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\006\032\0020\0072\006\020\b\032\0020\tH\026R!\020\n\032\b\022\004\022\0020\f0\0138VX\002¢\006\f\n\004\b\017\020\020\032\004\b\r\020\016¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SymbolProjectSearcher;", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "getContributorsBasedGotoByModel", "Lcom/intellij/ide/util/gotoByName/ContributorsBasedGotoByModel;", "disposable", "Lcom/intellij/openapi/Disposable;", "prefixToReplace", "", "", "getPrefixToReplace", "()Ljava/util/List;", "prefixToReplace$delegate", "Lkotlin/Lazy;", "GotoSymbolModel2WithWorkaround", "ej-core"})
/*    */ public final class SymbolProjectSearcher extends AbstractSymbolProjectSearcher {
/*  8 */   public SymbolProjectSearcher(@NotNull Project project) { super(project);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 13 */     this.prefixToReplace$delegate = LazyKt.lazy(SymbolProjectSearcher::prefixToReplace_delegate$lambda$0); } @NotNull private final Lazy prefixToReplace$delegate; @NotNull public ContributorsBasedGotoByModel getContributorsBasedGotoByModel(@NotNull Disposable disposable) { Intrinsics.checkNotNullParameter(disposable, "disposable"); return (ContributorsBasedGotoByModel)new GotoSymbolModel2WithWorkaround(getProject(), disposable); } @NotNull public List<String> getPrefixToReplace() { Lazy lazy = this.prefixToReplace$delegate; return (List<String>)lazy.getValue(); }
/* 14 */   private static final List prefixToReplace_delegate$lambda$0() { String[] arrayOfString = new String[2]; arrayOfString[0] = "def "; arrayOfString[1] = "fun "; return CollectionsKt.listOf((Object[])arrayOfString); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\007\b\002\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\026\020\020\032\020\022\f\022\n \013*\004\030\0010\n0\n0\tH\024R)\020\b\032\020\022\f\022\n \013*\004\030\0010\n0\n0\t8BX\002¢\006\f\n\004\b\016\020\017\032\004\b\f\020\r¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SymbolProjectSearcher$GotoSymbolModel2WithWorkaround;", "Lcom/intellij/ide/util/gotoByName/GotoSymbolModel2;", "project", "Lcom/intellij/openapi/project/Project;", "disposable", "Lcom/intellij/openapi/Disposable;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/Disposable;)V", "myFilteredContributors", "", "Lcom/intellij/navigation/ChooseByNameContributor;", "kotlin.jvm.PlatformType", "getMyFilteredContributors", "()Ljava/util/List;", "myFilteredContributors$delegate", "Lkotlin/Lazy;", "getContributorList", "ej-core"})
/*    */   @SourceDebugExtension({"SMAP\nSymbolProjectSearcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolProjectSearcher.kt\ncom/intellij/ml/llm/matterhorn/ej/core/services/search/SymbolProjectSearcher$GotoSymbolModel2WithWorkaround\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n774#2:28\n865#2,2:29\n*S KotlinDebug\n*F\n+ 1 SymbolProjectSearcher.kt\ncom/intellij/ml/llm/matterhorn/ej/core/services/search/SymbolProjectSearcher$GotoSymbolModel2WithWorkaround\n*L\n20#1:28\n20#1:29,2\n*E\n"})
/*    */   private static final class GotoSymbolModel2WithWorkaround extends GotoSymbolModel2 { @NotNull
/*    */     private final Lazy myFilteredContributors$delegate;
/* 18 */     public GotoSymbolModel2WithWorkaround(@NotNull Project project, @NotNull Disposable disposable) { super(project, disposable);
/* 19 */       this.myFilteredContributors$delegate = LazyKt.lazy(this::myFilteredContributors_delegate$lambda$1); } private final List<ChooseByNameContributor> getMyFilteredContributors() { Lazy lazy = this.myFilteredContributors$delegate; return (List<ChooseByNameContributor>)lazy.getValue(); } private static final List myFilteredContributors_delegate$lambda$1(GotoSymbolModel2WithWorkaround this$0) {
/* 20 */       Intrinsics.checkNotNullExpressionValue(this$0.getContributorList(), "getContributorList(...)"); Iterable $this$filter$iv = this$0.getContributorList(); int $i$f$filter = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 28 */       Iterable iterable1 = $this$filter$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 29 */       for (Object element$iv$iv : iterable1) { ChooseByNameContributor it = (ChooseByNameContributor)element$iv$iv; int $i$a$-filter-SymbolProjectSearcher$GotoSymbolModel2WithWorkaround$myFilteredContributors$2$1 = 0; Intrinsics.checkNotNull(it); }
/* 30 */        return (List)destination$iv$iv;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     protected List<ChooseByNameContributor> getContributorList() {
/*    */       return getMyFilteredContributors();
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\SymbolProjectSearcher.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */