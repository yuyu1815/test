/*     */ package com.intellij.ml.llm.matterhorn.ej.core.critique;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessageKind;
/*     */ import com.intellij.ml.llm.matterhorn.requests.ReviewerResponse;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
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
/*     */ import kotlin.text.StringsKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\007¢\006\004\b\004\020\005J$\020\f\032\b\022\004\022\0020\0030\r2\006\020\016\032\0020\0022\006\020\017\032\0020\020H@¢\006\002\020\021J$\020\022\032\0020\0232\f\020\024\032\b\022\004\022\0020\0260\0252\f\020\027\032\b\022\004\022\0020\0260\025H\002J\036\020\030\032\0020\0312\006\020\032\032\0020\0072\f\020\027\032\b\022\004\022\0020\0260\025H\002R\024\020\006\032\0020\007XD¢\006\b\n\000\032\004\b\b\020\tR\016\020\n\032\0020\007XD¢\006\002\n\000R\016\020\013\032\0020\007XD¢\006\002\n\000R\016\020\033\032\0020\007X\004¢\006\002\n\000¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/critique/EditCritique;", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse;", "<init>", "()V", "agentName", "", "getAgentName", "()Ljava/lang/String;", "commandDirective", "bestCommandDirective", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "input", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildChoiceMessage", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;", "historyNoDemo", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "actionsToRank", "parseBestAction", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/EditCritiqueResponseParseResult;", "response", "systemPrompt", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nEditCritique.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCritique.kt\ncom/intellij/ml/llm/matterhorn/ej/core/critique/EditCritique\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1557#2:149\n1628#2,3:150\n1557#2:153\n1628#2,3:154\n1557#2:157\n1628#2,3:158\n1557#2:161\n1628#2,3:162\n774#2:165\n865#2,2:166\n*S KotlinDebug\n*F\n+ 1 EditCritique.kt\ncom/intellij/ml/llm/matterhorn/ej/core/critique/EditCritique\n*L\n71#1:149\n71#1:150,3\n82#1:153\n82#1:154,3\n87#1:157\n87#1:158,3\n92#1:161\n92#1:162,3\n92#1:165\n92#1:166,2\n*E\n"})
/*     */ public final class EditCritique
/*     */   implements ArtifactRequestExecutor<CritiqueInput, CritiqueResponse>
/*     */ {
/*     */   @NotNull
/*  52 */   private final String agentName = "edit_critique"; @NotNull public final String getAgentName() { return this.agentName; }
/*     */    @NotNull
/*  54 */   private final String commandDirective = "COMMAND"; @NotNull
/*  55 */   private final String bestCommandDirective = "BEST COMMAND:";
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object produceArtifact(@NotNull CritiqueInput input, @NotNull ExecutionContext context, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/critique/EditCritique$produceArtifact$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/EditCritique$produceArtifact$1
/*     */     //   11: astore #28
/*     */     //   13: aload #28
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #28
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/critique/EditCritique$produceArtifact$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/EditCritique;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #28
/*     */     //   50: aload #28
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #27
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #29
/*     */     //   62: aload #28
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 857, 0 -> 96, 1 -> 212, 2 -> 333, 3 -> 659
/*     */     //   96: aload #27
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_1
/*     */     //   102: invokevirtual getActionsToRank : ()Ljava/util/List;
/*     */     //   105: invokeinterface size : ()I
/*     */     //   110: iconst_1
/*     */     //   111: if_icmpgt -> 152
/*     */     //   114: new com/intellij/ml/llm/matterhorn/ArtifactResponse
/*     */     //   117: dup
/*     */     //   118: new com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse
/*     */     //   121: dup
/*     */     //   122: aload_1
/*     */     //   123: invokevirtual getActionsToRank : ()Ljava/util/List;
/*     */     //   126: aload_1
/*     */     //   127: invokevirtual getActionsToRank : ()Ljava/util/List;
/*     */     //   130: checkcast java/util/Collection
/*     */     //   133: invokestatic getIndices : (Ljava/util/Collection;)Lkotlin/ranges/IntRange;
/*     */     //   136: checkcast java/lang/Iterable
/*     */     //   139: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   142: invokespecial <init> : (Ljava/util/List;Ljava/util/List;)V
/*     */     //   145: aconst_null
/*     */     //   146: iconst_2
/*     */     //   147: aconst_null
/*     */     //   148: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   151: areturn
/*     */     //   152: aload_2
/*     */     //   153: aload_0
/*     */     //   154: getfield agentName : Ljava/lang/String;
/*     */     //   157: invokevirtual setTitle : (Ljava/lang/String;)V
/*     */     //   160: getstatic com/intellij/ml/llm/matterhorn/llm/ModelParameters.Companion : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion;
/*     */     //   163: aload_0
/*     */     //   164: getfield agentName : Ljava/lang/String;
/*     */     //   167: aload_2
/*     */     //   168: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   171: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   174: aload #28
/*     */     //   176: aload #28
/*     */     //   178: aload_0
/*     */     //   179: putfield L$0 : Ljava/lang/Object;
/*     */     //   182: aload #28
/*     */     //   184: aload_1
/*     */     //   185: putfield L$1 : Ljava/lang/Object;
/*     */     //   188: aload #28
/*     */     //   190: aload_2
/*     */     //   191: putfield L$2 : Ljava/lang/Object;
/*     */     //   194: aload #28
/*     */     //   196: iconst_1
/*     */     //   197: putfield label : I
/*     */     //   200: invokevirtual getDefaultModel : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   203: dup
/*     */     //   204: aload #29
/*     */     //   206: if_acmpne -> 246
/*     */     //   209: aload #29
/*     */     //   211: areturn
/*     */     //   212: aload #28
/*     */     //   214: getfield L$2 : Ljava/lang/Object;
/*     */     //   217: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   220: astore_2
/*     */     //   221: aload #28
/*     */     //   223: getfield L$1 : Ljava/lang/Object;
/*     */     //   226: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput
/*     */     //   229: astore_1
/*     */     //   230: aload #28
/*     */     //   232: getfield L$0 : Ljava/lang/Object;
/*     */     //   235: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/EditCritique
/*     */     //   238: astore_0
/*     */     //   239: aload #27
/*     */     //   241: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   244: aload #27
/*     */     //   246: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */     //   249: aconst_null
/*     */     //   250: iconst_0
/*     */     //   251: dconst_0
/*     */     //   252: invokestatic boxDouble : (D)Ljava/lang/Double;
/*     */     //   255: aconst_null
/*     */     //   256: aconst_null
/*     */     //   257: aconst_null
/*     */     //   258: aconst_null
/*     */     //   259: aconst_null
/*     */     //   260: aconst_null
/*     */     //   261: aconst_null
/*     */     //   262: aconst_null
/*     */     //   263: aconst_null
/*     */     //   264: aconst_null
/*     */     //   265: iconst_0
/*     */     //   266: aconst_null
/*     */     //   267: sipush #32763
/*     */     //   270: aconst_null
/*     */     //   271: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lcom/intellij/ml/llm/matterhorn/llm/LLM;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   274: astore #4
/*     */     //   276: getstatic com/intellij/ml/llm/matterhorn/ej/core/critique/EditCritiqueParameters.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/critique/EditCritiqueParameters$Companion;
/*     */     //   279: new com/intellij/ml/llm/matterhorn/ej/core/critique/EditCritiqueParameters
/*     */     //   282: dup
/*     */     //   283: aload #4
/*     */     //   285: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;)V
/*     */     //   288: aload_2
/*     */     //   289: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   292: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   295: aload #28
/*     */     //   297: aload #28
/*     */     //   299: aload_0
/*     */     //   300: putfield L$0 : Ljava/lang/Object;
/*     */     //   303: aload #28
/*     */     //   305: aload_1
/*     */     //   306: putfield L$1 : Ljava/lang/Object;
/*     */     //   309: aload #28
/*     */     //   311: aload_2
/*     */     //   312: putfield L$2 : Ljava/lang/Object;
/*     */     //   315: aload #28
/*     */     //   317: iconst_2
/*     */     //   318: putfield label : I
/*     */     //   321: invokevirtual setupFromEnvironment : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/EditCritiqueParameters;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   324: dup
/*     */     //   325: aload #29
/*     */     //   327: if_acmpne -> 367
/*     */     //   330: aload #29
/*     */     //   332: areturn
/*     */     //   333: aload #28
/*     */     //   335: getfield L$2 : Ljava/lang/Object;
/*     */     //   338: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   341: astore_2
/*     */     //   342: aload #28
/*     */     //   344: getfield L$1 : Ljava/lang/Object;
/*     */     //   347: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput
/*     */     //   350: astore_1
/*     */     //   351: aload #28
/*     */     //   353: getfield L$0 : Ljava/lang/Object;
/*     */     //   356: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/EditCritique
/*     */     //   359: astore_0
/*     */     //   360: aload #27
/*     */     //   362: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   365: aload #27
/*     */     //   367: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/EditCritiqueParameters
/*     */     //   370: astore #5
/*     */     //   372: aload_1
/*     */     //   373: invokevirtual getCurrentState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   376: invokevirtual getObservations : ()Ljava/util/List;
/*     */     //   379: astore #6
/*     */     //   381: aload_1
/*     */     //   382: invokevirtual getActionsToRank : ()Ljava/util/List;
/*     */     //   385: astore #7
/*     */     //   387: aload_1
/*     */     //   388: invokevirtual getCurrentState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   391: invokevirtual getDemo : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   394: dup
/*     */     //   395: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   398: astore #8
/*     */     //   400: aload_0
/*     */     //   401: aload #8
/*     */     //   403: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   406: checkcast java/util/Collection
/*     */     //   409: aload_1
/*     */     //   410: invokevirtual getCurrentState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   413: invokevirtual getIssueDescription : ()Ljava/util/List;
/*     */     //   416: checkcast java/lang/Iterable
/*     */     //   419: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   422: checkcast java/util/Collection
/*     */     //   425: aload #6
/*     */     //   427: checkcast java/lang/Iterable
/*     */     //   430: astore #10
/*     */     //   432: astore #25
/*     */     //   434: astore #24
/*     */     //   436: iconst_0
/*     */     //   437: istore #11
/*     */     //   439: aload #10
/*     */     //   441: astore #12
/*     */     //   443: new java/util/ArrayList
/*     */     //   446: dup
/*     */     //   447: aload #10
/*     */     //   449: bipush #10
/*     */     //   451: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   454: invokespecial <init> : (I)V
/*     */     //   457: checkcast java/util/Collection
/*     */     //   460: astore #13
/*     */     //   462: iconst_0
/*     */     //   463: istore #14
/*     */     //   465: aload #12
/*     */     //   467: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   472: astore #15
/*     */     //   474: aload #15
/*     */     //   476: invokeinterface hasNext : ()Z
/*     */     //   481: ifeq -> 524
/*     */     //   484: aload #15
/*     */     //   486: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   491: astore #16
/*     */     //   493: aload #13
/*     */     //   495: aload #16
/*     */     //   497: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   500: astore #17
/*     */     //   502: astore #26
/*     */     //   504: iconst_0
/*     */     //   505: istore #18
/*     */     //   507: aload #17
/*     */     //   509: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   512: aload #26
/*     */     //   514: swap
/*     */     //   515: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   520: pop
/*     */     //   521: goto -> 474
/*     */     //   524: aload #13
/*     */     //   526: checkcast java/util/List
/*     */     //   529: nop
/*     */     //   530: astore #26
/*     */     //   532: aload #24
/*     */     //   534: aload #25
/*     */     //   536: aload #26
/*     */     //   538: checkcast java/lang/Iterable
/*     */     //   541: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   544: aload #7
/*     */     //   546: invokespecial buildChoiceMessage : (Ljava/util/List;Ljava/util/List;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   549: astore #9
/*     */     //   551: new com/intellij/ml/llm/matterhorn/requests/SimpleRequest
/*     */     //   554: dup
/*     */     //   555: aload_0
/*     */     //   556: getfield systemPrompt : Ljava/lang/String;
/*     */     //   559: aload #9
/*     */     //   561: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   564: aload #5
/*     */     //   566: invokevirtual getModelParameters : ()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   569: aconst_null
/*     */     //   570: bipush #8
/*     */     //   572: aconst_null
/*     */     //   573: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   576: astore #10
/*     */     //   578: new com/intellij/ml/llm/matterhorn/requests/UserReviewedRequest
/*     */     //   581: dup
/*     */     //   582: aload #10
/*     */     //   584: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
/*     */     //   587: aload #5
/*     */     //   589: invokevirtual getModelParameters : ()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   592: new com/intellij/ml/llm/matterhorn/ej/core/critique/EditCritique$produceArtifact$request$1
/*     */     //   595: dup
/*     */     //   596: aload_0
/*     */     //   597: aload #7
/*     */     //   599: aconst_null
/*     */     //   600: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/EditCritique;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
/*     */     //   603: checkcast kotlin/jvm/functions/Function3
/*     */     //   606: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function3;)V
/*     */     //   609: astore #11
/*     */     //   611: aload_2
/*     */     //   612: aload #11
/*     */     //   614: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
/*     */     //   617: iconst_0
/*     */     //   618: aload #28
/*     */     //   620: iconst_2
/*     */     //   621: aconst_null
/*     */     //   622: aload #28
/*     */     //   624: aload_0
/*     */     //   625: putfield L$0 : Ljava/lang/Object;
/*     */     //   628: aload #28
/*     */     //   630: aload #7
/*     */     //   632: putfield L$1 : Ljava/lang/Object;
/*     */     //   635: aload #28
/*     */     //   637: aconst_null
/*     */     //   638: putfield L$2 : Ljava/lang/Object;
/*     */     //   641: aload #28
/*     */     //   643: iconst_3
/*     */     //   644: putfield label : I
/*     */     //   647: invokestatic sendToGrazie$default : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   650: dup
/*     */     //   651: aload #29
/*     */     //   653: if_acmpne -> 685
/*     */     //   656: aload #29
/*     */     //   658: areturn
/*     */     //   659: aload #28
/*     */     //   661: getfield L$1 : Ljava/lang/Object;
/*     */     //   664: checkcast java/util/List
/*     */     //   667: astore #7
/*     */     //   669: aload #28
/*     */     //   671: getfield L$0 : Ljava/lang/Object;
/*     */     //   674: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/EditCritique
/*     */     //   677: astore_0
/*     */     //   678: aload #27
/*     */     //   680: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   683: aload #27
/*     */     //   685: checkcast java/lang/String
/*     */     //   688: astore #12
/*     */     //   690: aload_0
/*     */     //   691: aload #12
/*     */     //   693: aload #7
/*     */     //   695: invokespecial parseBestAction : (Ljava/lang/String;Ljava/util/List;)Lcom/intellij/ml/llm/matterhorn/ej/core/critique/EditCritiqueResponseParseResult;
/*     */     //   698: astore #14
/*     */     //   700: aload #14
/*     */     //   702: ldc_w 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.core.critique.EditCritiqueResponseParseResult.Success'
/*     */     //   705: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   708: aload #14
/*     */     //   710: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/EditCritiqueResponseParseResult$Success
/*     */     //   713: invokevirtual getBestActionZeroBasedIdx : ()I
/*     */     //   716: istore #13
/*     */     //   718: aload #7
/*     */     //   720: checkcast java/util/Collection
/*     */     //   723: invokestatic getIndices : (Ljava/util/Collection;)Lkotlin/ranges/IntRange;
/*     */     //   726: checkcast java/lang/Iterable
/*     */     //   729: astore #15
/*     */     //   731: iconst_0
/*     */     //   732: istore #16
/*     */     //   734: aload #15
/*     */     //   736: astore #17
/*     */     //   738: new java/util/ArrayList
/*     */     //   741: dup
/*     */     //   742: aload #15
/*     */     //   744: bipush #10
/*     */     //   746: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   749: invokespecial <init> : (I)V
/*     */     //   752: checkcast java/util/Collection
/*     */     //   755: astore #18
/*     */     //   757: iconst_0
/*     */     //   758: istore #19
/*     */     //   760: aload #17
/*     */     //   762: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   767: astore #20
/*     */     //   769: aload #20
/*     */     //   771: invokeinterface hasNext : ()Z
/*     */     //   776: ifeq -> 827
/*     */     //   779: aload #20
/*     */     //   781: checkcast kotlin/collections/IntIterator
/*     */     //   784: invokevirtual nextInt : ()I
/*     */     //   787: istore #21
/*     */     //   789: aload #18
/*     */     //   791: iload #21
/*     */     //   793: istore #22
/*     */     //   795: astore #24
/*     */     //   797: iconst_0
/*     */     //   798: istore #23
/*     */     //   800: iload #22
/*     */     //   802: iload #13
/*     */     //   804: if_icmpne -> 811
/*     */     //   807: iconst_0
/*     */     //   808: goto -> 812
/*     */     //   811: iconst_1
/*     */     //   812: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */     //   815: aload #24
/*     */     //   817: swap
/*     */     //   818: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   823: pop
/*     */     //   824: goto -> 769
/*     */     //   827: aload #18
/*     */     //   829: checkcast java/util/List
/*     */     //   832: nop
/*     */     //   833: astore #14
/*     */     //   835: new com/intellij/ml/llm/matterhorn/ArtifactResponse
/*     */     //   838: dup
/*     */     //   839: new com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse
/*     */     //   842: dup
/*     */     //   843: aload #7
/*     */     //   845: aload #14
/*     */     //   847: invokespecial <init> : (Ljava/util/List;Ljava/util/List;)V
/*     */     //   850: aconst_null
/*     */     //   851: iconst_2
/*     */     //   852: aconst_null
/*     */     //   853: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   856: areturn
/*     */     //   857: new java/lang/IllegalStateException
/*     */     //   860: dup
/*     */     //   861: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   864: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   867: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #56	-> 60
/*     */     //   #60	-> 101
/*     */     //   #61	-> 114
/*     */     //   #64	-> 152
/*     */     //   #65	-> 160
/*     */     //   #56	-> 209
/*     */     //   #65	-> 246
/*     */     //   #66	-> 276
/*     */     //   #56	-> 330
/*     */     //   #68	-> 372
/*     */     //   #69	-> 381
/*     */     //   #70	-> 387
/*     */     //   #71	-> 400
/*     */     //   #149	-> 439
/*     */     //   #150	-> 465
/*     */     //   #151	-> 493
/*     */     //   #71	-> 507
/*     */     //   #151	-> 515
/*     */     //   #152	-> 524
/*     */     //   #149	-> 529
/*     */     //   #71	-> 541
/*     */     //   #72	-> 551
/*     */     //   #73	-> 578
/*     */     //   #80	-> 611
/*     */     //   #56	-> 656
/*     */     //   #81	-> 690
/*     */     //   #82	-> 718
/*     */     //   #153	-> 734
/*     */     //   #154	-> 760
/*     */     //   #155	-> 789
/*     */     //   #82	-> 800
/*     */     //   #155	-> 818
/*     */     //   #156	-> 827
/*     */     //   #153	-> 832
/*     */     //   #82	-> 833
/*     */     //   #83	-> 835
/*     */     //   #56	-> 857
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	111	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/EditCritique;
/*     */     //   239	94	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/EditCritique;
/*     */     //   360	299	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/EditCritique;
/*     */     //   678	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/EditCritique;
/*     */     //   101	111	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;
/*     */     //   230	103	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;
/*     */     //   351	85	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;
/*     */     //   101	111	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   221	112	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   342	170	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   512	18	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   530	120	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   276	48	4	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   372	140	5	editCritiqueParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/EditCritiqueParameters;
/*     */     //   512	18	5	editCritiqueParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/EditCritiqueParameters;
/*     */     //   530	81	5	editCritiqueParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/EditCritiqueParameters;
/*     */     //   381	55	6	historyNoDemo	Ljava/util/List;
/*     */     //   387	272	7	actionsToRank	Ljava/util/List;
/*     */     //   669	188	7	actionsToRank	Ljava/util/List;
/*     */     //   400	36	8	demo	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   551	27	9	choiceMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   436	26	10	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   578	33	10	simpleRequest	Lcom/intellij/ml/llm/matterhorn/requests/SimpleRequest;
/*     */     //   611	39	11	request	Lcom/intellij/ml/llm/matterhorn/requests/UserReviewedRequest;
/*     */     //   462	12	12	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   690	10	12	response	Ljava/lang/String;
/*     */     //   462	64	13	destination$iv$iv	Ljava/util/Collection;
/*     */     //   718	139	13	bestActionIdx	I
/*     */     //   835	22	14	ranks	Ljava/util/List;
/*     */     //   731	26	15	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   493	28	16	item$iv$iv	Ljava/lang/Object;
/*     */     //   504	8	17	it	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   757	12	17	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   757	72	18	destination$iv$iv	Ljava/util/Collection;
/*     */     //   789	8	21	item$iv$iv	I
/*     */     //   797	14	22	it	I
/*     */     //   507	5	18	$i$a$-map-EditCritique$produceArtifact$choiceMessage$1	I
/*     */     //   465	61	14	$i$f$mapTo	I
/*     */     //   439	91	11	$i$f$map	I
/*     */     //   800	12	23	$i$a$-map-EditCritique$produceArtifact$ranks$1	I
/*     */     //   760	69	19	$i$f$mapTo	I
/*     */     //   734	99	16	$i$f$map	I
/*     */     //   0	868	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	807	28	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	800	27	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "EditCritique.kt", l = {65, 66, 80}, i = {0, 0, 0, 1, 1, 1, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"}, n = {"this", "input", "context", "this", "input", "context", "this", "actionsToRank"}, m = "produceArtifact", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.EditCritique")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EditCritique$produceArtifact$1
/*     */     extends ContinuationImpl
/*     */   {
/*     */     Object L$0;
/*     */ 
/*     */     
/*     */     Object L$1;
/*     */ 
/*     */     
/*     */     Object L$2;
/*     */ 
/*     */     
/*     */     int label;
/*     */ 
/*     */ 
/*     */     
/*     */     EditCritique$produceArtifact$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EditCritique.this.produceArtifact((CritiqueInput)null, (ExecutionContext)null, (Continuation<? super ArtifactResponse<CritiqueResponse>>)this);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "EditCritique.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.EditCritique$produceArtifact$request$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "answer", "", "attempt", ""})
/*     */   static final class EditCritique$produceArtifact$request$1
/*     */     extends SuspendLambda
/*     */     implements Function3<String, Integer, Continuation<? super ReviewerResponse>, Object>
/*     */   {
/*     */     int label;
/*     */ 
/*     */     
/*     */     EditCritique$produceArtifact$request$1(List<MatterhornChatElement> $actionsToRank, Continuation $completion) {
/*     */       super(3, $completion);
/*     */     }
/*     */ 
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       String answer;
/*     */       EditCritiqueResponseParseResult parseRes;
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           answer = (String)this.L$0;
/*     */           parseRes = EditCritique.this.parseBestAction(answer, this.$actionsToRank);
/*     */           if (parseRes instanceof EditCritiqueResponseParseResult.Error) {
/*     */             return ReviewerResponse.Companion.error$default(ReviewerResponse.Companion, ((EditCritiqueResponseParseResult.Error)parseRes).getMessage(), null, 2, null);
/*     */           }
/*     */           return ReviewerResponse.Companion.ok();
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */ 
/*     */     
/*     */     public final Object invoke(String p1, int p2, Continuation<? super EditCritique$produceArtifact$request$1> p3) {
/*     */       EditCritique$produceArtifact$request$1 editCritique$produceArtifact$request$1 = new EditCritique$produceArtifact$request$1(this.$actionsToRank, p3);
/*     */       editCritique$produceArtifact$request$1.L$0 = p1;
/*     */       return editCritique$produceArtifact$request$1.invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/* 140 */   private final String systemPrompt = "\nSETTING: You are a critic evaluating an autonomous programmer who interacts directly with the command line through a specialized interface. The programmer's objective is to resolve a specific issue within a given repository.\n\nYou will receive a history of the programmer's interactions with the environment, which may be partial or complete. Your task is to critically assess the performance of several proposed commands and select the best command based on the effectiveness in resolving the issue.\nRemember that you should always select exactly on best command (even if all commands are bad).\n\nInstructions:\n\nEvaluation Criteria:\n- Superior Performance: The command demonstrates a highly logical and efficient approach towards resolving the issue, potentially correcting previous errors or making significant progress. The command should also follow best practices in code style and be free of potential bugs.\n- Inferior Performance: The command fails to contribute to resolving the issue, introduces new problems, or exhibits poor code style and potential bugs.\n\nWrite you review on every provided command and select the most effective command from provided options.\n\nConsiderations:\n- Relevance: Assess the effectiveness, correctness, and appropriateness of each command within the current context.\n- Error Correction: Commands that effectively address and correct previous mistakes should be considered favorably, provided they are executed on the correct file and in the proper sequence.\n- Command Execution: Ensure each command can be executed without errors and is appropriate for the task at hand.\n- Command Sequence: Ensure commands are executed in a logical and sequential manner. For instance, if the programmer needs to modify a different file, they must open the file before making changes.\n- Command Validity: Ensure the command is valid and executable.\n- Bug Prevention: Check for potential bugs introduced by each command and consider how well the command mitigates or avoids these issues.\n- Code Style: Evaluate the clarity and maintainability of the code. Favor commands that result in clean, readable, and well-structured code. Prevent poor code style and practices.\n\n\nRESPONSE FORMAT:\n" + this.commandDirective + " <Provide id of the command>: <Provide a detailed reason for your evaluation of this command, noting any potential for improvement, potential bugs, and code style issues>\n" + 
/* 141 */     this.commandDirective + " <Provide id of the command>: <Provide a detailed reason for your evaluation of this command, noting any potential for improvement, potential bugs, and code style issues>\n...\n```\n" + 
/*     */ 
/*     */     
/* 144 */     this.bestCommandDirective + " \n" + 
/* 145 */     this.commandDirective + " <Provide id of the command>\n```\n";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final MatterhornChatMessage buildChoiceMessage(List historyNoDemo, List actionsToRank) {
/*     */     Iterable $this$map$iv = actionsToRank;
/*     */     int $i$f$map = 0;
/* 157 */     Iterable iterable1 = $this$map$iv; Collection<MatterhornChatElement> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 158 */     for (Object item$iv$iv : iterable1) {
/* 159 */       MatterhornChatElement matterhornChatElement = (MatterhornChatElement)item$iv$iv; Collection<MatterhornChatElement> collection = destination$iv$iv; int $i$a$-map-EditCritique$buildChoiceMessage$optionsToRankString$1 = 0; collection.add(matterhornChatElement);
/* 160 */     }  String optionsToRankString = CollectionsKt.joinToString$default(CollectionsKt.withIndex(destination$iv$iv), "\n", null, null, 0, null, this::buildChoiceMessage$lambda$3, 30, null); return new MatterhornChatMessage(CollectionsKt.joinToString$default(historyNoDemo, "\n", null, null, 0, null, null, 62, null) + "\n" + CollectionsKt.joinToString$default(historyNoDemo, "\n", null, null, 0, null, null, 62, null), MatterhornChatMessageKind.User, null, null, 12, null); } private final EditCritiqueResponseParseResult parseBestAction(String response, List actionsToRank) { Iterable $this$map$iv = StringsKt.lines(response); int $i$f$map = 0;
/* 161 */     Iterable iterable1 = $this$map$iv; Collection<String> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 162 */     for (Object item$iv$iv : iterable1) {
/* 163 */       String str = (String)item$iv$iv; Collection<String> collection1 = collection; int $i$a$-map-EditCritique$parseBestAction$responseLines$1 = 0; collection1.add(StringsKt.trim(str).toString());
/* 164 */     }  $this$map$iv = collection; int $i$f$filter = 0;
/* 165 */     Iterable $this$mapTo$iv$iv = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 166 */     for (Object element$iv$iv : $this$mapTo$iv$iv) { String it = (String)element$iv$iv; int $i$a$-filter-EditCritique$parseBestAction$responseLines$2 = 0; if (!StringsKt.isBlank(it)) destination$iv$iv.add(element$iv$iv);  }
/* 167 */      List<CharSequence> responseLines = (List)destination$iv$iv;
/*     */     int bestActionSection = responseLines.indexOf(this.bestCommandDirective);
/*     */     if (bestActionSection == -1 || bestActionSection == responseLines.size() - 1)
/*     */       return new EditCritiqueResponseParseResult.Error(StringsKt.trimMargin$default("ERROR: your response must contain\n          |```\n          |" + this.bestCommandDirective + "\n          |" + this.commandDirective + " <provide best command id>\n          |```", null, 1, null)); 
/*     */     String[] arrayOfString = new String[1];
/*     */     arrayOfString[0] = " ";
/*     */     Integer bestActionOneBasedId = StringsKt.toIntOrNull(StringsKt.trim((CharSequence)CollectionsKt.last(StringsKt.split$default(responseLines.get(bestActionSection + 1), arrayOfString, false, 0, 6, null))).toString());
/*     */     if (bestActionOneBasedId == null)
/*     */       return new EditCritiqueResponseParseResult.Error("ERROR: failed to parse best command id, got: `" + responseLines.get(bestActionSection + 1) + "`, expected `" + this.commandDirective + " <ID of the selected command>`"); 
/*     */     int i = actionsToRank.size(), j = bestActionOneBasedId.intValue() - 1;
/*     */     if (!((0 <= j) ? ((j < i) ? 1 : 0) : 0))
/*     */       return new EditCritiqueResponseParseResult.Error("ERROR: you returned best action id=" + bestActionOneBasedId + ", but there are only " + actionsToRank.size() + " actions to rank"); 
/*     */     return new EditCritiqueResponseParseResult.Success(bestActionOneBasedId.intValue() - 1); }
/*     */ 
/*     */   
/*     */   private static final CharSequence buildChoiceMessage$lambda$3(EditCritique this$0, IndexedValue it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return this$0.commandDirective + " " + this$0.commandDirective + ":\n" + it.getIndex() + 1 + "\n";
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\critique\EditCritique.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */