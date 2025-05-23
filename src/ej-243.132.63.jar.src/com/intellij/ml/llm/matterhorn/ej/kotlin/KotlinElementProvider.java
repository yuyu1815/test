/*     */ package com.intellij.ml.llm.matterhorn.ej.kotlin;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.ElementProvider;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.intellij.psi.util.PsiTreeUtil;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.Pair;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.kotlin.idea.core.util.PhysicalFileSystemUtilsKt;
/*     */ import org.jetbrains.kotlin.psi.KtElementImplStub;
/*     */ import org.jetbrains.kotlin.psi.KtImportDirective;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\026J\026\020\t\032\b\022\004\022\0020\b0\0052\006\020\n\032\0020\bH\026J\022\020\013\032\004\030\0010\f2\006\020\n\032\0020\bH\026J\030\020\r\032\0020\0162\006\020\017\032\0020\0062\006\020\020\032\0020\021H\026¨\006\022²\006\n\020\023\032\0020\024X\002"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/kotlin/KotlinElementProvider;", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider;", "<init>", "()V", "extractElements", "", "Lcom/intellij/psi/PsiElement;", "lightFile", "Lcom/intellij/psi/PsiFile;", "getImports", "ligthFile", "getImportStatements", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ImportStatementInfo;", "getDeclarationString", "", "element", "params", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;", "ej-kotlin", "document", "Lcom/intellij/openapi/editor/Document;"})
/*     */ @SourceDebugExtension({"SMAP\nKotlinElementProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinElementProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/kotlin/KotlinElementProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,94:1\n1611#2,9:95\n1863#2:104\n1864#2:106\n1620#2:107\n1863#2:108\n1864#2:122\n1557#2:123\n1628#2,3:124\n1611#2,9:127\n1863#2:136\n1864#2:138\n1620#2:139\n1611#2,9:140\n1863#2:149\n1864#2:151\n1620#2:152\n1#3:105\n1#3:119\n1#3:137\n1#3:150\n11483#4,9:109\n13409#4:118\n13410#4:120\n11492#4:121\n*S KotlinDebug\n*F\n+ 1 KotlinElementProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/kotlin/KotlinElementProvider\n*L\n24#1:95,9\n24#1:104\n24#1:106\n24#1:107\n37#1:108\n37#1:122\n54#1:123\n54#1:124,3\n67#1:127,9\n67#1:136\n67#1:138\n67#1:139\n68#1:140,9\n68#1:149\n68#1:151\n68#1:152\n24#1:105\n39#1:119\n67#1:137\n68#1:150\n39#1:109,9\n39#1:118\n39#1:120\n39#1:121\n*E\n"})
/*     */ public final class KotlinElementProvider implements ElementProvider {
/*     */   @NotNull
/*  23 */   public List<PsiElement> extractElements(@NotNull PsiFile lightFile) { Intrinsics.checkNotNullParameter(lightFile, "lightFile"); Intrinsics.checkNotNullExpressionValue(lightFile.getVirtualFile(), "getVirtualFile(...)"); Intrinsics.checkNotNullExpressionValue(lightFile.getProject(), "getProject(...)"); PsiFile file = PhysicalFileSystemUtilsKt.toPsiFile(lightFile.getVirtualFile(), lightFile.getProject());
/*  24 */     Class[] arrayOfClass = new Class[2]; arrayOfClass[0] = KtClass.class; arrayOfClass[1] = KtFunction.class; Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass), "findChildrenOfAnyType(...)"); Iterable $this$mapNotNull$iv = PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass); int $i$f$mapNotNull = 0;
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
/*  95 */     Iterable iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 103 */     Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 104 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; KtTypeParameterListOwner it = (KtTypeParameterListOwner)element$iv$iv;
/*     */       int $i$a$-mapNotNull-KotlinElementProvider$extractElements$1 = 0; }
/*     */     
/* 107 */     return (List<PsiElement>)destination$iv$iv; } @NotNull public List<PsiFile> getImports(@NotNull PsiFile ligthFile) { Intrinsics.checkNotNullParameter(ligthFile, "ligthFile"); Intrinsics.checkNotNullExpressionValue(ligthFile.getVirtualFile(), "getVirtualFile(...)"); Intrinsics.checkNotNullExpressionValue(ligthFile.getProject(), "getProject(...)"); PsiFile file = PhysicalFileSystemUtilsKt.toPsiFile(ligthFile.getVirtualFile(), ligthFile.getProject()); Set resultFiles = new LinkedHashSet(); Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfType((PsiElement)file, KtImportDirective.class), "findChildrenOfType(...)"); Iterable $this$forEach$iv = PsiTreeUtil.findChildrenOfType((PsiElement)file, KtImportDirective.class); int $i$f$forEach = 0;
/* 108 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); KtImportDirective importStatement = (KtImportDirective)element$iv; int $i$a$-forEach-KotlinElementProvider$getImports$1 = 0; KtExpression ktExpression = importStatement.getImportedReference(); }
/*     */     
/*     */     return CollectionsKt.toList(resultFiles); } @Nullable public ElementProvider.ImportStatementInfo getImportStatements(@NotNull PsiFile ligthFile) { Intrinsics.checkNotNullParameter(ligthFile, "ligthFile");
/*     */     Intrinsics.checkNotNullExpressionValue(ligthFile.getVirtualFile(), "getVirtualFile(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(ligthFile.getProject(), "getProject(...)");
/*     */     if (PhysicalFileSystemUtilsKt.toPsiFile(ligthFile.getVirtualFile(), ligthFile.getProject()) == null)
/*     */       PhysicalFileSystemUtilsKt.toPsiFile(ligthFile.getVirtualFile(), ligthFile.getProject()); 
/*     */     PsiFile file = ligthFile;
/*     */     Lazy<? extends Document> document$delegate = LazyKt.lazy(file::getImportStatements$lambda$3);
/*     */     Class[] arrayOfClass = new Class[2];
/*     */     arrayOfClass[0] = KtImportDirective.class;
/*     */     arrayOfClass[1] = KtPackageDirective.class;
/*     */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass), "findChildrenOfAnyType(...)");
/*     */     Collection collection1 = PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass);
/*     */     int $i$f$map = 0;
/* 123 */     Collection collection2 = collection1; Collection<Pair> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection1, 10)); int $i$f$mapTo = 0;
/* 124 */     for (Object item$iv$iv : collection2) {
/* 125 */       KtElementImplStub ktElementImplStub = (KtElementImplStub)item$iv$iv; Collection<Pair> collection = destination$iv$iv; int $i$a$-map-KotlinElementProvider$getImportStatements$importRanges$1 = 0; Intrinsics.checkNotNull(ktElementImplStub); collection.add(ExtractorUtilsKt.getImportRange(getImportStatements$lambda$4(document$delegate), (PsiElement)ktElementImplStub));
/* 126 */     }  List importRanges = (List)destination$iv$iv;
/*     */     return ExtractorUtilsKt.printImportStatements$default(importRanges, getImportStatements$lambda$4(document$delegate), null, 4, null); }
/*     */ 
/*     */   
/*     */   private static final Document getImportStatements$lambda$3(PsiFile $file) {
/*     */     Intrinsics.checkNotNullExpressionValue($file.getFileDocument(), "getFileDocument(...)");
/*     */     return $file.getFileDocument();
/*     */   }
/*     */   
/*     */   private static final Document getImportStatements$lambda$4(Lazy $document$delegate) {
/*     */     Lazy lazy = $document$delegate;
/*     */     return (Document)lazy.getValue();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getDeclarationString(@NotNull PsiElement element, @NotNull ElementProvider.ShowMethodsParametersType params) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'element'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc_w 'params'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_1
/*     */     //   15: astore_3
/*     */     //   16: aload_3
/*     */     //   17: astore #4
/*     */     //   19: aload #4
/*     */     //   21: instanceof org/jetbrains/kotlin/psi/KtClass
/*     */     //   24: ifeq -> 63
/*     */     //   27: aload_3
/*     */     //   28: checkcast org/jetbrains/kotlin/psi/KtClass
/*     */     //   31: invokevirtual getClassOrInterfaceKeyword : ()Lcom/intellij/psi/PsiElement;
/*     */     //   34: dup
/*     */     //   35: ifnull -> 46
/*     */     //   38: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   43: goto -> 48
/*     */     //   46: pop
/*     */     //   47: aconst_null
/*     */     //   48: aload_3
/*     */     //   49: checkcast org/jetbrains/kotlin/psi/KtClass
/*     */     //   52: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   55: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   60: goto -> 612
/*     */     //   63: aload #4
/*     */     //   65: instanceof org/jetbrains/kotlin/psi/KtFunction
/*     */     //   68: ifeq -> 609
/*     */     //   71: aload_2
/*     */     //   72: getstatic com/intellij/ml/llm/matterhorn/ej/kotlin/KotlinElementProvider$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   75: swap
/*     */     //   76: invokevirtual ordinal : ()I
/*     */     //   79: iaload
/*     */     //   80: tableswitch default -> 388, 1 -> 108, 2 -> 245, 3 -> 382
/*     */     //   108: aload_3
/*     */     //   109: checkcast org/jetbrains/kotlin/psi/KtFunction
/*     */     //   112: invokeinterface getValueParameters : ()Ljava/util/List;
/*     */     //   117: dup
/*     */     //   118: ldc_w 'getValueParameters(...)'
/*     */     //   121: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   124: checkcast java/lang/Iterable
/*     */     //   127: astore #7
/*     */     //   129: iconst_0
/*     */     //   130: istore #8
/*     */     //   132: aload #7
/*     */     //   134: astore #9
/*     */     //   136: new java/util/ArrayList
/*     */     //   139: dup
/*     */     //   140: invokespecial <init> : ()V
/*     */     //   143: checkcast java/util/Collection
/*     */     //   146: astore #10
/*     */     //   148: iconst_0
/*     */     //   149: istore #11
/*     */     //   151: aload #9
/*     */     //   153: astore #12
/*     */     //   155: iconst_0
/*     */     //   156: istore #13
/*     */     //   158: aload #12
/*     */     //   160: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   165: astore #14
/*     */     //   167: aload #14
/*     */     //   169: invokeinterface hasNext : ()Z
/*     */     //   174: ifeq -> 235
/*     */     //   177: aload #14
/*     */     //   179: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   184: astore #15
/*     */     //   186: aload #15
/*     */     //   188: astore #16
/*     */     //   190: iconst_0
/*     */     //   191: istore #17
/*     */     //   193: aload #16
/*     */     //   195: checkcast org/jetbrains/kotlin/psi/KtParameter
/*     */     //   198: astore #18
/*     */     //   200: iconst_0
/*     */     //   201: istore #19
/*     */     //   203: aload #18
/*     */     //   205: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   208: dup
/*     */     //   209: ifnull -> 230
/*     */     //   212: astore #20
/*     */     //   214: iconst_0
/*     */     //   215: istore #21
/*     */     //   217: aload #10
/*     */     //   219: aload #20
/*     */     //   221: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   226: pop
/*     */     //   227: goto -> 231
/*     */     //   230: pop
/*     */     //   231: nop
/*     */     //   232: goto -> 167
/*     */     //   235: nop
/*     */     //   236: aload #10
/*     */     //   238: checkcast java/util/List
/*     */     //   241: nop
/*     */     //   242: goto -> 396
/*     */     //   245: aload_3
/*     */     //   246: checkcast org/jetbrains/kotlin/psi/KtFunction
/*     */     //   249: invokeinterface getValueParameters : ()Ljava/util/List;
/*     */     //   254: dup
/*     */     //   255: ldc_w 'getValueParameters(...)'
/*     */     //   258: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   261: checkcast java/lang/Iterable
/*     */     //   264: astore #7
/*     */     //   266: iconst_0
/*     */     //   267: istore #8
/*     */     //   269: aload #7
/*     */     //   271: astore #9
/*     */     //   273: new java/util/ArrayList
/*     */     //   276: dup
/*     */     //   277: invokespecial <init> : ()V
/*     */     //   280: checkcast java/util/Collection
/*     */     //   283: astore #10
/*     */     //   285: iconst_0
/*     */     //   286: istore #11
/*     */     //   288: aload #9
/*     */     //   290: astore #12
/*     */     //   292: iconst_0
/*     */     //   293: istore #13
/*     */     //   295: aload #12
/*     */     //   297: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   302: astore #14
/*     */     //   304: aload #14
/*     */     //   306: invokeinterface hasNext : ()Z
/*     */     //   311: ifeq -> 372
/*     */     //   314: aload #14
/*     */     //   316: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   321: astore #15
/*     */     //   323: aload #15
/*     */     //   325: astore #16
/*     */     //   327: iconst_0
/*     */     //   328: istore #17
/*     */     //   330: aload #16
/*     */     //   332: checkcast org/jetbrains/kotlin/psi/KtParameter
/*     */     //   335: astore #18
/*     */     //   337: iconst_0
/*     */     //   338: istore #19
/*     */     //   340: aload #18
/*     */     //   342: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   345: dup
/*     */     //   346: ifnull -> 367
/*     */     //   349: astore #20
/*     */     //   351: iconst_0
/*     */     //   352: istore #21
/*     */     //   354: aload #10
/*     */     //   356: aload #20
/*     */     //   358: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   363: pop
/*     */     //   364: goto -> 368
/*     */     //   367: pop
/*     */     //   368: nop
/*     */     //   369: goto -> 304
/*     */     //   372: nop
/*     */     //   373: aload #10
/*     */     //   375: checkcast java/util/List
/*     */     //   378: nop
/*     */     //   379: goto -> 396
/*     */     //   382: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   385: goto -> 396
/*     */     //   388: new kotlin/NoWhenBranchMatchedException
/*     */     //   391: dup
/*     */     //   392: invokespecial <init> : ()V
/*     */     //   395: athrow
/*     */     //   396: checkcast java/lang/Iterable
/*     */     //   399: ldc_w ', '
/*     */     //   402: checkcast java/lang/CharSequence
/*     */     //   405: aconst_null
/*     */     //   406: aconst_null
/*     */     //   407: iconst_0
/*     */     //   408: aconst_null
/*     */     //   409: aconst_null
/*     */     //   410: bipush #62
/*     */     //   412: aconst_null
/*     */     //   413: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   416: astore #5
/*     */     //   418: aload_3
/*     */     //   419: instanceof org/jetbrains/kotlin/psi/KtConstructor
/*     */     //   422: ifeq -> 470
/*     */     //   425: aload_2
/*     */     //   426: getstatic com/intellij/ml/llm/matterhorn/ej/kotlin/KotlinElementProvider$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   429: swap
/*     */     //   430: invokevirtual ordinal : ()I
/*     */     //   433: iaload
/*     */     //   434: iconst_3
/*     */     //   435: if_icmpne -> 453
/*     */     //   438: aload_3
/*     */     //   439: checkcast org/jetbrains/kotlin/psi/KtConstructor
/*     */     //   442: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   445: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   450: goto -> 612
/*     */     //   453: aload_3
/*     */     //   454: checkcast org/jetbrains/kotlin/psi/KtConstructor
/*     */     //   457: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   460: aload #5
/*     */     //   462: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   467: goto -> 612
/*     */     //   470: aload_2
/*     */     //   471: getstatic com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType.FULL : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;
/*     */     //   474: if_acmpne -> 505
/*     */     //   477: aload_3
/*     */     //   478: checkcast org/jetbrains/kotlin/psi/KtFunction
/*     */     //   481: invokeinterface hasDeclaredReturnType : ()Z
/*     */     //   486: ifeq -> 505
/*     */     //   489: aload_3
/*     */     //   490: checkcast org/jetbrains/kotlin/psi/KtFunction
/*     */     //   493: invokeinterface hasDeclaredReturnType : ()Z
/*     */     //   498: ifeq -> 505
/*     */     //   501: iconst_1
/*     */     //   502: goto -> 506
/*     */     //   505: iconst_0
/*     */     //   506: iconst_1
/*     */     //   507: if_icmpne -> 534
/*     */     //   510: aload_3
/*     */     //   511: checkcast org/jetbrains/kotlin/psi/KtFunction
/*     */     //   514: invokeinterface getTypeReference : ()Lorg/jetbrains/kotlin/psi/KtTypeReference;
/*     */     //   519: dup
/*     */     //   520: ifnull -> 529
/*     */     //   523: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   526: goto -> 535
/*     */     //   529: pop
/*     */     //   530: aconst_null
/*     */     //   531: goto -> 535
/*     */     //   534: aconst_null
/*     */     //   535: astore #6
/*     */     //   537: aload_2
/*     */     //   538: getstatic com/intellij/ml/llm/matterhorn/ej/kotlin/KotlinElementProvider$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   541: swap
/*     */     //   542: invokevirtual ordinal : ()I
/*     */     //   545: iaload
/*     */     //   546: iconst_3
/*     */     //   547: if_icmpne -> 567
/*     */     //   550: aload_3
/*     */     //   551: checkcast org/jetbrains/kotlin/psi/KtFunction
/*     */     //   554: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   559: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   564: goto -> 583
/*     */     //   567: aload_3
/*     */     //   568: checkcast org/jetbrains/kotlin/psi/KtFunction
/*     */     //   571: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   576: aload #5
/*     */     //   578: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   583: aload #6
/*     */     //   585: ifnonnull -> 594
/*     */     //   588: ldc_w ''
/*     */     //   591: goto -> 601
/*     */     //   594: aload #6
/*     */     //   596: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   601: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   606: goto -> 612
/*     */     //   609: ldc_w ''
/*     */     //   612: invokestatic reformatToSingleLine : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   615: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #59	-> 14
/*     */     //   #61	-> 16
/*     */     //   #62	-> 19
/*     */     //   #63	-> 27
/*     */     //   #65	-> 63
/*     */     //   #66	-> 71
/*     */     //   #67	-> 108
/*     */     //   #127	-> 132
/*     */     //   #135	-> 151
/*     */     //   #136	-> 158
/*     */     //   #135	-> 193
/*     */     //   #67	-> 203
/*     */     //   #135	-> 208
/*     */     //   #137	-> 214
/*     */     //   #135	-> 217
/*     */     //   #135	-> 227
/*     */     //   #135	-> 230
/*     */     //   #136	-> 231
/*     */     //   #138	-> 235
/*     */     //   #139	-> 236
/*     */     //   #127	-> 241
/*     */     //   #68	-> 245
/*     */     //   #140	-> 269
/*     */     //   #148	-> 288
/*     */     //   #149	-> 295
/*     */     //   #148	-> 330
/*     */     //   #68	-> 340
/*     */     //   #148	-> 345
/*     */     //   #150	-> 351
/*     */     //   #148	-> 354
/*     */     //   #148	-> 364
/*     */     //   #148	-> 367
/*     */     //   #149	-> 368
/*     */     //   #151	-> 372
/*     */     //   #152	-> 373
/*     */     //   #140	-> 378
/*     */     //   #69	-> 382
/*     */     //   #66	-> 388
/*     */     //   #70	-> 399
/*     */     //   #66	-> 416
/*     */     //   #72	-> 418
/*     */     //   #73	-> 425
/*     */     //   #74	-> 434
/*     */     //   #75	-> 453
/*     */     //   #78	-> 470
/*     */     //   #79	-> 506
/*     */     //   #80	-> 534
/*     */     //   #78	-> 535
/*     */     //   #82	-> 537
/*     */     //   #83	-> 546
/*     */     //   #84	-> 567
/*     */     //   #85	-> 583
/*     */     //   #86	-> 585
/*     */     //   #87	-> 594
/*     */     //   #91	-> 609
/*     */     //   #92	-> 612
/*     */     //   #61	-> 615
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   203	5	19	$i$a$-mapNotNull-KotlinElementProvider$getDeclarationString$functionParameters$1	I
/*     */     //   200	8	18	it	Lorg/jetbrains/kotlin/psi/KtParameter;
/*     */     //   217	10	21	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
/*     */     //   214	13	20	it$iv$iv	Ljava/lang/Object;
/*     */     //   193	38	17	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*     */     //   190	41	16	element$iv$iv	Ljava/lang/Object;
/*     */     //   186	46	15	element$iv$iv$iv	Ljava/lang/Object;
/*     */     //   158	78	13	$i$f$forEach	I
/*     */     //   155	81	12	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
/*     */     //   151	87	11	$i$f$mapNotNullTo	I
/*     */     //   148	90	9	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   148	90	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   132	110	8	$i$f$mapNotNull	I
/*     */     //   129	113	7	$this$mapNotNull$iv	Ljava/lang/Iterable;
/*     */     //   340	5	19	$i$a$-mapNotNull-KotlinElementProvider$getDeclarationString$functionParameters$2	I
/*     */     //   337	8	18	it	Lorg/jetbrains/kotlin/psi/KtParameter;
/*     */     //   354	10	21	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
/*     */     //   351	13	20	it$iv$iv	Ljava/lang/Object;
/*     */     //   330	38	17	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*     */     //   327	41	16	element$iv$iv	Ljava/lang/Object;
/*     */     //   323	46	15	element$iv$iv$iv	Ljava/lang/Object;
/*     */     //   295	78	13	$i$f$forEach	I
/*     */     //   292	81	12	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
/*     */     //   288	87	11	$i$f$mapNotNullTo	I
/*     */     //   285	90	9	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   285	90	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   269	110	8	$i$f$mapNotNull	I
/*     */     //   266	113	7	$this$mapNotNull$iv	Ljava/lang/Iterable;
/*     */     //   537	69	6	returnType	Ljava/lang/String;
/*     */     //   418	188	5	functionParameters	Ljava/lang/String;
/*     */     //   16	600	3	origin	Lcom/intellij/psi/PsiElement;
/*     */     //   0	616	0	this	Lcom/intellij/ml/llm/matterhorn/ej/kotlin/KotlinElementProvider;
/*     */     //   0	616	1	element	Lcom/intellij/psi/PsiElement;
/*     */     //   0	616	2	params	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\kotlin\KotlinElementProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */