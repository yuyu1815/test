/*     */ package com.intellij.ml.llm.matterhorn.ej.phpstorm.relevance.extractors;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.ElementProvider;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.jetbrains.php.lang.psi.elements.Parameter;
/*     */ import com.jetbrains.php.lang.psi.elements.PhpClass;
/*     */ import com.jetbrains.php.lang.psi.elements.PhpPsiElement;
/*     */ import com.jetbrains.php.lang.psi.elements.PhpUse;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\026J\026\020\t\032\b\022\004\022\0020\b0\0052\006\020\007\032\0020\bH\026J\022\020\n\032\004\030\0010\0132\006\020\007\032\0020\bH\026J\030\020\f\032\0020\r2\006\020\016\032\0020\0062\006\020\017\032\0020\020H\026J\030\020\021\032\0020\r2\006\020\016\032\0020\0222\006\020\017\032\0020\020H\002J\030\020\023\032\0020\r2\006\020\016\032\0020\0242\006\020\017\032\0020\020H\002¨\006\025²\006\n\020\026\032\0020\027X\002"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/phpstorm/relevance/extractors/PhpElementProvider;", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider;", "<init>", "()V", "extractElements", "", "Lcom/intellij/psi/PsiElement;", "file", "Lcom/intellij/psi/PsiFile;", "getImports", "getImportStatements", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ImportStatementInfo;", "getDeclarationString", "", "element", "params", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;", "getClassDeclarationString", "Lcom/jetbrains/php/lang/psi/elements/PhpClass;", "getFunctionDeclarationString", "Lcom/jetbrains/php/lang/psi/elements/Function;", "ej-phpstorm", "document", "Lcom/intellij/openapi/editor/Document;"})
/*     */ @SourceDebugExtension({"SMAP\nPhpElementProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhpElementProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/phpstorm/relevance/extractors/PhpElementProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n774#2:116\n865#2,2:117\n1557#2:119\n1628#2,3:120\n827#2:123\n855#2,2:124\n1611#2,9:126\n1863#2:135\n1864#2:137\n1620#2:138\n1611#2,9:139\n1863#2:148\n1864#2:150\n1620#2:151\n774#2:152\n865#2,2:153\n1557#2:155\n1628#2,3:156\n1#3:136\n1#3:149\n1#3:159\n*S KotlinDebug\n*F\n+ 1 PhpElementProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/phpstorm/relevance/extractors/PhpElementProvider\n*L\n21#1:116\n21#1:117,2\n22#1:119\n22#1:120,3\n27#1:123\n27#1:124,2\n28#1:126,9\n28#1:135\n28#1:137\n28#1:138\n29#1:139,9\n29#1:148\n29#1:150\n29#1:151\n44#1:152\n44#1:153,2\n45#1:155\n45#1:156,3\n28#1:136\n29#1:149\n*E\n"})
/*     */ public final class PhpElementProvider implements ElementProvider {
/*     */   @NotNull
/*  20 */   public List<PsiElement> extractElements(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file"); Class[] arrayOfClass = new Class[2]; arrayOfClass[0] = PhpClass.class; arrayOfClass[1] = Function.class; Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass), "findChildrenOfAnyType(...)"); Collection collection1 = PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass);
/*  21 */     int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     Collection collection2 = collection1; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 117 */     for (Object element$iv$iv : collection2) { PhpPsiElement it = (PhpPsiElement)element$iv$iv; int $i$a$-filter-PhpElementProvider$extractElements$1 = 0; if (((it instanceof PhpClass && !((PhpClass)it).isAnonymous()) || (it instanceof Function && !((Function)it).isClosure()))) collection.add(element$iv$iv);  }
/* 118 */      Iterable $this$filter$iv = collection; int $i$f$map = 0;
/* 119 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection<PsiElement> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10)); int $i$f$mapTo = 0;
/* 120 */     for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 121 */       PhpPsiElement phpPsiElement = (PhpPsiElement)item$iv$iv; Collection<PsiElement> collection3 = destination$iv$iv; int $i$a$-map-PhpElementProvider$extractElements$2 = 0; Intrinsics.checkNotNull(phpPsiElement, "null cannot be cast to non-null type com.intellij.psi.PsiElement"); collection3.add((PsiElement)phpPsiElement);
/* 122 */     }  return (List<PsiElement>)destination$iv$iv; } @NotNull public List<PsiFile> getImports(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file"); Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfType((PsiElement)file, PhpUse.class), "findChildrenOfType(...)"); Collection collection1 = PsiTreeUtil.findChildrenOfType((PsiElement)file, PhpUse.class); int $i$f$filterNot = 0;
/* 123 */     Collection collection2 = collection1; Collection<Object> collection = new ArrayList(); int $i$f$filterNotTo = 0;
/* 124 */     for (Object element$iv$iv : collection2) { PhpUse it = (PhpUse)element$iv$iv; int $i$a$-filterNot-PhpElementProvider$getImports$1 = 0; if (!it.isTraitImport()) collection.add(element$iv$iv);  }
/* 125 */      Iterable $this$filterNot$iv = collection; int $i$f$mapNotNull = 0;
/* 126 */     Iterable $this$filterNotTo$iv$iv = $this$filterNot$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     Iterable $this$forEach$iv$iv$iv = $this$filterNotTo$iv$iv; int $i$f$forEach = 0;
/* 135 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; PhpUse it = (PhpUse)element$iv$iv;
/*     */       int $i$a$-mapNotNull-PhpElementProvider$getImports$2 = 0; }
/*     */     
/* 138 */     Iterable $this$mapNotNull$iv = destination$iv$iv; $i$f$mapNotNull = 0;
/* 139 */     Iterable $this$mapNotNullTo$iv$iv = $this$mapNotNull$iv; destination$iv$iv = new ArrayList(); $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 147 */     $this$forEach$iv$iv$iv = $this$mapNotNullTo$iv$iv; $i$f$forEach = 0;
/* 148 */     iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; PhpReference reference = (PhpReference)element$iv$iv;
/*     */       int $i$a$-mapNotNull-PhpElementProvider$getImports$3 = 0; }
/*     */     
/* 151 */     return CollectionsKt.toList(destination$iv$iv); } @Nullable public ElementProvider.ImportStatementInfo getImportStatements(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file"); Lazy<? extends Document> document$delegate = LazyKt.lazy(file::getImportStatements$lambda$5); Class[] arrayOfClass = new Class[2]; arrayOfClass[0] = PhpUse.class; arrayOfClass[1] = PhpNamespace.class; Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass), "findChildrenOfAnyType(...)"); Collection collection1 = PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass); int $i$f$filter = 0;
/* 152 */     Collection collection2 = collection1; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 153 */     for (Object element$iv$iv : collection2) { PsiElement it = (PsiElement)element$iv$iv; int $i$a$-filter-PhpElementProvider$getImportStatements$importRanges$1 = 0; if (PhpElementProviderKt.access$shouldIncludeElement(it)) collection.add(element$iv$iv);  }
/* 154 */      Iterable $this$filter$iv = collection; int $i$f$map = 0;
/* 155 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection<Pair> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10)); int $i$f$mapTo = 0;
/* 156 */     for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 157 */       PsiElement psiElement = (PsiElement)item$iv$iv; Collection<Pair> collection3 = destination$iv$iv; int $i$a$-map-PhpElementProvider$getImportStatements$importRanges$2 = 0; collection3.add(PhpElementProviderKt.access$extractElementRange(psiElement, getImportStatements$lambda$6(document$delegate)));
/* 158 */     }  List importRanges = (List)destination$iv$iv;
/*     */     return ExtractorUtilsKt.printImportStatements$default(importRanges, getImportStatements$lambda$6(document$delegate), null, 4, null); }
/*     */ 
/*     */   
/*     */   private static final Document getImportStatements$lambda$5(PsiFile $file) {
/*     */     Intrinsics.checkNotNullExpressionValue($file.getFileDocument(), "getFileDocument(...)");
/*     */     return $file.getFileDocument();
/*     */   }
/*     */   
/*     */   private static final Document getImportStatements$lambda$6(Lazy $document$delegate) {
/*     */     Lazy lazy = $document$delegate;
/*     */     return (Document)lazy.getValue();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getDeclarationString(@NotNull PsiElement element, @NotNull ElementProvider.ShowMethodsParametersType params) {
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     Intrinsics.checkNotNullParameter(params, "params");
/*     */     PsiElement psiElement = element;
/*     */     return StringUtilKt.reformatToSingleLine((psiElement instanceof PhpClass) ? getClassDeclarationString((PhpClass)element, params) : ((psiElement instanceof Function) ? getFunctionDeclarationString((Function)element, params) : ""));
/*     */   }
/*     */   
/*     */   private final String getClassDeclarationString(PhpClass element, ElementProvider.ShowMethodsParametersType params) {
/*     */     if (element.getSuperClass() == null || element.getSuperClass().getName() == null)
/*     */       element.getSuperClass().getName(); 
/*     */     String extendsClass = "";
/*     */     Intrinsics.checkNotNullExpressionValue(element.getImplementedInterfaces(), "getImplementedInterfaces(...)");
/*     */     String implementsInterfaces = ArraysKt.joinToString$default((Object[])element.getImplementedInterfaces(), ", ", null, null, 0, null, PhpElementProvider::getClassDeclarationString$lambda$9, 30, null);
/*     */     StringBuilder stringBuilder1 = new StringBuilder(), $this$getClassDeclarationString_u24lambda_u2410 = stringBuilder1;
/*     */     int $i$a$-buildString-PhpElementProvider$getClassDeclarationString$1 = 0;
/*     */     String classType = element.isInterface() ? "interface" : (element.isTrait() ? "trait" : (element.isEnum() ? "enum" : "class"));
/*     */     $this$getClassDeclarationString_u24lambda_u2410.append(classType + " " + classType);
/*     */     if (params == ElementProvider.ShowMethodsParametersType.FULL) {
/*     */       if ((((CharSequence)extendsClass).length() > 0))
/*     */         $this$getClassDeclarationString_u24lambda_u2410.append(" extends " + extendsClass); 
/*     */       if ((((CharSequence)implementsInterfaces).length() > 0))
/*     */         $this$getClassDeclarationString_u24lambda_u2410.append(" implements " + implementsInterfaces); 
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */   
/*     */   private static final CharSequence getClassDeclarationString$lambda$9(PhpClass it) {
/*     */     Intrinsics.checkNotNullExpressionValue(it.getName(), "getName(...)");
/*     */     return it.getName();
/*     */   }
/*     */   
/*     */   private final String getFunctionDeclarationString(Function element, ElementProvider.ShowMethodsParametersType params) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: getstatic com/intellij/ml/llm/matterhorn/ej/phpstorm/relevance/extractors/PhpElementProvider$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   4: swap
/*     */     //   5: invokevirtual ordinal : ()I
/*     */     //   8: iaload
/*     */     //   9: tableswitch default -> 121, 1 -> 36, 2 -> 76, 3 -> 116
/*     */     //   36: aload_1
/*     */     //   37: invokeinterface getParameters : ()[Lcom/jetbrains/php/lang/psi/elements/Parameter;
/*     */     //   42: dup
/*     */     //   43: ldc_w 'getParameters(...)'
/*     */     //   46: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   49: checkcast [Ljava/lang/Object;
/*     */     //   52: ldc_w ', '
/*     */     //   55: checkcast java/lang/CharSequence
/*     */     //   58: aconst_null
/*     */     //   59: aconst_null
/*     */     //   60: iconst_0
/*     */     //   61: aconst_null
/*     */     //   62: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   67: bipush #30
/*     */     //   69: aconst_null
/*     */     //   70: invokestatic joinToString$default : ([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   73: goto -> 129
/*     */     //   76: aload_1
/*     */     //   77: invokeinterface getParameters : ()[Lcom/jetbrains/php/lang/psi/elements/Parameter;
/*     */     //   82: dup
/*     */     //   83: ldc_w 'getParameters(...)'
/*     */     //   86: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   89: checkcast [Ljava/lang/Object;
/*     */     //   92: ldc_w ', '
/*     */     //   95: checkcast java/lang/CharSequence
/*     */     //   98: aconst_null
/*     */     //   99: aconst_null
/*     */     //   100: iconst_0
/*     */     //   101: aconst_null
/*     */     //   102: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   107: bipush #30
/*     */     //   109: aconst_null
/*     */     //   110: invokestatic joinToString$default : ([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   113: goto -> 129
/*     */     //   116: ldc ''
/*     */     //   118: goto -> 129
/*     */     //   121: new kotlin/NoWhenBranchMatchedException
/*     */     //   124: dup
/*     */     //   125: invokespecial <init> : ()V
/*     */     //   128: athrow
/*     */     //   129: astore_3
/*     */     //   130: aload_2
/*     */     //   131: getstatic com/intellij/ml/llm/matterhorn/ej/phpstorm/relevance/extractors/PhpElementProvider$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   134: swap
/*     */     //   135: invokevirtual ordinal : ()I
/*     */     //   138: iaload
/*     */     //   139: iconst_1
/*     */     //   140: if_icmpne -> 184
/*     */     //   143: aload_1
/*     */     //   144: invokeinterface getTypeDeclaration : ()Lcom/jetbrains/php/lang/psi/elements/PhpTypeDeclaration;
/*     */     //   149: checkcast com/jetbrains/php/lang/psi/elements/PhpReturnType
/*     */     //   152: dup
/*     */     //   153: ifnull -> 178
/*     */     //   156: astore #5
/*     */     //   158: iconst_0
/*     */     //   159: istore #6
/*     */     //   161: aload #5
/*     */     //   163: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   168: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   173: nop
/*     */     //   174: dup
/*     */     //   175: ifnonnull -> 186
/*     */     //   178: pop
/*     */     //   179: ldc ''
/*     */     //   181: goto -> 186
/*     */     //   184: ldc ''
/*     */     //   186: astore #4
/*     */     //   188: aload_1
/*     */     //   189: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   194: aload_3
/*     */     //   195: aload #4
/*     */     //   197: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   202: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #80	-> 0
/*     */     //   #82	-> 36
/*     */     //   #86	-> 76
/*     */     //   #87	-> 116
/*     */     //   #80	-> 121
/*     */     //   #89	-> 130
/*     */     //   #90	-> 139
/*     */     //   #159	-> 158
/*     */     //   #90	-> 161
/*     */     //   #90	-> 173
/*     */     //   #90	-> 174
/*     */     //   #91	-> 184
/*     */     //   #89	-> 186
/*     */     //   #94	-> 188
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   161	12	6	$i$a$-let-PhpElementProvider$getFunctionDeclarationString$returnTypeText$1	I
/*     */     //   158	15	5	it	Lcom/jetbrains/php/lang/psi/elements/PhpReturnType;
/*     */     //   130	73	3	functionParameters	Ljava/lang/String;
/*     */     //   188	15	4	returnTypeText	Ljava/lang/String;
/*     */     //   0	203	0	this	Lcom/intellij/ml/llm/matterhorn/ej/phpstorm/relevance/extractors/PhpElementProvider;
/*     */     //   0	203	1	element	Lcom/jetbrains/php/lang/psi/elements/Function;
/*     */     //   0	203	2	params	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;
/*     */   }
/*     */   
/*     */   private static final CharSequence getFunctionDeclarationString$lambda$11(Parameter param) {
/*     */     param.getTypeDeclaration();
/*     */     String typeText = (param.getTypeDeclaration() != null) ? param.getTypeDeclaration().getText() : null;
/*     */     return (typeText != null && ((((CharSequence)typeText).length() > 0))) ? (typeText + " $" + typeText) : ("$" + param.getName());
/*     */   }
/*     */   
/*     */   private static final CharSequence getFunctionDeclarationString$lambda$12(Parameter it) {
/*     */     Intrinsics.checkNotNullExpressionValue(it.getName(), "getName(...)");
/*     */     return it.getName();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\phpstorm\relevance\extractors\PhpElementProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */