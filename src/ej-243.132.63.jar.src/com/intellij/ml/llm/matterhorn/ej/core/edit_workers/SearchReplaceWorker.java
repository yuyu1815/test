/*     */ package com.intellij.ml.llm.matterhorn.ej.core.edit_workers;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\b\032\0020\t2\006\020\n\032\0020\013H@¢\006\002\020\fJ:\020\r\032\b\022\004\022\0020\0170\0162\006\020\020\032\0020\0212\006\020\022\032\0020\0232\006\020\024\032\0020\0252\f\020\026\032\b\022\004\022\0020\0170\016H@¢\006\002\020\027J\026\020\030\032\b\022\004\022\0020\0310\0162\006\020\020\032\0020\021H\026J\020\020\032\032\0020\0052\006\020\020\032\0020\021H\026J\020\020\033\032\0020\0052\006\020\020\032\0020\021H\026R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker;", "<init>", "()V", "critiqueArtifactNameSuffix", "", "getCritiqueArtifactNameSuffix", "()Ljava/lang/String;", "getTrajectoryElementAgent", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "(Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runCritic", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "attempt", "", "currentState", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "optionsToRank", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ILcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAvailableActions", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "getSystemMessage", "getDemonstration", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nSearchReplaceWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchReplaceWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,184:1\n774#2:185\n865#2,2:186\n774#2:188\n865#2,2:189\n*S KotlinDebug\n*F\n+ 1 SearchReplaceWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker\n*L\n37#1:185\n37#1:186,2\n69#1:188\n69#1:189,2\n*E\n"})
/*     */ public final class SearchReplaceWorker extends AbstractEditWorker {
/*  19 */   public SearchReplaceWorker() { super("search_replace_worker");
/*  20 */     this.critiqueArtifactNameSuffix = "_search_replace"; } @NotNull private final String critiqueArtifactNameSuffix; @NotNull public String getCritiqueArtifactNameSuffix() { return this.critiqueArtifactNameSuffix; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object getTrajectoryElementAgent(@NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker$getTrajectoryElementAgent$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker$getTrajectoryElementAgent$1
/*     */     //   11: astore #7
/*     */     //   13: aload #7
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #7
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker$getTrajectoryElementAgent$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #7
/*     */     //   50: aload #7
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #6
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #15
/*     */     //   62: aload #7
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 222, 0 -> 88, 1 -> 135
/*     */     //   88: aload #6
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: ldc 'search_replace'
/*     */     //   95: ldc '0.1'
/*     */     //   97: astore #4
/*     */     //   99: astore_3
/*     */     //   100: aload_0
/*     */     //   101: aload_1
/*     */     //   102: aload #7
/*     */     //   104: aload #7
/*     */     //   106: aload_3
/*     */     //   107: putfield L$0 : Ljava/lang/Object;
/*     */     //   110: aload #7
/*     */     //   112: aload #4
/*     */     //   114: putfield L$1 : Ljava/lang/Object;
/*     */     //   117: aload #7
/*     */     //   119: iconst_1
/*     */     //   120: putfield label : I
/*     */     //   123: invokevirtual getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   126: dup
/*     */     //   127: aload #15
/*     */     //   129: if_acmpne -> 161
/*     */     //   132: aload #15
/*     */     //   134: areturn
/*     */     //   135: aload #7
/*     */     //   137: getfield L$1 : Ljava/lang/Object;
/*     */     //   140: checkcast java/lang/String
/*     */     //   143: astore #4
/*     */     //   145: aload #7
/*     */     //   147: getfield L$0 : Ljava/lang/Object;
/*     */     //   150: checkcast java/lang/String
/*     */     //   153: astore_3
/*     */     //   154: aload #6
/*     */     //   156: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   159: aload #6
/*     */     //   161: astore #5
/*     */     //   163: aload_3
/*     */     //   164: aload #4
/*     */     //   166: aload #5
/*     */     //   168: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters
/*     */     //   171: invokevirtual getModelParameters : ()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   174: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   177: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   180: ldc ''
/*     */     //   182: aconst_null
/*     */     //   183: bipush #16
/*     */     //   185: aconst_null
/*     */     //   186: astore #8
/*     */     //   188: istore #9
/*     */     //   190: astore #10
/*     */     //   192: astore #11
/*     */     //   194: astore #12
/*     */     //   196: astore #13
/*     */     //   198: astore #14
/*     */     //   200: new com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   203: dup
/*     */     //   204: aload #14
/*     */     //   206: aload #13
/*     */     //   208: aload #12
/*     */     //   210: aload #11
/*     */     //   212: aload #10
/*     */     //   214: iload #9
/*     */     //   216: aload #8
/*     */     //   218: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   221: areturn
/*     */     //   222: new java/lang/IllegalStateException
/*     */     //   225: dup
/*     */     //   226: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   228: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   231: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #22	-> 60
/*     */     //   #23	-> 93
/*     */     //   #24	-> 93
/*     */     //   #25	-> 95
/*     */     //   #26	-> 100
/*     */     //   #22	-> 132
/*     */     //   #26	-> 161
/*     */     //   #27	-> 180
/*     */     //   #23	-> 182
/*     */     //   #22	-> 222
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	33	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker;
/*     */     //   93	33	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   0	232	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	172	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	165	6	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object runCritic(@NotNull ExecutionAgentContext context, int attempt, @NotNull AgentState currentState, @NotNull List optionsToRank, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker$runCritic$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker$runCritic$1
/*     */     //   13: astore #25
/*     */     //   15: aload #25
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #25
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker$runCritic$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #25
/*     */     //   53: aload #25
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #24
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #26
/*     */     //   65: aload #25
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 652, 0 -> 96, 1 -> 529, 2 -> 644
/*     */     //   96: aload #24
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload #4
/*     */     //   103: checkcast java/lang/Iterable
/*     */     //   106: astore #7
/*     */     //   108: iconst_0
/*     */     //   109: istore #8
/*     */     //   111: aload #7
/*     */     //   113: astore #9
/*     */     //   115: new java/util/ArrayList
/*     */     //   118: dup
/*     */     //   119: invokespecial <init> : ()V
/*     */     //   122: checkcast java/util/Collection
/*     */     //   125: astore #10
/*     */     //   127: iconst_0
/*     */     //   128: istore #11
/*     */     //   130: aload #9
/*     */     //   132: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   137: astore #12
/*     */     //   139: aload #12
/*     */     //   141: invokeinterface hasNext : ()Z
/*     */     //   146: ifeq -> 221
/*     */     //   149: aload #12
/*     */     //   151: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   156: astore #13
/*     */     //   158: aload #13
/*     */     //   160: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   163: astore #14
/*     */     //   165: iconst_0
/*     */     //   166: istore #15
/*     */     //   168: nop
/*     */     //   169: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest$Companion;
/*     */     //   172: aload #14
/*     */     //   174: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   179: invokevirtual parse : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;
/*     */     //   182: pop
/*     */     //   183: iconst_1
/*     */     //   184: istore #16
/*     */     //   186: goto -> 194
/*     */     //   189: astore #17
/*     */     //   191: iconst_0
/*     */     //   192: istore #16
/*     */     //   194: iload #16
/*     */     //   196: ifeq -> 203
/*     */     //   199: iconst_1
/*     */     //   200: goto -> 204
/*     */     //   203: iconst_0
/*     */     //   204: nop
/*     */     //   205: ifeq -> 139
/*     */     //   208: aload #10
/*     */     //   210: aload #13
/*     */     //   212: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   217: pop
/*     */     //   218: goto -> 139
/*     */     //   221: aload #10
/*     */     //   223: checkcast java/util/List
/*     */     //   226: nop
/*     */     //   227: astore #6
/*     */     //   229: aload #6
/*     */     //   231: invokeinterface isEmpty : ()Z
/*     */     //   236: ifeq -> 281
/*     */     //   239: iconst_2
/*     */     //   240: anewarray com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   243: astore #7
/*     */     //   245: aload #7
/*     */     //   247: iconst_0
/*     */     //   248: aload #4
/*     */     //   250: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   253: aastore
/*     */     //   254: aload #7
/*     */     //   256: iconst_1
/*     */     //   257: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   260: dup
/*     */     //   261: ldc 'ERROR: Your response is not formatted properly, try again, example:\\n<THOUGHT>\\nIn `hello.py` implement method `hello` that prints "hello"\\n</THOUGHT>\\n<COMMAND>\\n<EDIT>\\n<FILE_PATH>/mnt/myProject/hello.py</FILE_PATH>\\n<SEARCH></SEARCH>\\n<REPLACE>\\ndef hello():\\n    "print a greeting"\\n\\n    print("hello")\\n</REPLACE>\\n</EDIT>\\n</COMMAND>'
/*     */     //   263: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   266: aconst_null
/*     */     //   267: aconst_null
/*     */     //   268: bipush #12
/*     */     //   270: aconst_null
/*     */     //   271: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   274: aastore
/*     */     //   275: aload #7
/*     */     //   277: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   280: areturn
/*     */     //   281: aload #6
/*     */     //   283: checkcast java/lang/Iterable
/*     */     //   286: astore #8
/*     */     //   288: iconst_0
/*     */     //   289: istore #9
/*     */     //   291: aload #8
/*     */     //   293: astore #10
/*     */     //   295: new java/util/ArrayList
/*     */     //   298: dup
/*     */     //   299: invokespecial <init> : ()V
/*     */     //   302: checkcast java/util/Collection
/*     */     //   305: astore #11
/*     */     //   307: iconst_0
/*     */     //   308: istore #12
/*     */     //   310: aload #10
/*     */     //   312: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   317: astore #13
/*     */     //   319: aload #13
/*     */     //   321: invokeinterface hasNext : ()Z
/*     */     //   326: ifeq -> 385
/*     */     //   329: aload #13
/*     */     //   331: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   336: astore #14
/*     */     //   338: aload #14
/*     */     //   340: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   343: astore #15
/*     */     //   345: iconst_0
/*     */     //   346: istore #16
/*     */     //   348: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest$Companion;
/*     */     //   351: aload #15
/*     */     //   353: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   358: invokevirtual parse : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;
/*     */     //   361: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   364: ldc 'search_replace'
/*     */     //   366: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   369: ifeq -> 319
/*     */     //   372: aload #11
/*     */     //   374: aload #14
/*     */     //   376: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   381: pop
/*     */     //   382: goto -> 319
/*     */     //   385: aload #11
/*     */     //   387: checkcast java/util/List
/*     */     //   390: nop
/*     */     //   391: astore #7
/*     */     //   393: aload #7
/*     */     //   395: invokeinterface isEmpty : ()Z
/*     */     //   400: ifeq -> 445
/*     */     //   403: iconst_2
/*     */     //   404: anewarray com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   407: astore #8
/*     */     //   409: aload #8
/*     */     //   411: iconst_0
/*     */     //   412: aload #6
/*     */     //   414: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   417: aastore
/*     */     //   418: aload #8
/*     */     //   420: iconst_1
/*     */     //   421: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   424: dup
/*     */     //   425: ldc 'ERROR: you did not generate *SEARCH/REPLACE/ blocks. Please include all required edits in form of *SEARCH/REPLACE* blocks in your responce'
/*     */     //   427: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.Assistant : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   430: aconst_null
/*     */     //   431: aconst_null
/*     */     //   432: bipush #12
/*     */     //   434: aconst_null
/*     */     //   435: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   438: aastore
/*     */     //   439: aload #8
/*     */     //   441: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   444: areturn
/*     */     //   445: aload_0
/*     */     //   446: aload #7
/*     */     //   448: aload_3
/*     */     //   449: aload_1
/*     */     //   450: iload_2
/*     */     //   451: istore #22
/*     */     //   453: astore #21
/*     */     //   455: astore #20
/*     */     //   457: astore #19
/*     */     //   459: astore #18
/*     */     //   461: aload_0
/*     */     //   462: aload_1
/*     */     //   463: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   468: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   471: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   474: aload #25
/*     */     //   476: aload #25
/*     */     //   478: aload #18
/*     */     //   480: putfield L$0 : Ljava/lang/Object;
/*     */     //   483: aload #25
/*     */     //   485: aload #19
/*     */     //   487: putfield L$1 : Ljava/lang/Object;
/*     */     //   490: aload #25
/*     */     //   492: aload #20
/*     */     //   494: putfield L$2 : Ljava/lang/Object;
/*     */     //   497: aload #25
/*     */     //   499: aload #21
/*     */     //   501: putfield L$3 : Ljava/lang/Object;
/*     */     //   504: aload #25
/*     */     //   506: iload #22
/*     */     //   508: putfield I$0 : I
/*     */     //   511: aload #25
/*     */     //   513: iconst_1
/*     */     //   514: putfield label : I
/*     */     //   517: invokevirtual getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   520: dup
/*     */     //   521: aload #26
/*     */     //   523: if_acmpne -> 583
/*     */     //   526: aload #26
/*     */     //   528: areturn
/*     */     //   529: aload #25
/*     */     //   531: getfield I$0 : I
/*     */     //   534: istore #22
/*     */     //   536: aload #25
/*     */     //   538: getfield L$3 : Ljava/lang/Object;
/*     */     //   541: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   544: astore #21
/*     */     //   546: aload #25
/*     */     //   548: getfield L$2 : Ljava/lang/Object;
/*     */     //   551: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   554: astore #20
/*     */     //   556: aload #25
/*     */     //   558: getfield L$1 : Ljava/lang/Object;
/*     */     //   561: checkcast java/util/List
/*     */     //   564: astore #19
/*     */     //   566: aload #25
/*     */     //   568: getfield L$0 : Ljava/lang/Object;
/*     */     //   571: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker
/*     */     //   574: astore #18
/*     */     //   576: aload #24
/*     */     //   578: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   581: aload #24
/*     */     //   583: astore #23
/*     */     //   585: aload #18
/*     */     //   587: aload #19
/*     */     //   589: aload #20
/*     */     //   591: aload #21
/*     */     //   593: iload #22
/*     */     //   595: aload #23
/*     */     //   597: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters
/*     */     //   600: aload #25
/*     */     //   602: aload #25
/*     */     //   604: aconst_null
/*     */     //   605: putfield L$0 : Ljava/lang/Object;
/*     */     //   608: aload #25
/*     */     //   610: aconst_null
/*     */     //   611: putfield L$1 : Ljava/lang/Object;
/*     */     //   614: aload #25
/*     */     //   616: aconst_null
/*     */     //   617: putfield L$2 : Ljava/lang/Object;
/*     */     //   620: aload #25
/*     */     //   622: aconst_null
/*     */     //   623: putfield L$3 : Ljava/lang/Object;
/*     */     //   626: aload #25
/*     */     //   628: iconst_2
/*     */     //   629: putfield label : I
/*     */     //   632: invokevirtual checkAndSortActions : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ILcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   635: dup
/*     */     //   636: aload #26
/*     */     //   638: if_acmpne -> 651
/*     */     //   641: aload #26
/*     */     //   643: areturn
/*     */     //   644: aload #24
/*     */     //   646: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   649: aload #24
/*     */     //   651: areturn
/*     */     //   652: new java/lang/IllegalStateException
/*     */     //   655: dup
/*     */     //   656: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   658: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   661: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #31	-> 63
/*     */     //   #37	-> 101
/*     */     //   #185	-> 111
/*     */     //   #186	-> 130
/*     */     //   #38	-> 168
/*     */     //   #39	-> 169
/*     */     //   #40	-> 183
/*     */     //   #41	-> 189
/*     */     //   #42	-> 191
/*     */     //   #43	-> 204
/*     */     //   #186	-> 205
/*     */     //   #187	-> 221
/*     */     //   #185	-> 226
/*     */     //   #37	-> 227
/*     */     //   #45	-> 229
/*     */     //   #47	-> 239
/*     */     //   #48	-> 257
/*     */     //   #64	-> 261
/*     */     //   #65	-> 263
/*     */     //   #48	-> 266
/*     */     //   #47	-> 275
/*     */     //   #46	-> 277
/*     */     //   #69	-> 281
/*     */     //   #188	-> 291
/*     */     //   #189	-> 310
/*     */     //   #69	-> 348
/*     */     //   #189	-> 369
/*     */     //   #190	-> 385
/*     */     //   #188	-> 390
/*     */     //   #69	-> 391
/*     */     //   #70	-> 393
/*     */     //   #72	-> 403
/*     */     //   #73	-> 421
/*     */     //   #74	-> 425
/*     */     //   #75	-> 427
/*     */     //   #73	-> 430
/*     */     //   #72	-> 439
/*     */     //   #71	-> 441
/*     */     //   #79	-> 445
/*     */     //   #31	-> 526
/*     */     //   #79	-> 583
/*     */     //   #31	-> 641
/*     */     //   #79	-> 651
/*     */     //   #31	-> 652
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	104	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker;
/*     */     //   205	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker;
/*     */     //   227	12	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker;
/*     */     //   281	88	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker;
/*     */     //   369	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker;
/*     */     //   391	12	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker;
/*     */     //   445	75	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/SearchReplaceWorker;
/*     */     //   101	104	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   205	22	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   227	12	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   281	88	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   369	22	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   391	12	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   445	75	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   101	104	2	attempt	I
/*     */     //   205	22	2	attempt	I
/*     */     //   227	12	2	attempt	I
/*     */     //   281	88	2	attempt	I
/*     */     //   369	22	2	attempt	I
/*     */     //   391	12	2	attempt	I
/*     */     //   445	75	2	attempt	I
/*     */     //   101	104	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   205	22	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   227	12	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   281	88	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   369	22	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   391	12	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   445	75	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   101	104	4	optionsToRank	Ljava/util/List;
/*     */     //   205	22	4	optionsToRank	Ljava/util/List;
/*     */     //   227	30	4	optionsToRank	Ljava/util/List;
/*     */     //   229	10	6	illFormedFiltered	Ljava/util/List;
/*     */     //   281	88	6	illFormedFiltered	Ljava/util/List;
/*     */     //   369	22	6	illFormedFiltered	Ljava/util/List;
/*     */     //   391	30	6	illFormedFiltered	Ljava/util/List;
/*     */     //   108	19	7	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   393	10	7	editActions	Ljava/util/List;
/*     */     //   445	75	7	editActions	Ljava/util/List;
/*     */     //   288	19	8	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   127	12	9	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   127	96	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   307	12	10	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   307	80	11	destination$iv$iv	Ljava/util/Collection;
/*     */     //   158	60	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   165	18	14	action	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   338	44	14	element$iv$iv	Ljava/lang/Object;
/*     */     //   345	24	15	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   168	37	15	$i$a$-filter-SearchReplaceWorker$runCritic$illFormedFiltered$1	I
/*     */     //   130	93	11	$i$f$filterTo	I
/*     */     //   111	116	8	$i$f$filter	I
/*     */     //   348	21	16	$i$a$-filter-SearchReplaceWorker$runCritic$editActions$1	I
/*     */     //   310	77	12	$i$f$filterTo	I
/*     */     //   291	100	9	$i$f$filter	I
/*     */     //   0	662	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	599	25	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	592	24	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   168	186	189	java/lang/Exception
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public List<AgentAction> getAvailableActions(@NotNull ExecutionAgentContext context) {
/*  83 */     Intrinsics.checkNotNullParameter(context, "context"); return CollectionsKt.listOf(new EditSearchReplace(SyntaxChecker.Companion.getSyntaxCheckers(), false));
/*     */   }
/*     */   @NotNull
/*     */   public String getSystemMessage(@NotNull ExecutionAgentContext context) {
/*  87 */     Intrinsics.checkNotNullParameter(context, "context"); String commandDescription = getCommandDescription(context);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 103 */     return "Act as an expert software developer.\nAlways use best practices when coding.\nRespect and use existing conventions, libraries, etc that are already present in the code base.\n\nYou will get the context of the big task being solved followed by a request to edit a particular file.\nYou task is to generate edits to the given file to fulfill the request.\nAll your edits will apply to the requested file, don't include file name or file path to your edits since it's redundant.\n\nAlways reply to the user in the same language they are using.\n\nOnce you get the request you MUST:\n1. Think step-by-step and explain the needed changes with a numbered list of short sentences.\n2. Generate `search_replace` command containing all the changes you want to make to the file\n\nHere is the description of the command:\n" + commandDescription + "\n\nRESPONSE FORMAT:\n\nYou need to format your output using two blocks inside xml tags: `<THOUGHT>` and `<COMMAND>`.\nYour output should always include _one_ `<THOUGHT>` and _one_ `<COMMAND>` blocks EXACTLY as in the following example:\n";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String getDemonstration(@NotNull ExecutionAgentContext context) {
/* 113 */     Intrinsics.checkNotNullParameter(context, "context"); return "Here are examples of proper *SEARCH/REPLACE* usage:\n\n<example1>\n<THOUGHT>\nIn `hello.py` implement method `hello` that prints \"hello\"\n</THOUGHT>\n<COMMAND>\nsearch_replace\n<EDIT>\n<FILE_PATH>/mnt/myProject/hello.py</FILE_PATH>\n<SEARCH></SEARCH>\n<REPLACE>\ndef hello():\n    \"print a greeting\"\n\n    print(\"hello\")\n</REPLACE>\n</EDIT>\n</COMMAND>\n</example1>\n\n<example2>\n<THOUGHT>\nWe need to change get_factorial() to use math.factorial\nTo make this change we need to modify `mathweb/flask/app.py` to:\n1. Import the math package.\n2. Remove the existing factorial() function.\n3. Update get_factorial() to call math.factorial instead.\n</THOUGHT>\n<COMMAND>\nsearch_replace\n<EDIT1>\n<FILE_PATH>mathweb/flask/app.py</FILE_PATH>\n<SEARCH>\nfrom flask import Flask\n</SEARCH>\n<REPLACE>\nimport math\nfrom flask import Flask\n</REPLACE>\n</EDIT1>\n\n<EDIT2>\n<FILE_PATH>mathweb/flask/app.py</FILE_PATH>\n<SEARCH>\ndef factorial(n):\n    \"compute factorial\"\n\n    if n == 0:\n        return 1\n    else:\n        return n * factorial(n-1)\n\n</SEARCH>\n<REPLACE></REPLACE>\n</EDIT2>\n\n<EDIT3>\n<FILE_PATH>mathweb/flask/app.py</FILE_PATH>\n<SEARCH>\n    return str(factorial(n))\n</SEARCH>\n<REPLACE>\n    return str(math.factorial(n))\n</REPLACE>\n</EDIT3>\n</COMMAND>\n</example2>\n";
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SearchReplaceWorker.kt", l = {26}, i = {}, s = {}, n = {}, m = "getTrajectoryElementAgent", c = "com.intellij.ml.llm.matterhorn.ej.core.edit_workers.SearchReplaceWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class SearchReplaceWorker$getTrajectoryElementAgent$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     SearchReplaceWorker$getTrajectoryElementAgent$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return SearchReplaceWorker.this.getTrajectoryElementAgent((MatterhornPropertyProvider)null, (Continuation<? super TrajectoryElementAgent>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SearchReplaceWorker.kt", l = {79, 79}, i = {}, s = {}, n = {}, m = "runCritic", c = "com.intellij.ml.llm.matterhorn.ej.core.edit_workers.SearchReplaceWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class SearchReplaceWorker$runCritic$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int I$0;
/*     */     int label;
/*     */     
/*     */     SearchReplaceWorker$runCritic$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return SearchReplaceWorker.this.runCritic((ExecutionAgentContext)null, 0, (AgentState)null, (List<? extends MatterhornChatElement>)null, (Continuation<? super List<? extends MatterhornChatElement>>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\edit_workers\SearchReplaceWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */