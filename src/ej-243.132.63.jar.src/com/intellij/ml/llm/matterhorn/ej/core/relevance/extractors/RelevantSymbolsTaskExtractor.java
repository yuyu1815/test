/*     */ package com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.ProjectSearchAllService;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.ProjectSearchEverywhereService;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.SmartPsiElementPointer;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000d\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020$\n\002\030\002\n\002\020\"\n\002\020\016\n\000\n\002\020\t\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\013\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\030\000 #2\0020\001:\002#$B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J \020\b\032\024\022\020\022\016\022\006\b\001\022\0020\0130\nj\002`\f0\tH@¢\006\002\020\rJ\036\020\016\032\024\022\004\022\0020\020\022\n\022\b\022\004\022\0020\0220\0210\017*\0020\022H\002J\b\020\023\032\0020\024H\002JJ\020\025\032\024\022\020\022\016\022\006\b\001\022\0020\0130\nj\002`\f0\0212\006\020\026\032\0020\0272\030\020\030\032\024\022\004\022\0020\020\022\n\022\b\022\004\022\0020\0220\0210\0172\006\020\031\032\0020\032H@¢\006\002\020\033J\f\020\034\032\0020\035*\0020\036H\002J\030\020\037\032\0020\0222\006\020 \032\0020!2\006\020\"\032\0020\022H\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;", "", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;)V", "getContext", "()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;", "extract", "", "Lcom/intellij/psi/SmartPsiElementPointer;", "Lcom/intellij/psi/PsiElement;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/PsiElementPointer;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extractAnswers", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$ElementType;", "", "", "getSearchTimeout", "", "searchForRelevantSymbols", "project", "Lcom/intellij/openapi/project/Project;", "targetElement", "maxNumSearchFound", "", "(Lcom/intellij/openapi/project/Project;Ljava/util/Map;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSuitable", "", "Lcom/intellij/openapi/vfs/VirtualFile;", "getTaskSymbolsExtractorPrompt", "issue", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "repoName", "Companion", "ElementType", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nRelevantSymbolsTaskExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelevantSymbolsTaskExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1557#2:220\n1628#2,3:221\n1368#2:224\n1454#2,5:225\n1498#2:230\n1528#2,3:231\n1531#2,3:241\n1246#2,4:246\n1863#2:250\n1557#2:251\n1628#2,3:252\n774#2:255\n865#2,2:256\n1864#2:258\n1611#2,9:263\n1863#2:272\n1864#2:274\n1620#2:275\n381#3,7:234\n462#3:244\n412#3:245\n31#4,2:259\n31#4,2:261\n1#5:273\n*S KotlinDebug\n*F\n+ 1 RelevantSymbolsTaskExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor\n*L\n60#1:220\n60#1:221,3\n61#1:224\n61#1:225,5\n62#1:230\n62#1:231,3\n62#1:241,3\n63#1:246,4\n83#1:250\n85#1:251\n85#1:252,3\n85#1:255\n85#1:256,2\n83#1:258\n70#1:263,9\n70#1:272\n70#1:274\n70#1:275\n62#1:234,7\n63#1:244\n63#1:245\n105#1:259,2\n106#1:261,2\n70#1:273\n*E\n"})
/*     */ public final class RelevantSymbolsTaskExtractor {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   
/*  27 */   public RelevantSymbolsTaskExtractor(@NotNull RelevantSymbolsExtractorContext context) { this.context = context; } @NotNull private final RelevantSymbolsExtractorContext context; public static final long RELEVANT_SEARCH_TIMEOUT_MS = 60000L; @NotNull public final RelevantSymbolsExtractorContext getContext() { return this.context; }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\t\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$Companion;", "", "<init>", "()V", "RELEVANT_SEARCH_TIMEOUT_MS", "", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {} }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\t\b\002\030\0002\b\022\004\022\0020\0000\001B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$ElementType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FILE", "CLASS", "METHOD", "OTHER", "ej-core"})
/*  34 */   public enum ElementType { FILE("files"),
/*  35 */     CLASS("classes"),
/*  36 */     METHOD("methods"),
/*  37 */     OTHER("other"); @NotNull private final String value; ElementType(String value) { this.value = value; } @NotNull public final String getValue() { return this.value; }
/*  38 */     @NotNull public static EnumEntries<ElementType> getEntries() { return $ENTRIES; } }
/*     */    @Nullable
/*     */   public final Object extract(@NotNull Continuation $completion) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$extract$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$extract$1
/*     */     //   11: astore #29
/*     */     //   13: aload #29
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #29
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$extract$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #29
/*     */     //   50: aload #29
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #28
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #30
/*     */     //   62: aload #29
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 1185, 0 -> 100, 1 -> 268, 2 -> 916, 3 -> 1034, 4 -> 1164
/*     */     //   100: aload #28
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: aload_0
/*     */     //   106: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   109: invokevirtual getContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   112: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   115: astore_2
/*     */     //   116: invokestatic currentTimeMillis : ()J
/*     */     //   119: lstore_3
/*     */     //   120: aload_2
/*     */     //   121: invokestatic guessProjectDir : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   124: dup
/*     */     //   125: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   128: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   131: dup
/*     */     //   132: ldc 'getName(...)'
/*     */     //   134: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   137: astore #5
/*     */     //   139: aload_0
/*     */     //   140: aload_0
/*     */     //   141: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   144: invokevirtual getIssue : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   147: aload #5
/*     */     //   149: invokespecial getTaskSymbolsExtractorPrompt : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   152: astore #6
/*     */     //   154: new com/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest
/*     */     //   157: dup
/*     */     //   158: ldc 'SETTING: Your role is a coding assistant. You should help to solve the issue, described below.'
/*     */     //   160: aload #6
/*     */     //   162: invokestatic toUserMessage : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   165: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   168: aload_0
/*     */     //   169: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   172: invokevirtual getParameters : ()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   175: invokevirtual getModelParameters : ()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   178: aload_0
/*     */     //   179: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   182: invokevirtual getParameters : ()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   185: invokevirtual getNumResponseTaskExtraction : ()I
/*     */     //   188: aconst_null
/*     */     //   189: new com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$extract$request$1
/*     */     //   192: dup
/*     */     //   193: aconst_null
/*     */     //   194: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   197: checkcast kotlin/jvm/functions/Function3
/*     */     //   200: bipush #16
/*     */     //   202: aconst_null
/*     */     //   203: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ILjava/util/List;Lkotlin/jvm/functions/Function3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   206: astore #7
/*     */     //   208: aload_0
/*     */     //   209: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   212: invokevirtual getContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   215: aload #7
/*     */     //   217: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
/*     */     //   220: iconst_0
/*     */     //   221: aload #29
/*     */     //   223: iconst_2
/*     */     //   224: aconst_null
/*     */     //   225: aload #29
/*     */     //   227: aload_0
/*     */     //   228: putfield L$0 : Ljava/lang/Object;
/*     */     //   231: aload #29
/*     */     //   233: aload_2
/*     */     //   234: putfield L$1 : Ljava/lang/Object;
/*     */     //   237: aload #29
/*     */     //   239: aload #6
/*     */     //   241: putfield L$2 : Ljava/lang/Object;
/*     */     //   244: aload #29
/*     */     //   246: lload_3
/*     */     //   247: putfield J$0 : J
/*     */     //   250: aload #29
/*     */     //   252: iconst_1
/*     */     //   253: putfield label : I
/*     */     //   256: invokestatic sendToGrazie$default : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   259: dup
/*     */     //   260: aload #30
/*     */     //   262: if_acmpne -> 309
/*     */     //   265: aload #30
/*     */     //   267: areturn
/*     */     //   268: aload #29
/*     */     //   270: getfield J$0 : J
/*     */     //   273: lstore_3
/*     */     //   274: aload #29
/*     */     //   276: getfield L$2 : Ljava/lang/Object;
/*     */     //   279: checkcast java/lang/String
/*     */     //   282: astore #6
/*     */     //   284: aload #29
/*     */     //   286: getfield L$1 : Ljava/lang/Object;
/*     */     //   289: checkcast com/intellij/openapi/project/Project
/*     */     //   292: astore_2
/*     */     //   293: aload #29
/*     */     //   295: getfield L$0 : Ljava/lang/Object;
/*     */     //   298: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor
/*     */     //   301: astore_0
/*     */     //   302: aload #28
/*     */     //   304: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   307: aload #28
/*     */     //   309: checkcast java/lang/String
/*     */     //   312: astore #8
/*     */     //   314: aload #8
/*     */     //   316: invokestatic splitMultipleResponse : (Ljava/lang/String;)Ljava/util/List;
/*     */     //   319: checkcast java/lang/Iterable
/*     */     //   322: astore #10
/*     */     //   324: iconst_0
/*     */     //   325: istore #11
/*     */     //   327: aload #10
/*     */     //   329: astore #12
/*     */     //   331: new java/util/ArrayList
/*     */     //   334: dup
/*     */     //   335: aload #10
/*     */     //   337: bipush #10
/*     */     //   339: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   342: invokespecial <init> : (I)V
/*     */     //   345: checkcast java/util/Collection
/*     */     //   348: astore #13
/*     */     //   350: iconst_0
/*     */     //   351: istore #14
/*     */     //   353: aload #12
/*     */     //   355: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   360: astore #15
/*     */     //   362: aload #15
/*     */     //   364: invokeinterface hasNext : ()Z
/*     */     //   369: ifeq -> 413
/*     */     //   372: aload #15
/*     */     //   374: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   379: astore #16
/*     */     //   381: aload #13
/*     */     //   383: aload #16
/*     */     //   385: checkcast java/lang/String
/*     */     //   388: astore #17
/*     */     //   390: astore #25
/*     */     //   392: iconst_0
/*     */     //   393: istore #18
/*     */     //   395: aload_0
/*     */     //   396: aload #17
/*     */     //   398: invokespecial extractAnswers : (Ljava/lang/String;)Ljava/util/Map;
/*     */     //   401: aload #25
/*     */     //   403: swap
/*     */     //   404: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   409: pop
/*     */     //   410: goto -> 362
/*     */     //   413: aload #13
/*     */     //   415: checkcast java/util/List
/*     */     //   418: nop
/*     */     //   419: checkcast java/lang/Iterable
/*     */     //   422: astore #10
/*     */     //   424: iconst_0
/*     */     //   425: istore #11
/*     */     //   427: aload #10
/*     */     //   429: astore #12
/*     */     //   431: new java/util/ArrayList
/*     */     //   434: dup
/*     */     //   435: invokespecial <init> : ()V
/*     */     //   438: checkcast java/util/Collection
/*     */     //   441: astore #13
/*     */     //   443: iconst_0
/*     */     //   444: istore #14
/*     */     //   446: aload #12
/*     */     //   448: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   453: astore #15
/*     */     //   455: aload #15
/*     */     //   457: invokeinterface hasNext : ()Z
/*     */     //   462: ifeq -> 507
/*     */     //   465: aload #15
/*     */     //   467: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   472: astore #16
/*     */     //   474: aload #16
/*     */     //   476: checkcast java/util/Map
/*     */     //   479: astore #17
/*     */     //   481: iconst_0
/*     */     //   482: istore #18
/*     */     //   484: aload #17
/*     */     //   486: invokeinterface entrySet : ()Ljava/util/Set;
/*     */     //   491: checkcast java/lang/Iterable
/*     */     //   494: astore #17
/*     */     //   496: aload #13
/*     */     //   498: aload #17
/*     */     //   500: invokestatic addAll : (Ljava/util/Collection;Ljava/lang/Iterable;)Z
/*     */     //   503: pop
/*     */     //   504: goto -> 455
/*     */     //   507: aload #13
/*     */     //   509: checkcast java/util/List
/*     */     //   512: nop
/*     */     //   513: checkcast java/lang/Iterable
/*     */     //   516: astore #10
/*     */     //   518: iconst_0
/*     */     //   519: istore #11
/*     */     //   521: aload #10
/*     */     //   523: astore #12
/*     */     //   525: new java/util/LinkedHashMap
/*     */     //   528: dup
/*     */     //   529: invokespecial <init> : ()V
/*     */     //   532: checkcast java/util/Map
/*     */     //   535: astore #13
/*     */     //   537: iconst_0
/*     */     //   538: istore #14
/*     */     //   540: aload #12
/*     */     //   542: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   547: astore #15
/*     */     //   549: aload #15
/*     */     //   551: invokeinterface hasNext : ()Z
/*     */     //   556: ifeq -> 689
/*     */     //   559: aload #15
/*     */     //   561: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   566: astore #16
/*     */     //   568: aload #16
/*     */     //   570: checkcast java/util/Map$Entry
/*     */     //   573: astore #17
/*     */     //   575: iconst_0
/*     */     //   576: istore #18
/*     */     //   578: aload #17
/*     */     //   580: invokeinterface getKey : ()Ljava/lang/Object;
/*     */     //   585: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$ElementType
/*     */     //   588: astore #19
/*     */     //   590: aload #13
/*     */     //   592: astore #20
/*     */     //   594: iconst_0
/*     */     //   595: istore #21
/*     */     //   597: aload #20
/*     */     //   599: aload #19
/*     */     //   601: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   606: astore #22
/*     */     //   608: aload #22
/*     */     //   610: ifnonnull -> 645
/*     */     //   613: iconst_0
/*     */     //   614: istore #23
/*     */     //   616: new java/util/ArrayList
/*     */     //   619: dup
/*     */     //   620: invokespecial <init> : ()V
/*     */     //   623: checkcast java/util/List
/*     */     //   626: astore #23
/*     */     //   628: aload #20
/*     */     //   630: aload #19
/*     */     //   632: aload #23
/*     */     //   634: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   639: pop
/*     */     //   640: aload #23
/*     */     //   642: goto -> 647
/*     */     //   645: aload #22
/*     */     //   647: nop
/*     */     //   648: checkcast java/util/List
/*     */     //   651: astore #17
/*     */     //   653: aload #17
/*     */     //   655: aload #16
/*     */     //   657: checkcast java/util/Map$Entry
/*     */     //   660: astore #18
/*     */     //   662: astore #25
/*     */     //   664: iconst_0
/*     */     //   665: istore #24
/*     */     //   667: aload #18
/*     */     //   669: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   674: checkcast java/util/Set
/*     */     //   677: aload #25
/*     */     //   679: swap
/*     */     //   680: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   685: pop
/*     */     //   686: goto -> 549
/*     */     //   689: aload #13
/*     */     //   691: nop
/*     */     //   692: astore #10
/*     */     //   694: iconst_0
/*     */     //   695: istore #11
/*     */     //   697: aload #10
/*     */     //   699: astore #12
/*     */     //   701: new java/util/LinkedHashMap
/*     */     //   704: dup
/*     */     //   705: aload #10
/*     */     //   707: invokeinterface size : ()I
/*     */     //   712: invokestatic mapCapacity : (I)I
/*     */     //   715: invokespecial <init> : (I)V
/*     */     //   718: checkcast java/util/Map
/*     */     //   721: astore #13
/*     */     //   723: iconst_0
/*     */     //   724: istore #14
/*     */     //   726: aload #12
/*     */     //   728: invokeinterface entrySet : ()Ljava/util/Set;
/*     */     //   733: checkcast java/lang/Iterable
/*     */     //   736: astore #15
/*     */     //   738: iconst_0
/*     */     //   739: istore #16
/*     */     //   741: aload #15
/*     */     //   743: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   748: astore #17
/*     */     //   750: aload #17
/*     */     //   752: invokeinterface hasNext : ()Z
/*     */     //   757: ifeq -> 850
/*     */     //   760: aload #17
/*     */     //   762: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   767: astore #18
/*     */     //   769: aload #13
/*     */     //   771: aload #18
/*     */     //   773: checkcast java/util/Map$Entry
/*     */     //   776: astore #19
/*     */     //   778: astore #20
/*     */     //   780: iconst_0
/*     */     //   781: istore #21
/*     */     //   783: aload #19
/*     */     //   785: invokeinterface getKey : ()Ljava/lang/Object;
/*     */     //   790: aload #20
/*     */     //   792: swap
/*     */     //   793: aload #18
/*     */     //   795: checkcast java/util/Map$Entry
/*     */     //   798: astore #22
/*     */     //   800: astore #26
/*     */     //   802: astore #25
/*     */     //   804: iconst_0
/*     */     //   805: istore #23
/*     */     //   807: aload #22
/*     */     //   809: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   814: checkcast java/util/List
/*     */     //   817: astore #24
/*     */     //   819: aload #24
/*     */     //   821: checkcast java/lang/Iterable
/*     */     //   824: invokestatic flatten : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   827: checkcast java/lang/Iterable
/*     */     //   830: invokestatic toSet : (Ljava/lang/Iterable;)Ljava/util/Set;
/*     */     //   833: astore #27
/*     */     //   835: aload #25
/*     */     //   837: aload #26
/*     */     //   839: aload #27
/*     */     //   841: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   846: pop
/*     */     //   847: goto -> 750
/*     */     //   850: aload #13
/*     */     //   852: nop
/*     */     //   853: nop
/*     */     //   854: astore #9
/*     */     //   856: aload_0
/*     */     //   857: aload_2
/*     */     //   858: aload #9
/*     */     //   860: aload_0
/*     */     //   861: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   864: invokevirtual getParameters : ()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   867: invokevirtual getMaxNumSearchFoundTaskExtraction : ()I
/*     */     //   870: aload #29
/*     */     //   872: aload #29
/*     */     //   874: aload_0
/*     */     //   875: putfield L$0 : Ljava/lang/Object;
/*     */     //   878: aload #29
/*     */     //   880: aload #6
/*     */     //   882: putfield L$1 : Ljava/lang/Object;
/*     */     //   885: aload #29
/*     */     //   887: aload #8
/*     */     //   889: putfield L$2 : Ljava/lang/Object;
/*     */     //   892: aload #29
/*     */     //   894: lload_3
/*     */     //   895: putfield J$0 : J
/*     */     //   898: aload #29
/*     */     //   900: iconst_2
/*     */     //   901: putfield label : I
/*     */     //   904: invokespecial searchForRelevantSymbols : (Lcom/intellij/openapi/project/Project;Ljava/util/Map;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   907: dup
/*     */     //   908: aload #30
/*     */     //   910: if_acmpne -> 958
/*     */     //   913: aload #30
/*     */     //   915: areturn
/*     */     //   916: aload #29
/*     */     //   918: getfield J$0 : J
/*     */     //   921: lstore_3
/*     */     //   922: aload #29
/*     */     //   924: getfield L$2 : Ljava/lang/Object;
/*     */     //   927: checkcast java/lang/String
/*     */     //   930: astore #8
/*     */     //   932: aload #29
/*     */     //   934: getfield L$1 : Ljava/lang/Object;
/*     */     //   937: checkcast java/lang/String
/*     */     //   940: astore #6
/*     */     //   942: aload #29
/*     */     //   944: getfield L$0 : Ljava/lang/Object;
/*     */     //   947: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor
/*     */     //   950: astore_0
/*     */     //   951: aload #28
/*     */     //   953: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   956: aload #28
/*     */     //   958: checkcast java/lang/Iterable
/*     */     //   961: invokestatic distinct : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   964: astore #10
/*     */     //   966: invokestatic currentTimeMillis : ()J
/*     */     //   969: lload_3
/*     */     //   970: lsub
/*     */     //   971: lstore #11
/*     */     //   973: aload #10
/*     */     //   975: <illegal opcode> invoke : (Ljava/util/List;)Lkotlin/jvm/functions/Function0;
/*     */     //   980: aload #29
/*     */     //   982: aload #29
/*     */     //   984: aload_0
/*     */     //   985: putfield L$0 : Ljava/lang/Object;
/*     */     //   988: aload #29
/*     */     //   990: aload #6
/*     */     //   992: putfield L$1 : Ljava/lang/Object;
/*     */     //   995: aload #29
/*     */     //   997: aload #8
/*     */     //   999: putfield L$2 : Ljava/lang/Object;
/*     */     //   1002: aload #29
/*     */     //   1004: aload #10
/*     */     //   1006: putfield L$3 : Ljava/lang/Object;
/*     */     //   1009: aload #29
/*     */     //   1011: lload #11
/*     */     //   1013: putfield J$0 : J
/*     */     //   1016: aload #29
/*     */     //   1018: iconst_3
/*     */     //   1019: putfield label : I
/*     */     //   1022: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1025: dup
/*     */     //   1026: aload #30
/*     */     //   1028: if_acmpne -> 1087
/*     */     //   1031: aload #30
/*     */     //   1033: areturn
/*     */     //   1034: aload #29
/*     */     //   1036: getfield J$0 : J
/*     */     //   1039: lstore #11
/*     */     //   1041: aload #29
/*     */     //   1043: getfield L$3 : Ljava/lang/Object;
/*     */     //   1046: checkcast java/util/List
/*     */     //   1049: astore #10
/*     */     //   1051: aload #29
/*     */     //   1053: getfield L$2 : Ljava/lang/Object;
/*     */     //   1056: checkcast java/lang/String
/*     */     //   1059: astore #8
/*     */     //   1061: aload #29
/*     */     //   1063: getfield L$1 : Ljava/lang/Object;
/*     */     //   1066: checkcast java/lang/String
/*     */     //   1069: astore #6
/*     */     //   1071: aload #29
/*     */     //   1073: getfield L$0 : Ljava/lang/Object;
/*     */     //   1076: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor
/*     */     //   1079: astore_0
/*     */     //   1080: aload #28
/*     */     //   1082: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1085: aload #28
/*     */     //   1087: checkcast java/lang/String
/*     */     //   1090: astore #13
/*     */     //   1092: aload_0
/*     */     //   1093: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   1096: invokevirtual getContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1099: ldc_w 'repomap_TaskExtraction'
/*     */     //   1102: aload_0
/*     */     //   1103: getfield context : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   1106: invokevirtual getParameters : ()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   1109: ldc 'SETTING: Your role is a coding assistant. You should help to solve the issue, described below.'
/*     */     //   1111: aload #6
/*     */     //   1113: aload #8
/*     */     //   1115: aload #13
/*     */     //   1117: lload #11
/*     */     //   1119: aload #29
/*     */     //   1121: aload #29
/*     */     //   1123: aload #10
/*     */     //   1125: putfield L$0 : Ljava/lang/Object;
/*     */     //   1128: aload #29
/*     */     //   1130: aconst_null
/*     */     //   1131: putfield L$1 : Ljava/lang/Object;
/*     */     //   1134: aload #29
/*     */     //   1136: aconst_null
/*     */     //   1137: putfield L$2 : Ljava/lang/Object;
/*     */     //   1140: aload #29
/*     */     //   1142: aconst_null
/*     */     //   1143: putfield L$3 : Ljava/lang/Object;
/*     */     //   1146: aload #29
/*     */     //   1148: iconst_4
/*     */     //   1149: putfield label : I
/*     */     //   1152: invokestatic logTrajectories : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1155: dup
/*     */     //   1156: aload #30
/*     */     //   1158: if_acmpne -> 1181
/*     */     //   1161: aload #30
/*     */     //   1163: areturn
/*     */     //   1164: aload #29
/*     */     //   1166: getfield L$0 : Ljava/lang/Object;
/*     */     //   1169: checkcast java/util/List
/*     */     //   1172: astore #10
/*     */     //   1174: aload #28
/*     */     //   1176: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1179: aload #28
/*     */     //   1181: pop
/*     */     //   1182: aload #10
/*     */     //   1184: areturn
/*     */     //   1185: new java/lang/IllegalStateException
/*     */     //   1188: dup
/*     */     //   1189: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1192: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1195: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #40	-> 60
/*     */     //   #41	-> 105
/*     */     //   #43	-> 116
/*     */     //   #44	-> 120
/*     */     //   #45	-> 139
/*     */     //   #46	-> 140
/*     */     //   #47	-> 147
/*     */     //   #45	-> 149
/*     */     //   #49	-> 154
/*     */     //   #50	-> 158
/*     */     //   #51	-> 160
/*     */     //   #52	-> 168
/*     */     //   #53	-> 178
/*     */     //   #49	-> 188
/*     */     //   #57	-> 208
/*     */     //   #40	-> 265
/*     */     //   #59	-> 314
/*     */     //   #60	-> 324
/*     */     //   #220	-> 327
/*     */     //   #221	-> 353
/*     */     //   #222	-> 381
/*     */     //   #60	-> 395
/*     */     //   #222	-> 404
/*     */     //   #223	-> 413
/*     */     //   #220	-> 418
/*     */     //   #61	-> 424
/*     */     //   #224	-> 427
/*     */     //   #225	-> 446
/*     */     //   #226	-> 474
/*     */     //   #61	-> 484
/*     */     //   #226	-> 494
/*     */     //   #227	-> 496
/*     */     //   #229	-> 507
/*     */     //   #224	-> 512
/*     */     //   #62	-> 518
/*     */     //   #230	-> 521
/*     */     //   #231	-> 540
/*     */     //   #232	-> 568
/*     */     //   #62	-> 578
/*     */     //   #232	-> 588
/*     */     //   #233	-> 590
/*     */     //   #234	-> 597
/*     */     //   #235	-> 608
/*     */     //   #236	-> 613
/*     */     //   #233	-> 616
/*     */     //   #236	-> 626
/*     */     //   #237	-> 628
/*     */     //   #238	-> 640
/*     */     //   #240	-> 645
/*     */     //   #235	-> 647
/*     */     //   #233	-> 648
/*     */     //   #241	-> 653
/*     */     //   #62	-> 667
/*     */     //   #241	-> 680
/*     */     //   #243	-> 689
/*     */     //   #230	-> 691
/*     */     //   #63	-> 694
/*     */     //   #244	-> 697
/*     */     //   #245	-> 726
/*     */     //   #246	-> 741
/*     */     //   #247	-> 769
/*     */     //   #245	-> 783
/*     */     //   #247	-> 793
/*     */     //   #63	-> 807
/*     */     //   #63	-> 814
/*     */     //   #247	-> 841
/*     */     //   #249	-> 850
/*     */     //   #245	-> 852
/*     */     //   #244	-> 853
/*     */     //   #63	-> 854
/*     */     //   #59	-> 854
/*     */     //   #66	-> 856
/*     */     //   #40	-> 913
/*     */     //   #66	-> 958
/*     */     //   #68	-> 966
/*     */     //   #69	-> 973
/*     */     //   #40	-> 1031
/*     */     //   #73	-> 1092
/*     */     //   #74	-> 1109
/*     */     //   #73	-> 1121
/*     */     //   #40	-> 1161
/*     */     //   #76	-> 1181
/*     */     //   #40	-> 1185
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	163	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */     //   302	99	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */     //   401	18	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */     //   419	75	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */     //   494	19	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */     //   513	75	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */     //   588	89	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */     //   677	15	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */     //   692	224	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */     //   951	83	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */     //   1080	29	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */     //   116	152	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   293	108	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   401	18	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   419	75	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   494	19	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   513	75	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   588	89	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   677	15	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   692	141	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   833	21	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   854	53	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   120	148	3	startTime	J
/*     */     //   274	127	3	startTime	J
/*     */     //   401	18	3	startTime	J
/*     */     //   419	75	3	startTime	J
/*     */     //   494	19	3	startTime	J
/*     */     //   513	75	3	startTime	J
/*     */     //   588	89	3	startTime	J
/*     */     //   677	15	3	startTime	J
/*     */     //   692	224	3	startTime	J
/*     */     //   922	51	3	startTime	J
/*     */     //   139	10	5	repoName	Ljava/lang/String;
/*     */     //   154	114	6	prompt	Ljava/lang/String;
/*     */     //   284	117	6	prompt	Ljava/lang/String;
/*     */     //   401	18	6	prompt	Ljava/lang/String;
/*     */     //   419	75	6	prompt	Ljava/lang/String;
/*     */     //   494	19	6	prompt	Ljava/lang/String;
/*     */     //   513	75	6	prompt	Ljava/lang/String;
/*     */     //   588	89	6	prompt	Ljava/lang/String;
/*     */     //   677	15	6	prompt	Ljava/lang/String;
/*     */     //   692	224	6	prompt	Ljava/lang/String;
/*     */     //   942	92	6	prompt	Ljava/lang/String;
/*     */     //   1071	50	6	prompt	Ljava/lang/String;
/*     */     //   208	51	7	request	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*     */     //   314	87	8	allResponses	Ljava/lang/String;
/*     */     //   401	18	8	allResponses	Ljava/lang/String;
/*     */     //   419	75	8	allResponses	Ljava/lang/String;
/*     */     //   494	19	8	allResponses	Ljava/lang/String;
/*     */     //   513	75	8	allResponses	Ljava/lang/String;
/*     */     //   588	89	8	allResponses	Ljava/lang/String;
/*     */     //   677	15	8	allResponses	Ljava/lang/String;
/*     */     //   692	224	8	allResponses	Ljava/lang/String;
/*     */     //   932	102	8	allResponses	Ljava/lang/String;
/*     */     //   1061	60	8	allResponses	Ljava/lang/String;
/*     */     //   856	51	9	responses	Ljava/util/Map;
/*     */     //   324	26	10	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   424	19	10	$this$flatMap$iv	Ljava/lang/Iterable;
/*     */     //   518	19	10	$this$groupBy$iv	Ljava/lang/Iterable;
/*     */     //   694	29	10	$this$mapValues$iv	Ljava/util/Map;
/*     */     //   966	68	10	symbols	Ljava/util/List;
/*     */     //   1051	113	10	symbols	Ljava/util/List;
/*     */     //   1174	11	10	symbols	Ljava/util/List;
/*     */     //   973	61	11	execTime	J
/*     */     //   1041	80	11	execTime	J
/*     */     //   350	12	12	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   443	12	12	$this$flatMapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   537	12	12	$this$groupByTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   723	15	12	$this$mapValuesTo$iv$iv	Ljava/util/Map;
/*     */     //   350	65	13	destination$iv$iv	Ljava/util/Collection;
/*     */     //   443	66	13	destination$iv$iv	Ljava/util/Collection;
/*     */     //   537	51	13	destination$iv$iv	Ljava/util/Map;
/*     */     //   588	103	13	destination$iv$iv	Ljava/util/Map;
/*     */     //   723	130	13	destination$iv$iv	Ljava/util/Map;
/*     */     //   1092	29	13	response	Ljava/lang/String;
/*     */     //   738	12	15	$this$associateByTo$iv$iv$iv	Ljava/lang/Iterable;
/*     */     //   381	29	16	item$iv$iv	Ljava/lang/Object;
/*     */     //   474	30	16	element$iv$iv	Ljava/lang/Object;
/*     */     //   568	20	16	element$iv$iv	Ljava/lang/Object;
/*     */     //   588	98	16	element$iv$iv	Ljava/lang/Object;
/*     */     //   392	9	17	response	Ljava/lang/String;
/*     */     //   481	13	17	it	Ljava/util/Map;
/*     */     //   496	8	17	list$iv$iv	Ljava/lang/Iterable;
/*     */     //   575	13	17	it	Ljava/util/Map$Entry;
/*     */     //   653	33	17	list$iv$iv	Ljava/util/List;
/*     */     //   664	13	18	it	Ljava/util/Map$Entry;
/*     */     //   769	78	18	element$iv$iv$iv	Ljava/lang/Object;
/*     */     //   590	50	19	key$iv$iv	Ljava/lang/Object;
/*     */     //   780	10	19	it$iv$iv	Ljava/util/Map$Entry;
/*     */     //   594	46	20	$this$getOrPut$iv$iv$iv	Ljava/util/Map;
/*     */     //   608	5	22	value$iv$iv$iv	Ljava/lang/Object;
/*     */     //   645	2	22	value$iv$iv$iv	Ljava/lang/Object;
/*     */     //   628	14	23	answer$iv$iv$iv	Ljava/lang/Object;
/*     */     //   819	14	24	values	Ljava/util/List;
/*     */     //   395	6	18	$i$a$-map-RelevantSymbolsTaskExtractor$extract$responses$1	I
/*     */     //   353	62	14	$i$f$mapTo	I
/*     */     //   327	92	11	$i$f$map	I
/*     */     //   484	10	18	$i$a$-flatMap-RelevantSymbolsTaskExtractor$extract$responses$2	I
/*     */     //   446	63	14	$i$f$flatMapTo	I
/*     */     //   427	86	11	$i$f$flatMap	I
/*     */     //   578	10	18	$i$a$-groupBy-RelevantSymbolsTaskExtractor$extract$responses$3	I
/*     */     //   667	10	24	$i$a$-groupBy-RelevantSymbolsTaskExtractor$extract$responses$4	I
/*     */     //   616	10	23	$i$a$-getOrPut-CollectionsKt___CollectionsKt$groupByTo$list$2$iv$iv	I
/*     */     //   597	51	21	$i$f$getOrPut	I
/*     */     //   540	151	14	$i$f$groupByTo	I
/*     */     //   521	171	11	$i$f$groupBy	I
/*     */     //   807	26	23	$i$a$-mapValues-RelevantSymbolsTaskExtractor$extract$responses$5	I
/*     */     //   783	7	21	$i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv	I
/*     */     //   741	111	16	$i$f$associateByTo	I
/*     */     //   726	127	14	$i$f$mapValuesTo	I
/*     */     //   697	157	11	$i$f$mapValues	I
/*     */     //   0	1196	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	1135	29	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	1128	28	$result	Ljava/lang/Object; } @DebugMetadata(f = "RelevantSymbolsTaskExtractor.kt", l = {57, 66, 69, 73}, i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0"}, n = {"this", "project", "prompt", "startTime", "this", "prompt", "allResponses", "startTime", "this", "prompt", "allResponses", "symbols", "execTime", "symbols"}, m = "extract", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.RelevantSymbolsTaskExtractor")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RelevantSymbolsTaskExtractor$extract$1 extends ContinuationImpl { Object L$0; Object L$1; Object L$2; Object L$3; long J$0; int label; RelevantSymbolsTaskExtractor$extract$1(Continuation $completion) { super($completion); }
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RelevantSymbolsTaskExtractor.this.extract((Continuation<? super List<? extends SmartPsiElementPointer<? extends PsiElement>>>)this); } }
/*     */   @DebugMetadata(f = "RelevantSymbolsTaskExtractor.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.RelevantSymbolsTaskExtractor$extract$request$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\0042\f\020\005\032\b\022\004\022\0020\0020\001H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "<unused var>", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "optionsToRank"})
/*     */   static final class RelevantSymbolsTaskExtractor$extract$request$1 extends SuspendLambda implements Function3<ExecutionContext, List<? extends MatterhornChatElement>, Continuation<? super List<? extends MatterhornChatElement>>, Object> { int label;
/*     */     RelevantSymbolsTaskExtractor$extract$request$1(Continuation $completion) { super(3, $completion); }
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       List<? extends MatterhornChatElement> optionsToRank;
/*  53 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); optionsToRank = (List)this.L$0;
/*     */           
/*  55 */           return CollectionsKt.listOf(ExtractorUtilsKt.combineMultipleResponse(optionsToRank)); }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */ 
/*     */     
/*     */     public final Object invoke(ExecutionContext p1, List p2, Continuation<? super RelevantSymbolsTaskExtractor$extract$request$1> p3) {
/*     */       RelevantSymbolsTaskExtractor$extract$request$1 relevantSymbolsTaskExtractor$extract$request$1 = new RelevantSymbolsTaskExtractor$extract$request$1(p3);
/*     */       relevantSymbolsTaskExtractor$extract$request$1.L$0 = p2;
/*     */       return relevantSymbolsTaskExtractor$extract$request$1.invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   private static final String extract$lambda$6(List $symbols) {
/*  70 */     Iterable $this$mapNotNull$iv = $symbols; int $i$f$mapNotNull = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 263 */     Iterable iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 271 */     Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 272 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; SmartPsiElementPointer it = (SmartPsiElementPointer)element$iv$iv;
/*     */       int $i$a$-mapNotNull-RelevantSymbolsTaskExtractor$extract$response$1$1 = 0; }
/*     */     
/* 275 */     return CollectionsKt.joinToString$default(CollectionsKt.sorted(StringsKt.lines(ExtractorUtilsKt.formatHierarchy((List<? extends PsiElement>)destination$iv$iv, new FormatHierarchyParams(true, null, 2, null)))), "\n", null, null, 0, null, null, 62, null);
/*     */   }
/*     */   
/*     */   private final Map<ElementType, Set<String>> extractAnswers(String $this$extractAnswers) {
/*     */     Map<Object, Object> result = new LinkedHashMap<>();
/*     */     if (StringsKt.contains$default($this$extractAnswers, "no_info", false, 2, null))
/*     */       return (Map)result; 
/*     */     Iterable $this$forEach$iv = (Iterable)ElementType.getEntries();
/*     */     int $i$f$forEach = 0;
/*     */     Iterator iterator = $this$forEach$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       Object element$iv = iterator.next();
/*     */       ElementType category = (ElementType)element$iv;
/*     */       int $i$a$-forEach-RelevantSymbolsTaskExtractor$extractAnswers$1 = 0;
/*     */       String rawContent = ExtractorUtilsKt.getTextByXMLTag($this$extractAnswers, category.getValue());
/*     */       String[] arrayOfString = new String[1];
/*     */       arrayOfString[0] = "\n";
/*     */       Iterable $this$map$iv = StringsKt.split$default(rawContent, arrayOfString, false, 0, 6, null);
/*     */       int $i$f$map = 0;
/*     */       Iterable iterable1 = $this$map$iv;
/*     */       Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
/*     */       int $i$f$mapTo = 0;
/*     */       Iterator iterator1 = iterable1.iterator();
/*     */     } 
/*     */     return (Map)result;
/*     */   }
/*     */   
/*     */   private final long getSearchTimeout() {
/*     */     return (ProxyUtilsKt.isOnTeamcity() == true) ? 0L : 60000L;
/*     */   }
/*     */   
/*     */   private final Object searchForRelevantSymbols(Project project, Map<ElementType, ? extends Set<String>> targetElement, int maxNumSearchFound, Continuation $completion) {
/*     */     ComponentManager $this$service$iv = (ComponentManager)project;
/*     */     int $i$f$service = 0;
/*     */     Class<ProjectSearchEverywhereService> serviceClass$iv = ProjectSearchEverywhereService.class;
/*     */     if ($this$service$iv.getService(serviceClass$iv) == null) {
/*     */       $this$service$iv.getService(serviceClass$iv);
/*     */       throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv);
/*     */     } 
/*     */     ProjectSearchEverywhereService searchService = (ProjectSearchEverywhereService)$this$service$iv.getService(serviceClass$iv);
/*     */     ComponentManager componentManager1 = (ComponentManager)project;
/*     */     int i = 0;
/*     */     Class<ProjectSearchAllService> clazz = ProjectSearchAllService.class;
/*     */     if (componentManager1.getService(clazz) == null) {
/*     */       componentManager1.getService(clazz);
/*     */       throw ServicesKt.serviceNotFoundError(componentManager1, clazz);
/*     */     } 
/*     */     ProjectSearchAllService searchElementsService = (ProjectSearchAllService)componentManager1.getService(clazz);
/*     */     return CoroutineScopeKt.coroutineScope(new RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2(searchElementsService, searchService, maxNumSearchFound, this, project, null), $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RelevantSymbolsTaskExtractor.kt", l = {158}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020\"\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\020\000\032\024\022\020\022\016\022\006\b\001\022\0020\0030\002j\002`\0040\001*\0020\005H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/psi/SmartPsiElementPointer;", "Lcom/intellij/psi/PsiElement;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/PsiElementPointer;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nRelevantSymbolsTaskExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelevantSymbolsTaskExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n126#2:220\n153#2,3:221\n774#3:224\n865#3,2:225\n*S KotlinDebug\n*F\n+ 1 RelevantSymbolsTaskExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2\n*L\n110#1:220\n110#1:221,3\n158#1:224\n158#1:225,2\n*E\n"})
/*     */   static final class RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Set<? extends SmartPsiElementPointer<? extends PsiElement>>>, Object> {
/*     */     int label;
/*     */     
/*     */     RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2(ProjectSearchAllService $searchElementsService, ProjectSearchEverywhereService $searchService, int $maxNumSearchFound, RelevantSymbolsTaskExtractor $receiver, Project $project, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #20
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 380, 0 -> 32, 1 -> 253
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield L$0 : Ljava/lang/Object;
/*     */       //   40: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   43: astore_2
/*     */       //   44: aload_0
/*     */       //   45: getfield $targetElement : Ljava/util/Map;
/*     */       //   48: astore_3
/*     */       //   49: aload_0
/*     */       //   50: getfield $searchElementsService : Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchAllService;
/*     */       //   53: astore #4
/*     */       //   55: aload_0
/*     */       //   56: getfield $searchService : Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService;
/*     */       //   59: astore #5
/*     */       //   61: aload_0
/*     */       //   62: getfield $maxNumSearchFound : I
/*     */       //   65: istore #6
/*     */       //   67: aload_0
/*     */       //   68: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */       //   71: astore #7
/*     */       //   73: aload_0
/*     */       //   74: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   77: astore #8
/*     */       //   79: iconst_0
/*     */       //   80: istore #9
/*     */       //   82: aload_3
/*     */       //   83: astore #10
/*     */       //   85: new java/util/ArrayList
/*     */       //   88: dup
/*     */       //   89: aload_3
/*     */       //   90: invokeinterface size : ()I
/*     */       //   95: invokespecial <init> : (I)V
/*     */       //   98: checkcast java/util/Collection
/*     */       //   101: astore #11
/*     */       //   103: iconst_0
/*     */       //   104: istore #12
/*     */       //   106: aload #10
/*     */       //   108: invokeinterface entrySet : ()Ljava/util/Set;
/*     */       //   113: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   118: astore #13
/*     */       //   120: aload #13
/*     */       //   122: invokeinterface hasNext : ()Z
/*     */       //   127: ifeq -> 223
/*     */       //   130: aload #13
/*     */       //   132: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   137: checkcast java/util/Map$Entry
/*     */       //   140: astore #14
/*     */       //   142: aload #11
/*     */       //   144: aload #14
/*     */       //   146: astore #15
/*     */       //   148: astore #19
/*     */       //   150: iconst_0
/*     */       //   151: istore #16
/*     */       //   153: aload #15
/*     */       //   155: invokeinterface getKey : ()Ljava/lang/Object;
/*     */       //   160: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$ElementType
/*     */       //   163: astore #17
/*     */       //   165: aload #15
/*     */       //   167: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   172: checkcast java/util/Set
/*     */       //   175: astore #18
/*     */       //   177: aload_2
/*     */       //   178: aconst_null
/*     */       //   179: aconst_null
/*     */       //   180: new com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1$1
/*     */       //   183: dup
/*     */       //   184: aload #17
/*     */       //   186: aload #18
/*     */       //   188: aload #4
/*     */       //   190: aload #5
/*     */       //   192: iload #6
/*     */       //   194: aload #7
/*     */       //   196: aload #8
/*     */       //   198: aconst_null
/*     */       //   199: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$ElementType;Ljava/util/Set;Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchAllService;Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService;ILcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)V
/*     */       //   202: checkcast kotlin/jvm/functions/Function2
/*     */       //   205: iconst_3
/*     */       //   206: aconst_null
/*     */       //   207: invokestatic async$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
/*     */       //   210: nop
/*     */       //   211: aload #19
/*     */       //   213: swap
/*     */       //   214: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   219: pop
/*     */       //   220: goto -> 120
/*     */       //   223: aload #11
/*     */       //   225: checkcast java/util/List
/*     */       //   228: nop
/*     */       //   229: checkcast java/util/Collection
/*     */       //   232: aload_0
/*     */       //   233: checkcast kotlin/coroutines/Continuation
/*     */       //   236: aload_0
/*     */       //   237: iconst_1
/*     */       //   238: putfield label : I
/*     */       //   241: invokestatic awaitAll : (Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   244: dup
/*     */       //   245: aload #20
/*     */       //   247: if_acmpne -> 258
/*     */       //   250: aload #20
/*     */       //   252: areturn
/*     */       //   253: aload_1
/*     */       //   254: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   257: aload_1
/*     */       //   258: checkcast java/lang/Iterable
/*     */       //   261: invokestatic flatten : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */       //   264: checkcast java/lang/Iterable
/*     */       //   267: astore_3
/*     */       //   268: aload_0
/*     */       //   269: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;
/*     */       //   272: astore #4
/*     */       //   274: iconst_0
/*     */       //   275: istore #5
/*     */       //   277: aload_3
/*     */       //   278: astore #6
/*     */       //   280: new java/util/ArrayList
/*     */       //   283: dup
/*     */       //   284: invokespecial <init> : ()V
/*     */       //   287: checkcast java/util/Collection
/*     */       //   290: astore #7
/*     */       //   292: iconst_0
/*     */       //   293: istore #8
/*     */       //   295: aload #6
/*     */       //   297: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   302: astore #9
/*     */       //   304: aload #9
/*     */       //   306: invokeinterface hasNext : ()Z
/*     */       //   311: ifeq -> 367
/*     */       //   314: aload #9
/*     */       //   316: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   321: astore #10
/*     */       //   323: aload #10
/*     */       //   325: checkcast com/intellij/psi/SmartPsiElementPointer
/*     */       //   328: astore #11
/*     */       //   330: iconst_0
/*     */       //   331: istore #12
/*     */       //   333: aload #4
/*     */       //   335: aload #11
/*     */       //   337: invokeinterface getVirtualFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   342: dup
/*     */       //   343: ldc 'getVirtualFile(...)'
/*     */       //   345: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   348: invokestatic access$isSuitable : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor;Lcom/intellij/openapi/vfs/VirtualFile;)Z
/*     */       //   351: ifeq -> 304
/*     */       //   354: aload #7
/*     */       //   356: aload #10
/*     */       //   358: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   363: pop
/*     */       //   364: goto -> 304
/*     */       //   367: aload #7
/*     */       //   369: checkcast java/util/List
/*     */       //   372: nop
/*     */       //   373: checkcast java/lang/Iterable
/*     */       //   376: invokestatic toSet : (Ljava/lang/Iterable;)Ljava/util/Set;
/*     */       //   379: areturn
/*     */       //   380: new java/lang/IllegalStateException
/*     */       //   383: dup
/*     */       //   384: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   386: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   389: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #109	-> 3
/*     */       //   #110	-> 44
/*     */       //   #220	-> 82
/*     */       //   #221	-> 106
/*     */       //   #221	-> 118
/*     */       //   #222	-> 142
/*     */       //   #110	-> 153
/*     */       //   #110	-> 160
/*     */       //   #110	-> 172
/*     */       //   #111	-> 177
/*     */       //   #157	-> 210
/*     */       //   #222	-> 214
/*     */       //   #223	-> 223
/*     */       //   #220	-> 228
/*     */       //   #158	-> 236
/*     */       //   #109	-> 250
/*     */       //   #158	-> 258
/*     */       //   #224	-> 277
/*     */       //   #225	-> 295
/*     */       //   #158	-> 333
/*     */       //   #225	-> 351
/*     */       //   #226	-> 367
/*     */       //   #224	-> 372
/*     */       //   #158	-> 376
/*     */       //   #109	-> 380
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   44	167	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   211	12	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   79	24	3	$this$map$iv	Ljava/util/Map;
/*     */       //   274	18	3	$this$filter$iv	Ljava/lang/Iterable;
/*     */       //   292	12	6	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   292	77	7	destination$iv$iv	Ljava/util/Collection;
/*     */       //   103	15	10	$this$mapTo$iv$iv	Ljava/util/Map;
/*     */       //   323	41	10	element$iv$iv	Ljava/lang/Object;
/*     */       //   103	122	11	destination$iv$iv	Ljava/util/Collection;
/*     */       //   330	21	11	it	Lcom/intellij/psi/SmartPsiElementPointer;
/*     */       //   142	78	14	item$iv$iv	Ljava/util/Map$Entry;
/*     */       //   165	46	17	type	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$ElementType;
/*     */       //   177	34	18	values	Ljava/util/Set;
/*     */       //   153	58	16	$i$a$-map-RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$1	I
/*     */       //   106	119	12	$i$f$mapTo	I
/*     */       //   82	147	9	$i$f$map	I
/*     */       //   333	18	12	$i$a$-filter-RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2$2	I
/*     */       //   295	74	8	$i$f$filterTo	I
/*     */       //   277	96	5	$i$f$filter	I
/*     */       //   0	390	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2;
/*     */       //   36	344	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2> $completion) {
/*     */       RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2 relevantSymbolsTaskExtractor$searchForRelevantSymbols$2 = new RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2(this.$searchElementsService, this.$searchService, this.$maxNumSearchFound, RelevantSymbolsTaskExtractor.this, this.$project, $completion);
/*     */       relevantSymbolsTaskExtractor$searchForRelevantSymbols$2.L$0 = value;
/*     */       return (Continuation<Unit>)relevantSymbolsTaskExtractor$searchForRelevantSymbols$2;
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((RelevantSymbolsTaskExtractor$searchForRelevantSymbols$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private final boolean isSuitable(VirtualFile $this$isSuitable) {
/*     */     return (!$this$isSuitable.isDirectory() && !FileTypeManager.getInstance().getFileTypeByFile($this$isSuitable).isBinary());
/*     */   }
/*     */   
/*     */   private final String getTaskSymbolsExtractorPrompt(AgentIssue issue, String repoName) {
/*     */     return "\n<issue_description>\n" + issue + "\n</issue_description>\n\n<instruction>\nAs a first step please extract information from <issue_description>. \nPlease list all files, classes, methods (functions) that are mentioned in the <issue_description> or are related to the issue. \n\"Related\" means objects containing code that might be helpful for inspection or editing to resolve the issue. This includes both code that is directly connected to the issue and code that could potentially be relevant.\nYou may include files, classes, or methods not mentioned in the <issue_description> if you believe, based on your knowledge of the repository, that they are important for resolving the issue.\nIf line numbers are mentioned in the <issue_description>, return them in the format <file_path>:<line_number> (optional).\nIt's mandatory to use the XML format for your response, including the tags described below:\n\n```xml\n<files>\n  file_path1/file_name1\n  file_path2/file_name2:112\n  ...\n</files>\n<classes>\n  class1\n  class2\n  ...\n</classes>\n<methods>\n  method1\n  method2\n  ...\n</methods>\n```\n\nYou can specify classes and methods using either dot notation or just the simple object name.\nDo not use commas to separate objects; list each object on a separate line.\nProvide only objects from " + repoName + " package. \n\nIf you didn't find any files, classes or methods (functions) in the issue description, please provide any other important keywords, mentioned there, using tag \"other\".\nImportant keywords (other) are distinct search terms that can help in identifying the problematic part of the code through search. \nIn the \"other\" section, do not repeat any terms that you've already listed as files, classes, or methods.\nTry to classify objects between files, classes or methods. Use the category \"other\" only in exceptional cases.\nFormat for keywords answers:\n\n```xml\n<other>\n  keyword1\n  keyword2\n  ...\n</other>\n```\nIf the issue description does not specify any particular files, classes, methods or important keywords within the package please return answer in this format:\n```xml\n<no_info/>\n```\n</instruction>\n";
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\extractors\RelevantSymbolsTaskExtractor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */