/*     */ package com.intellij.ml.llm.matterhorn.ej.idea.relevance.extractors;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.ElementProvider;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.intellij.psi.PsiJavaCodeReferenceElement;
/*     */ import com.intellij.psi.util.PsiTreeUtil;
/*     */ import java.util.Collection;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\026J\026\020\t\032\b\022\004\022\0020\b0\0052\006\020\007\032\0020\bH\026J\022\020\n\032\004\030\0010\0132\006\020\007\032\0020\bH\026J\030\020\f\032\0020\r2\006\020\016\032\0020\0062\006\020\017\032\0020\020H\026¨\006\021²\006\n\020\022\032\0020\023X\002"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/relevance/extractors/JavaElementProvider;", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider;", "<init>", "()V", "extractElements", "", "Lcom/intellij/psi/PsiElement;", "file", "Lcom/intellij/psi/PsiFile;", "getImports", "getImportStatements", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ImportStatementInfo;", "getDeclarationString", "", "element", "params", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;", "ej-idea", "document", "Lcom/intellij/openapi/editor/Document;"})
/*     */ @SourceDebugExtension({"SMAP\nJavaElementProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaElementProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/relevance/extractors/JavaElementProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n774#2:99\n865#2,2:100\n1557#2:102\n1628#2,3:103\n1863#2,2:106\n1863#2,2:108\n1557#2:110\n1628#2,3:111\n*S KotlinDebug\n*F\n+ 1 JavaElementProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/relevance/extractors/JavaElementProvider\n*L\n19#1:99\n19#1:100,2\n20#1:102\n20#1:103,3\n25#1:106,2\n33#1:108,2\n51#1:110\n51#1:111,3\n*E\n"})
/*     */ public final class JavaElementProvider implements ElementProvider {
/*     */   @NotNull
/*  18 */   public List<PsiElement> extractElements(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file"); Class[] arrayOfClass = new Class[2]; arrayOfClass[0] = PsiClass.class; arrayOfClass[1] = PsiMethod.class; Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass), "findChildrenOfAnyType(...)"); Collection collection1 = PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass);
/*  19 */     int $i$f$filter = 0;
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
/*  99 */     Collection collection2 = collection1; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 100 */     for (Object element$iv$iv : collection2) { PsiElement it = (PsiElement)element$iv$iv; int $i$a$-filter-JavaElementProvider$extractElements$1 = 0; if ((((PsiNameIdentifierOwner)it).getNameIdentifier() != null)) collection.add(element$iv$iv);  }
/* 101 */      Iterable $this$filter$iv = collection; int $i$f$map = 0;
/* 102 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection<PsiElement> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10)); int $i$f$mapTo = 0;
/* 103 */     for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 104 */       PsiElement psiElement = (PsiElement)item$iv$iv; Collection<PsiElement> collection3 = destination$iv$iv; int $i$a$-map-JavaElementProvider$extractElements$2 = 0; Intrinsics.checkNotNull(psiElement, "null cannot be cast to non-null type com.intellij.psi.PsiElement"); collection3.add(psiElement);
/* 105 */     }  return (List<PsiElement>)destination$iv$iv; } @NotNull public List<PsiFile> getImports(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file"); Set resultFiles = new LinkedHashSet(); Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfType((PsiElement)file, PsiImportStatement.class), "findChildrenOfType(...)"); Iterable $this$forEach$iv = PsiTreeUtil.findChildrenOfType((PsiElement)file, PsiImportStatement.class); int $i$f$forEach = 0;
/* 106 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); PsiImportStatement importStatement = (PsiImportStatement)element$iv; int $i$a$-forEach-JavaElementProvider$getImports$1 = 0; PsiJavaCodeReferenceElement reference = importStatement.getImportReference(); }
/*     */      Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfType((PsiElement)file, PsiImportStaticStatement.class), "findChildrenOfType(...)"); $this$forEach$iv = PsiTreeUtil.findChildrenOfType((PsiElement)file, PsiImportStaticStatement.class); $i$f$forEach = 0;
/* 108 */     iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); PsiImportStaticStatement staticImport = (PsiImportStaticStatement)element$iv; int $i$a$-forEach-JavaElementProvider$getImports$2 = 0; PsiJavaCodeReferenceElement reference = staticImport.getImportReference(); }
/*     */      return CollectionsKt.toList(resultFiles); } @Nullable public ElementProvider.ImportStatementInfo getImportStatements(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file"); Lazy<? extends Document> document$delegate = LazyKt.lazy(file::getImportStatements$lambda$4); Class[] arrayOfClass = new Class[3]; arrayOfClass[0] = PsiImportStatement.class; arrayOfClass[1] = PsiImportStaticStatement.class; arrayOfClass[2] = PsiPackageStatement.class; Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass), "findChildrenOfAnyType(...)"); Collection collection1 = PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass); int $i$f$map = 0;
/* 110 */     Collection collection2 = collection1; Collection<Pair> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection1, 10)); int $i$f$mapTo = 0;
/* 111 */     for (Object item$iv$iv : collection2) {
/* 112 */       PsiElement psiElement = (PsiElement)item$iv$iv; Collection<Pair> collection = destination$iv$iv; int $i$a$-map-JavaElementProvider$getImportStatements$importRanges$1 = 0; Intrinsics.checkNotNull(psiElement); collection.add(ExtractorUtilsKt.getImportRange(getImportStatements$lambda$5(document$delegate), psiElement));
/* 113 */     }  List importRanges = (List)destination$iv$iv;
/*     */     return ExtractorUtilsKt.printImportStatements$default(importRanges, getImportStatements$lambda$5(document$delegate), null, 4, null); }
/*     */ 
/*     */   
/*     */   private static final Document getImportStatements$lambda$4(PsiFile $file) {
/*     */     Intrinsics.checkNotNullExpressionValue($file.getFileDocument(), "getFileDocument(...)");
/*     */     return $file.getFileDocument();
/*     */   }
/*     */   
/*     */   private static final Document getImportStatements$lambda$5(Lazy $document$delegate) {
/*     */     Lazy lazy = $document$delegate;
/*     */     return (Document)lazy.getValue();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getDeclarationString(@NotNull PsiElement element, @NotNull ElementProvider.ShowMethodsParametersType params) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'element'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'params'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_1
/*     */     //   13: astore_3
/*     */     //   14: aload_3
/*     */     //   15: instanceof com/intellij/psi/PsiClass
/*     */     //   18: ifeq -> 326
/*     */     //   21: nop
/*     */     //   22: aload_1
/*     */     //   23: checkcast com/intellij/psi/PsiClass
/*     */     //   26: invokeinterface isInterface : ()Z
/*     */     //   31: ifeq -> 39
/*     */     //   34: ldc 'interface'
/*     */     //   36: goto -> 58
/*     */     //   39: aload_1
/*     */     //   40: checkcast com/intellij/psi/PsiClass
/*     */     //   43: invokeinterface isEnum : ()Z
/*     */     //   48: ifeq -> 56
/*     */     //   51: ldc 'enum'
/*     */     //   53: goto -> 58
/*     */     //   56: ldc 'class'
/*     */     //   58: astore #4
/*     */     //   60: aload_2
/*     */     //   61: getstatic com/intellij/ml/llm/matterhorn/ej/idea/relevance/extractors/JavaElementProvider$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   64: swap
/*     */     //   65: invokevirtual ordinal : ()I
/*     */     //   68: iaload
/*     */     //   69: iconst_1
/*     */     //   70: if_icmpne -> 127
/*     */     //   73: aload_1
/*     */     //   74: checkcast com/intellij/psi/PsiClass
/*     */     //   77: invokeinterface getExtendsList : ()Lcom/intellij/psi/PsiReferenceList;
/*     */     //   82: dup
/*     */     //   83: ifnull -> 120
/*     */     //   86: invokeinterface getReferenceElements : ()[Lcom/intellij/psi/PsiJavaCodeReferenceElement;
/*     */     //   91: dup
/*     */     //   92: ifnull -> 120
/*     */     //   95: ldc_w ', '
/*     */     //   98: checkcast java/lang/CharSequence
/*     */     //   101: aconst_null
/*     */     //   102: aconst_null
/*     */     //   103: iconst_0
/*     */     //   104: aconst_null
/*     */     //   105: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   110: bipush #30
/*     */     //   112: aconst_null
/*     */     //   113: invokestatic joinToString$default : ([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   116: dup
/*     */     //   117: ifnonnull -> 130
/*     */     //   120: pop
/*     */     //   121: ldc_w ''
/*     */     //   124: goto -> 130
/*     */     //   127: ldc_w ''
/*     */     //   130: astore #5
/*     */     //   132: aload_2
/*     */     //   133: getstatic com/intellij/ml/llm/matterhorn/ej/idea/relevance/extractors/JavaElementProvider$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   136: swap
/*     */     //   137: invokevirtual ordinal : ()I
/*     */     //   140: iaload
/*     */     //   141: iconst_1
/*     */     //   142: if_icmpne -> 199
/*     */     //   145: aload_1
/*     */     //   146: checkcast com/intellij/psi/PsiClass
/*     */     //   149: invokeinterface getImplementsList : ()Lcom/intellij/psi/PsiReferenceList;
/*     */     //   154: dup
/*     */     //   155: ifnull -> 192
/*     */     //   158: invokeinterface getReferenceElements : ()[Lcom/intellij/psi/PsiJavaCodeReferenceElement;
/*     */     //   163: dup
/*     */     //   164: ifnull -> 192
/*     */     //   167: ldc_w ', '
/*     */     //   170: checkcast java/lang/CharSequence
/*     */     //   173: aconst_null
/*     */     //   174: aconst_null
/*     */     //   175: iconst_0
/*     */     //   176: aconst_null
/*     */     //   177: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   182: bipush #30
/*     */     //   184: aconst_null
/*     */     //   185: invokestatic joinToString$default : ([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   188: dup
/*     */     //   189: ifnonnull -> 202
/*     */     //   192: pop
/*     */     //   193: ldc_w ''
/*     */     //   196: goto -> 202
/*     */     //   199: ldc_w ''
/*     */     //   202: astore #6
/*     */     //   204: new java/lang/StringBuilder
/*     */     //   207: dup
/*     */     //   208: invokespecial <init> : ()V
/*     */     //   211: astore #7
/*     */     //   213: aload #7
/*     */     //   215: astore #8
/*     */     //   217: iconst_0
/*     */     //   218: istore #9
/*     */     //   220: aload #8
/*     */     //   222: aload #4
/*     */     //   224: aload_1
/*     */     //   225: checkcast com/intellij/psi/PsiClass
/*     */     //   228: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   233: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   238: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   241: pop
/*     */     //   242: aload #5
/*     */     //   244: checkcast java/lang/CharSequence
/*     */     //   247: invokeinterface length : ()I
/*     */     //   252: ifle -> 259
/*     */     //   255: iconst_1
/*     */     //   256: goto -> 260
/*     */     //   259: iconst_0
/*     */     //   260: ifeq -> 276
/*     */     //   263: aload #8
/*     */     //   265: aload #5
/*     */     //   267: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   272: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   275: pop
/*     */     //   276: aload #6
/*     */     //   278: checkcast java/lang/CharSequence
/*     */     //   281: invokeinterface length : ()I
/*     */     //   286: ifle -> 293
/*     */     //   289: iconst_1
/*     */     //   290: goto -> 294
/*     */     //   293: iconst_0
/*     */     //   294: ifeq -> 310
/*     */     //   297: aload #8
/*     */     //   299: aload #6
/*     */     //   301: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   306: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   309: pop
/*     */     //   310: nop
/*     */     //   311: aload #7
/*     */     //   313: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   316: dup
/*     */     //   317: ldc_w 'toString(...)'
/*     */     //   320: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   323: goto -> 585
/*     */     //   326: aload_3
/*     */     //   327: instanceof com/intellij/psi/PsiMethod
/*     */     //   330: ifeq -> 582
/*     */     //   333: aload_2
/*     */     //   334: getstatic com/intellij/ml/llm/matterhorn/ej/idea/relevance/extractors/JavaElementProvider$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   337: swap
/*     */     //   338: invokevirtual ordinal : ()I
/*     */     //   341: iaload
/*     */     //   342: tableswitch default -> 470, 1 -> 368, 2 -> 416, 3 -> 464
/*     */     //   368: aload_1
/*     */     //   369: checkcast com/intellij/psi/PsiMethod
/*     */     //   372: invokeinterface getParameterList : ()Lcom/intellij/psi/PsiParameterList;
/*     */     //   377: invokeinterface getParameters : ()[Lcom/intellij/psi/PsiParameter;
/*     */     //   382: dup
/*     */     //   383: ldc_w 'getParameters(...)'
/*     */     //   386: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   389: checkcast [Ljava/lang/Object;
/*     */     //   392: ldc_w ', '
/*     */     //   395: checkcast java/lang/CharSequence
/*     */     //   398: aconst_null
/*     */     //   399: aconst_null
/*     */     //   400: iconst_0
/*     */     //   401: aconst_null
/*     */     //   402: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   407: bipush #30
/*     */     //   409: aconst_null
/*     */     //   410: invokestatic joinToString$default : ([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   413: goto -> 478
/*     */     //   416: aload_1
/*     */     //   417: checkcast com/intellij/psi/PsiMethod
/*     */     //   420: invokeinterface getParameterList : ()Lcom/intellij/psi/PsiParameterList;
/*     */     //   425: invokeinterface getParameters : ()[Lcom/intellij/psi/PsiParameter;
/*     */     //   430: dup
/*     */     //   431: ldc_w 'getParameters(...)'
/*     */     //   434: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   437: checkcast [Ljava/lang/Object;
/*     */     //   440: ldc_w ', '
/*     */     //   443: checkcast java/lang/CharSequence
/*     */     //   446: aconst_null
/*     */     //   447: aconst_null
/*     */     //   448: iconst_0
/*     */     //   449: aconst_null
/*     */     //   450: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   455: bipush #30
/*     */     //   457: aconst_null
/*     */     //   458: invokestatic joinToString$default : ([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   461: goto -> 478
/*     */     //   464: ldc_w ''
/*     */     //   467: goto -> 478
/*     */     //   470: new kotlin/NoWhenBranchMatchedException
/*     */     //   473: dup
/*     */     //   474: invokespecial <init> : ()V
/*     */     //   477: athrow
/*     */     //   478: astore #4
/*     */     //   480: aload_1
/*     */     //   481: checkcast com/intellij/psi/PsiMethod
/*     */     //   484: invokeinterface isConstructor : ()Z
/*     */     //   489: ifeq -> 511
/*     */     //   492: aload_1
/*     */     //   493: checkcast com/intellij/psi/PsiMethod
/*     */     //   496: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   501: aload #4
/*     */     //   503: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   508: goto -> 585
/*     */     //   511: aload_1
/*     */     //   512: checkcast com/intellij/psi/PsiMethod
/*     */     //   515: invokeinterface getReturnType : ()Lcom/intellij/psi/PsiType;
/*     */     //   520: dup
/*     */     //   521: ifnull -> 531
/*     */     //   524: invokevirtual getPresentableText : ()Ljava/lang/String;
/*     */     //   527: dup
/*     */     //   528: ifnonnull -> 535
/*     */     //   531: pop
/*     */     //   532: ldc_w 'void'
/*     */     //   535: astore #5
/*     */     //   537: aload_1
/*     */     //   538: checkcast com/intellij/psi/PsiMethod
/*     */     //   541: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   546: aload #4
/*     */     //   548: aload_2
/*     */     //   549: getstatic com/intellij/ml/llm/matterhorn/ej/idea/relevance/extractors/JavaElementProvider$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   552: swap
/*     */     //   553: invokevirtual ordinal : ()I
/*     */     //   556: iaload
/*     */     //   557: iconst_1
/*     */     //   558: if_icmpne -> 571
/*     */     //   561: aload #5
/*     */     //   563: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   568: goto -> 574
/*     */     //   571: ldc_w ''
/*     */     //   574: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   579: goto -> 585
/*     */     //   582: ldc_w ''
/*     */     //   585: invokestatic reformatToSingleLine : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   588: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #55	-> 12
/*     */     //   #56	-> 14
/*     */     //   #57	-> 21
/*     */     //   #58	-> 22
/*     */     //   #59	-> 39
/*     */     //   #60	-> 56
/*     */     //   #57	-> 58
/*     */     //   #62	-> 60
/*     */     //   #63	-> 69
/*     */     //   #64	-> 127
/*     */     //   #62	-> 130
/*     */     //   #66	-> 132
/*     */     //   #67	-> 141
/*     */     //   #68	-> 199
/*     */     //   #66	-> 202
/*     */     //   #71	-> 204
/*     */     //   #72	-> 220
/*     */     //   #73	-> 242
/*     */     //   #73	-> 260
/*     */     //   #74	-> 276
/*     */     //   #74	-> 294
/*     */     //   #75	-> 310
/*     */     //   #71	-> 311
/*     */     //   #77	-> 326
/*     */     //   #78	-> 333
/*     */     //   #79	-> 368
/*     */     //   #83	-> 416
/*     */     //   #84	-> 464
/*     */     //   #78	-> 470
/*     */     //   #86	-> 480
/*     */     //   #87	-> 492
/*     */     //   #89	-> 511
/*     */     //   #90	-> 537
/*     */     //   #91	-> 557
/*     */     //   #92	-> 571
/*     */     //   #96	-> 582
/*     */     //   #97	-> 585
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   220	91	9	$i$a$-buildString-JavaElementProvider$getDeclarationString$1	I
/*     */     //   217	94	8	$this$getDeclarationString_u24lambda_u249	Ljava/lang/StringBuilder;
/*     */     //   60	263	4	classType	Ljava/lang/String;
/*     */     //   132	191	5	extendsClause	Ljava/lang/String;
/*     */     //   204	119	6	implementsClause	Ljava/lang/String;
/*     */     //   537	42	5	returnType	Ljava/lang/String;
/*     */     //   480	99	4	parameters	Ljava/lang/String;
/*     */     //   0	589	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/relevance/extractors/JavaElementProvider;
/*     */     //   0	589	1	element	Lcom/intellij/psi/PsiElement;
/*     */     //   0	589	2	params	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;
/*     */   }
/*     */   
/*     */   private static final CharSequence getDeclarationString$lambda$7(PsiJavaCodeReferenceElement it) {
/*     */     Intrinsics.checkNotNullExpressionValue(it.getText(), "getText(...)");
/*     */     return it.getText();
/*     */   }
/*     */   
/*     */   private static final CharSequence getDeclarationString$lambda$8(PsiJavaCodeReferenceElement it) {
/*     */     Intrinsics.checkNotNullExpressionValue(it.getText(), "getText(...)");
/*     */     return it.getText();
/*     */   }
/*     */   
/*     */   private static final CharSequence getDeclarationString$lambda$10(PsiParameter it) {
/*     */     return it.getType().getPresentableText() + " " + it.getType().getPresentableText();
/*     */   }
/*     */   
/*     */   private static final CharSequence getDeclarationString$lambda$11(PsiParameter it) {
/*     */     Intrinsics.checkNotNullExpressionValue(it.getName(), "getName(...)");
/*     */     return it.getName();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\relevance\extractors\JavaElementProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */