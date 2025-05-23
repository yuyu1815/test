/*    */ package com.intellij.ml.llm.matterhorn.ej.goland.relevance.extractors;
/*    */ 
/*    */ import com.goide.psi.GoImportSpec;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.ElementProvider;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\026J\026\020\t\032\b\022\004\022\0020\b0\0052\006\020\007\032\0020\bH\026J\022\020\n\032\004\030\0010\0132\006\020\007\032\0020\bH\026J\030\020\f\032\0020\r2\006\020\016\032\0020\0062\006\020\017\032\0020\020H\026J\030\020\021\032\0020\r2\006\020\016\032\0020\0222\006\020\017\032\0020\020H\002J\030\020\023\032\0020\r2\006\020\016\032\0020\0242\006\020\017\032\0020\020H\002¨\006\025²\006\n\020\026\032\0020\027X\002"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/goland/relevance/extractors/GoElementProvider;", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider;", "<init>", "()V", "extractElements", "", "Lcom/intellij/psi/PsiElement;", "file", "Lcom/intellij/psi/PsiFile;", "getImports", "getImportStatements", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ImportStatementInfo;", "getDeclarationString", "", "element", "params", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;", "getFunctionOrMethodDeclarationString", "Lcom/goide/psi/GoFunctionOrMethodDeclaration;", "getTypeSpecDeclarationString", "Lcom/goide/psi/GoTypeSpec;", "ej-goland", "document", "Lcom/intellij/openapi/editor/Document;"})
/*    */ @SourceDebugExtension({"SMAP\nGoElementProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoElementProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/goland/relevance/extractors/GoElementProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1368#2:77\n1454#2,5:78\n1557#2:83\n1628#2,3:84\n*S KotlinDebug\n*F\n+ 1 GoElementProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/goland/relevance/extractors/GoElementProvider\n*L\n21#1:77\n21#1:78,5\n46#1:83\n46#1:84,3\n*E\n"})
/*    */ public final class GoElementProvider implements ElementProvider {
/*    */   @NotNull
/* 18 */   public List<PsiElement> extractElements(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file");
/* 19 */     Class[] arrayOfClass = new Class[2]; arrayOfClass[0] = GoFunctionOrMethodDeclaration.class; arrayOfClass[1] = 
/* 20 */       GoTypeDeclaration.class; Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.getChildrenOfAnyType((PsiElement)file, arrayOfClass), "getChildrenOfAnyType(...)"); List list1 = PsiTreeUtil.getChildrenOfAnyType((PsiElement)file, arrayOfClass);
/* 21 */     int $i$f$flatMap = 0;
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
/*    */ 
/*    */ 
/*    */     
/* 77 */     List list2 = list1; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 78 */     for (Object element$iv$iv : list2) {
/* 79 */       GoTopLevelDeclaration decl = (GoTopLevelDeclaration)element$iv$iv; int $i$a$-flatMap-GoElementProvider$extractElements$1 = 0;
/*    */       GoTopLevelDeclaration goTopLevelDeclaration1 = decl;
/*    */     } 
/* 82 */     return (List<PsiElement>)destination$iv$iv; } @Nullable public ElementProvider.ImportStatementInfo getImportStatements(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file"); Lazy<? extends Document> document$delegate = LazyKt.lazy(file::getImportStatements$lambda$2); Class[] arrayOfClass = new Class[2]; arrayOfClass[0] = GoImportSpec.class; arrayOfClass[1] = GoPackageClause.class; Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass), "findChildrenOfAnyType(...)"); Collection collection1 = PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass); int $i$f$map = 0;
/* 83 */     Collection collection2 = collection1; Collection<Pair> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection1, 10)); int $i$f$mapTo = 0;
/* 84 */     for (Object item$iv$iv : collection2) {
/* 85 */       PsiElement psiElement = (PsiElement)item$iv$iv; Collection<Pair> collection = destination$iv$iv; int $i$a$-map-GoElementProvider$getImportStatements$importRanges$1 = 0; collection.add(ExtractorUtilsKt.getImportRange(getImportStatements$lambda$3(document$delegate), psiElement));
/* 86 */     }  List importRanges = (List)destination$iv$iv;
/*    */     return ExtractorUtilsKt.printImportStatements$default(importRanges, getImportStatements$lambda$3(document$delegate), null, 4, null); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public List<PsiFile> getImports(@NotNull PsiFile file) {
/*    */     Intrinsics.checkNotNullParameter(file, "file");
/*    */     List list1 = CollectionsKt.createListBuilder(), $this$getImports_u24lambda_u241 = list1;
/*    */     int $i$a$-buildList-GoElementProvider$getImports$1 = 0;
/*    */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfType((PsiElement)file, GoImportSpec.class), "findChildrenOfType(...)");
/*    */     Collection imports = PsiTreeUtil.findChildrenOfType((PsiElement)file, GoImportSpec.class);
/*    */     for (GoImportSpec import : imports) {
/*    */       Intrinsics.checkNotNullExpressionValue(import.resolve(GoPsiImplUtil.createContextOnElement((PsiElement)import)), "resolve(...)");
/*    */       Collection packages = import.resolve(GoPsiImplUtil.createContextOnElement((PsiElement)import));
/*    */       for (GoPackage pkg : packages) {
/*    */         Intrinsics.checkNotNullExpressionValue(pkg.files(), "files(...)");
/*    */         $this$getImports_u24lambda_u241.addAll(pkg.files());
/*    */       } 
/*    */     } 
/*    */     return CollectionsKt.build(list1);
/*    */   }
/*    */   
/*    */   private static final Document getImportStatements$lambda$2(PsiFile $file) {
/*    */     Intrinsics.checkNotNullExpressionValue($file.getFileDocument(), "getFileDocument(...)");
/*    */     return $file.getFileDocument();
/*    */   }
/*    */   
/*    */   private static final Document getImportStatements$lambda$3(Lazy $document$delegate) {
/*    */     Lazy lazy = $document$delegate;
/*    */     return (Document)lazy.getValue();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String getDeclarationString(@NotNull PsiElement element, @NotNull ElementProvider.ShowMethodsParametersType params) {
/*    */     Intrinsics.checkNotNullParameter(element, "element");
/*    */     Intrinsics.checkNotNullParameter(params, "params");
/*    */     PsiElement psiElement = element;
/*    */     return StringUtilKt.reformatToSingleLine((psiElement instanceof GoFunctionOrMethodDeclaration) ? getFunctionOrMethodDeclarationString((GoFunctionOrMethodDeclaration)element, params) : ((psiElement instanceof GoTypeSpec) ? getTypeSpecDeclarationString((GoTypeSpec)element, params) : ""));
/*    */   }
/*    */   
/*    */   private final String getFunctionOrMethodDeclarationString(GoFunctionOrMethodDeclaration element, ElementProvider.ShowMethodsParametersType params) {
/*    */     Intrinsics.checkNotNullExpressionValue((new GoCustomPsiPresentationBuilder(params)).build((GoSignatureOwner)element, true), "build(...)");
/*    */     return (new GoCustomPsiPresentationBuilder(params)).build((GoSignatureOwner)element, true);
/*    */   }
/*    */   
/*    */   private final String getTypeSpecDeclarationString(GoTypeSpec element, ElementProvider.ShowMethodsParametersType params) {
/*    */     Intrinsics.checkNotNullExpressionValue(element.getSpecType(), "getSpecType(...)");
/*    */     GoSpecType specType = element.getSpecType();
/*    */     GoType type = specType.getType();
/*    */     String typeText = (type instanceof com.goide.psi.GoStructType) ? "struct" : ((type instanceof com.goide.psi.GoInterfaceType) ? "interface" : ((type == null) ? specType.getText() : (new GoCustomPsiPresentationBuilder(params)).build(type)));
/*    */     return "type " + element.getName() + " " + typeText;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\goland\relevance\extractors\GoElementProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */