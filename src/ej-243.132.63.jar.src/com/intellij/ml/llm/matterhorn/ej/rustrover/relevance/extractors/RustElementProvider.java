/*     */ package com.intellij.ml.llm.matterhorn.ej.rustrover.relevance.extractors;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.ElementProvider;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.Pair;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.rust.ide.presentation.RsPsiRendererKt;
/*     */ import org.rust.lang.core.psi.RsNamedFieldDecl;
/*     */ import org.rust.lang.core.psi.RsTupleFieldDecl;
/*     */ import org.rust.lang.core.psi.RsTypeReference;
/*     */ import org.rust.lang.core.psi.RsUseSpeck;
/*     */ import org.rust.lang.core.psi.ext.RsUseSpeckKt;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\026J\026\020\t\032\b\022\004\022\0020\b0\0052\006\020\007\032\0020\bH\026J\022\020\n\032\004\030\0010\0132\006\020\007\032\0020\bH\026J\030\020\f\032\0020\r2\006\020\016\032\0020\0062\006\020\017\032\0020\020H\026¨\006\021²\006\n\020\022\032\0020\023X\002"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/rustrover/relevance/extractors/RustElementProvider;", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider;", "<init>", "()V", "extractElements", "", "Lcom/intellij/psi/PsiElement;", "file", "Lcom/intellij/psi/PsiFile;", "getImports", "getImportStatements", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ImportStatementInfo;", "getDeclarationString", "", "element", "params", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;", "ej-rustrover", "document", "Lcom/intellij/openapi/editor/Document;"})
/*     */ @SourceDebugExtension({"SMAP\nRustElementProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RustElementProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/rustrover/relevance/extractors/RustElementProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n774#2:157\n865#2,2:158\n808#2,11:167\n1557#2:178\n1628#2,3:179\n5298#3,7:160\n1#4:182\n*S KotlinDebug\n*F\n+ 1 RustElementProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/rustrover/relevance/extractors/RustElementProvider\n*L\n41#1:157\n41#1:158,2\n75#1:167,11\n76#1:178\n76#1:179,3\n68#1:160,7\n*E\n"})
/*     */ public final class RustElementProvider implements ElementProvider {
/*     */   @NotNull
/*     */   public List<PsiFile> getImports(@NotNull PsiFile file) {
/*     */     Intrinsics.checkNotNullParameter(file, "file");
/*     */     Set<PsiFile> set1 = SetsKt.createSetBuilder(), $this$getImports_u24lambda_u241 = set1;
/*     */     int $i$a$-buildSet-RustElementProvider$getImports$1 = 0;
/*     */     PsiTreeUtil.processElements((PsiElement)file, new RustElementProvider$getImports$1$1<>($this$getImports_u24lambda_u241));
/*     */     return CollectionsKt.toList(SetsKt.build(set1));
/*     */   }
/*     */   
/*     */   @NotNull
/*  35 */   public List<PsiElement> extractElements(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file");
/*  36 */     Class[] arrayOfClass = new Class[5]; arrayOfClass[0] = RsStructOrEnumItemElement.class; arrayOfClass[1] = 
/*  37 */       RsFunction.class;
/*  38 */     arrayOfClass[2] = RsTraitItem.class;
/*  39 */     arrayOfClass[3] = RsEnumVariant.class;
/*  40 */     arrayOfClass[4] = RsImplItem.class; Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass), "findChildrenOfAnyType(...)"); Collection collection1 = PsiTreeUtil.findChildrenOfAnyType((PsiElement)file, arrayOfClass);
/*  41 */     int $i$f$filter = 0;
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
/* 157 */     Collection collection2 = collection1, destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 158 */     for (Object element$iv$iv : collection2) { RsElement it = (RsElement)element$iv$iv; int $i$a$-filter-RustElementProvider$extractElements$1 = 0; if (it instanceof RsImplItem) {  } else { throw new IllegalStateException("Cannot be here".toString()); }  }
/* 159 */      return (List<PsiElement>)destination$iv$iv; } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class RustElementProvider$getImports$1$1<T extends PsiElement> implements PsiElementProcessor {
/* 160 */     RustElementProvider$getImports$1$1(Set<PsiFile> $receiver) {} public final boolean execute(PsiElement element) { Intrinsics.checkNotNullParameter(element, "element"); if (element instanceof RsUseSpeck && ((RsUseSpeck)element).getUseGroup() == null) if (RsUseSpeckKt.getPathOrQualifier((RsUseSpeck)element) != null && RsUseSpeckKt.getPathOrQualifier((RsUseSpeck)element).getReference() != null && RsUseSpeckKt.getPathOrQualifier((RsUseSpeck)element).getReference().resolve() != null && PsiElementKt.getContextualFile((PsiElement)RsUseSpeckKt.getPathOrQualifier((RsUseSpeck)element).getReference().resolve()) != null) { PsiFile psiFile1 = PsiElementKt.getContextualFile((PsiElement)RsUseSpeckKt.getPathOrQualifier((RsUseSpeck)element).getReference().resolve()); Set<PsiFile> set = this.$this_buildSet; PsiFile it = psiFile1; int $i$a$-let-RustElementProvider$getImports$1$1$1 = 0; set.add(it); } else { PsiElementKt.getContextualFile((PsiElement)RsUseSpeckKt.getPathOrQualifier((RsUseSpeck)element).getReference().resolve()); }   return true; } } @Nullable public ElementProvider.ImportStatementInfo getImportStatements(@NotNull PsiFile file) { Intrinsics.checkNotNullParameter(file, "file"); Lazy<? extends Document> document$delegate = LazyKt.lazy(file::getImportStatements$lambda$2); Intrinsics.checkNotNullExpressionValue(file.getChildren(), "getChildren(...)"); Object[] $this$takeWhile$iv = (Object[])file.getChildren(); int $i$f$takeWhile = 0; ArrayList list$iv = new ArrayList(); byte b; int i;
/* 161 */     for (b = 0, i = $this$takeWhile$iv.length; b < i; psiElement1 = it) { PsiElement psiElement1; Object item$iv = $this$takeWhile$iv[b];
/* 162 */       PsiElement it = (PsiElement)item$iv; int $i$a$-takeWhile-RustElementProvider$getImportStatements$useRanges$1 = 0; }
/*     */ 
/*     */ 
/*     */     
/* 166 */     ArrayList arrayList1 = list$iv; int $i$f$filterIsInstance = 0;
/* 167 */     list$iv = arrayList1; Collection<Object> collection = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 176 */     for (Object element$iv$iv : list$iv) { if (element$iv$iv instanceof RsUseItem) collection.add(element$iv$iv);  }
/* 177 */      Iterable $this$filterIsInstance$iv = collection; int $i$f$map = 0;
/* 178 */     Iterable $this$filterIsInstanceTo$iv$iv = $this$filterIsInstance$iv; Collection<Pair> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filterIsInstance$iv, 10)); int $i$f$mapTo = 0;
/* 179 */     for (Object item$iv$iv : $this$filterIsInstanceTo$iv$iv) {
/* 180 */       RsUseItem rsUseItem = (RsUseItem)item$iv$iv; Collection<Pair> collection1 = destination$iv$iv; int $i$a$-map-RustElementProvider$getImportStatements$useRanges$2 = 0; collection1.add(ExtractorUtilsKt.getImportRange(getImportStatements$lambda$3(document$delegate), (PsiElement)rsUseItem));
/* 181 */     }  List useRanges = (List)destination$iv$iv; if (useRanges.isEmpty()) return null;  return ExtractorUtilsKt.printImportStatements$default(useRanges, getImportStatements$lambda$3(document$delegate), null, 4, null); } private static final Document getImportStatements$lambda$2(PsiFile $file) { Intrinsics.checkNotNullExpressionValue($file.getFileDocument(), "getFileDocument(...)"); return $file.getFileDocument(); } private static final Document getImportStatements$lambda$3(Lazy $document$delegate) { Lazy lazy = $document$delegate; return (Document)lazy.getValue(); } @NotNull public String getDeclarationString(@NotNull PsiElement element, @NotNull ElementProvider.ShowMethodsParametersType params) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'element'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'params'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_1
/*     */     //   13: astore_3
/*     */     //   14: aload_3
/*     */     //   15: instanceof org/rust/lang/core/psi/RsStructItem
/*     */     //   18: ifeq -> 38
/*     */     //   21: aload_1
/*     */     //   22: checkcast org/rust/lang/core/psi/RsStructItem
/*     */     //   25: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   30: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   35: goto -> 989
/*     */     //   38: aload_3
/*     */     //   39: instanceof org/rust/lang/core/psi/RsEnumItem
/*     */     //   42: ifeq -> 62
/*     */     //   45: aload_1
/*     */     //   46: checkcast org/rust/lang/core/psi/RsEnumItem
/*     */     //   49: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   54: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   59: goto -> 989
/*     */     //   62: aload_3
/*     */     //   63: instanceof org/rust/lang/core/psi/RsFunction
/*     */     //   66: ifeq -> 359
/*     */     //   69: new java/lang/StringBuilder
/*     */     //   72: dup
/*     */     //   73: invokespecial <init> : ()V
/*     */     //   76: astore #4
/*     */     //   78: aload #4
/*     */     //   80: astore #5
/*     */     //   82: iconst_0
/*     */     //   83: istore #6
/*     */     //   85: aload #5
/*     */     //   87: iconst_2
/*     */     //   88: anewarray java/lang/String
/*     */     //   91: astore #7
/*     */     //   93: aload #7
/*     */     //   95: iconst_0
/*     */     //   96: ldc_w 'fn '
/*     */     //   99: aastore
/*     */     //   100: aload #7
/*     */     //   102: iconst_1
/*     */     //   103: aload_1
/*     */     //   104: checkcast org/rust/lang/core/psi/RsFunction
/*     */     //   107: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   112: aastore
/*     */     //   113: aload #7
/*     */     //   115: invokestatic append : (Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   118: pop
/*     */     //   119: aload_2
/*     */     //   120: getstatic com/intellij/ml/llm/matterhorn/ej/rustrover/relevance/extractors/RustElementProvider$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   123: swap
/*     */     //   124: invokevirtual ordinal : ()I
/*     */     //   127: iaload
/*     */     //   128: tableswitch default -> 224, 1 -> 156, 2 -> 187, 3 -> 218
/*     */     //   156: aload_1
/*     */     //   157: checkcast org/rust/lang/core/psi/RsFunction
/*     */     //   160: invokestatic access$parameterNamesWithTypes : (Lorg/rust/lang/core/psi/RsFunction;)Lkotlin/sequences/Sequence;
/*     */     //   163: ldc_w ', '
/*     */     //   166: checkcast java/lang/CharSequence
/*     */     //   169: aconst_null
/*     */     //   170: aconst_null
/*     */     //   171: iconst_0
/*     */     //   172: aconst_null
/*     */     //   173: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   178: bipush #30
/*     */     //   180: aconst_null
/*     */     //   181: invokestatic joinToString$default : (Lkotlin/sequences/Sequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   184: goto -> 232
/*     */     //   187: aload_1
/*     */     //   188: checkcast org/rust/lang/core/psi/RsFunction
/*     */     //   191: invokestatic access$parameterNamesWithTypes : (Lorg/rust/lang/core/psi/RsFunction;)Lkotlin/sequences/Sequence;
/*     */     //   194: ldc_w ', '
/*     */     //   197: checkcast java/lang/CharSequence
/*     */     //   200: aconst_null
/*     */     //   201: aconst_null
/*     */     //   202: iconst_0
/*     */     //   203: aconst_null
/*     */     //   204: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   209: bipush #30
/*     */     //   211: aconst_null
/*     */     //   212: invokestatic joinToString$default : (Lkotlin/sequences/Sequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   215: goto -> 232
/*     */     //   218: ldc_w ''
/*     */     //   221: goto -> 232
/*     */     //   224: new kotlin/NoWhenBranchMatchedException
/*     */     //   227: dup
/*     */     //   228: invokespecial <init> : ()V
/*     */     //   231: athrow
/*     */     //   232: astore #7
/*     */     //   234: aload #5
/*     */     //   236: iconst_3
/*     */     //   237: anewarray java/lang/String
/*     */     //   240: astore #8
/*     */     //   242: aload #8
/*     */     //   244: iconst_0
/*     */     //   245: ldc_w '('
/*     */     //   248: aastore
/*     */     //   249: aload #8
/*     */     //   251: iconst_1
/*     */     //   252: aload #7
/*     */     //   254: aastore
/*     */     //   255: aload #8
/*     */     //   257: iconst_2
/*     */     //   258: ldc_w ')'
/*     */     //   261: aastore
/*     */     //   262: aload #8
/*     */     //   264: invokestatic append : (Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   267: pop
/*     */     //   268: aload_2
/*     */     //   269: getstatic com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType.FULL : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;
/*     */     //   272: if_acmpne -> 343
/*     */     //   275: aload_1
/*     */     //   276: checkcast org/rust/lang/core/psi/RsFunction
/*     */     //   279: invokeinterface getRetType : ()Lorg/rust/lang/core/psi/RsRetType;
/*     */     //   284: dup
/*     */     //   285: ifnull -> 310
/*     */     //   288: invokeinterface getTypeReference : ()Lorg/rust/lang/core/psi/RsTypeReference;
/*     */     //   293: dup
/*     */     //   294: ifnull -> 310
/*     */     //   297: aconst_null
/*     */     //   298: iconst_0
/*     */     //   299: iconst_0
/*     */     //   300: bipush #7
/*     */     //   302: aconst_null
/*     */     //   303: invokestatic getStubOnlyText$default : (Lorg/rust/lang/core/psi/RsTypeReference;Lorg/rust/lang/core/types/Substitution;ZZILjava/lang/Object;)Ljava/lang/String;
/*     */     //   306: dup
/*     */     //   307: ifnonnull -> 314
/*     */     //   310: pop
/*     */     //   311: ldc_w '()'
/*     */     //   314: astore #8
/*     */     //   316: aload #5
/*     */     //   318: iconst_2
/*     */     //   319: anewarray java/lang/String
/*     */     //   322: astore #9
/*     */     //   324: aload #9
/*     */     //   326: iconst_0
/*     */     //   327: ldc_w ' -> '
/*     */     //   330: aastore
/*     */     //   331: aload #9
/*     */     //   333: iconst_1
/*     */     //   334: aload #8
/*     */     //   336: aastore
/*     */     //   337: aload #9
/*     */     //   339: invokestatic append : (Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   342: pop
/*     */     //   343: nop
/*     */     //   344: aload #4
/*     */     //   346: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   349: dup
/*     */     //   350: ldc_w 'toString(...)'
/*     */     //   353: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   356: goto -> 989
/*     */     //   359: aload_3
/*     */     //   360: instanceof org/rust/lang/core/psi/RsEnumVariant
/*     */     //   363: ifeq -> 812
/*     */     //   366: new java/lang/StringBuilder
/*     */     //   369: dup
/*     */     //   370: invokespecial <init> : ()V
/*     */     //   373: astore #4
/*     */     //   375: aload #4
/*     */     //   377: astore #5
/*     */     //   379: iconst_0
/*     */     //   380: istore #6
/*     */     //   382: aload #5
/*     */     //   384: iconst_2
/*     */     //   385: anewarray java/lang/String
/*     */     //   388: astore #7
/*     */     //   390: aload #7
/*     */     //   392: iconst_0
/*     */     //   393: ldc_w 'enum_variant '
/*     */     //   396: aastore
/*     */     //   397: aload #7
/*     */     //   399: iconst_1
/*     */     //   400: aload_1
/*     */     //   401: checkcast org/rust/lang/core/psi/RsEnumVariant
/*     */     //   404: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   409: dup
/*     */     //   410: ifnonnull -> 417
/*     */     //   413: pop
/*     */     //   414: ldc_w ''
/*     */     //   417: aastore
/*     */     //   418: aload #7
/*     */     //   420: invokestatic append : (Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   423: pop
/*     */     //   424: aload_2
/*     */     //   425: getstatic com/intellij/ml/llm/matterhorn/ej/rustrover/relevance/extractors/RustElementProvider$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   428: swap
/*     */     //   429: invokevirtual ordinal : ()I
/*     */     //   432: iaload
/*     */     //   433: tableswitch default -> 788, 1 -> 460, 2 -> 633, 3 -> 785
/*     */     //   460: aload_1
/*     */     //   461: checkcast org/rust/lang/core/psi/RsEnumVariant
/*     */     //   464: invokeinterface getTupleFields : ()Lorg/rust/lang/core/psi/RsTupleFields;
/*     */     //   469: astore #8
/*     */     //   471: aload #8
/*     */     //   473: ifnull -> 529
/*     */     //   476: aload #8
/*     */     //   478: invokeinterface getTupleFieldDeclList : ()Ljava/util/List;
/*     */     //   483: astore #9
/*     */     //   485: aload #9
/*     */     //   487: ifnull -> 529
/*     */     //   490: aload #9
/*     */     //   492: checkcast java/lang/Iterable
/*     */     //   495: ldc_w ', '
/*     */     //   498: checkcast java/lang/CharSequence
/*     */     //   501: ldc_w '('
/*     */     //   504: checkcast java/lang/CharSequence
/*     */     //   507: ldc_w ')'
/*     */     //   510: checkcast java/lang/CharSequence
/*     */     //   513: iconst_0
/*     */     //   514: aconst_null
/*     */     //   515: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   520: bipush #24
/*     */     //   522: aconst_null
/*     */     //   523: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   526: goto -> 530
/*     */     //   529: aconst_null
/*     */     //   530: astore #10
/*     */     //   532: aload_1
/*     */     //   533: checkcast org/rust/lang/core/psi/RsEnumVariant
/*     */     //   536: invokeinterface getBlockFields : ()Lorg/rust/lang/core/psi/RsBlockFields;
/*     */     //   541: astore #9
/*     */     //   543: aload #9
/*     */     //   545: ifnull -> 601
/*     */     //   548: aload #9
/*     */     //   550: invokeinterface getNamedFieldDeclList : ()Ljava/util/List;
/*     */     //   555: astore #11
/*     */     //   557: aload #11
/*     */     //   559: ifnull -> 601
/*     */     //   562: aload #11
/*     */     //   564: checkcast java/lang/Iterable
/*     */     //   567: ldc_w ', '
/*     */     //   570: checkcast java/lang/CharSequence
/*     */     //   573: ldc_w '{'
/*     */     //   576: checkcast java/lang/CharSequence
/*     */     //   579: ldc_w '}'
/*     */     //   582: checkcast java/lang/CharSequence
/*     */     //   585: iconst_0
/*     */     //   586: aconst_null
/*     */     //   587: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   592: bipush #24
/*     */     //   594: aconst_null
/*     */     //   595: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   598: goto -> 602
/*     */     //   601: aconst_null
/*     */     //   602: astore #8
/*     */     //   604: aload #10
/*     */     //   606: ifnull -> 617
/*     */     //   609: aload #5
/*     */     //   611: aload #10
/*     */     //   613: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   616: pop
/*     */     //   617: aload #8
/*     */     //   619: ifnull -> 796
/*     */     //   622: aload #5
/*     */     //   624: aload #8
/*     */     //   626: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   629: pop
/*     */     //   630: goto -> 796
/*     */     //   633: aload_1
/*     */     //   634: checkcast org/rust/lang/core/psi/RsEnumVariant
/*     */     //   637: invokeinterface getTupleFields : ()Lorg/rust/lang/core/psi/RsTupleFields;
/*     */     //   642: dup
/*     */     //   643: ifnull -> 689
/*     */     //   646: invokeinterface getTupleFieldDeclList : ()Ljava/util/List;
/*     */     //   651: dup
/*     */     //   652: ifnull -> 689
/*     */     //   655: checkcast java/lang/Iterable
/*     */     //   658: invokestatic withIndex : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
/*     */     //   661: dup
/*     */     //   662: ifnull -> 689
/*     */     //   665: ldc_w ', '
/*     */     //   668: checkcast java/lang/CharSequence
/*     */     //   671: aconst_null
/*     */     //   672: aconst_null
/*     */     //   673: iconst_0
/*     */     //   674: aconst_null
/*     */     //   675: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   680: bipush #30
/*     */     //   682: aconst_null
/*     */     //   683: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   686: goto -> 691
/*     */     //   689: pop
/*     */     //   690: aconst_null
/*     */     //   691: astore #10
/*     */     //   693: aload_1
/*     */     //   694: checkcast org/rust/lang/core/psi/RsEnumVariant
/*     */     //   697: invokeinterface getBlockFields : ()Lorg/rust/lang/core/psi/RsBlockFields;
/*     */     //   702: dup
/*     */     //   703: ifnull -> 742
/*     */     //   706: invokeinterface getNamedFieldDeclList : ()Ljava/util/List;
/*     */     //   711: dup
/*     */     //   712: ifnull -> 742
/*     */     //   715: checkcast java/lang/Iterable
/*     */     //   718: ldc_w ', '
/*     */     //   721: checkcast java/lang/CharSequence
/*     */     //   724: aconst_null
/*     */     //   725: aconst_null
/*     */     //   726: iconst_0
/*     */     //   727: aconst_null
/*     */     //   728: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   733: bipush #30
/*     */     //   735: aconst_null
/*     */     //   736: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   739: goto -> 744
/*     */     //   742: pop
/*     */     //   743: aconst_null
/*     */     //   744: astore #8
/*     */     //   746: aload #10
/*     */     //   748: ifnull -> 764
/*     */     //   751: aload #5
/*     */     //   753: aload #10
/*     */     //   755: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   760: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   763: pop
/*     */     //   764: aload #8
/*     */     //   766: ifnull -> 796
/*     */     //   769: aload #5
/*     */     //   771: aload #8
/*     */     //   773: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   778: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   781: pop
/*     */     //   782: goto -> 796
/*     */     //   785: goto -> 796
/*     */     //   788: new kotlin/NoWhenBranchMatchedException
/*     */     //   791: dup
/*     */     //   792: invokespecial <init> : ()V
/*     */     //   795: athrow
/*     */     //   796: nop
/*     */     //   797: aload #4
/*     */     //   799: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   802: dup
/*     */     //   803: ldc_w 'toString(...)'
/*     */     //   806: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   809: goto -> 989
/*     */     //   812: aload_3
/*     */     //   813: instanceof org/rust/lang/core/psi/RsImplItem
/*     */     //   816: ifeq -> 962
/*     */     //   819: new java/lang/StringBuilder
/*     */     //   822: dup
/*     */     //   823: invokespecial <init> : ()V
/*     */     //   826: astore #4
/*     */     //   828: aload #4
/*     */     //   830: astore #5
/*     */     //   832: iconst_0
/*     */     //   833: istore #6
/*     */     //   835: aload #5
/*     */     //   837: ldc_w 'impl '
/*     */     //   840: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   843: pop
/*     */     //   844: aload_1
/*     */     //   845: checkcast org/rust/lang/core/psi/RsImplItem
/*     */     //   848: invokeinterface getTraitRef : ()Lorg/rust/lang/core/psi/RsTraitRef;
/*     */     //   853: dup
/*     */     //   854: ifnull -> 874
/*     */     //   857: invokeinterface getPath : ()Lorg/rust/lang/core/psi/RsPath;
/*     */     //   862: dup
/*     */     //   863: ifnull -> 874
/*     */     //   866: invokeinterface getReferenceName : ()Ljava/lang/String;
/*     */     //   871: goto -> 876
/*     */     //   874: pop
/*     */     //   875: aconst_null
/*     */     //   876: astore #7
/*     */     //   878: aload #7
/*     */     //   880: ifnull -> 910
/*     */     //   883: aload #5
/*     */     //   885: iconst_2
/*     */     //   886: anewarray java/lang/String
/*     */     //   889: astore #8
/*     */     //   891: aload #8
/*     */     //   893: iconst_0
/*     */     //   894: aload #7
/*     */     //   896: aastore
/*     */     //   897: aload #8
/*     */     //   899: iconst_1
/*     */     //   900: ldc_w ' for '
/*     */     //   903: aastore
/*     */     //   904: aload #8
/*     */     //   906: invokestatic append : (Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   909: pop
/*     */     //   910: aload #5
/*     */     //   912: aload_1
/*     */     //   913: checkcast org/rust/lang/core/psi/RsImplItem
/*     */     //   916: invokeinterface getTypeReference : ()Lorg/rust/lang/core/psi/RsTypeReference;
/*     */     //   921: dup
/*     */     //   922: ifnull -> 938
/*     */     //   925: aconst_null
/*     */     //   926: iconst_0
/*     */     //   927: iconst_0
/*     */     //   928: bipush #7
/*     */     //   930: aconst_null
/*     */     //   931: invokestatic getStubOnlyText$default : (Lorg/rust/lang/core/psi/RsTypeReference;Lorg/rust/lang/core/types/Substitution;ZZILjava/lang/Object;)Ljava/lang/String;
/*     */     //   934: dup
/*     */     //   935: ifnonnull -> 942
/*     */     //   938: pop
/*     */     //   939: ldc_w ''
/*     */     //   942: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   945: pop
/*     */     //   946: nop
/*     */     //   947: aload #4
/*     */     //   949: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   952: dup
/*     */     //   953: ldc_w 'toString(...)'
/*     */     //   956: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   959: goto -> 989
/*     */     //   962: aload_3
/*     */     //   963: instanceof org/rust/lang/core/psi/RsTraitItem
/*     */     //   966: ifeq -> 986
/*     */     //   969: aload_1
/*     */     //   970: checkcast org/rust/lang/core/psi/RsTraitItem
/*     */     //   973: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   978: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   983: goto -> 989
/*     */     //   986: ldc_w ''
/*     */     //   989: invokestatic reformatToSingleLine : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   992: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #89	-> 12
/*     */     //   #90	-> 14
/*     */     //   #91	-> 38
/*     */     //   #92	-> 62
/*     */     //   #93	-> 69
/*     */     //   #94	-> 85
/*     */     //   #95	-> 119
/*     */     //   #97	-> 156
/*     */     //   #98	-> 163
/*     */     //   #100	-> 187
/*     */     //   #102	-> 218
/*     */     //   #95	-> 224
/*     */     //   #104	-> 234
/*     */     //   #105	-> 268
/*     */     //   #106	-> 275
/*     */     //   #107	-> 316
/*     */     //   #109	-> 343
/*     */     //   #93	-> 344
/*     */     //   #111	-> 359
/*     */     //   #112	-> 382
/*     */     //   #113	-> 424
/*     */     //   #115	-> 460
/*     */     //   #116	-> 460
/*     */     //   #115	-> 460
/*     */     //   #116	-> 485
/*     */     //   #115	-> 490
/*     */     //   #116	-> 495
/*     */     //   #115	-> 529
/*     */     //   #117	-> 532
/*     */     //   #118	-> 532
/*     */     //   #117	-> 532
/*     */     //   #118	-> 557
/*     */     //   #117	-> 562
/*     */     //   #118	-> 567
/*     */     //   #117	-> 601
/*     */     //   #119	-> 604
/*     */     //   #120	-> 617
/*     */     //   #123	-> 633
/*     */     //   #124	-> 693
/*     */     //   #125	-> 746
/*     */     //   #126	-> 764
/*     */     //   #113	-> 788
/*     */     //   #130	-> 796
/*     */     //   #111	-> 797
/*     */     //   #131	-> 812
/*     */     //   #132	-> 835
/*     */     //   #134	-> 844
/*     */     //   #135	-> 878
/*     */     //   #136	-> 883
/*     */     //   #139	-> 910
/*     */     //   #140	-> 946
/*     */     //   #131	-> 947
/*     */     //   #141	-> 962
/*     */     //   #142	-> 986
/*     */     //   #143	-> 989
/*     */     //   #89	-> 992
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   316	26	8	returnType	Ljava/lang/String;
/*     */     //   85	259	6	$i$a$-buildString-RustElementProvider$getDeclarationString$1	I
/*     */     //   234	110	7	parameters	Ljava/lang/String;
/*     */     //   82	262	5	$this$getDeclarationString_u24lambda_u249	Ljava/lang/StringBuilder;
/*     */     //   532	98	10	tupleFields	Ljava/lang/String;
/*     */     //   604	26	8	blockFields	Ljava/lang/String;
/*     */     //   693	89	10	tupleFields	Ljava/lang/String;
/*     */     //   746	36	8	blockFields	Ljava/lang/String;
/*     */     //   382	415	6	$i$a$-buildString-RustElementProvider$getDeclarationString$2	I
/*     */     //   379	418	5	$this$getDeclarationString_u24lambda_u2414	Ljava/lang/StringBuilder;
/*     */     //   835	112	6	$i$a$-buildString-RustElementProvider$getDeclarationString$3	I
/*     */     //   878	69	7	traitRef	Ljava/lang/String;
/*     */     //   832	115	5	$this$getDeclarationString_u24lambda_u2415	Ljava/lang/StringBuilder;
/*     */     //   0	993	0	this	Lcom/intellij/ml/llm/matterhorn/ej/rustrover/relevance/extractors/RustElementProvider;
/*     */     //   0	993	1	element	Lcom/intellij/psi/PsiElement;
/*     */     //   0	993	2	params	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType; }
/* 182 */   private static final CharSequence getDeclarationString$lambda$9$lambda$7(Pair paramPair) { Intrinsics.checkNotNullParameter(paramPair, "<destruct>"); String pat = (String)paramPair.component1(); RsTypeReference type = (RsTypeReference)paramPair.component2(); if (type != null && RsPsiRendererKt.getStubOnlyText$default(type, null, false, false, 7, null) != null) { String str1 = RsPsiRendererKt.getStubOnlyText$default(type, null, false, false, 7, null); String str2 = pat; int $i$a$-let-RustElementProvider$getDeclarationString$1$parameters$1$1 = 0;
/*     */       return (": " + str1 == null) ? (": " + str1 + ": " + str1) : (": " + str1 + ": " + str1); }
/*     */     
/*     */     RsPsiRendererKt.getStubOnlyText$default(type, null, false, false, 7, null);
/*     */     return pat + pat; }
/*     */ 
/*     */   
/*     */   private static final CharSequence getDeclarationString$lambda$9$lambda$8(Pair it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return String.valueOf(it.getFirst());
/*     */   }
/*     */   
/*     */   private static final CharSequence getDeclarationString$lambda$14$lambda$10(RsTupleFieldDecl it) {
/*     */     Intrinsics.checkNotNullExpressionValue(it.getTypeReference(), "<get-typeReference>(...)");
/*     */     return RsPsiRendererKt.getStubOnlyText$default(it.getTypeReference(), null, false, false, 7, null);
/*     */   }
/*     */   
/*     */   private static final CharSequence getDeclarationString$lambda$14$lambda$11(RsNamedFieldDecl it) {
/*     */     it.getTypeReference();
/*     */     return it.getName() + " : " + it.getName();
/*     */   }
/*     */   
/*     */   private static final CharSequence getDeclarationString$lambda$14$lambda$12(IndexedValue it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return String.valueOf(it.getIndex());
/*     */   }
/*     */   
/*     */   private static final CharSequence getDeclarationString$lambda$14$lambda$13(RsNamedFieldDecl it) {
/*     */     it.getName();
/*     */     return (it.getName() != null) ? it.getName() : "";
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\rustrover\relevance\extractors\RustElementProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */