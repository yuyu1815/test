/*    */ package com.intellij.ml.llm.matterhorn.ej.core.services.search;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Lazy;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\006\030\0002\0020\001:\001\021B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\006\032\0020\0072\006\020\b\032\0020\tH\026R!\020\n\032\b\022\004\022\0020\f0\0138VX\002¢\006\f\n\004\b\017\020\020\032\004\b\r\020\016¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/ClassProjectSearcher;", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "getContributorsBasedGotoByModel", "Lcom/intellij/ide/util/gotoByName/ContributorsBasedGotoByModel;", "disposable", "Lcom/intellij/openapi/Disposable;", "prefixToReplace", "", "", "getPrefixToReplace", "()Ljava/util/List;", "prefixToReplace$delegate", "Lkotlin/Lazy;", "GotoClassModel2WithWorkaround", "ej-core"})
/*    */ public final class ClassProjectSearcher extends AbstractSymbolProjectSearcher {
/*  9 */   public ClassProjectSearcher(@NotNull Project project) { super(project);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 14 */     this.prefixToReplace$delegate = LazyKt.lazy(ClassProjectSearcher::prefixToReplace_delegate$lambda$0); } @NotNull private final Lazy prefixToReplace$delegate; @NotNull public ContributorsBasedGotoByModel getContributorsBasedGotoByModel(@NotNull Disposable disposable) { Intrinsics.checkNotNullParameter(disposable, "disposable"); return (ContributorsBasedGotoByModel)new GotoClassModel2WithWorkaround(getProject()); } @NotNull public List<String> getPrefixToReplace() { Lazy lazy = this.prefixToReplace$delegate; return (List<String>)lazy.getValue(); }
/* 15 */   private static final List prefixToReplace_delegate$lambda$0() { String[] arrayOfString = new String[4]; arrayOfString[0] = "class "; arrayOfString[1] = "interface "; arrayOfString[2] = "enum "; arrayOfString[3] = "object "; return CollectionsKt.listOf((Object[])arrayOfString); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\007\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\016\032\n\022\004\022\0020\b\030\0010\007H\024R)\020\006\032\020\022\f\022\n \t*\004\030\0010\b0\b0\0078BX\002¢\006\f\n\004\b\f\020\r\032\004\b\n\020\013¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/ClassProjectSearcher$GotoClassModel2WithWorkaround;", "Lcom/intellij/ide/util/gotoByName/GotoClassModel2;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "myFilteredContributors", "", "Lcom/intellij/navigation/ChooseByNameContributor;", "kotlin.jvm.PlatformType", "getMyFilteredContributors", "()Ljava/util/List;", "myFilteredContributors$delegate", "Lkotlin/Lazy;", "getContributorList", "ej-core"})
/*    */   @SourceDebugExtension({"SMAP\nClassProjectSearcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassProjectSearcher.kt\ncom/intellij/ml/llm/matterhorn/ej/core/services/search/ClassProjectSearcher$GotoClassModel2WithWorkaround\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n774#2:30\n865#2,2:31\n*S KotlinDebug\n*F\n+ 1 ClassProjectSearcher.kt\ncom/intellij/ml/llm/matterhorn/ej/core/services/search/ClassProjectSearcher$GotoClassModel2WithWorkaround\n*L\n20#1:30\n20#1:31,2\n*E\n"})
/*    */   private static final class GotoClassModel2WithWorkaround extends GotoClassModel2 { @NotNull
/* 18 */     private final Lazy myFilteredContributors$delegate; public GotoClassModel2WithWorkaround(@NotNull Project project) { super(project);
/* 19 */       this.myFilteredContributors$delegate = LazyKt.lazy(this::myFilteredContributors_delegate$lambda$1); } private final List<ChooseByNameContributor> getMyFilteredContributors() { Lazy lazy = this.myFilteredContributors$delegate; return (List<ChooseByNameContributor>)lazy.getValue(); } private static final List myFilteredContributors_delegate$lambda$1(GotoClassModel2WithWorkaround this$0) {
/* 20 */       Intrinsics.checkNotNullExpressionValue(this$0.getContributorList(), "getContributorList(...)"); Iterable $this$filter$iv = this$0.getContributorList(); int $i$f$filter = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 30 */       Iterable iterable1 = $this$filter$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 31 */       for (Object element$iv$iv : iterable1) { ChooseByNameContributor it = (ChooseByNameContributor)element$iv$iv; int $i$a$-filter-ClassProjectSearcher$GotoClassModel2WithWorkaround$myFilteredContributors$2$1 = 0; Intrinsics.checkNotNull(it); }
/* 32 */        return (List)destination$iv$iv;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     protected List<ChooseByNameContributor> getContributorList() {
/*    */       return getMyFilteredContributors();
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\ClassProjectSearcher.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */