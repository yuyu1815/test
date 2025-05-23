/*     */ package com.intellij.ml.llm.matterhorn.ej.pycharm.relevance.extractors;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.ElementProvider;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.intellij.psi.util.PsiTreeUtil;
/*     */ import com.jetbrains.python.psi.PyClass;
/*     */ import com.jetbrains.python.psi.PyFromImportStatement;
/*     */ import com.jetbrains.python.psi.PyImportStatement;
/*     */ import java.util.Collection;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\026J\026\020\t\032\b\022\004\022\0020\b0\0052\006\020\007\032\0020\bH\026J\022\020\n\032\004\030\0010\0132\006\020\007\032\0020\bH\026J\030\020\f\032\0020\r2\006\020\016\032\0020\0062\006\020\017\032\0020\020H\026J\030\020\021\032\0020\r2\006\020\016\032\0020\0222\006\020\017\032\0020\020H\002J\030\020\023\032\0020\r2\006\020\016\032\0020\0242\006\020\017\032\0020\020H\002¨\006\025²\006\n\020\026\032\0020\027X\002"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/pycharm/relevance/extractors/PythonElementProvider;", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider;", "<init>", "()V", "extractElements", "", "Lcom/intellij/psi/PsiElement;", "file", "Lcom/intellij/psi/PsiFile;", "getImports", "getImportStatements", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ImportStatementInfo;", "getDeclarationString", "", "element", "params", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;", "getClassDeclarationString", "Lcom/jetbrains/python/psi/PyClass;", "getFunctionDeclarationString", "Lcom/jetbrains/python/psi/PyFunction;", "ej-pycharm", "document", "Lcom/intellij/openapi/editor/Document;"})
/*     */ @SourceDebugExtension({"SMAP\nPythonElementProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PythonElementProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/relevance/extractors/PythonElementProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1557#2:65\n1628#2,3:66\n1863#2:69\n1611#2,9:73\n1863#2:82\n1864#2:84\n1620#2:85\n1864#2:89\n1863#2:90\n1611#2,9:94\n1863#2:103\n1864#2:105\n1620#2:106\n1864#2:110\n1557#2:111\n1628#2,3:112\n10072#3:70\n10494#3,2:71\n10496#3,3:86\n10072#3:91\n10494#3,2:92\n10496#3,3:107\n11483#3,9:115\n13409#3:124\n13410#3:126\n11492#3:127\n11483#3,9:128\n13409#3:137\n13410#3:139\n11492#3:140\n1#4:83\n1#4:104\n1#4:125\n1#4:138\n*S KotlinDebug\n*F\n+ 1 PythonElementProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/relevance/extractors/PythonElementProvider\n*L\n19#1:65\n19#1:66,3\n24#1:69\n25#1:73,9\n25#1:82\n25#1:84\n25#1:85\n24#1:89\n28#1:90\n29#1:94,9\n29#1:103\n29#1:105\n29#1:106\n28#1:110\n40#1:111\n40#1:112,3\n25#1:70\n25#1:71,2\n25#1:86,3\n29#1:91\n29#1:92,2\n29#1:107,3\n57#1:115,9\n57#1:124\n57#1:126\n57#1:127\n58#1:128,9\n58#1:137\n58#1:139\n58#1:140\n25#1:83\n29#1:104\n57#1:125\n58#1:138\n*E\n"})
/*     */ public final class PythonElementProvider implements ElementProvider {
/*     */   @NotNull
/*  19 */   public List<PsiElement> extractElements(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file"); Class[] arrayOfClass = new Class[2]; arrayOfClass[0] = PyClass.class; arrayOfClass[1] = PyFunction.class; Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass), "findChildrenOfAnyType(...)"); Iterable $this$map$iv = PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass); int $i$f$map = 0;
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
/*  65 */     Iterable iterable1 = $this$map$iv; Collection<PsiElement> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/*  66 */     for (Object item$iv$iv : iterable1) {
/*  67 */       PsiElement psiElement = (PsiElement)item$iv$iv; Collection<PsiElement> collection = destination$iv$iv; int $i$a$-map-PythonElementProvider$extractElements$1 = 0; Intrinsics.checkNotNull(psiElement, "null cannot be cast to non-null type com.intellij.psi.PsiElement"); collection.add(psiElement);
/*  68 */     }  return (List<PsiElement>)destination$iv$iv; } @NotNull public List<PsiFile> getImports(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file"); Set resultFiles = new LinkedHashSet(); Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfType((PsiElement)file, PyFromImportStatement.class), "findChildrenOfType(...)"); Iterable $this$forEach$iv = PsiTreeUtil.findChildrenOfType((PsiElement)file, PyFromImportStatement.class); int $i$f$forEach = 0;
/*  69 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); PyFromImportStatement fromImportStatement = (PyFromImportStatement)element$iv; int $i$a$-forEach-PythonElementProvider$getImports$1 = 0; Intrinsics.checkNotNullExpressionValue(fromImportStatement.getImportElements(), "getImportElements(...)"); Object[] arrayOfObject1 = (Object[])fromImportStatement.getImportElements(); Set set = resultFiles; int $i$f$flatMap = 0;
/*  70 */       Object[] arrayOfObject2 = arrayOfObject1; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/*  71 */       boolean bool = false; int i = arrayOfObject2.length; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfType((PsiElement)file, PyImportStatement.class), "findChildrenOfType(...)");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     $this$forEach$iv = PsiTreeUtil.findChildrenOfType((PsiElement)file, PyImportStatement.class);
/*     */ 
/*     */ 
/*     */     
/*     */     $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */     
/*  90 */     iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); PyImportStatement importStatement = (PyImportStatement)element$iv; int $i$a$-forEach-PythonElementProvider$getImports$2 = 0; Intrinsics.checkNotNullExpressionValue(importStatement.getImportElements(), "getImportElements(...)"); Object[] $this$flatMap$iv = (Object[])importStatement.getImportElements(); Set set = resultFiles; int $i$f$flatMap = 0;
/*  91 */       Object[] $this$flatMapTo$iv$iv = $this$flatMap$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/*  92 */       boolean bool = false; int i = $this$flatMapTo$iv$iv.length; }
/*     */     
/*     */     return CollectionsKt.toList(resultFiles); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ElementProvider.ImportStatementInfo getImportStatements(@NotNull PsiFile file) {
/*     */     Intrinsics.checkNotNullParameter(file, "file");
/*     */     Lazy<? extends Document> document$delegate = LazyKt.lazy(file::getImportStatements$lambda$7);
/*     */     Class[] arrayOfClass = new Class[2];
/*     */     arrayOfClass[0] = PyFromImportStatement.class;
/*     */     arrayOfClass[1] = PyImportStatement.class;
/*     */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass), "findChildrenOfAnyType(...)");
/*     */     Collection collection1 = PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass);
/*     */     int $i$f$map = 0;
/* 111 */     Collection collection2 = collection1; Collection<Pair> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection1, 10)); int $i$f$mapTo = 0;
/* 112 */     for (Object item$iv$iv : collection2) {
/* 113 */       PsiElement psiElement = (PsiElement)item$iv$iv; Collection<Pair> collection = destination$iv$iv; int $i$a$-map-PythonElementProvider$getImportStatements$importRanges$1 = 0; collection.add(ExtractorUtilsKt.getImportRange(getImportStatements$lambda$8(document$delegate), psiElement));
/* 114 */     }  List importRanges = (List)destination$iv$iv;
/*     */     return ExtractorUtilsKt.printImportStatements$default(importRanges, getImportStatements$lambda$8(document$delegate), null, 4, null);
/*     */   }
/*     */   
/*     */   private static final Document getImportStatements$lambda$7(PsiFile $file) {
/*     */     Intrinsics.checkNotNullExpressionValue($file.getFileDocument(), "getFileDocument(...)");
/*     */     return $file.getFileDocument();
/*     */   }
/*     */   
/*     */   private static final Document getImportStatements$lambda$8(Lazy $document$delegate) {
/*     */     Lazy lazy = $document$delegate;
/*     */     return (Document)lazy.getValue();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getDeclarationString(@NotNull PsiElement element, @NotNull ElementProvider.ShowMethodsParametersType params) {
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     Intrinsics.checkNotNullParameter(params, "params");
/*     */     PsiElement psiElement = element;
/*     */     return StringUtilKt.reformatToSingleLine((psiElement instanceof PyClass) ? getClassDeclarationString((PyClass)element, params) : ((psiElement instanceof PyFunction) ? getFunctionDeclarationString((PyFunction)element, params) : ""));
/*     */   }
/*     */   
/*     */   private final String getClassDeclarationString(PyClass element, ElementProvider.ShowMethodsParametersType params) {
/*     */     if (element.getSuperClassExpressionList() == null || element.getSuperClassExpressionList().getArguments() == null || ArraysKt.joinToString$default((Object[])element.getSuperClassExpressionList().getArguments(), ", ", null, null, 0, null, PythonElementProvider::getClassDeclarationString$lambda$10, 30, null) == null)
/*     */       ArraysKt.joinToString$default((Object[])element.getSuperClassExpressionList().getArguments(), ", ", null, null, 0, null, PythonElementProvider::getClassDeclarationString$lambda$10, 30, null); 
/*     */     String classParameters = "";
/*     */     return "class " + element.getName() + "(" + classParameters + ")";
/*     */   }
/*     */   
/*     */   private static final CharSequence getClassDeclarationString$lambda$10(PyExpression arg) {
/*     */     Intrinsics.checkNotNullExpressionValue(arg.getText(), "getText(...)");
/*     */     return StringsKt.trim(arg.getText()).toString();
/*     */   }
/*     */   
/*     */   private final String getFunctionDeclarationString(PyFunction element, ElementProvider.ShowMethodsParametersType params) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: getstatic com/intellij/ml/llm/matterhorn/ej/pycharm/relevance/extractors/PythonElementProvider$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   4: swap
/*     */     //   5: invokevirtual ordinal : ()I
/*     */     //   8: iaload
/*     */     //   9: tableswitch default -> 324, 1 -> 36, 2 -> 177, 3 -> 318
/*     */     //   36: aload_1
/*     */     //   37: invokeinterface getParameterList : ()Lcom/jetbrains/python/ast/PyAstParameterList;
/*     */     //   42: checkcast com/jetbrains/python/psi/PyParameterList
/*     */     //   45: invokeinterface getParameters : ()[Lcom/jetbrains/python/psi/PyParameter;
/*     */     //   50: dup
/*     */     //   51: ldc_w 'getParameters(...)'
/*     */     //   54: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   57: checkcast [Ljava/lang/Object;
/*     */     //   60: astore #4
/*     */     //   62: iconst_0
/*     */     //   63: istore #5
/*     */     //   65: aload #4
/*     */     //   67: astore #6
/*     */     //   69: new java/util/ArrayList
/*     */     //   72: dup
/*     */     //   73: invokespecial <init> : ()V
/*     */     //   76: checkcast java/util/Collection
/*     */     //   79: astore #7
/*     */     //   81: iconst_0
/*     */     //   82: istore #8
/*     */     //   84: aload #6
/*     */     //   86: astore #9
/*     */     //   88: iconst_0
/*     */     //   89: istore #10
/*     */     //   91: iconst_0
/*     */     //   92: istore #11
/*     */     //   94: aload #9
/*     */     //   96: arraylength
/*     */     //   97: istore #12
/*     */     //   99: iload #11
/*     */     //   101: iload #12
/*     */     //   103: if_icmpge -> 167
/*     */     //   106: aload #9
/*     */     //   108: iload #11
/*     */     //   110: aaload
/*     */     //   111: astore #13
/*     */     //   113: aload #13
/*     */     //   115: astore #14
/*     */     //   117: iconst_0
/*     */     //   118: istore #15
/*     */     //   120: aload #14
/*     */     //   122: checkcast com/jetbrains/python/psi/PyParameter
/*     */     //   125: astore #16
/*     */     //   127: iconst_0
/*     */     //   128: istore #17
/*     */     //   130: aload #16
/*     */     //   132: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   137: dup
/*     */     //   138: ifnull -> 159
/*     */     //   141: astore #18
/*     */     //   143: iconst_0
/*     */     //   144: istore #19
/*     */     //   146: aload #7
/*     */     //   148: aload #18
/*     */     //   150: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   155: pop
/*     */     //   156: goto -> 160
/*     */     //   159: pop
/*     */     //   160: nop
/*     */     //   161: iinc #11, 1
/*     */     //   164: goto -> 99
/*     */     //   167: nop
/*     */     //   168: aload #7
/*     */     //   170: checkcast java/util/List
/*     */     //   173: nop
/*     */     //   174: goto -> 332
/*     */     //   177: aload_1
/*     */     //   178: invokeinterface getParameterList : ()Lcom/jetbrains/python/ast/PyAstParameterList;
/*     */     //   183: checkcast com/jetbrains/python/psi/PyParameterList
/*     */     //   186: invokeinterface getParameters : ()[Lcom/jetbrains/python/psi/PyParameter;
/*     */     //   191: dup
/*     */     //   192: ldc_w 'getParameters(...)'
/*     */     //   195: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   198: checkcast [Ljava/lang/Object;
/*     */     //   201: astore #4
/*     */     //   203: iconst_0
/*     */     //   204: istore #5
/*     */     //   206: aload #4
/*     */     //   208: astore #6
/*     */     //   210: new java/util/ArrayList
/*     */     //   213: dup
/*     */     //   214: invokespecial <init> : ()V
/*     */     //   217: checkcast java/util/Collection
/*     */     //   220: astore #7
/*     */     //   222: iconst_0
/*     */     //   223: istore #8
/*     */     //   225: aload #6
/*     */     //   227: astore #9
/*     */     //   229: iconst_0
/*     */     //   230: istore #10
/*     */     //   232: iconst_0
/*     */     //   233: istore #11
/*     */     //   235: aload #9
/*     */     //   237: arraylength
/*     */     //   238: istore #12
/*     */     //   240: iload #11
/*     */     //   242: iload #12
/*     */     //   244: if_icmpge -> 308
/*     */     //   247: aload #9
/*     */     //   249: iload #11
/*     */     //   251: aaload
/*     */     //   252: astore #13
/*     */     //   254: aload #13
/*     */     //   256: astore #14
/*     */     //   258: iconst_0
/*     */     //   259: istore #15
/*     */     //   261: aload #14
/*     */     //   263: checkcast com/jetbrains/python/psi/PyParameter
/*     */     //   266: astore #16
/*     */     //   268: iconst_0
/*     */     //   269: istore #17
/*     */     //   271: aload #16
/*     */     //   273: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   278: dup
/*     */     //   279: ifnull -> 300
/*     */     //   282: astore #18
/*     */     //   284: iconst_0
/*     */     //   285: istore #19
/*     */     //   287: aload #7
/*     */     //   289: aload #18
/*     */     //   291: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   296: pop
/*     */     //   297: goto -> 301
/*     */     //   300: pop
/*     */     //   301: nop
/*     */     //   302: iinc #11, 1
/*     */     //   305: goto -> 240
/*     */     //   308: nop
/*     */     //   309: aload #7
/*     */     //   311: checkcast java/util/List
/*     */     //   314: nop
/*     */     //   315: goto -> 332
/*     */     //   318: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   321: goto -> 332
/*     */     //   324: new kotlin/NoWhenBranchMatchedException
/*     */     //   327: dup
/*     */     //   328: invokespecial <init> : ()V
/*     */     //   331: athrow
/*     */     //   332: checkcast java/lang/Iterable
/*     */     //   335: ldc_w ', '
/*     */     //   338: checkcast java/lang/CharSequence
/*     */     //   341: aconst_null
/*     */     //   342: aconst_null
/*     */     //   343: iconst_0
/*     */     //   344: aconst_null
/*     */     //   345: aconst_null
/*     */     //   346: bipush #62
/*     */     //   348: aconst_null
/*     */     //   349: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   352: astore_3
/*     */     //   353: aload_1
/*     */     //   354: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   359: aload_3
/*     */     //   360: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   365: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #56	-> 0
/*     */     //   #57	-> 36
/*     */     //   #115	-> 65
/*     */     //   #123	-> 84
/*     */     //   #124	-> 91
/*     */     //   #123	-> 120
/*     */     //   #57	-> 130
/*     */     //   #123	-> 137
/*     */     //   #125	-> 143
/*     */     //   #123	-> 146
/*     */     //   #123	-> 156
/*     */     //   #123	-> 159
/*     */     //   #124	-> 160
/*     */     //   #126	-> 167
/*     */     //   #127	-> 168
/*     */     //   #115	-> 173
/*     */     //   #58	-> 177
/*     */     //   #128	-> 206
/*     */     //   #136	-> 225
/*     */     //   #137	-> 232
/*     */     //   #136	-> 261
/*     */     //   #58	-> 271
/*     */     //   #136	-> 278
/*     */     //   #138	-> 284
/*     */     //   #136	-> 287
/*     */     //   #136	-> 297
/*     */     //   #136	-> 300
/*     */     //   #137	-> 301
/*     */     //   #139	-> 308
/*     */     //   #140	-> 309
/*     */     //   #128	-> 314
/*     */     //   #59	-> 318
/*     */     //   #56	-> 324
/*     */     //   #60	-> 335
/*     */     //   #56	-> 352
/*     */     //   #62	-> 353
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   130	7	17	$i$a$-mapNotNull-PythonElementProvider$getFunctionDeclarationString$functionParameters$1	I
/*     */     //   127	10	16	it	Lcom/jetbrains/python/psi/PyParameter;
/*     */     //   146	10	19	$i$a$-let-ArraysKt___ArraysKt$mapNotNullTo$1$1$iv$iv	I
/*     */     //   143	13	18	it$iv$iv	Ljava/lang/Object;
/*     */     //   120	40	15	$i$a$-forEach-ArraysKt___ArraysKt$mapNotNullTo$1$iv$iv	I
/*     */     //   117	43	14	element$iv$iv	Ljava/lang/Object;
/*     */     //   113	48	13	element$iv$iv$iv	Ljava/lang/Object;
/*     */     //   91	77	10	$i$f$forEach	I
/*     */     //   88	80	9	$this$forEach$iv$iv$iv	[Ljava/lang/Object;
/*     */     //   84	86	8	$i$f$mapNotNullTo	I
/*     */     //   81	89	6	$this$mapNotNullTo$iv$iv	[Ljava/lang/Object;
/*     */     //   81	89	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   65	109	5	$i$f$mapNotNull	I
/*     */     //   62	112	4	$this$mapNotNull$iv	[Ljava/lang/Object;
/*     */     //   271	7	17	$i$a$-mapNotNull-PythonElementProvider$getFunctionDeclarationString$functionParameters$2	I
/*     */     //   268	10	16	it	Lcom/jetbrains/python/psi/PyParameter;
/*     */     //   287	10	19	$i$a$-let-ArraysKt___ArraysKt$mapNotNullTo$1$1$iv$iv	I
/*     */     //   284	13	18	it$iv$iv	Ljava/lang/Object;
/*     */     //   261	40	15	$i$a$-forEach-ArraysKt___ArraysKt$mapNotNullTo$1$iv$iv	I
/*     */     //   258	43	14	element$iv$iv	Ljava/lang/Object;
/*     */     //   254	48	13	element$iv$iv$iv	Ljava/lang/Object;
/*     */     //   232	77	10	$i$f$forEach	I
/*     */     //   229	80	9	$this$forEach$iv$iv$iv	[Ljava/lang/Object;
/*     */     //   225	86	8	$i$f$mapNotNullTo	I
/*     */     //   222	89	6	$this$mapNotNullTo$iv$iv	[Ljava/lang/Object;
/*     */     //   222	89	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   206	109	5	$i$f$mapNotNull	I
/*     */     //   203	112	4	$this$mapNotNull$iv	[Ljava/lang/Object;
/*     */     //   353	13	3	functionParameters	Ljava/lang/String;
/*     */     //   0	366	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/relevance/extractors/PythonElementProvider;
/*     */     //   0	366	1	element	Lcom/jetbrains/python/psi/PyFunction;
/*     */     //   0	366	2	params	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\pycharm\relevance\extractors\PythonElementProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */