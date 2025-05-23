package com.intellij.ml.llm.matterhorn.ej.core.utils;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\032.\020\005\032\b\022\004\022\0020\0070\0062\006\020\b\032\0020\t2\006\020\n\032\0020\0022\b\b\002\020\013\032\0020\fH@¢\006\002\020\r*\032\020\000\"\n\022\006\b\001\022\0020\0020\0012\n\022\006\b\001\022\0020\0020\001*\032\020\003\"\n\022\006\b\001\022\0020\0040\0012\n\022\006\b\001\022\0020\0040\001¨\006\016"}, d2 = {"PsiElementPointer", "Lcom/intellij/psi/SmartPsiElementPointer;", "Lcom/intellij/psi/PsiElement;", "PsiFilePointer", "Lcom/intellij/psi/PsiFile;", "findAllReferences", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/FileReferences;", "project", "Lcom/intellij/openapi/project/Project;", "element", "referenceScope", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/ReferenceScope;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;Lcom/intellij/ml/llm/matterhorn/ej/core/utils/ReferenceScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
@SourceDebugExtension({"SMAP\nPsiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PsiUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/core/utils/PsiUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,38:1\n774#2:39\n865#2,2:40\n1485#2:42\n1510#2,3:43\n1513#2,3:53\n1557#2:59\n1628#2,3:60\n381#3,7:46\n126#4:56\n153#4,2:57\n155#4:63\n*S KotlinDebug\n*F\n+ 1 PsiUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/core/utils/PsiUtilsKt\n*L\n34#1:39\n34#1:40,2\n35#1:42\n35#1:43,3\n35#1:53,3\n36#1:59\n36#1:60,3\n35#1:46,7\n36#1:56\n36#1:57,2\n36#1:63\n*E\n"})
public final class PsiUtilsKt {
  @Nullable
  public static final Object findAllReferences(@NotNull Project project, @NotNull PsiElement element, @NotNull ReferenceScope referenceScope, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: aload_0
    //   3: aload_1
    //   4: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/utils/ReferenceScope;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;)Lkotlin/jvm/functions/Function0;
    //   9: aload_3
    //   10: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   13: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #28	-> 0
    //   #37	-> 13
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	14	0	project	Lcom/intellij/openapi/project/Project;
    //   0	14	1	element	Lcom/intellij/psi/PsiElement;
    //   0	14	2	referenceScope	Lcom/intellij/ml/llm/matterhorn/ej/core/utils/ReferenceScope;
    //   0	14	3	$completion	Lkotlin/coroutines/Continuation;
  }
  
  private static final List findAllReferences$lambda$4(ReferenceScope $referenceScope, Project $project, PsiElement $element) {
    // Byte code:
    //   0: aload_0
    //   1: getstatic com/intellij/ml/llm/matterhorn/ej/core/utils/PsiUtilsKt$WhenMappings.$EnumSwitchMapping$0 : [I
    //   4: swap
    //   5: invokevirtual ordinal : ()I
    //   8: iaload
    //   9: tableswitch default -> 46, 1 -> 32, 2 -> 39
    //   32: aload_1
    //   33: invokestatic projectScope : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/search/GlobalSearchScope;
    //   36: goto -> 54
    //   39: aload_1
    //   40: invokestatic allScope : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/search/GlobalSearchScope;
    //   43: goto -> 54
    //   46: new kotlin/NoWhenBranchMatchedException
    //   49: dup
    //   50: invokespecial <init> : ()V
    //   53: athrow
    //   54: astore #4
    //   56: aload #4
    //   58: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   61: aload #4
    //   63: astore_3
    //   64: aload_2
    //   65: aload_3
    //   66: checkcast com/intellij/psi/search/SearchScope
    //   69: invokestatic search : (Lcom/intellij/psi/PsiElement;Lcom/intellij/psi/search/SearchScope;)Lcom/intellij/util/Query;
    //   72: invokeinterface findAll : ()Ljava/util/Collection;
    //   77: dup
    //   78: ldc 'findAll(...)'
    //   80: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   83: astore #4
    //   85: aload #4
    //   87: checkcast java/lang/Iterable
    //   90: astore #5
    //   92: iconst_0
    //   93: istore #6
    //   95: aload #5
    //   97: astore #7
    //   99: new java/util/ArrayList
    //   102: dup
    //   103: invokespecial <init> : ()V
    //   106: checkcast java/util/Collection
    //   109: astore #8
    //   111: iconst_0
    //   112: istore #9
    //   114: aload #7
    //   116: invokeinterface iterator : ()Ljava/util/Iterator;
    //   121: astore #10
    //   123: aload #10
    //   125: invokeinterface hasNext : ()Z
    //   130: ifeq -> 188
    //   133: aload #10
    //   135: invokeinterface next : ()Ljava/lang/Object;
    //   140: astore #11
    //   142: aload #11
    //   144: checkcast com/intellij/psi/PsiReference
    //   147: astore #12
    //   149: iconst_0
    //   150: istore #13
    //   152: aload #12
    //   154: invokeinterface getElement : ()Lcom/intellij/psi/PsiElement;
    //   159: invokeinterface getContainingFile : ()Lcom/intellij/psi/PsiFile;
    //   164: ifnull -> 171
    //   167: iconst_1
    //   168: goto -> 172
    //   171: iconst_0
    //   172: ifeq -> 123
    //   175: aload #8
    //   177: aload #11
    //   179: invokeinterface add : (Ljava/lang/Object;)Z
    //   184: pop
    //   185: goto -> 123
    //   188: aload #8
    //   190: checkcast java/util/List
    //   193: nop
    //   194: checkcast java/lang/Iterable
    //   197: astore #5
    //   199: nop
    //   200: iconst_0
    //   201: istore #6
    //   203: aload #5
    //   205: astore #7
    //   207: new java/util/LinkedHashMap
    //   210: dup
    //   211: invokespecial <init> : ()V
    //   214: checkcast java/util/Map
    //   217: astore #8
    //   219: iconst_0
    //   220: istore #9
    //   222: aload #7
    //   224: invokeinterface iterator : ()Ljava/util/Iterator;
    //   229: astore #10
    //   231: aload #10
    //   233: invokeinterface hasNext : ()Z
    //   238: ifeq -> 350
    //   241: aload #10
    //   243: invokeinterface next : ()Ljava/lang/Object;
    //   248: astore #11
    //   250: aload #11
    //   252: checkcast com/intellij/psi/PsiReference
    //   255: astore #12
    //   257: iconst_0
    //   258: istore #13
    //   260: aload #12
    //   262: invokeinterface getElement : ()Lcom/intellij/psi/PsiElement;
    //   267: invokeinterface getContainingFile : ()Lcom/intellij/psi/PsiFile;
    //   272: astore #14
    //   274: aload #8
    //   276: astore #15
    //   278: iconst_0
    //   279: istore #16
    //   281: aload #15
    //   283: aload #14
    //   285: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   290: astore #17
    //   292: aload #17
    //   294: ifnonnull -> 329
    //   297: iconst_0
    //   298: istore #18
    //   300: new java/util/ArrayList
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: checkcast java/util/List
    //   310: astore #18
    //   312: aload #15
    //   314: aload #14
    //   316: aload #18
    //   318: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   323: pop
    //   324: aload #18
    //   326: goto -> 331
    //   329: aload #17
    //   331: nop
    //   332: checkcast java/util/List
    //   335: astore #12
    //   337: aload #12
    //   339: aload #11
    //   341: invokeinterface add : (Ljava/lang/Object;)Z
    //   346: pop
    //   347: goto -> 231
    //   350: aload #8
    //   352: nop
    //   353: astore #5
    //   355: nop
    //   356: iconst_0
    //   357: istore #6
    //   359: aload #5
    //   361: astore #7
    //   363: new java/util/ArrayList
    //   366: dup
    //   367: aload #5
    //   369: invokeinterface size : ()I
    //   374: invokespecial <init> : (I)V
    //   377: checkcast java/util/Collection
    //   380: astore #8
    //   382: iconst_0
    //   383: istore #9
    //   385: aload #7
    //   387: invokeinterface entrySet : ()Ljava/util/Set;
    //   392: invokeinterface iterator : ()Ljava/util/Iterator;
    //   397: astore #10
    //   399: aload #10
    //   401: invokeinterface hasNext : ()Z
    //   406: ifeq -> 594
    //   409: aload #10
    //   411: invokeinterface next : ()Ljava/lang/Object;
    //   416: checkcast java/util/Map$Entry
    //   419: astore #11
    //   421: aload #8
    //   423: aload #11
    //   425: astore #12
    //   427: astore #27
    //   429: iconst_0
    //   430: istore #13
    //   432: aload #12
    //   434: invokeinterface getKey : ()Ljava/lang/Object;
    //   439: dup
    //   440: ldc '<get-key>(...)'
    //   442: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   445: checkcast com/intellij/psi/PsiFile
    //   448: aload #12
    //   450: invokeinterface getValue : ()Ljava/lang/Object;
    //   455: checkcast java/lang/Iterable
    //   458: astore #14
    //   460: astore #15
    //   462: iconst_0
    //   463: istore #18
    //   465: aload #14
    //   467: astore #19
    //   469: new java/util/ArrayList
    //   472: dup
    //   473: aload #14
    //   475: bipush #10
    //   477: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   480: invokespecial <init> : (I)V
    //   483: checkcast java/util/Collection
    //   486: astore #20
    //   488: iconst_0
    //   489: istore #21
    //   491: aload #19
    //   493: invokeinterface iterator : ()Ljava/util/Iterator;
    //   498: astore #22
    //   500: aload #22
    //   502: invokeinterface hasNext : ()Z
    //   507: ifeq -> 558
    //   510: aload #22
    //   512: invokeinterface next : ()Ljava/lang/Object;
    //   517: astore #23
    //   519: aload #20
    //   521: aload #23
    //   523: checkcast com/intellij/psi/PsiReference
    //   526: astore #24
    //   528: astore #25
    //   530: iconst_0
    //   531: istore #26
    //   533: aload #24
    //   535: invokeinterface getElement : ()Lcom/intellij/psi/PsiElement;
    //   540: dup
    //   541: ldc 'getElement(...)'
    //   543: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   546: aload #25
    //   548: swap
    //   549: invokeinterface add : (Ljava/lang/Object;)Z
    //   554: pop
    //   555: goto -> 500
    //   558: aload #20
    //   560: checkcast java/util/List
    //   563: nop
    //   564: aload #15
    //   566: swap
    //   567: astore #28
    //   569: astore #29
    //   571: new com/intellij/ml/llm/matterhorn/ej/core/utils/FileReferences
    //   574: dup
    //   575: aload #29
    //   577: aload #28
    //   579: invokespecial <init> : (Lcom/intellij/psi/PsiFile;Ljava/util/List;)V
    //   582: aload #27
    //   584: swap
    //   585: invokeinterface add : (Ljava/lang/Object;)Z
    //   590: pop
    //   591: goto -> 399
    //   594: aload #8
    //   596: checkcast java/util/List
    //   599: nop
    //   600: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #29	-> 0
    //   #30	-> 32
    //   #31	-> 39
    //   #29	-> 46
    //   #33	-> 64
    //   #34	-> 85
    //   #39	-> 95
    //   #40	-> 114
    //   #34	-> 152
    //   #40	-> 172
    //   #41	-> 188
    //   #39	-> 193
    //   #35	-> 199
    //   #42	-> 203
    //   #43	-> 222
    //   #44	-> 250
    //   #35	-> 260
    //   #44	-> 272
    //   #45	-> 274
    //   #46	-> 281
    //   #47	-> 292
    //   #48	-> 297
    //   #45	-> 300
    //   #48	-> 310
    //   #49	-> 312
    //   #50	-> 324
    //   #52	-> 329
    //   #47	-> 331
    //   #45	-> 332
    //   #53	-> 337
    //   #55	-> 350
    //   #42	-> 352
    //   #36	-> 355
    //   #56	-> 359
    //   #57	-> 385
    //   #57	-> 397
    //   #58	-> 421
    //   #36	-> 432
    //   #59	-> 465
    //   #60	-> 491
    //   #61	-> 519
    //   #36	-> 533
    //   #61	-> 549
    //   #62	-> 558
    //   #59	-> 563
    //   #36	-> 567
    //   #58	-> 585
    //   #63	-> 594
    //   #56	-> 599
    //   #36	-> 600
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   152	20	13	$i$a$-filter-PsiUtilsKt$findAllReferences$2$1	I
    //   149	23	12	it	Lcom/intellij/psi/PsiReference;
    //   142	43	11	element$iv$iv	Ljava/lang/Object;
    //   114	76	9	$i$f$filterTo	I
    //   111	79	7	$this$filterTo$iv$iv	Ljava/lang/Iterable;
    //   111	79	8	destination$iv$iv	Ljava/util/Collection;
    //   95	99	6	$i$f$filter	I
    //   92	102	5	$this$filter$iv	Ljava/lang/Iterable;
    //   260	12	13	$i$a$-groupBy-PsiUtilsKt$findAllReferences$2$2	I
    //   257	15	12	it	Lcom/intellij/psi/PsiReference;
    //   300	10	18	$i$a$-getOrPut-CollectionsKt___CollectionsKt$groupByTo$list$1$iv$iv	I
    //   312	14	18	answer$iv$iv$iv	Ljava/lang/Object;
    //   281	51	16	$i$f$getOrPut	I
    //   292	40	17	value$iv$iv$iv	Ljava/lang/Object;
    //   278	54	15	$this$getOrPut$iv$iv$iv	Ljava/util/Map;
    //   274	73	14	key$iv$iv	Ljava/lang/Object;
    //   337	10	12	list$iv$iv	Ljava/util/List;
    //   250	97	11	element$iv$iv	Ljava/lang/Object;
    //   222	130	9	$i$f$groupByTo	I
    //   219	133	7	$this$groupByTo$iv$iv	Ljava/lang/Iterable;
    //   219	133	8	destination$iv$iv	Ljava/util/Map;
    //   203	150	6	$i$f$groupBy	I
    //   200	153	5	$this$groupBy$iv	Ljava/lang/Iterable;
    //   533	13	26	$i$a$-map-PsiUtilsKt$findAllReferences$2$3$1	I
    //   530	16	24	it	Lcom/intellij/psi/PsiReference;
    //   519	36	23	item$iv$iv	Ljava/lang/Object;
    //   491	69	21	$i$f$mapTo	I
    //   488	72	19	$this$mapTo$iv$iv	Ljava/lang/Iterable;
    //   488	72	20	destination$iv$iv	Ljava/util/Collection;
    //   465	99	18	$i$f$map	I
    //   462	102	14	$this$map$iv	Ljava/lang/Iterable;
    //   432	150	13	$i$a$-map-PsiUtilsKt$findAllReferences$2$3	I
    //   429	153	12	it	Ljava/util/Map$Entry;
    //   421	170	11	item$iv$iv	Ljava/util/Map$Entry;
    //   385	211	9	$i$f$mapTo	I
    //   382	214	7	$this$mapTo$iv$iv	Ljava/util/Map;
    //   382	214	8	destination$iv$iv	Ljava/util/Collection;
    //   359	241	6	$i$f$map	I
    //   356	244	5	$this$map$iv	Ljava/util/Map;
    //   64	537	3	searchScope	Lcom/intellij/psi/search/GlobalSearchScope;
    //   85	516	4	references	Ljava/util/Collection;
    //   0	601	0	$referenceScope	Lcom/intellij/ml/llm/matterhorn/ej/core/utils/ReferenceScope;
    //   0	601	1	$project	Lcom/intellij/openapi/project/Project;
    //   0	601	2	$element	Lcom/intellij/psi/PsiElement;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\cor\\utils\PsiUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */