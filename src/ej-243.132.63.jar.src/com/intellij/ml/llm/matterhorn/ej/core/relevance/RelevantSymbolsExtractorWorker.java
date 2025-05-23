/*     */ package com.intellij.ml.llm.matterhorn.ej.core.relevance;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.ExtractorUtilsKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.FormatHierarchyParams;
/*     */ import com.intellij.psi.SmartPsiElementPointer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\007¢\006\004\b\004\020\005J$\020\b\032\b\022\004\022\0020\0030\t2\006\020\n\032\0020\0022\006\020\013\032\0020\fH@¢\006\002\020\rR\016\020\006\032\0020\007XD¢\006\002\n\000¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorWorker;", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorInput;", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorResponse;", "<init>", "()V", "agentName", "", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "input", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorInput;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nRelevantSymbolsExtractorWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelevantSymbolsExtractorWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorWorker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1567#2:226\n1598#2,3:227\n1611#2,9:230\n1863#2:239\n1864#2:241\n1620#2:242\n1601#2:243\n1611#2,9:244\n1863#2:253\n1864#2:255\n1620#2:256\n1611#2,9:257\n1863#2:266\n1864#2:268\n1620#2:269\n1611#2,9:270\n1863#2:279\n1864#2:281\n1620#2:282\n1#3:240\n1#3:254\n1#3:267\n1#3:280\n*S KotlinDebug\n*F\n+ 1 RelevantSymbolsExtractorWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorWorker\n*L\n202#1:226\n202#1:227,3\n203#1:230,9\n203#1:239\n203#1:241\n203#1:242\n202#1:243\n217#1:244,9\n217#1:253\n217#1:255\n217#1:256\n219#1:257,9\n219#1:266\n219#1:268\n219#1:269\n220#1:270,9\n220#1:279\n220#1:281\n220#1:282\n203#1:240\n217#1:254\n219#1:267\n220#1:280\n*E\n"})
/*     */ public final class RelevantSymbolsExtractorWorker
/*     */   implements ArtifactRequestExecutor<RelevantSymbolsExtractorInput, RelevantSymbolsExtractorResponse>
/*     */ {
/*     */   @NotNull
/* 187 */   private final String agentName = "relevant_symbols_extractor";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object produceArtifact(@NotNull RelevantSymbolsExtractorInput input, @NotNull ExecutionContext context, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorWorker$produceArtifact$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorWorker$produceArtifact$1
/*     */     //   11: astore #18
/*     */     //   13: aload #18
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #18
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorWorker$produceArtifact$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #18
/*     */     //   50: aload #18
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #17
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #31
/*     */     //   62: aload #18
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 1250, 0 -> 120, 1 -> 189, 2 -> 383, 3 -> 495, 4 -> 606, 5 -> 733, 6 -> 879, 7 -> 1007, 8 -> 1132, 9 -> 1242
/*     */     //   120: aload #17
/*     */     //   122: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   125: getstatic com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters$Companion;
/*     */     //   128: astore #16
/*     */     //   130: getstatic com/intellij/ml/llm/matterhorn/llm/ModelParameters.Companion : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion;
/*     */     //   133: aload_0
/*     */     //   134: getfield agentName : Ljava/lang/String;
/*     */     //   137: aload_2
/*     */     //   138: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   141: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   144: aload #18
/*     */     //   146: aload #18
/*     */     //   148: aload_0
/*     */     //   149: putfield L$0 : Ljava/lang/Object;
/*     */     //   152: aload #18
/*     */     //   154: aload_1
/*     */     //   155: putfield L$1 : Ljava/lang/Object;
/*     */     //   158: aload #18
/*     */     //   160: aload_2
/*     */     //   161: putfield L$2 : Ljava/lang/Object;
/*     */     //   164: aload #18
/*     */     //   166: aload #16
/*     */     //   168: putfield L$3 : Ljava/lang/Object;
/*     */     //   171: aload #18
/*     */     //   173: iconst_1
/*     */     //   174: putfield label : I
/*     */     //   177: invokevirtual getDefaultModel : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   180: dup
/*     */     //   181: aload #31
/*     */     //   183: if_acmpne -> 233
/*     */     //   186: aload #31
/*     */     //   188: areturn
/*     */     //   189: aload #18
/*     */     //   191: getfield L$3 : Ljava/lang/Object;
/*     */     //   194: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters$Companion
/*     */     //   197: astore #16
/*     */     //   199: aload #18
/*     */     //   201: getfield L$2 : Ljava/lang/Object;
/*     */     //   204: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   207: astore_2
/*     */     //   208: aload #18
/*     */     //   210: getfield L$1 : Ljava/lang/Object;
/*     */     //   213: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorInput
/*     */     //   216: astore_1
/*     */     //   217: aload #18
/*     */     //   219: getfield L$0 : Ljava/lang/Object;
/*     */     //   222: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorWorker
/*     */     //   225: astore_0
/*     */     //   226: aload #17
/*     */     //   228: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   231: aload #17
/*     */     //   233: aload #16
/*     */     //   235: swap
/*     */     //   236: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */     //   239: aconst_null
/*     */     //   240: iconst_0
/*     */     //   241: dconst_1
/*     */     //   242: invokestatic boxDouble : (D)Ljava/lang/Double;
/*     */     //   245: aconst_null
/*     */     //   246: aconst_null
/*     */     //   247: aconst_null
/*     */     //   248: aconst_null
/*     */     //   249: aconst_null
/*     */     //   250: aconst_null
/*     */     //   251: aconst_null
/*     */     //   252: aconst_null
/*     */     //   253: aconst_null
/*     */     //   254: aconst_null
/*     */     //   255: iconst_0
/*     */     //   256: aconst_null
/*     */     //   257: sipush #32763
/*     */     //   260: aconst_null
/*     */     //   261: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lcom/intellij/ml/llm/matterhorn/llm/LLM;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   264: iconst_0
/*     */     //   265: iconst_0
/*     */     //   266: iconst_0
/*     */     //   267: iconst_0
/*     */     //   268: iconst_0
/*     */     //   269: iconst_0
/*     */     //   270: iconst_0
/*     */     //   271: iconst_0
/*     */     //   272: iconst_0
/*     */     //   273: sipush #1022
/*     */     //   276: aconst_null
/*     */     //   277: astore #19
/*     */     //   279: istore #20
/*     */     //   281: istore #21
/*     */     //   283: istore #22
/*     */     //   285: istore #23
/*     */     //   287: istore #24
/*     */     //   289: istore #25
/*     */     //   291: istore #26
/*     */     //   293: istore #27
/*     */     //   295: istore #28
/*     */     //   297: istore #29
/*     */     //   299: astore #30
/*     */     //   301: new com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters
/*     */     //   304: dup
/*     */     //   305: aload #30
/*     */     //   307: iload #29
/*     */     //   309: iload #28
/*     */     //   311: iload #27
/*     */     //   313: iload #26
/*     */     //   315: iload #25
/*     */     //   317: iload #24
/*     */     //   319: iload #23
/*     */     //   321: iload #22
/*     */     //   323: iload #21
/*     */     //   325: iload #20
/*     */     //   327: aload #19
/*     */     //   329: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;IIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   332: aload_2
/*     */     //   333: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   336: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   339: aload #18
/*     */     //   341: aload #18
/*     */     //   343: aload_0
/*     */     //   344: putfield L$0 : Ljava/lang/Object;
/*     */     //   347: aload #18
/*     */     //   349: aload_1
/*     */     //   350: putfield L$1 : Ljava/lang/Object;
/*     */     //   353: aload #18
/*     */     //   355: aload_2
/*     */     //   356: putfield L$2 : Ljava/lang/Object;
/*     */     //   359: aload #18
/*     */     //   361: aconst_null
/*     */     //   362: putfield L$3 : Ljava/lang/Object;
/*     */     //   365: aload #18
/*     */     //   367: iconst_2
/*     */     //   368: putfield label : I
/*     */     //   371: invokevirtual setupFromEnvironment : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   374: dup
/*     */     //   375: aload #31
/*     */     //   377: if_acmpne -> 417
/*     */     //   380: aload #31
/*     */     //   382: areturn
/*     */     //   383: aload #18
/*     */     //   385: getfield L$2 : Ljava/lang/Object;
/*     */     //   388: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   391: astore_2
/*     */     //   392: aload #18
/*     */     //   394: getfield L$1 : Ljava/lang/Object;
/*     */     //   397: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorInput
/*     */     //   400: astore_1
/*     */     //   401: aload #18
/*     */     //   403: getfield L$0 : Ljava/lang/Object;
/*     */     //   406: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorWorker
/*     */     //   409: astore_0
/*     */     //   410: aload #17
/*     */     //   412: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   415: aload #17
/*     */     //   417: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters
/*     */     //   420: astore #4
/*     */     //   422: aload_2
/*     */     //   423: aload_0
/*     */     //   424: getfield agentName : Ljava/lang/String;
/*     */     //   427: invokevirtual setTitle : (Ljava/lang/String;)V
/*     */     //   430: new com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext
/*     */     //   433: dup
/*     */     //   434: aload_1
/*     */     //   435: invokevirtual getIssue : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   438: aload #4
/*     */     //   440: aload_2
/*     */     //   441: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)V
/*     */     //   444: astore #5
/*     */     //   446: new com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsTaskExtractor
/*     */     //   449: dup
/*     */     //   450: aload #5
/*     */     //   452: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;)V
/*     */     //   455: aload #18
/*     */     //   457: aload #18
/*     */     //   459: aload_2
/*     */     //   460: putfield L$0 : Ljava/lang/Object;
/*     */     //   463: aload #18
/*     */     //   465: aload #4
/*     */     //   467: putfield L$1 : Ljava/lang/Object;
/*     */     //   470: aload #18
/*     */     //   472: aload #5
/*     */     //   474: putfield L$2 : Ljava/lang/Object;
/*     */     //   477: aload #18
/*     */     //   479: iconst_3
/*     */     //   480: putfield label : I
/*     */     //   483: invokevirtual extract : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   486: dup
/*     */     //   487: aload #31
/*     */     //   489: if_acmpne -> 531
/*     */     //   492: aload #31
/*     */     //   494: areturn
/*     */     //   495: aload #18
/*     */     //   497: getfield L$2 : Ljava/lang/Object;
/*     */     //   500: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext
/*     */     //   503: astore #5
/*     */     //   505: aload #18
/*     */     //   507: getfield L$1 : Ljava/lang/Object;
/*     */     //   510: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters
/*     */     //   513: astore #4
/*     */     //   515: aload #18
/*     */     //   517: getfield L$0 : Ljava/lang/Object;
/*     */     //   520: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   523: astore_2
/*     */     //   524: aload #17
/*     */     //   526: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   529: aload #17
/*     */     //   531: checkcast java/util/List
/*     */     //   534: astore #6
/*     */     //   536: invokestatic currentTimeMillis : ()J
/*     */     //   539: lstore #7
/*     */     //   541: new com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantImportsExtractor
/*     */     //   544: dup
/*     */     //   545: aload #5
/*     */     //   547: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;)V
/*     */     //   550: aload #6
/*     */     //   552: aload #18
/*     */     //   554: aload #18
/*     */     //   556: aload_2
/*     */     //   557: putfield L$0 : Ljava/lang/Object;
/*     */     //   560: aload #18
/*     */     //   562: aload #4
/*     */     //   564: putfield L$1 : Ljava/lang/Object;
/*     */     //   567: aload #18
/*     */     //   569: aload #5
/*     */     //   571: putfield L$2 : Ljava/lang/Object;
/*     */     //   574: aload #18
/*     */     //   576: aload #6
/*     */     //   578: putfield L$3 : Ljava/lang/Object;
/*     */     //   581: aload #18
/*     */     //   583: lload #7
/*     */     //   585: putfield J$0 : J
/*     */     //   588: aload #18
/*     */     //   590: iconst_4
/*     */     //   591: putfield label : I
/*     */     //   594: invokevirtual extract : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   597: dup
/*     */     //   598: aload #31
/*     */     //   600: if_acmpne -> 659
/*     */     //   603: aload #31
/*     */     //   605: areturn
/*     */     //   606: aload #18
/*     */     //   608: getfield J$0 : J
/*     */     //   611: lstore #7
/*     */     //   613: aload #18
/*     */     //   615: getfield L$3 : Ljava/lang/Object;
/*     */     //   618: checkcast java/util/List
/*     */     //   621: astore #6
/*     */     //   623: aload #18
/*     */     //   625: getfield L$2 : Ljava/lang/Object;
/*     */     //   628: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext
/*     */     //   631: astore #5
/*     */     //   633: aload #18
/*     */     //   635: getfield L$1 : Ljava/lang/Object;
/*     */     //   638: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters
/*     */     //   641: astore #4
/*     */     //   643: aload #18
/*     */     //   645: getfield L$0 : Ljava/lang/Object;
/*     */     //   648: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   651: astore_2
/*     */     //   652: aload #17
/*     */     //   654: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   657: aload #17
/*     */     //   659: checkcast java/util/List
/*     */     //   662: astore #9
/*     */     //   664: aload #9
/*     */     //   666: aload_2
/*     */     //   667: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Lkotlin/jvm/functions/Function0;
/*     */     //   672: aload #18
/*     */     //   674: aload #18
/*     */     //   676: aload_2
/*     */     //   677: putfield L$0 : Ljava/lang/Object;
/*     */     //   680: aload #18
/*     */     //   682: aload #4
/*     */     //   684: putfield L$1 : Ljava/lang/Object;
/*     */     //   687: aload #18
/*     */     //   689: aload #5
/*     */     //   691: putfield L$2 : Ljava/lang/Object;
/*     */     //   694: aload #18
/*     */     //   696: aload #6
/*     */     //   698: putfield L$3 : Ljava/lang/Object;
/*     */     //   701: aload #18
/*     */     //   703: aload #9
/*     */     //   705: putfield L$4 : Ljava/lang/Object;
/*     */     //   708: aload #18
/*     */     //   710: lload #7
/*     */     //   712: putfield J$0 : J
/*     */     //   715: aload #18
/*     */     //   717: iconst_5
/*     */     //   718: putfield label : I
/*     */     //   721: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   724: dup
/*     */     //   725: aload #31
/*     */     //   727: if_acmpne -> 796
/*     */     //   730: aload #31
/*     */     //   732: areturn
/*     */     //   733: aload #18
/*     */     //   735: getfield J$0 : J
/*     */     //   738: lstore #7
/*     */     //   740: aload #18
/*     */     //   742: getfield L$4 : Ljava/lang/Object;
/*     */     //   745: checkcast java/util/List
/*     */     //   748: astore #9
/*     */     //   750: aload #18
/*     */     //   752: getfield L$3 : Ljava/lang/Object;
/*     */     //   755: checkcast java/util/List
/*     */     //   758: astore #6
/*     */     //   760: aload #18
/*     */     //   762: getfield L$2 : Ljava/lang/Object;
/*     */     //   765: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext
/*     */     //   768: astore #5
/*     */     //   770: aload #18
/*     */     //   772: getfield L$1 : Ljava/lang/Object;
/*     */     //   775: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters
/*     */     //   778: astore #4
/*     */     //   780: aload #18
/*     */     //   782: getfield L$0 : Ljava/lang/Object;
/*     */     //   785: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   788: astore_2
/*     */     //   789: aload #17
/*     */     //   791: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   794: aload #17
/*     */     //   796: checkcast java/lang/String
/*     */     //   799: astore #10
/*     */     //   801: invokestatic currentTimeMillis : ()J
/*     */     //   804: lload #7
/*     */     //   806: lsub
/*     */     //   807: lstore #11
/*     */     //   809: aload_2
/*     */     //   810: ldc 'repomap_TaskExtractionExt'
/*     */     //   812: aload #4
/*     */     //   814: ldc ''
/*     */     //   816: ldc ''
/*     */     //   818: ldc ''
/*     */     //   820: aload #10
/*     */     //   822: lload #11
/*     */     //   824: aload #18
/*     */     //   826: aload #18
/*     */     //   828: aload_2
/*     */     //   829: putfield L$0 : Ljava/lang/Object;
/*     */     //   832: aload #18
/*     */     //   834: aload #5
/*     */     //   836: putfield L$1 : Ljava/lang/Object;
/*     */     //   839: aload #18
/*     */     //   841: aload #6
/*     */     //   843: putfield L$2 : Ljava/lang/Object;
/*     */     //   846: aload #18
/*     */     //   848: aload #9
/*     */     //   850: putfield L$3 : Ljava/lang/Object;
/*     */     //   853: aload #18
/*     */     //   855: aload #10
/*     */     //   857: putfield L$4 : Ljava/lang/Object;
/*     */     //   860: aload #18
/*     */     //   862: bipush #6
/*     */     //   864: putfield label : I
/*     */     //   867: invokestatic logTrajectories : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   870: dup
/*     */     //   871: aload #31
/*     */     //   873: if_acmpne -> 935
/*     */     //   876: aload #31
/*     */     //   878: areturn
/*     */     //   879: aload #18
/*     */     //   881: getfield L$4 : Ljava/lang/Object;
/*     */     //   884: checkcast java/lang/String
/*     */     //   887: astore #10
/*     */     //   889: aload #18
/*     */     //   891: getfield L$3 : Ljava/lang/Object;
/*     */     //   894: checkcast java/util/List
/*     */     //   897: astore #9
/*     */     //   899: aload #18
/*     */     //   901: getfield L$2 : Ljava/lang/Object;
/*     */     //   904: checkcast java/util/List
/*     */     //   907: astore #6
/*     */     //   909: aload #18
/*     */     //   911: getfield L$1 : Ljava/lang/Object;
/*     */     //   914: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext
/*     */     //   917: astore #5
/*     */     //   919: aload #18
/*     */     //   921: getfield L$0 : Ljava/lang/Object;
/*     */     //   924: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   927: astore_2
/*     */     //   928: aload #17
/*     */     //   930: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   933: aload #17
/*     */     //   935: pop
/*     */     //   936: new com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantFilesOrderedExtractor
/*     */     //   939: dup
/*     */     //   940: aload #5
/*     */     //   942: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;)V
/*     */     //   945: aload #9
/*     */     //   947: checkcast java/lang/Iterable
/*     */     //   950: invokestatic flatten : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   953: aload #18
/*     */     //   955: aload #18
/*     */     //   957: aload_2
/*     */     //   958: putfield L$0 : Ljava/lang/Object;
/*     */     //   961: aload #18
/*     */     //   963: aload #5
/*     */     //   965: putfield L$1 : Ljava/lang/Object;
/*     */     //   968: aload #18
/*     */     //   970: aload #6
/*     */     //   972: putfield L$2 : Ljava/lang/Object;
/*     */     //   975: aload #18
/*     */     //   977: aload #10
/*     */     //   979: putfield L$3 : Ljava/lang/Object;
/*     */     //   982: aload #18
/*     */     //   984: aconst_null
/*     */     //   985: putfield L$4 : Ljava/lang/Object;
/*     */     //   988: aload #18
/*     */     //   990: bipush #7
/*     */     //   992: putfield label : I
/*     */     //   995: invokevirtual extract : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   998: dup
/*     */     //   999: aload #31
/*     */     //   1001: if_acmpne -> 1053
/*     */     //   1004: aload #31
/*     */     //   1006: areturn
/*     */     //   1007: aload #18
/*     */     //   1009: getfield L$3 : Ljava/lang/Object;
/*     */     //   1012: checkcast java/lang/String
/*     */     //   1015: astore #10
/*     */     //   1017: aload #18
/*     */     //   1019: getfield L$2 : Ljava/lang/Object;
/*     */     //   1022: checkcast java/util/List
/*     */     //   1025: astore #6
/*     */     //   1027: aload #18
/*     */     //   1029: getfield L$1 : Ljava/lang/Object;
/*     */     //   1032: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext
/*     */     //   1035: astore #5
/*     */     //   1037: aload #18
/*     */     //   1039: getfield L$0 : Ljava/lang/Object;
/*     */     //   1042: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1045: astore_2
/*     */     //   1046: aload #17
/*     */     //   1048: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1051: aload #17
/*     */     //   1053: checkcast java/util/List
/*     */     //   1056: astore #13
/*     */     //   1058: aload #13
/*     */     //   1060: checkcast java/util/Collection
/*     */     //   1063: aload #6
/*     */     //   1065: checkcast java/lang/Iterable
/*     */     //   1068: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   1071: astore #14
/*     */     //   1073: new com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/RelevantSymbolsOrderedExtractor
/*     */     //   1076: dup
/*     */     //   1077: aload #5
/*     */     //   1079: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;)V
/*     */     //   1082: aload #14
/*     */     //   1084: aload #18
/*     */     //   1086: aload #18
/*     */     //   1088: aload_2
/*     */     //   1089: putfield L$0 : Ljava/lang/Object;
/*     */     //   1092: aload #18
/*     */     //   1094: aload #6
/*     */     //   1096: putfield L$1 : Ljava/lang/Object;
/*     */     //   1099: aload #18
/*     */     //   1101: aload #10
/*     */     //   1103: putfield L$2 : Ljava/lang/Object;
/*     */     //   1106: aload #18
/*     */     //   1108: aload #13
/*     */     //   1110: putfield L$3 : Ljava/lang/Object;
/*     */     //   1113: aload #18
/*     */     //   1115: bipush #8
/*     */     //   1117: putfield label : I
/*     */     //   1120: invokevirtual extract : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1123: dup
/*     */     //   1124: aload #31
/*     */     //   1126: if_acmpne -> 1178
/*     */     //   1129: aload #31
/*     */     //   1131: areturn
/*     */     //   1132: aload #18
/*     */     //   1134: getfield L$3 : Ljava/lang/Object;
/*     */     //   1137: checkcast java/util/List
/*     */     //   1140: astore #13
/*     */     //   1142: aload #18
/*     */     //   1144: getfield L$2 : Ljava/lang/Object;
/*     */     //   1147: checkcast java/lang/String
/*     */     //   1150: astore #10
/*     */     //   1152: aload #18
/*     */     //   1154: getfield L$1 : Ljava/lang/Object;
/*     */     //   1157: checkcast java/util/List
/*     */     //   1160: astore #6
/*     */     //   1162: aload #18
/*     */     //   1164: getfield L$0 : Ljava/lang/Object;
/*     */     //   1167: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1170: astore_2
/*     */     //   1171: aload #17
/*     */     //   1173: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1176: aload #17
/*     */     //   1178: checkcast java/util/List
/*     */     //   1181: astore #15
/*     */     //   1183: aload #6
/*     */     //   1185: aload #10
/*     */     //   1187: aload #13
/*     */     //   1189: aload #15
/*     */     //   1191: aload_2
/*     */     //   1192: <illegal opcode> invoke : (Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Lkotlin/jvm/functions/Function0;
/*     */     //   1197: aload #18
/*     */     //   1199: aload #18
/*     */     //   1201: aconst_null
/*     */     //   1202: putfield L$0 : Ljava/lang/Object;
/*     */     //   1205: aload #18
/*     */     //   1207: aconst_null
/*     */     //   1208: putfield L$1 : Ljava/lang/Object;
/*     */     //   1211: aload #18
/*     */     //   1213: aconst_null
/*     */     //   1214: putfield L$2 : Ljava/lang/Object;
/*     */     //   1217: aload #18
/*     */     //   1219: aconst_null
/*     */     //   1220: putfield L$3 : Ljava/lang/Object;
/*     */     //   1223: aload #18
/*     */     //   1225: bipush #9
/*     */     //   1227: putfield label : I
/*     */     //   1230: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1233: dup
/*     */     //   1234: aload #31
/*     */     //   1236: if_acmpne -> 1249
/*     */     //   1239: aload #31
/*     */     //   1241: areturn
/*     */     //   1242: aload #17
/*     */     //   1244: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1247: aload #17
/*     */     //   1249: areturn
/*     */     //   1250: new java/lang/IllegalStateException
/*     */     //   1253: dup
/*     */     //   1254: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1256: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1259: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #189	-> 60
/*     */     //   #190	-> 125
/*     */     //   #191	-> 130
/*     */     //   #189	-> 186
/*     */     //   #191	-> 233
/*     */     //   #190	-> 264
/*     */     //   #192	-> 332
/*     */     //   #189	-> 380
/*     */     //   #190	-> 420
/*     */     //   #194	-> 422
/*     */     //   #196	-> 430
/*     */     //   #198	-> 446
/*     */     //   #189	-> 492
/*     */     //   #199	-> 536
/*     */     //   #200	-> 541
/*     */     //   #189	-> 603
/*     */     //   #202	-> 664
/*     */     //   #189	-> 730
/*     */     //   #206	-> 801
/*     */     //   #207	-> 809
/*     */     //   #189	-> 876
/*     */     //   #209	-> 935
/*     */     //   #189	-> 1004
/*     */     //   #211	-> 1058
/*     */     //   #212	-> 1073
/*     */     //   #189	-> 1129
/*     */     //   #214	-> 1183
/*     */     //   #189	-> 1239
/*     */     //   #214	-> 1249
/*     */     //   #189	-> 1250
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   125	64	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorWorker;
/*     */     //   226	157	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorWorker;
/*     */     //   410	20	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorWorker;
/*     */     //   125	64	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorInput;
/*     */     //   217	166	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorInput;
/*     */     //   401	45	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorInput;
/*     */     //   125	64	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   208	175	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   392	103	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   524	82	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   652	81	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   789	90	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   928	79	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1046	86	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1171	62	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   422	73	4	parameters	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   515	91	4	parameters	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   643	90	4	parameters	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   780	90	4	parameters	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   446	49	5	extractorContext	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   505	101	5	extractorContext	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   633	100	5	extractorContext	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   770	109	5	extractorContext	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   919	88	5	extractorContext	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   1037	86	5	extractorContext	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;
/*     */     //   536	70	6	relevantSymbols	Ljava/util/List;
/*     */     //   623	110	6	relevantSymbols	Ljava/util/List;
/*     */     //   760	119	6	relevantSymbols	Ljava/util/List;
/*     */     //   909	98	6	relevantSymbols	Ljava/util/List;
/*     */     //   1027	105	6	relevantSymbols	Ljava/util/List;
/*     */     //   1162	71	6	relevantSymbols	Ljava/util/List;
/*     */     //   541	65	7	startTime	J
/*     */     //   613	120	7	startTime	J
/*     */     //   740	69	7	startTime	J
/*     */     //   664	69	9	relevantImports	Ljava/util/List;
/*     */     //   750	129	9	relevantImports	Ljava/util/List;
/*     */     //   899	99	9	relevantImports	Ljava/util/List;
/*     */     //   801	78	10	relevantImportsStr	Ljava/lang/String;
/*     */     //   889	118	10	relevantImportsStr	Ljava/lang/String;
/*     */     //   1017	115	10	relevantImportsStr	Ljava/lang/String;
/*     */     //   1152	81	10	relevantImportsStr	Ljava/lang/String;
/*     */     //   809	61	11	execTime	J
/*     */     //   1058	74	13	bestRelevantFiles	Ljava/util/List;
/*     */     //   1142	91	13	bestRelevantFiles	Ljava/util/List;
/*     */     //   1073	50	14	bestRelevantFilesAndTaskSymbols	Ljava/util/List;
/*     */     //   1183	50	15	bestRelevantSymbols	Ljava/util/List;
/*     */     //   0	1260	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	1200	18	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	1193	17	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final String produceArtifact$lambda$2(List $relevantImports, ExecutionContext $context) {
/* 202 */     Iterable $this$mapIndexed$iv = CollectionsKt.drop($relevantImports, 1); int $i$f$mapIndexed = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 226 */     Iterable iterable1 = $this$mapIndexed$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$mapIndexed$iv, 10)); int $i$f$mapIndexedTo = 0;
/* 227 */     int index$iv$iv = 0;
/* 228 */     for (Object item$iv$iv : iterable1) {
/* 229 */       int i = index$iv$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  List list1 = (List)item$iv$iv; int j = i; Collection collection2 = destination$iv$iv; int $i$a$-mapIndexed-RelevantSymbolsExtractorWorker$produceArtifact$relevantImportsStr$1$1 = 0; List list2 = list1; int k = j + 11, $i$f$mapNotNull = 0;
/* 230 */       List list3 = list2; Collection collection1 = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 238 */       Iterable $this$forEach$iv$iv$iv = list3; int $i$f$forEach = 0;
/* 239 */       Iterator iterator = $this$forEach$iv$iv$iv.iterator();
/*     */     } 
/*     */ 
/*     */     
/* 243 */     return CollectionsKt.joinToString$default(destination$iv$iv, "\n", null, null, 0, null, null, 62, null) + "\nIMPORTS99\n"; } private static final ArtifactResponse produceArtifact$lambda$6(List $relevantSymbols, String $relevantImportsStr, List $bestRelevantFiles, List $bestRelevantSymbols, ExecutionContext $context) { Iterable $this$mapNotNull$iv = $relevantSymbols; int $i$f$mapNotNull = 0;
/* 244 */     Iterable iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 252 */     Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 253 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; SmartPsiElementPointer it = (SmartPsiElementPointer)element$iv$iv; int $i$a$-mapNotNull-RelevantSymbolsExtractorWorker$produceArtifact$2$1 = 0; }
/*     */     
/*     */     $this$mapNotNull$iv = $bestRelevantFiles;
/* 256 */     String str2 = $relevantImportsStr, str1 = ExtractorUtilsKt.formatHierarchy((List)destination$iv$iv, new FormatHierarchyParams(true, null, 2, null)); $i$f$mapNotNull = 0;
/* 257 */     Iterable $this$mapNotNullTo$iv$iv = $this$mapNotNull$iv; destination$iv$iv = new ArrayList(); $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 265 */     $this$forEach$iv$iv$iv = $this$mapNotNullTo$iv$iv; $i$f$forEach = 0;
/* 266 */     iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; SmartPsiElementPointer it = (SmartPsiElementPointer)element$iv$iv;
/*     */       int $i$a$-mapNotNull-RelevantSymbolsExtractorWorker$produceArtifact$2$2 = 0; }
/*     */     
/* 269 */     List list1 = (List)destination$iv$iv; $this$mapNotNull$iv = $bestRelevantSymbols; String str3 = CollectionsKt.joinToString$default(list1, "\n", null, null, 0, null, null, 62, null); str2 = str2; str1 = str1; $i$f$mapNotNull = 0;
/* 270 */     $this$mapNotNullTo$iv$iv = $this$mapNotNull$iv; destination$iv$iv = new ArrayList(); $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 278 */     $this$forEach$iv$iv$iv = $this$mapNotNullTo$iv$iv; $i$f$forEach = 0;
/* 279 */     iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; SmartPsiElementPointer it = (SmartPsiElementPointer)element$iv$iv;
/*     */       int $i$a$-mapNotNull-RelevantSymbolsExtractorWorker$produceArtifact$2$3 = 0; }
/*     */     
/* 282 */     List list2 = (List)destination$iv$iv;
/*     */     String str4 = ExtractorUtilsKt.formatHierarchy(list2, new FormatHierarchyParams(true, null, 2, null)), str5 = str3, str6 = str2, str7 = str1;
/*     */     DefaultConstructorMarker defaultConstructorMarker = null;
/*     */     byte b = 2;
/*     */     String str8 = null;
/*     */     RelevantSymbolsExtractorResponse relevantSymbolsExtractorResponse = new RelevantSymbolsExtractorResponse(str7, str6, str5, str4);
/*     */     return new ArtifactResponse(relevantSymbolsExtractorResponse, str8, b, defaultConstructorMarker); }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "RelevantSymbolsExtractorWorker.kt", l = {191, 192, 198, 200, 202, 207, 209, 212, 214}, i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"}, n = {"this", "input", "context", "this", "input", "context", "context", "parameters", "extractorContext", "context", "parameters", "extractorContext", "relevantSymbols", "startTime", "context", "parameters", "extractorContext", "relevantSymbols", "relevantImports", "startTime", "context", "extractorContext", "relevantSymbols", "relevantImports", "relevantImportsStr", "context", "extractorContext", "relevantSymbols", "relevantImportsStr", "context", "relevantSymbols", "relevantImportsStr", "bestRelevantFiles"}, m = "produceArtifact", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.RelevantSymbolsExtractorWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RelevantSymbolsExtractorWorker$produceArtifact$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     long J$0;
/*     */     int label;
/*     */     
/*     */     RelevantSymbolsExtractorWorker$produceArtifact$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RelevantSymbolsExtractorWorker.this.produceArtifact((RelevantSymbolsExtractorInput)null, (ExecutionContext)null, (Continuation<? super ArtifactResponse<RelevantSymbolsExtractorResponse>>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\RelevantSymbolsExtractorWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */