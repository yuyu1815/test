/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\006\030\000 \0352\0020\001:\001\035B\007¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\bJ\034\020\t\032\b\022\004\022\0020\0130\n2\006\020\f\032\0020\rH@¢\006\002\020\016J&\020\017\032\0020\0202\006\020\021\032\0020\0052\006\020\f\032\0020\r2\006\020\022\032\0020\023H@¢\006\002\020\024J\036\020\025\032\0020\0202\006\020\026\032\0020\0272\006\020\f\032\0020\030H@¢\006\002\020\031J\034\020\032\032\b\022\004\022\0020\0130\n2\006\020\f\032\0020\rH@¢\006\002\020\016J\016\020\033\032\0020\020H@¢\006\002\020\034¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;", "<init>", "()V", "getAgentParameters", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "(Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAvailableActions", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSystemMessage", "", "parameters", "issue", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIssueDescriptionAndInstructions", "input", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHiddenActions", "getDemonstration", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nChatSingleStepAgentWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatSingleStepAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n774#2:141\n865#2,2:142\n1#3:144\n*S KotlinDebug\n*F\n+ 1 ChatSingleStepAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker\n*L\n83#1:141\n83#1:142,2\n*E\n"})
/*     */ public final class ChatSingleStepAgentWorker
/*     */   extends AbstractIssueSingleStepAgentWorker
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   public static final int MAX_STEPS_NUMBER = 20;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker$Companion;", "", "<init>", "()V", "MAX_STEPS_NUMBER", "", "ej-core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getAgentParameters(@NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker$getAgentParameters$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker$getAgentParameters$1
/*     */     //   11: astore #6
/*     */     //   13: aload #6
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #6
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker$getAgentParameters$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #6
/*     */     //   50: aload #6
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #6
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 254, 0 -> 92, 1 -> 143, 2 -> 246
/*     */     //   92: aload #5
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentParameters.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters$Companion;
/*     */     //   100: astore #4
/*     */     //   102: getstatic com/intellij/ml/llm/matterhorn/llm/ModelParameters.Companion : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion;
/*     */     //   105: aload_0
/*     */     //   106: invokevirtual getAgentName : ()Ljava/lang/String;
/*     */     //   109: aload_1
/*     */     //   110: aload #6
/*     */     //   112: aload #6
/*     */     //   114: aload_1
/*     */     //   115: putfield L$0 : Ljava/lang/Object;
/*     */     //   118: aload #6
/*     */     //   120: aload #4
/*     */     //   122: putfield L$1 : Ljava/lang/Object;
/*     */     //   125: aload #6
/*     */     //   127: iconst_1
/*     */     //   128: putfield label : I
/*     */     //   131: invokevirtual getDefaultModel : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   134: dup
/*     */     //   135: aload #7
/*     */     //   137: if_acmpne -> 169
/*     */     //   140: aload #7
/*     */     //   142: areturn
/*     */     //   143: aload #6
/*     */     //   145: getfield L$1 : Ljava/lang/Object;
/*     */     //   148: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters$Companion
/*     */     //   151: astore #4
/*     */     //   153: aload #6
/*     */     //   155: getfield L$0 : Ljava/lang/Object;
/*     */     //   158: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   161: astore_1
/*     */     //   162: aload #5
/*     */     //   164: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   167: aload #5
/*     */     //   169: aload #4
/*     */     //   171: swap
/*     */     //   172: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */     //   175: astore_3
/*     */     //   176: new com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   179: dup
/*     */     //   180: aload_3
/*     */     //   181: iconst_0
/*     */     //   182: aconst_null
/*     */     //   183: aconst_null
/*     */     //   184: sipush #10000
/*     */     //   187: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */     //   190: sipush #200
/*     */     //   193: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */     //   196: iconst_0
/*     */     //   197: iconst_0
/*     */     //   198: iconst_0
/*     */     //   199: iconst_0
/*     */     //   200: iconst_0
/*     */     //   201: iconst_0
/*     */     //   202: bipush #20
/*     */     //   204: dconst_0
/*     */     //   205: iconst_0
/*     */     //   206: sipush #12110
/*     */     //   209: aconst_null
/*     */     //   210: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ILcom/intellij/ml/llm/matterhorn/ej/core/history_processors/HistoryProcessors;Lcom/intellij/ml/llm/matterhorn/ej/core/critique/Critiques;Ljava/lang/Integer;Ljava/lang/Integer;IZZZZZIDZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   213: aload_1
/*     */     //   214: aload #6
/*     */     //   216: aload #6
/*     */     //   218: aconst_null
/*     */     //   219: putfield L$0 : Ljava/lang/Object;
/*     */     //   222: aload #6
/*     */     //   224: aconst_null
/*     */     //   225: putfield L$1 : Ljava/lang/Object;
/*     */     //   228: aload #6
/*     */     //   230: iconst_2
/*     */     //   231: putfield label : I
/*     */     //   234: invokevirtual setupFromEnvironment : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   237: dup
/*     */     //   238: aload #7
/*     */     //   240: if_acmpne -> 253
/*     */     //   243: aload #7
/*     */     //   245: areturn
/*     */     //   246: aload #5
/*     */     //   248: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   251: aload #5
/*     */     //   253: areturn
/*     */     //   254: new java/lang/IllegalStateException
/*     */     //   257: dup
/*     */     //   258: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   260: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   263: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #22	-> 60
/*     */     //   #23	-> 97
/*     */     //   #26	-> 102
/*     */     //   #22	-> 140
/*     */     //   #23	-> 176
/*     */     //   #26	-> 180
/*     */     //   #23	-> 181
/*     */     //   #24	-> 184
/*     */     //   #25	-> 190
/*     */     //   #23	-> 196
/*     */     //   #27	-> 197
/*     */     //   #23	-> 198
/*     */     //   #28	-> 202
/*     */     //   #23	-> 204
/*     */     //   #29	-> 205
/*     */     //   #23	-> 206
/*     */     //   #30	-> 213
/*     */     //   #22	-> 243
/*     */     //   #23	-> 253
/*     */     //   #22	-> 254
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	37	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker;
/*     */     //   97	46	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   162	75	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   0	264	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	204	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	197	5	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getAvailableActions(@NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker$getAvailableActions$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker$getAvailableActions$1
/*     */     //   11: astore #9
/*     */     //   13: aload #9
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #9
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker$getAvailableActions$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #9
/*     */     //   50: aload #9
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #8
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #10
/*     */     //   62: aload #9
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 308, 0 -> 88, 1 -> 128
/*     */     //   88: aload #8
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_1
/*     */     //   94: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   99: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   102: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   105: astore_3
/*     */     //   106: aload_0
/*     */     //   107: aload_3
/*     */     //   108: aload #9
/*     */     //   110: aload #9
/*     */     //   112: iconst_1
/*     */     //   113: putfield label : I
/*     */     //   116: invokevirtual getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   119: dup
/*     */     //   120: aload #10
/*     */     //   122: if_acmpne -> 135
/*     */     //   125: aload #10
/*     */     //   127: areturn
/*     */     //   128: aload #8
/*     */     //   130: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   133: aload #8
/*     */     //   135: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   138: astore #4
/*     */     //   140: nop
/*     */     //   141: aload #4
/*     */     //   143: invokevirtual getUseTools : ()Z
/*     */     //   146: ifeq -> 162
/*     */     //   149: new com/intellij/ml/llm/matterhorn/ej/core/actions/tools/SearchProjectToolAction
/*     */     //   152: dup
/*     */     //   153: invokespecial <init> : ()V
/*     */     //   156: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction
/*     */     //   159: goto -> 169
/*     */     //   162: new com/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction
/*     */     //   165: dup
/*     */     //   166: invokespecial <init> : ()V
/*     */     //   169: astore #5
/*     */     //   171: bipush #8
/*     */     //   173: anewarray com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*     */     //   176: astore #7
/*     */     //   178: aload #7
/*     */     //   180: iconst_0
/*     */     //   181: aload #5
/*     */     //   183: aastore
/*     */     //   184: aload #7
/*     */     //   186: iconst_1
/*     */     //   187: new com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction
/*     */     //   190: dup
/*     */     //   191: invokespecial <init> : ()V
/*     */     //   194: aastore
/*     */     //   195: aload #7
/*     */     //   197: iconst_2
/*     */     //   198: new com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction
/*     */     //   201: dup
/*     */     //   202: invokespecial <init> : ()V
/*     */     //   205: aastore
/*     */     //   206: aload #7
/*     */     //   208: iconst_3
/*     */     //   209: new com/intellij/ml/llm/matterhorn/ej/core/actions/OpenEntireFileAgentAction
/*     */     //   212: dup
/*     */     //   213: invokespecial <init> : ()V
/*     */     //   216: aastore
/*     */     //   217: aload #7
/*     */     //   219: iconst_4
/*     */     //   220: new com/intellij/ml/llm/matterhorn/ej/core/actions/GotoLineAgentAction
/*     */     //   223: dup
/*     */     //   224: invokespecial <init> : ()V
/*     */     //   227: aastore
/*     */     //   228: aload #7
/*     */     //   230: iconst_5
/*     */     //   231: new com/intellij/ml/llm/matterhorn/ej/core/actions/ScrollDownAgentAction
/*     */     //   234: dup
/*     */     //   235: invokespecial <init> : ()V
/*     */     //   238: aastore
/*     */     //   239: aload #7
/*     */     //   241: bipush #6
/*     */     //   243: new com/intellij/ml/llm/matterhorn/ej/core/actions/ScrollUpAgentAction
/*     */     //   246: dup
/*     */     //   247: invokespecial <init> : ()V
/*     */     //   250: aastore
/*     */     //   251: aload #7
/*     */     //   253: bipush #7
/*     */     //   255: new com/intellij/ml/llm/matterhorn/ej/core/actions/AnswerAgentAction
/*     */     //   258: dup
/*     */     //   259: invokespecial <init> : ()V
/*     */     //   262: aastore
/*     */     //   263: aload #7
/*     */     //   265: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   268: astore #6
/*     */     //   270: nop
/*     */     //   271: aload #4
/*     */     //   273: invokevirtual getUseTools : ()Z
/*     */     //   276: ifeq -> 305
/*     */     //   279: new com/intellij/ml/llm/matterhorn/ej/core/actions/tools/BashToolAction
/*     */     //   282: dup
/*     */     //   283: ldc 'bash_20241022'
/*     */     //   285: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   288: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   291: checkcast java/util/Collection
/*     */     //   294: aload #6
/*     */     //   296: checkcast java/lang/Iterable
/*     */     //   299: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   302: goto -> 307
/*     */     //   305: aload #6
/*     */     //   307: areturn
/*     */     //   308: new java/lang/IllegalStateException
/*     */     //   311: dup
/*     */     //   312: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   314: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   317: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #33	-> 60
/*     */     //   #34	-> 93
/*     */     //   #35	-> 106
/*     */     //   #33	-> 125
/*     */     //   #36	-> 140
/*     */     //   #37	-> 141
/*     */     //   #38	-> 162
/*     */     //   #36	-> 169
/*     */     //   #41	-> 171
/*     */     //   #42	-> 187
/*     */     //   #41	-> 195
/*     */     //   #43	-> 198
/*     */     //   #41	-> 206
/*     */     //   #44	-> 209
/*     */     //   #41	-> 217
/*     */     //   #45	-> 220
/*     */     //   #41	-> 228
/*     */     //   #46	-> 231
/*     */     //   #41	-> 239
/*     */     //   #47	-> 243
/*     */     //   #41	-> 251
/*     */     //   #48	-> 255
/*     */     //   #41	-> 263
/*     */     //   #40	-> 265
/*     */     //   #50	-> 270
/*     */     //   #51	-> 271
/*     */     //   #52	-> 305
/*     */     //   #50	-> 307
/*     */     //   #33	-> 308
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	26	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker;
/*     */     //   93	13	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   106	13	3	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   140	165	4	parameters	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   171	16	5	searchProjectAction	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;
/*     */     //   270	35	6	actions	Ljava/util/List;
/*     */     //   305	2	6	actions	Ljava/util/List;
/*     */     //   0	318	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	258	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	251	8	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getSystemMessage(@NotNull AgentParameters parameters, @NotNull ExecutionAgentContext context, @NotNull AgentIssue paramAgentIssue, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker$getSystemMessage$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker$getSystemMessage$1
/*     */     //   13: astore #19
/*     */     //   15: aload #19
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #19
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker$getSystemMessage$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #19
/*     */     //   53: aload #19
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #18
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #20
/*     */     //   65: aload #19
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 364, 0 -> 92, 1 -> 192
/*     */     //   92: aload #18
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: ldc '### Example\\n<THOUGHT>\\nFirst I'll start by listing the files in the current directory to see what we have.\\n</THOUGHT>\\n<COMMAND>\\nls\\n</COMMAND>'
/*     */     //   99: astore #5
/*     */     //   101: getstatic com/intellij/openapi/util/SystemInfo.isWindows : Z
/*     */     //   104: ifeq -> 139
/*     */     //   107: ldc ' Terminal commands must be adapted for PowerShell (not Bash) and formatted accordingly, even if other instructions refer to Bash.'
/*     */     //   109: astore #7
/*     */     //   111: ldc '\\n  The current operating system is Windows. It's important to use Windows-style backslashes `\` instead of Linux-style forward slashes `/` in any paths.'
/*     */     //   113: astore #8
/*     */     //   115: aload_0
/*     */     //   116: invokevirtual areBashCommandsAllowed : ()Z
/*     */     //   119: ifeq -> 134
/*     */     //   122: aload #8
/*     */     //   124: aload #7
/*     */     //   126: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   131: goto -> 141
/*     */     //   134: aload #8
/*     */     //   136: goto -> 141
/*     */     //   139: ldc ''
/*     */     //   141: astore #6
/*     */     //   143: nop
/*     */     //   144: aload_1
/*     */     //   145: invokevirtual getUseTools : ()Z
/*     */     //   148: ifeq -> 156
/*     */     //   151: ldc ''
/*     */     //   153: goto -> 363
/*     */     //   156: aload_0
/*     */     //   157: aload_2
/*     */     //   158: aload #19
/*     */     //   160: aload #19
/*     */     //   162: aload #5
/*     */     //   164: putfield L$0 : Ljava/lang/Object;
/*     */     //   167: aload #19
/*     */     //   169: aload #6
/*     */     //   171: putfield L$1 : Ljava/lang/Object;
/*     */     //   174: aload #19
/*     */     //   176: iconst_1
/*     */     //   177: putfield label : I
/*     */     //   180: invokevirtual getAvailableActions : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   183: dup
/*     */     //   184: aload #20
/*     */     //   186: if_acmpne -> 219
/*     */     //   189: aload #20
/*     */     //   191: areturn
/*     */     //   192: aload #19
/*     */     //   194: getfield L$1 : Ljava/lang/Object;
/*     */     //   197: checkcast java/lang/String
/*     */     //   200: astore #6
/*     */     //   202: aload #19
/*     */     //   204: getfield L$0 : Ljava/lang/Object;
/*     */     //   207: checkcast java/lang/String
/*     */     //   210: astore #5
/*     */     //   212: aload #18
/*     */     //   214: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   217: aload #18
/*     */     //   219: checkcast java/util/List
/*     */     //   222: astore #7
/*     */     //   224: aload #7
/*     */     //   226: checkcast java/lang/Iterable
/*     */     //   229: astore #9
/*     */     //   231: iconst_0
/*     */     //   232: istore #10
/*     */     //   234: aload #9
/*     */     //   236: astore #11
/*     */     //   238: new java/util/ArrayList
/*     */     //   241: dup
/*     */     //   242: invokespecial <init> : ()V
/*     */     //   245: checkcast java/util/Collection
/*     */     //   248: astore #12
/*     */     //   250: iconst_0
/*     */     //   251: istore #13
/*     */     //   253: aload #11
/*     */     //   255: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   260: astore #14
/*     */     //   262: aload #14
/*     */     //   264: invokeinterface hasNext : ()Z
/*     */     //   269: ifeq -> 320
/*     */     //   272: aload #14
/*     */     //   274: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   279: astore #15
/*     */     //   281: aload #15
/*     */     //   283: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*     */     //   286: astore #16
/*     */     //   288: iconst_0
/*     */     //   289: istore #17
/*     */     //   291: aload #16
/*     */     //   293: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/tools/ToolAction
/*     */     //   296: ifne -> 303
/*     */     //   299: iconst_1
/*     */     //   300: goto -> 304
/*     */     //   303: iconst_0
/*     */     //   304: ifeq -> 262
/*     */     //   307: aload #12
/*     */     //   309: aload #15
/*     */     //   311: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   316: pop
/*     */     //   317: goto -> 262
/*     */     //   320: aload #12
/*     */     //   322: checkcast java/util/List
/*     */     //   325: nop
/*     */     //   326: checkcast java/lang/Iterable
/*     */     //   329: ldc_w '\\n'
/*     */     //   332: checkcast java/lang/CharSequence
/*     */     //   335: aconst_null
/*     */     //   336: aconst_null
/*     */     //   337: iconst_0
/*     */     //   338: aconst_null
/*     */     //   339: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   344: bipush #30
/*     */     //   346: aconst_null
/*     */     //   347: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   350: astore #8
/*     */     //   352: aload #6
/*     */     //   354: aload #8
/*     */     //   356: aload #5
/*     */     //   358: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   363: areturn
/*     */     //   364: new java/lang/IllegalStateException
/*     */     //   367: dup
/*     */     //   368: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   370: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   373: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #56	-> 63
/*     */     //   #62	-> 97
/*     */     //   #70	-> 101
/*     */     //   #71	-> 107
/*     */     //   #73	-> 111
/*     */     //   #72	-> 113
/*     */     //   #74	-> 115
/*     */     //   #75	-> 134
/*     */     //   #76	-> 139
/*     */     //   #70	-> 141
/*     */     //   #78	-> 143
/*     */     //   #79	-> 144
/*     */     //   #82	-> 156
/*     */     //   #56	-> 189
/*     */     //   #83	-> 224
/*     */     //   #141	-> 234
/*     */     //   #142	-> 253
/*     */     //   #83	-> 291
/*     */     //   #142	-> 304
/*     */     //   #143	-> 320
/*     */     //   #141	-> 325
/*     */     //   #83	-> 329
/*     */     //   #104	-> 352
/*     */     //   #111	-> 354
/*     */     //   #119	-> 356
/*     */     //   #78	-> 363
/*     */     //   #56	-> 364
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	59	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker;
/*     */     //   156	27	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/ChatSingleStepAgentWorker;
/*     */     //   97	59	1	parameters	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   97	59	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   156	27	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   101	91	5	exampleAnswer	Ljava/lang/String;
/*     */     //   212	92	5	exampleAnswer	Ljava/lang/String;
/*     */     //   304	22	5	exampleAnswer	Ljava/lang/String;
/*     */     //   326	37	5	exampleAnswer	Ljava/lang/String;
/*     */     //   143	49	6	windowsPrompt	Ljava/lang/String;
/*     */     //   202	102	6	windowsPrompt	Ljava/lang/String;
/*     */     //   304	22	6	windowsPrompt	Ljava/lang/String;
/*     */     //   326	28	6	windowsPrompt	Ljava/lang/String;
/*     */     //   111	23	7	windowsTerminal	Ljava/lang/String;
/*     */     //   224	7	7	availableActions	Ljava/util/List;
/*     */     //   115	19	8	mainAlert	Ljava/lang/String;
/*     */     //   134	2	8	mainAlert	Ljava/lang/String;
/*     */     //   352	11	8	commands	Ljava/lang/String;
/*     */     //   231	19	9	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   250	12	11	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   250	72	12	destination$iv$iv	Ljava/util/Collection;
/*     */     //   281	36	15	element$iv$iv	Ljava/lang/Object;
/*     */     //   288	15	16	it	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*     */     //   291	13	17	$i$a$-filter-ChatSingleStepAgentWorker$getSystemMessage$commands$1	I
/*     */     //   253	69	13	$i$f$filterTo	I
/*     */     //   234	92	10	$i$f$filter	I
/*     */     //   0	374	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	311	19	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	304	18	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private static final CharSequence getSystemMessage$lambda$4$lambda$2$lambda$1(Argument it) {
/*  85 */     Intrinsics.checkNotNullParameter(it, "it"); return it.short(); } private static final CharSequence getSystemMessage$lambda$4(AgentAction action) { Intrinsics.checkNotNullParameter(action, "action"); CharSequence charSequence = action.getCustomSignature();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 144 */     int $i$a$-ifEmpty-ChatSingleStepAgentWorker$getSystemMessage$commands$2$signature$1 = 0;
/*     */     String signature = ((charSequence.length() == 0)) ? (action.getName() + " " + action.getName()) : (String)charSequence;
/*     */     return "### " + action.getName() + "\n**Signature**:\n`" + signature + "`\n" + (action.getArguments().isEmpty() ? "" : ("#### Arguments\n" + CollectionsKt.joinToString$default(action.getArguments(), "\n", null, null, 0, null, ChatSingleStepAgentWorker::getSystemMessage$lambda$4$lambda$3, 30, null))) + "\n#### Description \n" + StringsKt.trim(action.getDocstring()).toString() + "\n"; }
/*     */ 
/*     */   
/*     */   private static final CharSequence getSystemMessage$lambda$4$lambda$3(Argument it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return "    - " + it.full();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getIssueDescriptionAndInstructions(@NotNull AgentState input, @NotNull ExecutionContext context, @NotNull Continuation $completion) {
/*     */     return "## QUESTION DESCRIPTION\nGiven the following question description `<issue_description>`, could you help me in getting correct answer to meet the specified task requirements?\n<issue_description>\n" + input.getIssue() + "\n</issue_description>\n\n";
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getHiddenActions(@NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*     */     return CollectionsKt.emptyList();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getDemonstration(@NotNull Continuation $completion) {
/*     */     return "";
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ChatSingleStepAgentWorker.kt", l = {26, 30}, i = {0}, s = {"L$0"}, n = {"propertyProvider"}, m = "getAgentParameters", c = "com.intellij.ml.llm.matterhorn.ej.core.ChatSingleStepAgentWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ChatSingleStepAgentWorker$getAgentParameters$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     ChatSingleStepAgentWorker$getAgentParameters$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ChatSingleStepAgentWorker.this.getAgentParameters(null, (Continuation<? super AgentParameters>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ChatSingleStepAgentWorker.kt", l = {35}, i = {}, s = {}, n = {}, m = "getAvailableActions", c = "com.intellij.ml.llm.matterhorn.ej.core.ChatSingleStepAgentWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ChatSingleStepAgentWorker$getAvailableActions$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     ChatSingleStepAgentWorker$getAvailableActions$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ChatSingleStepAgentWorker.this.getAvailableActions(null, (Continuation<? super List<? extends AgentAction>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ChatSingleStepAgentWorker.kt", l = {82}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"exampleAnswer", "windowsPrompt"}, m = "getSystemMessage", c = "com.intellij.ml.llm.matterhorn.ej.core.ChatSingleStepAgentWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ChatSingleStepAgentWorker$getSystemMessage$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     ChatSingleStepAgentWorker$getSystemMessage$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ChatSingleStepAgentWorker.this.getSystemMessage(null, null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\ChatSingleStepAgentWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */