/*     */ package com.intellij.ml.llm.matterhorn.ej.core.critique;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatKt;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage;
/*     */ import com.intellij.ml.llm.matterhorn.requests.ReviewerResponse;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.IndexedValue;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.SerializationException;
/*     */ import kotlinx.serialization.json.Json;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\002\b\004\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\007¢\006\004\b\004\020\005J$\020\n\032\b\022\004\022\0020\0030\0132\006\020\f\032\0020\0022\006\020\r\032\0020\016H@¢\006\002\020\017J$\020\020\032\0020\0212\f\020\022\032\b\022\004\022\0020\0240\0232\f\020\025\032\b\022\004\022\0020\0240\023H\002J\"\020\026\032\b\022\004\022\0020\0270\0232\006\020\030\032\0020\0312\f\020\025\032\b\022\004\022\0020\0240\023R\024\020\006\032\0020\007XD¢\006\b\n\000\032\004\b\b\020\tR\024\020\032\032\0020\007XD¢\006\b\n\000\032\004\b\033\020\tR\016\020\034\032\0020\007X\004¢\006\002\n\000¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique;", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse;", "<init>", "()V", "agentName", "", "getAgentName", "()Ljava/lang/String;", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "input", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "choiceMessage", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;", "historyNoDemo", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "actionsToRank", "getRanks", "", "response", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueModelResponse;", "commandDirective", "getCommandDirective", "systemPrompt", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nRankingCritique.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankingCritique.kt\ncom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1557#2:170\n1628#2,3:171\n1053#2:176\n1557#2:177\n1628#2,3:178\n1577#2,11:181\n1872#2,2:192\n1874#2:195\n1588#2:196\n222#3:174\n1#4:175\n1#4:194\n*S KotlinDebug\n*F\n+ 1 RankingCritique.kt\ncom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique\n*L\n57#1:170\n57#1:171,3\n90#1:176\n103#1:177\n103#1:178,3\n105#1:181,11\n105#1:192,2\n105#1:195\n105#1:196\n75#1:174\n105#1:194\n*E\n"})
/*     */ public final class RankingCritique
/*     */   implements ArtifactRequestExecutor<CritiqueInput, CritiqueResponse>
/*     */ {
/*     */   @NotNull
/*  47 */   private final String agentName = "ranking_critique"; @Nullable public Object produceArtifact(@NotNull CritiqueInput input, @NotNull ExecutionContext context, @NotNull Continuation $completion) { // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique$produceArtifact$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique$produceArtifact$1
/*     */     //   11: astore #19
/*     */     //   13: aload #19
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #19
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique$produceArtifact$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #19
/*     */     //   50: aload #19
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #18
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #20
/*     */     //   62: aload #19
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 687, 0 -> 96, 1 -> 153, 2 -> 281, 3 -> 590
/*     */     //   96: aload #18
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: getstatic com/intellij/ml/llm/matterhorn/llm/ModelParameters.Companion : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion;
/*     */     //   104: aload_0
/*     */     //   105: getfield agentName : Ljava/lang/String;
/*     */     //   108: aload_2
/*     */     //   109: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   112: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   115: aload #19
/*     */     //   117: aload #19
/*     */     //   119: aload_0
/*     */     //   120: putfield L$0 : Ljava/lang/Object;
/*     */     //   123: aload #19
/*     */     //   125: aload_1
/*     */     //   126: putfield L$1 : Ljava/lang/Object;
/*     */     //   129: aload #19
/*     */     //   131: aload_2
/*     */     //   132: putfield L$2 : Ljava/lang/Object;
/*     */     //   135: aload #19
/*     */     //   137: iconst_1
/*     */     //   138: putfield label : I
/*     */     //   141: invokevirtual getDefaultModel : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   144: dup
/*     */     //   145: aload #20
/*     */     //   147: if_acmpne -> 187
/*     */     //   150: aload #20
/*     */     //   152: areturn
/*     */     //   153: aload #19
/*     */     //   155: getfield L$2 : Ljava/lang/Object;
/*     */     //   158: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   161: astore_2
/*     */     //   162: aload #19
/*     */     //   164: getfield L$1 : Ljava/lang/Object;
/*     */     //   167: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput
/*     */     //   170: astore_1
/*     */     //   171: aload #19
/*     */     //   173: getfield L$0 : Ljava/lang/Object;
/*     */     //   176: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique
/*     */     //   179: astore_0
/*     */     //   180: aload #18
/*     */     //   182: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   185: aload #18
/*     */     //   187: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */     //   190: aconst_null
/*     */     //   191: iconst_0
/*     */     //   192: dconst_0
/*     */     //   193: invokestatic boxDouble : (D)Ljava/lang/Double;
/*     */     //   196: aconst_null
/*     */     //   197: aconst_null
/*     */     //   198: aconst_null
/*     */     //   199: aconst_null
/*     */     //   200: aconst_null
/*     */     //   201: aconst_null
/*     */     //   202: aconst_null
/*     */     //   203: aconst_null
/*     */     //   204: aconst_null
/*     */     //   205: aconst_null
/*     */     //   206: iconst_0
/*     */     //   207: aconst_null
/*     */     //   208: sipush #32763
/*     */     //   211: aconst_null
/*     */     //   212: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lcom/intellij/ml/llm/matterhorn/llm/LLM;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   215: astore #4
/*     */     //   217: getstatic com/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueParameters.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueParameters$Companion;
/*     */     //   220: new com/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueParameters
/*     */     //   223: dup
/*     */     //   224: aload #4
/*     */     //   226: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;)V
/*     */     //   229: aload_2
/*     */     //   230: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   233: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   236: aload #19
/*     */     //   238: aload #19
/*     */     //   240: aload_0
/*     */     //   241: putfield L$0 : Ljava/lang/Object;
/*     */     //   244: aload #19
/*     */     //   246: aload_1
/*     */     //   247: putfield L$1 : Ljava/lang/Object;
/*     */     //   250: aload #19
/*     */     //   252: aload_2
/*     */     //   253: putfield L$2 : Ljava/lang/Object;
/*     */     //   256: aload #19
/*     */     //   258: aload #4
/*     */     //   260: putfield L$3 : Ljava/lang/Object;
/*     */     //   263: aload #19
/*     */     //   265: iconst_2
/*     */     //   266: putfield label : I
/*     */     //   269: invokevirtual setupFromEnvironment : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueParameters;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   272: dup
/*     */     //   273: aload #20
/*     */     //   275: if_acmpne -> 325
/*     */     //   278: aload #20
/*     */     //   280: areturn
/*     */     //   281: aload #19
/*     */     //   283: getfield L$3 : Ljava/lang/Object;
/*     */     //   286: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */     //   289: astore #4
/*     */     //   291: aload #19
/*     */     //   293: getfield L$2 : Ljava/lang/Object;
/*     */     //   296: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   299: astore_2
/*     */     //   300: aload #19
/*     */     //   302: getfield L$1 : Ljava/lang/Object;
/*     */     //   305: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput
/*     */     //   308: astore_1
/*     */     //   309: aload #19
/*     */     //   311: getfield L$0 : Ljava/lang/Object;
/*     */     //   314: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique
/*     */     //   317: astore_0
/*     */     //   318: aload #18
/*     */     //   320: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   323: aload #18
/*     */     //   325: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueParameters
/*     */     //   328: astore #5
/*     */     //   330: aload_2
/*     */     //   331: aload_0
/*     */     //   332: getfield agentName : Ljava/lang/String;
/*     */     //   335: invokevirtual setTitle : (Ljava/lang/String;)V
/*     */     //   338: aload_1
/*     */     //   339: invokevirtual getCurrentState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   342: invokevirtual getIssueDescription : ()Ljava/util/List;
/*     */     //   345: checkcast java/util/Collection
/*     */     //   348: aload_1
/*     */     //   349: invokevirtual getCurrentState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   352: invokevirtual getObservations : ()Ljava/util/List;
/*     */     //   355: checkcast java/lang/Iterable
/*     */     //   358: astore #7
/*     */     //   360: astore #16
/*     */     //   362: iconst_0
/*     */     //   363: istore #8
/*     */     //   365: aload #7
/*     */     //   367: astore #9
/*     */     //   369: new java/util/ArrayList
/*     */     //   372: dup
/*     */     //   373: aload #7
/*     */     //   375: bipush #10
/*     */     //   377: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   380: invokespecial <init> : (I)V
/*     */     //   383: checkcast java/util/Collection
/*     */     //   386: astore #10
/*     */     //   388: iconst_0
/*     */     //   389: istore #11
/*     */     //   391: aload #9
/*     */     //   393: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   398: astore #12
/*     */     //   400: aload #12
/*     */     //   402: invokeinterface hasNext : ()Z
/*     */     //   407: ifeq -> 450
/*     */     //   410: aload #12
/*     */     //   412: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   417: astore #13
/*     */     //   419: aload #10
/*     */     //   421: aload #13
/*     */     //   423: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   426: astore #14
/*     */     //   428: astore #17
/*     */     //   430: iconst_0
/*     */     //   431: istore #15
/*     */     //   433: aload #14
/*     */     //   435: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   438: aload #17
/*     */     //   440: swap
/*     */     //   441: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   446: pop
/*     */     //   447: goto -> 400
/*     */     //   450: aload #10
/*     */     //   452: checkcast java/util/List
/*     */     //   455: nop
/*     */     //   456: aload #16
/*     */     //   458: swap
/*     */     //   459: checkcast java/lang/Iterable
/*     */     //   462: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   465: astore #6
/*     */     //   467: aload_1
/*     */     //   468: invokevirtual getActionsToRank : ()Ljava/util/List;
/*     */     //   471: astore #7
/*     */     //   473: new com/intellij/ml/llm/matterhorn/requests/SimpleRequest
/*     */     //   476: dup
/*     */     //   477: aload_0
/*     */     //   478: getfield systemPrompt : Ljava/lang/String;
/*     */     //   481: aload_0
/*     */     //   482: aload #6
/*     */     //   484: aload #7
/*     */     //   486: invokespecial choiceMessage : (Ljava/util/List;Ljava/util/List;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   489: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   492: aload #5
/*     */     //   494: invokevirtual getModelParameters : ()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   497: aconst_null
/*     */     //   498: bipush #8
/*     */     //   500: aconst_null
/*     */     //   501: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   504: astore #8
/*     */     //   506: new com/intellij/ml/llm/matterhorn/requests/UserReviewedRequest
/*     */     //   509: dup
/*     */     //   510: aload #8
/*     */     //   512: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
/*     */     //   515: aload #4
/*     */     //   517: new com/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique$produceArtifact$request$1
/*     */     //   520: dup
/*     */     //   521: aload_0
/*     */     //   522: aload #7
/*     */     //   524: aconst_null
/*     */     //   525: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
/*     */     //   528: checkcast kotlin/jvm/functions/Function3
/*     */     //   531: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function3;)V
/*     */     //   534: astore #9
/*     */     //   536: aload_2
/*     */     //   537: aload #9
/*     */     //   539: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
/*     */     //   542: iconst_0
/*     */     //   543: aload #19
/*     */     //   545: iconst_2
/*     */     //   546: aconst_null
/*     */     //   547: aload #19
/*     */     //   549: aload_0
/*     */     //   550: putfield L$0 : Ljava/lang/Object;
/*     */     //   553: aload #19
/*     */     //   555: aload #7
/*     */     //   557: putfield L$1 : Ljava/lang/Object;
/*     */     //   560: aload #19
/*     */     //   562: aconst_null
/*     */     //   563: putfield L$2 : Ljava/lang/Object;
/*     */     //   566: aload #19
/*     */     //   568: aconst_null
/*     */     //   569: putfield L$3 : Ljava/lang/Object;
/*     */     //   572: aload #19
/*     */     //   574: iconst_3
/*     */     //   575: putfield label : I
/*     */     //   578: invokestatic sendToGrazie$default : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   581: dup
/*     */     //   582: aload #20
/*     */     //   584: if_acmpne -> 616
/*     */     //   587: aload #20
/*     */     //   589: areturn
/*     */     //   590: aload #19
/*     */     //   592: getfield L$1 : Ljava/lang/Object;
/*     */     //   595: checkcast java/util/List
/*     */     //   598: astore #7
/*     */     //   600: aload #19
/*     */     //   602: getfield L$0 : Ljava/lang/Object;
/*     */     //   605: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique
/*     */     //   608: astore_0
/*     */     //   609: aload #18
/*     */     //   611: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   614: aload #18
/*     */     //   616: checkcast java/lang/String
/*     */     //   619: astore #10
/*     */     //   621: getstatic kotlinx/serialization/json/Json.Default : Lkotlinx/serialization/json/Json$Default;
/*     */     //   624: checkcast kotlinx/serialization/json/Json
/*     */     //   627: astore #12
/*     */     //   629: iconst_0
/*     */     //   630: istore #13
/*     */     //   632: aload #12
/*     */     //   634: aload #12
/*     */     //   636: invokevirtual getSerializersModule : ()Lkotlinx/serialization/modules/SerializersModule;
/*     */     //   639: pop
/*     */     //   640: getstatic com/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueModelResponse.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueModelResponse$Companion;
/*     */     //   643: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   646: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   649: aload #10
/*     */     //   651: invokevirtual decodeFromString : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   654: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueModelResponse
/*     */     //   657: astore #11
/*     */     //   659: new com/intellij/ml/llm/matterhorn/ArtifactResponse
/*     */     //   662: dup
/*     */     //   663: new com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse
/*     */     //   666: dup
/*     */     //   667: aload #7
/*     */     //   669: aload_0
/*     */     //   670: aload #11
/*     */     //   672: aload #7
/*     */     //   674: invokevirtual getRanks : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueModelResponse;Ljava/util/List;)Ljava/util/List;
/*     */     //   677: invokespecial <init> : (Ljava/util/List;Ljava/util/List;)V
/*     */     //   680: aconst_null
/*     */     //   681: iconst_2
/*     */     //   682: aconst_null
/*     */     //   683: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   686: areturn
/*     */     //   687: new java/lang/IllegalStateException
/*     */     //   690: dup
/*     */     //   691: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   694: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   697: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #49	-> 60
/*     */     //   #53	-> 101
/*     */     //   #49	-> 150
/*     */     //   #53	-> 187
/*     */     //   #54	-> 217
/*     */     //   #49	-> 278
/*     */     //   #56	-> 330
/*     */     //   #57	-> 338
/*     */     //   #170	-> 365
/*     */     //   #171	-> 391
/*     */     //   #172	-> 419
/*     */     //   #57	-> 433
/*     */     //   #172	-> 441
/*     */     //   #173	-> 450
/*     */     //   #170	-> 455
/*     */     //   #57	-> 462
/*     */     //   #58	-> 467
/*     */     //   #59	-> 473
/*     */     //   #60	-> 506
/*     */     //   #74	-> 536
/*     */     //   #49	-> 587
/*     */     //   #75	-> 621
/*     */     //   #174	-> 632
/*     */     //   #75	-> 654
/*     */     //   #77	-> 659
/*     */     //   #49	-> 687
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	52	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique;
/*     */     //   180	101	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique;
/*     */     //   318	272	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique;
/*     */     //   609	78	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique;
/*     */     //   101	52	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;
/*     */     //   171	110	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;
/*     */     //   309	129	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;
/*     */     //   438	18	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;
/*     */     //   456	17	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;
/*     */     //   101	52	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   162	119	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   300	138	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   438	18	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   456	125	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   217	64	4	defaultModel	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   291	147	4	defaultModel	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   438	18	4	defaultModel	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   456	80	4	defaultModel	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   330	108	5	rankingCritiqueParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueParameters;
/*     */     //   438	18	5	rankingCritiqueParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueParameters;
/*     */     //   456	50	5	rankingCritiqueParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueParameters;
/*     */     //   467	39	6	historyNoDemo	Ljava/util/List;
/*     */     //   362	26	7	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   473	117	7	actionsToRank	Ljava/util/List;
/*     */     //   600	87	7	actionsToRank	Ljava/util/List;
/*     */     //   506	30	8	simpleRequest	Lcom/intellij/ml/llm/matterhorn/requests/SimpleRequest;
/*     */     //   388	12	9	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   536	45	9	request	Lcom/intellij/ml/llm/matterhorn/requests/UserReviewedRequest;
/*     */     //   388	64	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   621	66	10	response	Ljava/lang/String;
/*     */     //   659	28	11	parsed	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueModelResponse;
/*     */     //   629	25	12	this_$iv	Lkotlinx/serialization/json/Json;
/*     */     //   419	28	13	item$iv$iv	Ljava/lang/Object;
/*     */     //   430	8	14	it	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   433	5	15	$i$a$-map-RankingCritique$produceArtifact$historyNoDemo$1	I
/*     */     //   391	61	11	$i$f$mapTo	I
/*     */     //   365	91	8	$i$f$map	I
/*     */     //   632	22	13	$i$f$decodeFromString	I
/*     */     //   0	698	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	637	19	$continuation	Lkotlin/coroutines/Continuation;
/*  47 */     //   57	630	18	$result	Ljava/lang/Object; } @NotNull public final String getAgentName() { return this.agentName; } @DebugMetadata(f = "RankingCritique.kt", l = {53, 54, 74}, i = {0, 0, 0, 1, 1, 1, 1, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"}, n = {"this", "input", "context", "this", "input", "context", "defaultModel", "this", "actionsToRank"}, m = "produceArtifact", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.RankingCritique")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RankingCritique$produceArtifact$1 extends ContinuationImpl {
/*     */     Object L$0; Object L$1; Object L$2; Object L$3; int label; RankingCritique$produceArtifact$1(Continuation $completion) { super($completion); } @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RankingCritique.this.produceArtifact((CritiqueInput)null, (ExecutionContext)null, (Continuation<? super ArtifactResponse<CritiqueResponse>>)this); }
/*     */   } @DebugMetadata(f = "RankingCritique.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.RankingCritique$produceArtifact$request$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "answer", "", "attempt", ""})
/*     */   @SourceDebugExtension({"SMAP\nRankingCritique.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankingCritique.kt\ncom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique$produceArtifact$request$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,169:1\n222#2:170\n*S KotlinDebug\n*F\n+ 1 RankingCritique.kt\ncom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique$produceArtifact$request$1\n*L\n63#1:170\n*E\n"})
/*     */   static final class RankingCritique$produceArtifact$request$1 extends SuspendLambda implements Function3<String, Integer, Continuation<? super ReviewerResponse>, Object> {
/*     */     public final Object invokeSuspend(Object $result) { String answer;
/*     */       RankingCritiqueModelResponse parsed;
/*  60 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); answer = (String)this.L$0;
/*     */           
/*     */           try {
/*  63 */             Json this_$iv = (Json)Json.Default; int $i$f$decodeFromString = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 170 */             this_$iv.getSerializersModule(); parsed = (RankingCritiqueModelResponse)this_$iv.decodeFromString((DeserializationStrategy)RankingCritiqueModelResponse.Companion.serializer(), answer);
/*     */           } catch (SerializationException e) {
/*     */             return ReviewerResponse.Companion.error$default(ReviewerResponse.Companion, "You should answer with a valid json. Please return only json object without any additional text or symbols. Failed to parse your response, error: " + e.getMessage(), null, 2, null);
/*     */           } 
/*     */           try {
/*     */             RankingCritique.this.getRanks(parsed, this.$actionsToRank);
/*     */           } catch (Exception e) {
/*     */             if (e.getMessage() == null)
/*     */               e.getMessage(); 
/*     */             return ReviewerResponse.Companion.error$default((ReviewerResponse.Companion)e.getMessage(), e.toString(), null, 2, null);
/*     */           } 
/*     */           return ReviewerResponse.Companion.ok(); }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */     
/*     */     int label;
/*     */     
/*     */     RankingCritique$produceArtifact$request$1(List<MatterhornChatElement> $actionsToRank, Continuation $completion) {
/*     */       super(3, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(String p1, int p2, Continuation<? super RankingCritique$produceArtifact$request$1> p3) {
/*     */       RankingCritique$produceArtifact$request$1 rankingCritique$produceArtifact$request$1 = new RankingCritique$produceArtifact$request$1(this.$actionsToRank, p3);
/*     */       rankingCritique$produceArtifact$request$1.L$0 = p1;
/*     */       return rankingCritique$produceArtifact$request$1.invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private final MatterhornChatMessage choiceMessage(List historyNoDemo, List actionsToRank) {
/*     */     String optionsToRankString = CollectionsKt.joinToString$default(CollectionsKt.withIndex(actionsToRank), "\n", null, null, 0, null, this::choiceMessage$lambda$1, 30, null);
/*     */     return MatterhornChatKt.toUserMessage(CollectionsKt.joinToString$default(historyNoDemo, "\n", null, null, 0, null, null, 62, null) + "\n" + CollectionsKt.joinToString$default(historyNoDemo, "\n", null, null, 0, null, null, 62, null));
/*     */   }
/*     */   
/*     */   private static final CharSequence choiceMessage$lambda$1(RankingCritique this$0, IndexedValue it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return this$0.commandDirective + " " + this$0.commandDirective + ":\n" + it.getIndex() + 1 + "\n";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<Integer> getRanks(@NotNull RankingCritiqueModelResponse response, @NotNull List actionsToRank) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'response'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc_w 'actionsToRank'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_1
/*     */     //   15: invokevirtual getRanks : ()Ljava/util/List;
/*     */     //   18: invokeinterface size : ()I
/*     */     //   23: aload_2
/*     */     //   24: invokeinterface size : ()I
/*     */     //   29: if_icmpeq -> 60
/*     */     //   32: new java/lang/IllegalArgumentException
/*     */     //   35: dup
/*     */     //   36: aload_2
/*     */     //   37: invokeinterface size : ()I
/*     */     //   42: aload_1
/*     */     //   43: invokevirtual getRanks : ()Ljava/util/List;
/*     */     //   46: invokeinterface size : ()I
/*     */     //   51: <illegal opcode> makeConcatWithConstants : (II)Ljava/lang/String;
/*     */     //   56: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   59: athrow
/*     */     //   60: aload_2
/*     */     //   61: invokeinterface size : ()I
/*     */     //   66: istore #4
/*     */     //   68: new java/util/ArrayList
/*     */     //   71: dup
/*     */     //   72: iload #4
/*     */     //   74: invokespecial <init> : (I)V
/*     */     //   77: astore #5
/*     */     //   79: iconst_0
/*     */     //   80: istore #6
/*     */     //   82: iload #6
/*     */     //   84: iload #4
/*     */     //   86: if_icmpge -> 118
/*     */     //   89: iload #6
/*     */     //   91: istore #7
/*     */     //   93: aload #5
/*     */     //   95: iload #7
/*     */     //   97: istore #8
/*     */     //   99: astore #26
/*     */     //   101: iconst_0
/*     */     //   102: istore #9
/*     */     //   104: aconst_null
/*     */     //   105: aload #26
/*     */     //   107: swap
/*     */     //   108: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   111: pop
/*     */     //   112: iinc #6, 1
/*     */     //   115: goto -> 82
/*     */     //   118: aload #5
/*     */     //   120: checkcast java/util/List
/*     */     //   123: astore_3
/*     */     //   124: aload_1
/*     */     //   125: invokevirtual getRanks : ()Ljava/util/List;
/*     */     //   128: checkcast java/lang/Iterable
/*     */     //   131: astore #5
/*     */     //   133: iconst_0
/*     */     //   134: istore #6
/*     */     //   136: aload #5
/*     */     //   138: new com/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique$getRanks$$inlined$sortedBy$1
/*     */     //   141: dup
/*     */     //   142: invokespecial <init> : ()V
/*     */     //   145: checkcast java/util/Comparator
/*     */     //   148: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*     */     //   151: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   156: astore #4
/*     */     //   158: aload #4
/*     */     //   160: invokeinterface hasNext : ()Z
/*     */     //   165: ifeq -> 379
/*     */     //   168: aload #4
/*     */     //   170: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   175: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueRank
/*     */     //   178: astore #5
/*     */     //   180: aload #5
/*     */     //   182: invokevirtual getCommand : ()Ljava/lang/String;
/*     */     //   185: checkcast java/lang/CharSequence
/*     */     //   188: iconst_1
/*     */     //   189: anewarray java/lang/String
/*     */     //   192: astore #8
/*     */     //   194: aload #8
/*     */     //   196: iconst_0
/*     */     //   197: aload_0
/*     */     //   198: getfield commandDirective : Ljava/lang/String;
/*     */     //   201: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   206: aastore
/*     */     //   207: aload #8
/*     */     //   209: iconst_0
/*     */     //   210: iconst_0
/*     */     //   211: bipush #6
/*     */     //   213: aconst_null
/*     */     //   214: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*     */     //   217: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   220: checkcast java/lang/String
/*     */     //   223: invokestatic toIntOrNull : (Ljava/lang/String;)Ljava/lang/Integer;
/*     */     //   226: dup
/*     */     //   227: ifnull -> 236
/*     */     //   230: invokevirtual intValue : ()I
/*     */     //   233: goto -> 263
/*     */     //   236: pop
/*     */     //   237: new java/lang/NumberFormatException
/*     */     //   240: dup
/*     */     //   241: aload_0
/*     */     //   242: getfield commandDirective : Ljava/lang/String;
/*     */     //   245: aload #5
/*     */     //   247: invokevirtual getCommand : ()Ljava/lang/String;
/*     */     //   250: aload_0
/*     */     //   251: getfield commandDirective : Ljava/lang/String;
/*     */     //   254: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   259: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   262: athrow
/*     */     //   263: istore #6
/*     */     //   265: iconst_1
/*     */     //   266: iload #6
/*     */     //   268: if_icmpgt -> 290
/*     */     //   271: iload #6
/*     */     //   273: aload_2
/*     */     //   274: invokeinterface size : ()I
/*     */     //   279: if_icmpgt -> 286
/*     */     //   282: iconst_1
/*     */     //   283: goto -> 291
/*     */     //   286: iconst_0
/*     */     //   287: goto -> 291
/*     */     //   290: iconst_0
/*     */     //   291: ifne -> 322
/*     */     //   294: new java/lang/IndexOutOfBoundsException
/*     */     //   297: dup
/*     */     //   298: aload_0
/*     */     //   299: getfield commandDirective : Ljava/lang/String;
/*     */     //   302: aload_2
/*     */     //   303: invokeinterface size : ()I
/*     */     //   308: aload #5
/*     */     //   310: invokevirtual getCommand : ()Ljava/lang/String;
/*     */     //   313: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
/*     */     //   318: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   321: athrow
/*     */     //   322: iload #6
/*     */     //   324: iconst_1
/*     */     //   325: isub
/*     */     //   326: istore #7
/*     */     //   328: aload_3
/*     */     //   329: iload #7
/*     */     //   331: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   336: ifnull -> 358
/*     */     //   339: new java/lang/IllegalArgumentException
/*     */     //   342: dup
/*     */     //   343: aload_0
/*     */     //   344: getfield commandDirective : Ljava/lang/String;
/*     */     //   347: iload #6
/*     */     //   349: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
/*     */     //   354: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   357: athrow
/*     */     //   358: aload_3
/*     */     //   359: iload #7
/*     */     //   361: aload #5
/*     */     //   363: invokevirtual getRank : ()D
/*     */     //   366: d2i
/*     */     //   367: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   370: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   375: pop
/*     */     //   376: goto -> 158
/*     */     //   379: nop
/*     */     //   380: aload_3
/*     */     //   381: checkcast java/lang/Iterable
/*     */     //   384: astore #4
/*     */     //   386: iconst_0
/*     */     //   387: istore #5
/*     */     //   389: aload #4
/*     */     //   391: astore #6
/*     */     //   393: new java/util/ArrayList
/*     */     //   396: dup
/*     */     //   397: aload #4
/*     */     //   399: bipush #10
/*     */     //   401: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   404: invokespecial <init> : (I)V
/*     */     //   407: checkcast java/util/Collection
/*     */     //   410: astore #7
/*     */     //   412: iconst_0
/*     */     //   413: istore #8
/*     */     //   415: aload #6
/*     */     //   417: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   422: astore #9
/*     */     //   424: aload #9
/*     */     //   426: invokeinterface hasNext : ()Z
/*     */     //   431: ifeq -> 481
/*     */     //   434: aload #9
/*     */     //   436: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   441: astore #10
/*     */     //   443: aload #7
/*     */     //   445: aload #10
/*     */     //   447: checkcast java/lang/Integer
/*     */     //   450: astore #11
/*     */     //   452: astore #26
/*     */     //   454: iconst_0
/*     */     //   455: istore #12
/*     */     //   457: aload #11
/*     */     //   459: dup
/*     */     //   460: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   463: invokevirtual intValue : ()I
/*     */     //   466: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   469: aload #26
/*     */     //   471: swap
/*     */     //   472: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   477: pop
/*     */     //   478: goto -> 424
/*     */     //   481: aload #7
/*     */     //   483: checkcast java/util/List
/*     */     //   486: nop
/*     */     //   487: areturn
/*     */     //   488: astore #5
/*     */     //   490: aload_3
/*     */     //   491: checkcast java/lang/Iterable
/*     */     //   494: astore #7
/*     */     //   496: iconst_0
/*     */     //   497: istore #8
/*     */     //   499: aload #7
/*     */     //   501: astore #9
/*     */     //   503: new java/util/ArrayList
/*     */     //   506: dup
/*     */     //   507: invokespecial <init> : ()V
/*     */     //   510: checkcast java/util/Collection
/*     */     //   513: astore #10
/*     */     //   515: iconst_0
/*     */     //   516: istore #11
/*     */     //   518: aload #9
/*     */     //   520: astore #12
/*     */     //   522: iconst_0
/*     */     //   523: istore #13
/*     */     //   525: iconst_0
/*     */     //   526: istore #14
/*     */     //   528: aload #12
/*     */     //   530: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   535: astore #15
/*     */     //   537: aload #15
/*     */     //   539: invokeinterface hasNext : ()Z
/*     */     //   544: ifeq -> 639
/*     */     //   547: aload #15
/*     */     //   549: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   554: astore #16
/*     */     //   556: iload #14
/*     */     //   558: iinc #14, 1
/*     */     //   561: istore #17
/*     */     //   563: iload #17
/*     */     //   565: ifge -> 571
/*     */     //   568: invokestatic throwIndexOverflow : ()V
/*     */     //   571: iload #17
/*     */     //   573: aload #16
/*     */     //   575: astore #18
/*     */     //   577: istore #19
/*     */     //   579: iconst_0
/*     */     //   580: istore #20
/*     */     //   582: iload #19
/*     */     //   584: aload #18
/*     */     //   586: checkcast java/lang/Integer
/*     */     //   589: astore #21
/*     */     //   591: istore #22
/*     */     //   593: iconst_0
/*     */     //   594: istore #23
/*     */     //   596: aload #21
/*     */     //   598: ifnonnull -> 611
/*     */     //   601: iload #22
/*     */     //   603: iconst_1
/*     */     //   604: iadd
/*     */     //   605: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   608: goto -> 612
/*     */     //   611: aconst_null
/*     */     //   612: dup
/*     */     //   613: ifnull -> 634
/*     */     //   616: astore #24
/*     */     //   618: iconst_0
/*     */     //   619: istore #25
/*     */     //   621: aload #10
/*     */     //   623: aload #24
/*     */     //   625: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   630: pop
/*     */     //   631: goto -> 635
/*     */     //   634: pop
/*     */     //   635: nop
/*     */     //   636: goto -> 537
/*     */     //   639: nop
/*     */     //   640: aload #10
/*     */     //   642: checkcast java/util/List
/*     */     //   645: nop
/*     */     //   646: astore #6
/*     */     //   648: new java/lang/IllegalArgumentException
/*     */     //   651: dup
/*     */     //   652: aload #6
/*     */     //   654: checkcast java/lang/Iterable
/*     */     //   657: ldc_w ', '
/*     */     //   660: checkcast java/lang/CharSequence
/*     */     //   663: aconst_null
/*     */     //   664: aconst_null
/*     */     //   665: iconst_0
/*     */     //   666: aconst_null
/*     */     //   667: aconst_null
/*     */     //   668: bipush #62
/*     */     //   670: aconst_null
/*     */     //   671: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   674: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   679: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   682: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #86	-> 14
/*     */     //   #87	-> 32
/*     */     //   #89	-> 60
/*     */     //   #175	-> 99
/*     */     //   #89	-> 104
/*     */     //   #89	-> 108
/*     */     //   #89	-> 123
/*     */     //   #90	-> 124
/*     */     //   #176	-> 136
/*     */     //   #176	-> 148
/*     */     //   #90	-> 151
/*     */     //   #91	-> 180
/*     */     //   #92	-> 237
/*     */     //   #91	-> 263
/*     */     //   #93	-> 265
/*     */     //   #94	-> 294
/*     */     //   #96	-> 322
/*     */     //   #97	-> 328
/*     */     //   #98	-> 339
/*     */     //   #100	-> 358
/*     */     //   #102	-> 379
/*     */     //   #103	-> 380
/*     */     //   #177	-> 389
/*     */     //   #178	-> 415
/*     */     //   #179	-> 443
/*     */     //   #103	-> 457
/*     */     //   #179	-> 472
/*     */     //   #180	-> 481
/*     */     //   #177	-> 486
/*     */     //   #103	-> 487
/*     */     //   #104	-> 488
/*     */     //   #105	-> 490
/*     */     //   #181	-> 499
/*     */     //   #191	-> 518
/*     */     //   #192	-> 525
/*     */     //   #193	-> 528
/*     */     //   #193	-> 573
/*     */     //   #191	-> 582
/*     */     //   #105	-> 596
/*     */     //   #191	-> 612
/*     */     //   #194	-> 618
/*     */     //   #191	-> 621
/*     */     //   #191	-> 631
/*     */     //   #191	-> 634
/*     */     //   #193	-> 635
/*     */     //   #195	-> 639
/*     */     //   #196	-> 640
/*     */     //   #181	-> 645
/*     */     //   #105	-> 646
/*     */     //   #106	-> 648
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   104	1	9	$i$a$-MutableList-RankingCritique$getRanks$ranks$1	I
/*     */     //   101	4	8	it	I
/*     */     //   136	15	6	$i$f$sortedBy	I
/*     */     //   133	18	5	$this$sortedBy$iv	Ljava/lang/Iterable;
/*     */     //   265	110	6	actionIdx	I
/*     */     //   328	47	7	actionZeroBasedIdx	I
/*     */     //   180	195	5	item	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueRank;
/*     */     //   457	9	12	$i$a$-map-RankingCritique$getRanks$2	I
/*     */     //   454	12	11	it	Ljava/lang/Integer;
/*     */     //   443	35	10	item$iv$iv	Ljava/lang/Object;
/*     */     //   415	68	8	$i$f$mapTo	I
/*     */     //   412	71	6	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   412	71	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   389	98	5	$i$f$map	I
/*     */     //   386	101	4	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   596	16	23	$i$a$-mapIndexedNotNull-RankingCritique$getRanks$nullOneBasedIdxs$1	I
/*     */     //   593	19	22	index	I
/*     */     //   593	19	21	value	Ljava/lang/Integer;
/*     */     //   621	10	25	$i$a$-let-CollectionsKt___CollectionsKt$mapIndexedNotNullTo$1$1$iv$iv	I
/*     */     //   618	13	24	it$iv$iv	Ljava/lang/Object;
/*     */     //   582	53	20	$i$a$-forEachIndexed-CollectionsKt___CollectionsKt$mapIndexedNotNullTo$1$iv$iv	I
/*     */     //   579	56	19	index$iv$iv	I
/*     */     //   579	56	18	element$iv$iv	Ljava/lang/Object;
/*     */     //   556	80	16	item$iv$iv$iv	Ljava/lang/Object;
/*     */     //   525	115	13	$i$f$forEachIndexed	I
/*     */     //   528	112	14	index$iv$iv$iv	I
/*     */     //   522	118	12	$this$forEachIndexed$iv$iv$iv	Ljava/lang/Iterable;
/*     */     //   518	124	11	$i$f$mapIndexedNotNullTo	I
/*     */     //   515	127	9	$this$mapIndexedNotNullTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   515	127	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   499	147	8	$i$f$mapIndexedNotNull	I
/*     */     //   496	150	7	$this$mapIndexedNotNull$iv	Ljava/lang/Iterable;
/*     */     //   648	35	6	nullOneBasedIdxs	Ljava/util/List;
/*     */     //   490	193	5	e	Ljava/lang/NullPointerException;
/*     */     //   124	559	3	ranks	Ljava/util/List;
/*     */     //   0	683	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritique;
/*     */     //   0	683	1	response	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueModelResponse;
/*     */     //   0	683	2	actionsToRank	Ljava/util/List;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   379	488	488	java/lang/NullPointerException
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private final String commandDirective = "COMMAND";
/*     */   @NotNull
/*     */   private final String systemPrompt = "\nSETTING: You are a critic evaluating an autonomous programmer who interacts directly with the command line through a specialized interface. The programmer's objective is to resolve a specific issue within a given repository.\n\nYou will receive a history of the programmer's interactions with the environment, which may be partial or complete. Your task is to critically assess the performance of several proposed commands and rank them based on their effectiveness in resolving the issue.\n\nInstructions:\n\nEvaluation Criteria:\n- Superior Performance: The command demonstrates a highly logical and efficient approach towards resolving the issue, potentially correcting previous errors or making significant progress. The command should also follow best practices in code style and be free of potential bugs.\n- Inferior Performance: The command fails to contribute to resolving the issue, introduces new problems, or exhibits poor code style and potential bugs.\n\nScoring:\nScore the provided commands from most effective to least effective based on their likelihood of resolving the issue. Use the following scale for individual command scores:\n1: The command is ineffective, irrelevant, detrimental to solving the issue, exhibits poor code style, or introduces potential bugs.\n5: The command is optimal, demonstrating logical execution, significant contribution to solving the issue, clear and maintainable code style, and no potential bugs.\nNote: Only commands that are executed in the most logical and efficient manner, with no possible better alternative, should receive the highest score. Corrective actions must be well-justified and precisely executed to be rated highly.\n\nConsiderations:\n- Relevance: Assess the effectiveness, correctness, and appropriateness of each command within the current context.\n- Error Correction: Commands that effectively address and correct previous mistakes should be considered favorably, provided they are executed on the correct file and in the proper sequence.\n- Command Execution: Ensure each command can be executed without errors and is appropriate for the task at hand.\n- Command Sequence: Ensure commands are executed in a logical and sequential manner. For instance, if the programmer needs to modify a different file, they must open the file before making changes.\n- Command Validity: Ensure the command is valid and executable.\n- Bug Prevention: Check for potential bugs introduced by each command and consider how well the command mitigates or avoids these issues.\n- Code Style: Evaluate the clarity and maintainability of the code. Favor commands that result in clean, readable, and well-structured code. Prevent poor code style and practices.\n\nRanking:\nProvide overall rank for commands, so that command with rank 0 has the best rank and worser models have more higher ranks. Ranks mustn't repeat, so there are possible only one command with rank 0.\n\nRESPONSE FORMAT:\n{\n  \"scores\": [\n      {\"command\": \"" + this.commandDirective + " <Provide id of the command>\", \"comment\": <Provide a detailed reason for your evaluation of this command, noting any potential for improvement, potential bugs, and code style issues>, \"score\": <command-score>,\n      {\"command\": \"" + this.commandDirective + " <Provide id of the command>\", \"comment\": <Provide a detailed reason for your evaluation of this command, noting any potential for improvement, potential bugs, and code style issues>, \"score\": <command-score>,\n      ...\n  ],\n  \"ranks\": \n      {\"command\" \"" + this.commandDirective + " <Provide id of the command>\", \"comment\": <Provide a detailed reason for ranking this command as the best>, \"rank\": <command-rank>},\n      {\"command\" \"" + this.commandDirective + " <Provide id of the command>\", \"comment\": <Provide a detailed reason for ranking this command as the second best>, \"rank\": <command-rank>},\n      ...\n}\n";
/*     */   
/*     */   @NotNull
/*     */   public final String getCommandDirective() {
/*     */     return this.commandDirective;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\critique\RankingCritique.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */