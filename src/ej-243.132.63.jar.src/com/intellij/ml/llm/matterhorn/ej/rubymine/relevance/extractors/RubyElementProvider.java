/*    */ package com.intellij.ml.llm.matterhorn.ej.rubymine.relevance.extractors;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.ElementProvider;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Pair;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.plugins.ruby.ruby.lang.psi.RFile;
/*    */ import org.jetbrains.plugins.ruby.ruby.lang.psi.controlStructures.methods.RMethod;
/*    */ import org.jetbrains.plugins.ruby.ruby.lang.psi.methodCall.RCall;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\026J\026\020\t\032\b\022\004\022\0020\b0\0052\006\020\007\032\0020\bH\026J\022\020\n\032\004\030\0010\0132\006\020\007\032\0020\bH\026J\030\020\f\032\0020\r2\006\020\016\032\0020\0062\006\020\017\032\0020\020H\026J\030\020\021\032\0020\r2\006\020\022\032\0020\0232\006\020\017\032\0020\020H\002J\026\020\024\032\b\022\004\022\0020\b0\0052\006\020\025\032\0020\026H\002¨\006\027²\006\n\020\030\032\0020\031X\002"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/rubymine/relevance/extractors/RubyElementProvider;", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider;", "<init>", "()V", "extractElements", "", "Lcom/intellij/psi/PsiElement;", "file", "Lcom/intellij/psi/PsiFile;", "getImports", "getImportStatements", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ImportStatementInfo;", "getDeclarationString", "", "element", "params", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;", "formatMethod", "method", "Lorg/jetbrains/plugins/ruby/ruby/lang/psi/controlStructures/methods/RMethod;", "getRequiredFiles", "rFile", "Lorg/jetbrains/plugins/ruby/ruby/lang/psi/RFile;", "ej-rubymine", "document", "Lcom/intellij/openapi/editor/Document;"})
/*    */ @SourceDebugExtension({"SMAP\nRubyElementProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RubyElementProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/rubymine/relevance/extractors/RubyElementProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1557#2:76\n1628#2,3:77\n774#2:81\n865#2,2:82\n1557#2:84\n1628#2,3:85\n1#3:80\n*S KotlinDebug\n*F\n+ 1 RubyElementProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/rubymine/relevance/extractors/RubyElementProvider\n*L\n24#1:76\n24#1:77,3\n32#1:81\n32#1:82,2\n33#1:84\n33#1:85,3\n*E\n"})
/*    */ public final class RubyElementProvider implements ElementProvider {
/*    */   @NotNull
/* 23 */   public List<PsiElement> extractElements(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file"); Class[] arrayOfClass = new Class[3]; arrayOfClass[0] = RClass.class; arrayOfClass[1] = RModule.class; arrayOfClass[2] = RMethod.class; Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass), "findChildrenOfAnyType(...)"); Collection collection1 = PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass);
/* 24 */     int $i$f$map = 0;
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
/* 76 */     Collection collection2 = collection1; Collection<PsiElement> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection1, 10)); int $i$f$mapTo = 0;
/* 77 */     for (Object item$iv$iv : collection2) {
/* 78 */       PsiElement psiElement = (PsiElement)item$iv$iv; Collection<PsiElement> collection = destination$iv$iv; int $i$a$-map-RubyElementProvider$extractElements$1 = 0; Intrinsics.checkNotNull(psiElement, "null cannot be cast to non-null type com.intellij.psi.PsiElement"); collection.add(psiElement);
/* 79 */     }  return (List<PsiElement>)destination$iv$iv; } @NotNull public List<PsiFile> getImports(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file"); if (((file instanceof RFile) ? file : null) != null) {
/* 80 */       Object object = (file instanceof RFile) ? file : null; int $i$a$-let-RubyElementProvider$getImports$1 = 0; if (getRequiredFiles((RFile)object) == null) { getRequiredFiles((RFile)object); return CollectionsKt.emptyList(); }  return getRequiredFiles((RFile)object);
/* 81 */     }  getRequiredFiles((RFile)object); return CollectionsKt.emptyList(); } @Nullable public ElementProvider.ImportStatementInfo getImportStatements(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file"); Lazy<? extends Document> document$delegate = LazyKt.lazy(file::getImportStatements$lambda$2); Class[] arrayOfClass = new Class[1]; arrayOfClass[0] = RCall.class; Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass), "findChildrenOfAnyType(...)"); Collection collection1 = PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass); int $i$f$filter = 0; Collection collection2 = collection1; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 82 */     for (Object element$iv$iv : collection2) { RCall it = (RCall)element$iv$iv; int $i$a$-filter-RubyElementProvider$getImportStatements$importRanges$1 = 0; if ((Intrinsics.areEqual(it.getCallType(), RubyCallTypes.REQUIRE_CALL) || Intrinsics.areEqual(it.getCallType(), RubyCallTypes.REQUIRE_RELATIVE_CALL))) collection.add(element$iv$iv);  }
/* 83 */      Iterable $this$filter$iv = collection; int $i$f$map = 0;
/* 84 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection<Pair> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10)); int $i$f$mapTo = 0;
/* 85 */     for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 86 */       RCall rCall = (RCall)item$iv$iv; Collection<Pair> collection3 = destination$iv$iv; int $i$a$-map-RubyElementProvider$getImportStatements$importRanges$2 = 0; Intrinsics.checkNotNull(rCall); collection3.add(ExtractorUtilsKt.getImportRange(getImportStatements$lambda$3(document$delegate), (PsiElement)rCall));
/* 87 */     }  List importRanges = (List)destination$iv$iv;
/*    */     return ExtractorUtilsKt.printImportStatements$default(importRanges, getImportStatements$lambda$3(document$delegate), null, 4, null); }
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
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'element'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'params'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_1
/*    */     //   13: astore_3
/*    */     //   14: aload_3
/*    */     //   15: instanceof org/jetbrains/plugins/ruby/ruby/lang/psi/controlStructures/classes/RClass
/*    */     //   18: ifeq -> 76
/*    */     //   21: aload_1
/*    */     //   22: checkcast org/jetbrains/plugins/ruby/ruby/lang/psi/controlStructures/classes/RClass
/*    */     //   25: invokeinterface getFQN : ()Lorg/jetbrains/plugins/ruby/ruby/codeInsight/symbols/fqn/FQN;
/*    */     //   30: aload_1
/*    */     //   31: checkcast org/jetbrains/plugins/ruby/ruby/lang/psi/controlStructures/classes/RClass
/*    */     //   34: invokeinterface getSuperClassFQN : ()Lorg/jetbrains/plugins/ruby/ruby/codeInsight/symbols/fqn/FQN;
/*    */     //   39: dup
/*    */     //   40: ifnull -> 65
/*    */     //   43: astore #4
/*    */     //   45: astore #6
/*    */     //   47: iconst_0
/*    */     //   48: istore #5
/*    */     //   50: aload #4
/*    */     //   52: <illegal opcode> makeConcatWithConstants : (Lorg/jetbrains/plugins/ruby/ruby/codeInsight/symbols/fqn/FQN;)Ljava/lang/String;
/*    */     //   57: aload #6
/*    */     //   59: swap
/*    */     //   60: nop
/*    */     //   61: dup
/*    */     //   62: ifnonnull -> 68
/*    */     //   65: pop
/*    */     //   66: ldc ''
/*    */     //   68: <illegal opcode> makeConcatWithConstants : (Lorg/jetbrains/plugins/ruby/ruby/codeInsight/symbols/fqn/FQN;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   73: goto -> 121
/*    */     //   76: aload_3
/*    */     //   77: instanceof org/jetbrains/plugins/ruby/ruby/lang/psi/controlStructures/modules/RModule
/*    */     //   80: ifeq -> 100
/*    */     //   83: aload_1
/*    */     //   84: checkcast org/jetbrains/plugins/ruby/ruby/lang/psi/controlStructures/modules/RModule
/*    */     //   87: invokeinterface getFQN : ()Lorg/jetbrains/plugins/ruby/ruby/codeInsight/symbols/fqn/FQN;
/*    */     //   92: <illegal opcode> makeConcatWithConstants : (Lorg/jetbrains/plugins/ruby/ruby/codeInsight/symbols/fqn/FQN;)Ljava/lang/String;
/*    */     //   97: goto -> 121
/*    */     //   100: aload_3
/*    */     //   101: instanceof org/jetbrains/plugins/ruby/ruby/lang/psi/controlStructures/methods/RMethod
/*    */     //   104: ifeq -> 119
/*    */     //   107: aload_0
/*    */     //   108: aload_1
/*    */     //   109: checkcast org/jetbrains/plugins/ruby/ruby/lang/psi/controlStructures/methods/RMethod
/*    */     //   112: aload_2
/*    */     //   113: invokespecial formatMethod : (Lorg/jetbrains/plugins/ruby/ruby/lang/psi/controlStructures/methods/RMethod;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;)Ljava/lang/String;
/*    */     //   116: goto -> 121
/*    */     //   119: ldc ''
/*    */     //   121: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #41	-> 12
/*    */     //   #42	-> 14
/*    */     //   #80	-> 45
/*    */     //   #42	-> 50
/*    */     //   #42	-> 60
/*    */     //   #42	-> 61
/*    */     //   #43	-> 76
/*    */     //   #44	-> 100
/*    */     //   #45	-> 119
/*    */     //   #41	-> 121
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   50	7	5	$i$a$-let-RubyElementProvider$getDeclarationString$1	I
/*    */     //   47	10	4	it	Lorg/jetbrains/plugins/ruby/ruby/codeInsight/symbols/fqn/FQN;
/*    */     //   0	122	0	this	Lcom/intellij/ml/llm/matterhorn/ej/rubymine/relevance/extractors/RubyElementProvider;
/*    */     //   0	122	1	element	Lcom/intellij/psi/PsiElement;
/*    */     //   0	122	2	params	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;
/*    */   }
/*    */   
/*    */   private final String formatMethod(RMethod method, ElementProvider.ShowMethodsParametersType params) {
/*    */     String paramString;
/*    */     switch (WhenMappings.$EnumSwitchMapping$0[params.ordinal()]) {
/*    */       case 1:
/*    */       case 2:
/*    */         Intrinsics.checkNotNullExpressionValue(method.getArgumentInfos(), "getArgumentInfos(...)");
/*    */         Intrinsics.checkNotNullExpressionValue(method.getArgumentInfos(), "getArgumentInfos(...)");
/*    */         paramString = (!method.getArgumentInfos().isEmpty()) ? CollectionsKt.joinToString$default(method.getArgumentInfos(), ", ", "(", ")", 0, null, RubyElementProvider::formatMethod$lambda$7, 24, null) : "";
/*    */         return "def " + method.getName() + paramString;
/*    */       case 3:
/*    */       
/*    */     } 
/*    */     throw new NoWhenBranchMatchedException();
/*    */   }
/*    */   
/*    */   private static final CharSequence formatMethod$lambda$7(ArgumentInfo it) {
/*    */     Intrinsics.checkNotNullExpressionValue(it.getPresentableName(), "getPresentableName(...)");
/*    */     return it.getPresentableName();
/*    */   }
/*    */   
/*    */   private final List<PsiFile> getRequiredFiles(RFile rFile) {
/*    */     Intrinsics.checkNotNullExpressionValue(rFile.getProject(), "getProject(...)");
/*    */     Project project = rFile.getProject();
/*    */     VirtualFile vFile = rFile.getVirtualFile();
/*    */     Intrinsics.checkNotNullExpressionValue(RFileUtil.createMapByLoadpath(rFile.getLoadPath()), "createMapByLoadpath(...)");
/*    */     Object2IntMap loadPathMap = RFileUtil.createMapByLoadpath(rFile.getLoadPath());
/*    */     ArrayList<PsiFile> result = new ArrayList();
/*    */     for (RequireInfo require : rFile.getRequires()) {
/*    */       for (VirtualFile file : RFileUtil.findFilesForName(project, require.getPath(), loadPathMap, vFile.getParent(), require.isRelative(), null)) {
/*    */         if (RubyVirtualFileScanner.isRubyFile(file))
/*    */           result.add(PsiUtilCore.getPsiFile(project, file)); 
/*    */       } 
/*    */     } 
/*    */     return result;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\rubymine\relevance\extractors\RubyElementProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */