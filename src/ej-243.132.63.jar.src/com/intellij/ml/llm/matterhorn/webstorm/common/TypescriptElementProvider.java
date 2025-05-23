/*    */ package com.intellij.ml.llm.matterhorn.webstorm.common;
/*    */ 
/*    */ import com.intellij.lang.ecmascript6.psi.ES6ImportDeclaration;
/*    */ import com.intellij.lang.javascript.psi.JSFunction;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\026J\026\020\t\032\b\022\004\022\0020\b0\0052\006\020\007\032\0020\bH\026J\022\020\n\032\004\030\0010\0132\006\020\007\032\0020\bH\026J\030\020\f\032\0020\r2\006\020\016\032\0020\0062\006\020\017\032\0020\020H\026J\020\020\021\032\0020\r2\006\020\016\032\0020\022H\002¨\006\023²\006\n\020\024\032\0020\025X\002"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/webstorm/common/TypescriptElementProvider;", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider;", "<init>", "()V", "extractElements", "", "Lcom/intellij/psi/PsiElement;", "file", "Lcom/intellij/psi/PsiFile;", "getImports", "getImportStatements", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ImportStatementInfo;", "getDeclarationString", "", "element", "params", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;", "getFunctionSignature", "Lcom/intellij/lang/javascript/psi/JSFunction;", "webstorm-common", "document", "Lcom/intellij/openapi/editor/Document;"})
/*    */ @SourceDebugExtension({"SMAP\nTypescriptElementProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypescriptElementProvider.kt\ncom/intellij/ml/llm/matterhorn/webstorm/common/TypescriptElementProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,58:1\n1557#2:59\n1628#2,3:60\n1863#2,2:63\n1557#2:65\n1628#2,3:66\n13409#3,2:69\n*S KotlinDebug\n*F\n+ 1 TypescriptElementProvider.kt\ncom/intellij/ml/llm/matterhorn/webstorm/common/TypescriptElementProvider\n*L\n17#1:59\n17#1:60,3\n22#1:63,2\n34#1:65\n34#1:66,3\n48#1:69,2\n*E\n"})
/*    */ public final class TypescriptElementProvider implements ElementProvider {
/*    */   @NotNull
/* 17 */   public List<PsiElement> extractElements(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file"); Class[] arrayOfClass = new Class[2]; arrayOfClass[0] = JSClass.class; arrayOfClass[1] = JSFunction.class; Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass), "findChildrenOfAnyType(...)"); Iterable $this$map$iv = PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass); int $i$f$map = 0;
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
/* 59 */     Iterable iterable1 = $this$map$iv; Collection<PsiElement> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 60 */     for (Object item$iv$iv : iterable1) {
/* 61 */       PsiElement psiElement = (PsiElement)item$iv$iv; Collection<PsiElement> collection = destination$iv$iv; int $i$a$-map-TypescriptElementProvider$extractElements$1 = 0; Intrinsics.checkNotNull(psiElement, "null cannot be cast to non-null type com.intellij.psi.PsiElement"); collection.add(psiElement);
/* 62 */     }  return (List<PsiElement>)destination$iv$iv; } @NotNull public List<PsiFile> getImports(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file"); List<PsiFile> resultFiles = new ArrayList(); Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfType((PsiElement)file, ES6ImportDeclaration.class), "findChildrenOfType(...)"); Iterable $this$forEach$iv = PsiTreeUtil.findChildrenOfType((PsiElement)file, ES6ImportDeclaration.class); int $i$f$forEach = 0;
/* 63 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); ES6ImportDeclaration importDecl = (ES6ImportDeclaration)element$iv; int $i$a$-forEach-TypescriptElementProvider$getImports$1 = 0; importDecl.getFromClause(); }
/*    */      return resultFiles; } @Nullable public ElementProvider.ImportStatementInfo getImportStatements(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file"); Lazy<? extends Document> document$delegate = LazyKt.lazy(file::getImportStatements$lambda$2); Class[] arrayOfClass = new Class[1]; arrayOfClass[0] = ES6ImportDeclaration.class; Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass), "findChildrenOfAnyType(...)"); Collection collection1 = PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass); int $i$f$map = 0;
/* 65 */     Collection collection2 = collection1; Collection<Pair> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection1, 10)); int $i$f$mapTo = 0;
/* 66 */     for (Object item$iv$iv : collection2) {
/* 67 */       ES6ImportDeclaration eS6ImportDeclaration = (ES6ImportDeclaration)item$iv$iv; Collection<Pair> collection = destination$iv$iv; int $i$a$-map-TypescriptElementProvider$getImportStatements$importRanges$1 = 0; Intrinsics.checkNotNull(eS6ImportDeclaration); collection.add(ExtractorUtilsKt.getImportRange(getImportStatements$lambda$3(document$delegate), (PsiElement)eS6ImportDeclaration));
/* 68 */     }  List importRanges = (List)destination$iv$iv; return ExtractorUtilsKt.printImportStatements$default(importRanges, getImportStatements$lambda$3(document$delegate), null, 4, null); } private final String getFunctionSignature(JSFunction element) { JSParameterListElement[] arrayOfJSParameterListElement; byte b; int i; StringBuilder signature = new StringBuilder(); if (element.getName() == null)
/* 69 */       element.getName();  element.getName().append("function " + "" + "("); boolean isFirstParameter = false; isFirstParameter = true; if (element.getParameterList() != null && element.getParameterList().getParameters() != null) { arrayOfJSParameterListElement = element.getParameterList().getParameters(); int $i$f$forEach = 0; b = 0; i = arrayOfJSParameterListElement.length; } else { element.getParameterList().getParameters(); signature.append(")"); Intrinsics.checkNotNullExpressionValue(signature.toString(), "toString(...)"); return signature.toString(); }  if (b < i) { Object element$iv = arrayOfJSParameterListElement[b], object1 = element$iv; int $i$a$-forEach-TypescriptElementProvider$getFunctionSignature$1 = 0;
/*    */       if (!isFirstParameter)
/*    */         signature.append(", ");  }
/*    */      }
/*    */ 
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
/*    */     if (((JSClass)element).getName() == null)
/*    */       ((JSClass)element).getName(); 
/*    */     return StringUtilKt.reformatToSingleLine((psiElement instanceof JSClass) ? ("class " + "") : ((psiElement instanceof JSFunction) ? getFunctionSignature((JSFunction)element) : ""));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\webstorm\common\TypescriptElementProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */